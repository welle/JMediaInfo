package aka.jmetadata.main;

import java.math.BigInteger;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import aka.jmetadata.main.constants.Audio;
import aka.jmetadata.main.constants.StreamKind;
import aka.jmetadata.main.mediainfo.MediaInfo;

/**
 * This class contains all methods to extract Audio informations of a specific Audio stream.
 *
 * @author Welle Charlotte
 */
public final class JMetaDataAudio extends AbstractStreamJMetadata {

   /**
    * Constructor.
    * 
    * @param mediaInfo instance of MediaInfo JNA library
    * @param streamNumber number of the stream to parse
    * @see MediaInfo
    */
    public JMetaDataAudio(@NonNull final MediaInfo mediaInfo, final int streamNumber) {
        super(mediaInfo, streamNumber);
    }

   /**
    * Get Delay source (Stream or empty).
    * 
    * @return Delay source (Stream or empty).
    */
    @Nullable
    public final Integer getDelayOriginalSourceAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSOURCE);
    }

   /**
    * Get Delay source (Stream or empty).
    * 
    * @return Delay source (Stream or empty).
    */
    @Nullable
    public final Long getDelayOriginalSourceAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSOURCE);
    }

   /**
    * Get Delay source (Stream or empty).
    * 
    * @return Delay source (Stream or empty).
    */
    @Nullable
    public final LocalDateTime getDelayOriginalSourceAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSOURCE);
    }

   /**
    * Get Delay source (Stream or empty).
    * 
    * @return Delay source (Stream or empty).
    */
    @Nullable
    public final LocalTime getDelayOriginalSourceAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSOURCE);
    }

   /**
    * Get Delay source (Stream or empty).
    * 
    * @return Delay source (Stream or empty).
    */
    @Nullable
    public final String getDelayOriginalSourceAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSOURCE);
    }

   /**
    * Get Delay source (Stream or empty).
    * 
    * @return Delay source (Stream or empty).
    */
    @Nullable
    public final Boolean getDelayOriginalSourceAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSOURCE);
    }

   /**
    * Get Delay source (Stream or empty).
    * 
    * @return Delay source (Stream or empty).
    */
    @Nullable
    public final BigInteger getDelayOriginalSourceAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSOURCE);
    }

   /**
    * Get Delay source (Stream or empty).
    * 
    * @return Delay source (Stream or empty).
    */
    @Nullable
    public final URL getDelayOriginalSourceAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSOURCE);
    }


   /**
    * Get Between how much time (ms) the stream is inserted.
    * 
    * @return Between how much time (ms) the stream is inserted.
    */
    @Nullable
    public final Integer getInterleaveDurationAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVEDURATION);
    }

   /**
    * Get Between how much time (ms) the stream is inserted.
    * 
    * @return Between how much time (ms) the stream is inserted.
    */
    @Nullable
    public final Long getInterleaveDurationAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVEDURATION);
    }

   /**
    * Get Between how much time (ms) the stream is inserted.
    * 
    * @return Between how much time (ms) the stream is inserted.
    */
    @Nullable
    public final LocalDateTime getInterleaveDurationAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVEDURATION);
    }

   /**
    * Get Between how much time (ms) the stream is inserted.
    * 
    * @return Between how much time (ms) the stream is inserted.
    */
    @Nullable
    public final LocalTime getInterleaveDurationAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVEDURATION);
    }

   /**
    * Get Between how much time (ms) the stream is inserted.
    * 
    * @return Between how much time (ms) the stream is inserted.
    */
    @Nullable
    public final String getInterleaveDurationAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVEDURATION);
    }

   /**
    * Get Between how much time (ms) the stream is inserted.
    * 
    * @return Between how much time (ms) the stream is inserted.
    */
    @Nullable
    public final Boolean getInterleaveDurationAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVEDURATION);
    }

   /**
    * Get Between how much time (ms) the stream is inserted.
    * 
    * @return Between how much time (ms) the stream is inserted.
    */
    @Nullable
    public final BigInteger getInterleaveDurationAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVEDURATION);
    }

   /**
    * Get Between how much time (ms) the stream is inserted.
    * 
    * @return Between how much time (ms) the stream is inserted.
    */
    @Nullable
    public final URL getInterleaveDurationAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVEDURATION);
    }


   /**
    * Get Stream order in the file, whatever is the kind of stream (base=0).
    * 
    * @return Stream order in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final Integer getStreamOrderAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMORDER);
    }

   /**
    * Get Stream order in the file, whatever is the kind of stream (base=0).
    * 
    * @return Stream order in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final Long getStreamOrderAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.STREAMORDER);
    }

   /**
    * Get Stream order in the file, whatever is the kind of stream (base=0).
    * 
    * @return Stream order in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final LocalDateTime getStreamOrderAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMORDER);
    }

   /**
    * Get Stream order in the file, whatever is the kind of stream (base=0).
    * 
    * @return Stream order in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final LocalTime getStreamOrderAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMORDER);
    }

   /**
    * Get Stream order in the file, whatever is the kind of stream (base=0).
    * 
    * @return Stream order in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final String getStreamOrderAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.STREAMORDER);
    }

   /**
    * Get Stream order in the file, whatever is the kind of stream (base=0).
    * 
    * @return Stream order in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final Boolean getStreamOrderAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.STREAMORDER);
    }

   /**
    * Get Stream order in the file, whatever is the kind of stream (base=0).
    * 
    * @return Stream order in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final BigInteger getStreamOrderAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMORDER);
    }

   /**
    * Get Stream order in the file, whatever is the kind of stream (base=0).
    * 
    * @return Stream order in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final URL getStreamOrderAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.STREAMORDER);
    }


   /**
    * Get Name of the the encoding-software.
    * 
    * @return Name of the the encoding-software.
    */
    @Nullable
    public final Integer getEncodedLibraryNameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYNAME);
    }

   /**
    * Get Name of the the encoding-software.
    * 
    * @return Name of the the encoding-software.
    */
    @Nullable
    public final Long getEncodedLibraryNameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYNAME);
    }

   /**
    * Get Name of the the encoding-software.
    * 
    * @return Name of the the encoding-software.
    */
    @Nullable
    public final LocalDateTime getEncodedLibraryNameAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYNAME);
    }

   /**
    * Get Name of the the encoding-software.
    * 
    * @return Name of the the encoding-software.
    */
    @Nullable
    public final LocalTime getEncodedLibraryNameAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYNAME);
    }

   /**
    * Get Name of the the encoding-software.
    * 
    * @return Name of the the encoding-software.
    */
    @Nullable
    public final String getEncodedLibraryNameAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYNAME);
    }

   /**
    * Get Name of the the encoding-software.
    * 
    * @return Name of the the encoding-software.
    */
    @Nullable
    public final Boolean getEncodedLibraryNameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYNAME);
    }

   /**
    * Get Name of the the encoding-software.
    * 
    * @return Name of the the encoding-software.
    */
    @Nullable
    public final BigInteger getEncodedLibraryNameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYNAME);
    }

   /**
    * Get Name of the the encoding-software.
    * 
    * @return Name of the the encoding-software.
    */
    @Nullable
    public final URL getEncodedLibraryNameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYNAME);
    }


   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Integer getDurationFirstFrameString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Long getDurationFirstFrameString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalDateTime getDurationFirstFrameString4AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalTime getDurationFirstFrameString4AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final String getDurationFirstFrameString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Boolean getDurationFirstFrameString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final BigInteger getDurationFirstFrameString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final URL getDurationFirstFrameString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING4);
    }


   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Integer getDurationFirstFrameString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Long getDurationFirstFrameString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalDateTime getDurationFirstFrameString5AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalTime getDurationFirstFrameString5AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final String getDurationFirstFrameString5AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Boolean getDurationFirstFrameString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final BigInteger getDurationFirstFrameString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final URL getDurationFirstFrameString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING5);
    }


   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Integer getDurationFirstFrameString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING2);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Long getDurationFirstFrameString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING2);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalDateTime getDurationFirstFrameString2AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING2);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalTime getDurationFirstFrameString2AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING2);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final String getDurationFirstFrameString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING2);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Boolean getDurationFirstFrameString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING2);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final BigInteger getDurationFirstFrameString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING2);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final URL getDurationFirstFrameString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING2);
    }


   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Integer getSourceDurationFirstFrameStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Long getSourceDurationFirstFrameStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalDateTime getSourceDurationFirstFrameStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalTime getSourceDurationFirstFrameStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final String getSourceDurationFirstFrameStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Boolean getSourceDurationFirstFrameStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final BigInteger getSourceDurationFirstFrameStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final URL getSourceDurationFirstFrameStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING);
    }


   /**
    * Get Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Integer getDurationFirstFrameString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING3);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Long getDurationFirstFrameString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING3);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalDateTime getDurationFirstFrameString3AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING3);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalTime getDurationFirstFrameString3AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING3);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final String getDurationFirstFrameString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING3);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Boolean getDurationFirstFrameString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING3);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final BigInteger getDurationFirstFrameString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING3);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final URL getDurationFirstFrameString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING3);
    }


   /**
    * Get Source Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final Integer getSourceDurationLastFrameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAME);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final Long getSourceDurationLastFrameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAME);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final LocalDateTime getSourceDurationLastFrameAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAME);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final LocalTime getSourceDurationLastFrameAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAME);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final String getSourceDurationLastFrameAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAME);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final Boolean getSourceDurationLastFrameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAME);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final BigInteger getSourceDurationLastFrameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAME);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final URL getSourceDurationLastFrameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAME);
    }


   /**
    * Get Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Integer getDurationFirstFrameString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING1);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Long getDurationFirstFrameString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING1);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final LocalDateTime getDurationFirstFrameString1AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING1);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final LocalTime getDurationFirstFrameString1AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING1);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final String getDurationFirstFrameString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING1);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Boolean getDurationFirstFrameString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING1);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final BigInteger getDurationFirstFrameString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING1);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final URL getDurationFirstFrameString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING1);
    }


   /**
    * Get How much time is buffered before the first video frame (with measurement).
    * 
    * @return How much time is buffered before the first video frame (with measurement).
    */
    @Nullable
    public final Integer getInterleavePreloadStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVEPRELOADSTRING);
    }

   /**
    * Get How much time is buffered before the first video frame (with measurement).
    * 
    * @return How much time is buffered before the first video frame (with measurement).
    */
    @Nullable
    public final Long getInterleavePreloadStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVEPRELOADSTRING);
    }

   /**
    * Get How much time is buffered before the first video frame (with measurement).
    * 
    * @return How much time is buffered before the first video frame (with measurement).
    */
    @Nullable
    public final LocalDateTime getInterleavePreloadStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVEPRELOADSTRING);
    }

   /**
    * Get How much time is buffered before the first video frame (with measurement).
    * 
    * @return How much time is buffered before the first video frame (with measurement).
    */
    @Nullable
    public final LocalTime getInterleavePreloadStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVEPRELOADSTRING);
    }

   /**
    * Get How much time is buffered before the first video frame (with measurement).
    * 
    * @return How much time is buffered before the first video frame (with measurement).
    */
    @Nullable
    public final String getInterleavePreloadStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVEPRELOADSTRING);
    }

   /**
    * Get How much time is buffered before the first video frame (with measurement).
    * 
    * @return How much time is buffered before the first video frame (with measurement).
    */
    @Nullable
    public final Boolean getInterleavePreloadStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVEPRELOADSTRING);
    }

   /**
    * Get How much time is buffered before the first video frame (with measurement).
    * 
    * @return How much time is buffered before the first video frame (with measurement).
    */
    @Nullable
    public final BigInteger getInterleavePreloadStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVEPRELOADSTRING);
    }

   /**
    * Get How much time is buffered before the first video frame (with measurement).
    * 
    * @return How much time is buffered before the first video frame (with measurement).
    */
    @Nullable
    public final URL getInterleavePreloadStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVEPRELOADSTRING);
    }


   /**
    * Get Compression method used.
    * 
    * @return Compression method used.
    */
    @Nullable
    public final Integer getFormatCompressionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATCOMPRESSION);
    }

   /**
    * Get Compression method used.
    * 
    * @return Compression method used.
    */
    @Nullable
    public final Long getFormatCompressionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.FORMATCOMPRESSION);
    }

   /**
    * Get Compression method used.
    * 
    * @return Compression method used.
    */
    @Nullable
    public final LocalDateTime getFormatCompressionAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATCOMPRESSION);
    }

   /**
    * Get Compression method used.
    * 
    * @return Compression method used.
    */
    @Nullable
    public final LocalTime getFormatCompressionAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATCOMPRESSION);
    }

   /**
    * Get Compression method used.
    * 
    * @return Compression method used.
    */
    @Nullable
    public final String getFormatCompressionAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.FORMATCOMPRESSION);
    }

   /**
    * Get Compression method used.
    * 
    * @return Compression method used.
    */
    @Nullable
    public final Boolean getFormatCompressionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.FORMATCOMPRESSION);
    }

   /**
    * Get Compression method used.
    * 
    * @return Compression method used.
    */
    @Nullable
    public final BigInteger getFormatCompressionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATCOMPRESSION);
    }

   /**
    * Get Compression method used.
    * 
    * @return Compression method used.
    */
    @Nullable
    public final URL getFormatCompressionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.FORMATCOMPRESSION);
    }


   /**
    * Get Where this stream file is aligned in the container.
    * 
    * @return Where this stream file is aligned in the container.
    */
    @Nullable
    public final Integer getAlignmentStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.ALIGNMENTSTRING);
    }

   /**
    * Get Where this stream file is aligned in the container.
    * 
    * @return Where this stream file is aligned in the container.
    */
    @Nullable
    public final Long getAlignmentStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.ALIGNMENTSTRING);
    }

   /**
    * Get Where this stream file is aligned in the container.
    * 
    * @return Where this stream file is aligned in the container.
    */
    @Nullable
    public final LocalDateTime getAlignmentStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.ALIGNMENTSTRING);
    }

   /**
    * Get Where this stream file is aligned in the container.
    * 
    * @return Where this stream file is aligned in the container.
    */
    @Nullable
    public final LocalTime getAlignmentStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.ALIGNMENTSTRING);
    }

   /**
    * Get Where this stream file is aligned in the container.
    * 
    * @return Where this stream file is aligned in the container.
    */
    @Nullable
    public final String getAlignmentStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.ALIGNMENTSTRING);
    }

   /**
    * Get Where this stream file is aligned in the container.
    * 
    * @return Where this stream file is aligned in the container.
    */
    @Nullable
    public final Boolean getAlignmentStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.ALIGNMENTSTRING);
    }

   /**
    * Get Where this stream file is aligned in the container.
    * 
    * @return Where this stream file is aligned in the container.
    */
    @Nullable
    public final BigInteger getAlignmentStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.ALIGNMENTSTRING);
    }

   /**
    * Get Where this stream file is aligned in the container.
    * 
    * @return Where this stream file is aligned in the container.
    */
    @Nullable
    public final URL getAlignmentStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.ALIGNMENTSTRING);
    }


   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Integer getDelayStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Long getDelayStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final LocalDateTime getDelayStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final LocalTime getDelayStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final String getDelayStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Boolean getDelayStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final BigInteger getDelayStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final URL getDelayStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING);
    }


   /**
    * Get More info (text) about the muxing mode.
    * 
    * @return More info (text) about the muxing mode.
    */
    @Nullable
    public final Integer getMuxingModeMoreInfoAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.MUXINGMODEMOREINFO);
    }

   /**
    * Get More info (text) about the muxing mode.
    * 
    * @return More info (text) about the muxing mode.
    */
    @Nullable
    public final Long getMuxingModeMoreInfoAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.MUXINGMODEMOREINFO);
    }

   /**
    * Get More info (text) about the muxing mode.
    * 
    * @return More info (text) about the muxing mode.
    */
    @Nullable
    public final LocalDateTime getMuxingModeMoreInfoAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.MUXINGMODEMOREINFO);
    }

   /**
    * Get More info (text) about the muxing mode.
    * 
    * @return More info (text) about the muxing mode.
    */
    @Nullable
    public final LocalTime getMuxingModeMoreInfoAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.MUXINGMODEMOREINFO);
    }

   /**
    * Get More info (text) about the muxing mode.
    * 
    * @return More info (text) about the muxing mode.
    */
    @Nullable
    public final String getMuxingModeMoreInfoAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.MUXINGMODEMOREINFO);
    }

   /**
    * Get More info (text) about the muxing mode.
    * 
    * @return More info (text) about the muxing mode.
    */
    @Nullable
    public final Boolean getMuxingModeMoreInfoAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.MUXINGMODEMOREINFO);
    }

   /**
    * Get More info (text) about the muxing mode.
    * 
    * @return More info (text) about the muxing mode.
    */
    @Nullable
    public final BigInteger getMuxingModeMoreInfoAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.MUXINGMODEMOREINFO);
    }

   /**
    * Get More info (text) about the muxing mode.
    * 
    * @return More info (text) about the muxing mode.
    */
    @Nullable
    public final URL getMuxingModeMoreInfoAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.MUXINGMODEMOREINFO);
    }


   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final Integer getSourceStreamSizeEncodedStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING);
    }

   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final Long getSourceStreamSizeEncodedStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING);
    }

   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final LocalDateTime getSourceStreamSizeEncodedStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING);
    }

   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final LocalTime getSourceStreamSizeEncodedStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING);
    }

   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final String getSourceStreamSizeEncodedStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING);
    }

   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final Boolean getSourceStreamSizeEncodedStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING);
    }

   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeEncodedStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING);
    }

   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final URL getSourceStreamSizeEncodedStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING);
    }


   /**
    * Get Manual description given by the container.
    * 
    * @return Manual description given by the container.
    */
    @Nullable
    public final Integer getCodecIDDescriptionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.CODECIDDESCRIPTION);
    }

   /**
    * Get Manual description given by the container.
    * 
    * @return Manual description given by the container.
    */
    @Nullable
    public final Long getCodecIDDescriptionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.CODECIDDESCRIPTION);
    }

   /**
    * Get Manual description given by the container.
    * 
    * @return Manual description given by the container.
    */
    @Nullable
    public final LocalDateTime getCodecIDDescriptionAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.CODECIDDESCRIPTION);
    }

   /**
    * Get Manual description given by the container.
    * 
    * @return Manual description given by the container.
    */
    @Nullable
    public final LocalTime getCodecIDDescriptionAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.CODECIDDESCRIPTION);
    }

   /**
    * Get Manual description given by the container.
    * 
    * @return Manual description given by the container.
    */
    @Nullable
    public final String getCodecIDDescriptionAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.CODECIDDESCRIPTION);
    }

   /**
    * Get Manual description given by the container.
    * 
    * @return Manual description given by the container.
    */
    @Nullable
    public final Boolean getCodecIDDescriptionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.CODECIDDESCRIPTION);
    }

   /**
    * Get Manual description given by the container.
    * 
    * @return Manual description given by the container.
    */
    @Nullable
    public final BigInteger getCodecIDDescriptionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.CODECIDDESCRIPTION);
    }

   /**
    * Get Manual description given by the container.
    * 
    * @return Manual description given by the container.
    */
    @Nullable
    public final URL getCodecIDDescriptionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.CODECIDDESCRIPTION);
    }


   /**
    * Get bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    * 
    * @return bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    */
    @Nullable
    public final Integer getStatusAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.STATUS);
    }

   /**
    * Get bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    * 
    * @return bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    */
    @Nullable
    public final Long getStatusAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.STATUS);
    }

   /**
    * Get bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    * 
    * @return bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    */
    @Nullable
    public final LocalDateTime getStatusAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.STATUS);
    }

   /**
    * Get bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    * 
    * @return bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    */
    @Nullable
    public final LocalTime getStatusAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.STATUS);
    }

   /**
    * Get bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    * 
    * @return bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    */
    @Nullable
    public final String getStatusAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.STATUS);
    }

   /**
    * Get bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    * 
    * @return bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    */
    @Nullable
    public final Boolean getStatusAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.STATUS);
    }

   /**
    * Get bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    * 
    * @return bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    */
    @Nullable
    public final BigInteger getStatusAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.STATUS);
    }

   /**
    * Get bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    * 
    * @return bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    */
    @Nullable
    public final URL getStatusAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.STATUS);
    }


   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Integer getDurationFirstFrameStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Long getDurationFirstFrameStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalDateTime getDurationFirstFrameStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalTime getDurationFirstFrameStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final String getDurationFirstFrameStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Boolean getDurationFirstFrameStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final BigInteger getDurationFirstFrameStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final URL getDurationFirstFrameStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAMESTRING);
    }


   /**
    * Get Frames per second.
    * 
    * @return Frames per second.
    */
    @Nullable
    public final Integer getFrameRateAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.FRAMERATE);
    }

   /**
    * Get Frames per second.
    * 
    * @return Frames per second.
    */
    @Nullable
    public final Long getFrameRateAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.FRAMERATE);
    }

   /**
    * Get Frames per second.
    * 
    * @return Frames per second.
    */
    @Nullable
    public final LocalDateTime getFrameRateAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.FRAMERATE);
    }

   /**
    * Get Frames per second.
    * 
    * @return Frames per second.
    */
    @Nullable
    public final LocalTime getFrameRateAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.FRAMERATE);
    }

   /**
    * Get Frames per second.
    * 
    * @return Frames per second.
    */
    @Nullable
    public final String getFrameRateAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.FRAMERATE);
    }

   /**
    * Get Frames per second.
    * 
    * @return Frames per second.
    */
    @Nullable
    public final Boolean getFrameRateAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.FRAMERATE);
    }

   /**
    * Get Frames per second.
    * 
    * @return Frames per second.
    */
    @Nullable
    public final BigInteger getFrameRateAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.FRAMERATE);
    }

   /**
    * Get Frames per second.
    * 
    * @return Frames per second.
    */
    @Nullable
    public final URL getFrameRateAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.FRAMERATE);
    }


   /**
    * Get Service kind (full).
    * 
    * @return Service kind (full).
    */
    @Nullable
    public final Integer getServiceKindStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SERVICEKINDSTRING);
    }

   /**
    * Get Service kind (full).
    * 
    * @return Service kind (full).
    */
    @Nullable
    public final Long getServiceKindStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SERVICEKINDSTRING);
    }

   /**
    * Get Service kind (full).
    * 
    * @return Service kind (full).
    */
    @Nullable
    public final LocalDateTime getServiceKindStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SERVICEKINDSTRING);
    }

   /**
    * Get Service kind (full).
    * 
    * @return Service kind (full).
    */
    @Nullable
    public final LocalTime getServiceKindStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SERVICEKINDSTRING);
    }

   /**
    * Get Service kind (full).
    * 
    * @return Service kind (full).
    */
    @Nullable
    public final String getServiceKindStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SERVICEKINDSTRING);
    }

   /**
    * Get Service kind (full).
    * 
    * @return Service kind (full).
    */
    @Nullable
    public final Boolean getServiceKindStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SERVICEKINDSTRING);
    }

   /**
    * Get Service kind (full).
    * 
    * @return Service kind (full).
    */
    @Nullable
    public final BigInteger getServiceKindStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SERVICEKINDSTRING);
    }

   /**
    * Get Service kind (full).
    * 
    * @return Service kind (full).
    */
    @Nullable
    public final URL getServiceKindStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SERVICEKINDSTRING);
    }


   /**
    * Get How this stream is muxed in the container.
    * 
    * @return How this stream is muxed in the container.
    */
    @Nullable
    public final Integer getMuxingModeAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.MUXINGMODE);
    }

   /**
    * Get How this stream is muxed in the container.
    * 
    * @return How this stream is muxed in the container.
    */
    @Nullable
    public final Long getMuxingModeAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.MUXINGMODE);
    }

   /**
    * Get How this stream is muxed in the container.
    * 
    * @return How this stream is muxed in the container.
    */
    @Nullable
    public final LocalDateTime getMuxingModeAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.MUXINGMODE);
    }

   /**
    * Get How this stream is muxed in the container.
    * 
    * @return How this stream is muxed in the container.
    */
    @Nullable
    public final LocalTime getMuxingModeAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.MUXINGMODE);
    }

   /**
    * Get How this stream is muxed in the container.
    * 
    * @return How this stream is muxed in the container.
    */
    @Nullable
    public final String getMuxingModeAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.MUXINGMODE);
    }

   /**
    * Get How this stream is muxed in the container.
    * 
    * @return How this stream is muxed in the container.
    */
    @Nullable
    public final Boolean getMuxingModeAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.MUXINGMODE);
    }

   /**
    * Get How this stream is muxed in the container.
    * 
    * @return How this stream is muxed in the container.
    */
    @Nullable
    public final BigInteger getMuxingModeAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.MUXINGMODE);
    }

   /**
    * Get How this stream is muxed in the container.
    * 
    * @return How this stream is muxed in the container.
    */
    @Nullable
    public final URL getMuxingModeAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.MUXINGMODE);
    }


   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final Integer getDelaySettingsAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DELAYSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final Long getDelaySettingsAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DELAYSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final LocalDateTime getDelaySettingsAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DELAYSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final LocalTime getDelaySettingsAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DELAYSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final String getDelaySettingsAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DELAYSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final Boolean getDelaySettingsAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DELAYSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final BigInteger getDelaySettingsAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DELAYSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final URL getDelaySettingsAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DELAYSETTINGS);
    }


   /**
    * Get Source Encoded Streamsize in bytes.
    * 
    * @return Source Encoded Streamsize in bytes.
    */
    @Nullable
    public final Integer getSourceStreamSizeEncodedAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODED);
    }

   /**
    * Get Source Encoded Streamsize in bytes.
    * 
    * @return Source Encoded Streamsize in bytes.
    */
    @Nullable
    public final Long getSourceStreamSizeEncodedAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODED);
    }

   /**
    * Get Source Encoded Streamsize in bytes.
    * 
    * @return Source Encoded Streamsize in bytes.
    */
    @Nullable
    public final LocalDateTime getSourceStreamSizeEncodedAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODED);
    }

   /**
    * Get Source Encoded Streamsize in bytes.
    * 
    * @return Source Encoded Streamsize in bytes.
    */
    @Nullable
    public final LocalTime getSourceStreamSizeEncodedAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODED);
    }

   /**
    * Get Source Encoded Streamsize in bytes.
    * 
    * @return Source Encoded Streamsize in bytes.
    */
    @Nullable
    public final String getSourceStreamSizeEncodedAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODED);
    }

   /**
    * Get Source Encoded Streamsize in bytes.
    * 
    * @return Source Encoded Streamsize in bytes.
    */
    @Nullable
    public final Boolean getSourceStreamSizeEncodedAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODED);
    }

   /**
    * Get Source Encoded Streamsize in bytes.
    * 
    * @return Source Encoded Streamsize in bytes.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeEncodedAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODED);
    }

   /**
    * Get Source Encoded Streamsize in bytes.
    * 
    * @return Source Encoded Streamsize in bytes.
    */
    @Nullable
    public final URL getSourceStreamSizeEncodedAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODED);
    }


   /**
    * Get Format_Settings_ITU.
    * 
    * @return Format_Settings_ITU.
    */
    @Nullable
    public final Integer getFormatSettingsITUAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSITU);
    }

   /**
    * Get Format_Settings_ITU.
    * 
    * @return Format_Settings_ITU.
    */
    @Nullable
    public final Long getFormatSettingsITUAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSITU);
    }

   /**
    * Get Format_Settings_ITU.
    * 
    * @return Format_Settings_ITU.
    */
    @Nullable
    public final LocalDateTime getFormatSettingsITUAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSITU);
    }

   /**
    * Get Format_Settings_ITU.
    * 
    * @return Format_Settings_ITU.
    */
    @Nullable
    public final LocalTime getFormatSettingsITUAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSITU);
    }

   /**
    * Get Format_Settings_ITU.
    * 
    * @return Format_Settings_ITU.
    */
    @Nullable
    public final String getFormatSettingsITUAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSITU);
    }

   /**
    * Get Format_Settings_ITU.
    * 
    * @return Format_Settings_ITU.
    */
    @Nullable
    public final Boolean getFormatSettingsITUAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSITU);
    }

   /**
    * Get Format_Settings_ITU.
    * 
    * @return Format_Settings_ITU.
    */
    @Nullable
    public final BigInteger getFormatSettingsITUAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSITU);
    }

   /**
    * Get Format_Settings_ITU.
    * 
    * @return Format_Settings_ITU.
    */
    @Nullable
    public final URL getFormatSettingsITUAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSITU);
    }


   /**
    * Get Number of channels (with measurement).
    * 
    * @return Number of channels (with measurement).
    */
    @Nullable
    public final Integer getChannelsOriginalStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.CHANNELSORIGINALSTRING);
    }

   /**
    * Get Number of channels (with measurement).
    * 
    * @return Number of channels (with measurement).
    */
    @Nullable
    public final Long getChannelsOriginalStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.CHANNELSORIGINALSTRING);
    }

   /**
    * Get Number of channels (with measurement).
    * 
    * @return Number of channels (with measurement).
    */
    @Nullable
    public final LocalDateTime getChannelsOriginalStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.CHANNELSORIGINALSTRING);
    }

   /**
    * Get Number of channels (with measurement).
    * 
    * @return Number of channels (with measurement).
    */
    @Nullable
    public final LocalTime getChannelsOriginalStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.CHANNELSORIGINALSTRING);
    }

   /**
    * Get Number of channels (with measurement).
    * 
    * @return Number of channels (with measurement).
    */
    @Nullable
    public final String getChannelsOriginalStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.CHANNELSORIGINALSTRING);
    }

   /**
    * Get Number of channels (with measurement).
    * 
    * @return Number of channels (with measurement).
    */
    @Nullable
    public final Boolean getChannelsOriginalStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.CHANNELSORIGINALSTRING);
    }

   /**
    * Get Number of channels (with measurement).
    * 
    * @return Number of channels (with measurement).
    */
    @Nullable
    public final BigInteger getChannelsOriginalStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.CHANNELSORIGINALSTRING);
    }

   /**
    * Get Number of channels (with measurement).
    * 
    * @return Number of channels (with measurement).
    */
    @Nullable
    public final URL getChannelsOriginalStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.CHANNELSORIGINALSTRING);
    }


   /**
    * Get Format_Settings_ModeExtension.
    * 
    * @return Format_Settings_ModeExtension.
    */
    @Nullable
    public final Integer getFormatSettingsModeExtensionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSMODEEXTENSION);
    }

   /**
    * Get Format_Settings_ModeExtension.
    * 
    * @return Format_Settings_ModeExtension.
    */
    @Nullable
    public final Long getFormatSettingsModeExtensionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSMODEEXTENSION);
    }

   /**
    * Get Format_Settings_ModeExtension.
    * 
    * @return Format_Settings_ModeExtension.
    */
    @Nullable
    public final LocalDateTime getFormatSettingsModeExtensionAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSMODEEXTENSION);
    }

   /**
    * Get Format_Settings_ModeExtension.
    * 
    * @return Format_Settings_ModeExtension.
    */
    @Nullable
    public final LocalTime getFormatSettingsModeExtensionAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSMODEEXTENSION);
    }

   /**
    * Get Format_Settings_ModeExtension.
    * 
    * @return Format_Settings_ModeExtension.
    */
    @Nullable
    public final String getFormatSettingsModeExtensionAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSMODEEXTENSION);
    }

   /**
    * Get Format_Settings_ModeExtension.
    * 
    * @return Format_Settings_ModeExtension.
    */
    @Nullable
    public final Boolean getFormatSettingsModeExtensionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSMODEEXTENSION);
    }

   /**
    * Get Format_Settings_ModeExtension.
    * 
    * @return Format_Settings_ModeExtension.
    */
    @Nullable
    public final BigInteger getFormatSettingsModeExtensionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSMODEEXTENSION);
    }

   /**
    * Get Format_Settings_ModeExtension.
    * 
    * @return Format_Settings_ModeExtension.
    */
    @Nullable
    public final URL getFormatSettingsModeExtensionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSMODEEXTENSION);
    }


   /**
    * Get Format_Settings_Firm.
    * 
    * @return Format_Settings_Firm.
    */
    @Nullable
    public final Integer getFormatSettingsFirmAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSFIRM);
    }

   /**
    * Get Format_Settings_Firm.
    * 
    * @return Format_Settings_Firm.
    */
    @Nullable
    public final Long getFormatSettingsFirmAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSFIRM);
    }

   /**
    * Get Format_Settings_Firm.
    * 
    * @return Format_Settings_Firm.
    */
    @Nullable
    public final LocalDateTime getFormatSettingsFirmAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSFIRM);
    }

   /**
    * Get Format_Settings_Firm.
    * 
    * @return Format_Settings_Firm.
    */
    @Nullable
    public final LocalTime getFormatSettingsFirmAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSFIRM);
    }

   /**
    * Get Format_Settings_Firm.
    * 
    * @return Format_Settings_Firm.
    */
    @Nullable
    public final String getFormatSettingsFirmAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSFIRM);
    }

   /**
    * Get Format_Settings_Firm.
    * 
    * @return Format_Settings_Firm.
    */
    @Nullable
    public final Boolean getFormatSettingsFirmAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSFIRM);
    }

   /**
    * Get Format_Settings_Firm.
    * 
    * @return Format_Settings_Firm.
    */
    @Nullable
    public final BigInteger getFormatSettingsFirmAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSFIRM);
    }

   /**
    * Get Format_Settings_Firm.
    * 
    * @return Format_Settings_Firm.
    */
    @Nullable
    public final URL getFormatSettingsFirmAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSFIRM);
    }


   /**
    * Get Bit rate mode (Constant, Variable).
    * 
    * @return Bit rate mode (Constant, Variable).
    */
    @Nullable
    public final Integer getBitRateModeStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMODESTRING);
    }

   /**
    * Get Bit rate mode (Constant, Variable).
    * 
    * @return Bit rate mode (Constant, Variable).
    */
    @Nullable
    public final Long getBitRateModeStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMODESTRING);
    }

   /**
    * Get Bit rate mode (Constant, Variable).
    * 
    * @return Bit rate mode (Constant, Variable).
    */
    @Nullable
    public final LocalDateTime getBitRateModeStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMODESTRING);
    }

   /**
    * Get Bit rate mode (Constant, Variable).
    * 
    * @return Bit rate mode (Constant, Variable).
    */
    @Nullable
    public final LocalTime getBitRateModeStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMODESTRING);
    }

   /**
    * Get Bit rate mode (Constant, Variable).
    * 
    * @return Bit rate mode (Constant, Variable).
    */
    @Nullable
    public final String getBitRateModeStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMODESTRING);
    }

   /**
    * Get Bit rate mode (Constant, Variable).
    * 
    * @return Bit rate mode (Constant, Variable).
    */
    @Nullable
    public final Boolean getBitRateModeStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMODESTRING);
    }

   /**
    * Get Bit rate mode (Constant, Variable).
    * 
    * @return Bit rate mode (Constant, Variable).
    */
    @Nullable
    public final BigInteger getBitRateModeStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMODESTRING);
    }

   /**
    * Get Bit rate mode (Constant, Variable).
    * 
    * @return Bit rate mode (Constant, Variable).
    */
    @Nullable
    public final URL getBitRateModeStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMODESTRING);
    }


   /**
    * Get The maximum absolute peak value of the item.
    * 
    * @return The maximum absolute peak value of the item.
    */
    @Nullable
    public final Integer getReplayGainPeakAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.REPLAYGAINPEAK);
    }

   /**
    * Get The maximum absolute peak value of the item.
    * 
    * @return The maximum absolute peak value of the item.
    */
    @Nullable
    public final Long getReplayGainPeakAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.REPLAYGAINPEAK);
    }

   /**
    * Get The maximum absolute peak value of the item.
    * 
    * @return The maximum absolute peak value of the item.
    */
    @Nullable
    public final LocalDateTime getReplayGainPeakAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.REPLAYGAINPEAK);
    }

   /**
    * Get The maximum absolute peak value of the item.
    * 
    * @return The maximum absolute peak value of the item.
    */
    @Nullable
    public final LocalTime getReplayGainPeakAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.REPLAYGAINPEAK);
    }

   /**
    * Get The maximum absolute peak value of the item.
    * 
    * @return The maximum absolute peak value of the item.
    */
    @Nullable
    public final String getReplayGainPeakAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.REPLAYGAINPEAK);
    }

   /**
    * Get The maximum absolute peak value of the item.
    * 
    * @return The maximum absolute peak value of the item.
    */
    @Nullable
    public final Boolean getReplayGainPeakAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.REPLAYGAINPEAK);
    }

   /**
    * Get The maximum absolute peak value of the item.
    * 
    * @return The maximum absolute peak value of the item.
    */
    @Nullable
    public final BigInteger getReplayGainPeakAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.REPLAYGAINPEAK);
    }

   /**
    * Get The maximum absolute peak value of the item.
    * 
    * @return The maximum absolute peak value of the item.
    */
    @Nullable
    public final URL getReplayGainPeakAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.REPLAYGAINPEAK);
    }


   /**
    * Get ID of layout of channels (e.g. MXF descriptor channel assignment). Warning, sometimes this is not enough for uniquely identifying a layout (e.g. MXF descriptor channel assignment is SMPTE 377-4). For AC-3, the form is x,y with x=acmod and y=lfeon..
    * 
    * @return ID of layout of channels (e.g. MXF descriptor channel assignment). Warning, sometimes this is not enough for uniquely identifying a layout (e.g. MXF descriptor channel assignment is SMPTE 377-4). For AC-3, the form is x,y with x=acmod and y=lfeon..
    */
    @Nullable
    public final Integer getChannelLayoutIDAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.CHANNELLAYOUTID);
    }

   /**
    * Get ID of layout of channels (e.g. MXF descriptor channel assignment). Warning, sometimes this is not enough for uniquely identifying a layout (e.g. MXF descriptor channel assignment is SMPTE 377-4). For AC-3, the form is x,y with x=acmod and y=lfeon..
    * 
    * @return ID of layout of channels (e.g. MXF descriptor channel assignment). Warning, sometimes this is not enough for uniquely identifying a layout (e.g. MXF descriptor channel assignment is SMPTE 377-4). For AC-3, the form is x,y with x=acmod and y=lfeon..
    */
    @Nullable
    public final Long getChannelLayoutIDAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.CHANNELLAYOUTID);
    }

   /**
    * Get ID of layout of channels (e.g. MXF descriptor channel assignment). Warning, sometimes this is not enough for uniquely identifying a layout (e.g. MXF descriptor channel assignment is SMPTE 377-4). For AC-3, the form is x,y with x=acmod and y=lfeon..
    * 
    * @return ID of layout of channels (e.g. MXF descriptor channel assignment). Warning, sometimes this is not enough for uniquely identifying a layout (e.g. MXF descriptor channel assignment is SMPTE 377-4). For AC-3, the form is x,y with x=acmod and y=lfeon..
    */
    @Nullable
    public final LocalDateTime getChannelLayoutIDAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.CHANNELLAYOUTID);
    }

   /**
    * Get ID of layout of channels (e.g. MXF descriptor channel assignment). Warning, sometimes this is not enough for uniquely identifying a layout (e.g. MXF descriptor channel assignment is SMPTE 377-4). For AC-3, the form is x,y with x=acmod and y=lfeon..
    * 
    * @return ID of layout of channels (e.g. MXF descriptor channel assignment). Warning, sometimes this is not enough for uniquely identifying a layout (e.g. MXF descriptor channel assignment is SMPTE 377-4). For AC-3, the form is x,y with x=acmod and y=lfeon..
    */
    @Nullable
    public final LocalTime getChannelLayoutIDAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.CHANNELLAYOUTID);
    }

   /**
    * Get ID of layout of channels (e.g. MXF descriptor channel assignment). Warning, sometimes this is not enough for uniquely identifying a layout (e.g. MXF descriptor channel assignment is SMPTE 377-4). For AC-3, the form is x,y with x=acmod and y=lfeon..
    * 
    * @return ID of layout of channels (e.g. MXF descriptor channel assignment). Warning, sometimes this is not enough for uniquely identifying a layout (e.g. MXF descriptor channel assignment is SMPTE 377-4). For AC-3, the form is x,y with x=acmod and y=lfeon..
    */
    @Nullable
    public final String getChannelLayoutIDAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.CHANNELLAYOUTID);
    }

   /**
    * Get ID of layout of channels (e.g. MXF descriptor channel assignment). Warning, sometimes this is not enough for uniquely identifying a layout (e.g. MXF descriptor channel assignment is SMPTE 377-4). For AC-3, the form is x,y with x=acmod and y=lfeon..
    * 
    * @return ID of layout of channels (e.g. MXF descriptor channel assignment). Warning, sometimes this is not enough for uniquely identifying a layout (e.g. MXF descriptor channel assignment is SMPTE 377-4). For AC-3, the form is x,y with x=acmod and y=lfeon..
    */
    @Nullable
    public final Boolean getChannelLayoutIDAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.CHANNELLAYOUTID);
    }

   /**
    * Get ID of layout of channels (e.g. MXF descriptor channel assignment). Warning, sometimes this is not enough for uniquely identifying a layout (e.g. MXF descriptor channel assignment is SMPTE 377-4). For AC-3, the form is x,y with x=acmod and y=lfeon..
    * 
    * @return ID of layout of channels (e.g. MXF descriptor channel assignment). Warning, sometimes this is not enough for uniquely identifying a layout (e.g. MXF descriptor channel assignment is SMPTE 377-4). For AC-3, the form is x,y with x=acmod and y=lfeon..
    */
    @Nullable
    public final BigInteger getChannelLayoutIDAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.CHANNELLAYOUTID);
    }

   /**
    * Get ID of layout of channels (e.g. MXF descriptor channel assignment). Warning, sometimes this is not enough for uniquely identifying a layout (e.g. MXF descriptor channel assignment is SMPTE 377-4). For AC-3, the form is x,y with x=acmod and y=lfeon..
    * 
    * @return ID of layout of channels (e.g. MXF descriptor channel assignment). Warning, sometimes this is not enough for uniquely identifying a layout (e.g. MXF descriptor channel assignment is SMPTE 377-4). For AC-3, the form is x,y with x=acmod and y=lfeon..
    */
    @Nullable
    public final URL getChannelLayoutIDAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.CHANNELLAYOUTID);
    }


   /**
    * Get Source Sample count (based on sampling rate).
    * 
    * @return Source Sample count (based on sampling rate).
    */
    @Nullable
    public final Integer getSourceSamplingCountAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCESAMPLINGCOUNT);
    }

   /**
    * Get Source Sample count (based on sampling rate).
    * 
    * @return Source Sample count (based on sampling rate).
    */
    @Nullable
    public final Long getSourceSamplingCountAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SOURCESAMPLINGCOUNT);
    }

   /**
    * Get Source Sample count (based on sampling rate).
    * 
    * @return Source Sample count (based on sampling rate).
    */
    @Nullable
    public final LocalDateTime getSourceSamplingCountAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCESAMPLINGCOUNT);
    }

   /**
    * Get Source Sample count (based on sampling rate).
    * 
    * @return Source Sample count (based on sampling rate).
    */
    @Nullable
    public final LocalTime getSourceSamplingCountAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCESAMPLINGCOUNT);
    }

   /**
    * Get Source Sample count (based on sampling rate).
    * 
    * @return Source Sample count (based on sampling rate).
    */
    @Nullable
    public final String getSourceSamplingCountAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SOURCESAMPLINGCOUNT);
    }

   /**
    * Get Source Sample count (based on sampling rate).
    * 
    * @return Source Sample count (based on sampling rate).
    */
    @Nullable
    public final Boolean getSourceSamplingCountAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SOURCESAMPLINGCOUNT);
    }

   /**
    * Get Source Sample count (based on sampling rate).
    * 
    * @return Source Sample count (based on sampling rate).
    */
    @Nullable
    public final BigInteger getSourceSamplingCountAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCESAMPLINGCOUNT);
    }

   /**
    * Get Source Sample count (based on sampling rate).
    * 
    * @return Source Sample count (based on sampling rate).
    */
    @Nullable
    public final URL getSourceSamplingCountAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SOURCESAMPLINGCOUNT);
    }


   /**
    * Get Version of encoding-software.
    * 
    * @return Version of encoding-software.
    */
    @Nullable
    public final Integer getEncodedLibraryVersionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYVERSION);
    }

   /**
    * Get Version of encoding-software.
    * 
    * @return Version of encoding-software.
    */
    @Nullable
    public final Long getEncodedLibraryVersionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYVERSION);
    }

   /**
    * Get Version of encoding-software.
    * 
    * @return Version of encoding-software.
    */
    @Nullable
    public final LocalDateTime getEncodedLibraryVersionAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYVERSION);
    }

   /**
    * Get Version of encoding-software.
    * 
    * @return Version of encoding-software.
    */
    @Nullable
    public final LocalTime getEncodedLibraryVersionAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYVERSION);
    }

   /**
    * Get Version of encoding-software.
    * 
    * @return Version of encoding-software.
    */
    @Nullable
    public final String getEncodedLibraryVersionAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYVERSION);
    }

   /**
    * Get Version of encoding-software.
    * 
    * @return Version of encoding-software.
    */
    @Nullable
    public final Boolean getEncodedLibraryVersionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYVERSION);
    }

   /**
    * Get Version of encoding-software.
    * 
    * @return Version of encoding-software.
    */
    @Nullable
    public final BigInteger getEncodedLibraryVersionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYVERSION);
    }

   /**
    * Get Version of encoding-software.
    * 
    * @return Version of encoding-software.
    */
    @Nullable
    public final URL getEncodedLibraryVersionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYVERSION);
    }


   /**
    * Get Sample count (based on sampling rate).
    * 
    * @return Sample count (based on sampling rate).
    */
    @Nullable
    public final Integer getSamplingCountAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SAMPLINGCOUNT);
    }

   /**
    * Get Sample count (based on sampling rate).
    * 
    * @return Sample count (based on sampling rate).
    */
    @Nullable
    public final Long getSamplingCountAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SAMPLINGCOUNT);
    }

   /**
    * Get Sample count (based on sampling rate).
    * 
    * @return Sample count (based on sampling rate).
    */
    @Nullable
    public final LocalDateTime getSamplingCountAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SAMPLINGCOUNT);
    }

   /**
    * Get Sample count (based on sampling rate).
    * 
    * @return Sample count (based on sampling rate).
    */
    @Nullable
    public final LocalTime getSamplingCountAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SAMPLINGCOUNT);
    }

   /**
    * Get Sample count (based on sampling rate).
    * 
    * @return Sample count (based on sampling rate).
    */
    @Nullable
    public final String getSamplingCountAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SAMPLINGCOUNT);
    }

   /**
    * Get Sample count (based on sampling rate).
    * 
    * @return Sample count (based on sampling rate).
    */
    @Nullable
    public final Boolean getSamplingCountAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SAMPLINGCOUNT);
    }

   /**
    * Get Sample count (based on sampling rate).
    * 
    * @return Sample count (based on sampling rate).
    */
    @Nullable
    public final BigInteger getSamplingCountAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SAMPLINGCOUNT);
    }

   /**
    * Get Sample count (based on sampling rate).
    * 
    * @return Sample count (based on sampling rate).
    */
    @Nullable
    public final URL getSamplingCountAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SAMPLINGCOUNT);
    }


   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Integer getSourceDurationLastFrameStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Long getSourceDurationLastFrameStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalDateTime getSourceDurationLastFrameStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalTime getSourceDurationLastFrameStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final String getSourceDurationLastFrameStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Boolean getSourceDurationLastFrameStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final BigInteger getSourceDurationLastFrameStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final URL getSourceDurationLastFrameStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING);
    }


   /**
    * Get Info about codec ID.
    * 
    * @return Info about codec ID.
    */
    @Nullable
    public final Integer getCodecIDInfoAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.CODECIDINFO);
    }

   /**
    * Get Info about codec ID.
    * 
    * @return Info about codec ID.
    */
    @Nullable
    public final Long getCodecIDInfoAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.CODECIDINFO);
    }

   /**
    * Get Info about codec ID.
    * 
    * @return Info about codec ID.
    */
    @Nullable
    public final LocalDateTime getCodecIDInfoAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.CODECIDINFO);
    }

   /**
    * Get Info about codec ID.
    * 
    * @return Info about codec ID.
    */
    @Nullable
    public final LocalTime getCodecIDInfoAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.CODECIDINFO);
    }

   /**
    * Get Info about codec ID.
    * 
    * @return Info about codec ID.
    */
    @Nullable
    public final String getCodecIDInfoAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.CODECIDINFO);
    }

   /**
    * Get Info about codec ID.
    * 
    * @return Info about codec ID.
    */
    @Nullable
    public final Boolean getCodecIDInfoAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.CODECIDINFO);
    }

   /**
    * Get Info about codec ID.
    * 
    * @return Info about codec ID.
    */
    @Nullable
    public final BigInteger getCodecIDInfoAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.CODECIDINFO);
    }

   /**
    * Get Info about codec ID.
    * 
    * @return Info about codec ID.
    */
    @Nullable
    public final URL getCodecIDInfoAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.CODECIDINFO);
    }


   /**
    * Get Streamsize in bytes.
    * 
    * @return Streamsize in bytes.
    */
    @Nullable
    public final Integer getStreamSizeAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZE);
    }

   /**
    * Get Streamsize in bytes.
    * 
    * @return Streamsize in bytes.
    */
    @Nullable
    public final Long getStreamSizeAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZE);
    }

   /**
    * Get Streamsize in bytes.
    * 
    * @return Streamsize in bytes.
    */
    @Nullable
    public final LocalDateTime getStreamSizeAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZE);
    }

   /**
    * Get Streamsize in bytes.
    * 
    * @return Streamsize in bytes.
    */
    @Nullable
    public final LocalTime getStreamSizeAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZE);
    }

   /**
    * Get Streamsize in bytes.
    * 
    * @return Streamsize in bytes.
    */
    @Nullable
    public final String getStreamSizeAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZE);
    }

   /**
    * Get Streamsize in bytes.
    * 
    * @return Streamsize in bytes.
    */
    @Nullable
    public final Boolean getStreamSizeAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZE);
    }

   /**
    * Get Streamsize in bytes.
    * 
    * @return Streamsize in bytes.
    */
    @Nullable
    public final BigInteger getStreamSizeAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZE);
    }

   /**
    * Get Streamsize in bytes.
    * 
    * @return Streamsize in bytes.
    */
    @Nullable
    public final URL getStreamSizeAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZE);
    }


   /**
    * Get Info about the format.
    * 
    * @return Info about the format.
    */
    @Nullable
    public final Integer getFormatInfoAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATINFO);
    }

   /**
    * Get Info about the format.
    * 
    * @return Info about the format.
    */
    @Nullable
    public final Long getFormatInfoAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.FORMATINFO);
    }

   /**
    * Get Info about the format.
    * 
    * @return Info about the format.
    */
    @Nullable
    public final LocalDateTime getFormatInfoAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATINFO);
    }

   /**
    * Get Info about the format.
    * 
    * @return Info about the format.
    */
    @Nullable
    public final LocalTime getFormatInfoAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATINFO);
    }

   /**
    * Get Info about the format.
    * 
    * @return Info about the format.
    */
    @Nullable
    public final String getFormatInfoAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.FORMATINFO);
    }

   /**
    * Get Info about the format.
    * 
    * @return Info about the format.
    */
    @Nullable
    public final Boolean getFormatInfoAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.FORMATINFO);
    }

   /**
    * Get Info about the format.
    * 
    * @return Info about the format.
    */
    @Nullable
    public final BigInteger getFormatInfoAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATINFO);
    }

   /**
    * Get Info about the format.
    * 
    * @return Info about the format.
    */
    @Nullable
    public final URL getFormatInfoAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.FORMATINFO);
    }


   /**
    * Get Source_StreamSize/String1.
    * 
    * @return Source_StreamSize/String1.
    */
    @Nullable
    public final Integer getSourceStreamSizeString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING1);
    }

   /**
    * Get Source_StreamSize/String1.
    * 
    * @return Source_StreamSize/String1.
    */
    @Nullable
    public final Long getSourceStreamSizeString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING1);
    }

   /**
    * Get Source_StreamSize/String1.
    * 
    * @return Source_StreamSize/String1.
    */
    @Nullable
    public final LocalDateTime getSourceStreamSizeString1AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING1);
    }

   /**
    * Get Source_StreamSize/String1.
    * 
    * @return Source_StreamSize/String1.
    */
    @Nullable
    public final LocalTime getSourceStreamSizeString1AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING1);
    }

   /**
    * Get Source_StreamSize/String1.
    * 
    * @return Source_StreamSize/String1.
    */
    @Nullable
    public final String getSourceStreamSizeString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING1);
    }

   /**
    * Get Source_StreamSize/String1.
    * 
    * @return Source_StreamSize/String1.
    */
    @Nullable
    public final Boolean getSourceStreamSizeString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING1);
    }

   /**
    * Get Source_StreamSize/String1.
    * 
    * @return Source_StreamSize/String1.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING1);
    }

   /**
    * Get Source_StreamSize/String1.
    * 
    * @return Source_StreamSize/String1.
    */
    @Nullable
    public final URL getSourceStreamSizeString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING1);
    }


   /**
    * Get Source Stream size divided by file size.
    * 
    * @return Source Stream size divided by file size.
    */
    @Nullable
    public final Integer getSourceStreamSizeProportionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEPROPORTION);
    }

   /**
    * Get Source Stream size divided by file size.
    * 
    * @return Source Stream size divided by file size.
    */
    @Nullable
    public final Long getSourceStreamSizeProportionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEPROPORTION);
    }

   /**
    * Get Source Stream size divided by file size.
    * 
    * @return Source Stream size divided by file size.
    */
    @Nullable
    public final LocalDateTime getSourceStreamSizeProportionAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEPROPORTION);
    }

   /**
    * Get Source Stream size divided by file size.
    * 
    * @return Source Stream size divided by file size.
    */
    @Nullable
    public final LocalTime getSourceStreamSizeProportionAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEPROPORTION);
    }

   /**
    * Get Source Stream size divided by file size.
    * 
    * @return Source Stream size divided by file size.
    */
    @Nullable
    public final String getSourceStreamSizeProportionAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEPROPORTION);
    }

   /**
    * Get Source Stream size divided by file size.
    * 
    * @return Source Stream size divided by file size.
    */
    @Nullable
    public final Boolean getSourceStreamSizeProportionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEPROPORTION);
    }

   /**
    * Get Source Stream size divided by file size.
    * 
    * @return Source Stream size divided by file size.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeProportionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEPROPORTION);
    }

   /**
    * Get Source Stream size divided by file size.
    * 
    * @return Source Stream size divided by file size.
    */
    @Nullable
    public final URL getSourceStreamSizeProportionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEPROPORTION);
    }


   /**
    * Get Homepage for more details about this codec ID.
    * 
    * @return Homepage for more details about this codec ID.
    */
    @Nullable
    public final Integer getCodecIDUrlAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.CODECIDURL);
    }

   /**
    * Get Homepage for more details about this codec ID.
    * 
    * @return Homepage for more details about this codec ID.
    */
    @Nullable
    public final Long getCodecIDUrlAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.CODECIDURL);
    }

   /**
    * Get Homepage for more details about this codec ID.
    * 
    * @return Homepage for more details about this codec ID.
    */
    @Nullable
    public final LocalDateTime getCodecIDUrlAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.CODECIDURL);
    }

   /**
    * Get Homepage for more details about this codec ID.
    * 
    * @return Homepage for more details about this codec ID.
    */
    @Nullable
    public final LocalTime getCodecIDUrlAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.CODECIDURL);
    }

   /**
    * Get Homepage for more details about this codec ID.
    * 
    * @return Homepage for more details about this codec ID.
    */
    @Nullable
    public final String getCodecIDUrlAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.CODECIDURL);
    }

   /**
    * Get Homepage for more details about this codec ID.
    * 
    * @return Homepage for more details about this codec ID.
    */
    @Nullable
    public final Boolean getCodecIDUrlAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.CODECIDURL);
    }

   /**
    * Get Homepage for more details about this codec ID.
    * 
    * @return Homepage for more details about this codec ID.
    */
    @Nullable
    public final BigInteger getCodecIDUrlAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.CODECIDURL);
    }

   /**
    * Get Homepage for more details about this codec ID.
    * 
    * @return Homepage for more details about this codec ID.
    */
    @Nullable
    public final URL getCodecIDUrlAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.CODECIDURL);
    }


   /**
    * Get Source_StreamSize/String2.
    * 
    * @return Source_StreamSize/String2.
    */
    @Nullable
    public final Integer getSourceStreamSizeString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING2);
    }

   /**
    * Get Source_StreamSize/String2.
    * 
    * @return Source_StreamSize/String2.
    */
    @Nullable
    public final Long getSourceStreamSizeString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING2);
    }

   /**
    * Get Source_StreamSize/String2.
    * 
    * @return Source_StreamSize/String2.
    */
    @Nullable
    public final LocalDateTime getSourceStreamSizeString2AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING2);
    }

   /**
    * Get Source_StreamSize/String2.
    * 
    * @return Source_StreamSize/String2.
    */
    @Nullable
    public final LocalTime getSourceStreamSizeString2AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING2);
    }

   /**
    * Get Source_StreamSize/String2.
    * 
    * @return Source_StreamSize/String2.
    */
    @Nullable
    public final String getSourceStreamSizeString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING2);
    }

   /**
    * Get Source_StreamSize/String2.
    * 
    * @return Source_StreamSize/String2.
    */
    @Nullable
    public final Boolean getSourceStreamSizeString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING2);
    }

   /**
    * Get Source_StreamSize/String2.
    * 
    * @return Source_StreamSize/String2.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING2);
    }

   /**
    * Get Source_StreamSize/String2.
    * 
    * @return Source_StreamSize/String2.
    */
    @Nullable
    public final URL getSourceStreamSizeString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING2);
    }


   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final Integer getSourceStreamSizeString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING5);
    }

   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final Long getSourceStreamSizeString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING5);
    }

   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final LocalDateTime getSourceStreamSizeString5AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING5);
    }

   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final LocalTime getSourceStreamSizeString5AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING5);
    }

   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final String getSourceStreamSizeString5AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING5);
    }

   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final Boolean getSourceStreamSizeString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING5);
    }

   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING5);
    }

   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final URL getSourceStreamSizeString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING5);
    }


   /**
    * Get Source_StreamSize/String3.
    * 
    * @return Source_StreamSize/String3.
    */
    @Nullable
    public final Integer getSourceStreamSizeString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING3);
    }

   /**
    * Get Source_StreamSize/String3.
    * 
    * @return Source_StreamSize/String3.
    */
    @Nullable
    public final Long getSourceStreamSizeString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING3);
    }

   /**
    * Get Source_StreamSize/String3.
    * 
    * @return Source_StreamSize/String3.
    */
    @Nullable
    public final LocalDateTime getSourceStreamSizeString3AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING3);
    }

   /**
    * Get Source_StreamSize/String3.
    * 
    * @return Source_StreamSize/String3.
    */
    @Nullable
    public final LocalTime getSourceStreamSizeString3AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING3);
    }

   /**
    * Get Source_StreamSize/String3.
    * 
    * @return Source_StreamSize/String3.
    */
    @Nullable
    public final String getSourceStreamSizeString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING3);
    }

   /**
    * Get Source_StreamSize/String3.
    * 
    * @return Source_StreamSize/String3.
    */
    @Nullable
    public final Boolean getSourceStreamSizeString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING3);
    }

   /**
    * Get Source_StreamSize/String3.
    * 
    * @return Source_StreamSize/String3.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING3);
    }

   /**
    * Get Source_StreamSize/String3.
    * 
    * @return Source_StreamSize/String3.
    */
    @Nullable
    public final URL getSourceStreamSizeString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING3);
    }


   /**
    * Get Source_StreamSize/String4.
    * 
    * @return Source_StreamSize/String4.
    */
    @Nullable
    public final Integer getSourceStreamSizeString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING4);
    }

   /**
    * Get Source_StreamSize/String4.
    * 
    * @return Source_StreamSize/String4.
    */
    @Nullable
    public final Long getSourceStreamSizeString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING4);
    }

   /**
    * Get Source_StreamSize/String4.
    * 
    * @return Source_StreamSize/String4.
    */
    @Nullable
    public final LocalDateTime getSourceStreamSizeString4AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING4);
    }

   /**
    * Get Source_StreamSize/String4.
    * 
    * @return Source_StreamSize/String4.
    */
    @Nullable
    public final LocalTime getSourceStreamSizeString4AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING4);
    }

   /**
    * Get Source_StreamSize/String4.
    * 
    * @return Source_StreamSize/String4.
    */
    @Nullable
    public final String getSourceStreamSizeString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING4);
    }

   /**
    * Get Source_StreamSize/String4.
    * 
    * @return Source_StreamSize/String4.
    */
    @Nullable
    public final Boolean getSourceStreamSizeString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING4);
    }

   /**
    * Get Source_StreamSize/String4.
    * 
    * @return Source_StreamSize/String4.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING4);
    }

   /**
    * Get Source_StreamSize/String4.
    * 
    * @return Source_StreamSize/String4.
    */
    @Nullable
    public final URL getSourceStreamSizeString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING4);
    }


   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final Integer getDisabledStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DISABLEDSTRING);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final Long getDisabledStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DISABLEDSTRING);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final LocalDateTime getDisabledStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DISABLEDSTRING);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final LocalTime getDisabledStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DISABLEDSTRING);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final String getDisabledStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DISABLEDSTRING);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final Boolean getDisabledStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DISABLEDSTRING);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final BigInteger getDisabledStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DISABLEDSTRING);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final URL getDisabledStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DISABLEDSTRING);
    }


   /**
    * Get Operating System of encoding-software.
    * 
    * @return Operating System of encoding-software.
    */
    @Nullable
    public final Integer getEncodedOperatingSystemAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDOPERATINGSYSTEM);
    }

   /**
    * Get Operating System of encoding-software.
    * 
    * @return Operating System of encoding-software.
    */
    @Nullable
    public final Long getEncodedOperatingSystemAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDOPERATINGSYSTEM);
    }

   /**
    * Get Operating System of encoding-software.
    * 
    * @return Operating System of encoding-software.
    */
    @Nullable
    public final LocalDateTime getEncodedOperatingSystemAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDOPERATINGSYSTEM);
    }

   /**
    * Get Operating System of encoding-software.
    * 
    * @return Operating System of encoding-software.
    */
    @Nullable
    public final LocalTime getEncodedOperatingSystemAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDOPERATINGSYSTEM);
    }

   /**
    * Get Operating System of encoding-software.
    * 
    * @return Operating System of encoding-software.
    */
    @Nullable
    public final String getEncodedOperatingSystemAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDOPERATINGSYSTEM);
    }

   /**
    * Get Operating System of encoding-software.
    * 
    * @return Operating System of encoding-software.
    */
    @Nullable
    public final Boolean getEncodedOperatingSystemAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDOPERATINGSYSTEM);
    }

   /**
    * Get Operating System of encoding-software.
    * 
    * @return Operating System of encoding-software.
    */
    @Nullable
    public final BigInteger getEncodedOperatingSystemAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDOPERATINGSYSTEM);
    }

   /**
    * Get Operating System of encoding-software.
    * 
    * @return Operating System of encoding-software.
    */
    @Nullable
    public final URL getEncodedOperatingSystemAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDOPERATINGSYSTEM);
    }


   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final Integer getEncodedApplicationCompanyNameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATIONCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final Long getEncodedApplicationCompanyNameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATIONCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final LocalDateTime getEncodedApplicationCompanyNameAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATIONCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final LocalTime getEncodedApplicationCompanyNameAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATIONCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final String getEncodedApplicationCompanyNameAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATIONCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final Boolean getEncodedApplicationCompanyNameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATIONCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final BigInteger getEncodedApplicationCompanyNameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATIONCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final URL getEncodedApplicationCompanyNameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATIONCOMPANYNAME);
    }


   /**
    * Get Current stream size divided by uncompressed stream size.
    * 
    * @return Current stream size divided by uncompressed stream size.
    */
    @Nullable
    public final Integer getCompressionRatioAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.COMPRESSIONRATIO);
    }

   /**
    * Get Current stream size divided by uncompressed stream size.
    * 
    * @return Current stream size divided by uncompressed stream size.
    */
    @Nullable
    public final Long getCompressionRatioAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.COMPRESSIONRATIO);
    }

   /**
    * Get Current stream size divided by uncompressed stream size.
    * 
    * @return Current stream size divided by uncompressed stream size.
    */
    @Nullable
    public final LocalDateTime getCompressionRatioAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.COMPRESSIONRATIO);
    }

   /**
    * Get Current stream size divided by uncompressed stream size.
    * 
    * @return Current stream size divided by uncompressed stream size.
    */
    @Nullable
    public final LocalTime getCompressionRatioAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.COMPRESSIONRATIO);
    }

   /**
    * Get Current stream size divided by uncompressed stream size.
    * 
    * @return Current stream size divided by uncompressed stream size.
    */
    @Nullable
    public final String getCompressionRatioAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.COMPRESSIONRATIO);
    }

   /**
    * Get Current stream size divided by uncompressed stream size.
    * 
    * @return Current stream size divided by uncompressed stream size.
    */
    @Nullable
    public final Boolean getCompressionRatioAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.COMPRESSIONRATIO);
    }

   /**
    * Get Current stream size divided by uncompressed stream size.
    * 
    * @return Current stream size divided by uncompressed stream size.
    */
    @Nullable
    public final BigInteger getCompressionRatioAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.COMPRESSIONRATIO);
    }

   /**
    * Get Current stream size divided by uncompressed stream size.
    * 
    * @return Current stream size divided by uncompressed stream size.
    */
    @Nullable
    public final URL getCompressionRatioAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.COMPRESSIONRATIO);
    }


   /**
    * Get Commercial name used by vendor for theses setings if there is one.
    * 
    * @return Commercial name used by vendor for theses setings if there is one.
    */
    @Nullable
    public final Integer getFormatCommercialIfAnyAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATCOMMERCIALIFANY);
    }

   /**
    * Get Commercial name used by vendor for theses setings if there is one.
    * 
    * @return Commercial name used by vendor for theses setings if there is one.
    */
    @Nullable
    public final Long getFormatCommercialIfAnyAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.FORMATCOMMERCIALIFANY);
    }

   /**
    * Get Commercial name used by vendor for theses setings if there is one.
    * 
    * @return Commercial name used by vendor for theses setings if there is one.
    */
    @Nullable
    public final LocalDateTime getFormatCommercialIfAnyAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATCOMMERCIALIFANY);
    }

   /**
    * Get Commercial name used by vendor for theses setings if there is one.
    * 
    * @return Commercial name used by vendor for theses setings if there is one.
    */
    @Nullable
    public final LocalTime getFormatCommercialIfAnyAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATCOMMERCIALIFANY);
    }

   /**
    * Get Commercial name used by vendor for theses setings if there is one.
    * 
    * @return Commercial name used by vendor for theses setings if there is one.
    */
    @Nullable
    public final String getFormatCommercialIfAnyAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.FORMATCOMMERCIALIFANY);
    }

   /**
    * Get Commercial name used by vendor for theses setings if there is one.
    * 
    * @return Commercial name used by vendor for theses setings if there is one.
    */
    @Nullable
    public final Boolean getFormatCommercialIfAnyAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.FORMATCOMMERCIALIFANY);
    }

   /**
    * Get Commercial name used by vendor for theses setings if there is one.
    * 
    * @return Commercial name used by vendor for theses setings if there is one.
    */
    @Nullable
    public final BigInteger getFormatCommercialIfAnyAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATCOMMERCIALIFANY);
    }

   /**
    * Get Commercial name used by vendor for theses setings if there is one.
    * 
    * @return Commercial name used by vendor for theses setings if there is one.
    */
    @Nullable
    public final URL getFormatCommercialIfAnyAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.FORMATCOMMERCIALIFANY);
    }


   /**
    * Get UTC time that the tags were done for this item..
    * 
    * @return UTC time that the tags were done for this item..
    */
    @Nullable
    public final Integer getTaggedDateAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.TAGGEDDATE);
    }

   /**
    * Get UTC time that the tags were done for this item..
    * 
    * @return UTC time that the tags were done for this item..
    */
    @Nullable
    public final Long getTaggedDateAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.TAGGEDDATE);
    }

   /**
    * Get UTC time that the tags were done for this item..
    * 
    * @return UTC time that the tags were done for this item..
    */
    @Nullable
    public final LocalDateTime getTaggedDateAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.TAGGEDDATE);
    }

   /**
    * Get UTC time that the tags were done for this item..
    * 
    * @return UTC time that the tags were done for this item..
    */
    @Nullable
    public final LocalTime getTaggedDateAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.TAGGEDDATE);
    }

   /**
    * Get UTC time that the tags were done for this item..
    * 
    * @return UTC time that the tags were done for this item..
    */
    @Nullable
    public final String getTaggedDateAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.TAGGEDDATE);
    }

   /**
    * Get UTC time that the tags were done for this item..
    * 
    * @return UTC time that the tags were done for this item..
    */
    @Nullable
    public final Boolean getTaggedDateAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.TAGGEDDATE);
    }

   /**
    * Get UTC time that the tags were done for this item..
    * 
    * @return UTC time that the tags were done for this item..
    */
    @Nullable
    public final BigInteger getTaggedDateAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.TAGGEDDATE);
    }

   /**
    * Get UTC time that the tags were done for this item..
    * 
    * @return UTC time that the tags were done for this item..
    */
    @Nullable
    public final URL getTaggedDateAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.TAGGEDDATE);
    }


   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final Integer getIDStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.IDSTRING);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final Long getIDStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.IDSTRING);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final LocalDateTime getIDStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.IDSTRING);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final LocalTime getIDStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.IDSTRING);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final String getIDStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.IDSTRING);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final Boolean getIDStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.IDSTRING);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final BigInteger getIDStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.IDSTRING);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final URL getIDStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.IDSTRING);
    }


   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final Integer getCompressionModeAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.COMPRESSIONMODE);
    }

   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final Long getCompressionModeAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.COMPRESSIONMODE);
    }

   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final LocalDateTime getCompressionModeAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.COMPRESSIONMODE);
    }

   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final LocalTime getCompressionModeAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.COMPRESSIONMODE);
    }

   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final String getCompressionModeAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.COMPRESSIONMODE);
    }

   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final Boolean getCompressionModeAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.COMPRESSIONMODE);
    }

   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final BigInteger getCompressionModeAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.COMPRESSIONMODE);
    }

   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final URL getCompressionModeAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.COMPRESSIONMODE);
    }


   /**
    * Get Bit rate in bps.
    * 
    * @return Bit rate in bps.
    */
    @Nullable
    public final Integer getBitRateAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.BITRATE);
    }

   /**
    * Get Bit rate in bps.
    * 
    * @return Bit rate in bps.
    */
    @Nullable
    public final Long getBitRateAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.BITRATE);
    }

   /**
    * Get Bit rate in bps.
    * 
    * @return Bit rate in bps.
    */
    @Nullable
    public final LocalDateTime getBitRateAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.BITRATE);
    }

   /**
    * Get Bit rate in bps.
    * 
    * @return Bit rate in bps.
    */
    @Nullable
    public final LocalTime getBitRateAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.BITRATE);
    }

   /**
    * Get Bit rate in bps.
    * 
    * @return Bit rate in bps.
    */
    @Nullable
    public final String getBitRateAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.BITRATE);
    }

   /**
    * Get Bit rate in bps.
    * 
    * @return Bit rate in bps.
    */
    @Nullable
    public final Boolean getBitRateAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.BITRATE);
    }

   /**
    * Get Bit rate in bps.
    * 
    * @return Bit rate in bps.
    */
    @Nullable
    public final BigInteger getBitRateAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.BITRATE);
    }

   /**
    * Get Bit rate in bps.
    * 
    * @return Bit rate in bps.
    */
    @Nullable
    public final URL getBitRateAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.BITRATE);
    }


   /**
    * Get UTC time that the encoding of this item was completed began..
    * 
    * @return UTC time that the encoding of this item was completed began..
    */
    @Nullable
    public final Integer getEncodedDateAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDDATE);
    }

   /**
    * Get UTC time that the encoding of this item was completed began..
    * 
    * @return UTC time that the encoding of this item was completed began..
    */
    @Nullable
    public final Long getEncodedDateAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDDATE);
    }

   /**
    * Get UTC time that the encoding of this item was completed began..
    * 
    * @return UTC time that the encoding of this item was completed began..
    */
    @Nullable
    public final LocalDateTime getEncodedDateAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDDATE);
    }

   /**
    * Get UTC time that the encoding of this item was completed began..
    * 
    * @return UTC time that the encoding of this item was completed began..
    */
    @Nullable
    public final LocalTime getEncodedDateAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDDATE);
    }

   /**
    * Get UTC time that the encoding of this item was completed began..
    * 
    * @return UTC time that the encoding of this item was completed began..
    */
    @Nullable
    public final String getEncodedDateAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDDATE);
    }

   /**
    * Get UTC time that the encoding of this item was completed began..
    * 
    * @return UTC time that the encoding of this item was completed began..
    */
    @Nullable
    public final Boolean getEncodedDateAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDDATE);
    }

   /**
    * Get UTC time that the encoding of this item was completed began..
    * 
    * @return UTC time that the encoding of this item was completed began..
    */
    @Nullable
    public final BigInteger getEncodedDateAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDDATE);
    }

   /**
    * Get UTC time that the encoding of this item was completed began..
    * 
    * @return UTC time that the encoding of this item was completed began..
    */
    @Nullable
    public final URL getEncodedDateAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDDATE);
    }


   /**
    * Get Bit rate mode (VBR, CBR).
    * 
    * @return Bit rate mode (VBR, CBR).
    */
    @Nullable
    public final Integer getBitRateModeAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMODE);
    }

   /**
    * Get Bit rate mode (VBR, CBR).
    * 
    * @return Bit rate mode (VBR, CBR).
    */
    @Nullable
    public final Long getBitRateModeAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMODE);
    }

   /**
    * Get Bit rate mode (VBR, CBR).
    * 
    * @return Bit rate mode (VBR, CBR).
    */
    @Nullable
    public final LocalDateTime getBitRateModeAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMODE);
    }

   /**
    * Get Bit rate mode (VBR, CBR).
    * 
    * @return Bit rate mode (VBR, CBR).
    */
    @Nullable
    public final LocalTime getBitRateModeAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMODE);
    }

   /**
    * Get Bit rate mode (VBR, CBR).
    * 
    * @return Bit rate mode (VBR, CBR).
    */
    @Nullable
    public final String getBitRateModeAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMODE);
    }

   /**
    * Get Bit rate mode (VBR, CBR).
    * 
    * @return Bit rate mode (VBR, CBR).
    */
    @Nullable
    public final Boolean getBitRateModeAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMODE);
    }

   /**
    * Get Bit rate mode (VBR, CBR).
    * 
    * @return Bit rate mode (VBR, CBR).
    */
    @Nullable
    public final BigInteger getBitRateModeAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMODE);
    }

   /**
    * Get Bit rate mode (VBR, CBR).
    * 
    * @return Bit rate mode (VBR, CBR).
    */
    @Nullable
    public final URL getBitRateModeAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMODE);
    }


   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final Integer getUniqueIDAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.UNIQUEID);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final Long getUniqueIDAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.UNIQUEID);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final LocalDateTime getUniqueIDAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.UNIQUEID);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final LocalTime getUniqueIDAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.UNIQUEID);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final String getUniqueIDAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.UNIQUEID);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final Boolean getUniqueIDAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.UNIQUEID);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final BigInteger getUniqueIDAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.UNIQUEID);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final URL getUniqueIDAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.UNIQUEID);
    }


   /**
    * Get Maximum Bit rate (with measurement).
    * 
    * @return Maximum Bit rate (with measurement).
    */
    @Nullable
    public final Integer getBitRateMaximumStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMAXIMUMSTRING);
    }

   /**
    * Get Maximum Bit rate (with measurement).
    * 
    * @return Maximum Bit rate (with measurement).
    */
    @Nullable
    public final Long getBitRateMaximumStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMAXIMUMSTRING);
    }

   /**
    * Get Maximum Bit rate (with measurement).
    * 
    * @return Maximum Bit rate (with measurement).
    */
    @Nullable
    public final LocalDateTime getBitRateMaximumStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMAXIMUMSTRING);
    }

   /**
    * Get Maximum Bit rate (with measurement).
    * 
    * @return Maximum Bit rate (with measurement).
    */
    @Nullable
    public final LocalTime getBitRateMaximumStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMAXIMUMSTRING);
    }

   /**
    * Get Maximum Bit rate (with measurement).
    * 
    * @return Maximum Bit rate (with measurement).
    */
    @Nullable
    public final String getBitRateMaximumStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMAXIMUMSTRING);
    }

   /**
    * Get Maximum Bit rate (with measurement).
    * 
    * @return Maximum Bit rate (with measurement).
    */
    @Nullable
    public final Boolean getBitRateMaximumStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMAXIMUMSTRING);
    }

   /**
    * Get Maximum Bit rate (with measurement).
    * 
    * @return Maximum Bit rate (with measurement).
    */
    @Nullable
    public final BigInteger getBitRateMaximumStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMAXIMUMSTRING);
    }

   /**
    * Get Maximum Bit rate (with measurement).
    * 
    * @return Maximum Bit rate (with measurement).
    */
    @Nullable
    public final URL getBitRateMaximumStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMAXIMUMSTRING);
    }


   /**
    * Get Delay in format : HH:MM:SS.MMM.
    * 
    * @return Delay in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Integer getDelayString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING3);
    }

   /**
    * Get Delay in format : HH:MM:SS.MMM.
    * 
    * @return Delay in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Long getDelayString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING3);
    }

   /**
    * Get Delay in format : HH:MM:SS.MMM.
    * 
    * @return Delay in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalDateTime getDelayString3AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING3);
    }

   /**
    * Get Delay in format : HH:MM:SS.MMM.
    * 
    * @return Delay in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalTime getDelayString3AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING3);
    }

   /**
    * Get Delay in format : HH:MM:SS.MMM.
    * 
    * @return Delay in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final String getDelayString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING3);
    }

   /**
    * Get Delay in format : HH:MM:SS.MMM.
    * 
    * @return Delay in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Boolean getDelayString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING3);
    }

   /**
    * Get Delay in format : HH:MM:SS.MMM.
    * 
    * @return Delay in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final BigInteger getDelayString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING3);
    }

   /**
    * Get Delay in format : HH:MM:SS.MMM.
    * 
    * @return Delay in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final URL getDelayString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING3);
    }


   /**
    * Get Video_Delay/String.
    * 
    * @return Video_Delay/String.
    */
    @Nullable
    public final Integer getVideoDelayStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING);
    }

   /**
    * Get Video_Delay/String.
    * 
    * @return Video_Delay/String.
    */
    @Nullable
    public final Long getVideoDelayStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING);
    }

   /**
    * Get Video_Delay/String.
    * 
    * @return Video_Delay/String.
    */
    @Nullable
    public final LocalDateTime getVideoDelayStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING);
    }

   /**
    * Get Video_Delay/String.
    * 
    * @return Video_Delay/String.
    */
    @Nullable
    public final LocalTime getVideoDelayStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING);
    }

   /**
    * Get Video_Delay/String.
    * 
    * @return Video_Delay/String.
    */
    @Nullable
    public final String getVideoDelayStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING);
    }

   /**
    * Get Video_Delay/String.
    * 
    * @return Video_Delay/String.
    */
    @Nullable
    public final Boolean getVideoDelayStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING);
    }

   /**
    * Get Video_Delay/String.
    * 
    * @return Video_Delay/String.
    */
    @Nullable
    public final BigInteger getVideoDelayStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING);
    }

   /**
    * Get Video_Delay/String.
    * 
    * @return Video_Delay/String.
    */
    @Nullable
    public final URL getVideoDelayStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING);
    }


   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Integer getDelayString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING4);
    }

   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Long getDelayString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING4);
    }

   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalDateTime getDelayString4AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING4);
    }

   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalTime getDelayString4AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING4);
    }

   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final String getDelayString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING4);
    }

   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Boolean getDelayString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING4);
    }

   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final BigInteger getDelayString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING4);
    }

   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final URL getDelayString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING4);
    }


   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Integer getDelayString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Long getDelayString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final LocalDateTime getDelayString1AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final LocalTime getDelayString1AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final String getDelayString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Boolean getDelayString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final BigInteger getDelayString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final URL getDelayString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING1);
    }


   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Integer getDelayString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Long getDelayString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final LocalDateTime getDelayString2AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final LocalTime getDelayString2AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final String getDelayString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Boolean getDelayString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final BigInteger getDelayString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final URL getDelayString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING2);
    }


   /**
    * Get Number of channels (with measurement).
    * 
    * @return Number of channels (with measurement).
    */
    @Nullable
    public final Integer getChannelsStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.CHANNELSSTRING);
    }

   /**
    * Get Number of channels (with measurement).
    * 
    * @return Number of channels (with measurement).
    */
    @Nullable
    public final Long getChannelsStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.CHANNELSSTRING);
    }

   /**
    * Get Number of channels (with measurement).
    * 
    * @return Number of channels (with measurement).
    */
    @Nullable
    public final LocalDateTime getChannelsStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.CHANNELSSTRING);
    }

   /**
    * Get Number of channels (with measurement).
    * 
    * @return Number of channels (with measurement).
    */
    @Nullable
    public final LocalTime getChannelsStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.CHANNELSSTRING);
    }

   /**
    * Get Number of channels (with measurement).
    * 
    * @return Number of channels (with measurement).
    */
    @Nullable
    public final String getChannelsStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.CHANNELSSTRING);
    }

   /**
    * Get Number of channels (with measurement).
    * 
    * @return Number of channels (with measurement).
    */
    @Nullable
    public final Boolean getChannelsStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.CHANNELSSTRING);
    }

   /**
    * Get Number of channels (with measurement).
    * 
    * @return Number of channels (with measurement).
    */
    @Nullable
    public final BigInteger getChannelsStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.CHANNELSSTRING);
    }

   /**
    * Get Number of channels (with measurement).
    * 
    * @return Number of channels (with measurement).
    */
    @Nullable
    public final URL getChannelsStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.CHANNELSSTRING);
    }


   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Integer getDelayString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Long getDelayString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalDateTime getDelayString5AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalTime getDelayString5AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final String getDelayString5AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Boolean getDelayString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final BigInteger getDelayString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final URL getDelayString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DELAYSTRING5);
    }


   /**
    * Get How much time is buffered before the first video frame.
    * 
    * @return How much time is buffered before the first video frame.
    */
    @Nullable
    public final Integer getInterleavePreloadAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVEPRELOAD);
    }

   /**
    * Get How much time is buffered before the first video frame.
    * 
    * @return How much time is buffered before the first video frame.
    */
    @Nullable
    public final Long getInterleavePreloadAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVEPRELOAD);
    }

   /**
    * Get How much time is buffered before the first video frame.
    * 
    * @return How much time is buffered before the first video frame.
    */
    @Nullable
    public final LocalDateTime getInterleavePreloadAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVEPRELOAD);
    }

   /**
    * Get How much time is buffered before the first video frame.
    * 
    * @return How much time is buffered before the first video frame.
    */
    @Nullable
    public final LocalTime getInterleavePreloadAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVEPRELOAD);
    }

   /**
    * Get How much time is buffered before the first video frame.
    * 
    * @return How much time is buffered before the first video frame.
    */
    @Nullable
    public final String getInterleavePreloadAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVEPRELOAD);
    }

   /**
    * Get How much time is buffered before the first video frame.
    * 
    * @return How much time is buffered before the first video frame.
    */
    @Nullable
    public final Boolean getInterleavePreloadAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVEPRELOAD);
    }

   /**
    * Get How much time is buffered before the first video frame.
    * 
    * @return How much time is buffered before the first video frame.
    */
    @Nullable
    public final BigInteger getInterleavePreloadAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVEPRELOAD);
    }

   /**
    * Get How much time is buffered before the first video frame.
    * 
    * @return How much time is buffered before the first video frame.
    */
    @Nullable
    public final URL getInterleavePreloadAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVEPRELOAD);
    }


   /**
    * Get Position of channels after matrix decoding (x/y.z format).
    * 
    * @return Position of channels after matrix decoding (x/y.z format).
    */
    @Nullable
    public final Integer getMatrixChannelPositionsString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.MATRIXCHANNELPOSITIONSSTRING2);
    }

   /**
    * Get Position of channels after matrix decoding (x/y.z format).
    * 
    * @return Position of channels after matrix decoding (x/y.z format).
    */
    @Nullable
    public final Long getMatrixChannelPositionsString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.MATRIXCHANNELPOSITIONSSTRING2);
    }

   /**
    * Get Position of channels after matrix decoding (x/y.z format).
    * 
    * @return Position of channels after matrix decoding (x/y.z format).
    */
    @Nullable
    public final LocalDateTime getMatrixChannelPositionsString2AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.MATRIXCHANNELPOSITIONSSTRING2);
    }

   /**
    * Get Position of channels after matrix decoding (x/y.z format).
    * 
    * @return Position of channels after matrix decoding (x/y.z format).
    */
    @Nullable
    public final LocalTime getMatrixChannelPositionsString2AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.MATRIXCHANNELPOSITIONSSTRING2);
    }

   /**
    * Get Position of channels after matrix decoding (x/y.z format).
    * 
    * @return Position of channels after matrix decoding (x/y.z format).
    */
    @Nullable
    public final String getMatrixChannelPositionsString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.MATRIXCHANNELPOSITIONSSTRING2);
    }

   /**
    * Get Position of channels after matrix decoding (x/y.z format).
    * 
    * @return Position of channels after matrix decoding (x/y.z format).
    */
    @Nullable
    public final Boolean getMatrixChannelPositionsString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.MATRIXCHANNELPOSITIONSSTRING2);
    }

   /**
    * Get Position of channels after matrix decoding (x/y.z format).
    * 
    * @return Position of channels after matrix decoding (x/y.z format).
    */
    @Nullable
    public final BigInteger getMatrixChannelPositionsString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.MATRIXCHANNELPOSITIONSSTRING2);
    }

   /**
    * Get Position of channels after matrix decoding (x/y.z format).
    * 
    * @return Position of channels after matrix decoding (x/y.z format).
    */
    @Nullable
    public final URL getMatrixChannelPositionsString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.MATRIXCHANNELPOSITIONSSTRING2);
    }


   /**
    * Get Format_Settings_SBR.
    * 
    * @return Format_Settings_SBR.
    */
    @Nullable
    public final Integer getFormatSettingsSBRAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSSBR);
    }

   /**
    * Get Format_Settings_SBR.
    * 
    * @return Format_Settings_SBR.
    */
    @Nullable
    public final Long getFormatSettingsSBRAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSSBR);
    }

   /**
    * Get Format_Settings_SBR.
    * 
    * @return Format_Settings_SBR.
    */
    @Nullable
    public final LocalDateTime getFormatSettingsSBRAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSSBR);
    }

   /**
    * Get Format_Settings_SBR.
    * 
    * @return Format_Settings_SBR.
    */
    @Nullable
    public final LocalTime getFormatSettingsSBRAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSSBR);
    }

   /**
    * Get Format_Settings_SBR.
    * 
    * @return Format_Settings_SBR.
    */
    @Nullable
    public final String getFormatSettingsSBRAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSSBR);
    }

   /**
    * Get Format_Settings_SBR.
    * 
    * @return Format_Settings_SBR.
    */
    @Nullable
    public final Boolean getFormatSettingsSBRAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSSBR);
    }

   /**
    * Get Format_Settings_SBR.
    * 
    * @return Format_Settings_SBR.
    */
    @Nullable
    public final BigInteger getFormatSettingsSBRAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSSBR);
    }

   /**
    * Get Format_Settings_SBR.
    * 
    * @return Format_Settings_SBR.
    */
    @Nullable
    public final URL getFormatSettingsSBRAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSSBR);
    }


   /**
    * Get Delay fixed in the stream (relative) IN MS.
    * 
    * @return Delay fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final Integer getDelayAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DELAY);
    }

   /**
    * Get Delay fixed in the stream (relative) IN MS.
    * 
    * @return Delay fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final Long getDelayAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DELAY);
    }

   /**
    * Get Delay fixed in the stream (relative) IN MS.
    * 
    * @return Delay fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final LocalDateTime getDelayAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DELAY);
    }

   /**
    * Get Delay fixed in the stream (relative) IN MS.
    * 
    * @return Delay fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final LocalTime getDelayAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DELAY);
    }

   /**
    * Get Delay fixed in the stream (relative) IN MS.
    * 
    * @return Delay fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final String getDelayAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DELAY);
    }

   /**
    * Get Delay fixed in the stream (relative) IN MS.
    * 
    * @return Delay fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final Boolean getDelayAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DELAY);
    }

   /**
    * Get Delay fixed in the stream (relative) IN MS.
    * 
    * @return Delay fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final BigInteger getDelayAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DELAY);
    }

   /**
    * Get Delay fixed in the stream (relative) IN MS.
    * 
    * @return Delay fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final URL getDelayAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DELAY);
    }


   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit..
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit..
    */
    @Nullable
    public final Integer getEncodedApplicationUrlAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATIONURL);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit..
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit..
    */
    @Nullable
    public final Long getEncodedApplicationUrlAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATIONURL);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit..
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit..
    */
    @Nullable
    public final LocalDateTime getEncodedApplicationUrlAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATIONURL);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit..
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit..
    */
    @Nullable
    public final LocalTime getEncodedApplicationUrlAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATIONURL);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit..
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit..
    */
    @Nullable
    public final String getEncodedApplicationUrlAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATIONURL);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit..
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit..
    */
    @Nullable
    public final Boolean getEncodedApplicationUrlAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATIONURL);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit..
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit..
    */
    @Nullable
    public final BigInteger getEncodedApplicationUrlAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATIONURL);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit..
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit..
    */
    @Nullable
    public final URL getEncodedApplicationUrlAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATIONURL);
    }


   /**
    * Get Source_StreamSize_Encoded/String4.
    * 
    * @return Source_StreamSize_Encoded/String4.
    */
    @Nullable
    public final Integer getSourceStreamSizeEncodedString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING4);
    }

   /**
    * Get Source_StreamSize_Encoded/String4.
    * 
    * @return Source_StreamSize_Encoded/String4.
    */
    @Nullable
    public final Long getSourceStreamSizeEncodedString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING4);
    }

   /**
    * Get Source_StreamSize_Encoded/String4.
    * 
    * @return Source_StreamSize_Encoded/String4.
    */
    @Nullable
    public final LocalDateTime getSourceStreamSizeEncodedString4AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING4);
    }

   /**
    * Get Source_StreamSize_Encoded/String4.
    * 
    * @return Source_StreamSize_Encoded/String4.
    */
    @Nullable
    public final LocalTime getSourceStreamSizeEncodedString4AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING4);
    }

   /**
    * Get Source_StreamSize_Encoded/String4.
    * 
    * @return Source_StreamSize_Encoded/String4.
    */
    @Nullable
    public final String getSourceStreamSizeEncodedString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING4);
    }

   /**
    * Get Source_StreamSize_Encoded/String4.
    * 
    * @return Source_StreamSize_Encoded/String4.
    */
    @Nullable
    public final Boolean getSourceStreamSizeEncodedString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING4);
    }

   /**
    * Get Source_StreamSize_Encoded/String4.
    * 
    * @return Source_StreamSize_Encoded/String4.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeEncodedString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING4);
    }

   /**
    * Get Source_StreamSize_Encoded/String4.
    * 
    * @return Source_StreamSize_Encoded/String4.
    */
    @Nullable
    public final URL getSourceStreamSizeEncodedString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING4);
    }


   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final Integer getSourceStreamSizeEncodedString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING5);
    }

   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final Long getSourceStreamSizeEncodedString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING5);
    }

   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final LocalDateTime getSourceStreamSizeEncodedString5AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING5);
    }

   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final LocalTime getSourceStreamSizeEncodedString5AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING5);
    }

   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final String getSourceStreamSizeEncodedString5AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING5);
    }

   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final Boolean getSourceStreamSizeEncodedString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING5);
    }

   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeEncodedString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING5);
    }

   /**
    * Get Source Encoded Streamsize in with percentage value.
    * 
    * @return Source Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final URL getSourceStreamSizeEncodedString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING5);
    }


   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Integer getSourceDurationFirstFrameString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING1);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Long getSourceDurationFirstFrameString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING1);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final LocalDateTime getSourceDurationFirstFrameString1AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING1);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final LocalTime getSourceDurationFirstFrameString1AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING1);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final String getSourceDurationFirstFrameString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING1);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Boolean getSourceDurationFirstFrameString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING1);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final BigInteger getSourceDurationFirstFrameString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING1);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final URL getSourceDurationFirstFrameString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING1);
    }


   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Integer getSourceDurationFirstFrameString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING2);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Long getSourceDurationFirstFrameString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING2);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalDateTime getSourceDurationFirstFrameString2AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING2);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalTime getSourceDurationFirstFrameString2AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING2);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final String getSourceDurationFirstFrameString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING2);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Boolean getSourceDurationFirstFrameString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING2);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final BigInteger getSourceDurationFirstFrameString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING2);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final URL getSourceDurationFirstFrameString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING2);
    }


   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Integer getSourceDurationFirstFrameString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING3);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Long getSourceDurationFirstFrameString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING3);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalDateTime getSourceDurationFirstFrameString3AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING3);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalTime getSourceDurationFirstFrameString3AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING3);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final String getSourceDurationFirstFrameString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING3);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Boolean getSourceDurationFirstFrameString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING3);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final BigInteger getSourceDurationFirstFrameString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING3);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final URL getSourceDurationFirstFrameString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING3);
    }


   /**
    * Get Software used to create the file.
    * 
    * @return Software used to create the file.
    */
    @Nullable
    public final Integer getEncodedLibraryAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARY);
    }

   /**
    * Get Software used to create the file.
    * 
    * @return Software used to create the file.
    */
    @Nullable
    public final Long getEncodedLibraryAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARY);
    }

   /**
    * Get Software used to create the file.
    * 
    * @return Software used to create the file.
    */
    @Nullable
    public final LocalDateTime getEncodedLibraryAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARY);
    }

   /**
    * Get Software used to create the file.
    * 
    * @return Software used to create the file.
    */
    @Nullable
    public final LocalTime getEncodedLibraryAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARY);
    }

   /**
    * Get Software used to create the file.
    * 
    * @return Software used to create the file.
    */
    @Nullable
    public final String getEncodedLibraryAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARY);
    }

   /**
    * Get Software used to create the file.
    * 
    * @return Software used to create the file.
    */
    @Nullable
    public final Boolean getEncodedLibraryAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARY);
    }

   /**
    * Get Software used to create the file.
    * 
    * @return Software used to create the file.
    */
    @Nullable
    public final BigInteger getEncodedLibraryAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARY);
    }

   /**
    * Get Software used to create the file.
    * 
    * @return Software used to create the file.
    */
    @Nullable
    public final URL getEncodedLibraryAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARY);
    }


   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Integer getSourceDurationFirstFrameString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING4);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Long getSourceDurationFirstFrameString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING4);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalDateTime getSourceDurationFirstFrameString4AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING4);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalTime getSourceDurationFirstFrameString4AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING4);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final String getSourceDurationFirstFrameString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING4);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Boolean getSourceDurationFirstFrameString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING4);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final BigInteger getSourceDurationFirstFrameString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING4);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final URL getSourceDurationFirstFrameString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING4);
    }


   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Integer getSourceDurationFirstFrameString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING5);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Long getSourceDurationFirstFrameString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING5);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalDateTime getSourceDurationFirstFrameString5AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING5);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalTime getSourceDurationFirstFrameString5AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING5);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final String getSourceDurationFirstFrameString5AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING5);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Boolean getSourceDurationFirstFrameString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING5);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final BigInteger getSourceDurationFirstFrameString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING5);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final URL getSourceDurationFirstFrameString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAMESTRING5);
    }


   /**
    * Get Internet Media Type (aka MIME Type, Content-Type).
    * 
    * @return Internet Media Type (aka MIME Type, Content-Type).
    */
    @Nullable
    public final Integer getInternetMediaTypeAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.INTERNETMEDIATYPE);
    }

   /**
    * Get Internet Media Type (aka MIME Type, Content-Type).
    * 
    * @return Internet Media Type (aka MIME Type, Content-Type).
    */
    @Nullable
    public final Long getInternetMediaTypeAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.INTERNETMEDIATYPE);
    }

   /**
    * Get Internet Media Type (aka MIME Type, Content-Type).
    * 
    * @return Internet Media Type (aka MIME Type, Content-Type).
    */
    @Nullable
    public final LocalDateTime getInternetMediaTypeAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.INTERNETMEDIATYPE);
    }

   /**
    * Get Internet Media Type (aka MIME Type, Content-Type).
    * 
    * @return Internet Media Type (aka MIME Type, Content-Type).
    */
    @Nullable
    public final LocalTime getInternetMediaTypeAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.INTERNETMEDIATYPE);
    }

   /**
    * Get Internet Media Type (aka MIME Type, Content-Type).
    * 
    * @return Internet Media Type (aka MIME Type, Content-Type).
    */
    @Nullable
    public final String getInternetMediaTypeAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.INTERNETMEDIATYPE);
    }

   /**
    * Get Internet Media Type (aka MIME Type, Content-Type).
    * 
    * @return Internet Media Type (aka MIME Type, Content-Type).
    */
    @Nullable
    public final Boolean getInternetMediaTypeAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.INTERNETMEDIATYPE);
    }

   /**
    * Get Internet Media Type (aka MIME Type, Content-Type).
    * 
    * @return Internet Media Type (aka MIME Type, Content-Type).
    */
    @Nullable
    public final BigInteger getInternetMediaTypeAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.INTERNETMEDIATYPE);
    }

   /**
    * Get Internet Media Type (aka MIME Type, Content-Type).
    * 
    * @return Internet Media Type (aka MIME Type, Content-Type).
    */
    @Nullable
    public final URL getInternetMediaTypeAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.INTERNETMEDIATYPE);
    }


   /**
    * Get Source_StreamSize_Encoded/String2.
    * 
    * @return Source_StreamSize_Encoded/String2.
    */
    @Nullable
    public final Integer getSourceStreamSizeEncodedString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING2);
    }

   /**
    * Get Source_StreamSize_Encoded/String2.
    * 
    * @return Source_StreamSize_Encoded/String2.
    */
    @Nullable
    public final Long getSourceStreamSizeEncodedString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING2);
    }

   /**
    * Get Source_StreamSize_Encoded/String2.
    * 
    * @return Source_StreamSize_Encoded/String2.
    */
    @Nullable
    public final LocalDateTime getSourceStreamSizeEncodedString2AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING2);
    }

   /**
    * Get Source_StreamSize_Encoded/String2.
    * 
    * @return Source_StreamSize_Encoded/String2.
    */
    @Nullable
    public final LocalTime getSourceStreamSizeEncodedString2AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING2);
    }

   /**
    * Get Source_StreamSize_Encoded/String2.
    * 
    * @return Source_StreamSize_Encoded/String2.
    */
    @Nullable
    public final String getSourceStreamSizeEncodedString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING2);
    }

   /**
    * Get Source_StreamSize_Encoded/String2.
    * 
    * @return Source_StreamSize_Encoded/String2.
    */
    @Nullable
    public final Boolean getSourceStreamSizeEncodedString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING2);
    }

   /**
    * Get Source_StreamSize_Encoded/String2.
    * 
    * @return Source_StreamSize_Encoded/String2.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeEncodedString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING2);
    }

   /**
    * Get Source_StreamSize_Encoded/String2.
    * 
    * @return Source_StreamSize_Encoded/String2.
    */
    @Nullable
    public final URL getSourceStreamSizeEncodedString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING2);
    }


   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final Integer getDisabledAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DISABLED);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final Long getDisabledAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DISABLED);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final LocalDateTime getDisabledAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DISABLED);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final LocalTime getDisabledAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DISABLED);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final String getDisabledAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DISABLED);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final Boolean getDisabledAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DISABLED);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final BigInteger getDisabledAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DISABLED);
    }

   /**
    * Get Set if that track should not be used.
    * 
    * @return Set if that track should not be used.
    */
    @Nullable
    public final URL getDisabledAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DISABLED);
    }


   /**
    * Get Number of channels.
    * 
    * @return Number of channels.
    */
    @Nullable
    public final Integer getChannelsOriginalAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.CHANNELSORIGINAL);
    }

   /**
    * Get Number of channels.
    * 
    * @return Number of channels.
    */
    @Nullable
    public final Long getChannelsOriginalAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.CHANNELSORIGINAL);
    }

   /**
    * Get Number of channels.
    * 
    * @return Number of channels.
    */
    @Nullable
    public final LocalDateTime getChannelsOriginalAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.CHANNELSORIGINAL);
    }

   /**
    * Get Number of channels.
    * 
    * @return Number of channels.
    */
    @Nullable
    public final LocalTime getChannelsOriginalAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.CHANNELSORIGINAL);
    }

   /**
    * Get Number of channels.
    * 
    * @return Number of channels.
    */
    @Nullable
    public final String getChannelsOriginalAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.CHANNELSORIGINAL);
    }

   /**
    * Get Number of channels.
    * 
    * @return Number of channels.
    */
    @Nullable
    public final Boolean getChannelsOriginalAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.CHANNELSORIGINAL);
    }

   /**
    * Get Number of channels.
    * 
    * @return Number of channels.
    */
    @Nullable
    public final BigInteger getChannelsOriginalAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.CHANNELSORIGINAL);
    }

   /**
    * Get Number of channels.
    * 
    * @return Number of channels.
    */
    @Nullable
    public final URL getChannelsOriginalAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.CHANNELSORIGINAL);
    }


   /**
    * Get Frames per second, denominator.
    * 
    * @return Frames per second, denominator.
    */
    @Nullable
    public final Integer getFrameRateDenAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.FRAMERATEDEN);
    }

   /**
    * Get Frames per second, denominator.
    * 
    * @return Frames per second, denominator.
    */
    @Nullable
    public final Long getFrameRateDenAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.FRAMERATEDEN);
    }

   /**
    * Get Frames per second, denominator.
    * 
    * @return Frames per second, denominator.
    */
    @Nullable
    public final LocalDateTime getFrameRateDenAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.FRAMERATEDEN);
    }

   /**
    * Get Frames per second, denominator.
    * 
    * @return Frames per second, denominator.
    */
    @Nullable
    public final LocalTime getFrameRateDenAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.FRAMERATEDEN);
    }

   /**
    * Get Frames per second, denominator.
    * 
    * @return Frames per second, denominator.
    */
    @Nullable
    public final String getFrameRateDenAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.FRAMERATEDEN);
    }

   /**
    * Get Frames per second, denominator.
    * 
    * @return Frames per second, denominator.
    */
    @Nullable
    public final Boolean getFrameRateDenAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.FRAMERATEDEN);
    }

   /**
    * Get Frames per second, denominator.
    * 
    * @return Frames per second, denominator.
    */
    @Nullable
    public final BigInteger getFrameRateDenAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.FRAMERATEDEN);
    }

   /**
    * Get Frames per second, denominator.
    * 
    * @return Frames per second, denominator.
    */
    @Nullable
    public final URL getFrameRateDenAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.FRAMERATEDEN);
    }


   /**
    * Get Source_StreamSize_Encoded/String3.
    * 
    * @return Source_StreamSize_Encoded/String3.
    */
    @Nullable
    public final Integer getSourceStreamSizeEncodedString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING3);
    }

   /**
    * Get Source_StreamSize_Encoded/String3.
    * 
    * @return Source_StreamSize_Encoded/String3.
    */
    @Nullable
    public final Long getSourceStreamSizeEncodedString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING3);
    }

   /**
    * Get Source_StreamSize_Encoded/String3.
    * 
    * @return Source_StreamSize_Encoded/String3.
    */
    @Nullable
    public final LocalDateTime getSourceStreamSizeEncodedString3AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING3);
    }

   /**
    * Get Source_StreamSize_Encoded/String3.
    * 
    * @return Source_StreamSize_Encoded/String3.
    */
    @Nullable
    public final LocalTime getSourceStreamSizeEncodedString3AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING3);
    }

   /**
    * Get Source_StreamSize_Encoded/String3.
    * 
    * @return Source_StreamSize_Encoded/String3.
    */
    @Nullable
    public final String getSourceStreamSizeEncodedString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING3);
    }

   /**
    * Get Source_StreamSize_Encoded/String3.
    * 
    * @return Source_StreamSize_Encoded/String3.
    */
    @Nullable
    public final Boolean getSourceStreamSizeEncodedString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING3);
    }

   /**
    * Get Source_StreamSize_Encoded/String3.
    * 
    * @return Source_StreamSize_Encoded/String3.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeEncodedString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING3);
    }

   /**
    * Get Source_StreamSize_Encoded/String3.
    * 
    * @return Source_StreamSize_Encoded/String3.
    */
    @Nullable
    public final URL getSourceStreamSizeEncodedString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING3);
    }


   /**
    * Get Encoded Stream size divided by file size.
    * 
    * @return Encoded Stream size divided by file size.
    */
    @Nullable
    public final Integer getStreamSizeEncodedProportionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDPROPORTION);
    }

   /**
    * Get Encoded Stream size divided by file size.
    * 
    * @return Encoded Stream size divided by file size.
    */
    @Nullable
    public final Long getStreamSizeEncodedProportionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDPROPORTION);
    }

   /**
    * Get Encoded Stream size divided by file size.
    * 
    * @return Encoded Stream size divided by file size.
    */
    @Nullable
    public final LocalDateTime getStreamSizeEncodedProportionAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDPROPORTION);
    }

   /**
    * Get Encoded Stream size divided by file size.
    * 
    * @return Encoded Stream size divided by file size.
    */
    @Nullable
    public final LocalTime getStreamSizeEncodedProportionAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDPROPORTION);
    }

   /**
    * Get Encoded Stream size divided by file size.
    * 
    * @return Encoded Stream size divided by file size.
    */
    @Nullable
    public final String getStreamSizeEncodedProportionAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDPROPORTION);
    }

   /**
    * Get Encoded Stream size divided by file size.
    * 
    * @return Encoded Stream size divided by file size.
    */
    @Nullable
    public final Boolean getStreamSizeEncodedProportionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDPROPORTION);
    }

   /**
    * Get Encoded Stream size divided by file size.
    * 
    * @return Encoded Stream size divided by file size.
    */
    @Nullable
    public final BigInteger getStreamSizeEncodedProportionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDPROPORTION);
    }

   /**
    * Get Encoded Stream size divided by file size.
    * 
    * @return Encoded Stream size divided by file size.
    */
    @Nullable
    public final URL getStreamSizeEncodedProportionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDPROPORTION);
    }


   /**
    * Get Source_StreamSize_Encoded/String1.
    * 
    * @return Source_StreamSize_Encoded/String1.
    */
    @Nullable
    public final Integer getSourceStreamSizeEncodedString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING1);
    }

   /**
    * Get Source_StreamSize_Encoded/String1.
    * 
    * @return Source_StreamSize_Encoded/String1.
    */
    @Nullable
    public final Long getSourceStreamSizeEncodedString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING1);
    }

   /**
    * Get Source_StreamSize_Encoded/String1.
    * 
    * @return Source_StreamSize_Encoded/String1.
    */
    @Nullable
    public final LocalDateTime getSourceStreamSizeEncodedString1AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING1);
    }

   /**
    * Get Source_StreamSize_Encoded/String1.
    * 
    * @return Source_StreamSize_Encoded/String1.
    */
    @Nullable
    public final LocalTime getSourceStreamSizeEncodedString1AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING1);
    }

   /**
    * Get Source_StreamSize_Encoded/String1.
    * 
    * @return Source_StreamSize_Encoded/String1.
    */
    @Nullable
    public final String getSourceStreamSizeEncodedString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING1);
    }

   /**
    * Get Source_StreamSize_Encoded/String1.
    * 
    * @return Source_StreamSize_Encoded/String1.
    */
    @Nullable
    public final Boolean getSourceStreamSizeEncodedString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING1);
    }

   /**
    * Get Source_StreamSize_Encoded/String1.
    * 
    * @return Source_StreamSize_Encoded/String1.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeEncodedString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING1);
    }

   /**
    * Get Source_StreamSize_Encoded/String1.
    * 
    * @return Source_StreamSize_Encoded/String1.
    */
    @Nullable
    public final URL getSourceStreamSizeEncodedString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDSTRING1);
    }


   /**
    * Get Position of channels.
    * 
    * @return Position of channels.
    */
    @Nullable
    public final Integer getChannelPositionsAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.CHANNELPOSITIONS);
    }

   /**
    * Get Position of channels.
    * 
    * @return Position of channels.
    */
    @Nullable
    public final Long getChannelPositionsAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.CHANNELPOSITIONS);
    }

   /**
    * Get Position of channels.
    * 
    * @return Position of channels.
    */
    @Nullable
    public final LocalDateTime getChannelPositionsAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.CHANNELPOSITIONS);
    }

   /**
    * Get Position of channels.
    * 
    * @return Position of channels.
    */
    @Nullable
    public final LocalTime getChannelPositionsAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.CHANNELPOSITIONS);
    }

   /**
    * Get Position of channels.
    * 
    * @return Position of channels.
    */
    @Nullable
    public final String getChannelPositionsAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.CHANNELPOSITIONS);
    }

   /**
    * Get Position of channels.
    * 
    * @return Position of channels.
    */
    @Nullable
    public final Boolean getChannelPositionsAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.CHANNELPOSITIONS);
    }

   /**
    * Get Position of channels.
    * 
    * @return Position of channels.
    */
    @Nullable
    public final BigInteger getChannelPositionsAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.CHANNELPOSITIONS);
    }

   /**
    * Get Position of channels.
    * 
    * @return Position of channels.
    */
    @Nullable
    public final URL getChannelPositionsAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.CHANNELPOSITIONS);
    }


   /**
    * Get Play time of the stream, in ms.
    * 
    * @return Play time of the stream, in ms.
    */
    @Nullable
    public final Integer getDurationAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DURATION);
    }

   /**
    * Get Play time of the stream, in ms.
    * 
    * @return Play time of the stream, in ms.
    */
    @Nullable
    public final Long getDurationAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DURATION);
    }

   /**
    * Get Play time of the stream, in ms.
    * 
    * @return Play time of the stream, in ms.
    */
    @Nullable
    public final LocalDateTime getDurationAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DURATION);
    }

   /**
    * Get Play time of the stream, in ms.
    * 
    * @return Play time of the stream, in ms.
    */
    @Nullable
    public final LocalTime getDurationAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DURATION);
    }

   /**
    * Get Play time of the stream, in ms.
    * 
    * @return Play time of the stream, in ms.
    */
    @Nullable
    public final String getDurationAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DURATION);
    }

   /**
    * Get Play time of the stream, in ms.
    * 
    * @return Play time of the stream, in ms.
    */
    @Nullable
    public final Boolean getDurationAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DURATION);
    }

   /**
    * Get Play time of the stream, in ms.
    * 
    * @return Play time of the stream, in ms.
    */
    @Nullable
    public final BigInteger getDurationAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DURATION);
    }

   /**
    * Get Play time of the stream, in ms.
    * 
    * @return Play time of the stream, in ms.
    */
    @Nullable
    public final URL getDurationAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DURATION);
    }


   /**
    * Get Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Integer getSourceDurationString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING5);
    }

   /**
    * Get Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Long getSourceDurationString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING5);
    }

   /**
    * Get Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalDateTime getSourceDurationString5AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING5);
    }

   /**
    * Get Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalTime getSourceDurationString5AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING5);
    }

   /**
    * Get Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final String getSourceDurationString5AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING5);
    }

   /**
    * Get Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Boolean getSourceDurationString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING5);
    }

   /**
    * Get Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final BigInteger getSourceDurationString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING5);
    }

   /**
    * Get Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final URL getSourceDurationString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING5);
    }


   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Integer getDurationLastFrameStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Long getDurationLastFrameStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalDateTime getDurationLastFrameStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalTime getDurationLastFrameStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final String getDurationLastFrameStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Boolean getDurationLastFrameStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final BigInteger getDurationLastFrameStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final URL getDurationLastFrameStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING);
    }


   /**
    * Get Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Integer getSourceDurationString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING4);
    }

   /**
    * Get Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Long getSourceDurationString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING4);
    }

   /**
    * Get Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalDateTime getSourceDurationString4AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING4);
    }

   /**
    * Get Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalTime getSourceDurationString4AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING4);
    }

   /**
    * Get Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final String getSourceDurationString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING4);
    }

   /**
    * Get Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Boolean getSourceDurationString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING4);
    }

   /**
    * Get Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final BigInteger getSourceDurationString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING4);
    }

   /**
    * Get Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final URL getSourceDurationString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING4);
    }


   /**
    * Get Source Play time in format : HH:MM:SS.MMM.
    * 
    * @return Source Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Integer getSourceDurationString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING3);
    }

   /**
    * Get Source Play time in format : HH:MM:SS.MMM.
    * 
    * @return Source Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Long getSourceDurationString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING3);
    }

   /**
    * Get Source Play time in format : HH:MM:SS.MMM.
    * 
    * @return Source Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalDateTime getSourceDurationString3AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING3);
    }

   /**
    * Get Source Play time in format : HH:MM:SS.MMM.
    * 
    * @return Source Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalTime getSourceDurationString3AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING3);
    }

   /**
    * Get Source Play time in format : HH:MM:SS.MMM.
    * 
    * @return Source Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final String getSourceDurationString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING3);
    }

   /**
    * Get Source Play time in format : HH:MM:SS.MMM.
    * 
    * @return Source Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Boolean getSourceDurationString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING3);
    }

   /**
    * Get Source Play time in format : HH:MM:SS.MMM.
    * 
    * @return Source Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final BigInteger getSourceDurationString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING3);
    }

   /**
    * Get Source Play time in format : HH:MM:SS.MMM.
    * 
    * @return Source Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final URL getSourceDurationString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING3);
    }


   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Integer getSourceDurationString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING2);
    }

   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Long getSourceDurationString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING2);
    }

   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalDateTime getSourceDurationString2AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING2);
    }

   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalTime getSourceDurationString2AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING2);
    }

   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final String getSourceDurationString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING2);
    }

   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Boolean getSourceDurationString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING2);
    }

   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final BigInteger getSourceDurationString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING2);
    }

   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final URL getSourceDurationString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING2);
    }


   /**
    * Get Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Integer getSourceDurationString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING1);
    }

   /**
    * Get Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Long getSourceDurationString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING1);
    }

   /**
    * Get Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final LocalDateTime getSourceDurationString1AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING1);
    }

   /**
    * Get Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final LocalTime getSourceDurationString1AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING1);
    }

   /**
    * Get Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final String getSourceDurationString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING1);
    }

   /**
    * Get Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Boolean getSourceDurationString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING1);
    }

   /**
    * Get Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final BigInteger getSourceDurationString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING1);
    }

   /**
    * Get Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final URL getSourceDurationString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING1);
    }


   /**
    * Get Hint/popular name for this codec ID.
    * 
    * @return Hint/popular name for this codec ID.
    */
    @Nullable
    public final Integer getCodecIDHintAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.CODECIDHINT);
    }

   /**
    * Get Hint/popular name for this codec ID.
    * 
    * @return Hint/popular name for this codec ID.
    */
    @Nullable
    public final Long getCodecIDHintAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.CODECIDHINT);
    }

   /**
    * Get Hint/popular name for this codec ID.
    * 
    * @return Hint/popular name for this codec ID.
    */
    @Nullable
    public final LocalDateTime getCodecIDHintAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.CODECIDHINT);
    }

   /**
    * Get Hint/popular name for this codec ID.
    * 
    * @return Hint/popular name for this codec ID.
    */
    @Nullable
    public final LocalTime getCodecIDHintAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.CODECIDHINT);
    }

   /**
    * Get Hint/popular name for this codec ID.
    * 
    * @return Hint/popular name for this codec ID.
    */
    @Nullable
    public final String getCodecIDHintAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.CODECIDHINT);
    }

   /**
    * Get Hint/popular name for this codec ID.
    * 
    * @return Hint/popular name for this codec ID.
    */
    @Nullable
    public final Boolean getCodecIDHintAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.CODECIDHINT);
    }

   /**
    * Get Hint/popular name for this codec ID.
    * 
    * @return Hint/popular name for this codec ID.
    */
    @Nullable
    public final BigInteger getCodecIDHintAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.CODECIDHINT);
    }

   /**
    * Get Hint/popular name for this codec ID.
    * 
    * @return Hint/popular name for this codec ID.
    */
    @Nullable
    public final URL getCodecIDHintAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.CODECIDHINT);
    }


   /**
    * Get Number of channels after matrix decoding.
    * 
    * @return Number of channels after matrix decoding.
    */
    @Nullable
    public final Integer getMatrixChannelsAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.MATRIXCHANNELS);
    }

   /**
    * Get Number of channels after matrix decoding.
    * 
    * @return Number of channels after matrix decoding.
    */
    @Nullable
    public final Long getMatrixChannelsAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.MATRIXCHANNELS);
    }

   /**
    * Get Number of channels after matrix decoding.
    * 
    * @return Number of channels after matrix decoding.
    */
    @Nullable
    public final LocalDateTime getMatrixChannelsAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.MATRIXCHANNELS);
    }

   /**
    * Get Number of channels after matrix decoding.
    * 
    * @return Number of channels after matrix decoding.
    */
    @Nullable
    public final LocalTime getMatrixChannelsAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.MATRIXCHANNELS);
    }

   /**
    * Get Number of channels after matrix decoding.
    * 
    * @return Number of channels after matrix decoding.
    */
    @Nullable
    public final String getMatrixChannelsAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.MATRIXCHANNELS);
    }

   /**
    * Get Number of channels after matrix decoding.
    * 
    * @return Number of channels after matrix decoding.
    */
    @Nullable
    public final Boolean getMatrixChannelsAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.MATRIXCHANNELS);
    }

   /**
    * Get Number of channels after matrix decoding.
    * 
    * @return Number of channels after matrix decoding.
    */
    @Nullable
    public final BigInteger getMatrixChannelsAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.MATRIXCHANNELS);
    }

   /**
    * Get Number of channels after matrix decoding.
    * 
    * @return Number of channels after matrix decoding.
    */
    @Nullable
    public final URL getMatrixChannelsAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.MATRIXCHANNELS);
    }


   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit.
    */
    @Nullable
    public final Integer getEncodedApplicationAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATION);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit.
    */
    @Nullable
    public final Long getEncodedApplicationAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATION);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit.
    */
    @Nullable
    public final LocalDateTime getEncodedApplicationAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATION);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit.
    */
    @Nullable
    public final LocalTime getEncodedApplicationAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATION);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit.
    */
    @Nullable
    public final String getEncodedApplicationAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATION);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit.
    */
    @Nullable
    public final Boolean getEncodedApplicationAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATION);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit.
    */
    @Nullable
    public final BigInteger getEncodedApplicationAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATION);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit.
    */
    @Nullable
    public final URL getEncodedApplicationAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATION);
    }


   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final Integer getCompressionModeStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.COMPRESSIONMODESTRING);
    }

   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final Long getCompressionModeStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.COMPRESSIONMODESTRING);
    }

   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final LocalDateTime getCompressionModeStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.COMPRESSIONMODESTRING);
    }

   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final LocalTime getCompressionModeStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.COMPRESSIONMODESTRING);
    }

   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final String getCompressionModeStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.COMPRESSIONMODESTRING);
    }

   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final Boolean getCompressionModeStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.COMPRESSIONMODESTRING);
    }

   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final BigInteger getCompressionModeStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.COMPRESSIONMODESTRING);
    }

   /**
    * Get Compression mode (Lossy or Lossless).
    * 
    * @return Compression mode (Lossy or Lossless).
    */
    @Nullable
    public final URL getCompressionModeStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.COMPRESSIONMODESTRING);
    }


   /**
    * Get StreamSize/String2.
    * 
    * @return StreamSize/String2.
    */
    @Nullable
    public final Integer getStreamSizeString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING2);
    }

   /**
    * Get StreamSize/String2.
    * 
    * @return StreamSize/String2.
    */
    @Nullable
    public final Long getStreamSizeString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING2);
    }

   /**
    * Get StreamSize/String2.
    * 
    * @return StreamSize/String2.
    */
    @Nullable
    public final LocalDateTime getStreamSizeString2AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING2);
    }

   /**
    * Get StreamSize/String2.
    * 
    * @return StreamSize/String2.
    */
    @Nullable
    public final LocalTime getStreamSizeString2AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING2);
    }

   /**
    * Get StreamSize/String2.
    * 
    * @return StreamSize/String2.
    */
    @Nullable
    public final String getStreamSizeString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING2);
    }

   /**
    * Get StreamSize/String2.
    * 
    * @return StreamSize/String2.
    */
    @Nullable
    public final Boolean getStreamSizeString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING2);
    }

   /**
    * Get StreamSize/String2.
    * 
    * @return StreamSize/String2.
    */
    @Nullable
    public final BigInteger getStreamSizeString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING2);
    }

   /**
    * Get StreamSize/String2.
    * 
    * @return StreamSize/String2.
    */
    @Nullable
    public final URL getStreamSizeString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING2);
    }


   /**
    * Get StreamSize/String1.
    * 
    * @return StreamSize/String1.
    */
    @Nullable
    public final Integer getStreamSizeString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING1);
    }

   /**
    * Get StreamSize/String1.
    * 
    * @return StreamSize/String1.
    */
    @Nullable
    public final Long getStreamSizeString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING1);
    }

   /**
    * Get StreamSize/String1.
    * 
    * @return StreamSize/String1.
    */
    @Nullable
    public final LocalDateTime getStreamSizeString1AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING1);
    }

   /**
    * Get StreamSize/String1.
    * 
    * @return StreamSize/String1.
    */
    @Nullable
    public final LocalTime getStreamSizeString1AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING1);
    }

   /**
    * Get StreamSize/String1.
    * 
    * @return StreamSize/String1.
    */
    @Nullable
    public final String getStreamSizeString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING1);
    }

   /**
    * Get StreamSize/String1.
    * 
    * @return StreamSize/String1.
    */
    @Nullable
    public final Boolean getStreamSizeString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING1);
    }

   /**
    * Get StreamSize/String1.
    * 
    * @return StreamSize/String1.
    */
    @Nullable
    public final BigInteger getStreamSizeString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING1);
    }

   /**
    * Get StreamSize/String1.
    * 
    * @return StreamSize/String1.
    */
    @Nullable
    public final URL getStreamSizeString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING1);
    }


   /**
    * Get StreamSize/String4.
    * 
    * @return StreamSize/String4.
    */
    @Nullable
    public final Integer getStreamSizeString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING4);
    }

   /**
    * Get StreamSize/String4.
    * 
    * @return StreamSize/String4.
    */
    @Nullable
    public final Long getStreamSizeString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING4);
    }

   /**
    * Get StreamSize/String4.
    * 
    * @return StreamSize/String4.
    */
    @Nullable
    public final LocalDateTime getStreamSizeString4AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING4);
    }

   /**
    * Get StreamSize/String4.
    * 
    * @return StreamSize/String4.
    */
    @Nullable
    public final LocalTime getStreamSizeString4AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING4);
    }

   /**
    * Get StreamSize/String4.
    * 
    * @return StreamSize/String4.
    */
    @Nullable
    public final String getStreamSizeString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING4);
    }

   /**
    * Get StreamSize/String4.
    * 
    * @return StreamSize/String4.
    */
    @Nullable
    public final Boolean getStreamSizeString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING4);
    }

   /**
    * Get StreamSize/String4.
    * 
    * @return StreamSize/String4.
    */
    @Nullable
    public final BigInteger getStreamSizeString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING4);
    }

   /**
    * Get StreamSize/String4.
    * 
    * @return StreamSize/String4.
    */
    @Nullable
    public final URL getStreamSizeString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING4);
    }


   /**
    * Get StreamSize/String3.
    * 
    * @return StreamSize/String3.
    */
    @Nullable
    public final Integer getStreamSizeString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING3);
    }

   /**
    * Get StreamSize/String3.
    * 
    * @return StreamSize/String3.
    */
    @Nullable
    public final Long getStreamSizeString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING3);
    }

   /**
    * Get StreamSize/String3.
    * 
    * @return StreamSize/String3.
    */
    @Nullable
    public final LocalDateTime getStreamSizeString3AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING3);
    }

   /**
    * Get StreamSize/String3.
    * 
    * @return StreamSize/String3.
    */
    @Nullable
    public final LocalTime getStreamSizeString3AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING3);
    }

   /**
    * Get StreamSize/String3.
    * 
    * @return StreamSize/String3.
    */
    @Nullable
    public final String getStreamSizeString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING3);
    }

   /**
    * Get StreamSize/String3.
    * 
    * @return StreamSize/String3.
    */
    @Nullable
    public final Boolean getStreamSizeString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING3);
    }

   /**
    * Get StreamSize/String3.
    * 
    * @return StreamSize/String3.
    */
    @Nullable
    public final BigInteger getStreamSizeString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING3);
    }

   /**
    * Get StreamSize/String3.
    * 
    * @return StreamSize/String3.
    */
    @Nullable
    public final URL getStreamSizeString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING3);
    }


   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final Integer getStreamSizeString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING5);
    }

   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final Long getStreamSizeString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING5);
    }

   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final LocalDateTime getStreamSizeString5AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING5);
    }

   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final LocalTime getStreamSizeString5AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING5);
    }

   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final String getStreamSizeString5AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING5);
    }

   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final Boolean getStreamSizeString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING5);
    }

   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final BigInteger getStreamSizeString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING5);
    }

   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final URL getStreamSizeString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING5);
    }


   /**
    * Get ReplayGain_Gain/String.
    * 
    * @return ReplayGain_Gain/String.
    */
    @Nullable
    public final Integer getReplayGainGainStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.REPLAYGAINGAINSTRING);
    }

   /**
    * Get ReplayGain_Gain/String.
    * 
    * @return ReplayGain_Gain/String.
    */
    @Nullable
    public final Long getReplayGainGainStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.REPLAYGAINGAINSTRING);
    }

   /**
    * Get ReplayGain_Gain/String.
    * 
    * @return ReplayGain_Gain/String.
    */
    @Nullable
    public final LocalDateTime getReplayGainGainStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.REPLAYGAINGAINSTRING);
    }

   /**
    * Get ReplayGain_Gain/String.
    * 
    * @return ReplayGain_Gain/String.
    */
    @Nullable
    public final LocalTime getReplayGainGainStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.REPLAYGAINGAINSTRING);
    }

   /**
    * Get ReplayGain_Gain/String.
    * 
    * @return ReplayGain_Gain/String.
    */
    @Nullable
    public final String getReplayGainGainStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.REPLAYGAINGAINSTRING);
    }

   /**
    * Get ReplayGain_Gain/String.
    * 
    * @return ReplayGain_Gain/String.
    */
    @Nullable
    public final Boolean getReplayGainGainStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.REPLAYGAINGAINSTRING);
    }

   /**
    * Get ReplayGain_Gain/String.
    * 
    * @return ReplayGain_Gain/String.
    */
    @Nullable
    public final BigInteger getReplayGainGainStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.REPLAYGAINGAINSTRING);
    }

   /**
    * Get ReplayGain_Gain/String.
    * 
    * @return ReplayGain_Gain/String.
    */
    @Nullable
    public final URL getReplayGainGainStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.REPLAYGAINGAINSTRING);
    }


   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final Integer getStreamKindAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMKIND);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final Long getStreamKindAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.STREAMKIND);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final LocalDateTime getStreamKindAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMKIND);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final LocalTime getStreamKindAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMKIND);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final String getStreamKindAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.STREAMKIND);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final Boolean getStreamKindAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.STREAMKIND);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final BigInteger getStreamKindAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMKIND);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final URL getStreamKindAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.STREAMKIND);
    }


   /**
    * Get Bit rate (with measurement).
    * 
    * @return Bit rate (with measurement).
    */
    @Nullable
    public final Integer getBitRateStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.BITRATESTRING);
    }

   /**
    * Get Bit rate (with measurement).
    * 
    * @return Bit rate (with measurement).
    */
    @Nullable
    public final Long getBitRateStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.BITRATESTRING);
    }

   /**
    * Get Bit rate (with measurement).
    * 
    * @return Bit rate (with measurement).
    */
    @Nullable
    public final LocalDateTime getBitRateStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.BITRATESTRING);
    }

   /**
    * Get Bit rate (with measurement).
    * 
    * @return Bit rate (with measurement).
    */
    @Nullable
    public final LocalTime getBitRateStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.BITRATESTRING);
    }

   /**
    * Get Bit rate (with measurement).
    * 
    * @return Bit rate (with measurement).
    */
    @Nullable
    public final String getBitRateStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.BITRATESTRING);
    }

   /**
    * Get Bit rate (with measurement).
    * 
    * @return Bit rate (with measurement).
    */
    @Nullable
    public final Boolean getBitRateStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.BITRATESTRING);
    }

   /**
    * Get Bit rate (with measurement).
    * 
    * @return Bit rate (with measurement).
    */
    @Nullable
    public final BigInteger getBitRateStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.BITRATESTRING);
    }

   /**
    * Get Bit rate (with measurement).
    * 
    * @return Bit rate (with measurement).
    */
    @Nullable
    public final URL getBitRateStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.BITRATESTRING);
    }


   /**
    * Get Format_Settings_Sign.
    * 
    * @return Format_Settings_Sign.
    */
    @Nullable
    public final Integer getFormatSettingsSignAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSSIGN);
    }

   /**
    * Get Format_Settings_Sign.
    * 
    * @return Format_Settings_Sign.
    */
    @Nullable
    public final Long getFormatSettingsSignAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSSIGN);
    }

   /**
    * Get Format_Settings_Sign.
    * 
    * @return Format_Settings_Sign.
    */
    @Nullable
    public final LocalDateTime getFormatSettingsSignAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSSIGN);
    }

   /**
    * Get Format_Settings_Sign.
    * 
    * @return Format_Settings_Sign.
    */
    @Nullable
    public final LocalTime getFormatSettingsSignAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSSIGN);
    }

   /**
    * Get Format_Settings_Sign.
    * 
    * @return Format_Settings_Sign.
    */
    @Nullable
    public final String getFormatSettingsSignAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSSIGN);
    }

   /**
    * Get Format_Settings_Sign.
    * 
    * @return Format_Settings_Sign.
    */
    @Nullable
    public final Boolean getFormatSettingsSignAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSSIGN);
    }

   /**
    * Get Format_Settings_Sign.
    * 
    * @return Format_Settings_Sign.
    */
    @Nullable
    public final BigInteger getFormatSettingsSignAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSSIGN);
    }

   /**
    * Get Format_Settings_Sign.
    * 
    * @return Format_Settings_Sign.
    */
    @Nullable
    public final URL getFormatSettingsSignAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSSIGN);
    }


   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final Integer getLanguageString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGESTRING1);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final Long getLanguageString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGESTRING1);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final LocalDateTime getLanguageString1AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGESTRING1);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final LocalTime getLanguageString1AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGESTRING1);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final String getLanguageString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGESTRING1);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final Boolean getLanguageString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGESTRING1);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final BigInteger getLanguageString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGESTRING1);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final URL getLanguageString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGESTRING1);
    }


   /**
    * Get Language (2-letter ISO 639-1 if exists, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else empty).
    */
    @Nullable
    public final Integer getLanguageString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGESTRING2);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else empty).
    */
    @Nullable
    public final Long getLanguageString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGESTRING2);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else empty).
    */
    @Nullable
    public final LocalDateTime getLanguageString2AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGESTRING2);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else empty).
    */
    @Nullable
    public final LocalTime getLanguageString2AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGESTRING2);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else empty).
    */
    @Nullable
    public final String getLanguageString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGESTRING2);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else empty).
    */
    @Nullable
    public final Boolean getLanguageString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGESTRING2);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else empty).
    */
    @Nullable
    public final BigInteger getLanguageString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGESTRING2);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else empty).
    */
    @Nullable
    public final URL getLanguageString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGESTRING2);
    }


   /**
    * Get Language (3-letter ISO 639-2 if exists, else empty).
    * 
    * @return Language (3-letter ISO 639-2 if exists, else empty).
    */
    @Nullable
    public final Integer getLanguageString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGESTRING3);
    }

   /**
    * Get Language (3-letter ISO 639-2 if exists, else empty).
    * 
    * @return Language (3-letter ISO 639-2 if exists, else empty).
    */
    @Nullable
    public final Long getLanguageString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGESTRING3);
    }

   /**
    * Get Language (3-letter ISO 639-2 if exists, else empty).
    * 
    * @return Language (3-letter ISO 639-2 if exists, else empty).
    */
    @Nullable
    public final LocalDateTime getLanguageString3AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGESTRING3);
    }

   /**
    * Get Language (3-letter ISO 639-2 if exists, else empty).
    * 
    * @return Language (3-letter ISO 639-2 if exists, else empty).
    */
    @Nullable
    public final LocalTime getLanguageString3AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGESTRING3);
    }

   /**
    * Get Language (3-letter ISO 639-2 if exists, else empty).
    * 
    * @return Language (3-letter ISO 639-2 if exists, else empty).
    */
    @Nullable
    public final String getLanguageString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGESTRING3);
    }

   /**
    * Get Language (3-letter ISO 639-2 if exists, else empty).
    * 
    * @return Language (3-letter ISO 639-2 if exists, else empty).
    */
    @Nullable
    public final Boolean getLanguageString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGESTRING3);
    }

   /**
    * Get Language (3-letter ISO 639-2 if exists, else empty).
    * 
    * @return Language (3-letter ISO 639-2 if exists, else empty).
    */
    @Nullable
    public final BigInteger getLanguageString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGESTRING3);
    }

   /**
    * Get Language (3-letter ISO 639-2 if exists, else empty).
    * 
    * @return Language (3-letter ISO 639-2 if exists, else empty).
    */
    @Nullable
    public final URL getLanguageString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGESTRING3);
    }


   /**
    * Get Position of channels after matrix decoding.
    * 
    * @return Position of channels after matrix decoding.
    */
    @Nullable
    public final Integer getMatrixChannelPositionsAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.MATRIXCHANNELPOSITIONS);
    }

   /**
    * Get Position of channels after matrix decoding.
    * 
    * @return Position of channels after matrix decoding.
    */
    @Nullable
    public final Long getMatrixChannelPositionsAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.MATRIXCHANNELPOSITIONS);
    }

   /**
    * Get Position of channels after matrix decoding.
    * 
    * @return Position of channels after matrix decoding.
    */
    @Nullable
    public final LocalDateTime getMatrixChannelPositionsAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.MATRIXCHANNELPOSITIONS);
    }

   /**
    * Get Position of channels after matrix decoding.
    * 
    * @return Position of channels after matrix decoding.
    */
    @Nullable
    public final LocalTime getMatrixChannelPositionsAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.MATRIXCHANNELPOSITIONS);
    }

   /**
    * Get Position of channels after matrix decoding.
    * 
    * @return Position of channels after matrix decoding.
    */
    @Nullable
    public final String getMatrixChannelPositionsAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.MATRIXCHANNELPOSITIONS);
    }

   /**
    * Get Position of channels after matrix decoding.
    * 
    * @return Position of channels after matrix decoding.
    */
    @Nullable
    public final Boolean getMatrixChannelPositionsAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.MATRIXCHANNELPOSITIONS);
    }

   /**
    * Get Position of channels after matrix decoding.
    * 
    * @return Position of channels after matrix decoding.
    */
    @Nullable
    public final BigInteger getMatrixChannelPositionsAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.MATRIXCHANNELPOSITIONS);
    }

   /**
    * Get Position of channels after matrix decoding.
    * 
    * @return Position of channels after matrix decoding.
    */
    @Nullable
    public final URL getMatrixChannelPositionsAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.MATRIXCHANNELPOSITIONS);
    }


   /**
    * Get Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    */
    @Nullable
    public final Integer getLanguageString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGESTRING4);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    */
    @Nullable
    public final Long getLanguageString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGESTRING4);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    */
    @Nullable
    public final LocalDateTime getLanguageString4AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGESTRING4);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    */
    @Nullable
    public final LocalTime getLanguageString4AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGESTRING4);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    */
    @Nullable
    public final String getLanguageString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGESTRING4);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    */
    @Nullable
    public final Boolean getLanguageString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGESTRING4);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    */
    @Nullable
    public final BigInteger getLanguageString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGESTRING4);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    * 
    * @return Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty).
    */
    @Nullable
    public final URL getLanguageString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGESTRING4);
    }


   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final Integer getCodecIDAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.CODECID);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final Long getCodecIDAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.CODECID);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final LocalDateTime getCodecIDAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.CODECID);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final LocalTime getCodecIDAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.CODECID);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final String getCodecIDAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.CODECID);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final Boolean getCodecIDAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.CODECID);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final BigInteger getCodecIDAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.CODECID);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final URL getCodecIDAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.CODECID);
    }


   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final Integer getAlternateGroupAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.ALTERNATEGROUP);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final Long getAlternateGroupAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.ALTERNATEGROUP);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final LocalDateTime getAlternateGroupAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.ALTERNATEGROUP);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final LocalTime getAlternateGroupAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.ALTERNATEGROUP);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final String getAlternateGroupAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.ALTERNATEGROUP);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final Boolean getAlternateGroupAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.ALTERNATEGROUP);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final BigInteger getAlternateGroupAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.ALTERNATEGROUP);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final URL getAlternateGroupAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.ALTERNATEGROUP);
    }


   /**
    * Get Between how many video frames the stream is inserted.
    * 
    * @return Between how many video frames the stream is inserted.
    */
    @Nullable
    public final Integer getInterleaveVideoFramesAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVEVIDEOFRAMES);
    }

   /**
    * Get Between how many video frames the stream is inserted.
    * 
    * @return Between how many video frames the stream is inserted.
    */
    @Nullable
    public final Long getInterleaveVideoFramesAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVEVIDEOFRAMES);
    }

   /**
    * Get Between how many video frames the stream is inserted.
    * 
    * @return Between how many video frames the stream is inserted.
    */
    @Nullable
    public final LocalDateTime getInterleaveVideoFramesAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVEVIDEOFRAMES);
    }

   /**
    * Get Between how many video frames the stream is inserted.
    * 
    * @return Between how many video frames the stream is inserted.
    */
    @Nullable
    public final LocalTime getInterleaveVideoFramesAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVEVIDEOFRAMES);
    }

   /**
    * Get Between how many video frames the stream is inserted.
    * 
    * @return Between how many video frames the stream is inserted.
    */
    @Nullable
    public final String getInterleaveVideoFramesAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVEVIDEOFRAMES);
    }

   /**
    * Get Between how many video frames the stream is inserted.
    * 
    * @return Between how many video frames the stream is inserted.
    */
    @Nullable
    public final Boolean getInterleaveVideoFramesAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVEVIDEOFRAMES);
    }

   /**
    * Get Between how many video frames the stream is inserted.
    * 
    * @return Between how many video frames the stream is inserted.
    */
    @Nullable
    public final BigInteger getInterleaveVideoFramesAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVEVIDEOFRAMES);
    }

   /**
    * Get Between how many video frames the stream is inserted.
    * 
    * @return Between how many video frames the stream is inserted.
    */
    @Nullable
    public final URL getInterleaveVideoFramesAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVEVIDEOFRAMES);
    }


   /**
    * Get Matrix format (e.g. DTS Neural).
    * 
    * @return Matrix format (e.g. DTS Neural).
    */
    @Nullable
    public final Integer getMatrixFormatAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.MATRIXFORMAT);
    }

   /**
    * Get Matrix format (e.g. DTS Neural).
    * 
    * @return Matrix format (e.g. DTS Neural).
    */
    @Nullable
    public final Long getMatrixFormatAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.MATRIXFORMAT);
    }

   /**
    * Get Matrix format (e.g. DTS Neural).
    * 
    * @return Matrix format (e.g. DTS Neural).
    */
    @Nullable
    public final LocalDateTime getMatrixFormatAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.MATRIXFORMAT);
    }

   /**
    * Get Matrix format (e.g. DTS Neural).
    * 
    * @return Matrix format (e.g. DTS Neural).
    */
    @Nullable
    public final LocalTime getMatrixFormatAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.MATRIXFORMAT);
    }

   /**
    * Get Matrix format (e.g. DTS Neural).
    * 
    * @return Matrix format (e.g. DTS Neural).
    */
    @Nullable
    public final String getMatrixFormatAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.MATRIXFORMAT);
    }

   /**
    * Get Matrix format (e.g. DTS Neural).
    * 
    * @return Matrix format (e.g. DTS Neural).
    */
    @Nullable
    public final Boolean getMatrixFormatAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.MATRIXFORMAT);
    }

   /**
    * Get Matrix format (e.g. DTS Neural).
    * 
    * @return Matrix format (e.g. DTS Neural).
    */
    @Nullable
    public final BigInteger getMatrixFormatAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.MATRIXFORMAT);
    }

   /**
    * Get Matrix format (e.g. DTS Neural).
    * 
    * @return Matrix format (e.g. DTS Neural).
    */
    @Nullable
    public final URL getMatrixFormatAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.MATRIXFORMAT);
    }


   /**
    * Get Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    */
    @Nullable
    public final Integer getLanguageAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGE);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    */
    @Nullable
    public final Long getLanguageAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGE);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    */
    @Nullable
    public final LocalDateTime getLanguageAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGE);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    */
    @Nullable
    public final LocalTime getLanguageAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGE);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    */
    @Nullable
    public final String getLanguageAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGE);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    */
    @Nullable
    public final Boolean getLanguageAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGE);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    */
    @Nullable
    public final BigInteger getLanguageAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGE);
    }

   /**
    * Get Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    * 
    * @return Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn).
    */
    @Nullable
    public final URL getLanguageAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGE);
    }


   /**
    * Get Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final Integer getDurationLastFrameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAME);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final Long getDurationLastFrameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAME);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final LocalDateTime getDurationLastFrameAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAME);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final LocalTime getDurationLastFrameAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAME);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final String getDurationLastFrameAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAME);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final Boolean getDurationLastFrameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAME);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final BigInteger getDurationLastFrameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAME);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in ms.
    * 
    * @return Duration of the last frame if it is longer than others, in ms.
    */
    @Nullable
    public final URL getDurationLastFrameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAME);
    }


   /**
    * Get Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final Integer getEncodedLibraryStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYSTRING);
    }

   /**
    * Get Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final Long getEncodedLibraryStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYSTRING);
    }

   /**
    * Get Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final LocalDateTime getEncodedLibraryStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYSTRING);
    }

   /**
    * Get Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final LocalTime getEncodedLibraryStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYSTRING);
    }

   /**
    * Get Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final String getEncodedLibraryStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYSTRING);
    }

   /**
    * Get Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final Boolean getEncodedLibraryStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYSTRING);
    }

   /**
    * Get Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final BigInteger getEncodedLibraryStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYSTRING);
    }

   /**
    * Get Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final URL getEncodedLibraryStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYSTRING);
    }


   /**
    * Get in KHz.
    * 
    * @return in KHz.
    */
    @Nullable
    public final Integer getSamplingRateStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SAMPLINGRATESTRING);
    }

   /**
    * Get in KHz.
    * 
    * @return in KHz.
    */
    @Nullable
    public final Long getSamplingRateStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SAMPLINGRATESTRING);
    }

   /**
    * Get in KHz.
    * 
    * @return in KHz.
    */
    @Nullable
    public final LocalDateTime getSamplingRateStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SAMPLINGRATESTRING);
    }

   /**
    * Get in KHz.
    * 
    * @return in KHz.
    */
    @Nullable
    public final LocalTime getSamplingRateStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SAMPLINGRATESTRING);
    }

   /**
    * Get in KHz.
    * 
    * @return in KHz.
    */
    @Nullable
    public final String getSamplingRateStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SAMPLINGRATESTRING);
    }

   /**
    * Get in KHz.
    * 
    * @return in KHz.
    */
    @Nullable
    public final Boolean getSamplingRateStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SAMPLINGRATESTRING);
    }

   /**
    * Get in KHz.
    * 
    * @return in KHz.
    */
    @Nullable
    public final BigInteger getSamplingRateStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SAMPLINGRATESTRING);
    }

   /**
    * Get in KHz.
    * 
    * @return in KHz.
    */
    @Nullable
    public final URL getSamplingRateStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SAMPLINGRATESTRING);
    }


   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final Integer getStreamSizeStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING);
    }

   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final Long getStreamSizeStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING);
    }

   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final LocalDateTime getStreamSizeStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING);
    }

   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final LocalTime getStreamSizeStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING);
    }

   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final String getStreamSizeStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING);
    }

   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final Boolean getStreamSizeStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING);
    }

   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final BigInteger getStreamSizeStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING);
    }

   /**
    * Get Streamsize in with percentage value.
    * 
    * @return Streamsize in with percentage value.
    */
    @Nullable
    public final URL getStreamSizeStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZESTRING);
    }


   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Integer getDefaultStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DEFAULTSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Long getDefaultStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DEFAULTSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final LocalDateTime getDefaultStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DEFAULTSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final LocalTime getDefaultStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DEFAULTSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final String getDefaultStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DEFAULTSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Boolean getDefaultStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DEFAULTSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final BigInteger getDefaultStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DEFAULTSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final URL getDefaultStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DEFAULTSTRING);
    }


   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final Integer getOriginalSourceMediumIDStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.ORIGINALSOURCEMEDIUMIDSTRING);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final Long getOriginalSourceMediumIDStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.ORIGINALSOURCEMEDIUMIDSTRING);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final LocalDateTime getOriginalSourceMediumIDStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.ORIGINALSOURCEMEDIUMIDSTRING);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final LocalTime getOriginalSourceMediumIDStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.ORIGINALSOURCEMEDIUMIDSTRING);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final String getOriginalSourceMediumIDStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.ORIGINALSOURCEMEDIUMIDSTRING);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final Boolean getOriginalSourceMediumIDStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.ORIGINALSOURCEMEDIUMIDSTRING);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final BigInteger getOriginalSourceMediumIDStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.ORIGINALSOURCEMEDIUMIDSTRING);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final URL getOriginalSourceMediumIDStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.ORIGINALSOURCEMEDIUMIDSTRING);
    }


   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Integer getSourceDurationLastFrameString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING1);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Long getSourceDurationLastFrameString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING1);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final LocalDateTime getSourceDurationLastFrameString1AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING1);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final LocalTime getSourceDurationLastFrameString1AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING1);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final String getSourceDurationLastFrameString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING1);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Boolean getSourceDurationLastFrameString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING1);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final BigInteger getSourceDurationLastFrameString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING1);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final URL getSourceDurationLastFrameString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING1);
    }


   /**
    * Get Format_Settings_Mode.
    * 
    * @return Format_Settings_Mode.
    */
    @Nullable
    public final Integer getFormatSettingsModeAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSMODE);
    }

   /**
    * Get Format_Settings_Mode.
    * 
    * @return Format_Settings_Mode.
    */
    @Nullable
    public final Long getFormatSettingsModeAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSMODE);
    }

   /**
    * Get Format_Settings_Mode.
    * 
    * @return Format_Settings_Mode.
    */
    @Nullable
    public final LocalDateTime getFormatSettingsModeAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSMODE);
    }

   /**
    * Get Format_Settings_Mode.
    * 
    * @return Format_Settings_Mode.
    */
    @Nullable
    public final LocalTime getFormatSettingsModeAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSMODE);
    }

   /**
    * Get Format_Settings_Mode.
    * 
    * @return Format_Settings_Mode.
    */
    @Nullable
    public final String getFormatSettingsModeAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSMODE);
    }

   /**
    * Get Format_Settings_Mode.
    * 
    * @return Format_Settings_Mode.
    */
    @Nullable
    public final Boolean getFormatSettingsModeAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSMODE);
    }

   /**
    * Get Format_Settings_Mode.
    * 
    * @return Format_Settings_Mode.
    */
    @Nullable
    public final BigInteger getFormatSettingsModeAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSMODE);
    }

   /**
    * Get Format_Settings_Mode.
    * 
    * @return Format_Settings_Mode.
    */
    @Nullable
    public final URL getFormatSettingsModeAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSMODE);
    }


   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Integer getSourceDurationLastFrameString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING3);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Long getSourceDurationLastFrameString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING3);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalDateTime getSourceDurationLastFrameString3AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING3);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalTime getSourceDurationLastFrameString3AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING3);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final String getSourceDurationLastFrameString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING3);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Boolean getSourceDurationLastFrameString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING3);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final BigInteger getSourceDurationLastFrameString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING3);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final URL getSourceDurationLastFrameString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING3);
    }


   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Integer getSourceDurationLastFrameString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING2);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Long getSourceDurationLastFrameString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING2);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalDateTime getSourceDurationLastFrameString2AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING2);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalTime getSourceDurationLastFrameString2AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING2);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final String getSourceDurationLastFrameString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING2);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Boolean getSourceDurationLastFrameString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING2);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final BigInteger getSourceDurationLastFrameString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING2);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final URL getSourceDurationLastFrameString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING2);
    }


   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Integer getSourceDurationLastFrameString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING5);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Long getSourceDurationLastFrameString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING5);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalDateTime getSourceDurationLastFrameString5AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING5);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalTime getSourceDurationLastFrameString5AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING5);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final String getSourceDurationLastFrameString5AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING5);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Boolean getSourceDurationLastFrameString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING5);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final BigInteger getSourceDurationLastFrameString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING5);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final URL getSourceDurationLastFrameString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING5);
    }


   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Integer getSourceDurationLastFrameString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING4);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Long getSourceDurationLastFrameString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING4);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalDateTime getSourceDurationLastFrameString4AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING4);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalTime getSourceDurationLastFrameString4AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING4);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final String getSourceDurationLastFrameString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING4);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Boolean getSourceDurationLastFrameString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING4);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final BigInteger getSourceDurationLastFrameString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING4);
    }

   /**
    * Get Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final URL getSourceDurationLastFrameString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONLASTFRAMESTRING4);
    }


   /**
    * Get Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different.
    * 
    * @return Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different.
    */
    @Nullable
    public final Integer getBitDepthStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTHSTRING);
    }

   /**
    * Get Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different.
    * 
    * @return Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different.
    */
    @Nullable
    public final Long getBitDepthStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTHSTRING);
    }

   /**
    * Get Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different.
    * 
    * @return Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different.
    */
    @Nullable
    public final LocalDateTime getBitDepthStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTHSTRING);
    }

   /**
    * Get Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different.
    * 
    * @return Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different.
    */
    @Nullable
    public final LocalTime getBitDepthStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTHSTRING);
    }

   /**
    * Get Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different.
    * 
    * @return Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different.
    */
    @Nullable
    public final String getBitDepthStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTHSTRING);
    }

   /**
    * Get Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different.
    * 
    * @return Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different.
    */
    @Nullable
    public final Boolean getBitDepthStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTHSTRING);
    }

   /**
    * Get Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different.
    * 
    * @return Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different.
    */
    @Nullable
    public final BigInteger getBitDepthStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTHSTRING);
    }

   /**
    * Get Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different.
    * 
    * @return Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different.
    */
    @Nullable
    public final URL getBitDepthStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTHSTRING);
    }


   /**
    * Get Frame count (a frame contains a count of samples depends of the format).
    * 
    * @return Frame count (a frame contains a count of samples depends of the format).
    */
    @Nullable
    public final Integer getFrameCountAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.FRAMECOUNT);
    }

   /**
    * Get Frame count (a frame contains a count of samples depends of the format).
    * 
    * @return Frame count (a frame contains a count of samples depends of the format).
    */
    @Nullable
    public final Long getFrameCountAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.FRAMECOUNT);
    }

   /**
    * Get Frame count (a frame contains a count of samples depends of the format).
    * 
    * @return Frame count (a frame contains a count of samples depends of the format).
    */
    @Nullable
    public final LocalDateTime getFrameCountAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.FRAMECOUNT);
    }

   /**
    * Get Frame count (a frame contains a count of samples depends of the format).
    * 
    * @return Frame count (a frame contains a count of samples depends of the format).
    */
    @Nullable
    public final LocalTime getFrameCountAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.FRAMECOUNT);
    }

   /**
    * Get Frame count (a frame contains a count of samples depends of the format).
    * 
    * @return Frame count (a frame contains a count of samples depends of the format).
    */
    @Nullable
    public final String getFrameCountAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.FRAMECOUNT);
    }

   /**
    * Get Frame count (a frame contains a count of samples depends of the format).
    * 
    * @return Frame count (a frame contains a count of samples depends of the format).
    */
    @Nullable
    public final Boolean getFrameCountAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.FRAMECOUNT);
    }

   /**
    * Get Frame count (a frame contains a count of samples depends of the format).
    * 
    * @return Frame count (a frame contains a count of samples depends of the format).
    */
    @Nullable
    public final BigInteger getFrameCountAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.FRAMECOUNT);
    }

   /**
    * Get Frame count (a frame contains a count of samples depends of the format).
    * 
    * @return Frame count (a frame contains a count of samples depends of the format).
    */
    @Nullable
    public final URL getFrameCountAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.FRAMECOUNT);
    }


   /**
    * Get Name of the track.
    * 
    * @return Name of the track.
    */
    @Nullable
    public final Integer getTitleAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.TITLE);
    }

   /**
    * Get Name of the track.
    * 
    * @return Name of the track.
    */
    @Nullable
    public final Long getTitleAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.TITLE);
    }

   /**
    * Get Name of the track.
    * 
    * @return Name of the track.
    */
    @Nullable
    public final LocalDateTime getTitleAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.TITLE);
    }

   /**
    * Get Name of the track.
    * 
    * @return Name of the track.
    */
    @Nullable
    public final LocalTime getTitleAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.TITLE);
    }

   /**
    * Get Name of the track.
    * 
    * @return Name of the track.
    */
    @Nullable
    public final String getTitleAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.TITLE);
    }

   /**
    * Get Name of the track.
    * 
    * @return Name of the track.
    */
    @Nullable
    public final Boolean getTitleAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.TITLE);
    }

   /**
    * Get Name of the track.
    * 
    * @return Name of the track.
    */
    @Nullable
    public final BigInteger getTitleAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.TITLE);
    }

   /**
    * Get Name of the track.
    * 
    * @return Name of the track.
    */
    @Nullable
    public final URL getTitleAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.TITLE);
    }


   /**
    * Get Delay drop frame.
    * 
    * @return Delay drop frame.
    */
    @Nullable
    public final Integer getDelayDropFrameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DELAYDROPFRAME);
    }

   /**
    * Get Delay drop frame.
    * 
    * @return Delay drop frame.
    */
    @Nullable
    public final Long getDelayDropFrameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DELAYDROPFRAME);
    }

   /**
    * Get Delay drop frame.
    * 
    * @return Delay drop frame.
    */
    @Nullable
    public final LocalDateTime getDelayDropFrameAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DELAYDROPFRAME);
    }

   /**
    * Get Delay drop frame.
    * 
    * @return Delay drop frame.
    */
    @Nullable
    public final LocalTime getDelayDropFrameAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DELAYDROPFRAME);
    }

   /**
    * Get Delay drop frame.
    * 
    * @return Delay drop frame.
    */
    @Nullable
    public final String getDelayDropFrameAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DELAYDROPFRAME);
    }

   /**
    * Get Delay drop frame.
    * 
    * @return Delay drop frame.
    */
    @Nullable
    public final Boolean getDelayDropFrameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DELAYDROPFRAME);
    }

   /**
    * Get Delay drop frame.
    * 
    * @return Delay drop frame.
    */
    @Nullable
    public final BigInteger getDelayDropFrameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DELAYDROPFRAME);
    }

   /**
    * Get Delay drop frame.
    * 
    * @return Delay drop frame.
    */
    @Nullable
    public final URL getDelayDropFrameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DELAYDROPFRAME);
    }


   /**
    * Get Sampling rate.
    * 
    * @return Sampling rate.
    */
    @Nullable
    public final Integer getSamplingRateAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SAMPLINGRATE);
    }

   /**
    * Get Sampling rate.
    * 
    * @return Sampling rate.
    */
    @Nullable
    public final Long getSamplingRateAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SAMPLINGRATE);
    }

   /**
    * Get Sampling rate.
    * 
    * @return Sampling rate.
    */
    @Nullable
    public final LocalDateTime getSamplingRateAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SAMPLINGRATE);
    }

   /**
    * Get Sampling rate.
    * 
    * @return Sampling rate.
    */
    @Nullable
    public final LocalTime getSamplingRateAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SAMPLINGRATE);
    }

   /**
    * Get Sampling rate.
    * 
    * @return Sampling rate.
    */
    @Nullable
    public final String getSamplingRateAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SAMPLINGRATE);
    }

   /**
    * Get Sampling rate.
    * 
    * @return Sampling rate.
    */
    @Nullable
    public final Boolean getSamplingRateAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SAMPLINGRATE);
    }

   /**
    * Get Sampling rate.
    * 
    * @return Sampling rate.
    */
    @Nullable
    public final BigInteger getSamplingRateAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SAMPLINGRATE);
    }

   /**
    * Get Sampling rate.
    * 
    * @return Sampling rate.
    */
    @Nullable
    public final URL getSamplingRateAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SAMPLINGRATE);
    }


   /**
    * Get Maximum Bit rate in bps.
    * 
    * @return Maximum Bit rate in bps.
    */
    @Nullable
    public final Integer getBitRateMaximumAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMAXIMUM);
    }

   /**
    * Get Maximum Bit rate in bps.
    * 
    * @return Maximum Bit rate in bps.
    */
    @Nullable
    public final Long getBitRateMaximumAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMAXIMUM);
    }

   /**
    * Get Maximum Bit rate in bps.
    * 
    * @return Maximum Bit rate in bps.
    */
    @Nullable
    public final LocalDateTime getBitRateMaximumAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMAXIMUM);
    }

   /**
    * Get Maximum Bit rate in bps.
    * 
    * @return Maximum Bit rate in bps.
    */
    @Nullable
    public final LocalTime getBitRateMaximumAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMAXIMUM);
    }

   /**
    * Get Maximum Bit rate in bps.
    * 
    * @return Maximum Bit rate in bps.
    */
    @Nullable
    public final String getBitRateMaximumAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMAXIMUM);
    }

   /**
    * Get Maximum Bit rate in bps.
    * 
    * @return Maximum Bit rate in bps.
    */
    @Nullable
    public final Boolean getBitRateMaximumAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMAXIMUM);
    }

   /**
    * Get Maximum Bit rate in bps.
    * 
    * @return Maximum Bit rate in bps.
    */
    @Nullable
    public final BigInteger getBitRateMaximumAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMAXIMUM);
    }

   /**
    * Get Maximum Bit rate in bps.
    * 
    * @return Maximum Bit rate in bps.
    */
    @Nullable
    public final URL getBitRateMaximumAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMAXIMUM);
    }


   /**
    * Get Format_Settings_Emphasis.
    * 
    * @return Format_Settings_Emphasis.
    */
    @Nullable
    public final Integer getFormatSettingsEmphasisAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSEMPHASIS);
    }

   /**
    * Get Format_Settings_Emphasis.
    * 
    * @return Format_Settings_Emphasis.
    */
    @Nullable
    public final Long getFormatSettingsEmphasisAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSEMPHASIS);
    }

   /**
    * Get Format_Settings_Emphasis.
    * 
    * @return Format_Settings_Emphasis.
    */
    @Nullable
    public final LocalDateTime getFormatSettingsEmphasisAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSEMPHASIS);
    }

   /**
    * Get Format_Settings_Emphasis.
    * 
    * @return Format_Settings_Emphasis.
    */
    @Nullable
    public final LocalTime getFormatSettingsEmphasisAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSEMPHASIS);
    }

   /**
    * Get Format_Settings_Emphasis.
    * 
    * @return Format_Settings_Emphasis.
    */
    @Nullable
    public final String getFormatSettingsEmphasisAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSEMPHASIS);
    }

   /**
    * Get Format_Settings_Emphasis.
    * 
    * @return Format_Settings_Emphasis.
    */
    @Nullable
    public final Boolean getFormatSettingsEmphasisAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSEMPHASIS);
    }

   /**
    * Get Format_Settings_Emphasis.
    * 
    * @return Format_Settings_Emphasis.
    */
    @Nullable
    public final BigInteger getFormatSettingsEmphasisAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSEMPHASIS);
    }

   /**
    * Get Format_Settings_Emphasis.
    * 
    * @return Format_Settings_Emphasis.
    */
    @Nullable
    public final URL getFormatSettingsEmphasisAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSEMPHASIS);
    }


   /**
    * Get Stream size divided by file size.
    * 
    * @return Stream size divided by file size.
    */
    @Nullable
    public final Integer getStreamSizeProportionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEPROPORTION);
    }

   /**
    * Get Stream size divided by file size.
    * 
    * @return Stream size divided by file size.
    */
    @Nullable
    public final Long getStreamSizeProportionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEPROPORTION);
    }

   /**
    * Get Stream size divided by file size.
    * 
    * @return Stream size divided by file size.
    */
    @Nullable
    public final LocalDateTime getStreamSizeProportionAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEPROPORTION);
    }

   /**
    * Get Stream size divided by file size.
    * 
    * @return Stream size divided by file size.
    */
    @Nullable
    public final LocalTime getStreamSizeProportionAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEPROPORTION);
    }

   /**
    * Get Stream size divided by file size.
    * 
    * @return Stream size divided by file size.
    */
    @Nullable
    public final String getStreamSizeProportionAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEPROPORTION);
    }

   /**
    * Get Stream size divided by file size.
    * 
    * @return Stream size divided by file size.
    */
    @Nullable
    public final Boolean getStreamSizeProportionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEPROPORTION);
    }

   /**
    * Get Stream size divided by file size.
    * 
    * @return Stream size divided by file size.
    */
    @Nullable
    public final BigInteger getStreamSizeProportionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEPROPORTION);
    }

   /**
    * Get Stream size divided by file size.
    * 
    * @return Stream size divided by file size.
    */
    @Nullable
    public final URL getStreamSizeProportionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEPROPORTION);
    }


   /**
    * Get Source Encoded Stream size divided by file size.
    * 
    * @return Source Encoded Stream size divided by file size.
    */
    @Nullable
    public final Integer getSourceStreamSizeEncodedProportionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDPROPORTION);
    }

   /**
    * Get Source Encoded Stream size divided by file size.
    * 
    * @return Source Encoded Stream size divided by file size.
    */
    @Nullable
    public final Long getSourceStreamSizeEncodedProportionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDPROPORTION);
    }

   /**
    * Get Source Encoded Stream size divided by file size.
    * 
    * @return Source Encoded Stream size divided by file size.
    */
    @Nullable
    public final LocalDateTime getSourceStreamSizeEncodedProportionAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDPROPORTION);
    }

   /**
    * Get Source Encoded Stream size divided by file size.
    * 
    * @return Source Encoded Stream size divided by file size.
    */
    @Nullable
    public final LocalTime getSourceStreamSizeEncodedProportionAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDPROPORTION);
    }

   /**
    * Get Source Encoded Stream size divided by file size.
    * 
    * @return Source Encoded Stream size divided by file size.
    */
    @Nullable
    public final String getSourceStreamSizeEncodedProportionAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDPROPORTION);
    }

   /**
    * Get Source Encoded Stream size divided by file size.
    * 
    * @return Source Encoded Stream size divided by file size.
    */
    @Nullable
    public final Boolean getSourceStreamSizeEncodedProportionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDPROPORTION);
    }

   /**
    * Get Source Encoded Stream size divided by file size.
    * 
    * @return Source Encoded Stream size divided by file size.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeEncodedProportionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDPROPORTION);
    }

   /**
    * Get Source Encoded Stream size divided by file size.
    * 
    * @return Source Encoded Stream size divided by file size.
    */
    @Nullable
    public final URL getSourceStreamSizeEncodedProportionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZEENCODEDPROPORTION);
    }


   /**
    * Get Parameters used by the software.
    * 
    * @return Parameters used by the software.
    */
    @Nullable
    public final Integer getEncodedLibrarySettingsAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYSETTINGS);
    }

   /**
    * Get Parameters used by the software.
    * 
    * @return Parameters used by the software.
    */
    @Nullable
    public final Long getEncodedLibrarySettingsAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYSETTINGS);
    }

   /**
    * Get Parameters used by the software.
    * 
    * @return Parameters used by the software.
    */
    @Nullable
    public final LocalDateTime getEncodedLibrarySettingsAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYSETTINGS);
    }

   /**
    * Get Parameters used by the software.
    * 
    * @return Parameters used by the software.
    */
    @Nullable
    public final LocalTime getEncodedLibrarySettingsAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYSETTINGS);
    }

   /**
    * Get Parameters used by the software.
    * 
    * @return Parameters used by the software.
    */
    @Nullable
    public final String getEncodedLibrarySettingsAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYSETTINGS);
    }

   /**
    * Get Parameters used by the software.
    * 
    * @return Parameters used by the software.
    */
    @Nullable
    public final Boolean getEncodedLibrarySettingsAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYSETTINGS);
    }

   /**
    * Get Parameters used by the software.
    * 
    * @return Parameters used by the software.
    */
    @Nullable
    public final BigInteger getEncodedLibrarySettingsAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYSETTINGS);
    }

   /**
    * Get Parameters used by the software.
    * 
    * @return Parameters used by the software.
    */
    @Nullable
    public final URL getEncodedLibrarySettingsAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYSETTINGS);
    }


   /**
    * Get Source Play time of the stream, in ms.
    * 
    * @return Source Play time of the stream, in ms.
    */
    @Nullable
    public final Integer getSourceDurationAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATION);
    }

   /**
    * Get Source Play time of the stream, in ms.
    * 
    * @return Source Play time of the stream, in ms.
    */
    @Nullable
    public final Long getSourceDurationAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATION);
    }

   /**
    * Get Source Play time of the stream, in ms.
    * 
    * @return Source Play time of the stream, in ms.
    */
    @Nullable
    public final LocalDateTime getSourceDurationAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATION);
    }

   /**
    * Get Source Play time of the stream, in ms.
    * 
    * @return Source Play time of the stream, in ms.
    */
    @Nullable
    public final LocalTime getSourceDurationAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATION);
    }

   /**
    * Get Source Play time of the stream, in ms.
    * 
    * @return Source Play time of the stream, in ms.
    */
    @Nullable
    public final String getSourceDurationAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATION);
    }

   /**
    * Get Source Play time of the stream, in ms.
    * 
    * @return Source Play time of the stream, in ms.
    */
    @Nullable
    public final Boolean getSourceDurationAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATION);
    }

   /**
    * Get Source Play time of the stream, in ms.
    * 
    * @return Source Play time of the stream, in ms.
    */
    @Nullable
    public final BigInteger getSourceDurationAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATION);
    }

   /**
    * Get Source Play time of the stream, in ms.
    * 
    * @return Source Play time of the stream, in ms.
    */
    @Nullable
    public final URL getSourceDurationAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATION);
    }


   /**
    * Get Format_Settings_PS/String.
    * 
    * @return Format_Settings_PS/String.
    */
    @Nullable
    public final Integer getFormatSettingsPSStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSPSSTRING);
    }

   /**
    * Get Format_Settings_PS/String.
    * 
    * @return Format_Settings_PS/String.
    */
    @Nullable
    public final Long getFormatSettingsPSStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSPSSTRING);
    }

   /**
    * Get Format_Settings_PS/String.
    * 
    * @return Format_Settings_PS/String.
    */
    @Nullable
    public final LocalDateTime getFormatSettingsPSStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSPSSTRING);
    }

   /**
    * Get Format_Settings_PS/String.
    * 
    * @return Format_Settings_PS/String.
    */
    @Nullable
    public final LocalTime getFormatSettingsPSStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSPSSTRING);
    }

   /**
    * Get Format_Settings_PS/String.
    * 
    * @return Format_Settings_PS/String.
    */
    @Nullable
    public final String getFormatSettingsPSStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSPSSTRING);
    }

   /**
    * Get Format_Settings_PS/String.
    * 
    * @return Format_Settings_PS/String.
    */
    @Nullable
    public final Boolean getFormatSettingsPSStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSPSSTRING);
    }

   /**
    * Get Format_Settings_PS/String.
    * 
    * @return Format_Settings_PS/String.
    */
    @Nullable
    public final BigInteger getFormatSettingsPSStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSPSSTRING);
    }

   /**
    * Get Format_Settings_PS/String.
    * 
    * @return Format_Settings_PS/String.
    */
    @Nullable
    public final URL getFormatSettingsPSStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSPSSTRING);
    }


   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Integer getDelayOriginalString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Long getDelayOriginalString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final LocalDateTime getDelayOriginalString1AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final LocalTime getDelayOriginalString1AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final String getDelayOriginalString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Boolean getDelayOriginalString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final BigInteger getDelayOriginalString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final URL getDelayOriginalString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING1);
    }


   /**
    * Get Count of objects available in this stream.
    * 
    * @return Count of objects available in this stream.
    */
    @Nullable
    public final Integer getCountAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.COUNT);
    }

   /**
    * Get Count of objects available in this stream.
    * 
    * @return Count of objects available in this stream.
    */
    @Nullable
    public final Long getCountAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.COUNT);
    }

   /**
    * Get Count of objects available in this stream.
    * 
    * @return Count of objects available in this stream.
    */
    @Nullable
    public final LocalDateTime getCountAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.COUNT);
    }

   /**
    * Get Count of objects available in this stream.
    * 
    * @return Count of objects available in this stream.
    */
    @Nullable
    public final LocalTime getCountAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.COUNT);
    }

   /**
    * Get Count of objects available in this stream.
    * 
    * @return Count of objects available in this stream.
    */
    @Nullable
    public final String getCountAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.COUNT);
    }

   /**
    * Get Count of objects available in this stream.
    * 
    * @return Count of objects available in this stream.
    */
    @Nullable
    public final Boolean getCountAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.COUNT);
    }

   /**
    * Get Count of objects available in this stream.
    * 
    * @return Count of objects available in this stream.
    */
    @Nullable
    public final BigInteger getCountAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.COUNT);
    }

   /**
    * Get Count of objects available in this stream.
    * 
    * @return Count of objects available in this stream.
    */
    @Nullable
    public final URL getCountAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.COUNT);
    }


   /**
    * Get Wrapping mode (Frame wrapped or Clip wrapped).
    * 
    * @return Wrapping mode (Frame wrapped or Clip wrapped).
    */
    @Nullable
    public final Integer getFormatSettingsWrappingAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSWRAPPING);
    }

   /**
    * Get Wrapping mode (Frame wrapped or Clip wrapped).
    * 
    * @return Wrapping mode (Frame wrapped or Clip wrapped).
    */
    @Nullable
    public final Long getFormatSettingsWrappingAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSWRAPPING);
    }

   /**
    * Get Wrapping mode (Frame wrapped or Clip wrapped).
    * 
    * @return Wrapping mode (Frame wrapped or Clip wrapped).
    */
    @Nullable
    public final LocalDateTime getFormatSettingsWrappingAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSWRAPPING);
    }

   /**
    * Get Wrapping mode (Frame wrapped or Clip wrapped).
    * 
    * @return Wrapping mode (Frame wrapped or Clip wrapped).
    */
    @Nullable
    public final LocalTime getFormatSettingsWrappingAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSWRAPPING);
    }

   /**
    * Get Wrapping mode (Frame wrapped or Clip wrapped).
    * 
    * @return Wrapping mode (Frame wrapped or Clip wrapped).
    */
    @Nullable
    public final String getFormatSettingsWrappingAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSWRAPPING);
    }

   /**
    * Get Wrapping mode (Frame wrapped or Clip wrapped).
    * 
    * @return Wrapping mode (Frame wrapped or Clip wrapped).
    */
    @Nullable
    public final Boolean getFormatSettingsWrappingAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSWRAPPING);
    }

   /**
    * Get Wrapping mode (Frame wrapped or Clip wrapped).
    * 
    * @return Wrapping mode (Frame wrapped or Clip wrapped).
    */
    @Nullable
    public final BigInteger getFormatSettingsWrappingAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSWRAPPING);
    }

   /**
    * Get Wrapping mode (Frame wrapped or Clip wrapped).
    * 
    * @return Wrapping mode (Frame wrapped or Clip wrapped).
    */
    @Nullable
    public final URL getFormatSettingsWrappingAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSWRAPPING);
    }


   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Integer getDelayOriginalString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Long getDelayOriginalString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final LocalDateTime getDelayOriginalString2AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final LocalTime getDelayOriginalString2AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final String getDelayOriginalString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Boolean getDelayOriginalString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final BigInteger getDelayOriginalString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final URL getDelayOriginalString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING2);
    }


   /**
    * Get Encryption.
    * 
    * @return Encryption.
    */
    @Nullable
    public final Integer getEncryptionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.ENCRYPTION);
    }

   /**
    * Get Encryption.
    * 
    * @return Encryption.
    */
    @Nullable
    public final Long getEncryptionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.ENCRYPTION);
    }

   /**
    * Get Encryption.
    * 
    * @return Encryption.
    */
    @Nullable
    public final LocalDateTime getEncryptionAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.ENCRYPTION);
    }

   /**
    * Get Encryption.
    * 
    * @return Encryption.
    */
    @Nullable
    public final LocalTime getEncryptionAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.ENCRYPTION);
    }

   /**
    * Get Encryption.
    * 
    * @return Encryption.
    */
    @Nullable
    public final String getEncryptionAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.ENCRYPTION);
    }

   /**
    * Get Encryption.
    * 
    * @return Encryption.
    */
    @Nullable
    public final Boolean getEncryptionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.ENCRYPTION);
    }

   /**
    * Get Encryption.
    * 
    * @return Encryption.
    */
    @Nullable
    public final BigInteger getEncryptionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.ENCRYPTION);
    }

   /**
    * Get Encryption.
    * 
    * @return Encryption.
    */
    @Nullable
    public final URL getEncryptionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.ENCRYPTION);
    }


   /**
    * Get Delay fixed in the raw stream (relative) IN MS.
    * 
    * @return Delay fixed in the raw stream (relative) IN MS.
    */
    @Nullable
    public final Integer getDelayOriginalAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINAL);
    }

   /**
    * Get Delay fixed in the raw stream (relative) IN MS.
    * 
    * @return Delay fixed in the raw stream (relative) IN MS.
    */
    @Nullable
    public final Long getDelayOriginalAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINAL);
    }

   /**
    * Get Delay fixed in the raw stream (relative) IN MS.
    * 
    * @return Delay fixed in the raw stream (relative) IN MS.
    */
    @Nullable
    public final LocalDateTime getDelayOriginalAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINAL);
    }

   /**
    * Get Delay fixed in the raw stream (relative) IN MS.
    * 
    * @return Delay fixed in the raw stream (relative) IN MS.
    */
    @Nullable
    public final LocalTime getDelayOriginalAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINAL);
    }

   /**
    * Get Delay fixed in the raw stream (relative) IN MS.
    * 
    * @return Delay fixed in the raw stream (relative) IN MS.
    */
    @Nullable
    public final String getDelayOriginalAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINAL);
    }

   /**
    * Get Delay fixed in the raw stream (relative) IN MS.
    * 
    * @return Delay fixed in the raw stream (relative) IN MS.
    */
    @Nullable
    public final Boolean getDelayOriginalAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINAL);
    }

   /**
    * Get Delay fixed in the raw stream (relative) IN MS.
    * 
    * @return Delay fixed in the raw stream (relative) IN MS.
    */
    @Nullable
    public final BigInteger getDelayOriginalAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINAL);
    }

   /**
    * Get Delay fixed in the raw stream (relative) IN MS.
    * 
    * @return Delay fixed in the raw stream (relative) IN MS.
    */
    @Nullable
    public final URL getDelayOriginalAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINAL);
    }


   /**
    * Get Frames per second, numerator.
    * 
    * @return Frames per second, numerator.
    */
    @Nullable
    public final Integer getFrameRateNumAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.FRAMERATENUM);
    }

   /**
    * Get Frames per second, numerator.
    * 
    * @return Frames per second, numerator.
    */
    @Nullable
    public final Long getFrameRateNumAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.FRAMERATENUM);
    }

   /**
    * Get Frames per second, numerator.
    * 
    * @return Frames per second, numerator.
    */
    @Nullable
    public final LocalDateTime getFrameRateNumAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.FRAMERATENUM);
    }

   /**
    * Get Frames per second, numerator.
    * 
    * @return Frames per second, numerator.
    */
    @Nullable
    public final LocalTime getFrameRateNumAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.FRAMERATENUM);
    }

   /**
    * Get Frames per second, numerator.
    * 
    * @return Frames per second, numerator.
    */
    @Nullable
    public final String getFrameRateNumAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.FRAMERATENUM);
    }

   /**
    * Get Frames per second, numerator.
    * 
    * @return Frames per second, numerator.
    */
    @Nullable
    public final Boolean getFrameRateNumAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.FRAMERATENUM);
    }

   /**
    * Get Frames per second, numerator.
    * 
    * @return Frames per second, numerator.
    */
    @Nullable
    public final BigInteger getFrameRateNumAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.FRAMERATENUM);
    }

   /**
    * Get Frames per second, numerator.
    * 
    * @return Frames per second, numerator.
    */
    @Nullable
    public final URL getFrameRateNumAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.FRAMERATENUM);
    }


   /**
    * Get How this stream file is aligned in the container.
    * 
    * @return How this stream file is aligned in the container.
    */
    @Nullable
    public final Integer getAlignmentAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.ALIGNMENT);
    }

   /**
    * Get How this stream file is aligned in the container.
    * 
    * @return How this stream file is aligned in the container.
    */
    @Nullable
    public final Long getAlignmentAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.ALIGNMENT);
    }

   /**
    * Get How this stream file is aligned in the container.
    * 
    * @return How this stream file is aligned in the container.
    */
    @Nullable
    public final LocalDateTime getAlignmentAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.ALIGNMENT);
    }

   /**
    * Get How this stream file is aligned in the container.
    * 
    * @return How this stream file is aligned in the container.
    */
    @Nullable
    public final LocalTime getAlignmentAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.ALIGNMENT);
    }

   /**
    * Get How this stream file is aligned in the container.
    * 
    * @return How this stream file is aligned in the container.
    */
    @Nullable
    public final String getAlignmentAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.ALIGNMENT);
    }

   /**
    * Get How this stream file is aligned in the container.
    * 
    * @return How this stream file is aligned in the container.
    */
    @Nullable
    public final Boolean getAlignmentAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.ALIGNMENT);
    }

   /**
    * Get How this stream file is aligned in the container.
    * 
    * @return How this stream file is aligned in the container.
    */
    @Nullable
    public final BigInteger getAlignmentAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.ALIGNMENT);
    }

   /**
    * Get How this stream file is aligned in the container.
    * 
    * @return How this stream file is aligned in the container.
    */
    @Nullable
    public final URL getAlignmentAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.ALIGNMENT);
    }


   /**
    * Get Version of this format.
    * 
    * @return Version of this format.
    */
    @Nullable
    public final Integer getFormatVersionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATVERSION);
    }

   /**
    * Get Version of this format.
    * 
    * @return Version of this format.
    */
    @Nullable
    public final Long getFormatVersionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.FORMATVERSION);
    }

   /**
    * Get Version of this format.
    * 
    * @return Version of this format.
    */
    @Nullable
    public final LocalDateTime getFormatVersionAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATVERSION);
    }

   /**
    * Get Version of this format.
    * 
    * @return Version of this format.
    */
    @Nullable
    public final LocalTime getFormatVersionAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATVERSION);
    }

   /**
    * Get Version of this format.
    * 
    * @return Version of this format.
    */
    @Nullable
    public final String getFormatVersionAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.FORMATVERSION);
    }

   /**
    * Get Version of this format.
    * 
    * @return Version of this format.
    */
    @Nullable
    public final Boolean getFormatVersionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.FORMATVERSION);
    }

   /**
    * Get Version of this format.
    * 
    * @return Version of this format.
    */
    @Nullable
    public final BigInteger getFormatVersionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATVERSION);
    }

   /**
    * Get Version of this format.
    * 
    * @return Version of this format.
    */
    @Nullable
    public final URL getFormatVersionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.FORMATVERSION);
    }


   /**
    * Get When multiple streams, number of the stream (base=1).
    * 
    * @return When multiple streams, number of the stream (base=1).
    */
    @Nullable
    public final Integer getStreamKindPosAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMKINDPOS);
    }

   /**
    * Get When multiple streams, number of the stream (base=1).
    * 
    * @return When multiple streams, number of the stream (base=1).
    */
    @Nullable
    public final Long getStreamKindPosAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.STREAMKINDPOS);
    }

   /**
    * Get When multiple streams, number of the stream (base=1).
    * 
    * @return When multiple streams, number of the stream (base=1).
    */
    @Nullable
    public final LocalDateTime getStreamKindPosAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMKINDPOS);
    }

   /**
    * Get When multiple streams, number of the stream (base=1).
    * 
    * @return When multiple streams, number of the stream (base=1).
    */
    @Nullable
    public final LocalTime getStreamKindPosAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMKINDPOS);
    }

   /**
    * Get When multiple streams, number of the stream (base=1).
    * 
    * @return When multiple streams, number of the stream (base=1).
    */
    @Nullable
    public final String getStreamKindPosAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.STREAMKINDPOS);
    }

   /**
    * Get When multiple streams, number of the stream (base=1).
    * 
    * @return When multiple streams, number of the stream (base=1).
    */
    @Nullable
    public final Boolean getStreamKindPosAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.STREAMKINDPOS);
    }

   /**
    * Get When multiple streams, number of the stream (base=1).
    * 
    * @return When multiple streams, number of the stream (base=1).
    */
    @Nullable
    public final BigInteger getStreamKindPosAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMKINDPOS);
    }

   /**
    * Get When multiple streams, number of the stream (base=1).
    * 
    * @return When multiple streams, number of the stream (base=1).
    */
    @Nullable
    public final URL getStreamKindPosAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.STREAMKINDPOS);
    }


   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final Integer getOriginalSourceMediumIDAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.ORIGINALSOURCEMEDIUMID);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final Long getOriginalSourceMediumIDAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.ORIGINALSOURCEMEDIUMID);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final LocalDateTime getOriginalSourceMediumIDAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.ORIGINALSOURCEMEDIUMID);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final LocalTime getOriginalSourceMediumIDAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.ORIGINALSOURCEMEDIUMID);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final String getOriginalSourceMediumIDAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.ORIGINALSOURCEMEDIUMID);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final Boolean getOriginalSourceMediumIDAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.ORIGINALSOURCEMEDIUMID);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final BigInteger getOriginalSourceMediumIDAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.ORIGINALSOURCEMEDIUMID);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final URL getOriginalSourceMediumIDAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.ORIGINALSOURCEMEDIUMID);
    }


   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Integer getDurationStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Long getDurationStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalDateTime getDurationStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalTime getDurationStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final String getDurationStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Boolean getDurationStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final BigInteger getDurationStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final URL getDurationStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING);
    }


   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final Integer getIDAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.ID);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final Long getIDAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.ID);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final LocalDateTime getIDAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.ID);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final LocalTime getIDAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.ID);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final String getIDAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.ID);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final Boolean getIDAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.ID);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final BigInteger getIDAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.ID);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final URL getIDAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.ID);
    }


   /**
    * Get Delay fixed in the stream (absolute / video).
    * 
    * @return Delay fixed in the stream (absolute / video).
    */
    @Nullable
    public final Integer getVideoDelayAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAY);
    }

   /**
    * Get Delay fixed in the stream (absolute / video).
    * 
    * @return Delay fixed in the stream (absolute / video).
    */
    @Nullable
    public final Long getVideoDelayAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAY);
    }

   /**
    * Get Delay fixed in the stream (absolute / video).
    * 
    * @return Delay fixed in the stream (absolute / video).
    */
    @Nullable
    public final LocalDateTime getVideoDelayAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAY);
    }

   /**
    * Get Delay fixed in the stream (absolute / video).
    * 
    * @return Delay fixed in the stream (absolute / video).
    */
    @Nullable
    public final LocalTime getVideoDelayAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAY);
    }

   /**
    * Get Delay fixed in the stream (absolute / video).
    * 
    * @return Delay fixed in the stream (absolute / video).
    */
    @Nullable
    public final String getVideoDelayAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAY);
    }

   /**
    * Get Delay fixed in the stream (absolute / video).
    * 
    * @return Delay fixed in the stream (absolute / video).
    */
    @Nullable
    public final Boolean getVideoDelayAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAY);
    }

   /**
    * Get Delay fixed in the stream (absolute / video).
    * 
    * @return Delay fixed in the stream (absolute / video).
    */
    @Nullable
    public final BigInteger getVideoDelayAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAY);
    }

   /**
    * Get Delay fixed in the stream (absolute / video).
    * 
    * @return Delay fixed in the stream (absolute / video).
    */
    @Nullable
    public final URL getVideoDelayAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAY);
    }


   /**
    * Get The gain to apply to reach 89dB SPL on playback.
    * 
    * @return The gain to apply to reach 89dB SPL on playback.
    */
    @Nullable
    public final Integer getReplayGainGainAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.REPLAYGAINGAIN);
    }

   /**
    * Get The gain to apply to reach 89dB SPL on playback.
    * 
    * @return The gain to apply to reach 89dB SPL on playback.
    */
    @Nullable
    public final Long getReplayGainGainAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.REPLAYGAINGAIN);
    }

   /**
    * Get The gain to apply to reach 89dB SPL on playback.
    * 
    * @return The gain to apply to reach 89dB SPL on playback.
    */
    @Nullable
    public final LocalDateTime getReplayGainGainAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.REPLAYGAINGAIN);
    }

   /**
    * Get The gain to apply to reach 89dB SPL on playback.
    * 
    * @return The gain to apply to reach 89dB SPL on playback.
    */
    @Nullable
    public final LocalTime getReplayGainGainAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.REPLAYGAINGAIN);
    }

   /**
    * Get The gain to apply to reach 89dB SPL on playback.
    * 
    * @return The gain to apply to reach 89dB SPL on playback.
    */
    @Nullable
    public final String getReplayGainGainAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.REPLAYGAINGAIN);
    }

   /**
    * Get The gain to apply to reach 89dB SPL on playback.
    * 
    * @return The gain to apply to reach 89dB SPL on playback.
    */
    @Nullable
    public final Boolean getReplayGainGainAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.REPLAYGAINGAIN);
    }

   /**
    * Get The gain to apply to reach 89dB SPL on playback.
    * 
    * @return The gain to apply to reach 89dB SPL on playback.
    */
    @Nullable
    public final BigInteger getReplayGainGainAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.REPLAYGAINGAIN);
    }

   /**
    * Get The gain to apply to reach 89dB SPL on playback.
    * 
    * @return The gain to apply to reach 89dB SPL on playback.
    */
    @Nullable
    public final URL getReplayGainGainAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.REPLAYGAINGAIN);
    }


   /**
    * Get Release date of software.
    * 
    * @return Release date of software.
    */
    @Nullable
    public final Integer getEncodedLibraryDateAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYDATE);
    }

   /**
    * Get Release date of software.
    * 
    * @return Release date of software.
    */
    @Nullable
    public final Long getEncodedLibraryDateAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYDATE);
    }

   /**
    * Get Release date of software.
    * 
    * @return Release date of software.
    */
    @Nullable
    public final LocalDateTime getEncodedLibraryDateAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYDATE);
    }

   /**
    * Get Release date of software.
    * 
    * @return Release date of software.
    */
    @Nullable
    public final LocalTime getEncodedLibraryDateAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYDATE);
    }

   /**
    * Get Release date of software.
    * 
    * @return Release date of software.
    */
    @Nullable
    public final String getEncodedLibraryDateAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYDATE);
    }

   /**
    * Get Release date of software.
    * 
    * @return Release date of software.
    */
    @Nullable
    public final Boolean getEncodedLibraryDateAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYDATE);
    }

   /**
    * Get Release date of software.
    * 
    * @return Release date of software.
    */
    @Nullable
    public final BigInteger getEncodedLibraryDateAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYDATE);
    }

   /**
    * Get Release date of software.
    * 
    * @return Release date of software.
    */
    @Nullable
    public final URL getEncodedLibraryDateAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYDATE);
    }


   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final Integer getMenuIDStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.MENUIDSTRING);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final Long getMenuIDStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.MENUIDSTRING);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final LocalDateTime getMenuIDStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.MENUIDSTRING);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final LocalTime getMenuIDStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.MENUIDSTRING);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final String getMenuIDStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.MENUIDSTRING);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final Boolean getMenuIDStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.MENUIDSTRING);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final BigInteger getMenuIDStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.MENUIDSTRING);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final URL getMenuIDStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.MENUIDSTRING);
    }


   /**
    * Get More info about Language (e.g. Director's Comment).
    * 
    * @return More info about Language (e.g. Director's Comment).
    */
    @Nullable
    public final Integer getLanguageMoreAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGEMORE);
    }

   /**
    * Get More info about Language (e.g. Director's Comment).
    * 
    * @return More info about Language (e.g. Director's Comment).
    */
    @Nullable
    public final Long getLanguageMoreAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGEMORE);
    }

   /**
    * Get More info about Language (e.g. Director's Comment).
    * 
    * @return More info about Language (e.g. Director's Comment).
    */
    @Nullable
    public final LocalDateTime getLanguageMoreAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGEMORE);
    }

   /**
    * Get More info about Language (e.g. Director's Comment).
    * 
    * @return More info about Language (e.g. Director's Comment).
    */
    @Nullable
    public final LocalTime getLanguageMoreAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGEMORE);
    }

   /**
    * Get More info about Language (e.g. Director's Comment).
    * 
    * @return More info about Language (e.g. Director's Comment).
    */
    @Nullable
    public final String getLanguageMoreAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGEMORE);
    }

   /**
    * Get More info about Language (e.g. Director's Comment).
    * 
    * @return More info about Language (e.g. Director's Comment).
    */
    @Nullable
    public final Boolean getLanguageMoreAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGEMORE);
    }

   /**
    * Get More info about Language (e.g. Director's Comment).
    * 
    * @return More info about Language (e.g. Director's Comment).
    */
    @Nullable
    public final BigInteger getLanguageMoreAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGEMORE);
    }

   /**
    * Get More info about Language (e.g. Director's Comment).
    * 
    * @return More info about Language (e.g. Director's Comment).
    */
    @Nullable
    public final URL getLanguageMoreAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGEMORE);
    }


   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final Integer getSourceStreamSizeStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING);
    }

   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final Long getSourceStreamSizeStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING);
    }

   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final LocalDateTime getSourceStreamSizeStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING);
    }

   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final LocalTime getSourceStreamSizeStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING);
    }

   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final String getSourceStreamSizeStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING);
    }

   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final Boolean getSourceStreamSizeStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING);
    }

   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING);
    }

   /**
    * Get Source Streamsize in with percentage value.
    * 
    * @return Source Streamsize in with percentage value.
    */
    @Nullable
    public final URL getSourceStreamSizeStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZESTRING);
    }


   /**
    * Get Format_Settings_Law.
    * 
    * @return Format_Settings_Law.
    */
    @Nullable
    public final Integer getFormatSettingsLawAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSLAW);
    }

   /**
    * Get Format_Settings_Law.
    * 
    * @return Format_Settings_Law.
    */
    @Nullable
    public final Long getFormatSettingsLawAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSLAW);
    }

   /**
    * Get Format_Settings_Law.
    * 
    * @return Format_Settings_Law.
    */
    @Nullable
    public final LocalDateTime getFormatSettingsLawAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSLAW);
    }

   /**
    * Get Format_Settings_Law.
    * 
    * @return Format_Settings_Law.
    */
    @Nullable
    public final LocalTime getFormatSettingsLawAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSLAW);
    }

   /**
    * Get Format_Settings_Law.
    * 
    * @return Format_Settings_Law.
    */
    @Nullable
    public final String getFormatSettingsLawAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSLAW);
    }

   /**
    * Get Format_Settings_Law.
    * 
    * @return Format_Settings_Law.
    */
    @Nullable
    public final Boolean getFormatSettingsLawAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSLAW);
    }

   /**
    * Get Format_Settings_Law.
    * 
    * @return Format_Settings_Law.
    */
    @Nullable
    public final BigInteger getFormatSettingsLawAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSLAW);
    }

   /**
    * Get Format_Settings_Law.
    * 
    * @return Format_Settings_Law.
    */
    @Nullable
    public final URL getFormatSettingsLawAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSLAW);
    }


   /**
    * Get Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final Integer getDurationFirstFrameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAME);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final Long getDurationFirstFrameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAME);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final LocalDateTime getDurationFirstFrameAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAME);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final LocalTime getDurationFirstFrameAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAME);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final String getDurationFirstFrameAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAME);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final Boolean getDurationFirstFrameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAME);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final BigInteger getDurationFirstFrameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAME);
    }

   /**
    * Get Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final URL getDurationFirstFrameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DURATIONFIRSTFRAME);
    }


   /**
    * Get Delay in format: HH:MM:SS.MMM.
    * 
    * @return Delay in format: HH:MM:SS.MMM.
    */
    @Nullable
    public final Integer getDelayOriginalString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING3);
    }

   /**
    * Get Delay in format: HH:MM:SS.MMM.
    * 
    * @return Delay in format: HH:MM:SS.MMM.
    */
    @Nullable
    public final Long getDelayOriginalString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING3);
    }

   /**
    * Get Delay in format: HH:MM:SS.MMM.
    * 
    * @return Delay in format: HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalDateTime getDelayOriginalString3AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING3);
    }

   /**
    * Get Delay in format: HH:MM:SS.MMM.
    * 
    * @return Delay in format: HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalTime getDelayOriginalString3AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING3);
    }

   /**
    * Get Delay in format: HH:MM:SS.MMM.
    * 
    * @return Delay in format: HH:MM:SS.MMM.
    */
    @Nullable
    public final String getDelayOriginalString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING3);
    }

   /**
    * Get Delay in format: HH:MM:SS.MMM.
    * 
    * @return Delay in format: HH:MM:SS.MMM.
    */
    @Nullable
    public final Boolean getDelayOriginalString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING3);
    }

   /**
    * Get Delay in format: HH:MM:SS.MMM.
    * 
    * @return Delay in format: HH:MM:SS.MMM.
    */
    @Nullable
    public final BigInteger getDelayOriginalString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING3);
    }

   /**
    * Get Delay in format: HH:MM:SS.MMM.
    * 
    * @return Delay in format: HH:MM:SS.MMM.
    */
    @Nullable
    public final URL getDelayOriginalString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING3);
    }


   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final Integer getEncodedApplicationStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATIONSTRING);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final Long getEncodedApplicationStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATIONSTRING);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final LocalDateTime getEncodedApplicationStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATIONSTRING);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final LocalTime getEncodedApplicationStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATIONSTRING);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final String getEncodedApplicationStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATIONSTRING);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final Boolean getEncodedApplicationStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATIONSTRING);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final BigInteger getEncodedApplicationStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATIONSTRING);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final URL getEncodedApplicationStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATIONSTRING);
    }


   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Integer getDelayOriginalString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING4);
    }

   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Long getDelayOriginalString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING4);
    }

   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalDateTime getDelayOriginalString4AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING4);
    }

   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalTime getDelayOriginalString4AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING4);
    }

   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final String getDelayOriginalString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING4);
    }

   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Boolean getDelayOriginalString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING4);
    }

   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final BigInteger getDelayOriginalString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING4);
    }

   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final URL getDelayOriginalString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING4);
    }


   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Integer getDelayOriginalString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Long getDelayOriginalString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalDateTime getDelayOriginalString5AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalTime getDelayOriginalString5AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final String getDelayOriginalString5AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Boolean getDelayOriginalString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final BigInteger getDelayOriginalString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final URL getDelayOriginalString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING5);
    }


   /**
    * Get Format_Settings_PS.
    * 
    * @return Format_Settings_PS.
    */
    @Nullable
    public final Integer getFormatSettingsPSAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSPS);
    }

   /**
    * Get Format_Settings_PS.
    * 
    * @return Format_Settings_PS.
    */
    @Nullable
    public final Long getFormatSettingsPSAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSPS);
    }

   /**
    * Get Format_Settings_PS.
    * 
    * @return Format_Settings_PS.
    */
    @Nullable
    public final LocalDateTime getFormatSettingsPSAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSPS);
    }

   /**
    * Get Format_Settings_PS.
    * 
    * @return Format_Settings_PS.
    */
    @Nullable
    public final LocalTime getFormatSettingsPSAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSPS);
    }

   /**
    * Get Format_Settings_PS.
    * 
    * @return Format_Settings_PS.
    */
    @Nullable
    public final String getFormatSettingsPSAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSPS);
    }

   /**
    * Get Format_Settings_PS.
    * 
    * @return Format_Settings_PS.
    */
    @Nullable
    public final Boolean getFormatSettingsPSAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSPS);
    }

   /**
    * Get Format_Settings_PS.
    * 
    * @return Format_Settings_PS.
    */
    @Nullable
    public final BigInteger getFormatSettingsPSAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSPS);
    }

   /**
    * Get Format_Settings_PS.
    * 
    * @return Format_Settings_PS.
    */
    @Nullable
    public final URL getFormatSettingsPSAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSPS);
    }


   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Integer getForcedAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.FORCED);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Long getForcedAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.FORCED);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final LocalDateTime getForcedAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.FORCED);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final LocalTime getForcedAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.FORCED);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final String getForcedAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.FORCED);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Boolean getForcedAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.FORCED);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final BigInteger getForcedAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.FORCED);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final URL getForcedAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.FORCED);
    }


   /**
    * Get Number of channels after matrix decoding (with measurement).
    * 
    * @return Number of channels after matrix decoding (with measurement).
    */
    @Nullable
    public final Integer getMatrixChannelsStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.MATRIXCHANNELSSTRING);
    }

   /**
    * Get Number of channels after matrix decoding (with measurement).
    * 
    * @return Number of channels after matrix decoding (with measurement).
    */
    @Nullable
    public final Long getMatrixChannelsStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.MATRIXCHANNELSSTRING);
    }

   /**
    * Get Number of channels after matrix decoding (with measurement).
    * 
    * @return Number of channels after matrix decoding (with measurement).
    */
    @Nullable
    public final LocalDateTime getMatrixChannelsStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.MATRIXCHANNELSSTRING);
    }

   /**
    * Get Number of channels after matrix decoding (with measurement).
    * 
    * @return Number of channels after matrix decoding (with measurement).
    */
    @Nullable
    public final LocalTime getMatrixChannelsStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.MATRIXCHANNELSSTRING);
    }

   /**
    * Get Number of channels after matrix decoding (with measurement).
    * 
    * @return Number of channels after matrix decoding (with measurement).
    */
    @Nullable
    public final String getMatrixChannelsStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.MATRIXCHANNELSSTRING);
    }

   /**
    * Get Number of channels after matrix decoding (with measurement).
    * 
    * @return Number of channels after matrix decoding (with measurement).
    */
    @Nullable
    public final Boolean getMatrixChannelsStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.MATRIXCHANNELSSTRING);
    }

   /**
    * Get Number of channels after matrix decoding (with measurement).
    * 
    * @return Number of channels after matrix decoding (with measurement).
    */
    @Nullable
    public final BigInteger getMatrixChannelsStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.MATRIXCHANNELSSTRING);
    }

   /**
    * Get Number of channels after matrix decoding (with measurement).
    * 
    * @return Number of channels after matrix decoding (with measurement).
    */
    @Nullable
    public final URL getMatrixChannelsStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.MATRIXCHANNELSSTRING);
    }


   /**
    * Get Last **Inform** call.
    * 
    * @return Last **Inform** call.
    */
    @Nullable
    public final Integer getInformAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.INFORM);
    }

   /**
    * Get Last **Inform** call.
    * 
    * @return Last **Inform** call.
    */
    @Nullable
    public final Long getInformAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.INFORM);
    }

   /**
    * Get Last **Inform** call.
    * 
    * @return Last **Inform** call.
    */
    @Nullable
    public final LocalDateTime getInformAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.INFORM);
    }

   /**
    * Get Last **Inform** call.
    * 
    * @return Last **Inform** call.
    */
    @Nullable
    public final LocalTime getInformAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.INFORM);
    }

   /**
    * Get Last **Inform** call.
    * 
    * @return Last **Inform** call.
    */
    @Nullable
    public final String getInformAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.INFORM);
    }

   /**
    * Get Last **Inform** call.
    * 
    * @return Last **Inform** call.
    */
    @Nullable
    public final Boolean getInformAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.INFORM);
    }

   /**
    * Get Last **Inform** call.
    * 
    * @return Last **Inform** call.
    */
    @Nullable
    public final BigInteger getInformAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.INFORM);
    }

   /**
    * Get Last **Inform** call.
    * 
    * @return Last **Inform** call.
    */
    @Nullable
    public final URL getInformAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.INFORM);
    }


   /**
    * Get Source Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final Integer getSourceDurationFirstFrameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAME);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final Long getSourceDurationFirstFrameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAME);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final LocalDateTime getSourceDurationFirstFrameAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAME);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final LocalTime getSourceDurationFirstFrameAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAME);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final String getSourceDurationFirstFrameAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAME);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final Boolean getSourceDurationFirstFrameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAME);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final BigInteger getSourceDurationFirstFrameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAME);
    }

   /**
    * Get Source Duration of the first frame if it is longer than others, in ms.
    * 
    * @return Source Duration of the first frame if it is longer than others, in ms.
    */
    @Nullable
    public final URL getSourceDurationFirstFrameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONFIRSTFRAME);
    }


   /**
    * Get Number of the stream (base=0).
    * 
    * @return Number of the stream (base=0).
    */
    @Nullable
    public final Integer getStreamKindIDAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMKINDID);
    }

   /**
    * Get Number of the stream (base=0).
    * 
    * @return Number of the stream (base=0).
    */
    @Nullable
    public final Long getStreamKindIDAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.STREAMKINDID);
    }

   /**
    * Get Number of the stream (base=0).
    * 
    * @return Number of the stream (base=0).
    */
    @Nullable
    public final LocalDateTime getStreamKindIDAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMKINDID);
    }

   /**
    * Get Number of the stream (base=0).
    * 
    * @return Number of the stream (base=0).
    */
    @Nullable
    public final LocalTime getStreamKindIDAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMKINDID);
    }

   /**
    * Get Number of the stream (base=0).
    * 
    * @return Number of the stream (base=0).
    */
    @Nullable
    public final String getStreamKindIDAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.STREAMKINDID);
    }

   /**
    * Get Number of the stream (base=0).
    * 
    * @return Number of the stream (base=0).
    */
    @Nullable
    public final Boolean getStreamKindIDAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.STREAMKINDID);
    }

   /**
    * Get Number of the stream (base=0).
    * 
    * @return Number of the stream (base=0).
    */
    @Nullable
    public final BigInteger getStreamKindIDAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMKINDID);
    }

   /**
    * Get Number of the stream (base=0).
    * 
    * @return Number of the stream (base=0).
    */
    @Nullable
    public final URL getStreamKindIDAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.STREAMKINDID);
    }


   /**
    * Get Format_Settings_Floor.
    * 
    * @return Format_Settings_Floor.
    */
    @Nullable
    public final Integer getFormatSettingsFloorAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSFLOOR);
    }

   /**
    * Get Format_Settings_Floor.
    * 
    * @return Format_Settings_Floor.
    */
    @Nullable
    public final Long getFormatSettingsFloorAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSFLOOR);
    }

   /**
    * Get Format_Settings_Floor.
    * 
    * @return Format_Settings_Floor.
    */
    @Nullable
    public final LocalDateTime getFormatSettingsFloorAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSFLOOR);
    }

   /**
    * Get Format_Settings_Floor.
    * 
    * @return Format_Settings_Floor.
    */
    @Nullable
    public final LocalTime getFormatSettingsFloorAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSFLOOR);
    }

   /**
    * Get Format_Settings_Floor.
    * 
    * @return Format_Settings_Floor.
    */
    @Nullable
    public final String getFormatSettingsFloorAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSFLOOR);
    }

   /**
    * Get Format_Settings_Floor.
    * 
    * @return Format_Settings_Floor.
    */
    @Nullable
    public final Boolean getFormatSettingsFloorAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSFLOOR);
    }

   /**
    * Get Format_Settings_Floor.
    * 
    * @return Format_Settings_Floor.
    */
    @Nullable
    public final BigInteger getFormatSettingsFloorAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSFLOOR);
    }

   /**
    * Get Format_Settings_Floor.
    * 
    * @return Format_Settings_Floor.
    */
    @Nullable
    public final URL getFormatSettingsFloorAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSFLOOR);
    }


   /**
    * Get Homepage of this format.
    * 
    * @return Homepage of this format.
    */
    @Nullable
    public final Integer getFormatUrlAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATURL);
    }

   /**
    * Get Homepage of this format.
    * 
    * @return Homepage of this format.
    */
    @Nullable
    public final Long getFormatUrlAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.FORMATURL);
    }

   /**
    * Get Homepage of this format.
    * 
    * @return Homepage of this format.
    */
    @Nullable
    public final LocalDateTime getFormatUrlAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATURL);
    }

   /**
    * Get Homepage of this format.
    * 
    * @return Homepage of this format.
    */
    @Nullable
    public final LocalTime getFormatUrlAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATURL);
    }

   /**
    * Get Homepage of this format.
    * 
    * @return Homepage of this format.
    */
    @Nullable
    public final String getFormatUrlAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.FORMATURL);
    }

   /**
    * Get Homepage of this format.
    * 
    * @return Homepage of this format.
    */
    @Nullable
    public final Boolean getFormatUrlAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.FORMATURL);
    }

   /**
    * Get Homepage of this format.
    * 
    * @return Homepage of this format.
    */
    @Nullable
    public final BigInteger getFormatUrlAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATURL);
    }

   /**
    * Get Homepage of this format.
    * 
    * @return Homepage of this format.
    */
    @Nullable
    public final URL getFormatUrlAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.FORMATURL);
    }


   /**
    * Get Minimum Bit rate (with measurement).
    * 
    * @return Minimum Bit rate (with measurement).
    */
    @Nullable
    public final Integer getBitRateMinimumStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMINIMUMSTRING);
    }

   /**
    * Get Minimum Bit rate (with measurement).
    * 
    * @return Minimum Bit rate (with measurement).
    */
    @Nullable
    public final Long getBitRateMinimumStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMINIMUMSTRING);
    }

   /**
    * Get Minimum Bit rate (with measurement).
    * 
    * @return Minimum Bit rate (with measurement).
    */
    @Nullable
    public final LocalDateTime getBitRateMinimumStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMINIMUMSTRING);
    }

   /**
    * Get Minimum Bit rate (with measurement).
    * 
    * @return Minimum Bit rate (with measurement).
    */
    @Nullable
    public final LocalTime getBitRateMinimumStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMINIMUMSTRING);
    }

   /**
    * Get Minimum Bit rate (with measurement).
    * 
    * @return Minimum Bit rate (with measurement).
    */
    @Nullable
    public final String getBitRateMinimumStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMINIMUMSTRING);
    }

   /**
    * Get Minimum Bit rate (with measurement).
    * 
    * @return Minimum Bit rate (with measurement).
    */
    @Nullable
    public final Boolean getBitRateMinimumStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMINIMUMSTRING);
    }

   /**
    * Get Minimum Bit rate (with measurement).
    * 
    * @return Minimum Bit rate (with measurement).
    */
    @Nullable
    public final BigInteger getBitRateMinimumStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMINIMUMSTRING);
    }

   /**
    * Get Minimum Bit rate (with measurement).
    * 
    * @return Minimum Bit rate (with measurement).
    */
    @Nullable
    public final URL getBitRateMinimumStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMINIMUMSTRING);
    }


   /**
    * Get Frames per second (with measurement).
    * 
    * @return Frames per second (with measurement).
    */
    @Nullable
    public final Integer getFrameRateStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.FRAMERATESTRING);
    }

   /**
    * Get Frames per second (with measurement).
    * 
    * @return Frames per second (with measurement).
    */
    @Nullable
    public final Long getFrameRateStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.FRAMERATESTRING);
    }

   /**
    * Get Frames per second (with measurement).
    * 
    * @return Frames per second (with measurement).
    */
    @Nullable
    public final LocalDateTime getFrameRateStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.FRAMERATESTRING);
    }

   /**
    * Get Frames per second (with measurement).
    * 
    * @return Frames per second (with measurement).
    */
    @Nullable
    public final LocalTime getFrameRateStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.FRAMERATESTRING);
    }

   /**
    * Get Frames per second (with measurement).
    * 
    * @return Frames per second (with measurement).
    */
    @Nullable
    public final String getFrameRateStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.FRAMERATESTRING);
    }

   /**
    * Get Frames per second (with measurement).
    * 
    * @return Frames per second (with measurement).
    */
    @Nullable
    public final Boolean getFrameRateStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.FRAMERATESTRING);
    }

   /**
    * Get Frames per second (with measurement).
    * 
    * @return Frames per second (with measurement).
    */
    @Nullable
    public final BigInteger getFrameRateStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.FRAMERATESTRING);
    }

   /**
    * Get Frames per second (with measurement).
    * 
    * @return Frames per second (with measurement).
    */
    @Nullable
    public final URL getFrameRateStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.FRAMERATESTRING);
    }


   /**
    * Get Source Frame count (a frame contains a count of samples depends of the format).
    * 
    * @return Source Frame count (a frame contains a count of samples depends of the format).
    */
    @Nullable
    public final Integer getSourceFrameCountAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCEFRAMECOUNT);
    }

   /**
    * Get Source Frame count (a frame contains a count of samples depends of the format).
    * 
    * @return Source Frame count (a frame contains a count of samples depends of the format).
    */
    @Nullable
    public final Long getSourceFrameCountAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SOURCEFRAMECOUNT);
    }

   /**
    * Get Source Frame count (a frame contains a count of samples depends of the format).
    * 
    * @return Source Frame count (a frame contains a count of samples depends of the format).
    */
    @Nullable
    public final LocalDateTime getSourceFrameCountAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCEFRAMECOUNT);
    }

   /**
    * Get Source Frame count (a frame contains a count of samples depends of the format).
    * 
    * @return Source Frame count (a frame contains a count of samples depends of the format).
    */
    @Nullable
    public final LocalTime getSourceFrameCountAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCEFRAMECOUNT);
    }

   /**
    * Get Source Frame count (a frame contains a count of samples depends of the format).
    * 
    * @return Source Frame count (a frame contains a count of samples depends of the format).
    */
    @Nullable
    public final String getSourceFrameCountAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SOURCEFRAMECOUNT);
    }

   /**
    * Get Source Frame count (a frame contains a count of samples depends of the format).
    * 
    * @return Source Frame count (a frame contains a count of samples depends of the format).
    */
    @Nullable
    public final Boolean getSourceFrameCountAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SOURCEFRAMECOUNT);
    }

   /**
    * Get Source Frame count (a frame contains a count of samples depends of the format).
    * 
    * @return Source Frame count (a frame contains a count of samples depends of the format).
    */
    @Nullable
    public final BigInteger getSourceFrameCountAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCEFRAMECOUNT);
    }

   /**
    * Get Source Frame count (a frame contains a count of samples depends of the format).
    * 
    * @return Source Frame count (a frame contains a count of samples depends of the format).
    */
    @Nullable
    public final URL getSourceFrameCountAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SOURCEFRAMECOUNT);
    }


   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Integer getDefaultAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DEFAULT);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Long getDefaultAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DEFAULT);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final LocalDateTime getDefaultAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DEFAULT);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final LocalTime getDefaultAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DEFAULT);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final String getDefaultAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DEFAULT);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Boolean getDefaultAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DEFAULT);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final BigInteger getDefaultAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DEFAULT);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final URL getDefaultAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DEFAULT);
    }


   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final Integer getDelayOriginalSettingsAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final Long getDelayOriginalSettingsAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final LocalDateTime getDelayOriginalSettingsAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final LocalTime getDelayOriginalSettingsAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final String getDelayOriginalSettingsAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final Boolean getDelayOriginalSettingsAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final BigInteger getDelayOriginalSettingsAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final URL getDelayOriginalSettingsAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSETTINGS);
    }


   /**
    * Get Name of the product.
    * 
    * @return Name of the product.
    */
    @Nullable
    public final Integer getEncodedApplicationNameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATIONNAME);
    }

   /**
    * Get Name of the product.
    * 
    * @return Name of the product.
    */
    @Nullable
    public final Long getEncodedApplicationNameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATIONNAME);
    }

   /**
    * Get Name of the product.
    * 
    * @return Name of the product.
    */
    @Nullable
    public final LocalDateTime getEncodedApplicationNameAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATIONNAME);
    }

   /**
    * Get Name of the product.
    * 
    * @return Name of the product.
    */
    @Nullable
    public final LocalTime getEncodedApplicationNameAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATIONNAME);
    }

   /**
    * Get Name of the product.
    * 
    * @return Name of the product.
    */
    @Nullable
    public final String getEncodedApplicationNameAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATIONNAME);
    }

   /**
    * Get Name of the product.
    * 
    * @return Name of the product.
    */
    @Nullable
    public final Boolean getEncodedApplicationNameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATIONNAME);
    }

   /**
    * Get Name of the product.
    * 
    * @return Name of the product.
    */
    @Nullable
    public final BigInteger getEncodedApplicationNameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATIONNAME);
    }

   /**
    * Get Name of the product.
    * 
    * @return Name of the product.
    */
    @Nullable
    public final URL getEncodedApplicationNameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATIONNAME);
    }


   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final Integer getUniqueIDStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.UNIQUEIDSTRING);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final Long getUniqueIDStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.UNIQUEIDSTRING);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final LocalDateTime getUniqueIDStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.UNIQUEIDSTRING);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final LocalTime getUniqueIDStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.UNIQUEIDSTRING);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final String getUniqueIDStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.UNIQUEIDSTRING);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final Boolean getUniqueIDStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.UNIQUEIDSTRING);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final BigInteger getUniqueIDStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.UNIQUEIDSTRING);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final URL getUniqueIDStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.UNIQUEIDSTRING);
    }


   /**
    * Get Detected (during scan of the input by the muxer) resolution in bits.
    * 
    * @return Detected (during scan of the input by the muxer) resolution in bits.
    */
    @Nullable
    public final Integer getBitDepthDetectedAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTHDETECTED);
    }

   /**
    * Get Detected (during scan of the input by the muxer) resolution in bits.
    * 
    * @return Detected (during scan of the input by the muxer) resolution in bits.
    */
    @Nullable
    public final Long getBitDepthDetectedAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTHDETECTED);
    }

   /**
    * Get Detected (during scan of the input by the muxer) resolution in bits.
    * 
    * @return Detected (during scan of the input by the muxer) resolution in bits.
    */
    @Nullable
    public final LocalDateTime getBitDepthDetectedAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTHDETECTED);
    }

   /**
    * Get Detected (during scan of the input by the muxer) resolution in bits.
    * 
    * @return Detected (during scan of the input by the muxer) resolution in bits.
    */
    @Nullable
    public final LocalTime getBitDepthDetectedAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTHDETECTED);
    }

   /**
    * Get Detected (during scan of the input by the muxer) resolution in bits.
    * 
    * @return Detected (during scan of the input by the muxer) resolution in bits.
    */
    @Nullable
    public final String getBitDepthDetectedAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTHDETECTED);
    }

   /**
    * Get Detected (during scan of the input by the muxer) resolution in bits.
    * 
    * @return Detected (during scan of the input by the muxer) resolution in bits.
    */
    @Nullable
    public final Boolean getBitDepthDetectedAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTHDETECTED);
    }

   /**
    * Get Detected (during scan of the input by the muxer) resolution in bits.
    * 
    * @return Detected (during scan of the input by the muxer) resolution in bits.
    */
    @Nullable
    public final BigInteger getBitDepthDetectedAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTHDETECTED);
    }

   /**
    * Get Detected (during scan of the input by the muxer) resolution in bits.
    * 
    * @return Detected (during scan of the input by the muxer) resolution in bits.
    */
    @Nullable
    public final URL getBitDepthDetectedAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTHDETECTED);
    }


   /**
    * Get Profile of the Format (old XML: 'Profile@Level' format.
    * 
    * @return Profile of the Format (old XML: 'Profile@Level' format.
    */
    @Nullable
    public final Integer getFormatProfileAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATPROFILE);
    }

   /**
    * Get Profile of the Format (old XML: 'Profile@Level' format.
    * 
    * @return Profile of the Format (old XML: 'Profile@Level' format.
    */
    @Nullable
    public final Long getFormatProfileAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.FORMATPROFILE);
    }

   /**
    * Get Profile of the Format (old XML: 'Profile@Level' format.
    * 
    * @return Profile of the Format (old XML: 'Profile@Level' format.
    */
    @Nullable
    public final LocalDateTime getFormatProfileAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATPROFILE);
    }

   /**
    * Get Profile of the Format (old XML: 'Profile@Level' format.
    * 
    * @return Profile of the Format (old XML: 'Profile@Level' format.
    */
    @Nullable
    public final LocalTime getFormatProfileAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATPROFILE);
    }

   /**
    * Get Profile of the Format (old XML: 'Profile@Level' format.
    * 
    * @return Profile of the Format (old XML: 'Profile@Level' format.
    */
    @Nullable
    public final String getFormatProfileAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.FORMATPROFILE);
    }

   /**
    * Get Profile of the Format (old XML: 'Profile@Level' format.
    * 
    * @return Profile of the Format (old XML: 'Profile@Level' format.
    */
    @Nullable
    public final Boolean getFormatProfileAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.FORMATPROFILE);
    }

   /**
    * Get Profile of the Format (old XML: 'Profile@Level' format.
    * 
    * @return Profile of the Format (old XML: 'Profile@Level' format.
    */
    @Nullable
    public final BigInteger getFormatProfileAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATPROFILE);
    }

   /**
    * Get Profile of the Format (old XML: 'Profile@Level' format.
    * 
    * @return Profile of the Format (old XML: 'Profile@Level' format.
    */
    @Nullable
    public final URL getFormatProfileAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.FORMATPROFILE);
    }


   /**
    * Get StreamSize_Encoded/String2.
    * 
    * @return StreamSize_Encoded/String2.
    */
    @Nullable
    public final Integer getStreamSizeEncodedString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING2);
    }

   /**
    * Get StreamSize_Encoded/String2.
    * 
    * @return StreamSize_Encoded/String2.
    */
    @Nullable
    public final Long getStreamSizeEncodedString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING2);
    }

   /**
    * Get StreamSize_Encoded/String2.
    * 
    * @return StreamSize_Encoded/String2.
    */
    @Nullable
    public final LocalDateTime getStreamSizeEncodedString2AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING2);
    }

   /**
    * Get StreamSize_Encoded/String2.
    * 
    * @return StreamSize_Encoded/String2.
    */
    @Nullable
    public final LocalTime getStreamSizeEncodedString2AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING2);
    }

   /**
    * Get StreamSize_Encoded/String2.
    * 
    * @return StreamSize_Encoded/String2.
    */
    @Nullable
    public final String getStreamSizeEncodedString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING2);
    }

   /**
    * Get StreamSize_Encoded/String2.
    * 
    * @return StreamSize_Encoded/String2.
    */
    @Nullable
    public final Boolean getStreamSizeEncodedString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING2);
    }

   /**
    * Get StreamSize_Encoded/String2.
    * 
    * @return StreamSize_Encoded/String2.
    */
    @Nullable
    public final BigInteger getStreamSizeEncodedString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING2);
    }

   /**
    * Get StreamSize_Encoded/String2.
    * 
    * @return StreamSize_Encoded/String2.
    */
    @Nullable
    public final URL getStreamSizeEncodedString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING2);
    }


   /**
    * Get StreamSize_Demuxed/String1.
    * 
    * @return StreamSize_Demuxed/String1.
    */
    @Nullable
    public final Integer getStreamSizeDemuxedString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING1);
    }

   /**
    * Get StreamSize_Demuxed/String1.
    * 
    * @return StreamSize_Demuxed/String1.
    */
    @Nullable
    public final Long getStreamSizeDemuxedString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING1);
    }

   /**
    * Get StreamSize_Demuxed/String1.
    * 
    * @return StreamSize_Demuxed/String1.
    */
    @Nullable
    public final LocalDateTime getStreamSizeDemuxedString1AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING1);
    }

   /**
    * Get StreamSize_Demuxed/String1.
    * 
    * @return StreamSize_Demuxed/String1.
    */
    @Nullable
    public final LocalTime getStreamSizeDemuxedString1AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING1);
    }

   /**
    * Get StreamSize_Demuxed/String1.
    * 
    * @return StreamSize_Demuxed/String1.
    */
    @Nullable
    public final String getStreamSizeDemuxedString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING1);
    }

   /**
    * Get StreamSize_Demuxed/String1.
    * 
    * @return StreamSize_Demuxed/String1.
    */
    @Nullable
    public final Boolean getStreamSizeDemuxedString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING1);
    }

   /**
    * Get StreamSize_Demuxed/String1.
    * 
    * @return StreamSize_Demuxed/String1.
    */
    @Nullable
    public final BigInteger getStreamSizeDemuxedString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING1);
    }

   /**
    * Get StreamSize_Demuxed/String1.
    * 
    * @return StreamSize_Demuxed/String1.
    */
    @Nullable
    public final URL getStreamSizeDemuxedString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING1);
    }


   /**
    * Get StreamSize_Encoded/String3.
    * 
    * @return StreamSize_Encoded/String3.
    */
    @Nullable
    public final Integer getStreamSizeEncodedString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING3);
    }

   /**
    * Get StreamSize_Encoded/String3.
    * 
    * @return StreamSize_Encoded/String3.
    */
    @Nullable
    public final Long getStreamSizeEncodedString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING3);
    }

   /**
    * Get StreamSize_Encoded/String3.
    * 
    * @return StreamSize_Encoded/String3.
    */
    @Nullable
    public final LocalDateTime getStreamSizeEncodedString3AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING3);
    }

   /**
    * Get StreamSize_Encoded/String3.
    * 
    * @return StreamSize_Encoded/String3.
    */
    @Nullable
    public final LocalTime getStreamSizeEncodedString3AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING3);
    }

   /**
    * Get StreamSize_Encoded/String3.
    * 
    * @return StreamSize_Encoded/String3.
    */
    @Nullable
    public final String getStreamSizeEncodedString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING3);
    }

   /**
    * Get StreamSize_Encoded/String3.
    * 
    * @return StreamSize_Encoded/String3.
    */
    @Nullable
    public final Boolean getStreamSizeEncodedString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING3);
    }

   /**
    * Get StreamSize_Encoded/String3.
    * 
    * @return StreamSize_Encoded/String3.
    */
    @Nullable
    public final BigInteger getStreamSizeEncodedString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING3);
    }

   /**
    * Get StreamSize_Encoded/String3.
    * 
    * @return StreamSize_Encoded/String3.
    */
    @Nullable
    public final URL getStreamSizeEncodedString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING3);
    }


   /**
    * Get StreamSize_Demuxed/String2.
    * 
    * @return StreamSize_Demuxed/String2.
    */
    @Nullable
    public final Integer getStreamSizeDemuxedString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING2);
    }

   /**
    * Get StreamSize_Demuxed/String2.
    * 
    * @return StreamSize_Demuxed/String2.
    */
    @Nullable
    public final Long getStreamSizeDemuxedString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING2);
    }

   /**
    * Get StreamSize_Demuxed/String2.
    * 
    * @return StreamSize_Demuxed/String2.
    */
    @Nullable
    public final LocalDateTime getStreamSizeDemuxedString2AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING2);
    }

   /**
    * Get StreamSize_Demuxed/String2.
    * 
    * @return StreamSize_Demuxed/String2.
    */
    @Nullable
    public final LocalTime getStreamSizeDemuxedString2AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING2);
    }

   /**
    * Get StreamSize_Demuxed/String2.
    * 
    * @return StreamSize_Demuxed/String2.
    */
    @Nullable
    public final String getStreamSizeDemuxedString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING2);
    }

   /**
    * Get StreamSize_Demuxed/String2.
    * 
    * @return StreamSize_Demuxed/String2.
    */
    @Nullable
    public final Boolean getStreamSizeDemuxedString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING2);
    }

   /**
    * Get StreamSize_Demuxed/String2.
    * 
    * @return StreamSize_Demuxed/String2.
    */
    @Nullable
    public final BigInteger getStreamSizeDemuxedString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING2);
    }

   /**
    * Get StreamSize_Demuxed/String2.
    * 
    * @return StreamSize_Demuxed/String2.
    */
    @Nullable
    public final URL getStreamSizeDemuxedString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING2);
    }


   /**
    * Get StreamSize_Demuxed/String3.
    * 
    * @return StreamSize_Demuxed/String3.
    */
    @Nullable
    public final Integer getStreamSizeDemuxedString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING3);
    }

   /**
    * Get StreamSize_Demuxed/String3.
    * 
    * @return StreamSize_Demuxed/String3.
    */
    @Nullable
    public final Long getStreamSizeDemuxedString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING3);
    }

   /**
    * Get StreamSize_Demuxed/String3.
    * 
    * @return StreamSize_Demuxed/String3.
    */
    @Nullable
    public final LocalDateTime getStreamSizeDemuxedString3AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING3);
    }

   /**
    * Get StreamSize_Demuxed/String3.
    * 
    * @return StreamSize_Demuxed/String3.
    */
    @Nullable
    public final LocalTime getStreamSizeDemuxedString3AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING3);
    }

   /**
    * Get StreamSize_Demuxed/String3.
    * 
    * @return StreamSize_Demuxed/String3.
    */
    @Nullable
    public final String getStreamSizeDemuxedString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING3);
    }

   /**
    * Get StreamSize_Demuxed/String3.
    * 
    * @return StreamSize_Demuxed/String3.
    */
    @Nullable
    public final Boolean getStreamSizeDemuxedString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING3);
    }

   /**
    * Get StreamSize_Demuxed/String3.
    * 
    * @return StreamSize_Demuxed/String3.
    */
    @Nullable
    public final BigInteger getStreamSizeDemuxedString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING3);
    }

   /**
    * Get StreamSize_Demuxed/String3.
    * 
    * @return StreamSize_Demuxed/String3.
    */
    @Nullable
    public final URL getStreamSizeDemuxedString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING3);
    }


   /**
    * Get StreamSize_Encoded/String1.
    * 
    * @return StreamSize_Encoded/String1.
    */
    @Nullable
    public final Integer getStreamSizeEncodedString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING1);
    }

   /**
    * Get StreamSize_Encoded/String1.
    * 
    * @return StreamSize_Encoded/String1.
    */
    @Nullable
    public final Long getStreamSizeEncodedString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING1);
    }

   /**
    * Get StreamSize_Encoded/String1.
    * 
    * @return StreamSize_Encoded/String1.
    */
    @Nullable
    public final LocalDateTime getStreamSizeEncodedString1AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING1);
    }

   /**
    * Get StreamSize_Encoded/String1.
    * 
    * @return StreamSize_Encoded/String1.
    */
    @Nullable
    public final LocalTime getStreamSizeEncodedString1AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING1);
    }

   /**
    * Get StreamSize_Encoded/String1.
    * 
    * @return StreamSize_Encoded/String1.
    */
    @Nullable
    public final String getStreamSizeEncodedString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING1);
    }

   /**
    * Get StreamSize_Encoded/String1.
    * 
    * @return StreamSize_Encoded/String1.
    */
    @Nullable
    public final Boolean getStreamSizeEncodedString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING1);
    }

   /**
    * Get StreamSize_Encoded/String1.
    * 
    * @return StreamSize_Encoded/String1.
    */
    @Nullable
    public final BigInteger getStreamSizeEncodedString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING1);
    }

   /**
    * Get StreamSize_Encoded/String1.
    * 
    * @return StreamSize_Encoded/String1.
    */
    @Nullable
    public final URL getStreamSizeEncodedString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING1);
    }


   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final Integer getLanguageStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGESTRING);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final Long getLanguageStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGESTRING);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final LocalDateTime getLanguageStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGESTRING);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final LocalTime getLanguageStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGESTRING);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final String getLanguageStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGESTRING);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final Boolean getLanguageStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGESTRING);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final BigInteger getLanguageStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGESTRING);
    }

   /**
    * Get Language (full).
    * 
    * @return Language (full).
    */
    @Nullable
    public final URL getLanguageStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.LANGUAGESTRING);
    }


   /**
    * Get StreamSize_Demuxed/String4.
    * 
    * @return StreamSize_Demuxed/String4.
    */
    @Nullable
    public final Integer getStreamSizeDemuxedString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING4);
    }

   /**
    * Get StreamSize_Demuxed/String4.
    * 
    * @return StreamSize_Demuxed/String4.
    */
    @Nullable
    public final Long getStreamSizeDemuxedString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING4);
    }

   /**
    * Get StreamSize_Demuxed/String4.
    * 
    * @return StreamSize_Demuxed/String4.
    */
    @Nullable
    public final LocalDateTime getStreamSizeDemuxedString4AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING4);
    }

   /**
    * Get StreamSize_Demuxed/String4.
    * 
    * @return StreamSize_Demuxed/String4.
    */
    @Nullable
    public final LocalTime getStreamSizeDemuxedString4AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING4);
    }

   /**
    * Get StreamSize_Demuxed/String4.
    * 
    * @return StreamSize_Demuxed/String4.
    */
    @Nullable
    public final String getStreamSizeDemuxedString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING4);
    }

   /**
    * Get StreamSize_Demuxed/String4.
    * 
    * @return StreamSize_Demuxed/String4.
    */
    @Nullable
    public final Boolean getStreamSizeDemuxedString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING4);
    }

   /**
    * Get StreamSize_Demuxed/String4.
    * 
    * @return StreamSize_Demuxed/String4.
    */
    @Nullable
    public final BigInteger getStreamSizeDemuxedString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING4);
    }

   /**
    * Get StreamSize_Demuxed/String4.
    * 
    * @return StreamSize_Demuxed/String4.
    */
    @Nullable
    public final URL getStreamSizeDemuxedString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING4);
    }


   /**
    * Get StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    * 
    * @return StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    */
    @Nullable
    public final Integer getStreamSizeDemuxedString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING5);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    * 
    * @return StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    */
    @Nullable
    public final Long getStreamSizeDemuxedString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING5);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    * 
    * @return StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    */
    @Nullable
    public final LocalDateTime getStreamSizeDemuxedString5AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING5);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    * 
    * @return StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    */
    @Nullable
    public final LocalTime getStreamSizeDemuxedString5AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING5);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    * 
    * @return StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    */
    @Nullable
    public final String getStreamSizeDemuxedString5AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING5);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    * 
    * @return StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    */
    @Nullable
    public final Boolean getStreamSizeDemuxedString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING5);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    * 
    * @return StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    */
    @Nullable
    public final BigInteger getStreamSizeDemuxedString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING5);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    * 
    * @return StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    */
    @Nullable
    public final URL getStreamSizeDemuxedString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING5);
    }


   /**
    * Get StreamSize_Encoded/String4.
    * 
    * @return StreamSize_Encoded/String4.
    */
    @Nullable
    public final Integer getStreamSizeEncodedString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING4);
    }

   /**
    * Get StreamSize_Encoded/String4.
    * 
    * @return StreamSize_Encoded/String4.
    */
    @Nullable
    public final Long getStreamSizeEncodedString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING4);
    }

   /**
    * Get StreamSize_Encoded/String4.
    * 
    * @return StreamSize_Encoded/String4.
    */
    @Nullable
    public final LocalDateTime getStreamSizeEncodedString4AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING4);
    }

   /**
    * Get StreamSize_Encoded/String4.
    * 
    * @return StreamSize_Encoded/String4.
    */
    @Nullable
    public final LocalTime getStreamSizeEncodedString4AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING4);
    }

   /**
    * Get StreamSize_Encoded/String4.
    * 
    * @return StreamSize_Encoded/String4.
    */
    @Nullable
    public final String getStreamSizeEncodedString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING4);
    }

   /**
    * Get StreamSize_Encoded/String4.
    * 
    * @return StreamSize_Encoded/String4.
    */
    @Nullable
    public final Boolean getStreamSizeEncodedString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING4);
    }

   /**
    * Get StreamSize_Encoded/String4.
    * 
    * @return StreamSize_Encoded/String4.
    */
    @Nullable
    public final BigInteger getStreamSizeEncodedString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING4);
    }

   /**
    * Get StreamSize_Encoded/String4.
    * 
    * @return StreamSize_Encoded/String4.
    */
    @Nullable
    public final URL getStreamSizeEncodedString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING4);
    }


   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final Integer getStreamSizeEncodedString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING5);
    }

   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final Long getStreamSizeEncodedString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING5);
    }

   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final LocalDateTime getStreamSizeEncodedString5AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING5);
    }

   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final LocalTime getStreamSizeEncodedString5AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING5);
    }

   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final String getStreamSizeEncodedString5AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING5);
    }

   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final Boolean getStreamSizeEncodedString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING5);
    }

   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final BigInteger getStreamSizeEncodedString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING5);
    }

   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final URL getStreamSizeEncodedString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING5);
    }


   /**
    * Get Level of the Format (only MIXML).
    * 
    * @return Level of the Format (only MIXML).
    */
    @Nullable
    public final Integer getFormatLevelAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATLEVEL);
    }

   /**
    * Get Level of the Format (only MIXML).
    * 
    * @return Level of the Format (only MIXML).
    */
    @Nullable
    public final Long getFormatLevelAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.FORMATLEVEL);
    }

   /**
    * Get Level of the Format (only MIXML).
    * 
    * @return Level of the Format (only MIXML).
    */
    @Nullable
    public final LocalDateTime getFormatLevelAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATLEVEL);
    }

   /**
    * Get Level of the Format (only MIXML).
    * 
    * @return Level of the Format (only MIXML).
    */
    @Nullable
    public final LocalTime getFormatLevelAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATLEVEL);
    }

   /**
    * Get Level of the Format (only MIXML).
    * 
    * @return Level of the Format (only MIXML).
    */
    @Nullable
    public final String getFormatLevelAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.FORMATLEVEL);
    }

   /**
    * Get Level of the Format (only MIXML).
    * 
    * @return Level of the Format (only MIXML).
    */
    @Nullable
    public final Boolean getFormatLevelAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.FORMATLEVEL);
    }

   /**
    * Get Level of the Format (only MIXML).
    * 
    * @return Level of the Format (only MIXML).
    */
    @Nullable
    public final BigInteger getFormatLevelAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATLEVEL);
    }

   /**
    * Get Level of the Format (only MIXML).
    * 
    * @return Level of the Format (only MIXML).
    */
    @Nullable
    public final URL getFormatLevelAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.FORMATLEVEL);
    }


   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Integer getDurationLastFrameString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Long getDurationLastFrameString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalDateTime getDurationLastFrameString5AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalTime getDurationLastFrameString5AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final String getDurationLastFrameString5AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Boolean getDurationLastFrameString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final BigInteger getDurationLastFrameString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final URL getDurationLastFrameString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING5);
    }


   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Integer getDurationLastFrameString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Long getDurationLastFrameString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalDateTime getDurationLastFrameString4AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalTime getDurationLastFrameString4AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final String getDurationLastFrameString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Boolean getDurationLastFrameString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final BigInteger getDurationLastFrameString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final URL getDurationLastFrameString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING4);
    }


   /**
    * Get StreamSize_Demuxed in with percentage value.
    * 
    * @return StreamSize_Demuxed in with percentage value.
    */
    @Nullable
    public final Integer getStreamSizeDemuxedStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value.
    * 
    * @return StreamSize_Demuxed in with percentage value.
    */
    @Nullable
    public final Long getStreamSizeDemuxedStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value.
    * 
    * @return StreamSize_Demuxed in with percentage value.
    */
    @Nullable
    public final LocalDateTime getStreamSizeDemuxedStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value.
    * 
    * @return StreamSize_Demuxed in with percentage value.
    */
    @Nullable
    public final LocalTime getStreamSizeDemuxedStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value.
    * 
    * @return StreamSize_Demuxed in with percentage value.
    */
    @Nullable
    public final String getStreamSizeDemuxedStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value.
    * 
    * @return StreamSize_Demuxed in with percentage value.
    */
    @Nullable
    public final Boolean getStreamSizeDemuxedStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value.
    * 
    * @return StreamSize_Demuxed in with percentage value.
    */
    @Nullable
    public final BigInteger getStreamSizeDemuxedStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value.
    * 
    * @return StreamSize_Demuxed in with percentage value.
    */
    @Nullable
    public final URL getStreamSizeDemuxedStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXEDSTRING);
    }


   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Integer getForcedStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.FORCEDSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Long getForcedStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.FORCEDSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final LocalDateTime getForcedStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.FORCEDSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final LocalTime getForcedStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.FORCEDSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final String getForcedStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.FORCEDSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final Boolean getForcedStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.FORCEDSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final BigInteger getForcedStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.FORCEDSTRING);
    }

   /**
    * Get Set if that track should be used if no language found matches the user preference..
    * 
    * @return Set if that track should be used if no language found matches the user preference..
    */
    @Nullable
    public final URL getForcedStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.FORCEDSTRING);
    }


   /**
    * Get Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different.
    * 
    * @return Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different.
    */
    @Nullable
    public final Integer getBitDepthAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTH);
    }

   /**
    * Get Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different.
    * 
    * @return Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different.
    */
    @Nullable
    public final Long getBitDepthAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTH);
    }

   /**
    * Get Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different.
    * 
    * @return Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different.
    */
    @Nullable
    public final LocalDateTime getBitDepthAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTH);
    }

   /**
    * Get Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different.
    * 
    * @return Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different.
    */
    @Nullable
    public final LocalTime getBitDepthAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTH);
    }

   /**
    * Get Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different.
    * 
    * @return Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different.
    */
    @Nullable
    public final String getBitDepthAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTH);
    }

   /**
    * Get Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different.
    * 
    * @return Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different.
    */
    @Nullable
    public final Boolean getBitDepthAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTH);
    }

   /**
    * Get Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different.
    * 
    * @return Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different.
    */
    @Nullable
    public final BigInteger getBitDepthAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTH);
    }

   /**
    * Get Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different.
    * 
    * @return Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different.
    */
    @Nullable
    public final URL getBitDepthAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTH);
    }


   /**
    * Get Encoded Streamsize in bytes.
    * 
    * @return Encoded Streamsize in bytes.
    */
    @Nullable
    public final Integer getStreamSizeEncodedAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODED);
    }

   /**
    * Get Encoded Streamsize in bytes.
    * 
    * @return Encoded Streamsize in bytes.
    */
    @Nullable
    public final Long getStreamSizeEncodedAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODED);
    }

   /**
    * Get Encoded Streamsize in bytes.
    * 
    * @return Encoded Streamsize in bytes.
    */
    @Nullable
    public final LocalDateTime getStreamSizeEncodedAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODED);
    }

   /**
    * Get Encoded Streamsize in bytes.
    * 
    * @return Encoded Streamsize in bytes.
    */
    @Nullable
    public final LocalTime getStreamSizeEncodedAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODED);
    }

   /**
    * Get Encoded Streamsize in bytes.
    * 
    * @return Encoded Streamsize in bytes.
    */
    @Nullable
    public final String getStreamSizeEncodedAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODED);
    }

   /**
    * Get Encoded Streamsize in bytes.
    * 
    * @return Encoded Streamsize in bytes.
    */
    @Nullable
    public final Boolean getStreamSizeEncodedAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODED);
    }

   /**
    * Get Encoded Streamsize in bytes.
    * 
    * @return Encoded Streamsize in bytes.
    */
    @Nullable
    public final BigInteger getStreamSizeEncodedAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODED);
    }

   /**
    * Get Encoded Streamsize in bytes.
    * 
    * @return Encoded Streamsize in bytes.
    */
    @Nullable
    public final URL getStreamSizeEncodedAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODED);
    }


   /**
    * Get Count of streams of that kind available.
    * 
    * @return Count of streams of that kind available.
    */
    @Nullable
    public final Integer getStreamCountAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMCOUNT);
    }

   /**
    * Get Count of streams of that kind available.
    * 
    * @return Count of streams of that kind available.
    */
    @Nullable
    public final Long getStreamCountAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.STREAMCOUNT);
    }

   /**
    * Get Count of streams of that kind available.
    * 
    * @return Count of streams of that kind available.
    */
    @Nullable
    public final LocalDateTime getStreamCountAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMCOUNT);
    }

   /**
    * Get Count of streams of that kind available.
    * 
    * @return Count of streams of that kind available.
    */
    @Nullable
    public final LocalTime getStreamCountAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMCOUNT);
    }

   /**
    * Get Count of streams of that kind available.
    * 
    * @return Count of streams of that kind available.
    */
    @Nullable
    public final String getStreamCountAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.STREAMCOUNT);
    }

   /**
    * Get Count of streams of that kind available.
    * 
    * @return Count of streams of that kind available.
    */
    @Nullable
    public final Boolean getStreamCountAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.STREAMCOUNT);
    }

   /**
    * Get Count of streams of that kind available.
    * 
    * @return Count of streams of that kind available.
    */
    @Nullable
    public final BigInteger getStreamCountAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMCOUNT);
    }

   /**
    * Get Count of streams of that kind available.
    * 
    * @return Count of streams of that kind available.
    */
    @Nullable
    public final URL getStreamCountAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.STREAMCOUNT);
    }


   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final Integer getStreamSizeEncodedStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING);
    }

   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final Long getStreamSizeEncodedStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING);
    }

   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final LocalDateTime getStreamSizeEncodedStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING);
    }

   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final LocalTime getStreamSizeEncodedStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING);
    }

   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final String getStreamSizeEncodedStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING);
    }

   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final Boolean getStreamSizeEncodedStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING);
    }

   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final BigInteger getStreamSizeEncodedStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING);
    }

   /**
    * Get Encoded Streamsize in with percentage value.
    * 
    * @return Encoded Streamsize in with percentage value.
    */
    @Nullable
    public final URL getStreamSizeEncodedStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEENCODEDSTRING);
    }


   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Integer getDurationString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING2);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Long getDurationString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING2);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalDateTime getDurationString2AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING2);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalTime getDurationString2AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING2);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final String getDurationString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING2);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Boolean getDurationString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING2);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final BigInteger getDurationString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING2);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final URL getDurationString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING2);
    }


   /**
    * Get Play time in format : HH:MM:SS.MMM.
    * 
    * @return Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Integer getDurationString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING3);
    }

   /**
    * Get Play time in format : HH:MM:SS.MMM.
    * 
    * @return Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Long getDurationString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING3);
    }

   /**
    * Get Play time in format : HH:MM:SS.MMM.
    * 
    * @return Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalDateTime getDurationString3AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING3);
    }

   /**
    * Get Play time in format : HH:MM:SS.MMM.
    * 
    * @return Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalTime getDurationString3AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING3);
    }

   /**
    * Get Play time in format : HH:MM:SS.MMM.
    * 
    * @return Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final String getDurationString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING3);
    }

   /**
    * Get Play time in format : HH:MM:SS.MMM.
    * 
    * @return Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Boolean getDurationString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING3);
    }

   /**
    * Get Play time in format : HH:MM:SS.MMM.
    * 
    * @return Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final BigInteger getDurationString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING3);
    }

   /**
    * Get Play time in format : HH:MM:SS.MMM.
    * 
    * @return Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final URL getDurationString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING3);
    }


   /**
    * Get Layout of channels (in the stream).
    * 
    * @return Layout of channels (in the stream).
    */
    @Nullable
    public final Integer getChannelLayoutAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.CHANNELLAYOUT);
    }

   /**
    * Get Layout of channels (in the stream).
    * 
    * @return Layout of channels (in the stream).
    */
    @Nullable
    public final Long getChannelLayoutAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.CHANNELLAYOUT);
    }

   /**
    * Get Layout of channels (in the stream).
    * 
    * @return Layout of channels (in the stream).
    */
    @Nullable
    public final LocalDateTime getChannelLayoutAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.CHANNELLAYOUT);
    }

   /**
    * Get Layout of channels (in the stream).
    * 
    * @return Layout of channels (in the stream).
    */
    @Nullable
    public final LocalTime getChannelLayoutAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.CHANNELLAYOUT);
    }

   /**
    * Get Layout of channels (in the stream).
    * 
    * @return Layout of channels (in the stream).
    */
    @Nullable
    public final String getChannelLayoutAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.CHANNELLAYOUT);
    }

   /**
    * Get Layout of channels (in the stream).
    * 
    * @return Layout of channels (in the stream).
    */
    @Nullable
    public final Boolean getChannelLayoutAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.CHANNELLAYOUT);
    }

   /**
    * Get Layout of channels (in the stream).
    * 
    * @return Layout of channels (in the stream).
    */
    @Nullable
    public final BigInteger getChannelLayoutAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.CHANNELLAYOUT);
    }

   /**
    * Get Layout of channels (in the stream).
    * 
    * @return Layout of channels (in the stream).
    */
    @Nullable
    public final URL getChannelLayoutAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.CHANNELLAYOUT);
    }


   /**
    * Get Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Integer getDurationString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING1);
    }

   /**
    * Get Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Long getDurationString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING1);
    }

   /**
    * Get Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final LocalDateTime getDurationString1AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING1);
    }

   /**
    * Get Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final LocalTime getDurationString1AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING1);
    }

   /**
    * Get Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final String getDurationString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING1);
    }

   /**
    * Get Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Boolean getDurationString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING1);
    }

   /**
    * Get Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final BigInteger getDurationString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING1);
    }

   /**
    * Get Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final URL getDurationString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING1);
    }


   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Integer getDurationString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Long getDurationString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalDateTime getDurationString4AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalTime getDurationString4AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final String getDurationString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Boolean getDurationString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final BigInteger getDurationString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final URL getDurationString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING4);
    }


   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Integer getDurationString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Long getDurationString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalDateTime getDurationString5AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalTime getDurationString5AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final String getDurationString5AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Boolean getDurationString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final BigInteger getDurationString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final URL getDurationString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DURATIONSTRING5);
    }


   /**
    * Get Encoded (with forced padding) bit rate in bps, if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate in bps, if some container padding is present.
    */
    @Nullable
    public final Integer getBitRateEncodedAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.BITRATEENCODED);
    }

   /**
    * Get Encoded (with forced padding) bit rate in bps, if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate in bps, if some container padding is present.
    */
    @Nullable
    public final Long getBitRateEncodedAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.BITRATEENCODED);
    }

   /**
    * Get Encoded (with forced padding) bit rate in bps, if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate in bps, if some container padding is present.
    */
    @Nullable
    public final LocalDateTime getBitRateEncodedAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.BITRATEENCODED);
    }

   /**
    * Get Encoded (with forced padding) bit rate in bps, if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate in bps, if some container padding is present.
    */
    @Nullable
    public final LocalTime getBitRateEncodedAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.BITRATEENCODED);
    }

   /**
    * Get Encoded (with forced padding) bit rate in bps, if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate in bps, if some container padding is present.
    */
    @Nullable
    public final String getBitRateEncodedAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.BITRATEENCODED);
    }

   /**
    * Get Encoded (with forced padding) bit rate in bps, if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate in bps, if some container padding is present.
    */
    @Nullable
    public final Boolean getBitRateEncodedAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.BITRATEENCODED);
    }

   /**
    * Get Encoded (with forced padding) bit rate in bps, if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate in bps, if some container padding is present.
    */
    @Nullable
    public final BigInteger getBitRateEncodedAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.BITRATEENCODED);
    }

   /**
    * Get Encoded (with forced padding) bit rate in bps, if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate in bps, if some container padding is present.
    */
    @Nullable
    public final URL getBitRateEncodedAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.BITRATEENCODED);
    }


   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final Integer getDelaySourceAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DELAYSOURCE);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final Long getDelaySourceAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DELAYSOURCE);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final LocalDateTime getDelaySourceAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DELAYSOURCE);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final LocalTime getDelaySourceAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DELAYSOURCE);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final String getDelaySourceAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DELAYSOURCE);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final Boolean getDelaySourceAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DELAYSOURCE);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final BigInteger getDelaySourceAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DELAYSOURCE);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final URL getDelaySourceAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DELAYSOURCE);
    }


   /**
    * Get Delay drop frame info.
    * 
    * @return Delay drop frame info.
    */
    @Nullable
    public final Integer getDelayOriginalDropFrameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALDROPFRAME);
    }

   /**
    * Get Delay drop frame info.
    * 
    * @return Delay drop frame info.
    */
    @Nullable
    public final Long getDelayOriginalDropFrameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALDROPFRAME);
    }

   /**
    * Get Delay drop frame info.
    * 
    * @return Delay drop frame info.
    */
    @Nullable
    public final LocalDateTime getDelayOriginalDropFrameAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALDROPFRAME);
    }

   /**
    * Get Delay drop frame info.
    * 
    * @return Delay drop frame info.
    */
    @Nullable
    public final LocalTime getDelayOriginalDropFrameAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALDROPFRAME);
    }

   /**
    * Get Delay drop frame info.
    * 
    * @return Delay drop frame info.
    */
    @Nullable
    public final String getDelayOriginalDropFrameAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALDROPFRAME);
    }

   /**
    * Get Delay drop frame info.
    * 
    * @return Delay drop frame info.
    */
    @Nullable
    public final Boolean getDelayOriginalDropFrameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALDROPFRAME);
    }

   /**
    * Get Delay drop frame info.
    * 
    * @return Delay drop frame info.
    */
    @Nullable
    public final BigInteger getDelayOriginalDropFrameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALDROPFRAME);
    }

   /**
    * Get Delay drop frame info.
    * 
    * @return Delay drop frame info.
    */
    @Nullable
    public final URL getDelayOriginalDropFrameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALDROPFRAME);
    }


   /**
    * Get Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Integer getDurationLastFrameString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING1);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Long getDurationLastFrameString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING1);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final LocalDateTime getDurationLastFrameString1AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING1);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final LocalTime getDurationLastFrameString1AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING1);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final String getDurationLastFrameString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING1);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Boolean getDurationLastFrameString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING1);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final BigInteger getDurationLastFrameString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING1);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final URL getDurationLastFrameString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING1);
    }


   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Integer getDelayOriginalStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Long getDelayOriginalStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final LocalDateTime getDelayOriginalStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final LocalTime getDelayOriginalStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final String getDelayOriginalStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Boolean getDelayOriginalStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final BigInteger getDelayOriginalStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final URL getDelayOriginalStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DELAYORIGINALSTRING);
    }


   /**
    * Get Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Integer getDurationLastFrameString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING3);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Long getDurationLastFrameString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING3);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalDateTime getDurationLastFrameString3AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING3);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalTime getDurationLastFrameString3AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING3);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final String getDurationLastFrameString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING3);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Boolean getDurationLastFrameString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING3);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final BigInteger getDurationLastFrameString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING3);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    * 
    * @return Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final URL getDurationLastFrameString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING3);
    }


   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Integer getDurationLastFrameString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING2);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Long getDurationLastFrameString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING2);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalDateTime getDurationLastFrameString2AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING2);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalTime getDurationLastFrameString2AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING2);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final String getDurationLastFrameString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING2);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Boolean getDurationLastFrameString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING2);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final BigInteger getDurationLastFrameString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING2);
    }

   /**
    * Get Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final URL getDurationLastFrameString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DURATIONLASTFRAMESTRING2);
    }


   /**
    * Get StreamSize in bytes of hte stream after demux.
    * 
    * @return StreamSize in bytes of hte stream after demux.
    */
    @Nullable
    public final Integer getStreamSizeDemuxedAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXED);
    }

   /**
    * Get StreamSize in bytes of hte stream after demux.
    * 
    * @return StreamSize in bytes of hte stream after demux.
    */
    @Nullable
    public final Long getStreamSizeDemuxedAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXED);
    }

   /**
    * Get StreamSize in bytes of hte stream after demux.
    * 
    * @return StreamSize in bytes of hte stream after demux.
    */
    @Nullable
    public final LocalDateTime getStreamSizeDemuxedAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXED);
    }

   /**
    * Get StreamSize in bytes of hte stream after demux.
    * 
    * @return StreamSize in bytes of hte stream after demux.
    */
    @Nullable
    public final LocalTime getStreamSizeDemuxedAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXED);
    }

   /**
    * Get StreamSize in bytes of hte stream after demux.
    * 
    * @return StreamSize in bytes of hte stream after demux.
    */
    @Nullable
    public final String getStreamSizeDemuxedAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXED);
    }

   /**
    * Get StreamSize in bytes of hte stream after demux.
    * 
    * @return StreamSize in bytes of hte stream after demux.
    */
    @Nullable
    public final Boolean getStreamSizeDemuxedAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXED);
    }

   /**
    * Get StreamSize in bytes of hte stream after demux.
    * 
    * @return StreamSize in bytes of hte stream after demux.
    */
    @Nullable
    public final BigInteger getStreamSizeDemuxedAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXED);
    }

   /**
    * Get StreamSize in bytes of hte stream after demux.
    * 
    * @return StreamSize in bytes of hte stream after demux.
    */
    @Nullable
    public final URL getStreamSizeDemuxedAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.STREAMSIZEDEMUXED);
    }


   /**
    * Get Settings needed for decoder used, summary.
    * 
    * @return Settings needed for decoder used, summary.
    */
    @Nullable
    public final Integer getFormatSettingsAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGS);
    }

   /**
    * Get Settings needed for decoder used, summary.
    * 
    * @return Settings needed for decoder used, summary.
    */
    @Nullable
    public final Long getFormatSettingsAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGS);
    }

   /**
    * Get Settings needed for decoder used, summary.
    * 
    * @return Settings needed for decoder used, summary.
    */
    @Nullable
    public final LocalDateTime getFormatSettingsAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGS);
    }

   /**
    * Get Settings needed for decoder used, summary.
    * 
    * @return Settings needed for decoder used, summary.
    */
    @Nullable
    public final LocalTime getFormatSettingsAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGS);
    }

   /**
    * Get Settings needed for decoder used, summary.
    * 
    * @return Settings needed for decoder used, summary.
    */
    @Nullable
    public final String getFormatSettingsAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGS);
    }

   /**
    * Get Settings needed for decoder used, summary.
    * 
    * @return Settings needed for decoder used, summary.
    */
    @Nullable
    public final Boolean getFormatSettingsAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGS);
    }

   /**
    * Get Settings needed for decoder used, summary.
    * 
    * @return Settings needed for decoder used, summary.
    */
    @Nullable
    public final BigInteger getFormatSettingsAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGS);
    }

   /**
    * Get Settings needed for decoder used, summary.
    * 
    * @return Settings needed for decoder used, summary.
    */
    @Nullable
    public final URL getFormatSettingsAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGS);
    }


   /**
    * Get Service kind, e.g. visually impaired, commentary, voice over.
    * 
    * @return Service kind, e.g. visually impaired, commentary, voice over.
    */
    @Nullable
    public final Integer getServiceKindAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SERVICEKIND);
    }

   /**
    * Get Service kind, e.g. visually impaired, commentary, voice over.
    * 
    * @return Service kind, e.g. visually impaired, commentary, voice over.
    */
    @Nullable
    public final Long getServiceKindAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SERVICEKIND);
    }

   /**
    * Get Service kind, e.g. visually impaired, commentary, voice over.
    * 
    * @return Service kind, e.g. visually impaired, commentary, voice over.
    */
    @Nullable
    public final LocalDateTime getServiceKindAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SERVICEKIND);
    }

   /**
    * Get Service kind, e.g. visually impaired, commentary, voice over.
    * 
    * @return Service kind, e.g. visually impaired, commentary, voice over.
    */
    @Nullable
    public final LocalTime getServiceKindAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SERVICEKIND);
    }

   /**
    * Get Service kind, e.g. visually impaired, commentary, voice over.
    * 
    * @return Service kind, e.g. visually impaired, commentary, voice over.
    */
    @Nullable
    public final String getServiceKindAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SERVICEKIND);
    }

   /**
    * Get Service kind, e.g. visually impaired, commentary, voice over.
    * 
    * @return Service kind, e.g. visually impaired, commentary, voice over.
    */
    @Nullable
    public final Boolean getServiceKindAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SERVICEKIND);
    }

   /**
    * Get Service kind, e.g. visually impaired, commentary, voice over.
    * 
    * @return Service kind, e.g. visually impaired, commentary, voice over.
    */
    @Nullable
    public final BigInteger getServiceKindAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SERVICEKIND);
    }

   /**
    * Get Service kind, e.g. visually impaired, commentary, voice over.
    * 
    * @return Service kind, e.g. visually impaired, commentary, voice over.
    */
    @Nullable
    public final URL getServiceKindAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SERVICEKIND);
    }


   /**
    * Get Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    * 
    * @return Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final Integer getFirstPacketOrderAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.FIRSTPACKETORDER);
    }

   /**
    * Get Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    * 
    * @return Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final Long getFirstPacketOrderAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.FIRSTPACKETORDER);
    }

   /**
    * Get Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    * 
    * @return Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final LocalDateTime getFirstPacketOrderAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.FIRSTPACKETORDER);
    }

   /**
    * Get Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    * 
    * @return Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final LocalTime getFirstPacketOrderAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.FIRSTPACKETORDER);
    }

   /**
    * Get Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    * 
    * @return Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final String getFirstPacketOrderAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.FIRSTPACKETORDER);
    }

   /**
    * Get Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    * 
    * @return Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final Boolean getFirstPacketOrderAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.FIRSTPACKETORDER);
    }

   /**
    * Get Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    * 
    * @return Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final BigInteger getFirstPacketOrderAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.FIRSTPACKETORDER);
    }

   /**
    * Get Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    * 
    * @return Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final URL getFirstPacketOrderAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.FIRSTPACKETORDER);
    }


   /**
    * Get Number of channels.
    * 
    * @return Number of channels.
    */
    @Nullable
    public final Integer getChannelsAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.CHANNELS);
    }

   /**
    * Get Number of channels.
    * 
    * @return Number of channels.
    */
    @Nullable
    public final Long getChannelsAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.CHANNELS);
    }

   /**
    * Get Number of channels.
    * 
    * @return Number of channels.
    */
    @Nullable
    public final LocalDateTime getChannelsAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.CHANNELS);
    }

   /**
    * Get Number of channels.
    * 
    * @return Number of channels.
    */
    @Nullable
    public final LocalTime getChannelsAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.CHANNELS);
    }

   /**
    * Get Number of channels.
    * 
    * @return Number of channels.
    */
    @Nullable
    public final String getChannelsAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.CHANNELS);
    }

   /**
    * Get Number of channels.
    * 
    * @return Number of channels.
    */
    @Nullable
    public final Boolean getChannelsAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.CHANNELS);
    }

   /**
    * Get Number of channels.
    * 
    * @return Number of channels.
    */
    @Nullable
    public final BigInteger getChannelsAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.CHANNELS);
    }

   /**
    * Get Number of channels.
    * 
    * @return Number of channels.
    */
    @Nullable
    public final URL getChannelsAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.CHANNELS);
    }


   /**
    * Get Format_Settings_Endianness.
    * 
    * @return Format_Settings_Endianness.
    */
    @Nullable
    public final Integer getFormatSettingsEndiannessAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSENDIANNESS);
    }

   /**
    * Get Format_Settings_Endianness.
    * 
    * @return Format_Settings_Endianness.
    */
    @Nullable
    public final Long getFormatSettingsEndiannessAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSENDIANNESS);
    }

   /**
    * Get Format_Settings_Endianness.
    * 
    * @return Format_Settings_Endianness.
    */
    @Nullable
    public final LocalDateTime getFormatSettingsEndiannessAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSENDIANNESS);
    }

   /**
    * Get Format_Settings_Endianness.
    * 
    * @return Format_Settings_Endianness.
    */
    @Nullable
    public final LocalTime getFormatSettingsEndiannessAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSENDIANNESS);
    }

   /**
    * Get Format_Settings_Endianness.
    * 
    * @return Format_Settings_Endianness.
    */
    @Nullable
    public final String getFormatSettingsEndiannessAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSENDIANNESS);
    }

   /**
    * Get Format_Settings_Endianness.
    * 
    * @return Format_Settings_Endianness.
    */
    @Nullable
    public final Boolean getFormatSettingsEndiannessAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSENDIANNESS);
    }

   /**
    * Get Format_Settings_Endianness.
    * 
    * @return Format_Settings_Endianness.
    */
    @Nullable
    public final BigInteger getFormatSettingsEndiannessAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSENDIANNESS);
    }

   /**
    * Get Format_Settings_Endianness.
    * 
    * @return Format_Settings_Endianness.
    */
    @Nullable
    public final URL getFormatSettingsEndiannessAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSENDIANNESS);
    }


   /**
    * Get Video_Delay/String5.
    * 
    * @return Video_Delay/String5.
    */
    @Nullable
    public final Integer getVideoDelayString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING5);
    }

   /**
    * Get Video_Delay/String5.
    * 
    * @return Video_Delay/String5.
    */
    @Nullable
    public final Long getVideoDelayString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING5);
    }

   /**
    * Get Video_Delay/String5.
    * 
    * @return Video_Delay/String5.
    */
    @Nullable
    public final LocalDateTime getVideoDelayString5AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING5);
    }

   /**
    * Get Video_Delay/String5.
    * 
    * @return Video_Delay/String5.
    */
    @Nullable
    public final LocalTime getVideoDelayString5AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING5);
    }

   /**
    * Get Video_Delay/String5.
    * 
    * @return Video_Delay/String5.
    */
    @Nullable
    public final String getVideoDelayString5AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING5);
    }

   /**
    * Get Video_Delay/String5.
    * 
    * @return Video_Delay/String5.
    */
    @Nullable
    public final Boolean getVideoDelayString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING5);
    }

   /**
    * Get Video_Delay/String5.
    * 
    * @return Video_Delay/String5.
    */
    @Nullable
    public final BigInteger getVideoDelayString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING5);
    }

   /**
    * Get Video_Delay/String5.
    * 
    * @return Video_Delay/String5.
    */
    @Nullable
    public final URL getVideoDelayString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING5);
    }


   /**
    * Get Video_Delay/String1.
    * 
    * @return Video_Delay/String1.
    */
    @Nullable
    public final Integer getVideoDelayString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING1);
    }

   /**
    * Get Video_Delay/String1.
    * 
    * @return Video_Delay/String1.
    */
    @Nullable
    public final Long getVideoDelayString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING1);
    }

   /**
    * Get Video_Delay/String1.
    * 
    * @return Video_Delay/String1.
    */
    @Nullable
    public final LocalDateTime getVideoDelayString1AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING1);
    }

   /**
    * Get Video_Delay/String1.
    * 
    * @return Video_Delay/String1.
    */
    @Nullable
    public final LocalTime getVideoDelayString1AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING1);
    }

   /**
    * Get Video_Delay/String1.
    * 
    * @return Video_Delay/String1.
    */
    @Nullable
    public final String getVideoDelayString1AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING1);
    }

   /**
    * Get Video_Delay/String1.
    * 
    * @return Video_Delay/String1.
    */
    @Nullable
    public final Boolean getVideoDelayString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING1);
    }

   /**
    * Get Video_Delay/String1.
    * 
    * @return Video_Delay/String1.
    */
    @Nullable
    public final BigInteger getVideoDelayString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING1);
    }

   /**
    * Get Video_Delay/String1.
    * 
    * @return Video_Delay/String1.
    */
    @Nullable
    public final URL getVideoDelayString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING1);
    }


   /**
    * Get Video_Delay/String2.
    * 
    * @return Video_Delay/String2.
    */
    @Nullable
    public final Integer getVideoDelayString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING2);
    }

   /**
    * Get Video_Delay/String2.
    * 
    * @return Video_Delay/String2.
    */
    @Nullable
    public final Long getVideoDelayString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING2);
    }

   /**
    * Get Video_Delay/String2.
    * 
    * @return Video_Delay/String2.
    */
    @Nullable
    public final LocalDateTime getVideoDelayString2AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING2);
    }

   /**
    * Get Video_Delay/String2.
    * 
    * @return Video_Delay/String2.
    */
    @Nullable
    public final LocalTime getVideoDelayString2AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING2);
    }

   /**
    * Get Video_Delay/String2.
    * 
    * @return Video_Delay/String2.
    */
    @Nullable
    public final String getVideoDelayString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING2);
    }

   /**
    * Get Video_Delay/String2.
    * 
    * @return Video_Delay/String2.
    */
    @Nullable
    public final Boolean getVideoDelayString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING2);
    }

   /**
    * Get Video_Delay/String2.
    * 
    * @return Video_Delay/String2.
    */
    @Nullable
    public final BigInteger getVideoDelayString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING2);
    }

   /**
    * Get Video_Delay/String2.
    * 
    * @return Video_Delay/String2.
    */
    @Nullable
    public final URL getVideoDelayString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING2);
    }


   /**
    * Get Video_Delay/String3.
    * 
    * @return Video_Delay/String3.
    */
    @Nullable
    public final Integer getVideoDelayString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING3);
    }

   /**
    * Get Video_Delay/String3.
    * 
    * @return Video_Delay/String3.
    */
    @Nullable
    public final Long getVideoDelayString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING3);
    }

   /**
    * Get Video_Delay/String3.
    * 
    * @return Video_Delay/String3.
    */
    @Nullable
    public final LocalDateTime getVideoDelayString3AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING3);
    }

   /**
    * Get Video_Delay/String3.
    * 
    * @return Video_Delay/String3.
    */
    @Nullable
    public final LocalTime getVideoDelayString3AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING3);
    }

   /**
    * Get Video_Delay/String3.
    * 
    * @return Video_Delay/String3.
    */
    @Nullable
    public final String getVideoDelayString3AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING3);
    }

   /**
    * Get Video_Delay/String3.
    * 
    * @return Video_Delay/String3.
    */
    @Nullable
    public final Boolean getVideoDelayString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING3);
    }

   /**
    * Get Video_Delay/String3.
    * 
    * @return Video_Delay/String3.
    */
    @Nullable
    public final BigInteger getVideoDelayString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING3);
    }

   /**
    * Get Video_Delay/String3.
    * 
    * @return Video_Delay/String3.
    */
    @Nullable
    public final URL getVideoDelayString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING3);
    }


   /**
    * Get Video_Delay/String4.
    * 
    * @return Video_Delay/String4.
    */
    @Nullable
    public final Integer getVideoDelayString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING4);
    }

   /**
    * Get Video_Delay/String4.
    * 
    * @return Video_Delay/String4.
    */
    @Nullable
    public final Long getVideoDelayString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING4);
    }

   /**
    * Get Video_Delay/String4.
    * 
    * @return Video_Delay/String4.
    */
    @Nullable
    public final LocalDateTime getVideoDelayString4AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING4);
    }

   /**
    * Get Video_Delay/String4.
    * 
    * @return Video_Delay/String4.
    */
    @Nullable
    public final LocalTime getVideoDelayString4AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING4);
    }

   /**
    * Get Video_Delay/String4.
    * 
    * @return Video_Delay/String4.
    */
    @Nullable
    public final String getVideoDelayString4AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING4);
    }

   /**
    * Get Video_Delay/String4.
    * 
    * @return Video_Delay/String4.
    */
    @Nullable
    public final Boolean getVideoDelayString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING4);
    }

   /**
    * Get Video_Delay/String4.
    * 
    * @return Video_Delay/String4.
    */
    @Nullable
    public final BigInteger getVideoDelayString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING4);
    }

   /**
    * Get Video_Delay/String4.
    * 
    * @return Video_Delay/String4.
    */
    @Nullable
    public final URL getVideoDelayString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.VIDEODELAYSTRING4);
    }


   /**
    * Get Nominal Bit rate (with measurement).
    * 
    * @return Nominal Bit rate (with measurement).
    */
    @Nullable
    public final Integer getBitRateNominalStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.BITRATENOMINALSTRING);
    }

   /**
    * Get Nominal Bit rate (with measurement).
    * 
    * @return Nominal Bit rate (with measurement).
    */
    @Nullable
    public final Long getBitRateNominalStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.BITRATENOMINALSTRING);
    }

   /**
    * Get Nominal Bit rate (with measurement).
    * 
    * @return Nominal Bit rate (with measurement).
    */
    @Nullable
    public final LocalDateTime getBitRateNominalStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.BITRATENOMINALSTRING);
    }

   /**
    * Get Nominal Bit rate (with measurement).
    * 
    * @return Nominal Bit rate (with measurement).
    */
    @Nullable
    public final LocalTime getBitRateNominalStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.BITRATENOMINALSTRING);
    }

   /**
    * Get Nominal Bit rate (with measurement).
    * 
    * @return Nominal Bit rate (with measurement).
    */
    @Nullable
    public final String getBitRateNominalStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.BITRATENOMINALSTRING);
    }

   /**
    * Get Nominal Bit rate (with measurement).
    * 
    * @return Nominal Bit rate (with measurement).
    */
    @Nullable
    public final Boolean getBitRateNominalStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.BITRATENOMINALSTRING);
    }

   /**
    * Get Nominal Bit rate (with measurement).
    * 
    * @return Nominal Bit rate (with measurement).
    */
    @Nullable
    public final BigInteger getBitRateNominalStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.BITRATENOMINALSTRING);
    }

   /**
    * Get Nominal Bit rate (with measurement).
    * 
    * @return Nominal Bit rate (with measurement).
    */
    @Nullable
    public final URL getBitRateNominalStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.BITRATENOMINALSTRING);
    }


   /**
    * Get Detected (during scan of the input by the muxer) resolution in bits.
    * 
    * @return Detected (during scan of the input by the muxer) resolution in bits.
    */
    @Nullable
    public final Integer getBitDepthDetectedStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTHDETECTEDSTRING);
    }

   /**
    * Get Detected (during scan of the input by the muxer) resolution in bits.
    * 
    * @return Detected (during scan of the input by the muxer) resolution in bits.
    */
    @Nullable
    public final Long getBitDepthDetectedStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTHDETECTEDSTRING);
    }

   /**
    * Get Detected (during scan of the input by the muxer) resolution in bits.
    * 
    * @return Detected (during scan of the input by the muxer) resolution in bits.
    */
    @Nullable
    public final LocalDateTime getBitDepthDetectedStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTHDETECTEDSTRING);
    }

   /**
    * Get Detected (during scan of the input by the muxer) resolution in bits.
    * 
    * @return Detected (during scan of the input by the muxer) resolution in bits.
    */
    @Nullable
    public final LocalTime getBitDepthDetectedStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTHDETECTEDSTRING);
    }

   /**
    * Get Detected (during scan of the input by the muxer) resolution in bits.
    * 
    * @return Detected (during scan of the input by the muxer) resolution in bits.
    */
    @Nullable
    public final String getBitDepthDetectedStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTHDETECTEDSTRING);
    }

   /**
    * Get Detected (during scan of the input by the muxer) resolution in bits.
    * 
    * @return Detected (during scan of the input by the muxer) resolution in bits.
    */
    @Nullable
    public final Boolean getBitDepthDetectedStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTHDETECTEDSTRING);
    }

   /**
    * Get Detected (during scan of the input by the muxer) resolution in bits.
    * 
    * @return Detected (during scan of the input by the muxer) resolution in bits.
    */
    @Nullable
    public final BigInteger getBitDepthDetectedStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTHDETECTEDSTRING);
    }

   /**
    * Get Detected (during scan of the input by the muxer) resolution in bits.
    * 
    * @return Detected (during scan of the input by the muxer) resolution in bits.
    */
    @Nullable
    public final URL getBitDepthDetectedStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTHDETECTEDSTRING);
    }


   /**
    * Get Format used.
    * 
    * @return Format used.
    */
    @Nullable
    public final Integer getFormatAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMAT);
    }

   /**
    * Get Format used.
    * 
    * @return Format used.
    */
    @Nullable
    public final Long getFormatAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.FORMAT);
    }

   /**
    * Get Format used.
    * 
    * @return Format used.
    */
    @Nullable
    public final LocalDateTime getFormatAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.FORMAT);
    }

   /**
    * Get Format used.
    * 
    * @return Format used.
    */
    @Nullable
    public final LocalTime getFormatAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.FORMAT);
    }

   /**
    * Get Format used.
    * 
    * @return Format used.
    */
    @Nullable
    public final String getFormatAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.FORMAT);
    }

   /**
    * Get Format used.
    * 
    * @return Format used.
    */
    @Nullable
    public final Boolean getFormatAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.FORMAT);
    }

   /**
    * Get Format used.
    * 
    * @return Format used.
    */
    @Nullable
    public final BigInteger getFormatAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMAT);
    }

   /**
    * Get Format used.
    * 
    * @return Format used.
    */
    @Nullable
    public final URL getFormatAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.FORMAT);
    }


   /**
    * Get Stored Resolution in bits (8, 16, 20, 24).
    * 
    * @return Stored Resolution in bits (8, 16, 20, 24).
    */
    @Nullable
    public final Integer getBitDepthStoredAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTHSTORED);
    }

   /**
    * Get Stored Resolution in bits (8, 16, 20, 24).
    * 
    * @return Stored Resolution in bits (8, 16, 20, 24).
    */
    @Nullable
    public final Long getBitDepthStoredAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTHSTORED);
    }

   /**
    * Get Stored Resolution in bits (8, 16, 20, 24).
    * 
    * @return Stored Resolution in bits (8, 16, 20, 24).
    */
    @Nullable
    public final LocalDateTime getBitDepthStoredAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTHSTORED);
    }

   /**
    * Get Stored Resolution in bits (8, 16, 20, 24).
    * 
    * @return Stored Resolution in bits (8, 16, 20, 24).
    */
    @Nullable
    public final LocalTime getBitDepthStoredAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTHSTORED);
    }

   /**
    * Get Stored Resolution in bits (8, 16, 20, 24).
    * 
    * @return Stored Resolution in bits (8, 16, 20, 24).
    */
    @Nullable
    public final String getBitDepthStoredAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTHSTORED);
    }

   /**
    * Get Stored Resolution in bits (8, 16, 20, 24).
    * 
    * @return Stored Resolution in bits (8, 16, 20, 24).
    */
    @Nullable
    public final Boolean getBitDepthStoredAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTHSTORED);
    }

   /**
    * Get Stored Resolution in bits (8, 16, 20, 24).
    * 
    * @return Stored Resolution in bits (8, 16, 20, 24).
    */
    @Nullable
    public final BigInteger getBitDepthStoredAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTHSTORED);
    }

   /**
    * Get Stored Resolution in bits (8, 16, 20, 24).
    * 
    * @return Stored Resolution in bits (8, 16, 20, 24).
    */
    @Nullable
    public final URL getBitDepthStoredAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTHSTORED);
    }


   /**
    * Get Stored Resolution in bits (8, 16, 20, 24).
    * 
    * @return Stored Resolution in bits (8, 16, 20, 24).
    */
    @Nullable
    public final Integer getBitDepthStoredStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTHSTOREDSTRING);
    }

   /**
    * Get Stored Resolution in bits (8, 16, 20, 24).
    * 
    * @return Stored Resolution in bits (8, 16, 20, 24).
    */
    @Nullable
    public final Long getBitDepthStoredStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTHSTOREDSTRING);
    }

   /**
    * Get Stored Resolution in bits (8, 16, 20, 24).
    * 
    * @return Stored Resolution in bits (8, 16, 20, 24).
    */
    @Nullable
    public final LocalDateTime getBitDepthStoredStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTHSTOREDSTRING);
    }

   /**
    * Get Stored Resolution in bits (8, 16, 20, 24).
    * 
    * @return Stored Resolution in bits (8, 16, 20, 24).
    */
    @Nullable
    public final LocalTime getBitDepthStoredStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTHSTOREDSTRING);
    }

   /**
    * Get Stored Resolution in bits (8, 16, 20, 24).
    * 
    * @return Stored Resolution in bits (8, 16, 20, 24).
    */
    @Nullable
    public final String getBitDepthStoredStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTHSTOREDSTRING);
    }

   /**
    * Get Stored Resolution in bits (8, 16, 20, 24).
    * 
    * @return Stored Resolution in bits (8, 16, 20, 24).
    */
    @Nullable
    public final Boolean getBitDepthStoredStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTHSTOREDSTRING);
    }

   /**
    * Get Stored Resolution in bits (8, 16, 20, 24).
    * 
    * @return Stored Resolution in bits (8, 16, 20, 24).
    */
    @Nullable
    public final BigInteger getBitDepthStoredStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTHSTOREDSTRING);
    }

   /**
    * Get Stored Resolution in bits (8, 16, 20, 24).
    * 
    * @return Stored Resolution in bits (8, 16, 20, 24).
    */
    @Nullable
    public final URL getBitDepthStoredStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.BITDEPTHSTOREDSTRING);
    }


   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final Integer getCodecIDStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.CODECIDSTRING);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final Long getCodecIDStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.CODECIDSTRING);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final LocalDateTime getCodecIDStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.CODECIDSTRING);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final LocalTime getCodecIDStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.CODECIDSTRING);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final String getCodecIDStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.CODECIDSTRING);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final Boolean getCodecIDStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.CODECIDSTRING);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final BigInteger getCodecIDStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.CODECIDSTRING);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final URL getCodecIDStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.CODECIDSTRING);
    }


   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final Integer getEncodedLibraryCompanyNameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final Long getEncodedLibraryCompanyNameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final LocalDateTime getEncodedLibraryCompanyNameAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final LocalTime getEncodedLibraryCompanyNameAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final String getEncodedLibraryCompanyNameAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final Boolean getEncodedLibraryCompanyNameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final BigInteger getEncodedLibraryCompanyNameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final URL getEncodedLibraryCompanyNameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDLIBRARYCOMPANYNAME);
    }


   /**
    * Get Source Streamsize in bytes.
    * 
    * @return Source Streamsize in bytes.
    */
    @Nullable
    public final Integer getSourceStreamSizeAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZE);
    }

   /**
    * Get Source Streamsize in bytes.
    * 
    * @return Source Streamsize in bytes.
    */
    @Nullable
    public final Long getSourceStreamSizeAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZE);
    }

   /**
    * Get Source Streamsize in bytes.
    * 
    * @return Source Streamsize in bytes.
    */
    @Nullable
    public final LocalDateTime getSourceStreamSizeAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZE);
    }

   /**
    * Get Source Streamsize in bytes.
    * 
    * @return Source Streamsize in bytes.
    */
    @Nullable
    public final LocalTime getSourceStreamSizeAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZE);
    }

   /**
    * Get Source Streamsize in bytes.
    * 
    * @return Source Streamsize in bytes.
    */
    @Nullable
    public final String getSourceStreamSizeAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZE);
    }

   /**
    * Get Source Streamsize in bytes.
    * 
    * @return Source Streamsize in bytes.
    */
    @Nullable
    public final Boolean getSourceStreamSizeAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZE);
    }

   /**
    * Get Source Streamsize in bytes.
    * 
    * @return Source Streamsize in bytes.
    */
    @Nullable
    public final BigInteger getSourceStreamSizeAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZE);
    }

   /**
    * Get Source Streamsize in bytes.
    * 
    * @return Source Streamsize in bytes.
    */
    @Nullable
    public final URL getSourceStreamSizeAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SOURCESTREAMSIZE);
    }


   /**
    * Get Commercial name used by vendor for theses setings or Format field if there is no difference.
    * 
    * @return Commercial name used by vendor for theses setings or Format field if there is no difference.
    */
    @Nullable
    public final Integer getFormatCommercialAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATCOMMERCIAL);
    }

   /**
    * Get Commercial name used by vendor for theses setings or Format field if there is no difference.
    * 
    * @return Commercial name used by vendor for theses setings or Format field if there is no difference.
    */
    @Nullable
    public final Long getFormatCommercialAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.FORMATCOMMERCIAL);
    }

   /**
    * Get Commercial name used by vendor for theses setings or Format field if there is no difference.
    * 
    * @return Commercial name used by vendor for theses setings or Format field if there is no difference.
    */
    @Nullable
    public final LocalDateTime getFormatCommercialAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATCOMMERCIAL);
    }

   /**
    * Get Commercial name used by vendor for theses setings or Format field if there is no difference.
    * 
    * @return Commercial name used by vendor for theses setings or Format field if there is no difference.
    */
    @Nullable
    public final LocalTime getFormatCommercialAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATCOMMERCIAL);
    }

   /**
    * Get Commercial name used by vendor for theses setings or Format field if there is no difference.
    * 
    * @return Commercial name used by vendor for theses setings or Format field if there is no difference.
    */
    @Nullable
    public final String getFormatCommercialAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.FORMATCOMMERCIAL);
    }

   /**
    * Get Commercial name used by vendor for theses setings or Format field if there is no difference.
    * 
    * @return Commercial name used by vendor for theses setings or Format field if there is no difference.
    */
    @Nullable
    public final Boolean getFormatCommercialAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.FORMATCOMMERCIAL);
    }

   /**
    * Get Commercial name used by vendor for theses setings or Format field if there is no difference.
    * 
    * @return Commercial name used by vendor for theses setings or Format field if there is no difference.
    */
    @Nullable
    public final BigInteger getFormatCommercialAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATCOMMERCIAL);
    }

   /**
    * Get Commercial name used by vendor for theses setings or Format field if there is no difference.
    * 
    * @return Commercial name used by vendor for theses setings or Format field if there is no difference.
    */
    @Nullable
    public final URL getFormatCommercialAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.FORMATCOMMERCIAL);
    }


   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final Integer getDelaySourceStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.DELAYSOURCESTRING);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final Long getDelaySourceStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.DELAYSOURCESTRING);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final LocalDateTime getDelaySourceStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.DELAYSOURCESTRING);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final LocalTime getDelaySourceStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.DELAYSOURCESTRING);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final String getDelaySourceStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.DELAYSOURCESTRING);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final Boolean getDelaySourceStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.DELAYSOURCESTRING);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final BigInteger getDelaySourceStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.DELAYSOURCESTRING);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final URL getDelaySourceStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.DELAYSOURCESTRING);
    }


   /**
    * Get Nominal Bit rate in bps.
    * 
    * @return Nominal Bit rate in bps.
    */
    @Nullable
    public final Integer getBitRateNominalAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.BITRATENOMINAL);
    }

   /**
    * Get Nominal Bit rate in bps.
    * 
    * @return Nominal Bit rate in bps.
    */
    @Nullable
    public final Long getBitRateNominalAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.BITRATENOMINAL);
    }

   /**
    * Get Nominal Bit rate in bps.
    * 
    * @return Nominal Bit rate in bps.
    */
    @Nullable
    public final LocalDateTime getBitRateNominalAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.BITRATENOMINAL);
    }

   /**
    * Get Nominal Bit rate in bps.
    * 
    * @return Nominal Bit rate in bps.
    */
    @Nullable
    public final LocalTime getBitRateNominalAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.BITRATENOMINAL);
    }

   /**
    * Get Nominal Bit rate in bps.
    * 
    * @return Nominal Bit rate in bps.
    */
    @Nullable
    public final String getBitRateNominalAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.BITRATENOMINAL);
    }

   /**
    * Get Nominal Bit rate in bps.
    * 
    * @return Nominal Bit rate in bps.
    */
    @Nullable
    public final Boolean getBitRateNominalAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.BITRATENOMINAL);
    }

   /**
    * Get Nominal Bit rate in bps.
    * 
    * @return Nominal Bit rate in bps.
    */
    @Nullable
    public final BigInteger getBitRateNominalAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.BITRATENOMINAL);
    }

   /**
    * Get Nominal Bit rate in bps.
    * 
    * @return Nominal Bit rate in bps.
    */
    @Nullable
    public final URL getBitRateNominalAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.BITRATENOMINAL);
    }


   /**
    * Get Minimum Bit rate in bps.
    * 
    * @return Minimum Bit rate in bps.
    */
    @Nullable
    public final Integer getBitRateMinimumAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMINIMUM);
    }

   /**
    * Get Minimum Bit rate in bps.
    * 
    * @return Minimum Bit rate in bps.
    */
    @Nullable
    public final Long getBitRateMinimumAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMINIMUM);
    }

   /**
    * Get Minimum Bit rate in bps.
    * 
    * @return Minimum Bit rate in bps.
    */
    @Nullable
    public final LocalDateTime getBitRateMinimumAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMINIMUM);
    }

   /**
    * Get Minimum Bit rate in bps.
    * 
    * @return Minimum Bit rate in bps.
    */
    @Nullable
    public final LocalTime getBitRateMinimumAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMINIMUM);
    }

   /**
    * Get Minimum Bit rate in bps.
    * 
    * @return Minimum Bit rate in bps.
    */
    @Nullable
    public final String getBitRateMinimumAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMINIMUM);
    }

   /**
    * Get Minimum Bit rate in bps.
    * 
    * @return Minimum Bit rate in bps.
    */
    @Nullable
    public final Boolean getBitRateMinimumAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMINIMUM);
    }

   /**
    * Get Minimum Bit rate in bps.
    * 
    * @return Minimum Bit rate in bps.
    */
    @Nullable
    public final BigInteger getBitRateMinimumAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMINIMUM);
    }

   /**
    * Get Minimum Bit rate in bps.
    * 
    * @return Minimum Bit rate in bps.
    */
    @Nullable
    public final URL getBitRateMinimumAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.BITRATEMINIMUM);
    }


   /**
    * Get Format_Settings_SBR/String.
    * 
    * @return Format_Settings_SBR/String.
    */
    @Nullable
    public final Integer getFormatSettingsSBRStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSSBRSTRING);
    }

   /**
    * Get Format_Settings_SBR/String.
    * 
    * @return Format_Settings_SBR/String.
    */
    @Nullable
    public final Long getFormatSettingsSBRStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSSBRSTRING);
    }

   /**
    * Get Format_Settings_SBR/String.
    * 
    * @return Format_Settings_SBR/String.
    */
    @Nullable
    public final LocalDateTime getFormatSettingsSBRStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSSBRSTRING);
    }

   /**
    * Get Format_Settings_SBR/String.
    * 
    * @return Format_Settings_SBR/String.
    */
    @Nullable
    public final LocalTime getFormatSettingsSBRStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSSBRSTRING);
    }

   /**
    * Get Format_Settings_SBR/String.
    * 
    * @return Format_Settings_SBR/String.
    */
    @Nullable
    public final String getFormatSettingsSBRStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSSBRSTRING);
    }

   /**
    * Get Format_Settings_SBR/String.
    * 
    * @return Format_Settings_SBR/String.
    */
    @Nullable
    public final Boolean getFormatSettingsSBRStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSSBRSTRING);
    }

   /**
    * Get Format_Settings_SBR/String.
    * 
    * @return Format_Settings_SBR/String.
    */
    @Nullable
    public final BigInteger getFormatSettingsSBRStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSSBRSTRING);
    }

   /**
    * Get Format_Settings_SBR/String.
    * 
    * @return Format_Settings_SBR/String.
    */
    @Nullable
    public final URL getFormatSettingsSBRStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.FORMATSETTINGSSBRSTRING);
    }


   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Integer getSourceDurationStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING);
    }

   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Long getSourceDurationStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING);
    }

   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalDateTime getSourceDurationStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING);
    }

   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalTime getSourceDurationStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING);
    }

   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final String getSourceDurationStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING);
    }

   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Boolean getSourceDurationStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING);
    }

   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final BigInteger getSourceDurationStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING);
    }

   /**
    * Get Source Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Source Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final URL getSourceDurationStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SOURCEDURATIONSTRING);
    }


   /**
    * Get Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    */
    @Nullable
    public final Integer getBitRateEncodedStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.BITRATEENCODEDSTRING);
    }

   /**
    * Get Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    */
    @Nullable
    public final Long getBitRateEncodedStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.BITRATEENCODEDSTRING);
    }

   /**
    * Get Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    */
    @Nullable
    public final LocalDateTime getBitRateEncodedStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.BITRATEENCODEDSTRING);
    }

   /**
    * Get Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    */
    @Nullable
    public final LocalTime getBitRateEncodedStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.BITRATEENCODEDSTRING);
    }

   /**
    * Get Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    */
    @Nullable
    public final String getBitRateEncodedStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.BITRATEENCODEDSTRING);
    }

   /**
    * Get Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    */
    @Nullable
    public final Boolean getBitRateEncodedStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.BITRATEENCODEDSTRING);
    }

   /**
    * Get Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    */
    @Nullable
    public final BigInteger getBitRateEncodedStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.BITRATEENCODEDSTRING);
    }

   /**
    * Get Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    * 
    * @return Encoded (with forced padding) bit rate (with measurement), if some container padding is present.
    */
    @Nullable
    public final URL getBitRateEncodedStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.BITRATEENCODEDSTRING);
    }


   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final Integer getStreamKindStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMKINDSTRING);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final Long getStreamKindStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.STREAMKINDSTRING);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final LocalDateTime getStreamKindStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMKINDSTRING);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final LocalTime getStreamKindStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.STREAMKINDSTRING);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final String getStreamKindStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.STREAMKINDSTRING);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final Boolean getStreamKindStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.STREAMKINDSTRING);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final BigInteger getStreamKindStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.STREAMKINDSTRING);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final URL getStreamKindStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.STREAMKINDSTRING);
    }


   /**
    * Get Position of channels (x/y.z format).
    * 
    * @return Position of channels (x/y.z format).
    */
    @Nullable
    public final Integer getChannelPositionsString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.CHANNELPOSITIONSSTRING2);
    }

   /**
    * Get Position of channels (x/y.z format).
    * 
    * @return Position of channels (x/y.z format).
    */
    @Nullable
    public final Long getChannelPositionsString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.CHANNELPOSITIONSSTRING2);
    }

   /**
    * Get Position of channels (x/y.z format).
    * 
    * @return Position of channels (x/y.z format).
    */
    @Nullable
    public final LocalDateTime getChannelPositionsString2AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.CHANNELPOSITIONSSTRING2);
    }

   /**
    * Get Position of channels (x/y.z format).
    * 
    * @return Position of channels (x/y.z format).
    */
    @Nullable
    public final LocalTime getChannelPositionsString2AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.CHANNELPOSITIONSSTRING2);
    }

   /**
    * Get Position of channels (x/y.z format).
    * 
    * @return Position of channels (x/y.z format).
    */
    @Nullable
    public final String getChannelPositionsString2AsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.CHANNELPOSITIONSSTRING2);
    }

   /**
    * Get Position of channels (x/y.z format).
    * 
    * @return Position of channels (x/y.z format).
    */
    @Nullable
    public final Boolean getChannelPositionsString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.CHANNELPOSITIONSSTRING2);
    }

   /**
    * Get Position of channels (x/y.z format).
    * 
    * @return Position of channels (x/y.z format).
    */
    @Nullable
    public final BigInteger getChannelPositionsString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.CHANNELPOSITIONSSTRING2);
    }

   /**
    * Get Position of channels (x/y.z format).
    * 
    * @return Position of channels (x/y.z format).
    */
    @Nullable
    public final URL getChannelPositionsString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.CHANNELPOSITIONSSTRING2);
    }


   /**
    * Get Version of the product.
    * 
    * @return Version of the product.
    */
    @Nullable
    public final Integer getEncodedApplicationVersionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATIONVERSION);
    }

   /**
    * Get Version of the product.
    * 
    * @return Version of the product.
    */
    @Nullable
    public final Long getEncodedApplicationVersionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATIONVERSION);
    }

   /**
    * Get Version of the product.
    * 
    * @return Version of the product.
    */
    @Nullable
    public final LocalDateTime getEncodedApplicationVersionAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATIONVERSION);
    }

   /**
    * Get Version of the product.
    * 
    * @return Version of the product.
    */
    @Nullable
    public final LocalTime getEncodedApplicationVersionAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATIONVERSION);
    }

   /**
    * Get Version of the product.
    * 
    * @return Version of the product.
    */
    @Nullable
    public final String getEncodedApplicationVersionAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATIONVERSION);
    }

   /**
    * Get Version of the product.
    * 
    * @return Version of the product.
    */
    @Nullable
    public final Boolean getEncodedApplicationVersionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATIONVERSION);
    }

   /**
    * Get Version of the product.
    * 
    * @return Version of the product.
    */
    @Nullable
    public final BigInteger getEncodedApplicationVersionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATIONVERSION);
    }

   /**
    * Get Version of the product.
    * 
    * @return Version of the product.
    */
    @Nullable
    public final URL getEncodedApplicationVersionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.ENCODEDAPPLICATIONVERSION);
    }


   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final Integer getMenuIDAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.MENUID);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final Long getMenuIDAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.MENUID);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final LocalDateTime getMenuIDAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.MENUID);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final LocalTime getMenuIDAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.MENUID);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final String getMenuIDAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.MENUID);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final Boolean getMenuIDAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.MENUID);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final BigInteger getMenuIDAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.MENUID);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final URL getMenuIDAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.MENUID);
    }


   /**
    * Get Sampling rate.
    * 
    * @return Sampling rate.
    */
    @Nullable
    public final Integer getSamplesPerFrameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.SAMPLESPERFRAME);
    }

   /**
    * Get Sampling rate.
    * 
    * @return Sampling rate.
    */
    @Nullable
    public final Long getSamplesPerFrameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.SAMPLESPERFRAME);
    }

   /**
    * Get Sampling rate.
    * 
    * @return Sampling rate.
    */
    @Nullable
    public final LocalDateTime getSamplesPerFrameAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.SAMPLESPERFRAME);
    }

   /**
    * Get Sampling rate.
    * 
    * @return Sampling rate.
    */
    @Nullable
    public final LocalTime getSamplesPerFrameAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.SAMPLESPERFRAME);
    }

   /**
    * Get Sampling rate.
    * 
    * @return Sampling rate.
    */
    @Nullable
    public final String getSamplesPerFrameAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.SAMPLESPERFRAME);
    }

   /**
    * Get Sampling rate.
    * 
    * @return Sampling rate.
    */
    @Nullable
    public final Boolean getSamplesPerFrameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.SAMPLESPERFRAME);
    }

   /**
    * Get Sampling rate.
    * 
    * @return Sampling rate.
    */
    @Nullable
    public final BigInteger getSamplesPerFrameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.SAMPLESPERFRAME);
    }

   /**
    * Get Sampling rate.
    * 
    * @return Sampling rate.
    */
    @Nullable
    public final URL getSamplesPerFrameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.SAMPLESPERFRAME);
    }


   /**
    * Get Between how much time and video frames the stream is inserted (with measurement).
    * 
    * @return Between how much time and video frames the stream is inserted (with measurement).
    */
    @Nullable
    public final Integer getInterleaveDurationStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVEDURATIONSTRING);
    }

   /**
    * Get Between how much time and video frames the stream is inserted (with measurement).
    * 
    * @return Between how much time and video frames the stream is inserted (with measurement).
    */
    @Nullable
    public final Long getInterleaveDurationStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVEDURATIONSTRING);
    }

   /**
    * Get Between how much time and video frames the stream is inserted (with measurement).
    * 
    * @return Between how much time and video frames the stream is inserted (with measurement).
    */
    @Nullable
    public final LocalDateTime getInterleaveDurationStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVEDURATIONSTRING);
    }

   /**
    * Get Between how much time and video frames the stream is inserted (with measurement).
    * 
    * @return Between how much time and video frames the stream is inserted (with measurement).
    */
    @Nullable
    public final LocalTime getInterleaveDurationStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVEDURATIONSTRING);
    }

   /**
    * Get Between how much time and video frames the stream is inserted (with measurement).
    * 
    * @return Between how much time and video frames the stream is inserted (with measurement).
    */
    @Nullable
    public final String getInterleaveDurationStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVEDURATIONSTRING);
    }

   /**
    * Get Between how much time and video frames the stream is inserted (with measurement).
    * 
    * @return Between how much time and video frames the stream is inserted (with measurement).
    */
    @Nullable
    public final Boolean getInterleaveDurationStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVEDURATIONSTRING);
    }

   /**
    * Get Between how much time and video frames the stream is inserted (with measurement).
    * 
    * @return Between how much time and video frames the stream is inserted (with measurement).
    */
    @Nullable
    public final BigInteger getInterleaveDurationStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVEDURATIONSTRING);
    }

   /**
    * Get Between how much time and video frames the stream is inserted (with measurement).
    * 
    * @return Between how much time and video frames the stream is inserted (with measurement).
    */
    @Nullable
    public final URL getInterleaveDurationStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.INTERLEAVEDURATIONSTRING);
    }


   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final Integer getAlternateGroupStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.Audio, getStreamNumber(), Audio.ALTERNATEGROUPSTRING);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final Long getAlternateGroupStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.Audio, getStreamNumber(), Audio.ALTERNATEGROUPSTRING);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final LocalDateTime getAlternateGroupStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.Audio, getStreamNumber(), Audio.ALTERNATEGROUPSTRING);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final LocalTime getAlternateGroupStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.Audio, getStreamNumber(), Audio.ALTERNATEGROUPSTRING);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final String getAlternateGroupStringAsString() {
        return getMediaInfo().getAsString(StreamKind.Audio, getStreamNumber(), Audio.ALTERNATEGROUPSTRING);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final Boolean getAlternateGroupStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.Audio, getStreamNumber(), Audio.ALTERNATEGROUPSTRING);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final BigInteger getAlternateGroupStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.Audio, getStreamNumber(), Audio.ALTERNATEGROUPSTRING);
    }

   /**
    * Get Number of a group in order to provide versions of the same track.
    * 
    * @return Number of a group in order to provide versions of the same track.
    */
    @Nullable
    public final URL getAlternateGroupStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.Audio, getStreamNumber(), Audio.ALTERNATEGROUPSTRING);
    }


}
