package aka.jmetadata.main.constants;

import org.eclipse.jdt.annotation.NonNull;

/**
 * General constants parameters.
 *
 * @author Welle Charlotte
 */
public final class General {

   /**
    * Library of Congress Control Number..
    */
    @NonNull
    public static final String LCCN = "LCCN";

   /**
    * Owner of the file.
    */
    @NonNull
    public static final String OWNER = "Owner";

   /**
    * NetworkName.
    */
    @NonNull
    public static final String NETWORKNAME = "NetworkName";

   /**
    * Text Codecs in this file, separated by /.
    */
    @NonNull
    public static final String TEXTFORMATLIST = "Text_Format_List";

   /**
    * iTunes compilation.
    */
    @NonNull
    public static final String COMPILATION = "Compilation";

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
    * (Generic)More info about the title of file.
    */
    @NonNull
    public static final String TITLEMORE = "Title_More";

   /**
    * Describes the changes in lightness settings on the digitizer required to produce the file.
    */
    @NonNull
    public static final String LIGHTNESS = "Lightness";

   /**
    * Identifies the changes in sharpness for the digitizer requiered to produce the file.
    */
    @NonNull
    public static final String ORIGINALSOURCEFORMSHARPNESS = "OriginalSourceForm/Sharpness";

   /**
    * File extension only.
    */
    @NonNull
    public static final String FILEEXTENSION = "FileExtension";

   /**
    * Real name of an actor or actress playing a role in the movie..
    */
    @NonNull
    public static final String ACTOR = "Actor";

   /**
    * name of the person or organization that commissioned the subject of the file.
    */
    @NonNull
    public static final String COMMISSIONEDBY = "CommissionedBy";

   /**
    * Compression method used.
    */
    @NonNull
    public static final String FORMATCOMPRESSION = "Format_Compression";

   /**
    * Band/orchestra/accompaniment/musician..
    */
    @NonNull
    public static final String ACCOMPANIMENT = "Accompaniment";

   /**
    * Cover, in binary format encoded BASE64.
    */
    @NonNull
    public static final String COVERDATA = "Cover_Data";

   /**
    * Video Codecs in this file, separated by /.
    */
    @NonNull
    public static final String VIDEOFORMATLIST = "Video_Format_List";

   /**
    * Delay with measurement.
    */
    @NonNull
    public static final String DELAYSTRING = "Delay/String";

   /**
    * The date/year that the item was released..
    */
    @NonNull
    public static final String RELEASEDDATE = "Released_Date";

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
    * File size (with measure, 2 digit mini).
    */
    @NonNull
    public static final String FILESIZESTRING2 = "FileSize/String2";

   /**
    * Original name of the track in the original support.
    */
    @NonNull
    public static final String ORIGINALTRACK = "Original/Track";

   /**
    * Podcast category.
    */
    @NonNull
    public static final String PODCASTCATEGORY = "PodcastCategory";

   /**
    * File size (with measure, 1 digit mini).
    */
    @NonNull
    public static final String FILESIZESTRING1 = "FileSize/String1";

   /**
    * Frames per second.
    */
    @NonNull
    public static final String FRAMERATE = "FrameRate";

   /**
    * Number of this track.
    */
    @NonNull
    public static final String TRACKPOSITION = "Track/Position";

   /**
    * Name of the assistant director..
    */
    @NonNull
    public static final String ASSISTANTDIRECTOR = "AssistantDirector";

   /**
    * Version of the CodecID.
    */
    @NonNull
    public static final String CODECIDVERSION = "CodecID_Version";

   /**
    * Video languagesin this file, full names, separated by /.
    */
    @NonNull
    public static final String VIDEOLANGUAGELIST = "Video_Language_List";

   /**
    * Encryption_Format.
    */
    @NonNull
    public static final String ENCRYPTIONFORMAT = "Encryption_Format";

   /**
    * Original name of album, serie....
    */
    @NonNull
    public static final String ORIGINALALBUM = "Original/Album";

   /**
    * Original form of the material, e.g. slide, paper, map.
    */
    @NonNull
    public static final String ORIGINALSOURCEFORM = "OriginalSourceForm";

   /**
    * Delay settings (in case of timecode for example).
    */
    @NonNull
    public static final String DELAYSETTINGS = "Delay_Settings";

   /**
    * TimeZone.
    */
    @NonNull
    public static final String TIMEZONE = "TimeZone";

   /**
    * Image Codecs in this file, separated by /.
    */
    @NonNull
    public static final String IMAGEFORMATLIST = "Image_Format_List";

   /**
    * Number of menu streams.
    */
    @NonNull
    public static final String MENUCOUNT = "MenuCount";

   /**
    * Image Codecs in this file with popular name (hint), separated by /.
    */
    @NonNull
    public static final String IMAGEFORMATWITHHINTLIST = "Image_Format_WithHint_List";

   /**
    * Name of the part. e.g. CD1, CD2.
    */
    @NonNull
    public static final String PART = "Part";

   /**
    * Bit rate mode of all streams (Variable, Constant).
    */
    @NonNull
    public static final String OVERALLBITRATEMODESTRING = "OverallBitRate_Mode/String";

   /**
    * Place of the part e.g. 2 of 3.
    */
    @NonNull
    public static final String PARTPOSITIONTOTAL = "Part/Position_Total";

   /**
    * Original name of the movie.
    */
    @NonNull
    public static final String ORIGINALMOVIE = "Original/Movie";

   /**
    * The maximum absolute peak value of the item.
    */
    @NonNull
    public static final String ALBUMREPLAYGAINPEAK = "Album_ReplayGain_Peak";

   /**
    * File size (with measure, 4 digit mini).
    */
    @NonNull
    public static final String FILESIZESTRING4 = "FileSize/String4";

   /**
    * File size (with measure, 3 digit mini).
    */
    @NonNull
    public static final String FILESIZESTRING3 = "FileSize/String3";

   /**
    * Name of the artist(s), that interpreted, remixed, or otherwise modified the item..
    */
    @NonNull
    public static final String REMIXEDBY = "RemixedBy";

   /**
    * Name of the subtrack..
    */
    @NonNull
    public static final String SUBTRACK = "SubTrack";

   /**
    * Package name i.e. technical flavor of the content.
    */
    @NonNull
    public static final String PACKAGENAME = "PackageName";

   /**
    * Original medium of the material, e.g. vinyl, Audio-CD, Super8 or BetaMax.
    */
    @NonNull
    public static final String ORIGINALSOURCEMEDIUM = "OriginalSourceMedium";

   /**
    * File name only.
    */
    @NonNull
    public static final String FILENAME = "FileName";

   /**
    * Comic/Position_Total.
    */
    @NonNull
    public static final String COMICPOSITIONTOTAL = "Comic/Position_Total";

   /**
    * Main music-artist for a movie.
    */
    @NonNull
    public static final String MUSICBY = "MusicBy";

   /**
    * The time/date/year that the composition of the music/script began..
    */
    @NonNull
    public static final String WRITTENDATE = "Written_Date";

   /**
    * The time that the file was modified on the file system.
    */
    @NonNull
    public static final String FILEMODIFIEDDATE = "File_Modified_Date";

   /**
    * Version of encoding-software.
    */
    @NonNull
    public static final String ENCODEDLIBRARYVERSION = "Encoded_Library_Version";

   /**
    * Info about this codec.
    */
    @NonNull
    public static final String CODECIDINFO = "CodecID/Info";

   /**
    * Stream size in bytes.
    */
    @NonNull
    public static final String STREAMSIZE = "StreamSize";

   /**
    * Name of the season, e.g. Strawars first Trilogy, Season 1.
    */
    @NonNull
    public static final String SEASON = "Season";

   /**
    * The name of the costume designer..
    */
    @NonNull
    public static final String COSTUMEDESIGNER = "CostumeDesigner";

   /**
    * Original artist(s)/performer(s)..
    */
    @NonNull
    public static final String ORIGINALPERFORMER = "Original/Performer";

   /**
    * Other formats in this file with popular name (hint), separated by /.
    */
    @NonNull
    public static final String OTHERFORMATWITHHINTLIST = "Other_Format_WithHint_List";

   /**
    * Info about this Format.
    */
    @NonNull
    public static final String FORMATINFO = "Format/Info";

   /**
    * If Audio and video are muxed.
    */
    @NonNull
    public static final String INTERLEAVED = "Interleaved";

   /**
    * A link to more details about this codec ID.
    */
    @NonNull
    public static final String CODECIDURL = "CodecID/Url";

   /**
    * Encryption_Mode.
    */
    @NonNull
    public static final String ENCRYPTIONMODE = "Encryption_Mode";

   /**
    * Location that the item was originaly designed/written. Information should be stored in the following format: country code, state/province, city where the coutry code is the same 2 octets as in Internet domains, or possibly ISO-3166. e.g. US, Texas, Austin or US, , Austin..
    */
    @NonNull
    public static final String WRITTENLOCATION = "Written_Location";

   /**
    * Specifies the size of the original subject of the file. eg 8.5 in h, 11 in w.
    */
    @NonNull
    public static final String DIMENSIONS = "Dimensions";

   /**
    * Name of the organization publishing the album (i.e. the 'record label') or movie..
    */
    @NonNull
    public static final String PUBLISHER = "Publisher";

   /**
    * Cover_Type.
    */
    @NonNull
    public static final String COVERTYPE = "Cover_Type";

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
    * Is there a cover.
    */
    @NonNull
    public static final String COVER = "Cover";

   /**
    * Commercial name used by vendor for theses setings if there is one.
    */
    @NonNull
    public static final String FORMATCOMMERCIALIFANY = "Format_Commercial_IfAny";

   /**
    * The time/date/year that the tags were done for this item..
    */
    @NonNull
    public static final String TAGGEDDATE = "Tagged_Date";

   /**
    * Name of the product the file was originally intended for.
    */
    @NonNull
    public static final String ORIGINALSOURCEFORMNAME = "OriginalSourceForm/Name";

   /**
    * Album performer/artist of this file.
    */
    @NonNull
    public static final String ALBUMPERFORMER = "Album/Performer";

   /**
    * A very general tag for everyone else that wants to be listed..
    */
    @NonNull
    public static final String THANKSTO = "ThanksTo";

   /**
    * The ID for this stream in this file.
    */
    @NonNull
    public static final String IDSTRING = "ID/String";

   /**
    * Comic_More.
    */
    @NonNull
    public static final String COMICMORE = "Comic_More";

   /**
    * The person responsible for designing the Overall visual appearance of a movie..
    */
    @NonNull
    public static final String PRODUCTIONDESIGNER = "ProductionDesigner";

   /**
    * The time/date/year that the encoding of this item was completed began..
    */
    @NonNull
    public static final String ENCODEDDATE = "Encoded_Date";

   /**
    * ServiceChannel.
    */
    @NonNull
    public static final String SERVICECHANNEL = "ServiceChannel";

   /**
    * The unique ID for this stream, should be copied with stream copy.
    */
    @NonNull
    public static final String UNIQUEID = "UniqueID";

   /**
    * format : HH:MM:SS.MMM.
    */
    @NonNull
    public static final String DELAYSTRING3 = "Delay/String3";

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
    * Brand or trademark associated with the marketing of music recordings and music videos..
    */
    @NonNull
    public static final String LABEL = "Label";

   /**
    * Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @NonNull
    public static final String DELAYSTRING5 = "Delay/String5";

   /**
    * Link to a site about this track.
    */
    @NonNull
    public static final String TRACKURL = "Track/Url";

   /**
    * Original name of the part in the original support.
    */
    @NonNull
    public static final String ORIGINALPART = "Original/Part";

   /**
    * Encryption_Padding.
    */
    @NonNull
    public static final String ENCRYPTIONPADDING = "Encryption_Padding";

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
    * Cover_Mime.
    */
    @NonNull
    public static final String COVERMIME = "Cover_Mime";

   /**
    * DataSize.
    */
    @NonNull
    public static final String DATASIZE = "DataSize";

   /**
    * Software used to create the file.
    */
    @NonNull
    public static final String ENCODEDLIBRARY = "Encoded_Library";

   /**
    * Number of the part.
    */
    @NonNull
    public static final String PARTPOSITION = "Part/Position";

   /**
    * Complete name (Folder+Name+Extension) of the last file (in the case of a sequence of files).
    */
    @NonNull
    public static final String COMPLETENAMELAST = "CompleteName_Last";

   /**
    * Text of a song.
    */
    @NonNull
    public static final String LYRICS = "Lyrics";

   /**
    * Internet Media Type (aka MIME Type, Content-Type).
    */
    @NonNull
    public static final String INTERNETMEDIATYPE = "InternetMediaType";

   /**
    * Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo)..
    */
    @NonNull
    public static final String LAWRATING = "LawRating";

   /**
    * Frames per second, denominator.
    */
    @NonNull
    public static final String FRAMERATEDEN = "FrameRate_Den";

   /**
    * Encryption_Method.
    */
    @NonNull
    public static final String ENCRYPTIONMETHOD = "Encryption_Method";

   /**
    * The name of the director of photography, also known as cinematographer..
    */
    @NonNull
    public static final String DIRECTOROFPHOTOGRAPHY = "DirectorOfPhotography";

   /**
    * Audio Codecs in this file,separated by /.
    */
    @NonNull
    public static final String AUDIOFORMATLIST = "Audio_Format_List";

   /**
    * Other formats in this file, separated by /.
    */
    @NonNull
    public static final String OTHERFORMATLIST = "Other_Format_List";

   /**
    * The person who arranged the piece. e.g. Ravel..
    */
    @NonNull
    public static final String ARRANGER = "Arranger";

   /**
    * The person who oversees the artists and craftspeople who build the sets..
    */
    @NonNull
    public static final String ARTDIRECTOR = "ArtDirector";

   /**
    * Number of the Season.
    */
    @NonNull
    public static final String SEASONPOSITION = "Season_Position";

   /**
    * Number of colors requested when digitizing, e.g. 256 for images or 32 bit RGB for video.
    */
    @NonNull
    public static final String ORIGINALSOURCEFORMNUMCOLORS = "OriginalSourceForm/NumColors";

   /**
    * Play time of the stream in ms.
    */
    @NonNull
    public static final String DURATION = "Duration";

   /**
    * Nationality of the main composer of the item, mostly for classical music..
    */
    @NonNull
    public static final String COMPOSERNATIONALITY = "Composer/Nationality";

   /**
    * A hint/popular name for this codec.
    */
    @NonNull
    public static final String CODECIDHINT = "CodecID/Hint";

   /**
    * Service/Url.
    */
    @NonNull
    public static final String SERVICEURL = "Service/Url";

   /**
    * Name of the person or organisation that encoded/ripped the audio file..
    */
    @NonNull
    public static final String ENCODEDBY = "EncodedBy";

   /**
    * Name of the software package used to create the file, such as Microsoft WaveEdit.
    */
    @NonNull
    public static final String ENCODEDAPPLICATION = "Encoded_Application";

   /**
    * ServiceName.
    */
    @NonNull
    public static final String SERVICENAME = "ServiceName";

   /**
    * ServiceProvider.
    */
    @NonNull
    public static final String SERVICEPROVIDER = "ServiceProvider";

   /**
    * Image languages in this file, separated by /.
    */
    @NonNull
    public static final String IMAGELANGUAGELIST = "Image_Language_List";

   /**
    * StreamSize/String2.
    */
    @NonNull
    public static final String STREAMSIZESTRING2 = "StreamSize/String2";

   /**
    * The artist(s) who performed the work. In classical music this would be the conductor, orchestra, soloists..
    */
    @NonNull
    public static final String CONDUCTOR = "Conductor";

   /**
    * The time that the file was created on the file system.
    */
    @NonNull
    public static final String FILECREATEDDATE = "File_Created_Date";

   /**
    * Location, where an item is archived, e.eg. Louvre,Paris,France.
    */
    @NonNull
    public static final String ARCHIVALLOCATION = "Archival_Location";

   /**
    * ServiceProviderr/Url.
    */
    @NonNull
    public static final String SERVICEPROVIDERRURL = "ServiceProviderr/Url";

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
    * Univers movies belong to, e.g. Starwars, Stargate, Buffy, Dragonballs.
    */
    @NonNull
    public static final String DOMAIN = "Domain";

   /**
    * Homepage of the performer/artist.
    */
    @NonNull
    public static final String PERFORMERURL = "Performer/Url";

   /**
    * Minimum Bit rate in bps.
    */
    @NonNull
    public static final String OVERALLBITRATEMINIMUM = "OverallBitRate_Minimum";

   /**
    * StreamSize/String3.
    */
    @NonNull
    public static final String STREAMSIZESTRING3 = "StreamSize/String3";

   /**
    * Publishers official webpage..
    */
    @NonNull
    public static final String PUBLISHERURL = "Publisher/URL";

   /**
    * With proportion.
    */
    @NonNull
    public static final String STREAMSIZESTRING5 = "StreamSize/String5";

   /**
    * Stream type name.
    */
    @NonNull
    public static final String STREAMKIND = "StreamKind";

   /**
    * Keywords to the item separated by a comma, used for searching..
    */
    @NonNull
    public static final String KEYWORDS = "Keywords";

   /**
    * A numeric value defining how much a person likes the song/movie. The number is between 0 and 5 with decimal values possible (e.g. 2.7), 5(.0) being the highest possible rating..
    */
    @NonNull
    public static final String RATING = "Rating";

   /**
    * Maximum Bit rate (with measurement).
    */
    @NonNull
    public static final String OVERALLBITRATEMAXIMUMSTRING = "OverallBitRate_Maximum/String";

   /**
    * The date/year that the item was originaly released..
    */
    @NonNull
    public static final String ORIGINALRELEASEDDATE = "Original/Released_Date";

   /**
    * Codec ID (found in some containers).
    */
    @NonNull
    public static final String CODECID = "CodecID";

   /**
    * Album/Sort.
    */
    @NonNull
    public static final String ALBUMSORT = "Album/Sort";

   /**
    * Audio languages in this file separated by /.
    */
    @NonNull
    public static final String AUDIOLANGUAGELIST = "Audio_Language_List";

   /**
    * The name of a co-producer..
    */
    @NonNull
    public static final String COPRODUCER = "CoProducer";

   /**
    * International Standard Book Number..
    */
    @NonNull
    public static final String ISBN = "ISBN";

   /**
    * The name of the choregrapher..
    */
    @NonNull
    public static final String CHOREGRAPHER = "Choregrapher";

   /**
    * Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @NonNull
    public static final String ENCODEDLIBRARYSTRING = "Encoded_Library/String";

   /**
    * Complete name (Folder+Name+Extension).
    */
    @NonNull
    public static final String COMPLETENAME = "CompleteName";

   /**
    * StreamSize/String.
    */
    @NonNull
    public static final String STREAMSIZESTRING = "StreamSize/String";

   /**
    * The ID for this stream in the original medium of the material.
    */
    @NonNull
    public static final String ORIGINALSOURCEMEDIUMIDSTRING = "OriginalSourceMedium_ID/String";

   /**
    * Company the item is mainly distributed by .
    */
    @NonNull
    public static final String DISTRIBUTEDBY = "DistributedBy";

   /**
    * The time that the file was modified on the file system (Warning: this field depends of local configuration, do not use it in an international database).
    */
    @NonNull
    public static final String FILEMODIFIEDDATELOCAL = "File_Modified_Date_Local";

   /**
    * Frame count (a frame contains a count of samples depends of the format).
    */
    @NonNull
    public static final String FRAMECOUNT = "FrameCount";

   /**
    * Encryption_Length.
    */
    @NonNull
    public static final String ENCRYPTIONLENGTH = "Encryption_Length";

   /**
    * (Generic)Title of file.
    */
    @NonNull
    public static final String TITLE = "Title";

   /**
    * The ICRA rating. (Previously RSACi).
    */
    @NonNull
    public static final String ICRA = "ICRA";

   /**
    * Delay drop frame.
    */
    @NonNull
    public static final String DELAYDROPFRAME = "Delay_DropFrame";

   /**
    * (Generic)Url.
    */
    @NonNull
    public static final String TITLEURL = "Title/Url";

   /**
    * Composer/Sort.
    */
    @NonNull
    public static final String COMPOSERSORT = "Composer/Sort";

   /**
    * Describes the topic of the file, such as Aerial view of Seattle...
    */
    @NonNull
    public static final String SUBJECT = "Subject";

   /**
    * More infos about the movie.
    */
    @NonNull
    public static final String MOVIEMORE = "Movie_More";

   /**
    * Bit rate mode of all streams (VBR, CBR).
    */
    @NonNull
    public static final String OVERALLBITRATEMODE = "OverallBitRate_Mode";

   /**
    * The author of the screenplay or scenario (used for movies and TV shows)..
    */
    @NonNull
    public static final String SCREENPLAYBY = "ScreenplayBy";

   /**
    * The name of an executive producer..
    */
    @NonNull
    public static final String EXECUTIVEPRODUCER = "ExecutiveProducer";

   /**
    * International Standard Recording Code, excluding the ISRC prefix and including hyphens..
    */
    @NonNull
    public static final String ISRC = "ISRC";

   /**
    * Stream size divided by file size.
    */
    @NonNull
    public static final String STREAMSIZEPROPORTION = "StreamSize_Proportion";

   /**
    * HeaderSize.
    */
    @NonNull
    public static final String HEADERSIZE = "HeaderSize";

   /**
    * Parameters used by the software.
    */
    @NonNull
    public static final String ENCODEDLIBRARYSETTINGS = "Encoded_Library_Settings";

   /**
    * The type of the item. e.g. Documentary, Feature Film, Cartoon, Music Video, Music, Sound FX, etc..
    */
    @NonNull
    public static final String CONTENTTYPE = "ContentType";

   /**
    * short descriptio, e.g. Earth in space.
    */
    @NonNull
    public static final String COVERDESCRIPTION = "Cover_Description";

   /**
    * Count of objects available in this stream.
    */
    @NonNull
    public static final String COUNT = "Count";

   /**
    * Encryption.
    */
    @NonNull
    public static final String ENCRYPTION = "Encryption";

   /**
    * Frames per second, numerator.
    */
    @NonNull
    public static final String FRAMERATENUM = "FrameRate_Num";

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
    * ServiceType.
    */
    @NonNull
    public static final String SERVICETYPE = "ServiceType";

   /**
    * Nominal Bit rate in bps.
    */
    @NonNull
    public static final String OVERALLBITRATENOMINAL = "OverallBitRate_Nominal";

   /**
    * The ID for this stream in this file.
    */
    @NonNull
    public static final String ID = "ID";

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
    * FooterSize.
    */
    @NonNull
    public static final String FOOTERSIZE = "FooterSize";

   /**
    * Software used to tag this file.
    */
    @NonNull
    public static final String TAGGEDAPPLICATION = "Tagged_Application";

   /**
    * License information, e.g., All Rights Reserved,Any Use Permitted..
    */
    @NonNull
    public static final String TERMSOFUSE = "TermsOfUse";

   /**
    * Bit rate of all streams in bps.
    */
    @NonNull
    public static final String OVERALLBITRATE = "OverallBitRate";

   /**
    * Name of the director..
    */
    @NonNull
    public static final String DIRECTOR = "Director";

   /**
    * iTunes grouping.
    */
    @NonNull
    public static final String GROUPING = "Grouping";

   /**
    * Chapters languages in this file, separated by /.
    */
    @NonNull
    public static final String OTHERLANGUAGELIST = "Other_Language_List";

   /**
    * Intended to reflect the mood of the item with a few keywords, e.g. Romantic, Sad, Uplifting, etc..
    */
    @NonNull
    public static final String MOOD = "Mood";

   /**
    * Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @NonNull
    public static final String ENCODEDAPPLICATIONSTRING = "Encoded_Application/String";

   /**
    * More infos about the album.
    */
    @NonNull
    public static final String ALBUMMORE = "Album_More";

   /**
    * iTunes compilation.
    */
    @NonNull
    public static final String COMPILATIONSTRING = "Compilation/String";

   /**
    * Country.
    */
    @NonNull
    public static final String COUNTRY = "Country";

   /**
    * The time that the file was created on the file system (Warning: this field depends of local configuration, do not use it in an international database).
    */
    @NonNull
    public static final String FILECREATEDDATELOCAL = "File_Created_Date_Local";

   /**
    * Original lyricist(s)/text writer(s)..
    */
    @NonNull
    public static final String ORIGINALLYRICIST = "Original/Lyricist";

   /**
    * A short description of the contents, such as Two birds flying..
    */
    @NonNull
    public static final String DESCRIPTION = "Description";

   /**
    * Text languages in this file, separated by /.
    */
    @NonNull
    public static final String TEXTLANGUAGELIST = "Text_Language_List";

   /**
    * Describes whether an image has been cropped and, if so, how it was cropped..
    */
    @NonNull
    public static final String CROPPED = "Cropped";

   /**
    * Last **Inform** call.
    */
    @NonNull
    public static final String INFORM = "Inform";

   /**
    * The time/date/year that the recording began..
    */
    @NonNull
    public static final String RECORDEDDATE = "Recorded_Date";

   /**
    * Menu languages in this file, separated by /.
    */
    @NonNull
    public static final String MENULANGUAGELIST = "Menu_Language_List";

   /**
    * File size (with measure).
    */
    @NonNull
    public static final String FILESIZESTRING = "FileSize/String";

   /**
    * Reason for the law rating.
    */
    @NonNull
    public static final String LAWRATINGREASON = "LawRating_Reason";

   /**
    * Compatible CodecIDs.
    */
    @NonNull
    public static final String CODECIDCOMPATIBLE = "CodecID_Compatible";

   /**
    * Stores dots per inch setting of the digitizer used to produce the file.
    */
    @NonNull
    public static final String DOTSPERINCH = "DotsPerInch";

   /**
    * The date, the owner last played an item.
    */
    @NonNull
    public static final String PLAYEDLASTDATE = "Played_Last_Date";

   /**
    * Folder name only.
    */
    @NonNull
    public static final String FOLDERNAME = "FolderName";

   /**
    * Name of the codirector..
    */
    @NonNull
    public static final String CODIRECTOR = "CoDirector";

   /**
    * Number of times an item was played.
    */
    @NonNull
    public static final String PLAYEDCOUNT = "Played_Count";

   /**
    * Number of the stream (base=0).
    */
    @NonNull
    public static final String STREAMKINDID = "StreamKindID";

   /**
    * Folder name only of the last file (in the case of a sequence of files).
    */
    @NonNull
    public static final String FOLDERNAMELAST = "FolderName_Last";

   /**
    * A label-specific catalogue number used to identify the release. e.g. TIC 01..
    */
    @NonNull
    public static final String CATALOGNUMBER = "CatalogNumber";

   /**
    * Location where track was recorded. (See COMPOSITION_LOCATION for format).
    */
    @NonNull
    public static final String RECORDEDLOCATION = "Recorded_Location";

   /**
    * File extension only of the last file (in the case of a sequence of files).
    */
    @NonNull
    public static final String FILEEXTENSIONLAST = "FileExtension_Last";

   /**
    * The date, the owner first played an item.
    */
    @NonNull
    public static final String PLAYEDFIRSTDATE = "Played_First_Date";

   /**
    * Link to a description of this format.
    */
    @NonNull
    public static final String FORMATURL = "Format/Url";

   /**
    * Frames per second (with measurement).
    */
    @NonNull
    public static final String FRAMERATESTRING = "FrameRate/String";

   /**
    * Album/Performer/Sort.
    */
    @NonNull
    public static final String ALBUMPERFORMERSORT = "Album/Performer/Sort";

   /**
    * Name of the movie. Eg : Starwars, a new hope.
    */
    @NonNull
    public static final String MOVIE = "Movie";

   /**
    * Name of the original composer..
    */
    @NonNull
    public static final String COMPOSER = "Composer";

   /**
    * Describes whether an image has been cropped and, if so, how it was cropped. e.g. 16:9 to 4:3, top and bottom.
    */
    @NonNull
    public static final String ORIGINALSOURCEFORMCROPPED = "OriginalSourceForm/Cropped";

   /**
    * Track/Sort.
    */
    @NonNull
    public static final String TRACKSORT = "Track/Sort";

   /**
    * Main production studio .
    */
    @NonNull
    public static final String PRODUCTIONSTUDIO = "ProductionStudio";

   /**
    * Number of audio streams.
    */
    @NonNull
    public static final String AUDIOCOUNT = "AudioCount";

   /**
    * Name of the chapter..
    */
    @NonNull
    public static final String CHAPTER = "Chapter";

   /**
    * A description of the story line of the item..
    */
    @NonNull
    public static final String SYNOPSIS = "Synopsis";

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
    * The main genre of the audio or video. e.g. classical, ambient-house, synthpop, sci-fi, drama, etc..
    */
    @NonNull
    public static final String GENRE = "Genre";

   /**
    * The time/date/year that the item was tranfered to a digitalmedium..
    */
    @NonNull
    public static final String MASTEREDDATE = "Mastered_Date";

   /**
    * Profile of the Format (old XML: 'Profile@Level' format.
    */
    @NonNull
    public static final String FORMATPROFILE = "Format_Profile";

   /**
    * StreamSize_Demuxed/String1.
    */
    @NonNull
    public static final String STREAMSIZEDEMUXEDSTRING1 = "StreamSize_Demuxed/String1";

   /**
    * EPG_Positions_End.
    */
    @NonNull
    public static final String EPGPOSITIONSEND = "EPG_Positions_End";

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
    * Encryption_InitializationVector.
    */
    @NonNull
    public static final String ENCRYPTIONINITIALIZATIONVECTOR = "Encryption_InitializationVector";

   /**
    * The gain to apply to reach 89dB SPL on playback.
    */
    @NonNull
    public static final String ALBUMREPLAYGAINGAIN = "Album_ReplayGain_Gain";

   /**
    * Level of the Format (only MIXML).
    */
    @NonNull
    public static final String FORMATLEVEL = "Format_Level";

   /**
    * StreamSize_Demuxed in with percentage value.
    */
    @NonNull
    public static final String STREAMSIZEDEMUXEDSTRING = "StreamSize_Demuxed/String";

   /**
    * Name of an audio-album. Eg : The joshua tree.
    */
    @NonNull
    public static final String ALBUM = "Album";

   /**
    * Text Codecs in this file with popular name (hint),separated by /.
    */
    @NonNull
    public static final String TEXTFORMATWITHHINTLIST = "Text_Format_WithHint_List";

   /**
    * Minimum Bit rate (with measurement).
    */
    @NonNull
    public static final String OVERALLBITRATEMINIMUMSTRING = "OverallBitRate_Minimum/String";

   /**
    * Copyright attribution..
    */
    @NonNull
    public static final String COPYRIGHT = "Copyright";

   /**
    * Count of streams of that kind available.
    */
    @NonNull
    public static final String STREAMCOUNT = "StreamCount";

   /**
    * The engineer who mastered the content for a physical medium or for digital distribution..
    */
    @NonNull
    public static final String MASTEREDBY = "MasteredBy";

   /**
    * Number of other streams.
    */
    @NonNull
    public static final String OTHERCOUNT = "OtherCount";

   /**
    * Number of general streams.
    */
    @NonNull
    public static final String GENERALCOUNT = "GeneralCount";

   /**
    * Link to a site with copyright/legal information..
    */
    @NonNull
    public static final String COPYRIGHTURL = "Copyright/Url";

   /**
    * Album_ReplayGain_Gain/String.
    */
    @NonNull
    public static final String ALBUMREPLAYGAINGAINSTRING = "Album_ReplayGain_Gain/String";

   /**
    * Number of video streams.
    */
    @NonNull
    public static final String VIDEOCOUNT = "VideoCount";

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
    * Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @NonNull
    public static final String DURATIONSTRING1 = "Duration/String1";

   /**
    * Nominal Bit rate (with measurement).
    */
    @NonNull
    public static final String OVERALLBITRATENOMINALSTRING = "OverallBitRate_Nominal/String";

   /**
    * Describes the period that the piece is from or about. e.g. Renaissance..
    */
    @NonNull
    public static final String PERIOD = "Period";

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
    * Duration_Start.
    */
    @NonNull
    public static final String DURATIONSTART = "Duration_Start";

   /**
    * OriginalNetworkName.
    */
    @NonNull
    public static final String ORIGINALNETWORKNAME = "OriginalNetworkName";

   /**
    * EPG_Positions_Begin.
    */
    @NonNull
    public static final String EPGPOSITIONSBEGIN = "EPG_Positions_Begin";

   /**
    * Video Codecs in this file with popular name (hint), separated by /.
    */
    @NonNull
    public static final String VIDEOFORMATWITHHINTLIST = "Video_Format_WithHint_List";

   /**
    * Delay source (Container or Stream or empty).
    */
    @NonNull
    public static final String DELAYSOURCE = "Delay_Source";

   /**
    * Main performer/artist of this file.
    */
    @NonNull
    public static final String PERFORMER = "Performer";

   /**
    * Name of the producer of the movie..
    */
    @NonNull
    public static final String PRODUCER = "Producer";

   /**
    * Place of the season e.g. 2 of 7.
    */
    @NonNull
    public static final String SEASONPOSITIONTOTAL = "Season_Position_Total";

   /**
    * Name of the character an actor or actress plays in this movie..
    */
    @NonNull
    public static final String ACTORCHARACTER = "Actor_Character";

   /**
    * Maximum Bit rate in bps.
    */
    @NonNull
    public static final String OVERALLBITRATEMAXIMUM = "OverallBitRate_Maximum";

   /**
    * Name of the series, e.g. Starwars movies, Stargate SG-1, Stargate Atlantis, Buffy, Angel.
    */
    @NonNull
    public static final String COLLECTION = "Collection";

   /**
    * StreamSize in bytes of hte stream after demux.
    */
    @NonNull
    public static final String STREAMSIZEDEMUXED = "StreamSize_Demuxed";

   /**
    * Menu Codecs in this file with popular name (hint),separated by /.
    */
    @NonNull
    public static final String MENUFORMATWITHHINTLIST = "Menu_Format_WithHint_List";

   /**
    * Settings needed for decoder used.
    */
    @NonNull
    public static final String FORMATSETTINGS = "Format_Settings";

   /**
    * File name only of the last file (in the case of a sequence of files).
    */
    @NonNull
    public static final String FILENAMELAST = "FileName_Last";

   /**
    * Average number of beats per minute.
    */
    @NonNull
    public static final String BPM = "BPM";

   /**
    * File size in bytes.
    */
    @NonNull
    public static final String FILESIZE = "FileSize";

   /**
    * Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    */
    @NonNull
    public static final String FIRSTPACKETORDER = "FirstPacketOrder";

   /**
    * IsStreamable.
    */
    @NonNull
    public static final String ISSTREAMABLE = "IsStreamable";

   /**
    * The person who wrote the lyrics for a musical item..
    */
    @NonNull
    public static final String LYRICIST = "Lyricist";

   /**
    * Duration_End.
    */
    @NonNull
    public static final String DURATIONEND = "Duration_End";

   /**
    * Known extensions of this format.
    */
    @NonNull
    public static final String FORMATEXTENSIONS = "Format/Extensions";

   /**
    * The copyright information as per the productioncopyright holder..
    */
    @NonNull
    public static final String PRODUCERCOPYRIGHT = "Producer_Copyright";

   /**
    * EAN-13 (13-digit European Article Numbering) or UPC-A (12-digit Universal Product Code) bar code identifier..
    */
    @NonNull
    public static final String BARCODE = "BarCode";

   /**
    * Bit rate of all streams (with measure).
    */
    @NonNull
    public static final String OVERALLBITRATESTRING = "OverallBitRate/String";

   /**
    * Number of text streams.
    */
    @NonNull
    public static final String TEXTCOUNT = "TextCount";

   /**
    * The name of the sound engineer or sound recordist..
    */
    @NonNull
    public static final String SOUNDENGINEER = "SoundEngineer";

   /**
    * A 4-digit or 5-digit number to identify the record label, typically printed as (LC) xxxx or (LC) 0xxxx on CDs medias or covers, with only the number being stored..
    */
    @NonNull
    public static final String LABELCODE = "LabelCode";

   /**
    * Number of image streams.
    */
    @NonNull
    public static final String IMAGECOUNT = "ImageCount";

   /**
    * Format used.
    */
    @NonNull
    public static final String FORMAT = "Format";

   /**
    * The author of the story or script..
    */
    @NonNull
    public static final String WRITTENBY = "WrittenBy";

   /**
    * Place of this track, e.g. 3 of 15.
    */
    @NonNull
    public static final String TRACKPOSITIONTOTAL = "Track/Position_Total";

   /**
    * Country, where the movie was procuced.
    */
    @NonNull
    public static final String MOVIECOUNTRY = "Movie/Country";

   /**
    * Homepage of the album performer/artist.
    */
    @NonNull
    public static final String ALBUMPERFORMERURL = "Album/Performer/Url";

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
    * Name of the comic..
    */
    @NonNull
    public static final String COMIC = "Comic";

   /**
    * Editors name.
    */
    @NonNull
    public static final String EDITEDBY = "EditedBy";

   /**
    * Commercial name used by vendor for theses setings or Format field if there is no difference.
    */
    @NonNull
    public static final String FORMATCOMMERCIAL = "Format_Commercial";

   /**
    * Any comment related to the content..
    */
    @NonNull
    public static final String COMMENT = "Comment";

   /**
    * Audio Codecs in this file with popular name (hint), separated by /.
    */
    @NonNull
    public static final String AUDIOFORMATWITHHINTLIST = "Audio_Format_WithHint_List";

   /**
    * Delay source (Container or Stream or empty).
    */
    @NonNull
    public static final String DELAYSOURCESTRING = "Delay_Source/String";

   /**
    * Name of the person or organization who supplied the original subject.
    */
    @NonNull
    public static final String ORIGINALSOURCEFORMDISTRIBUTEDBY = "OriginalSourceForm/DistributedBy";

   /**
    * Date/year the item was added to the owners collection.
    */
    @NonNull
    public static final String ADDEDDATE = "Added_Date";

   /**
    * Stream type name.
    */
    @NonNull
    public static final String STREAMKINDSTRING = "StreamKind/String";

   /**
    * More infos about the track.
    */
    @NonNull
    public static final String TRACKMORE = "Track_More";

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
    * Menu Codecsin this file, separated by /.
    */
    @NonNull
    public static final String MENUFORMATLIST = "Menu_Format_List";

   /**
    * Performer/Sort.
    */
    @NonNull
    public static final String PERFORMERSORT = "Performer/Sort";

   /**
    * Homepage for the movie.
    */
    @NonNull
    public static final String MOVIEURL = "Movie/Url";

   /**
    * A plot outline or a summary of the story..
    */
    @NonNull
    public static final String SUMMARY = "Summary";

   /**
    * Name of the track. e.g. track1, track 2.
    */
    @NonNull
    public static final String TRACK = "Track";

}
