package aka.jmetadata.main.constants.codecs;

import java.util.Arrays;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

/**
 * TextMpeg4 constants parameters.
 *
 * @author Welle Charlotte
 */
public enum TextMpeg4Enum {

   /**
    * c608.
    */
    C608("c608", "EIA-608"),

   /**
    * c708.
    */
    C708("c708", "EIA-708"),

   /**
    * dfxp.
    */
    DFXP("dfxp", "TTML"),

   /**
    * enct.
    */
    ENCT("enct", "(Encrypted)"),

   /**
    * sbtl.
    */
    SBTL("sbtl", "Apple text", "(iPhone)"),

   /**
    * subp.
    */
    SUBP("subp", "VobSub", "The same subtitle format used on DVDs"),

   /**
    * text.
    */
    TEXT("text", "Apple text"),

   /**
    * tx3g.
    */
    TX3G("tx3g", "Timed text");

    @NonNull
    private final List<@NonNull String> codecIDList;

    TextMpeg4Enum(@NonNull final String @NonNull... codecIdParam) {
        this.codecIDList = Arrays.asList(codecIdParam);
    }

    /**
     * Get the codecs of the ENUM.
     *
     * @return the codecs of the ENUM
     */
    @NonNull
    public List<@NonNull String> getValues() {
        return this.codecIDList;
    }

    /**
     * Get TextMpeg4Enum corresponding to given string.
     *
     * @param param
     * @return corresponding TextMpeg4Enum
     */
    @Nullable
    public static final TextMpeg4Enum getTextMpeg4Enum(@Nullable final String param) {
        TextMpeg4Enum result = null;
        if (param != null) {
            final String trimmedParam = param.trim().toLowerCase();
            if (trimmedParam.length() > 0) {
                for (final TextMpeg4Enum codecEnum : TextMpeg4Enum.values()) {
                    final List<@NonNull String> values = codecEnum.getValues();
                    for (final String expectedCodec : values) {
                        if (trimmedParam.equals(expectedCodec)) {
                            result = codecEnum;
                            // found, just break
                            break;
                        }
                    }
                }
            }
        }
        return result;
    }

}
