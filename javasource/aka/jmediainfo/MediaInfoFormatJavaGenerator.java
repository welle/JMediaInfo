package aka.jmediainfo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.jdt.annotation.NonNull;

import com.opencsv.CSVReader;

import aka.jmediainfo.constants.CSVConstants;

/**
 * Read the mediainfo format and convert into enum file.
 *
 * see https://raw.githubusercontent.com/MediaArea/MediaInfoLib/master/Source/Resource/Text/DataBase/Format.csv
 *
 * see https://github.com/MediaArea/MediaInfo
 *
 * https://mediaarea.net/fr/MediaInfo/Download
 *
 * @author Welle Charlotte
 */
public final class MediaInfoFormatJavaGenerator {

    private static @NonNull final String USER_AGENT = "Mozilla/5.0";
    private static @NonNull final Logger LOGGER = Logger.getLogger("aka.jmediainfo.ConstantsCreator");
    private static @NonNull Map<@NonNull String, String> FORMAT_URL;

    static {
        FORMAT_URL = new HashMap<>();
        FORMAT_URL.put("Format", "https://raw.githubusercontent.com/MediaArea/MediaConch/master/SourceCode/MediaInfoLib/Source/Resource/Text/DataBase/Format.csv");
    }

    /**
     * Main.
     *
     * @param args [0] is the path where to save created files.
     */
    public static void main(final String[] args) {
        String path;
        if (args == null || args.length < 2) {
            path = "C:/Projects/Own/JMediaInfo/build/main/";
        } else {
            path = args[0];
        }

        if (path == null) {
            LOGGER.logp(Level.SEVERE, "ConstantsCreator", "main", "No path");
        } else {
            final MediaInfoFormatJavaGenerator constantsCreator = new MediaInfoFormatJavaGenerator();
            for (final Entry<@NonNull String, String> entry : FORMAT_URL.entrySet()) {
                assert entry != null;
                constantsCreator.parseKind(entry, path);
            }
        }
    }

    private boolean parseKind(@NonNull final Entry<@NonNull String, String> entry, @NonNull final String path) {
        final boolean success = false;

        final String url = entry.getValue();
        assert url != null;
        final Map<@NonNull String, String> map = parse(url);

        createConstantsFile(entry.getKey(), map, path);

        return success;
    }

    private void createConstantsFile(@NonNull final String kind, @NonNull final Map<@NonNull String, String> map, @NonNull final String path) {
        try {
            final Path file = Paths.get(path + "constants/format/" + kind + "Enum.java");

            final List<@NonNull String> javaLines = new ArrayList<>();

            javaLines.add("package aka.jmetadata.main.constants.format;");
            javaLines.add("");
            javaLines.add("import org.eclipse.jdt.annotation.NonNull;");
            javaLines.add("import org.eclipse.jdt.annotation.Nullable;");
            javaLines.add("");
            javaLines.add("/**");
            javaLines.add(" * " + kind + " constants parameters.");
            javaLines.add(" *");
            javaLines.add(" * @author Welle Charlotte");
            javaLines.add(" */");
            javaLines.add("public enum " + kind + "Enum {");
            javaLines.add("");
            int i = 0;
            for (final Entry<@NonNull String, String> line : map.entrySet()) {
                String constantName = line.getKey();
                final String fullName = line.getValue();
                javaLines.add("    /**");
                javaLines.add("     * " + constantName + ".");
                javaLines.add("     */");
                if (constantName.matches("^([0-9]+).*$")) {
                    constantName = "_" + constantName;
                }
                String javaConstantName = constantName.replace("/", "_").replace("(", "_").replace(".", "").replace("'", "_").replace(")", "_").replace(" ", "_").replace("-", "_").replace("*", "_");
                javaConstantName = javaConstantName.toUpperCase();
                final String endOfLine = i == map.size() - 1 ? ";" : ",";
                javaLines.add("    " + javaConstantName + "(\"" + constantName + "\", \"" + fullName + "\")" + endOfLine);
                javaLines.add("");
                i++;
            }
            javaLines.add("    @NonNull");
            javaLines.add("    private final String name;");
            javaLines.add("    @NonNull");
            javaLines.add("    private final String fullName;");
            javaLines.add("");
            javaLines.add("    " + kind + "Enum(@NonNull final String name, @NonNull final String fullName) {");
            javaLines.add("        this.name = name;");
            javaLines.add("        this.fullName = fullName;");
            javaLines.add("    }");
            javaLines.add("");
            javaLines.add("    /**");
            javaLines.add("     * Get the name of the ENUM.");
            javaLines.add("     *");
            javaLines.add("     * @return the name of the ENUM");
            javaLines.add("     */");
            javaLines.add("    @NonNull");
            javaLines.add("    public String getName() {");
            javaLines.add("        return this.name;");
            javaLines.add("    }");
            javaLines.add("");
            javaLines.add("");
            javaLines.add("    /**");
            javaLines.add("     * Get the full name of the ENUM.");
            javaLines.add("     *");
            javaLines.add("     * @return the full name of the ENUM");
            javaLines.add("     */");
            javaLines.add("    @NonNull");
            javaLines.add("    public String getFullName() {");
            javaLines.add("        return this.fullName;");
            javaLines.add("    }");
            javaLines.add("");
            javaLines.add("    /**");
            javaLines.add("     * Get " + kind + "Enum corresponding to given string.");
            javaLines.add("     *");
            javaLines.add("     * @param param");
            javaLines.add("     * @return corresponding " + kind + "Enum");
            javaLines.add("     */");
            javaLines.add("    @Nullable");
            javaLines.add("    public static final " + kind + "Enum get" + kind + "Enum(@Nullable final String param) {");
            javaLines.add("        " + kind + "Enum result = null;");
            javaLines.add("        if (param != null) {");
            javaLines.add("            final String trimmedParam = param.trim().toLowerCase();");
            javaLines.add("            if (trimmedParam.length() > 0) {");
            javaLines.add("                for (final " + kind + "Enum codecEnum : " + kind + "Enum.values()) {");
            javaLines.add("                    if (trimmedParam.equals(codecEnum.getName())) {");
            javaLines.add("                        result = codecEnum;");
            javaLines.add("                        // found, just break");
            javaLines.add("                        break;");
            javaLines.add("                    }");
            javaLines.add("                }");
            javaLines.add("            }");
            javaLines.add("        }");
            javaLines.add("        return result;");
            javaLines.add("    }");
            javaLines.add("");
            javaLines.add("}");

            Files.write(file, javaLines, Charset.forName("UTF-8"));
        } catch (

        final IOException e) {
            LOGGER.logp(Level.SEVERE, "ConstantsCreator", "createConstantsFile", e.getMessage(), e);
        }
    }

    @NonNull
    private Map<@NonNull String, String> parse(@NonNull final String url) {
        final Map<@NonNull String, String> result = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        try {
            final URL obj = new URL(url);
            final HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("User-Agent", USER_AGENT);
            final int responseCode = con.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) { // success
                final BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

                final CSVReader csvReader = new CSVReader(in, ';');
                for (final String[] strings : csvReader) {
                    final String name = strings[CSVConstants.NAME];
                    if (name != null) {
                        result.put(name, strings[CSVConstants.FULL_NAME]);
                    }
                }

                csvReader.close();
                in.close();
            } else {
                System.out.println("GET request not worked");
            }
        } catch (final IOException e) {
            LOGGER.logp(Level.SEVERE, "MediaInfoJavaGenerator", "parse", e.getMessage(), e);
        }

        return result;
    }

}
