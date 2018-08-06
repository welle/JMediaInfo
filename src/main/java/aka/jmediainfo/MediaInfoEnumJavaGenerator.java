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

import org.apache.commons.io.FileUtils;
import org.eclipse.jdt.annotation.NonNull;

import com.opencsv.CSVReader;

import aka.jmediainfo.constants.CSVConstants;

/**
 * Read the mediainfo codec and convert into enum files.
 *
 * see https://raw.githubusercontent.com/MediaArea/MediaInfoLib/master/Source/Resource/Text/DataBase/
 *
 * see https://github.com/MediaArea/MediaInfo
 *
 * https://mediaarea.net/fr/MediaInfo/Download
 *
 * @author Welle Charlotte
 */
public final class MediaInfoEnumJavaGenerator {

    private static @NonNull final String USER_AGENT = "Mozilla/5.0";
    private static @NonNull final Logger LOGGER = Logger.getLogger("aka.jmediainfo.ConstantsCreator");
    private static @NonNull Map<@NonNull String, String> CODECS_ID_URL;

    static {
        CODECS_ID_URL = new HashMap<>();
        CODECS_ID_URL.put("AudioMatroska", "https://raw.githubusercontent.com/MediaArea/MediaConch/master/SourceCode/MediaInfoLib/Source/Resource/Text/DataBase/CodecID_Audio_Matroska.csv");
        CODECS_ID_URL.put("AudioMpeg4", "https://raw.githubusercontent.com/MediaArea/MediaConch/master/SourceCode/MediaInfoLib/Source/Resource/Text/DataBase/CodecID_Audio_Mpeg4.csv");
        CODECS_ID_URL.put("AudioReal", "https://raw.githubusercontent.com/MediaArea/MediaConch/master/SourceCode/MediaInfoLib/Source/Resource/Text/DataBase/CodecID_Audio_Real.csv");
        CODECS_ID_URL.put("GeneralMpeg4", "https://raw.githubusercontent.com/MediaArea/MediaConch/master/SourceCode/MediaInfoLib/Source/Resource/Text/DataBase/CodecID_General_Mpeg4.csv");
        CODECS_ID_URL.put("GeneralOthers", "https://raw.githubusercontent.com/MediaArea/MediaConch/master/SourceCode/MediaInfoLib/Source/Resource/Text/DataBase/CodecID_Other_Mpeg4.csv");
        CODECS_ID_URL.put("TextMatroska", "https://raw.githubusercontent.com/MediaArea/MediaConch/master/SourceCode/MediaInfoLib/Source/Resource/Text/DataBase/CodecID_Text_Matroska.csv");
        CODECS_ID_URL.put("TextMpeg4", "https://raw.githubusercontent.com/MediaArea/MediaConch/master/SourceCode/MediaInfoLib/Source/Resource/Text/DataBase/CodecID_Text_Mpeg4.csv");
        CODECS_ID_URL.put("VideoMatroska", "https://raw.githubusercontent.com/MediaArea/MediaConch/master/SourceCode/MediaInfoLib/Source/Resource/Text/DataBase/CodecID_Video_Matroska.csv");
        CODECS_ID_URL.put("VideoMpeg4", "https://raw.githubusercontent.com/MediaArea/MediaConch/master/SourceCode/MediaInfoLib/Source/Resource/Text/DataBase/CodecID_Video_Mpeg4.csv");
        CODECS_ID_URL.put("VideoReal", "https://raw.githubusercontent.com/MediaArea/MediaConch/master/SourceCode/MediaInfoLib/Source/Resource/Text/DataBase/CodecID_Video_Real.csv");
        CODECS_ID_URL.put("VideoReal", "https://raw.githubusercontent.com/MediaArea/MediaConch/master/SourceCode/MediaInfoLib/Source/Resource/Text/DataBase/CodecID_Video_Real.csv");
    }

    /**
     * Main.
     *
     * @param args [0] is the path where to save created files.
     */
    public static void main(final String[] args) {
        final String path;
        final String basePackage;
        if (args == null || args.length < 2) {
            path = "C:/Projects/Own/JMediaInfo/generatedSRC/main/";
            basePackage = "aka.jmetadata.main";
        } else {
            path = args[0];
            basePackage = args[1];
        }

        if (path == null || basePackage == null) {
            LOGGER.logp(Level.SEVERE, "MediaInfoEnumJavaGenerator", "main", "No path");
        } else {

            final MediaInfoEnumJavaGenerator constantsCreator = new MediaInfoEnumJavaGenerator();
            for (final Entry<@NonNull String, String> entry : CODECS_ID_URL.entrySet()) {
                assert entry != null;
                constantsCreator.parseKind(entry, path, basePackage);
            }
        }
    }

    private boolean parseKind(@NonNull final Entry<@NonNull String, String> entry, @NonNull final String path, @NonNull final String basePackage) {
        final boolean success = false;

        final String url = entry.getValue();
        assert url != null;
        final Map<@NonNull String, List<String>> map = parse(url);

        createInterfaceFile(path, basePackage);

        createConstantsFile(entry.getKey(), map, path, basePackage);

        return success;
    }

    private void createInterfaceFile(@NonNull final String path, @NonNull final String basePackage) {
        try {
            final Path file = Paths.get(path + "constants/codecs/interfaces/CodecEnum.java");

            final List<@NonNull String> javaLines = new ArrayList<>();

            javaLines.add("package " + basePackage + ".constants.codecs.interfaces;");
            javaLines.add("");
            javaLines.add("import java.util.List;");
            javaLines.add("");
            javaLines.add("import org.eclipse.jdt.annotation.NonNull;");
            javaLines.add("");
            javaLines.add("/**");
            javaLines.add(" * Interface for constants parameters.");
            javaLines.add(" *");
            javaLines.add(" * @author Welle Charlotte");
            javaLines.add(" */");
            javaLines.add("public interface CodecEnum {");
            javaLines.add("");
            javaLines.add("    /**");
            javaLines.add("     * Get the codecs of the ENUM.");
            javaLines.add("     *");
            javaLines.add("     * @return the codecs of the ENUM");
            javaLines.add("     */");
            javaLines.add("    @NonNull");
            javaLines.add("    public List<@NonNull String> getValues();");
            javaLines.add("");
            javaLines.add("}");

            FileUtils.forceMkdirParent(file.toFile());
            Files.write(file, javaLines, Charset.forName("UTF-8"));
        } catch (

        final IOException e) {
            LOGGER.logp(Level.SEVERE, "MediaInfoEnumJavaGenerator", "createInterfaceFile", e.getMessage(), e);
        }
    }

    private void createConstantsFile(@NonNull final String kind, @NonNull final Map<@NonNull String, List<String>> map, @NonNull final String path, @NonNull final String basePackage) {
        try {
            final Path file = Paths.get(path + "constants/codecs/" + kind + "CodecIdEnum.java");

            final List<@NonNull String> javaLines = new ArrayList<>();

            javaLines.add("package " + basePackage + ".constants.codecs;");
            javaLines.add("");
            javaLines.add("import " + basePackage + ".constants.codecs.interfaces.CodecEnum;");
            javaLines.add("");
            javaLines.add("import java.util.Arrays;");
            javaLines.add("import java.util.List;");
            javaLines.add("");
            javaLines.add("import org.eclipse.jdt.annotation.NonNull;");
            javaLines.add("import org.eclipse.jdt.annotation.Nullable;");
            javaLines.add("");
            javaLines.add("/**");
            javaLines.add(" * " + kind + " constants parameters.");
            javaLines.add(" *");
            javaLines.add(" * @author Welle Charlotte");
            javaLines.add(" */");
            javaLines.add("public enum " + kind + "CodecIdEnum implements CodecEnum {");
            javaLines.add("");
            int i = 0;
            for (final Entry<@NonNull String, List<String>> line : map.entrySet()) {
                String constantName = line.getKey();
                final List<String> altNameList = line.getValue();
                javaLines.add("    /**");
                javaLines.add("     * " + constantName + ".");
                javaLines.add("     */");
                if (constantName.matches("^([0-9]+).*$")) {
                    constantName = "_" + constantName;
                }
                String javaConstantName = constantName.replace("/", "_").replace("(", "_").replace(".", "").replace("'", "_").replace(" ", "_").replace(")", "").replace("-", "_").replace("*", "_");
                javaConstantName = javaConstantName.toUpperCase();
                final String endOfLine = i == map.size() - 1 ? ";" : ",";
                String altNames = "";
                for (int j = 0; j < altNameList.size(); j++) {
                    altNames = altNames + ", \"" + altNameList.get(j) + "\"";
                }
                javaLines.add("    " + javaConstantName + "(\"" + constantName + "\"" + altNames + ")" + endOfLine);
                javaLines.add("");
                i++;
            }
            javaLines.add("    @NonNull");
            javaLines.add("    private final List<@NonNull String> codecIDList;");
            javaLines.add("");
            javaLines.add("    " + kind + "CodecIdEnum(@NonNull final String @NonNull... codecIdParam) {");
            javaLines.add("        this.codecIDList = Arrays.asList(codecIdParam);");
            javaLines.add("    }");
            javaLines.add("");
            javaLines.add("    @Override");
            javaLines.add("    public List<@NonNull String> getValues() {");
            javaLines.add("        return this.codecIDList;");
            javaLines.add("    }");
            javaLines.add("");
            javaLines.add("    /**");
            javaLines.add("     * Get " + kind + "CodecIdEnum corresponding to given string.");
            javaLines.add("     *");
            javaLines.add("     * @param param");
            javaLines.add("     * @return corresponding " + kind + "Enum");
            javaLines.add("     */");
            javaLines.add("    @Nullable");
            javaLines.add("    public static final " + kind + "CodecIdEnum get" + kind + "CodecIdEnum(@Nullable final String param) {");
            javaLines.add("        " + kind + "CodecIdEnum result = null;");
            javaLines.add("        if (param != null) {");
            javaLines.add("            final String trimmedParam = param.trim().toLowerCase();");
            javaLines.add("            if (trimmedParam.length() > 0) {");
            javaLines.add("                for (final " + kind + "CodecIdEnum codecEnum : " + kind + "CodecIdEnum.values()) {");
            javaLines.add("                    final List<@NonNull String> values = codecEnum.getValues();");
            javaLines.add("                    for (final String expectedCodec : values) {");
            javaLines.add("                        if (trimmedParam.equals(expectedCodec)) {");
            javaLines.add("                            result = codecEnum;");
            javaLines.add("                            // found, just break");
            javaLines.add("                            break;");
            javaLines.add("                        }");
            javaLines.add("                    }");
            javaLines.add("                }");
            javaLines.add("            }");
            javaLines.add("        }");
            javaLines.add("        return result;");
            javaLines.add("    }");
            javaLines.add("");
            javaLines.add("}");

            FileUtils.forceMkdirParent(file.toFile());
            Files.write(file, javaLines, Charset.forName("UTF-8"));
        } catch (

        final IOException e) {
            LOGGER.logp(Level.SEVERE, "MediaInfoEnumJavaGenerator", "createConstantsFile", e.getMessage(), e);
        }
    }

    @NonNull
    private Map<@NonNull String, List<String>> parse(@NonNull final String url) {
        final Map<@NonNull String, List<String>> result = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
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
                        final List<String> altNameList = new ArrayList<>();
                        for (int i = 1; i < strings.length; i++) {
                            final String altName = strings[i];
                            if (altName != null && altName.trim().length() > 0 && !altName.contains("http")) {
                                altNameList.add(altName);
                            }
                        }

                        result.put(name, altNameList);
                    }
                }

                csvReader.close();
                in.close();
            } else {
                System.out.println("GET request not worked");
            }
        } catch (final IOException e) {
            LOGGER.logp(Level.SEVERE, "MediaInfoEnumJavaGenerator", "parse", e.getMessage(), e);
        }

        return result;
    }

}
