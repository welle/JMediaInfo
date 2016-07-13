package aka.jmediainfo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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

/**
 * Read the mediainfo_lib.txt and convert into constants files.
 *
 * see https://raw.githubusercontent.com/MediaArea/MediaInfoLib/master/Source/Resource/Text/Stream/
 *
 * @author Welle Charlotte
 */
public final class ConstantsCreator {

    private static @NonNull final Logger logger = Logger.getLogger("aka.jmetadata.creators.ConstantsCreator");
    private static @NonNull Map<@NonNull String, String> kinds;

    static {
        kinds = new HashMap<>();
        kinds.put("Audio", "https://raw.githubusercontent.com/MediaArea/MediaInfoLib/master/Source/Resource/Text/Stream/Audio.csv");
    }

    /**
     * Main.
     *
     */
    public static void main(final String[] args) {
        final String fileName;
        String path;
        if (args == null || args.length < 1) {
            path = "D:/Projets Java/jmetadata/JMetadata/javasource/aka/jmetadata/creators/";
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


        CSV

        final File file = new File(this.fullFilePath);
        final List<@NonNull String> lines = new ArrayList<>();
        // first: cut the block
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            boolean found = false;
            for (String line; (line = br.readLine()) != null;) {
                if (found) {
                    // last block line ?
                    if (line.trim().length() == 0) {
                        break;
                    } else {
                        lines.add(line);
                    }
                } else {
                    found = entry.equals(line.trim());
                }
            }
        } catch (final IOException e) {
            ConstantsCreator.logger.logp(Level.SEVERE, "ConstantsCreator", "parseFile", e.getMessage(), e);
        }

        // create constants kind file

        createFile(entry, lines, path);

        return success;
    }

    private void createFile(@NonNull final String kind, final List<@NonNull String> lines, @NonNull final String path) {
        try {
            final Path file = Paths.get(path + kind + ".java");

            final List<@NonNull String> javaLines = new ArrayList<>();

            javaLines.add("package aka.jmetadata.creators;");
            javaLines.add("");
            javaLines.add("import org.eclipse.jdt.annotation.NonNull;");
            javaLines.add("");
            javaLines.add("/**");
            javaLines.add(" * " + kind + " constants parameters");
            javaLines.add(" *");
            javaLines.add(" */");
            javaLines.add("public final class " + kind + " {");
            javaLines.add("");
            for (final String line : lines) {
                String constantName;
                String javadoc = null;
                final int idx = line.indexOf(":");
                if (idx > 0) {
                    constantName = line.substring(0, idx).trim();
                    javadoc = line.substring(idx, line.length()).trim();
                } else {
                    constantName = line.trim();
                    javadoc = constantName;
                }
                javaLines.add("/**");
                javaLines.add(" * " + javadoc);
                javaLines.add(" */");
                javaLines.add("@NonNull");
                final String javaConstantName = constantName.replace("/", "_");
                javaLines.add("public static final String " + javaConstantName + " = " + "\"" + constantName + "\";");
            }
            javaLines.add("");
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

}
