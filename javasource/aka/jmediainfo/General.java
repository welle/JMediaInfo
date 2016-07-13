package aka.jmediainfo;

import org.eclipse.jdt.annotation.NonNull;

/**
 * General constants parameters
 *
 */
public final class General {

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
 * : Number of general streams
 */
@NonNull
public static final String GeneralCount = "GeneralCount";
/**
 * : Number of video streams
 */
@NonNull
public static final String VideoCount = "VideoCount";
/**
 * : Number of audio streams
 */
@NonNull
public static final String AudioCount = "AudioCount";
/**
 * : Number of text streams
 */
@NonNull
public static final String TextCount = "TextCount";
/**
 * : Number of other streams
 */
@NonNull
public static final String OtherCount = "OtherCount";
/**
 * : Number of image streams
 */
@NonNull
public static final String ImageCount = "ImageCount";
/**
 * : Number of menu streams
 */
@NonNull
public static final String MenuCount = "MenuCount";
/**
 * : Video Codecs in this file, separated by /
 */
@NonNull
public static final String Video_Format_List = "Video_Format_List";
/**
 * : Video Codecs in this file with popular name (hint), separated by /
 */
@NonNull
public static final String Video_Format_WithHint_Lis = "Video_Format_WithHint_Lis";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Video_Codec_List = "Video_Codec_List";
/**
 * : Video languagesin this file, full names, separated by /
 */
@NonNull
public static final String Video_Language_List = "Video_Language_List";
/**
 * : Audio Codecs in this file,separated by /
 */
@NonNull
public static final String Audio_Format_List = "Audio_Format_List";
/**
 * : Audio Codecs in this file with popular name (hint), separated by /
 */
@NonNull
public static final String Audio_Format_WithHint_Lis = "Audio_Format_WithHint_Lis";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Audio_Codec_List = "Audio_Codec_List";
/**
 * : Audio languages in this file separated by /
 */
@NonNull
public static final String Audio_Language_List = "Audio_Language_List";
/**
 * : Text Codecs in this file, separated by /
 */
@NonNull
public static final String Text_Format_List = "Text_Format_List";
/**
 * : Text Codecs in this file with popular name (hint),separated by /
 */
@NonNull
public static final String Text_Format_WithHint_List = "Text_Format_WithHint_List";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Text_Codec_List = "Text_Codec_List";
/**
 * : Text languages in this file, separated by /
 */
@NonNull
public static final String Text_Language_List = "Text_Language_List";
/**
 * : Other formats in this file, separated by /
 */
@NonNull
public static final String Other_Format_List = "Other_Format_List";
/**
 * : Other formats in this file with popular name (hint), separated by /
 */
@NonNull
public static final String Other_Format_WithHint_Lis = "Other_Format_WithHint_Lis";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Other_Codec_List = "Other_Codec_List";
/**
 * : Chapters languages in this file, separated by /
 */
@NonNull
public static final String Other_Language_List = "Other_Language_List";
/**
 * : Image Codecs in this file, separated by /
 */
@NonNull
public static final String Image_Format_List = "Image_Format_List";
/**
 * : Image Codecs in this file with popular name (hint), separated by /
 */
@NonNull
public static final String Image_Format_WithHint_Lis = "Image_Format_WithHint_Lis";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Image_Codec_List = "Image_Codec_List";
/**
 * : Image languages in this file, separated by /
 */
@NonNull
public static final String Image_Language_List = "Image_Language_List";
/**
 * : Menu Codecsin this file, separated by /
 */
@NonNull
public static final String Menu_Format_List = "Menu_Format_List";
/**
 * : Menu Codecs in this file with popular name (hint),separated by /
 */
@NonNull
public static final String Menu_Format_WithHint_List = "Menu_Format_WithHint_List";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Menu_Codec_List = "Menu_Codec_List";
/**
 * : Menu languages in this file, separated by /
 */
@NonNull
public static final String Menu_Language_List = "Menu_Language_List";
/**
 * : Complete name (Folder+Name+Extension)
 */
@NonNull
public static final String CompleteName = "CompleteName";
/**
 * : Folder name only
 */
@NonNull
public static final String FolderName = "FolderName";
/**
 * : File name only
 */
@NonNull
public static final String FileName = "FileName";
/**
 * : File extension only
 */
@NonNull
public static final String FileExtension = "FileExtension";
/**
 * : Complete name (Folder+Name+Extension) of the last file (in the case of a sequence of files)
 */
@NonNull
public static final String CompleteName_Last = "CompleteName_Last";
/**
 * : Folder name only of the last file (in the case of a sequence of files)
 */
@NonNull
public static final String FolderName_Last = "FolderName_Last";
/**
 * : File name only of the last file (in the case of a sequence of files)
 */
@NonNull
public static final String FileName_Last = "FileName_Last";
/**
 * : File extension only of the last file (in the case of a sequence of files)
 */
@NonNull
public static final String FileExtension_Last = "FileExtension_Last";
/**
 * : Format used
 */
@NonNull
public static final String Format = "Format";
/**
 * : Deprecated, do not use in new projects
 */
@NonNull
public static final String Format_String = "Format/String";
/**
 * : Info about this Format
 */
@NonNull
public static final String Format_Info = "Format/Info";
/**
 * : Link to a description of this format
 */
@NonNull
public static final String Format_Url = "Format/Url";
/**
 * : Known extensions of this format
 */
@NonNull
public static final String Format_Extensions = "Format/Extensions";
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
 * : Compression method used
 */
@NonNull
public static final String Format_Compression = "Format_Compression";
/**
 * : Settings needed for decoder used
 */
@NonNull
public static final String Format_Settings = "Format_Settings";
/**
 * : Internet Media Type (aka MIME Type, Content-Type)
 */
@NonNull
public static final String InternetMediaType = "InternetMediaType";
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
 * : Info about this codec
 */
@NonNull
public static final String CodecID_Info = "CodecID/Info";
/**
 * : A hint/popular name for this codec
 */
@NonNull
public static final String CodecID_Hint = "CodecID/Hint";
/**
 * : A link to more details about this codec ID
 */
@NonNull
public static final String CodecID_Url = "CodecID/Url";
/**
 * : Manual description given by the container
 */
@NonNull
public static final String CodecID_Description = "CodecID_Description";
/**
 * : Version of the CodecID
 */
@NonNull
public static final String CodecID_Version = "CodecID_Version";
/**
 * : Compatible CodecIDs
 */
@NonNull
public static final String CodecID_Compatible = "CodecID_Compatible";
/**
 * : If Audio and video are muxed
 */
@NonNull
public static final String Interleaved = "Interleaved";
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
public static final String Codec_Extensions = "Codec/Extensions";
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
 * : File size in bytes
 */
@NonNull
public static final String FileSize = "FileSize";
/**
 * : File size (with measure)
 */
@NonNull
public static final String FileSize_String = "FileSize/String";
/**
 * : File size (with measure, 1 digit mini)
 */
@NonNull
public static final String FileSize_String1 = "FileSize/String1";
/**
 * : File size (with measure, 2 digit mini)
 */
@NonNull
public static final String FileSize_String2 = "FileSize/String2";
/**
 * : File size (with measure, 3 digit mini)
 */
@NonNull
public static final String FileSize_String3 = "FileSize/String3";
/**
 * : File size (with measure, 4 digit mini)
 */
@NonNull
public static final String FileSize_String4 = "FileSize/String4";
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
 * Duration_Start
 */
@NonNull
public static final String Duration_Start = "Duration_Start";
/**
 * Duration_End
 */
@NonNull
public static final String Duration_End = "Duration_End";
/**
 * : Bit rate mode of all streams (VBR, CBR)
 */
@NonNull
public static final String OverallBitRate_Mode = "OverallBitRate_Mode";
/**
 * : Bit rate mode of all streams (Variable, Constant)
 */
@NonNull
public static final String OverallBitRate_Mode_Strin = "OverallBitRate_Mode/Strin";
/**
 * : Bit rate of all streams in bps
 */
@NonNull
public static final String OverallBitRate = "OverallBitRate";
/**
 * : Bit rate of all streams (with measure)
 */
@NonNull
public static final String OverallBitRate_String = "OverallBitRate/String";
/**
 * : Minimum Bit rate in bps
 */
@NonNull
public static final String OverallBitRate_Minimum = "OverallBitRate_Minimum";
/**
 * : Minimum Bit rate (with measurement)
 */
@NonNull
public static final String OverallBitRate_Minimum_St = "OverallBitRate_Minimum/St";
/**
 * : Nominal Bit rate in bps
 */
@NonNull
public static final String OverallBitRate_Nominal = "OverallBitRate_Nominal";
/**
 * : Nominal Bit rate (with measurement)
 */
@NonNull
public static final String OverallBitRate_Nominal_St = "OverallBitRate_Nominal/St";
/**
 * : Maximum Bit rate in bps
 */
@NonNull
public static final String OverallBitRate_Maximum = "OverallBitRate_Maximum";
/**
 * : Maximum Bit rate (with measurement)
 */
@NonNull
public static final String OverallBitRate_Maximum_St = "OverallBitRate_Maximum/St";
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
 * : format : HH:MM:SS.MMM
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
 * : Stream size in bytes
 */
@NonNull
public static final String StreamSize = "StreamSize";
/**
 * StreamSize/String
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
 * : With proportion
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
 * HeaderSize
 */
@NonNull
public static final String HeaderSize = "HeaderSize";
/**
 * DataSize
 */
@NonNull
public static final String DataSize = "DataSize";
/**
 * FooterSize
 */
@NonNull
public static final String FooterSize = "FooterSize";
/**
 * IsStreamable
 */
@NonNull
public static final String IsStreamable = "IsStreamable";
/**
 * : The gain to apply to reach 89dB SPL on playback
 */
@NonNull
public static final String Album_ReplayGain_Gain = "Album_ReplayGain_Gain";
/**
 * Album_ReplayGain_Gain/String
 */
@NonNull
public static final String Album_ReplayGain_Gain_String = "Album_ReplayGain_Gain/String";
/**
 * : The maximum absolute peak value of the item
 */
@NonNull
public static final String Album_ReplayGain_Peak = "Album_ReplayGain_Peak";
/**
 * Encryption
 */
@NonNull
public static final String Encryption = "Encryption";
/**
 * Encryption_Format
 */
@NonNull
public static final String Encryption_Format = "Encryption_Format";
/**
 * Encryption_Length
 */
@NonNull
public static final String Encryption_Length = "Encryption_Length";
/**
 * Encryption_Method
 */
@NonNull
public static final String Encryption_Method = "Encryption_Method";
/**
 * Encryption_Mode
 */
@NonNull
public static final String Encryption_Mode = "Encryption_Mode";
/**
 * Encryption_Padding
 */
@NonNull
public static final String Encryption_Padding = "Encryption_Padding";
/**
 * Encryption_InitializationVector
 */
@NonNull
public static final String Encryption_InitializationVector = "Encryption_InitializationVector";
/**
 * : (Generic)Title of file
 */
@NonNull
public static final String Title = "Title";
/**
 * : (Generic)More info about the title of file
 */
@NonNull
public static final String Title_More = "Title_More";
/**
 * : (Generic)Url
 */
@NonNull
public static final String Title_Url = "Title/Url";
/**
 * : Univers movies belong to, e.g. Starwars, Stargate, Buffy, Dragonballs
 */
@NonNull
public static final String Domain = "Domain";
/**
 * : Name of the series, e.g. Starwars movies, Stargate SG-1, Stargate Atlantis, Buffy, Angel
 */
@NonNull
public static final String Collection = "Collection";
/**
 * : Name of the season, e.g. Strawars first Trilogy, Season 1
 */
@NonNull
public static final String Season = "Season";
/**
 * : Number of the Season
 */
@NonNull
public static final String Season_Position = "Season_Position";
/**
 * : Place of the season e.g. 2 of 7
 */
@NonNull
public static final String Season_Position_Total = "Season_Position_Total";
/**
 * : Name of the movie. Eg : Starwars, a new hope
 */
@NonNull
public static final String Movie = "Movie";
/**
 * : More infos about the movie
 */
@NonNull
public static final String Movie_More = "Movie_More";
/**
 * : Country, where the movie was procuced
 */
@NonNull
public static final String Movie_Country = "Movie/Country";
/**
 * : Homepage for the movie
 */
@NonNull
public static final String Movie_Url = "Movie/Url";
/**
 * : Name of an audio-album. Eg : The joshua tree
 */
@NonNull
public static final String Album = "Album";
/**
 * : More infos about the album
 */
@NonNull
public static final String Album_More = "Album_More";
/**
 * Album/Sort
 */
@NonNull
public static final String Album_Sort = "Album/Sort";
/**
 * : Album performer/artist of this file
 */
@NonNull
public static final String Album_Performer = "Album/Performer";
/**
 * Album/Performer/Sort
 */
@NonNull
public static final String Album_Performer_Sort = "Album/Performer/Sort";
/**
 * : Homepage of the album performer/artist
 */
@NonNull
public static final String Album_Performer_Url = "Album/Performer/Url";
/**
 * : Name of the comic.
 */
@NonNull
public static final String Comic = "Comic";
/**
 * Comic_More
 */
@NonNull
public static final String Comic_More = "Comic_More";
/**
 * Comic/Position_Total
 */
@NonNull
public static final String Comic_Position_Total = "Comic/Position_Total";
/**
 * : Name of the part. e.g. CD1, CD2
 */
@NonNull
public static final String Part = "Part";
/**
 * : Number of the part
 */
@NonNull
public static final String Part_Position = "Part/Position";
/**
 * : Place of the part e.g. 2 of 3
 */
@NonNull
public static final String Part_Position_Total = "Part/Position_Total";
/**
 * : Name of the track. e.g. track1, track 2
 */
@NonNull
public static final String Track = "Track";
/**
 * : More infos about the track
 */
@NonNull
public static final String Track_More = "Track_More";
/**
 * : Link to a site about this track
 */
@NonNull
public static final String Track_Url = "Track/Url";
/**
 * Track/Sort
 */
@NonNull
public static final String Track_Sort = "Track/Sort";
/**
 * : Number of this track
 */
@NonNull
public static final String Track_Position = "Track/Position";
/**
 * : Place of this track, e.g. 3 of 15
 */
@NonNull
public static final String Track_Position_Total = "Track/Position_Total";
/**
 * : Package name i.e. technical flavor of the content
 */
@NonNull
public static final String PackageName = "PackageName";
/**
 * : iTunes grouping
 */
@NonNull
public static final String Grouping = "Grouping";
/**
 * : Name of the chapter.
 */
@NonNull
public static final String Chapter = "Chapter";
/**
 * : Name of the subtrack.
 */
@NonNull
public static final String SubTrack = "SubTrack";
/**
 * : Original name of album, serie...
 */
@NonNull
public static final String Original_Album = "Original/Album";
/**
 * : Original name of the movie
 */
@NonNull
public static final String Original_Movie = "Original/Movie";
/**
 * : Original name of the part in the original support
 */
@NonNull
public static final String Original_Part = "Original/Part";
/**
 * : Original name of the track in the original support
 */
@NonNull
public static final String Original_Track = "Original/Track";
/**
 * : iTunes compilation
 */
@NonNull
public static final String Compilation = "Compilation";
/**
 * : iTunes compilation
 */
@NonNull
public static final String Compilation_String = "Compilation/String";
/**
 * : Main performer/artist of this file
 */
@NonNull
public static final String Performer = "Performer";
/**
 * Performer/Sort
 */
@NonNull
public static final String Performer_Sort = "Performer/Sort";
/**
 * : Homepage of the performer/artist
 */
@NonNull
public static final String Performer_Url = "Performer/Url";
/**
 * : Original artist(s)/performer(s).
 */
@NonNull
public static final String Original_Performer = "Original/Performer";
/**
 * : Band/orchestra/accompaniment/musician.
 */
@NonNull
public static final String Accompaniment = "Accompaniment";
/**
 * : Name of the original composer.
 */
@NonNull
public static final String Composer = "Composer";
/**
 * : Nationality of the main composer of the item, mostly for classical music.
 */
@NonNull
public static final String Composer_Nationality = "Composer/Nationality";
/**
 * : The person who arranged the piece. e.g. Ravel.
 */
@NonNull
public static final String Arranger = "Arranger";
/**
 * : The person who wrote the lyrics for a musical item.
 */
@NonNull
public static final String Lyricist = "Lyricist";
/**
 * : Original lyricist(s)/text writer(s).
 */
@NonNull
public static final String Original_Lyricist = "Original/Lyricist";
/**
 * : The artist(s) who performed the work. In classical music this would be the conductor, orchestra, soloists.
 */
@NonNull
public static final String Conductor = "Conductor";
/**
 * : Name of the director.
 */
@NonNull
public static final String Director = "Director";
/**
 * : Name of the codirector.
 */
@NonNull
public static final String CoDirector = "CoDirector";
/**
 * : Name of the assistant director.
 */
@NonNull
public static final String AssistantDirector = "AssistantDirector";
/**
 * : The name of the director of photography, also known as cinematographer.
 */
@NonNull
public static final String DirectorOfPhotography = "DirectorOfPhotography";
/**
 * : The name of the sound engineer or sound recordist.
 */
@NonNull
public static final String SoundEngineer = "SoundEngineer";
/**
 * : The person who oversees the artists and craftspeople who build the sets.
 */
@NonNull
public static final String ArtDirector = "ArtDirector";
/**
 * : The person responsible for designing the Overall visual appearance of a movie.
 */
@NonNull
public static final String ProductionDesigner = "ProductionDesigner";
/**
 * : The name of the choregrapher.
 */
@NonNull
public static final String Choregrapher = "Choregrapher";
/**
 * : The name of the costume designer.
 */
@NonNull
public static final String CostumeDesigner = "CostumeDesigner";
/**
 * : Real name of an actor or actress playing a role in the movie.
 */
@NonNull
public static final String Actor = "Actor";
/**
 * : Name of the character an actor or actress plays in this movie.
 */
@NonNull
public static final String Actor_Character = "Actor_Character";
/**
 * : The author of the story or script.
 */
@NonNull
public static final String WrittenBy = "WrittenBy";
/**
 * : The author of the screenplay or scenario (used for movies and TV shows).
 */
@NonNull
public static final String ScreenplayBy = "ScreenplayBy";
/**
 * : Editors name
 */
@NonNull
public static final String EditedBy = "EditedBy";
/**
 * : name of the person or organization that commissioned the subject of the file
 */
@NonNull
public static final String CommissionedBy = "CommissionedBy";
/**
 * : Name of the producer of the movie.
 */
@NonNull
public static final String Producer = "Producer";
/**
 * : The name of a co-producer.
 */
@NonNull
public static final String CoProducer = "CoProducer";
/**
 * : The name of an executive producer.
 */
@NonNull
public static final String ExecutiveProducer = "ExecutiveProducer";
/**
 * : Main music-artist for a movie
 */
@NonNull
public static final String MusicBy = "MusicBy";
/**
 * : Company the item is mainly distributed by
 */
@NonNull
public static final String DistributedBy = "DistributedBy";
/**
 * : Name of the person or organization who supplied the original subject
 */
@NonNull
public static final String OriginalSourceForm_Distri = "OriginalSourceForm/Distri";
/**
 * : The engineer who mastered the content for a physical medium or for digital distribution.
 */
@NonNull
public static final String MasteredBy = "MasteredBy";
/**
 * : Name of the person or organisation that encoded/ripped the audio file.
 */
@NonNull
public static final String EncodedBy = "EncodedBy";
/**
 * : Name of the artist(s), that interpreted, remixed, or otherwise modified the item.
 */
@NonNull
public static final String RemixedBy = "RemixedBy";
/**
 * : Main production studio
 */
@NonNull
public static final String ProductionStudio = "ProductionStudio";
/**
 * : A very general tag for everyone else that wants to be listed.
 */
@NonNull
public static final String ThanksTo = "ThanksTo";
/**
 * : Name of the organization publishing the album (i.e. the 'record label') or movie.
 */
@NonNull
public static final String Publisher = "Publisher";
/**
 * : Publishers official webpage.
 */
@NonNull
public static final String Publisher_URL = "Publisher/URL";
/**
 * : Brand or trademark associated with the marketing of music recordings and music videos.
 */
@NonNull
public static final String Label = "Label";
/**
 * : The main genre of the audio or video. e.g. classical, ambient-house, synthpop, sci-fi, drama, etc.
 */
@NonNull
public static final String Genre = "Genre";
/**
 * : Intended to reflect the mood of the item with a few keywords, e.g. Romantic, Sad, Uplifting, etc.
 */
@NonNull
public static final String Mood = "Mood";
/**
 * : The type of the item. e.g. Documentary, Feature Film, Cartoon, Music Video, Music, Sound FX, etc.
 */
@NonNull
public static final String ContentType = "ContentType";
/**
 * : Describes the topic of the file, such as Aerial view of Seattle..
 */
@NonNull
public static final String Subject = "Subject";
/**
 * : A short description of the contents, such as Two birds flying.
 */
@NonNull
public static final String Description = "Description";
/**
 * : Keywords to the item separated by a comma, used for searching.
 */
@NonNull
public static final String Keywords = "Keywords";
/**
 * : A plot outline or a summary of the story.
 */
@NonNull
public static final String Summary = "Summary";
/**
 * : A description of the story line of the item.
 */
@NonNull
public static final String Synopsis = "Synopsis";
/**
 * : Describes the period that the piece is from or about. e.g. Renaissance.
 */
@NonNull
public static final String Period = "Period";
/**
 * : Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo).
 */
@NonNull
public static final String LawRating = "LawRating";
/**
 * : Reason for the law rating
 */
@NonNull
public static final String LawRating_Reason = "LawRating_Reason";
/**
 * : The ICRA rating. (Previously RSACi)
 */
@NonNull
public static final String ICRA = "ICRA";
/**
 * : The date/year that the item was released.
 */
@NonNull
public static final String Released_Date = "Released_Date";
/**
 * : The date/year that the item was originaly released.
 */
@NonNull
public static final String Original_Released_Date = "Original/Released_Date";
/**
 * : The time/date/year that the recording began.
 */
@NonNull
public static final String Recorded_Date = "Recorded_Date";
/**
 * : The time/date/year that the encoding of this item was completed began.
 */
@NonNull
public static final String Encoded_Date = "Encoded_Date";
/**
 * : The time/date/year that the tags were done for this item.
 */
@NonNull
public static final String Tagged_Date = "Tagged_Date";
/**
 * : The time/date/year that the composition of the music/script began.
 */
@NonNull
public static final String Written_Date = "Written_Date";
/**
 * : The time/date/year that the item was tranfered to a digitalmedium.
 */
@NonNull
public static final String Mastered_Date = "Mastered_Date";
/**
 * : The time that the file was created on the file system
 */
@NonNull
public static final String File_Created_Date = "File_Created_Date";
/**
 * : The time that the file was created on the file system (Warning: this field depends of local configuration, do not use it in an international database)
 */
@NonNull
public static final String File_Created_Date_Local = "File_Created_Date_Local";
/**
 * : The time that the file was modified on the file system
 */
@NonNull
public static final String File_Modified_Date = "File_Modified_Date";
/**
 * : The time that the file was modified on the file system (Warning: this field depends of local configuration, do not use it in an international database)
 */
@NonNull
public static final String File_Modified_Date_Local = "File_Modified_Date_Local";
/**
 * : Location where track was recorded. (See COMPOSITION_LOCATION for format)
 */
@NonNull
public static final String Recorded_Location = "Recorded_Location";
/**
 * : Location that the item was originaly designed/written. Information should be stored in the following format: country code, state/province, city where the coutry code is the same 2 octets as in Internet domains, or possibly ISO-3166. e.g. US, Texas, Austin or US, , Austin.
 */
@NonNull
public static final String Written_Location = "Written_Location";
/**
 * : Location, where an item is archived, e.eg. Louvre,Paris,France
 */
@NonNull
public static final String Archival_Location = "Archival_Location";
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
 * : Describes whether an image has been cropped and, if so, how it was cropped.
 */
@NonNull
public static final String Cropped = "Cropped";
/**
 * : Specifies the size of the original subject of the file. eg 8.5 in h, 11 in w
 */
@NonNull
public static final String Dimensions = "Dimensions";
/**
 * : Stores dots per inch setting of the digitizer used to produce the file
 */
@NonNull
public static final String DotsPerInch = "DotsPerInch";
/**
 * : Describes the changes in lightness settings on the digitizer required to produce the file
 */
@NonNull
public static final String Lightness = "Lightness";
/**
 * : Original medium of the material, e.g. vinyl, Audio-CD, Super8 or BetaMax
 */
@NonNull
public static final String OriginalSourceMedium = "OriginalSourceMedium";
/**
 * : Original form of the material, e.g. slide, paper, map
 */
@NonNull
public static final String OriginalSourceForm = "OriginalSourceForm";
/**
 * : Number of colors requested when digitizing, e.g. 256 for images or 32 bit RGB for video
 */
@NonNull
public static final String OriginalSourceForm_NumCol = "OriginalSourceForm/NumCol";
/**
 * : Name of the product the file was originally intended for
 */
@NonNull
public static final String OriginalSourceForm_Name = "OriginalSourceForm/Name";
/**
 * : Describes whether an image has been cropped and, if so, how it was cropped. e.g. 16:9 to 4:3, top and bottom
 */
@NonNull
public static final String OriginalSourceForm_Croppe = "OriginalSourceForm/Croppe";
/**
 * : Identifies the changes in sharpness for the digitizer requiered to produce the file
 */
@NonNull
public static final String OriginalSourceForm_Sharpn = "OriginalSourceForm/Sharpn";
/**
 * : Software used to tag this file
 */
@NonNull
public static final String Tagged_Application = "Tagged_Application";
/**
 * : Average number of beats per minute
 */
@NonNull
public static final String BPM = "BPM";
/**
 * : International Standard Recording Code, excluding the ISRC prefix and including hyphens.
 */
@NonNull
public static final String ISRC = "ISRC";
/**
 * : International Standard Book Number.
 */
@NonNull
public static final String ISBN = "ISBN";
/**
 * : EAN-13 (13-digit European Article Numbering) or UPC-A (12-digit Universal Product Code) bar code identifier.
 */
@NonNull
public static final String BarCode = "BarCode";
/**
 * : Library of Congress Control Number.
 */
@NonNull
public static final String LCCN = "LCCN";
/**
 * : A label-specific catalogue number used to identify the release. e.g. TIC 01.
 */
@NonNull
public static final String CatalogNumber = "CatalogNumber";
/**
 * : A 4-digit or 5-digit number to identify the record label, typically printed as (LC) xxxx or (LC) 0xxxx on CDs medias or covers, with only the number being stored.
 */
@NonNull
public static final String LabelCode = "LabelCode";
/**
 * : Owner of the file
 */
@NonNull
public static final String Owner = "Owner";
/**
 * : Copyright attribution.
 */
@NonNull
public static final String Copyright = "Copyright";
/**
 * : Link to a site with copyright/legal information.
 */
@NonNull
public static final String Copyright_Url = "Copyright/Url";
/**
 * : The copyright information as per the productioncopyright holder.
 */
@NonNull
public static final String Producer_Copyright = "Producer_Copyright";
/**
 * : License information, e.g., All Rights Reserved,Any Use Permitted.
 */
@NonNull
public static final String TermsOfUse = "TermsOfUse";
/**
 * ServiceName
 */
@NonNull
public static final String ServiceName = "ServiceName";
/**
 * ServiceChannel
 */
@NonNull
public static final String ServiceChannel = "ServiceChannel";
/**
 * Service/Url
 */
@NonNull
public static final String Service_Url = "Service/Url";
/**
 * ServiceProvider
 */
@NonNull
public static final String ServiceProvider = "ServiceProvider";
/**
 * ServiceProviderr/Url
 */
@NonNull
public static final String ServiceProviderr_Url = "ServiceProviderr/Url";
/**
 * ServiceType
 */
@NonNull
public static final String ServiceType = "ServiceType";
/**
 * NetworkName
 */
@NonNull
public static final String NetworkName = "NetworkName";
/**
 * OriginalNetworkName
 */
@NonNull
public static final String OriginalNetworkName = "OriginalNetworkName";
/**
 * Country
 */
@NonNull
public static final String Country = "Country";
/**
 * TimeZone
 */
@NonNull
public static final String TimeZone = "TimeZone";
/**
 * : Is there a cover
 */
@NonNull
public static final String Cover = "Cover";
/**
 * : short descriptio, e.g. Earth in space
 */
@NonNull
public static final String Cover_Description = "Cover_Description";
/**
 * Cover_Type
 */
@NonNull
public static final String Cover_Type = "Cover_Type";
/**
 * Cover_Mime
 */
@NonNull
public static final String Cover_Mime = "Cover_Mime";
/**
 * : Cover, in binary format encoded BASE64
 */
@NonNull
public static final String Cover_Data = "Cover_Data";
/**
 * : Text of a song
 */
@NonNull
public static final String Lyrics = "Lyrics";
/**
 * : Any comment related to the content.
 */
@NonNull
public static final String Comment = "Comment";
/**
 * : A numeric value defining how much a person likes the song/movie. The number is between 0 and 5 with decimal values possible (e.g. 2.7), 5(.0) being the highest possible rating.
 */
@NonNull
public static final String Rating = "Rating";
/**
 * : Date/year the item was added to the owners collection
 */
@NonNull
public static final String Added_Date = "Added_Date";
/**
 * : The date, the owner first played an item
 */
@NonNull
public static final String Played_First_Date = "Played_First_Date";
/**
 * : The date, the owner last played an item
 */
@NonNull
public static final String Played_Last_Date = "Played_Last_Date";
/**
 * : Number of times an item was played
 */
@NonNull
public static final String Played_Count = "Played_Count";
/**
 * EPG_Positions_Begin
 */
@NonNull
public static final String EPG_Positions_Begin = "EPG_Positions_Begin";
/**
 * EPG_Positions_End
 */
@NonNull
public static final String EPG_Positions_End = "EPG_Positions_End";

}
