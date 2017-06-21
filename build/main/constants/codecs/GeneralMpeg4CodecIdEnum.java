package aka.jmetadata.main.constants.codecs;

import aka.jmetadata.main.constants.codecs.interfaces.CodecEnum;

import java.util.Arrays;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

/**
 * GeneralMpeg4 constants parameters.
 *
 * @author Welle Charlotte
 */
public enum GeneralMpeg4CodecIdEnum implements CodecEnum {

    /**
     * 3g2a.
     */
    _3G2A("_3g2a", "MPEG-4", "3GPP2 Media"),

    /**
     * 3ge6.
     */
    _3GE6("_3ge6", "MPEG-4", "3GPP Release 6 MBMS Extended Presentation"),

    /**
     * 3ge7.
     */
    _3GE7("_3ge7", "MPEG-4", "3GPP Release 7 MBMS Extended Presentation"),

    /**
     * 3gg6.
     */
    _3GG6("_3gg6", "MPEG-4", "3GPP Release 6 General"),

    /**
     * 3gp1.
     */
    _3GP1("_3gp1", "MPEG-4", "3GPP Media Release 1"),

    /**
     * 3gp2.
     */
    _3GP2("_3gp2", "MPEG-4", "3GPP Media Release 2"),

    /**
     * 3gp3.
     */
    _3GP3("_3gp3", "MPEG-4", "3GPP Media Release 3"),

    /**
     * 3gp4.
     */
    _3GP4("_3gp4", "MPEG-4", "3GPP Media Release 4"),

    /**
     * 3gp5.
     */
    _3GP5("_3gp5", "MPEG-4", "3GPP Media Release 5"),

    /**
     * 3gp6.
     */
    _3GP6("_3gp6", "MPEG-4", "3GPP Media Release 6 Streaming Servers"),

    /**
     * 3gp7.
     */
    _3GP7("_3gp7", "MPEG-4", "3GPP Media Release 7 Streaming Servers"),

    /**
     * 3gp8.
     */
    _3GP8("_3gp8", "MPEG-4"),

    /**
     * 3gp9.
     */
    _3GP9("_3gp9", "MPEG-4"),

    /**
     * avc1.
     */
    AVC1("avc1", "MPEG-4", "JVT"),

    /**
     * CAQV.
     */
    CAQV("CAQV", "MPEG-4", "Casio Digital Camera"),

    /**
     * f4v .
     */
    F4V_("f4v ", "MPEG-4", "Adobe Flash"),

    /**
     * FACE.
     */
    FACE("FACE", "MPEG-4", "Facebook"),

    /**
     * iphE.
     */
    IPHE("iphE", "MPEG-4", "Apple iPhone (Cellular)"),

    /**
     * isml.
     */
    ISML("isml", "MPEG-4", "IIS Smooth Streaming file format", "ISML"),

    /**
     * iso2.
     */
    ISO2("iso2", "MPEG-4", "Base Media"),

    /**
     * iso4.
     */
    ISO4("iso4", "MPEG-4", "Base Media"),

    /**
     * iso5.
     */
    ISO5("iso5", "MPEG-4", "Base Media"),

    /**
     * isom.
     */
    ISOM("isom", "MPEG-4", "Base Media"),

    /**
     * JP20.
     */
    JP20("JP20", "MPEG-4", "JPEG 2000"),

    /**
     * JPM .
     */
    JPM_("JPM ", "MPEG-4", "JPEG 2000 Compound Image"),

    /**
     * JPX .
     */
    JPX_("JPX ", "MPEG-4", "JPEG 2000 w/ extensions"),

    /**
     * KDDI.
     */
    KDDI("KDDI", "MPEG-4", "3GPP2 EZMovie for KDDI 3G Cellphones"),

    /**
     * M4A .
     */
    M4A_("M4A ", "MPEG-4", "Apple audio with iTunes info"),

    /**
     * M4B .
     */
    M4B_("M4B ", "MPEG-4", "Apple audio with iTunes position"),

    /**
     * M4P .
     */
    M4P_("M4P ", "MPEG-4", "AES encrypted audio"),

    /**
     * M4V .
     */
    M4V_("M4V ", "MPEG-4"),

    /**
     * M4VH.
     */
    M4VH("M4VH", "MPEG-4", "Apple TV"),

    /**
     * M4VP.
     */
    M4VP("M4VP", "MPEG-4", "Apple iPhone"),

    /**
     * MJ2S.
     */
    MJ2S("MJ2S", "MPEG-4", "Motion JPEG 2000 Simple Profile"),

    /**
     * MJP2.
     */
    MJP2("MJP2", "MPEG-4", "Motion JPEG 2000 General Profile"),

    /**
     * mmp4.
     */
    MMP4("mmp4", "MPEG-4", "Mobile version"),

    /**
     * mp41.
     */
    MP41("mp41", "MPEG-4", "Base Media / Version 1"),

    /**
     * mp42.
     */
    MP42("mp42", "MPEG-4", "Base Media / Version 2"),

    /**
     * mp71.
     */
    MP71("mp71", "MPEG-4", "ISO 14496-12 MPEG-7 meta data"),

    /**
     * mp7b.
     */
    MP7B("mp7b", "MPEG-4", "ISO 14496-12 MPEG-7 meta data"),

    /**
     * MQT .
     */
    MQT_("MQT ", "MPEG-4", "Sony/Mobile QuickTime"),

    /**
     * MSNV.
     */
    MSNV("MSNV", "MPEG-4", "Sony PSP"),

    /**
     * ndas.
     */
    NDAS("ndas", "MPEG-4", "Nero Digital AAC Audio"),

    /**
     * ndsc.
     */
    NDSC("ndsc", "MPEG-4", "Nero Digital Cinema Profile"),

    /**
     * ndsh.
     */
    NDSH("ndsh", "MPEG-4", "Nero Digital HDTV Profile"),

    /**
     * ndsm.
     */
    NDSM("ndsm", "MPEG-4", "Nero Digital Mobile Profile"),

    /**
     * ndsp.
     */
    NDSP("ndsp", "MPEG-4", "Nero Digital Portable Profile"),

    /**
     * ndss.
     */
    NDSS("ndss", "MPEG-4", "Nero Digital Standard Profile"),

    /**
     * ndxc.
     */
    NDXC("ndxc", "MPEG-4", "Nero Digital AVC Cinema Profile"),

    /**
     * ndxh.
     */
    NDXH("ndxh", "MPEG-4", "Nero Digital AVC HDTV Profile"),

    /**
     * ndxm.
     */
    NDXM("ndxm", "MPEG-4", "Nero Digital AVC Mobile Profile"),

    /**
     * ndxp.
     */
    NDXP("ndxp", "MPEG-4", "Nero Digital AVC Portable Profile"),

    /**
     * ndxs.
     */
    NDXS("ndxs", "MPEG-4", "Nero Digital AVC Standard Profile"),

    /**
     * piff.
     */
    PIFF("piff", "MPEG-4", "Protected Interoperable File Format", "PIFF"),

    /**
     * qt  .
     */
    QT__("qt  ", "MPEG-4", "QuickTime"),

    /**
     * QTCA.
     */
    QTCA("QTCA", "MPEG-4", "Quicktime compressed archive"),

    /**
     * QTI .
     */
    QTI_("QTI ", "MPEG-4", "QuickTime Image"),

    /**
     * SDV .
     */
    SDV_("SDV ", "MPEG-4", "SD Memory Card Video");

    @NonNull
    private final List<@NonNull String> codecIDList;

    GeneralMpeg4CodecIdEnum(@NonNull final String @NonNull... codecIdParam) {
        this.codecIDList = Arrays.asList(codecIdParam);
    }

    @Override
    public List<@NonNull String> getValues() {
        return this.codecIDList;
    }

    /**
     * Get GeneralMpeg4CodecIdEnum corresponding to given string.
     *
     * @param param
     * @return corresponding GeneralMpeg4Enum
     */
    @Nullable
    public static final GeneralMpeg4CodecIdEnum getGeneralMpeg4CodecIdEnum(@Nullable final String param) {
        GeneralMpeg4CodecIdEnum result = null;
        if (param != null) {
            final String trimmedParam = param.trim().toLowerCase();
            if (trimmedParam.length() > 0) {
                for (final GeneralMpeg4CodecIdEnum codecEnum : GeneralMpeg4CodecIdEnum.values()) {
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
