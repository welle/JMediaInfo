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
import java.util.Arrays;
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
 * Read the mediainfo_lib.txt and convert into constants files.
 *
 * see https://raw.githubusercontent.com/MediaArea/MediaInfoLib/master/Source/Resource/Text/Stream/
 *
 * see https://github.com/MediaArea/MediaInfo
 *
 * https://mediaarea.net/fr/MediaInfo/Download
 *
 * @author Welle Charlotte
 */
public final class MediaInfoJavaGenerator {

    private static @NonNull final String USER_AGENT = "Mozilla/5.0";
    private static @NonNull final Logger LOGGER = Logger.getLogger("aka.jmediainfo.ConstantsCreator");
    private static @NonNull Map<@NonNull String, String> KINDSSTREAM;
    private static @NonNull Map<@NonNull String, String> KINDS;
    private static @NonNull List<String> JAVATYPES = Arrays.asList("Integer", "Long", "LocalDateTime", "LocalTime", "String", "Boolean", "BigInteger", "URL");

    static {
        KINDSSTREAM = new HashMap<>();
        KINDSSTREAM.put("Audio", "https://raw.githubusercontent.com/MediaArea/MediaInfoLib/master/Source/Resource/Text/Stream/Audio.csv");
        KINDSSTREAM.put("Text", "https://raw.githubusercontent.com/MediaArea/MediaInfoLib/master/Source/Resource/Text/Stream/Text.csv");
        KINDSSTREAM.put("Video", "https://raw.githubusercontent.com/MediaArea/MediaInfoLib/master/Source/Resource/Text/Stream/Video.csv");
        KINDSSTREAM.put("Menu", "https://raw.githubusercontent.com/MediaArea/MediaInfoLib/master/Source/Resource/Text/Stream/Menu.csv");

        KINDS = new HashMap<>();
        KINDS.put("General", "https://raw.githubusercontent.com/MediaArea/MediaInfoLib/master/Source/Resource/Text/Stream/General.csv");
    }

    /**
     * Main.
     *
     * @param args [0] is the path where to save created files.
     */
    public static void main(final String[] args) {
        String path;
        String path2;
        if (args == null || args.length < 2) {
            path = "C:/Projects/Own/JMediaInfo/build/main/";
            path2 = "C:/Projects/Own/JMediaInfo/build/test/";
        } else {
            path = args[0];
            path2 = args[1];
        }

        if (path == null || path2 == null) {
            LOGGER.logp(Level.SEVERE, "ConstantsCreator", "main", "No path");
        } else {
            final MediaInfoJavaGenerator constantsCreator = new MediaInfoJavaGenerator();
            for (final Entry<@NonNull String, String> entry : KINDSSTREAM.entrySet()) {
                assert entry != null;
                constantsCreator.parseStreamKind(entry, path, path2);
            }
            for (final Entry<@NonNull String, String> entry : KINDS.entrySet()) {
                assert entry != null;
                constantsCreator.parseKind(entry, path, path2);
            }
        }
    }

    private boolean parseStreamKind(@NonNull final Entry<@NonNull String, String> entry, @NonNull final String path, @NonNull final String path2) {
        final boolean success = false;

        final String url = entry.getValue();
        assert url != null;
        final Map<@NonNull String, String> map = parse(url);

        createConstantsFile(entry.getKey(), map, path);

        createFileStream(entry.getKey(), map, path);

        createFileTest(entry.getKey(), map, path2);

        return success;
    }

    private boolean parseKind(@NonNull final Entry<@NonNull String, String> entry, @NonNull final String path, @NonNull final String path2) {
        final boolean success = false;

        final String url = entry.getValue();
        assert url != null;
        final Map<@NonNull String, String> map = parse(url);

        createConstantsFile(entry.getKey(), map, path);

        createFile(entry.getKey(), map, path);

        createFileTest(entry.getKey(), map, path2);

        return success;
    }

    private void createConstantsFile(@NonNull final String kind, @NonNull final Map<@NonNull String, String> map, @NonNull final String path) {
        try {
            final Path file = Paths.get(path + "constants/" + kind + ".java");

            final List<@NonNull String> javaLines = new ArrayList<>();

            javaLines.add("package aka.jmetadata.main.constants;");
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
                if (!javadoc.toLowerCase().contains("deprecated")) {
                    javaLines.add("   /**");
                    javaLines.add("    * " + javadoc + ".");
                    javaLines.add("    */");
                    javaLines.add("    @NonNull");
                    String javaConstantName = constantName.replace("/", "").replace("(", "").replace(")", "").replace("-", "").replace("*", "").replace("_", "");
                    javaConstantName = javaConstantName.toUpperCase();
                    javaLines.add("    public static final String " + javaConstantName + " = " + "\"" + constantName + "\";");
                    javaLines.add("");
                }
            }
            javaLines.add("}");

            Files.write(file, javaLines, Charset.forName("UTF-8"));
        } catch (final IOException e) {
            LOGGER.logp(Level.SEVERE, "ConstantsCreator", "createConstantsFile", e.getMessage(), e);
        }
    }

    private void createFile(@NonNull final String kind, @NonNull final Map<@NonNull String, String> map, @NonNull final String path) {
        try {
            final Path file = Paths.get(path + "JMetaData" + kind + ".java");

            final List<@NonNull String> javaLines = new ArrayList<>();

            javaLines.add("package aka.jmetadata.main;");
            javaLines.add("");
            javaLines.add("import java.math.BigInteger;");
            javaLines.add("import java.net.URL;");
            javaLines.add("import java.time.LocalDateTime;");
            javaLines.add("import java.time.LocalTime;");
            javaLines.add("import java.util.ArrayList;");
            javaLines.add("import java.util.List;");
            javaLines.add("");
            javaLines.add("import org.eclipse.jdt.annotation.NonNull;");
            javaLines.add("import org.eclipse.jdt.annotation.Nullable;");
            javaLines.add("");
            javaLines.add("import aka.jmetadata.main.constants." + kind + ";");
            javaLines.add("import aka.jmetadata.main.constants.StreamKind;");
            javaLines.add("import aka.jmetadata.main.mediainfo.MediaInfo;");
            javaLines.add("import aka.swissknife.data.TextUtils;");
            javaLines.add("");
            javaLines.add("/**");
            javaLines.add(" * This class contains all methods to extract " + kind + " informations of a specific " + kind + " stream.");
            javaLines.add(" *");
            javaLines.add(" * @author Welle Charlotte");
            javaLines.add(" */");
            javaLines.add("public final class JMetaData" + kind + " extends AbstractJMetadata {");
            javaLines.add("");
            javaLines.add("   /**");
            javaLines.add("    * Constructor.");
            javaLines.add("    * ");
            javaLines.add("    * @param mediaInfo instance of MediaInfo JNA library");
            javaLines.add("    * @see MediaInfo");
            javaLines.add("    */");
            javaLines.add("    public JMetaData" + kind + "(@NonNull final MediaInfo mediaInfo) {");
            javaLines.add("        super(mediaInfo);");
            javaLines.add("    }");
            javaLines.add("");

            for (final String kindStream : KINDSSTREAM.keySet()) {
                javaLines.add("   /**");
                javaLines.add("    * Get number of " + kindStream + " streams.");
                javaLines.add("    * ");
                javaLines.add("    * @return number of " + kindStream + ".");
                javaLines.add("    */");
                javaLines.add("    public final int getNumber" + kindStream + "Streams() {");
                javaLines.add("        return getMediaInfo().getStreamCount(StreamKind." + kind + ");");
                javaLines.add("    }");
                javaLines.add("");
            }

            javaLines.add("");

            for (final Entry<@NonNull String, String> line : map.entrySet()) {
                final String constantName = line.getKey();
                String javadoc = line.getValue();
                if (javadoc == null || javadoc.isEmpty()) {
                    javadoc = constantName;
                }
                final String javaName = constantName.replace("/", "").replace("(", "").replace(")", "").replace("-", "").replace("*", "").replace("_", "");

                if (!javadoc.toLowerCase().contains("deprecated")) {
                    for (final String javaType : JAVATYPES) {
                        javaLines.add("   /**");
                        javaLines.add("    * Get " + javadoc + ".");
                        javaLines.add("    * ");
                        javaLines.add("    * @return " + javadoc + ".");
                        javaLines.add("    */");
                        javaLines.add("    @Nullable");
                        javaLines.add("    public final " + javaType + " get" + javaName + "As" + javaType + "() {");
                        javaLines.add("        return getMediaInfo().getAs" + javaType + "(StreamKind." + kind + ", 0, " + kind + "." + javaName.toUpperCase() + ");");
                        javaLines.add("    }");
                        javaLines.add("");
                    }

                    javaLines.add("   /**");
                    javaLines.add("    * Get " + javadoc + ".");
                    javaLines.add("    * ");
                    javaLines.add("    * @return " + javadoc + ".");
                    javaLines.add("    */");
                    javaLines.add("    @NonNull");
                    javaLines.add("    public final List<@NonNull String> get" + javaName + "AsStringList() {");
                    javaLines.add("        List<@NonNull String> result = new ArrayList<>();");
                    javaLines.add("        final String value = getMediaInfo().getAsString(StreamKind." + kind + ", 0, " + kind + "." + javaName.toUpperCase() + ");");
                    javaLines.add("        if (!TextUtils.isEmpty(value)) {");
                    javaLines.add("            assert value != null;");
                    javaLines.add("            result = splitValues(value, \"/\");");
                    javaLines.add("        }");
                    javaLines.add("        return result;");
                    javaLines.add("    }");
                    javaLines.add("");
                }

            }
            javaLines.add("}");

            Files.write(file, javaLines, Charset.forName("UTF-8"));
        } catch (final IOException e) {
            e.printStackTrace();
        }
    }

    private void createFileStream(@NonNull final String kind, @NonNull final Map<@NonNull String, String> map, @NonNull final String path) {
        try {
            final Path file = Paths.get(path + "JMetaData" + kind + ".java");

            final List<@NonNull String> javaLines = new ArrayList<>();

            javaLines.add("package aka.jmetadata.main;");
            javaLines.add("");
            javaLines.add("import java.math.BigInteger;");
            javaLines.add("import java.net.URL;");
            javaLines.add("import java.time.LocalDateTime;");
            javaLines.add("import java.time.LocalTime;");
            javaLines.add("");
            javaLines.add("import org.eclipse.jdt.annotation.NonNull;");
            javaLines.add("import org.eclipse.jdt.annotation.Nullable;");
            javaLines.add("");
            javaLines.add("import aka.jmetadata.main.constants." + kind + ";");
            javaLines.add("import aka.jmetadata.main.constants.StreamKind;");
            javaLines.add("import aka.jmetadata.main.mediainfo.MediaInfo;");
            javaLines.add("");
            javaLines.add("/**");
            javaLines.add(" * This class contains all methods to extract " + kind + " informations of a specific " + kind + " stream.");
            javaLines.add(" *");
            javaLines.add(" * @author Welle Charlotte");
            javaLines.add(" */");
            javaLines.add("public final class JMetaData" + kind + " extends AbstractStreamJMetadata {");
            javaLines.add("");
            javaLines.add("   /**");
            javaLines.add("    * Constructor.");
            javaLines.add("    * ");
            javaLines.add("    * @param mediaInfo instance of MediaInfo JNA library");
            javaLines.add("    * @param streamNumber number of the stream to parse");
            javaLines.add("    * @see MediaInfo");
            javaLines.add("    */");
            javaLines.add("    public JMetaData" + kind + "(@NonNull final MediaInfo mediaInfo, final int streamNumber) {");
            javaLines.add("        super(mediaInfo, streamNumber);");
            javaLines.add("    }");
            javaLines.add("");

            for (final Entry<@NonNull String, String> line : map.entrySet()) {
                final String constantName = line.getKey();
                String javadoc = line.getValue();
                if (javadoc == null || javadoc.isEmpty()) {
                    javadoc = constantName;
                }
                final String javaName = constantName.replace("/", "").replace("(", "").replace(")", "").replace("-", "").replace("*", "").replace("_", "");

                if (!javadoc.toLowerCase().contains("deprecated")) {
                    for (final String javaType : JAVATYPES) {
                        javaLines.add("   /**");
                        javaLines.add("    * Get " + javadoc + ".");
                        javaLines.add("    * ");
                        javaLines.add("    * @return " + javadoc + ".");
                        javaLines.add("    */");
                        javaLines.add("    @Nullable");
                        javaLines.add("    public final " + javaType + " get" + javaName + "As" + javaType + "() {");
                        javaLines.add("        return getMediaInfo().getAs" + javaType + "(StreamKind." + kind + ", getStreamNumber(), " + kind + "." + javaName.toUpperCase() + ");");
                        javaLines.add("    }");
                        javaLines.add("");
                    }
                    javaLines.add("");
                }

            }
            javaLines.add("}");

            Files.write(file, javaLines, Charset.forName("UTF-8"));
        } catch (final IOException e) {
            LOGGER.logp(Level.SEVERE, "MediaInfoJavaGenerator", "createFileStream", e.getMessage(), e);
        }
    }

    private void createFileTest(@NonNull final String kind, @NonNull final Map<@NonNull String, String> map, @NonNull final String path) {
        try {
            final Path file = Paths.get(path + "JMetaData" + kind + "_Test.java");

            final List<@NonNull String> javaLines = new ArrayList<>();

            javaLines.add("package aka.jmetadata.test;");
            javaLines.add("");
            javaLines.add("import static org.junit.Assert.*;");
            javaLines.add("");
            javaLines.add("import java.io.File;");
            javaLines.add("import java.util.logging.Level;");
            javaLines.add("import java.util.logging.Logger;");
            javaLines.add("");
            javaLines.add("import org.eclipse.jdt.annotation.NonNull;");
            javaLines.add("import org.junit.AfterClass;");
            javaLines.add("import org.junit.BeforeClass;");
            javaLines.add("import org.junit.Test;");
            javaLines.add("");
            javaLines.add("import aka.jmetadata.main.JMetaData;");
            javaLines.add("import aka.jmetadata.main.JMetaData" + kind + ";");
            javaLines.add("");
            javaLines.add("/**");
            javaLines.add(" * This class contains tests methods for " + kind + " informations of a specific " + kind + " stream.");
            javaLines.add(" *");
            javaLines.add(" * @author Welle Charlotte");
            javaLines.add(" */");
            javaLines.add("public final class JMetaData" + kind + "_Test {");
            javaLines.add("");
            javaLines.add("    private static @NonNull final Logger LOGGER = Logger.getLogger(JMetaData" + kind + "_Test.class.getName());");
            javaLines.add("");
            javaLines.add("    private static JMetaData" + kind + " jMetaData" + kind + ";");
            javaLines.add("    private static JMetaData jMetaData;");
            javaLines.add("");
            javaLines.add("    /**");
            javaLines.add("     * Initialize test.");
            javaLines.add("     */");
            javaLines.add("    @BeforeClass");
            javaLines.add("    public static void beforeUnit() {");
            javaLines.add("        try {");
            javaLines.add("            jMetaData = new JMetaData();");
            javaLines.add("            final ClassLoader classLoader = JMetaData" + kind + "_Test.class.getClassLoader();");
            javaLines.add("            final File file = new File(classLoader.getResource(\"somefile\").getFile());");
            javaLines.add("            jMetaData.open(file);");
            javaLines.add("            jMetaData" + kind + " = null;");
            javaLines.add("        } catch (final Throwable e) {");
            javaLines.add("            LOGGER.log(Level.SEVERE, e.getMessage());");
            javaLines.add("        }");
            javaLines.add("    }");
            javaLines.add("");
            javaLines.add("    /**");
            javaLines.add("     * Deinitialize test.");
            javaLines.add("     */");
            javaLines.add("    @AfterClass");
            javaLines.add("    public static void afterUnit() {");
            javaLines.add("        try {");
            javaLines.add("            jMetaData.close();");
            javaLines.add("        } catch (final Throwable e) {");
            javaLines.add("            LOGGER.log(Level.SEVERE, e.getMessage());");
            javaLines.add("        }");
            javaLines.add("    }");
            javaLines.add("");

            for (final Entry<@NonNull String, String> line : map.entrySet()) {
                final String constantName = line.getKey();
                String javadoc = line.getValue();
                if (javadoc == null || javadoc.isEmpty()) {
                    javadoc = constantName;
                }
                final String javaName = constantName.replace("/", "").replace("(", "").replace(")", "").replace("-", "").replace("*", "").replace("_", "");

                if (!javadoc.toLowerCase().contains("deprecated")) {
                    for (final String javaType : JAVATYPES) {
                        javaLines.add("   /**");
                        javaLines.add("    * Test get" + javaName + "As" + javaType + "() method.");
                        javaLines.add("    */");
                        javaLines.add("    @Test");
                        javaLines.add("    public void subTestGet" + javaName + "As" + javaType + "() {");
                        javaLines.add("        assertEquals(null, this.jMetaData" + kind + ".get" + javaName + "As" + javaType + "());");
                        javaLines.add("    }");
                        javaLines.add("");
                    }
                }

            }

            javaLines.add("}");

            Files.write(file, javaLines, Charset.forName("UTF-8"));
        } catch (

        final IOException e) {
            LOGGER.logp(Level.SEVERE, "MediaInfoJavaGenerator", "createFileTest", e.getMessage(), e);
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
                        result.put(name, strings[CSVConstants.DOCUMENTATION]);
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
