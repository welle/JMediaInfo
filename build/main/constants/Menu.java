package aka.jmetadata.main.constants;

import org.eclipse.jdt.annotation.NonNull;

/**
 * Menu constants parameters.
 *
 * @author Welle Charlotte
 */
public final class Menu {

   /**
    * The unique ID for this stream, should be copied with stream copy.
    */
    @NonNull
    public static final String UNIQUEID = "UniqueID";

   /**
    * NetworkName.
    */
    @NonNull
    public static final String NETWORKNAME = "NetworkName";

   /**
    * TimeZones.
    */
    @NonNull
    public static final String TIMEZONES = "TimeZones";

   /**
    * Language (full).
    */
    @NonNull
    public static final String LANGUAGESTRING = "Language/String";

   /**
    * Delay in format : HH:MM:SS.MMM.
    */
    @NonNull
    public static final String DELAYSTRING3 = "Delay/String3";

   /**
    * Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @NonNull
    public static final String DELAYSTRING4 = "Delay/String4";

   /**
    * Countries.
    */
    @NonNull
    public static final String COUNTRIES = "Countries";

   /**
    * Stream order in the file, whatever is the kind of stream (base=0).
    */
    @NonNull
    public static final String STREAMORDER = "StreamOrder";

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
    * Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @NonNull
    public static final String DELAYSTRING5 = "Delay/String5";

   /**
    * Set if that track should be used if no language found matches the user preference..
    */
    @NonNull
    public static final String FORCEDSTRING = "Forced/String";

   /**
    * Count of objects available in this stream.
    */
    @NonNull
    public static final String COUNT = "Count";

   /**
    * Delay fixed in the stream (relative) IN MS.
    */
    @NonNull
    public static final String DELAY = "Delay";

   /**
    * Count of streams of that kind available.
    */
    @NonNull
    public static final String STREAMCOUNT = "StreamCount";

   /**
    * Used by third-party developers to know about the end of the chapters list (this position excluded).
    */
    @NonNull
    public static final String CHAPTERSPOSEND = "Chapters_Pos_End";

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
    * Compression method used.
    */
    @NonNull
    public static final String FORMATCOMPRESSION = "Format_Compression";

   /**
    * List of programs available.
    */
    @NonNull
    public static final String LIST = "List";

   /**
    * The ID for this stream in this file.
    */
    @NonNull
    public static final String ID = "ID";

   /**
    * Delay with measurement.
    */
    @NonNull
    public static final String DELAYSTRING = "Delay/String";

   /**
    * Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo)..
    */
    @NonNull
    public static final String LAWRATING = "LawRating";

   /**
    * Set if that track should not be used.
    */
    @NonNull
    public static final String DISABLED = "Disabled";

   /**
    * List of programs available.
    */
    @NonNull
    public static final String LISTSTREAMKIND = "List_StreamKind";

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
    * The menu ID for this stream in this file.
    */
    @NonNull
    public static final String MENUIDSTRING = "MenuID/String";

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
    * More info about Language (e.g. Director's Comment).
    */
    @NonNull
    public static final String LANGUAGEMORE = "Language_More";

   /**
    * Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @NonNull
    public static final String DURATIONSTRING1 = "Duration/String1";

   /**
    * Service kind (full).
    */
    @NonNull
    public static final String SERVICEKINDSTRING = "ServiceKind/String";

   /**
    * Play time of the stream in ms.
    */
    @NonNull
    public static final String DURATION = "Duration";

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
    * A hint/popular name for this codec.
    */
    @NonNull
    public static final String CODECIDHINT = "CodecID/Hint";

   /**
    * Delay source (Container or Stream or empty).
    */
    @NonNull
    public static final String DELAYSOURCE = "Delay_Source";

   /**
    * Delay settings (in case of timecode for example).
    */
    @NonNull
    public static final String DELAYSETTINGS = "Delay_Settings";

   /**
    * Service/Url.
    */
    @NonNull
    public static final String SERVICEURL = "Service/Url";

   /**
    * List of programs available.
    */
    @NonNull
    public static final String LISTSTREAMPOS = "List_StreamPos";

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
    * Used by third-party developers to know about the beginning of the chapters list, to be used by Get(Stream_Menu, x, Pos), where Pos is an Integer between Chapters_Pos_Begin and Chapters_Pos_End.
    */
    @NonNull
    public static final String CHAPTERSPOSBEGIN = "Chapters_Pos_Begin";

   /**
    * ServiceProviderr/Url.
    */
    @NonNull
    public static final String SERVICEPROVIDERRURL = "ServiceProviderr/Url";

   /**
    * Settings needed for decoder used.
    */
    @NonNull
    public static final String FORMATSETTINGS = "Format_Settings";

   /**
    * Service kind, e.g. visually impaired, commentary, voice over.
    */
    @NonNull
    public static final String SERVICEKIND = "ServiceKind";

   /**
    * Set if that track should be used if no language found matches the user preference..
    */
    @NonNull
    public static final String FORCED = "Forced";

   /**
    * Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    */
    @NonNull
    public static final String FIRSTPACKETORDER = "FirstPacketOrder";

   /**
    * Duration_End.
    */
    @NonNull
    public static final String DURATIONEND = "Duration_End";

   /**
    * Stream type name.
    */
    @NonNull
    public static final String STREAMKIND = "StreamKind";

   /**
    * Last **Inform** call.
    */
    @NonNull
    public static final String INFORM = "Inform";

   /**
    * Language (full).
    */
    @NonNull
    public static final String LANGUAGESTRING1 = "Language/String1";

   /**
    * Reason for the law rating.
    */
    @NonNull
    public static final String LAWRATINGREASON = "LawRating_Reason";

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
    * Number of the stream (base=0).
    */
    @NonNull
    public static final String STREAMKINDID = "StreamKindID";

   /**
    * Format used.
    */
    @NonNull
    public static final String FORMAT = "Format";

   /**
    * Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    */
    @NonNull
    public static final String LANGUAGE = "Language";

   /**
    * Original/NetworkName.
    */
    @NonNull
    public static final String ORIGINALNETWORKNAME = "Original/NetworkName";

   /**
    * Info about this codec.
    */
    @NonNull
    public static final String CODECIDINFO = "CodecID/Info";

   /**
    * Link.
    */
    @NonNull
    public static final String FORMATURL = "Format/Url";

   /**
    * Codec ID (found in some containers).
    */
    @NonNull
    public static final String CODECIDSTRING = "CodecID/String";

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
    * Commercial name used by vendor for theses setings or Format field if there is no difference.
    */
    @NonNull
    public static final String FORMATCOMMERCIAL = "Format_Commercial";

   /**
    * Info about Format.
    */
    @NonNull
    public static final String FORMATINFO = "Format/Info";

   /**
    * A link to more details about this codec ID.
    */
    @NonNull
    public static final String CODECIDURL = "CodecID/Url";

   /**
    * Name of this menu.
    */
    @NonNull
    public static final String TITLE = "Title";

   /**
    * Stream type name.
    */
    @NonNull
    public static final String STREAMKINDSTRING = "StreamKind/String";

   /**
    * List of programs available.
    */
    @NonNull
    public static final String LISTSTRING = "List/String";

   /**
    * Delay drop frame.
    */
    @NonNull
    public static final String DELAYDROPFRAME = "Delay_DropFrame";

   /**
    * Set if that track should not be used.
    */
    @NonNull
    public static final String DISABLEDSTRING = "Disabled/String";

   /**
    * Set if that track should be used if no language found matches the user preference..
    */
    @NonNull
    public static final String DEFAULT = "Default";

   /**
    * The menu ID for this stream in this file.
    */
    @NonNull
    public static final String MENUID = "MenuID";

   /**
    * The unique ID for this stream, should be copied with stream copy.
    */
    @NonNull
    public static final String UNIQUEIDSTRING = "UniqueID/String";

   /**
    * Commercial name used by vendor for theses setings if there is one.
    */
    @NonNull
    public static final String FORMATCOMMERCIALIFANY = "Format_Commercial_IfAny";

   /**
    * The ID for this stream in this file.
    */
    @NonNull
    public static final String IDSTRING = "ID/String";

   /**
    * Number of a group in order to provide versions of the same track.
    */
    @NonNull
    public static final String ALTERNATEGROUPSTRING = "AlternateGroup/String";

   /**
    * Profile of the Format.
    */
    @NonNull
    public static final String FORMATPROFILE = "Format_Profile";

   /**
    * ServiceChannel.
    */
    @NonNull
    public static final String SERVICECHANNEL = "ServiceChannel";

}
