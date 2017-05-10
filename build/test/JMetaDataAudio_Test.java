package aka.jmetadata.test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.jdt.annotation.NonNull;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import aka.jmetadata.main.JMetaData;
import aka.jmetadata.main.JMetaDataAudio;

/**
 * This class contains tests methods for Audio informations of a specific Audio stream.
 *
 * @author Welle Charlotte
 */
public final class JMetaDataAudio_Test {

    private static @NonNull final Logger LOGGER = Logger.getLogger(JMetaDataAudio_Test.class.getName());

    private static JMetaDataAudio jMetaDataAudio;
    private static JMetaData jMetaData;

    /**
     * Initialize test.
     */
    @BeforeClass
    public static void beforeUnit() {
        try {
            jMetaData = new JMetaData();
            final ClassLoader classLoader = JMetaDataAudio_Test.class.getClassLoader();
            final File file = new File(classLoader.getResource("somefile").getFile());
            jMetaData.open(file);
            jMetaDataAudio = null;
        } catch (final Throwable e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
    }

    /**
     * Deinitialize test.
     */
    @AfterClass
    public static void afterUnit() {
        try {
            jMetaData.close();
        } catch (final Throwable e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
    }

   /**
    * Test getDelayOriginalSourceAsInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalSourceAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalSourceAsInteger());
        System.out.println("Delay source (Stream or empty) AS Integer === " + jMetaDataAudio.getDelayOriginalSourceAsInteger());
    }

   /**
    * Test getDelayOriginalSourceAsLong() method.
    */
    @Test
    public void subTestGetDelayOriginalSourceAsLong() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalSourceAsLong());
        System.out.println("Delay source (Stream or empty) AS Long === " + jMetaDataAudio.getDelayOriginalSourceAsLong());
    }

   /**
    * Test getDelayOriginalSourceAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayOriginalSourceAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalSourceAsLocalDateTime());
        System.out.println("Delay source (Stream or empty) AS LocalDateTime === " + jMetaDataAudio.getDelayOriginalSourceAsLocalDateTime());
    }

   /**
    * Test getDelayOriginalSourceAsLocalTime() method.
    */
    @Test
    public void subTestGetDelayOriginalSourceAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalSourceAsLocalTime());
        System.out.println("Delay source (Stream or empty) AS LocalTime === " + jMetaDataAudio.getDelayOriginalSourceAsLocalTime());
    }

   /**
    * Test getDelayOriginalSourceAsString() method.
    */
    @Test
    public void subTestGetDelayOriginalSourceAsString() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalSourceAsString());
        System.out.println("Delay source (Stream or empty) AS String === " + jMetaDataAudio.getDelayOriginalSourceAsString());
    }

   /**
    * Test getDelayOriginalSourceAsBoolean() method.
    */
    @Test
    public void subTestGetDelayOriginalSourceAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalSourceAsBoolean());
        System.out.println("Delay source (Stream or empty) AS Boolean === " + jMetaDataAudio.getDelayOriginalSourceAsBoolean());
    }

   /**
    * Test getDelayOriginalSourceAsBigInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalSourceAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalSourceAsBigInteger());
        System.out.println("Delay source (Stream or empty) AS BigInteger === " + jMetaDataAudio.getDelayOriginalSourceAsBigInteger());
    }

   /**
    * Test getDelayOriginalSourceAsURL() method.
    */
    @Test
    public void subTestGetDelayOriginalSourceAsURL() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalSourceAsURL());
        System.out.println("Delay source (Stream or empty) AS URL === " + jMetaDataAudio.getDelayOriginalSourceAsURL());
    }

   /**
    * Test getInterleaveDurationAsInteger() method.
    */
    @Test
    public void subTestGetInterleaveDurationAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getInterleaveDurationAsInteger());
        System.out.println("Between how much time (ms) the stream is inserted AS Integer === " + jMetaDataAudio.getInterleaveDurationAsInteger());
    }

   /**
    * Test getInterleaveDurationAsLong() method.
    */
    @Test
    public void subTestGetInterleaveDurationAsLong() {
        assertEquals(null, this.jMetaDataAudio.getInterleaveDurationAsLong());
        System.out.println("Between how much time (ms) the stream is inserted AS Long === " + jMetaDataAudio.getInterleaveDurationAsLong());
    }

   /**
    * Test getInterleaveDurationAsLocalDateTime() method.
    */
    @Test
    public void subTestGetInterleaveDurationAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getInterleaveDurationAsLocalDateTime());
        System.out.println("Between how much time (ms) the stream is inserted AS LocalDateTime === " + jMetaDataAudio.getInterleaveDurationAsLocalDateTime());
    }

   /**
    * Test getInterleaveDurationAsLocalTime() method.
    */
    @Test
    public void subTestGetInterleaveDurationAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getInterleaveDurationAsLocalTime());
        System.out.println("Between how much time (ms) the stream is inserted AS LocalTime === " + jMetaDataAudio.getInterleaveDurationAsLocalTime());
    }

   /**
    * Test getInterleaveDurationAsString() method.
    */
    @Test
    public void subTestGetInterleaveDurationAsString() {
        assertEquals(null, this.jMetaDataAudio.getInterleaveDurationAsString());
        System.out.println("Between how much time (ms) the stream is inserted AS String === " + jMetaDataAudio.getInterleaveDurationAsString());
    }

   /**
    * Test getInterleaveDurationAsBoolean() method.
    */
    @Test
    public void subTestGetInterleaveDurationAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getInterleaveDurationAsBoolean());
        System.out.println("Between how much time (ms) the stream is inserted AS Boolean === " + jMetaDataAudio.getInterleaveDurationAsBoolean());
    }

   /**
    * Test getInterleaveDurationAsBigInteger() method.
    */
    @Test
    public void subTestGetInterleaveDurationAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getInterleaveDurationAsBigInteger());
        System.out.println("Between how much time (ms) the stream is inserted AS BigInteger === " + jMetaDataAudio.getInterleaveDurationAsBigInteger());
    }

   /**
    * Test getInterleaveDurationAsURL() method.
    */
    @Test
    public void subTestGetInterleaveDurationAsURL() {
        assertEquals(null, this.jMetaDataAudio.getInterleaveDurationAsURL());
        System.out.println("Between how much time (ms) the stream is inserted AS URL === " + jMetaDataAudio.getInterleaveDurationAsURL());
    }

   /**
    * Test getStreamOrderAsInteger() method.
    */
    @Test
    public void subTestGetStreamOrderAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamOrderAsInteger());
        System.out.println("Stream order in the file, whatever is the kind of stream (base=0) AS Integer === " + jMetaDataAudio.getStreamOrderAsInteger());
    }

   /**
    * Test getStreamOrderAsLong() method.
    */
    @Test
    public void subTestGetStreamOrderAsLong() {
        assertEquals(null, this.jMetaDataAudio.getStreamOrderAsLong());
        System.out.println("Stream order in the file, whatever is the kind of stream (base=0) AS Long === " + jMetaDataAudio.getStreamOrderAsLong());
    }

   /**
    * Test getStreamOrderAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamOrderAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamOrderAsLocalDateTime());
        System.out.println("Stream order in the file, whatever is the kind of stream (base=0) AS LocalDateTime === " + jMetaDataAudio.getStreamOrderAsLocalDateTime());
    }

   /**
    * Test getStreamOrderAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamOrderAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamOrderAsLocalTime());
        System.out.println("Stream order in the file, whatever is the kind of stream (base=0) AS LocalTime === " + jMetaDataAudio.getStreamOrderAsLocalTime());
    }

   /**
    * Test getStreamOrderAsString() method.
    */
    @Test
    public void subTestGetStreamOrderAsString() {
        assertEquals(null, this.jMetaDataAudio.getStreamOrderAsString());
        System.out.println("Stream order in the file, whatever is the kind of stream (base=0) AS String === " + jMetaDataAudio.getStreamOrderAsString());
    }

   /**
    * Test getStreamOrderAsBoolean() method.
    */
    @Test
    public void subTestGetStreamOrderAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getStreamOrderAsBoolean());
        System.out.println("Stream order in the file, whatever is the kind of stream (base=0) AS Boolean === " + jMetaDataAudio.getStreamOrderAsBoolean());
    }

   /**
    * Test getStreamOrderAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamOrderAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamOrderAsBigInteger());
        System.out.println("Stream order in the file, whatever is the kind of stream (base=0) AS BigInteger === " + jMetaDataAudio.getStreamOrderAsBigInteger());
    }

   /**
    * Test getStreamOrderAsURL() method.
    */
    @Test
    public void subTestGetStreamOrderAsURL() {
        assertEquals(null, this.jMetaDataAudio.getStreamOrderAsURL());
        System.out.println("Stream order in the file, whatever is the kind of stream (base=0) AS URL === " + jMetaDataAudio.getStreamOrderAsURL());
    }

   /**
    * Test getEncodedLibraryNameAsInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryNameAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryNameAsInteger());
        System.out.println("Name of the the encoding-software AS Integer === " + jMetaDataAudio.getEncodedLibraryNameAsInteger());
    }

   /**
    * Test getEncodedLibraryNameAsLong() method.
    */
    @Test
    public void subTestGetEncodedLibraryNameAsLong() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryNameAsLong());
        System.out.println("Name of the the encoding-software AS Long === " + jMetaDataAudio.getEncodedLibraryNameAsLong());
    }

   /**
    * Test getEncodedLibraryNameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryNameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryNameAsLocalDateTime());
        System.out.println("Name of the the encoding-software AS LocalDateTime === " + jMetaDataAudio.getEncodedLibraryNameAsLocalDateTime());
    }

   /**
    * Test getEncodedLibraryNameAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryNameAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryNameAsLocalTime());
        System.out.println("Name of the the encoding-software AS LocalTime === " + jMetaDataAudio.getEncodedLibraryNameAsLocalTime());
    }

   /**
    * Test getEncodedLibraryNameAsString() method.
    */
    @Test
    public void subTestGetEncodedLibraryNameAsString() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryNameAsString());
        System.out.println("Name of the the encoding-software AS String === " + jMetaDataAudio.getEncodedLibraryNameAsString());
    }

   /**
    * Test getEncodedLibraryNameAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedLibraryNameAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryNameAsBoolean());
        System.out.println("Name of the the encoding-software AS Boolean === " + jMetaDataAudio.getEncodedLibraryNameAsBoolean());
    }

   /**
    * Test getEncodedLibraryNameAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryNameAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryNameAsBigInteger());
        System.out.println("Name of the the encoding-software AS BigInteger === " + jMetaDataAudio.getEncodedLibraryNameAsBigInteger());
    }

   /**
    * Test getEncodedLibraryNameAsURL() method.
    */
    @Test
    public void subTestGetEncodedLibraryNameAsURL() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryNameAsURL());
        System.out.println("Name of the the encoding-software AS URL === " + jMetaDataAudio.getEncodedLibraryNameAsURL());
    }

   /**
    * Test getDurationFirstFrameString4AsInteger() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString4AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameString4AsInteger());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Integer === " + jMetaDataAudio.getDurationFirstFrameString4AsInteger());
    }

   /**
    * Test getDurationFirstFrameString4AsLong() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString4AsLong() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameString4AsLong());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Long === " + jMetaDataAudio.getDurationFirstFrameString4AsLong());
    }

   /**
    * Test getDurationFirstFrameString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameString4AsLocalDateTime());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS LocalDateTime === " + jMetaDataAudio.getDurationFirstFrameString4AsLocalDateTime());
    }

   /**
    * Test getDurationFirstFrameString4AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString4AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameString4AsLocalTime());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS LocalTime === " + jMetaDataAudio.getDurationFirstFrameString4AsLocalTime());
    }

   /**
    * Test getDurationFirstFrameString4AsString() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString4AsString() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameString4AsString());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS String === " + jMetaDataAudio.getDurationFirstFrameString4AsString());
    }

   /**
    * Test getDurationFirstFrameString4AsBoolean() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString4AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameString4AsBoolean());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Boolean === " + jMetaDataAudio.getDurationFirstFrameString4AsBoolean());
    }

   /**
    * Test getDurationFirstFrameString4AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString4AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameString4AsBigInteger());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS BigInteger === " + jMetaDataAudio.getDurationFirstFrameString4AsBigInteger());
    }

   /**
    * Test getDurationFirstFrameString4AsURL() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString4AsURL() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameString4AsURL());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS URL === " + jMetaDataAudio.getDurationFirstFrameString4AsURL());
    }

   /**
    * Test getDurationFirstFrameString5AsInteger() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString5AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameString5AsInteger());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Integer === " + jMetaDataAudio.getDurationFirstFrameString5AsInteger());
    }

   /**
    * Test getDurationFirstFrameString5AsLong() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString5AsLong() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameString5AsLong());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Long === " + jMetaDataAudio.getDurationFirstFrameString5AsLong());
    }

   /**
    * Test getDurationFirstFrameString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameString5AsLocalDateTime());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS LocalDateTime === " + jMetaDataAudio.getDurationFirstFrameString5AsLocalDateTime());
    }

   /**
    * Test getDurationFirstFrameString5AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString5AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameString5AsLocalTime());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS LocalTime === " + jMetaDataAudio.getDurationFirstFrameString5AsLocalTime());
    }

   /**
    * Test getDurationFirstFrameString5AsString() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString5AsString() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameString5AsString());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS String === " + jMetaDataAudio.getDurationFirstFrameString5AsString());
    }

   /**
    * Test getDurationFirstFrameString5AsBoolean() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString5AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameString5AsBoolean());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Boolean === " + jMetaDataAudio.getDurationFirstFrameString5AsBoolean());
    }

   /**
    * Test getDurationFirstFrameString5AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString5AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameString5AsBigInteger());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS BigInteger === " + jMetaDataAudio.getDurationFirstFrameString5AsBigInteger());
    }

   /**
    * Test getDurationFirstFrameString5AsURL() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString5AsURL() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameString5AsURL());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS URL === " + jMetaDataAudio.getDurationFirstFrameString5AsURL());
    }

   /**
    * Test getDurationFirstFrameString2AsInteger() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString2AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameString2AsInteger());
        System.out.println("Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Integer === " + jMetaDataAudio.getDurationFirstFrameString2AsInteger());
    }

   /**
    * Test getDurationFirstFrameString2AsLong() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString2AsLong() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameString2AsLong());
        System.out.println("Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Long === " + jMetaDataAudio.getDurationFirstFrameString2AsLong());
    }

   /**
    * Test getDurationFirstFrameString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameString2AsLocalDateTime());
        System.out.println("Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS LocalDateTime === " + jMetaDataAudio.getDurationFirstFrameString2AsLocalDateTime());
    }

   /**
    * Test getDurationFirstFrameString2AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString2AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameString2AsLocalTime());
        System.out.println("Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS LocalTime === " + jMetaDataAudio.getDurationFirstFrameString2AsLocalTime());
    }

   /**
    * Test getDurationFirstFrameString2AsString() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString2AsString() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameString2AsString());
        System.out.println("Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS String === " + jMetaDataAudio.getDurationFirstFrameString2AsString());
    }

   /**
    * Test getDurationFirstFrameString2AsBoolean() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString2AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameString2AsBoolean());
        System.out.println("Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Boolean === " + jMetaDataAudio.getDurationFirstFrameString2AsBoolean());
    }

   /**
    * Test getDurationFirstFrameString2AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString2AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameString2AsBigInteger());
        System.out.println("Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS BigInteger === " + jMetaDataAudio.getDurationFirstFrameString2AsBigInteger());
    }

   /**
    * Test getDurationFirstFrameString2AsURL() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString2AsURL() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameString2AsURL());
        System.out.println("Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS URL === " + jMetaDataAudio.getDurationFirstFrameString2AsURL());
    }

   /**
    * Test getSourceDurationFirstFrameStringAsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameStringAsInteger());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Integer === " + jMetaDataAudio.getSourceDurationFirstFrameStringAsInteger());
    }

   /**
    * Test getSourceDurationFirstFrameStringAsLong() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameStringAsLong());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Long === " + jMetaDataAudio.getSourceDurationFirstFrameStringAsLong());
    }

   /**
    * Test getSourceDurationFirstFrameStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameStringAsLocalDateTime());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS LocalDateTime === " + jMetaDataAudio.getSourceDurationFirstFrameStringAsLocalDateTime());
    }

   /**
    * Test getSourceDurationFirstFrameStringAsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameStringAsLocalTime());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS LocalTime === " + jMetaDataAudio.getSourceDurationFirstFrameStringAsLocalTime());
    }

   /**
    * Test getSourceDurationFirstFrameStringAsString() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameStringAsString());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS String === " + jMetaDataAudio.getSourceDurationFirstFrameStringAsString());
    }

   /**
    * Test getSourceDurationFirstFrameStringAsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameStringAsBoolean());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Boolean === " + jMetaDataAudio.getSourceDurationFirstFrameStringAsBoolean());
    }

   /**
    * Test getSourceDurationFirstFrameStringAsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameStringAsBigInteger());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS BigInteger === " + jMetaDataAudio.getSourceDurationFirstFrameStringAsBigInteger());
    }

   /**
    * Test getSourceDurationFirstFrameStringAsURL() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameStringAsURL());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS URL === " + jMetaDataAudio.getSourceDurationFirstFrameStringAsURL());
    }

   /**
    * Test getDurationFirstFrameString3AsInteger() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString3AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameString3AsInteger());
        System.out.println("Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM AS Integer === " + jMetaDataAudio.getDurationFirstFrameString3AsInteger());
    }

   /**
    * Test getDurationFirstFrameString3AsLong() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString3AsLong() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameString3AsLong());
        System.out.println("Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM AS Long === " + jMetaDataAudio.getDurationFirstFrameString3AsLong());
    }

   /**
    * Test getDurationFirstFrameString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameString3AsLocalDateTime());
        System.out.println("Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM AS LocalDateTime === " + jMetaDataAudio.getDurationFirstFrameString3AsLocalDateTime());
    }

   /**
    * Test getDurationFirstFrameString3AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString3AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameString3AsLocalTime());
        System.out.println("Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM AS LocalTime === " + jMetaDataAudio.getDurationFirstFrameString3AsLocalTime());
    }

   /**
    * Test getDurationFirstFrameString3AsString() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString3AsString() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameString3AsString());
        System.out.println("Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM AS String === " + jMetaDataAudio.getDurationFirstFrameString3AsString());
    }

   /**
    * Test getDurationFirstFrameString3AsBoolean() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString3AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameString3AsBoolean());
        System.out.println("Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM AS Boolean === " + jMetaDataAudio.getDurationFirstFrameString3AsBoolean());
    }

   /**
    * Test getDurationFirstFrameString3AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString3AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameString3AsBigInteger());
        System.out.println("Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM AS BigInteger === " + jMetaDataAudio.getDurationFirstFrameString3AsBigInteger());
    }

   /**
    * Test getDurationFirstFrameString3AsURL() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString3AsURL() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameString3AsURL());
        System.out.println("Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM AS URL === " + jMetaDataAudio.getDurationFirstFrameString3AsURL());
    }

   /**
    * Test getSourceDurationLastFrameAsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameAsInteger());
        System.out.println("Source Duration of the last frame if it is longer than others, in ms AS Integer === " + jMetaDataAudio.getSourceDurationLastFrameAsInteger());
    }

   /**
    * Test getSourceDurationLastFrameAsLong() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameAsLong() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameAsLong());
        System.out.println("Source Duration of the last frame if it is longer than others, in ms AS Long === " + jMetaDataAudio.getSourceDurationLastFrameAsLong());
    }

   /**
    * Test getSourceDurationLastFrameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameAsLocalDateTime());
        System.out.println("Source Duration of the last frame if it is longer than others, in ms AS LocalDateTime === " + jMetaDataAudio.getSourceDurationLastFrameAsLocalDateTime());
    }

   /**
    * Test getSourceDurationLastFrameAsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameAsLocalTime());
        System.out.println("Source Duration of the last frame if it is longer than others, in ms AS LocalTime === " + jMetaDataAudio.getSourceDurationLastFrameAsLocalTime());
    }

   /**
    * Test getSourceDurationLastFrameAsString() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameAsString() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameAsString());
        System.out.println("Source Duration of the last frame if it is longer than others, in ms AS String === " + jMetaDataAudio.getSourceDurationLastFrameAsString());
    }

   /**
    * Test getSourceDurationLastFrameAsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameAsBoolean());
        System.out.println("Source Duration of the last frame if it is longer than others, in ms AS Boolean === " + jMetaDataAudio.getSourceDurationLastFrameAsBoolean());
    }

   /**
    * Test getSourceDurationLastFrameAsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameAsBigInteger());
        System.out.println("Source Duration of the last frame if it is longer than others, in ms AS BigInteger === " + jMetaDataAudio.getSourceDurationLastFrameAsBigInteger());
    }

   /**
    * Test getSourceDurationLastFrameAsURL() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameAsURL() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameAsURL());
        System.out.println("Source Duration of the last frame if it is longer than others, in ms AS URL === " + jMetaDataAudio.getSourceDurationLastFrameAsURL());
    }

   /**
    * Test getDurationFirstFrameString1AsInteger() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString1AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameString1AsInteger());
        System.out.println("Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS Integer === " + jMetaDataAudio.getDurationFirstFrameString1AsInteger());
    }

   /**
    * Test getDurationFirstFrameString1AsLong() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString1AsLong() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameString1AsLong());
        System.out.println("Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS Long === " + jMetaDataAudio.getDurationFirstFrameString1AsLong());
    }

   /**
    * Test getDurationFirstFrameString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameString1AsLocalDateTime());
        System.out.println("Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS LocalDateTime === " + jMetaDataAudio.getDurationFirstFrameString1AsLocalDateTime());
    }

   /**
    * Test getDurationFirstFrameString1AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString1AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameString1AsLocalTime());
        System.out.println("Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS LocalTime === " + jMetaDataAudio.getDurationFirstFrameString1AsLocalTime());
    }

   /**
    * Test getDurationFirstFrameString1AsString() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString1AsString() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameString1AsString());
        System.out.println("Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS String === " + jMetaDataAudio.getDurationFirstFrameString1AsString());
    }

   /**
    * Test getDurationFirstFrameString1AsBoolean() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString1AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameString1AsBoolean());
        System.out.println("Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS Boolean === " + jMetaDataAudio.getDurationFirstFrameString1AsBoolean());
    }

   /**
    * Test getDurationFirstFrameString1AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString1AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameString1AsBigInteger());
        System.out.println("Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS BigInteger === " + jMetaDataAudio.getDurationFirstFrameString1AsBigInteger());
    }

   /**
    * Test getDurationFirstFrameString1AsURL() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString1AsURL() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameString1AsURL());
        System.out.println("Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS URL === " + jMetaDataAudio.getDurationFirstFrameString1AsURL());
    }

   /**
    * Test getInterleavePreloadStringAsInteger() method.
    */
    @Test
    public void subTestGetInterleavePreloadStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getInterleavePreloadStringAsInteger());
        System.out.println("How much time is buffered before the first video frame (with measurement) AS Integer === " + jMetaDataAudio.getInterleavePreloadStringAsInteger());
    }

   /**
    * Test getInterleavePreloadStringAsLong() method.
    */
    @Test
    public void subTestGetInterleavePreloadStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getInterleavePreloadStringAsLong());
        System.out.println("How much time is buffered before the first video frame (with measurement) AS Long === " + jMetaDataAudio.getInterleavePreloadStringAsLong());
    }

   /**
    * Test getInterleavePreloadStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetInterleavePreloadStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getInterleavePreloadStringAsLocalDateTime());
        System.out.println("How much time is buffered before the first video frame (with measurement) AS LocalDateTime === " + jMetaDataAudio.getInterleavePreloadStringAsLocalDateTime());
    }

   /**
    * Test getInterleavePreloadStringAsLocalTime() method.
    */
    @Test
    public void subTestGetInterleavePreloadStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getInterleavePreloadStringAsLocalTime());
        System.out.println("How much time is buffered before the first video frame (with measurement) AS LocalTime === " + jMetaDataAudio.getInterleavePreloadStringAsLocalTime());
    }

   /**
    * Test getInterleavePreloadStringAsString() method.
    */
    @Test
    public void subTestGetInterleavePreloadStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getInterleavePreloadStringAsString());
        System.out.println("How much time is buffered before the first video frame (with measurement) AS String === " + jMetaDataAudio.getInterleavePreloadStringAsString());
    }

   /**
    * Test getInterleavePreloadStringAsBoolean() method.
    */
    @Test
    public void subTestGetInterleavePreloadStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getInterleavePreloadStringAsBoolean());
        System.out.println("How much time is buffered before the first video frame (with measurement) AS Boolean === " + jMetaDataAudio.getInterleavePreloadStringAsBoolean());
    }

   /**
    * Test getInterleavePreloadStringAsBigInteger() method.
    */
    @Test
    public void subTestGetInterleavePreloadStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getInterleavePreloadStringAsBigInteger());
        System.out.println("How much time is buffered before the first video frame (with measurement) AS BigInteger === " + jMetaDataAudio.getInterleavePreloadStringAsBigInteger());
    }

   /**
    * Test getInterleavePreloadStringAsURL() method.
    */
    @Test
    public void subTestGetInterleavePreloadStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getInterleavePreloadStringAsURL());
        System.out.println("How much time is buffered before the first video frame (with measurement) AS URL === " + jMetaDataAudio.getInterleavePreloadStringAsURL());
    }

   /**
    * Test getFormatCompressionAsInteger() method.
    */
    @Test
    public void subTestGetFormatCompressionAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatCompressionAsInteger());
        System.out.println("Compression method used AS Integer === " + jMetaDataAudio.getFormatCompressionAsInteger());
    }

   /**
    * Test getFormatCompressionAsLong() method.
    */
    @Test
    public void subTestGetFormatCompressionAsLong() {
        assertEquals(null, this.jMetaDataAudio.getFormatCompressionAsLong());
        System.out.println("Compression method used AS Long === " + jMetaDataAudio.getFormatCompressionAsLong());
    }

   /**
    * Test getFormatCompressionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatCompressionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatCompressionAsLocalDateTime());
        System.out.println("Compression method used AS LocalDateTime === " + jMetaDataAudio.getFormatCompressionAsLocalDateTime());
    }

   /**
    * Test getFormatCompressionAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatCompressionAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatCompressionAsLocalTime());
        System.out.println("Compression method used AS LocalTime === " + jMetaDataAudio.getFormatCompressionAsLocalTime());
    }

   /**
    * Test getFormatCompressionAsString() method.
    */
    @Test
    public void subTestGetFormatCompressionAsString() {
        assertEquals(null, this.jMetaDataAudio.getFormatCompressionAsString());
        System.out.println("Compression method used AS String === " + jMetaDataAudio.getFormatCompressionAsString());
    }

   /**
    * Test getFormatCompressionAsBoolean() method.
    */
    @Test
    public void subTestGetFormatCompressionAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getFormatCompressionAsBoolean());
        System.out.println("Compression method used AS Boolean === " + jMetaDataAudio.getFormatCompressionAsBoolean());
    }

   /**
    * Test getFormatCompressionAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatCompressionAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatCompressionAsBigInteger());
        System.out.println("Compression method used AS BigInteger === " + jMetaDataAudio.getFormatCompressionAsBigInteger());
    }

   /**
    * Test getFormatCompressionAsURL() method.
    */
    @Test
    public void subTestGetFormatCompressionAsURL() {
        assertEquals(null, this.jMetaDataAudio.getFormatCompressionAsURL());
        System.out.println("Compression method used AS URL === " + jMetaDataAudio.getFormatCompressionAsURL());
    }

   /**
    * Test getAlignmentStringAsInteger() method.
    */
    @Test
    public void subTestGetAlignmentStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getAlignmentStringAsInteger());
        System.out.println("Where this stream file is aligned in the container AS Integer === " + jMetaDataAudio.getAlignmentStringAsInteger());
    }

   /**
    * Test getAlignmentStringAsLong() method.
    */
    @Test
    public void subTestGetAlignmentStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getAlignmentStringAsLong());
        System.out.println("Where this stream file is aligned in the container AS Long === " + jMetaDataAudio.getAlignmentStringAsLong());
    }

   /**
    * Test getAlignmentStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetAlignmentStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getAlignmentStringAsLocalDateTime());
        System.out.println("Where this stream file is aligned in the container AS LocalDateTime === " + jMetaDataAudio.getAlignmentStringAsLocalDateTime());
    }

   /**
    * Test getAlignmentStringAsLocalTime() method.
    */
    @Test
    public void subTestGetAlignmentStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getAlignmentStringAsLocalTime());
        System.out.println("Where this stream file is aligned in the container AS LocalTime === " + jMetaDataAudio.getAlignmentStringAsLocalTime());
    }

   /**
    * Test getAlignmentStringAsString() method.
    */
    @Test
    public void subTestGetAlignmentStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getAlignmentStringAsString());
        System.out.println("Where this stream file is aligned in the container AS String === " + jMetaDataAudio.getAlignmentStringAsString());
    }

   /**
    * Test getAlignmentStringAsBoolean() method.
    */
    @Test
    public void subTestGetAlignmentStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getAlignmentStringAsBoolean());
        System.out.println("Where this stream file is aligned in the container AS Boolean === " + jMetaDataAudio.getAlignmentStringAsBoolean());
    }

   /**
    * Test getAlignmentStringAsBigInteger() method.
    */
    @Test
    public void subTestGetAlignmentStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getAlignmentStringAsBigInteger());
        System.out.println("Where this stream file is aligned in the container AS BigInteger === " + jMetaDataAudio.getAlignmentStringAsBigInteger());
    }

   /**
    * Test getAlignmentStringAsURL() method.
    */
    @Test
    public void subTestGetAlignmentStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getAlignmentStringAsURL());
        System.out.println("Where this stream file is aligned in the container AS URL === " + jMetaDataAudio.getAlignmentStringAsURL());
    }

   /**
    * Test getDelayStringAsInteger() method.
    */
    @Test
    public void subTestGetDelayStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDelayStringAsInteger());
        System.out.println("Delay with measurement AS Integer === " + jMetaDataAudio.getDelayStringAsInteger());
    }

   /**
    * Test getDelayStringAsLong() method.
    */
    @Test
    public void subTestGetDelayStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getDelayStringAsLong());
        System.out.println("Delay with measurement AS Long === " + jMetaDataAudio.getDelayStringAsLong());
    }

   /**
    * Test getDelayStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDelayStringAsLocalDateTime());
        System.out.println("Delay with measurement AS LocalDateTime === " + jMetaDataAudio.getDelayStringAsLocalDateTime());
    }

   /**
    * Test getDelayStringAsLocalTime() method.
    */
    @Test
    public void subTestGetDelayStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDelayStringAsLocalTime());
        System.out.println("Delay with measurement AS LocalTime === " + jMetaDataAudio.getDelayStringAsLocalTime());
    }

   /**
    * Test getDelayStringAsString() method.
    */
    @Test
    public void subTestGetDelayStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getDelayStringAsString());
        System.out.println("Delay with measurement AS String === " + jMetaDataAudio.getDelayStringAsString());
    }

   /**
    * Test getDelayStringAsBoolean() method.
    */
    @Test
    public void subTestGetDelayStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDelayStringAsBoolean());
        System.out.println("Delay with measurement AS Boolean === " + jMetaDataAudio.getDelayStringAsBoolean());
    }

   /**
    * Test getDelayStringAsBigInteger() method.
    */
    @Test
    public void subTestGetDelayStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDelayStringAsBigInteger());
        System.out.println("Delay with measurement AS BigInteger === " + jMetaDataAudio.getDelayStringAsBigInteger());
    }

   /**
    * Test getDelayStringAsURL() method.
    */
    @Test
    public void subTestGetDelayStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getDelayStringAsURL());
        System.out.println("Delay with measurement AS URL === " + jMetaDataAudio.getDelayStringAsURL());
    }

   /**
    * Test getMuxingModeMoreInfoAsInteger() method.
    */
    @Test
    public void subTestGetMuxingModeMoreInfoAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getMuxingModeMoreInfoAsInteger());
        System.out.println("More info (text) about the muxing mode AS Integer === " + jMetaDataAudio.getMuxingModeMoreInfoAsInteger());
    }

   /**
    * Test getMuxingModeMoreInfoAsLong() method.
    */
    @Test
    public void subTestGetMuxingModeMoreInfoAsLong() {
        assertEquals(null, this.jMetaDataAudio.getMuxingModeMoreInfoAsLong());
        System.out.println("More info (text) about the muxing mode AS Long === " + jMetaDataAudio.getMuxingModeMoreInfoAsLong());
    }

   /**
    * Test getMuxingModeMoreInfoAsLocalDateTime() method.
    */
    @Test
    public void subTestGetMuxingModeMoreInfoAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getMuxingModeMoreInfoAsLocalDateTime());
        System.out.println("More info (text) about the muxing mode AS LocalDateTime === " + jMetaDataAudio.getMuxingModeMoreInfoAsLocalDateTime());
    }

   /**
    * Test getMuxingModeMoreInfoAsLocalTime() method.
    */
    @Test
    public void subTestGetMuxingModeMoreInfoAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getMuxingModeMoreInfoAsLocalTime());
        System.out.println("More info (text) about the muxing mode AS LocalTime === " + jMetaDataAudio.getMuxingModeMoreInfoAsLocalTime());
    }

   /**
    * Test getMuxingModeMoreInfoAsString() method.
    */
    @Test
    public void subTestGetMuxingModeMoreInfoAsString() {
        assertEquals(null, this.jMetaDataAudio.getMuxingModeMoreInfoAsString());
        System.out.println("More info (text) about the muxing mode AS String === " + jMetaDataAudio.getMuxingModeMoreInfoAsString());
    }

   /**
    * Test getMuxingModeMoreInfoAsBoolean() method.
    */
    @Test
    public void subTestGetMuxingModeMoreInfoAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getMuxingModeMoreInfoAsBoolean());
        System.out.println("More info (text) about the muxing mode AS Boolean === " + jMetaDataAudio.getMuxingModeMoreInfoAsBoolean());
    }

   /**
    * Test getMuxingModeMoreInfoAsBigInteger() method.
    */
    @Test
    public void subTestGetMuxingModeMoreInfoAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getMuxingModeMoreInfoAsBigInteger());
        System.out.println("More info (text) about the muxing mode AS BigInteger === " + jMetaDataAudio.getMuxingModeMoreInfoAsBigInteger());
    }

   /**
    * Test getMuxingModeMoreInfoAsURL() method.
    */
    @Test
    public void subTestGetMuxingModeMoreInfoAsURL() {
        assertEquals(null, this.jMetaDataAudio.getMuxingModeMoreInfoAsURL());
        System.out.println("More info (text) about the muxing mode AS URL === " + jMetaDataAudio.getMuxingModeMoreInfoAsURL());
    }

   /**
    * Test getSourceStreamSizeEncodedStringAsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedStringAsInteger());
        System.out.println("Source Encoded Streamsize in with percentage value AS Integer === " + jMetaDataAudio.getSourceStreamSizeEncodedStringAsInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedStringAsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedStringAsLong());
        System.out.println("Source Encoded Streamsize in with percentage value AS Long === " + jMetaDataAudio.getSourceStreamSizeEncodedStringAsLong());
    }

   /**
    * Test getSourceStreamSizeEncodedStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedStringAsLocalDateTime());
        System.out.println("Source Encoded Streamsize in with percentage value AS LocalDateTime === " + jMetaDataAudio.getSourceStreamSizeEncodedStringAsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeEncodedStringAsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedStringAsLocalTime());
        System.out.println("Source Encoded Streamsize in with percentage value AS LocalTime === " + jMetaDataAudio.getSourceStreamSizeEncodedStringAsLocalTime());
    }

   /**
    * Test getSourceStreamSizeEncodedStringAsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedStringAsString());
        System.out.println("Source Encoded Streamsize in with percentage value AS String === " + jMetaDataAudio.getSourceStreamSizeEncodedStringAsString());
    }

   /**
    * Test getSourceStreamSizeEncodedStringAsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedStringAsBoolean());
        System.out.println("Source Encoded Streamsize in with percentage value AS Boolean === " + jMetaDataAudio.getSourceStreamSizeEncodedStringAsBoolean());
    }

   /**
    * Test getSourceStreamSizeEncodedStringAsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedStringAsBigInteger());
        System.out.println("Source Encoded Streamsize in with percentage value AS BigInteger === " + jMetaDataAudio.getSourceStreamSizeEncodedStringAsBigInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedStringAsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedStringAsURL());
        System.out.println("Source Encoded Streamsize in with percentage value AS URL === " + jMetaDataAudio.getSourceStreamSizeEncodedStringAsURL());
    }

   /**
    * Test getCodecIDDescriptionAsInteger() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDDescriptionAsInteger());
        System.out.println("Manual description given by the container AS Integer === " + jMetaDataAudio.getCodecIDDescriptionAsInteger());
    }

   /**
    * Test getCodecIDDescriptionAsLong() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsLong() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDDescriptionAsLong());
        System.out.println("Manual description given by the container AS Long === " + jMetaDataAudio.getCodecIDDescriptionAsLong());
    }

   /**
    * Test getCodecIDDescriptionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDDescriptionAsLocalDateTime());
        System.out.println("Manual description given by the container AS LocalDateTime === " + jMetaDataAudio.getCodecIDDescriptionAsLocalDateTime());
    }

   /**
    * Test getCodecIDDescriptionAsLocalTime() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDDescriptionAsLocalTime());
        System.out.println("Manual description given by the container AS LocalTime === " + jMetaDataAudio.getCodecIDDescriptionAsLocalTime());
    }

   /**
    * Test getCodecIDDescriptionAsString() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsString() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDDescriptionAsString());
        System.out.println("Manual description given by the container AS String === " + jMetaDataAudio.getCodecIDDescriptionAsString());
    }

   /**
    * Test getCodecIDDescriptionAsBoolean() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDDescriptionAsBoolean());
        System.out.println("Manual description given by the container AS Boolean === " + jMetaDataAudio.getCodecIDDescriptionAsBoolean());
    }

   /**
    * Test getCodecIDDescriptionAsBigInteger() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDDescriptionAsBigInteger());
        System.out.println("Manual description given by the container AS BigInteger === " + jMetaDataAudio.getCodecIDDescriptionAsBigInteger());
    }

   /**
    * Test getCodecIDDescriptionAsURL() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsURL() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDDescriptionAsURL());
        System.out.println("Manual description given by the container AS URL === " + jMetaDataAudio.getCodecIDDescriptionAsURL());
    }

   /**
    * Test getStatusAsInteger() method.
    */
    @Test
    public void subTestGetStatusAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getStatusAsInteger());
        System.out.println("bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished) AS Integer === " + jMetaDataAudio.getStatusAsInteger());
    }

   /**
    * Test getStatusAsLong() method.
    */
    @Test
    public void subTestGetStatusAsLong() {
        assertEquals(null, this.jMetaDataAudio.getStatusAsLong());
        System.out.println("bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished) AS Long === " + jMetaDataAudio.getStatusAsLong());
    }

   /**
    * Test getStatusAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStatusAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getStatusAsLocalDateTime());
        System.out.println("bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished) AS LocalDateTime === " + jMetaDataAudio.getStatusAsLocalDateTime());
    }

   /**
    * Test getStatusAsLocalTime() method.
    */
    @Test
    public void subTestGetStatusAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getStatusAsLocalTime());
        System.out.println("bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished) AS LocalTime === " + jMetaDataAudio.getStatusAsLocalTime());
    }

   /**
    * Test getStatusAsString() method.
    */
    @Test
    public void subTestGetStatusAsString() {
        assertEquals(null, this.jMetaDataAudio.getStatusAsString());
        System.out.println("bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished) AS String === " + jMetaDataAudio.getStatusAsString());
    }

   /**
    * Test getStatusAsBoolean() method.
    */
    @Test
    public void subTestGetStatusAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getStatusAsBoolean());
        System.out.println("bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished) AS Boolean === " + jMetaDataAudio.getStatusAsBoolean());
    }

   /**
    * Test getStatusAsBigInteger() method.
    */
    @Test
    public void subTestGetStatusAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getStatusAsBigInteger());
        System.out.println("bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished) AS BigInteger === " + jMetaDataAudio.getStatusAsBigInteger());
    }

   /**
    * Test getStatusAsURL() method.
    */
    @Test
    public void subTestGetStatusAsURL() {
        assertEquals(null, this.jMetaDataAudio.getStatusAsURL());
        System.out.println("bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished) AS URL === " + jMetaDataAudio.getStatusAsURL());
    }

   /**
    * Test getDurationFirstFrameStringAsInteger() method.
    */
    @Test
    public void subTestGetDurationFirstFrameStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameStringAsInteger());
        System.out.println("Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Integer === " + jMetaDataAudio.getDurationFirstFrameStringAsInteger());
    }

   /**
    * Test getDurationFirstFrameStringAsLong() method.
    */
    @Test
    public void subTestGetDurationFirstFrameStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameStringAsLong());
        System.out.println("Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Long === " + jMetaDataAudio.getDurationFirstFrameStringAsLong());
    }

   /**
    * Test getDurationFirstFrameStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationFirstFrameStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameStringAsLocalDateTime());
        System.out.println("Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS LocalDateTime === " + jMetaDataAudio.getDurationFirstFrameStringAsLocalDateTime());
    }

   /**
    * Test getDurationFirstFrameStringAsLocalTime() method.
    */
    @Test
    public void subTestGetDurationFirstFrameStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameStringAsLocalTime());
        System.out.println("Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS LocalTime === " + jMetaDataAudio.getDurationFirstFrameStringAsLocalTime());
    }

   /**
    * Test getDurationFirstFrameStringAsString() method.
    */
    @Test
    public void subTestGetDurationFirstFrameStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameStringAsString());
        System.out.println("Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS String === " + jMetaDataAudio.getDurationFirstFrameStringAsString());
    }

   /**
    * Test getDurationFirstFrameStringAsBoolean() method.
    */
    @Test
    public void subTestGetDurationFirstFrameStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameStringAsBoolean());
        System.out.println("Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Boolean === " + jMetaDataAudio.getDurationFirstFrameStringAsBoolean());
    }

   /**
    * Test getDurationFirstFrameStringAsBigInteger() method.
    */
    @Test
    public void subTestGetDurationFirstFrameStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameStringAsBigInteger());
        System.out.println("Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS BigInteger === " + jMetaDataAudio.getDurationFirstFrameStringAsBigInteger());
    }

   /**
    * Test getDurationFirstFrameStringAsURL() method.
    */
    @Test
    public void subTestGetDurationFirstFrameStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameStringAsURL());
        System.out.println("Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS URL === " + jMetaDataAudio.getDurationFirstFrameStringAsURL());
    }

   /**
    * Test getFrameRateAsInteger() method.
    */
    @Test
    public void subTestGetFrameRateAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getFrameRateAsInteger());
        System.out.println("Frames per second AS Integer === " + jMetaDataAudio.getFrameRateAsInteger());
    }

   /**
    * Test getFrameRateAsLong() method.
    */
    @Test
    public void subTestGetFrameRateAsLong() {
        assertEquals(null, this.jMetaDataAudio.getFrameRateAsLong());
        System.out.println("Frames per second AS Long === " + jMetaDataAudio.getFrameRateAsLong());
    }

   /**
    * Test getFrameRateAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFrameRateAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getFrameRateAsLocalDateTime());
        System.out.println("Frames per second AS LocalDateTime === " + jMetaDataAudio.getFrameRateAsLocalDateTime());
    }

   /**
    * Test getFrameRateAsLocalTime() method.
    */
    @Test
    public void subTestGetFrameRateAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getFrameRateAsLocalTime());
        System.out.println("Frames per second AS LocalTime === " + jMetaDataAudio.getFrameRateAsLocalTime());
    }

   /**
    * Test getFrameRateAsString() method.
    */
    @Test
    public void subTestGetFrameRateAsString() {
        assertEquals(null, this.jMetaDataAudio.getFrameRateAsString());
        System.out.println("Frames per second AS String === " + jMetaDataAudio.getFrameRateAsString());
    }

   /**
    * Test getFrameRateAsBoolean() method.
    */
    @Test
    public void subTestGetFrameRateAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getFrameRateAsBoolean());
        System.out.println("Frames per second AS Boolean === " + jMetaDataAudio.getFrameRateAsBoolean());
    }

   /**
    * Test getFrameRateAsBigInteger() method.
    */
    @Test
    public void subTestGetFrameRateAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getFrameRateAsBigInteger());
        System.out.println("Frames per second AS BigInteger === " + jMetaDataAudio.getFrameRateAsBigInteger());
    }

   /**
    * Test getFrameRateAsURL() method.
    */
    @Test
    public void subTestGetFrameRateAsURL() {
        assertEquals(null, this.jMetaDataAudio.getFrameRateAsURL());
        System.out.println("Frames per second AS URL === " + jMetaDataAudio.getFrameRateAsURL());
    }

   /**
    * Test getServiceKindStringAsInteger() method.
    */
    @Test
    public void subTestGetServiceKindStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getServiceKindStringAsInteger());
        System.out.println("Service kind (full) AS Integer === " + jMetaDataAudio.getServiceKindStringAsInteger());
    }

   /**
    * Test getServiceKindStringAsLong() method.
    */
    @Test
    public void subTestGetServiceKindStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getServiceKindStringAsLong());
        System.out.println("Service kind (full) AS Long === " + jMetaDataAudio.getServiceKindStringAsLong());
    }

   /**
    * Test getServiceKindStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetServiceKindStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getServiceKindStringAsLocalDateTime());
        System.out.println("Service kind (full) AS LocalDateTime === " + jMetaDataAudio.getServiceKindStringAsLocalDateTime());
    }

   /**
    * Test getServiceKindStringAsLocalTime() method.
    */
    @Test
    public void subTestGetServiceKindStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getServiceKindStringAsLocalTime());
        System.out.println("Service kind (full) AS LocalTime === " + jMetaDataAudio.getServiceKindStringAsLocalTime());
    }

   /**
    * Test getServiceKindStringAsString() method.
    */
    @Test
    public void subTestGetServiceKindStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getServiceKindStringAsString());
        System.out.println("Service kind (full) AS String === " + jMetaDataAudio.getServiceKindStringAsString());
    }

   /**
    * Test getServiceKindStringAsBoolean() method.
    */
    @Test
    public void subTestGetServiceKindStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getServiceKindStringAsBoolean());
        System.out.println("Service kind (full) AS Boolean === " + jMetaDataAudio.getServiceKindStringAsBoolean());
    }

   /**
    * Test getServiceKindStringAsBigInteger() method.
    */
    @Test
    public void subTestGetServiceKindStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getServiceKindStringAsBigInteger());
        System.out.println("Service kind (full) AS BigInteger === " + jMetaDataAudio.getServiceKindStringAsBigInteger());
    }

   /**
    * Test getServiceKindStringAsURL() method.
    */
    @Test
    public void subTestGetServiceKindStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getServiceKindStringAsURL());
        System.out.println("Service kind (full) AS URL === " + jMetaDataAudio.getServiceKindStringAsURL());
    }

   /**
    * Test getMuxingModeAsInteger() method.
    */
    @Test
    public void subTestGetMuxingModeAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getMuxingModeAsInteger());
        System.out.println("How this stream is muxed in the container AS Integer === " + jMetaDataAudio.getMuxingModeAsInteger());
    }

   /**
    * Test getMuxingModeAsLong() method.
    */
    @Test
    public void subTestGetMuxingModeAsLong() {
        assertEquals(null, this.jMetaDataAudio.getMuxingModeAsLong());
        System.out.println("How this stream is muxed in the container AS Long === " + jMetaDataAudio.getMuxingModeAsLong());
    }

   /**
    * Test getMuxingModeAsLocalDateTime() method.
    */
    @Test
    public void subTestGetMuxingModeAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getMuxingModeAsLocalDateTime());
        System.out.println("How this stream is muxed in the container AS LocalDateTime === " + jMetaDataAudio.getMuxingModeAsLocalDateTime());
    }

   /**
    * Test getMuxingModeAsLocalTime() method.
    */
    @Test
    public void subTestGetMuxingModeAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getMuxingModeAsLocalTime());
        System.out.println("How this stream is muxed in the container AS LocalTime === " + jMetaDataAudio.getMuxingModeAsLocalTime());
    }

   /**
    * Test getMuxingModeAsString() method.
    */
    @Test
    public void subTestGetMuxingModeAsString() {
        assertEquals(null, this.jMetaDataAudio.getMuxingModeAsString());
        System.out.println("How this stream is muxed in the container AS String === " + jMetaDataAudio.getMuxingModeAsString());
    }

   /**
    * Test getMuxingModeAsBoolean() method.
    */
    @Test
    public void subTestGetMuxingModeAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getMuxingModeAsBoolean());
        System.out.println("How this stream is muxed in the container AS Boolean === " + jMetaDataAudio.getMuxingModeAsBoolean());
    }

   /**
    * Test getMuxingModeAsBigInteger() method.
    */
    @Test
    public void subTestGetMuxingModeAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getMuxingModeAsBigInteger());
        System.out.println("How this stream is muxed in the container AS BigInteger === " + jMetaDataAudio.getMuxingModeAsBigInteger());
    }

   /**
    * Test getMuxingModeAsURL() method.
    */
    @Test
    public void subTestGetMuxingModeAsURL() {
        assertEquals(null, this.jMetaDataAudio.getMuxingModeAsURL());
        System.out.println("How this stream is muxed in the container AS URL === " + jMetaDataAudio.getMuxingModeAsURL());
    }

   /**
    * Test getDelaySettingsAsInteger() method.
    */
    @Test
    public void subTestGetDelaySettingsAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDelaySettingsAsInteger());
        System.out.println("Delay settings (in case of timecode for example) AS Integer === " + jMetaDataAudio.getDelaySettingsAsInteger());
    }

   /**
    * Test getDelaySettingsAsLong() method.
    */
    @Test
    public void subTestGetDelaySettingsAsLong() {
        assertEquals(null, this.jMetaDataAudio.getDelaySettingsAsLong());
        System.out.println("Delay settings (in case of timecode for example) AS Long === " + jMetaDataAudio.getDelaySettingsAsLong());
    }

   /**
    * Test getDelaySettingsAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelaySettingsAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDelaySettingsAsLocalDateTime());
        System.out.println("Delay settings (in case of timecode for example) AS LocalDateTime === " + jMetaDataAudio.getDelaySettingsAsLocalDateTime());
    }

   /**
    * Test getDelaySettingsAsLocalTime() method.
    */
    @Test
    public void subTestGetDelaySettingsAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDelaySettingsAsLocalTime());
        System.out.println("Delay settings (in case of timecode for example) AS LocalTime === " + jMetaDataAudio.getDelaySettingsAsLocalTime());
    }

   /**
    * Test getDelaySettingsAsString() method.
    */
    @Test
    public void subTestGetDelaySettingsAsString() {
        assertEquals(null, this.jMetaDataAudio.getDelaySettingsAsString());
        System.out.println("Delay settings (in case of timecode for example) AS String === " + jMetaDataAudio.getDelaySettingsAsString());
    }

   /**
    * Test getDelaySettingsAsBoolean() method.
    */
    @Test
    public void subTestGetDelaySettingsAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDelaySettingsAsBoolean());
        System.out.println("Delay settings (in case of timecode for example) AS Boolean === " + jMetaDataAudio.getDelaySettingsAsBoolean());
    }

   /**
    * Test getDelaySettingsAsBigInteger() method.
    */
    @Test
    public void subTestGetDelaySettingsAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDelaySettingsAsBigInteger());
        System.out.println("Delay settings (in case of timecode for example) AS BigInteger === " + jMetaDataAudio.getDelaySettingsAsBigInteger());
    }

   /**
    * Test getDelaySettingsAsURL() method.
    */
    @Test
    public void subTestGetDelaySettingsAsURL() {
        assertEquals(null, this.jMetaDataAudio.getDelaySettingsAsURL());
        System.out.println("Delay settings (in case of timecode for example) AS URL === " + jMetaDataAudio.getDelaySettingsAsURL());
    }

   /**
    * Test getSourceStreamSizeEncodedAsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedAsInteger());
        System.out.println("Source Encoded Streamsize in bytes AS Integer === " + jMetaDataAudio.getSourceStreamSizeEncodedAsInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedAsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsLong() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedAsLong());
        System.out.println("Source Encoded Streamsize in bytes AS Long === " + jMetaDataAudio.getSourceStreamSizeEncodedAsLong());
    }

   /**
    * Test getSourceStreamSizeEncodedAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedAsLocalDateTime());
        System.out.println("Source Encoded Streamsize in bytes AS LocalDateTime === " + jMetaDataAudio.getSourceStreamSizeEncodedAsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeEncodedAsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedAsLocalTime());
        System.out.println("Source Encoded Streamsize in bytes AS LocalTime === " + jMetaDataAudio.getSourceStreamSizeEncodedAsLocalTime());
    }

   /**
    * Test getSourceStreamSizeEncodedAsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsString() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedAsString());
        System.out.println("Source Encoded Streamsize in bytes AS String === " + jMetaDataAudio.getSourceStreamSizeEncodedAsString());
    }

   /**
    * Test getSourceStreamSizeEncodedAsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedAsBoolean());
        System.out.println("Source Encoded Streamsize in bytes AS Boolean === " + jMetaDataAudio.getSourceStreamSizeEncodedAsBoolean());
    }

   /**
    * Test getSourceStreamSizeEncodedAsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedAsBigInteger());
        System.out.println("Source Encoded Streamsize in bytes AS BigInteger === " + jMetaDataAudio.getSourceStreamSizeEncodedAsBigInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedAsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsURL() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedAsURL());
        System.out.println("Source Encoded Streamsize in bytes AS URL === " + jMetaDataAudio.getSourceStreamSizeEncodedAsURL());
    }

   /**
    * Test getFormatSettingsITUAsInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsITUAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsITUAsInteger());
        System.out.println("Format_Settings_ITU AS Integer === " + jMetaDataAudio.getFormatSettingsITUAsInteger());
    }

   /**
    * Test getFormatSettingsITUAsLong() method.
    */
    @Test
    public void subTestGetFormatSettingsITUAsLong() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsITUAsLong());
        System.out.println("Format_Settings_ITU AS Long === " + jMetaDataAudio.getFormatSettingsITUAsLong());
    }

   /**
    * Test getFormatSettingsITUAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatSettingsITUAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsITUAsLocalDateTime());
        System.out.println("Format_Settings_ITU AS LocalDateTime === " + jMetaDataAudio.getFormatSettingsITUAsLocalDateTime());
    }

   /**
    * Test getFormatSettingsITUAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatSettingsITUAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsITUAsLocalTime());
        System.out.println("Format_Settings_ITU AS LocalTime === " + jMetaDataAudio.getFormatSettingsITUAsLocalTime());
    }

   /**
    * Test getFormatSettingsITUAsString() method.
    */
    @Test
    public void subTestGetFormatSettingsITUAsString() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsITUAsString());
        System.out.println("Format_Settings_ITU AS String === " + jMetaDataAudio.getFormatSettingsITUAsString());
    }

   /**
    * Test getFormatSettingsITUAsBoolean() method.
    */
    @Test
    public void subTestGetFormatSettingsITUAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsITUAsBoolean());
        System.out.println("Format_Settings_ITU AS Boolean === " + jMetaDataAudio.getFormatSettingsITUAsBoolean());
    }

   /**
    * Test getFormatSettingsITUAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsITUAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsITUAsBigInteger());
        System.out.println("Format_Settings_ITU AS BigInteger === " + jMetaDataAudio.getFormatSettingsITUAsBigInteger());
    }

   /**
    * Test getFormatSettingsITUAsURL() method.
    */
    @Test
    public void subTestGetFormatSettingsITUAsURL() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsITUAsURL());
        System.out.println("Format_Settings_ITU AS URL === " + jMetaDataAudio.getFormatSettingsITUAsURL());
    }

   /**
    * Test getChannelsOriginalStringAsInteger() method.
    */
    @Test
    public void subTestGetChannelsOriginalStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getChannelsOriginalStringAsInteger());
        System.out.println("Number of channels (with measurement) AS Integer === " + jMetaDataAudio.getChannelsOriginalStringAsInteger());
    }

   /**
    * Test getChannelsOriginalStringAsLong() method.
    */
    @Test
    public void subTestGetChannelsOriginalStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getChannelsOriginalStringAsLong());
        System.out.println("Number of channels (with measurement) AS Long === " + jMetaDataAudio.getChannelsOriginalStringAsLong());
    }

   /**
    * Test getChannelsOriginalStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetChannelsOriginalStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getChannelsOriginalStringAsLocalDateTime());
        System.out.println("Number of channels (with measurement) AS LocalDateTime === " + jMetaDataAudio.getChannelsOriginalStringAsLocalDateTime());
    }

   /**
    * Test getChannelsOriginalStringAsLocalTime() method.
    */
    @Test
    public void subTestGetChannelsOriginalStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getChannelsOriginalStringAsLocalTime());
        System.out.println("Number of channels (with measurement) AS LocalTime === " + jMetaDataAudio.getChannelsOriginalStringAsLocalTime());
    }

   /**
    * Test getChannelsOriginalStringAsString() method.
    */
    @Test
    public void subTestGetChannelsOriginalStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getChannelsOriginalStringAsString());
        System.out.println("Number of channels (with measurement) AS String === " + jMetaDataAudio.getChannelsOriginalStringAsString());
    }

   /**
    * Test getChannelsOriginalStringAsBoolean() method.
    */
    @Test
    public void subTestGetChannelsOriginalStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getChannelsOriginalStringAsBoolean());
        System.out.println("Number of channels (with measurement) AS Boolean === " + jMetaDataAudio.getChannelsOriginalStringAsBoolean());
    }

   /**
    * Test getChannelsOriginalStringAsBigInteger() method.
    */
    @Test
    public void subTestGetChannelsOriginalStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getChannelsOriginalStringAsBigInteger());
        System.out.println("Number of channels (with measurement) AS BigInteger === " + jMetaDataAudio.getChannelsOriginalStringAsBigInteger());
    }

   /**
    * Test getChannelsOriginalStringAsURL() method.
    */
    @Test
    public void subTestGetChannelsOriginalStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getChannelsOriginalStringAsURL());
        System.out.println("Number of channels (with measurement) AS URL === " + jMetaDataAudio.getChannelsOriginalStringAsURL());
    }

   /**
    * Test getFormatSettingsModeExtensionAsInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsModeExtensionAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsModeExtensionAsInteger());
        System.out.println("Format_Settings_ModeExtension AS Integer === " + jMetaDataAudio.getFormatSettingsModeExtensionAsInteger());
    }

   /**
    * Test getFormatSettingsModeExtensionAsLong() method.
    */
    @Test
    public void subTestGetFormatSettingsModeExtensionAsLong() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsModeExtensionAsLong());
        System.out.println("Format_Settings_ModeExtension AS Long === " + jMetaDataAudio.getFormatSettingsModeExtensionAsLong());
    }

   /**
    * Test getFormatSettingsModeExtensionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatSettingsModeExtensionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsModeExtensionAsLocalDateTime());
        System.out.println("Format_Settings_ModeExtension AS LocalDateTime === " + jMetaDataAudio.getFormatSettingsModeExtensionAsLocalDateTime());
    }

   /**
    * Test getFormatSettingsModeExtensionAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatSettingsModeExtensionAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsModeExtensionAsLocalTime());
        System.out.println("Format_Settings_ModeExtension AS LocalTime === " + jMetaDataAudio.getFormatSettingsModeExtensionAsLocalTime());
    }

   /**
    * Test getFormatSettingsModeExtensionAsString() method.
    */
    @Test
    public void subTestGetFormatSettingsModeExtensionAsString() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsModeExtensionAsString());
        System.out.println("Format_Settings_ModeExtension AS String === " + jMetaDataAudio.getFormatSettingsModeExtensionAsString());
    }

   /**
    * Test getFormatSettingsModeExtensionAsBoolean() method.
    */
    @Test
    public void subTestGetFormatSettingsModeExtensionAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsModeExtensionAsBoolean());
        System.out.println("Format_Settings_ModeExtension AS Boolean === " + jMetaDataAudio.getFormatSettingsModeExtensionAsBoolean());
    }

   /**
    * Test getFormatSettingsModeExtensionAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsModeExtensionAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsModeExtensionAsBigInteger());
        System.out.println("Format_Settings_ModeExtension AS BigInteger === " + jMetaDataAudio.getFormatSettingsModeExtensionAsBigInteger());
    }

   /**
    * Test getFormatSettingsModeExtensionAsURL() method.
    */
    @Test
    public void subTestGetFormatSettingsModeExtensionAsURL() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsModeExtensionAsURL());
        System.out.println("Format_Settings_ModeExtension AS URL === " + jMetaDataAudio.getFormatSettingsModeExtensionAsURL());
    }

   /**
    * Test getFormatSettingsFirmAsInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsFirmAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsFirmAsInteger());
        System.out.println("Format_Settings_Firm AS Integer === " + jMetaDataAudio.getFormatSettingsFirmAsInteger());
    }

   /**
    * Test getFormatSettingsFirmAsLong() method.
    */
    @Test
    public void subTestGetFormatSettingsFirmAsLong() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsFirmAsLong());
        System.out.println("Format_Settings_Firm AS Long === " + jMetaDataAudio.getFormatSettingsFirmAsLong());
    }

   /**
    * Test getFormatSettingsFirmAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatSettingsFirmAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsFirmAsLocalDateTime());
        System.out.println("Format_Settings_Firm AS LocalDateTime === " + jMetaDataAudio.getFormatSettingsFirmAsLocalDateTime());
    }

   /**
    * Test getFormatSettingsFirmAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatSettingsFirmAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsFirmAsLocalTime());
        System.out.println("Format_Settings_Firm AS LocalTime === " + jMetaDataAudio.getFormatSettingsFirmAsLocalTime());
    }

   /**
    * Test getFormatSettingsFirmAsString() method.
    */
    @Test
    public void subTestGetFormatSettingsFirmAsString() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsFirmAsString());
        System.out.println("Format_Settings_Firm AS String === " + jMetaDataAudio.getFormatSettingsFirmAsString());
    }

   /**
    * Test getFormatSettingsFirmAsBoolean() method.
    */
    @Test
    public void subTestGetFormatSettingsFirmAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsFirmAsBoolean());
        System.out.println("Format_Settings_Firm AS Boolean === " + jMetaDataAudio.getFormatSettingsFirmAsBoolean());
    }

   /**
    * Test getFormatSettingsFirmAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsFirmAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsFirmAsBigInteger());
        System.out.println("Format_Settings_Firm AS BigInteger === " + jMetaDataAudio.getFormatSettingsFirmAsBigInteger());
    }

   /**
    * Test getFormatSettingsFirmAsURL() method.
    */
    @Test
    public void subTestGetFormatSettingsFirmAsURL() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsFirmAsURL());
        System.out.println("Format_Settings_Firm AS URL === " + jMetaDataAudio.getFormatSettingsFirmAsURL());
    }

   /**
    * Test getBitRateModeStringAsInteger() method.
    */
    @Test
    public void subTestGetBitRateModeStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getBitRateModeStringAsInteger());
        System.out.println("Bit rate mode (Constant, Variable) AS Integer === " + jMetaDataAudio.getBitRateModeStringAsInteger());
    }

   /**
    * Test getBitRateModeStringAsLong() method.
    */
    @Test
    public void subTestGetBitRateModeStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getBitRateModeStringAsLong());
        System.out.println("Bit rate mode (Constant, Variable) AS Long === " + jMetaDataAudio.getBitRateModeStringAsLong());
    }

   /**
    * Test getBitRateModeStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitRateModeStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getBitRateModeStringAsLocalDateTime());
        System.out.println("Bit rate mode (Constant, Variable) AS LocalDateTime === " + jMetaDataAudio.getBitRateModeStringAsLocalDateTime());
    }

   /**
    * Test getBitRateModeStringAsLocalTime() method.
    */
    @Test
    public void subTestGetBitRateModeStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getBitRateModeStringAsLocalTime());
        System.out.println("Bit rate mode (Constant, Variable) AS LocalTime === " + jMetaDataAudio.getBitRateModeStringAsLocalTime());
    }

   /**
    * Test getBitRateModeStringAsString() method.
    */
    @Test
    public void subTestGetBitRateModeStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getBitRateModeStringAsString());
        System.out.println("Bit rate mode (Constant, Variable) AS String === " + jMetaDataAudio.getBitRateModeStringAsString());
    }

   /**
    * Test getBitRateModeStringAsBoolean() method.
    */
    @Test
    public void subTestGetBitRateModeStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getBitRateModeStringAsBoolean());
        System.out.println("Bit rate mode (Constant, Variable) AS Boolean === " + jMetaDataAudio.getBitRateModeStringAsBoolean());
    }

   /**
    * Test getBitRateModeStringAsBigInteger() method.
    */
    @Test
    public void subTestGetBitRateModeStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getBitRateModeStringAsBigInteger());
        System.out.println("Bit rate mode (Constant, Variable) AS BigInteger === " + jMetaDataAudio.getBitRateModeStringAsBigInteger());
    }

   /**
    * Test getBitRateModeStringAsURL() method.
    */
    @Test
    public void subTestGetBitRateModeStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getBitRateModeStringAsURL());
        System.out.println("Bit rate mode (Constant, Variable) AS URL === " + jMetaDataAudio.getBitRateModeStringAsURL());
    }

   /**
    * Test getReplayGainPeakAsInteger() method.
    */
    @Test
    public void subTestGetReplayGainPeakAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getReplayGainPeakAsInteger());
        System.out.println("The maximum absolute peak value of the item AS Integer === " + jMetaDataAudio.getReplayGainPeakAsInteger());
    }

   /**
    * Test getReplayGainPeakAsLong() method.
    */
    @Test
    public void subTestGetReplayGainPeakAsLong() {
        assertEquals(null, this.jMetaDataAudio.getReplayGainPeakAsLong());
        System.out.println("The maximum absolute peak value of the item AS Long === " + jMetaDataAudio.getReplayGainPeakAsLong());
    }

   /**
    * Test getReplayGainPeakAsLocalDateTime() method.
    */
    @Test
    public void subTestGetReplayGainPeakAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getReplayGainPeakAsLocalDateTime());
        System.out.println("The maximum absolute peak value of the item AS LocalDateTime === " + jMetaDataAudio.getReplayGainPeakAsLocalDateTime());
    }

   /**
    * Test getReplayGainPeakAsLocalTime() method.
    */
    @Test
    public void subTestGetReplayGainPeakAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getReplayGainPeakAsLocalTime());
        System.out.println("The maximum absolute peak value of the item AS LocalTime === " + jMetaDataAudio.getReplayGainPeakAsLocalTime());
    }

   /**
    * Test getReplayGainPeakAsString() method.
    */
    @Test
    public void subTestGetReplayGainPeakAsString() {
        assertEquals(null, this.jMetaDataAudio.getReplayGainPeakAsString());
        System.out.println("The maximum absolute peak value of the item AS String === " + jMetaDataAudio.getReplayGainPeakAsString());
    }

   /**
    * Test getReplayGainPeakAsBoolean() method.
    */
    @Test
    public void subTestGetReplayGainPeakAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getReplayGainPeakAsBoolean());
        System.out.println("The maximum absolute peak value of the item AS Boolean === " + jMetaDataAudio.getReplayGainPeakAsBoolean());
    }

   /**
    * Test getReplayGainPeakAsBigInteger() method.
    */
    @Test
    public void subTestGetReplayGainPeakAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getReplayGainPeakAsBigInteger());
        System.out.println("The maximum absolute peak value of the item AS BigInteger === " + jMetaDataAudio.getReplayGainPeakAsBigInteger());
    }

   /**
    * Test getReplayGainPeakAsURL() method.
    */
    @Test
    public void subTestGetReplayGainPeakAsURL() {
        assertEquals(null, this.jMetaDataAudio.getReplayGainPeakAsURL());
        System.out.println("The maximum absolute peak value of the item AS URL === " + jMetaDataAudio.getReplayGainPeakAsURL());
    }

   /**
    * Test getChannelLayoutIDAsInteger() method.
    */
    @Test
    public void subTestGetChannelLayoutIDAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getChannelLayoutIDAsInteger());
        System.out.println("ID of layout of channels (e.g. MXF descriptor channel assignment). Warning, sometimes this is not enough for uniquely identifying a layout (e.g. MXF descriptor channel assignment is SMPTE 377-4). For AC-3, the form is x,y with x=acmod and y=lfeon. AS Integer === " + jMetaDataAudio.getChannelLayoutIDAsInteger());
    }

   /**
    * Test getChannelLayoutIDAsLong() method.
    */
    @Test
    public void subTestGetChannelLayoutIDAsLong() {
        assertEquals(null, this.jMetaDataAudio.getChannelLayoutIDAsLong());
        System.out.println("ID of layout of channels (e.g. MXF descriptor channel assignment). Warning, sometimes this is not enough for uniquely identifying a layout (e.g. MXF descriptor channel assignment is SMPTE 377-4). For AC-3, the form is x,y with x=acmod and y=lfeon. AS Long === " + jMetaDataAudio.getChannelLayoutIDAsLong());
    }

   /**
    * Test getChannelLayoutIDAsLocalDateTime() method.
    */
    @Test
    public void subTestGetChannelLayoutIDAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getChannelLayoutIDAsLocalDateTime());
        System.out.println("ID of layout of channels (e.g. MXF descriptor channel assignment). Warning, sometimes this is not enough for uniquely identifying a layout (e.g. MXF descriptor channel assignment is SMPTE 377-4). For AC-3, the form is x,y with x=acmod and y=lfeon. AS LocalDateTime === " + jMetaDataAudio.getChannelLayoutIDAsLocalDateTime());
    }

   /**
    * Test getChannelLayoutIDAsLocalTime() method.
    */
    @Test
    public void subTestGetChannelLayoutIDAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getChannelLayoutIDAsLocalTime());
        System.out.println("ID of layout of channels (e.g. MXF descriptor channel assignment). Warning, sometimes this is not enough for uniquely identifying a layout (e.g. MXF descriptor channel assignment is SMPTE 377-4). For AC-3, the form is x,y with x=acmod and y=lfeon. AS LocalTime === " + jMetaDataAudio.getChannelLayoutIDAsLocalTime());
    }

   /**
    * Test getChannelLayoutIDAsString() method.
    */
    @Test
    public void subTestGetChannelLayoutIDAsString() {
        assertEquals(null, this.jMetaDataAudio.getChannelLayoutIDAsString());
        System.out.println("ID of layout of channels (e.g. MXF descriptor channel assignment). Warning, sometimes this is not enough for uniquely identifying a layout (e.g. MXF descriptor channel assignment is SMPTE 377-4). For AC-3, the form is x,y with x=acmod and y=lfeon. AS String === " + jMetaDataAudio.getChannelLayoutIDAsString());
    }

   /**
    * Test getChannelLayoutIDAsBoolean() method.
    */
    @Test
    public void subTestGetChannelLayoutIDAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getChannelLayoutIDAsBoolean());
        System.out.println("ID of layout of channels (e.g. MXF descriptor channel assignment). Warning, sometimes this is not enough for uniquely identifying a layout (e.g. MXF descriptor channel assignment is SMPTE 377-4). For AC-3, the form is x,y with x=acmod and y=lfeon. AS Boolean === " + jMetaDataAudio.getChannelLayoutIDAsBoolean());
    }

   /**
    * Test getChannelLayoutIDAsBigInteger() method.
    */
    @Test
    public void subTestGetChannelLayoutIDAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getChannelLayoutIDAsBigInteger());
        System.out.println("ID of layout of channels (e.g. MXF descriptor channel assignment). Warning, sometimes this is not enough for uniquely identifying a layout (e.g. MXF descriptor channel assignment is SMPTE 377-4). For AC-3, the form is x,y with x=acmod and y=lfeon. AS BigInteger === " + jMetaDataAudio.getChannelLayoutIDAsBigInteger());
    }

   /**
    * Test getChannelLayoutIDAsURL() method.
    */
    @Test
    public void subTestGetChannelLayoutIDAsURL() {
        assertEquals(null, this.jMetaDataAudio.getChannelLayoutIDAsURL());
        System.out.println("ID of layout of channels (e.g. MXF descriptor channel assignment). Warning, sometimes this is not enough for uniquely identifying a layout (e.g. MXF descriptor channel assignment is SMPTE 377-4). For AC-3, the form is x,y with x=acmod and y=lfeon. AS URL === " + jMetaDataAudio.getChannelLayoutIDAsURL());
    }

   /**
    * Test getSourceSamplingCountAsInteger() method.
    */
    @Test
    public void subTestGetSourceSamplingCountAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceSamplingCountAsInteger());
        System.out.println("Source Sample count (based on sampling rate) AS Integer === " + jMetaDataAudio.getSourceSamplingCountAsInteger());
    }

   /**
    * Test getSourceSamplingCountAsLong() method.
    */
    @Test
    public void subTestGetSourceSamplingCountAsLong() {
        assertEquals(null, this.jMetaDataAudio.getSourceSamplingCountAsLong());
        System.out.println("Source Sample count (based on sampling rate) AS Long === " + jMetaDataAudio.getSourceSamplingCountAsLong());
    }

   /**
    * Test getSourceSamplingCountAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceSamplingCountAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceSamplingCountAsLocalDateTime());
        System.out.println("Source Sample count (based on sampling rate) AS LocalDateTime === " + jMetaDataAudio.getSourceSamplingCountAsLocalDateTime());
    }

   /**
    * Test getSourceSamplingCountAsLocalTime() method.
    */
    @Test
    public void subTestGetSourceSamplingCountAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceSamplingCountAsLocalTime());
        System.out.println("Source Sample count (based on sampling rate) AS LocalTime === " + jMetaDataAudio.getSourceSamplingCountAsLocalTime());
    }

   /**
    * Test getSourceSamplingCountAsString() method.
    */
    @Test
    public void subTestGetSourceSamplingCountAsString() {
        assertEquals(null, this.jMetaDataAudio.getSourceSamplingCountAsString());
        System.out.println("Source Sample count (based on sampling rate) AS String === " + jMetaDataAudio.getSourceSamplingCountAsString());
    }

   /**
    * Test getSourceSamplingCountAsBoolean() method.
    */
    @Test
    public void subTestGetSourceSamplingCountAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getSourceSamplingCountAsBoolean());
        System.out.println("Source Sample count (based on sampling rate) AS Boolean === " + jMetaDataAudio.getSourceSamplingCountAsBoolean());
    }

   /**
    * Test getSourceSamplingCountAsBigInteger() method.
    */
    @Test
    public void subTestGetSourceSamplingCountAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceSamplingCountAsBigInteger());
        System.out.println("Source Sample count (based on sampling rate) AS BigInteger === " + jMetaDataAudio.getSourceSamplingCountAsBigInteger());
    }

   /**
    * Test getSourceSamplingCountAsURL() method.
    */
    @Test
    public void subTestGetSourceSamplingCountAsURL() {
        assertEquals(null, this.jMetaDataAudio.getSourceSamplingCountAsURL());
        System.out.println("Source Sample count (based on sampling rate) AS URL === " + jMetaDataAudio.getSourceSamplingCountAsURL());
    }

   /**
    * Test getEncodedLibraryVersionAsInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryVersionAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryVersionAsInteger());
        System.out.println("Version of encoding-software AS Integer === " + jMetaDataAudio.getEncodedLibraryVersionAsInteger());
    }

   /**
    * Test getEncodedLibraryVersionAsLong() method.
    */
    @Test
    public void subTestGetEncodedLibraryVersionAsLong() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryVersionAsLong());
        System.out.println("Version of encoding-software AS Long === " + jMetaDataAudio.getEncodedLibraryVersionAsLong());
    }

   /**
    * Test getEncodedLibraryVersionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryVersionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryVersionAsLocalDateTime());
        System.out.println("Version of encoding-software AS LocalDateTime === " + jMetaDataAudio.getEncodedLibraryVersionAsLocalDateTime());
    }

   /**
    * Test getEncodedLibraryVersionAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryVersionAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryVersionAsLocalTime());
        System.out.println("Version of encoding-software AS LocalTime === " + jMetaDataAudio.getEncodedLibraryVersionAsLocalTime());
    }

   /**
    * Test getEncodedLibraryVersionAsString() method.
    */
    @Test
    public void subTestGetEncodedLibraryVersionAsString() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryVersionAsString());
        System.out.println("Version of encoding-software AS String === " + jMetaDataAudio.getEncodedLibraryVersionAsString());
    }

   /**
    * Test getEncodedLibraryVersionAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedLibraryVersionAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryVersionAsBoolean());
        System.out.println("Version of encoding-software AS Boolean === " + jMetaDataAudio.getEncodedLibraryVersionAsBoolean());
    }

   /**
    * Test getEncodedLibraryVersionAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryVersionAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryVersionAsBigInteger());
        System.out.println("Version of encoding-software AS BigInteger === " + jMetaDataAudio.getEncodedLibraryVersionAsBigInteger());
    }

   /**
    * Test getEncodedLibraryVersionAsURL() method.
    */
    @Test
    public void subTestGetEncodedLibraryVersionAsURL() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryVersionAsURL());
        System.out.println("Version of encoding-software AS URL === " + jMetaDataAudio.getEncodedLibraryVersionAsURL());
    }

   /**
    * Test getSamplingCountAsInteger() method.
    */
    @Test
    public void subTestGetSamplingCountAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getSamplingCountAsInteger());
        System.out.println("Sample count (based on sampling rate) AS Integer === " + jMetaDataAudio.getSamplingCountAsInteger());
    }

   /**
    * Test getSamplingCountAsLong() method.
    */
    @Test
    public void subTestGetSamplingCountAsLong() {
        assertEquals(null, this.jMetaDataAudio.getSamplingCountAsLong());
        System.out.println("Sample count (based on sampling rate) AS Long === " + jMetaDataAudio.getSamplingCountAsLong());
    }

   /**
    * Test getSamplingCountAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSamplingCountAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getSamplingCountAsLocalDateTime());
        System.out.println("Sample count (based on sampling rate) AS LocalDateTime === " + jMetaDataAudio.getSamplingCountAsLocalDateTime());
    }

   /**
    * Test getSamplingCountAsLocalTime() method.
    */
    @Test
    public void subTestGetSamplingCountAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getSamplingCountAsLocalTime());
        System.out.println("Sample count (based on sampling rate) AS LocalTime === " + jMetaDataAudio.getSamplingCountAsLocalTime());
    }

   /**
    * Test getSamplingCountAsString() method.
    */
    @Test
    public void subTestGetSamplingCountAsString() {
        assertEquals(null, this.jMetaDataAudio.getSamplingCountAsString());
        System.out.println("Sample count (based on sampling rate) AS String === " + jMetaDataAudio.getSamplingCountAsString());
    }

   /**
    * Test getSamplingCountAsBoolean() method.
    */
    @Test
    public void subTestGetSamplingCountAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getSamplingCountAsBoolean());
        System.out.println("Sample count (based on sampling rate) AS Boolean === " + jMetaDataAudio.getSamplingCountAsBoolean());
    }

   /**
    * Test getSamplingCountAsBigInteger() method.
    */
    @Test
    public void subTestGetSamplingCountAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getSamplingCountAsBigInteger());
        System.out.println("Sample count (based on sampling rate) AS BigInteger === " + jMetaDataAudio.getSamplingCountAsBigInteger());
    }

   /**
    * Test getSamplingCountAsURL() method.
    */
    @Test
    public void subTestGetSamplingCountAsURL() {
        assertEquals(null, this.jMetaDataAudio.getSamplingCountAsURL());
        System.out.println("Sample count (based on sampling rate) AS URL === " + jMetaDataAudio.getSamplingCountAsURL());
    }

   /**
    * Test getSourceDurationLastFrameStringAsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameStringAsInteger());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Integer === " + jMetaDataAudio.getSourceDurationLastFrameStringAsInteger());
    }

   /**
    * Test getSourceDurationLastFrameStringAsLong() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameStringAsLong());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Long === " + jMetaDataAudio.getSourceDurationLastFrameStringAsLong());
    }

   /**
    * Test getSourceDurationLastFrameStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameStringAsLocalDateTime());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS LocalDateTime === " + jMetaDataAudio.getSourceDurationLastFrameStringAsLocalDateTime());
    }

   /**
    * Test getSourceDurationLastFrameStringAsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameStringAsLocalTime());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS LocalTime === " + jMetaDataAudio.getSourceDurationLastFrameStringAsLocalTime());
    }

   /**
    * Test getSourceDurationLastFrameStringAsString() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameStringAsString());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS String === " + jMetaDataAudio.getSourceDurationLastFrameStringAsString());
    }

   /**
    * Test getSourceDurationLastFrameStringAsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameStringAsBoolean());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Boolean === " + jMetaDataAudio.getSourceDurationLastFrameStringAsBoolean());
    }

   /**
    * Test getSourceDurationLastFrameStringAsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameStringAsBigInteger());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS BigInteger === " + jMetaDataAudio.getSourceDurationLastFrameStringAsBigInteger());
    }

   /**
    * Test getSourceDurationLastFrameStringAsURL() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameStringAsURL());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS URL === " + jMetaDataAudio.getSourceDurationLastFrameStringAsURL());
    }

   /**
    * Test getCodecIDInfoAsInteger() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDInfoAsInteger());
        System.out.println("Info about codec ID AS Integer === " + jMetaDataAudio.getCodecIDInfoAsInteger());
    }

   /**
    * Test getCodecIDInfoAsLong() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsLong() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDInfoAsLong());
        System.out.println("Info about codec ID AS Long === " + jMetaDataAudio.getCodecIDInfoAsLong());
    }

   /**
    * Test getCodecIDInfoAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDInfoAsLocalDateTime());
        System.out.println("Info about codec ID AS LocalDateTime === " + jMetaDataAudio.getCodecIDInfoAsLocalDateTime());
    }

   /**
    * Test getCodecIDInfoAsLocalTime() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDInfoAsLocalTime());
        System.out.println("Info about codec ID AS LocalTime === " + jMetaDataAudio.getCodecIDInfoAsLocalTime());
    }

   /**
    * Test getCodecIDInfoAsString() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsString() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDInfoAsString());
        System.out.println("Info about codec ID AS String === " + jMetaDataAudio.getCodecIDInfoAsString());
    }

   /**
    * Test getCodecIDInfoAsBoolean() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDInfoAsBoolean());
        System.out.println("Info about codec ID AS Boolean === " + jMetaDataAudio.getCodecIDInfoAsBoolean());
    }

   /**
    * Test getCodecIDInfoAsBigInteger() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDInfoAsBigInteger());
        System.out.println("Info about codec ID AS BigInteger === " + jMetaDataAudio.getCodecIDInfoAsBigInteger());
    }

   /**
    * Test getCodecIDInfoAsURL() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsURL() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDInfoAsURL());
        System.out.println("Info about codec ID AS URL === " + jMetaDataAudio.getCodecIDInfoAsURL());
    }

   /**
    * Test getStreamSizeAsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeAsInteger());
        System.out.println("Streamsize in bytes AS Integer === " + jMetaDataAudio.getStreamSizeAsInteger());
    }

   /**
    * Test getStreamSizeAsLong() method.
    */
    @Test
    public void subTestGetStreamSizeAsLong() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeAsLong());
        System.out.println("Streamsize in bytes AS Long === " + jMetaDataAudio.getStreamSizeAsLong());
    }

   /**
    * Test getStreamSizeAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeAsLocalDateTime());
        System.out.println("Streamsize in bytes AS LocalDateTime === " + jMetaDataAudio.getStreamSizeAsLocalDateTime());
    }

   /**
    * Test getStreamSizeAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeAsLocalTime());
        System.out.println("Streamsize in bytes AS LocalTime === " + jMetaDataAudio.getStreamSizeAsLocalTime());
    }

   /**
    * Test getStreamSizeAsString() method.
    */
    @Test
    public void subTestGetStreamSizeAsString() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeAsString());
        System.out.println("Streamsize in bytes AS String === " + jMetaDataAudio.getStreamSizeAsString());
    }

   /**
    * Test getStreamSizeAsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeAsBoolean());
        System.out.println("Streamsize in bytes AS Boolean === " + jMetaDataAudio.getStreamSizeAsBoolean());
    }

   /**
    * Test getStreamSizeAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeAsBigInteger());
        System.out.println("Streamsize in bytes AS BigInteger === " + jMetaDataAudio.getStreamSizeAsBigInteger());
    }

   /**
    * Test getStreamSizeAsURL() method.
    */
    @Test
    public void subTestGetStreamSizeAsURL() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeAsURL());
        System.out.println("Streamsize in bytes AS URL === " + jMetaDataAudio.getStreamSizeAsURL());
    }

   /**
    * Test getFormatInfoAsInteger() method.
    */
    @Test
    public void subTestGetFormatInfoAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatInfoAsInteger());
        System.out.println("Info about the format AS Integer === " + jMetaDataAudio.getFormatInfoAsInteger());
    }

   /**
    * Test getFormatInfoAsLong() method.
    */
    @Test
    public void subTestGetFormatInfoAsLong() {
        assertEquals(null, this.jMetaDataAudio.getFormatInfoAsLong());
        System.out.println("Info about the format AS Long === " + jMetaDataAudio.getFormatInfoAsLong());
    }

   /**
    * Test getFormatInfoAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatInfoAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatInfoAsLocalDateTime());
        System.out.println("Info about the format AS LocalDateTime === " + jMetaDataAudio.getFormatInfoAsLocalDateTime());
    }

   /**
    * Test getFormatInfoAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatInfoAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatInfoAsLocalTime());
        System.out.println("Info about the format AS LocalTime === " + jMetaDataAudio.getFormatInfoAsLocalTime());
    }

   /**
    * Test getFormatInfoAsString() method.
    */
    @Test
    public void subTestGetFormatInfoAsString() {
        assertEquals(null, this.jMetaDataAudio.getFormatInfoAsString());
        System.out.println("Info about the format AS String === " + jMetaDataAudio.getFormatInfoAsString());
    }

   /**
    * Test getFormatInfoAsBoolean() method.
    */
    @Test
    public void subTestGetFormatInfoAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getFormatInfoAsBoolean());
        System.out.println("Info about the format AS Boolean === " + jMetaDataAudio.getFormatInfoAsBoolean());
    }

   /**
    * Test getFormatInfoAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatInfoAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatInfoAsBigInteger());
        System.out.println("Info about the format AS BigInteger === " + jMetaDataAudio.getFormatInfoAsBigInteger());
    }

   /**
    * Test getFormatInfoAsURL() method.
    */
    @Test
    public void subTestGetFormatInfoAsURL() {
        assertEquals(null, this.jMetaDataAudio.getFormatInfoAsURL());
        System.out.println("Info about the format AS URL === " + jMetaDataAudio.getFormatInfoAsURL());
    }

   /**
    * Test getSourceStreamSizeString1AsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString1AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeString1AsInteger());
        System.out.println("Source_StreamSize/String1 AS Integer === " + jMetaDataAudio.getSourceStreamSizeString1AsInteger());
    }

   /**
    * Test getSourceStreamSizeString1AsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString1AsLong() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeString1AsLong());
        System.out.println("Source_StreamSize/String1 AS Long === " + jMetaDataAudio.getSourceStreamSizeString1AsLong());
    }

   /**
    * Test getSourceStreamSizeString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeString1AsLocalDateTime());
        System.out.println("Source_StreamSize/String1 AS LocalDateTime === " + jMetaDataAudio.getSourceStreamSizeString1AsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeString1AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString1AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeString1AsLocalTime());
        System.out.println("Source_StreamSize/String1 AS LocalTime === " + jMetaDataAudio.getSourceStreamSizeString1AsLocalTime());
    }

   /**
    * Test getSourceStreamSizeString1AsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString1AsString() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeString1AsString());
        System.out.println("Source_StreamSize/String1 AS String === " + jMetaDataAudio.getSourceStreamSizeString1AsString());
    }

   /**
    * Test getSourceStreamSizeString1AsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString1AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeString1AsBoolean());
        System.out.println("Source_StreamSize/String1 AS Boolean === " + jMetaDataAudio.getSourceStreamSizeString1AsBoolean());
    }

   /**
    * Test getSourceStreamSizeString1AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString1AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeString1AsBigInteger());
        System.out.println("Source_StreamSize/String1 AS BigInteger === " + jMetaDataAudio.getSourceStreamSizeString1AsBigInteger());
    }

   /**
    * Test getSourceStreamSizeString1AsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString1AsURL() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeString1AsURL());
        System.out.println("Source_StreamSize/String1 AS URL === " + jMetaDataAudio.getSourceStreamSizeString1AsURL());
    }

   /**
    * Test getSourceStreamSizeProportionAsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeProportionAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeProportionAsInteger());
        System.out.println("Source Stream size divided by file size AS Integer === " + jMetaDataAudio.getSourceStreamSizeProportionAsInteger());
    }

   /**
    * Test getSourceStreamSizeProportionAsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeProportionAsLong() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeProportionAsLong());
        System.out.println("Source Stream size divided by file size AS Long === " + jMetaDataAudio.getSourceStreamSizeProportionAsLong());
    }

   /**
    * Test getSourceStreamSizeProportionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeProportionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeProportionAsLocalDateTime());
        System.out.println("Source Stream size divided by file size AS LocalDateTime === " + jMetaDataAudio.getSourceStreamSizeProportionAsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeProportionAsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeProportionAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeProportionAsLocalTime());
        System.out.println("Source Stream size divided by file size AS LocalTime === " + jMetaDataAudio.getSourceStreamSizeProportionAsLocalTime());
    }

   /**
    * Test getSourceStreamSizeProportionAsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeProportionAsString() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeProportionAsString());
        System.out.println("Source Stream size divided by file size AS String === " + jMetaDataAudio.getSourceStreamSizeProportionAsString());
    }

   /**
    * Test getSourceStreamSizeProportionAsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeProportionAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeProportionAsBoolean());
        System.out.println("Source Stream size divided by file size AS Boolean === " + jMetaDataAudio.getSourceStreamSizeProportionAsBoolean());
    }

   /**
    * Test getSourceStreamSizeProportionAsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeProportionAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeProportionAsBigInteger());
        System.out.println("Source Stream size divided by file size AS BigInteger === " + jMetaDataAudio.getSourceStreamSizeProportionAsBigInteger());
    }

   /**
    * Test getSourceStreamSizeProportionAsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeProportionAsURL() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeProportionAsURL());
        System.out.println("Source Stream size divided by file size AS URL === " + jMetaDataAudio.getSourceStreamSizeProportionAsURL());
    }

   /**
    * Test getCodecIDUrlAsInteger() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDUrlAsInteger());
        System.out.println("Homepage for more details about this codec ID AS Integer === " + jMetaDataAudio.getCodecIDUrlAsInteger());
    }

   /**
    * Test getCodecIDUrlAsLong() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsLong() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDUrlAsLong());
        System.out.println("Homepage for more details about this codec ID AS Long === " + jMetaDataAudio.getCodecIDUrlAsLong());
    }

   /**
    * Test getCodecIDUrlAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDUrlAsLocalDateTime());
        System.out.println("Homepage for more details about this codec ID AS LocalDateTime === " + jMetaDataAudio.getCodecIDUrlAsLocalDateTime());
    }

   /**
    * Test getCodecIDUrlAsLocalTime() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDUrlAsLocalTime());
        System.out.println("Homepage for more details about this codec ID AS LocalTime === " + jMetaDataAudio.getCodecIDUrlAsLocalTime());
    }

   /**
    * Test getCodecIDUrlAsString() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsString() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDUrlAsString());
        System.out.println("Homepage for more details about this codec ID AS String === " + jMetaDataAudio.getCodecIDUrlAsString());
    }

   /**
    * Test getCodecIDUrlAsBoolean() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDUrlAsBoolean());
        System.out.println("Homepage for more details about this codec ID AS Boolean === " + jMetaDataAudio.getCodecIDUrlAsBoolean());
    }

   /**
    * Test getCodecIDUrlAsBigInteger() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDUrlAsBigInteger());
        System.out.println("Homepage for more details about this codec ID AS BigInteger === " + jMetaDataAudio.getCodecIDUrlAsBigInteger());
    }

   /**
    * Test getCodecIDUrlAsURL() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsURL() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDUrlAsURL());
        System.out.println("Homepage for more details about this codec ID AS URL === " + jMetaDataAudio.getCodecIDUrlAsURL());
    }

   /**
    * Test getSourceStreamSizeString2AsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString2AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeString2AsInteger());
        System.out.println("Source_StreamSize/String2 AS Integer === " + jMetaDataAudio.getSourceStreamSizeString2AsInteger());
    }

   /**
    * Test getSourceStreamSizeString2AsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString2AsLong() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeString2AsLong());
        System.out.println("Source_StreamSize/String2 AS Long === " + jMetaDataAudio.getSourceStreamSizeString2AsLong());
    }

   /**
    * Test getSourceStreamSizeString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeString2AsLocalDateTime());
        System.out.println("Source_StreamSize/String2 AS LocalDateTime === " + jMetaDataAudio.getSourceStreamSizeString2AsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeString2AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString2AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeString2AsLocalTime());
        System.out.println("Source_StreamSize/String2 AS LocalTime === " + jMetaDataAudio.getSourceStreamSizeString2AsLocalTime());
    }

   /**
    * Test getSourceStreamSizeString2AsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString2AsString() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeString2AsString());
        System.out.println("Source_StreamSize/String2 AS String === " + jMetaDataAudio.getSourceStreamSizeString2AsString());
    }

   /**
    * Test getSourceStreamSizeString2AsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString2AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeString2AsBoolean());
        System.out.println("Source_StreamSize/String2 AS Boolean === " + jMetaDataAudio.getSourceStreamSizeString2AsBoolean());
    }

   /**
    * Test getSourceStreamSizeString2AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString2AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeString2AsBigInteger());
        System.out.println("Source_StreamSize/String2 AS BigInteger === " + jMetaDataAudio.getSourceStreamSizeString2AsBigInteger());
    }

   /**
    * Test getSourceStreamSizeString2AsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString2AsURL() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeString2AsURL());
        System.out.println("Source_StreamSize/String2 AS URL === " + jMetaDataAudio.getSourceStreamSizeString2AsURL());
    }

   /**
    * Test getSourceStreamSizeString5AsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString5AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeString5AsInteger());
        System.out.println("Source Streamsize in with percentage value AS Integer === " + jMetaDataAudio.getSourceStreamSizeString5AsInteger());
    }

   /**
    * Test getSourceStreamSizeString5AsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString5AsLong() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeString5AsLong());
        System.out.println("Source Streamsize in with percentage value AS Long === " + jMetaDataAudio.getSourceStreamSizeString5AsLong());
    }

   /**
    * Test getSourceStreamSizeString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeString5AsLocalDateTime());
        System.out.println("Source Streamsize in with percentage value AS LocalDateTime === " + jMetaDataAudio.getSourceStreamSizeString5AsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeString5AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString5AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeString5AsLocalTime());
        System.out.println("Source Streamsize in with percentage value AS LocalTime === " + jMetaDataAudio.getSourceStreamSizeString5AsLocalTime());
    }

   /**
    * Test getSourceStreamSizeString5AsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString5AsString() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeString5AsString());
        System.out.println("Source Streamsize in with percentage value AS String === " + jMetaDataAudio.getSourceStreamSizeString5AsString());
    }

   /**
    * Test getSourceStreamSizeString5AsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString5AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeString5AsBoolean());
        System.out.println("Source Streamsize in with percentage value AS Boolean === " + jMetaDataAudio.getSourceStreamSizeString5AsBoolean());
    }

   /**
    * Test getSourceStreamSizeString5AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString5AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeString5AsBigInteger());
        System.out.println("Source Streamsize in with percentage value AS BigInteger === " + jMetaDataAudio.getSourceStreamSizeString5AsBigInteger());
    }

   /**
    * Test getSourceStreamSizeString5AsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString5AsURL() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeString5AsURL());
        System.out.println("Source Streamsize in with percentage value AS URL === " + jMetaDataAudio.getSourceStreamSizeString5AsURL());
    }

   /**
    * Test getSourceStreamSizeString3AsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString3AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeString3AsInteger());
        System.out.println("Source_StreamSize/String3 AS Integer === " + jMetaDataAudio.getSourceStreamSizeString3AsInteger());
    }

   /**
    * Test getSourceStreamSizeString3AsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString3AsLong() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeString3AsLong());
        System.out.println("Source_StreamSize/String3 AS Long === " + jMetaDataAudio.getSourceStreamSizeString3AsLong());
    }

   /**
    * Test getSourceStreamSizeString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeString3AsLocalDateTime());
        System.out.println("Source_StreamSize/String3 AS LocalDateTime === " + jMetaDataAudio.getSourceStreamSizeString3AsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeString3AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString3AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeString3AsLocalTime());
        System.out.println("Source_StreamSize/String3 AS LocalTime === " + jMetaDataAudio.getSourceStreamSizeString3AsLocalTime());
    }

   /**
    * Test getSourceStreamSizeString3AsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString3AsString() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeString3AsString());
        System.out.println("Source_StreamSize/String3 AS String === " + jMetaDataAudio.getSourceStreamSizeString3AsString());
    }

   /**
    * Test getSourceStreamSizeString3AsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString3AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeString3AsBoolean());
        System.out.println("Source_StreamSize/String3 AS Boolean === " + jMetaDataAudio.getSourceStreamSizeString3AsBoolean());
    }

   /**
    * Test getSourceStreamSizeString3AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString3AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeString3AsBigInteger());
        System.out.println("Source_StreamSize/String3 AS BigInteger === " + jMetaDataAudio.getSourceStreamSizeString3AsBigInteger());
    }

   /**
    * Test getSourceStreamSizeString3AsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString3AsURL() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeString3AsURL());
        System.out.println("Source_StreamSize/String3 AS URL === " + jMetaDataAudio.getSourceStreamSizeString3AsURL());
    }

   /**
    * Test getSourceStreamSizeString4AsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString4AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeString4AsInteger());
        System.out.println("Source_StreamSize/String4 AS Integer === " + jMetaDataAudio.getSourceStreamSizeString4AsInteger());
    }

   /**
    * Test getSourceStreamSizeString4AsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString4AsLong() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeString4AsLong());
        System.out.println("Source_StreamSize/String4 AS Long === " + jMetaDataAudio.getSourceStreamSizeString4AsLong());
    }

   /**
    * Test getSourceStreamSizeString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeString4AsLocalDateTime());
        System.out.println("Source_StreamSize/String4 AS LocalDateTime === " + jMetaDataAudio.getSourceStreamSizeString4AsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeString4AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString4AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeString4AsLocalTime());
        System.out.println("Source_StreamSize/String4 AS LocalTime === " + jMetaDataAudio.getSourceStreamSizeString4AsLocalTime());
    }

   /**
    * Test getSourceStreamSizeString4AsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString4AsString() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeString4AsString());
        System.out.println("Source_StreamSize/String4 AS String === " + jMetaDataAudio.getSourceStreamSizeString4AsString());
    }

   /**
    * Test getSourceStreamSizeString4AsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString4AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeString4AsBoolean());
        System.out.println("Source_StreamSize/String4 AS Boolean === " + jMetaDataAudio.getSourceStreamSizeString4AsBoolean());
    }

   /**
    * Test getSourceStreamSizeString4AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString4AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeString4AsBigInteger());
        System.out.println("Source_StreamSize/String4 AS BigInteger === " + jMetaDataAudio.getSourceStreamSizeString4AsBigInteger());
    }

   /**
    * Test getSourceStreamSizeString4AsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString4AsURL() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeString4AsURL());
        System.out.println("Source_StreamSize/String4 AS URL === " + jMetaDataAudio.getSourceStreamSizeString4AsURL());
    }

   /**
    * Test getDisabledStringAsInteger() method.
    */
    @Test
    public void subTestGetDisabledStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDisabledStringAsInteger());
        System.out.println("Set if that track should not be used AS Integer === " + jMetaDataAudio.getDisabledStringAsInteger());
    }

   /**
    * Test getDisabledStringAsLong() method.
    */
    @Test
    public void subTestGetDisabledStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getDisabledStringAsLong());
        System.out.println("Set if that track should not be used AS Long === " + jMetaDataAudio.getDisabledStringAsLong());
    }

   /**
    * Test getDisabledStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDisabledStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDisabledStringAsLocalDateTime());
        System.out.println("Set if that track should not be used AS LocalDateTime === " + jMetaDataAudio.getDisabledStringAsLocalDateTime());
    }

   /**
    * Test getDisabledStringAsLocalTime() method.
    */
    @Test
    public void subTestGetDisabledStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDisabledStringAsLocalTime());
        System.out.println("Set if that track should not be used AS LocalTime === " + jMetaDataAudio.getDisabledStringAsLocalTime());
    }

   /**
    * Test getDisabledStringAsString() method.
    */
    @Test
    public void subTestGetDisabledStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getDisabledStringAsString());
        System.out.println("Set if that track should not be used AS String === " + jMetaDataAudio.getDisabledStringAsString());
    }

   /**
    * Test getDisabledStringAsBoolean() method.
    */
    @Test
    public void subTestGetDisabledStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDisabledStringAsBoolean());
        System.out.println("Set if that track should not be used AS Boolean === " + jMetaDataAudio.getDisabledStringAsBoolean());
    }

   /**
    * Test getDisabledStringAsBigInteger() method.
    */
    @Test
    public void subTestGetDisabledStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDisabledStringAsBigInteger());
        System.out.println("Set if that track should not be used AS BigInteger === " + jMetaDataAudio.getDisabledStringAsBigInteger());
    }

   /**
    * Test getDisabledStringAsURL() method.
    */
    @Test
    public void subTestGetDisabledStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getDisabledStringAsURL());
        System.out.println("Set if that track should not be used AS URL === " + jMetaDataAudio.getDisabledStringAsURL());
    }

   /**
    * Test getEncodedOperatingSystemAsInteger() method.
    */
    @Test
    public void subTestGetEncodedOperatingSystemAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getEncodedOperatingSystemAsInteger());
        System.out.println("Operating System of encoding-software AS Integer === " + jMetaDataAudio.getEncodedOperatingSystemAsInteger());
    }

   /**
    * Test getEncodedOperatingSystemAsLong() method.
    */
    @Test
    public void subTestGetEncodedOperatingSystemAsLong() {
        assertEquals(null, this.jMetaDataAudio.getEncodedOperatingSystemAsLong());
        System.out.println("Operating System of encoding-software AS Long === " + jMetaDataAudio.getEncodedOperatingSystemAsLong());
    }

   /**
    * Test getEncodedOperatingSystemAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedOperatingSystemAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getEncodedOperatingSystemAsLocalDateTime());
        System.out.println("Operating System of encoding-software AS LocalDateTime === " + jMetaDataAudio.getEncodedOperatingSystemAsLocalDateTime());
    }

   /**
    * Test getEncodedOperatingSystemAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedOperatingSystemAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getEncodedOperatingSystemAsLocalTime());
        System.out.println("Operating System of encoding-software AS LocalTime === " + jMetaDataAudio.getEncodedOperatingSystemAsLocalTime());
    }

   /**
    * Test getEncodedOperatingSystemAsString() method.
    */
    @Test
    public void subTestGetEncodedOperatingSystemAsString() {
        assertEquals(null, this.jMetaDataAudio.getEncodedOperatingSystemAsString());
        System.out.println("Operating System of encoding-software AS String === " + jMetaDataAudio.getEncodedOperatingSystemAsString());
    }

   /**
    * Test getEncodedOperatingSystemAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedOperatingSystemAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getEncodedOperatingSystemAsBoolean());
        System.out.println("Operating System of encoding-software AS Boolean === " + jMetaDataAudio.getEncodedOperatingSystemAsBoolean());
    }

   /**
    * Test getEncodedOperatingSystemAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedOperatingSystemAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getEncodedOperatingSystemAsBigInteger());
        System.out.println("Operating System of encoding-software AS BigInteger === " + jMetaDataAudio.getEncodedOperatingSystemAsBigInteger());
    }

   /**
    * Test getEncodedOperatingSystemAsURL() method.
    */
    @Test
    public void subTestGetEncodedOperatingSystemAsURL() {
        assertEquals(null, this.jMetaDataAudio.getEncodedOperatingSystemAsURL());
        System.out.println("Operating System of encoding-software AS URL === " + jMetaDataAudio.getEncodedOperatingSystemAsURL());
    }

   /**
    * Test getEncodedApplicationCompanyNameAsInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationCompanyNameAsInteger());
        System.out.println("Name of the company AS Integer === " + jMetaDataAudio.getEncodedApplicationCompanyNameAsInteger());
    }

   /**
    * Test getEncodedApplicationCompanyNameAsLong() method.
    */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsLong() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationCompanyNameAsLong());
        System.out.println("Name of the company AS Long === " + jMetaDataAudio.getEncodedApplicationCompanyNameAsLong());
    }

   /**
    * Test getEncodedApplicationCompanyNameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationCompanyNameAsLocalDateTime());
        System.out.println("Name of the company AS LocalDateTime === " + jMetaDataAudio.getEncodedApplicationCompanyNameAsLocalDateTime());
    }

   /**
    * Test getEncodedApplicationCompanyNameAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationCompanyNameAsLocalTime());
        System.out.println("Name of the company AS LocalTime === " + jMetaDataAudio.getEncodedApplicationCompanyNameAsLocalTime());
    }

   /**
    * Test getEncodedApplicationCompanyNameAsString() method.
    */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsString() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationCompanyNameAsString());
        System.out.println("Name of the company AS String === " + jMetaDataAudio.getEncodedApplicationCompanyNameAsString());
    }

   /**
    * Test getEncodedApplicationCompanyNameAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationCompanyNameAsBoolean());
        System.out.println("Name of the company AS Boolean === " + jMetaDataAudio.getEncodedApplicationCompanyNameAsBoolean());
    }

   /**
    * Test getEncodedApplicationCompanyNameAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationCompanyNameAsBigInteger());
        System.out.println("Name of the company AS BigInteger === " + jMetaDataAudio.getEncodedApplicationCompanyNameAsBigInteger());
    }

   /**
    * Test getEncodedApplicationCompanyNameAsURL() method.
    */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsURL() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationCompanyNameAsURL());
        System.out.println("Name of the company AS URL === " + jMetaDataAudio.getEncodedApplicationCompanyNameAsURL());
    }

   /**
    * Test getCompressionRatioAsInteger() method.
    */
    @Test
    public void subTestGetCompressionRatioAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getCompressionRatioAsInteger());
        System.out.println("Current stream size divided by uncompressed stream size AS Integer === " + jMetaDataAudio.getCompressionRatioAsInteger());
    }

   /**
    * Test getCompressionRatioAsLong() method.
    */
    @Test
    public void subTestGetCompressionRatioAsLong() {
        assertEquals(null, this.jMetaDataAudio.getCompressionRatioAsLong());
        System.out.println("Current stream size divided by uncompressed stream size AS Long === " + jMetaDataAudio.getCompressionRatioAsLong());
    }

   /**
    * Test getCompressionRatioAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCompressionRatioAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getCompressionRatioAsLocalDateTime());
        System.out.println("Current stream size divided by uncompressed stream size AS LocalDateTime === " + jMetaDataAudio.getCompressionRatioAsLocalDateTime());
    }

   /**
    * Test getCompressionRatioAsLocalTime() method.
    */
    @Test
    public void subTestGetCompressionRatioAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getCompressionRatioAsLocalTime());
        System.out.println("Current stream size divided by uncompressed stream size AS LocalTime === " + jMetaDataAudio.getCompressionRatioAsLocalTime());
    }

   /**
    * Test getCompressionRatioAsString() method.
    */
    @Test
    public void subTestGetCompressionRatioAsString() {
        assertEquals(null, this.jMetaDataAudio.getCompressionRatioAsString());
        System.out.println("Current stream size divided by uncompressed stream size AS String === " + jMetaDataAudio.getCompressionRatioAsString());
    }

   /**
    * Test getCompressionRatioAsBoolean() method.
    */
    @Test
    public void subTestGetCompressionRatioAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getCompressionRatioAsBoolean());
        System.out.println("Current stream size divided by uncompressed stream size AS Boolean === " + jMetaDataAudio.getCompressionRatioAsBoolean());
    }

   /**
    * Test getCompressionRatioAsBigInteger() method.
    */
    @Test
    public void subTestGetCompressionRatioAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getCompressionRatioAsBigInteger());
        System.out.println("Current stream size divided by uncompressed stream size AS BigInteger === " + jMetaDataAudio.getCompressionRatioAsBigInteger());
    }

   /**
    * Test getCompressionRatioAsURL() method.
    */
    @Test
    public void subTestGetCompressionRatioAsURL() {
        assertEquals(null, this.jMetaDataAudio.getCompressionRatioAsURL());
        System.out.println("Current stream size divided by uncompressed stream size AS URL === " + jMetaDataAudio.getCompressionRatioAsURL());
    }

   /**
    * Test getFormatCommercialIfAnyAsInteger() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatCommercialIfAnyAsInteger());
        System.out.println("Commercial name used by vendor for theses setings if there is one AS Integer === " + jMetaDataAudio.getFormatCommercialIfAnyAsInteger());
    }

   /**
    * Test getFormatCommercialIfAnyAsLong() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsLong() {
        assertEquals(null, this.jMetaDataAudio.getFormatCommercialIfAnyAsLong());
        System.out.println("Commercial name used by vendor for theses setings if there is one AS Long === " + jMetaDataAudio.getFormatCommercialIfAnyAsLong());
    }

   /**
    * Test getFormatCommercialIfAnyAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatCommercialIfAnyAsLocalDateTime());
        System.out.println("Commercial name used by vendor for theses setings if there is one AS LocalDateTime === " + jMetaDataAudio.getFormatCommercialIfAnyAsLocalDateTime());
    }

   /**
    * Test getFormatCommercialIfAnyAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatCommercialIfAnyAsLocalTime());
        System.out.println("Commercial name used by vendor for theses setings if there is one AS LocalTime === " + jMetaDataAudio.getFormatCommercialIfAnyAsLocalTime());
    }

   /**
    * Test getFormatCommercialIfAnyAsString() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsString() {
        assertEquals(null, this.jMetaDataAudio.getFormatCommercialIfAnyAsString());
        System.out.println("Commercial name used by vendor for theses setings if there is one AS String === " + jMetaDataAudio.getFormatCommercialIfAnyAsString());
    }

   /**
    * Test getFormatCommercialIfAnyAsBoolean() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getFormatCommercialIfAnyAsBoolean());
        System.out.println("Commercial name used by vendor for theses setings if there is one AS Boolean === " + jMetaDataAudio.getFormatCommercialIfAnyAsBoolean());
    }

   /**
    * Test getFormatCommercialIfAnyAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatCommercialIfAnyAsBigInteger());
        System.out.println("Commercial name used by vendor for theses setings if there is one AS BigInteger === " + jMetaDataAudio.getFormatCommercialIfAnyAsBigInteger());
    }

   /**
    * Test getFormatCommercialIfAnyAsURL() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsURL() {
        assertEquals(null, this.jMetaDataAudio.getFormatCommercialIfAnyAsURL());
        System.out.println("Commercial name used by vendor for theses setings if there is one AS URL === " + jMetaDataAudio.getFormatCommercialIfAnyAsURL());
    }

   /**
    * Test getTaggedDateAsInteger() method.
    */
    @Test
    public void subTestGetTaggedDateAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getTaggedDateAsInteger());
        System.out.println("UTC time that the tags were done for this item. AS Integer === " + jMetaDataAudio.getTaggedDateAsInteger());
    }

   /**
    * Test getTaggedDateAsLong() method.
    */
    @Test
    public void subTestGetTaggedDateAsLong() {
        assertEquals(null, this.jMetaDataAudio.getTaggedDateAsLong());
        System.out.println("UTC time that the tags were done for this item. AS Long === " + jMetaDataAudio.getTaggedDateAsLong());
    }

   /**
    * Test getTaggedDateAsLocalDateTime() method.
    */
    @Test
    public void subTestGetTaggedDateAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getTaggedDateAsLocalDateTime());
        System.out.println("UTC time that the tags were done for this item. AS LocalDateTime === " + jMetaDataAudio.getTaggedDateAsLocalDateTime());
    }

   /**
    * Test getTaggedDateAsLocalTime() method.
    */
    @Test
    public void subTestGetTaggedDateAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getTaggedDateAsLocalTime());
        System.out.println("UTC time that the tags were done for this item. AS LocalTime === " + jMetaDataAudio.getTaggedDateAsLocalTime());
    }

   /**
    * Test getTaggedDateAsString() method.
    */
    @Test
    public void subTestGetTaggedDateAsString() {
        assertEquals(null, this.jMetaDataAudio.getTaggedDateAsString());
        System.out.println("UTC time that the tags were done for this item. AS String === " + jMetaDataAudio.getTaggedDateAsString());
    }

   /**
    * Test getTaggedDateAsBoolean() method.
    */
    @Test
    public void subTestGetTaggedDateAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getTaggedDateAsBoolean());
        System.out.println("UTC time that the tags were done for this item. AS Boolean === " + jMetaDataAudio.getTaggedDateAsBoolean());
    }

   /**
    * Test getTaggedDateAsBigInteger() method.
    */
    @Test
    public void subTestGetTaggedDateAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getTaggedDateAsBigInteger());
        System.out.println("UTC time that the tags were done for this item. AS BigInteger === " + jMetaDataAudio.getTaggedDateAsBigInteger());
    }

   /**
    * Test getTaggedDateAsURL() method.
    */
    @Test
    public void subTestGetTaggedDateAsURL() {
        assertEquals(null, this.jMetaDataAudio.getTaggedDateAsURL());
        System.out.println("UTC time that the tags were done for this item. AS URL === " + jMetaDataAudio.getTaggedDateAsURL());
    }

   /**
    * Test getIDStringAsInteger() method.
    */
    @Test
    public void subTestGetIDStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getIDStringAsInteger());
        System.out.println("The ID for this stream in this file AS Integer === " + jMetaDataAudio.getIDStringAsInteger());
    }

   /**
    * Test getIDStringAsLong() method.
    */
    @Test
    public void subTestGetIDStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getIDStringAsLong());
        System.out.println("The ID for this stream in this file AS Long === " + jMetaDataAudio.getIDStringAsLong());
    }

   /**
    * Test getIDStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetIDStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getIDStringAsLocalDateTime());
        System.out.println("The ID for this stream in this file AS LocalDateTime === " + jMetaDataAudio.getIDStringAsLocalDateTime());
    }

   /**
    * Test getIDStringAsLocalTime() method.
    */
    @Test
    public void subTestGetIDStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getIDStringAsLocalTime());
        System.out.println("The ID for this stream in this file AS LocalTime === " + jMetaDataAudio.getIDStringAsLocalTime());
    }

   /**
    * Test getIDStringAsString() method.
    */
    @Test
    public void subTestGetIDStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getIDStringAsString());
        System.out.println("The ID for this stream in this file AS String === " + jMetaDataAudio.getIDStringAsString());
    }

   /**
    * Test getIDStringAsBoolean() method.
    */
    @Test
    public void subTestGetIDStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getIDStringAsBoolean());
        System.out.println("The ID for this stream in this file AS Boolean === " + jMetaDataAudio.getIDStringAsBoolean());
    }

   /**
    * Test getIDStringAsBigInteger() method.
    */
    @Test
    public void subTestGetIDStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getIDStringAsBigInteger());
        System.out.println("The ID for this stream in this file AS BigInteger === " + jMetaDataAudio.getIDStringAsBigInteger());
    }

   /**
    * Test getIDStringAsURL() method.
    */
    @Test
    public void subTestGetIDStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getIDStringAsURL());
        System.out.println("The ID for this stream in this file AS URL === " + jMetaDataAudio.getIDStringAsURL());
    }

   /**
    * Test getCompressionModeAsInteger() method.
    */
    @Test
    public void subTestGetCompressionModeAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getCompressionModeAsInteger());
        System.out.println("Compression mode (Lossy or Lossless) AS Integer === " + jMetaDataAudio.getCompressionModeAsInteger());
    }

   /**
    * Test getCompressionModeAsLong() method.
    */
    @Test
    public void subTestGetCompressionModeAsLong() {
        assertEquals(null, this.jMetaDataAudio.getCompressionModeAsLong());
        System.out.println("Compression mode (Lossy or Lossless) AS Long === " + jMetaDataAudio.getCompressionModeAsLong());
    }

   /**
    * Test getCompressionModeAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCompressionModeAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getCompressionModeAsLocalDateTime());
        System.out.println("Compression mode (Lossy or Lossless) AS LocalDateTime === " + jMetaDataAudio.getCompressionModeAsLocalDateTime());
    }

   /**
    * Test getCompressionModeAsLocalTime() method.
    */
    @Test
    public void subTestGetCompressionModeAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getCompressionModeAsLocalTime());
        System.out.println("Compression mode (Lossy or Lossless) AS LocalTime === " + jMetaDataAudio.getCompressionModeAsLocalTime());
    }

   /**
    * Test getCompressionModeAsString() method.
    */
    @Test
    public void subTestGetCompressionModeAsString() {
        assertEquals(null, this.jMetaDataAudio.getCompressionModeAsString());
        System.out.println("Compression mode (Lossy or Lossless) AS String === " + jMetaDataAudio.getCompressionModeAsString());
    }

   /**
    * Test getCompressionModeAsBoolean() method.
    */
    @Test
    public void subTestGetCompressionModeAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getCompressionModeAsBoolean());
        System.out.println("Compression mode (Lossy or Lossless) AS Boolean === " + jMetaDataAudio.getCompressionModeAsBoolean());
    }

   /**
    * Test getCompressionModeAsBigInteger() method.
    */
    @Test
    public void subTestGetCompressionModeAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getCompressionModeAsBigInteger());
        System.out.println("Compression mode (Lossy or Lossless) AS BigInteger === " + jMetaDataAudio.getCompressionModeAsBigInteger());
    }

   /**
    * Test getCompressionModeAsURL() method.
    */
    @Test
    public void subTestGetCompressionModeAsURL() {
        assertEquals(null, this.jMetaDataAudio.getCompressionModeAsURL());
        System.out.println("Compression mode (Lossy or Lossless) AS URL === " + jMetaDataAudio.getCompressionModeAsURL());
    }

   /**
    * Test getBitRateAsInteger() method.
    */
    @Test
    public void subTestGetBitRateAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getBitRateAsInteger());
        System.out.println("Bit rate in bps AS Integer === " + jMetaDataAudio.getBitRateAsInteger());
    }

   /**
    * Test getBitRateAsLong() method.
    */
    @Test
    public void subTestGetBitRateAsLong() {
        assertEquals(null, this.jMetaDataAudio.getBitRateAsLong());
        System.out.println("Bit rate in bps AS Long === " + jMetaDataAudio.getBitRateAsLong());
    }

   /**
    * Test getBitRateAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitRateAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getBitRateAsLocalDateTime());
        System.out.println("Bit rate in bps AS LocalDateTime === " + jMetaDataAudio.getBitRateAsLocalDateTime());
    }

   /**
    * Test getBitRateAsLocalTime() method.
    */
    @Test
    public void subTestGetBitRateAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getBitRateAsLocalTime());
        System.out.println("Bit rate in bps AS LocalTime === " + jMetaDataAudio.getBitRateAsLocalTime());
    }

   /**
    * Test getBitRateAsString() method.
    */
    @Test
    public void subTestGetBitRateAsString() {
        assertEquals(null, this.jMetaDataAudio.getBitRateAsString());
        System.out.println("Bit rate in bps AS String === " + jMetaDataAudio.getBitRateAsString());
    }

   /**
    * Test getBitRateAsBoolean() method.
    */
    @Test
    public void subTestGetBitRateAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getBitRateAsBoolean());
        System.out.println("Bit rate in bps AS Boolean === " + jMetaDataAudio.getBitRateAsBoolean());
    }

   /**
    * Test getBitRateAsBigInteger() method.
    */
    @Test
    public void subTestGetBitRateAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getBitRateAsBigInteger());
        System.out.println("Bit rate in bps AS BigInteger === " + jMetaDataAudio.getBitRateAsBigInteger());
    }

   /**
    * Test getBitRateAsURL() method.
    */
    @Test
    public void subTestGetBitRateAsURL() {
        assertEquals(null, this.jMetaDataAudio.getBitRateAsURL());
        System.out.println("Bit rate in bps AS URL === " + jMetaDataAudio.getBitRateAsURL());
    }

   /**
    * Test getEncodedDateAsInteger() method.
    */
    @Test
    public void subTestGetEncodedDateAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getEncodedDateAsInteger());
        System.out.println("UTC time that the encoding of this item was completed began. AS Integer === " + jMetaDataAudio.getEncodedDateAsInteger());
    }

   /**
    * Test getEncodedDateAsLong() method.
    */
    @Test
    public void subTestGetEncodedDateAsLong() {
        assertEquals(null, this.jMetaDataAudio.getEncodedDateAsLong());
        System.out.println("UTC time that the encoding of this item was completed began. AS Long === " + jMetaDataAudio.getEncodedDateAsLong());
    }

   /**
    * Test getEncodedDateAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedDateAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getEncodedDateAsLocalDateTime());
        System.out.println("UTC time that the encoding of this item was completed began. AS LocalDateTime === " + jMetaDataAudio.getEncodedDateAsLocalDateTime());
    }

   /**
    * Test getEncodedDateAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedDateAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getEncodedDateAsLocalTime());
        System.out.println("UTC time that the encoding of this item was completed began. AS LocalTime === " + jMetaDataAudio.getEncodedDateAsLocalTime());
    }

   /**
    * Test getEncodedDateAsString() method.
    */
    @Test
    public void subTestGetEncodedDateAsString() {
        assertEquals(null, this.jMetaDataAudio.getEncodedDateAsString());
        System.out.println("UTC time that the encoding of this item was completed began. AS String === " + jMetaDataAudio.getEncodedDateAsString());
    }

   /**
    * Test getEncodedDateAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedDateAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getEncodedDateAsBoolean());
        System.out.println("UTC time that the encoding of this item was completed began. AS Boolean === " + jMetaDataAudio.getEncodedDateAsBoolean());
    }

   /**
    * Test getEncodedDateAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedDateAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getEncodedDateAsBigInteger());
        System.out.println("UTC time that the encoding of this item was completed began. AS BigInteger === " + jMetaDataAudio.getEncodedDateAsBigInteger());
    }

   /**
    * Test getEncodedDateAsURL() method.
    */
    @Test
    public void subTestGetEncodedDateAsURL() {
        assertEquals(null, this.jMetaDataAudio.getEncodedDateAsURL());
        System.out.println("UTC time that the encoding of this item was completed began. AS URL === " + jMetaDataAudio.getEncodedDateAsURL());
    }

   /**
    * Test getBitRateModeAsInteger() method.
    */
    @Test
    public void subTestGetBitRateModeAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getBitRateModeAsInteger());
        System.out.println("Bit rate mode (VBR, CBR) AS Integer === " + jMetaDataAudio.getBitRateModeAsInteger());
    }

   /**
    * Test getBitRateModeAsLong() method.
    */
    @Test
    public void subTestGetBitRateModeAsLong() {
        assertEquals(null, this.jMetaDataAudio.getBitRateModeAsLong());
        System.out.println("Bit rate mode (VBR, CBR) AS Long === " + jMetaDataAudio.getBitRateModeAsLong());
    }

   /**
    * Test getBitRateModeAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitRateModeAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getBitRateModeAsLocalDateTime());
        System.out.println("Bit rate mode (VBR, CBR) AS LocalDateTime === " + jMetaDataAudio.getBitRateModeAsLocalDateTime());
    }

   /**
    * Test getBitRateModeAsLocalTime() method.
    */
    @Test
    public void subTestGetBitRateModeAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getBitRateModeAsLocalTime());
        System.out.println("Bit rate mode (VBR, CBR) AS LocalTime === " + jMetaDataAudio.getBitRateModeAsLocalTime());
    }

   /**
    * Test getBitRateModeAsString() method.
    */
    @Test
    public void subTestGetBitRateModeAsString() {
        assertEquals(null, this.jMetaDataAudio.getBitRateModeAsString());
        System.out.println("Bit rate mode (VBR, CBR) AS String === " + jMetaDataAudio.getBitRateModeAsString());
    }

   /**
    * Test getBitRateModeAsBoolean() method.
    */
    @Test
    public void subTestGetBitRateModeAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getBitRateModeAsBoolean());
        System.out.println("Bit rate mode (VBR, CBR) AS Boolean === " + jMetaDataAudio.getBitRateModeAsBoolean());
    }

   /**
    * Test getBitRateModeAsBigInteger() method.
    */
    @Test
    public void subTestGetBitRateModeAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getBitRateModeAsBigInteger());
        System.out.println("Bit rate mode (VBR, CBR) AS BigInteger === " + jMetaDataAudio.getBitRateModeAsBigInteger());
    }

   /**
    * Test getBitRateModeAsURL() method.
    */
    @Test
    public void subTestGetBitRateModeAsURL() {
        assertEquals(null, this.jMetaDataAudio.getBitRateModeAsURL());
        System.out.println("Bit rate mode (VBR, CBR) AS URL === " + jMetaDataAudio.getBitRateModeAsURL());
    }

   /**
    * Test getUniqueIDAsInteger() method.
    */
    @Test
    public void subTestGetUniqueIDAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getUniqueIDAsInteger());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS Integer === " + jMetaDataAudio.getUniqueIDAsInteger());
    }

   /**
    * Test getUniqueIDAsLong() method.
    */
    @Test
    public void subTestGetUniqueIDAsLong() {
        assertEquals(null, this.jMetaDataAudio.getUniqueIDAsLong());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS Long === " + jMetaDataAudio.getUniqueIDAsLong());
    }

   /**
    * Test getUniqueIDAsLocalDateTime() method.
    */
    @Test
    public void subTestGetUniqueIDAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getUniqueIDAsLocalDateTime());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS LocalDateTime === " + jMetaDataAudio.getUniqueIDAsLocalDateTime());
    }

   /**
    * Test getUniqueIDAsLocalTime() method.
    */
    @Test
    public void subTestGetUniqueIDAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getUniqueIDAsLocalTime());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS LocalTime === " + jMetaDataAudio.getUniqueIDAsLocalTime());
    }

   /**
    * Test getUniqueIDAsString() method.
    */
    @Test
    public void subTestGetUniqueIDAsString() {
        assertEquals(null, this.jMetaDataAudio.getUniqueIDAsString());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS String === " + jMetaDataAudio.getUniqueIDAsString());
    }

   /**
    * Test getUniqueIDAsBoolean() method.
    */
    @Test
    public void subTestGetUniqueIDAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getUniqueIDAsBoolean());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS Boolean === " + jMetaDataAudio.getUniqueIDAsBoolean());
    }

   /**
    * Test getUniqueIDAsBigInteger() method.
    */
    @Test
    public void subTestGetUniqueIDAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getUniqueIDAsBigInteger());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS BigInteger === " + jMetaDataAudio.getUniqueIDAsBigInteger());
    }

   /**
    * Test getUniqueIDAsURL() method.
    */
    @Test
    public void subTestGetUniqueIDAsURL() {
        assertEquals(null, this.jMetaDataAudio.getUniqueIDAsURL());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS URL === " + jMetaDataAudio.getUniqueIDAsURL());
    }

   /**
    * Test getBitRateMaximumStringAsInteger() method.
    */
    @Test
    public void subTestGetBitRateMaximumStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getBitRateMaximumStringAsInteger());
        System.out.println("Maximum Bit rate (with measurement) AS Integer === " + jMetaDataAudio.getBitRateMaximumStringAsInteger());
    }

   /**
    * Test getBitRateMaximumStringAsLong() method.
    */
    @Test
    public void subTestGetBitRateMaximumStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getBitRateMaximumStringAsLong());
        System.out.println("Maximum Bit rate (with measurement) AS Long === " + jMetaDataAudio.getBitRateMaximumStringAsLong());
    }

   /**
    * Test getBitRateMaximumStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitRateMaximumStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getBitRateMaximumStringAsLocalDateTime());
        System.out.println("Maximum Bit rate (with measurement) AS LocalDateTime === " + jMetaDataAudio.getBitRateMaximumStringAsLocalDateTime());
    }

   /**
    * Test getBitRateMaximumStringAsLocalTime() method.
    */
    @Test
    public void subTestGetBitRateMaximumStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getBitRateMaximumStringAsLocalTime());
        System.out.println("Maximum Bit rate (with measurement) AS LocalTime === " + jMetaDataAudio.getBitRateMaximumStringAsLocalTime());
    }

   /**
    * Test getBitRateMaximumStringAsString() method.
    */
    @Test
    public void subTestGetBitRateMaximumStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getBitRateMaximumStringAsString());
        System.out.println("Maximum Bit rate (with measurement) AS String === " + jMetaDataAudio.getBitRateMaximumStringAsString());
    }

   /**
    * Test getBitRateMaximumStringAsBoolean() method.
    */
    @Test
    public void subTestGetBitRateMaximumStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getBitRateMaximumStringAsBoolean());
        System.out.println("Maximum Bit rate (with measurement) AS Boolean === " + jMetaDataAudio.getBitRateMaximumStringAsBoolean());
    }

   /**
    * Test getBitRateMaximumStringAsBigInteger() method.
    */
    @Test
    public void subTestGetBitRateMaximumStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getBitRateMaximumStringAsBigInteger());
        System.out.println("Maximum Bit rate (with measurement) AS BigInteger === " + jMetaDataAudio.getBitRateMaximumStringAsBigInteger());
    }

   /**
    * Test getBitRateMaximumStringAsURL() method.
    */
    @Test
    public void subTestGetBitRateMaximumStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getBitRateMaximumStringAsURL());
        System.out.println("Maximum Bit rate (with measurement) AS URL === " + jMetaDataAudio.getBitRateMaximumStringAsURL());
    }

   /**
    * Test getDelayString3AsInteger() method.
    */
    @Test
    public void subTestGetDelayString3AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDelayString3AsInteger());
        System.out.println("Delay in format : HH:MM:SS.MMM AS Integer === " + jMetaDataAudio.getDelayString3AsInteger());
    }

   /**
    * Test getDelayString3AsLong() method.
    */
    @Test
    public void subTestGetDelayString3AsLong() {
        assertEquals(null, this.jMetaDataAudio.getDelayString3AsLong());
        System.out.println("Delay in format : HH:MM:SS.MMM AS Long === " + jMetaDataAudio.getDelayString3AsLong());
    }

   /**
    * Test getDelayString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDelayString3AsLocalDateTime());
        System.out.println("Delay in format : HH:MM:SS.MMM AS LocalDateTime === " + jMetaDataAudio.getDelayString3AsLocalDateTime());
    }

   /**
    * Test getDelayString3AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayString3AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDelayString3AsLocalTime());
        System.out.println("Delay in format : HH:MM:SS.MMM AS LocalTime === " + jMetaDataAudio.getDelayString3AsLocalTime());
    }

   /**
    * Test getDelayString3AsString() method.
    */
    @Test
    public void subTestGetDelayString3AsString() {
        assertEquals(null, this.jMetaDataAudio.getDelayString3AsString());
        System.out.println("Delay in format : HH:MM:SS.MMM AS String === " + jMetaDataAudio.getDelayString3AsString());
    }

   /**
    * Test getDelayString3AsBoolean() method.
    */
    @Test
    public void subTestGetDelayString3AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDelayString3AsBoolean());
        System.out.println("Delay in format : HH:MM:SS.MMM AS Boolean === " + jMetaDataAudio.getDelayString3AsBoolean());
    }

   /**
    * Test getDelayString3AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayString3AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDelayString3AsBigInteger());
        System.out.println("Delay in format : HH:MM:SS.MMM AS BigInteger === " + jMetaDataAudio.getDelayString3AsBigInteger());
    }

   /**
    * Test getDelayString3AsURL() method.
    */
    @Test
    public void subTestGetDelayString3AsURL() {
        assertEquals(null, this.jMetaDataAudio.getDelayString3AsURL());
        System.out.println("Delay in format : HH:MM:SS.MMM AS URL === " + jMetaDataAudio.getDelayString3AsURL());
    }

   /**
    * Test getVideoDelayStringAsInteger() method.
    */
    @Test
    public void subTestGetVideoDelayStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayStringAsInteger());
        System.out.println("Video_Delay/String AS Integer === " + jMetaDataAudio.getVideoDelayStringAsInteger());
    }

   /**
    * Test getVideoDelayStringAsLong() method.
    */
    @Test
    public void subTestGetVideoDelayStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayStringAsLong());
        System.out.println("Video_Delay/String AS Long === " + jMetaDataAudio.getVideoDelayStringAsLong());
    }

   /**
    * Test getVideoDelayStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetVideoDelayStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayStringAsLocalDateTime());
        System.out.println("Video_Delay/String AS LocalDateTime === " + jMetaDataAudio.getVideoDelayStringAsLocalDateTime());
    }

   /**
    * Test getVideoDelayStringAsLocalTime() method.
    */
    @Test
    public void subTestGetVideoDelayStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayStringAsLocalTime());
        System.out.println("Video_Delay/String AS LocalTime === " + jMetaDataAudio.getVideoDelayStringAsLocalTime());
    }

   /**
    * Test getVideoDelayStringAsString() method.
    */
    @Test
    public void subTestGetVideoDelayStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayStringAsString());
        System.out.println("Video_Delay/String AS String === " + jMetaDataAudio.getVideoDelayStringAsString());
    }

   /**
    * Test getVideoDelayStringAsBoolean() method.
    */
    @Test
    public void subTestGetVideoDelayStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayStringAsBoolean());
        System.out.println("Video_Delay/String AS Boolean === " + jMetaDataAudio.getVideoDelayStringAsBoolean());
    }

   /**
    * Test getVideoDelayStringAsBigInteger() method.
    */
    @Test
    public void subTestGetVideoDelayStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayStringAsBigInteger());
        System.out.println("Video_Delay/String AS BigInteger === " + jMetaDataAudio.getVideoDelayStringAsBigInteger());
    }

   /**
    * Test getVideoDelayStringAsURL() method.
    */
    @Test
    public void subTestGetVideoDelayStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayStringAsURL());
        System.out.println("Video_Delay/String AS URL === " + jMetaDataAudio.getVideoDelayStringAsURL());
    }

   /**
    * Test getDelayString4AsInteger() method.
    */
    @Test
    public void subTestGetDelayString4AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDelayString4AsInteger());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Integer === " + jMetaDataAudio.getDelayString4AsInteger());
    }

   /**
    * Test getDelayString4AsLong() method.
    */
    @Test
    public void subTestGetDelayString4AsLong() {
        assertEquals(null, this.jMetaDataAudio.getDelayString4AsLong());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Long === " + jMetaDataAudio.getDelayString4AsLong());
    }

   /**
    * Test getDelayString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDelayString4AsLocalDateTime());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS LocalDateTime === " + jMetaDataAudio.getDelayString4AsLocalDateTime());
    }

   /**
    * Test getDelayString4AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayString4AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDelayString4AsLocalTime());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS LocalTime === " + jMetaDataAudio.getDelayString4AsLocalTime());
    }

   /**
    * Test getDelayString4AsString() method.
    */
    @Test
    public void subTestGetDelayString4AsString() {
        assertEquals(null, this.jMetaDataAudio.getDelayString4AsString());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS String === " + jMetaDataAudio.getDelayString4AsString());
    }

   /**
    * Test getDelayString4AsBoolean() method.
    */
    @Test
    public void subTestGetDelayString4AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDelayString4AsBoolean());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Boolean === " + jMetaDataAudio.getDelayString4AsBoolean());
    }

   /**
    * Test getDelayString4AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayString4AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDelayString4AsBigInteger());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS BigInteger === " + jMetaDataAudio.getDelayString4AsBigInteger());
    }

   /**
    * Test getDelayString4AsURL() method.
    */
    @Test
    public void subTestGetDelayString4AsURL() {
        assertEquals(null, this.jMetaDataAudio.getDelayString4AsURL());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS URL === " + jMetaDataAudio.getDelayString4AsURL());
    }

   /**
    * Test getDelayString1AsInteger() method.
    */
    @Test
    public void subTestGetDelayString1AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDelayString1AsInteger());
        System.out.println("Delay with measurement AS Integer === " + jMetaDataAudio.getDelayString1AsInteger());
    }

   /**
    * Test getDelayString1AsLong() method.
    */
    @Test
    public void subTestGetDelayString1AsLong() {
        assertEquals(null, this.jMetaDataAudio.getDelayString1AsLong());
        System.out.println("Delay with measurement AS Long === " + jMetaDataAudio.getDelayString1AsLong());
    }

   /**
    * Test getDelayString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDelayString1AsLocalDateTime());
        System.out.println("Delay with measurement AS LocalDateTime === " + jMetaDataAudio.getDelayString1AsLocalDateTime());
    }

   /**
    * Test getDelayString1AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayString1AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDelayString1AsLocalTime());
        System.out.println("Delay with measurement AS LocalTime === " + jMetaDataAudio.getDelayString1AsLocalTime());
    }

   /**
    * Test getDelayString1AsString() method.
    */
    @Test
    public void subTestGetDelayString1AsString() {
        assertEquals(null, this.jMetaDataAudio.getDelayString1AsString());
        System.out.println("Delay with measurement AS String === " + jMetaDataAudio.getDelayString1AsString());
    }

   /**
    * Test getDelayString1AsBoolean() method.
    */
    @Test
    public void subTestGetDelayString1AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDelayString1AsBoolean());
        System.out.println("Delay with measurement AS Boolean === " + jMetaDataAudio.getDelayString1AsBoolean());
    }

   /**
    * Test getDelayString1AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayString1AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDelayString1AsBigInteger());
        System.out.println("Delay with measurement AS BigInteger === " + jMetaDataAudio.getDelayString1AsBigInteger());
    }

   /**
    * Test getDelayString1AsURL() method.
    */
    @Test
    public void subTestGetDelayString1AsURL() {
        assertEquals(null, this.jMetaDataAudio.getDelayString1AsURL());
        System.out.println("Delay with measurement AS URL === " + jMetaDataAudio.getDelayString1AsURL());
    }

   /**
    * Test getDelayString2AsInteger() method.
    */
    @Test
    public void subTestGetDelayString2AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDelayString2AsInteger());
        System.out.println("Delay with measurement AS Integer === " + jMetaDataAudio.getDelayString2AsInteger());
    }

   /**
    * Test getDelayString2AsLong() method.
    */
    @Test
    public void subTestGetDelayString2AsLong() {
        assertEquals(null, this.jMetaDataAudio.getDelayString2AsLong());
        System.out.println("Delay with measurement AS Long === " + jMetaDataAudio.getDelayString2AsLong());
    }

   /**
    * Test getDelayString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDelayString2AsLocalDateTime());
        System.out.println("Delay with measurement AS LocalDateTime === " + jMetaDataAudio.getDelayString2AsLocalDateTime());
    }

   /**
    * Test getDelayString2AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayString2AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDelayString2AsLocalTime());
        System.out.println("Delay with measurement AS LocalTime === " + jMetaDataAudio.getDelayString2AsLocalTime());
    }

   /**
    * Test getDelayString2AsString() method.
    */
    @Test
    public void subTestGetDelayString2AsString() {
        assertEquals(null, this.jMetaDataAudio.getDelayString2AsString());
        System.out.println("Delay with measurement AS String === " + jMetaDataAudio.getDelayString2AsString());
    }

   /**
    * Test getDelayString2AsBoolean() method.
    */
    @Test
    public void subTestGetDelayString2AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDelayString2AsBoolean());
        System.out.println("Delay with measurement AS Boolean === " + jMetaDataAudio.getDelayString2AsBoolean());
    }

   /**
    * Test getDelayString2AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayString2AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDelayString2AsBigInteger());
        System.out.println("Delay with measurement AS BigInteger === " + jMetaDataAudio.getDelayString2AsBigInteger());
    }

   /**
    * Test getDelayString2AsURL() method.
    */
    @Test
    public void subTestGetDelayString2AsURL() {
        assertEquals(null, this.jMetaDataAudio.getDelayString2AsURL());
        System.out.println("Delay with measurement AS URL === " + jMetaDataAudio.getDelayString2AsURL());
    }

   /**
    * Test getChannelsStringAsInteger() method.
    */
    @Test
    public void subTestGetChannelsStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getChannelsStringAsInteger());
        System.out.println("Number of channels (with measurement) AS Integer === " + jMetaDataAudio.getChannelsStringAsInteger());
    }

   /**
    * Test getChannelsStringAsLong() method.
    */
    @Test
    public void subTestGetChannelsStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getChannelsStringAsLong());
        System.out.println("Number of channels (with measurement) AS Long === " + jMetaDataAudio.getChannelsStringAsLong());
    }

   /**
    * Test getChannelsStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetChannelsStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getChannelsStringAsLocalDateTime());
        System.out.println("Number of channels (with measurement) AS LocalDateTime === " + jMetaDataAudio.getChannelsStringAsLocalDateTime());
    }

   /**
    * Test getChannelsStringAsLocalTime() method.
    */
    @Test
    public void subTestGetChannelsStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getChannelsStringAsLocalTime());
        System.out.println("Number of channels (with measurement) AS LocalTime === " + jMetaDataAudio.getChannelsStringAsLocalTime());
    }

   /**
    * Test getChannelsStringAsString() method.
    */
    @Test
    public void subTestGetChannelsStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getChannelsStringAsString());
        System.out.println("Number of channels (with measurement) AS String === " + jMetaDataAudio.getChannelsStringAsString());
    }

   /**
    * Test getChannelsStringAsBoolean() method.
    */
    @Test
    public void subTestGetChannelsStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getChannelsStringAsBoolean());
        System.out.println("Number of channels (with measurement) AS Boolean === " + jMetaDataAudio.getChannelsStringAsBoolean());
    }

   /**
    * Test getChannelsStringAsBigInteger() method.
    */
    @Test
    public void subTestGetChannelsStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getChannelsStringAsBigInteger());
        System.out.println("Number of channels (with measurement) AS BigInteger === " + jMetaDataAudio.getChannelsStringAsBigInteger());
    }

   /**
    * Test getChannelsStringAsURL() method.
    */
    @Test
    public void subTestGetChannelsStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getChannelsStringAsURL());
        System.out.println("Number of channels (with measurement) AS URL === " + jMetaDataAudio.getChannelsStringAsURL());
    }

   /**
    * Test getDelayString5AsInteger() method.
    */
    @Test
    public void subTestGetDelayString5AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDelayString5AsInteger());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Integer === " + jMetaDataAudio.getDelayString5AsInteger());
    }

   /**
    * Test getDelayString5AsLong() method.
    */
    @Test
    public void subTestGetDelayString5AsLong() {
        assertEquals(null, this.jMetaDataAudio.getDelayString5AsLong());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Long === " + jMetaDataAudio.getDelayString5AsLong());
    }

   /**
    * Test getDelayString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDelayString5AsLocalDateTime());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS LocalDateTime === " + jMetaDataAudio.getDelayString5AsLocalDateTime());
    }

   /**
    * Test getDelayString5AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayString5AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDelayString5AsLocalTime());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS LocalTime === " + jMetaDataAudio.getDelayString5AsLocalTime());
    }

   /**
    * Test getDelayString5AsString() method.
    */
    @Test
    public void subTestGetDelayString5AsString() {
        assertEquals(null, this.jMetaDataAudio.getDelayString5AsString());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS String === " + jMetaDataAudio.getDelayString5AsString());
    }

   /**
    * Test getDelayString5AsBoolean() method.
    */
    @Test
    public void subTestGetDelayString5AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDelayString5AsBoolean());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Boolean === " + jMetaDataAudio.getDelayString5AsBoolean());
    }

   /**
    * Test getDelayString5AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayString5AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDelayString5AsBigInteger());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS BigInteger === " + jMetaDataAudio.getDelayString5AsBigInteger());
    }

   /**
    * Test getDelayString5AsURL() method.
    */
    @Test
    public void subTestGetDelayString5AsURL() {
        assertEquals(null, this.jMetaDataAudio.getDelayString5AsURL());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS URL === " + jMetaDataAudio.getDelayString5AsURL());
    }

   /**
    * Test getInterleavePreloadAsInteger() method.
    */
    @Test
    public void subTestGetInterleavePreloadAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getInterleavePreloadAsInteger());
        System.out.println("How much time is buffered before the first video frame AS Integer === " + jMetaDataAudio.getInterleavePreloadAsInteger());
    }

   /**
    * Test getInterleavePreloadAsLong() method.
    */
    @Test
    public void subTestGetInterleavePreloadAsLong() {
        assertEquals(null, this.jMetaDataAudio.getInterleavePreloadAsLong());
        System.out.println("How much time is buffered before the first video frame AS Long === " + jMetaDataAudio.getInterleavePreloadAsLong());
    }

   /**
    * Test getInterleavePreloadAsLocalDateTime() method.
    */
    @Test
    public void subTestGetInterleavePreloadAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getInterleavePreloadAsLocalDateTime());
        System.out.println("How much time is buffered before the first video frame AS LocalDateTime === " + jMetaDataAudio.getInterleavePreloadAsLocalDateTime());
    }

   /**
    * Test getInterleavePreloadAsLocalTime() method.
    */
    @Test
    public void subTestGetInterleavePreloadAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getInterleavePreloadAsLocalTime());
        System.out.println("How much time is buffered before the first video frame AS LocalTime === " + jMetaDataAudio.getInterleavePreloadAsLocalTime());
    }

   /**
    * Test getInterleavePreloadAsString() method.
    */
    @Test
    public void subTestGetInterleavePreloadAsString() {
        assertEquals(null, this.jMetaDataAudio.getInterleavePreloadAsString());
        System.out.println("How much time is buffered before the first video frame AS String === " + jMetaDataAudio.getInterleavePreloadAsString());
    }

   /**
    * Test getInterleavePreloadAsBoolean() method.
    */
    @Test
    public void subTestGetInterleavePreloadAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getInterleavePreloadAsBoolean());
        System.out.println("How much time is buffered before the first video frame AS Boolean === " + jMetaDataAudio.getInterleavePreloadAsBoolean());
    }

   /**
    * Test getInterleavePreloadAsBigInteger() method.
    */
    @Test
    public void subTestGetInterleavePreloadAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getInterleavePreloadAsBigInteger());
        System.out.println("How much time is buffered before the first video frame AS BigInteger === " + jMetaDataAudio.getInterleavePreloadAsBigInteger());
    }

   /**
    * Test getInterleavePreloadAsURL() method.
    */
    @Test
    public void subTestGetInterleavePreloadAsURL() {
        assertEquals(null, this.jMetaDataAudio.getInterleavePreloadAsURL());
        System.out.println("How much time is buffered before the first video frame AS URL === " + jMetaDataAudio.getInterleavePreloadAsURL());
    }

   /**
    * Test getMatrixChannelPositionsString2AsInteger() method.
    */
    @Test
    public void subTestGetMatrixChannelPositionsString2AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getMatrixChannelPositionsString2AsInteger());
        System.out.println("Position of channels after matrix decoding (x/y.z format) AS Integer === " + jMetaDataAudio.getMatrixChannelPositionsString2AsInteger());
    }

   /**
    * Test getMatrixChannelPositionsString2AsLong() method.
    */
    @Test
    public void subTestGetMatrixChannelPositionsString2AsLong() {
        assertEquals(null, this.jMetaDataAudio.getMatrixChannelPositionsString2AsLong());
        System.out.println("Position of channels after matrix decoding (x/y.z format) AS Long === " + jMetaDataAudio.getMatrixChannelPositionsString2AsLong());
    }

   /**
    * Test getMatrixChannelPositionsString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetMatrixChannelPositionsString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getMatrixChannelPositionsString2AsLocalDateTime());
        System.out.println("Position of channels after matrix decoding (x/y.z format) AS LocalDateTime === " + jMetaDataAudio.getMatrixChannelPositionsString2AsLocalDateTime());
    }

   /**
    * Test getMatrixChannelPositionsString2AsLocalTime() method.
    */
    @Test
    public void subTestGetMatrixChannelPositionsString2AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getMatrixChannelPositionsString2AsLocalTime());
        System.out.println("Position of channels after matrix decoding (x/y.z format) AS LocalTime === " + jMetaDataAudio.getMatrixChannelPositionsString2AsLocalTime());
    }

   /**
    * Test getMatrixChannelPositionsString2AsString() method.
    */
    @Test
    public void subTestGetMatrixChannelPositionsString2AsString() {
        assertEquals(null, this.jMetaDataAudio.getMatrixChannelPositionsString2AsString());
        System.out.println("Position of channels after matrix decoding (x/y.z format) AS String === " + jMetaDataAudio.getMatrixChannelPositionsString2AsString());
    }

   /**
    * Test getMatrixChannelPositionsString2AsBoolean() method.
    */
    @Test
    public void subTestGetMatrixChannelPositionsString2AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getMatrixChannelPositionsString2AsBoolean());
        System.out.println("Position of channels after matrix decoding (x/y.z format) AS Boolean === " + jMetaDataAudio.getMatrixChannelPositionsString2AsBoolean());
    }

   /**
    * Test getMatrixChannelPositionsString2AsBigInteger() method.
    */
    @Test
    public void subTestGetMatrixChannelPositionsString2AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getMatrixChannelPositionsString2AsBigInteger());
        System.out.println("Position of channels after matrix decoding (x/y.z format) AS BigInteger === " + jMetaDataAudio.getMatrixChannelPositionsString2AsBigInteger());
    }

   /**
    * Test getMatrixChannelPositionsString2AsURL() method.
    */
    @Test
    public void subTestGetMatrixChannelPositionsString2AsURL() {
        assertEquals(null, this.jMetaDataAudio.getMatrixChannelPositionsString2AsURL());
        System.out.println("Position of channels after matrix decoding (x/y.z format) AS URL === " + jMetaDataAudio.getMatrixChannelPositionsString2AsURL());
    }

   /**
    * Test getFormatSettingsSBRAsInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsSBRAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsSBRAsInteger());
        System.out.println("Format_Settings_SBR AS Integer === " + jMetaDataAudio.getFormatSettingsSBRAsInteger());
    }

   /**
    * Test getFormatSettingsSBRAsLong() method.
    */
    @Test
    public void subTestGetFormatSettingsSBRAsLong() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsSBRAsLong());
        System.out.println("Format_Settings_SBR AS Long === " + jMetaDataAudio.getFormatSettingsSBRAsLong());
    }

   /**
    * Test getFormatSettingsSBRAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatSettingsSBRAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsSBRAsLocalDateTime());
        System.out.println("Format_Settings_SBR AS LocalDateTime === " + jMetaDataAudio.getFormatSettingsSBRAsLocalDateTime());
    }

   /**
    * Test getFormatSettingsSBRAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatSettingsSBRAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsSBRAsLocalTime());
        System.out.println("Format_Settings_SBR AS LocalTime === " + jMetaDataAudio.getFormatSettingsSBRAsLocalTime());
    }

   /**
    * Test getFormatSettingsSBRAsString() method.
    */
    @Test
    public void subTestGetFormatSettingsSBRAsString() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsSBRAsString());
        System.out.println("Format_Settings_SBR AS String === " + jMetaDataAudio.getFormatSettingsSBRAsString());
    }

   /**
    * Test getFormatSettingsSBRAsBoolean() method.
    */
    @Test
    public void subTestGetFormatSettingsSBRAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsSBRAsBoolean());
        System.out.println("Format_Settings_SBR AS Boolean === " + jMetaDataAudio.getFormatSettingsSBRAsBoolean());
    }

   /**
    * Test getFormatSettingsSBRAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsSBRAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsSBRAsBigInteger());
        System.out.println("Format_Settings_SBR AS BigInteger === " + jMetaDataAudio.getFormatSettingsSBRAsBigInteger());
    }

   /**
    * Test getFormatSettingsSBRAsURL() method.
    */
    @Test
    public void subTestGetFormatSettingsSBRAsURL() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsSBRAsURL());
        System.out.println("Format_Settings_SBR AS URL === " + jMetaDataAudio.getFormatSettingsSBRAsURL());
    }

   /**
    * Test getDelayAsInteger() method.
    */
    @Test
    public void subTestGetDelayAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDelayAsInteger());
        System.out.println("Delay fixed in the stream (relative) IN MS AS Integer === " + jMetaDataAudio.getDelayAsInteger());
    }

   /**
    * Test getDelayAsLong() method.
    */
    @Test
    public void subTestGetDelayAsLong() {
        assertEquals(null, this.jMetaDataAudio.getDelayAsLong());
        System.out.println("Delay fixed in the stream (relative) IN MS AS Long === " + jMetaDataAudio.getDelayAsLong());
    }

   /**
    * Test getDelayAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDelayAsLocalDateTime());
        System.out.println("Delay fixed in the stream (relative) IN MS AS LocalDateTime === " + jMetaDataAudio.getDelayAsLocalDateTime());
    }

   /**
    * Test getDelayAsLocalTime() method.
    */
    @Test
    public void subTestGetDelayAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDelayAsLocalTime());
        System.out.println("Delay fixed in the stream (relative) IN MS AS LocalTime === " + jMetaDataAudio.getDelayAsLocalTime());
    }

   /**
    * Test getDelayAsString() method.
    */
    @Test
    public void subTestGetDelayAsString() {
        assertEquals(null, this.jMetaDataAudio.getDelayAsString());
        System.out.println("Delay fixed in the stream (relative) IN MS AS String === " + jMetaDataAudio.getDelayAsString());
    }

   /**
    * Test getDelayAsBoolean() method.
    */
    @Test
    public void subTestGetDelayAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDelayAsBoolean());
        System.out.println("Delay fixed in the stream (relative) IN MS AS Boolean === " + jMetaDataAudio.getDelayAsBoolean());
    }

   /**
    * Test getDelayAsBigInteger() method.
    */
    @Test
    public void subTestGetDelayAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDelayAsBigInteger());
        System.out.println("Delay fixed in the stream (relative) IN MS AS BigInteger === " + jMetaDataAudio.getDelayAsBigInteger());
    }

   /**
    * Test getDelayAsURL() method.
    */
    @Test
    public void subTestGetDelayAsURL() {
        assertEquals(null, this.jMetaDataAudio.getDelayAsURL());
        System.out.println("Delay fixed in the stream (relative) IN MS AS URL === " + jMetaDataAudio.getDelayAsURL());
    }

   /**
    * Test getEncodedApplicationUrlAsInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationUrlAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationUrlAsInteger());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit. AS Integer === " + jMetaDataAudio.getEncodedApplicationUrlAsInteger());
    }

   /**
    * Test getEncodedApplicationUrlAsLong() method.
    */
    @Test
    public void subTestGetEncodedApplicationUrlAsLong() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationUrlAsLong());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit. AS Long === " + jMetaDataAudio.getEncodedApplicationUrlAsLong());
    }

   /**
    * Test getEncodedApplicationUrlAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationUrlAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationUrlAsLocalDateTime());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit. AS LocalDateTime === " + jMetaDataAudio.getEncodedApplicationUrlAsLocalDateTime());
    }

   /**
    * Test getEncodedApplicationUrlAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationUrlAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationUrlAsLocalTime());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit. AS LocalTime === " + jMetaDataAudio.getEncodedApplicationUrlAsLocalTime());
    }

   /**
    * Test getEncodedApplicationUrlAsString() method.
    */
    @Test
    public void subTestGetEncodedApplicationUrlAsString() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationUrlAsString());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit. AS String === " + jMetaDataAudio.getEncodedApplicationUrlAsString());
    }

   /**
    * Test getEncodedApplicationUrlAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedApplicationUrlAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationUrlAsBoolean());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit. AS Boolean === " + jMetaDataAudio.getEncodedApplicationUrlAsBoolean());
    }

   /**
    * Test getEncodedApplicationUrlAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationUrlAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationUrlAsBigInteger());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit. AS BigInteger === " + jMetaDataAudio.getEncodedApplicationUrlAsBigInteger());
    }

   /**
    * Test getEncodedApplicationUrlAsURL() method.
    */
    @Test
    public void subTestGetEncodedApplicationUrlAsURL() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationUrlAsURL());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit. AS URL === " + jMetaDataAudio.getEncodedApplicationUrlAsURL());
    }

   /**
    * Test getSourceStreamSizeEncodedString4AsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedString4AsInteger());
        System.out.println("Source_StreamSize_Encoded/String4 AS Integer === " + jMetaDataAudio.getSourceStreamSizeEncodedString4AsInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedString4AsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsLong() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedString4AsLong());
        System.out.println("Source_StreamSize_Encoded/String4 AS Long === " + jMetaDataAudio.getSourceStreamSizeEncodedString4AsLong());
    }

   /**
    * Test getSourceStreamSizeEncodedString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedString4AsLocalDateTime());
        System.out.println("Source_StreamSize_Encoded/String4 AS LocalDateTime === " + jMetaDataAudio.getSourceStreamSizeEncodedString4AsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeEncodedString4AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedString4AsLocalTime());
        System.out.println("Source_StreamSize_Encoded/String4 AS LocalTime === " + jMetaDataAudio.getSourceStreamSizeEncodedString4AsLocalTime());
    }

   /**
    * Test getSourceStreamSizeEncodedString4AsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsString() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedString4AsString());
        System.out.println("Source_StreamSize_Encoded/String4 AS String === " + jMetaDataAudio.getSourceStreamSizeEncodedString4AsString());
    }

   /**
    * Test getSourceStreamSizeEncodedString4AsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedString4AsBoolean());
        System.out.println("Source_StreamSize_Encoded/String4 AS Boolean === " + jMetaDataAudio.getSourceStreamSizeEncodedString4AsBoolean());
    }

   /**
    * Test getSourceStreamSizeEncodedString4AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedString4AsBigInteger());
        System.out.println("Source_StreamSize_Encoded/String4 AS BigInteger === " + jMetaDataAudio.getSourceStreamSizeEncodedString4AsBigInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedString4AsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsURL() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedString4AsURL());
        System.out.println("Source_StreamSize_Encoded/String4 AS URL === " + jMetaDataAudio.getSourceStreamSizeEncodedString4AsURL());
    }

   /**
    * Test getSourceStreamSizeEncodedString5AsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedString5AsInteger());
        System.out.println("Source Encoded Streamsize in with percentage value AS Integer === " + jMetaDataAudio.getSourceStreamSizeEncodedString5AsInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedString5AsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsLong() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedString5AsLong());
        System.out.println("Source Encoded Streamsize in with percentage value AS Long === " + jMetaDataAudio.getSourceStreamSizeEncodedString5AsLong());
    }

   /**
    * Test getSourceStreamSizeEncodedString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedString5AsLocalDateTime());
        System.out.println("Source Encoded Streamsize in with percentage value AS LocalDateTime === " + jMetaDataAudio.getSourceStreamSizeEncodedString5AsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeEncodedString5AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedString5AsLocalTime());
        System.out.println("Source Encoded Streamsize in with percentage value AS LocalTime === " + jMetaDataAudio.getSourceStreamSizeEncodedString5AsLocalTime());
    }

   /**
    * Test getSourceStreamSizeEncodedString5AsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsString() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedString5AsString());
        System.out.println("Source Encoded Streamsize in with percentage value AS String === " + jMetaDataAudio.getSourceStreamSizeEncodedString5AsString());
    }

   /**
    * Test getSourceStreamSizeEncodedString5AsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedString5AsBoolean());
        System.out.println("Source Encoded Streamsize in with percentage value AS Boolean === " + jMetaDataAudio.getSourceStreamSizeEncodedString5AsBoolean());
    }

   /**
    * Test getSourceStreamSizeEncodedString5AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedString5AsBigInteger());
        System.out.println("Source Encoded Streamsize in with percentage value AS BigInteger === " + jMetaDataAudio.getSourceStreamSizeEncodedString5AsBigInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedString5AsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsURL() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedString5AsURL());
        System.out.println("Source Encoded Streamsize in with percentage value AS URL === " + jMetaDataAudio.getSourceStreamSizeEncodedString5AsURL());
    }

   /**
    * Test getSourceDurationFirstFrameString1AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameString1AsInteger());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS Integer === " + jMetaDataAudio.getSourceDurationFirstFrameString1AsInteger());
    }

   /**
    * Test getSourceDurationFirstFrameString1AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsLong() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameString1AsLong());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS Long === " + jMetaDataAudio.getSourceDurationFirstFrameString1AsLong());
    }

   /**
    * Test getSourceDurationFirstFrameString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameString1AsLocalDateTime());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS LocalDateTime === " + jMetaDataAudio.getSourceDurationFirstFrameString1AsLocalDateTime());
    }

   /**
    * Test getSourceDurationFirstFrameString1AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameString1AsLocalTime());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS LocalTime === " + jMetaDataAudio.getSourceDurationFirstFrameString1AsLocalTime());
    }

   /**
    * Test getSourceDurationFirstFrameString1AsString() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsString() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameString1AsString());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS String === " + jMetaDataAudio.getSourceDurationFirstFrameString1AsString());
    }

   /**
    * Test getSourceDurationFirstFrameString1AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameString1AsBoolean());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS Boolean === " + jMetaDataAudio.getSourceDurationFirstFrameString1AsBoolean());
    }

   /**
    * Test getSourceDurationFirstFrameString1AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameString1AsBigInteger());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS BigInteger === " + jMetaDataAudio.getSourceDurationFirstFrameString1AsBigInteger());
    }

   /**
    * Test getSourceDurationFirstFrameString1AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsURL() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameString1AsURL());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS URL === " + jMetaDataAudio.getSourceDurationFirstFrameString1AsURL());
    }

   /**
    * Test getSourceDurationFirstFrameString2AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameString2AsInteger());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Integer === " + jMetaDataAudio.getSourceDurationFirstFrameString2AsInteger());
    }

   /**
    * Test getSourceDurationFirstFrameString2AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsLong() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameString2AsLong());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Long === " + jMetaDataAudio.getSourceDurationFirstFrameString2AsLong());
    }

   /**
    * Test getSourceDurationFirstFrameString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameString2AsLocalDateTime());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS LocalDateTime === " + jMetaDataAudio.getSourceDurationFirstFrameString2AsLocalDateTime());
    }

   /**
    * Test getSourceDurationFirstFrameString2AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameString2AsLocalTime());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS LocalTime === " + jMetaDataAudio.getSourceDurationFirstFrameString2AsLocalTime());
    }

   /**
    * Test getSourceDurationFirstFrameString2AsString() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsString() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameString2AsString());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS String === " + jMetaDataAudio.getSourceDurationFirstFrameString2AsString());
    }

   /**
    * Test getSourceDurationFirstFrameString2AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameString2AsBoolean());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Boolean === " + jMetaDataAudio.getSourceDurationFirstFrameString2AsBoolean());
    }

   /**
    * Test getSourceDurationFirstFrameString2AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameString2AsBigInteger());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS BigInteger === " + jMetaDataAudio.getSourceDurationFirstFrameString2AsBigInteger());
    }

   /**
    * Test getSourceDurationFirstFrameString2AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsURL() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameString2AsURL());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS URL === " + jMetaDataAudio.getSourceDurationFirstFrameString2AsURL());
    }

   /**
    * Test getSourceDurationFirstFrameString3AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameString3AsInteger());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM AS Integer === " + jMetaDataAudio.getSourceDurationFirstFrameString3AsInteger());
    }

   /**
    * Test getSourceDurationFirstFrameString3AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsLong() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameString3AsLong());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM AS Long === " + jMetaDataAudio.getSourceDurationFirstFrameString3AsLong());
    }

   /**
    * Test getSourceDurationFirstFrameString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameString3AsLocalDateTime());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM AS LocalDateTime === " + jMetaDataAudio.getSourceDurationFirstFrameString3AsLocalDateTime());
    }

   /**
    * Test getSourceDurationFirstFrameString3AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameString3AsLocalTime());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM AS LocalTime === " + jMetaDataAudio.getSourceDurationFirstFrameString3AsLocalTime());
    }

   /**
    * Test getSourceDurationFirstFrameString3AsString() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsString() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameString3AsString());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM AS String === " + jMetaDataAudio.getSourceDurationFirstFrameString3AsString());
    }

   /**
    * Test getSourceDurationFirstFrameString3AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameString3AsBoolean());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM AS Boolean === " + jMetaDataAudio.getSourceDurationFirstFrameString3AsBoolean());
    }

   /**
    * Test getSourceDurationFirstFrameString3AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameString3AsBigInteger());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM AS BigInteger === " + jMetaDataAudio.getSourceDurationFirstFrameString3AsBigInteger());
    }

   /**
    * Test getSourceDurationFirstFrameString3AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsURL() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameString3AsURL());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM AS URL === " + jMetaDataAudio.getSourceDurationFirstFrameString3AsURL());
    }

   /**
    * Test getEncodedLibraryAsInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryAsInteger());
        System.out.println("Software used to create the file AS Integer === " + jMetaDataAudio.getEncodedLibraryAsInteger());
    }

   /**
    * Test getEncodedLibraryAsLong() method.
    */
    @Test
    public void subTestGetEncodedLibraryAsLong() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryAsLong());
        System.out.println("Software used to create the file AS Long === " + jMetaDataAudio.getEncodedLibraryAsLong());
    }

   /**
    * Test getEncodedLibraryAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryAsLocalDateTime());
        System.out.println("Software used to create the file AS LocalDateTime === " + jMetaDataAudio.getEncodedLibraryAsLocalDateTime());
    }

   /**
    * Test getEncodedLibraryAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryAsLocalTime());
        System.out.println("Software used to create the file AS LocalTime === " + jMetaDataAudio.getEncodedLibraryAsLocalTime());
    }

   /**
    * Test getEncodedLibraryAsString() method.
    */
    @Test
    public void subTestGetEncodedLibraryAsString() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryAsString());
        System.out.println("Software used to create the file AS String === " + jMetaDataAudio.getEncodedLibraryAsString());
    }

   /**
    * Test getEncodedLibraryAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedLibraryAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryAsBoolean());
        System.out.println("Software used to create the file AS Boolean === " + jMetaDataAudio.getEncodedLibraryAsBoolean());
    }

   /**
    * Test getEncodedLibraryAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryAsBigInteger());
        System.out.println("Software used to create the file AS BigInteger === " + jMetaDataAudio.getEncodedLibraryAsBigInteger());
    }

   /**
    * Test getEncodedLibraryAsURL() method.
    */
    @Test
    public void subTestGetEncodedLibraryAsURL() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryAsURL());
        System.out.println("Software used to create the file AS URL === " + jMetaDataAudio.getEncodedLibraryAsURL());
    }

   /**
    * Test getSourceDurationFirstFrameString4AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameString4AsInteger());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Integer === " + jMetaDataAudio.getSourceDurationFirstFrameString4AsInteger());
    }

   /**
    * Test getSourceDurationFirstFrameString4AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsLong() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameString4AsLong());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Long === " + jMetaDataAudio.getSourceDurationFirstFrameString4AsLong());
    }

   /**
    * Test getSourceDurationFirstFrameString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameString4AsLocalDateTime());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS LocalDateTime === " + jMetaDataAudio.getSourceDurationFirstFrameString4AsLocalDateTime());
    }

   /**
    * Test getSourceDurationFirstFrameString4AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameString4AsLocalTime());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS LocalTime === " + jMetaDataAudio.getSourceDurationFirstFrameString4AsLocalTime());
    }

   /**
    * Test getSourceDurationFirstFrameString4AsString() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsString() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameString4AsString());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS String === " + jMetaDataAudio.getSourceDurationFirstFrameString4AsString());
    }

   /**
    * Test getSourceDurationFirstFrameString4AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameString4AsBoolean());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Boolean === " + jMetaDataAudio.getSourceDurationFirstFrameString4AsBoolean());
    }

   /**
    * Test getSourceDurationFirstFrameString4AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameString4AsBigInteger());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS BigInteger === " + jMetaDataAudio.getSourceDurationFirstFrameString4AsBigInteger());
    }

   /**
    * Test getSourceDurationFirstFrameString4AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsURL() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameString4AsURL());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS URL === " + jMetaDataAudio.getSourceDurationFirstFrameString4AsURL());
    }

   /**
    * Test getSourceDurationFirstFrameString5AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameString5AsInteger());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Integer === " + jMetaDataAudio.getSourceDurationFirstFrameString5AsInteger());
    }

   /**
    * Test getSourceDurationFirstFrameString5AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsLong() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameString5AsLong());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Long === " + jMetaDataAudio.getSourceDurationFirstFrameString5AsLong());
    }

   /**
    * Test getSourceDurationFirstFrameString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameString5AsLocalDateTime());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS LocalDateTime === " + jMetaDataAudio.getSourceDurationFirstFrameString5AsLocalDateTime());
    }

   /**
    * Test getSourceDurationFirstFrameString5AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameString5AsLocalTime());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS LocalTime === " + jMetaDataAudio.getSourceDurationFirstFrameString5AsLocalTime());
    }

   /**
    * Test getSourceDurationFirstFrameString5AsString() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsString() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameString5AsString());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS String === " + jMetaDataAudio.getSourceDurationFirstFrameString5AsString());
    }

   /**
    * Test getSourceDurationFirstFrameString5AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameString5AsBoolean());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Boolean === " + jMetaDataAudio.getSourceDurationFirstFrameString5AsBoolean());
    }

   /**
    * Test getSourceDurationFirstFrameString5AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameString5AsBigInteger());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS BigInteger === " + jMetaDataAudio.getSourceDurationFirstFrameString5AsBigInteger());
    }

   /**
    * Test getSourceDurationFirstFrameString5AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsURL() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameString5AsURL());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS URL === " + jMetaDataAudio.getSourceDurationFirstFrameString5AsURL());
    }

   /**
    * Test getInternetMediaTypeAsInteger() method.
    */
    @Test
    public void subTestGetInternetMediaTypeAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getInternetMediaTypeAsInteger());
        System.out.println("Internet Media Type (aka MIME Type, Content-Type) AS Integer === " + jMetaDataAudio.getInternetMediaTypeAsInteger());
    }

   /**
    * Test getInternetMediaTypeAsLong() method.
    */
    @Test
    public void subTestGetInternetMediaTypeAsLong() {
        assertEquals(null, this.jMetaDataAudio.getInternetMediaTypeAsLong());
        System.out.println("Internet Media Type (aka MIME Type, Content-Type) AS Long === " + jMetaDataAudio.getInternetMediaTypeAsLong());
    }

   /**
    * Test getInternetMediaTypeAsLocalDateTime() method.
    */
    @Test
    public void subTestGetInternetMediaTypeAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getInternetMediaTypeAsLocalDateTime());
        System.out.println("Internet Media Type (aka MIME Type, Content-Type) AS LocalDateTime === " + jMetaDataAudio.getInternetMediaTypeAsLocalDateTime());
    }

   /**
    * Test getInternetMediaTypeAsLocalTime() method.
    */
    @Test
    public void subTestGetInternetMediaTypeAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getInternetMediaTypeAsLocalTime());
        System.out.println("Internet Media Type (aka MIME Type, Content-Type) AS LocalTime === " + jMetaDataAudio.getInternetMediaTypeAsLocalTime());
    }

   /**
    * Test getInternetMediaTypeAsString() method.
    */
    @Test
    public void subTestGetInternetMediaTypeAsString() {
        assertEquals(null, this.jMetaDataAudio.getInternetMediaTypeAsString());
        System.out.println("Internet Media Type (aka MIME Type, Content-Type) AS String === " + jMetaDataAudio.getInternetMediaTypeAsString());
    }

   /**
    * Test getInternetMediaTypeAsBoolean() method.
    */
    @Test
    public void subTestGetInternetMediaTypeAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getInternetMediaTypeAsBoolean());
        System.out.println("Internet Media Type (aka MIME Type, Content-Type) AS Boolean === " + jMetaDataAudio.getInternetMediaTypeAsBoolean());
    }

   /**
    * Test getInternetMediaTypeAsBigInteger() method.
    */
    @Test
    public void subTestGetInternetMediaTypeAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getInternetMediaTypeAsBigInteger());
        System.out.println("Internet Media Type (aka MIME Type, Content-Type) AS BigInteger === " + jMetaDataAudio.getInternetMediaTypeAsBigInteger());
    }

   /**
    * Test getInternetMediaTypeAsURL() method.
    */
    @Test
    public void subTestGetInternetMediaTypeAsURL() {
        assertEquals(null, this.jMetaDataAudio.getInternetMediaTypeAsURL());
        System.out.println("Internet Media Type (aka MIME Type, Content-Type) AS URL === " + jMetaDataAudio.getInternetMediaTypeAsURL());
    }

   /**
    * Test getSourceStreamSizeEncodedString2AsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedString2AsInteger());
        System.out.println("Source_StreamSize_Encoded/String2 AS Integer === " + jMetaDataAudio.getSourceStreamSizeEncodedString2AsInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedString2AsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsLong() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedString2AsLong());
        System.out.println("Source_StreamSize_Encoded/String2 AS Long === " + jMetaDataAudio.getSourceStreamSizeEncodedString2AsLong());
    }

   /**
    * Test getSourceStreamSizeEncodedString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedString2AsLocalDateTime());
        System.out.println("Source_StreamSize_Encoded/String2 AS LocalDateTime === " + jMetaDataAudio.getSourceStreamSizeEncodedString2AsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeEncodedString2AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedString2AsLocalTime());
        System.out.println("Source_StreamSize_Encoded/String2 AS LocalTime === " + jMetaDataAudio.getSourceStreamSizeEncodedString2AsLocalTime());
    }

   /**
    * Test getSourceStreamSizeEncodedString2AsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsString() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedString2AsString());
        System.out.println("Source_StreamSize_Encoded/String2 AS String === " + jMetaDataAudio.getSourceStreamSizeEncodedString2AsString());
    }

   /**
    * Test getSourceStreamSizeEncodedString2AsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedString2AsBoolean());
        System.out.println("Source_StreamSize_Encoded/String2 AS Boolean === " + jMetaDataAudio.getSourceStreamSizeEncodedString2AsBoolean());
    }

   /**
    * Test getSourceStreamSizeEncodedString2AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedString2AsBigInteger());
        System.out.println("Source_StreamSize_Encoded/String2 AS BigInteger === " + jMetaDataAudio.getSourceStreamSizeEncodedString2AsBigInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedString2AsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsURL() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedString2AsURL());
        System.out.println("Source_StreamSize_Encoded/String2 AS URL === " + jMetaDataAudio.getSourceStreamSizeEncodedString2AsURL());
    }

   /**
    * Test getDisabledAsInteger() method.
    */
    @Test
    public void subTestGetDisabledAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDisabledAsInteger());
        System.out.println("Set if that track should not be used AS Integer === " + jMetaDataAudio.getDisabledAsInteger());
    }

   /**
    * Test getDisabledAsLong() method.
    */
    @Test
    public void subTestGetDisabledAsLong() {
        assertEquals(null, this.jMetaDataAudio.getDisabledAsLong());
        System.out.println("Set if that track should not be used AS Long === " + jMetaDataAudio.getDisabledAsLong());
    }

   /**
    * Test getDisabledAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDisabledAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDisabledAsLocalDateTime());
        System.out.println("Set if that track should not be used AS LocalDateTime === " + jMetaDataAudio.getDisabledAsLocalDateTime());
    }

   /**
    * Test getDisabledAsLocalTime() method.
    */
    @Test
    public void subTestGetDisabledAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDisabledAsLocalTime());
        System.out.println("Set if that track should not be used AS LocalTime === " + jMetaDataAudio.getDisabledAsLocalTime());
    }

   /**
    * Test getDisabledAsString() method.
    */
    @Test
    public void subTestGetDisabledAsString() {
        assertEquals(null, this.jMetaDataAudio.getDisabledAsString());
        System.out.println("Set if that track should not be used AS String === " + jMetaDataAudio.getDisabledAsString());
    }

   /**
    * Test getDisabledAsBoolean() method.
    */
    @Test
    public void subTestGetDisabledAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDisabledAsBoolean());
        System.out.println("Set if that track should not be used AS Boolean === " + jMetaDataAudio.getDisabledAsBoolean());
    }

   /**
    * Test getDisabledAsBigInteger() method.
    */
    @Test
    public void subTestGetDisabledAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDisabledAsBigInteger());
        System.out.println("Set if that track should not be used AS BigInteger === " + jMetaDataAudio.getDisabledAsBigInteger());
    }

   /**
    * Test getDisabledAsURL() method.
    */
    @Test
    public void subTestGetDisabledAsURL() {
        assertEquals(null, this.jMetaDataAudio.getDisabledAsURL());
        System.out.println("Set if that track should not be used AS URL === " + jMetaDataAudio.getDisabledAsURL());
    }

   /**
    * Test getChannelsOriginalAsInteger() method.
    */
    @Test
    public void subTestGetChannelsOriginalAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getChannelsOriginalAsInteger());
        System.out.println("Number of channels AS Integer === " + jMetaDataAudio.getChannelsOriginalAsInteger());
    }

   /**
    * Test getChannelsOriginalAsLong() method.
    */
    @Test
    public void subTestGetChannelsOriginalAsLong() {
        assertEquals(null, this.jMetaDataAudio.getChannelsOriginalAsLong());
        System.out.println("Number of channels AS Long === " + jMetaDataAudio.getChannelsOriginalAsLong());
    }

   /**
    * Test getChannelsOriginalAsLocalDateTime() method.
    */
    @Test
    public void subTestGetChannelsOriginalAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getChannelsOriginalAsLocalDateTime());
        System.out.println("Number of channels AS LocalDateTime === " + jMetaDataAudio.getChannelsOriginalAsLocalDateTime());
    }

   /**
    * Test getChannelsOriginalAsLocalTime() method.
    */
    @Test
    public void subTestGetChannelsOriginalAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getChannelsOriginalAsLocalTime());
        System.out.println("Number of channels AS LocalTime === " + jMetaDataAudio.getChannelsOriginalAsLocalTime());
    }

   /**
    * Test getChannelsOriginalAsString() method.
    */
    @Test
    public void subTestGetChannelsOriginalAsString() {
        assertEquals(null, this.jMetaDataAudio.getChannelsOriginalAsString());
        System.out.println("Number of channels AS String === " + jMetaDataAudio.getChannelsOriginalAsString());
    }

   /**
    * Test getChannelsOriginalAsBoolean() method.
    */
    @Test
    public void subTestGetChannelsOriginalAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getChannelsOriginalAsBoolean());
        System.out.println("Number of channels AS Boolean === " + jMetaDataAudio.getChannelsOriginalAsBoolean());
    }

   /**
    * Test getChannelsOriginalAsBigInteger() method.
    */
    @Test
    public void subTestGetChannelsOriginalAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getChannelsOriginalAsBigInteger());
        System.out.println("Number of channels AS BigInteger === " + jMetaDataAudio.getChannelsOriginalAsBigInteger());
    }

   /**
    * Test getChannelsOriginalAsURL() method.
    */
    @Test
    public void subTestGetChannelsOriginalAsURL() {
        assertEquals(null, this.jMetaDataAudio.getChannelsOriginalAsURL());
        System.out.println("Number of channels AS URL === " + jMetaDataAudio.getChannelsOriginalAsURL());
    }

   /**
    * Test getFrameRateDenAsInteger() method.
    */
    @Test
    public void subTestGetFrameRateDenAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getFrameRateDenAsInteger());
        System.out.println("Frames per second, denominator AS Integer === " + jMetaDataAudio.getFrameRateDenAsInteger());
    }

   /**
    * Test getFrameRateDenAsLong() method.
    */
    @Test
    public void subTestGetFrameRateDenAsLong() {
        assertEquals(null, this.jMetaDataAudio.getFrameRateDenAsLong());
        System.out.println("Frames per second, denominator AS Long === " + jMetaDataAudio.getFrameRateDenAsLong());
    }

   /**
    * Test getFrameRateDenAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFrameRateDenAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getFrameRateDenAsLocalDateTime());
        System.out.println("Frames per second, denominator AS LocalDateTime === " + jMetaDataAudio.getFrameRateDenAsLocalDateTime());
    }

   /**
    * Test getFrameRateDenAsLocalTime() method.
    */
    @Test
    public void subTestGetFrameRateDenAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getFrameRateDenAsLocalTime());
        System.out.println("Frames per second, denominator AS LocalTime === " + jMetaDataAudio.getFrameRateDenAsLocalTime());
    }

   /**
    * Test getFrameRateDenAsString() method.
    */
    @Test
    public void subTestGetFrameRateDenAsString() {
        assertEquals(null, this.jMetaDataAudio.getFrameRateDenAsString());
        System.out.println("Frames per second, denominator AS String === " + jMetaDataAudio.getFrameRateDenAsString());
    }

   /**
    * Test getFrameRateDenAsBoolean() method.
    */
    @Test
    public void subTestGetFrameRateDenAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getFrameRateDenAsBoolean());
        System.out.println("Frames per second, denominator AS Boolean === " + jMetaDataAudio.getFrameRateDenAsBoolean());
    }

   /**
    * Test getFrameRateDenAsBigInteger() method.
    */
    @Test
    public void subTestGetFrameRateDenAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getFrameRateDenAsBigInteger());
        System.out.println("Frames per second, denominator AS BigInteger === " + jMetaDataAudio.getFrameRateDenAsBigInteger());
    }

   /**
    * Test getFrameRateDenAsURL() method.
    */
    @Test
    public void subTestGetFrameRateDenAsURL() {
        assertEquals(null, this.jMetaDataAudio.getFrameRateDenAsURL());
        System.out.println("Frames per second, denominator AS URL === " + jMetaDataAudio.getFrameRateDenAsURL());
    }

   /**
    * Test getSourceStreamSizeEncodedString3AsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedString3AsInteger());
        System.out.println("Source_StreamSize_Encoded/String3 AS Integer === " + jMetaDataAudio.getSourceStreamSizeEncodedString3AsInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedString3AsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsLong() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedString3AsLong());
        System.out.println("Source_StreamSize_Encoded/String3 AS Long === " + jMetaDataAudio.getSourceStreamSizeEncodedString3AsLong());
    }

   /**
    * Test getSourceStreamSizeEncodedString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedString3AsLocalDateTime());
        System.out.println("Source_StreamSize_Encoded/String3 AS LocalDateTime === " + jMetaDataAudio.getSourceStreamSizeEncodedString3AsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeEncodedString3AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedString3AsLocalTime());
        System.out.println("Source_StreamSize_Encoded/String3 AS LocalTime === " + jMetaDataAudio.getSourceStreamSizeEncodedString3AsLocalTime());
    }

   /**
    * Test getSourceStreamSizeEncodedString3AsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsString() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedString3AsString());
        System.out.println("Source_StreamSize_Encoded/String3 AS String === " + jMetaDataAudio.getSourceStreamSizeEncodedString3AsString());
    }

   /**
    * Test getSourceStreamSizeEncodedString3AsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedString3AsBoolean());
        System.out.println("Source_StreamSize_Encoded/String3 AS Boolean === " + jMetaDataAudio.getSourceStreamSizeEncodedString3AsBoolean());
    }

   /**
    * Test getSourceStreamSizeEncodedString3AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedString3AsBigInteger());
        System.out.println("Source_StreamSize_Encoded/String3 AS BigInteger === " + jMetaDataAudio.getSourceStreamSizeEncodedString3AsBigInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedString3AsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsURL() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedString3AsURL());
        System.out.println("Source_StreamSize_Encoded/String3 AS URL === " + jMetaDataAudio.getSourceStreamSizeEncodedString3AsURL());
    }

   /**
    * Test getStreamSizeEncodedProportionAsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedProportionAsInteger());
        System.out.println("Encoded Stream size divided by file size AS Integer === " + jMetaDataAudio.getStreamSizeEncodedProportionAsInteger());
    }

   /**
    * Test getStreamSizeEncodedProportionAsLong() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsLong() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedProportionAsLong());
        System.out.println("Encoded Stream size divided by file size AS Long === " + jMetaDataAudio.getStreamSizeEncodedProportionAsLong());
    }

   /**
    * Test getStreamSizeEncodedProportionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedProportionAsLocalDateTime());
        System.out.println("Encoded Stream size divided by file size AS LocalDateTime === " + jMetaDataAudio.getStreamSizeEncodedProportionAsLocalDateTime());
    }

   /**
    * Test getStreamSizeEncodedProportionAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedProportionAsLocalTime());
        System.out.println("Encoded Stream size divided by file size AS LocalTime === " + jMetaDataAudio.getStreamSizeEncodedProportionAsLocalTime());
    }

   /**
    * Test getStreamSizeEncodedProportionAsString() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsString() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedProportionAsString());
        System.out.println("Encoded Stream size divided by file size AS String === " + jMetaDataAudio.getStreamSizeEncodedProportionAsString());
    }

   /**
    * Test getStreamSizeEncodedProportionAsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedProportionAsBoolean());
        System.out.println("Encoded Stream size divided by file size AS Boolean === " + jMetaDataAudio.getStreamSizeEncodedProportionAsBoolean());
    }

   /**
    * Test getStreamSizeEncodedProportionAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedProportionAsBigInteger());
        System.out.println("Encoded Stream size divided by file size AS BigInteger === " + jMetaDataAudio.getStreamSizeEncodedProportionAsBigInteger());
    }

   /**
    * Test getStreamSizeEncodedProportionAsURL() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsURL() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedProportionAsURL());
        System.out.println("Encoded Stream size divided by file size AS URL === " + jMetaDataAudio.getStreamSizeEncodedProportionAsURL());
    }

   /**
    * Test getSourceStreamSizeEncodedString1AsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedString1AsInteger());
        System.out.println("Source_StreamSize_Encoded/String1 AS Integer === " + jMetaDataAudio.getSourceStreamSizeEncodedString1AsInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedString1AsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsLong() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedString1AsLong());
        System.out.println("Source_StreamSize_Encoded/String1 AS Long === " + jMetaDataAudio.getSourceStreamSizeEncodedString1AsLong());
    }

   /**
    * Test getSourceStreamSizeEncodedString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedString1AsLocalDateTime());
        System.out.println("Source_StreamSize_Encoded/String1 AS LocalDateTime === " + jMetaDataAudio.getSourceStreamSizeEncodedString1AsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeEncodedString1AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedString1AsLocalTime());
        System.out.println("Source_StreamSize_Encoded/String1 AS LocalTime === " + jMetaDataAudio.getSourceStreamSizeEncodedString1AsLocalTime());
    }

   /**
    * Test getSourceStreamSizeEncodedString1AsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsString() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedString1AsString());
        System.out.println("Source_StreamSize_Encoded/String1 AS String === " + jMetaDataAudio.getSourceStreamSizeEncodedString1AsString());
    }

   /**
    * Test getSourceStreamSizeEncodedString1AsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedString1AsBoolean());
        System.out.println("Source_StreamSize_Encoded/String1 AS Boolean === " + jMetaDataAudio.getSourceStreamSizeEncodedString1AsBoolean());
    }

   /**
    * Test getSourceStreamSizeEncodedString1AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedString1AsBigInteger());
        System.out.println("Source_StreamSize_Encoded/String1 AS BigInteger === " + jMetaDataAudio.getSourceStreamSizeEncodedString1AsBigInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedString1AsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsURL() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedString1AsURL());
        System.out.println("Source_StreamSize_Encoded/String1 AS URL === " + jMetaDataAudio.getSourceStreamSizeEncodedString1AsURL());
    }

   /**
    * Test getChannelPositionsAsInteger() method.
    */
    @Test
    public void subTestGetChannelPositionsAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getChannelPositionsAsInteger());
        System.out.println("Position of channels AS Integer === " + jMetaDataAudio.getChannelPositionsAsInteger());
    }

   /**
    * Test getChannelPositionsAsLong() method.
    */
    @Test
    public void subTestGetChannelPositionsAsLong() {
        assertEquals(null, this.jMetaDataAudio.getChannelPositionsAsLong());
        System.out.println("Position of channels AS Long === " + jMetaDataAudio.getChannelPositionsAsLong());
    }

   /**
    * Test getChannelPositionsAsLocalDateTime() method.
    */
    @Test
    public void subTestGetChannelPositionsAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getChannelPositionsAsLocalDateTime());
        System.out.println("Position of channels AS LocalDateTime === " + jMetaDataAudio.getChannelPositionsAsLocalDateTime());
    }

   /**
    * Test getChannelPositionsAsLocalTime() method.
    */
    @Test
    public void subTestGetChannelPositionsAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getChannelPositionsAsLocalTime());
        System.out.println("Position of channels AS LocalTime === " + jMetaDataAudio.getChannelPositionsAsLocalTime());
    }

   /**
    * Test getChannelPositionsAsString() method.
    */
    @Test
    public void subTestGetChannelPositionsAsString() {
        assertEquals(null, this.jMetaDataAudio.getChannelPositionsAsString());
        System.out.println("Position of channels AS String === " + jMetaDataAudio.getChannelPositionsAsString());
    }

   /**
    * Test getChannelPositionsAsBoolean() method.
    */
    @Test
    public void subTestGetChannelPositionsAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getChannelPositionsAsBoolean());
        System.out.println("Position of channels AS Boolean === " + jMetaDataAudio.getChannelPositionsAsBoolean());
    }

   /**
    * Test getChannelPositionsAsBigInteger() method.
    */
    @Test
    public void subTestGetChannelPositionsAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getChannelPositionsAsBigInteger());
        System.out.println("Position of channels AS BigInteger === " + jMetaDataAudio.getChannelPositionsAsBigInteger());
    }

   /**
    * Test getChannelPositionsAsURL() method.
    */
    @Test
    public void subTestGetChannelPositionsAsURL() {
        assertEquals(null, this.jMetaDataAudio.getChannelPositionsAsURL());
        System.out.println("Position of channels AS URL === " + jMetaDataAudio.getChannelPositionsAsURL());
    }

   /**
    * Test getDurationAsInteger() method.
    */
    @Test
    public void subTestGetDurationAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDurationAsInteger());
        System.out.println("Play time of the stream, in ms AS Integer === " + jMetaDataAudio.getDurationAsInteger());
    }

   /**
    * Test getDurationAsLong() method.
    */
    @Test
    public void subTestGetDurationAsLong() {
        assertEquals(null, this.jMetaDataAudio.getDurationAsLong());
        System.out.println("Play time of the stream, in ms AS Long === " + jMetaDataAudio.getDurationAsLong());
    }

   /**
    * Test getDurationAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDurationAsLocalDateTime());
        System.out.println("Play time of the stream, in ms AS LocalDateTime === " + jMetaDataAudio.getDurationAsLocalDateTime());
    }

   /**
    * Test getDurationAsLocalTime() method.
    */
    @Test
    public void subTestGetDurationAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDurationAsLocalTime());
        System.out.println("Play time of the stream, in ms AS LocalTime === " + jMetaDataAudio.getDurationAsLocalTime());
    }

   /**
    * Test getDurationAsString() method.
    */
    @Test
    public void subTestGetDurationAsString() {
        assertEquals(null, this.jMetaDataAudio.getDurationAsString());
        System.out.println("Play time of the stream, in ms AS String === " + jMetaDataAudio.getDurationAsString());
    }

   /**
    * Test getDurationAsBoolean() method.
    */
    @Test
    public void subTestGetDurationAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDurationAsBoolean());
        System.out.println("Play time of the stream, in ms AS Boolean === " + jMetaDataAudio.getDurationAsBoolean());
    }

   /**
    * Test getDurationAsBigInteger() method.
    */
    @Test
    public void subTestGetDurationAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDurationAsBigInteger());
        System.out.println("Play time of the stream, in ms AS BigInteger === " + jMetaDataAudio.getDurationAsBigInteger());
    }

   /**
    * Test getDurationAsURL() method.
    */
    @Test
    public void subTestGetDurationAsURL() {
        assertEquals(null, this.jMetaDataAudio.getDurationAsURL());
        System.out.println("Play time of the stream, in ms AS URL === " + jMetaDataAudio.getDurationAsURL());
    }

   /**
    * Test getSourceDurationString5AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationString5AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationString5AsInteger());
        System.out.println("Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Integer === " + jMetaDataAudio.getSourceDurationString5AsInteger());
    }

   /**
    * Test getSourceDurationString5AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationString5AsLong() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationString5AsLong());
        System.out.println("Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Long === " + jMetaDataAudio.getSourceDurationString5AsLong());
    }

   /**
    * Test getSourceDurationString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationString5AsLocalDateTime());
        System.out.println("Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS LocalDateTime === " + jMetaDataAudio.getSourceDurationString5AsLocalDateTime());
    }

   /**
    * Test getSourceDurationString5AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationString5AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationString5AsLocalTime());
        System.out.println("Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS LocalTime === " + jMetaDataAudio.getSourceDurationString5AsLocalTime());
    }

   /**
    * Test getSourceDurationString5AsString() method.
    */
    @Test
    public void subTestGetSourceDurationString5AsString() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationString5AsString());
        System.out.println("Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS String === " + jMetaDataAudio.getSourceDurationString5AsString());
    }

   /**
    * Test getSourceDurationString5AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationString5AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationString5AsBoolean());
        System.out.println("Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Boolean === " + jMetaDataAudio.getSourceDurationString5AsBoolean());
    }

   /**
    * Test getSourceDurationString5AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationString5AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationString5AsBigInteger());
        System.out.println("Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS BigInteger === " + jMetaDataAudio.getSourceDurationString5AsBigInteger());
    }

   /**
    * Test getSourceDurationString5AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationString5AsURL() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationString5AsURL());
        System.out.println("Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS URL === " + jMetaDataAudio.getSourceDurationString5AsURL());
    }

   /**
    * Test getDurationLastFrameStringAsInteger() method.
    */
    @Test
    public void subTestGetDurationLastFrameStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameStringAsInteger());
        System.out.println("Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Integer === " + jMetaDataAudio.getDurationLastFrameStringAsInteger());
    }

   /**
    * Test getDurationLastFrameStringAsLong() method.
    */
    @Test
    public void subTestGetDurationLastFrameStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameStringAsLong());
        System.out.println("Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Long === " + jMetaDataAudio.getDurationLastFrameStringAsLong());
    }

   /**
    * Test getDurationLastFrameStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationLastFrameStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameStringAsLocalDateTime());
        System.out.println("Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS LocalDateTime === " + jMetaDataAudio.getDurationLastFrameStringAsLocalDateTime());
    }

   /**
    * Test getDurationLastFrameStringAsLocalTime() method.
    */
    @Test
    public void subTestGetDurationLastFrameStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameStringAsLocalTime());
        System.out.println("Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS LocalTime === " + jMetaDataAudio.getDurationLastFrameStringAsLocalTime());
    }

   /**
    * Test getDurationLastFrameStringAsString() method.
    */
    @Test
    public void subTestGetDurationLastFrameStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameStringAsString());
        System.out.println("Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS String === " + jMetaDataAudio.getDurationLastFrameStringAsString());
    }

   /**
    * Test getDurationLastFrameStringAsBoolean() method.
    */
    @Test
    public void subTestGetDurationLastFrameStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameStringAsBoolean());
        System.out.println("Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Boolean === " + jMetaDataAudio.getDurationLastFrameStringAsBoolean());
    }

   /**
    * Test getDurationLastFrameStringAsBigInteger() method.
    */
    @Test
    public void subTestGetDurationLastFrameStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameStringAsBigInteger());
        System.out.println("Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS BigInteger === " + jMetaDataAudio.getDurationLastFrameStringAsBigInteger());
    }

   /**
    * Test getDurationLastFrameStringAsURL() method.
    */
    @Test
    public void subTestGetDurationLastFrameStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameStringAsURL());
        System.out.println("Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS URL === " + jMetaDataAudio.getDurationLastFrameStringAsURL());
    }

   /**
    * Test getSourceDurationString4AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationString4AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationString4AsInteger());
        System.out.println("Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Integer === " + jMetaDataAudio.getSourceDurationString4AsInteger());
    }

   /**
    * Test getSourceDurationString4AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationString4AsLong() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationString4AsLong());
        System.out.println("Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Long === " + jMetaDataAudio.getSourceDurationString4AsLong());
    }

   /**
    * Test getSourceDurationString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationString4AsLocalDateTime());
        System.out.println("Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS LocalDateTime === " + jMetaDataAudio.getSourceDurationString4AsLocalDateTime());
    }

   /**
    * Test getSourceDurationString4AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationString4AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationString4AsLocalTime());
        System.out.println("Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS LocalTime === " + jMetaDataAudio.getSourceDurationString4AsLocalTime());
    }

   /**
    * Test getSourceDurationString4AsString() method.
    */
    @Test
    public void subTestGetSourceDurationString4AsString() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationString4AsString());
        System.out.println("Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS String === " + jMetaDataAudio.getSourceDurationString4AsString());
    }

   /**
    * Test getSourceDurationString4AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationString4AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationString4AsBoolean());
        System.out.println("Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Boolean === " + jMetaDataAudio.getSourceDurationString4AsBoolean());
    }

   /**
    * Test getSourceDurationString4AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationString4AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationString4AsBigInteger());
        System.out.println("Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS BigInteger === " + jMetaDataAudio.getSourceDurationString4AsBigInteger());
    }

   /**
    * Test getSourceDurationString4AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationString4AsURL() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationString4AsURL());
        System.out.println("Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS URL === " + jMetaDataAudio.getSourceDurationString4AsURL());
    }

   /**
    * Test getSourceDurationString3AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationString3AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationString3AsInteger());
        System.out.println("Source Play time in format : HH:MM:SS.MMM AS Integer === " + jMetaDataAudio.getSourceDurationString3AsInteger());
    }

   /**
    * Test getSourceDurationString3AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationString3AsLong() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationString3AsLong());
        System.out.println("Source Play time in format : HH:MM:SS.MMM AS Long === " + jMetaDataAudio.getSourceDurationString3AsLong());
    }

   /**
    * Test getSourceDurationString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationString3AsLocalDateTime());
        System.out.println("Source Play time in format : HH:MM:SS.MMM AS LocalDateTime === " + jMetaDataAudio.getSourceDurationString3AsLocalDateTime());
    }

   /**
    * Test getSourceDurationString3AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationString3AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationString3AsLocalTime());
        System.out.println("Source Play time in format : HH:MM:SS.MMM AS LocalTime === " + jMetaDataAudio.getSourceDurationString3AsLocalTime());
    }

   /**
    * Test getSourceDurationString3AsString() method.
    */
    @Test
    public void subTestGetSourceDurationString3AsString() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationString3AsString());
        System.out.println("Source Play time in format : HH:MM:SS.MMM AS String === " + jMetaDataAudio.getSourceDurationString3AsString());
    }

   /**
    * Test getSourceDurationString3AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationString3AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationString3AsBoolean());
        System.out.println("Source Play time in format : HH:MM:SS.MMM AS Boolean === " + jMetaDataAudio.getSourceDurationString3AsBoolean());
    }

   /**
    * Test getSourceDurationString3AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationString3AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationString3AsBigInteger());
        System.out.println("Source Play time in format : HH:MM:SS.MMM AS BigInteger === " + jMetaDataAudio.getSourceDurationString3AsBigInteger());
    }

   /**
    * Test getSourceDurationString3AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationString3AsURL() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationString3AsURL());
        System.out.println("Source Play time in format : HH:MM:SS.MMM AS URL === " + jMetaDataAudio.getSourceDurationString3AsURL());
    }

   /**
    * Test getSourceDurationString2AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationString2AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationString2AsInteger());
        System.out.println("Source Play time in format : XXx YYy only, YYy omited if zero AS Integer === " + jMetaDataAudio.getSourceDurationString2AsInteger());
    }

   /**
    * Test getSourceDurationString2AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationString2AsLong() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationString2AsLong());
        System.out.println("Source Play time in format : XXx YYy only, YYy omited if zero AS Long === " + jMetaDataAudio.getSourceDurationString2AsLong());
    }

   /**
    * Test getSourceDurationString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationString2AsLocalDateTime());
        System.out.println("Source Play time in format : XXx YYy only, YYy omited if zero AS LocalDateTime === " + jMetaDataAudio.getSourceDurationString2AsLocalDateTime());
    }

   /**
    * Test getSourceDurationString2AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationString2AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationString2AsLocalTime());
        System.out.println("Source Play time in format : XXx YYy only, YYy omited if zero AS LocalTime === " + jMetaDataAudio.getSourceDurationString2AsLocalTime());
    }

   /**
    * Test getSourceDurationString2AsString() method.
    */
    @Test
    public void subTestGetSourceDurationString2AsString() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationString2AsString());
        System.out.println("Source Play time in format : XXx YYy only, YYy omited if zero AS String === " + jMetaDataAudio.getSourceDurationString2AsString());
    }

   /**
    * Test getSourceDurationString2AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationString2AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationString2AsBoolean());
        System.out.println("Source Play time in format : XXx YYy only, YYy omited if zero AS Boolean === " + jMetaDataAudio.getSourceDurationString2AsBoolean());
    }

   /**
    * Test getSourceDurationString2AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationString2AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationString2AsBigInteger());
        System.out.println("Source Play time in format : XXx YYy only, YYy omited if zero AS BigInteger === " + jMetaDataAudio.getSourceDurationString2AsBigInteger());
    }

   /**
    * Test getSourceDurationString2AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationString2AsURL() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationString2AsURL());
        System.out.println("Source Play time in format : XXx YYy only, YYy omited if zero AS URL === " + jMetaDataAudio.getSourceDurationString2AsURL());
    }

   /**
    * Test getSourceDurationString1AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationString1AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationString1AsInteger());
        System.out.println("Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS Integer === " + jMetaDataAudio.getSourceDurationString1AsInteger());
    }

   /**
    * Test getSourceDurationString1AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationString1AsLong() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationString1AsLong());
        System.out.println("Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS Long === " + jMetaDataAudio.getSourceDurationString1AsLong());
    }

   /**
    * Test getSourceDurationString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationString1AsLocalDateTime());
        System.out.println("Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS LocalDateTime === " + jMetaDataAudio.getSourceDurationString1AsLocalDateTime());
    }

   /**
    * Test getSourceDurationString1AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationString1AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationString1AsLocalTime());
        System.out.println("Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS LocalTime === " + jMetaDataAudio.getSourceDurationString1AsLocalTime());
    }

   /**
    * Test getSourceDurationString1AsString() method.
    */
    @Test
    public void subTestGetSourceDurationString1AsString() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationString1AsString());
        System.out.println("Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS String === " + jMetaDataAudio.getSourceDurationString1AsString());
    }

   /**
    * Test getSourceDurationString1AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationString1AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationString1AsBoolean());
        System.out.println("Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS Boolean === " + jMetaDataAudio.getSourceDurationString1AsBoolean());
    }

   /**
    * Test getSourceDurationString1AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationString1AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationString1AsBigInteger());
        System.out.println("Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS BigInteger === " + jMetaDataAudio.getSourceDurationString1AsBigInteger());
    }

   /**
    * Test getSourceDurationString1AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationString1AsURL() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationString1AsURL());
        System.out.println("Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS URL === " + jMetaDataAudio.getSourceDurationString1AsURL());
    }

   /**
    * Test getCodecIDHintAsInteger() method.
    */
    @Test
    public void subTestGetCodecIDHintAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDHintAsInteger());
        System.out.println("Hint/popular name for this codec ID AS Integer === " + jMetaDataAudio.getCodecIDHintAsInteger());
    }

   /**
    * Test getCodecIDHintAsLong() method.
    */
    @Test
    public void subTestGetCodecIDHintAsLong() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDHintAsLong());
        System.out.println("Hint/popular name for this codec ID AS Long === " + jMetaDataAudio.getCodecIDHintAsLong());
    }

   /**
    * Test getCodecIDHintAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCodecIDHintAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDHintAsLocalDateTime());
        System.out.println("Hint/popular name for this codec ID AS LocalDateTime === " + jMetaDataAudio.getCodecIDHintAsLocalDateTime());
    }

   /**
    * Test getCodecIDHintAsLocalTime() method.
    */
    @Test
    public void subTestGetCodecIDHintAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDHintAsLocalTime());
        System.out.println("Hint/popular name for this codec ID AS LocalTime === " + jMetaDataAudio.getCodecIDHintAsLocalTime());
    }

   /**
    * Test getCodecIDHintAsString() method.
    */
    @Test
    public void subTestGetCodecIDHintAsString() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDHintAsString());
        System.out.println("Hint/popular name for this codec ID AS String === " + jMetaDataAudio.getCodecIDHintAsString());
    }

   /**
    * Test getCodecIDHintAsBoolean() method.
    */
    @Test
    public void subTestGetCodecIDHintAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDHintAsBoolean());
        System.out.println("Hint/popular name for this codec ID AS Boolean === " + jMetaDataAudio.getCodecIDHintAsBoolean());
    }

   /**
    * Test getCodecIDHintAsBigInteger() method.
    */
    @Test
    public void subTestGetCodecIDHintAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDHintAsBigInteger());
        System.out.println("Hint/popular name for this codec ID AS BigInteger === " + jMetaDataAudio.getCodecIDHintAsBigInteger());
    }

   /**
    * Test getCodecIDHintAsURL() method.
    */
    @Test
    public void subTestGetCodecIDHintAsURL() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDHintAsURL());
        System.out.println("Hint/popular name for this codec ID AS URL === " + jMetaDataAudio.getCodecIDHintAsURL());
    }

   /**
    * Test getMatrixChannelsAsInteger() method.
    */
    @Test
    public void subTestGetMatrixChannelsAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getMatrixChannelsAsInteger());
        System.out.println("Number of channels after matrix decoding AS Integer === " + jMetaDataAudio.getMatrixChannelsAsInteger());
    }

   /**
    * Test getMatrixChannelsAsLong() method.
    */
    @Test
    public void subTestGetMatrixChannelsAsLong() {
        assertEquals(null, this.jMetaDataAudio.getMatrixChannelsAsLong());
        System.out.println("Number of channels after matrix decoding AS Long === " + jMetaDataAudio.getMatrixChannelsAsLong());
    }

   /**
    * Test getMatrixChannelsAsLocalDateTime() method.
    */
    @Test
    public void subTestGetMatrixChannelsAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getMatrixChannelsAsLocalDateTime());
        System.out.println("Number of channels after matrix decoding AS LocalDateTime === " + jMetaDataAudio.getMatrixChannelsAsLocalDateTime());
    }

   /**
    * Test getMatrixChannelsAsLocalTime() method.
    */
    @Test
    public void subTestGetMatrixChannelsAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getMatrixChannelsAsLocalTime());
        System.out.println("Number of channels after matrix decoding AS LocalTime === " + jMetaDataAudio.getMatrixChannelsAsLocalTime());
    }

   /**
    * Test getMatrixChannelsAsString() method.
    */
    @Test
    public void subTestGetMatrixChannelsAsString() {
        assertEquals(null, this.jMetaDataAudio.getMatrixChannelsAsString());
        System.out.println("Number of channels after matrix decoding AS String === " + jMetaDataAudio.getMatrixChannelsAsString());
    }

   /**
    * Test getMatrixChannelsAsBoolean() method.
    */
    @Test
    public void subTestGetMatrixChannelsAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getMatrixChannelsAsBoolean());
        System.out.println("Number of channels after matrix decoding AS Boolean === " + jMetaDataAudio.getMatrixChannelsAsBoolean());
    }

   /**
    * Test getMatrixChannelsAsBigInteger() method.
    */
    @Test
    public void subTestGetMatrixChannelsAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getMatrixChannelsAsBigInteger());
        System.out.println("Number of channels after matrix decoding AS BigInteger === " + jMetaDataAudio.getMatrixChannelsAsBigInteger());
    }

   /**
    * Test getMatrixChannelsAsURL() method.
    */
    @Test
    public void subTestGetMatrixChannelsAsURL() {
        assertEquals(null, this.jMetaDataAudio.getMatrixChannelsAsURL());
        System.out.println("Number of channels after matrix decoding AS URL === " + jMetaDataAudio.getMatrixChannelsAsURL());
    }

   /**
    * Test getEncodedApplicationAsInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationAsInteger());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit AS Integer === " + jMetaDataAudio.getEncodedApplicationAsInteger());
    }

   /**
    * Test getEncodedApplicationAsLong() method.
    */
    @Test
    public void subTestGetEncodedApplicationAsLong() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationAsLong());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit AS Long === " + jMetaDataAudio.getEncodedApplicationAsLong());
    }

   /**
    * Test getEncodedApplicationAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationAsLocalDateTime());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit AS LocalDateTime === " + jMetaDataAudio.getEncodedApplicationAsLocalDateTime());
    }

   /**
    * Test getEncodedApplicationAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationAsLocalTime());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit AS LocalTime === " + jMetaDataAudio.getEncodedApplicationAsLocalTime());
    }

   /**
    * Test getEncodedApplicationAsString() method.
    */
    @Test
    public void subTestGetEncodedApplicationAsString() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationAsString());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit AS String === " + jMetaDataAudio.getEncodedApplicationAsString());
    }

   /**
    * Test getEncodedApplicationAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedApplicationAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationAsBoolean());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit AS Boolean === " + jMetaDataAudio.getEncodedApplicationAsBoolean());
    }

   /**
    * Test getEncodedApplicationAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationAsBigInteger());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit AS BigInteger === " + jMetaDataAudio.getEncodedApplicationAsBigInteger());
    }

   /**
    * Test getEncodedApplicationAsURL() method.
    */
    @Test
    public void subTestGetEncodedApplicationAsURL() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationAsURL());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit AS URL === " + jMetaDataAudio.getEncodedApplicationAsURL());
    }

   /**
    * Test getCompressionModeStringAsInteger() method.
    */
    @Test
    public void subTestGetCompressionModeStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getCompressionModeStringAsInteger());
        System.out.println("Compression mode (Lossy or Lossless) AS Integer === " + jMetaDataAudio.getCompressionModeStringAsInteger());
    }

   /**
    * Test getCompressionModeStringAsLong() method.
    */
    @Test
    public void subTestGetCompressionModeStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getCompressionModeStringAsLong());
        System.out.println("Compression mode (Lossy or Lossless) AS Long === " + jMetaDataAudio.getCompressionModeStringAsLong());
    }

   /**
    * Test getCompressionModeStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCompressionModeStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getCompressionModeStringAsLocalDateTime());
        System.out.println("Compression mode (Lossy or Lossless) AS LocalDateTime === " + jMetaDataAudio.getCompressionModeStringAsLocalDateTime());
    }

   /**
    * Test getCompressionModeStringAsLocalTime() method.
    */
    @Test
    public void subTestGetCompressionModeStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getCompressionModeStringAsLocalTime());
        System.out.println("Compression mode (Lossy or Lossless) AS LocalTime === " + jMetaDataAudio.getCompressionModeStringAsLocalTime());
    }

   /**
    * Test getCompressionModeStringAsString() method.
    */
    @Test
    public void subTestGetCompressionModeStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getCompressionModeStringAsString());
        System.out.println("Compression mode (Lossy or Lossless) AS String === " + jMetaDataAudio.getCompressionModeStringAsString());
    }

   /**
    * Test getCompressionModeStringAsBoolean() method.
    */
    @Test
    public void subTestGetCompressionModeStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getCompressionModeStringAsBoolean());
        System.out.println("Compression mode (Lossy or Lossless) AS Boolean === " + jMetaDataAudio.getCompressionModeStringAsBoolean());
    }

   /**
    * Test getCompressionModeStringAsBigInteger() method.
    */
    @Test
    public void subTestGetCompressionModeStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getCompressionModeStringAsBigInteger());
        System.out.println("Compression mode (Lossy or Lossless) AS BigInteger === " + jMetaDataAudio.getCompressionModeStringAsBigInteger());
    }

   /**
    * Test getCompressionModeStringAsURL() method.
    */
    @Test
    public void subTestGetCompressionModeStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getCompressionModeStringAsURL());
        System.out.println("Compression mode (Lossy or Lossless) AS URL === " + jMetaDataAudio.getCompressionModeStringAsURL());
    }

   /**
    * Test getStreamSizeString2AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeString2AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeString2AsInteger());
        System.out.println("StreamSize/String2 AS Integer === " + jMetaDataAudio.getStreamSizeString2AsInteger());
    }

   /**
    * Test getStreamSizeString2AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeString2AsLong() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeString2AsLong());
        System.out.println("StreamSize/String2 AS Long === " + jMetaDataAudio.getStreamSizeString2AsLong());
    }

   /**
    * Test getStreamSizeString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeString2AsLocalDateTime());
        System.out.println("StreamSize/String2 AS LocalDateTime === " + jMetaDataAudio.getStreamSizeString2AsLocalDateTime());
    }

   /**
    * Test getStreamSizeString2AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeString2AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeString2AsLocalTime());
        System.out.println("StreamSize/String2 AS LocalTime === " + jMetaDataAudio.getStreamSizeString2AsLocalTime());
    }

   /**
    * Test getStreamSizeString2AsString() method.
    */
    @Test
    public void subTestGetStreamSizeString2AsString() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeString2AsString());
        System.out.println("StreamSize/String2 AS String === " + jMetaDataAudio.getStreamSizeString2AsString());
    }

   /**
    * Test getStreamSizeString2AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeString2AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeString2AsBoolean());
        System.out.println("StreamSize/String2 AS Boolean === " + jMetaDataAudio.getStreamSizeString2AsBoolean());
    }

   /**
    * Test getStreamSizeString2AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeString2AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeString2AsBigInteger());
        System.out.println("StreamSize/String2 AS BigInteger === " + jMetaDataAudio.getStreamSizeString2AsBigInteger());
    }

   /**
    * Test getStreamSizeString2AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeString2AsURL() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeString2AsURL());
        System.out.println("StreamSize/String2 AS URL === " + jMetaDataAudio.getStreamSizeString2AsURL());
    }

   /**
    * Test getStreamSizeString1AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeString1AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeString1AsInteger());
        System.out.println("StreamSize/String1 AS Integer === " + jMetaDataAudio.getStreamSizeString1AsInteger());
    }

   /**
    * Test getStreamSizeString1AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeString1AsLong() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeString1AsLong());
        System.out.println("StreamSize/String1 AS Long === " + jMetaDataAudio.getStreamSizeString1AsLong());
    }

   /**
    * Test getStreamSizeString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeString1AsLocalDateTime());
        System.out.println("StreamSize/String1 AS LocalDateTime === " + jMetaDataAudio.getStreamSizeString1AsLocalDateTime());
    }

   /**
    * Test getStreamSizeString1AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeString1AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeString1AsLocalTime());
        System.out.println("StreamSize/String1 AS LocalTime === " + jMetaDataAudio.getStreamSizeString1AsLocalTime());
    }

   /**
    * Test getStreamSizeString1AsString() method.
    */
    @Test
    public void subTestGetStreamSizeString1AsString() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeString1AsString());
        System.out.println("StreamSize/String1 AS String === " + jMetaDataAudio.getStreamSizeString1AsString());
    }

   /**
    * Test getStreamSizeString1AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeString1AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeString1AsBoolean());
        System.out.println("StreamSize/String1 AS Boolean === " + jMetaDataAudio.getStreamSizeString1AsBoolean());
    }

   /**
    * Test getStreamSizeString1AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeString1AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeString1AsBigInteger());
        System.out.println("StreamSize/String1 AS BigInteger === " + jMetaDataAudio.getStreamSizeString1AsBigInteger());
    }

   /**
    * Test getStreamSizeString1AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeString1AsURL() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeString1AsURL());
        System.out.println("StreamSize/String1 AS URL === " + jMetaDataAudio.getStreamSizeString1AsURL());
    }

   /**
    * Test getStreamSizeString4AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeString4AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeString4AsInteger());
        System.out.println("StreamSize/String4 AS Integer === " + jMetaDataAudio.getStreamSizeString4AsInteger());
    }

   /**
    * Test getStreamSizeString4AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeString4AsLong() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeString4AsLong());
        System.out.println("StreamSize/String4 AS Long === " + jMetaDataAudio.getStreamSizeString4AsLong());
    }

   /**
    * Test getStreamSizeString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeString4AsLocalDateTime());
        System.out.println("StreamSize/String4 AS LocalDateTime === " + jMetaDataAudio.getStreamSizeString4AsLocalDateTime());
    }

   /**
    * Test getStreamSizeString4AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeString4AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeString4AsLocalTime());
        System.out.println("StreamSize/String4 AS LocalTime === " + jMetaDataAudio.getStreamSizeString4AsLocalTime());
    }

   /**
    * Test getStreamSizeString4AsString() method.
    */
    @Test
    public void subTestGetStreamSizeString4AsString() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeString4AsString());
        System.out.println("StreamSize/String4 AS String === " + jMetaDataAudio.getStreamSizeString4AsString());
    }

   /**
    * Test getStreamSizeString4AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeString4AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeString4AsBoolean());
        System.out.println("StreamSize/String4 AS Boolean === " + jMetaDataAudio.getStreamSizeString4AsBoolean());
    }

   /**
    * Test getStreamSizeString4AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeString4AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeString4AsBigInteger());
        System.out.println("StreamSize/String4 AS BigInteger === " + jMetaDataAudio.getStreamSizeString4AsBigInteger());
    }

   /**
    * Test getStreamSizeString4AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeString4AsURL() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeString4AsURL());
        System.out.println("StreamSize/String4 AS URL === " + jMetaDataAudio.getStreamSizeString4AsURL());
    }

   /**
    * Test getStreamSizeString3AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeString3AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeString3AsInteger());
        System.out.println("StreamSize/String3 AS Integer === " + jMetaDataAudio.getStreamSizeString3AsInteger());
    }

   /**
    * Test getStreamSizeString3AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeString3AsLong() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeString3AsLong());
        System.out.println("StreamSize/String3 AS Long === " + jMetaDataAudio.getStreamSizeString3AsLong());
    }

   /**
    * Test getStreamSizeString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeString3AsLocalDateTime());
        System.out.println("StreamSize/String3 AS LocalDateTime === " + jMetaDataAudio.getStreamSizeString3AsLocalDateTime());
    }

   /**
    * Test getStreamSizeString3AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeString3AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeString3AsLocalTime());
        System.out.println("StreamSize/String3 AS LocalTime === " + jMetaDataAudio.getStreamSizeString3AsLocalTime());
    }

   /**
    * Test getStreamSizeString3AsString() method.
    */
    @Test
    public void subTestGetStreamSizeString3AsString() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeString3AsString());
        System.out.println("StreamSize/String3 AS String === " + jMetaDataAudio.getStreamSizeString3AsString());
    }

   /**
    * Test getStreamSizeString3AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeString3AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeString3AsBoolean());
        System.out.println("StreamSize/String3 AS Boolean === " + jMetaDataAudio.getStreamSizeString3AsBoolean());
    }

   /**
    * Test getStreamSizeString3AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeString3AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeString3AsBigInteger());
        System.out.println("StreamSize/String3 AS BigInteger === " + jMetaDataAudio.getStreamSizeString3AsBigInteger());
    }

   /**
    * Test getStreamSizeString3AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeString3AsURL() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeString3AsURL());
        System.out.println("StreamSize/String3 AS URL === " + jMetaDataAudio.getStreamSizeString3AsURL());
    }

   /**
    * Test getStreamSizeString5AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeString5AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeString5AsInteger());
        System.out.println("Streamsize in with percentage value AS Integer === " + jMetaDataAudio.getStreamSizeString5AsInteger());
    }

   /**
    * Test getStreamSizeString5AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeString5AsLong() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeString5AsLong());
        System.out.println("Streamsize in with percentage value AS Long === " + jMetaDataAudio.getStreamSizeString5AsLong());
    }

   /**
    * Test getStreamSizeString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeString5AsLocalDateTime());
        System.out.println("Streamsize in with percentage value AS LocalDateTime === " + jMetaDataAudio.getStreamSizeString5AsLocalDateTime());
    }

   /**
    * Test getStreamSizeString5AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeString5AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeString5AsLocalTime());
        System.out.println("Streamsize in with percentage value AS LocalTime === " + jMetaDataAudio.getStreamSizeString5AsLocalTime());
    }

   /**
    * Test getStreamSizeString5AsString() method.
    */
    @Test
    public void subTestGetStreamSizeString5AsString() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeString5AsString());
        System.out.println("Streamsize in with percentage value AS String === " + jMetaDataAudio.getStreamSizeString5AsString());
    }

   /**
    * Test getStreamSizeString5AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeString5AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeString5AsBoolean());
        System.out.println("Streamsize in with percentage value AS Boolean === " + jMetaDataAudio.getStreamSizeString5AsBoolean());
    }

   /**
    * Test getStreamSizeString5AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeString5AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeString5AsBigInteger());
        System.out.println("Streamsize in with percentage value AS BigInteger === " + jMetaDataAudio.getStreamSizeString5AsBigInteger());
    }

   /**
    * Test getStreamSizeString5AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeString5AsURL() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeString5AsURL());
        System.out.println("Streamsize in with percentage value AS URL === " + jMetaDataAudio.getStreamSizeString5AsURL());
    }

   /**
    * Test getReplayGainGainStringAsInteger() method.
    */
    @Test
    public void subTestGetReplayGainGainStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getReplayGainGainStringAsInteger());
        System.out.println("ReplayGain_Gain/String AS Integer === " + jMetaDataAudio.getReplayGainGainStringAsInteger());
    }

   /**
    * Test getReplayGainGainStringAsLong() method.
    */
    @Test
    public void subTestGetReplayGainGainStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getReplayGainGainStringAsLong());
        System.out.println("ReplayGain_Gain/String AS Long === " + jMetaDataAudio.getReplayGainGainStringAsLong());
    }

   /**
    * Test getReplayGainGainStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetReplayGainGainStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getReplayGainGainStringAsLocalDateTime());
        System.out.println("ReplayGain_Gain/String AS LocalDateTime === " + jMetaDataAudio.getReplayGainGainStringAsLocalDateTime());
    }

   /**
    * Test getReplayGainGainStringAsLocalTime() method.
    */
    @Test
    public void subTestGetReplayGainGainStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getReplayGainGainStringAsLocalTime());
        System.out.println("ReplayGain_Gain/String AS LocalTime === " + jMetaDataAudio.getReplayGainGainStringAsLocalTime());
    }

   /**
    * Test getReplayGainGainStringAsString() method.
    */
    @Test
    public void subTestGetReplayGainGainStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getReplayGainGainStringAsString());
        System.out.println("ReplayGain_Gain/String AS String === " + jMetaDataAudio.getReplayGainGainStringAsString());
    }

   /**
    * Test getReplayGainGainStringAsBoolean() method.
    */
    @Test
    public void subTestGetReplayGainGainStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getReplayGainGainStringAsBoolean());
        System.out.println("ReplayGain_Gain/String AS Boolean === " + jMetaDataAudio.getReplayGainGainStringAsBoolean());
    }

   /**
    * Test getReplayGainGainStringAsBigInteger() method.
    */
    @Test
    public void subTestGetReplayGainGainStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getReplayGainGainStringAsBigInteger());
        System.out.println("ReplayGain_Gain/String AS BigInteger === " + jMetaDataAudio.getReplayGainGainStringAsBigInteger());
    }

   /**
    * Test getReplayGainGainStringAsURL() method.
    */
    @Test
    public void subTestGetReplayGainGainStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getReplayGainGainStringAsURL());
        System.out.println("ReplayGain_Gain/String AS URL === " + jMetaDataAudio.getReplayGainGainStringAsURL());
    }

   /**
    * Test getStreamKindAsInteger() method.
    */
    @Test
    public void subTestGetStreamKindAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamKindAsInteger());
        System.out.println("Stream type name AS Integer === " + jMetaDataAudio.getStreamKindAsInteger());
    }

   /**
    * Test getStreamKindAsLong() method.
    */
    @Test
    public void subTestGetStreamKindAsLong() {
        assertEquals(null, this.jMetaDataAudio.getStreamKindAsLong());
        System.out.println("Stream type name AS Long === " + jMetaDataAudio.getStreamKindAsLong());
    }

   /**
    * Test getStreamKindAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamKindAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamKindAsLocalDateTime());
        System.out.println("Stream type name AS LocalDateTime === " + jMetaDataAudio.getStreamKindAsLocalDateTime());
    }

   /**
    * Test getStreamKindAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamKindAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamKindAsLocalTime());
        System.out.println("Stream type name AS LocalTime === " + jMetaDataAudio.getStreamKindAsLocalTime());
    }

   /**
    * Test getStreamKindAsString() method.
    */
    @Test
    public void subTestGetStreamKindAsString() {
        assertEquals(null, this.jMetaDataAudio.getStreamKindAsString());
        System.out.println("Stream type name AS String === " + jMetaDataAudio.getStreamKindAsString());
    }

   /**
    * Test getStreamKindAsBoolean() method.
    */
    @Test
    public void subTestGetStreamKindAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getStreamKindAsBoolean());
        System.out.println("Stream type name AS Boolean === " + jMetaDataAudio.getStreamKindAsBoolean());
    }

   /**
    * Test getStreamKindAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamKindAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamKindAsBigInteger());
        System.out.println("Stream type name AS BigInteger === " + jMetaDataAudio.getStreamKindAsBigInteger());
    }

   /**
    * Test getStreamKindAsURL() method.
    */
    @Test
    public void subTestGetStreamKindAsURL() {
        assertEquals(null, this.jMetaDataAudio.getStreamKindAsURL());
        System.out.println("Stream type name AS URL === " + jMetaDataAudio.getStreamKindAsURL());
    }

   /**
    * Test getBitRateStringAsInteger() method.
    */
    @Test
    public void subTestGetBitRateStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getBitRateStringAsInteger());
        System.out.println("Bit rate (with measurement) AS Integer === " + jMetaDataAudio.getBitRateStringAsInteger());
    }

   /**
    * Test getBitRateStringAsLong() method.
    */
    @Test
    public void subTestGetBitRateStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getBitRateStringAsLong());
        System.out.println("Bit rate (with measurement) AS Long === " + jMetaDataAudio.getBitRateStringAsLong());
    }

   /**
    * Test getBitRateStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitRateStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getBitRateStringAsLocalDateTime());
        System.out.println("Bit rate (with measurement) AS LocalDateTime === " + jMetaDataAudio.getBitRateStringAsLocalDateTime());
    }

   /**
    * Test getBitRateStringAsLocalTime() method.
    */
    @Test
    public void subTestGetBitRateStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getBitRateStringAsLocalTime());
        System.out.println("Bit rate (with measurement) AS LocalTime === " + jMetaDataAudio.getBitRateStringAsLocalTime());
    }

   /**
    * Test getBitRateStringAsString() method.
    */
    @Test
    public void subTestGetBitRateStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getBitRateStringAsString());
        System.out.println("Bit rate (with measurement) AS String === " + jMetaDataAudio.getBitRateStringAsString());
    }

   /**
    * Test getBitRateStringAsBoolean() method.
    */
    @Test
    public void subTestGetBitRateStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getBitRateStringAsBoolean());
        System.out.println("Bit rate (with measurement) AS Boolean === " + jMetaDataAudio.getBitRateStringAsBoolean());
    }

   /**
    * Test getBitRateStringAsBigInteger() method.
    */
    @Test
    public void subTestGetBitRateStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getBitRateStringAsBigInteger());
        System.out.println("Bit rate (with measurement) AS BigInteger === " + jMetaDataAudio.getBitRateStringAsBigInteger());
    }

   /**
    * Test getBitRateStringAsURL() method.
    */
    @Test
    public void subTestGetBitRateStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getBitRateStringAsURL());
        System.out.println("Bit rate (with measurement) AS URL === " + jMetaDataAudio.getBitRateStringAsURL());
    }

   /**
    * Test getFormatSettingsSignAsInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsSignAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsSignAsInteger());
        System.out.println("Format_Settings_Sign AS Integer === " + jMetaDataAudio.getFormatSettingsSignAsInteger());
    }

   /**
    * Test getFormatSettingsSignAsLong() method.
    */
    @Test
    public void subTestGetFormatSettingsSignAsLong() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsSignAsLong());
        System.out.println("Format_Settings_Sign AS Long === " + jMetaDataAudio.getFormatSettingsSignAsLong());
    }

   /**
    * Test getFormatSettingsSignAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatSettingsSignAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsSignAsLocalDateTime());
        System.out.println("Format_Settings_Sign AS LocalDateTime === " + jMetaDataAudio.getFormatSettingsSignAsLocalDateTime());
    }

   /**
    * Test getFormatSettingsSignAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatSettingsSignAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsSignAsLocalTime());
        System.out.println("Format_Settings_Sign AS LocalTime === " + jMetaDataAudio.getFormatSettingsSignAsLocalTime());
    }

   /**
    * Test getFormatSettingsSignAsString() method.
    */
    @Test
    public void subTestGetFormatSettingsSignAsString() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsSignAsString());
        System.out.println("Format_Settings_Sign AS String === " + jMetaDataAudio.getFormatSettingsSignAsString());
    }

   /**
    * Test getFormatSettingsSignAsBoolean() method.
    */
    @Test
    public void subTestGetFormatSettingsSignAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsSignAsBoolean());
        System.out.println("Format_Settings_Sign AS Boolean === " + jMetaDataAudio.getFormatSettingsSignAsBoolean());
    }

   /**
    * Test getFormatSettingsSignAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsSignAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsSignAsBigInteger());
        System.out.println("Format_Settings_Sign AS BigInteger === " + jMetaDataAudio.getFormatSettingsSignAsBigInteger());
    }

   /**
    * Test getFormatSettingsSignAsURL() method.
    */
    @Test
    public void subTestGetFormatSettingsSignAsURL() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsSignAsURL());
        System.out.println("Format_Settings_Sign AS URL === " + jMetaDataAudio.getFormatSettingsSignAsURL());
    }

   /**
    * Test getLanguageString1AsInteger() method.
    */
    @Test
    public void subTestGetLanguageString1AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getLanguageString1AsInteger());
        System.out.println("Language (full) AS Integer === " + jMetaDataAudio.getLanguageString1AsInteger());
    }

   /**
    * Test getLanguageString1AsLong() method.
    */
    @Test
    public void subTestGetLanguageString1AsLong() {
        assertEquals(null, this.jMetaDataAudio.getLanguageString1AsLong());
        System.out.println("Language (full) AS Long === " + jMetaDataAudio.getLanguageString1AsLong());
    }

   /**
    * Test getLanguageString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetLanguageString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getLanguageString1AsLocalDateTime());
        System.out.println("Language (full) AS LocalDateTime === " + jMetaDataAudio.getLanguageString1AsLocalDateTime());
    }

   /**
    * Test getLanguageString1AsLocalTime() method.
    */
    @Test
    public void subTestGetLanguageString1AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getLanguageString1AsLocalTime());
        System.out.println("Language (full) AS LocalTime === " + jMetaDataAudio.getLanguageString1AsLocalTime());
    }

   /**
    * Test getLanguageString1AsString() method.
    */
    @Test
    public void subTestGetLanguageString1AsString() {
        assertEquals(null, this.jMetaDataAudio.getLanguageString1AsString());
        System.out.println("Language (full) AS String === " + jMetaDataAudio.getLanguageString1AsString());
    }

   /**
    * Test getLanguageString1AsBoolean() method.
    */
    @Test
    public void subTestGetLanguageString1AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getLanguageString1AsBoolean());
        System.out.println("Language (full) AS Boolean === " + jMetaDataAudio.getLanguageString1AsBoolean());
    }

   /**
    * Test getLanguageString1AsBigInteger() method.
    */
    @Test
    public void subTestGetLanguageString1AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getLanguageString1AsBigInteger());
        System.out.println("Language (full) AS BigInteger === " + jMetaDataAudio.getLanguageString1AsBigInteger());
    }

   /**
    * Test getLanguageString1AsURL() method.
    */
    @Test
    public void subTestGetLanguageString1AsURL() {
        assertEquals(null, this.jMetaDataAudio.getLanguageString1AsURL());
        System.out.println("Language (full) AS URL === " + jMetaDataAudio.getLanguageString1AsURL());
    }

   /**
    * Test getLanguageString2AsInteger() method.
    */
    @Test
    public void subTestGetLanguageString2AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getLanguageString2AsInteger());
        System.out.println("Language (2-letter ISO 639-1 if exists, else empty) AS Integer === " + jMetaDataAudio.getLanguageString2AsInteger());
    }

   /**
    * Test getLanguageString2AsLong() method.
    */
    @Test
    public void subTestGetLanguageString2AsLong() {
        assertEquals(null, this.jMetaDataAudio.getLanguageString2AsLong());
        System.out.println("Language (2-letter ISO 639-1 if exists, else empty) AS Long === " + jMetaDataAudio.getLanguageString2AsLong());
    }

   /**
    * Test getLanguageString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetLanguageString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getLanguageString2AsLocalDateTime());
        System.out.println("Language (2-letter ISO 639-1 if exists, else empty) AS LocalDateTime === " + jMetaDataAudio.getLanguageString2AsLocalDateTime());
    }

   /**
    * Test getLanguageString2AsLocalTime() method.
    */
    @Test
    public void subTestGetLanguageString2AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getLanguageString2AsLocalTime());
        System.out.println("Language (2-letter ISO 639-1 if exists, else empty) AS LocalTime === " + jMetaDataAudio.getLanguageString2AsLocalTime());
    }

   /**
    * Test getLanguageString2AsString() method.
    */
    @Test
    public void subTestGetLanguageString2AsString() {
        assertEquals(null, this.jMetaDataAudio.getLanguageString2AsString());
        System.out.println("Language (2-letter ISO 639-1 if exists, else empty) AS String === " + jMetaDataAudio.getLanguageString2AsString());
    }

   /**
    * Test getLanguageString2AsBoolean() method.
    */
    @Test
    public void subTestGetLanguageString2AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getLanguageString2AsBoolean());
        System.out.println("Language (2-letter ISO 639-1 if exists, else empty) AS Boolean === " + jMetaDataAudio.getLanguageString2AsBoolean());
    }

   /**
    * Test getLanguageString2AsBigInteger() method.
    */
    @Test
    public void subTestGetLanguageString2AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getLanguageString2AsBigInteger());
        System.out.println("Language (2-letter ISO 639-1 if exists, else empty) AS BigInteger === " + jMetaDataAudio.getLanguageString2AsBigInteger());
    }

   /**
    * Test getLanguageString2AsURL() method.
    */
    @Test
    public void subTestGetLanguageString2AsURL() {
        assertEquals(null, this.jMetaDataAudio.getLanguageString2AsURL());
        System.out.println("Language (2-letter ISO 639-1 if exists, else empty) AS URL === " + jMetaDataAudio.getLanguageString2AsURL());
    }

   /**
    * Test getLanguageString3AsInteger() method.
    */
    @Test
    public void subTestGetLanguageString3AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getLanguageString3AsInteger());
        System.out.println("Language (3-letter ISO 639-2 if exists, else empty) AS Integer === " + jMetaDataAudio.getLanguageString3AsInteger());
    }

   /**
    * Test getLanguageString3AsLong() method.
    */
    @Test
    public void subTestGetLanguageString3AsLong() {
        assertEquals(null, this.jMetaDataAudio.getLanguageString3AsLong());
        System.out.println("Language (3-letter ISO 639-2 if exists, else empty) AS Long === " + jMetaDataAudio.getLanguageString3AsLong());
    }

   /**
    * Test getLanguageString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetLanguageString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getLanguageString3AsLocalDateTime());
        System.out.println("Language (3-letter ISO 639-2 if exists, else empty) AS LocalDateTime === " + jMetaDataAudio.getLanguageString3AsLocalDateTime());
    }

   /**
    * Test getLanguageString3AsLocalTime() method.
    */
    @Test
    public void subTestGetLanguageString3AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getLanguageString3AsLocalTime());
        System.out.println("Language (3-letter ISO 639-2 if exists, else empty) AS LocalTime === " + jMetaDataAudio.getLanguageString3AsLocalTime());
    }

   /**
    * Test getLanguageString3AsString() method.
    */
    @Test
    public void subTestGetLanguageString3AsString() {
        assertEquals(null, this.jMetaDataAudio.getLanguageString3AsString());
        System.out.println("Language (3-letter ISO 639-2 if exists, else empty) AS String === " + jMetaDataAudio.getLanguageString3AsString());
    }

   /**
    * Test getLanguageString3AsBoolean() method.
    */
    @Test
    public void subTestGetLanguageString3AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getLanguageString3AsBoolean());
        System.out.println("Language (3-letter ISO 639-2 if exists, else empty) AS Boolean === " + jMetaDataAudio.getLanguageString3AsBoolean());
    }

   /**
    * Test getLanguageString3AsBigInteger() method.
    */
    @Test
    public void subTestGetLanguageString3AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getLanguageString3AsBigInteger());
        System.out.println("Language (3-letter ISO 639-2 if exists, else empty) AS BigInteger === " + jMetaDataAudio.getLanguageString3AsBigInteger());
    }

   /**
    * Test getLanguageString3AsURL() method.
    */
    @Test
    public void subTestGetLanguageString3AsURL() {
        assertEquals(null, this.jMetaDataAudio.getLanguageString3AsURL());
        System.out.println("Language (3-letter ISO 639-2 if exists, else empty) AS URL === " + jMetaDataAudio.getLanguageString3AsURL());
    }

   /**
    * Test getMatrixChannelPositionsAsInteger() method.
    */
    @Test
    public void subTestGetMatrixChannelPositionsAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getMatrixChannelPositionsAsInteger());
        System.out.println("Position of channels after matrix decoding AS Integer === " + jMetaDataAudio.getMatrixChannelPositionsAsInteger());
    }

   /**
    * Test getMatrixChannelPositionsAsLong() method.
    */
    @Test
    public void subTestGetMatrixChannelPositionsAsLong() {
        assertEquals(null, this.jMetaDataAudio.getMatrixChannelPositionsAsLong());
        System.out.println("Position of channels after matrix decoding AS Long === " + jMetaDataAudio.getMatrixChannelPositionsAsLong());
    }

   /**
    * Test getMatrixChannelPositionsAsLocalDateTime() method.
    */
    @Test
    public void subTestGetMatrixChannelPositionsAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getMatrixChannelPositionsAsLocalDateTime());
        System.out.println("Position of channels after matrix decoding AS LocalDateTime === " + jMetaDataAudio.getMatrixChannelPositionsAsLocalDateTime());
    }

   /**
    * Test getMatrixChannelPositionsAsLocalTime() method.
    */
    @Test
    public void subTestGetMatrixChannelPositionsAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getMatrixChannelPositionsAsLocalTime());
        System.out.println("Position of channels after matrix decoding AS LocalTime === " + jMetaDataAudio.getMatrixChannelPositionsAsLocalTime());
    }

   /**
    * Test getMatrixChannelPositionsAsString() method.
    */
    @Test
    public void subTestGetMatrixChannelPositionsAsString() {
        assertEquals(null, this.jMetaDataAudio.getMatrixChannelPositionsAsString());
        System.out.println("Position of channels after matrix decoding AS String === " + jMetaDataAudio.getMatrixChannelPositionsAsString());
    }

   /**
    * Test getMatrixChannelPositionsAsBoolean() method.
    */
    @Test
    public void subTestGetMatrixChannelPositionsAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getMatrixChannelPositionsAsBoolean());
        System.out.println("Position of channels after matrix decoding AS Boolean === " + jMetaDataAudio.getMatrixChannelPositionsAsBoolean());
    }

   /**
    * Test getMatrixChannelPositionsAsBigInteger() method.
    */
    @Test
    public void subTestGetMatrixChannelPositionsAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getMatrixChannelPositionsAsBigInteger());
        System.out.println("Position of channels after matrix decoding AS BigInteger === " + jMetaDataAudio.getMatrixChannelPositionsAsBigInteger());
    }

   /**
    * Test getMatrixChannelPositionsAsURL() method.
    */
    @Test
    public void subTestGetMatrixChannelPositionsAsURL() {
        assertEquals(null, this.jMetaDataAudio.getMatrixChannelPositionsAsURL());
        System.out.println("Position of channels after matrix decoding AS URL === " + jMetaDataAudio.getMatrixChannelPositionsAsURL());
    }

   /**
    * Test getLanguageString4AsInteger() method.
    */
    @Test
    public void subTestGetLanguageString4AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getLanguageString4AsInteger());
        System.out.println("Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty) AS Integer === " + jMetaDataAudio.getLanguageString4AsInteger());
    }

   /**
    * Test getLanguageString4AsLong() method.
    */
    @Test
    public void subTestGetLanguageString4AsLong() {
        assertEquals(null, this.jMetaDataAudio.getLanguageString4AsLong());
        System.out.println("Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty) AS Long === " + jMetaDataAudio.getLanguageString4AsLong());
    }

   /**
    * Test getLanguageString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetLanguageString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getLanguageString4AsLocalDateTime());
        System.out.println("Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty) AS LocalDateTime === " + jMetaDataAudio.getLanguageString4AsLocalDateTime());
    }

   /**
    * Test getLanguageString4AsLocalTime() method.
    */
    @Test
    public void subTestGetLanguageString4AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getLanguageString4AsLocalTime());
        System.out.println("Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty) AS LocalTime === " + jMetaDataAudio.getLanguageString4AsLocalTime());
    }

   /**
    * Test getLanguageString4AsString() method.
    */
    @Test
    public void subTestGetLanguageString4AsString() {
        assertEquals(null, this.jMetaDataAudio.getLanguageString4AsString());
        System.out.println("Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty) AS String === " + jMetaDataAudio.getLanguageString4AsString());
    }

   /**
    * Test getLanguageString4AsBoolean() method.
    */
    @Test
    public void subTestGetLanguageString4AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getLanguageString4AsBoolean());
        System.out.println("Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty) AS Boolean === " + jMetaDataAudio.getLanguageString4AsBoolean());
    }

   /**
    * Test getLanguageString4AsBigInteger() method.
    */
    @Test
    public void subTestGetLanguageString4AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getLanguageString4AsBigInteger());
        System.out.println("Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty) AS BigInteger === " + jMetaDataAudio.getLanguageString4AsBigInteger());
    }

   /**
    * Test getLanguageString4AsURL() method.
    */
    @Test
    public void subTestGetLanguageString4AsURL() {
        assertEquals(null, this.jMetaDataAudio.getLanguageString4AsURL());
        System.out.println("Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty) AS URL === " + jMetaDataAudio.getLanguageString4AsURL());
    }

   /**
    * Test getCodecIDAsInteger() method.
    */
    @Test
    public void subTestGetCodecIDAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDAsInteger());
        System.out.println("Codec ID (found in some containers) AS Integer === " + jMetaDataAudio.getCodecIDAsInteger());
    }

   /**
    * Test getCodecIDAsLong() method.
    */
    @Test
    public void subTestGetCodecIDAsLong() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDAsLong());
        System.out.println("Codec ID (found in some containers) AS Long === " + jMetaDataAudio.getCodecIDAsLong());
    }

   /**
    * Test getCodecIDAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCodecIDAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDAsLocalDateTime());
        System.out.println("Codec ID (found in some containers) AS LocalDateTime === " + jMetaDataAudio.getCodecIDAsLocalDateTime());
    }

   /**
    * Test getCodecIDAsLocalTime() method.
    */
    @Test
    public void subTestGetCodecIDAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDAsLocalTime());
        System.out.println("Codec ID (found in some containers) AS LocalTime === " + jMetaDataAudio.getCodecIDAsLocalTime());
    }

   /**
    * Test getCodecIDAsString() method.
    */
    @Test
    public void subTestGetCodecIDAsString() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDAsString());
        System.out.println("Codec ID (found in some containers) AS String === " + jMetaDataAudio.getCodecIDAsString());
    }

   /**
    * Test getCodecIDAsBoolean() method.
    */
    @Test
    public void subTestGetCodecIDAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDAsBoolean());
        System.out.println("Codec ID (found in some containers) AS Boolean === " + jMetaDataAudio.getCodecIDAsBoolean());
    }

   /**
    * Test getCodecIDAsBigInteger() method.
    */
    @Test
    public void subTestGetCodecIDAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDAsBigInteger());
        System.out.println("Codec ID (found in some containers) AS BigInteger === " + jMetaDataAudio.getCodecIDAsBigInteger());
    }

   /**
    * Test getCodecIDAsURL() method.
    */
    @Test
    public void subTestGetCodecIDAsURL() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDAsURL());
        System.out.println("Codec ID (found in some containers) AS URL === " + jMetaDataAudio.getCodecIDAsURL());
    }

   /**
    * Test getAlternateGroupAsInteger() method.
    */
    @Test
    public void subTestGetAlternateGroupAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getAlternateGroupAsInteger());
        System.out.println("Number of a group in order to provide versions of the same track AS Integer === " + jMetaDataAudio.getAlternateGroupAsInteger());
    }

   /**
    * Test getAlternateGroupAsLong() method.
    */
    @Test
    public void subTestGetAlternateGroupAsLong() {
        assertEquals(null, this.jMetaDataAudio.getAlternateGroupAsLong());
        System.out.println("Number of a group in order to provide versions of the same track AS Long === " + jMetaDataAudio.getAlternateGroupAsLong());
    }

   /**
    * Test getAlternateGroupAsLocalDateTime() method.
    */
    @Test
    public void subTestGetAlternateGroupAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getAlternateGroupAsLocalDateTime());
        System.out.println("Number of a group in order to provide versions of the same track AS LocalDateTime === " + jMetaDataAudio.getAlternateGroupAsLocalDateTime());
    }

   /**
    * Test getAlternateGroupAsLocalTime() method.
    */
    @Test
    public void subTestGetAlternateGroupAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getAlternateGroupAsLocalTime());
        System.out.println("Number of a group in order to provide versions of the same track AS LocalTime === " + jMetaDataAudio.getAlternateGroupAsLocalTime());
    }

   /**
    * Test getAlternateGroupAsString() method.
    */
    @Test
    public void subTestGetAlternateGroupAsString() {
        assertEquals(null, this.jMetaDataAudio.getAlternateGroupAsString());
        System.out.println("Number of a group in order to provide versions of the same track AS String === " + jMetaDataAudio.getAlternateGroupAsString());
    }

   /**
    * Test getAlternateGroupAsBoolean() method.
    */
    @Test
    public void subTestGetAlternateGroupAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getAlternateGroupAsBoolean());
        System.out.println("Number of a group in order to provide versions of the same track AS Boolean === " + jMetaDataAudio.getAlternateGroupAsBoolean());
    }

   /**
    * Test getAlternateGroupAsBigInteger() method.
    */
    @Test
    public void subTestGetAlternateGroupAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getAlternateGroupAsBigInteger());
        System.out.println("Number of a group in order to provide versions of the same track AS BigInteger === " + jMetaDataAudio.getAlternateGroupAsBigInteger());
    }

   /**
    * Test getAlternateGroupAsURL() method.
    */
    @Test
    public void subTestGetAlternateGroupAsURL() {
        assertEquals(null, this.jMetaDataAudio.getAlternateGroupAsURL());
        System.out.println("Number of a group in order to provide versions of the same track AS URL === " + jMetaDataAudio.getAlternateGroupAsURL());
    }

   /**
    * Test getInterleaveVideoFramesAsInteger() method.
    */
    @Test
    public void subTestGetInterleaveVideoFramesAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getInterleaveVideoFramesAsInteger());
        System.out.println("Between how many video frames the stream is inserted AS Integer === " + jMetaDataAudio.getInterleaveVideoFramesAsInteger());
    }

   /**
    * Test getInterleaveVideoFramesAsLong() method.
    */
    @Test
    public void subTestGetInterleaveVideoFramesAsLong() {
        assertEquals(null, this.jMetaDataAudio.getInterleaveVideoFramesAsLong());
        System.out.println("Between how many video frames the stream is inserted AS Long === " + jMetaDataAudio.getInterleaveVideoFramesAsLong());
    }

   /**
    * Test getInterleaveVideoFramesAsLocalDateTime() method.
    */
    @Test
    public void subTestGetInterleaveVideoFramesAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getInterleaveVideoFramesAsLocalDateTime());
        System.out.println("Between how many video frames the stream is inserted AS LocalDateTime === " + jMetaDataAudio.getInterleaveVideoFramesAsLocalDateTime());
    }

   /**
    * Test getInterleaveVideoFramesAsLocalTime() method.
    */
    @Test
    public void subTestGetInterleaveVideoFramesAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getInterleaveVideoFramesAsLocalTime());
        System.out.println("Between how many video frames the stream is inserted AS LocalTime === " + jMetaDataAudio.getInterleaveVideoFramesAsLocalTime());
    }

   /**
    * Test getInterleaveVideoFramesAsString() method.
    */
    @Test
    public void subTestGetInterleaveVideoFramesAsString() {
        assertEquals(null, this.jMetaDataAudio.getInterleaveVideoFramesAsString());
        System.out.println("Between how many video frames the stream is inserted AS String === " + jMetaDataAudio.getInterleaveVideoFramesAsString());
    }

   /**
    * Test getInterleaveVideoFramesAsBoolean() method.
    */
    @Test
    public void subTestGetInterleaveVideoFramesAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getInterleaveVideoFramesAsBoolean());
        System.out.println("Between how many video frames the stream is inserted AS Boolean === " + jMetaDataAudio.getInterleaveVideoFramesAsBoolean());
    }

   /**
    * Test getInterleaveVideoFramesAsBigInteger() method.
    */
    @Test
    public void subTestGetInterleaveVideoFramesAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getInterleaveVideoFramesAsBigInteger());
        System.out.println("Between how many video frames the stream is inserted AS BigInteger === " + jMetaDataAudio.getInterleaveVideoFramesAsBigInteger());
    }

   /**
    * Test getInterleaveVideoFramesAsURL() method.
    */
    @Test
    public void subTestGetInterleaveVideoFramesAsURL() {
        assertEquals(null, this.jMetaDataAudio.getInterleaveVideoFramesAsURL());
        System.out.println("Between how many video frames the stream is inserted AS URL === " + jMetaDataAudio.getInterleaveVideoFramesAsURL());
    }

   /**
    * Test getMatrixFormatAsInteger() method.
    */
    @Test
    public void subTestGetMatrixFormatAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getMatrixFormatAsInteger());
        System.out.println("Matrix format (e.g. DTS Neural) AS Integer === " + jMetaDataAudio.getMatrixFormatAsInteger());
    }

   /**
    * Test getMatrixFormatAsLong() method.
    */
    @Test
    public void subTestGetMatrixFormatAsLong() {
        assertEquals(null, this.jMetaDataAudio.getMatrixFormatAsLong());
        System.out.println("Matrix format (e.g. DTS Neural) AS Long === " + jMetaDataAudio.getMatrixFormatAsLong());
    }

   /**
    * Test getMatrixFormatAsLocalDateTime() method.
    */
    @Test
    public void subTestGetMatrixFormatAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getMatrixFormatAsLocalDateTime());
        System.out.println("Matrix format (e.g. DTS Neural) AS LocalDateTime === " + jMetaDataAudio.getMatrixFormatAsLocalDateTime());
    }

   /**
    * Test getMatrixFormatAsLocalTime() method.
    */
    @Test
    public void subTestGetMatrixFormatAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getMatrixFormatAsLocalTime());
        System.out.println("Matrix format (e.g. DTS Neural) AS LocalTime === " + jMetaDataAudio.getMatrixFormatAsLocalTime());
    }

   /**
    * Test getMatrixFormatAsString() method.
    */
    @Test
    public void subTestGetMatrixFormatAsString() {
        assertEquals(null, this.jMetaDataAudio.getMatrixFormatAsString());
        System.out.println("Matrix format (e.g. DTS Neural) AS String === " + jMetaDataAudio.getMatrixFormatAsString());
    }

   /**
    * Test getMatrixFormatAsBoolean() method.
    */
    @Test
    public void subTestGetMatrixFormatAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getMatrixFormatAsBoolean());
        System.out.println("Matrix format (e.g. DTS Neural) AS Boolean === " + jMetaDataAudio.getMatrixFormatAsBoolean());
    }

   /**
    * Test getMatrixFormatAsBigInteger() method.
    */
    @Test
    public void subTestGetMatrixFormatAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getMatrixFormatAsBigInteger());
        System.out.println("Matrix format (e.g. DTS Neural) AS BigInteger === " + jMetaDataAudio.getMatrixFormatAsBigInteger());
    }

   /**
    * Test getMatrixFormatAsURL() method.
    */
    @Test
    public void subTestGetMatrixFormatAsURL() {
        assertEquals(null, this.jMetaDataAudio.getMatrixFormatAsURL());
        System.out.println("Matrix format (e.g. DTS Neural) AS URL === " + jMetaDataAudio.getMatrixFormatAsURL());
    }

   /**
    * Test getLanguageAsInteger() method.
    */
    @Test
    public void subTestGetLanguageAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getLanguageAsInteger());
        System.out.println("Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn) AS Integer === " + jMetaDataAudio.getLanguageAsInteger());
    }

   /**
    * Test getLanguageAsLong() method.
    */
    @Test
    public void subTestGetLanguageAsLong() {
        assertEquals(null, this.jMetaDataAudio.getLanguageAsLong());
        System.out.println("Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn) AS Long === " + jMetaDataAudio.getLanguageAsLong());
    }

   /**
    * Test getLanguageAsLocalDateTime() method.
    */
    @Test
    public void subTestGetLanguageAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getLanguageAsLocalDateTime());
        System.out.println("Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn) AS LocalDateTime === " + jMetaDataAudio.getLanguageAsLocalDateTime());
    }

   /**
    * Test getLanguageAsLocalTime() method.
    */
    @Test
    public void subTestGetLanguageAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getLanguageAsLocalTime());
        System.out.println("Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn) AS LocalTime === " + jMetaDataAudio.getLanguageAsLocalTime());
    }

   /**
    * Test getLanguageAsString() method.
    */
    @Test
    public void subTestGetLanguageAsString() {
        assertEquals(null, this.jMetaDataAudio.getLanguageAsString());
        System.out.println("Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn) AS String === " + jMetaDataAudio.getLanguageAsString());
    }

   /**
    * Test getLanguageAsBoolean() method.
    */
    @Test
    public void subTestGetLanguageAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getLanguageAsBoolean());
        System.out.println("Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn) AS Boolean === " + jMetaDataAudio.getLanguageAsBoolean());
    }

   /**
    * Test getLanguageAsBigInteger() method.
    */
    @Test
    public void subTestGetLanguageAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getLanguageAsBigInteger());
        System.out.println("Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn) AS BigInteger === " + jMetaDataAudio.getLanguageAsBigInteger());
    }

   /**
    * Test getLanguageAsURL() method.
    */
    @Test
    public void subTestGetLanguageAsURL() {
        assertEquals(null, this.jMetaDataAudio.getLanguageAsURL());
        System.out.println("Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn) AS URL === " + jMetaDataAudio.getLanguageAsURL());
    }

   /**
    * Test getDurationLastFrameAsInteger() method.
    */
    @Test
    public void subTestGetDurationLastFrameAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameAsInteger());
        System.out.println("Duration of the last frame if it is longer than others, in ms AS Integer === " + jMetaDataAudio.getDurationLastFrameAsInteger());
    }

   /**
    * Test getDurationLastFrameAsLong() method.
    */
    @Test
    public void subTestGetDurationLastFrameAsLong() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameAsLong());
        System.out.println("Duration of the last frame if it is longer than others, in ms AS Long === " + jMetaDataAudio.getDurationLastFrameAsLong());
    }

   /**
    * Test getDurationLastFrameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationLastFrameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameAsLocalDateTime());
        System.out.println("Duration of the last frame if it is longer than others, in ms AS LocalDateTime === " + jMetaDataAudio.getDurationLastFrameAsLocalDateTime());
    }

   /**
    * Test getDurationLastFrameAsLocalTime() method.
    */
    @Test
    public void subTestGetDurationLastFrameAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameAsLocalTime());
        System.out.println("Duration of the last frame if it is longer than others, in ms AS LocalTime === " + jMetaDataAudio.getDurationLastFrameAsLocalTime());
    }

   /**
    * Test getDurationLastFrameAsString() method.
    */
    @Test
    public void subTestGetDurationLastFrameAsString() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameAsString());
        System.out.println("Duration of the last frame if it is longer than others, in ms AS String === " + jMetaDataAudio.getDurationLastFrameAsString());
    }

   /**
    * Test getDurationLastFrameAsBoolean() method.
    */
    @Test
    public void subTestGetDurationLastFrameAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameAsBoolean());
        System.out.println("Duration of the last frame if it is longer than others, in ms AS Boolean === " + jMetaDataAudio.getDurationLastFrameAsBoolean());
    }

   /**
    * Test getDurationLastFrameAsBigInteger() method.
    */
    @Test
    public void subTestGetDurationLastFrameAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameAsBigInteger());
        System.out.println("Duration of the last frame if it is longer than others, in ms AS BigInteger === " + jMetaDataAudio.getDurationLastFrameAsBigInteger());
    }

   /**
    * Test getDurationLastFrameAsURL() method.
    */
    @Test
    public void subTestGetDurationLastFrameAsURL() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameAsURL());
        System.out.println("Duration of the last frame if it is longer than others, in ms AS URL === " + jMetaDataAudio.getDurationLastFrameAsURL());
    }

   /**
    * Test getEncodedLibraryStringAsInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryStringAsInteger());
        System.out.println("Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS Integer === " + jMetaDataAudio.getEncodedLibraryStringAsInteger());
    }

   /**
    * Test getEncodedLibraryStringAsLong() method.
    */
    @Test
    public void subTestGetEncodedLibraryStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryStringAsLong());
        System.out.println("Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS Long === " + jMetaDataAudio.getEncodedLibraryStringAsLong());
    }

   /**
    * Test getEncodedLibraryStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryStringAsLocalDateTime());
        System.out.println("Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS LocalDateTime === " + jMetaDataAudio.getEncodedLibraryStringAsLocalDateTime());
    }

   /**
    * Test getEncodedLibraryStringAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryStringAsLocalTime());
        System.out.println("Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS LocalTime === " + jMetaDataAudio.getEncodedLibraryStringAsLocalTime());
    }

   /**
    * Test getEncodedLibraryStringAsString() method.
    */
    @Test
    public void subTestGetEncodedLibraryStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryStringAsString());
        System.out.println("Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS String === " + jMetaDataAudio.getEncodedLibraryStringAsString());
    }

   /**
    * Test getEncodedLibraryStringAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedLibraryStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryStringAsBoolean());
        System.out.println("Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS Boolean === " + jMetaDataAudio.getEncodedLibraryStringAsBoolean());
    }

   /**
    * Test getEncodedLibraryStringAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryStringAsBigInteger());
        System.out.println("Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS BigInteger === " + jMetaDataAudio.getEncodedLibraryStringAsBigInteger());
    }

   /**
    * Test getEncodedLibraryStringAsURL() method.
    */
    @Test
    public void subTestGetEncodedLibraryStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryStringAsURL());
        System.out.println("Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS URL === " + jMetaDataAudio.getEncodedLibraryStringAsURL());
    }

   /**
    * Test getSamplingRateStringAsInteger() method.
    */
    @Test
    public void subTestGetSamplingRateStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getSamplingRateStringAsInteger());
        System.out.println("in KHz AS Integer === " + jMetaDataAudio.getSamplingRateStringAsInteger());
    }

   /**
    * Test getSamplingRateStringAsLong() method.
    */
    @Test
    public void subTestGetSamplingRateStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getSamplingRateStringAsLong());
        System.out.println("in KHz AS Long === " + jMetaDataAudio.getSamplingRateStringAsLong());
    }

   /**
    * Test getSamplingRateStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSamplingRateStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getSamplingRateStringAsLocalDateTime());
        System.out.println("in KHz AS LocalDateTime === " + jMetaDataAudio.getSamplingRateStringAsLocalDateTime());
    }

   /**
    * Test getSamplingRateStringAsLocalTime() method.
    */
    @Test
    public void subTestGetSamplingRateStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getSamplingRateStringAsLocalTime());
        System.out.println("in KHz AS LocalTime === " + jMetaDataAudio.getSamplingRateStringAsLocalTime());
    }

   /**
    * Test getSamplingRateStringAsString() method.
    */
    @Test
    public void subTestGetSamplingRateStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getSamplingRateStringAsString());
        System.out.println("in KHz AS String === " + jMetaDataAudio.getSamplingRateStringAsString());
    }

   /**
    * Test getSamplingRateStringAsBoolean() method.
    */
    @Test
    public void subTestGetSamplingRateStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getSamplingRateStringAsBoolean());
        System.out.println("in KHz AS Boolean === " + jMetaDataAudio.getSamplingRateStringAsBoolean());
    }

   /**
    * Test getSamplingRateStringAsBigInteger() method.
    */
    @Test
    public void subTestGetSamplingRateStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getSamplingRateStringAsBigInteger());
        System.out.println("in KHz AS BigInteger === " + jMetaDataAudio.getSamplingRateStringAsBigInteger());
    }

   /**
    * Test getSamplingRateStringAsURL() method.
    */
    @Test
    public void subTestGetSamplingRateStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getSamplingRateStringAsURL());
        System.out.println("in KHz AS URL === " + jMetaDataAudio.getSamplingRateStringAsURL());
    }

   /**
    * Test getStreamSizeStringAsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeStringAsInteger());
        System.out.println("Streamsize in with percentage value AS Integer === " + jMetaDataAudio.getStreamSizeStringAsInteger());
    }

   /**
    * Test getStreamSizeStringAsLong() method.
    */
    @Test
    public void subTestGetStreamSizeStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeStringAsLong());
        System.out.println("Streamsize in with percentage value AS Long === " + jMetaDataAudio.getStreamSizeStringAsLong());
    }

   /**
    * Test getStreamSizeStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeStringAsLocalDateTime());
        System.out.println("Streamsize in with percentage value AS LocalDateTime === " + jMetaDataAudio.getStreamSizeStringAsLocalDateTime());
    }

   /**
    * Test getStreamSizeStringAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeStringAsLocalTime());
        System.out.println("Streamsize in with percentage value AS LocalTime === " + jMetaDataAudio.getStreamSizeStringAsLocalTime());
    }

   /**
    * Test getStreamSizeStringAsString() method.
    */
    @Test
    public void subTestGetStreamSizeStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeStringAsString());
        System.out.println("Streamsize in with percentage value AS String === " + jMetaDataAudio.getStreamSizeStringAsString());
    }

   /**
    * Test getStreamSizeStringAsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeStringAsBoolean());
        System.out.println("Streamsize in with percentage value AS Boolean === " + jMetaDataAudio.getStreamSizeStringAsBoolean());
    }

   /**
    * Test getStreamSizeStringAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeStringAsBigInteger());
        System.out.println("Streamsize in with percentage value AS BigInteger === " + jMetaDataAudio.getStreamSizeStringAsBigInteger());
    }

   /**
    * Test getStreamSizeStringAsURL() method.
    */
    @Test
    public void subTestGetStreamSizeStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeStringAsURL());
        System.out.println("Streamsize in with percentage value AS URL === " + jMetaDataAudio.getStreamSizeStringAsURL());
    }

   /**
    * Test getDefaultStringAsInteger() method.
    */
    @Test
    public void subTestGetDefaultStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDefaultStringAsInteger());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS Integer === " + jMetaDataAudio.getDefaultStringAsInteger());
    }

   /**
    * Test getDefaultStringAsLong() method.
    */
    @Test
    public void subTestGetDefaultStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getDefaultStringAsLong());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS Long === " + jMetaDataAudio.getDefaultStringAsLong());
    }

   /**
    * Test getDefaultStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDefaultStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDefaultStringAsLocalDateTime());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS LocalDateTime === " + jMetaDataAudio.getDefaultStringAsLocalDateTime());
    }

   /**
    * Test getDefaultStringAsLocalTime() method.
    */
    @Test
    public void subTestGetDefaultStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDefaultStringAsLocalTime());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS LocalTime === " + jMetaDataAudio.getDefaultStringAsLocalTime());
    }

   /**
    * Test getDefaultStringAsString() method.
    */
    @Test
    public void subTestGetDefaultStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getDefaultStringAsString());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS String === " + jMetaDataAudio.getDefaultStringAsString());
    }

   /**
    * Test getDefaultStringAsBoolean() method.
    */
    @Test
    public void subTestGetDefaultStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDefaultStringAsBoolean());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS Boolean === " + jMetaDataAudio.getDefaultStringAsBoolean());
    }

   /**
    * Test getDefaultStringAsBigInteger() method.
    */
    @Test
    public void subTestGetDefaultStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDefaultStringAsBigInteger());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS BigInteger === " + jMetaDataAudio.getDefaultStringAsBigInteger());
    }

   /**
    * Test getDefaultStringAsURL() method.
    */
    @Test
    public void subTestGetDefaultStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getDefaultStringAsURL());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS URL === " + jMetaDataAudio.getDefaultStringAsURL());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsInteger() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getOriginalSourceMediumIDStringAsInteger());
        System.out.println("The ID for this stream in the original medium of the material AS Integer === " + jMetaDataAudio.getOriginalSourceMediumIDStringAsInteger());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsLong() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getOriginalSourceMediumIDStringAsLong());
        System.out.println("The ID for this stream in the original medium of the material AS Long === " + jMetaDataAudio.getOriginalSourceMediumIDStringAsLong());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getOriginalSourceMediumIDStringAsLocalDateTime());
        System.out.println("The ID for this stream in the original medium of the material AS LocalDateTime === " + jMetaDataAudio.getOriginalSourceMediumIDStringAsLocalDateTime());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsLocalTime() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getOriginalSourceMediumIDStringAsLocalTime());
        System.out.println("The ID for this stream in the original medium of the material AS LocalTime === " + jMetaDataAudio.getOriginalSourceMediumIDStringAsLocalTime());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsString() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getOriginalSourceMediumIDStringAsString());
        System.out.println("The ID for this stream in the original medium of the material AS String === " + jMetaDataAudio.getOriginalSourceMediumIDStringAsString());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsBoolean() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getOriginalSourceMediumIDStringAsBoolean());
        System.out.println("The ID for this stream in the original medium of the material AS Boolean === " + jMetaDataAudio.getOriginalSourceMediumIDStringAsBoolean());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsBigInteger() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getOriginalSourceMediumIDStringAsBigInteger());
        System.out.println("The ID for this stream in the original medium of the material AS BigInteger === " + jMetaDataAudio.getOriginalSourceMediumIDStringAsBigInteger());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsURL() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getOriginalSourceMediumIDStringAsURL());
        System.out.println("The ID for this stream in the original medium of the material AS URL === " + jMetaDataAudio.getOriginalSourceMediumIDStringAsURL());
    }

   /**
    * Test getSourceDurationLastFrameString1AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameString1AsInteger());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS Integer === " + jMetaDataAudio.getSourceDurationLastFrameString1AsInteger());
    }

   /**
    * Test getSourceDurationLastFrameString1AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsLong() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameString1AsLong());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS Long === " + jMetaDataAudio.getSourceDurationLastFrameString1AsLong());
    }

   /**
    * Test getSourceDurationLastFrameString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameString1AsLocalDateTime());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS LocalDateTime === " + jMetaDataAudio.getSourceDurationLastFrameString1AsLocalDateTime());
    }

   /**
    * Test getSourceDurationLastFrameString1AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameString1AsLocalTime());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS LocalTime === " + jMetaDataAudio.getSourceDurationLastFrameString1AsLocalTime());
    }

   /**
    * Test getSourceDurationLastFrameString1AsString() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsString() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameString1AsString());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS String === " + jMetaDataAudio.getSourceDurationLastFrameString1AsString());
    }

   /**
    * Test getSourceDurationLastFrameString1AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameString1AsBoolean());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS Boolean === " + jMetaDataAudio.getSourceDurationLastFrameString1AsBoolean());
    }

   /**
    * Test getSourceDurationLastFrameString1AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameString1AsBigInteger());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS BigInteger === " + jMetaDataAudio.getSourceDurationLastFrameString1AsBigInteger());
    }

   /**
    * Test getSourceDurationLastFrameString1AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsURL() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameString1AsURL());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS URL === " + jMetaDataAudio.getSourceDurationLastFrameString1AsURL());
    }

   /**
    * Test getFormatSettingsModeAsInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsModeAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsModeAsInteger());
        System.out.println("Format_Settings_Mode AS Integer === " + jMetaDataAudio.getFormatSettingsModeAsInteger());
    }

   /**
    * Test getFormatSettingsModeAsLong() method.
    */
    @Test
    public void subTestGetFormatSettingsModeAsLong() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsModeAsLong());
        System.out.println("Format_Settings_Mode AS Long === " + jMetaDataAudio.getFormatSettingsModeAsLong());
    }

   /**
    * Test getFormatSettingsModeAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatSettingsModeAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsModeAsLocalDateTime());
        System.out.println("Format_Settings_Mode AS LocalDateTime === " + jMetaDataAudio.getFormatSettingsModeAsLocalDateTime());
    }

   /**
    * Test getFormatSettingsModeAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatSettingsModeAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsModeAsLocalTime());
        System.out.println("Format_Settings_Mode AS LocalTime === " + jMetaDataAudio.getFormatSettingsModeAsLocalTime());
    }

   /**
    * Test getFormatSettingsModeAsString() method.
    */
    @Test
    public void subTestGetFormatSettingsModeAsString() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsModeAsString());
        System.out.println("Format_Settings_Mode AS String === " + jMetaDataAudio.getFormatSettingsModeAsString());
    }

   /**
    * Test getFormatSettingsModeAsBoolean() method.
    */
    @Test
    public void subTestGetFormatSettingsModeAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsModeAsBoolean());
        System.out.println("Format_Settings_Mode AS Boolean === " + jMetaDataAudio.getFormatSettingsModeAsBoolean());
    }

   /**
    * Test getFormatSettingsModeAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsModeAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsModeAsBigInteger());
        System.out.println("Format_Settings_Mode AS BigInteger === " + jMetaDataAudio.getFormatSettingsModeAsBigInteger());
    }

   /**
    * Test getFormatSettingsModeAsURL() method.
    */
    @Test
    public void subTestGetFormatSettingsModeAsURL() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsModeAsURL());
        System.out.println("Format_Settings_Mode AS URL === " + jMetaDataAudio.getFormatSettingsModeAsURL());
    }

   /**
    * Test getSourceDurationLastFrameString3AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameString3AsInteger());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM AS Integer === " + jMetaDataAudio.getSourceDurationLastFrameString3AsInteger());
    }

   /**
    * Test getSourceDurationLastFrameString3AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsLong() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameString3AsLong());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM AS Long === " + jMetaDataAudio.getSourceDurationLastFrameString3AsLong());
    }

   /**
    * Test getSourceDurationLastFrameString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameString3AsLocalDateTime());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM AS LocalDateTime === " + jMetaDataAudio.getSourceDurationLastFrameString3AsLocalDateTime());
    }

   /**
    * Test getSourceDurationLastFrameString3AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameString3AsLocalTime());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM AS LocalTime === " + jMetaDataAudio.getSourceDurationLastFrameString3AsLocalTime());
    }

   /**
    * Test getSourceDurationLastFrameString3AsString() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsString() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameString3AsString());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM AS String === " + jMetaDataAudio.getSourceDurationLastFrameString3AsString());
    }

   /**
    * Test getSourceDurationLastFrameString3AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameString3AsBoolean());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM AS Boolean === " + jMetaDataAudio.getSourceDurationLastFrameString3AsBoolean());
    }

   /**
    * Test getSourceDurationLastFrameString3AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameString3AsBigInteger());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM AS BigInteger === " + jMetaDataAudio.getSourceDurationLastFrameString3AsBigInteger());
    }

   /**
    * Test getSourceDurationLastFrameString3AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsURL() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameString3AsURL());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM AS URL === " + jMetaDataAudio.getSourceDurationLastFrameString3AsURL());
    }

   /**
    * Test getSourceDurationLastFrameString2AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameString2AsInteger());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Integer === " + jMetaDataAudio.getSourceDurationLastFrameString2AsInteger());
    }

   /**
    * Test getSourceDurationLastFrameString2AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsLong() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameString2AsLong());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Long === " + jMetaDataAudio.getSourceDurationLastFrameString2AsLong());
    }

   /**
    * Test getSourceDurationLastFrameString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameString2AsLocalDateTime());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS LocalDateTime === " + jMetaDataAudio.getSourceDurationLastFrameString2AsLocalDateTime());
    }

   /**
    * Test getSourceDurationLastFrameString2AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameString2AsLocalTime());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS LocalTime === " + jMetaDataAudio.getSourceDurationLastFrameString2AsLocalTime());
    }

   /**
    * Test getSourceDurationLastFrameString2AsString() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsString() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameString2AsString());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS String === " + jMetaDataAudio.getSourceDurationLastFrameString2AsString());
    }

   /**
    * Test getSourceDurationLastFrameString2AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameString2AsBoolean());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Boolean === " + jMetaDataAudio.getSourceDurationLastFrameString2AsBoolean());
    }

   /**
    * Test getSourceDurationLastFrameString2AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameString2AsBigInteger());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS BigInteger === " + jMetaDataAudio.getSourceDurationLastFrameString2AsBigInteger());
    }

   /**
    * Test getSourceDurationLastFrameString2AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsURL() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameString2AsURL());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS URL === " + jMetaDataAudio.getSourceDurationLastFrameString2AsURL());
    }

   /**
    * Test getSourceDurationLastFrameString5AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameString5AsInteger());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Integer === " + jMetaDataAudio.getSourceDurationLastFrameString5AsInteger());
    }

   /**
    * Test getSourceDurationLastFrameString5AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsLong() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameString5AsLong());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Long === " + jMetaDataAudio.getSourceDurationLastFrameString5AsLong());
    }

   /**
    * Test getSourceDurationLastFrameString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameString5AsLocalDateTime());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS LocalDateTime === " + jMetaDataAudio.getSourceDurationLastFrameString5AsLocalDateTime());
    }

   /**
    * Test getSourceDurationLastFrameString5AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameString5AsLocalTime());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS LocalTime === " + jMetaDataAudio.getSourceDurationLastFrameString5AsLocalTime());
    }

   /**
    * Test getSourceDurationLastFrameString5AsString() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsString() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameString5AsString());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS String === " + jMetaDataAudio.getSourceDurationLastFrameString5AsString());
    }

   /**
    * Test getSourceDurationLastFrameString5AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameString5AsBoolean());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Boolean === " + jMetaDataAudio.getSourceDurationLastFrameString5AsBoolean());
    }

   /**
    * Test getSourceDurationLastFrameString5AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameString5AsBigInteger());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS BigInteger === " + jMetaDataAudio.getSourceDurationLastFrameString5AsBigInteger());
    }

   /**
    * Test getSourceDurationLastFrameString5AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsURL() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameString5AsURL());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS URL === " + jMetaDataAudio.getSourceDurationLastFrameString5AsURL());
    }

   /**
    * Test getSourceDurationLastFrameString4AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameString4AsInteger());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Integer === " + jMetaDataAudio.getSourceDurationLastFrameString4AsInteger());
    }

   /**
    * Test getSourceDurationLastFrameString4AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsLong() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameString4AsLong());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Long === " + jMetaDataAudio.getSourceDurationLastFrameString4AsLong());
    }

   /**
    * Test getSourceDurationLastFrameString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameString4AsLocalDateTime());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS LocalDateTime === " + jMetaDataAudio.getSourceDurationLastFrameString4AsLocalDateTime());
    }

   /**
    * Test getSourceDurationLastFrameString4AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameString4AsLocalTime());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS LocalTime === " + jMetaDataAudio.getSourceDurationLastFrameString4AsLocalTime());
    }

   /**
    * Test getSourceDurationLastFrameString4AsString() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsString() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameString4AsString());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS String === " + jMetaDataAudio.getSourceDurationLastFrameString4AsString());
    }

   /**
    * Test getSourceDurationLastFrameString4AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameString4AsBoolean());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Boolean === " + jMetaDataAudio.getSourceDurationLastFrameString4AsBoolean());
    }

   /**
    * Test getSourceDurationLastFrameString4AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameString4AsBigInteger());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS BigInteger === " + jMetaDataAudio.getSourceDurationLastFrameString4AsBigInteger());
    }

   /**
    * Test getSourceDurationLastFrameString4AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsURL() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationLastFrameString4AsURL());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS URL === " + jMetaDataAudio.getSourceDurationLastFrameString4AsURL());
    }

   /**
    * Test getBitDepthStringAsInteger() method.
    */
    @Test
    public void subTestGetBitDepthStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthStringAsInteger());
        System.out.println("Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different AS Integer === " + jMetaDataAudio.getBitDepthStringAsInteger());
    }

   /**
    * Test getBitDepthStringAsLong() method.
    */
    @Test
    public void subTestGetBitDepthStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthStringAsLong());
        System.out.println("Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different AS Long === " + jMetaDataAudio.getBitDepthStringAsLong());
    }

   /**
    * Test getBitDepthStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitDepthStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthStringAsLocalDateTime());
        System.out.println("Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different AS LocalDateTime === " + jMetaDataAudio.getBitDepthStringAsLocalDateTime());
    }

   /**
    * Test getBitDepthStringAsLocalTime() method.
    */
    @Test
    public void subTestGetBitDepthStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthStringAsLocalTime());
        System.out.println("Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different AS LocalTime === " + jMetaDataAudio.getBitDepthStringAsLocalTime());
    }

   /**
    * Test getBitDepthStringAsString() method.
    */
    @Test
    public void subTestGetBitDepthStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthStringAsString());
        System.out.println("Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different AS String === " + jMetaDataAudio.getBitDepthStringAsString());
    }

   /**
    * Test getBitDepthStringAsBoolean() method.
    */
    @Test
    public void subTestGetBitDepthStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthStringAsBoolean());
        System.out.println("Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different AS Boolean === " + jMetaDataAudio.getBitDepthStringAsBoolean());
    }

   /**
    * Test getBitDepthStringAsBigInteger() method.
    */
    @Test
    public void subTestGetBitDepthStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthStringAsBigInteger());
        System.out.println("Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different AS BigInteger === " + jMetaDataAudio.getBitDepthStringAsBigInteger());
    }

   /**
    * Test getBitDepthStringAsURL() method.
    */
    @Test
    public void subTestGetBitDepthStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthStringAsURL());
        System.out.println("Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different AS URL === " + jMetaDataAudio.getBitDepthStringAsURL());
    }

   /**
    * Test getFrameCountAsInteger() method.
    */
    @Test
    public void subTestGetFrameCountAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getFrameCountAsInteger());
        System.out.println("Frame count (a frame contains a count of samples depends of the format) AS Integer === " + jMetaDataAudio.getFrameCountAsInteger());
    }

   /**
    * Test getFrameCountAsLong() method.
    */
    @Test
    public void subTestGetFrameCountAsLong() {
        assertEquals(null, this.jMetaDataAudio.getFrameCountAsLong());
        System.out.println("Frame count (a frame contains a count of samples depends of the format) AS Long === " + jMetaDataAudio.getFrameCountAsLong());
    }

   /**
    * Test getFrameCountAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFrameCountAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getFrameCountAsLocalDateTime());
        System.out.println("Frame count (a frame contains a count of samples depends of the format) AS LocalDateTime === " + jMetaDataAudio.getFrameCountAsLocalDateTime());
    }

   /**
    * Test getFrameCountAsLocalTime() method.
    */
    @Test
    public void subTestGetFrameCountAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getFrameCountAsLocalTime());
        System.out.println("Frame count (a frame contains a count of samples depends of the format) AS LocalTime === " + jMetaDataAudio.getFrameCountAsLocalTime());
    }

   /**
    * Test getFrameCountAsString() method.
    */
    @Test
    public void subTestGetFrameCountAsString() {
        assertEquals(null, this.jMetaDataAudio.getFrameCountAsString());
        System.out.println("Frame count (a frame contains a count of samples depends of the format) AS String === " + jMetaDataAudio.getFrameCountAsString());
    }

   /**
    * Test getFrameCountAsBoolean() method.
    */
    @Test
    public void subTestGetFrameCountAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getFrameCountAsBoolean());
        System.out.println("Frame count (a frame contains a count of samples depends of the format) AS Boolean === " + jMetaDataAudio.getFrameCountAsBoolean());
    }

   /**
    * Test getFrameCountAsBigInteger() method.
    */
    @Test
    public void subTestGetFrameCountAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getFrameCountAsBigInteger());
        System.out.println("Frame count (a frame contains a count of samples depends of the format) AS BigInteger === " + jMetaDataAudio.getFrameCountAsBigInteger());
    }

   /**
    * Test getFrameCountAsURL() method.
    */
    @Test
    public void subTestGetFrameCountAsURL() {
        assertEquals(null, this.jMetaDataAudio.getFrameCountAsURL());
        System.out.println("Frame count (a frame contains a count of samples depends of the format) AS URL === " + jMetaDataAudio.getFrameCountAsURL());
    }

   /**
    * Test getTitleAsInteger() method.
    */
    @Test
    public void subTestGetTitleAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getTitleAsInteger());
        System.out.println("Name of the track AS Integer === " + jMetaDataAudio.getTitleAsInteger());
    }

   /**
    * Test getTitleAsLong() method.
    */
    @Test
    public void subTestGetTitleAsLong() {
        assertEquals(null, this.jMetaDataAudio.getTitleAsLong());
        System.out.println("Name of the track AS Long === " + jMetaDataAudio.getTitleAsLong());
    }

   /**
    * Test getTitleAsLocalDateTime() method.
    */
    @Test
    public void subTestGetTitleAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getTitleAsLocalDateTime());
        System.out.println("Name of the track AS LocalDateTime === " + jMetaDataAudio.getTitleAsLocalDateTime());
    }

   /**
    * Test getTitleAsLocalTime() method.
    */
    @Test
    public void subTestGetTitleAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getTitleAsLocalTime());
        System.out.println("Name of the track AS LocalTime === " + jMetaDataAudio.getTitleAsLocalTime());
    }

   /**
    * Test getTitleAsString() method.
    */
    @Test
    public void subTestGetTitleAsString() {
        assertEquals(null, this.jMetaDataAudio.getTitleAsString());
        System.out.println("Name of the track AS String === " + jMetaDataAudio.getTitleAsString());
    }

   /**
    * Test getTitleAsBoolean() method.
    */
    @Test
    public void subTestGetTitleAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getTitleAsBoolean());
        System.out.println("Name of the track AS Boolean === " + jMetaDataAudio.getTitleAsBoolean());
    }

   /**
    * Test getTitleAsBigInteger() method.
    */
    @Test
    public void subTestGetTitleAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getTitleAsBigInteger());
        System.out.println("Name of the track AS BigInteger === " + jMetaDataAudio.getTitleAsBigInteger());
    }

   /**
    * Test getTitleAsURL() method.
    */
    @Test
    public void subTestGetTitleAsURL() {
        assertEquals(null, this.jMetaDataAudio.getTitleAsURL());
        System.out.println("Name of the track AS URL === " + jMetaDataAudio.getTitleAsURL());
    }

   /**
    * Test getDelayDropFrameAsInteger() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDelayDropFrameAsInteger());
        System.out.println("Delay drop frame AS Integer === " + jMetaDataAudio.getDelayDropFrameAsInteger());
    }

   /**
    * Test getDelayDropFrameAsLong() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsLong() {
        assertEquals(null, this.jMetaDataAudio.getDelayDropFrameAsLong());
        System.out.println("Delay drop frame AS Long === " + jMetaDataAudio.getDelayDropFrameAsLong());
    }

   /**
    * Test getDelayDropFrameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDelayDropFrameAsLocalDateTime());
        System.out.println("Delay drop frame AS LocalDateTime === " + jMetaDataAudio.getDelayDropFrameAsLocalDateTime());
    }

   /**
    * Test getDelayDropFrameAsLocalTime() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDelayDropFrameAsLocalTime());
        System.out.println("Delay drop frame AS LocalTime === " + jMetaDataAudio.getDelayDropFrameAsLocalTime());
    }

   /**
    * Test getDelayDropFrameAsString() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsString() {
        assertEquals(null, this.jMetaDataAudio.getDelayDropFrameAsString());
        System.out.println("Delay drop frame AS String === " + jMetaDataAudio.getDelayDropFrameAsString());
    }

   /**
    * Test getDelayDropFrameAsBoolean() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDelayDropFrameAsBoolean());
        System.out.println("Delay drop frame AS Boolean === " + jMetaDataAudio.getDelayDropFrameAsBoolean());
    }

   /**
    * Test getDelayDropFrameAsBigInteger() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDelayDropFrameAsBigInteger());
        System.out.println("Delay drop frame AS BigInteger === " + jMetaDataAudio.getDelayDropFrameAsBigInteger());
    }

   /**
    * Test getDelayDropFrameAsURL() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsURL() {
        assertEquals(null, this.jMetaDataAudio.getDelayDropFrameAsURL());
        System.out.println("Delay drop frame AS URL === " + jMetaDataAudio.getDelayDropFrameAsURL());
    }

   /**
    * Test getSamplingRateAsInteger() method.
    */
    @Test
    public void subTestGetSamplingRateAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getSamplingRateAsInteger());
        System.out.println("Sampling rate AS Integer === " + jMetaDataAudio.getSamplingRateAsInteger());
    }

   /**
    * Test getSamplingRateAsLong() method.
    */
    @Test
    public void subTestGetSamplingRateAsLong() {
        assertEquals(null, this.jMetaDataAudio.getSamplingRateAsLong());
        System.out.println("Sampling rate AS Long === " + jMetaDataAudio.getSamplingRateAsLong());
    }

   /**
    * Test getSamplingRateAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSamplingRateAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getSamplingRateAsLocalDateTime());
        System.out.println("Sampling rate AS LocalDateTime === " + jMetaDataAudio.getSamplingRateAsLocalDateTime());
    }

   /**
    * Test getSamplingRateAsLocalTime() method.
    */
    @Test
    public void subTestGetSamplingRateAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getSamplingRateAsLocalTime());
        System.out.println("Sampling rate AS LocalTime === " + jMetaDataAudio.getSamplingRateAsLocalTime());
    }

   /**
    * Test getSamplingRateAsString() method.
    */
    @Test
    public void subTestGetSamplingRateAsString() {
        assertEquals(null, this.jMetaDataAudio.getSamplingRateAsString());
        System.out.println("Sampling rate AS String === " + jMetaDataAudio.getSamplingRateAsString());
    }

   /**
    * Test getSamplingRateAsBoolean() method.
    */
    @Test
    public void subTestGetSamplingRateAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getSamplingRateAsBoolean());
        System.out.println("Sampling rate AS Boolean === " + jMetaDataAudio.getSamplingRateAsBoolean());
    }

   /**
    * Test getSamplingRateAsBigInteger() method.
    */
    @Test
    public void subTestGetSamplingRateAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getSamplingRateAsBigInteger());
        System.out.println("Sampling rate AS BigInteger === " + jMetaDataAudio.getSamplingRateAsBigInteger());
    }

   /**
    * Test getSamplingRateAsURL() method.
    */
    @Test
    public void subTestGetSamplingRateAsURL() {
        assertEquals(null, this.jMetaDataAudio.getSamplingRateAsURL());
        System.out.println("Sampling rate AS URL === " + jMetaDataAudio.getSamplingRateAsURL());
    }

   /**
    * Test getBitRateMaximumAsInteger() method.
    */
    @Test
    public void subTestGetBitRateMaximumAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getBitRateMaximumAsInteger());
        System.out.println("Maximum Bit rate in bps AS Integer === " + jMetaDataAudio.getBitRateMaximumAsInteger());
    }

   /**
    * Test getBitRateMaximumAsLong() method.
    */
    @Test
    public void subTestGetBitRateMaximumAsLong() {
        assertEquals(null, this.jMetaDataAudio.getBitRateMaximumAsLong());
        System.out.println("Maximum Bit rate in bps AS Long === " + jMetaDataAudio.getBitRateMaximumAsLong());
    }

   /**
    * Test getBitRateMaximumAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitRateMaximumAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getBitRateMaximumAsLocalDateTime());
        System.out.println("Maximum Bit rate in bps AS LocalDateTime === " + jMetaDataAudio.getBitRateMaximumAsLocalDateTime());
    }

   /**
    * Test getBitRateMaximumAsLocalTime() method.
    */
    @Test
    public void subTestGetBitRateMaximumAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getBitRateMaximumAsLocalTime());
        System.out.println("Maximum Bit rate in bps AS LocalTime === " + jMetaDataAudio.getBitRateMaximumAsLocalTime());
    }

   /**
    * Test getBitRateMaximumAsString() method.
    */
    @Test
    public void subTestGetBitRateMaximumAsString() {
        assertEquals(null, this.jMetaDataAudio.getBitRateMaximumAsString());
        System.out.println("Maximum Bit rate in bps AS String === " + jMetaDataAudio.getBitRateMaximumAsString());
    }

   /**
    * Test getBitRateMaximumAsBoolean() method.
    */
    @Test
    public void subTestGetBitRateMaximumAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getBitRateMaximumAsBoolean());
        System.out.println("Maximum Bit rate in bps AS Boolean === " + jMetaDataAudio.getBitRateMaximumAsBoolean());
    }

   /**
    * Test getBitRateMaximumAsBigInteger() method.
    */
    @Test
    public void subTestGetBitRateMaximumAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getBitRateMaximumAsBigInteger());
        System.out.println("Maximum Bit rate in bps AS BigInteger === " + jMetaDataAudio.getBitRateMaximumAsBigInteger());
    }

   /**
    * Test getBitRateMaximumAsURL() method.
    */
    @Test
    public void subTestGetBitRateMaximumAsURL() {
        assertEquals(null, this.jMetaDataAudio.getBitRateMaximumAsURL());
        System.out.println("Maximum Bit rate in bps AS URL === " + jMetaDataAudio.getBitRateMaximumAsURL());
    }

   /**
    * Test getFormatSettingsEmphasisAsInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsEmphasisAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsEmphasisAsInteger());
        System.out.println("Format_Settings_Emphasis AS Integer === " + jMetaDataAudio.getFormatSettingsEmphasisAsInteger());
    }

   /**
    * Test getFormatSettingsEmphasisAsLong() method.
    */
    @Test
    public void subTestGetFormatSettingsEmphasisAsLong() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsEmphasisAsLong());
        System.out.println("Format_Settings_Emphasis AS Long === " + jMetaDataAudio.getFormatSettingsEmphasisAsLong());
    }

   /**
    * Test getFormatSettingsEmphasisAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatSettingsEmphasisAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsEmphasisAsLocalDateTime());
        System.out.println("Format_Settings_Emphasis AS LocalDateTime === " + jMetaDataAudio.getFormatSettingsEmphasisAsLocalDateTime());
    }

   /**
    * Test getFormatSettingsEmphasisAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatSettingsEmphasisAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsEmphasisAsLocalTime());
        System.out.println("Format_Settings_Emphasis AS LocalTime === " + jMetaDataAudio.getFormatSettingsEmphasisAsLocalTime());
    }

   /**
    * Test getFormatSettingsEmphasisAsString() method.
    */
    @Test
    public void subTestGetFormatSettingsEmphasisAsString() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsEmphasisAsString());
        System.out.println("Format_Settings_Emphasis AS String === " + jMetaDataAudio.getFormatSettingsEmphasisAsString());
    }

   /**
    * Test getFormatSettingsEmphasisAsBoolean() method.
    */
    @Test
    public void subTestGetFormatSettingsEmphasisAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsEmphasisAsBoolean());
        System.out.println("Format_Settings_Emphasis AS Boolean === " + jMetaDataAudio.getFormatSettingsEmphasisAsBoolean());
    }

   /**
    * Test getFormatSettingsEmphasisAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsEmphasisAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsEmphasisAsBigInteger());
        System.out.println("Format_Settings_Emphasis AS BigInteger === " + jMetaDataAudio.getFormatSettingsEmphasisAsBigInteger());
    }

   /**
    * Test getFormatSettingsEmphasisAsURL() method.
    */
    @Test
    public void subTestGetFormatSettingsEmphasisAsURL() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsEmphasisAsURL());
        System.out.println("Format_Settings_Emphasis AS URL === " + jMetaDataAudio.getFormatSettingsEmphasisAsURL());
    }

   /**
    * Test getStreamSizeProportionAsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeProportionAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeProportionAsInteger());
        System.out.println("Stream size divided by file size AS Integer === " + jMetaDataAudio.getStreamSizeProportionAsInteger());
    }

   /**
    * Test getStreamSizeProportionAsLong() method.
    */
    @Test
    public void subTestGetStreamSizeProportionAsLong() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeProportionAsLong());
        System.out.println("Stream size divided by file size AS Long === " + jMetaDataAudio.getStreamSizeProportionAsLong());
    }

   /**
    * Test getStreamSizeProportionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeProportionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeProportionAsLocalDateTime());
        System.out.println("Stream size divided by file size AS LocalDateTime === " + jMetaDataAudio.getStreamSizeProportionAsLocalDateTime());
    }

   /**
    * Test getStreamSizeProportionAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeProportionAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeProportionAsLocalTime());
        System.out.println("Stream size divided by file size AS LocalTime === " + jMetaDataAudio.getStreamSizeProportionAsLocalTime());
    }

   /**
    * Test getStreamSizeProportionAsString() method.
    */
    @Test
    public void subTestGetStreamSizeProportionAsString() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeProportionAsString());
        System.out.println("Stream size divided by file size AS String === " + jMetaDataAudio.getStreamSizeProportionAsString());
    }

   /**
    * Test getStreamSizeProportionAsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeProportionAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeProportionAsBoolean());
        System.out.println("Stream size divided by file size AS Boolean === " + jMetaDataAudio.getStreamSizeProportionAsBoolean());
    }

   /**
    * Test getStreamSizeProportionAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeProportionAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeProportionAsBigInteger());
        System.out.println("Stream size divided by file size AS BigInteger === " + jMetaDataAudio.getStreamSizeProportionAsBigInteger());
    }

   /**
    * Test getStreamSizeProportionAsURL() method.
    */
    @Test
    public void subTestGetStreamSizeProportionAsURL() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeProportionAsURL());
        System.out.println("Stream size divided by file size AS URL === " + jMetaDataAudio.getStreamSizeProportionAsURL());
    }

   /**
    * Test getSourceStreamSizeEncodedProportionAsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedProportionAsInteger());
        System.out.println("Source Encoded Stream size divided by file size AS Integer === " + jMetaDataAudio.getSourceStreamSizeEncodedProportionAsInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedProportionAsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsLong() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedProportionAsLong());
        System.out.println("Source Encoded Stream size divided by file size AS Long === " + jMetaDataAudio.getSourceStreamSizeEncodedProportionAsLong());
    }

   /**
    * Test getSourceStreamSizeEncodedProportionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedProportionAsLocalDateTime());
        System.out.println("Source Encoded Stream size divided by file size AS LocalDateTime === " + jMetaDataAudio.getSourceStreamSizeEncodedProportionAsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeEncodedProportionAsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedProportionAsLocalTime());
        System.out.println("Source Encoded Stream size divided by file size AS LocalTime === " + jMetaDataAudio.getSourceStreamSizeEncodedProportionAsLocalTime());
    }

   /**
    * Test getSourceStreamSizeEncodedProportionAsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsString() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedProportionAsString());
        System.out.println("Source Encoded Stream size divided by file size AS String === " + jMetaDataAudio.getSourceStreamSizeEncodedProportionAsString());
    }

   /**
    * Test getSourceStreamSizeEncodedProportionAsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedProportionAsBoolean());
        System.out.println("Source Encoded Stream size divided by file size AS Boolean === " + jMetaDataAudio.getSourceStreamSizeEncodedProportionAsBoolean());
    }

   /**
    * Test getSourceStreamSizeEncodedProportionAsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedProportionAsBigInteger());
        System.out.println("Source Encoded Stream size divided by file size AS BigInteger === " + jMetaDataAudio.getSourceStreamSizeEncodedProportionAsBigInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedProportionAsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsURL() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeEncodedProportionAsURL());
        System.out.println("Source Encoded Stream size divided by file size AS URL === " + jMetaDataAudio.getSourceStreamSizeEncodedProportionAsURL());
    }

   /**
    * Test getEncodedLibrarySettingsAsInteger() method.
    */
    @Test
    public void subTestGetEncodedLibrarySettingsAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibrarySettingsAsInteger());
        System.out.println("Parameters used by the software AS Integer === " + jMetaDataAudio.getEncodedLibrarySettingsAsInteger());
    }

   /**
    * Test getEncodedLibrarySettingsAsLong() method.
    */
    @Test
    public void subTestGetEncodedLibrarySettingsAsLong() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibrarySettingsAsLong());
        System.out.println("Parameters used by the software AS Long === " + jMetaDataAudio.getEncodedLibrarySettingsAsLong());
    }

   /**
    * Test getEncodedLibrarySettingsAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedLibrarySettingsAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibrarySettingsAsLocalDateTime());
        System.out.println("Parameters used by the software AS LocalDateTime === " + jMetaDataAudio.getEncodedLibrarySettingsAsLocalDateTime());
    }

   /**
    * Test getEncodedLibrarySettingsAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedLibrarySettingsAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibrarySettingsAsLocalTime());
        System.out.println("Parameters used by the software AS LocalTime === " + jMetaDataAudio.getEncodedLibrarySettingsAsLocalTime());
    }

   /**
    * Test getEncodedLibrarySettingsAsString() method.
    */
    @Test
    public void subTestGetEncodedLibrarySettingsAsString() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibrarySettingsAsString());
        System.out.println("Parameters used by the software AS String === " + jMetaDataAudio.getEncodedLibrarySettingsAsString());
    }

   /**
    * Test getEncodedLibrarySettingsAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedLibrarySettingsAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibrarySettingsAsBoolean());
        System.out.println("Parameters used by the software AS Boolean === " + jMetaDataAudio.getEncodedLibrarySettingsAsBoolean());
    }

   /**
    * Test getEncodedLibrarySettingsAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedLibrarySettingsAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibrarySettingsAsBigInteger());
        System.out.println("Parameters used by the software AS BigInteger === " + jMetaDataAudio.getEncodedLibrarySettingsAsBigInteger());
    }

   /**
    * Test getEncodedLibrarySettingsAsURL() method.
    */
    @Test
    public void subTestGetEncodedLibrarySettingsAsURL() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibrarySettingsAsURL());
        System.out.println("Parameters used by the software AS URL === " + jMetaDataAudio.getEncodedLibrarySettingsAsURL());
    }

   /**
    * Test getSourceDurationAsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationAsInteger());
        System.out.println("Source Play time of the stream, in ms AS Integer === " + jMetaDataAudio.getSourceDurationAsInteger());
    }

   /**
    * Test getSourceDurationAsLong() method.
    */
    @Test
    public void subTestGetSourceDurationAsLong() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationAsLong());
        System.out.println("Source Play time of the stream, in ms AS Long === " + jMetaDataAudio.getSourceDurationAsLong());
    }

   /**
    * Test getSourceDurationAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationAsLocalDateTime());
        System.out.println("Source Play time of the stream, in ms AS LocalDateTime === " + jMetaDataAudio.getSourceDurationAsLocalDateTime());
    }

   /**
    * Test getSourceDurationAsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationAsLocalTime());
        System.out.println("Source Play time of the stream, in ms AS LocalTime === " + jMetaDataAudio.getSourceDurationAsLocalTime());
    }

   /**
    * Test getSourceDurationAsString() method.
    */
    @Test
    public void subTestGetSourceDurationAsString() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationAsString());
        System.out.println("Source Play time of the stream, in ms AS String === " + jMetaDataAudio.getSourceDurationAsString());
    }

   /**
    * Test getSourceDurationAsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationAsBoolean());
        System.out.println("Source Play time of the stream, in ms AS Boolean === " + jMetaDataAudio.getSourceDurationAsBoolean());
    }

   /**
    * Test getSourceDurationAsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationAsBigInteger());
        System.out.println("Source Play time of the stream, in ms AS BigInteger === " + jMetaDataAudio.getSourceDurationAsBigInteger());
    }

   /**
    * Test getSourceDurationAsURL() method.
    */
    @Test
    public void subTestGetSourceDurationAsURL() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationAsURL());
        System.out.println("Source Play time of the stream, in ms AS URL === " + jMetaDataAudio.getSourceDurationAsURL());
    }

   /**
    * Test getFormatSettingsPSStringAsInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsPSStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsPSStringAsInteger());
        System.out.println("Format_Settings_PS/String AS Integer === " + jMetaDataAudio.getFormatSettingsPSStringAsInteger());
    }

   /**
    * Test getFormatSettingsPSStringAsLong() method.
    */
    @Test
    public void subTestGetFormatSettingsPSStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsPSStringAsLong());
        System.out.println("Format_Settings_PS/String AS Long === " + jMetaDataAudio.getFormatSettingsPSStringAsLong());
    }

   /**
    * Test getFormatSettingsPSStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatSettingsPSStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsPSStringAsLocalDateTime());
        System.out.println("Format_Settings_PS/String AS LocalDateTime === " + jMetaDataAudio.getFormatSettingsPSStringAsLocalDateTime());
    }

   /**
    * Test getFormatSettingsPSStringAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatSettingsPSStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsPSStringAsLocalTime());
        System.out.println("Format_Settings_PS/String AS LocalTime === " + jMetaDataAudio.getFormatSettingsPSStringAsLocalTime());
    }

   /**
    * Test getFormatSettingsPSStringAsString() method.
    */
    @Test
    public void subTestGetFormatSettingsPSStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsPSStringAsString());
        System.out.println("Format_Settings_PS/String AS String === " + jMetaDataAudio.getFormatSettingsPSStringAsString());
    }

   /**
    * Test getFormatSettingsPSStringAsBoolean() method.
    */
    @Test
    public void subTestGetFormatSettingsPSStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsPSStringAsBoolean());
        System.out.println("Format_Settings_PS/String AS Boolean === " + jMetaDataAudio.getFormatSettingsPSStringAsBoolean());
    }

   /**
    * Test getFormatSettingsPSStringAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsPSStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsPSStringAsBigInteger());
        System.out.println("Format_Settings_PS/String AS BigInteger === " + jMetaDataAudio.getFormatSettingsPSStringAsBigInteger());
    }

   /**
    * Test getFormatSettingsPSStringAsURL() method.
    */
    @Test
    public void subTestGetFormatSettingsPSStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsPSStringAsURL());
        System.out.println("Format_Settings_PS/String AS URL === " + jMetaDataAudio.getFormatSettingsPSStringAsURL());
    }

   /**
    * Test getDelayOriginalString1AsInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalString1AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalString1AsInteger());
        System.out.println("Delay with measurement AS Integer === " + jMetaDataAudio.getDelayOriginalString1AsInteger());
    }

   /**
    * Test getDelayOriginalString1AsLong() method.
    */
    @Test
    public void subTestGetDelayOriginalString1AsLong() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalString1AsLong());
        System.out.println("Delay with measurement AS Long === " + jMetaDataAudio.getDelayOriginalString1AsLong());
    }

   /**
    * Test getDelayOriginalString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayOriginalString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalString1AsLocalDateTime());
        System.out.println("Delay with measurement AS LocalDateTime === " + jMetaDataAudio.getDelayOriginalString1AsLocalDateTime());
    }

   /**
    * Test getDelayOriginalString1AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayOriginalString1AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalString1AsLocalTime());
        System.out.println("Delay with measurement AS LocalTime === " + jMetaDataAudio.getDelayOriginalString1AsLocalTime());
    }

   /**
    * Test getDelayOriginalString1AsString() method.
    */
    @Test
    public void subTestGetDelayOriginalString1AsString() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalString1AsString());
        System.out.println("Delay with measurement AS String === " + jMetaDataAudio.getDelayOriginalString1AsString());
    }

   /**
    * Test getDelayOriginalString1AsBoolean() method.
    */
    @Test
    public void subTestGetDelayOriginalString1AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalString1AsBoolean());
        System.out.println("Delay with measurement AS Boolean === " + jMetaDataAudio.getDelayOriginalString1AsBoolean());
    }

   /**
    * Test getDelayOriginalString1AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalString1AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalString1AsBigInteger());
        System.out.println("Delay with measurement AS BigInteger === " + jMetaDataAudio.getDelayOriginalString1AsBigInteger());
    }

   /**
    * Test getDelayOriginalString1AsURL() method.
    */
    @Test
    public void subTestGetDelayOriginalString1AsURL() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalString1AsURL());
        System.out.println("Delay with measurement AS URL === " + jMetaDataAudio.getDelayOriginalString1AsURL());
    }

   /**
    * Test getCountAsInteger() method.
    */
    @Test
    public void subTestGetCountAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getCountAsInteger());
        System.out.println("Count of objects available in this stream AS Integer === " + jMetaDataAudio.getCountAsInteger());
    }

   /**
    * Test getCountAsLong() method.
    */
    @Test
    public void subTestGetCountAsLong() {
        assertEquals(null, this.jMetaDataAudio.getCountAsLong());
        System.out.println("Count of objects available in this stream AS Long === " + jMetaDataAudio.getCountAsLong());
    }

   /**
    * Test getCountAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCountAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getCountAsLocalDateTime());
        System.out.println("Count of objects available in this stream AS LocalDateTime === " + jMetaDataAudio.getCountAsLocalDateTime());
    }

   /**
    * Test getCountAsLocalTime() method.
    */
    @Test
    public void subTestGetCountAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getCountAsLocalTime());
        System.out.println("Count of objects available in this stream AS LocalTime === " + jMetaDataAudio.getCountAsLocalTime());
    }

   /**
    * Test getCountAsString() method.
    */
    @Test
    public void subTestGetCountAsString() {
        assertEquals(null, this.jMetaDataAudio.getCountAsString());
        System.out.println("Count of objects available in this stream AS String === " + jMetaDataAudio.getCountAsString());
    }

   /**
    * Test getCountAsBoolean() method.
    */
    @Test
    public void subTestGetCountAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getCountAsBoolean());
        System.out.println("Count of objects available in this stream AS Boolean === " + jMetaDataAudio.getCountAsBoolean());
    }

   /**
    * Test getCountAsBigInteger() method.
    */
    @Test
    public void subTestGetCountAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getCountAsBigInteger());
        System.out.println("Count of objects available in this stream AS BigInteger === " + jMetaDataAudio.getCountAsBigInteger());
    }

   /**
    * Test getCountAsURL() method.
    */
    @Test
    public void subTestGetCountAsURL() {
        assertEquals(null, this.jMetaDataAudio.getCountAsURL());
        System.out.println("Count of objects available in this stream AS URL === " + jMetaDataAudio.getCountAsURL());
    }

   /**
    * Test getFormatSettingsWrappingAsInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsWrappingAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsWrappingAsInteger());
        System.out.println("Wrapping mode (Frame wrapped or Clip wrapped) AS Integer === " + jMetaDataAudio.getFormatSettingsWrappingAsInteger());
    }

   /**
    * Test getFormatSettingsWrappingAsLong() method.
    */
    @Test
    public void subTestGetFormatSettingsWrappingAsLong() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsWrappingAsLong());
        System.out.println("Wrapping mode (Frame wrapped or Clip wrapped) AS Long === " + jMetaDataAudio.getFormatSettingsWrappingAsLong());
    }

   /**
    * Test getFormatSettingsWrappingAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatSettingsWrappingAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsWrappingAsLocalDateTime());
        System.out.println("Wrapping mode (Frame wrapped or Clip wrapped) AS LocalDateTime === " + jMetaDataAudio.getFormatSettingsWrappingAsLocalDateTime());
    }

   /**
    * Test getFormatSettingsWrappingAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatSettingsWrappingAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsWrappingAsLocalTime());
        System.out.println("Wrapping mode (Frame wrapped or Clip wrapped) AS LocalTime === " + jMetaDataAudio.getFormatSettingsWrappingAsLocalTime());
    }

   /**
    * Test getFormatSettingsWrappingAsString() method.
    */
    @Test
    public void subTestGetFormatSettingsWrappingAsString() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsWrappingAsString());
        System.out.println("Wrapping mode (Frame wrapped or Clip wrapped) AS String === " + jMetaDataAudio.getFormatSettingsWrappingAsString());
    }

   /**
    * Test getFormatSettingsWrappingAsBoolean() method.
    */
    @Test
    public void subTestGetFormatSettingsWrappingAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsWrappingAsBoolean());
        System.out.println("Wrapping mode (Frame wrapped or Clip wrapped) AS Boolean === " + jMetaDataAudio.getFormatSettingsWrappingAsBoolean());
    }

   /**
    * Test getFormatSettingsWrappingAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsWrappingAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsWrappingAsBigInteger());
        System.out.println("Wrapping mode (Frame wrapped or Clip wrapped) AS BigInteger === " + jMetaDataAudio.getFormatSettingsWrappingAsBigInteger());
    }

   /**
    * Test getFormatSettingsWrappingAsURL() method.
    */
    @Test
    public void subTestGetFormatSettingsWrappingAsURL() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsWrappingAsURL());
        System.out.println("Wrapping mode (Frame wrapped or Clip wrapped) AS URL === " + jMetaDataAudio.getFormatSettingsWrappingAsURL());
    }

   /**
    * Test getDelayOriginalString2AsInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalString2AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalString2AsInteger());
        System.out.println("Delay with measurement AS Integer === " + jMetaDataAudio.getDelayOriginalString2AsInteger());
    }

   /**
    * Test getDelayOriginalString2AsLong() method.
    */
    @Test
    public void subTestGetDelayOriginalString2AsLong() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalString2AsLong());
        System.out.println("Delay with measurement AS Long === " + jMetaDataAudio.getDelayOriginalString2AsLong());
    }

   /**
    * Test getDelayOriginalString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayOriginalString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalString2AsLocalDateTime());
        System.out.println("Delay with measurement AS LocalDateTime === " + jMetaDataAudio.getDelayOriginalString2AsLocalDateTime());
    }

   /**
    * Test getDelayOriginalString2AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayOriginalString2AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalString2AsLocalTime());
        System.out.println("Delay with measurement AS LocalTime === " + jMetaDataAudio.getDelayOriginalString2AsLocalTime());
    }

   /**
    * Test getDelayOriginalString2AsString() method.
    */
    @Test
    public void subTestGetDelayOriginalString2AsString() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalString2AsString());
        System.out.println("Delay with measurement AS String === " + jMetaDataAudio.getDelayOriginalString2AsString());
    }

   /**
    * Test getDelayOriginalString2AsBoolean() method.
    */
    @Test
    public void subTestGetDelayOriginalString2AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalString2AsBoolean());
        System.out.println("Delay with measurement AS Boolean === " + jMetaDataAudio.getDelayOriginalString2AsBoolean());
    }

   /**
    * Test getDelayOriginalString2AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalString2AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalString2AsBigInteger());
        System.out.println("Delay with measurement AS BigInteger === " + jMetaDataAudio.getDelayOriginalString2AsBigInteger());
    }

   /**
    * Test getDelayOriginalString2AsURL() method.
    */
    @Test
    public void subTestGetDelayOriginalString2AsURL() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalString2AsURL());
        System.out.println("Delay with measurement AS URL === " + jMetaDataAudio.getDelayOriginalString2AsURL());
    }

   /**
    * Test getEncryptionAsInteger() method.
    */
    @Test
    public void subTestGetEncryptionAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getEncryptionAsInteger());
        System.out.println("Encryption AS Integer === " + jMetaDataAudio.getEncryptionAsInteger());
    }

   /**
    * Test getEncryptionAsLong() method.
    */
    @Test
    public void subTestGetEncryptionAsLong() {
        assertEquals(null, this.jMetaDataAudio.getEncryptionAsLong());
        System.out.println("Encryption AS Long === " + jMetaDataAudio.getEncryptionAsLong());
    }

   /**
    * Test getEncryptionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncryptionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getEncryptionAsLocalDateTime());
        System.out.println("Encryption AS LocalDateTime === " + jMetaDataAudio.getEncryptionAsLocalDateTime());
    }

   /**
    * Test getEncryptionAsLocalTime() method.
    */
    @Test
    public void subTestGetEncryptionAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getEncryptionAsLocalTime());
        System.out.println("Encryption AS LocalTime === " + jMetaDataAudio.getEncryptionAsLocalTime());
    }

   /**
    * Test getEncryptionAsString() method.
    */
    @Test
    public void subTestGetEncryptionAsString() {
        assertEquals(null, this.jMetaDataAudio.getEncryptionAsString());
        System.out.println("Encryption AS String === " + jMetaDataAudio.getEncryptionAsString());
    }

   /**
    * Test getEncryptionAsBoolean() method.
    */
    @Test
    public void subTestGetEncryptionAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getEncryptionAsBoolean());
        System.out.println("Encryption AS Boolean === " + jMetaDataAudio.getEncryptionAsBoolean());
    }

   /**
    * Test getEncryptionAsBigInteger() method.
    */
    @Test
    public void subTestGetEncryptionAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getEncryptionAsBigInteger());
        System.out.println("Encryption AS BigInteger === " + jMetaDataAudio.getEncryptionAsBigInteger());
    }

   /**
    * Test getEncryptionAsURL() method.
    */
    @Test
    public void subTestGetEncryptionAsURL() {
        assertEquals(null, this.jMetaDataAudio.getEncryptionAsURL());
        System.out.println("Encryption AS URL === " + jMetaDataAudio.getEncryptionAsURL());
    }

   /**
    * Test getDelayOriginalAsInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalAsInteger());
        System.out.println("Delay fixed in the raw stream (relative) IN MS AS Integer === " + jMetaDataAudio.getDelayOriginalAsInteger());
    }

   /**
    * Test getDelayOriginalAsLong() method.
    */
    @Test
    public void subTestGetDelayOriginalAsLong() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalAsLong());
        System.out.println("Delay fixed in the raw stream (relative) IN MS AS Long === " + jMetaDataAudio.getDelayOriginalAsLong());
    }

   /**
    * Test getDelayOriginalAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayOriginalAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalAsLocalDateTime());
        System.out.println("Delay fixed in the raw stream (relative) IN MS AS LocalDateTime === " + jMetaDataAudio.getDelayOriginalAsLocalDateTime());
    }

   /**
    * Test getDelayOriginalAsLocalTime() method.
    */
    @Test
    public void subTestGetDelayOriginalAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalAsLocalTime());
        System.out.println("Delay fixed in the raw stream (relative) IN MS AS LocalTime === " + jMetaDataAudio.getDelayOriginalAsLocalTime());
    }

   /**
    * Test getDelayOriginalAsString() method.
    */
    @Test
    public void subTestGetDelayOriginalAsString() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalAsString());
        System.out.println("Delay fixed in the raw stream (relative) IN MS AS String === " + jMetaDataAudio.getDelayOriginalAsString());
    }

   /**
    * Test getDelayOriginalAsBoolean() method.
    */
    @Test
    public void subTestGetDelayOriginalAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalAsBoolean());
        System.out.println("Delay fixed in the raw stream (relative) IN MS AS Boolean === " + jMetaDataAudio.getDelayOriginalAsBoolean());
    }

   /**
    * Test getDelayOriginalAsBigInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalAsBigInteger());
        System.out.println("Delay fixed in the raw stream (relative) IN MS AS BigInteger === " + jMetaDataAudio.getDelayOriginalAsBigInteger());
    }

   /**
    * Test getDelayOriginalAsURL() method.
    */
    @Test
    public void subTestGetDelayOriginalAsURL() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalAsURL());
        System.out.println("Delay fixed in the raw stream (relative) IN MS AS URL === " + jMetaDataAudio.getDelayOriginalAsURL());
    }

   /**
    * Test getFrameRateNumAsInteger() method.
    */
    @Test
    public void subTestGetFrameRateNumAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getFrameRateNumAsInteger());
        System.out.println("Frames per second, numerator AS Integer === " + jMetaDataAudio.getFrameRateNumAsInteger());
    }

   /**
    * Test getFrameRateNumAsLong() method.
    */
    @Test
    public void subTestGetFrameRateNumAsLong() {
        assertEquals(null, this.jMetaDataAudio.getFrameRateNumAsLong());
        System.out.println("Frames per second, numerator AS Long === " + jMetaDataAudio.getFrameRateNumAsLong());
    }

   /**
    * Test getFrameRateNumAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFrameRateNumAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getFrameRateNumAsLocalDateTime());
        System.out.println("Frames per second, numerator AS LocalDateTime === " + jMetaDataAudio.getFrameRateNumAsLocalDateTime());
    }

   /**
    * Test getFrameRateNumAsLocalTime() method.
    */
    @Test
    public void subTestGetFrameRateNumAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getFrameRateNumAsLocalTime());
        System.out.println("Frames per second, numerator AS LocalTime === " + jMetaDataAudio.getFrameRateNumAsLocalTime());
    }

   /**
    * Test getFrameRateNumAsString() method.
    */
    @Test
    public void subTestGetFrameRateNumAsString() {
        assertEquals(null, this.jMetaDataAudio.getFrameRateNumAsString());
        System.out.println("Frames per second, numerator AS String === " + jMetaDataAudio.getFrameRateNumAsString());
    }

   /**
    * Test getFrameRateNumAsBoolean() method.
    */
    @Test
    public void subTestGetFrameRateNumAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getFrameRateNumAsBoolean());
        System.out.println("Frames per second, numerator AS Boolean === " + jMetaDataAudio.getFrameRateNumAsBoolean());
    }

   /**
    * Test getFrameRateNumAsBigInteger() method.
    */
    @Test
    public void subTestGetFrameRateNumAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getFrameRateNumAsBigInteger());
        System.out.println("Frames per second, numerator AS BigInteger === " + jMetaDataAudio.getFrameRateNumAsBigInteger());
    }

   /**
    * Test getFrameRateNumAsURL() method.
    */
    @Test
    public void subTestGetFrameRateNumAsURL() {
        assertEquals(null, this.jMetaDataAudio.getFrameRateNumAsURL());
        System.out.println("Frames per second, numerator AS URL === " + jMetaDataAudio.getFrameRateNumAsURL());
    }

   /**
    * Test getAlignmentAsInteger() method.
    */
    @Test
    public void subTestGetAlignmentAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getAlignmentAsInteger());
        System.out.println("How this stream file is aligned in the container AS Integer === " + jMetaDataAudio.getAlignmentAsInteger());
    }

   /**
    * Test getAlignmentAsLong() method.
    */
    @Test
    public void subTestGetAlignmentAsLong() {
        assertEquals(null, this.jMetaDataAudio.getAlignmentAsLong());
        System.out.println("How this stream file is aligned in the container AS Long === " + jMetaDataAudio.getAlignmentAsLong());
    }

   /**
    * Test getAlignmentAsLocalDateTime() method.
    */
    @Test
    public void subTestGetAlignmentAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getAlignmentAsLocalDateTime());
        System.out.println("How this stream file is aligned in the container AS LocalDateTime === " + jMetaDataAudio.getAlignmentAsLocalDateTime());
    }

   /**
    * Test getAlignmentAsLocalTime() method.
    */
    @Test
    public void subTestGetAlignmentAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getAlignmentAsLocalTime());
        System.out.println("How this stream file is aligned in the container AS LocalTime === " + jMetaDataAudio.getAlignmentAsLocalTime());
    }

   /**
    * Test getAlignmentAsString() method.
    */
    @Test
    public void subTestGetAlignmentAsString() {
        assertEquals(null, this.jMetaDataAudio.getAlignmentAsString());
        System.out.println("How this stream file is aligned in the container AS String === " + jMetaDataAudio.getAlignmentAsString());
    }

   /**
    * Test getAlignmentAsBoolean() method.
    */
    @Test
    public void subTestGetAlignmentAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getAlignmentAsBoolean());
        System.out.println("How this stream file is aligned in the container AS Boolean === " + jMetaDataAudio.getAlignmentAsBoolean());
    }

   /**
    * Test getAlignmentAsBigInteger() method.
    */
    @Test
    public void subTestGetAlignmentAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getAlignmentAsBigInteger());
        System.out.println("How this stream file is aligned in the container AS BigInteger === " + jMetaDataAudio.getAlignmentAsBigInteger());
    }

   /**
    * Test getAlignmentAsURL() method.
    */
    @Test
    public void subTestGetAlignmentAsURL() {
        assertEquals(null, this.jMetaDataAudio.getAlignmentAsURL());
        System.out.println("How this stream file is aligned in the container AS URL === " + jMetaDataAudio.getAlignmentAsURL());
    }

   /**
    * Test getFormatVersionAsInteger() method.
    */
    @Test
    public void subTestGetFormatVersionAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatVersionAsInteger());
        System.out.println("Version of this format AS Integer === " + jMetaDataAudio.getFormatVersionAsInteger());
    }

   /**
    * Test getFormatVersionAsLong() method.
    */
    @Test
    public void subTestGetFormatVersionAsLong() {
        assertEquals(null, this.jMetaDataAudio.getFormatVersionAsLong());
        System.out.println("Version of this format AS Long === " + jMetaDataAudio.getFormatVersionAsLong());
    }

   /**
    * Test getFormatVersionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatVersionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatVersionAsLocalDateTime());
        System.out.println("Version of this format AS LocalDateTime === " + jMetaDataAudio.getFormatVersionAsLocalDateTime());
    }

   /**
    * Test getFormatVersionAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatVersionAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatVersionAsLocalTime());
        System.out.println("Version of this format AS LocalTime === " + jMetaDataAudio.getFormatVersionAsLocalTime());
    }

   /**
    * Test getFormatVersionAsString() method.
    */
    @Test
    public void subTestGetFormatVersionAsString() {
        assertEquals(null, this.jMetaDataAudio.getFormatVersionAsString());
        System.out.println("Version of this format AS String === " + jMetaDataAudio.getFormatVersionAsString());
    }

   /**
    * Test getFormatVersionAsBoolean() method.
    */
    @Test
    public void subTestGetFormatVersionAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getFormatVersionAsBoolean());
        System.out.println("Version of this format AS Boolean === " + jMetaDataAudio.getFormatVersionAsBoolean());
    }

   /**
    * Test getFormatVersionAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatVersionAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatVersionAsBigInteger());
        System.out.println("Version of this format AS BigInteger === " + jMetaDataAudio.getFormatVersionAsBigInteger());
    }

   /**
    * Test getFormatVersionAsURL() method.
    */
    @Test
    public void subTestGetFormatVersionAsURL() {
        assertEquals(null, this.jMetaDataAudio.getFormatVersionAsURL());
        System.out.println("Version of this format AS URL === " + jMetaDataAudio.getFormatVersionAsURL());
    }

   /**
    * Test getStreamKindPosAsInteger() method.
    */
    @Test
    public void subTestGetStreamKindPosAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamKindPosAsInteger());
        System.out.println("When multiple streams, number of the stream (base=1) AS Integer === " + jMetaDataAudio.getStreamKindPosAsInteger());
    }

   /**
    * Test getStreamKindPosAsLong() method.
    */
    @Test
    public void subTestGetStreamKindPosAsLong() {
        assertEquals(null, this.jMetaDataAudio.getStreamKindPosAsLong());
        System.out.println("When multiple streams, number of the stream (base=1) AS Long === " + jMetaDataAudio.getStreamKindPosAsLong());
    }

   /**
    * Test getStreamKindPosAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamKindPosAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamKindPosAsLocalDateTime());
        System.out.println("When multiple streams, number of the stream (base=1) AS LocalDateTime === " + jMetaDataAudio.getStreamKindPosAsLocalDateTime());
    }

   /**
    * Test getStreamKindPosAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamKindPosAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamKindPosAsLocalTime());
        System.out.println("When multiple streams, number of the stream (base=1) AS LocalTime === " + jMetaDataAudio.getStreamKindPosAsLocalTime());
    }

   /**
    * Test getStreamKindPosAsString() method.
    */
    @Test
    public void subTestGetStreamKindPosAsString() {
        assertEquals(null, this.jMetaDataAudio.getStreamKindPosAsString());
        System.out.println("When multiple streams, number of the stream (base=1) AS String === " + jMetaDataAudio.getStreamKindPosAsString());
    }

   /**
    * Test getStreamKindPosAsBoolean() method.
    */
    @Test
    public void subTestGetStreamKindPosAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getStreamKindPosAsBoolean());
        System.out.println("When multiple streams, number of the stream (base=1) AS Boolean === " + jMetaDataAudio.getStreamKindPosAsBoolean());
    }

   /**
    * Test getStreamKindPosAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamKindPosAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamKindPosAsBigInteger());
        System.out.println("When multiple streams, number of the stream (base=1) AS BigInteger === " + jMetaDataAudio.getStreamKindPosAsBigInteger());
    }

   /**
    * Test getStreamKindPosAsURL() method.
    */
    @Test
    public void subTestGetStreamKindPosAsURL() {
        assertEquals(null, this.jMetaDataAudio.getStreamKindPosAsURL());
        System.out.println("When multiple streams, number of the stream (base=1) AS URL === " + jMetaDataAudio.getStreamKindPosAsURL());
    }

   /**
    * Test getOriginalSourceMediumIDAsInteger() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getOriginalSourceMediumIDAsInteger());
        System.out.println("The ID for this stream in the original medium of the material AS Integer === " + jMetaDataAudio.getOriginalSourceMediumIDAsInteger());
    }

   /**
    * Test getOriginalSourceMediumIDAsLong() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsLong() {
        assertEquals(null, this.jMetaDataAudio.getOriginalSourceMediumIDAsLong());
        System.out.println("The ID for this stream in the original medium of the material AS Long === " + jMetaDataAudio.getOriginalSourceMediumIDAsLong());
    }

   /**
    * Test getOriginalSourceMediumIDAsLocalDateTime() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getOriginalSourceMediumIDAsLocalDateTime());
        System.out.println("The ID for this stream in the original medium of the material AS LocalDateTime === " + jMetaDataAudio.getOriginalSourceMediumIDAsLocalDateTime());
    }

   /**
    * Test getOriginalSourceMediumIDAsLocalTime() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getOriginalSourceMediumIDAsLocalTime());
        System.out.println("The ID for this stream in the original medium of the material AS LocalTime === " + jMetaDataAudio.getOriginalSourceMediumIDAsLocalTime());
    }

   /**
    * Test getOriginalSourceMediumIDAsString() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsString() {
        assertEquals(null, this.jMetaDataAudio.getOriginalSourceMediumIDAsString());
        System.out.println("The ID for this stream in the original medium of the material AS String === " + jMetaDataAudio.getOriginalSourceMediumIDAsString());
    }

   /**
    * Test getOriginalSourceMediumIDAsBoolean() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getOriginalSourceMediumIDAsBoolean());
        System.out.println("The ID for this stream in the original medium of the material AS Boolean === " + jMetaDataAudio.getOriginalSourceMediumIDAsBoolean());
    }

   /**
    * Test getOriginalSourceMediumIDAsBigInteger() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getOriginalSourceMediumIDAsBigInteger());
        System.out.println("The ID for this stream in the original medium of the material AS BigInteger === " + jMetaDataAudio.getOriginalSourceMediumIDAsBigInteger());
    }

   /**
    * Test getOriginalSourceMediumIDAsURL() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsURL() {
        assertEquals(null, this.jMetaDataAudio.getOriginalSourceMediumIDAsURL());
        System.out.println("The ID for this stream in the original medium of the material AS URL === " + jMetaDataAudio.getOriginalSourceMediumIDAsURL());
    }

   /**
    * Test getDurationStringAsInteger() method.
    */
    @Test
    public void subTestGetDurationStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDurationStringAsInteger());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS Integer === " + jMetaDataAudio.getDurationStringAsInteger());
    }

   /**
    * Test getDurationStringAsLong() method.
    */
    @Test
    public void subTestGetDurationStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getDurationStringAsLong());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS Long === " + jMetaDataAudio.getDurationStringAsLong());
    }

   /**
    * Test getDurationStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDurationStringAsLocalDateTime());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS LocalDateTime === " + jMetaDataAudio.getDurationStringAsLocalDateTime());
    }

   /**
    * Test getDurationStringAsLocalTime() method.
    */
    @Test
    public void subTestGetDurationStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDurationStringAsLocalTime());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS LocalTime === " + jMetaDataAudio.getDurationStringAsLocalTime());
    }

   /**
    * Test getDurationStringAsString() method.
    */
    @Test
    public void subTestGetDurationStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getDurationStringAsString());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS String === " + jMetaDataAudio.getDurationStringAsString());
    }

   /**
    * Test getDurationStringAsBoolean() method.
    */
    @Test
    public void subTestGetDurationStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDurationStringAsBoolean());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS Boolean === " + jMetaDataAudio.getDurationStringAsBoolean());
    }

   /**
    * Test getDurationStringAsBigInteger() method.
    */
    @Test
    public void subTestGetDurationStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDurationStringAsBigInteger());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS BigInteger === " + jMetaDataAudio.getDurationStringAsBigInteger());
    }

   /**
    * Test getDurationStringAsURL() method.
    */
    @Test
    public void subTestGetDurationStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getDurationStringAsURL());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS URL === " + jMetaDataAudio.getDurationStringAsURL());
    }

   /**
    * Test getIDAsInteger() method.
    */
    @Test
    public void subTestGetIDAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getIDAsInteger());
        System.out.println("The ID for this stream in this file AS Integer === " + jMetaDataAudio.getIDAsInteger());
    }

   /**
    * Test getIDAsLong() method.
    */
    @Test
    public void subTestGetIDAsLong() {
        assertEquals(null, this.jMetaDataAudio.getIDAsLong());
        System.out.println("The ID for this stream in this file AS Long === " + jMetaDataAudio.getIDAsLong());
    }

   /**
    * Test getIDAsLocalDateTime() method.
    */
    @Test
    public void subTestGetIDAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getIDAsLocalDateTime());
        System.out.println("The ID for this stream in this file AS LocalDateTime === " + jMetaDataAudio.getIDAsLocalDateTime());
    }

   /**
    * Test getIDAsLocalTime() method.
    */
    @Test
    public void subTestGetIDAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getIDAsLocalTime());
        System.out.println("The ID for this stream in this file AS LocalTime === " + jMetaDataAudio.getIDAsLocalTime());
    }

   /**
    * Test getIDAsString() method.
    */
    @Test
    public void subTestGetIDAsString() {
        assertEquals(null, this.jMetaDataAudio.getIDAsString());
        System.out.println("The ID for this stream in this file AS String === " + jMetaDataAudio.getIDAsString());
    }

   /**
    * Test getIDAsBoolean() method.
    */
    @Test
    public void subTestGetIDAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getIDAsBoolean());
        System.out.println("The ID for this stream in this file AS Boolean === " + jMetaDataAudio.getIDAsBoolean());
    }

   /**
    * Test getIDAsBigInteger() method.
    */
    @Test
    public void subTestGetIDAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getIDAsBigInteger());
        System.out.println("The ID for this stream in this file AS BigInteger === " + jMetaDataAudio.getIDAsBigInteger());
    }

   /**
    * Test getIDAsURL() method.
    */
    @Test
    public void subTestGetIDAsURL() {
        assertEquals(null, this.jMetaDataAudio.getIDAsURL());
        System.out.println("The ID for this stream in this file AS URL === " + jMetaDataAudio.getIDAsURL());
    }

   /**
    * Test getVideoDelayAsInteger() method.
    */
    @Test
    public void subTestGetVideoDelayAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayAsInteger());
        System.out.println("Delay fixed in the stream (absolute / video) AS Integer === " + jMetaDataAudio.getVideoDelayAsInteger());
    }

   /**
    * Test getVideoDelayAsLong() method.
    */
    @Test
    public void subTestGetVideoDelayAsLong() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayAsLong());
        System.out.println("Delay fixed in the stream (absolute / video) AS Long === " + jMetaDataAudio.getVideoDelayAsLong());
    }

   /**
    * Test getVideoDelayAsLocalDateTime() method.
    */
    @Test
    public void subTestGetVideoDelayAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayAsLocalDateTime());
        System.out.println("Delay fixed in the stream (absolute / video) AS LocalDateTime === " + jMetaDataAudio.getVideoDelayAsLocalDateTime());
    }

   /**
    * Test getVideoDelayAsLocalTime() method.
    */
    @Test
    public void subTestGetVideoDelayAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayAsLocalTime());
        System.out.println("Delay fixed in the stream (absolute / video) AS LocalTime === " + jMetaDataAudio.getVideoDelayAsLocalTime());
    }

   /**
    * Test getVideoDelayAsString() method.
    */
    @Test
    public void subTestGetVideoDelayAsString() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayAsString());
        System.out.println("Delay fixed in the stream (absolute / video) AS String === " + jMetaDataAudio.getVideoDelayAsString());
    }

   /**
    * Test getVideoDelayAsBoolean() method.
    */
    @Test
    public void subTestGetVideoDelayAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayAsBoolean());
        System.out.println("Delay fixed in the stream (absolute / video) AS Boolean === " + jMetaDataAudio.getVideoDelayAsBoolean());
    }

   /**
    * Test getVideoDelayAsBigInteger() method.
    */
    @Test
    public void subTestGetVideoDelayAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayAsBigInteger());
        System.out.println("Delay fixed in the stream (absolute / video) AS BigInteger === " + jMetaDataAudio.getVideoDelayAsBigInteger());
    }

   /**
    * Test getVideoDelayAsURL() method.
    */
    @Test
    public void subTestGetVideoDelayAsURL() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayAsURL());
        System.out.println("Delay fixed in the stream (absolute / video) AS URL === " + jMetaDataAudio.getVideoDelayAsURL());
    }

   /**
    * Test getReplayGainGainAsInteger() method.
    */
    @Test
    public void subTestGetReplayGainGainAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getReplayGainGainAsInteger());
        System.out.println("The gain to apply to reach 89dB SPL on playback AS Integer === " + jMetaDataAudio.getReplayGainGainAsInteger());
    }

   /**
    * Test getReplayGainGainAsLong() method.
    */
    @Test
    public void subTestGetReplayGainGainAsLong() {
        assertEquals(null, this.jMetaDataAudio.getReplayGainGainAsLong());
        System.out.println("The gain to apply to reach 89dB SPL on playback AS Long === " + jMetaDataAudio.getReplayGainGainAsLong());
    }

   /**
    * Test getReplayGainGainAsLocalDateTime() method.
    */
    @Test
    public void subTestGetReplayGainGainAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getReplayGainGainAsLocalDateTime());
        System.out.println("The gain to apply to reach 89dB SPL on playback AS LocalDateTime === " + jMetaDataAudio.getReplayGainGainAsLocalDateTime());
    }

   /**
    * Test getReplayGainGainAsLocalTime() method.
    */
    @Test
    public void subTestGetReplayGainGainAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getReplayGainGainAsLocalTime());
        System.out.println("The gain to apply to reach 89dB SPL on playback AS LocalTime === " + jMetaDataAudio.getReplayGainGainAsLocalTime());
    }

   /**
    * Test getReplayGainGainAsString() method.
    */
    @Test
    public void subTestGetReplayGainGainAsString() {
        assertEquals(null, this.jMetaDataAudio.getReplayGainGainAsString());
        System.out.println("The gain to apply to reach 89dB SPL on playback AS String === " + jMetaDataAudio.getReplayGainGainAsString());
    }

   /**
    * Test getReplayGainGainAsBoolean() method.
    */
    @Test
    public void subTestGetReplayGainGainAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getReplayGainGainAsBoolean());
        System.out.println("The gain to apply to reach 89dB SPL on playback AS Boolean === " + jMetaDataAudio.getReplayGainGainAsBoolean());
    }

   /**
    * Test getReplayGainGainAsBigInteger() method.
    */
    @Test
    public void subTestGetReplayGainGainAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getReplayGainGainAsBigInteger());
        System.out.println("The gain to apply to reach 89dB SPL on playback AS BigInteger === " + jMetaDataAudio.getReplayGainGainAsBigInteger());
    }

   /**
    * Test getReplayGainGainAsURL() method.
    */
    @Test
    public void subTestGetReplayGainGainAsURL() {
        assertEquals(null, this.jMetaDataAudio.getReplayGainGainAsURL());
        System.out.println("The gain to apply to reach 89dB SPL on playback AS URL === " + jMetaDataAudio.getReplayGainGainAsURL());
    }

   /**
    * Test getEncodedLibraryDateAsInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryDateAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryDateAsInteger());
        System.out.println("Release date of software AS Integer === " + jMetaDataAudio.getEncodedLibraryDateAsInteger());
    }

   /**
    * Test getEncodedLibraryDateAsLong() method.
    */
    @Test
    public void subTestGetEncodedLibraryDateAsLong() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryDateAsLong());
        System.out.println("Release date of software AS Long === " + jMetaDataAudio.getEncodedLibraryDateAsLong());
    }

   /**
    * Test getEncodedLibraryDateAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryDateAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryDateAsLocalDateTime());
        System.out.println("Release date of software AS LocalDateTime === " + jMetaDataAudio.getEncodedLibraryDateAsLocalDateTime());
    }

   /**
    * Test getEncodedLibraryDateAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryDateAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryDateAsLocalTime());
        System.out.println("Release date of software AS LocalTime === " + jMetaDataAudio.getEncodedLibraryDateAsLocalTime());
    }

   /**
    * Test getEncodedLibraryDateAsString() method.
    */
    @Test
    public void subTestGetEncodedLibraryDateAsString() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryDateAsString());
        System.out.println("Release date of software AS String === " + jMetaDataAudio.getEncodedLibraryDateAsString());
    }

   /**
    * Test getEncodedLibraryDateAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedLibraryDateAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryDateAsBoolean());
        System.out.println("Release date of software AS Boolean === " + jMetaDataAudio.getEncodedLibraryDateAsBoolean());
    }

   /**
    * Test getEncodedLibraryDateAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryDateAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryDateAsBigInteger());
        System.out.println("Release date of software AS BigInteger === " + jMetaDataAudio.getEncodedLibraryDateAsBigInteger());
    }

   /**
    * Test getEncodedLibraryDateAsURL() method.
    */
    @Test
    public void subTestGetEncodedLibraryDateAsURL() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryDateAsURL());
        System.out.println("Release date of software AS URL === " + jMetaDataAudio.getEncodedLibraryDateAsURL());
    }

   /**
    * Test getMenuIDStringAsInteger() method.
    */
    @Test
    public void subTestGetMenuIDStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getMenuIDStringAsInteger());
        System.out.println("The menu ID for this stream in this file AS Integer === " + jMetaDataAudio.getMenuIDStringAsInteger());
    }

   /**
    * Test getMenuIDStringAsLong() method.
    */
    @Test
    public void subTestGetMenuIDStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getMenuIDStringAsLong());
        System.out.println("The menu ID for this stream in this file AS Long === " + jMetaDataAudio.getMenuIDStringAsLong());
    }

   /**
    * Test getMenuIDStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetMenuIDStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getMenuIDStringAsLocalDateTime());
        System.out.println("The menu ID for this stream in this file AS LocalDateTime === " + jMetaDataAudio.getMenuIDStringAsLocalDateTime());
    }

   /**
    * Test getMenuIDStringAsLocalTime() method.
    */
    @Test
    public void subTestGetMenuIDStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getMenuIDStringAsLocalTime());
        System.out.println("The menu ID for this stream in this file AS LocalTime === " + jMetaDataAudio.getMenuIDStringAsLocalTime());
    }

   /**
    * Test getMenuIDStringAsString() method.
    */
    @Test
    public void subTestGetMenuIDStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getMenuIDStringAsString());
        System.out.println("The menu ID for this stream in this file AS String === " + jMetaDataAudio.getMenuIDStringAsString());
    }

   /**
    * Test getMenuIDStringAsBoolean() method.
    */
    @Test
    public void subTestGetMenuIDStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getMenuIDStringAsBoolean());
        System.out.println("The menu ID for this stream in this file AS Boolean === " + jMetaDataAudio.getMenuIDStringAsBoolean());
    }

   /**
    * Test getMenuIDStringAsBigInteger() method.
    */
    @Test
    public void subTestGetMenuIDStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getMenuIDStringAsBigInteger());
        System.out.println("The menu ID for this stream in this file AS BigInteger === " + jMetaDataAudio.getMenuIDStringAsBigInteger());
    }

   /**
    * Test getMenuIDStringAsURL() method.
    */
    @Test
    public void subTestGetMenuIDStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getMenuIDStringAsURL());
        System.out.println("The menu ID for this stream in this file AS URL === " + jMetaDataAudio.getMenuIDStringAsURL());
    }

   /**
    * Test getLanguageMoreAsInteger() method.
    */
    @Test
    public void subTestGetLanguageMoreAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getLanguageMoreAsInteger());
        System.out.println("More info about Language (e.g. Director's Comment) AS Integer === " + jMetaDataAudio.getLanguageMoreAsInteger());
    }

   /**
    * Test getLanguageMoreAsLong() method.
    */
    @Test
    public void subTestGetLanguageMoreAsLong() {
        assertEquals(null, this.jMetaDataAudio.getLanguageMoreAsLong());
        System.out.println("More info about Language (e.g. Director's Comment) AS Long === " + jMetaDataAudio.getLanguageMoreAsLong());
    }

   /**
    * Test getLanguageMoreAsLocalDateTime() method.
    */
    @Test
    public void subTestGetLanguageMoreAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getLanguageMoreAsLocalDateTime());
        System.out.println("More info about Language (e.g. Director's Comment) AS LocalDateTime === " + jMetaDataAudio.getLanguageMoreAsLocalDateTime());
    }

   /**
    * Test getLanguageMoreAsLocalTime() method.
    */
    @Test
    public void subTestGetLanguageMoreAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getLanguageMoreAsLocalTime());
        System.out.println("More info about Language (e.g. Director's Comment) AS LocalTime === " + jMetaDataAudio.getLanguageMoreAsLocalTime());
    }

   /**
    * Test getLanguageMoreAsString() method.
    */
    @Test
    public void subTestGetLanguageMoreAsString() {
        assertEquals(null, this.jMetaDataAudio.getLanguageMoreAsString());
        System.out.println("More info about Language (e.g. Director's Comment) AS String === " + jMetaDataAudio.getLanguageMoreAsString());
    }

   /**
    * Test getLanguageMoreAsBoolean() method.
    */
    @Test
    public void subTestGetLanguageMoreAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getLanguageMoreAsBoolean());
        System.out.println("More info about Language (e.g. Director's Comment) AS Boolean === " + jMetaDataAudio.getLanguageMoreAsBoolean());
    }

   /**
    * Test getLanguageMoreAsBigInteger() method.
    */
    @Test
    public void subTestGetLanguageMoreAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getLanguageMoreAsBigInteger());
        System.out.println("More info about Language (e.g. Director's Comment) AS BigInteger === " + jMetaDataAudio.getLanguageMoreAsBigInteger());
    }

   /**
    * Test getLanguageMoreAsURL() method.
    */
    @Test
    public void subTestGetLanguageMoreAsURL() {
        assertEquals(null, this.jMetaDataAudio.getLanguageMoreAsURL());
        System.out.println("More info about Language (e.g. Director's Comment) AS URL === " + jMetaDataAudio.getLanguageMoreAsURL());
    }

   /**
    * Test getSourceStreamSizeStringAsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeStringAsInteger());
        System.out.println("Source Streamsize in with percentage value AS Integer === " + jMetaDataAudio.getSourceStreamSizeStringAsInteger());
    }

   /**
    * Test getSourceStreamSizeStringAsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeStringAsLong());
        System.out.println("Source Streamsize in with percentage value AS Long === " + jMetaDataAudio.getSourceStreamSizeStringAsLong());
    }

   /**
    * Test getSourceStreamSizeStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeStringAsLocalDateTime());
        System.out.println("Source Streamsize in with percentage value AS LocalDateTime === " + jMetaDataAudio.getSourceStreamSizeStringAsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeStringAsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeStringAsLocalTime());
        System.out.println("Source Streamsize in with percentage value AS LocalTime === " + jMetaDataAudio.getSourceStreamSizeStringAsLocalTime());
    }

   /**
    * Test getSourceStreamSizeStringAsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeStringAsString());
        System.out.println("Source Streamsize in with percentage value AS String === " + jMetaDataAudio.getSourceStreamSizeStringAsString());
    }

   /**
    * Test getSourceStreamSizeStringAsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeStringAsBoolean());
        System.out.println("Source Streamsize in with percentage value AS Boolean === " + jMetaDataAudio.getSourceStreamSizeStringAsBoolean());
    }

   /**
    * Test getSourceStreamSizeStringAsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeStringAsBigInteger());
        System.out.println("Source Streamsize in with percentage value AS BigInteger === " + jMetaDataAudio.getSourceStreamSizeStringAsBigInteger());
    }

   /**
    * Test getSourceStreamSizeStringAsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeStringAsURL());
        System.out.println("Source Streamsize in with percentage value AS URL === " + jMetaDataAudio.getSourceStreamSizeStringAsURL());
    }

   /**
    * Test getFormatSettingsLawAsInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsLawAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsLawAsInteger());
        System.out.println("Format_Settings_Law AS Integer === " + jMetaDataAudio.getFormatSettingsLawAsInteger());
    }

   /**
    * Test getFormatSettingsLawAsLong() method.
    */
    @Test
    public void subTestGetFormatSettingsLawAsLong() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsLawAsLong());
        System.out.println("Format_Settings_Law AS Long === " + jMetaDataAudio.getFormatSettingsLawAsLong());
    }

   /**
    * Test getFormatSettingsLawAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatSettingsLawAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsLawAsLocalDateTime());
        System.out.println("Format_Settings_Law AS LocalDateTime === " + jMetaDataAudio.getFormatSettingsLawAsLocalDateTime());
    }

   /**
    * Test getFormatSettingsLawAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatSettingsLawAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsLawAsLocalTime());
        System.out.println("Format_Settings_Law AS LocalTime === " + jMetaDataAudio.getFormatSettingsLawAsLocalTime());
    }

   /**
    * Test getFormatSettingsLawAsString() method.
    */
    @Test
    public void subTestGetFormatSettingsLawAsString() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsLawAsString());
        System.out.println("Format_Settings_Law AS String === " + jMetaDataAudio.getFormatSettingsLawAsString());
    }

   /**
    * Test getFormatSettingsLawAsBoolean() method.
    */
    @Test
    public void subTestGetFormatSettingsLawAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsLawAsBoolean());
        System.out.println("Format_Settings_Law AS Boolean === " + jMetaDataAudio.getFormatSettingsLawAsBoolean());
    }

   /**
    * Test getFormatSettingsLawAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsLawAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsLawAsBigInteger());
        System.out.println("Format_Settings_Law AS BigInteger === " + jMetaDataAudio.getFormatSettingsLawAsBigInteger());
    }

   /**
    * Test getFormatSettingsLawAsURL() method.
    */
    @Test
    public void subTestGetFormatSettingsLawAsURL() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsLawAsURL());
        System.out.println("Format_Settings_Law AS URL === " + jMetaDataAudio.getFormatSettingsLawAsURL());
    }

   /**
    * Test getDurationFirstFrameAsInteger() method.
    */
    @Test
    public void subTestGetDurationFirstFrameAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameAsInteger());
        System.out.println("Duration of the first frame if it is longer than others, in ms AS Integer === " + jMetaDataAudio.getDurationFirstFrameAsInteger());
    }

   /**
    * Test getDurationFirstFrameAsLong() method.
    */
    @Test
    public void subTestGetDurationFirstFrameAsLong() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameAsLong());
        System.out.println("Duration of the first frame if it is longer than others, in ms AS Long === " + jMetaDataAudio.getDurationFirstFrameAsLong());
    }

   /**
    * Test getDurationFirstFrameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationFirstFrameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameAsLocalDateTime());
        System.out.println("Duration of the first frame if it is longer than others, in ms AS LocalDateTime === " + jMetaDataAudio.getDurationFirstFrameAsLocalDateTime());
    }

   /**
    * Test getDurationFirstFrameAsLocalTime() method.
    */
    @Test
    public void subTestGetDurationFirstFrameAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameAsLocalTime());
        System.out.println("Duration of the first frame if it is longer than others, in ms AS LocalTime === " + jMetaDataAudio.getDurationFirstFrameAsLocalTime());
    }

   /**
    * Test getDurationFirstFrameAsString() method.
    */
    @Test
    public void subTestGetDurationFirstFrameAsString() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameAsString());
        System.out.println("Duration of the first frame if it is longer than others, in ms AS String === " + jMetaDataAudio.getDurationFirstFrameAsString());
    }

   /**
    * Test getDurationFirstFrameAsBoolean() method.
    */
    @Test
    public void subTestGetDurationFirstFrameAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameAsBoolean());
        System.out.println("Duration of the first frame if it is longer than others, in ms AS Boolean === " + jMetaDataAudio.getDurationFirstFrameAsBoolean());
    }

   /**
    * Test getDurationFirstFrameAsBigInteger() method.
    */
    @Test
    public void subTestGetDurationFirstFrameAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameAsBigInteger());
        System.out.println("Duration of the first frame if it is longer than others, in ms AS BigInteger === " + jMetaDataAudio.getDurationFirstFrameAsBigInteger());
    }

   /**
    * Test getDurationFirstFrameAsURL() method.
    */
    @Test
    public void subTestGetDurationFirstFrameAsURL() {
        assertEquals(null, this.jMetaDataAudio.getDurationFirstFrameAsURL());
        System.out.println("Duration of the first frame if it is longer than others, in ms AS URL === " + jMetaDataAudio.getDurationFirstFrameAsURL());
    }

   /**
    * Test getDelayOriginalString3AsInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalString3AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalString3AsInteger());
        System.out.println("Delay in format: HH:MM:SS.MMM AS Integer === " + jMetaDataAudio.getDelayOriginalString3AsInteger());
    }

   /**
    * Test getDelayOriginalString3AsLong() method.
    */
    @Test
    public void subTestGetDelayOriginalString3AsLong() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalString3AsLong());
        System.out.println("Delay in format: HH:MM:SS.MMM AS Long === " + jMetaDataAudio.getDelayOriginalString3AsLong());
    }

   /**
    * Test getDelayOriginalString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayOriginalString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalString3AsLocalDateTime());
        System.out.println("Delay in format: HH:MM:SS.MMM AS LocalDateTime === " + jMetaDataAudio.getDelayOriginalString3AsLocalDateTime());
    }

   /**
    * Test getDelayOriginalString3AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayOriginalString3AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalString3AsLocalTime());
        System.out.println("Delay in format: HH:MM:SS.MMM AS LocalTime === " + jMetaDataAudio.getDelayOriginalString3AsLocalTime());
    }

   /**
    * Test getDelayOriginalString3AsString() method.
    */
    @Test
    public void subTestGetDelayOriginalString3AsString() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalString3AsString());
        System.out.println("Delay in format: HH:MM:SS.MMM AS String === " + jMetaDataAudio.getDelayOriginalString3AsString());
    }

   /**
    * Test getDelayOriginalString3AsBoolean() method.
    */
    @Test
    public void subTestGetDelayOriginalString3AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalString3AsBoolean());
        System.out.println("Delay in format: HH:MM:SS.MMM AS Boolean === " + jMetaDataAudio.getDelayOriginalString3AsBoolean());
    }

   /**
    * Test getDelayOriginalString3AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalString3AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalString3AsBigInteger());
        System.out.println("Delay in format: HH:MM:SS.MMM AS BigInteger === " + jMetaDataAudio.getDelayOriginalString3AsBigInteger());
    }

   /**
    * Test getDelayOriginalString3AsURL() method.
    */
    @Test
    public void subTestGetDelayOriginalString3AsURL() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalString3AsURL());
        System.out.println("Delay in format: HH:MM:SS.MMM AS URL === " + jMetaDataAudio.getDelayOriginalString3AsURL());
    }

   /**
    * Test getEncodedApplicationStringAsInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationStringAsInteger());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS Integer === " + jMetaDataAudio.getEncodedApplicationStringAsInteger());
    }

   /**
    * Test getEncodedApplicationStringAsLong() method.
    */
    @Test
    public void subTestGetEncodedApplicationStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationStringAsLong());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS Long === " + jMetaDataAudio.getEncodedApplicationStringAsLong());
    }

   /**
    * Test getEncodedApplicationStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationStringAsLocalDateTime());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS LocalDateTime === " + jMetaDataAudio.getEncodedApplicationStringAsLocalDateTime());
    }

   /**
    * Test getEncodedApplicationStringAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationStringAsLocalTime());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS LocalTime === " + jMetaDataAudio.getEncodedApplicationStringAsLocalTime());
    }

   /**
    * Test getEncodedApplicationStringAsString() method.
    */
    @Test
    public void subTestGetEncodedApplicationStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationStringAsString());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS String === " + jMetaDataAudio.getEncodedApplicationStringAsString());
    }

   /**
    * Test getEncodedApplicationStringAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedApplicationStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationStringAsBoolean());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS Boolean === " + jMetaDataAudio.getEncodedApplicationStringAsBoolean());
    }

   /**
    * Test getEncodedApplicationStringAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationStringAsBigInteger());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS BigInteger === " + jMetaDataAudio.getEncodedApplicationStringAsBigInteger());
    }

   /**
    * Test getEncodedApplicationStringAsURL() method.
    */
    @Test
    public void subTestGetEncodedApplicationStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationStringAsURL());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS URL === " + jMetaDataAudio.getEncodedApplicationStringAsURL());
    }

   /**
    * Test getDelayOriginalString4AsInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalString4AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalString4AsInteger());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Integer === " + jMetaDataAudio.getDelayOriginalString4AsInteger());
    }

   /**
    * Test getDelayOriginalString4AsLong() method.
    */
    @Test
    public void subTestGetDelayOriginalString4AsLong() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalString4AsLong());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Long === " + jMetaDataAudio.getDelayOriginalString4AsLong());
    }

   /**
    * Test getDelayOriginalString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayOriginalString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalString4AsLocalDateTime());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS LocalDateTime === " + jMetaDataAudio.getDelayOriginalString4AsLocalDateTime());
    }

   /**
    * Test getDelayOriginalString4AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayOriginalString4AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalString4AsLocalTime());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS LocalTime === " + jMetaDataAudio.getDelayOriginalString4AsLocalTime());
    }

   /**
    * Test getDelayOriginalString4AsString() method.
    */
    @Test
    public void subTestGetDelayOriginalString4AsString() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalString4AsString());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS String === " + jMetaDataAudio.getDelayOriginalString4AsString());
    }

   /**
    * Test getDelayOriginalString4AsBoolean() method.
    */
    @Test
    public void subTestGetDelayOriginalString4AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalString4AsBoolean());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Boolean === " + jMetaDataAudio.getDelayOriginalString4AsBoolean());
    }

   /**
    * Test getDelayOriginalString4AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalString4AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalString4AsBigInteger());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS BigInteger === " + jMetaDataAudio.getDelayOriginalString4AsBigInteger());
    }

   /**
    * Test getDelayOriginalString4AsURL() method.
    */
    @Test
    public void subTestGetDelayOriginalString4AsURL() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalString4AsURL());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS URL === " + jMetaDataAudio.getDelayOriginalString4AsURL());
    }

   /**
    * Test getDelayOriginalString5AsInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalString5AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalString5AsInteger());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Integer === " + jMetaDataAudio.getDelayOriginalString5AsInteger());
    }

   /**
    * Test getDelayOriginalString5AsLong() method.
    */
    @Test
    public void subTestGetDelayOriginalString5AsLong() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalString5AsLong());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Long === " + jMetaDataAudio.getDelayOriginalString5AsLong());
    }

   /**
    * Test getDelayOriginalString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayOriginalString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalString5AsLocalDateTime());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS LocalDateTime === " + jMetaDataAudio.getDelayOriginalString5AsLocalDateTime());
    }

   /**
    * Test getDelayOriginalString5AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayOriginalString5AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalString5AsLocalTime());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS LocalTime === " + jMetaDataAudio.getDelayOriginalString5AsLocalTime());
    }

   /**
    * Test getDelayOriginalString5AsString() method.
    */
    @Test
    public void subTestGetDelayOriginalString5AsString() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalString5AsString());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS String === " + jMetaDataAudio.getDelayOriginalString5AsString());
    }

   /**
    * Test getDelayOriginalString5AsBoolean() method.
    */
    @Test
    public void subTestGetDelayOriginalString5AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalString5AsBoolean());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Boolean === " + jMetaDataAudio.getDelayOriginalString5AsBoolean());
    }

   /**
    * Test getDelayOriginalString5AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalString5AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalString5AsBigInteger());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS BigInteger === " + jMetaDataAudio.getDelayOriginalString5AsBigInteger());
    }

   /**
    * Test getDelayOriginalString5AsURL() method.
    */
    @Test
    public void subTestGetDelayOriginalString5AsURL() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalString5AsURL());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS URL === " + jMetaDataAudio.getDelayOriginalString5AsURL());
    }

   /**
    * Test getFormatSettingsPSAsInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsPSAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsPSAsInteger());
        System.out.println("Format_Settings_PS AS Integer === " + jMetaDataAudio.getFormatSettingsPSAsInteger());
    }

   /**
    * Test getFormatSettingsPSAsLong() method.
    */
    @Test
    public void subTestGetFormatSettingsPSAsLong() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsPSAsLong());
        System.out.println("Format_Settings_PS AS Long === " + jMetaDataAudio.getFormatSettingsPSAsLong());
    }

   /**
    * Test getFormatSettingsPSAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatSettingsPSAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsPSAsLocalDateTime());
        System.out.println("Format_Settings_PS AS LocalDateTime === " + jMetaDataAudio.getFormatSettingsPSAsLocalDateTime());
    }

   /**
    * Test getFormatSettingsPSAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatSettingsPSAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsPSAsLocalTime());
        System.out.println("Format_Settings_PS AS LocalTime === " + jMetaDataAudio.getFormatSettingsPSAsLocalTime());
    }

   /**
    * Test getFormatSettingsPSAsString() method.
    */
    @Test
    public void subTestGetFormatSettingsPSAsString() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsPSAsString());
        System.out.println("Format_Settings_PS AS String === " + jMetaDataAudio.getFormatSettingsPSAsString());
    }

   /**
    * Test getFormatSettingsPSAsBoolean() method.
    */
    @Test
    public void subTestGetFormatSettingsPSAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsPSAsBoolean());
        System.out.println("Format_Settings_PS AS Boolean === " + jMetaDataAudio.getFormatSettingsPSAsBoolean());
    }

   /**
    * Test getFormatSettingsPSAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsPSAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsPSAsBigInteger());
        System.out.println("Format_Settings_PS AS BigInteger === " + jMetaDataAudio.getFormatSettingsPSAsBigInteger());
    }

   /**
    * Test getFormatSettingsPSAsURL() method.
    */
    @Test
    public void subTestGetFormatSettingsPSAsURL() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsPSAsURL());
        System.out.println("Format_Settings_PS AS URL === " + jMetaDataAudio.getFormatSettingsPSAsURL());
    }

   /**
    * Test getForcedAsInteger() method.
    */
    @Test
    public void subTestGetForcedAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getForcedAsInteger());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS Integer === " + jMetaDataAudio.getForcedAsInteger());
    }

   /**
    * Test getForcedAsLong() method.
    */
    @Test
    public void subTestGetForcedAsLong() {
        assertEquals(null, this.jMetaDataAudio.getForcedAsLong());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS Long === " + jMetaDataAudio.getForcedAsLong());
    }

   /**
    * Test getForcedAsLocalDateTime() method.
    */
    @Test
    public void subTestGetForcedAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getForcedAsLocalDateTime());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS LocalDateTime === " + jMetaDataAudio.getForcedAsLocalDateTime());
    }

   /**
    * Test getForcedAsLocalTime() method.
    */
    @Test
    public void subTestGetForcedAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getForcedAsLocalTime());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS LocalTime === " + jMetaDataAudio.getForcedAsLocalTime());
    }

   /**
    * Test getForcedAsString() method.
    */
    @Test
    public void subTestGetForcedAsString() {
        assertEquals(null, this.jMetaDataAudio.getForcedAsString());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS String === " + jMetaDataAudio.getForcedAsString());
    }

   /**
    * Test getForcedAsBoolean() method.
    */
    @Test
    public void subTestGetForcedAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getForcedAsBoolean());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS Boolean === " + jMetaDataAudio.getForcedAsBoolean());
    }

   /**
    * Test getForcedAsBigInteger() method.
    */
    @Test
    public void subTestGetForcedAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getForcedAsBigInteger());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS BigInteger === " + jMetaDataAudio.getForcedAsBigInteger());
    }

   /**
    * Test getForcedAsURL() method.
    */
    @Test
    public void subTestGetForcedAsURL() {
        assertEquals(null, this.jMetaDataAudio.getForcedAsURL());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS URL === " + jMetaDataAudio.getForcedAsURL());
    }

   /**
    * Test getMatrixChannelsStringAsInteger() method.
    */
    @Test
    public void subTestGetMatrixChannelsStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getMatrixChannelsStringAsInteger());
        System.out.println("Number of channels after matrix decoding (with measurement) AS Integer === " + jMetaDataAudio.getMatrixChannelsStringAsInteger());
    }

   /**
    * Test getMatrixChannelsStringAsLong() method.
    */
    @Test
    public void subTestGetMatrixChannelsStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getMatrixChannelsStringAsLong());
        System.out.println("Number of channels after matrix decoding (with measurement) AS Long === " + jMetaDataAudio.getMatrixChannelsStringAsLong());
    }

   /**
    * Test getMatrixChannelsStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetMatrixChannelsStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getMatrixChannelsStringAsLocalDateTime());
        System.out.println("Number of channels after matrix decoding (with measurement) AS LocalDateTime === " + jMetaDataAudio.getMatrixChannelsStringAsLocalDateTime());
    }

   /**
    * Test getMatrixChannelsStringAsLocalTime() method.
    */
    @Test
    public void subTestGetMatrixChannelsStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getMatrixChannelsStringAsLocalTime());
        System.out.println("Number of channels after matrix decoding (with measurement) AS LocalTime === " + jMetaDataAudio.getMatrixChannelsStringAsLocalTime());
    }

   /**
    * Test getMatrixChannelsStringAsString() method.
    */
    @Test
    public void subTestGetMatrixChannelsStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getMatrixChannelsStringAsString());
        System.out.println("Number of channels after matrix decoding (with measurement) AS String === " + jMetaDataAudio.getMatrixChannelsStringAsString());
    }

   /**
    * Test getMatrixChannelsStringAsBoolean() method.
    */
    @Test
    public void subTestGetMatrixChannelsStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getMatrixChannelsStringAsBoolean());
        System.out.println("Number of channels after matrix decoding (with measurement) AS Boolean === " + jMetaDataAudio.getMatrixChannelsStringAsBoolean());
    }

   /**
    * Test getMatrixChannelsStringAsBigInteger() method.
    */
    @Test
    public void subTestGetMatrixChannelsStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getMatrixChannelsStringAsBigInteger());
        System.out.println("Number of channels after matrix decoding (with measurement) AS BigInteger === " + jMetaDataAudio.getMatrixChannelsStringAsBigInteger());
    }

   /**
    * Test getMatrixChannelsStringAsURL() method.
    */
    @Test
    public void subTestGetMatrixChannelsStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getMatrixChannelsStringAsURL());
        System.out.println("Number of channels after matrix decoding (with measurement) AS URL === " + jMetaDataAudio.getMatrixChannelsStringAsURL());
    }

   /**
    * Test getInformAsInteger() method.
    */
    @Test
    public void subTestGetInformAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getInformAsInteger());
        System.out.println("Last **Inform** call AS Integer === " + jMetaDataAudio.getInformAsInteger());
    }

   /**
    * Test getInformAsLong() method.
    */
    @Test
    public void subTestGetInformAsLong() {
        assertEquals(null, this.jMetaDataAudio.getInformAsLong());
        System.out.println("Last **Inform** call AS Long === " + jMetaDataAudio.getInformAsLong());
    }

   /**
    * Test getInformAsLocalDateTime() method.
    */
    @Test
    public void subTestGetInformAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getInformAsLocalDateTime());
        System.out.println("Last **Inform** call AS LocalDateTime === " + jMetaDataAudio.getInformAsLocalDateTime());
    }

   /**
    * Test getInformAsLocalTime() method.
    */
    @Test
    public void subTestGetInformAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getInformAsLocalTime());
        System.out.println("Last **Inform** call AS LocalTime === " + jMetaDataAudio.getInformAsLocalTime());
    }

   /**
    * Test getInformAsString() method.
    */
    @Test
    public void subTestGetInformAsString() {
        assertEquals(null, this.jMetaDataAudio.getInformAsString());
        System.out.println("Last **Inform** call AS String === " + jMetaDataAudio.getInformAsString());
    }

   /**
    * Test getInformAsBoolean() method.
    */
    @Test
    public void subTestGetInformAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getInformAsBoolean());
        System.out.println("Last **Inform** call AS Boolean === " + jMetaDataAudio.getInformAsBoolean());
    }

   /**
    * Test getInformAsBigInteger() method.
    */
    @Test
    public void subTestGetInformAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getInformAsBigInteger());
        System.out.println("Last **Inform** call AS BigInteger === " + jMetaDataAudio.getInformAsBigInteger());
    }

   /**
    * Test getInformAsURL() method.
    */
    @Test
    public void subTestGetInformAsURL() {
        assertEquals(null, this.jMetaDataAudio.getInformAsURL());
        System.out.println("Last **Inform** call AS URL === " + jMetaDataAudio.getInformAsURL());
    }

   /**
    * Test getSourceDurationFirstFrameAsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameAsInteger());
        System.out.println("Source Duration of the first frame if it is longer than others, in ms AS Integer === " + jMetaDataAudio.getSourceDurationFirstFrameAsInteger());
    }

   /**
    * Test getSourceDurationFirstFrameAsLong() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameAsLong() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameAsLong());
        System.out.println("Source Duration of the first frame if it is longer than others, in ms AS Long === " + jMetaDataAudio.getSourceDurationFirstFrameAsLong());
    }

   /**
    * Test getSourceDurationFirstFrameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameAsLocalDateTime());
        System.out.println("Source Duration of the first frame if it is longer than others, in ms AS LocalDateTime === " + jMetaDataAudio.getSourceDurationFirstFrameAsLocalDateTime());
    }

   /**
    * Test getSourceDurationFirstFrameAsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameAsLocalTime());
        System.out.println("Source Duration of the first frame if it is longer than others, in ms AS LocalTime === " + jMetaDataAudio.getSourceDurationFirstFrameAsLocalTime());
    }

   /**
    * Test getSourceDurationFirstFrameAsString() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameAsString() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameAsString());
        System.out.println("Source Duration of the first frame if it is longer than others, in ms AS String === " + jMetaDataAudio.getSourceDurationFirstFrameAsString());
    }

   /**
    * Test getSourceDurationFirstFrameAsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameAsBoolean());
        System.out.println("Source Duration of the first frame if it is longer than others, in ms AS Boolean === " + jMetaDataAudio.getSourceDurationFirstFrameAsBoolean());
    }

   /**
    * Test getSourceDurationFirstFrameAsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameAsBigInteger());
        System.out.println("Source Duration of the first frame if it is longer than others, in ms AS BigInteger === " + jMetaDataAudio.getSourceDurationFirstFrameAsBigInteger());
    }

   /**
    * Test getSourceDurationFirstFrameAsURL() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameAsURL() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationFirstFrameAsURL());
        System.out.println("Source Duration of the first frame if it is longer than others, in ms AS URL === " + jMetaDataAudio.getSourceDurationFirstFrameAsURL());
    }

   /**
    * Test getStreamKindIDAsInteger() method.
    */
    @Test
    public void subTestGetStreamKindIDAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamKindIDAsInteger());
        System.out.println("Number of the stream (base=0) AS Integer === " + jMetaDataAudio.getStreamKindIDAsInteger());
    }

   /**
    * Test getStreamKindIDAsLong() method.
    */
    @Test
    public void subTestGetStreamKindIDAsLong() {
        assertEquals(null, this.jMetaDataAudio.getStreamKindIDAsLong());
        System.out.println("Number of the stream (base=0) AS Long === " + jMetaDataAudio.getStreamKindIDAsLong());
    }

   /**
    * Test getStreamKindIDAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamKindIDAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamKindIDAsLocalDateTime());
        System.out.println("Number of the stream (base=0) AS LocalDateTime === " + jMetaDataAudio.getStreamKindIDAsLocalDateTime());
    }

   /**
    * Test getStreamKindIDAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamKindIDAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamKindIDAsLocalTime());
        System.out.println("Number of the stream (base=0) AS LocalTime === " + jMetaDataAudio.getStreamKindIDAsLocalTime());
    }

   /**
    * Test getStreamKindIDAsString() method.
    */
    @Test
    public void subTestGetStreamKindIDAsString() {
        assertEquals(null, this.jMetaDataAudio.getStreamKindIDAsString());
        System.out.println("Number of the stream (base=0) AS String === " + jMetaDataAudio.getStreamKindIDAsString());
    }

   /**
    * Test getStreamKindIDAsBoolean() method.
    */
    @Test
    public void subTestGetStreamKindIDAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getStreamKindIDAsBoolean());
        System.out.println("Number of the stream (base=0) AS Boolean === " + jMetaDataAudio.getStreamKindIDAsBoolean());
    }

   /**
    * Test getStreamKindIDAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamKindIDAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamKindIDAsBigInteger());
        System.out.println("Number of the stream (base=0) AS BigInteger === " + jMetaDataAudio.getStreamKindIDAsBigInteger());
    }

   /**
    * Test getStreamKindIDAsURL() method.
    */
    @Test
    public void subTestGetStreamKindIDAsURL() {
        assertEquals(null, this.jMetaDataAudio.getStreamKindIDAsURL());
        System.out.println("Number of the stream (base=0) AS URL === " + jMetaDataAudio.getStreamKindIDAsURL());
    }

   /**
    * Test getFormatSettingsFloorAsInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsFloorAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsFloorAsInteger());
        System.out.println("Format_Settings_Floor AS Integer === " + jMetaDataAudio.getFormatSettingsFloorAsInteger());
    }

   /**
    * Test getFormatSettingsFloorAsLong() method.
    */
    @Test
    public void subTestGetFormatSettingsFloorAsLong() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsFloorAsLong());
        System.out.println("Format_Settings_Floor AS Long === " + jMetaDataAudio.getFormatSettingsFloorAsLong());
    }

   /**
    * Test getFormatSettingsFloorAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatSettingsFloorAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsFloorAsLocalDateTime());
        System.out.println("Format_Settings_Floor AS LocalDateTime === " + jMetaDataAudio.getFormatSettingsFloorAsLocalDateTime());
    }

   /**
    * Test getFormatSettingsFloorAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatSettingsFloorAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsFloorAsLocalTime());
        System.out.println("Format_Settings_Floor AS LocalTime === " + jMetaDataAudio.getFormatSettingsFloorAsLocalTime());
    }

   /**
    * Test getFormatSettingsFloorAsString() method.
    */
    @Test
    public void subTestGetFormatSettingsFloorAsString() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsFloorAsString());
        System.out.println("Format_Settings_Floor AS String === " + jMetaDataAudio.getFormatSettingsFloorAsString());
    }

   /**
    * Test getFormatSettingsFloorAsBoolean() method.
    */
    @Test
    public void subTestGetFormatSettingsFloorAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsFloorAsBoolean());
        System.out.println("Format_Settings_Floor AS Boolean === " + jMetaDataAudio.getFormatSettingsFloorAsBoolean());
    }

   /**
    * Test getFormatSettingsFloorAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsFloorAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsFloorAsBigInteger());
        System.out.println("Format_Settings_Floor AS BigInteger === " + jMetaDataAudio.getFormatSettingsFloorAsBigInteger());
    }

   /**
    * Test getFormatSettingsFloorAsURL() method.
    */
    @Test
    public void subTestGetFormatSettingsFloorAsURL() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsFloorAsURL());
        System.out.println("Format_Settings_Floor AS URL === " + jMetaDataAudio.getFormatSettingsFloorAsURL());
    }

   /**
    * Test getFormatUrlAsInteger() method.
    */
    @Test
    public void subTestGetFormatUrlAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatUrlAsInteger());
        System.out.println("Homepage of this format AS Integer === " + jMetaDataAudio.getFormatUrlAsInteger());
    }

   /**
    * Test getFormatUrlAsLong() method.
    */
    @Test
    public void subTestGetFormatUrlAsLong() {
        assertEquals(null, this.jMetaDataAudio.getFormatUrlAsLong());
        System.out.println("Homepage of this format AS Long === " + jMetaDataAudio.getFormatUrlAsLong());
    }

   /**
    * Test getFormatUrlAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatUrlAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatUrlAsLocalDateTime());
        System.out.println("Homepage of this format AS LocalDateTime === " + jMetaDataAudio.getFormatUrlAsLocalDateTime());
    }

   /**
    * Test getFormatUrlAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatUrlAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatUrlAsLocalTime());
        System.out.println("Homepage of this format AS LocalTime === " + jMetaDataAudio.getFormatUrlAsLocalTime());
    }

   /**
    * Test getFormatUrlAsString() method.
    */
    @Test
    public void subTestGetFormatUrlAsString() {
        assertEquals(null, this.jMetaDataAudio.getFormatUrlAsString());
        System.out.println("Homepage of this format AS String === " + jMetaDataAudio.getFormatUrlAsString());
    }

   /**
    * Test getFormatUrlAsBoolean() method.
    */
    @Test
    public void subTestGetFormatUrlAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getFormatUrlAsBoolean());
        System.out.println("Homepage of this format AS Boolean === " + jMetaDataAudio.getFormatUrlAsBoolean());
    }

   /**
    * Test getFormatUrlAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatUrlAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatUrlAsBigInteger());
        System.out.println("Homepage of this format AS BigInteger === " + jMetaDataAudio.getFormatUrlAsBigInteger());
    }

   /**
    * Test getFormatUrlAsURL() method.
    */
    @Test
    public void subTestGetFormatUrlAsURL() {
        assertEquals(null, this.jMetaDataAudio.getFormatUrlAsURL());
        System.out.println("Homepage of this format AS URL === " + jMetaDataAudio.getFormatUrlAsURL());
    }

   /**
    * Test getBitRateMinimumStringAsInteger() method.
    */
    @Test
    public void subTestGetBitRateMinimumStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getBitRateMinimumStringAsInteger());
        System.out.println("Minimum Bit rate (with measurement) AS Integer === " + jMetaDataAudio.getBitRateMinimumStringAsInteger());
    }

   /**
    * Test getBitRateMinimumStringAsLong() method.
    */
    @Test
    public void subTestGetBitRateMinimumStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getBitRateMinimumStringAsLong());
        System.out.println("Minimum Bit rate (with measurement) AS Long === " + jMetaDataAudio.getBitRateMinimumStringAsLong());
    }

   /**
    * Test getBitRateMinimumStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitRateMinimumStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getBitRateMinimumStringAsLocalDateTime());
        System.out.println("Minimum Bit rate (with measurement) AS LocalDateTime === " + jMetaDataAudio.getBitRateMinimumStringAsLocalDateTime());
    }

   /**
    * Test getBitRateMinimumStringAsLocalTime() method.
    */
    @Test
    public void subTestGetBitRateMinimumStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getBitRateMinimumStringAsLocalTime());
        System.out.println("Minimum Bit rate (with measurement) AS LocalTime === " + jMetaDataAudio.getBitRateMinimumStringAsLocalTime());
    }

   /**
    * Test getBitRateMinimumStringAsString() method.
    */
    @Test
    public void subTestGetBitRateMinimumStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getBitRateMinimumStringAsString());
        System.out.println("Minimum Bit rate (with measurement) AS String === " + jMetaDataAudio.getBitRateMinimumStringAsString());
    }

   /**
    * Test getBitRateMinimumStringAsBoolean() method.
    */
    @Test
    public void subTestGetBitRateMinimumStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getBitRateMinimumStringAsBoolean());
        System.out.println("Minimum Bit rate (with measurement) AS Boolean === " + jMetaDataAudio.getBitRateMinimumStringAsBoolean());
    }

   /**
    * Test getBitRateMinimumStringAsBigInteger() method.
    */
    @Test
    public void subTestGetBitRateMinimumStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getBitRateMinimumStringAsBigInteger());
        System.out.println("Minimum Bit rate (with measurement) AS BigInteger === " + jMetaDataAudio.getBitRateMinimumStringAsBigInteger());
    }

   /**
    * Test getBitRateMinimumStringAsURL() method.
    */
    @Test
    public void subTestGetBitRateMinimumStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getBitRateMinimumStringAsURL());
        System.out.println("Minimum Bit rate (with measurement) AS URL === " + jMetaDataAudio.getBitRateMinimumStringAsURL());
    }

   /**
    * Test getFrameRateStringAsInteger() method.
    */
    @Test
    public void subTestGetFrameRateStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getFrameRateStringAsInteger());
        System.out.println("Frames per second (with measurement) AS Integer === " + jMetaDataAudio.getFrameRateStringAsInteger());
    }

   /**
    * Test getFrameRateStringAsLong() method.
    */
    @Test
    public void subTestGetFrameRateStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getFrameRateStringAsLong());
        System.out.println("Frames per second (with measurement) AS Long === " + jMetaDataAudio.getFrameRateStringAsLong());
    }

   /**
    * Test getFrameRateStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFrameRateStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getFrameRateStringAsLocalDateTime());
        System.out.println("Frames per second (with measurement) AS LocalDateTime === " + jMetaDataAudio.getFrameRateStringAsLocalDateTime());
    }

   /**
    * Test getFrameRateStringAsLocalTime() method.
    */
    @Test
    public void subTestGetFrameRateStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getFrameRateStringAsLocalTime());
        System.out.println("Frames per second (with measurement) AS LocalTime === " + jMetaDataAudio.getFrameRateStringAsLocalTime());
    }

   /**
    * Test getFrameRateStringAsString() method.
    */
    @Test
    public void subTestGetFrameRateStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getFrameRateStringAsString());
        System.out.println("Frames per second (with measurement) AS String === " + jMetaDataAudio.getFrameRateStringAsString());
    }

   /**
    * Test getFrameRateStringAsBoolean() method.
    */
    @Test
    public void subTestGetFrameRateStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getFrameRateStringAsBoolean());
        System.out.println("Frames per second (with measurement) AS Boolean === " + jMetaDataAudio.getFrameRateStringAsBoolean());
    }

   /**
    * Test getFrameRateStringAsBigInteger() method.
    */
    @Test
    public void subTestGetFrameRateStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getFrameRateStringAsBigInteger());
        System.out.println("Frames per second (with measurement) AS BigInteger === " + jMetaDataAudio.getFrameRateStringAsBigInteger());
    }

   /**
    * Test getFrameRateStringAsURL() method.
    */
    @Test
    public void subTestGetFrameRateStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getFrameRateStringAsURL());
        System.out.println("Frames per second (with measurement) AS URL === " + jMetaDataAudio.getFrameRateStringAsURL());
    }

   /**
    * Test getSourceFrameCountAsInteger() method.
    */
    @Test
    public void subTestGetSourceFrameCountAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceFrameCountAsInteger());
        System.out.println("Source Frame count (a frame contains a count of samples depends of the format) AS Integer === " + jMetaDataAudio.getSourceFrameCountAsInteger());
    }

   /**
    * Test getSourceFrameCountAsLong() method.
    */
    @Test
    public void subTestGetSourceFrameCountAsLong() {
        assertEquals(null, this.jMetaDataAudio.getSourceFrameCountAsLong());
        System.out.println("Source Frame count (a frame contains a count of samples depends of the format) AS Long === " + jMetaDataAudio.getSourceFrameCountAsLong());
    }

   /**
    * Test getSourceFrameCountAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceFrameCountAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceFrameCountAsLocalDateTime());
        System.out.println("Source Frame count (a frame contains a count of samples depends of the format) AS LocalDateTime === " + jMetaDataAudio.getSourceFrameCountAsLocalDateTime());
    }

   /**
    * Test getSourceFrameCountAsLocalTime() method.
    */
    @Test
    public void subTestGetSourceFrameCountAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceFrameCountAsLocalTime());
        System.out.println("Source Frame count (a frame contains a count of samples depends of the format) AS LocalTime === " + jMetaDataAudio.getSourceFrameCountAsLocalTime());
    }

   /**
    * Test getSourceFrameCountAsString() method.
    */
    @Test
    public void subTestGetSourceFrameCountAsString() {
        assertEquals(null, this.jMetaDataAudio.getSourceFrameCountAsString());
        System.out.println("Source Frame count (a frame contains a count of samples depends of the format) AS String === " + jMetaDataAudio.getSourceFrameCountAsString());
    }

   /**
    * Test getSourceFrameCountAsBoolean() method.
    */
    @Test
    public void subTestGetSourceFrameCountAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getSourceFrameCountAsBoolean());
        System.out.println("Source Frame count (a frame contains a count of samples depends of the format) AS Boolean === " + jMetaDataAudio.getSourceFrameCountAsBoolean());
    }

   /**
    * Test getSourceFrameCountAsBigInteger() method.
    */
    @Test
    public void subTestGetSourceFrameCountAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceFrameCountAsBigInteger());
        System.out.println("Source Frame count (a frame contains a count of samples depends of the format) AS BigInteger === " + jMetaDataAudio.getSourceFrameCountAsBigInteger());
    }

   /**
    * Test getSourceFrameCountAsURL() method.
    */
    @Test
    public void subTestGetSourceFrameCountAsURL() {
        assertEquals(null, this.jMetaDataAudio.getSourceFrameCountAsURL());
        System.out.println("Source Frame count (a frame contains a count of samples depends of the format) AS URL === " + jMetaDataAudio.getSourceFrameCountAsURL());
    }

   /**
    * Test getDefaultAsInteger() method.
    */
    @Test
    public void subTestGetDefaultAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDefaultAsInteger());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS Integer === " + jMetaDataAudio.getDefaultAsInteger());
    }

   /**
    * Test getDefaultAsLong() method.
    */
    @Test
    public void subTestGetDefaultAsLong() {
        assertEquals(null, this.jMetaDataAudio.getDefaultAsLong());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS Long === " + jMetaDataAudio.getDefaultAsLong());
    }

   /**
    * Test getDefaultAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDefaultAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDefaultAsLocalDateTime());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS LocalDateTime === " + jMetaDataAudio.getDefaultAsLocalDateTime());
    }

   /**
    * Test getDefaultAsLocalTime() method.
    */
    @Test
    public void subTestGetDefaultAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDefaultAsLocalTime());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS LocalTime === " + jMetaDataAudio.getDefaultAsLocalTime());
    }

   /**
    * Test getDefaultAsString() method.
    */
    @Test
    public void subTestGetDefaultAsString() {
        assertEquals(null, this.jMetaDataAudio.getDefaultAsString());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS String === " + jMetaDataAudio.getDefaultAsString());
    }

   /**
    * Test getDefaultAsBoolean() method.
    */
    @Test
    public void subTestGetDefaultAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDefaultAsBoolean());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS Boolean === " + jMetaDataAudio.getDefaultAsBoolean());
    }

   /**
    * Test getDefaultAsBigInteger() method.
    */
    @Test
    public void subTestGetDefaultAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDefaultAsBigInteger());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS BigInteger === " + jMetaDataAudio.getDefaultAsBigInteger());
    }

   /**
    * Test getDefaultAsURL() method.
    */
    @Test
    public void subTestGetDefaultAsURL() {
        assertEquals(null, this.jMetaDataAudio.getDefaultAsURL());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS URL === " + jMetaDataAudio.getDefaultAsURL());
    }

   /**
    * Test getDelayOriginalSettingsAsInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalSettingsAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalSettingsAsInteger());
        System.out.println("Delay settings (in case of timecode for example) AS Integer === " + jMetaDataAudio.getDelayOriginalSettingsAsInteger());
    }

   /**
    * Test getDelayOriginalSettingsAsLong() method.
    */
    @Test
    public void subTestGetDelayOriginalSettingsAsLong() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalSettingsAsLong());
        System.out.println("Delay settings (in case of timecode for example) AS Long === " + jMetaDataAudio.getDelayOriginalSettingsAsLong());
    }

   /**
    * Test getDelayOriginalSettingsAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayOriginalSettingsAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalSettingsAsLocalDateTime());
        System.out.println("Delay settings (in case of timecode for example) AS LocalDateTime === " + jMetaDataAudio.getDelayOriginalSettingsAsLocalDateTime());
    }

   /**
    * Test getDelayOriginalSettingsAsLocalTime() method.
    */
    @Test
    public void subTestGetDelayOriginalSettingsAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalSettingsAsLocalTime());
        System.out.println("Delay settings (in case of timecode for example) AS LocalTime === " + jMetaDataAudio.getDelayOriginalSettingsAsLocalTime());
    }

   /**
    * Test getDelayOriginalSettingsAsString() method.
    */
    @Test
    public void subTestGetDelayOriginalSettingsAsString() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalSettingsAsString());
        System.out.println("Delay settings (in case of timecode for example) AS String === " + jMetaDataAudio.getDelayOriginalSettingsAsString());
    }

   /**
    * Test getDelayOriginalSettingsAsBoolean() method.
    */
    @Test
    public void subTestGetDelayOriginalSettingsAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalSettingsAsBoolean());
        System.out.println("Delay settings (in case of timecode for example) AS Boolean === " + jMetaDataAudio.getDelayOriginalSettingsAsBoolean());
    }

   /**
    * Test getDelayOriginalSettingsAsBigInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalSettingsAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalSettingsAsBigInteger());
        System.out.println("Delay settings (in case of timecode for example) AS BigInteger === " + jMetaDataAudio.getDelayOriginalSettingsAsBigInteger());
    }

   /**
    * Test getDelayOriginalSettingsAsURL() method.
    */
    @Test
    public void subTestGetDelayOriginalSettingsAsURL() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalSettingsAsURL());
        System.out.println("Delay settings (in case of timecode for example) AS URL === " + jMetaDataAudio.getDelayOriginalSettingsAsURL());
    }

   /**
    * Test getEncodedApplicationNameAsInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationNameAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationNameAsInteger());
        System.out.println("Name of the product AS Integer === " + jMetaDataAudio.getEncodedApplicationNameAsInteger());
    }

   /**
    * Test getEncodedApplicationNameAsLong() method.
    */
    @Test
    public void subTestGetEncodedApplicationNameAsLong() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationNameAsLong());
        System.out.println("Name of the product AS Long === " + jMetaDataAudio.getEncodedApplicationNameAsLong());
    }

   /**
    * Test getEncodedApplicationNameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationNameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationNameAsLocalDateTime());
        System.out.println("Name of the product AS LocalDateTime === " + jMetaDataAudio.getEncodedApplicationNameAsLocalDateTime());
    }

   /**
    * Test getEncodedApplicationNameAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationNameAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationNameAsLocalTime());
        System.out.println("Name of the product AS LocalTime === " + jMetaDataAudio.getEncodedApplicationNameAsLocalTime());
    }

   /**
    * Test getEncodedApplicationNameAsString() method.
    */
    @Test
    public void subTestGetEncodedApplicationNameAsString() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationNameAsString());
        System.out.println("Name of the product AS String === " + jMetaDataAudio.getEncodedApplicationNameAsString());
    }

   /**
    * Test getEncodedApplicationNameAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedApplicationNameAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationNameAsBoolean());
        System.out.println("Name of the product AS Boolean === " + jMetaDataAudio.getEncodedApplicationNameAsBoolean());
    }

   /**
    * Test getEncodedApplicationNameAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationNameAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationNameAsBigInteger());
        System.out.println("Name of the product AS BigInteger === " + jMetaDataAudio.getEncodedApplicationNameAsBigInteger());
    }

   /**
    * Test getEncodedApplicationNameAsURL() method.
    */
    @Test
    public void subTestGetEncodedApplicationNameAsURL() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationNameAsURL());
        System.out.println("Name of the product AS URL === " + jMetaDataAudio.getEncodedApplicationNameAsURL());
    }

   /**
    * Test getUniqueIDStringAsInteger() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getUniqueIDStringAsInteger());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS Integer === " + jMetaDataAudio.getUniqueIDStringAsInteger());
    }

   /**
    * Test getUniqueIDStringAsLong() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getUniqueIDStringAsLong());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS Long === " + jMetaDataAudio.getUniqueIDStringAsLong());
    }

   /**
    * Test getUniqueIDStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getUniqueIDStringAsLocalDateTime());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS LocalDateTime === " + jMetaDataAudio.getUniqueIDStringAsLocalDateTime());
    }

   /**
    * Test getUniqueIDStringAsLocalTime() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getUniqueIDStringAsLocalTime());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS LocalTime === " + jMetaDataAudio.getUniqueIDStringAsLocalTime());
    }

   /**
    * Test getUniqueIDStringAsString() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getUniqueIDStringAsString());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS String === " + jMetaDataAudio.getUniqueIDStringAsString());
    }

   /**
    * Test getUniqueIDStringAsBoolean() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getUniqueIDStringAsBoolean());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS Boolean === " + jMetaDataAudio.getUniqueIDStringAsBoolean());
    }

   /**
    * Test getUniqueIDStringAsBigInteger() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getUniqueIDStringAsBigInteger());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS BigInteger === " + jMetaDataAudio.getUniqueIDStringAsBigInteger());
    }

   /**
    * Test getUniqueIDStringAsURL() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getUniqueIDStringAsURL());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS URL === " + jMetaDataAudio.getUniqueIDStringAsURL());
    }

   /**
    * Test getBitDepthDetectedAsInteger() method.
    */
    @Test
    public void subTestGetBitDepthDetectedAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthDetectedAsInteger());
        System.out.println("Detected (during scan of the input by the muxer) resolution in bits AS Integer === " + jMetaDataAudio.getBitDepthDetectedAsInteger());
    }

   /**
    * Test getBitDepthDetectedAsLong() method.
    */
    @Test
    public void subTestGetBitDepthDetectedAsLong() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthDetectedAsLong());
        System.out.println("Detected (during scan of the input by the muxer) resolution in bits AS Long === " + jMetaDataAudio.getBitDepthDetectedAsLong());
    }

   /**
    * Test getBitDepthDetectedAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitDepthDetectedAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthDetectedAsLocalDateTime());
        System.out.println("Detected (during scan of the input by the muxer) resolution in bits AS LocalDateTime === " + jMetaDataAudio.getBitDepthDetectedAsLocalDateTime());
    }

   /**
    * Test getBitDepthDetectedAsLocalTime() method.
    */
    @Test
    public void subTestGetBitDepthDetectedAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthDetectedAsLocalTime());
        System.out.println("Detected (during scan of the input by the muxer) resolution in bits AS LocalTime === " + jMetaDataAudio.getBitDepthDetectedAsLocalTime());
    }

   /**
    * Test getBitDepthDetectedAsString() method.
    */
    @Test
    public void subTestGetBitDepthDetectedAsString() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthDetectedAsString());
        System.out.println("Detected (during scan of the input by the muxer) resolution in bits AS String === " + jMetaDataAudio.getBitDepthDetectedAsString());
    }

   /**
    * Test getBitDepthDetectedAsBoolean() method.
    */
    @Test
    public void subTestGetBitDepthDetectedAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthDetectedAsBoolean());
        System.out.println("Detected (during scan of the input by the muxer) resolution in bits AS Boolean === " + jMetaDataAudio.getBitDepthDetectedAsBoolean());
    }

   /**
    * Test getBitDepthDetectedAsBigInteger() method.
    */
    @Test
    public void subTestGetBitDepthDetectedAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthDetectedAsBigInteger());
        System.out.println("Detected (during scan of the input by the muxer) resolution in bits AS BigInteger === " + jMetaDataAudio.getBitDepthDetectedAsBigInteger());
    }

   /**
    * Test getBitDepthDetectedAsURL() method.
    */
    @Test
    public void subTestGetBitDepthDetectedAsURL() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthDetectedAsURL());
        System.out.println("Detected (during scan of the input by the muxer) resolution in bits AS URL === " + jMetaDataAudio.getBitDepthDetectedAsURL());
    }

   /**
    * Test getFormatProfileAsInteger() method.
    */
    @Test
    public void subTestGetFormatProfileAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatProfileAsInteger());
        System.out.println("Profile of the Format (old XML: 'Profile@Level' format AS Integer === " + jMetaDataAudio.getFormatProfileAsInteger());
    }

   /**
    * Test getFormatProfileAsLong() method.
    */
    @Test
    public void subTestGetFormatProfileAsLong() {
        assertEquals(null, this.jMetaDataAudio.getFormatProfileAsLong());
        System.out.println("Profile of the Format (old XML: 'Profile@Level' format AS Long === " + jMetaDataAudio.getFormatProfileAsLong());
    }

   /**
    * Test getFormatProfileAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatProfileAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatProfileAsLocalDateTime());
        System.out.println("Profile of the Format (old XML: 'Profile@Level' format AS LocalDateTime === " + jMetaDataAudio.getFormatProfileAsLocalDateTime());
    }

   /**
    * Test getFormatProfileAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatProfileAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatProfileAsLocalTime());
        System.out.println("Profile of the Format (old XML: 'Profile@Level' format AS LocalTime === " + jMetaDataAudio.getFormatProfileAsLocalTime());
    }

   /**
    * Test getFormatProfileAsString() method.
    */
    @Test
    public void subTestGetFormatProfileAsString() {
        assertEquals(null, this.jMetaDataAudio.getFormatProfileAsString());
        System.out.println("Profile of the Format (old XML: 'Profile@Level' format AS String === " + jMetaDataAudio.getFormatProfileAsString());
    }

   /**
    * Test getFormatProfileAsBoolean() method.
    */
    @Test
    public void subTestGetFormatProfileAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getFormatProfileAsBoolean());
        System.out.println("Profile of the Format (old XML: 'Profile@Level' format AS Boolean === " + jMetaDataAudio.getFormatProfileAsBoolean());
    }

   /**
    * Test getFormatProfileAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatProfileAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatProfileAsBigInteger());
        System.out.println("Profile of the Format (old XML: 'Profile@Level' format AS BigInteger === " + jMetaDataAudio.getFormatProfileAsBigInteger());
    }

   /**
    * Test getFormatProfileAsURL() method.
    */
    @Test
    public void subTestGetFormatProfileAsURL() {
        assertEquals(null, this.jMetaDataAudio.getFormatProfileAsURL());
        System.out.println("Profile of the Format (old XML: 'Profile@Level' format AS URL === " + jMetaDataAudio.getFormatProfileAsURL());
    }

   /**
    * Test getStreamSizeEncodedString2AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString2AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedString2AsInteger());
        System.out.println("StreamSize_Encoded/String2 AS Integer === " + jMetaDataAudio.getStreamSizeEncodedString2AsInteger());
    }

   /**
    * Test getStreamSizeEncodedString2AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString2AsLong() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedString2AsLong());
        System.out.println("StreamSize_Encoded/String2 AS Long === " + jMetaDataAudio.getStreamSizeEncodedString2AsLong());
    }

   /**
    * Test getStreamSizeEncodedString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedString2AsLocalDateTime());
        System.out.println("StreamSize_Encoded/String2 AS LocalDateTime === " + jMetaDataAudio.getStreamSizeEncodedString2AsLocalDateTime());
    }

   /**
    * Test getStreamSizeEncodedString2AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString2AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedString2AsLocalTime());
        System.out.println("StreamSize_Encoded/String2 AS LocalTime === " + jMetaDataAudio.getStreamSizeEncodedString2AsLocalTime());
    }

   /**
    * Test getStreamSizeEncodedString2AsString() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString2AsString() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedString2AsString());
        System.out.println("StreamSize_Encoded/String2 AS String === " + jMetaDataAudio.getStreamSizeEncodedString2AsString());
    }

   /**
    * Test getStreamSizeEncodedString2AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString2AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedString2AsBoolean());
        System.out.println("StreamSize_Encoded/String2 AS Boolean === " + jMetaDataAudio.getStreamSizeEncodedString2AsBoolean());
    }

   /**
    * Test getStreamSizeEncodedString2AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString2AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedString2AsBigInteger());
        System.out.println("StreamSize_Encoded/String2 AS BigInteger === " + jMetaDataAudio.getStreamSizeEncodedString2AsBigInteger());
    }

   /**
    * Test getStreamSizeEncodedString2AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString2AsURL() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedString2AsURL());
        System.out.println("StreamSize_Encoded/String2 AS URL === " + jMetaDataAudio.getStreamSizeEncodedString2AsURL());
    }

   /**
    * Test getStreamSizeDemuxedString1AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedString1AsInteger());
        System.out.println("StreamSize_Demuxed/String1 AS Integer === " + jMetaDataAudio.getStreamSizeDemuxedString1AsInteger());
    }

   /**
    * Test getStreamSizeDemuxedString1AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsLong() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedString1AsLong());
        System.out.println("StreamSize_Demuxed/String1 AS Long === " + jMetaDataAudio.getStreamSizeDemuxedString1AsLong());
    }

   /**
    * Test getStreamSizeDemuxedString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedString1AsLocalDateTime());
        System.out.println("StreamSize_Demuxed/String1 AS LocalDateTime === " + jMetaDataAudio.getStreamSizeDemuxedString1AsLocalDateTime());
    }

   /**
    * Test getStreamSizeDemuxedString1AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedString1AsLocalTime());
        System.out.println("StreamSize_Demuxed/String1 AS LocalTime === " + jMetaDataAudio.getStreamSizeDemuxedString1AsLocalTime());
    }

   /**
    * Test getStreamSizeDemuxedString1AsString() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsString() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedString1AsString());
        System.out.println("StreamSize_Demuxed/String1 AS String === " + jMetaDataAudio.getStreamSizeDemuxedString1AsString());
    }

   /**
    * Test getStreamSizeDemuxedString1AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedString1AsBoolean());
        System.out.println("StreamSize_Demuxed/String1 AS Boolean === " + jMetaDataAudio.getStreamSizeDemuxedString1AsBoolean());
    }

   /**
    * Test getStreamSizeDemuxedString1AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedString1AsBigInteger());
        System.out.println("StreamSize_Demuxed/String1 AS BigInteger === " + jMetaDataAudio.getStreamSizeDemuxedString1AsBigInteger());
    }

   /**
    * Test getStreamSizeDemuxedString1AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsURL() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedString1AsURL());
        System.out.println("StreamSize_Demuxed/String1 AS URL === " + jMetaDataAudio.getStreamSizeDemuxedString1AsURL());
    }

   /**
    * Test getStreamSizeEncodedString3AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString3AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedString3AsInteger());
        System.out.println("StreamSize_Encoded/String3 AS Integer === " + jMetaDataAudio.getStreamSizeEncodedString3AsInteger());
    }

   /**
    * Test getStreamSizeEncodedString3AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString3AsLong() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedString3AsLong());
        System.out.println("StreamSize_Encoded/String3 AS Long === " + jMetaDataAudio.getStreamSizeEncodedString3AsLong());
    }

   /**
    * Test getStreamSizeEncodedString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedString3AsLocalDateTime());
        System.out.println("StreamSize_Encoded/String3 AS LocalDateTime === " + jMetaDataAudio.getStreamSizeEncodedString3AsLocalDateTime());
    }

   /**
    * Test getStreamSizeEncodedString3AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString3AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedString3AsLocalTime());
        System.out.println("StreamSize_Encoded/String3 AS LocalTime === " + jMetaDataAudio.getStreamSizeEncodedString3AsLocalTime());
    }

   /**
    * Test getStreamSizeEncodedString3AsString() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString3AsString() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedString3AsString());
        System.out.println("StreamSize_Encoded/String3 AS String === " + jMetaDataAudio.getStreamSizeEncodedString3AsString());
    }

   /**
    * Test getStreamSizeEncodedString3AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString3AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedString3AsBoolean());
        System.out.println("StreamSize_Encoded/String3 AS Boolean === " + jMetaDataAudio.getStreamSizeEncodedString3AsBoolean());
    }

   /**
    * Test getStreamSizeEncodedString3AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString3AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedString3AsBigInteger());
        System.out.println("StreamSize_Encoded/String3 AS BigInteger === " + jMetaDataAudio.getStreamSizeEncodedString3AsBigInteger());
    }

   /**
    * Test getStreamSizeEncodedString3AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString3AsURL() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedString3AsURL());
        System.out.println("StreamSize_Encoded/String3 AS URL === " + jMetaDataAudio.getStreamSizeEncodedString3AsURL());
    }

   /**
    * Test getStreamSizeDemuxedString2AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedString2AsInteger());
        System.out.println("StreamSize_Demuxed/String2 AS Integer === " + jMetaDataAudio.getStreamSizeDemuxedString2AsInteger());
    }

   /**
    * Test getStreamSizeDemuxedString2AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsLong() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedString2AsLong());
        System.out.println("StreamSize_Demuxed/String2 AS Long === " + jMetaDataAudio.getStreamSizeDemuxedString2AsLong());
    }

   /**
    * Test getStreamSizeDemuxedString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedString2AsLocalDateTime());
        System.out.println("StreamSize_Demuxed/String2 AS LocalDateTime === " + jMetaDataAudio.getStreamSizeDemuxedString2AsLocalDateTime());
    }

   /**
    * Test getStreamSizeDemuxedString2AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedString2AsLocalTime());
        System.out.println("StreamSize_Demuxed/String2 AS LocalTime === " + jMetaDataAudio.getStreamSizeDemuxedString2AsLocalTime());
    }

   /**
    * Test getStreamSizeDemuxedString2AsString() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsString() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedString2AsString());
        System.out.println("StreamSize_Demuxed/String2 AS String === " + jMetaDataAudio.getStreamSizeDemuxedString2AsString());
    }

   /**
    * Test getStreamSizeDemuxedString2AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedString2AsBoolean());
        System.out.println("StreamSize_Demuxed/String2 AS Boolean === " + jMetaDataAudio.getStreamSizeDemuxedString2AsBoolean());
    }

   /**
    * Test getStreamSizeDemuxedString2AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedString2AsBigInteger());
        System.out.println("StreamSize_Demuxed/String2 AS BigInteger === " + jMetaDataAudio.getStreamSizeDemuxedString2AsBigInteger());
    }

   /**
    * Test getStreamSizeDemuxedString2AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsURL() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedString2AsURL());
        System.out.println("StreamSize_Demuxed/String2 AS URL === " + jMetaDataAudio.getStreamSizeDemuxedString2AsURL());
    }

   /**
    * Test getStreamSizeDemuxedString3AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedString3AsInteger());
        System.out.println("StreamSize_Demuxed/String3 AS Integer === " + jMetaDataAudio.getStreamSizeDemuxedString3AsInteger());
    }

   /**
    * Test getStreamSizeDemuxedString3AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsLong() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedString3AsLong());
        System.out.println("StreamSize_Demuxed/String3 AS Long === " + jMetaDataAudio.getStreamSizeDemuxedString3AsLong());
    }

   /**
    * Test getStreamSizeDemuxedString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedString3AsLocalDateTime());
        System.out.println("StreamSize_Demuxed/String3 AS LocalDateTime === " + jMetaDataAudio.getStreamSizeDemuxedString3AsLocalDateTime());
    }

   /**
    * Test getStreamSizeDemuxedString3AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedString3AsLocalTime());
        System.out.println("StreamSize_Demuxed/String3 AS LocalTime === " + jMetaDataAudio.getStreamSizeDemuxedString3AsLocalTime());
    }

   /**
    * Test getStreamSizeDemuxedString3AsString() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsString() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedString3AsString());
        System.out.println("StreamSize_Demuxed/String3 AS String === " + jMetaDataAudio.getStreamSizeDemuxedString3AsString());
    }

   /**
    * Test getStreamSizeDemuxedString3AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedString3AsBoolean());
        System.out.println("StreamSize_Demuxed/String3 AS Boolean === " + jMetaDataAudio.getStreamSizeDemuxedString3AsBoolean());
    }

   /**
    * Test getStreamSizeDemuxedString3AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedString3AsBigInteger());
        System.out.println("StreamSize_Demuxed/String3 AS BigInteger === " + jMetaDataAudio.getStreamSizeDemuxedString3AsBigInteger());
    }

   /**
    * Test getStreamSizeDemuxedString3AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsURL() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedString3AsURL());
        System.out.println("StreamSize_Demuxed/String3 AS URL === " + jMetaDataAudio.getStreamSizeDemuxedString3AsURL());
    }

   /**
    * Test getStreamSizeEncodedString1AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString1AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedString1AsInteger());
        System.out.println("StreamSize_Encoded/String1 AS Integer === " + jMetaDataAudio.getStreamSizeEncodedString1AsInteger());
    }

   /**
    * Test getStreamSizeEncodedString1AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString1AsLong() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedString1AsLong());
        System.out.println("StreamSize_Encoded/String1 AS Long === " + jMetaDataAudio.getStreamSizeEncodedString1AsLong());
    }

   /**
    * Test getStreamSizeEncodedString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedString1AsLocalDateTime());
        System.out.println("StreamSize_Encoded/String1 AS LocalDateTime === " + jMetaDataAudio.getStreamSizeEncodedString1AsLocalDateTime());
    }

   /**
    * Test getStreamSizeEncodedString1AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString1AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedString1AsLocalTime());
        System.out.println("StreamSize_Encoded/String1 AS LocalTime === " + jMetaDataAudio.getStreamSizeEncodedString1AsLocalTime());
    }

   /**
    * Test getStreamSizeEncodedString1AsString() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString1AsString() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedString1AsString());
        System.out.println("StreamSize_Encoded/String1 AS String === " + jMetaDataAudio.getStreamSizeEncodedString1AsString());
    }

   /**
    * Test getStreamSizeEncodedString1AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString1AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedString1AsBoolean());
        System.out.println("StreamSize_Encoded/String1 AS Boolean === " + jMetaDataAudio.getStreamSizeEncodedString1AsBoolean());
    }

   /**
    * Test getStreamSizeEncodedString1AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString1AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedString1AsBigInteger());
        System.out.println("StreamSize_Encoded/String1 AS BigInteger === " + jMetaDataAudio.getStreamSizeEncodedString1AsBigInteger());
    }

   /**
    * Test getStreamSizeEncodedString1AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString1AsURL() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedString1AsURL());
        System.out.println("StreamSize_Encoded/String1 AS URL === " + jMetaDataAudio.getStreamSizeEncodedString1AsURL());
    }

   /**
    * Test getLanguageStringAsInteger() method.
    */
    @Test
    public void subTestGetLanguageStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getLanguageStringAsInteger());
        System.out.println("Language (full) AS Integer === " + jMetaDataAudio.getLanguageStringAsInteger());
    }

   /**
    * Test getLanguageStringAsLong() method.
    */
    @Test
    public void subTestGetLanguageStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getLanguageStringAsLong());
        System.out.println("Language (full) AS Long === " + jMetaDataAudio.getLanguageStringAsLong());
    }

   /**
    * Test getLanguageStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetLanguageStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getLanguageStringAsLocalDateTime());
        System.out.println("Language (full) AS LocalDateTime === " + jMetaDataAudio.getLanguageStringAsLocalDateTime());
    }

   /**
    * Test getLanguageStringAsLocalTime() method.
    */
    @Test
    public void subTestGetLanguageStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getLanguageStringAsLocalTime());
        System.out.println("Language (full) AS LocalTime === " + jMetaDataAudio.getLanguageStringAsLocalTime());
    }

   /**
    * Test getLanguageStringAsString() method.
    */
    @Test
    public void subTestGetLanguageStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getLanguageStringAsString());
        System.out.println("Language (full) AS String === " + jMetaDataAudio.getLanguageStringAsString());
    }

   /**
    * Test getLanguageStringAsBoolean() method.
    */
    @Test
    public void subTestGetLanguageStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getLanguageStringAsBoolean());
        System.out.println("Language (full) AS Boolean === " + jMetaDataAudio.getLanguageStringAsBoolean());
    }

   /**
    * Test getLanguageStringAsBigInteger() method.
    */
    @Test
    public void subTestGetLanguageStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getLanguageStringAsBigInteger());
        System.out.println("Language (full) AS BigInteger === " + jMetaDataAudio.getLanguageStringAsBigInteger());
    }

   /**
    * Test getLanguageStringAsURL() method.
    */
    @Test
    public void subTestGetLanguageStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getLanguageStringAsURL());
        System.out.println("Language (full) AS URL === " + jMetaDataAudio.getLanguageStringAsURL());
    }

   /**
    * Test getStreamSizeDemuxedString4AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedString4AsInteger());
        System.out.println("StreamSize_Demuxed/String4 AS Integer === " + jMetaDataAudio.getStreamSizeDemuxedString4AsInteger());
    }

   /**
    * Test getStreamSizeDemuxedString4AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsLong() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedString4AsLong());
        System.out.println("StreamSize_Demuxed/String4 AS Long === " + jMetaDataAudio.getStreamSizeDemuxedString4AsLong());
    }

   /**
    * Test getStreamSizeDemuxedString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedString4AsLocalDateTime());
        System.out.println("StreamSize_Demuxed/String4 AS LocalDateTime === " + jMetaDataAudio.getStreamSizeDemuxedString4AsLocalDateTime());
    }

   /**
    * Test getStreamSizeDemuxedString4AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedString4AsLocalTime());
        System.out.println("StreamSize_Demuxed/String4 AS LocalTime === " + jMetaDataAudio.getStreamSizeDemuxedString4AsLocalTime());
    }

   /**
    * Test getStreamSizeDemuxedString4AsString() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsString() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedString4AsString());
        System.out.println("StreamSize_Demuxed/String4 AS String === " + jMetaDataAudio.getStreamSizeDemuxedString4AsString());
    }

   /**
    * Test getStreamSizeDemuxedString4AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedString4AsBoolean());
        System.out.println("StreamSize_Demuxed/String4 AS Boolean === " + jMetaDataAudio.getStreamSizeDemuxedString4AsBoolean());
    }

   /**
    * Test getStreamSizeDemuxedString4AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedString4AsBigInteger());
        System.out.println("StreamSize_Demuxed/String4 AS BigInteger === " + jMetaDataAudio.getStreamSizeDemuxedString4AsBigInteger());
    }

   /**
    * Test getStreamSizeDemuxedString4AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsURL() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedString4AsURL());
        System.out.println("StreamSize_Demuxed/String4 AS URL === " + jMetaDataAudio.getStreamSizeDemuxedString4AsURL());
    }

   /**
    * Test getStreamSizeDemuxedString5AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedString5AsInteger());
        System.out.println("StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use) AS Integer === " + jMetaDataAudio.getStreamSizeDemuxedString5AsInteger());
    }

   /**
    * Test getStreamSizeDemuxedString5AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsLong() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedString5AsLong());
        System.out.println("StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use) AS Long === " + jMetaDataAudio.getStreamSizeDemuxedString5AsLong());
    }

   /**
    * Test getStreamSizeDemuxedString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedString5AsLocalDateTime());
        System.out.println("StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use) AS LocalDateTime === " + jMetaDataAudio.getStreamSizeDemuxedString5AsLocalDateTime());
    }

   /**
    * Test getStreamSizeDemuxedString5AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedString5AsLocalTime());
        System.out.println("StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use) AS LocalTime === " + jMetaDataAudio.getStreamSizeDemuxedString5AsLocalTime());
    }

   /**
    * Test getStreamSizeDemuxedString5AsString() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsString() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedString5AsString());
        System.out.println("StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use) AS String === " + jMetaDataAudio.getStreamSizeDemuxedString5AsString());
    }

   /**
    * Test getStreamSizeDemuxedString5AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedString5AsBoolean());
        System.out.println("StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use) AS Boolean === " + jMetaDataAudio.getStreamSizeDemuxedString5AsBoolean());
    }

   /**
    * Test getStreamSizeDemuxedString5AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedString5AsBigInteger());
        System.out.println("StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use) AS BigInteger === " + jMetaDataAudio.getStreamSizeDemuxedString5AsBigInteger());
    }

   /**
    * Test getStreamSizeDemuxedString5AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsURL() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedString5AsURL());
        System.out.println("StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use) AS URL === " + jMetaDataAudio.getStreamSizeDemuxedString5AsURL());
    }

   /**
    * Test getStreamSizeEncodedString4AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString4AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedString4AsInteger());
        System.out.println("StreamSize_Encoded/String4 AS Integer === " + jMetaDataAudio.getStreamSizeEncodedString4AsInteger());
    }

   /**
    * Test getStreamSizeEncodedString4AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString4AsLong() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedString4AsLong());
        System.out.println("StreamSize_Encoded/String4 AS Long === " + jMetaDataAudio.getStreamSizeEncodedString4AsLong());
    }

   /**
    * Test getStreamSizeEncodedString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedString4AsLocalDateTime());
        System.out.println("StreamSize_Encoded/String4 AS LocalDateTime === " + jMetaDataAudio.getStreamSizeEncodedString4AsLocalDateTime());
    }

   /**
    * Test getStreamSizeEncodedString4AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString4AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedString4AsLocalTime());
        System.out.println("StreamSize_Encoded/String4 AS LocalTime === " + jMetaDataAudio.getStreamSizeEncodedString4AsLocalTime());
    }

   /**
    * Test getStreamSizeEncodedString4AsString() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString4AsString() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedString4AsString());
        System.out.println("StreamSize_Encoded/String4 AS String === " + jMetaDataAudio.getStreamSizeEncodedString4AsString());
    }

   /**
    * Test getStreamSizeEncodedString4AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString4AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedString4AsBoolean());
        System.out.println("StreamSize_Encoded/String4 AS Boolean === " + jMetaDataAudio.getStreamSizeEncodedString4AsBoolean());
    }

   /**
    * Test getStreamSizeEncodedString4AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString4AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedString4AsBigInteger());
        System.out.println("StreamSize_Encoded/String4 AS BigInteger === " + jMetaDataAudio.getStreamSizeEncodedString4AsBigInteger());
    }

   /**
    * Test getStreamSizeEncodedString4AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString4AsURL() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedString4AsURL());
        System.out.println("StreamSize_Encoded/String4 AS URL === " + jMetaDataAudio.getStreamSizeEncodedString4AsURL());
    }

   /**
    * Test getStreamSizeEncodedString5AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString5AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedString5AsInteger());
        System.out.println("Encoded Streamsize in with percentage value AS Integer === " + jMetaDataAudio.getStreamSizeEncodedString5AsInteger());
    }

   /**
    * Test getStreamSizeEncodedString5AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString5AsLong() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedString5AsLong());
        System.out.println("Encoded Streamsize in with percentage value AS Long === " + jMetaDataAudio.getStreamSizeEncodedString5AsLong());
    }

   /**
    * Test getStreamSizeEncodedString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedString5AsLocalDateTime());
        System.out.println("Encoded Streamsize in with percentage value AS LocalDateTime === " + jMetaDataAudio.getStreamSizeEncodedString5AsLocalDateTime());
    }

   /**
    * Test getStreamSizeEncodedString5AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString5AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedString5AsLocalTime());
        System.out.println("Encoded Streamsize in with percentage value AS LocalTime === " + jMetaDataAudio.getStreamSizeEncodedString5AsLocalTime());
    }

   /**
    * Test getStreamSizeEncodedString5AsString() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString5AsString() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedString5AsString());
        System.out.println("Encoded Streamsize in with percentage value AS String === " + jMetaDataAudio.getStreamSizeEncodedString5AsString());
    }

   /**
    * Test getStreamSizeEncodedString5AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString5AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedString5AsBoolean());
        System.out.println("Encoded Streamsize in with percentage value AS Boolean === " + jMetaDataAudio.getStreamSizeEncodedString5AsBoolean());
    }

   /**
    * Test getStreamSizeEncodedString5AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString5AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedString5AsBigInteger());
        System.out.println("Encoded Streamsize in with percentage value AS BigInteger === " + jMetaDataAudio.getStreamSizeEncodedString5AsBigInteger());
    }

   /**
    * Test getStreamSizeEncodedString5AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString5AsURL() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedString5AsURL());
        System.out.println("Encoded Streamsize in with percentage value AS URL === " + jMetaDataAudio.getStreamSizeEncodedString5AsURL());
    }

   /**
    * Test getFormatLevelAsInteger() method.
    */
    @Test
    public void subTestGetFormatLevelAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatLevelAsInteger());
        System.out.println("Level of the Format (only MIXML) AS Integer === " + jMetaDataAudio.getFormatLevelAsInteger());
    }

   /**
    * Test getFormatLevelAsLong() method.
    */
    @Test
    public void subTestGetFormatLevelAsLong() {
        assertEquals(null, this.jMetaDataAudio.getFormatLevelAsLong());
        System.out.println("Level of the Format (only MIXML) AS Long === " + jMetaDataAudio.getFormatLevelAsLong());
    }

   /**
    * Test getFormatLevelAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatLevelAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatLevelAsLocalDateTime());
        System.out.println("Level of the Format (only MIXML) AS LocalDateTime === " + jMetaDataAudio.getFormatLevelAsLocalDateTime());
    }

   /**
    * Test getFormatLevelAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatLevelAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatLevelAsLocalTime());
        System.out.println("Level of the Format (only MIXML) AS LocalTime === " + jMetaDataAudio.getFormatLevelAsLocalTime());
    }

   /**
    * Test getFormatLevelAsString() method.
    */
    @Test
    public void subTestGetFormatLevelAsString() {
        assertEquals(null, this.jMetaDataAudio.getFormatLevelAsString());
        System.out.println("Level of the Format (only MIXML) AS String === " + jMetaDataAudio.getFormatLevelAsString());
    }

   /**
    * Test getFormatLevelAsBoolean() method.
    */
    @Test
    public void subTestGetFormatLevelAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getFormatLevelAsBoolean());
        System.out.println("Level of the Format (only MIXML) AS Boolean === " + jMetaDataAudio.getFormatLevelAsBoolean());
    }

   /**
    * Test getFormatLevelAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatLevelAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatLevelAsBigInteger());
        System.out.println("Level of the Format (only MIXML) AS BigInteger === " + jMetaDataAudio.getFormatLevelAsBigInteger());
    }

   /**
    * Test getFormatLevelAsURL() method.
    */
    @Test
    public void subTestGetFormatLevelAsURL() {
        assertEquals(null, this.jMetaDataAudio.getFormatLevelAsURL());
        System.out.println("Level of the Format (only MIXML) AS URL === " + jMetaDataAudio.getFormatLevelAsURL());
    }

   /**
    * Test getDurationLastFrameString5AsInteger() method.
    */
    @Test
    public void subTestGetDurationLastFrameString5AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameString5AsInteger());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Integer === " + jMetaDataAudio.getDurationLastFrameString5AsInteger());
    }

   /**
    * Test getDurationLastFrameString5AsLong() method.
    */
    @Test
    public void subTestGetDurationLastFrameString5AsLong() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameString5AsLong());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Long === " + jMetaDataAudio.getDurationLastFrameString5AsLong());
    }

   /**
    * Test getDurationLastFrameString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationLastFrameString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameString5AsLocalDateTime());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS LocalDateTime === " + jMetaDataAudio.getDurationLastFrameString5AsLocalDateTime());
    }

   /**
    * Test getDurationLastFrameString5AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationLastFrameString5AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameString5AsLocalTime());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS LocalTime === " + jMetaDataAudio.getDurationLastFrameString5AsLocalTime());
    }

   /**
    * Test getDurationLastFrameString5AsString() method.
    */
    @Test
    public void subTestGetDurationLastFrameString5AsString() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameString5AsString());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS String === " + jMetaDataAudio.getDurationLastFrameString5AsString());
    }

   /**
    * Test getDurationLastFrameString5AsBoolean() method.
    */
    @Test
    public void subTestGetDurationLastFrameString5AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameString5AsBoolean());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Boolean === " + jMetaDataAudio.getDurationLastFrameString5AsBoolean());
    }

   /**
    * Test getDurationLastFrameString5AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationLastFrameString5AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameString5AsBigInteger());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS BigInteger === " + jMetaDataAudio.getDurationLastFrameString5AsBigInteger());
    }

   /**
    * Test getDurationLastFrameString5AsURL() method.
    */
    @Test
    public void subTestGetDurationLastFrameString5AsURL() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameString5AsURL());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS URL === " + jMetaDataAudio.getDurationLastFrameString5AsURL());
    }

   /**
    * Test getDurationLastFrameString4AsInteger() method.
    */
    @Test
    public void subTestGetDurationLastFrameString4AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameString4AsInteger());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Integer === " + jMetaDataAudio.getDurationLastFrameString4AsInteger());
    }

   /**
    * Test getDurationLastFrameString4AsLong() method.
    */
    @Test
    public void subTestGetDurationLastFrameString4AsLong() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameString4AsLong());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Long === " + jMetaDataAudio.getDurationLastFrameString4AsLong());
    }

   /**
    * Test getDurationLastFrameString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationLastFrameString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameString4AsLocalDateTime());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS LocalDateTime === " + jMetaDataAudio.getDurationLastFrameString4AsLocalDateTime());
    }

   /**
    * Test getDurationLastFrameString4AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationLastFrameString4AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameString4AsLocalTime());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS LocalTime === " + jMetaDataAudio.getDurationLastFrameString4AsLocalTime());
    }

   /**
    * Test getDurationLastFrameString4AsString() method.
    */
    @Test
    public void subTestGetDurationLastFrameString4AsString() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameString4AsString());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS String === " + jMetaDataAudio.getDurationLastFrameString4AsString());
    }

   /**
    * Test getDurationLastFrameString4AsBoolean() method.
    */
    @Test
    public void subTestGetDurationLastFrameString4AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameString4AsBoolean());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Boolean === " + jMetaDataAudio.getDurationLastFrameString4AsBoolean());
    }

   /**
    * Test getDurationLastFrameString4AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationLastFrameString4AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameString4AsBigInteger());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS BigInteger === " + jMetaDataAudio.getDurationLastFrameString4AsBigInteger());
    }

   /**
    * Test getDurationLastFrameString4AsURL() method.
    */
    @Test
    public void subTestGetDurationLastFrameString4AsURL() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameString4AsURL());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS URL === " + jMetaDataAudio.getDurationLastFrameString4AsURL());
    }

   /**
    * Test getStreamSizeDemuxedStringAsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedStringAsInteger());
        System.out.println("StreamSize_Demuxed in with percentage value AS Integer === " + jMetaDataAudio.getStreamSizeDemuxedStringAsInteger());
    }

   /**
    * Test getStreamSizeDemuxedStringAsLong() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedStringAsLong());
        System.out.println("StreamSize_Demuxed in with percentage value AS Long === " + jMetaDataAudio.getStreamSizeDemuxedStringAsLong());
    }

   /**
    * Test getStreamSizeDemuxedStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedStringAsLocalDateTime());
        System.out.println("StreamSize_Demuxed in with percentage value AS LocalDateTime === " + jMetaDataAudio.getStreamSizeDemuxedStringAsLocalDateTime());
    }

   /**
    * Test getStreamSizeDemuxedStringAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedStringAsLocalTime());
        System.out.println("StreamSize_Demuxed in with percentage value AS LocalTime === " + jMetaDataAudio.getStreamSizeDemuxedStringAsLocalTime());
    }

   /**
    * Test getStreamSizeDemuxedStringAsString() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedStringAsString());
        System.out.println("StreamSize_Demuxed in with percentage value AS String === " + jMetaDataAudio.getStreamSizeDemuxedStringAsString());
    }

   /**
    * Test getStreamSizeDemuxedStringAsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedStringAsBoolean());
        System.out.println("StreamSize_Demuxed in with percentage value AS Boolean === " + jMetaDataAudio.getStreamSizeDemuxedStringAsBoolean());
    }

   /**
    * Test getStreamSizeDemuxedStringAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedStringAsBigInteger());
        System.out.println("StreamSize_Demuxed in with percentage value AS BigInteger === " + jMetaDataAudio.getStreamSizeDemuxedStringAsBigInteger());
    }

   /**
    * Test getStreamSizeDemuxedStringAsURL() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedStringAsURL());
        System.out.println("StreamSize_Demuxed in with percentage value AS URL === " + jMetaDataAudio.getStreamSizeDemuxedStringAsURL());
    }

   /**
    * Test getForcedStringAsInteger() method.
    */
    @Test
    public void subTestGetForcedStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getForcedStringAsInteger());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS Integer === " + jMetaDataAudio.getForcedStringAsInteger());
    }

   /**
    * Test getForcedStringAsLong() method.
    */
    @Test
    public void subTestGetForcedStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getForcedStringAsLong());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS Long === " + jMetaDataAudio.getForcedStringAsLong());
    }

   /**
    * Test getForcedStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetForcedStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getForcedStringAsLocalDateTime());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS LocalDateTime === " + jMetaDataAudio.getForcedStringAsLocalDateTime());
    }

   /**
    * Test getForcedStringAsLocalTime() method.
    */
    @Test
    public void subTestGetForcedStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getForcedStringAsLocalTime());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS LocalTime === " + jMetaDataAudio.getForcedStringAsLocalTime());
    }

   /**
    * Test getForcedStringAsString() method.
    */
    @Test
    public void subTestGetForcedStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getForcedStringAsString());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS String === " + jMetaDataAudio.getForcedStringAsString());
    }

   /**
    * Test getForcedStringAsBoolean() method.
    */
    @Test
    public void subTestGetForcedStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getForcedStringAsBoolean());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS Boolean === " + jMetaDataAudio.getForcedStringAsBoolean());
    }

   /**
    * Test getForcedStringAsBigInteger() method.
    */
    @Test
    public void subTestGetForcedStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getForcedStringAsBigInteger());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS BigInteger === " + jMetaDataAudio.getForcedStringAsBigInteger());
    }

   /**
    * Test getForcedStringAsURL() method.
    */
    @Test
    public void subTestGetForcedStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getForcedStringAsURL());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS URL === " + jMetaDataAudio.getForcedStringAsURL());
    }

   /**
    * Test getBitDepthAsInteger() method.
    */
    @Test
    public void subTestGetBitDepthAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthAsInteger());
        System.out.println("Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different AS Integer === " + jMetaDataAudio.getBitDepthAsInteger());
    }

   /**
    * Test getBitDepthAsLong() method.
    */
    @Test
    public void subTestGetBitDepthAsLong() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthAsLong());
        System.out.println("Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different AS Long === " + jMetaDataAudio.getBitDepthAsLong());
    }

   /**
    * Test getBitDepthAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitDepthAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthAsLocalDateTime());
        System.out.println("Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different AS LocalDateTime === " + jMetaDataAudio.getBitDepthAsLocalDateTime());
    }

   /**
    * Test getBitDepthAsLocalTime() method.
    */
    @Test
    public void subTestGetBitDepthAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthAsLocalTime());
        System.out.println("Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different AS LocalTime === " + jMetaDataAudio.getBitDepthAsLocalTime());
    }

   /**
    * Test getBitDepthAsString() method.
    */
    @Test
    public void subTestGetBitDepthAsString() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthAsString());
        System.out.println("Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different AS String === " + jMetaDataAudio.getBitDepthAsString());
    }

   /**
    * Test getBitDepthAsBoolean() method.
    */
    @Test
    public void subTestGetBitDepthAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthAsBoolean());
        System.out.println("Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different AS Boolean === " + jMetaDataAudio.getBitDepthAsBoolean());
    }

   /**
    * Test getBitDepthAsBigInteger() method.
    */
    @Test
    public void subTestGetBitDepthAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthAsBigInteger());
        System.out.println("Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different AS BigInteger === " + jMetaDataAudio.getBitDepthAsBigInteger());
    }

   /**
    * Test getBitDepthAsURL() method.
    */
    @Test
    public void subTestGetBitDepthAsURL() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthAsURL());
        System.out.println("Resolution in bits (8, 16, 20, 24). Note: significant bits in case the stored bit depth is different AS URL === " + jMetaDataAudio.getBitDepthAsURL());
    }

   /**
    * Test getStreamSizeEncodedAsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedAsInteger());
        System.out.println("Encoded Streamsize in bytes AS Integer === " + jMetaDataAudio.getStreamSizeEncodedAsInteger());
    }

   /**
    * Test getStreamSizeEncodedAsLong() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedAsLong() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedAsLong());
        System.out.println("Encoded Streamsize in bytes AS Long === " + jMetaDataAudio.getStreamSizeEncodedAsLong());
    }

   /**
    * Test getStreamSizeEncodedAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedAsLocalDateTime());
        System.out.println("Encoded Streamsize in bytes AS LocalDateTime === " + jMetaDataAudio.getStreamSizeEncodedAsLocalDateTime());
    }

   /**
    * Test getStreamSizeEncodedAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedAsLocalTime());
        System.out.println("Encoded Streamsize in bytes AS LocalTime === " + jMetaDataAudio.getStreamSizeEncodedAsLocalTime());
    }

   /**
    * Test getStreamSizeEncodedAsString() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedAsString() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedAsString());
        System.out.println("Encoded Streamsize in bytes AS String === " + jMetaDataAudio.getStreamSizeEncodedAsString());
    }

   /**
    * Test getStreamSizeEncodedAsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedAsBoolean());
        System.out.println("Encoded Streamsize in bytes AS Boolean === " + jMetaDataAudio.getStreamSizeEncodedAsBoolean());
    }

   /**
    * Test getStreamSizeEncodedAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedAsBigInteger());
        System.out.println("Encoded Streamsize in bytes AS BigInteger === " + jMetaDataAudio.getStreamSizeEncodedAsBigInteger());
    }

   /**
    * Test getStreamSizeEncodedAsURL() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedAsURL() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedAsURL());
        System.out.println("Encoded Streamsize in bytes AS URL === " + jMetaDataAudio.getStreamSizeEncodedAsURL());
    }

   /**
    * Test getStreamCountAsInteger() method.
    */
    @Test
    public void subTestGetStreamCountAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamCountAsInteger());
        System.out.println("Count of streams of that kind available AS Integer === " + jMetaDataAudio.getStreamCountAsInteger());
    }

   /**
    * Test getStreamCountAsLong() method.
    */
    @Test
    public void subTestGetStreamCountAsLong() {
        assertEquals(null, this.jMetaDataAudio.getStreamCountAsLong());
        System.out.println("Count of streams of that kind available AS Long === " + jMetaDataAudio.getStreamCountAsLong());
    }

   /**
    * Test getStreamCountAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamCountAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamCountAsLocalDateTime());
        System.out.println("Count of streams of that kind available AS LocalDateTime === " + jMetaDataAudio.getStreamCountAsLocalDateTime());
    }

   /**
    * Test getStreamCountAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamCountAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamCountAsLocalTime());
        System.out.println("Count of streams of that kind available AS LocalTime === " + jMetaDataAudio.getStreamCountAsLocalTime());
    }

   /**
    * Test getStreamCountAsString() method.
    */
    @Test
    public void subTestGetStreamCountAsString() {
        assertEquals(null, this.jMetaDataAudio.getStreamCountAsString());
        System.out.println("Count of streams of that kind available AS String === " + jMetaDataAudio.getStreamCountAsString());
    }

   /**
    * Test getStreamCountAsBoolean() method.
    */
    @Test
    public void subTestGetStreamCountAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getStreamCountAsBoolean());
        System.out.println("Count of streams of that kind available AS Boolean === " + jMetaDataAudio.getStreamCountAsBoolean());
    }

   /**
    * Test getStreamCountAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamCountAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamCountAsBigInteger());
        System.out.println("Count of streams of that kind available AS BigInteger === " + jMetaDataAudio.getStreamCountAsBigInteger());
    }

   /**
    * Test getStreamCountAsURL() method.
    */
    @Test
    public void subTestGetStreamCountAsURL() {
        assertEquals(null, this.jMetaDataAudio.getStreamCountAsURL());
        System.out.println("Count of streams of that kind available AS URL === " + jMetaDataAudio.getStreamCountAsURL());
    }

   /**
    * Test getStreamSizeEncodedStringAsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedStringAsInteger());
        System.out.println("Encoded Streamsize in with percentage value AS Integer === " + jMetaDataAudio.getStreamSizeEncodedStringAsInteger());
    }

   /**
    * Test getStreamSizeEncodedStringAsLong() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedStringAsLong());
        System.out.println("Encoded Streamsize in with percentage value AS Long === " + jMetaDataAudio.getStreamSizeEncodedStringAsLong());
    }

   /**
    * Test getStreamSizeEncodedStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedStringAsLocalDateTime());
        System.out.println("Encoded Streamsize in with percentage value AS LocalDateTime === " + jMetaDataAudio.getStreamSizeEncodedStringAsLocalDateTime());
    }

   /**
    * Test getStreamSizeEncodedStringAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedStringAsLocalTime());
        System.out.println("Encoded Streamsize in with percentage value AS LocalTime === " + jMetaDataAudio.getStreamSizeEncodedStringAsLocalTime());
    }

   /**
    * Test getStreamSizeEncodedStringAsString() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedStringAsString());
        System.out.println("Encoded Streamsize in with percentage value AS String === " + jMetaDataAudio.getStreamSizeEncodedStringAsString());
    }

   /**
    * Test getStreamSizeEncodedStringAsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedStringAsBoolean());
        System.out.println("Encoded Streamsize in with percentage value AS Boolean === " + jMetaDataAudio.getStreamSizeEncodedStringAsBoolean());
    }

   /**
    * Test getStreamSizeEncodedStringAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedStringAsBigInteger());
        System.out.println("Encoded Streamsize in with percentage value AS BigInteger === " + jMetaDataAudio.getStreamSizeEncodedStringAsBigInteger());
    }

   /**
    * Test getStreamSizeEncodedStringAsURL() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeEncodedStringAsURL());
        System.out.println("Encoded Streamsize in with percentage value AS URL === " + jMetaDataAudio.getStreamSizeEncodedStringAsURL());
    }

   /**
    * Test getDurationString2AsInteger() method.
    */
    @Test
    public void subTestGetDurationString2AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDurationString2AsInteger());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS Integer === " + jMetaDataAudio.getDurationString2AsInteger());
    }

   /**
    * Test getDurationString2AsLong() method.
    */
    @Test
    public void subTestGetDurationString2AsLong() {
        assertEquals(null, this.jMetaDataAudio.getDurationString2AsLong());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS Long === " + jMetaDataAudio.getDurationString2AsLong());
    }

   /**
    * Test getDurationString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDurationString2AsLocalDateTime());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS LocalDateTime === " + jMetaDataAudio.getDurationString2AsLocalDateTime());
    }

   /**
    * Test getDurationString2AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationString2AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDurationString2AsLocalTime());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS LocalTime === " + jMetaDataAudio.getDurationString2AsLocalTime());
    }

   /**
    * Test getDurationString2AsString() method.
    */
    @Test
    public void subTestGetDurationString2AsString() {
        assertEquals(null, this.jMetaDataAudio.getDurationString2AsString());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS String === " + jMetaDataAudio.getDurationString2AsString());
    }

   /**
    * Test getDurationString2AsBoolean() method.
    */
    @Test
    public void subTestGetDurationString2AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDurationString2AsBoolean());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS Boolean === " + jMetaDataAudio.getDurationString2AsBoolean());
    }

   /**
    * Test getDurationString2AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationString2AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDurationString2AsBigInteger());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS BigInteger === " + jMetaDataAudio.getDurationString2AsBigInteger());
    }

   /**
    * Test getDurationString2AsURL() method.
    */
    @Test
    public void subTestGetDurationString2AsURL() {
        assertEquals(null, this.jMetaDataAudio.getDurationString2AsURL());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS URL === " + jMetaDataAudio.getDurationString2AsURL());
    }

   /**
    * Test getDurationString3AsInteger() method.
    */
    @Test
    public void subTestGetDurationString3AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDurationString3AsInteger());
        System.out.println("Play time in format : HH:MM:SS.MMM AS Integer === " + jMetaDataAudio.getDurationString3AsInteger());
    }

   /**
    * Test getDurationString3AsLong() method.
    */
    @Test
    public void subTestGetDurationString3AsLong() {
        assertEquals(null, this.jMetaDataAudio.getDurationString3AsLong());
        System.out.println("Play time in format : HH:MM:SS.MMM AS Long === " + jMetaDataAudio.getDurationString3AsLong());
    }

   /**
    * Test getDurationString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDurationString3AsLocalDateTime());
        System.out.println("Play time in format : HH:MM:SS.MMM AS LocalDateTime === " + jMetaDataAudio.getDurationString3AsLocalDateTime());
    }

   /**
    * Test getDurationString3AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationString3AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDurationString3AsLocalTime());
        System.out.println("Play time in format : HH:MM:SS.MMM AS LocalTime === " + jMetaDataAudio.getDurationString3AsLocalTime());
    }

   /**
    * Test getDurationString3AsString() method.
    */
    @Test
    public void subTestGetDurationString3AsString() {
        assertEquals(null, this.jMetaDataAudio.getDurationString3AsString());
        System.out.println("Play time in format : HH:MM:SS.MMM AS String === " + jMetaDataAudio.getDurationString3AsString());
    }

   /**
    * Test getDurationString3AsBoolean() method.
    */
    @Test
    public void subTestGetDurationString3AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDurationString3AsBoolean());
        System.out.println("Play time in format : HH:MM:SS.MMM AS Boolean === " + jMetaDataAudio.getDurationString3AsBoolean());
    }

   /**
    * Test getDurationString3AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationString3AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDurationString3AsBigInteger());
        System.out.println("Play time in format : HH:MM:SS.MMM AS BigInteger === " + jMetaDataAudio.getDurationString3AsBigInteger());
    }

   /**
    * Test getDurationString3AsURL() method.
    */
    @Test
    public void subTestGetDurationString3AsURL() {
        assertEquals(null, this.jMetaDataAudio.getDurationString3AsURL());
        System.out.println("Play time in format : HH:MM:SS.MMM AS URL === " + jMetaDataAudio.getDurationString3AsURL());
    }

   /**
    * Test getChannelLayoutAsInteger() method.
    */
    @Test
    public void subTestGetChannelLayoutAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getChannelLayoutAsInteger());
        System.out.println("Layout of channels (in the stream) AS Integer === " + jMetaDataAudio.getChannelLayoutAsInteger());
    }

   /**
    * Test getChannelLayoutAsLong() method.
    */
    @Test
    public void subTestGetChannelLayoutAsLong() {
        assertEquals(null, this.jMetaDataAudio.getChannelLayoutAsLong());
        System.out.println("Layout of channels (in the stream) AS Long === " + jMetaDataAudio.getChannelLayoutAsLong());
    }

   /**
    * Test getChannelLayoutAsLocalDateTime() method.
    */
    @Test
    public void subTestGetChannelLayoutAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getChannelLayoutAsLocalDateTime());
        System.out.println("Layout of channels (in the stream) AS LocalDateTime === " + jMetaDataAudio.getChannelLayoutAsLocalDateTime());
    }

   /**
    * Test getChannelLayoutAsLocalTime() method.
    */
    @Test
    public void subTestGetChannelLayoutAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getChannelLayoutAsLocalTime());
        System.out.println("Layout of channels (in the stream) AS LocalTime === " + jMetaDataAudio.getChannelLayoutAsLocalTime());
    }

   /**
    * Test getChannelLayoutAsString() method.
    */
    @Test
    public void subTestGetChannelLayoutAsString() {
        assertEquals(null, this.jMetaDataAudio.getChannelLayoutAsString());
        System.out.println("Layout of channels (in the stream) AS String === " + jMetaDataAudio.getChannelLayoutAsString());
    }

   /**
    * Test getChannelLayoutAsBoolean() method.
    */
    @Test
    public void subTestGetChannelLayoutAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getChannelLayoutAsBoolean());
        System.out.println("Layout of channels (in the stream) AS Boolean === " + jMetaDataAudio.getChannelLayoutAsBoolean());
    }

   /**
    * Test getChannelLayoutAsBigInteger() method.
    */
    @Test
    public void subTestGetChannelLayoutAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getChannelLayoutAsBigInteger());
        System.out.println("Layout of channels (in the stream) AS BigInteger === " + jMetaDataAudio.getChannelLayoutAsBigInteger());
    }

   /**
    * Test getChannelLayoutAsURL() method.
    */
    @Test
    public void subTestGetChannelLayoutAsURL() {
        assertEquals(null, this.jMetaDataAudio.getChannelLayoutAsURL());
        System.out.println("Layout of channels (in the stream) AS URL === " + jMetaDataAudio.getChannelLayoutAsURL());
    }

   /**
    * Test getDurationString1AsInteger() method.
    */
    @Test
    public void subTestGetDurationString1AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDurationString1AsInteger());
        System.out.println("Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS Integer === " + jMetaDataAudio.getDurationString1AsInteger());
    }

   /**
    * Test getDurationString1AsLong() method.
    */
    @Test
    public void subTestGetDurationString1AsLong() {
        assertEquals(null, this.jMetaDataAudio.getDurationString1AsLong());
        System.out.println("Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS Long === " + jMetaDataAudio.getDurationString1AsLong());
    }

   /**
    * Test getDurationString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDurationString1AsLocalDateTime());
        System.out.println("Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS LocalDateTime === " + jMetaDataAudio.getDurationString1AsLocalDateTime());
    }

   /**
    * Test getDurationString1AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationString1AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDurationString1AsLocalTime());
        System.out.println("Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS LocalTime === " + jMetaDataAudio.getDurationString1AsLocalTime());
    }

   /**
    * Test getDurationString1AsString() method.
    */
    @Test
    public void subTestGetDurationString1AsString() {
        assertEquals(null, this.jMetaDataAudio.getDurationString1AsString());
        System.out.println("Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS String === " + jMetaDataAudio.getDurationString1AsString());
    }

   /**
    * Test getDurationString1AsBoolean() method.
    */
    @Test
    public void subTestGetDurationString1AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDurationString1AsBoolean());
        System.out.println("Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS Boolean === " + jMetaDataAudio.getDurationString1AsBoolean());
    }

   /**
    * Test getDurationString1AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationString1AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDurationString1AsBigInteger());
        System.out.println("Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS BigInteger === " + jMetaDataAudio.getDurationString1AsBigInteger());
    }

   /**
    * Test getDurationString1AsURL() method.
    */
    @Test
    public void subTestGetDurationString1AsURL() {
        assertEquals(null, this.jMetaDataAudio.getDurationString1AsURL());
        System.out.println("Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS URL === " + jMetaDataAudio.getDurationString1AsURL());
    }

   /**
    * Test getDurationString4AsInteger() method.
    */
    @Test
    public void subTestGetDurationString4AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDurationString4AsInteger());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Integer === " + jMetaDataAudio.getDurationString4AsInteger());
    }

   /**
    * Test getDurationString4AsLong() method.
    */
    @Test
    public void subTestGetDurationString4AsLong() {
        assertEquals(null, this.jMetaDataAudio.getDurationString4AsLong());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Long === " + jMetaDataAudio.getDurationString4AsLong());
    }

   /**
    * Test getDurationString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDurationString4AsLocalDateTime());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS LocalDateTime === " + jMetaDataAudio.getDurationString4AsLocalDateTime());
    }

   /**
    * Test getDurationString4AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationString4AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDurationString4AsLocalTime());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS LocalTime === " + jMetaDataAudio.getDurationString4AsLocalTime());
    }

   /**
    * Test getDurationString4AsString() method.
    */
    @Test
    public void subTestGetDurationString4AsString() {
        assertEquals(null, this.jMetaDataAudio.getDurationString4AsString());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS String === " + jMetaDataAudio.getDurationString4AsString());
    }

   /**
    * Test getDurationString4AsBoolean() method.
    */
    @Test
    public void subTestGetDurationString4AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDurationString4AsBoolean());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Boolean === " + jMetaDataAudio.getDurationString4AsBoolean());
    }

   /**
    * Test getDurationString4AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationString4AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDurationString4AsBigInteger());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS BigInteger === " + jMetaDataAudio.getDurationString4AsBigInteger());
    }

   /**
    * Test getDurationString4AsURL() method.
    */
    @Test
    public void subTestGetDurationString4AsURL() {
        assertEquals(null, this.jMetaDataAudio.getDurationString4AsURL());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS URL === " + jMetaDataAudio.getDurationString4AsURL());
    }

   /**
    * Test getDurationString5AsInteger() method.
    */
    @Test
    public void subTestGetDurationString5AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDurationString5AsInteger());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Integer === " + jMetaDataAudio.getDurationString5AsInteger());
    }

   /**
    * Test getDurationString5AsLong() method.
    */
    @Test
    public void subTestGetDurationString5AsLong() {
        assertEquals(null, this.jMetaDataAudio.getDurationString5AsLong());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Long === " + jMetaDataAudio.getDurationString5AsLong());
    }

   /**
    * Test getDurationString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDurationString5AsLocalDateTime());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS LocalDateTime === " + jMetaDataAudio.getDurationString5AsLocalDateTime());
    }

   /**
    * Test getDurationString5AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationString5AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDurationString5AsLocalTime());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS LocalTime === " + jMetaDataAudio.getDurationString5AsLocalTime());
    }

   /**
    * Test getDurationString5AsString() method.
    */
    @Test
    public void subTestGetDurationString5AsString() {
        assertEquals(null, this.jMetaDataAudio.getDurationString5AsString());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS String === " + jMetaDataAudio.getDurationString5AsString());
    }

   /**
    * Test getDurationString5AsBoolean() method.
    */
    @Test
    public void subTestGetDurationString5AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDurationString5AsBoolean());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Boolean === " + jMetaDataAudio.getDurationString5AsBoolean());
    }

   /**
    * Test getDurationString5AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationString5AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDurationString5AsBigInteger());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS BigInteger === " + jMetaDataAudio.getDurationString5AsBigInteger());
    }

   /**
    * Test getDurationString5AsURL() method.
    */
    @Test
    public void subTestGetDurationString5AsURL() {
        assertEquals(null, this.jMetaDataAudio.getDurationString5AsURL());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS URL === " + jMetaDataAudio.getDurationString5AsURL());
    }

   /**
    * Test getBitRateEncodedAsInteger() method.
    */
    @Test
    public void subTestGetBitRateEncodedAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getBitRateEncodedAsInteger());
        System.out.println("Encoded (with forced padding) bit rate in bps, if some container padding is present AS Integer === " + jMetaDataAudio.getBitRateEncodedAsInteger());
    }

   /**
    * Test getBitRateEncodedAsLong() method.
    */
    @Test
    public void subTestGetBitRateEncodedAsLong() {
        assertEquals(null, this.jMetaDataAudio.getBitRateEncodedAsLong());
        System.out.println("Encoded (with forced padding) bit rate in bps, if some container padding is present AS Long === " + jMetaDataAudio.getBitRateEncodedAsLong());
    }

   /**
    * Test getBitRateEncodedAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitRateEncodedAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getBitRateEncodedAsLocalDateTime());
        System.out.println("Encoded (with forced padding) bit rate in bps, if some container padding is present AS LocalDateTime === " + jMetaDataAudio.getBitRateEncodedAsLocalDateTime());
    }

   /**
    * Test getBitRateEncodedAsLocalTime() method.
    */
    @Test
    public void subTestGetBitRateEncodedAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getBitRateEncodedAsLocalTime());
        System.out.println("Encoded (with forced padding) bit rate in bps, if some container padding is present AS LocalTime === " + jMetaDataAudio.getBitRateEncodedAsLocalTime());
    }

   /**
    * Test getBitRateEncodedAsString() method.
    */
    @Test
    public void subTestGetBitRateEncodedAsString() {
        assertEquals(null, this.jMetaDataAudio.getBitRateEncodedAsString());
        System.out.println("Encoded (with forced padding) bit rate in bps, if some container padding is present AS String === " + jMetaDataAudio.getBitRateEncodedAsString());
    }

   /**
    * Test getBitRateEncodedAsBoolean() method.
    */
    @Test
    public void subTestGetBitRateEncodedAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getBitRateEncodedAsBoolean());
        System.out.println("Encoded (with forced padding) bit rate in bps, if some container padding is present AS Boolean === " + jMetaDataAudio.getBitRateEncodedAsBoolean());
    }

   /**
    * Test getBitRateEncodedAsBigInteger() method.
    */
    @Test
    public void subTestGetBitRateEncodedAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getBitRateEncodedAsBigInteger());
        System.out.println("Encoded (with forced padding) bit rate in bps, if some container padding is present AS BigInteger === " + jMetaDataAudio.getBitRateEncodedAsBigInteger());
    }

   /**
    * Test getBitRateEncodedAsURL() method.
    */
    @Test
    public void subTestGetBitRateEncodedAsURL() {
        assertEquals(null, this.jMetaDataAudio.getBitRateEncodedAsURL());
        System.out.println("Encoded (with forced padding) bit rate in bps, if some container padding is present AS URL === " + jMetaDataAudio.getBitRateEncodedAsURL());
    }

   /**
    * Test getDelaySourceAsInteger() method.
    */
    @Test
    public void subTestGetDelaySourceAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDelaySourceAsInteger());
        System.out.println("Delay source (Container or Stream or empty) AS Integer === " + jMetaDataAudio.getDelaySourceAsInteger());
    }

   /**
    * Test getDelaySourceAsLong() method.
    */
    @Test
    public void subTestGetDelaySourceAsLong() {
        assertEquals(null, this.jMetaDataAudio.getDelaySourceAsLong());
        System.out.println("Delay source (Container or Stream or empty) AS Long === " + jMetaDataAudio.getDelaySourceAsLong());
    }

   /**
    * Test getDelaySourceAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelaySourceAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDelaySourceAsLocalDateTime());
        System.out.println("Delay source (Container or Stream or empty) AS LocalDateTime === " + jMetaDataAudio.getDelaySourceAsLocalDateTime());
    }

   /**
    * Test getDelaySourceAsLocalTime() method.
    */
    @Test
    public void subTestGetDelaySourceAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDelaySourceAsLocalTime());
        System.out.println("Delay source (Container or Stream or empty) AS LocalTime === " + jMetaDataAudio.getDelaySourceAsLocalTime());
    }

   /**
    * Test getDelaySourceAsString() method.
    */
    @Test
    public void subTestGetDelaySourceAsString() {
        assertEquals(null, this.jMetaDataAudio.getDelaySourceAsString());
        System.out.println("Delay source (Container or Stream or empty) AS String === " + jMetaDataAudio.getDelaySourceAsString());
    }

   /**
    * Test getDelaySourceAsBoolean() method.
    */
    @Test
    public void subTestGetDelaySourceAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDelaySourceAsBoolean());
        System.out.println("Delay source (Container or Stream or empty) AS Boolean === " + jMetaDataAudio.getDelaySourceAsBoolean());
    }

   /**
    * Test getDelaySourceAsBigInteger() method.
    */
    @Test
    public void subTestGetDelaySourceAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDelaySourceAsBigInteger());
        System.out.println("Delay source (Container or Stream or empty) AS BigInteger === " + jMetaDataAudio.getDelaySourceAsBigInteger());
    }

   /**
    * Test getDelaySourceAsURL() method.
    */
    @Test
    public void subTestGetDelaySourceAsURL() {
        assertEquals(null, this.jMetaDataAudio.getDelaySourceAsURL());
        System.out.println("Delay source (Container or Stream or empty) AS URL === " + jMetaDataAudio.getDelaySourceAsURL());
    }

   /**
    * Test getDelayOriginalDropFrameAsInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalDropFrameAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalDropFrameAsInteger());
        System.out.println("Delay drop frame info AS Integer === " + jMetaDataAudio.getDelayOriginalDropFrameAsInteger());
    }

   /**
    * Test getDelayOriginalDropFrameAsLong() method.
    */
    @Test
    public void subTestGetDelayOriginalDropFrameAsLong() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalDropFrameAsLong());
        System.out.println("Delay drop frame info AS Long === " + jMetaDataAudio.getDelayOriginalDropFrameAsLong());
    }

   /**
    * Test getDelayOriginalDropFrameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayOriginalDropFrameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalDropFrameAsLocalDateTime());
        System.out.println("Delay drop frame info AS LocalDateTime === " + jMetaDataAudio.getDelayOriginalDropFrameAsLocalDateTime());
    }

   /**
    * Test getDelayOriginalDropFrameAsLocalTime() method.
    */
    @Test
    public void subTestGetDelayOriginalDropFrameAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalDropFrameAsLocalTime());
        System.out.println("Delay drop frame info AS LocalTime === " + jMetaDataAudio.getDelayOriginalDropFrameAsLocalTime());
    }

   /**
    * Test getDelayOriginalDropFrameAsString() method.
    */
    @Test
    public void subTestGetDelayOriginalDropFrameAsString() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalDropFrameAsString());
        System.out.println("Delay drop frame info AS String === " + jMetaDataAudio.getDelayOriginalDropFrameAsString());
    }

   /**
    * Test getDelayOriginalDropFrameAsBoolean() method.
    */
    @Test
    public void subTestGetDelayOriginalDropFrameAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalDropFrameAsBoolean());
        System.out.println("Delay drop frame info AS Boolean === " + jMetaDataAudio.getDelayOriginalDropFrameAsBoolean());
    }

   /**
    * Test getDelayOriginalDropFrameAsBigInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalDropFrameAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalDropFrameAsBigInteger());
        System.out.println("Delay drop frame info AS BigInteger === " + jMetaDataAudio.getDelayOriginalDropFrameAsBigInteger());
    }

   /**
    * Test getDelayOriginalDropFrameAsURL() method.
    */
    @Test
    public void subTestGetDelayOriginalDropFrameAsURL() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalDropFrameAsURL());
        System.out.println("Delay drop frame info AS URL === " + jMetaDataAudio.getDelayOriginalDropFrameAsURL());
    }

   /**
    * Test getDurationLastFrameString1AsInteger() method.
    */
    @Test
    public void subTestGetDurationLastFrameString1AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameString1AsInteger());
        System.out.println("Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS Integer === " + jMetaDataAudio.getDurationLastFrameString1AsInteger());
    }

   /**
    * Test getDurationLastFrameString1AsLong() method.
    */
    @Test
    public void subTestGetDurationLastFrameString1AsLong() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameString1AsLong());
        System.out.println("Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS Long === " + jMetaDataAudio.getDurationLastFrameString1AsLong());
    }

   /**
    * Test getDurationLastFrameString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationLastFrameString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameString1AsLocalDateTime());
        System.out.println("Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS LocalDateTime === " + jMetaDataAudio.getDurationLastFrameString1AsLocalDateTime());
    }

   /**
    * Test getDurationLastFrameString1AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationLastFrameString1AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameString1AsLocalTime());
        System.out.println("Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS LocalTime === " + jMetaDataAudio.getDurationLastFrameString1AsLocalTime());
    }

   /**
    * Test getDurationLastFrameString1AsString() method.
    */
    @Test
    public void subTestGetDurationLastFrameString1AsString() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameString1AsString());
        System.out.println("Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS String === " + jMetaDataAudio.getDurationLastFrameString1AsString());
    }

   /**
    * Test getDurationLastFrameString1AsBoolean() method.
    */
    @Test
    public void subTestGetDurationLastFrameString1AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameString1AsBoolean());
        System.out.println("Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS Boolean === " + jMetaDataAudio.getDurationLastFrameString1AsBoolean());
    }

   /**
    * Test getDurationLastFrameString1AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationLastFrameString1AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameString1AsBigInteger());
        System.out.println("Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS BigInteger === " + jMetaDataAudio.getDurationLastFrameString1AsBigInteger());
    }

   /**
    * Test getDurationLastFrameString1AsURL() method.
    */
    @Test
    public void subTestGetDurationLastFrameString1AsURL() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameString1AsURL());
        System.out.println("Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS URL === " + jMetaDataAudio.getDurationLastFrameString1AsURL());
    }

   /**
    * Test getDelayOriginalStringAsInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalStringAsInteger());
        System.out.println("Delay with measurement AS Integer === " + jMetaDataAudio.getDelayOriginalStringAsInteger());
    }

   /**
    * Test getDelayOriginalStringAsLong() method.
    */
    @Test
    public void subTestGetDelayOriginalStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalStringAsLong());
        System.out.println("Delay with measurement AS Long === " + jMetaDataAudio.getDelayOriginalStringAsLong());
    }

   /**
    * Test getDelayOriginalStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayOriginalStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalStringAsLocalDateTime());
        System.out.println("Delay with measurement AS LocalDateTime === " + jMetaDataAudio.getDelayOriginalStringAsLocalDateTime());
    }

   /**
    * Test getDelayOriginalStringAsLocalTime() method.
    */
    @Test
    public void subTestGetDelayOriginalStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalStringAsLocalTime());
        System.out.println("Delay with measurement AS LocalTime === " + jMetaDataAudio.getDelayOriginalStringAsLocalTime());
    }

   /**
    * Test getDelayOriginalStringAsString() method.
    */
    @Test
    public void subTestGetDelayOriginalStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalStringAsString());
        System.out.println("Delay with measurement AS String === " + jMetaDataAudio.getDelayOriginalStringAsString());
    }

   /**
    * Test getDelayOriginalStringAsBoolean() method.
    */
    @Test
    public void subTestGetDelayOriginalStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalStringAsBoolean());
        System.out.println("Delay with measurement AS Boolean === " + jMetaDataAudio.getDelayOriginalStringAsBoolean());
    }

   /**
    * Test getDelayOriginalStringAsBigInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalStringAsBigInteger());
        System.out.println("Delay with measurement AS BigInteger === " + jMetaDataAudio.getDelayOriginalStringAsBigInteger());
    }

   /**
    * Test getDelayOriginalStringAsURL() method.
    */
    @Test
    public void subTestGetDelayOriginalStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getDelayOriginalStringAsURL());
        System.out.println("Delay with measurement AS URL === " + jMetaDataAudio.getDelayOriginalStringAsURL());
    }

   /**
    * Test getDurationLastFrameString3AsInteger() method.
    */
    @Test
    public void subTestGetDurationLastFrameString3AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameString3AsInteger());
        System.out.println("Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM AS Integer === " + jMetaDataAudio.getDurationLastFrameString3AsInteger());
    }

   /**
    * Test getDurationLastFrameString3AsLong() method.
    */
    @Test
    public void subTestGetDurationLastFrameString3AsLong() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameString3AsLong());
        System.out.println("Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM AS Long === " + jMetaDataAudio.getDurationLastFrameString3AsLong());
    }

   /**
    * Test getDurationLastFrameString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationLastFrameString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameString3AsLocalDateTime());
        System.out.println("Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM AS LocalDateTime === " + jMetaDataAudio.getDurationLastFrameString3AsLocalDateTime());
    }

   /**
    * Test getDurationLastFrameString3AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationLastFrameString3AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameString3AsLocalTime());
        System.out.println("Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM AS LocalTime === " + jMetaDataAudio.getDurationLastFrameString3AsLocalTime());
    }

   /**
    * Test getDurationLastFrameString3AsString() method.
    */
    @Test
    public void subTestGetDurationLastFrameString3AsString() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameString3AsString());
        System.out.println("Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM AS String === " + jMetaDataAudio.getDurationLastFrameString3AsString());
    }

   /**
    * Test getDurationLastFrameString3AsBoolean() method.
    */
    @Test
    public void subTestGetDurationLastFrameString3AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameString3AsBoolean());
        System.out.println("Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM AS Boolean === " + jMetaDataAudio.getDurationLastFrameString3AsBoolean());
    }

   /**
    * Test getDurationLastFrameString3AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationLastFrameString3AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameString3AsBigInteger());
        System.out.println("Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM AS BigInteger === " + jMetaDataAudio.getDurationLastFrameString3AsBigInteger());
    }

   /**
    * Test getDurationLastFrameString3AsURL() method.
    */
    @Test
    public void subTestGetDurationLastFrameString3AsURL() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameString3AsURL());
        System.out.println("Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM AS URL === " + jMetaDataAudio.getDurationLastFrameString3AsURL());
    }

   /**
    * Test getDurationLastFrameString2AsInteger() method.
    */
    @Test
    public void subTestGetDurationLastFrameString2AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameString2AsInteger());
        System.out.println("Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Integer === " + jMetaDataAudio.getDurationLastFrameString2AsInteger());
    }

   /**
    * Test getDurationLastFrameString2AsLong() method.
    */
    @Test
    public void subTestGetDurationLastFrameString2AsLong() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameString2AsLong());
        System.out.println("Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Long === " + jMetaDataAudio.getDurationLastFrameString2AsLong());
    }

   /**
    * Test getDurationLastFrameString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationLastFrameString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameString2AsLocalDateTime());
        System.out.println("Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS LocalDateTime === " + jMetaDataAudio.getDurationLastFrameString2AsLocalDateTime());
    }

   /**
    * Test getDurationLastFrameString2AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationLastFrameString2AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameString2AsLocalTime());
        System.out.println("Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS LocalTime === " + jMetaDataAudio.getDurationLastFrameString2AsLocalTime());
    }

   /**
    * Test getDurationLastFrameString2AsString() method.
    */
    @Test
    public void subTestGetDurationLastFrameString2AsString() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameString2AsString());
        System.out.println("Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS String === " + jMetaDataAudio.getDurationLastFrameString2AsString());
    }

   /**
    * Test getDurationLastFrameString2AsBoolean() method.
    */
    @Test
    public void subTestGetDurationLastFrameString2AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameString2AsBoolean());
        System.out.println("Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Boolean === " + jMetaDataAudio.getDurationLastFrameString2AsBoolean());
    }

   /**
    * Test getDurationLastFrameString2AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationLastFrameString2AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameString2AsBigInteger());
        System.out.println("Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS BigInteger === " + jMetaDataAudio.getDurationLastFrameString2AsBigInteger());
    }

   /**
    * Test getDurationLastFrameString2AsURL() method.
    */
    @Test
    public void subTestGetDurationLastFrameString2AsURL() {
        assertEquals(null, this.jMetaDataAudio.getDurationLastFrameString2AsURL());
        System.out.println("Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS URL === " + jMetaDataAudio.getDurationLastFrameString2AsURL());
    }

   /**
    * Test getStreamSizeDemuxedAsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedAsInteger());
        System.out.println("StreamSize in bytes of hte stream after demux AS Integer === " + jMetaDataAudio.getStreamSizeDemuxedAsInteger());
    }

   /**
    * Test getStreamSizeDemuxedAsLong() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedAsLong() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedAsLong());
        System.out.println("StreamSize in bytes of hte stream after demux AS Long === " + jMetaDataAudio.getStreamSizeDemuxedAsLong());
    }

   /**
    * Test getStreamSizeDemuxedAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedAsLocalDateTime());
        System.out.println("StreamSize in bytes of hte stream after demux AS LocalDateTime === " + jMetaDataAudio.getStreamSizeDemuxedAsLocalDateTime());
    }

   /**
    * Test getStreamSizeDemuxedAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedAsLocalTime());
        System.out.println("StreamSize in bytes of hte stream after demux AS LocalTime === " + jMetaDataAudio.getStreamSizeDemuxedAsLocalTime());
    }

   /**
    * Test getStreamSizeDemuxedAsString() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedAsString() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedAsString());
        System.out.println("StreamSize in bytes of hte stream after demux AS String === " + jMetaDataAudio.getStreamSizeDemuxedAsString());
    }

   /**
    * Test getStreamSizeDemuxedAsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedAsBoolean());
        System.out.println("StreamSize in bytes of hte stream after demux AS Boolean === " + jMetaDataAudio.getStreamSizeDemuxedAsBoolean());
    }

   /**
    * Test getStreamSizeDemuxedAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedAsBigInteger());
        System.out.println("StreamSize in bytes of hte stream after demux AS BigInteger === " + jMetaDataAudio.getStreamSizeDemuxedAsBigInteger());
    }

   /**
    * Test getStreamSizeDemuxedAsURL() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedAsURL() {
        assertEquals(null, this.jMetaDataAudio.getStreamSizeDemuxedAsURL());
        System.out.println("StreamSize in bytes of hte stream after demux AS URL === " + jMetaDataAudio.getStreamSizeDemuxedAsURL());
    }

   /**
    * Test getFormatSettingsAsInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsAsInteger());
        System.out.println("Settings needed for decoder used, summary AS Integer === " + jMetaDataAudio.getFormatSettingsAsInteger());
    }

   /**
    * Test getFormatSettingsAsLong() method.
    */
    @Test
    public void subTestGetFormatSettingsAsLong() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsAsLong());
        System.out.println("Settings needed for decoder used, summary AS Long === " + jMetaDataAudio.getFormatSettingsAsLong());
    }

   /**
    * Test getFormatSettingsAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatSettingsAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsAsLocalDateTime());
        System.out.println("Settings needed for decoder used, summary AS LocalDateTime === " + jMetaDataAudio.getFormatSettingsAsLocalDateTime());
    }

   /**
    * Test getFormatSettingsAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatSettingsAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsAsLocalTime());
        System.out.println("Settings needed for decoder used, summary AS LocalTime === " + jMetaDataAudio.getFormatSettingsAsLocalTime());
    }

   /**
    * Test getFormatSettingsAsString() method.
    */
    @Test
    public void subTestGetFormatSettingsAsString() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsAsString());
        System.out.println("Settings needed for decoder used, summary AS String === " + jMetaDataAudio.getFormatSettingsAsString());
    }

   /**
    * Test getFormatSettingsAsBoolean() method.
    */
    @Test
    public void subTestGetFormatSettingsAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsAsBoolean());
        System.out.println("Settings needed for decoder used, summary AS Boolean === " + jMetaDataAudio.getFormatSettingsAsBoolean());
    }

   /**
    * Test getFormatSettingsAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsAsBigInteger());
        System.out.println("Settings needed for decoder used, summary AS BigInteger === " + jMetaDataAudio.getFormatSettingsAsBigInteger());
    }

   /**
    * Test getFormatSettingsAsURL() method.
    */
    @Test
    public void subTestGetFormatSettingsAsURL() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsAsURL());
        System.out.println("Settings needed for decoder used, summary AS URL === " + jMetaDataAudio.getFormatSettingsAsURL());
    }

   /**
    * Test getServiceKindAsInteger() method.
    */
    @Test
    public void subTestGetServiceKindAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getServiceKindAsInteger());
        System.out.println("Service kind, e.g. visually impaired, commentary, voice over AS Integer === " + jMetaDataAudio.getServiceKindAsInteger());
    }

   /**
    * Test getServiceKindAsLong() method.
    */
    @Test
    public void subTestGetServiceKindAsLong() {
        assertEquals(null, this.jMetaDataAudio.getServiceKindAsLong());
        System.out.println("Service kind, e.g. visually impaired, commentary, voice over AS Long === " + jMetaDataAudio.getServiceKindAsLong());
    }

   /**
    * Test getServiceKindAsLocalDateTime() method.
    */
    @Test
    public void subTestGetServiceKindAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getServiceKindAsLocalDateTime());
        System.out.println("Service kind, e.g. visually impaired, commentary, voice over AS LocalDateTime === " + jMetaDataAudio.getServiceKindAsLocalDateTime());
    }

   /**
    * Test getServiceKindAsLocalTime() method.
    */
    @Test
    public void subTestGetServiceKindAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getServiceKindAsLocalTime());
        System.out.println("Service kind, e.g. visually impaired, commentary, voice over AS LocalTime === " + jMetaDataAudio.getServiceKindAsLocalTime());
    }

   /**
    * Test getServiceKindAsString() method.
    */
    @Test
    public void subTestGetServiceKindAsString() {
        assertEquals(null, this.jMetaDataAudio.getServiceKindAsString());
        System.out.println("Service kind, e.g. visually impaired, commentary, voice over AS String === " + jMetaDataAudio.getServiceKindAsString());
    }

   /**
    * Test getServiceKindAsBoolean() method.
    */
    @Test
    public void subTestGetServiceKindAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getServiceKindAsBoolean());
        System.out.println("Service kind, e.g. visually impaired, commentary, voice over AS Boolean === " + jMetaDataAudio.getServiceKindAsBoolean());
    }

   /**
    * Test getServiceKindAsBigInteger() method.
    */
    @Test
    public void subTestGetServiceKindAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getServiceKindAsBigInteger());
        System.out.println("Service kind, e.g. visually impaired, commentary, voice over AS BigInteger === " + jMetaDataAudio.getServiceKindAsBigInteger());
    }

   /**
    * Test getServiceKindAsURL() method.
    */
    @Test
    public void subTestGetServiceKindAsURL() {
        assertEquals(null, this.jMetaDataAudio.getServiceKindAsURL());
        System.out.println("Service kind, e.g. visually impaired, commentary, voice over AS URL === " + jMetaDataAudio.getServiceKindAsURL());
    }

   /**
    * Test getFirstPacketOrderAsInteger() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getFirstPacketOrderAsInteger());
        System.out.println("Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0) AS Integer === " + jMetaDataAudio.getFirstPacketOrderAsInteger());
    }

   /**
    * Test getFirstPacketOrderAsLong() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsLong() {
        assertEquals(null, this.jMetaDataAudio.getFirstPacketOrderAsLong());
        System.out.println("Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0) AS Long === " + jMetaDataAudio.getFirstPacketOrderAsLong());
    }

   /**
    * Test getFirstPacketOrderAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getFirstPacketOrderAsLocalDateTime());
        System.out.println("Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0) AS LocalDateTime === " + jMetaDataAudio.getFirstPacketOrderAsLocalDateTime());
    }

   /**
    * Test getFirstPacketOrderAsLocalTime() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getFirstPacketOrderAsLocalTime());
        System.out.println("Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0) AS LocalTime === " + jMetaDataAudio.getFirstPacketOrderAsLocalTime());
    }

   /**
    * Test getFirstPacketOrderAsString() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsString() {
        assertEquals(null, this.jMetaDataAudio.getFirstPacketOrderAsString());
        System.out.println("Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0) AS String === " + jMetaDataAudio.getFirstPacketOrderAsString());
    }

   /**
    * Test getFirstPacketOrderAsBoolean() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getFirstPacketOrderAsBoolean());
        System.out.println("Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0) AS Boolean === " + jMetaDataAudio.getFirstPacketOrderAsBoolean());
    }

   /**
    * Test getFirstPacketOrderAsBigInteger() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getFirstPacketOrderAsBigInteger());
        System.out.println("Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0) AS BigInteger === " + jMetaDataAudio.getFirstPacketOrderAsBigInteger());
    }

   /**
    * Test getFirstPacketOrderAsURL() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsURL() {
        assertEquals(null, this.jMetaDataAudio.getFirstPacketOrderAsURL());
        System.out.println("Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0) AS URL === " + jMetaDataAudio.getFirstPacketOrderAsURL());
    }

   /**
    * Test getChannelsAsInteger() method.
    */
    @Test
    public void subTestGetChannelsAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getChannelsAsInteger());
        System.out.println("Number of channels AS Integer === " + jMetaDataAudio.getChannelsAsInteger());
    }

   /**
    * Test getChannelsAsLong() method.
    */
    @Test
    public void subTestGetChannelsAsLong() {
        assertEquals(null, this.jMetaDataAudio.getChannelsAsLong());
        System.out.println("Number of channels AS Long === " + jMetaDataAudio.getChannelsAsLong());
    }

   /**
    * Test getChannelsAsLocalDateTime() method.
    */
    @Test
    public void subTestGetChannelsAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getChannelsAsLocalDateTime());
        System.out.println("Number of channels AS LocalDateTime === " + jMetaDataAudio.getChannelsAsLocalDateTime());
    }

   /**
    * Test getChannelsAsLocalTime() method.
    */
    @Test
    public void subTestGetChannelsAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getChannelsAsLocalTime());
        System.out.println("Number of channels AS LocalTime === " + jMetaDataAudio.getChannelsAsLocalTime());
    }

   /**
    * Test getChannelsAsString() method.
    */
    @Test
    public void subTestGetChannelsAsString() {
        assertEquals(null, this.jMetaDataAudio.getChannelsAsString());
        System.out.println("Number of channels AS String === " + jMetaDataAudio.getChannelsAsString());
    }

   /**
    * Test getChannelsAsBoolean() method.
    */
    @Test
    public void subTestGetChannelsAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getChannelsAsBoolean());
        System.out.println("Number of channels AS Boolean === " + jMetaDataAudio.getChannelsAsBoolean());
    }

   /**
    * Test getChannelsAsBigInteger() method.
    */
    @Test
    public void subTestGetChannelsAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getChannelsAsBigInteger());
        System.out.println("Number of channels AS BigInteger === " + jMetaDataAudio.getChannelsAsBigInteger());
    }

   /**
    * Test getChannelsAsURL() method.
    */
    @Test
    public void subTestGetChannelsAsURL() {
        assertEquals(null, this.jMetaDataAudio.getChannelsAsURL());
        System.out.println("Number of channels AS URL === " + jMetaDataAudio.getChannelsAsURL());
    }

   /**
    * Test getFormatSettingsEndiannessAsInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsEndiannessAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsEndiannessAsInteger());
        System.out.println("Format_Settings_Endianness AS Integer === " + jMetaDataAudio.getFormatSettingsEndiannessAsInteger());
    }

   /**
    * Test getFormatSettingsEndiannessAsLong() method.
    */
    @Test
    public void subTestGetFormatSettingsEndiannessAsLong() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsEndiannessAsLong());
        System.out.println("Format_Settings_Endianness AS Long === " + jMetaDataAudio.getFormatSettingsEndiannessAsLong());
    }

   /**
    * Test getFormatSettingsEndiannessAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatSettingsEndiannessAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsEndiannessAsLocalDateTime());
        System.out.println("Format_Settings_Endianness AS LocalDateTime === " + jMetaDataAudio.getFormatSettingsEndiannessAsLocalDateTime());
    }

   /**
    * Test getFormatSettingsEndiannessAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatSettingsEndiannessAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsEndiannessAsLocalTime());
        System.out.println("Format_Settings_Endianness AS LocalTime === " + jMetaDataAudio.getFormatSettingsEndiannessAsLocalTime());
    }

   /**
    * Test getFormatSettingsEndiannessAsString() method.
    */
    @Test
    public void subTestGetFormatSettingsEndiannessAsString() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsEndiannessAsString());
        System.out.println("Format_Settings_Endianness AS String === " + jMetaDataAudio.getFormatSettingsEndiannessAsString());
    }

   /**
    * Test getFormatSettingsEndiannessAsBoolean() method.
    */
    @Test
    public void subTestGetFormatSettingsEndiannessAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsEndiannessAsBoolean());
        System.out.println("Format_Settings_Endianness AS Boolean === " + jMetaDataAudio.getFormatSettingsEndiannessAsBoolean());
    }

   /**
    * Test getFormatSettingsEndiannessAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsEndiannessAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsEndiannessAsBigInteger());
        System.out.println("Format_Settings_Endianness AS BigInteger === " + jMetaDataAudio.getFormatSettingsEndiannessAsBigInteger());
    }

   /**
    * Test getFormatSettingsEndiannessAsURL() method.
    */
    @Test
    public void subTestGetFormatSettingsEndiannessAsURL() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsEndiannessAsURL());
        System.out.println("Format_Settings_Endianness AS URL === " + jMetaDataAudio.getFormatSettingsEndiannessAsURL());
    }

   /**
    * Test getVideoDelayString5AsInteger() method.
    */
    @Test
    public void subTestGetVideoDelayString5AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayString5AsInteger());
        System.out.println("Video_Delay/String5 AS Integer === " + jMetaDataAudio.getVideoDelayString5AsInteger());
    }

   /**
    * Test getVideoDelayString5AsLong() method.
    */
    @Test
    public void subTestGetVideoDelayString5AsLong() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayString5AsLong());
        System.out.println("Video_Delay/String5 AS Long === " + jMetaDataAudio.getVideoDelayString5AsLong());
    }

   /**
    * Test getVideoDelayString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetVideoDelayString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayString5AsLocalDateTime());
        System.out.println("Video_Delay/String5 AS LocalDateTime === " + jMetaDataAudio.getVideoDelayString5AsLocalDateTime());
    }

   /**
    * Test getVideoDelayString5AsLocalTime() method.
    */
    @Test
    public void subTestGetVideoDelayString5AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayString5AsLocalTime());
        System.out.println("Video_Delay/String5 AS LocalTime === " + jMetaDataAudio.getVideoDelayString5AsLocalTime());
    }

   /**
    * Test getVideoDelayString5AsString() method.
    */
    @Test
    public void subTestGetVideoDelayString5AsString() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayString5AsString());
        System.out.println("Video_Delay/String5 AS String === " + jMetaDataAudio.getVideoDelayString5AsString());
    }

   /**
    * Test getVideoDelayString5AsBoolean() method.
    */
    @Test
    public void subTestGetVideoDelayString5AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayString5AsBoolean());
        System.out.println("Video_Delay/String5 AS Boolean === " + jMetaDataAudio.getVideoDelayString5AsBoolean());
    }

   /**
    * Test getVideoDelayString5AsBigInteger() method.
    */
    @Test
    public void subTestGetVideoDelayString5AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayString5AsBigInteger());
        System.out.println("Video_Delay/String5 AS BigInteger === " + jMetaDataAudio.getVideoDelayString5AsBigInteger());
    }

   /**
    * Test getVideoDelayString5AsURL() method.
    */
    @Test
    public void subTestGetVideoDelayString5AsURL() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayString5AsURL());
        System.out.println("Video_Delay/String5 AS URL === " + jMetaDataAudio.getVideoDelayString5AsURL());
    }

   /**
    * Test getVideoDelayString1AsInteger() method.
    */
    @Test
    public void subTestGetVideoDelayString1AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayString1AsInteger());
        System.out.println("Video_Delay/String1 AS Integer === " + jMetaDataAudio.getVideoDelayString1AsInteger());
    }

   /**
    * Test getVideoDelayString1AsLong() method.
    */
    @Test
    public void subTestGetVideoDelayString1AsLong() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayString1AsLong());
        System.out.println("Video_Delay/String1 AS Long === " + jMetaDataAudio.getVideoDelayString1AsLong());
    }

   /**
    * Test getVideoDelayString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetVideoDelayString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayString1AsLocalDateTime());
        System.out.println("Video_Delay/String1 AS LocalDateTime === " + jMetaDataAudio.getVideoDelayString1AsLocalDateTime());
    }

   /**
    * Test getVideoDelayString1AsLocalTime() method.
    */
    @Test
    public void subTestGetVideoDelayString1AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayString1AsLocalTime());
        System.out.println("Video_Delay/String1 AS LocalTime === " + jMetaDataAudio.getVideoDelayString1AsLocalTime());
    }

   /**
    * Test getVideoDelayString1AsString() method.
    */
    @Test
    public void subTestGetVideoDelayString1AsString() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayString1AsString());
        System.out.println("Video_Delay/String1 AS String === " + jMetaDataAudio.getVideoDelayString1AsString());
    }

   /**
    * Test getVideoDelayString1AsBoolean() method.
    */
    @Test
    public void subTestGetVideoDelayString1AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayString1AsBoolean());
        System.out.println("Video_Delay/String1 AS Boolean === " + jMetaDataAudio.getVideoDelayString1AsBoolean());
    }

   /**
    * Test getVideoDelayString1AsBigInteger() method.
    */
    @Test
    public void subTestGetVideoDelayString1AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayString1AsBigInteger());
        System.out.println("Video_Delay/String1 AS BigInteger === " + jMetaDataAudio.getVideoDelayString1AsBigInteger());
    }

   /**
    * Test getVideoDelayString1AsURL() method.
    */
    @Test
    public void subTestGetVideoDelayString1AsURL() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayString1AsURL());
        System.out.println("Video_Delay/String1 AS URL === " + jMetaDataAudio.getVideoDelayString1AsURL());
    }

   /**
    * Test getVideoDelayString2AsInteger() method.
    */
    @Test
    public void subTestGetVideoDelayString2AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayString2AsInteger());
        System.out.println("Video_Delay/String2 AS Integer === " + jMetaDataAudio.getVideoDelayString2AsInteger());
    }

   /**
    * Test getVideoDelayString2AsLong() method.
    */
    @Test
    public void subTestGetVideoDelayString2AsLong() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayString2AsLong());
        System.out.println("Video_Delay/String2 AS Long === " + jMetaDataAudio.getVideoDelayString2AsLong());
    }

   /**
    * Test getVideoDelayString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetVideoDelayString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayString2AsLocalDateTime());
        System.out.println("Video_Delay/String2 AS LocalDateTime === " + jMetaDataAudio.getVideoDelayString2AsLocalDateTime());
    }

   /**
    * Test getVideoDelayString2AsLocalTime() method.
    */
    @Test
    public void subTestGetVideoDelayString2AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayString2AsLocalTime());
        System.out.println("Video_Delay/String2 AS LocalTime === " + jMetaDataAudio.getVideoDelayString2AsLocalTime());
    }

   /**
    * Test getVideoDelayString2AsString() method.
    */
    @Test
    public void subTestGetVideoDelayString2AsString() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayString2AsString());
        System.out.println("Video_Delay/String2 AS String === " + jMetaDataAudio.getVideoDelayString2AsString());
    }

   /**
    * Test getVideoDelayString2AsBoolean() method.
    */
    @Test
    public void subTestGetVideoDelayString2AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayString2AsBoolean());
        System.out.println("Video_Delay/String2 AS Boolean === " + jMetaDataAudio.getVideoDelayString2AsBoolean());
    }

   /**
    * Test getVideoDelayString2AsBigInteger() method.
    */
    @Test
    public void subTestGetVideoDelayString2AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayString2AsBigInteger());
        System.out.println("Video_Delay/String2 AS BigInteger === " + jMetaDataAudio.getVideoDelayString2AsBigInteger());
    }

   /**
    * Test getVideoDelayString2AsURL() method.
    */
    @Test
    public void subTestGetVideoDelayString2AsURL() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayString2AsURL());
        System.out.println("Video_Delay/String2 AS URL === " + jMetaDataAudio.getVideoDelayString2AsURL());
    }

   /**
    * Test getVideoDelayString3AsInteger() method.
    */
    @Test
    public void subTestGetVideoDelayString3AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayString3AsInteger());
        System.out.println("Video_Delay/String3 AS Integer === " + jMetaDataAudio.getVideoDelayString3AsInteger());
    }

   /**
    * Test getVideoDelayString3AsLong() method.
    */
    @Test
    public void subTestGetVideoDelayString3AsLong() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayString3AsLong());
        System.out.println("Video_Delay/String3 AS Long === " + jMetaDataAudio.getVideoDelayString3AsLong());
    }

   /**
    * Test getVideoDelayString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetVideoDelayString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayString3AsLocalDateTime());
        System.out.println("Video_Delay/String3 AS LocalDateTime === " + jMetaDataAudio.getVideoDelayString3AsLocalDateTime());
    }

   /**
    * Test getVideoDelayString3AsLocalTime() method.
    */
    @Test
    public void subTestGetVideoDelayString3AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayString3AsLocalTime());
        System.out.println("Video_Delay/String3 AS LocalTime === " + jMetaDataAudio.getVideoDelayString3AsLocalTime());
    }

   /**
    * Test getVideoDelayString3AsString() method.
    */
    @Test
    public void subTestGetVideoDelayString3AsString() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayString3AsString());
        System.out.println("Video_Delay/String3 AS String === " + jMetaDataAudio.getVideoDelayString3AsString());
    }

   /**
    * Test getVideoDelayString3AsBoolean() method.
    */
    @Test
    public void subTestGetVideoDelayString3AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayString3AsBoolean());
        System.out.println("Video_Delay/String3 AS Boolean === " + jMetaDataAudio.getVideoDelayString3AsBoolean());
    }

   /**
    * Test getVideoDelayString3AsBigInteger() method.
    */
    @Test
    public void subTestGetVideoDelayString3AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayString3AsBigInteger());
        System.out.println("Video_Delay/String3 AS BigInteger === " + jMetaDataAudio.getVideoDelayString3AsBigInteger());
    }

   /**
    * Test getVideoDelayString3AsURL() method.
    */
    @Test
    public void subTestGetVideoDelayString3AsURL() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayString3AsURL());
        System.out.println("Video_Delay/String3 AS URL === " + jMetaDataAudio.getVideoDelayString3AsURL());
    }

   /**
    * Test getVideoDelayString4AsInteger() method.
    */
    @Test
    public void subTestGetVideoDelayString4AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayString4AsInteger());
        System.out.println("Video_Delay/String4 AS Integer === " + jMetaDataAudio.getVideoDelayString4AsInteger());
    }

   /**
    * Test getVideoDelayString4AsLong() method.
    */
    @Test
    public void subTestGetVideoDelayString4AsLong() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayString4AsLong());
        System.out.println("Video_Delay/String4 AS Long === " + jMetaDataAudio.getVideoDelayString4AsLong());
    }

   /**
    * Test getVideoDelayString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetVideoDelayString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayString4AsLocalDateTime());
        System.out.println("Video_Delay/String4 AS LocalDateTime === " + jMetaDataAudio.getVideoDelayString4AsLocalDateTime());
    }

   /**
    * Test getVideoDelayString4AsLocalTime() method.
    */
    @Test
    public void subTestGetVideoDelayString4AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayString4AsLocalTime());
        System.out.println("Video_Delay/String4 AS LocalTime === " + jMetaDataAudio.getVideoDelayString4AsLocalTime());
    }

   /**
    * Test getVideoDelayString4AsString() method.
    */
    @Test
    public void subTestGetVideoDelayString4AsString() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayString4AsString());
        System.out.println("Video_Delay/String4 AS String === " + jMetaDataAudio.getVideoDelayString4AsString());
    }

   /**
    * Test getVideoDelayString4AsBoolean() method.
    */
    @Test
    public void subTestGetVideoDelayString4AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayString4AsBoolean());
        System.out.println("Video_Delay/String4 AS Boolean === " + jMetaDataAudio.getVideoDelayString4AsBoolean());
    }

   /**
    * Test getVideoDelayString4AsBigInteger() method.
    */
    @Test
    public void subTestGetVideoDelayString4AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayString4AsBigInteger());
        System.out.println("Video_Delay/String4 AS BigInteger === " + jMetaDataAudio.getVideoDelayString4AsBigInteger());
    }

   /**
    * Test getVideoDelayString4AsURL() method.
    */
    @Test
    public void subTestGetVideoDelayString4AsURL() {
        assertEquals(null, this.jMetaDataAudio.getVideoDelayString4AsURL());
        System.out.println("Video_Delay/String4 AS URL === " + jMetaDataAudio.getVideoDelayString4AsURL());
    }

   /**
    * Test getBitRateNominalStringAsInteger() method.
    */
    @Test
    public void subTestGetBitRateNominalStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getBitRateNominalStringAsInteger());
        System.out.println("Nominal Bit rate (with measurement) AS Integer === " + jMetaDataAudio.getBitRateNominalStringAsInteger());
    }

   /**
    * Test getBitRateNominalStringAsLong() method.
    */
    @Test
    public void subTestGetBitRateNominalStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getBitRateNominalStringAsLong());
        System.out.println("Nominal Bit rate (with measurement) AS Long === " + jMetaDataAudio.getBitRateNominalStringAsLong());
    }

   /**
    * Test getBitRateNominalStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitRateNominalStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getBitRateNominalStringAsLocalDateTime());
        System.out.println("Nominal Bit rate (with measurement) AS LocalDateTime === " + jMetaDataAudio.getBitRateNominalStringAsLocalDateTime());
    }

   /**
    * Test getBitRateNominalStringAsLocalTime() method.
    */
    @Test
    public void subTestGetBitRateNominalStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getBitRateNominalStringAsLocalTime());
        System.out.println("Nominal Bit rate (with measurement) AS LocalTime === " + jMetaDataAudio.getBitRateNominalStringAsLocalTime());
    }

   /**
    * Test getBitRateNominalStringAsString() method.
    */
    @Test
    public void subTestGetBitRateNominalStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getBitRateNominalStringAsString());
        System.out.println("Nominal Bit rate (with measurement) AS String === " + jMetaDataAudio.getBitRateNominalStringAsString());
    }

   /**
    * Test getBitRateNominalStringAsBoolean() method.
    */
    @Test
    public void subTestGetBitRateNominalStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getBitRateNominalStringAsBoolean());
        System.out.println("Nominal Bit rate (with measurement) AS Boolean === " + jMetaDataAudio.getBitRateNominalStringAsBoolean());
    }

   /**
    * Test getBitRateNominalStringAsBigInteger() method.
    */
    @Test
    public void subTestGetBitRateNominalStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getBitRateNominalStringAsBigInteger());
        System.out.println("Nominal Bit rate (with measurement) AS BigInteger === " + jMetaDataAudio.getBitRateNominalStringAsBigInteger());
    }

   /**
    * Test getBitRateNominalStringAsURL() method.
    */
    @Test
    public void subTestGetBitRateNominalStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getBitRateNominalStringAsURL());
        System.out.println("Nominal Bit rate (with measurement) AS URL === " + jMetaDataAudio.getBitRateNominalStringAsURL());
    }

   /**
    * Test getBitDepthDetectedStringAsInteger() method.
    */
    @Test
    public void subTestGetBitDepthDetectedStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthDetectedStringAsInteger());
        System.out.println("Detected (during scan of the input by the muxer) resolution in bits AS Integer === " + jMetaDataAudio.getBitDepthDetectedStringAsInteger());
    }

   /**
    * Test getBitDepthDetectedStringAsLong() method.
    */
    @Test
    public void subTestGetBitDepthDetectedStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthDetectedStringAsLong());
        System.out.println("Detected (during scan of the input by the muxer) resolution in bits AS Long === " + jMetaDataAudio.getBitDepthDetectedStringAsLong());
    }

   /**
    * Test getBitDepthDetectedStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitDepthDetectedStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthDetectedStringAsLocalDateTime());
        System.out.println("Detected (during scan of the input by the muxer) resolution in bits AS LocalDateTime === " + jMetaDataAudio.getBitDepthDetectedStringAsLocalDateTime());
    }

   /**
    * Test getBitDepthDetectedStringAsLocalTime() method.
    */
    @Test
    public void subTestGetBitDepthDetectedStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthDetectedStringAsLocalTime());
        System.out.println("Detected (during scan of the input by the muxer) resolution in bits AS LocalTime === " + jMetaDataAudio.getBitDepthDetectedStringAsLocalTime());
    }

   /**
    * Test getBitDepthDetectedStringAsString() method.
    */
    @Test
    public void subTestGetBitDepthDetectedStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthDetectedStringAsString());
        System.out.println("Detected (during scan of the input by the muxer) resolution in bits AS String === " + jMetaDataAudio.getBitDepthDetectedStringAsString());
    }

   /**
    * Test getBitDepthDetectedStringAsBoolean() method.
    */
    @Test
    public void subTestGetBitDepthDetectedStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthDetectedStringAsBoolean());
        System.out.println("Detected (during scan of the input by the muxer) resolution in bits AS Boolean === " + jMetaDataAudio.getBitDepthDetectedStringAsBoolean());
    }

   /**
    * Test getBitDepthDetectedStringAsBigInteger() method.
    */
    @Test
    public void subTestGetBitDepthDetectedStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthDetectedStringAsBigInteger());
        System.out.println("Detected (during scan of the input by the muxer) resolution in bits AS BigInteger === " + jMetaDataAudio.getBitDepthDetectedStringAsBigInteger());
    }

   /**
    * Test getBitDepthDetectedStringAsURL() method.
    */
    @Test
    public void subTestGetBitDepthDetectedStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthDetectedStringAsURL());
        System.out.println("Detected (during scan of the input by the muxer) resolution in bits AS URL === " + jMetaDataAudio.getBitDepthDetectedStringAsURL());
    }

   /**
    * Test getFormatAsInteger() method.
    */
    @Test
    public void subTestGetFormatAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatAsInteger());
        System.out.println("Format used AS Integer === " + jMetaDataAudio.getFormatAsInteger());
    }

   /**
    * Test getFormatAsLong() method.
    */
    @Test
    public void subTestGetFormatAsLong() {
        assertEquals(null, this.jMetaDataAudio.getFormatAsLong());
        System.out.println("Format used AS Long === " + jMetaDataAudio.getFormatAsLong());
    }

   /**
    * Test getFormatAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatAsLocalDateTime());
        System.out.println("Format used AS LocalDateTime === " + jMetaDataAudio.getFormatAsLocalDateTime());
    }

   /**
    * Test getFormatAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatAsLocalTime());
        System.out.println("Format used AS LocalTime === " + jMetaDataAudio.getFormatAsLocalTime());
    }

   /**
    * Test getFormatAsString() method.
    */
    @Test
    public void subTestGetFormatAsString() {
        assertEquals(null, this.jMetaDataAudio.getFormatAsString());
        System.out.println("Format used AS String === " + jMetaDataAudio.getFormatAsString());
    }

   /**
    * Test getFormatAsBoolean() method.
    */
    @Test
    public void subTestGetFormatAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getFormatAsBoolean());
        System.out.println("Format used AS Boolean === " + jMetaDataAudio.getFormatAsBoolean());
    }

   /**
    * Test getFormatAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatAsBigInteger());
        System.out.println("Format used AS BigInteger === " + jMetaDataAudio.getFormatAsBigInteger());
    }

   /**
    * Test getFormatAsURL() method.
    */
    @Test
    public void subTestGetFormatAsURL() {
        assertEquals(null, this.jMetaDataAudio.getFormatAsURL());
        System.out.println("Format used AS URL === " + jMetaDataAudio.getFormatAsURL());
    }

   /**
    * Test getBitDepthStoredAsInteger() method.
    */
    @Test
    public void subTestGetBitDepthStoredAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthStoredAsInteger());
        System.out.println("Stored Resolution in bits (8, 16, 20, 24) AS Integer === " + jMetaDataAudio.getBitDepthStoredAsInteger());
    }

   /**
    * Test getBitDepthStoredAsLong() method.
    */
    @Test
    public void subTestGetBitDepthStoredAsLong() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthStoredAsLong());
        System.out.println("Stored Resolution in bits (8, 16, 20, 24) AS Long === " + jMetaDataAudio.getBitDepthStoredAsLong());
    }

   /**
    * Test getBitDepthStoredAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitDepthStoredAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthStoredAsLocalDateTime());
        System.out.println("Stored Resolution in bits (8, 16, 20, 24) AS LocalDateTime === " + jMetaDataAudio.getBitDepthStoredAsLocalDateTime());
    }

   /**
    * Test getBitDepthStoredAsLocalTime() method.
    */
    @Test
    public void subTestGetBitDepthStoredAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthStoredAsLocalTime());
        System.out.println("Stored Resolution in bits (8, 16, 20, 24) AS LocalTime === " + jMetaDataAudio.getBitDepthStoredAsLocalTime());
    }

   /**
    * Test getBitDepthStoredAsString() method.
    */
    @Test
    public void subTestGetBitDepthStoredAsString() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthStoredAsString());
        System.out.println("Stored Resolution in bits (8, 16, 20, 24) AS String === " + jMetaDataAudio.getBitDepthStoredAsString());
    }

   /**
    * Test getBitDepthStoredAsBoolean() method.
    */
    @Test
    public void subTestGetBitDepthStoredAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthStoredAsBoolean());
        System.out.println("Stored Resolution in bits (8, 16, 20, 24) AS Boolean === " + jMetaDataAudio.getBitDepthStoredAsBoolean());
    }

   /**
    * Test getBitDepthStoredAsBigInteger() method.
    */
    @Test
    public void subTestGetBitDepthStoredAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthStoredAsBigInteger());
        System.out.println("Stored Resolution in bits (8, 16, 20, 24) AS BigInteger === " + jMetaDataAudio.getBitDepthStoredAsBigInteger());
    }

   /**
    * Test getBitDepthStoredAsURL() method.
    */
    @Test
    public void subTestGetBitDepthStoredAsURL() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthStoredAsURL());
        System.out.println("Stored Resolution in bits (8, 16, 20, 24) AS URL === " + jMetaDataAudio.getBitDepthStoredAsURL());
    }

   /**
    * Test getBitDepthStoredStringAsInteger() method.
    */
    @Test
    public void subTestGetBitDepthStoredStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthStoredStringAsInteger());
        System.out.println("Stored Resolution in bits (8, 16, 20, 24) AS Integer === " + jMetaDataAudio.getBitDepthStoredStringAsInteger());
    }

   /**
    * Test getBitDepthStoredStringAsLong() method.
    */
    @Test
    public void subTestGetBitDepthStoredStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthStoredStringAsLong());
        System.out.println("Stored Resolution in bits (8, 16, 20, 24) AS Long === " + jMetaDataAudio.getBitDepthStoredStringAsLong());
    }

   /**
    * Test getBitDepthStoredStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitDepthStoredStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthStoredStringAsLocalDateTime());
        System.out.println("Stored Resolution in bits (8, 16, 20, 24) AS LocalDateTime === " + jMetaDataAudio.getBitDepthStoredStringAsLocalDateTime());
    }

   /**
    * Test getBitDepthStoredStringAsLocalTime() method.
    */
    @Test
    public void subTestGetBitDepthStoredStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthStoredStringAsLocalTime());
        System.out.println("Stored Resolution in bits (8, 16, 20, 24) AS LocalTime === " + jMetaDataAudio.getBitDepthStoredStringAsLocalTime());
    }

   /**
    * Test getBitDepthStoredStringAsString() method.
    */
    @Test
    public void subTestGetBitDepthStoredStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthStoredStringAsString());
        System.out.println("Stored Resolution in bits (8, 16, 20, 24) AS String === " + jMetaDataAudio.getBitDepthStoredStringAsString());
    }

   /**
    * Test getBitDepthStoredStringAsBoolean() method.
    */
    @Test
    public void subTestGetBitDepthStoredStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthStoredStringAsBoolean());
        System.out.println("Stored Resolution in bits (8, 16, 20, 24) AS Boolean === " + jMetaDataAudio.getBitDepthStoredStringAsBoolean());
    }

   /**
    * Test getBitDepthStoredStringAsBigInteger() method.
    */
    @Test
    public void subTestGetBitDepthStoredStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthStoredStringAsBigInteger());
        System.out.println("Stored Resolution in bits (8, 16, 20, 24) AS BigInteger === " + jMetaDataAudio.getBitDepthStoredStringAsBigInteger());
    }

   /**
    * Test getBitDepthStoredStringAsURL() method.
    */
    @Test
    public void subTestGetBitDepthStoredStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getBitDepthStoredStringAsURL());
        System.out.println("Stored Resolution in bits (8, 16, 20, 24) AS URL === " + jMetaDataAudio.getBitDepthStoredStringAsURL());
    }

   /**
    * Test getCodecIDStringAsInteger() method.
    */
    @Test
    public void subTestGetCodecIDStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDStringAsInteger());
        System.out.println("Codec ID (found in some containers) AS Integer === " + jMetaDataAudio.getCodecIDStringAsInteger());
    }

   /**
    * Test getCodecIDStringAsLong() method.
    */
    @Test
    public void subTestGetCodecIDStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDStringAsLong());
        System.out.println("Codec ID (found in some containers) AS Long === " + jMetaDataAudio.getCodecIDStringAsLong());
    }

   /**
    * Test getCodecIDStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCodecIDStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDStringAsLocalDateTime());
        System.out.println("Codec ID (found in some containers) AS LocalDateTime === " + jMetaDataAudio.getCodecIDStringAsLocalDateTime());
    }

   /**
    * Test getCodecIDStringAsLocalTime() method.
    */
    @Test
    public void subTestGetCodecIDStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDStringAsLocalTime());
        System.out.println("Codec ID (found in some containers) AS LocalTime === " + jMetaDataAudio.getCodecIDStringAsLocalTime());
    }

   /**
    * Test getCodecIDStringAsString() method.
    */
    @Test
    public void subTestGetCodecIDStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDStringAsString());
        System.out.println("Codec ID (found in some containers) AS String === " + jMetaDataAudio.getCodecIDStringAsString());
    }

   /**
    * Test getCodecIDStringAsBoolean() method.
    */
    @Test
    public void subTestGetCodecIDStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDStringAsBoolean());
        System.out.println("Codec ID (found in some containers) AS Boolean === " + jMetaDataAudio.getCodecIDStringAsBoolean());
    }

   /**
    * Test getCodecIDStringAsBigInteger() method.
    */
    @Test
    public void subTestGetCodecIDStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDStringAsBigInteger());
        System.out.println("Codec ID (found in some containers) AS BigInteger === " + jMetaDataAudio.getCodecIDStringAsBigInteger());
    }

   /**
    * Test getCodecIDStringAsURL() method.
    */
    @Test
    public void subTestGetCodecIDStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getCodecIDStringAsURL());
        System.out.println("Codec ID (found in some containers) AS URL === " + jMetaDataAudio.getCodecIDStringAsURL());
    }

   /**
    * Test getEncodedLibraryCompanyNameAsInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryCompanyNameAsInteger());
        System.out.println("Name of the company AS Integer === " + jMetaDataAudio.getEncodedLibraryCompanyNameAsInteger());
    }

   /**
    * Test getEncodedLibraryCompanyNameAsLong() method.
    */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsLong() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryCompanyNameAsLong());
        System.out.println("Name of the company AS Long === " + jMetaDataAudio.getEncodedLibraryCompanyNameAsLong());
    }

   /**
    * Test getEncodedLibraryCompanyNameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryCompanyNameAsLocalDateTime());
        System.out.println("Name of the company AS LocalDateTime === " + jMetaDataAudio.getEncodedLibraryCompanyNameAsLocalDateTime());
    }

   /**
    * Test getEncodedLibraryCompanyNameAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryCompanyNameAsLocalTime());
        System.out.println("Name of the company AS LocalTime === " + jMetaDataAudio.getEncodedLibraryCompanyNameAsLocalTime());
    }

   /**
    * Test getEncodedLibraryCompanyNameAsString() method.
    */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsString() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryCompanyNameAsString());
        System.out.println("Name of the company AS String === " + jMetaDataAudio.getEncodedLibraryCompanyNameAsString());
    }

   /**
    * Test getEncodedLibraryCompanyNameAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryCompanyNameAsBoolean());
        System.out.println("Name of the company AS Boolean === " + jMetaDataAudio.getEncodedLibraryCompanyNameAsBoolean());
    }

   /**
    * Test getEncodedLibraryCompanyNameAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryCompanyNameAsBigInteger());
        System.out.println("Name of the company AS BigInteger === " + jMetaDataAudio.getEncodedLibraryCompanyNameAsBigInteger());
    }

   /**
    * Test getEncodedLibraryCompanyNameAsURL() method.
    */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsURL() {
        assertEquals(null, this.jMetaDataAudio.getEncodedLibraryCompanyNameAsURL());
        System.out.println("Name of the company AS URL === " + jMetaDataAudio.getEncodedLibraryCompanyNameAsURL());
    }

   /**
    * Test getSourceStreamSizeAsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeAsInteger());
        System.out.println("Source Streamsize in bytes AS Integer === " + jMetaDataAudio.getSourceStreamSizeAsInteger());
    }

   /**
    * Test getSourceStreamSizeAsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeAsLong() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeAsLong());
        System.out.println("Source Streamsize in bytes AS Long === " + jMetaDataAudio.getSourceStreamSizeAsLong());
    }

   /**
    * Test getSourceStreamSizeAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeAsLocalDateTime());
        System.out.println("Source Streamsize in bytes AS LocalDateTime === " + jMetaDataAudio.getSourceStreamSizeAsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeAsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeAsLocalTime());
        System.out.println("Source Streamsize in bytes AS LocalTime === " + jMetaDataAudio.getSourceStreamSizeAsLocalTime());
    }

   /**
    * Test getSourceStreamSizeAsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeAsString() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeAsString());
        System.out.println("Source Streamsize in bytes AS String === " + jMetaDataAudio.getSourceStreamSizeAsString());
    }

   /**
    * Test getSourceStreamSizeAsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeAsBoolean());
        System.out.println("Source Streamsize in bytes AS Boolean === " + jMetaDataAudio.getSourceStreamSizeAsBoolean());
    }

   /**
    * Test getSourceStreamSizeAsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeAsBigInteger());
        System.out.println("Source Streamsize in bytes AS BigInteger === " + jMetaDataAudio.getSourceStreamSizeAsBigInteger());
    }

   /**
    * Test getSourceStreamSizeAsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeAsURL() {
        assertEquals(null, this.jMetaDataAudio.getSourceStreamSizeAsURL());
        System.out.println("Source Streamsize in bytes AS URL === " + jMetaDataAudio.getSourceStreamSizeAsURL());
    }

   /**
    * Test getFormatCommercialAsInteger() method.
    */
    @Test
    public void subTestGetFormatCommercialAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatCommercialAsInteger());
        System.out.println("Commercial name used by vendor for theses setings or Format field if there is no difference AS Integer === " + jMetaDataAudio.getFormatCommercialAsInteger());
    }

   /**
    * Test getFormatCommercialAsLong() method.
    */
    @Test
    public void subTestGetFormatCommercialAsLong() {
        assertEquals(null, this.jMetaDataAudio.getFormatCommercialAsLong());
        System.out.println("Commercial name used by vendor for theses setings or Format field if there is no difference AS Long === " + jMetaDataAudio.getFormatCommercialAsLong());
    }

   /**
    * Test getFormatCommercialAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatCommercialAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatCommercialAsLocalDateTime());
        System.out.println("Commercial name used by vendor for theses setings or Format field if there is no difference AS LocalDateTime === " + jMetaDataAudio.getFormatCommercialAsLocalDateTime());
    }

   /**
    * Test getFormatCommercialAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatCommercialAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatCommercialAsLocalTime());
        System.out.println("Commercial name used by vendor for theses setings or Format field if there is no difference AS LocalTime === " + jMetaDataAudio.getFormatCommercialAsLocalTime());
    }

   /**
    * Test getFormatCommercialAsString() method.
    */
    @Test
    public void subTestGetFormatCommercialAsString() {
        assertEquals(null, this.jMetaDataAudio.getFormatCommercialAsString());
        System.out.println("Commercial name used by vendor for theses setings or Format field if there is no difference AS String === " + jMetaDataAudio.getFormatCommercialAsString());
    }

   /**
    * Test getFormatCommercialAsBoolean() method.
    */
    @Test
    public void subTestGetFormatCommercialAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getFormatCommercialAsBoolean());
        System.out.println("Commercial name used by vendor for theses setings or Format field if there is no difference AS Boolean === " + jMetaDataAudio.getFormatCommercialAsBoolean());
    }

   /**
    * Test getFormatCommercialAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatCommercialAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatCommercialAsBigInteger());
        System.out.println("Commercial name used by vendor for theses setings or Format field if there is no difference AS BigInteger === " + jMetaDataAudio.getFormatCommercialAsBigInteger());
    }

   /**
    * Test getFormatCommercialAsURL() method.
    */
    @Test
    public void subTestGetFormatCommercialAsURL() {
        assertEquals(null, this.jMetaDataAudio.getFormatCommercialAsURL());
        System.out.println("Commercial name used by vendor for theses setings or Format field if there is no difference AS URL === " + jMetaDataAudio.getFormatCommercialAsURL());
    }

   /**
    * Test getDelaySourceStringAsInteger() method.
    */
    @Test
    public void subTestGetDelaySourceStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getDelaySourceStringAsInteger());
        System.out.println("Delay source (Container or Stream or empty) AS Integer === " + jMetaDataAudio.getDelaySourceStringAsInteger());
    }

   /**
    * Test getDelaySourceStringAsLong() method.
    */
    @Test
    public void subTestGetDelaySourceStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getDelaySourceStringAsLong());
        System.out.println("Delay source (Container or Stream or empty) AS Long === " + jMetaDataAudio.getDelaySourceStringAsLong());
    }

   /**
    * Test getDelaySourceStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelaySourceStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getDelaySourceStringAsLocalDateTime());
        System.out.println("Delay source (Container or Stream or empty) AS LocalDateTime === " + jMetaDataAudio.getDelaySourceStringAsLocalDateTime());
    }

   /**
    * Test getDelaySourceStringAsLocalTime() method.
    */
    @Test
    public void subTestGetDelaySourceStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getDelaySourceStringAsLocalTime());
        System.out.println("Delay source (Container or Stream or empty) AS LocalTime === " + jMetaDataAudio.getDelaySourceStringAsLocalTime());
    }

   /**
    * Test getDelaySourceStringAsString() method.
    */
    @Test
    public void subTestGetDelaySourceStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getDelaySourceStringAsString());
        System.out.println("Delay source (Container or Stream or empty) AS String === " + jMetaDataAudio.getDelaySourceStringAsString());
    }

   /**
    * Test getDelaySourceStringAsBoolean() method.
    */
    @Test
    public void subTestGetDelaySourceStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getDelaySourceStringAsBoolean());
        System.out.println("Delay source (Container or Stream or empty) AS Boolean === " + jMetaDataAudio.getDelaySourceStringAsBoolean());
    }

   /**
    * Test getDelaySourceStringAsBigInteger() method.
    */
    @Test
    public void subTestGetDelaySourceStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getDelaySourceStringAsBigInteger());
        System.out.println("Delay source (Container or Stream or empty) AS BigInteger === " + jMetaDataAudio.getDelaySourceStringAsBigInteger());
    }

   /**
    * Test getDelaySourceStringAsURL() method.
    */
    @Test
    public void subTestGetDelaySourceStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getDelaySourceStringAsURL());
        System.out.println("Delay source (Container or Stream or empty) AS URL === " + jMetaDataAudio.getDelaySourceStringAsURL());
    }

   /**
    * Test getBitRateNominalAsInteger() method.
    */
    @Test
    public void subTestGetBitRateNominalAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getBitRateNominalAsInteger());
        System.out.println("Nominal Bit rate in bps AS Integer === " + jMetaDataAudio.getBitRateNominalAsInteger());
    }

   /**
    * Test getBitRateNominalAsLong() method.
    */
    @Test
    public void subTestGetBitRateNominalAsLong() {
        assertEquals(null, this.jMetaDataAudio.getBitRateNominalAsLong());
        System.out.println("Nominal Bit rate in bps AS Long === " + jMetaDataAudio.getBitRateNominalAsLong());
    }

   /**
    * Test getBitRateNominalAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitRateNominalAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getBitRateNominalAsLocalDateTime());
        System.out.println("Nominal Bit rate in bps AS LocalDateTime === " + jMetaDataAudio.getBitRateNominalAsLocalDateTime());
    }

   /**
    * Test getBitRateNominalAsLocalTime() method.
    */
    @Test
    public void subTestGetBitRateNominalAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getBitRateNominalAsLocalTime());
        System.out.println("Nominal Bit rate in bps AS LocalTime === " + jMetaDataAudio.getBitRateNominalAsLocalTime());
    }

   /**
    * Test getBitRateNominalAsString() method.
    */
    @Test
    public void subTestGetBitRateNominalAsString() {
        assertEquals(null, this.jMetaDataAudio.getBitRateNominalAsString());
        System.out.println("Nominal Bit rate in bps AS String === " + jMetaDataAudio.getBitRateNominalAsString());
    }

   /**
    * Test getBitRateNominalAsBoolean() method.
    */
    @Test
    public void subTestGetBitRateNominalAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getBitRateNominalAsBoolean());
        System.out.println("Nominal Bit rate in bps AS Boolean === " + jMetaDataAudio.getBitRateNominalAsBoolean());
    }

   /**
    * Test getBitRateNominalAsBigInteger() method.
    */
    @Test
    public void subTestGetBitRateNominalAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getBitRateNominalAsBigInteger());
        System.out.println("Nominal Bit rate in bps AS BigInteger === " + jMetaDataAudio.getBitRateNominalAsBigInteger());
    }

   /**
    * Test getBitRateNominalAsURL() method.
    */
    @Test
    public void subTestGetBitRateNominalAsURL() {
        assertEquals(null, this.jMetaDataAudio.getBitRateNominalAsURL());
        System.out.println("Nominal Bit rate in bps AS URL === " + jMetaDataAudio.getBitRateNominalAsURL());
    }

   /**
    * Test getBitRateMinimumAsInteger() method.
    */
    @Test
    public void subTestGetBitRateMinimumAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getBitRateMinimumAsInteger());
        System.out.println("Minimum Bit rate in bps AS Integer === " + jMetaDataAudio.getBitRateMinimumAsInteger());
    }

   /**
    * Test getBitRateMinimumAsLong() method.
    */
    @Test
    public void subTestGetBitRateMinimumAsLong() {
        assertEquals(null, this.jMetaDataAudio.getBitRateMinimumAsLong());
        System.out.println("Minimum Bit rate in bps AS Long === " + jMetaDataAudio.getBitRateMinimumAsLong());
    }

   /**
    * Test getBitRateMinimumAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitRateMinimumAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getBitRateMinimumAsLocalDateTime());
        System.out.println("Minimum Bit rate in bps AS LocalDateTime === " + jMetaDataAudio.getBitRateMinimumAsLocalDateTime());
    }

   /**
    * Test getBitRateMinimumAsLocalTime() method.
    */
    @Test
    public void subTestGetBitRateMinimumAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getBitRateMinimumAsLocalTime());
        System.out.println("Minimum Bit rate in bps AS LocalTime === " + jMetaDataAudio.getBitRateMinimumAsLocalTime());
    }

   /**
    * Test getBitRateMinimumAsString() method.
    */
    @Test
    public void subTestGetBitRateMinimumAsString() {
        assertEquals(null, this.jMetaDataAudio.getBitRateMinimumAsString());
        System.out.println("Minimum Bit rate in bps AS String === " + jMetaDataAudio.getBitRateMinimumAsString());
    }

   /**
    * Test getBitRateMinimumAsBoolean() method.
    */
    @Test
    public void subTestGetBitRateMinimumAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getBitRateMinimumAsBoolean());
        System.out.println("Minimum Bit rate in bps AS Boolean === " + jMetaDataAudio.getBitRateMinimumAsBoolean());
    }

   /**
    * Test getBitRateMinimumAsBigInteger() method.
    */
    @Test
    public void subTestGetBitRateMinimumAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getBitRateMinimumAsBigInteger());
        System.out.println("Minimum Bit rate in bps AS BigInteger === " + jMetaDataAudio.getBitRateMinimumAsBigInteger());
    }

   /**
    * Test getBitRateMinimumAsURL() method.
    */
    @Test
    public void subTestGetBitRateMinimumAsURL() {
        assertEquals(null, this.jMetaDataAudio.getBitRateMinimumAsURL());
        System.out.println("Minimum Bit rate in bps AS URL === " + jMetaDataAudio.getBitRateMinimumAsURL());
    }

   /**
    * Test getFormatSettingsSBRStringAsInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsSBRStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsSBRStringAsInteger());
        System.out.println("Format_Settings_SBR/String AS Integer === " + jMetaDataAudio.getFormatSettingsSBRStringAsInteger());
    }

   /**
    * Test getFormatSettingsSBRStringAsLong() method.
    */
    @Test
    public void subTestGetFormatSettingsSBRStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsSBRStringAsLong());
        System.out.println("Format_Settings_SBR/String AS Long === " + jMetaDataAudio.getFormatSettingsSBRStringAsLong());
    }

   /**
    * Test getFormatSettingsSBRStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatSettingsSBRStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsSBRStringAsLocalDateTime());
        System.out.println("Format_Settings_SBR/String AS LocalDateTime === " + jMetaDataAudio.getFormatSettingsSBRStringAsLocalDateTime());
    }

   /**
    * Test getFormatSettingsSBRStringAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatSettingsSBRStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsSBRStringAsLocalTime());
        System.out.println("Format_Settings_SBR/String AS LocalTime === " + jMetaDataAudio.getFormatSettingsSBRStringAsLocalTime());
    }

   /**
    * Test getFormatSettingsSBRStringAsString() method.
    */
    @Test
    public void subTestGetFormatSettingsSBRStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsSBRStringAsString());
        System.out.println("Format_Settings_SBR/String AS String === " + jMetaDataAudio.getFormatSettingsSBRStringAsString());
    }

   /**
    * Test getFormatSettingsSBRStringAsBoolean() method.
    */
    @Test
    public void subTestGetFormatSettingsSBRStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsSBRStringAsBoolean());
        System.out.println("Format_Settings_SBR/String AS Boolean === " + jMetaDataAudio.getFormatSettingsSBRStringAsBoolean());
    }

   /**
    * Test getFormatSettingsSBRStringAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsSBRStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsSBRStringAsBigInteger());
        System.out.println("Format_Settings_SBR/String AS BigInteger === " + jMetaDataAudio.getFormatSettingsSBRStringAsBigInteger());
    }

   /**
    * Test getFormatSettingsSBRStringAsURL() method.
    */
    @Test
    public void subTestGetFormatSettingsSBRStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getFormatSettingsSBRStringAsURL());
        System.out.println("Format_Settings_SBR/String AS URL === " + jMetaDataAudio.getFormatSettingsSBRStringAsURL());
    }

   /**
    * Test getSourceDurationStringAsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationStringAsInteger());
        System.out.println("Source Play time in format : XXx YYy only, YYy omited if zero AS Integer === " + jMetaDataAudio.getSourceDurationStringAsInteger());
    }

   /**
    * Test getSourceDurationStringAsLong() method.
    */
    @Test
    public void subTestGetSourceDurationStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationStringAsLong());
        System.out.println("Source Play time in format : XXx YYy only, YYy omited if zero AS Long === " + jMetaDataAudio.getSourceDurationStringAsLong());
    }

   /**
    * Test getSourceDurationStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationStringAsLocalDateTime());
        System.out.println("Source Play time in format : XXx YYy only, YYy omited if zero AS LocalDateTime === " + jMetaDataAudio.getSourceDurationStringAsLocalDateTime());
    }

   /**
    * Test getSourceDurationStringAsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationStringAsLocalTime());
        System.out.println("Source Play time in format : XXx YYy only, YYy omited if zero AS LocalTime === " + jMetaDataAudio.getSourceDurationStringAsLocalTime());
    }

   /**
    * Test getSourceDurationStringAsString() method.
    */
    @Test
    public void subTestGetSourceDurationStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationStringAsString());
        System.out.println("Source Play time in format : XXx YYy only, YYy omited if zero AS String === " + jMetaDataAudio.getSourceDurationStringAsString());
    }

   /**
    * Test getSourceDurationStringAsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationStringAsBoolean());
        System.out.println("Source Play time in format : XXx YYy only, YYy omited if zero AS Boolean === " + jMetaDataAudio.getSourceDurationStringAsBoolean());
    }

   /**
    * Test getSourceDurationStringAsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationStringAsBigInteger());
        System.out.println("Source Play time in format : XXx YYy only, YYy omited if zero AS BigInteger === " + jMetaDataAudio.getSourceDurationStringAsBigInteger());
    }

   /**
    * Test getSourceDurationStringAsURL() method.
    */
    @Test
    public void subTestGetSourceDurationStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getSourceDurationStringAsURL());
        System.out.println("Source Play time in format : XXx YYy only, YYy omited if zero AS URL === " + jMetaDataAudio.getSourceDurationStringAsURL());
    }

   /**
    * Test getBitRateEncodedStringAsInteger() method.
    */
    @Test
    public void subTestGetBitRateEncodedStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getBitRateEncodedStringAsInteger());
        System.out.println("Encoded (with forced padding) bit rate (with measurement), if some container padding is present AS Integer === " + jMetaDataAudio.getBitRateEncodedStringAsInteger());
    }

   /**
    * Test getBitRateEncodedStringAsLong() method.
    */
    @Test
    public void subTestGetBitRateEncodedStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getBitRateEncodedStringAsLong());
        System.out.println("Encoded (with forced padding) bit rate (with measurement), if some container padding is present AS Long === " + jMetaDataAudio.getBitRateEncodedStringAsLong());
    }

   /**
    * Test getBitRateEncodedStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitRateEncodedStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getBitRateEncodedStringAsLocalDateTime());
        System.out.println("Encoded (with forced padding) bit rate (with measurement), if some container padding is present AS LocalDateTime === " + jMetaDataAudio.getBitRateEncodedStringAsLocalDateTime());
    }

   /**
    * Test getBitRateEncodedStringAsLocalTime() method.
    */
    @Test
    public void subTestGetBitRateEncodedStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getBitRateEncodedStringAsLocalTime());
        System.out.println("Encoded (with forced padding) bit rate (with measurement), if some container padding is present AS LocalTime === " + jMetaDataAudio.getBitRateEncodedStringAsLocalTime());
    }

   /**
    * Test getBitRateEncodedStringAsString() method.
    */
    @Test
    public void subTestGetBitRateEncodedStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getBitRateEncodedStringAsString());
        System.out.println("Encoded (with forced padding) bit rate (with measurement), if some container padding is present AS String === " + jMetaDataAudio.getBitRateEncodedStringAsString());
    }

   /**
    * Test getBitRateEncodedStringAsBoolean() method.
    */
    @Test
    public void subTestGetBitRateEncodedStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getBitRateEncodedStringAsBoolean());
        System.out.println("Encoded (with forced padding) bit rate (with measurement), if some container padding is present AS Boolean === " + jMetaDataAudio.getBitRateEncodedStringAsBoolean());
    }

   /**
    * Test getBitRateEncodedStringAsBigInteger() method.
    */
    @Test
    public void subTestGetBitRateEncodedStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getBitRateEncodedStringAsBigInteger());
        System.out.println("Encoded (with forced padding) bit rate (with measurement), if some container padding is present AS BigInteger === " + jMetaDataAudio.getBitRateEncodedStringAsBigInteger());
    }

   /**
    * Test getBitRateEncodedStringAsURL() method.
    */
    @Test
    public void subTestGetBitRateEncodedStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getBitRateEncodedStringAsURL());
        System.out.println("Encoded (with forced padding) bit rate (with measurement), if some container padding is present AS URL === " + jMetaDataAudio.getBitRateEncodedStringAsURL());
    }

   /**
    * Test getStreamKindStringAsInteger() method.
    */
    @Test
    public void subTestGetStreamKindStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamKindStringAsInteger());
        System.out.println("Stream type name AS Integer === " + jMetaDataAudio.getStreamKindStringAsInteger());
    }

   /**
    * Test getStreamKindStringAsLong() method.
    */
    @Test
    public void subTestGetStreamKindStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getStreamKindStringAsLong());
        System.out.println("Stream type name AS Long === " + jMetaDataAudio.getStreamKindStringAsLong());
    }

   /**
    * Test getStreamKindStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamKindStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamKindStringAsLocalDateTime());
        System.out.println("Stream type name AS LocalDateTime === " + jMetaDataAudio.getStreamKindStringAsLocalDateTime());
    }

   /**
    * Test getStreamKindStringAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamKindStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getStreamKindStringAsLocalTime());
        System.out.println("Stream type name AS LocalTime === " + jMetaDataAudio.getStreamKindStringAsLocalTime());
    }

   /**
    * Test getStreamKindStringAsString() method.
    */
    @Test
    public void subTestGetStreamKindStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getStreamKindStringAsString());
        System.out.println("Stream type name AS String === " + jMetaDataAudio.getStreamKindStringAsString());
    }

   /**
    * Test getStreamKindStringAsBoolean() method.
    */
    @Test
    public void subTestGetStreamKindStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getStreamKindStringAsBoolean());
        System.out.println("Stream type name AS Boolean === " + jMetaDataAudio.getStreamKindStringAsBoolean());
    }

   /**
    * Test getStreamKindStringAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamKindStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getStreamKindStringAsBigInteger());
        System.out.println("Stream type name AS BigInteger === " + jMetaDataAudio.getStreamKindStringAsBigInteger());
    }

   /**
    * Test getStreamKindStringAsURL() method.
    */
    @Test
    public void subTestGetStreamKindStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getStreamKindStringAsURL());
        System.out.println("Stream type name AS URL === " + jMetaDataAudio.getStreamKindStringAsURL());
    }

   /**
    * Test getChannelPositionsString2AsInteger() method.
    */
    @Test
    public void subTestGetChannelPositionsString2AsInteger() {
        assertEquals(null, this.jMetaDataAudio.getChannelPositionsString2AsInteger());
        System.out.println("Position of channels (x/y.z format) AS Integer === " + jMetaDataAudio.getChannelPositionsString2AsInteger());
    }

   /**
    * Test getChannelPositionsString2AsLong() method.
    */
    @Test
    public void subTestGetChannelPositionsString2AsLong() {
        assertEquals(null, this.jMetaDataAudio.getChannelPositionsString2AsLong());
        System.out.println("Position of channels (x/y.z format) AS Long === " + jMetaDataAudio.getChannelPositionsString2AsLong());
    }

   /**
    * Test getChannelPositionsString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetChannelPositionsString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getChannelPositionsString2AsLocalDateTime());
        System.out.println("Position of channels (x/y.z format) AS LocalDateTime === " + jMetaDataAudio.getChannelPositionsString2AsLocalDateTime());
    }

   /**
    * Test getChannelPositionsString2AsLocalTime() method.
    */
    @Test
    public void subTestGetChannelPositionsString2AsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getChannelPositionsString2AsLocalTime());
        System.out.println("Position of channels (x/y.z format) AS LocalTime === " + jMetaDataAudio.getChannelPositionsString2AsLocalTime());
    }

   /**
    * Test getChannelPositionsString2AsString() method.
    */
    @Test
    public void subTestGetChannelPositionsString2AsString() {
        assertEquals(null, this.jMetaDataAudio.getChannelPositionsString2AsString());
        System.out.println("Position of channels (x/y.z format) AS String === " + jMetaDataAudio.getChannelPositionsString2AsString());
    }

   /**
    * Test getChannelPositionsString2AsBoolean() method.
    */
    @Test
    public void subTestGetChannelPositionsString2AsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getChannelPositionsString2AsBoolean());
        System.out.println("Position of channels (x/y.z format) AS Boolean === " + jMetaDataAudio.getChannelPositionsString2AsBoolean());
    }

   /**
    * Test getChannelPositionsString2AsBigInteger() method.
    */
    @Test
    public void subTestGetChannelPositionsString2AsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getChannelPositionsString2AsBigInteger());
        System.out.println("Position of channels (x/y.z format) AS BigInteger === " + jMetaDataAudio.getChannelPositionsString2AsBigInteger());
    }

   /**
    * Test getChannelPositionsString2AsURL() method.
    */
    @Test
    public void subTestGetChannelPositionsString2AsURL() {
        assertEquals(null, this.jMetaDataAudio.getChannelPositionsString2AsURL());
        System.out.println("Position of channels (x/y.z format) AS URL === " + jMetaDataAudio.getChannelPositionsString2AsURL());
    }

   /**
    * Test getEncodedApplicationVersionAsInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationVersionAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationVersionAsInteger());
        System.out.println("Version of the product AS Integer === " + jMetaDataAudio.getEncodedApplicationVersionAsInteger());
    }

   /**
    * Test getEncodedApplicationVersionAsLong() method.
    */
    @Test
    public void subTestGetEncodedApplicationVersionAsLong() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationVersionAsLong());
        System.out.println("Version of the product AS Long === " + jMetaDataAudio.getEncodedApplicationVersionAsLong());
    }

   /**
    * Test getEncodedApplicationVersionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationVersionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationVersionAsLocalDateTime());
        System.out.println("Version of the product AS LocalDateTime === " + jMetaDataAudio.getEncodedApplicationVersionAsLocalDateTime());
    }

   /**
    * Test getEncodedApplicationVersionAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationVersionAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationVersionAsLocalTime());
        System.out.println("Version of the product AS LocalTime === " + jMetaDataAudio.getEncodedApplicationVersionAsLocalTime());
    }

   /**
    * Test getEncodedApplicationVersionAsString() method.
    */
    @Test
    public void subTestGetEncodedApplicationVersionAsString() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationVersionAsString());
        System.out.println("Version of the product AS String === " + jMetaDataAudio.getEncodedApplicationVersionAsString());
    }

   /**
    * Test getEncodedApplicationVersionAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedApplicationVersionAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationVersionAsBoolean());
        System.out.println("Version of the product AS Boolean === " + jMetaDataAudio.getEncodedApplicationVersionAsBoolean());
    }

   /**
    * Test getEncodedApplicationVersionAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationVersionAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationVersionAsBigInteger());
        System.out.println("Version of the product AS BigInteger === " + jMetaDataAudio.getEncodedApplicationVersionAsBigInteger());
    }

   /**
    * Test getEncodedApplicationVersionAsURL() method.
    */
    @Test
    public void subTestGetEncodedApplicationVersionAsURL() {
        assertEquals(null, this.jMetaDataAudio.getEncodedApplicationVersionAsURL());
        System.out.println("Version of the product AS URL === " + jMetaDataAudio.getEncodedApplicationVersionAsURL());
    }

   /**
    * Test getMenuIDAsInteger() method.
    */
    @Test
    public void subTestGetMenuIDAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getMenuIDAsInteger());
        System.out.println("The menu ID for this stream in this file AS Integer === " + jMetaDataAudio.getMenuIDAsInteger());
    }

   /**
    * Test getMenuIDAsLong() method.
    */
    @Test
    public void subTestGetMenuIDAsLong() {
        assertEquals(null, this.jMetaDataAudio.getMenuIDAsLong());
        System.out.println("The menu ID for this stream in this file AS Long === " + jMetaDataAudio.getMenuIDAsLong());
    }

   /**
    * Test getMenuIDAsLocalDateTime() method.
    */
    @Test
    public void subTestGetMenuIDAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getMenuIDAsLocalDateTime());
        System.out.println("The menu ID for this stream in this file AS LocalDateTime === " + jMetaDataAudio.getMenuIDAsLocalDateTime());
    }

   /**
    * Test getMenuIDAsLocalTime() method.
    */
    @Test
    public void subTestGetMenuIDAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getMenuIDAsLocalTime());
        System.out.println("The menu ID for this stream in this file AS LocalTime === " + jMetaDataAudio.getMenuIDAsLocalTime());
    }

   /**
    * Test getMenuIDAsString() method.
    */
    @Test
    public void subTestGetMenuIDAsString() {
        assertEquals(null, this.jMetaDataAudio.getMenuIDAsString());
        System.out.println("The menu ID for this stream in this file AS String === " + jMetaDataAudio.getMenuIDAsString());
    }

   /**
    * Test getMenuIDAsBoolean() method.
    */
    @Test
    public void subTestGetMenuIDAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getMenuIDAsBoolean());
        System.out.println("The menu ID for this stream in this file AS Boolean === " + jMetaDataAudio.getMenuIDAsBoolean());
    }

   /**
    * Test getMenuIDAsBigInteger() method.
    */
    @Test
    public void subTestGetMenuIDAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getMenuIDAsBigInteger());
        System.out.println("The menu ID for this stream in this file AS BigInteger === " + jMetaDataAudio.getMenuIDAsBigInteger());
    }

   /**
    * Test getMenuIDAsURL() method.
    */
    @Test
    public void subTestGetMenuIDAsURL() {
        assertEquals(null, this.jMetaDataAudio.getMenuIDAsURL());
        System.out.println("The menu ID for this stream in this file AS URL === " + jMetaDataAudio.getMenuIDAsURL());
    }

   /**
    * Test getSamplesPerFrameAsInteger() method.
    */
    @Test
    public void subTestGetSamplesPerFrameAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getSamplesPerFrameAsInteger());
        System.out.println("Sampling rate AS Integer === " + jMetaDataAudio.getSamplesPerFrameAsInteger());
    }

   /**
    * Test getSamplesPerFrameAsLong() method.
    */
    @Test
    public void subTestGetSamplesPerFrameAsLong() {
        assertEquals(null, this.jMetaDataAudio.getSamplesPerFrameAsLong());
        System.out.println("Sampling rate AS Long === " + jMetaDataAudio.getSamplesPerFrameAsLong());
    }

   /**
    * Test getSamplesPerFrameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSamplesPerFrameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getSamplesPerFrameAsLocalDateTime());
        System.out.println("Sampling rate AS LocalDateTime === " + jMetaDataAudio.getSamplesPerFrameAsLocalDateTime());
    }

   /**
    * Test getSamplesPerFrameAsLocalTime() method.
    */
    @Test
    public void subTestGetSamplesPerFrameAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getSamplesPerFrameAsLocalTime());
        System.out.println("Sampling rate AS LocalTime === " + jMetaDataAudio.getSamplesPerFrameAsLocalTime());
    }

   /**
    * Test getSamplesPerFrameAsString() method.
    */
    @Test
    public void subTestGetSamplesPerFrameAsString() {
        assertEquals(null, this.jMetaDataAudio.getSamplesPerFrameAsString());
        System.out.println("Sampling rate AS String === " + jMetaDataAudio.getSamplesPerFrameAsString());
    }

   /**
    * Test getSamplesPerFrameAsBoolean() method.
    */
    @Test
    public void subTestGetSamplesPerFrameAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getSamplesPerFrameAsBoolean());
        System.out.println("Sampling rate AS Boolean === " + jMetaDataAudio.getSamplesPerFrameAsBoolean());
    }

   /**
    * Test getSamplesPerFrameAsBigInteger() method.
    */
    @Test
    public void subTestGetSamplesPerFrameAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getSamplesPerFrameAsBigInteger());
        System.out.println("Sampling rate AS BigInteger === " + jMetaDataAudio.getSamplesPerFrameAsBigInteger());
    }

   /**
    * Test getSamplesPerFrameAsURL() method.
    */
    @Test
    public void subTestGetSamplesPerFrameAsURL() {
        assertEquals(null, this.jMetaDataAudio.getSamplesPerFrameAsURL());
        System.out.println("Sampling rate AS URL === " + jMetaDataAudio.getSamplesPerFrameAsURL());
    }

   /**
    * Test getInterleaveDurationStringAsInteger() method.
    */
    @Test
    public void subTestGetInterleaveDurationStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getInterleaveDurationStringAsInteger());
        System.out.println("Between how much time and video frames the stream is inserted (with measurement) AS Integer === " + jMetaDataAudio.getInterleaveDurationStringAsInteger());
    }

   /**
    * Test getInterleaveDurationStringAsLong() method.
    */
    @Test
    public void subTestGetInterleaveDurationStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getInterleaveDurationStringAsLong());
        System.out.println("Between how much time and video frames the stream is inserted (with measurement) AS Long === " + jMetaDataAudio.getInterleaveDurationStringAsLong());
    }

   /**
    * Test getInterleaveDurationStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetInterleaveDurationStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getInterleaveDurationStringAsLocalDateTime());
        System.out.println("Between how much time and video frames the stream is inserted (with measurement) AS LocalDateTime === " + jMetaDataAudio.getInterleaveDurationStringAsLocalDateTime());
    }

   /**
    * Test getInterleaveDurationStringAsLocalTime() method.
    */
    @Test
    public void subTestGetInterleaveDurationStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getInterleaveDurationStringAsLocalTime());
        System.out.println("Between how much time and video frames the stream is inserted (with measurement) AS LocalTime === " + jMetaDataAudio.getInterleaveDurationStringAsLocalTime());
    }

   /**
    * Test getInterleaveDurationStringAsString() method.
    */
    @Test
    public void subTestGetInterleaveDurationStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getInterleaveDurationStringAsString());
        System.out.println("Between how much time and video frames the stream is inserted (with measurement) AS String === " + jMetaDataAudio.getInterleaveDurationStringAsString());
    }

   /**
    * Test getInterleaveDurationStringAsBoolean() method.
    */
    @Test
    public void subTestGetInterleaveDurationStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getInterleaveDurationStringAsBoolean());
        System.out.println("Between how much time and video frames the stream is inserted (with measurement) AS Boolean === " + jMetaDataAudio.getInterleaveDurationStringAsBoolean());
    }

   /**
    * Test getInterleaveDurationStringAsBigInteger() method.
    */
    @Test
    public void subTestGetInterleaveDurationStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getInterleaveDurationStringAsBigInteger());
        System.out.println("Between how much time and video frames the stream is inserted (with measurement) AS BigInteger === " + jMetaDataAudio.getInterleaveDurationStringAsBigInteger());
    }

   /**
    * Test getInterleaveDurationStringAsURL() method.
    */
    @Test
    public void subTestGetInterleaveDurationStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getInterleaveDurationStringAsURL());
        System.out.println("Between how much time and video frames the stream is inserted (with measurement) AS URL === " + jMetaDataAudio.getInterleaveDurationStringAsURL());
    }

   /**
    * Test getAlternateGroupStringAsInteger() method.
    */
    @Test
    public void subTestGetAlternateGroupStringAsInteger() {
        assertEquals(null, this.jMetaDataAudio.getAlternateGroupStringAsInteger());
        System.out.println("Number of a group in order to provide versions of the same track AS Integer === " + jMetaDataAudio.getAlternateGroupStringAsInteger());
    }

   /**
    * Test getAlternateGroupStringAsLong() method.
    */
    @Test
    public void subTestGetAlternateGroupStringAsLong() {
        assertEquals(null, this.jMetaDataAudio.getAlternateGroupStringAsLong());
        System.out.println("Number of a group in order to provide versions of the same track AS Long === " + jMetaDataAudio.getAlternateGroupStringAsLong());
    }

   /**
    * Test getAlternateGroupStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetAlternateGroupStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataAudio.getAlternateGroupStringAsLocalDateTime());
        System.out.println("Number of a group in order to provide versions of the same track AS LocalDateTime === " + jMetaDataAudio.getAlternateGroupStringAsLocalDateTime());
    }

   /**
    * Test getAlternateGroupStringAsLocalTime() method.
    */
    @Test
    public void subTestGetAlternateGroupStringAsLocalTime() {
        assertEquals(null, this.jMetaDataAudio.getAlternateGroupStringAsLocalTime());
        System.out.println("Number of a group in order to provide versions of the same track AS LocalTime === " + jMetaDataAudio.getAlternateGroupStringAsLocalTime());
    }

   /**
    * Test getAlternateGroupStringAsString() method.
    */
    @Test
    public void subTestGetAlternateGroupStringAsString() {
        assertEquals(null, this.jMetaDataAudio.getAlternateGroupStringAsString());
        System.out.println("Number of a group in order to provide versions of the same track AS String === " + jMetaDataAudio.getAlternateGroupStringAsString());
    }

   /**
    * Test getAlternateGroupStringAsBoolean() method.
    */
    @Test
    public void subTestGetAlternateGroupStringAsBoolean() {
        assertEquals(null, this.jMetaDataAudio.getAlternateGroupStringAsBoolean());
        System.out.println("Number of a group in order to provide versions of the same track AS Boolean === " + jMetaDataAudio.getAlternateGroupStringAsBoolean());
    }

   /**
    * Test getAlternateGroupStringAsBigInteger() method.
    */
    @Test
    public void subTestGetAlternateGroupStringAsBigInteger() {
        assertEquals(null, this.jMetaDataAudio.getAlternateGroupStringAsBigInteger());
        System.out.println("Number of a group in order to provide versions of the same track AS BigInteger === " + jMetaDataAudio.getAlternateGroupStringAsBigInteger());
    }

   /**
    * Test getAlternateGroupStringAsURL() method.
    */
    @Test
    public void subTestGetAlternateGroupStringAsURL() {
        assertEquals(null, this.jMetaDataAudio.getAlternateGroupStringAsURL());
        System.out.println("Number of a group in order to provide versions of the same track AS URL === " + jMetaDataAudio.getAlternateGroupStringAsURL());
    }

}
