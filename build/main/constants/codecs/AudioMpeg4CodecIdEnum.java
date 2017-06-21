package aka.jmetadata.main.constants.codecs;

import aka.jmetadata.main.constants.codecs.interfaces.CodecEnum;

import java.util.Arrays;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

/**
 * AudioMpeg4 constants parameters.
 *
 * @author Welle Charlotte
 */
public enum AudioMpeg4CodecIdEnum implements CodecEnum {

    /**
     * .mp3.
     */
    MP3(".mp3", "MPEG Audio"),

    /**
     * A104.
     */
    A104("A104", "AMR", "Wide band"),

    /**
     * aac .
     */
    AAC_("aac ", "AAC"),

    /**
     * ac-3.
     */
    AC_3("ac-3", "AC-3"),

    /**
     * alac.
     */
    ALAC("alac", "ALAC", "Apple Lossless Audio Codec"),

    /**
     * alaw.
     */
    ALAW("alaw", "ADPCM"),

    /**
     * dtsc.
     */
    DTSC("dtsc", "DTS", "Digital Theater Systems"),

    /**
     * dtse.
     */
    DTSE("dtse", "DTS", "Express", "Digital Theater Systems Low Bitrate"),

    /**
     * dtsh.
     */
    DTSH("dtsh", "DTS", "HRA", "Digital Theater Systems High Res"),

    /**
     * dtsl.
     */
    DTSL("dtsl", "DTS", "MA", "Digital Theater Systems Master Audio"),

    /**
     * dvca.
     */
    DVCA("dvca", "PCM"),

    /**
     * ec-3.
     */
    EC_3("ec-3", "E-AC-3"),

    /**
     * enca.
     */
    ENCA("enca", "(Encrypted)"),

    /**
     * fl32.
     */
    FL32("fl32", "PCM "),

    /**
     * fl64.
     */
    FL64("fl64", "PCM"),

    /**
     * ima4.
     */
    IMA4("ima4", "ADPCM"),

    /**
     * in24.
     */
    IN24("in24", "PCM"),

    /**
     * in32.
     */
    IN32("in32", "PCM"),

    /**
     * lpcm.
     */
    LPCM("lpcm", "PCM"),

    /**
     * MAC3.
     */
    MAC3("MAC3", "MACE 3"),

    /**
     * MAC6.
     */
    MAC6("MAC6", "MACE 6"),

    /**
     * nmos.
     */
    NMOS("nmos", "Nellymoser"),

    /**
     * NONE.
     */
    NONE("NONE", "PCM"),

    /**
     * owma.
     */
    OWMA("owma", "WMA Pro", "Smooth Streaming Media Audio"),

    /**
     * Qclp.
     */
    QCLP("Qclp", "QCELP", "Qualcomm PureVoice"),

    /**
     * QDM1.
     */
    QDM1("QDM1", "QDesign 1", "QDesign Music 1"),

    /**
     * QDM2.
     */
    QDM2("QDM2", "Qdesign 2", "QDesign Music 2"),

    /**
     * QDMC.
     */
    QDMC("QDMC", "Qdesign 2", "(Old)", "QDesign Music 2 (old version, rare)"),

    /**
     * raw .
     */
    RAW_("raw ", "PCM"),

    /**
     * sac3.
     */
    SAC3("sac3", "AC-3", "Made by Nero"),

    /**
     * samr.
     */
    SAMR("samr", "AMR", "Narrow band"),

    /**
     * sawb.
     */
    SAWB("sawb", "AMR", "Wide band"),

    /**
     * sevc.
     */
    SEVC("sevc", "EVRC"),

    /**
     * sowt.
     */
    SOWT("sowt", "PCM"),

    /**
     * twos.
     */
    TWOS("twos", "PCM"),

    /**
     * ulaw.
     */
    ULAW("ulaw", "ADPCM"),

    /**
     * vdva.
     */
    VDVA("vdva", "PCM"),

    /**
     * WMA2.
     */
    WMA2("WMA2", "WMA", "Windows Media Audio", "Version 2");

    @NonNull
    private final List<@NonNull String> codecIDList;

    AudioMpeg4CodecIdEnum(@NonNull final String @NonNull... codecIdParam) {
        this.codecIDList = Arrays.asList(codecIdParam);
    }

    @Override
    public List<@NonNull String> getValues() {
        return this.codecIDList;
    }

    /**
     * Get AudioMpeg4CodecIdEnum corresponding to given string.
     *
     * @param param
     * @return corresponding AudioMpeg4Enum
     */
    @Nullable
    public static final AudioMpeg4CodecIdEnum getAudioMpeg4CodecIdEnum(@Nullable final String param) {
        AudioMpeg4CodecIdEnum result = null;
        if (param != null) {
            final String trimmedParam = param.trim().toLowerCase();
            if (trimmedParam.length() > 0) {
                for (final AudioMpeg4CodecIdEnum codecEnum : AudioMpeg4CodecIdEnum.values()) {
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
