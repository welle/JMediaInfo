package aka.jmetadata.main.constants.codecs;

import aka.jmetadata.main.constants.codecs.interfaces.CodecEnum;

import java.util.Arrays;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

/**
 * VideoReal constants parameters.
 *
 * @author Welle Charlotte
 */
public enum VideoRealCodecIdEnum implements CodecEnum {

    /**
     * RV10.
     */
    RV10("RV10", "RealVideo 1", "Based on H.263, Real Player 5"),

    /**
     * RV13.
     */
    RV13("RV13", "RealVideo 1.3", "Based on H.263, Real Player 5"),

    /**
     * RV20.
     */
    RV20("RV20", "RealVideo 2", "Based on H.263, Real Player 6"),

    /**
     * RV30.
     */
    RV30("RV30", "RealVideo 3", "Between H.263 and AVC (H.264), Real Player 8"),

    /**
     * RV40.
     */
    RV40("RV40", "RealVideo 4", "Based on AVC (H.264), Real Player 9");

    @NonNull
    private final List<@NonNull String> codecIDList;

    VideoRealCodecIdEnum(@NonNull final String @NonNull... codecIdParam) {
        this.codecIDList = Arrays.asList(codecIdParam);
    }

    @Override
    public List<@NonNull String> getValues() {
        return this.codecIDList;
    }

    /**
     * Get VideoRealCodecIdEnum corresponding to given string.
     *
     * @param param
     * @return corresponding VideoRealEnum
     */
    @Nullable
    public static final VideoRealCodecIdEnum getVideoRealCodecIdEnum(@Nullable final String param) {
        VideoRealCodecIdEnum result = null;
        if (param != null) {
            final String trimmedParam = param.trim().toLowerCase();
            if (trimmedParam.length() > 0) {
                for (final VideoRealCodecIdEnum codecEnum : VideoRealCodecIdEnum.values()) {
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
