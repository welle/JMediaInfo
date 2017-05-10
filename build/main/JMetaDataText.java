package aka.jmetadata.main;

import java.math.BigInteger;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import aka.jmetadata.main.constants.Text;
import aka.jmetadata.main.constants.StreamKind;
import aka.jmetadata.main.mediainfo.MediaInfo;

/**
 * This class contains all methods to extract Text informations of a specific Text stream.
 *
 * @author Welle Charlotte
 */
public final class JMetaDataText extends AbstractStreamJMetadata {

   /**
    * Constructor.
    * 
    * @param mediaInfo instance of MediaInfo JNA library
    * @param streamNumber number of the stream to parse
    * @see MediaInfo
    */
    public JMetaDataText(@NonNull final MediaInfo mediaInfo, final int streamNumber) {
        super(mediaInfo, streamNumber);
    }

   /**
    * Get Delay source (Stream or empty).
    * 
    * @return Delay source (Stream or empty).
    */
    @Nullable
    public final Integer getDelayOriginalSourceAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSOURCE);
    }

   /**
    * Get Delay source (Stream or empty).
    * 
    * @return Delay source (Stream or empty).
    */
    @Nullable
    public final Long getDelayOriginalSourceAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSOURCE);
    }

   /**
    * Get Delay source (Stream or empty).
    * 
    * @return Delay source (Stream or empty).
    */
    @Nullable
    public final LocalDateTime getDelayOriginalSourceAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSOURCE);
    }

   /**
    * Get Delay source (Stream or empty).
    * 
    * @return Delay source (Stream or empty).
    */
    @Nullable
    public final LocalTime getDelayOriginalSourceAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSOURCE);
    }

   /**
    * Get Delay source (Stream or empty).
    * 
    * @return Delay source (Stream or empty).
    */
    @Nullable
    public final String getDelayOriginalSourceAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSOURCE);
    }

   /**
    * Get Delay source (Stream or empty).
    * 
    * @return Delay source (Stream or empty).
    */
    @Nullable
    public final Boolean getDelayOriginalSourceAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSOURCE);
    }

   /**
    * Get Delay source (Stream or empty).
    * 
    * @return Delay source (Stream or empty).
    */
    @Nullable
    public final BigInteger getDelayOriginalSourceAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSOURCE);
    }

   /**
    * Get Delay source (Stream or empty).
    * 
    * @return Delay source (Stream or empty).
    */
    @Nullable
    public final URL getDelayOriginalSourceAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSOURCE);
    }


   /**
    * Get Stream order in the file, whatever is the kind of stream (base=0).
    * 
    * @return Stream order in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final Integer getStreamOrderAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.STREAMORDER);
    }

   /**
    * Get Stream order in the file, whatever is the kind of stream (base=0).
    * 
    * @return Stream order in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final Long getStreamOrderAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.STREAMORDER);
    }

   /**
    * Get Stream order in the file, whatever is the kind of stream (base=0).
    * 
    * @return Stream order in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final LocalDateTime getStreamOrderAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.STREAMORDER);
    }

   /**
    * Get Stream order in the file, whatever is the kind of stream (base=0).
    * 
    * @return Stream order in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final LocalTime getStreamOrderAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.STREAMORDER);
    }

   /**
    * Get Stream order in the file, whatever is the kind of stream (base=0).
    * 
    * @return Stream order in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final String getStreamOrderAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.STREAMORDER);
    }

   /**
    * Get Stream order in the file, whatever is the kind of stream (base=0).
    * 
    * @return Stream order in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final Boolean getStreamOrderAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.STREAMORDER);
    }

   /**
    * Get Stream order in the file, whatever is the kind of stream (base=0).
    * 
    * @return Stream order in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final BigInteger getStreamOrderAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.STREAMORDER);
    }

   /**
    * Get Stream order in the file, whatever is the kind of stream (base=0).
    * 
    * @return Stream order in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final URL getStreamOrderAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.STREAMORDER);
    }


   /**
    * Get Name of the the encoding-software.
    * 
    * @return Name of the the encoding-software.
    */
    @Nullable
    public final Integer getEncodedLibraryNameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYNAME);
    }

   /**
    * Get Name of the the encoding-software.
    * 
    * @return Name of the the encoding-software.
    */
    @Nullable
    public final Long getEncodedLibraryNameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYNAME);
    }

   /**
    * Get Name of the the encoding-software.
    * 
    * @return Name of the the encoding-software.
    */
    @Nullable
    public final LocalDateTime getEncodedLibraryNameAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYNAME);
    }

   /**
    * Get Name of the the encoding-software.
    * 
    * @return Name of the the encoding-software.
    */
    @Nullable
    public final LocalTime getEncodedLibraryNameAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYNAME);
    }

   /**
    * Get Name of the the encoding-software.
    * 
    * @return Name of the the encoding-software.
    */
    @Nullable
    public final String getEncodedLibraryNameAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYNAME);
    }

   /**
    * Get Name of the the encoding-software.
    * 
    * @return Name of the the encoding-software.
    */
    @Nullable
    public final Boolean getEncodedLibraryNameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYNAME);
    }

   /**
    * Get Name of the the encoding-software.
    * 
    * @return Name of the the encoding-software.
    */
    @Nullable
    public final BigInteger getEncodedLibraryNameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYNAME);
    }

   /**
    * Get Name of the the encoding-software.
    * 
    * @return Name of the the encoding-software.
    */
    @Nullable
    public final URL getEncodedLibraryNameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYNAME);
    }


   /**
    * Get Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Integer getDurationFirstFrameString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING4);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Long getDurationFirstFrameString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING4);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalDateTime getDurationFirstFrameString4AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING4);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalTime getDurationFirstFrameString4AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING4);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final String getDurationFirstFrameString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING4);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Boolean getDurationFirstFrameString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING4);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final BigInteger getDurationFirstFrameString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING4);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final URL getDurationFirstFrameString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING4);
    }


   /**
    * Get Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Integer getDurationFirstFrameString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING5);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Long getDurationFirstFrameString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING5);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalDateTime getDurationFirstFrameString5AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING5);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalTime getDurationFirstFrameString5AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING5);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final String getDurationFirstFrameString5AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING5);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Boolean getDurationFirstFrameString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING5);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final BigInteger getDurationFirstFrameString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING5);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final URL getDurationFirstFrameString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING5);
    }


   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Integer getDurationFirstFrameString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING2);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Long getDurationFirstFrameString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING2);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalDateTime getDurationFirstFrameString2AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING2);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalTime getDurationFirstFrameString2AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING2);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final String getDurationFirstFrameString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING2);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Boolean getDurationFirstFrameString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING2);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final BigInteger getDurationFirstFrameString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING2);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final URL getDurationFirstFrameString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING2);
    }


   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Integer getSourceDurationFirstFrameStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Long getSourceDurationFirstFrameStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalDateTime getSourceDurationFirstFrameStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalTime getSourceDurationFirstFrameStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final String getSourceDurationFirstFrameStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Boolean getSourceDurationFirstFrameStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final BigInteger getSourceDurationFirstFrameStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final URL getSourceDurationFirstFrameStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING);
    }


   /**
    * Get Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Integer getDurationFirstFrameString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING3);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Long getDurationFirstFrameString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING3);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalDateTime getDurationFirstFrameString3AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING3);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalTime getDurationFirstFrameString3AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING3);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final String getDurationFirstFrameString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING3);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Boolean getDurationFirstFrameString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING3);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final BigInteger getDurationFirstFrameString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING3);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final URL getDurationFirstFrameString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING3);
    }


   /**
    * Get Source Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final Integer getSourceDurationLastFrameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAME);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final Long getSourceDurationLastFrameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAME);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final LocalDateTime getSourceDurationLastFrameAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAME);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final LocalTime getSourceDurationLastFrameAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAME);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final String getSourceDurationLastFrameAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAME);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final Boolean getSourceDurationLastFrameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAME);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final BigInteger getSourceDurationLastFrameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAME);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final URL getSourceDurationLastFrameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAME);
    }


   /**
    * Get Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Integer getDurationFirstFrameString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING1);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Long getDurationFirstFrameString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING1);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final LocalDateTime getDurationFirstFrameString1AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING1);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final LocalTime getDurationFirstFrameString1AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING1);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final String getDurationFirstFrameString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING1);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Boolean getDurationFirstFrameString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING1);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final BigInteger getDurationFirstFrameString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING1);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final URL getDurationFirstFrameString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING1);
    }


   /**
    * Get Compression method used.
    * 
    * @return Compression method used.
    */
    @Nullable
    public final Integer getFormatCompressionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.FORMATCOMPRESSION);
    }

   /**
    * Get Compression method used.
    * 
    * @return Compression method used.
    */
    @Nullable
    public final Long getFormatCompressionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.FORMATCOMPRESSION);
    }

   /**
    * Get Compression method used.
    * 
    * @return Compression method used.
    */
    @Nullable
    public final LocalDateTime getFormatCompressionAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.FORMATCOMPRESSION);
    }

   /**
    * Get Compression method used.
    * 
    * @return Compression method used.
    */
    @Nullable
    public final LocalTime getFormatCompressionAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.FORMATCOMPRESSION);
    }

   /**
    * Get Compression method used.
    * 
    * @return Compression method used.
    */
    @Nullable
    public final String getFormatCompressionAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.FORMATCOMPRESSION);
    }

   /**
    * Get Compression method used.
    * 
    * @return Compression method used.
    */
    @Nullable
    public final Boolean getFormatCompressionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.FORMATCOMPRESSION);
    }

   /**
    * Get Compression method used.
    * 
    * @return Compression method used.
    */
    @Nullable
    public final BigInteger getFormatCompressionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.FORMATCOMPRESSION);
    }

   /**
    * Get Compression method used.
    * 
    * @return Compression method used.
    */
    @Nullable
    public final URL getFormatCompressionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.FORMATCOMPRESSION);
    }


   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Integer getDelayStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Long getDelayStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final LocalDateTime getDelayStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final LocalTime getDelayStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final String getDelayStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Boolean getDelayStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final BigInteger getDelayStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final URL getDelayStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING);
    }


   /**
    * Get More info (text) about the muxing mode.
    * 
    * @return More info (text) about the muxing mode.
    */
    @Nullable
    public final Integer getMuxingModeMoreInfoAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.MUXINGMODEMOREINFO);
    }

   /**
    * Get More info (text) about the muxing mode.
    * 
    * @return More info (text) about the muxing mode.
    */
    @Nullable
    public final Long getMuxingModeMoreInfoAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.MUXINGMODEMOREINFO);
    }

   /**
    * Get More info (text) about the muxing mode.
    * 
    * @return More info (text) about the muxing mode.
    */
    @Nullable
    public final LocalDateTime getMuxingModeMoreInfoAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.MUXINGMODEMOREINFO);
    }

   /**
    * Get More info (text) about the muxing mode.
    * 
    * @return More info (text) about the muxing mode.
    */
    @Nullable
    public final LocalTime getMuxingModeMoreInfoAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.MUXINGMODEMOREINFO);
    }

   /**
    * Get More info (text) about the muxing mode.
    * 
    * @return More info (text) about the muxing mode.
    */
    @Nullable
    public final String getMuxingModeMoreInfoAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.MUXINGMODEMOREINFO);
    }

   /**
    * Get More info (text) about the muxing mode.
    * 
    * @return More info (text) about the muxing mode.
    */
    @Nullable
    public final Boolean getMuxingModeMoreInfoAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.MUXINGMODEMOREINFO);
    }

   /**
    * Get More info (text) about the muxing mode.
    * 
    * @return More info (text) about the muxing mode.
    */
    @Nullable
    public final BigInteger getMuxingModeMoreInfoAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.MUXINGMODEMOREINFO);
    }

   /**
    * Get More info (text) about the muxing mode.
    * 
    * @return More info (text) about the muxing mode.
    */
    @Nullable
    public final URL getMuxingModeMoreInfoAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.MUXINGMODEMOREINFO);
    }


   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final Integer getSourceStreamSizeEncodedStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING);
    }

   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final Long getSourceStreamSizeEncodedStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING);
    }

   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final LocalDateTime getSourceStreamSizeEncodedStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING);
    }

   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final LocalTime getSourceStreamSizeEncodedStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING);
    }

   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final String getSourceStreamSizeEncodedStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING);
    }

   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final Boolean getSourceStreamSizeEncodedStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING);
    }

   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeEncodedStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING);
    }

   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final URL getSourceStreamSizeEncodedStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING);
    }


   /**
    * Get Manual description given by the container.
    * 
    * @return Manual description given by the container.
    */
    @Nullable
    public final Integer getCodecIDDescriptionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.CODECIDDESCRIPTION);
    }

   /**
    * Get Manual description given by the container.
    * 
    * @return Manual description given by the container.
    */
    @Nullable
    public final Long getCodecIDDescriptionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.CODECIDDESCRIPTION);
    }

   /**
    * Get Manual description given by the container.
    * 
    * @return Manual description given by the container.
    */
    @Nullable
    public final LocalDateTime getCodecIDDescriptionAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.CODECIDDESCRIPTION);
    }

   /**
    * Get Manual description given by the container.
    * 
    * @return Manual description given by the container.
    */
    @Nullable
    public final LocalTime getCodecIDDescriptionAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.CODECIDDESCRIPTION);
    }

   /**
    * Get Manual description given by the container.
    * 
    * @return Manual description given by the container.
    */
    @Nullable
    public final String getCodecIDDescriptionAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.CODECIDDESCRIPTION);
    }

   /**
    * Get Manual description given by the container.
    * 
    * @return Manual description given by the container.
    */
    @Nullable
    public final Boolean getCodecIDDescriptionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.CODECIDDESCRIPTION);
    }

   /**
    * Get Manual description given by the container.
    * 
    * @return Manual description given by the container.
    */
    @Nullable
    public final BigInteger getCodecIDDescriptionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.CODECIDDESCRIPTION);
    }

   /**
    * Get Manual description given by the container.
    * 
    * @return Manual description given by the container.
    */
    @Nullable
    public final URL getCodecIDDescriptionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.CODECIDDESCRIPTION);
    }


   /**
    * Get bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    * 
    * @return bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    */
    @Nullable
    public final Integer getStatusAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.STATUS);
    }

   /**
    * Get bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    * 
    * @return bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    */
    @Nullable
    public final Long getStatusAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.STATUS);
    }

   /**
    * Get bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    * 
    * @return bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    */
    @Nullable
    public final LocalDateTime getStatusAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.STATUS);
    }

   /**
    * Get bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    * 
    * @return bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    */
    @Nullable
    public final LocalTime getStatusAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.STATUS);
    }

   /**
    * Get bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    * 
    * @return bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    */
    @Nullable
    public final String getStatusAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.STATUS);
    }

   /**
    * Get bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    * 
    * @return bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    */
    @Nullable
    public final Boolean getStatusAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.STATUS);
    }

   /**
    * Get bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    * 
    * @return bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    */
    @Nullable
    public final BigInteger getStatusAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.STATUS);
    }

   /**
    * Get bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    * 
    * @return bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    */
    @Nullable
    public final URL getStatusAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.STATUS);
    }


   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Integer getDurationFirstFrameStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Long getDurationFirstFrameStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalDateTime getDurationFirstFrameStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalTime getDurationFirstFrameStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final String getDurationFirstFrameStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Boolean getDurationFirstFrameStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final BigInteger getDurationFirstFrameStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final URL getDurationFirstFrameStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAMESTRING);
    }


   /**
    * Get Frames per second.
    * 
    * @return Frames per second.
    */
    @Nullable
    public final Integer getFrameRateAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.FRAMERATE);
    }

   /**
    * Get Frames per second.
    * 
    * @return Frames per second.
    */
    @Nullable
    public final Long getFrameRateAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.FRAMERATE);
    }

   /**
    * Get Frames per second.
    * 
    * @return Frames per second.
    */
    @Nullable
    public final LocalDateTime getFrameRateAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.FRAMERATE);
    }

   /**
    * Get Frames per second.
    * 
    * @return Frames per second.
    */
    @Nullable
    public final LocalTime getFrameRateAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.FRAMERATE);
    }

   /**
    * Get Frames per second.
    * 
    * @return Frames per second.
    */
    @Nullable
    public final String getFrameRateAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.FRAMERATE);
    }

   /**
    * Get Frames per second.
    * 
    * @return Frames per second.
    */
    @Nullable
    public final Boolean getFrameRateAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.FRAMERATE);
    }

   /**
    * Get Frames per second.
    * 
    * @return Frames per second.
    */
    @Nullable
    public final BigInteger getFrameRateAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.FRAMERATE);
    }

   /**
    * Get Frames per second.
    * 
    * @return Frames per second.
    */
    @Nullable
    public final URL getFrameRateAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.FRAMERATE);
    }


   /**
    * Get Service kind (full).
    * 
    * @return Service kind (full).
    */
    @Nullable
    public final Integer getServiceKindStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.SERVICEKINDSTRING);
    }

   /**
    * Get Service kind (full).
    * 
    * @return Service kind (full).
    */
    @Nullable
    public final Long getServiceKindStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.SERVICEKINDSTRING);
    }

   /**
    * Get Service kind (full).
    * 
    * @return Service kind (full).
    */
    @Nullable
    public final LocalDateTime getServiceKindStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.SERVICEKINDSTRING);
    }

   /**
    * Get Service kind (full).
    * 
    * @return Service kind (full).
    */
    @Nullable
    public final LocalTime getServiceKindStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.SERVICEKINDSTRING);
    }

   /**
    * Get Service kind (full).
    * 
    * @return Service kind (full).
    */
    @Nullable
    public final String getServiceKindStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.SERVICEKINDSTRING);
    }

   /**
    * Get Service kind (full).
    * 
    * @return Service kind (full).
    */
    @Nullable
    public final Boolean getServiceKindStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.SERVICEKINDSTRING);
    }

   /**
    * Get Service kind (full).
    * 
    * @return Service kind (full).
    */
    @Nullable
    public final BigInteger getServiceKindStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.SERVICEKINDSTRING);
    }

   /**
    * Get Service kind (full).
    * 
    * @return Service kind (full).
    */
    @Nullable
    public final URL getServiceKindStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.SERVICEKINDSTRING);
    }


   /**
    * Get How this stream is muxed in the container.
    * 
    * @return How this stream is muxed in the container.
    */
    @Nullable
    public final Integer getMuxingModeAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.MUXINGMODE);
    }

   /**
    * Get How this stream is muxed in the container.
    * 
    * @return How this stream is muxed in the container.
    */
    @Nullable
    public final Long getMuxingModeAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.MUXINGMODE);
    }

   /**
    * Get How this stream is muxed in the container.
    * 
    * @return How this stream is muxed in the container.
    */
    @Nullable
    public final LocalDateTime getMuxingModeAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.MUXINGMODE);
    }

   /**
    * Get How this stream is muxed in the container.
    * 
    * @return How this stream is muxed in the container.
    */
    @Nullable
    public final LocalTime getMuxingModeAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.MUXINGMODE);
    }

   /**
    * Get How this stream is muxed in the container.
    * 
    * @return How this stream is muxed in the container.
    */
    @Nullable
    public final String getMuxingModeAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.MUXINGMODE);
    }

   /**
    * Get How this stream is muxed in the container.
    * 
    * @return How this stream is muxed in the container.
    */
    @Nullable
    public final Boolean getMuxingModeAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.MUXINGMODE);
    }

   /**
    * Get How this stream is muxed in the container.
    * 
    * @return How this stream is muxed in the container.
    */
    @Nullable
    public final BigInteger getMuxingModeAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.MUXINGMODE);
    }

   /**
    * Get How this stream is muxed in the container.
    * 
    * @return How this stream is muxed in the container.
    */
    @Nullable
    public final URL getMuxingModeAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.MUXINGMODE);
    }


   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final Integer getDelaySettingsAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DELAYSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final Long getDelaySettingsAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DELAYSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final LocalDateTime getDelaySettingsAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DELAYSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final LocalTime getDelaySettingsAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DELAYSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final String getDelaySettingsAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DELAYSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final Boolean getDelaySettingsAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DELAYSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final BigInteger getDelaySettingsAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DELAYSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final URL getDelaySettingsAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DELAYSETTINGS);
    }


   /**
    * Get Source Encoded Streamsize in bytes.
    * 
    * @return Source Encoded Streamsize in bytes.
    */
    @Nullable
    public final Integer getSourceStreamSizeEncodedAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODED);
    }

   /**
    * Get Source Encoded Streamsize in bytes.
    * 
    * @return Source Encoded Streamsize in bytes.
    */
    @Nullable
    public final Long getSourceStreamSizeEncodedAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODED);
    }

   /**
    * Get Source Encoded Streamsize in bytes.
    * 
    * @return Source Encoded Streamsize in bytes.
    */
    @Nullable
    public final LocalDateTime getSourceStreamSizeEncodedAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODED);
    }

   /**
    * Get Source Encoded Streamsize in bytes.
    * 
    * @return Source Encoded Streamsize in bytes.
    */
    @Nullable
    public final LocalTime getSourceStreamSizeEncodedAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODED);
    }

   /**
    * Get Source Encoded Streamsize in bytes.
    * 
    * @return Source Encoded Streamsize in bytes.
    */
    @Nullable
    public final String getSourceStreamSizeEncodedAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODED);
    }

   /**
    * Get Source Encoded Streamsize in bytes.
    * 
    * @return Source Encoded Streamsize in bytes.
    */
    @Nullable
    public final Boolean getSourceStreamSizeEncodedAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODED);
    }

   /**
    * Get Source Encoded Streamsize in bytes.
    * 
    * @return Source Encoded Streamsize in bytes.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeEncodedAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODED);
    }

   /**
    * Get Source Encoded Streamsize in bytes.
    * 
    * @return Source Encoded Streamsize in bytes.
    */
    @Nullable
    public final URL getSourceStreamSizeEncodedAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODED);
    }


   /**
    * Get Bit rate mode (Constant, Variable).
    * 
    * @return Bit rate mode (Constant, Variable).
    */
    @Nullable
    public final Integer getBitRateModeStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.BITRATEMODESTRING);
    }

   /**
    * Get Bit rate mode (Constant, Variable).
    * 
    * @return Bit rate mode (Constant, Variable).
    */
    @Nullable
    public final Long getBitRateModeStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.BITRATEMODESTRING);
    }

   /**
    * Get Bit rate mode (Constant, Variable).
    * 
    * @return Bit rate mode (Constant, Variable).
    */
    @Nullable
    public final LocalDateTime getBitRateModeStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.BITRATEMODESTRING);
    }

   /**
    * Get Bit rate mode (Constant, Variable).
    * 
    * @return Bit rate mode (Constant, Variable).
    */
    @Nullable
    public final LocalTime getBitRateModeStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.BITRATEMODESTRING);
    }

   /**
    * Get Bit rate mode (Constant, Variable).
    * 
    * @return Bit rate mode (Constant, Variable).
    */
    @Nullable
    public final String getBitRateModeStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.BITRATEMODESTRING);
    }

   /**
    * Get Bit rate mode (Constant, Variable).
    * 
    * @return Bit rate mode (Constant, Variable).
    */
    @Nullable
    public final Boolean getBitRateModeStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.BITRATEMODESTRING);
    }

   /**
    * Get Bit rate mode (Constant, Variable).
    * 
    * @return Bit rate mode (Constant, Variable).
    */
    @Nullable
    public final BigInteger getBitRateModeStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.BITRATEMODESTRING);
    }

   /**
    * Get Bit rate mode (Constant, Variable).
    * 
    * @return Bit rate mode (Constant, Variable).
    */
    @Nullable
    public final URL getBitRateModeStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.BITRATEMODESTRING);
    }


   /**
    * Get Minimum Frames per second (with measurement).
    * 
    * @return Minimum Frames per second (with measurement).
    */
    @Nullable
    public final Integer getFrameRateMinimumStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMINIMUMSTRING);
    }

   /**
    * Get Minimum Frames per second (with measurement).
    * 
    * @return Minimum Frames per second (with measurement).
    */
    @Nullable
    public final Long getFrameRateMinimumStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMINIMUMSTRING);
    }

   /**
    * Get Minimum Frames per second (with measurement).
    * 
    * @return Minimum Frames per second (with measurement).
    */
    @Nullable
    public final LocalDateTime getFrameRateMinimumStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMINIMUMSTRING);
    }

   /**
    * Get Minimum Frames per second (with measurement).
    * 
    * @return Minimum Frames per second (with measurement).
    */
    @Nullable
    public final LocalTime getFrameRateMinimumStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMINIMUMSTRING);
    }

   /**
    * Get Minimum Frames per second (with measurement).
    * 
    * @return Minimum Frames per second (with measurement).
    */
    @Nullable
    public final String getFrameRateMinimumStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMINIMUMSTRING);
    }

   /**
    * Get Minimum Frames per second (with measurement).
    * 
    * @return Minimum Frames per second (with measurement).
    */
    @Nullable
    public final Boolean getFrameRateMinimumStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMINIMUMSTRING);
    }

   /**
    * Get Minimum Frames per second (with measurement).
    * 
    * @return Minimum Frames per second (with measurement).
    */
    @Nullable
    public final BigInteger getFrameRateMinimumStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMINIMUMSTRING);
    }

   /**
    * Get Minimum Frames per second (with measurement).
    * 
    * @return Minimum Frames per second (with measurement).
    */
    @Nullable
    public final URL getFrameRateMinimumStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMINIMUMSTRING);
    }


   /**
    * Get Version of encoding-software.
    * 
    * @return Version of encoding-software.
    */
    @Nullable
    public final Integer getEncodedLibraryVersionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYVERSION);
    }

   /**
    * Get Version of encoding-software.
    * 
    * @return Version of encoding-software.
    */
    @Nullable
    public final Long getEncodedLibraryVersionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYVERSION);
    }

   /**
    * Get Version of encoding-software.
    * 
    * @return Version of encoding-software.
    */
    @Nullable
    public final LocalDateTime getEncodedLibraryVersionAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYVERSION);
    }

   /**
    * Get Version of encoding-software.
    * 
    * @return Version of encoding-software.
    */
    @Nullable
    public final LocalTime getEncodedLibraryVersionAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYVERSION);
    }

   /**
    * Get Version of encoding-software.
    * 
    * @return Version of encoding-software.
    */
    @Nullable
    public final String getEncodedLibraryVersionAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYVERSION);
    }

   /**
    * Get Version of encoding-software.
    * 
    * @return Version of encoding-software.
    */
    @Nullable
    public final Boolean getEncodedLibraryVersionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYVERSION);
    }

   /**
    * Get Version of encoding-software.
    * 
    * @return Version of encoding-software.
    */
    @Nullable
    public final BigInteger getEncodedLibraryVersionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYVERSION);
    }

   /**
    * Get Version of encoding-software.
    * 
    * @return Version of encoding-software.
    */
    @Nullable
    public final URL getEncodedLibraryVersionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYVERSION);
    }


   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Integer getSourceDurationLastFrameStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Long getSourceDurationLastFrameStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalDateTime getSourceDurationLastFrameStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalTime getSourceDurationLastFrameStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final String getSourceDurationLastFrameStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Boolean getSourceDurationLastFrameStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final BigInteger getSourceDurationLastFrameStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final URL getSourceDurationLastFrameStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING);
    }


   /**
    * Get Info about codec ID.
    * 
    * @return Info about codec ID.
    */
    @Nullable
    public final Integer getCodecIDInfoAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.CODECIDINFO);
    }

   /**
    * Get Info about codec ID.
    * 
    * @return Info about codec ID.
    */
    @Nullable
    public final Long getCodecIDInfoAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.CODECIDINFO);
    }

   /**
    * Get Info about codec ID.
    * 
    * @return Info about codec ID.
    */
    @Nullable
    public final LocalDateTime getCodecIDInfoAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.CODECIDINFO);
    }

   /**
    * Get Info about codec ID.
    * 
    * @return Info about codec ID.
    */
    @Nullable
    public final LocalTime getCodecIDInfoAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.CODECIDINFO);
    }

   /**
    * Get Info about codec ID.
    * 
    * @return Info about codec ID.
    */
    @Nullable
    public final String getCodecIDInfoAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.CODECIDINFO);
    }

   /**
    * Get Info about codec ID.
    * 
    * @return Info about codec ID.
    */
    @Nullable
    public final Boolean getCodecIDInfoAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.CODECIDINFO);
    }

   /**
    * Get Info about codec ID.
    * 
    * @return Info about codec ID.
    */
    @Nullable
    public final BigInteger getCodecIDInfoAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.CODECIDINFO);
    }

   /**
    * Get Info about codec ID.
    * 
    * @return Info about codec ID.
    */
    @Nullable
    public final URL getCodecIDInfoAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.CODECIDINFO);
    }


   /**
    * Get Streamsize in bytes.
    * 
    * @return Streamsize in bytes.
    */
    @Nullable
    public final Integer getStreamSizeAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZE);
    }

   /**
    * Get Streamsize in bytes.
    * 
    * @return Streamsize in bytes.
    */
    @Nullable
    public final Long getStreamSizeAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.STREAMSIZE);
    }

   /**
    * Get Streamsize in bytes.
    * 
    * @return Streamsize in bytes.
    */
    @Nullable
    public final LocalDateTime getStreamSizeAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZE);
    }

   /**
    * Get Streamsize in bytes.
    * 
    * @return Streamsize in bytes.
    */
    @Nullable
    public final LocalTime getStreamSizeAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZE);
    }

   /**
    * Get Streamsize in bytes.
    * 
    * @return Streamsize in bytes.
    */
    @Nullable
    public final String getStreamSizeAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.STREAMSIZE);
    }

   /**
    * Get Streamsize in bytes.
    * 
    * @return Streamsize in bytes.
    */
    @Nullable
    public final Boolean getStreamSizeAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.STREAMSIZE);
    }

   /**
    * Get Streamsize in bytes.
    * 
    * @return Streamsize in bytes.
    */
    @Nullable
    public final BigInteger getStreamSizeAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZE);
    }

   /**
    * Get Streamsize in bytes.
    * 
    * @return Streamsize in bytes.
    */
    @Nullable
    public final URL getStreamSizeAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.STREAMSIZE);
    }


   /**
    * Get Width/String.
    * 
    * @return Width/String.
    */
    @Nullable
    public final Integer getWidthStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.WIDTHSTRING);
    }

   /**
    * Get Width/String.
    * 
    * @return Width/String.
    */
    @Nullable
    public final Long getWidthStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.WIDTHSTRING);
    }

   /**
    * Get Width/String.
    * 
    * @return Width/String.
    */
    @Nullable
    public final LocalDateTime getWidthStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.WIDTHSTRING);
    }

   /**
    * Get Width/String.
    * 
    * @return Width/String.
    */
    @Nullable
    public final LocalTime getWidthStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.WIDTHSTRING);
    }

   /**
    * Get Width/String.
    * 
    * @return Width/String.
    */
    @Nullable
    public final String getWidthStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.WIDTHSTRING);
    }

   /**
    * Get Width/String.
    * 
    * @return Width/String.
    */
    @Nullable
    public final Boolean getWidthStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.WIDTHSTRING);
    }

   /**
    * Get Width/String.
    * 
    * @return Width/String.
    */
    @Nullable
    public final BigInteger getWidthStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.WIDTHSTRING);
    }

   /**
    * Get Width/String.
    * 
    * @return Width/String.
    */
    @Nullable
    public final URL getWidthStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.WIDTHSTRING);
    }


   /**
    * Get Info about Format.
    * 
    * @return Info about Format.
    */
    @Nullable
    public final Integer getFormatInfoAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.FORMATINFO);
    }

   /**
    * Get Info about Format.
    * 
    * @return Info about Format.
    */
    @Nullable
    public final Long getFormatInfoAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.FORMATINFO);
    }

   /**
    * Get Info about Format.
    * 
    * @return Info about Format.
    */
    @Nullable
    public final LocalDateTime getFormatInfoAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.FORMATINFO);
    }

   /**
    * Get Info about Format.
    * 
    * @return Info about Format.
    */
    @Nullable
    public final LocalTime getFormatInfoAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.FORMATINFO);
    }

   /**
    * Get Info about Format.
    * 
    * @return Info about Format.
    */
    @Nullable
    public final String getFormatInfoAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.FORMATINFO);
    }

   /**
    * Get Info about Format.
    * 
    * @return Info about Format.
    */
    @Nullable
    public final Boolean getFormatInfoAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.FORMATINFO);
    }

   /**
    * Get Info about Format.
    * 
    * @return Info about Format.
    */
    @Nullable
    public final BigInteger getFormatInfoAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.FORMATINFO);
    }

   /**
    * Get Info about Format.
    * 
    * @return Info about Format.
    */
    @Nullable
    public final URL getFormatInfoAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.FORMATINFO);
    }


   /**
    * Get Source_StreamSize/String1.
    * 
    * @return Source_StreamSize/String1.
    */
    @Nullable
    public final Integer getSourceStreamSizeString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING1);
    }

   /**
    * Get Source_StreamSize/String1.
    * 
    * @return Source_StreamSize/String1.
    */
    @Nullable
    public final Long getSourceStreamSizeString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING1);
    }

   /**
    * Get Source_StreamSize/String1.
    * 
    * @return Source_StreamSize/String1.
    */
    @Nullable
    public final LocalDateTime getSourceStreamSizeString1AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING1);
    }

   /**
    * Get Source_StreamSize/String1.
    * 
    * @return Source_StreamSize/String1.
    */
    @Nullable
    public final LocalTime getSourceStreamSizeString1AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING1);
    }

   /**
    * Get Source_StreamSize/String1.
    * 
    * @return Source_StreamSize/String1.
    */
    @Nullable
    public final String getSourceStreamSizeString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING1);
    }

   /**
    * Get Source_StreamSize/String1.
    * 
    * @return Source_StreamSize/String1.
    */
    @Nullable
    public final Boolean getSourceStreamSizeString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING1);
    }

   /**
    * Get Source_StreamSize/String1.
    * 
    * @return Source_StreamSize/String1.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING1);
    }

   /**
    * Get Source_StreamSize/String1.
    * 
    * @return Source_StreamSize/String1.
    */
    @Nullable
    public final URL getSourceStreamSizeString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING1);
    }


   /**
    * Get Source Stream size divided by file size.
    * 
    * @return Source Stream size divided by file size.
    */
    @Nullable
    public final Integer getSourceStreamSizeProportionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEPROPORTION);
    }

   /**
    * Get Source Stream size divided by file size.
    * 
    * @return Source Stream size divided by file size.
    */
    @Nullable
    public final Long getSourceStreamSizeProportionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEPROPORTION);
    }

   /**
    * Get Source Stream size divided by file size.
    * 
    * @return Source Stream size divided by file size.
    */
    @Nullable
    public final LocalDateTime getSourceStreamSizeProportionAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEPROPORTION);
    }

   /**
    * Get Source Stream size divided by file size.
    * 
    * @return Source Stream size divided by file size.
    */
    @Nullable
    public final LocalTime getSourceStreamSizeProportionAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEPROPORTION);
    }

   /**
    * Get Source Stream size divided by file size.
    * 
    * @return Source Stream size divided by file size.
    */
    @Nullable
    public final String getSourceStreamSizeProportionAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEPROPORTION);
    }

   /**
    * Get Source Stream size divided by file size.
    * 
    * @return Source Stream size divided by file size.
    */
    @Nullable
    public final Boolean getSourceStreamSizeProportionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEPROPORTION);
    }

   /**
    * Get Source Stream size divided by file size.
    * 
    * @return Source Stream size divided by file size.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeProportionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEPROPORTION);
    }

   /**
    * Get Source Stream size divided by file size.
    * 
    * @return Source Stream size divided by file size.
    */
    @Nullable
    public final URL getSourceStreamSizeProportionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEPROPORTION);
    }


   /**
    * Get A link for more details about this codec ID.
    * 
    * @return A link for more details about this codec ID.
    */
    @Nullable
    public final Integer getCodecIDUrlAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.CODECIDURL);
    }

   /**
    * Get A link for more details about this codec ID.
    * 
    * @return A link for more details about this codec ID.
    */
    @Nullable
    public final Long getCodecIDUrlAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.CODECIDURL);
    }

   /**
    * Get A link for more details about this codec ID.
    * 
    * @return A link for more details about this codec ID.
    */
    @Nullable
    public final LocalDateTime getCodecIDUrlAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.CODECIDURL);
    }

   /**
    * Get A link for more details about this codec ID.
    * 
    * @return A link for more details about this codec ID.
    */
    @Nullable
    public final LocalTime getCodecIDUrlAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.CODECIDURL);
    }

   /**
    * Get A link for more details about this codec ID.
    * 
    * @return A link for more details about this codec ID.
    */
    @Nullable
    public final String getCodecIDUrlAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.CODECIDURL);
    }

   /**
    * Get A link for more details about this codec ID.
    * 
    * @return A link for more details about this codec ID.
    */
    @Nullable
    public final Boolean getCodecIDUrlAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.CODECIDURL);
    }

   /**
    * Get A link for more details about this codec ID.
    * 
    * @return A link for more details about this codec ID.
    */
    @Nullable
    public final BigInteger getCodecIDUrlAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.CODECIDURL);
    }

   /**
    * Get A link for more details about this codec ID.
    * 
    * @return A link for more details about this codec ID.
    */
    @Nullable
    public final URL getCodecIDUrlAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.CODECIDURL);
    }


   /**
    * Get Source_StreamSize/String2.
    * 
    * @return Source_StreamSize/String2.
    */
    @Nullable
    public final Integer getSourceStreamSizeString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING2);
    }

   /**
    * Get Source_StreamSize/String2.
    * 
    * @return Source_StreamSize/String2.
    */
    @Nullable
    public final Long getSourceStreamSizeString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING2);
    }

   /**
    * Get Source_StreamSize/String2.
    * 
    * @return Source_StreamSize/String2.
    */
    @Nullable
    public final LocalDateTime getSourceStreamSizeString2AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING2);
    }

   /**
    * Get Source_StreamSize/String2.
    * 
    * @return Source_StreamSize/String2.
    */
    @Nullable
    public final LocalTime getSourceStreamSizeString2AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING2);
    }

   /**
    * Get Source_StreamSize/String2.
    * 
    * @return Source_StreamSize/String2.
    */
    @Nullable
    public final String getSourceStreamSizeString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING2);
    }

   /**
    * Get Source_StreamSize/String2.
    * 
    * @return Source_StreamSize/String2.
    */
    @Nullable
    public final Boolean getSourceStreamSizeString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING2);
    }

   /**
    * Get Source_StreamSize/String2.
    * 
    * @return Source_StreamSize/String2.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING2);
    }

   /**
    * Get Source_StreamSize/String2.
    * 
    * @return Source_StreamSize/String2.
    */
    @Nullable
    public final URL getSourceStreamSizeString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING2);
    }


   /**
    * Get Height/String.
    * 
    * @return Height/String.
    */
    @Nullable
    public final Integer getHeightStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.HEIGHTSTRING);
    }

   /**
    * Get Height/String.
    * 
    * @return Height/String.
    */
    @Nullable
    public final Long getHeightStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.HEIGHTSTRING);
    }

   /**
    * Get Height/String.
    * 
    * @return Height/String.
    */
    @Nullable
    public final LocalDateTime getHeightStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.HEIGHTSTRING);
    }

   /**
    * Get Height/String.
    * 
    * @return Height/String.
    */
    @Nullable
    public final LocalTime getHeightStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.HEIGHTSTRING);
    }

   /**
    * Get Height/String.
    * 
    * @return Height/String.
    */
    @Nullable
    public final String getHeightStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.HEIGHTSTRING);
    }

   /**
    * Get Height/String.
    * 
    * @return Height/String.
    */
    @Nullable
    public final Boolean getHeightStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.HEIGHTSTRING);
    }

   /**
    * Get Height/String.
    * 
    * @return Height/String.
    */
    @Nullable
    public final BigInteger getHeightStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.HEIGHTSTRING);
    }

   /**
    * Get Height/String.
    * 
    * @return Height/String.
    */
    @Nullable
    public final URL getHeightStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.HEIGHTSTRING);
    }


   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final Integer getSourceStreamSizeString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING5);
    }

   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final Long getSourceStreamSizeString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING5);
    }

   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final LocalDateTime getSourceStreamSizeString5AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING5);
    }

   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final LocalTime getSourceStreamSizeString5AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING5);
    }

   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final String getSourceStreamSizeString5AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING5);
    }

   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final Boolean getSourceStreamSizeString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING5);
    }

   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING5);
    }

   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final URL getSourceStreamSizeString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING5);
    }


   /**
    * Get Source_StreamSize/String3.
    * 
    * @return Source_StreamSize/String3.
    */
    @Nullable
    public final Integer getSourceStreamSizeString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING3);
    }

   /**
    * Get Source_StreamSize/String3.
    * 
    * @return Source_StreamSize/String3.
    */
    @Nullable
    public final Long getSourceStreamSizeString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING3);
    }

   /**
    * Get Source_StreamSize/String3.
    * 
    * @return Source_StreamSize/String3.
    */
    @Nullable
    public final LocalDateTime getSourceStreamSizeString3AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING3);
    }

   /**
    * Get Source_StreamSize/String3.
    * 
    * @return Source_StreamSize/String3.
    */
    @Nullable
    public final LocalTime getSourceStreamSizeString3AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING3);
    }

   /**
    * Get Source_StreamSize/String3.
    * 
    * @return Source_StreamSize/String3.
    */
    @Nullable
    public final String getSourceStreamSizeString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING3);
    }

   /**
    * Get Source_StreamSize/String3.
    * 
    * @return Source_StreamSize/String3.
    */
    @Nullable
    public final Boolean getSourceStreamSizeString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING3);
    }

   /**
    * Get Source_StreamSize/String3.
    * 
    * @return Source_StreamSize/String3.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING3);
    }

   /**
    * Get Source_StreamSize/String3.
    * 
    * @return Source_StreamSize/String3.
    */
    @Nullable
    public final URL getSourceStreamSizeString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING3);
    }


   /**
    * Get Source_StreamSize/String4.
    * 
    * @return Source_StreamSize/String4.
    */
    @Nullable
    public final Integer getSourceStreamSizeString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING4);
    }

   /**
    * Get Source_StreamSize/String4.
    * 
    * @return Source_StreamSize/String4.
    */
    @Nullable
    public final Long getSourceStreamSizeString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING4);
    }

   /**
    * Get Source_StreamSize/String4.
    * 
    * @return Source_StreamSize/String4.
    */
    @Nullable
    public final LocalDateTime getSourceStreamSizeString4AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING4);
    }

   /**
    * Get Source_StreamSize/String4.
    * 
    * @return Source_StreamSize/String4.
    */
    @Nullable
    public final LocalTime getSourceStreamSizeString4AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING4);
    }

   /**
    * Get Source_StreamSize/String4.
    * 
    * @return Source_StreamSize/String4.
    */
    @Nullable
    public final String getSourceStreamSizeString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING4);
    }

   /**
    * Get Source_StreamSize/String4.
    * 
    * @return Source_StreamSize/String4.
    */
    @Nullable
    public final Boolean getSourceStreamSizeString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING4);
    }

   /**
    * Get Source_StreamSize/String4.
    * 
    * @return Source_StreamSize/String4.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING4);
    }

   /**
    * Get Source_StreamSize/String4.
    * 
    * @return Source_StreamSize/String4.
    */
    @Nullable
    public final URL getSourceStreamSizeString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING4);
    }


   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final Integer getDisabledStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DISABLEDSTRING);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final Long getDisabledStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DISABLEDSTRING);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final LocalDateTime getDisabledStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DISABLEDSTRING);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final LocalTime getDisabledStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DISABLEDSTRING);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final String getDisabledStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DISABLEDSTRING);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final Boolean getDisabledStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DISABLEDSTRING);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final BigInteger getDisabledStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DISABLEDSTRING);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final URL getDisabledStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DISABLEDSTRING);
    }


   /**
    * Get Operating System of encoding-software.
    * 
    * @return Operating System of encoding-software.
    */
    @Nullable
    public final Integer getEncodedOperatingSystemAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.ENCODEDOPERATINGSYSTEM);
    }

   /**
    * Get Operating System of encoding-software.
    * 
    * @return Operating System of encoding-software.
    */
    @Nullable
    public final Long getEncodedOperatingSystemAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.ENCODEDOPERATINGSYSTEM);
    }

   /**
    * Get Operating System of encoding-software.
    * 
    * @return Operating System of encoding-software.
    */
    @Nullable
    public final LocalDateTime getEncodedOperatingSystemAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.ENCODEDOPERATINGSYSTEM);
    }

   /**
    * Get Operating System of encoding-software.
    * 
    * @return Operating System of encoding-software.
    */
    @Nullable
    public final LocalTime getEncodedOperatingSystemAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.ENCODEDOPERATINGSYSTEM);
    }

   /**
    * Get Operating System of encoding-software.
    * 
    * @return Operating System of encoding-software.
    */
    @Nullable
    public final String getEncodedOperatingSystemAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.ENCODEDOPERATINGSYSTEM);
    }

   /**
    * Get Operating System of encoding-software.
    * 
    * @return Operating System of encoding-software.
    */
    @Nullable
    public final Boolean getEncodedOperatingSystemAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.ENCODEDOPERATINGSYSTEM);
    }

   /**
    * Get Operating System of encoding-software.
    * 
    * @return Operating System of encoding-software.
    */
    @Nullable
    public final BigInteger getEncodedOperatingSystemAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.ENCODEDOPERATINGSYSTEM);
    }

   /**
    * Get Operating System of encoding-software.
    * 
    * @return Operating System of encoding-software.
    */
    @Nullable
    public final URL getEncodedOperatingSystemAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.ENCODEDOPERATINGSYSTEM);
    }


   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final Integer getEncodedApplicationCompanyNameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATIONCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final Long getEncodedApplicationCompanyNameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATIONCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final LocalDateTime getEncodedApplicationCompanyNameAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATIONCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final LocalTime getEncodedApplicationCompanyNameAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATIONCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final String getEncodedApplicationCompanyNameAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATIONCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final Boolean getEncodedApplicationCompanyNameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATIONCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final BigInteger getEncodedApplicationCompanyNameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATIONCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final URL getEncodedApplicationCompanyNameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATIONCOMPANYNAME);
    }


   /**
    * Get Current stream size divided by uncompressed stream size.
    * 
    * @return Current stream size divided by uncompressed stream size.
    */
    @Nullable
    public final Integer getCompressionRatioAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.COMPRESSIONRATIO);
    }

   /**
    * Get Current stream size divided by uncompressed stream size.
    * 
    * @return Current stream size divided by uncompressed stream size.
    */
    @Nullable
    public final Long getCompressionRatioAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.COMPRESSIONRATIO);
    }

   /**
    * Get Current stream size divided by uncompressed stream size.
    * 
    * @return Current stream size divided by uncompressed stream size.
    */
    @Nullable
    public final LocalDateTime getCompressionRatioAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.COMPRESSIONRATIO);
    }

   /**
    * Get Current stream size divided by uncompressed stream size.
    * 
    * @return Current stream size divided by uncompressed stream size.
    */
    @Nullable
    public final LocalTime getCompressionRatioAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.COMPRESSIONRATIO);
    }

   /**
    * Get Current stream size divided by uncompressed stream size.
    * 
    * @return Current stream size divided by uncompressed stream size.
    */
    @Nullable
    public final String getCompressionRatioAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.COMPRESSIONRATIO);
    }

   /**
    * Get Current stream size divided by uncompressed stream size.
    * 
    * @return Current stream size divided by uncompressed stream size.
    */
    @Nullable
    public final Boolean getCompressionRatioAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.COMPRESSIONRATIO);
    }

   /**
    * Get Current stream size divided by uncompressed stream size.
    * 
    * @return Current stream size divided by uncompressed stream size.
    */
    @Nullable
    public final BigInteger getCompressionRatioAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.COMPRESSIONRATIO);
    }

   /**
    * Get Current stream size divided by uncompressed stream size.
    * 
    * @return Current stream size divided by uncompressed stream size.
    */
    @Nullable
    public final URL getCompressionRatioAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.COMPRESSIONRATIO);
    }


   /**
    * Get Commercial name used by vendor for theses setings if there is one.
    * 
    * @return Commercial name used by vendor for theses setings if there is one.
    */
    @Nullable
    public final Integer getFormatCommercialIfAnyAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.FORMATCOMMERCIALIFANY);
    }

   /**
    * Get Commercial name used by vendor for theses setings if there is one.
    * 
    * @return Commercial name used by vendor for theses setings if there is one.
    */
    @Nullable
    public final Long getFormatCommercialIfAnyAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.FORMATCOMMERCIALIFANY);
    }

   /**
    * Get Commercial name used by vendor for theses setings if there is one.
    * 
    * @return Commercial name used by vendor for theses setings if there is one.
    */
    @Nullable
    public final LocalDateTime getFormatCommercialIfAnyAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.FORMATCOMMERCIALIFANY);
    }

   /**
    * Get Commercial name used by vendor for theses setings if there is one.
    * 
    * @return Commercial name used by vendor for theses setings if there is one.
    */
    @Nullable
    public final LocalTime getFormatCommercialIfAnyAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.FORMATCOMMERCIALIFANY);
    }

   /**
    * Get Commercial name used by vendor for theses setings if there is one.
    * 
    * @return Commercial name used by vendor for theses setings if there is one.
    */
    @Nullable
    public final String getFormatCommercialIfAnyAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.FORMATCOMMERCIALIFANY);
    }

   /**
    * Get Commercial name used by vendor for theses setings if there is one.
    * 
    * @return Commercial name used by vendor for theses setings if there is one.
    */
    @Nullable
    public final Boolean getFormatCommercialIfAnyAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.FORMATCOMMERCIALIFANY);
    }

   /**
    * Get Commercial name used by vendor for theses setings if there is one.
    * 
    * @return Commercial name used by vendor for theses setings if there is one.
    */
    @Nullable
    public final BigInteger getFormatCommercialIfAnyAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.FORMATCOMMERCIALIFANY);
    }

   /**
    * Get Commercial name used by vendor for theses setings if there is one.
    * 
    * @return Commercial name used by vendor for theses setings if there is one.
    */
    @Nullable
    public final URL getFormatCommercialIfAnyAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.FORMATCOMMERCIALIFANY);
    }


   /**
    * Get The time that the tags were done for this item..
    * 
    * @return The time that the tags were done for this item..
    */
    @Nullable
    public final Integer getTaggedDateAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.TAGGEDDATE);
    }

   /**
    * Get The time that the tags were done for this item..
    * 
    * @return The time that the tags were done for this item..
    */
    @Nullable
    public final Long getTaggedDateAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.TAGGEDDATE);
    }

   /**
    * Get The time that the tags were done for this item..
    * 
    * @return The time that the tags were done for this item..
    */
    @Nullable
    public final LocalDateTime getTaggedDateAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.TAGGEDDATE);
    }

   /**
    * Get The time that the tags were done for this item..
    * 
    * @return The time that the tags were done for this item..
    */
    @Nullable
    public final LocalTime getTaggedDateAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.TAGGEDDATE);
    }

   /**
    * Get The time that the tags were done for this item..
    * 
    * @return The time that the tags were done for this item..
    */
    @Nullable
    public final String getTaggedDateAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.TAGGEDDATE);
    }

   /**
    * Get The time that the tags were done for this item..
    * 
    * @return The time that the tags were done for this item..
    */
    @Nullable
    public final Boolean getTaggedDateAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.TAGGEDDATE);
    }

   /**
    * Get The time that the tags were done for this item..
    * 
    * @return The time that the tags were done for this item..
    */
    @Nullable
    public final BigInteger getTaggedDateAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.TAGGEDDATE);
    }

   /**
    * Get The time that the tags were done for this item..
    * 
    * @return The time that the tags were done for this item..
    */
    @Nullable
    public final URL getTaggedDateAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.TAGGEDDATE);
    }


   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final Integer getIDStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.IDSTRING);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final Long getIDStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.IDSTRING);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final LocalDateTime getIDStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.IDSTRING);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final LocalTime getIDStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.IDSTRING);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final String getIDStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.IDSTRING);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final Boolean getIDStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.IDSTRING);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final BigInteger getIDStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.IDSTRING);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final URL getIDStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.IDSTRING);
    }


   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final Integer getCompressionModeAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.COMPRESSIONMODE);
    }

   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final Long getCompressionModeAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.COMPRESSIONMODE);
    }

   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final LocalDateTime getCompressionModeAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.COMPRESSIONMODE);
    }

   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final LocalTime getCompressionModeAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.COMPRESSIONMODE);
    }

   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final String getCompressionModeAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.COMPRESSIONMODE);
    }

   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final Boolean getCompressionModeAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.COMPRESSIONMODE);
    }

   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final BigInteger getCompressionModeAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.COMPRESSIONMODE);
    }

   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final URL getCompressionModeAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.COMPRESSIONMODE);
    }


   /**
    * Get Bit rate in bps.
    * 
    * @return Bit rate in bps.
    */
    @Nullable
    public final Integer getBitRateAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.BITRATE);
    }

   /**
    * Get Bit rate in bps.
    * 
    * @return Bit rate in bps.
    */
    @Nullable
    public final Long getBitRateAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.BITRATE);
    }

   /**
    * Get Bit rate in bps.
    * 
    * @return Bit rate in bps.
    */
    @Nullable
    public final LocalDateTime getBitRateAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.BITRATE);
    }

   /**
    * Get Bit rate in bps.
    * 
    * @return Bit rate in bps.
    */
    @Nullable
    public final LocalTime getBitRateAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.BITRATE);
    }

   /**
    * Get Bit rate in bps.
    * 
    * @return Bit rate in bps.
    */
    @Nullable
    public final String getBitRateAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.BITRATE);
    }

   /**
    * Get Bit rate in bps.
    * 
    * @return Bit rate in bps.
    */
    @Nullable
    public final Boolean getBitRateAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.BITRATE);
    }

   /**
    * Get Bit rate in bps.
    * 
    * @return Bit rate in bps.
    */
    @Nullable
    public final BigInteger getBitRateAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.BITRATE);
    }

   /**
    * Get Bit rate in bps.
    * 
    * @return Bit rate in bps.
    */
    @Nullable
    public final URL getBitRateAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.BITRATE);
    }


   /**
    * Get The time that the encoding of this item was completed began..
    * 
    * @return The time that the encoding of this item was completed began..
    */
    @Nullable
    public final Integer getEncodedDateAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.ENCODEDDATE);
    }

   /**
    * Get The time that the encoding of this item was completed began..
    * 
    * @return The time that the encoding of this item was completed began..
    */
    @Nullable
    public final Long getEncodedDateAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.ENCODEDDATE);
    }

   /**
    * Get The time that the encoding of this item was completed began..
    * 
    * @return The time that the encoding of this item was completed began..
    */
    @Nullable
    public final LocalDateTime getEncodedDateAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.ENCODEDDATE);
    }

   /**
    * Get The time that the encoding of this item was completed began..
    * 
    * @return The time that the encoding of this item was completed began..
    */
    @Nullable
    public final LocalTime getEncodedDateAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.ENCODEDDATE);
    }

   /**
    * Get The time that the encoding of this item was completed began..
    * 
    * @return The time that the encoding of this item was completed began..
    */
    @Nullable
    public final String getEncodedDateAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.ENCODEDDATE);
    }

   /**
    * Get The time that the encoding of this item was completed began..
    * 
    * @return The time that the encoding of this item was completed began..
    */
    @Nullable
    public final Boolean getEncodedDateAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.ENCODEDDATE);
    }

   /**
    * Get The time that the encoding of this item was completed began..
    * 
    * @return The time that the encoding of this item was completed began..
    */
    @Nullable
    public final BigInteger getEncodedDateAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.ENCODEDDATE);
    }

   /**
    * Get The time that the encoding of this item was completed began..
    * 
    * @return The time that the encoding of this item was completed began..
    */
    @Nullable
    public final URL getEncodedDateAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.ENCODEDDATE);
    }


   /**
    * Get Bit rate mode (VBR, CBR).
    * 
    * @return Bit rate mode (VBR, CBR).
    */
    @Nullable
    public final Integer getBitRateModeAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.BITRATEMODE);
    }

   /**
    * Get Bit rate mode (VBR, CBR).
    * 
    * @return Bit rate mode (VBR, CBR).
    */
    @Nullable
    public final Long getBitRateModeAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.BITRATEMODE);
    }

   /**
    * Get Bit rate mode (VBR, CBR).
    * 
    * @return Bit rate mode (VBR, CBR).
    */
    @Nullable
    public final LocalDateTime getBitRateModeAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.BITRATEMODE);
    }

   /**
    * Get Bit rate mode (VBR, CBR).
    * 
    * @return Bit rate mode (VBR, CBR).
    */
    @Nullable
    public final LocalTime getBitRateModeAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.BITRATEMODE);
    }

   /**
    * Get Bit rate mode (VBR, CBR).
    * 
    * @return Bit rate mode (VBR, CBR).
    */
    @Nullable
    public final String getBitRateModeAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.BITRATEMODE);
    }

   /**
    * Get Bit rate mode (VBR, CBR).
    * 
    * @return Bit rate mode (VBR, CBR).
    */
    @Nullable
    public final Boolean getBitRateModeAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.BITRATEMODE);
    }

   /**
    * Get Bit rate mode (VBR, CBR).
    * 
    * @return Bit rate mode (VBR, CBR).
    */
    @Nullable
    public final BigInteger getBitRateModeAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.BITRATEMODE);
    }

   /**
    * Get Bit rate mode (VBR, CBR).
    * 
    * @return Bit rate mode (VBR, CBR).
    */
    @Nullable
    public final URL getBitRateModeAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.BITRATEMODE);
    }


   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final Integer getUniqueIDAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.UNIQUEID);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final Long getUniqueIDAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.UNIQUEID);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final LocalDateTime getUniqueIDAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.UNIQUEID);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final LocalTime getUniqueIDAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.UNIQUEID);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final String getUniqueIDAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.UNIQUEID);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final Boolean getUniqueIDAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.UNIQUEID);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final BigInteger getUniqueIDAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.UNIQUEID);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final URL getUniqueIDAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.UNIQUEID);
    }


   /**
    * Get Maximum Bit rate (with measurement).
    * 
    * @return Maximum Bit rate (with measurement).
    */
    @Nullable
    public final Integer getBitRateMaximumStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.BITRATEMAXIMUMSTRING);
    }

   /**
    * Get Maximum Bit rate (with measurement).
    * 
    * @return Maximum Bit rate (with measurement).
    */
    @Nullable
    public final Long getBitRateMaximumStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.BITRATEMAXIMUMSTRING);
    }

   /**
    * Get Maximum Bit rate (with measurement).
    * 
    * @return Maximum Bit rate (with measurement).
    */
    @Nullable
    public final LocalDateTime getBitRateMaximumStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.BITRATEMAXIMUMSTRING);
    }

   /**
    * Get Maximum Bit rate (with measurement).
    * 
    * @return Maximum Bit rate (with measurement).
    */
    @Nullable
    public final LocalTime getBitRateMaximumStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.BITRATEMAXIMUMSTRING);
    }

   /**
    * Get Maximum Bit rate (with measurement).
    * 
    * @return Maximum Bit rate (with measurement).
    */
    @Nullable
    public final String getBitRateMaximumStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.BITRATEMAXIMUMSTRING);
    }

   /**
    * Get Maximum Bit rate (with measurement).
    * 
    * @return Maximum Bit rate (with measurement).
    */
    @Nullable
    public final Boolean getBitRateMaximumStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.BITRATEMAXIMUMSTRING);
    }

   /**
    * Get Maximum Bit rate (with measurement).
    * 
    * @return Maximum Bit rate (with measurement).
    */
    @Nullable
    public final BigInteger getBitRateMaximumStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.BITRATEMAXIMUMSTRING);
    }

   /**
    * Get Maximum Bit rate (with measurement).
    * 
    * @return Maximum Bit rate (with measurement).
    */
    @Nullable
    public final URL getBitRateMaximumStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.BITRATEMAXIMUMSTRING);
    }


   /**
    * Get Delay in format : HH:MM:SS.MMM.
    * 
    * @return Delay in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Integer getDelayString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING3);
    }

   /**
    * Get Delay in format : HH:MM:SS.MMM.
    * 
    * @return Delay in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Long getDelayString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING3);
    }

   /**
    * Get Delay in format : HH:MM:SS.MMM.
    * 
    * @return Delay in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalDateTime getDelayString3AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING3);
    }

   /**
    * Get Delay in format : HH:MM:SS.MMM.
    * 
    * @return Delay in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalTime getDelayString3AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING3);
    }

   /**
    * Get Delay in format : HH:MM:SS.MMM.
    * 
    * @return Delay in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final String getDelayString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING3);
    }

   /**
    * Get Delay in format : HH:MM:SS.MMM.
    * 
    * @return Delay in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Boolean getDelayString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING3);
    }

   /**
    * Get Delay in format : HH:MM:SS.MMM.
    * 
    * @return Delay in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final BigInteger getDelayString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING3);
    }

   /**
    * Get Delay in format : HH:MM:SS.MMM.
    * 
    * @return Delay in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final URL getDelayString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING3);
    }


   /**
    * Get Video_Delay/String.
    * 
    * @return Video_Delay/String.
    */
    @Nullable
    public final Integer getVideoDelayStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING);
    }

   /**
    * Get Video_Delay/String.
    * 
    * @return Video_Delay/String.
    */
    @Nullable
    public final Long getVideoDelayStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING);
    }

   /**
    * Get Video_Delay/String.
    * 
    * @return Video_Delay/String.
    */
    @Nullable
    public final LocalDateTime getVideoDelayStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING);
    }

   /**
    * Get Video_Delay/String.
    * 
    * @return Video_Delay/String.
    */
    @Nullable
    public final LocalTime getVideoDelayStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING);
    }

   /**
    * Get Video_Delay/String.
    * 
    * @return Video_Delay/String.
    */
    @Nullable
    public final String getVideoDelayStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING);
    }

   /**
    * Get Video_Delay/String.
    * 
    * @return Video_Delay/String.
    */
    @Nullable
    public final Boolean getVideoDelayStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING);
    }

   /**
    * Get Video_Delay/String.
    * 
    * @return Video_Delay/String.
    */
    @Nullable
    public final BigInteger getVideoDelayStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING);
    }

   /**
    * Get Video_Delay/String.
    * 
    * @return Video_Delay/String.
    */
    @Nullable
    public final URL getVideoDelayStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING);
    }


   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Integer getDelayString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING4);
    }

   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Long getDelayString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING4);
    }

   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalDateTime getDelayString4AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING4);
    }

   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalTime getDelayString4AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING4);
    }

   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final String getDelayString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING4);
    }

   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Boolean getDelayString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING4);
    }

   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final BigInteger getDelayString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING4);
    }

   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final URL getDelayString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING4);
    }


   /**
    * Get ColorSpace.
    * 
    * @return ColorSpace.
    */
    @Nullable
    public final Integer getColorSpaceAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.COLORSPACE);
    }

   /**
    * Get ColorSpace.
    * 
    * @return ColorSpace.
    */
    @Nullable
    public final Long getColorSpaceAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.COLORSPACE);
    }

   /**
    * Get ColorSpace.
    * 
    * @return ColorSpace.
    */
    @Nullable
    public final LocalDateTime getColorSpaceAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.COLORSPACE);
    }

   /**
    * Get ColorSpace.
    * 
    * @return ColorSpace.
    */
    @Nullable
    public final LocalTime getColorSpaceAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.COLORSPACE);
    }

   /**
    * Get ColorSpace.
    * 
    * @return ColorSpace.
    */
    @Nullable
    public final String getColorSpaceAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.COLORSPACE);
    }

   /**
    * Get ColorSpace.
    * 
    * @return ColorSpace.
    */
    @Nullable
    public final Boolean getColorSpaceAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.COLORSPACE);
    }

   /**
    * Get ColorSpace.
    * 
    * @return ColorSpace.
    */
    @Nullable
    public final BigInteger getColorSpaceAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.COLORSPACE);
    }

   /**
    * Get ColorSpace.
    * 
    * @return ColorSpace.
    */
    @Nullable
    public final URL getColorSpaceAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.COLORSPACE);
    }


   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Integer getDelayString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Long getDelayString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final LocalDateTime getDelayString1AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final LocalTime getDelayString1AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final String getDelayString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Boolean getDelayString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final BigInteger getDelayString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final URL getDelayString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING1);
    }


   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Integer getDelayString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Long getDelayString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final LocalDateTime getDelayString2AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final LocalTime getDelayString2AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final String getDelayString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Boolean getDelayString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final BigInteger getDelayString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final URL getDelayString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING2);
    }


   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Integer getDelayString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Long getDelayString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalDateTime getDelayString5AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalTime getDelayString5AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final String getDelayString5AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Boolean getDelayString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final BigInteger getDelayString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final URL getDelayString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DELAYSTRING5);
    }


   /**
    * Get Delay fixed in the stream (relative) IN MS.
    * 
    * @return Delay fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final Integer getDelayAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DELAY);
    }

   /**
    * Get Delay fixed in the stream (relative) IN MS.
    * 
    * @return Delay fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final Long getDelayAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DELAY);
    }

   /**
    * Get Delay fixed in the stream (relative) IN MS.
    * 
    * @return Delay fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final LocalDateTime getDelayAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DELAY);
    }

   /**
    * Get Delay fixed in the stream (relative) IN MS.
    * 
    * @return Delay fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final LocalTime getDelayAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DELAY);
    }

   /**
    * Get Delay fixed in the stream (relative) IN MS.
    * 
    * @return Delay fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final String getDelayAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DELAY);
    }

   /**
    * Get Delay fixed in the stream (relative) IN MS.
    * 
    * @return Delay fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final Boolean getDelayAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DELAY);
    }

   /**
    * Get Delay fixed in the stream (relative) IN MS.
    * 
    * @return Delay fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final BigInteger getDelayAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DELAY);
    }

   /**
    * Get Delay fixed in the stream (relative) IN MS.
    * 
    * @return Delay fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final URL getDelayAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DELAY);
    }


   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit..
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit..
    */
    @Nullable
    public final Integer getEncodedApplicationUrlAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATIONURL);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit..
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit..
    */
    @Nullable
    public final Long getEncodedApplicationUrlAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATIONURL);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit..
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit..
    */
    @Nullable
    public final LocalDateTime getEncodedApplicationUrlAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATIONURL);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit..
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit..
    */
    @Nullable
    public final LocalTime getEncodedApplicationUrlAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATIONURL);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit..
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit..
    */
    @Nullable
    public final String getEncodedApplicationUrlAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATIONURL);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit..
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit..
    */
    @Nullable
    public final Boolean getEncodedApplicationUrlAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATIONURL);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit..
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit..
    */
    @Nullable
    public final BigInteger getEncodedApplicationUrlAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATIONURL);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit..
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit..
    */
    @Nullable
    public final URL getEncodedApplicationUrlAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATIONURL);
    }


   /**
    * Get Source_StreamSize_Encoded/String4.
    * 
    * @return Source_StreamSize_Encoded/String4.
    */
    @Nullable
    public final Integer getSourceStreamSizeEncodedString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING4);
    }

   /**
    * Get Source_StreamSize_Encoded/String4.
    * 
    * @return Source_StreamSize_Encoded/String4.
    */
    @Nullable
    public final Long getSourceStreamSizeEncodedString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING4);
    }

   /**
    * Get Source_StreamSize_Encoded/String4.
    * 
    * @return Source_StreamSize_Encoded/String4.
    */
    @Nullable
    public final LocalDateTime getSourceStreamSizeEncodedString4AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING4);
    }

   /**
    * Get Source_StreamSize_Encoded/String4.
    * 
    * @return Source_StreamSize_Encoded/String4.
    */
    @Nullable
    public final LocalTime getSourceStreamSizeEncodedString4AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING4);
    }

   /**
    * Get Source_StreamSize_Encoded/String4.
    * 
    * @return Source_StreamSize_Encoded/String4.
    */
    @Nullable
    public final String getSourceStreamSizeEncodedString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING4);
    }

   /**
    * Get Source_StreamSize_Encoded/String4.
    * 
    * @return Source_StreamSize_Encoded/String4.
    */
    @Nullable
    public final Boolean getSourceStreamSizeEncodedString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING4);
    }

   /**
    * Get Source_StreamSize_Encoded/String4.
    * 
    * @return Source_StreamSize_Encoded/String4.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeEncodedString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING4);
    }

   /**
    * Get Source_StreamSize_Encoded/String4.
    * 
    * @return Source_StreamSize_Encoded/String4.
    */
    @Nullable
    public final URL getSourceStreamSizeEncodedString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING4);
    }


   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final Integer getSourceStreamSizeEncodedString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING5);
    }

   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final Long getSourceStreamSizeEncodedString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING5);
    }

   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final LocalDateTime getSourceStreamSizeEncodedString5AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING5);
    }

   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final LocalTime getSourceStreamSizeEncodedString5AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING5);
    }

   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final String getSourceStreamSizeEncodedString5AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING5);
    }

   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final Boolean getSourceStreamSizeEncodedString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING5);
    }

   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeEncodedString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING5);
    }

   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final URL getSourceStreamSizeEncodedString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING5);
    }


   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Integer getSourceDurationFirstFrameString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING1);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Long getSourceDurationFirstFrameString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING1);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final LocalDateTime getSourceDurationFirstFrameString1AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING1);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final LocalTime getSourceDurationFirstFrameString1AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING1);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final String getSourceDurationFirstFrameString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING1);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Boolean getSourceDurationFirstFrameString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING1);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final BigInteger getSourceDurationFirstFrameString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING1);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final URL getSourceDurationFirstFrameString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING1);
    }


   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Integer getSourceDurationFirstFrameString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING2);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Long getSourceDurationFirstFrameString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING2);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalDateTime getSourceDurationFirstFrameString2AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING2);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalTime getSourceDurationFirstFrameString2AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING2);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final String getSourceDurationFirstFrameString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING2);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Boolean getSourceDurationFirstFrameString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING2);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final BigInteger getSourceDurationFirstFrameString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING2);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final URL getSourceDurationFirstFrameString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING2);
    }


   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Integer getSourceDurationFirstFrameString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING3);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Long getSourceDurationFirstFrameString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING3);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalDateTime getSourceDurationFirstFrameString3AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING3);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalTime getSourceDurationFirstFrameString3AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING3);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final String getSourceDurationFirstFrameString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING3);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Boolean getSourceDurationFirstFrameString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING3);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final BigInteger getSourceDurationFirstFrameString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING3);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final URL getSourceDurationFirstFrameString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING3);
    }


   /**
    * Get Software used to create the file.
    * 
    * @return Software used to create the file.
    */
    @Nullable
    public final Integer getEncodedLibraryAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARY);
    }

   /**
    * Get Software used to create the file.
    * 
    * @return Software used to create the file.
    */
    @Nullable
    public final Long getEncodedLibraryAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARY);
    }

   /**
    * Get Software used to create the file.
    * 
    * @return Software used to create the file.
    */
    @Nullable
    public final LocalDateTime getEncodedLibraryAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARY);
    }

   /**
    * Get Software used to create the file.
    * 
    * @return Software used to create the file.
    */
    @Nullable
    public final LocalTime getEncodedLibraryAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARY);
    }

   /**
    * Get Software used to create the file.
    * 
    * @return Software used to create the file.
    */
    @Nullable
    public final String getEncodedLibraryAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARY);
    }

   /**
    * Get Software used to create the file.
    * 
    * @return Software used to create the file.
    */
    @Nullable
    public final Boolean getEncodedLibraryAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARY);
    }

   /**
    * Get Software used to create the file.
    * 
    * @return Software used to create the file.
    */
    @Nullable
    public final BigInteger getEncodedLibraryAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARY);
    }

   /**
    * Get Software used to create the file.
    * 
    * @return Software used to create the file.
    */
    @Nullable
    public final URL getEncodedLibraryAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARY);
    }


   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Integer getSourceDurationFirstFrameString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING4);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Long getSourceDurationFirstFrameString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING4);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalDateTime getSourceDurationFirstFrameString4AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING4);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalTime getSourceDurationFirstFrameString4AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING4);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final String getSourceDurationFirstFrameString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING4);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Boolean getSourceDurationFirstFrameString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING4);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final BigInteger getSourceDurationFirstFrameString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING4);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final URL getSourceDurationFirstFrameString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING4);
    }


   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Integer getSourceDurationFirstFrameString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING5);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Long getSourceDurationFirstFrameString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING5);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalDateTime getSourceDurationFirstFrameString5AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING5);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalTime getSourceDurationFirstFrameString5AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING5);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final String getSourceDurationFirstFrameString5AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING5);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Boolean getSourceDurationFirstFrameString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING5);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final BigInteger getSourceDurationFirstFrameString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING5);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final URL getSourceDurationFirstFrameString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAMESTRING5);
    }


   /**
    * Get Nominal Frames per second.
    * 
    * @return Nominal Frames per second.
    */
    @Nullable
    public final Integer getFrameRateNominalAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.FRAMERATENOMINAL);
    }

   /**
    * Get Nominal Frames per second.
    * 
    * @return Nominal Frames per second.
    */
    @Nullable
    public final Long getFrameRateNominalAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.FRAMERATENOMINAL);
    }

   /**
    * Get Nominal Frames per second.
    * 
    * @return Nominal Frames per second.
    */
    @Nullable
    public final LocalDateTime getFrameRateNominalAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.FRAMERATENOMINAL);
    }

   /**
    * Get Nominal Frames per second.
    * 
    * @return Nominal Frames per second.
    */
    @Nullable
    public final LocalTime getFrameRateNominalAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.FRAMERATENOMINAL);
    }

   /**
    * Get Nominal Frames per second.
    * 
    * @return Nominal Frames per second.
    */
    @Nullable
    public final String getFrameRateNominalAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.FRAMERATENOMINAL);
    }

   /**
    * Get Nominal Frames per second.
    * 
    * @return Nominal Frames per second.
    */
    @Nullable
    public final Boolean getFrameRateNominalAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.FRAMERATENOMINAL);
    }

   /**
    * Get Nominal Frames per second.
    * 
    * @return Nominal Frames per second.
    */
    @Nullable
    public final BigInteger getFrameRateNominalAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.FRAMERATENOMINAL);
    }

   /**
    * Get Nominal Frames per second.
    * 
    * @return Nominal Frames per second.
    */
    @Nullable
    public final URL getFrameRateNominalAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.FRAMERATENOMINAL);
    }


   /**
    * Get Internet Media Type (aka MIME Type, Content-Type).
    * 
    * @return Internet Media Type (aka MIME Type, Content-Type).
    */
    @Nullable
    public final Integer getInternetMediaTypeAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.INTERNETMEDIATYPE);
    }

   /**
    * Get Internet Media Type (aka MIME Type, Content-Type).
    * 
    * @return Internet Media Type (aka MIME Type, Content-Type).
    */
    @Nullable
    public final Long getInternetMediaTypeAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.INTERNETMEDIATYPE);
    }

   /**
    * Get Internet Media Type (aka MIME Type, Content-Type).
    * 
    * @return Internet Media Type (aka MIME Type, Content-Type).
    */
    @Nullable
    public final LocalDateTime getInternetMediaTypeAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.INTERNETMEDIATYPE);
    }

   /**
    * Get Internet Media Type (aka MIME Type, Content-Type).
    * 
    * @return Internet Media Type (aka MIME Type, Content-Type).
    */
    @Nullable
    public final LocalTime getInternetMediaTypeAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.INTERNETMEDIATYPE);
    }

   /**
    * Get Internet Media Type (aka MIME Type, Content-Type).
    * 
    * @return Internet Media Type (aka MIME Type, Content-Type).
    */
    @Nullable
    public final String getInternetMediaTypeAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.INTERNETMEDIATYPE);
    }

   /**
    * Get Internet Media Type (aka MIME Type, Content-Type).
    * 
    * @return Internet Media Type (aka MIME Type, Content-Type).
    */
    @Nullable
    public final Boolean getInternetMediaTypeAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.INTERNETMEDIATYPE);
    }

   /**
    * Get Internet Media Type (aka MIME Type, Content-Type).
    * 
    * @return Internet Media Type (aka MIME Type, Content-Type).
    */
    @Nullable
    public final BigInteger getInternetMediaTypeAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.INTERNETMEDIATYPE);
    }

   /**
    * Get Internet Media Type (aka MIME Type, Content-Type).
    * 
    * @return Internet Media Type (aka MIME Type, Content-Type).
    */
    @Nullable
    public final URL getInternetMediaTypeAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.INTERNETMEDIATYPE);
    }


   /**
    * Get Source_StreamSize_Encoded/String2.
    * 
    * @return Source_StreamSize_Encoded/String2.
    */
    @Nullable
    public final Integer getSourceStreamSizeEncodedString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING2);
    }

   /**
    * Get Source_StreamSize_Encoded/String2.
    * 
    * @return Source_StreamSize_Encoded/String2.
    */
    @Nullable
    public final Long getSourceStreamSizeEncodedString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING2);
    }

   /**
    * Get Source_StreamSize_Encoded/String2.
    * 
    * @return Source_StreamSize_Encoded/String2.
    */
    @Nullable
    public final LocalDateTime getSourceStreamSizeEncodedString2AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING2);
    }

   /**
    * Get Source_StreamSize_Encoded/String2.
    * 
    * @return Source_StreamSize_Encoded/String2.
    */
    @Nullable
    public final LocalTime getSourceStreamSizeEncodedString2AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING2);
    }

   /**
    * Get Source_StreamSize_Encoded/String2.
    * 
    * @return Source_StreamSize_Encoded/String2.
    */
    @Nullable
    public final String getSourceStreamSizeEncodedString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING2);
    }

   /**
    * Get Source_StreamSize_Encoded/String2.
    * 
    * @return Source_StreamSize_Encoded/String2.
    */
    @Nullable
    public final Boolean getSourceStreamSizeEncodedString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING2);
    }

   /**
    * Get Source_StreamSize_Encoded/String2.
    * 
    * @return Source_StreamSize_Encoded/String2.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeEncodedString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING2);
    }

   /**
    * Get Source_StreamSize_Encoded/String2.
    * 
    * @return Source_StreamSize_Encoded/String2.
    */
    @Nullable
    public final URL getSourceStreamSizeEncodedString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING2);
    }


   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final Integer getDisabledAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DISABLED);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final Long getDisabledAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DISABLED);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final LocalDateTime getDisabledAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DISABLED);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final LocalTime getDisabledAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DISABLED);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final String getDisabledAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DISABLED);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final Boolean getDisabledAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DISABLED);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final BigInteger getDisabledAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DISABLED);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final URL getDisabledAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DISABLED);
    }


   /**
    * Get Frames per second, denominator.
    * 
    * @return Frames per second, denominator.
    */
    @Nullable
    public final Integer getFrameRateDenAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.FRAMERATEDEN);
    }

   /**
    * Get Frames per second, denominator.
    * 
    * @return Frames per second, denominator.
    */
    @Nullable
    public final Long getFrameRateDenAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.FRAMERATEDEN);
    }

   /**
    * Get Frames per second, denominator.
    * 
    * @return Frames per second, denominator.
    */
    @Nullable
    public final LocalDateTime getFrameRateDenAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.FRAMERATEDEN);
    }

   /**
    * Get Frames per second, denominator.
    * 
    * @return Frames per second, denominator.
    */
    @Nullable
    public final LocalTime getFrameRateDenAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.FRAMERATEDEN);
    }

   /**
    * Get Frames per second, denominator.
    * 
    * @return Frames per second, denominator.
    */
    @Nullable
    public final String getFrameRateDenAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.FRAMERATEDEN);
    }

   /**
    * Get Frames per second, denominator.
    * 
    * @return Frames per second, denominator.
    */
    @Nullable
    public final Boolean getFrameRateDenAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.FRAMERATEDEN);
    }

   /**
    * Get Frames per second, denominator.
    * 
    * @return Frames per second, denominator.
    */
    @Nullable
    public final BigInteger getFrameRateDenAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.FRAMERATEDEN);
    }

   /**
    * Get Frames per second, denominator.
    * 
    * @return Frames per second, denominator.
    */
    @Nullable
    public final URL getFrameRateDenAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.FRAMERATEDEN);
    }


   /**
    * Get Source_StreamSize_Encoded/String3.
    * 
    * @return Source_StreamSize_Encoded/String3.
    */
    @Nullable
    public final Integer getSourceStreamSizeEncodedString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING3);
    }

   /**
    * Get Source_StreamSize_Encoded/String3.
    * 
    * @return Source_StreamSize_Encoded/String3.
    */
    @Nullable
    public final Long getSourceStreamSizeEncodedString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING3);
    }

   /**
    * Get Source_StreamSize_Encoded/String3.
    * 
    * @return Source_StreamSize_Encoded/String3.
    */
    @Nullable
    public final LocalDateTime getSourceStreamSizeEncodedString3AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING3);
    }

   /**
    * Get Source_StreamSize_Encoded/String3.
    * 
    * @return Source_StreamSize_Encoded/String3.
    */
    @Nullable
    public final LocalTime getSourceStreamSizeEncodedString3AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING3);
    }

   /**
    * Get Source_StreamSize_Encoded/String3.
    * 
    * @return Source_StreamSize_Encoded/String3.
    */
    @Nullable
    public final String getSourceStreamSizeEncodedString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING3);
    }

   /**
    * Get Source_StreamSize_Encoded/String3.
    * 
    * @return Source_StreamSize_Encoded/String3.
    */
    @Nullable
    public final Boolean getSourceStreamSizeEncodedString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING3);
    }

   /**
    * Get Source_StreamSize_Encoded/String3.
    * 
    * @return Source_StreamSize_Encoded/String3.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeEncodedString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING3);
    }

   /**
    * Get Source_StreamSize_Encoded/String3.
    * 
    * @return Source_StreamSize_Encoded/String3.
    */
    @Nullable
    public final URL getSourceStreamSizeEncodedString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING3);
    }


   /**
    * Get Maximum Frames per second (with measurement).
    * 
    * @return Maximum Frames per second (with measurement).
    */
    @Nullable
    public final Integer getFrameRateMaximumStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMAXIMUMSTRING);
    }

   /**
    * Get Maximum Frames per second (with measurement).
    * 
    * @return Maximum Frames per second (with measurement).
    */
    @Nullable
    public final Long getFrameRateMaximumStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMAXIMUMSTRING);
    }

   /**
    * Get Maximum Frames per second (with measurement).
    * 
    * @return Maximum Frames per second (with measurement).
    */
    @Nullable
    public final LocalDateTime getFrameRateMaximumStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMAXIMUMSTRING);
    }

   /**
    * Get Maximum Frames per second (with measurement).
    * 
    * @return Maximum Frames per second (with measurement).
    */
    @Nullable
    public final LocalTime getFrameRateMaximumStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMAXIMUMSTRING);
    }

   /**
    * Get Maximum Frames per second (with measurement).
    * 
    * @return Maximum Frames per second (with measurement).
    */
    @Nullable
    public final String getFrameRateMaximumStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMAXIMUMSTRING);
    }

   /**
    * Get Maximum Frames per second (with measurement).
    * 
    * @return Maximum Frames per second (with measurement).
    */
    @Nullable
    public final Boolean getFrameRateMaximumStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMAXIMUMSTRING);
    }

   /**
    * Get Maximum Frames per second (with measurement).
    * 
    * @return Maximum Frames per second (with measurement).
    */
    @Nullable
    public final BigInteger getFrameRateMaximumStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMAXIMUMSTRING);
    }

   /**
    * Get Maximum Frames per second (with measurement).
    * 
    * @return Maximum Frames per second (with measurement).
    */
    @Nullable
    public final URL getFrameRateMaximumStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMAXIMUMSTRING);
    }


   /**
    * Get Encoded Stream size divided by file size.
    * 
    * @return Encoded Stream size divided by file size.
    */
    @Nullable
    public final Integer getStreamSizeEncodedProportionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDPROPORTION);
    }

   /**
    * Get Encoded Stream size divided by file size.
    * 
    * @return Encoded Stream size divided by file size.
    */
    @Nullable
    public final Long getStreamSizeEncodedProportionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDPROPORTION);
    }

   /**
    * Get Encoded Stream size divided by file size.
    * 
    * @return Encoded Stream size divided by file size.
    */
    @Nullable
    public final LocalDateTime getStreamSizeEncodedProportionAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDPROPORTION);
    }

   /**
    * Get Encoded Stream size divided by file size.
    * 
    * @return Encoded Stream size divided by file size.
    */
    @Nullable
    public final LocalTime getStreamSizeEncodedProportionAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDPROPORTION);
    }

   /**
    * Get Encoded Stream size divided by file size.
    * 
    * @return Encoded Stream size divided by file size.
    */
    @Nullable
    public final String getStreamSizeEncodedProportionAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDPROPORTION);
    }

   /**
    * Get Encoded Stream size divided by file size.
    * 
    * @return Encoded Stream size divided by file size.
    */
    @Nullable
    public final Boolean getStreamSizeEncodedProportionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDPROPORTION);
    }

   /**
    * Get Encoded Stream size divided by file size.
    * 
    * @return Encoded Stream size divided by file size.
    */
    @Nullable
    public final BigInteger getStreamSizeEncodedProportionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDPROPORTION);
    }

   /**
    * Get Encoded Stream size divided by file size.
    * 
    * @return Encoded Stream size divided by file size.
    */
    @Nullable
    public final URL getStreamSizeEncodedProportionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDPROPORTION);
    }


   /**
    * Get Source_StreamSize_Encoded/String1.
    * 
    * @return Source_StreamSize_Encoded/String1.
    */
    @Nullable
    public final Integer getSourceStreamSizeEncodedString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING1);
    }

   /**
    * Get Source_StreamSize_Encoded/String1.
    * 
    * @return Source_StreamSize_Encoded/String1.
    */
    @Nullable
    public final Long getSourceStreamSizeEncodedString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING1);
    }

   /**
    * Get Source_StreamSize_Encoded/String1.
    * 
    * @return Source_StreamSize_Encoded/String1.
    */
    @Nullable
    public final LocalDateTime getSourceStreamSizeEncodedString1AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING1);
    }

   /**
    * Get Source_StreamSize_Encoded/String1.
    * 
    * @return Source_StreamSize_Encoded/String1.
    */
    @Nullable
    public final LocalTime getSourceStreamSizeEncodedString1AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING1);
    }

   /**
    * Get Source_StreamSize_Encoded/String1.
    * 
    * @return Source_StreamSize_Encoded/String1.
    */
    @Nullable
    public final String getSourceStreamSizeEncodedString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING1);
    }

   /**
    * Get Source_StreamSize_Encoded/String1.
    * 
    * @return Source_StreamSize_Encoded/String1.
    */
    @Nullable
    public final Boolean getSourceStreamSizeEncodedString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING1);
    }

   /**
    * Get Source_StreamSize_Encoded/String1.
    * 
    * @return Source_StreamSize_Encoded/String1.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeEncodedString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING1);
    }

   /**
    * Get Source_StreamSize_Encoded/String1.
    * 
    * @return Source_StreamSize_Encoded/String1.
    */
    @Nullable
    public final URL getSourceStreamSizeEncodedString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDSTRING1);
    }


   /**
    * Get Play time of the stream, in ms.
    * 
    * @return Play time of the stream, in ms.
    */
    @Nullable
    public final Integer getDurationAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DURATION);
    }

   /**
    * Get Play time of the stream, in ms.
    * 
    * @return Play time of the stream, in ms.
    */
    @Nullable
    public final Long getDurationAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DURATION);
    }

   /**
    * Get Play time of the stream, in ms.
    * 
    * @return Play time of the stream, in ms.
    */
    @Nullable
    public final LocalDateTime getDurationAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DURATION);
    }

   /**
    * Get Play time of the stream, in ms.
    * 
    * @return Play time of the stream, in ms.
    */
    @Nullable
    public final LocalTime getDurationAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DURATION);
    }

   /**
    * Get Play time of the stream, in ms.
    * 
    * @return Play time of the stream, in ms.
    */
    @Nullable
    public final String getDurationAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DURATION);
    }

   /**
    * Get Play time of the stream, in ms.
    * 
    * @return Play time of the stream, in ms.
    */
    @Nullable
    public final Boolean getDurationAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DURATION);
    }

   /**
    * Get Play time of the stream, in ms.
    * 
    * @return Play time of the stream, in ms.
    */
    @Nullable
    public final BigInteger getDurationAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DURATION);
    }

   /**
    * Get Play time of the stream, in ms.
    * 
    * @return Play time of the stream, in ms.
    */
    @Nullable
    public final URL getDurationAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DURATION);
    }


   /**
    * Get Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Integer getSourceDurationString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING5);
    }

   /**
    * Get Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Long getSourceDurationString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING5);
    }

   /**
    * Get Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalDateTime getSourceDurationString5AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING5);
    }

   /**
    * Get Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalTime getSourceDurationString5AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING5);
    }

   /**
    * Get Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final String getSourceDurationString5AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING5);
    }

   /**
    * Get Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Boolean getSourceDurationString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING5);
    }

   /**
    * Get Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final BigInteger getSourceDurationString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING5);
    }

   /**
    * Get Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final URL getSourceDurationString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING5);
    }


   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Integer getDurationLastFrameStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Long getDurationLastFrameStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalDateTime getDurationLastFrameStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalTime getDurationLastFrameStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final String getDurationLastFrameStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Boolean getDurationLastFrameStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final BigInteger getDurationLastFrameStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final URL getDurationLastFrameStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING);
    }


   /**
    * Get Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Integer getSourceDurationString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING4);
    }

   /**
    * Get Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Long getSourceDurationString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING4);
    }

   /**
    * Get Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalDateTime getSourceDurationString4AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING4);
    }

   /**
    * Get Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalTime getSourceDurationString4AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING4);
    }

   /**
    * Get Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final String getSourceDurationString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING4);
    }

   /**
    * Get Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Boolean getSourceDurationString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING4);
    }

   /**
    * Get Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final BigInteger getSourceDurationString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING4);
    }

   /**
    * Get Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final URL getSourceDurationString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING4);
    }


   /**
    * Get Source Play time in format : HH:MM:SS.MMM.
    * 
    * @return Source Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Integer getSourceDurationString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING3);
    }

   /**
    * Get Source Play time in format : HH:MM:SS.MMM.
    * 
    * @return Source Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Long getSourceDurationString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING3);
    }

   /**
    * Get Source Play time in format : HH:MM:SS.MMM.
    * 
    * @return Source Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalDateTime getSourceDurationString3AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING3);
    }

   /**
    * Get Source Play time in format : HH:MM:SS.MMM.
    * 
    * @return Source Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalTime getSourceDurationString3AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING3);
    }

   /**
    * Get Source Play time in format : HH:MM:SS.MMM.
    * 
    * @return Source Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final String getSourceDurationString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING3);
    }

   /**
    * Get Source Play time in format : HH:MM:SS.MMM.
    * 
    * @return Source Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Boolean getSourceDurationString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING3);
    }

   /**
    * Get Source Play time in format : HH:MM:SS.MMM.
    * 
    * @return Source Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final BigInteger getSourceDurationString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING3);
    }

   /**
    * Get Source Play time in format : HH:MM:SS.MMM.
    * 
    * @return Source Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final URL getSourceDurationString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING3);
    }


   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Integer getSourceDurationString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING2);
    }

   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Long getSourceDurationString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING2);
    }

   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalDateTime getSourceDurationString2AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING2);
    }

   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalTime getSourceDurationString2AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING2);
    }

   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final String getSourceDurationString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING2);
    }

   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Boolean getSourceDurationString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING2);
    }

   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final BigInteger getSourceDurationString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING2);
    }

   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final URL getSourceDurationString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING2);
    }


   /**
    * Get Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Integer getSourceDurationString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING1);
    }

   /**
    * Get Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Long getSourceDurationString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING1);
    }

   /**
    * Get Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final LocalDateTime getSourceDurationString1AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING1);
    }

   /**
    * Get Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final LocalTime getSourceDurationString1AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING1);
    }

   /**
    * Get Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final String getSourceDurationString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING1);
    }

   /**
    * Get Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Boolean getSourceDurationString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING1);
    }

   /**
    * Get Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final BigInteger getSourceDurationString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING1);
    }

   /**
    * Get Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final URL getSourceDurationString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING1);
    }


   /**
    * Get A hint for this codec ID.
    * 
    * @return A hint for this codec ID.
    */
    @Nullable
    public final Integer getCodecIDHintAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.CODECIDHINT);
    }

   /**
    * Get A hint for this codec ID.
    * 
    * @return A hint for this codec ID.
    */
    @Nullable
    public final Long getCodecIDHintAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.CODECIDHINT);
    }

   /**
    * Get A hint for this codec ID.
    * 
    * @return A hint for this codec ID.
    */
    @Nullable
    public final LocalDateTime getCodecIDHintAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.CODECIDHINT);
    }

   /**
    * Get A hint for this codec ID.
    * 
    * @return A hint for this codec ID.
    */
    @Nullable
    public final LocalTime getCodecIDHintAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.CODECIDHINT);
    }

   /**
    * Get A hint for this codec ID.
    * 
    * @return A hint for this codec ID.
    */
    @Nullable
    public final String getCodecIDHintAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.CODECIDHINT);
    }

   /**
    * Get A hint for this codec ID.
    * 
    * @return A hint for this codec ID.
    */
    @Nullable
    public final Boolean getCodecIDHintAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.CODECIDHINT);
    }

   /**
    * Get A hint for this codec ID.
    * 
    * @return A hint for this codec ID.
    */
    @Nullable
    public final BigInteger getCodecIDHintAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.CODECIDHINT);
    }

   /**
    * Get A hint for this codec ID.
    * 
    * @return A hint for this codec ID.
    */
    @Nullable
    public final URL getCodecIDHintAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.CODECIDHINT);
    }


   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit.
    */
    @Nullable
    public final Integer getEncodedApplicationAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATION);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit.
    */
    @Nullable
    public final Long getEncodedApplicationAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATION);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit.
    */
    @Nullable
    public final LocalDateTime getEncodedApplicationAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATION);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit.
    */
    @Nullable
    public final LocalTime getEncodedApplicationAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATION);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit.
    */
    @Nullable
    public final String getEncodedApplicationAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATION);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit.
    */
    @Nullable
    public final Boolean getEncodedApplicationAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATION);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit.
    */
    @Nullable
    public final BigInteger getEncodedApplicationAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATION);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit.
    */
    @Nullable
    public final URL getEncodedApplicationAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATION);
    }


   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final Integer getCompressionModeStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.COMPRESSIONMODESTRING);
    }

   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final Long getCompressionModeStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.COMPRESSIONMODESTRING);
    }

   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final LocalDateTime getCompressionModeStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.COMPRESSIONMODESTRING);
    }

   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final LocalTime getCompressionModeStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.COMPRESSIONMODESTRING);
    }

   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final String getCompressionModeStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.COMPRESSIONMODESTRING);
    }

   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final Boolean getCompressionModeStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.COMPRESSIONMODESTRING);
    }

   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final BigInteger getCompressionModeStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.COMPRESSIONMODESTRING);
    }

   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final URL getCompressionModeStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.COMPRESSIONMODESTRING);
    }


   /**
    * Get StreamSize/String2.
    * 
    * @return StreamSize/String2.
    */
    @Nullable
    public final Integer getStreamSizeString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING2);
    }

   /**
    * Get StreamSize/String2.
    * 
    * @return StreamSize/String2.
    */
    @Nullable
    public final Long getStreamSizeString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING2);
    }

   /**
    * Get StreamSize/String2.
    * 
    * @return StreamSize/String2.
    */
    @Nullable
    public final LocalDateTime getStreamSizeString2AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING2);
    }

   /**
    * Get StreamSize/String2.
    * 
    * @return StreamSize/String2.
    */
    @Nullable
    public final LocalTime getStreamSizeString2AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING2);
    }

   /**
    * Get StreamSize/String2.
    * 
    * @return StreamSize/String2.
    */
    @Nullable
    public final String getStreamSizeString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING2);
    }

   /**
    * Get StreamSize/String2.
    * 
    * @return StreamSize/String2.
    */
    @Nullable
    public final Boolean getStreamSizeString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING2);
    }

   /**
    * Get StreamSize/String2.
    * 
    * @return StreamSize/String2.
    */
    @Nullable
    public final BigInteger getStreamSizeString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING2);
    }

   /**
    * Get StreamSize/String2.
    * 
    * @return StreamSize/String2.
    */
    @Nullable
    public final URL getStreamSizeString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING2);
    }


   /**
    * Get StreamSize/String1.
    * 
    * @return StreamSize/String1.
    */
    @Nullable
    public final Integer getStreamSizeString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING1);
    }

   /**
    * Get StreamSize/String1.
    * 
    * @return StreamSize/String1.
    */
    @Nullable
    public final Long getStreamSizeString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING1);
    }

   /**
    * Get StreamSize/String1.
    * 
    * @return StreamSize/String1.
    */
    @Nullable
    public final LocalDateTime getStreamSizeString1AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING1);
    }

   /**
    * Get StreamSize/String1.
    * 
    * @return StreamSize/String1.
    */
    @Nullable
    public final LocalTime getStreamSizeString1AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING1);
    }

   /**
    * Get StreamSize/String1.
    * 
    * @return StreamSize/String1.
    */
    @Nullable
    public final String getStreamSizeString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING1);
    }

   /**
    * Get StreamSize/String1.
    * 
    * @return StreamSize/String1.
    */
    @Nullable
    public final Boolean getStreamSizeString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING1);
    }

   /**
    * Get StreamSize/String1.
    * 
    * @return StreamSize/String1.
    */
    @Nullable
    public final BigInteger getStreamSizeString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING1);
    }

   /**
    * Get StreamSize/String1.
    * 
    * @return StreamSize/String1.
    */
    @Nullable
    public final URL getStreamSizeString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING1);
    }


   /**
    * Get StreamSize/String4.
    * 
    * @return StreamSize/String4.
    */
    @Nullable
    public final Integer getStreamSizeString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING4);
    }

   /**
    * Get StreamSize/String4.
    * 
    * @return StreamSize/String4.
    */
    @Nullable
    public final Long getStreamSizeString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING4);
    }

   /**
    * Get StreamSize/String4.
    * 
    * @return StreamSize/String4.
    */
    @Nullable
    public final LocalDateTime getStreamSizeString4AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING4);
    }

   /**
    * Get StreamSize/String4.
    * 
    * @return StreamSize/String4.
    */
    @Nullable
    public final LocalTime getStreamSizeString4AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING4);
    }

   /**
    * Get StreamSize/String4.
    * 
    * @return StreamSize/String4.
    */
    @Nullable
    public final String getStreamSizeString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING4);
    }

   /**
    * Get StreamSize/String4.
    * 
    * @return StreamSize/String4.
    */
    @Nullable
    public final Boolean getStreamSizeString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING4);
    }

   /**
    * Get StreamSize/String4.
    * 
    * @return StreamSize/String4.
    */
    @Nullable
    public final BigInteger getStreamSizeString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING4);
    }

   /**
    * Get StreamSize/String4.
    * 
    * @return StreamSize/String4.
    */
    @Nullable
    public final URL getStreamSizeString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING4);
    }


   /**
    * Get StreamSize/String3.
    * 
    * @return StreamSize/String3.
    */
    @Nullable
    public final Integer getStreamSizeString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING3);
    }

   /**
    * Get StreamSize/String3.
    * 
    * @return StreamSize/String3.
    */
    @Nullable
    public final Long getStreamSizeString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING3);
    }

   /**
    * Get StreamSize/String3.
    * 
    * @return StreamSize/String3.
    */
    @Nullable
    public final LocalDateTime getStreamSizeString3AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING3);
    }

   /**
    * Get StreamSize/String3.
    * 
    * @return StreamSize/String3.
    */
    @Nullable
    public final LocalTime getStreamSizeString3AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING3);
    }

   /**
    * Get StreamSize/String3.
    * 
    * @return StreamSize/String3.
    */
    @Nullable
    public final String getStreamSizeString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING3);
    }

   /**
    * Get StreamSize/String3.
    * 
    * @return StreamSize/String3.
    */
    @Nullable
    public final Boolean getStreamSizeString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING3);
    }

   /**
    * Get StreamSize/String3.
    * 
    * @return StreamSize/String3.
    */
    @Nullable
    public final BigInteger getStreamSizeString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING3);
    }

   /**
    * Get StreamSize/String3.
    * 
    * @return StreamSize/String3.
    */
    @Nullable
    public final URL getStreamSizeString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING3);
    }


   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final Integer getStreamSizeString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING5);
    }

   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final Long getStreamSizeString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING5);
    }

   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final LocalDateTime getStreamSizeString5AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING5);
    }

   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final LocalTime getStreamSizeString5AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING5);
    }

   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final String getStreamSizeString5AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING5);
    }

   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final Boolean getStreamSizeString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING5);
    }

   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final BigInteger getStreamSizeString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING5);
    }

   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final URL getStreamSizeString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING5);
    }


   /**
    * Get Minimum Frames per second.
    * 
    * @return Minimum Frames per second.
    */
    @Nullable
    public final Integer getFrameRateMinimumAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMINIMUM);
    }

   /**
    * Get Minimum Frames per second.
    * 
    * @return Minimum Frames per second.
    */
    @Nullable
    public final Long getFrameRateMinimumAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMINIMUM);
    }

   /**
    * Get Minimum Frames per second.
    * 
    * @return Minimum Frames per second.
    */
    @Nullable
    public final LocalDateTime getFrameRateMinimumAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMINIMUM);
    }

   /**
    * Get Minimum Frames per second.
    * 
    * @return Minimum Frames per second.
    */
    @Nullable
    public final LocalTime getFrameRateMinimumAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMINIMUM);
    }

   /**
    * Get Minimum Frames per second.
    * 
    * @return Minimum Frames per second.
    */
    @Nullable
    public final String getFrameRateMinimumAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMINIMUM);
    }

   /**
    * Get Minimum Frames per second.
    * 
    * @return Minimum Frames per second.
    */
    @Nullable
    public final Boolean getFrameRateMinimumAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMINIMUM);
    }

   /**
    * Get Minimum Frames per second.
    * 
    * @return Minimum Frames per second.
    */
    @Nullable
    public final BigInteger getFrameRateMinimumAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMINIMUM);
    }

   /**
    * Get Minimum Frames per second.
    * 
    * @return Minimum Frames per second.
    */
    @Nullable
    public final URL getFrameRateMinimumAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMINIMUM);
    }


   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final Integer getStreamKindAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.STREAMKIND);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final Long getStreamKindAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.STREAMKIND);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final LocalDateTime getStreamKindAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.STREAMKIND);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final LocalTime getStreamKindAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.STREAMKIND);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final String getStreamKindAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.STREAMKIND);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final Boolean getStreamKindAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.STREAMKIND);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final BigInteger getStreamKindAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.STREAMKIND);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final URL getStreamKindAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.STREAMKIND);
    }


   /**
    * Get Bit rate (with measurement).
    * 
    * @return Bit rate (with measurement).
    */
    @Nullable
    public final Integer getBitRateStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.BITRATESTRING);
    }

   /**
    * Get Bit rate (with measurement).
    * 
    * @return Bit rate (with measurement).
    */
    @Nullable
    public final Long getBitRateStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.BITRATESTRING);
    }

   /**
    * Get Bit rate (with measurement).
    * 
    * @return Bit rate (with measurement).
    */
    @Nullable
    public final LocalDateTime getBitRateStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.BITRATESTRING);
    }

   /**
    * Get Bit rate (with measurement).
    * 
    * @return Bit rate (with measurement).
    */
    @Nullable
    public final LocalTime getBitRateStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.BITRATESTRING);
    }

   /**
    * Get Bit rate (with measurement).
    * 
    * @return Bit rate (with measurement).
    */
    @Nullable
    public final String getBitRateStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.BITRATESTRING);
    }

   /**
    * Get Bit rate (with measurement).
    * 
    * @return Bit rate (with measurement).
    */
    @Nullable
    public final Boolean getBitRateStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.BITRATESTRING);
    }

   /**
    * Get Bit rate (with measurement).
    * 
    * @return Bit rate (with measurement).
    */
    @Nullable
    public final BigInteger getBitRateStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.BITRATESTRING);
    }

   /**
    * Get Bit rate (with measurement).
    * 
    * @return Bit rate (with measurement).
    */
    @Nullable
    public final URL getBitRateStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.BITRATESTRING);
    }


   /**
    * Get Frame rate mode (Constant, Variable).
    * 
    * @return Frame rate mode (Constant, Variable).
    */
    @Nullable
    public final Integer getFrameRateModeStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMODESTRING);
    }

   /**
    * Get Frame rate mode (Constant, Variable).
    * 
    * @return Frame rate mode (Constant, Variable).
    */
    @Nullable
    public final Long getFrameRateModeStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMODESTRING);
    }

   /**
    * Get Frame rate mode (Constant, Variable).
    * 
    * @return Frame rate mode (Constant, Variable).
    */
    @Nullable
    public final LocalDateTime getFrameRateModeStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMODESTRING);
    }

   /**
    * Get Frame rate mode (Constant, Variable).
    * 
    * @return Frame rate mode (Constant, Variable).
    */
    @Nullable
    public final LocalTime getFrameRateModeStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMODESTRING);
    }

   /**
    * Get Frame rate mode (Constant, Variable).
    * 
    * @return Frame rate mode (Constant, Variable).
    */
    @Nullable
    public final String getFrameRateModeStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMODESTRING);
    }

   /**
    * Get Frame rate mode (Constant, Variable).
    * 
    * @return Frame rate mode (Constant, Variable).
    */
    @Nullable
    public final Boolean getFrameRateModeStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMODESTRING);
    }

   /**
    * Get Frame rate mode (Constant, Variable).
    * 
    * @return Frame rate mode (Constant, Variable).
    */
    @Nullable
    public final BigInteger getFrameRateModeStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMODESTRING);
    }

   /**
    * Get Frame rate mode (Constant, Variable).
    * 
    * @return Frame rate mode (Constant, Variable).
    */
    @Nullable
    public final URL getFrameRateModeStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMODESTRING);
    }


   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final Integer getLanguageString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.LANGUAGESTRING1);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final Long getLanguageString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.LANGUAGESTRING1);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final LocalDateTime getLanguageString1AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.LANGUAGESTRING1);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final LocalTime getLanguageString1AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.LANGUAGESTRING1);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final String getLanguageString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.LANGUAGESTRING1);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final Boolean getLanguageString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.LANGUAGESTRING1);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final BigInteger getLanguageString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.LANGUAGESTRING1);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final URL getLanguageString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.LANGUAGESTRING1);
    }


   /**
    * Get Language (2-letter ISO 639-1 if exists, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else empty).
    */
    @Nullable
    public final Integer getLanguageString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.LANGUAGESTRING2);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else empty).
    */
    @Nullable
    public final Long getLanguageString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.LANGUAGESTRING2);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else empty).
    */
    @Nullable
    public final LocalDateTime getLanguageString2AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.LANGUAGESTRING2);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else empty).
    */
    @Nullable
    public final LocalTime getLanguageString2AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.LANGUAGESTRING2);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else empty).
    */
    @Nullable
    public final String getLanguageString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.LANGUAGESTRING2);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else empty).
    */
    @Nullable
    public final Boolean getLanguageString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.LANGUAGESTRING2);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else empty).
    */
    @Nullable
    public final BigInteger getLanguageString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.LANGUAGESTRING2);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else empty).
    */
    @Nullable
    public final URL getLanguageString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.LANGUAGESTRING2);
    }


   /**
    * Get Language (3-letter ISO 639-2 if exists, else empty).
    * 
    * @return Language (3-letter ISO 639-2 if exists, else empty).
    */
    @Nullable
    public final Integer getLanguageString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.LANGUAGESTRING3);
    }

   /**
    * Get Language (3-letter ISO 639-2 if exists, else empty).
    * 
    * @return Language (3-letter ISO 639-2 if exists, else empty).
    */
    @Nullable
    public final Long getLanguageString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.LANGUAGESTRING3);
    }

   /**
    * Get Language (3-letter ISO 639-2 if exists, else empty).
    * 
    * @return Language (3-letter ISO 639-2 if exists, else empty).
    */
    @Nullable
    public final LocalDateTime getLanguageString3AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.LANGUAGESTRING3);
    }

   /**
    * Get Language (3-letter ISO 639-2 if exists, else empty).
    * 
    * @return Language (3-letter ISO 639-2 if exists, else empty).
    */
    @Nullable
    public final LocalTime getLanguageString3AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.LANGUAGESTRING3);
    }

   /**
    * Get Language (3-letter ISO 639-2 if exists, else empty).
    * 
    * @return Language (3-letter ISO 639-2 if exists, else empty).
    */
    @Nullable
    public final String getLanguageString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.LANGUAGESTRING3);
    }

   /**
    * Get Language (3-letter ISO 639-2 if exists, else empty).
    * 
    * @return Language (3-letter ISO 639-2 if exists, else empty).
    */
    @Nullable
    public final Boolean getLanguageString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.LANGUAGESTRING3);
    }

   /**
    * Get Language (3-letter ISO 639-2 if exists, else empty).
    * 
    * @return Language (3-letter ISO 639-2 if exists, else empty).
    */
    @Nullable
    public final BigInteger getLanguageString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.LANGUAGESTRING3);
    }

   /**
    * Get Language (3-letter ISO 639-2 if exists, else empty).
    * 
    * @return Language (3-letter ISO 639-2 if exists, else empty).
    */
    @Nullable
    public final URL getLanguageString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.LANGUAGESTRING3);
    }


   /**
    * Get Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    */
    @Nullable
    public final Integer getLanguageString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.LANGUAGESTRING4);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    */
    @Nullable
    public final Long getLanguageString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.LANGUAGESTRING4);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    */
    @Nullable
    public final LocalDateTime getLanguageString4AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.LANGUAGESTRING4);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    */
    @Nullable
    public final LocalTime getLanguageString4AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.LANGUAGESTRING4);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    */
    @Nullable
    public final String getLanguageString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.LANGUAGESTRING4);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    */
    @Nullable
    public final Boolean getLanguageString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.LANGUAGESTRING4);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    */
    @Nullable
    public final BigInteger getLanguageString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.LANGUAGESTRING4);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    */
    @Nullable
    public final URL getLanguageString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.LANGUAGESTRING4);
    }


   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final Integer getCodecIDAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.CODECID);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final Long getCodecIDAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.CODECID);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final LocalDateTime getCodecIDAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.CODECID);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final LocalTime getCodecIDAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.CODECID);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final String getCodecIDAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.CODECID);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final Boolean getCodecIDAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.CODECID);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final BigInteger getCodecIDAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.CODECID);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final URL getCodecIDAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.CODECID);
    }


   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final Integer getAlternateGroupAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.ALTERNATEGROUP);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final Long getAlternateGroupAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.ALTERNATEGROUP);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final LocalDateTime getAlternateGroupAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.ALTERNATEGROUP);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final LocalTime getAlternateGroupAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.ALTERNATEGROUP);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final String getAlternateGroupAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.ALTERNATEGROUP);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final Boolean getAlternateGroupAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.ALTERNATEGROUP);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final BigInteger getAlternateGroupAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.ALTERNATEGROUP);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final URL getAlternateGroupAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.ALTERNATEGROUP);
    }


   /**
    * Get Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    */
    @Nullable
    public final Integer getLanguageAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.LANGUAGE);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    */
    @Nullable
    public final Long getLanguageAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.LANGUAGE);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    */
    @Nullable
    public final LocalDateTime getLanguageAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.LANGUAGE);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    */
    @Nullable
    public final LocalTime getLanguageAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.LANGUAGE);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    */
    @Nullable
    public final String getLanguageAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.LANGUAGE);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    */
    @Nullable
    public final Boolean getLanguageAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.LANGUAGE);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    */
    @Nullable
    public final BigInteger getLanguageAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.LANGUAGE);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    */
    @Nullable
    public final URL getLanguageAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.LANGUAGE);
    }


   /**
    * Get Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final Integer getDurationLastFrameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAME);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final Long getDurationLastFrameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAME);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final LocalDateTime getDurationLastFrameAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAME);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final LocalTime getDurationLastFrameAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAME);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final String getDurationLastFrameAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAME);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final Boolean getDurationLastFrameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAME);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final BigInteger getDurationLastFrameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAME);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final URL getDurationLastFrameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAME);
    }


   /**
    * Get Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final Integer getEncodedLibraryStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYSTRING);
    }

   /**
    * Get Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final Long getEncodedLibraryStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYSTRING);
    }

   /**
    * Get Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final LocalDateTime getEncodedLibraryStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYSTRING);
    }

   /**
    * Get Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final LocalTime getEncodedLibraryStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYSTRING);
    }

   /**
    * Get Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final String getEncodedLibraryStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYSTRING);
    }

   /**
    * Get Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final Boolean getEncodedLibraryStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYSTRING);
    }

   /**
    * Get Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final BigInteger getEncodedLibraryStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYSTRING);
    }

   /**
    * Get Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final URL getEncodedLibraryStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYSTRING);
    }


   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final Integer getStreamSizeStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING);
    }

   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final Long getStreamSizeStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING);
    }

   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final LocalDateTime getStreamSizeStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING);
    }

   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final LocalTime getStreamSizeStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING);
    }

   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final String getStreamSizeStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING);
    }

   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final Boolean getStreamSizeStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING);
    }

   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final BigInteger getStreamSizeStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING);
    }

   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final URL getStreamSizeStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.STREAMSIZESTRING);
    }


   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Integer getDefaultStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DEFAULTSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Long getDefaultStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DEFAULTSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final LocalDateTime getDefaultStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DEFAULTSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final LocalTime getDefaultStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DEFAULTSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final String getDefaultStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DEFAULTSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Boolean getDefaultStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DEFAULTSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final BigInteger getDefaultStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DEFAULTSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final URL getDefaultStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DEFAULTSTRING);
    }


   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final Integer getOriginalSourceMediumIDStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.ORIGINALSOURCEMEDIUMIDSTRING);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final Long getOriginalSourceMediumIDStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.ORIGINALSOURCEMEDIUMIDSTRING);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final LocalDateTime getOriginalSourceMediumIDStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.ORIGINALSOURCEMEDIUMIDSTRING);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final LocalTime getOriginalSourceMediumIDStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.ORIGINALSOURCEMEDIUMIDSTRING);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final String getOriginalSourceMediumIDStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.ORIGINALSOURCEMEDIUMIDSTRING);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final Boolean getOriginalSourceMediumIDStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.ORIGINALSOURCEMEDIUMIDSTRING);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final BigInteger getOriginalSourceMediumIDStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.ORIGINALSOURCEMEDIUMIDSTRING);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final URL getOriginalSourceMediumIDStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.ORIGINALSOURCEMEDIUMIDSTRING);
    }


   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Integer getSourceDurationLastFrameString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING1);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Long getSourceDurationLastFrameString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING1);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final LocalDateTime getSourceDurationLastFrameString1AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING1);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final LocalTime getSourceDurationLastFrameString1AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING1);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final String getSourceDurationLastFrameString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING1);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Boolean getSourceDurationLastFrameString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING1);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final BigInteger getSourceDurationLastFrameString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING1);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final URL getSourceDurationLastFrameString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING1);
    }


   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Integer getSourceDurationLastFrameString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING3);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Long getSourceDurationLastFrameString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING3);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalDateTime getSourceDurationLastFrameString3AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING3);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalTime getSourceDurationLastFrameString3AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING3);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final String getSourceDurationLastFrameString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING3);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Boolean getSourceDurationLastFrameString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING3);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final BigInteger getSourceDurationLastFrameString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING3);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final URL getSourceDurationLastFrameString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING3);
    }


   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Integer getSourceDurationLastFrameString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING2);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Long getSourceDurationLastFrameString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING2);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalDateTime getSourceDurationLastFrameString2AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING2);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalTime getSourceDurationLastFrameString2AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING2);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final String getSourceDurationLastFrameString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING2);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Boolean getSourceDurationLastFrameString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING2);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final BigInteger getSourceDurationLastFrameString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING2);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final URL getSourceDurationLastFrameString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING2);
    }


   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Integer getSourceDurationLastFrameString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING5);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Long getSourceDurationLastFrameString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING5);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalDateTime getSourceDurationLastFrameString5AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING5);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalTime getSourceDurationLastFrameString5AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING5);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final String getSourceDurationLastFrameString5AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING5);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Boolean getSourceDurationLastFrameString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING5);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final BigInteger getSourceDurationLastFrameString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING5);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final URL getSourceDurationLastFrameString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING5);
    }


   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Integer getSourceDurationLastFrameString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING4);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Long getSourceDurationLastFrameString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING4);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalDateTime getSourceDurationLastFrameString4AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING4);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalTime getSourceDurationLastFrameString4AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING4);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final String getSourceDurationLastFrameString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING4);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Boolean getSourceDurationLastFrameString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING4);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final BigInteger getSourceDurationLastFrameString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING4);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final URL getSourceDurationLastFrameString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONLASTFRAMESTRING4);
    }


   /**
    * Get BitDepth/String.
    * 
    * @return BitDepth/String.
    */
    @Nullable
    public final Integer getBitDepthStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.BITDEPTHSTRING);
    }

   /**
    * Get BitDepth/String.
    * 
    * @return BitDepth/String.
    */
    @Nullable
    public final Long getBitDepthStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.BITDEPTHSTRING);
    }

   /**
    * Get BitDepth/String.
    * 
    * @return BitDepth/String.
    */
    @Nullable
    public final LocalDateTime getBitDepthStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.BITDEPTHSTRING);
    }

   /**
    * Get BitDepth/String.
    * 
    * @return BitDepth/String.
    */
    @Nullable
    public final LocalTime getBitDepthStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.BITDEPTHSTRING);
    }

   /**
    * Get BitDepth/String.
    * 
    * @return BitDepth/String.
    */
    @Nullable
    public final String getBitDepthStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.BITDEPTHSTRING);
    }

   /**
    * Get BitDepth/String.
    * 
    * @return BitDepth/String.
    */
    @Nullable
    public final Boolean getBitDepthStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.BITDEPTHSTRING);
    }

   /**
    * Get BitDepth/String.
    * 
    * @return BitDepth/String.
    */
    @Nullable
    public final BigInteger getBitDepthStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.BITDEPTHSTRING);
    }

   /**
    * Get BitDepth/String.
    * 
    * @return BitDepth/String.
    */
    @Nullable
    public final URL getBitDepthStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.BITDEPTHSTRING);
    }


   /**
    * Get Number of frames.
    * 
    * @return Number of frames.
    */
    @Nullable
    public final Integer getFrameCountAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.FRAMECOUNT);
    }

   /**
    * Get Number of frames.
    * 
    * @return Number of frames.
    */
    @Nullable
    public final Long getFrameCountAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.FRAMECOUNT);
    }

   /**
    * Get Number of frames.
    * 
    * @return Number of frames.
    */
    @Nullable
    public final LocalDateTime getFrameCountAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.FRAMECOUNT);
    }

   /**
    * Get Number of frames.
    * 
    * @return Number of frames.
    */
    @Nullable
    public final LocalTime getFrameCountAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.FRAMECOUNT);
    }

   /**
    * Get Number of frames.
    * 
    * @return Number of frames.
    */
    @Nullable
    public final String getFrameCountAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.FRAMECOUNT);
    }

   /**
    * Get Number of frames.
    * 
    * @return Number of frames.
    */
    @Nullable
    public final Boolean getFrameCountAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.FRAMECOUNT);
    }

   /**
    * Get Number of frames.
    * 
    * @return Number of frames.
    */
    @Nullable
    public final BigInteger getFrameCountAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.FRAMECOUNT);
    }

   /**
    * Get Number of frames.
    * 
    * @return Number of frames.
    */
    @Nullable
    public final URL getFrameCountAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.FRAMECOUNT);
    }


   /**
    * Get Name of the track.
    * 
    * @return Name of the track.
    */
    @Nullable
    public final Integer getTitleAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.TITLE);
    }

   /**
    * Get Name of the track.
    * 
    * @return Name of the track.
    */
    @Nullable
    public final Long getTitleAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.TITLE);
    }

   /**
    * Get Name of the track.
    * 
    * @return Name of the track.
    */
    @Nullable
    public final LocalDateTime getTitleAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.TITLE);
    }

   /**
    * Get Name of the track.
    * 
    * @return Name of the track.
    */
    @Nullable
    public final LocalTime getTitleAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.TITLE);
    }

   /**
    * Get Name of the track.
    * 
    * @return Name of the track.
    */
    @Nullable
    public final String getTitleAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.TITLE);
    }

   /**
    * Get Name of the track.
    * 
    * @return Name of the track.
    */
    @Nullable
    public final Boolean getTitleAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.TITLE);
    }

   /**
    * Get Name of the track.
    * 
    * @return Name of the track.
    */
    @Nullable
    public final BigInteger getTitleAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.TITLE);
    }

   /**
    * Get Name of the track.
    * 
    * @return Name of the track.
    */
    @Nullable
    public final URL getTitleAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.TITLE);
    }


   /**
    * Get Delay drop frame.
    * 
    * @return Delay drop frame.
    */
    @Nullable
    public final Integer getDelayDropFrameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DELAYDROPFRAME);
    }

   /**
    * Get Delay drop frame.
    * 
    * @return Delay drop frame.
    */
    @Nullable
    public final Long getDelayDropFrameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DELAYDROPFRAME);
    }

   /**
    * Get Delay drop frame.
    * 
    * @return Delay drop frame.
    */
    @Nullable
    public final LocalDateTime getDelayDropFrameAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DELAYDROPFRAME);
    }

   /**
    * Get Delay drop frame.
    * 
    * @return Delay drop frame.
    */
    @Nullable
    public final LocalTime getDelayDropFrameAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DELAYDROPFRAME);
    }

   /**
    * Get Delay drop frame.
    * 
    * @return Delay drop frame.
    */
    @Nullable
    public final String getDelayDropFrameAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DELAYDROPFRAME);
    }

   /**
    * Get Delay drop frame.
    * 
    * @return Delay drop frame.
    */
    @Nullable
    public final Boolean getDelayDropFrameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DELAYDROPFRAME);
    }

   /**
    * Get Delay drop frame.
    * 
    * @return Delay drop frame.
    */
    @Nullable
    public final BigInteger getDelayDropFrameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DELAYDROPFRAME);
    }

   /**
    * Get Delay drop frame.
    * 
    * @return Delay drop frame.
    */
    @Nullable
    public final URL getDelayDropFrameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DELAYDROPFRAME);
    }


   /**
    * Get Maximum Bit rate in bps.
    * 
    * @return Maximum Bit rate in bps.
    */
    @Nullable
    public final Integer getBitRateMaximumAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.BITRATEMAXIMUM);
    }

   /**
    * Get Maximum Bit rate in bps.
    * 
    * @return Maximum Bit rate in bps.
    */
    @Nullable
    public final Long getBitRateMaximumAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.BITRATEMAXIMUM);
    }

   /**
    * Get Maximum Bit rate in bps.
    * 
    * @return Maximum Bit rate in bps.
    */
    @Nullable
    public final LocalDateTime getBitRateMaximumAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.BITRATEMAXIMUM);
    }

   /**
    * Get Maximum Bit rate in bps.
    * 
    * @return Maximum Bit rate in bps.
    */
    @Nullable
    public final LocalTime getBitRateMaximumAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.BITRATEMAXIMUM);
    }

   /**
    * Get Maximum Bit rate in bps.
    * 
    * @return Maximum Bit rate in bps.
    */
    @Nullable
    public final String getBitRateMaximumAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.BITRATEMAXIMUM);
    }

   /**
    * Get Maximum Bit rate in bps.
    * 
    * @return Maximum Bit rate in bps.
    */
    @Nullable
    public final Boolean getBitRateMaximumAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.BITRATEMAXIMUM);
    }

   /**
    * Get Maximum Bit rate in bps.
    * 
    * @return Maximum Bit rate in bps.
    */
    @Nullable
    public final BigInteger getBitRateMaximumAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.BITRATEMAXIMUM);
    }

   /**
    * Get Maximum Bit rate in bps.
    * 
    * @return Maximum Bit rate in bps.
    */
    @Nullable
    public final URL getBitRateMaximumAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.BITRATEMAXIMUM);
    }


   /**
    * Get Stream size divided by file size.
    * 
    * @return Stream size divided by file size.
    */
    @Nullable
    public final Integer getStreamSizeProportionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEPROPORTION);
    }

   /**
    * Get Stream size divided by file size.
    * 
    * @return Stream size divided by file size.
    */
    @Nullable
    public final Long getStreamSizeProportionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEPROPORTION);
    }

   /**
    * Get Stream size divided by file size.
    * 
    * @return Stream size divided by file size.
    */
    @Nullable
    public final LocalDateTime getStreamSizeProportionAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEPROPORTION);
    }

   /**
    * Get Stream size divided by file size.
    * 
    * @return Stream size divided by file size.
    */
    @Nullable
    public final LocalTime getStreamSizeProportionAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEPROPORTION);
    }

   /**
    * Get Stream size divided by file size.
    * 
    * @return Stream size divided by file size.
    */
    @Nullable
    public final String getStreamSizeProportionAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEPROPORTION);
    }

   /**
    * Get Stream size divided by file size.
    * 
    * @return Stream size divided by file size.
    */
    @Nullable
    public final Boolean getStreamSizeProportionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEPROPORTION);
    }

   /**
    * Get Stream size divided by file size.
    * 
    * @return Stream size divided by file size.
    */
    @Nullable
    public final BigInteger getStreamSizeProportionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEPROPORTION);
    }

   /**
    * Get Stream size divided by file size.
    * 
    * @return Stream size divided by file size.
    */
    @Nullable
    public final URL getStreamSizeProportionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEPROPORTION);
    }


   /**
    * Get Source Encoded Stream size divided by file size.
    * 
    * @return Source Encoded Stream size divided by file size.
    */
    @Nullable
    public final Integer getSourceStreamSizeEncodedProportionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDPROPORTION);
    }

   /**
    * Get Source Encoded Stream size divided by file size.
    * 
    * @return Source Encoded Stream size divided by file size.
    */
    @Nullable
    public final Long getSourceStreamSizeEncodedProportionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDPROPORTION);
    }

   /**
    * Get Source Encoded Stream size divided by file size.
    * 
    * @return Source Encoded Stream size divided by file size.
    */
    @Nullable
    public final LocalDateTime getSourceStreamSizeEncodedProportionAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDPROPORTION);
    }

   /**
    * Get Source Encoded Stream size divided by file size.
    * 
    * @return Source Encoded Stream size divided by file size.
    */
    @Nullable
    public final LocalTime getSourceStreamSizeEncodedProportionAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDPROPORTION);
    }

   /**
    * Get Source Encoded Stream size divided by file size.
    * 
    * @return Source Encoded Stream size divided by file size.
    */
    @Nullable
    public final String getSourceStreamSizeEncodedProportionAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDPROPORTION);
    }

   /**
    * Get Source Encoded Stream size divided by file size.
    * 
    * @return Source Encoded Stream size divided by file size.
    */
    @Nullable
    public final Boolean getSourceStreamSizeEncodedProportionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDPROPORTION);
    }

   /**
    * Get Source Encoded Stream size divided by file size.
    * 
    * @return Source Encoded Stream size divided by file size.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeEncodedProportionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDPROPORTION);
    }

   /**
    * Get Source Encoded Stream size divided by file size.
    * 
    * @return Source Encoded Stream size divided by file size.
    */
    @Nullable
    public final URL getSourceStreamSizeEncodedProportionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZEENCODEDPROPORTION);
    }


   /**
    * Get Parameters used by the software.
    * 
    * @return Parameters used by the software.
    */
    @Nullable
    public final Integer getEncodedLibrarySettingsAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYSETTINGS);
    }

   /**
    * Get Parameters used by the software.
    * 
    * @return Parameters used by the software.
    */
    @Nullable
    public final Long getEncodedLibrarySettingsAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYSETTINGS);
    }

   /**
    * Get Parameters used by the software.
    * 
    * @return Parameters used by the software.
    */
    @Nullable
    public final LocalDateTime getEncodedLibrarySettingsAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYSETTINGS);
    }

   /**
    * Get Parameters used by the software.
    * 
    * @return Parameters used by the software.
    */
    @Nullable
    public final LocalTime getEncodedLibrarySettingsAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYSETTINGS);
    }

   /**
    * Get Parameters used by the software.
    * 
    * @return Parameters used by the software.
    */
    @Nullable
    public final String getEncodedLibrarySettingsAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYSETTINGS);
    }

   /**
    * Get Parameters used by the software.
    * 
    * @return Parameters used by the software.
    */
    @Nullable
    public final Boolean getEncodedLibrarySettingsAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYSETTINGS);
    }

   /**
    * Get Parameters used by the software.
    * 
    * @return Parameters used by the software.
    */
    @Nullable
    public final BigInteger getEncodedLibrarySettingsAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYSETTINGS);
    }

   /**
    * Get Parameters used by the software.
    * 
    * @return Parameters used by the software.
    */
    @Nullable
    public final URL getEncodedLibrarySettingsAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYSETTINGS);
    }


   /**
    * Get Source Play time of the stream, in ms.
    * 
    * @return Source Play time of the stream, in ms.
    */
    @Nullable
    public final Integer getSourceDurationAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATION);
    }

   /**
    * Get Source Play time of the stream, in ms.
    * 
    * @return Source Play time of the stream, in ms.
    */
    @Nullable
    public final Long getSourceDurationAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATION);
    }

   /**
    * Get Source Play time of the stream, in ms.
    * 
    * @return Source Play time of the stream, in ms.
    */
    @Nullable
    public final LocalDateTime getSourceDurationAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATION);
    }

   /**
    * Get Source Play time of the stream, in ms.
    * 
    * @return Source Play time of the stream, in ms.
    */
    @Nullable
    public final LocalTime getSourceDurationAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATION);
    }

   /**
    * Get Source Play time of the stream, in ms.
    * 
    * @return Source Play time of the stream, in ms.
    */
    @Nullable
    public final String getSourceDurationAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATION);
    }

   /**
    * Get Source Play time of the stream, in ms.
    * 
    * @return Source Play time of the stream, in ms.
    */
    @Nullable
    public final Boolean getSourceDurationAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATION);
    }

   /**
    * Get Source Play time of the stream, in ms.
    * 
    * @return Source Play time of the stream, in ms.
    */
    @Nullable
    public final BigInteger getSourceDurationAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATION);
    }

   /**
    * Get Source Play time of the stream, in ms.
    * 
    * @return Source Play time of the stream, in ms.
    */
    @Nullable
    public final URL getSourceDurationAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATION);
    }


   /**
    * Get Frame rate mode (CFR, VFR).
    * 
    * @return Frame rate mode (CFR, VFR).
    */
    @Nullable
    public final Integer getFrameRateModeAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMODE);
    }

   /**
    * Get Frame rate mode (CFR, VFR).
    * 
    * @return Frame rate mode (CFR, VFR).
    */
    @Nullable
    public final Long getFrameRateModeAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMODE);
    }

   /**
    * Get Frame rate mode (CFR, VFR).
    * 
    * @return Frame rate mode (CFR, VFR).
    */
    @Nullable
    public final LocalDateTime getFrameRateModeAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMODE);
    }

   /**
    * Get Frame rate mode (CFR, VFR).
    * 
    * @return Frame rate mode (CFR, VFR).
    */
    @Nullable
    public final LocalTime getFrameRateModeAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMODE);
    }

   /**
    * Get Frame rate mode (CFR, VFR).
    * 
    * @return Frame rate mode (CFR, VFR).
    */
    @Nullable
    public final String getFrameRateModeAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMODE);
    }

   /**
    * Get Frame rate mode (CFR, VFR).
    * 
    * @return Frame rate mode (CFR, VFR).
    */
    @Nullable
    public final Boolean getFrameRateModeAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMODE);
    }

   /**
    * Get Frame rate mode (CFR, VFR).
    * 
    * @return Frame rate mode (CFR, VFR).
    */
    @Nullable
    public final BigInteger getFrameRateModeAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMODE);
    }

   /**
    * Get Frame rate mode (CFR, VFR).
    * 
    * @return Frame rate mode (CFR, VFR).
    */
    @Nullable
    public final URL getFrameRateModeAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMODE);
    }


   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Integer getDelayOriginalString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Long getDelayOriginalString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final LocalDateTime getDelayOriginalString1AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final LocalTime getDelayOriginalString1AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final String getDelayOriginalString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Boolean getDelayOriginalString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final BigInteger getDelayOriginalString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final URL getDelayOriginalString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING1);
    }


   /**
    * Get Count of objects available in this stream.
    * 
    * @return Count of objects available in this stream.
    */
    @Nullable
    public final Integer getCountAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.COUNT);
    }

   /**
    * Get Count of objects available in this stream.
    * 
    * @return Count of objects available in this stream.
    */
    @Nullable
    public final Long getCountAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.COUNT);
    }

   /**
    * Get Count of objects available in this stream.
    * 
    * @return Count of objects available in this stream.
    */
    @Nullable
    public final LocalDateTime getCountAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.COUNT);
    }

   /**
    * Get Count of objects available in this stream.
    * 
    * @return Count of objects available in this stream.
    */
    @Nullable
    public final LocalTime getCountAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.COUNT);
    }

   /**
    * Get Count of objects available in this stream.
    * 
    * @return Count of objects available in this stream.
    */
    @Nullable
    public final String getCountAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.COUNT);
    }

   /**
    * Get Count of objects available in this stream.
    * 
    * @return Count of objects available in this stream.
    */
    @Nullable
    public final Boolean getCountAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.COUNT);
    }

   /**
    * Get Count of objects available in this stream.
    * 
    * @return Count of objects available in this stream.
    */
    @Nullable
    public final BigInteger getCountAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.COUNT);
    }

   /**
    * Get Count of objects available in this stream.
    * 
    * @return Count of objects available in this stream.
    */
    @Nullable
    public final URL getCountAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.COUNT);
    }


   /**
    * Get Wrapping mode (Frame wrapped or Clip wrapped).
    * 
    * @return Wrapping mode (Frame wrapped or Clip wrapped).
    */
    @Nullable
    public final Integer getFormatSettingsWrappingAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.FORMATSETTINGSWRAPPING);
    }

   /**
    * Get Wrapping mode (Frame wrapped or Clip wrapped).
    * 
    * @return Wrapping mode (Frame wrapped or Clip wrapped).
    */
    @Nullable
    public final Long getFormatSettingsWrappingAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.FORMATSETTINGSWRAPPING);
    }

   /**
    * Get Wrapping mode (Frame wrapped or Clip wrapped).
    * 
    * @return Wrapping mode (Frame wrapped or Clip wrapped).
    */
    @Nullable
    public final LocalDateTime getFormatSettingsWrappingAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.FORMATSETTINGSWRAPPING);
    }

   /**
    * Get Wrapping mode (Frame wrapped or Clip wrapped).
    * 
    * @return Wrapping mode (Frame wrapped or Clip wrapped).
    */
    @Nullable
    public final LocalTime getFormatSettingsWrappingAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.FORMATSETTINGSWRAPPING);
    }

   /**
    * Get Wrapping mode (Frame wrapped or Clip wrapped).
    * 
    * @return Wrapping mode (Frame wrapped or Clip wrapped).
    */
    @Nullable
    public final String getFormatSettingsWrappingAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.FORMATSETTINGSWRAPPING);
    }

   /**
    * Get Wrapping mode (Frame wrapped or Clip wrapped).
    * 
    * @return Wrapping mode (Frame wrapped or Clip wrapped).
    */
    @Nullable
    public final Boolean getFormatSettingsWrappingAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.FORMATSETTINGSWRAPPING);
    }

   /**
    * Get Wrapping mode (Frame wrapped or Clip wrapped).
    * 
    * @return Wrapping mode (Frame wrapped or Clip wrapped).
    */
    @Nullable
    public final BigInteger getFormatSettingsWrappingAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.FORMATSETTINGSWRAPPING);
    }

   /**
    * Get Wrapping mode (Frame wrapped or Clip wrapped).
    * 
    * @return Wrapping mode (Frame wrapped or Clip wrapped).
    */
    @Nullable
    public final URL getFormatSettingsWrappingAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.FORMATSETTINGSWRAPPING);
    }


   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Integer getDelayOriginalString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Long getDelayOriginalString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final LocalDateTime getDelayOriginalString2AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final LocalTime getDelayOriginalString2AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final String getDelayOriginalString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Boolean getDelayOriginalString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final BigInteger getDelayOriginalString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final URL getDelayOriginalString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING2);
    }


   /**
    * Get Encryption.
    * 
    * @return Encryption.
    */
    @Nullable
    public final Integer getEncryptionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.ENCRYPTION);
    }

   /**
    * Get Encryption.
    * 
    * @return Encryption.
    */
    @Nullable
    public final Long getEncryptionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.ENCRYPTION);
    }

   /**
    * Get Encryption.
    * 
    * @return Encryption.
    */
    @Nullable
    public final LocalDateTime getEncryptionAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.ENCRYPTION);
    }

   /**
    * Get Encryption.
    * 
    * @return Encryption.
    */
    @Nullable
    public final LocalTime getEncryptionAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.ENCRYPTION);
    }

   /**
    * Get Encryption.
    * 
    * @return Encryption.
    */
    @Nullable
    public final String getEncryptionAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.ENCRYPTION);
    }

   /**
    * Get Encryption.
    * 
    * @return Encryption.
    */
    @Nullable
    public final Boolean getEncryptionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.ENCRYPTION);
    }

   /**
    * Get Encryption.
    * 
    * @return Encryption.
    */
    @Nullable
    public final BigInteger getEncryptionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.ENCRYPTION);
    }

   /**
    * Get Encryption.
    * 
    * @return Encryption.
    */
    @Nullable
    public final URL getEncryptionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.ENCRYPTION);
    }


   /**
    * Get Delay fixed in the raw stream (relative) IN MS.
    * 
    * @return Delay fixed in the raw stream (relative) IN MS.
    */
    @Nullable
    public final Integer getDelayOriginalAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINAL);
    }

   /**
    * Get Delay fixed in the raw stream (relative) IN MS.
    * 
    * @return Delay fixed in the raw stream (relative) IN MS.
    */
    @Nullable
    public final Long getDelayOriginalAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINAL);
    }

   /**
    * Get Delay fixed in the raw stream (relative) IN MS.
    * 
    * @return Delay fixed in the raw stream (relative) IN MS.
    */
    @Nullable
    public final LocalDateTime getDelayOriginalAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINAL);
    }

   /**
    * Get Delay fixed in the raw stream (relative) IN MS.
    * 
    * @return Delay fixed in the raw stream (relative) IN MS.
    */
    @Nullable
    public final LocalTime getDelayOriginalAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINAL);
    }

   /**
    * Get Delay fixed in the raw stream (relative) IN MS.
    * 
    * @return Delay fixed in the raw stream (relative) IN MS.
    */
    @Nullable
    public final String getDelayOriginalAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINAL);
    }

   /**
    * Get Delay fixed in the raw stream (relative) IN MS.
    * 
    * @return Delay fixed in the raw stream (relative) IN MS.
    */
    @Nullable
    public final Boolean getDelayOriginalAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINAL);
    }

   /**
    * Get Delay fixed in the raw stream (relative) IN MS.
    * 
    * @return Delay fixed in the raw stream (relative) IN MS.
    */
    @Nullable
    public final BigInteger getDelayOriginalAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINAL);
    }

   /**
    * Get Delay fixed in the raw stream (relative) IN MS.
    * 
    * @return Delay fixed in the raw stream (relative) IN MS.
    */
    @Nullable
    public final URL getDelayOriginalAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINAL);
    }


   /**
    * Get Frames per second, numerator.
    * 
    * @return Frames per second, numerator.
    */
    @Nullable
    public final Integer getFrameRateNumAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.FRAMERATENUM);
    }

   /**
    * Get Frames per second, numerator.
    * 
    * @return Frames per second, numerator.
    */
    @Nullable
    public final Long getFrameRateNumAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.FRAMERATENUM);
    }

   /**
    * Get Frames per second, numerator.
    * 
    * @return Frames per second, numerator.
    */
    @Nullable
    public final LocalDateTime getFrameRateNumAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.FRAMERATENUM);
    }

   /**
    * Get Frames per second, numerator.
    * 
    * @return Frames per second, numerator.
    */
    @Nullable
    public final LocalTime getFrameRateNumAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.FRAMERATENUM);
    }

   /**
    * Get Frames per second, numerator.
    * 
    * @return Frames per second, numerator.
    */
    @Nullable
    public final String getFrameRateNumAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.FRAMERATENUM);
    }

   /**
    * Get Frames per second, numerator.
    * 
    * @return Frames per second, numerator.
    */
    @Nullable
    public final Boolean getFrameRateNumAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.FRAMERATENUM);
    }

   /**
    * Get Frames per second, numerator.
    * 
    * @return Frames per second, numerator.
    */
    @Nullable
    public final BigInteger getFrameRateNumAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.FRAMERATENUM);
    }

   /**
    * Get Frames per second, numerator.
    * 
    * @return Frames per second, numerator.
    */
    @Nullable
    public final URL getFrameRateNumAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.FRAMERATENUM);
    }


   /**
    * Get Version of this format.
    * 
    * @return Version of this format.
    */
    @Nullable
    public final Integer getFormatVersionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.FORMATVERSION);
    }

   /**
    * Get Version of this format.
    * 
    * @return Version of this format.
    */
    @Nullable
    public final Long getFormatVersionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.FORMATVERSION);
    }

   /**
    * Get Version of this format.
    * 
    * @return Version of this format.
    */
    @Nullable
    public final LocalDateTime getFormatVersionAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.FORMATVERSION);
    }

   /**
    * Get Version of this format.
    * 
    * @return Version of this format.
    */
    @Nullable
    public final LocalTime getFormatVersionAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.FORMATVERSION);
    }

   /**
    * Get Version of this format.
    * 
    * @return Version of this format.
    */
    @Nullable
    public final String getFormatVersionAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.FORMATVERSION);
    }

   /**
    * Get Version of this format.
    * 
    * @return Version of this format.
    */
    @Nullable
    public final Boolean getFormatVersionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.FORMATVERSION);
    }

   /**
    * Get Version of this format.
    * 
    * @return Version of this format.
    */
    @Nullable
    public final BigInteger getFormatVersionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.FORMATVERSION);
    }

   /**
    * Get Version of this format.
    * 
    * @return Version of this format.
    */
    @Nullable
    public final URL getFormatVersionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.FORMATVERSION);
    }


   /**
    * Get When multiple streams, number of the stream (base=1).
    * 
    * @return When multiple streams, number of the stream (base=1).
    */
    @Nullable
    public final Integer getStreamKindPosAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.STREAMKINDPOS);
    }

   /**
    * Get When multiple streams, number of the stream (base=1).
    * 
    * @return When multiple streams, number of the stream (base=1).
    */
    @Nullable
    public final Long getStreamKindPosAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.STREAMKINDPOS);
    }

   /**
    * Get When multiple streams, number of the stream (base=1).
    * 
    * @return When multiple streams, number of the stream (base=1).
    */
    @Nullable
    public final LocalDateTime getStreamKindPosAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.STREAMKINDPOS);
    }

   /**
    * Get When multiple streams, number of the stream (base=1).
    * 
    * @return When multiple streams, number of the stream (base=1).
    */
    @Nullable
    public final LocalTime getStreamKindPosAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.STREAMKINDPOS);
    }

   /**
    * Get When multiple streams, number of the stream (base=1).
    * 
    * @return When multiple streams, number of the stream (base=1).
    */
    @Nullable
    public final String getStreamKindPosAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.STREAMKINDPOS);
    }

   /**
    * Get When multiple streams, number of the stream (base=1).
    * 
    * @return When multiple streams, number of the stream (base=1).
    */
    @Nullable
    public final Boolean getStreamKindPosAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.STREAMKINDPOS);
    }

   /**
    * Get When multiple streams, number of the stream (base=1).
    * 
    * @return When multiple streams, number of the stream (base=1).
    */
    @Nullable
    public final BigInteger getStreamKindPosAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.STREAMKINDPOS);
    }

   /**
    * Get When multiple streams, number of the stream (base=1).
    * 
    * @return When multiple streams, number of the stream (base=1).
    */
    @Nullable
    public final URL getStreamKindPosAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.STREAMKINDPOS);
    }


   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final Integer getOriginalSourceMediumIDAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.ORIGINALSOURCEMEDIUMID);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final Long getOriginalSourceMediumIDAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.ORIGINALSOURCEMEDIUMID);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final LocalDateTime getOriginalSourceMediumIDAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.ORIGINALSOURCEMEDIUMID);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final LocalTime getOriginalSourceMediumIDAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.ORIGINALSOURCEMEDIUMID);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final String getOriginalSourceMediumIDAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.ORIGINALSOURCEMEDIUMID);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final Boolean getOriginalSourceMediumIDAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.ORIGINALSOURCEMEDIUMID);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final BigInteger getOriginalSourceMediumIDAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.ORIGINALSOURCEMEDIUMID);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final URL getOriginalSourceMediumIDAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.ORIGINALSOURCEMEDIUMID);
    }


   /**
    * Get Play time (formated).
    * 
    * @return Play time (formated).
    */
    @Nullable
    public final Integer getDurationStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING);
    }

   /**
    * Get Play time (formated).
    * 
    * @return Play time (formated).
    */
    @Nullable
    public final Long getDurationStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING);
    }

   /**
    * Get Play time (formated).
    * 
    * @return Play time (formated).
    */
    @Nullable
    public final LocalDateTime getDurationStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING);
    }

   /**
    * Get Play time (formated).
    * 
    * @return Play time (formated).
    */
    @Nullable
    public final LocalTime getDurationStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING);
    }

   /**
    * Get Play time (formated).
    * 
    * @return Play time (formated).
    */
    @Nullable
    public final String getDurationStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING);
    }

   /**
    * Get Play time (formated).
    * 
    * @return Play time (formated).
    */
    @Nullable
    public final Boolean getDurationStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING);
    }

   /**
    * Get Play time (formated).
    * 
    * @return Play time (formated).
    */
    @Nullable
    public final BigInteger getDurationStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING);
    }

   /**
    * Get Play time (formated).
    * 
    * @return Play time (formated).
    */
    @Nullable
    public final URL getDurationStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING);
    }


   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final Integer getIDAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.ID);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final Long getIDAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.ID);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final LocalDateTime getIDAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.ID);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final LocalTime getIDAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.ID);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final String getIDAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.ID);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final Boolean getIDAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.ID);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final BigInteger getIDAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.ID);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final URL getIDAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.ID);
    }


   /**
    * Get Delay fixed in the stream (absolute / video).
    * 
    * @return Delay fixed in the stream (absolute / video).
    */
    @Nullable
    public final Integer getVideoDelayAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.VIDEODELAY);
    }

   /**
    * Get Delay fixed in the stream (absolute / video).
    * 
    * @return Delay fixed in the stream (absolute / video).
    */
    @Nullable
    public final Long getVideoDelayAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.VIDEODELAY);
    }

   /**
    * Get Delay fixed in the stream (absolute / video).
    * 
    * @return Delay fixed in the stream (absolute / video).
    */
    @Nullable
    public final LocalDateTime getVideoDelayAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.VIDEODELAY);
    }

   /**
    * Get Delay fixed in the stream (absolute / video).
    * 
    * @return Delay fixed in the stream (absolute / video).
    */
    @Nullable
    public final LocalTime getVideoDelayAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.VIDEODELAY);
    }

   /**
    * Get Delay fixed in the stream (absolute / video).
    * 
    * @return Delay fixed in the stream (absolute / video).
    */
    @Nullable
    public final String getVideoDelayAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.VIDEODELAY);
    }

   /**
    * Get Delay fixed in the stream (absolute / video).
    * 
    * @return Delay fixed in the stream (absolute / video).
    */
    @Nullable
    public final Boolean getVideoDelayAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.VIDEODELAY);
    }

   /**
    * Get Delay fixed in the stream (absolute / video).
    * 
    * @return Delay fixed in the stream (absolute / video).
    */
    @Nullable
    public final BigInteger getVideoDelayAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.VIDEODELAY);
    }

   /**
    * Get Delay fixed in the stream (absolute / video).
    * 
    * @return Delay fixed in the stream (absolute / video).
    */
    @Nullable
    public final URL getVideoDelayAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.VIDEODELAY);
    }


   /**
    * Get Release date of software.
    * 
    * @return Release date of software.
    */
    @Nullable
    public final Integer getEncodedLibraryDateAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYDATE);
    }

   /**
    * Get Release date of software.
    * 
    * @return Release date of software.
    */
    @Nullable
    public final Long getEncodedLibraryDateAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYDATE);
    }

   /**
    * Get Release date of software.
    * 
    * @return Release date of software.
    */
    @Nullable
    public final LocalDateTime getEncodedLibraryDateAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYDATE);
    }

   /**
    * Get Release date of software.
    * 
    * @return Release date of software.
    */
    @Nullable
    public final LocalTime getEncodedLibraryDateAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYDATE);
    }

   /**
    * Get Release date of software.
    * 
    * @return Release date of software.
    */
    @Nullable
    public final String getEncodedLibraryDateAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYDATE);
    }

   /**
    * Get Release date of software.
    * 
    * @return Release date of software.
    */
    @Nullable
    public final Boolean getEncodedLibraryDateAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYDATE);
    }

   /**
    * Get Release date of software.
    * 
    * @return Release date of software.
    */
    @Nullable
    public final BigInteger getEncodedLibraryDateAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYDATE);
    }

   /**
    * Get Release date of software.
    * 
    * @return Release date of software.
    */
    @Nullable
    public final URL getEncodedLibraryDateAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYDATE);
    }


   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final Integer getMenuIDStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.MENUIDSTRING);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final Long getMenuIDStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.MENUIDSTRING);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final LocalDateTime getMenuIDStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.MENUIDSTRING);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final LocalTime getMenuIDStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.MENUIDSTRING);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final String getMenuIDStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.MENUIDSTRING);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final Boolean getMenuIDStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.MENUIDSTRING);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final BigInteger getMenuIDStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.MENUIDSTRING);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final URL getMenuIDStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.MENUIDSTRING);
    }


   /**
    * Get More info about Language (e.g. Director's Comment).
    * 
    * @return More info about Language (e.g. Director's Comment).
    */
    @Nullable
    public final Integer getLanguageMoreAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.LANGUAGEMORE);
    }

   /**
    * Get More info about Language (e.g. Director's Comment).
    * 
    * @return More info about Language (e.g. Director's Comment).
    */
    @Nullable
    public final Long getLanguageMoreAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.LANGUAGEMORE);
    }

   /**
    * Get More info about Language (e.g. Director's Comment).
    * 
    * @return More info about Language (e.g. Director's Comment).
    */
    @Nullable
    public final LocalDateTime getLanguageMoreAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.LANGUAGEMORE);
    }

   /**
    * Get More info about Language (e.g. Director's Comment).
    * 
    * @return More info about Language (e.g. Director's Comment).
    */
    @Nullable
    public final LocalTime getLanguageMoreAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.LANGUAGEMORE);
    }

   /**
    * Get More info about Language (e.g. Director's Comment).
    * 
    * @return More info about Language (e.g. Director's Comment).
    */
    @Nullable
    public final String getLanguageMoreAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.LANGUAGEMORE);
    }

   /**
    * Get More info about Language (e.g. Director's Comment).
    * 
    * @return More info about Language (e.g. Director's Comment).
    */
    @Nullable
    public final Boolean getLanguageMoreAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.LANGUAGEMORE);
    }

   /**
    * Get More info about Language (e.g. Director's Comment).
    * 
    * @return More info about Language (e.g. Director's Comment).
    */
    @Nullable
    public final BigInteger getLanguageMoreAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.LANGUAGEMORE);
    }

   /**
    * Get More info about Language (e.g. Director's Comment).
    * 
    * @return More info about Language (e.g. Director's Comment).
    */
    @Nullable
    public final URL getLanguageMoreAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.LANGUAGEMORE);
    }


   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final Integer getSourceStreamSizeStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING);
    }

   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final Long getSourceStreamSizeStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING);
    }

   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final LocalDateTime getSourceStreamSizeStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING);
    }

   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final LocalTime getSourceStreamSizeStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING);
    }

   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final String getSourceStreamSizeStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING);
    }

   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final Boolean getSourceStreamSizeStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING);
    }

   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING);
    }

   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final URL getSourceStreamSizeStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZESTRING);
    }


   /**
    * Get Maximum Frames per second.
    * 
    * @return Maximum Frames per second.
    */
    @Nullable
    public final Integer getFrameRateMaximumAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMAXIMUM);
    }

   /**
    * Get Maximum Frames per second.
    * 
    * @return Maximum Frames per second.
    */
    @Nullable
    public final Long getFrameRateMaximumAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMAXIMUM);
    }

   /**
    * Get Maximum Frames per second.
    * 
    * @return Maximum Frames per second.
    */
    @Nullable
    public final LocalDateTime getFrameRateMaximumAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMAXIMUM);
    }

   /**
    * Get Maximum Frames per second.
    * 
    * @return Maximum Frames per second.
    */
    @Nullable
    public final LocalTime getFrameRateMaximumAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMAXIMUM);
    }

   /**
    * Get Maximum Frames per second.
    * 
    * @return Maximum Frames per second.
    */
    @Nullable
    public final String getFrameRateMaximumAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMAXIMUM);
    }

   /**
    * Get Maximum Frames per second.
    * 
    * @return Maximum Frames per second.
    */
    @Nullable
    public final Boolean getFrameRateMaximumAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMAXIMUM);
    }

   /**
    * Get Maximum Frames per second.
    * 
    * @return Maximum Frames per second.
    */
    @Nullable
    public final BigInteger getFrameRateMaximumAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMAXIMUM);
    }

   /**
    * Get Maximum Frames per second.
    * 
    * @return Maximum Frames per second.
    */
    @Nullable
    public final URL getFrameRateMaximumAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.FRAMERATEMAXIMUM);
    }


   /**
    * Get Original (in the raw stream) Frames per second.
    * 
    * @return Original (in the raw stream) Frames per second.
    */
    @Nullable
    public final Integer getFrameRateOriginalAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.FRAMERATEORIGINAL);
    }

   /**
    * Get Original (in the raw stream) Frames per second.
    * 
    * @return Original (in the raw stream) Frames per second.
    */
    @Nullable
    public final Long getFrameRateOriginalAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.FRAMERATEORIGINAL);
    }

   /**
    * Get Original (in the raw stream) Frames per second.
    * 
    * @return Original (in the raw stream) Frames per second.
    */
    @Nullable
    public final LocalDateTime getFrameRateOriginalAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.FRAMERATEORIGINAL);
    }

   /**
    * Get Original (in the raw stream) Frames per second.
    * 
    * @return Original (in the raw stream) Frames per second.
    */
    @Nullable
    public final LocalTime getFrameRateOriginalAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.FRAMERATEORIGINAL);
    }

   /**
    * Get Original (in the raw stream) Frames per second.
    * 
    * @return Original (in the raw stream) Frames per second.
    */
    @Nullable
    public final String getFrameRateOriginalAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.FRAMERATEORIGINAL);
    }

   /**
    * Get Original (in the raw stream) Frames per second.
    * 
    * @return Original (in the raw stream) Frames per second.
    */
    @Nullable
    public final Boolean getFrameRateOriginalAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.FRAMERATEORIGINAL);
    }

   /**
    * Get Original (in the raw stream) Frames per second.
    * 
    * @return Original (in the raw stream) Frames per second.
    */
    @Nullable
    public final BigInteger getFrameRateOriginalAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.FRAMERATEORIGINAL);
    }

   /**
    * Get Original (in the raw stream) Frames per second.
    * 
    * @return Original (in the raw stream) Frames per second.
    */
    @Nullable
    public final URL getFrameRateOriginalAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.FRAMERATEORIGINAL);
    }


   /**
    * Get Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final Integer getDurationFirstFrameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAME);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final Long getDurationFirstFrameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAME);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final LocalDateTime getDurationFirstFrameAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAME);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final LocalTime getDurationFirstFrameAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAME);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final String getDurationFirstFrameAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAME);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final Boolean getDurationFirstFrameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAME);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final BigInteger getDurationFirstFrameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAME);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final URL getDurationFirstFrameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DURATIONFIRSTFRAME);
    }


   /**
    * Get Delay in format: HH:MM:SS.MMM.
    * 
    * @return Delay in format: HH:MM:SS.MMM.
    */
    @Nullable
    public final Integer getDelayOriginalString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING3);
    }

   /**
    * Get Delay in format: HH:MM:SS.MMM.
    * 
    * @return Delay in format: HH:MM:SS.MMM.
    */
    @Nullable
    public final Long getDelayOriginalString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING3);
    }

   /**
    * Get Delay in format: HH:MM:SS.MMM.
    * 
    * @return Delay in format: HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalDateTime getDelayOriginalString3AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING3);
    }

   /**
    * Get Delay in format: HH:MM:SS.MMM.
    * 
    * @return Delay in format: HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalTime getDelayOriginalString3AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING3);
    }

   /**
    * Get Delay in format: HH:MM:SS.MMM.
    * 
    * @return Delay in format: HH:MM:SS.MMM.
    */
    @Nullable
    public final String getDelayOriginalString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING3);
    }

   /**
    * Get Delay in format: HH:MM:SS.MMM.
    * 
    * @return Delay in format: HH:MM:SS.MMM.
    */
    @Nullable
    public final Boolean getDelayOriginalString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING3);
    }

   /**
    * Get Delay in format: HH:MM:SS.MMM.
    * 
    * @return Delay in format: HH:MM:SS.MMM.
    */
    @Nullable
    public final BigInteger getDelayOriginalString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING3);
    }

   /**
    * Get Delay in format: HH:MM:SS.MMM.
    * 
    * @return Delay in format: HH:MM:SS.MMM.
    */
    @Nullable
    public final URL getDelayOriginalString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING3);
    }


   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final Integer getEncodedApplicationStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATIONSTRING);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final Long getEncodedApplicationStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATIONSTRING);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final LocalDateTime getEncodedApplicationStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATIONSTRING);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final LocalTime getEncodedApplicationStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATIONSTRING);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final String getEncodedApplicationStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATIONSTRING);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final Boolean getEncodedApplicationStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATIONSTRING);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final BigInteger getEncodedApplicationStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATIONSTRING);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final URL getEncodedApplicationStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATIONSTRING);
    }


   /**
    * Get Delay in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Integer getDelayOriginalString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING4);
    }

   /**
    * Get Delay in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Long getDelayOriginalString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING4);
    }

   /**
    * Get Delay in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalDateTime getDelayOriginalString4AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING4);
    }

   /**
    * Get Delay in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalTime getDelayOriginalString4AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING4);
    }

   /**
    * Get Delay in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final String getDelayOriginalString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING4);
    }

   /**
    * Get Delay in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Boolean getDelayOriginalString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING4);
    }

   /**
    * Get Delay in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final BigInteger getDelayOriginalString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING4);
    }

   /**
    * Get Delay in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final URL getDelayOriginalString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING4);
    }


   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Integer getDelayOriginalString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Long getDelayOriginalString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalDateTime getDelayOriginalString5AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalTime getDelayOriginalString5AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final String getDelayOriginalString5AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Boolean getDelayOriginalString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final BigInteger getDelayOriginalString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final URL getDelayOriginalString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING5);
    }


   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Integer getForcedAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.FORCED);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Long getForcedAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.FORCED);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final LocalDateTime getForcedAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.FORCED);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final LocalTime getForcedAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.FORCED);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final String getForcedAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.FORCED);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Boolean getForcedAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.FORCED);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final BigInteger getForcedAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.FORCED);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final URL getForcedAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.FORCED);
    }


   /**
    * Get Last **Inform** call.
    * 
    * @return Last **Inform** call.
    */
    @Nullable
    public final Integer getInformAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.INFORM);
    }

   /**
    * Get Last **Inform** call.
    * 
    * @return Last **Inform** call.
    */
    @Nullable
    public final Long getInformAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.INFORM);
    }

   /**
    * Get Last **Inform** call.
    * 
    * @return Last **Inform** call.
    */
    @Nullable
    public final LocalDateTime getInformAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.INFORM);
    }

   /**
    * Get Last **Inform** call.
    * 
    * @return Last **Inform** call.
    */
    @Nullable
    public final LocalTime getInformAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.INFORM);
    }

   /**
    * Get Last **Inform** call.
    * 
    * @return Last **Inform** call.
    */
    @Nullable
    public final String getInformAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.INFORM);
    }

   /**
    * Get Last **Inform** call.
    * 
    * @return Last **Inform** call.
    */
    @Nullable
    public final Boolean getInformAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.INFORM);
    }

   /**
    * Get Last **Inform** call.
    * 
    * @return Last **Inform** call.
    */
    @Nullable
    public final BigInteger getInformAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.INFORM);
    }

   /**
    * Get Last **Inform** call.
    * 
    * @return Last **Inform** call.
    */
    @Nullable
    public final URL getInformAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.INFORM);
    }


   /**
    * Get Source Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final Integer getSourceDurationFirstFrameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAME);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final Long getSourceDurationFirstFrameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAME);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final LocalDateTime getSourceDurationFirstFrameAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAME);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final LocalTime getSourceDurationFirstFrameAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAME);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final String getSourceDurationFirstFrameAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAME);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final Boolean getSourceDurationFirstFrameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAME);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final BigInteger getSourceDurationFirstFrameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAME);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final URL getSourceDurationFirstFrameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONFIRSTFRAME);
    }


   /**
    * Get Number of the stream (base=0).
    * 
    * @return Number of the stream (base=0).
    */
    @Nullable
    public final Integer getStreamKindIDAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.STREAMKINDID);
    }

   /**
    * Get Number of the stream (base=0).
    * 
    * @return Number of the stream (base=0).
    */
    @Nullable
    public final Long getStreamKindIDAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.STREAMKINDID);
    }

   /**
    * Get Number of the stream (base=0).
    * 
    * @return Number of the stream (base=0).
    */
    @Nullable
    public final LocalDateTime getStreamKindIDAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.STREAMKINDID);
    }

   /**
    * Get Number of the stream (base=0).
    * 
    * @return Number of the stream (base=0).
    */
    @Nullable
    public final LocalTime getStreamKindIDAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.STREAMKINDID);
    }

   /**
    * Get Number of the stream (base=0).
    * 
    * @return Number of the stream (base=0).
    */
    @Nullable
    public final String getStreamKindIDAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.STREAMKINDID);
    }

   /**
    * Get Number of the stream (base=0).
    * 
    * @return Number of the stream (base=0).
    */
    @Nullable
    public final Boolean getStreamKindIDAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.STREAMKINDID);
    }

   /**
    * Get Number of the stream (base=0).
    * 
    * @return Number of the stream (base=0).
    */
    @Nullable
    public final BigInteger getStreamKindIDAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.STREAMKINDID);
    }

   /**
    * Get Number of the stream (base=0).
    * 
    * @return Number of the stream (base=0).
    */
    @Nullable
    public final URL getStreamKindIDAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.STREAMKINDID);
    }


   /**
    * Get Nominal Frames per second (with measurement).
    * 
    * @return Nominal Frames per second (with measurement).
    */
    @Nullable
    public final Integer getFrameRateNominalStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.FRAMERATENOMINALSTRING);
    }

   /**
    * Get Nominal Frames per second (with measurement).
    * 
    * @return Nominal Frames per second (with measurement).
    */
    @Nullable
    public final Long getFrameRateNominalStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.FRAMERATENOMINALSTRING);
    }

   /**
    * Get Nominal Frames per second (with measurement).
    * 
    * @return Nominal Frames per second (with measurement).
    */
    @Nullable
    public final LocalDateTime getFrameRateNominalStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.FRAMERATENOMINALSTRING);
    }

   /**
    * Get Nominal Frames per second (with measurement).
    * 
    * @return Nominal Frames per second (with measurement).
    */
    @Nullable
    public final LocalTime getFrameRateNominalStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.FRAMERATENOMINALSTRING);
    }

   /**
    * Get Nominal Frames per second (with measurement).
    * 
    * @return Nominal Frames per second (with measurement).
    */
    @Nullable
    public final String getFrameRateNominalStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.FRAMERATENOMINALSTRING);
    }

   /**
    * Get Nominal Frames per second (with measurement).
    * 
    * @return Nominal Frames per second (with measurement).
    */
    @Nullable
    public final Boolean getFrameRateNominalStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.FRAMERATENOMINALSTRING);
    }

   /**
    * Get Nominal Frames per second (with measurement).
    * 
    * @return Nominal Frames per second (with measurement).
    */
    @Nullable
    public final BigInteger getFrameRateNominalStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.FRAMERATENOMINALSTRING);
    }

   /**
    * Get Nominal Frames per second (with measurement).
    * 
    * @return Nominal Frames per second (with measurement).
    */
    @Nullable
    public final URL getFrameRateNominalStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.FRAMERATENOMINALSTRING);
    }


   /**
    * Get Link.
    * 
    * @return Link.
    */
    @Nullable
    public final Integer getFormatUrlAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.FORMATURL);
    }

   /**
    * Get Link.
    * 
    * @return Link.
    */
    @Nullable
    public final Long getFormatUrlAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.FORMATURL);
    }

   /**
    * Get Link.
    * 
    * @return Link.
    */
    @Nullable
    public final LocalDateTime getFormatUrlAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.FORMATURL);
    }

   /**
    * Get Link.
    * 
    * @return Link.
    */
    @Nullable
    public final LocalTime getFormatUrlAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.FORMATURL);
    }

   /**
    * Get Link.
    * 
    * @return Link.
    */
    @Nullable
    public final String getFormatUrlAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.FORMATURL);
    }

   /**
    * Get Link.
    * 
    * @return Link.
    */
    @Nullable
    public final Boolean getFormatUrlAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.FORMATURL);
    }

   /**
    * Get Link.
    * 
    * @return Link.
    */
    @Nullable
    public final BigInteger getFormatUrlAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.FORMATURL);
    }

   /**
    * Get Link.
    * 
    * @return Link.
    */
    @Nullable
    public final URL getFormatUrlAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.FORMATURL);
    }


   /**
    * Get Minimum Bit rate (with measurement).
    * 
    * @return Minimum Bit rate (with measurement).
    */
    @Nullable
    public final Integer getBitRateMinimumStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.BITRATEMINIMUMSTRING);
    }

   /**
    * Get Minimum Bit rate (with measurement).
    * 
    * @return Minimum Bit rate (with measurement).
    */
    @Nullable
    public final Long getBitRateMinimumStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.BITRATEMINIMUMSTRING);
    }

   /**
    * Get Minimum Bit rate (with measurement).
    * 
    * @return Minimum Bit rate (with measurement).
    */
    @Nullable
    public final LocalDateTime getBitRateMinimumStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.BITRATEMINIMUMSTRING);
    }

   /**
    * Get Minimum Bit rate (with measurement).
    * 
    * @return Minimum Bit rate (with measurement).
    */
    @Nullable
    public final LocalTime getBitRateMinimumStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.BITRATEMINIMUMSTRING);
    }

   /**
    * Get Minimum Bit rate (with measurement).
    * 
    * @return Minimum Bit rate (with measurement).
    */
    @Nullable
    public final String getBitRateMinimumStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.BITRATEMINIMUMSTRING);
    }

   /**
    * Get Minimum Bit rate (with measurement).
    * 
    * @return Minimum Bit rate (with measurement).
    */
    @Nullable
    public final Boolean getBitRateMinimumStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.BITRATEMINIMUMSTRING);
    }

   /**
    * Get Minimum Bit rate (with measurement).
    * 
    * @return Minimum Bit rate (with measurement).
    */
    @Nullable
    public final BigInteger getBitRateMinimumStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.BITRATEMINIMUMSTRING);
    }

   /**
    * Get Minimum Bit rate (with measurement).
    * 
    * @return Minimum Bit rate (with measurement).
    */
    @Nullable
    public final URL getBitRateMinimumStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.BITRATEMINIMUMSTRING);
    }


   /**
    * Get Width.
    * 
    * @return Width.
    */
    @Nullable
    public final Integer getWidthAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.WIDTH);
    }

   /**
    * Get Width.
    * 
    * @return Width.
    */
    @Nullable
    public final Long getWidthAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.WIDTH);
    }

   /**
    * Get Width.
    * 
    * @return Width.
    */
    @Nullable
    public final LocalDateTime getWidthAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.WIDTH);
    }

   /**
    * Get Width.
    * 
    * @return Width.
    */
    @Nullable
    public final LocalTime getWidthAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.WIDTH);
    }

   /**
    * Get Width.
    * 
    * @return Width.
    */
    @Nullable
    public final String getWidthAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.WIDTH);
    }

   /**
    * Get Width.
    * 
    * @return Width.
    */
    @Nullable
    public final Boolean getWidthAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.WIDTH);
    }

   /**
    * Get Width.
    * 
    * @return Width.
    */
    @Nullable
    public final BigInteger getWidthAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.WIDTH);
    }

   /**
    * Get Width.
    * 
    * @return Width.
    */
    @Nullable
    public final URL getWidthAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.WIDTH);
    }


   /**
    * Get Frames per second (with measurement).
    * 
    * @return Frames per second (with measurement).
    */
    @Nullable
    public final Integer getFrameRateStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.FRAMERATESTRING);
    }

   /**
    * Get Frames per second (with measurement).
    * 
    * @return Frames per second (with measurement).
    */
    @Nullable
    public final Long getFrameRateStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.FRAMERATESTRING);
    }

   /**
    * Get Frames per second (with measurement).
    * 
    * @return Frames per second (with measurement).
    */
    @Nullable
    public final LocalDateTime getFrameRateStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.FRAMERATESTRING);
    }

   /**
    * Get Frames per second (with measurement).
    * 
    * @return Frames per second (with measurement).
    */
    @Nullable
    public final LocalTime getFrameRateStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.FRAMERATESTRING);
    }

   /**
    * Get Frames per second (with measurement).
    * 
    * @return Frames per second (with measurement).
    */
    @Nullable
    public final String getFrameRateStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.FRAMERATESTRING);
    }

   /**
    * Get Frames per second (with measurement).
    * 
    * @return Frames per second (with measurement).
    */
    @Nullable
    public final Boolean getFrameRateStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.FRAMERATESTRING);
    }

   /**
    * Get Frames per second (with measurement).
    * 
    * @return Frames per second (with measurement).
    */
    @Nullable
    public final BigInteger getFrameRateStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.FRAMERATESTRING);
    }

   /**
    * Get Frames per second (with measurement).
    * 
    * @return Frames per second (with measurement).
    */
    @Nullable
    public final URL getFrameRateStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.FRAMERATESTRING);
    }


   /**
    * Get Source Number of frames.
    * 
    * @return Source Number of frames.
    */
    @Nullable
    public final Integer getSourceFrameCountAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.SOURCEFRAMECOUNT);
    }

   /**
    * Get Source Number of frames.
    * 
    * @return Source Number of frames.
    */
    @Nullable
    public final Long getSourceFrameCountAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.SOURCEFRAMECOUNT);
    }

   /**
    * Get Source Number of frames.
    * 
    * @return Source Number of frames.
    */
    @Nullable
    public final LocalDateTime getSourceFrameCountAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.SOURCEFRAMECOUNT);
    }

   /**
    * Get Source Number of frames.
    * 
    * @return Source Number of frames.
    */
    @Nullable
    public final LocalTime getSourceFrameCountAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.SOURCEFRAMECOUNT);
    }

   /**
    * Get Source Number of frames.
    * 
    * @return Source Number of frames.
    */
    @Nullable
    public final String getSourceFrameCountAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.SOURCEFRAMECOUNT);
    }

   /**
    * Get Source Number of frames.
    * 
    * @return Source Number of frames.
    */
    @Nullable
    public final Boolean getSourceFrameCountAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.SOURCEFRAMECOUNT);
    }

   /**
    * Get Source Number of frames.
    * 
    * @return Source Number of frames.
    */
    @Nullable
    public final BigInteger getSourceFrameCountAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.SOURCEFRAMECOUNT);
    }

   /**
    * Get Source Number of frames.
    * 
    * @return Source Number of frames.
    */
    @Nullable
    public final URL getSourceFrameCountAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.SOURCEFRAMECOUNT);
    }


   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Integer getDefaultAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DEFAULT);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Long getDefaultAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DEFAULT);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final LocalDateTime getDefaultAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DEFAULT);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final LocalTime getDefaultAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DEFAULT);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final String getDefaultAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DEFAULT);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Boolean getDefaultAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DEFAULT);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final BigInteger getDefaultAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DEFAULT);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final URL getDefaultAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DEFAULT);
    }


   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final Integer getDelayOriginalSettingsAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final Long getDelayOriginalSettingsAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final LocalDateTime getDelayOriginalSettingsAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final LocalTime getDelayOriginalSettingsAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final String getDelayOriginalSettingsAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final Boolean getDelayOriginalSettingsAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final BigInteger getDelayOriginalSettingsAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final URL getDelayOriginalSettingsAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSETTINGS);
    }


   /**
    * Get Name of the product.
    * 
    * @return Name of the product.
    */
    @Nullable
    public final Integer getEncodedApplicationNameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATIONNAME);
    }

   /**
    * Get Name of the product.
    * 
    * @return Name of the product.
    */
    @Nullable
    public final Long getEncodedApplicationNameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATIONNAME);
    }

   /**
    * Get Name of the product.
    * 
    * @return Name of the product.
    */
    @Nullable
    public final LocalDateTime getEncodedApplicationNameAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATIONNAME);
    }

   /**
    * Get Name of the product.
    * 
    * @return Name of the product.
    */
    @Nullable
    public final LocalTime getEncodedApplicationNameAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATIONNAME);
    }

   /**
    * Get Name of the product.
    * 
    * @return Name of the product.
    */
    @Nullable
    public final String getEncodedApplicationNameAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATIONNAME);
    }

   /**
    * Get Name of the product.
    * 
    * @return Name of the product.
    */
    @Nullable
    public final Boolean getEncodedApplicationNameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATIONNAME);
    }

   /**
    * Get Name of the product.
    * 
    * @return Name of the product.
    */
    @Nullable
    public final BigInteger getEncodedApplicationNameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATIONNAME);
    }

   /**
    * Get Name of the product.
    * 
    * @return Name of the product.
    */
    @Nullable
    public final URL getEncodedApplicationNameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATIONNAME);
    }


   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final Integer getUniqueIDStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.UNIQUEIDSTRING);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final Long getUniqueIDStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.UNIQUEIDSTRING);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final LocalDateTime getUniqueIDStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.UNIQUEIDSTRING);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final LocalTime getUniqueIDStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.UNIQUEIDSTRING);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final String getUniqueIDStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.UNIQUEIDSTRING);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final Boolean getUniqueIDStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.UNIQUEIDSTRING);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final BigInteger getUniqueIDStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.UNIQUEIDSTRING);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final URL getUniqueIDStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.UNIQUEIDSTRING);
    }


   /**
    * Get Profile of the Format.
    * 
    * @return Profile of the Format.
    */
    @Nullable
    public final Integer getFormatProfileAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.FORMATPROFILE);
    }

   /**
    * Get Profile of the Format.
    * 
    * @return Profile of the Format.
    */
    @Nullable
    public final Long getFormatProfileAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.FORMATPROFILE);
    }

   /**
    * Get Profile of the Format.
    * 
    * @return Profile of the Format.
    */
    @Nullable
    public final LocalDateTime getFormatProfileAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.FORMATPROFILE);
    }

   /**
    * Get Profile of the Format.
    * 
    * @return Profile of the Format.
    */
    @Nullable
    public final LocalTime getFormatProfileAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.FORMATPROFILE);
    }

   /**
    * Get Profile of the Format.
    * 
    * @return Profile of the Format.
    */
    @Nullable
    public final String getFormatProfileAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.FORMATPROFILE);
    }

   /**
    * Get Profile of the Format.
    * 
    * @return Profile of the Format.
    */
    @Nullable
    public final Boolean getFormatProfileAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.FORMATPROFILE);
    }

   /**
    * Get Profile of the Format.
    * 
    * @return Profile of the Format.
    */
    @Nullable
    public final BigInteger getFormatProfileAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.FORMATPROFILE);
    }

   /**
    * Get Profile of the Format.
    * 
    * @return Profile of the Format.
    */
    @Nullable
    public final URL getFormatProfileAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.FORMATPROFILE);
    }


   /**
    * Get StreamSize_Encoded/String2.
    * 
    * @return StreamSize_Encoded/String2.
    */
    @Nullable
    public final Integer getStreamSizeEncodedString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING2);
    }

   /**
    * Get StreamSize_Encoded/String2.
    * 
    * @return StreamSize_Encoded/String2.
    */
    @Nullable
    public final Long getStreamSizeEncodedString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING2);
    }

   /**
    * Get StreamSize_Encoded/String2.
    * 
    * @return StreamSize_Encoded/String2.
    */
    @Nullable
    public final LocalDateTime getStreamSizeEncodedString2AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING2);
    }

   /**
    * Get StreamSize_Encoded/String2.
    * 
    * @return StreamSize_Encoded/String2.
    */
    @Nullable
    public final LocalTime getStreamSizeEncodedString2AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING2);
    }

   /**
    * Get StreamSize_Encoded/String2.
    * 
    * @return StreamSize_Encoded/String2.
    */
    @Nullable
    public final String getStreamSizeEncodedString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING2);
    }

   /**
    * Get StreamSize_Encoded/String2.
    * 
    * @return StreamSize_Encoded/String2.
    */
    @Nullable
    public final Boolean getStreamSizeEncodedString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING2);
    }

   /**
    * Get StreamSize_Encoded/String2.
    * 
    * @return StreamSize_Encoded/String2.
    */
    @Nullable
    public final BigInteger getStreamSizeEncodedString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING2);
    }

   /**
    * Get StreamSize_Encoded/String2.
    * 
    * @return StreamSize_Encoded/String2.
    */
    @Nullable
    public final URL getStreamSizeEncodedString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING2);
    }


   /**
    * Get StreamSize_Demuxed/String1.
    * 
    * @return StreamSize_Demuxed/String1.
    */
    @Nullable
    public final Integer getStreamSizeDemuxedString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING1);
    }

   /**
    * Get StreamSize_Demuxed/String1.
    * 
    * @return StreamSize_Demuxed/String1.
    */
    @Nullable
    public final Long getStreamSizeDemuxedString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING1);
    }

   /**
    * Get StreamSize_Demuxed/String1.
    * 
    * @return StreamSize_Demuxed/String1.
    */
    @Nullable
    public final LocalDateTime getStreamSizeDemuxedString1AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING1);
    }

   /**
    * Get StreamSize_Demuxed/String1.
    * 
    * @return StreamSize_Demuxed/String1.
    */
    @Nullable
    public final LocalTime getStreamSizeDemuxedString1AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING1);
    }

   /**
    * Get StreamSize_Demuxed/String1.
    * 
    * @return StreamSize_Demuxed/String1.
    */
    @Nullable
    public final String getStreamSizeDemuxedString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING1);
    }

   /**
    * Get StreamSize_Demuxed/String1.
    * 
    * @return StreamSize_Demuxed/String1.
    */
    @Nullable
    public final Boolean getStreamSizeDemuxedString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING1);
    }

   /**
    * Get StreamSize_Demuxed/String1.
    * 
    * @return StreamSize_Demuxed/String1.
    */
    @Nullable
    public final BigInteger getStreamSizeDemuxedString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING1);
    }

   /**
    * Get StreamSize_Demuxed/String1.
    * 
    * @return StreamSize_Demuxed/String1.
    */
    @Nullable
    public final URL getStreamSizeDemuxedString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING1);
    }


   /**
    * Get StreamSize_Encoded/String3.
    * 
    * @return StreamSize_Encoded/String3.
    */
    @Nullable
    public final Integer getStreamSizeEncodedString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING3);
    }

   /**
    * Get StreamSize_Encoded/String3.
    * 
    * @return StreamSize_Encoded/String3.
    */
    @Nullable
    public final Long getStreamSizeEncodedString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING3);
    }

   /**
    * Get StreamSize_Encoded/String3.
    * 
    * @return StreamSize_Encoded/String3.
    */
    @Nullable
    public final LocalDateTime getStreamSizeEncodedString3AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING3);
    }

   /**
    * Get StreamSize_Encoded/String3.
    * 
    * @return StreamSize_Encoded/String3.
    */
    @Nullable
    public final LocalTime getStreamSizeEncodedString3AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING3);
    }

   /**
    * Get StreamSize_Encoded/String3.
    * 
    * @return StreamSize_Encoded/String3.
    */
    @Nullable
    public final String getStreamSizeEncodedString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING3);
    }

   /**
    * Get StreamSize_Encoded/String3.
    * 
    * @return StreamSize_Encoded/String3.
    */
    @Nullable
    public final Boolean getStreamSizeEncodedString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING3);
    }

   /**
    * Get StreamSize_Encoded/String3.
    * 
    * @return StreamSize_Encoded/String3.
    */
    @Nullable
    public final BigInteger getStreamSizeEncodedString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING3);
    }

   /**
    * Get StreamSize_Encoded/String3.
    * 
    * @return StreamSize_Encoded/String3.
    */
    @Nullable
    public final URL getStreamSizeEncodedString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING3);
    }


   /**
    * Get StreamSize_Demuxed/String2.
    * 
    * @return StreamSize_Demuxed/String2.
    */
    @Nullable
    public final Integer getStreamSizeDemuxedString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING2);
    }

   /**
    * Get StreamSize_Demuxed/String2.
    * 
    * @return StreamSize_Demuxed/String2.
    */
    @Nullable
    public final Long getStreamSizeDemuxedString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING2);
    }

   /**
    * Get StreamSize_Demuxed/String2.
    * 
    * @return StreamSize_Demuxed/String2.
    */
    @Nullable
    public final LocalDateTime getStreamSizeDemuxedString2AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING2);
    }

   /**
    * Get StreamSize_Demuxed/String2.
    * 
    * @return StreamSize_Demuxed/String2.
    */
    @Nullable
    public final LocalTime getStreamSizeDemuxedString2AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING2);
    }

   /**
    * Get StreamSize_Demuxed/String2.
    * 
    * @return StreamSize_Demuxed/String2.
    */
    @Nullable
    public final String getStreamSizeDemuxedString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING2);
    }

   /**
    * Get StreamSize_Demuxed/String2.
    * 
    * @return StreamSize_Demuxed/String2.
    */
    @Nullable
    public final Boolean getStreamSizeDemuxedString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING2);
    }

   /**
    * Get StreamSize_Demuxed/String2.
    * 
    * @return StreamSize_Demuxed/String2.
    */
    @Nullable
    public final BigInteger getStreamSizeDemuxedString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING2);
    }

   /**
    * Get StreamSize_Demuxed/String2.
    * 
    * @return StreamSize_Demuxed/String2.
    */
    @Nullable
    public final URL getStreamSizeDemuxedString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING2);
    }


   /**
    * Get StreamSize_Demuxed/String3.
    * 
    * @return StreamSize_Demuxed/String3.
    */
    @Nullable
    public final Integer getStreamSizeDemuxedString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING3);
    }

   /**
    * Get StreamSize_Demuxed/String3.
    * 
    * @return StreamSize_Demuxed/String3.
    */
    @Nullable
    public final Long getStreamSizeDemuxedString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING3);
    }

   /**
    * Get StreamSize_Demuxed/String3.
    * 
    * @return StreamSize_Demuxed/String3.
    */
    @Nullable
    public final LocalDateTime getStreamSizeDemuxedString3AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING3);
    }

   /**
    * Get StreamSize_Demuxed/String3.
    * 
    * @return StreamSize_Demuxed/String3.
    */
    @Nullable
    public final LocalTime getStreamSizeDemuxedString3AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING3);
    }

   /**
    * Get StreamSize_Demuxed/String3.
    * 
    * @return StreamSize_Demuxed/String3.
    */
    @Nullable
    public final String getStreamSizeDemuxedString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING3);
    }

   /**
    * Get StreamSize_Demuxed/String3.
    * 
    * @return StreamSize_Demuxed/String3.
    */
    @Nullable
    public final Boolean getStreamSizeDemuxedString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING3);
    }

   /**
    * Get StreamSize_Demuxed/String3.
    * 
    * @return StreamSize_Demuxed/String3.
    */
    @Nullable
    public final BigInteger getStreamSizeDemuxedString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING3);
    }

   /**
    * Get StreamSize_Demuxed/String3.
    * 
    * @return StreamSize_Demuxed/String3.
    */
    @Nullable
    public final URL getStreamSizeDemuxedString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING3);
    }


   /**
    * Get StreamSize_Encoded/String1.
    * 
    * @return StreamSize_Encoded/String1.
    */
    @Nullable
    public final Integer getStreamSizeEncodedString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING1);
    }

   /**
    * Get StreamSize_Encoded/String1.
    * 
    * @return StreamSize_Encoded/String1.
    */
    @Nullable
    public final Long getStreamSizeEncodedString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING1);
    }

   /**
    * Get StreamSize_Encoded/String1.
    * 
    * @return StreamSize_Encoded/String1.
    */
    @Nullable
    public final LocalDateTime getStreamSizeEncodedString1AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING1);
    }

   /**
    * Get StreamSize_Encoded/String1.
    * 
    * @return StreamSize_Encoded/String1.
    */
    @Nullable
    public final LocalTime getStreamSizeEncodedString1AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING1);
    }

   /**
    * Get StreamSize_Encoded/String1.
    * 
    * @return StreamSize_Encoded/String1.
    */
    @Nullable
    public final String getStreamSizeEncodedString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING1);
    }

   /**
    * Get StreamSize_Encoded/String1.
    * 
    * @return StreamSize_Encoded/String1.
    */
    @Nullable
    public final Boolean getStreamSizeEncodedString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING1);
    }

   /**
    * Get StreamSize_Encoded/String1.
    * 
    * @return StreamSize_Encoded/String1.
    */
    @Nullable
    public final BigInteger getStreamSizeEncodedString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING1);
    }

   /**
    * Get StreamSize_Encoded/String1.
    * 
    * @return StreamSize_Encoded/String1.
    */
    @Nullable
    public final URL getStreamSizeEncodedString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING1);
    }


   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final Integer getLanguageStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.LANGUAGESTRING);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final Long getLanguageStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.LANGUAGESTRING);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final LocalDateTime getLanguageStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.LANGUAGESTRING);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final LocalTime getLanguageStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.LANGUAGESTRING);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final String getLanguageStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.LANGUAGESTRING);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final Boolean getLanguageStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.LANGUAGESTRING);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final BigInteger getLanguageStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.LANGUAGESTRING);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final URL getLanguageStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.LANGUAGESTRING);
    }


   /**
    * Get StreamSize_Demuxed/String4.
    * 
    * @return StreamSize_Demuxed/String4.
    */
    @Nullable
    public final Integer getStreamSizeDemuxedString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING4);
    }

   /**
    * Get StreamSize_Demuxed/String4.
    * 
    * @return StreamSize_Demuxed/String4.
    */
    @Nullable
    public final Long getStreamSizeDemuxedString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING4);
    }

   /**
    * Get StreamSize_Demuxed/String4.
    * 
    * @return StreamSize_Demuxed/String4.
    */
    @Nullable
    public final LocalDateTime getStreamSizeDemuxedString4AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING4);
    }

   /**
    * Get StreamSize_Demuxed/String4.
    * 
    * @return StreamSize_Demuxed/String4.
    */
    @Nullable
    public final LocalTime getStreamSizeDemuxedString4AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING4);
    }

   /**
    * Get StreamSize_Demuxed/String4.
    * 
    * @return StreamSize_Demuxed/String4.
    */
    @Nullable
    public final String getStreamSizeDemuxedString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING4);
    }

   /**
    * Get StreamSize_Demuxed/String4.
    * 
    * @return StreamSize_Demuxed/String4.
    */
    @Nullable
    public final Boolean getStreamSizeDemuxedString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING4);
    }

   /**
    * Get StreamSize_Demuxed/String4.
    * 
    * @return StreamSize_Demuxed/String4.
    */
    @Nullable
    public final BigInteger getStreamSizeDemuxedString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING4);
    }

   /**
    * Get StreamSize_Demuxed/String4.
    * 
    * @return StreamSize_Demuxed/String4.
    */
    @Nullable
    public final URL getStreamSizeDemuxedString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING4);
    }


   /**
    * Get StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    * 
    * @return StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    */
    @Nullable
    public final Integer getStreamSizeDemuxedString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING5);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    * 
    * @return StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    */
    @Nullable
    public final Long getStreamSizeDemuxedString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING5);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    * 
    * @return StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    */
    @Nullable
    public final LocalDateTime getStreamSizeDemuxedString5AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING5);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    * 
    * @return StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    */
    @Nullable
    public final LocalTime getStreamSizeDemuxedString5AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING5);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    * 
    * @return StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    */
    @Nullable
    public final String getStreamSizeDemuxedString5AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING5);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    * 
    * @return StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    */
    @Nullable
    public final Boolean getStreamSizeDemuxedString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING5);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    * 
    * @return StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    */
    @Nullable
    public final BigInteger getStreamSizeDemuxedString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING5);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    * 
    * @return StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    */
    @Nullable
    public final URL getStreamSizeDemuxedString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING5);
    }


   /**
    * Get StreamSize_Encoded/String4.
    * 
    * @return StreamSize_Encoded/String4.
    */
    @Nullable
    public final Integer getStreamSizeEncodedString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING4);
    }

   /**
    * Get StreamSize_Encoded/String4.
    * 
    * @return StreamSize_Encoded/String4.
    */
    @Nullable
    public final Long getStreamSizeEncodedString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING4);
    }

   /**
    * Get StreamSize_Encoded/String4.
    * 
    * @return StreamSize_Encoded/String4.
    */
    @Nullable
    public final LocalDateTime getStreamSizeEncodedString4AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING4);
    }

   /**
    * Get StreamSize_Encoded/String4.
    * 
    * @return StreamSize_Encoded/String4.
    */
    @Nullable
    public final LocalTime getStreamSizeEncodedString4AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING4);
    }

   /**
    * Get StreamSize_Encoded/String4.
    * 
    * @return StreamSize_Encoded/String4.
    */
    @Nullable
    public final String getStreamSizeEncodedString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING4);
    }

   /**
    * Get StreamSize_Encoded/String4.
    * 
    * @return StreamSize_Encoded/String4.
    */
    @Nullable
    public final Boolean getStreamSizeEncodedString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING4);
    }

   /**
    * Get StreamSize_Encoded/String4.
    * 
    * @return StreamSize_Encoded/String4.
    */
    @Nullable
    public final BigInteger getStreamSizeEncodedString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING4);
    }

   /**
    * Get StreamSize_Encoded/String4.
    * 
    * @return StreamSize_Encoded/String4.
    */
    @Nullable
    public final URL getStreamSizeEncodedString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING4);
    }


   /**
    * Get Original (in the raw stream) Frames per second (with measurement).
    * 
    * @return Original (in the raw stream) Frames per second (with measurement).
    */
    @Nullable
    public final Integer getFrameRateOriginalStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.FRAMERATEORIGINALSTRING);
    }

   /**
    * Get Original (in the raw stream) Frames per second (with measurement).
    * 
    * @return Original (in the raw stream) Frames per second (with measurement).
    */
    @Nullable
    public final Long getFrameRateOriginalStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.FRAMERATEORIGINALSTRING);
    }

   /**
    * Get Original (in the raw stream) Frames per second (with measurement).
    * 
    * @return Original (in the raw stream) Frames per second (with measurement).
    */
    @Nullable
    public final LocalDateTime getFrameRateOriginalStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.FRAMERATEORIGINALSTRING);
    }

   /**
    * Get Original (in the raw stream) Frames per second (with measurement).
    * 
    * @return Original (in the raw stream) Frames per second (with measurement).
    */
    @Nullable
    public final LocalTime getFrameRateOriginalStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.FRAMERATEORIGINALSTRING);
    }

   /**
    * Get Original (in the raw stream) Frames per second (with measurement).
    * 
    * @return Original (in the raw stream) Frames per second (with measurement).
    */
    @Nullable
    public final String getFrameRateOriginalStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.FRAMERATEORIGINALSTRING);
    }

   /**
    * Get Original (in the raw stream) Frames per second (with measurement).
    * 
    * @return Original (in the raw stream) Frames per second (with measurement).
    */
    @Nullable
    public final Boolean getFrameRateOriginalStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.FRAMERATEORIGINALSTRING);
    }

   /**
    * Get Original (in the raw stream) Frames per second (with measurement).
    * 
    * @return Original (in the raw stream) Frames per second (with measurement).
    */
    @Nullable
    public final BigInteger getFrameRateOriginalStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.FRAMERATEORIGINALSTRING);
    }

   /**
    * Get Original (in the raw stream) Frames per second (with measurement).
    * 
    * @return Original (in the raw stream) Frames per second (with measurement).
    */
    @Nullable
    public final URL getFrameRateOriginalStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.FRAMERATEORIGINALSTRING);
    }


   /**
    * Get Number of displayed elements.
    * 
    * @return Number of displayed elements.
    */
    @Nullable
    public final Integer getElementCountAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.ELEMENTCOUNT);
    }

   /**
    * Get Number of displayed elements.
    * 
    * @return Number of displayed elements.
    */
    @Nullable
    public final Long getElementCountAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.ELEMENTCOUNT);
    }

   /**
    * Get Number of displayed elements.
    * 
    * @return Number of displayed elements.
    */
    @Nullable
    public final LocalDateTime getElementCountAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.ELEMENTCOUNT);
    }

   /**
    * Get Number of displayed elements.
    * 
    * @return Number of displayed elements.
    */
    @Nullable
    public final LocalTime getElementCountAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.ELEMENTCOUNT);
    }

   /**
    * Get Number of displayed elements.
    * 
    * @return Number of displayed elements.
    */
    @Nullable
    public final String getElementCountAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.ELEMENTCOUNT);
    }

   /**
    * Get Number of displayed elements.
    * 
    * @return Number of displayed elements.
    */
    @Nullable
    public final Boolean getElementCountAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.ELEMENTCOUNT);
    }

   /**
    * Get Number of displayed elements.
    * 
    * @return Number of displayed elements.
    */
    @Nullable
    public final BigInteger getElementCountAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.ELEMENTCOUNT);
    }

   /**
    * Get Number of displayed elements.
    * 
    * @return Number of displayed elements.
    */
    @Nullable
    public final URL getElementCountAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.ELEMENTCOUNT);
    }


   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final Integer getStreamSizeEncodedString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING5);
    }

   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final Long getStreamSizeEncodedString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING5);
    }

   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final LocalDateTime getStreamSizeEncodedString5AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING5);
    }

   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final LocalTime getStreamSizeEncodedString5AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING5);
    }

   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final String getStreamSizeEncodedString5AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING5);
    }

   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final Boolean getStreamSizeEncodedString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING5);
    }

   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final BigInteger getStreamSizeEncodedString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING5);
    }

   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final URL getStreamSizeEncodedString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING5);
    }


   /**
    * Get Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Integer getDurationLastFrameString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING5);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Long getDurationLastFrameString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING5);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalDateTime getDurationLastFrameString5AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING5);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalTime getDurationLastFrameString5AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING5);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final String getDurationLastFrameString5AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING5);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Boolean getDurationLastFrameString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING5);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final BigInteger getDurationLastFrameString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING5);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final URL getDurationLastFrameString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING5);
    }


   /**
    * Get Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Integer getDurationLastFrameString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING4);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Long getDurationLastFrameString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING4);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalDateTime getDurationLastFrameString4AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING4);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalTime getDurationLastFrameString4AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING4);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final String getDurationLastFrameString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING4);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Boolean getDurationLastFrameString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING4);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final BigInteger getDurationLastFrameString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING4);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final URL getDurationLastFrameString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING4);
    }


   /**
    * Get StreamSize_Demuxed in with percentage value.
    * 
    * @return StreamSize_Demuxed in with percentage value.
    */
    @Nullable
    public final Integer getStreamSizeDemuxedStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value.
    * 
    * @return StreamSize_Demuxed in with percentage value.
    */
    @Nullable
    public final Long getStreamSizeDemuxedStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value.
    * 
    * @return StreamSize_Demuxed in with percentage value.
    */
    @Nullable
    public final LocalDateTime getStreamSizeDemuxedStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value.
    * 
    * @return StreamSize_Demuxed in with percentage value.
    */
    @Nullable
    public final LocalTime getStreamSizeDemuxedStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value.
    * 
    * @return StreamSize_Demuxed in with percentage value.
    */
    @Nullable
    public final String getStreamSizeDemuxedStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value.
    * 
    * @return StreamSize_Demuxed in with percentage value.
    */
    @Nullable
    public final Boolean getStreamSizeDemuxedStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value.
    * 
    * @return StreamSize_Demuxed in with percentage value.
    */
    @Nullable
    public final BigInteger getStreamSizeDemuxedStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value.
    * 
    * @return StreamSize_Demuxed in with percentage value.
    */
    @Nullable
    public final URL getStreamSizeDemuxedStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXEDSTRING);
    }


   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Integer getForcedStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.FORCEDSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Long getForcedStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.FORCEDSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final LocalDateTime getForcedStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.FORCEDSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final LocalTime getForcedStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.FORCEDSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final String getForcedStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.FORCEDSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Boolean getForcedStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.FORCEDSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final BigInteger getForcedStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.FORCEDSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final URL getForcedStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.FORCEDSTRING);
    }


   /**
    * Get BitDepth.
    * 
    * @return BitDepth.
    */
    @Nullable
    public final Integer getBitDepthAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.BITDEPTH);
    }

   /**
    * Get BitDepth.
    * 
    * @return BitDepth.
    */
    @Nullable
    public final Long getBitDepthAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.BITDEPTH);
    }

   /**
    * Get BitDepth.
    * 
    * @return BitDepth.
    */
    @Nullable
    public final LocalDateTime getBitDepthAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.BITDEPTH);
    }

   /**
    * Get BitDepth.
    * 
    * @return BitDepth.
    */
    @Nullable
    public final LocalTime getBitDepthAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.BITDEPTH);
    }

   /**
    * Get BitDepth.
    * 
    * @return BitDepth.
    */
    @Nullable
    public final String getBitDepthAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.BITDEPTH);
    }

   /**
    * Get BitDepth.
    * 
    * @return BitDepth.
    */
    @Nullable
    public final Boolean getBitDepthAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.BITDEPTH);
    }

   /**
    * Get BitDepth.
    * 
    * @return BitDepth.
    */
    @Nullable
    public final BigInteger getBitDepthAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.BITDEPTH);
    }

   /**
    * Get BitDepth.
    * 
    * @return BitDepth.
    */
    @Nullable
    public final URL getBitDepthAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.BITDEPTH);
    }


   /**
    * Get Encoded Streamsize in bytes.
    * 
    * @return Encoded Streamsize in bytes.
    */
    @Nullable
    public final Integer getStreamSizeEncodedAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODED);
    }

   /**
    * Get Encoded Streamsize in bytes.
    * 
    * @return Encoded Streamsize in bytes.
    */
    @Nullable
    public final Long getStreamSizeEncodedAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODED);
    }

   /**
    * Get Encoded Streamsize in bytes.
    * 
    * @return Encoded Streamsize in bytes.
    */
    @Nullable
    public final LocalDateTime getStreamSizeEncodedAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODED);
    }

   /**
    * Get Encoded Streamsize in bytes.
    * 
    * @return Encoded Streamsize in bytes.
    */
    @Nullable
    public final LocalTime getStreamSizeEncodedAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODED);
    }

   /**
    * Get Encoded Streamsize in bytes.
    * 
    * @return Encoded Streamsize in bytes.
    */
    @Nullable
    public final String getStreamSizeEncodedAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODED);
    }

   /**
    * Get Encoded Streamsize in bytes.
    * 
    * @return Encoded Streamsize in bytes.
    */
    @Nullable
    public final Boolean getStreamSizeEncodedAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODED);
    }

   /**
    * Get Encoded Streamsize in bytes.
    * 
    * @return Encoded Streamsize in bytes.
    */
    @Nullable
    public final BigInteger getStreamSizeEncodedAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODED);
    }

   /**
    * Get Encoded Streamsize in bytes.
    * 
    * @return Encoded Streamsize in bytes.
    */
    @Nullable
    public final URL getStreamSizeEncodedAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODED);
    }


   /**
    * Get Count of streams of that kind available.
    * 
    * @return Count of streams of that kind available.
    */
    @Nullable
    public final Integer getStreamCountAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.STREAMCOUNT);
    }

   /**
    * Get Count of streams of that kind available.
    * 
    * @return Count of streams of that kind available.
    */
    @Nullable
    public final Long getStreamCountAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.STREAMCOUNT);
    }

   /**
    * Get Count of streams of that kind available.
    * 
    * @return Count of streams of that kind available.
    */
    @Nullable
    public final LocalDateTime getStreamCountAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.STREAMCOUNT);
    }

   /**
    * Get Count of streams of that kind available.
    * 
    * @return Count of streams of that kind available.
    */
    @Nullable
    public final LocalTime getStreamCountAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.STREAMCOUNT);
    }

   /**
    * Get Count of streams of that kind available.
    * 
    * @return Count of streams of that kind available.
    */
    @Nullable
    public final String getStreamCountAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.STREAMCOUNT);
    }

   /**
    * Get Count of streams of that kind available.
    * 
    * @return Count of streams of that kind available.
    */
    @Nullable
    public final Boolean getStreamCountAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.STREAMCOUNT);
    }

   /**
    * Get Count of streams of that kind available.
    * 
    * @return Count of streams of that kind available.
    */
    @Nullable
    public final BigInteger getStreamCountAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.STREAMCOUNT);
    }

   /**
    * Get Count of streams of that kind available.
    * 
    * @return Count of streams of that kind available.
    */
    @Nullable
    public final URL getStreamCountAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.STREAMCOUNT);
    }


   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final Integer getStreamSizeEncodedStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING);
    }

   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final Long getStreamSizeEncodedStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING);
    }

   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final LocalDateTime getStreamSizeEncodedStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING);
    }

   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final LocalTime getStreamSizeEncodedStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING);
    }

   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final String getStreamSizeEncodedStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING);
    }

   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final Boolean getStreamSizeEncodedStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING);
    }

   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final BigInteger getStreamSizeEncodedStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING);
    }

   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final URL getStreamSizeEncodedStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEENCODEDSTRING);
    }


   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Integer getDurationString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING2);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Long getDurationString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING2);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalDateTime getDurationString2AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING2);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalTime getDurationString2AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING2);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final String getDurationString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING2);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Boolean getDurationString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING2);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final BigInteger getDurationString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING2);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final URL getDurationString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING2);
    }


   /**
    * Get Play time in format : HH:MM:SS.MMM.
    * 
    * @return Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Integer getDurationString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING3);
    }

   /**
    * Get Play time in format : HH:MM:SS.MMM.
    * 
    * @return Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Long getDurationString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING3);
    }

   /**
    * Get Play time in format : HH:MM:SS.MMM.
    * 
    * @return Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalDateTime getDurationString3AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING3);
    }

   /**
    * Get Play time in format : HH:MM:SS.MMM.
    * 
    * @return Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalTime getDurationString3AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING3);
    }

   /**
    * Get Play time in format : HH:MM:SS.MMM.
    * 
    * @return Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final String getDurationString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING3);
    }

   /**
    * Get Play time in format : HH:MM:SS.MMM.
    * 
    * @return Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Boolean getDurationString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING3);
    }

   /**
    * Get Play time in format : HH:MM:SS.MMM.
    * 
    * @return Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final BigInteger getDurationString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING3);
    }

   /**
    * Get Play time in format : HH:MM:SS.MMM.
    * 
    * @return Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final URL getDurationString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING3);
    }


   /**
    * Get Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Integer getDurationString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING1);
    }

   /**
    * Get Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Long getDurationString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING1);
    }

   /**
    * Get Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final LocalDateTime getDurationString1AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING1);
    }

   /**
    * Get Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final LocalTime getDurationString1AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING1);
    }

   /**
    * Get Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final String getDurationString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING1);
    }

   /**
    * Get Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Boolean getDurationString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING1);
    }

   /**
    * Get Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final BigInteger getDurationString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING1);
    }

   /**
    * Get Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final URL getDurationString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING1);
    }


   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Integer getDurationString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Long getDurationString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalDateTime getDurationString4AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalTime getDurationString4AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final String getDurationString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Boolean getDurationString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final BigInteger getDurationString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final URL getDurationString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING4);
    }


   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Integer getDurationString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Long getDurationString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalDateTime getDurationString5AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalTime getDurationString5AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final String getDurationString5AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Boolean getDurationString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final BigInteger getDurationString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final URL getDurationString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DURATIONSTRING5);
    }


   /**
    * Get Encoded (with forced padding) bit rate in bps, if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate in bps, if some container padding is present.
    */
    @Nullable
    public final Integer getBitRateEncodedAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.BITRATEENCODED);
    }

   /**
    * Get Encoded (with forced padding) bit rate in bps, if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate in bps, if some container padding is present.
    */
    @Nullable
    public final Long getBitRateEncodedAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.BITRATEENCODED);
    }

   /**
    * Get Encoded (with forced padding) bit rate in bps, if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate in bps, if some container padding is present.
    */
    @Nullable
    public final LocalDateTime getBitRateEncodedAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.BITRATEENCODED);
    }

   /**
    * Get Encoded (with forced padding) bit rate in bps, if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate in bps, if some container padding is present.
    */
    @Nullable
    public final LocalTime getBitRateEncodedAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.BITRATEENCODED);
    }

   /**
    * Get Encoded (with forced padding) bit rate in bps, if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate in bps, if some container padding is present.
    */
    @Nullable
    public final String getBitRateEncodedAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.BITRATEENCODED);
    }

   /**
    * Get Encoded (with forced padding) bit rate in bps, if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate in bps, if some container padding is present.
    */
    @Nullable
    public final Boolean getBitRateEncodedAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.BITRATEENCODED);
    }

   /**
    * Get Encoded (with forced padding) bit rate in bps, if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate in bps, if some container padding is present.
    */
    @Nullable
    public final BigInteger getBitRateEncodedAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.BITRATEENCODED);
    }

   /**
    * Get Encoded (with forced padding) bit rate in bps, if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate in bps, if some container padding is present.
    */
    @Nullable
    public final URL getBitRateEncodedAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.BITRATEENCODED);
    }


   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final Integer getDelaySourceAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DELAYSOURCE);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final Long getDelaySourceAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DELAYSOURCE);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final LocalDateTime getDelaySourceAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DELAYSOURCE);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final LocalTime getDelaySourceAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DELAYSOURCE);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final String getDelaySourceAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DELAYSOURCE);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final Boolean getDelaySourceAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DELAYSOURCE);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final BigInteger getDelaySourceAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DELAYSOURCE);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final URL getDelaySourceAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DELAYSOURCE);
    }


   /**
    * Get Delay drop frame info.
    * 
    * @return Delay drop frame info.
    */
    @Nullable
    public final Integer getDelayOriginalDropFrameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALDROPFRAME);
    }

   /**
    * Get Delay drop frame info.
    * 
    * @return Delay drop frame info.
    */
    @Nullable
    public final Long getDelayOriginalDropFrameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALDROPFRAME);
    }

   /**
    * Get Delay drop frame info.
    * 
    * @return Delay drop frame info.
    */
    @Nullable
    public final LocalDateTime getDelayOriginalDropFrameAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALDROPFRAME);
    }

   /**
    * Get Delay drop frame info.
    * 
    * @return Delay drop frame info.
    */
    @Nullable
    public final LocalTime getDelayOriginalDropFrameAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALDROPFRAME);
    }

   /**
    * Get Delay drop frame info.
    * 
    * @return Delay drop frame info.
    */
    @Nullable
    public final String getDelayOriginalDropFrameAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALDROPFRAME);
    }

   /**
    * Get Delay drop frame info.
    * 
    * @return Delay drop frame info.
    */
    @Nullable
    public final Boolean getDelayOriginalDropFrameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALDROPFRAME);
    }

   /**
    * Get Delay drop frame info.
    * 
    * @return Delay drop frame info.
    */
    @Nullable
    public final BigInteger getDelayOriginalDropFrameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALDROPFRAME);
    }

   /**
    * Get Delay drop frame info.
    * 
    * @return Delay drop frame info.
    */
    @Nullable
    public final URL getDelayOriginalDropFrameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALDROPFRAME);
    }


   /**
    * Get Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Integer getDurationLastFrameString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING1);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Long getDurationLastFrameString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING1);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final LocalDateTime getDurationLastFrameString1AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING1);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final LocalTime getDurationLastFrameString1AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING1);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final String getDurationLastFrameString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING1);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Boolean getDurationLastFrameString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING1);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final BigInteger getDurationLastFrameString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING1);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final URL getDurationLastFrameString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING1);
    }


   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Integer getDelayOriginalStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Long getDelayOriginalStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final LocalDateTime getDelayOriginalStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final LocalTime getDelayOriginalStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final String getDelayOriginalStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Boolean getDelayOriginalStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final BigInteger getDelayOriginalStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final URL getDelayOriginalStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DELAYORIGINALSTRING);
    }


   /**
    * Get Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Integer getDurationLastFrameString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING3);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Long getDurationLastFrameString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING3);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalDateTime getDurationLastFrameString3AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING3);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalTime getDurationLastFrameString3AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING3);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final String getDurationLastFrameString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING3);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Boolean getDurationLastFrameString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING3);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final BigInteger getDurationLastFrameString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING3);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final URL getDurationLastFrameString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING3);
    }


   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Integer getDurationLastFrameString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING2);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Long getDurationLastFrameString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING2);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalDateTime getDurationLastFrameString2AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING2);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalTime getDurationLastFrameString2AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING2);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final String getDurationLastFrameString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING2);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Boolean getDurationLastFrameString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING2);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final BigInteger getDurationLastFrameString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING2);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final URL getDurationLastFrameString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DURATIONLASTFRAMESTRING2);
    }


   /**
    * Get StreamSize in bytes of hte stream after demux.
    * 
    * @return StreamSize in bytes of hte stream after demux.
    */
    @Nullable
    public final Integer getStreamSizeDemuxedAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXED);
    }

   /**
    * Get StreamSize in bytes of hte stream after demux.
    * 
    * @return StreamSize in bytes of hte stream after demux.
    */
    @Nullable
    public final Long getStreamSizeDemuxedAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXED);
    }

   /**
    * Get StreamSize in bytes of hte stream after demux.
    * 
    * @return StreamSize in bytes of hte stream after demux.
    */
    @Nullable
    public final LocalDateTime getStreamSizeDemuxedAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXED);
    }

   /**
    * Get StreamSize in bytes of hte stream after demux.
    * 
    * @return StreamSize in bytes of hte stream after demux.
    */
    @Nullable
    public final LocalTime getStreamSizeDemuxedAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXED);
    }

   /**
    * Get StreamSize in bytes of hte stream after demux.
    * 
    * @return StreamSize in bytes of hte stream after demux.
    */
    @Nullable
    public final String getStreamSizeDemuxedAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXED);
    }

   /**
    * Get StreamSize in bytes of hte stream after demux.
    * 
    * @return StreamSize in bytes of hte stream after demux.
    */
    @Nullable
    public final Boolean getStreamSizeDemuxedAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXED);
    }

   /**
    * Get StreamSize in bytes of hte stream after demux.
    * 
    * @return StreamSize in bytes of hte stream after demux.
    */
    @Nullable
    public final BigInteger getStreamSizeDemuxedAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXED);
    }

   /**
    * Get StreamSize in bytes of hte stream after demux.
    * 
    * @return StreamSize in bytes of hte stream after demux.
    */
    @Nullable
    public final URL getStreamSizeDemuxedAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.STREAMSIZEDEMUXED);
    }


   /**
    * Get Settings needed for decoder used.
    * 
    * @return Settings needed for decoder used.
    */
    @Nullable
    public final Integer getFormatSettingsAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.FORMATSETTINGS);
    }

   /**
    * Get Settings needed for decoder used.
    * 
    * @return Settings needed for decoder used.
    */
    @Nullable
    public final Long getFormatSettingsAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.FORMATSETTINGS);
    }

   /**
    * Get Settings needed for decoder used.
    * 
    * @return Settings needed for decoder used.
    */
    @Nullable
    public final LocalDateTime getFormatSettingsAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.FORMATSETTINGS);
    }

   /**
    * Get Settings needed for decoder used.
    * 
    * @return Settings needed for decoder used.
    */
    @Nullable
    public final LocalTime getFormatSettingsAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.FORMATSETTINGS);
    }

   /**
    * Get Settings needed for decoder used.
    * 
    * @return Settings needed for decoder used.
    */
    @Nullable
    public final String getFormatSettingsAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.FORMATSETTINGS);
    }

   /**
    * Get Settings needed for decoder used.
    * 
    * @return Settings needed for decoder used.
    */
    @Nullable
    public final Boolean getFormatSettingsAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.FORMATSETTINGS);
    }

   /**
    * Get Settings needed for decoder used.
    * 
    * @return Settings needed for decoder used.
    */
    @Nullable
    public final BigInteger getFormatSettingsAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.FORMATSETTINGS);
    }

   /**
    * Get Settings needed for decoder used.
    * 
    * @return Settings needed for decoder used.
    */
    @Nullable
    public final URL getFormatSettingsAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.FORMATSETTINGS);
    }


   /**
    * Get Service kind, e.g. visually impaired, commentary, voice over.
    * 
    * @return Service kind, e.g. visually impaired, commentary, voice over.
    */
    @Nullable
    public final Integer getServiceKindAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.SERVICEKIND);
    }

   /**
    * Get Service kind, e.g. visually impaired, commentary, voice over.
    * 
    * @return Service kind, e.g. visually impaired, commentary, voice over.
    */
    @Nullable
    public final Long getServiceKindAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.SERVICEKIND);
    }

   /**
    * Get Service kind, e.g. visually impaired, commentary, voice over.
    * 
    * @return Service kind, e.g. visually impaired, commentary, voice over.
    */
    @Nullable
    public final LocalDateTime getServiceKindAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.SERVICEKIND);
    }

   /**
    * Get Service kind, e.g. visually impaired, commentary, voice over.
    * 
    * @return Service kind, e.g. visually impaired, commentary, voice over.
    */
    @Nullable
    public final LocalTime getServiceKindAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.SERVICEKIND);
    }

   /**
    * Get Service kind, e.g. visually impaired, commentary, voice over.
    * 
    * @return Service kind, e.g. visually impaired, commentary, voice over.
    */
    @Nullable
    public final String getServiceKindAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.SERVICEKIND);
    }

   /**
    * Get Service kind, e.g. visually impaired, commentary, voice over.
    * 
    * @return Service kind, e.g. visually impaired, commentary, voice over.
    */
    @Nullable
    public final Boolean getServiceKindAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.SERVICEKIND);
    }

   /**
    * Get Service kind, e.g. visually impaired, commentary, voice over.
    * 
    * @return Service kind, e.g. visually impaired, commentary, voice over.
    */
    @Nullable
    public final BigInteger getServiceKindAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.SERVICEKIND);
    }

   /**
    * Get Service kind, e.g. visually impaired, commentary, voice over.
    * 
    * @return Service kind, e.g. visually impaired, commentary, voice over.
    */
    @Nullable
    public final URL getServiceKindAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.SERVICEKIND);
    }


   /**
    * Get Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    * 
    * @return Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final Integer getFirstPacketOrderAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.FIRSTPACKETORDER);
    }

   /**
    * Get Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    * 
    * @return Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final Long getFirstPacketOrderAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.FIRSTPACKETORDER);
    }

   /**
    * Get Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    * 
    * @return Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final LocalDateTime getFirstPacketOrderAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.FIRSTPACKETORDER);
    }

   /**
    * Get Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    * 
    * @return Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final LocalTime getFirstPacketOrderAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.FIRSTPACKETORDER);
    }

   /**
    * Get Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    * 
    * @return Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final String getFirstPacketOrderAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.FIRSTPACKETORDER);
    }

   /**
    * Get Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    * 
    * @return Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final Boolean getFirstPacketOrderAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.FIRSTPACKETORDER);
    }

   /**
    * Get Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    * 
    * @return Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final BigInteger getFirstPacketOrderAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.FIRSTPACKETORDER);
    }

   /**
    * Get Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    * 
    * @return Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final URL getFirstPacketOrderAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.FIRSTPACKETORDER);
    }


   /**
    * Get Video_Delay/String5.
    * 
    * @return Video_Delay/String5.
    */
    @Nullable
    public final Integer getVideoDelayString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING5);
    }

   /**
    * Get Video_Delay/String5.
    * 
    * @return Video_Delay/String5.
    */
    @Nullable
    public final Long getVideoDelayString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING5);
    }

   /**
    * Get Video_Delay/String5.
    * 
    * @return Video_Delay/String5.
    */
    @Nullable
    public final LocalDateTime getVideoDelayString5AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING5);
    }

   /**
    * Get Video_Delay/String5.
    * 
    * @return Video_Delay/String5.
    */
    @Nullable
    public final LocalTime getVideoDelayString5AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING5);
    }

   /**
    * Get Video_Delay/String5.
    * 
    * @return Video_Delay/String5.
    */
    @Nullable
    public final String getVideoDelayString5AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING5);
    }

   /**
    * Get Video_Delay/String5.
    * 
    * @return Video_Delay/String5.
    */
    @Nullable
    public final Boolean getVideoDelayString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING5);
    }

   /**
    * Get Video_Delay/String5.
    * 
    * @return Video_Delay/String5.
    */
    @Nullable
    public final BigInteger getVideoDelayString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING5);
    }

   /**
    * Get Video_Delay/String5.
    * 
    * @return Video_Delay/String5.
    */
    @Nullable
    public final URL getVideoDelayString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING5);
    }


   /**
    * Get Video_Delay/String1.
    * 
    * @return Video_Delay/String1.
    */
    @Nullable
    public final Integer getVideoDelayString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING1);
    }

   /**
    * Get Video_Delay/String1.
    * 
    * @return Video_Delay/String1.
    */
    @Nullable
    public final Long getVideoDelayString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING1);
    }

   /**
    * Get Video_Delay/String1.
    * 
    * @return Video_Delay/String1.
    */
    @Nullable
    public final LocalDateTime getVideoDelayString1AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING1);
    }

   /**
    * Get Video_Delay/String1.
    * 
    * @return Video_Delay/String1.
    */
    @Nullable
    public final LocalTime getVideoDelayString1AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING1);
    }

   /**
    * Get Video_Delay/String1.
    * 
    * @return Video_Delay/String1.
    */
    @Nullable
    public final String getVideoDelayString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING1);
    }

   /**
    * Get Video_Delay/String1.
    * 
    * @return Video_Delay/String1.
    */
    @Nullable
    public final Boolean getVideoDelayString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING1);
    }

   /**
    * Get Video_Delay/String1.
    * 
    * @return Video_Delay/String1.
    */
    @Nullable
    public final BigInteger getVideoDelayString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING1);
    }

   /**
    * Get Video_Delay/String1.
    * 
    * @return Video_Delay/String1.
    */
    @Nullable
    public final URL getVideoDelayString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING1);
    }


   /**
    * Get Video_Delay/String2.
    * 
    * @return Video_Delay/String2.
    */
    @Nullable
    public final Integer getVideoDelayString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING2);
    }

   /**
    * Get Video_Delay/String2.
    * 
    * @return Video_Delay/String2.
    */
    @Nullable
    public final Long getVideoDelayString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING2);
    }

   /**
    * Get Video_Delay/String2.
    * 
    * @return Video_Delay/String2.
    */
    @Nullable
    public final LocalDateTime getVideoDelayString2AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING2);
    }

   /**
    * Get Video_Delay/String2.
    * 
    * @return Video_Delay/String2.
    */
    @Nullable
    public final LocalTime getVideoDelayString2AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING2);
    }

   /**
    * Get Video_Delay/String2.
    * 
    * @return Video_Delay/String2.
    */
    @Nullable
    public final String getVideoDelayString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING2);
    }

   /**
    * Get Video_Delay/String2.
    * 
    * @return Video_Delay/String2.
    */
    @Nullable
    public final Boolean getVideoDelayString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING2);
    }

   /**
    * Get Video_Delay/String2.
    * 
    * @return Video_Delay/String2.
    */
    @Nullable
    public final BigInteger getVideoDelayString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING2);
    }

   /**
    * Get Video_Delay/String2.
    * 
    * @return Video_Delay/String2.
    */
    @Nullable
    public final URL getVideoDelayString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING2);
    }


   /**
    * Get Video_Delay/String3.
    * 
    * @return Video_Delay/String3.
    */
    @Nullable
    public final Integer getVideoDelayString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING3);
    }

   /**
    * Get Video_Delay/String3.
    * 
    * @return Video_Delay/String3.
    */
    @Nullable
    public final Long getVideoDelayString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING3);
    }

   /**
    * Get Video_Delay/String3.
    * 
    * @return Video_Delay/String3.
    */
    @Nullable
    public final LocalDateTime getVideoDelayString3AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING3);
    }

   /**
    * Get Video_Delay/String3.
    * 
    * @return Video_Delay/String3.
    */
    @Nullable
    public final LocalTime getVideoDelayString3AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING3);
    }

   /**
    * Get Video_Delay/String3.
    * 
    * @return Video_Delay/String3.
    */
    @Nullable
    public final String getVideoDelayString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING3);
    }

   /**
    * Get Video_Delay/String3.
    * 
    * @return Video_Delay/String3.
    */
    @Nullable
    public final Boolean getVideoDelayString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING3);
    }

   /**
    * Get Video_Delay/String3.
    * 
    * @return Video_Delay/String3.
    */
    @Nullable
    public final BigInteger getVideoDelayString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING3);
    }

   /**
    * Get Video_Delay/String3.
    * 
    * @return Video_Delay/String3.
    */
    @Nullable
    public final URL getVideoDelayString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING3);
    }


   /**
    * Get Video_Delay/String4.
    * 
    * @return Video_Delay/String4.
    */
    @Nullable
    public final Integer getVideoDelayString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING4);
    }

   /**
    * Get Video_Delay/String4.
    * 
    * @return Video_Delay/String4.
    */
    @Nullable
    public final Long getVideoDelayString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING4);
    }

   /**
    * Get Video_Delay/String4.
    * 
    * @return Video_Delay/String4.
    */
    @Nullable
    public final LocalDateTime getVideoDelayString4AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING4);
    }

   /**
    * Get Video_Delay/String4.
    * 
    * @return Video_Delay/String4.
    */
    @Nullable
    public final LocalTime getVideoDelayString4AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING4);
    }

   /**
    * Get Video_Delay/String4.
    * 
    * @return Video_Delay/String4.
    */
    @Nullable
    public final String getVideoDelayString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING4);
    }

   /**
    * Get Video_Delay/String4.
    * 
    * @return Video_Delay/String4.
    */
    @Nullable
    public final Boolean getVideoDelayString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING4);
    }

   /**
    * Get Video_Delay/String4.
    * 
    * @return Video_Delay/String4.
    */
    @Nullable
    public final BigInteger getVideoDelayString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING4);
    }

   /**
    * Get Video_Delay/String4.
    * 
    * @return Video_Delay/String4.
    */
    @Nullable
    public final URL getVideoDelayString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.VIDEODELAYSTRING4);
    }


   /**
    * Get Nominal Bit rate (with measurement).
    * 
    * @return Nominal Bit rate (with measurement).
    */
    @Nullable
    public final Integer getBitRateNominalStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.BITRATENOMINALSTRING);
    }

   /**
    * Get Nominal Bit rate (with measurement).
    * 
    * @return Nominal Bit rate (with measurement).
    */
    @Nullable
    public final Long getBitRateNominalStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.BITRATENOMINALSTRING);
    }

   /**
    * Get Nominal Bit rate (with measurement).
    * 
    * @return Nominal Bit rate (with measurement).
    */
    @Nullable
    public final LocalDateTime getBitRateNominalStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.BITRATENOMINALSTRING);
    }

   /**
    * Get Nominal Bit rate (with measurement).
    * 
    * @return Nominal Bit rate (with measurement).
    */
    @Nullable
    public final LocalTime getBitRateNominalStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.BITRATENOMINALSTRING);
    }

   /**
    * Get Nominal Bit rate (with measurement).
    * 
    * @return Nominal Bit rate (with measurement).
    */
    @Nullable
    public final String getBitRateNominalStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.BITRATENOMINALSTRING);
    }

   /**
    * Get Nominal Bit rate (with measurement).
    * 
    * @return Nominal Bit rate (with measurement).
    */
    @Nullable
    public final Boolean getBitRateNominalStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.BITRATENOMINALSTRING);
    }

   /**
    * Get Nominal Bit rate (with measurement).
    * 
    * @return Nominal Bit rate (with measurement).
    */
    @Nullable
    public final BigInteger getBitRateNominalStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.BITRATENOMINALSTRING);
    }

   /**
    * Get Nominal Bit rate (with measurement).
    * 
    * @return Nominal Bit rate (with measurement).
    */
    @Nullable
    public final URL getBitRateNominalStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.BITRATENOMINALSTRING);
    }


   /**
    * Get Format used.
    * 
    * @return Format used.
    */
    @Nullable
    public final Integer getFormatAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.FORMAT);
    }

   /**
    * Get Format used.
    * 
    * @return Format used.
    */
    @Nullable
    public final Long getFormatAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.FORMAT);
    }

   /**
    * Get Format used.
    * 
    * @return Format used.
    */
    @Nullable
    public final LocalDateTime getFormatAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.FORMAT);
    }

   /**
    * Get Format used.
    * 
    * @return Format used.
    */
    @Nullable
    public final LocalTime getFormatAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.FORMAT);
    }

   /**
    * Get Format used.
    * 
    * @return Format used.
    */
    @Nullable
    public final String getFormatAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.FORMAT);
    }

   /**
    * Get Format used.
    * 
    * @return Format used.
    */
    @Nullable
    public final Boolean getFormatAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.FORMAT);
    }

   /**
    * Get Format used.
    * 
    * @return Format used.
    */
    @Nullable
    public final BigInteger getFormatAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.FORMAT);
    }

   /**
    * Get Format used.
    * 
    * @return Format used.
    */
    @Nullable
    public final URL getFormatAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.FORMAT);
    }


   /**
    * Get Height.
    * 
    * @return Height.
    */
    @Nullable
    public final Integer getHeightAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.HEIGHT);
    }

   /**
    * Get Height.
    * 
    * @return Height.
    */
    @Nullable
    public final Long getHeightAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.HEIGHT);
    }

   /**
    * Get Height.
    * 
    * @return Height.
    */
    @Nullable
    public final LocalDateTime getHeightAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.HEIGHT);
    }

   /**
    * Get Height.
    * 
    * @return Height.
    */
    @Nullable
    public final LocalTime getHeightAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.HEIGHT);
    }

   /**
    * Get Height.
    * 
    * @return Height.
    */
    @Nullable
    public final String getHeightAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.HEIGHT);
    }

   /**
    * Get Height.
    * 
    * @return Height.
    */
    @Nullable
    public final Boolean getHeightAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.HEIGHT);
    }

   /**
    * Get Height.
    * 
    * @return Height.
    */
    @Nullable
    public final BigInteger getHeightAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.HEIGHT);
    }

   /**
    * Get Height.
    * 
    * @return Height.
    */
    @Nullable
    public final URL getHeightAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.HEIGHT);
    }


   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final Integer getCodecIDStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.CODECIDSTRING);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final Long getCodecIDStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.CODECIDSTRING);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final LocalDateTime getCodecIDStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.CODECIDSTRING);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final LocalTime getCodecIDStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.CODECIDSTRING);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final String getCodecIDStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.CODECIDSTRING);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final Boolean getCodecIDStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.CODECIDSTRING);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final BigInteger getCodecIDStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.CODECIDSTRING);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final URL getCodecIDStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.CODECIDSTRING);
    }


   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final Integer getEncodedLibraryCompanyNameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final Long getEncodedLibraryCompanyNameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final LocalDateTime getEncodedLibraryCompanyNameAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final LocalTime getEncodedLibraryCompanyNameAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final String getEncodedLibraryCompanyNameAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final Boolean getEncodedLibraryCompanyNameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final BigInteger getEncodedLibraryCompanyNameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final URL getEncodedLibraryCompanyNameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.ENCODEDLIBRARYCOMPANYNAME);
    }


   /**
    * Get Source Streamsize in bytes.
    * 
    * @return Source Streamsize in bytes.
    */
    @Nullable
    public final Integer getSourceStreamSizeAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZE);
    }

   /**
    * Get Source Streamsize in bytes.
    * 
    * @return Source Streamsize in bytes.
    */
    @Nullable
    public final Long getSourceStreamSizeAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZE);
    }

   /**
    * Get Source Streamsize in bytes.
    * 
    * @return Source Streamsize in bytes.
    */
    @Nullable
    public final LocalDateTime getSourceStreamSizeAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZE);
    }

   /**
    * Get Source Streamsize in bytes.
    * 
    * @return Source Streamsize in bytes.
    */
    @Nullable
    public final LocalTime getSourceStreamSizeAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZE);
    }

   /**
    * Get Source Streamsize in bytes.
    * 
    * @return Source Streamsize in bytes.
    */
    @Nullable
    public final String getSourceStreamSizeAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZE);
    }

   /**
    * Get Source Streamsize in bytes.
    * 
    * @return Source Streamsize in bytes.
    */
    @Nullable
    public final Boolean getSourceStreamSizeAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZE);
    }

   /**
    * Get Source Streamsize in bytes.
    * 
    * @return Source Streamsize in bytes.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZE);
    }

   /**
    * Get Source Streamsize in bytes.
    * 
    * @return Source Streamsize in bytes.
    */
    @Nullable
    public final URL getSourceStreamSizeAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.SOURCESTREAMSIZE);
    }


   /**
    * Get Commercial name used by vendor for theses setings or Format field if there is no difference.
    * 
    * @return Commercial name used by vendor for theses setings or Format field if there is no difference.
    */
    @Nullable
    public final Integer getFormatCommercialAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.FORMATCOMMERCIAL);
    }

   /**
    * Get Commercial name used by vendor for theses setings or Format field if there is no difference.
    * 
    * @return Commercial name used by vendor for theses setings or Format field if there is no difference.
    */
    @Nullable
    public final Long getFormatCommercialAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.FORMATCOMMERCIAL);
    }

   /**
    * Get Commercial name used by vendor for theses setings or Format field if there is no difference.
    * 
    * @return Commercial name used by vendor for theses setings or Format field if there is no difference.
    */
    @Nullable
    public final LocalDateTime getFormatCommercialAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.FORMATCOMMERCIAL);
    }

   /**
    * Get Commercial name used by vendor for theses setings or Format field if there is no difference.
    * 
    * @return Commercial name used by vendor for theses setings or Format field if there is no difference.
    */
    @Nullable
    public final LocalTime getFormatCommercialAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.FORMATCOMMERCIAL);
    }

   /**
    * Get Commercial name used by vendor for theses setings or Format field if there is no difference.
    * 
    * @return Commercial name used by vendor for theses setings or Format field if there is no difference.
    */
    @Nullable
    public final String getFormatCommercialAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.FORMATCOMMERCIAL);
    }

   /**
    * Get Commercial name used by vendor for theses setings or Format field if there is no difference.
    * 
    * @return Commercial name used by vendor for theses setings or Format field if there is no difference.
    */
    @Nullable
    public final Boolean getFormatCommercialAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.FORMATCOMMERCIAL);
    }

   /**
    * Get Commercial name used by vendor for theses setings or Format field if there is no difference.
    * 
    * @return Commercial name used by vendor for theses setings or Format field if there is no difference.
    */
    @Nullable
    public final BigInteger getFormatCommercialAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.FORMATCOMMERCIAL);
    }

   /**
    * Get Commercial name used by vendor for theses setings or Format field if there is no difference.
    * 
    * @return Commercial name used by vendor for theses setings or Format field if there is no difference.
    */
    @Nullable
    public final URL getFormatCommercialAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.FORMATCOMMERCIAL);
    }


   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final Integer getDelaySourceStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.DELAYSOURCESTRING);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final Long getDelaySourceStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.DELAYSOURCESTRING);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final LocalDateTime getDelaySourceStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.DELAYSOURCESTRING);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final LocalTime getDelaySourceStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.DELAYSOURCESTRING);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final String getDelaySourceStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.DELAYSOURCESTRING);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final Boolean getDelaySourceStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.DELAYSOURCESTRING);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final BigInteger getDelaySourceStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.DELAYSOURCESTRING);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final URL getDelaySourceStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.DELAYSOURCESTRING);
    }


   /**
    * Get Nominal Bit rate in bps.
    * 
    * @return Nominal Bit rate in bps.
    */
    @Nullable
    public final Integer getBitRateNominalAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.BITRATENOMINAL);
    }

   /**
    * Get Nominal Bit rate in bps.
    * 
    * @return Nominal Bit rate in bps.
    */
    @Nullable
    public final Long getBitRateNominalAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.BITRATENOMINAL);
    }

   /**
    * Get Nominal Bit rate in bps.
    * 
    * @return Nominal Bit rate in bps.
    */
    @Nullable
    public final LocalDateTime getBitRateNominalAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.BITRATENOMINAL);
    }

   /**
    * Get Nominal Bit rate in bps.
    * 
    * @return Nominal Bit rate in bps.
    */
    @Nullable
    public final LocalTime getBitRateNominalAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.BITRATENOMINAL);
    }

   /**
    * Get Nominal Bit rate in bps.
    * 
    * @return Nominal Bit rate in bps.
    */
    @Nullable
    public final String getBitRateNominalAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.BITRATENOMINAL);
    }

   /**
    * Get Nominal Bit rate in bps.
    * 
    * @return Nominal Bit rate in bps.
    */
    @Nullable
    public final Boolean getBitRateNominalAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.BITRATENOMINAL);
    }

   /**
    * Get Nominal Bit rate in bps.
    * 
    * @return Nominal Bit rate in bps.
    */
    @Nullable
    public final BigInteger getBitRateNominalAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.BITRATENOMINAL);
    }

   /**
    * Get Nominal Bit rate in bps.
    * 
    * @return Nominal Bit rate in bps.
    */
    @Nullable
    public final URL getBitRateNominalAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.BITRATENOMINAL);
    }


   /**
    * Get Minimum Bit rate in bps.
    * 
    * @return Minimum Bit rate in bps.
    */
    @Nullable
    public final Integer getBitRateMinimumAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.BITRATEMINIMUM);
    }

   /**
    * Get Minimum Bit rate in bps.
    * 
    * @return Minimum Bit rate in bps.
    */
    @Nullable
    public final Long getBitRateMinimumAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.BITRATEMINIMUM);
    }

   /**
    * Get Minimum Bit rate in bps.
    * 
    * @return Minimum Bit rate in bps.
    */
    @Nullable
    public final LocalDateTime getBitRateMinimumAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.BITRATEMINIMUM);
    }

   /**
    * Get Minimum Bit rate in bps.
    * 
    * @return Minimum Bit rate in bps.
    */
    @Nullable
    public final LocalTime getBitRateMinimumAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.BITRATEMINIMUM);
    }

   /**
    * Get Minimum Bit rate in bps.
    * 
    * @return Minimum Bit rate in bps.
    */
    @Nullable
    public final String getBitRateMinimumAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.BITRATEMINIMUM);
    }

   /**
    * Get Minimum Bit rate in bps.
    * 
    * @return Minimum Bit rate in bps.
    */
    @Nullable
    public final Boolean getBitRateMinimumAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.BITRATEMINIMUM);
    }

   /**
    * Get Minimum Bit rate in bps.
    * 
    * @return Minimum Bit rate in bps.
    */
    @Nullable
    public final BigInteger getBitRateMinimumAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.BITRATEMINIMUM);
    }

   /**
    * Get Minimum Bit rate in bps.
    * 
    * @return Minimum Bit rate in bps.
    */
    @Nullable
    public final URL getBitRateMinimumAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.BITRATEMINIMUM);
    }


   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Integer getSourceDurationStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING);
    }

   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Long getSourceDurationStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING);
    }

   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalDateTime getSourceDurationStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING);
    }

   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalTime getSourceDurationStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING);
    }

   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final String getSourceDurationStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING);
    }

   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Boolean getSourceDurationStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING);
    }

   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final BigInteger getSourceDurationStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING);
    }

   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final URL getSourceDurationStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.SOURCEDURATIONSTRING);
    }


   /**
    * Get Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    */
    @Nullable
    public final Integer getBitRateEncodedStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.BITRATEENCODEDSTRING);
    }

   /**
    * Get Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    */
    @Nullable
    public final Long getBitRateEncodedStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.BITRATEENCODEDSTRING);
    }

   /**
    * Get Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    */
    @Nullable
    public final LocalDateTime getBitRateEncodedStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.BITRATEENCODEDSTRING);
    }

   /**
    * Get Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    */
    @Nullable
    public final LocalTime getBitRateEncodedStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.BITRATEENCODEDSTRING);
    }

   /**
    * Get Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    */
    @Nullable
    public final String getBitRateEncodedStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.BITRATEENCODEDSTRING);
    }

   /**
    * Get Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    */
    @Nullable
    public final Boolean getBitRateEncodedStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.BITRATEENCODEDSTRING);
    }

   /**
    * Get Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    */
    @Nullable
    public final BigInteger getBitRateEncodedStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.BITRATEENCODEDSTRING);
    }

   /**
    * Get Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    */
    @Nullable
    public final URL getBitRateEncodedStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.BITRATEENCODEDSTRING);
    }


   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final Integer getStreamKindStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.STREAMKINDSTRING);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final Long getStreamKindStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.STREAMKINDSTRING);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final LocalDateTime getStreamKindStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.STREAMKINDSTRING);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final LocalTime getStreamKindStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.STREAMKINDSTRING);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final String getStreamKindStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.STREAMKINDSTRING);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final Boolean getStreamKindStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.STREAMKINDSTRING);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final BigInteger getStreamKindStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.STREAMKINDSTRING);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final URL getStreamKindStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.STREAMKINDSTRING);
    }


   /**
    * Get ChromaSubsampling.
    * 
    * @return ChromaSubsampling.
    */
    @Nullable
    public final Integer getChromaSubsamplingAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.CHROMASUBSAMPLING);
    }

   /**
    * Get ChromaSubsampling.
    * 
    * @return ChromaSubsampling.
    */
    @Nullable
    public final Long getChromaSubsamplingAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.CHROMASUBSAMPLING);
    }

   /**
    * Get ChromaSubsampling.
    * 
    * @return ChromaSubsampling.
    */
    @Nullable
    public final LocalDateTime getChromaSubsamplingAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.CHROMASUBSAMPLING);
    }

   /**
    * Get ChromaSubsampling.
    * 
    * @return ChromaSubsampling.
    */
    @Nullable
    public final LocalTime getChromaSubsamplingAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.CHROMASUBSAMPLING);
    }

   /**
    * Get ChromaSubsampling.
    * 
    * @return ChromaSubsampling.
    */
    @Nullable
    public final String getChromaSubsamplingAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.CHROMASUBSAMPLING);
    }

   /**
    * Get ChromaSubsampling.
    * 
    * @return ChromaSubsampling.
    */
    @Nullable
    public final Boolean getChromaSubsamplingAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.CHROMASUBSAMPLING);
    }

   /**
    * Get ChromaSubsampling.
    * 
    * @return ChromaSubsampling.
    */
    @Nullable
    public final BigInteger getChromaSubsamplingAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.CHROMASUBSAMPLING);
    }

   /**
    * Get ChromaSubsampling.
    * 
    * @return ChromaSubsampling.
    */
    @Nullable
    public final URL getChromaSubsamplingAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.CHROMASUBSAMPLING);
    }


   /**
    * Get Version of the product.
    * 
    * @return Version of the product.
    */
    @Nullable
    public final Integer getEncodedApplicationVersionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATIONVERSION);
    }

   /**
    * Get Version of the product.
    * 
    * @return Version of the product.
    */
    @Nullable
    public final Long getEncodedApplicationVersionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATIONVERSION);
    }

   /**
    * Get Version of the product.
    * 
    * @return Version of the product.
    */
    @Nullable
    public final LocalDateTime getEncodedApplicationVersionAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATIONVERSION);
    }

   /**
    * Get Version of the product.
    * 
    * @return Version of the product.
    */
    @Nullable
    public final LocalTime getEncodedApplicationVersionAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATIONVERSION);
    }

   /**
    * Get Version of the product.
    * 
    * @return Version of the product.
    */
    @Nullable
    public final String getEncodedApplicationVersionAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATIONVERSION);
    }

   /**
    * Get Version of the product.
    * 
    * @return Version of the product.
    */
    @Nullable
    public final Boolean getEncodedApplicationVersionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATIONVERSION);
    }

   /**
    * Get Version of the product.
    * 
    * @return Version of the product.
    */
    @Nullable
    public final BigInteger getEncodedApplicationVersionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATIONVERSION);
    }

   /**
    * Get Version of the product.
    * 
    * @return Version of the product.
    */
    @Nullable
    public final URL getEncodedApplicationVersionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.ENCODEDAPPLICATIONVERSION);
    }


   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final Integer getMenuIDAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.MENUID);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final Long getMenuIDAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.MENUID);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final LocalDateTime getMenuIDAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.MENUID);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final LocalTime getMenuIDAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.MENUID);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final String getMenuIDAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.MENUID);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final Boolean getMenuIDAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.MENUID);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final BigInteger getMenuIDAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.MENUID);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final URL getMenuIDAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.MENUID);
    }


   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final Integer getAlternateGroupStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.ALTERNATEGROUPSTRING);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final Long getAlternateGroupStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.ALTERNATEGROUPSTRING);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final LocalDateTime getAlternateGroupStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.ALTERNATEGROUPSTRING);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final LocalTime getAlternateGroupStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.ALTERNATEGROUPSTRING);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final String getAlternateGroupStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.ALTERNATEGROUPSTRING);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final Boolean getAlternateGroupStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.ALTERNATEGROUPSTRING);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final BigInteger getAlternateGroupStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.ALTERNATEGROUPSTRING);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final URL getAlternateGroupStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.ALTERNATEGROUPSTRING);
    }


   /**
    * Get Summary.
    * 
    * @return Summary.
    */
    @Nullable
    public final Integer getSummaryAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Text, getStreamNumber(), Text.SUMMARY);
    }

   /**
    * Get Summary.
    * 
    * @return Summary.
    */
    @Nullable
    public final Long getSummaryAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Text, getStreamNumber(), Text.SUMMARY);
    }

   /**
    * Get Summary.
    * 
    * @return Summary.
    */
    @Nullable
    public final LocalDateTime getSummaryAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Text, getStreamNumber(), Text.SUMMARY);
    }

   /**
    * Get Summary.
    * 
    * @return Summary.
    */
    @Nullable
    public final LocalTime getSummaryAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Text, getStreamNumber(), Text.SUMMARY);
    }

   /**
    * Get Summary.
    * 
    * @return Summary.
    */
    @Nullable
    public final String getSummaryAsString() {
        return getMediaInfo().getAsString(StreamKind.Text, getStreamNumber(), Text.SUMMARY);
    }

   /**
    * Get Summary.
    * 
    * @return Summary.
    */
    @Nullable
    public final Boolean getSummaryAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Text, getStreamNumber(), Text.SUMMARY);
    }

   /**
    * Get Summary.
    * 
    * @return Summary.
    */
    @Nullable
    public final BigInteger getSummaryAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Text, getStreamNumber(), Text.SUMMARY);
    }

   /**
    * Get Summary.
    * 
    * @return Summary.
    */
    @Nullable
    public final URL getSummaryAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Text, getStreamNumber(), Text.SUMMARY);
    }


}
