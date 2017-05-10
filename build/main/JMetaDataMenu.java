package aka.jmetadata.main;

import java.math.BigInteger;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import aka.jmetadata.main.constants.Menu;
import aka.jmetadata.main.constants.StreamKind;
import aka.jmetadata.main.mediainfo.MediaInfo;

/**
 * This class contains all methods to extract Menu informations of a specific Menu stream.
 *
 * @author Welle Charlotte
 */
public final class JMetaDataMenu extends AbstractStreamJMetadata {

   /**
    * Constructor.
    * 
    * @param mediaInfo instance of MediaInfo JNA library
    * @param streamNumber number of the stream to parse
    * @see MediaInfo
    */
    public JMetaDataMenu(@NonNull final MediaInfo mediaInfo, final int streamNumber) {
        super(mediaInfo, streamNumber);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final Integer getUniqueIDAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.UNIQUEID);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final Long getUniqueIDAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.UNIQUEID);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final LocalDateTime getUniqueIDAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.UNIQUEID);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final LocalTime getUniqueIDAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.UNIQUEID);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final String getUniqueIDAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.UNIQUEID);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final Boolean getUniqueIDAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.UNIQUEID);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final BigInteger getUniqueIDAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.UNIQUEID);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final URL getUniqueIDAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.UNIQUEID);
    }


   /**
    * Get NetworkName.
    * 
    * @return NetworkName.
    */
    @Nullable
    public final Integer getNetworkNameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.NETWORKNAME);
    }

   /**
    * Get NetworkName.
    * 
    * @return NetworkName.
    */
    @Nullable
    public final Long getNetworkNameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.NETWORKNAME);
    }

   /**
    * Get NetworkName.
    * 
    * @return NetworkName.
    */
    @Nullable
    public final LocalDateTime getNetworkNameAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.NETWORKNAME);
    }

   /**
    * Get NetworkName.
    * 
    * @return NetworkName.
    */
    @Nullable
    public final LocalTime getNetworkNameAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.NETWORKNAME);
    }

   /**
    * Get NetworkName.
    * 
    * @return NetworkName.
    */
    @Nullable
    public final String getNetworkNameAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.NETWORKNAME);
    }

   /**
    * Get NetworkName.
    * 
    * @return NetworkName.
    */
    @Nullable
    public final Boolean getNetworkNameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.NETWORKNAME);
    }

   /**
    * Get NetworkName.
    * 
    * @return NetworkName.
    */
    @Nullable
    public final BigInteger getNetworkNameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.NETWORKNAME);
    }

   /**
    * Get NetworkName.
    * 
    * @return NetworkName.
    */
    @Nullable
    public final URL getNetworkNameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.NETWORKNAME);
    }


   /**
    * Get TimeZones.
    * 
    * @return TimeZones.
    */
    @Nullable
    public final Integer getTimeZonesAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.TIMEZONES);
    }

   /**
    * Get TimeZones.
    * 
    * @return TimeZones.
    */
    @Nullable
    public final Long getTimeZonesAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.TIMEZONES);
    }

   /**
    * Get TimeZones.
    * 
    * @return TimeZones.
    */
    @Nullable
    public final LocalDateTime getTimeZonesAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.TIMEZONES);
    }

   /**
    * Get TimeZones.
    * 
    * @return TimeZones.
    */
    @Nullable
    public final LocalTime getTimeZonesAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.TIMEZONES);
    }

   /**
    * Get TimeZones.
    * 
    * @return TimeZones.
    */
    @Nullable
    public final String getTimeZonesAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.TIMEZONES);
    }

   /**
    * Get TimeZones.
    * 
    * @return TimeZones.
    */
    @Nullable
    public final Boolean getTimeZonesAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.TIMEZONES);
    }

   /**
    * Get TimeZones.
    * 
    * @return TimeZones.
    */
    @Nullable
    public final BigInteger getTimeZonesAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.TIMEZONES);
    }

   /**
    * Get TimeZones.
    * 
    * @return TimeZones.
    */
    @Nullable
    public final URL getTimeZonesAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.TIMEZONES);
    }


   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final Integer getLanguageStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGESTRING);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final Long getLanguageStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGESTRING);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final LocalDateTime getLanguageStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGESTRING);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final LocalTime getLanguageStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGESTRING);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final String getLanguageStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGESTRING);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final Boolean getLanguageStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGESTRING);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final BigInteger getLanguageStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGESTRING);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final URL getLanguageStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGESTRING);
    }


   /**
    * Get Delay in format : HH:MM:SS.MMM.
    * 
    * @return Delay in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Integer getDelayString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING3);
    }

   /**
    * Get Delay in format : HH:MM:SS.MMM.
    * 
    * @return Delay in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Long getDelayString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING3);
    }

   /**
    * Get Delay in format : HH:MM:SS.MMM.
    * 
    * @return Delay in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalDateTime getDelayString3AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING3);
    }

   /**
    * Get Delay in format : HH:MM:SS.MMM.
    * 
    * @return Delay in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalTime getDelayString3AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING3);
    }

   /**
    * Get Delay in format : HH:MM:SS.MMM.
    * 
    * @return Delay in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final String getDelayString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING3);
    }

   /**
    * Get Delay in format : HH:MM:SS.MMM.
    * 
    * @return Delay in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Boolean getDelayString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING3);
    }

   /**
    * Get Delay in format : HH:MM:SS.MMM.
    * 
    * @return Delay in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final BigInteger getDelayString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING3);
    }

   /**
    * Get Delay in format : HH:MM:SS.MMM.
    * 
    * @return Delay in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final URL getDelayString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING3);
    }


   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Integer getDelayString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING4);
    }

   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Long getDelayString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING4);
    }

   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalDateTime getDelayString4AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING4);
    }

   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalTime getDelayString4AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING4);
    }

   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final String getDelayString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING4);
    }

   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Boolean getDelayString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING4);
    }

   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final BigInteger getDelayString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING4);
    }

   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final URL getDelayString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING4);
    }


   /**
    * Get Countries.
    * 
    * @return Countries.
    */
    @Nullable
    public final Integer getCountriesAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.COUNTRIES);
    }

   /**
    * Get Countries.
    * 
    * @return Countries.
    */
    @Nullable
    public final Long getCountriesAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.COUNTRIES);
    }

   /**
    * Get Countries.
    * 
    * @return Countries.
    */
    @Nullable
    public final LocalDateTime getCountriesAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.COUNTRIES);
    }

   /**
    * Get Countries.
    * 
    * @return Countries.
    */
    @Nullable
    public final LocalTime getCountriesAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.COUNTRIES);
    }

   /**
    * Get Countries.
    * 
    * @return Countries.
    */
    @Nullable
    public final String getCountriesAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.COUNTRIES);
    }

   /**
    * Get Countries.
    * 
    * @return Countries.
    */
    @Nullable
    public final Boolean getCountriesAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.COUNTRIES);
    }

   /**
    * Get Countries.
    * 
    * @return Countries.
    */
    @Nullable
    public final BigInteger getCountriesAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.COUNTRIES);
    }

   /**
    * Get Countries.
    * 
    * @return Countries.
    */
    @Nullable
    public final URL getCountriesAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.COUNTRIES);
    }


   /**
    * Get Stream order in the file, whatever is the kind of stream (base=0).
    * 
    * @return Stream order in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final Integer getStreamOrderAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.STREAMORDER);
    }

   /**
    * Get Stream order in the file, whatever is the kind of stream (base=0).
    * 
    * @return Stream order in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final Long getStreamOrderAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.STREAMORDER);
    }

   /**
    * Get Stream order in the file, whatever is the kind of stream (base=0).
    * 
    * @return Stream order in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final LocalDateTime getStreamOrderAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.STREAMORDER);
    }

   /**
    * Get Stream order in the file, whatever is the kind of stream (base=0).
    * 
    * @return Stream order in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final LocalTime getStreamOrderAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.STREAMORDER);
    }

   /**
    * Get Stream order in the file, whatever is the kind of stream (base=0).
    * 
    * @return Stream order in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final String getStreamOrderAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.STREAMORDER);
    }

   /**
    * Get Stream order in the file, whatever is the kind of stream (base=0).
    * 
    * @return Stream order in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final Boolean getStreamOrderAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.STREAMORDER);
    }

   /**
    * Get Stream order in the file, whatever is the kind of stream (base=0).
    * 
    * @return Stream order in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final BigInteger getStreamOrderAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.STREAMORDER);
    }

   /**
    * Get Stream order in the file, whatever is the kind of stream (base=0).
    * 
    * @return Stream order in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final URL getStreamOrderAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.STREAMORDER);
    }


   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Integer getDelayString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Long getDelayString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final LocalDateTime getDelayString1AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final LocalTime getDelayString1AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final String getDelayString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Boolean getDelayString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final BigInteger getDelayString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final URL getDelayString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING1);
    }


   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Integer getDelayString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Long getDelayString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final LocalDateTime getDelayString2AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final LocalTime getDelayString2AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final String getDelayString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Boolean getDelayString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final BigInteger getDelayString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final URL getDelayString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING2);
    }


   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Integer getDelayString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Long getDelayString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalDateTime getDelayString5AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalTime getDelayString5AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final String getDelayString5AsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Boolean getDelayString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final BigInteger getDelayString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final URL getDelayString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING5);
    }


   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Integer getForcedStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.FORCEDSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Long getForcedStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.FORCEDSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final LocalDateTime getForcedStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.FORCEDSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final LocalTime getForcedStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.FORCEDSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final String getForcedStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.FORCEDSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Boolean getForcedStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.FORCEDSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final BigInteger getForcedStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.FORCEDSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final URL getForcedStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.FORCEDSTRING);
    }


   /**
    * Get Count of objects available in this stream.
    * 
    * @return Count of objects available in this stream.
    */
    @Nullable
    public final Integer getCountAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.COUNT);
    }

   /**
    * Get Count of objects available in this stream.
    * 
    * @return Count of objects available in this stream.
    */
    @Nullable
    public final Long getCountAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.COUNT);
    }

   /**
    * Get Count of objects available in this stream.
    * 
    * @return Count of objects available in this stream.
    */
    @Nullable
    public final LocalDateTime getCountAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.COUNT);
    }

   /**
    * Get Count of objects available in this stream.
    * 
    * @return Count of objects available in this stream.
    */
    @Nullable
    public final LocalTime getCountAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.COUNT);
    }

   /**
    * Get Count of objects available in this stream.
    * 
    * @return Count of objects available in this stream.
    */
    @Nullable
    public final String getCountAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.COUNT);
    }

   /**
    * Get Count of objects available in this stream.
    * 
    * @return Count of objects available in this stream.
    */
    @Nullable
    public final Boolean getCountAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.COUNT);
    }

   /**
    * Get Count of objects available in this stream.
    * 
    * @return Count of objects available in this stream.
    */
    @Nullable
    public final BigInteger getCountAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.COUNT);
    }

   /**
    * Get Count of objects available in this stream.
    * 
    * @return Count of objects available in this stream.
    */
    @Nullable
    public final URL getCountAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.COUNT);
    }


   /**
    * Get Delay fixed in the stream (relative) IN MS.
    * 
    * @return Delay fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final Integer getDelayAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.DELAY);
    }

   /**
    * Get Delay fixed in the stream (relative) IN MS.
    * 
    * @return Delay fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final Long getDelayAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.DELAY);
    }

   /**
    * Get Delay fixed in the stream (relative) IN MS.
    * 
    * @return Delay fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final LocalDateTime getDelayAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.DELAY);
    }

   /**
    * Get Delay fixed in the stream (relative) IN MS.
    * 
    * @return Delay fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final LocalTime getDelayAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.DELAY);
    }

   /**
    * Get Delay fixed in the stream (relative) IN MS.
    * 
    * @return Delay fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final String getDelayAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.DELAY);
    }

   /**
    * Get Delay fixed in the stream (relative) IN MS.
    * 
    * @return Delay fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final Boolean getDelayAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.DELAY);
    }

   /**
    * Get Delay fixed in the stream (relative) IN MS.
    * 
    * @return Delay fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final BigInteger getDelayAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.DELAY);
    }

   /**
    * Get Delay fixed in the stream (relative) IN MS.
    * 
    * @return Delay fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final URL getDelayAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.DELAY);
    }


   /**
    * Get Count of streams of that kind available.
    * 
    * @return Count of streams of that kind available.
    */
    @Nullable
    public final Integer getStreamCountAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.STREAMCOUNT);
    }

   /**
    * Get Count of streams of that kind available.
    * 
    * @return Count of streams of that kind available.
    */
    @Nullable
    public final Long getStreamCountAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.STREAMCOUNT);
    }

   /**
    * Get Count of streams of that kind available.
    * 
    * @return Count of streams of that kind available.
    */
    @Nullable
    public final LocalDateTime getStreamCountAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.STREAMCOUNT);
    }

   /**
    * Get Count of streams of that kind available.
    * 
    * @return Count of streams of that kind available.
    */
    @Nullable
    public final LocalTime getStreamCountAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.STREAMCOUNT);
    }

   /**
    * Get Count of streams of that kind available.
    * 
    * @return Count of streams of that kind available.
    */
    @Nullable
    public final String getStreamCountAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.STREAMCOUNT);
    }

   /**
    * Get Count of streams of that kind available.
    * 
    * @return Count of streams of that kind available.
    */
    @Nullable
    public final Boolean getStreamCountAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.STREAMCOUNT);
    }

   /**
    * Get Count of streams of that kind available.
    * 
    * @return Count of streams of that kind available.
    */
    @Nullable
    public final BigInteger getStreamCountAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.STREAMCOUNT);
    }

   /**
    * Get Count of streams of that kind available.
    * 
    * @return Count of streams of that kind available.
    */
    @Nullable
    public final URL getStreamCountAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.STREAMCOUNT);
    }


   /**
    * Get Used by third-party developers to know about the end of the chapters list (this position excluded).
    * 
    * @return Used by third-party developers to know about the end of the chapters list (this position excluded).
    */
    @Nullable
    public final Integer getChaptersPosEndAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.CHAPTERSPOSEND);
    }

   /**
    * Get Used by third-party developers to know about the end of the chapters list (this position excluded).
    * 
    * @return Used by third-party developers to know about the end of the chapters list (this position excluded).
    */
    @Nullable
    public final Long getChaptersPosEndAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.CHAPTERSPOSEND);
    }

   /**
    * Get Used by third-party developers to know about the end of the chapters list (this position excluded).
    * 
    * @return Used by third-party developers to know about the end of the chapters list (this position excluded).
    */
    @Nullable
    public final LocalDateTime getChaptersPosEndAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.CHAPTERSPOSEND);
    }

   /**
    * Get Used by third-party developers to know about the end of the chapters list (this position excluded).
    * 
    * @return Used by third-party developers to know about the end of the chapters list (this position excluded).
    */
    @Nullable
    public final LocalTime getChaptersPosEndAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.CHAPTERSPOSEND);
    }

   /**
    * Get Used by third-party developers to know about the end of the chapters list (this position excluded).
    * 
    * @return Used by third-party developers to know about the end of the chapters list (this position excluded).
    */
    @Nullable
    public final String getChaptersPosEndAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.CHAPTERSPOSEND);
    }

   /**
    * Get Used by third-party developers to know about the end of the chapters list (this position excluded).
    * 
    * @return Used by third-party developers to know about the end of the chapters list (this position excluded).
    */
    @Nullable
    public final Boolean getChaptersPosEndAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.CHAPTERSPOSEND);
    }

   /**
    * Get Used by third-party developers to know about the end of the chapters list (this position excluded).
    * 
    * @return Used by third-party developers to know about the end of the chapters list (this position excluded).
    */
    @Nullable
    public final BigInteger getChaptersPosEndAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.CHAPTERSPOSEND);
    }

   /**
    * Get Used by third-party developers to know about the end of the chapters list (this position excluded).
    * 
    * @return Used by third-party developers to know about the end of the chapters list (this position excluded).
    */
    @Nullable
    public final URL getChaptersPosEndAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.CHAPTERSPOSEND);
    }


   /**
    * Get Version of this format.
    * 
    * @return Version of this format.
    */
    @Nullable
    public final Integer getFormatVersionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.FORMATVERSION);
    }

   /**
    * Get Version of this format.
    * 
    * @return Version of this format.
    */
    @Nullable
    public final Long getFormatVersionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.FORMATVERSION);
    }

   /**
    * Get Version of this format.
    * 
    * @return Version of this format.
    */
    @Nullable
    public final LocalDateTime getFormatVersionAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.FORMATVERSION);
    }

   /**
    * Get Version of this format.
    * 
    * @return Version of this format.
    */
    @Nullable
    public final LocalTime getFormatVersionAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.FORMATVERSION);
    }

   /**
    * Get Version of this format.
    * 
    * @return Version of this format.
    */
    @Nullable
    public final String getFormatVersionAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.FORMATVERSION);
    }

   /**
    * Get Version of this format.
    * 
    * @return Version of this format.
    */
    @Nullable
    public final Boolean getFormatVersionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.FORMATVERSION);
    }

   /**
    * Get Version of this format.
    * 
    * @return Version of this format.
    */
    @Nullable
    public final BigInteger getFormatVersionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.FORMATVERSION);
    }

   /**
    * Get Version of this format.
    * 
    * @return Version of this format.
    */
    @Nullable
    public final URL getFormatVersionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.FORMATVERSION);
    }


   /**
    * Get When multiple streams, number of the stream (base=1).
    * 
    * @return When multiple streams, number of the stream (base=1).
    */
    @Nullable
    public final Integer getStreamKindPosAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.STREAMKINDPOS);
    }

   /**
    * Get When multiple streams, number of the stream (base=1).
    * 
    * @return When multiple streams, number of the stream (base=1).
    */
    @Nullable
    public final Long getStreamKindPosAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.STREAMKINDPOS);
    }

   /**
    * Get When multiple streams, number of the stream (base=1).
    * 
    * @return When multiple streams, number of the stream (base=1).
    */
    @Nullable
    public final LocalDateTime getStreamKindPosAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.STREAMKINDPOS);
    }

   /**
    * Get When multiple streams, number of the stream (base=1).
    * 
    * @return When multiple streams, number of the stream (base=1).
    */
    @Nullable
    public final LocalTime getStreamKindPosAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.STREAMKINDPOS);
    }

   /**
    * Get When multiple streams, number of the stream (base=1).
    * 
    * @return When multiple streams, number of the stream (base=1).
    */
    @Nullable
    public final String getStreamKindPosAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.STREAMKINDPOS);
    }

   /**
    * Get When multiple streams, number of the stream (base=1).
    * 
    * @return When multiple streams, number of the stream (base=1).
    */
    @Nullable
    public final Boolean getStreamKindPosAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.STREAMKINDPOS);
    }

   /**
    * Get When multiple streams, number of the stream (base=1).
    * 
    * @return When multiple streams, number of the stream (base=1).
    */
    @Nullable
    public final BigInteger getStreamKindPosAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.STREAMKINDPOS);
    }

   /**
    * Get When multiple streams, number of the stream (base=1).
    * 
    * @return When multiple streams, number of the stream (base=1).
    */
    @Nullable
    public final URL getStreamKindPosAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.STREAMKINDPOS);
    }


   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final Integer getOriginalSourceMediumIDAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.ORIGINALSOURCEMEDIUMID);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final Long getOriginalSourceMediumIDAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.ORIGINALSOURCEMEDIUMID);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final LocalDateTime getOriginalSourceMediumIDAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.ORIGINALSOURCEMEDIUMID);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final LocalTime getOriginalSourceMediumIDAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.ORIGINALSOURCEMEDIUMID);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final String getOriginalSourceMediumIDAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.ORIGINALSOURCEMEDIUMID);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final Boolean getOriginalSourceMediumIDAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.ORIGINALSOURCEMEDIUMID);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final BigInteger getOriginalSourceMediumIDAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.ORIGINALSOURCEMEDIUMID);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final URL getOriginalSourceMediumIDAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.ORIGINALSOURCEMEDIUMID);
    }


   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Integer getDurationStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Long getDurationStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalDateTime getDurationStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalTime getDurationStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final String getDurationStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Boolean getDurationStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final BigInteger getDurationStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final URL getDurationStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING);
    }


   /**
    * Get ServiceType.
    * 
    * @return ServiceType.
    */
    @Nullable
    public final Integer getServiceTypeAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.SERVICETYPE);
    }

   /**
    * Get ServiceType.
    * 
    * @return ServiceType.
    */
    @Nullable
    public final Long getServiceTypeAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.SERVICETYPE);
    }

   /**
    * Get ServiceType.
    * 
    * @return ServiceType.
    */
    @Nullable
    public final LocalDateTime getServiceTypeAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.SERVICETYPE);
    }

   /**
    * Get ServiceType.
    * 
    * @return ServiceType.
    */
    @Nullable
    public final LocalTime getServiceTypeAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.SERVICETYPE);
    }

   /**
    * Get ServiceType.
    * 
    * @return ServiceType.
    */
    @Nullable
    public final String getServiceTypeAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.SERVICETYPE);
    }

   /**
    * Get ServiceType.
    * 
    * @return ServiceType.
    */
    @Nullable
    public final Boolean getServiceTypeAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.SERVICETYPE);
    }

   /**
    * Get ServiceType.
    * 
    * @return ServiceType.
    */
    @Nullable
    public final BigInteger getServiceTypeAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.SERVICETYPE);
    }

   /**
    * Get ServiceType.
    * 
    * @return ServiceType.
    */
    @Nullable
    public final URL getServiceTypeAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.SERVICETYPE);
    }


   /**
    * Get Compression method used.
    * 
    * @return Compression method used.
    */
    @Nullable
    public final Integer getFormatCompressionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.FORMATCOMPRESSION);
    }

   /**
    * Get Compression method used.
    * 
    * @return Compression method used.
    */
    @Nullable
    public final Long getFormatCompressionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.FORMATCOMPRESSION);
    }

   /**
    * Get Compression method used.
    * 
    * @return Compression method used.
    */
    @Nullable
    public final LocalDateTime getFormatCompressionAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.FORMATCOMPRESSION);
    }

   /**
    * Get Compression method used.
    * 
    * @return Compression method used.
    */
    @Nullable
    public final LocalTime getFormatCompressionAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.FORMATCOMPRESSION);
    }

   /**
    * Get Compression method used.
    * 
    * @return Compression method used.
    */
    @Nullable
    public final String getFormatCompressionAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.FORMATCOMPRESSION);
    }

   /**
    * Get Compression method used.
    * 
    * @return Compression method used.
    */
    @Nullable
    public final Boolean getFormatCompressionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.FORMATCOMPRESSION);
    }

   /**
    * Get Compression method used.
    * 
    * @return Compression method used.
    */
    @Nullable
    public final BigInteger getFormatCompressionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.FORMATCOMPRESSION);
    }

   /**
    * Get Compression method used.
    * 
    * @return Compression method used.
    */
    @Nullable
    public final URL getFormatCompressionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.FORMATCOMPRESSION);
    }


   /**
    * Get List of programs available.
    * 
    * @return List of programs available.
    */
    @Nullable
    public final Integer getListAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.LIST);
    }

   /**
    * Get List of programs available.
    * 
    * @return List of programs available.
    */
    @Nullable
    public final Long getListAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.LIST);
    }

   /**
    * Get List of programs available.
    * 
    * @return List of programs available.
    */
    @Nullable
    public final LocalDateTime getListAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.LIST);
    }

   /**
    * Get List of programs available.
    * 
    * @return List of programs available.
    */
    @Nullable
    public final LocalTime getListAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.LIST);
    }

   /**
    * Get List of programs available.
    * 
    * @return List of programs available.
    */
    @Nullable
    public final String getListAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.LIST);
    }

   /**
    * Get List of programs available.
    * 
    * @return List of programs available.
    */
    @Nullable
    public final Boolean getListAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.LIST);
    }

   /**
    * Get List of programs available.
    * 
    * @return List of programs available.
    */
    @Nullable
    public final BigInteger getListAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.LIST);
    }

   /**
    * Get List of programs available.
    * 
    * @return List of programs available.
    */
    @Nullable
    public final URL getListAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.LIST);
    }


   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final Integer getIDAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.ID);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final Long getIDAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.ID);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final LocalDateTime getIDAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.ID);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final LocalTime getIDAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.ID);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final String getIDAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.ID);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final Boolean getIDAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.ID);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final BigInteger getIDAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.ID);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final URL getIDAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.ID);
    }


   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Integer getDelayStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Long getDelayStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final LocalDateTime getDelayStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final LocalTime getDelayStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final String getDelayStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Boolean getDelayStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final BigInteger getDelayStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final URL getDelayStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.DELAYSTRING);
    }


   /**
    * Get Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo)..
    * 
    * @return Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo)..
    */
    @Nullable
    public final Integer getLawRatingAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.LAWRATING);
    }

   /**
    * Get Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo)..
    * 
    * @return Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo)..
    */
    @Nullable
    public final Long getLawRatingAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.LAWRATING);
    }

   /**
    * Get Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo)..
    * 
    * @return Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo)..
    */
    @Nullable
    public final LocalDateTime getLawRatingAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.LAWRATING);
    }

   /**
    * Get Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo)..
    * 
    * @return Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo)..
    */
    @Nullable
    public final LocalTime getLawRatingAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.LAWRATING);
    }

   /**
    * Get Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo)..
    * 
    * @return Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo)..
    */
    @Nullable
    public final String getLawRatingAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.LAWRATING);
    }

   /**
    * Get Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo)..
    * 
    * @return Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo)..
    */
    @Nullable
    public final Boolean getLawRatingAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.LAWRATING);
    }

   /**
    * Get Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo)..
    * 
    * @return Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo)..
    */
    @Nullable
    public final BigInteger getLawRatingAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.LAWRATING);
    }

   /**
    * Get Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo)..
    * 
    * @return Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo)..
    */
    @Nullable
    public final URL getLawRatingAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.LAWRATING);
    }


   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final Integer getDisabledAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.DISABLED);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final Long getDisabledAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.DISABLED);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final LocalDateTime getDisabledAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.DISABLED);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final LocalTime getDisabledAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.DISABLED);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final String getDisabledAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.DISABLED);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final Boolean getDisabledAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.DISABLED);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final BigInteger getDisabledAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.DISABLED);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final URL getDisabledAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.DISABLED);
    }


   /**
    * Get List of programs available.
    * 
    * @return List of programs available.
    */
    @Nullable
    public final Integer getListStreamKindAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.LISTSTREAMKIND);
    }

   /**
    * Get List of programs available.
    * 
    * @return List of programs available.
    */
    @Nullable
    public final Long getListStreamKindAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.LISTSTREAMKIND);
    }

   /**
    * Get List of programs available.
    * 
    * @return List of programs available.
    */
    @Nullable
    public final LocalDateTime getListStreamKindAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.LISTSTREAMKIND);
    }

   /**
    * Get List of programs available.
    * 
    * @return List of programs available.
    */
    @Nullable
    public final LocalTime getListStreamKindAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.LISTSTREAMKIND);
    }

   /**
    * Get List of programs available.
    * 
    * @return List of programs available.
    */
    @Nullable
    public final String getListStreamKindAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.LISTSTREAMKIND);
    }

   /**
    * Get List of programs available.
    * 
    * @return List of programs available.
    */
    @Nullable
    public final Boolean getListStreamKindAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.LISTSTREAMKIND);
    }

   /**
    * Get List of programs available.
    * 
    * @return List of programs available.
    */
    @Nullable
    public final BigInteger getListStreamKindAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.LISTSTREAMKIND);
    }

   /**
    * Get List of programs available.
    * 
    * @return List of programs available.
    */
    @Nullable
    public final URL getListStreamKindAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.LISTSTREAMKIND);
    }


   /**
    * Get Manual description given by the container.
    * 
    * @return Manual description given by the container.
    */
    @Nullable
    public final Integer getCodecIDDescriptionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.CODECIDDESCRIPTION);
    }

   /**
    * Get Manual description given by the container.
    * 
    * @return Manual description given by the container.
    */
    @Nullable
    public final Long getCodecIDDescriptionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.CODECIDDESCRIPTION);
    }

   /**
    * Get Manual description given by the container.
    * 
    * @return Manual description given by the container.
    */
    @Nullable
    public final LocalDateTime getCodecIDDescriptionAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.CODECIDDESCRIPTION);
    }

   /**
    * Get Manual description given by the container.
    * 
    * @return Manual description given by the container.
    */
    @Nullable
    public final LocalTime getCodecIDDescriptionAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.CODECIDDESCRIPTION);
    }

   /**
    * Get Manual description given by the container.
    * 
    * @return Manual description given by the container.
    */
    @Nullable
    public final String getCodecIDDescriptionAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.CODECIDDESCRIPTION);
    }

   /**
    * Get Manual description given by the container.
    * 
    * @return Manual description given by the container.
    */
    @Nullable
    public final Boolean getCodecIDDescriptionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.CODECIDDESCRIPTION);
    }

   /**
    * Get Manual description given by the container.
    * 
    * @return Manual description given by the container.
    */
    @Nullable
    public final BigInteger getCodecIDDescriptionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.CODECIDDESCRIPTION);
    }

   /**
    * Get Manual description given by the container.
    * 
    * @return Manual description given by the container.
    */
    @Nullable
    public final URL getCodecIDDescriptionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.CODECIDDESCRIPTION);
    }


   /**
    * Get bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    * 
    * @return bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    */
    @Nullable
    public final Integer getStatusAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.STATUS);
    }

   /**
    * Get bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    * 
    * @return bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    */
    @Nullable
    public final Long getStatusAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.STATUS);
    }

   /**
    * Get bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    * 
    * @return bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    */
    @Nullable
    public final LocalDateTime getStatusAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.STATUS);
    }

   /**
    * Get bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    * 
    * @return bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    */
    @Nullable
    public final LocalTime getStatusAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.STATUS);
    }

   /**
    * Get bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    * 
    * @return bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    */
    @Nullable
    public final String getStatusAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.STATUS);
    }

   /**
    * Get bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    * 
    * @return bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    */
    @Nullable
    public final Boolean getStatusAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.STATUS);
    }

   /**
    * Get bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    * 
    * @return bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    */
    @Nullable
    public final BigInteger getStatusAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.STATUS);
    }

   /**
    * Get bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    * 
    * @return bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    */
    @Nullable
    public final URL getStatusAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.STATUS);
    }


   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final Integer getMenuIDStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.MENUIDSTRING);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final Long getMenuIDStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.MENUIDSTRING);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final LocalDateTime getMenuIDStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.MENUIDSTRING);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final LocalTime getMenuIDStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.MENUIDSTRING);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final String getMenuIDStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.MENUIDSTRING);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final Boolean getMenuIDStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.MENUIDSTRING);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final BigInteger getMenuIDStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.MENUIDSTRING);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final URL getMenuIDStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.MENUIDSTRING);
    }


   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Integer getDurationString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING2);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Long getDurationString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING2);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalDateTime getDurationString2AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING2);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalTime getDurationString2AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING2);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final String getDurationString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING2);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Boolean getDurationString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING2);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final BigInteger getDurationString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING2);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final URL getDurationString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING2);
    }


   /**
    * Get Play time in format : HH:MM:SS.MMM.
    * 
    * @return Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Integer getDurationString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING3);
    }

   /**
    * Get Play time in format : HH:MM:SS.MMM.
    * 
    * @return Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Long getDurationString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING3);
    }

   /**
    * Get Play time in format : HH:MM:SS.MMM.
    * 
    * @return Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalDateTime getDurationString3AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING3);
    }

   /**
    * Get Play time in format : HH:MM:SS.MMM.
    * 
    * @return Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalTime getDurationString3AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING3);
    }

   /**
    * Get Play time in format : HH:MM:SS.MMM.
    * 
    * @return Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final String getDurationString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING3);
    }

   /**
    * Get Play time in format : HH:MM:SS.MMM.
    * 
    * @return Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Boolean getDurationString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING3);
    }

   /**
    * Get Play time in format : HH:MM:SS.MMM.
    * 
    * @return Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final BigInteger getDurationString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING3);
    }

   /**
    * Get Play time in format : HH:MM:SS.MMM.
    * 
    * @return Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final URL getDurationString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING3);
    }


   /**
    * Get More info about Language (e.g. Director's Comment).
    * 
    * @return More info about Language (e.g. Director's Comment).
    */
    @Nullable
    public final Integer getLanguageMoreAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGEMORE);
    }

   /**
    * Get More info about Language (e.g. Director's Comment).
    * 
    * @return More info about Language (e.g. Director's Comment).
    */
    @Nullable
    public final Long getLanguageMoreAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGEMORE);
    }

   /**
    * Get More info about Language (e.g. Director's Comment).
    * 
    * @return More info about Language (e.g. Director's Comment).
    */
    @Nullable
    public final LocalDateTime getLanguageMoreAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGEMORE);
    }

   /**
    * Get More info about Language (e.g. Director's Comment).
    * 
    * @return More info about Language (e.g. Director's Comment).
    */
    @Nullable
    public final LocalTime getLanguageMoreAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGEMORE);
    }

   /**
    * Get More info about Language (e.g. Director's Comment).
    * 
    * @return More info about Language (e.g. Director's Comment).
    */
    @Nullable
    public final String getLanguageMoreAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGEMORE);
    }

   /**
    * Get More info about Language (e.g. Director's Comment).
    * 
    * @return More info about Language (e.g. Director's Comment).
    */
    @Nullable
    public final Boolean getLanguageMoreAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGEMORE);
    }

   /**
    * Get More info about Language (e.g. Director's Comment).
    * 
    * @return More info about Language (e.g. Director's Comment).
    */
    @Nullable
    public final BigInteger getLanguageMoreAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGEMORE);
    }

   /**
    * Get More info about Language (e.g. Director's Comment).
    * 
    * @return More info about Language (e.g. Director's Comment).
    */
    @Nullable
    public final URL getLanguageMoreAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGEMORE);
    }


   /**
    * Get Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Integer getDurationString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING1);
    }

   /**
    * Get Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Long getDurationString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING1);
    }

   /**
    * Get Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final LocalDateTime getDurationString1AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING1);
    }

   /**
    * Get Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final LocalTime getDurationString1AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING1);
    }

   /**
    * Get Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final String getDurationString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING1);
    }

   /**
    * Get Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Boolean getDurationString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING1);
    }

   /**
    * Get Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final BigInteger getDurationString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING1);
    }

   /**
    * Get Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final URL getDurationString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING1);
    }


   /**
    * Get Service kind (full).
    * 
    * @return Service kind (full).
    */
    @Nullable
    public final Integer getServiceKindStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.SERVICEKINDSTRING);
    }

   /**
    * Get Service kind (full).
    * 
    * @return Service kind (full).
    */
    @Nullable
    public final Long getServiceKindStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.SERVICEKINDSTRING);
    }

   /**
    * Get Service kind (full).
    * 
    * @return Service kind (full).
    */
    @Nullable
    public final LocalDateTime getServiceKindStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.SERVICEKINDSTRING);
    }

   /**
    * Get Service kind (full).
    * 
    * @return Service kind (full).
    */
    @Nullable
    public final LocalTime getServiceKindStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.SERVICEKINDSTRING);
    }

   /**
    * Get Service kind (full).
    * 
    * @return Service kind (full).
    */
    @Nullable
    public final String getServiceKindStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.SERVICEKINDSTRING);
    }

   /**
    * Get Service kind (full).
    * 
    * @return Service kind (full).
    */
    @Nullable
    public final Boolean getServiceKindStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.SERVICEKINDSTRING);
    }

   /**
    * Get Service kind (full).
    * 
    * @return Service kind (full).
    */
    @Nullable
    public final BigInteger getServiceKindStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.SERVICEKINDSTRING);
    }

   /**
    * Get Service kind (full).
    * 
    * @return Service kind (full).
    */
    @Nullable
    public final URL getServiceKindStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.SERVICEKINDSTRING);
    }


   /**
    * Get Play time of the stream in ms.
    * 
    * @return Play time of the stream in ms.
    */
    @Nullable
    public final Integer getDurationAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.DURATION);
    }

   /**
    * Get Play time of the stream in ms.
    * 
    * @return Play time of the stream in ms.
    */
    @Nullable
    public final Long getDurationAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.DURATION);
    }

   /**
    * Get Play time of the stream in ms.
    * 
    * @return Play time of the stream in ms.
    */
    @Nullable
    public final LocalDateTime getDurationAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.DURATION);
    }

   /**
    * Get Play time of the stream in ms.
    * 
    * @return Play time of the stream in ms.
    */
    @Nullable
    public final LocalTime getDurationAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.DURATION);
    }

   /**
    * Get Play time of the stream in ms.
    * 
    * @return Play time of the stream in ms.
    */
    @Nullable
    public final String getDurationAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.DURATION);
    }

   /**
    * Get Play time of the stream in ms.
    * 
    * @return Play time of the stream in ms.
    */
    @Nullable
    public final Boolean getDurationAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.DURATION);
    }

   /**
    * Get Play time of the stream in ms.
    * 
    * @return Play time of the stream in ms.
    */
    @Nullable
    public final BigInteger getDurationAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.DURATION);
    }

   /**
    * Get Play time of the stream in ms.
    * 
    * @return Play time of the stream in ms.
    */
    @Nullable
    public final URL getDurationAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.DURATION);
    }


   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Integer getDurationString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Long getDurationString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalDateTime getDurationString4AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalTime getDurationString4AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final String getDurationString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Boolean getDurationString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final BigInteger getDurationString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final URL getDurationString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING4);
    }


   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Integer getDurationString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Long getDurationString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalDateTime getDurationString5AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalTime getDurationString5AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final String getDurationString5AsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Boolean getDurationString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final BigInteger getDurationString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final URL getDurationString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTRING5);
    }


   /**
    * Get Duration_Start.
    * 
    * @return Duration_Start.
    */
    @Nullable
    public final Integer getDurationStartAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTART);
    }

   /**
    * Get Duration_Start.
    * 
    * @return Duration_Start.
    */
    @Nullable
    public final Long getDurationStartAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTART);
    }

   /**
    * Get Duration_Start.
    * 
    * @return Duration_Start.
    */
    @Nullable
    public final LocalDateTime getDurationStartAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTART);
    }

   /**
    * Get Duration_Start.
    * 
    * @return Duration_Start.
    */
    @Nullable
    public final LocalTime getDurationStartAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTART);
    }

   /**
    * Get Duration_Start.
    * 
    * @return Duration_Start.
    */
    @Nullable
    public final String getDurationStartAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTART);
    }

   /**
    * Get Duration_Start.
    * 
    * @return Duration_Start.
    */
    @Nullable
    public final Boolean getDurationStartAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTART);
    }

   /**
    * Get Duration_Start.
    * 
    * @return Duration_Start.
    */
    @Nullable
    public final BigInteger getDurationStartAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTART);
    }

   /**
    * Get Duration_Start.
    * 
    * @return Duration_Start.
    */
    @Nullable
    public final URL getDurationStartAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.DURATIONSTART);
    }


   /**
    * Get A hint/popular name for this codec.
    * 
    * @return A hint/popular name for this codec.
    */
    @Nullable
    public final Integer getCodecIDHintAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.CODECIDHINT);
    }

   /**
    * Get A hint/popular name for this codec.
    * 
    * @return A hint/popular name for this codec.
    */
    @Nullable
    public final Long getCodecIDHintAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.CODECIDHINT);
    }

   /**
    * Get A hint/popular name for this codec.
    * 
    * @return A hint/popular name for this codec.
    */
    @Nullable
    public final LocalDateTime getCodecIDHintAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.CODECIDHINT);
    }

   /**
    * Get A hint/popular name for this codec.
    * 
    * @return A hint/popular name for this codec.
    */
    @Nullable
    public final LocalTime getCodecIDHintAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.CODECIDHINT);
    }

   /**
    * Get A hint/popular name for this codec.
    * 
    * @return A hint/popular name for this codec.
    */
    @Nullable
    public final String getCodecIDHintAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.CODECIDHINT);
    }

   /**
    * Get A hint/popular name for this codec.
    * 
    * @return A hint/popular name for this codec.
    */
    @Nullable
    public final Boolean getCodecIDHintAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.CODECIDHINT);
    }

   /**
    * Get A hint/popular name for this codec.
    * 
    * @return A hint/popular name for this codec.
    */
    @Nullable
    public final BigInteger getCodecIDHintAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.CODECIDHINT);
    }

   /**
    * Get A hint/popular name for this codec.
    * 
    * @return A hint/popular name for this codec.
    */
    @Nullable
    public final URL getCodecIDHintAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.CODECIDHINT);
    }


   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final Integer getDelaySourceAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.DELAYSOURCE);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final Long getDelaySourceAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.DELAYSOURCE);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final LocalDateTime getDelaySourceAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.DELAYSOURCE);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final LocalTime getDelaySourceAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.DELAYSOURCE);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final String getDelaySourceAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.DELAYSOURCE);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final Boolean getDelaySourceAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.DELAYSOURCE);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final BigInteger getDelaySourceAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.DELAYSOURCE);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final URL getDelaySourceAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.DELAYSOURCE);
    }


   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final Integer getDelaySettingsAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.DELAYSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final Long getDelaySettingsAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.DELAYSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final LocalDateTime getDelaySettingsAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.DELAYSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final LocalTime getDelaySettingsAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.DELAYSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final String getDelaySettingsAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.DELAYSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final Boolean getDelaySettingsAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.DELAYSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final BigInteger getDelaySettingsAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.DELAYSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final URL getDelaySettingsAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.DELAYSETTINGS);
    }


   /**
    * Get Service/Url.
    * 
    * @return Service/Url.
    */
    @Nullable
    public final Integer getServiceUrlAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.SERVICEURL);
    }

   /**
    * Get Service/Url.
    * 
    * @return Service/Url.
    */
    @Nullable
    public final Long getServiceUrlAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.SERVICEURL);
    }

   /**
    * Get Service/Url.
    * 
    * @return Service/Url.
    */
    @Nullable
    public final LocalDateTime getServiceUrlAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.SERVICEURL);
    }

   /**
    * Get Service/Url.
    * 
    * @return Service/Url.
    */
    @Nullable
    public final LocalTime getServiceUrlAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.SERVICEURL);
    }

   /**
    * Get Service/Url.
    * 
    * @return Service/Url.
    */
    @Nullable
    public final String getServiceUrlAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.SERVICEURL);
    }

   /**
    * Get Service/Url.
    * 
    * @return Service/Url.
    */
    @Nullable
    public final Boolean getServiceUrlAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.SERVICEURL);
    }

   /**
    * Get Service/Url.
    * 
    * @return Service/Url.
    */
    @Nullable
    public final BigInteger getServiceUrlAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.SERVICEURL);
    }

   /**
    * Get Service/Url.
    * 
    * @return Service/Url.
    */
    @Nullable
    public final URL getServiceUrlAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.SERVICEURL);
    }


   /**
    * Get List of programs available.
    * 
    * @return List of programs available.
    */
    @Nullable
    public final Integer getListStreamPosAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.LISTSTREAMPOS);
    }

   /**
    * Get List of programs available.
    * 
    * @return List of programs available.
    */
    @Nullable
    public final Long getListStreamPosAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.LISTSTREAMPOS);
    }

   /**
    * Get List of programs available.
    * 
    * @return List of programs available.
    */
    @Nullable
    public final LocalDateTime getListStreamPosAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.LISTSTREAMPOS);
    }

   /**
    * Get List of programs available.
    * 
    * @return List of programs available.
    */
    @Nullable
    public final LocalTime getListStreamPosAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.LISTSTREAMPOS);
    }

   /**
    * Get List of programs available.
    * 
    * @return List of programs available.
    */
    @Nullable
    public final String getListStreamPosAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.LISTSTREAMPOS);
    }

   /**
    * Get List of programs available.
    * 
    * @return List of programs available.
    */
    @Nullable
    public final Boolean getListStreamPosAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.LISTSTREAMPOS);
    }

   /**
    * Get List of programs available.
    * 
    * @return List of programs available.
    */
    @Nullable
    public final BigInteger getListStreamPosAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.LISTSTREAMPOS);
    }

   /**
    * Get List of programs available.
    * 
    * @return List of programs available.
    */
    @Nullable
    public final URL getListStreamPosAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.LISTSTREAMPOS);
    }


   /**
    * Get ServiceName.
    * 
    * @return ServiceName.
    */
    @Nullable
    public final Integer getServiceNameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.SERVICENAME);
    }

   /**
    * Get ServiceName.
    * 
    * @return ServiceName.
    */
    @Nullable
    public final Long getServiceNameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.SERVICENAME);
    }

   /**
    * Get ServiceName.
    * 
    * @return ServiceName.
    */
    @Nullable
    public final LocalDateTime getServiceNameAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.SERVICENAME);
    }

   /**
    * Get ServiceName.
    * 
    * @return ServiceName.
    */
    @Nullable
    public final LocalTime getServiceNameAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.SERVICENAME);
    }

   /**
    * Get ServiceName.
    * 
    * @return ServiceName.
    */
    @Nullable
    public final String getServiceNameAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.SERVICENAME);
    }

   /**
    * Get ServiceName.
    * 
    * @return ServiceName.
    */
    @Nullable
    public final Boolean getServiceNameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.SERVICENAME);
    }

   /**
    * Get ServiceName.
    * 
    * @return ServiceName.
    */
    @Nullable
    public final BigInteger getServiceNameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.SERVICENAME);
    }

   /**
    * Get ServiceName.
    * 
    * @return ServiceName.
    */
    @Nullable
    public final URL getServiceNameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.SERVICENAME);
    }


   /**
    * Get ServiceProvider.
    * 
    * @return ServiceProvider.
    */
    @Nullable
    public final Integer getServiceProviderAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.SERVICEPROVIDER);
    }

   /**
    * Get ServiceProvider.
    * 
    * @return ServiceProvider.
    */
    @Nullable
    public final Long getServiceProviderAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.SERVICEPROVIDER);
    }

   /**
    * Get ServiceProvider.
    * 
    * @return ServiceProvider.
    */
    @Nullable
    public final LocalDateTime getServiceProviderAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.SERVICEPROVIDER);
    }

   /**
    * Get ServiceProvider.
    * 
    * @return ServiceProvider.
    */
    @Nullable
    public final LocalTime getServiceProviderAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.SERVICEPROVIDER);
    }

   /**
    * Get ServiceProvider.
    * 
    * @return ServiceProvider.
    */
    @Nullable
    public final String getServiceProviderAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.SERVICEPROVIDER);
    }

   /**
    * Get ServiceProvider.
    * 
    * @return ServiceProvider.
    */
    @Nullable
    public final Boolean getServiceProviderAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.SERVICEPROVIDER);
    }

   /**
    * Get ServiceProvider.
    * 
    * @return ServiceProvider.
    */
    @Nullable
    public final BigInteger getServiceProviderAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.SERVICEPROVIDER);
    }

   /**
    * Get ServiceProvider.
    * 
    * @return ServiceProvider.
    */
    @Nullable
    public final URL getServiceProviderAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.SERVICEPROVIDER);
    }


   /**
    * Get Used by third-party developers to know about the beginning of the chapters list, to be used by Get(Stream_Menu, x, Pos), where Pos is an Integer between Chapters_Pos_Begin and Chapters_Pos_End.
    * 
    * @return Used by third-party developers to know about the beginning of the chapters list, to be used by Get(Stream_Menu, x, Pos), where Pos is an Integer between Chapters_Pos_Begin and Chapters_Pos_End.
    */
    @Nullable
    public final Integer getChaptersPosBeginAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.CHAPTERSPOSBEGIN);
    }

   /**
    * Get Used by third-party developers to know about the beginning of the chapters list, to be used by Get(Stream_Menu, x, Pos), where Pos is an Integer between Chapters_Pos_Begin and Chapters_Pos_End.
    * 
    * @return Used by third-party developers to know about the beginning of the chapters list, to be used by Get(Stream_Menu, x, Pos), where Pos is an Integer between Chapters_Pos_Begin and Chapters_Pos_End.
    */
    @Nullable
    public final Long getChaptersPosBeginAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.CHAPTERSPOSBEGIN);
    }

   /**
    * Get Used by third-party developers to know about the beginning of the chapters list, to be used by Get(Stream_Menu, x, Pos), where Pos is an Integer between Chapters_Pos_Begin and Chapters_Pos_End.
    * 
    * @return Used by third-party developers to know about the beginning of the chapters list, to be used by Get(Stream_Menu, x, Pos), where Pos is an Integer between Chapters_Pos_Begin and Chapters_Pos_End.
    */
    @Nullable
    public final LocalDateTime getChaptersPosBeginAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.CHAPTERSPOSBEGIN);
    }

   /**
    * Get Used by third-party developers to know about the beginning of the chapters list, to be used by Get(Stream_Menu, x, Pos), where Pos is an Integer between Chapters_Pos_Begin and Chapters_Pos_End.
    * 
    * @return Used by third-party developers to know about the beginning of the chapters list, to be used by Get(Stream_Menu, x, Pos), where Pos is an Integer between Chapters_Pos_Begin and Chapters_Pos_End.
    */
    @Nullable
    public final LocalTime getChaptersPosBeginAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.CHAPTERSPOSBEGIN);
    }

   /**
    * Get Used by third-party developers to know about the beginning of the chapters list, to be used by Get(Stream_Menu, x, Pos), where Pos is an Integer between Chapters_Pos_Begin and Chapters_Pos_End.
    * 
    * @return Used by third-party developers to know about the beginning of the chapters list, to be used by Get(Stream_Menu, x, Pos), where Pos is an Integer between Chapters_Pos_Begin and Chapters_Pos_End.
    */
    @Nullable
    public final String getChaptersPosBeginAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.CHAPTERSPOSBEGIN);
    }

   /**
    * Get Used by third-party developers to know about the beginning of the chapters list, to be used by Get(Stream_Menu, x, Pos), where Pos is an Integer between Chapters_Pos_Begin and Chapters_Pos_End.
    * 
    * @return Used by third-party developers to know about the beginning of the chapters list, to be used by Get(Stream_Menu, x, Pos), where Pos is an Integer between Chapters_Pos_Begin and Chapters_Pos_End.
    */
    @Nullable
    public final Boolean getChaptersPosBeginAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.CHAPTERSPOSBEGIN);
    }

   /**
    * Get Used by third-party developers to know about the beginning of the chapters list, to be used by Get(Stream_Menu, x, Pos), where Pos is an Integer between Chapters_Pos_Begin and Chapters_Pos_End.
    * 
    * @return Used by third-party developers to know about the beginning of the chapters list, to be used by Get(Stream_Menu, x, Pos), where Pos is an Integer between Chapters_Pos_Begin and Chapters_Pos_End.
    */
    @Nullable
    public final BigInteger getChaptersPosBeginAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.CHAPTERSPOSBEGIN);
    }

   /**
    * Get Used by third-party developers to know about the beginning of the chapters list, to be used by Get(Stream_Menu, x, Pos), where Pos is an Integer between Chapters_Pos_Begin and Chapters_Pos_End.
    * 
    * @return Used by third-party developers to know about the beginning of the chapters list, to be used by Get(Stream_Menu, x, Pos), where Pos is an Integer between Chapters_Pos_Begin and Chapters_Pos_End.
    */
    @Nullable
    public final URL getChaptersPosBeginAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.CHAPTERSPOSBEGIN);
    }


   /**
    * Get ServiceProviderr/Url.
    * 
    * @return ServiceProviderr/Url.
    */
    @Nullable
    public final Integer getServiceProviderrUrlAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.SERVICEPROVIDERRURL);
    }

   /**
    * Get ServiceProviderr/Url.
    * 
    * @return ServiceProviderr/Url.
    */
    @Nullable
    public final Long getServiceProviderrUrlAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.SERVICEPROVIDERRURL);
    }

   /**
    * Get ServiceProviderr/Url.
    * 
    * @return ServiceProviderr/Url.
    */
    @Nullable
    public final LocalDateTime getServiceProviderrUrlAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.SERVICEPROVIDERRURL);
    }

   /**
    * Get ServiceProviderr/Url.
    * 
    * @return ServiceProviderr/Url.
    */
    @Nullable
    public final LocalTime getServiceProviderrUrlAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.SERVICEPROVIDERRURL);
    }

   /**
    * Get ServiceProviderr/Url.
    * 
    * @return ServiceProviderr/Url.
    */
    @Nullable
    public final String getServiceProviderrUrlAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.SERVICEPROVIDERRURL);
    }

   /**
    * Get ServiceProviderr/Url.
    * 
    * @return ServiceProviderr/Url.
    */
    @Nullable
    public final Boolean getServiceProviderrUrlAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.SERVICEPROVIDERRURL);
    }

   /**
    * Get ServiceProviderr/Url.
    * 
    * @return ServiceProviderr/Url.
    */
    @Nullable
    public final BigInteger getServiceProviderrUrlAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.SERVICEPROVIDERRURL);
    }

   /**
    * Get ServiceProviderr/Url.
    * 
    * @return ServiceProviderr/Url.
    */
    @Nullable
    public final URL getServiceProviderrUrlAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.SERVICEPROVIDERRURL);
    }


   /**
    * Get Settings needed for decoder used.
    * 
    * @return Settings needed for decoder used.
    */
    @Nullable
    public final Integer getFormatSettingsAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.FORMATSETTINGS);
    }

   /**
    * Get Settings needed for decoder used.
    * 
    * @return Settings needed for decoder used.
    */
    @Nullable
    public final Long getFormatSettingsAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.FORMATSETTINGS);
    }

   /**
    * Get Settings needed for decoder used.
    * 
    * @return Settings needed for decoder used.
    */
    @Nullable
    public final LocalDateTime getFormatSettingsAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.FORMATSETTINGS);
    }

   /**
    * Get Settings needed for decoder used.
    * 
    * @return Settings needed for decoder used.
    */
    @Nullable
    public final LocalTime getFormatSettingsAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.FORMATSETTINGS);
    }

   /**
    * Get Settings needed for decoder used.
    * 
    * @return Settings needed for decoder used.
    */
    @Nullable
    public final String getFormatSettingsAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.FORMATSETTINGS);
    }

   /**
    * Get Settings needed for decoder used.
    * 
    * @return Settings needed for decoder used.
    */
    @Nullable
    public final Boolean getFormatSettingsAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.FORMATSETTINGS);
    }

   /**
    * Get Settings needed for decoder used.
    * 
    * @return Settings needed for decoder used.
    */
    @Nullable
    public final BigInteger getFormatSettingsAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.FORMATSETTINGS);
    }

   /**
    * Get Settings needed for decoder used.
    * 
    * @return Settings needed for decoder used.
    */
    @Nullable
    public final URL getFormatSettingsAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.FORMATSETTINGS);
    }


   /**
    * Get Service kind, e.g. visually impaired, commentary, voice over.
    * 
    * @return Service kind, e.g. visually impaired, commentary, voice over.
    */
    @Nullable
    public final Integer getServiceKindAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.SERVICEKIND);
    }

   /**
    * Get Service kind, e.g. visually impaired, commentary, voice over.
    * 
    * @return Service kind, e.g. visually impaired, commentary, voice over.
    */
    @Nullable
    public final Long getServiceKindAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.SERVICEKIND);
    }

   /**
    * Get Service kind, e.g. visually impaired, commentary, voice over.
    * 
    * @return Service kind, e.g. visually impaired, commentary, voice over.
    */
    @Nullable
    public final LocalDateTime getServiceKindAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.SERVICEKIND);
    }

   /**
    * Get Service kind, e.g. visually impaired, commentary, voice over.
    * 
    * @return Service kind, e.g. visually impaired, commentary, voice over.
    */
    @Nullable
    public final LocalTime getServiceKindAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.SERVICEKIND);
    }

   /**
    * Get Service kind, e.g. visually impaired, commentary, voice over.
    * 
    * @return Service kind, e.g. visually impaired, commentary, voice over.
    */
    @Nullable
    public final String getServiceKindAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.SERVICEKIND);
    }

   /**
    * Get Service kind, e.g. visually impaired, commentary, voice over.
    * 
    * @return Service kind, e.g. visually impaired, commentary, voice over.
    */
    @Nullable
    public final Boolean getServiceKindAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.SERVICEKIND);
    }

   /**
    * Get Service kind, e.g. visually impaired, commentary, voice over.
    * 
    * @return Service kind, e.g. visually impaired, commentary, voice over.
    */
    @Nullable
    public final BigInteger getServiceKindAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.SERVICEKIND);
    }

   /**
    * Get Service kind, e.g. visually impaired, commentary, voice over.
    * 
    * @return Service kind, e.g. visually impaired, commentary, voice over.
    */
    @Nullable
    public final URL getServiceKindAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.SERVICEKIND);
    }


   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Integer getForcedAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.FORCED);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Long getForcedAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.FORCED);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final LocalDateTime getForcedAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.FORCED);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final LocalTime getForcedAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.FORCED);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final String getForcedAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.FORCED);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Boolean getForcedAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.FORCED);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final BigInteger getForcedAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.FORCED);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final URL getForcedAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.FORCED);
    }


   /**
    * Get Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    * 
    * @return Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final Integer getFirstPacketOrderAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.FIRSTPACKETORDER);
    }

   /**
    * Get Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    * 
    * @return Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final Long getFirstPacketOrderAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.FIRSTPACKETORDER);
    }

   /**
    * Get Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    * 
    * @return Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final LocalDateTime getFirstPacketOrderAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.FIRSTPACKETORDER);
    }

   /**
    * Get Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    * 
    * @return Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final LocalTime getFirstPacketOrderAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.FIRSTPACKETORDER);
    }

   /**
    * Get Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    * 
    * @return Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final String getFirstPacketOrderAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.FIRSTPACKETORDER);
    }

   /**
    * Get Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    * 
    * @return Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final Boolean getFirstPacketOrderAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.FIRSTPACKETORDER);
    }

   /**
    * Get Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    * 
    * @return Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final BigInteger getFirstPacketOrderAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.FIRSTPACKETORDER);
    }

   /**
    * Get Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    * 
    * @return Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final URL getFirstPacketOrderAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.FIRSTPACKETORDER);
    }


   /**
    * Get Duration_End.
    * 
    * @return Duration_End.
    */
    @Nullable
    public final Integer getDurationEndAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.DURATIONEND);
    }

   /**
    * Get Duration_End.
    * 
    * @return Duration_End.
    */
    @Nullable
    public final Long getDurationEndAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.DURATIONEND);
    }

   /**
    * Get Duration_End.
    * 
    * @return Duration_End.
    */
    @Nullable
    public final LocalDateTime getDurationEndAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.DURATIONEND);
    }

   /**
    * Get Duration_End.
    * 
    * @return Duration_End.
    */
    @Nullable
    public final LocalTime getDurationEndAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.DURATIONEND);
    }

   /**
    * Get Duration_End.
    * 
    * @return Duration_End.
    */
    @Nullable
    public final String getDurationEndAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.DURATIONEND);
    }

   /**
    * Get Duration_End.
    * 
    * @return Duration_End.
    */
    @Nullable
    public final Boolean getDurationEndAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.DURATIONEND);
    }

   /**
    * Get Duration_End.
    * 
    * @return Duration_End.
    */
    @Nullable
    public final BigInteger getDurationEndAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.DURATIONEND);
    }

   /**
    * Get Duration_End.
    * 
    * @return Duration_End.
    */
    @Nullable
    public final URL getDurationEndAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.DURATIONEND);
    }


   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final Integer getStreamKindAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.STREAMKIND);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final Long getStreamKindAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.STREAMKIND);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final LocalDateTime getStreamKindAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.STREAMKIND);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final LocalTime getStreamKindAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.STREAMKIND);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final String getStreamKindAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.STREAMKIND);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final Boolean getStreamKindAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.STREAMKIND);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final BigInteger getStreamKindAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.STREAMKIND);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final URL getStreamKindAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.STREAMKIND);
    }


   /**
    * Get Last **Inform** call.
    * 
    * @return Last **Inform** call.
    */
    @Nullable
    public final Integer getInformAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.INFORM);
    }

   /**
    * Get Last **Inform** call.
    * 
    * @return Last **Inform** call.
    */
    @Nullable
    public final Long getInformAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.INFORM);
    }

   /**
    * Get Last **Inform** call.
    * 
    * @return Last **Inform** call.
    */
    @Nullable
    public final LocalDateTime getInformAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.INFORM);
    }

   /**
    * Get Last **Inform** call.
    * 
    * @return Last **Inform** call.
    */
    @Nullable
    public final LocalTime getInformAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.INFORM);
    }

   /**
    * Get Last **Inform** call.
    * 
    * @return Last **Inform** call.
    */
    @Nullable
    public final String getInformAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.INFORM);
    }

   /**
    * Get Last **Inform** call.
    * 
    * @return Last **Inform** call.
    */
    @Nullable
    public final Boolean getInformAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.INFORM);
    }

   /**
    * Get Last **Inform** call.
    * 
    * @return Last **Inform** call.
    */
    @Nullable
    public final BigInteger getInformAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.INFORM);
    }

   /**
    * Get Last **Inform** call.
    * 
    * @return Last **Inform** call.
    */
    @Nullable
    public final URL getInformAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.INFORM);
    }


   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final Integer getLanguageString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGESTRING1);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final Long getLanguageString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGESTRING1);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final LocalDateTime getLanguageString1AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGESTRING1);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final LocalTime getLanguageString1AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGESTRING1);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final String getLanguageString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGESTRING1);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final Boolean getLanguageString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGESTRING1);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final BigInteger getLanguageString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGESTRING1);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final URL getLanguageString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGESTRING1);
    }


   /**
    * Get Reason for the law rating.
    * 
    * @return Reason for the law rating.
    */
    @Nullable
    public final Integer getLawRatingReasonAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.LAWRATINGREASON);
    }

   /**
    * Get Reason for the law rating.
    * 
    * @return Reason for the law rating.
    */
    @Nullable
    public final Long getLawRatingReasonAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.LAWRATINGREASON);
    }

   /**
    * Get Reason for the law rating.
    * 
    * @return Reason for the law rating.
    */
    @Nullable
    public final LocalDateTime getLawRatingReasonAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.LAWRATINGREASON);
    }

   /**
    * Get Reason for the law rating.
    * 
    * @return Reason for the law rating.
    */
    @Nullable
    public final LocalTime getLawRatingReasonAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.LAWRATINGREASON);
    }

   /**
    * Get Reason for the law rating.
    * 
    * @return Reason for the law rating.
    */
    @Nullable
    public final String getLawRatingReasonAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.LAWRATINGREASON);
    }

   /**
    * Get Reason for the law rating.
    * 
    * @return Reason for the law rating.
    */
    @Nullable
    public final Boolean getLawRatingReasonAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.LAWRATINGREASON);
    }

   /**
    * Get Reason for the law rating.
    * 
    * @return Reason for the law rating.
    */
    @Nullable
    public final BigInteger getLawRatingReasonAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.LAWRATINGREASON);
    }

   /**
    * Get Reason for the law rating.
    * 
    * @return Reason for the law rating.
    */
    @Nullable
    public final URL getLawRatingReasonAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.LAWRATINGREASON);
    }


   /**
    * Get Language (2-letter ISO 639-1 if exists, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else empty).
    */
    @Nullable
    public final Integer getLanguageString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGESTRING2);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else empty).
    */
    @Nullable
    public final Long getLanguageString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGESTRING2);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else empty).
    */
    @Nullable
    public final LocalDateTime getLanguageString2AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGESTRING2);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else empty).
    */
    @Nullable
    public final LocalTime getLanguageString2AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGESTRING2);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else empty).
    */
    @Nullable
    public final String getLanguageString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGESTRING2);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else empty).
    */
    @Nullable
    public final Boolean getLanguageString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGESTRING2);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else empty).
    */
    @Nullable
    public final BigInteger getLanguageString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGESTRING2);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else empty).
    */
    @Nullable
    public final URL getLanguageString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGESTRING2);
    }


   /**
    * Get Language (3-letter ISO 639-2 if exists, else empty).
    * 
    * @return Language (3-letter ISO 639-2 if exists, else empty).
    */
    @Nullable
    public final Integer getLanguageString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGESTRING3);
    }

   /**
    * Get Language (3-letter ISO 639-2 if exists, else empty).
    * 
    * @return Language (3-letter ISO 639-2 if exists, else empty).
    */
    @Nullable
    public final Long getLanguageString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGESTRING3);
    }

   /**
    * Get Language (3-letter ISO 639-2 if exists, else empty).
    * 
    * @return Language (3-letter ISO 639-2 if exists, else empty).
    */
    @Nullable
    public final LocalDateTime getLanguageString3AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGESTRING3);
    }

   /**
    * Get Language (3-letter ISO 639-2 if exists, else empty).
    * 
    * @return Language (3-letter ISO 639-2 if exists, else empty).
    */
    @Nullable
    public final LocalTime getLanguageString3AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGESTRING3);
    }

   /**
    * Get Language (3-letter ISO 639-2 if exists, else empty).
    * 
    * @return Language (3-letter ISO 639-2 if exists, else empty).
    */
    @Nullable
    public final String getLanguageString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGESTRING3);
    }

   /**
    * Get Language (3-letter ISO 639-2 if exists, else empty).
    * 
    * @return Language (3-letter ISO 639-2 if exists, else empty).
    */
    @Nullable
    public final Boolean getLanguageString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGESTRING3);
    }

   /**
    * Get Language (3-letter ISO 639-2 if exists, else empty).
    * 
    * @return Language (3-letter ISO 639-2 if exists, else empty).
    */
    @Nullable
    public final BigInteger getLanguageString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGESTRING3);
    }

   /**
    * Get Language (3-letter ISO 639-2 if exists, else empty).
    * 
    * @return Language (3-letter ISO 639-2 if exists, else empty).
    */
    @Nullable
    public final URL getLanguageString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGESTRING3);
    }


   /**
    * Get Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    */
    @Nullable
    public final Integer getLanguageString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGESTRING4);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    */
    @Nullable
    public final Long getLanguageString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGESTRING4);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    */
    @Nullable
    public final LocalDateTime getLanguageString4AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGESTRING4);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    */
    @Nullable
    public final LocalTime getLanguageString4AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGESTRING4);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    */
    @Nullable
    public final String getLanguageString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGESTRING4);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    */
    @Nullable
    public final Boolean getLanguageString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGESTRING4);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    */
    @Nullable
    public final BigInteger getLanguageString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGESTRING4);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    */
    @Nullable
    public final URL getLanguageString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGESTRING4);
    }


   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final Integer getCodecIDAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.CODECID);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final Long getCodecIDAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.CODECID);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final LocalDateTime getCodecIDAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.CODECID);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final LocalTime getCodecIDAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.CODECID);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final String getCodecIDAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.CODECID);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final Boolean getCodecIDAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.CODECID);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final BigInteger getCodecIDAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.CODECID);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final URL getCodecIDAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.CODECID);
    }


   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final Integer getAlternateGroupAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.ALTERNATEGROUP);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final Long getAlternateGroupAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.ALTERNATEGROUP);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final LocalDateTime getAlternateGroupAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.ALTERNATEGROUP);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final LocalTime getAlternateGroupAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.ALTERNATEGROUP);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final String getAlternateGroupAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.ALTERNATEGROUP);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final Boolean getAlternateGroupAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.ALTERNATEGROUP);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final BigInteger getAlternateGroupAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.ALTERNATEGROUP);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final URL getAlternateGroupAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.ALTERNATEGROUP);
    }


   /**
    * Get Number of the stream (base=0).
    * 
    * @return Number of the stream (base=0).
    */
    @Nullable
    public final Integer getStreamKindIDAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.STREAMKINDID);
    }

   /**
    * Get Number of the stream (base=0).
    * 
    * @return Number of the stream (base=0).
    */
    @Nullable
    public final Long getStreamKindIDAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.STREAMKINDID);
    }

   /**
    * Get Number of the stream (base=0).
    * 
    * @return Number of the stream (base=0).
    */
    @Nullable
    public final LocalDateTime getStreamKindIDAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.STREAMKINDID);
    }

   /**
    * Get Number of the stream (base=0).
    * 
    * @return Number of the stream (base=0).
    */
    @Nullable
    public final LocalTime getStreamKindIDAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.STREAMKINDID);
    }

   /**
    * Get Number of the stream (base=0).
    * 
    * @return Number of the stream (base=0).
    */
    @Nullable
    public final String getStreamKindIDAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.STREAMKINDID);
    }

   /**
    * Get Number of the stream (base=0).
    * 
    * @return Number of the stream (base=0).
    */
    @Nullable
    public final Boolean getStreamKindIDAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.STREAMKINDID);
    }

   /**
    * Get Number of the stream (base=0).
    * 
    * @return Number of the stream (base=0).
    */
    @Nullable
    public final BigInteger getStreamKindIDAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.STREAMKINDID);
    }

   /**
    * Get Number of the stream (base=0).
    * 
    * @return Number of the stream (base=0).
    */
    @Nullable
    public final URL getStreamKindIDAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.STREAMKINDID);
    }


   /**
    * Get Format used.
    * 
    * @return Format used.
    */
    @Nullable
    public final Integer getFormatAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.FORMAT);
    }

   /**
    * Get Format used.
    * 
    * @return Format used.
    */
    @Nullable
    public final Long getFormatAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.FORMAT);
    }

   /**
    * Get Format used.
    * 
    * @return Format used.
    */
    @Nullable
    public final LocalDateTime getFormatAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.FORMAT);
    }

   /**
    * Get Format used.
    * 
    * @return Format used.
    */
    @Nullable
    public final LocalTime getFormatAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.FORMAT);
    }

   /**
    * Get Format used.
    * 
    * @return Format used.
    */
    @Nullable
    public final String getFormatAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.FORMAT);
    }

   /**
    * Get Format used.
    * 
    * @return Format used.
    */
    @Nullable
    public final Boolean getFormatAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.FORMAT);
    }

   /**
    * Get Format used.
    * 
    * @return Format used.
    */
    @Nullable
    public final BigInteger getFormatAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.FORMAT);
    }

   /**
    * Get Format used.
    * 
    * @return Format used.
    */
    @Nullable
    public final URL getFormatAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.FORMAT);
    }


   /**
    * Get Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    */
    @Nullable
    public final Integer getLanguageAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGE);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    */
    @Nullable
    public final Long getLanguageAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGE);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    */
    @Nullable
    public final LocalDateTime getLanguageAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGE);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    */
    @Nullable
    public final LocalTime getLanguageAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGE);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    */
    @Nullable
    public final String getLanguageAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGE);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    */
    @Nullable
    public final Boolean getLanguageAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGE);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    */
    @Nullable
    public final BigInteger getLanguageAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGE);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    */
    @Nullable
    public final URL getLanguageAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.LANGUAGE);
    }


   /**
    * Get Original/NetworkName.
    * 
    * @return Original/NetworkName.
    */
    @Nullable
    public final Integer getOriginalNetworkNameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.ORIGINALNETWORKNAME);
    }

   /**
    * Get Original/NetworkName.
    * 
    * @return Original/NetworkName.
    */
    @Nullable
    public final Long getOriginalNetworkNameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.ORIGINALNETWORKNAME);
    }

   /**
    * Get Original/NetworkName.
    * 
    * @return Original/NetworkName.
    */
    @Nullable
    public final LocalDateTime getOriginalNetworkNameAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.ORIGINALNETWORKNAME);
    }

   /**
    * Get Original/NetworkName.
    * 
    * @return Original/NetworkName.
    */
    @Nullable
    public final LocalTime getOriginalNetworkNameAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.ORIGINALNETWORKNAME);
    }

   /**
    * Get Original/NetworkName.
    * 
    * @return Original/NetworkName.
    */
    @Nullable
    public final String getOriginalNetworkNameAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.ORIGINALNETWORKNAME);
    }

   /**
    * Get Original/NetworkName.
    * 
    * @return Original/NetworkName.
    */
    @Nullable
    public final Boolean getOriginalNetworkNameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.ORIGINALNETWORKNAME);
    }

   /**
    * Get Original/NetworkName.
    * 
    * @return Original/NetworkName.
    */
    @Nullable
    public final BigInteger getOriginalNetworkNameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.ORIGINALNETWORKNAME);
    }

   /**
    * Get Original/NetworkName.
    * 
    * @return Original/NetworkName.
    */
    @Nullable
    public final URL getOriginalNetworkNameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.ORIGINALNETWORKNAME);
    }


   /**
    * Get Info about this codec.
    * 
    * @return Info about this codec.
    */
    @Nullable
    public final Integer getCodecIDInfoAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.CODECIDINFO);
    }

   /**
    * Get Info about this codec.
    * 
    * @return Info about this codec.
    */
    @Nullable
    public final Long getCodecIDInfoAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.CODECIDINFO);
    }

   /**
    * Get Info about this codec.
    * 
    * @return Info about this codec.
    */
    @Nullable
    public final LocalDateTime getCodecIDInfoAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.CODECIDINFO);
    }

   /**
    * Get Info about this codec.
    * 
    * @return Info about this codec.
    */
    @Nullable
    public final LocalTime getCodecIDInfoAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.CODECIDINFO);
    }

   /**
    * Get Info about this codec.
    * 
    * @return Info about this codec.
    */
    @Nullable
    public final String getCodecIDInfoAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.CODECIDINFO);
    }

   /**
    * Get Info about this codec.
    * 
    * @return Info about this codec.
    */
    @Nullable
    public final Boolean getCodecIDInfoAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.CODECIDINFO);
    }

   /**
    * Get Info about this codec.
    * 
    * @return Info about this codec.
    */
    @Nullable
    public final BigInteger getCodecIDInfoAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.CODECIDINFO);
    }

   /**
    * Get Info about this codec.
    * 
    * @return Info about this codec.
    */
    @Nullable
    public final URL getCodecIDInfoAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.CODECIDINFO);
    }


   /**
    * Get Link.
    * 
    * @return Link.
    */
    @Nullable
    public final Integer getFormatUrlAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.FORMATURL);
    }

   /**
    * Get Link.
    * 
    * @return Link.
    */
    @Nullable
    public final Long getFormatUrlAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.FORMATURL);
    }

   /**
    * Get Link.
    * 
    * @return Link.
    */
    @Nullable
    public final LocalDateTime getFormatUrlAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.FORMATURL);
    }

   /**
    * Get Link.
    * 
    * @return Link.
    */
    @Nullable
    public final LocalTime getFormatUrlAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.FORMATURL);
    }

   /**
    * Get Link.
    * 
    * @return Link.
    */
    @Nullable
    public final String getFormatUrlAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.FORMATURL);
    }

   /**
    * Get Link.
    * 
    * @return Link.
    */
    @Nullable
    public final Boolean getFormatUrlAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.FORMATURL);
    }

   /**
    * Get Link.
    * 
    * @return Link.
    */
    @Nullable
    public final BigInteger getFormatUrlAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.FORMATURL);
    }

   /**
    * Get Link.
    * 
    * @return Link.
    */
    @Nullable
    public final URL getFormatUrlAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.FORMATURL);
    }


   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final Integer getCodecIDStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.CODECIDSTRING);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final Long getCodecIDStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.CODECIDSTRING);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final LocalDateTime getCodecIDStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.CODECIDSTRING);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final LocalTime getCodecIDStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.CODECIDSTRING);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final String getCodecIDStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.CODECIDSTRING);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final Boolean getCodecIDStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.CODECIDSTRING);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final BigInteger getCodecIDStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.CODECIDSTRING);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final URL getCodecIDStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.CODECIDSTRING);
    }


   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Integer getDefaultStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.DEFAULTSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Long getDefaultStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.DEFAULTSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final LocalDateTime getDefaultStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.DEFAULTSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final LocalTime getDefaultStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.DEFAULTSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final String getDefaultStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.DEFAULTSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Boolean getDefaultStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.DEFAULTSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final BigInteger getDefaultStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.DEFAULTSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final URL getDefaultStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.DEFAULTSTRING);
    }


   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final Integer getOriginalSourceMediumIDStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.ORIGINALSOURCEMEDIUMIDSTRING);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final Long getOriginalSourceMediumIDStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.ORIGINALSOURCEMEDIUMIDSTRING);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final LocalDateTime getOriginalSourceMediumIDStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.ORIGINALSOURCEMEDIUMIDSTRING);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final LocalTime getOriginalSourceMediumIDStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.ORIGINALSOURCEMEDIUMIDSTRING);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final String getOriginalSourceMediumIDStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.ORIGINALSOURCEMEDIUMIDSTRING);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final Boolean getOriginalSourceMediumIDStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.ORIGINALSOURCEMEDIUMIDSTRING);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final BigInteger getOriginalSourceMediumIDStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.ORIGINALSOURCEMEDIUMIDSTRING);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final URL getOriginalSourceMediumIDStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.ORIGINALSOURCEMEDIUMIDSTRING);
    }


   /**
    * Get Commercial name used by vendor for theses setings or Format field if there is no difference.
    * 
    * @return Commercial name used by vendor for theses setings or Format field if there is no difference.
    */
    @Nullable
    public final Integer getFormatCommercialAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.FORMATCOMMERCIAL);
    }

   /**
    * Get Commercial name used by vendor for theses setings or Format field if there is no difference.
    * 
    * @return Commercial name used by vendor for theses setings or Format field if there is no difference.
    */
    @Nullable
    public final Long getFormatCommercialAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.FORMATCOMMERCIAL);
    }

   /**
    * Get Commercial name used by vendor for theses setings or Format field if there is no difference.
    * 
    * @return Commercial name used by vendor for theses setings or Format field if there is no difference.
    */
    @Nullable
    public final LocalDateTime getFormatCommercialAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.FORMATCOMMERCIAL);
    }

   /**
    * Get Commercial name used by vendor for theses setings or Format field if there is no difference.
    * 
    * @return Commercial name used by vendor for theses setings or Format field if there is no difference.
    */
    @Nullable
    public final LocalTime getFormatCommercialAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.FORMATCOMMERCIAL);
    }

   /**
    * Get Commercial name used by vendor for theses setings or Format field if there is no difference.
    * 
    * @return Commercial name used by vendor for theses setings or Format field if there is no difference.
    */
    @Nullable
    public final String getFormatCommercialAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.FORMATCOMMERCIAL);
    }

   /**
    * Get Commercial name used by vendor for theses setings or Format field if there is no difference.
    * 
    * @return Commercial name used by vendor for theses setings or Format field if there is no difference.
    */
    @Nullable
    public final Boolean getFormatCommercialAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.FORMATCOMMERCIAL);
    }

   /**
    * Get Commercial name used by vendor for theses setings or Format field if there is no difference.
    * 
    * @return Commercial name used by vendor for theses setings or Format field if there is no difference.
    */
    @Nullable
    public final BigInteger getFormatCommercialAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.FORMATCOMMERCIAL);
    }

   /**
    * Get Commercial name used by vendor for theses setings or Format field if there is no difference.
    * 
    * @return Commercial name used by vendor for theses setings or Format field if there is no difference.
    */
    @Nullable
    public final URL getFormatCommercialAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.FORMATCOMMERCIAL);
    }


   /**
    * Get Info about Format.
    * 
    * @return Info about Format.
    */
    @Nullable
    public final Integer getFormatInfoAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.FORMATINFO);
    }

   /**
    * Get Info about Format.
    * 
    * @return Info about Format.
    */
    @Nullable
    public final Long getFormatInfoAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.FORMATINFO);
    }

   /**
    * Get Info about Format.
    * 
    * @return Info about Format.
    */
    @Nullable
    public final LocalDateTime getFormatInfoAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.FORMATINFO);
    }

   /**
    * Get Info about Format.
    * 
    * @return Info about Format.
    */
    @Nullable
    public final LocalTime getFormatInfoAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.FORMATINFO);
    }

   /**
    * Get Info about Format.
    * 
    * @return Info about Format.
    */
    @Nullable
    public final String getFormatInfoAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.FORMATINFO);
    }

   /**
    * Get Info about Format.
    * 
    * @return Info about Format.
    */
    @Nullable
    public final Boolean getFormatInfoAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.FORMATINFO);
    }

   /**
    * Get Info about Format.
    * 
    * @return Info about Format.
    */
    @Nullable
    public final BigInteger getFormatInfoAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.FORMATINFO);
    }

   /**
    * Get Info about Format.
    * 
    * @return Info about Format.
    */
    @Nullable
    public final URL getFormatInfoAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.FORMATINFO);
    }


   /**
    * Get A link to more details about this codec ID.
    * 
    * @return A link to more details about this codec ID.
    */
    @Nullable
    public final Integer getCodecIDUrlAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.CODECIDURL);
    }

   /**
    * Get A link to more details about this codec ID.
    * 
    * @return A link to more details about this codec ID.
    */
    @Nullable
    public final Long getCodecIDUrlAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.CODECIDURL);
    }

   /**
    * Get A link to more details about this codec ID.
    * 
    * @return A link to more details about this codec ID.
    */
    @Nullable
    public final LocalDateTime getCodecIDUrlAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.CODECIDURL);
    }

   /**
    * Get A link to more details about this codec ID.
    * 
    * @return A link to more details about this codec ID.
    */
    @Nullable
    public final LocalTime getCodecIDUrlAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.CODECIDURL);
    }

   /**
    * Get A link to more details about this codec ID.
    * 
    * @return A link to more details about this codec ID.
    */
    @Nullable
    public final String getCodecIDUrlAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.CODECIDURL);
    }

   /**
    * Get A link to more details about this codec ID.
    * 
    * @return A link to more details about this codec ID.
    */
    @Nullable
    public final Boolean getCodecIDUrlAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.CODECIDURL);
    }

   /**
    * Get A link to more details about this codec ID.
    * 
    * @return A link to more details about this codec ID.
    */
    @Nullable
    public final BigInteger getCodecIDUrlAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.CODECIDURL);
    }

   /**
    * Get A link to more details about this codec ID.
    * 
    * @return A link to more details about this codec ID.
    */
    @Nullable
    public final URL getCodecIDUrlAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.CODECIDURL);
    }


   /**
    * Get Name of this menu.
    * 
    * @return Name of this menu.
    */
    @Nullable
    public final Integer getTitleAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.TITLE);
    }

   /**
    * Get Name of this menu.
    * 
    * @return Name of this menu.
    */
    @Nullable
    public final Long getTitleAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.TITLE);
    }

   /**
    * Get Name of this menu.
    * 
    * @return Name of this menu.
    */
    @Nullable
    public final LocalDateTime getTitleAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.TITLE);
    }

   /**
    * Get Name of this menu.
    * 
    * @return Name of this menu.
    */
    @Nullable
    public final LocalTime getTitleAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.TITLE);
    }

   /**
    * Get Name of this menu.
    * 
    * @return Name of this menu.
    */
    @Nullable
    public final String getTitleAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.TITLE);
    }

   /**
    * Get Name of this menu.
    * 
    * @return Name of this menu.
    */
    @Nullable
    public final Boolean getTitleAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.TITLE);
    }

   /**
    * Get Name of this menu.
    * 
    * @return Name of this menu.
    */
    @Nullable
    public final BigInteger getTitleAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.TITLE);
    }

   /**
    * Get Name of this menu.
    * 
    * @return Name of this menu.
    */
    @Nullable
    public final URL getTitleAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.TITLE);
    }


   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final Integer getStreamKindStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.STREAMKINDSTRING);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final Long getStreamKindStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.STREAMKINDSTRING);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final LocalDateTime getStreamKindStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.STREAMKINDSTRING);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final LocalTime getStreamKindStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.STREAMKINDSTRING);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final String getStreamKindStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.STREAMKINDSTRING);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final Boolean getStreamKindStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.STREAMKINDSTRING);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final BigInteger getStreamKindStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.STREAMKINDSTRING);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final URL getStreamKindStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.STREAMKINDSTRING);
    }


   /**
    * Get List of programs available.
    * 
    * @return List of programs available.
    */
    @Nullable
    public final Integer getListStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.LISTSTRING);
    }

   /**
    * Get List of programs available.
    * 
    * @return List of programs available.
    */
    @Nullable
    public final Long getListStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.LISTSTRING);
    }

   /**
    * Get List of programs available.
    * 
    * @return List of programs available.
    */
    @Nullable
    public final LocalDateTime getListStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.LISTSTRING);
    }

   /**
    * Get List of programs available.
    * 
    * @return List of programs available.
    */
    @Nullable
    public final LocalTime getListStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.LISTSTRING);
    }

   /**
    * Get List of programs available.
    * 
    * @return List of programs available.
    */
    @Nullable
    public final String getListStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.LISTSTRING);
    }

   /**
    * Get List of programs available.
    * 
    * @return List of programs available.
    */
    @Nullable
    public final Boolean getListStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.LISTSTRING);
    }

   /**
    * Get List of programs available.
    * 
    * @return List of programs available.
    */
    @Nullable
    public final BigInteger getListStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.LISTSTRING);
    }

   /**
    * Get List of programs available.
    * 
    * @return List of programs available.
    */
    @Nullable
    public final URL getListStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.LISTSTRING);
    }


   /**
    * Get Delay drop frame.
    * 
    * @return Delay drop frame.
    */
    @Nullable
    public final Integer getDelayDropFrameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.DELAYDROPFRAME);
    }

   /**
    * Get Delay drop frame.
    * 
    * @return Delay drop frame.
    */
    @Nullable
    public final Long getDelayDropFrameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.DELAYDROPFRAME);
    }

   /**
    * Get Delay drop frame.
    * 
    * @return Delay drop frame.
    */
    @Nullable
    public final LocalDateTime getDelayDropFrameAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.DELAYDROPFRAME);
    }

   /**
    * Get Delay drop frame.
    * 
    * @return Delay drop frame.
    */
    @Nullable
    public final LocalTime getDelayDropFrameAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.DELAYDROPFRAME);
    }

   /**
    * Get Delay drop frame.
    * 
    * @return Delay drop frame.
    */
    @Nullable
    public final String getDelayDropFrameAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.DELAYDROPFRAME);
    }

   /**
    * Get Delay drop frame.
    * 
    * @return Delay drop frame.
    */
    @Nullable
    public final Boolean getDelayDropFrameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.DELAYDROPFRAME);
    }

   /**
    * Get Delay drop frame.
    * 
    * @return Delay drop frame.
    */
    @Nullable
    public final BigInteger getDelayDropFrameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.DELAYDROPFRAME);
    }

   /**
    * Get Delay drop frame.
    * 
    * @return Delay drop frame.
    */
    @Nullable
    public final URL getDelayDropFrameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.DELAYDROPFRAME);
    }


   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final Integer getDisabledStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.DISABLEDSTRING);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final Long getDisabledStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.DISABLEDSTRING);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final LocalDateTime getDisabledStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.DISABLEDSTRING);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final LocalTime getDisabledStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.DISABLEDSTRING);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final String getDisabledStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.DISABLEDSTRING);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final Boolean getDisabledStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.DISABLEDSTRING);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final BigInteger getDisabledStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.DISABLEDSTRING);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final URL getDisabledStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.DISABLEDSTRING);
    }


   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Integer getDefaultAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.DEFAULT);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Long getDefaultAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.DEFAULT);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final LocalDateTime getDefaultAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.DEFAULT);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final LocalTime getDefaultAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.DEFAULT);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final String getDefaultAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.DEFAULT);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Boolean getDefaultAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.DEFAULT);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final BigInteger getDefaultAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.DEFAULT);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final URL getDefaultAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.DEFAULT);
    }


   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final Integer getMenuIDAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.MENUID);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final Long getMenuIDAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.MENUID);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final LocalDateTime getMenuIDAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.MENUID);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final LocalTime getMenuIDAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.MENUID);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final String getMenuIDAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.MENUID);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final Boolean getMenuIDAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.MENUID);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final BigInteger getMenuIDAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.MENUID);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final URL getMenuIDAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.MENUID);
    }


   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final Integer getUniqueIDStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.UNIQUEIDSTRING);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final Long getUniqueIDStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.UNIQUEIDSTRING);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final LocalDateTime getUniqueIDStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.UNIQUEIDSTRING);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final LocalTime getUniqueIDStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.UNIQUEIDSTRING);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final String getUniqueIDStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.UNIQUEIDSTRING);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final Boolean getUniqueIDStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.UNIQUEIDSTRING);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final BigInteger getUniqueIDStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.UNIQUEIDSTRING);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final URL getUniqueIDStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.UNIQUEIDSTRING);
    }


   /**
    * Get Commercial name used by vendor for theses setings if there is one.
    * 
    * @return Commercial name used by vendor for theses setings if there is one.
    */
    @Nullable
    public final Integer getFormatCommercialIfAnyAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.FORMATCOMMERCIALIFANY);
    }

   /**
    * Get Commercial name used by vendor for theses setings if there is one.
    * 
    * @return Commercial name used by vendor for theses setings if there is one.
    */
    @Nullable
    public final Long getFormatCommercialIfAnyAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.FORMATCOMMERCIALIFANY);
    }

   /**
    * Get Commercial name used by vendor for theses setings if there is one.
    * 
    * @return Commercial name used by vendor for theses setings if there is one.
    */
    @Nullable
    public final LocalDateTime getFormatCommercialIfAnyAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.FORMATCOMMERCIALIFANY);
    }

   /**
    * Get Commercial name used by vendor for theses setings if there is one.
    * 
    * @return Commercial name used by vendor for theses setings if there is one.
    */
    @Nullable
    public final LocalTime getFormatCommercialIfAnyAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.FORMATCOMMERCIALIFANY);
    }

   /**
    * Get Commercial name used by vendor for theses setings if there is one.
    * 
    * @return Commercial name used by vendor for theses setings if there is one.
    */
    @Nullable
    public final String getFormatCommercialIfAnyAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.FORMATCOMMERCIALIFANY);
    }

   /**
    * Get Commercial name used by vendor for theses setings if there is one.
    * 
    * @return Commercial name used by vendor for theses setings if there is one.
    */
    @Nullable
    public final Boolean getFormatCommercialIfAnyAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.FORMATCOMMERCIALIFANY);
    }

   /**
    * Get Commercial name used by vendor for theses setings if there is one.
    * 
    * @return Commercial name used by vendor for theses setings if there is one.
    */
    @Nullable
    public final BigInteger getFormatCommercialIfAnyAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.FORMATCOMMERCIALIFANY);
    }

   /**
    * Get Commercial name used by vendor for theses setings if there is one.
    * 
    * @return Commercial name used by vendor for theses setings if there is one.
    */
    @Nullable
    public final URL getFormatCommercialIfAnyAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.FORMATCOMMERCIALIFANY);
    }


   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final Integer getIDStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.IDSTRING);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final Long getIDStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.IDSTRING);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final LocalDateTime getIDStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.IDSTRING);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final LocalTime getIDStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.IDSTRING);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final String getIDStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.IDSTRING);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final Boolean getIDStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.IDSTRING);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final BigInteger getIDStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.IDSTRING);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final URL getIDStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.IDSTRING);
    }


   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final Integer getAlternateGroupStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.ALTERNATEGROUPSTRING);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final Long getAlternateGroupStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.ALTERNATEGROUPSTRING);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final LocalDateTime getAlternateGroupStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.ALTERNATEGROUPSTRING);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final LocalTime getAlternateGroupStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.ALTERNATEGROUPSTRING);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final String getAlternateGroupStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.ALTERNATEGROUPSTRING);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final Boolean getAlternateGroupStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.ALTERNATEGROUPSTRING);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final BigInteger getAlternateGroupStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.ALTERNATEGROUPSTRING);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final URL getAlternateGroupStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.ALTERNATEGROUPSTRING);
    }


   /**
    * Get Profile of the Format.
    * 
    * @return Profile of the Format.
    */
    @Nullable
    public final Integer getFormatProfileAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.FORMATPROFILE);
    }

   /**
    * Get Profile of the Format.
    * 
    * @return Profile of the Format.
    */
    @Nullable
    public final Long getFormatProfileAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.FORMATPROFILE);
    }

   /**
    * Get Profile of the Format.
    * 
    * @return Profile of the Format.
    */
    @Nullable
    public final LocalDateTime getFormatProfileAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.FORMATPROFILE);
    }

   /**
    * Get Profile of the Format.
    * 
    * @return Profile of the Format.
    */
    @Nullable
    public final LocalTime getFormatProfileAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.FORMATPROFILE);
    }

   /**
    * Get Profile of the Format.
    * 
    * @return Profile of the Format.
    */
    @Nullable
    public final String getFormatProfileAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.FORMATPROFILE);
    }

   /**
    * Get Profile of the Format.
    * 
    * @return Profile of the Format.
    */
    @Nullable
    public final Boolean getFormatProfileAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.FORMATPROFILE);
    }

   /**
    * Get Profile of the Format.
    * 
    * @return Profile of the Format.
    */
    @Nullable
    public final BigInteger getFormatProfileAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.FORMATPROFILE);
    }

   /**
    * Get Profile of the Format.
    * 
    * @return Profile of the Format.
    */
    @Nullable
    public final URL getFormatProfileAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.FORMATPROFILE);
    }


   /**
    * Get ServiceChannel.
    * 
    * @return ServiceChannel.
    */
    @Nullable
    public final Integer getServiceChannelAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Menu, getStreamNumber(), Menu.SERVICECHANNEL);
    }

   /**
    * Get ServiceChannel.
    * 
    * @return ServiceChannel.
    */
    @Nullable
    public final Long getServiceChannelAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Menu, getStreamNumber(), Menu.SERVICECHANNEL);
    }

   /**
    * Get ServiceChannel.
    * 
    * @return ServiceChannel.
    */
    @Nullable
    public final LocalDateTime getServiceChannelAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Menu, getStreamNumber(), Menu.SERVICECHANNEL);
    }

   /**
    * Get ServiceChannel.
    * 
    * @return ServiceChannel.
    */
    @Nullable
    public final LocalTime getServiceChannelAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Menu, getStreamNumber(), Menu.SERVICECHANNEL);
    }

   /**
    * Get ServiceChannel.
    * 
    * @return ServiceChannel.
    */
    @Nullable
    public final String getServiceChannelAsString() {
        return getMediaInfo().getAsString(StreamKind.Menu, getStreamNumber(), Menu.SERVICECHANNEL);
    }

   /**
    * Get ServiceChannel.
    * 
    * @return ServiceChannel.
    */
    @Nullable
    public final Boolean getServiceChannelAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Menu, getStreamNumber(), Menu.SERVICECHANNEL);
    }

   /**
    * Get ServiceChannel.
    * 
    * @return ServiceChannel.
    */
    @Nullable
    public final BigInteger getServiceChannelAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Menu, getStreamNumber(), Menu.SERVICECHANNEL);
    }

   /**
    * Get ServiceChannel.
    * 
    * @return ServiceChannel.
    */
    @Nullable
    public final URL getServiceChannelAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Menu, getStreamNumber(), Menu.SERVICECHANNEL);
    }


}
