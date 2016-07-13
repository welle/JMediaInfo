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
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.jdt.annotation.NonNull;

import com.opencsv.CSVReader;

import aka.jmediainfo.constants.CSVConstants;

/**
 * Read the mediainfo_lib.txt and convert into constants files.
 *
 * see https://raw.githubusercontent.com/MediaArea/MediaInfoLib/master/Source/Resource/Text/Stream/
 *
 * @author Welle Charlotte
 */
public final class ConstantsCreator {

    private static @NonNull final String USER_AGENT = "Mozilla/5.0";
    private static @NonNull final Logger logger = Logger.getLogger("aka.jmediainfo.ConstantsCreator");
    private static @NonNull Map<@NonNull String, String> kinds;

    static {
        kinds = new HashMap<>();
        kinds.put("Audio", "https://raw.githubusercontent.com/MediaArea/MediaInfoLib/master/Source/Resource/Text/Stream/Audio.csv");
        kinds.put("General", "https://raw.githubusercontent.com/MediaArea/MediaInfoLib/master/Source/Resource/Text/Stream/General.csv");
        kinds.put("Text", "https://raw.githubusercontent.com/MediaArea/MediaInfoLib/master/Source/Resource/Text/Stream/Text.csv");
        kinds.put("Video", "https://raw.githubusercontent.com/MediaArea/MediaInfoLib/master/Source/Resource/Text/Stream/Video.csv");
        kinds.put("Menu", "https://raw.githubusercontent.com/MediaArea/MediaInfoLib/master/Source/Resource/Text/Stream/Menu.csv");
    }

    /**
     * Main.
     *
     * @param args [0] is the path where to save created files.
     */
    public static void main(final String[] args) {
        String path;
        if (args == null || args.length < 1) {
            path = "D:/Projets Java/JMediaInfo/javasource/aka/jmediainfo/";
        } else {
            path = args[0];
        }

        if (path == null) {
            logger.logp(Level.SEVERE, "ConstantsCreator", "main", "No path");
        } else {
            final ConstantsCreator constantsCreator = new ConstantsCreator();
            for (final Entry<@NonNull String, String> entry : kinds.entrySet()) {
                assert entry != null;
                constantsCreator.parse(entry, path);
            }
        }
    }

    public boolean parse(@NonNull final Entry<@NonNull String, String> entry, @NonNull final String path) {
        final boolean success = false;

        final String url = entry.getValue();
        assert url != null;
        final Map<@NonNull String, String> map = parse(url);

        createFile(entry.getKey(), map, path);

        return success;
    }

    private void createFile(@NonNull final String kind, @NonNull final Map<@NonNull String, String> map, @NonNull final String path) {
        try {
            final Path file = Paths.get(path + kind + ".java");

            final List<@NonNull String> javaLines = new ArrayList<>();

            javaLines.add("package aka.jmediainfo;");
            javaLines.add("");
            javaLines.add("import org.eclipse.jdt.annotation.NonNull;");
            javaLines.add("");
            javaLines.add("/**");
            javaLines.add(" * " + kind + " constants parameters.");
            javaLines.add(" *");
            javaLines.add(" * @author Welle Charlotte");
            javaLines.add(" */");
            javaLines.add("public final class " + kind + " {");
            javaLines.add("");
            for (final Entry<@NonNull String, String> line : map.entrySet()) {
                final String constantName = line.getKey();
                String javadoc = line.getValue();
                if (javadoc == null || javadoc.isEmpty()) {
                    javadoc = constantName;
                }
                javaLines.add("   /**");
                javaLines.add("    * " + javadoc + ".");
                javaLines.add("    */");
                javaLines.add("    @NonNull");
                if (javadoc.toLowerCase().contains("deprecated")) {
                    javaLines.add("    @Deprecated");
                }
                String javaConstantName = constantName.replace("/", "").replace("(", "").replace(")", "").replace("-", "").replace("*", "").replace("_", "");
                javaConstantName = javaConstantName.toUpperCase();
                javaLines.add("    public static final String " + javaConstantName + " = " + "\"" + constantName + "\";");
                javaLines.add("");
            }
            javaLines.add("}");

            Files.write(file, javaLines, Charset.forName("UTF-8"));

            // if file doesnt exists, then create it
//            if (!file.exists()) {
//                file.createNewFile();
//            }

        } catch (final IOException e) {
            e.printStackTrace();
        }
    }

    @NonNull
    private Map<@NonNull String, String> parse(@NonNull final String url) {
        final Map<@NonNull String, String> result = new HashMap<>();
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
                        result.put(name, strings[CSVConstants.DOCUMENTATION]);
                    }
                }

                csvReader.close();
                in.close();
            } else {
                System.out.println("GET request not worked");
            }
        } catch (final IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return result;
    }

}
