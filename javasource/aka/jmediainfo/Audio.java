package aka.jmediainfo;

import org.eclipse.jdt.annotation.NonNull;

/**
 * Audio constants parameters
 *
 */
public final class Audio {

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
 * : Info about the format
 */
@NonNull
public static final String Format_Info = "Format/Info";
/**
 * : Homepage of this format
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
 * : Profile of this Format
 */
@NonNull
public static final String Format_Profile = "Format_Profile";
/**
 * : Compression method used
 */
@NonNull
public static final String Format_Compression = "Format_Compression";
/**
 * : Settings needed for decoder used, summary
 */
@NonNull
public static final String Format_Settings = "Format_Settings";
/**
 * Format_Settings_SBR
 */
@NonNull
public static final String Format_Settings_SBR = "Format_Settings_SBR";
/**
 * Format_Settings_SBR/String
 */
@NonNull
public static final String Format_Settings_SBR_String = "Format_Settings_SBR/String";
/**
 * Format_Settings_PS
 */
@NonNull
public static final String Format_Settings_PS = "Format_Settings_PS";
/**
 * Format_Settings_PS/String
 */
@NonNull
public static final String Format_Settings_PS_String = "Format_Settings_PS/String";
/**
 * Format_Settings_Mode
 */
@NonNull
public static final String Format_Settings_Mode = "Format_Settings_Mode";
/**
 * Format_Settings_ModeExtension
 */
@NonNull
public static final String Format_Settings_ModeExtension = "Format_Settings_ModeExtension";
/**
 * Format_Settings_Emphasis
 */
@NonNull
public static final String Format_Settings_Emphasis = "Format_Settings_Emphasis";
/**
 * Format_Settings_Floor
 */
@NonNull
public static final String Format_Settings_Floor = "Format_Settings_Floor";
/**
 * Format_Settings_Firm
 */
@NonNull
public static final String Format_Settings_Firm = "Format_Settings_Firm";
/**
 * Format_Settings_Endianness
 */
@NonNull
public static final String Format_Settings_Endianness = "Format_Settings_Endianness";
/**
 * Format_Settings_Sign
 */
@NonNull
public static final String Format_Settings_Sign = "Format_Settings_Sign";
/**
 * Format_Settings_Law
 */
@NonNull
public static final String Format_Settings_Law = "Format_Settings_Law";
/**
 * Format_Settings_ITU
 */
@NonNull
public static final String Format_Settings_ITU = "Format_Settings_ITU";
/**
 * : Wrapping mode (Frame wrapped or Clip wrapped)
 */
@NonNull
public static final String Format_Settings_Wrapping = "Format_Settings_Wrapping";
/**
 * : Matrix format (e.g. DTS Neural)
 */
@NonNull
public static final String Matrix_Format = "Matrix_Format";
/**
 * : Internet Media Type (aka MIME Type, Content-Type)
 */
@NonNull
public static final String InternetMediaType = "InternetMediaType";
/**
 * : How this stream is muxed in the container
 */
@NonNull
public static final String MuxingMode = "MuxingMode";
/**
 * : More info (text) about the muxing mode
 */
@NonNull
public static final String MuxingMode_MoreInfo = "MuxingMode_MoreInfo";
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
 * : Info about codec ID
 */
@NonNull
public static final String CodecID_Info = "CodecID/Info";
/**
 * : Hint/popular name for this codec ID
 */
@NonNull
public static final String CodecID_Hint = "CodecID/Hint";
/**
 * : Homepage for more details about this codec ID
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
public static final String Codec_Description = "Codec_Description";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Codec_Profile = "Codec_Profile";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Codec_Settings = "Codec_Settings";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Codec_Settings_Automatic = "Codec_Settings_Automatic";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Codec_Settings_Floor = "Codec_Settings_Floor";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Codec_Settings_Firm = "Codec_Settings_Firm";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Codec_Settings_Endianness = "Codec_Settings_Endianness";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Codec_Settings_Sign = "Codec_Settings_Sign";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Codec_Settings_Law = "Codec_Settings_Law";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Codec_Settings_ITU = "Codec_Settings_ITU";
/**
 * : Play time of the stream, in ms
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
 * : Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available
 */
@NonNull
public static final String Source_Duration_String4 = "Source_Duration/String4";
/**
 * : Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF)
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
 * : Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available
 */
@NonNull
public static final String Source_Duration_FirstFram = "Source_Duration_FirstFram";
/**
 * : Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF)
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
 * : Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available
 */
@NonNull
public static final String Source_Duration_LastFrame = "Source_Duration_LastFrame";
/**
 * : Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF)
 */
@NonNull
public static final String Source_Duration_LastFrame = "Source_Duration_LastFrame";
/**
 * : Bit rate mode (VBR, CBR)
 */
@NonNull
public static final String BitRate_Mode = "BitRate_Mode";
/**
 * : Bit rate mode (Constant, Variable)
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
 * : Number of channels
 */
@NonNull
public static final String Channel(s) = "Channel(s)";
/**
 * : Number of channels (with measurement)
 */
@NonNull
public static final String Channel(s)_String = "Channel(s)/String";
/**
 * : Number of channels
 */
@NonNull
public static final String Channel(s)_Original = "Channel(s)_Original";
/**
 * : Number of channels (with measurement)
 */
@NonNull
public static final String Channel(s)_Original_Strin = "Channel(s)_Original/Strin";
/**
 * : Number of channels after matrix decoding
 */
@NonNull
public static final String Matrix_Channel(s) = "Matrix_Channel(s)";
/**
 * : Number of channels after matrix decoding (with measurement)
 */
@NonNull
public static final String Matrix_Channel(s)_String = "Matrix_Channel(s)/String";
/**
 * : Position of channels
 */
@NonNull
public static final String ChannelPositions = "ChannelPositions";
/**
 * : Position of channels (x/y.z format)
 */
@NonNull
public static final String ChannelPositions_String2 = "ChannelPositions/String2";
/**
 * : Position of channels after matrix decoding
 */
@NonNull
public static final String Matrix_ChannelPositions = "Matrix_ChannelPositions";
/**
 * : Position of channels after matrix decoding (x/y.z format)
 */
@NonNull
public static final String Matrix_ChannelPositions_S = "Matrix_ChannelPositions/S";
/**
 * : Layout of channels (in the stream)
 */
@NonNull
public static final String ChannelLayout = "ChannelLayout";
/**
 * : ID of layout of channels (e.g. MXF descriptor channel assignment). Warning, sometimes this is not enough for uniquely identifying a layout (e.g. MXF descriptor channel assignment is SMPTE 377-4). For AC-3, the form is x,y with x=acmod and y=lfeon.
 */
@NonNull
public static final String ChannelLayoutID = "ChannelLayoutID";
/**
 * : Sampling rate
 */
@NonNull
public static final String SamplesPerFrame = "SamplesPerFrame";
/**
 * : Sampling rate
 */
@NonNull
public static final String SamplingRate = "SamplingRate";
/**
 * : in KHz
 */
@NonNull
public static final String SamplingRate_String = "SamplingRate/String";
/**
 * : Sample count (based on sampling rate)
 */
@NonNull
public static final String SamplingCount = "SamplingCount";
/**
 * : Source Sample count (based on sampling rate)
 */
@NonNull
public static final String Source_SamplingCount = "Source_SamplingCount";
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
 * : Frame count (a frame contains a count of samples depends of the format)
 */
@NonNull
public static final String FrameCount = "FrameCount";
/**
 * : Source Frame count (a frame contains a count of samples depends of the format)
 */
@NonNull
public static final String Source_FrameCount = "Source_FrameCount";
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
 * : Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different
 */
@NonNull
public static final String BitDepth = "BitDepth";
/**
 * : Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different
 */
@NonNull
public static final String BitDepth_String = "BitDepth/String";
/**
 * : Detected (during scan of the input by the muxer) resolution in bits
 */
@NonNull
public static final String BitDepth_Detected = "BitDepth_Detected";
/**
 * : Detected (during scan of the input by the muxer) resolution in bits
 */
@NonNull
public static final String BitDepth_Detected_String = "BitDepth_Detected/String";
/**
 * : Stored Resolution in bits (8, 16, 20, 24)
 */
@NonNull
public static final String BitDepth_Stored = "BitDepth_Stored";
/**
 * : Stored Resolution in bits (8, 16, 20, 24)
 */
@NonNull
public static final String BitDepth_Stored_String = "BitDepth_Stored/String";
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
 * : Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available
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
 * : Delay fixed in the stream (absolute / video)
 */
@NonNull
public static final String Video_Delay = "Video_Delay";
/**
 * Video_Delay/String
 */
@NonNull
public static final String Video_Delay_String = "Video_Delay/String";
/**
 * Video_Delay/String1
 */
@NonNull
public static final String Video_Delay_String1 = "Video_Delay/String1";
/**
 * Video_Delay/String2
 */
@NonNull
public static final String Video_Delay_String2 = "Video_Delay/String2";
/**
 * Video_Delay/String3
 */
@NonNull
public static final String Video_Delay_String3 = "Video_Delay/String3";
/**
 * Video_Delay/String4
 */
@NonNull
public static final String Video_Delay_String4 = "Video_Delay/String4";
/**
 * Video_Delay/String5
 */
@NonNull
public static final String Video_Delay_String5 = "Video_Delay/String5";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Video0_Delay = "Video0_Delay";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Video0_Delay_String = "Video0_Delay/String";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Video0_Delay_String1 = "Video0_Delay/String1";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Video0_Delay_String2 = "Video0_Delay/String2";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Video0_Delay_String3 = "Video0_Delay/String3";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Video0_Delay_String4 = "Video0_Delay/String4";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Video0_Delay_String5 = "Video0_Delay/String5";
/**
 * : The gain to apply to reach 89dB SPL on playback
 */
@NonNull
public static final String ReplayGain_Gain = "ReplayGain_Gain";
/**
 * ReplayGain_Gain/String
 */
@NonNull
public static final String ReplayGain_Gain_String = "ReplayGain_Gain/String";
/**
 * : The maximum absolute peak value of the item
 */
@NonNull
public static final String ReplayGain_Peak = "ReplayGain_Peak";
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
 * : Where this stream file is aligned in the container
 */
@NonNull
public static final String Alignment_String = "Alignment/String";
/**
 * : Between how many video frames the stream is inserted
 */
@NonNull
public static final String Interleave_VideoFrames = "Interleave_VideoFrames";
/**
 * : Between how much time (ms) the stream is inserted
 */
@NonNull
public static final String Interleave_Duration = "Interleave_Duration";
/**
 * : Between how much time and video frames the stream is inserted (with measurement)
 */
@NonNull
public static final String Interleave_Duration_Strin = "Interleave_Duration/Strin";
/**
 * : How much time is buffered before the first video frame
 */
@NonNull
public static final String Interleave_Preload = "Interleave_Preload";
/**
 * : How much time is buffered before the first video frame (with measurement)
 */
@NonNull
public static final String Interleave_Preload_String = "Interleave_Preload/String";
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

}
