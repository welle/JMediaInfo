package aka.jmediainfo;

import org.eclipse.jdt.annotation.NonNull;

/**
 * Video constants parameters
 *
 */
public final class Video {

/**
 * : Count of objects available in this stream
 */
@NonNull
public static final String Count = "Count";
/**
 * : bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished)
 */
@NonNull
public static final String Status = "Status";
/**
 * : Count of streams of that kind available
 */
@NonNull
public static final String StreamCount = "StreamCount";
/**
 * : Stream type name
 */
@NonNull
public static final String StreamKind = "StreamKind";
/**
 * : Stream type name
 */
@NonNull
public static final String StreamKind_String = "StreamKind/String";
/**
 * : Number of the stream (base=0)
 */
@NonNull
public static final String StreamKindID = "StreamKindID";
/**
 * : When multiple streams, number of the stream (base=1)
 */
@NonNull
public static final String StreamKindPos = "StreamKindPos";
/**
 * : Stream order in the file, whatever is the kind of stream (base=0)
 */
@NonNull
public static final String StreamOrder = "StreamOrder";
/**
 * : Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0)
 */
@NonNull
public static final String FirstPacketOrder = "FirstPacketOrder";
/**
 * : Last **Inform** call
 */
@NonNull
public static final String Inform = "Inform";
/**
 * : The ID for this stream in this file
 */
@NonNull
public static final String ID = "ID";
/**
 * : The ID for this stream in this file
 */
@NonNull
public static final String ID_String = "ID/String";
/**
 * : The ID for this stream in the original medium of the material
 */
@NonNull
public static final String OriginalSourceMedium_ID = "OriginalSourceMedium_ID";
/**
 * : The ID for this stream in the original medium of the material
 */
@NonNull
public static final String OriginalSourceMedium_ID_S = "OriginalSourceMedium_ID/S";
/**
 * : The unique ID for this stream, should be copied with stream copy
 */
@NonNull
public static final String UniqueID = "UniqueID";
/**
 * : The unique ID for this stream, should be copied with stream copy
 */
@NonNull
public static final String UniqueID_String = "UniqueID/String";
/**
 * : The menu ID for this stream in this file
 */
@NonNull
public static final String MenuID = "MenuID";
/**
 * : The menu ID for this stream in this file
 */
@NonNull
public static final String MenuID_String = "MenuID/String";
/**
 * : Format used
 */
@NonNull
public static final String Format = "Format";
/**
 * : Info about Format
 */
@NonNull
public static final String Format_Info = "Format/Info";
/**
 * : Link
 */
@NonNull
public static final String Format_Url = "Format/Url";
/**
 * : Commercial name used by vendor for theses setings or Format field if there is no difference
 */
@NonNull
public static final String Format_Commercial = "Format_Commercial";
/**
 * : Commercial name used by vendor for theses setings if there is one
 */
@NonNull
public static final String Format_Commercial_IfAny = "Format_Commercial_IfAny";
/**
 * : Version of this format
 */
@NonNull
public static final String Format_Version = "Format_Version";
/**
 * : Profile of the Format
 */
@NonNull
public static final String Format_Profile = "Format_Profile";
/**
 * : Compression mode of the Format
 */
@NonNull
public static final String Format_Compression = "Format_Compression";
/**
 * : Multiview, profile of the base stream
 */
@NonNull
public static final String MultiView_BaseProfile = "MultiView_BaseProfile";
/**
 * : Multiview, count of views
 */
@NonNull
public static final String MultiView_Count = "MultiView_Count";
/**
 * : Multiview, how views are muxed in the container in case of it is not muxing in the stream
 */
@NonNull
public static final String MultiView_Layout = "MultiView_Layout";
/**
 * : Settings needed for decoder used, summary
 */
@NonNull
public static final String Format_Settings = "Format_Settings";
/**
 * : Settings needed for decoder used, detailled
 */
@NonNull
public static final String Format_Settings_BVOP = "Format_Settings_BVOP";
/**
 * : Settings needed for decoder used, detailled
 */
@NonNull
public static final String Format_Settings_BVOP_Stri = "Format_Settings_BVOP/Stri";
/**
 * : Settings needed for decoder used, detailled
 */
@NonNull
public static final String Format_Settings_QPel = "Format_Settings_QPel";
/**
 * : Settings needed for decoder used, detailled
 */
@NonNull
public static final String Format_Settings_QPel_Stri = "Format_Settings_QPel/Stri";
/**
 * : Settings needed for decoder used, detailled
 */
@NonNull
public static final String Format_Settings_GMC = "Format_Settings_GMC";
/**
 * Format_Settings_GMC/String
 */
@NonNull
public static final String Format_Settings_GMC_String = "Format_Settings_GMC/String";
/**
 * : Settings needed for decoder used, detailled
 */
@NonNull
public static final String Format_Settings_Matrix = "Format_Settings_Matrix";
/**
 * : Settings needed for decoder used, detailled
 */
@NonNull
public static final String Format_Settings_Matrix_St = "Format_Settings_Matrix/St";
/**
 * : Matrix, in binary format encoded BASE64. Order = intra, non-intra, gray intra, gray non-intra
 */
@NonNull
public static final String Format_Settings_Matrix_Da = "Format_Settings_Matrix_Da";
/**
 * : Settings needed for decoder used, detailled
 */
@NonNull
public static final String Format_Settings_CABAC = "Format_Settings_CABAC";
/**
 * : Settings needed for decoder used, detailled
 */
@NonNull
public static final String Format_Settings_CABAC_Str = "Format_Settings_CABAC/Str";
/**
 * : Settings needed for decoder used, detailled
 */
@NonNull
public static final String Format_Settings_RefFrames = "Format_Settings_RefFrames";
/**
 * : Settings needed for decoder used, detailled
 */
@NonNull
public static final String Format_Settings_RefFrames = "Format_Settings_RefFrames";
/**
 * : Settings needed for decoder used, detailled
 */
@NonNull
public static final String Format_Settings_Pulldown = "Format_Settings_Pulldown";
/**
 * : Settings needed for decoder used, detailled
 */
@NonNull
public static final String Format_Settings_FrameMode = "Format_Settings_FrameMode";
/**
 * : Settings needed for decoder used, detailled (M=x N=y)
 */
@NonNull
public static final String Format_Settings_GOP = "Format_Settings_GOP";
/**
 * : Settings needed for decoder used, detailled (Type of frame, and field/frame info)
 */
@NonNull
public static final String Format_Settings_PictureSt = "Format_Settings_PictureSt";
/**
 * : Wrapping mode (Frame wrapped or Clip wrapped)
 */
@NonNull
public static final String Format_Settings_Wrapping = "Format_Settings_Wrapping";
/**
 * : Internet Media Type (aka MIME Type, Content-Type)
 */
@NonNull
public static final String InternetMediaType = "InternetMediaType";
/**
 * : How this file is muxed in the container
 */
@NonNull
public static final String MuxingMode = "MuxingMode";
/**
 * : Codec ID (found in some containers)
 */
@NonNull
public static final String CodecID = "CodecID";
/**
 * : Codec ID (found in some containers)
 */
@NonNull
public static final String CodecID_String = "CodecID/String";
/**
 * : Info on the codec
 */
@NonNull
public static final String CodecID_Info = "CodecID/Info";
/**
 * : Hint/popular name for this codec
 */
@NonNull
public static final String CodecID_Hint = "CodecID/Hint";
/**
 * : Homepage for more details about this codec
 */
@NonNull
public static final String CodecID_Url = "CodecID/Url";
/**
 * : Manual description given by the container
 */
@NonNull
public static final String CodecID_Description = "CodecID_Description";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Codec = "Codec";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Codec_String = "Codec/String";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Codec_Family = "Codec/Family";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Codec_Info = "Codec/Info";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Codec_Url = "Codec/Url";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Codec_CC = "Codec/CC";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Codec_Profile = "Codec_Profile";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Codec_Description = "Codec_Description";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Codec_Settings = "Codec_Settings";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Codec_Settings_PacketBitS = "Codec_Settings_PacketBitS";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Codec_Settings_BVOP = "Codec_Settings_BVOP";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Codec_Settings_QPel = "Codec_Settings_QPel";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Codec_Settings_GMC = "Codec_Settings_GMC";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Codec_Settings_GMC_String = "Codec_Settings_GMC/String";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Codec_Settings_Matrix = "Codec_Settings_Matrix";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Codec_Settings_Matrix_Dat = "Codec_Settings_Matrix_Dat";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Codec_Settings_CABAC = "Codec_Settings_CABAC";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Codec_Settings_RefFrames = "Codec_Settings_RefFrames";
/**
 * : Play time of the stream in ms
 */
@NonNull
public static final String Duration = "Duration";
/**
 * : Play time in format : XXx YYy only, YYy omited if zero
 */
@NonNull
public static final String Duration_String = "Duration/String";
/**
 * : Play time in format : HHh MMmn SSs MMMms, XX omited if zero
 */
@NonNull
public static final String Duration_String1 = "Duration/String1";
/**
 * : Play time in format : XXx YYy only, YYy omited if zero
 */
@NonNull
public static final String Duration_String2 = "Duration/String2";
/**
 * : Play time in format : HH:MM:SS.MMM
 */
@NonNull
public static final String Duration_String3 = "Duration/String3";
/**
 * : Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available
 */
@NonNull
public static final String Duration_String4 = "Duration/String4";
/**
 * : Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF)
 */
@NonNull
public static final String Duration_String5 = "Duration/String5";
/**
 * : Duration of the first frame if it is longer than others, in ms
 */
@NonNull
public static final String Duration_FirstFrame = "Duration_FirstFrame";
/**
 * : Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero
 */
@NonNull
public static final String Duration_FirstFrame_Strin = "Duration_FirstFrame/Strin";
/**
 * : Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero
 */
@NonNull
public static final String Duration_FirstFrame_Strin = "Duration_FirstFrame/Strin";
/**
 * : Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero
 */
@NonNull
public static final String Duration_FirstFrame_Strin = "Duration_FirstFrame/Strin";
/**
 * : Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM
 */
@NonNull
public static final String Duration_FirstFrame_Strin = "Duration_FirstFrame/Strin";
/**
 * : Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available
 */
@NonNull
public static final String Duration_FirstFrame_Strin = "Duration_FirstFrame/Strin";
/**
 * : Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF)
 */
@NonNull
public static final String Duration_FirstFrame_Strin = "Duration_FirstFrame/Strin";
/**
 * : Duration of the last frame if it is longer than others, in ms
 */
@NonNull
public static final String Duration_LastFrame = "Duration_LastFrame";
/**
 * : Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero
 */
@NonNull
public static final String Duration_LastFrame_String = "Duration_LastFrame/String";
/**
 * : Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero
 */
@NonNull
public static final String Duration_LastFrame_String = "Duration_LastFrame/String";
/**
 * : Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero
 */
@NonNull
public static final String Duration_LastFrame_String = "Duration_LastFrame/String";
/**
 * : Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM
 */
@NonNull
public static final String Duration_LastFrame_String = "Duration_LastFrame/String";
/**
 * : Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available
 */
@NonNull
public static final String Duration_LastFrame_String = "Duration_LastFrame/String";
/**
 * : Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF)
 */
@NonNull
public static final String Duration_LastFrame_String = "Duration_LastFrame/String";
/**
 * : Source Play time of the stream, in ms
 */
@NonNull
public static final String Source_Duration = "Source_Duration";
/**
 * : Source Play time in format : XXx YYy only, YYy omited if zero
 */
@NonNull
public static final String Source_Duration_String = "Source_Duration/String";
/**
 * : Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero
 */
@NonNull
public static final String Source_Duration_String1 = "Source_Duration/String1";
/**
 * : Source Play time in format : XXx YYy only, YYy omited if zero
 */
@NonNull
public static final String Source_Duration_String2 = "Source_Duration/String2";
/**
 * : Source Play time in format : HH:MM:SS.MMM
 */
@NonNull
public static final String Source_Duration_String3 = "Source_Duration/String3";
/**
 * : Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available
 */
@NonNull
public static final String Source_Duration_String4 = "Source_Duration/String4";
/**
 * : Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF)
 */
@NonNull
public static final String Source_Duration_String5 = "Source_Duration/String5";
/**
 * : Source Duration of the first frame if it is longer than others, in ms
 */
@NonNull
public static final String Source_Duration_FirstFram = "Source_Duration_FirstFram";
/**
 * : Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero
 */
@NonNull
public static final String Source_Duration_FirstFram = "Source_Duration_FirstFram";
/**
 * : Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero
 */
@NonNull
public static final String Source_Duration_FirstFram = "Source_Duration_FirstFram";
/**
 * : Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero
 */
@NonNull
public static final String Source_Duration_FirstFram = "Source_Duration_FirstFram";
/**
 * : Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM
 */
@NonNull
public static final String Source_Duration_FirstFram = "Source_Duration_FirstFram";
/**
 * : Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available
 */
@NonNull
public static final String Source_Duration_FirstFram = "Source_Duration_FirstFram";
/**
 * : Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF)
 */
@NonNull
public static final String Source_Duration_FirstFram = "Source_Duration_FirstFram";
/**
 * : Source Duration of the last frame if it is longer than others, in ms
 */
@NonNull
public static final String Source_Duration_LastFrame = "Source_Duration_LastFrame";
/**
 * : Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero
 */
@NonNull
public static final String Source_Duration_LastFrame = "Source_Duration_LastFrame";
/**
 * : Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero
 */
@NonNull
public static final String Source_Duration_LastFrame = "Source_Duration_LastFrame";
/**
 * : Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero
 */
@NonNull
public static final String Source_Duration_LastFrame = "Source_Duration_LastFrame";
/**
 * : Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM
 */
@NonNull
public static final String Source_Duration_LastFrame = "Source_Duration_LastFrame";
/**
 * : Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available
 */
@NonNull
public static final String Source_Duration_LastFrame = "Source_Duration_LastFrame";
/**
 * : Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF)
 */
@NonNull
public static final String Source_Duration_LastFrame = "Source_Duration_LastFrame";
/**
 * : Bit rate mode (VBR, CBR)
 */
@NonNull
public static final String BitRate_Mode = "BitRate_Mode";
/**
 * : Bit rate mode (Variable, Cconstant)
 */
@NonNull
public static final String BitRate_Mode_String = "BitRate_Mode/String";
/**
 * : Bit rate in bps
 */
@NonNull
public static final String BitRate = "BitRate";
/**
 * : Bit rate (with measurement)
 */
@NonNull
public static final String BitRate_String = "BitRate/String";
/**
 * : Minimum Bit rate in bps
 */
@NonNull
public static final String BitRate_Minimum = "BitRate_Minimum";
/**
 * : Minimum Bit rate (with measurement)
 */
@NonNull
public static final String BitRate_Minimum_String = "BitRate_Minimum/String";
/**
 * : Nominal Bit rate in bps
 */
@NonNull
public static final String BitRate_Nominal = "BitRate_Nominal";
/**
 * : Nominal Bit rate (with measurement)
 */
@NonNull
public static final String BitRate_Nominal_String = "BitRate_Nominal/String";
/**
 * : Maximum Bit rate in bps
 */
@NonNull
public static final String BitRate_Maximum = "BitRate_Maximum";
/**
 * : Maximum Bit rate (with measurement)
 */
@NonNull
public static final String BitRate_Maximum_String = "BitRate_Maximum/String";
/**
 * : Encoded (with forced padding) bit rate in bps, if some container padding is present
 */
@NonNull
public static final String BitRate_Encoded = "BitRate_Encoded";
/**
 * : Encoded (with forced padding) bit rate (with measurement), if some container padding is present
 */
@NonNull
public static final String BitRate_Encoded_String = "BitRate_Encoded/String";
/**
 * : Width (aperture size if present) in pixel
 */
@NonNull
public static final String Width = "Width";
/**
 * : Width (aperture size if present) with measurement (pixel)
 */
@NonNull
public static final String Width_String = "Width/String";
/**
 * : Offset between original width and displayed width in pixel
 */
@NonNull
public static final String Width_Offset = "Width_Offset";
/**
 * : Offset between original width and displayed width in pixel
 */
@NonNull
public static final String Width_Offset_String = "Width_Offset/String";
/**
 * : Original (in the raw stream) width in pixel
 */
@NonNull
public static final String Width_Original = "Width_Original";
/**
 * : Original (in the raw stream) width with measurement (pixel)
 */
@NonNull
public static final String Width_Original_String = "Width_Original/String";
/**
 * : Clean Aperture width in pixel
 */
@NonNull
public static final String Width_CleanAperture = "Width_CleanAperture";
/**
 * : Clean Aperture width with measurement (pixel)
 */
@NonNull
public static final String Width_CleanAperture_Strin = "Width_CleanAperture/Strin";
/**
 * : Height in pixel
 */
@NonNull
public static final String Height = "Height";
/**
 * : Height with measurement (pixel)
 */
@NonNull
public static final String Height_String = "Height/String";
/**
 * : Offset between original height and displayed height in pixel
 */
@NonNull
public static final String Height_Offset = "Height_Offset";
/**
 * : Offset between original height and displayed height  in pixel
 */
@NonNull
public static final String Height_Offset_String = "Height_Offset/String";
/**
 * : Original (in the raw stream) height in pixel
 */
@NonNull
public static final String Height_Original = "Height_Original";
/**
 * : Original (in the raw stream) height with measurement (pixel)
 */
@NonNull
public static final String Height_Original_String = "Height_Original/String";
/**
 * : Clean Aperture height in pixel
 */
@NonNull
public static final String Height_CleanAperture = "Height_CleanAperture";
/**
 * : Clean Aperture height with measurement (pixel)
 */
@NonNull
public static final String Height_CleanAperture_Stri = "Height_CleanAperture/Stri";
/**
 * : Stored width
 */
@NonNull
public static final String Stored_Width = "Stored_Width";
/**
 * : Stored height
 */
@NonNull
public static final String Stored_Height = "Stored_Height";
/**
 * : Sampled width
 */
@NonNull
public static final String Sampled_Width = "Sampled_Width";
/**
 * : Sampled height
 */
@NonNull
public static final String Sampled_Height = "Sampled_Height";
/**
 * : Pixel Aspect ratio
 */
@NonNull
public static final String PixelAspectRatio = "PixelAspectRatio";
/**
 * : Pixel Aspect ratio
 */
@NonNull
public static final String PixelAspectRatio_String = "PixelAspectRatio/String";
/**
 * : Original (in the raw stream) Pixel Aspect ratio
 */
@NonNull
public static final String PixelAspectRatio_Original = "PixelAspectRatio_Original";
/**
 * : Original (in the raw stream) Pixel Aspect ratio
 */
@NonNull
public static final String PixelAspectRatio_Original = "PixelAspectRatio_Original";
/**
 * : Clean Aperture Pixel Aspect ratio
 */
@NonNull
public static final String PixelAspectRatio_CleanApe = "PixelAspectRatio_CleanApe";
/**
 * : Clean Aperture Pixel Aspect ratio
 */
@NonNull
public static final String PixelAspectRatio_CleanApe = "PixelAspectRatio_CleanApe";
/**
 * : Display Aspect ratio
 */
@NonNull
public static final String DisplayAspectRatio = "DisplayAspectRatio";
/**
 * : Display Aspect ratio
 */
@NonNull
public static final String DisplayAspectRatio_String = "DisplayAspectRatio/String";
/**
 * : Original (in the raw stream) Display Aspect ratio
 */
@NonNull
public static final String DisplayAspectRatio_Origin = "DisplayAspectRatio_Origin";
/**
 * : Original (in the raw stream) Display Aspect ratio
 */
@NonNull
public static final String DisplayAspectRatio_Origin = "DisplayAspectRatio_Origin";
/**
 * : Clean Aperture Display Aspect ratio
 */
@NonNull
public static final String DisplayAspectRatio_CleanA = "DisplayAspectRatio_CleanA";
/**
 * : Clean Aperture Display Aspect ratio
 */
@NonNull
public static final String DisplayAspectRatio_CleanA = "DisplayAspectRatio_CleanA";
/**
 * : Active Format Description (AFD value)
 */
@NonNull
public static final String ActiveFormatDescription = "ActiveFormatDescription";
/**
 * : Active Format Description (text)
 */
@NonNull
public static final String ActiveFormatDescription_S = "ActiveFormatDescription/S";
/**
 * : Active Format Description (AFD value) muxing mode (Ancillary or Raw stream)
 */
@NonNull
public static final String ActiveFormatDescription_M = "ActiveFormatDescription_M";
/**
 * : Rotation
 */
@NonNull
public static final String Rotation = "Rotation";
/**
 * : Rotation (if not horizontal)
 */
@NonNull
public static final String Rotation_String = "Rotation/String";
/**
 * : Frame rate mode (CFR, VFR)
 */
@NonNull
public static final String FrameRate_Mode = "FrameRate_Mode";
/**
 * : Frame rate mode (Constant, Variable)
 */
@NonNull
public static final String FrameRate_Mode_String = "FrameRate_Mode/String";
/**
 * : Original frame rate mode (CFR, VFR)
 */
@NonNull
public static final String FrameRate_Mode_Original = "FrameRate_Mode_Original";
/**
 * : Original frame rate mode (Constant, Variable)
 */
@NonNull
public static final String FrameRate_Mode_Original_S = "FrameRate_Mode_Original/S";
/**
 * : Frames per second
 */
@NonNull
public static final String FrameRate = "FrameRate";
/**
 * : Frames per second (with measurement)
 */
@NonNull
public static final String FrameRate_String = "FrameRate/String";
/**
 * : Frames per second, numerator
 */
@NonNull
public static final String FrameRate_Num = "FrameRate_Num";
/**
 * : Frames per second, denominator
 */
@NonNull
public static final String FrameRate_Den = "FrameRate_Den";
/**
 * : Minimum Frames per second
 */
@NonNull
public static final String FrameRate_Minimum = "FrameRate_Minimum";
/**
 * : Minimum Frames per second (with measurement)
 */
@NonNull
public static final String FrameRate_Minimum_String = "FrameRate_Minimum/String";
/**
 * : Nominal Frames per second
 */
@NonNull
public static final String FrameRate_Nominal = "FrameRate_Nominal";
/**
 * : Nominal Frames per second (with measurement)
 */
@NonNull
public static final String FrameRate_Nominal_String = "FrameRate_Nominal/String";
/**
 * : Maximum Frames per second
 */
@NonNull
public static final String FrameRate_Maximum = "FrameRate_Maximum";
/**
 * : Maximum Frames per second (with measurement)
 */
@NonNull
public static final String FrameRate_Maximum_String = "FrameRate_Maximum/String";
/**
 * : Original (in the raw stream) frames per second
 */
@NonNull
public static final String FrameRate_Original = "FrameRate_Original";
/**
 * : Original (in the raw stream) frames per second (with measurement)
 */
@NonNull
public static final String FrameRate_Original_String = "FrameRate_Original/String";
/**
 * : Frames per second, numerator
 */
@NonNull
public static final String FrameRate_Original_Num = "FrameRate_Original_Num";
/**
 * : Frames per second, denominator
 */
@NonNull
public static final String FrameRate_Original_Den = "FrameRate_Original_Den";
/**
 * : Number of frames
 */
@NonNull
public static final String FrameCount = "FrameCount";
/**
 * : Source Number of frames
 */
@NonNull
public static final String Source_FrameCount = "Source_FrameCount";
/**
 * : NTSC or PAL
 */
@NonNull
public static final String Standard = "Standard";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Resolution = "Resolution";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Resolution_String = "Resolution/String";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Colorimetry = "Colorimetry";
/**
 * ColorSpace
 */
@NonNull
public static final String ColorSpace = "ColorSpace";
/**
 * ChromaSubsampling
 */
@NonNull
public static final String ChromaSubsampling = "ChromaSubsampling";
/**
 * ChromaSubsampling/String
 */
@NonNull
public static final String ChromaSubsampling_String = "ChromaSubsampling/String";
/**
 * ChromaSubsampling_Position
 */
@NonNull
public static final String ChromaSubsampling_Position = "ChromaSubsampling_Position";
/**
 * : 16/24/32
 */
@NonNull
public static final String BitDepth = "BitDepth";
/**
 * : 16/24/32 bits
 */
@NonNull
public static final String BitDepth_String = "BitDepth/String";
/**
 * ScanType
 */
@NonNull
public static final String ScanType = "ScanType";
/**
 * ScanType/String
 */
@NonNull
public static final String ScanType_String = "ScanType/String";
/**
 * ScanType_Original
 */
@NonNull
public static final String ScanType_Original = "ScanType_Original";
/**
 * ScanType_Original/String
 */
@NonNull
public static final String ScanType_Original_String = "ScanType_Original/String";
/**
 * ScanType_StoreMethod
 */
@NonNull
public static final String ScanType_StoreMethod = "ScanType_StoreMethod";
/**
 * ScanType_StoreMethod_FieldsPerBlock
 */
@NonNull
public static final String ScanType_StoreMethod_FieldsPerBlock = "ScanType_StoreMethod_FieldsPerBlock";
/**
 * ScanType_StoreMethod/String
 */
@NonNull
public static final String ScanType_StoreMethod_String = "ScanType_StoreMethod/String";
/**
 * ScanOrder
 */
@NonNull
public static final String ScanOrder = "ScanOrder";
/**
 * ScanOrder/String
 */
@NonNull
public static final String ScanOrder_String = "ScanOrder/String";
/**
 * ScanOrder_Stored
 */
@NonNull
public static final String ScanOrder_Stored = "ScanOrder_Stored";
/**
 * ScanOrder_Stored/String
 */
@NonNull
public static final String ScanOrder_Stored_String = "ScanOrder_Stored/String";
/**
 * ScanOrder_StoredDisplayedInverted
 */
@NonNull
public static final String ScanOrder_StoredDisplayedInverted = "ScanOrder_StoredDisplayedInverted";
/**
 * ScanOrder_Original
 */
@NonNull
public static final String ScanOrder_Original = "ScanOrder_Original";
/**
 * ScanOrder_Original/String
 */
@NonNull
public static final String ScanOrder_Original_String = "ScanOrder_Original/String";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Interlacement = "Interlacement";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Interlacement_String = "Interlacement/String";
/**
 * : Compression mode (Lossy or Lossless)
 */
@NonNull
public static final String Compression_Mode = "Compression_Mode";
/**
 * : Compression mode (Lossy or Lossless)
 */
@NonNull
public static final String Compression_Mode_String = "Compression_Mode/String";
/**
 * : Current stream size divided by uncompressed stream size
 */
@NonNull
public static final String Compression_Ratio = "Compression_Ratio";
/**
 * : bits/(Pixel*Frame) (like Gordian Knot)
 */
@NonNull
public static final String Bits-(Pixel*Frame) = "Bits-(Pixel*Frame)";
/**
 * : Delay fixed in the stream (relative) IN MS
 */
@NonNull
public static final String Delay = "Delay";
/**
 * : Delay with measurement
 */
@NonNull
public static final String Delay_String = "Delay/String";
/**
 * : Delay with measurement
 */
@NonNull
public static final String Delay_String1 = "Delay/String1";
/**
 * : Delay with measurement
 */
@NonNull
public static final String Delay_String2 = "Delay/String2";
/**
 * : Delay in format : HH:MM:SS.MMM
 */
@NonNull
public static final String Delay_String3 = "Delay/String3";
/**
 * : Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available
 */
@NonNull
public static final String Delay_String4 = "Delay/String4";
/**
 * : Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF)
 */
@NonNull
public static final String Delay_String5 = "Delay/String5";
/**
 * : Delay settings (in case of timecode for example)
 */
@NonNull
public static final String Delay_Settings = "Delay_Settings";
/**
 * : Delay drop frame
 */
@NonNull
public static final String Delay_DropFrame = "Delay_DropFrame";
/**
 * : Delay source (Container or Stream or empty)
 */
@NonNull
public static final String Delay_Source = "Delay_Source";
/**
 * : Delay source (Container or Stream or empty)
 */
@NonNull
public static final String Delay_Source_String = "Delay_Source/String";
/**
 * : Delay fixed in the raw stream (relative) IN MS
 */
@NonNull
public static final String Delay_Original = "Delay_Original";
/**
 * : Delay with measurement
 */
@NonNull
public static final String Delay_Original_String = "Delay_Original/String";
/**
 * : Delay with measurement
 */
@NonNull
public static final String Delay_Original_String1 = "Delay_Original/String1";
/**
 * : Delay with measurement
 */
@NonNull
public static final String Delay_Original_String2 = "Delay_Original/String2";
/**
 * : Delay in format: HH:MM:SS.MMM
 */
@NonNull
public static final String Delay_Original_String3 = "Delay_Original/String3";
/**
 * : Delay in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available
 */
@NonNull
public static final String Delay_Original_String4 = "Delay_Original/String4";
/**
 * : Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF)
 */
@NonNull
public static final String Delay_Original_String5 = "Delay_Original/String5";
/**
 * : Delay settings (in case of timecode for example)
 */
@NonNull
public static final String Delay_Original_Settings = "Delay_Original_Settings";
/**
 * : Delay drop frame info
 */
@NonNull
public static final String Delay_Original_DropFrame = "Delay_Original_DropFrame";
/**
 * : Delay source (Stream or empty)
 */
@NonNull
public static final String Delay_Original_Source = "Delay_Original_Source";
/**
 * : TimeStamp fixed in the stream (relative) IN MS
 */
@NonNull
public static final String TimeStamp_FirstFrame = "TimeStamp_FirstFrame";
/**
 * : TimeStamp with measurement
 */
@NonNull
public static final String TimeStamp_FirstFrame_Stri = "TimeStamp_FirstFrame/Stri";
/**
 * : TimeStamp with measurement
 */
@NonNull
public static final String TimeStamp_FirstFrame_Stri = "TimeStamp_FirstFrame/Stri";
/**
 * : TimeStamp with measurement
 */
@NonNull
public static final String TimeStamp_FirstFrame_Stri = "TimeStamp_FirstFrame/Stri";
/**
 * : TimeStamp in format : HH:MM:SS.MMM
 */
@NonNull
public static final String TimeStamp_FirstFrame_Stri = "TimeStamp_FirstFrame/Stri";
/**
 * : TimeStamp in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available
 */
@NonNull
public static final String TimeStamp_FirstFrame_Stri = "TimeStamp_FirstFrame/Stri";
/**
 * : TimeStamp in format : HH:MM:SS.mmm (HH:MM:SS:FF)
 */
@NonNull
public static final String TimeStamp_FirstFrame_Stri = "TimeStamp_FirstFrame/Stri";
/**
 * : Time code in HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available format
 */
@NonNull
public static final String TimeCode_FirstFrame = "TimeCode_FirstFrame";
/**
 * : Time code settings
 */
@NonNull
public static final String TimeCode_Settings = "TimeCode_Settings";
/**
 * : Time code source (Container, Stream, SystemScheme1, SDTI, ANC...)
 */
@NonNull
public static final String TimeCode_Source = "TimeCode_Source";
/**
 * : Time code information about Open/Closed
 */
@NonNull
public static final String Gop_OpenClosed = "Gop_OpenClosed";
/**
 * : Time code information about Open/Closed
 */
@NonNull
public static final String Gop_OpenClosed_String = "Gop_OpenClosed/String";
/**
 * : Time code information about Open/Closed of first frame if GOP is Open for the other GOPs
 */
@NonNull
public static final String Gop_OpenClosed_FirstFrame = "Gop_OpenClosed_FirstFrame";
/**
 * : Time code information about Open/Closed of first frame if GOP is Open for the other GOPs
 */
@NonNull
public static final String Gop_OpenClosed_FirstFrame = "Gop_OpenClosed_FirstFrame";
/**
 * : Streamsize in bytes
 */
@NonNull
public static final String StreamSize = "StreamSize";
/**
 * : Streamsize in with percentage value
 */
@NonNull
public static final String StreamSize_String = "StreamSize/String";
/**
 * StreamSize/String1
 */
@NonNull
public static final String StreamSize_String1 = "StreamSize/String1";
/**
 * StreamSize/String2
 */
@NonNull
public static final String StreamSize_String2 = "StreamSize/String2";
/**
 * StreamSize/String3
 */
@NonNull
public static final String StreamSize_String3 = "StreamSize/String3";
/**
 * StreamSize/String4
 */
@NonNull
public static final String StreamSize_String4 = "StreamSize/String4";
/**
 * : Streamsize in with percentage value
 */
@NonNull
public static final String StreamSize_String5 = "StreamSize/String5";
/**
 * : Stream size divided by file size
 */
@NonNull
public static final String StreamSize_Proportion = "StreamSize_Proportion";
/**
 * : StreamSize in bytes of hte stream after demux
 */
@NonNull
public static final String StreamSize_Demuxed = "StreamSize_Demuxed";
/**
 * : StreamSize_Demuxed in with percentage value
 */
@NonNull
public static final String StreamSize_Demuxed_String = "StreamSize_Demuxed/String";
/**
 * StreamSize_Demuxed/String1
 */
@NonNull
public static final String StreamSize_Demuxed_String1 = "StreamSize_Demuxed/String1";
/**
 * StreamSize_Demuxed/String2
 */
@NonNull
public static final String StreamSize_Demuxed_String2 = "StreamSize_Demuxed/String2";
/**
 * StreamSize_Demuxed/String3
 */
@NonNull
public static final String StreamSize_Demuxed_String3 = "StreamSize_Demuxed/String3";
/**
 * StreamSize_Demuxed/String4
 */
@NonNull
public static final String StreamSize_Demuxed_String4 = "StreamSize_Demuxed/String4";
/**
 * : StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use)
 */
@NonNull
public static final String StreamSize_Demuxed_String = "StreamSize_Demuxed/String";
/**
 * : Source Streamsize in bytes
 */
@NonNull
public static final String Source_StreamSize = "Source_StreamSize";
/**
 * : Source Streamsize in with percentage value
 */
@NonNull
public static final String Source_StreamSize_String = "Source_StreamSize/String";
/**
 * Source_StreamSize/String1
 */
@NonNull
public static final String Source_StreamSize_String1 = "Source_StreamSize/String1";
/**
 * Source_StreamSize/String2
 */
@NonNull
public static final String Source_StreamSize_String2 = "Source_StreamSize/String2";
/**
 * Source_StreamSize/String3
 */
@NonNull
public static final String Source_StreamSize_String3 = "Source_StreamSize/String3";
/**
 * Source_StreamSize/String4
 */
@NonNull
public static final String Source_StreamSize_String4 = "Source_StreamSize/String4";
/**
 * : Source Streamsize in with percentage value
 */
@NonNull
public static final String Source_StreamSize_String5 = "Source_StreamSize/String5";
/**
 * : Source Stream size divided by file size
 */
@NonNull
public static final String Source_StreamSize_Proport = "Source_StreamSize_Proport";
/**
 * : Encoded Streamsize in bytes
 */
@NonNull
public static final String StreamSize_Encoded = "StreamSize_Encoded";
/**
 * : Encoded Streamsize in with percentage value
 */
@NonNull
public static final String StreamSize_Encoded_String = "StreamSize_Encoded/String";
/**
 * StreamSize_Encoded/String1
 */
@NonNull
public static final String StreamSize_Encoded_String1 = "StreamSize_Encoded/String1";
/**
 * StreamSize_Encoded/String2
 */
@NonNull
public static final String StreamSize_Encoded_String2 = "StreamSize_Encoded/String2";
/**
 * StreamSize_Encoded/String3
 */
@NonNull
public static final String StreamSize_Encoded_String3 = "StreamSize_Encoded/String3";
/**
 * StreamSize_Encoded/String4
 */
@NonNull
public static final String StreamSize_Encoded_String4 = "StreamSize_Encoded/String4";
/**
 * : Encoded Streamsize in with percentage value
 */
@NonNull
public static final String StreamSize_Encoded_String = "StreamSize_Encoded/String";
/**
 * : Encoded Stream size divided by file size
 */
@NonNull
public static final String StreamSize_Encoded_Propor = "StreamSize_Encoded_Propor";
/**
 * : Source Encoded Streamsize in bytes
 */
@NonNull
public static final String Source_StreamSize_Encoded = "Source_StreamSize_Encoded";
/**
 * : Source Encoded Streamsize in with percentage value
 */
@NonNull
public static final String Source_StreamSize_Encoded = "Source_StreamSize_Encoded";
/**
 * Source_StreamSize_Encoded/String1
 */
@NonNull
public static final String Source_StreamSize_Encoded_String1 = "Source_StreamSize_Encoded/String1";
/**
 * Source_StreamSize_Encoded/String2
 */
@NonNull
public static final String Source_StreamSize_Encoded_String2 = "Source_StreamSize_Encoded/String2";
/**
 * Source_StreamSize_Encoded/String3
 */
@NonNull
public static final String Source_StreamSize_Encoded_String3 = "Source_StreamSize_Encoded/String3";
/**
 * Source_StreamSize_Encoded/String4
 */
@NonNull
public static final String Source_StreamSize_Encoded_String4 = "Source_StreamSize_Encoded/String4";
/**
 * : Source Encoded Streamsize in with percentage value
 */
@NonNull
public static final String Source_StreamSize_Encoded = "Source_StreamSize_Encoded";
/**
 * : Source Encoded Stream size divided by file size
 */
@NonNull
public static final String Source_StreamSize_Encoded = "Source_StreamSize_Encoded";
/**
 * : How this stream file is aligned in the container
 */
@NonNull
public static final String Alignment = "Alignment";
/**
 * Alignment/String
 */
@NonNull
public static final String Alignment_String = "Alignment/String";
/**
 * : Name of the track
 */
@NonNull
public static final String Title = "Title";
/**
 * : Name of the software package used to create the file, such as Microsoft WaveEdit
 */
@NonNull
public static final String Encoded_Application = "Encoded_Application";
/**
 * : Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'
 */
@NonNull
public static final String Encoded_Application_Strin = "Encoded_Application/Strin";
/**
 * : Name of the company
 */
@NonNull
public static final String Encoded_Application_Compa = "Encoded_Application_Compa";
/**
 * : Name of the product
 */
@NonNull
public static final String Encoded_Application_Name = "Encoded_Application_Name";
/**
 * : Version of the product
 */
@NonNull
public static final String Encoded_Application_Versi = "Encoded_Application_Versi";
/**
 * : Name of the software package used to create the file, such as Microsoft WaveEdit.
 */
@NonNull
public static final String Encoded_Application_Url = "Encoded_Application_Url";
/**
 * : Software used to create the file
 */
@NonNull
public static final String Encoded_Library = "Encoded_Library";
/**
 * : Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'
 */
@NonNull
public static final String Encoded_Library_String = "Encoded_Library/String";
/**
 * : Name of the company
 */
@NonNull
public static final String Encoded_Library_CompanyNa = "Encoded_Library_CompanyNa";
/**
 * : Name of the the encoding-software
 */
@NonNull
public static final String Encoded_Library_Name = "Encoded_Library_Name";
/**
 * : Version of encoding-software
 */
@NonNull
public static final String Encoded_Library_Version = "Encoded_Library_Version";
/**
 * : Release date of software
 */
@NonNull
public static final String Encoded_Library_Date = "Encoded_Library_Date";
/**
 * : Parameters used by the software
 */
@NonNull
public static final String Encoded_Library_Settings = "Encoded_Library_Settings";
/**
 * : Operating System of encoding-software
 */
@NonNull
public static final String Encoded_OperatingSystem = "Encoded_OperatingSystem";
/**
 * : Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn)
 */
@NonNull
public static final String Language = "Language";
/**
 * : Language (full)
 */
@NonNull
public static final String Language_String = "Language/String";
/**
 * : Language (full)
 */
@NonNull
public static final String Language_String1 = "Language/String1";
/**
 * : Language (2-letter ISO 639-1 if exists, else empty)
 */
@NonNull
public static final String Language_String2 = "Language/String2";
/**
 * : Language (3-letter ISO 639-2 if exists, else empty)
 */
@NonNull
public static final String Language_String3 = "Language/String3";
/**
 * : Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty)
 */
@NonNull
public static final String Language_String4 = "Language/String4";
/**
 * : More info about Language (e.g. Director's Comment)
 */
@NonNull
public static final String Language_More = "Language_More";
/**
 * : Set if that track should not be used
 */
@NonNull
public static final String Disabled = "Disabled";
/**
 * : Set if that track should not be used
 */
@NonNull
public static final String Disabled_String = "Disabled/String";
/**
 * : Set if that track should be used if no language found matches the user preference.
 */
@NonNull
public static final String Default = "Default";
/**
 * : Set if that track should be used if no language found matches the user preference.
 */
@NonNull
public static final String Default_String = "Default/String";
/**
 * : Set if that track should be used if no language found matches the user preference.
 */
@NonNull
public static final String Forced = "Forced";
/**
 * : Set if that track should be used if no language found matches the user preference.
 */
@NonNull
public static final String Forced_String = "Forced/String";
/**
 * : Number of a group in order to provide versions of the same track
 */
@NonNull
public static final String AlternateGroup = "AlternateGroup";
/**
 * : Number of a group in order to provide versions of the same track
 */
@NonNull
public static final String AlternateGroup_String = "AlternateGroup/String";
/**
 * : UTC time that the encoding of this item was completed began.
 */
@NonNull
public static final String Encoded_Date = "Encoded_Date";
/**
 * : UTC time that the tags were done for this item.
 */
@NonNull
public static final String Tagged_Date = "Tagged_Date";
/**
 * Encryption
 */
@NonNull
public static final String Encryption = "Encryption";
/**
 * : Defines the size of the buffer needed to decode the sequence.
 */
@NonNull
public static final String BufferSize = "BufferSize";
/**
 * : Colour range for YUV colour space
 */
@NonNull
public static final String colour_range = "colour_range";
/**
 * : Presence of colour description
 */
@NonNull
public static final String colour_description_presen = "colour_description_presen";
/**
 * : Chromaticity coordinates of the source primaries
 */
@NonNull
public static final String colour_primaries = "colour_primaries";
/**
 * : Opto-electronic transfer characteristic of the source picture
 */
@NonNull
public static final String transfer_characteristics = "transfer_characteristics";
/**
 * : Matrix coefficients used in deriving luma and chroma signals from the green, blue, and red primaries
 */
@NonNull
public static final String matrix_coefficients = "matrix_coefficients";
/**
 * : Presence of colour description
 */
@NonNull
public static final String colour_description_presen = "colour_description_presen";
/**
 * : Chromaticity coordinates of the source primaries
 */
@NonNull
public static final String colour_primaries_Original = "colour_primaries_Original";
/**
 * : Opto-electronic transfer characteristic of the source picture
 */
@NonNull
public static final String transfer_characteristics_ = "transfer_characteristics_";
/**
 * : Matrix coefficients used in deriving luma and chroma signals from the green, blue, and red primaries
 */
@NonNull
public static final String matrix_coefficients_Origi = "matrix_coefficients_Origi";

}
