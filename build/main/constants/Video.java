package aka.jmetadata.main.constants;

import org.eclipse.jdt.annotation.NonNull;

/**
 * Video constants parameters.
 *
 * @author Welle Charlotte
 */
public final class Video {

   /**
    * Original (in the raw stream) width in pixel.
    */
    @NonNull
    public static final String WIDTHORIGINAL = "Width_Original";

   /**
    * Delay source (Stream or empty).
    */
    @NonNull
    public static final String DELAYORIGINALSOURCE = "Delay_Original_Source";

   /**
    * Stream order in the file, whatever is the kind of stream (base=0).
    */
    @NonNull
    public static final String STREAMORDER = "StreamOrder";

   /**
    * Name of the the encoding-software.
    */
    @NonNull
    public static final String ENCODEDLIBRARYNAME = "Encoded_Library_Name";

   /**
    * Multiview, how views are muxed in the container in case of it is not muxing in the stream.
    */
    @NonNull
    public static final String MULTIVIEWLAYOUT = "MultiView_Layout";

   /**
    * Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @NonNull
    public static final String DURATIONFIRSTFRAMESTRING4 = "Duration_FirstFrame/String4";

   /**
    * Chromaticity coordinates of the source primaries.
    */
    @NonNull
    public static final String COLOURPRIMARIES = "colour_primaries";

   /**
    * Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @NonNull
    public static final String DURATIONFIRSTFRAMESTRING5 = "Duration_FirstFrame/String5";

   /**
    * Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @NonNull
    public static final String DURATIONFIRSTFRAMESTRING2 = "Duration_FirstFrame/String2";

   /**
    * Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @NonNull
    public static final String SOURCEDURATIONFIRSTFRAMESTRING = "Source_Duration_FirstFrame/String";

   /**
    * Rotation (if not horizontal).
    */
    @NonNull
    public static final String ROTATIONSTRING = "Rotation/String";

   /**
    * Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @NonNull
    public static final String DURATIONFIRSTFRAMESTRING3 = "Duration_FirstFrame/String3";

   /**
    * ScanType_StoreMethod.
    */
    @NonNull
    public static final String SCANTYPESTOREMETHOD = "ScanType_StoreMethod";

   /**
    * Source Duration of the last frame if it is longer than others, in ms.
    */
    @NonNull
    public static final String SOURCEDURATIONLASTFRAME = "Source_Duration_LastFrame";

   /**
    * Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @NonNull
    public static final String DURATIONFIRSTFRAMESTRING1 = "Duration_FirstFrame/String1";

   /**
    * Clean Aperture width in pixel.
    */
    @NonNull
    public static final String WIDTHCLEANAPERTURE = "Width_CleanAperture";

   /**
    * Opto-electronic transfer characteristic of the source picture.
    */
    @NonNull
    public static final String TRANSFERCHARACTERISTICS = "transfer_characteristics";

   /**
    * Settings needed for decoder used, detailled (M=x N=y).
    */
    @NonNull
    public static final String FORMATSETTINGSGOP = "Format_Settings_GOP";

   /**
    * Clean Aperture width with measurement (pixel).
    */
    @NonNull
    public static final String WIDTHCLEANAPERTURESTRING = "Width_CleanAperture/String";

   /**
    * Compression method used.
    */
    @NonNull
    public static final String FORMATCOMPRESSION = "Format_Compression";

   /**
    * Alignment/String.
    */
    @NonNull
    public static final String ALIGNMENTSTRING = "Alignment/String";

   /**
    * Delay with measurement.
    */
    @NonNull
    public static final String DELAYSTRING = "Delay/String";

   /**
    * Source Encoded Streamsize in with percentage value.
    */
    @NonNull
    public static final String SOURCESTREAMSIZEENCODEDSTRING = "Source_StreamSize_Encoded/String";

   /**
    * Manual description given by the container.
    */
    @NonNull
    public static final String CODECIDDESCRIPTION = "CodecID_Description";

   /**
    * bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    */
    @NonNull
    public static final String STATUS = "Status";

   /**
    * Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @NonNull
    public static final String DURATIONFIRSTFRAMESTRING = "Duration_FirstFrame/String";

   /**
    * Frames per second.
    */
    @NonNull
    public static final String FRAMERATE = "FrameRate";

   /**
    * Service kind (full).
    */
    @NonNull
    public static final String SERVICEKINDSTRING = "ServiceKind/String";

   /**
    * How this file is muxed in the container.
    */
    @NonNull
    public static final String MUXINGMODE = "MuxingMode";

   /**
    * ScanType_StoreMethod/String.
    */
    @NonNull
    public static final String SCANTYPESTOREMETHODSTRING = "ScanType_StoreMethod/String";

   /**
    * Delay settings (in case of timecode for example).
    */
    @NonNull
    public static final String DELAYSETTINGS = "Delay_Settings";

   /**
    * Source Encoded Streamsize in bytes.
    */
    @NonNull
    public static final String SOURCESTREAMSIZEENCODED = "Source_StreamSize_Encoded";

   /**
    * Clean Aperture Display Aspect ratio.
    */
    @NonNull
    public static final String DISPLAYASPECTRATIOCLEANAPERTURESTRING = "DisplayAspectRatio_CleanAperture/String";

   /**
    * Bit rate mode (Variable, Cconstant).
    */
    @NonNull
    public static final String BITRATEMODESTRING = "BitRate_Mode/String";

   /**
    * Multiview, count of views.
    */
    @NonNull
    public static final String MULTIVIEWCOUNT = "MultiView_Count";

   /**
    * Offset between original width and displayed width in pixel.
    */
    @NonNull
    public static final String WIDTHOFFSETSTRING = "Width_Offset/String";

   /**
    * Settings needed for decoder used, detailled.
    */
    @NonNull
    public static final String FORMATSETTINGSBVOPSTRING = "Format_Settings_BVOP/String";

   /**
    * Minimum Frames per second (with measurement).
    */
    @NonNull
    public static final String FRAMERATEMINIMUMSTRING = "FrameRate_Minimum/String";

   /**
    * Version of encoding-software.
    */
    @NonNull
    public static final String ENCODEDLIBRARYVERSION = "Encoded_Library_Version";

   /**
    * Settings needed for decoder used, detailled.
    */
    @NonNull
    public static final String FORMATSETTINGSFRAMEMODE = "Format_Settings_FrameMode";

   /**
    * Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @NonNull
    public static final String SOURCEDURATIONLASTFRAMESTRING = "Source_Duration_LastFrame/String";

   /**
    * Info on the codec.
    */
    @NonNull
    public static final String CODECIDINFO = "CodecID/Info";

   /**
    * Original (in the raw stream) Display Aspect ratio.
    */
    @NonNull
    public static final String DISPLAYASPECTRATIOORIGINAL = "DisplayAspectRatio_Original";

   /**
    * Presence of colour description.
    */
    @NonNull
    public static final String COLOURDESCRIPTIONPRESENTORIGINAL = "colour_description_present_Original";

   /**
    * Streamsize in bytes.
    */
    @NonNull
    public static final String STREAMSIZE = "StreamSize";

   /**
    * Active Format Description (text).
    */
    @NonNull
    public static final String ACTIVEFORMATDESCRIPTIONSTRING = "ActiveFormatDescription/String";

   /**
    * Width (aperture size if present) with measurement (pixel).
    */
    @NonNull
    public static final String WIDTHSTRING = "Width/String";

   /**
    * Info about Format.
    */
    @NonNull
    public static final String FORMATINFO = "Format/Info";

   /**
    * Source_StreamSize/String1.
    */
    @NonNull
    public static final String SOURCESTREAMSIZESTRING1 = "Source_StreamSize/String1";

   /**
    * Source Stream size divided by file size.
    */
    @NonNull
    public static final String SOURCESTREAMSIZEPROPORTION = "Source_StreamSize_Proportion";

   /**
    * Homepage for more details about this codec.
    */
    @NonNull
    public static final String CODECIDURL = "CodecID/Url";

   /**
    * Source_StreamSize/String2.
    */
    @NonNull
    public static final String SOURCESTREAMSIZESTRING2 = "Source_StreamSize/String2";

   /**
    * Height with measurement (pixel).
    */
    @NonNull
    public static final String HEIGHTSTRING = "Height/String";

   /**
    * Source Streamsize in with percentage value.
    */
    @NonNull
    public static final String SOURCESTREAMSIZESTRING5 = "Source_StreamSize/String5";

   /**
    * Source_StreamSize/String3.
    */
    @NonNull
    public static final String SOURCESTREAMSIZESTRING3 = "Source_StreamSize/String3";

   /**
    * Source_StreamSize/String4.
    */
    @NonNull
    public static final String SOURCESTREAMSIZESTRING4 = "Source_StreamSize/String4";

   /**
    * Set if that track should not be used.
    */
    @NonNull
    public static final String DISABLEDSTRING = "Disabled/String";

   /**
    * ScanType_Original/String.
    */
    @NonNull
    public static final String SCANTYPEORIGINALSTRING = "ScanType_Original/String";

   /**
    * Operating System of encoding-software.
    */
    @NonNull
    public static final String ENCODEDOPERATINGSYSTEM = "Encoded_OperatingSystem";

   /**
    * Sampled height.
    */
    @NonNull
    public static final String SAMPLEDHEIGHT = "Sampled_Height";

   /**
    * Name of the company.
    */
    @NonNull
    public static final String ENCODEDAPPLICATIONCOMPANYNAME = "Encoded_Application_CompanyName";

   /**
    * Current stream size divided by uncompressed stream size.
    */
    @NonNull
    public static final String COMPRESSIONRATIO = "Compression_Ratio";

   /**
    * Commercial name used by vendor for theses setings if there is one.
    */
    @NonNull
    public static final String FORMATCOMMERCIALIFANY = "Format_Commercial_IfAny";

   /**
    * UTC time that the tags were done for this item..
    */
    @NonNull
    public static final String TAGGEDDATE = "Tagged_Date";

   /**
    * Clean Aperture Display Aspect ratio.
    */
    @NonNull
    public static final String DISPLAYASPECTRATIOCLEANAPERTURE = "DisplayAspectRatio_CleanAperture";

   /**
    * The ID for this stream in this file.
    */
    @NonNull
    public static final String IDSTRING = "ID/String";

   /**
    * Original (in the raw stream) Pixel Aspect ratio.
    */
    @NonNull
    public static final String PIXELASPECTRATIOORIGINAL = "PixelAspectRatio_Original";

   /**
    * Matrix coefficients used in deriving luma and chroma signals from the green, blue, and red primaries.
    */
    @NonNull
    public static final String MATRIXCOEFFICIENTSORIGINAL = "matrix_coefficients_Original";

   /**
    * Compression mode (Lossy or Lossless).
    */
    @NonNull
    public static final String COMPRESSIONMODE = "Compression_Mode";

   /**
    * Bit rate in bps.
    */
    @NonNull
    public static final String BITRATE = "BitRate";

   /**
    * UTC time that the encoding of this item was completed began..
    */
    @NonNull
    public static final String ENCODEDDATE = "Encoded_Date";

   /**
    * Bit rate mode (VBR, CBR).
    */
    @NonNull
    public static final String BITRATEMODE = "BitRate_Mode";

   /**
    * The unique ID for this stream, should be copied with stream copy.
    */
    @NonNull
    public static final String UNIQUEID = "UniqueID";

   /**
    * Maximum Bit rate (with measurement).
    */
    @NonNull
    public static final String BITRATEMAXIMUMSTRING = "BitRate_Maximum/String";

   /**
    * Delay in format : HH:MM:SS.MMM.
    */
    @NonNull
    public static final String DELAYSTRING3 = "Delay/String3";

   /**
    * Matrix, in binary format encoded BASE64. Order = intra, non-intra, gray intra, gray non-intra.
    */
    @NonNull
    public static final String FORMATSETTINGSMATRIXDATA = "Format_Settings_Matrix_Data";

   /**
    * Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @NonNull
    public static final String DELAYSTRING4 = "Delay/String4";

   /**
    * ColorSpace.
    */
    @NonNull
    public static final String COLORSPACE = "ColorSpace";

   /**
    * Delay with measurement.
    */
    @NonNull
    public static final String DELAYSTRING1 = "Delay/String1";

   /**
    * Delay with measurement.
    */
    @NonNull
    public static final String DELAYSTRING2 = "Delay/String2";

   /**
    * Time code settings.
    */
    @NonNull
    public static final String TIMECODESETTINGS = "TimeCode_Settings";

   /**
    * Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @NonNull
    public static final String DELAYSTRING5 = "Delay/String5";

   /**
    * Delay fixed in the stream (relative) IN MS.
    */
    @NonNull
    public static final String DELAY = "Delay";

   /**
    * Time code information about Open/Closed of first frame if GOP is Open for the other GOPs.
    */
    @NonNull
    public static final String GOPOPENCLOSEDFIRSTFRAMESTRING = "Gop_OpenClosed_FirstFrame/String";

   /**
    * Name of the software package used to create the file, such as Microsoft WaveEdit..
    */
    @NonNull
    public static final String ENCODEDAPPLICATIONURL = "Encoded_Application_Url";

   /**
    * Time code in HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available format.
    */
    @NonNull
    public static final String TIMECODEFIRSTFRAME = "TimeCode_FirstFrame";

   /**
    * Source_StreamSize_Encoded/String4.
    */
    @NonNull
    public static final String SOURCESTREAMSIZEENCODEDSTRING4 = "Source_StreamSize_Encoded/String4";

   /**
    * Source Encoded Streamsize in with percentage value.
    */
    @NonNull
    public static final String SOURCESTREAMSIZEENCODEDSTRING5 = "Source_StreamSize_Encoded/String5";

   /**
    * Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @NonNull
    public static final String SOURCEDURATIONFIRSTFRAMESTRING1 = "Source_Duration_FirstFrame/String1";

   /**
    * Settings needed for decoder used, detailled.
    */
    @NonNull
    public static final String FORMATSETTINGSPULLDOWN = "Format_Settings_Pulldown";

   /**
    * Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @NonNull
    public static final String SOURCEDURATIONFIRSTFRAMESTRING2 = "Source_Duration_FirstFrame/String2";

   /**
    * Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @NonNull
    public static final String SOURCEDURATIONFIRSTFRAMESTRING3 = "Source_Duration_FirstFrame/String3";

   /**
    * Software used to create the file.
    */
    @NonNull
    public static final String ENCODEDLIBRARY = "Encoded_Library";

   /**
    * Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @NonNull
    public static final String SOURCEDURATIONFIRSTFRAMESTRING4 = "Source_Duration_FirstFrame/String4";

   /**
    * Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @NonNull
    public static final String SOURCEDURATIONFIRSTFRAMESTRING5 = "Source_Duration_FirstFrame/String5";

   /**
    * Stored height.
    */
    @NonNull
    public static final String STOREDHEIGHT = "Stored_Height";

   /**
    * Nominal Frames per second.
    */
    @NonNull
    public static final String FRAMERATENOMINAL = "FrameRate_Nominal";

   /**
    * Internet Media Type (aka MIME Type, Content-Type).
    */
    @NonNull
    public static final String INTERNETMEDIATYPE = "InternetMediaType";

   /**
    * Source_StreamSize_Encoded/String2.
    */
    @NonNull
    public static final String SOURCESTREAMSIZEENCODEDSTRING2 = "Source_StreamSize_Encoded/String2";

   /**
    * Set if that track should not be used.
    */
    @NonNull
    public static final String DISABLED = "Disabled";

   /**
    * Frames per second, denominator.
    */
    @NonNull
    public static final String FRAMERATEDEN = "FrameRate_Den";

   /**
    * Source_StreamSize_Encoded/String3.
    */
    @NonNull
    public static final String SOURCESTREAMSIZEENCODEDSTRING3 = "Source_StreamSize_Encoded/String3";

   /**
    * Maximum Frames per second (with measurement).
    */
    @NonNull
    public static final String FRAMERATEMAXIMUMSTRING = "FrameRate_Maximum/String";

   /**
    * Encoded Stream size divided by file size.
    */
    @NonNull
    public static final String STREAMSIZEENCODEDPROPORTION = "StreamSize_Encoded_Proportion";

   /**
    * Source_StreamSize_Encoded/String1.
    */
    @NonNull
    public static final String SOURCESTREAMSIZEENCODEDSTRING1 = "Source_StreamSize_Encoded/String1";

   /**
    * ScanOrder_Original.
    */
    @NonNull
    public static final String SCANORDERORIGINAL = "ScanOrder_Original";

   /**
    * Play time of the stream in ms.
    */
    @NonNull
    public static final String DURATION = "Duration";

   /**
    * Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @NonNull
    public static final String SOURCEDURATIONSTRING5 = "Source_Duration/String5";

   /**
    * Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @NonNull
    public static final String DURATIONLASTFRAMESTRING = "Duration_LastFrame/String";

   /**
    * Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @NonNull
    public static final String SOURCEDURATIONSTRING4 = "Source_Duration/String4";

   /**
    * Source Play time in format : HH:MM:SS.MMM.
    */
    @NonNull
    public static final String SOURCEDURATIONSTRING3 = "Source_Duration/String3";

   /**
    * Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @NonNull
    public static final String SOURCEDURATIONSTRING2 = "Source_Duration/String2";

   /**
    * ChromaSubsampling/String.
    */
    @NonNull
    public static final String CHROMASUBSAMPLINGSTRING = "ChromaSubsampling/String";

   /**
    * Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @NonNull
    public static final String SOURCEDURATIONSTRING1 = "Source_Duration/String1";

   /**
    * Hint/popular name for this codec.
    */
    @NonNull
    public static final String CODECIDHINT = "CodecID/Hint";

   /**
    * Name of the software package used to create the file, such as Microsoft WaveEdit.
    */
    @NonNull
    public static final String ENCODEDAPPLICATION = "Encoded_Application";

   /**
    * Compression mode (Lossy or Lossless).
    */
    @NonNull
    public static final String COMPRESSIONMODESTRING = "Compression_Mode/String";

   /**
    * StreamSize/String2.
    */
    @NonNull
    public static final String STREAMSIZESTRING2 = "StreamSize/String2";

   /**
    * StreamSize/String1.
    */
    @NonNull
    public static final String STREAMSIZESTRING1 = "StreamSize/String1";

   /**
    * StreamSize/String4.
    */
    @NonNull
    public static final String STREAMSIZESTRING4 = "StreamSize/String4";

   /**
    * Original frame rate mode (Constant, Variable).
    */
    @NonNull
    public static final String FRAMERATEMODEORIGINALSTRING = "FrameRate_Mode_Original/String";

   /**
    * StreamSize/String3.
    */
    @NonNull
    public static final String STREAMSIZESTRING3 = "StreamSize/String3";

   /**
    * Streamsize in with percentage value.
    */
    @NonNull
    public static final String STREAMSIZESTRING5 = "StreamSize/String5";

   /**
    * Minimum Frames per second.
    */
    @NonNull
    public static final String FRAMERATEMINIMUM = "FrameRate_Minimum";

   /**
    * Stream type name.
    */
    @NonNull
    public static final String STREAMKIND = "StreamKind";

   /**
    * Bit rate (with measurement).
    */
    @NonNull
    public static final String BITRATESTRING = "BitRate/String";

   /**
    * Frame rate mode (Constant, Variable).
    */
    @NonNull
    public static final String FRAMERATEMODESTRING = "FrameRate_Mode/String";

   /**
    * Language (full).
    */
    @NonNull
    public static final String LANGUAGESTRING1 = "Language/String1";

   /**
    * Settings needed for decoder used, detailled.
    */
    @NonNull
    public static final String FORMATSETTINGSGMC = "Format_Settings_GMC";

   /**
    * NTSC or PAL.
    */
    @NonNull
    public static final String STANDARD = "Standard";

   /**
    * Language (2-letter ISO 639-1 if exists, else empty).
    */
    @NonNull
    public static final String LANGUAGESTRING2 = "Language/String2";

   /**
    * Language (3-letter ISO 639-2 if exists, else empty).
    */
    @NonNull
    public static final String LANGUAGESTRING3 = "Language/String3";

   /**
    * Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    */
    @NonNull
    public static final String LANGUAGESTRING4 = "Language/String4";

   /**
    * Codec ID (found in some containers).
    */
    @NonNull
    public static final String CODECID = "CodecID";

   /**
    * Number of a group in order to provide versions of the same track.
    */
    @NonNull
    public static final String ALTERNATEGROUP = "AlternateGroup";

   /**
    * Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    */
    @NonNull
    public static final String LANGUAGE = "Language";

   /**
    * ScanOrder/String.
    */
    @NonNull
    public static final String SCANORDERSTRING = "ScanOrder/String";

   /**
    * Offset between original height and displayed height  in pixel.
    */
    @NonNull
    public static final String HEIGHTOFFSETSTRING = "Height_Offset/String";

   /**
    * Duration of the last frame if it is longer than others, in ms.
    */
    @NonNull
    public static final String DURATIONLASTFRAME = "Duration_LastFrame";

   /**
    * Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @NonNull
    public static final String ENCODEDLIBRARYSTRING = "Encoded_Library/String";

   /**
    * Settings needed for decoder used, detailled.
    */
    @NonNull
    public static final String FORMATSETTINGSREFFRAMESSTRING = "Format_Settings_RefFrames/String";

   /**
    * Streamsize in with percentage value.
    */
    @NonNull
    public static final String STREAMSIZESTRING = "StreamSize/String";

   /**
    * Set if that track should be used if no language found matches the user preference..
    */
    @NonNull
    public static final String DEFAULTSTRING = "Default/String";

   /**
    * The ID for this stream in the original medium of the material.
    */
    @NonNull
    public static final String ORIGINALSOURCEMEDIUMIDSTRING = "OriginalSourceMedium_ID/String";

   /**
    * Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @NonNull
    public static final String SOURCEDURATIONLASTFRAMESTRING1 = "Source_Duration_LastFrame/String1";

   /**
    * Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @NonNull
    public static final String SOURCEDURATIONLASTFRAMESTRING3 = "Source_Duration_LastFrame/String3";

   /**
    * Presence of colour description.
    */
    @NonNull
    public static final String COLOURDESCRIPTIONPRESENT = "colour_description_present";

   /**
    * Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @NonNull
    public static final String SOURCEDURATIONLASTFRAMESTRING2 = "Source_Duration_LastFrame/String2";

   /**
    * ScanOrder_Stored/String.
    */
    @NonNull
    public static final String SCANORDERSTOREDSTRING = "ScanOrder_Stored/String";

   /**
    * Settings needed for decoder used, detailled.
    */
    @NonNull
    public static final String FORMATSETTINGSMATRIX = "Format_Settings_Matrix";

   /**
    * Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @NonNull
    public static final String SOURCEDURATIONLASTFRAMESTRING5 = "Source_Duration_LastFrame/String5";

   /**
    * Display Aspect ratio.
    */
    @NonNull
    public static final String DISPLAYASPECTRATIOSTRING = "DisplayAspectRatio/String";

   /**
    * Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @NonNull
    public static final String SOURCEDURATIONLASTFRAMESTRING4 = "Source_Duration_LastFrame/String4";

   /**
    * 16/24/32 bits.
    */
    @NonNull
    public static final String BITDEPTHSTRING = "BitDepth/String";

   /**
    * Number of frames.
    */
    @NonNull
    public static final String FRAMECOUNT = "FrameCount";

   /**
    * Name of the track.
    */
    @NonNull
    public static final String TITLE = "Title";

   /**
    * Delay drop frame.
    */
    @NonNull
    public static final String DELAYDROPFRAME = "Delay_DropFrame";

   /**
    * Rotation.
    */
    @NonNull
    public static final String ROTATION = "Rotation";

   /**
    * Maximum Bit rate in bps.
    */
    @NonNull
    public static final String BITRATEMAXIMUM = "BitRate_Maximum";

   /**
    * Defines the size of the buffer needed to decode the sequence..
    */
    @NonNull
    public static final String BUFFERSIZE = "BufferSize";

   /**
    * Stream size divided by file size.
    */
    @NonNull
    public static final String STREAMSIZEPROPORTION = "StreamSize_Proportion";

   /**
    * Source Encoded Stream size divided by file size.
    */
    @NonNull
    public static final String SOURCESTREAMSIZEENCODEDPROPORTION = "Source_StreamSize_Encoded_Proportion";

   /**
    * Parameters used by the software.
    */
    @NonNull
    public static final String ENCODEDLIBRARYSETTINGS = "Encoded_Library_Settings";

   /**
    * Source Play time of the stream, in ms.
    */
    @NonNull
    public static final String SOURCEDURATION = "Source_Duration";

   /**
    * Frame rate mode (CFR, VFR).
    */
    @NonNull
    public static final String FRAMERATEMODE = "FrameRate_Mode";

   /**
    * Offset between original width and displayed width in pixel.
    */
    @NonNull
    public static final String WIDTHOFFSET = "Width_Offset";

   /**
    * Sampled width.
    */
    @NonNull
    public static final String SAMPLEDWIDTH = "Sampled_Width";

   /**
    * Delay with measurement.
    */
    @NonNull
    public static final String DELAYORIGINALSTRING1 = "Delay_Original/String1";

   /**
    * Count of objects available in this stream.
    */
    @NonNull
    public static final String COUNT = "Count";

   /**
    * Wrapping mode (Frame wrapped or Clip wrapped).
    */
    @NonNull
    public static final String FORMATSETTINGSWRAPPING = "Format_Settings_Wrapping";

   /**
    * Delay with measurement.
    */
    @NonNull
    public static final String DELAYORIGINALSTRING2 = "Delay_Original/String2";

   /**
    * Encryption.
    */
    @NonNull
    public static final String ENCRYPTION = "Encryption";

   /**
    * Multiview, profile of the base stream.
    */
    @NonNull
    public static final String MULTIVIEWBASEPROFILE = "MultiView_BaseProfile";

   /**
    * Delay fixed in the raw stream (relative) IN MS.
    */
    @NonNull
    public static final String DELAYORIGINAL = "Delay_Original";

   /**
    * bits/(Pixel*Frame) (like Gordian Knot).
    */
    @NonNull
    public static final String BITSPIXELFRAME = "Bits-(Pixel*Frame)";

   /**
    * Frames per second, numerator.
    */
    @NonNull
    public static final String FRAMERATENUM = "FrameRate_Num";

   /**
    * How this stream file is aligned in the container.
    */
    @NonNull
    public static final String ALIGNMENT = "Alignment";

   /**
    * Version of this format.
    */
    @NonNull
    public static final String FORMATVERSION = "Format_Version";

   /**
    * When multiple streams, number of the stream (base=1).
    */
    @NonNull
    public static final String STREAMKINDPOS = "StreamKindPos";

   /**
    * The ID for this stream in the original medium of the material.
    */
    @NonNull
    public static final String ORIGINALSOURCEMEDIUMID = "OriginalSourceMedium_ID";

   /**
    * Play time in format : XXx YYy only, YYy omited if zero.
    */
    @NonNull
    public static final String DURATIONSTRING = "Duration/String";

   /**
    * Settings needed for decoder used, detailled.
    */
    @NonNull
    public static final String FORMATSETTINGSMATRIXSTRING = "Format_Settings_Matrix/String";

   /**
    * The ID for this stream in this file.
    */
    @NonNull
    public static final String ID = "ID";

   /**
    * Time code source (Container, Stream, SystemScheme1, SDTI, ANC...).
    */
    @NonNull
    public static final String TIMECODESOURCE = "TimeCode_Source";

   /**
    * Release date of software.
    */
    @NonNull
    public static final String ENCODEDLIBRARYDATE = "Encoded_Library_Date";

   /**
    * The menu ID for this stream in this file.
    */
    @NonNull
    public static final String MENUIDSTRING = "MenuID/String";

   /**
    * ScanType/String.
    */
    @NonNull
    public static final String SCANTYPESTRING = "ScanType/String";

   /**
    * More info about Language (e.g. Director's Comment).
    */
    @NonNull
    public static final String LANGUAGEMORE = "Language_More";

   /**
    * Source Streamsize in with percentage value.
    */
    @NonNull
    public static final String SOURCESTREAMSIZESTRING = "Source_StreamSize/String";

   /**
    * Maximum Frames per second.
    */
    @NonNull
    public static final String FRAMERATEMAXIMUM = "FrameRate_Maximum";

   /**
    * Original (in the raw stream) frames per second.
    */
    @NonNull
    public static final String FRAMERATEORIGINAL = "FrameRate_Original";

   /**
    * Display Aspect ratio.
    */
    @NonNull
    public static final String DISPLAYASPECTRATIO = "DisplayAspectRatio";

   /**
    * Duration of the first frame if it is longer than others, in ms.
    */
    @NonNull
    public static final String DURATIONFIRSTFRAME = "Duration_FirstFrame";

   /**
    * Delay in format: HH:MM:SS.MMM.
    */
    @NonNull
    public static final String DELAYORIGINALSTRING3 = "Delay_Original/String3";

   /**
    * Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @NonNull
    public static final String ENCODEDAPPLICATIONSTRING = "Encoded_Application/String";

   /**
    * Delay in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @NonNull
    public static final String DELAYORIGINALSTRING4 = "Delay_Original/String4";

   /**
    * Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @NonNull
    public static final String DELAYORIGINALSTRING5 = "Delay_Original/String5";

   /**
    * Set if that track should be used if no language found matches the user preference..
    */
    @NonNull
    public static final String FORCED = "Forced";

   /**
    * Stored width.
    */
    @NonNull
    public static final String STOREDWIDTH = "Stored_Width";

   /**
    * Frames per second, denominator.
    */
    @NonNull
    public static final String FRAMERATEORIGINALDEN = "FrameRate_Original_Den";

   /**
    * Last **Inform** call.
    */
    @NonNull
    public static final String INFORM = "Inform";

   /**
    * Settings needed for decoder used, detailled.
    */
    @NonNull
    public static final String FORMATSETTINGSREFFRAMES = "Format_Settings_RefFrames";

   /**
    * Source Duration of the first frame if it is longer than others, in ms.
    */
    @NonNull
    public static final String SOURCEDURATIONFIRSTFRAME = "Source_Duration_FirstFrame";

   /**
    * TimeStamp with measurement.
    */
    @NonNull
    public static final String TIMESTAMPFIRSTFRAMESTRING = "TimeStamp_FirstFrame/String";

   /**
    * Active Format Description (AFD value).
    */
    @NonNull
    public static final String ACTIVEFORMATDESCRIPTION = "ActiveFormatDescription";

   /**
    * ScanOrder_StoredDisplayedInverted.
    */
    @NonNull
    public static final String SCANORDERSTOREDDISPLAYEDINVERTED = "ScanOrder_StoredDisplayedInverted";

   /**
    * Number of the stream (base=0).
    */
    @NonNull
    public static final String STREAMKINDID = "StreamKindID";

   /**
    * Nominal Frames per second (with measurement).
    */
    @NonNull
    public static final String FRAMERATENOMINALSTRING = "FrameRate_Nominal/String";

   /**
    * Link.
    */
    @NonNull
    public static final String FORMATURL = "Format/Url";

   /**
    * Minimum Bit rate (with measurement).
    */
    @NonNull
    public static final String BITRATEMINIMUMSTRING = "BitRate_Minimum/String";

   /**
    * Width (aperture size if present) in pixel.
    */
    @NonNull
    public static final String WIDTH = "Width";

   /**
    * Frames per second (with measurement).
    */
    @NonNull
    public static final String FRAMERATESTRING = "FrameRate/String";

   /**
    * Tier of the Format (only MIXML).
    */
    @NonNull
    public static final String FORMATTIER = "Format_Tier";

   /**
    * Source Number of frames.
    */
    @NonNull
    public static final String SOURCEFRAMECOUNT = "Source_FrameCount";

   /**
    * Settings needed for decoder used, detailled.
    */
    @NonNull
    public static final String FORMATSETTINGSBVOP = "Format_Settings_BVOP";

   /**
    * Set if that track should be used if no language found matches the user preference..
    */
    @NonNull
    public static final String DEFAULT = "Default";

   /**
    * Time code information about Open/Closed of first frame if GOP is Open for the other GOPs.
    */
    @NonNull
    public static final String GOPOPENCLOSEDFIRSTFRAME = "Gop_OpenClosed_FirstFrame";

   /**
    * Time code information about Open/Closed.
    */
    @NonNull
    public static final String GOPOPENCLOSED = "Gop_OpenClosed";

   /**
    * Delay settings (in case of timecode for example).
    */
    @NonNull
    public static final String DELAYORIGINALSETTINGS = "Delay_Original_Settings";

   /**
    * Name of the product.
    */
    @NonNull
    public static final String ENCODEDAPPLICATIONNAME = "Encoded_Application_Name";

   /**
    * The unique ID for this stream, should be copied with stream copy.
    */
    @NonNull
    public static final String UNIQUEIDSTRING = "UniqueID/String";

   /**
    * ScanOrder.
    */
    @NonNull
    public static final String SCANORDER = "ScanOrder";

   /**
    * Profile of the Format (old XML: 'Profile@Level@Tier' format.
    */
    @NonNull
    public static final String FORMATPROFILE = "Format_Profile";

   /**
    * Offset between original height and displayed height in pixel.
    */
    @NonNull
    public static final String HEIGHTOFFSET = "Height_Offset";

   /**
    * ChromaSubsampling_Position.
    */
    @NonNull
    public static final String CHROMASUBSAMPLINGPOSITION = "ChromaSubsampling_Position";

   /**
    * StreamSize_Encoded/String2.
    */
    @NonNull
    public static final String STREAMSIZEENCODEDSTRING2 = "StreamSize_Encoded/String2";

   /**
    * StreamSize_Demuxed/String1.
    */
    @NonNull
    public static final String STREAMSIZEDEMUXEDSTRING1 = "StreamSize_Demuxed/String1";

   /**
    * StreamSize_Encoded/String3.
    */
    @NonNull
    public static final String STREAMSIZEENCODEDSTRING3 = "StreamSize_Encoded/String3";

   /**
    * StreamSize_Demuxed/String2.
    */
    @NonNull
    public static final String STREAMSIZEDEMUXEDSTRING2 = "StreamSize_Demuxed/String2";

   /**
    * StreamSize_Demuxed/String3.
    */
    @NonNull
    public static final String STREAMSIZEDEMUXEDSTRING3 = "StreamSize_Demuxed/String3";

   /**
    * StreamSize_Encoded/String1.
    */
    @NonNull
    public static final String STREAMSIZEENCODEDSTRING1 = "StreamSize_Encoded/String1";

   /**
    * Language (full).
    */
    @NonNull
    public static final String LANGUAGESTRING = "Language/String";

   /**
    * StreamSize_Demuxed/String4.
    */
    @NonNull
    public static final String STREAMSIZEDEMUXEDSTRING4 = "StreamSize_Demuxed/String4";

   /**
    * StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    */
    @NonNull
    public static final String STREAMSIZEDEMUXEDSTRING5 = "StreamSize_Demuxed/String5";

   /**
    * StreamSize_Encoded/String4.
    */
    @NonNull
    public static final String STREAMSIZEENCODEDSTRING4 = "StreamSize_Encoded/String4";

   /**
    * Original (in the raw stream) frames per second (with measurement).
    */
    @NonNull
    public static final String FRAMERATEORIGINALSTRING = "FrameRate_Original/String";

   /**
    * Encoded Streamsize in with percentage value.
    */
    @NonNull
    public static final String STREAMSIZEENCODEDSTRING5 = "StreamSize_Encoded/String5";

   /**
    * Level of the Format (only MIXML).
    */
    @NonNull
    public static final String FORMATLEVEL = "Format_Level";

   /**
    * Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @NonNull
    public static final String DURATIONLASTFRAMESTRING5 = "Duration_LastFrame/String5";

   /**
    * Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @NonNull
    public static final String DURATIONLASTFRAMESTRING4 = "Duration_LastFrame/String4";

   /**
    * Original frame rate mode (CFR, VFR).
    */
    @NonNull
    public static final String FRAMERATEMODEORIGINAL = "FrameRate_Mode_Original";

   /**
    * StreamSize_Demuxed in with percentage value.
    */
    @NonNull
    public static final String STREAMSIZEDEMUXEDSTRING = "StreamSize_Demuxed/String";

   /**
    * Set if that track should be used if no language found matches the user preference..
    */
    @NonNull
    public static final String FORCEDSTRING = "Forced/String";

   /**
    * 16/24/32.
    */
    @NonNull
    public static final String BITDEPTH = "BitDepth";

   /**
    * Encoded Streamsize in bytes.
    */
    @NonNull
    public static final String STREAMSIZEENCODED = "StreamSize_Encoded";

   /**
    * Colour range for YUV colour space.
    */
    @NonNull
    public static final String COLOURRANGE = "colour_range";

   /**
    * Count of streams of that kind available.
    */
    @NonNull
    public static final String STREAMCOUNT = "StreamCount";

   /**
    * Format_Settings_GMC/String.
    */
    @NonNull
    public static final String FORMATSETTINGSGMCSTRING = "Format_Settings_GMC/String";

   /**
    * Original (in the raw stream) Pixel Aspect ratio.
    */
    @NonNull
    public static final String PIXELASPECTRATIOORIGINALSTRING = "PixelAspectRatio_Original/String";

   /**
    * Encoded Streamsize in with percentage value.
    */
    @NonNull
    public static final String STREAMSIZEENCODEDSTRING = "StreamSize_Encoded/String";

   /**
    * Chromaticity coordinates of the source primaries.
    */
    @NonNull
    public static final String COLOURPRIMARIESORIGINAL = "colour_primaries_Original";

   /**
    * Pixel Aspect ratio.
    */
    @NonNull
    public static final String PIXELASPECTRATIOSTRING = "PixelAspectRatio/String";

   /**
    * Play time in format : XXx YYy only, YYy omited if zero.
    */
    @NonNull
    public static final String DURATIONSTRING2 = "Duration/String2";

   /**
    * ScanOrder_Original/String.
    */
    @NonNull
    public static final String SCANORDERORIGINALSTRING = "ScanOrder_Original/String";

   /**
    * Play time in format : HH:MM:SS.MMM.
    */
    @NonNull
    public static final String DURATIONSTRING3 = "Duration/String3";

   /**
    * Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @NonNull
    public static final String DURATIONSTRING1 = "Duration/String1";

   /**
    * Clean Aperture Pixel Aspect ratio.
    */
    @NonNull
    public static final String PIXELASPECTRATIOCLEANAPERTURE = "PixelAspectRatio_CleanAperture";

   /**
    * Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @NonNull
    public static final String DURATIONSTRING4 = "Duration/String4";

   /**
    * Settings needed for decoder used, detailled.
    */
    @NonNull
    public static final String FORMATSETTINGSCABACSTRING = "Format_Settings_CABAC/String";

   /**
    * Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @NonNull
    public static final String DURATIONSTRING5 = "Duration/String5";

   /**
    * Encoded (with forced padding) bit rate in bps, if some container padding is present.
    */
    @NonNull
    public static final String BITRATEENCODED = "BitRate_Encoded";

   /**
    * Settings needed for decoder used, detailled.
    */
    @NonNull
    public static final String FORMATSETTINGSQPEL = "Format_Settings_QPel";

   /**
    * Settings needed for decoder used, detailled (Type of frame, and field/frame info).
    */
    @NonNull
    public static final String FORMATSETTINGSPICTURESTRUCTURE = "Format_Settings_PictureStructure";

   /**
    * Original (in the raw stream) height with measurement (pixel).
    */
    @NonNull
    public static final String HEIGHTORIGINALSTRING = "Height_Original/String";

   /**
    * Delay source (Container or Stream or empty).
    */
    @NonNull
    public static final String DELAYSOURCE = "Delay_Source";

   /**
    * ScanType.
    */
    @NonNull
    public static final String SCANTYPE = "ScanType";

   /**
    * ScanType_StoreMethod_FieldsPerBlock.
    */
    @NonNull
    public static final String SCANTYPESTOREMETHODFIELDSPERBLOCK = "ScanType_StoreMethod_FieldsPerBlock";

   /**
    * Delay drop frame info.
    */
    @NonNull
    public static final String DELAYORIGINALDROPFRAME = "Delay_Original_DropFrame";

   /**
    * Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @NonNull
    public static final String DURATIONLASTFRAMESTRING1 = "Duration_LastFrame/String1";

   /**
    * Delay with measurement.
    */
    @NonNull
    public static final String DELAYORIGINALSTRING = "Delay_Original/String";

   /**
    * Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @NonNull
    public static final String DURATIONLASTFRAMESTRING3 = "Duration_LastFrame/String3";

   /**
    * Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @NonNull
    public static final String DURATIONLASTFRAMESTRING2 = "Duration_LastFrame/String2";

   /**
    * Clean Aperture height in pixel.
    */
    @NonNull
    public static final String HEIGHTCLEANAPERTURE = "Height_CleanAperture";

   /**
    * StreamSize in bytes of hte stream after demux.
    */
    @NonNull
    public static final String STREAMSIZEDEMUXED = "StreamSize_Demuxed";

   /**
    * Settings needed for decoder used, summary.
    */
    @NonNull
    public static final String FORMATSETTINGS = "Format_Settings";

   /**
    * Service kind, e.g. visually impaired, commentary, voice over.
    */
    @NonNull
    public static final String SERVICEKIND = "ServiceKind";

   /**
    * Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    */
    @NonNull
    public static final String FIRSTPACKETORDER = "FirstPacketOrder";

   /**
    * Clean Aperture height with measurement (pixel).
    */
    @NonNull
    public static final String HEIGHTCLEANAPERTURESTRING = "Height_CleanAperture/String";

   /**
    * TimeStamp with measurement.
    */
    @NonNull
    public static final String TIMESTAMPFIRSTFRAMESTRING1 = "TimeStamp_FirstFrame/String1";

   /**
    * TimeStamp in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @NonNull
    public static final String TIMESTAMPFIRSTFRAMESTRING5 = "TimeStamp_FirstFrame/String5";

   /**
    * Clean Aperture Pixel Aspect ratio.
    */
    @NonNull
    public static final String PIXELASPECTRATIOCLEANAPERTURESTRING = "PixelAspectRatio_CleanAperture/String";

   /**
    * TimeStamp in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @NonNull
    public static final String TIMESTAMPFIRSTFRAMESTRING4 = "TimeStamp_FirstFrame/String4";

   /**
    * TimeStamp in format : HH:MM:SS.MMM.
    */
    @NonNull
    public static final String TIMESTAMPFIRSTFRAMESTRING3 = "TimeStamp_FirstFrame/String3";

   /**
    * TimeStamp with measurement.
    */
    @NonNull
    public static final String TIMESTAMPFIRSTFRAMESTRING2 = "TimeStamp_FirstFrame/String2";

   /**
    * Nominal Bit rate (with measurement).
    */
    @NonNull
    public static final String BITRATENOMINALSTRING = "BitRate_Nominal/String";

   /**
    * ScanOrder_Stored.
    */
    @NonNull
    public static final String SCANORDERSTORED = "ScanOrder_Stored";

   /**
    * Format used.
    */
    @NonNull
    public static final String FORMAT = "Format";

   /**
    * Original (in the raw stream) Display Aspect ratio.
    */
    @NonNull
    public static final String DISPLAYASPECTRATIOORIGINALSTRING = "DisplayAspectRatio_Original/String";

   /**
    * Original (in the raw stream) width with measurement (pixel).
    */
    @NonNull
    public static final String WIDTHORIGINALSTRING = "Width_Original/String";

   /**
    * Frames per second, numerator.
    */
    @NonNull
    public static final String FRAMERATEORIGINALNUM = "FrameRate_Original_Num";

   /**
    * Height in pixel.
    */
    @NonNull
    public static final String HEIGHT = "Height";

   /**
    * Codec ID (found in some containers).
    */
    @NonNull
    public static final String CODECIDSTRING = "CodecID/String";

   /**
    * Name of the company.
    */
    @NonNull
    public static final String ENCODEDLIBRARYCOMPANYNAME = "Encoded_Library_CompanyName";

   /**
    * TimeStamp fixed in the stream (relative) IN MS.
    */
    @NonNull
    public static final String TIMESTAMPFIRSTFRAME = "TimeStamp_FirstFrame";

   /**
    * Source Streamsize in bytes.
    */
    @NonNull
    public static final String SOURCESTREAMSIZE = "Source_StreamSize";

   /**
    * Commercial name used by vendor for theses setings or Format field if there is no difference.
    */
    @NonNull
    public static final String FORMATCOMMERCIAL = "Format_Commercial";

   /**
    * Active Format Description (AFD value) muxing mode (Ancillary or Raw stream).
    */
    @NonNull
    public static final String ACTIVEFORMATDESCRIPTIONMUXINGMODE = "ActiveFormatDescription_MuxingMode";

   /**
    * ScanType_Original.
    */
    @NonNull
    public static final String SCANTYPEORIGINAL = "ScanType_Original";

   /**
    * Delay source (Container or Stream or empty).
    */
    @NonNull
    public static final String DELAYSOURCESTRING = "Delay_Source/String";

   /**
    * Opto-electronic transfer characteristic of the source picture.
    */
    @NonNull
    public static final String TRANSFERCHARACTERISTICSORIGINAL = "transfer_characteristics_Original";

   /**
    * Nominal Bit rate in bps.
    */
    @NonNull
    public static final String BITRATENOMINAL = "BitRate_Nominal";

   /**
    * Minimum Bit rate in bps.
    */
    @NonNull
    public static final String BITRATEMINIMUM = "BitRate_Minimum";

   /**
    * Original (in the raw stream) height in pixel.
    */
    @NonNull
    public static final String HEIGHTORIGINAL = "Height_Original";

   /**
    * Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @NonNull
    public static final String SOURCEDURATIONSTRING = "Source_Duration/String";

   /**
    * Matrix coefficients used in deriving luma and chroma signals from the green, blue, and red primaries.
    */
    @NonNull
    public static final String MATRIXCOEFFICIENTS = "matrix_coefficients";

   /**
    * Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    */
    @NonNull
    public static final String BITRATEENCODEDSTRING = "BitRate_Encoded/String";

   /**
    * Stream type name.
    */
    @NonNull
    public static final String STREAMKINDSTRING = "StreamKind/String";

   /**
    * ChromaSubsampling.
    */
    @NonNull
    public static final String CHROMASUBSAMPLING = "ChromaSubsampling";

   /**
    * Time code information about Open/Closed.
    */
    @NonNull
    public static final String GOPOPENCLOSEDSTRING = "Gop_OpenClosed/String";

   /**
    * Settings needed for decoder used, detailled.
    */
    @NonNull
    public static final String FORMATSETTINGSQPELSTRING = "Format_Settings_QPel/String";

   /**
    * Version of the product.
    */
    @NonNull
    public static final String ENCODEDAPPLICATIONVERSION = "Encoded_Application_Version";

   /**
    * The menu ID for this stream in this file.
    */
    @NonNull
    public static final String MENUID = "MenuID";

   /**
    * Number of a group in order to provide versions of the same track.
    */
    @NonNull
    public static final String ALTERNATEGROUPSTRING = "AlternateGroup/String";

   /**
    * Settings needed for decoder used, detailled.
    */
    @NonNull
    public static final String FORMATSETTINGSCABAC = "Format_Settings_CABAC";

   /**
    * Pixel Aspect ratio.
    */
    @NonNull
    public static final String PIXELASPECTRATIO = "PixelAspectRatio";

}
