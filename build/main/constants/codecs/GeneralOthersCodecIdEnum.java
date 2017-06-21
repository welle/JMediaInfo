package aka.jmetadata.main.constants.codecs;

import aka.jmetadata.main.constants.codecs.interfaces.CodecEnum;

import java.util.Arrays;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

/**
 * GeneralOthers constants parameters.
 *
 * @author Welle Charlotte
 */
public enum GeneralOthersCodecIdEnum implements CodecEnum {

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

    GeneralOthersCodecIdEnum(@NonNull final String @NonNull... codecIdParam) {
        this.codecIDList = Arrays.asList(codecIdParam);
    }

    @Override
    public List<@NonNull String> getValues() {
        return this.codecIDList;
    }

    /**
     * Get GeneralOthersCodecIdEnum corresponding to given string.
     *
     * @param param
     * @return corresponding GeneralOthersEnum
     */
    @Nullable
    public static final GeneralOthersCodecIdEnum getGeneralOthersCodecIdEnum(@Nullable final String param) {
        GeneralOthersCodecIdEnum result = null;
        if (param != null) {
            final String trimmedParam = param.trim().toLowerCase();
            if (trimmedParam.length() > 0) {
                for (final GeneralOthersCodecIdEnum codecEnum : GeneralOthersCodecIdEnum.values()) {
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
