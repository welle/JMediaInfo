package aka.jmetadata.main.constants.codecs;

import java.util.Arrays;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

/**
 * GeneralOthers constants parameters.
 *
 * @author Welle Charlotte
 */
public enum GeneralOthersEnum {

   /**
    * Ovbi.
    */
    OVBI("Ovbi", "Omneon VBI"),

   /**
    * rtp .
    */
    RTP_("rtp ", "RTP");

    @NonNull
    private final List<@NonNull String> codecIDList;

    GeneralOthersEnum(@NonNull final String @NonNull... codecIdParam) {
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
     * Get GeneralOthersEnum corresponding to given string.
     *
     * @param param
     * @return corresponding GeneralOthersEnum
     */
    @Nullable
    public static final GeneralOthersEnum getGeneralOthersEnum(@Nullable final String param) {
        GeneralOthersEnum result = null;
        if (param != null) {
            final String trimmedParam = param.trim().toLowerCase();
            if (trimmedParam.length() > 0) {
                for (final GeneralOthersEnum codecEnum : GeneralOthersEnum.values()) {
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
