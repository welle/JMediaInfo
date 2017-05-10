package aka.jmetadata.main.constants;

import org.eclipse.jdt.annotation.NonNull;

/**
 * Audio constants parameters.
 *
 * @author Welle Charlotte
 */
public final class Audio {

   /**
    * Delay source (Stream or empty).
    */
    @NonNull
    public static final String DELAYORIGINALSOURCE = "Delay_Original_Source";

   /**
    * Between how much time (ms) the stream is inserted.
    */
    @NonNull
    public static final String INTERLEAVEDURATION = "Interleave_Duration";

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
    * Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @NonNull
    public static final String DURATIONFIRSTFRAMESTRING4 = "Duration_FirstFrame/String4";

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
    * Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @NonNull
    public static final String DURATIONFIRSTFRAMESTRING3 = "Duration_FirstFrame/String3";

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
    * How much time is buffered before the first video frame (with measurement).
    */
    @NonNull
    public static final String INTERLEAVEPRELOADSTRING = "Interleave_Preload/String";

   /**
    * Compression method used.
    */
    @NonNull
    public static final String FORMATCOMPRESSION = "Format_Compression";

   /**
    * Where this stream file is aligned in the container.
    */
    @NonNull
    public static final String ALIGNMENTSTRING = "Alignment/String";

   /**
    * Delay with measurement.
    */
    @NonNull
    public static final String DELAYSTRING = "Delay/String";

   /**
    * More info (text) about the muxing mode.
    */
    @NonNull
    public static final String MUXINGMODEMOREINFO = "MuxingMode_MoreInfo";

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
    * How this stream is muxed in the container.
    */
    @NonNull
    public static final String MUXINGMODE = "MuxingMode";

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
    * Format_Settings_ITU.
    */
    @NonNull
    public static final String FORMATSETTINGSITU = "Format_Settings_ITU";

   /**
    * Number of channels (with measurement).
    */
    @NonNull
    public static final String CHANNELSORIGINALSTRING = "Channel(s)_Original/String";

   /**
    * Format_Settings_ModeExtension.
    */
    @NonNull
    public static final String FORMATSETTINGSMODEEXTENSION = "Format_Settings_ModeExtension";

   /**
    * Format_Settings_Firm.
    */
    @NonNull
    public static final String FORMATSETTINGSFIRM = "Format_Settings_Firm";

   /**
    * Bit rate mode (Constant, Variable).
    */
    @NonNull
    public static final String BITRATEMODESTRING = "BitRate_Mode/String";

   /**
    * The maximum absolute peak value of the item.
    */
    @NonNull
    public static final String REPLAYGAINPEAK = "ReplayGain_Peak";

   /**
    * ID of layout of channels (e.g. MXF descriptor channel assignment). Warning, sometimes this is not enough for uniquely identifying a layout (e.g. MXF descriptor channel assignment is SMPTE 377-4). For AC-3, the form is x,y with x=acmod and y=lfeon..
    */
    @NonNull
    public static final String CHANNELLAYOUTID = "ChannelLayoutID";

   /**
    * Source Sample count (based on sampling rate).
    */
    @NonNull
    public static final String SOURCESAMPLINGCOUNT = "Source_SamplingCount";

   /**
    * Version of encoding-software.
    */
    @NonNull
    public static final String ENCODEDLIBRARYVERSION = "Encoded_Library_Version";

   /**
    * Sample count (based on sampling rate).
    */
    @NonNull
    public static final String SAMPLINGCOUNT = "SamplingCount";

   /**
    * Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @NonNull
    public static final String SOURCEDURATIONLASTFRAMESTRING = "Source_Duration_LastFrame/String";

   /**
    * Info about codec ID.
    */
    @NonNull
    public static final String CODECIDINFO = "CodecID/Info";

   /**
    * Streamsize in bytes.
    */
    @NonNull
    public static final String STREAMSIZE = "StreamSize";

   /**
    * Info about the format.
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
    * Homepage for more details about this codec ID.
    */
    @NonNull
    public static final String CODECIDURL = "CodecID/Url";

   /**
    * Source_StreamSize/String2.
    */
    @NonNull
    public static final String SOURCESTREAMSIZESTRING2 = "Source_StreamSize/String2";

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
    * Operating System of encoding-software.
    */
    @NonNull
    public static final String ENCODEDOPERATINGSYSTEM = "Encoded_OperatingSystem";

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
    * The ID for this stream in this file.
    */
    @NonNull
    public static final String IDSTRING = "ID/String";

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
    * Video_Delay/String.
    */
    @NonNull
    public static final String VIDEODELAYSTRING = "Video_Delay/String";

   /**
    * Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @NonNull
    public static final String DELAYSTRING4 = "Delay/String4";

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
    * Number of channels (with measurement).
    */
    @NonNull
    public static final String CHANNELSSTRING = "Channel(s)/String";

   /**
    * Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @NonNull
    public static final String DELAYSTRING5 = "Delay/String5";

   /**
    * How much time is buffered before the first video frame.
    */
    @NonNull
    public static final String INTERLEAVEPRELOAD = "Interleave_Preload";

   /**
    * Position of channels after matrix decoding (x/y.z format).
    */
    @NonNull
    public static final String MATRIXCHANNELPOSITIONSSTRING2 = "Matrix_ChannelPositions/String2";

   /**
    * Format_Settings_SBR.
    */
    @NonNull
    public static final String FORMATSETTINGSSBR = "Format_Settings_SBR";

   /**
    * Delay fixed in the stream (relative) IN MS.
    */
    @NonNull
    public static final String DELAY = "Delay";

   /**
    * Name of the software package used to create the file, such as Microsoft WaveEdit..
    */
    @NonNull
    public static final String ENCODEDAPPLICATIONURL = "Encoded_Application_Url";

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
    * Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @NonNull
    public static final String SOURCEDURATIONFIRSTFRAMESTRING4 = "Source_Duration_FirstFrame/String4";

   /**
    * Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @NonNull
    public static final String SOURCEDURATIONFIRSTFRAMESTRING5 = "Source_Duration_FirstFrame/String5";

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
    * Number of channels.
    */
    @NonNull
    public static final String CHANNELSORIGINAL = "Channel(s)_Original";

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
    * Position of channels.
    */
    @NonNull
    public static final String CHANNELPOSITIONS = "ChannelPositions";

   /**
    * Play time of the stream, in ms.
    */
    @NonNull
    public static final String DURATION = "Duration";

   /**
    * Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @NonNull
    public static final String SOURCEDURATIONSTRING5 = "Source_Duration/String5";

   /**
    * Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @NonNull
    public static final String DURATIONLASTFRAMESTRING = "Duration_LastFrame/String";

   /**
    * Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
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
    * Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @NonNull
    public static final String SOURCEDURATIONSTRING1 = "Source_Duration/String1";

   /**
    * Hint/popular name for this codec ID.
    */
    @NonNull
    public static final String CODECIDHINT = "CodecID/Hint";

   /**
    * Number of channels after matrix decoding.
    */
    @NonNull
    public static final String MATRIXCHANNELS = "Matrix_Channel(s)";

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
    * ReplayGain_Gain/String.
    */
    @NonNull
    public static final String REPLAYGAINGAINSTRING = "ReplayGain_Gain/String";

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
    * Format_Settings_Sign.
    */
    @NonNull
    public static final String FORMATSETTINGSSIGN = "Format_Settings_Sign";

   /**
    * Language (full).
    */
    @NonNull
    public static final String LANGUAGESTRING1 = "Language/String1";

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
    * Position of channels after matrix decoding.
    */
    @NonNull
    public static final String MATRIXCHANNELPOSITIONS = "Matrix_ChannelPositions";

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
    * Between how many video frames the stream is inserted.
    */
    @NonNull
    public static final String INTERLEAVEVIDEOFRAMES = "Interleave_VideoFrames";

   /**
    * Matrix format (e.g. DTS Neural).
    */
    @NonNull
    public static final String MATRIXFORMAT = "Matrix_Format";

   /**
    * Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    */
    @NonNull
    public static final String LANGUAGE = "Language";

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
    * in KHz.
    */
    @NonNull
    public static final String SAMPLINGRATESTRING = "SamplingRate/String";

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
    * Format_Settings_Mode.
    */
    @NonNull
    public static final String FORMATSETTINGSMODE = "Format_Settings_Mode";

   /**
    * Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @NonNull
    public static final String SOURCEDURATIONLASTFRAMESTRING3 = "Source_Duration_LastFrame/String3";

   /**
    * Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @NonNull
    public static final String SOURCEDURATIONLASTFRAMESTRING2 = "Source_Duration_LastFrame/String2";

   /**
    * Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @NonNull
    public static final String SOURCEDURATIONLASTFRAMESTRING5 = "Source_Duration_LastFrame/String5";

   /**
    * Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @NonNull
    public static final String SOURCEDURATIONLASTFRAMESTRING4 = "Source_Duration_LastFrame/String4";

   /**
    * Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different.
    */
    @NonNull
    public static final String BITDEPTHSTRING = "BitDepth/String";

   /**
    * Frame count (a frame contains a count of samples depends of the format).
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
    * Sampling rate.
    */
    @NonNull
    public static final String SAMPLINGRATE = "SamplingRate";

   /**
    * Maximum Bit rate in bps.
    */
    @NonNull
    public static final String BITRATEMAXIMUM = "BitRate_Maximum";

   /**
    * Format_Settings_Emphasis.
    */
    @NonNull
    public static final String FORMATSETTINGSEMPHASIS = "Format_Settings_Emphasis";

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
    * Format_Settings_PS/String.
    */
    @NonNull
    public static final String FORMATSETTINGSPSSTRING = "Format_Settings_PS/String";

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
    * Delay fixed in the raw stream (relative) IN MS.
    */
    @NonNull
    public static final String DELAYORIGINAL = "Delay_Original";

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
    * The ID for this stream in this file.
    */
    @NonNull
    public static final String ID = "ID";

   /**
    * Delay fixed in the stream (absolute / video).
    */
    @NonNull
    public static final String VIDEODELAY = "Video_Delay";

   /**
    * The gain to apply to reach 89dB SPL on playback.
    */
    @NonNull
    public static final String REPLAYGAINGAIN = "ReplayGain_Gain";

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
    * Format_Settings_Law.
    */
    @NonNull
    public static final String FORMATSETTINGSLAW = "Format_Settings_Law";

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
    * Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @NonNull
    public static final String DELAYORIGINALSTRING4 = "Delay_Original/String4";

   /**
    * Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @NonNull
    public static final String DELAYORIGINALSTRING5 = "Delay_Original/String5";

   /**
    * Format_Settings_PS.
    */
    @NonNull
    public static final String FORMATSETTINGSPS = "Format_Settings_PS";

   /**
    * Set if that track should be used if no language found matches the user preference..
    */
    @NonNull
    public static final String FORCED = "Forced";

   /**
    * Number of channels after matrix decoding (with measurement).
    */
    @NonNull
    public static final String MATRIXCHANNELSSTRING = "Matrix_Channel(s)/String";

   /**
    * Last **Inform** call.
    */
    @NonNull
    public static final String INFORM = "Inform";

   /**
    * Source Duration of the first frame if it is longer than others, in ms.
    */
    @NonNull
    public static final String SOURCEDURATIONFIRSTFRAME = "Source_Duration_FirstFrame";

   /**
    * Number of the stream (base=0).
    */
    @NonNull
    public static final String STREAMKINDID = "StreamKindID";

   /**
    * Format_Settings_Floor.
    */
    @NonNull
    public static final String FORMATSETTINGSFLOOR = "Format_Settings_Floor";

   /**
    * Homepage of this format.
    */
    @NonNull
    public static final String FORMATURL = "Format/Url";

   /**
    * Minimum Bit rate (with measurement).
    */
    @NonNull
    public static final String BITRATEMINIMUMSTRING = "BitRate_Minimum/String";

   /**
    * Frames per second (with measurement).
    */
    @NonNull
    public static final String FRAMERATESTRING = "FrameRate/String";

   /**
    * Source Frame count (a frame contains a count of samples depends of the format).
    */
    @NonNull
    public static final String SOURCEFRAMECOUNT = "Source_FrameCount";

   /**
    * Set if that track should be used if no language found matches the user preference..
    */
    @NonNull
    public static final String DEFAULT = "Default";

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
    * Detected (during scan of the input by the muxer) resolution in bits.
    */
    @NonNull
    public static final String BITDEPTHDETECTED = "BitDepth_Detected";

   /**
    * Profile of the Format (old XML: 'Profile@Level' format.
    */
    @NonNull
    public static final String FORMATPROFILE = "Format_Profile";

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
    * Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different.
    */
    @NonNull
    public static final String BITDEPTH = "BitDepth";

   /**
    * Encoded Streamsize in bytes.
    */
    @NonNull
    public static final String STREAMSIZEENCODED = "StreamSize_Encoded";

   /**
    * Count of streams of that kind available.
    */
    @NonNull
    public static final String STREAMCOUNT = "StreamCount";

   /**
    * Encoded Streamsize in with percentage value.
    */
    @NonNull
    public static final String STREAMSIZEENCODEDSTRING = "StreamSize_Encoded/String";

   /**
    * Play time in format : XXx YYy only, YYy omited if zero.
    */
    @NonNull
    public static final String DURATIONSTRING2 = "Duration/String2";

   /**
    * Play time in format : HH:MM:SS.MMM.
    */
    @NonNull
    public static final String DURATIONSTRING3 = "Duration/String3";

   /**
    * Layout of channels (in the stream).
    */
    @NonNull
    public static final String CHANNELLAYOUT = "ChannelLayout";

   /**
    * Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @NonNull
    public static final String DURATIONSTRING1 = "Duration/String1";

   /**
    * Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @NonNull
    public static final String DURATIONSTRING4 = "Duration/String4";

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
    * Delay source (Container or Stream or empty).
    */
    @NonNull
    public static final String DELAYSOURCE = "Delay_Source";

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
    * Number of channels.
    */
    @NonNull
    public static final String CHANNELS = "Channel(s)";

   /**
    * Format_Settings_Endianness.
    */
    @NonNull
    public static final String FORMATSETTINGSENDIANNESS = "Format_Settings_Endianness";

   /**
    * Video_Delay/String5.
    */
    @NonNull
    public static final String VIDEODELAYSTRING5 = "Video_Delay/String5";

   /**
    * Video_Delay/String1.
    */
    @NonNull
    public static final String VIDEODELAYSTRING1 = "Video_Delay/String1";

   /**
    * Video_Delay/String2.
    */
    @NonNull
    public static final String VIDEODELAYSTRING2 = "Video_Delay/String2";

   /**
    * Video_Delay/String3.
    */
    @NonNull
    public static final String VIDEODELAYSTRING3 = "Video_Delay/String3";

   /**
    * Video_Delay/String4.
    */
    @NonNull
    public static final String VIDEODELAYSTRING4 = "Video_Delay/String4";

   /**
    * Nominal Bit rate (with measurement).
    */
    @NonNull
    public static final String BITRATENOMINALSTRING = "BitRate_Nominal/String";

   /**
    * Detected (during scan of the input by the muxer) resolution in bits.
    */
    @NonNull
    public static final String BITDEPTHDETECTEDSTRING = "BitDepth_Detected/String";

   /**
    * Format used.
    */
    @NonNull
    public static final String FORMAT = "Format";

   /**
    * Stored Resolution in bits (8, 16, 20, 24).
    */
    @NonNull
    public static final String BITDEPTHSTORED = "BitDepth_Stored";

   /**
    * Stored Resolution in bits (8, 16, 20, 24).
    */
    @NonNull
    public static final String BITDEPTHSTOREDSTRING = "BitDepth_Stored/String";

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
    * Delay source (Container or Stream or empty).
    */
    @NonNull
    public static final String DELAYSOURCESTRING = "Delay_Source/String";

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
    * Format_Settings_SBR/String.
    */
    @NonNull
    public static final String FORMATSETTINGSSBRSTRING = "Format_Settings_SBR/String";

   /**
    * Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @NonNull
    public static final String SOURCEDURATIONSTRING = "Source_Duration/String";

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
    * Position of channels (x/y.z format).
    */
    @NonNull
    public static final String CHANNELPOSITIONSSTRING2 = "ChannelPositions/String2";

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
    * Sampling rate.
    */
    @NonNull
    public static final String SAMPLESPERFRAME = "SamplesPerFrame";

   /**
    * Between how much time and video frames the stream is inserted (with measurement).
    */
    @NonNull
    public static final String INTERLEAVEDURATIONSTRING = "Interleave_Duration/String";

   /**
    * Number of a group in order to provide versions of the same track.
    */
    @NonNull
    public static final String ALTERNATEGROUPSTRING = "AlternateGroup/String";

}
