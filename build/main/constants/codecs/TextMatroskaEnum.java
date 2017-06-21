package aka.jmetadata.main.constants.codecs;

import aka.jmetadata.main.constants.codecs.interfaces.CodecEnum;

import java.util.Arrays;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

/**
 * TextMatroska constants parameters.
 *
 * @author Welle Charlotte
 */
public enum TextMatroskaEnum implements CodecEnum {

    /**
     * S_ASS.
     */
    S_ASS("S_ASS", "ASS", "Advanced Sub Station Alpha"),

    /**
     * S_DVBSUB.
     */
    S_DVBSUB("S_DVBSUB", "DVB Subtitle", "Picture based subtitle format used on DVBs"),

    /**
     * S_HDMV/PGS.
     */
    S_HDMV_PGS("S_HDMV/PGS", "PGS", "Picture based subtitle format used on BDs/HD-DVDs"),

    /**
     * S_HDMV/TEXTST.
     */
    S_HDMV_TEXTST("S_HDMV/TEXTST", "TEXTST", "Text based subtitle format used on BDs"),

    /**
     * S_IMAGE/BMP.
     */
    S_IMAGE_BMP("S_IMAGE/BMP", "Bitmap", "Basic image based subtitle format"),

    /**
     * S_KATE.
     */
    S_KATE("S_KATE", "KATE", "Karaoke And Text Encapsulation"),

    /**
     * S_SSA.
     */
    S_SSA("S_SSA", "SSA", "Sub Station Alpha"),

    /**
     * S_TEXT/ASS.
     */
    S_TEXT_ASS("S_TEXT/ASS", "ASS", "Advanced Sub Station Alpha"),

    /**
     * S_TEXT/SSA.
     */
    S_TEXT_SSA("S_TEXT/SSA", "SSA", "Sub Station Alpha"),

    /**
     * S_TEXT/USF.
     */
    S_TEXT_USF("S_TEXT/USF", "USF", "Universal Subtitle Format"),

    /**
     * S_TEXT/UTF8.
     */
    S_TEXT_UTF8("S_TEXT/UTF8", "UTF-8", "UTF-8 Plain Text"),

    /**
     * S_USF.
     */
    S_USF("S_USF", "USF", "Universal Subtitle Format"),

    /**
     * S_UTF8.
     */
    S_UTF8("S_UTF8", "UTF-8", "UTF-8 Plain Text"),

    /**
     * S_VOBSUB.
     */
    S_VOBSUB("S_VOBSUB", "VobSub", "Picture based subtitle format used on DVDs");

    @NonNull
    private final List<@NonNull String> codecIDList;

    TextMatroskaEnum(@NonNull final String @NonNull... codecIdParam) {
        this.codecIDList = Arrays.asList(codecIdParam);
    }

    @Override
    public List<@NonNull String> getValues() {
        return this.codecIDList;
    }

    /**
     * Get TextMatroskaEnum corresponding to given string.
     *
     * @param param
     * @return corresponding TextMatroskaEnum
     */
    @Nullable
    public static final TextMatroskaEnum getTextMatroskaEnum(@Nullable final String param) {
        TextMatroskaEnum result = null;
        if (param != null) {
            final String trimmedParam = param.trim().toLowerCase();
            if (trimmedParam.length() > 0) {
                for (final TextMatroskaEnum codecEnum : TextMatroskaEnum.values()) {
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
