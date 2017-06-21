package aka.jmetadata.main.constants.codecs;

import aka.jmetadata.main.constants.codecs.interfaces.CodecEnum;

import java.util.Arrays;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

/**
 * AudioMatroska constants parameters.
 *
 * @author Welle Charlotte
 */
public enum AudioMatroskaEnum implements CodecEnum {

    /**
     * A_AAC.
     */
    A_AAC("A_AAC", "AAC"),

    /**
     * A_AAC/MPEG2/LC.
     */
    A_AAC_MPEG2_LC("A_AAC/MPEG2/LC", "AAC"),

    /**
     * A_AAC/MPEG2/LC/SBR.
     */
    A_AAC_MPEG2_LC_SBR("A_AAC/MPEG2/LC/SBR", "AAC"),

    /**
     * A_AAC/MPEG2/MAIN.
     */
    A_AAC_MPEG2_MAIN("A_AAC/MPEG2/MAIN", "AAC"),

    /**
     * A_AAC/MPEG2/SSR.
     */
    A_AAC_MPEG2_SSR("A_AAC/MPEG2/SSR", "AAC"),

    /**
     * A_AAC/MPEG4/LC.
     */
    A_AAC_MPEG4_LC("A_AAC/MPEG4/LC", "AAC"),

    /**
     * A_AAC/MPEG4/LC/SBR.
     */
    A_AAC_MPEG4_LC_SBR("A_AAC/MPEG4/LC/SBR", "AAC"),

    /**
     * A_AAC/MPEG4/LC/SBR/PS.
     */
    A_AAC_MPEG4_LC_SBR_PS("A_AAC/MPEG4/LC/SBR/PS", "AAC"),

    /**
     * A_AAC/MPEG4/LTP.
     */
    A_AAC_MPEG4_LTP("A_AAC/MPEG4/LTP", "AAC"),

    /**
     * A_AAC/MPEG4/MAIN.
     */
    A_AAC_MPEG4_MAIN("A_AAC/MPEG4/MAIN", "AAC"),

    /**
     * A_AAC/MPEG4/SSR.
     */
    A_AAC_MPEG4_SSR("A_AAC/MPEG4/SSR", "AAC"),

    /**
     * A_AC3.
     */
    A_AC3("A_AC3", "AC-3"),

    /**
     * A_AC3/BSID10.
     */
    A_AC3_BSID10("A_AC3/BSID10", "AC-3"),

    /**
     * A_AC3/BSID9.
     */
    A_AC3_BSID9("A_AC3/BSID9", "AC-3"),

    /**
     * A_ALAC.
     */
    A_ALAC("A_ALAC", "ALAC", "Apple Lossless Audio Codec"),

    /**
     * A_DTS.
     */
    A_DTS("A_DTS", "DTS"),

    /**
     * A_EAC3.
     */
    A_EAC3("A_EAC3", "E-AC-3"),

    /**
     * A_FLAC.
     */
    A_FLAC("A_FLAC", "Flac"),

    /**
     * A_MLP.
     */
    A_MLP("A_MLP", "MLP", "Meridian Lossless Packing"),

    /**
     * A_MPEG/L1.
     */
    A_MPEG_L1("A_MPEG/L1", "MPEG Audio", "MP1"),

    /**
     * A_MPEG/L2.
     */
    A_MPEG_L2("A_MPEG/L2", "MPEG Audio", "MP2"),

    /**
     * A_MPEG/L3.
     */
    A_MPEG_L3("A_MPEG/L3", "MPEG Audio", "MP3"),

    /**
     * A_OPUS.
     */
    A_OPUS("A_OPUS", "Opus"),

    /**
     * A_PCM/FLOAT/IEEE.
     */
    A_PCM_FLOAT_IEEE("A_PCM/FLOAT/IEEE", "PCM"),

    /**
     * A_PCM/INT/BIG.
     */
    A_PCM_INT_BIG("A_PCM/INT/BIG", "PCM"),

    /**
     * A_PCM/INT/LIT.
     */
    A_PCM_INT_LIT("A_PCM/INT/LIT", "PCM"),

    /**
     * A_REAL/14_4.
     */
    A_REAL_14_4("A_REAL/14_4", "VSELP", "Real Audio 1 (14.4)"),

    /**
     * A_REAL/28_8.
     */
    A_REAL_28_8("A_REAL/28_8", "G.728", "Real Audio 2 (28.8)"),

    /**
     * A_REAL/ATRC.
     */
    A_REAL_ATRC("A_REAL/ATRC", "Atrac", "Real & Sony Atrac3 Codec"),

    /**
     * A_REAL/COOK.
     */
    A_REAL_COOK("A_REAL/COOK", "Cooker", "Real Audio Cook Codec (codename: Gecko)"),

    /**
     * A_REAL/RALF.
     */
    A_REAL_RALF("A_REAL/RALF", "RealAudio Lossless", "Real Audio Lossless Format"),

    /**
     * A_REAL/SIPR.
     */
    A_REAL_SIPR("A_REAL/SIPR", "G.729", "Real & Sipro Voice Codec"),

    /**
     * A_TRUEHD.
     */
    A_TRUEHD("A_TRUEHD", "TrueHD"),

    /**
     * A_TTA1.
     */
    A_TTA1("A_TTA1", "TTA", "The True Audio Lossless Codec"),

    /**
     * A_VORBIS.
     */
    A_VORBIS("A_VORBIS", "Vorbis"),

    /**
     * A_WAVPACK4.
     */
    A_WAVPACK4("A_WAVPACK4", "WavPack");

    @NonNull
    private final List<@NonNull String> codecIDList;

    AudioMatroskaEnum(@NonNull final String @NonNull... codecIdParam) {
        this.codecIDList = Arrays.asList(codecIdParam);
    }

    @Override
    public List<@NonNull String> getValues() {
        return this.codecIDList;
    }

    /**
     * Get AudioMatroskaEnum corresponding to given string.
     *
     * @param param
     * @return corresponding AudioMatroskaEnum
     */
    @Nullable
    public static final AudioMatroskaEnum getAudioMatroskaEnum(@Nullable final String param) {
        AudioMatroskaEnum result = null;
        if (param != null) {
            final String trimmedParam = param.trim().toLowerCase();
            if (trimmedParam.length() > 0) {
                for (final AudioMatroskaEnum codecEnum : AudioMatroskaEnum.values()) {
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
