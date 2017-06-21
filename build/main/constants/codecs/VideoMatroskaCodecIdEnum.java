package aka.jmetadata.main.constants.codecs;

import aka.jmetadata.main.constants.codecs.interfaces.CodecEnum;

import java.util.Arrays;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

/**
 * VideoMatroska constants parameters.
 *
 * @author Welle Charlotte
 */
public enum VideoMatroskaCodecIdEnum implements CodecEnum {

    /**
     * V_DIRAC.
     */
    V_DIRAC("V_DIRAC", "Dirac"),

    /**
     * V_FFV1.
     */
    V_FFV1("V_FFV1", "FFV1"),

    /**
     * V_MPEG1.
     */
    V_MPEG1("V_MPEG1", "MPEG Video", "MPEG 1 or 2 Video"),

    /**
     * V_MPEG2.
     */
    V_MPEG2("V_MPEG2", "MPEG Video", "MPEG 1 or 2 Video"),

    /**
     * V_MPEG4/IS0/AP.
     */
    V_MPEG4_IS0_AP("V_MPEG4/IS0/AP", "MPEG-4 Visual", "There is a zero instead of a O, may be a problem"),

    /**
     * V_MPEG4/IS0/ASP.
     */
    V_MPEG4_IS0_ASP("V_MPEG4/IS0/ASP", "MPEG-4 Visual", "There is a zero instead of a O, may be a problem"),

    /**
     * V_MPEG4/IS0/AVC.
     */
    V_MPEG4_IS0_AVC("V_MPEG4/IS0/AVC", "AVC", "There is a zero instead of a O, may be a problem"),

    /**
     * V_MPEG4/IS0/SP.
     */
    V_MPEG4_IS0_SP("V_MPEG4/IS0/SP", "MPEG-4 Visual", "There is a zero instead of a O, may be a problem"),

    /**
     * V_MPEG4/ISO/AP.
     */
    V_MPEG4_ISO_AP("V_MPEG4/ISO/AP", "MPEG-4 Visual", "Advanced Profile"),

    /**
     * V_MPEG4/ISO/ASP.
     */
    V_MPEG4_ISO_ASP("V_MPEG4/ISO/ASP", "MPEG-4 Visual", "Advanced Simple Profile"),

    /**
     * V_MPEG4/ISO/AVC.
     */
    V_MPEG4_ISO_AVC("V_MPEG4/ISO/AVC", "AVC"),

    /**
     * V_MPEG4/ISO/SP.
     */
    V_MPEG4_ISO_SP("V_MPEG4/ISO/SP", "MPEG-4 Visual", "Simple Profile"),

    /**
     * V_MPEG4/MS/V2.
     */
    V_MPEG4_MS_V2("V_MPEG4/MS/V2", "MPEG-4 Visual", "MS MPEG-4 v2", "MS MPEG-4 v2"),

    /**
     * V_MPEG4/MS/V3.
     */
    V_MPEG4_MS_V3("V_MPEG4/MS/V3", "MPEG-4 Visual", "MS MPEG-4 v3", "MS MPEG-4 v3"),

    /**
     * V_MPEGH/ISO/HEVC.
     */
    V_MPEGH_ISO_HEVC("V_MPEGH/ISO/HEVC", "HEVC"),

    /**
     * V_PRORES.
     */
    V_PRORES("V_PRORES", "ProRes"),

    /**
     * V_REAL/RV10.
     */
    V_REAL_RV10("V_REAL/RV10", "RealVideo 1", "RealVideo 1.0 aka RealVideo 5"),

    /**
     * V_REAL/RV20.
     */
    V_REAL_RV20("V_REAL/RV20", "RealVideo 2", "RealVideo 2.0 aka G2 and RealVideo G2+SVT"),

    /**
     * V_REAL/RV30.
     */
    V_REAL_RV30("V_REAL/RV30", "RealVideo 3", "RealVideo 3.0 aka RealVideo 8"),

    /**
     * V_REAL/RV40.
     */
    V_REAL_RV40("V_REAL/RV40", "RealVideo 4", "RealVideo 4.0 aka RealVideo 9"),

    /**
     * V_THEORA.
     */
    V_THEORA("V_THEORA", "Theora"),

    /**
     * V_UNCOMPRESSED.
     */
    V_UNCOMPRESSED("V_UNCOMPRESSED", "RGB", "Raw uncompressed video frames"),

    /**
     * V_VP8.
     */
    V_VP8("V_VP8", "VP8"),

    /**
     * V_VP9.
     */
    V_VP9("V_VP9", "VP9");

    @NonNull
    private final List<@NonNull String> codecIDList;

    VideoMatroskaCodecIdEnum(@NonNull final String @NonNull... codecIdParam) {
        this.codecIDList = Arrays.asList(codecIdParam);
    }

    @Override
    public List<@NonNull String> getValues() {
        return this.codecIDList;
    }

    /**
     * Get VideoMatroskaCodecIdEnum corresponding to given string.
     *
     * @param param
     * @return corresponding VideoMatroskaEnum
     */
    @Nullable
    public static final VideoMatroskaCodecIdEnum getVideoMatroskaCodecIdEnum(@Nullable final String param) {
        VideoMatroskaCodecIdEnum result = null;
        if (param != null) {
            final String trimmedParam = param.trim().toLowerCase();
            if (trimmedParam.length() > 0) {
                for (final VideoMatroskaCodecIdEnum codecEnum : VideoMatroskaCodecIdEnum.values()) {
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
