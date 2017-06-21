package aka.jmetadata.main.constants.codecs;

import java.util.Arrays;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

/**
 * VideoMpeg4 constants parameters.
 *
 * @author Welle Charlotte
 */
public enum VideoMpeg4Enum {

   /**
    * 2vuy.
    */
    _2VUY("_2vuy", "YUV", "YUV", "4:2:2"),

   /**
    * 8BPS.
    */
    _8BPS("_8BPS", "RGB", "RGB", "8:8:8"),

   /**
    * ac16.
    */
    AC16("ac16", "YUV", "YUV", "4:2:2"),

   /**
    * ac32.
    */
    AC32("ac32", "YUV", "YUV", "4:2:2"),

   /**
    * acBG.
    */
    ACBG("acBG", "YUV", "YUV", "4:2:2"),

   /**
    * ai12.
    */
    AI12("ai12", "AVC", "Advanced Video Coding"),

   /**
    * ai13.
    */
    AI13("ai13", "AVC", "Advanced Video Coding"),

   /**
    * ai15.
    */
    AI15("ai15", "AVC", "Advanced Video Coding"),

   /**
    * ai16.
    */
    AI16("ai16", "AVC", "Advanced Video Coding"),

   /**
    * ai1p.
    */
    AI1P("ai1p", "AVC", "Advanced Video Coding"),

   /**
    * ai1q.
    */
    AI1Q("ai1q", "AVC", "Advanced Video Coding"),

   /**
    * ai22.
    */
    AI22("ai22", "AVC", "Advanced Video Coding"),

   /**
    * ai23.
    */
    AI23("ai23", "AVC", "Advanced Video Coding"),

   /**
    * ai25.
    */
    AI25("ai25", "AVC", "Advanced Video Coding"),

   /**
    * ai26.
    */
    AI26("ai26", "AVC", "Advanced Video Coding"),

   /**
    * ai2p.
    */
    AI2P("ai2p", "AVC", "Advanced Video Coding"),

   /**
    * ai2q.
    */
    AI2Q("ai2q", "AVC", "Advanced Video Coding"),

   /**
    * ai52.
    */
    AI52("ai52", "AVC", "Advanced Video Coding"),

   /**
    * ai53.
    */
    AI53("ai53", "AVC", "Advanced Video Coding"),

   /**
    * ai55.
    */
    AI55("ai55", "AVC", "Advanced Video Coding"),

   /**
    * ai56.
    */
    AI56("ai56", "AVC", "Advanced Video Coding"),

   /**
    * ai5p.
    */
    AI5P("ai5p", "AVC", "Advanced Video Coding"),

   /**
    * ai5q.
    */
    AI5Q("ai5q", "AVC", "Advanced Video Coding"),

   /**
    * ap4c.
    */
    AP4C("ap4c", "ProRes", "4444", "4:4:4"),

   /**
    * ap4h.
    */
    AP4H("ap4h", "ProRes", "4444", "4:4:4"),

   /**
    * ap4x.
    */
    AP4X("ap4x", "ProRes", "4444 XQ", "4:4:4"),

   /**
    * apch.
    */
    APCH("apch", "ProRes", "422 HQ", "YUV", "4:2:2"),

   /**
    * apcn.
    */
    APCN("apcn", "ProRes", "422", "YUV", "4:2:2"),

   /**
    * apco.
    */
    APCO("apco", "ProRes", "422 Proxy", "YUV", "4:2:2"),

   /**
    * apcs.
    */
    APCS("apcs", "ProRes", "422 LT", "YUV", "4:2:2"),

   /**
    * AV1x.
    */
    AV1X("AV1x", "YUV", "YUV", "4:2:2"),

   /**
    * avc1.
    */
    AVC1("avc1", "AVC", "Advanced Video Coding"),

   /**
    * avc2.
    */
    AVC2("avc2", "AVC", "Advanced Video Coding"),

   /**
    * avc3.
    */
    AVC3("avc3", "AVC", "Advanced Video Coding"),

   /**
    * avc4.
    */
    AVC4("avc4", "AVC", "Advanced Video Coding"),

   /**
    * avcp.
    */
    AVCP("avcp", "AVC", "Advanced Video Coding Parameters"),

   /**
    * AVd1.
    */
    AVD1("AVd1", "DV", "Avid"),

   /**
    * AVdh.
    */
    AVDH("AVdh", "VC-3", "Avid DNxHR"),

   /**
    * AVDJ.
    */
    AVDJ("AVDJ", "JPEG", "Avid"),

   /**
    * AVdn.
    */
    AVDN("AVdn", "VC-3", "Avid DNxHD"),

   /**
    * AVdv.
    */
    AVDV("AVdv", "DV", "Avid", "YUV", "4:2:2"),

   /**
    * AVin.
    */
    AVIN("AVin", "AVC", "Advanced Video Coding"),

   /**
    * AVJI.
    */
    AVJI("AVJI", "Avid Meridien Compressed"),

   /**
    * AVmp.
    */
    AVMP("AVmp", "MPEG Video", "Avid IMX", "Version 2"),

   /**
    * avr .
    */
    AVR_("avr ", "JPEG"),

   /**
    * AVrp.
    */
    AVRP("AVrp", "RGB", "Avid", "RGB"),

   /**
    * AVUI.
    */
    AVUI("AVUI", "Avid Meridien Uncompressed"),

   /**
    * b16g.
    */
    B16G("b16g", "Gray", "Y", "16"),

   /**
    * b32a.
    */
    B32A("b32a", "Gray/Alpha", "YA", "16:16"),

   /**
    * b48r.
    */
    B48R("b48r", "RGB", "RGB", "16:16:16"),

   /**
    * b64a.
    */
    B64A("b64a", "RGBA", "RGBA", "16:16:16:16"),

   /**
    * base.
    */
    BASE("base", "RGBA", "RGBA", "16:16:16:16"),

   /**
    * blit.
    */
    BLIT("blit", "RGBA", "RGBA", "16:16:16:16"),

   /**
    * blnd.
    */
    BLND("blnd", "Alpha Compositor"),

   /**
    * blur.
    */
    BLUR("blur", "Blur", "CMYK"),

   /**
    * CFHD.
    */
    CFHD("CFHD", "CineForm", "CineForm High-Definition (HD) wavelet codec"),

   /**
    * CHQX.
    */
    CHQX("CHQX", "Canopus HQX"),

   /**
    * CLLC.
    */
    CLLC("CLLC", "Canopus Lossless"),

   /**
    * cmyk.
    */
    CMYK("cmyk", "CMYK"),

   /**
    * CUVC.
    */
    CUVC("CUVC", "Canopus HQ"),

   /**
    * cvid.
    */
    CVID("cvid", "Cinepak"),

   /**
    * drac.
    */
    DRAC("drac", "Dirac", "Dirac Video Coder"),

   /**
    * dslv.
    */
    DSLV("dslv", "Cross Fade"),

   /**
    * DV10.
    */
    DV10("DV10", "Digital Voodoo", "Digital Voodoo 10 bit Uncompressed 4:2:2 codec"),

   /**
    * dv5n.
    */
    DV5N("dv5n", "DV", "YUV", "4:2:2"),

   /**
    * dv5p.
    */
    DV5P("dv5p", "DV", "YUV", "4:2:2"),

   /**
    * dvc .
    */
    DVC_("dvc ", "DV", "YUV", "4:2:2"),

   /**
    * dvcp.
    */
    DVCP("dvcp", "DV", "YUV", "4:2:2"),

   /**
    * dvh1.
    */
    DVH1("dvh1", "DV", "YUV", "4:2:2"),

   /**
    * dvh2.
    */
    DVH2("dvh2", "DV", "YUV", "4:2:2"),

   /**
    * dvh3.
    */
    DVH3("dvh3", "DV", "YUV", "4:2:2"),

   /**
    * dvh4.
    */
    DVH4("dvh4", "DV", "YUV", "4:2:2"),

   /**
    * dvh5.
    */
    DVH5("dvh5", "DV", "YUV", "4:2:2"),

   /**
    * dvh6.
    */
    DVH6("dvh6", "DV", "YUV", "4:2:2"),

   /**
    * dvhp.
    */
    DVHP("dvhp", "DV", "YUV", "4:2:2"),

   /**
    * dvhq.
    */
    DVHQ("dvhq", "DV", "YUV", "4:2:2"),

   /**
    * DVOO.
    */
    DVOO("DVOO", "Digital Voodoo", "Digital Voodoo 8 bit Uncompressed 4:2:2 codec"),

   /**
    * DVOR.
    */
    DVOR("DVOR", "Digital Voodoo", "Digital Voodoo intermediate raw"),

   /**
    * dvpp.
    */
    DVPP("dvpp", "DV", "DVCPRO", "YUV", "4:2:2"),

   /**
    * DVTV.
    */
    DVTV("DVTV", "Digital Voodoo", "Digital Voodoo intermediate 2vuy"),

   /**
    * DVVT.
    */
    DVVT("DVVT", "Digital Voodoo", "Digital Voodoo intermediate v210"),

   /**
    * encv.
    */
    ENCV("encv", "(Encrypted)"),

   /**
    * FFV1.
    */
    FFV1("FFV1", "FFV1"),

   /**
    * gif .
    */
    GIF_("gif ", "M-GIF"),

   /**
    * h261.
    */
    H261("h261", "H.261"),

   /**
    * h263.
    */
    H263("h263", "H.263"),

   /**
    * h264.
    */
    H264("h264", "H.264"),

   /**
    * Hap1.
    */
    HAP1("Hap1", "Hap", "Hap Video Codec"),

   /**
    * Hap5.
    */
    HAP5("Hap5", "Hap Alpha", "Hap Video Codec"),

   /**
    * HapY.
    */
    HAPY("HapY", "Hap Q", "Hap Video Codec"),

   /**
    * hcpa.
    */
    HCPA("hcpa", "ProRes", "High", "YUV", "4:2:2"),

   /**
    * HD10.
    */
    HD10("HD10", "Digital Voodoo", "Digital Voodoo 10 bit Uncompressed 4:2:2 HD codec"),

   /**
    * hdv1.
    */
    HDV1("hdv1", "MPEG Video", "YUV"),

   /**
    * hdv2.
    */
    HDV2("hdv2", "MPEG Video", "YUV"),

   /**
    * hdv3.
    */
    HDV3("hdv3", "MPEG Video", "YUV"),

   /**
    * hdv4.
    */
    HDV4("hdv4", "MPEG Video", "YUV"),

   /**
    * hdv5.
    */
    HDV5("hdv5", "MPEG Video", "YUV"),

   /**
    * hdv6.
    */
    HDV6("hdv6", "MPEG Video", "YUV"),

   /**
    * hdv7.
    */
    HDV7("hdv7", "MPEG Video", "YUV"),

   /**
    * hdv8.
    */
    HDV8("hdv8", "MPEG Video", "YUV"),

   /**
    * hdv9.
    */
    HDV9("hdv9", "MPEG Video", "YUV"),

   /**
    * hdva.
    */
    HDVA("hdva", "MPEG Video", "YUV"),

   /**
    * hdvb.
    */
    HDVB("hdvb", "MPEG Video", "YUV"),

   /**
    * hdvc.
    */
    HDVC("hdvc", "MPEG Video", "YUV"),

   /**
    * hdvd.
    */
    HDVD("hdvd", "MPEG Video", "YUV"),

   /**
    * hdve.
    */
    HDVE("hdve", "MPEG Video", "YUV"),

   /**
    * hdvf.
    */
    HDVF("hdvf", "MPEG Video", "YUV"),

   /**
    * hev1.
    */
    HEV1("hev1", "HEVC", "High Efficiency Video Coding"),

   /**
    * hvc1.
    */
    HVC1("hvc1", "HEVC", "High Efficiency Video Coding"),

   /**
    * icod.
    */
    ICOD("icod", "AIC", "Apple Intermediate Codec", "YUV", "4:2:0"),

   /**
    * j420.
    */
    J420("j420", "YUV", "YUV", "4:2:0"),

   /**
    * jpeg.
    */
    JPEG("jpeg", "JPEG"),

   /**
    * kpcd.
    */
    KPCD("kpcd", "Photo CD"),

   /**
    * LMP2.
    */
    LMP2("LMP2", "MPEG Video", "YUV"),

   /**
    * M105.
    */
    M105("M105", "Matrox"),

   /**
    * m1v .
    */
    M1V_("m1v ", "MPEG Video"),

   /**
    * m2v1.
    */
    M2V1("m2v1", "MPEG Video"),

   /**
    * mjp2.
    */
    MJP2("mjp2", "JPEG 2000"),

   /**
    * mjpa.
    */
    MJPA("mjpa", "JPEG"),

   /**
    * mjpb.
    */
    MJPB("mjpb", "JPEG"),

   /**
    * MMES.
    */
    MMES("MMES", "MPEG Video", "YUV"),

   /**
    * mp4v.
    */
    MP4V("mp4v", "MPEG-4 Visual"),

   /**
    * mpeg.
    */
    MPEG("mpeg", "MPEG Video"),

   /**
    * mx3n.
    */
    MX3N("mx3n", "MPEG Video", "YUV"),

   /**
    * mx3p.
    */
    MX3P("mx3p", "MPEG Video", "YUV"),

   /**
    * mx4n.
    */
    MX4N("mx4n", "MPEG Video", "YUV"),

   /**
    * mx4p.
    */
    MX4P("mx4p", "MPEG Video", "YUV"),

   /**
    * mx5n.
    */
    MX5N("mx5n", "MPEG Video", "YUV"),

   /**
    * mx5p.
    */
    MX5P("mx5p", "MPEG Video", "YUV"),

   /**
    * myuv.
    */
    MYUV("myuv", "YUV", "YUV", "4:2:0"),

   /**
    * ncpa.
    */
    NCPA("ncpa", "ProRes", "Normal", "YUV", "4:2:2"),

   /**
    * ovc1.
    */
    OVC1("ovc1", "VC-1", "Smooth Streaming Media Video"),

   /**
    * PIM1.
    */
    PIM1("PIM1", "MPEG Video", "YUV"),

   /**
    * PIM2.
    */
    PIM2("PIM2", "MPEG Video", "YUV"),

   /**
    * png .
    */
    PNG_("png ", "PNG"),

   /**
    * PNTG.
    */
    PNTG("PNTG", "MacPaint", "Apple MacPaint image format"),

   /**
    * r210.
    */
    R210("r210", "RGB", "Blackmagic Design", "RGB"),

   /**
    * raw .
    */
    RAW_("raw ", "RGB", "RGB"),

   /**
    * rle .
    */
    RLE_("rle ", "RLE", "RGB"),

   /**
    * rpza.
    */
    RPZA("rpza", "Road Pizza"),

   /**
    * s263.
    */
    S263("s263", "H.263"),

   /**
    * Shr0.
    */
    SHR0("Shr0", "SheerVideo", "Generic SheerVideo codec"),

   /**
    * Shr1.
    */
    SHR1("Shr1", "SheerVideo", "SheerVideo RGB"),

   /**
    * Shr2.
    */
    SHR2("Shr2", "SheerVideo", "SheerVideo Y'CbCr[A] 4:4:4"),

   /**
    * Shr3.
    */
    SHR3("Shr3", "SheerVideo", "SheerVideo Y'CbCr 4:2:2"),

   /**
    * Shr4.
    */
    SHR4("Shr4", "SheerVideo", "SheerVideo Y'CbCr 4:2:2"),

   /**
    * SJDS.
    */
    SJDS("SJDS", "SoftImage DS Compressed"),

   /**
    * SUDS.
    */
    SUDS("SUDS", "SoftImage DS Uncompressed"),

   /**
    * SV10.
    */
    SV10("SV10", "Sorenson", "Sorenson Media Video R1"),

   /**
    * SVQ1.
    */
    SVQ1("SVQ1", "Sorenson 1", "Sorenson Media Video 1 (Apple QuickTime 3)"),

   /**
    * SVQ2.
    */
    SVQ2("SVQ2", "Sorenson 2", "Sorenson Media Video 2 (Apple QuickTime 4)"),

   /**
    * SVQ3.
    */
    SVQ3("SVQ3", "Sorenson 3", "Sorenson Media Video 3 (Apple QuickTime 5)"),

   /**
    * v210.
    */
    V210("v210", "YUV", "AJA Video Systems Xena", "YUV", "4:2:2"),

   /**
    * vc-1.
    */
    VC_1("vc-1", "VC-1", "SMPTE VC-1", "YUV"),

   /**
    * WMV3.
    */
    WMV3("WMV3", "VC-1", "WMV3", "Windows Media Video 9"),

   /**
    * WRLE.
    */
    WRLE("WRLE", "Bitmap", "Windows BMP image format", "YUV"),

   /**
    * xd50.
    */
    XD50("xd50", "MPEG Video", "YUV"),

   /**
    * xd51.
    */
    XD51("xd51", "MPEG Video", "YUV"),

   /**
    * xd52.
    */
    XD52("xd52", "MPEG Video", "YUV"),

   /**
    * xd53.
    */
    XD53("xd53", "MPEG Video", "YUV"),

   /**
    * xd54.
    */
    XD54("xd54", "MPEG Video", "YUV"),

   /**
    * xd55.
    */
    XD55("xd55", "MPEG Video", "YUV"),

   /**
    * xd56.
    */
    XD56("xd56", "MPEG Video", "YUV"),

   /**
    * xd57.
    */
    XD57("xd57", "MPEG Video", "YUV"),

   /**
    * xd58.
    */
    XD58("xd58", "MPEG Video", "YUV"),

   /**
    * xd59.
    */
    XD59("xd59", "MPEG Video", "YUV"),

   /**
    * xd5a.
    */
    XD5A("xd5a", "MPEG Video", "YUV"),

   /**
    * xd5b.
    */
    XD5B("xd5b", "MPEG Video", "YUV"),

   /**
    * xd5c.
    */
    XD5C("xd5c", "MPEG Video", "YUV"),

   /**
    * xd5d.
    */
    XD5D("xd5d", "MPEG Video", "YUV"),

   /**
    * xd5e.
    */
    XD5E("xd5e", "MPEG Video", "YUV"),

   /**
    * xd5f.
    */
    XD5F("xd5f", "MPEG Video", "YUV"),

   /**
    * xdh2.
    */
    XDH2("xdh2", "MPEG Video", "YUV"),

   /**
    * xdhd.
    */
    XDHD("xdhd", "MPEG Video", "YUV"),

   /**
    * xdv0.
    */
    XDV0("xdv0", "MPEG Video", "YUV"),

   /**
    * xdv1.
    */
    XDV1("xdv1", "MPEG Video", "YUV"),

   /**
    * xdv2.
    */
    XDV2("xdv2", "MPEG Video", "YUV"),

   /**
    * xdv3.
    */
    XDV3("xdv3", "MPEG Video", "YUV"),

   /**
    * xdv4.
    */
    XDV4("xdv4", "MPEG Video", "YUV"),

   /**
    * xdv5.
    */
    XDV5("xdv5", "MPEG Video", "YUV"),

   /**
    * xdv6.
    */
    XDV6("xdv6", "MPEG Video", "YUV"),

   /**
    * xdv7.
    */
    XDV7("xdv7", "MPEG Video", "YUV"),

   /**
    * xdv8.
    */
    XDV8("xdv8", "MPEG Video", "YUV"),

   /**
    * xdv9.
    */
    XDV9("xdv9", "MPEG Video", "YUV"),

   /**
    * xdva.
    */
    XDVA("xdva", "MPEG Video", "YUV"),

   /**
    * xdvb.
    */
    XDVB("xdvb", "MPEG Video", "YUV"),

   /**
    * xdvc.
    */
    XDVC("xdvc", "MPEG Video", "YUV"),

   /**
    * xdvd.
    */
    XDVD("xdvd", "MPEG Video", "YUV"),

   /**
    * xdve.
    */
    XDVE("xdve", "MPEG Video", "YUV"),

   /**
    * xdvf.
    */
    XDVF("xdvf", "MPEG Video", "YUV"),

   /**
    * yuv2.
    */
    YUV2("yuv2", "YUV", "YUV", "4:2:2"),

   /**
    * yuvs.
    */
    YUVS("yuvs", "YUV", "YUV", "4:2:2"),

   /**
    * yuvu.
    */
    YUVU("yuvu", "YUV", "YUV", "4:2:2"),

   /**
    * yuvx.
    */
    YUVX("yuvx", "YUV", "YUV", "4:2:2");

    @NonNull
    private final List<@NonNull String> codecIDList;

    VideoMpeg4Enum(@NonNull final String @NonNull... codecIdParam) {
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
     * Get VideoMpeg4Enum corresponding to given string.
     *
     * @param param
     * @return corresponding VideoMpeg4Enum
     */
    @Nullable
    public static final VideoMpeg4Enum getVideoMpeg4Enum(@Nullable final String param) {
        VideoMpeg4Enum result = null;
        if (param != null) {
            final String trimmedParam = param.trim().toLowerCase();
            if (trimmedParam.length() > 0) {
                for (final VideoMpeg4Enum codecEnum : VideoMpeg4Enum.values()) {
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
