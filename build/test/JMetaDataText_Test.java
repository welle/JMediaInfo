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
import aka.jmetadata.main.JMetaDataText;

/**
 * This class contains tests methods for Text informations of a specific Text stream.
 *
 * @author Welle Charlotte
 */
public final class JMetaDataText_Test {

    private static @NonNull final Logger LOGGER = Logger.getLogger(JMetaDataText_Test.class.getName());

    private static JMetaDataText jMetaDataText;
    private static JMetaData jMetaData;

    /**
     * Initialize test.
     */
    @BeforeClass
    public static void beforeUnit() {
        try {
            jMetaData = new JMetaData();
            final ClassLoader classLoader = JMetaDataText_Test.class.getClassLoader();
            final File file = new File(classLoader.getResource("somefile").getFile());
            jMetaData.open(file);
            jMetaDataText = null;
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
        assertEquals(null, this.jMetaDataText.getDelayOriginalSourceAsInteger());
        System.out.println("Delay source (Stream or empty) AS Integer === " + jMetaDataText.getDelayOriginalSourceAsInteger());
    }

   /**
    * Test getDelayOriginalSourceAsLong() method.
    */
    @Test
    public void subTestGetDelayOriginalSourceAsLong() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalSourceAsLong());
        System.out.println("Delay source (Stream or empty) AS Long === " + jMetaDataText.getDelayOriginalSourceAsLong());
    }

   /**
    * Test getDelayOriginalSourceAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayOriginalSourceAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalSourceAsLocalDateTime());
        System.out.println("Delay source (Stream or empty) AS LocalDateTime === " + jMetaDataText.getDelayOriginalSourceAsLocalDateTime());
    }

   /**
    * Test getDelayOriginalSourceAsLocalTime() method.
    */
    @Test
    public void subTestGetDelayOriginalSourceAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalSourceAsLocalTime());
        System.out.println("Delay source (Stream or empty) AS LocalTime === " + jMetaDataText.getDelayOriginalSourceAsLocalTime());
    }

   /**
    * Test getDelayOriginalSourceAsString() method.
    */
    @Test
    public void subTestGetDelayOriginalSourceAsString() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalSourceAsString());
        System.out.println("Delay source (Stream or empty) AS String === " + jMetaDataText.getDelayOriginalSourceAsString());
    }

   /**
    * Test getDelayOriginalSourceAsBoolean() method.
    */
    @Test
    public void subTestGetDelayOriginalSourceAsBoolean() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalSourceAsBoolean());
        System.out.println("Delay source (Stream or empty) AS Boolean === " + jMetaDataText.getDelayOriginalSourceAsBoolean());
    }

   /**
    * Test getDelayOriginalSourceAsBigInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalSourceAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalSourceAsBigInteger());
        System.out.println("Delay source (Stream or empty) AS BigInteger === " + jMetaDataText.getDelayOriginalSourceAsBigInteger());
    }

   /**
    * Test getDelayOriginalSourceAsURL() method.
    */
    @Test
    public void subTestGetDelayOriginalSourceAsURL() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalSourceAsURL());
        System.out.println("Delay source (Stream or empty) AS URL === " + jMetaDataText.getDelayOriginalSourceAsURL());
    }

   /**
    * Test getStreamOrderAsInteger() method.
    */
    @Test
    public void subTestGetStreamOrderAsInteger() {
        assertEquals(null, this.jMetaDataText.getStreamOrderAsInteger());
        System.out.println("Stream order in the file, whatever is the kind of stream (base=0) AS Integer === " + jMetaDataText.getStreamOrderAsInteger());
    }

   /**
    * Test getStreamOrderAsLong() method.
    */
    @Test
    public void subTestGetStreamOrderAsLong() {
        assertEquals(null, this.jMetaDataText.getStreamOrderAsLong());
        System.out.println("Stream order in the file, whatever is the kind of stream (base=0) AS Long === " + jMetaDataText.getStreamOrderAsLong());
    }

   /**
    * Test getStreamOrderAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamOrderAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getStreamOrderAsLocalDateTime());
        System.out.println("Stream order in the file, whatever is the kind of stream (base=0) AS LocalDateTime === " + jMetaDataText.getStreamOrderAsLocalDateTime());
    }

   /**
    * Test getStreamOrderAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamOrderAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getStreamOrderAsLocalTime());
        System.out.println("Stream order in the file, whatever is the kind of stream (base=0) AS LocalTime === " + jMetaDataText.getStreamOrderAsLocalTime());
    }

   /**
    * Test getStreamOrderAsString() method.
    */
    @Test
    public void subTestGetStreamOrderAsString() {
        assertEquals(null, this.jMetaDataText.getStreamOrderAsString());
        System.out.println("Stream order in the file, whatever is the kind of stream (base=0) AS String === " + jMetaDataText.getStreamOrderAsString());
    }

   /**
    * Test getStreamOrderAsBoolean() method.
    */
    @Test
    public void subTestGetStreamOrderAsBoolean() {
        assertEquals(null, this.jMetaDataText.getStreamOrderAsBoolean());
        System.out.println("Stream order in the file, whatever is the kind of stream (base=0) AS Boolean === " + jMetaDataText.getStreamOrderAsBoolean());
    }

   /**
    * Test getStreamOrderAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamOrderAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getStreamOrderAsBigInteger());
        System.out.println("Stream order in the file, whatever is the kind of stream (base=0) AS BigInteger === " + jMetaDataText.getStreamOrderAsBigInteger());
    }

   /**
    * Test getStreamOrderAsURL() method.
    */
    @Test
    public void subTestGetStreamOrderAsURL() {
        assertEquals(null, this.jMetaDataText.getStreamOrderAsURL());
        System.out.println("Stream order in the file, whatever is the kind of stream (base=0) AS URL === " + jMetaDataText.getStreamOrderAsURL());
    }

   /**
    * Test getEncodedLibraryNameAsInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryNameAsInteger() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryNameAsInteger());
        System.out.println("Name of the the encoding-software AS Integer === " + jMetaDataText.getEncodedLibraryNameAsInteger());
    }

   /**
    * Test getEncodedLibraryNameAsLong() method.
    */
    @Test
    public void subTestGetEncodedLibraryNameAsLong() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryNameAsLong());
        System.out.println("Name of the the encoding-software AS Long === " + jMetaDataText.getEncodedLibraryNameAsLong());
    }

   /**
    * Test getEncodedLibraryNameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryNameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryNameAsLocalDateTime());
        System.out.println("Name of the the encoding-software AS LocalDateTime === " + jMetaDataText.getEncodedLibraryNameAsLocalDateTime());
    }

   /**
    * Test getEncodedLibraryNameAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryNameAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryNameAsLocalTime());
        System.out.println("Name of the the encoding-software AS LocalTime === " + jMetaDataText.getEncodedLibraryNameAsLocalTime());
    }

   /**
    * Test getEncodedLibraryNameAsString() method.
    */
    @Test
    public void subTestGetEncodedLibraryNameAsString() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryNameAsString());
        System.out.println("Name of the the encoding-software AS String === " + jMetaDataText.getEncodedLibraryNameAsString());
    }

   /**
    * Test getEncodedLibraryNameAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedLibraryNameAsBoolean() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryNameAsBoolean());
        System.out.println("Name of the the encoding-software AS Boolean === " + jMetaDataText.getEncodedLibraryNameAsBoolean());
    }

   /**
    * Test getEncodedLibraryNameAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryNameAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryNameAsBigInteger());
        System.out.println("Name of the the encoding-software AS BigInteger === " + jMetaDataText.getEncodedLibraryNameAsBigInteger());
    }

   /**
    * Test getEncodedLibraryNameAsURL() method.
    */
    @Test
    public void subTestGetEncodedLibraryNameAsURL() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryNameAsURL());
        System.out.println("Name of the the encoding-software AS URL === " + jMetaDataText.getEncodedLibraryNameAsURL());
    }

   /**
    * Test getDurationFirstFrameString4AsInteger() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString4AsInteger() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameString4AsInteger());
        System.out.println("Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Integer === " + jMetaDataText.getDurationFirstFrameString4AsInteger());
    }

   /**
    * Test getDurationFirstFrameString4AsLong() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString4AsLong() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameString4AsLong());
        System.out.println("Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Long === " + jMetaDataText.getDurationFirstFrameString4AsLong());
    }

   /**
    * Test getDurationFirstFrameString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameString4AsLocalDateTime());
        System.out.println("Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS LocalDateTime === " + jMetaDataText.getDurationFirstFrameString4AsLocalDateTime());
    }

   /**
    * Test getDurationFirstFrameString4AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString4AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameString4AsLocalTime());
        System.out.println("Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS LocalTime === " + jMetaDataText.getDurationFirstFrameString4AsLocalTime());
    }

   /**
    * Test getDurationFirstFrameString4AsString() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString4AsString() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameString4AsString());
        System.out.println("Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS String === " + jMetaDataText.getDurationFirstFrameString4AsString());
    }

   /**
    * Test getDurationFirstFrameString4AsBoolean() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString4AsBoolean() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameString4AsBoolean());
        System.out.println("Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Boolean === " + jMetaDataText.getDurationFirstFrameString4AsBoolean());
    }

   /**
    * Test getDurationFirstFrameString4AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString4AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameString4AsBigInteger());
        System.out.println("Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS BigInteger === " + jMetaDataText.getDurationFirstFrameString4AsBigInteger());
    }

   /**
    * Test getDurationFirstFrameString4AsURL() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString4AsURL() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameString4AsURL());
        System.out.println("Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS URL === " + jMetaDataText.getDurationFirstFrameString4AsURL());
    }

   /**
    * Test getDurationFirstFrameString5AsInteger() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString5AsInteger() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameString5AsInteger());
        System.out.println("Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Integer === " + jMetaDataText.getDurationFirstFrameString5AsInteger());
    }

   /**
    * Test getDurationFirstFrameString5AsLong() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString5AsLong() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameString5AsLong());
        System.out.println("Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Long === " + jMetaDataText.getDurationFirstFrameString5AsLong());
    }

   /**
    * Test getDurationFirstFrameString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameString5AsLocalDateTime());
        System.out.println("Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS LocalDateTime === " + jMetaDataText.getDurationFirstFrameString5AsLocalDateTime());
    }

   /**
    * Test getDurationFirstFrameString5AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString5AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameString5AsLocalTime());
        System.out.println("Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS LocalTime === " + jMetaDataText.getDurationFirstFrameString5AsLocalTime());
    }

   /**
    * Test getDurationFirstFrameString5AsString() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString5AsString() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameString5AsString());
        System.out.println("Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS String === " + jMetaDataText.getDurationFirstFrameString5AsString());
    }

   /**
    * Test getDurationFirstFrameString5AsBoolean() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString5AsBoolean() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameString5AsBoolean());
        System.out.println("Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Boolean === " + jMetaDataText.getDurationFirstFrameString5AsBoolean());
    }

   /**
    * Test getDurationFirstFrameString5AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString5AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameString5AsBigInteger());
        System.out.println("Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS BigInteger === " + jMetaDataText.getDurationFirstFrameString5AsBigInteger());
    }

   /**
    * Test getDurationFirstFrameString5AsURL() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString5AsURL() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameString5AsURL());
        System.out.println("Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS URL === " + jMetaDataText.getDurationFirstFrameString5AsURL());
    }

   /**
    * Test getDurationFirstFrameString2AsInteger() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString2AsInteger() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameString2AsInteger());
        System.out.println("Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Integer === " + jMetaDataText.getDurationFirstFrameString2AsInteger());
    }

   /**
    * Test getDurationFirstFrameString2AsLong() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString2AsLong() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameString2AsLong());
        System.out.println("Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Long === " + jMetaDataText.getDurationFirstFrameString2AsLong());
    }

   /**
    * Test getDurationFirstFrameString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameString2AsLocalDateTime());
        System.out.println("Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS LocalDateTime === " + jMetaDataText.getDurationFirstFrameString2AsLocalDateTime());
    }

   /**
    * Test getDurationFirstFrameString2AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString2AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameString2AsLocalTime());
        System.out.println("Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS LocalTime === " + jMetaDataText.getDurationFirstFrameString2AsLocalTime());
    }

   /**
    * Test getDurationFirstFrameString2AsString() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString2AsString() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameString2AsString());
        System.out.println("Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS String === " + jMetaDataText.getDurationFirstFrameString2AsString());
    }

   /**
    * Test getDurationFirstFrameString2AsBoolean() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString2AsBoolean() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameString2AsBoolean());
        System.out.println("Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Boolean === " + jMetaDataText.getDurationFirstFrameString2AsBoolean());
    }

   /**
    * Test getDurationFirstFrameString2AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString2AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameString2AsBigInteger());
        System.out.println("Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS BigInteger === " + jMetaDataText.getDurationFirstFrameString2AsBigInteger());
    }

   /**
    * Test getDurationFirstFrameString2AsURL() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString2AsURL() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameString2AsURL());
        System.out.println("Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS URL === " + jMetaDataText.getDurationFirstFrameString2AsURL());
    }

   /**
    * Test getSourceDurationFirstFrameStringAsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameStringAsInteger());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Integer === " + jMetaDataText.getSourceDurationFirstFrameStringAsInteger());
    }

   /**
    * Test getSourceDurationFirstFrameStringAsLong() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsLong() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameStringAsLong());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Long === " + jMetaDataText.getSourceDurationFirstFrameStringAsLong());
    }

   /**
    * Test getSourceDurationFirstFrameStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameStringAsLocalDateTime());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS LocalDateTime === " + jMetaDataText.getSourceDurationFirstFrameStringAsLocalDateTime());
    }

   /**
    * Test getSourceDurationFirstFrameStringAsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameStringAsLocalTime());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS LocalTime === " + jMetaDataText.getSourceDurationFirstFrameStringAsLocalTime());
    }

   /**
    * Test getSourceDurationFirstFrameStringAsString() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsString() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameStringAsString());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS String === " + jMetaDataText.getSourceDurationFirstFrameStringAsString());
    }

   /**
    * Test getSourceDurationFirstFrameStringAsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameStringAsBoolean());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Boolean === " + jMetaDataText.getSourceDurationFirstFrameStringAsBoolean());
    }

   /**
    * Test getSourceDurationFirstFrameStringAsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameStringAsBigInteger());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS BigInteger === " + jMetaDataText.getSourceDurationFirstFrameStringAsBigInteger());
    }

   /**
    * Test getSourceDurationFirstFrameStringAsURL() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameStringAsURL() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameStringAsURL());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS URL === " + jMetaDataText.getSourceDurationFirstFrameStringAsURL());
    }

   /**
    * Test getDurationFirstFrameString3AsInteger() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString3AsInteger() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameString3AsInteger());
        System.out.println("Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM AS Integer === " + jMetaDataText.getDurationFirstFrameString3AsInteger());
    }

   /**
    * Test getDurationFirstFrameString3AsLong() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString3AsLong() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameString3AsLong());
        System.out.println("Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM AS Long === " + jMetaDataText.getDurationFirstFrameString3AsLong());
    }

   /**
    * Test getDurationFirstFrameString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameString3AsLocalDateTime());
        System.out.println("Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM AS LocalDateTime === " + jMetaDataText.getDurationFirstFrameString3AsLocalDateTime());
    }

   /**
    * Test getDurationFirstFrameString3AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString3AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameString3AsLocalTime());
        System.out.println("Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM AS LocalTime === " + jMetaDataText.getDurationFirstFrameString3AsLocalTime());
    }

   /**
    * Test getDurationFirstFrameString3AsString() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString3AsString() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameString3AsString());
        System.out.println("Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM AS String === " + jMetaDataText.getDurationFirstFrameString3AsString());
    }

   /**
    * Test getDurationFirstFrameString3AsBoolean() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString3AsBoolean() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameString3AsBoolean());
        System.out.println("Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM AS Boolean === " + jMetaDataText.getDurationFirstFrameString3AsBoolean());
    }

   /**
    * Test getDurationFirstFrameString3AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString3AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameString3AsBigInteger());
        System.out.println("Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM AS BigInteger === " + jMetaDataText.getDurationFirstFrameString3AsBigInteger());
    }

   /**
    * Test getDurationFirstFrameString3AsURL() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString3AsURL() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameString3AsURL());
        System.out.println("Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM AS URL === " + jMetaDataText.getDurationFirstFrameString3AsURL());
    }

   /**
    * Test getSourceDurationLastFrameAsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameAsInteger() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameAsInteger());
        System.out.println("Source Duration of the last frame if it is longer than others, in ms AS Integer === " + jMetaDataText.getSourceDurationLastFrameAsInteger());
    }

   /**
    * Test getSourceDurationLastFrameAsLong() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameAsLong() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameAsLong());
        System.out.println("Source Duration of the last frame if it is longer than others, in ms AS Long === " + jMetaDataText.getSourceDurationLastFrameAsLong());
    }

   /**
    * Test getSourceDurationLastFrameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameAsLocalDateTime());
        System.out.println("Source Duration of the last frame if it is longer than others, in ms AS LocalDateTime === " + jMetaDataText.getSourceDurationLastFrameAsLocalDateTime());
    }

   /**
    * Test getSourceDurationLastFrameAsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameAsLocalTime());
        System.out.println("Source Duration of the last frame if it is longer than others, in ms AS LocalTime === " + jMetaDataText.getSourceDurationLastFrameAsLocalTime());
    }

   /**
    * Test getSourceDurationLastFrameAsString() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameAsString() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameAsString());
        System.out.println("Source Duration of the last frame if it is longer than others, in ms AS String === " + jMetaDataText.getSourceDurationLastFrameAsString());
    }

   /**
    * Test getSourceDurationLastFrameAsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameAsBoolean() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameAsBoolean());
        System.out.println("Source Duration of the last frame if it is longer than others, in ms AS Boolean === " + jMetaDataText.getSourceDurationLastFrameAsBoolean());
    }

   /**
    * Test getSourceDurationLastFrameAsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameAsBigInteger());
        System.out.println("Source Duration of the last frame if it is longer than others, in ms AS BigInteger === " + jMetaDataText.getSourceDurationLastFrameAsBigInteger());
    }

   /**
    * Test getSourceDurationLastFrameAsURL() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameAsURL() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameAsURL());
        System.out.println("Source Duration of the last frame if it is longer than others, in ms AS URL === " + jMetaDataText.getSourceDurationLastFrameAsURL());
    }

   /**
    * Test getDurationFirstFrameString1AsInteger() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString1AsInteger() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameString1AsInteger());
        System.out.println("Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS Integer === " + jMetaDataText.getDurationFirstFrameString1AsInteger());
    }

   /**
    * Test getDurationFirstFrameString1AsLong() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString1AsLong() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameString1AsLong());
        System.out.println("Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS Long === " + jMetaDataText.getDurationFirstFrameString1AsLong());
    }

   /**
    * Test getDurationFirstFrameString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameString1AsLocalDateTime());
        System.out.println("Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS LocalDateTime === " + jMetaDataText.getDurationFirstFrameString1AsLocalDateTime());
    }

   /**
    * Test getDurationFirstFrameString1AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString1AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameString1AsLocalTime());
        System.out.println("Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS LocalTime === " + jMetaDataText.getDurationFirstFrameString1AsLocalTime());
    }

   /**
    * Test getDurationFirstFrameString1AsString() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString1AsString() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameString1AsString());
        System.out.println("Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS String === " + jMetaDataText.getDurationFirstFrameString1AsString());
    }

   /**
    * Test getDurationFirstFrameString1AsBoolean() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString1AsBoolean() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameString1AsBoolean());
        System.out.println("Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS Boolean === " + jMetaDataText.getDurationFirstFrameString1AsBoolean());
    }

   /**
    * Test getDurationFirstFrameString1AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString1AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameString1AsBigInteger());
        System.out.println("Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS BigInteger === " + jMetaDataText.getDurationFirstFrameString1AsBigInteger());
    }

   /**
    * Test getDurationFirstFrameString1AsURL() method.
    */
    @Test
    public void subTestGetDurationFirstFrameString1AsURL() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameString1AsURL());
        System.out.println("Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS URL === " + jMetaDataText.getDurationFirstFrameString1AsURL());
    }

   /**
    * Test getFormatCompressionAsInteger() method.
    */
    @Test
    public void subTestGetFormatCompressionAsInteger() {
        assertEquals(null, this.jMetaDataText.getFormatCompressionAsInteger());
        System.out.println("Compression method used AS Integer === " + jMetaDataText.getFormatCompressionAsInteger());
    }

   /**
    * Test getFormatCompressionAsLong() method.
    */
    @Test
    public void subTestGetFormatCompressionAsLong() {
        assertEquals(null, this.jMetaDataText.getFormatCompressionAsLong());
        System.out.println("Compression method used AS Long === " + jMetaDataText.getFormatCompressionAsLong());
    }

   /**
    * Test getFormatCompressionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatCompressionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getFormatCompressionAsLocalDateTime());
        System.out.println("Compression method used AS LocalDateTime === " + jMetaDataText.getFormatCompressionAsLocalDateTime());
    }

   /**
    * Test getFormatCompressionAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatCompressionAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getFormatCompressionAsLocalTime());
        System.out.println("Compression method used AS LocalTime === " + jMetaDataText.getFormatCompressionAsLocalTime());
    }

   /**
    * Test getFormatCompressionAsString() method.
    */
    @Test
    public void subTestGetFormatCompressionAsString() {
        assertEquals(null, this.jMetaDataText.getFormatCompressionAsString());
        System.out.println("Compression method used AS String === " + jMetaDataText.getFormatCompressionAsString());
    }

   /**
    * Test getFormatCompressionAsBoolean() method.
    */
    @Test
    public void subTestGetFormatCompressionAsBoolean() {
        assertEquals(null, this.jMetaDataText.getFormatCompressionAsBoolean());
        System.out.println("Compression method used AS Boolean === " + jMetaDataText.getFormatCompressionAsBoolean());
    }

   /**
    * Test getFormatCompressionAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatCompressionAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getFormatCompressionAsBigInteger());
        System.out.println("Compression method used AS BigInteger === " + jMetaDataText.getFormatCompressionAsBigInteger());
    }

   /**
    * Test getFormatCompressionAsURL() method.
    */
    @Test
    public void subTestGetFormatCompressionAsURL() {
        assertEquals(null, this.jMetaDataText.getFormatCompressionAsURL());
        System.out.println("Compression method used AS URL === " + jMetaDataText.getFormatCompressionAsURL());
    }

   /**
    * Test getDelayStringAsInteger() method.
    */
    @Test
    public void subTestGetDelayStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getDelayStringAsInteger());
        System.out.println("Delay with measurement AS Integer === " + jMetaDataText.getDelayStringAsInteger());
    }

   /**
    * Test getDelayStringAsLong() method.
    */
    @Test
    public void subTestGetDelayStringAsLong() {
        assertEquals(null, this.jMetaDataText.getDelayStringAsLong());
        System.out.println("Delay with measurement AS Long === " + jMetaDataText.getDelayStringAsLong());
    }

   /**
    * Test getDelayStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDelayStringAsLocalDateTime());
        System.out.println("Delay with measurement AS LocalDateTime === " + jMetaDataText.getDelayStringAsLocalDateTime());
    }

   /**
    * Test getDelayStringAsLocalTime() method.
    */
    @Test
    public void subTestGetDelayStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDelayStringAsLocalTime());
        System.out.println("Delay with measurement AS LocalTime === " + jMetaDataText.getDelayStringAsLocalTime());
    }

   /**
    * Test getDelayStringAsString() method.
    */
    @Test
    public void subTestGetDelayStringAsString() {
        assertEquals(null, this.jMetaDataText.getDelayStringAsString());
        System.out.println("Delay with measurement AS String === " + jMetaDataText.getDelayStringAsString());
    }

   /**
    * Test getDelayStringAsBoolean() method.
    */
    @Test
    public void subTestGetDelayStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getDelayStringAsBoolean());
        System.out.println("Delay with measurement AS Boolean === " + jMetaDataText.getDelayStringAsBoolean());
    }

   /**
    * Test getDelayStringAsBigInteger() method.
    */
    @Test
    public void subTestGetDelayStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDelayStringAsBigInteger());
        System.out.println("Delay with measurement AS BigInteger === " + jMetaDataText.getDelayStringAsBigInteger());
    }

   /**
    * Test getDelayStringAsURL() method.
    */
    @Test
    public void subTestGetDelayStringAsURL() {
        assertEquals(null, this.jMetaDataText.getDelayStringAsURL());
        System.out.println("Delay with measurement AS URL === " + jMetaDataText.getDelayStringAsURL());
    }

   /**
    * Test getMuxingModeMoreInfoAsInteger() method.
    */
    @Test
    public void subTestGetMuxingModeMoreInfoAsInteger() {
        assertEquals(null, this.jMetaDataText.getMuxingModeMoreInfoAsInteger());
        System.out.println("More info (text) about the muxing mode AS Integer === " + jMetaDataText.getMuxingModeMoreInfoAsInteger());
    }

   /**
    * Test getMuxingModeMoreInfoAsLong() method.
    */
    @Test
    public void subTestGetMuxingModeMoreInfoAsLong() {
        assertEquals(null, this.jMetaDataText.getMuxingModeMoreInfoAsLong());
        System.out.println("More info (text) about the muxing mode AS Long === " + jMetaDataText.getMuxingModeMoreInfoAsLong());
    }

   /**
    * Test getMuxingModeMoreInfoAsLocalDateTime() method.
    */
    @Test
    public void subTestGetMuxingModeMoreInfoAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getMuxingModeMoreInfoAsLocalDateTime());
        System.out.println("More info (text) about the muxing mode AS LocalDateTime === " + jMetaDataText.getMuxingModeMoreInfoAsLocalDateTime());
    }

   /**
    * Test getMuxingModeMoreInfoAsLocalTime() method.
    */
    @Test
    public void subTestGetMuxingModeMoreInfoAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getMuxingModeMoreInfoAsLocalTime());
        System.out.println("More info (text) about the muxing mode AS LocalTime === " + jMetaDataText.getMuxingModeMoreInfoAsLocalTime());
    }

   /**
    * Test getMuxingModeMoreInfoAsString() method.
    */
    @Test
    public void subTestGetMuxingModeMoreInfoAsString() {
        assertEquals(null, this.jMetaDataText.getMuxingModeMoreInfoAsString());
        System.out.println("More info (text) about the muxing mode AS String === " + jMetaDataText.getMuxingModeMoreInfoAsString());
    }

   /**
    * Test getMuxingModeMoreInfoAsBoolean() method.
    */
    @Test
    public void subTestGetMuxingModeMoreInfoAsBoolean() {
        assertEquals(null, this.jMetaDataText.getMuxingModeMoreInfoAsBoolean());
        System.out.println("More info (text) about the muxing mode AS Boolean === " + jMetaDataText.getMuxingModeMoreInfoAsBoolean());
    }

   /**
    * Test getMuxingModeMoreInfoAsBigInteger() method.
    */
    @Test
    public void subTestGetMuxingModeMoreInfoAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getMuxingModeMoreInfoAsBigInteger());
        System.out.println("More info (text) about the muxing mode AS BigInteger === " + jMetaDataText.getMuxingModeMoreInfoAsBigInteger());
    }

   /**
    * Test getMuxingModeMoreInfoAsURL() method.
    */
    @Test
    public void subTestGetMuxingModeMoreInfoAsURL() {
        assertEquals(null, this.jMetaDataText.getMuxingModeMoreInfoAsURL());
        System.out.println("More info (text) about the muxing mode AS URL === " + jMetaDataText.getMuxingModeMoreInfoAsURL());
    }

   /**
    * Test getSourceStreamSizeEncodedStringAsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedStringAsInteger());
        System.out.println("Source Encoded Streamsize in with percentage value AS Integer === " + jMetaDataText.getSourceStreamSizeEncodedStringAsInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedStringAsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsLong() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedStringAsLong());
        System.out.println("Source Encoded Streamsize in with percentage value AS Long === " + jMetaDataText.getSourceStreamSizeEncodedStringAsLong());
    }

   /**
    * Test getSourceStreamSizeEncodedStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedStringAsLocalDateTime());
        System.out.println("Source Encoded Streamsize in with percentage value AS LocalDateTime === " + jMetaDataText.getSourceStreamSizeEncodedStringAsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeEncodedStringAsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedStringAsLocalTime());
        System.out.println("Source Encoded Streamsize in with percentage value AS LocalTime === " + jMetaDataText.getSourceStreamSizeEncodedStringAsLocalTime());
    }

   /**
    * Test getSourceStreamSizeEncodedStringAsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsString() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedStringAsString());
        System.out.println("Source Encoded Streamsize in with percentage value AS String === " + jMetaDataText.getSourceStreamSizeEncodedStringAsString());
    }

   /**
    * Test getSourceStreamSizeEncodedStringAsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedStringAsBoolean());
        System.out.println("Source Encoded Streamsize in with percentage value AS Boolean === " + jMetaDataText.getSourceStreamSizeEncodedStringAsBoolean());
    }

   /**
    * Test getSourceStreamSizeEncodedStringAsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedStringAsBigInteger());
        System.out.println("Source Encoded Streamsize in with percentage value AS BigInteger === " + jMetaDataText.getSourceStreamSizeEncodedStringAsBigInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedStringAsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedStringAsURL() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedStringAsURL());
        System.out.println("Source Encoded Streamsize in with percentage value AS URL === " + jMetaDataText.getSourceStreamSizeEncodedStringAsURL());
    }

   /**
    * Test getCodecIDDescriptionAsInteger() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsInteger() {
        assertEquals(null, this.jMetaDataText.getCodecIDDescriptionAsInteger());
        System.out.println("Manual description given by the container AS Integer === " + jMetaDataText.getCodecIDDescriptionAsInteger());
    }

   /**
    * Test getCodecIDDescriptionAsLong() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsLong() {
        assertEquals(null, this.jMetaDataText.getCodecIDDescriptionAsLong());
        System.out.println("Manual description given by the container AS Long === " + jMetaDataText.getCodecIDDescriptionAsLong());
    }

   /**
    * Test getCodecIDDescriptionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getCodecIDDescriptionAsLocalDateTime());
        System.out.println("Manual description given by the container AS LocalDateTime === " + jMetaDataText.getCodecIDDescriptionAsLocalDateTime());
    }

   /**
    * Test getCodecIDDescriptionAsLocalTime() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getCodecIDDescriptionAsLocalTime());
        System.out.println("Manual description given by the container AS LocalTime === " + jMetaDataText.getCodecIDDescriptionAsLocalTime());
    }

   /**
    * Test getCodecIDDescriptionAsString() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsString() {
        assertEquals(null, this.jMetaDataText.getCodecIDDescriptionAsString());
        System.out.println("Manual description given by the container AS String === " + jMetaDataText.getCodecIDDescriptionAsString());
    }

   /**
    * Test getCodecIDDescriptionAsBoolean() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsBoolean() {
        assertEquals(null, this.jMetaDataText.getCodecIDDescriptionAsBoolean());
        System.out.println("Manual description given by the container AS Boolean === " + jMetaDataText.getCodecIDDescriptionAsBoolean());
    }

   /**
    * Test getCodecIDDescriptionAsBigInteger() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getCodecIDDescriptionAsBigInteger());
        System.out.println("Manual description given by the container AS BigInteger === " + jMetaDataText.getCodecIDDescriptionAsBigInteger());
    }

   /**
    * Test getCodecIDDescriptionAsURL() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsURL() {
        assertEquals(null, this.jMetaDataText.getCodecIDDescriptionAsURL());
        System.out.println("Manual description given by the container AS URL === " + jMetaDataText.getCodecIDDescriptionAsURL());
    }

   /**
    * Test getStatusAsInteger() method.
    */
    @Test
    public void subTestGetStatusAsInteger() {
        assertEquals(null, this.jMetaDataText.getStatusAsInteger());
        System.out.println("bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished) AS Integer === " + jMetaDataText.getStatusAsInteger());
    }

   /**
    * Test getStatusAsLong() method.
    */
    @Test
    public void subTestGetStatusAsLong() {
        assertEquals(null, this.jMetaDataText.getStatusAsLong());
        System.out.println("bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished) AS Long === " + jMetaDataText.getStatusAsLong());
    }

   /**
    * Test getStatusAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStatusAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getStatusAsLocalDateTime());
        System.out.println("bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished) AS LocalDateTime === " + jMetaDataText.getStatusAsLocalDateTime());
    }

   /**
    * Test getStatusAsLocalTime() method.
    */
    @Test
    public void subTestGetStatusAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getStatusAsLocalTime());
        System.out.println("bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished) AS LocalTime === " + jMetaDataText.getStatusAsLocalTime());
    }

   /**
    * Test getStatusAsString() method.
    */
    @Test
    public void subTestGetStatusAsString() {
        assertEquals(null, this.jMetaDataText.getStatusAsString());
        System.out.println("bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished) AS String === " + jMetaDataText.getStatusAsString());
    }

   /**
    * Test getStatusAsBoolean() method.
    */
    @Test
    public void subTestGetStatusAsBoolean() {
        assertEquals(null, this.jMetaDataText.getStatusAsBoolean());
        System.out.println("bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished) AS Boolean === " + jMetaDataText.getStatusAsBoolean());
    }

   /**
    * Test getStatusAsBigInteger() method.
    */
    @Test
    public void subTestGetStatusAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getStatusAsBigInteger());
        System.out.println("bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished) AS BigInteger === " + jMetaDataText.getStatusAsBigInteger());
    }

   /**
    * Test getStatusAsURL() method.
    */
    @Test
    public void subTestGetStatusAsURL() {
        assertEquals(null, this.jMetaDataText.getStatusAsURL());
        System.out.println("bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished) AS URL === " + jMetaDataText.getStatusAsURL());
    }

   /**
    * Test getDurationFirstFrameStringAsInteger() method.
    */
    @Test
    public void subTestGetDurationFirstFrameStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameStringAsInteger());
        System.out.println("Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Integer === " + jMetaDataText.getDurationFirstFrameStringAsInteger());
    }

   /**
    * Test getDurationFirstFrameStringAsLong() method.
    */
    @Test
    public void subTestGetDurationFirstFrameStringAsLong() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameStringAsLong());
        System.out.println("Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Long === " + jMetaDataText.getDurationFirstFrameStringAsLong());
    }

   /**
    * Test getDurationFirstFrameStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationFirstFrameStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameStringAsLocalDateTime());
        System.out.println("Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS LocalDateTime === " + jMetaDataText.getDurationFirstFrameStringAsLocalDateTime());
    }

   /**
    * Test getDurationFirstFrameStringAsLocalTime() method.
    */
    @Test
    public void subTestGetDurationFirstFrameStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameStringAsLocalTime());
        System.out.println("Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS LocalTime === " + jMetaDataText.getDurationFirstFrameStringAsLocalTime());
    }

   /**
    * Test getDurationFirstFrameStringAsString() method.
    */
    @Test
    public void subTestGetDurationFirstFrameStringAsString() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameStringAsString());
        System.out.println("Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS String === " + jMetaDataText.getDurationFirstFrameStringAsString());
    }

   /**
    * Test getDurationFirstFrameStringAsBoolean() method.
    */
    @Test
    public void subTestGetDurationFirstFrameStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameStringAsBoolean());
        System.out.println("Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Boolean === " + jMetaDataText.getDurationFirstFrameStringAsBoolean());
    }

   /**
    * Test getDurationFirstFrameStringAsBigInteger() method.
    */
    @Test
    public void subTestGetDurationFirstFrameStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameStringAsBigInteger());
        System.out.println("Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS BigInteger === " + jMetaDataText.getDurationFirstFrameStringAsBigInteger());
    }

   /**
    * Test getDurationFirstFrameStringAsURL() method.
    */
    @Test
    public void subTestGetDurationFirstFrameStringAsURL() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameStringAsURL());
        System.out.println("Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS URL === " + jMetaDataText.getDurationFirstFrameStringAsURL());
    }

   /**
    * Test getFrameRateAsInteger() method.
    */
    @Test
    public void subTestGetFrameRateAsInteger() {
        assertEquals(null, this.jMetaDataText.getFrameRateAsInteger());
        System.out.println("Frames per second AS Integer === " + jMetaDataText.getFrameRateAsInteger());
    }

   /**
    * Test getFrameRateAsLong() method.
    */
    @Test
    public void subTestGetFrameRateAsLong() {
        assertEquals(null, this.jMetaDataText.getFrameRateAsLong());
        System.out.println("Frames per second AS Long === " + jMetaDataText.getFrameRateAsLong());
    }

   /**
    * Test getFrameRateAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFrameRateAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getFrameRateAsLocalDateTime());
        System.out.println("Frames per second AS LocalDateTime === " + jMetaDataText.getFrameRateAsLocalDateTime());
    }

   /**
    * Test getFrameRateAsLocalTime() method.
    */
    @Test
    public void subTestGetFrameRateAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getFrameRateAsLocalTime());
        System.out.println("Frames per second AS LocalTime === " + jMetaDataText.getFrameRateAsLocalTime());
    }

   /**
    * Test getFrameRateAsString() method.
    */
    @Test
    public void subTestGetFrameRateAsString() {
        assertEquals(null, this.jMetaDataText.getFrameRateAsString());
        System.out.println("Frames per second AS String === " + jMetaDataText.getFrameRateAsString());
    }

   /**
    * Test getFrameRateAsBoolean() method.
    */
    @Test
    public void subTestGetFrameRateAsBoolean() {
        assertEquals(null, this.jMetaDataText.getFrameRateAsBoolean());
        System.out.println("Frames per second AS Boolean === " + jMetaDataText.getFrameRateAsBoolean());
    }

   /**
    * Test getFrameRateAsBigInteger() method.
    */
    @Test
    public void subTestGetFrameRateAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getFrameRateAsBigInteger());
        System.out.println("Frames per second AS BigInteger === " + jMetaDataText.getFrameRateAsBigInteger());
    }

   /**
    * Test getFrameRateAsURL() method.
    */
    @Test
    public void subTestGetFrameRateAsURL() {
        assertEquals(null, this.jMetaDataText.getFrameRateAsURL());
        System.out.println("Frames per second AS URL === " + jMetaDataText.getFrameRateAsURL());
    }

   /**
    * Test getServiceKindStringAsInteger() method.
    */
    @Test
    public void subTestGetServiceKindStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getServiceKindStringAsInteger());
        System.out.println("Service kind (full) AS Integer === " + jMetaDataText.getServiceKindStringAsInteger());
    }

   /**
    * Test getServiceKindStringAsLong() method.
    */
    @Test
    public void subTestGetServiceKindStringAsLong() {
        assertEquals(null, this.jMetaDataText.getServiceKindStringAsLong());
        System.out.println("Service kind (full) AS Long === " + jMetaDataText.getServiceKindStringAsLong());
    }

   /**
    * Test getServiceKindStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetServiceKindStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getServiceKindStringAsLocalDateTime());
        System.out.println("Service kind (full) AS LocalDateTime === " + jMetaDataText.getServiceKindStringAsLocalDateTime());
    }

   /**
    * Test getServiceKindStringAsLocalTime() method.
    */
    @Test
    public void subTestGetServiceKindStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getServiceKindStringAsLocalTime());
        System.out.println("Service kind (full) AS LocalTime === " + jMetaDataText.getServiceKindStringAsLocalTime());
    }

   /**
    * Test getServiceKindStringAsString() method.
    */
    @Test
    public void subTestGetServiceKindStringAsString() {
        assertEquals(null, this.jMetaDataText.getServiceKindStringAsString());
        System.out.println("Service kind (full) AS String === " + jMetaDataText.getServiceKindStringAsString());
    }

   /**
    * Test getServiceKindStringAsBoolean() method.
    */
    @Test
    public void subTestGetServiceKindStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getServiceKindStringAsBoolean());
        System.out.println("Service kind (full) AS Boolean === " + jMetaDataText.getServiceKindStringAsBoolean());
    }

   /**
    * Test getServiceKindStringAsBigInteger() method.
    */
    @Test
    public void subTestGetServiceKindStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getServiceKindStringAsBigInteger());
        System.out.println("Service kind (full) AS BigInteger === " + jMetaDataText.getServiceKindStringAsBigInteger());
    }

   /**
    * Test getServiceKindStringAsURL() method.
    */
    @Test
    public void subTestGetServiceKindStringAsURL() {
        assertEquals(null, this.jMetaDataText.getServiceKindStringAsURL());
        System.out.println("Service kind (full) AS URL === " + jMetaDataText.getServiceKindStringAsURL());
    }

   /**
    * Test getMuxingModeAsInteger() method.
    */
    @Test
    public void subTestGetMuxingModeAsInteger() {
        assertEquals(null, this.jMetaDataText.getMuxingModeAsInteger());
        System.out.println("How this stream is muxed in the container AS Integer === " + jMetaDataText.getMuxingModeAsInteger());
    }

   /**
    * Test getMuxingModeAsLong() method.
    */
    @Test
    public void subTestGetMuxingModeAsLong() {
        assertEquals(null, this.jMetaDataText.getMuxingModeAsLong());
        System.out.println("How this stream is muxed in the container AS Long === " + jMetaDataText.getMuxingModeAsLong());
    }

   /**
    * Test getMuxingModeAsLocalDateTime() method.
    */
    @Test
    public void subTestGetMuxingModeAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getMuxingModeAsLocalDateTime());
        System.out.println("How this stream is muxed in the container AS LocalDateTime === " + jMetaDataText.getMuxingModeAsLocalDateTime());
    }

   /**
    * Test getMuxingModeAsLocalTime() method.
    */
    @Test
    public void subTestGetMuxingModeAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getMuxingModeAsLocalTime());
        System.out.println("How this stream is muxed in the container AS LocalTime === " + jMetaDataText.getMuxingModeAsLocalTime());
    }

   /**
    * Test getMuxingModeAsString() method.
    */
    @Test
    public void subTestGetMuxingModeAsString() {
        assertEquals(null, this.jMetaDataText.getMuxingModeAsString());
        System.out.println("How this stream is muxed in the container AS String === " + jMetaDataText.getMuxingModeAsString());
    }

   /**
    * Test getMuxingModeAsBoolean() method.
    */
    @Test
    public void subTestGetMuxingModeAsBoolean() {
        assertEquals(null, this.jMetaDataText.getMuxingModeAsBoolean());
        System.out.println("How this stream is muxed in the container AS Boolean === " + jMetaDataText.getMuxingModeAsBoolean());
    }

   /**
    * Test getMuxingModeAsBigInteger() method.
    */
    @Test
    public void subTestGetMuxingModeAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getMuxingModeAsBigInteger());
        System.out.println("How this stream is muxed in the container AS BigInteger === " + jMetaDataText.getMuxingModeAsBigInteger());
    }

   /**
    * Test getMuxingModeAsURL() method.
    */
    @Test
    public void subTestGetMuxingModeAsURL() {
        assertEquals(null, this.jMetaDataText.getMuxingModeAsURL());
        System.out.println("How this stream is muxed in the container AS URL === " + jMetaDataText.getMuxingModeAsURL());
    }

   /**
    * Test getDelaySettingsAsInteger() method.
    */
    @Test
    public void subTestGetDelaySettingsAsInteger() {
        assertEquals(null, this.jMetaDataText.getDelaySettingsAsInteger());
        System.out.println("Delay settings (in case of timecode for example) AS Integer === " + jMetaDataText.getDelaySettingsAsInteger());
    }

   /**
    * Test getDelaySettingsAsLong() method.
    */
    @Test
    public void subTestGetDelaySettingsAsLong() {
        assertEquals(null, this.jMetaDataText.getDelaySettingsAsLong());
        System.out.println("Delay settings (in case of timecode for example) AS Long === " + jMetaDataText.getDelaySettingsAsLong());
    }

   /**
    * Test getDelaySettingsAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelaySettingsAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDelaySettingsAsLocalDateTime());
        System.out.println("Delay settings (in case of timecode for example) AS LocalDateTime === " + jMetaDataText.getDelaySettingsAsLocalDateTime());
    }

   /**
    * Test getDelaySettingsAsLocalTime() method.
    */
    @Test
    public void subTestGetDelaySettingsAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDelaySettingsAsLocalTime());
        System.out.println("Delay settings (in case of timecode for example) AS LocalTime === " + jMetaDataText.getDelaySettingsAsLocalTime());
    }

   /**
    * Test getDelaySettingsAsString() method.
    */
    @Test
    public void subTestGetDelaySettingsAsString() {
        assertEquals(null, this.jMetaDataText.getDelaySettingsAsString());
        System.out.println("Delay settings (in case of timecode for example) AS String === " + jMetaDataText.getDelaySettingsAsString());
    }

   /**
    * Test getDelaySettingsAsBoolean() method.
    */
    @Test
    public void subTestGetDelaySettingsAsBoolean() {
        assertEquals(null, this.jMetaDataText.getDelaySettingsAsBoolean());
        System.out.println("Delay settings (in case of timecode for example) AS Boolean === " + jMetaDataText.getDelaySettingsAsBoolean());
    }

   /**
    * Test getDelaySettingsAsBigInteger() method.
    */
    @Test
    public void subTestGetDelaySettingsAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDelaySettingsAsBigInteger());
        System.out.println("Delay settings (in case of timecode for example) AS BigInteger === " + jMetaDataText.getDelaySettingsAsBigInteger());
    }

   /**
    * Test getDelaySettingsAsURL() method.
    */
    @Test
    public void subTestGetDelaySettingsAsURL() {
        assertEquals(null, this.jMetaDataText.getDelaySettingsAsURL());
        System.out.println("Delay settings (in case of timecode for example) AS URL === " + jMetaDataText.getDelaySettingsAsURL());
    }

   /**
    * Test getSourceStreamSizeEncodedAsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsInteger() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedAsInteger());
        System.out.println("Source Encoded Streamsize in bytes AS Integer === " + jMetaDataText.getSourceStreamSizeEncodedAsInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedAsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsLong() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedAsLong());
        System.out.println("Source Encoded Streamsize in bytes AS Long === " + jMetaDataText.getSourceStreamSizeEncodedAsLong());
    }

   /**
    * Test getSourceStreamSizeEncodedAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedAsLocalDateTime());
        System.out.println("Source Encoded Streamsize in bytes AS LocalDateTime === " + jMetaDataText.getSourceStreamSizeEncodedAsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeEncodedAsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedAsLocalTime());
        System.out.println("Source Encoded Streamsize in bytes AS LocalTime === " + jMetaDataText.getSourceStreamSizeEncodedAsLocalTime());
    }

   /**
    * Test getSourceStreamSizeEncodedAsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsString() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedAsString());
        System.out.println("Source Encoded Streamsize in bytes AS String === " + jMetaDataText.getSourceStreamSizeEncodedAsString());
    }

   /**
    * Test getSourceStreamSizeEncodedAsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsBoolean() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedAsBoolean());
        System.out.println("Source Encoded Streamsize in bytes AS Boolean === " + jMetaDataText.getSourceStreamSizeEncodedAsBoolean());
    }

   /**
    * Test getSourceStreamSizeEncodedAsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedAsBigInteger());
        System.out.println("Source Encoded Streamsize in bytes AS BigInteger === " + jMetaDataText.getSourceStreamSizeEncodedAsBigInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedAsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedAsURL() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedAsURL());
        System.out.println("Source Encoded Streamsize in bytes AS URL === " + jMetaDataText.getSourceStreamSizeEncodedAsURL());
    }

   /**
    * Test getBitRateModeStringAsInteger() method.
    */
    @Test
    public void subTestGetBitRateModeStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getBitRateModeStringAsInteger());
        System.out.println("Bit rate mode (Constant, Variable) AS Integer === " + jMetaDataText.getBitRateModeStringAsInteger());
    }

   /**
    * Test getBitRateModeStringAsLong() method.
    */
    @Test
    public void subTestGetBitRateModeStringAsLong() {
        assertEquals(null, this.jMetaDataText.getBitRateModeStringAsLong());
        System.out.println("Bit rate mode (Constant, Variable) AS Long === " + jMetaDataText.getBitRateModeStringAsLong());
    }

   /**
    * Test getBitRateModeStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitRateModeStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getBitRateModeStringAsLocalDateTime());
        System.out.println("Bit rate mode (Constant, Variable) AS LocalDateTime === " + jMetaDataText.getBitRateModeStringAsLocalDateTime());
    }

   /**
    * Test getBitRateModeStringAsLocalTime() method.
    */
    @Test
    public void subTestGetBitRateModeStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getBitRateModeStringAsLocalTime());
        System.out.println("Bit rate mode (Constant, Variable) AS LocalTime === " + jMetaDataText.getBitRateModeStringAsLocalTime());
    }

   /**
    * Test getBitRateModeStringAsString() method.
    */
    @Test
    public void subTestGetBitRateModeStringAsString() {
        assertEquals(null, this.jMetaDataText.getBitRateModeStringAsString());
        System.out.println("Bit rate mode (Constant, Variable) AS String === " + jMetaDataText.getBitRateModeStringAsString());
    }

   /**
    * Test getBitRateModeStringAsBoolean() method.
    */
    @Test
    public void subTestGetBitRateModeStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getBitRateModeStringAsBoolean());
        System.out.println("Bit rate mode (Constant, Variable) AS Boolean === " + jMetaDataText.getBitRateModeStringAsBoolean());
    }

   /**
    * Test getBitRateModeStringAsBigInteger() method.
    */
    @Test
    public void subTestGetBitRateModeStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getBitRateModeStringAsBigInteger());
        System.out.println("Bit rate mode (Constant, Variable) AS BigInteger === " + jMetaDataText.getBitRateModeStringAsBigInteger());
    }

   /**
    * Test getBitRateModeStringAsURL() method.
    */
    @Test
    public void subTestGetBitRateModeStringAsURL() {
        assertEquals(null, this.jMetaDataText.getBitRateModeStringAsURL());
        System.out.println("Bit rate mode (Constant, Variable) AS URL === " + jMetaDataText.getBitRateModeStringAsURL());
    }

   /**
    * Test getFrameRateMinimumStringAsInteger() method.
    */
    @Test
    public void subTestGetFrameRateMinimumStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getFrameRateMinimumStringAsInteger());
        System.out.println("Minimum Frames per second (with measurement) AS Integer === " + jMetaDataText.getFrameRateMinimumStringAsInteger());
    }

   /**
    * Test getFrameRateMinimumStringAsLong() method.
    */
    @Test
    public void subTestGetFrameRateMinimumStringAsLong() {
        assertEquals(null, this.jMetaDataText.getFrameRateMinimumStringAsLong());
        System.out.println("Minimum Frames per second (with measurement) AS Long === " + jMetaDataText.getFrameRateMinimumStringAsLong());
    }

   /**
    * Test getFrameRateMinimumStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFrameRateMinimumStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getFrameRateMinimumStringAsLocalDateTime());
        System.out.println("Minimum Frames per second (with measurement) AS LocalDateTime === " + jMetaDataText.getFrameRateMinimumStringAsLocalDateTime());
    }

   /**
    * Test getFrameRateMinimumStringAsLocalTime() method.
    */
    @Test
    public void subTestGetFrameRateMinimumStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getFrameRateMinimumStringAsLocalTime());
        System.out.println("Minimum Frames per second (with measurement) AS LocalTime === " + jMetaDataText.getFrameRateMinimumStringAsLocalTime());
    }

   /**
    * Test getFrameRateMinimumStringAsString() method.
    */
    @Test
    public void subTestGetFrameRateMinimumStringAsString() {
        assertEquals(null, this.jMetaDataText.getFrameRateMinimumStringAsString());
        System.out.println("Minimum Frames per second (with measurement) AS String === " + jMetaDataText.getFrameRateMinimumStringAsString());
    }

   /**
    * Test getFrameRateMinimumStringAsBoolean() method.
    */
    @Test
    public void subTestGetFrameRateMinimumStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getFrameRateMinimumStringAsBoolean());
        System.out.println("Minimum Frames per second (with measurement) AS Boolean === " + jMetaDataText.getFrameRateMinimumStringAsBoolean());
    }

   /**
    * Test getFrameRateMinimumStringAsBigInteger() method.
    */
    @Test
    public void subTestGetFrameRateMinimumStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getFrameRateMinimumStringAsBigInteger());
        System.out.println("Minimum Frames per second (with measurement) AS BigInteger === " + jMetaDataText.getFrameRateMinimumStringAsBigInteger());
    }

   /**
    * Test getFrameRateMinimumStringAsURL() method.
    */
    @Test
    public void subTestGetFrameRateMinimumStringAsURL() {
        assertEquals(null, this.jMetaDataText.getFrameRateMinimumStringAsURL());
        System.out.println("Minimum Frames per second (with measurement) AS URL === " + jMetaDataText.getFrameRateMinimumStringAsURL());
    }

   /**
    * Test getEncodedLibraryVersionAsInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryVersionAsInteger() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryVersionAsInteger());
        System.out.println("Version of encoding-software AS Integer === " + jMetaDataText.getEncodedLibraryVersionAsInteger());
    }

   /**
    * Test getEncodedLibraryVersionAsLong() method.
    */
    @Test
    public void subTestGetEncodedLibraryVersionAsLong() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryVersionAsLong());
        System.out.println("Version of encoding-software AS Long === " + jMetaDataText.getEncodedLibraryVersionAsLong());
    }

   /**
    * Test getEncodedLibraryVersionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryVersionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryVersionAsLocalDateTime());
        System.out.println("Version of encoding-software AS LocalDateTime === " + jMetaDataText.getEncodedLibraryVersionAsLocalDateTime());
    }

   /**
    * Test getEncodedLibraryVersionAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryVersionAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryVersionAsLocalTime());
        System.out.println("Version of encoding-software AS LocalTime === " + jMetaDataText.getEncodedLibraryVersionAsLocalTime());
    }

   /**
    * Test getEncodedLibraryVersionAsString() method.
    */
    @Test
    public void subTestGetEncodedLibraryVersionAsString() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryVersionAsString());
        System.out.println("Version of encoding-software AS String === " + jMetaDataText.getEncodedLibraryVersionAsString());
    }

   /**
    * Test getEncodedLibraryVersionAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedLibraryVersionAsBoolean() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryVersionAsBoolean());
        System.out.println("Version of encoding-software AS Boolean === " + jMetaDataText.getEncodedLibraryVersionAsBoolean());
    }

   /**
    * Test getEncodedLibraryVersionAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryVersionAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryVersionAsBigInteger());
        System.out.println("Version of encoding-software AS BigInteger === " + jMetaDataText.getEncodedLibraryVersionAsBigInteger());
    }

   /**
    * Test getEncodedLibraryVersionAsURL() method.
    */
    @Test
    public void subTestGetEncodedLibraryVersionAsURL() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryVersionAsURL());
        System.out.println("Version of encoding-software AS URL === " + jMetaDataText.getEncodedLibraryVersionAsURL());
    }

   /**
    * Test getSourceDurationLastFrameStringAsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameStringAsInteger());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Integer === " + jMetaDataText.getSourceDurationLastFrameStringAsInteger());
    }

   /**
    * Test getSourceDurationLastFrameStringAsLong() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsLong() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameStringAsLong());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Long === " + jMetaDataText.getSourceDurationLastFrameStringAsLong());
    }

   /**
    * Test getSourceDurationLastFrameStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameStringAsLocalDateTime());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS LocalDateTime === " + jMetaDataText.getSourceDurationLastFrameStringAsLocalDateTime());
    }

   /**
    * Test getSourceDurationLastFrameStringAsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameStringAsLocalTime());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS LocalTime === " + jMetaDataText.getSourceDurationLastFrameStringAsLocalTime());
    }

   /**
    * Test getSourceDurationLastFrameStringAsString() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsString() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameStringAsString());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS String === " + jMetaDataText.getSourceDurationLastFrameStringAsString());
    }

   /**
    * Test getSourceDurationLastFrameStringAsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameStringAsBoolean());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Boolean === " + jMetaDataText.getSourceDurationLastFrameStringAsBoolean());
    }

   /**
    * Test getSourceDurationLastFrameStringAsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameStringAsBigInteger());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS BigInteger === " + jMetaDataText.getSourceDurationLastFrameStringAsBigInteger());
    }

   /**
    * Test getSourceDurationLastFrameStringAsURL() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameStringAsURL() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameStringAsURL());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS URL === " + jMetaDataText.getSourceDurationLastFrameStringAsURL());
    }

   /**
    * Test getCodecIDInfoAsInteger() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsInteger() {
        assertEquals(null, this.jMetaDataText.getCodecIDInfoAsInteger());
        System.out.println("Info about codec ID AS Integer === " + jMetaDataText.getCodecIDInfoAsInteger());
    }

   /**
    * Test getCodecIDInfoAsLong() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsLong() {
        assertEquals(null, this.jMetaDataText.getCodecIDInfoAsLong());
        System.out.println("Info about codec ID AS Long === " + jMetaDataText.getCodecIDInfoAsLong());
    }

   /**
    * Test getCodecIDInfoAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getCodecIDInfoAsLocalDateTime());
        System.out.println("Info about codec ID AS LocalDateTime === " + jMetaDataText.getCodecIDInfoAsLocalDateTime());
    }

   /**
    * Test getCodecIDInfoAsLocalTime() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getCodecIDInfoAsLocalTime());
        System.out.println("Info about codec ID AS LocalTime === " + jMetaDataText.getCodecIDInfoAsLocalTime());
    }

   /**
    * Test getCodecIDInfoAsString() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsString() {
        assertEquals(null, this.jMetaDataText.getCodecIDInfoAsString());
        System.out.println("Info about codec ID AS String === " + jMetaDataText.getCodecIDInfoAsString());
    }

   /**
    * Test getCodecIDInfoAsBoolean() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsBoolean() {
        assertEquals(null, this.jMetaDataText.getCodecIDInfoAsBoolean());
        System.out.println("Info about codec ID AS Boolean === " + jMetaDataText.getCodecIDInfoAsBoolean());
    }

   /**
    * Test getCodecIDInfoAsBigInteger() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getCodecIDInfoAsBigInteger());
        System.out.println("Info about codec ID AS BigInteger === " + jMetaDataText.getCodecIDInfoAsBigInteger());
    }

   /**
    * Test getCodecIDInfoAsURL() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsURL() {
        assertEquals(null, this.jMetaDataText.getCodecIDInfoAsURL());
        System.out.println("Info about codec ID AS URL === " + jMetaDataText.getCodecIDInfoAsURL());
    }

   /**
    * Test getStreamSizeAsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeAsInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeAsInteger());
        System.out.println("Streamsize in bytes AS Integer === " + jMetaDataText.getStreamSizeAsInteger());
    }

   /**
    * Test getStreamSizeAsLong() method.
    */
    @Test
    public void subTestGetStreamSizeAsLong() {
        assertEquals(null, this.jMetaDataText.getStreamSizeAsLong());
        System.out.println("Streamsize in bytes AS Long === " + jMetaDataText.getStreamSizeAsLong());
    }

   /**
    * Test getStreamSizeAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeAsLocalDateTime());
        System.out.println("Streamsize in bytes AS LocalDateTime === " + jMetaDataText.getStreamSizeAsLocalDateTime());
    }

   /**
    * Test getStreamSizeAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeAsLocalTime());
        System.out.println("Streamsize in bytes AS LocalTime === " + jMetaDataText.getStreamSizeAsLocalTime());
    }

   /**
    * Test getStreamSizeAsString() method.
    */
    @Test
    public void subTestGetStreamSizeAsString() {
        assertEquals(null, this.jMetaDataText.getStreamSizeAsString());
        System.out.println("Streamsize in bytes AS String === " + jMetaDataText.getStreamSizeAsString());
    }

   /**
    * Test getStreamSizeAsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeAsBoolean() {
        assertEquals(null, this.jMetaDataText.getStreamSizeAsBoolean());
        System.out.println("Streamsize in bytes AS Boolean === " + jMetaDataText.getStreamSizeAsBoolean());
    }

   /**
    * Test getStreamSizeAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeAsBigInteger());
        System.out.println("Streamsize in bytes AS BigInteger === " + jMetaDataText.getStreamSizeAsBigInteger());
    }

   /**
    * Test getStreamSizeAsURL() method.
    */
    @Test
    public void subTestGetStreamSizeAsURL() {
        assertEquals(null, this.jMetaDataText.getStreamSizeAsURL());
        System.out.println("Streamsize in bytes AS URL === " + jMetaDataText.getStreamSizeAsURL());
    }

   /**
    * Test getWidthStringAsInteger() method.
    */
    @Test
    public void subTestGetWidthStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getWidthStringAsInteger());
        System.out.println("Width/String AS Integer === " + jMetaDataText.getWidthStringAsInteger());
    }

   /**
    * Test getWidthStringAsLong() method.
    */
    @Test
    public void subTestGetWidthStringAsLong() {
        assertEquals(null, this.jMetaDataText.getWidthStringAsLong());
        System.out.println("Width/String AS Long === " + jMetaDataText.getWidthStringAsLong());
    }

   /**
    * Test getWidthStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetWidthStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getWidthStringAsLocalDateTime());
        System.out.println("Width/String AS LocalDateTime === " + jMetaDataText.getWidthStringAsLocalDateTime());
    }

   /**
    * Test getWidthStringAsLocalTime() method.
    */
    @Test
    public void subTestGetWidthStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getWidthStringAsLocalTime());
        System.out.println("Width/String AS LocalTime === " + jMetaDataText.getWidthStringAsLocalTime());
    }

   /**
    * Test getWidthStringAsString() method.
    */
    @Test
    public void subTestGetWidthStringAsString() {
        assertEquals(null, this.jMetaDataText.getWidthStringAsString());
        System.out.println("Width/String AS String === " + jMetaDataText.getWidthStringAsString());
    }

   /**
    * Test getWidthStringAsBoolean() method.
    */
    @Test
    public void subTestGetWidthStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getWidthStringAsBoolean());
        System.out.println("Width/String AS Boolean === " + jMetaDataText.getWidthStringAsBoolean());
    }

   /**
    * Test getWidthStringAsBigInteger() method.
    */
    @Test
    public void subTestGetWidthStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getWidthStringAsBigInteger());
        System.out.println("Width/String AS BigInteger === " + jMetaDataText.getWidthStringAsBigInteger());
    }

   /**
    * Test getWidthStringAsURL() method.
    */
    @Test
    public void subTestGetWidthStringAsURL() {
        assertEquals(null, this.jMetaDataText.getWidthStringAsURL());
        System.out.println("Width/String AS URL === " + jMetaDataText.getWidthStringAsURL());
    }

   /**
    * Test getFormatInfoAsInteger() method.
    */
    @Test
    public void subTestGetFormatInfoAsInteger() {
        assertEquals(null, this.jMetaDataText.getFormatInfoAsInteger());
        System.out.println("Info about Format AS Integer === " + jMetaDataText.getFormatInfoAsInteger());
    }

   /**
    * Test getFormatInfoAsLong() method.
    */
    @Test
    public void subTestGetFormatInfoAsLong() {
        assertEquals(null, this.jMetaDataText.getFormatInfoAsLong());
        System.out.println("Info about Format AS Long === " + jMetaDataText.getFormatInfoAsLong());
    }

   /**
    * Test getFormatInfoAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatInfoAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getFormatInfoAsLocalDateTime());
        System.out.println("Info about Format AS LocalDateTime === " + jMetaDataText.getFormatInfoAsLocalDateTime());
    }

   /**
    * Test getFormatInfoAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatInfoAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getFormatInfoAsLocalTime());
        System.out.println("Info about Format AS LocalTime === " + jMetaDataText.getFormatInfoAsLocalTime());
    }

   /**
    * Test getFormatInfoAsString() method.
    */
    @Test
    public void subTestGetFormatInfoAsString() {
        assertEquals(null, this.jMetaDataText.getFormatInfoAsString());
        System.out.println("Info about Format AS String === " + jMetaDataText.getFormatInfoAsString());
    }

   /**
    * Test getFormatInfoAsBoolean() method.
    */
    @Test
    public void subTestGetFormatInfoAsBoolean() {
        assertEquals(null, this.jMetaDataText.getFormatInfoAsBoolean());
        System.out.println("Info about Format AS Boolean === " + jMetaDataText.getFormatInfoAsBoolean());
    }

   /**
    * Test getFormatInfoAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatInfoAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getFormatInfoAsBigInteger());
        System.out.println("Info about Format AS BigInteger === " + jMetaDataText.getFormatInfoAsBigInteger());
    }

   /**
    * Test getFormatInfoAsURL() method.
    */
    @Test
    public void subTestGetFormatInfoAsURL() {
        assertEquals(null, this.jMetaDataText.getFormatInfoAsURL());
        System.out.println("Info about Format AS URL === " + jMetaDataText.getFormatInfoAsURL());
    }

   /**
    * Test getSourceStreamSizeString1AsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString1AsInteger() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeString1AsInteger());
        System.out.println("Source_StreamSize/String1 AS Integer === " + jMetaDataText.getSourceStreamSizeString1AsInteger());
    }

   /**
    * Test getSourceStreamSizeString1AsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString1AsLong() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeString1AsLong());
        System.out.println("Source_StreamSize/String1 AS Long === " + jMetaDataText.getSourceStreamSizeString1AsLong());
    }

   /**
    * Test getSourceStreamSizeString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeString1AsLocalDateTime());
        System.out.println("Source_StreamSize/String1 AS LocalDateTime === " + jMetaDataText.getSourceStreamSizeString1AsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeString1AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString1AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeString1AsLocalTime());
        System.out.println("Source_StreamSize/String1 AS LocalTime === " + jMetaDataText.getSourceStreamSizeString1AsLocalTime());
    }

   /**
    * Test getSourceStreamSizeString1AsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString1AsString() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeString1AsString());
        System.out.println("Source_StreamSize/String1 AS String === " + jMetaDataText.getSourceStreamSizeString1AsString());
    }

   /**
    * Test getSourceStreamSizeString1AsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString1AsBoolean() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeString1AsBoolean());
        System.out.println("Source_StreamSize/String1 AS Boolean === " + jMetaDataText.getSourceStreamSizeString1AsBoolean());
    }

   /**
    * Test getSourceStreamSizeString1AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString1AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeString1AsBigInteger());
        System.out.println("Source_StreamSize/String1 AS BigInteger === " + jMetaDataText.getSourceStreamSizeString1AsBigInteger());
    }

   /**
    * Test getSourceStreamSizeString1AsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString1AsURL() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeString1AsURL());
        System.out.println("Source_StreamSize/String1 AS URL === " + jMetaDataText.getSourceStreamSizeString1AsURL());
    }

   /**
    * Test getSourceStreamSizeProportionAsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeProportionAsInteger() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeProportionAsInteger());
        System.out.println("Source Stream size divided by file size AS Integer === " + jMetaDataText.getSourceStreamSizeProportionAsInteger());
    }

   /**
    * Test getSourceStreamSizeProportionAsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeProportionAsLong() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeProportionAsLong());
        System.out.println("Source Stream size divided by file size AS Long === " + jMetaDataText.getSourceStreamSizeProportionAsLong());
    }

   /**
    * Test getSourceStreamSizeProportionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeProportionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeProportionAsLocalDateTime());
        System.out.println("Source Stream size divided by file size AS LocalDateTime === " + jMetaDataText.getSourceStreamSizeProportionAsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeProportionAsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeProportionAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeProportionAsLocalTime());
        System.out.println("Source Stream size divided by file size AS LocalTime === " + jMetaDataText.getSourceStreamSizeProportionAsLocalTime());
    }

   /**
    * Test getSourceStreamSizeProportionAsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeProportionAsString() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeProportionAsString());
        System.out.println("Source Stream size divided by file size AS String === " + jMetaDataText.getSourceStreamSizeProportionAsString());
    }

   /**
    * Test getSourceStreamSizeProportionAsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeProportionAsBoolean() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeProportionAsBoolean());
        System.out.println("Source Stream size divided by file size AS Boolean === " + jMetaDataText.getSourceStreamSizeProportionAsBoolean());
    }

   /**
    * Test getSourceStreamSizeProportionAsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeProportionAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeProportionAsBigInteger());
        System.out.println("Source Stream size divided by file size AS BigInteger === " + jMetaDataText.getSourceStreamSizeProportionAsBigInteger());
    }

   /**
    * Test getSourceStreamSizeProportionAsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeProportionAsURL() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeProportionAsURL());
        System.out.println("Source Stream size divided by file size AS URL === " + jMetaDataText.getSourceStreamSizeProportionAsURL());
    }

   /**
    * Test getCodecIDUrlAsInteger() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsInteger() {
        assertEquals(null, this.jMetaDataText.getCodecIDUrlAsInteger());
        System.out.println("A link for more details about this codec ID AS Integer === " + jMetaDataText.getCodecIDUrlAsInteger());
    }

   /**
    * Test getCodecIDUrlAsLong() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsLong() {
        assertEquals(null, this.jMetaDataText.getCodecIDUrlAsLong());
        System.out.println("A link for more details about this codec ID AS Long === " + jMetaDataText.getCodecIDUrlAsLong());
    }

   /**
    * Test getCodecIDUrlAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getCodecIDUrlAsLocalDateTime());
        System.out.println("A link for more details about this codec ID AS LocalDateTime === " + jMetaDataText.getCodecIDUrlAsLocalDateTime());
    }

   /**
    * Test getCodecIDUrlAsLocalTime() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getCodecIDUrlAsLocalTime());
        System.out.println("A link for more details about this codec ID AS LocalTime === " + jMetaDataText.getCodecIDUrlAsLocalTime());
    }

   /**
    * Test getCodecIDUrlAsString() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsString() {
        assertEquals(null, this.jMetaDataText.getCodecIDUrlAsString());
        System.out.println("A link for more details about this codec ID AS String === " + jMetaDataText.getCodecIDUrlAsString());
    }

   /**
    * Test getCodecIDUrlAsBoolean() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsBoolean() {
        assertEquals(null, this.jMetaDataText.getCodecIDUrlAsBoolean());
        System.out.println("A link for more details about this codec ID AS Boolean === " + jMetaDataText.getCodecIDUrlAsBoolean());
    }

   /**
    * Test getCodecIDUrlAsBigInteger() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getCodecIDUrlAsBigInteger());
        System.out.println("A link for more details about this codec ID AS BigInteger === " + jMetaDataText.getCodecIDUrlAsBigInteger());
    }

   /**
    * Test getCodecIDUrlAsURL() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsURL() {
        assertEquals(null, this.jMetaDataText.getCodecIDUrlAsURL());
        System.out.println("A link for more details about this codec ID AS URL === " + jMetaDataText.getCodecIDUrlAsURL());
    }

   /**
    * Test getSourceStreamSizeString2AsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString2AsInteger() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeString2AsInteger());
        System.out.println("Source_StreamSize/String2 AS Integer === " + jMetaDataText.getSourceStreamSizeString2AsInteger());
    }

   /**
    * Test getSourceStreamSizeString2AsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString2AsLong() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeString2AsLong());
        System.out.println("Source_StreamSize/String2 AS Long === " + jMetaDataText.getSourceStreamSizeString2AsLong());
    }

   /**
    * Test getSourceStreamSizeString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeString2AsLocalDateTime());
        System.out.println("Source_StreamSize/String2 AS LocalDateTime === " + jMetaDataText.getSourceStreamSizeString2AsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeString2AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString2AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeString2AsLocalTime());
        System.out.println("Source_StreamSize/String2 AS LocalTime === " + jMetaDataText.getSourceStreamSizeString2AsLocalTime());
    }

   /**
    * Test getSourceStreamSizeString2AsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString2AsString() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeString2AsString());
        System.out.println("Source_StreamSize/String2 AS String === " + jMetaDataText.getSourceStreamSizeString2AsString());
    }

   /**
    * Test getSourceStreamSizeString2AsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString2AsBoolean() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeString2AsBoolean());
        System.out.println("Source_StreamSize/String2 AS Boolean === " + jMetaDataText.getSourceStreamSizeString2AsBoolean());
    }

   /**
    * Test getSourceStreamSizeString2AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString2AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeString2AsBigInteger());
        System.out.println("Source_StreamSize/String2 AS BigInteger === " + jMetaDataText.getSourceStreamSizeString2AsBigInteger());
    }

   /**
    * Test getSourceStreamSizeString2AsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString2AsURL() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeString2AsURL());
        System.out.println("Source_StreamSize/String2 AS URL === " + jMetaDataText.getSourceStreamSizeString2AsURL());
    }

   /**
    * Test getHeightStringAsInteger() method.
    */
    @Test
    public void subTestGetHeightStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getHeightStringAsInteger());
        System.out.println("Height/String AS Integer === " + jMetaDataText.getHeightStringAsInteger());
    }

   /**
    * Test getHeightStringAsLong() method.
    */
    @Test
    public void subTestGetHeightStringAsLong() {
        assertEquals(null, this.jMetaDataText.getHeightStringAsLong());
        System.out.println("Height/String AS Long === " + jMetaDataText.getHeightStringAsLong());
    }

   /**
    * Test getHeightStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetHeightStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getHeightStringAsLocalDateTime());
        System.out.println("Height/String AS LocalDateTime === " + jMetaDataText.getHeightStringAsLocalDateTime());
    }

   /**
    * Test getHeightStringAsLocalTime() method.
    */
    @Test
    public void subTestGetHeightStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getHeightStringAsLocalTime());
        System.out.println("Height/String AS LocalTime === " + jMetaDataText.getHeightStringAsLocalTime());
    }

   /**
    * Test getHeightStringAsString() method.
    */
    @Test
    public void subTestGetHeightStringAsString() {
        assertEquals(null, this.jMetaDataText.getHeightStringAsString());
        System.out.println("Height/String AS String === " + jMetaDataText.getHeightStringAsString());
    }

   /**
    * Test getHeightStringAsBoolean() method.
    */
    @Test
    public void subTestGetHeightStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getHeightStringAsBoolean());
        System.out.println("Height/String AS Boolean === " + jMetaDataText.getHeightStringAsBoolean());
    }

   /**
    * Test getHeightStringAsBigInteger() method.
    */
    @Test
    public void subTestGetHeightStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getHeightStringAsBigInteger());
        System.out.println("Height/String AS BigInteger === " + jMetaDataText.getHeightStringAsBigInteger());
    }

   /**
    * Test getHeightStringAsURL() method.
    */
    @Test
    public void subTestGetHeightStringAsURL() {
        assertEquals(null, this.jMetaDataText.getHeightStringAsURL());
        System.out.println("Height/String AS URL === " + jMetaDataText.getHeightStringAsURL());
    }

   /**
    * Test getSourceStreamSizeString5AsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString5AsInteger() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeString5AsInteger());
        System.out.println("Source Streamsize in with percentage value AS Integer === " + jMetaDataText.getSourceStreamSizeString5AsInteger());
    }

   /**
    * Test getSourceStreamSizeString5AsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString5AsLong() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeString5AsLong());
        System.out.println("Source Streamsize in with percentage value AS Long === " + jMetaDataText.getSourceStreamSizeString5AsLong());
    }

   /**
    * Test getSourceStreamSizeString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeString5AsLocalDateTime());
        System.out.println("Source Streamsize in with percentage value AS LocalDateTime === " + jMetaDataText.getSourceStreamSizeString5AsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeString5AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString5AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeString5AsLocalTime());
        System.out.println("Source Streamsize in with percentage value AS LocalTime === " + jMetaDataText.getSourceStreamSizeString5AsLocalTime());
    }

   /**
    * Test getSourceStreamSizeString5AsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString5AsString() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeString5AsString());
        System.out.println("Source Streamsize in with percentage value AS String === " + jMetaDataText.getSourceStreamSizeString5AsString());
    }

   /**
    * Test getSourceStreamSizeString5AsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString5AsBoolean() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeString5AsBoolean());
        System.out.println("Source Streamsize in with percentage value AS Boolean === " + jMetaDataText.getSourceStreamSizeString5AsBoolean());
    }

   /**
    * Test getSourceStreamSizeString5AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString5AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeString5AsBigInteger());
        System.out.println("Source Streamsize in with percentage value AS BigInteger === " + jMetaDataText.getSourceStreamSizeString5AsBigInteger());
    }

   /**
    * Test getSourceStreamSizeString5AsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString5AsURL() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeString5AsURL());
        System.out.println("Source Streamsize in with percentage value AS URL === " + jMetaDataText.getSourceStreamSizeString5AsURL());
    }

   /**
    * Test getSourceStreamSizeString3AsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString3AsInteger() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeString3AsInteger());
        System.out.println("Source_StreamSize/String3 AS Integer === " + jMetaDataText.getSourceStreamSizeString3AsInteger());
    }

   /**
    * Test getSourceStreamSizeString3AsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString3AsLong() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeString3AsLong());
        System.out.println("Source_StreamSize/String3 AS Long === " + jMetaDataText.getSourceStreamSizeString3AsLong());
    }

   /**
    * Test getSourceStreamSizeString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeString3AsLocalDateTime());
        System.out.println("Source_StreamSize/String3 AS LocalDateTime === " + jMetaDataText.getSourceStreamSizeString3AsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeString3AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString3AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeString3AsLocalTime());
        System.out.println("Source_StreamSize/String3 AS LocalTime === " + jMetaDataText.getSourceStreamSizeString3AsLocalTime());
    }

   /**
    * Test getSourceStreamSizeString3AsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString3AsString() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeString3AsString());
        System.out.println("Source_StreamSize/String3 AS String === " + jMetaDataText.getSourceStreamSizeString3AsString());
    }

   /**
    * Test getSourceStreamSizeString3AsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString3AsBoolean() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeString3AsBoolean());
        System.out.println("Source_StreamSize/String3 AS Boolean === " + jMetaDataText.getSourceStreamSizeString3AsBoolean());
    }

   /**
    * Test getSourceStreamSizeString3AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString3AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeString3AsBigInteger());
        System.out.println("Source_StreamSize/String3 AS BigInteger === " + jMetaDataText.getSourceStreamSizeString3AsBigInteger());
    }

   /**
    * Test getSourceStreamSizeString3AsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString3AsURL() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeString3AsURL());
        System.out.println("Source_StreamSize/String3 AS URL === " + jMetaDataText.getSourceStreamSizeString3AsURL());
    }

   /**
    * Test getSourceStreamSizeString4AsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString4AsInteger() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeString4AsInteger());
        System.out.println("Source_StreamSize/String4 AS Integer === " + jMetaDataText.getSourceStreamSizeString4AsInteger());
    }

   /**
    * Test getSourceStreamSizeString4AsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString4AsLong() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeString4AsLong());
        System.out.println("Source_StreamSize/String4 AS Long === " + jMetaDataText.getSourceStreamSizeString4AsLong());
    }

   /**
    * Test getSourceStreamSizeString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeString4AsLocalDateTime());
        System.out.println("Source_StreamSize/String4 AS LocalDateTime === " + jMetaDataText.getSourceStreamSizeString4AsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeString4AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString4AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeString4AsLocalTime());
        System.out.println("Source_StreamSize/String4 AS LocalTime === " + jMetaDataText.getSourceStreamSizeString4AsLocalTime());
    }

   /**
    * Test getSourceStreamSizeString4AsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString4AsString() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeString4AsString());
        System.out.println("Source_StreamSize/String4 AS String === " + jMetaDataText.getSourceStreamSizeString4AsString());
    }

   /**
    * Test getSourceStreamSizeString4AsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString4AsBoolean() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeString4AsBoolean());
        System.out.println("Source_StreamSize/String4 AS Boolean === " + jMetaDataText.getSourceStreamSizeString4AsBoolean());
    }

   /**
    * Test getSourceStreamSizeString4AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString4AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeString4AsBigInteger());
        System.out.println("Source_StreamSize/String4 AS BigInteger === " + jMetaDataText.getSourceStreamSizeString4AsBigInteger());
    }

   /**
    * Test getSourceStreamSizeString4AsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeString4AsURL() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeString4AsURL());
        System.out.println("Source_StreamSize/String4 AS URL === " + jMetaDataText.getSourceStreamSizeString4AsURL());
    }

   /**
    * Test getDisabledStringAsInteger() method.
    */
    @Test
    public void subTestGetDisabledStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getDisabledStringAsInteger());
        System.out.println("Set if that track should not be used AS Integer === " + jMetaDataText.getDisabledStringAsInteger());
    }

   /**
    * Test getDisabledStringAsLong() method.
    */
    @Test
    public void subTestGetDisabledStringAsLong() {
        assertEquals(null, this.jMetaDataText.getDisabledStringAsLong());
        System.out.println("Set if that track should not be used AS Long === " + jMetaDataText.getDisabledStringAsLong());
    }

   /**
    * Test getDisabledStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDisabledStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDisabledStringAsLocalDateTime());
        System.out.println("Set if that track should not be used AS LocalDateTime === " + jMetaDataText.getDisabledStringAsLocalDateTime());
    }

   /**
    * Test getDisabledStringAsLocalTime() method.
    */
    @Test
    public void subTestGetDisabledStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDisabledStringAsLocalTime());
        System.out.println("Set if that track should not be used AS LocalTime === " + jMetaDataText.getDisabledStringAsLocalTime());
    }

   /**
    * Test getDisabledStringAsString() method.
    */
    @Test
    public void subTestGetDisabledStringAsString() {
        assertEquals(null, this.jMetaDataText.getDisabledStringAsString());
        System.out.println("Set if that track should not be used AS String === " + jMetaDataText.getDisabledStringAsString());
    }

   /**
    * Test getDisabledStringAsBoolean() method.
    */
    @Test
    public void subTestGetDisabledStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getDisabledStringAsBoolean());
        System.out.println("Set if that track should not be used AS Boolean === " + jMetaDataText.getDisabledStringAsBoolean());
    }

   /**
    * Test getDisabledStringAsBigInteger() method.
    */
    @Test
    public void subTestGetDisabledStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDisabledStringAsBigInteger());
        System.out.println("Set if that track should not be used AS BigInteger === " + jMetaDataText.getDisabledStringAsBigInteger());
    }

   /**
    * Test getDisabledStringAsURL() method.
    */
    @Test
    public void subTestGetDisabledStringAsURL() {
        assertEquals(null, this.jMetaDataText.getDisabledStringAsURL());
        System.out.println("Set if that track should not be used AS URL === " + jMetaDataText.getDisabledStringAsURL());
    }

   /**
    * Test getEncodedOperatingSystemAsInteger() method.
    */
    @Test
    public void subTestGetEncodedOperatingSystemAsInteger() {
        assertEquals(null, this.jMetaDataText.getEncodedOperatingSystemAsInteger());
        System.out.println("Operating System of encoding-software AS Integer === " + jMetaDataText.getEncodedOperatingSystemAsInteger());
    }

   /**
    * Test getEncodedOperatingSystemAsLong() method.
    */
    @Test
    public void subTestGetEncodedOperatingSystemAsLong() {
        assertEquals(null, this.jMetaDataText.getEncodedOperatingSystemAsLong());
        System.out.println("Operating System of encoding-software AS Long === " + jMetaDataText.getEncodedOperatingSystemAsLong());
    }

   /**
    * Test getEncodedOperatingSystemAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedOperatingSystemAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getEncodedOperatingSystemAsLocalDateTime());
        System.out.println("Operating System of encoding-software AS LocalDateTime === " + jMetaDataText.getEncodedOperatingSystemAsLocalDateTime());
    }

   /**
    * Test getEncodedOperatingSystemAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedOperatingSystemAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getEncodedOperatingSystemAsLocalTime());
        System.out.println("Operating System of encoding-software AS LocalTime === " + jMetaDataText.getEncodedOperatingSystemAsLocalTime());
    }

   /**
    * Test getEncodedOperatingSystemAsString() method.
    */
    @Test
    public void subTestGetEncodedOperatingSystemAsString() {
        assertEquals(null, this.jMetaDataText.getEncodedOperatingSystemAsString());
        System.out.println("Operating System of encoding-software AS String === " + jMetaDataText.getEncodedOperatingSystemAsString());
    }

   /**
    * Test getEncodedOperatingSystemAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedOperatingSystemAsBoolean() {
        assertEquals(null, this.jMetaDataText.getEncodedOperatingSystemAsBoolean());
        System.out.println("Operating System of encoding-software AS Boolean === " + jMetaDataText.getEncodedOperatingSystemAsBoolean());
    }

   /**
    * Test getEncodedOperatingSystemAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedOperatingSystemAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getEncodedOperatingSystemAsBigInteger());
        System.out.println("Operating System of encoding-software AS BigInteger === " + jMetaDataText.getEncodedOperatingSystemAsBigInteger());
    }

   /**
    * Test getEncodedOperatingSystemAsURL() method.
    */
    @Test
    public void subTestGetEncodedOperatingSystemAsURL() {
        assertEquals(null, this.jMetaDataText.getEncodedOperatingSystemAsURL());
        System.out.println("Operating System of encoding-software AS URL === " + jMetaDataText.getEncodedOperatingSystemAsURL());
    }

   /**
    * Test getEncodedApplicationCompanyNameAsInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsInteger() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationCompanyNameAsInteger());
        System.out.println("Name of the company AS Integer === " + jMetaDataText.getEncodedApplicationCompanyNameAsInteger());
    }

   /**
    * Test getEncodedApplicationCompanyNameAsLong() method.
    */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsLong() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationCompanyNameAsLong());
        System.out.println("Name of the company AS Long === " + jMetaDataText.getEncodedApplicationCompanyNameAsLong());
    }

   /**
    * Test getEncodedApplicationCompanyNameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationCompanyNameAsLocalDateTime());
        System.out.println("Name of the company AS LocalDateTime === " + jMetaDataText.getEncodedApplicationCompanyNameAsLocalDateTime());
    }

   /**
    * Test getEncodedApplicationCompanyNameAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationCompanyNameAsLocalTime());
        System.out.println("Name of the company AS LocalTime === " + jMetaDataText.getEncodedApplicationCompanyNameAsLocalTime());
    }

   /**
    * Test getEncodedApplicationCompanyNameAsString() method.
    */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsString() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationCompanyNameAsString());
        System.out.println("Name of the company AS String === " + jMetaDataText.getEncodedApplicationCompanyNameAsString());
    }

   /**
    * Test getEncodedApplicationCompanyNameAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsBoolean() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationCompanyNameAsBoolean());
        System.out.println("Name of the company AS Boolean === " + jMetaDataText.getEncodedApplicationCompanyNameAsBoolean());
    }

   /**
    * Test getEncodedApplicationCompanyNameAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationCompanyNameAsBigInteger());
        System.out.println("Name of the company AS BigInteger === " + jMetaDataText.getEncodedApplicationCompanyNameAsBigInteger());
    }

   /**
    * Test getEncodedApplicationCompanyNameAsURL() method.
    */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsURL() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationCompanyNameAsURL());
        System.out.println("Name of the company AS URL === " + jMetaDataText.getEncodedApplicationCompanyNameAsURL());
    }

   /**
    * Test getCompressionRatioAsInteger() method.
    */
    @Test
    public void subTestGetCompressionRatioAsInteger() {
        assertEquals(null, this.jMetaDataText.getCompressionRatioAsInteger());
        System.out.println("Current stream size divided by uncompressed stream size AS Integer === " + jMetaDataText.getCompressionRatioAsInteger());
    }

   /**
    * Test getCompressionRatioAsLong() method.
    */
    @Test
    public void subTestGetCompressionRatioAsLong() {
        assertEquals(null, this.jMetaDataText.getCompressionRatioAsLong());
        System.out.println("Current stream size divided by uncompressed stream size AS Long === " + jMetaDataText.getCompressionRatioAsLong());
    }

   /**
    * Test getCompressionRatioAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCompressionRatioAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getCompressionRatioAsLocalDateTime());
        System.out.println("Current stream size divided by uncompressed stream size AS LocalDateTime === " + jMetaDataText.getCompressionRatioAsLocalDateTime());
    }

   /**
    * Test getCompressionRatioAsLocalTime() method.
    */
    @Test
    public void subTestGetCompressionRatioAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getCompressionRatioAsLocalTime());
        System.out.println("Current stream size divided by uncompressed stream size AS LocalTime === " + jMetaDataText.getCompressionRatioAsLocalTime());
    }

   /**
    * Test getCompressionRatioAsString() method.
    */
    @Test
    public void subTestGetCompressionRatioAsString() {
        assertEquals(null, this.jMetaDataText.getCompressionRatioAsString());
        System.out.println("Current stream size divided by uncompressed stream size AS String === " + jMetaDataText.getCompressionRatioAsString());
    }

   /**
    * Test getCompressionRatioAsBoolean() method.
    */
    @Test
    public void subTestGetCompressionRatioAsBoolean() {
        assertEquals(null, this.jMetaDataText.getCompressionRatioAsBoolean());
        System.out.println("Current stream size divided by uncompressed stream size AS Boolean === " + jMetaDataText.getCompressionRatioAsBoolean());
    }

   /**
    * Test getCompressionRatioAsBigInteger() method.
    */
    @Test
    public void subTestGetCompressionRatioAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getCompressionRatioAsBigInteger());
        System.out.println("Current stream size divided by uncompressed stream size AS BigInteger === " + jMetaDataText.getCompressionRatioAsBigInteger());
    }

   /**
    * Test getCompressionRatioAsURL() method.
    */
    @Test
    public void subTestGetCompressionRatioAsURL() {
        assertEquals(null, this.jMetaDataText.getCompressionRatioAsURL());
        System.out.println("Current stream size divided by uncompressed stream size AS URL === " + jMetaDataText.getCompressionRatioAsURL());
    }

   /**
    * Test getFormatCommercialIfAnyAsInteger() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsInteger() {
        assertEquals(null, this.jMetaDataText.getFormatCommercialIfAnyAsInteger());
        System.out.println("Commercial name used by vendor for theses setings if there is one AS Integer === " + jMetaDataText.getFormatCommercialIfAnyAsInteger());
    }

   /**
    * Test getFormatCommercialIfAnyAsLong() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsLong() {
        assertEquals(null, this.jMetaDataText.getFormatCommercialIfAnyAsLong());
        System.out.println("Commercial name used by vendor for theses setings if there is one AS Long === " + jMetaDataText.getFormatCommercialIfAnyAsLong());
    }

   /**
    * Test getFormatCommercialIfAnyAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getFormatCommercialIfAnyAsLocalDateTime());
        System.out.println("Commercial name used by vendor for theses setings if there is one AS LocalDateTime === " + jMetaDataText.getFormatCommercialIfAnyAsLocalDateTime());
    }

   /**
    * Test getFormatCommercialIfAnyAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getFormatCommercialIfAnyAsLocalTime());
        System.out.println("Commercial name used by vendor for theses setings if there is one AS LocalTime === " + jMetaDataText.getFormatCommercialIfAnyAsLocalTime());
    }

   /**
    * Test getFormatCommercialIfAnyAsString() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsString() {
        assertEquals(null, this.jMetaDataText.getFormatCommercialIfAnyAsString());
        System.out.println("Commercial name used by vendor for theses setings if there is one AS String === " + jMetaDataText.getFormatCommercialIfAnyAsString());
    }

   /**
    * Test getFormatCommercialIfAnyAsBoolean() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsBoolean() {
        assertEquals(null, this.jMetaDataText.getFormatCommercialIfAnyAsBoolean());
        System.out.println("Commercial name used by vendor for theses setings if there is one AS Boolean === " + jMetaDataText.getFormatCommercialIfAnyAsBoolean());
    }

   /**
    * Test getFormatCommercialIfAnyAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getFormatCommercialIfAnyAsBigInteger());
        System.out.println("Commercial name used by vendor for theses setings if there is one AS BigInteger === " + jMetaDataText.getFormatCommercialIfAnyAsBigInteger());
    }

   /**
    * Test getFormatCommercialIfAnyAsURL() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsURL() {
        assertEquals(null, this.jMetaDataText.getFormatCommercialIfAnyAsURL());
        System.out.println("Commercial name used by vendor for theses setings if there is one AS URL === " + jMetaDataText.getFormatCommercialIfAnyAsURL());
    }

   /**
    * Test getTaggedDateAsInteger() method.
    */
    @Test
    public void subTestGetTaggedDateAsInteger() {
        assertEquals(null, this.jMetaDataText.getTaggedDateAsInteger());
        System.out.println("The time that the tags were done for this item. AS Integer === " + jMetaDataText.getTaggedDateAsInteger());
    }

   /**
    * Test getTaggedDateAsLong() method.
    */
    @Test
    public void subTestGetTaggedDateAsLong() {
        assertEquals(null, this.jMetaDataText.getTaggedDateAsLong());
        System.out.println("The time that the tags were done for this item. AS Long === " + jMetaDataText.getTaggedDateAsLong());
    }

   /**
    * Test getTaggedDateAsLocalDateTime() method.
    */
    @Test
    public void subTestGetTaggedDateAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getTaggedDateAsLocalDateTime());
        System.out.println("The time that the tags were done for this item. AS LocalDateTime === " + jMetaDataText.getTaggedDateAsLocalDateTime());
    }

   /**
    * Test getTaggedDateAsLocalTime() method.
    */
    @Test
    public void subTestGetTaggedDateAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getTaggedDateAsLocalTime());
        System.out.println("The time that the tags were done for this item. AS LocalTime === " + jMetaDataText.getTaggedDateAsLocalTime());
    }

   /**
    * Test getTaggedDateAsString() method.
    */
    @Test
    public void subTestGetTaggedDateAsString() {
        assertEquals(null, this.jMetaDataText.getTaggedDateAsString());
        System.out.println("The time that the tags were done for this item. AS String === " + jMetaDataText.getTaggedDateAsString());
    }

   /**
    * Test getTaggedDateAsBoolean() method.
    */
    @Test
    public void subTestGetTaggedDateAsBoolean() {
        assertEquals(null, this.jMetaDataText.getTaggedDateAsBoolean());
        System.out.println("The time that the tags were done for this item. AS Boolean === " + jMetaDataText.getTaggedDateAsBoolean());
    }

   /**
    * Test getTaggedDateAsBigInteger() method.
    */
    @Test
    public void subTestGetTaggedDateAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getTaggedDateAsBigInteger());
        System.out.println("The time that the tags were done for this item. AS BigInteger === " + jMetaDataText.getTaggedDateAsBigInteger());
    }

   /**
    * Test getTaggedDateAsURL() method.
    */
    @Test
    public void subTestGetTaggedDateAsURL() {
        assertEquals(null, this.jMetaDataText.getTaggedDateAsURL());
        System.out.println("The time that the tags were done for this item. AS URL === " + jMetaDataText.getTaggedDateAsURL());
    }

   /**
    * Test getIDStringAsInteger() method.
    */
    @Test
    public void subTestGetIDStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getIDStringAsInteger());
        System.out.println("The ID for this stream in this file AS Integer === " + jMetaDataText.getIDStringAsInteger());
    }

   /**
    * Test getIDStringAsLong() method.
    */
    @Test
    public void subTestGetIDStringAsLong() {
        assertEquals(null, this.jMetaDataText.getIDStringAsLong());
        System.out.println("The ID for this stream in this file AS Long === " + jMetaDataText.getIDStringAsLong());
    }

   /**
    * Test getIDStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetIDStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getIDStringAsLocalDateTime());
        System.out.println("The ID for this stream in this file AS LocalDateTime === " + jMetaDataText.getIDStringAsLocalDateTime());
    }

   /**
    * Test getIDStringAsLocalTime() method.
    */
    @Test
    public void subTestGetIDStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getIDStringAsLocalTime());
        System.out.println("The ID for this stream in this file AS LocalTime === " + jMetaDataText.getIDStringAsLocalTime());
    }

   /**
    * Test getIDStringAsString() method.
    */
    @Test
    public void subTestGetIDStringAsString() {
        assertEquals(null, this.jMetaDataText.getIDStringAsString());
        System.out.println("The ID for this stream in this file AS String === " + jMetaDataText.getIDStringAsString());
    }

   /**
    * Test getIDStringAsBoolean() method.
    */
    @Test
    public void subTestGetIDStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getIDStringAsBoolean());
        System.out.println("The ID for this stream in this file AS Boolean === " + jMetaDataText.getIDStringAsBoolean());
    }

   /**
    * Test getIDStringAsBigInteger() method.
    */
    @Test
    public void subTestGetIDStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getIDStringAsBigInteger());
        System.out.println("The ID for this stream in this file AS BigInteger === " + jMetaDataText.getIDStringAsBigInteger());
    }

   /**
    * Test getIDStringAsURL() method.
    */
    @Test
    public void subTestGetIDStringAsURL() {
        assertEquals(null, this.jMetaDataText.getIDStringAsURL());
        System.out.println("The ID for this stream in this file AS URL === " + jMetaDataText.getIDStringAsURL());
    }

   /**
    * Test getCompressionModeAsInteger() method.
    */
    @Test
    public void subTestGetCompressionModeAsInteger() {
        assertEquals(null, this.jMetaDataText.getCompressionModeAsInteger());
        System.out.println("Compression mode (Lossy or Lossless) AS Integer === " + jMetaDataText.getCompressionModeAsInteger());
    }

   /**
    * Test getCompressionModeAsLong() method.
    */
    @Test
    public void subTestGetCompressionModeAsLong() {
        assertEquals(null, this.jMetaDataText.getCompressionModeAsLong());
        System.out.println("Compression mode (Lossy or Lossless) AS Long === " + jMetaDataText.getCompressionModeAsLong());
    }

   /**
    * Test getCompressionModeAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCompressionModeAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getCompressionModeAsLocalDateTime());
        System.out.println("Compression mode (Lossy or Lossless) AS LocalDateTime === " + jMetaDataText.getCompressionModeAsLocalDateTime());
    }

   /**
    * Test getCompressionModeAsLocalTime() method.
    */
    @Test
    public void subTestGetCompressionModeAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getCompressionModeAsLocalTime());
        System.out.println("Compression mode (Lossy or Lossless) AS LocalTime === " + jMetaDataText.getCompressionModeAsLocalTime());
    }

   /**
    * Test getCompressionModeAsString() method.
    */
    @Test
    public void subTestGetCompressionModeAsString() {
        assertEquals(null, this.jMetaDataText.getCompressionModeAsString());
        System.out.println("Compression mode (Lossy or Lossless) AS String === " + jMetaDataText.getCompressionModeAsString());
    }

   /**
    * Test getCompressionModeAsBoolean() method.
    */
    @Test
    public void subTestGetCompressionModeAsBoolean() {
        assertEquals(null, this.jMetaDataText.getCompressionModeAsBoolean());
        System.out.println("Compression mode (Lossy or Lossless) AS Boolean === " + jMetaDataText.getCompressionModeAsBoolean());
    }

   /**
    * Test getCompressionModeAsBigInteger() method.
    */
    @Test
    public void subTestGetCompressionModeAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getCompressionModeAsBigInteger());
        System.out.println("Compression mode (Lossy or Lossless) AS BigInteger === " + jMetaDataText.getCompressionModeAsBigInteger());
    }

   /**
    * Test getCompressionModeAsURL() method.
    */
    @Test
    public void subTestGetCompressionModeAsURL() {
        assertEquals(null, this.jMetaDataText.getCompressionModeAsURL());
        System.out.println("Compression mode (Lossy or Lossless) AS URL === " + jMetaDataText.getCompressionModeAsURL());
    }

   /**
    * Test getBitRateAsInteger() method.
    */
    @Test
    public void subTestGetBitRateAsInteger() {
        assertEquals(null, this.jMetaDataText.getBitRateAsInteger());
        System.out.println("Bit rate in bps AS Integer === " + jMetaDataText.getBitRateAsInteger());
    }

   /**
    * Test getBitRateAsLong() method.
    */
    @Test
    public void subTestGetBitRateAsLong() {
        assertEquals(null, this.jMetaDataText.getBitRateAsLong());
        System.out.println("Bit rate in bps AS Long === " + jMetaDataText.getBitRateAsLong());
    }

   /**
    * Test getBitRateAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitRateAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getBitRateAsLocalDateTime());
        System.out.println("Bit rate in bps AS LocalDateTime === " + jMetaDataText.getBitRateAsLocalDateTime());
    }

   /**
    * Test getBitRateAsLocalTime() method.
    */
    @Test
    public void subTestGetBitRateAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getBitRateAsLocalTime());
        System.out.println("Bit rate in bps AS LocalTime === " + jMetaDataText.getBitRateAsLocalTime());
    }

   /**
    * Test getBitRateAsString() method.
    */
    @Test
    public void subTestGetBitRateAsString() {
        assertEquals(null, this.jMetaDataText.getBitRateAsString());
        System.out.println("Bit rate in bps AS String === " + jMetaDataText.getBitRateAsString());
    }

   /**
    * Test getBitRateAsBoolean() method.
    */
    @Test
    public void subTestGetBitRateAsBoolean() {
        assertEquals(null, this.jMetaDataText.getBitRateAsBoolean());
        System.out.println("Bit rate in bps AS Boolean === " + jMetaDataText.getBitRateAsBoolean());
    }

   /**
    * Test getBitRateAsBigInteger() method.
    */
    @Test
    public void subTestGetBitRateAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getBitRateAsBigInteger());
        System.out.println("Bit rate in bps AS BigInteger === " + jMetaDataText.getBitRateAsBigInteger());
    }

   /**
    * Test getBitRateAsURL() method.
    */
    @Test
    public void subTestGetBitRateAsURL() {
        assertEquals(null, this.jMetaDataText.getBitRateAsURL());
        System.out.println("Bit rate in bps AS URL === " + jMetaDataText.getBitRateAsURL());
    }

   /**
    * Test getEncodedDateAsInteger() method.
    */
    @Test
    public void subTestGetEncodedDateAsInteger() {
        assertEquals(null, this.jMetaDataText.getEncodedDateAsInteger());
        System.out.println("The time that the encoding of this item was completed began. AS Integer === " + jMetaDataText.getEncodedDateAsInteger());
    }

   /**
    * Test getEncodedDateAsLong() method.
    */
    @Test
    public void subTestGetEncodedDateAsLong() {
        assertEquals(null, this.jMetaDataText.getEncodedDateAsLong());
        System.out.println("The time that the encoding of this item was completed began. AS Long === " + jMetaDataText.getEncodedDateAsLong());
    }

   /**
    * Test getEncodedDateAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedDateAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getEncodedDateAsLocalDateTime());
        System.out.println("The time that the encoding of this item was completed began. AS LocalDateTime === " + jMetaDataText.getEncodedDateAsLocalDateTime());
    }

   /**
    * Test getEncodedDateAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedDateAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getEncodedDateAsLocalTime());
        System.out.println("The time that the encoding of this item was completed began. AS LocalTime === " + jMetaDataText.getEncodedDateAsLocalTime());
    }

   /**
    * Test getEncodedDateAsString() method.
    */
    @Test
    public void subTestGetEncodedDateAsString() {
        assertEquals(null, this.jMetaDataText.getEncodedDateAsString());
        System.out.println("The time that the encoding of this item was completed began. AS String === " + jMetaDataText.getEncodedDateAsString());
    }

   /**
    * Test getEncodedDateAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedDateAsBoolean() {
        assertEquals(null, this.jMetaDataText.getEncodedDateAsBoolean());
        System.out.println("The time that the encoding of this item was completed began. AS Boolean === " + jMetaDataText.getEncodedDateAsBoolean());
    }

   /**
    * Test getEncodedDateAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedDateAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getEncodedDateAsBigInteger());
        System.out.println("The time that the encoding of this item was completed began. AS BigInteger === " + jMetaDataText.getEncodedDateAsBigInteger());
    }

   /**
    * Test getEncodedDateAsURL() method.
    */
    @Test
    public void subTestGetEncodedDateAsURL() {
        assertEquals(null, this.jMetaDataText.getEncodedDateAsURL());
        System.out.println("The time that the encoding of this item was completed began. AS URL === " + jMetaDataText.getEncodedDateAsURL());
    }

   /**
    * Test getBitRateModeAsInteger() method.
    */
    @Test
    public void subTestGetBitRateModeAsInteger() {
        assertEquals(null, this.jMetaDataText.getBitRateModeAsInteger());
        System.out.println("Bit rate mode (VBR, CBR) AS Integer === " + jMetaDataText.getBitRateModeAsInteger());
    }

   /**
    * Test getBitRateModeAsLong() method.
    */
    @Test
    public void subTestGetBitRateModeAsLong() {
        assertEquals(null, this.jMetaDataText.getBitRateModeAsLong());
        System.out.println("Bit rate mode (VBR, CBR) AS Long === " + jMetaDataText.getBitRateModeAsLong());
    }

   /**
    * Test getBitRateModeAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitRateModeAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getBitRateModeAsLocalDateTime());
        System.out.println("Bit rate mode (VBR, CBR) AS LocalDateTime === " + jMetaDataText.getBitRateModeAsLocalDateTime());
    }

   /**
    * Test getBitRateModeAsLocalTime() method.
    */
    @Test
    public void subTestGetBitRateModeAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getBitRateModeAsLocalTime());
        System.out.println("Bit rate mode (VBR, CBR) AS LocalTime === " + jMetaDataText.getBitRateModeAsLocalTime());
    }

   /**
    * Test getBitRateModeAsString() method.
    */
    @Test
    public void subTestGetBitRateModeAsString() {
        assertEquals(null, this.jMetaDataText.getBitRateModeAsString());
        System.out.println("Bit rate mode (VBR, CBR) AS String === " + jMetaDataText.getBitRateModeAsString());
    }

   /**
    * Test getBitRateModeAsBoolean() method.
    */
    @Test
    public void subTestGetBitRateModeAsBoolean() {
        assertEquals(null, this.jMetaDataText.getBitRateModeAsBoolean());
        System.out.println("Bit rate mode (VBR, CBR) AS Boolean === " + jMetaDataText.getBitRateModeAsBoolean());
    }

   /**
    * Test getBitRateModeAsBigInteger() method.
    */
    @Test
    public void subTestGetBitRateModeAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getBitRateModeAsBigInteger());
        System.out.println("Bit rate mode (VBR, CBR) AS BigInteger === " + jMetaDataText.getBitRateModeAsBigInteger());
    }

   /**
    * Test getBitRateModeAsURL() method.
    */
    @Test
    public void subTestGetBitRateModeAsURL() {
        assertEquals(null, this.jMetaDataText.getBitRateModeAsURL());
        System.out.println("Bit rate mode (VBR, CBR) AS URL === " + jMetaDataText.getBitRateModeAsURL());
    }

   /**
    * Test getUniqueIDAsInteger() method.
    */
    @Test
    public void subTestGetUniqueIDAsInteger() {
        assertEquals(null, this.jMetaDataText.getUniqueIDAsInteger());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS Integer === " + jMetaDataText.getUniqueIDAsInteger());
    }

   /**
    * Test getUniqueIDAsLong() method.
    */
    @Test
    public void subTestGetUniqueIDAsLong() {
        assertEquals(null, this.jMetaDataText.getUniqueIDAsLong());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS Long === " + jMetaDataText.getUniqueIDAsLong());
    }

   /**
    * Test getUniqueIDAsLocalDateTime() method.
    */
    @Test
    public void subTestGetUniqueIDAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getUniqueIDAsLocalDateTime());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS LocalDateTime === " + jMetaDataText.getUniqueIDAsLocalDateTime());
    }

   /**
    * Test getUniqueIDAsLocalTime() method.
    */
    @Test
    public void subTestGetUniqueIDAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getUniqueIDAsLocalTime());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS LocalTime === " + jMetaDataText.getUniqueIDAsLocalTime());
    }

   /**
    * Test getUniqueIDAsString() method.
    */
    @Test
    public void subTestGetUniqueIDAsString() {
        assertEquals(null, this.jMetaDataText.getUniqueIDAsString());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS String === " + jMetaDataText.getUniqueIDAsString());
    }

   /**
    * Test getUniqueIDAsBoolean() method.
    */
    @Test
    public void subTestGetUniqueIDAsBoolean() {
        assertEquals(null, this.jMetaDataText.getUniqueIDAsBoolean());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS Boolean === " + jMetaDataText.getUniqueIDAsBoolean());
    }

   /**
    * Test getUniqueIDAsBigInteger() method.
    */
    @Test
    public void subTestGetUniqueIDAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getUniqueIDAsBigInteger());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS BigInteger === " + jMetaDataText.getUniqueIDAsBigInteger());
    }

   /**
    * Test getUniqueIDAsURL() method.
    */
    @Test
    public void subTestGetUniqueIDAsURL() {
        assertEquals(null, this.jMetaDataText.getUniqueIDAsURL());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS URL === " + jMetaDataText.getUniqueIDAsURL());
    }

   /**
    * Test getBitRateMaximumStringAsInteger() method.
    */
    @Test
    public void subTestGetBitRateMaximumStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getBitRateMaximumStringAsInteger());
        System.out.println("Maximum Bit rate (with measurement) AS Integer === " + jMetaDataText.getBitRateMaximumStringAsInteger());
    }

   /**
    * Test getBitRateMaximumStringAsLong() method.
    */
    @Test
    public void subTestGetBitRateMaximumStringAsLong() {
        assertEquals(null, this.jMetaDataText.getBitRateMaximumStringAsLong());
        System.out.println("Maximum Bit rate (with measurement) AS Long === " + jMetaDataText.getBitRateMaximumStringAsLong());
    }

   /**
    * Test getBitRateMaximumStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitRateMaximumStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getBitRateMaximumStringAsLocalDateTime());
        System.out.println("Maximum Bit rate (with measurement) AS LocalDateTime === " + jMetaDataText.getBitRateMaximumStringAsLocalDateTime());
    }

   /**
    * Test getBitRateMaximumStringAsLocalTime() method.
    */
    @Test
    public void subTestGetBitRateMaximumStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getBitRateMaximumStringAsLocalTime());
        System.out.println("Maximum Bit rate (with measurement) AS LocalTime === " + jMetaDataText.getBitRateMaximumStringAsLocalTime());
    }

   /**
    * Test getBitRateMaximumStringAsString() method.
    */
    @Test
    public void subTestGetBitRateMaximumStringAsString() {
        assertEquals(null, this.jMetaDataText.getBitRateMaximumStringAsString());
        System.out.println("Maximum Bit rate (with measurement) AS String === " + jMetaDataText.getBitRateMaximumStringAsString());
    }

   /**
    * Test getBitRateMaximumStringAsBoolean() method.
    */
    @Test
    public void subTestGetBitRateMaximumStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getBitRateMaximumStringAsBoolean());
        System.out.println("Maximum Bit rate (with measurement) AS Boolean === " + jMetaDataText.getBitRateMaximumStringAsBoolean());
    }

   /**
    * Test getBitRateMaximumStringAsBigInteger() method.
    */
    @Test
    public void subTestGetBitRateMaximumStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getBitRateMaximumStringAsBigInteger());
        System.out.println("Maximum Bit rate (with measurement) AS BigInteger === " + jMetaDataText.getBitRateMaximumStringAsBigInteger());
    }

   /**
    * Test getBitRateMaximumStringAsURL() method.
    */
    @Test
    public void subTestGetBitRateMaximumStringAsURL() {
        assertEquals(null, this.jMetaDataText.getBitRateMaximumStringAsURL());
        System.out.println("Maximum Bit rate (with measurement) AS URL === " + jMetaDataText.getBitRateMaximumStringAsURL());
    }

   /**
    * Test getDelayString3AsInteger() method.
    */
    @Test
    public void subTestGetDelayString3AsInteger() {
        assertEquals(null, this.jMetaDataText.getDelayString3AsInteger());
        System.out.println("Delay in format : HH:MM:SS.MMM AS Integer === " + jMetaDataText.getDelayString3AsInteger());
    }

   /**
    * Test getDelayString3AsLong() method.
    */
    @Test
    public void subTestGetDelayString3AsLong() {
        assertEquals(null, this.jMetaDataText.getDelayString3AsLong());
        System.out.println("Delay in format : HH:MM:SS.MMM AS Long === " + jMetaDataText.getDelayString3AsLong());
    }

   /**
    * Test getDelayString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDelayString3AsLocalDateTime());
        System.out.println("Delay in format : HH:MM:SS.MMM AS LocalDateTime === " + jMetaDataText.getDelayString3AsLocalDateTime());
    }

   /**
    * Test getDelayString3AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayString3AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDelayString3AsLocalTime());
        System.out.println("Delay in format : HH:MM:SS.MMM AS LocalTime === " + jMetaDataText.getDelayString3AsLocalTime());
    }

   /**
    * Test getDelayString3AsString() method.
    */
    @Test
    public void subTestGetDelayString3AsString() {
        assertEquals(null, this.jMetaDataText.getDelayString3AsString());
        System.out.println("Delay in format : HH:MM:SS.MMM AS String === " + jMetaDataText.getDelayString3AsString());
    }

   /**
    * Test getDelayString3AsBoolean() method.
    */
    @Test
    public void subTestGetDelayString3AsBoolean() {
        assertEquals(null, this.jMetaDataText.getDelayString3AsBoolean());
        System.out.println("Delay in format : HH:MM:SS.MMM AS Boolean === " + jMetaDataText.getDelayString3AsBoolean());
    }

   /**
    * Test getDelayString3AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayString3AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDelayString3AsBigInteger());
        System.out.println("Delay in format : HH:MM:SS.MMM AS BigInteger === " + jMetaDataText.getDelayString3AsBigInteger());
    }

   /**
    * Test getDelayString3AsURL() method.
    */
    @Test
    public void subTestGetDelayString3AsURL() {
        assertEquals(null, this.jMetaDataText.getDelayString3AsURL());
        System.out.println("Delay in format : HH:MM:SS.MMM AS URL === " + jMetaDataText.getDelayString3AsURL());
    }

   /**
    * Test getVideoDelayStringAsInteger() method.
    */
    @Test
    public void subTestGetVideoDelayStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getVideoDelayStringAsInteger());
        System.out.println("Video_Delay/String AS Integer === " + jMetaDataText.getVideoDelayStringAsInteger());
    }

   /**
    * Test getVideoDelayStringAsLong() method.
    */
    @Test
    public void subTestGetVideoDelayStringAsLong() {
        assertEquals(null, this.jMetaDataText.getVideoDelayStringAsLong());
        System.out.println("Video_Delay/String AS Long === " + jMetaDataText.getVideoDelayStringAsLong());
    }

   /**
    * Test getVideoDelayStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetVideoDelayStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getVideoDelayStringAsLocalDateTime());
        System.out.println("Video_Delay/String AS LocalDateTime === " + jMetaDataText.getVideoDelayStringAsLocalDateTime());
    }

   /**
    * Test getVideoDelayStringAsLocalTime() method.
    */
    @Test
    public void subTestGetVideoDelayStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getVideoDelayStringAsLocalTime());
        System.out.println("Video_Delay/String AS LocalTime === " + jMetaDataText.getVideoDelayStringAsLocalTime());
    }

   /**
    * Test getVideoDelayStringAsString() method.
    */
    @Test
    public void subTestGetVideoDelayStringAsString() {
        assertEquals(null, this.jMetaDataText.getVideoDelayStringAsString());
        System.out.println("Video_Delay/String AS String === " + jMetaDataText.getVideoDelayStringAsString());
    }

   /**
    * Test getVideoDelayStringAsBoolean() method.
    */
    @Test
    public void subTestGetVideoDelayStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getVideoDelayStringAsBoolean());
        System.out.println("Video_Delay/String AS Boolean === " + jMetaDataText.getVideoDelayStringAsBoolean());
    }

   /**
    * Test getVideoDelayStringAsBigInteger() method.
    */
    @Test
    public void subTestGetVideoDelayStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getVideoDelayStringAsBigInteger());
        System.out.println("Video_Delay/String AS BigInteger === " + jMetaDataText.getVideoDelayStringAsBigInteger());
    }

   /**
    * Test getVideoDelayStringAsURL() method.
    */
    @Test
    public void subTestGetVideoDelayStringAsURL() {
        assertEquals(null, this.jMetaDataText.getVideoDelayStringAsURL());
        System.out.println("Video_Delay/String AS URL === " + jMetaDataText.getVideoDelayStringAsURL());
    }

   /**
    * Test getDelayString4AsInteger() method.
    */
    @Test
    public void subTestGetDelayString4AsInteger() {
        assertEquals(null, this.jMetaDataText.getDelayString4AsInteger());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Integer === " + jMetaDataText.getDelayString4AsInteger());
    }

   /**
    * Test getDelayString4AsLong() method.
    */
    @Test
    public void subTestGetDelayString4AsLong() {
        assertEquals(null, this.jMetaDataText.getDelayString4AsLong());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Long === " + jMetaDataText.getDelayString4AsLong());
    }

   /**
    * Test getDelayString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDelayString4AsLocalDateTime());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS LocalDateTime === " + jMetaDataText.getDelayString4AsLocalDateTime());
    }

   /**
    * Test getDelayString4AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayString4AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDelayString4AsLocalTime());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS LocalTime === " + jMetaDataText.getDelayString4AsLocalTime());
    }

   /**
    * Test getDelayString4AsString() method.
    */
    @Test
    public void subTestGetDelayString4AsString() {
        assertEquals(null, this.jMetaDataText.getDelayString4AsString());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS String === " + jMetaDataText.getDelayString4AsString());
    }

   /**
    * Test getDelayString4AsBoolean() method.
    */
    @Test
    public void subTestGetDelayString4AsBoolean() {
        assertEquals(null, this.jMetaDataText.getDelayString4AsBoolean());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Boolean === " + jMetaDataText.getDelayString4AsBoolean());
    }

   /**
    * Test getDelayString4AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayString4AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDelayString4AsBigInteger());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS BigInteger === " + jMetaDataText.getDelayString4AsBigInteger());
    }

   /**
    * Test getDelayString4AsURL() method.
    */
    @Test
    public void subTestGetDelayString4AsURL() {
        assertEquals(null, this.jMetaDataText.getDelayString4AsURL());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS URL === " + jMetaDataText.getDelayString4AsURL());
    }

   /**
    * Test getColorSpaceAsInteger() method.
    */
    @Test
    public void subTestGetColorSpaceAsInteger() {
        assertEquals(null, this.jMetaDataText.getColorSpaceAsInteger());
        System.out.println("ColorSpace AS Integer === " + jMetaDataText.getColorSpaceAsInteger());
    }

   /**
    * Test getColorSpaceAsLong() method.
    */
    @Test
    public void subTestGetColorSpaceAsLong() {
        assertEquals(null, this.jMetaDataText.getColorSpaceAsLong());
        System.out.println("ColorSpace AS Long === " + jMetaDataText.getColorSpaceAsLong());
    }

   /**
    * Test getColorSpaceAsLocalDateTime() method.
    */
    @Test
    public void subTestGetColorSpaceAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getColorSpaceAsLocalDateTime());
        System.out.println("ColorSpace AS LocalDateTime === " + jMetaDataText.getColorSpaceAsLocalDateTime());
    }

   /**
    * Test getColorSpaceAsLocalTime() method.
    */
    @Test
    public void subTestGetColorSpaceAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getColorSpaceAsLocalTime());
        System.out.println("ColorSpace AS LocalTime === " + jMetaDataText.getColorSpaceAsLocalTime());
    }

   /**
    * Test getColorSpaceAsString() method.
    */
    @Test
    public void subTestGetColorSpaceAsString() {
        assertEquals(null, this.jMetaDataText.getColorSpaceAsString());
        System.out.println("ColorSpace AS String === " + jMetaDataText.getColorSpaceAsString());
    }

   /**
    * Test getColorSpaceAsBoolean() method.
    */
    @Test
    public void subTestGetColorSpaceAsBoolean() {
        assertEquals(null, this.jMetaDataText.getColorSpaceAsBoolean());
        System.out.println("ColorSpace AS Boolean === " + jMetaDataText.getColorSpaceAsBoolean());
    }

   /**
    * Test getColorSpaceAsBigInteger() method.
    */
    @Test
    public void subTestGetColorSpaceAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getColorSpaceAsBigInteger());
        System.out.println("ColorSpace AS BigInteger === " + jMetaDataText.getColorSpaceAsBigInteger());
    }

   /**
    * Test getColorSpaceAsURL() method.
    */
    @Test
    public void subTestGetColorSpaceAsURL() {
        assertEquals(null, this.jMetaDataText.getColorSpaceAsURL());
        System.out.println("ColorSpace AS URL === " + jMetaDataText.getColorSpaceAsURL());
    }

   /**
    * Test getDelayString1AsInteger() method.
    */
    @Test
    public void subTestGetDelayString1AsInteger() {
        assertEquals(null, this.jMetaDataText.getDelayString1AsInteger());
        System.out.println("Delay with measurement AS Integer === " + jMetaDataText.getDelayString1AsInteger());
    }

   /**
    * Test getDelayString1AsLong() method.
    */
    @Test
    public void subTestGetDelayString1AsLong() {
        assertEquals(null, this.jMetaDataText.getDelayString1AsLong());
        System.out.println("Delay with measurement AS Long === " + jMetaDataText.getDelayString1AsLong());
    }

   /**
    * Test getDelayString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDelayString1AsLocalDateTime());
        System.out.println("Delay with measurement AS LocalDateTime === " + jMetaDataText.getDelayString1AsLocalDateTime());
    }

   /**
    * Test getDelayString1AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayString1AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDelayString1AsLocalTime());
        System.out.println("Delay with measurement AS LocalTime === " + jMetaDataText.getDelayString1AsLocalTime());
    }

   /**
    * Test getDelayString1AsString() method.
    */
    @Test
    public void subTestGetDelayString1AsString() {
        assertEquals(null, this.jMetaDataText.getDelayString1AsString());
        System.out.println("Delay with measurement AS String === " + jMetaDataText.getDelayString1AsString());
    }

   /**
    * Test getDelayString1AsBoolean() method.
    */
    @Test
    public void subTestGetDelayString1AsBoolean() {
        assertEquals(null, this.jMetaDataText.getDelayString1AsBoolean());
        System.out.println("Delay with measurement AS Boolean === " + jMetaDataText.getDelayString1AsBoolean());
    }

   /**
    * Test getDelayString1AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayString1AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDelayString1AsBigInteger());
        System.out.println("Delay with measurement AS BigInteger === " + jMetaDataText.getDelayString1AsBigInteger());
    }

   /**
    * Test getDelayString1AsURL() method.
    */
    @Test
    public void subTestGetDelayString1AsURL() {
        assertEquals(null, this.jMetaDataText.getDelayString1AsURL());
        System.out.println("Delay with measurement AS URL === " + jMetaDataText.getDelayString1AsURL());
    }

   /**
    * Test getDelayString2AsInteger() method.
    */
    @Test
    public void subTestGetDelayString2AsInteger() {
        assertEquals(null, this.jMetaDataText.getDelayString2AsInteger());
        System.out.println("Delay with measurement AS Integer === " + jMetaDataText.getDelayString2AsInteger());
    }

   /**
    * Test getDelayString2AsLong() method.
    */
    @Test
    public void subTestGetDelayString2AsLong() {
        assertEquals(null, this.jMetaDataText.getDelayString2AsLong());
        System.out.println("Delay with measurement AS Long === " + jMetaDataText.getDelayString2AsLong());
    }

   /**
    * Test getDelayString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDelayString2AsLocalDateTime());
        System.out.println("Delay with measurement AS LocalDateTime === " + jMetaDataText.getDelayString2AsLocalDateTime());
    }

   /**
    * Test getDelayString2AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayString2AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDelayString2AsLocalTime());
        System.out.println("Delay with measurement AS LocalTime === " + jMetaDataText.getDelayString2AsLocalTime());
    }

   /**
    * Test getDelayString2AsString() method.
    */
    @Test
    public void subTestGetDelayString2AsString() {
        assertEquals(null, this.jMetaDataText.getDelayString2AsString());
        System.out.println("Delay with measurement AS String === " + jMetaDataText.getDelayString2AsString());
    }

   /**
    * Test getDelayString2AsBoolean() method.
    */
    @Test
    public void subTestGetDelayString2AsBoolean() {
        assertEquals(null, this.jMetaDataText.getDelayString2AsBoolean());
        System.out.println("Delay with measurement AS Boolean === " + jMetaDataText.getDelayString2AsBoolean());
    }

   /**
    * Test getDelayString2AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayString2AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDelayString2AsBigInteger());
        System.out.println("Delay with measurement AS BigInteger === " + jMetaDataText.getDelayString2AsBigInteger());
    }

   /**
    * Test getDelayString2AsURL() method.
    */
    @Test
    public void subTestGetDelayString2AsURL() {
        assertEquals(null, this.jMetaDataText.getDelayString2AsURL());
        System.out.println("Delay with measurement AS URL === " + jMetaDataText.getDelayString2AsURL());
    }

   /**
    * Test getDelayString5AsInteger() method.
    */
    @Test
    public void subTestGetDelayString5AsInteger() {
        assertEquals(null, this.jMetaDataText.getDelayString5AsInteger());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Integer === " + jMetaDataText.getDelayString5AsInteger());
    }

   /**
    * Test getDelayString5AsLong() method.
    */
    @Test
    public void subTestGetDelayString5AsLong() {
        assertEquals(null, this.jMetaDataText.getDelayString5AsLong());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Long === " + jMetaDataText.getDelayString5AsLong());
    }

   /**
    * Test getDelayString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDelayString5AsLocalDateTime());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS LocalDateTime === " + jMetaDataText.getDelayString5AsLocalDateTime());
    }

   /**
    * Test getDelayString5AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayString5AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDelayString5AsLocalTime());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS LocalTime === " + jMetaDataText.getDelayString5AsLocalTime());
    }

   /**
    * Test getDelayString5AsString() method.
    */
    @Test
    public void subTestGetDelayString5AsString() {
        assertEquals(null, this.jMetaDataText.getDelayString5AsString());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS String === " + jMetaDataText.getDelayString5AsString());
    }

   /**
    * Test getDelayString5AsBoolean() method.
    */
    @Test
    public void subTestGetDelayString5AsBoolean() {
        assertEquals(null, this.jMetaDataText.getDelayString5AsBoolean());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Boolean === " + jMetaDataText.getDelayString5AsBoolean());
    }

   /**
    * Test getDelayString5AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayString5AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDelayString5AsBigInteger());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS BigInteger === " + jMetaDataText.getDelayString5AsBigInteger());
    }

   /**
    * Test getDelayString5AsURL() method.
    */
    @Test
    public void subTestGetDelayString5AsURL() {
        assertEquals(null, this.jMetaDataText.getDelayString5AsURL());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS URL === " + jMetaDataText.getDelayString5AsURL());
    }

   /**
    * Test getDelayAsInteger() method.
    */
    @Test
    public void subTestGetDelayAsInteger() {
        assertEquals(null, this.jMetaDataText.getDelayAsInteger());
        System.out.println("Delay fixed in the stream (relative) IN MS AS Integer === " + jMetaDataText.getDelayAsInteger());
    }

   /**
    * Test getDelayAsLong() method.
    */
    @Test
    public void subTestGetDelayAsLong() {
        assertEquals(null, this.jMetaDataText.getDelayAsLong());
        System.out.println("Delay fixed in the stream (relative) IN MS AS Long === " + jMetaDataText.getDelayAsLong());
    }

   /**
    * Test getDelayAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDelayAsLocalDateTime());
        System.out.println("Delay fixed in the stream (relative) IN MS AS LocalDateTime === " + jMetaDataText.getDelayAsLocalDateTime());
    }

   /**
    * Test getDelayAsLocalTime() method.
    */
    @Test
    public void subTestGetDelayAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDelayAsLocalTime());
        System.out.println("Delay fixed in the stream (relative) IN MS AS LocalTime === " + jMetaDataText.getDelayAsLocalTime());
    }

   /**
    * Test getDelayAsString() method.
    */
    @Test
    public void subTestGetDelayAsString() {
        assertEquals(null, this.jMetaDataText.getDelayAsString());
        System.out.println("Delay fixed in the stream (relative) IN MS AS String === " + jMetaDataText.getDelayAsString());
    }

   /**
    * Test getDelayAsBoolean() method.
    */
    @Test
    public void subTestGetDelayAsBoolean() {
        assertEquals(null, this.jMetaDataText.getDelayAsBoolean());
        System.out.println("Delay fixed in the stream (relative) IN MS AS Boolean === " + jMetaDataText.getDelayAsBoolean());
    }

   /**
    * Test getDelayAsBigInteger() method.
    */
    @Test
    public void subTestGetDelayAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDelayAsBigInteger());
        System.out.println("Delay fixed in the stream (relative) IN MS AS BigInteger === " + jMetaDataText.getDelayAsBigInteger());
    }

   /**
    * Test getDelayAsURL() method.
    */
    @Test
    public void subTestGetDelayAsURL() {
        assertEquals(null, this.jMetaDataText.getDelayAsURL());
        System.out.println("Delay fixed in the stream (relative) IN MS AS URL === " + jMetaDataText.getDelayAsURL());
    }

   /**
    * Test getEncodedApplicationUrlAsInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationUrlAsInteger() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationUrlAsInteger());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit. AS Integer === " + jMetaDataText.getEncodedApplicationUrlAsInteger());
    }

   /**
    * Test getEncodedApplicationUrlAsLong() method.
    */
    @Test
    public void subTestGetEncodedApplicationUrlAsLong() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationUrlAsLong());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit. AS Long === " + jMetaDataText.getEncodedApplicationUrlAsLong());
    }

   /**
    * Test getEncodedApplicationUrlAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationUrlAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationUrlAsLocalDateTime());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit. AS LocalDateTime === " + jMetaDataText.getEncodedApplicationUrlAsLocalDateTime());
    }

   /**
    * Test getEncodedApplicationUrlAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationUrlAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationUrlAsLocalTime());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit. AS LocalTime === " + jMetaDataText.getEncodedApplicationUrlAsLocalTime());
    }

   /**
    * Test getEncodedApplicationUrlAsString() method.
    */
    @Test
    public void subTestGetEncodedApplicationUrlAsString() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationUrlAsString());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit. AS String === " + jMetaDataText.getEncodedApplicationUrlAsString());
    }

   /**
    * Test getEncodedApplicationUrlAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedApplicationUrlAsBoolean() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationUrlAsBoolean());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit. AS Boolean === " + jMetaDataText.getEncodedApplicationUrlAsBoolean());
    }

   /**
    * Test getEncodedApplicationUrlAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationUrlAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationUrlAsBigInteger());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit. AS BigInteger === " + jMetaDataText.getEncodedApplicationUrlAsBigInteger());
    }

   /**
    * Test getEncodedApplicationUrlAsURL() method.
    */
    @Test
    public void subTestGetEncodedApplicationUrlAsURL() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationUrlAsURL());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit. AS URL === " + jMetaDataText.getEncodedApplicationUrlAsURL());
    }

   /**
    * Test getSourceStreamSizeEncodedString4AsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsInteger() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedString4AsInteger());
        System.out.println("Source_StreamSize_Encoded/String4 AS Integer === " + jMetaDataText.getSourceStreamSizeEncodedString4AsInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedString4AsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsLong() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedString4AsLong());
        System.out.println("Source_StreamSize_Encoded/String4 AS Long === " + jMetaDataText.getSourceStreamSizeEncodedString4AsLong());
    }

   /**
    * Test getSourceStreamSizeEncodedString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedString4AsLocalDateTime());
        System.out.println("Source_StreamSize_Encoded/String4 AS LocalDateTime === " + jMetaDataText.getSourceStreamSizeEncodedString4AsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeEncodedString4AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedString4AsLocalTime());
        System.out.println("Source_StreamSize_Encoded/String4 AS LocalTime === " + jMetaDataText.getSourceStreamSizeEncodedString4AsLocalTime());
    }

   /**
    * Test getSourceStreamSizeEncodedString4AsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsString() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedString4AsString());
        System.out.println("Source_StreamSize_Encoded/String4 AS String === " + jMetaDataText.getSourceStreamSizeEncodedString4AsString());
    }

   /**
    * Test getSourceStreamSizeEncodedString4AsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsBoolean() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedString4AsBoolean());
        System.out.println("Source_StreamSize_Encoded/String4 AS Boolean === " + jMetaDataText.getSourceStreamSizeEncodedString4AsBoolean());
    }

   /**
    * Test getSourceStreamSizeEncodedString4AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedString4AsBigInteger());
        System.out.println("Source_StreamSize_Encoded/String4 AS BigInteger === " + jMetaDataText.getSourceStreamSizeEncodedString4AsBigInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedString4AsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString4AsURL() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedString4AsURL());
        System.out.println("Source_StreamSize_Encoded/String4 AS URL === " + jMetaDataText.getSourceStreamSizeEncodedString4AsURL());
    }

   /**
    * Test getSourceStreamSizeEncodedString5AsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsInteger() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedString5AsInteger());
        System.out.println("Source Encoded Streamsize in with percentage value AS Integer === " + jMetaDataText.getSourceStreamSizeEncodedString5AsInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedString5AsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsLong() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedString5AsLong());
        System.out.println("Source Encoded Streamsize in with percentage value AS Long === " + jMetaDataText.getSourceStreamSizeEncodedString5AsLong());
    }

   /**
    * Test getSourceStreamSizeEncodedString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedString5AsLocalDateTime());
        System.out.println("Source Encoded Streamsize in with percentage value AS LocalDateTime === " + jMetaDataText.getSourceStreamSizeEncodedString5AsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeEncodedString5AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedString5AsLocalTime());
        System.out.println("Source Encoded Streamsize in with percentage value AS LocalTime === " + jMetaDataText.getSourceStreamSizeEncodedString5AsLocalTime());
    }

   /**
    * Test getSourceStreamSizeEncodedString5AsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsString() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedString5AsString());
        System.out.println("Source Encoded Streamsize in with percentage value AS String === " + jMetaDataText.getSourceStreamSizeEncodedString5AsString());
    }

   /**
    * Test getSourceStreamSizeEncodedString5AsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsBoolean() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedString5AsBoolean());
        System.out.println("Source Encoded Streamsize in with percentage value AS Boolean === " + jMetaDataText.getSourceStreamSizeEncodedString5AsBoolean());
    }

   /**
    * Test getSourceStreamSizeEncodedString5AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedString5AsBigInteger());
        System.out.println("Source Encoded Streamsize in with percentage value AS BigInteger === " + jMetaDataText.getSourceStreamSizeEncodedString5AsBigInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedString5AsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString5AsURL() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedString5AsURL());
        System.out.println("Source Encoded Streamsize in with percentage value AS URL === " + jMetaDataText.getSourceStreamSizeEncodedString5AsURL());
    }

   /**
    * Test getSourceDurationFirstFrameString1AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsInteger() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameString1AsInteger());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS Integer === " + jMetaDataText.getSourceDurationFirstFrameString1AsInteger());
    }

   /**
    * Test getSourceDurationFirstFrameString1AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsLong() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameString1AsLong());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS Long === " + jMetaDataText.getSourceDurationFirstFrameString1AsLong());
    }

   /**
    * Test getSourceDurationFirstFrameString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameString1AsLocalDateTime());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS LocalDateTime === " + jMetaDataText.getSourceDurationFirstFrameString1AsLocalDateTime());
    }

   /**
    * Test getSourceDurationFirstFrameString1AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameString1AsLocalTime());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS LocalTime === " + jMetaDataText.getSourceDurationFirstFrameString1AsLocalTime());
    }

   /**
    * Test getSourceDurationFirstFrameString1AsString() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsString() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameString1AsString());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS String === " + jMetaDataText.getSourceDurationFirstFrameString1AsString());
    }

   /**
    * Test getSourceDurationFirstFrameString1AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsBoolean() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameString1AsBoolean());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS Boolean === " + jMetaDataText.getSourceDurationFirstFrameString1AsBoolean());
    }

   /**
    * Test getSourceDurationFirstFrameString1AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameString1AsBigInteger());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS BigInteger === " + jMetaDataText.getSourceDurationFirstFrameString1AsBigInteger());
    }

   /**
    * Test getSourceDurationFirstFrameString1AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString1AsURL() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameString1AsURL());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS URL === " + jMetaDataText.getSourceDurationFirstFrameString1AsURL());
    }

   /**
    * Test getSourceDurationFirstFrameString2AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsInteger() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameString2AsInteger());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Integer === " + jMetaDataText.getSourceDurationFirstFrameString2AsInteger());
    }

   /**
    * Test getSourceDurationFirstFrameString2AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsLong() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameString2AsLong());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Long === " + jMetaDataText.getSourceDurationFirstFrameString2AsLong());
    }

   /**
    * Test getSourceDurationFirstFrameString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameString2AsLocalDateTime());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS LocalDateTime === " + jMetaDataText.getSourceDurationFirstFrameString2AsLocalDateTime());
    }

   /**
    * Test getSourceDurationFirstFrameString2AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameString2AsLocalTime());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS LocalTime === " + jMetaDataText.getSourceDurationFirstFrameString2AsLocalTime());
    }

   /**
    * Test getSourceDurationFirstFrameString2AsString() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsString() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameString2AsString());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS String === " + jMetaDataText.getSourceDurationFirstFrameString2AsString());
    }

   /**
    * Test getSourceDurationFirstFrameString2AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsBoolean() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameString2AsBoolean());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Boolean === " + jMetaDataText.getSourceDurationFirstFrameString2AsBoolean());
    }

   /**
    * Test getSourceDurationFirstFrameString2AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameString2AsBigInteger());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS BigInteger === " + jMetaDataText.getSourceDurationFirstFrameString2AsBigInteger());
    }

   /**
    * Test getSourceDurationFirstFrameString2AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString2AsURL() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameString2AsURL());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS URL === " + jMetaDataText.getSourceDurationFirstFrameString2AsURL());
    }

   /**
    * Test getSourceDurationFirstFrameString3AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsInteger() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameString3AsInteger());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM AS Integer === " + jMetaDataText.getSourceDurationFirstFrameString3AsInteger());
    }

   /**
    * Test getSourceDurationFirstFrameString3AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsLong() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameString3AsLong());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM AS Long === " + jMetaDataText.getSourceDurationFirstFrameString3AsLong());
    }

   /**
    * Test getSourceDurationFirstFrameString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameString3AsLocalDateTime());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM AS LocalDateTime === " + jMetaDataText.getSourceDurationFirstFrameString3AsLocalDateTime());
    }

   /**
    * Test getSourceDurationFirstFrameString3AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameString3AsLocalTime());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM AS LocalTime === " + jMetaDataText.getSourceDurationFirstFrameString3AsLocalTime());
    }

   /**
    * Test getSourceDurationFirstFrameString3AsString() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsString() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameString3AsString());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM AS String === " + jMetaDataText.getSourceDurationFirstFrameString3AsString());
    }

   /**
    * Test getSourceDurationFirstFrameString3AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsBoolean() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameString3AsBoolean());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM AS Boolean === " + jMetaDataText.getSourceDurationFirstFrameString3AsBoolean());
    }

   /**
    * Test getSourceDurationFirstFrameString3AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameString3AsBigInteger());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM AS BigInteger === " + jMetaDataText.getSourceDurationFirstFrameString3AsBigInteger());
    }

   /**
    * Test getSourceDurationFirstFrameString3AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString3AsURL() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameString3AsURL());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.MMM AS URL === " + jMetaDataText.getSourceDurationFirstFrameString3AsURL());
    }

   /**
    * Test getEncodedLibraryAsInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryAsInteger() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryAsInteger());
        System.out.println("Software used to create the file AS Integer === " + jMetaDataText.getEncodedLibraryAsInteger());
    }

   /**
    * Test getEncodedLibraryAsLong() method.
    */
    @Test
    public void subTestGetEncodedLibraryAsLong() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryAsLong());
        System.out.println("Software used to create the file AS Long === " + jMetaDataText.getEncodedLibraryAsLong());
    }

   /**
    * Test getEncodedLibraryAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryAsLocalDateTime());
        System.out.println("Software used to create the file AS LocalDateTime === " + jMetaDataText.getEncodedLibraryAsLocalDateTime());
    }

   /**
    * Test getEncodedLibraryAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryAsLocalTime());
        System.out.println("Software used to create the file AS LocalTime === " + jMetaDataText.getEncodedLibraryAsLocalTime());
    }

   /**
    * Test getEncodedLibraryAsString() method.
    */
    @Test
    public void subTestGetEncodedLibraryAsString() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryAsString());
        System.out.println("Software used to create the file AS String === " + jMetaDataText.getEncodedLibraryAsString());
    }

   /**
    * Test getEncodedLibraryAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedLibraryAsBoolean() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryAsBoolean());
        System.out.println("Software used to create the file AS Boolean === " + jMetaDataText.getEncodedLibraryAsBoolean());
    }

   /**
    * Test getEncodedLibraryAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryAsBigInteger());
        System.out.println("Software used to create the file AS BigInteger === " + jMetaDataText.getEncodedLibraryAsBigInteger());
    }

   /**
    * Test getEncodedLibraryAsURL() method.
    */
    @Test
    public void subTestGetEncodedLibraryAsURL() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryAsURL());
        System.out.println("Software used to create the file AS URL === " + jMetaDataText.getEncodedLibraryAsURL());
    }

   /**
    * Test getSourceDurationFirstFrameString4AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsInteger() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameString4AsInteger());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Integer === " + jMetaDataText.getSourceDurationFirstFrameString4AsInteger());
    }

   /**
    * Test getSourceDurationFirstFrameString4AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsLong() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameString4AsLong());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Long === " + jMetaDataText.getSourceDurationFirstFrameString4AsLong());
    }

   /**
    * Test getSourceDurationFirstFrameString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameString4AsLocalDateTime());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS LocalDateTime === " + jMetaDataText.getSourceDurationFirstFrameString4AsLocalDateTime());
    }

   /**
    * Test getSourceDurationFirstFrameString4AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameString4AsLocalTime());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS LocalTime === " + jMetaDataText.getSourceDurationFirstFrameString4AsLocalTime());
    }

   /**
    * Test getSourceDurationFirstFrameString4AsString() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsString() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameString4AsString());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS String === " + jMetaDataText.getSourceDurationFirstFrameString4AsString());
    }

   /**
    * Test getSourceDurationFirstFrameString4AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsBoolean() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameString4AsBoolean());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Boolean === " + jMetaDataText.getSourceDurationFirstFrameString4AsBoolean());
    }

   /**
    * Test getSourceDurationFirstFrameString4AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameString4AsBigInteger());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS BigInteger === " + jMetaDataText.getSourceDurationFirstFrameString4AsBigInteger());
    }

   /**
    * Test getSourceDurationFirstFrameString4AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString4AsURL() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameString4AsURL());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS URL === " + jMetaDataText.getSourceDurationFirstFrameString4AsURL());
    }

   /**
    * Test getSourceDurationFirstFrameString5AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsInteger() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameString5AsInteger());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Integer === " + jMetaDataText.getSourceDurationFirstFrameString5AsInteger());
    }

   /**
    * Test getSourceDurationFirstFrameString5AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsLong() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameString5AsLong());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Long === " + jMetaDataText.getSourceDurationFirstFrameString5AsLong());
    }

   /**
    * Test getSourceDurationFirstFrameString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameString5AsLocalDateTime());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS LocalDateTime === " + jMetaDataText.getSourceDurationFirstFrameString5AsLocalDateTime());
    }

   /**
    * Test getSourceDurationFirstFrameString5AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameString5AsLocalTime());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS LocalTime === " + jMetaDataText.getSourceDurationFirstFrameString5AsLocalTime());
    }

   /**
    * Test getSourceDurationFirstFrameString5AsString() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsString() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameString5AsString());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS String === " + jMetaDataText.getSourceDurationFirstFrameString5AsString());
    }

   /**
    * Test getSourceDurationFirstFrameString5AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsBoolean() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameString5AsBoolean());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Boolean === " + jMetaDataText.getSourceDurationFirstFrameString5AsBoolean());
    }

   /**
    * Test getSourceDurationFirstFrameString5AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameString5AsBigInteger());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS BigInteger === " + jMetaDataText.getSourceDurationFirstFrameString5AsBigInteger());
    }

   /**
    * Test getSourceDurationFirstFrameString5AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameString5AsURL() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameString5AsURL());
        System.out.println("Source Duration of the first frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS URL === " + jMetaDataText.getSourceDurationFirstFrameString5AsURL());
    }

   /**
    * Test getFrameRateNominalAsInteger() method.
    */
    @Test
    public void subTestGetFrameRateNominalAsInteger() {
        assertEquals(null, this.jMetaDataText.getFrameRateNominalAsInteger());
        System.out.println("Nominal Frames per second AS Integer === " + jMetaDataText.getFrameRateNominalAsInteger());
    }

   /**
    * Test getFrameRateNominalAsLong() method.
    */
    @Test
    public void subTestGetFrameRateNominalAsLong() {
        assertEquals(null, this.jMetaDataText.getFrameRateNominalAsLong());
        System.out.println("Nominal Frames per second AS Long === " + jMetaDataText.getFrameRateNominalAsLong());
    }

   /**
    * Test getFrameRateNominalAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFrameRateNominalAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getFrameRateNominalAsLocalDateTime());
        System.out.println("Nominal Frames per second AS LocalDateTime === " + jMetaDataText.getFrameRateNominalAsLocalDateTime());
    }

   /**
    * Test getFrameRateNominalAsLocalTime() method.
    */
    @Test
    public void subTestGetFrameRateNominalAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getFrameRateNominalAsLocalTime());
        System.out.println("Nominal Frames per second AS LocalTime === " + jMetaDataText.getFrameRateNominalAsLocalTime());
    }

   /**
    * Test getFrameRateNominalAsString() method.
    */
    @Test
    public void subTestGetFrameRateNominalAsString() {
        assertEquals(null, this.jMetaDataText.getFrameRateNominalAsString());
        System.out.println("Nominal Frames per second AS String === " + jMetaDataText.getFrameRateNominalAsString());
    }

   /**
    * Test getFrameRateNominalAsBoolean() method.
    */
    @Test
    public void subTestGetFrameRateNominalAsBoolean() {
        assertEquals(null, this.jMetaDataText.getFrameRateNominalAsBoolean());
        System.out.println("Nominal Frames per second AS Boolean === " + jMetaDataText.getFrameRateNominalAsBoolean());
    }

   /**
    * Test getFrameRateNominalAsBigInteger() method.
    */
    @Test
    public void subTestGetFrameRateNominalAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getFrameRateNominalAsBigInteger());
        System.out.println("Nominal Frames per second AS BigInteger === " + jMetaDataText.getFrameRateNominalAsBigInteger());
    }

   /**
    * Test getFrameRateNominalAsURL() method.
    */
    @Test
    public void subTestGetFrameRateNominalAsURL() {
        assertEquals(null, this.jMetaDataText.getFrameRateNominalAsURL());
        System.out.println("Nominal Frames per second AS URL === " + jMetaDataText.getFrameRateNominalAsURL());
    }

   /**
    * Test getInternetMediaTypeAsInteger() method.
    */
    @Test
    public void subTestGetInternetMediaTypeAsInteger() {
        assertEquals(null, this.jMetaDataText.getInternetMediaTypeAsInteger());
        System.out.println("Internet Media Type (aka MIME Type, Content-Type) AS Integer === " + jMetaDataText.getInternetMediaTypeAsInteger());
    }

   /**
    * Test getInternetMediaTypeAsLong() method.
    */
    @Test
    public void subTestGetInternetMediaTypeAsLong() {
        assertEquals(null, this.jMetaDataText.getInternetMediaTypeAsLong());
        System.out.println("Internet Media Type (aka MIME Type, Content-Type) AS Long === " + jMetaDataText.getInternetMediaTypeAsLong());
    }

   /**
    * Test getInternetMediaTypeAsLocalDateTime() method.
    */
    @Test
    public void subTestGetInternetMediaTypeAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getInternetMediaTypeAsLocalDateTime());
        System.out.println("Internet Media Type (aka MIME Type, Content-Type) AS LocalDateTime === " + jMetaDataText.getInternetMediaTypeAsLocalDateTime());
    }

   /**
    * Test getInternetMediaTypeAsLocalTime() method.
    */
    @Test
    public void subTestGetInternetMediaTypeAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getInternetMediaTypeAsLocalTime());
        System.out.println("Internet Media Type (aka MIME Type, Content-Type) AS LocalTime === " + jMetaDataText.getInternetMediaTypeAsLocalTime());
    }

   /**
    * Test getInternetMediaTypeAsString() method.
    */
    @Test
    public void subTestGetInternetMediaTypeAsString() {
        assertEquals(null, this.jMetaDataText.getInternetMediaTypeAsString());
        System.out.println("Internet Media Type (aka MIME Type, Content-Type) AS String === " + jMetaDataText.getInternetMediaTypeAsString());
    }

   /**
    * Test getInternetMediaTypeAsBoolean() method.
    */
    @Test
    public void subTestGetInternetMediaTypeAsBoolean() {
        assertEquals(null, this.jMetaDataText.getInternetMediaTypeAsBoolean());
        System.out.println("Internet Media Type (aka MIME Type, Content-Type) AS Boolean === " + jMetaDataText.getInternetMediaTypeAsBoolean());
    }

   /**
    * Test getInternetMediaTypeAsBigInteger() method.
    */
    @Test
    public void subTestGetInternetMediaTypeAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getInternetMediaTypeAsBigInteger());
        System.out.println("Internet Media Type (aka MIME Type, Content-Type) AS BigInteger === " + jMetaDataText.getInternetMediaTypeAsBigInteger());
    }

   /**
    * Test getInternetMediaTypeAsURL() method.
    */
    @Test
    public void subTestGetInternetMediaTypeAsURL() {
        assertEquals(null, this.jMetaDataText.getInternetMediaTypeAsURL());
        System.out.println("Internet Media Type (aka MIME Type, Content-Type) AS URL === " + jMetaDataText.getInternetMediaTypeAsURL());
    }

   /**
    * Test getSourceStreamSizeEncodedString2AsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsInteger() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedString2AsInteger());
        System.out.println("Source_StreamSize_Encoded/String2 AS Integer === " + jMetaDataText.getSourceStreamSizeEncodedString2AsInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedString2AsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsLong() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedString2AsLong());
        System.out.println("Source_StreamSize_Encoded/String2 AS Long === " + jMetaDataText.getSourceStreamSizeEncodedString2AsLong());
    }

   /**
    * Test getSourceStreamSizeEncodedString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedString2AsLocalDateTime());
        System.out.println("Source_StreamSize_Encoded/String2 AS LocalDateTime === " + jMetaDataText.getSourceStreamSizeEncodedString2AsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeEncodedString2AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedString2AsLocalTime());
        System.out.println("Source_StreamSize_Encoded/String2 AS LocalTime === " + jMetaDataText.getSourceStreamSizeEncodedString2AsLocalTime());
    }

   /**
    * Test getSourceStreamSizeEncodedString2AsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsString() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedString2AsString());
        System.out.println("Source_StreamSize_Encoded/String2 AS String === " + jMetaDataText.getSourceStreamSizeEncodedString2AsString());
    }

   /**
    * Test getSourceStreamSizeEncodedString2AsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsBoolean() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedString2AsBoolean());
        System.out.println("Source_StreamSize_Encoded/String2 AS Boolean === " + jMetaDataText.getSourceStreamSizeEncodedString2AsBoolean());
    }

   /**
    * Test getSourceStreamSizeEncodedString2AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedString2AsBigInteger());
        System.out.println("Source_StreamSize_Encoded/String2 AS BigInteger === " + jMetaDataText.getSourceStreamSizeEncodedString2AsBigInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedString2AsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString2AsURL() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedString2AsURL());
        System.out.println("Source_StreamSize_Encoded/String2 AS URL === " + jMetaDataText.getSourceStreamSizeEncodedString2AsURL());
    }

   /**
    * Test getDisabledAsInteger() method.
    */
    @Test
    public void subTestGetDisabledAsInteger() {
        assertEquals(null, this.jMetaDataText.getDisabledAsInteger());
        System.out.println("Set if that track should not be used AS Integer === " + jMetaDataText.getDisabledAsInteger());
    }

   /**
    * Test getDisabledAsLong() method.
    */
    @Test
    public void subTestGetDisabledAsLong() {
        assertEquals(null, this.jMetaDataText.getDisabledAsLong());
        System.out.println("Set if that track should not be used AS Long === " + jMetaDataText.getDisabledAsLong());
    }

   /**
    * Test getDisabledAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDisabledAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDisabledAsLocalDateTime());
        System.out.println("Set if that track should not be used AS LocalDateTime === " + jMetaDataText.getDisabledAsLocalDateTime());
    }

   /**
    * Test getDisabledAsLocalTime() method.
    */
    @Test
    public void subTestGetDisabledAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDisabledAsLocalTime());
        System.out.println("Set if that track should not be used AS LocalTime === " + jMetaDataText.getDisabledAsLocalTime());
    }

   /**
    * Test getDisabledAsString() method.
    */
    @Test
    public void subTestGetDisabledAsString() {
        assertEquals(null, this.jMetaDataText.getDisabledAsString());
        System.out.println("Set if that track should not be used AS String === " + jMetaDataText.getDisabledAsString());
    }

   /**
    * Test getDisabledAsBoolean() method.
    */
    @Test
    public void subTestGetDisabledAsBoolean() {
        assertEquals(null, this.jMetaDataText.getDisabledAsBoolean());
        System.out.println("Set if that track should not be used AS Boolean === " + jMetaDataText.getDisabledAsBoolean());
    }

   /**
    * Test getDisabledAsBigInteger() method.
    */
    @Test
    public void subTestGetDisabledAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDisabledAsBigInteger());
        System.out.println("Set if that track should not be used AS BigInteger === " + jMetaDataText.getDisabledAsBigInteger());
    }

   /**
    * Test getDisabledAsURL() method.
    */
    @Test
    public void subTestGetDisabledAsURL() {
        assertEquals(null, this.jMetaDataText.getDisabledAsURL());
        System.out.println("Set if that track should not be used AS URL === " + jMetaDataText.getDisabledAsURL());
    }

   /**
    * Test getFrameRateDenAsInteger() method.
    */
    @Test
    public void subTestGetFrameRateDenAsInteger() {
        assertEquals(null, this.jMetaDataText.getFrameRateDenAsInteger());
        System.out.println("Frames per second, denominator AS Integer === " + jMetaDataText.getFrameRateDenAsInteger());
    }

   /**
    * Test getFrameRateDenAsLong() method.
    */
    @Test
    public void subTestGetFrameRateDenAsLong() {
        assertEquals(null, this.jMetaDataText.getFrameRateDenAsLong());
        System.out.println("Frames per second, denominator AS Long === " + jMetaDataText.getFrameRateDenAsLong());
    }

   /**
    * Test getFrameRateDenAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFrameRateDenAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getFrameRateDenAsLocalDateTime());
        System.out.println("Frames per second, denominator AS LocalDateTime === " + jMetaDataText.getFrameRateDenAsLocalDateTime());
    }

   /**
    * Test getFrameRateDenAsLocalTime() method.
    */
    @Test
    public void subTestGetFrameRateDenAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getFrameRateDenAsLocalTime());
        System.out.println("Frames per second, denominator AS LocalTime === " + jMetaDataText.getFrameRateDenAsLocalTime());
    }

   /**
    * Test getFrameRateDenAsString() method.
    */
    @Test
    public void subTestGetFrameRateDenAsString() {
        assertEquals(null, this.jMetaDataText.getFrameRateDenAsString());
        System.out.println("Frames per second, denominator AS String === " + jMetaDataText.getFrameRateDenAsString());
    }

   /**
    * Test getFrameRateDenAsBoolean() method.
    */
    @Test
    public void subTestGetFrameRateDenAsBoolean() {
        assertEquals(null, this.jMetaDataText.getFrameRateDenAsBoolean());
        System.out.println("Frames per second, denominator AS Boolean === " + jMetaDataText.getFrameRateDenAsBoolean());
    }

   /**
    * Test getFrameRateDenAsBigInteger() method.
    */
    @Test
    public void subTestGetFrameRateDenAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getFrameRateDenAsBigInteger());
        System.out.println("Frames per second, denominator AS BigInteger === " + jMetaDataText.getFrameRateDenAsBigInteger());
    }

   /**
    * Test getFrameRateDenAsURL() method.
    */
    @Test
    public void subTestGetFrameRateDenAsURL() {
        assertEquals(null, this.jMetaDataText.getFrameRateDenAsURL());
        System.out.println("Frames per second, denominator AS URL === " + jMetaDataText.getFrameRateDenAsURL());
    }

   /**
    * Test getSourceStreamSizeEncodedString3AsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsInteger() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedString3AsInteger());
        System.out.println("Source_StreamSize_Encoded/String3 AS Integer === " + jMetaDataText.getSourceStreamSizeEncodedString3AsInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedString3AsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsLong() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedString3AsLong());
        System.out.println("Source_StreamSize_Encoded/String3 AS Long === " + jMetaDataText.getSourceStreamSizeEncodedString3AsLong());
    }

   /**
    * Test getSourceStreamSizeEncodedString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedString3AsLocalDateTime());
        System.out.println("Source_StreamSize_Encoded/String3 AS LocalDateTime === " + jMetaDataText.getSourceStreamSizeEncodedString3AsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeEncodedString3AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedString3AsLocalTime());
        System.out.println("Source_StreamSize_Encoded/String3 AS LocalTime === " + jMetaDataText.getSourceStreamSizeEncodedString3AsLocalTime());
    }

   /**
    * Test getSourceStreamSizeEncodedString3AsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsString() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedString3AsString());
        System.out.println("Source_StreamSize_Encoded/String3 AS String === " + jMetaDataText.getSourceStreamSizeEncodedString3AsString());
    }

   /**
    * Test getSourceStreamSizeEncodedString3AsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsBoolean() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedString3AsBoolean());
        System.out.println("Source_StreamSize_Encoded/String3 AS Boolean === " + jMetaDataText.getSourceStreamSizeEncodedString3AsBoolean());
    }

   /**
    * Test getSourceStreamSizeEncodedString3AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedString3AsBigInteger());
        System.out.println("Source_StreamSize_Encoded/String3 AS BigInteger === " + jMetaDataText.getSourceStreamSizeEncodedString3AsBigInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedString3AsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString3AsURL() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedString3AsURL());
        System.out.println("Source_StreamSize_Encoded/String3 AS URL === " + jMetaDataText.getSourceStreamSizeEncodedString3AsURL());
    }

   /**
    * Test getFrameRateMaximumStringAsInteger() method.
    */
    @Test
    public void subTestGetFrameRateMaximumStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getFrameRateMaximumStringAsInteger());
        System.out.println("Maximum Frames per second (with measurement) AS Integer === " + jMetaDataText.getFrameRateMaximumStringAsInteger());
    }

   /**
    * Test getFrameRateMaximumStringAsLong() method.
    */
    @Test
    public void subTestGetFrameRateMaximumStringAsLong() {
        assertEquals(null, this.jMetaDataText.getFrameRateMaximumStringAsLong());
        System.out.println("Maximum Frames per second (with measurement) AS Long === " + jMetaDataText.getFrameRateMaximumStringAsLong());
    }

   /**
    * Test getFrameRateMaximumStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFrameRateMaximumStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getFrameRateMaximumStringAsLocalDateTime());
        System.out.println("Maximum Frames per second (with measurement) AS LocalDateTime === " + jMetaDataText.getFrameRateMaximumStringAsLocalDateTime());
    }

   /**
    * Test getFrameRateMaximumStringAsLocalTime() method.
    */
    @Test
    public void subTestGetFrameRateMaximumStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getFrameRateMaximumStringAsLocalTime());
        System.out.println("Maximum Frames per second (with measurement) AS LocalTime === " + jMetaDataText.getFrameRateMaximumStringAsLocalTime());
    }

   /**
    * Test getFrameRateMaximumStringAsString() method.
    */
    @Test
    public void subTestGetFrameRateMaximumStringAsString() {
        assertEquals(null, this.jMetaDataText.getFrameRateMaximumStringAsString());
        System.out.println("Maximum Frames per second (with measurement) AS String === " + jMetaDataText.getFrameRateMaximumStringAsString());
    }

   /**
    * Test getFrameRateMaximumStringAsBoolean() method.
    */
    @Test
    public void subTestGetFrameRateMaximumStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getFrameRateMaximumStringAsBoolean());
        System.out.println("Maximum Frames per second (with measurement) AS Boolean === " + jMetaDataText.getFrameRateMaximumStringAsBoolean());
    }

   /**
    * Test getFrameRateMaximumStringAsBigInteger() method.
    */
    @Test
    public void subTestGetFrameRateMaximumStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getFrameRateMaximumStringAsBigInteger());
        System.out.println("Maximum Frames per second (with measurement) AS BigInteger === " + jMetaDataText.getFrameRateMaximumStringAsBigInteger());
    }

   /**
    * Test getFrameRateMaximumStringAsURL() method.
    */
    @Test
    public void subTestGetFrameRateMaximumStringAsURL() {
        assertEquals(null, this.jMetaDataText.getFrameRateMaximumStringAsURL());
        System.out.println("Maximum Frames per second (with measurement) AS URL === " + jMetaDataText.getFrameRateMaximumStringAsURL());
    }

   /**
    * Test getStreamSizeEncodedProportionAsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedProportionAsInteger());
        System.out.println("Encoded Stream size divided by file size AS Integer === " + jMetaDataText.getStreamSizeEncodedProportionAsInteger());
    }

   /**
    * Test getStreamSizeEncodedProportionAsLong() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsLong() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedProportionAsLong());
        System.out.println("Encoded Stream size divided by file size AS Long === " + jMetaDataText.getStreamSizeEncodedProportionAsLong());
    }

   /**
    * Test getStreamSizeEncodedProportionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedProportionAsLocalDateTime());
        System.out.println("Encoded Stream size divided by file size AS LocalDateTime === " + jMetaDataText.getStreamSizeEncodedProportionAsLocalDateTime());
    }

   /**
    * Test getStreamSizeEncodedProportionAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedProportionAsLocalTime());
        System.out.println("Encoded Stream size divided by file size AS LocalTime === " + jMetaDataText.getStreamSizeEncodedProportionAsLocalTime());
    }

   /**
    * Test getStreamSizeEncodedProportionAsString() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsString() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedProportionAsString());
        System.out.println("Encoded Stream size divided by file size AS String === " + jMetaDataText.getStreamSizeEncodedProportionAsString());
    }

   /**
    * Test getStreamSizeEncodedProportionAsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsBoolean() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedProportionAsBoolean());
        System.out.println("Encoded Stream size divided by file size AS Boolean === " + jMetaDataText.getStreamSizeEncodedProportionAsBoolean());
    }

   /**
    * Test getStreamSizeEncodedProportionAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedProportionAsBigInteger());
        System.out.println("Encoded Stream size divided by file size AS BigInteger === " + jMetaDataText.getStreamSizeEncodedProportionAsBigInteger());
    }

   /**
    * Test getStreamSizeEncodedProportionAsURL() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedProportionAsURL() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedProportionAsURL());
        System.out.println("Encoded Stream size divided by file size AS URL === " + jMetaDataText.getStreamSizeEncodedProportionAsURL());
    }

   /**
    * Test getSourceStreamSizeEncodedString1AsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsInteger() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedString1AsInteger());
        System.out.println("Source_StreamSize_Encoded/String1 AS Integer === " + jMetaDataText.getSourceStreamSizeEncodedString1AsInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedString1AsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsLong() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedString1AsLong());
        System.out.println("Source_StreamSize_Encoded/String1 AS Long === " + jMetaDataText.getSourceStreamSizeEncodedString1AsLong());
    }

   /**
    * Test getSourceStreamSizeEncodedString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedString1AsLocalDateTime());
        System.out.println("Source_StreamSize_Encoded/String1 AS LocalDateTime === " + jMetaDataText.getSourceStreamSizeEncodedString1AsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeEncodedString1AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedString1AsLocalTime());
        System.out.println("Source_StreamSize_Encoded/String1 AS LocalTime === " + jMetaDataText.getSourceStreamSizeEncodedString1AsLocalTime());
    }

   /**
    * Test getSourceStreamSizeEncodedString1AsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsString() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedString1AsString());
        System.out.println("Source_StreamSize_Encoded/String1 AS String === " + jMetaDataText.getSourceStreamSizeEncodedString1AsString());
    }

   /**
    * Test getSourceStreamSizeEncodedString1AsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsBoolean() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedString1AsBoolean());
        System.out.println("Source_StreamSize_Encoded/String1 AS Boolean === " + jMetaDataText.getSourceStreamSizeEncodedString1AsBoolean());
    }

   /**
    * Test getSourceStreamSizeEncodedString1AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedString1AsBigInteger());
        System.out.println("Source_StreamSize_Encoded/String1 AS BigInteger === " + jMetaDataText.getSourceStreamSizeEncodedString1AsBigInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedString1AsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedString1AsURL() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedString1AsURL());
        System.out.println("Source_StreamSize_Encoded/String1 AS URL === " + jMetaDataText.getSourceStreamSizeEncodedString1AsURL());
    }

   /**
    * Test getDurationAsInteger() method.
    */
    @Test
    public void subTestGetDurationAsInteger() {
        assertEquals(null, this.jMetaDataText.getDurationAsInteger());
        System.out.println("Play time of the stream, in ms AS Integer === " + jMetaDataText.getDurationAsInteger());
    }

   /**
    * Test getDurationAsLong() method.
    */
    @Test
    public void subTestGetDurationAsLong() {
        assertEquals(null, this.jMetaDataText.getDurationAsLong());
        System.out.println("Play time of the stream, in ms AS Long === " + jMetaDataText.getDurationAsLong());
    }

   /**
    * Test getDurationAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDurationAsLocalDateTime());
        System.out.println("Play time of the stream, in ms AS LocalDateTime === " + jMetaDataText.getDurationAsLocalDateTime());
    }

   /**
    * Test getDurationAsLocalTime() method.
    */
    @Test
    public void subTestGetDurationAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDurationAsLocalTime());
        System.out.println("Play time of the stream, in ms AS LocalTime === " + jMetaDataText.getDurationAsLocalTime());
    }

   /**
    * Test getDurationAsString() method.
    */
    @Test
    public void subTestGetDurationAsString() {
        assertEquals(null, this.jMetaDataText.getDurationAsString());
        System.out.println("Play time of the stream, in ms AS String === " + jMetaDataText.getDurationAsString());
    }

   /**
    * Test getDurationAsBoolean() method.
    */
    @Test
    public void subTestGetDurationAsBoolean() {
        assertEquals(null, this.jMetaDataText.getDurationAsBoolean());
        System.out.println("Play time of the stream, in ms AS Boolean === " + jMetaDataText.getDurationAsBoolean());
    }

   /**
    * Test getDurationAsBigInteger() method.
    */
    @Test
    public void subTestGetDurationAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDurationAsBigInteger());
        System.out.println("Play time of the stream, in ms AS BigInteger === " + jMetaDataText.getDurationAsBigInteger());
    }

   /**
    * Test getDurationAsURL() method.
    */
    @Test
    public void subTestGetDurationAsURL() {
        assertEquals(null, this.jMetaDataText.getDurationAsURL());
        System.out.println("Play time of the stream, in ms AS URL === " + jMetaDataText.getDurationAsURL());
    }

   /**
    * Test getSourceDurationString5AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationString5AsInteger() {
        assertEquals(null, this.jMetaDataText.getSourceDurationString5AsInteger());
        System.out.println("Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Integer === " + jMetaDataText.getSourceDurationString5AsInteger());
    }

   /**
    * Test getSourceDurationString5AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationString5AsLong() {
        assertEquals(null, this.jMetaDataText.getSourceDurationString5AsLong());
        System.out.println("Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Long === " + jMetaDataText.getSourceDurationString5AsLong());
    }

   /**
    * Test getSourceDurationString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getSourceDurationString5AsLocalDateTime());
        System.out.println("Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS LocalDateTime === " + jMetaDataText.getSourceDurationString5AsLocalDateTime());
    }

   /**
    * Test getSourceDurationString5AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationString5AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getSourceDurationString5AsLocalTime());
        System.out.println("Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS LocalTime === " + jMetaDataText.getSourceDurationString5AsLocalTime());
    }

   /**
    * Test getSourceDurationString5AsString() method.
    */
    @Test
    public void subTestGetSourceDurationString5AsString() {
        assertEquals(null, this.jMetaDataText.getSourceDurationString5AsString());
        System.out.println("Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS String === " + jMetaDataText.getSourceDurationString5AsString());
    }

   /**
    * Test getSourceDurationString5AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationString5AsBoolean() {
        assertEquals(null, this.jMetaDataText.getSourceDurationString5AsBoolean());
        System.out.println("Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Boolean === " + jMetaDataText.getSourceDurationString5AsBoolean());
    }

   /**
    * Test getSourceDurationString5AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationString5AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getSourceDurationString5AsBigInteger());
        System.out.println("Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS BigInteger === " + jMetaDataText.getSourceDurationString5AsBigInteger());
    }

   /**
    * Test getSourceDurationString5AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationString5AsURL() {
        assertEquals(null, this.jMetaDataText.getSourceDurationString5AsURL());
        System.out.println("Source Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS URL === " + jMetaDataText.getSourceDurationString5AsURL());
    }

   /**
    * Test getDurationLastFrameStringAsInteger() method.
    */
    @Test
    public void subTestGetDurationLastFrameStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameStringAsInteger());
        System.out.println("Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Integer === " + jMetaDataText.getDurationLastFrameStringAsInteger());
    }

   /**
    * Test getDurationLastFrameStringAsLong() method.
    */
    @Test
    public void subTestGetDurationLastFrameStringAsLong() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameStringAsLong());
        System.out.println("Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Long === " + jMetaDataText.getDurationLastFrameStringAsLong());
    }

   /**
    * Test getDurationLastFrameStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationLastFrameStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameStringAsLocalDateTime());
        System.out.println("Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS LocalDateTime === " + jMetaDataText.getDurationLastFrameStringAsLocalDateTime());
    }

   /**
    * Test getDurationLastFrameStringAsLocalTime() method.
    */
    @Test
    public void subTestGetDurationLastFrameStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameStringAsLocalTime());
        System.out.println("Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS LocalTime === " + jMetaDataText.getDurationLastFrameStringAsLocalTime());
    }

   /**
    * Test getDurationLastFrameStringAsString() method.
    */
    @Test
    public void subTestGetDurationLastFrameStringAsString() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameStringAsString());
        System.out.println("Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS String === " + jMetaDataText.getDurationLastFrameStringAsString());
    }

   /**
    * Test getDurationLastFrameStringAsBoolean() method.
    */
    @Test
    public void subTestGetDurationLastFrameStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameStringAsBoolean());
        System.out.println("Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Boolean === " + jMetaDataText.getDurationLastFrameStringAsBoolean());
    }

   /**
    * Test getDurationLastFrameStringAsBigInteger() method.
    */
    @Test
    public void subTestGetDurationLastFrameStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameStringAsBigInteger());
        System.out.println("Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS BigInteger === " + jMetaDataText.getDurationLastFrameStringAsBigInteger());
    }

   /**
    * Test getDurationLastFrameStringAsURL() method.
    */
    @Test
    public void subTestGetDurationLastFrameStringAsURL() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameStringAsURL());
        System.out.println("Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS URL === " + jMetaDataText.getDurationLastFrameStringAsURL());
    }

   /**
    * Test getSourceDurationString4AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationString4AsInteger() {
        assertEquals(null, this.jMetaDataText.getSourceDurationString4AsInteger());
        System.out.println("Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Integer === " + jMetaDataText.getSourceDurationString4AsInteger());
    }

   /**
    * Test getSourceDurationString4AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationString4AsLong() {
        assertEquals(null, this.jMetaDataText.getSourceDurationString4AsLong());
        System.out.println("Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Long === " + jMetaDataText.getSourceDurationString4AsLong());
    }

   /**
    * Test getSourceDurationString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getSourceDurationString4AsLocalDateTime());
        System.out.println("Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS LocalDateTime === " + jMetaDataText.getSourceDurationString4AsLocalDateTime());
    }

   /**
    * Test getSourceDurationString4AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationString4AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getSourceDurationString4AsLocalTime());
        System.out.println("Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS LocalTime === " + jMetaDataText.getSourceDurationString4AsLocalTime());
    }

   /**
    * Test getSourceDurationString4AsString() method.
    */
    @Test
    public void subTestGetSourceDurationString4AsString() {
        assertEquals(null, this.jMetaDataText.getSourceDurationString4AsString());
        System.out.println("Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS String === " + jMetaDataText.getSourceDurationString4AsString());
    }

   /**
    * Test getSourceDurationString4AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationString4AsBoolean() {
        assertEquals(null, this.jMetaDataText.getSourceDurationString4AsBoolean());
        System.out.println("Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Boolean === " + jMetaDataText.getSourceDurationString4AsBoolean());
    }

   /**
    * Test getSourceDurationString4AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationString4AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getSourceDurationString4AsBigInteger());
        System.out.println("Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS BigInteger === " + jMetaDataText.getSourceDurationString4AsBigInteger());
    }

   /**
    * Test getSourceDurationString4AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationString4AsURL() {
        assertEquals(null, this.jMetaDataText.getSourceDurationString4AsURL());
        System.out.println("Source Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS URL === " + jMetaDataText.getSourceDurationString4AsURL());
    }

   /**
    * Test getSourceDurationString3AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationString3AsInteger() {
        assertEquals(null, this.jMetaDataText.getSourceDurationString3AsInteger());
        System.out.println("Source Play time in format : HH:MM:SS.MMM AS Integer === " + jMetaDataText.getSourceDurationString3AsInteger());
    }

   /**
    * Test getSourceDurationString3AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationString3AsLong() {
        assertEquals(null, this.jMetaDataText.getSourceDurationString3AsLong());
        System.out.println("Source Play time in format : HH:MM:SS.MMM AS Long === " + jMetaDataText.getSourceDurationString3AsLong());
    }

   /**
    * Test getSourceDurationString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getSourceDurationString3AsLocalDateTime());
        System.out.println("Source Play time in format : HH:MM:SS.MMM AS LocalDateTime === " + jMetaDataText.getSourceDurationString3AsLocalDateTime());
    }

   /**
    * Test getSourceDurationString3AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationString3AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getSourceDurationString3AsLocalTime());
        System.out.println("Source Play time in format : HH:MM:SS.MMM AS LocalTime === " + jMetaDataText.getSourceDurationString3AsLocalTime());
    }

   /**
    * Test getSourceDurationString3AsString() method.
    */
    @Test
    public void subTestGetSourceDurationString3AsString() {
        assertEquals(null, this.jMetaDataText.getSourceDurationString3AsString());
        System.out.println("Source Play time in format : HH:MM:SS.MMM AS String === " + jMetaDataText.getSourceDurationString3AsString());
    }

   /**
    * Test getSourceDurationString3AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationString3AsBoolean() {
        assertEquals(null, this.jMetaDataText.getSourceDurationString3AsBoolean());
        System.out.println("Source Play time in format : HH:MM:SS.MMM AS Boolean === " + jMetaDataText.getSourceDurationString3AsBoolean());
    }

   /**
    * Test getSourceDurationString3AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationString3AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getSourceDurationString3AsBigInteger());
        System.out.println("Source Play time in format : HH:MM:SS.MMM AS BigInteger === " + jMetaDataText.getSourceDurationString3AsBigInteger());
    }

   /**
    * Test getSourceDurationString3AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationString3AsURL() {
        assertEquals(null, this.jMetaDataText.getSourceDurationString3AsURL());
        System.out.println("Source Play time in format : HH:MM:SS.MMM AS URL === " + jMetaDataText.getSourceDurationString3AsURL());
    }

   /**
    * Test getSourceDurationString2AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationString2AsInteger() {
        assertEquals(null, this.jMetaDataText.getSourceDurationString2AsInteger());
        System.out.println("Source Play time in format : XXx YYy only, YYy omited if zero AS Integer === " + jMetaDataText.getSourceDurationString2AsInteger());
    }

   /**
    * Test getSourceDurationString2AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationString2AsLong() {
        assertEquals(null, this.jMetaDataText.getSourceDurationString2AsLong());
        System.out.println("Source Play time in format : XXx YYy only, YYy omited if zero AS Long === " + jMetaDataText.getSourceDurationString2AsLong());
    }

   /**
    * Test getSourceDurationString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getSourceDurationString2AsLocalDateTime());
        System.out.println("Source Play time in format : XXx YYy only, YYy omited if zero AS LocalDateTime === " + jMetaDataText.getSourceDurationString2AsLocalDateTime());
    }

   /**
    * Test getSourceDurationString2AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationString2AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getSourceDurationString2AsLocalTime());
        System.out.println("Source Play time in format : XXx YYy only, YYy omited if zero AS LocalTime === " + jMetaDataText.getSourceDurationString2AsLocalTime());
    }

   /**
    * Test getSourceDurationString2AsString() method.
    */
    @Test
    public void subTestGetSourceDurationString2AsString() {
        assertEquals(null, this.jMetaDataText.getSourceDurationString2AsString());
        System.out.println("Source Play time in format : XXx YYy only, YYy omited if zero AS String === " + jMetaDataText.getSourceDurationString2AsString());
    }

   /**
    * Test getSourceDurationString2AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationString2AsBoolean() {
        assertEquals(null, this.jMetaDataText.getSourceDurationString2AsBoolean());
        System.out.println("Source Play time in format : XXx YYy only, YYy omited if zero AS Boolean === " + jMetaDataText.getSourceDurationString2AsBoolean());
    }

   /**
    * Test getSourceDurationString2AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationString2AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getSourceDurationString2AsBigInteger());
        System.out.println("Source Play time in format : XXx YYy only, YYy omited if zero AS BigInteger === " + jMetaDataText.getSourceDurationString2AsBigInteger());
    }

   /**
    * Test getSourceDurationString2AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationString2AsURL() {
        assertEquals(null, this.jMetaDataText.getSourceDurationString2AsURL());
        System.out.println("Source Play time in format : XXx YYy only, YYy omited if zero AS URL === " + jMetaDataText.getSourceDurationString2AsURL());
    }

   /**
    * Test getSourceDurationString1AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationString1AsInteger() {
        assertEquals(null, this.jMetaDataText.getSourceDurationString1AsInteger());
        System.out.println("Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS Integer === " + jMetaDataText.getSourceDurationString1AsInteger());
    }

   /**
    * Test getSourceDurationString1AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationString1AsLong() {
        assertEquals(null, this.jMetaDataText.getSourceDurationString1AsLong());
        System.out.println("Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS Long === " + jMetaDataText.getSourceDurationString1AsLong());
    }

   /**
    * Test getSourceDurationString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getSourceDurationString1AsLocalDateTime());
        System.out.println("Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS LocalDateTime === " + jMetaDataText.getSourceDurationString1AsLocalDateTime());
    }

   /**
    * Test getSourceDurationString1AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationString1AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getSourceDurationString1AsLocalTime());
        System.out.println("Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS LocalTime === " + jMetaDataText.getSourceDurationString1AsLocalTime());
    }

   /**
    * Test getSourceDurationString1AsString() method.
    */
    @Test
    public void subTestGetSourceDurationString1AsString() {
        assertEquals(null, this.jMetaDataText.getSourceDurationString1AsString());
        System.out.println("Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS String === " + jMetaDataText.getSourceDurationString1AsString());
    }

   /**
    * Test getSourceDurationString1AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationString1AsBoolean() {
        assertEquals(null, this.jMetaDataText.getSourceDurationString1AsBoolean());
        System.out.println("Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS Boolean === " + jMetaDataText.getSourceDurationString1AsBoolean());
    }

   /**
    * Test getSourceDurationString1AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationString1AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getSourceDurationString1AsBigInteger());
        System.out.println("Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS BigInteger === " + jMetaDataText.getSourceDurationString1AsBigInteger());
    }

   /**
    * Test getSourceDurationString1AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationString1AsURL() {
        assertEquals(null, this.jMetaDataText.getSourceDurationString1AsURL());
        System.out.println("Source Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS URL === " + jMetaDataText.getSourceDurationString1AsURL());
    }

   /**
    * Test getCodecIDHintAsInteger() method.
    */
    @Test
    public void subTestGetCodecIDHintAsInteger() {
        assertEquals(null, this.jMetaDataText.getCodecIDHintAsInteger());
        System.out.println("A hint for this codec ID AS Integer === " + jMetaDataText.getCodecIDHintAsInteger());
    }

   /**
    * Test getCodecIDHintAsLong() method.
    */
    @Test
    public void subTestGetCodecIDHintAsLong() {
        assertEquals(null, this.jMetaDataText.getCodecIDHintAsLong());
        System.out.println("A hint for this codec ID AS Long === " + jMetaDataText.getCodecIDHintAsLong());
    }

   /**
    * Test getCodecIDHintAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCodecIDHintAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getCodecIDHintAsLocalDateTime());
        System.out.println("A hint for this codec ID AS LocalDateTime === " + jMetaDataText.getCodecIDHintAsLocalDateTime());
    }

   /**
    * Test getCodecIDHintAsLocalTime() method.
    */
    @Test
    public void subTestGetCodecIDHintAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getCodecIDHintAsLocalTime());
        System.out.println("A hint for this codec ID AS LocalTime === " + jMetaDataText.getCodecIDHintAsLocalTime());
    }

   /**
    * Test getCodecIDHintAsString() method.
    */
    @Test
    public void subTestGetCodecIDHintAsString() {
        assertEquals(null, this.jMetaDataText.getCodecIDHintAsString());
        System.out.println("A hint for this codec ID AS String === " + jMetaDataText.getCodecIDHintAsString());
    }

   /**
    * Test getCodecIDHintAsBoolean() method.
    */
    @Test
    public void subTestGetCodecIDHintAsBoolean() {
        assertEquals(null, this.jMetaDataText.getCodecIDHintAsBoolean());
        System.out.println("A hint for this codec ID AS Boolean === " + jMetaDataText.getCodecIDHintAsBoolean());
    }

   /**
    * Test getCodecIDHintAsBigInteger() method.
    */
    @Test
    public void subTestGetCodecIDHintAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getCodecIDHintAsBigInteger());
        System.out.println("A hint for this codec ID AS BigInteger === " + jMetaDataText.getCodecIDHintAsBigInteger());
    }

   /**
    * Test getCodecIDHintAsURL() method.
    */
    @Test
    public void subTestGetCodecIDHintAsURL() {
        assertEquals(null, this.jMetaDataText.getCodecIDHintAsURL());
        System.out.println("A hint for this codec ID AS URL === " + jMetaDataText.getCodecIDHintAsURL());
    }

   /**
    * Test getEncodedApplicationAsInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationAsInteger() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationAsInteger());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit AS Integer === " + jMetaDataText.getEncodedApplicationAsInteger());
    }

   /**
    * Test getEncodedApplicationAsLong() method.
    */
    @Test
    public void subTestGetEncodedApplicationAsLong() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationAsLong());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit AS Long === " + jMetaDataText.getEncodedApplicationAsLong());
    }

   /**
    * Test getEncodedApplicationAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationAsLocalDateTime());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit AS LocalDateTime === " + jMetaDataText.getEncodedApplicationAsLocalDateTime());
    }

   /**
    * Test getEncodedApplicationAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationAsLocalTime());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit AS LocalTime === " + jMetaDataText.getEncodedApplicationAsLocalTime());
    }

   /**
    * Test getEncodedApplicationAsString() method.
    */
    @Test
    public void subTestGetEncodedApplicationAsString() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationAsString());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit AS String === " + jMetaDataText.getEncodedApplicationAsString());
    }

   /**
    * Test getEncodedApplicationAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedApplicationAsBoolean() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationAsBoolean());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit AS Boolean === " + jMetaDataText.getEncodedApplicationAsBoolean());
    }

   /**
    * Test getEncodedApplicationAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationAsBigInteger());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit AS BigInteger === " + jMetaDataText.getEncodedApplicationAsBigInteger());
    }

   /**
    * Test getEncodedApplicationAsURL() method.
    */
    @Test
    public void subTestGetEncodedApplicationAsURL() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationAsURL());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit AS URL === " + jMetaDataText.getEncodedApplicationAsURL());
    }

   /**
    * Test getCompressionModeStringAsInteger() method.
    */
    @Test
    public void subTestGetCompressionModeStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getCompressionModeStringAsInteger());
        System.out.println("Compression mode (Lossy or Lossless) AS Integer === " + jMetaDataText.getCompressionModeStringAsInteger());
    }

   /**
    * Test getCompressionModeStringAsLong() method.
    */
    @Test
    public void subTestGetCompressionModeStringAsLong() {
        assertEquals(null, this.jMetaDataText.getCompressionModeStringAsLong());
        System.out.println("Compression mode (Lossy or Lossless) AS Long === " + jMetaDataText.getCompressionModeStringAsLong());
    }

   /**
    * Test getCompressionModeStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCompressionModeStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getCompressionModeStringAsLocalDateTime());
        System.out.println("Compression mode (Lossy or Lossless) AS LocalDateTime === " + jMetaDataText.getCompressionModeStringAsLocalDateTime());
    }

   /**
    * Test getCompressionModeStringAsLocalTime() method.
    */
    @Test
    public void subTestGetCompressionModeStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getCompressionModeStringAsLocalTime());
        System.out.println("Compression mode (Lossy or Lossless) AS LocalTime === " + jMetaDataText.getCompressionModeStringAsLocalTime());
    }

   /**
    * Test getCompressionModeStringAsString() method.
    */
    @Test
    public void subTestGetCompressionModeStringAsString() {
        assertEquals(null, this.jMetaDataText.getCompressionModeStringAsString());
        System.out.println("Compression mode (Lossy or Lossless) AS String === " + jMetaDataText.getCompressionModeStringAsString());
    }

   /**
    * Test getCompressionModeStringAsBoolean() method.
    */
    @Test
    public void subTestGetCompressionModeStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getCompressionModeStringAsBoolean());
        System.out.println("Compression mode (Lossy or Lossless) AS Boolean === " + jMetaDataText.getCompressionModeStringAsBoolean());
    }

   /**
    * Test getCompressionModeStringAsBigInteger() method.
    */
    @Test
    public void subTestGetCompressionModeStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getCompressionModeStringAsBigInteger());
        System.out.println("Compression mode (Lossy or Lossless) AS BigInteger === " + jMetaDataText.getCompressionModeStringAsBigInteger());
    }

   /**
    * Test getCompressionModeStringAsURL() method.
    */
    @Test
    public void subTestGetCompressionModeStringAsURL() {
        assertEquals(null, this.jMetaDataText.getCompressionModeStringAsURL());
        System.out.println("Compression mode (Lossy or Lossless) AS URL === " + jMetaDataText.getCompressionModeStringAsURL());
    }

   /**
    * Test getStreamSizeString2AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeString2AsInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeString2AsInteger());
        System.out.println("StreamSize/String2 AS Integer === " + jMetaDataText.getStreamSizeString2AsInteger());
    }

   /**
    * Test getStreamSizeString2AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeString2AsLong() {
        assertEquals(null, this.jMetaDataText.getStreamSizeString2AsLong());
        System.out.println("StreamSize/String2 AS Long === " + jMetaDataText.getStreamSizeString2AsLong());
    }

   /**
    * Test getStreamSizeString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeString2AsLocalDateTime());
        System.out.println("StreamSize/String2 AS LocalDateTime === " + jMetaDataText.getStreamSizeString2AsLocalDateTime());
    }

   /**
    * Test getStreamSizeString2AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeString2AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeString2AsLocalTime());
        System.out.println("StreamSize/String2 AS LocalTime === " + jMetaDataText.getStreamSizeString2AsLocalTime());
    }

   /**
    * Test getStreamSizeString2AsString() method.
    */
    @Test
    public void subTestGetStreamSizeString2AsString() {
        assertEquals(null, this.jMetaDataText.getStreamSizeString2AsString());
        System.out.println("StreamSize/String2 AS String === " + jMetaDataText.getStreamSizeString2AsString());
    }

   /**
    * Test getStreamSizeString2AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeString2AsBoolean() {
        assertEquals(null, this.jMetaDataText.getStreamSizeString2AsBoolean());
        System.out.println("StreamSize/String2 AS Boolean === " + jMetaDataText.getStreamSizeString2AsBoolean());
    }

   /**
    * Test getStreamSizeString2AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeString2AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeString2AsBigInteger());
        System.out.println("StreamSize/String2 AS BigInteger === " + jMetaDataText.getStreamSizeString2AsBigInteger());
    }

   /**
    * Test getStreamSizeString2AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeString2AsURL() {
        assertEquals(null, this.jMetaDataText.getStreamSizeString2AsURL());
        System.out.println("StreamSize/String2 AS URL === " + jMetaDataText.getStreamSizeString2AsURL());
    }

   /**
    * Test getStreamSizeString1AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeString1AsInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeString1AsInteger());
        System.out.println("StreamSize/String1 AS Integer === " + jMetaDataText.getStreamSizeString1AsInteger());
    }

   /**
    * Test getStreamSizeString1AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeString1AsLong() {
        assertEquals(null, this.jMetaDataText.getStreamSizeString1AsLong());
        System.out.println("StreamSize/String1 AS Long === " + jMetaDataText.getStreamSizeString1AsLong());
    }

   /**
    * Test getStreamSizeString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeString1AsLocalDateTime());
        System.out.println("StreamSize/String1 AS LocalDateTime === " + jMetaDataText.getStreamSizeString1AsLocalDateTime());
    }

   /**
    * Test getStreamSizeString1AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeString1AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeString1AsLocalTime());
        System.out.println("StreamSize/String1 AS LocalTime === " + jMetaDataText.getStreamSizeString1AsLocalTime());
    }

   /**
    * Test getStreamSizeString1AsString() method.
    */
    @Test
    public void subTestGetStreamSizeString1AsString() {
        assertEquals(null, this.jMetaDataText.getStreamSizeString1AsString());
        System.out.println("StreamSize/String1 AS String === " + jMetaDataText.getStreamSizeString1AsString());
    }

   /**
    * Test getStreamSizeString1AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeString1AsBoolean() {
        assertEquals(null, this.jMetaDataText.getStreamSizeString1AsBoolean());
        System.out.println("StreamSize/String1 AS Boolean === " + jMetaDataText.getStreamSizeString1AsBoolean());
    }

   /**
    * Test getStreamSizeString1AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeString1AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeString1AsBigInteger());
        System.out.println("StreamSize/String1 AS BigInteger === " + jMetaDataText.getStreamSizeString1AsBigInteger());
    }

   /**
    * Test getStreamSizeString1AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeString1AsURL() {
        assertEquals(null, this.jMetaDataText.getStreamSizeString1AsURL());
        System.out.println("StreamSize/String1 AS URL === " + jMetaDataText.getStreamSizeString1AsURL());
    }

   /**
    * Test getStreamSizeString4AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeString4AsInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeString4AsInteger());
        System.out.println("StreamSize/String4 AS Integer === " + jMetaDataText.getStreamSizeString4AsInteger());
    }

   /**
    * Test getStreamSizeString4AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeString4AsLong() {
        assertEquals(null, this.jMetaDataText.getStreamSizeString4AsLong());
        System.out.println("StreamSize/String4 AS Long === " + jMetaDataText.getStreamSizeString4AsLong());
    }

   /**
    * Test getStreamSizeString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeString4AsLocalDateTime());
        System.out.println("StreamSize/String4 AS LocalDateTime === " + jMetaDataText.getStreamSizeString4AsLocalDateTime());
    }

   /**
    * Test getStreamSizeString4AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeString4AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeString4AsLocalTime());
        System.out.println("StreamSize/String4 AS LocalTime === " + jMetaDataText.getStreamSizeString4AsLocalTime());
    }

   /**
    * Test getStreamSizeString4AsString() method.
    */
    @Test
    public void subTestGetStreamSizeString4AsString() {
        assertEquals(null, this.jMetaDataText.getStreamSizeString4AsString());
        System.out.println("StreamSize/String4 AS String === " + jMetaDataText.getStreamSizeString4AsString());
    }

   /**
    * Test getStreamSizeString4AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeString4AsBoolean() {
        assertEquals(null, this.jMetaDataText.getStreamSizeString4AsBoolean());
        System.out.println("StreamSize/String4 AS Boolean === " + jMetaDataText.getStreamSizeString4AsBoolean());
    }

   /**
    * Test getStreamSizeString4AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeString4AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeString4AsBigInteger());
        System.out.println("StreamSize/String4 AS BigInteger === " + jMetaDataText.getStreamSizeString4AsBigInteger());
    }

   /**
    * Test getStreamSizeString4AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeString4AsURL() {
        assertEquals(null, this.jMetaDataText.getStreamSizeString4AsURL());
        System.out.println("StreamSize/String4 AS URL === " + jMetaDataText.getStreamSizeString4AsURL());
    }

   /**
    * Test getStreamSizeString3AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeString3AsInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeString3AsInteger());
        System.out.println("StreamSize/String3 AS Integer === " + jMetaDataText.getStreamSizeString3AsInteger());
    }

   /**
    * Test getStreamSizeString3AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeString3AsLong() {
        assertEquals(null, this.jMetaDataText.getStreamSizeString3AsLong());
        System.out.println("StreamSize/String3 AS Long === " + jMetaDataText.getStreamSizeString3AsLong());
    }

   /**
    * Test getStreamSizeString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeString3AsLocalDateTime());
        System.out.println("StreamSize/String3 AS LocalDateTime === " + jMetaDataText.getStreamSizeString3AsLocalDateTime());
    }

   /**
    * Test getStreamSizeString3AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeString3AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeString3AsLocalTime());
        System.out.println("StreamSize/String3 AS LocalTime === " + jMetaDataText.getStreamSizeString3AsLocalTime());
    }

   /**
    * Test getStreamSizeString3AsString() method.
    */
    @Test
    public void subTestGetStreamSizeString3AsString() {
        assertEquals(null, this.jMetaDataText.getStreamSizeString3AsString());
        System.out.println("StreamSize/String3 AS String === " + jMetaDataText.getStreamSizeString3AsString());
    }

   /**
    * Test getStreamSizeString3AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeString3AsBoolean() {
        assertEquals(null, this.jMetaDataText.getStreamSizeString3AsBoolean());
        System.out.println("StreamSize/String3 AS Boolean === " + jMetaDataText.getStreamSizeString3AsBoolean());
    }

   /**
    * Test getStreamSizeString3AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeString3AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeString3AsBigInteger());
        System.out.println("StreamSize/String3 AS BigInteger === " + jMetaDataText.getStreamSizeString3AsBigInteger());
    }

   /**
    * Test getStreamSizeString3AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeString3AsURL() {
        assertEquals(null, this.jMetaDataText.getStreamSizeString3AsURL());
        System.out.println("StreamSize/String3 AS URL === " + jMetaDataText.getStreamSizeString3AsURL());
    }

   /**
    * Test getStreamSizeString5AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeString5AsInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeString5AsInteger());
        System.out.println("Streamsize in with percentage value AS Integer === " + jMetaDataText.getStreamSizeString5AsInteger());
    }

   /**
    * Test getStreamSizeString5AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeString5AsLong() {
        assertEquals(null, this.jMetaDataText.getStreamSizeString5AsLong());
        System.out.println("Streamsize in with percentage value AS Long === " + jMetaDataText.getStreamSizeString5AsLong());
    }

   /**
    * Test getStreamSizeString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeString5AsLocalDateTime());
        System.out.println("Streamsize in with percentage value AS LocalDateTime === " + jMetaDataText.getStreamSizeString5AsLocalDateTime());
    }

   /**
    * Test getStreamSizeString5AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeString5AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeString5AsLocalTime());
        System.out.println("Streamsize in with percentage value AS LocalTime === " + jMetaDataText.getStreamSizeString5AsLocalTime());
    }

   /**
    * Test getStreamSizeString5AsString() method.
    */
    @Test
    public void subTestGetStreamSizeString5AsString() {
        assertEquals(null, this.jMetaDataText.getStreamSizeString5AsString());
        System.out.println("Streamsize in with percentage value AS String === " + jMetaDataText.getStreamSizeString5AsString());
    }

   /**
    * Test getStreamSizeString5AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeString5AsBoolean() {
        assertEquals(null, this.jMetaDataText.getStreamSizeString5AsBoolean());
        System.out.println("Streamsize in with percentage value AS Boolean === " + jMetaDataText.getStreamSizeString5AsBoolean());
    }

   /**
    * Test getStreamSizeString5AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeString5AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeString5AsBigInteger());
        System.out.println("Streamsize in with percentage value AS BigInteger === " + jMetaDataText.getStreamSizeString5AsBigInteger());
    }

   /**
    * Test getStreamSizeString5AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeString5AsURL() {
        assertEquals(null, this.jMetaDataText.getStreamSizeString5AsURL());
        System.out.println("Streamsize in with percentage value AS URL === " + jMetaDataText.getStreamSizeString5AsURL());
    }

   /**
    * Test getFrameRateMinimumAsInteger() method.
    */
    @Test
    public void subTestGetFrameRateMinimumAsInteger() {
        assertEquals(null, this.jMetaDataText.getFrameRateMinimumAsInteger());
        System.out.println("Minimum Frames per second AS Integer === " + jMetaDataText.getFrameRateMinimumAsInteger());
    }

   /**
    * Test getFrameRateMinimumAsLong() method.
    */
    @Test
    public void subTestGetFrameRateMinimumAsLong() {
        assertEquals(null, this.jMetaDataText.getFrameRateMinimumAsLong());
        System.out.println("Minimum Frames per second AS Long === " + jMetaDataText.getFrameRateMinimumAsLong());
    }

   /**
    * Test getFrameRateMinimumAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFrameRateMinimumAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getFrameRateMinimumAsLocalDateTime());
        System.out.println("Minimum Frames per second AS LocalDateTime === " + jMetaDataText.getFrameRateMinimumAsLocalDateTime());
    }

   /**
    * Test getFrameRateMinimumAsLocalTime() method.
    */
    @Test
    public void subTestGetFrameRateMinimumAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getFrameRateMinimumAsLocalTime());
        System.out.println("Minimum Frames per second AS LocalTime === " + jMetaDataText.getFrameRateMinimumAsLocalTime());
    }

   /**
    * Test getFrameRateMinimumAsString() method.
    */
    @Test
    public void subTestGetFrameRateMinimumAsString() {
        assertEquals(null, this.jMetaDataText.getFrameRateMinimumAsString());
        System.out.println("Minimum Frames per second AS String === " + jMetaDataText.getFrameRateMinimumAsString());
    }

   /**
    * Test getFrameRateMinimumAsBoolean() method.
    */
    @Test
    public void subTestGetFrameRateMinimumAsBoolean() {
        assertEquals(null, this.jMetaDataText.getFrameRateMinimumAsBoolean());
        System.out.println("Minimum Frames per second AS Boolean === " + jMetaDataText.getFrameRateMinimumAsBoolean());
    }

   /**
    * Test getFrameRateMinimumAsBigInteger() method.
    */
    @Test
    public void subTestGetFrameRateMinimumAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getFrameRateMinimumAsBigInteger());
        System.out.println("Minimum Frames per second AS BigInteger === " + jMetaDataText.getFrameRateMinimumAsBigInteger());
    }

   /**
    * Test getFrameRateMinimumAsURL() method.
    */
    @Test
    public void subTestGetFrameRateMinimumAsURL() {
        assertEquals(null, this.jMetaDataText.getFrameRateMinimumAsURL());
        System.out.println("Minimum Frames per second AS URL === " + jMetaDataText.getFrameRateMinimumAsURL());
    }

   /**
    * Test getStreamKindAsInteger() method.
    */
    @Test
    public void subTestGetStreamKindAsInteger() {
        assertEquals(null, this.jMetaDataText.getStreamKindAsInteger());
        System.out.println("Stream type name AS Integer === " + jMetaDataText.getStreamKindAsInteger());
    }

   /**
    * Test getStreamKindAsLong() method.
    */
    @Test
    public void subTestGetStreamKindAsLong() {
        assertEquals(null, this.jMetaDataText.getStreamKindAsLong());
        System.out.println("Stream type name AS Long === " + jMetaDataText.getStreamKindAsLong());
    }

   /**
    * Test getStreamKindAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamKindAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getStreamKindAsLocalDateTime());
        System.out.println("Stream type name AS LocalDateTime === " + jMetaDataText.getStreamKindAsLocalDateTime());
    }

   /**
    * Test getStreamKindAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamKindAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getStreamKindAsLocalTime());
        System.out.println("Stream type name AS LocalTime === " + jMetaDataText.getStreamKindAsLocalTime());
    }

   /**
    * Test getStreamKindAsString() method.
    */
    @Test
    public void subTestGetStreamKindAsString() {
        assertEquals(null, this.jMetaDataText.getStreamKindAsString());
        System.out.println("Stream type name AS String === " + jMetaDataText.getStreamKindAsString());
    }

   /**
    * Test getStreamKindAsBoolean() method.
    */
    @Test
    public void subTestGetStreamKindAsBoolean() {
        assertEquals(null, this.jMetaDataText.getStreamKindAsBoolean());
        System.out.println("Stream type name AS Boolean === " + jMetaDataText.getStreamKindAsBoolean());
    }

   /**
    * Test getStreamKindAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamKindAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getStreamKindAsBigInteger());
        System.out.println("Stream type name AS BigInteger === " + jMetaDataText.getStreamKindAsBigInteger());
    }

   /**
    * Test getStreamKindAsURL() method.
    */
    @Test
    public void subTestGetStreamKindAsURL() {
        assertEquals(null, this.jMetaDataText.getStreamKindAsURL());
        System.out.println("Stream type name AS URL === " + jMetaDataText.getStreamKindAsURL());
    }

   /**
    * Test getBitRateStringAsInteger() method.
    */
    @Test
    public void subTestGetBitRateStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getBitRateStringAsInteger());
        System.out.println("Bit rate (with measurement) AS Integer === " + jMetaDataText.getBitRateStringAsInteger());
    }

   /**
    * Test getBitRateStringAsLong() method.
    */
    @Test
    public void subTestGetBitRateStringAsLong() {
        assertEquals(null, this.jMetaDataText.getBitRateStringAsLong());
        System.out.println("Bit rate (with measurement) AS Long === " + jMetaDataText.getBitRateStringAsLong());
    }

   /**
    * Test getBitRateStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitRateStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getBitRateStringAsLocalDateTime());
        System.out.println("Bit rate (with measurement) AS LocalDateTime === " + jMetaDataText.getBitRateStringAsLocalDateTime());
    }

   /**
    * Test getBitRateStringAsLocalTime() method.
    */
    @Test
    public void subTestGetBitRateStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getBitRateStringAsLocalTime());
        System.out.println("Bit rate (with measurement) AS LocalTime === " + jMetaDataText.getBitRateStringAsLocalTime());
    }

   /**
    * Test getBitRateStringAsString() method.
    */
    @Test
    public void subTestGetBitRateStringAsString() {
        assertEquals(null, this.jMetaDataText.getBitRateStringAsString());
        System.out.println("Bit rate (with measurement) AS String === " + jMetaDataText.getBitRateStringAsString());
    }

   /**
    * Test getBitRateStringAsBoolean() method.
    */
    @Test
    public void subTestGetBitRateStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getBitRateStringAsBoolean());
        System.out.println("Bit rate (with measurement) AS Boolean === " + jMetaDataText.getBitRateStringAsBoolean());
    }

   /**
    * Test getBitRateStringAsBigInteger() method.
    */
    @Test
    public void subTestGetBitRateStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getBitRateStringAsBigInteger());
        System.out.println("Bit rate (with measurement) AS BigInteger === " + jMetaDataText.getBitRateStringAsBigInteger());
    }

   /**
    * Test getBitRateStringAsURL() method.
    */
    @Test
    public void subTestGetBitRateStringAsURL() {
        assertEquals(null, this.jMetaDataText.getBitRateStringAsURL());
        System.out.println("Bit rate (with measurement) AS URL === " + jMetaDataText.getBitRateStringAsURL());
    }

   /**
    * Test getFrameRateModeStringAsInteger() method.
    */
    @Test
    public void subTestGetFrameRateModeStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getFrameRateModeStringAsInteger());
        System.out.println("Frame rate mode (Constant, Variable) AS Integer === " + jMetaDataText.getFrameRateModeStringAsInteger());
    }

   /**
    * Test getFrameRateModeStringAsLong() method.
    */
    @Test
    public void subTestGetFrameRateModeStringAsLong() {
        assertEquals(null, this.jMetaDataText.getFrameRateModeStringAsLong());
        System.out.println("Frame rate mode (Constant, Variable) AS Long === " + jMetaDataText.getFrameRateModeStringAsLong());
    }

   /**
    * Test getFrameRateModeStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFrameRateModeStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getFrameRateModeStringAsLocalDateTime());
        System.out.println("Frame rate mode (Constant, Variable) AS LocalDateTime === " + jMetaDataText.getFrameRateModeStringAsLocalDateTime());
    }

   /**
    * Test getFrameRateModeStringAsLocalTime() method.
    */
    @Test
    public void subTestGetFrameRateModeStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getFrameRateModeStringAsLocalTime());
        System.out.println("Frame rate mode (Constant, Variable) AS LocalTime === " + jMetaDataText.getFrameRateModeStringAsLocalTime());
    }

   /**
    * Test getFrameRateModeStringAsString() method.
    */
    @Test
    public void subTestGetFrameRateModeStringAsString() {
        assertEquals(null, this.jMetaDataText.getFrameRateModeStringAsString());
        System.out.println("Frame rate mode (Constant, Variable) AS String === " + jMetaDataText.getFrameRateModeStringAsString());
    }

   /**
    * Test getFrameRateModeStringAsBoolean() method.
    */
    @Test
    public void subTestGetFrameRateModeStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getFrameRateModeStringAsBoolean());
        System.out.println("Frame rate mode (Constant, Variable) AS Boolean === " + jMetaDataText.getFrameRateModeStringAsBoolean());
    }

   /**
    * Test getFrameRateModeStringAsBigInteger() method.
    */
    @Test
    public void subTestGetFrameRateModeStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getFrameRateModeStringAsBigInteger());
        System.out.println("Frame rate mode (Constant, Variable) AS BigInteger === " + jMetaDataText.getFrameRateModeStringAsBigInteger());
    }

   /**
    * Test getFrameRateModeStringAsURL() method.
    */
    @Test
    public void subTestGetFrameRateModeStringAsURL() {
        assertEquals(null, this.jMetaDataText.getFrameRateModeStringAsURL());
        System.out.println("Frame rate mode (Constant, Variable) AS URL === " + jMetaDataText.getFrameRateModeStringAsURL());
    }

   /**
    * Test getLanguageString1AsInteger() method.
    */
    @Test
    public void subTestGetLanguageString1AsInteger() {
        assertEquals(null, this.jMetaDataText.getLanguageString1AsInteger());
        System.out.println("Language (full) AS Integer === " + jMetaDataText.getLanguageString1AsInteger());
    }

   /**
    * Test getLanguageString1AsLong() method.
    */
    @Test
    public void subTestGetLanguageString1AsLong() {
        assertEquals(null, this.jMetaDataText.getLanguageString1AsLong());
        System.out.println("Language (full) AS Long === " + jMetaDataText.getLanguageString1AsLong());
    }

   /**
    * Test getLanguageString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetLanguageString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getLanguageString1AsLocalDateTime());
        System.out.println("Language (full) AS LocalDateTime === " + jMetaDataText.getLanguageString1AsLocalDateTime());
    }

   /**
    * Test getLanguageString1AsLocalTime() method.
    */
    @Test
    public void subTestGetLanguageString1AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getLanguageString1AsLocalTime());
        System.out.println("Language (full) AS LocalTime === " + jMetaDataText.getLanguageString1AsLocalTime());
    }

   /**
    * Test getLanguageString1AsString() method.
    */
    @Test
    public void subTestGetLanguageString1AsString() {
        assertEquals(null, this.jMetaDataText.getLanguageString1AsString());
        System.out.println("Language (full) AS String === " + jMetaDataText.getLanguageString1AsString());
    }

   /**
    * Test getLanguageString1AsBoolean() method.
    */
    @Test
    public void subTestGetLanguageString1AsBoolean() {
        assertEquals(null, this.jMetaDataText.getLanguageString1AsBoolean());
        System.out.println("Language (full) AS Boolean === " + jMetaDataText.getLanguageString1AsBoolean());
    }

   /**
    * Test getLanguageString1AsBigInteger() method.
    */
    @Test
    public void subTestGetLanguageString1AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getLanguageString1AsBigInteger());
        System.out.println("Language (full) AS BigInteger === " + jMetaDataText.getLanguageString1AsBigInteger());
    }

   /**
    * Test getLanguageString1AsURL() method.
    */
    @Test
    public void subTestGetLanguageString1AsURL() {
        assertEquals(null, this.jMetaDataText.getLanguageString1AsURL());
        System.out.println("Language (full) AS URL === " + jMetaDataText.getLanguageString1AsURL());
    }

   /**
    * Test getLanguageString2AsInteger() method.
    */
    @Test
    public void subTestGetLanguageString2AsInteger() {
        assertEquals(null, this.jMetaDataText.getLanguageString2AsInteger());
        System.out.println("Language (2-letter ISO 639-1 if exists, else empty) AS Integer === " + jMetaDataText.getLanguageString2AsInteger());
    }

   /**
    * Test getLanguageString2AsLong() method.
    */
    @Test
    public void subTestGetLanguageString2AsLong() {
        assertEquals(null, this.jMetaDataText.getLanguageString2AsLong());
        System.out.println("Language (2-letter ISO 639-1 if exists, else empty) AS Long === " + jMetaDataText.getLanguageString2AsLong());
    }

   /**
    * Test getLanguageString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetLanguageString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getLanguageString2AsLocalDateTime());
        System.out.println("Language (2-letter ISO 639-1 if exists, else empty) AS LocalDateTime === " + jMetaDataText.getLanguageString2AsLocalDateTime());
    }

   /**
    * Test getLanguageString2AsLocalTime() method.
    */
    @Test
    public void subTestGetLanguageString2AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getLanguageString2AsLocalTime());
        System.out.println("Language (2-letter ISO 639-1 if exists, else empty) AS LocalTime === " + jMetaDataText.getLanguageString2AsLocalTime());
    }

   /**
    * Test getLanguageString2AsString() method.
    */
    @Test
    public void subTestGetLanguageString2AsString() {
        assertEquals(null, this.jMetaDataText.getLanguageString2AsString());
        System.out.println("Language (2-letter ISO 639-1 if exists, else empty) AS String === " + jMetaDataText.getLanguageString2AsString());
    }

   /**
    * Test getLanguageString2AsBoolean() method.
    */
    @Test
    public void subTestGetLanguageString2AsBoolean() {
        assertEquals(null, this.jMetaDataText.getLanguageString2AsBoolean());
        System.out.println("Language (2-letter ISO 639-1 if exists, else empty) AS Boolean === " + jMetaDataText.getLanguageString2AsBoolean());
    }

   /**
    * Test getLanguageString2AsBigInteger() method.
    */
    @Test
    public void subTestGetLanguageString2AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getLanguageString2AsBigInteger());
        System.out.println("Language (2-letter ISO 639-1 if exists, else empty) AS BigInteger === " + jMetaDataText.getLanguageString2AsBigInteger());
    }

   /**
    * Test getLanguageString2AsURL() method.
    */
    @Test
    public void subTestGetLanguageString2AsURL() {
        assertEquals(null, this.jMetaDataText.getLanguageString2AsURL());
        System.out.println("Language (2-letter ISO 639-1 if exists, else empty) AS URL === " + jMetaDataText.getLanguageString2AsURL());
    }

   /**
    * Test getLanguageString3AsInteger() method.
    */
    @Test
    public void subTestGetLanguageString3AsInteger() {
        assertEquals(null, this.jMetaDataText.getLanguageString3AsInteger());
        System.out.println("Language (3-letter ISO 639-2 if exists, else empty) AS Integer === " + jMetaDataText.getLanguageString3AsInteger());
    }

   /**
    * Test getLanguageString3AsLong() method.
    */
    @Test
    public void subTestGetLanguageString3AsLong() {
        assertEquals(null, this.jMetaDataText.getLanguageString3AsLong());
        System.out.println("Language (3-letter ISO 639-2 if exists, else empty) AS Long === " + jMetaDataText.getLanguageString3AsLong());
    }

   /**
    * Test getLanguageString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetLanguageString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getLanguageString3AsLocalDateTime());
        System.out.println("Language (3-letter ISO 639-2 if exists, else empty) AS LocalDateTime === " + jMetaDataText.getLanguageString3AsLocalDateTime());
    }

   /**
    * Test getLanguageString3AsLocalTime() method.
    */
    @Test
    public void subTestGetLanguageString3AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getLanguageString3AsLocalTime());
        System.out.println("Language (3-letter ISO 639-2 if exists, else empty) AS LocalTime === " + jMetaDataText.getLanguageString3AsLocalTime());
    }

   /**
    * Test getLanguageString3AsString() method.
    */
    @Test
    public void subTestGetLanguageString3AsString() {
        assertEquals(null, this.jMetaDataText.getLanguageString3AsString());
        System.out.println("Language (3-letter ISO 639-2 if exists, else empty) AS String === " + jMetaDataText.getLanguageString3AsString());
    }

   /**
    * Test getLanguageString3AsBoolean() method.
    */
    @Test
    public void subTestGetLanguageString3AsBoolean() {
        assertEquals(null, this.jMetaDataText.getLanguageString3AsBoolean());
        System.out.println("Language (3-letter ISO 639-2 if exists, else empty) AS Boolean === " + jMetaDataText.getLanguageString3AsBoolean());
    }

   /**
    * Test getLanguageString3AsBigInteger() method.
    */
    @Test
    public void subTestGetLanguageString3AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getLanguageString3AsBigInteger());
        System.out.println("Language (3-letter ISO 639-2 if exists, else empty) AS BigInteger === " + jMetaDataText.getLanguageString3AsBigInteger());
    }

   /**
    * Test getLanguageString3AsURL() method.
    */
    @Test
    public void subTestGetLanguageString3AsURL() {
        assertEquals(null, this.jMetaDataText.getLanguageString3AsURL());
        System.out.println("Language (3-letter ISO 639-2 if exists, else empty) AS URL === " + jMetaDataText.getLanguageString3AsURL());
    }

   /**
    * Test getLanguageString4AsInteger() method.
    */
    @Test
    public void subTestGetLanguageString4AsInteger() {
        assertEquals(null, this.jMetaDataText.getLanguageString4AsInteger());
        System.out.println("Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty) AS Integer === " + jMetaDataText.getLanguageString4AsInteger());
    }

   /**
    * Test getLanguageString4AsLong() method.
    */
    @Test
    public void subTestGetLanguageString4AsLong() {
        assertEquals(null, this.jMetaDataText.getLanguageString4AsLong());
        System.out.println("Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty) AS Long === " + jMetaDataText.getLanguageString4AsLong());
    }

   /**
    * Test getLanguageString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetLanguageString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getLanguageString4AsLocalDateTime());
        System.out.println("Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty) AS LocalDateTime === " + jMetaDataText.getLanguageString4AsLocalDateTime());
    }

   /**
    * Test getLanguageString4AsLocalTime() method.
    */
    @Test
    public void subTestGetLanguageString4AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getLanguageString4AsLocalTime());
        System.out.println("Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty) AS LocalTime === " + jMetaDataText.getLanguageString4AsLocalTime());
    }

   /**
    * Test getLanguageString4AsString() method.
    */
    @Test
    public void subTestGetLanguageString4AsString() {
        assertEquals(null, this.jMetaDataText.getLanguageString4AsString());
        System.out.println("Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty) AS String === " + jMetaDataText.getLanguageString4AsString());
    }

   /**
    * Test getLanguageString4AsBoolean() method.
    */
    @Test
    public void subTestGetLanguageString4AsBoolean() {
        assertEquals(null, this.jMetaDataText.getLanguageString4AsBoolean());
        System.out.println("Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty) AS Boolean === " + jMetaDataText.getLanguageString4AsBoolean());
    }

   /**
    * Test getLanguageString4AsBigInteger() method.
    */
    @Test
    public void subTestGetLanguageString4AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getLanguageString4AsBigInteger());
        System.out.println("Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty) AS BigInteger === " + jMetaDataText.getLanguageString4AsBigInteger());
    }

   /**
    * Test getLanguageString4AsURL() method.
    */
    @Test
    public void subTestGetLanguageString4AsURL() {
        assertEquals(null, this.jMetaDataText.getLanguageString4AsURL());
        System.out.println("Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty) AS URL === " + jMetaDataText.getLanguageString4AsURL());
    }

   /**
    * Test getCodecIDAsInteger() method.
    */
    @Test
    public void subTestGetCodecIDAsInteger() {
        assertEquals(null, this.jMetaDataText.getCodecIDAsInteger());
        System.out.println("Codec ID (found in some containers) AS Integer === " + jMetaDataText.getCodecIDAsInteger());
    }

   /**
    * Test getCodecIDAsLong() method.
    */
    @Test
    public void subTestGetCodecIDAsLong() {
        assertEquals(null, this.jMetaDataText.getCodecIDAsLong());
        System.out.println("Codec ID (found in some containers) AS Long === " + jMetaDataText.getCodecIDAsLong());
    }

   /**
    * Test getCodecIDAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCodecIDAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getCodecIDAsLocalDateTime());
        System.out.println("Codec ID (found in some containers) AS LocalDateTime === " + jMetaDataText.getCodecIDAsLocalDateTime());
    }

   /**
    * Test getCodecIDAsLocalTime() method.
    */
    @Test
    public void subTestGetCodecIDAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getCodecIDAsLocalTime());
        System.out.println("Codec ID (found in some containers) AS LocalTime === " + jMetaDataText.getCodecIDAsLocalTime());
    }

   /**
    * Test getCodecIDAsString() method.
    */
    @Test
    public void subTestGetCodecIDAsString() {
        assertEquals(null, this.jMetaDataText.getCodecIDAsString());
        System.out.println("Codec ID (found in some containers) AS String === " + jMetaDataText.getCodecIDAsString());
    }

   /**
    * Test getCodecIDAsBoolean() method.
    */
    @Test
    public void subTestGetCodecIDAsBoolean() {
        assertEquals(null, this.jMetaDataText.getCodecIDAsBoolean());
        System.out.println("Codec ID (found in some containers) AS Boolean === " + jMetaDataText.getCodecIDAsBoolean());
    }

   /**
    * Test getCodecIDAsBigInteger() method.
    */
    @Test
    public void subTestGetCodecIDAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getCodecIDAsBigInteger());
        System.out.println("Codec ID (found in some containers) AS BigInteger === " + jMetaDataText.getCodecIDAsBigInteger());
    }

   /**
    * Test getCodecIDAsURL() method.
    */
    @Test
    public void subTestGetCodecIDAsURL() {
        assertEquals(null, this.jMetaDataText.getCodecIDAsURL());
        System.out.println("Codec ID (found in some containers) AS URL === " + jMetaDataText.getCodecIDAsURL());
    }

   /**
    * Test getAlternateGroupAsInteger() method.
    */
    @Test
    public void subTestGetAlternateGroupAsInteger() {
        assertEquals(null, this.jMetaDataText.getAlternateGroupAsInteger());
        System.out.println("Number of a group in order to provide versions of the same track AS Integer === " + jMetaDataText.getAlternateGroupAsInteger());
    }

   /**
    * Test getAlternateGroupAsLong() method.
    */
    @Test
    public void subTestGetAlternateGroupAsLong() {
        assertEquals(null, this.jMetaDataText.getAlternateGroupAsLong());
        System.out.println("Number of a group in order to provide versions of the same track AS Long === " + jMetaDataText.getAlternateGroupAsLong());
    }

   /**
    * Test getAlternateGroupAsLocalDateTime() method.
    */
    @Test
    public void subTestGetAlternateGroupAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getAlternateGroupAsLocalDateTime());
        System.out.println("Number of a group in order to provide versions of the same track AS LocalDateTime === " + jMetaDataText.getAlternateGroupAsLocalDateTime());
    }

   /**
    * Test getAlternateGroupAsLocalTime() method.
    */
    @Test
    public void subTestGetAlternateGroupAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getAlternateGroupAsLocalTime());
        System.out.println("Number of a group in order to provide versions of the same track AS LocalTime === " + jMetaDataText.getAlternateGroupAsLocalTime());
    }

   /**
    * Test getAlternateGroupAsString() method.
    */
    @Test
    public void subTestGetAlternateGroupAsString() {
        assertEquals(null, this.jMetaDataText.getAlternateGroupAsString());
        System.out.println("Number of a group in order to provide versions of the same track AS String === " + jMetaDataText.getAlternateGroupAsString());
    }

   /**
    * Test getAlternateGroupAsBoolean() method.
    */
    @Test
    public void subTestGetAlternateGroupAsBoolean() {
        assertEquals(null, this.jMetaDataText.getAlternateGroupAsBoolean());
        System.out.println("Number of a group in order to provide versions of the same track AS Boolean === " + jMetaDataText.getAlternateGroupAsBoolean());
    }

   /**
    * Test getAlternateGroupAsBigInteger() method.
    */
    @Test
    public void subTestGetAlternateGroupAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getAlternateGroupAsBigInteger());
        System.out.println("Number of a group in order to provide versions of the same track AS BigInteger === " + jMetaDataText.getAlternateGroupAsBigInteger());
    }

   /**
    * Test getAlternateGroupAsURL() method.
    */
    @Test
    public void subTestGetAlternateGroupAsURL() {
        assertEquals(null, this.jMetaDataText.getAlternateGroupAsURL());
        System.out.println("Number of a group in order to provide versions of the same track AS URL === " + jMetaDataText.getAlternateGroupAsURL());
    }

   /**
    * Test getLanguageAsInteger() method.
    */
    @Test
    public void subTestGetLanguageAsInteger() {
        assertEquals(null, this.jMetaDataText.getLanguageAsInteger());
        System.out.println("Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn) AS Integer === " + jMetaDataText.getLanguageAsInteger());
    }

   /**
    * Test getLanguageAsLong() method.
    */
    @Test
    public void subTestGetLanguageAsLong() {
        assertEquals(null, this.jMetaDataText.getLanguageAsLong());
        System.out.println("Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn) AS Long === " + jMetaDataText.getLanguageAsLong());
    }

   /**
    * Test getLanguageAsLocalDateTime() method.
    */
    @Test
    public void subTestGetLanguageAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getLanguageAsLocalDateTime());
        System.out.println("Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn) AS LocalDateTime === " + jMetaDataText.getLanguageAsLocalDateTime());
    }

   /**
    * Test getLanguageAsLocalTime() method.
    */
    @Test
    public void subTestGetLanguageAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getLanguageAsLocalTime());
        System.out.println("Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn) AS LocalTime === " + jMetaDataText.getLanguageAsLocalTime());
    }

   /**
    * Test getLanguageAsString() method.
    */
    @Test
    public void subTestGetLanguageAsString() {
        assertEquals(null, this.jMetaDataText.getLanguageAsString());
        System.out.println("Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn) AS String === " + jMetaDataText.getLanguageAsString());
    }

   /**
    * Test getLanguageAsBoolean() method.
    */
    @Test
    public void subTestGetLanguageAsBoolean() {
        assertEquals(null, this.jMetaDataText.getLanguageAsBoolean());
        System.out.println("Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn) AS Boolean === " + jMetaDataText.getLanguageAsBoolean());
    }

   /**
    * Test getLanguageAsBigInteger() method.
    */
    @Test
    public void subTestGetLanguageAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getLanguageAsBigInteger());
        System.out.println("Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn) AS BigInteger === " + jMetaDataText.getLanguageAsBigInteger());
    }

   /**
    * Test getLanguageAsURL() method.
    */
    @Test
    public void subTestGetLanguageAsURL() {
        assertEquals(null, this.jMetaDataText.getLanguageAsURL());
        System.out.println("Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn) AS URL === " + jMetaDataText.getLanguageAsURL());
    }

   /**
    * Test getDurationLastFrameAsInteger() method.
    */
    @Test
    public void subTestGetDurationLastFrameAsInteger() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameAsInteger());
        System.out.println("Duration of the last frame if it is longer than others, in ms AS Integer === " + jMetaDataText.getDurationLastFrameAsInteger());
    }

   /**
    * Test getDurationLastFrameAsLong() method.
    */
    @Test
    public void subTestGetDurationLastFrameAsLong() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameAsLong());
        System.out.println("Duration of the last frame if it is longer than others, in ms AS Long === " + jMetaDataText.getDurationLastFrameAsLong());
    }

   /**
    * Test getDurationLastFrameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationLastFrameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameAsLocalDateTime());
        System.out.println("Duration of the last frame if it is longer than others, in ms AS LocalDateTime === " + jMetaDataText.getDurationLastFrameAsLocalDateTime());
    }

   /**
    * Test getDurationLastFrameAsLocalTime() method.
    */
    @Test
    public void subTestGetDurationLastFrameAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameAsLocalTime());
        System.out.println("Duration of the last frame if it is longer than others, in ms AS LocalTime === " + jMetaDataText.getDurationLastFrameAsLocalTime());
    }

   /**
    * Test getDurationLastFrameAsString() method.
    */
    @Test
    public void subTestGetDurationLastFrameAsString() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameAsString());
        System.out.println("Duration of the last frame if it is longer than others, in ms AS String === " + jMetaDataText.getDurationLastFrameAsString());
    }

   /**
    * Test getDurationLastFrameAsBoolean() method.
    */
    @Test
    public void subTestGetDurationLastFrameAsBoolean() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameAsBoolean());
        System.out.println("Duration of the last frame if it is longer than others, in ms AS Boolean === " + jMetaDataText.getDurationLastFrameAsBoolean());
    }

   /**
    * Test getDurationLastFrameAsBigInteger() method.
    */
    @Test
    public void subTestGetDurationLastFrameAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameAsBigInteger());
        System.out.println("Duration of the last frame if it is longer than others, in ms AS BigInteger === " + jMetaDataText.getDurationLastFrameAsBigInteger());
    }

   /**
    * Test getDurationLastFrameAsURL() method.
    */
    @Test
    public void subTestGetDurationLastFrameAsURL() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameAsURL());
        System.out.println("Duration of the last frame if it is longer than others, in ms AS URL === " + jMetaDataText.getDurationLastFrameAsURL());
    }

   /**
    * Test getEncodedLibraryStringAsInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryStringAsInteger());
        System.out.println("Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS Integer === " + jMetaDataText.getEncodedLibraryStringAsInteger());
    }

   /**
    * Test getEncodedLibraryStringAsLong() method.
    */
    @Test
    public void subTestGetEncodedLibraryStringAsLong() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryStringAsLong());
        System.out.println("Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS Long === " + jMetaDataText.getEncodedLibraryStringAsLong());
    }

   /**
    * Test getEncodedLibraryStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryStringAsLocalDateTime());
        System.out.println("Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS LocalDateTime === " + jMetaDataText.getEncodedLibraryStringAsLocalDateTime());
    }

   /**
    * Test getEncodedLibraryStringAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryStringAsLocalTime());
        System.out.println("Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS LocalTime === " + jMetaDataText.getEncodedLibraryStringAsLocalTime());
    }

   /**
    * Test getEncodedLibraryStringAsString() method.
    */
    @Test
    public void subTestGetEncodedLibraryStringAsString() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryStringAsString());
        System.out.println("Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS String === " + jMetaDataText.getEncodedLibraryStringAsString());
    }

   /**
    * Test getEncodedLibraryStringAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedLibraryStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryStringAsBoolean());
        System.out.println("Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS Boolean === " + jMetaDataText.getEncodedLibraryStringAsBoolean());
    }

   /**
    * Test getEncodedLibraryStringAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryStringAsBigInteger());
        System.out.println("Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS BigInteger === " + jMetaDataText.getEncodedLibraryStringAsBigInteger());
    }

   /**
    * Test getEncodedLibraryStringAsURL() method.
    */
    @Test
    public void subTestGetEncodedLibraryStringAsURL() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryStringAsURL());
        System.out.println("Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS URL === " + jMetaDataText.getEncodedLibraryStringAsURL());
    }

   /**
    * Test getStreamSizeStringAsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeStringAsInteger());
        System.out.println("Streamsize in with percentage value AS Integer === " + jMetaDataText.getStreamSizeStringAsInteger());
    }

   /**
    * Test getStreamSizeStringAsLong() method.
    */
    @Test
    public void subTestGetStreamSizeStringAsLong() {
        assertEquals(null, this.jMetaDataText.getStreamSizeStringAsLong());
        System.out.println("Streamsize in with percentage value AS Long === " + jMetaDataText.getStreamSizeStringAsLong());
    }

   /**
    * Test getStreamSizeStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeStringAsLocalDateTime());
        System.out.println("Streamsize in with percentage value AS LocalDateTime === " + jMetaDataText.getStreamSizeStringAsLocalDateTime());
    }

   /**
    * Test getStreamSizeStringAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeStringAsLocalTime());
        System.out.println("Streamsize in with percentage value AS LocalTime === " + jMetaDataText.getStreamSizeStringAsLocalTime());
    }

   /**
    * Test getStreamSizeStringAsString() method.
    */
    @Test
    public void subTestGetStreamSizeStringAsString() {
        assertEquals(null, this.jMetaDataText.getStreamSizeStringAsString());
        System.out.println("Streamsize in with percentage value AS String === " + jMetaDataText.getStreamSizeStringAsString());
    }

   /**
    * Test getStreamSizeStringAsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getStreamSizeStringAsBoolean());
        System.out.println("Streamsize in with percentage value AS Boolean === " + jMetaDataText.getStreamSizeStringAsBoolean());
    }

   /**
    * Test getStreamSizeStringAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeStringAsBigInteger());
        System.out.println("Streamsize in with percentage value AS BigInteger === " + jMetaDataText.getStreamSizeStringAsBigInteger());
    }

   /**
    * Test getStreamSizeStringAsURL() method.
    */
    @Test
    public void subTestGetStreamSizeStringAsURL() {
        assertEquals(null, this.jMetaDataText.getStreamSizeStringAsURL());
        System.out.println("Streamsize in with percentage value AS URL === " + jMetaDataText.getStreamSizeStringAsURL());
    }

   /**
    * Test getDefaultStringAsInteger() method.
    */
    @Test
    public void subTestGetDefaultStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getDefaultStringAsInteger());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS Integer === " + jMetaDataText.getDefaultStringAsInteger());
    }

   /**
    * Test getDefaultStringAsLong() method.
    */
    @Test
    public void subTestGetDefaultStringAsLong() {
        assertEquals(null, this.jMetaDataText.getDefaultStringAsLong());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS Long === " + jMetaDataText.getDefaultStringAsLong());
    }

   /**
    * Test getDefaultStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDefaultStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDefaultStringAsLocalDateTime());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS LocalDateTime === " + jMetaDataText.getDefaultStringAsLocalDateTime());
    }

   /**
    * Test getDefaultStringAsLocalTime() method.
    */
    @Test
    public void subTestGetDefaultStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDefaultStringAsLocalTime());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS LocalTime === " + jMetaDataText.getDefaultStringAsLocalTime());
    }

   /**
    * Test getDefaultStringAsString() method.
    */
    @Test
    public void subTestGetDefaultStringAsString() {
        assertEquals(null, this.jMetaDataText.getDefaultStringAsString());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS String === " + jMetaDataText.getDefaultStringAsString());
    }

   /**
    * Test getDefaultStringAsBoolean() method.
    */
    @Test
    public void subTestGetDefaultStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getDefaultStringAsBoolean());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS Boolean === " + jMetaDataText.getDefaultStringAsBoolean());
    }

   /**
    * Test getDefaultStringAsBigInteger() method.
    */
    @Test
    public void subTestGetDefaultStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDefaultStringAsBigInteger());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS BigInteger === " + jMetaDataText.getDefaultStringAsBigInteger());
    }

   /**
    * Test getDefaultStringAsURL() method.
    */
    @Test
    public void subTestGetDefaultStringAsURL() {
        assertEquals(null, this.jMetaDataText.getDefaultStringAsURL());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS URL === " + jMetaDataText.getDefaultStringAsURL());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsInteger() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getOriginalSourceMediumIDStringAsInteger());
        System.out.println("The ID for this stream in the original medium of the material AS Integer === " + jMetaDataText.getOriginalSourceMediumIDStringAsInteger());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsLong() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsLong() {
        assertEquals(null, this.jMetaDataText.getOriginalSourceMediumIDStringAsLong());
        System.out.println("The ID for this stream in the original medium of the material AS Long === " + jMetaDataText.getOriginalSourceMediumIDStringAsLong());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getOriginalSourceMediumIDStringAsLocalDateTime());
        System.out.println("The ID for this stream in the original medium of the material AS LocalDateTime === " + jMetaDataText.getOriginalSourceMediumIDStringAsLocalDateTime());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsLocalTime() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getOriginalSourceMediumIDStringAsLocalTime());
        System.out.println("The ID for this stream in the original medium of the material AS LocalTime === " + jMetaDataText.getOriginalSourceMediumIDStringAsLocalTime());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsString() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsString() {
        assertEquals(null, this.jMetaDataText.getOriginalSourceMediumIDStringAsString());
        System.out.println("The ID for this stream in the original medium of the material AS String === " + jMetaDataText.getOriginalSourceMediumIDStringAsString());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsBoolean() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getOriginalSourceMediumIDStringAsBoolean());
        System.out.println("The ID for this stream in the original medium of the material AS Boolean === " + jMetaDataText.getOriginalSourceMediumIDStringAsBoolean());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsBigInteger() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getOriginalSourceMediumIDStringAsBigInteger());
        System.out.println("The ID for this stream in the original medium of the material AS BigInteger === " + jMetaDataText.getOriginalSourceMediumIDStringAsBigInteger());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsURL() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsURL() {
        assertEquals(null, this.jMetaDataText.getOriginalSourceMediumIDStringAsURL());
        System.out.println("The ID for this stream in the original medium of the material AS URL === " + jMetaDataText.getOriginalSourceMediumIDStringAsURL());
    }

   /**
    * Test getSourceDurationLastFrameString1AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsInteger() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameString1AsInteger());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS Integer === " + jMetaDataText.getSourceDurationLastFrameString1AsInteger());
    }

   /**
    * Test getSourceDurationLastFrameString1AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsLong() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameString1AsLong());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS Long === " + jMetaDataText.getSourceDurationLastFrameString1AsLong());
    }

   /**
    * Test getSourceDurationLastFrameString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameString1AsLocalDateTime());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS LocalDateTime === " + jMetaDataText.getSourceDurationLastFrameString1AsLocalDateTime());
    }

   /**
    * Test getSourceDurationLastFrameString1AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameString1AsLocalTime());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS LocalTime === " + jMetaDataText.getSourceDurationLastFrameString1AsLocalTime());
    }

   /**
    * Test getSourceDurationLastFrameString1AsString() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsString() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameString1AsString());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS String === " + jMetaDataText.getSourceDurationLastFrameString1AsString());
    }

   /**
    * Test getSourceDurationLastFrameString1AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsBoolean() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameString1AsBoolean());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS Boolean === " + jMetaDataText.getSourceDurationLastFrameString1AsBoolean());
    }

   /**
    * Test getSourceDurationLastFrameString1AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameString1AsBigInteger());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS BigInteger === " + jMetaDataText.getSourceDurationLastFrameString1AsBigInteger());
    }

   /**
    * Test getSourceDurationLastFrameString1AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString1AsURL() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameString1AsURL());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS URL === " + jMetaDataText.getSourceDurationLastFrameString1AsURL());
    }

   /**
    * Test getSourceDurationLastFrameString3AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsInteger() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameString3AsInteger());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM AS Integer === " + jMetaDataText.getSourceDurationLastFrameString3AsInteger());
    }

   /**
    * Test getSourceDurationLastFrameString3AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsLong() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameString3AsLong());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM AS Long === " + jMetaDataText.getSourceDurationLastFrameString3AsLong());
    }

   /**
    * Test getSourceDurationLastFrameString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameString3AsLocalDateTime());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM AS LocalDateTime === " + jMetaDataText.getSourceDurationLastFrameString3AsLocalDateTime());
    }

   /**
    * Test getSourceDurationLastFrameString3AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameString3AsLocalTime());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM AS LocalTime === " + jMetaDataText.getSourceDurationLastFrameString3AsLocalTime());
    }

   /**
    * Test getSourceDurationLastFrameString3AsString() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsString() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameString3AsString());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM AS String === " + jMetaDataText.getSourceDurationLastFrameString3AsString());
    }

   /**
    * Test getSourceDurationLastFrameString3AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsBoolean() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameString3AsBoolean());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM AS Boolean === " + jMetaDataText.getSourceDurationLastFrameString3AsBoolean());
    }

   /**
    * Test getSourceDurationLastFrameString3AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameString3AsBigInteger());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM AS BigInteger === " + jMetaDataText.getSourceDurationLastFrameString3AsBigInteger());
    }

   /**
    * Test getSourceDurationLastFrameString3AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString3AsURL() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameString3AsURL());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM AS URL === " + jMetaDataText.getSourceDurationLastFrameString3AsURL());
    }

   /**
    * Test getSourceDurationLastFrameString2AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsInteger() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameString2AsInteger());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Integer === " + jMetaDataText.getSourceDurationLastFrameString2AsInteger());
    }

   /**
    * Test getSourceDurationLastFrameString2AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsLong() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameString2AsLong());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Long === " + jMetaDataText.getSourceDurationLastFrameString2AsLong());
    }

   /**
    * Test getSourceDurationLastFrameString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameString2AsLocalDateTime());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS LocalDateTime === " + jMetaDataText.getSourceDurationLastFrameString2AsLocalDateTime());
    }

   /**
    * Test getSourceDurationLastFrameString2AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameString2AsLocalTime());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS LocalTime === " + jMetaDataText.getSourceDurationLastFrameString2AsLocalTime());
    }

   /**
    * Test getSourceDurationLastFrameString2AsString() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsString() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameString2AsString());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS String === " + jMetaDataText.getSourceDurationLastFrameString2AsString());
    }

   /**
    * Test getSourceDurationLastFrameString2AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsBoolean() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameString2AsBoolean());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Boolean === " + jMetaDataText.getSourceDurationLastFrameString2AsBoolean());
    }

   /**
    * Test getSourceDurationLastFrameString2AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameString2AsBigInteger());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS BigInteger === " + jMetaDataText.getSourceDurationLastFrameString2AsBigInteger());
    }

   /**
    * Test getSourceDurationLastFrameString2AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString2AsURL() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameString2AsURL());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS URL === " + jMetaDataText.getSourceDurationLastFrameString2AsURL());
    }

   /**
    * Test getSourceDurationLastFrameString5AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsInteger() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameString5AsInteger());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Integer === " + jMetaDataText.getSourceDurationLastFrameString5AsInteger());
    }

   /**
    * Test getSourceDurationLastFrameString5AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsLong() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameString5AsLong());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Long === " + jMetaDataText.getSourceDurationLastFrameString5AsLong());
    }

   /**
    * Test getSourceDurationLastFrameString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameString5AsLocalDateTime());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS LocalDateTime === " + jMetaDataText.getSourceDurationLastFrameString5AsLocalDateTime());
    }

   /**
    * Test getSourceDurationLastFrameString5AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameString5AsLocalTime());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS LocalTime === " + jMetaDataText.getSourceDurationLastFrameString5AsLocalTime());
    }

   /**
    * Test getSourceDurationLastFrameString5AsString() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsString() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameString5AsString());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS String === " + jMetaDataText.getSourceDurationLastFrameString5AsString());
    }

   /**
    * Test getSourceDurationLastFrameString5AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsBoolean() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameString5AsBoolean());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Boolean === " + jMetaDataText.getSourceDurationLastFrameString5AsBoolean());
    }

   /**
    * Test getSourceDurationLastFrameString5AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameString5AsBigInteger());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS BigInteger === " + jMetaDataText.getSourceDurationLastFrameString5AsBigInteger());
    }

   /**
    * Test getSourceDurationLastFrameString5AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString5AsURL() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameString5AsURL());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS URL === " + jMetaDataText.getSourceDurationLastFrameString5AsURL());
    }

   /**
    * Test getSourceDurationLastFrameString4AsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsInteger() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameString4AsInteger());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Integer === " + jMetaDataText.getSourceDurationLastFrameString4AsInteger());
    }

   /**
    * Test getSourceDurationLastFrameString4AsLong() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsLong() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameString4AsLong());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Long === " + jMetaDataText.getSourceDurationLastFrameString4AsLong());
    }

   /**
    * Test getSourceDurationLastFrameString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameString4AsLocalDateTime());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS LocalDateTime === " + jMetaDataText.getSourceDurationLastFrameString4AsLocalDateTime());
    }

   /**
    * Test getSourceDurationLastFrameString4AsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameString4AsLocalTime());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS LocalTime === " + jMetaDataText.getSourceDurationLastFrameString4AsLocalTime());
    }

   /**
    * Test getSourceDurationLastFrameString4AsString() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsString() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameString4AsString());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS String === " + jMetaDataText.getSourceDurationLastFrameString4AsString());
    }

   /**
    * Test getSourceDurationLastFrameString4AsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsBoolean() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameString4AsBoolean());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Boolean === " + jMetaDataText.getSourceDurationLastFrameString4AsBoolean());
    }

   /**
    * Test getSourceDurationLastFrameString4AsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameString4AsBigInteger());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS BigInteger === " + jMetaDataText.getSourceDurationLastFrameString4AsBigInteger());
    }

   /**
    * Test getSourceDurationLastFrameString4AsURL() method.
    */
    @Test
    public void subTestGetSourceDurationLastFrameString4AsURL() {
        assertEquals(null, this.jMetaDataText.getSourceDurationLastFrameString4AsURL());
        System.out.println("Source Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS URL === " + jMetaDataText.getSourceDurationLastFrameString4AsURL());
    }

   /**
    * Test getBitDepthStringAsInteger() method.
    */
    @Test
    public void subTestGetBitDepthStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getBitDepthStringAsInteger());
        System.out.println("BitDepth/String AS Integer === " + jMetaDataText.getBitDepthStringAsInteger());
    }

   /**
    * Test getBitDepthStringAsLong() method.
    */
    @Test
    public void subTestGetBitDepthStringAsLong() {
        assertEquals(null, this.jMetaDataText.getBitDepthStringAsLong());
        System.out.println("BitDepth/String AS Long === " + jMetaDataText.getBitDepthStringAsLong());
    }

   /**
    * Test getBitDepthStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitDepthStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getBitDepthStringAsLocalDateTime());
        System.out.println("BitDepth/String AS LocalDateTime === " + jMetaDataText.getBitDepthStringAsLocalDateTime());
    }

   /**
    * Test getBitDepthStringAsLocalTime() method.
    */
    @Test
    public void subTestGetBitDepthStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getBitDepthStringAsLocalTime());
        System.out.println("BitDepth/String AS LocalTime === " + jMetaDataText.getBitDepthStringAsLocalTime());
    }

   /**
    * Test getBitDepthStringAsString() method.
    */
    @Test
    public void subTestGetBitDepthStringAsString() {
        assertEquals(null, this.jMetaDataText.getBitDepthStringAsString());
        System.out.println("BitDepth/String AS String === " + jMetaDataText.getBitDepthStringAsString());
    }

   /**
    * Test getBitDepthStringAsBoolean() method.
    */
    @Test
    public void subTestGetBitDepthStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getBitDepthStringAsBoolean());
        System.out.println("BitDepth/String AS Boolean === " + jMetaDataText.getBitDepthStringAsBoolean());
    }

   /**
    * Test getBitDepthStringAsBigInteger() method.
    */
    @Test
    public void subTestGetBitDepthStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getBitDepthStringAsBigInteger());
        System.out.println("BitDepth/String AS BigInteger === " + jMetaDataText.getBitDepthStringAsBigInteger());
    }

   /**
    * Test getBitDepthStringAsURL() method.
    */
    @Test
    public void subTestGetBitDepthStringAsURL() {
        assertEquals(null, this.jMetaDataText.getBitDepthStringAsURL());
        System.out.println("BitDepth/String AS URL === " + jMetaDataText.getBitDepthStringAsURL());
    }

   /**
    * Test getFrameCountAsInteger() method.
    */
    @Test
    public void subTestGetFrameCountAsInteger() {
        assertEquals(null, this.jMetaDataText.getFrameCountAsInteger());
        System.out.println("Number of frames AS Integer === " + jMetaDataText.getFrameCountAsInteger());
    }

   /**
    * Test getFrameCountAsLong() method.
    */
    @Test
    public void subTestGetFrameCountAsLong() {
        assertEquals(null, this.jMetaDataText.getFrameCountAsLong());
        System.out.println("Number of frames AS Long === " + jMetaDataText.getFrameCountAsLong());
    }

   /**
    * Test getFrameCountAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFrameCountAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getFrameCountAsLocalDateTime());
        System.out.println("Number of frames AS LocalDateTime === " + jMetaDataText.getFrameCountAsLocalDateTime());
    }

   /**
    * Test getFrameCountAsLocalTime() method.
    */
    @Test
    public void subTestGetFrameCountAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getFrameCountAsLocalTime());
        System.out.println("Number of frames AS LocalTime === " + jMetaDataText.getFrameCountAsLocalTime());
    }

   /**
    * Test getFrameCountAsString() method.
    */
    @Test
    public void subTestGetFrameCountAsString() {
        assertEquals(null, this.jMetaDataText.getFrameCountAsString());
        System.out.println("Number of frames AS String === " + jMetaDataText.getFrameCountAsString());
    }

   /**
    * Test getFrameCountAsBoolean() method.
    */
    @Test
    public void subTestGetFrameCountAsBoolean() {
        assertEquals(null, this.jMetaDataText.getFrameCountAsBoolean());
        System.out.println("Number of frames AS Boolean === " + jMetaDataText.getFrameCountAsBoolean());
    }

   /**
    * Test getFrameCountAsBigInteger() method.
    */
    @Test
    public void subTestGetFrameCountAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getFrameCountAsBigInteger());
        System.out.println("Number of frames AS BigInteger === " + jMetaDataText.getFrameCountAsBigInteger());
    }

   /**
    * Test getFrameCountAsURL() method.
    */
    @Test
    public void subTestGetFrameCountAsURL() {
        assertEquals(null, this.jMetaDataText.getFrameCountAsURL());
        System.out.println("Number of frames AS URL === " + jMetaDataText.getFrameCountAsURL());
    }

   /**
    * Test getTitleAsInteger() method.
    */
    @Test
    public void subTestGetTitleAsInteger() {
        assertEquals(null, this.jMetaDataText.getTitleAsInteger());
        System.out.println("Name of the track AS Integer === " + jMetaDataText.getTitleAsInteger());
    }

   /**
    * Test getTitleAsLong() method.
    */
    @Test
    public void subTestGetTitleAsLong() {
        assertEquals(null, this.jMetaDataText.getTitleAsLong());
        System.out.println("Name of the track AS Long === " + jMetaDataText.getTitleAsLong());
    }

   /**
    * Test getTitleAsLocalDateTime() method.
    */
    @Test
    public void subTestGetTitleAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getTitleAsLocalDateTime());
        System.out.println("Name of the track AS LocalDateTime === " + jMetaDataText.getTitleAsLocalDateTime());
    }

   /**
    * Test getTitleAsLocalTime() method.
    */
    @Test
    public void subTestGetTitleAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getTitleAsLocalTime());
        System.out.println("Name of the track AS LocalTime === " + jMetaDataText.getTitleAsLocalTime());
    }

   /**
    * Test getTitleAsString() method.
    */
    @Test
    public void subTestGetTitleAsString() {
        assertEquals(null, this.jMetaDataText.getTitleAsString());
        System.out.println("Name of the track AS String === " + jMetaDataText.getTitleAsString());
    }

   /**
    * Test getTitleAsBoolean() method.
    */
    @Test
    public void subTestGetTitleAsBoolean() {
        assertEquals(null, this.jMetaDataText.getTitleAsBoolean());
        System.out.println("Name of the track AS Boolean === " + jMetaDataText.getTitleAsBoolean());
    }

   /**
    * Test getTitleAsBigInteger() method.
    */
    @Test
    public void subTestGetTitleAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getTitleAsBigInteger());
        System.out.println("Name of the track AS BigInteger === " + jMetaDataText.getTitleAsBigInteger());
    }

   /**
    * Test getTitleAsURL() method.
    */
    @Test
    public void subTestGetTitleAsURL() {
        assertEquals(null, this.jMetaDataText.getTitleAsURL());
        System.out.println("Name of the track AS URL === " + jMetaDataText.getTitleAsURL());
    }

   /**
    * Test getDelayDropFrameAsInteger() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsInteger() {
        assertEquals(null, this.jMetaDataText.getDelayDropFrameAsInteger());
        System.out.println("Delay drop frame AS Integer === " + jMetaDataText.getDelayDropFrameAsInteger());
    }

   /**
    * Test getDelayDropFrameAsLong() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsLong() {
        assertEquals(null, this.jMetaDataText.getDelayDropFrameAsLong());
        System.out.println("Delay drop frame AS Long === " + jMetaDataText.getDelayDropFrameAsLong());
    }

   /**
    * Test getDelayDropFrameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDelayDropFrameAsLocalDateTime());
        System.out.println("Delay drop frame AS LocalDateTime === " + jMetaDataText.getDelayDropFrameAsLocalDateTime());
    }

   /**
    * Test getDelayDropFrameAsLocalTime() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDelayDropFrameAsLocalTime());
        System.out.println("Delay drop frame AS LocalTime === " + jMetaDataText.getDelayDropFrameAsLocalTime());
    }

   /**
    * Test getDelayDropFrameAsString() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsString() {
        assertEquals(null, this.jMetaDataText.getDelayDropFrameAsString());
        System.out.println("Delay drop frame AS String === " + jMetaDataText.getDelayDropFrameAsString());
    }

   /**
    * Test getDelayDropFrameAsBoolean() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsBoolean() {
        assertEquals(null, this.jMetaDataText.getDelayDropFrameAsBoolean());
        System.out.println("Delay drop frame AS Boolean === " + jMetaDataText.getDelayDropFrameAsBoolean());
    }

   /**
    * Test getDelayDropFrameAsBigInteger() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDelayDropFrameAsBigInteger());
        System.out.println("Delay drop frame AS BigInteger === " + jMetaDataText.getDelayDropFrameAsBigInteger());
    }

   /**
    * Test getDelayDropFrameAsURL() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsURL() {
        assertEquals(null, this.jMetaDataText.getDelayDropFrameAsURL());
        System.out.println("Delay drop frame AS URL === " + jMetaDataText.getDelayDropFrameAsURL());
    }

   /**
    * Test getBitRateMaximumAsInteger() method.
    */
    @Test
    public void subTestGetBitRateMaximumAsInteger() {
        assertEquals(null, this.jMetaDataText.getBitRateMaximumAsInteger());
        System.out.println("Maximum Bit rate in bps AS Integer === " + jMetaDataText.getBitRateMaximumAsInteger());
    }

   /**
    * Test getBitRateMaximumAsLong() method.
    */
    @Test
    public void subTestGetBitRateMaximumAsLong() {
        assertEquals(null, this.jMetaDataText.getBitRateMaximumAsLong());
        System.out.println("Maximum Bit rate in bps AS Long === " + jMetaDataText.getBitRateMaximumAsLong());
    }

   /**
    * Test getBitRateMaximumAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitRateMaximumAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getBitRateMaximumAsLocalDateTime());
        System.out.println("Maximum Bit rate in bps AS LocalDateTime === " + jMetaDataText.getBitRateMaximumAsLocalDateTime());
    }

   /**
    * Test getBitRateMaximumAsLocalTime() method.
    */
    @Test
    public void subTestGetBitRateMaximumAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getBitRateMaximumAsLocalTime());
        System.out.println("Maximum Bit rate in bps AS LocalTime === " + jMetaDataText.getBitRateMaximumAsLocalTime());
    }

   /**
    * Test getBitRateMaximumAsString() method.
    */
    @Test
    public void subTestGetBitRateMaximumAsString() {
        assertEquals(null, this.jMetaDataText.getBitRateMaximumAsString());
        System.out.println("Maximum Bit rate in bps AS String === " + jMetaDataText.getBitRateMaximumAsString());
    }

   /**
    * Test getBitRateMaximumAsBoolean() method.
    */
    @Test
    public void subTestGetBitRateMaximumAsBoolean() {
        assertEquals(null, this.jMetaDataText.getBitRateMaximumAsBoolean());
        System.out.println("Maximum Bit rate in bps AS Boolean === " + jMetaDataText.getBitRateMaximumAsBoolean());
    }

   /**
    * Test getBitRateMaximumAsBigInteger() method.
    */
    @Test
    public void subTestGetBitRateMaximumAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getBitRateMaximumAsBigInteger());
        System.out.println("Maximum Bit rate in bps AS BigInteger === " + jMetaDataText.getBitRateMaximumAsBigInteger());
    }

   /**
    * Test getBitRateMaximumAsURL() method.
    */
    @Test
    public void subTestGetBitRateMaximumAsURL() {
        assertEquals(null, this.jMetaDataText.getBitRateMaximumAsURL());
        System.out.println("Maximum Bit rate in bps AS URL === " + jMetaDataText.getBitRateMaximumAsURL());
    }

   /**
    * Test getStreamSizeProportionAsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeProportionAsInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeProportionAsInteger());
        System.out.println("Stream size divided by file size AS Integer === " + jMetaDataText.getStreamSizeProportionAsInteger());
    }

   /**
    * Test getStreamSizeProportionAsLong() method.
    */
    @Test
    public void subTestGetStreamSizeProportionAsLong() {
        assertEquals(null, this.jMetaDataText.getStreamSizeProportionAsLong());
        System.out.println("Stream size divided by file size AS Long === " + jMetaDataText.getStreamSizeProportionAsLong());
    }

   /**
    * Test getStreamSizeProportionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeProportionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeProportionAsLocalDateTime());
        System.out.println("Stream size divided by file size AS LocalDateTime === " + jMetaDataText.getStreamSizeProportionAsLocalDateTime());
    }

   /**
    * Test getStreamSizeProportionAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeProportionAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeProportionAsLocalTime());
        System.out.println("Stream size divided by file size AS LocalTime === " + jMetaDataText.getStreamSizeProportionAsLocalTime());
    }

   /**
    * Test getStreamSizeProportionAsString() method.
    */
    @Test
    public void subTestGetStreamSizeProportionAsString() {
        assertEquals(null, this.jMetaDataText.getStreamSizeProportionAsString());
        System.out.println("Stream size divided by file size AS String === " + jMetaDataText.getStreamSizeProportionAsString());
    }

   /**
    * Test getStreamSizeProportionAsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeProportionAsBoolean() {
        assertEquals(null, this.jMetaDataText.getStreamSizeProportionAsBoolean());
        System.out.println("Stream size divided by file size AS Boolean === " + jMetaDataText.getStreamSizeProportionAsBoolean());
    }

   /**
    * Test getStreamSizeProportionAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeProportionAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeProportionAsBigInteger());
        System.out.println("Stream size divided by file size AS BigInteger === " + jMetaDataText.getStreamSizeProportionAsBigInteger());
    }

   /**
    * Test getStreamSizeProportionAsURL() method.
    */
    @Test
    public void subTestGetStreamSizeProportionAsURL() {
        assertEquals(null, this.jMetaDataText.getStreamSizeProportionAsURL());
        System.out.println("Stream size divided by file size AS URL === " + jMetaDataText.getStreamSizeProportionAsURL());
    }

   /**
    * Test getSourceStreamSizeEncodedProportionAsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsInteger() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedProportionAsInteger());
        System.out.println("Source Encoded Stream size divided by file size AS Integer === " + jMetaDataText.getSourceStreamSizeEncodedProportionAsInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedProportionAsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsLong() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedProportionAsLong());
        System.out.println("Source Encoded Stream size divided by file size AS Long === " + jMetaDataText.getSourceStreamSizeEncodedProportionAsLong());
    }

   /**
    * Test getSourceStreamSizeEncodedProportionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedProportionAsLocalDateTime());
        System.out.println("Source Encoded Stream size divided by file size AS LocalDateTime === " + jMetaDataText.getSourceStreamSizeEncodedProportionAsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeEncodedProportionAsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedProportionAsLocalTime());
        System.out.println("Source Encoded Stream size divided by file size AS LocalTime === " + jMetaDataText.getSourceStreamSizeEncodedProportionAsLocalTime());
    }

   /**
    * Test getSourceStreamSizeEncodedProportionAsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsString() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedProportionAsString());
        System.out.println("Source Encoded Stream size divided by file size AS String === " + jMetaDataText.getSourceStreamSizeEncodedProportionAsString());
    }

   /**
    * Test getSourceStreamSizeEncodedProportionAsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsBoolean() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedProportionAsBoolean());
        System.out.println("Source Encoded Stream size divided by file size AS Boolean === " + jMetaDataText.getSourceStreamSizeEncodedProportionAsBoolean());
    }

   /**
    * Test getSourceStreamSizeEncodedProportionAsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedProportionAsBigInteger());
        System.out.println("Source Encoded Stream size divided by file size AS BigInteger === " + jMetaDataText.getSourceStreamSizeEncodedProportionAsBigInteger());
    }

   /**
    * Test getSourceStreamSizeEncodedProportionAsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeEncodedProportionAsURL() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeEncodedProportionAsURL());
        System.out.println("Source Encoded Stream size divided by file size AS URL === " + jMetaDataText.getSourceStreamSizeEncodedProportionAsURL());
    }

   /**
    * Test getEncodedLibrarySettingsAsInteger() method.
    */
    @Test
    public void subTestGetEncodedLibrarySettingsAsInteger() {
        assertEquals(null, this.jMetaDataText.getEncodedLibrarySettingsAsInteger());
        System.out.println("Parameters used by the software AS Integer === " + jMetaDataText.getEncodedLibrarySettingsAsInteger());
    }

   /**
    * Test getEncodedLibrarySettingsAsLong() method.
    */
    @Test
    public void subTestGetEncodedLibrarySettingsAsLong() {
        assertEquals(null, this.jMetaDataText.getEncodedLibrarySettingsAsLong());
        System.out.println("Parameters used by the software AS Long === " + jMetaDataText.getEncodedLibrarySettingsAsLong());
    }

   /**
    * Test getEncodedLibrarySettingsAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedLibrarySettingsAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getEncodedLibrarySettingsAsLocalDateTime());
        System.out.println("Parameters used by the software AS LocalDateTime === " + jMetaDataText.getEncodedLibrarySettingsAsLocalDateTime());
    }

   /**
    * Test getEncodedLibrarySettingsAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedLibrarySettingsAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getEncodedLibrarySettingsAsLocalTime());
        System.out.println("Parameters used by the software AS LocalTime === " + jMetaDataText.getEncodedLibrarySettingsAsLocalTime());
    }

   /**
    * Test getEncodedLibrarySettingsAsString() method.
    */
    @Test
    public void subTestGetEncodedLibrarySettingsAsString() {
        assertEquals(null, this.jMetaDataText.getEncodedLibrarySettingsAsString());
        System.out.println("Parameters used by the software AS String === " + jMetaDataText.getEncodedLibrarySettingsAsString());
    }

   /**
    * Test getEncodedLibrarySettingsAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedLibrarySettingsAsBoolean() {
        assertEquals(null, this.jMetaDataText.getEncodedLibrarySettingsAsBoolean());
        System.out.println("Parameters used by the software AS Boolean === " + jMetaDataText.getEncodedLibrarySettingsAsBoolean());
    }

   /**
    * Test getEncodedLibrarySettingsAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedLibrarySettingsAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getEncodedLibrarySettingsAsBigInteger());
        System.out.println("Parameters used by the software AS BigInteger === " + jMetaDataText.getEncodedLibrarySettingsAsBigInteger());
    }

   /**
    * Test getEncodedLibrarySettingsAsURL() method.
    */
    @Test
    public void subTestGetEncodedLibrarySettingsAsURL() {
        assertEquals(null, this.jMetaDataText.getEncodedLibrarySettingsAsURL());
        System.out.println("Parameters used by the software AS URL === " + jMetaDataText.getEncodedLibrarySettingsAsURL());
    }

   /**
    * Test getSourceDurationAsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationAsInteger() {
        assertEquals(null, this.jMetaDataText.getSourceDurationAsInteger());
        System.out.println("Source Play time of the stream, in ms AS Integer === " + jMetaDataText.getSourceDurationAsInteger());
    }

   /**
    * Test getSourceDurationAsLong() method.
    */
    @Test
    public void subTestGetSourceDurationAsLong() {
        assertEquals(null, this.jMetaDataText.getSourceDurationAsLong());
        System.out.println("Source Play time of the stream, in ms AS Long === " + jMetaDataText.getSourceDurationAsLong());
    }

   /**
    * Test getSourceDurationAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getSourceDurationAsLocalDateTime());
        System.out.println("Source Play time of the stream, in ms AS LocalDateTime === " + jMetaDataText.getSourceDurationAsLocalDateTime());
    }

   /**
    * Test getSourceDurationAsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getSourceDurationAsLocalTime());
        System.out.println("Source Play time of the stream, in ms AS LocalTime === " + jMetaDataText.getSourceDurationAsLocalTime());
    }

   /**
    * Test getSourceDurationAsString() method.
    */
    @Test
    public void subTestGetSourceDurationAsString() {
        assertEquals(null, this.jMetaDataText.getSourceDurationAsString());
        System.out.println("Source Play time of the stream, in ms AS String === " + jMetaDataText.getSourceDurationAsString());
    }

   /**
    * Test getSourceDurationAsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationAsBoolean() {
        assertEquals(null, this.jMetaDataText.getSourceDurationAsBoolean());
        System.out.println("Source Play time of the stream, in ms AS Boolean === " + jMetaDataText.getSourceDurationAsBoolean());
    }

   /**
    * Test getSourceDurationAsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getSourceDurationAsBigInteger());
        System.out.println("Source Play time of the stream, in ms AS BigInteger === " + jMetaDataText.getSourceDurationAsBigInteger());
    }

   /**
    * Test getSourceDurationAsURL() method.
    */
    @Test
    public void subTestGetSourceDurationAsURL() {
        assertEquals(null, this.jMetaDataText.getSourceDurationAsURL());
        System.out.println("Source Play time of the stream, in ms AS URL === " + jMetaDataText.getSourceDurationAsURL());
    }

   /**
    * Test getFrameRateModeAsInteger() method.
    */
    @Test
    public void subTestGetFrameRateModeAsInteger() {
        assertEquals(null, this.jMetaDataText.getFrameRateModeAsInteger());
        System.out.println("Frame rate mode (CFR, VFR) AS Integer === " + jMetaDataText.getFrameRateModeAsInteger());
    }

   /**
    * Test getFrameRateModeAsLong() method.
    */
    @Test
    public void subTestGetFrameRateModeAsLong() {
        assertEquals(null, this.jMetaDataText.getFrameRateModeAsLong());
        System.out.println("Frame rate mode (CFR, VFR) AS Long === " + jMetaDataText.getFrameRateModeAsLong());
    }

   /**
    * Test getFrameRateModeAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFrameRateModeAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getFrameRateModeAsLocalDateTime());
        System.out.println("Frame rate mode (CFR, VFR) AS LocalDateTime === " + jMetaDataText.getFrameRateModeAsLocalDateTime());
    }

   /**
    * Test getFrameRateModeAsLocalTime() method.
    */
    @Test
    public void subTestGetFrameRateModeAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getFrameRateModeAsLocalTime());
        System.out.println("Frame rate mode (CFR, VFR) AS LocalTime === " + jMetaDataText.getFrameRateModeAsLocalTime());
    }

   /**
    * Test getFrameRateModeAsString() method.
    */
    @Test
    public void subTestGetFrameRateModeAsString() {
        assertEquals(null, this.jMetaDataText.getFrameRateModeAsString());
        System.out.println("Frame rate mode (CFR, VFR) AS String === " + jMetaDataText.getFrameRateModeAsString());
    }

   /**
    * Test getFrameRateModeAsBoolean() method.
    */
    @Test
    public void subTestGetFrameRateModeAsBoolean() {
        assertEquals(null, this.jMetaDataText.getFrameRateModeAsBoolean());
        System.out.println("Frame rate mode (CFR, VFR) AS Boolean === " + jMetaDataText.getFrameRateModeAsBoolean());
    }

   /**
    * Test getFrameRateModeAsBigInteger() method.
    */
    @Test
    public void subTestGetFrameRateModeAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getFrameRateModeAsBigInteger());
        System.out.println("Frame rate mode (CFR, VFR) AS BigInteger === " + jMetaDataText.getFrameRateModeAsBigInteger());
    }

   /**
    * Test getFrameRateModeAsURL() method.
    */
    @Test
    public void subTestGetFrameRateModeAsURL() {
        assertEquals(null, this.jMetaDataText.getFrameRateModeAsURL());
        System.out.println("Frame rate mode (CFR, VFR) AS URL === " + jMetaDataText.getFrameRateModeAsURL());
    }

   /**
    * Test getDelayOriginalString1AsInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalString1AsInteger() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalString1AsInteger());
        System.out.println("Delay with measurement AS Integer === " + jMetaDataText.getDelayOriginalString1AsInteger());
    }

   /**
    * Test getDelayOriginalString1AsLong() method.
    */
    @Test
    public void subTestGetDelayOriginalString1AsLong() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalString1AsLong());
        System.out.println("Delay with measurement AS Long === " + jMetaDataText.getDelayOriginalString1AsLong());
    }

   /**
    * Test getDelayOriginalString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayOriginalString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalString1AsLocalDateTime());
        System.out.println("Delay with measurement AS LocalDateTime === " + jMetaDataText.getDelayOriginalString1AsLocalDateTime());
    }

   /**
    * Test getDelayOriginalString1AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayOriginalString1AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalString1AsLocalTime());
        System.out.println("Delay with measurement AS LocalTime === " + jMetaDataText.getDelayOriginalString1AsLocalTime());
    }

   /**
    * Test getDelayOriginalString1AsString() method.
    */
    @Test
    public void subTestGetDelayOriginalString1AsString() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalString1AsString());
        System.out.println("Delay with measurement AS String === " + jMetaDataText.getDelayOriginalString1AsString());
    }

   /**
    * Test getDelayOriginalString1AsBoolean() method.
    */
    @Test
    public void subTestGetDelayOriginalString1AsBoolean() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalString1AsBoolean());
        System.out.println("Delay with measurement AS Boolean === " + jMetaDataText.getDelayOriginalString1AsBoolean());
    }

   /**
    * Test getDelayOriginalString1AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalString1AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalString1AsBigInteger());
        System.out.println("Delay with measurement AS BigInteger === " + jMetaDataText.getDelayOriginalString1AsBigInteger());
    }

   /**
    * Test getDelayOriginalString1AsURL() method.
    */
    @Test
    public void subTestGetDelayOriginalString1AsURL() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalString1AsURL());
        System.out.println("Delay with measurement AS URL === " + jMetaDataText.getDelayOriginalString1AsURL());
    }

   /**
    * Test getCountAsInteger() method.
    */
    @Test
    public void subTestGetCountAsInteger() {
        assertEquals(null, this.jMetaDataText.getCountAsInteger());
        System.out.println("Count of objects available in this stream AS Integer === " + jMetaDataText.getCountAsInteger());
    }

   /**
    * Test getCountAsLong() method.
    */
    @Test
    public void subTestGetCountAsLong() {
        assertEquals(null, this.jMetaDataText.getCountAsLong());
        System.out.println("Count of objects available in this stream AS Long === " + jMetaDataText.getCountAsLong());
    }

   /**
    * Test getCountAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCountAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getCountAsLocalDateTime());
        System.out.println("Count of objects available in this stream AS LocalDateTime === " + jMetaDataText.getCountAsLocalDateTime());
    }

   /**
    * Test getCountAsLocalTime() method.
    */
    @Test
    public void subTestGetCountAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getCountAsLocalTime());
        System.out.println("Count of objects available in this stream AS LocalTime === " + jMetaDataText.getCountAsLocalTime());
    }

   /**
    * Test getCountAsString() method.
    */
    @Test
    public void subTestGetCountAsString() {
        assertEquals(null, this.jMetaDataText.getCountAsString());
        System.out.println("Count of objects available in this stream AS String === " + jMetaDataText.getCountAsString());
    }

   /**
    * Test getCountAsBoolean() method.
    */
    @Test
    public void subTestGetCountAsBoolean() {
        assertEquals(null, this.jMetaDataText.getCountAsBoolean());
        System.out.println("Count of objects available in this stream AS Boolean === " + jMetaDataText.getCountAsBoolean());
    }

   /**
    * Test getCountAsBigInteger() method.
    */
    @Test
    public void subTestGetCountAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getCountAsBigInteger());
        System.out.println("Count of objects available in this stream AS BigInteger === " + jMetaDataText.getCountAsBigInteger());
    }

   /**
    * Test getCountAsURL() method.
    */
    @Test
    public void subTestGetCountAsURL() {
        assertEquals(null, this.jMetaDataText.getCountAsURL());
        System.out.println("Count of objects available in this stream AS URL === " + jMetaDataText.getCountAsURL());
    }

   /**
    * Test getFormatSettingsWrappingAsInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsWrappingAsInteger() {
        assertEquals(null, this.jMetaDataText.getFormatSettingsWrappingAsInteger());
        System.out.println("Wrapping mode (Frame wrapped or Clip wrapped) AS Integer === " + jMetaDataText.getFormatSettingsWrappingAsInteger());
    }

   /**
    * Test getFormatSettingsWrappingAsLong() method.
    */
    @Test
    public void subTestGetFormatSettingsWrappingAsLong() {
        assertEquals(null, this.jMetaDataText.getFormatSettingsWrappingAsLong());
        System.out.println("Wrapping mode (Frame wrapped or Clip wrapped) AS Long === " + jMetaDataText.getFormatSettingsWrappingAsLong());
    }

   /**
    * Test getFormatSettingsWrappingAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatSettingsWrappingAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getFormatSettingsWrappingAsLocalDateTime());
        System.out.println("Wrapping mode (Frame wrapped or Clip wrapped) AS LocalDateTime === " + jMetaDataText.getFormatSettingsWrappingAsLocalDateTime());
    }

   /**
    * Test getFormatSettingsWrappingAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatSettingsWrappingAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getFormatSettingsWrappingAsLocalTime());
        System.out.println("Wrapping mode (Frame wrapped or Clip wrapped) AS LocalTime === " + jMetaDataText.getFormatSettingsWrappingAsLocalTime());
    }

   /**
    * Test getFormatSettingsWrappingAsString() method.
    */
    @Test
    public void subTestGetFormatSettingsWrappingAsString() {
        assertEquals(null, this.jMetaDataText.getFormatSettingsWrappingAsString());
        System.out.println("Wrapping mode (Frame wrapped or Clip wrapped) AS String === " + jMetaDataText.getFormatSettingsWrappingAsString());
    }

   /**
    * Test getFormatSettingsWrappingAsBoolean() method.
    */
    @Test
    public void subTestGetFormatSettingsWrappingAsBoolean() {
        assertEquals(null, this.jMetaDataText.getFormatSettingsWrappingAsBoolean());
        System.out.println("Wrapping mode (Frame wrapped or Clip wrapped) AS Boolean === " + jMetaDataText.getFormatSettingsWrappingAsBoolean());
    }

   /**
    * Test getFormatSettingsWrappingAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsWrappingAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getFormatSettingsWrappingAsBigInteger());
        System.out.println("Wrapping mode (Frame wrapped or Clip wrapped) AS BigInteger === " + jMetaDataText.getFormatSettingsWrappingAsBigInteger());
    }

   /**
    * Test getFormatSettingsWrappingAsURL() method.
    */
    @Test
    public void subTestGetFormatSettingsWrappingAsURL() {
        assertEquals(null, this.jMetaDataText.getFormatSettingsWrappingAsURL());
        System.out.println("Wrapping mode (Frame wrapped or Clip wrapped) AS URL === " + jMetaDataText.getFormatSettingsWrappingAsURL());
    }

   /**
    * Test getDelayOriginalString2AsInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalString2AsInteger() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalString2AsInteger());
        System.out.println("Delay with measurement AS Integer === " + jMetaDataText.getDelayOriginalString2AsInteger());
    }

   /**
    * Test getDelayOriginalString2AsLong() method.
    */
    @Test
    public void subTestGetDelayOriginalString2AsLong() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalString2AsLong());
        System.out.println("Delay with measurement AS Long === " + jMetaDataText.getDelayOriginalString2AsLong());
    }

   /**
    * Test getDelayOriginalString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayOriginalString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalString2AsLocalDateTime());
        System.out.println("Delay with measurement AS LocalDateTime === " + jMetaDataText.getDelayOriginalString2AsLocalDateTime());
    }

   /**
    * Test getDelayOriginalString2AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayOriginalString2AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalString2AsLocalTime());
        System.out.println("Delay with measurement AS LocalTime === " + jMetaDataText.getDelayOriginalString2AsLocalTime());
    }

   /**
    * Test getDelayOriginalString2AsString() method.
    */
    @Test
    public void subTestGetDelayOriginalString2AsString() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalString2AsString());
        System.out.println("Delay with measurement AS String === " + jMetaDataText.getDelayOriginalString2AsString());
    }

   /**
    * Test getDelayOriginalString2AsBoolean() method.
    */
    @Test
    public void subTestGetDelayOriginalString2AsBoolean() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalString2AsBoolean());
        System.out.println("Delay with measurement AS Boolean === " + jMetaDataText.getDelayOriginalString2AsBoolean());
    }

   /**
    * Test getDelayOriginalString2AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalString2AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalString2AsBigInteger());
        System.out.println("Delay with measurement AS BigInteger === " + jMetaDataText.getDelayOriginalString2AsBigInteger());
    }

   /**
    * Test getDelayOriginalString2AsURL() method.
    */
    @Test
    public void subTestGetDelayOriginalString2AsURL() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalString2AsURL());
        System.out.println("Delay with measurement AS URL === " + jMetaDataText.getDelayOriginalString2AsURL());
    }

   /**
    * Test getEncryptionAsInteger() method.
    */
    @Test
    public void subTestGetEncryptionAsInteger() {
        assertEquals(null, this.jMetaDataText.getEncryptionAsInteger());
        System.out.println("Encryption AS Integer === " + jMetaDataText.getEncryptionAsInteger());
    }

   /**
    * Test getEncryptionAsLong() method.
    */
    @Test
    public void subTestGetEncryptionAsLong() {
        assertEquals(null, this.jMetaDataText.getEncryptionAsLong());
        System.out.println("Encryption AS Long === " + jMetaDataText.getEncryptionAsLong());
    }

   /**
    * Test getEncryptionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncryptionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getEncryptionAsLocalDateTime());
        System.out.println("Encryption AS LocalDateTime === " + jMetaDataText.getEncryptionAsLocalDateTime());
    }

   /**
    * Test getEncryptionAsLocalTime() method.
    */
    @Test
    public void subTestGetEncryptionAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getEncryptionAsLocalTime());
        System.out.println("Encryption AS LocalTime === " + jMetaDataText.getEncryptionAsLocalTime());
    }

   /**
    * Test getEncryptionAsString() method.
    */
    @Test
    public void subTestGetEncryptionAsString() {
        assertEquals(null, this.jMetaDataText.getEncryptionAsString());
        System.out.println("Encryption AS String === " + jMetaDataText.getEncryptionAsString());
    }

   /**
    * Test getEncryptionAsBoolean() method.
    */
    @Test
    public void subTestGetEncryptionAsBoolean() {
        assertEquals(null, this.jMetaDataText.getEncryptionAsBoolean());
        System.out.println("Encryption AS Boolean === " + jMetaDataText.getEncryptionAsBoolean());
    }

   /**
    * Test getEncryptionAsBigInteger() method.
    */
    @Test
    public void subTestGetEncryptionAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getEncryptionAsBigInteger());
        System.out.println("Encryption AS BigInteger === " + jMetaDataText.getEncryptionAsBigInteger());
    }

   /**
    * Test getEncryptionAsURL() method.
    */
    @Test
    public void subTestGetEncryptionAsURL() {
        assertEquals(null, this.jMetaDataText.getEncryptionAsURL());
        System.out.println("Encryption AS URL === " + jMetaDataText.getEncryptionAsURL());
    }

   /**
    * Test getDelayOriginalAsInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalAsInteger() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalAsInteger());
        System.out.println("Delay fixed in the raw stream (relative) IN MS AS Integer === " + jMetaDataText.getDelayOriginalAsInteger());
    }

   /**
    * Test getDelayOriginalAsLong() method.
    */
    @Test
    public void subTestGetDelayOriginalAsLong() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalAsLong());
        System.out.println("Delay fixed in the raw stream (relative) IN MS AS Long === " + jMetaDataText.getDelayOriginalAsLong());
    }

   /**
    * Test getDelayOriginalAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayOriginalAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalAsLocalDateTime());
        System.out.println("Delay fixed in the raw stream (relative) IN MS AS LocalDateTime === " + jMetaDataText.getDelayOriginalAsLocalDateTime());
    }

   /**
    * Test getDelayOriginalAsLocalTime() method.
    */
    @Test
    public void subTestGetDelayOriginalAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalAsLocalTime());
        System.out.println("Delay fixed in the raw stream (relative) IN MS AS LocalTime === " + jMetaDataText.getDelayOriginalAsLocalTime());
    }

   /**
    * Test getDelayOriginalAsString() method.
    */
    @Test
    public void subTestGetDelayOriginalAsString() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalAsString());
        System.out.println("Delay fixed in the raw stream (relative) IN MS AS String === " + jMetaDataText.getDelayOriginalAsString());
    }

   /**
    * Test getDelayOriginalAsBoolean() method.
    */
    @Test
    public void subTestGetDelayOriginalAsBoolean() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalAsBoolean());
        System.out.println("Delay fixed in the raw stream (relative) IN MS AS Boolean === " + jMetaDataText.getDelayOriginalAsBoolean());
    }

   /**
    * Test getDelayOriginalAsBigInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalAsBigInteger());
        System.out.println("Delay fixed in the raw stream (relative) IN MS AS BigInteger === " + jMetaDataText.getDelayOriginalAsBigInteger());
    }

   /**
    * Test getDelayOriginalAsURL() method.
    */
    @Test
    public void subTestGetDelayOriginalAsURL() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalAsURL());
        System.out.println("Delay fixed in the raw stream (relative) IN MS AS URL === " + jMetaDataText.getDelayOriginalAsURL());
    }

   /**
    * Test getFrameRateNumAsInteger() method.
    */
    @Test
    public void subTestGetFrameRateNumAsInteger() {
        assertEquals(null, this.jMetaDataText.getFrameRateNumAsInteger());
        System.out.println("Frames per second, numerator AS Integer === " + jMetaDataText.getFrameRateNumAsInteger());
    }

   /**
    * Test getFrameRateNumAsLong() method.
    */
    @Test
    public void subTestGetFrameRateNumAsLong() {
        assertEquals(null, this.jMetaDataText.getFrameRateNumAsLong());
        System.out.println("Frames per second, numerator AS Long === " + jMetaDataText.getFrameRateNumAsLong());
    }

   /**
    * Test getFrameRateNumAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFrameRateNumAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getFrameRateNumAsLocalDateTime());
        System.out.println("Frames per second, numerator AS LocalDateTime === " + jMetaDataText.getFrameRateNumAsLocalDateTime());
    }

   /**
    * Test getFrameRateNumAsLocalTime() method.
    */
    @Test
    public void subTestGetFrameRateNumAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getFrameRateNumAsLocalTime());
        System.out.println("Frames per second, numerator AS LocalTime === " + jMetaDataText.getFrameRateNumAsLocalTime());
    }

   /**
    * Test getFrameRateNumAsString() method.
    */
    @Test
    public void subTestGetFrameRateNumAsString() {
        assertEquals(null, this.jMetaDataText.getFrameRateNumAsString());
        System.out.println("Frames per second, numerator AS String === " + jMetaDataText.getFrameRateNumAsString());
    }

   /**
    * Test getFrameRateNumAsBoolean() method.
    */
    @Test
    public void subTestGetFrameRateNumAsBoolean() {
        assertEquals(null, this.jMetaDataText.getFrameRateNumAsBoolean());
        System.out.println("Frames per second, numerator AS Boolean === " + jMetaDataText.getFrameRateNumAsBoolean());
    }

   /**
    * Test getFrameRateNumAsBigInteger() method.
    */
    @Test
    public void subTestGetFrameRateNumAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getFrameRateNumAsBigInteger());
        System.out.println("Frames per second, numerator AS BigInteger === " + jMetaDataText.getFrameRateNumAsBigInteger());
    }

   /**
    * Test getFrameRateNumAsURL() method.
    */
    @Test
    public void subTestGetFrameRateNumAsURL() {
        assertEquals(null, this.jMetaDataText.getFrameRateNumAsURL());
        System.out.println("Frames per second, numerator AS URL === " + jMetaDataText.getFrameRateNumAsURL());
    }

   /**
    * Test getFormatVersionAsInteger() method.
    */
    @Test
    public void subTestGetFormatVersionAsInteger() {
        assertEquals(null, this.jMetaDataText.getFormatVersionAsInteger());
        System.out.println("Version of this format AS Integer === " + jMetaDataText.getFormatVersionAsInteger());
    }

   /**
    * Test getFormatVersionAsLong() method.
    */
    @Test
    public void subTestGetFormatVersionAsLong() {
        assertEquals(null, this.jMetaDataText.getFormatVersionAsLong());
        System.out.println("Version of this format AS Long === " + jMetaDataText.getFormatVersionAsLong());
    }

   /**
    * Test getFormatVersionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatVersionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getFormatVersionAsLocalDateTime());
        System.out.println("Version of this format AS LocalDateTime === " + jMetaDataText.getFormatVersionAsLocalDateTime());
    }

   /**
    * Test getFormatVersionAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatVersionAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getFormatVersionAsLocalTime());
        System.out.println("Version of this format AS LocalTime === " + jMetaDataText.getFormatVersionAsLocalTime());
    }

   /**
    * Test getFormatVersionAsString() method.
    */
    @Test
    public void subTestGetFormatVersionAsString() {
        assertEquals(null, this.jMetaDataText.getFormatVersionAsString());
        System.out.println("Version of this format AS String === " + jMetaDataText.getFormatVersionAsString());
    }

   /**
    * Test getFormatVersionAsBoolean() method.
    */
    @Test
    public void subTestGetFormatVersionAsBoolean() {
        assertEquals(null, this.jMetaDataText.getFormatVersionAsBoolean());
        System.out.println("Version of this format AS Boolean === " + jMetaDataText.getFormatVersionAsBoolean());
    }

   /**
    * Test getFormatVersionAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatVersionAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getFormatVersionAsBigInteger());
        System.out.println("Version of this format AS BigInteger === " + jMetaDataText.getFormatVersionAsBigInteger());
    }

   /**
    * Test getFormatVersionAsURL() method.
    */
    @Test
    public void subTestGetFormatVersionAsURL() {
        assertEquals(null, this.jMetaDataText.getFormatVersionAsURL());
        System.out.println("Version of this format AS URL === " + jMetaDataText.getFormatVersionAsURL());
    }

   /**
    * Test getStreamKindPosAsInteger() method.
    */
    @Test
    public void subTestGetStreamKindPosAsInteger() {
        assertEquals(null, this.jMetaDataText.getStreamKindPosAsInteger());
        System.out.println("When multiple streams, number of the stream (base=1) AS Integer === " + jMetaDataText.getStreamKindPosAsInteger());
    }

   /**
    * Test getStreamKindPosAsLong() method.
    */
    @Test
    public void subTestGetStreamKindPosAsLong() {
        assertEquals(null, this.jMetaDataText.getStreamKindPosAsLong());
        System.out.println("When multiple streams, number of the stream (base=1) AS Long === " + jMetaDataText.getStreamKindPosAsLong());
    }

   /**
    * Test getStreamKindPosAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamKindPosAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getStreamKindPosAsLocalDateTime());
        System.out.println("When multiple streams, number of the stream (base=1) AS LocalDateTime === " + jMetaDataText.getStreamKindPosAsLocalDateTime());
    }

   /**
    * Test getStreamKindPosAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamKindPosAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getStreamKindPosAsLocalTime());
        System.out.println("When multiple streams, number of the stream (base=1) AS LocalTime === " + jMetaDataText.getStreamKindPosAsLocalTime());
    }

   /**
    * Test getStreamKindPosAsString() method.
    */
    @Test
    public void subTestGetStreamKindPosAsString() {
        assertEquals(null, this.jMetaDataText.getStreamKindPosAsString());
        System.out.println("When multiple streams, number of the stream (base=1) AS String === " + jMetaDataText.getStreamKindPosAsString());
    }

   /**
    * Test getStreamKindPosAsBoolean() method.
    */
    @Test
    public void subTestGetStreamKindPosAsBoolean() {
        assertEquals(null, this.jMetaDataText.getStreamKindPosAsBoolean());
        System.out.println("When multiple streams, number of the stream (base=1) AS Boolean === " + jMetaDataText.getStreamKindPosAsBoolean());
    }

   /**
    * Test getStreamKindPosAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamKindPosAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getStreamKindPosAsBigInteger());
        System.out.println("When multiple streams, number of the stream (base=1) AS BigInteger === " + jMetaDataText.getStreamKindPosAsBigInteger());
    }

   /**
    * Test getStreamKindPosAsURL() method.
    */
    @Test
    public void subTestGetStreamKindPosAsURL() {
        assertEquals(null, this.jMetaDataText.getStreamKindPosAsURL());
        System.out.println("When multiple streams, number of the stream (base=1) AS URL === " + jMetaDataText.getStreamKindPosAsURL());
    }

   /**
    * Test getOriginalSourceMediumIDAsInteger() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsInteger() {
        assertEquals(null, this.jMetaDataText.getOriginalSourceMediumIDAsInteger());
        System.out.println("The ID for this stream in the original medium of the material AS Integer === " + jMetaDataText.getOriginalSourceMediumIDAsInteger());
    }

   /**
    * Test getOriginalSourceMediumIDAsLong() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsLong() {
        assertEquals(null, this.jMetaDataText.getOriginalSourceMediumIDAsLong());
        System.out.println("The ID for this stream in the original medium of the material AS Long === " + jMetaDataText.getOriginalSourceMediumIDAsLong());
    }

   /**
    * Test getOriginalSourceMediumIDAsLocalDateTime() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getOriginalSourceMediumIDAsLocalDateTime());
        System.out.println("The ID for this stream in the original medium of the material AS LocalDateTime === " + jMetaDataText.getOriginalSourceMediumIDAsLocalDateTime());
    }

   /**
    * Test getOriginalSourceMediumIDAsLocalTime() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getOriginalSourceMediumIDAsLocalTime());
        System.out.println("The ID for this stream in the original medium of the material AS LocalTime === " + jMetaDataText.getOriginalSourceMediumIDAsLocalTime());
    }

   /**
    * Test getOriginalSourceMediumIDAsString() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsString() {
        assertEquals(null, this.jMetaDataText.getOriginalSourceMediumIDAsString());
        System.out.println("The ID for this stream in the original medium of the material AS String === " + jMetaDataText.getOriginalSourceMediumIDAsString());
    }

   /**
    * Test getOriginalSourceMediumIDAsBoolean() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsBoolean() {
        assertEquals(null, this.jMetaDataText.getOriginalSourceMediumIDAsBoolean());
        System.out.println("The ID for this stream in the original medium of the material AS Boolean === " + jMetaDataText.getOriginalSourceMediumIDAsBoolean());
    }

   /**
    * Test getOriginalSourceMediumIDAsBigInteger() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getOriginalSourceMediumIDAsBigInteger());
        System.out.println("The ID for this stream in the original medium of the material AS BigInteger === " + jMetaDataText.getOriginalSourceMediumIDAsBigInteger());
    }

   /**
    * Test getOriginalSourceMediumIDAsURL() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsURL() {
        assertEquals(null, this.jMetaDataText.getOriginalSourceMediumIDAsURL());
        System.out.println("The ID for this stream in the original medium of the material AS URL === " + jMetaDataText.getOriginalSourceMediumIDAsURL());
    }

   /**
    * Test getDurationStringAsInteger() method.
    */
    @Test
    public void subTestGetDurationStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getDurationStringAsInteger());
        System.out.println("Play time (formated) AS Integer === " + jMetaDataText.getDurationStringAsInteger());
    }

   /**
    * Test getDurationStringAsLong() method.
    */
    @Test
    public void subTestGetDurationStringAsLong() {
        assertEquals(null, this.jMetaDataText.getDurationStringAsLong());
        System.out.println("Play time (formated) AS Long === " + jMetaDataText.getDurationStringAsLong());
    }

   /**
    * Test getDurationStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDurationStringAsLocalDateTime());
        System.out.println("Play time (formated) AS LocalDateTime === " + jMetaDataText.getDurationStringAsLocalDateTime());
    }

   /**
    * Test getDurationStringAsLocalTime() method.
    */
    @Test
    public void subTestGetDurationStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDurationStringAsLocalTime());
        System.out.println("Play time (formated) AS LocalTime === " + jMetaDataText.getDurationStringAsLocalTime());
    }

   /**
    * Test getDurationStringAsString() method.
    */
    @Test
    public void subTestGetDurationStringAsString() {
        assertEquals(null, this.jMetaDataText.getDurationStringAsString());
        System.out.println("Play time (formated) AS String === " + jMetaDataText.getDurationStringAsString());
    }

   /**
    * Test getDurationStringAsBoolean() method.
    */
    @Test
    public void subTestGetDurationStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getDurationStringAsBoolean());
        System.out.println("Play time (formated) AS Boolean === " + jMetaDataText.getDurationStringAsBoolean());
    }

   /**
    * Test getDurationStringAsBigInteger() method.
    */
    @Test
    public void subTestGetDurationStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDurationStringAsBigInteger());
        System.out.println("Play time (formated) AS BigInteger === " + jMetaDataText.getDurationStringAsBigInteger());
    }

   /**
    * Test getDurationStringAsURL() method.
    */
    @Test
    public void subTestGetDurationStringAsURL() {
        assertEquals(null, this.jMetaDataText.getDurationStringAsURL());
        System.out.println("Play time (formated) AS URL === " + jMetaDataText.getDurationStringAsURL());
    }

   /**
    * Test getIDAsInteger() method.
    */
    @Test
    public void subTestGetIDAsInteger() {
        assertEquals(null, this.jMetaDataText.getIDAsInteger());
        System.out.println("The ID for this stream in this file AS Integer === " + jMetaDataText.getIDAsInteger());
    }

   /**
    * Test getIDAsLong() method.
    */
    @Test
    public void subTestGetIDAsLong() {
        assertEquals(null, this.jMetaDataText.getIDAsLong());
        System.out.println("The ID for this stream in this file AS Long === " + jMetaDataText.getIDAsLong());
    }

   /**
    * Test getIDAsLocalDateTime() method.
    */
    @Test
    public void subTestGetIDAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getIDAsLocalDateTime());
        System.out.println("The ID for this stream in this file AS LocalDateTime === " + jMetaDataText.getIDAsLocalDateTime());
    }

   /**
    * Test getIDAsLocalTime() method.
    */
    @Test
    public void subTestGetIDAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getIDAsLocalTime());
        System.out.println("The ID for this stream in this file AS LocalTime === " + jMetaDataText.getIDAsLocalTime());
    }

   /**
    * Test getIDAsString() method.
    */
    @Test
    public void subTestGetIDAsString() {
        assertEquals(null, this.jMetaDataText.getIDAsString());
        System.out.println("The ID for this stream in this file AS String === " + jMetaDataText.getIDAsString());
    }

   /**
    * Test getIDAsBoolean() method.
    */
    @Test
    public void subTestGetIDAsBoolean() {
        assertEquals(null, this.jMetaDataText.getIDAsBoolean());
        System.out.println("The ID for this stream in this file AS Boolean === " + jMetaDataText.getIDAsBoolean());
    }

   /**
    * Test getIDAsBigInteger() method.
    */
    @Test
    public void subTestGetIDAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getIDAsBigInteger());
        System.out.println("The ID for this stream in this file AS BigInteger === " + jMetaDataText.getIDAsBigInteger());
    }

   /**
    * Test getIDAsURL() method.
    */
    @Test
    public void subTestGetIDAsURL() {
        assertEquals(null, this.jMetaDataText.getIDAsURL());
        System.out.println("The ID for this stream in this file AS URL === " + jMetaDataText.getIDAsURL());
    }

   /**
    * Test getVideoDelayAsInteger() method.
    */
    @Test
    public void subTestGetVideoDelayAsInteger() {
        assertEquals(null, this.jMetaDataText.getVideoDelayAsInteger());
        System.out.println("Delay fixed in the stream (absolute / video) AS Integer === " + jMetaDataText.getVideoDelayAsInteger());
    }

   /**
    * Test getVideoDelayAsLong() method.
    */
    @Test
    public void subTestGetVideoDelayAsLong() {
        assertEquals(null, this.jMetaDataText.getVideoDelayAsLong());
        System.out.println("Delay fixed in the stream (absolute / video) AS Long === " + jMetaDataText.getVideoDelayAsLong());
    }

   /**
    * Test getVideoDelayAsLocalDateTime() method.
    */
    @Test
    public void subTestGetVideoDelayAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getVideoDelayAsLocalDateTime());
        System.out.println("Delay fixed in the stream (absolute / video) AS LocalDateTime === " + jMetaDataText.getVideoDelayAsLocalDateTime());
    }

   /**
    * Test getVideoDelayAsLocalTime() method.
    */
    @Test
    public void subTestGetVideoDelayAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getVideoDelayAsLocalTime());
        System.out.println("Delay fixed in the stream (absolute / video) AS LocalTime === " + jMetaDataText.getVideoDelayAsLocalTime());
    }

   /**
    * Test getVideoDelayAsString() method.
    */
    @Test
    public void subTestGetVideoDelayAsString() {
        assertEquals(null, this.jMetaDataText.getVideoDelayAsString());
        System.out.println("Delay fixed in the stream (absolute / video) AS String === " + jMetaDataText.getVideoDelayAsString());
    }

   /**
    * Test getVideoDelayAsBoolean() method.
    */
    @Test
    public void subTestGetVideoDelayAsBoolean() {
        assertEquals(null, this.jMetaDataText.getVideoDelayAsBoolean());
        System.out.println("Delay fixed in the stream (absolute / video) AS Boolean === " + jMetaDataText.getVideoDelayAsBoolean());
    }

   /**
    * Test getVideoDelayAsBigInteger() method.
    */
    @Test
    public void subTestGetVideoDelayAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getVideoDelayAsBigInteger());
        System.out.println("Delay fixed in the stream (absolute / video) AS BigInteger === " + jMetaDataText.getVideoDelayAsBigInteger());
    }

   /**
    * Test getVideoDelayAsURL() method.
    */
    @Test
    public void subTestGetVideoDelayAsURL() {
        assertEquals(null, this.jMetaDataText.getVideoDelayAsURL());
        System.out.println("Delay fixed in the stream (absolute / video) AS URL === " + jMetaDataText.getVideoDelayAsURL());
    }

   /**
    * Test getEncodedLibraryDateAsInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryDateAsInteger() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryDateAsInteger());
        System.out.println("Release date of software AS Integer === " + jMetaDataText.getEncodedLibraryDateAsInteger());
    }

   /**
    * Test getEncodedLibraryDateAsLong() method.
    */
    @Test
    public void subTestGetEncodedLibraryDateAsLong() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryDateAsLong());
        System.out.println("Release date of software AS Long === " + jMetaDataText.getEncodedLibraryDateAsLong());
    }

   /**
    * Test getEncodedLibraryDateAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryDateAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryDateAsLocalDateTime());
        System.out.println("Release date of software AS LocalDateTime === " + jMetaDataText.getEncodedLibraryDateAsLocalDateTime());
    }

   /**
    * Test getEncodedLibraryDateAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryDateAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryDateAsLocalTime());
        System.out.println("Release date of software AS LocalTime === " + jMetaDataText.getEncodedLibraryDateAsLocalTime());
    }

   /**
    * Test getEncodedLibraryDateAsString() method.
    */
    @Test
    public void subTestGetEncodedLibraryDateAsString() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryDateAsString());
        System.out.println("Release date of software AS String === " + jMetaDataText.getEncodedLibraryDateAsString());
    }

   /**
    * Test getEncodedLibraryDateAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedLibraryDateAsBoolean() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryDateAsBoolean());
        System.out.println("Release date of software AS Boolean === " + jMetaDataText.getEncodedLibraryDateAsBoolean());
    }

   /**
    * Test getEncodedLibraryDateAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryDateAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryDateAsBigInteger());
        System.out.println("Release date of software AS BigInteger === " + jMetaDataText.getEncodedLibraryDateAsBigInteger());
    }

   /**
    * Test getEncodedLibraryDateAsURL() method.
    */
    @Test
    public void subTestGetEncodedLibraryDateAsURL() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryDateAsURL());
        System.out.println("Release date of software AS URL === " + jMetaDataText.getEncodedLibraryDateAsURL());
    }

   /**
    * Test getMenuIDStringAsInteger() method.
    */
    @Test
    public void subTestGetMenuIDStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getMenuIDStringAsInteger());
        System.out.println("The menu ID for this stream in this file AS Integer === " + jMetaDataText.getMenuIDStringAsInteger());
    }

   /**
    * Test getMenuIDStringAsLong() method.
    */
    @Test
    public void subTestGetMenuIDStringAsLong() {
        assertEquals(null, this.jMetaDataText.getMenuIDStringAsLong());
        System.out.println("The menu ID for this stream in this file AS Long === " + jMetaDataText.getMenuIDStringAsLong());
    }

   /**
    * Test getMenuIDStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetMenuIDStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getMenuIDStringAsLocalDateTime());
        System.out.println("The menu ID for this stream in this file AS LocalDateTime === " + jMetaDataText.getMenuIDStringAsLocalDateTime());
    }

   /**
    * Test getMenuIDStringAsLocalTime() method.
    */
    @Test
    public void subTestGetMenuIDStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getMenuIDStringAsLocalTime());
        System.out.println("The menu ID for this stream in this file AS LocalTime === " + jMetaDataText.getMenuIDStringAsLocalTime());
    }

   /**
    * Test getMenuIDStringAsString() method.
    */
    @Test
    public void subTestGetMenuIDStringAsString() {
        assertEquals(null, this.jMetaDataText.getMenuIDStringAsString());
        System.out.println("The menu ID for this stream in this file AS String === " + jMetaDataText.getMenuIDStringAsString());
    }

   /**
    * Test getMenuIDStringAsBoolean() method.
    */
    @Test
    public void subTestGetMenuIDStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getMenuIDStringAsBoolean());
        System.out.println("The menu ID for this stream in this file AS Boolean === " + jMetaDataText.getMenuIDStringAsBoolean());
    }

   /**
    * Test getMenuIDStringAsBigInteger() method.
    */
    @Test
    public void subTestGetMenuIDStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getMenuIDStringAsBigInteger());
        System.out.println("The menu ID for this stream in this file AS BigInteger === " + jMetaDataText.getMenuIDStringAsBigInteger());
    }

   /**
    * Test getMenuIDStringAsURL() method.
    */
    @Test
    public void subTestGetMenuIDStringAsURL() {
        assertEquals(null, this.jMetaDataText.getMenuIDStringAsURL());
        System.out.println("The menu ID for this stream in this file AS URL === " + jMetaDataText.getMenuIDStringAsURL());
    }

   /**
    * Test getLanguageMoreAsInteger() method.
    */
    @Test
    public void subTestGetLanguageMoreAsInteger() {
        assertEquals(null, this.jMetaDataText.getLanguageMoreAsInteger());
        System.out.println("More info about Language (e.g. Director's Comment) AS Integer === " + jMetaDataText.getLanguageMoreAsInteger());
    }

   /**
    * Test getLanguageMoreAsLong() method.
    */
    @Test
    public void subTestGetLanguageMoreAsLong() {
        assertEquals(null, this.jMetaDataText.getLanguageMoreAsLong());
        System.out.println("More info about Language (e.g. Director's Comment) AS Long === " + jMetaDataText.getLanguageMoreAsLong());
    }

   /**
    * Test getLanguageMoreAsLocalDateTime() method.
    */
    @Test
    public void subTestGetLanguageMoreAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getLanguageMoreAsLocalDateTime());
        System.out.println("More info about Language (e.g. Director's Comment) AS LocalDateTime === " + jMetaDataText.getLanguageMoreAsLocalDateTime());
    }

   /**
    * Test getLanguageMoreAsLocalTime() method.
    */
    @Test
    public void subTestGetLanguageMoreAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getLanguageMoreAsLocalTime());
        System.out.println("More info about Language (e.g. Director's Comment) AS LocalTime === " + jMetaDataText.getLanguageMoreAsLocalTime());
    }

   /**
    * Test getLanguageMoreAsString() method.
    */
    @Test
    public void subTestGetLanguageMoreAsString() {
        assertEquals(null, this.jMetaDataText.getLanguageMoreAsString());
        System.out.println("More info about Language (e.g. Director's Comment) AS String === " + jMetaDataText.getLanguageMoreAsString());
    }

   /**
    * Test getLanguageMoreAsBoolean() method.
    */
    @Test
    public void subTestGetLanguageMoreAsBoolean() {
        assertEquals(null, this.jMetaDataText.getLanguageMoreAsBoolean());
        System.out.println("More info about Language (e.g. Director's Comment) AS Boolean === " + jMetaDataText.getLanguageMoreAsBoolean());
    }

   /**
    * Test getLanguageMoreAsBigInteger() method.
    */
    @Test
    public void subTestGetLanguageMoreAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getLanguageMoreAsBigInteger());
        System.out.println("More info about Language (e.g. Director's Comment) AS BigInteger === " + jMetaDataText.getLanguageMoreAsBigInteger());
    }

   /**
    * Test getLanguageMoreAsURL() method.
    */
    @Test
    public void subTestGetLanguageMoreAsURL() {
        assertEquals(null, this.jMetaDataText.getLanguageMoreAsURL());
        System.out.println("More info about Language (e.g. Director's Comment) AS URL === " + jMetaDataText.getLanguageMoreAsURL());
    }

   /**
    * Test getSourceStreamSizeStringAsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeStringAsInteger());
        System.out.println("Source Streamsize in with percentage value AS Integer === " + jMetaDataText.getSourceStreamSizeStringAsInteger());
    }

   /**
    * Test getSourceStreamSizeStringAsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeStringAsLong() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeStringAsLong());
        System.out.println("Source Streamsize in with percentage value AS Long === " + jMetaDataText.getSourceStreamSizeStringAsLong());
    }

   /**
    * Test getSourceStreamSizeStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeStringAsLocalDateTime());
        System.out.println("Source Streamsize in with percentage value AS LocalDateTime === " + jMetaDataText.getSourceStreamSizeStringAsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeStringAsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeStringAsLocalTime());
        System.out.println("Source Streamsize in with percentage value AS LocalTime === " + jMetaDataText.getSourceStreamSizeStringAsLocalTime());
    }

   /**
    * Test getSourceStreamSizeStringAsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeStringAsString() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeStringAsString());
        System.out.println("Source Streamsize in with percentage value AS String === " + jMetaDataText.getSourceStreamSizeStringAsString());
    }

   /**
    * Test getSourceStreamSizeStringAsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeStringAsBoolean());
        System.out.println("Source Streamsize in with percentage value AS Boolean === " + jMetaDataText.getSourceStreamSizeStringAsBoolean());
    }

   /**
    * Test getSourceStreamSizeStringAsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeStringAsBigInteger());
        System.out.println("Source Streamsize in with percentage value AS BigInteger === " + jMetaDataText.getSourceStreamSizeStringAsBigInteger());
    }

   /**
    * Test getSourceStreamSizeStringAsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeStringAsURL() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeStringAsURL());
        System.out.println("Source Streamsize in with percentage value AS URL === " + jMetaDataText.getSourceStreamSizeStringAsURL());
    }

   /**
    * Test getFrameRateMaximumAsInteger() method.
    */
    @Test
    public void subTestGetFrameRateMaximumAsInteger() {
        assertEquals(null, this.jMetaDataText.getFrameRateMaximumAsInteger());
        System.out.println("Maximum Frames per second AS Integer === " + jMetaDataText.getFrameRateMaximumAsInteger());
    }

   /**
    * Test getFrameRateMaximumAsLong() method.
    */
    @Test
    public void subTestGetFrameRateMaximumAsLong() {
        assertEquals(null, this.jMetaDataText.getFrameRateMaximumAsLong());
        System.out.println("Maximum Frames per second AS Long === " + jMetaDataText.getFrameRateMaximumAsLong());
    }

   /**
    * Test getFrameRateMaximumAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFrameRateMaximumAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getFrameRateMaximumAsLocalDateTime());
        System.out.println("Maximum Frames per second AS LocalDateTime === " + jMetaDataText.getFrameRateMaximumAsLocalDateTime());
    }

   /**
    * Test getFrameRateMaximumAsLocalTime() method.
    */
    @Test
    public void subTestGetFrameRateMaximumAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getFrameRateMaximumAsLocalTime());
        System.out.println("Maximum Frames per second AS LocalTime === " + jMetaDataText.getFrameRateMaximumAsLocalTime());
    }

   /**
    * Test getFrameRateMaximumAsString() method.
    */
    @Test
    public void subTestGetFrameRateMaximumAsString() {
        assertEquals(null, this.jMetaDataText.getFrameRateMaximumAsString());
        System.out.println("Maximum Frames per second AS String === " + jMetaDataText.getFrameRateMaximumAsString());
    }

   /**
    * Test getFrameRateMaximumAsBoolean() method.
    */
    @Test
    public void subTestGetFrameRateMaximumAsBoolean() {
        assertEquals(null, this.jMetaDataText.getFrameRateMaximumAsBoolean());
        System.out.println("Maximum Frames per second AS Boolean === " + jMetaDataText.getFrameRateMaximumAsBoolean());
    }

   /**
    * Test getFrameRateMaximumAsBigInteger() method.
    */
    @Test
    public void subTestGetFrameRateMaximumAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getFrameRateMaximumAsBigInteger());
        System.out.println("Maximum Frames per second AS BigInteger === " + jMetaDataText.getFrameRateMaximumAsBigInteger());
    }

   /**
    * Test getFrameRateMaximumAsURL() method.
    */
    @Test
    public void subTestGetFrameRateMaximumAsURL() {
        assertEquals(null, this.jMetaDataText.getFrameRateMaximumAsURL());
        System.out.println("Maximum Frames per second AS URL === " + jMetaDataText.getFrameRateMaximumAsURL());
    }

   /**
    * Test getFrameRateOriginalAsInteger() method.
    */
    @Test
    public void subTestGetFrameRateOriginalAsInteger() {
        assertEquals(null, this.jMetaDataText.getFrameRateOriginalAsInteger());
        System.out.println("Original (in the raw stream) Frames per second AS Integer === " + jMetaDataText.getFrameRateOriginalAsInteger());
    }

   /**
    * Test getFrameRateOriginalAsLong() method.
    */
    @Test
    public void subTestGetFrameRateOriginalAsLong() {
        assertEquals(null, this.jMetaDataText.getFrameRateOriginalAsLong());
        System.out.println("Original (in the raw stream) Frames per second AS Long === " + jMetaDataText.getFrameRateOriginalAsLong());
    }

   /**
    * Test getFrameRateOriginalAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFrameRateOriginalAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getFrameRateOriginalAsLocalDateTime());
        System.out.println("Original (in the raw stream) Frames per second AS LocalDateTime === " + jMetaDataText.getFrameRateOriginalAsLocalDateTime());
    }

   /**
    * Test getFrameRateOriginalAsLocalTime() method.
    */
    @Test
    public void subTestGetFrameRateOriginalAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getFrameRateOriginalAsLocalTime());
        System.out.println("Original (in the raw stream) Frames per second AS LocalTime === " + jMetaDataText.getFrameRateOriginalAsLocalTime());
    }

   /**
    * Test getFrameRateOriginalAsString() method.
    */
    @Test
    public void subTestGetFrameRateOriginalAsString() {
        assertEquals(null, this.jMetaDataText.getFrameRateOriginalAsString());
        System.out.println("Original (in the raw stream) Frames per second AS String === " + jMetaDataText.getFrameRateOriginalAsString());
    }

   /**
    * Test getFrameRateOriginalAsBoolean() method.
    */
    @Test
    public void subTestGetFrameRateOriginalAsBoolean() {
        assertEquals(null, this.jMetaDataText.getFrameRateOriginalAsBoolean());
        System.out.println("Original (in the raw stream) Frames per second AS Boolean === " + jMetaDataText.getFrameRateOriginalAsBoolean());
    }

   /**
    * Test getFrameRateOriginalAsBigInteger() method.
    */
    @Test
    public void subTestGetFrameRateOriginalAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getFrameRateOriginalAsBigInteger());
        System.out.println("Original (in the raw stream) Frames per second AS BigInteger === " + jMetaDataText.getFrameRateOriginalAsBigInteger());
    }

   /**
    * Test getFrameRateOriginalAsURL() method.
    */
    @Test
    public void subTestGetFrameRateOriginalAsURL() {
        assertEquals(null, this.jMetaDataText.getFrameRateOriginalAsURL());
        System.out.println("Original (in the raw stream) Frames per second AS URL === " + jMetaDataText.getFrameRateOriginalAsURL());
    }

   /**
    * Test getDurationFirstFrameAsInteger() method.
    */
    @Test
    public void subTestGetDurationFirstFrameAsInteger() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameAsInteger());
        System.out.println("Duration of the first frame if it is longer than others, in ms AS Integer === " + jMetaDataText.getDurationFirstFrameAsInteger());
    }

   /**
    * Test getDurationFirstFrameAsLong() method.
    */
    @Test
    public void subTestGetDurationFirstFrameAsLong() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameAsLong());
        System.out.println("Duration of the first frame if it is longer than others, in ms AS Long === " + jMetaDataText.getDurationFirstFrameAsLong());
    }

   /**
    * Test getDurationFirstFrameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationFirstFrameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameAsLocalDateTime());
        System.out.println("Duration of the first frame if it is longer than others, in ms AS LocalDateTime === " + jMetaDataText.getDurationFirstFrameAsLocalDateTime());
    }

   /**
    * Test getDurationFirstFrameAsLocalTime() method.
    */
    @Test
    public void subTestGetDurationFirstFrameAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameAsLocalTime());
        System.out.println("Duration of the first frame if it is longer than others, in ms AS LocalTime === " + jMetaDataText.getDurationFirstFrameAsLocalTime());
    }

   /**
    * Test getDurationFirstFrameAsString() method.
    */
    @Test
    public void subTestGetDurationFirstFrameAsString() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameAsString());
        System.out.println("Duration of the first frame if it is longer than others, in ms AS String === " + jMetaDataText.getDurationFirstFrameAsString());
    }

   /**
    * Test getDurationFirstFrameAsBoolean() method.
    */
    @Test
    public void subTestGetDurationFirstFrameAsBoolean() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameAsBoolean());
        System.out.println("Duration of the first frame if it is longer than others, in ms AS Boolean === " + jMetaDataText.getDurationFirstFrameAsBoolean());
    }

   /**
    * Test getDurationFirstFrameAsBigInteger() method.
    */
    @Test
    public void subTestGetDurationFirstFrameAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameAsBigInteger());
        System.out.println("Duration of the first frame if it is longer than others, in ms AS BigInteger === " + jMetaDataText.getDurationFirstFrameAsBigInteger());
    }

   /**
    * Test getDurationFirstFrameAsURL() method.
    */
    @Test
    public void subTestGetDurationFirstFrameAsURL() {
        assertEquals(null, this.jMetaDataText.getDurationFirstFrameAsURL());
        System.out.println("Duration of the first frame if it is longer than others, in ms AS URL === " + jMetaDataText.getDurationFirstFrameAsURL());
    }

   /**
    * Test getDelayOriginalString3AsInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalString3AsInteger() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalString3AsInteger());
        System.out.println("Delay in format: HH:MM:SS.MMM AS Integer === " + jMetaDataText.getDelayOriginalString3AsInteger());
    }

   /**
    * Test getDelayOriginalString3AsLong() method.
    */
    @Test
    public void subTestGetDelayOriginalString3AsLong() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalString3AsLong());
        System.out.println("Delay in format: HH:MM:SS.MMM AS Long === " + jMetaDataText.getDelayOriginalString3AsLong());
    }

   /**
    * Test getDelayOriginalString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayOriginalString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalString3AsLocalDateTime());
        System.out.println("Delay in format: HH:MM:SS.MMM AS LocalDateTime === " + jMetaDataText.getDelayOriginalString3AsLocalDateTime());
    }

   /**
    * Test getDelayOriginalString3AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayOriginalString3AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalString3AsLocalTime());
        System.out.println("Delay in format: HH:MM:SS.MMM AS LocalTime === " + jMetaDataText.getDelayOriginalString3AsLocalTime());
    }

   /**
    * Test getDelayOriginalString3AsString() method.
    */
    @Test
    public void subTestGetDelayOriginalString3AsString() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalString3AsString());
        System.out.println("Delay in format: HH:MM:SS.MMM AS String === " + jMetaDataText.getDelayOriginalString3AsString());
    }

   /**
    * Test getDelayOriginalString3AsBoolean() method.
    */
    @Test
    public void subTestGetDelayOriginalString3AsBoolean() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalString3AsBoolean());
        System.out.println("Delay in format: HH:MM:SS.MMM AS Boolean === " + jMetaDataText.getDelayOriginalString3AsBoolean());
    }

   /**
    * Test getDelayOriginalString3AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalString3AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalString3AsBigInteger());
        System.out.println("Delay in format: HH:MM:SS.MMM AS BigInteger === " + jMetaDataText.getDelayOriginalString3AsBigInteger());
    }

   /**
    * Test getDelayOriginalString3AsURL() method.
    */
    @Test
    public void subTestGetDelayOriginalString3AsURL() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalString3AsURL());
        System.out.println("Delay in format: HH:MM:SS.MMM AS URL === " + jMetaDataText.getDelayOriginalString3AsURL());
    }

   /**
    * Test getEncodedApplicationStringAsInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationStringAsInteger());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS Integer === " + jMetaDataText.getEncodedApplicationStringAsInteger());
    }

   /**
    * Test getEncodedApplicationStringAsLong() method.
    */
    @Test
    public void subTestGetEncodedApplicationStringAsLong() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationStringAsLong());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS Long === " + jMetaDataText.getEncodedApplicationStringAsLong());
    }

   /**
    * Test getEncodedApplicationStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationStringAsLocalDateTime());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS LocalDateTime === " + jMetaDataText.getEncodedApplicationStringAsLocalDateTime());
    }

   /**
    * Test getEncodedApplicationStringAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationStringAsLocalTime());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS LocalTime === " + jMetaDataText.getEncodedApplicationStringAsLocalTime());
    }

   /**
    * Test getEncodedApplicationStringAsString() method.
    */
    @Test
    public void subTestGetEncodedApplicationStringAsString() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationStringAsString());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS String === " + jMetaDataText.getEncodedApplicationStringAsString());
    }

   /**
    * Test getEncodedApplicationStringAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedApplicationStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationStringAsBoolean());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS Boolean === " + jMetaDataText.getEncodedApplicationStringAsBoolean());
    }

   /**
    * Test getEncodedApplicationStringAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationStringAsBigInteger());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS BigInteger === " + jMetaDataText.getEncodedApplicationStringAsBigInteger());
    }

   /**
    * Test getEncodedApplicationStringAsURL() method.
    */
    @Test
    public void subTestGetEncodedApplicationStringAsURL() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationStringAsURL());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS URL === " + jMetaDataText.getEncodedApplicationStringAsURL());
    }

   /**
    * Test getDelayOriginalString4AsInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalString4AsInteger() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalString4AsInteger());
        System.out.println("Delay in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Integer === " + jMetaDataText.getDelayOriginalString4AsInteger());
    }

   /**
    * Test getDelayOriginalString4AsLong() method.
    */
    @Test
    public void subTestGetDelayOriginalString4AsLong() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalString4AsLong());
        System.out.println("Delay in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Long === " + jMetaDataText.getDelayOriginalString4AsLong());
    }

   /**
    * Test getDelayOriginalString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayOriginalString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalString4AsLocalDateTime());
        System.out.println("Delay in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS LocalDateTime === " + jMetaDataText.getDelayOriginalString4AsLocalDateTime());
    }

   /**
    * Test getDelayOriginalString4AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayOriginalString4AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalString4AsLocalTime());
        System.out.println("Delay in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS LocalTime === " + jMetaDataText.getDelayOriginalString4AsLocalTime());
    }

   /**
    * Test getDelayOriginalString4AsString() method.
    */
    @Test
    public void subTestGetDelayOriginalString4AsString() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalString4AsString());
        System.out.println("Delay in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS String === " + jMetaDataText.getDelayOriginalString4AsString());
    }

   /**
    * Test getDelayOriginalString4AsBoolean() method.
    */
    @Test
    public void subTestGetDelayOriginalString4AsBoolean() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalString4AsBoolean());
        System.out.println("Delay in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Boolean === " + jMetaDataText.getDelayOriginalString4AsBoolean());
    }

   /**
    * Test getDelayOriginalString4AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalString4AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalString4AsBigInteger());
        System.out.println("Delay in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS BigInteger === " + jMetaDataText.getDelayOriginalString4AsBigInteger());
    }

   /**
    * Test getDelayOriginalString4AsURL() method.
    */
    @Test
    public void subTestGetDelayOriginalString4AsURL() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalString4AsURL());
        System.out.println("Delay in format: HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS URL === " + jMetaDataText.getDelayOriginalString4AsURL());
    }

   /**
    * Test getDelayOriginalString5AsInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalString5AsInteger() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalString5AsInteger());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Integer === " + jMetaDataText.getDelayOriginalString5AsInteger());
    }

   /**
    * Test getDelayOriginalString5AsLong() method.
    */
    @Test
    public void subTestGetDelayOriginalString5AsLong() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalString5AsLong());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Long === " + jMetaDataText.getDelayOriginalString5AsLong());
    }

   /**
    * Test getDelayOriginalString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayOriginalString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalString5AsLocalDateTime());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS LocalDateTime === " + jMetaDataText.getDelayOriginalString5AsLocalDateTime());
    }

   /**
    * Test getDelayOriginalString5AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayOriginalString5AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalString5AsLocalTime());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS LocalTime === " + jMetaDataText.getDelayOriginalString5AsLocalTime());
    }

   /**
    * Test getDelayOriginalString5AsString() method.
    */
    @Test
    public void subTestGetDelayOriginalString5AsString() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalString5AsString());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS String === " + jMetaDataText.getDelayOriginalString5AsString());
    }

   /**
    * Test getDelayOriginalString5AsBoolean() method.
    */
    @Test
    public void subTestGetDelayOriginalString5AsBoolean() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalString5AsBoolean());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Boolean === " + jMetaDataText.getDelayOriginalString5AsBoolean());
    }

   /**
    * Test getDelayOriginalString5AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalString5AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalString5AsBigInteger());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS BigInteger === " + jMetaDataText.getDelayOriginalString5AsBigInteger());
    }

   /**
    * Test getDelayOriginalString5AsURL() method.
    */
    @Test
    public void subTestGetDelayOriginalString5AsURL() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalString5AsURL());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS URL === " + jMetaDataText.getDelayOriginalString5AsURL());
    }

   /**
    * Test getForcedAsInteger() method.
    */
    @Test
    public void subTestGetForcedAsInteger() {
        assertEquals(null, this.jMetaDataText.getForcedAsInteger());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS Integer === " + jMetaDataText.getForcedAsInteger());
    }

   /**
    * Test getForcedAsLong() method.
    */
    @Test
    public void subTestGetForcedAsLong() {
        assertEquals(null, this.jMetaDataText.getForcedAsLong());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS Long === " + jMetaDataText.getForcedAsLong());
    }

   /**
    * Test getForcedAsLocalDateTime() method.
    */
    @Test
    public void subTestGetForcedAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getForcedAsLocalDateTime());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS LocalDateTime === " + jMetaDataText.getForcedAsLocalDateTime());
    }

   /**
    * Test getForcedAsLocalTime() method.
    */
    @Test
    public void subTestGetForcedAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getForcedAsLocalTime());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS LocalTime === " + jMetaDataText.getForcedAsLocalTime());
    }

   /**
    * Test getForcedAsString() method.
    */
    @Test
    public void subTestGetForcedAsString() {
        assertEquals(null, this.jMetaDataText.getForcedAsString());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS String === " + jMetaDataText.getForcedAsString());
    }

   /**
    * Test getForcedAsBoolean() method.
    */
    @Test
    public void subTestGetForcedAsBoolean() {
        assertEquals(null, this.jMetaDataText.getForcedAsBoolean());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS Boolean === " + jMetaDataText.getForcedAsBoolean());
    }

   /**
    * Test getForcedAsBigInteger() method.
    */
    @Test
    public void subTestGetForcedAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getForcedAsBigInteger());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS BigInteger === " + jMetaDataText.getForcedAsBigInteger());
    }

   /**
    * Test getForcedAsURL() method.
    */
    @Test
    public void subTestGetForcedAsURL() {
        assertEquals(null, this.jMetaDataText.getForcedAsURL());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS URL === " + jMetaDataText.getForcedAsURL());
    }

   /**
    * Test getInformAsInteger() method.
    */
    @Test
    public void subTestGetInformAsInteger() {
        assertEquals(null, this.jMetaDataText.getInformAsInteger());
        System.out.println("Last **Inform** call AS Integer === " + jMetaDataText.getInformAsInteger());
    }

   /**
    * Test getInformAsLong() method.
    */
    @Test
    public void subTestGetInformAsLong() {
        assertEquals(null, this.jMetaDataText.getInformAsLong());
        System.out.println("Last **Inform** call AS Long === " + jMetaDataText.getInformAsLong());
    }

   /**
    * Test getInformAsLocalDateTime() method.
    */
    @Test
    public void subTestGetInformAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getInformAsLocalDateTime());
        System.out.println("Last **Inform** call AS LocalDateTime === " + jMetaDataText.getInformAsLocalDateTime());
    }

   /**
    * Test getInformAsLocalTime() method.
    */
    @Test
    public void subTestGetInformAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getInformAsLocalTime());
        System.out.println("Last **Inform** call AS LocalTime === " + jMetaDataText.getInformAsLocalTime());
    }

   /**
    * Test getInformAsString() method.
    */
    @Test
    public void subTestGetInformAsString() {
        assertEquals(null, this.jMetaDataText.getInformAsString());
        System.out.println("Last **Inform** call AS String === " + jMetaDataText.getInformAsString());
    }

   /**
    * Test getInformAsBoolean() method.
    */
    @Test
    public void subTestGetInformAsBoolean() {
        assertEquals(null, this.jMetaDataText.getInformAsBoolean());
        System.out.println("Last **Inform** call AS Boolean === " + jMetaDataText.getInformAsBoolean());
    }

   /**
    * Test getInformAsBigInteger() method.
    */
    @Test
    public void subTestGetInformAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getInformAsBigInteger());
        System.out.println("Last **Inform** call AS BigInteger === " + jMetaDataText.getInformAsBigInteger());
    }

   /**
    * Test getInformAsURL() method.
    */
    @Test
    public void subTestGetInformAsURL() {
        assertEquals(null, this.jMetaDataText.getInformAsURL());
        System.out.println("Last **Inform** call AS URL === " + jMetaDataText.getInformAsURL());
    }

   /**
    * Test getSourceDurationFirstFrameAsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameAsInteger() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameAsInteger());
        System.out.println("Source Duration of the first frame if it is longer than others, in ms AS Integer === " + jMetaDataText.getSourceDurationFirstFrameAsInteger());
    }

   /**
    * Test getSourceDurationFirstFrameAsLong() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameAsLong() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameAsLong());
        System.out.println("Source Duration of the first frame if it is longer than others, in ms AS Long === " + jMetaDataText.getSourceDurationFirstFrameAsLong());
    }

   /**
    * Test getSourceDurationFirstFrameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameAsLocalDateTime());
        System.out.println("Source Duration of the first frame if it is longer than others, in ms AS LocalDateTime === " + jMetaDataText.getSourceDurationFirstFrameAsLocalDateTime());
    }

   /**
    * Test getSourceDurationFirstFrameAsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameAsLocalTime());
        System.out.println("Source Duration of the first frame if it is longer than others, in ms AS LocalTime === " + jMetaDataText.getSourceDurationFirstFrameAsLocalTime());
    }

   /**
    * Test getSourceDurationFirstFrameAsString() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameAsString() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameAsString());
        System.out.println("Source Duration of the first frame if it is longer than others, in ms AS String === " + jMetaDataText.getSourceDurationFirstFrameAsString());
    }

   /**
    * Test getSourceDurationFirstFrameAsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameAsBoolean() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameAsBoolean());
        System.out.println("Source Duration of the first frame if it is longer than others, in ms AS Boolean === " + jMetaDataText.getSourceDurationFirstFrameAsBoolean());
    }

   /**
    * Test getSourceDurationFirstFrameAsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameAsBigInteger());
        System.out.println("Source Duration of the first frame if it is longer than others, in ms AS BigInteger === " + jMetaDataText.getSourceDurationFirstFrameAsBigInteger());
    }

   /**
    * Test getSourceDurationFirstFrameAsURL() method.
    */
    @Test
    public void subTestGetSourceDurationFirstFrameAsURL() {
        assertEquals(null, this.jMetaDataText.getSourceDurationFirstFrameAsURL());
        System.out.println("Source Duration of the first frame if it is longer than others, in ms AS URL === " + jMetaDataText.getSourceDurationFirstFrameAsURL());
    }

   /**
    * Test getStreamKindIDAsInteger() method.
    */
    @Test
    public void subTestGetStreamKindIDAsInteger() {
        assertEquals(null, this.jMetaDataText.getStreamKindIDAsInteger());
        System.out.println("Number of the stream (base=0) AS Integer === " + jMetaDataText.getStreamKindIDAsInteger());
    }

   /**
    * Test getStreamKindIDAsLong() method.
    */
    @Test
    public void subTestGetStreamKindIDAsLong() {
        assertEquals(null, this.jMetaDataText.getStreamKindIDAsLong());
        System.out.println("Number of the stream (base=0) AS Long === " + jMetaDataText.getStreamKindIDAsLong());
    }

   /**
    * Test getStreamKindIDAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamKindIDAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getStreamKindIDAsLocalDateTime());
        System.out.println("Number of the stream (base=0) AS LocalDateTime === " + jMetaDataText.getStreamKindIDAsLocalDateTime());
    }

   /**
    * Test getStreamKindIDAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamKindIDAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getStreamKindIDAsLocalTime());
        System.out.println("Number of the stream (base=0) AS LocalTime === " + jMetaDataText.getStreamKindIDAsLocalTime());
    }

   /**
    * Test getStreamKindIDAsString() method.
    */
    @Test
    public void subTestGetStreamKindIDAsString() {
        assertEquals(null, this.jMetaDataText.getStreamKindIDAsString());
        System.out.println("Number of the stream (base=0) AS String === " + jMetaDataText.getStreamKindIDAsString());
    }

   /**
    * Test getStreamKindIDAsBoolean() method.
    */
    @Test
    public void subTestGetStreamKindIDAsBoolean() {
        assertEquals(null, this.jMetaDataText.getStreamKindIDAsBoolean());
        System.out.println("Number of the stream (base=0) AS Boolean === " + jMetaDataText.getStreamKindIDAsBoolean());
    }

   /**
    * Test getStreamKindIDAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamKindIDAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getStreamKindIDAsBigInteger());
        System.out.println("Number of the stream (base=0) AS BigInteger === " + jMetaDataText.getStreamKindIDAsBigInteger());
    }

   /**
    * Test getStreamKindIDAsURL() method.
    */
    @Test
    public void subTestGetStreamKindIDAsURL() {
        assertEquals(null, this.jMetaDataText.getStreamKindIDAsURL());
        System.out.println("Number of the stream (base=0) AS URL === " + jMetaDataText.getStreamKindIDAsURL());
    }

   /**
    * Test getFrameRateNominalStringAsInteger() method.
    */
    @Test
    public void subTestGetFrameRateNominalStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getFrameRateNominalStringAsInteger());
        System.out.println("Nominal Frames per second (with measurement) AS Integer === " + jMetaDataText.getFrameRateNominalStringAsInteger());
    }

   /**
    * Test getFrameRateNominalStringAsLong() method.
    */
    @Test
    public void subTestGetFrameRateNominalStringAsLong() {
        assertEquals(null, this.jMetaDataText.getFrameRateNominalStringAsLong());
        System.out.println("Nominal Frames per second (with measurement) AS Long === " + jMetaDataText.getFrameRateNominalStringAsLong());
    }

   /**
    * Test getFrameRateNominalStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFrameRateNominalStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getFrameRateNominalStringAsLocalDateTime());
        System.out.println("Nominal Frames per second (with measurement) AS LocalDateTime === " + jMetaDataText.getFrameRateNominalStringAsLocalDateTime());
    }

   /**
    * Test getFrameRateNominalStringAsLocalTime() method.
    */
    @Test
    public void subTestGetFrameRateNominalStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getFrameRateNominalStringAsLocalTime());
        System.out.println("Nominal Frames per second (with measurement) AS LocalTime === " + jMetaDataText.getFrameRateNominalStringAsLocalTime());
    }

   /**
    * Test getFrameRateNominalStringAsString() method.
    */
    @Test
    public void subTestGetFrameRateNominalStringAsString() {
        assertEquals(null, this.jMetaDataText.getFrameRateNominalStringAsString());
        System.out.println("Nominal Frames per second (with measurement) AS String === " + jMetaDataText.getFrameRateNominalStringAsString());
    }

   /**
    * Test getFrameRateNominalStringAsBoolean() method.
    */
    @Test
    public void subTestGetFrameRateNominalStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getFrameRateNominalStringAsBoolean());
        System.out.println("Nominal Frames per second (with measurement) AS Boolean === " + jMetaDataText.getFrameRateNominalStringAsBoolean());
    }

   /**
    * Test getFrameRateNominalStringAsBigInteger() method.
    */
    @Test
    public void subTestGetFrameRateNominalStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getFrameRateNominalStringAsBigInteger());
        System.out.println("Nominal Frames per second (with measurement) AS BigInteger === " + jMetaDataText.getFrameRateNominalStringAsBigInteger());
    }

   /**
    * Test getFrameRateNominalStringAsURL() method.
    */
    @Test
    public void subTestGetFrameRateNominalStringAsURL() {
        assertEquals(null, this.jMetaDataText.getFrameRateNominalStringAsURL());
        System.out.println("Nominal Frames per second (with measurement) AS URL === " + jMetaDataText.getFrameRateNominalStringAsURL());
    }

   /**
    * Test getFormatUrlAsInteger() method.
    */
    @Test
    public void subTestGetFormatUrlAsInteger() {
        assertEquals(null, this.jMetaDataText.getFormatUrlAsInteger());
        System.out.println("Link AS Integer === " + jMetaDataText.getFormatUrlAsInteger());
    }

   /**
    * Test getFormatUrlAsLong() method.
    */
    @Test
    public void subTestGetFormatUrlAsLong() {
        assertEquals(null, this.jMetaDataText.getFormatUrlAsLong());
        System.out.println("Link AS Long === " + jMetaDataText.getFormatUrlAsLong());
    }

   /**
    * Test getFormatUrlAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatUrlAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getFormatUrlAsLocalDateTime());
        System.out.println("Link AS LocalDateTime === " + jMetaDataText.getFormatUrlAsLocalDateTime());
    }

   /**
    * Test getFormatUrlAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatUrlAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getFormatUrlAsLocalTime());
        System.out.println("Link AS LocalTime === " + jMetaDataText.getFormatUrlAsLocalTime());
    }

   /**
    * Test getFormatUrlAsString() method.
    */
    @Test
    public void subTestGetFormatUrlAsString() {
        assertEquals(null, this.jMetaDataText.getFormatUrlAsString());
        System.out.println("Link AS String === " + jMetaDataText.getFormatUrlAsString());
    }

   /**
    * Test getFormatUrlAsBoolean() method.
    */
    @Test
    public void subTestGetFormatUrlAsBoolean() {
        assertEquals(null, this.jMetaDataText.getFormatUrlAsBoolean());
        System.out.println("Link AS Boolean === " + jMetaDataText.getFormatUrlAsBoolean());
    }

   /**
    * Test getFormatUrlAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatUrlAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getFormatUrlAsBigInteger());
        System.out.println("Link AS BigInteger === " + jMetaDataText.getFormatUrlAsBigInteger());
    }

   /**
    * Test getFormatUrlAsURL() method.
    */
    @Test
    public void subTestGetFormatUrlAsURL() {
        assertEquals(null, this.jMetaDataText.getFormatUrlAsURL());
        System.out.println("Link AS URL === " + jMetaDataText.getFormatUrlAsURL());
    }

   /**
    * Test getBitRateMinimumStringAsInteger() method.
    */
    @Test
    public void subTestGetBitRateMinimumStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getBitRateMinimumStringAsInteger());
        System.out.println("Minimum Bit rate (with measurement) AS Integer === " + jMetaDataText.getBitRateMinimumStringAsInteger());
    }

   /**
    * Test getBitRateMinimumStringAsLong() method.
    */
    @Test
    public void subTestGetBitRateMinimumStringAsLong() {
        assertEquals(null, this.jMetaDataText.getBitRateMinimumStringAsLong());
        System.out.println("Minimum Bit rate (with measurement) AS Long === " + jMetaDataText.getBitRateMinimumStringAsLong());
    }

   /**
    * Test getBitRateMinimumStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitRateMinimumStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getBitRateMinimumStringAsLocalDateTime());
        System.out.println("Minimum Bit rate (with measurement) AS LocalDateTime === " + jMetaDataText.getBitRateMinimumStringAsLocalDateTime());
    }

   /**
    * Test getBitRateMinimumStringAsLocalTime() method.
    */
    @Test
    public void subTestGetBitRateMinimumStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getBitRateMinimumStringAsLocalTime());
        System.out.println("Minimum Bit rate (with measurement) AS LocalTime === " + jMetaDataText.getBitRateMinimumStringAsLocalTime());
    }

   /**
    * Test getBitRateMinimumStringAsString() method.
    */
    @Test
    public void subTestGetBitRateMinimumStringAsString() {
        assertEquals(null, this.jMetaDataText.getBitRateMinimumStringAsString());
        System.out.println("Minimum Bit rate (with measurement) AS String === " + jMetaDataText.getBitRateMinimumStringAsString());
    }

   /**
    * Test getBitRateMinimumStringAsBoolean() method.
    */
    @Test
    public void subTestGetBitRateMinimumStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getBitRateMinimumStringAsBoolean());
        System.out.println("Minimum Bit rate (with measurement) AS Boolean === " + jMetaDataText.getBitRateMinimumStringAsBoolean());
    }

   /**
    * Test getBitRateMinimumStringAsBigInteger() method.
    */
    @Test
    public void subTestGetBitRateMinimumStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getBitRateMinimumStringAsBigInteger());
        System.out.println("Minimum Bit rate (with measurement) AS BigInteger === " + jMetaDataText.getBitRateMinimumStringAsBigInteger());
    }

   /**
    * Test getBitRateMinimumStringAsURL() method.
    */
    @Test
    public void subTestGetBitRateMinimumStringAsURL() {
        assertEquals(null, this.jMetaDataText.getBitRateMinimumStringAsURL());
        System.out.println("Minimum Bit rate (with measurement) AS URL === " + jMetaDataText.getBitRateMinimumStringAsURL());
    }

   /**
    * Test getWidthAsInteger() method.
    */
    @Test
    public void subTestGetWidthAsInteger() {
        assertEquals(null, this.jMetaDataText.getWidthAsInteger());
        System.out.println("Width AS Integer === " + jMetaDataText.getWidthAsInteger());
    }

   /**
    * Test getWidthAsLong() method.
    */
    @Test
    public void subTestGetWidthAsLong() {
        assertEquals(null, this.jMetaDataText.getWidthAsLong());
        System.out.println("Width AS Long === " + jMetaDataText.getWidthAsLong());
    }

   /**
    * Test getWidthAsLocalDateTime() method.
    */
    @Test
    public void subTestGetWidthAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getWidthAsLocalDateTime());
        System.out.println("Width AS LocalDateTime === " + jMetaDataText.getWidthAsLocalDateTime());
    }

   /**
    * Test getWidthAsLocalTime() method.
    */
    @Test
    public void subTestGetWidthAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getWidthAsLocalTime());
        System.out.println("Width AS LocalTime === " + jMetaDataText.getWidthAsLocalTime());
    }

   /**
    * Test getWidthAsString() method.
    */
    @Test
    public void subTestGetWidthAsString() {
        assertEquals(null, this.jMetaDataText.getWidthAsString());
        System.out.println("Width AS String === " + jMetaDataText.getWidthAsString());
    }

   /**
    * Test getWidthAsBoolean() method.
    */
    @Test
    public void subTestGetWidthAsBoolean() {
        assertEquals(null, this.jMetaDataText.getWidthAsBoolean());
        System.out.println("Width AS Boolean === " + jMetaDataText.getWidthAsBoolean());
    }

   /**
    * Test getWidthAsBigInteger() method.
    */
    @Test
    public void subTestGetWidthAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getWidthAsBigInteger());
        System.out.println("Width AS BigInteger === " + jMetaDataText.getWidthAsBigInteger());
    }

   /**
    * Test getWidthAsURL() method.
    */
    @Test
    public void subTestGetWidthAsURL() {
        assertEquals(null, this.jMetaDataText.getWidthAsURL());
        System.out.println("Width AS URL === " + jMetaDataText.getWidthAsURL());
    }

   /**
    * Test getFrameRateStringAsInteger() method.
    */
    @Test
    public void subTestGetFrameRateStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getFrameRateStringAsInteger());
        System.out.println("Frames per second (with measurement) AS Integer === " + jMetaDataText.getFrameRateStringAsInteger());
    }

   /**
    * Test getFrameRateStringAsLong() method.
    */
    @Test
    public void subTestGetFrameRateStringAsLong() {
        assertEquals(null, this.jMetaDataText.getFrameRateStringAsLong());
        System.out.println("Frames per second (with measurement) AS Long === " + jMetaDataText.getFrameRateStringAsLong());
    }

   /**
    * Test getFrameRateStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFrameRateStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getFrameRateStringAsLocalDateTime());
        System.out.println("Frames per second (with measurement) AS LocalDateTime === " + jMetaDataText.getFrameRateStringAsLocalDateTime());
    }

   /**
    * Test getFrameRateStringAsLocalTime() method.
    */
    @Test
    public void subTestGetFrameRateStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getFrameRateStringAsLocalTime());
        System.out.println("Frames per second (with measurement) AS LocalTime === " + jMetaDataText.getFrameRateStringAsLocalTime());
    }

   /**
    * Test getFrameRateStringAsString() method.
    */
    @Test
    public void subTestGetFrameRateStringAsString() {
        assertEquals(null, this.jMetaDataText.getFrameRateStringAsString());
        System.out.println("Frames per second (with measurement) AS String === " + jMetaDataText.getFrameRateStringAsString());
    }

   /**
    * Test getFrameRateStringAsBoolean() method.
    */
    @Test
    public void subTestGetFrameRateStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getFrameRateStringAsBoolean());
        System.out.println("Frames per second (with measurement) AS Boolean === " + jMetaDataText.getFrameRateStringAsBoolean());
    }

   /**
    * Test getFrameRateStringAsBigInteger() method.
    */
    @Test
    public void subTestGetFrameRateStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getFrameRateStringAsBigInteger());
        System.out.println("Frames per second (with measurement) AS BigInteger === " + jMetaDataText.getFrameRateStringAsBigInteger());
    }

   /**
    * Test getFrameRateStringAsURL() method.
    */
    @Test
    public void subTestGetFrameRateStringAsURL() {
        assertEquals(null, this.jMetaDataText.getFrameRateStringAsURL());
        System.out.println("Frames per second (with measurement) AS URL === " + jMetaDataText.getFrameRateStringAsURL());
    }

   /**
    * Test getSourceFrameCountAsInteger() method.
    */
    @Test
    public void subTestGetSourceFrameCountAsInteger() {
        assertEquals(null, this.jMetaDataText.getSourceFrameCountAsInteger());
        System.out.println("Source Number of frames AS Integer === " + jMetaDataText.getSourceFrameCountAsInteger());
    }

   /**
    * Test getSourceFrameCountAsLong() method.
    */
    @Test
    public void subTestGetSourceFrameCountAsLong() {
        assertEquals(null, this.jMetaDataText.getSourceFrameCountAsLong());
        System.out.println("Source Number of frames AS Long === " + jMetaDataText.getSourceFrameCountAsLong());
    }

   /**
    * Test getSourceFrameCountAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceFrameCountAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getSourceFrameCountAsLocalDateTime());
        System.out.println("Source Number of frames AS LocalDateTime === " + jMetaDataText.getSourceFrameCountAsLocalDateTime());
    }

   /**
    * Test getSourceFrameCountAsLocalTime() method.
    */
    @Test
    public void subTestGetSourceFrameCountAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getSourceFrameCountAsLocalTime());
        System.out.println("Source Number of frames AS LocalTime === " + jMetaDataText.getSourceFrameCountAsLocalTime());
    }

   /**
    * Test getSourceFrameCountAsString() method.
    */
    @Test
    public void subTestGetSourceFrameCountAsString() {
        assertEquals(null, this.jMetaDataText.getSourceFrameCountAsString());
        System.out.println("Source Number of frames AS String === " + jMetaDataText.getSourceFrameCountAsString());
    }

   /**
    * Test getSourceFrameCountAsBoolean() method.
    */
    @Test
    public void subTestGetSourceFrameCountAsBoolean() {
        assertEquals(null, this.jMetaDataText.getSourceFrameCountAsBoolean());
        System.out.println("Source Number of frames AS Boolean === " + jMetaDataText.getSourceFrameCountAsBoolean());
    }

   /**
    * Test getSourceFrameCountAsBigInteger() method.
    */
    @Test
    public void subTestGetSourceFrameCountAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getSourceFrameCountAsBigInteger());
        System.out.println("Source Number of frames AS BigInteger === " + jMetaDataText.getSourceFrameCountAsBigInteger());
    }

   /**
    * Test getSourceFrameCountAsURL() method.
    */
    @Test
    public void subTestGetSourceFrameCountAsURL() {
        assertEquals(null, this.jMetaDataText.getSourceFrameCountAsURL());
        System.out.println("Source Number of frames AS URL === " + jMetaDataText.getSourceFrameCountAsURL());
    }

   /**
    * Test getDefaultAsInteger() method.
    */
    @Test
    public void subTestGetDefaultAsInteger() {
        assertEquals(null, this.jMetaDataText.getDefaultAsInteger());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS Integer === " + jMetaDataText.getDefaultAsInteger());
    }

   /**
    * Test getDefaultAsLong() method.
    */
    @Test
    public void subTestGetDefaultAsLong() {
        assertEquals(null, this.jMetaDataText.getDefaultAsLong());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS Long === " + jMetaDataText.getDefaultAsLong());
    }

   /**
    * Test getDefaultAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDefaultAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDefaultAsLocalDateTime());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS LocalDateTime === " + jMetaDataText.getDefaultAsLocalDateTime());
    }

   /**
    * Test getDefaultAsLocalTime() method.
    */
    @Test
    public void subTestGetDefaultAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDefaultAsLocalTime());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS LocalTime === " + jMetaDataText.getDefaultAsLocalTime());
    }

   /**
    * Test getDefaultAsString() method.
    */
    @Test
    public void subTestGetDefaultAsString() {
        assertEquals(null, this.jMetaDataText.getDefaultAsString());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS String === " + jMetaDataText.getDefaultAsString());
    }

   /**
    * Test getDefaultAsBoolean() method.
    */
    @Test
    public void subTestGetDefaultAsBoolean() {
        assertEquals(null, this.jMetaDataText.getDefaultAsBoolean());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS Boolean === " + jMetaDataText.getDefaultAsBoolean());
    }

   /**
    * Test getDefaultAsBigInteger() method.
    */
    @Test
    public void subTestGetDefaultAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDefaultAsBigInteger());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS BigInteger === " + jMetaDataText.getDefaultAsBigInteger());
    }

   /**
    * Test getDefaultAsURL() method.
    */
    @Test
    public void subTestGetDefaultAsURL() {
        assertEquals(null, this.jMetaDataText.getDefaultAsURL());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS URL === " + jMetaDataText.getDefaultAsURL());
    }

   /**
    * Test getDelayOriginalSettingsAsInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalSettingsAsInteger() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalSettingsAsInteger());
        System.out.println("Delay settings (in case of timecode for example) AS Integer === " + jMetaDataText.getDelayOriginalSettingsAsInteger());
    }

   /**
    * Test getDelayOriginalSettingsAsLong() method.
    */
    @Test
    public void subTestGetDelayOriginalSettingsAsLong() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalSettingsAsLong());
        System.out.println("Delay settings (in case of timecode for example) AS Long === " + jMetaDataText.getDelayOriginalSettingsAsLong());
    }

   /**
    * Test getDelayOriginalSettingsAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayOriginalSettingsAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalSettingsAsLocalDateTime());
        System.out.println("Delay settings (in case of timecode for example) AS LocalDateTime === " + jMetaDataText.getDelayOriginalSettingsAsLocalDateTime());
    }

   /**
    * Test getDelayOriginalSettingsAsLocalTime() method.
    */
    @Test
    public void subTestGetDelayOriginalSettingsAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalSettingsAsLocalTime());
        System.out.println("Delay settings (in case of timecode for example) AS LocalTime === " + jMetaDataText.getDelayOriginalSettingsAsLocalTime());
    }

   /**
    * Test getDelayOriginalSettingsAsString() method.
    */
    @Test
    public void subTestGetDelayOriginalSettingsAsString() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalSettingsAsString());
        System.out.println("Delay settings (in case of timecode for example) AS String === " + jMetaDataText.getDelayOriginalSettingsAsString());
    }

   /**
    * Test getDelayOriginalSettingsAsBoolean() method.
    */
    @Test
    public void subTestGetDelayOriginalSettingsAsBoolean() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalSettingsAsBoolean());
        System.out.println("Delay settings (in case of timecode for example) AS Boolean === " + jMetaDataText.getDelayOriginalSettingsAsBoolean());
    }

   /**
    * Test getDelayOriginalSettingsAsBigInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalSettingsAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalSettingsAsBigInteger());
        System.out.println("Delay settings (in case of timecode for example) AS BigInteger === " + jMetaDataText.getDelayOriginalSettingsAsBigInteger());
    }

   /**
    * Test getDelayOriginalSettingsAsURL() method.
    */
    @Test
    public void subTestGetDelayOriginalSettingsAsURL() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalSettingsAsURL());
        System.out.println("Delay settings (in case of timecode for example) AS URL === " + jMetaDataText.getDelayOriginalSettingsAsURL());
    }

   /**
    * Test getEncodedApplicationNameAsInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationNameAsInteger() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationNameAsInteger());
        System.out.println("Name of the product AS Integer === " + jMetaDataText.getEncodedApplicationNameAsInteger());
    }

   /**
    * Test getEncodedApplicationNameAsLong() method.
    */
    @Test
    public void subTestGetEncodedApplicationNameAsLong() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationNameAsLong());
        System.out.println("Name of the product AS Long === " + jMetaDataText.getEncodedApplicationNameAsLong());
    }

   /**
    * Test getEncodedApplicationNameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationNameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationNameAsLocalDateTime());
        System.out.println("Name of the product AS LocalDateTime === " + jMetaDataText.getEncodedApplicationNameAsLocalDateTime());
    }

   /**
    * Test getEncodedApplicationNameAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationNameAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationNameAsLocalTime());
        System.out.println("Name of the product AS LocalTime === " + jMetaDataText.getEncodedApplicationNameAsLocalTime());
    }

   /**
    * Test getEncodedApplicationNameAsString() method.
    */
    @Test
    public void subTestGetEncodedApplicationNameAsString() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationNameAsString());
        System.out.println("Name of the product AS String === " + jMetaDataText.getEncodedApplicationNameAsString());
    }

   /**
    * Test getEncodedApplicationNameAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedApplicationNameAsBoolean() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationNameAsBoolean());
        System.out.println("Name of the product AS Boolean === " + jMetaDataText.getEncodedApplicationNameAsBoolean());
    }

   /**
    * Test getEncodedApplicationNameAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationNameAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationNameAsBigInteger());
        System.out.println("Name of the product AS BigInteger === " + jMetaDataText.getEncodedApplicationNameAsBigInteger());
    }

   /**
    * Test getEncodedApplicationNameAsURL() method.
    */
    @Test
    public void subTestGetEncodedApplicationNameAsURL() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationNameAsURL());
        System.out.println("Name of the product AS URL === " + jMetaDataText.getEncodedApplicationNameAsURL());
    }

   /**
    * Test getUniqueIDStringAsInteger() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getUniqueIDStringAsInteger());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS Integer === " + jMetaDataText.getUniqueIDStringAsInteger());
    }

   /**
    * Test getUniqueIDStringAsLong() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsLong() {
        assertEquals(null, this.jMetaDataText.getUniqueIDStringAsLong());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS Long === " + jMetaDataText.getUniqueIDStringAsLong());
    }

   /**
    * Test getUniqueIDStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getUniqueIDStringAsLocalDateTime());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS LocalDateTime === " + jMetaDataText.getUniqueIDStringAsLocalDateTime());
    }

   /**
    * Test getUniqueIDStringAsLocalTime() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getUniqueIDStringAsLocalTime());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS LocalTime === " + jMetaDataText.getUniqueIDStringAsLocalTime());
    }

   /**
    * Test getUniqueIDStringAsString() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsString() {
        assertEquals(null, this.jMetaDataText.getUniqueIDStringAsString());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS String === " + jMetaDataText.getUniqueIDStringAsString());
    }

   /**
    * Test getUniqueIDStringAsBoolean() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getUniqueIDStringAsBoolean());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS Boolean === " + jMetaDataText.getUniqueIDStringAsBoolean());
    }

   /**
    * Test getUniqueIDStringAsBigInteger() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getUniqueIDStringAsBigInteger());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS BigInteger === " + jMetaDataText.getUniqueIDStringAsBigInteger());
    }

   /**
    * Test getUniqueIDStringAsURL() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsURL() {
        assertEquals(null, this.jMetaDataText.getUniqueIDStringAsURL());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS URL === " + jMetaDataText.getUniqueIDStringAsURL());
    }

   /**
    * Test getFormatProfileAsInteger() method.
    */
    @Test
    public void subTestGetFormatProfileAsInteger() {
        assertEquals(null, this.jMetaDataText.getFormatProfileAsInteger());
        System.out.println("Profile of the Format AS Integer === " + jMetaDataText.getFormatProfileAsInteger());
    }

   /**
    * Test getFormatProfileAsLong() method.
    */
    @Test
    public void subTestGetFormatProfileAsLong() {
        assertEquals(null, this.jMetaDataText.getFormatProfileAsLong());
        System.out.println("Profile of the Format AS Long === " + jMetaDataText.getFormatProfileAsLong());
    }

   /**
    * Test getFormatProfileAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatProfileAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getFormatProfileAsLocalDateTime());
        System.out.println("Profile of the Format AS LocalDateTime === " + jMetaDataText.getFormatProfileAsLocalDateTime());
    }

   /**
    * Test getFormatProfileAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatProfileAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getFormatProfileAsLocalTime());
        System.out.println("Profile of the Format AS LocalTime === " + jMetaDataText.getFormatProfileAsLocalTime());
    }

   /**
    * Test getFormatProfileAsString() method.
    */
    @Test
    public void subTestGetFormatProfileAsString() {
        assertEquals(null, this.jMetaDataText.getFormatProfileAsString());
        System.out.println("Profile of the Format AS String === " + jMetaDataText.getFormatProfileAsString());
    }

   /**
    * Test getFormatProfileAsBoolean() method.
    */
    @Test
    public void subTestGetFormatProfileAsBoolean() {
        assertEquals(null, this.jMetaDataText.getFormatProfileAsBoolean());
        System.out.println("Profile of the Format AS Boolean === " + jMetaDataText.getFormatProfileAsBoolean());
    }

   /**
    * Test getFormatProfileAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatProfileAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getFormatProfileAsBigInteger());
        System.out.println("Profile of the Format AS BigInteger === " + jMetaDataText.getFormatProfileAsBigInteger());
    }

   /**
    * Test getFormatProfileAsURL() method.
    */
    @Test
    public void subTestGetFormatProfileAsURL() {
        assertEquals(null, this.jMetaDataText.getFormatProfileAsURL());
        System.out.println("Profile of the Format AS URL === " + jMetaDataText.getFormatProfileAsURL());
    }

   /**
    * Test getStreamSizeEncodedString2AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString2AsInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedString2AsInteger());
        System.out.println("StreamSize_Encoded/String2 AS Integer === " + jMetaDataText.getStreamSizeEncodedString2AsInteger());
    }

   /**
    * Test getStreamSizeEncodedString2AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString2AsLong() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedString2AsLong());
        System.out.println("StreamSize_Encoded/String2 AS Long === " + jMetaDataText.getStreamSizeEncodedString2AsLong());
    }

   /**
    * Test getStreamSizeEncodedString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedString2AsLocalDateTime());
        System.out.println("StreamSize_Encoded/String2 AS LocalDateTime === " + jMetaDataText.getStreamSizeEncodedString2AsLocalDateTime());
    }

   /**
    * Test getStreamSizeEncodedString2AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString2AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedString2AsLocalTime());
        System.out.println("StreamSize_Encoded/String2 AS LocalTime === " + jMetaDataText.getStreamSizeEncodedString2AsLocalTime());
    }

   /**
    * Test getStreamSizeEncodedString2AsString() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString2AsString() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedString2AsString());
        System.out.println("StreamSize_Encoded/String2 AS String === " + jMetaDataText.getStreamSizeEncodedString2AsString());
    }

   /**
    * Test getStreamSizeEncodedString2AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString2AsBoolean() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedString2AsBoolean());
        System.out.println("StreamSize_Encoded/String2 AS Boolean === " + jMetaDataText.getStreamSizeEncodedString2AsBoolean());
    }

   /**
    * Test getStreamSizeEncodedString2AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString2AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedString2AsBigInteger());
        System.out.println("StreamSize_Encoded/String2 AS BigInteger === " + jMetaDataText.getStreamSizeEncodedString2AsBigInteger());
    }

   /**
    * Test getStreamSizeEncodedString2AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString2AsURL() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedString2AsURL());
        System.out.println("StreamSize_Encoded/String2 AS URL === " + jMetaDataText.getStreamSizeEncodedString2AsURL());
    }

   /**
    * Test getStreamSizeDemuxedString1AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedString1AsInteger());
        System.out.println("StreamSize_Demuxed/String1 AS Integer === " + jMetaDataText.getStreamSizeDemuxedString1AsInteger());
    }

   /**
    * Test getStreamSizeDemuxedString1AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsLong() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedString1AsLong());
        System.out.println("StreamSize_Demuxed/String1 AS Long === " + jMetaDataText.getStreamSizeDemuxedString1AsLong());
    }

   /**
    * Test getStreamSizeDemuxedString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedString1AsLocalDateTime());
        System.out.println("StreamSize_Demuxed/String1 AS LocalDateTime === " + jMetaDataText.getStreamSizeDemuxedString1AsLocalDateTime());
    }

   /**
    * Test getStreamSizeDemuxedString1AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedString1AsLocalTime());
        System.out.println("StreamSize_Demuxed/String1 AS LocalTime === " + jMetaDataText.getStreamSizeDemuxedString1AsLocalTime());
    }

   /**
    * Test getStreamSizeDemuxedString1AsString() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsString() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedString1AsString());
        System.out.println("StreamSize_Demuxed/String1 AS String === " + jMetaDataText.getStreamSizeDemuxedString1AsString());
    }

   /**
    * Test getStreamSizeDemuxedString1AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsBoolean() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedString1AsBoolean());
        System.out.println("StreamSize_Demuxed/String1 AS Boolean === " + jMetaDataText.getStreamSizeDemuxedString1AsBoolean());
    }

   /**
    * Test getStreamSizeDemuxedString1AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedString1AsBigInteger());
        System.out.println("StreamSize_Demuxed/String1 AS BigInteger === " + jMetaDataText.getStreamSizeDemuxedString1AsBigInteger());
    }

   /**
    * Test getStreamSizeDemuxedString1AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsURL() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedString1AsURL());
        System.out.println("StreamSize_Demuxed/String1 AS URL === " + jMetaDataText.getStreamSizeDemuxedString1AsURL());
    }

   /**
    * Test getStreamSizeEncodedString3AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString3AsInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedString3AsInteger());
        System.out.println("StreamSize_Encoded/String3 AS Integer === " + jMetaDataText.getStreamSizeEncodedString3AsInteger());
    }

   /**
    * Test getStreamSizeEncodedString3AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString3AsLong() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedString3AsLong());
        System.out.println("StreamSize_Encoded/String3 AS Long === " + jMetaDataText.getStreamSizeEncodedString3AsLong());
    }

   /**
    * Test getStreamSizeEncodedString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedString3AsLocalDateTime());
        System.out.println("StreamSize_Encoded/String3 AS LocalDateTime === " + jMetaDataText.getStreamSizeEncodedString3AsLocalDateTime());
    }

   /**
    * Test getStreamSizeEncodedString3AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString3AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedString3AsLocalTime());
        System.out.println("StreamSize_Encoded/String3 AS LocalTime === " + jMetaDataText.getStreamSizeEncodedString3AsLocalTime());
    }

   /**
    * Test getStreamSizeEncodedString3AsString() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString3AsString() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedString3AsString());
        System.out.println("StreamSize_Encoded/String3 AS String === " + jMetaDataText.getStreamSizeEncodedString3AsString());
    }

   /**
    * Test getStreamSizeEncodedString3AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString3AsBoolean() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedString3AsBoolean());
        System.out.println("StreamSize_Encoded/String3 AS Boolean === " + jMetaDataText.getStreamSizeEncodedString3AsBoolean());
    }

   /**
    * Test getStreamSizeEncodedString3AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString3AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedString3AsBigInteger());
        System.out.println("StreamSize_Encoded/String3 AS BigInteger === " + jMetaDataText.getStreamSizeEncodedString3AsBigInteger());
    }

   /**
    * Test getStreamSizeEncodedString3AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString3AsURL() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedString3AsURL());
        System.out.println("StreamSize_Encoded/String3 AS URL === " + jMetaDataText.getStreamSizeEncodedString3AsURL());
    }

   /**
    * Test getStreamSizeDemuxedString2AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedString2AsInteger());
        System.out.println("StreamSize_Demuxed/String2 AS Integer === " + jMetaDataText.getStreamSizeDemuxedString2AsInteger());
    }

   /**
    * Test getStreamSizeDemuxedString2AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsLong() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedString2AsLong());
        System.out.println("StreamSize_Demuxed/String2 AS Long === " + jMetaDataText.getStreamSizeDemuxedString2AsLong());
    }

   /**
    * Test getStreamSizeDemuxedString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedString2AsLocalDateTime());
        System.out.println("StreamSize_Demuxed/String2 AS LocalDateTime === " + jMetaDataText.getStreamSizeDemuxedString2AsLocalDateTime());
    }

   /**
    * Test getStreamSizeDemuxedString2AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedString2AsLocalTime());
        System.out.println("StreamSize_Demuxed/String2 AS LocalTime === " + jMetaDataText.getStreamSizeDemuxedString2AsLocalTime());
    }

   /**
    * Test getStreamSizeDemuxedString2AsString() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsString() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedString2AsString());
        System.out.println("StreamSize_Demuxed/String2 AS String === " + jMetaDataText.getStreamSizeDemuxedString2AsString());
    }

   /**
    * Test getStreamSizeDemuxedString2AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsBoolean() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedString2AsBoolean());
        System.out.println("StreamSize_Demuxed/String2 AS Boolean === " + jMetaDataText.getStreamSizeDemuxedString2AsBoolean());
    }

   /**
    * Test getStreamSizeDemuxedString2AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedString2AsBigInteger());
        System.out.println("StreamSize_Demuxed/String2 AS BigInteger === " + jMetaDataText.getStreamSizeDemuxedString2AsBigInteger());
    }

   /**
    * Test getStreamSizeDemuxedString2AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsURL() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedString2AsURL());
        System.out.println("StreamSize_Demuxed/String2 AS URL === " + jMetaDataText.getStreamSizeDemuxedString2AsURL());
    }

   /**
    * Test getStreamSizeDemuxedString3AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedString3AsInteger());
        System.out.println("StreamSize_Demuxed/String3 AS Integer === " + jMetaDataText.getStreamSizeDemuxedString3AsInteger());
    }

   /**
    * Test getStreamSizeDemuxedString3AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsLong() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedString3AsLong());
        System.out.println("StreamSize_Demuxed/String3 AS Long === " + jMetaDataText.getStreamSizeDemuxedString3AsLong());
    }

   /**
    * Test getStreamSizeDemuxedString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedString3AsLocalDateTime());
        System.out.println("StreamSize_Demuxed/String3 AS LocalDateTime === " + jMetaDataText.getStreamSizeDemuxedString3AsLocalDateTime());
    }

   /**
    * Test getStreamSizeDemuxedString3AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedString3AsLocalTime());
        System.out.println("StreamSize_Demuxed/String3 AS LocalTime === " + jMetaDataText.getStreamSizeDemuxedString3AsLocalTime());
    }

   /**
    * Test getStreamSizeDemuxedString3AsString() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsString() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedString3AsString());
        System.out.println("StreamSize_Demuxed/String3 AS String === " + jMetaDataText.getStreamSizeDemuxedString3AsString());
    }

   /**
    * Test getStreamSizeDemuxedString3AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsBoolean() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedString3AsBoolean());
        System.out.println("StreamSize_Demuxed/String3 AS Boolean === " + jMetaDataText.getStreamSizeDemuxedString3AsBoolean());
    }

   /**
    * Test getStreamSizeDemuxedString3AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedString3AsBigInteger());
        System.out.println("StreamSize_Demuxed/String3 AS BigInteger === " + jMetaDataText.getStreamSizeDemuxedString3AsBigInteger());
    }

   /**
    * Test getStreamSizeDemuxedString3AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsURL() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedString3AsURL());
        System.out.println("StreamSize_Demuxed/String3 AS URL === " + jMetaDataText.getStreamSizeDemuxedString3AsURL());
    }

   /**
    * Test getStreamSizeEncodedString1AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString1AsInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedString1AsInteger());
        System.out.println("StreamSize_Encoded/String1 AS Integer === " + jMetaDataText.getStreamSizeEncodedString1AsInteger());
    }

   /**
    * Test getStreamSizeEncodedString1AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString1AsLong() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedString1AsLong());
        System.out.println("StreamSize_Encoded/String1 AS Long === " + jMetaDataText.getStreamSizeEncodedString1AsLong());
    }

   /**
    * Test getStreamSizeEncodedString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedString1AsLocalDateTime());
        System.out.println("StreamSize_Encoded/String1 AS LocalDateTime === " + jMetaDataText.getStreamSizeEncodedString1AsLocalDateTime());
    }

   /**
    * Test getStreamSizeEncodedString1AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString1AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedString1AsLocalTime());
        System.out.println("StreamSize_Encoded/String1 AS LocalTime === " + jMetaDataText.getStreamSizeEncodedString1AsLocalTime());
    }

   /**
    * Test getStreamSizeEncodedString1AsString() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString1AsString() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedString1AsString());
        System.out.println("StreamSize_Encoded/String1 AS String === " + jMetaDataText.getStreamSizeEncodedString1AsString());
    }

   /**
    * Test getStreamSizeEncodedString1AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString1AsBoolean() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedString1AsBoolean());
        System.out.println("StreamSize_Encoded/String1 AS Boolean === " + jMetaDataText.getStreamSizeEncodedString1AsBoolean());
    }

   /**
    * Test getStreamSizeEncodedString1AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString1AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedString1AsBigInteger());
        System.out.println("StreamSize_Encoded/String1 AS BigInteger === " + jMetaDataText.getStreamSizeEncodedString1AsBigInteger());
    }

   /**
    * Test getStreamSizeEncodedString1AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString1AsURL() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedString1AsURL());
        System.out.println("StreamSize_Encoded/String1 AS URL === " + jMetaDataText.getStreamSizeEncodedString1AsURL());
    }

   /**
    * Test getLanguageStringAsInteger() method.
    */
    @Test
    public void subTestGetLanguageStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getLanguageStringAsInteger());
        System.out.println("Language (full) AS Integer === " + jMetaDataText.getLanguageStringAsInteger());
    }

   /**
    * Test getLanguageStringAsLong() method.
    */
    @Test
    public void subTestGetLanguageStringAsLong() {
        assertEquals(null, this.jMetaDataText.getLanguageStringAsLong());
        System.out.println("Language (full) AS Long === " + jMetaDataText.getLanguageStringAsLong());
    }

   /**
    * Test getLanguageStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetLanguageStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getLanguageStringAsLocalDateTime());
        System.out.println("Language (full) AS LocalDateTime === " + jMetaDataText.getLanguageStringAsLocalDateTime());
    }

   /**
    * Test getLanguageStringAsLocalTime() method.
    */
    @Test
    public void subTestGetLanguageStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getLanguageStringAsLocalTime());
        System.out.println("Language (full) AS LocalTime === " + jMetaDataText.getLanguageStringAsLocalTime());
    }

   /**
    * Test getLanguageStringAsString() method.
    */
    @Test
    public void subTestGetLanguageStringAsString() {
        assertEquals(null, this.jMetaDataText.getLanguageStringAsString());
        System.out.println("Language (full) AS String === " + jMetaDataText.getLanguageStringAsString());
    }

   /**
    * Test getLanguageStringAsBoolean() method.
    */
    @Test
    public void subTestGetLanguageStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getLanguageStringAsBoolean());
        System.out.println("Language (full) AS Boolean === " + jMetaDataText.getLanguageStringAsBoolean());
    }

   /**
    * Test getLanguageStringAsBigInteger() method.
    */
    @Test
    public void subTestGetLanguageStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getLanguageStringAsBigInteger());
        System.out.println("Language (full) AS BigInteger === " + jMetaDataText.getLanguageStringAsBigInteger());
    }

   /**
    * Test getLanguageStringAsURL() method.
    */
    @Test
    public void subTestGetLanguageStringAsURL() {
        assertEquals(null, this.jMetaDataText.getLanguageStringAsURL());
        System.out.println("Language (full) AS URL === " + jMetaDataText.getLanguageStringAsURL());
    }

   /**
    * Test getStreamSizeDemuxedString4AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedString4AsInteger());
        System.out.println("StreamSize_Demuxed/String4 AS Integer === " + jMetaDataText.getStreamSizeDemuxedString4AsInteger());
    }

   /**
    * Test getStreamSizeDemuxedString4AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsLong() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedString4AsLong());
        System.out.println("StreamSize_Demuxed/String4 AS Long === " + jMetaDataText.getStreamSizeDemuxedString4AsLong());
    }

   /**
    * Test getStreamSizeDemuxedString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedString4AsLocalDateTime());
        System.out.println("StreamSize_Demuxed/String4 AS LocalDateTime === " + jMetaDataText.getStreamSizeDemuxedString4AsLocalDateTime());
    }

   /**
    * Test getStreamSizeDemuxedString4AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedString4AsLocalTime());
        System.out.println("StreamSize_Demuxed/String4 AS LocalTime === " + jMetaDataText.getStreamSizeDemuxedString4AsLocalTime());
    }

   /**
    * Test getStreamSizeDemuxedString4AsString() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsString() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedString4AsString());
        System.out.println("StreamSize_Demuxed/String4 AS String === " + jMetaDataText.getStreamSizeDemuxedString4AsString());
    }

   /**
    * Test getStreamSizeDemuxedString4AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsBoolean() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedString4AsBoolean());
        System.out.println("StreamSize_Demuxed/String4 AS Boolean === " + jMetaDataText.getStreamSizeDemuxedString4AsBoolean());
    }

   /**
    * Test getStreamSizeDemuxedString4AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedString4AsBigInteger());
        System.out.println("StreamSize_Demuxed/String4 AS BigInteger === " + jMetaDataText.getStreamSizeDemuxedString4AsBigInteger());
    }

   /**
    * Test getStreamSizeDemuxedString4AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsURL() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedString4AsURL());
        System.out.println("StreamSize_Demuxed/String4 AS URL === " + jMetaDataText.getStreamSizeDemuxedString4AsURL());
    }

   /**
    * Test getStreamSizeDemuxedString5AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedString5AsInteger());
        System.out.println("StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use) AS Integer === " + jMetaDataText.getStreamSizeDemuxedString5AsInteger());
    }

   /**
    * Test getStreamSizeDemuxedString5AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsLong() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedString5AsLong());
        System.out.println("StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use) AS Long === " + jMetaDataText.getStreamSizeDemuxedString5AsLong());
    }

   /**
    * Test getStreamSizeDemuxedString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedString5AsLocalDateTime());
        System.out.println("StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use) AS LocalDateTime === " + jMetaDataText.getStreamSizeDemuxedString5AsLocalDateTime());
    }

   /**
    * Test getStreamSizeDemuxedString5AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedString5AsLocalTime());
        System.out.println("StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use) AS LocalTime === " + jMetaDataText.getStreamSizeDemuxedString5AsLocalTime());
    }

   /**
    * Test getStreamSizeDemuxedString5AsString() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsString() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedString5AsString());
        System.out.println("StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use) AS String === " + jMetaDataText.getStreamSizeDemuxedString5AsString());
    }

   /**
    * Test getStreamSizeDemuxedString5AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsBoolean() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedString5AsBoolean());
        System.out.println("StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use) AS Boolean === " + jMetaDataText.getStreamSizeDemuxedString5AsBoolean());
    }

   /**
    * Test getStreamSizeDemuxedString5AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedString5AsBigInteger());
        System.out.println("StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use) AS BigInteger === " + jMetaDataText.getStreamSizeDemuxedString5AsBigInteger());
    }

   /**
    * Test getStreamSizeDemuxedString5AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsURL() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedString5AsURL());
        System.out.println("StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use) AS URL === " + jMetaDataText.getStreamSizeDemuxedString5AsURL());
    }

   /**
    * Test getStreamSizeEncodedString4AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString4AsInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedString4AsInteger());
        System.out.println("StreamSize_Encoded/String4 AS Integer === " + jMetaDataText.getStreamSizeEncodedString4AsInteger());
    }

   /**
    * Test getStreamSizeEncodedString4AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString4AsLong() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedString4AsLong());
        System.out.println("StreamSize_Encoded/String4 AS Long === " + jMetaDataText.getStreamSizeEncodedString4AsLong());
    }

   /**
    * Test getStreamSizeEncodedString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedString4AsLocalDateTime());
        System.out.println("StreamSize_Encoded/String4 AS LocalDateTime === " + jMetaDataText.getStreamSizeEncodedString4AsLocalDateTime());
    }

   /**
    * Test getStreamSizeEncodedString4AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString4AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedString4AsLocalTime());
        System.out.println("StreamSize_Encoded/String4 AS LocalTime === " + jMetaDataText.getStreamSizeEncodedString4AsLocalTime());
    }

   /**
    * Test getStreamSizeEncodedString4AsString() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString4AsString() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedString4AsString());
        System.out.println("StreamSize_Encoded/String4 AS String === " + jMetaDataText.getStreamSizeEncodedString4AsString());
    }

   /**
    * Test getStreamSizeEncodedString4AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString4AsBoolean() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedString4AsBoolean());
        System.out.println("StreamSize_Encoded/String4 AS Boolean === " + jMetaDataText.getStreamSizeEncodedString4AsBoolean());
    }

   /**
    * Test getStreamSizeEncodedString4AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString4AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedString4AsBigInteger());
        System.out.println("StreamSize_Encoded/String4 AS BigInteger === " + jMetaDataText.getStreamSizeEncodedString4AsBigInteger());
    }

   /**
    * Test getStreamSizeEncodedString4AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString4AsURL() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedString4AsURL());
        System.out.println("StreamSize_Encoded/String4 AS URL === " + jMetaDataText.getStreamSizeEncodedString4AsURL());
    }

   /**
    * Test getFrameRateOriginalStringAsInteger() method.
    */
    @Test
    public void subTestGetFrameRateOriginalStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getFrameRateOriginalStringAsInteger());
        System.out.println("Original (in the raw stream) Frames per second (with measurement) AS Integer === " + jMetaDataText.getFrameRateOriginalStringAsInteger());
    }

   /**
    * Test getFrameRateOriginalStringAsLong() method.
    */
    @Test
    public void subTestGetFrameRateOriginalStringAsLong() {
        assertEquals(null, this.jMetaDataText.getFrameRateOriginalStringAsLong());
        System.out.println("Original (in the raw stream) Frames per second (with measurement) AS Long === " + jMetaDataText.getFrameRateOriginalStringAsLong());
    }

   /**
    * Test getFrameRateOriginalStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFrameRateOriginalStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getFrameRateOriginalStringAsLocalDateTime());
        System.out.println("Original (in the raw stream) Frames per second (with measurement) AS LocalDateTime === " + jMetaDataText.getFrameRateOriginalStringAsLocalDateTime());
    }

   /**
    * Test getFrameRateOriginalStringAsLocalTime() method.
    */
    @Test
    public void subTestGetFrameRateOriginalStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getFrameRateOriginalStringAsLocalTime());
        System.out.println("Original (in the raw stream) Frames per second (with measurement) AS LocalTime === " + jMetaDataText.getFrameRateOriginalStringAsLocalTime());
    }

   /**
    * Test getFrameRateOriginalStringAsString() method.
    */
    @Test
    public void subTestGetFrameRateOriginalStringAsString() {
        assertEquals(null, this.jMetaDataText.getFrameRateOriginalStringAsString());
        System.out.println("Original (in the raw stream) Frames per second (with measurement) AS String === " + jMetaDataText.getFrameRateOriginalStringAsString());
    }

   /**
    * Test getFrameRateOriginalStringAsBoolean() method.
    */
    @Test
    public void subTestGetFrameRateOriginalStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getFrameRateOriginalStringAsBoolean());
        System.out.println("Original (in the raw stream) Frames per second (with measurement) AS Boolean === " + jMetaDataText.getFrameRateOriginalStringAsBoolean());
    }

   /**
    * Test getFrameRateOriginalStringAsBigInteger() method.
    */
    @Test
    public void subTestGetFrameRateOriginalStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getFrameRateOriginalStringAsBigInteger());
        System.out.println("Original (in the raw stream) Frames per second (with measurement) AS BigInteger === " + jMetaDataText.getFrameRateOriginalStringAsBigInteger());
    }

   /**
    * Test getFrameRateOriginalStringAsURL() method.
    */
    @Test
    public void subTestGetFrameRateOriginalStringAsURL() {
        assertEquals(null, this.jMetaDataText.getFrameRateOriginalStringAsURL());
        System.out.println("Original (in the raw stream) Frames per second (with measurement) AS URL === " + jMetaDataText.getFrameRateOriginalStringAsURL());
    }

   /**
    * Test getElementCountAsInteger() method.
    */
    @Test
    public void subTestGetElementCountAsInteger() {
        assertEquals(null, this.jMetaDataText.getElementCountAsInteger());
        System.out.println("Number of displayed elements AS Integer === " + jMetaDataText.getElementCountAsInteger());
    }

   /**
    * Test getElementCountAsLong() method.
    */
    @Test
    public void subTestGetElementCountAsLong() {
        assertEquals(null, this.jMetaDataText.getElementCountAsLong());
        System.out.println("Number of displayed elements AS Long === " + jMetaDataText.getElementCountAsLong());
    }

   /**
    * Test getElementCountAsLocalDateTime() method.
    */
    @Test
    public void subTestGetElementCountAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getElementCountAsLocalDateTime());
        System.out.println("Number of displayed elements AS LocalDateTime === " + jMetaDataText.getElementCountAsLocalDateTime());
    }

   /**
    * Test getElementCountAsLocalTime() method.
    */
    @Test
    public void subTestGetElementCountAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getElementCountAsLocalTime());
        System.out.println("Number of displayed elements AS LocalTime === " + jMetaDataText.getElementCountAsLocalTime());
    }

   /**
    * Test getElementCountAsString() method.
    */
    @Test
    public void subTestGetElementCountAsString() {
        assertEquals(null, this.jMetaDataText.getElementCountAsString());
        System.out.println("Number of displayed elements AS String === " + jMetaDataText.getElementCountAsString());
    }

   /**
    * Test getElementCountAsBoolean() method.
    */
    @Test
    public void subTestGetElementCountAsBoolean() {
        assertEquals(null, this.jMetaDataText.getElementCountAsBoolean());
        System.out.println("Number of displayed elements AS Boolean === " + jMetaDataText.getElementCountAsBoolean());
    }

   /**
    * Test getElementCountAsBigInteger() method.
    */
    @Test
    public void subTestGetElementCountAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getElementCountAsBigInteger());
        System.out.println("Number of displayed elements AS BigInteger === " + jMetaDataText.getElementCountAsBigInteger());
    }

   /**
    * Test getElementCountAsURL() method.
    */
    @Test
    public void subTestGetElementCountAsURL() {
        assertEquals(null, this.jMetaDataText.getElementCountAsURL());
        System.out.println("Number of displayed elements AS URL === " + jMetaDataText.getElementCountAsURL());
    }

   /**
    * Test getStreamSizeEncodedString5AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString5AsInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedString5AsInteger());
        System.out.println("Encoded Streamsize in with percentage value AS Integer === " + jMetaDataText.getStreamSizeEncodedString5AsInteger());
    }

   /**
    * Test getStreamSizeEncodedString5AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString5AsLong() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedString5AsLong());
        System.out.println("Encoded Streamsize in with percentage value AS Long === " + jMetaDataText.getStreamSizeEncodedString5AsLong());
    }

   /**
    * Test getStreamSizeEncodedString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedString5AsLocalDateTime());
        System.out.println("Encoded Streamsize in with percentage value AS LocalDateTime === " + jMetaDataText.getStreamSizeEncodedString5AsLocalDateTime());
    }

   /**
    * Test getStreamSizeEncodedString5AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString5AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedString5AsLocalTime());
        System.out.println("Encoded Streamsize in with percentage value AS LocalTime === " + jMetaDataText.getStreamSizeEncodedString5AsLocalTime());
    }

   /**
    * Test getStreamSizeEncodedString5AsString() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString5AsString() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedString5AsString());
        System.out.println("Encoded Streamsize in with percentage value AS String === " + jMetaDataText.getStreamSizeEncodedString5AsString());
    }

   /**
    * Test getStreamSizeEncodedString5AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString5AsBoolean() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedString5AsBoolean());
        System.out.println("Encoded Streamsize in with percentage value AS Boolean === " + jMetaDataText.getStreamSizeEncodedString5AsBoolean());
    }

   /**
    * Test getStreamSizeEncodedString5AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString5AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedString5AsBigInteger());
        System.out.println("Encoded Streamsize in with percentage value AS BigInteger === " + jMetaDataText.getStreamSizeEncodedString5AsBigInteger());
    }

   /**
    * Test getStreamSizeEncodedString5AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedString5AsURL() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedString5AsURL());
        System.out.println("Encoded Streamsize in with percentage value AS URL === " + jMetaDataText.getStreamSizeEncodedString5AsURL());
    }

   /**
    * Test getDurationLastFrameString5AsInteger() method.
    */
    @Test
    public void subTestGetDurationLastFrameString5AsInteger() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameString5AsInteger());
        System.out.println("Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Integer === " + jMetaDataText.getDurationLastFrameString5AsInteger());
    }

   /**
    * Test getDurationLastFrameString5AsLong() method.
    */
    @Test
    public void subTestGetDurationLastFrameString5AsLong() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameString5AsLong());
        System.out.println("Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Long === " + jMetaDataText.getDurationLastFrameString5AsLong());
    }

   /**
    * Test getDurationLastFrameString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationLastFrameString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameString5AsLocalDateTime());
        System.out.println("Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS LocalDateTime === " + jMetaDataText.getDurationLastFrameString5AsLocalDateTime());
    }

   /**
    * Test getDurationLastFrameString5AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationLastFrameString5AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameString5AsLocalTime());
        System.out.println("Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS LocalTime === " + jMetaDataText.getDurationLastFrameString5AsLocalTime());
    }

   /**
    * Test getDurationLastFrameString5AsString() method.
    */
    @Test
    public void subTestGetDurationLastFrameString5AsString() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameString5AsString());
        System.out.println("Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS String === " + jMetaDataText.getDurationLastFrameString5AsString());
    }

   /**
    * Test getDurationLastFrameString5AsBoolean() method.
    */
    @Test
    public void subTestGetDurationLastFrameString5AsBoolean() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameString5AsBoolean());
        System.out.println("Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Boolean === " + jMetaDataText.getDurationLastFrameString5AsBoolean());
    }

   /**
    * Test getDurationLastFrameString5AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationLastFrameString5AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameString5AsBigInteger());
        System.out.println("Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS BigInteger === " + jMetaDataText.getDurationLastFrameString5AsBigInteger());
    }

   /**
    * Test getDurationLastFrameString5AsURL() method.
    */
    @Test
    public void subTestGetDurationLastFrameString5AsURL() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameString5AsURL());
        System.out.println("Duration of the last frame if it is longer than others, in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS URL === " + jMetaDataText.getDurationLastFrameString5AsURL());
    }

   /**
    * Test getDurationLastFrameString4AsInteger() method.
    */
    @Test
    public void subTestGetDurationLastFrameString4AsInteger() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameString4AsInteger());
        System.out.println("Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Integer === " + jMetaDataText.getDurationLastFrameString4AsInteger());
    }

   /**
    * Test getDurationLastFrameString4AsLong() method.
    */
    @Test
    public void subTestGetDurationLastFrameString4AsLong() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameString4AsLong());
        System.out.println("Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Long === " + jMetaDataText.getDurationLastFrameString4AsLong());
    }

   /**
    * Test getDurationLastFrameString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationLastFrameString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameString4AsLocalDateTime());
        System.out.println("Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS LocalDateTime === " + jMetaDataText.getDurationLastFrameString4AsLocalDateTime());
    }

   /**
    * Test getDurationLastFrameString4AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationLastFrameString4AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameString4AsLocalTime());
        System.out.println("Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS LocalTime === " + jMetaDataText.getDurationLastFrameString4AsLocalTime());
    }

   /**
    * Test getDurationLastFrameString4AsString() method.
    */
    @Test
    public void subTestGetDurationLastFrameString4AsString() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameString4AsString());
        System.out.println("Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS String === " + jMetaDataText.getDurationLastFrameString4AsString());
    }

   /**
    * Test getDurationLastFrameString4AsBoolean() method.
    */
    @Test
    public void subTestGetDurationLastFrameString4AsBoolean() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameString4AsBoolean());
        System.out.println("Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Boolean === " + jMetaDataText.getDurationLastFrameString4AsBoolean());
    }

   /**
    * Test getDurationLastFrameString4AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationLastFrameString4AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameString4AsBigInteger());
        System.out.println("Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS BigInteger === " + jMetaDataText.getDurationLastFrameString4AsBigInteger());
    }

   /**
    * Test getDurationLastFrameString4AsURL() method.
    */
    @Test
    public void subTestGetDurationLastFrameString4AsURL() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameString4AsURL());
        System.out.println("Duration of the last frame if it is longer than others, in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS URL === " + jMetaDataText.getDurationLastFrameString4AsURL());
    }

   /**
    * Test getStreamSizeDemuxedStringAsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedStringAsInteger());
        System.out.println("StreamSize_Demuxed in with percentage value AS Integer === " + jMetaDataText.getStreamSizeDemuxedStringAsInteger());
    }

   /**
    * Test getStreamSizeDemuxedStringAsLong() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsLong() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedStringAsLong());
        System.out.println("StreamSize_Demuxed in with percentage value AS Long === " + jMetaDataText.getStreamSizeDemuxedStringAsLong());
    }

   /**
    * Test getStreamSizeDemuxedStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedStringAsLocalDateTime());
        System.out.println("StreamSize_Demuxed in with percentage value AS LocalDateTime === " + jMetaDataText.getStreamSizeDemuxedStringAsLocalDateTime());
    }

   /**
    * Test getStreamSizeDemuxedStringAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedStringAsLocalTime());
        System.out.println("StreamSize_Demuxed in with percentage value AS LocalTime === " + jMetaDataText.getStreamSizeDemuxedStringAsLocalTime());
    }

   /**
    * Test getStreamSizeDemuxedStringAsString() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsString() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedStringAsString());
        System.out.println("StreamSize_Demuxed in with percentage value AS String === " + jMetaDataText.getStreamSizeDemuxedStringAsString());
    }

   /**
    * Test getStreamSizeDemuxedStringAsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedStringAsBoolean());
        System.out.println("StreamSize_Demuxed in with percentage value AS Boolean === " + jMetaDataText.getStreamSizeDemuxedStringAsBoolean());
    }

   /**
    * Test getStreamSizeDemuxedStringAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedStringAsBigInteger());
        System.out.println("StreamSize_Demuxed in with percentage value AS BigInteger === " + jMetaDataText.getStreamSizeDemuxedStringAsBigInteger());
    }

   /**
    * Test getStreamSizeDemuxedStringAsURL() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsURL() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedStringAsURL());
        System.out.println("StreamSize_Demuxed in with percentage value AS URL === " + jMetaDataText.getStreamSizeDemuxedStringAsURL());
    }

   /**
    * Test getForcedStringAsInteger() method.
    */
    @Test
    public void subTestGetForcedStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getForcedStringAsInteger());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS Integer === " + jMetaDataText.getForcedStringAsInteger());
    }

   /**
    * Test getForcedStringAsLong() method.
    */
    @Test
    public void subTestGetForcedStringAsLong() {
        assertEquals(null, this.jMetaDataText.getForcedStringAsLong());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS Long === " + jMetaDataText.getForcedStringAsLong());
    }

   /**
    * Test getForcedStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetForcedStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getForcedStringAsLocalDateTime());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS LocalDateTime === " + jMetaDataText.getForcedStringAsLocalDateTime());
    }

   /**
    * Test getForcedStringAsLocalTime() method.
    */
    @Test
    public void subTestGetForcedStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getForcedStringAsLocalTime());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS LocalTime === " + jMetaDataText.getForcedStringAsLocalTime());
    }

   /**
    * Test getForcedStringAsString() method.
    */
    @Test
    public void subTestGetForcedStringAsString() {
        assertEquals(null, this.jMetaDataText.getForcedStringAsString());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS String === " + jMetaDataText.getForcedStringAsString());
    }

   /**
    * Test getForcedStringAsBoolean() method.
    */
    @Test
    public void subTestGetForcedStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getForcedStringAsBoolean());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS Boolean === " + jMetaDataText.getForcedStringAsBoolean());
    }

   /**
    * Test getForcedStringAsBigInteger() method.
    */
    @Test
    public void subTestGetForcedStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getForcedStringAsBigInteger());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS BigInteger === " + jMetaDataText.getForcedStringAsBigInteger());
    }

   /**
    * Test getForcedStringAsURL() method.
    */
    @Test
    public void subTestGetForcedStringAsURL() {
        assertEquals(null, this.jMetaDataText.getForcedStringAsURL());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS URL === " + jMetaDataText.getForcedStringAsURL());
    }

   /**
    * Test getBitDepthAsInteger() method.
    */
    @Test
    public void subTestGetBitDepthAsInteger() {
        assertEquals(null, this.jMetaDataText.getBitDepthAsInteger());
        System.out.println("BitDepth AS Integer === " + jMetaDataText.getBitDepthAsInteger());
    }

   /**
    * Test getBitDepthAsLong() method.
    */
    @Test
    public void subTestGetBitDepthAsLong() {
        assertEquals(null, this.jMetaDataText.getBitDepthAsLong());
        System.out.println("BitDepth AS Long === " + jMetaDataText.getBitDepthAsLong());
    }

   /**
    * Test getBitDepthAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitDepthAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getBitDepthAsLocalDateTime());
        System.out.println("BitDepth AS LocalDateTime === " + jMetaDataText.getBitDepthAsLocalDateTime());
    }

   /**
    * Test getBitDepthAsLocalTime() method.
    */
    @Test
    public void subTestGetBitDepthAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getBitDepthAsLocalTime());
        System.out.println("BitDepth AS LocalTime === " + jMetaDataText.getBitDepthAsLocalTime());
    }

   /**
    * Test getBitDepthAsString() method.
    */
    @Test
    public void subTestGetBitDepthAsString() {
        assertEquals(null, this.jMetaDataText.getBitDepthAsString());
        System.out.println("BitDepth AS String === " + jMetaDataText.getBitDepthAsString());
    }

   /**
    * Test getBitDepthAsBoolean() method.
    */
    @Test
    public void subTestGetBitDepthAsBoolean() {
        assertEquals(null, this.jMetaDataText.getBitDepthAsBoolean());
        System.out.println("BitDepth AS Boolean === " + jMetaDataText.getBitDepthAsBoolean());
    }

   /**
    * Test getBitDepthAsBigInteger() method.
    */
    @Test
    public void subTestGetBitDepthAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getBitDepthAsBigInteger());
        System.out.println("BitDepth AS BigInteger === " + jMetaDataText.getBitDepthAsBigInteger());
    }

   /**
    * Test getBitDepthAsURL() method.
    */
    @Test
    public void subTestGetBitDepthAsURL() {
        assertEquals(null, this.jMetaDataText.getBitDepthAsURL());
        System.out.println("BitDepth AS URL === " + jMetaDataText.getBitDepthAsURL());
    }

   /**
    * Test getStreamSizeEncodedAsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedAsInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedAsInteger());
        System.out.println("Encoded Streamsize in bytes AS Integer === " + jMetaDataText.getStreamSizeEncodedAsInteger());
    }

   /**
    * Test getStreamSizeEncodedAsLong() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedAsLong() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedAsLong());
        System.out.println("Encoded Streamsize in bytes AS Long === " + jMetaDataText.getStreamSizeEncodedAsLong());
    }

   /**
    * Test getStreamSizeEncodedAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedAsLocalDateTime());
        System.out.println("Encoded Streamsize in bytes AS LocalDateTime === " + jMetaDataText.getStreamSizeEncodedAsLocalDateTime());
    }

   /**
    * Test getStreamSizeEncodedAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedAsLocalTime());
        System.out.println("Encoded Streamsize in bytes AS LocalTime === " + jMetaDataText.getStreamSizeEncodedAsLocalTime());
    }

   /**
    * Test getStreamSizeEncodedAsString() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedAsString() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedAsString());
        System.out.println("Encoded Streamsize in bytes AS String === " + jMetaDataText.getStreamSizeEncodedAsString());
    }

   /**
    * Test getStreamSizeEncodedAsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedAsBoolean() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedAsBoolean());
        System.out.println("Encoded Streamsize in bytes AS Boolean === " + jMetaDataText.getStreamSizeEncodedAsBoolean());
    }

   /**
    * Test getStreamSizeEncodedAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedAsBigInteger());
        System.out.println("Encoded Streamsize in bytes AS BigInteger === " + jMetaDataText.getStreamSizeEncodedAsBigInteger());
    }

   /**
    * Test getStreamSizeEncodedAsURL() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedAsURL() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedAsURL());
        System.out.println("Encoded Streamsize in bytes AS URL === " + jMetaDataText.getStreamSizeEncodedAsURL());
    }

   /**
    * Test getStreamCountAsInteger() method.
    */
    @Test
    public void subTestGetStreamCountAsInteger() {
        assertEquals(null, this.jMetaDataText.getStreamCountAsInteger());
        System.out.println("Count of streams of that kind available AS Integer === " + jMetaDataText.getStreamCountAsInteger());
    }

   /**
    * Test getStreamCountAsLong() method.
    */
    @Test
    public void subTestGetStreamCountAsLong() {
        assertEquals(null, this.jMetaDataText.getStreamCountAsLong());
        System.out.println("Count of streams of that kind available AS Long === " + jMetaDataText.getStreamCountAsLong());
    }

   /**
    * Test getStreamCountAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamCountAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getStreamCountAsLocalDateTime());
        System.out.println("Count of streams of that kind available AS LocalDateTime === " + jMetaDataText.getStreamCountAsLocalDateTime());
    }

   /**
    * Test getStreamCountAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamCountAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getStreamCountAsLocalTime());
        System.out.println("Count of streams of that kind available AS LocalTime === " + jMetaDataText.getStreamCountAsLocalTime());
    }

   /**
    * Test getStreamCountAsString() method.
    */
    @Test
    public void subTestGetStreamCountAsString() {
        assertEquals(null, this.jMetaDataText.getStreamCountAsString());
        System.out.println("Count of streams of that kind available AS String === " + jMetaDataText.getStreamCountAsString());
    }

   /**
    * Test getStreamCountAsBoolean() method.
    */
    @Test
    public void subTestGetStreamCountAsBoolean() {
        assertEquals(null, this.jMetaDataText.getStreamCountAsBoolean());
        System.out.println("Count of streams of that kind available AS Boolean === " + jMetaDataText.getStreamCountAsBoolean());
    }

   /**
    * Test getStreamCountAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamCountAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getStreamCountAsBigInteger());
        System.out.println("Count of streams of that kind available AS BigInteger === " + jMetaDataText.getStreamCountAsBigInteger());
    }

   /**
    * Test getStreamCountAsURL() method.
    */
    @Test
    public void subTestGetStreamCountAsURL() {
        assertEquals(null, this.jMetaDataText.getStreamCountAsURL());
        System.out.println("Count of streams of that kind available AS URL === " + jMetaDataText.getStreamCountAsURL());
    }

   /**
    * Test getStreamSizeEncodedStringAsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedStringAsInteger());
        System.out.println("Encoded Streamsize in with percentage value AS Integer === " + jMetaDataText.getStreamSizeEncodedStringAsInteger());
    }

   /**
    * Test getStreamSizeEncodedStringAsLong() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedStringAsLong() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedStringAsLong());
        System.out.println("Encoded Streamsize in with percentage value AS Long === " + jMetaDataText.getStreamSizeEncodedStringAsLong());
    }

   /**
    * Test getStreamSizeEncodedStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedStringAsLocalDateTime());
        System.out.println("Encoded Streamsize in with percentage value AS LocalDateTime === " + jMetaDataText.getStreamSizeEncodedStringAsLocalDateTime());
    }

   /**
    * Test getStreamSizeEncodedStringAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedStringAsLocalTime());
        System.out.println("Encoded Streamsize in with percentage value AS LocalTime === " + jMetaDataText.getStreamSizeEncodedStringAsLocalTime());
    }

   /**
    * Test getStreamSizeEncodedStringAsString() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedStringAsString() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedStringAsString());
        System.out.println("Encoded Streamsize in with percentage value AS String === " + jMetaDataText.getStreamSizeEncodedStringAsString());
    }

   /**
    * Test getStreamSizeEncodedStringAsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedStringAsBoolean());
        System.out.println("Encoded Streamsize in with percentage value AS Boolean === " + jMetaDataText.getStreamSizeEncodedStringAsBoolean());
    }

   /**
    * Test getStreamSizeEncodedStringAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedStringAsBigInteger());
        System.out.println("Encoded Streamsize in with percentage value AS BigInteger === " + jMetaDataText.getStreamSizeEncodedStringAsBigInteger());
    }

   /**
    * Test getStreamSizeEncodedStringAsURL() method.
    */
    @Test
    public void subTestGetStreamSizeEncodedStringAsURL() {
        assertEquals(null, this.jMetaDataText.getStreamSizeEncodedStringAsURL());
        System.out.println("Encoded Streamsize in with percentage value AS URL === " + jMetaDataText.getStreamSizeEncodedStringAsURL());
    }

   /**
    * Test getDurationString2AsInteger() method.
    */
    @Test
    public void subTestGetDurationString2AsInteger() {
        assertEquals(null, this.jMetaDataText.getDurationString2AsInteger());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS Integer === " + jMetaDataText.getDurationString2AsInteger());
    }

   /**
    * Test getDurationString2AsLong() method.
    */
    @Test
    public void subTestGetDurationString2AsLong() {
        assertEquals(null, this.jMetaDataText.getDurationString2AsLong());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS Long === " + jMetaDataText.getDurationString2AsLong());
    }

   /**
    * Test getDurationString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDurationString2AsLocalDateTime());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS LocalDateTime === " + jMetaDataText.getDurationString2AsLocalDateTime());
    }

   /**
    * Test getDurationString2AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationString2AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDurationString2AsLocalTime());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS LocalTime === " + jMetaDataText.getDurationString2AsLocalTime());
    }

   /**
    * Test getDurationString2AsString() method.
    */
    @Test
    public void subTestGetDurationString2AsString() {
        assertEquals(null, this.jMetaDataText.getDurationString2AsString());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS String === " + jMetaDataText.getDurationString2AsString());
    }

   /**
    * Test getDurationString2AsBoolean() method.
    */
    @Test
    public void subTestGetDurationString2AsBoolean() {
        assertEquals(null, this.jMetaDataText.getDurationString2AsBoolean());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS Boolean === " + jMetaDataText.getDurationString2AsBoolean());
    }

   /**
    * Test getDurationString2AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationString2AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDurationString2AsBigInteger());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS BigInteger === " + jMetaDataText.getDurationString2AsBigInteger());
    }

   /**
    * Test getDurationString2AsURL() method.
    */
    @Test
    public void subTestGetDurationString2AsURL() {
        assertEquals(null, this.jMetaDataText.getDurationString2AsURL());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS URL === " + jMetaDataText.getDurationString2AsURL());
    }

   /**
    * Test getDurationString3AsInteger() method.
    */
    @Test
    public void subTestGetDurationString3AsInteger() {
        assertEquals(null, this.jMetaDataText.getDurationString3AsInteger());
        System.out.println("Play time in format : HH:MM:SS.MMM AS Integer === " + jMetaDataText.getDurationString3AsInteger());
    }

   /**
    * Test getDurationString3AsLong() method.
    */
    @Test
    public void subTestGetDurationString3AsLong() {
        assertEquals(null, this.jMetaDataText.getDurationString3AsLong());
        System.out.println("Play time in format : HH:MM:SS.MMM AS Long === " + jMetaDataText.getDurationString3AsLong());
    }

   /**
    * Test getDurationString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDurationString3AsLocalDateTime());
        System.out.println("Play time in format : HH:MM:SS.MMM AS LocalDateTime === " + jMetaDataText.getDurationString3AsLocalDateTime());
    }

   /**
    * Test getDurationString3AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationString3AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDurationString3AsLocalTime());
        System.out.println("Play time in format : HH:MM:SS.MMM AS LocalTime === " + jMetaDataText.getDurationString3AsLocalTime());
    }

   /**
    * Test getDurationString3AsString() method.
    */
    @Test
    public void subTestGetDurationString3AsString() {
        assertEquals(null, this.jMetaDataText.getDurationString3AsString());
        System.out.println("Play time in format : HH:MM:SS.MMM AS String === " + jMetaDataText.getDurationString3AsString());
    }

   /**
    * Test getDurationString3AsBoolean() method.
    */
    @Test
    public void subTestGetDurationString3AsBoolean() {
        assertEquals(null, this.jMetaDataText.getDurationString3AsBoolean());
        System.out.println("Play time in format : HH:MM:SS.MMM AS Boolean === " + jMetaDataText.getDurationString3AsBoolean());
    }

   /**
    * Test getDurationString3AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationString3AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDurationString3AsBigInteger());
        System.out.println("Play time in format : HH:MM:SS.MMM AS BigInteger === " + jMetaDataText.getDurationString3AsBigInteger());
    }

   /**
    * Test getDurationString3AsURL() method.
    */
    @Test
    public void subTestGetDurationString3AsURL() {
        assertEquals(null, this.jMetaDataText.getDurationString3AsURL());
        System.out.println("Play time in format : HH:MM:SS.MMM AS URL === " + jMetaDataText.getDurationString3AsURL());
    }

   /**
    * Test getDurationString1AsInteger() method.
    */
    @Test
    public void subTestGetDurationString1AsInteger() {
        assertEquals(null, this.jMetaDataText.getDurationString1AsInteger());
        System.out.println("Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS Integer === " + jMetaDataText.getDurationString1AsInteger());
    }

   /**
    * Test getDurationString1AsLong() method.
    */
    @Test
    public void subTestGetDurationString1AsLong() {
        assertEquals(null, this.jMetaDataText.getDurationString1AsLong());
        System.out.println("Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS Long === " + jMetaDataText.getDurationString1AsLong());
    }

   /**
    * Test getDurationString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDurationString1AsLocalDateTime());
        System.out.println("Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS LocalDateTime === " + jMetaDataText.getDurationString1AsLocalDateTime());
    }

   /**
    * Test getDurationString1AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationString1AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDurationString1AsLocalTime());
        System.out.println("Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS LocalTime === " + jMetaDataText.getDurationString1AsLocalTime());
    }

   /**
    * Test getDurationString1AsString() method.
    */
    @Test
    public void subTestGetDurationString1AsString() {
        assertEquals(null, this.jMetaDataText.getDurationString1AsString());
        System.out.println("Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS String === " + jMetaDataText.getDurationString1AsString());
    }

   /**
    * Test getDurationString1AsBoolean() method.
    */
    @Test
    public void subTestGetDurationString1AsBoolean() {
        assertEquals(null, this.jMetaDataText.getDurationString1AsBoolean());
        System.out.println("Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS Boolean === " + jMetaDataText.getDurationString1AsBoolean());
    }

   /**
    * Test getDurationString1AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationString1AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDurationString1AsBigInteger());
        System.out.println("Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS BigInteger === " + jMetaDataText.getDurationString1AsBigInteger());
    }

   /**
    * Test getDurationString1AsURL() method.
    */
    @Test
    public void subTestGetDurationString1AsURL() {
        assertEquals(null, this.jMetaDataText.getDurationString1AsURL());
        System.out.println("Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS URL === " + jMetaDataText.getDurationString1AsURL());
    }

   /**
    * Test getDurationString4AsInteger() method.
    */
    @Test
    public void subTestGetDurationString4AsInteger() {
        assertEquals(null, this.jMetaDataText.getDurationString4AsInteger());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Integer === " + jMetaDataText.getDurationString4AsInteger());
    }

   /**
    * Test getDurationString4AsLong() method.
    */
    @Test
    public void subTestGetDurationString4AsLong() {
        assertEquals(null, this.jMetaDataText.getDurationString4AsLong());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Long === " + jMetaDataText.getDurationString4AsLong());
    }

   /**
    * Test getDurationString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDurationString4AsLocalDateTime());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS LocalDateTime === " + jMetaDataText.getDurationString4AsLocalDateTime());
    }

   /**
    * Test getDurationString4AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationString4AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDurationString4AsLocalTime());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS LocalTime === " + jMetaDataText.getDurationString4AsLocalTime());
    }

   /**
    * Test getDurationString4AsString() method.
    */
    @Test
    public void subTestGetDurationString4AsString() {
        assertEquals(null, this.jMetaDataText.getDurationString4AsString());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS String === " + jMetaDataText.getDurationString4AsString());
    }

   /**
    * Test getDurationString4AsBoolean() method.
    */
    @Test
    public void subTestGetDurationString4AsBoolean() {
        assertEquals(null, this.jMetaDataText.getDurationString4AsBoolean());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Boolean === " + jMetaDataText.getDurationString4AsBoolean());
    }

   /**
    * Test getDurationString4AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationString4AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDurationString4AsBigInteger());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS BigInteger === " + jMetaDataText.getDurationString4AsBigInteger());
    }

   /**
    * Test getDurationString4AsURL() method.
    */
    @Test
    public void subTestGetDurationString4AsURL() {
        assertEquals(null, this.jMetaDataText.getDurationString4AsURL());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS URL === " + jMetaDataText.getDurationString4AsURL());
    }

   /**
    * Test getDurationString5AsInteger() method.
    */
    @Test
    public void subTestGetDurationString5AsInteger() {
        assertEquals(null, this.jMetaDataText.getDurationString5AsInteger());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Integer === " + jMetaDataText.getDurationString5AsInteger());
    }

   /**
    * Test getDurationString5AsLong() method.
    */
    @Test
    public void subTestGetDurationString5AsLong() {
        assertEquals(null, this.jMetaDataText.getDurationString5AsLong());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Long === " + jMetaDataText.getDurationString5AsLong());
    }

   /**
    * Test getDurationString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDurationString5AsLocalDateTime());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS LocalDateTime === " + jMetaDataText.getDurationString5AsLocalDateTime());
    }

   /**
    * Test getDurationString5AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationString5AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDurationString5AsLocalTime());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS LocalTime === " + jMetaDataText.getDurationString5AsLocalTime());
    }

   /**
    * Test getDurationString5AsString() method.
    */
    @Test
    public void subTestGetDurationString5AsString() {
        assertEquals(null, this.jMetaDataText.getDurationString5AsString());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS String === " + jMetaDataText.getDurationString5AsString());
    }

   /**
    * Test getDurationString5AsBoolean() method.
    */
    @Test
    public void subTestGetDurationString5AsBoolean() {
        assertEquals(null, this.jMetaDataText.getDurationString5AsBoolean());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Boolean === " + jMetaDataText.getDurationString5AsBoolean());
    }

   /**
    * Test getDurationString5AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationString5AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDurationString5AsBigInteger());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS BigInteger === " + jMetaDataText.getDurationString5AsBigInteger());
    }

   /**
    * Test getDurationString5AsURL() method.
    */
    @Test
    public void subTestGetDurationString5AsURL() {
        assertEquals(null, this.jMetaDataText.getDurationString5AsURL());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS URL === " + jMetaDataText.getDurationString5AsURL());
    }

   /**
    * Test getBitRateEncodedAsInteger() method.
    */
    @Test
    public void subTestGetBitRateEncodedAsInteger() {
        assertEquals(null, this.jMetaDataText.getBitRateEncodedAsInteger());
        System.out.println("Encoded (with forced padding) bit rate in bps, if some container padding is present AS Integer === " + jMetaDataText.getBitRateEncodedAsInteger());
    }

   /**
    * Test getBitRateEncodedAsLong() method.
    */
    @Test
    public void subTestGetBitRateEncodedAsLong() {
        assertEquals(null, this.jMetaDataText.getBitRateEncodedAsLong());
        System.out.println("Encoded (with forced padding) bit rate in bps, if some container padding is present AS Long === " + jMetaDataText.getBitRateEncodedAsLong());
    }

   /**
    * Test getBitRateEncodedAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitRateEncodedAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getBitRateEncodedAsLocalDateTime());
        System.out.println("Encoded (with forced padding) bit rate in bps, if some container padding is present AS LocalDateTime === " + jMetaDataText.getBitRateEncodedAsLocalDateTime());
    }

   /**
    * Test getBitRateEncodedAsLocalTime() method.
    */
    @Test
    public void subTestGetBitRateEncodedAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getBitRateEncodedAsLocalTime());
        System.out.println("Encoded (with forced padding) bit rate in bps, if some container padding is present AS LocalTime === " + jMetaDataText.getBitRateEncodedAsLocalTime());
    }

   /**
    * Test getBitRateEncodedAsString() method.
    */
    @Test
    public void subTestGetBitRateEncodedAsString() {
        assertEquals(null, this.jMetaDataText.getBitRateEncodedAsString());
        System.out.println("Encoded (with forced padding) bit rate in bps, if some container padding is present AS String === " + jMetaDataText.getBitRateEncodedAsString());
    }

   /**
    * Test getBitRateEncodedAsBoolean() method.
    */
    @Test
    public void subTestGetBitRateEncodedAsBoolean() {
        assertEquals(null, this.jMetaDataText.getBitRateEncodedAsBoolean());
        System.out.println("Encoded (with forced padding) bit rate in bps, if some container padding is present AS Boolean === " + jMetaDataText.getBitRateEncodedAsBoolean());
    }

   /**
    * Test getBitRateEncodedAsBigInteger() method.
    */
    @Test
    public void subTestGetBitRateEncodedAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getBitRateEncodedAsBigInteger());
        System.out.println("Encoded (with forced padding) bit rate in bps, if some container padding is present AS BigInteger === " + jMetaDataText.getBitRateEncodedAsBigInteger());
    }

   /**
    * Test getBitRateEncodedAsURL() method.
    */
    @Test
    public void subTestGetBitRateEncodedAsURL() {
        assertEquals(null, this.jMetaDataText.getBitRateEncodedAsURL());
        System.out.println("Encoded (with forced padding) bit rate in bps, if some container padding is present AS URL === " + jMetaDataText.getBitRateEncodedAsURL());
    }

   /**
    * Test getDelaySourceAsInteger() method.
    */
    @Test
    public void subTestGetDelaySourceAsInteger() {
        assertEquals(null, this.jMetaDataText.getDelaySourceAsInteger());
        System.out.println("Delay source (Container or Stream or empty) AS Integer === " + jMetaDataText.getDelaySourceAsInteger());
    }

   /**
    * Test getDelaySourceAsLong() method.
    */
    @Test
    public void subTestGetDelaySourceAsLong() {
        assertEquals(null, this.jMetaDataText.getDelaySourceAsLong());
        System.out.println("Delay source (Container or Stream or empty) AS Long === " + jMetaDataText.getDelaySourceAsLong());
    }

   /**
    * Test getDelaySourceAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelaySourceAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDelaySourceAsLocalDateTime());
        System.out.println("Delay source (Container or Stream or empty) AS LocalDateTime === " + jMetaDataText.getDelaySourceAsLocalDateTime());
    }

   /**
    * Test getDelaySourceAsLocalTime() method.
    */
    @Test
    public void subTestGetDelaySourceAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDelaySourceAsLocalTime());
        System.out.println("Delay source (Container or Stream or empty) AS LocalTime === " + jMetaDataText.getDelaySourceAsLocalTime());
    }

   /**
    * Test getDelaySourceAsString() method.
    */
    @Test
    public void subTestGetDelaySourceAsString() {
        assertEquals(null, this.jMetaDataText.getDelaySourceAsString());
        System.out.println("Delay source (Container or Stream or empty) AS String === " + jMetaDataText.getDelaySourceAsString());
    }

   /**
    * Test getDelaySourceAsBoolean() method.
    */
    @Test
    public void subTestGetDelaySourceAsBoolean() {
        assertEquals(null, this.jMetaDataText.getDelaySourceAsBoolean());
        System.out.println("Delay source (Container or Stream or empty) AS Boolean === " + jMetaDataText.getDelaySourceAsBoolean());
    }

   /**
    * Test getDelaySourceAsBigInteger() method.
    */
    @Test
    public void subTestGetDelaySourceAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDelaySourceAsBigInteger());
        System.out.println("Delay source (Container or Stream or empty) AS BigInteger === " + jMetaDataText.getDelaySourceAsBigInteger());
    }

   /**
    * Test getDelaySourceAsURL() method.
    */
    @Test
    public void subTestGetDelaySourceAsURL() {
        assertEquals(null, this.jMetaDataText.getDelaySourceAsURL());
        System.out.println("Delay source (Container or Stream or empty) AS URL === " + jMetaDataText.getDelaySourceAsURL());
    }

   /**
    * Test getDelayOriginalDropFrameAsInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalDropFrameAsInteger() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalDropFrameAsInteger());
        System.out.println("Delay drop frame info AS Integer === " + jMetaDataText.getDelayOriginalDropFrameAsInteger());
    }

   /**
    * Test getDelayOriginalDropFrameAsLong() method.
    */
    @Test
    public void subTestGetDelayOriginalDropFrameAsLong() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalDropFrameAsLong());
        System.out.println("Delay drop frame info AS Long === " + jMetaDataText.getDelayOriginalDropFrameAsLong());
    }

   /**
    * Test getDelayOriginalDropFrameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayOriginalDropFrameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalDropFrameAsLocalDateTime());
        System.out.println("Delay drop frame info AS LocalDateTime === " + jMetaDataText.getDelayOriginalDropFrameAsLocalDateTime());
    }

   /**
    * Test getDelayOriginalDropFrameAsLocalTime() method.
    */
    @Test
    public void subTestGetDelayOriginalDropFrameAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalDropFrameAsLocalTime());
        System.out.println("Delay drop frame info AS LocalTime === " + jMetaDataText.getDelayOriginalDropFrameAsLocalTime());
    }

   /**
    * Test getDelayOriginalDropFrameAsString() method.
    */
    @Test
    public void subTestGetDelayOriginalDropFrameAsString() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalDropFrameAsString());
        System.out.println("Delay drop frame info AS String === " + jMetaDataText.getDelayOriginalDropFrameAsString());
    }

   /**
    * Test getDelayOriginalDropFrameAsBoolean() method.
    */
    @Test
    public void subTestGetDelayOriginalDropFrameAsBoolean() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalDropFrameAsBoolean());
        System.out.println("Delay drop frame info AS Boolean === " + jMetaDataText.getDelayOriginalDropFrameAsBoolean());
    }

   /**
    * Test getDelayOriginalDropFrameAsBigInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalDropFrameAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalDropFrameAsBigInteger());
        System.out.println("Delay drop frame info AS BigInteger === " + jMetaDataText.getDelayOriginalDropFrameAsBigInteger());
    }

   /**
    * Test getDelayOriginalDropFrameAsURL() method.
    */
    @Test
    public void subTestGetDelayOriginalDropFrameAsURL() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalDropFrameAsURL());
        System.out.println("Delay drop frame info AS URL === " + jMetaDataText.getDelayOriginalDropFrameAsURL());
    }

   /**
    * Test getDurationLastFrameString1AsInteger() method.
    */
    @Test
    public void subTestGetDurationLastFrameString1AsInteger() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameString1AsInteger());
        System.out.println("Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS Integer === " + jMetaDataText.getDurationLastFrameString1AsInteger());
    }

   /**
    * Test getDurationLastFrameString1AsLong() method.
    */
    @Test
    public void subTestGetDurationLastFrameString1AsLong() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameString1AsLong());
        System.out.println("Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS Long === " + jMetaDataText.getDurationLastFrameString1AsLong());
    }

   /**
    * Test getDurationLastFrameString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationLastFrameString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameString1AsLocalDateTime());
        System.out.println("Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS LocalDateTime === " + jMetaDataText.getDurationLastFrameString1AsLocalDateTime());
    }

   /**
    * Test getDurationLastFrameString1AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationLastFrameString1AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameString1AsLocalTime());
        System.out.println("Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS LocalTime === " + jMetaDataText.getDurationLastFrameString1AsLocalTime());
    }

   /**
    * Test getDurationLastFrameString1AsString() method.
    */
    @Test
    public void subTestGetDurationLastFrameString1AsString() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameString1AsString());
        System.out.println("Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS String === " + jMetaDataText.getDurationLastFrameString1AsString());
    }

   /**
    * Test getDurationLastFrameString1AsBoolean() method.
    */
    @Test
    public void subTestGetDurationLastFrameString1AsBoolean() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameString1AsBoolean());
        System.out.println("Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS Boolean === " + jMetaDataText.getDurationLastFrameString1AsBoolean());
    }

   /**
    * Test getDurationLastFrameString1AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationLastFrameString1AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameString1AsBigInteger());
        System.out.println("Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS BigInteger === " + jMetaDataText.getDurationLastFrameString1AsBigInteger());
    }

   /**
    * Test getDurationLastFrameString1AsURL() method.
    */
    @Test
    public void subTestGetDurationLastFrameString1AsURL() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameString1AsURL());
        System.out.println("Duration of the last frame if it is longer than others, in format : HHh MMmn SSs MMMms, XX omited if zero AS URL === " + jMetaDataText.getDurationLastFrameString1AsURL());
    }

   /**
    * Test getDelayOriginalStringAsInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalStringAsInteger());
        System.out.println("Delay with measurement AS Integer === " + jMetaDataText.getDelayOriginalStringAsInteger());
    }

   /**
    * Test getDelayOriginalStringAsLong() method.
    */
    @Test
    public void subTestGetDelayOriginalStringAsLong() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalStringAsLong());
        System.out.println("Delay with measurement AS Long === " + jMetaDataText.getDelayOriginalStringAsLong());
    }

   /**
    * Test getDelayOriginalStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayOriginalStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalStringAsLocalDateTime());
        System.out.println("Delay with measurement AS LocalDateTime === " + jMetaDataText.getDelayOriginalStringAsLocalDateTime());
    }

   /**
    * Test getDelayOriginalStringAsLocalTime() method.
    */
    @Test
    public void subTestGetDelayOriginalStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalStringAsLocalTime());
        System.out.println("Delay with measurement AS LocalTime === " + jMetaDataText.getDelayOriginalStringAsLocalTime());
    }

   /**
    * Test getDelayOriginalStringAsString() method.
    */
    @Test
    public void subTestGetDelayOriginalStringAsString() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalStringAsString());
        System.out.println("Delay with measurement AS String === " + jMetaDataText.getDelayOriginalStringAsString());
    }

   /**
    * Test getDelayOriginalStringAsBoolean() method.
    */
    @Test
    public void subTestGetDelayOriginalStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalStringAsBoolean());
        System.out.println("Delay with measurement AS Boolean === " + jMetaDataText.getDelayOriginalStringAsBoolean());
    }

   /**
    * Test getDelayOriginalStringAsBigInteger() method.
    */
    @Test
    public void subTestGetDelayOriginalStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalStringAsBigInteger());
        System.out.println("Delay with measurement AS BigInteger === " + jMetaDataText.getDelayOriginalStringAsBigInteger());
    }

   /**
    * Test getDelayOriginalStringAsURL() method.
    */
    @Test
    public void subTestGetDelayOriginalStringAsURL() {
        assertEquals(null, this.jMetaDataText.getDelayOriginalStringAsURL());
        System.out.println("Delay with measurement AS URL === " + jMetaDataText.getDelayOriginalStringAsURL());
    }

   /**
    * Test getDurationLastFrameString3AsInteger() method.
    */
    @Test
    public void subTestGetDurationLastFrameString3AsInteger() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameString3AsInteger());
        System.out.println("Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM AS Integer === " + jMetaDataText.getDurationLastFrameString3AsInteger());
    }

   /**
    * Test getDurationLastFrameString3AsLong() method.
    */
    @Test
    public void subTestGetDurationLastFrameString3AsLong() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameString3AsLong());
        System.out.println("Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM AS Long === " + jMetaDataText.getDurationLastFrameString3AsLong());
    }

   /**
    * Test getDurationLastFrameString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationLastFrameString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameString3AsLocalDateTime());
        System.out.println("Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM AS LocalDateTime === " + jMetaDataText.getDurationLastFrameString3AsLocalDateTime());
    }

   /**
    * Test getDurationLastFrameString3AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationLastFrameString3AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameString3AsLocalTime());
        System.out.println("Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM AS LocalTime === " + jMetaDataText.getDurationLastFrameString3AsLocalTime());
    }

   /**
    * Test getDurationLastFrameString3AsString() method.
    */
    @Test
    public void subTestGetDurationLastFrameString3AsString() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameString3AsString());
        System.out.println("Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM AS String === " + jMetaDataText.getDurationLastFrameString3AsString());
    }

   /**
    * Test getDurationLastFrameString3AsBoolean() method.
    */
    @Test
    public void subTestGetDurationLastFrameString3AsBoolean() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameString3AsBoolean());
        System.out.println("Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM AS Boolean === " + jMetaDataText.getDurationLastFrameString3AsBoolean());
    }

   /**
    * Test getDurationLastFrameString3AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationLastFrameString3AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameString3AsBigInteger());
        System.out.println("Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM AS BigInteger === " + jMetaDataText.getDurationLastFrameString3AsBigInteger());
    }

   /**
    * Test getDurationLastFrameString3AsURL() method.
    */
    @Test
    public void subTestGetDurationLastFrameString3AsURL() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameString3AsURL());
        System.out.println("Duration of the last frame if it is longer than others, in format : HH:MM:SS.MMM AS URL === " + jMetaDataText.getDurationLastFrameString3AsURL());
    }

   /**
    * Test getDurationLastFrameString2AsInteger() method.
    */
    @Test
    public void subTestGetDurationLastFrameString2AsInteger() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameString2AsInteger());
        System.out.println("Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Integer === " + jMetaDataText.getDurationLastFrameString2AsInteger());
    }

   /**
    * Test getDurationLastFrameString2AsLong() method.
    */
    @Test
    public void subTestGetDurationLastFrameString2AsLong() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameString2AsLong());
        System.out.println("Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Long === " + jMetaDataText.getDurationLastFrameString2AsLong());
    }

   /**
    * Test getDurationLastFrameString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationLastFrameString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameString2AsLocalDateTime());
        System.out.println("Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS LocalDateTime === " + jMetaDataText.getDurationLastFrameString2AsLocalDateTime());
    }

   /**
    * Test getDurationLastFrameString2AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationLastFrameString2AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameString2AsLocalTime());
        System.out.println("Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS LocalTime === " + jMetaDataText.getDurationLastFrameString2AsLocalTime());
    }

   /**
    * Test getDurationLastFrameString2AsString() method.
    */
    @Test
    public void subTestGetDurationLastFrameString2AsString() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameString2AsString());
        System.out.println("Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS String === " + jMetaDataText.getDurationLastFrameString2AsString());
    }

   /**
    * Test getDurationLastFrameString2AsBoolean() method.
    */
    @Test
    public void subTestGetDurationLastFrameString2AsBoolean() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameString2AsBoolean());
        System.out.println("Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS Boolean === " + jMetaDataText.getDurationLastFrameString2AsBoolean());
    }

   /**
    * Test getDurationLastFrameString2AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationLastFrameString2AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameString2AsBigInteger());
        System.out.println("Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS BigInteger === " + jMetaDataText.getDurationLastFrameString2AsBigInteger());
    }

   /**
    * Test getDurationLastFrameString2AsURL() method.
    */
    @Test
    public void subTestGetDurationLastFrameString2AsURL() {
        assertEquals(null, this.jMetaDataText.getDurationLastFrameString2AsURL());
        System.out.println("Duration of the last frame if it is longer than others, in format : XXx YYy only, YYy omited if zero AS URL === " + jMetaDataText.getDurationLastFrameString2AsURL());
    }

   /**
    * Test getStreamSizeDemuxedAsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedAsInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedAsInteger());
        System.out.println("StreamSize in bytes of hte stream after demux AS Integer === " + jMetaDataText.getStreamSizeDemuxedAsInteger());
    }

   /**
    * Test getStreamSizeDemuxedAsLong() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedAsLong() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedAsLong());
        System.out.println("StreamSize in bytes of hte stream after demux AS Long === " + jMetaDataText.getStreamSizeDemuxedAsLong());
    }

   /**
    * Test getStreamSizeDemuxedAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedAsLocalDateTime());
        System.out.println("StreamSize in bytes of hte stream after demux AS LocalDateTime === " + jMetaDataText.getStreamSizeDemuxedAsLocalDateTime());
    }

   /**
    * Test getStreamSizeDemuxedAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedAsLocalTime());
        System.out.println("StreamSize in bytes of hte stream after demux AS LocalTime === " + jMetaDataText.getStreamSizeDemuxedAsLocalTime());
    }

   /**
    * Test getStreamSizeDemuxedAsString() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedAsString() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedAsString());
        System.out.println("StreamSize in bytes of hte stream after demux AS String === " + jMetaDataText.getStreamSizeDemuxedAsString());
    }

   /**
    * Test getStreamSizeDemuxedAsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedAsBoolean() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedAsBoolean());
        System.out.println("StreamSize in bytes of hte stream after demux AS Boolean === " + jMetaDataText.getStreamSizeDemuxedAsBoolean());
    }

   /**
    * Test getStreamSizeDemuxedAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedAsBigInteger());
        System.out.println("StreamSize in bytes of hte stream after demux AS BigInteger === " + jMetaDataText.getStreamSizeDemuxedAsBigInteger());
    }

   /**
    * Test getStreamSizeDemuxedAsURL() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedAsURL() {
        assertEquals(null, this.jMetaDataText.getStreamSizeDemuxedAsURL());
        System.out.println("StreamSize in bytes of hte stream after demux AS URL === " + jMetaDataText.getStreamSizeDemuxedAsURL());
    }

   /**
    * Test getFormatSettingsAsInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsAsInteger() {
        assertEquals(null, this.jMetaDataText.getFormatSettingsAsInteger());
        System.out.println("Settings needed for decoder used AS Integer === " + jMetaDataText.getFormatSettingsAsInteger());
    }

   /**
    * Test getFormatSettingsAsLong() method.
    */
    @Test
    public void subTestGetFormatSettingsAsLong() {
        assertEquals(null, this.jMetaDataText.getFormatSettingsAsLong());
        System.out.println("Settings needed for decoder used AS Long === " + jMetaDataText.getFormatSettingsAsLong());
    }

   /**
    * Test getFormatSettingsAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatSettingsAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getFormatSettingsAsLocalDateTime());
        System.out.println("Settings needed for decoder used AS LocalDateTime === " + jMetaDataText.getFormatSettingsAsLocalDateTime());
    }

   /**
    * Test getFormatSettingsAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatSettingsAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getFormatSettingsAsLocalTime());
        System.out.println("Settings needed for decoder used AS LocalTime === " + jMetaDataText.getFormatSettingsAsLocalTime());
    }

   /**
    * Test getFormatSettingsAsString() method.
    */
    @Test
    public void subTestGetFormatSettingsAsString() {
        assertEquals(null, this.jMetaDataText.getFormatSettingsAsString());
        System.out.println("Settings needed for decoder used AS String === " + jMetaDataText.getFormatSettingsAsString());
    }

   /**
    * Test getFormatSettingsAsBoolean() method.
    */
    @Test
    public void subTestGetFormatSettingsAsBoolean() {
        assertEquals(null, this.jMetaDataText.getFormatSettingsAsBoolean());
        System.out.println("Settings needed for decoder used AS Boolean === " + jMetaDataText.getFormatSettingsAsBoolean());
    }

   /**
    * Test getFormatSettingsAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getFormatSettingsAsBigInteger());
        System.out.println("Settings needed for decoder used AS BigInteger === " + jMetaDataText.getFormatSettingsAsBigInteger());
    }

   /**
    * Test getFormatSettingsAsURL() method.
    */
    @Test
    public void subTestGetFormatSettingsAsURL() {
        assertEquals(null, this.jMetaDataText.getFormatSettingsAsURL());
        System.out.println("Settings needed for decoder used AS URL === " + jMetaDataText.getFormatSettingsAsURL());
    }

   /**
    * Test getServiceKindAsInteger() method.
    */
    @Test
    public void subTestGetServiceKindAsInteger() {
        assertEquals(null, this.jMetaDataText.getServiceKindAsInteger());
        System.out.println("Service kind, e.g. visually impaired, commentary, voice over AS Integer === " + jMetaDataText.getServiceKindAsInteger());
    }

   /**
    * Test getServiceKindAsLong() method.
    */
    @Test
    public void subTestGetServiceKindAsLong() {
        assertEquals(null, this.jMetaDataText.getServiceKindAsLong());
        System.out.println("Service kind, e.g. visually impaired, commentary, voice over AS Long === " + jMetaDataText.getServiceKindAsLong());
    }

   /**
    * Test getServiceKindAsLocalDateTime() method.
    */
    @Test
    public void subTestGetServiceKindAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getServiceKindAsLocalDateTime());
        System.out.println("Service kind, e.g. visually impaired, commentary, voice over AS LocalDateTime === " + jMetaDataText.getServiceKindAsLocalDateTime());
    }

   /**
    * Test getServiceKindAsLocalTime() method.
    */
    @Test
    public void subTestGetServiceKindAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getServiceKindAsLocalTime());
        System.out.println("Service kind, e.g. visually impaired, commentary, voice over AS LocalTime === " + jMetaDataText.getServiceKindAsLocalTime());
    }

   /**
    * Test getServiceKindAsString() method.
    */
    @Test
    public void subTestGetServiceKindAsString() {
        assertEquals(null, this.jMetaDataText.getServiceKindAsString());
        System.out.println("Service kind, e.g. visually impaired, commentary, voice over AS String === " + jMetaDataText.getServiceKindAsString());
    }

   /**
    * Test getServiceKindAsBoolean() method.
    */
    @Test
    public void subTestGetServiceKindAsBoolean() {
        assertEquals(null, this.jMetaDataText.getServiceKindAsBoolean());
        System.out.println("Service kind, e.g. visually impaired, commentary, voice over AS Boolean === " + jMetaDataText.getServiceKindAsBoolean());
    }

   /**
    * Test getServiceKindAsBigInteger() method.
    */
    @Test
    public void subTestGetServiceKindAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getServiceKindAsBigInteger());
        System.out.println("Service kind, e.g. visually impaired, commentary, voice over AS BigInteger === " + jMetaDataText.getServiceKindAsBigInteger());
    }

   /**
    * Test getServiceKindAsURL() method.
    */
    @Test
    public void subTestGetServiceKindAsURL() {
        assertEquals(null, this.jMetaDataText.getServiceKindAsURL());
        System.out.println("Service kind, e.g. visually impaired, commentary, voice over AS URL === " + jMetaDataText.getServiceKindAsURL());
    }

   /**
    * Test getFirstPacketOrderAsInteger() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsInteger() {
        assertEquals(null, this.jMetaDataText.getFirstPacketOrderAsInteger());
        System.out.println("Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0) AS Integer === " + jMetaDataText.getFirstPacketOrderAsInteger());
    }

   /**
    * Test getFirstPacketOrderAsLong() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsLong() {
        assertEquals(null, this.jMetaDataText.getFirstPacketOrderAsLong());
        System.out.println("Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0) AS Long === " + jMetaDataText.getFirstPacketOrderAsLong());
    }

   /**
    * Test getFirstPacketOrderAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getFirstPacketOrderAsLocalDateTime());
        System.out.println("Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0) AS LocalDateTime === " + jMetaDataText.getFirstPacketOrderAsLocalDateTime());
    }

   /**
    * Test getFirstPacketOrderAsLocalTime() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getFirstPacketOrderAsLocalTime());
        System.out.println("Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0) AS LocalTime === " + jMetaDataText.getFirstPacketOrderAsLocalTime());
    }

   /**
    * Test getFirstPacketOrderAsString() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsString() {
        assertEquals(null, this.jMetaDataText.getFirstPacketOrderAsString());
        System.out.println("Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0) AS String === " + jMetaDataText.getFirstPacketOrderAsString());
    }

   /**
    * Test getFirstPacketOrderAsBoolean() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsBoolean() {
        assertEquals(null, this.jMetaDataText.getFirstPacketOrderAsBoolean());
        System.out.println("Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0) AS Boolean === " + jMetaDataText.getFirstPacketOrderAsBoolean());
    }

   /**
    * Test getFirstPacketOrderAsBigInteger() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getFirstPacketOrderAsBigInteger());
        System.out.println("Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0) AS BigInteger === " + jMetaDataText.getFirstPacketOrderAsBigInteger());
    }

   /**
    * Test getFirstPacketOrderAsURL() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsURL() {
        assertEquals(null, this.jMetaDataText.getFirstPacketOrderAsURL());
        System.out.println("Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0) AS URL === " + jMetaDataText.getFirstPacketOrderAsURL());
    }

   /**
    * Test getVideoDelayString5AsInteger() method.
    */
    @Test
    public void subTestGetVideoDelayString5AsInteger() {
        assertEquals(null, this.jMetaDataText.getVideoDelayString5AsInteger());
        System.out.println("Video_Delay/String5 AS Integer === " + jMetaDataText.getVideoDelayString5AsInteger());
    }

   /**
    * Test getVideoDelayString5AsLong() method.
    */
    @Test
    public void subTestGetVideoDelayString5AsLong() {
        assertEquals(null, this.jMetaDataText.getVideoDelayString5AsLong());
        System.out.println("Video_Delay/String5 AS Long === " + jMetaDataText.getVideoDelayString5AsLong());
    }

   /**
    * Test getVideoDelayString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetVideoDelayString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getVideoDelayString5AsLocalDateTime());
        System.out.println("Video_Delay/String5 AS LocalDateTime === " + jMetaDataText.getVideoDelayString5AsLocalDateTime());
    }

   /**
    * Test getVideoDelayString5AsLocalTime() method.
    */
    @Test
    public void subTestGetVideoDelayString5AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getVideoDelayString5AsLocalTime());
        System.out.println("Video_Delay/String5 AS LocalTime === " + jMetaDataText.getVideoDelayString5AsLocalTime());
    }

   /**
    * Test getVideoDelayString5AsString() method.
    */
    @Test
    public void subTestGetVideoDelayString5AsString() {
        assertEquals(null, this.jMetaDataText.getVideoDelayString5AsString());
        System.out.println("Video_Delay/String5 AS String === " + jMetaDataText.getVideoDelayString5AsString());
    }

   /**
    * Test getVideoDelayString5AsBoolean() method.
    */
    @Test
    public void subTestGetVideoDelayString5AsBoolean() {
        assertEquals(null, this.jMetaDataText.getVideoDelayString5AsBoolean());
        System.out.println("Video_Delay/String5 AS Boolean === " + jMetaDataText.getVideoDelayString5AsBoolean());
    }

   /**
    * Test getVideoDelayString5AsBigInteger() method.
    */
    @Test
    public void subTestGetVideoDelayString5AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getVideoDelayString5AsBigInteger());
        System.out.println("Video_Delay/String5 AS BigInteger === " + jMetaDataText.getVideoDelayString5AsBigInteger());
    }

   /**
    * Test getVideoDelayString5AsURL() method.
    */
    @Test
    public void subTestGetVideoDelayString5AsURL() {
        assertEquals(null, this.jMetaDataText.getVideoDelayString5AsURL());
        System.out.println("Video_Delay/String5 AS URL === " + jMetaDataText.getVideoDelayString5AsURL());
    }

   /**
    * Test getVideoDelayString1AsInteger() method.
    */
    @Test
    public void subTestGetVideoDelayString1AsInteger() {
        assertEquals(null, this.jMetaDataText.getVideoDelayString1AsInteger());
        System.out.println("Video_Delay/String1 AS Integer === " + jMetaDataText.getVideoDelayString1AsInteger());
    }

   /**
    * Test getVideoDelayString1AsLong() method.
    */
    @Test
    public void subTestGetVideoDelayString1AsLong() {
        assertEquals(null, this.jMetaDataText.getVideoDelayString1AsLong());
        System.out.println("Video_Delay/String1 AS Long === " + jMetaDataText.getVideoDelayString1AsLong());
    }

   /**
    * Test getVideoDelayString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetVideoDelayString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getVideoDelayString1AsLocalDateTime());
        System.out.println("Video_Delay/String1 AS LocalDateTime === " + jMetaDataText.getVideoDelayString1AsLocalDateTime());
    }

   /**
    * Test getVideoDelayString1AsLocalTime() method.
    */
    @Test
    public void subTestGetVideoDelayString1AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getVideoDelayString1AsLocalTime());
        System.out.println("Video_Delay/String1 AS LocalTime === " + jMetaDataText.getVideoDelayString1AsLocalTime());
    }

   /**
    * Test getVideoDelayString1AsString() method.
    */
    @Test
    public void subTestGetVideoDelayString1AsString() {
        assertEquals(null, this.jMetaDataText.getVideoDelayString1AsString());
        System.out.println("Video_Delay/String1 AS String === " + jMetaDataText.getVideoDelayString1AsString());
    }

   /**
    * Test getVideoDelayString1AsBoolean() method.
    */
    @Test
    public void subTestGetVideoDelayString1AsBoolean() {
        assertEquals(null, this.jMetaDataText.getVideoDelayString1AsBoolean());
        System.out.println("Video_Delay/String1 AS Boolean === " + jMetaDataText.getVideoDelayString1AsBoolean());
    }

   /**
    * Test getVideoDelayString1AsBigInteger() method.
    */
    @Test
    public void subTestGetVideoDelayString1AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getVideoDelayString1AsBigInteger());
        System.out.println("Video_Delay/String1 AS BigInteger === " + jMetaDataText.getVideoDelayString1AsBigInteger());
    }

   /**
    * Test getVideoDelayString1AsURL() method.
    */
    @Test
    public void subTestGetVideoDelayString1AsURL() {
        assertEquals(null, this.jMetaDataText.getVideoDelayString1AsURL());
        System.out.println("Video_Delay/String1 AS URL === " + jMetaDataText.getVideoDelayString1AsURL());
    }

   /**
    * Test getVideoDelayString2AsInteger() method.
    */
    @Test
    public void subTestGetVideoDelayString2AsInteger() {
        assertEquals(null, this.jMetaDataText.getVideoDelayString2AsInteger());
        System.out.println("Video_Delay/String2 AS Integer === " + jMetaDataText.getVideoDelayString2AsInteger());
    }

   /**
    * Test getVideoDelayString2AsLong() method.
    */
    @Test
    public void subTestGetVideoDelayString2AsLong() {
        assertEquals(null, this.jMetaDataText.getVideoDelayString2AsLong());
        System.out.println("Video_Delay/String2 AS Long === " + jMetaDataText.getVideoDelayString2AsLong());
    }

   /**
    * Test getVideoDelayString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetVideoDelayString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getVideoDelayString2AsLocalDateTime());
        System.out.println("Video_Delay/String2 AS LocalDateTime === " + jMetaDataText.getVideoDelayString2AsLocalDateTime());
    }

   /**
    * Test getVideoDelayString2AsLocalTime() method.
    */
    @Test
    public void subTestGetVideoDelayString2AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getVideoDelayString2AsLocalTime());
        System.out.println("Video_Delay/String2 AS LocalTime === " + jMetaDataText.getVideoDelayString2AsLocalTime());
    }

   /**
    * Test getVideoDelayString2AsString() method.
    */
    @Test
    public void subTestGetVideoDelayString2AsString() {
        assertEquals(null, this.jMetaDataText.getVideoDelayString2AsString());
        System.out.println("Video_Delay/String2 AS String === " + jMetaDataText.getVideoDelayString2AsString());
    }

   /**
    * Test getVideoDelayString2AsBoolean() method.
    */
    @Test
    public void subTestGetVideoDelayString2AsBoolean() {
        assertEquals(null, this.jMetaDataText.getVideoDelayString2AsBoolean());
        System.out.println("Video_Delay/String2 AS Boolean === " + jMetaDataText.getVideoDelayString2AsBoolean());
    }

   /**
    * Test getVideoDelayString2AsBigInteger() method.
    */
    @Test
    public void subTestGetVideoDelayString2AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getVideoDelayString2AsBigInteger());
        System.out.println("Video_Delay/String2 AS BigInteger === " + jMetaDataText.getVideoDelayString2AsBigInteger());
    }

   /**
    * Test getVideoDelayString2AsURL() method.
    */
    @Test
    public void subTestGetVideoDelayString2AsURL() {
        assertEquals(null, this.jMetaDataText.getVideoDelayString2AsURL());
        System.out.println("Video_Delay/String2 AS URL === " + jMetaDataText.getVideoDelayString2AsURL());
    }

   /**
    * Test getVideoDelayString3AsInteger() method.
    */
    @Test
    public void subTestGetVideoDelayString3AsInteger() {
        assertEquals(null, this.jMetaDataText.getVideoDelayString3AsInteger());
        System.out.println("Video_Delay/String3 AS Integer === " + jMetaDataText.getVideoDelayString3AsInteger());
    }

   /**
    * Test getVideoDelayString3AsLong() method.
    */
    @Test
    public void subTestGetVideoDelayString3AsLong() {
        assertEquals(null, this.jMetaDataText.getVideoDelayString3AsLong());
        System.out.println("Video_Delay/String3 AS Long === " + jMetaDataText.getVideoDelayString3AsLong());
    }

   /**
    * Test getVideoDelayString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetVideoDelayString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getVideoDelayString3AsLocalDateTime());
        System.out.println("Video_Delay/String3 AS LocalDateTime === " + jMetaDataText.getVideoDelayString3AsLocalDateTime());
    }

   /**
    * Test getVideoDelayString3AsLocalTime() method.
    */
    @Test
    public void subTestGetVideoDelayString3AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getVideoDelayString3AsLocalTime());
        System.out.println("Video_Delay/String3 AS LocalTime === " + jMetaDataText.getVideoDelayString3AsLocalTime());
    }

   /**
    * Test getVideoDelayString3AsString() method.
    */
    @Test
    public void subTestGetVideoDelayString3AsString() {
        assertEquals(null, this.jMetaDataText.getVideoDelayString3AsString());
        System.out.println("Video_Delay/String3 AS String === " + jMetaDataText.getVideoDelayString3AsString());
    }

   /**
    * Test getVideoDelayString3AsBoolean() method.
    */
    @Test
    public void subTestGetVideoDelayString3AsBoolean() {
        assertEquals(null, this.jMetaDataText.getVideoDelayString3AsBoolean());
        System.out.println("Video_Delay/String3 AS Boolean === " + jMetaDataText.getVideoDelayString3AsBoolean());
    }

   /**
    * Test getVideoDelayString3AsBigInteger() method.
    */
    @Test
    public void subTestGetVideoDelayString3AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getVideoDelayString3AsBigInteger());
        System.out.println("Video_Delay/String3 AS BigInteger === " + jMetaDataText.getVideoDelayString3AsBigInteger());
    }

   /**
    * Test getVideoDelayString3AsURL() method.
    */
    @Test
    public void subTestGetVideoDelayString3AsURL() {
        assertEquals(null, this.jMetaDataText.getVideoDelayString3AsURL());
        System.out.println("Video_Delay/String3 AS URL === " + jMetaDataText.getVideoDelayString3AsURL());
    }

   /**
    * Test getVideoDelayString4AsInteger() method.
    */
    @Test
    public void subTestGetVideoDelayString4AsInteger() {
        assertEquals(null, this.jMetaDataText.getVideoDelayString4AsInteger());
        System.out.println("Video_Delay/String4 AS Integer === " + jMetaDataText.getVideoDelayString4AsInteger());
    }

   /**
    * Test getVideoDelayString4AsLong() method.
    */
    @Test
    public void subTestGetVideoDelayString4AsLong() {
        assertEquals(null, this.jMetaDataText.getVideoDelayString4AsLong());
        System.out.println("Video_Delay/String4 AS Long === " + jMetaDataText.getVideoDelayString4AsLong());
    }

   /**
    * Test getVideoDelayString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetVideoDelayString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getVideoDelayString4AsLocalDateTime());
        System.out.println("Video_Delay/String4 AS LocalDateTime === " + jMetaDataText.getVideoDelayString4AsLocalDateTime());
    }

   /**
    * Test getVideoDelayString4AsLocalTime() method.
    */
    @Test
    public void subTestGetVideoDelayString4AsLocalTime() {
        assertEquals(null, this.jMetaDataText.getVideoDelayString4AsLocalTime());
        System.out.println("Video_Delay/String4 AS LocalTime === " + jMetaDataText.getVideoDelayString4AsLocalTime());
    }

   /**
    * Test getVideoDelayString4AsString() method.
    */
    @Test
    public void subTestGetVideoDelayString4AsString() {
        assertEquals(null, this.jMetaDataText.getVideoDelayString4AsString());
        System.out.println("Video_Delay/String4 AS String === " + jMetaDataText.getVideoDelayString4AsString());
    }

   /**
    * Test getVideoDelayString4AsBoolean() method.
    */
    @Test
    public void subTestGetVideoDelayString4AsBoolean() {
        assertEquals(null, this.jMetaDataText.getVideoDelayString4AsBoolean());
        System.out.println("Video_Delay/String4 AS Boolean === " + jMetaDataText.getVideoDelayString4AsBoolean());
    }

   /**
    * Test getVideoDelayString4AsBigInteger() method.
    */
    @Test
    public void subTestGetVideoDelayString4AsBigInteger() {
        assertEquals(null, this.jMetaDataText.getVideoDelayString4AsBigInteger());
        System.out.println("Video_Delay/String4 AS BigInteger === " + jMetaDataText.getVideoDelayString4AsBigInteger());
    }

   /**
    * Test getVideoDelayString4AsURL() method.
    */
    @Test
    public void subTestGetVideoDelayString4AsURL() {
        assertEquals(null, this.jMetaDataText.getVideoDelayString4AsURL());
        System.out.println("Video_Delay/String4 AS URL === " + jMetaDataText.getVideoDelayString4AsURL());
    }

   /**
    * Test getBitRateNominalStringAsInteger() method.
    */
    @Test
    public void subTestGetBitRateNominalStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getBitRateNominalStringAsInteger());
        System.out.println("Nominal Bit rate (with measurement) AS Integer === " + jMetaDataText.getBitRateNominalStringAsInteger());
    }

   /**
    * Test getBitRateNominalStringAsLong() method.
    */
    @Test
    public void subTestGetBitRateNominalStringAsLong() {
        assertEquals(null, this.jMetaDataText.getBitRateNominalStringAsLong());
        System.out.println("Nominal Bit rate (with measurement) AS Long === " + jMetaDataText.getBitRateNominalStringAsLong());
    }

   /**
    * Test getBitRateNominalStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitRateNominalStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getBitRateNominalStringAsLocalDateTime());
        System.out.println("Nominal Bit rate (with measurement) AS LocalDateTime === " + jMetaDataText.getBitRateNominalStringAsLocalDateTime());
    }

   /**
    * Test getBitRateNominalStringAsLocalTime() method.
    */
    @Test
    public void subTestGetBitRateNominalStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getBitRateNominalStringAsLocalTime());
        System.out.println("Nominal Bit rate (with measurement) AS LocalTime === " + jMetaDataText.getBitRateNominalStringAsLocalTime());
    }

   /**
    * Test getBitRateNominalStringAsString() method.
    */
    @Test
    public void subTestGetBitRateNominalStringAsString() {
        assertEquals(null, this.jMetaDataText.getBitRateNominalStringAsString());
        System.out.println("Nominal Bit rate (with measurement) AS String === " + jMetaDataText.getBitRateNominalStringAsString());
    }

   /**
    * Test getBitRateNominalStringAsBoolean() method.
    */
    @Test
    public void subTestGetBitRateNominalStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getBitRateNominalStringAsBoolean());
        System.out.println("Nominal Bit rate (with measurement) AS Boolean === " + jMetaDataText.getBitRateNominalStringAsBoolean());
    }

   /**
    * Test getBitRateNominalStringAsBigInteger() method.
    */
    @Test
    public void subTestGetBitRateNominalStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getBitRateNominalStringAsBigInteger());
        System.out.println("Nominal Bit rate (with measurement) AS BigInteger === " + jMetaDataText.getBitRateNominalStringAsBigInteger());
    }

   /**
    * Test getBitRateNominalStringAsURL() method.
    */
    @Test
    public void subTestGetBitRateNominalStringAsURL() {
        assertEquals(null, this.jMetaDataText.getBitRateNominalStringAsURL());
        System.out.println("Nominal Bit rate (with measurement) AS URL === " + jMetaDataText.getBitRateNominalStringAsURL());
    }

   /**
    * Test getFormatAsInteger() method.
    */
    @Test
    public void subTestGetFormatAsInteger() {
        assertEquals(null, this.jMetaDataText.getFormatAsInteger());
        System.out.println("Format used AS Integer === " + jMetaDataText.getFormatAsInteger());
    }

   /**
    * Test getFormatAsLong() method.
    */
    @Test
    public void subTestGetFormatAsLong() {
        assertEquals(null, this.jMetaDataText.getFormatAsLong());
        System.out.println("Format used AS Long === " + jMetaDataText.getFormatAsLong());
    }

   /**
    * Test getFormatAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getFormatAsLocalDateTime());
        System.out.println("Format used AS LocalDateTime === " + jMetaDataText.getFormatAsLocalDateTime());
    }

   /**
    * Test getFormatAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getFormatAsLocalTime());
        System.out.println("Format used AS LocalTime === " + jMetaDataText.getFormatAsLocalTime());
    }

   /**
    * Test getFormatAsString() method.
    */
    @Test
    public void subTestGetFormatAsString() {
        assertEquals(null, this.jMetaDataText.getFormatAsString());
        System.out.println("Format used AS String === " + jMetaDataText.getFormatAsString());
    }

   /**
    * Test getFormatAsBoolean() method.
    */
    @Test
    public void subTestGetFormatAsBoolean() {
        assertEquals(null, this.jMetaDataText.getFormatAsBoolean());
        System.out.println("Format used AS Boolean === " + jMetaDataText.getFormatAsBoolean());
    }

   /**
    * Test getFormatAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getFormatAsBigInteger());
        System.out.println("Format used AS BigInteger === " + jMetaDataText.getFormatAsBigInteger());
    }

   /**
    * Test getFormatAsURL() method.
    */
    @Test
    public void subTestGetFormatAsURL() {
        assertEquals(null, this.jMetaDataText.getFormatAsURL());
        System.out.println("Format used AS URL === " + jMetaDataText.getFormatAsURL());
    }

   /**
    * Test getHeightAsInteger() method.
    */
    @Test
    public void subTestGetHeightAsInteger() {
        assertEquals(null, this.jMetaDataText.getHeightAsInteger());
        System.out.println("Height AS Integer === " + jMetaDataText.getHeightAsInteger());
    }

   /**
    * Test getHeightAsLong() method.
    */
    @Test
    public void subTestGetHeightAsLong() {
        assertEquals(null, this.jMetaDataText.getHeightAsLong());
        System.out.println("Height AS Long === " + jMetaDataText.getHeightAsLong());
    }

   /**
    * Test getHeightAsLocalDateTime() method.
    */
    @Test
    public void subTestGetHeightAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getHeightAsLocalDateTime());
        System.out.println("Height AS LocalDateTime === " + jMetaDataText.getHeightAsLocalDateTime());
    }

   /**
    * Test getHeightAsLocalTime() method.
    */
    @Test
    public void subTestGetHeightAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getHeightAsLocalTime());
        System.out.println("Height AS LocalTime === " + jMetaDataText.getHeightAsLocalTime());
    }

   /**
    * Test getHeightAsString() method.
    */
    @Test
    public void subTestGetHeightAsString() {
        assertEquals(null, this.jMetaDataText.getHeightAsString());
        System.out.println("Height AS String === " + jMetaDataText.getHeightAsString());
    }

   /**
    * Test getHeightAsBoolean() method.
    */
    @Test
    public void subTestGetHeightAsBoolean() {
        assertEquals(null, this.jMetaDataText.getHeightAsBoolean());
        System.out.println("Height AS Boolean === " + jMetaDataText.getHeightAsBoolean());
    }

   /**
    * Test getHeightAsBigInteger() method.
    */
    @Test
    public void subTestGetHeightAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getHeightAsBigInteger());
        System.out.println("Height AS BigInteger === " + jMetaDataText.getHeightAsBigInteger());
    }

   /**
    * Test getHeightAsURL() method.
    */
    @Test
    public void subTestGetHeightAsURL() {
        assertEquals(null, this.jMetaDataText.getHeightAsURL());
        System.out.println("Height AS URL === " + jMetaDataText.getHeightAsURL());
    }

   /**
    * Test getCodecIDStringAsInteger() method.
    */
    @Test
    public void subTestGetCodecIDStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getCodecIDStringAsInteger());
        System.out.println("Codec ID (found in some containers) AS Integer === " + jMetaDataText.getCodecIDStringAsInteger());
    }

   /**
    * Test getCodecIDStringAsLong() method.
    */
    @Test
    public void subTestGetCodecIDStringAsLong() {
        assertEquals(null, this.jMetaDataText.getCodecIDStringAsLong());
        System.out.println("Codec ID (found in some containers) AS Long === " + jMetaDataText.getCodecIDStringAsLong());
    }

   /**
    * Test getCodecIDStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCodecIDStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getCodecIDStringAsLocalDateTime());
        System.out.println("Codec ID (found in some containers) AS LocalDateTime === " + jMetaDataText.getCodecIDStringAsLocalDateTime());
    }

   /**
    * Test getCodecIDStringAsLocalTime() method.
    */
    @Test
    public void subTestGetCodecIDStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getCodecIDStringAsLocalTime());
        System.out.println("Codec ID (found in some containers) AS LocalTime === " + jMetaDataText.getCodecIDStringAsLocalTime());
    }

   /**
    * Test getCodecIDStringAsString() method.
    */
    @Test
    public void subTestGetCodecIDStringAsString() {
        assertEquals(null, this.jMetaDataText.getCodecIDStringAsString());
        System.out.println("Codec ID (found in some containers) AS String === " + jMetaDataText.getCodecIDStringAsString());
    }

   /**
    * Test getCodecIDStringAsBoolean() method.
    */
    @Test
    public void subTestGetCodecIDStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getCodecIDStringAsBoolean());
        System.out.println("Codec ID (found in some containers) AS Boolean === " + jMetaDataText.getCodecIDStringAsBoolean());
    }

   /**
    * Test getCodecIDStringAsBigInteger() method.
    */
    @Test
    public void subTestGetCodecIDStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getCodecIDStringAsBigInteger());
        System.out.println("Codec ID (found in some containers) AS BigInteger === " + jMetaDataText.getCodecIDStringAsBigInteger());
    }

   /**
    * Test getCodecIDStringAsURL() method.
    */
    @Test
    public void subTestGetCodecIDStringAsURL() {
        assertEquals(null, this.jMetaDataText.getCodecIDStringAsURL());
        System.out.println("Codec ID (found in some containers) AS URL === " + jMetaDataText.getCodecIDStringAsURL());
    }

   /**
    * Test getEncodedLibraryCompanyNameAsInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsInteger() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryCompanyNameAsInteger());
        System.out.println("Name of the company AS Integer === " + jMetaDataText.getEncodedLibraryCompanyNameAsInteger());
    }

   /**
    * Test getEncodedLibraryCompanyNameAsLong() method.
    */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsLong() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryCompanyNameAsLong());
        System.out.println("Name of the company AS Long === " + jMetaDataText.getEncodedLibraryCompanyNameAsLong());
    }

   /**
    * Test getEncodedLibraryCompanyNameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryCompanyNameAsLocalDateTime());
        System.out.println("Name of the company AS LocalDateTime === " + jMetaDataText.getEncodedLibraryCompanyNameAsLocalDateTime());
    }

   /**
    * Test getEncodedLibraryCompanyNameAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryCompanyNameAsLocalTime());
        System.out.println("Name of the company AS LocalTime === " + jMetaDataText.getEncodedLibraryCompanyNameAsLocalTime());
    }

   /**
    * Test getEncodedLibraryCompanyNameAsString() method.
    */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsString() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryCompanyNameAsString());
        System.out.println("Name of the company AS String === " + jMetaDataText.getEncodedLibraryCompanyNameAsString());
    }

   /**
    * Test getEncodedLibraryCompanyNameAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsBoolean() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryCompanyNameAsBoolean());
        System.out.println("Name of the company AS Boolean === " + jMetaDataText.getEncodedLibraryCompanyNameAsBoolean());
    }

   /**
    * Test getEncodedLibraryCompanyNameAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryCompanyNameAsBigInteger());
        System.out.println("Name of the company AS BigInteger === " + jMetaDataText.getEncodedLibraryCompanyNameAsBigInteger());
    }

   /**
    * Test getEncodedLibraryCompanyNameAsURL() method.
    */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsURL() {
        assertEquals(null, this.jMetaDataText.getEncodedLibraryCompanyNameAsURL());
        System.out.println("Name of the company AS URL === " + jMetaDataText.getEncodedLibraryCompanyNameAsURL());
    }

   /**
    * Test getSourceStreamSizeAsInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeAsInteger() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeAsInteger());
        System.out.println("Source Streamsize in bytes AS Integer === " + jMetaDataText.getSourceStreamSizeAsInteger());
    }

   /**
    * Test getSourceStreamSizeAsLong() method.
    */
    @Test
    public void subTestGetSourceStreamSizeAsLong() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeAsLong());
        System.out.println("Source Streamsize in bytes AS Long === " + jMetaDataText.getSourceStreamSizeAsLong());
    }

   /**
    * Test getSourceStreamSizeAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeAsLocalDateTime());
        System.out.println("Source Streamsize in bytes AS LocalDateTime === " + jMetaDataText.getSourceStreamSizeAsLocalDateTime());
    }

   /**
    * Test getSourceStreamSizeAsLocalTime() method.
    */
    @Test
    public void subTestGetSourceStreamSizeAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeAsLocalTime());
        System.out.println("Source Streamsize in bytes AS LocalTime === " + jMetaDataText.getSourceStreamSizeAsLocalTime());
    }

   /**
    * Test getSourceStreamSizeAsString() method.
    */
    @Test
    public void subTestGetSourceStreamSizeAsString() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeAsString());
        System.out.println("Source Streamsize in bytes AS String === " + jMetaDataText.getSourceStreamSizeAsString());
    }

   /**
    * Test getSourceStreamSizeAsBoolean() method.
    */
    @Test
    public void subTestGetSourceStreamSizeAsBoolean() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeAsBoolean());
        System.out.println("Source Streamsize in bytes AS Boolean === " + jMetaDataText.getSourceStreamSizeAsBoolean());
    }

   /**
    * Test getSourceStreamSizeAsBigInteger() method.
    */
    @Test
    public void subTestGetSourceStreamSizeAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeAsBigInteger());
        System.out.println("Source Streamsize in bytes AS BigInteger === " + jMetaDataText.getSourceStreamSizeAsBigInteger());
    }

   /**
    * Test getSourceStreamSizeAsURL() method.
    */
    @Test
    public void subTestGetSourceStreamSizeAsURL() {
        assertEquals(null, this.jMetaDataText.getSourceStreamSizeAsURL());
        System.out.println("Source Streamsize in bytes AS URL === " + jMetaDataText.getSourceStreamSizeAsURL());
    }

   /**
    * Test getFormatCommercialAsInteger() method.
    */
    @Test
    public void subTestGetFormatCommercialAsInteger() {
        assertEquals(null, this.jMetaDataText.getFormatCommercialAsInteger());
        System.out.println("Commercial name used by vendor for theses setings or Format field if there is no difference AS Integer === " + jMetaDataText.getFormatCommercialAsInteger());
    }

   /**
    * Test getFormatCommercialAsLong() method.
    */
    @Test
    public void subTestGetFormatCommercialAsLong() {
        assertEquals(null, this.jMetaDataText.getFormatCommercialAsLong());
        System.out.println("Commercial name used by vendor for theses setings or Format field if there is no difference AS Long === " + jMetaDataText.getFormatCommercialAsLong());
    }

   /**
    * Test getFormatCommercialAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatCommercialAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getFormatCommercialAsLocalDateTime());
        System.out.println("Commercial name used by vendor for theses setings or Format field if there is no difference AS LocalDateTime === " + jMetaDataText.getFormatCommercialAsLocalDateTime());
    }

   /**
    * Test getFormatCommercialAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatCommercialAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getFormatCommercialAsLocalTime());
        System.out.println("Commercial name used by vendor for theses setings or Format field if there is no difference AS LocalTime === " + jMetaDataText.getFormatCommercialAsLocalTime());
    }

   /**
    * Test getFormatCommercialAsString() method.
    */
    @Test
    public void subTestGetFormatCommercialAsString() {
        assertEquals(null, this.jMetaDataText.getFormatCommercialAsString());
        System.out.println("Commercial name used by vendor for theses setings or Format field if there is no difference AS String === " + jMetaDataText.getFormatCommercialAsString());
    }

   /**
    * Test getFormatCommercialAsBoolean() method.
    */
    @Test
    public void subTestGetFormatCommercialAsBoolean() {
        assertEquals(null, this.jMetaDataText.getFormatCommercialAsBoolean());
        System.out.println("Commercial name used by vendor for theses setings or Format field if there is no difference AS Boolean === " + jMetaDataText.getFormatCommercialAsBoolean());
    }

   /**
    * Test getFormatCommercialAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatCommercialAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getFormatCommercialAsBigInteger());
        System.out.println("Commercial name used by vendor for theses setings or Format field if there is no difference AS BigInteger === " + jMetaDataText.getFormatCommercialAsBigInteger());
    }

   /**
    * Test getFormatCommercialAsURL() method.
    */
    @Test
    public void subTestGetFormatCommercialAsURL() {
        assertEquals(null, this.jMetaDataText.getFormatCommercialAsURL());
        System.out.println("Commercial name used by vendor for theses setings or Format field if there is no difference AS URL === " + jMetaDataText.getFormatCommercialAsURL());
    }

   /**
    * Test getDelaySourceStringAsInteger() method.
    */
    @Test
    public void subTestGetDelaySourceStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getDelaySourceStringAsInteger());
        System.out.println("Delay source (Container or Stream or empty) AS Integer === " + jMetaDataText.getDelaySourceStringAsInteger());
    }

   /**
    * Test getDelaySourceStringAsLong() method.
    */
    @Test
    public void subTestGetDelaySourceStringAsLong() {
        assertEquals(null, this.jMetaDataText.getDelaySourceStringAsLong());
        System.out.println("Delay source (Container or Stream or empty) AS Long === " + jMetaDataText.getDelaySourceStringAsLong());
    }

   /**
    * Test getDelaySourceStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelaySourceStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getDelaySourceStringAsLocalDateTime());
        System.out.println("Delay source (Container or Stream or empty) AS LocalDateTime === " + jMetaDataText.getDelaySourceStringAsLocalDateTime());
    }

   /**
    * Test getDelaySourceStringAsLocalTime() method.
    */
    @Test
    public void subTestGetDelaySourceStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getDelaySourceStringAsLocalTime());
        System.out.println("Delay source (Container or Stream or empty) AS LocalTime === " + jMetaDataText.getDelaySourceStringAsLocalTime());
    }

   /**
    * Test getDelaySourceStringAsString() method.
    */
    @Test
    public void subTestGetDelaySourceStringAsString() {
        assertEquals(null, this.jMetaDataText.getDelaySourceStringAsString());
        System.out.println("Delay source (Container or Stream or empty) AS String === " + jMetaDataText.getDelaySourceStringAsString());
    }

   /**
    * Test getDelaySourceStringAsBoolean() method.
    */
    @Test
    public void subTestGetDelaySourceStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getDelaySourceStringAsBoolean());
        System.out.println("Delay source (Container or Stream or empty) AS Boolean === " + jMetaDataText.getDelaySourceStringAsBoolean());
    }

   /**
    * Test getDelaySourceStringAsBigInteger() method.
    */
    @Test
    public void subTestGetDelaySourceStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getDelaySourceStringAsBigInteger());
        System.out.println("Delay source (Container or Stream or empty) AS BigInteger === " + jMetaDataText.getDelaySourceStringAsBigInteger());
    }

   /**
    * Test getDelaySourceStringAsURL() method.
    */
    @Test
    public void subTestGetDelaySourceStringAsURL() {
        assertEquals(null, this.jMetaDataText.getDelaySourceStringAsURL());
        System.out.println("Delay source (Container or Stream or empty) AS URL === " + jMetaDataText.getDelaySourceStringAsURL());
    }

   /**
    * Test getBitRateNominalAsInteger() method.
    */
    @Test
    public void subTestGetBitRateNominalAsInteger() {
        assertEquals(null, this.jMetaDataText.getBitRateNominalAsInteger());
        System.out.println("Nominal Bit rate in bps AS Integer === " + jMetaDataText.getBitRateNominalAsInteger());
    }

   /**
    * Test getBitRateNominalAsLong() method.
    */
    @Test
    public void subTestGetBitRateNominalAsLong() {
        assertEquals(null, this.jMetaDataText.getBitRateNominalAsLong());
        System.out.println("Nominal Bit rate in bps AS Long === " + jMetaDataText.getBitRateNominalAsLong());
    }

   /**
    * Test getBitRateNominalAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitRateNominalAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getBitRateNominalAsLocalDateTime());
        System.out.println("Nominal Bit rate in bps AS LocalDateTime === " + jMetaDataText.getBitRateNominalAsLocalDateTime());
    }

   /**
    * Test getBitRateNominalAsLocalTime() method.
    */
    @Test
    public void subTestGetBitRateNominalAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getBitRateNominalAsLocalTime());
        System.out.println("Nominal Bit rate in bps AS LocalTime === " + jMetaDataText.getBitRateNominalAsLocalTime());
    }

   /**
    * Test getBitRateNominalAsString() method.
    */
    @Test
    public void subTestGetBitRateNominalAsString() {
        assertEquals(null, this.jMetaDataText.getBitRateNominalAsString());
        System.out.println("Nominal Bit rate in bps AS String === " + jMetaDataText.getBitRateNominalAsString());
    }

   /**
    * Test getBitRateNominalAsBoolean() method.
    */
    @Test
    public void subTestGetBitRateNominalAsBoolean() {
        assertEquals(null, this.jMetaDataText.getBitRateNominalAsBoolean());
        System.out.println("Nominal Bit rate in bps AS Boolean === " + jMetaDataText.getBitRateNominalAsBoolean());
    }

   /**
    * Test getBitRateNominalAsBigInteger() method.
    */
    @Test
    public void subTestGetBitRateNominalAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getBitRateNominalAsBigInteger());
        System.out.println("Nominal Bit rate in bps AS BigInteger === " + jMetaDataText.getBitRateNominalAsBigInteger());
    }

   /**
    * Test getBitRateNominalAsURL() method.
    */
    @Test
    public void subTestGetBitRateNominalAsURL() {
        assertEquals(null, this.jMetaDataText.getBitRateNominalAsURL());
        System.out.println("Nominal Bit rate in bps AS URL === " + jMetaDataText.getBitRateNominalAsURL());
    }

   /**
    * Test getBitRateMinimumAsInteger() method.
    */
    @Test
    public void subTestGetBitRateMinimumAsInteger() {
        assertEquals(null, this.jMetaDataText.getBitRateMinimumAsInteger());
        System.out.println("Minimum Bit rate in bps AS Integer === " + jMetaDataText.getBitRateMinimumAsInteger());
    }

   /**
    * Test getBitRateMinimumAsLong() method.
    */
    @Test
    public void subTestGetBitRateMinimumAsLong() {
        assertEquals(null, this.jMetaDataText.getBitRateMinimumAsLong());
        System.out.println("Minimum Bit rate in bps AS Long === " + jMetaDataText.getBitRateMinimumAsLong());
    }

   /**
    * Test getBitRateMinimumAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitRateMinimumAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getBitRateMinimumAsLocalDateTime());
        System.out.println("Minimum Bit rate in bps AS LocalDateTime === " + jMetaDataText.getBitRateMinimumAsLocalDateTime());
    }

   /**
    * Test getBitRateMinimumAsLocalTime() method.
    */
    @Test
    public void subTestGetBitRateMinimumAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getBitRateMinimumAsLocalTime());
        System.out.println("Minimum Bit rate in bps AS LocalTime === " + jMetaDataText.getBitRateMinimumAsLocalTime());
    }

   /**
    * Test getBitRateMinimumAsString() method.
    */
    @Test
    public void subTestGetBitRateMinimumAsString() {
        assertEquals(null, this.jMetaDataText.getBitRateMinimumAsString());
        System.out.println("Minimum Bit rate in bps AS String === " + jMetaDataText.getBitRateMinimumAsString());
    }

   /**
    * Test getBitRateMinimumAsBoolean() method.
    */
    @Test
    public void subTestGetBitRateMinimumAsBoolean() {
        assertEquals(null, this.jMetaDataText.getBitRateMinimumAsBoolean());
        System.out.println("Minimum Bit rate in bps AS Boolean === " + jMetaDataText.getBitRateMinimumAsBoolean());
    }

   /**
    * Test getBitRateMinimumAsBigInteger() method.
    */
    @Test
    public void subTestGetBitRateMinimumAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getBitRateMinimumAsBigInteger());
        System.out.println("Minimum Bit rate in bps AS BigInteger === " + jMetaDataText.getBitRateMinimumAsBigInteger());
    }

   /**
    * Test getBitRateMinimumAsURL() method.
    */
    @Test
    public void subTestGetBitRateMinimumAsURL() {
        assertEquals(null, this.jMetaDataText.getBitRateMinimumAsURL());
        System.out.println("Minimum Bit rate in bps AS URL === " + jMetaDataText.getBitRateMinimumAsURL());
    }

   /**
    * Test getSourceDurationStringAsInteger() method.
    */
    @Test
    public void subTestGetSourceDurationStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getSourceDurationStringAsInteger());
        System.out.println("Source Play time in format : XXx YYy only, YYy omited if zero AS Integer === " + jMetaDataText.getSourceDurationStringAsInteger());
    }

   /**
    * Test getSourceDurationStringAsLong() method.
    */
    @Test
    public void subTestGetSourceDurationStringAsLong() {
        assertEquals(null, this.jMetaDataText.getSourceDurationStringAsLong());
        System.out.println("Source Play time in format : XXx YYy only, YYy omited if zero AS Long === " + jMetaDataText.getSourceDurationStringAsLong());
    }

   /**
    * Test getSourceDurationStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSourceDurationStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getSourceDurationStringAsLocalDateTime());
        System.out.println("Source Play time in format : XXx YYy only, YYy omited if zero AS LocalDateTime === " + jMetaDataText.getSourceDurationStringAsLocalDateTime());
    }

   /**
    * Test getSourceDurationStringAsLocalTime() method.
    */
    @Test
    public void subTestGetSourceDurationStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getSourceDurationStringAsLocalTime());
        System.out.println("Source Play time in format : XXx YYy only, YYy omited if zero AS LocalTime === " + jMetaDataText.getSourceDurationStringAsLocalTime());
    }

   /**
    * Test getSourceDurationStringAsString() method.
    */
    @Test
    public void subTestGetSourceDurationStringAsString() {
        assertEquals(null, this.jMetaDataText.getSourceDurationStringAsString());
        System.out.println("Source Play time in format : XXx YYy only, YYy omited if zero AS String === " + jMetaDataText.getSourceDurationStringAsString());
    }

   /**
    * Test getSourceDurationStringAsBoolean() method.
    */
    @Test
    public void subTestGetSourceDurationStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getSourceDurationStringAsBoolean());
        System.out.println("Source Play time in format : XXx YYy only, YYy omited if zero AS Boolean === " + jMetaDataText.getSourceDurationStringAsBoolean());
    }

   /**
    * Test getSourceDurationStringAsBigInteger() method.
    */
    @Test
    public void subTestGetSourceDurationStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getSourceDurationStringAsBigInteger());
        System.out.println("Source Play time in format : XXx YYy only, YYy omited if zero AS BigInteger === " + jMetaDataText.getSourceDurationStringAsBigInteger());
    }

   /**
    * Test getSourceDurationStringAsURL() method.
    */
    @Test
    public void subTestGetSourceDurationStringAsURL() {
        assertEquals(null, this.jMetaDataText.getSourceDurationStringAsURL());
        System.out.println("Source Play time in format : XXx YYy only, YYy omited if zero AS URL === " + jMetaDataText.getSourceDurationStringAsURL());
    }

   /**
    * Test getBitRateEncodedStringAsInteger() method.
    */
    @Test
    public void subTestGetBitRateEncodedStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getBitRateEncodedStringAsInteger());
        System.out.println("Encoded (with forced padding) bit rate (with measurement), if some container padding is present AS Integer === " + jMetaDataText.getBitRateEncodedStringAsInteger());
    }

   /**
    * Test getBitRateEncodedStringAsLong() method.
    */
    @Test
    public void subTestGetBitRateEncodedStringAsLong() {
        assertEquals(null, this.jMetaDataText.getBitRateEncodedStringAsLong());
        System.out.println("Encoded (with forced padding) bit rate (with measurement), if some container padding is present AS Long === " + jMetaDataText.getBitRateEncodedStringAsLong());
    }

   /**
    * Test getBitRateEncodedStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBitRateEncodedStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getBitRateEncodedStringAsLocalDateTime());
        System.out.println("Encoded (with forced padding) bit rate (with measurement), if some container padding is present AS LocalDateTime === " + jMetaDataText.getBitRateEncodedStringAsLocalDateTime());
    }

   /**
    * Test getBitRateEncodedStringAsLocalTime() method.
    */
    @Test
    public void subTestGetBitRateEncodedStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getBitRateEncodedStringAsLocalTime());
        System.out.println("Encoded (with forced padding) bit rate (with measurement), if some container padding is present AS LocalTime === " + jMetaDataText.getBitRateEncodedStringAsLocalTime());
    }

   /**
    * Test getBitRateEncodedStringAsString() method.
    */
    @Test
    public void subTestGetBitRateEncodedStringAsString() {
        assertEquals(null, this.jMetaDataText.getBitRateEncodedStringAsString());
        System.out.println("Encoded (with forced padding) bit rate (with measurement), if some container padding is present AS String === " + jMetaDataText.getBitRateEncodedStringAsString());
    }

   /**
    * Test getBitRateEncodedStringAsBoolean() method.
    */
    @Test
    public void subTestGetBitRateEncodedStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getBitRateEncodedStringAsBoolean());
        System.out.println("Encoded (with forced padding) bit rate (with measurement), if some container padding is present AS Boolean === " + jMetaDataText.getBitRateEncodedStringAsBoolean());
    }

   /**
    * Test getBitRateEncodedStringAsBigInteger() method.
    */
    @Test
    public void subTestGetBitRateEncodedStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getBitRateEncodedStringAsBigInteger());
        System.out.println("Encoded (with forced padding) bit rate (with measurement), if some container padding is present AS BigInteger === " + jMetaDataText.getBitRateEncodedStringAsBigInteger());
    }

   /**
    * Test getBitRateEncodedStringAsURL() method.
    */
    @Test
    public void subTestGetBitRateEncodedStringAsURL() {
        assertEquals(null, this.jMetaDataText.getBitRateEncodedStringAsURL());
        System.out.println("Encoded (with forced padding) bit rate (with measurement), if some container padding is present AS URL === " + jMetaDataText.getBitRateEncodedStringAsURL());
    }

   /**
    * Test getStreamKindStringAsInteger() method.
    */
    @Test
    public void subTestGetStreamKindStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getStreamKindStringAsInteger());
        System.out.println("Stream type name AS Integer === " + jMetaDataText.getStreamKindStringAsInteger());
    }

   /**
    * Test getStreamKindStringAsLong() method.
    */
    @Test
    public void subTestGetStreamKindStringAsLong() {
        assertEquals(null, this.jMetaDataText.getStreamKindStringAsLong());
        System.out.println("Stream type name AS Long === " + jMetaDataText.getStreamKindStringAsLong());
    }

   /**
    * Test getStreamKindStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamKindStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getStreamKindStringAsLocalDateTime());
        System.out.println("Stream type name AS LocalDateTime === " + jMetaDataText.getStreamKindStringAsLocalDateTime());
    }

   /**
    * Test getStreamKindStringAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamKindStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getStreamKindStringAsLocalTime());
        System.out.println("Stream type name AS LocalTime === " + jMetaDataText.getStreamKindStringAsLocalTime());
    }

   /**
    * Test getStreamKindStringAsString() method.
    */
    @Test
    public void subTestGetStreamKindStringAsString() {
        assertEquals(null, this.jMetaDataText.getStreamKindStringAsString());
        System.out.println("Stream type name AS String === " + jMetaDataText.getStreamKindStringAsString());
    }

   /**
    * Test getStreamKindStringAsBoolean() method.
    */
    @Test
    public void subTestGetStreamKindStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getStreamKindStringAsBoolean());
        System.out.println("Stream type name AS Boolean === " + jMetaDataText.getStreamKindStringAsBoolean());
    }

   /**
    * Test getStreamKindStringAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamKindStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getStreamKindStringAsBigInteger());
        System.out.println("Stream type name AS BigInteger === " + jMetaDataText.getStreamKindStringAsBigInteger());
    }

   /**
    * Test getStreamKindStringAsURL() method.
    */
    @Test
    public void subTestGetStreamKindStringAsURL() {
        assertEquals(null, this.jMetaDataText.getStreamKindStringAsURL());
        System.out.println("Stream type name AS URL === " + jMetaDataText.getStreamKindStringAsURL());
    }

   /**
    * Test getChromaSubsamplingAsInteger() method.
    */
    @Test
    public void subTestGetChromaSubsamplingAsInteger() {
        assertEquals(null, this.jMetaDataText.getChromaSubsamplingAsInteger());
        System.out.println("ChromaSubsampling AS Integer === " + jMetaDataText.getChromaSubsamplingAsInteger());
    }

   /**
    * Test getChromaSubsamplingAsLong() method.
    */
    @Test
    public void subTestGetChromaSubsamplingAsLong() {
        assertEquals(null, this.jMetaDataText.getChromaSubsamplingAsLong());
        System.out.println("ChromaSubsampling AS Long === " + jMetaDataText.getChromaSubsamplingAsLong());
    }

   /**
    * Test getChromaSubsamplingAsLocalDateTime() method.
    */
    @Test
    public void subTestGetChromaSubsamplingAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getChromaSubsamplingAsLocalDateTime());
        System.out.println("ChromaSubsampling AS LocalDateTime === " + jMetaDataText.getChromaSubsamplingAsLocalDateTime());
    }

   /**
    * Test getChromaSubsamplingAsLocalTime() method.
    */
    @Test
    public void subTestGetChromaSubsamplingAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getChromaSubsamplingAsLocalTime());
        System.out.println("ChromaSubsampling AS LocalTime === " + jMetaDataText.getChromaSubsamplingAsLocalTime());
    }

   /**
    * Test getChromaSubsamplingAsString() method.
    */
    @Test
    public void subTestGetChromaSubsamplingAsString() {
        assertEquals(null, this.jMetaDataText.getChromaSubsamplingAsString());
        System.out.println("ChromaSubsampling AS String === " + jMetaDataText.getChromaSubsamplingAsString());
    }

   /**
    * Test getChromaSubsamplingAsBoolean() method.
    */
    @Test
    public void subTestGetChromaSubsamplingAsBoolean() {
        assertEquals(null, this.jMetaDataText.getChromaSubsamplingAsBoolean());
        System.out.println("ChromaSubsampling AS Boolean === " + jMetaDataText.getChromaSubsamplingAsBoolean());
    }

   /**
    * Test getChromaSubsamplingAsBigInteger() method.
    */
    @Test
    public void subTestGetChromaSubsamplingAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getChromaSubsamplingAsBigInteger());
        System.out.println("ChromaSubsampling AS BigInteger === " + jMetaDataText.getChromaSubsamplingAsBigInteger());
    }

   /**
    * Test getChromaSubsamplingAsURL() method.
    */
    @Test
    public void subTestGetChromaSubsamplingAsURL() {
        assertEquals(null, this.jMetaDataText.getChromaSubsamplingAsURL());
        System.out.println("ChromaSubsampling AS URL === " + jMetaDataText.getChromaSubsamplingAsURL());
    }

   /**
    * Test getEncodedApplicationVersionAsInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationVersionAsInteger() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationVersionAsInteger());
        System.out.println("Version of the product AS Integer === " + jMetaDataText.getEncodedApplicationVersionAsInteger());
    }

   /**
    * Test getEncodedApplicationVersionAsLong() method.
    */
    @Test
    public void subTestGetEncodedApplicationVersionAsLong() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationVersionAsLong());
        System.out.println("Version of the product AS Long === " + jMetaDataText.getEncodedApplicationVersionAsLong());
    }

   /**
    * Test getEncodedApplicationVersionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationVersionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationVersionAsLocalDateTime());
        System.out.println("Version of the product AS LocalDateTime === " + jMetaDataText.getEncodedApplicationVersionAsLocalDateTime());
    }

   /**
    * Test getEncodedApplicationVersionAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationVersionAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationVersionAsLocalTime());
        System.out.println("Version of the product AS LocalTime === " + jMetaDataText.getEncodedApplicationVersionAsLocalTime());
    }

   /**
    * Test getEncodedApplicationVersionAsString() method.
    */
    @Test
    public void subTestGetEncodedApplicationVersionAsString() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationVersionAsString());
        System.out.println("Version of the product AS String === " + jMetaDataText.getEncodedApplicationVersionAsString());
    }

   /**
    * Test getEncodedApplicationVersionAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedApplicationVersionAsBoolean() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationVersionAsBoolean());
        System.out.println("Version of the product AS Boolean === " + jMetaDataText.getEncodedApplicationVersionAsBoolean());
    }

   /**
    * Test getEncodedApplicationVersionAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationVersionAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationVersionAsBigInteger());
        System.out.println("Version of the product AS BigInteger === " + jMetaDataText.getEncodedApplicationVersionAsBigInteger());
    }

   /**
    * Test getEncodedApplicationVersionAsURL() method.
    */
    @Test
    public void subTestGetEncodedApplicationVersionAsURL() {
        assertEquals(null, this.jMetaDataText.getEncodedApplicationVersionAsURL());
        System.out.println("Version of the product AS URL === " + jMetaDataText.getEncodedApplicationVersionAsURL());
    }

   /**
    * Test getMenuIDAsInteger() method.
    */
    @Test
    public void subTestGetMenuIDAsInteger() {
        assertEquals(null, this.jMetaDataText.getMenuIDAsInteger());
        System.out.println("The menu ID for this stream in this file AS Integer === " + jMetaDataText.getMenuIDAsInteger());
    }

   /**
    * Test getMenuIDAsLong() method.
    */
    @Test
    public void subTestGetMenuIDAsLong() {
        assertEquals(null, this.jMetaDataText.getMenuIDAsLong());
        System.out.println("The menu ID for this stream in this file AS Long === " + jMetaDataText.getMenuIDAsLong());
    }

   /**
    * Test getMenuIDAsLocalDateTime() method.
    */
    @Test
    public void subTestGetMenuIDAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getMenuIDAsLocalDateTime());
        System.out.println("The menu ID for this stream in this file AS LocalDateTime === " + jMetaDataText.getMenuIDAsLocalDateTime());
    }

   /**
    * Test getMenuIDAsLocalTime() method.
    */
    @Test
    public void subTestGetMenuIDAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getMenuIDAsLocalTime());
        System.out.println("The menu ID for this stream in this file AS LocalTime === " + jMetaDataText.getMenuIDAsLocalTime());
    }

   /**
    * Test getMenuIDAsString() method.
    */
    @Test
    public void subTestGetMenuIDAsString() {
        assertEquals(null, this.jMetaDataText.getMenuIDAsString());
        System.out.println("The menu ID for this stream in this file AS String === " + jMetaDataText.getMenuIDAsString());
    }

   /**
    * Test getMenuIDAsBoolean() method.
    */
    @Test
    public void subTestGetMenuIDAsBoolean() {
        assertEquals(null, this.jMetaDataText.getMenuIDAsBoolean());
        System.out.println("The menu ID for this stream in this file AS Boolean === " + jMetaDataText.getMenuIDAsBoolean());
    }

   /**
    * Test getMenuIDAsBigInteger() method.
    */
    @Test
    public void subTestGetMenuIDAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getMenuIDAsBigInteger());
        System.out.println("The menu ID for this stream in this file AS BigInteger === " + jMetaDataText.getMenuIDAsBigInteger());
    }

   /**
    * Test getMenuIDAsURL() method.
    */
    @Test
    public void subTestGetMenuIDAsURL() {
        assertEquals(null, this.jMetaDataText.getMenuIDAsURL());
        System.out.println("The menu ID for this stream in this file AS URL === " + jMetaDataText.getMenuIDAsURL());
    }

   /**
    * Test getAlternateGroupStringAsInteger() method.
    */
    @Test
    public void subTestGetAlternateGroupStringAsInteger() {
        assertEquals(null, this.jMetaDataText.getAlternateGroupStringAsInteger());
        System.out.println("Number of a group in order to provide versions of the same track AS Integer === " + jMetaDataText.getAlternateGroupStringAsInteger());
    }

   /**
    * Test getAlternateGroupStringAsLong() method.
    */
    @Test
    public void subTestGetAlternateGroupStringAsLong() {
        assertEquals(null, this.jMetaDataText.getAlternateGroupStringAsLong());
        System.out.println("Number of a group in order to provide versions of the same track AS Long === " + jMetaDataText.getAlternateGroupStringAsLong());
    }

   /**
    * Test getAlternateGroupStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetAlternateGroupStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getAlternateGroupStringAsLocalDateTime());
        System.out.println("Number of a group in order to provide versions of the same track AS LocalDateTime === " + jMetaDataText.getAlternateGroupStringAsLocalDateTime());
    }

   /**
    * Test getAlternateGroupStringAsLocalTime() method.
    */
    @Test
    public void subTestGetAlternateGroupStringAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getAlternateGroupStringAsLocalTime());
        System.out.println("Number of a group in order to provide versions of the same track AS LocalTime === " + jMetaDataText.getAlternateGroupStringAsLocalTime());
    }

   /**
    * Test getAlternateGroupStringAsString() method.
    */
    @Test
    public void subTestGetAlternateGroupStringAsString() {
        assertEquals(null, this.jMetaDataText.getAlternateGroupStringAsString());
        System.out.println("Number of a group in order to provide versions of the same track AS String === " + jMetaDataText.getAlternateGroupStringAsString());
    }

   /**
    * Test getAlternateGroupStringAsBoolean() method.
    */
    @Test
    public void subTestGetAlternateGroupStringAsBoolean() {
        assertEquals(null, this.jMetaDataText.getAlternateGroupStringAsBoolean());
        System.out.println("Number of a group in order to provide versions of the same track AS Boolean === " + jMetaDataText.getAlternateGroupStringAsBoolean());
    }

   /**
    * Test getAlternateGroupStringAsBigInteger() method.
    */
    @Test
    public void subTestGetAlternateGroupStringAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getAlternateGroupStringAsBigInteger());
        System.out.println("Number of a group in order to provide versions of the same track AS BigInteger === " + jMetaDataText.getAlternateGroupStringAsBigInteger());
    }

   /**
    * Test getAlternateGroupStringAsURL() method.
    */
    @Test
    public void subTestGetAlternateGroupStringAsURL() {
        assertEquals(null, this.jMetaDataText.getAlternateGroupStringAsURL());
        System.out.println("Number of a group in order to provide versions of the same track AS URL === " + jMetaDataText.getAlternateGroupStringAsURL());
    }

   /**
    * Test getSummaryAsInteger() method.
    */
    @Test
    public void subTestGetSummaryAsInteger() {
        assertEquals(null, this.jMetaDataText.getSummaryAsInteger());
        System.out.println("Summary AS Integer === " + jMetaDataText.getSummaryAsInteger());
    }

   /**
    * Test getSummaryAsLong() method.
    */
    @Test
    public void subTestGetSummaryAsLong() {
        assertEquals(null, this.jMetaDataText.getSummaryAsLong());
        System.out.println("Summary AS Long === " + jMetaDataText.getSummaryAsLong());
    }

   /**
    * Test getSummaryAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSummaryAsLocalDateTime() {
        assertEquals(null, this.jMetaDataText.getSummaryAsLocalDateTime());
        System.out.println("Summary AS LocalDateTime === " + jMetaDataText.getSummaryAsLocalDateTime());
    }

   /**
    * Test getSummaryAsLocalTime() method.
    */
    @Test
    public void subTestGetSummaryAsLocalTime() {
        assertEquals(null, this.jMetaDataText.getSummaryAsLocalTime());
        System.out.println("Summary AS LocalTime === " + jMetaDataText.getSummaryAsLocalTime());
    }

   /**
    * Test getSummaryAsString() method.
    */
    @Test
    public void subTestGetSummaryAsString() {
        assertEquals(null, this.jMetaDataText.getSummaryAsString());
        System.out.println("Summary AS String === " + jMetaDataText.getSummaryAsString());
    }

   /**
    * Test getSummaryAsBoolean() method.
    */
    @Test
    public void subTestGetSummaryAsBoolean() {
        assertEquals(null, this.jMetaDataText.getSummaryAsBoolean());
        System.out.println("Summary AS Boolean === " + jMetaDataText.getSummaryAsBoolean());
    }

   /**
    * Test getSummaryAsBigInteger() method.
    */
    @Test
    public void subTestGetSummaryAsBigInteger() {
        assertEquals(null, this.jMetaDataText.getSummaryAsBigInteger());
        System.out.println("Summary AS BigInteger === " + jMetaDataText.getSummaryAsBigInteger());
    }

   /**
    * Test getSummaryAsURL() method.
    */
    @Test
    public void subTestGetSummaryAsURL() {
        assertEquals(null, this.jMetaDataText.getSummaryAsURL());
        System.out.println("Summary AS URL === " + jMetaDataText.getSummaryAsURL());
    }

}
