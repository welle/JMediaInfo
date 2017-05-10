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
import aka.jmetadata.main.JMetaDataMenu;

/**
 * This class contains tests methods for Menu informations of a specific Menu stream.
 *
 * @author Welle Charlotte
 */
public final class JMetaDataMenu_Test {

    private static @NonNull final Logger LOGGER = Logger.getLogger(JMetaDataMenu_Test.class.getName());

    private static JMetaDataMenu jMetaDataMenu;
    private static JMetaData jMetaData;

    /**
     * Initialize test.
     */
    @BeforeClass
    public static void beforeUnit() {
        try {
            jMetaData = new JMetaData();
            final ClassLoader classLoader = JMetaDataMenu_Test.class.getClassLoader();
            final File file = new File(classLoader.getResource("somefile").getFile());
            jMetaData.open(file);
            jMetaDataMenu = null;
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
    * Test getUniqueIDAsInteger() method.
    */
    @Test
    public void subTestGetUniqueIDAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getUniqueIDAsInteger());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS Integer === " + jMetaDataMenu.getUniqueIDAsInteger());
    }

   /**
    * Test getUniqueIDAsLong() method.
    */
    @Test
    public void subTestGetUniqueIDAsLong() {
        assertEquals(null, this.jMetaDataMenu.getUniqueIDAsLong());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS Long === " + jMetaDataMenu.getUniqueIDAsLong());
    }

   /**
    * Test getUniqueIDAsLocalDateTime() method.
    */
    @Test
    public void subTestGetUniqueIDAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getUniqueIDAsLocalDateTime());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS LocalDateTime === " + jMetaDataMenu.getUniqueIDAsLocalDateTime());
    }

   /**
    * Test getUniqueIDAsLocalTime() method.
    */
    @Test
    public void subTestGetUniqueIDAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getUniqueIDAsLocalTime());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS LocalTime === " + jMetaDataMenu.getUniqueIDAsLocalTime());
    }

   /**
    * Test getUniqueIDAsString() method.
    */
    @Test
    public void subTestGetUniqueIDAsString() {
        assertEquals(null, this.jMetaDataMenu.getUniqueIDAsString());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS String === " + jMetaDataMenu.getUniqueIDAsString());
    }

   /**
    * Test getUniqueIDAsBoolean() method.
    */
    @Test
    public void subTestGetUniqueIDAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getUniqueIDAsBoolean());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS Boolean === " + jMetaDataMenu.getUniqueIDAsBoolean());
    }

   /**
    * Test getUniqueIDAsBigInteger() method.
    */
    @Test
    public void subTestGetUniqueIDAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getUniqueIDAsBigInteger());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS BigInteger === " + jMetaDataMenu.getUniqueIDAsBigInteger());
    }

   /**
    * Test getUniqueIDAsURL() method.
    */
    @Test
    public void subTestGetUniqueIDAsURL() {
        assertEquals(null, this.jMetaDataMenu.getUniqueIDAsURL());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS URL === " + jMetaDataMenu.getUniqueIDAsURL());
    }

   /**
    * Test getNetworkNameAsInteger() method.
    */
    @Test
    public void subTestGetNetworkNameAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getNetworkNameAsInteger());
        System.out.println("NetworkName AS Integer === " + jMetaDataMenu.getNetworkNameAsInteger());
    }

   /**
    * Test getNetworkNameAsLong() method.
    */
    @Test
    public void subTestGetNetworkNameAsLong() {
        assertEquals(null, this.jMetaDataMenu.getNetworkNameAsLong());
        System.out.println("NetworkName AS Long === " + jMetaDataMenu.getNetworkNameAsLong());
    }

   /**
    * Test getNetworkNameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetNetworkNameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getNetworkNameAsLocalDateTime());
        System.out.println("NetworkName AS LocalDateTime === " + jMetaDataMenu.getNetworkNameAsLocalDateTime());
    }

   /**
    * Test getNetworkNameAsLocalTime() method.
    */
    @Test
    public void subTestGetNetworkNameAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getNetworkNameAsLocalTime());
        System.out.println("NetworkName AS LocalTime === " + jMetaDataMenu.getNetworkNameAsLocalTime());
    }

   /**
    * Test getNetworkNameAsString() method.
    */
    @Test
    public void subTestGetNetworkNameAsString() {
        assertEquals(null, this.jMetaDataMenu.getNetworkNameAsString());
        System.out.println("NetworkName AS String === " + jMetaDataMenu.getNetworkNameAsString());
    }

   /**
    * Test getNetworkNameAsBoolean() method.
    */
    @Test
    public void subTestGetNetworkNameAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getNetworkNameAsBoolean());
        System.out.println("NetworkName AS Boolean === " + jMetaDataMenu.getNetworkNameAsBoolean());
    }

   /**
    * Test getNetworkNameAsBigInteger() method.
    */
    @Test
    public void subTestGetNetworkNameAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getNetworkNameAsBigInteger());
        System.out.println("NetworkName AS BigInteger === " + jMetaDataMenu.getNetworkNameAsBigInteger());
    }

   /**
    * Test getNetworkNameAsURL() method.
    */
    @Test
    public void subTestGetNetworkNameAsURL() {
        assertEquals(null, this.jMetaDataMenu.getNetworkNameAsURL());
        System.out.println("NetworkName AS URL === " + jMetaDataMenu.getNetworkNameAsURL());
    }

   /**
    * Test getTimeZonesAsInteger() method.
    */
    @Test
    public void subTestGetTimeZonesAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getTimeZonesAsInteger());
        System.out.println("TimeZones AS Integer === " + jMetaDataMenu.getTimeZonesAsInteger());
    }

   /**
    * Test getTimeZonesAsLong() method.
    */
    @Test
    public void subTestGetTimeZonesAsLong() {
        assertEquals(null, this.jMetaDataMenu.getTimeZonesAsLong());
        System.out.println("TimeZones AS Long === " + jMetaDataMenu.getTimeZonesAsLong());
    }

   /**
    * Test getTimeZonesAsLocalDateTime() method.
    */
    @Test
    public void subTestGetTimeZonesAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getTimeZonesAsLocalDateTime());
        System.out.println("TimeZones AS LocalDateTime === " + jMetaDataMenu.getTimeZonesAsLocalDateTime());
    }

   /**
    * Test getTimeZonesAsLocalTime() method.
    */
    @Test
    public void subTestGetTimeZonesAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getTimeZonesAsLocalTime());
        System.out.println("TimeZones AS LocalTime === " + jMetaDataMenu.getTimeZonesAsLocalTime());
    }

   /**
    * Test getTimeZonesAsString() method.
    */
    @Test
    public void subTestGetTimeZonesAsString() {
        assertEquals(null, this.jMetaDataMenu.getTimeZonesAsString());
        System.out.println("TimeZones AS String === " + jMetaDataMenu.getTimeZonesAsString());
    }

   /**
    * Test getTimeZonesAsBoolean() method.
    */
    @Test
    public void subTestGetTimeZonesAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getTimeZonesAsBoolean());
        System.out.println("TimeZones AS Boolean === " + jMetaDataMenu.getTimeZonesAsBoolean());
    }

   /**
    * Test getTimeZonesAsBigInteger() method.
    */
    @Test
    public void subTestGetTimeZonesAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getTimeZonesAsBigInteger());
        System.out.println("TimeZones AS BigInteger === " + jMetaDataMenu.getTimeZonesAsBigInteger());
    }

   /**
    * Test getTimeZonesAsURL() method.
    */
    @Test
    public void subTestGetTimeZonesAsURL() {
        assertEquals(null, this.jMetaDataMenu.getTimeZonesAsURL());
        System.out.println("TimeZones AS URL === " + jMetaDataMenu.getTimeZonesAsURL());
    }

   /**
    * Test getLanguageStringAsInteger() method.
    */
    @Test
    public void subTestGetLanguageStringAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getLanguageStringAsInteger());
        System.out.println("Language (full) AS Integer === " + jMetaDataMenu.getLanguageStringAsInteger());
    }

   /**
    * Test getLanguageStringAsLong() method.
    */
    @Test
    public void subTestGetLanguageStringAsLong() {
        assertEquals(null, this.jMetaDataMenu.getLanguageStringAsLong());
        System.out.println("Language (full) AS Long === " + jMetaDataMenu.getLanguageStringAsLong());
    }

   /**
    * Test getLanguageStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetLanguageStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getLanguageStringAsLocalDateTime());
        System.out.println("Language (full) AS LocalDateTime === " + jMetaDataMenu.getLanguageStringAsLocalDateTime());
    }

   /**
    * Test getLanguageStringAsLocalTime() method.
    */
    @Test
    public void subTestGetLanguageStringAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getLanguageStringAsLocalTime());
        System.out.println("Language (full) AS LocalTime === " + jMetaDataMenu.getLanguageStringAsLocalTime());
    }

   /**
    * Test getLanguageStringAsString() method.
    */
    @Test
    public void subTestGetLanguageStringAsString() {
        assertEquals(null, this.jMetaDataMenu.getLanguageStringAsString());
        System.out.println("Language (full) AS String === " + jMetaDataMenu.getLanguageStringAsString());
    }

   /**
    * Test getLanguageStringAsBoolean() method.
    */
    @Test
    public void subTestGetLanguageStringAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getLanguageStringAsBoolean());
        System.out.println("Language (full) AS Boolean === " + jMetaDataMenu.getLanguageStringAsBoolean());
    }

   /**
    * Test getLanguageStringAsBigInteger() method.
    */
    @Test
    public void subTestGetLanguageStringAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getLanguageStringAsBigInteger());
        System.out.println("Language (full) AS BigInteger === " + jMetaDataMenu.getLanguageStringAsBigInteger());
    }

   /**
    * Test getLanguageStringAsURL() method.
    */
    @Test
    public void subTestGetLanguageStringAsURL() {
        assertEquals(null, this.jMetaDataMenu.getLanguageStringAsURL());
        System.out.println("Language (full) AS URL === " + jMetaDataMenu.getLanguageStringAsURL());
    }

   /**
    * Test getDelayString3AsInteger() method.
    */
    @Test
    public void subTestGetDelayString3AsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDelayString3AsInteger());
        System.out.println("Delay in format : HH:MM:SS.MMM AS Integer === " + jMetaDataMenu.getDelayString3AsInteger());
    }

   /**
    * Test getDelayString3AsLong() method.
    */
    @Test
    public void subTestGetDelayString3AsLong() {
        assertEquals(null, this.jMetaDataMenu.getDelayString3AsLong());
        System.out.println("Delay in format : HH:MM:SS.MMM AS Long === " + jMetaDataMenu.getDelayString3AsLong());
    }

   /**
    * Test getDelayString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDelayString3AsLocalDateTime());
        System.out.println("Delay in format : HH:MM:SS.MMM AS LocalDateTime === " + jMetaDataMenu.getDelayString3AsLocalDateTime());
    }

   /**
    * Test getDelayString3AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayString3AsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDelayString3AsLocalTime());
        System.out.println("Delay in format : HH:MM:SS.MMM AS LocalTime === " + jMetaDataMenu.getDelayString3AsLocalTime());
    }

   /**
    * Test getDelayString3AsString() method.
    */
    @Test
    public void subTestGetDelayString3AsString() {
        assertEquals(null, this.jMetaDataMenu.getDelayString3AsString());
        System.out.println("Delay in format : HH:MM:SS.MMM AS String === " + jMetaDataMenu.getDelayString3AsString());
    }

   /**
    * Test getDelayString3AsBoolean() method.
    */
    @Test
    public void subTestGetDelayString3AsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDelayString3AsBoolean());
        System.out.println("Delay in format : HH:MM:SS.MMM AS Boolean === " + jMetaDataMenu.getDelayString3AsBoolean());
    }

   /**
    * Test getDelayString3AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayString3AsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDelayString3AsBigInteger());
        System.out.println("Delay in format : HH:MM:SS.MMM AS BigInteger === " + jMetaDataMenu.getDelayString3AsBigInteger());
    }

   /**
    * Test getDelayString3AsURL() method.
    */
    @Test
    public void subTestGetDelayString3AsURL() {
        assertEquals(null, this.jMetaDataMenu.getDelayString3AsURL());
        System.out.println("Delay in format : HH:MM:SS.MMM AS URL === " + jMetaDataMenu.getDelayString3AsURL());
    }

   /**
    * Test getDelayString4AsInteger() method.
    */
    @Test
    public void subTestGetDelayString4AsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDelayString4AsInteger());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Integer === " + jMetaDataMenu.getDelayString4AsInteger());
    }

   /**
    * Test getDelayString4AsLong() method.
    */
    @Test
    public void subTestGetDelayString4AsLong() {
        assertEquals(null, this.jMetaDataMenu.getDelayString4AsLong());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Long === " + jMetaDataMenu.getDelayString4AsLong());
    }

   /**
    * Test getDelayString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDelayString4AsLocalDateTime());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS LocalDateTime === " + jMetaDataMenu.getDelayString4AsLocalDateTime());
    }

   /**
    * Test getDelayString4AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayString4AsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDelayString4AsLocalTime());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS LocalTime === " + jMetaDataMenu.getDelayString4AsLocalTime());
    }

   /**
    * Test getDelayString4AsString() method.
    */
    @Test
    public void subTestGetDelayString4AsString() {
        assertEquals(null, this.jMetaDataMenu.getDelayString4AsString());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS String === " + jMetaDataMenu.getDelayString4AsString());
    }

   /**
    * Test getDelayString4AsBoolean() method.
    */
    @Test
    public void subTestGetDelayString4AsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDelayString4AsBoolean());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Boolean === " + jMetaDataMenu.getDelayString4AsBoolean());
    }

   /**
    * Test getDelayString4AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayString4AsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDelayString4AsBigInteger());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS BigInteger === " + jMetaDataMenu.getDelayString4AsBigInteger());
    }

   /**
    * Test getDelayString4AsURL() method.
    */
    @Test
    public void subTestGetDelayString4AsURL() {
        assertEquals(null, this.jMetaDataMenu.getDelayString4AsURL());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS URL === " + jMetaDataMenu.getDelayString4AsURL());
    }

   /**
    * Test getCountriesAsInteger() method.
    */
    @Test
    public void subTestGetCountriesAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getCountriesAsInteger());
        System.out.println("Countries AS Integer === " + jMetaDataMenu.getCountriesAsInteger());
    }

   /**
    * Test getCountriesAsLong() method.
    */
    @Test
    public void subTestGetCountriesAsLong() {
        assertEquals(null, this.jMetaDataMenu.getCountriesAsLong());
        System.out.println("Countries AS Long === " + jMetaDataMenu.getCountriesAsLong());
    }

   /**
    * Test getCountriesAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCountriesAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getCountriesAsLocalDateTime());
        System.out.println("Countries AS LocalDateTime === " + jMetaDataMenu.getCountriesAsLocalDateTime());
    }

   /**
    * Test getCountriesAsLocalTime() method.
    */
    @Test
    public void subTestGetCountriesAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getCountriesAsLocalTime());
        System.out.println("Countries AS LocalTime === " + jMetaDataMenu.getCountriesAsLocalTime());
    }

   /**
    * Test getCountriesAsString() method.
    */
    @Test
    public void subTestGetCountriesAsString() {
        assertEquals(null, this.jMetaDataMenu.getCountriesAsString());
        System.out.println("Countries AS String === " + jMetaDataMenu.getCountriesAsString());
    }

   /**
    * Test getCountriesAsBoolean() method.
    */
    @Test
    public void subTestGetCountriesAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getCountriesAsBoolean());
        System.out.println("Countries AS Boolean === " + jMetaDataMenu.getCountriesAsBoolean());
    }

   /**
    * Test getCountriesAsBigInteger() method.
    */
    @Test
    public void subTestGetCountriesAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getCountriesAsBigInteger());
        System.out.println("Countries AS BigInteger === " + jMetaDataMenu.getCountriesAsBigInteger());
    }

   /**
    * Test getCountriesAsURL() method.
    */
    @Test
    public void subTestGetCountriesAsURL() {
        assertEquals(null, this.jMetaDataMenu.getCountriesAsURL());
        System.out.println("Countries AS URL === " + jMetaDataMenu.getCountriesAsURL());
    }

   /**
    * Test getStreamOrderAsInteger() method.
    */
    @Test
    public void subTestGetStreamOrderAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getStreamOrderAsInteger());
        System.out.println("Stream order in the file, whatever is the kind of stream (base=0) AS Integer === " + jMetaDataMenu.getStreamOrderAsInteger());
    }

   /**
    * Test getStreamOrderAsLong() method.
    */
    @Test
    public void subTestGetStreamOrderAsLong() {
        assertEquals(null, this.jMetaDataMenu.getStreamOrderAsLong());
        System.out.println("Stream order in the file, whatever is the kind of stream (base=0) AS Long === " + jMetaDataMenu.getStreamOrderAsLong());
    }

   /**
    * Test getStreamOrderAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamOrderAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getStreamOrderAsLocalDateTime());
        System.out.println("Stream order in the file, whatever is the kind of stream (base=0) AS LocalDateTime === " + jMetaDataMenu.getStreamOrderAsLocalDateTime());
    }

   /**
    * Test getStreamOrderAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamOrderAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getStreamOrderAsLocalTime());
        System.out.println("Stream order in the file, whatever is the kind of stream (base=0) AS LocalTime === " + jMetaDataMenu.getStreamOrderAsLocalTime());
    }

   /**
    * Test getStreamOrderAsString() method.
    */
    @Test
    public void subTestGetStreamOrderAsString() {
        assertEquals(null, this.jMetaDataMenu.getStreamOrderAsString());
        System.out.println("Stream order in the file, whatever is the kind of stream (base=0) AS String === " + jMetaDataMenu.getStreamOrderAsString());
    }

   /**
    * Test getStreamOrderAsBoolean() method.
    */
    @Test
    public void subTestGetStreamOrderAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getStreamOrderAsBoolean());
        System.out.println("Stream order in the file, whatever is the kind of stream (base=0) AS Boolean === " + jMetaDataMenu.getStreamOrderAsBoolean());
    }

   /**
    * Test getStreamOrderAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamOrderAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getStreamOrderAsBigInteger());
        System.out.println("Stream order in the file, whatever is the kind of stream (base=0) AS BigInteger === " + jMetaDataMenu.getStreamOrderAsBigInteger());
    }

   /**
    * Test getStreamOrderAsURL() method.
    */
    @Test
    public void subTestGetStreamOrderAsURL() {
        assertEquals(null, this.jMetaDataMenu.getStreamOrderAsURL());
        System.out.println("Stream order in the file, whatever is the kind of stream (base=0) AS URL === " + jMetaDataMenu.getStreamOrderAsURL());
    }

   /**
    * Test getDelayString1AsInteger() method.
    */
    @Test
    public void subTestGetDelayString1AsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDelayString1AsInteger());
        System.out.println("Delay with measurement AS Integer === " + jMetaDataMenu.getDelayString1AsInteger());
    }

   /**
    * Test getDelayString1AsLong() method.
    */
    @Test
    public void subTestGetDelayString1AsLong() {
        assertEquals(null, this.jMetaDataMenu.getDelayString1AsLong());
        System.out.println("Delay with measurement AS Long === " + jMetaDataMenu.getDelayString1AsLong());
    }

   /**
    * Test getDelayString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDelayString1AsLocalDateTime());
        System.out.println("Delay with measurement AS LocalDateTime === " + jMetaDataMenu.getDelayString1AsLocalDateTime());
    }

   /**
    * Test getDelayString1AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayString1AsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDelayString1AsLocalTime());
        System.out.println("Delay with measurement AS LocalTime === " + jMetaDataMenu.getDelayString1AsLocalTime());
    }

   /**
    * Test getDelayString1AsString() method.
    */
    @Test
    public void subTestGetDelayString1AsString() {
        assertEquals(null, this.jMetaDataMenu.getDelayString1AsString());
        System.out.println("Delay with measurement AS String === " + jMetaDataMenu.getDelayString1AsString());
    }

   /**
    * Test getDelayString1AsBoolean() method.
    */
    @Test
    public void subTestGetDelayString1AsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDelayString1AsBoolean());
        System.out.println("Delay with measurement AS Boolean === " + jMetaDataMenu.getDelayString1AsBoolean());
    }

   /**
    * Test getDelayString1AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayString1AsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDelayString1AsBigInteger());
        System.out.println("Delay with measurement AS BigInteger === " + jMetaDataMenu.getDelayString1AsBigInteger());
    }

   /**
    * Test getDelayString1AsURL() method.
    */
    @Test
    public void subTestGetDelayString1AsURL() {
        assertEquals(null, this.jMetaDataMenu.getDelayString1AsURL());
        System.out.println("Delay with measurement AS URL === " + jMetaDataMenu.getDelayString1AsURL());
    }

   /**
    * Test getDelayString2AsInteger() method.
    */
    @Test
    public void subTestGetDelayString2AsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDelayString2AsInteger());
        System.out.println("Delay with measurement AS Integer === " + jMetaDataMenu.getDelayString2AsInteger());
    }

   /**
    * Test getDelayString2AsLong() method.
    */
    @Test
    public void subTestGetDelayString2AsLong() {
        assertEquals(null, this.jMetaDataMenu.getDelayString2AsLong());
        System.out.println("Delay with measurement AS Long === " + jMetaDataMenu.getDelayString2AsLong());
    }

   /**
    * Test getDelayString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDelayString2AsLocalDateTime());
        System.out.println("Delay with measurement AS LocalDateTime === " + jMetaDataMenu.getDelayString2AsLocalDateTime());
    }

   /**
    * Test getDelayString2AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayString2AsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDelayString2AsLocalTime());
        System.out.println("Delay with measurement AS LocalTime === " + jMetaDataMenu.getDelayString2AsLocalTime());
    }

   /**
    * Test getDelayString2AsString() method.
    */
    @Test
    public void subTestGetDelayString2AsString() {
        assertEquals(null, this.jMetaDataMenu.getDelayString2AsString());
        System.out.println("Delay with measurement AS String === " + jMetaDataMenu.getDelayString2AsString());
    }

   /**
    * Test getDelayString2AsBoolean() method.
    */
    @Test
    public void subTestGetDelayString2AsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDelayString2AsBoolean());
        System.out.println("Delay with measurement AS Boolean === " + jMetaDataMenu.getDelayString2AsBoolean());
    }

   /**
    * Test getDelayString2AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayString2AsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDelayString2AsBigInteger());
        System.out.println("Delay with measurement AS BigInteger === " + jMetaDataMenu.getDelayString2AsBigInteger());
    }

   /**
    * Test getDelayString2AsURL() method.
    */
    @Test
    public void subTestGetDelayString2AsURL() {
        assertEquals(null, this.jMetaDataMenu.getDelayString2AsURL());
        System.out.println("Delay with measurement AS URL === " + jMetaDataMenu.getDelayString2AsURL());
    }

   /**
    * Test getDelayString5AsInteger() method.
    */
    @Test
    public void subTestGetDelayString5AsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDelayString5AsInteger());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Integer === " + jMetaDataMenu.getDelayString5AsInteger());
    }

   /**
    * Test getDelayString5AsLong() method.
    */
    @Test
    public void subTestGetDelayString5AsLong() {
        assertEquals(null, this.jMetaDataMenu.getDelayString5AsLong());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Long === " + jMetaDataMenu.getDelayString5AsLong());
    }

   /**
    * Test getDelayString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDelayString5AsLocalDateTime());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS LocalDateTime === " + jMetaDataMenu.getDelayString5AsLocalDateTime());
    }

   /**
    * Test getDelayString5AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayString5AsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDelayString5AsLocalTime());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS LocalTime === " + jMetaDataMenu.getDelayString5AsLocalTime());
    }

   /**
    * Test getDelayString5AsString() method.
    */
    @Test
    public void subTestGetDelayString5AsString() {
        assertEquals(null, this.jMetaDataMenu.getDelayString5AsString());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS String === " + jMetaDataMenu.getDelayString5AsString());
    }

   /**
    * Test getDelayString5AsBoolean() method.
    */
    @Test
    public void subTestGetDelayString5AsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDelayString5AsBoolean());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Boolean === " + jMetaDataMenu.getDelayString5AsBoolean());
    }

   /**
    * Test getDelayString5AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayString5AsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDelayString5AsBigInteger());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS BigInteger === " + jMetaDataMenu.getDelayString5AsBigInteger());
    }

   /**
    * Test getDelayString5AsURL() method.
    */
    @Test
    public void subTestGetDelayString5AsURL() {
        assertEquals(null, this.jMetaDataMenu.getDelayString5AsURL());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS URL === " + jMetaDataMenu.getDelayString5AsURL());
    }

   /**
    * Test getForcedStringAsInteger() method.
    */
    @Test
    public void subTestGetForcedStringAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getForcedStringAsInteger());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS Integer === " + jMetaDataMenu.getForcedStringAsInteger());
    }

   /**
    * Test getForcedStringAsLong() method.
    */
    @Test
    public void subTestGetForcedStringAsLong() {
        assertEquals(null, this.jMetaDataMenu.getForcedStringAsLong());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS Long === " + jMetaDataMenu.getForcedStringAsLong());
    }

   /**
    * Test getForcedStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetForcedStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getForcedStringAsLocalDateTime());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS LocalDateTime === " + jMetaDataMenu.getForcedStringAsLocalDateTime());
    }

   /**
    * Test getForcedStringAsLocalTime() method.
    */
    @Test
    public void subTestGetForcedStringAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getForcedStringAsLocalTime());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS LocalTime === " + jMetaDataMenu.getForcedStringAsLocalTime());
    }

   /**
    * Test getForcedStringAsString() method.
    */
    @Test
    public void subTestGetForcedStringAsString() {
        assertEquals(null, this.jMetaDataMenu.getForcedStringAsString());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS String === " + jMetaDataMenu.getForcedStringAsString());
    }

   /**
    * Test getForcedStringAsBoolean() method.
    */
    @Test
    public void subTestGetForcedStringAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getForcedStringAsBoolean());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS Boolean === " + jMetaDataMenu.getForcedStringAsBoolean());
    }

   /**
    * Test getForcedStringAsBigInteger() method.
    */
    @Test
    public void subTestGetForcedStringAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getForcedStringAsBigInteger());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS BigInteger === " + jMetaDataMenu.getForcedStringAsBigInteger());
    }

   /**
    * Test getForcedStringAsURL() method.
    */
    @Test
    public void subTestGetForcedStringAsURL() {
        assertEquals(null, this.jMetaDataMenu.getForcedStringAsURL());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS URL === " + jMetaDataMenu.getForcedStringAsURL());
    }

   /**
    * Test getCountAsInteger() method.
    */
    @Test
    public void subTestGetCountAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getCountAsInteger());
        System.out.println("Count of objects available in this stream AS Integer === " + jMetaDataMenu.getCountAsInteger());
    }

   /**
    * Test getCountAsLong() method.
    */
    @Test
    public void subTestGetCountAsLong() {
        assertEquals(null, this.jMetaDataMenu.getCountAsLong());
        System.out.println("Count of objects available in this stream AS Long === " + jMetaDataMenu.getCountAsLong());
    }

   /**
    * Test getCountAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCountAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getCountAsLocalDateTime());
        System.out.println("Count of objects available in this stream AS LocalDateTime === " + jMetaDataMenu.getCountAsLocalDateTime());
    }

   /**
    * Test getCountAsLocalTime() method.
    */
    @Test
    public void subTestGetCountAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getCountAsLocalTime());
        System.out.println("Count of objects available in this stream AS LocalTime === " + jMetaDataMenu.getCountAsLocalTime());
    }

   /**
    * Test getCountAsString() method.
    */
    @Test
    public void subTestGetCountAsString() {
        assertEquals(null, this.jMetaDataMenu.getCountAsString());
        System.out.println("Count of objects available in this stream AS String === " + jMetaDataMenu.getCountAsString());
    }

   /**
    * Test getCountAsBoolean() method.
    */
    @Test
    public void subTestGetCountAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getCountAsBoolean());
        System.out.println("Count of objects available in this stream AS Boolean === " + jMetaDataMenu.getCountAsBoolean());
    }

   /**
    * Test getCountAsBigInteger() method.
    */
    @Test
    public void subTestGetCountAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getCountAsBigInteger());
        System.out.println("Count of objects available in this stream AS BigInteger === " + jMetaDataMenu.getCountAsBigInteger());
    }

   /**
    * Test getCountAsURL() method.
    */
    @Test
    public void subTestGetCountAsURL() {
        assertEquals(null, this.jMetaDataMenu.getCountAsURL());
        System.out.println("Count of objects available in this stream AS URL === " + jMetaDataMenu.getCountAsURL());
    }

   /**
    * Test getDelayAsInteger() method.
    */
    @Test
    public void subTestGetDelayAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDelayAsInteger());
        System.out.println("Delay fixed in the stream (relative) IN MS AS Integer === " + jMetaDataMenu.getDelayAsInteger());
    }

   /**
    * Test getDelayAsLong() method.
    */
    @Test
    public void subTestGetDelayAsLong() {
        assertEquals(null, this.jMetaDataMenu.getDelayAsLong());
        System.out.println("Delay fixed in the stream (relative) IN MS AS Long === " + jMetaDataMenu.getDelayAsLong());
    }

   /**
    * Test getDelayAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDelayAsLocalDateTime());
        System.out.println("Delay fixed in the stream (relative) IN MS AS LocalDateTime === " + jMetaDataMenu.getDelayAsLocalDateTime());
    }

   /**
    * Test getDelayAsLocalTime() method.
    */
    @Test
    public void subTestGetDelayAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDelayAsLocalTime());
        System.out.println("Delay fixed in the stream (relative) IN MS AS LocalTime === " + jMetaDataMenu.getDelayAsLocalTime());
    }

   /**
    * Test getDelayAsString() method.
    */
    @Test
    public void subTestGetDelayAsString() {
        assertEquals(null, this.jMetaDataMenu.getDelayAsString());
        System.out.println("Delay fixed in the stream (relative) IN MS AS String === " + jMetaDataMenu.getDelayAsString());
    }

   /**
    * Test getDelayAsBoolean() method.
    */
    @Test
    public void subTestGetDelayAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDelayAsBoolean());
        System.out.println("Delay fixed in the stream (relative) IN MS AS Boolean === " + jMetaDataMenu.getDelayAsBoolean());
    }

   /**
    * Test getDelayAsBigInteger() method.
    */
    @Test
    public void subTestGetDelayAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDelayAsBigInteger());
        System.out.println("Delay fixed in the stream (relative) IN MS AS BigInteger === " + jMetaDataMenu.getDelayAsBigInteger());
    }

   /**
    * Test getDelayAsURL() method.
    */
    @Test
    public void subTestGetDelayAsURL() {
        assertEquals(null, this.jMetaDataMenu.getDelayAsURL());
        System.out.println("Delay fixed in the stream (relative) IN MS AS URL === " + jMetaDataMenu.getDelayAsURL());
    }

   /**
    * Test getStreamCountAsInteger() method.
    */
    @Test
    public void subTestGetStreamCountAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getStreamCountAsInteger());
        System.out.println("Count of streams of that kind available AS Integer === " + jMetaDataMenu.getStreamCountAsInteger());
    }

   /**
    * Test getStreamCountAsLong() method.
    */
    @Test
    public void subTestGetStreamCountAsLong() {
        assertEquals(null, this.jMetaDataMenu.getStreamCountAsLong());
        System.out.println("Count of streams of that kind available AS Long === " + jMetaDataMenu.getStreamCountAsLong());
    }

   /**
    * Test getStreamCountAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamCountAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getStreamCountAsLocalDateTime());
        System.out.println("Count of streams of that kind available AS LocalDateTime === " + jMetaDataMenu.getStreamCountAsLocalDateTime());
    }

   /**
    * Test getStreamCountAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamCountAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getStreamCountAsLocalTime());
        System.out.println("Count of streams of that kind available AS LocalTime === " + jMetaDataMenu.getStreamCountAsLocalTime());
    }

   /**
    * Test getStreamCountAsString() method.
    */
    @Test
    public void subTestGetStreamCountAsString() {
        assertEquals(null, this.jMetaDataMenu.getStreamCountAsString());
        System.out.println("Count of streams of that kind available AS String === " + jMetaDataMenu.getStreamCountAsString());
    }

   /**
    * Test getStreamCountAsBoolean() method.
    */
    @Test
    public void subTestGetStreamCountAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getStreamCountAsBoolean());
        System.out.println("Count of streams of that kind available AS Boolean === " + jMetaDataMenu.getStreamCountAsBoolean());
    }

   /**
    * Test getStreamCountAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamCountAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getStreamCountAsBigInteger());
        System.out.println("Count of streams of that kind available AS BigInteger === " + jMetaDataMenu.getStreamCountAsBigInteger());
    }

   /**
    * Test getStreamCountAsURL() method.
    */
    @Test
    public void subTestGetStreamCountAsURL() {
        assertEquals(null, this.jMetaDataMenu.getStreamCountAsURL());
        System.out.println("Count of streams of that kind available AS URL === " + jMetaDataMenu.getStreamCountAsURL());
    }

   /**
    * Test getChaptersPosEndAsInteger() method.
    */
    @Test
    public void subTestGetChaptersPosEndAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getChaptersPosEndAsInteger());
        System.out.println("Used by third-party developers to know about the end of the chapters list (this position excluded) AS Integer === " + jMetaDataMenu.getChaptersPosEndAsInteger());
    }

   /**
    * Test getChaptersPosEndAsLong() method.
    */
    @Test
    public void subTestGetChaptersPosEndAsLong() {
        assertEquals(null, this.jMetaDataMenu.getChaptersPosEndAsLong());
        System.out.println("Used by third-party developers to know about the end of the chapters list (this position excluded) AS Long === " + jMetaDataMenu.getChaptersPosEndAsLong());
    }

   /**
    * Test getChaptersPosEndAsLocalDateTime() method.
    */
    @Test
    public void subTestGetChaptersPosEndAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getChaptersPosEndAsLocalDateTime());
        System.out.println("Used by third-party developers to know about the end of the chapters list (this position excluded) AS LocalDateTime === " + jMetaDataMenu.getChaptersPosEndAsLocalDateTime());
    }

   /**
    * Test getChaptersPosEndAsLocalTime() method.
    */
    @Test
    public void subTestGetChaptersPosEndAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getChaptersPosEndAsLocalTime());
        System.out.println("Used by third-party developers to know about the end of the chapters list (this position excluded) AS LocalTime === " + jMetaDataMenu.getChaptersPosEndAsLocalTime());
    }

   /**
    * Test getChaptersPosEndAsString() method.
    */
    @Test
    public void subTestGetChaptersPosEndAsString() {
        assertEquals(null, this.jMetaDataMenu.getChaptersPosEndAsString());
        System.out.println("Used by third-party developers to know about the end of the chapters list (this position excluded) AS String === " + jMetaDataMenu.getChaptersPosEndAsString());
    }

   /**
    * Test getChaptersPosEndAsBoolean() method.
    */
    @Test
    public void subTestGetChaptersPosEndAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getChaptersPosEndAsBoolean());
        System.out.println("Used by third-party developers to know about the end of the chapters list (this position excluded) AS Boolean === " + jMetaDataMenu.getChaptersPosEndAsBoolean());
    }

   /**
    * Test getChaptersPosEndAsBigInteger() method.
    */
    @Test
    public void subTestGetChaptersPosEndAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getChaptersPosEndAsBigInteger());
        System.out.println("Used by third-party developers to know about the end of the chapters list (this position excluded) AS BigInteger === " + jMetaDataMenu.getChaptersPosEndAsBigInteger());
    }

   /**
    * Test getChaptersPosEndAsURL() method.
    */
    @Test
    public void subTestGetChaptersPosEndAsURL() {
        assertEquals(null, this.jMetaDataMenu.getChaptersPosEndAsURL());
        System.out.println("Used by third-party developers to know about the end of the chapters list (this position excluded) AS URL === " + jMetaDataMenu.getChaptersPosEndAsURL());
    }

   /**
    * Test getFormatVersionAsInteger() method.
    */
    @Test
    public void subTestGetFormatVersionAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getFormatVersionAsInteger());
        System.out.println("Version of this format AS Integer === " + jMetaDataMenu.getFormatVersionAsInteger());
    }

   /**
    * Test getFormatVersionAsLong() method.
    */
    @Test
    public void subTestGetFormatVersionAsLong() {
        assertEquals(null, this.jMetaDataMenu.getFormatVersionAsLong());
        System.out.println("Version of this format AS Long === " + jMetaDataMenu.getFormatVersionAsLong());
    }

   /**
    * Test getFormatVersionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatVersionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getFormatVersionAsLocalDateTime());
        System.out.println("Version of this format AS LocalDateTime === " + jMetaDataMenu.getFormatVersionAsLocalDateTime());
    }

   /**
    * Test getFormatVersionAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatVersionAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getFormatVersionAsLocalTime());
        System.out.println("Version of this format AS LocalTime === " + jMetaDataMenu.getFormatVersionAsLocalTime());
    }

   /**
    * Test getFormatVersionAsString() method.
    */
    @Test
    public void subTestGetFormatVersionAsString() {
        assertEquals(null, this.jMetaDataMenu.getFormatVersionAsString());
        System.out.println("Version of this format AS String === " + jMetaDataMenu.getFormatVersionAsString());
    }

   /**
    * Test getFormatVersionAsBoolean() method.
    */
    @Test
    public void subTestGetFormatVersionAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getFormatVersionAsBoolean());
        System.out.println("Version of this format AS Boolean === " + jMetaDataMenu.getFormatVersionAsBoolean());
    }

   /**
    * Test getFormatVersionAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatVersionAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getFormatVersionAsBigInteger());
        System.out.println("Version of this format AS BigInteger === " + jMetaDataMenu.getFormatVersionAsBigInteger());
    }

   /**
    * Test getFormatVersionAsURL() method.
    */
    @Test
    public void subTestGetFormatVersionAsURL() {
        assertEquals(null, this.jMetaDataMenu.getFormatVersionAsURL());
        System.out.println("Version of this format AS URL === " + jMetaDataMenu.getFormatVersionAsURL());
    }

   /**
    * Test getStreamKindPosAsInteger() method.
    */
    @Test
    public void subTestGetStreamKindPosAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindPosAsInteger());
        System.out.println("When multiple streams, number of the stream (base=1) AS Integer === " + jMetaDataMenu.getStreamKindPosAsInteger());
    }

   /**
    * Test getStreamKindPosAsLong() method.
    */
    @Test
    public void subTestGetStreamKindPosAsLong() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindPosAsLong());
        System.out.println("When multiple streams, number of the stream (base=1) AS Long === " + jMetaDataMenu.getStreamKindPosAsLong());
    }

   /**
    * Test getStreamKindPosAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamKindPosAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindPosAsLocalDateTime());
        System.out.println("When multiple streams, number of the stream (base=1) AS LocalDateTime === " + jMetaDataMenu.getStreamKindPosAsLocalDateTime());
    }

   /**
    * Test getStreamKindPosAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamKindPosAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindPosAsLocalTime());
        System.out.println("When multiple streams, number of the stream (base=1) AS LocalTime === " + jMetaDataMenu.getStreamKindPosAsLocalTime());
    }

   /**
    * Test getStreamKindPosAsString() method.
    */
    @Test
    public void subTestGetStreamKindPosAsString() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindPosAsString());
        System.out.println("When multiple streams, number of the stream (base=1) AS String === " + jMetaDataMenu.getStreamKindPosAsString());
    }

   /**
    * Test getStreamKindPosAsBoolean() method.
    */
    @Test
    public void subTestGetStreamKindPosAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindPosAsBoolean());
        System.out.println("When multiple streams, number of the stream (base=1) AS Boolean === " + jMetaDataMenu.getStreamKindPosAsBoolean());
    }

   /**
    * Test getStreamKindPosAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamKindPosAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindPosAsBigInteger());
        System.out.println("When multiple streams, number of the stream (base=1) AS BigInteger === " + jMetaDataMenu.getStreamKindPosAsBigInteger());
    }

   /**
    * Test getStreamKindPosAsURL() method.
    */
    @Test
    public void subTestGetStreamKindPosAsURL() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindPosAsURL());
        System.out.println("When multiple streams, number of the stream (base=1) AS URL === " + jMetaDataMenu.getStreamKindPosAsURL());
    }

   /**
    * Test getOriginalSourceMediumIDAsInteger() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getOriginalSourceMediumIDAsInteger());
        System.out.println("The ID for this stream in the original medium of the material AS Integer === " + jMetaDataMenu.getOriginalSourceMediumIDAsInteger());
    }

   /**
    * Test getOriginalSourceMediumIDAsLong() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsLong() {
        assertEquals(null, this.jMetaDataMenu.getOriginalSourceMediumIDAsLong());
        System.out.println("The ID for this stream in the original medium of the material AS Long === " + jMetaDataMenu.getOriginalSourceMediumIDAsLong());
    }

   /**
    * Test getOriginalSourceMediumIDAsLocalDateTime() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getOriginalSourceMediumIDAsLocalDateTime());
        System.out.println("The ID for this stream in the original medium of the material AS LocalDateTime === " + jMetaDataMenu.getOriginalSourceMediumIDAsLocalDateTime());
    }

   /**
    * Test getOriginalSourceMediumIDAsLocalTime() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getOriginalSourceMediumIDAsLocalTime());
        System.out.println("The ID for this stream in the original medium of the material AS LocalTime === " + jMetaDataMenu.getOriginalSourceMediumIDAsLocalTime());
    }

   /**
    * Test getOriginalSourceMediumIDAsString() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsString() {
        assertEquals(null, this.jMetaDataMenu.getOriginalSourceMediumIDAsString());
        System.out.println("The ID for this stream in the original medium of the material AS String === " + jMetaDataMenu.getOriginalSourceMediumIDAsString());
    }

   /**
    * Test getOriginalSourceMediumIDAsBoolean() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getOriginalSourceMediumIDAsBoolean());
        System.out.println("The ID for this stream in the original medium of the material AS Boolean === " + jMetaDataMenu.getOriginalSourceMediumIDAsBoolean());
    }

   /**
    * Test getOriginalSourceMediumIDAsBigInteger() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getOriginalSourceMediumIDAsBigInteger());
        System.out.println("The ID for this stream in the original medium of the material AS BigInteger === " + jMetaDataMenu.getOriginalSourceMediumIDAsBigInteger());
    }

   /**
    * Test getOriginalSourceMediumIDAsURL() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsURL() {
        assertEquals(null, this.jMetaDataMenu.getOriginalSourceMediumIDAsURL());
        System.out.println("The ID for this stream in the original medium of the material AS URL === " + jMetaDataMenu.getOriginalSourceMediumIDAsURL());
    }

   /**
    * Test getDurationStringAsInteger() method.
    */
    @Test
    public void subTestGetDurationStringAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDurationStringAsInteger());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS Integer === " + jMetaDataMenu.getDurationStringAsInteger());
    }

   /**
    * Test getDurationStringAsLong() method.
    */
    @Test
    public void subTestGetDurationStringAsLong() {
        assertEquals(null, this.jMetaDataMenu.getDurationStringAsLong());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS Long === " + jMetaDataMenu.getDurationStringAsLong());
    }

   /**
    * Test getDurationStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDurationStringAsLocalDateTime());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS LocalDateTime === " + jMetaDataMenu.getDurationStringAsLocalDateTime());
    }

   /**
    * Test getDurationStringAsLocalTime() method.
    */
    @Test
    public void subTestGetDurationStringAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDurationStringAsLocalTime());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS LocalTime === " + jMetaDataMenu.getDurationStringAsLocalTime());
    }

   /**
    * Test getDurationStringAsString() method.
    */
    @Test
    public void subTestGetDurationStringAsString() {
        assertEquals(null, this.jMetaDataMenu.getDurationStringAsString());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS String === " + jMetaDataMenu.getDurationStringAsString());
    }

   /**
    * Test getDurationStringAsBoolean() method.
    */
    @Test
    public void subTestGetDurationStringAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDurationStringAsBoolean());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS Boolean === " + jMetaDataMenu.getDurationStringAsBoolean());
    }

   /**
    * Test getDurationStringAsBigInteger() method.
    */
    @Test
    public void subTestGetDurationStringAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDurationStringAsBigInteger());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS BigInteger === " + jMetaDataMenu.getDurationStringAsBigInteger());
    }

   /**
    * Test getDurationStringAsURL() method.
    */
    @Test
    public void subTestGetDurationStringAsURL() {
        assertEquals(null, this.jMetaDataMenu.getDurationStringAsURL());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS URL === " + jMetaDataMenu.getDurationStringAsURL());
    }

   /**
    * Test getServiceTypeAsInteger() method.
    */
    @Test
    public void subTestGetServiceTypeAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getServiceTypeAsInteger());
        System.out.println("ServiceType AS Integer === " + jMetaDataMenu.getServiceTypeAsInteger());
    }

   /**
    * Test getServiceTypeAsLong() method.
    */
    @Test
    public void subTestGetServiceTypeAsLong() {
        assertEquals(null, this.jMetaDataMenu.getServiceTypeAsLong());
        System.out.println("ServiceType AS Long === " + jMetaDataMenu.getServiceTypeAsLong());
    }

   /**
    * Test getServiceTypeAsLocalDateTime() method.
    */
    @Test
    public void subTestGetServiceTypeAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getServiceTypeAsLocalDateTime());
        System.out.println("ServiceType AS LocalDateTime === " + jMetaDataMenu.getServiceTypeAsLocalDateTime());
    }

   /**
    * Test getServiceTypeAsLocalTime() method.
    */
    @Test
    public void subTestGetServiceTypeAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getServiceTypeAsLocalTime());
        System.out.println("ServiceType AS LocalTime === " + jMetaDataMenu.getServiceTypeAsLocalTime());
    }

   /**
    * Test getServiceTypeAsString() method.
    */
    @Test
    public void subTestGetServiceTypeAsString() {
        assertEquals(null, this.jMetaDataMenu.getServiceTypeAsString());
        System.out.println("ServiceType AS String === " + jMetaDataMenu.getServiceTypeAsString());
    }

   /**
    * Test getServiceTypeAsBoolean() method.
    */
    @Test
    public void subTestGetServiceTypeAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getServiceTypeAsBoolean());
        System.out.println("ServiceType AS Boolean === " + jMetaDataMenu.getServiceTypeAsBoolean());
    }

   /**
    * Test getServiceTypeAsBigInteger() method.
    */
    @Test
    public void subTestGetServiceTypeAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getServiceTypeAsBigInteger());
        System.out.println("ServiceType AS BigInteger === " + jMetaDataMenu.getServiceTypeAsBigInteger());
    }

   /**
    * Test getServiceTypeAsURL() method.
    */
    @Test
    public void subTestGetServiceTypeAsURL() {
        assertEquals(null, this.jMetaDataMenu.getServiceTypeAsURL());
        System.out.println("ServiceType AS URL === " + jMetaDataMenu.getServiceTypeAsURL());
    }

   /**
    * Test getFormatCompressionAsInteger() method.
    */
    @Test
    public void subTestGetFormatCompressionAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getFormatCompressionAsInteger());
        System.out.println("Compression method used AS Integer === " + jMetaDataMenu.getFormatCompressionAsInteger());
    }

   /**
    * Test getFormatCompressionAsLong() method.
    */
    @Test
    public void subTestGetFormatCompressionAsLong() {
        assertEquals(null, this.jMetaDataMenu.getFormatCompressionAsLong());
        System.out.println("Compression method used AS Long === " + jMetaDataMenu.getFormatCompressionAsLong());
    }

   /**
    * Test getFormatCompressionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatCompressionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getFormatCompressionAsLocalDateTime());
        System.out.println("Compression method used AS LocalDateTime === " + jMetaDataMenu.getFormatCompressionAsLocalDateTime());
    }

   /**
    * Test getFormatCompressionAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatCompressionAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getFormatCompressionAsLocalTime());
        System.out.println("Compression method used AS LocalTime === " + jMetaDataMenu.getFormatCompressionAsLocalTime());
    }

   /**
    * Test getFormatCompressionAsString() method.
    */
    @Test
    public void subTestGetFormatCompressionAsString() {
        assertEquals(null, this.jMetaDataMenu.getFormatCompressionAsString());
        System.out.println("Compression method used AS String === " + jMetaDataMenu.getFormatCompressionAsString());
    }

   /**
    * Test getFormatCompressionAsBoolean() method.
    */
    @Test
    public void subTestGetFormatCompressionAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getFormatCompressionAsBoolean());
        System.out.println("Compression method used AS Boolean === " + jMetaDataMenu.getFormatCompressionAsBoolean());
    }

   /**
    * Test getFormatCompressionAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatCompressionAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getFormatCompressionAsBigInteger());
        System.out.println("Compression method used AS BigInteger === " + jMetaDataMenu.getFormatCompressionAsBigInteger());
    }

   /**
    * Test getFormatCompressionAsURL() method.
    */
    @Test
    public void subTestGetFormatCompressionAsURL() {
        assertEquals(null, this.jMetaDataMenu.getFormatCompressionAsURL());
        System.out.println("Compression method used AS URL === " + jMetaDataMenu.getFormatCompressionAsURL());
    }

   /**
    * Test getListAsInteger() method.
    */
    @Test
    public void subTestGetListAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getListAsInteger());
        System.out.println("List of programs available AS Integer === " + jMetaDataMenu.getListAsInteger());
    }

   /**
    * Test getListAsLong() method.
    */
    @Test
    public void subTestGetListAsLong() {
        assertEquals(null, this.jMetaDataMenu.getListAsLong());
        System.out.println("List of programs available AS Long === " + jMetaDataMenu.getListAsLong());
    }

   /**
    * Test getListAsLocalDateTime() method.
    */
    @Test
    public void subTestGetListAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getListAsLocalDateTime());
        System.out.println("List of programs available AS LocalDateTime === " + jMetaDataMenu.getListAsLocalDateTime());
    }

   /**
    * Test getListAsLocalTime() method.
    */
    @Test
    public void subTestGetListAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getListAsLocalTime());
        System.out.println("List of programs available AS LocalTime === " + jMetaDataMenu.getListAsLocalTime());
    }

   /**
    * Test getListAsString() method.
    */
    @Test
    public void subTestGetListAsString() {
        assertEquals(null, this.jMetaDataMenu.getListAsString());
        System.out.println("List of programs available AS String === " + jMetaDataMenu.getListAsString());
    }

   /**
    * Test getListAsBoolean() method.
    */
    @Test
    public void subTestGetListAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getListAsBoolean());
        System.out.println("List of programs available AS Boolean === " + jMetaDataMenu.getListAsBoolean());
    }

   /**
    * Test getListAsBigInteger() method.
    */
    @Test
    public void subTestGetListAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getListAsBigInteger());
        System.out.println("List of programs available AS BigInteger === " + jMetaDataMenu.getListAsBigInteger());
    }

   /**
    * Test getListAsURL() method.
    */
    @Test
    public void subTestGetListAsURL() {
        assertEquals(null, this.jMetaDataMenu.getListAsURL());
        System.out.println("List of programs available AS URL === " + jMetaDataMenu.getListAsURL());
    }

   /**
    * Test getIDAsInteger() method.
    */
    @Test
    public void subTestGetIDAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getIDAsInteger());
        System.out.println("The ID for this stream in this file AS Integer === " + jMetaDataMenu.getIDAsInteger());
    }

   /**
    * Test getIDAsLong() method.
    */
    @Test
    public void subTestGetIDAsLong() {
        assertEquals(null, this.jMetaDataMenu.getIDAsLong());
        System.out.println("The ID for this stream in this file AS Long === " + jMetaDataMenu.getIDAsLong());
    }

   /**
    * Test getIDAsLocalDateTime() method.
    */
    @Test
    public void subTestGetIDAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getIDAsLocalDateTime());
        System.out.println("The ID for this stream in this file AS LocalDateTime === " + jMetaDataMenu.getIDAsLocalDateTime());
    }

   /**
    * Test getIDAsLocalTime() method.
    */
    @Test
    public void subTestGetIDAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getIDAsLocalTime());
        System.out.println("The ID for this stream in this file AS LocalTime === " + jMetaDataMenu.getIDAsLocalTime());
    }

   /**
    * Test getIDAsString() method.
    */
    @Test
    public void subTestGetIDAsString() {
        assertEquals(null, this.jMetaDataMenu.getIDAsString());
        System.out.println("The ID for this stream in this file AS String === " + jMetaDataMenu.getIDAsString());
    }

   /**
    * Test getIDAsBoolean() method.
    */
    @Test
    public void subTestGetIDAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getIDAsBoolean());
        System.out.println("The ID for this stream in this file AS Boolean === " + jMetaDataMenu.getIDAsBoolean());
    }

   /**
    * Test getIDAsBigInteger() method.
    */
    @Test
    public void subTestGetIDAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getIDAsBigInteger());
        System.out.println("The ID for this stream in this file AS BigInteger === " + jMetaDataMenu.getIDAsBigInteger());
    }

   /**
    * Test getIDAsURL() method.
    */
    @Test
    public void subTestGetIDAsURL() {
        assertEquals(null, this.jMetaDataMenu.getIDAsURL());
        System.out.println("The ID for this stream in this file AS URL === " + jMetaDataMenu.getIDAsURL());
    }

   /**
    * Test getDelayStringAsInteger() method.
    */
    @Test
    public void subTestGetDelayStringAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDelayStringAsInteger());
        System.out.println("Delay with measurement AS Integer === " + jMetaDataMenu.getDelayStringAsInteger());
    }

   /**
    * Test getDelayStringAsLong() method.
    */
    @Test
    public void subTestGetDelayStringAsLong() {
        assertEquals(null, this.jMetaDataMenu.getDelayStringAsLong());
        System.out.println("Delay with measurement AS Long === " + jMetaDataMenu.getDelayStringAsLong());
    }

   /**
    * Test getDelayStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDelayStringAsLocalDateTime());
        System.out.println("Delay with measurement AS LocalDateTime === " + jMetaDataMenu.getDelayStringAsLocalDateTime());
    }

   /**
    * Test getDelayStringAsLocalTime() method.
    */
    @Test
    public void subTestGetDelayStringAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDelayStringAsLocalTime());
        System.out.println("Delay with measurement AS LocalTime === " + jMetaDataMenu.getDelayStringAsLocalTime());
    }

   /**
    * Test getDelayStringAsString() method.
    */
    @Test
    public void subTestGetDelayStringAsString() {
        assertEquals(null, this.jMetaDataMenu.getDelayStringAsString());
        System.out.println("Delay with measurement AS String === " + jMetaDataMenu.getDelayStringAsString());
    }

   /**
    * Test getDelayStringAsBoolean() method.
    */
    @Test
    public void subTestGetDelayStringAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDelayStringAsBoolean());
        System.out.println("Delay with measurement AS Boolean === " + jMetaDataMenu.getDelayStringAsBoolean());
    }

   /**
    * Test getDelayStringAsBigInteger() method.
    */
    @Test
    public void subTestGetDelayStringAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDelayStringAsBigInteger());
        System.out.println("Delay with measurement AS BigInteger === " + jMetaDataMenu.getDelayStringAsBigInteger());
    }

   /**
    * Test getDelayStringAsURL() method.
    */
    @Test
    public void subTestGetDelayStringAsURL() {
        assertEquals(null, this.jMetaDataMenu.getDelayStringAsURL());
        System.out.println("Delay with measurement AS URL === " + jMetaDataMenu.getDelayStringAsURL());
    }

   /**
    * Test getLawRatingAsInteger() method.
    */
    @Test
    public void subTestGetLawRatingAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getLawRatingAsInteger());
        System.out.println("Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo). AS Integer === " + jMetaDataMenu.getLawRatingAsInteger());
    }

   /**
    * Test getLawRatingAsLong() method.
    */
    @Test
    public void subTestGetLawRatingAsLong() {
        assertEquals(null, this.jMetaDataMenu.getLawRatingAsLong());
        System.out.println("Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo). AS Long === " + jMetaDataMenu.getLawRatingAsLong());
    }

   /**
    * Test getLawRatingAsLocalDateTime() method.
    */
    @Test
    public void subTestGetLawRatingAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getLawRatingAsLocalDateTime());
        System.out.println("Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo). AS LocalDateTime === " + jMetaDataMenu.getLawRatingAsLocalDateTime());
    }

   /**
    * Test getLawRatingAsLocalTime() method.
    */
    @Test
    public void subTestGetLawRatingAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getLawRatingAsLocalTime());
        System.out.println("Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo). AS LocalTime === " + jMetaDataMenu.getLawRatingAsLocalTime());
    }

   /**
    * Test getLawRatingAsString() method.
    */
    @Test
    public void subTestGetLawRatingAsString() {
        assertEquals(null, this.jMetaDataMenu.getLawRatingAsString());
        System.out.println("Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo). AS String === " + jMetaDataMenu.getLawRatingAsString());
    }

   /**
    * Test getLawRatingAsBoolean() method.
    */
    @Test
    public void subTestGetLawRatingAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getLawRatingAsBoolean());
        System.out.println("Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo). AS Boolean === " + jMetaDataMenu.getLawRatingAsBoolean());
    }

   /**
    * Test getLawRatingAsBigInteger() method.
    */
    @Test
    public void subTestGetLawRatingAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getLawRatingAsBigInteger());
        System.out.println("Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo). AS BigInteger === " + jMetaDataMenu.getLawRatingAsBigInteger());
    }

   /**
    * Test getLawRatingAsURL() method.
    */
    @Test
    public void subTestGetLawRatingAsURL() {
        assertEquals(null, this.jMetaDataMenu.getLawRatingAsURL());
        System.out.println("Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo). AS URL === " + jMetaDataMenu.getLawRatingAsURL());
    }

   /**
    * Test getDisabledAsInteger() method.
    */
    @Test
    public void subTestGetDisabledAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDisabledAsInteger());
        System.out.println("Set if that track should not be used AS Integer === " + jMetaDataMenu.getDisabledAsInteger());
    }

   /**
    * Test getDisabledAsLong() method.
    */
    @Test
    public void subTestGetDisabledAsLong() {
        assertEquals(null, this.jMetaDataMenu.getDisabledAsLong());
        System.out.println("Set if that track should not be used AS Long === " + jMetaDataMenu.getDisabledAsLong());
    }

   /**
    * Test getDisabledAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDisabledAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDisabledAsLocalDateTime());
        System.out.println("Set if that track should not be used AS LocalDateTime === " + jMetaDataMenu.getDisabledAsLocalDateTime());
    }

   /**
    * Test getDisabledAsLocalTime() method.
    */
    @Test
    public void subTestGetDisabledAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDisabledAsLocalTime());
        System.out.println("Set if that track should not be used AS LocalTime === " + jMetaDataMenu.getDisabledAsLocalTime());
    }

   /**
    * Test getDisabledAsString() method.
    */
    @Test
    public void subTestGetDisabledAsString() {
        assertEquals(null, this.jMetaDataMenu.getDisabledAsString());
        System.out.println("Set if that track should not be used AS String === " + jMetaDataMenu.getDisabledAsString());
    }

   /**
    * Test getDisabledAsBoolean() method.
    */
    @Test
    public void subTestGetDisabledAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDisabledAsBoolean());
        System.out.println("Set if that track should not be used AS Boolean === " + jMetaDataMenu.getDisabledAsBoolean());
    }

   /**
    * Test getDisabledAsBigInteger() method.
    */
    @Test
    public void subTestGetDisabledAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDisabledAsBigInteger());
        System.out.println("Set if that track should not be used AS BigInteger === " + jMetaDataMenu.getDisabledAsBigInteger());
    }

   /**
    * Test getDisabledAsURL() method.
    */
    @Test
    public void subTestGetDisabledAsURL() {
        assertEquals(null, this.jMetaDataMenu.getDisabledAsURL());
        System.out.println("Set if that track should not be used AS URL === " + jMetaDataMenu.getDisabledAsURL());
    }

   /**
    * Test getListStreamKindAsInteger() method.
    */
    @Test
    public void subTestGetListStreamKindAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getListStreamKindAsInteger());
        System.out.println("List of programs available AS Integer === " + jMetaDataMenu.getListStreamKindAsInteger());
    }

   /**
    * Test getListStreamKindAsLong() method.
    */
    @Test
    public void subTestGetListStreamKindAsLong() {
        assertEquals(null, this.jMetaDataMenu.getListStreamKindAsLong());
        System.out.println("List of programs available AS Long === " + jMetaDataMenu.getListStreamKindAsLong());
    }

   /**
    * Test getListStreamKindAsLocalDateTime() method.
    */
    @Test
    public void subTestGetListStreamKindAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getListStreamKindAsLocalDateTime());
        System.out.println("List of programs available AS LocalDateTime === " + jMetaDataMenu.getListStreamKindAsLocalDateTime());
    }

   /**
    * Test getListStreamKindAsLocalTime() method.
    */
    @Test
    public void subTestGetListStreamKindAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getListStreamKindAsLocalTime());
        System.out.println("List of programs available AS LocalTime === " + jMetaDataMenu.getListStreamKindAsLocalTime());
    }

   /**
    * Test getListStreamKindAsString() method.
    */
    @Test
    public void subTestGetListStreamKindAsString() {
        assertEquals(null, this.jMetaDataMenu.getListStreamKindAsString());
        System.out.println("List of programs available AS String === " + jMetaDataMenu.getListStreamKindAsString());
    }

   /**
    * Test getListStreamKindAsBoolean() method.
    */
    @Test
    public void subTestGetListStreamKindAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getListStreamKindAsBoolean());
        System.out.println("List of programs available AS Boolean === " + jMetaDataMenu.getListStreamKindAsBoolean());
    }

   /**
    * Test getListStreamKindAsBigInteger() method.
    */
    @Test
    public void subTestGetListStreamKindAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getListStreamKindAsBigInteger());
        System.out.println("List of programs available AS BigInteger === " + jMetaDataMenu.getListStreamKindAsBigInteger());
    }

   /**
    * Test getListStreamKindAsURL() method.
    */
    @Test
    public void subTestGetListStreamKindAsURL() {
        assertEquals(null, this.jMetaDataMenu.getListStreamKindAsURL());
        System.out.println("List of programs available AS URL === " + jMetaDataMenu.getListStreamKindAsURL());
    }

   /**
    * Test getCodecIDDescriptionAsInteger() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDDescriptionAsInteger());
        System.out.println("Manual description given by the container AS Integer === " + jMetaDataMenu.getCodecIDDescriptionAsInteger());
    }

   /**
    * Test getCodecIDDescriptionAsLong() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsLong() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDDescriptionAsLong());
        System.out.println("Manual description given by the container AS Long === " + jMetaDataMenu.getCodecIDDescriptionAsLong());
    }

   /**
    * Test getCodecIDDescriptionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDDescriptionAsLocalDateTime());
        System.out.println("Manual description given by the container AS LocalDateTime === " + jMetaDataMenu.getCodecIDDescriptionAsLocalDateTime());
    }

   /**
    * Test getCodecIDDescriptionAsLocalTime() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDDescriptionAsLocalTime());
        System.out.println("Manual description given by the container AS LocalTime === " + jMetaDataMenu.getCodecIDDescriptionAsLocalTime());
    }

   /**
    * Test getCodecIDDescriptionAsString() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsString() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDDescriptionAsString());
        System.out.println("Manual description given by the container AS String === " + jMetaDataMenu.getCodecIDDescriptionAsString());
    }

   /**
    * Test getCodecIDDescriptionAsBoolean() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDDescriptionAsBoolean());
        System.out.println("Manual description given by the container AS Boolean === " + jMetaDataMenu.getCodecIDDescriptionAsBoolean());
    }

   /**
    * Test getCodecIDDescriptionAsBigInteger() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDDescriptionAsBigInteger());
        System.out.println("Manual description given by the container AS BigInteger === " + jMetaDataMenu.getCodecIDDescriptionAsBigInteger());
    }

   /**
    * Test getCodecIDDescriptionAsURL() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsURL() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDDescriptionAsURL());
        System.out.println("Manual description given by the container AS URL === " + jMetaDataMenu.getCodecIDDescriptionAsURL());
    }

   /**
    * Test getStatusAsInteger() method.
    */
    @Test
    public void subTestGetStatusAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getStatusAsInteger());
        System.out.println("bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished) AS Integer === " + jMetaDataMenu.getStatusAsInteger());
    }

   /**
    * Test getStatusAsLong() method.
    */
    @Test
    public void subTestGetStatusAsLong() {
        assertEquals(null, this.jMetaDataMenu.getStatusAsLong());
        System.out.println("bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished) AS Long === " + jMetaDataMenu.getStatusAsLong());
    }

   /**
    * Test getStatusAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStatusAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getStatusAsLocalDateTime());
        System.out.println("bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished) AS LocalDateTime === " + jMetaDataMenu.getStatusAsLocalDateTime());
    }

   /**
    * Test getStatusAsLocalTime() method.
    */
    @Test
    public void subTestGetStatusAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getStatusAsLocalTime());
        System.out.println("bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished) AS LocalTime === " + jMetaDataMenu.getStatusAsLocalTime());
    }

   /**
    * Test getStatusAsString() method.
    */
    @Test
    public void subTestGetStatusAsString() {
        assertEquals(null, this.jMetaDataMenu.getStatusAsString());
        System.out.println("bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished) AS String === " + jMetaDataMenu.getStatusAsString());
    }

   /**
    * Test getStatusAsBoolean() method.
    */
    @Test
    public void subTestGetStatusAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getStatusAsBoolean());
        System.out.println("bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished) AS Boolean === " + jMetaDataMenu.getStatusAsBoolean());
    }

   /**
    * Test getStatusAsBigInteger() method.
    */
    @Test
    public void subTestGetStatusAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getStatusAsBigInteger());
        System.out.println("bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished) AS BigInteger === " + jMetaDataMenu.getStatusAsBigInteger());
    }

   /**
    * Test getStatusAsURL() method.
    */
    @Test
    public void subTestGetStatusAsURL() {
        assertEquals(null, this.jMetaDataMenu.getStatusAsURL());
        System.out.println("bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished) AS URL === " + jMetaDataMenu.getStatusAsURL());
    }

   /**
    * Test getMenuIDStringAsInteger() method.
    */
    @Test
    public void subTestGetMenuIDStringAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getMenuIDStringAsInteger());
        System.out.println("The menu ID for this stream in this file AS Integer === " + jMetaDataMenu.getMenuIDStringAsInteger());
    }

   /**
    * Test getMenuIDStringAsLong() method.
    */
    @Test
    public void subTestGetMenuIDStringAsLong() {
        assertEquals(null, this.jMetaDataMenu.getMenuIDStringAsLong());
        System.out.println("The menu ID for this stream in this file AS Long === " + jMetaDataMenu.getMenuIDStringAsLong());
    }

   /**
    * Test getMenuIDStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetMenuIDStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getMenuIDStringAsLocalDateTime());
        System.out.println("The menu ID for this stream in this file AS LocalDateTime === " + jMetaDataMenu.getMenuIDStringAsLocalDateTime());
    }

   /**
    * Test getMenuIDStringAsLocalTime() method.
    */
    @Test
    public void subTestGetMenuIDStringAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getMenuIDStringAsLocalTime());
        System.out.println("The menu ID for this stream in this file AS LocalTime === " + jMetaDataMenu.getMenuIDStringAsLocalTime());
    }

   /**
    * Test getMenuIDStringAsString() method.
    */
    @Test
    public void subTestGetMenuIDStringAsString() {
        assertEquals(null, this.jMetaDataMenu.getMenuIDStringAsString());
        System.out.println("The menu ID for this stream in this file AS String === " + jMetaDataMenu.getMenuIDStringAsString());
    }

   /**
    * Test getMenuIDStringAsBoolean() method.
    */
    @Test
    public void subTestGetMenuIDStringAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getMenuIDStringAsBoolean());
        System.out.println("The menu ID for this stream in this file AS Boolean === " + jMetaDataMenu.getMenuIDStringAsBoolean());
    }

   /**
    * Test getMenuIDStringAsBigInteger() method.
    */
    @Test
    public void subTestGetMenuIDStringAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getMenuIDStringAsBigInteger());
        System.out.println("The menu ID for this stream in this file AS BigInteger === " + jMetaDataMenu.getMenuIDStringAsBigInteger());
    }

   /**
    * Test getMenuIDStringAsURL() method.
    */
    @Test
    public void subTestGetMenuIDStringAsURL() {
        assertEquals(null, this.jMetaDataMenu.getMenuIDStringAsURL());
        System.out.println("The menu ID for this stream in this file AS URL === " + jMetaDataMenu.getMenuIDStringAsURL());
    }

   /**
    * Test getDurationString2AsInteger() method.
    */
    @Test
    public void subTestGetDurationString2AsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDurationString2AsInteger());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS Integer === " + jMetaDataMenu.getDurationString2AsInteger());
    }

   /**
    * Test getDurationString2AsLong() method.
    */
    @Test
    public void subTestGetDurationString2AsLong() {
        assertEquals(null, this.jMetaDataMenu.getDurationString2AsLong());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS Long === " + jMetaDataMenu.getDurationString2AsLong());
    }

   /**
    * Test getDurationString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDurationString2AsLocalDateTime());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS LocalDateTime === " + jMetaDataMenu.getDurationString2AsLocalDateTime());
    }

   /**
    * Test getDurationString2AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationString2AsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDurationString2AsLocalTime());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS LocalTime === " + jMetaDataMenu.getDurationString2AsLocalTime());
    }

   /**
    * Test getDurationString2AsString() method.
    */
    @Test
    public void subTestGetDurationString2AsString() {
        assertEquals(null, this.jMetaDataMenu.getDurationString2AsString());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS String === " + jMetaDataMenu.getDurationString2AsString());
    }

   /**
    * Test getDurationString2AsBoolean() method.
    */
    @Test
    public void subTestGetDurationString2AsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDurationString2AsBoolean());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS Boolean === " + jMetaDataMenu.getDurationString2AsBoolean());
    }

   /**
    * Test getDurationString2AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationString2AsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDurationString2AsBigInteger());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS BigInteger === " + jMetaDataMenu.getDurationString2AsBigInteger());
    }

   /**
    * Test getDurationString2AsURL() method.
    */
    @Test
    public void subTestGetDurationString2AsURL() {
        assertEquals(null, this.jMetaDataMenu.getDurationString2AsURL());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS URL === " + jMetaDataMenu.getDurationString2AsURL());
    }

   /**
    * Test getDurationString3AsInteger() method.
    */
    @Test
    public void subTestGetDurationString3AsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDurationString3AsInteger());
        System.out.println("Play time in format : HH:MM:SS.MMM AS Integer === " + jMetaDataMenu.getDurationString3AsInteger());
    }

   /**
    * Test getDurationString3AsLong() method.
    */
    @Test
    public void subTestGetDurationString3AsLong() {
        assertEquals(null, this.jMetaDataMenu.getDurationString3AsLong());
        System.out.println("Play time in format : HH:MM:SS.MMM AS Long === " + jMetaDataMenu.getDurationString3AsLong());
    }

   /**
    * Test getDurationString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDurationString3AsLocalDateTime());
        System.out.println("Play time in format : HH:MM:SS.MMM AS LocalDateTime === " + jMetaDataMenu.getDurationString3AsLocalDateTime());
    }

   /**
    * Test getDurationString3AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationString3AsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDurationString3AsLocalTime());
        System.out.println("Play time in format : HH:MM:SS.MMM AS LocalTime === " + jMetaDataMenu.getDurationString3AsLocalTime());
    }

   /**
    * Test getDurationString3AsString() method.
    */
    @Test
    public void subTestGetDurationString3AsString() {
        assertEquals(null, this.jMetaDataMenu.getDurationString3AsString());
        System.out.println("Play time in format : HH:MM:SS.MMM AS String === " + jMetaDataMenu.getDurationString3AsString());
    }

   /**
    * Test getDurationString3AsBoolean() method.
    */
    @Test
    public void subTestGetDurationString3AsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDurationString3AsBoolean());
        System.out.println("Play time in format : HH:MM:SS.MMM AS Boolean === " + jMetaDataMenu.getDurationString3AsBoolean());
    }

   /**
    * Test getDurationString3AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationString3AsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDurationString3AsBigInteger());
        System.out.println("Play time in format : HH:MM:SS.MMM AS BigInteger === " + jMetaDataMenu.getDurationString3AsBigInteger());
    }

   /**
    * Test getDurationString3AsURL() method.
    */
    @Test
    public void subTestGetDurationString3AsURL() {
        assertEquals(null, this.jMetaDataMenu.getDurationString3AsURL());
        System.out.println("Play time in format : HH:MM:SS.MMM AS URL === " + jMetaDataMenu.getDurationString3AsURL());
    }

   /**
    * Test getLanguageMoreAsInteger() method.
    */
    @Test
    public void subTestGetLanguageMoreAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getLanguageMoreAsInteger());
        System.out.println("More info about Language (e.g. Director's Comment) AS Integer === " + jMetaDataMenu.getLanguageMoreAsInteger());
    }

   /**
    * Test getLanguageMoreAsLong() method.
    */
    @Test
    public void subTestGetLanguageMoreAsLong() {
        assertEquals(null, this.jMetaDataMenu.getLanguageMoreAsLong());
        System.out.println("More info about Language (e.g. Director's Comment) AS Long === " + jMetaDataMenu.getLanguageMoreAsLong());
    }

   /**
    * Test getLanguageMoreAsLocalDateTime() method.
    */
    @Test
    public void subTestGetLanguageMoreAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getLanguageMoreAsLocalDateTime());
        System.out.println("More info about Language (e.g. Director's Comment) AS LocalDateTime === " + jMetaDataMenu.getLanguageMoreAsLocalDateTime());
    }

   /**
    * Test getLanguageMoreAsLocalTime() method.
    */
    @Test
    public void subTestGetLanguageMoreAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getLanguageMoreAsLocalTime());
        System.out.println("More info about Language (e.g. Director's Comment) AS LocalTime === " + jMetaDataMenu.getLanguageMoreAsLocalTime());
    }

   /**
    * Test getLanguageMoreAsString() method.
    */
    @Test
    public void subTestGetLanguageMoreAsString() {
        assertEquals(null, this.jMetaDataMenu.getLanguageMoreAsString());
        System.out.println("More info about Language (e.g. Director's Comment) AS String === " + jMetaDataMenu.getLanguageMoreAsString());
    }

   /**
    * Test getLanguageMoreAsBoolean() method.
    */
    @Test
    public void subTestGetLanguageMoreAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getLanguageMoreAsBoolean());
        System.out.println("More info about Language (e.g. Director's Comment) AS Boolean === " + jMetaDataMenu.getLanguageMoreAsBoolean());
    }

   /**
    * Test getLanguageMoreAsBigInteger() method.
    */
    @Test
    public void subTestGetLanguageMoreAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getLanguageMoreAsBigInteger());
        System.out.println("More info about Language (e.g. Director's Comment) AS BigInteger === " + jMetaDataMenu.getLanguageMoreAsBigInteger());
    }

   /**
    * Test getLanguageMoreAsURL() method.
    */
    @Test
    public void subTestGetLanguageMoreAsURL() {
        assertEquals(null, this.jMetaDataMenu.getLanguageMoreAsURL());
        System.out.println("More info about Language (e.g. Director's Comment) AS URL === " + jMetaDataMenu.getLanguageMoreAsURL());
    }

   /**
    * Test getDurationString1AsInteger() method.
    */
    @Test
    public void subTestGetDurationString1AsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDurationString1AsInteger());
        System.out.println("Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS Integer === " + jMetaDataMenu.getDurationString1AsInteger());
    }

   /**
    * Test getDurationString1AsLong() method.
    */
    @Test
    public void subTestGetDurationString1AsLong() {
        assertEquals(null, this.jMetaDataMenu.getDurationString1AsLong());
        System.out.println("Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS Long === " + jMetaDataMenu.getDurationString1AsLong());
    }

   /**
    * Test getDurationString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDurationString1AsLocalDateTime());
        System.out.println("Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS LocalDateTime === " + jMetaDataMenu.getDurationString1AsLocalDateTime());
    }

   /**
    * Test getDurationString1AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationString1AsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDurationString1AsLocalTime());
        System.out.println("Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS LocalTime === " + jMetaDataMenu.getDurationString1AsLocalTime());
    }

   /**
    * Test getDurationString1AsString() method.
    */
    @Test
    public void subTestGetDurationString1AsString() {
        assertEquals(null, this.jMetaDataMenu.getDurationString1AsString());
        System.out.println("Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS String === " + jMetaDataMenu.getDurationString1AsString());
    }

   /**
    * Test getDurationString1AsBoolean() method.
    */
    @Test
    public void subTestGetDurationString1AsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDurationString1AsBoolean());
        System.out.println("Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS Boolean === " + jMetaDataMenu.getDurationString1AsBoolean());
    }

   /**
    * Test getDurationString1AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationString1AsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDurationString1AsBigInteger());
        System.out.println("Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS BigInteger === " + jMetaDataMenu.getDurationString1AsBigInteger());
    }

   /**
    * Test getDurationString1AsURL() method.
    */
    @Test
    public void subTestGetDurationString1AsURL() {
        assertEquals(null, this.jMetaDataMenu.getDurationString1AsURL());
        System.out.println("Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS URL === " + jMetaDataMenu.getDurationString1AsURL());
    }

   /**
    * Test getServiceKindStringAsInteger() method.
    */
    @Test
    public void subTestGetServiceKindStringAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getServiceKindStringAsInteger());
        System.out.println("Service kind (full) AS Integer === " + jMetaDataMenu.getServiceKindStringAsInteger());
    }

   /**
    * Test getServiceKindStringAsLong() method.
    */
    @Test
    public void subTestGetServiceKindStringAsLong() {
        assertEquals(null, this.jMetaDataMenu.getServiceKindStringAsLong());
        System.out.println("Service kind (full) AS Long === " + jMetaDataMenu.getServiceKindStringAsLong());
    }

   /**
    * Test getServiceKindStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetServiceKindStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getServiceKindStringAsLocalDateTime());
        System.out.println("Service kind (full) AS LocalDateTime === " + jMetaDataMenu.getServiceKindStringAsLocalDateTime());
    }

   /**
    * Test getServiceKindStringAsLocalTime() method.
    */
    @Test
    public void subTestGetServiceKindStringAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getServiceKindStringAsLocalTime());
        System.out.println("Service kind (full) AS LocalTime === " + jMetaDataMenu.getServiceKindStringAsLocalTime());
    }

   /**
    * Test getServiceKindStringAsString() method.
    */
    @Test
    public void subTestGetServiceKindStringAsString() {
        assertEquals(null, this.jMetaDataMenu.getServiceKindStringAsString());
        System.out.println("Service kind (full) AS String === " + jMetaDataMenu.getServiceKindStringAsString());
    }

   /**
    * Test getServiceKindStringAsBoolean() method.
    */
    @Test
    public void subTestGetServiceKindStringAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getServiceKindStringAsBoolean());
        System.out.println("Service kind (full) AS Boolean === " + jMetaDataMenu.getServiceKindStringAsBoolean());
    }

   /**
    * Test getServiceKindStringAsBigInteger() method.
    */
    @Test
    public void subTestGetServiceKindStringAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getServiceKindStringAsBigInteger());
        System.out.println("Service kind (full) AS BigInteger === " + jMetaDataMenu.getServiceKindStringAsBigInteger());
    }

   /**
    * Test getServiceKindStringAsURL() method.
    */
    @Test
    public void subTestGetServiceKindStringAsURL() {
        assertEquals(null, this.jMetaDataMenu.getServiceKindStringAsURL());
        System.out.println("Service kind (full) AS URL === " + jMetaDataMenu.getServiceKindStringAsURL());
    }

   /**
    * Test getDurationAsInteger() method.
    */
    @Test
    public void subTestGetDurationAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDurationAsInteger());
        System.out.println("Play time of the stream in ms AS Integer === " + jMetaDataMenu.getDurationAsInteger());
    }

   /**
    * Test getDurationAsLong() method.
    */
    @Test
    public void subTestGetDurationAsLong() {
        assertEquals(null, this.jMetaDataMenu.getDurationAsLong());
        System.out.println("Play time of the stream in ms AS Long === " + jMetaDataMenu.getDurationAsLong());
    }

   /**
    * Test getDurationAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDurationAsLocalDateTime());
        System.out.println("Play time of the stream in ms AS LocalDateTime === " + jMetaDataMenu.getDurationAsLocalDateTime());
    }

   /**
    * Test getDurationAsLocalTime() method.
    */
    @Test
    public void subTestGetDurationAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDurationAsLocalTime());
        System.out.println("Play time of the stream in ms AS LocalTime === " + jMetaDataMenu.getDurationAsLocalTime());
    }

   /**
    * Test getDurationAsString() method.
    */
    @Test
    public void subTestGetDurationAsString() {
        assertEquals(null, this.jMetaDataMenu.getDurationAsString());
        System.out.println("Play time of the stream in ms AS String === " + jMetaDataMenu.getDurationAsString());
    }

   /**
    * Test getDurationAsBoolean() method.
    */
    @Test
    public void subTestGetDurationAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDurationAsBoolean());
        System.out.println("Play time of the stream in ms AS Boolean === " + jMetaDataMenu.getDurationAsBoolean());
    }

   /**
    * Test getDurationAsBigInteger() method.
    */
    @Test
    public void subTestGetDurationAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDurationAsBigInteger());
        System.out.println("Play time of the stream in ms AS BigInteger === " + jMetaDataMenu.getDurationAsBigInteger());
    }

   /**
    * Test getDurationAsURL() method.
    */
    @Test
    public void subTestGetDurationAsURL() {
        assertEquals(null, this.jMetaDataMenu.getDurationAsURL());
        System.out.println("Play time of the stream in ms AS URL === " + jMetaDataMenu.getDurationAsURL());
    }

   /**
    * Test getDurationString4AsInteger() method.
    */
    @Test
    public void subTestGetDurationString4AsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDurationString4AsInteger());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Integer === " + jMetaDataMenu.getDurationString4AsInteger());
    }

   /**
    * Test getDurationString4AsLong() method.
    */
    @Test
    public void subTestGetDurationString4AsLong() {
        assertEquals(null, this.jMetaDataMenu.getDurationString4AsLong());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Long === " + jMetaDataMenu.getDurationString4AsLong());
    }

   /**
    * Test getDurationString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDurationString4AsLocalDateTime());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS LocalDateTime === " + jMetaDataMenu.getDurationString4AsLocalDateTime());
    }

   /**
    * Test getDurationString4AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationString4AsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDurationString4AsLocalTime());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS LocalTime === " + jMetaDataMenu.getDurationString4AsLocalTime());
    }

   /**
    * Test getDurationString4AsString() method.
    */
    @Test
    public void subTestGetDurationString4AsString() {
        assertEquals(null, this.jMetaDataMenu.getDurationString4AsString());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS String === " + jMetaDataMenu.getDurationString4AsString());
    }

   /**
    * Test getDurationString4AsBoolean() method.
    */
    @Test
    public void subTestGetDurationString4AsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDurationString4AsBoolean());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Boolean === " + jMetaDataMenu.getDurationString4AsBoolean());
    }

   /**
    * Test getDurationString4AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationString4AsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDurationString4AsBigInteger());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS BigInteger === " + jMetaDataMenu.getDurationString4AsBigInteger());
    }

   /**
    * Test getDurationString4AsURL() method.
    */
    @Test
    public void subTestGetDurationString4AsURL() {
        assertEquals(null, this.jMetaDataMenu.getDurationString4AsURL());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS URL === " + jMetaDataMenu.getDurationString4AsURL());
    }

   /**
    * Test getDurationString5AsInteger() method.
    */
    @Test
    public void subTestGetDurationString5AsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDurationString5AsInteger());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Integer === " + jMetaDataMenu.getDurationString5AsInteger());
    }

   /**
    * Test getDurationString5AsLong() method.
    */
    @Test
    public void subTestGetDurationString5AsLong() {
        assertEquals(null, this.jMetaDataMenu.getDurationString5AsLong());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Long === " + jMetaDataMenu.getDurationString5AsLong());
    }

   /**
    * Test getDurationString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDurationString5AsLocalDateTime());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS LocalDateTime === " + jMetaDataMenu.getDurationString5AsLocalDateTime());
    }

   /**
    * Test getDurationString5AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationString5AsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDurationString5AsLocalTime());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS LocalTime === " + jMetaDataMenu.getDurationString5AsLocalTime());
    }

   /**
    * Test getDurationString5AsString() method.
    */
    @Test
    public void subTestGetDurationString5AsString() {
        assertEquals(null, this.jMetaDataMenu.getDurationString5AsString());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS String === " + jMetaDataMenu.getDurationString5AsString());
    }

   /**
    * Test getDurationString5AsBoolean() method.
    */
    @Test
    public void subTestGetDurationString5AsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDurationString5AsBoolean());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Boolean === " + jMetaDataMenu.getDurationString5AsBoolean());
    }

   /**
    * Test getDurationString5AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationString5AsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDurationString5AsBigInteger());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS BigInteger === " + jMetaDataMenu.getDurationString5AsBigInteger());
    }

   /**
    * Test getDurationString5AsURL() method.
    */
    @Test
    public void subTestGetDurationString5AsURL() {
        assertEquals(null, this.jMetaDataMenu.getDurationString5AsURL());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS URL === " + jMetaDataMenu.getDurationString5AsURL());
    }

   /**
    * Test getDurationStartAsInteger() method.
    */
    @Test
    public void subTestGetDurationStartAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDurationStartAsInteger());
        System.out.println("Duration_Start AS Integer === " + jMetaDataMenu.getDurationStartAsInteger());
    }

   /**
    * Test getDurationStartAsLong() method.
    */
    @Test
    public void subTestGetDurationStartAsLong() {
        assertEquals(null, this.jMetaDataMenu.getDurationStartAsLong());
        System.out.println("Duration_Start AS Long === " + jMetaDataMenu.getDurationStartAsLong());
    }

   /**
    * Test getDurationStartAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationStartAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDurationStartAsLocalDateTime());
        System.out.println("Duration_Start AS LocalDateTime === " + jMetaDataMenu.getDurationStartAsLocalDateTime());
    }

   /**
    * Test getDurationStartAsLocalTime() method.
    */
    @Test
    public void subTestGetDurationStartAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDurationStartAsLocalTime());
        System.out.println("Duration_Start AS LocalTime === " + jMetaDataMenu.getDurationStartAsLocalTime());
    }

   /**
    * Test getDurationStartAsString() method.
    */
    @Test
    public void subTestGetDurationStartAsString() {
        assertEquals(null, this.jMetaDataMenu.getDurationStartAsString());
        System.out.println("Duration_Start AS String === " + jMetaDataMenu.getDurationStartAsString());
    }

   /**
    * Test getDurationStartAsBoolean() method.
    */
    @Test
    public void subTestGetDurationStartAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDurationStartAsBoolean());
        System.out.println("Duration_Start AS Boolean === " + jMetaDataMenu.getDurationStartAsBoolean());
    }

   /**
    * Test getDurationStartAsBigInteger() method.
    */
    @Test
    public void subTestGetDurationStartAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDurationStartAsBigInteger());
        System.out.println("Duration_Start AS BigInteger === " + jMetaDataMenu.getDurationStartAsBigInteger());
    }

   /**
    * Test getDurationStartAsURL() method.
    */
    @Test
    public void subTestGetDurationStartAsURL() {
        assertEquals(null, this.jMetaDataMenu.getDurationStartAsURL());
        System.out.println("Duration_Start AS URL === " + jMetaDataMenu.getDurationStartAsURL());
    }

   /**
    * Test getCodecIDHintAsInteger() method.
    */
    @Test
    public void subTestGetCodecIDHintAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDHintAsInteger());
        System.out.println("A hint/popular name for this codec AS Integer === " + jMetaDataMenu.getCodecIDHintAsInteger());
    }

   /**
    * Test getCodecIDHintAsLong() method.
    */
    @Test
    public void subTestGetCodecIDHintAsLong() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDHintAsLong());
        System.out.println("A hint/popular name for this codec AS Long === " + jMetaDataMenu.getCodecIDHintAsLong());
    }

   /**
    * Test getCodecIDHintAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCodecIDHintAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDHintAsLocalDateTime());
        System.out.println("A hint/popular name for this codec AS LocalDateTime === " + jMetaDataMenu.getCodecIDHintAsLocalDateTime());
    }

   /**
    * Test getCodecIDHintAsLocalTime() method.
    */
    @Test
    public void subTestGetCodecIDHintAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDHintAsLocalTime());
        System.out.println("A hint/popular name for this codec AS LocalTime === " + jMetaDataMenu.getCodecIDHintAsLocalTime());
    }

   /**
    * Test getCodecIDHintAsString() method.
    */
    @Test
    public void subTestGetCodecIDHintAsString() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDHintAsString());
        System.out.println("A hint/popular name for this codec AS String === " + jMetaDataMenu.getCodecIDHintAsString());
    }

   /**
    * Test getCodecIDHintAsBoolean() method.
    */
    @Test
    public void subTestGetCodecIDHintAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDHintAsBoolean());
        System.out.println("A hint/popular name for this codec AS Boolean === " + jMetaDataMenu.getCodecIDHintAsBoolean());
    }

   /**
    * Test getCodecIDHintAsBigInteger() method.
    */
    @Test
    public void subTestGetCodecIDHintAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDHintAsBigInteger());
        System.out.println("A hint/popular name for this codec AS BigInteger === " + jMetaDataMenu.getCodecIDHintAsBigInteger());
    }

   /**
    * Test getCodecIDHintAsURL() method.
    */
    @Test
    public void subTestGetCodecIDHintAsURL() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDHintAsURL());
        System.out.println("A hint/popular name for this codec AS URL === " + jMetaDataMenu.getCodecIDHintAsURL());
    }

   /**
    * Test getDelaySourceAsInteger() method.
    */
    @Test
    public void subTestGetDelaySourceAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDelaySourceAsInteger());
        System.out.println("Delay source (Container or Stream or empty) AS Integer === " + jMetaDataMenu.getDelaySourceAsInteger());
    }

   /**
    * Test getDelaySourceAsLong() method.
    */
    @Test
    public void subTestGetDelaySourceAsLong() {
        assertEquals(null, this.jMetaDataMenu.getDelaySourceAsLong());
        System.out.println("Delay source (Container or Stream or empty) AS Long === " + jMetaDataMenu.getDelaySourceAsLong());
    }

   /**
    * Test getDelaySourceAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelaySourceAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDelaySourceAsLocalDateTime());
        System.out.println("Delay source (Container or Stream or empty) AS LocalDateTime === " + jMetaDataMenu.getDelaySourceAsLocalDateTime());
    }

   /**
    * Test getDelaySourceAsLocalTime() method.
    */
    @Test
    public void subTestGetDelaySourceAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDelaySourceAsLocalTime());
        System.out.println("Delay source (Container or Stream or empty) AS LocalTime === " + jMetaDataMenu.getDelaySourceAsLocalTime());
    }

   /**
    * Test getDelaySourceAsString() method.
    */
    @Test
    public void subTestGetDelaySourceAsString() {
        assertEquals(null, this.jMetaDataMenu.getDelaySourceAsString());
        System.out.println("Delay source (Container or Stream or empty) AS String === " + jMetaDataMenu.getDelaySourceAsString());
    }

   /**
    * Test getDelaySourceAsBoolean() method.
    */
    @Test
    public void subTestGetDelaySourceAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDelaySourceAsBoolean());
        System.out.println("Delay source (Container or Stream or empty) AS Boolean === " + jMetaDataMenu.getDelaySourceAsBoolean());
    }

   /**
    * Test getDelaySourceAsBigInteger() method.
    */
    @Test
    public void subTestGetDelaySourceAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDelaySourceAsBigInteger());
        System.out.println("Delay source (Container or Stream or empty) AS BigInteger === " + jMetaDataMenu.getDelaySourceAsBigInteger());
    }

   /**
    * Test getDelaySourceAsURL() method.
    */
    @Test
    public void subTestGetDelaySourceAsURL() {
        assertEquals(null, this.jMetaDataMenu.getDelaySourceAsURL());
        System.out.println("Delay source (Container or Stream or empty) AS URL === " + jMetaDataMenu.getDelaySourceAsURL());
    }

   /**
    * Test getDelaySettingsAsInteger() method.
    */
    @Test
    public void subTestGetDelaySettingsAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDelaySettingsAsInteger());
        System.out.println("Delay settings (in case of timecode for example) AS Integer === " + jMetaDataMenu.getDelaySettingsAsInteger());
    }

   /**
    * Test getDelaySettingsAsLong() method.
    */
    @Test
    public void subTestGetDelaySettingsAsLong() {
        assertEquals(null, this.jMetaDataMenu.getDelaySettingsAsLong());
        System.out.println("Delay settings (in case of timecode for example) AS Long === " + jMetaDataMenu.getDelaySettingsAsLong());
    }

   /**
    * Test getDelaySettingsAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelaySettingsAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDelaySettingsAsLocalDateTime());
        System.out.println("Delay settings (in case of timecode for example) AS LocalDateTime === " + jMetaDataMenu.getDelaySettingsAsLocalDateTime());
    }

   /**
    * Test getDelaySettingsAsLocalTime() method.
    */
    @Test
    public void subTestGetDelaySettingsAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDelaySettingsAsLocalTime());
        System.out.println("Delay settings (in case of timecode for example) AS LocalTime === " + jMetaDataMenu.getDelaySettingsAsLocalTime());
    }

   /**
    * Test getDelaySettingsAsString() method.
    */
    @Test
    public void subTestGetDelaySettingsAsString() {
        assertEquals(null, this.jMetaDataMenu.getDelaySettingsAsString());
        System.out.println("Delay settings (in case of timecode for example) AS String === " + jMetaDataMenu.getDelaySettingsAsString());
    }

   /**
    * Test getDelaySettingsAsBoolean() method.
    */
    @Test
    public void subTestGetDelaySettingsAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDelaySettingsAsBoolean());
        System.out.println("Delay settings (in case of timecode for example) AS Boolean === " + jMetaDataMenu.getDelaySettingsAsBoolean());
    }

   /**
    * Test getDelaySettingsAsBigInteger() method.
    */
    @Test
    public void subTestGetDelaySettingsAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDelaySettingsAsBigInteger());
        System.out.println("Delay settings (in case of timecode for example) AS BigInteger === " + jMetaDataMenu.getDelaySettingsAsBigInteger());
    }

   /**
    * Test getDelaySettingsAsURL() method.
    */
    @Test
    public void subTestGetDelaySettingsAsURL() {
        assertEquals(null, this.jMetaDataMenu.getDelaySettingsAsURL());
        System.out.println("Delay settings (in case of timecode for example) AS URL === " + jMetaDataMenu.getDelaySettingsAsURL());
    }

   /**
    * Test getServiceUrlAsInteger() method.
    */
    @Test
    public void subTestGetServiceUrlAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getServiceUrlAsInteger());
        System.out.println("Service/Url AS Integer === " + jMetaDataMenu.getServiceUrlAsInteger());
    }

   /**
    * Test getServiceUrlAsLong() method.
    */
    @Test
    public void subTestGetServiceUrlAsLong() {
        assertEquals(null, this.jMetaDataMenu.getServiceUrlAsLong());
        System.out.println("Service/Url AS Long === " + jMetaDataMenu.getServiceUrlAsLong());
    }

   /**
    * Test getServiceUrlAsLocalDateTime() method.
    */
    @Test
    public void subTestGetServiceUrlAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getServiceUrlAsLocalDateTime());
        System.out.println("Service/Url AS LocalDateTime === " + jMetaDataMenu.getServiceUrlAsLocalDateTime());
    }

   /**
    * Test getServiceUrlAsLocalTime() method.
    */
    @Test
    public void subTestGetServiceUrlAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getServiceUrlAsLocalTime());
        System.out.println("Service/Url AS LocalTime === " + jMetaDataMenu.getServiceUrlAsLocalTime());
    }

   /**
    * Test getServiceUrlAsString() method.
    */
    @Test
    public void subTestGetServiceUrlAsString() {
        assertEquals(null, this.jMetaDataMenu.getServiceUrlAsString());
        System.out.println("Service/Url AS String === " + jMetaDataMenu.getServiceUrlAsString());
    }

   /**
    * Test getServiceUrlAsBoolean() method.
    */
    @Test
    public void subTestGetServiceUrlAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getServiceUrlAsBoolean());
        System.out.println("Service/Url AS Boolean === " + jMetaDataMenu.getServiceUrlAsBoolean());
    }

   /**
    * Test getServiceUrlAsBigInteger() method.
    */
    @Test
    public void subTestGetServiceUrlAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getServiceUrlAsBigInteger());
        System.out.println("Service/Url AS BigInteger === " + jMetaDataMenu.getServiceUrlAsBigInteger());
    }

   /**
    * Test getServiceUrlAsURL() method.
    */
    @Test
    public void subTestGetServiceUrlAsURL() {
        assertEquals(null, this.jMetaDataMenu.getServiceUrlAsURL());
        System.out.println("Service/Url AS URL === " + jMetaDataMenu.getServiceUrlAsURL());
    }

   /**
    * Test getListStreamPosAsInteger() method.
    */
    @Test
    public void subTestGetListStreamPosAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getListStreamPosAsInteger());
        System.out.println("List of programs available AS Integer === " + jMetaDataMenu.getListStreamPosAsInteger());
    }

   /**
    * Test getListStreamPosAsLong() method.
    */
    @Test
    public void subTestGetListStreamPosAsLong() {
        assertEquals(null, this.jMetaDataMenu.getListStreamPosAsLong());
        System.out.println("List of programs available AS Long === " + jMetaDataMenu.getListStreamPosAsLong());
    }

   /**
    * Test getListStreamPosAsLocalDateTime() method.
    */
    @Test
    public void subTestGetListStreamPosAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getListStreamPosAsLocalDateTime());
        System.out.println("List of programs available AS LocalDateTime === " + jMetaDataMenu.getListStreamPosAsLocalDateTime());
    }

   /**
    * Test getListStreamPosAsLocalTime() method.
    */
    @Test
    public void subTestGetListStreamPosAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getListStreamPosAsLocalTime());
        System.out.println("List of programs available AS LocalTime === " + jMetaDataMenu.getListStreamPosAsLocalTime());
    }

   /**
    * Test getListStreamPosAsString() method.
    */
    @Test
    public void subTestGetListStreamPosAsString() {
        assertEquals(null, this.jMetaDataMenu.getListStreamPosAsString());
        System.out.println("List of programs available AS String === " + jMetaDataMenu.getListStreamPosAsString());
    }

   /**
    * Test getListStreamPosAsBoolean() method.
    */
    @Test
    public void subTestGetListStreamPosAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getListStreamPosAsBoolean());
        System.out.println("List of programs available AS Boolean === " + jMetaDataMenu.getListStreamPosAsBoolean());
    }

   /**
    * Test getListStreamPosAsBigInteger() method.
    */
    @Test
    public void subTestGetListStreamPosAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getListStreamPosAsBigInteger());
        System.out.println("List of programs available AS BigInteger === " + jMetaDataMenu.getListStreamPosAsBigInteger());
    }

   /**
    * Test getListStreamPosAsURL() method.
    */
    @Test
    public void subTestGetListStreamPosAsURL() {
        assertEquals(null, this.jMetaDataMenu.getListStreamPosAsURL());
        System.out.println("List of programs available AS URL === " + jMetaDataMenu.getListStreamPosAsURL());
    }

   /**
    * Test getServiceNameAsInteger() method.
    */
    @Test
    public void subTestGetServiceNameAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getServiceNameAsInteger());
        System.out.println("ServiceName AS Integer === " + jMetaDataMenu.getServiceNameAsInteger());
    }

   /**
    * Test getServiceNameAsLong() method.
    */
    @Test
    public void subTestGetServiceNameAsLong() {
        assertEquals(null, this.jMetaDataMenu.getServiceNameAsLong());
        System.out.println("ServiceName AS Long === " + jMetaDataMenu.getServiceNameAsLong());
    }

   /**
    * Test getServiceNameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetServiceNameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getServiceNameAsLocalDateTime());
        System.out.println("ServiceName AS LocalDateTime === " + jMetaDataMenu.getServiceNameAsLocalDateTime());
    }

   /**
    * Test getServiceNameAsLocalTime() method.
    */
    @Test
    public void subTestGetServiceNameAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getServiceNameAsLocalTime());
        System.out.println("ServiceName AS LocalTime === " + jMetaDataMenu.getServiceNameAsLocalTime());
    }

   /**
    * Test getServiceNameAsString() method.
    */
    @Test
    public void subTestGetServiceNameAsString() {
        assertEquals(null, this.jMetaDataMenu.getServiceNameAsString());
        System.out.println("ServiceName AS String === " + jMetaDataMenu.getServiceNameAsString());
    }

   /**
    * Test getServiceNameAsBoolean() method.
    */
    @Test
    public void subTestGetServiceNameAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getServiceNameAsBoolean());
        System.out.println("ServiceName AS Boolean === " + jMetaDataMenu.getServiceNameAsBoolean());
    }

   /**
    * Test getServiceNameAsBigInteger() method.
    */
    @Test
    public void subTestGetServiceNameAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getServiceNameAsBigInteger());
        System.out.println("ServiceName AS BigInteger === " + jMetaDataMenu.getServiceNameAsBigInteger());
    }

   /**
    * Test getServiceNameAsURL() method.
    */
    @Test
    public void subTestGetServiceNameAsURL() {
        assertEquals(null, this.jMetaDataMenu.getServiceNameAsURL());
        System.out.println("ServiceName AS URL === " + jMetaDataMenu.getServiceNameAsURL());
    }

   /**
    * Test getServiceProviderAsInteger() method.
    */
    @Test
    public void subTestGetServiceProviderAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getServiceProviderAsInteger());
        System.out.println("ServiceProvider AS Integer === " + jMetaDataMenu.getServiceProviderAsInteger());
    }

   /**
    * Test getServiceProviderAsLong() method.
    */
    @Test
    public void subTestGetServiceProviderAsLong() {
        assertEquals(null, this.jMetaDataMenu.getServiceProviderAsLong());
        System.out.println("ServiceProvider AS Long === " + jMetaDataMenu.getServiceProviderAsLong());
    }

   /**
    * Test getServiceProviderAsLocalDateTime() method.
    */
    @Test
    public void subTestGetServiceProviderAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getServiceProviderAsLocalDateTime());
        System.out.println("ServiceProvider AS LocalDateTime === " + jMetaDataMenu.getServiceProviderAsLocalDateTime());
    }

   /**
    * Test getServiceProviderAsLocalTime() method.
    */
    @Test
    public void subTestGetServiceProviderAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getServiceProviderAsLocalTime());
        System.out.println("ServiceProvider AS LocalTime === " + jMetaDataMenu.getServiceProviderAsLocalTime());
    }

   /**
    * Test getServiceProviderAsString() method.
    */
    @Test
    public void subTestGetServiceProviderAsString() {
        assertEquals(null, this.jMetaDataMenu.getServiceProviderAsString());
        System.out.println("ServiceProvider AS String === " + jMetaDataMenu.getServiceProviderAsString());
    }

   /**
    * Test getServiceProviderAsBoolean() method.
    */
    @Test
    public void subTestGetServiceProviderAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getServiceProviderAsBoolean());
        System.out.println("ServiceProvider AS Boolean === " + jMetaDataMenu.getServiceProviderAsBoolean());
    }

   /**
    * Test getServiceProviderAsBigInteger() method.
    */
    @Test
    public void subTestGetServiceProviderAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getServiceProviderAsBigInteger());
        System.out.println("ServiceProvider AS BigInteger === " + jMetaDataMenu.getServiceProviderAsBigInteger());
    }

   /**
    * Test getServiceProviderAsURL() method.
    */
    @Test
    public void subTestGetServiceProviderAsURL() {
        assertEquals(null, this.jMetaDataMenu.getServiceProviderAsURL());
        System.out.println("ServiceProvider AS URL === " + jMetaDataMenu.getServiceProviderAsURL());
    }

   /**
    * Test getChaptersPosBeginAsInteger() method.
    */
    @Test
    public void subTestGetChaptersPosBeginAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getChaptersPosBeginAsInteger());
        System.out.println("Used by third-party developers to know about the beginning of the chapters list, to be used by Get(Stream_Menu, x, Pos), where Pos is an Integer between Chapters_Pos_Begin and Chapters_Pos_End AS Integer === " + jMetaDataMenu.getChaptersPosBeginAsInteger());
    }

   /**
    * Test getChaptersPosBeginAsLong() method.
    */
    @Test
    public void subTestGetChaptersPosBeginAsLong() {
        assertEquals(null, this.jMetaDataMenu.getChaptersPosBeginAsLong());
        System.out.println("Used by third-party developers to know about the beginning of the chapters list, to be used by Get(Stream_Menu, x, Pos), where Pos is an Integer between Chapters_Pos_Begin and Chapters_Pos_End AS Long === " + jMetaDataMenu.getChaptersPosBeginAsLong());
    }

   /**
    * Test getChaptersPosBeginAsLocalDateTime() method.
    */
    @Test
    public void subTestGetChaptersPosBeginAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getChaptersPosBeginAsLocalDateTime());
        System.out.println("Used by third-party developers to know about the beginning of the chapters list, to be used by Get(Stream_Menu, x, Pos), where Pos is an Integer between Chapters_Pos_Begin and Chapters_Pos_End AS LocalDateTime === " + jMetaDataMenu.getChaptersPosBeginAsLocalDateTime());
    }

   /**
    * Test getChaptersPosBeginAsLocalTime() method.
    */
    @Test
    public void subTestGetChaptersPosBeginAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getChaptersPosBeginAsLocalTime());
        System.out.println("Used by third-party developers to know about the beginning of the chapters list, to be used by Get(Stream_Menu, x, Pos), where Pos is an Integer between Chapters_Pos_Begin and Chapters_Pos_End AS LocalTime === " + jMetaDataMenu.getChaptersPosBeginAsLocalTime());
    }

   /**
    * Test getChaptersPosBeginAsString() method.
    */
    @Test
    public void subTestGetChaptersPosBeginAsString() {
        assertEquals(null, this.jMetaDataMenu.getChaptersPosBeginAsString());
        System.out.println("Used by third-party developers to know about the beginning of the chapters list, to be used by Get(Stream_Menu, x, Pos), where Pos is an Integer between Chapters_Pos_Begin and Chapters_Pos_End AS String === " + jMetaDataMenu.getChaptersPosBeginAsString());
    }

   /**
    * Test getChaptersPosBeginAsBoolean() method.
    */
    @Test
    public void subTestGetChaptersPosBeginAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getChaptersPosBeginAsBoolean());
        System.out.println("Used by third-party developers to know about the beginning of the chapters list, to be used by Get(Stream_Menu, x, Pos), where Pos is an Integer between Chapters_Pos_Begin and Chapters_Pos_End AS Boolean === " + jMetaDataMenu.getChaptersPosBeginAsBoolean());
    }

   /**
    * Test getChaptersPosBeginAsBigInteger() method.
    */
    @Test
    public void subTestGetChaptersPosBeginAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getChaptersPosBeginAsBigInteger());
        System.out.println("Used by third-party developers to know about the beginning of the chapters list, to be used by Get(Stream_Menu, x, Pos), where Pos is an Integer between Chapters_Pos_Begin and Chapters_Pos_End AS BigInteger === " + jMetaDataMenu.getChaptersPosBeginAsBigInteger());
    }

   /**
    * Test getChaptersPosBeginAsURL() method.
    */
    @Test
    public void subTestGetChaptersPosBeginAsURL() {
        assertEquals(null, this.jMetaDataMenu.getChaptersPosBeginAsURL());
        System.out.println("Used by third-party developers to know about the beginning of the chapters list, to be used by Get(Stream_Menu, x, Pos), where Pos is an Integer between Chapters_Pos_Begin and Chapters_Pos_End AS URL === " + jMetaDataMenu.getChaptersPosBeginAsURL());
    }

   /**
    * Test getServiceProviderrUrlAsInteger() method.
    */
    @Test
    public void subTestGetServiceProviderrUrlAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getServiceProviderrUrlAsInteger());
        System.out.println("ServiceProviderr/Url AS Integer === " + jMetaDataMenu.getServiceProviderrUrlAsInteger());
    }

   /**
    * Test getServiceProviderrUrlAsLong() method.
    */
    @Test
    public void subTestGetServiceProviderrUrlAsLong() {
        assertEquals(null, this.jMetaDataMenu.getServiceProviderrUrlAsLong());
        System.out.println("ServiceProviderr/Url AS Long === " + jMetaDataMenu.getServiceProviderrUrlAsLong());
    }

   /**
    * Test getServiceProviderrUrlAsLocalDateTime() method.
    */
    @Test
    public void subTestGetServiceProviderrUrlAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getServiceProviderrUrlAsLocalDateTime());
        System.out.println("ServiceProviderr/Url AS LocalDateTime === " + jMetaDataMenu.getServiceProviderrUrlAsLocalDateTime());
    }

   /**
    * Test getServiceProviderrUrlAsLocalTime() method.
    */
    @Test
    public void subTestGetServiceProviderrUrlAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getServiceProviderrUrlAsLocalTime());
        System.out.println("ServiceProviderr/Url AS LocalTime === " + jMetaDataMenu.getServiceProviderrUrlAsLocalTime());
    }

   /**
    * Test getServiceProviderrUrlAsString() method.
    */
    @Test
    public void subTestGetServiceProviderrUrlAsString() {
        assertEquals(null, this.jMetaDataMenu.getServiceProviderrUrlAsString());
        System.out.println("ServiceProviderr/Url AS String === " + jMetaDataMenu.getServiceProviderrUrlAsString());
    }

   /**
    * Test getServiceProviderrUrlAsBoolean() method.
    */
    @Test
    public void subTestGetServiceProviderrUrlAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getServiceProviderrUrlAsBoolean());
        System.out.println("ServiceProviderr/Url AS Boolean === " + jMetaDataMenu.getServiceProviderrUrlAsBoolean());
    }

   /**
    * Test getServiceProviderrUrlAsBigInteger() method.
    */
    @Test
    public void subTestGetServiceProviderrUrlAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getServiceProviderrUrlAsBigInteger());
        System.out.println("ServiceProviderr/Url AS BigInteger === " + jMetaDataMenu.getServiceProviderrUrlAsBigInteger());
    }

   /**
    * Test getServiceProviderrUrlAsURL() method.
    */
    @Test
    public void subTestGetServiceProviderrUrlAsURL() {
        assertEquals(null, this.jMetaDataMenu.getServiceProviderrUrlAsURL());
        System.out.println("ServiceProviderr/Url AS URL === " + jMetaDataMenu.getServiceProviderrUrlAsURL());
    }

   /**
    * Test getFormatSettingsAsInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getFormatSettingsAsInteger());
        System.out.println("Settings needed for decoder used AS Integer === " + jMetaDataMenu.getFormatSettingsAsInteger());
    }

   /**
    * Test getFormatSettingsAsLong() method.
    */
    @Test
    public void subTestGetFormatSettingsAsLong() {
        assertEquals(null, this.jMetaDataMenu.getFormatSettingsAsLong());
        System.out.println("Settings needed for decoder used AS Long === " + jMetaDataMenu.getFormatSettingsAsLong());
    }

   /**
    * Test getFormatSettingsAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatSettingsAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getFormatSettingsAsLocalDateTime());
        System.out.println("Settings needed for decoder used AS LocalDateTime === " + jMetaDataMenu.getFormatSettingsAsLocalDateTime());
    }

   /**
    * Test getFormatSettingsAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatSettingsAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getFormatSettingsAsLocalTime());
        System.out.println("Settings needed for decoder used AS LocalTime === " + jMetaDataMenu.getFormatSettingsAsLocalTime());
    }

   /**
    * Test getFormatSettingsAsString() method.
    */
    @Test
    public void subTestGetFormatSettingsAsString() {
        assertEquals(null, this.jMetaDataMenu.getFormatSettingsAsString());
        System.out.println("Settings needed for decoder used AS String === " + jMetaDataMenu.getFormatSettingsAsString());
    }

   /**
    * Test getFormatSettingsAsBoolean() method.
    */
    @Test
    public void subTestGetFormatSettingsAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getFormatSettingsAsBoolean());
        System.out.println("Settings needed for decoder used AS Boolean === " + jMetaDataMenu.getFormatSettingsAsBoolean());
    }

   /**
    * Test getFormatSettingsAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getFormatSettingsAsBigInteger());
        System.out.println("Settings needed for decoder used AS BigInteger === " + jMetaDataMenu.getFormatSettingsAsBigInteger());
    }

   /**
    * Test getFormatSettingsAsURL() method.
    */
    @Test
    public void subTestGetFormatSettingsAsURL() {
        assertEquals(null, this.jMetaDataMenu.getFormatSettingsAsURL());
        System.out.println("Settings needed for decoder used AS URL === " + jMetaDataMenu.getFormatSettingsAsURL());
    }

   /**
    * Test getServiceKindAsInteger() method.
    */
    @Test
    public void subTestGetServiceKindAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getServiceKindAsInteger());
        System.out.println("Service kind, e.g. visually impaired, commentary, voice over AS Integer === " + jMetaDataMenu.getServiceKindAsInteger());
    }

   /**
    * Test getServiceKindAsLong() method.
    */
    @Test
    public void subTestGetServiceKindAsLong() {
        assertEquals(null, this.jMetaDataMenu.getServiceKindAsLong());
        System.out.println("Service kind, e.g. visually impaired, commentary, voice over AS Long === " + jMetaDataMenu.getServiceKindAsLong());
    }

   /**
    * Test getServiceKindAsLocalDateTime() method.
    */
    @Test
    public void subTestGetServiceKindAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getServiceKindAsLocalDateTime());
        System.out.println("Service kind, e.g. visually impaired, commentary, voice over AS LocalDateTime === " + jMetaDataMenu.getServiceKindAsLocalDateTime());
    }

   /**
    * Test getServiceKindAsLocalTime() method.
    */
    @Test
    public void subTestGetServiceKindAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getServiceKindAsLocalTime());
        System.out.println("Service kind, e.g. visually impaired, commentary, voice over AS LocalTime === " + jMetaDataMenu.getServiceKindAsLocalTime());
    }

   /**
    * Test getServiceKindAsString() method.
    */
    @Test
    public void subTestGetServiceKindAsString() {
        assertEquals(null, this.jMetaDataMenu.getServiceKindAsString());
        System.out.println("Service kind, e.g. visually impaired, commentary, voice over AS String === " + jMetaDataMenu.getServiceKindAsString());
    }

   /**
    * Test getServiceKindAsBoolean() method.
    */
    @Test
    public void subTestGetServiceKindAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getServiceKindAsBoolean());
        System.out.println("Service kind, e.g. visually impaired, commentary, voice over AS Boolean === " + jMetaDataMenu.getServiceKindAsBoolean());
    }

   /**
    * Test getServiceKindAsBigInteger() method.
    */
    @Test
    public void subTestGetServiceKindAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getServiceKindAsBigInteger());
        System.out.println("Service kind, e.g. visually impaired, commentary, voice over AS BigInteger === " + jMetaDataMenu.getServiceKindAsBigInteger());
    }

   /**
    * Test getServiceKindAsURL() method.
    */
    @Test
    public void subTestGetServiceKindAsURL() {
        assertEquals(null, this.jMetaDataMenu.getServiceKindAsURL());
        System.out.println("Service kind, e.g. visually impaired, commentary, voice over AS URL === " + jMetaDataMenu.getServiceKindAsURL());
    }

   /**
    * Test getForcedAsInteger() method.
    */
    @Test
    public void subTestGetForcedAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getForcedAsInteger());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS Integer === " + jMetaDataMenu.getForcedAsInteger());
    }

   /**
    * Test getForcedAsLong() method.
    */
    @Test
    public void subTestGetForcedAsLong() {
        assertEquals(null, this.jMetaDataMenu.getForcedAsLong());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS Long === " + jMetaDataMenu.getForcedAsLong());
    }

   /**
    * Test getForcedAsLocalDateTime() method.
    */
    @Test
    public void subTestGetForcedAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getForcedAsLocalDateTime());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS LocalDateTime === " + jMetaDataMenu.getForcedAsLocalDateTime());
    }

   /**
    * Test getForcedAsLocalTime() method.
    */
    @Test
    public void subTestGetForcedAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getForcedAsLocalTime());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS LocalTime === " + jMetaDataMenu.getForcedAsLocalTime());
    }

   /**
    * Test getForcedAsString() method.
    */
    @Test
    public void subTestGetForcedAsString() {
        assertEquals(null, this.jMetaDataMenu.getForcedAsString());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS String === " + jMetaDataMenu.getForcedAsString());
    }

   /**
    * Test getForcedAsBoolean() method.
    */
    @Test
    public void subTestGetForcedAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getForcedAsBoolean());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS Boolean === " + jMetaDataMenu.getForcedAsBoolean());
    }

   /**
    * Test getForcedAsBigInteger() method.
    */
    @Test
    public void subTestGetForcedAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getForcedAsBigInteger());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS BigInteger === " + jMetaDataMenu.getForcedAsBigInteger());
    }

   /**
    * Test getForcedAsURL() method.
    */
    @Test
    public void subTestGetForcedAsURL() {
        assertEquals(null, this.jMetaDataMenu.getForcedAsURL());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS URL === " + jMetaDataMenu.getForcedAsURL());
    }

   /**
    * Test getFirstPacketOrderAsInteger() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getFirstPacketOrderAsInteger());
        System.out.println("Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0) AS Integer === " + jMetaDataMenu.getFirstPacketOrderAsInteger());
    }

   /**
    * Test getFirstPacketOrderAsLong() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsLong() {
        assertEquals(null, this.jMetaDataMenu.getFirstPacketOrderAsLong());
        System.out.println("Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0) AS Long === " + jMetaDataMenu.getFirstPacketOrderAsLong());
    }

   /**
    * Test getFirstPacketOrderAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getFirstPacketOrderAsLocalDateTime());
        System.out.println("Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0) AS LocalDateTime === " + jMetaDataMenu.getFirstPacketOrderAsLocalDateTime());
    }

   /**
    * Test getFirstPacketOrderAsLocalTime() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getFirstPacketOrderAsLocalTime());
        System.out.println("Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0) AS LocalTime === " + jMetaDataMenu.getFirstPacketOrderAsLocalTime());
    }

   /**
    * Test getFirstPacketOrderAsString() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsString() {
        assertEquals(null, this.jMetaDataMenu.getFirstPacketOrderAsString());
        System.out.println("Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0) AS String === " + jMetaDataMenu.getFirstPacketOrderAsString());
    }

   /**
    * Test getFirstPacketOrderAsBoolean() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getFirstPacketOrderAsBoolean());
        System.out.println("Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0) AS Boolean === " + jMetaDataMenu.getFirstPacketOrderAsBoolean());
    }

   /**
    * Test getFirstPacketOrderAsBigInteger() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getFirstPacketOrderAsBigInteger());
        System.out.println("Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0) AS BigInteger === " + jMetaDataMenu.getFirstPacketOrderAsBigInteger());
    }

   /**
    * Test getFirstPacketOrderAsURL() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsURL() {
        assertEquals(null, this.jMetaDataMenu.getFirstPacketOrderAsURL());
        System.out.println("Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0) AS URL === " + jMetaDataMenu.getFirstPacketOrderAsURL());
    }

   /**
    * Test getDurationEndAsInteger() method.
    */
    @Test
    public void subTestGetDurationEndAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDurationEndAsInteger());
        System.out.println("Duration_End AS Integer === " + jMetaDataMenu.getDurationEndAsInteger());
    }

   /**
    * Test getDurationEndAsLong() method.
    */
    @Test
    public void subTestGetDurationEndAsLong() {
        assertEquals(null, this.jMetaDataMenu.getDurationEndAsLong());
        System.out.println("Duration_End AS Long === " + jMetaDataMenu.getDurationEndAsLong());
    }

   /**
    * Test getDurationEndAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationEndAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDurationEndAsLocalDateTime());
        System.out.println("Duration_End AS LocalDateTime === " + jMetaDataMenu.getDurationEndAsLocalDateTime());
    }

   /**
    * Test getDurationEndAsLocalTime() method.
    */
    @Test
    public void subTestGetDurationEndAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDurationEndAsLocalTime());
        System.out.println("Duration_End AS LocalTime === " + jMetaDataMenu.getDurationEndAsLocalTime());
    }

   /**
    * Test getDurationEndAsString() method.
    */
    @Test
    public void subTestGetDurationEndAsString() {
        assertEquals(null, this.jMetaDataMenu.getDurationEndAsString());
        System.out.println("Duration_End AS String === " + jMetaDataMenu.getDurationEndAsString());
    }

   /**
    * Test getDurationEndAsBoolean() method.
    */
    @Test
    public void subTestGetDurationEndAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDurationEndAsBoolean());
        System.out.println("Duration_End AS Boolean === " + jMetaDataMenu.getDurationEndAsBoolean());
    }

   /**
    * Test getDurationEndAsBigInteger() method.
    */
    @Test
    public void subTestGetDurationEndAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDurationEndAsBigInteger());
        System.out.println("Duration_End AS BigInteger === " + jMetaDataMenu.getDurationEndAsBigInteger());
    }

   /**
    * Test getDurationEndAsURL() method.
    */
    @Test
    public void subTestGetDurationEndAsURL() {
        assertEquals(null, this.jMetaDataMenu.getDurationEndAsURL());
        System.out.println("Duration_End AS URL === " + jMetaDataMenu.getDurationEndAsURL());
    }

   /**
    * Test getStreamKindAsInteger() method.
    */
    @Test
    public void subTestGetStreamKindAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindAsInteger());
        System.out.println("Stream type name AS Integer === " + jMetaDataMenu.getStreamKindAsInteger());
    }

   /**
    * Test getStreamKindAsLong() method.
    */
    @Test
    public void subTestGetStreamKindAsLong() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindAsLong());
        System.out.println("Stream type name AS Long === " + jMetaDataMenu.getStreamKindAsLong());
    }

   /**
    * Test getStreamKindAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamKindAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindAsLocalDateTime());
        System.out.println("Stream type name AS LocalDateTime === " + jMetaDataMenu.getStreamKindAsLocalDateTime());
    }

   /**
    * Test getStreamKindAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamKindAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindAsLocalTime());
        System.out.println("Stream type name AS LocalTime === " + jMetaDataMenu.getStreamKindAsLocalTime());
    }

   /**
    * Test getStreamKindAsString() method.
    */
    @Test
    public void subTestGetStreamKindAsString() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindAsString());
        System.out.println("Stream type name AS String === " + jMetaDataMenu.getStreamKindAsString());
    }

   /**
    * Test getStreamKindAsBoolean() method.
    */
    @Test
    public void subTestGetStreamKindAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindAsBoolean());
        System.out.println("Stream type name AS Boolean === " + jMetaDataMenu.getStreamKindAsBoolean());
    }

   /**
    * Test getStreamKindAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamKindAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindAsBigInteger());
        System.out.println("Stream type name AS BigInteger === " + jMetaDataMenu.getStreamKindAsBigInteger());
    }

   /**
    * Test getStreamKindAsURL() method.
    */
    @Test
    public void subTestGetStreamKindAsURL() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindAsURL());
        System.out.println("Stream type name AS URL === " + jMetaDataMenu.getStreamKindAsURL());
    }

   /**
    * Test getInformAsInteger() method.
    */
    @Test
    public void subTestGetInformAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getInformAsInteger());
        System.out.println("Last **Inform** call AS Integer === " + jMetaDataMenu.getInformAsInteger());
    }

   /**
    * Test getInformAsLong() method.
    */
    @Test
    public void subTestGetInformAsLong() {
        assertEquals(null, this.jMetaDataMenu.getInformAsLong());
        System.out.println("Last **Inform** call AS Long === " + jMetaDataMenu.getInformAsLong());
    }

   /**
    * Test getInformAsLocalDateTime() method.
    */
    @Test
    public void subTestGetInformAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getInformAsLocalDateTime());
        System.out.println("Last **Inform** call AS LocalDateTime === " + jMetaDataMenu.getInformAsLocalDateTime());
    }

   /**
    * Test getInformAsLocalTime() method.
    */
    @Test
    public void subTestGetInformAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getInformAsLocalTime());
        System.out.println("Last **Inform** call AS LocalTime === " + jMetaDataMenu.getInformAsLocalTime());
    }

   /**
    * Test getInformAsString() method.
    */
    @Test
    public void subTestGetInformAsString() {
        assertEquals(null, this.jMetaDataMenu.getInformAsString());
        System.out.println("Last **Inform** call AS String === " + jMetaDataMenu.getInformAsString());
    }

   /**
    * Test getInformAsBoolean() method.
    */
    @Test
    public void subTestGetInformAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getInformAsBoolean());
        System.out.println("Last **Inform** call AS Boolean === " + jMetaDataMenu.getInformAsBoolean());
    }

   /**
    * Test getInformAsBigInteger() method.
    */
    @Test
    public void subTestGetInformAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getInformAsBigInteger());
        System.out.println("Last **Inform** call AS BigInteger === " + jMetaDataMenu.getInformAsBigInteger());
    }

   /**
    * Test getInformAsURL() method.
    */
    @Test
    public void subTestGetInformAsURL() {
        assertEquals(null, this.jMetaDataMenu.getInformAsURL());
        System.out.println("Last **Inform** call AS URL === " + jMetaDataMenu.getInformAsURL());
    }

   /**
    * Test getLanguageString1AsInteger() method.
    */
    @Test
    public void subTestGetLanguageString1AsInteger() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString1AsInteger());
        System.out.println("Language (full) AS Integer === " + jMetaDataMenu.getLanguageString1AsInteger());
    }

   /**
    * Test getLanguageString1AsLong() method.
    */
    @Test
    public void subTestGetLanguageString1AsLong() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString1AsLong());
        System.out.println("Language (full) AS Long === " + jMetaDataMenu.getLanguageString1AsLong());
    }

   /**
    * Test getLanguageString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetLanguageString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString1AsLocalDateTime());
        System.out.println("Language (full) AS LocalDateTime === " + jMetaDataMenu.getLanguageString1AsLocalDateTime());
    }

   /**
    * Test getLanguageString1AsLocalTime() method.
    */
    @Test
    public void subTestGetLanguageString1AsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString1AsLocalTime());
        System.out.println("Language (full) AS LocalTime === " + jMetaDataMenu.getLanguageString1AsLocalTime());
    }

   /**
    * Test getLanguageString1AsString() method.
    */
    @Test
    public void subTestGetLanguageString1AsString() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString1AsString());
        System.out.println("Language (full) AS String === " + jMetaDataMenu.getLanguageString1AsString());
    }

   /**
    * Test getLanguageString1AsBoolean() method.
    */
    @Test
    public void subTestGetLanguageString1AsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString1AsBoolean());
        System.out.println("Language (full) AS Boolean === " + jMetaDataMenu.getLanguageString1AsBoolean());
    }

   /**
    * Test getLanguageString1AsBigInteger() method.
    */
    @Test
    public void subTestGetLanguageString1AsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString1AsBigInteger());
        System.out.println("Language (full) AS BigInteger === " + jMetaDataMenu.getLanguageString1AsBigInteger());
    }

   /**
    * Test getLanguageString1AsURL() method.
    */
    @Test
    public void subTestGetLanguageString1AsURL() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString1AsURL());
        System.out.println("Language (full) AS URL === " + jMetaDataMenu.getLanguageString1AsURL());
    }

   /**
    * Test getLawRatingReasonAsInteger() method.
    */
    @Test
    public void subTestGetLawRatingReasonAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getLawRatingReasonAsInteger());
        System.out.println("Reason for the law rating AS Integer === " + jMetaDataMenu.getLawRatingReasonAsInteger());
    }

   /**
    * Test getLawRatingReasonAsLong() method.
    */
    @Test
    public void subTestGetLawRatingReasonAsLong() {
        assertEquals(null, this.jMetaDataMenu.getLawRatingReasonAsLong());
        System.out.println("Reason for the law rating AS Long === " + jMetaDataMenu.getLawRatingReasonAsLong());
    }

   /**
    * Test getLawRatingReasonAsLocalDateTime() method.
    */
    @Test
    public void subTestGetLawRatingReasonAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getLawRatingReasonAsLocalDateTime());
        System.out.println("Reason for the law rating AS LocalDateTime === " + jMetaDataMenu.getLawRatingReasonAsLocalDateTime());
    }

   /**
    * Test getLawRatingReasonAsLocalTime() method.
    */
    @Test
    public void subTestGetLawRatingReasonAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getLawRatingReasonAsLocalTime());
        System.out.println("Reason for the law rating AS LocalTime === " + jMetaDataMenu.getLawRatingReasonAsLocalTime());
    }

   /**
    * Test getLawRatingReasonAsString() method.
    */
    @Test
    public void subTestGetLawRatingReasonAsString() {
        assertEquals(null, this.jMetaDataMenu.getLawRatingReasonAsString());
        System.out.println("Reason for the law rating AS String === " + jMetaDataMenu.getLawRatingReasonAsString());
    }

   /**
    * Test getLawRatingReasonAsBoolean() method.
    */
    @Test
    public void subTestGetLawRatingReasonAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getLawRatingReasonAsBoolean());
        System.out.println("Reason for the law rating AS Boolean === " + jMetaDataMenu.getLawRatingReasonAsBoolean());
    }

   /**
    * Test getLawRatingReasonAsBigInteger() method.
    */
    @Test
    public void subTestGetLawRatingReasonAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getLawRatingReasonAsBigInteger());
        System.out.println("Reason for the law rating AS BigInteger === " + jMetaDataMenu.getLawRatingReasonAsBigInteger());
    }

   /**
    * Test getLawRatingReasonAsURL() method.
    */
    @Test
    public void subTestGetLawRatingReasonAsURL() {
        assertEquals(null, this.jMetaDataMenu.getLawRatingReasonAsURL());
        System.out.println("Reason for the law rating AS URL === " + jMetaDataMenu.getLawRatingReasonAsURL());
    }

   /**
    * Test getLanguageString2AsInteger() method.
    */
    @Test
    public void subTestGetLanguageString2AsInteger() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString2AsInteger());
        System.out.println("Language (2-letter ISO 639-1 if exists, else empty) AS Integer === " + jMetaDataMenu.getLanguageString2AsInteger());
    }

   /**
    * Test getLanguageString2AsLong() method.
    */
    @Test
    public void subTestGetLanguageString2AsLong() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString2AsLong());
        System.out.println("Language (2-letter ISO 639-1 if exists, else empty) AS Long === " + jMetaDataMenu.getLanguageString2AsLong());
    }

   /**
    * Test getLanguageString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetLanguageString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString2AsLocalDateTime());
        System.out.println("Language (2-letter ISO 639-1 if exists, else empty) AS LocalDateTime === " + jMetaDataMenu.getLanguageString2AsLocalDateTime());
    }

   /**
    * Test getLanguageString2AsLocalTime() method.
    */
    @Test
    public void subTestGetLanguageString2AsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString2AsLocalTime());
        System.out.println("Language (2-letter ISO 639-1 if exists, else empty) AS LocalTime === " + jMetaDataMenu.getLanguageString2AsLocalTime());
    }

   /**
    * Test getLanguageString2AsString() method.
    */
    @Test
    public void subTestGetLanguageString2AsString() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString2AsString());
        System.out.println("Language (2-letter ISO 639-1 if exists, else empty) AS String === " + jMetaDataMenu.getLanguageString2AsString());
    }

   /**
    * Test getLanguageString2AsBoolean() method.
    */
    @Test
    public void subTestGetLanguageString2AsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString2AsBoolean());
        System.out.println("Language (2-letter ISO 639-1 if exists, else empty) AS Boolean === " + jMetaDataMenu.getLanguageString2AsBoolean());
    }

   /**
    * Test getLanguageString2AsBigInteger() method.
    */
    @Test
    public void subTestGetLanguageString2AsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString2AsBigInteger());
        System.out.println("Language (2-letter ISO 639-1 if exists, else empty) AS BigInteger === " + jMetaDataMenu.getLanguageString2AsBigInteger());
    }

   /**
    * Test getLanguageString2AsURL() method.
    */
    @Test
    public void subTestGetLanguageString2AsURL() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString2AsURL());
        System.out.println("Language (2-letter ISO 639-1 if exists, else empty) AS URL === " + jMetaDataMenu.getLanguageString2AsURL());
    }

   /**
    * Test getLanguageString3AsInteger() method.
    */
    @Test
    public void subTestGetLanguageString3AsInteger() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString3AsInteger());
        System.out.println("Language (3-letter ISO 639-2 if exists, else empty) AS Integer === " + jMetaDataMenu.getLanguageString3AsInteger());
    }

   /**
    * Test getLanguageString3AsLong() method.
    */
    @Test
    public void subTestGetLanguageString3AsLong() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString3AsLong());
        System.out.println("Language (3-letter ISO 639-2 if exists, else empty) AS Long === " + jMetaDataMenu.getLanguageString3AsLong());
    }

   /**
    * Test getLanguageString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetLanguageString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString3AsLocalDateTime());
        System.out.println("Language (3-letter ISO 639-2 if exists, else empty) AS LocalDateTime === " + jMetaDataMenu.getLanguageString3AsLocalDateTime());
    }

   /**
    * Test getLanguageString3AsLocalTime() method.
    */
    @Test
    public void subTestGetLanguageString3AsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString3AsLocalTime());
        System.out.println("Language (3-letter ISO 639-2 if exists, else empty) AS LocalTime === " + jMetaDataMenu.getLanguageString3AsLocalTime());
    }

   /**
    * Test getLanguageString3AsString() method.
    */
    @Test
    public void subTestGetLanguageString3AsString() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString3AsString());
        System.out.println("Language (3-letter ISO 639-2 if exists, else empty) AS String === " + jMetaDataMenu.getLanguageString3AsString());
    }

   /**
    * Test getLanguageString3AsBoolean() method.
    */
    @Test
    public void subTestGetLanguageString3AsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString3AsBoolean());
        System.out.println("Language (3-letter ISO 639-2 if exists, else empty) AS Boolean === " + jMetaDataMenu.getLanguageString3AsBoolean());
    }

   /**
    * Test getLanguageString3AsBigInteger() method.
    */
    @Test
    public void subTestGetLanguageString3AsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString3AsBigInteger());
        System.out.println("Language (3-letter ISO 639-2 if exists, else empty) AS BigInteger === " + jMetaDataMenu.getLanguageString3AsBigInteger());
    }

   /**
    * Test getLanguageString3AsURL() method.
    */
    @Test
    public void subTestGetLanguageString3AsURL() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString3AsURL());
        System.out.println("Language (3-letter ISO 639-2 if exists, else empty) AS URL === " + jMetaDataMenu.getLanguageString3AsURL());
    }

   /**
    * Test getLanguageString4AsInteger() method.
    */
    @Test
    public void subTestGetLanguageString4AsInteger() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString4AsInteger());
        System.out.println("Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty) AS Integer === " + jMetaDataMenu.getLanguageString4AsInteger());
    }

   /**
    * Test getLanguageString4AsLong() method.
    */
    @Test
    public void subTestGetLanguageString4AsLong() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString4AsLong());
        System.out.println("Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty) AS Long === " + jMetaDataMenu.getLanguageString4AsLong());
    }

   /**
    * Test getLanguageString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetLanguageString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString4AsLocalDateTime());
        System.out.println("Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty) AS LocalDateTime === " + jMetaDataMenu.getLanguageString4AsLocalDateTime());
    }

   /**
    * Test getLanguageString4AsLocalTime() method.
    */
    @Test
    public void subTestGetLanguageString4AsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString4AsLocalTime());
        System.out.println("Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty) AS LocalTime === " + jMetaDataMenu.getLanguageString4AsLocalTime());
    }

   /**
    * Test getLanguageString4AsString() method.
    */
    @Test
    public void subTestGetLanguageString4AsString() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString4AsString());
        System.out.println("Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty) AS String === " + jMetaDataMenu.getLanguageString4AsString());
    }

   /**
    * Test getLanguageString4AsBoolean() method.
    */
    @Test
    public void subTestGetLanguageString4AsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString4AsBoolean());
        System.out.println("Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty) AS Boolean === " + jMetaDataMenu.getLanguageString4AsBoolean());
    }

   /**
    * Test getLanguageString4AsBigInteger() method.
    */
    @Test
    public void subTestGetLanguageString4AsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString4AsBigInteger());
        System.out.println("Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty) AS BigInteger === " + jMetaDataMenu.getLanguageString4AsBigInteger());
    }

   /**
    * Test getLanguageString4AsURL() method.
    */
    @Test
    public void subTestGetLanguageString4AsURL() {
        assertEquals(null, this.jMetaDataMenu.getLanguageString4AsURL());
        System.out.println("Language (2-letter ISO 639-1 if exists with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn, else empty) AS URL === " + jMetaDataMenu.getLanguageString4AsURL());
    }

   /**
    * Test getCodecIDAsInteger() method.
    */
    @Test
    public void subTestGetCodecIDAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDAsInteger());
        System.out.println("Codec ID (found in some containers) AS Integer === " + jMetaDataMenu.getCodecIDAsInteger());
    }

   /**
    * Test getCodecIDAsLong() method.
    */
    @Test
    public void subTestGetCodecIDAsLong() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDAsLong());
        System.out.println("Codec ID (found in some containers) AS Long === " + jMetaDataMenu.getCodecIDAsLong());
    }

   /**
    * Test getCodecIDAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCodecIDAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDAsLocalDateTime());
        System.out.println("Codec ID (found in some containers) AS LocalDateTime === " + jMetaDataMenu.getCodecIDAsLocalDateTime());
    }

   /**
    * Test getCodecIDAsLocalTime() method.
    */
    @Test
    public void subTestGetCodecIDAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDAsLocalTime());
        System.out.println("Codec ID (found in some containers) AS LocalTime === " + jMetaDataMenu.getCodecIDAsLocalTime());
    }

   /**
    * Test getCodecIDAsString() method.
    */
    @Test
    public void subTestGetCodecIDAsString() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDAsString());
        System.out.println("Codec ID (found in some containers) AS String === " + jMetaDataMenu.getCodecIDAsString());
    }

   /**
    * Test getCodecIDAsBoolean() method.
    */
    @Test
    public void subTestGetCodecIDAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDAsBoolean());
        System.out.println("Codec ID (found in some containers) AS Boolean === " + jMetaDataMenu.getCodecIDAsBoolean());
    }

   /**
    * Test getCodecIDAsBigInteger() method.
    */
    @Test
    public void subTestGetCodecIDAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDAsBigInteger());
        System.out.println("Codec ID (found in some containers) AS BigInteger === " + jMetaDataMenu.getCodecIDAsBigInteger());
    }

   /**
    * Test getCodecIDAsURL() method.
    */
    @Test
    public void subTestGetCodecIDAsURL() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDAsURL());
        System.out.println("Codec ID (found in some containers) AS URL === " + jMetaDataMenu.getCodecIDAsURL());
    }

   /**
    * Test getAlternateGroupAsInteger() method.
    */
    @Test
    public void subTestGetAlternateGroupAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getAlternateGroupAsInteger());
        System.out.println("Number of a group in order to provide versions of the same track AS Integer === " + jMetaDataMenu.getAlternateGroupAsInteger());
    }

   /**
    * Test getAlternateGroupAsLong() method.
    */
    @Test
    public void subTestGetAlternateGroupAsLong() {
        assertEquals(null, this.jMetaDataMenu.getAlternateGroupAsLong());
        System.out.println("Number of a group in order to provide versions of the same track AS Long === " + jMetaDataMenu.getAlternateGroupAsLong());
    }

   /**
    * Test getAlternateGroupAsLocalDateTime() method.
    */
    @Test
    public void subTestGetAlternateGroupAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getAlternateGroupAsLocalDateTime());
        System.out.println("Number of a group in order to provide versions of the same track AS LocalDateTime === " + jMetaDataMenu.getAlternateGroupAsLocalDateTime());
    }

   /**
    * Test getAlternateGroupAsLocalTime() method.
    */
    @Test
    public void subTestGetAlternateGroupAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getAlternateGroupAsLocalTime());
        System.out.println("Number of a group in order to provide versions of the same track AS LocalTime === " + jMetaDataMenu.getAlternateGroupAsLocalTime());
    }

   /**
    * Test getAlternateGroupAsString() method.
    */
    @Test
    public void subTestGetAlternateGroupAsString() {
        assertEquals(null, this.jMetaDataMenu.getAlternateGroupAsString());
        System.out.println("Number of a group in order to provide versions of the same track AS String === " + jMetaDataMenu.getAlternateGroupAsString());
    }

   /**
    * Test getAlternateGroupAsBoolean() method.
    */
    @Test
    public void subTestGetAlternateGroupAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getAlternateGroupAsBoolean());
        System.out.println("Number of a group in order to provide versions of the same track AS Boolean === " + jMetaDataMenu.getAlternateGroupAsBoolean());
    }

   /**
    * Test getAlternateGroupAsBigInteger() method.
    */
    @Test
    public void subTestGetAlternateGroupAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getAlternateGroupAsBigInteger());
        System.out.println("Number of a group in order to provide versions of the same track AS BigInteger === " + jMetaDataMenu.getAlternateGroupAsBigInteger());
    }

   /**
    * Test getAlternateGroupAsURL() method.
    */
    @Test
    public void subTestGetAlternateGroupAsURL() {
        assertEquals(null, this.jMetaDataMenu.getAlternateGroupAsURL());
        System.out.println("Number of a group in order to provide versions of the same track AS URL === " + jMetaDataMenu.getAlternateGroupAsURL());
    }

   /**
    * Test getStreamKindIDAsInteger() method.
    */
    @Test
    public void subTestGetStreamKindIDAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindIDAsInteger());
        System.out.println("Number of the stream (base=0) AS Integer === " + jMetaDataMenu.getStreamKindIDAsInteger());
    }

   /**
    * Test getStreamKindIDAsLong() method.
    */
    @Test
    public void subTestGetStreamKindIDAsLong() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindIDAsLong());
        System.out.println("Number of the stream (base=0) AS Long === " + jMetaDataMenu.getStreamKindIDAsLong());
    }

   /**
    * Test getStreamKindIDAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamKindIDAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindIDAsLocalDateTime());
        System.out.println("Number of the stream (base=0) AS LocalDateTime === " + jMetaDataMenu.getStreamKindIDAsLocalDateTime());
    }

   /**
    * Test getStreamKindIDAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamKindIDAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindIDAsLocalTime());
        System.out.println("Number of the stream (base=0) AS LocalTime === " + jMetaDataMenu.getStreamKindIDAsLocalTime());
    }

   /**
    * Test getStreamKindIDAsString() method.
    */
    @Test
    public void subTestGetStreamKindIDAsString() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindIDAsString());
        System.out.println("Number of the stream (base=0) AS String === " + jMetaDataMenu.getStreamKindIDAsString());
    }

   /**
    * Test getStreamKindIDAsBoolean() method.
    */
    @Test
    public void subTestGetStreamKindIDAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindIDAsBoolean());
        System.out.println("Number of the stream (base=0) AS Boolean === " + jMetaDataMenu.getStreamKindIDAsBoolean());
    }

   /**
    * Test getStreamKindIDAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamKindIDAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindIDAsBigInteger());
        System.out.println("Number of the stream (base=0) AS BigInteger === " + jMetaDataMenu.getStreamKindIDAsBigInteger());
    }

   /**
    * Test getStreamKindIDAsURL() method.
    */
    @Test
    public void subTestGetStreamKindIDAsURL() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindIDAsURL());
        System.out.println("Number of the stream (base=0) AS URL === " + jMetaDataMenu.getStreamKindIDAsURL());
    }

   /**
    * Test getFormatAsInteger() method.
    */
    @Test
    public void subTestGetFormatAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getFormatAsInteger());
        System.out.println("Format used AS Integer === " + jMetaDataMenu.getFormatAsInteger());
    }

   /**
    * Test getFormatAsLong() method.
    */
    @Test
    public void subTestGetFormatAsLong() {
        assertEquals(null, this.jMetaDataMenu.getFormatAsLong());
        System.out.println("Format used AS Long === " + jMetaDataMenu.getFormatAsLong());
    }

   /**
    * Test getFormatAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getFormatAsLocalDateTime());
        System.out.println("Format used AS LocalDateTime === " + jMetaDataMenu.getFormatAsLocalDateTime());
    }

   /**
    * Test getFormatAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getFormatAsLocalTime());
        System.out.println("Format used AS LocalTime === " + jMetaDataMenu.getFormatAsLocalTime());
    }

   /**
    * Test getFormatAsString() method.
    */
    @Test
    public void subTestGetFormatAsString() {
        assertEquals(null, this.jMetaDataMenu.getFormatAsString());
        System.out.println("Format used AS String === " + jMetaDataMenu.getFormatAsString());
    }

   /**
    * Test getFormatAsBoolean() method.
    */
    @Test
    public void subTestGetFormatAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getFormatAsBoolean());
        System.out.println("Format used AS Boolean === " + jMetaDataMenu.getFormatAsBoolean());
    }

   /**
    * Test getFormatAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getFormatAsBigInteger());
        System.out.println("Format used AS BigInteger === " + jMetaDataMenu.getFormatAsBigInteger());
    }

   /**
    * Test getFormatAsURL() method.
    */
    @Test
    public void subTestGetFormatAsURL() {
        assertEquals(null, this.jMetaDataMenu.getFormatAsURL());
        System.out.println("Format used AS URL === " + jMetaDataMenu.getFormatAsURL());
    }

   /**
    * Test getLanguageAsInteger() method.
    */
    @Test
    public void subTestGetLanguageAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getLanguageAsInteger());
        System.out.println("Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn) AS Integer === " + jMetaDataMenu.getLanguageAsInteger());
    }

   /**
    * Test getLanguageAsLong() method.
    */
    @Test
    public void subTestGetLanguageAsLong() {
        assertEquals(null, this.jMetaDataMenu.getLanguageAsLong());
        System.out.println("Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn) AS Long === " + jMetaDataMenu.getLanguageAsLong());
    }

   /**
    * Test getLanguageAsLocalDateTime() method.
    */
    @Test
    public void subTestGetLanguageAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getLanguageAsLocalDateTime());
        System.out.println("Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn) AS LocalDateTime === " + jMetaDataMenu.getLanguageAsLocalDateTime());
    }

   /**
    * Test getLanguageAsLocalTime() method.
    */
    @Test
    public void subTestGetLanguageAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getLanguageAsLocalTime());
        System.out.println("Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn) AS LocalTime === " + jMetaDataMenu.getLanguageAsLocalTime());
    }

   /**
    * Test getLanguageAsString() method.
    */
    @Test
    public void subTestGetLanguageAsString() {
        assertEquals(null, this.jMetaDataMenu.getLanguageAsString());
        System.out.println("Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn) AS String === " + jMetaDataMenu.getLanguageAsString());
    }

   /**
    * Test getLanguageAsBoolean() method.
    */
    @Test
    public void subTestGetLanguageAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getLanguageAsBoolean());
        System.out.println("Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn) AS Boolean === " + jMetaDataMenu.getLanguageAsBoolean());
    }

   /**
    * Test getLanguageAsBigInteger() method.
    */
    @Test
    public void subTestGetLanguageAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getLanguageAsBigInteger());
        System.out.println("Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn) AS BigInteger === " + jMetaDataMenu.getLanguageAsBigInteger());
    }

   /**
    * Test getLanguageAsURL() method.
    */
    @Test
    public void subTestGetLanguageAsURL() {
        assertEquals(null, this.jMetaDataMenu.getLanguageAsURL());
        System.out.println("Language (2-letter ISO 639-1 if exists, else 3-letter ISO 639-2, and with optional ISO 3166-1 country separated by a dash if available, e.g. en, en-us, zh-cn) AS URL === " + jMetaDataMenu.getLanguageAsURL());
    }

   /**
    * Test getOriginalNetworkNameAsInteger() method.
    */
    @Test
    public void subTestGetOriginalNetworkNameAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getOriginalNetworkNameAsInteger());
        System.out.println("Original/NetworkName AS Integer === " + jMetaDataMenu.getOriginalNetworkNameAsInteger());
    }

   /**
    * Test getOriginalNetworkNameAsLong() method.
    */
    @Test
    public void subTestGetOriginalNetworkNameAsLong() {
        assertEquals(null, this.jMetaDataMenu.getOriginalNetworkNameAsLong());
        System.out.println("Original/NetworkName AS Long === " + jMetaDataMenu.getOriginalNetworkNameAsLong());
    }

   /**
    * Test getOriginalNetworkNameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetOriginalNetworkNameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getOriginalNetworkNameAsLocalDateTime());
        System.out.println("Original/NetworkName AS LocalDateTime === " + jMetaDataMenu.getOriginalNetworkNameAsLocalDateTime());
    }

   /**
    * Test getOriginalNetworkNameAsLocalTime() method.
    */
    @Test
    public void subTestGetOriginalNetworkNameAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getOriginalNetworkNameAsLocalTime());
        System.out.println("Original/NetworkName AS LocalTime === " + jMetaDataMenu.getOriginalNetworkNameAsLocalTime());
    }

   /**
    * Test getOriginalNetworkNameAsString() method.
    */
    @Test
    public void subTestGetOriginalNetworkNameAsString() {
        assertEquals(null, this.jMetaDataMenu.getOriginalNetworkNameAsString());
        System.out.println("Original/NetworkName AS String === " + jMetaDataMenu.getOriginalNetworkNameAsString());
    }

   /**
    * Test getOriginalNetworkNameAsBoolean() method.
    */
    @Test
    public void subTestGetOriginalNetworkNameAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getOriginalNetworkNameAsBoolean());
        System.out.println("Original/NetworkName AS Boolean === " + jMetaDataMenu.getOriginalNetworkNameAsBoolean());
    }

   /**
    * Test getOriginalNetworkNameAsBigInteger() method.
    */
    @Test
    public void subTestGetOriginalNetworkNameAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getOriginalNetworkNameAsBigInteger());
        System.out.println("Original/NetworkName AS BigInteger === " + jMetaDataMenu.getOriginalNetworkNameAsBigInteger());
    }

   /**
    * Test getOriginalNetworkNameAsURL() method.
    */
    @Test
    public void subTestGetOriginalNetworkNameAsURL() {
        assertEquals(null, this.jMetaDataMenu.getOriginalNetworkNameAsURL());
        System.out.println("Original/NetworkName AS URL === " + jMetaDataMenu.getOriginalNetworkNameAsURL());
    }

   /**
    * Test getCodecIDInfoAsInteger() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDInfoAsInteger());
        System.out.println("Info about this codec AS Integer === " + jMetaDataMenu.getCodecIDInfoAsInteger());
    }

   /**
    * Test getCodecIDInfoAsLong() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsLong() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDInfoAsLong());
        System.out.println("Info about this codec AS Long === " + jMetaDataMenu.getCodecIDInfoAsLong());
    }

   /**
    * Test getCodecIDInfoAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDInfoAsLocalDateTime());
        System.out.println("Info about this codec AS LocalDateTime === " + jMetaDataMenu.getCodecIDInfoAsLocalDateTime());
    }

   /**
    * Test getCodecIDInfoAsLocalTime() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDInfoAsLocalTime());
        System.out.println("Info about this codec AS LocalTime === " + jMetaDataMenu.getCodecIDInfoAsLocalTime());
    }

   /**
    * Test getCodecIDInfoAsString() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsString() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDInfoAsString());
        System.out.println("Info about this codec AS String === " + jMetaDataMenu.getCodecIDInfoAsString());
    }

   /**
    * Test getCodecIDInfoAsBoolean() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDInfoAsBoolean());
        System.out.println("Info about this codec AS Boolean === " + jMetaDataMenu.getCodecIDInfoAsBoolean());
    }

   /**
    * Test getCodecIDInfoAsBigInteger() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDInfoAsBigInteger());
        System.out.println("Info about this codec AS BigInteger === " + jMetaDataMenu.getCodecIDInfoAsBigInteger());
    }

   /**
    * Test getCodecIDInfoAsURL() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsURL() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDInfoAsURL());
        System.out.println("Info about this codec AS URL === " + jMetaDataMenu.getCodecIDInfoAsURL());
    }

   /**
    * Test getFormatUrlAsInteger() method.
    */
    @Test
    public void subTestGetFormatUrlAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getFormatUrlAsInteger());
        System.out.println("Link AS Integer === " + jMetaDataMenu.getFormatUrlAsInteger());
    }

   /**
    * Test getFormatUrlAsLong() method.
    */
    @Test
    public void subTestGetFormatUrlAsLong() {
        assertEquals(null, this.jMetaDataMenu.getFormatUrlAsLong());
        System.out.println("Link AS Long === " + jMetaDataMenu.getFormatUrlAsLong());
    }

   /**
    * Test getFormatUrlAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatUrlAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getFormatUrlAsLocalDateTime());
        System.out.println("Link AS LocalDateTime === " + jMetaDataMenu.getFormatUrlAsLocalDateTime());
    }

   /**
    * Test getFormatUrlAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatUrlAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getFormatUrlAsLocalTime());
        System.out.println("Link AS LocalTime === " + jMetaDataMenu.getFormatUrlAsLocalTime());
    }

   /**
    * Test getFormatUrlAsString() method.
    */
    @Test
    public void subTestGetFormatUrlAsString() {
        assertEquals(null, this.jMetaDataMenu.getFormatUrlAsString());
        System.out.println("Link AS String === " + jMetaDataMenu.getFormatUrlAsString());
    }

   /**
    * Test getFormatUrlAsBoolean() method.
    */
    @Test
    public void subTestGetFormatUrlAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getFormatUrlAsBoolean());
        System.out.println("Link AS Boolean === " + jMetaDataMenu.getFormatUrlAsBoolean());
    }

   /**
    * Test getFormatUrlAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatUrlAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getFormatUrlAsBigInteger());
        System.out.println("Link AS BigInteger === " + jMetaDataMenu.getFormatUrlAsBigInteger());
    }

   /**
    * Test getFormatUrlAsURL() method.
    */
    @Test
    public void subTestGetFormatUrlAsURL() {
        assertEquals(null, this.jMetaDataMenu.getFormatUrlAsURL());
        System.out.println("Link AS URL === " + jMetaDataMenu.getFormatUrlAsURL());
    }

   /**
    * Test getCodecIDStringAsInteger() method.
    */
    @Test
    public void subTestGetCodecIDStringAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDStringAsInteger());
        System.out.println("Codec ID (found in some containers) AS Integer === " + jMetaDataMenu.getCodecIDStringAsInteger());
    }

   /**
    * Test getCodecIDStringAsLong() method.
    */
    @Test
    public void subTestGetCodecIDStringAsLong() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDStringAsLong());
        System.out.println("Codec ID (found in some containers) AS Long === " + jMetaDataMenu.getCodecIDStringAsLong());
    }

   /**
    * Test getCodecIDStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCodecIDStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDStringAsLocalDateTime());
        System.out.println("Codec ID (found in some containers) AS LocalDateTime === " + jMetaDataMenu.getCodecIDStringAsLocalDateTime());
    }

   /**
    * Test getCodecIDStringAsLocalTime() method.
    */
    @Test
    public void subTestGetCodecIDStringAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDStringAsLocalTime());
        System.out.println("Codec ID (found in some containers) AS LocalTime === " + jMetaDataMenu.getCodecIDStringAsLocalTime());
    }

   /**
    * Test getCodecIDStringAsString() method.
    */
    @Test
    public void subTestGetCodecIDStringAsString() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDStringAsString());
        System.out.println("Codec ID (found in some containers) AS String === " + jMetaDataMenu.getCodecIDStringAsString());
    }

   /**
    * Test getCodecIDStringAsBoolean() method.
    */
    @Test
    public void subTestGetCodecIDStringAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDStringAsBoolean());
        System.out.println("Codec ID (found in some containers) AS Boolean === " + jMetaDataMenu.getCodecIDStringAsBoolean());
    }

   /**
    * Test getCodecIDStringAsBigInteger() method.
    */
    @Test
    public void subTestGetCodecIDStringAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDStringAsBigInteger());
        System.out.println("Codec ID (found in some containers) AS BigInteger === " + jMetaDataMenu.getCodecIDStringAsBigInteger());
    }

   /**
    * Test getCodecIDStringAsURL() method.
    */
    @Test
    public void subTestGetCodecIDStringAsURL() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDStringAsURL());
        System.out.println("Codec ID (found in some containers) AS URL === " + jMetaDataMenu.getCodecIDStringAsURL());
    }

   /**
    * Test getDefaultStringAsInteger() method.
    */
    @Test
    public void subTestGetDefaultStringAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDefaultStringAsInteger());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS Integer === " + jMetaDataMenu.getDefaultStringAsInteger());
    }

   /**
    * Test getDefaultStringAsLong() method.
    */
    @Test
    public void subTestGetDefaultStringAsLong() {
        assertEquals(null, this.jMetaDataMenu.getDefaultStringAsLong());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS Long === " + jMetaDataMenu.getDefaultStringAsLong());
    }

   /**
    * Test getDefaultStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDefaultStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDefaultStringAsLocalDateTime());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS LocalDateTime === " + jMetaDataMenu.getDefaultStringAsLocalDateTime());
    }

   /**
    * Test getDefaultStringAsLocalTime() method.
    */
    @Test
    public void subTestGetDefaultStringAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDefaultStringAsLocalTime());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS LocalTime === " + jMetaDataMenu.getDefaultStringAsLocalTime());
    }

   /**
    * Test getDefaultStringAsString() method.
    */
    @Test
    public void subTestGetDefaultStringAsString() {
        assertEquals(null, this.jMetaDataMenu.getDefaultStringAsString());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS String === " + jMetaDataMenu.getDefaultStringAsString());
    }

   /**
    * Test getDefaultStringAsBoolean() method.
    */
    @Test
    public void subTestGetDefaultStringAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDefaultStringAsBoolean());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS Boolean === " + jMetaDataMenu.getDefaultStringAsBoolean());
    }

   /**
    * Test getDefaultStringAsBigInteger() method.
    */
    @Test
    public void subTestGetDefaultStringAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDefaultStringAsBigInteger());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS BigInteger === " + jMetaDataMenu.getDefaultStringAsBigInteger());
    }

   /**
    * Test getDefaultStringAsURL() method.
    */
    @Test
    public void subTestGetDefaultStringAsURL() {
        assertEquals(null, this.jMetaDataMenu.getDefaultStringAsURL());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS URL === " + jMetaDataMenu.getDefaultStringAsURL());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsInteger() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getOriginalSourceMediumIDStringAsInteger());
        System.out.println("The ID for this stream in the original medium of the material AS Integer === " + jMetaDataMenu.getOriginalSourceMediumIDStringAsInteger());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsLong() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsLong() {
        assertEquals(null, this.jMetaDataMenu.getOriginalSourceMediumIDStringAsLong());
        System.out.println("The ID for this stream in the original medium of the material AS Long === " + jMetaDataMenu.getOriginalSourceMediumIDStringAsLong());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getOriginalSourceMediumIDStringAsLocalDateTime());
        System.out.println("The ID for this stream in the original medium of the material AS LocalDateTime === " + jMetaDataMenu.getOriginalSourceMediumIDStringAsLocalDateTime());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsLocalTime() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getOriginalSourceMediumIDStringAsLocalTime());
        System.out.println("The ID for this stream in the original medium of the material AS LocalTime === " + jMetaDataMenu.getOriginalSourceMediumIDStringAsLocalTime());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsString() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsString() {
        assertEquals(null, this.jMetaDataMenu.getOriginalSourceMediumIDStringAsString());
        System.out.println("The ID for this stream in the original medium of the material AS String === " + jMetaDataMenu.getOriginalSourceMediumIDStringAsString());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsBoolean() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getOriginalSourceMediumIDStringAsBoolean());
        System.out.println("The ID for this stream in the original medium of the material AS Boolean === " + jMetaDataMenu.getOriginalSourceMediumIDStringAsBoolean());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsBigInteger() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getOriginalSourceMediumIDStringAsBigInteger());
        System.out.println("The ID for this stream in the original medium of the material AS BigInteger === " + jMetaDataMenu.getOriginalSourceMediumIDStringAsBigInteger());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsURL() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsURL() {
        assertEquals(null, this.jMetaDataMenu.getOriginalSourceMediumIDStringAsURL());
        System.out.println("The ID for this stream in the original medium of the material AS URL === " + jMetaDataMenu.getOriginalSourceMediumIDStringAsURL());
    }

   /**
    * Test getFormatCommercialAsInteger() method.
    */
    @Test
    public void subTestGetFormatCommercialAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getFormatCommercialAsInteger());
        System.out.println("Commercial name used by vendor for theses setings or Format field if there is no difference AS Integer === " + jMetaDataMenu.getFormatCommercialAsInteger());
    }

   /**
    * Test getFormatCommercialAsLong() method.
    */
    @Test
    public void subTestGetFormatCommercialAsLong() {
        assertEquals(null, this.jMetaDataMenu.getFormatCommercialAsLong());
        System.out.println("Commercial name used by vendor for theses setings or Format field if there is no difference AS Long === " + jMetaDataMenu.getFormatCommercialAsLong());
    }

   /**
    * Test getFormatCommercialAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatCommercialAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getFormatCommercialAsLocalDateTime());
        System.out.println("Commercial name used by vendor for theses setings or Format field if there is no difference AS LocalDateTime === " + jMetaDataMenu.getFormatCommercialAsLocalDateTime());
    }

   /**
    * Test getFormatCommercialAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatCommercialAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getFormatCommercialAsLocalTime());
        System.out.println("Commercial name used by vendor for theses setings or Format field if there is no difference AS LocalTime === " + jMetaDataMenu.getFormatCommercialAsLocalTime());
    }

   /**
    * Test getFormatCommercialAsString() method.
    */
    @Test
    public void subTestGetFormatCommercialAsString() {
        assertEquals(null, this.jMetaDataMenu.getFormatCommercialAsString());
        System.out.println("Commercial name used by vendor for theses setings or Format field if there is no difference AS String === " + jMetaDataMenu.getFormatCommercialAsString());
    }

   /**
    * Test getFormatCommercialAsBoolean() method.
    */
    @Test
    public void subTestGetFormatCommercialAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getFormatCommercialAsBoolean());
        System.out.println("Commercial name used by vendor for theses setings or Format field if there is no difference AS Boolean === " + jMetaDataMenu.getFormatCommercialAsBoolean());
    }

   /**
    * Test getFormatCommercialAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatCommercialAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getFormatCommercialAsBigInteger());
        System.out.println("Commercial name used by vendor for theses setings or Format field if there is no difference AS BigInteger === " + jMetaDataMenu.getFormatCommercialAsBigInteger());
    }

   /**
    * Test getFormatCommercialAsURL() method.
    */
    @Test
    public void subTestGetFormatCommercialAsURL() {
        assertEquals(null, this.jMetaDataMenu.getFormatCommercialAsURL());
        System.out.println("Commercial name used by vendor for theses setings or Format field if there is no difference AS URL === " + jMetaDataMenu.getFormatCommercialAsURL());
    }

   /**
    * Test getFormatInfoAsInteger() method.
    */
    @Test
    public void subTestGetFormatInfoAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getFormatInfoAsInteger());
        System.out.println("Info about Format AS Integer === " + jMetaDataMenu.getFormatInfoAsInteger());
    }

   /**
    * Test getFormatInfoAsLong() method.
    */
    @Test
    public void subTestGetFormatInfoAsLong() {
        assertEquals(null, this.jMetaDataMenu.getFormatInfoAsLong());
        System.out.println("Info about Format AS Long === " + jMetaDataMenu.getFormatInfoAsLong());
    }

   /**
    * Test getFormatInfoAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatInfoAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getFormatInfoAsLocalDateTime());
        System.out.println("Info about Format AS LocalDateTime === " + jMetaDataMenu.getFormatInfoAsLocalDateTime());
    }

   /**
    * Test getFormatInfoAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatInfoAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getFormatInfoAsLocalTime());
        System.out.println("Info about Format AS LocalTime === " + jMetaDataMenu.getFormatInfoAsLocalTime());
    }

   /**
    * Test getFormatInfoAsString() method.
    */
    @Test
    public void subTestGetFormatInfoAsString() {
        assertEquals(null, this.jMetaDataMenu.getFormatInfoAsString());
        System.out.println("Info about Format AS String === " + jMetaDataMenu.getFormatInfoAsString());
    }

   /**
    * Test getFormatInfoAsBoolean() method.
    */
    @Test
    public void subTestGetFormatInfoAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getFormatInfoAsBoolean());
        System.out.println("Info about Format AS Boolean === " + jMetaDataMenu.getFormatInfoAsBoolean());
    }

   /**
    * Test getFormatInfoAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatInfoAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getFormatInfoAsBigInteger());
        System.out.println("Info about Format AS BigInteger === " + jMetaDataMenu.getFormatInfoAsBigInteger());
    }

   /**
    * Test getFormatInfoAsURL() method.
    */
    @Test
    public void subTestGetFormatInfoAsURL() {
        assertEquals(null, this.jMetaDataMenu.getFormatInfoAsURL());
        System.out.println("Info about Format AS URL === " + jMetaDataMenu.getFormatInfoAsURL());
    }

   /**
    * Test getCodecIDUrlAsInteger() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDUrlAsInteger());
        System.out.println("A link to more details about this codec ID AS Integer === " + jMetaDataMenu.getCodecIDUrlAsInteger());
    }

   /**
    * Test getCodecIDUrlAsLong() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsLong() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDUrlAsLong());
        System.out.println("A link to more details about this codec ID AS Long === " + jMetaDataMenu.getCodecIDUrlAsLong());
    }

   /**
    * Test getCodecIDUrlAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDUrlAsLocalDateTime());
        System.out.println("A link to more details about this codec ID AS LocalDateTime === " + jMetaDataMenu.getCodecIDUrlAsLocalDateTime());
    }

   /**
    * Test getCodecIDUrlAsLocalTime() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDUrlAsLocalTime());
        System.out.println("A link to more details about this codec ID AS LocalTime === " + jMetaDataMenu.getCodecIDUrlAsLocalTime());
    }

   /**
    * Test getCodecIDUrlAsString() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsString() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDUrlAsString());
        System.out.println("A link to more details about this codec ID AS String === " + jMetaDataMenu.getCodecIDUrlAsString());
    }

   /**
    * Test getCodecIDUrlAsBoolean() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDUrlAsBoolean());
        System.out.println("A link to more details about this codec ID AS Boolean === " + jMetaDataMenu.getCodecIDUrlAsBoolean());
    }

   /**
    * Test getCodecIDUrlAsBigInteger() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDUrlAsBigInteger());
        System.out.println("A link to more details about this codec ID AS BigInteger === " + jMetaDataMenu.getCodecIDUrlAsBigInteger());
    }

   /**
    * Test getCodecIDUrlAsURL() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsURL() {
        assertEquals(null, this.jMetaDataMenu.getCodecIDUrlAsURL());
        System.out.println("A link to more details about this codec ID AS URL === " + jMetaDataMenu.getCodecIDUrlAsURL());
    }

   /**
    * Test getTitleAsInteger() method.
    */
    @Test
    public void subTestGetTitleAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getTitleAsInteger());
        System.out.println("Name of this menu AS Integer === " + jMetaDataMenu.getTitleAsInteger());
    }

   /**
    * Test getTitleAsLong() method.
    */
    @Test
    public void subTestGetTitleAsLong() {
        assertEquals(null, this.jMetaDataMenu.getTitleAsLong());
        System.out.println("Name of this menu AS Long === " + jMetaDataMenu.getTitleAsLong());
    }

   /**
    * Test getTitleAsLocalDateTime() method.
    */
    @Test
    public void subTestGetTitleAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getTitleAsLocalDateTime());
        System.out.println("Name of this menu AS LocalDateTime === " + jMetaDataMenu.getTitleAsLocalDateTime());
    }

   /**
    * Test getTitleAsLocalTime() method.
    */
    @Test
    public void subTestGetTitleAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getTitleAsLocalTime());
        System.out.println("Name of this menu AS LocalTime === " + jMetaDataMenu.getTitleAsLocalTime());
    }

   /**
    * Test getTitleAsString() method.
    */
    @Test
    public void subTestGetTitleAsString() {
        assertEquals(null, this.jMetaDataMenu.getTitleAsString());
        System.out.println("Name of this menu AS String === " + jMetaDataMenu.getTitleAsString());
    }

   /**
    * Test getTitleAsBoolean() method.
    */
    @Test
    public void subTestGetTitleAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getTitleAsBoolean());
        System.out.println("Name of this menu AS Boolean === " + jMetaDataMenu.getTitleAsBoolean());
    }

   /**
    * Test getTitleAsBigInteger() method.
    */
    @Test
    public void subTestGetTitleAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getTitleAsBigInteger());
        System.out.println("Name of this menu AS BigInteger === " + jMetaDataMenu.getTitleAsBigInteger());
    }

   /**
    * Test getTitleAsURL() method.
    */
    @Test
    public void subTestGetTitleAsURL() {
        assertEquals(null, this.jMetaDataMenu.getTitleAsURL());
        System.out.println("Name of this menu AS URL === " + jMetaDataMenu.getTitleAsURL());
    }

   /**
    * Test getStreamKindStringAsInteger() method.
    */
    @Test
    public void subTestGetStreamKindStringAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindStringAsInteger());
        System.out.println("Stream type name AS Integer === " + jMetaDataMenu.getStreamKindStringAsInteger());
    }

   /**
    * Test getStreamKindStringAsLong() method.
    */
    @Test
    public void subTestGetStreamKindStringAsLong() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindStringAsLong());
        System.out.println("Stream type name AS Long === " + jMetaDataMenu.getStreamKindStringAsLong());
    }

   /**
    * Test getStreamKindStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamKindStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindStringAsLocalDateTime());
        System.out.println("Stream type name AS LocalDateTime === " + jMetaDataMenu.getStreamKindStringAsLocalDateTime());
    }

   /**
    * Test getStreamKindStringAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamKindStringAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindStringAsLocalTime());
        System.out.println("Stream type name AS LocalTime === " + jMetaDataMenu.getStreamKindStringAsLocalTime());
    }

   /**
    * Test getStreamKindStringAsString() method.
    */
    @Test
    public void subTestGetStreamKindStringAsString() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindStringAsString());
        System.out.println("Stream type name AS String === " + jMetaDataMenu.getStreamKindStringAsString());
    }

   /**
    * Test getStreamKindStringAsBoolean() method.
    */
    @Test
    public void subTestGetStreamKindStringAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindStringAsBoolean());
        System.out.println("Stream type name AS Boolean === " + jMetaDataMenu.getStreamKindStringAsBoolean());
    }

   /**
    * Test getStreamKindStringAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamKindStringAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindStringAsBigInteger());
        System.out.println("Stream type name AS BigInteger === " + jMetaDataMenu.getStreamKindStringAsBigInteger());
    }

   /**
    * Test getStreamKindStringAsURL() method.
    */
    @Test
    public void subTestGetStreamKindStringAsURL() {
        assertEquals(null, this.jMetaDataMenu.getStreamKindStringAsURL());
        System.out.println("Stream type name AS URL === " + jMetaDataMenu.getStreamKindStringAsURL());
    }

   /**
    * Test getListStringAsInteger() method.
    */
    @Test
    public void subTestGetListStringAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getListStringAsInteger());
        System.out.println("List of programs available AS Integer === " + jMetaDataMenu.getListStringAsInteger());
    }

   /**
    * Test getListStringAsLong() method.
    */
    @Test
    public void subTestGetListStringAsLong() {
        assertEquals(null, this.jMetaDataMenu.getListStringAsLong());
        System.out.println("List of programs available AS Long === " + jMetaDataMenu.getListStringAsLong());
    }

   /**
    * Test getListStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetListStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getListStringAsLocalDateTime());
        System.out.println("List of programs available AS LocalDateTime === " + jMetaDataMenu.getListStringAsLocalDateTime());
    }

   /**
    * Test getListStringAsLocalTime() method.
    */
    @Test
    public void subTestGetListStringAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getListStringAsLocalTime());
        System.out.println("List of programs available AS LocalTime === " + jMetaDataMenu.getListStringAsLocalTime());
    }

   /**
    * Test getListStringAsString() method.
    */
    @Test
    public void subTestGetListStringAsString() {
        assertEquals(null, this.jMetaDataMenu.getListStringAsString());
        System.out.println("List of programs available AS String === " + jMetaDataMenu.getListStringAsString());
    }

   /**
    * Test getListStringAsBoolean() method.
    */
    @Test
    public void subTestGetListStringAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getListStringAsBoolean());
        System.out.println("List of programs available AS Boolean === " + jMetaDataMenu.getListStringAsBoolean());
    }

   /**
    * Test getListStringAsBigInteger() method.
    */
    @Test
    public void subTestGetListStringAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getListStringAsBigInteger());
        System.out.println("List of programs available AS BigInteger === " + jMetaDataMenu.getListStringAsBigInteger());
    }

   /**
    * Test getListStringAsURL() method.
    */
    @Test
    public void subTestGetListStringAsURL() {
        assertEquals(null, this.jMetaDataMenu.getListStringAsURL());
        System.out.println("List of programs available AS URL === " + jMetaDataMenu.getListStringAsURL());
    }

   /**
    * Test getDelayDropFrameAsInteger() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDelayDropFrameAsInteger());
        System.out.println("Delay drop frame AS Integer === " + jMetaDataMenu.getDelayDropFrameAsInteger());
    }

   /**
    * Test getDelayDropFrameAsLong() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsLong() {
        assertEquals(null, this.jMetaDataMenu.getDelayDropFrameAsLong());
        System.out.println("Delay drop frame AS Long === " + jMetaDataMenu.getDelayDropFrameAsLong());
    }

   /**
    * Test getDelayDropFrameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDelayDropFrameAsLocalDateTime());
        System.out.println("Delay drop frame AS LocalDateTime === " + jMetaDataMenu.getDelayDropFrameAsLocalDateTime());
    }

   /**
    * Test getDelayDropFrameAsLocalTime() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDelayDropFrameAsLocalTime());
        System.out.println("Delay drop frame AS LocalTime === " + jMetaDataMenu.getDelayDropFrameAsLocalTime());
    }

   /**
    * Test getDelayDropFrameAsString() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsString() {
        assertEquals(null, this.jMetaDataMenu.getDelayDropFrameAsString());
        System.out.println("Delay drop frame AS String === " + jMetaDataMenu.getDelayDropFrameAsString());
    }

   /**
    * Test getDelayDropFrameAsBoolean() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDelayDropFrameAsBoolean());
        System.out.println("Delay drop frame AS Boolean === " + jMetaDataMenu.getDelayDropFrameAsBoolean());
    }

   /**
    * Test getDelayDropFrameAsBigInteger() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDelayDropFrameAsBigInteger());
        System.out.println("Delay drop frame AS BigInteger === " + jMetaDataMenu.getDelayDropFrameAsBigInteger());
    }

   /**
    * Test getDelayDropFrameAsURL() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsURL() {
        assertEquals(null, this.jMetaDataMenu.getDelayDropFrameAsURL());
        System.out.println("Delay drop frame AS URL === " + jMetaDataMenu.getDelayDropFrameAsURL());
    }

   /**
    * Test getDisabledStringAsInteger() method.
    */
    @Test
    public void subTestGetDisabledStringAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDisabledStringAsInteger());
        System.out.println("Set if that track should not be used AS Integer === " + jMetaDataMenu.getDisabledStringAsInteger());
    }

   /**
    * Test getDisabledStringAsLong() method.
    */
    @Test
    public void subTestGetDisabledStringAsLong() {
        assertEquals(null, this.jMetaDataMenu.getDisabledStringAsLong());
        System.out.println("Set if that track should not be used AS Long === " + jMetaDataMenu.getDisabledStringAsLong());
    }

   /**
    * Test getDisabledStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDisabledStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDisabledStringAsLocalDateTime());
        System.out.println("Set if that track should not be used AS LocalDateTime === " + jMetaDataMenu.getDisabledStringAsLocalDateTime());
    }

   /**
    * Test getDisabledStringAsLocalTime() method.
    */
    @Test
    public void subTestGetDisabledStringAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDisabledStringAsLocalTime());
        System.out.println("Set if that track should not be used AS LocalTime === " + jMetaDataMenu.getDisabledStringAsLocalTime());
    }

   /**
    * Test getDisabledStringAsString() method.
    */
    @Test
    public void subTestGetDisabledStringAsString() {
        assertEquals(null, this.jMetaDataMenu.getDisabledStringAsString());
        System.out.println("Set if that track should not be used AS String === " + jMetaDataMenu.getDisabledStringAsString());
    }

   /**
    * Test getDisabledStringAsBoolean() method.
    */
    @Test
    public void subTestGetDisabledStringAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDisabledStringAsBoolean());
        System.out.println("Set if that track should not be used AS Boolean === " + jMetaDataMenu.getDisabledStringAsBoolean());
    }

   /**
    * Test getDisabledStringAsBigInteger() method.
    */
    @Test
    public void subTestGetDisabledStringAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDisabledStringAsBigInteger());
        System.out.println("Set if that track should not be used AS BigInteger === " + jMetaDataMenu.getDisabledStringAsBigInteger());
    }

   /**
    * Test getDisabledStringAsURL() method.
    */
    @Test
    public void subTestGetDisabledStringAsURL() {
        assertEquals(null, this.jMetaDataMenu.getDisabledStringAsURL());
        System.out.println("Set if that track should not be used AS URL === " + jMetaDataMenu.getDisabledStringAsURL());
    }

   /**
    * Test getDefaultAsInteger() method.
    */
    @Test
    public void subTestGetDefaultAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getDefaultAsInteger());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS Integer === " + jMetaDataMenu.getDefaultAsInteger());
    }

   /**
    * Test getDefaultAsLong() method.
    */
    @Test
    public void subTestGetDefaultAsLong() {
        assertEquals(null, this.jMetaDataMenu.getDefaultAsLong());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS Long === " + jMetaDataMenu.getDefaultAsLong());
    }

   /**
    * Test getDefaultAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDefaultAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getDefaultAsLocalDateTime());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS LocalDateTime === " + jMetaDataMenu.getDefaultAsLocalDateTime());
    }

   /**
    * Test getDefaultAsLocalTime() method.
    */
    @Test
    public void subTestGetDefaultAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getDefaultAsLocalTime());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS LocalTime === " + jMetaDataMenu.getDefaultAsLocalTime());
    }

   /**
    * Test getDefaultAsString() method.
    */
    @Test
    public void subTestGetDefaultAsString() {
        assertEquals(null, this.jMetaDataMenu.getDefaultAsString());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS String === " + jMetaDataMenu.getDefaultAsString());
    }

   /**
    * Test getDefaultAsBoolean() method.
    */
    @Test
    public void subTestGetDefaultAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getDefaultAsBoolean());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS Boolean === " + jMetaDataMenu.getDefaultAsBoolean());
    }

   /**
    * Test getDefaultAsBigInteger() method.
    */
    @Test
    public void subTestGetDefaultAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getDefaultAsBigInteger());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS BigInteger === " + jMetaDataMenu.getDefaultAsBigInteger());
    }

   /**
    * Test getDefaultAsURL() method.
    */
    @Test
    public void subTestGetDefaultAsURL() {
        assertEquals(null, this.jMetaDataMenu.getDefaultAsURL());
        System.out.println("Set if that track should be used if no language found matches the user preference. AS URL === " + jMetaDataMenu.getDefaultAsURL());
    }

   /**
    * Test getMenuIDAsInteger() method.
    */
    @Test
    public void subTestGetMenuIDAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getMenuIDAsInteger());
        System.out.println("The menu ID for this stream in this file AS Integer === " + jMetaDataMenu.getMenuIDAsInteger());
    }

   /**
    * Test getMenuIDAsLong() method.
    */
    @Test
    public void subTestGetMenuIDAsLong() {
        assertEquals(null, this.jMetaDataMenu.getMenuIDAsLong());
        System.out.println("The menu ID for this stream in this file AS Long === " + jMetaDataMenu.getMenuIDAsLong());
    }

   /**
    * Test getMenuIDAsLocalDateTime() method.
    */
    @Test
    public void subTestGetMenuIDAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getMenuIDAsLocalDateTime());
        System.out.println("The menu ID for this stream in this file AS LocalDateTime === " + jMetaDataMenu.getMenuIDAsLocalDateTime());
    }

   /**
    * Test getMenuIDAsLocalTime() method.
    */
    @Test
    public void subTestGetMenuIDAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getMenuIDAsLocalTime());
        System.out.println("The menu ID for this stream in this file AS LocalTime === " + jMetaDataMenu.getMenuIDAsLocalTime());
    }

   /**
    * Test getMenuIDAsString() method.
    */
    @Test
    public void subTestGetMenuIDAsString() {
        assertEquals(null, this.jMetaDataMenu.getMenuIDAsString());
        System.out.println("The menu ID for this stream in this file AS String === " + jMetaDataMenu.getMenuIDAsString());
    }

   /**
    * Test getMenuIDAsBoolean() method.
    */
    @Test
    public void subTestGetMenuIDAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getMenuIDAsBoolean());
        System.out.println("The menu ID for this stream in this file AS Boolean === " + jMetaDataMenu.getMenuIDAsBoolean());
    }

   /**
    * Test getMenuIDAsBigInteger() method.
    */
    @Test
    public void subTestGetMenuIDAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getMenuIDAsBigInteger());
        System.out.println("The menu ID for this stream in this file AS BigInteger === " + jMetaDataMenu.getMenuIDAsBigInteger());
    }

   /**
    * Test getMenuIDAsURL() method.
    */
    @Test
    public void subTestGetMenuIDAsURL() {
        assertEquals(null, this.jMetaDataMenu.getMenuIDAsURL());
        System.out.println("The menu ID for this stream in this file AS URL === " + jMetaDataMenu.getMenuIDAsURL());
    }

   /**
    * Test getUniqueIDStringAsInteger() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getUniqueIDStringAsInteger());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS Integer === " + jMetaDataMenu.getUniqueIDStringAsInteger());
    }

   /**
    * Test getUniqueIDStringAsLong() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsLong() {
        assertEquals(null, this.jMetaDataMenu.getUniqueIDStringAsLong());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS Long === " + jMetaDataMenu.getUniqueIDStringAsLong());
    }

   /**
    * Test getUniqueIDStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getUniqueIDStringAsLocalDateTime());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS LocalDateTime === " + jMetaDataMenu.getUniqueIDStringAsLocalDateTime());
    }

   /**
    * Test getUniqueIDStringAsLocalTime() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getUniqueIDStringAsLocalTime());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS LocalTime === " + jMetaDataMenu.getUniqueIDStringAsLocalTime());
    }

   /**
    * Test getUniqueIDStringAsString() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsString() {
        assertEquals(null, this.jMetaDataMenu.getUniqueIDStringAsString());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS String === " + jMetaDataMenu.getUniqueIDStringAsString());
    }

   /**
    * Test getUniqueIDStringAsBoolean() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getUniqueIDStringAsBoolean());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS Boolean === " + jMetaDataMenu.getUniqueIDStringAsBoolean());
    }

   /**
    * Test getUniqueIDStringAsBigInteger() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getUniqueIDStringAsBigInteger());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS BigInteger === " + jMetaDataMenu.getUniqueIDStringAsBigInteger());
    }

   /**
    * Test getUniqueIDStringAsURL() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsURL() {
        assertEquals(null, this.jMetaDataMenu.getUniqueIDStringAsURL());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS URL === " + jMetaDataMenu.getUniqueIDStringAsURL());
    }

   /**
    * Test getFormatCommercialIfAnyAsInteger() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getFormatCommercialIfAnyAsInteger());
        System.out.println("Commercial name used by vendor for theses setings if there is one AS Integer === " + jMetaDataMenu.getFormatCommercialIfAnyAsInteger());
    }

   /**
    * Test getFormatCommercialIfAnyAsLong() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsLong() {
        assertEquals(null, this.jMetaDataMenu.getFormatCommercialIfAnyAsLong());
        System.out.println("Commercial name used by vendor for theses setings if there is one AS Long === " + jMetaDataMenu.getFormatCommercialIfAnyAsLong());
    }

   /**
    * Test getFormatCommercialIfAnyAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getFormatCommercialIfAnyAsLocalDateTime());
        System.out.println("Commercial name used by vendor for theses setings if there is one AS LocalDateTime === " + jMetaDataMenu.getFormatCommercialIfAnyAsLocalDateTime());
    }

   /**
    * Test getFormatCommercialIfAnyAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getFormatCommercialIfAnyAsLocalTime());
        System.out.println("Commercial name used by vendor for theses setings if there is one AS LocalTime === " + jMetaDataMenu.getFormatCommercialIfAnyAsLocalTime());
    }

   /**
    * Test getFormatCommercialIfAnyAsString() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsString() {
        assertEquals(null, this.jMetaDataMenu.getFormatCommercialIfAnyAsString());
        System.out.println("Commercial name used by vendor for theses setings if there is one AS String === " + jMetaDataMenu.getFormatCommercialIfAnyAsString());
    }

   /**
    * Test getFormatCommercialIfAnyAsBoolean() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getFormatCommercialIfAnyAsBoolean());
        System.out.println("Commercial name used by vendor for theses setings if there is one AS Boolean === " + jMetaDataMenu.getFormatCommercialIfAnyAsBoolean());
    }

   /**
    * Test getFormatCommercialIfAnyAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getFormatCommercialIfAnyAsBigInteger());
        System.out.println("Commercial name used by vendor for theses setings if there is one AS BigInteger === " + jMetaDataMenu.getFormatCommercialIfAnyAsBigInteger());
    }

   /**
    * Test getFormatCommercialIfAnyAsURL() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsURL() {
        assertEquals(null, this.jMetaDataMenu.getFormatCommercialIfAnyAsURL());
        System.out.println("Commercial name used by vendor for theses setings if there is one AS URL === " + jMetaDataMenu.getFormatCommercialIfAnyAsURL());
    }

   /**
    * Test getIDStringAsInteger() method.
    */
    @Test
    public void subTestGetIDStringAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getIDStringAsInteger());
        System.out.println("The ID for this stream in this file AS Integer === " + jMetaDataMenu.getIDStringAsInteger());
    }

   /**
    * Test getIDStringAsLong() method.
    */
    @Test
    public void subTestGetIDStringAsLong() {
        assertEquals(null, this.jMetaDataMenu.getIDStringAsLong());
        System.out.println("The ID for this stream in this file AS Long === " + jMetaDataMenu.getIDStringAsLong());
    }

   /**
    * Test getIDStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetIDStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getIDStringAsLocalDateTime());
        System.out.println("The ID for this stream in this file AS LocalDateTime === " + jMetaDataMenu.getIDStringAsLocalDateTime());
    }

   /**
    * Test getIDStringAsLocalTime() method.
    */
    @Test
    public void subTestGetIDStringAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getIDStringAsLocalTime());
        System.out.println("The ID for this stream in this file AS LocalTime === " + jMetaDataMenu.getIDStringAsLocalTime());
    }

   /**
    * Test getIDStringAsString() method.
    */
    @Test
    public void subTestGetIDStringAsString() {
        assertEquals(null, this.jMetaDataMenu.getIDStringAsString());
        System.out.println("The ID for this stream in this file AS String === " + jMetaDataMenu.getIDStringAsString());
    }

   /**
    * Test getIDStringAsBoolean() method.
    */
    @Test
    public void subTestGetIDStringAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getIDStringAsBoolean());
        System.out.println("The ID for this stream in this file AS Boolean === " + jMetaDataMenu.getIDStringAsBoolean());
    }

   /**
    * Test getIDStringAsBigInteger() method.
    */
    @Test
    public void subTestGetIDStringAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getIDStringAsBigInteger());
        System.out.println("The ID for this stream in this file AS BigInteger === " + jMetaDataMenu.getIDStringAsBigInteger());
    }

   /**
    * Test getIDStringAsURL() method.
    */
    @Test
    public void subTestGetIDStringAsURL() {
        assertEquals(null, this.jMetaDataMenu.getIDStringAsURL());
        System.out.println("The ID for this stream in this file AS URL === " + jMetaDataMenu.getIDStringAsURL());
    }

   /**
    * Test getAlternateGroupStringAsInteger() method.
    */
    @Test
    public void subTestGetAlternateGroupStringAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getAlternateGroupStringAsInteger());
        System.out.println("Number of a group in order to provide versions of the same track AS Integer === " + jMetaDataMenu.getAlternateGroupStringAsInteger());
    }

   /**
    * Test getAlternateGroupStringAsLong() method.
    */
    @Test
    public void subTestGetAlternateGroupStringAsLong() {
        assertEquals(null, this.jMetaDataMenu.getAlternateGroupStringAsLong());
        System.out.println("Number of a group in order to provide versions of the same track AS Long === " + jMetaDataMenu.getAlternateGroupStringAsLong());
    }

   /**
    * Test getAlternateGroupStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetAlternateGroupStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getAlternateGroupStringAsLocalDateTime());
        System.out.println("Number of a group in order to provide versions of the same track AS LocalDateTime === " + jMetaDataMenu.getAlternateGroupStringAsLocalDateTime());
    }

   /**
    * Test getAlternateGroupStringAsLocalTime() method.
    */
    @Test
    public void subTestGetAlternateGroupStringAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getAlternateGroupStringAsLocalTime());
        System.out.println("Number of a group in order to provide versions of the same track AS LocalTime === " + jMetaDataMenu.getAlternateGroupStringAsLocalTime());
    }

   /**
    * Test getAlternateGroupStringAsString() method.
    */
    @Test
    public void subTestGetAlternateGroupStringAsString() {
        assertEquals(null, this.jMetaDataMenu.getAlternateGroupStringAsString());
        System.out.println("Number of a group in order to provide versions of the same track AS String === " + jMetaDataMenu.getAlternateGroupStringAsString());
    }

   /**
    * Test getAlternateGroupStringAsBoolean() method.
    */
    @Test
    public void subTestGetAlternateGroupStringAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getAlternateGroupStringAsBoolean());
        System.out.println("Number of a group in order to provide versions of the same track AS Boolean === " + jMetaDataMenu.getAlternateGroupStringAsBoolean());
    }

   /**
    * Test getAlternateGroupStringAsBigInteger() method.
    */
    @Test
    public void subTestGetAlternateGroupStringAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getAlternateGroupStringAsBigInteger());
        System.out.println("Number of a group in order to provide versions of the same track AS BigInteger === " + jMetaDataMenu.getAlternateGroupStringAsBigInteger());
    }

   /**
    * Test getAlternateGroupStringAsURL() method.
    */
    @Test
    public void subTestGetAlternateGroupStringAsURL() {
        assertEquals(null, this.jMetaDataMenu.getAlternateGroupStringAsURL());
        System.out.println("Number of a group in order to provide versions of the same track AS URL === " + jMetaDataMenu.getAlternateGroupStringAsURL());
    }

   /**
    * Test getFormatProfileAsInteger() method.
    */
    @Test
    public void subTestGetFormatProfileAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getFormatProfileAsInteger());
        System.out.println("Profile of the Format AS Integer === " + jMetaDataMenu.getFormatProfileAsInteger());
    }

   /**
    * Test getFormatProfileAsLong() method.
    */
    @Test
    public void subTestGetFormatProfileAsLong() {
        assertEquals(null, this.jMetaDataMenu.getFormatProfileAsLong());
        System.out.println("Profile of the Format AS Long === " + jMetaDataMenu.getFormatProfileAsLong());
    }

   /**
    * Test getFormatProfileAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatProfileAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getFormatProfileAsLocalDateTime());
        System.out.println("Profile of the Format AS LocalDateTime === " + jMetaDataMenu.getFormatProfileAsLocalDateTime());
    }

   /**
    * Test getFormatProfileAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatProfileAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getFormatProfileAsLocalTime());
        System.out.println("Profile of the Format AS LocalTime === " + jMetaDataMenu.getFormatProfileAsLocalTime());
    }

   /**
    * Test getFormatProfileAsString() method.
    */
    @Test
    public void subTestGetFormatProfileAsString() {
        assertEquals(null, this.jMetaDataMenu.getFormatProfileAsString());
        System.out.println("Profile of the Format AS String === " + jMetaDataMenu.getFormatProfileAsString());
    }

   /**
    * Test getFormatProfileAsBoolean() method.
    */
    @Test
    public void subTestGetFormatProfileAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getFormatProfileAsBoolean());
        System.out.println("Profile of the Format AS Boolean === " + jMetaDataMenu.getFormatProfileAsBoolean());
    }

   /**
    * Test getFormatProfileAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatProfileAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getFormatProfileAsBigInteger());
        System.out.println("Profile of the Format AS BigInteger === " + jMetaDataMenu.getFormatProfileAsBigInteger());
    }

   /**
    * Test getFormatProfileAsURL() method.
    */
    @Test
    public void subTestGetFormatProfileAsURL() {
        assertEquals(null, this.jMetaDataMenu.getFormatProfileAsURL());
        System.out.println("Profile of the Format AS URL === " + jMetaDataMenu.getFormatProfileAsURL());
    }

   /**
    * Test getServiceChannelAsInteger() method.
    */
    @Test
    public void subTestGetServiceChannelAsInteger() {
        assertEquals(null, this.jMetaDataMenu.getServiceChannelAsInteger());
        System.out.println("ServiceChannel AS Integer === " + jMetaDataMenu.getServiceChannelAsInteger());
    }

   /**
    * Test getServiceChannelAsLong() method.
    */
    @Test
    public void subTestGetServiceChannelAsLong() {
        assertEquals(null, this.jMetaDataMenu.getServiceChannelAsLong());
        System.out.println("ServiceChannel AS Long === " + jMetaDataMenu.getServiceChannelAsLong());
    }

   /**
    * Test getServiceChannelAsLocalDateTime() method.
    */
    @Test
    public void subTestGetServiceChannelAsLocalDateTime() {
        assertEquals(null, this.jMetaDataMenu.getServiceChannelAsLocalDateTime());
        System.out.println("ServiceChannel AS LocalDateTime === " + jMetaDataMenu.getServiceChannelAsLocalDateTime());
    }

   /**
    * Test getServiceChannelAsLocalTime() method.
    */
    @Test
    public void subTestGetServiceChannelAsLocalTime() {
        assertEquals(null, this.jMetaDataMenu.getServiceChannelAsLocalTime());
        System.out.println("ServiceChannel AS LocalTime === " + jMetaDataMenu.getServiceChannelAsLocalTime());
    }

   /**
    * Test getServiceChannelAsString() method.
    */
    @Test
    public void subTestGetServiceChannelAsString() {
        assertEquals(null, this.jMetaDataMenu.getServiceChannelAsString());
        System.out.println("ServiceChannel AS String === " + jMetaDataMenu.getServiceChannelAsString());
    }

   /**
    * Test getServiceChannelAsBoolean() method.
    */
    @Test
    public void subTestGetServiceChannelAsBoolean() {
        assertEquals(null, this.jMetaDataMenu.getServiceChannelAsBoolean());
        System.out.println("ServiceChannel AS Boolean === " + jMetaDataMenu.getServiceChannelAsBoolean());
    }

   /**
    * Test getServiceChannelAsBigInteger() method.
    */
    @Test
    public void subTestGetServiceChannelAsBigInteger() {
        assertEquals(null, this.jMetaDataMenu.getServiceChannelAsBigInteger());
        System.out.println("ServiceChannel AS BigInteger === " + jMetaDataMenu.getServiceChannelAsBigInteger());
    }

   /**
    * Test getServiceChannelAsURL() method.
    */
    @Test
    public void subTestGetServiceChannelAsURL() {
        assertEquals(null, this.jMetaDataMenu.getServiceChannelAsURL());
        System.out.println("ServiceChannel AS URL === " + jMetaDataMenu.getServiceChannelAsURL());
    }

}
