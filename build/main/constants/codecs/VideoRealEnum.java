package aka.jmetadata.main.constants.codecs;

import java.util.Arrays;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

/**
 * VideoReal constants parameters.
 *
 * @author Welle Charlotte
 */
public enum VideoRealEnum {

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

    VideoRealEnum(@NonNull final String @NonNull... codecIdParam) {
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
     * Get VideoRealEnum corresponding to given string.
     *
     * @param param
     * @return corresponding VideoRealEnum
     */
    @Nullable
    public static final VideoRealEnum getVideoRealEnum(@Nullable final String param) {
        VideoRealEnum result = null;
        if (param != null) {
            final String trimmedParam = param.trim().toLowerCase();
            if (trimmedParam.length() > 0) {
                for (final VideoRealEnum codecEnum : VideoRealEnum.values()) {
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
