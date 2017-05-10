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
import aka.jmetadata.main.JMetaDataGeneral;

/**
 * This class contains tests methods for General informations of a specific General stream.
 *
 * @author Welle Charlotte
 */
public final class JMetaDataGeneral_Test {

    private static @NonNull final Logger LOGGER = Logger.getLogger(JMetaDataGeneral_Test.class.getName());

    private static JMetaDataGeneral jMetaDataGeneral;
    private static JMetaData jMetaData;

    /**
     * Initialize test.
     */
    @BeforeClass
    public static void beforeUnit() {
        try {
            jMetaData = new JMetaData();
            final ClassLoader classLoader = JMetaDataGeneral_Test.class.getClassLoader();
            final File file = new File(classLoader.getResource("somefile").getFile());
            jMetaData.open(file);
            jMetaDataGeneral = null;
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
    * Test getLCCNAsInteger() method.
    */
    @Test
    public void subTestGetLCCNAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getLCCNAsInteger());
        System.out.println("Library of Congress Control Number. AS Integer === " + jMetaDataGeneral.getLCCNAsInteger());
    }

   /**
    * Test getLCCNAsLong() method.
    */
    @Test
    public void subTestGetLCCNAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getLCCNAsLong());
        System.out.println("Library of Congress Control Number. AS Long === " + jMetaDataGeneral.getLCCNAsLong());
    }

   /**
    * Test getLCCNAsLocalDateTime() method.
    */
    @Test
    public void subTestGetLCCNAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getLCCNAsLocalDateTime());
        System.out.println("Library of Congress Control Number. AS LocalDateTime === " + jMetaDataGeneral.getLCCNAsLocalDateTime());
    }

   /**
    * Test getLCCNAsLocalTime() method.
    */
    @Test
    public void subTestGetLCCNAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getLCCNAsLocalTime());
        System.out.println("Library of Congress Control Number. AS LocalTime === " + jMetaDataGeneral.getLCCNAsLocalTime());
    }

   /**
    * Test getLCCNAsString() method.
    */
    @Test
    public void subTestGetLCCNAsString() {
        assertEquals(null, this.jMetaDataGeneral.getLCCNAsString());
        System.out.println("Library of Congress Control Number. AS String === " + jMetaDataGeneral.getLCCNAsString());
    }

   /**
    * Test getLCCNAsBoolean() method.
    */
    @Test
    public void subTestGetLCCNAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getLCCNAsBoolean());
        System.out.println("Library of Congress Control Number. AS Boolean === " + jMetaDataGeneral.getLCCNAsBoolean());
    }

   /**
    * Test getLCCNAsBigInteger() method.
    */
    @Test
    public void subTestGetLCCNAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getLCCNAsBigInteger());
        System.out.println("Library of Congress Control Number. AS BigInteger === " + jMetaDataGeneral.getLCCNAsBigInteger());
    }

   /**
    * Test getLCCNAsURL() method.
    */
    @Test
    public void subTestGetLCCNAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getLCCNAsURL());
        System.out.println("Library of Congress Control Number. AS URL === " + jMetaDataGeneral.getLCCNAsURL());
    }

   /**
    * Test getOwnerAsInteger() method.
    */
    @Test
    public void subTestGetOwnerAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOwnerAsInteger());
        System.out.println("Owner of the file AS Integer === " + jMetaDataGeneral.getOwnerAsInteger());
    }

   /**
    * Test getOwnerAsLong() method.
    */
    @Test
    public void subTestGetOwnerAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getOwnerAsLong());
        System.out.println("Owner of the file AS Long === " + jMetaDataGeneral.getOwnerAsLong());
    }

   /**
    * Test getOwnerAsLocalDateTime() method.
    */
    @Test
    public void subTestGetOwnerAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getOwnerAsLocalDateTime());
        System.out.println("Owner of the file AS LocalDateTime === " + jMetaDataGeneral.getOwnerAsLocalDateTime());
    }

   /**
    * Test getOwnerAsLocalTime() method.
    */
    @Test
    public void subTestGetOwnerAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getOwnerAsLocalTime());
        System.out.println("Owner of the file AS LocalTime === " + jMetaDataGeneral.getOwnerAsLocalTime());
    }

   /**
    * Test getOwnerAsString() method.
    */
    @Test
    public void subTestGetOwnerAsString() {
        assertEquals(null, this.jMetaDataGeneral.getOwnerAsString());
        System.out.println("Owner of the file AS String === " + jMetaDataGeneral.getOwnerAsString());
    }

   /**
    * Test getOwnerAsBoolean() method.
    */
    @Test
    public void subTestGetOwnerAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getOwnerAsBoolean());
        System.out.println("Owner of the file AS Boolean === " + jMetaDataGeneral.getOwnerAsBoolean());
    }

   /**
    * Test getOwnerAsBigInteger() method.
    */
    @Test
    public void subTestGetOwnerAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOwnerAsBigInteger());
        System.out.println("Owner of the file AS BigInteger === " + jMetaDataGeneral.getOwnerAsBigInteger());
    }

   /**
    * Test getOwnerAsURL() method.
    */
    @Test
    public void subTestGetOwnerAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getOwnerAsURL());
        System.out.println("Owner of the file AS URL === " + jMetaDataGeneral.getOwnerAsURL());
    }

   /**
    * Test getNetworkNameAsInteger() method.
    */
    @Test
    public void subTestGetNetworkNameAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getNetworkNameAsInteger());
        System.out.println("NetworkName AS Integer === " + jMetaDataGeneral.getNetworkNameAsInteger());
    }

   /**
    * Test getNetworkNameAsLong() method.
    */
    @Test
    public void subTestGetNetworkNameAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getNetworkNameAsLong());
        System.out.println("NetworkName AS Long === " + jMetaDataGeneral.getNetworkNameAsLong());
    }

   /**
    * Test getNetworkNameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetNetworkNameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getNetworkNameAsLocalDateTime());
        System.out.println("NetworkName AS LocalDateTime === " + jMetaDataGeneral.getNetworkNameAsLocalDateTime());
    }

   /**
    * Test getNetworkNameAsLocalTime() method.
    */
    @Test
    public void subTestGetNetworkNameAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getNetworkNameAsLocalTime());
        System.out.println("NetworkName AS LocalTime === " + jMetaDataGeneral.getNetworkNameAsLocalTime());
    }

   /**
    * Test getNetworkNameAsString() method.
    */
    @Test
    public void subTestGetNetworkNameAsString() {
        assertEquals(null, this.jMetaDataGeneral.getNetworkNameAsString());
        System.out.println("NetworkName AS String === " + jMetaDataGeneral.getNetworkNameAsString());
    }

   /**
    * Test getNetworkNameAsBoolean() method.
    */
    @Test
    public void subTestGetNetworkNameAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getNetworkNameAsBoolean());
        System.out.println("NetworkName AS Boolean === " + jMetaDataGeneral.getNetworkNameAsBoolean());
    }

   /**
    * Test getNetworkNameAsBigInteger() method.
    */
    @Test
    public void subTestGetNetworkNameAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getNetworkNameAsBigInteger());
        System.out.println("NetworkName AS BigInteger === " + jMetaDataGeneral.getNetworkNameAsBigInteger());
    }

   /**
    * Test getNetworkNameAsURL() method.
    */
    @Test
    public void subTestGetNetworkNameAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getNetworkNameAsURL());
        System.out.println("NetworkName AS URL === " + jMetaDataGeneral.getNetworkNameAsURL());
    }

   /**
    * Test getTextFormatListAsInteger() method.
    */
    @Test
    public void subTestGetTextFormatListAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getTextFormatListAsInteger());
        System.out.println("Text Codecs in this file, separated by / AS Integer === " + jMetaDataGeneral.getTextFormatListAsInteger());
    }

   /**
    * Test getTextFormatListAsLong() method.
    */
    @Test
    public void subTestGetTextFormatListAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getTextFormatListAsLong());
        System.out.println("Text Codecs in this file, separated by / AS Long === " + jMetaDataGeneral.getTextFormatListAsLong());
    }

   /**
    * Test getTextFormatListAsLocalDateTime() method.
    */
    @Test
    public void subTestGetTextFormatListAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getTextFormatListAsLocalDateTime());
        System.out.println("Text Codecs in this file, separated by / AS LocalDateTime === " + jMetaDataGeneral.getTextFormatListAsLocalDateTime());
    }

   /**
    * Test getTextFormatListAsLocalTime() method.
    */
    @Test
    public void subTestGetTextFormatListAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getTextFormatListAsLocalTime());
        System.out.println("Text Codecs in this file, separated by / AS LocalTime === " + jMetaDataGeneral.getTextFormatListAsLocalTime());
    }

   /**
    * Test getTextFormatListAsString() method.
    */
    @Test
    public void subTestGetTextFormatListAsString() {
        assertEquals(null, this.jMetaDataGeneral.getTextFormatListAsString());
        System.out.println("Text Codecs in this file, separated by / AS String === " + jMetaDataGeneral.getTextFormatListAsString());
    }

   /**
    * Test getTextFormatListAsBoolean() method.
    */
    @Test
    public void subTestGetTextFormatListAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getTextFormatListAsBoolean());
        System.out.println("Text Codecs in this file, separated by / AS Boolean === " + jMetaDataGeneral.getTextFormatListAsBoolean());
    }

   /**
    * Test getTextFormatListAsBigInteger() method.
    */
    @Test
    public void subTestGetTextFormatListAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getTextFormatListAsBigInteger());
        System.out.println("Text Codecs in this file, separated by / AS BigInteger === " + jMetaDataGeneral.getTextFormatListAsBigInteger());
    }

   /**
    * Test getTextFormatListAsURL() method.
    */
    @Test
    public void subTestGetTextFormatListAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getTextFormatListAsURL());
        System.out.println("Text Codecs in this file, separated by / AS URL === " + jMetaDataGeneral.getTextFormatListAsURL());
    }

   /**
    * Test getCompilationAsInteger() method.
    */
    @Test
    public void subTestGetCompilationAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCompilationAsInteger());
        System.out.println("iTunes compilation AS Integer === " + jMetaDataGeneral.getCompilationAsInteger());
    }

   /**
    * Test getCompilationAsLong() method.
    */
    @Test
    public void subTestGetCompilationAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getCompilationAsLong());
        System.out.println("iTunes compilation AS Long === " + jMetaDataGeneral.getCompilationAsLong());
    }

   /**
    * Test getCompilationAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCompilationAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getCompilationAsLocalDateTime());
        System.out.println("iTunes compilation AS LocalDateTime === " + jMetaDataGeneral.getCompilationAsLocalDateTime());
    }

   /**
    * Test getCompilationAsLocalTime() method.
    */
    @Test
    public void subTestGetCompilationAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getCompilationAsLocalTime());
        System.out.println("iTunes compilation AS LocalTime === " + jMetaDataGeneral.getCompilationAsLocalTime());
    }

   /**
    * Test getCompilationAsString() method.
    */
    @Test
    public void subTestGetCompilationAsString() {
        assertEquals(null, this.jMetaDataGeneral.getCompilationAsString());
        System.out.println("iTunes compilation AS String === " + jMetaDataGeneral.getCompilationAsString());
    }

   /**
    * Test getCompilationAsBoolean() method.
    */
    @Test
    public void subTestGetCompilationAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getCompilationAsBoolean());
        System.out.println("iTunes compilation AS Boolean === " + jMetaDataGeneral.getCompilationAsBoolean());
    }

   /**
    * Test getCompilationAsBigInteger() method.
    */
    @Test
    public void subTestGetCompilationAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCompilationAsBigInteger());
        System.out.println("iTunes compilation AS BigInteger === " + jMetaDataGeneral.getCompilationAsBigInteger());
    }

   /**
    * Test getCompilationAsURL() method.
    */
    @Test
    public void subTestGetCompilationAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getCompilationAsURL());
        System.out.println("iTunes compilation AS URL === " + jMetaDataGeneral.getCompilationAsURL());
    }

   /**
    * Test getStreamOrderAsInteger() method.
    */
    @Test
    public void subTestGetStreamOrderAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getStreamOrderAsInteger());
        System.out.println("Stream order in the file, whatever is the kind of stream (base=0) AS Integer === " + jMetaDataGeneral.getStreamOrderAsInteger());
    }

   /**
    * Test getStreamOrderAsLong() method.
    */
    @Test
    public void subTestGetStreamOrderAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getStreamOrderAsLong());
        System.out.println("Stream order in the file, whatever is the kind of stream (base=0) AS Long === " + jMetaDataGeneral.getStreamOrderAsLong());
    }

   /**
    * Test getStreamOrderAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamOrderAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getStreamOrderAsLocalDateTime());
        System.out.println("Stream order in the file, whatever is the kind of stream (base=0) AS LocalDateTime === " + jMetaDataGeneral.getStreamOrderAsLocalDateTime());
    }

   /**
    * Test getStreamOrderAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamOrderAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getStreamOrderAsLocalTime());
        System.out.println("Stream order in the file, whatever is the kind of stream (base=0) AS LocalTime === " + jMetaDataGeneral.getStreamOrderAsLocalTime());
    }

   /**
    * Test getStreamOrderAsString() method.
    */
    @Test
    public void subTestGetStreamOrderAsString() {
        assertEquals(null, this.jMetaDataGeneral.getStreamOrderAsString());
        System.out.println("Stream order in the file, whatever is the kind of stream (base=0) AS String === " + jMetaDataGeneral.getStreamOrderAsString());
    }

   /**
    * Test getStreamOrderAsBoolean() method.
    */
    @Test
    public void subTestGetStreamOrderAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getStreamOrderAsBoolean());
        System.out.println("Stream order in the file, whatever is the kind of stream (base=0) AS Boolean === " + jMetaDataGeneral.getStreamOrderAsBoolean());
    }

   /**
    * Test getStreamOrderAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamOrderAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getStreamOrderAsBigInteger());
        System.out.println("Stream order in the file, whatever is the kind of stream (base=0) AS BigInteger === " + jMetaDataGeneral.getStreamOrderAsBigInteger());
    }

   /**
    * Test getStreamOrderAsURL() method.
    */
    @Test
    public void subTestGetStreamOrderAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getStreamOrderAsURL());
        System.out.println("Stream order in the file, whatever is the kind of stream (base=0) AS URL === " + jMetaDataGeneral.getStreamOrderAsURL());
    }

   /**
    * Test getEncodedLibraryNameAsInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryNameAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryNameAsInteger());
        System.out.println("Name of the the encoding-software AS Integer === " + jMetaDataGeneral.getEncodedLibraryNameAsInteger());
    }

   /**
    * Test getEncodedLibraryNameAsLong() method.
    */
    @Test
    public void subTestGetEncodedLibraryNameAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryNameAsLong());
        System.out.println("Name of the the encoding-software AS Long === " + jMetaDataGeneral.getEncodedLibraryNameAsLong());
    }

   /**
    * Test getEncodedLibraryNameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryNameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryNameAsLocalDateTime());
        System.out.println("Name of the the encoding-software AS LocalDateTime === " + jMetaDataGeneral.getEncodedLibraryNameAsLocalDateTime());
    }

   /**
    * Test getEncodedLibraryNameAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryNameAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryNameAsLocalTime());
        System.out.println("Name of the the encoding-software AS LocalTime === " + jMetaDataGeneral.getEncodedLibraryNameAsLocalTime());
    }

   /**
    * Test getEncodedLibraryNameAsString() method.
    */
    @Test
    public void subTestGetEncodedLibraryNameAsString() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryNameAsString());
        System.out.println("Name of the the encoding-software AS String === " + jMetaDataGeneral.getEncodedLibraryNameAsString());
    }

   /**
    * Test getEncodedLibraryNameAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedLibraryNameAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryNameAsBoolean());
        System.out.println("Name of the the encoding-software AS Boolean === " + jMetaDataGeneral.getEncodedLibraryNameAsBoolean());
    }

   /**
    * Test getEncodedLibraryNameAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryNameAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryNameAsBigInteger());
        System.out.println("Name of the the encoding-software AS BigInteger === " + jMetaDataGeneral.getEncodedLibraryNameAsBigInteger());
    }

   /**
    * Test getEncodedLibraryNameAsURL() method.
    */
    @Test
    public void subTestGetEncodedLibraryNameAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryNameAsURL());
        System.out.println("Name of the the encoding-software AS URL === " + jMetaDataGeneral.getEncodedLibraryNameAsURL());
    }

   /**
    * Test getTitleMoreAsInteger() method.
    */
    @Test
    public void subTestGetTitleMoreAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getTitleMoreAsInteger());
        System.out.println("(Generic)More info about the title of file AS Integer === " + jMetaDataGeneral.getTitleMoreAsInteger());
    }

   /**
    * Test getTitleMoreAsLong() method.
    */
    @Test
    public void subTestGetTitleMoreAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getTitleMoreAsLong());
        System.out.println("(Generic)More info about the title of file AS Long === " + jMetaDataGeneral.getTitleMoreAsLong());
    }

   /**
    * Test getTitleMoreAsLocalDateTime() method.
    */
    @Test
    public void subTestGetTitleMoreAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getTitleMoreAsLocalDateTime());
        System.out.println("(Generic)More info about the title of file AS LocalDateTime === " + jMetaDataGeneral.getTitleMoreAsLocalDateTime());
    }

   /**
    * Test getTitleMoreAsLocalTime() method.
    */
    @Test
    public void subTestGetTitleMoreAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getTitleMoreAsLocalTime());
        System.out.println("(Generic)More info about the title of file AS LocalTime === " + jMetaDataGeneral.getTitleMoreAsLocalTime());
    }

   /**
    * Test getTitleMoreAsString() method.
    */
    @Test
    public void subTestGetTitleMoreAsString() {
        assertEquals(null, this.jMetaDataGeneral.getTitleMoreAsString());
        System.out.println("(Generic)More info about the title of file AS String === " + jMetaDataGeneral.getTitleMoreAsString());
    }

   /**
    * Test getTitleMoreAsBoolean() method.
    */
    @Test
    public void subTestGetTitleMoreAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getTitleMoreAsBoolean());
        System.out.println("(Generic)More info about the title of file AS Boolean === " + jMetaDataGeneral.getTitleMoreAsBoolean());
    }

   /**
    * Test getTitleMoreAsBigInteger() method.
    */
    @Test
    public void subTestGetTitleMoreAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getTitleMoreAsBigInteger());
        System.out.println("(Generic)More info about the title of file AS BigInteger === " + jMetaDataGeneral.getTitleMoreAsBigInteger());
    }

   /**
    * Test getTitleMoreAsURL() method.
    */
    @Test
    public void subTestGetTitleMoreAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getTitleMoreAsURL());
        System.out.println("(Generic)More info about the title of file AS URL === " + jMetaDataGeneral.getTitleMoreAsURL());
    }

   /**
    * Test getLightnessAsInteger() method.
    */
    @Test
    public void subTestGetLightnessAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getLightnessAsInteger());
        System.out.println("Describes the changes in lightness settings on the digitizer required to produce the file AS Integer === " + jMetaDataGeneral.getLightnessAsInteger());
    }

   /**
    * Test getLightnessAsLong() method.
    */
    @Test
    public void subTestGetLightnessAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getLightnessAsLong());
        System.out.println("Describes the changes in lightness settings on the digitizer required to produce the file AS Long === " + jMetaDataGeneral.getLightnessAsLong());
    }

   /**
    * Test getLightnessAsLocalDateTime() method.
    */
    @Test
    public void subTestGetLightnessAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getLightnessAsLocalDateTime());
        System.out.println("Describes the changes in lightness settings on the digitizer required to produce the file AS LocalDateTime === " + jMetaDataGeneral.getLightnessAsLocalDateTime());
    }

   /**
    * Test getLightnessAsLocalTime() method.
    */
    @Test
    public void subTestGetLightnessAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getLightnessAsLocalTime());
        System.out.println("Describes the changes in lightness settings on the digitizer required to produce the file AS LocalTime === " + jMetaDataGeneral.getLightnessAsLocalTime());
    }

   /**
    * Test getLightnessAsString() method.
    */
    @Test
    public void subTestGetLightnessAsString() {
        assertEquals(null, this.jMetaDataGeneral.getLightnessAsString());
        System.out.println("Describes the changes in lightness settings on the digitizer required to produce the file AS String === " + jMetaDataGeneral.getLightnessAsString());
    }

   /**
    * Test getLightnessAsBoolean() method.
    */
    @Test
    public void subTestGetLightnessAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getLightnessAsBoolean());
        System.out.println("Describes the changes in lightness settings on the digitizer required to produce the file AS Boolean === " + jMetaDataGeneral.getLightnessAsBoolean());
    }

   /**
    * Test getLightnessAsBigInteger() method.
    */
    @Test
    public void subTestGetLightnessAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getLightnessAsBigInteger());
        System.out.println("Describes the changes in lightness settings on the digitizer required to produce the file AS BigInteger === " + jMetaDataGeneral.getLightnessAsBigInteger());
    }

   /**
    * Test getLightnessAsURL() method.
    */
    @Test
    public void subTestGetLightnessAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getLightnessAsURL());
        System.out.println("Describes the changes in lightness settings on the digitizer required to produce the file AS URL === " + jMetaDataGeneral.getLightnessAsURL());
    }

   /**
    * Test getOriginalSourceFormSharpnessAsInteger() method.
    */
    @Test
    public void subTestGetOriginalSourceFormSharpnessAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormSharpnessAsInteger());
        System.out.println("Identifies the changes in sharpness for the digitizer requiered to produce the file AS Integer === " + jMetaDataGeneral.getOriginalSourceFormSharpnessAsInteger());
    }

   /**
    * Test getOriginalSourceFormSharpnessAsLong() method.
    */
    @Test
    public void subTestGetOriginalSourceFormSharpnessAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormSharpnessAsLong());
        System.out.println("Identifies the changes in sharpness for the digitizer requiered to produce the file AS Long === " + jMetaDataGeneral.getOriginalSourceFormSharpnessAsLong());
    }

   /**
    * Test getOriginalSourceFormSharpnessAsLocalDateTime() method.
    */
    @Test
    public void subTestGetOriginalSourceFormSharpnessAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormSharpnessAsLocalDateTime());
        System.out.println("Identifies the changes in sharpness for the digitizer requiered to produce the file AS LocalDateTime === " + jMetaDataGeneral.getOriginalSourceFormSharpnessAsLocalDateTime());
    }

   /**
    * Test getOriginalSourceFormSharpnessAsLocalTime() method.
    */
    @Test
    public void subTestGetOriginalSourceFormSharpnessAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormSharpnessAsLocalTime());
        System.out.println("Identifies the changes in sharpness for the digitizer requiered to produce the file AS LocalTime === " + jMetaDataGeneral.getOriginalSourceFormSharpnessAsLocalTime());
    }

   /**
    * Test getOriginalSourceFormSharpnessAsString() method.
    */
    @Test
    public void subTestGetOriginalSourceFormSharpnessAsString() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormSharpnessAsString());
        System.out.println("Identifies the changes in sharpness for the digitizer requiered to produce the file AS String === " + jMetaDataGeneral.getOriginalSourceFormSharpnessAsString());
    }

   /**
    * Test getOriginalSourceFormSharpnessAsBoolean() method.
    */
    @Test
    public void subTestGetOriginalSourceFormSharpnessAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormSharpnessAsBoolean());
        System.out.println("Identifies the changes in sharpness for the digitizer requiered to produce the file AS Boolean === " + jMetaDataGeneral.getOriginalSourceFormSharpnessAsBoolean());
    }

   /**
    * Test getOriginalSourceFormSharpnessAsBigInteger() method.
    */
    @Test
    public void subTestGetOriginalSourceFormSharpnessAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormSharpnessAsBigInteger());
        System.out.println("Identifies the changes in sharpness for the digitizer requiered to produce the file AS BigInteger === " + jMetaDataGeneral.getOriginalSourceFormSharpnessAsBigInteger());
    }

   /**
    * Test getOriginalSourceFormSharpnessAsURL() method.
    */
    @Test
    public void subTestGetOriginalSourceFormSharpnessAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormSharpnessAsURL());
        System.out.println("Identifies the changes in sharpness for the digitizer requiered to produce the file AS URL === " + jMetaDataGeneral.getOriginalSourceFormSharpnessAsURL());
    }

   /**
    * Test getFileExtensionAsInteger() method.
    */
    @Test
    public void subTestGetFileExtensionAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFileExtensionAsInteger());
        System.out.println("File extension only AS Integer === " + jMetaDataGeneral.getFileExtensionAsInteger());
    }

   /**
    * Test getFileExtensionAsLong() method.
    */
    @Test
    public void subTestGetFileExtensionAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getFileExtensionAsLong());
        System.out.println("File extension only AS Long === " + jMetaDataGeneral.getFileExtensionAsLong());
    }

   /**
    * Test getFileExtensionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFileExtensionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getFileExtensionAsLocalDateTime());
        System.out.println("File extension only AS LocalDateTime === " + jMetaDataGeneral.getFileExtensionAsLocalDateTime());
    }

   /**
    * Test getFileExtensionAsLocalTime() method.
    */
    @Test
    public void subTestGetFileExtensionAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getFileExtensionAsLocalTime());
        System.out.println("File extension only AS LocalTime === " + jMetaDataGeneral.getFileExtensionAsLocalTime());
    }

   /**
    * Test getFileExtensionAsString() method.
    */
    @Test
    public void subTestGetFileExtensionAsString() {
        assertEquals(null, this.jMetaDataGeneral.getFileExtensionAsString());
        System.out.println("File extension only AS String === " + jMetaDataGeneral.getFileExtensionAsString());
    }

   /**
    * Test getFileExtensionAsBoolean() method.
    */
    @Test
    public void subTestGetFileExtensionAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getFileExtensionAsBoolean());
        System.out.println("File extension only AS Boolean === " + jMetaDataGeneral.getFileExtensionAsBoolean());
    }

   /**
    * Test getFileExtensionAsBigInteger() method.
    */
    @Test
    public void subTestGetFileExtensionAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFileExtensionAsBigInteger());
        System.out.println("File extension only AS BigInteger === " + jMetaDataGeneral.getFileExtensionAsBigInteger());
    }

   /**
    * Test getFileExtensionAsURL() method.
    */
    @Test
    public void subTestGetFileExtensionAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getFileExtensionAsURL());
        System.out.println("File extension only AS URL === " + jMetaDataGeneral.getFileExtensionAsURL());
    }

   /**
    * Test getActorAsInteger() method.
    */
    @Test
    public void subTestGetActorAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getActorAsInteger());
        System.out.println("Real name of an actor or actress playing a role in the movie. AS Integer === " + jMetaDataGeneral.getActorAsInteger());
    }

   /**
    * Test getActorAsLong() method.
    */
    @Test
    public void subTestGetActorAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getActorAsLong());
        System.out.println("Real name of an actor or actress playing a role in the movie. AS Long === " + jMetaDataGeneral.getActorAsLong());
    }

   /**
    * Test getActorAsLocalDateTime() method.
    */
    @Test
    public void subTestGetActorAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getActorAsLocalDateTime());
        System.out.println("Real name of an actor or actress playing a role in the movie. AS LocalDateTime === " + jMetaDataGeneral.getActorAsLocalDateTime());
    }

   /**
    * Test getActorAsLocalTime() method.
    */
    @Test
    public void subTestGetActorAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getActorAsLocalTime());
        System.out.println("Real name of an actor or actress playing a role in the movie. AS LocalTime === " + jMetaDataGeneral.getActorAsLocalTime());
    }

   /**
    * Test getActorAsString() method.
    */
    @Test
    public void subTestGetActorAsString() {
        assertEquals(null, this.jMetaDataGeneral.getActorAsString());
        System.out.println("Real name of an actor or actress playing a role in the movie. AS String === " + jMetaDataGeneral.getActorAsString());
    }

   /**
    * Test getActorAsBoolean() method.
    */
    @Test
    public void subTestGetActorAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getActorAsBoolean());
        System.out.println("Real name of an actor or actress playing a role in the movie. AS Boolean === " + jMetaDataGeneral.getActorAsBoolean());
    }

   /**
    * Test getActorAsBigInteger() method.
    */
    @Test
    public void subTestGetActorAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getActorAsBigInteger());
        System.out.println("Real name of an actor or actress playing a role in the movie. AS BigInteger === " + jMetaDataGeneral.getActorAsBigInteger());
    }

   /**
    * Test getActorAsURL() method.
    */
    @Test
    public void subTestGetActorAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getActorAsURL());
        System.out.println("Real name of an actor or actress playing a role in the movie. AS URL === " + jMetaDataGeneral.getActorAsURL());
    }

   /**
    * Test getCommissionedByAsInteger() method.
    */
    @Test
    public void subTestGetCommissionedByAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCommissionedByAsInteger());
        System.out.println("name of the person or organization that commissioned the subject of the file AS Integer === " + jMetaDataGeneral.getCommissionedByAsInteger());
    }

   /**
    * Test getCommissionedByAsLong() method.
    */
    @Test
    public void subTestGetCommissionedByAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getCommissionedByAsLong());
        System.out.println("name of the person or organization that commissioned the subject of the file AS Long === " + jMetaDataGeneral.getCommissionedByAsLong());
    }

   /**
    * Test getCommissionedByAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCommissionedByAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getCommissionedByAsLocalDateTime());
        System.out.println("name of the person or organization that commissioned the subject of the file AS LocalDateTime === " + jMetaDataGeneral.getCommissionedByAsLocalDateTime());
    }

   /**
    * Test getCommissionedByAsLocalTime() method.
    */
    @Test
    public void subTestGetCommissionedByAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getCommissionedByAsLocalTime());
        System.out.println("name of the person or organization that commissioned the subject of the file AS LocalTime === " + jMetaDataGeneral.getCommissionedByAsLocalTime());
    }

   /**
    * Test getCommissionedByAsString() method.
    */
    @Test
    public void subTestGetCommissionedByAsString() {
        assertEquals(null, this.jMetaDataGeneral.getCommissionedByAsString());
        System.out.println("name of the person or organization that commissioned the subject of the file AS String === " + jMetaDataGeneral.getCommissionedByAsString());
    }

   /**
    * Test getCommissionedByAsBoolean() method.
    */
    @Test
    public void subTestGetCommissionedByAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getCommissionedByAsBoolean());
        System.out.println("name of the person or organization that commissioned the subject of the file AS Boolean === " + jMetaDataGeneral.getCommissionedByAsBoolean());
    }

   /**
    * Test getCommissionedByAsBigInteger() method.
    */
    @Test
    public void subTestGetCommissionedByAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCommissionedByAsBigInteger());
        System.out.println("name of the person or organization that commissioned the subject of the file AS BigInteger === " + jMetaDataGeneral.getCommissionedByAsBigInteger());
    }

   /**
    * Test getCommissionedByAsURL() method.
    */
    @Test
    public void subTestGetCommissionedByAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getCommissionedByAsURL());
        System.out.println("name of the person or organization that commissioned the subject of the file AS URL === " + jMetaDataGeneral.getCommissionedByAsURL());
    }

   /**
    * Test getFormatCompressionAsInteger() method.
    */
    @Test
    public void subTestGetFormatCompressionAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFormatCompressionAsInteger());
        System.out.println("Compression method used AS Integer === " + jMetaDataGeneral.getFormatCompressionAsInteger());
    }

   /**
    * Test getFormatCompressionAsLong() method.
    */
    @Test
    public void subTestGetFormatCompressionAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getFormatCompressionAsLong());
        System.out.println("Compression method used AS Long === " + jMetaDataGeneral.getFormatCompressionAsLong());
    }

   /**
    * Test getFormatCompressionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatCompressionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getFormatCompressionAsLocalDateTime());
        System.out.println("Compression method used AS LocalDateTime === " + jMetaDataGeneral.getFormatCompressionAsLocalDateTime());
    }

   /**
    * Test getFormatCompressionAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatCompressionAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getFormatCompressionAsLocalTime());
        System.out.println("Compression method used AS LocalTime === " + jMetaDataGeneral.getFormatCompressionAsLocalTime());
    }

   /**
    * Test getFormatCompressionAsString() method.
    */
    @Test
    public void subTestGetFormatCompressionAsString() {
        assertEquals(null, this.jMetaDataGeneral.getFormatCompressionAsString());
        System.out.println("Compression method used AS String === " + jMetaDataGeneral.getFormatCompressionAsString());
    }

   /**
    * Test getFormatCompressionAsBoolean() method.
    */
    @Test
    public void subTestGetFormatCompressionAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getFormatCompressionAsBoolean());
        System.out.println("Compression method used AS Boolean === " + jMetaDataGeneral.getFormatCompressionAsBoolean());
    }

   /**
    * Test getFormatCompressionAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatCompressionAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFormatCompressionAsBigInteger());
        System.out.println("Compression method used AS BigInteger === " + jMetaDataGeneral.getFormatCompressionAsBigInteger());
    }

   /**
    * Test getFormatCompressionAsURL() method.
    */
    @Test
    public void subTestGetFormatCompressionAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getFormatCompressionAsURL());
        System.out.println("Compression method used AS URL === " + jMetaDataGeneral.getFormatCompressionAsURL());
    }

   /**
    * Test getAccompanimentAsInteger() method.
    */
    @Test
    public void subTestGetAccompanimentAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getAccompanimentAsInteger());
        System.out.println("Band/orchestra/accompaniment/musician. AS Integer === " + jMetaDataGeneral.getAccompanimentAsInteger());
    }

   /**
    * Test getAccompanimentAsLong() method.
    */
    @Test
    public void subTestGetAccompanimentAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getAccompanimentAsLong());
        System.out.println("Band/orchestra/accompaniment/musician. AS Long === " + jMetaDataGeneral.getAccompanimentAsLong());
    }

   /**
    * Test getAccompanimentAsLocalDateTime() method.
    */
    @Test
    public void subTestGetAccompanimentAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getAccompanimentAsLocalDateTime());
        System.out.println("Band/orchestra/accompaniment/musician. AS LocalDateTime === " + jMetaDataGeneral.getAccompanimentAsLocalDateTime());
    }

   /**
    * Test getAccompanimentAsLocalTime() method.
    */
    @Test
    public void subTestGetAccompanimentAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getAccompanimentAsLocalTime());
        System.out.println("Band/orchestra/accompaniment/musician. AS LocalTime === " + jMetaDataGeneral.getAccompanimentAsLocalTime());
    }

   /**
    * Test getAccompanimentAsString() method.
    */
    @Test
    public void subTestGetAccompanimentAsString() {
        assertEquals(null, this.jMetaDataGeneral.getAccompanimentAsString());
        System.out.println("Band/orchestra/accompaniment/musician. AS String === " + jMetaDataGeneral.getAccompanimentAsString());
    }

   /**
    * Test getAccompanimentAsBoolean() method.
    */
    @Test
    public void subTestGetAccompanimentAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getAccompanimentAsBoolean());
        System.out.println("Band/orchestra/accompaniment/musician. AS Boolean === " + jMetaDataGeneral.getAccompanimentAsBoolean());
    }

   /**
    * Test getAccompanimentAsBigInteger() method.
    */
    @Test
    public void subTestGetAccompanimentAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getAccompanimentAsBigInteger());
        System.out.println("Band/orchestra/accompaniment/musician. AS BigInteger === " + jMetaDataGeneral.getAccompanimentAsBigInteger());
    }

   /**
    * Test getAccompanimentAsURL() method.
    */
    @Test
    public void subTestGetAccompanimentAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getAccompanimentAsURL());
        System.out.println("Band/orchestra/accompaniment/musician. AS URL === " + jMetaDataGeneral.getAccompanimentAsURL());
    }

   /**
    * Test getCoverDataAsInteger() method.
    */
    @Test
    public void subTestGetCoverDataAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCoverDataAsInteger());
        System.out.println("Cover, in binary format encoded BASE64 AS Integer === " + jMetaDataGeneral.getCoverDataAsInteger());
    }

   /**
    * Test getCoverDataAsLong() method.
    */
    @Test
    public void subTestGetCoverDataAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getCoverDataAsLong());
        System.out.println("Cover, in binary format encoded BASE64 AS Long === " + jMetaDataGeneral.getCoverDataAsLong());
    }

   /**
    * Test getCoverDataAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCoverDataAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getCoverDataAsLocalDateTime());
        System.out.println("Cover, in binary format encoded BASE64 AS LocalDateTime === " + jMetaDataGeneral.getCoverDataAsLocalDateTime());
    }

   /**
    * Test getCoverDataAsLocalTime() method.
    */
    @Test
    public void subTestGetCoverDataAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getCoverDataAsLocalTime());
        System.out.println("Cover, in binary format encoded BASE64 AS LocalTime === " + jMetaDataGeneral.getCoverDataAsLocalTime());
    }

   /**
    * Test getCoverDataAsString() method.
    */
    @Test
    public void subTestGetCoverDataAsString() {
        assertEquals(null, this.jMetaDataGeneral.getCoverDataAsString());
        System.out.println("Cover, in binary format encoded BASE64 AS String === " + jMetaDataGeneral.getCoverDataAsString());
    }

   /**
    * Test getCoverDataAsBoolean() method.
    */
    @Test
    public void subTestGetCoverDataAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getCoverDataAsBoolean());
        System.out.println("Cover, in binary format encoded BASE64 AS Boolean === " + jMetaDataGeneral.getCoverDataAsBoolean());
    }

   /**
    * Test getCoverDataAsBigInteger() method.
    */
    @Test
    public void subTestGetCoverDataAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCoverDataAsBigInteger());
        System.out.println("Cover, in binary format encoded BASE64 AS BigInteger === " + jMetaDataGeneral.getCoverDataAsBigInteger());
    }

   /**
    * Test getCoverDataAsURL() method.
    */
    @Test
    public void subTestGetCoverDataAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getCoverDataAsURL());
        System.out.println("Cover, in binary format encoded BASE64 AS URL === " + jMetaDataGeneral.getCoverDataAsURL());
    }

   /**
    * Test getVideoFormatListAsInteger() method.
    */
    @Test
    public void subTestGetVideoFormatListAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getVideoFormatListAsInteger());
        System.out.println("Video Codecs in this file, separated by / AS Integer === " + jMetaDataGeneral.getVideoFormatListAsInteger());
    }

   /**
    * Test getVideoFormatListAsLong() method.
    */
    @Test
    public void subTestGetVideoFormatListAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getVideoFormatListAsLong());
        System.out.println("Video Codecs in this file, separated by / AS Long === " + jMetaDataGeneral.getVideoFormatListAsLong());
    }

   /**
    * Test getVideoFormatListAsLocalDateTime() method.
    */
    @Test
    public void subTestGetVideoFormatListAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getVideoFormatListAsLocalDateTime());
        System.out.println("Video Codecs in this file, separated by / AS LocalDateTime === " + jMetaDataGeneral.getVideoFormatListAsLocalDateTime());
    }

   /**
    * Test getVideoFormatListAsLocalTime() method.
    */
    @Test
    public void subTestGetVideoFormatListAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getVideoFormatListAsLocalTime());
        System.out.println("Video Codecs in this file, separated by / AS LocalTime === " + jMetaDataGeneral.getVideoFormatListAsLocalTime());
    }

   /**
    * Test getVideoFormatListAsString() method.
    */
    @Test
    public void subTestGetVideoFormatListAsString() {
        assertEquals(null, this.jMetaDataGeneral.getVideoFormatListAsString());
        System.out.println("Video Codecs in this file, separated by / AS String === " + jMetaDataGeneral.getVideoFormatListAsString());
    }

   /**
    * Test getVideoFormatListAsBoolean() method.
    */
    @Test
    public void subTestGetVideoFormatListAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getVideoFormatListAsBoolean());
        System.out.println("Video Codecs in this file, separated by / AS Boolean === " + jMetaDataGeneral.getVideoFormatListAsBoolean());
    }

   /**
    * Test getVideoFormatListAsBigInteger() method.
    */
    @Test
    public void subTestGetVideoFormatListAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getVideoFormatListAsBigInteger());
        System.out.println("Video Codecs in this file, separated by / AS BigInteger === " + jMetaDataGeneral.getVideoFormatListAsBigInteger());
    }

   /**
    * Test getVideoFormatListAsURL() method.
    */
    @Test
    public void subTestGetVideoFormatListAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getVideoFormatListAsURL());
        System.out.println("Video Codecs in this file, separated by / AS URL === " + jMetaDataGeneral.getVideoFormatListAsURL());
    }

   /**
    * Test getDelayStringAsInteger() method.
    */
    @Test
    public void subTestGetDelayStringAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDelayStringAsInteger());
        System.out.println("Delay with measurement AS Integer === " + jMetaDataGeneral.getDelayStringAsInteger());
    }

   /**
    * Test getDelayStringAsLong() method.
    */
    @Test
    public void subTestGetDelayStringAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getDelayStringAsLong());
        System.out.println("Delay with measurement AS Long === " + jMetaDataGeneral.getDelayStringAsLong());
    }

   /**
    * Test getDelayStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getDelayStringAsLocalDateTime());
        System.out.println("Delay with measurement AS LocalDateTime === " + jMetaDataGeneral.getDelayStringAsLocalDateTime());
    }

   /**
    * Test getDelayStringAsLocalTime() method.
    */
    @Test
    public void subTestGetDelayStringAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getDelayStringAsLocalTime());
        System.out.println("Delay with measurement AS LocalTime === " + jMetaDataGeneral.getDelayStringAsLocalTime());
    }

   /**
    * Test getDelayStringAsString() method.
    */
    @Test
    public void subTestGetDelayStringAsString() {
        assertEquals(null, this.jMetaDataGeneral.getDelayStringAsString());
        System.out.println("Delay with measurement AS String === " + jMetaDataGeneral.getDelayStringAsString());
    }

   /**
    * Test getDelayStringAsBoolean() method.
    */
    @Test
    public void subTestGetDelayStringAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getDelayStringAsBoolean());
        System.out.println("Delay with measurement AS Boolean === " + jMetaDataGeneral.getDelayStringAsBoolean());
    }

   /**
    * Test getDelayStringAsBigInteger() method.
    */
    @Test
    public void subTestGetDelayStringAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDelayStringAsBigInteger());
        System.out.println("Delay with measurement AS BigInteger === " + jMetaDataGeneral.getDelayStringAsBigInteger());
    }

   /**
    * Test getDelayStringAsURL() method.
    */
    @Test
    public void subTestGetDelayStringAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getDelayStringAsURL());
        System.out.println("Delay with measurement AS URL === " + jMetaDataGeneral.getDelayStringAsURL());
    }

   /**
    * Test getReleasedDateAsInteger() method.
    */
    @Test
    public void subTestGetReleasedDateAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getReleasedDateAsInteger());
        System.out.println("The date/year that the item was released. AS Integer === " + jMetaDataGeneral.getReleasedDateAsInteger());
    }

   /**
    * Test getReleasedDateAsLong() method.
    */
    @Test
    public void subTestGetReleasedDateAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getReleasedDateAsLong());
        System.out.println("The date/year that the item was released. AS Long === " + jMetaDataGeneral.getReleasedDateAsLong());
    }

   /**
    * Test getReleasedDateAsLocalDateTime() method.
    */
    @Test
    public void subTestGetReleasedDateAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getReleasedDateAsLocalDateTime());
        System.out.println("The date/year that the item was released. AS LocalDateTime === " + jMetaDataGeneral.getReleasedDateAsLocalDateTime());
    }

   /**
    * Test getReleasedDateAsLocalTime() method.
    */
    @Test
    public void subTestGetReleasedDateAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getReleasedDateAsLocalTime());
        System.out.println("The date/year that the item was released. AS LocalTime === " + jMetaDataGeneral.getReleasedDateAsLocalTime());
    }

   /**
    * Test getReleasedDateAsString() method.
    */
    @Test
    public void subTestGetReleasedDateAsString() {
        assertEquals(null, this.jMetaDataGeneral.getReleasedDateAsString());
        System.out.println("The date/year that the item was released. AS String === " + jMetaDataGeneral.getReleasedDateAsString());
    }

   /**
    * Test getReleasedDateAsBoolean() method.
    */
    @Test
    public void subTestGetReleasedDateAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getReleasedDateAsBoolean());
        System.out.println("The date/year that the item was released. AS Boolean === " + jMetaDataGeneral.getReleasedDateAsBoolean());
    }

   /**
    * Test getReleasedDateAsBigInteger() method.
    */
    @Test
    public void subTestGetReleasedDateAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getReleasedDateAsBigInteger());
        System.out.println("The date/year that the item was released. AS BigInteger === " + jMetaDataGeneral.getReleasedDateAsBigInteger());
    }

   /**
    * Test getReleasedDateAsURL() method.
    */
    @Test
    public void subTestGetReleasedDateAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getReleasedDateAsURL());
        System.out.println("The date/year that the item was released. AS URL === " + jMetaDataGeneral.getReleasedDateAsURL());
    }

   /**
    * Test getCodecIDDescriptionAsInteger() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDDescriptionAsInteger());
        System.out.println("Manual description given by the container AS Integer === " + jMetaDataGeneral.getCodecIDDescriptionAsInteger());
    }

   /**
    * Test getCodecIDDescriptionAsLong() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDDescriptionAsLong());
        System.out.println("Manual description given by the container AS Long === " + jMetaDataGeneral.getCodecIDDescriptionAsLong());
    }

   /**
    * Test getCodecIDDescriptionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDDescriptionAsLocalDateTime());
        System.out.println("Manual description given by the container AS LocalDateTime === " + jMetaDataGeneral.getCodecIDDescriptionAsLocalDateTime());
    }

   /**
    * Test getCodecIDDescriptionAsLocalTime() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDDescriptionAsLocalTime());
        System.out.println("Manual description given by the container AS LocalTime === " + jMetaDataGeneral.getCodecIDDescriptionAsLocalTime());
    }

   /**
    * Test getCodecIDDescriptionAsString() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsString() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDDescriptionAsString());
        System.out.println("Manual description given by the container AS String === " + jMetaDataGeneral.getCodecIDDescriptionAsString());
    }

   /**
    * Test getCodecIDDescriptionAsBoolean() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDDescriptionAsBoolean());
        System.out.println("Manual description given by the container AS Boolean === " + jMetaDataGeneral.getCodecIDDescriptionAsBoolean());
    }

   /**
    * Test getCodecIDDescriptionAsBigInteger() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDDescriptionAsBigInteger());
        System.out.println("Manual description given by the container AS BigInteger === " + jMetaDataGeneral.getCodecIDDescriptionAsBigInteger());
    }

   /**
    * Test getCodecIDDescriptionAsURL() method.
    */
    @Test
    public void subTestGetCodecIDDescriptionAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDDescriptionAsURL());
        System.out.println("Manual description given by the container AS URL === " + jMetaDataGeneral.getCodecIDDescriptionAsURL());
    }

   /**
    * Test getStatusAsInteger() method.
    */
    @Test
    public void subTestGetStatusAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getStatusAsInteger());
        System.out.println("bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished) AS Integer === " + jMetaDataGeneral.getStatusAsInteger());
    }

   /**
    * Test getStatusAsLong() method.
    */
    @Test
    public void subTestGetStatusAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getStatusAsLong());
        System.out.println("bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished) AS Long === " + jMetaDataGeneral.getStatusAsLong());
    }

   /**
    * Test getStatusAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStatusAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getStatusAsLocalDateTime());
        System.out.println("bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished) AS LocalDateTime === " + jMetaDataGeneral.getStatusAsLocalDateTime());
    }

   /**
    * Test getStatusAsLocalTime() method.
    */
    @Test
    public void subTestGetStatusAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getStatusAsLocalTime());
        System.out.println("bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished) AS LocalTime === " + jMetaDataGeneral.getStatusAsLocalTime());
    }

   /**
    * Test getStatusAsString() method.
    */
    @Test
    public void subTestGetStatusAsString() {
        assertEquals(null, this.jMetaDataGeneral.getStatusAsString());
        System.out.println("bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished) AS String === " + jMetaDataGeneral.getStatusAsString());
    }

   /**
    * Test getStatusAsBoolean() method.
    */
    @Test
    public void subTestGetStatusAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getStatusAsBoolean());
        System.out.println("bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished) AS Boolean === " + jMetaDataGeneral.getStatusAsBoolean());
    }

   /**
    * Test getStatusAsBigInteger() method.
    */
    @Test
    public void subTestGetStatusAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getStatusAsBigInteger());
        System.out.println("bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished) AS BigInteger === " + jMetaDataGeneral.getStatusAsBigInteger());
    }

   /**
    * Test getStatusAsURL() method.
    */
    @Test
    public void subTestGetStatusAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getStatusAsURL());
        System.out.println("bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished) AS URL === " + jMetaDataGeneral.getStatusAsURL());
    }

   /**
    * Test getFileSizeString2AsInteger() method.
    */
    @Test
    public void subTestGetFileSizeString2AsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeString2AsInteger());
        System.out.println("File size (with measure, 2 digit mini) AS Integer === " + jMetaDataGeneral.getFileSizeString2AsInteger());
    }

   /**
    * Test getFileSizeString2AsLong() method.
    */
    @Test
    public void subTestGetFileSizeString2AsLong() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeString2AsLong());
        System.out.println("File size (with measure, 2 digit mini) AS Long === " + jMetaDataGeneral.getFileSizeString2AsLong());
    }

   /**
    * Test getFileSizeString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetFileSizeString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeString2AsLocalDateTime());
        System.out.println("File size (with measure, 2 digit mini) AS LocalDateTime === " + jMetaDataGeneral.getFileSizeString2AsLocalDateTime());
    }

   /**
    * Test getFileSizeString2AsLocalTime() method.
    */
    @Test
    public void subTestGetFileSizeString2AsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeString2AsLocalTime());
        System.out.println("File size (with measure, 2 digit mini) AS LocalTime === " + jMetaDataGeneral.getFileSizeString2AsLocalTime());
    }

   /**
    * Test getFileSizeString2AsString() method.
    */
    @Test
    public void subTestGetFileSizeString2AsString() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeString2AsString());
        System.out.println("File size (with measure, 2 digit mini) AS String === " + jMetaDataGeneral.getFileSizeString2AsString());
    }

   /**
    * Test getFileSizeString2AsBoolean() method.
    */
    @Test
    public void subTestGetFileSizeString2AsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeString2AsBoolean());
        System.out.println("File size (with measure, 2 digit mini) AS Boolean === " + jMetaDataGeneral.getFileSizeString2AsBoolean());
    }

   /**
    * Test getFileSizeString2AsBigInteger() method.
    */
    @Test
    public void subTestGetFileSizeString2AsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeString2AsBigInteger());
        System.out.println("File size (with measure, 2 digit mini) AS BigInteger === " + jMetaDataGeneral.getFileSizeString2AsBigInteger());
    }

   /**
    * Test getFileSizeString2AsURL() method.
    */
    @Test
    public void subTestGetFileSizeString2AsURL() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeString2AsURL());
        System.out.println("File size (with measure, 2 digit mini) AS URL === " + jMetaDataGeneral.getFileSizeString2AsURL());
    }

   /**
    * Test getOriginalTrackAsInteger() method.
    */
    @Test
    public void subTestGetOriginalTrackAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalTrackAsInteger());
        System.out.println("Original name of the track in the original support AS Integer === " + jMetaDataGeneral.getOriginalTrackAsInteger());
    }

   /**
    * Test getOriginalTrackAsLong() method.
    */
    @Test
    public void subTestGetOriginalTrackAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalTrackAsLong());
        System.out.println("Original name of the track in the original support AS Long === " + jMetaDataGeneral.getOriginalTrackAsLong());
    }

   /**
    * Test getOriginalTrackAsLocalDateTime() method.
    */
    @Test
    public void subTestGetOriginalTrackAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalTrackAsLocalDateTime());
        System.out.println("Original name of the track in the original support AS LocalDateTime === " + jMetaDataGeneral.getOriginalTrackAsLocalDateTime());
    }

   /**
    * Test getOriginalTrackAsLocalTime() method.
    */
    @Test
    public void subTestGetOriginalTrackAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalTrackAsLocalTime());
        System.out.println("Original name of the track in the original support AS LocalTime === " + jMetaDataGeneral.getOriginalTrackAsLocalTime());
    }

   /**
    * Test getOriginalTrackAsString() method.
    */
    @Test
    public void subTestGetOriginalTrackAsString() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalTrackAsString());
        System.out.println("Original name of the track in the original support AS String === " + jMetaDataGeneral.getOriginalTrackAsString());
    }

   /**
    * Test getOriginalTrackAsBoolean() method.
    */
    @Test
    public void subTestGetOriginalTrackAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalTrackAsBoolean());
        System.out.println("Original name of the track in the original support AS Boolean === " + jMetaDataGeneral.getOriginalTrackAsBoolean());
    }

   /**
    * Test getOriginalTrackAsBigInteger() method.
    */
    @Test
    public void subTestGetOriginalTrackAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalTrackAsBigInteger());
        System.out.println("Original name of the track in the original support AS BigInteger === " + jMetaDataGeneral.getOriginalTrackAsBigInteger());
    }

   /**
    * Test getOriginalTrackAsURL() method.
    */
    @Test
    public void subTestGetOriginalTrackAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalTrackAsURL());
        System.out.println("Original name of the track in the original support AS URL === " + jMetaDataGeneral.getOriginalTrackAsURL());
    }

   /**
    * Test getPodcastCategoryAsInteger() method.
    */
    @Test
    public void subTestGetPodcastCategoryAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getPodcastCategoryAsInteger());
        System.out.println("Podcast category AS Integer === " + jMetaDataGeneral.getPodcastCategoryAsInteger());
    }

   /**
    * Test getPodcastCategoryAsLong() method.
    */
    @Test
    public void subTestGetPodcastCategoryAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getPodcastCategoryAsLong());
        System.out.println("Podcast category AS Long === " + jMetaDataGeneral.getPodcastCategoryAsLong());
    }

   /**
    * Test getPodcastCategoryAsLocalDateTime() method.
    */
    @Test
    public void subTestGetPodcastCategoryAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getPodcastCategoryAsLocalDateTime());
        System.out.println("Podcast category AS LocalDateTime === " + jMetaDataGeneral.getPodcastCategoryAsLocalDateTime());
    }

   /**
    * Test getPodcastCategoryAsLocalTime() method.
    */
    @Test
    public void subTestGetPodcastCategoryAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getPodcastCategoryAsLocalTime());
        System.out.println("Podcast category AS LocalTime === " + jMetaDataGeneral.getPodcastCategoryAsLocalTime());
    }

   /**
    * Test getPodcastCategoryAsString() method.
    */
    @Test
    public void subTestGetPodcastCategoryAsString() {
        assertEquals(null, this.jMetaDataGeneral.getPodcastCategoryAsString());
        System.out.println("Podcast category AS String === " + jMetaDataGeneral.getPodcastCategoryAsString());
    }

   /**
    * Test getPodcastCategoryAsBoolean() method.
    */
    @Test
    public void subTestGetPodcastCategoryAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getPodcastCategoryAsBoolean());
        System.out.println("Podcast category AS Boolean === " + jMetaDataGeneral.getPodcastCategoryAsBoolean());
    }

   /**
    * Test getPodcastCategoryAsBigInteger() method.
    */
    @Test
    public void subTestGetPodcastCategoryAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getPodcastCategoryAsBigInteger());
        System.out.println("Podcast category AS BigInteger === " + jMetaDataGeneral.getPodcastCategoryAsBigInteger());
    }

   /**
    * Test getPodcastCategoryAsURL() method.
    */
    @Test
    public void subTestGetPodcastCategoryAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getPodcastCategoryAsURL());
        System.out.println("Podcast category AS URL === " + jMetaDataGeneral.getPodcastCategoryAsURL());
    }

   /**
    * Test getFileSizeString1AsInteger() method.
    */
    @Test
    public void subTestGetFileSizeString1AsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeString1AsInteger());
        System.out.println("File size (with measure, 1 digit mini) AS Integer === " + jMetaDataGeneral.getFileSizeString1AsInteger());
    }

   /**
    * Test getFileSizeString1AsLong() method.
    */
    @Test
    public void subTestGetFileSizeString1AsLong() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeString1AsLong());
        System.out.println("File size (with measure, 1 digit mini) AS Long === " + jMetaDataGeneral.getFileSizeString1AsLong());
    }

   /**
    * Test getFileSizeString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetFileSizeString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeString1AsLocalDateTime());
        System.out.println("File size (with measure, 1 digit mini) AS LocalDateTime === " + jMetaDataGeneral.getFileSizeString1AsLocalDateTime());
    }

   /**
    * Test getFileSizeString1AsLocalTime() method.
    */
    @Test
    public void subTestGetFileSizeString1AsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeString1AsLocalTime());
        System.out.println("File size (with measure, 1 digit mini) AS LocalTime === " + jMetaDataGeneral.getFileSizeString1AsLocalTime());
    }

   /**
    * Test getFileSizeString1AsString() method.
    */
    @Test
    public void subTestGetFileSizeString1AsString() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeString1AsString());
        System.out.println("File size (with measure, 1 digit mini) AS String === " + jMetaDataGeneral.getFileSizeString1AsString());
    }

   /**
    * Test getFileSizeString1AsBoolean() method.
    */
    @Test
    public void subTestGetFileSizeString1AsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeString1AsBoolean());
        System.out.println("File size (with measure, 1 digit mini) AS Boolean === " + jMetaDataGeneral.getFileSizeString1AsBoolean());
    }

   /**
    * Test getFileSizeString1AsBigInteger() method.
    */
    @Test
    public void subTestGetFileSizeString1AsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeString1AsBigInteger());
        System.out.println("File size (with measure, 1 digit mini) AS BigInteger === " + jMetaDataGeneral.getFileSizeString1AsBigInteger());
    }

   /**
    * Test getFileSizeString1AsURL() method.
    */
    @Test
    public void subTestGetFileSizeString1AsURL() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeString1AsURL());
        System.out.println("File size (with measure, 1 digit mini) AS URL === " + jMetaDataGeneral.getFileSizeString1AsURL());
    }

   /**
    * Test getFrameRateAsInteger() method.
    */
    @Test
    public void subTestGetFrameRateAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFrameRateAsInteger());
        System.out.println("Frames per second AS Integer === " + jMetaDataGeneral.getFrameRateAsInteger());
    }

   /**
    * Test getFrameRateAsLong() method.
    */
    @Test
    public void subTestGetFrameRateAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getFrameRateAsLong());
        System.out.println("Frames per second AS Long === " + jMetaDataGeneral.getFrameRateAsLong());
    }

   /**
    * Test getFrameRateAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFrameRateAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getFrameRateAsLocalDateTime());
        System.out.println("Frames per second AS LocalDateTime === " + jMetaDataGeneral.getFrameRateAsLocalDateTime());
    }

   /**
    * Test getFrameRateAsLocalTime() method.
    */
    @Test
    public void subTestGetFrameRateAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getFrameRateAsLocalTime());
        System.out.println("Frames per second AS LocalTime === " + jMetaDataGeneral.getFrameRateAsLocalTime());
    }

   /**
    * Test getFrameRateAsString() method.
    */
    @Test
    public void subTestGetFrameRateAsString() {
        assertEquals(null, this.jMetaDataGeneral.getFrameRateAsString());
        System.out.println("Frames per second AS String === " + jMetaDataGeneral.getFrameRateAsString());
    }

   /**
    * Test getFrameRateAsBoolean() method.
    */
    @Test
    public void subTestGetFrameRateAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getFrameRateAsBoolean());
        System.out.println("Frames per second AS Boolean === " + jMetaDataGeneral.getFrameRateAsBoolean());
    }

   /**
    * Test getFrameRateAsBigInteger() method.
    */
    @Test
    public void subTestGetFrameRateAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFrameRateAsBigInteger());
        System.out.println("Frames per second AS BigInteger === " + jMetaDataGeneral.getFrameRateAsBigInteger());
    }

   /**
    * Test getFrameRateAsURL() method.
    */
    @Test
    public void subTestGetFrameRateAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getFrameRateAsURL());
        System.out.println("Frames per second AS URL === " + jMetaDataGeneral.getFrameRateAsURL());
    }

   /**
    * Test getTrackPositionAsInteger() method.
    */
    @Test
    public void subTestGetTrackPositionAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getTrackPositionAsInteger());
        System.out.println("Number of this track AS Integer === " + jMetaDataGeneral.getTrackPositionAsInteger());
    }

   /**
    * Test getTrackPositionAsLong() method.
    */
    @Test
    public void subTestGetTrackPositionAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getTrackPositionAsLong());
        System.out.println("Number of this track AS Long === " + jMetaDataGeneral.getTrackPositionAsLong());
    }

   /**
    * Test getTrackPositionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetTrackPositionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getTrackPositionAsLocalDateTime());
        System.out.println("Number of this track AS LocalDateTime === " + jMetaDataGeneral.getTrackPositionAsLocalDateTime());
    }

   /**
    * Test getTrackPositionAsLocalTime() method.
    */
    @Test
    public void subTestGetTrackPositionAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getTrackPositionAsLocalTime());
        System.out.println("Number of this track AS LocalTime === " + jMetaDataGeneral.getTrackPositionAsLocalTime());
    }

   /**
    * Test getTrackPositionAsString() method.
    */
    @Test
    public void subTestGetTrackPositionAsString() {
        assertEquals(null, this.jMetaDataGeneral.getTrackPositionAsString());
        System.out.println("Number of this track AS String === " + jMetaDataGeneral.getTrackPositionAsString());
    }

   /**
    * Test getTrackPositionAsBoolean() method.
    */
    @Test
    public void subTestGetTrackPositionAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getTrackPositionAsBoolean());
        System.out.println("Number of this track AS Boolean === " + jMetaDataGeneral.getTrackPositionAsBoolean());
    }

   /**
    * Test getTrackPositionAsBigInteger() method.
    */
    @Test
    public void subTestGetTrackPositionAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getTrackPositionAsBigInteger());
        System.out.println("Number of this track AS BigInteger === " + jMetaDataGeneral.getTrackPositionAsBigInteger());
    }

   /**
    * Test getTrackPositionAsURL() method.
    */
    @Test
    public void subTestGetTrackPositionAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getTrackPositionAsURL());
        System.out.println("Number of this track AS URL === " + jMetaDataGeneral.getTrackPositionAsURL());
    }

   /**
    * Test getAssistantDirectorAsInteger() method.
    */
    @Test
    public void subTestGetAssistantDirectorAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getAssistantDirectorAsInteger());
        System.out.println("Name of the assistant director. AS Integer === " + jMetaDataGeneral.getAssistantDirectorAsInteger());
    }

   /**
    * Test getAssistantDirectorAsLong() method.
    */
    @Test
    public void subTestGetAssistantDirectorAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getAssistantDirectorAsLong());
        System.out.println("Name of the assistant director. AS Long === " + jMetaDataGeneral.getAssistantDirectorAsLong());
    }

   /**
    * Test getAssistantDirectorAsLocalDateTime() method.
    */
    @Test
    public void subTestGetAssistantDirectorAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getAssistantDirectorAsLocalDateTime());
        System.out.println("Name of the assistant director. AS LocalDateTime === " + jMetaDataGeneral.getAssistantDirectorAsLocalDateTime());
    }

   /**
    * Test getAssistantDirectorAsLocalTime() method.
    */
    @Test
    public void subTestGetAssistantDirectorAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getAssistantDirectorAsLocalTime());
        System.out.println("Name of the assistant director. AS LocalTime === " + jMetaDataGeneral.getAssistantDirectorAsLocalTime());
    }

   /**
    * Test getAssistantDirectorAsString() method.
    */
    @Test
    public void subTestGetAssistantDirectorAsString() {
        assertEquals(null, this.jMetaDataGeneral.getAssistantDirectorAsString());
        System.out.println("Name of the assistant director. AS String === " + jMetaDataGeneral.getAssistantDirectorAsString());
    }

   /**
    * Test getAssistantDirectorAsBoolean() method.
    */
    @Test
    public void subTestGetAssistantDirectorAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getAssistantDirectorAsBoolean());
        System.out.println("Name of the assistant director. AS Boolean === " + jMetaDataGeneral.getAssistantDirectorAsBoolean());
    }

   /**
    * Test getAssistantDirectorAsBigInteger() method.
    */
    @Test
    public void subTestGetAssistantDirectorAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getAssistantDirectorAsBigInteger());
        System.out.println("Name of the assistant director. AS BigInteger === " + jMetaDataGeneral.getAssistantDirectorAsBigInteger());
    }

   /**
    * Test getAssistantDirectorAsURL() method.
    */
    @Test
    public void subTestGetAssistantDirectorAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getAssistantDirectorAsURL());
        System.out.println("Name of the assistant director. AS URL === " + jMetaDataGeneral.getAssistantDirectorAsURL());
    }

   /**
    * Test getCodecIDVersionAsInteger() method.
    */
    @Test
    public void subTestGetCodecIDVersionAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDVersionAsInteger());
        System.out.println("Version of the CodecID AS Integer === " + jMetaDataGeneral.getCodecIDVersionAsInteger());
    }

   /**
    * Test getCodecIDVersionAsLong() method.
    */
    @Test
    public void subTestGetCodecIDVersionAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDVersionAsLong());
        System.out.println("Version of the CodecID AS Long === " + jMetaDataGeneral.getCodecIDVersionAsLong());
    }

   /**
    * Test getCodecIDVersionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCodecIDVersionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDVersionAsLocalDateTime());
        System.out.println("Version of the CodecID AS LocalDateTime === " + jMetaDataGeneral.getCodecIDVersionAsLocalDateTime());
    }

   /**
    * Test getCodecIDVersionAsLocalTime() method.
    */
    @Test
    public void subTestGetCodecIDVersionAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDVersionAsLocalTime());
        System.out.println("Version of the CodecID AS LocalTime === " + jMetaDataGeneral.getCodecIDVersionAsLocalTime());
    }

   /**
    * Test getCodecIDVersionAsString() method.
    */
    @Test
    public void subTestGetCodecIDVersionAsString() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDVersionAsString());
        System.out.println("Version of the CodecID AS String === " + jMetaDataGeneral.getCodecIDVersionAsString());
    }

   /**
    * Test getCodecIDVersionAsBoolean() method.
    */
    @Test
    public void subTestGetCodecIDVersionAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDVersionAsBoolean());
        System.out.println("Version of the CodecID AS Boolean === " + jMetaDataGeneral.getCodecIDVersionAsBoolean());
    }

   /**
    * Test getCodecIDVersionAsBigInteger() method.
    */
    @Test
    public void subTestGetCodecIDVersionAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDVersionAsBigInteger());
        System.out.println("Version of the CodecID AS BigInteger === " + jMetaDataGeneral.getCodecIDVersionAsBigInteger());
    }

   /**
    * Test getCodecIDVersionAsURL() method.
    */
    @Test
    public void subTestGetCodecIDVersionAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDVersionAsURL());
        System.out.println("Version of the CodecID AS URL === " + jMetaDataGeneral.getCodecIDVersionAsURL());
    }

   /**
    * Test getVideoLanguageListAsInteger() method.
    */
    @Test
    public void subTestGetVideoLanguageListAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getVideoLanguageListAsInteger());
        System.out.println("Video languagesin this file, full names, separated by / AS Integer === " + jMetaDataGeneral.getVideoLanguageListAsInteger());
    }

   /**
    * Test getVideoLanguageListAsLong() method.
    */
    @Test
    public void subTestGetVideoLanguageListAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getVideoLanguageListAsLong());
        System.out.println("Video languagesin this file, full names, separated by / AS Long === " + jMetaDataGeneral.getVideoLanguageListAsLong());
    }

   /**
    * Test getVideoLanguageListAsLocalDateTime() method.
    */
    @Test
    public void subTestGetVideoLanguageListAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getVideoLanguageListAsLocalDateTime());
        System.out.println("Video languagesin this file, full names, separated by / AS LocalDateTime === " + jMetaDataGeneral.getVideoLanguageListAsLocalDateTime());
    }

   /**
    * Test getVideoLanguageListAsLocalTime() method.
    */
    @Test
    public void subTestGetVideoLanguageListAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getVideoLanguageListAsLocalTime());
        System.out.println("Video languagesin this file, full names, separated by / AS LocalTime === " + jMetaDataGeneral.getVideoLanguageListAsLocalTime());
    }

   /**
    * Test getVideoLanguageListAsString() method.
    */
    @Test
    public void subTestGetVideoLanguageListAsString() {
        assertEquals(null, this.jMetaDataGeneral.getVideoLanguageListAsString());
        System.out.println("Video languagesin this file, full names, separated by / AS String === " + jMetaDataGeneral.getVideoLanguageListAsString());
    }

   /**
    * Test getVideoLanguageListAsBoolean() method.
    */
    @Test
    public void subTestGetVideoLanguageListAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getVideoLanguageListAsBoolean());
        System.out.println("Video languagesin this file, full names, separated by / AS Boolean === " + jMetaDataGeneral.getVideoLanguageListAsBoolean());
    }

   /**
    * Test getVideoLanguageListAsBigInteger() method.
    */
    @Test
    public void subTestGetVideoLanguageListAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getVideoLanguageListAsBigInteger());
        System.out.println("Video languagesin this file, full names, separated by / AS BigInteger === " + jMetaDataGeneral.getVideoLanguageListAsBigInteger());
    }

   /**
    * Test getVideoLanguageListAsURL() method.
    */
    @Test
    public void subTestGetVideoLanguageListAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getVideoLanguageListAsURL());
        System.out.println("Video languagesin this file, full names, separated by / AS URL === " + jMetaDataGeneral.getVideoLanguageListAsURL());
    }

   /**
    * Test getEncryptionFormatAsInteger() method.
    */
    @Test
    public void subTestGetEncryptionFormatAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionFormatAsInteger());
        System.out.println("Encryption_Format AS Integer === " + jMetaDataGeneral.getEncryptionFormatAsInteger());
    }

   /**
    * Test getEncryptionFormatAsLong() method.
    */
    @Test
    public void subTestGetEncryptionFormatAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionFormatAsLong());
        System.out.println("Encryption_Format AS Long === " + jMetaDataGeneral.getEncryptionFormatAsLong());
    }

   /**
    * Test getEncryptionFormatAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncryptionFormatAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionFormatAsLocalDateTime());
        System.out.println("Encryption_Format AS LocalDateTime === " + jMetaDataGeneral.getEncryptionFormatAsLocalDateTime());
    }

   /**
    * Test getEncryptionFormatAsLocalTime() method.
    */
    @Test
    public void subTestGetEncryptionFormatAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionFormatAsLocalTime());
        System.out.println("Encryption_Format AS LocalTime === " + jMetaDataGeneral.getEncryptionFormatAsLocalTime());
    }

   /**
    * Test getEncryptionFormatAsString() method.
    */
    @Test
    public void subTestGetEncryptionFormatAsString() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionFormatAsString());
        System.out.println("Encryption_Format AS String === " + jMetaDataGeneral.getEncryptionFormatAsString());
    }

   /**
    * Test getEncryptionFormatAsBoolean() method.
    */
    @Test
    public void subTestGetEncryptionFormatAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionFormatAsBoolean());
        System.out.println("Encryption_Format AS Boolean === " + jMetaDataGeneral.getEncryptionFormatAsBoolean());
    }

   /**
    * Test getEncryptionFormatAsBigInteger() method.
    */
    @Test
    public void subTestGetEncryptionFormatAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionFormatAsBigInteger());
        System.out.println("Encryption_Format AS BigInteger === " + jMetaDataGeneral.getEncryptionFormatAsBigInteger());
    }

   /**
    * Test getEncryptionFormatAsURL() method.
    */
    @Test
    public void subTestGetEncryptionFormatAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionFormatAsURL());
        System.out.println("Encryption_Format AS URL === " + jMetaDataGeneral.getEncryptionFormatAsURL());
    }

   /**
    * Test getOriginalAlbumAsInteger() method.
    */
    @Test
    public void subTestGetOriginalAlbumAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalAlbumAsInteger());
        System.out.println("Original name of album, serie... AS Integer === " + jMetaDataGeneral.getOriginalAlbumAsInteger());
    }

   /**
    * Test getOriginalAlbumAsLong() method.
    */
    @Test
    public void subTestGetOriginalAlbumAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalAlbumAsLong());
        System.out.println("Original name of album, serie... AS Long === " + jMetaDataGeneral.getOriginalAlbumAsLong());
    }

   /**
    * Test getOriginalAlbumAsLocalDateTime() method.
    */
    @Test
    public void subTestGetOriginalAlbumAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalAlbumAsLocalDateTime());
        System.out.println("Original name of album, serie... AS LocalDateTime === " + jMetaDataGeneral.getOriginalAlbumAsLocalDateTime());
    }

   /**
    * Test getOriginalAlbumAsLocalTime() method.
    */
    @Test
    public void subTestGetOriginalAlbumAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalAlbumAsLocalTime());
        System.out.println("Original name of album, serie... AS LocalTime === " + jMetaDataGeneral.getOriginalAlbumAsLocalTime());
    }

   /**
    * Test getOriginalAlbumAsString() method.
    */
    @Test
    public void subTestGetOriginalAlbumAsString() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalAlbumAsString());
        System.out.println("Original name of album, serie... AS String === " + jMetaDataGeneral.getOriginalAlbumAsString());
    }

   /**
    * Test getOriginalAlbumAsBoolean() method.
    */
    @Test
    public void subTestGetOriginalAlbumAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalAlbumAsBoolean());
        System.out.println("Original name of album, serie... AS Boolean === " + jMetaDataGeneral.getOriginalAlbumAsBoolean());
    }

   /**
    * Test getOriginalAlbumAsBigInteger() method.
    */
    @Test
    public void subTestGetOriginalAlbumAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalAlbumAsBigInteger());
        System.out.println("Original name of album, serie... AS BigInteger === " + jMetaDataGeneral.getOriginalAlbumAsBigInteger());
    }

   /**
    * Test getOriginalAlbumAsURL() method.
    */
    @Test
    public void subTestGetOriginalAlbumAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalAlbumAsURL());
        System.out.println("Original name of album, serie... AS URL === " + jMetaDataGeneral.getOriginalAlbumAsURL());
    }

   /**
    * Test getOriginalSourceFormAsInteger() method.
    */
    @Test
    public void subTestGetOriginalSourceFormAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormAsInteger());
        System.out.println("Original form of the material, e.g. slide, paper, map AS Integer === " + jMetaDataGeneral.getOriginalSourceFormAsInteger());
    }

   /**
    * Test getOriginalSourceFormAsLong() method.
    */
    @Test
    public void subTestGetOriginalSourceFormAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormAsLong());
        System.out.println("Original form of the material, e.g. slide, paper, map AS Long === " + jMetaDataGeneral.getOriginalSourceFormAsLong());
    }

   /**
    * Test getOriginalSourceFormAsLocalDateTime() method.
    */
    @Test
    public void subTestGetOriginalSourceFormAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormAsLocalDateTime());
        System.out.println("Original form of the material, e.g. slide, paper, map AS LocalDateTime === " + jMetaDataGeneral.getOriginalSourceFormAsLocalDateTime());
    }

   /**
    * Test getOriginalSourceFormAsLocalTime() method.
    */
    @Test
    public void subTestGetOriginalSourceFormAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormAsLocalTime());
        System.out.println("Original form of the material, e.g. slide, paper, map AS LocalTime === " + jMetaDataGeneral.getOriginalSourceFormAsLocalTime());
    }

   /**
    * Test getOriginalSourceFormAsString() method.
    */
    @Test
    public void subTestGetOriginalSourceFormAsString() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormAsString());
        System.out.println("Original form of the material, e.g. slide, paper, map AS String === " + jMetaDataGeneral.getOriginalSourceFormAsString());
    }

   /**
    * Test getOriginalSourceFormAsBoolean() method.
    */
    @Test
    public void subTestGetOriginalSourceFormAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormAsBoolean());
        System.out.println("Original form of the material, e.g. slide, paper, map AS Boolean === " + jMetaDataGeneral.getOriginalSourceFormAsBoolean());
    }

   /**
    * Test getOriginalSourceFormAsBigInteger() method.
    */
    @Test
    public void subTestGetOriginalSourceFormAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormAsBigInteger());
        System.out.println("Original form of the material, e.g. slide, paper, map AS BigInteger === " + jMetaDataGeneral.getOriginalSourceFormAsBigInteger());
    }

   /**
    * Test getOriginalSourceFormAsURL() method.
    */
    @Test
    public void subTestGetOriginalSourceFormAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormAsURL());
        System.out.println("Original form of the material, e.g. slide, paper, map AS URL === " + jMetaDataGeneral.getOriginalSourceFormAsURL());
    }

   /**
    * Test getDelaySettingsAsInteger() method.
    */
    @Test
    public void subTestGetDelaySettingsAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDelaySettingsAsInteger());
        System.out.println("Delay settings (in case of timecode for example) AS Integer === " + jMetaDataGeneral.getDelaySettingsAsInteger());
    }

   /**
    * Test getDelaySettingsAsLong() method.
    */
    @Test
    public void subTestGetDelaySettingsAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getDelaySettingsAsLong());
        System.out.println("Delay settings (in case of timecode for example) AS Long === " + jMetaDataGeneral.getDelaySettingsAsLong());
    }

   /**
    * Test getDelaySettingsAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelaySettingsAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getDelaySettingsAsLocalDateTime());
        System.out.println("Delay settings (in case of timecode for example) AS LocalDateTime === " + jMetaDataGeneral.getDelaySettingsAsLocalDateTime());
    }

   /**
    * Test getDelaySettingsAsLocalTime() method.
    */
    @Test
    public void subTestGetDelaySettingsAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getDelaySettingsAsLocalTime());
        System.out.println("Delay settings (in case of timecode for example) AS LocalTime === " + jMetaDataGeneral.getDelaySettingsAsLocalTime());
    }

   /**
    * Test getDelaySettingsAsString() method.
    */
    @Test
    public void subTestGetDelaySettingsAsString() {
        assertEquals(null, this.jMetaDataGeneral.getDelaySettingsAsString());
        System.out.println("Delay settings (in case of timecode for example) AS String === " + jMetaDataGeneral.getDelaySettingsAsString());
    }

   /**
    * Test getDelaySettingsAsBoolean() method.
    */
    @Test
    public void subTestGetDelaySettingsAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getDelaySettingsAsBoolean());
        System.out.println("Delay settings (in case of timecode for example) AS Boolean === " + jMetaDataGeneral.getDelaySettingsAsBoolean());
    }

   /**
    * Test getDelaySettingsAsBigInteger() method.
    */
    @Test
    public void subTestGetDelaySettingsAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDelaySettingsAsBigInteger());
        System.out.println("Delay settings (in case of timecode for example) AS BigInteger === " + jMetaDataGeneral.getDelaySettingsAsBigInteger());
    }

   /**
    * Test getDelaySettingsAsURL() method.
    */
    @Test
    public void subTestGetDelaySettingsAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getDelaySettingsAsURL());
        System.out.println("Delay settings (in case of timecode for example) AS URL === " + jMetaDataGeneral.getDelaySettingsAsURL());
    }

   /**
    * Test getTimeZoneAsInteger() method.
    */
    @Test
    public void subTestGetTimeZoneAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getTimeZoneAsInteger());
        System.out.println("TimeZone AS Integer === " + jMetaDataGeneral.getTimeZoneAsInteger());
    }

   /**
    * Test getTimeZoneAsLong() method.
    */
    @Test
    public void subTestGetTimeZoneAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getTimeZoneAsLong());
        System.out.println("TimeZone AS Long === " + jMetaDataGeneral.getTimeZoneAsLong());
    }

   /**
    * Test getTimeZoneAsLocalDateTime() method.
    */
    @Test
    public void subTestGetTimeZoneAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getTimeZoneAsLocalDateTime());
        System.out.println("TimeZone AS LocalDateTime === " + jMetaDataGeneral.getTimeZoneAsLocalDateTime());
    }

   /**
    * Test getTimeZoneAsLocalTime() method.
    */
    @Test
    public void subTestGetTimeZoneAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getTimeZoneAsLocalTime());
        System.out.println("TimeZone AS LocalTime === " + jMetaDataGeneral.getTimeZoneAsLocalTime());
    }

   /**
    * Test getTimeZoneAsString() method.
    */
    @Test
    public void subTestGetTimeZoneAsString() {
        assertEquals(null, this.jMetaDataGeneral.getTimeZoneAsString());
        System.out.println("TimeZone AS String === " + jMetaDataGeneral.getTimeZoneAsString());
    }

   /**
    * Test getTimeZoneAsBoolean() method.
    */
    @Test
    public void subTestGetTimeZoneAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getTimeZoneAsBoolean());
        System.out.println("TimeZone AS Boolean === " + jMetaDataGeneral.getTimeZoneAsBoolean());
    }

   /**
    * Test getTimeZoneAsBigInteger() method.
    */
    @Test
    public void subTestGetTimeZoneAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getTimeZoneAsBigInteger());
        System.out.println("TimeZone AS BigInteger === " + jMetaDataGeneral.getTimeZoneAsBigInteger());
    }

   /**
    * Test getTimeZoneAsURL() method.
    */
    @Test
    public void subTestGetTimeZoneAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getTimeZoneAsURL());
        System.out.println("TimeZone AS URL === " + jMetaDataGeneral.getTimeZoneAsURL());
    }

   /**
    * Test getImageFormatListAsInteger() method.
    */
    @Test
    public void subTestGetImageFormatListAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getImageFormatListAsInteger());
        System.out.println("Image Codecs in this file, separated by / AS Integer === " + jMetaDataGeneral.getImageFormatListAsInteger());
    }

   /**
    * Test getImageFormatListAsLong() method.
    */
    @Test
    public void subTestGetImageFormatListAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getImageFormatListAsLong());
        System.out.println("Image Codecs in this file, separated by / AS Long === " + jMetaDataGeneral.getImageFormatListAsLong());
    }

   /**
    * Test getImageFormatListAsLocalDateTime() method.
    */
    @Test
    public void subTestGetImageFormatListAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getImageFormatListAsLocalDateTime());
        System.out.println("Image Codecs in this file, separated by / AS LocalDateTime === " + jMetaDataGeneral.getImageFormatListAsLocalDateTime());
    }

   /**
    * Test getImageFormatListAsLocalTime() method.
    */
    @Test
    public void subTestGetImageFormatListAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getImageFormatListAsLocalTime());
        System.out.println("Image Codecs in this file, separated by / AS LocalTime === " + jMetaDataGeneral.getImageFormatListAsLocalTime());
    }

   /**
    * Test getImageFormatListAsString() method.
    */
    @Test
    public void subTestGetImageFormatListAsString() {
        assertEquals(null, this.jMetaDataGeneral.getImageFormatListAsString());
        System.out.println("Image Codecs in this file, separated by / AS String === " + jMetaDataGeneral.getImageFormatListAsString());
    }

   /**
    * Test getImageFormatListAsBoolean() method.
    */
    @Test
    public void subTestGetImageFormatListAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getImageFormatListAsBoolean());
        System.out.println("Image Codecs in this file, separated by / AS Boolean === " + jMetaDataGeneral.getImageFormatListAsBoolean());
    }

   /**
    * Test getImageFormatListAsBigInteger() method.
    */
    @Test
    public void subTestGetImageFormatListAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getImageFormatListAsBigInteger());
        System.out.println("Image Codecs in this file, separated by / AS BigInteger === " + jMetaDataGeneral.getImageFormatListAsBigInteger());
    }

   /**
    * Test getImageFormatListAsURL() method.
    */
    @Test
    public void subTestGetImageFormatListAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getImageFormatListAsURL());
        System.out.println("Image Codecs in this file, separated by / AS URL === " + jMetaDataGeneral.getImageFormatListAsURL());
    }

   /**
    * Test getMenuCountAsInteger() method.
    */
    @Test
    public void subTestGetMenuCountAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getMenuCountAsInteger());
        System.out.println("Number of menu streams AS Integer === " + jMetaDataGeneral.getMenuCountAsInteger());
    }

   /**
    * Test getMenuCountAsLong() method.
    */
    @Test
    public void subTestGetMenuCountAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getMenuCountAsLong());
        System.out.println("Number of menu streams AS Long === " + jMetaDataGeneral.getMenuCountAsLong());
    }

   /**
    * Test getMenuCountAsLocalDateTime() method.
    */
    @Test
    public void subTestGetMenuCountAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getMenuCountAsLocalDateTime());
        System.out.println("Number of menu streams AS LocalDateTime === " + jMetaDataGeneral.getMenuCountAsLocalDateTime());
    }

   /**
    * Test getMenuCountAsLocalTime() method.
    */
    @Test
    public void subTestGetMenuCountAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getMenuCountAsLocalTime());
        System.out.println("Number of menu streams AS LocalTime === " + jMetaDataGeneral.getMenuCountAsLocalTime());
    }

   /**
    * Test getMenuCountAsString() method.
    */
    @Test
    public void subTestGetMenuCountAsString() {
        assertEquals(null, this.jMetaDataGeneral.getMenuCountAsString());
        System.out.println("Number of menu streams AS String === " + jMetaDataGeneral.getMenuCountAsString());
    }

   /**
    * Test getMenuCountAsBoolean() method.
    */
    @Test
    public void subTestGetMenuCountAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getMenuCountAsBoolean());
        System.out.println("Number of menu streams AS Boolean === " + jMetaDataGeneral.getMenuCountAsBoolean());
    }

   /**
    * Test getMenuCountAsBigInteger() method.
    */
    @Test
    public void subTestGetMenuCountAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getMenuCountAsBigInteger());
        System.out.println("Number of menu streams AS BigInteger === " + jMetaDataGeneral.getMenuCountAsBigInteger());
    }

   /**
    * Test getMenuCountAsURL() method.
    */
    @Test
    public void subTestGetMenuCountAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getMenuCountAsURL());
        System.out.println("Number of menu streams AS URL === " + jMetaDataGeneral.getMenuCountAsURL());
    }

   /**
    * Test getImageFormatWithHintListAsInteger() method.
    */
    @Test
    public void subTestGetImageFormatWithHintListAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getImageFormatWithHintListAsInteger());
        System.out.println("Image Codecs in this file with popular name (hint), separated by / AS Integer === " + jMetaDataGeneral.getImageFormatWithHintListAsInteger());
    }

   /**
    * Test getImageFormatWithHintListAsLong() method.
    */
    @Test
    public void subTestGetImageFormatWithHintListAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getImageFormatWithHintListAsLong());
        System.out.println("Image Codecs in this file with popular name (hint), separated by / AS Long === " + jMetaDataGeneral.getImageFormatWithHintListAsLong());
    }

   /**
    * Test getImageFormatWithHintListAsLocalDateTime() method.
    */
    @Test
    public void subTestGetImageFormatWithHintListAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getImageFormatWithHintListAsLocalDateTime());
        System.out.println("Image Codecs in this file with popular name (hint), separated by / AS LocalDateTime === " + jMetaDataGeneral.getImageFormatWithHintListAsLocalDateTime());
    }

   /**
    * Test getImageFormatWithHintListAsLocalTime() method.
    */
    @Test
    public void subTestGetImageFormatWithHintListAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getImageFormatWithHintListAsLocalTime());
        System.out.println("Image Codecs in this file with popular name (hint), separated by / AS LocalTime === " + jMetaDataGeneral.getImageFormatWithHintListAsLocalTime());
    }

   /**
    * Test getImageFormatWithHintListAsString() method.
    */
    @Test
    public void subTestGetImageFormatWithHintListAsString() {
        assertEquals(null, this.jMetaDataGeneral.getImageFormatWithHintListAsString());
        System.out.println("Image Codecs in this file with popular name (hint), separated by / AS String === " + jMetaDataGeneral.getImageFormatWithHintListAsString());
    }

   /**
    * Test getImageFormatWithHintListAsBoolean() method.
    */
    @Test
    public void subTestGetImageFormatWithHintListAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getImageFormatWithHintListAsBoolean());
        System.out.println("Image Codecs in this file with popular name (hint), separated by / AS Boolean === " + jMetaDataGeneral.getImageFormatWithHintListAsBoolean());
    }

   /**
    * Test getImageFormatWithHintListAsBigInteger() method.
    */
    @Test
    public void subTestGetImageFormatWithHintListAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getImageFormatWithHintListAsBigInteger());
        System.out.println("Image Codecs in this file with popular name (hint), separated by / AS BigInteger === " + jMetaDataGeneral.getImageFormatWithHintListAsBigInteger());
    }

   /**
    * Test getImageFormatWithHintListAsURL() method.
    */
    @Test
    public void subTestGetImageFormatWithHintListAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getImageFormatWithHintListAsURL());
        System.out.println("Image Codecs in this file with popular name (hint), separated by / AS URL === " + jMetaDataGeneral.getImageFormatWithHintListAsURL());
    }

   /**
    * Test getPartAsInteger() method.
    */
    @Test
    public void subTestGetPartAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getPartAsInteger());
        System.out.println("Name of the part. e.g. CD1, CD2 AS Integer === " + jMetaDataGeneral.getPartAsInteger());
    }

   /**
    * Test getPartAsLong() method.
    */
    @Test
    public void subTestGetPartAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getPartAsLong());
        System.out.println("Name of the part. e.g. CD1, CD2 AS Long === " + jMetaDataGeneral.getPartAsLong());
    }

   /**
    * Test getPartAsLocalDateTime() method.
    */
    @Test
    public void subTestGetPartAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getPartAsLocalDateTime());
        System.out.println("Name of the part. e.g. CD1, CD2 AS LocalDateTime === " + jMetaDataGeneral.getPartAsLocalDateTime());
    }

   /**
    * Test getPartAsLocalTime() method.
    */
    @Test
    public void subTestGetPartAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getPartAsLocalTime());
        System.out.println("Name of the part. e.g. CD1, CD2 AS LocalTime === " + jMetaDataGeneral.getPartAsLocalTime());
    }

   /**
    * Test getPartAsString() method.
    */
    @Test
    public void subTestGetPartAsString() {
        assertEquals(null, this.jMetaDataGeneral.getPartAsString());
        System.out.println("Name of the part. e.g. CD1, CD2 AS String === " + jMetaDataGeneral.getPartAsString());
    }

   /**
    * Test getPartAsBoolean() method.
    */
    @Test
    public void subTestGetPartAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getPartAsBoolean());
        System.out.println("Name of the part. e.g. CD1, CD2 AS Boolean === " + jMetaDataGeneral.getPartAsBoolean());
    }

   /**
    * Test getPartAsBigInteger() method.
    */
    @Test
    public void subTestGetPartAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getPartAsBigInteger());
        System.out.println("Name of the part. e.g. CD1, CD2 AS BigInteger === " + jMetaDataGeneral.getPartAsBigInteger());
    }

   /**
    * Test getPartAsURL() method.
    */
    @Test
    public void subTestGetPartAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getPartAsURL());
        System.out.println("Name of the part. e.g. CD1, CD2 AS URL === " + jMetaDataGeneral.getPartAsURL());
    }

   /**
    * Test getOverallBitRateModeStringAsInteger() method.
    */
    @Test
    public void subTestGetOverallBitRateModeStringAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateModeStringAsInteger());
        System.out.println("Bit rate mode of all streams (Variable, Constant) AS Integer === " + jMetaDataGeneral.getOverallBitRateModeStringAsInteger());
    }

   /**
    * Test getOverallBitRateModeStringAsLong() method.
    */
    @Test
    public void subTestGetOverallBitRateModeStringAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateModeStringAsLong());
        System.out.println("Bit rate mode of all streams (Variable, Constant) AS Long === " + jMetaDataGeneral.getOverallBitRateModeStringAsLong());
    }

   /**
    * Test getOverallBitRateModeStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetOverallBitRateModeStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateModeStringAsLocalDateTime());
        System.out.println("Bit rate mode of all streams (Variable, Constant) AS LocalDateTime === " + jMetaDataGeneral.getOverallBitRateModeStringAsLocalDateTime());
    }

   /**
    * Test getOverallBitRateModeStringAsLocalTime() method.
    */
    @Test
    public void subTestGetOverallBitRateModeStringAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateModeStringAsLocalTime());
        System.out.println("Bit rate mode of all streams (Variable, Constant) AS LocalTime === " + jMetaDataGeneral.getOverallBitRateModeStringAsLocalTime());
    }

   /**
    * Test getOverallBitRateModeStringAsString() method.
    */
    @Test
    public void subTestGetOverallBitRateModeStringAsString() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateModeStringAsString());
        System.out.println("Bit rate mode of all streams (Variable, Constant) AS String === " + jMetaDataGeneral.getOverallBitRateModeStringAsString());
    }

   /**
    * Test getOverallBitRateModeStringAsBoolean() method.
    */
    @Test
    public void subTestGetOverallBitRateModeStringAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateModeStringAsBoolean());
        System.out.println("Bit rate mode of all streams (Variable, Constant) AS Boolean === " + jMetaDataGeneral.getOverallBitRateModeStringAsBoolean());
    }

   /**
    * Test getOverallBitRateModeStringAsBigInteger() method.
    */
    @Test
    public void subTestGetOverallBitRateModeStringAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateModeStringAsBigInteger());
        System.out.println("Bit rate mode of all streams (Variable, Constant) AS BigInteger === " + jMetaDataGeneral.getOverallBitRateModeStringAsBigInteger());
    }

   /**
    * Test getOverallBitRateModeStringAsURL() method.
    */
    @Test
    public void subTestGetOverallBitRateModeStringAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateModeStringAsURL());
        System.out.println("Bit rate mode of all streams (Variable, Constant) AS URL === " + jMetaDataGeneral.getOverallBitRateModeStringAsURL());
    }

   /**
    * Test getPartPositionTotalAsInteger() method.
    */
    @Test
    public void subTestGetPartPositionTotalAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getPartPositionTotalAsInteger());
        System.out.println("Place of the part e.g. 2 of 3 AS Integer === " + jMetaDataGeneral.getPartPositionTotalAsInteger());
    }

   /**
    * Test getPartPositionTotalAsLong() method.
    */
    @Test
    public void subTestGetPartPositionTotalAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getPartPositionTotalAsLong());
        System.out.println("Place of the part e.g. 2 of 3 AS Long === " + jMetaDataGeneral.getPartPositionTotalAsLong());
    }

   /**
    * Test getPartPositionTotalAsLocalDateTime() method.
    */
    @Test
    public void subTestGetPartPositionTotalAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getPartPositionTotalAsLocalDateTime());
        System.out.println("Place of the part e.g. 2 of 3 AS LocalDateTime === " + jMetaDataGeneral.getPartPositionTotalAsLocalDateTime());
    }

   /**
    * Test getPartPositionTotalAsLocalTime() method.
    */
    @Test
    public void subTestGetPartPositionTotalAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getPartPositionTotalAsLocalTime());
        System.out.println("Place of the part e.g. 2 of 3 AS LocalTime === " + jMetaDataGeneral.getPartPositionTotalAsLocalTime());
    }

   /**
    * Test getPartPositionTotalAsString() method.
    */
    @Test
    public void subTestGetPartPositionTotalAsString() {
        assertEquals(null, this.jMetaDataGeneral.getPartPositionTotalAsString());
        System.out.println("Place of the part e.g. 2 of 3 AS String === " + jMetaDataGeneral.getPartPositionTotalAsString());
    }

   /**
    * Test getPartPositionTotalAsBoolean() method.
    */
    @Test
    public void subTestGetPartPositionTotalAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getPartPositionTotalAsBoolean());
        System.out.println("Place of the part e.g. 2 of 3 AS Boolean === " + jMetaDataGeneral.getPartPositionTotalAsBoolean());
    }

   /**
    * Test getPartPositionTotalAsBigInteger() method.
    */
    @Test
    public void subTestGetPartPositionTotalAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getPartPositionTotalAsBigInteger());
        System.out.println("Place of the part e.g. 2 of 3 AS BigInteger === " + jMetaDataGeneral.getPartPositionTotalAsBigInteger());
    }

   /**
    * Test getPartPositionTotalAsURL() method.
    */
    @Test
    public void subTestGetPartPositionTotalAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getPartPositionTotalAsURL());
        System.out.println("Place of the part e.g. 2 of 3 AS URL === " + jMetaDataGeneral.getPartPositionTotalAsURL());
    }

   /**
    * Test getOriginalMovieAsInteger() method.
    */
    @Test
    public void subTestGetOriginalMovieAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalMovieAsInteger());
        System.out.println("Original name of the movie AS Integer === " + jMetaDataGeneral.getOriginalMovieAsInteger());
    }

   /**
    * Test getOriginalMovieAsLong() method.
    */
    @Test
    public void subTestGetOriginalMovieAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalMovieAsLong());
        System.out.println("Original name of the movie AS Long === " + jMetaDataGeneral.getOriginalMovieAsLong());
    }

   /**
    * Test getOriginalMovieAsLocalDateTime() method.
    */
    @Test
    public void subTestGetOriginalMovieAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalMovieAsLocalDateTime());
        System.out.println("Original name of the movie AS LocalDateTime === " + jMetaDataGeneral.getOriginalMovieAsLocalDateTime());
    }

   /**
    * Test getOriginalMovieAsLocalTime() method.
    */
    @Test
    public void subTestGetOriginalMovieAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalMovieAsLocalTime());
        System.out.println("Original name of the movie AS LocalTime === " + jMetaDataGeneral.getOriginalMovieAsLocalTime());
    }

   /**
    * Test getOriginalMovieAsString() method.
    */
    @Test
    public void subTestGetOriginalMovieAsString() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalMovieAsString());
        System.out.println("Original name of the movie AS String === " + jMetaDataGeneral.getOriginalMovieAsString());
    }

   /**
    * Test getOriginalMovieAsBoolean() method.
    */
    @Test
    public void subTestGetOriginalMovieAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalMovieAsBoolean());
        System.out.println("Original name of the movie AS Boolean === " + jMetaDataGeneral.getOriginalMovieAsBoolean());
    }

   /**
    * Test getOriginalMovieAsBigInteger() method.
    */
    @Test
    public void subTestGetOriginalMovieAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalMovieAsBigInteger());
        System.out.println("Original name of the movie AS BigInteger === " + jMetaDataGeneral.getOriginalMovieAsBigInteger());
    }

   /**
    * Test getOriginalMovieAsURL() method.
    */
    @Test
    public void subTestGetOriginalMovieAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalMovieAsURL());
        System.out.println("Original name of the movie AS URL === " + jMetaDataGeneral.getOriginalMovieAsURL());
    }

   /**
    * Test getAlbumReplayGainPeakAsInteger() method.
    */
    @Test
    public void subTestGetAlbumReplayGainPeakAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumReplayGainPeakAsInteger());
        System.out.println("The maximum absolute peak value of the item AS Integer === " + jMetaDataGeneral.getAlbumReplayGainPeakAsInteger());
    }

   /**
    * Test getAlbumReplayGainPeakAsLong() method.
    */
    @Test
    public void subTestGetAlbumReplayGainPeakAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumReplayGainPeakAsLong());
        System.out.println("The maximum absolute peak value of the item AS Long === " + jMetaDataGeneral.getAlbumReplayGainPeakAsLong());
    }

   /**
    * Test getAlbumReplayGainPeakAsLocalDateTime() method.
    */
    @Test
    public void subTestGetAlbumReplayGainPeakAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumReplayGainPeakAsLocalDateTime());
        System.out.println("The maximum absolute peak value of the item AS LocalDateTime === " + jMetaDataGeneral.getAlbumReplayGainPeakAsLocalDateTime());
    }

   /**
    * Test getAlbumReplayGainPeakAsLocalTime() method.
    */
    @Test
    public void subTestGetAlbumReplayGainPeakAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumReplayGainPeakAsLocalTime());
        System.out.println("The maximum absolute peak value of the item AS LocalTime === " + jMetaDataGeneral.getAlbumReplayGainPeakAsLocalTime());
    }

   /**
    * Test getAlbumReplayGainPeakAsString() method.
    */
    @Test
    public void subTestGetAlbumReplayGainPeakAsString() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumReplayGainPeakAsString());
        System.out.println("The maximum absolute peak value of the item AS String === " + jMetaDataGeneral.getAlbumReplayGainPeakAsString());
    }

   /**
    * Test getAlbumReplayGainPeakAsBoolean() method.
    */
    @Test
    public void subTestGetAlbumReplayGainPeakAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumReplayGainPeakAsBoolean());
        System.out.println("The maximum absolute peak value of the item AS Boolean === " + jMetaDataGeneral.getAlbumReplayGainPeakAsBoolean());
    }

   /**
    * Test getAlbumReplayGainPeakAsBigInteger() method.
    */
    @Test
    public void subTestGetAlbumReplayGainPeakAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumReplayGainPeakAsBigInteger());
        System.out.println("The maximum absolute peak value of the item AS BigInteger === " + jMetaDataGeneral.getAlbumReplayGainPeakAsBigInteger());
    }

   /**
    * Test getAlbumReplayGainPeakAsURL() method.
    */
    @Test
    public void subTestGetAlbumReplayGainPeakAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumReplayGainPeakAsURL());
        System.out.println("The maximum absolute peak value of the item AS URL === " + jMetaDataGeneral.getAlbumReplayGainPeakAsURL());
    }

   /**
    * Test getFileSizeString4AsInteger() method.
    */
    @Test
    public void subTestGetFileSizeString4AsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeString4AsInteger());
        System.out.println("File size (with measure, 4 digit mini) AS Integer === " + jMetaDataGeneral.getFileSizeString4AsInteger());
    }

   /**
    * Test getFileSizeString4AsLong() method.
    */
    @Test
    public void subTestGetFileSizeString4AsLong() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeString4AsLong());
        System.out.println("File size (with measure, 4 digit mini) AS Long === " + jMetaDataGeneral.getFileSizeString4AsLong());
    }

   /**
    * Test getFileSizeString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetFileSizeString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeString4AsLocalDateTime());
        System.out.println("File size (with measure, 4 digit mini) AS LocalDateTime === " + jMetaDataGeneral.getFileSizeString4AsLocalDateTime());
    }

   /**
    * Test getFileSizeString4AsLocalTime() method.
    */
    @Test
    public void subTestGetFileSizeString4AsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeString4AsLocalTime());
        System.out.println("File size (with measure, 4 digit mini) AS LocalTime === " + jMetaDataGeneral.getFileSizeString4AsLocalTime());
    }

   /**
    * Test getFileSizeString4AsString() method.
    */
    @Test
    public void subTestGetFileSizeString4AsString() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeString4AsString());
        System.out.println("File size (with measure, 4 digit mini) AS String === " + jMetaDataGeneral.getFileSizeString4AsString());
    }

   /**
    * Test getFileSizeString4AsBoolean() method.
    */
    @Test
    public void subTestGetFileSizeString4AsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeString4AsBoolean());
        System.out.println("File size (with measure, 4 digit mini) AS Boolean === " + jMetaDataGeneral.getFileSizeString4AsBoolean());
    }

   /**
    * Test getFileSizeString4AsBigInteger() method.
    */
    @Test
    public void subTestGetFileSizeString4AsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeString4AsBigInteger());
        System.out.println("File size (with measure, 4 digit mini) AS BigInteger === " + jMetaDataGeneral.getFileSizeString4AsBigInteger());
    }

   /**
    * Test getFileSizeString4AsURL() method.
    */
    @Test
    public void subTestGetFileSizeString4AsURL() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeString4AsURL());
        System.out.println("File size (with measure, 4 digit mini) AS URL === " + jMetaDataGeneral.getFileSizeString4AsURL());
    }

   /**
    * Test getFileSizeString3AsInteger() method.
    */
    @Test
    public void subTestGetFileSizeString3AsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeString3AsInteger());
        System.out.println("File size (with measure, 3 digit mini) AS Integer === " + jMetaDataGeneral.getFileSizeString3AsInteger());
    }

   /**
    * Test getFileSizeString3AsLong() method.
    */
    @Test
    public void subTestGetFileSizeString3AsLong() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeString3AsLong());
        System.out.println("File size (with measure, 3 digit mini) AS Long === " + jMetaDataGeneral.getFileSizeString3AsLong());
    }

   /**
    * Test getFileSizeString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetFileSizeString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeString3AsLocalDateTime());
        System.out.println("File size (with measure, 3 digit mini) AS LocalDateTime === " + jMetaDataGeneral.getFileSizeString3AsLocalDateTime());
    }

   /**
    * Test getFileSizeString3AsLocalTime() method.
    */
    @Test
    public void subTestGetFileSizeString3AsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeString3AsLocalTime());
        System.out.println("File size (with measure, 3 digit mini) AS LocalTime === " + jMetaDataGeneral.getFileSizeString3AsLocalTime());
    }

   /**
    * Test getFileSizeString3AsString() method.
    */
    @Test
    public void subTestGetFileSizeString3AsString() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeString3AsString());
        System.out.println("File size (with measure, 3 digit mini) AS String === " + jMetaDataGeneral.getFileSizeString3AsString());
    }

   /**
    * Test getFileSizeString3AsBoolean() method.
    */
    @Test
    public void subTestGetFileSizeString3AsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeString3AsBoolean());
        System.out.println("File size (with measure, 3 digit mini) AS Boolean === " + jMetaDataGeneral.getFileSizeString3AsBoolean());
    }

   /**
    * Test getFileSizeString3AsBigInteger() method.
    */
    @Test
    public void subTestGetFileSizeString3AsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeString3AsBigInteger());
        System.out.println("File size (with measure, 3 digit mini) AS BigInteger === " + jMetaDataGeneral.getFileSizeString3AsBigInteger());
    }

   /**
    * Test getFileSizeString3AsURL() method.
    */
    @Test
    public void subTestGetFileSizeString3AsURL() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeString3AsURL());
        System.out.println("File size (with measure, 3 digit mini) AS URL === " + jMetaDataGeneral.getFileSizeString3AsURL());
    }

   /**
    * Test getRemixedByAsInteger() method.
    */
    @Test
    public void subTestGetRemixedByAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getRemixedByAsInteger());
        System.out.println("Name of the artist(s), that interpreted, remixed, or otherwise modified the item. AS Integer === " + jMetaDataGeneral.getRemixedByAsInteger());
    }

   /**
    * Test getRemixedByAsLong() method.
    */
    @Test
    public void subTestGetRemixedByAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getRemixedByAsLong());
        System.out.println("Name of the artist(s), that interpreted, remixed, or otherwise modified the item. AS Long === " + jMetaDataGeneral.getRemixedByAsLong());
    }

   /**
    * Test getRemixedByAsLocalDateTime() method.
    */
    @Test
    public void subTestGetRemixedByAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getRemixedByAsLocalDateTime());
        System.out.println("Name of the artist(s), that interpreted, remixed, or otherwise modified the item. AS LocalDateTime === " + jMetaDataGeneral.getRemixedByAsLocalDateTime());
    }

   /**
    * Test getRemixedByAsLocalTime() method.
    */
    @Test
    public void subTestGetRemixedByAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getRemixedByAsLocalTime());
        System.out.println("Name of the artist(s), that interpreted, remixed, or otherwise modified the item. AS LocalTime === " + jMetaDataGeneral.getRemixedByAsLocalTime());
    }

   /**
    * Test getRemixedByAsString() method.
    */
    @Test
    public void subTestGetRemixedByAsString() {
        assertEquals(null, this.jMetaDataGeneral.getRemixedByAsString());
        System.out.println("Name of the artist(s), that interpreted, remixed, or otherwise modified the item. AS String === " + jMetaDataGeneral.getRemixedByAsString());
    }

   /**
    * Test getRemixedByAsBoolean() method.
    */
    @Test
    public void subTestGetRemixedByAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getRemixedByAsBoolean());
        System.out.println("Name of the artist(s), that interpreted, remixed, or otherwise modified the item. AS Boolean === " + jMetaDataGeneral.getRemixedByAsBoolean());
    }

   /**
    * Test getRemixedByAsBigInteger() method.
    */
    @Test
    public void subTestGetRemixedByAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getRemixedByAsBigInteger());
        System.out.println("Name of the artist(s), that interpreted, remixed, or otherwise modified the item. AS BigInteger === " + jMetaDataGeneral.getRemixedByAsBigInteger());
    }

   /**
    * Test getRemixedByAsURL() method.
    */
    @Test
    public void subTestGetRemixedByAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getRemixedByAsURL());
        System.out.println("Name of the artist(s), that interpreted, remixed, or otherwise modified the item. AS URL === " + jMetaDataGeneral.getRemixedByAsURL());
    }

   /**
    * Test getSubTrackAsInteger() method.
    */
    @Test
    public void subTestGetSubTrackAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getSubTrackAsInteger());
        System.out.println("Name of the subtrack. AS Integer === " + jMetaDataGeneral.getSubTrackAsInteger());
    }

   /**
    * Test getSubTrackAsLong() method.
    */
    @Test
    public void subTestGetSubTrackAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getSubTrackAsLong());
        System.out.println("Name of the subtrack. AS Long === " + jMetaDataGeneral.getSubTrackAsLong());
    }

   /**
    * Test getSubTrackAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSubTrackAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getSubTrackAsLocalDateTime());
        System.out.println("Name of the subtrack. AS LocalDateTime === " + jMetaDataGeneral.getSubTrackAsLocalDateTime());
    }

   /**
    * Test getSubTrackAsLocalTime() method.
    */
    @Test
    public void subTestGetSubTrackAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getSubTrackAsLocalTime());
        System.out.println("Name of the subtrack. AS LocalTime === " + jMetaDataGeneral.getSubTrackAsLocalTime());
    }

   /**
    * Test getSubTrackAsString() method.
    */
    @Test
    public void subTestGetSubTrackAsString() {
        assertEquals(null, this.jMetaDataGeneral.getSubTrackAsString());
        System.out.println("Name of the subtrack. AS String === " + jMetaDataGeneral.getSubTrackAsString());
    }

   /**
    * Test getSubTrackAsBoolean() method.
    */
    @Test
    public void subTestGetSubTrackAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getSubTrackAsBoolean());
        System.out.println("Name of the subtrack. AS Boolean === " + jMetaDataGeneral.getSubTrackAsBoolean());
    }

   /**
    * Test getSubTrackAsBigInteger() method.
    */
    @Test
    public void subTestGetSubTrackAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getSubTrackAsBigInteger());
        System.out.println("Name of the subtrack. AS BigInteger === " + jMetaDataGeneral.getSubTrackAsBigInteger());
    }

   /**
    * Test getSubTrackAsURL() method.
    */
    @Test
    public void subTestGetSubTrackAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getSubTrackAsURL());
        System.out.println("Name of the subtrack. AS URL === " + jMetaDataGeneral.getSubTrackAsURL());
    }

   /**
    * Test getPackageNameAsInteger() method.
    */
    @Test
    public void subTestGetPackageNameAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getPackageNameAsInteger());
        System.out.println("Package name i.e. technical flavor of the content AS Integer === " + jMetaDataGeneral.getPackageNameAsInteger());
    }

   /**
    * Test getPackageNameAsLong() method.
    */
    @Test
    public void subTestGetPackageNameAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getPackageNameAsLong());
        System.out.println("Package name i.e. technical flavor of the content AS Long === " + jMetaDataGeneral.getPackageNameAsLong());
    }

   /**
    * Test getPackageNameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetPackageNameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getPackageNameAsLocalDateTime());
        System.out.println("Package name i.e. technical flavor of the content AS LocalDateTime === " + jMetaDataGeneral.getPackageNameAsLocalDateTime());
    }

   /**
    * Test getPackageNameAsLocalTime() method.
    */
    @Test
    public void subTestGetPackageNameAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getPackageNameAsLocalTime());
        System.out.println("Package name i.e. technical flavor of the content AS LocalTime === " + jMetaDataGeneral.getPackageNameAsLocalTime());
    }

   /**
    * Test getPackageNameAsString() method.
    */
    @Test
    public void subTestGetPackageNameAsString() {
        assertEquals(null, this.jMetaDataGeneral.getPackageNameAsString());
        System.out.println("Package name i.e. technical flavor of the content AS String === " + jMetaDataGeneral.getPackageNameAsString());
    }

   /**
    * Test getPackageNameAsBoolean() method.
    */
    @Test
    public void subTestGetPackageNameAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getPackageNameAsBoolean());
        System.out.println("Package name i.e. technical flavor of the content AS Boolean === " + jMetaDataGeneral.getPackageNameAsBoolean());
    }

   /**
    * Test getPackageNameAsBigInteger() method.
    */
    @Test
    public void subTestGetPackageNameAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getPackageNameAsBigInteger());
        System.out.println("Package name i.e. technical flavor of the content AS BigInteger === " + jMetaDataGeneral.getPackageNameAsBigInteger());
    }

   /**
    * Test getPackageNameAsURL() method.
    */
    @Test
    public void subTestGetPackageNameAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getPackageNameAsURL());
        System.out.println("Package name i.e. technical flavor of the content AS URL === " + jMetaDataGeneral.getPackageNameAsURL());
    }

   /**
    * Test getOriginalSourceMediumAsInteger() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceMediumAsInteger());
        System.out.println("Original medium of the material, e.g. vinyl, Audio-CD, Super8 or BetaMax AS Integer === " + jMetaDataGeneral.getOriginalSourceMediumAsInteger());
    }

   /**
    * Test getOriginalSourceMediumAsLong() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceMediumAsLong());
        System.out.println("Original medium of the material, e.g. vinyl, Audio-CD, Super8 or BetaMax AS Long === " + jMetaDataGeneral.getOriginalSourceMediumAsLong());
    }

   /**
    * Test getOriginalSourceMediumAsLocalDateTime() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceMediumAsLocalDateTime());
        System.out.println("Original medium of the material, e.g. vinyl, Audio-CD, Super8 or BetaMax AS LocalDateTime === " + jMetaDataGeneral.getOriginalSourceMediumAsLocalDateTime());
    }

   /**
    * Test getOriginalSourceMediumAsLocalTime() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceMediumAsLocalTime());
        System.out.println("Original medium of the material, e.g. vinyl, Audio-CD, Super8 or BetaMax AS LocalTime === " + jMetaDataGeneral.getOriginalSourceMediumAsLocalTime());
    }

   /**
    * Test getOriginalSourceMediumAsString() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumAsString() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceMediumAsString());
        System.out.println("Original medium of the material, e.g. vinyl, Audio-CD, Super8 or BetaMax AS String === " + jMetaDataGeneral.getOriginalSourceMediumAsString());
    }

   /**
    * Test getOriginalSourceMediumAsBoolean() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceMediumAsBoolean());
        System.out.println("Original medium of the material, e.g. vinyl, Audio-CD, Super8 or BetaMax AS Boolean === " + jMetaDataGeneral.getOriginalSourceMediumAsBoolean());
    }

   /**
    * Test getOriginalSourceMediumAsBigInteger() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceMediumAsBigInteger());
        System.out.println("Original medium of the material, e.g. vinyl, Audio-CD, Super8 or BetaMax AS BigInteger === " + jMetaDataGeneral.getOriginalSourceMediumAsBigInteger());
    }

   /**
    * Test getOriginalSourceMediumAsURL() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceMediumAsURL());
        System.out.println("Original medium of the material, e.g. vinyl, Audio-CD, Super8 or BetaMax AS URL === " + jMetaDataGeneral.getOriginalSourceMediumAsURL());
    }

   /**
    * Test getFileNameAsInteger() method.
    */
    @Test
    public void subTestGetFileNameAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFileNameAsInteger());
        System.out.println("File name only AS Integer === " + jMetaDataGeneral.getFileNameAsInteger());
    }

   /**
    * Test getFileNameAsLong() method.
    */
    @Test
    public void subTestGetFileNameAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getFileNameAsLong());
        System.out.println("File name only AS Long === " + jMetaDataGeneral.getFileNameAsLong());
    }

   /**
    * Test getFileNameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFileNameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getFileNameAsLocalDateTime());
        System.out.println("File name only AS LocalDateTime === " + jMetaDataGeneral.getFileNameAsLocalDateTime());
    }

   /**
    * Test getFileNameAsLocalTime() method.
    */
    @Test
    public void subTestGetFileNameAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getFileNameAsLocalTime());
        System.out.println("File name only AS LocalTime === " + jMetaDataGeneral.getFileNameAsLocalTime());
    }

   /**
    * Test getFileNameAsString() method.
    */
    @Test
    public void subTestGetFileNameAsString() {
        assertEquals(null, this.jMetaDataGeneral.getFileNameAsString());
        System.out.println("File name only AS String === " + jMetaDataGeneral.getFileNameAsString());
    }

   /**
    * Test getFileNameAsBoolean() method.
    */
    @Test
    public void subTestGetFileNameAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getFileNameAsBoolean());
        System.out.println("File name only AS Boolean === " + jMetaDataGeneral.getFileNameAsBoolean());
    }

   /**
    * Test getFileNameAsBigInteger() method.
    */
    @Test
    public void subTestGetFileNameAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFileNameAsBigInteger());
        System.out.println("File name only AS BigInteger === " + jMetaDataGeneral.getFileNameAsBigInteger());
    }

   /**
    * Test getFileNameAsURL() method.
    */
    @Test
    public void subTestGetFileNameAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getFileNameAsURL());
        System.out.println("File name only AS URL === " + jMetaDataGeneral.getFileNameAsURL());
    }

   /**
    * Test getComicPositionTotalAsInteger() method.
    */
    @Test
    public void subTestGetComicPositionTotalAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getComicPositionTotalAsInteger());
        System.out.println("Comic/Position_Total AS Integer === " + jMetaDataGeneral.getComicPositionTotalAsInteger());
    }

   /**
    * Test getComicPositionTotalAsLong() method.
    */
    @Test
    public void subTestGetComicPositionTotalAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getComicPositionTotalAsLong());
        System.out.println("Comic/Position_Total AS Long === " + jMetaDataGeneral.getComicPositionTotalAsLong());
    }

   /**
    * Test getComicPositionTotalAsLocalDateTime() method.
    */
    @Test
    public void subTestGetComicPositionTotalAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getComicPositionTotalAsLocalDateTime());
        System.out.println("Comic/Position_Total AS LocalDateTime === " + jMetaDataGeneral.getComicPositionTotalAsLocalDateTime());
    }

   /**
    * Test getComicPositionTotalAsLocalTime() method.
    */
    @Test
    public void subTestGetComicPositionTotalAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getComicPositionTotalAsLocalTime());
        System.out.println("Comic/Position_Total AS LocalTime === " + jMetaDataGeneral.getComicPositionTotalAsLocalTime());
    }

   /**
    * Test getComicPositionTotalAsString() method.
    */
    @Test
    public void subTestGetComicPositionTotalAsString() {
        assertEquals(null, this.jMetaDataGeneral.getComicPositionTotalAsString());
        System.out.println("Comic/Position_Total AS String === " + jMetaDataGeneral.getComicPositionTotalAsString());
    }

   /**
    * Test getComicPositionTotalAsBoolean() method.
    */
    @Test
    public void subTestGetComicPositionTotalAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getComicPositionTotalAsBoolean());
        System.out.println("Comic/Position_Total AS Boolean === " + jMetaDataGeneral.getComicPositionTotalAsBoolean());
    }

   /**
    * Test getComicPositionTotalAsBigInteger() method.
    */
    @Test
    public void subTestGetComicPositionTotalAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getComicPositionTotalAsBigInteger());
        System.out.println("Comic/Position_Total AS BigInteger === " + jMetaDataGeneral.getComicPositionTotalAsBigInteger());
    }

   /**
    * Test getComicPositionTotalAsURL() method.
    */
    @Test
    public void subTestGetComicPositionTotalAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getComicPositionTotalAsURL());
        System.out.println("Comic/Position_Total AS URL === " + jMetaDataGeneral.getComicPositionTotalAsURL());
    }

   /**
    * Test getMusicByAsInteger() method.
    */
    @Test
    public void subTestGetMusicByAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getMusicByAsInteger());
        System.out.println("Main music-artist for a movie AS Integer === " + jMetaDataGeneral.getMusicByAsInteger());
    }

   /**
    * Test getMusicByAsLong() method.
    */
    @Test
    public void subTestGetMusicByAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getMusicByAsLong());
        System.out.println("Main music-artist for a movie AS Long === " + jMetaDataGeneral.getMusicByAsLong());
    }

   /**
    * Test getMusicByAsLocalDateTime() method.
    */
    @Test
    public void subTestGetMusicByAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getMusicByAsLocalDateTime());
        System.out.println("Main music-artist for a movie AS LocalDateTime === " + jMetaDataGeneral.getMusicByAsLocalDateTime());
    }

   /**
    * Test getMusicByAsLocalTime() method.
    */
    @Test
    public void subTestGetMusicByAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getMusicByAsLocalTime());
        System.out.println("Main music-artist for a movie AS LocalTime === " + jMetaDataGeneral.getMusicByAsLocalTime());
    }

   /**
    * Test getMusicByAsString() method.
    */
    @Test
    public void subTestGetMusicByAsString() {
        assertEquals(null, this.jMetaDataGeneral.getMusicByAsString());
        System.out.println("Main music-artist for a movie AS String === " + jMetaDataGeneral.getMusicByAsString());
    }

   /**
    * Test getMusicByAsBoolean() method.
    */
    @Test
    public void subTestGetMusicByAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getMusicByAsBoolean());
        System.out.println("Main music-artist for a movie AS Boolean === " + jMetaDataGeneral.getMusicByAsBoolean());
    }

   /**
    * Test getMusicByAsBigInteger() method.
    */
    @Test
    public void subTestGetMusicByAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getMusicByAsBigInteger());
        System.out.println("Main music-artist for a movie AS BigInteger === " + jMetaDataGeneral.getMusicByAsBigInteger());
    }

   /**
    * Test getMusicByAsURL() method.
    */
    @Test
    public void subTestGetMusicByAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getMusicByAsURL());
        System.out.println("Main music-artist for a movie AS URL === " + jMetaDataGeneral.getMusicByAsURL());
    }

   /**
    * Test getWrittenDateAsInteger() method.
    */
    @Test
    public void subTestGetWrittenDateAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getWrittenDateAsInteger());
        System.out.println("The time/date/year that the composition of the music/script began. AS Integer === " + jMetaDataGeneral.getWrittenDateAsInteger());
    }

   /**
    * Test getWrittenDateAsLong() method.
    */
    @Test
    public void subTestGetWrittenDateAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getWrittenDateAsLong());
        System.out.println("The time/date/year that the composition of the music/script began. AS Long === " + jMetaDataGeneral.getWrittenDateAsLong());
    }

   /**
    * Test getWrittenDateAsLocalDateTime() method.
    */
    @Test
    public void subTestGetWrittenDateAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getWrittenDateAsLocalDateTime());
        System.out.println("The time/date/year that the composition of the music/script began. AS LocalDateTime === " + jMetaDataGeneral.getWrittenDateAsLocalDateTime());
    }

   /**
    * Test getWrittenDateAsLocalTime() method.
    */
    @Test
    public void subTestGetWrittenDateAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getWrittenDateAsLocalTime());
        System.out.println("The time/date/year that the composition of the music/script began. AS LocalTime === " + jMetaDataGeneral.getWrittenDateAsLocalTime());
    }

   /**
    * Test getWrittenDateAsString() method.
    */
    @Test
    public void subTestGetWrittenDateAsString() {
        assertEquals(null, this.jMetaDataGeneral.getWrittenDateAsString());
        System.out.println("The time/date/year that the composition of the music/script began. AS String === " + jMetaDataGeneral.getWrittenDateAsString());
    }

   /**
    * Test getWrittenDateAsBoolean() method.
    */
    @Test
    public void subTestGetWrittenDateAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getWrittenDateAsBoolean());
        System.out.println("The time/date/year that the composition of the music/script began. AS Boolean === " + jMetaDataGeneral.getWrittenDateAsBoolean());
    }

   /**
    * Test getWrittenDateAsBigInteger() method.
    */
    @Test
    public void subTestGetWrittenDateAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getWrittenDateAsBigInteger());
        System.out.println("The time/date/year that the composition of the music/script began. AS BigInteger === " + jMetaDataGeneral.getWrittenDateAsBigInteger());
    }

   /**
    * Test getWrittenDateAsURL() method.
    */
    @Test
    public void subTestGetWrittenDateAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getWrittenDateAsURL());
        System.out.println("The time/date/year that the composition of the music/script began. AS URL === " + jMetaDataGeneral.getWrittenDateAsURL());
    }

   /**
    * Test getFileModifiedDateAsInteger() method.
    */
    @Test
    public void subTestGetFileModifiedDateAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFileModifiedDateAsInteger());
        System.out.println("The time that the file was modified on the file system AS Integer === " + jMetaDataGeneral.getFileModifiedDateAsInteger());
    }

   /**
    * Test getFileModifiedDateAsLong() method.
    */
    @Test
    public void subTestGetFileModifiedDateAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getFileModifiedDateAsLong());
        System.out.println("The time that the file was modified on the file system AS Long === " + jMetaDataGeneral.getFileModifiedDateAsLong());
    }

   /**
    * Test getFileModifiedDateAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFileModifiedDateAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getFileModifiedDateAsLocalDateTime());
        System.out.println("The time that the file was modified on the file system AS LocalDateTime === " + jMetaDataGeneral.getFileModifiedDateAsLocalDateTime());
    }

   /**
    * Test getFileModifiedDateAsLocalTime() method.
    */
    @Test
    public void subTestGetFileModifiedDateAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getFileModifiedDateAsLocalTime());
        System.out.println("The time that the file was modified on the file system AS LocalTime === " + jMetaDataGeneral.getFileModifiedDateAsLocalTime());
    }

   /**
    * Test getFileModifiedDateAsString() method.
    */
    @Test
    public void subTestGetFileModifiedDateAsString() {
        assertEquals(null, this.jMetaDataGeneral.getFileModifiedDateAsString());
        System.out.println("The time that the file was modified on the file system AS String === " + jMetaDataGeneral.getFileModifiedDateAsString());
    }

   /**
    * Test getFileModifiedDateAsBoolean() method.
    */
    @Test
    public void subTestGetFileModifiedDateAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getFileModifiedDateAsBoolean());
        System.out.println("The time that the file was modified on the file system AS Boolean === " + jMetaDataGeneral.getFileModifiedDateAsBoolean());
    }

   /**
    * Test getFileModifiedDateAsBigInteger() method.
    */
    @Test
    public void subTestGetFileModifiedDateAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFileModifiedDateAsBigInteger());
        System.out.println("The time that the file was modified on the file system AS BigInteger === " + jMetaDataGeneral.getFileModifiedDateAsBigInteger());
    }

   /**
    * Test getFileModifiedDateAsURL() method.
    */
    @Test
    public void subTestGetFileModifiedDateAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getFileModifiedDateAsURL());
        System.out.println("The time that the file was modified on the file system AS URL === " + jMetaDataGeneral.getFileModifiedDateAsURL());
    }

   /**
    * Test getEncodedLibraryVersionAsInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryVersionAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryVersionAsInteger());
        System.out.println("Version of encoding-software AS Integer === " + jMetaDataGeneral.getEncodedLibraryVersionAsInteger());
    }

   /**
    * Test getEncodedLibraryVersionAsLong() method.
    */
    @Test
    public void subTestGetEncodedLibraryVersionAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryVersionAsLong());
        System.out.println("Version of encoding-software AS Long === " + jMetaDataGeneral.getEncodedLibraryVersionAsLong());
    }

   /**
    * Test getEncodedLibraryVersionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryVersionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryVersionAsLocalDateTime());
        System.out.println("Version of encoding-software AS LocalDateTime === " + jMetaDataGeneral.getEncodedLibraryVersionAsLocalDateTime());
    }

   /**
    * Test getEncodedLibraryVersionAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryVersionAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryVersionAsLocalTime());
        System.out.println("Version of encoding-software AS LocalTime === " + jMetaDataGeneral.getEncodedLibraryVersionAsLocalTime());
    }

   /**
    * Test getEncodedLibraryVersionAsString() method.
    */
    @Test
    public void subTestGetEncodedLibraryVersionAsString() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryVersionAsString());
        System.out.println("Version of encoding-software AS String === " + jMetaDataGeneral.getEncodedLibraryVersionAsString());
    }

   /**
    * Test getEncodedLibraryVersionAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedLibraryVersionAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryVersionAsBoolean());
        System.out.println("Version of encoding-software AS Boolean === " + jMetaDataGeneral.getEncodedLibraryVersionAsBoolean());
    }

   /**
    * Test getEncodedLibraryVersionAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryVersionAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryVersionAsBigInteger());
        System.out.println("Version of encoding-software AS BigInteger === " + jMetaDataGeneral.getEncodedLibraryVersionAsBigInteger());
    }

   /**
    * Test getEncodedLibraryVersionAsURL() method.
    */
    @Test
    public void subTestGetEncodedLibraryVersionAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryVersionAsURL());
        System.out.println("Version of encoding-software AS URL === " + jMetaDataGeneral.getEncodedLibraryVersionAsURL());
    }

   /**
    * Test getCodecIDInfoAsInteger() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDInfoAsInteger());
        System.out.println("Info about this codec AS Integer === " + jMetaDataGeneral.getCodecIDInfoAsInteger());
    }

   /**
    * Test getCodecIDInfoAsLong() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDInfoAsLong());
        System.out.println("Info about this codec AS Long === " + jMetaDataGeneral.getCodecIDInfoAsLong());
    }

   /**
    * Test getCodecIDInfoAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDInfoAsLocalDateTime());
        System.out.println("Info about this codec AS LocalDateTime === " + jMetaDataGeneral.getCodecIDInfoAsLocalDateTime());
    }

   /**
    * Test getCodecIDInfoAsLocalTime() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDInfoAsLocalTime());
        System.out.println("Info about this codec AS LocalTime === " + jMetaDataGeneral.getCodecIDInfoAsLocalTime());
    }

   /**
    * Test getCodecIDInfoAsString() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsString() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDInfoAsString());
        System.out.println("Info about this codec AS String === " + jMetaDataGeneral.getCodecIDInfoAsString());
    }

   /**
    * Test getCodecIDInfoAsBoolean() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDInfoAsBoolean());
        System.out.println("Info about this codec AS Boolean === " + jMetaDataGeneral.getCodecIDInfoAsBoolean());
    }

   /**
    * Test getCodecIDInfoAsBigInteger() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDInfoAsBigInteger());
        System.out.println("Info about this codec AS BigInteger === " + jMetaDataGeneral.getCodecIDInfoAsBigInteger());
    }

   /**
    * Test getCodecIDInfoAsURL() method.
    */
    @Test
    public void subTestGetCodecIDInfoAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDInfoAsURL());
        System.out.println("Info about this codec AS URL === " + jMetaDataGeneral.getCodecIDInfoAsURL());
    }

   /**
    * Test getStreamSizeAsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeAsInteger());
        System.out.println("Stream size in bytes AS Integer === " + jMetaDataGeneral.getStreamSizeAsInteger());
    }

   /**
    * Test getStreamSizeAsLong() method.
    */
    @Test
    public void subTestGetStreamSizeAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeAsLong());
        System.out.println("Stream size in bytes AS Long === " + jMetaDataGeneral.getStreamSizeAsLong());
    }

   /**
    * Test getStreamSizeAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeAsLocalDateTime());
        System.out.println("Stream size in bytes AS LocalDateTime === " + jMetaDataGeneral.getStreamSizeAsLocalDateTime());
    }

   /**
    * Test getStreamSizeAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeAsLocalTime());
        System.out.println("Stream size in bytes AS LocalTime === " + jMetaDataGeneral.getStreamSizeAsLocalTime());
    }

   /**
    * Test getStreamSizeAsString() method.
    */
    @Test
    public void subTestGetStreamSizeAsString() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeAsString());
        System.out.println("Stream size in bytes AS String === " + jMetaDataGeneral.getStreamSizeAsString());
    }

   /**
    * Test getStreamSizeAsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeAsBoolean());
        System.out.println("Stream size in bytes AS Boolean === " + jMetaDataGeneral.getStreamSizeAsBoolean());
    }

   /**
    * Test getStreamSizeAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeAsBigInteger());
        System.out.println("Stream size in bytes AS BigInteger === " + jMetaDataGeneral.getStreamSizeAsBigInteger());
    }

   /**
    * Test getStreamSizeAsURL() method.
    */
    @Test
    public void subTestGetStreamSizeAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeAsURL());
        System.out.println("Stream size in bytes AS URL === " + jMetaDataGeneral.getStreamSizeAsURL());
    }

   /**
    * Test getSeasonAsInteger() method.
    */
    @Test
    public void subTestGetSeasonAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getSeasonAsInteger());
        System.out.println("Name of the season, e.g. Strawars first Trilogy, Season 1 AS Integer === " + jMetaDataGeneral.getSeasonAsInteger());
    }

   /**
    * Test getSeasonAsLong() method.
    */
    @Test
    public void subTestGetSeasonAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getSeasonAsLong());
        System.out.println("Name of the season, e.g. Strawars first Trilogy, Season 1 AS Long === " + jMetaDataGeneral.getSeasonAsLong());
    }

   /**
    * Test getSeasonAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSeasonAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getSeasonAsLocalDateTime());
        System.out.println("Name of the season, e.g. Strawars first Trilogy, Season 1 AS LocalDateTime === " + jMetaDataGeneral.getSeasonAsLocalDateTime());
    }

   /**
    * Test getSeasonAsLocalTime() method.
    */
    @Test
    public void subTestGetSeasonAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getSeasonAsLocalTime());
        System.out.println("Name of the season, e.g. Strawars first Trilogy, Season 1 AS LocalTime === " + jMetaDataGeneral.getSeasonAsLocalTime());
    }

   /**
    * Test getSeasonAsString() method.
    */
    @Test
    public void subTestGetSeasonAsString() {
        assertEquals(null, this.jMetaDataGeneral.getSeasonAsString());
        System.out.println("Name of the season, e.g. Strawars first Trilogy, Season 1 AS String === " + jMetaDataGeneral.getSeasonAsString());
    }

   /**
    * Test getSeasonAsBoolean() method.
    */
    @Test
    public void subTestGetSeasonAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getSeasonAsBoolean());
        System.out.println("Name of the season, e.g. Strawars first Trilogy, Season 1 AS Boolean === " + jMetaDataGeneral.getSeasonAsBoolean());
    }

   /**
    * Test getSeasonAsBigInteger() method.
    */
    @Test
    public void subTestGetSeasonAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getSeasonAsBigInteger());
        System.out.println("Name of the season, e.g. Strawars first Trilogy, Season 1 AS BigInteger === " + jMetaDataGeneral.getSeasonAsBigInteger());
    }

   /**
    * Test getSeasonAsURL() method.
    */
    @Test
    public void subTestGetSeasonAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getSeasonAsURL());
        System.out.println("Name of the season, e.g. Strawars first Trilogy, Season 1 AS URL === " + jMetaDataGeneral.getSeasonAsURL());
    }

   /**
    * Test getCostumeDesignerAsInteger() method.
    */
    @Test
    public void subTestGetCostumeDesignerAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCostumeDesignerAsInteger());
        System.out.println("The name of the costume designer. AS Integer === " + jMetaDataGeneral.getCostumeDesignerAsInteger());
    }

   /**
    * Test getCostumeDesignerAsLong() method.
    */
    @Test
    public void subTestGetCostumeDesignerAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getCostumeDesignerAsLong());
        System.out.println("The name of the costume designer. AS Long === " + jMetaDataGeneral.getCostumeDesignerAsLong());
    }

   /**
    * Test getCostumeDesignerAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCostumeDesignerAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getCostumeDesignerAsLocalDateTime());
        System.out.println("The name of the costume designer. AS LocalDateTime === " + jMetaDataGeneral.getCostumeDesignerAsLocalDateTime());
    }

   /**
    * Test getCostumeDesignerAsLocalTime() method.
    */
    @Test
    public void subTestGetCostumeDesignerAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getCostumeDesignerAsLocalTime());
        System.out.println("The name of the costume designer. AS LocalTime === " + jMetaDataGeneral.getCostumeDesignerAsLocalTime());
    }

   /**
    * Test getCostumeDesignerAsString() method.
    */
    @Test
    public void subTestGetCostumeDesignerAsString() {
        assertEquals(null, this.jMetaDataGeneral.getCostumeDesignerAsString());
        System.out.println("The name of the costume designer. AS String === " + jMetaDataGeneral.getCostumeDesignerAsString());
    }

   /**
    * Test getCostumeDesignerAsBoolean() method.
    */
    @Test
    public void subTestGetCostumeDesignerAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getCostumeDesignerAsBoolean());
        System.out.println("The name of the costume designer. AS Boolean === " + jMetaDataGeneral.getCostumeDesignerAsBoolean());
    }

   /**
    * Test getCostumeDesignerAsBigInteger() method.
    */
    @Test
    public void subTestGetCostumeDesignerAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCostumeDesignerAsBigInteger());
        System.out.println("The name of the costume designer. AS BigInteger === " + jMetaDataGeneral.getCostumeDesignerAsBigInteger());
    }

   /**
    * Test getCostumeDesignerAsURL() method.
    */
    @Test
    public void subTestGetCostumeDesignerAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getCostumeDesignerAsURL());
        System.out.println("The name of the costume designer. AS URL === " + jMetaDataGeneral.getCostumeDesignerAsURL());
    }

   /**
    * Test getOriginalPerformerAsInteger() method.
    */
    @Test
    public void subTestGetOriginalPerformerAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalPerformerAsInteger());
        System.out.println("Original artist(s)/performer(s). AS Integer === " + jMetaDataGeneral.getOriginalPerformerAsInteger());
    }

   /**
    * Test getOriginalPerformerAsLong() method.
    */
    @Test
    public void subTestGetOriginalPerformerAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalPerformerAsLong());
        System.out.println("Original artist(s)/performer(s). AS Long === " + jMetaDataGeneral.getOriginalPerformerAsLong());
    }

   /**
    * Test getOriginalPerformerAsLocalDateTime() method.
    */
    @Test
    public void subTestGetOriginalPerformerAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalPerformerAsLocalDateTime());
        System.out.println("Original artist(s)/performer(s). AS LocalDateTime === " + jMetaDataGeneral.getOriginalPerformerAsLocalDateTime());
    }

   /**
    * Test getOriginalPerformerAsLocalTime() method.
    */
    @Test
    public void subTestGetOriginalPerformerAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalPerformerAsLocalTime());
        System.out.println("Original artist(s)/performer(s). AS LocalTime === " + jMetaDataGeneral.getOriginalPerformerAsLocalTime());
    }

   /**
    * Test getOriginalPerformerAsString() method.
    */
    @Test
    public void subTestGetOriginalPerformerAsString() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalPerformerAsString());
        System.out.println("Original artist(s)/performer(s). AS String === " + jMetaDataGeneral.getOriginalPerformerAsString());
    }

   /**
    * Test getOriginalPerformerAsBoolean() method.
    */
    @Test
    public void subTestGetOriginalPerformerAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalPerformerAsBoolean());
        System.out.println("Original artist(s)/performer(s). AS Boolean === " + jMetaDataGeneral.getOriginalPerformerAsBoolean());
    }

   /**
    * Test getOriginalPerformerAsBigInteger() method.
    */
    @Test
    public void subTestGetOriginalPerformerAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalPerformerAsBigInteger());
        System.out.println("Original artist(s)/performer(s). AS BigInteger === " + jMetaDataGeneral.getOriginalPerformerAsBigInteger());
    }

   /**
    * Test getOriginalPerformerAsURL() method.
    */
    @Test
    public void subTestGetOriginalPerformerAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalPerformerAsURL());
        System.out.println("Original artist(s)/performer(s). AS URL === " + jMetaDataGeneral.getOriginalPerformerAsURL());
    }

   /**
    * Test getOtherFormatWithHintListAsInteger() method.
    */
    @Test
    public void subTestGetOtherFormatWithHintListAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOtherFormatWithHintListAsInteger());
        System.out.println("Other formats in this file with popular name (hint), separated by / AS Integer === " + jMetaDataGeneral.getOtherFormatWithHintListAsInteger());
    }

   /**
    * Test getOtherFormatWithHintListAsLong() method.
    */
    @Test
    public void subTestGetOtherFormatWithHintListAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getOtherFormatWithHintListAsLong());
        System.out.println("Other formats in this file with popular name (hint), separated by / AS Long === " + jMetaDataGeneral.getOtherFormatWithHintListAsLong());
    }

   /**
    * Test getOtherFormatWithHintListAsLocalDateTime() method.
    */
    @Test
    public void subTestGetOtherFormatWithHintListAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getOtherFormatWithHintListAsLocalDateTime());
        System.out.println("Other formats in this file with popular name (hint), separated by / AS LocalDateTime === " + jMetaDataGeneral.getOtherFormatWithHintListAsLocalDateTime());
    }

   /**
    * Test getOtherFormatWithHintListAsLocalTime() method.
    */
    @Test
    public void subTestGetOtherFormatWithHintListAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getOtherFormatWithHintListAsLocalTime());
        System.out.println("Other formats in this file with popular name (hint), separated by / AS LocalTime === " + jMetaDataGeneral.getOtherFormatWithHintListAsLocalTime());
    }

   /**
    * Test getOtherFormatWithHintListAsString() method.
    */
    @Test
    public void subTestGetOtherFormatWithHintListAsString() {
        assertEquals(null, this.jMetaDataGeneral.getOtherFormatWithHintListAsString());
        System.out.println("Other formats in this file with popular name (hint), separated by / AS String === " + jMetaDataGeneral.getOtherFormatWithHintListAsString());
    }

   /**
    * Test getOtherFormatWithHintListAsBoolean() method.
    */
    @Test
    public void subTestGetOtherFormatWithHintListAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getOtherFormatWithHintListAsBoolean());
        System.out.println("Other formats in this file with popular name (hint), separated by / AS Boolean === " + jMetaDataGeneral.getOtherFormatWithHintListAsBoolean());
    }

   /**
    * Test getOtherFormatWithHintListAsBigInteger() method.
    */
    @Test
    public void subTestGetOtherFormatWithHintListAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOtherFormatWithHintListAsBigInteger());
        System.out.println("Other formats in this file with popular name (hint), separated by / AS BigInteger === " + jMetaDataGeneral.getOtherFormatWithHintListAsBigInteger());
    }

   /**
    * Test getOtherFormatWithHintListAsURL() method.
    */
    @Test
    public void subTestGetOtherFormatWithHintListAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getOtherFormatWithHintListAsURL());
        System.out.println("Other formats in this file with popular name (hint), separated by / AS URL === " + jMetaDataGeneral.getOtherFormatWithHintListAsURL());
    }

   /**
    * Test getFormatInfoAsInteger() method.
    */
    @Test
    public void subTestGetFormatInfoAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFormatInfoAsInteger());
        System.out.println("Info about this Format AS Integer === " + jMetaDataGeneral.getFormatInfoAsInteger());
    }

   /**
    * Test getFormatInfoAsLong() method.
    */
    @Test
    public void subTestGetFormatInfoAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getFormatInfoAsLong());
        System.out.println("Info about this Format AS Long === " + jMetaDataGeneral.getFormatInfoAsLong());
    }

   /**
    * Test getFormatInfoAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatInfoAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getFormatInfoAsLocalDateTime());
        System.out.println("Info about this Format AS LocalDateTime === " + jMetaDataGeneral.getFormatInfoAsLocalDateTime());
    }

   /**
    * Test getFormatInfoAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatInfoAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getFormatInfoAsLocalTime());
        System.out.println("Info about this Format AS LocalTime === " + jMetaDataGeneral.getFormatInfoAsLocalTime());
    }

   /**
    * Test getFormatInfoAsString() method.
    */
    @Test
    public void subTestGetFormatInfoAsString() {
        assertEquals(null, this.jMetaDataGeneral.getFormatInfoAsString());
        System.out.println("Info about this Format AS String === " + jMetaDataGeneral.getFormatInfoAsString());
    }

   /**
    * Test getFormatInfoAsBoolean() method.
    */
    @Test
    public void subTestGetFormatInfoAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getFormatInfoAsBoolean());
        System.out.println("Info about this Format AS Boolean === " + jMetaDataGeneral.getFormatInfoAsBoolean());
    }

   /**
    * Test getFormatInfoAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatInfoAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFormatInfoAsBigInteger());
        System.out.println("Info about this Format AS BigInteger === " + jMetaDataGeneral.getFormatInfoAsBigInteger());
    }

   /**
    * Test getFormatInfoAsURL() method.
    */
    @Test
    public void subTestGetFormatInfoAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getFormatInfoAsURL());
        System.out.println("Info about this Format AS URL === " + jMetaDataGeneral.getFormatInfoAsURL());
    }

   /**
    * Test getInterleavedAsInteger() method.
    */
    @Test
    public void subTestGetInterleavedAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getInterleavedAsInteger());
        System.out.println("If Audio and video are muxed AS Integer === " + jMetaDataGeneral.getInterleavedAsInteger());
    }

   /**
    * Test getInterleavedAsLong() method.
    */
    @Test
    public void subTestGetInterleavedAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getInterleavedAsLong());
        System.out.println("If Audio and video are muxed AS Long === " + jMetaDataGeneral.getInterleavedAsLong());
    }

   /**
    * Test getInterleavedAsLocalDateTime() method.
    */
    @Test
    public void subTestGetInterleavedAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getInterleavedAsLocalDateTime());
        System.out.println("If Audio and video are muxed AS LocalDateTime === " + jMetaDataGeneral.getInterleavedAsLocalDateTime());
    }

   /**
    * Test getInterleavedAsLocalTime() method.
    */
    @Test
    public void subTestGetInterleavedAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getInterleavedAsLocalTime());
        System.out.println("If Audio and video are muxed AS LocalTime === " + jMetaDataGeneral.getInterleavedAsLocalTime());
    }

   /**
    * Test getInterleavedAsString() method.
    */
    @Test
    public void subTestGetInterleavedAsString() {
        assertEquals(null, this.jMetaDataGeneral.getInterleavedAsString());
        System.out.println("If Audio and video are muxed AS String === " + jMetaDataGeneral.getInterleavedAsString());
    }

   /**
    * Test getInterleavedAsBoolean() method.
    */
    @Test
    public void subTestGetInterleavedAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getInterleavedAsBoolean());
        System.out.println("If Audio and video are muxed AS Boolean === " + jMetaDataGeneral.getInterleavedAsBoolean());
    }

   /**
    * Test getInterleavedAsBigInteger() method.
    */
    @Test
    public void subTestGetInterleavedAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getInterleavedAsBigInteger());
        System.out.println("If Audio and video are muxed AS BigInteger === " + jMetaDataGeneral.getInterleavedAsBigInteger());
    }

   /**
    * Test getInterleavedAsURL() method.
    */
    @Test
    public void subTestGetInterleavedAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getInterleavedAsURL());
        System.out.println("If Audio and video are muxed AS URL === " + jMetaDataGeneral.getInterleavedAsURL());
    }

   /**
    * Test getCodecIDUrlAsInteger() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDUrlAsInteger());
        System.out.println("A link to more details about this codec ID AS Integer === " + jMetaDataGeneral.getCodecIDUrlAsInteger());
    }

   /**
    * Test getCodecIDUrlAsLong() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDUrlAsLong());
        System.out.println("A link to more details about this codec ID AS Long === " + jMetaDataGeneral.getCodecIDUrlAsLong());
    }

   /**
    * Test getCodecIDUrlAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDUrlAsLocalDateTime());
        System.out.println("A link to more details about this codec ID AS LocalDateTime === " + jMetaDataGeneral.getCodecIDUrlAsLocalDateTime());
    }

   /**
    * Test getCodecIDUrlAsLocalTime() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDUrlAsLocalTime());
        System.out.println("A link to more details about this codec ID AS LocalTime === " + jMetaDataGeneral.getCodecIDUrlAsLocalTime());
    }

   /**
    * Test getCodecIDUrlAsString() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsString() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDUrlAsString());
        System.out.println("A link to more details about this codec ID AS String === " + jMetaDataGeneral.getCodecIDUrlAsString());
    }

   /**
    * Test getCodecIDUrlAsBoolean() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDUrlAsBoolean());
        System.out.println("A link to more details about this codec ID AS Boolean === " + jMetaDataGeneral.getCodecIDUrlAsBoolean());
    }

   /**
    * Test getCodecIDUrlAsBigInteger() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDUrlAsBigInteger());
        System.out.println("A link to more details about this codec ID AS BigInteger === " + jMetaDataGeneral.getCodecIDUrlAsBigInteger());
    }

   /**
    * Test getCodecIDUrlAsURL() method.
    */
    @Test
    public void subTestGetCodecIDUrlAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDUrlAsURL());
        System.out.println("A link to more details about this codec ID AS URL === " + jMetaDataGeneral.getCodecIDUrlAsURL());
    }

   /**
    * Test getEncryptionModeAsInteger() method.
    */
    @Test
    public void subTestGetEncryptionModeAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionModeAsInteger());
        System.out.println("Encryption_Mode AS Integer === " + jMetaDataGeneral.getEncryptionModeAsInteger());
    }

   /**
    * Test getEncryptionModeAsLong() method.
    */
    @Test
    public void subTestGetEncryptionModeAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionModeAsLong());
        System.out.println("Encryption_Mode AS Long === " + jMetaDataGeneral.getEncryptionModeAsLong());
    }

   /**
    * Test getEncryptionModeAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncryptionModeAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionModeAsLocalDateTime());
        System.out.println("Encryption_Mode AS LocalDateTime === " + jMetaDataGeneral.getEncryptionModeAsLocalDateTime());
    }

   /**
    * Test getEncryptionModeAsLocalTime() method.
    */
    @Test
    public void subTestGetEncryptionModeAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionModeAsLocalTime());
        System.out.println("Encryption_Mode AS LocalTime === " + jMetaDataGeneral.getEncryptionModeAsLocalTime());
    }

   /**
    * Test getEncryptionModeAsString() method.
    */
    @Test
    public void subTestGetEncryptionModeAsString() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionModeAsString());
        System.out.println("Encryption_Mode AS String === " + jMetaDataGeneral.getEncryptionModeAsString());
    }

   /**
    * Test getEncryptionModeAsBoolean() method.
    */
    @Test
    public void subTestGetEncryptionModeAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionModeAsBoolean());
        System.out.println("Encryption_Mode AS Boolean === " + jMetaDataGeneral.getEncryptionModeAsBoolean());
    }

   /**
    * Test getEncryptionModeAsBigInteger() method.
    */
    @Test
    public void subTestGetEncryptionModeAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionModeAsBigInteger());
        System.out.println("Encryption_Mode AS BigInteger === " + jMetaDataGeneral.getEncryptionModeAsBigInteger());
    }

   /**
    * Test getEncryptionModeAsURL() method.
    */
    @Test
    public void subTestGetEncryptionModeAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionModeAsURL());
        System.out.println("Encryption_Mode AS URL === " + jMetaDataGeneral.getEncryptionModeAsURL());
    }

   /**
    * Test getWrittenLocationAsInteger() method.
    */
    @Test
    public void subTestGetWrittenLocationAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getWrittenLocationAsInteger());
        System.out.println("Location that the item was originaly designed/written. Information should be stored in the following format: country code, state/province, city where the coutry code is the same 2 octets as in Internet domains, or possibly ISO-3166. e.g. US, Texas, Austin or US, , Austin. AS Integer === " + jMetaDataGeneral.getWrittenLocationAsInteger());
    }

   /**
    * Test getWrittenLocationAsLong() method.
    */
    @Test
    public void subTestGetWrittenLocationAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getWrittenLocationAsLong());
        System.out.println("Location that the item was originaly designed/written. Information should be stored in the following format: country code, state/province, city where the coutry code is the same 2 octets as in Internet domains, or possibly ISO-3166. e.g. US, Texas, Austin or US, , Austin. AS Long === " + jMetaDataGeneral.getWrittenLocationAsLong());
    }

   /**
    * Test getWrittenLocationAsLocalDateTime() method.
    */
    @Test
    public void subTestGetWrittenLocationAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getWrittenLocationAsLocalDateTime());
        System.out.println("Location that the item was originaly designed/written. Information should be stored in the following format: country code, state/province, city where the coutry code is the same 2 octets as in Internet domains, or possibly ISO-3166. e.g. US, Texas, Austin or US, , Austin. AS LocalDateTime === " + jMetaDataGeneral.getWrittenLocationAsLocalDateTime());
    }

   /**
    * Test getWrittenLocationAsLocalTime() method.
    */
    @Test
    public void subTestGetWrittenLocationAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getWrittenLocationAsLocalTime());
        System.out.println("Location that the item was originaly designed/written. Information should be stored in the following format: country code, state/province, city where the coutry code is the same 2 octets as in Internet domains, or possibly ISO-3166. e.g. US, Texas, Austin or US, , Austin. AS LocalTime === " + jMetaDataGeneral.getWrittenLocationAsLocalTime());
    }

   /**
    * Test getWrittenLocationAsString() method.
    */
    @Test
    public void subTestGetWrittenLocationAsString() {
        assertEquals(null, this.jMetaDataGeneral.getWrittenLocationAsString());
        System.out.println("Location that the item was originaly designed/written. Information should be stored in the following format: country code, state/province, city where the coutry code is the same 2 octets as in Internet domains, or possibly ISO-3166. e.g. US, Texas, Austin or US, , Austin. AS String === " + jMetaDataGeneral.getWrittenLocationAsString());
    }

   /**
    * Test getWrittenLocationAsBoolean() method.
    */
    @Test
    public void subTestGetWrittenLocationAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getWrittenLocationAsBoolean());
        System.out.println("Location that the item was originaly designed/written. Information should be stored in the following format: country code, state/province, city where the coutry code is the same 2 octets as in Internet domains, or possibly ISO-3166. e.g. US, Texas, Austin or US, , Austin. AS Boolean === " + jMetaDataGeneral.getWrittenLocationAsBoolean());
    }

   /**
    * Test getWrittenLocationAsBigInteger() method.
    */
    @Test
    public void subTestGetWrittenLocationAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getWrittenLocationAsBigInteger());
        System.out.println("Location that the item was originaly designed/written. Information should be stored in the following format: country code, state/province, city where the coutry code is the same 2 octets as in Internet domains, or possibly ISO-3166. e.g. US, Texas, Austin or US, , Austin. AS BigInteger === " + jMetaDataGeneral.getWrittenLocationAsBigInteger());
    }

   /**
    * Test getWrittenLocationAsURL() method.
    */
    @Test
    public void subTestGetWrittenLocationAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getWrittenLocationAsURL());
        System.out.println("Location that the item was originaly designed/written. Information should be stored in the following format: country code, state/province, city where the coutry code is the same 2 octets as in Internet domains, or possibly ISO-3166. e.g. US, Texas, Austin or US, , Austin. AS URL === " + jMetaDataGeneral.getWrittenLocationAsURL());
    }

   /**
    * Test getDimensionsAsInteger() method.
    */
    @Test
    public void subTestGetDimensionsAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDimensionsAsInteger());
        System.out.println("Specifies the size of the original subject of the file. eg 8.5 in h, 11 in w AS Integer === " + jMetaDataGeneral.getDimensionsAsInteger());
    }

   /**
    * Test getDimensionsAsLong() method.
    */
    @Test
    public void subTestGetDimensionsAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getDimensionsAsLong());
        System.out.println("Specifies the size of the original subject of the file. eg 8.5 in h, 11 in w AS Long === " + jMetaDataGeneral.getDimensionsAsLong());
    }

   /**
    * Test getDimensionsAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDimensionsAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getDimensionsAsLocalDateTime());
        System.out.println("Specifies the size of the original subject of the file. eg 8.5 in h, 11 in w AS LocalDateTime === " + jMetaDataGeneral.getDimensionsAsLocalDateTime());
    }

   /**
    * Test getDimensionsAsLocalTime() method.
    */
    @Test
    public void subTestGetDimensionsAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getDimensionsAsLocalTime());
        System.out.println("Specifies the size of the original subject of the file. eg 8.5 in h, 11 in w AS LocalTime === " + jMetaDataGeneral.getDimensionsAsLocalTime());
    }

   /**
    * Test getDimensionsAsString() method.
    */
    @Test
    public void subTestGetDimensionsAsString() {
        assertEquals(null, this.jMetaDataGeneral.getDimensionsAsString());
        System.out.println("Specifies the size of the original subject of the file. eg 8.5 in h, 11 in w AS String === " + jMetaDataGeneral.getDimensionsAsString());
    }

   /**
    * Test getDimensionsAsBoolean() method.
    */
    @Test
    public void subTestGetDimensionsAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getDimensionsAsBoolean());
        System.out.println("Specifies the size of the original subject of the file. eg 8.5 in h, 11 in w AS Boolean === " + jMetaDataGeneral.getDimensionsAsBoolean());
    }

   /**
    * Test getDimensionsAsBigInteger() method.
    */
    @Test
    public void subTestGetDimensionsAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDimensionsAsBigInteger());
        System.out.println("Specifies the size of the original subject of the file. eg 8.5 in h, 11 in w AS BigInteger === " + jMetaDataGeneral.getDimensionsAsBigInteger());
    }

   /**
    * Test getDimensionsAsURL() method.
    */
    @Test
    public void subTestGetDimensionsAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getDimensionsAsURL());
        System.out.println("Specifies the size of the original subject of the file. eg 8.5 in h, 11 in w AS URL === " + jMetaDataGeneral.getDimensionsAsURL());
    }

   /**
    * Test getPublisherAsInteger() method.
    */
    @Test
    public void subTestGetPublisherAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getPublisherAsInteger());
        System.out.println("Name of the organization publishing the album (i.e. the 'record label') or movie. AS Integer === " + jMetaDataGeneral.getPublisherAsInteger());
    }

   /**
    * Test getPublisherAsLong() method.
    */
    @Test
    public void subTestGetPublisherAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getPublisherAsLong());
        System.out.println("Name of the organization publishing the album (i.e. the 'record label') or movie. AS Long === " + jMetaDataGeneral.getPublisherAsLong());
    }

   /**
    * Test getPublisherAsLocalDateTime() method.
    */
    @Test
    public void subTestGetPublisherAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getPublisherAsLocalDateTime());
        System.out.println("Name of the organization publishing the album (i.e. the 'record label') or movie. AS LocalDateTime === " + jMetaDataGeneral.getPublisherAsLocalDateTime());
    }

   /**
    * Test getPublisherAsLocalTime() method.
    */
    @Test
    public void subTestGetPublisherAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getPublisherAsLocalTime());
        System.out.println("Name of the organization publishing the album (i.e. the 'record label') or movie. AS LocalTime === " + jMetaDataGeneral.getPublisherAsLocalTime());
    }

   /**
    * Test getPublisherAsString() method.
    */
    @Test
    public void subTestGetPublisherAsString() {
        assertEquals(null, this.jMetaDataGeneral.getPublisherAsString());
        System.out.println("Name of the organization publishing the album (i.e. the 'record label') or movie. AS String === " + jMetaDataGeneral.getPublisherAsString());
    }

   /**
    * Test getPublisherAsBoolean() method.
    */
    @Test
    public void subTestGetPublisherAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getPublisherAsBoolean());
        System.out.println("Name of the organization publishing the album (i.e. the 'record label') or movie. AS Boolean === " + jMetaDataGeneral.getPublisherAsBoolean());
    }

   /**
    * Test getPublisherAsBigInteger() method.
    */
    @Test
    public void subTestGetPublisherAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getPublisherAsBigInteger());
        System.out.println("Name of the organization publishing the album (i.e. the 'record label') or movie. AS BigInteger === " + jMetaDataGeneral.getPublisherAsBigInteger());
    }

   /**
    * Test getPublisherAsURL() method.
    */
    @Test
    public void subTestGetPublisherAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getPublisherAsURL());
        System.out.println("Name of the organization publishing the album (i.e. the 'record label') or movie. AS URL === " + jMetaDataGeneral.getPublisherAsURL());
    }

   /**
    * Test getCoverTypeAsInteger() method.
    */
    @Test
    public void subTestGetCoverTypeAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCoverTypeAsInteger());
        System.out.println("Cover_Type AS Integer === " + jMetaDataGeneral.getCoverTypeAsInteger());
    }

   /**
    * Test getCoverTypeAsLong() method.
    */
    @Test
    public void subTestGetCoverTypeAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getCoverTypeAsLong());
        System.out.println("Cover_Type AS Long === " + jMetaDataGeneral.getCoverTypeAsLong());
    }

   /**
    * Test getCoverTypeAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCoverTypeAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getCoverTypeAsLocalDateTime());
        System.out.println("Cover_Type AS LocalDateTime === " + jMetaDataGeneral.getCoverTypeAsLocalDateTime());
    }

   /**
    * Test getCoverTypeAsLocalTime() method.
    */
    @Test
    public void subTestGetCoverTypeAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getCoverTypeAsLocalTime());
        System.out.println("Cover_Type AS LocalTime === " + jMetaDataGeneral.getCoverTypeAsLocalTime());
    }

   /**
    * Test getCoverTypeAsString() method.
    */
    @Test
    public void subTestGetCoverTypeAsString() {
        assertEquals(null, this.jMetaDataGeneral.getCoverTypeAsString());
        System.out.println("Cover_Type AS String === " + jMetaDataGeneral.getCoverTypeAsString());
    }

   /**
    * Test getCoverTypeAsBoolean() method.
    */
    @Test
    public void subTestGetCoverTypeAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getCoverTypeAsBoolean());
        System.out.println("Cover_Type AS Boolean === " + jMetaDataGeneral.getCoverTypeAsBoolean());
    }

   /**
    * Test getCoverTypeAsBigInteger() method.
    */
    @Test
    public void subTestGetCoverTypeAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCoverTypeAsBigInteger());
        System.out.println("Cover_Type AS BigInteger === " + jMetaDataGeneral.getCoverTypeAsBigInteger());
    }

   /**
    * Test getCoverTypeAsURL() method.
    */
    @Test
    public void subTestGetCoverTypeAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getCoverTypeAsURL());
        System.out.println("Cover_Type AS URL === " + jMetaDataGeneral.getCoverTypeAsURL());
    }

   /**
    * Test getEncodedOperatingSystemAsInteger() method.
    */
    @Test
    public void subTestGetEncodedOperatingSystemAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedOperatingSystemAsInteger());
        System.out.println("Operating System of encoding-software AS Integer === " + jMetaDataGeneral.getEncodedOperatingSystemAsInteger());
    }

   /**
    * Test getEncodedOperatingSystemAsLong() method.
    */
    @Test
    public void subTestGetEncodedOperatingSystemAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedOperatingSystemAsLong());
        System.out.println("Operating System of encoding-software AS Long === " + jMetaDataGeneral.getEncodedOperatingSystemAsLong());
    }

   /**
    * Test getEncodedOperatingSystemAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedOperatingSystemAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedOperatingSystemAsLocalDateTime());
        System.out.println("Operating System of encoding-software AS LocalDateTime === " + jMetaDataGeneral.getEncodedOperatingSystemAsLocalDateTime());
    }

   /**
    * Test getEncodedOperatingSystemAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedOperatingSystemAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedOperatingSystemAsLocalTime());
        System.out.println("Operating System of encoding-software AS LocalTime === " + jMetaDataGeneral.getEncodedOperatingSystemAsLocalTime());
    }

   /**
    * Test getEncodedOperatingSystemAsString() method.
    */
    @Test
    public void subTestGetEncodedOperatingSystemAsString() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedOperatingSystemAsString());
        System.out.println("Operating System of encoding-software AS String === " + jMetaDataGeneral.getEncodedOperatingSystemAsString());
    }

   /**
    * Test getEncodedOperatingSystemAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedOperatingSystemAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedOperatingSystemAsBoolean());
        System.out.println("Operating System of encoding-software AS Boolean === " + jMetaDataGeneral.getEncodedOperatingSystemAsBoolean());
    }

   /**
    * Test getEncodedOperatingSystemAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedOperatingSystemAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedOperatingSystemAsBigInteger());
        System.out.println("Operating System of encoding-software AS BigInteger === " + jMetaDataGeneral.getEncodedOperatingSystemAsBigInteger());
    }

   /**
    * Test getEncodedOperatingSystemAsURL() method.
    */
    @Test
    public void subTestGetEncodedOperatingSystemAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedOperatingSystemAsURL());
        System.out.println("Operating System of encoding-software AS URL === " + jMetaDataGeneral.getEncodedOperatingSystemAsURL());
    }

   /**
    * Test getEncodedApplicationCompanyNameAsInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationCompanyNameAsInteger());
        System.out.println("Name of the company AS Integer === " + jMetaDataGeneral.getEncodedApplicationCompanyNameAsInteger());
    }

   /**
    * Test getEncodedApplicationCompanyNameAsLong() method.
    */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationCompanyNameAsLong());
        System.out.println("Name of the company AS Long === " + jMetaDataGeneral.getEncodedApplicationCompanyNameAsLong());
    }

   /**
    * Test getEncodedApplicationCompanyNameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationCompanyNameAsLocalDateTime());
        System.out.println("Name of the company AS LocalDateTime === " + jMetaDataGeneral.getEncodedApplicationCompanyNameAsLocalDateTime());
    }

   /**
    * Test getEncodedApplicationCompanyNameAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationCompanyNameAsLocalTime());
        System.out.println("Name of the company AS LocalTime === " + jMetaDataGeneral.getEncodedApplicationCompanyNameAsLocalTime());
    }

   /**
    * Test getEncodedApplicationCompanyNameAsString() method.
    */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsString() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationCompanyNameAsString());
        System.out.println("Name of the company AS String === " + jMetaDataGeneral.getEncodedApplicationCompanyNameAsString());
    }

   /**
    * Test getEncodedApplicationCompanyNameAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationCompanyNameAsBoolean());
        System.out.println("Name of the company AS Boolean === " + jMetaDataGeneral.getEncodedApplicationCompanyNameAsBoolean());
    }

   /**
    * Test getEncodedApplicationCompanyNameAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationCompanyNameAsBigInteger());
        System.out.println("Name of the company AS BigInteger === " + jMetaDataGeneral.getEncodedApplicationCompanyNameAsBigInteger());
    }

   /**
    * Test getEncodedApplicationCompanyNameAsURL() method.
    */
    @Test
    public void subTestGetEncodedApplicationCompanyNameAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationCompanyNameAsURL());
        System.out.println("Name of the company AS URL === " + jMetaDataGeneral.getEncodedApplicationCompanyNameAsURL());
    }

   /**
    * Test getCoverAsInteger() method.
    */
    @Test
    public void subTestGetCoverAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCoverAsInteger());
        System.out.println("Is there a cover AS Integer === " + jMetaDataGeneral.getCoverAsInteger());
    }

   /**
    * Test getCoverAsLong() method.
    */
    @Test
    public void subTestGetCoverAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getCoverAsLong());
        System.out.println("Is there a cover AS Long === " + jMetaDataGeneral.getCoverAsLong());
    }

   /**
    * Test getCoverAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCoverAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getCoverAsLocalDateTime());
        System.out.println("Is there a cover AS LocalDateTime === " + jMetaDataGeneral.getCoverAsLocalDateTime());
    }

   /**
    * Test getCoverAsLocalTime() method.
    */
    @Test
    public void subTestGetCoverAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getCoverAsLocalTime());
        System.out.println("Is there a cover AS LocalTime === " + jMetaDataGeneral.getCoverAsLocalTime());
    }

   /**
    * Test getCoverAsString() method.
    */
    @Test
    public void subTestGetCoverAsString() {
        assertEquals(null, this.jMetaDataGeneral.getCoverAsString());
        System.out.println("Is there a cover AS String === " + jMetaDataGeneral.getCoverAsString());
    }

   /**
    * Test getCoverAsBoolean() method.
    */
    @Test
    public void subTestGetCoverAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getCoverAsBoolean());
        System.out.println("Is there a cover AS Boolean === " + jMetaDataGeneral.getCoverAsBoolean());
    }

   /**
    * Test getCoverAsBigInteger() method.
    */
    @Test
    public void subTestGetCoverAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCoverAsBigInteger());
        System.out.println("Is there a cover AS BigInteger === " + jMetaDataGeneral.getCoverAsBigInteger());
    }

   /**
    * Test getCoverAsURL() method.
    */
    @Test
    public void subTestGetCoverAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getCoverAsURL());
        System.out.println("Is there a cover AS URL === " + jMetaDataGeneral.getCoverAsURL());
    }

   /**
    * Test getFormatCommercialIfAnyAsInteger() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFormatCommercialIfAnyAsInteger());
        System.out.println("Commercial name used by vendor for theses setings if there is one AS Integer === " + jMetaDataGeneral.getFormatCommercialIfAnyAsInteger());
    }

   /**
    * Test getFormatCommercialIfAnyAsLong() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getFormatCommercialIfAnyAsLong());
        System.out.println("Commercial name used by vendor for theses setings if there is one AS Long === " + jMetaDataGeneral.getFormatCommercialIfAnyAsLong());
    }

   /**
    * Test getFormatCommercialIfAnyAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getFormatCommercialIfAnyAsLocalDateTime());
        System.out.println("Commercial name used by vendor for theses setings if there is one AS LocalDateTime === " + jMetaDataGeneral.getFormatCommercialIfAnyAsLocalDateTime());
    }

   /**
    * Test getFormatCommercialIfAnyAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getFormatCommercialIfAnyAsLocalTime());
        System.out.println("Commercial name used by vendor for theses setings if there is one AS LocalTime === " + jMetaDataGeneral.getFormatCommercialIfAnyAsLocalTime());
    }

   /**
    * Test getFormatCommercialIfAnyAsString() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsString() {
        assertEquals(null, this.jMetaDataGeneral.getFormatCommercialIfAnyAsString());
        System.out.println("Commercial name used by vendor for theses setings if there is one AS String === " + jMetaDataGeneral.getFormatCommercialIfAnyAsString());
    }

   /**
    * Test getFormatCommercialIfAnyAsBoolean() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getFormatCommercialIfAnyAsBoolean());
        System.out.println("Commercial name used by vendor for theses setings if there is one AS Boolean === " + jMetaDataGeneral.getFormatCommercialIfAnyAsBoolean());
    }

   /**
    * Test getFormatCommercialIfAnyAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFormatCommercialIfAnyAsBigInteger());
        System.out.println("Commercial name used by vendor for theses setings if there is one AS BigInteger === " + jMetaDataGeneral.getFormatCommercialIfAnyAsBigInteger());
    }

   /**
    * Test getFormatCommercialIfAnyAsURL() method.
    */
    @Test
    public void subTestGetFormatCommercialIfAnyAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getFormatCommercialIfAnyAsURL());
        System.out.println("Commercial name used by vendor for theses setings if there is one AS URL === " + jMetaDataGeneral.getFormatCommercialIfAnyAsURL());
    }

   /**
    * Test getTaggedDateAsInteger() method.
    */
    @Test
    public void subTestGetTaggedDateAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getTaggedDateAsInteger());
        System.out.println("The time/date/year that the tags were done for this item. AS Integer === " + jMetaDataGeneral.getTaggedDateAsInteger());
    }

   /**
    * Test getTaggedDateAsLong() method.
    */
    @Test
    public void subTestGetTaggedDateAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getTaggedDateAsLong());
        System.out.println("The time/date/year that the tags were done for this item. AS Long === " + jMetaDataGeneral.getTaggedDateAsLong());
    }

   /**
    * Test getTaggedDateAsLocalDateTime() method.
    */
    @Test
    public void subTestGetTaggedDateAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getTaggedDateAsLocalDateTime());
        System.out.println("The time/date/year that the tags were done for this item. AS LocalDateTime === " + jMetaDataGeneral.getTaggedDateAsLocalDateTime());
    }

   /**
    * Test getTaggedDateAsLocalTime() method.
    */
    @Test
    public void subTestGetTaggedDateAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getTaggedDateAsLocalTime());
        System.out.println("The time/date/year that the tags were done for this item. AS LocalTime === " + jMetaDataGeneral.getTaggedDateAsLocalTime());
    }

   /**
    * Test getTaggedDateAsString() method.
    */
    @Test
    public void subTestGetTaggedDateAsString() {
        assertEquals(null, this.jMetaDataGeneral.getTaggedDateAsString());
        System.out.println("The time/date/year that the tags were done for this item. AS String === " + jMetaDataGeneral.getTaggedDateAsString());
    }

   /**
    * Test getTaggedDateAsBoolean() method.
    */
    @Test
    public void subTestGetTaggedDateAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getTaggedDateAsBoolean());
        System.out.println("The time/date/year that the tags were done for this item. AS Boolean === " + jMetaDataGeneral.getTaggedDateAsBoolean());
    }

   /**
    * Test getTaggedDateAsBigInteger() method.
    */
    @Test
    public void subTestGetTaggedDateAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getTaggedDateAsBigInteger());
        System.out.println("The time/date/year that the tags were done for this item. AS BigInteger === " + jMetaDataGeneral.getTaggedDateAsBigInteger());
    }

   /**
    * Test getTaggedDateAsURL() method.
    */
    @Test
    public void subTestGetTaggedDateAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getTaggedDateAsURL());
        System.out.println("The time/date/year that the tags were done for this item. AS URL === " + jMetaDataGeneral.getTaggedDateAsURL());
    }

   /**
    * Test getOriginalSourceFormNameAsInteger() method.
    */
    @Test
    public void subTestGetOriginalSourceFormNameAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormNameAsInteger());
        System.out.println("Name of the product the file was originally intended for AS Integer === " + jMetaDataGeneral.getOriginalSourceFormNameAsInteger());
    }

   /**
    * Test getOriginalSourceFormNameAsLong() method.
    */
    @Test
    public void subTestGetOriginalSourceFormNameAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormNameAsLong());
        System.out.println("Name of the product the file was originally intended for AS Long === " + jMetaDataGeneral.getOriginalSourceFormNameAsLong());
    }

   /**
    * Test getOriginalSourceFormNameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetOriginalSourceFormNameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormNameAsLocalDateTime());
        System.out.println("Name of the product the file was originally intended for AS LocalDateTime === " + jMetaDataGeneral.getOriginalSourceFormNameAsLocalDateTime());
    }

   /**
    * Test getOriginalSourceFormNameAsLocalTime() method.
    */
    @Test
    public void subTestGetOriginalSourceFormNameAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormNameAsLocalTime());
        System.out.println("Name of the product the file was originally intended for AS LocalTime === " + jMetaDataGeneral.getOriginalSourceFormNameAsLocalTime());
    }

   /**
    * Test getOriginalSourceFormNameAsString() method.
    */
    @Test
    public void subTestGetOriginalSourceFormNameAsString() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormNameAsString());
        System.out.println("Name of the product the file was originally intended for AS String === " + jMetaDataGeneral.getOriginalSourceFormNameAsString());
    }

   /**
    * Test getOriginalSourceFormNameAsBoolean() method.
    */
    @Test
    public void subTestGetOriginalSourceFormNameAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormNameAsBoolean());
        System.out.println("Name of the product the file was originally intended for AS Boolean === " + jMetaDataGeneral.getOriginalSourceFormNameAsBoolean());
    }

   /**
    * Test getOriginalSourceFormNameAsBigInteger() method.
    */
    @Test
    public void subTestGetOriginalSourceFormNameAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormNameAsBigInteger());
        System.out.println("Name of the product the file was originally intended for AS BigInteger === " + jMetaDataGeneral.getOriginalSourceFormNameAsBigInteger());
    }

   /**
    * Test getOriginalSourceFormNameAsURL() method.
    */
    @Test
    public void subTestGetOriginalSourceFormNameAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormNameAsURL());
        System.out.println("Name of the product the file was originally intended for AS URL === " + jMetaDataGeneral.getOriginalSourceFormNameAsURL());
    }

   /**
    * Test getAlbumPerformerAsInteger() method.
    */
    @Test
    public void subTestGetAlbumPerformerAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumPerformerAsInteger());
        System.out.println("Album performer/artist of this file AS Integer === " + jMetaDataGeneral.getAlbumPerformerAsInteger());
    }

   /**
    * Test getAlbumPerformerAsLong() method.
    */
    @Test
    public void subTestGetAlbumPerformerAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumPerformerAsLong());
        System.out.println("Album performer/artist of this file AS Long === " + jMetaDataGeneral.getAlbumPerformerAsLong());
    }

   /**
    * Test getAlbumPerformerAsLocalDateTime() method.
    */
    @Test
    public void subTestGetAlbumPerformerAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumPerformerAsLocalDateTime());
        System.out.println("Album performer/artist of this file AS LocalDateTime === " + jMetaDataGeneral.getAlbumPerformerAsLocalDateTime());
    }

   /**
    * Test getAlbumPerformerAsLocalTime() method.
    */
    @Test
    public void subTestGetAlbumPerformerAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumPerformerAsLocalTime());
        System.out.println("Album performer/artist of this file AS LocalTime === " + jMetaDataGeneral.getAlbumPerformerAsLocalTime());
    }

   /**
    * Test getAlbumPerformerAsString() method.
    */
    @Test
    public void subTestGetAlbumPerformerAsString() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumPerformerAsString());
        System.out.println("Album performer/artist of this file AS String === " + jMetaDataGeneral.getAlbumPerformerAsString());
    }

   /**
    * Test getAlbumPerformerAsBoolean() method.
    */
    @Test
    public void subTestGetAlbumPerformerAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumPerformerAsBoolean());
        System.out.println("Album performer/artist of this file AS Boolean === " + jMetaDataGeneral.getAlbumPerformerAsBoolean());
    }

   /**
    * Test getAlbumPerformerAsBigInteger() method.
    */
    @Test
    public void subTestGetAlbumPerformerAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumPerformerAsBigInteger());
        System.out.println("Album performer/artist of this file AS BigInteger === " + jMetaDataGeneral.getAlbumPerformerAsBigInteger());
    }

   /**
    * Test getAlbumPerformerAsURL() method.
    */
    @Test
    public void subTestGetAlbumPerformerAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumPerformerAsURL());
        System.out.println("Album performer/artist of this file AS URL === " + jMetaDataGeneral.getAlbumPerformerAsURL());
    }

   /**
    * Test getThanksToAsInteger() method.
    */
    @Test
    public void subTestGetThanksToAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getThanksToAsInteger());
        System.out.println("A very general tag for everyone else that wants to be listed. AS Integer === " + jMetaDataGeneral.getThanksToAsInteger());
    }

   /**
    * Test getThanksToAsLong() method.
    */
    @Test
    public void subTestGetThanksToAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getThanksToAsLong());
        System.out.println("A very general tag for everyone else that wants to be listed. AS Long === " + jMetaDataGeneral.getThanksToAsLong());
    }

   /**
    * Test getThanksToAsLocalDateTime() method.
    */
    @Test
    public void subTestGetThanksToAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getThanksToAsLocalDateTime());
        System.out.println("A very general tag for everyone else that wants to be listed. AS LocalDateTime === " + jMetaDataGeneral.getThanksToAsLocalDateTime());
    }

   /**
    * Test getThanksToAsLocalTime() method.
    */
    @Test
    public void subTestGetThanksToAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getThanksToAsLocalTime());
        System.out.println("A very general tag for everyone else that wants to be listed. AS LocalTime === " + jMetaDataGeneral.getThanksToAsLocalTime());
    }

   /**
    * Test getThanksToAsString() method.
    */
    @Test
    public void subTestGetThanksToAsString() {
        assertEquals(null, this.jMetaDataGeneral.getThanksToAsString());
        System.out.println("A very general tag for everyone else that wants to be listed. AS String === " + jMetaDataGeneral.getThanksToAsString());
    }

   /**
    * Test getThanksToAsBoolean() method.
    */
    @Test
    public void subTestGetThanksToAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getThanksToAsBoolean());
        System.out.println("A very general tag for everyone else that wants to be listed. AS Boolean === " + jMetaDataGeneral.getThanksToAsBoolean());
    }

   /**
    * Test getThanksToAsBigInteger() method.
    */
    @Test
    public void subTestGetThanksToAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getThanksToAsBigInteger());
        System.out.println("A very general tag for everyone else that wants to be listed. AS BigInteger === " + jMetaDataGeneral.getThanksToAsBigInteger());
    }

   /**
    * Test getThanksToAsURL() method.
    */
    @Test
    public void subTestGetThanksToAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getThanksToAsURL());
        System.out.println("A very general tag for everyone else that wants to be listed. AS URL === " + jMetaDataGeneral.getThanksToAsURL());
    }

   /**
    * Test getIDStringAsInteger() method.
    */
    @Test
    public void subTestGetIDStringAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getIDStringAsInteger());
        System.out.println("The ID for this stream in this file AS Integer === " + jMetaDataGeneral.getIDStringAsInteger());
    }

   /**
    * Test getIDStringAsLong() method.
    */
    @Test
    public void subTestGetIDStringAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getIDStringAsLong());
        System.out.println("The ID for this stream in this file AS Long === " + jMetaDataGeneral.getIDStringAsLong());
    }

   /**
    * Test getIDStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetIDStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getIDStringAsLocalDateTime());
        System.out.println("The ID for this stream in this file AS LocalDateTime === " + jMetaDataGeneral.getIDStringAsLocalDateTime());
    }

   /**
    * Test getIDStringAsLocalTime() method.
    */
    @Test
    public void subTestGetIDStringAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getIDStringAsLocalTime());
        System.out.println("The ID for this stream in this file AS LocalTime === " + jMetaDataGeneral.getIDStringAsLocalTime());
    }

   /**
    * Test getIDStringAsString() method.
    */
    @Test
    public void subTestGetIDStringAsString() {
        assertEquals(null, this.jMetaDataGeneral.getIDStringAsString());
        System.out.println("The ID for this stream in this file AS String === " + jMetaDataGeneral.getIDStringAsString());
    }

   /**
    * Test getIDStringAsBoolean() method.
    */
    @Test
    public void subTestGetIDStringAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getIDStringAsBoolean());
        System.out.println("The ID for this stream in this file AS Boolean === " + jMetaDataGeneral.getIDStringAsBoolean());
    }

   /**
    * Test getIDStringAsBigInteger() method.
    */
    @Test
    public void subTestGetIDStringAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getIDStringAsBigInteger());
        System.out.println("The ID for this stream in this file AS BigInteger === " + jMetaDataGeneral.getIDStringAsBigInteger());
    }

   /**
    * Test getIDStringAsURL() method.
    */
    @Test
    public void subTestGetIDStringAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getIDStringAsURL());
        System.out.println("The ID for this stream in this file AS URL === " + jMetaDataGeneral.getIDStringAsURL());
    }

   /**
    * Test getComicMoreAsInteger() method.
    */
    @Test
    public void subTestGetComicMoreAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getComicMoreAsInteger());
        System.out.println("Comic_More AS Integer === " + jMetaDataGeneral.getComicMoreAsInteger());
    }

   /**
    * Test getComicMoreAsLong() method.
    */
    @Test
    public void subTestGetComicMoreAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getComicMoreAsLong());
        System.out.println("Comic_More AS Long === " + jMetaDataGeneral.getComicMoreAsLong());
    }

   /**
    * Test getComicMoreAsLocalDateTime() method.
    */
    @Test
    public void subTestGetComicMoreAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getComicMoreAsLocalDateTime());
        System.out.println("Comic_More AS LocalDateTime === " + jMetaDataGeneral.getComicMoreAsLocalDateTime());
    }

   /**
    * Test getComicMoreAsLocalTime() method.
    */
    @Test
    public void subTestGetComicMoreAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getComicMoreAsLocalTime());
        System.out.println("Comic_More AS LocalTime === " + jMetaDataGeneral.getComicMoreAsLocalTime());
    }

   /**
    * Test getComicMoreAsString() method.
    */
    @Test
    public void subTestGetComicMoreAsString() {
        assertEquals(null, this.jMetaDataGeneral.getComicMoreAsString());
        System.out.println("Comic_More AS String === " + jMetaDataGeneral.getComicMoreAsString());
    }

   /**
    * Test getComicMoreAsBoolean() method.
    */
    @Test
    public void subTestGetComicMoreAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getComicMoreAsBoolean());
        System.out.println("Comic_More AS Boolean === " + jMetaDataGeneral.getComicMoreAsBoolean());
    }

   /**
    * Test getComicMoreAsBigInteger() method.
    */
    @Test
    public void subTestGetComicMoreAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getComicMoreAsBigInteger());
        System.out.println("Comic_More AS BigInteger === " + jMetaDataGeneral.getComicMoreAsBigInteger());
    }

   /**
    * Test getComicMoreAsURL() method.
    */
    @Test
    public void subTestGetComicMoreAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getComicMoreAsURL());
        System.out.println("Comic_More AS URL === " + jMetaDataGeneral.getComicMoreAsURL());
    }

   /**
    * Test getProductionDesignerAsInteger() method.
    */
    @Test
    public void subTestGetProductionDesignerAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getProductionDesignerAsInteger());
        System.out.println("The person responsible for designing the Overall visual appearance of a movie. AS Integer === " + jMetaDataGeneral.getProductionDesignerAsInteger());
    }

   /**
    * Test getProductionDesignerAsLong() method.
    */
    @Test
    public void subTestGetProductionDesignerAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getProductionDesignerAsLong());
        System.out.println("The person responsible for designing the Overall visual appearance of a movie. AS Long === " + jMetaDataGeneral.getProductionDesignerAsLong());
    }

   /**
    * Test getProductionDesignerAsLocalDateTime() method.
    */
    @Test
    public void subTestGetProductionDesignerAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getProductionDesignerAsLocalDateTime());
        System.out.println("The person responsible for designing the Overall visual appearance of a movie. AS LocalDateTime === " + jMetaDataGeneral.getProductionDesignerAsLocalDateTime());
    }

   /**
    * Test getProductionDesignerAsLocalTime() method.
    */
    @Test
    public void subTestGetProductionDesignerAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getProductionDesignerAsLocalTime());
        System.out.println("The person responsible for designing the Overall visual appearance of a movie. AS LocalTime === " + jMetaDataGeneral.getProductionDesignerAsLocalTime());
    }

   /**
    * Test getProductionDesignerAsString() method.
    */
    @Test
    public void subTestGetProductionDesignerAsString() {
        assertEquals(null, this.jMetaDataGeneral.getProductionDesignerAsString());
        System.out.println("The person responsible for designing the Overall visual appearance of a movie. AS String === " + jMetaDataGeneral.getProductionDesignerAsString());
    }

   /**
    * Test getProductionDesignerAsBoolean() method.
    */
    @Test
    public void subTestGetProductionDesignerAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getProductionDesignerAsBoolean());
        System.out.println("The person responsible for designing the Overall visual appearance of a movie. AS Boolean === " + jMetaDataGeneral.getProductionDesignerAsBoolean());
    }

   /**
    * Test getProductionDesignerAsBigInteger() method.
    */
    @Test
    public void subTestGetProductionDesignerAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getProductionDesignerAsBigInteger());
        System.out.println("The person responsible for designing the Overall visual appearance of a movie. AS BigInteger === " + jMetaDataGeneral.getProductionDesignerAsBigInteger());
    }

   /**
    * Test getProductionDesignerAsURL() method.
    */
    @Test
    public void subTestGetProductionDesignerAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getProductionDesignerAsURL());
        System.out.println("The person responsible for designing the Overall visual appearance of a movie. AS URL === " + jMetaDataGeneral.getProductionDesignerAsURL());
    }

   /**
    * Test getEncodedDateAsInteger() method.
    */
    @Test
    public void subTestGetEncodedDateAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedDateAsInteger());
        System.out.println("The time/date/year that the encoding of this item was completed began. AS Integer === " + jMetaDataGeneral.getEncodedDateAsInteger());
    }

   /**
    * Test getEncodedDateAsLong() method.
    */
    @Test
    public void subTestGetEncodedDateAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedDateAsLong());
        System.out.println("The time/date/year that the encoding of this item was completed began. AS Long === " + jMetaDataGeneral.getEncodedDateAsLong());
    }

   /**
    * Test getEncodedDateAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedDateAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedDateAsLocalDateTime());
        System.out.println("The time/date/year that the encoding of this item was completed began. AS LocalDateTime === " + jMetaDataGeneral.getEncodedDateAsLocalDateTime());
    }

   /**
    * Test getEncodedDateAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedDateAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedDateAsLocalTime());
        System.out.println("The time/date/year that the encoding of this item was completed began. AS LocalTime === " + jMetaDataGeneral.getEncodedDateAsLocalTime());
    }

   /**
    * Test getEncodedDateAsString() method.
    */
    @Test
    public void subTestGetEncodedDateAsString() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedDateAsString());
        System.out.println("The time/date/year that the encoding of this item was completed began. AS String === " + jMetaDataGeneral.getEncodedDateAsString());
    }

   /**
    * Test getEncodedDateAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedDateAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedDateAsBoolean());
        System.out.println("The time/date/year that the encoding of this item was completed began. AS Boolean === " + jMetaDataGeneral.getEncodedDateAsBoolean());
    }

   /**
    * Test getEncodedDateAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedDateAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedDateAsBigInteger());
        System.out.println("The time/date/year that the encoding of this item was completed began. AS BigInteger === " + jMetaDataGeneral.getEncodedDateAsBigInteger());
    }

   /**
    * Test getEncodedDateAsURL() method.
    */
    @Test
    public void subTestGetEncodedDateAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedDateAsURL());
        System.out.println("The time/date/year that the encoding of this item was completed began. AS URL === " + jMetaDataGeneral.getEncodedDateAsURL());
    }

   /**
    * Test getServiceChannelAsInteger() method.
    */
    @Test
    public void subTestGetServiceChannelAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getServiceChannelAsInteger());
        System.out.println("ServiceChannel AS Integer === " + jMetaDataGeneral.getServiceChannelAsInteger());
    }

   /**
    * Test getServiceChannelAsLong() method.
    */
    @Test
    public void subTestGetServiceChannelAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getServiceChannelAsLong());
        System.out.println("ServiceChannel AS Long === " + jMetaDataGeneral.getServiceChannelAsLong());
    }

   /**
    * Test getServiceChannelAsLocalDateTime() method.
    */
    @Test
    public void subTestGetServiceChannelAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getServiceChannelAsLocalDateTime());
        System.out.println("ServiceChannel AS LocalDateTime === " + jMetaDataGeneral.getServiceChannelAsLocalDateTime());
    }

   /**
    * Test getServiceChannelAsLocalTime() method.
    */
    @Test
    public void subTestGetServiceChannelAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getServiceChannelAsLocalTime());
        System.out.println("ServiceChannel AS LocalTime === " + jMetaDataGeneral.getServiceChannelAsLocalTime());
    }

   /**
    * Test getServiceChannelAsString() method.
    */
    @Test
    public void subTestGetServiceChannelAsString() {
        assertEquals(null, this.jMetaDataGeneral.getServiceChannelAsString());
        System.out.println("ServiceChannel AS String === " + jMetaDataGeneral.getServiceChannelAsString());
    }

   /**
    * Test getServiceChannelAsBoolean() method.
    */
    @Test
    public void subTestGetServiceChannelAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getServiceChannelAsBoolean());
        System.out.println("ServiceChannel AS Boolean === " + jMetaDataGeneral.getServiceChannelAsBoolean());
    }

   /**
    * Test getServiceChannelAsBigInteger() method.
    */
    @Test
    public void subTestGetServiceChannelAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getServiceChannelAsBigInteger());
        System.out.println("ServiceChannel AS BigInteger === " + jMetaDataGeneral.getServiceChannelAsBigInteger());
    }

   /**
    * Test getServiceChannelAsURL() method.
    */
    @Test
    public void subTestGetServiceChannelAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getServiceChannelAsURL());
        System.out.println("ServiceChannel AS URL === " + jMetaDataGeneral.getServiceChannelAsURL());
    }

   /**
    * Test getUniqueIDAsInteger() method.
    */
    @Test
    public void subTestGetUniqueIDAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getUniqueIDAsInteger());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS Integer === " + jMetaDataGeneral.getUniqueIDAsInteger());
    }

   /**
    * Test getUniqueIDAsLong() method.
    */
    @Test
    public void subTestGetUniqueIDAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getUniqueIDAsLong());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS Long === " + jMetaDataGeneral.getUniqueIDAsLong());
    }

   /**
    * Test getUniqueIDAsLocalDateTime() method.
    */
    @Test
    public void subTestGetUniqueIDAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getUniqueIDAsLocalDateTime());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS LocalDateTime === " + jMetaDataGeneral.getUniqueIDAsLocalDateTime());
    }

   /**
    * Test getUniqueIDAsLocalTime() method.
    */
    @Test
    public void subTestGetUniqueIDAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getUniqueIDAsLocalTime());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS LocalTime === " + jMetaDataGeneral.getUniqueIDAsLocalTime());
    }

   /**
    * Test getUniqueIDAsString() method.
    */
    @Test
    public void subTestGetUniqueIDAsString() {
        assertEquals(null, this.jMetaDataGeneral.getUniqueIDAsString());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS String === " + jMetaDataGeneral.getUniqueIDAsString());
    }

   /**
    * Test getUniqueIDAsBoolean() method.
    */
    @Test
    public void subTestGetUniqueIDAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getUniqueIDAsBoolean());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS Boolean === " + jMetaDataGeneral.getUniqueIDAsBoolean());
    }

   /**
    * Test getUniqueIDAsBigInteger() method.
    */
    @Test
    public void subTestGetUniqueIDAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getUniqueIDAsBigInteger());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS BigInteger === " + jMetaDataGeneral.getUniqueIDAsBigInteger());
    }

   /**
    * Test getUniqueIDAsURL() method.
    */
    @Test
    public void subTestGetUniqueIDAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getUniqueIDAsURL());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS URL === " + jMetaDataGeneral.getUniqueIDAsURL());
    }

   /**
    * Test getDelayString3AsInteger() method.
    */
    @Test
    public void subTestGetDelayString3AsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDelayString3AsInteger());
        System.out.println("format : HH:MM:SS.MMM AS Integer === " + jMetaDataGeneral.getDelayString3AsInteger());
    }

   /**
    * Test getDelayString3AsLong() method.
    */
    @Test
    public void subTestGetDelayString3AsLong() {
        assertEquals(null, this.jMetaDataGeneral.getDelayString3AsLong());
        System.out.println("format : HH:MM:SS.MMM AS Long === " + jMetaDataGeneral.getDelayString3AsLong());
    }

   /**
    * Test getDelayString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getDelayString3AsLocalDateTime());
        System.out.println("format : HH:MM:SS.MMM AS LocalDateTime === " + jMetaDataGeneral.getDelayString3AsLocalDateTime());
    }

   /**
    * Test getDelayString3AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayString3AsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getDelayString3AsLocalTime());
        System.out.println("format : HH:MM:SS.MMM AS LocalTime === " + jMetaDataGeneral.getDelayString3AsLocalTime());
    }

   /**
    * Test getDelayString3AsString() method.
    */
    @Test
    public void subTestGetDelayString3AsString() {
        assertEquals(null, this.jMetaDataGeneral.getDelayString3AsString());
        System.out.println("format : HH:MM:SS.MMM AS String === " + jMetaDataGeneral.getDelayString3AsString());
    }

   /**
    * Test getDelayString3AsBoolean() method.
    */
    @Test
    public void subTestGetDelayString3AsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getDelayString3AsBoolean());
        System.out.println("format : HH:MM:SS.MMM AS Boolean === " + jMetaDataGeneral.getDelayString3AsBoolean());
    }

   /**
    * Test getDelayString3AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayString3AsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDelayString3AsBigInteger());
        System.out.println("format : HH:MM:SS.MMM AS BigInteger === " + jMetaDataGeneral.getDelayString3AsBigInteger());
    }

   /**
    * Test getDelayString3AsURL() method.
    */
    @Test
    public void subTestGetDelayString3AsURL() {
        assertEquals(null, this.jMetaDataGeneral.getDelayString3AsURL());
        System.out.println("format : HH:MM:SS.MMM AS URL === " + jMetaDataGeneral.getDelayString3AsURL());
    }

   /**
    * Test getDelayString4AsInteger() method.
    */
    @Test
    public void subTestGetDelayString4AsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDelayString4AsInteger());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Integer === " + jMetaDataGeneral.getDelayString4AsInteger());
    }

   /**
    * Test getDelayString4AsLong() method.
    */
    @Test
    public void subTestGetDelayString4AsLong() {
        assertEquals(null, this.jMetaDataGeneral.getDelayString4AsLong());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Long === " + jMetaDataGeneral.getDelayString4AsLong());
    }

   /**
    * Test getDelayString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getDelayString4AsLocalDateTime());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS LocalDateTime === " + jMetaDataGeneral.getDelayString4AsLocalDateTime());
    }

   /**
    * Test getDelayString4AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayString4AsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getDelayString4AsLocalTime());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS LocalTime === " + jMetaDataGeneral.getDelayString4AsLocalTime());
    }

   /**
    * Test getDelayString4AsString() method.
    */
    @Test
    public void subTestGetDelayString4AsString() {
        assertEquals(null, this.jMetaDataGeneral.getDelayString4AsString());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS String === " + jMetaDataGeneral.getDelayString4AsString());
    }

   /**
    * Test getDelayString4AsBoolean() method.
    */
    @Test
    public void subTestGetDelayString4AsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getDelayString4AsBoolean());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Boolean === " + jMetaDataGeneral.getDelayString4AsBoolean());
    }

   /**
    * Test getDelayString4AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayString4AsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDelayString4AsBigInteger());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS BigInteger === " + jMetaDataGeneral.getDelayString4AsBigInteger());
    }

   /**
    * Test getDelayString4AsURL() method.
    */
    @Test
    public void subTestGetDelayString4AsURL() {
        assertEquals(null, this.jMetaDataGeneral.getDelayString4AsURL());
        System.out.println("Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS URL === " + jMetaDataGeneral.getDelayString4AsURL());
    }

   /**
    * Test getDelayString1AsInteger() method.
    */
    @Test
    public void subTestGetDelayString1AsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDelayString1AsInteger());
        System.out.println("Delay with measurement AS Integer === " + jMetaDataGeneral.getDelayString1AsInteger());
    }

   /**
    * Test getDelayString1AsLong() method.
    */
    @Test
    public void subTestGetDelayString1AsLong() {
        assertEquals(null, this.jMetaDataGeneral.getDelayString1AsLong());
        System.out.println("Delay with measurement AS Long === " + jMetaDataGeneral.getDelayString1AsLong());
    }

   /**
    * Test getDelayString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getDelayString1AsLocalDateTime());
        System.out.println("Delay with measurement AS LocalDateTime === " + jMetaDataGeneral.getDelayString1AsLocalDateTime());
    }

   /**
    * Test getDelayString1AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayString1AsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getDelayString1AsLocalTime());
        System.out.println("Delay with measurement AS LocalTime === " + jMetaDataGeneral.getDelayString1AsLocalTime());
    }

   /**
    * Test getDelayString1AsString() method.
    */
    @Test
    public void subTestGetDelayString1AsString() {
        assertEquals(null, this.jMetaDataGeneral.getDelayString1AsString());
        System.out.println("Delay with measurement AS String === " + jMetaDataGeneral.getDelayString1AsString());
    }

   /**
    * Test getDelayString1AsBoolean() method.
    */
    @Test
    public void subTestGetDelayString1AsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getDelayString1AsBoolean());
        System.out.println("Delay with measurement AS Boolean === " + jMetaDataGeneral.getDelayString1AsBoolean());
    }

   /**
    * Test getDelayString1AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayString1AsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDelayString1AsBigInteger());
        System.out.println("Delay with measurement AS BigInteger === " + jMetaDataGeneral.getDelayString1AsBigInteger());
    }

   /**
    * Test getDelayString1AsURL() method.
    */
    @Test
    public void subTestGetDelayString1AsURL() {
        assertEquals(null, this.jMetaDataGeneral.getDelayString1AsURL());
        System.out.println("Delay with measurement AS URL === " + jMetaDataGeneral.getDelayString1AsURL());
    }

   /**
    * Test getDelayString2AsInteger() method.
    */
    @Test
    public void subTestGetDelayString2AsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDelayString2AsInteger());
        System.out.println("Delay with measurement AS Integer === " + jMetaDataGeneral.getDelayString2AsInteger());
    }

   /**
    * Test getDelayString2AsLong() method.
    */
    @Test
    public void subTestGetDelayString2AsLong() {
        assertEquals(null, this.jMetaDataGeneral.getDelayString2AsLong());
        System.out.println("Delay with measurement AS Long === " + jMetaDataGeneral.getDelayString2AsLong());
    }

   /**
    * Test getDelayString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getDelayString2AsLocalDateTime());
        System.out.println("Delay with measurement AS LocalDateTime === " + jMetaDataGeneral.getDelayString2AsLocalDateTime());
    }

   /**
    * Test getDelayString2AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayString2AsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getDelayString2AsLocalTime());
        System.out.println("Delay with measurement AS LocalTime === " + jMetaDataGeneral.getDelayString2AsLocalTime());
    }

   /**
    * Test getDelayString2AsString() method.
    */
    @Test
    public void subTestGetDelayString2AsString() {
        assertEquals(null, this.jMetaDataGeneral.getDelayString2AsString());
        System.out.println("Delay with measurement AS String === " + jMetaDataGeneral.getDelayString2AsString());
    }

   /**
    * Test getDelayString2AsBoolean() method.
    */
    @Test
    public void subTestGetDelayString2AsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getDelayString2AsBoolean());
        System.out.println("Delay with measurement AS Boolean === " + jMetaDataGeneral.getDelayString2AsBoolean());
    }

   /**
    * Test getDelayString2AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayString2AsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDelayString2AsBigInteger());
        System.out.println("Delay with measurement AS BigInteger === " + jMetaDataGeneral.getDelayString2AsBigInteger());
    }

   /**
    * Test getDelayString2AsURL() method.
    */
    @Test
    public void subTestGetDelayString2AsURL() {
        assertEquals(null, this.jMetaDataGeneral.getDelayString2AsURL());
        System.out.println("Delay with measurement AS URL === " + jMetaDataGeneral.getDelayString2AsURL());
    }

   /**
    * Test getLabelAsInteger() method.
    */
    @Test
    public void subTestGetLabelAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getLabelAsInteger());
        System.out.println("Brand or trademark associated with the marketing of music recordings and music videos. AS Integer === " + jMetaDataGeneral.getLabelAsInteger());
    }

   /**
    * Test getLabelAsLong() method.
    */
    @Test
    public void subTestGetLabelAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getLabelAsLong());
        System.out.println("Brand or trademark associated with the marketing of music recordings and music videos. AS Long === " + jMetaDataGeneral.getLabelAsLong());
    }

   /**
    * Test getLabelAsLocalDateTime() method.
    */
    @Test
    public void subTestGetLabelAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getLabelAsLocalDateTime());
        System.out.println("Brand or trademark associated with the marketing of music recordings and music videos. AS LocalDateTime === " + jMetaDataGeneral.getLabelAsLocalDateTime());
    }

   /**
    * Test getLabelAsLocalTime() method.
    */
    @Test
    public void subTestGetLabelAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getLabelAsLocalTime());
        System.out.println("Brand or trademark associated with the marketing of music recordings and music videos. AS LocalTime === " + jMetaDataGeneral.getLabelAsLocalTime());
    }

   /**
    * Test getLabelAsString() method.
    */
    @Test
    public void subTestGetLabelAsString() {
        assertEquals(null, this.jMetaDataGeneral.getLabelAsString());
        System.out.println("Brand or trademark associated with the marketing of music recordings and music videos. AS String === " + jMetaDataGeneral.getLabelAsString());
    }

   /**
    * Test getLabelAsBoolean() method.
    */
    @Test
    public void subTestGetLabelAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getLabelAsBoolean());
        System.out.println("Brand or trademark associated with the marketing of music recordings and music videos. AS Boolean === " + jMetaDataGeneral.getLabelAsBoolean());
    }

   /**
    * Test getLabelAsBigInteger() method.
    */
    @Test
    public void subTestGetLabelAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getLabelAsBigInteger());
        System.out.println("Brand or trademark associated with the marketing of music recordings and music videos. AS BigInteger === " + jMetaDataGeneral.getLabelAsBigInteger());
    }

   /**
    * Test getLabelAsURL() method.
    */
    @Test
    public void subTestGetLabelAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getLabelAsURL());
        System.out.println("Brand or trademark associated with the marketing of music recordings and music videos. AS URL === " + jMetaDataGeneral.getLabelAsURL());
    }

   /**
    * Test getDelayString5AsInteger() method.
    */
    @Test
    public void subTestGetDelayString5AsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDelayString5AsInteger());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Integer === " + jMetaDataGeneral.getDelayString5AsInteger());
    }

   /**
    * Test getDelayString5AsLong() method.
    */
    @Test
    public void subTestGetDelayString5AsLong() {
        assertEquals(null, this.jMetaDataGeneral.getDelayString5AsLong());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Long === " + jMetaDataGeneral.getDelayString5AsLong());
    }

   /**
    * Test getDelayString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getDelayString5AsLocalDateTime());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS LocalDateTime === " + jMetaDataGeneral.getDelayString5AsLocalDateTime());
    }

   /**
    * Test getDelayString5AsLocalTime() method.
    */
    @Test
    public void subTestGetDelayString5AsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getDelayString5AsLocalTime());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS LocalTime === " + jMetaDataGeneral.getDelayString5AsLocalTime());
    }

   /**
    * Test getDelayString5AsString() method.
    */
    @Test
    public void subTestGetDelayString5AsString() {
        assertEquals(null, this.jMetaDataGeneral.getDelayString5AsString());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS String === " + jMetaDataGeneral.getDelayString5AsString());
    }

   /**
    * Test getDelayString5AsBoolean() method.
    */
    @Test
    public void subTestGetDelayString5AsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getDelayString5AsBoolean());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Boolean === " + jMetaDataGeneral.getDelayString5AsBoolean());
    }

   /**
    * Test getDelayString5AsBigInteger() method.
    */
    @Test
    public void subTestGetDelayString5AsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDelayString5AsBigInteger());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS BigInteger === " + jMetaDataGeneral.getDelayString5AsBigInteger());
    }

   /**
    * Test getDelayString5AsURL() method.
    */
    @Test
    public void subTestGetDelayString5AsURL() {
        assertEquals(null, this.jMetaDataGeneral.getDelayString5AsURL());
        System.out.println("Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS URL === " + jMetaDataGeneral.getDelayString5AsURL());
    }

   /**
    * Test getTrackUrlAsInteger() method.
    */
    @Test
    public void subTestGetTrackUrlAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getTrackUrlAsInteger());
        System.out.println("Link to a site about this track AS Integer === " + jMetaDataGeneral.getTrackUrlAsInteger());
    }

   /**
    * Test getTrackUrlAsLong() method.
    */
    @Test
    public void subTestGetTrackUrlAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getTrackUrlAsLong());
        System.out.println("Link to a site about this track AS Long === " + jMetaDataGeneral.getTrackUrlAsLong());
    }

   /**
    * Test getTrackUrlAsLocalDateTime() method.
    */
    @Test
    public void subTestGetTrackUrlAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getTrackUrlAsLocalDateTime());
        System.out.println("Link to a site about this track AS LocalDateTime === " + jMetaDataGeneral.getTrackUrlAsLocalDateTime());
    }

   /**
    * Test getTrackUrlAsLocalTime() method.
    */
    @Test
    public void subTestGetTrackUrlAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getTrackUrlAsLocalTime());
        System.out.println("Link to a site about this track AS LocalTime === " + jMetaDataGeneral.getTrackUrlAsLocalTime());
    }

   /**
    * Test getTrackUrlAsString() method.
    */
    @Test
    public void subTestGetTrackUrlAsString() {
        assertEquals(null, this.jMetaDataGeneral.getTrackUrlAsString());
        System.out.println("Link to a site about this track AS String === " + jMetaDataGeneral.getTrackUrlAsString());
    }

   /**
    * Test getTrackUrlAsBoolean() method.
    */
    @Test
    public void subTestGetTrackUrlAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getTrackUrlAsBoolean());
        System.out.println("Link to a site about this track AS Boolean === " + jMetaDataGeneral.getTrackUrlAsBoolean());
    }

   /**
    * Test getTrackUrlAsBigInteger() method.
    */
    @Test
    public void subTestGetTrackUrlAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getTrackUrlAsBigInteger());
        System.out.println("Link to a site about this track AS BigInteger === " + jMetaDataGeneral.getTrackUrlAsBigInteger());
    }

   /**
    * Test getTrackUrlAsURL() method.
    */
    @Test
    public void subTestGetTrackUrlAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getTrackUrlAsURL());
        System.out.println("Link to a site about this track AS URL === " + jMetaDataGeneral.getTrackUrlAsURL());
    }

   /**
    * Test getOriginalPartAsInteger() method.
    */
    @Test
    public void subTestGetOriginalPartAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalPartAsInteger());
        System.out.println("Original name of the part in the original support AS Integer === " + jMetaDataGeneral.getOriginalPartAsInteger());
    }

   /**
    * Test getOriginalPartAsLong() method.
    */
    @Test
    public void subTestGetOriginalPartAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalPartAsLong());
        System.out.println("Original name of the part in the original support AS Long === " + jMetaDataGeneral.getOriginalPartAsLong());
    }

   /**
    * Test getOriginalPartAsLocalDateTime() method.
    */
    @Test
    public void subTestGetOriginalPartAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalPartAsLocalDateTime());
        System.out.println("Original name of the part in the original support AS LocalDateTime === " + jMetaDataGeneral.getOriginalPartAsLocalDateTime());
    }

   /**
    * Test getOriginalPartAsLocalTime() method.
    */
    @Test
    public void subTestGetOriginalPartAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalPartAsLocalTime());
        System.out.println("Original name of the part in the original support AS LocalTime === " + jMetaDataGeneral.getOriginalPartAsLocalTime());
    }

   /**
    * Test getOriginalPartAsString() method.
    */
    @Test
    public void subTestGetOriginalPartAsString() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalPartAsString());
        System.out.println("Original name of the part in the original support AS String === " + jMetaDataGeneral.getOriginalPartAsString());
    }

   /**
    * Test getOriginalPartAsBoolean() method.
    */
    @Test
    public void subTestGetOriginalPartAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalPartAsBoolean());
        System.out.println("Original name of the part in the original support AS Boolean === " + jMetaDataGeneral.getOriginalPartAsBoolean());
    }

   /**
    * Test getOriginalPartAsBigInteger() method.
    */
    @Test
    public void subTestGetOriginalPartAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalPartAsBigInteger());
        System.out.println("Original name of the part in the original support AS BigInteger === " + jMetaDataGeneral.getOriginalPartAsBigInteger());
    }

   /**
    * Test getOriginalPartAsURL() method.
    */
    @Test
    public void subTestGetOriginalPartAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalPartAsURL());
        System.out.println("Original name of the part in the original support AS URL === " + jMetaDataGeneral.getOriginalPartAsURL());
    }

   /**
    * Test getEncryptionPaddingAsInteger() method.
    */
    @Test
    public void subTestGetEncryptionPaddingAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionPaddingAsInteger());
        System.out.println("Encryption_Padding AS Integer === " + jMetaDataGeneral.getEncryptionPaddingAsInteger());
    }

   /**
    * Test getEncryptionPaddingAsLong() method.
    */
    @Test
    public void subTestGetEncryptionPaddingAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionPaddingAsLong());
        System.out.println("Encryption_Padding AS Long === " + jMetaDataGeneral.getEncryptionPaddingAsLong());
    }

   /**
    * Test getEncryptionPaddingAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncryptionPaddingAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionPaddingAsLocalDateTime());
        System.out.println("Encryption_Padding AS LocalDateTime === " + jMetaDataGeneral.getEncryptionPaddingAsLocalDateTime());
    }

   /**
    * Test getEncryptionPaddingAsLocalTime() method.
    */
    @Test
    public void subTestGetEncryptionPaddingAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionPaddingAsLocalTime());
        System.out.println("Encryption_Padding AS LocalTime === " + jMetaDataGeneral.getEncryptionPaddingAsLocalTime());
    }

   /**
    * Test getEncryptionPaddingAsString() method.
    */
    @Test
    public void subTestGetEncryptionPaddingAsString() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionPaddingAsString());
        System.out.println("Encryption_Padding AS String === " + jMetaDataGeneral.getEncryptionPaddingAsString());
    }

   /**
    * Test getEncryptionPaddingAsBoolean() method.
    */
    @Test
    public void subTestGetEncryptionPaddingAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionPaddingAsBoolean());
        System.out.println("Encryption_Padding AS Boolean === " + jMetaDataGeneral.getEncryptionPaddingAsBoolean());
    }

   /**
    * Test getEncryptionPaddingAsBigInteger() method.
    */
    @Test
    public void subTestGetEncryptionPaddingAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionPaddingAsBigInteger());
        System.out.println("Encryption_Padding AS BigInteger === " + jMetaDataGeneral.getEncryptionPaddingAsBigInteger());
    }

   /**
    * Test getEncryptionPaddingAsURL() method.
    */
    @Test
    public void subTestGetEncryptionPaddingAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionPaddingAsURL());
        System.out.println("Encryption_Padding AS URL === " + jMetaDataGeneral.getEncryptionPaddingAsURL());
    }

   /**
    * Test getDelayAsInteger() method.
    */
    @Test
    public void subTestGetDelayAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDelayAsInteger());
        System.out.println("Delay fixed in the stream (relative) IN MS AS Integer === " + jMetaDataGeneral.getDelayAsInteger());
    }

   /**
    * Test getDelayAsLong() method.
    */
    @Test
    public void subTestGetDelayAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getDelayAsLong());
        System.out.println("Delay fixed in the stream (relative) IN MS AS Long === " + jMetaDataGeneral.getDelayAsLong());
    }

   /**
    * Test getDelayAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getDelayAsLocalDateTime());
        System.out.println("Delay fixed in the stream (relative) IN MS AS LocalDateTime === " + jMetaDataGeneral.getDelayAsLocalDateTime());
    }

   /**
    * Test getDelayAsLocalTime() method.
    */
    @Test
    public void subTestGetDelayAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getDelayAsLocalTime());
        System.out.println("Delay fixed in the stream (relative) IN MS AS LocalTime === " + jMetaDataGeneral.getDelayAsLocalTime());
    }

   /**
    * Test getDelayAsString() method.
    */
    @Test
    public void subTestGetDelayAsString() {
        assertEquals(null, this.jMetaDataGeneral.getDelayAsString());
        System.out.println("Delay fixed in the stream (relative) IN MS AS String === " + jMetaDataGeneral.getDelayAsString());
    }

   /**
    * Test getDelayAsBoolean() method.
    */
    @Test
    public void subTestGetDelayAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getDelayAsBoolean());
        System.out.println("Delay fixed in the stream (relative) IN MS AS Boolean === " + jMetaDataGeneral.getDelayAsBoolean());
    }

   /**
    * Test getDelayAsBigInteger() method.
    */
    @Test
    public void subTestGetDelayAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDelayAsBigInteger());
        System.out.println("Delay fixed in the stream (relative) IN MS AS BigInteger === " + jMetaDataGeneral.getDelayAsBigInteger());
    }

   /**
    * Test getDelayAsURL() method.
    */
    @Test
    public void subTestGetDelayAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getDelayAsURL());
        System.out.println("Delay fixed in the stream (relative) IN MS AS URL === " + jMetaDataGeneral.getDelayAsURL());
    }

   /**
    * Test getEncodedApplicationUrlAsInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationUrlAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationUrlAsInteger());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit. AS Integer === " + jMetaDataGeneral.getEncodedApplicationUrlAsInteger());
    }

   /**
    * Test getEncodedApplicationUrlAsLong() method.
    */
    @Test
    public void subTestGetEncodedApplicationUrlAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationUrlAsLong());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit. AS Long === " + jMetaDataGeneral.getEncodedApplicationUrlAsLong());
    }

   /**
    * Test getEncodedApplicationUrlAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationUrlAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationUrlAsLocalDateTime());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit. AS LocalDateTime === " + jMetaDataGeneral.getEncodedApplicationUrlAsLocalDateTime());
    }

   /**
    * Test getEncodedApplicationUrlAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationUrlAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationUrlAsLocalTime());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit. AS LocalTime === " + jMetaDataGeneral.getEncodedApplicationUrlAsLocalTime());
    }

   /**
    * Test getEncodedApplicationUrlAsString() method.
    */
    @Test
    public void subTestGetEncodedApplicationUrlAsString() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationUrlAsString());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit. AS String === " + jMetaDataGeneral.getEncodedApplicationUrlAsString());
    }

   /**
    * Test getEncodedApplicationUrlAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedApplicationUrlAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationUrlAsBoolean());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit. AS Boolean === " + jMetaDataGeneral.getEncodedApplicationUrlAsBoolean());
    }

   /**
    * Test getEncodedApplicationUrlAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationUrlAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationUrlAsBigInteger());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit. AS BigInteger === " + jMetaDataGeneral.getEncodedApplicationUrlAsBigInteger());
    }

   /**
    * Test getEncodedApplicationUrlAsURL() method.
    */
    @Test
    public void subTestGetEncodedApplicationUrlAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationUrlAsURL());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit. AS URL === " + jMetaDataGeneral.getEncodedApplicationUrlAsURL());
    }

   /**
    * Test getCoverMimeAsInteger() method.
    */
    @Test
    public void subTestGetCoverMimeAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCoverMimeAsInteger());
        System.out.println("Cover_Mime AS Integer === " + jMetaDataGeneral.getCoverMimeAsInteger());
    }

   /**
    * Test getCoverMimeAsLong() method.
    */
    @Test
    public void subTestGetCoverMimeAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getCoverMimeAsLong());
        System.out.println("Cover_Mime AS Long === " + jMetaDataGeneral.getCoverMimeAsLong());
    }

   /**
    * Test getCoverMimeAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCoverMimeAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getCoverMimeAsLocalDateTime());
        System.out.println("Cover_Mime AS LocalDateTime === " + jMetaDataGeneral.getCoverMimeAsLocalDateTime());
    }

   /**
    * Test getCoverMimeAsLocalTime() method.
    */
    @Test
    public void subTestGetCoverMimeAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getCoverMimeAsLocalTime());
        System.out.println("Cover_Mime AS LocalTime === " + jMetaDataGeneral.getCoverMimeAsLocalTime());
    }

   /**
    * Test getCoverMimeAsString() method.
    */
    @Test
    public void subTestGetCoverMimeAsString() {
        assertEquals(null, this.jMetaDataGeneral.getCoverMimeAsString());
        System.out.println("Cover_Mime AS String === " + jMetaDataGeneral.getCoverMimeAsString());
    }

   /**
    * Test getCoverMimeAsBoolean() method.
    */
    @Test
    public void subTestGetCoverMimeAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getCoverMimeAsBoolean());
        System.out.println("Cover_Mime AS Boolean === " + jMetaDataGeneral.getCoverMimeAsBoolean());
    }

   /**
    * Test getCoverMimeAsBigInteger() method.
    */
    @Test
    public void subTestGetCoverMimeAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCoverMimeAsBigInteger());
        System.out.println("Cover_Mime AS BigInteger === " + jMetaDataGeneral.getCoverMimeAsBigInteger());
    }

   /**
    * Test getCoverMimeAsURL() method.
    */
    @Test
    public void subTestGetCoverMimeAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getCoverMimeAsURL());
        System.out.println("Cover_Mime AS URL === " + jMetaDataGeneral.getCoverMimeAsURL());
    }

   /**
    * Test getDataSizeAsInteger() method.
    */
    @Test
    public void subTestGetDataSizeAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDataSizeAsInteger());
        System.out.println("DataSize AS Integer === " + jMetaDataGeneral.getDataSizeAsInteger());
    }

   /**
    * Test getDataSizeAsLong() method.
    */
    @Test
    public void subTestGetDataSizeAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getDataSizeAsLong());
        System.out.println("DataSize AS Long === " + jMetaDataGeneral.getDataSizeAsLong());
    }

   /**
    * Test getDataSizeAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDataSizeAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getDataSizeAsLocalDateTime());
        System.out.println("DataSize AS LocalDateTime === " + jMetaDataGeneral.getDataSizeAsLocalDateTime());
    }

   /**
    * Test getDataSizeAsLocalTime() method.
    */
    @Test
    public void subTestGetDataSizeAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getDataSizeAsLocalTime());
        System.out.println("DataSize AS LocalTime === " + jMetaDataGeneral.getDataSizeAsLocalTime());
    }

   /**
    * Test getDataSizeAsString() method.
    */
    @Test
    public void subTestGetDataSizeAsString() {
        assertEquals(null, this.jMetaDataGeneral.getDataSizeAsString());
        System.out.println("DataSize AS String === " + jMetaDataGeneral.getDataSizeAsString());
    }

   /**
    * Test getDataSizeAsBoolean() method.
    */
    @Test
    public void subTestGetDataSizeAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getDataSizeAsBoolean());
        System.out.println("DataSize AS Boolean === " + jMetaDataGeneral.getDataSizeAsBoolean());
    }

   /**
    * Test getDataSizeAsBigInteger() method.
    */
    @Test
    public void subTestGetDataSizeAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDataSizeAsBigInteger());
        System.out.println("DataSize AS BigInteger === " + jMetaDataGeneral.getDataSizeAsBigInteger());
    }

   /**
    * Test getDataSizeAsURL() method.
    */
    @Test
    public void subTestGetDataSizeAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getDataSizeAsURL());
        System.out.println("DataSize AS URL === " + jMetaDataGeneral.getDataSizeAsURL());
    }

   /**
    * Test getEncodedLibraryAsInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryAsInteger());
        System.out.println("Software used to create the file AS Integer === " + jMetaDataGeneral.getEncodedLibraryAsInteger());
    }

   /**
    * Test getEncodedLibraryAsLong() method.
    */
    @Test
    public void subTestGetEncodedLibraryAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryAsLong());
        System.out.println("Software used to create the file AS Long === " + jMetaDataGeneral.getEncodedLibraryAsLong());
    }

   /**
    * Test getEncodedLibraryAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryAsLocalDateTime());
        System.out.println("Software used to create the file AS LocalDateTime === " + jMetaDataGeneral.getEncodedLibraryAsLocalDateTime());
    }

   /**
    * Test getEncodedLibraryAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryAsLocalTime());
        System.out.println("Software used to create the file AS LocalTime === " + jMetaDataGeneral.getEncodedLibraryAsLocalTime());
    }

   /**
    * Test getEncodedLibraryAsString() method.
    */
    @Test
    public void subTestGetEncodedLibraryAsString() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryAsString());
        System.out.println("Software used to create the file AS String === " + jMetaDataGeneral.getEncodedLibraryAsString());
    }

   /**
    * Test getEncodedLibraryAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedLibraryAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryAsBoolean());
        System.out.println("Software used to create the file AS Boolean === " + jMetaDataGeneral.getEncodedLibraryAsBoolean());
    }

   /**
    * Test getEncodedLibraryAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryAsBigInteger());
        System.out.println("Software used to create the file AS BigInteger === " + jMetaDataGeneral.getEncodedLibraryAsBigInteger());
    }

   /**
    * Test getEncodedLibraryAsURL() method.
    */
    @Test
    public void subTestGetEncodedLibraryAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryAsURL());
        System.out.println("Software used to create the file AS URL === " + jMetaDataGeneral.getEncodedLibraryAsURL());
    }

   /**
    * Test getPartPositionAsInteger() method.
    */
    @Test
    public void subTestGetPartPositionAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getPartPositionAsInteger());
        System.out.println("Number of the part AS Integer === " + jMetaDataGeneral.getPartPositionAsInteger());
    }

   /**
    * Test getPartPositionAsLong() method.
    */
    @Test
    public void subTestGetPartPositionAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getPartPositionAsLong());
        System.out.println("Number of the part AS Long === " + jMetaDataGeneral.getPartPositionAsLong());
    }

   /**
    * Test getPartPositionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetPartPositionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getPartPositionAsLocalDateTime());
        System.out.println("Number of the part AS LocalDateTime === " + jMetaDataGeneral.getPartPositionAsLocalDateTime());
    }

   /**
    * Test getPartPositionAsLocalTime() method.
    */
    @Test
    public void subTestGetPartPositionAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getPartPositionAsLocalTime());
        System.out.println("Number of the part AS LocalTime === " + jMetaDataGeneral.getPartPositionAsLocalTime());
    }

   /**
    * Test getPartPositionAsString() method.
    */
    @Test
    public void subTestGetPartPositionAsString() {
        assertEquals(null, this.jMetaDataGeneral.getPartPositionAsString());
        System.out.println("Number of the part AS String === " + jMetaDataGeneral.getPartPositionAsString());
    }

   /**
    * Test getPartPositionAsBoolean() method.
    */
    @Test
    public void subTestGetPartPositionAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getPartPositionAsBoolean());
        System.out.println("Number of the part AS Boolean === " + jMetaDataGeneral.getPartPositionAsBoolean());
    }

   /**
    * Test getPartPositionAsBigInteger() method.
    */
    @Test
    public void subTestGetPartPositionAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getPartPositionAsBigInteger());
        System.out.println("Number of the part AS BigInteger === " + jMetaDataGeneral.getPartPositionAsBigInteger());
    }

   /**
    * Test getPartPositionAsURL() method.
    */
    @Test
    public void subTestGetPartPositionAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getPartPositionAsURL());
        System.out.println("Number of the part AS URL === " + jMetaDataGeneral.getPartPositionAsURL());
    }

   /**
    * Test getCompleteNameLastAsInteger() method.
    */
    @Test
    public void subTestGetCompleteNameLastAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCompleteNameLastAsInteger());
        System.out.println("Complete name (Folder+Name+Extension) of the last file (in the case of a sequence of files) AS Integer === " + jMetaDataGeneral.getCompleteNameLastAsInteger());
    }

   /**
    * Test getCompleteNameLastAsLong() method.
    */
    @Test
    public void subTestGetCompleteNameLastAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getCompleteNameLastAsLong());
        System.out.println("Complete name (Folder+Name+Extension) of the last file (in the case of a sequence of files) AS Long === " + jMetaDataGeneral.getCompleteNameLastAsLong());
    }

   /**
    * Test getCompleteNameLastAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCompleteNameLastAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getCompleteNameLastAsLocalDateTime());
        System.out.println("Complete name (Folder+Name+Extension) of the last file (in the case of a sequence of files) AS LocalDateTime === " + jMetaDataGeneral.getCompleteNameLastAsLocalDateTime());
    }

   /**
    * Test getCompleteNameLastAsLocalTime() method.
    */
    @Test
    public void subTestGetCompleteNameLastAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getCompleteNameLastAsLocalTime());
        System.out.println("Complete name (Folder+Name+Extension) of the last file (in the case of a sequence of files) AS LocalTime === " + jMetaDataGeneral.getCompleteNameLastAsLocalTime());
    }

   /**
    * Test getCompleteNameLastAsString() method.
    */
    @Test
    public void subTestGetCompleteNameLastAsString() {
        assertEquals(null, this.jMetaDataGeneral.getCompleteNameLastAsString());
        System.out.println("Complete name (Folder+Name+Extension) of the last file (in the case of a sequence of files) AS String === " + jMetaDataGeneral.getCompleteNameLastAsString());
    }

   /**
    * Test getCompleteNameLastAsBoolean() method.
    */
    @Test
    public void subTestGetCompleteNameLastAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getCompleteNameLastAsBoolean());
        System.out.println("Complete name (Folder+Name+Extension) of the last file (in the case of a sequence of files) AS Boolean === " + jMetaDataGeneral.getCompleteNameLastAsBoolean());
    }

   /**
    * Test getCompleteNameLastAsBigInteger() method.
    */
    @Test
    public void subTestGetCompleteNameLastAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCompleteNameLastAsBigInteger());
        System.out.println("Complete name (Folder+Name+Extension) of the last file (in the case of a sequence of files) AS BigInteger === " + jMetaDataGeneral.getCompleteNameLastAsBigInteger());
    }

   /**
    * Test getCompleteNameLastAsURL() method.
    */
    @Test
    public void subTestGetCompleteNameLastAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getCompleteNameLastAsURL());
        System.out.println("Complete name (Folder+Name+Extension) of the last file (in the case of a sequence of files) AS URL === " + jMetaDataGeneral.getCompleteNameLastAsURL());
    }

   /**
    * Test getLyricsAsInteger() method.
    */
    @Test
    public void subTestGetLyricsAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getLyricsAsInteger());
        System.out.println("Text of a song AS Integer === " + jMetaDataGeneral.getLyricsAsInteger());
    }

   /**
    * Test getLyricsAsLong() method.
    */
    @Test
    public void subTestGetLyricsAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getLyricsAsLong());
        System.out.println("Text of a song AS Long === " + jMetaDataGeneral.getLyricsAsLong());
    }

   /**
    * Test getLyricsAsLocalDateTime() method.
    */
    @Test
    public void subTestGetLyricsAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getLyricsAsLocalDateTime());
        System.out.println("Text of a song AS LocalDateTime === " + jMetaDataGeneral.getLyricsAsLocalDateTime());
    }

   /**
    * Test getLyricsAsLocalTime() method.
    */
    @Test
    public void subTestGetLyricsAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getLyricsAsLocalTime());
        System.out.println("Text of a song AS LocalTime === " + jMetaDataGeneral.getLyricsAsLocalTime());
    }

   /**
    * Test getLyricsAsString() method.
    */
    @Test
    public void subTestGetLyricsAsString() {
        assertEquals(null, this.jMetaDataGeneral.getLyricsAsString());
        System.out.println("Text of a song AS String === " + jMetaDataGeneral.getLyricsAsString());
    }

   /**
    * Test getLyricsAsBoolean() method.
    */
    @Test
    public void subTestGetLyricsAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getLyricsAsBoolean());
        System.out.println("Text of a song AS Boolean === " + jMetaDataGeneral.getLyricsAsBoolean());
    }

   /**
    * Test getLyricsAsBigInteger() method.
    */
    @Test
    public void subTestGetLyricsAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getLyricsAsBigInteger());
        System.out.println("Text of a song AS BigInteger === " + jMetaDataGeneral.getLyricsAsBigInteger());
    }

   /**
    * Test getLyricsAsURL() method.
    */
    @Test
    public void subTestGetLyricsAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getLyricsAsURL());
        System.out.println("Text of a song AS URL === " + jMetaDataGeneral.getLyricsAsURL());
    }

   /**
    * Test getInternetMediaTypeAsInteger() method.
    */
    @Test
    public void subTestGetInternetMediaTypeAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getInternetMediaTypeAsInteger());
        System.out.println("Internet Media Type (aka MIME Type, Content-Type) AS Integer === " + jMetaDataGeneral.getInternetMediaTypeAsInteger());
    }

   /**
    * Test getInternetMediaTypeAsLong() method.
    */
    @Test
    public void subTestGetInternetMediaTypeAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getInternetMediaTypeAsLong());
        System.out.println("Internet Media Type (aka MIME Type, Content-Type) AS Long === " + jMetaDataGeneral.getInternetMediaTypeAsLong());
    }

   /**
    * Test getInternetMediaTypeAsLocalDateTime() method.
    */
    @Test
    public void subTestGetInternetMediaTypeAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getInternetMediaTypeAsLocalDateTime());
        System.out.println("Internet Media Type (aka MIME Type, Content-Type) AS LocalDateTime === " + jMetaDataGeneral.getInternetMediaTypeAsLocalDateTime());
    }

   /**
    * Test getInternetMediaTypeAsLocalTime() method.
    */
    @Test
    public void subTestGetInternetMediaTypeAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getInternetMediaTypeAsLocalTime());
        System.out.println("Internet Media Type (aka MIME Type, Content-Type) AS LocalTime === " + jMetaDataGeneral.getInternetMediaTypeAsLocalTime());
    }

   /**
    * Test getInternetMediaTypeAsString() method.
    */
    @Test
    public void subTestGetInternetMediaTypeAsString() {
        assertEquals(null, this.jMetaDataGeneral.getInternetMediaTypeAsString());
        System.out.println("Internet Media Type (aka MIME Type, Content-Type) AS String === " + jMetaDataGeneral.getInternetMediaTypeAsString());
    }

   /**
    * Test getInternetMediaTypeAsBoolean() method.
    */
    @Test
    public void subTestGetInternetMediaTypeAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getInternetMediaTypeAsBoolean());
        System.out.println("Internet Media Type (aka MIME Type, Content-Type) AS Boolean === " + jMetaDataGeneral.getInternetMediaTypeAsBoolean());
    }

   /**
    * Test getInternetMediaTypeAsBigInteger() method.
    */
    @Test
    public void subTestGetInternetMediaTypeAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getInternetMediaTypeAsBigInteger());
        System.out.println("Internet Media Type (aka MIME Type, Content-Type) AS BigInteger === " + jMetaDataGeneral.getInternetMediaTypeAsBigInteger());
    }

   /**
    * Test getInternetMediaTypeAsURL() method.
    */
    @Test
    public void subTestGetInternetMediaTypeAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getInternetMediaTypeAsURL());
        System.out.println("Internet Media Type (aka MIME Type, Content-Type) AS URL === " + jMetaDataGeneral.getInternetMediaTypeAsURL());
    }

   /**
    * Test getLawRatingAsInteger() method.
    */
    @Test
    public void subTestGetLawRatingAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getLawRatingAsInteger());
        System.out.println("Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo). AS Integer === " + jMetaDataGeneral.getLawRatingAsInteger());
    }

   /**
    * Test getLawRatingAsLong() method.
    */
    @Test
    public void subTestGetLawRatingAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getLawRatingAsLong());
        System.out.println("Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo). AS Long === " + jMetaDataGeneral.getLawRatingAsLong());
    }

   /**
    * Test getLawRatingAsLocalDateTime() method.
    */
    @Test
    public void subTestGetLawRatingAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getLawRatingAsLocalDateTime());
        System.out.println("Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo). AS LocalDateTime === " + jMetaDataGeneral.getLawRatingAsLocalDateTime());
    }

   /**
    * Test getLawRatingAsLocalTime() method.
    */
    @Test
    public void subTestGetLawRatingAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getLawRatingAsLocalTime());
        System.out.println("Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo). AS LocalTime === " + jMetaDataGeneral.getLawRatingAsLocalTime());
    }

   /**
    * Test getLawRatingAsString() method.
    */
    @Test
    public void subTestGetLawRatingAsString() {
        assertEquals(null, this.jMetaDataGeneral.getLawRatingAsString());
        System.out.println("Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo). AS String === " + jMetaDataGeneral.getLawRatingAsString());
    }

   /**
    * Test getLawRatingAsBoolean() method.
    */
    @Test
    public void subTestGetLawRatingAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getLawRatingAsBoolean());
        System.out.println("Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo). AS Boolean === " + jMetaDataGeneral.getLawRatingAsBoolean());
    }

   /**
    * Test getLawRatingAsBigInteger() method.
    */
    @Test
    public void subTestGetLawRatingAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getLawRatingAsBigInteger());
        System.out.println("Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo). AS BigInteger === " + jMetaDataGeneral.getLawRatingAsBigInteger());
    }

   /**
    * Test getLawRatingAsURL() method.
    */
    @Test
    public void subTestGetLawRatingAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getLawRatingAsURL());
        System.out.println("Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo). AS URL === " + jMetaDataGeneral.getLawRatingAsURL());
    }

   /**
    * Test getFrameRateDenAsInteger() method.
    */
    @Test
    public void subTestGetFrameRateDenAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFrameRateDenAsInteger());
        System.out.println("Frames per second, denominator AS Integer === " + jMetaDataGeneral.getFrameRateDenAsInteger());
    }

   /**
    * Test getFrameRateDenAsLong() method.
    */
    @Test
    public void subTestGetFrameRateDenAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getFrameRateDenAsLong());
        System.out.println("Frames per second, denominator AS Long === " + jMetaDataGeneral.getFrameRateDenAsLong());
    }

   /**
    * Test getFrameRateDenAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFrameRateDenAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getFrameRateDenAsLocalDateTime());
        System.out.println("Frames per second, denominator AS LocalDateTime === " + jMetaDataGeneral.getFrameRateDenAsLocalDateTime());
    }

   /**
    * Test getFrameRateDenAsLocalTime() method.
    */
    @Test
    public void subTestGetFrameRateDenAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getFrameRateDenAsLocalTime());
        System.out.println("Frames per second, denominator AS LocalTime === " + jMetaDataGeneral.getFrameRateDenAsLocalTime());
    }

   /**
    * Test getFrameRateDenAsString() method.
    */
    @Test
    public void subTestGetFrameRateDenAsString() {
        assertEquals(null, this.jMetaDataGeneral.getFrameRateDenAsString());
        System.out.println("Frames per second, denominator AS String === " + jMetaDataGeneral.getFrameRateDenAsString());
    }

   /**
    * Test getFrameRateDenAsBoolean() method.
    */
    @Test
    public void subTestGetFrameRateDenAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getFrameRateDenAsBoolean());
        System.out.println("Frames per second, denominator AS Boolean === " + jMetaDataGeneral.getFrameRateDenAsBoolean());
    }

   /**
    * Test getFrameRateDenAsBigInteger() method.
    */
    @Test
    public void subTestGetFrameRateDenAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFrameRateDenAsBigInteger());
        System.out.println("Frames per second, denominator AS BigInteger === " + jMetaDataGeneral.getFrameRateDenAsBigInteger());
    }

   /**
    * Test getFrameRateDenAsURL() method.
    */
    @Test
    public void subTestGetFrameRateDenAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getFrameRateDenAsURL());
        System.out.println("Frames per second, denominator AS URL === " + jMetaDataGeneral.getFrameRateDenAsURL());
    }

   /**
    * Test getEncryptionMethodAsInteger() method.
    */
    @Test
    public void subTestGetEncryptionMethodAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionMethodAsInteger());
        System.out.println("Encryption_Method AS Integer === " + jMetaDataGeneral.getEncryptionMethodAsInteger());
    }

   /**
    * Test getEncryptionMethodAsLong() method.
    */
    @Test
    public void subTestGetEncryptionMethodAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionMethodAsLong());
        System.out.println("Encryption_Method AS Long === " + jMetaDataGeneral.getEncryptionMethodAsLong());
    }

   /**
    * Test getEncryptionMethodAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncryptionMethodAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionMethodAsLocalDateTime());
        System.out.println("Encryption_Method AS LocalDateTime === " + jMetaDataGeneral.getEncryptionMethodAsLocalDateTime());
    }

   /**
    * Test getEncryptionMethodAsLocalTime() method.
    */
    @Test
    public void subTestGetEncryptionMethodAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionMethodAsLocalTime());
        System.out.println("Encryption_Method AS LocalTime === " + jMetaDataGeneral.getEncryptionMethodAsLocalTime());
    }

   /**
    * Test getEncryptionMethodAsString() method.
    */
    @Test
    public void subTestGetEncryptionMethodAsString() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionMethodAsString());
        System.out.println("Encryption_Method AS String === " + jMetaDataGeneral.getEncryptionMethodAsString());
    }

   /**
    * Test getEncryptionMethodAsBoolean() method.
    */
    @Test
    public void subTestGetEncryptionMethodAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionMethodAsBoolean());
        System.out.println("Encryption_Method AS Boolean === " + jMetaDataGeneral.getEncryptionMethodAsBoolean());
    }

   /**
    * Test getEncryptionMethodAsBigInteger() method.
    */
    @Test
    public void subTestGetEncryptionMethodAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionMethodAsBigInteger());
        System.out.println("Encryption_Method AS BigInteger === " + jMetaDataGeneral.getEncryptionMethodAsBigInteger());
    }

   /**
    * Test getEncryptionMethodAsURL() method.
    */
    @Test
    public void subTestGetEncryptionMethodAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionMethodAsURL());
        System.out.println("Encryption_Method AS URL === " + jMetaDataGeneral.getEncryptionMethodAsURL());
    }

   /**
    * Test getDirectorOfPhotographyAsInteger() method.
    */
    @Test
    public void subTestGetDirectorOfPhotographyAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDirectorOfPhotographyAsInteger());
        System.out.println("The name of the director of photography, also known as cinematographer. AS Integer === " + jMetaDataGeneral.getDirectorOfPhotographyAsInteger());
    }

   /**
    * Test getDirectorOfPhotographyAsLong() method.
    */
    @Test
    public void subTestGetDirectorOfPhotographyAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getDirectorOfPhotographyAsLong());
        System.out.println("The name of the director of photography, also known as cinematographer. AS Long === " + jMetaDataGeneral.getDirectorOfPhotographyAsLong());
    }

   /**
    * Test getDirectorOfPhotographyAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDirectorOfPhotographyAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getDirectorOfPhotographyAsLocalDateTime());
        System.out.println("The name of the director of photography, also known as cinematographer. AS LocalDateTime === " + jMetaDataGeneral.getDirectorOfPhotographyAsLocalDateTime());
    }

   /**
    * Test getDirectorOfPhotographyAsLocalTime() method.
    */
    @Test
    public void subTestGetDirectorOfPhotographyAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getDirectorOfPhotographyAsLocalTime());
        System.out.println("The name of the director of photography, also known as cinematographer. AS LocalTime === " + jMetaDataGeneral.getDirectorOfPhotographyAsLocalTime());
    }

   /**
    * Test getDirectorOfPhotographyAsString() method.
    */
    @Test
    public void subTestGetDirectorOfPhotographyAsString() {
        assertEquals(null, this.jMetaDataGeneral.getDirectorOfPhotographyAsString());
        System.out.println("The name of the director of photography, also known as cinematographer. AS String === " + jMetaDataGeneral.getDirectorOfPhotographyAsString());
    }

   /**
    * Test getDirectorOfPhotographyAsBoolean() method.
    */
    @Test
    public void subTestGetDirectorOfPhotographyAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getDirectorOfPhotographyAsBoolean());
        System.out.println("The name of the director of photography, also known as cinematographer. AS Boolean === " + jMetaDataGeneral.getDirectorOfPhotographyAsBoolean());
    }

   /**
    * Test getDirectorOfPhotographyAsBigInteger() method.
    */
    @Test
    public void subTestGetDirectorOfPhotographyAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDirectorOfPhotographyAsBigInteger());
        System.out.println("The name of the director of photography, also known as cinematographer. AS BigInteger === " + jMetaDataGeneral.getDirectorOfPhotographyAsBigInteger());
    }

   /**
    * Test getDirectorOfPhotographyAsURL() method.
    */
    @Test
    public void subTestGetDirectorOfPhotographyAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getDirectorOfPhotographyAsURL());
        System.out.println("The name of the director of photography, also known as cinematographer. AS URL === " + jMetaDataGeneral.getDirectorOfPhotographyAsURL());
    }

   /**
    * Test getAudioFormatListAsInteger() method.
    */
    @Test
    public void subTestGetAudioFormatListAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getAudioFormatListAsInteger());
        System.out.println("Audio Codecs in this file,separated by / AS Integer === " + jMetaDataGeneral.getAudioFormatListAsInteger());
    }

   /**
    * Test getAudioFormatListAsLong() method.
    */
    @Test
    public void subTestGetAudioFormatListAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getAudioFormatListAsLong());
        System.out.println("Audio Codecs in this file,separated by / AS Long === " + jMetaDataGeneral.getAudioFormatListAsLong());
    }

   /**
    * Test getAudioFormatListAsLocalDateTime() method.
    */
    @Test
    public void subTestGetAudioFormatListAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getAudioFormatListAsLocalDateTime());
        System.out.println("Audio Codecs in this file,separated by / AS LocalDateTime === " + jMetaDataGeneral.getAudioFormatListAsLocalDateTime());
    }

   /**
    * Test getAudioFormatListAsLocalTime() method.
    */
    @Test
    public void subTestGetAudioFormatListAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getAudioFormatListAsLocalTime());
        System.out.println("Audio Codecs in this file,separated by / AS LocalTime === " + jMetaDataGeneral.getAudioFormatListAsLocalTime());
    }

   /**
    * Test getAudioFormatListAsString() method.
    */
    @Test
    public void subTestGetAudioFormatListAsString() {
        assertEquals(null, this.jMetaDataGeneral.getAudioFormatListAsString());
        System.out.println("Audio Codecs in this file,separated by / AS String === " + jMetaDataGeneral.getAudioFormatListAsString());
    }

   /**
    * Test getAudioFormatListAsBoolean() method.
    */
    @Test
    public void subTestGetAudioFormatListAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getAudioFormatListAsBoolean());
        System.out.println("Audio Codecs in this file,separated by / AS Boolean === " + jMetaDataGeneral.getAudioFormatListAsBoolean());
    }

   /**
    * Test getAudioFormatListAsBigInteger() method.
    */
    @Test
    public void subTestGetAudioFormatListAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getAudioFormatListAsBigInteger());
        System.out.println("Audio Codecs in this file,separated by / AS BigInteger === " + jMetaDataGeneral.getAudioFormatListAsBigInteger());
    }

   /**
    * Test getAudioFormatListAsURL() method.
    */
    @Test
    public void subTestGetAudioFormatListAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getAudioFormatListAsURL());
        System.out.println("Audio Codecs in this file,separated by / AS URL === " + jMetaDataGeneral.getAudioFormatListAsURL());
    }

   /**
    * Test getOtherFormatListAsInteger() method.
    */
    @Test
    public void subTestGetOtherFormatListAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOtherFormatListAsInteger());
        System.out.println("Other formats in this file, separated by / AS Integer === " + jMetaDataGeneral.getOtherFormatListAsInteger());
    }

   /**
    * Test getOtherFormatListAsLong() method.
    */
    @Test
    public void subTestGetOtherFormatListAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getOtherFormatListAsLong());
        System.out.println("Other formats in this file, separated by / AS Long === " + jMetaDataGeneral.getOtherFormatListAsLong());
    }

   /**
    * Test getOtherFormatListAsLocalDateTime() method.
    */
    @Test
    public void subTestGetOtherFormatListAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getOtherFormatListAsLocalDateTime());
        System.out.println("Other formats in this file, separated by / AS LocalDateTime === " + jMetaDataGeneral.getOtherFormatListAsLocalDateTime());
    }

   /**
    * Test getOtherFormatListAsLocalTime() method.
    */
    @Test
    public void subTestGetOtherFormatListAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getOtherFormatListAsLocalTime());
        System.out.println("Other formats in this file, separated by / AS LocalTime === " + jMetaDataGeneral.getOtherFormatListAsLocalTime());
    }

   /**
    * Test getOtherFormatListAsString() method.
    */
    @Test
    public void subTestGetOtherFormatListAsString() {
        assertEquals(null, this.jMetaDataGeneral.getOtherFormatListAsString());
        System.out.println("Other formats in this file, separated by / AS String === " + jMetaDataGeneral.getOtherFormatListAsString());
    }

   /**
    * Test getOtherFormatListAsBoolean() method.
    */
    @Test
    public void subTestGetOtherFormatListAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getOtherFormatListAsBoolean());
        System.out.println("Other formats in this file, separated by / AS Boolean === " + jMetaDataGeneral.getOtherFormatListAsBoolean());
    }

   /**
    * Test getOtherFormatListAsBigInteger() method.
    */
    @Test
    public void subTestGetOtherFormatListAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOtherFormatListAsBigInteger());
        System.out.println("Other formats in this file, separated by / AS BigInteger === " + jMetaDataGeneral.getOtherFormatListAsBigInteger());
    }

   /**
    * Test getOtherFormatListAsURL() method.
    */
    @Test
    public void subTestGetOtherFormatListAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getOtherFormatListAsURL());
        System.out.println("Other formats in this file, separated by / AS URL === " + jMetaDataGeneral.getOtherFormatListAsURL());
    }

   /**
    * Test getArrangerAsInteger() method.
    */
    @Test
    public void subTestGetArrangerAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getArrangerAsInteger());
        System.out.println("The person who arranged the piece. e.g. Ravel. AS Integer === " + jMetaDataGeneral.getArrangerAsInteger());
    }

   /**
    * Test getArrangerAsLong() method.
    */
    @Test
    public void subTestGetArrangerAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getArrangerAsLong());
        System.out.println("The person who arranged the piece. e.g. Ravel. AS Long === " + jMetaDataGeneral.getArrangerAsLong());
    }

   /**
    * Test getArrangerAsLocalDateTime() method.
    */
    @Test
    public void subTestGetArrangerAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getArrangerAsLocalDateTime());
        System.out.println("The person who arranged the piece. e.g. Ravel. AS LocalDateTime === " + jMetaDataGeneral.getArrangerAsLocalDateTime());
    }

   /**
    * Test getArrangerAsLocalTime() method.
    */
    @Test
    public void subTestGetArrangerAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getArrangerAsLocalTime());
        System.out.println("The person who arranged the piece. e.g. Ravel. AS LocalTime === " + jMetaDataGeneral.getArrangerAsLocalTime());
    }

   /**
    * Test getArrangerAsString() method.
    */
    @Test
    public void subTestGetArrangerAsString() {
        assertEquals(null, this.jMetaDataGeneral.getArrangerAsString());
        System.out.println("The person who arranged the piece. e.g. Ravel. AS String === " + jMetaDataGeneral.getArrangerAsString());
    }

   /**
    * Test getArrangerAsBoolean() method.
    */
    @Test
    public void subTestGetArrangerAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getArrangerAsBoolean());
        System.out.println("The person who arranged the piece. e.g. Ravel. AS Boolean === " + jMetaDataGeneral.getArrangerAsBoolean());
    }

   /**
    * Test getArrangerAsBigInteger() method.
    */
    @Test
    public void subTestGetArrangerAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getArrangerAsBigInteger());
        System.out.println("The person who arranged the piece. e.g. Ravel. AS BigInteger === " + jMetaDataGeneral.getArrangerAsBigInteger());
    }

   /**
    * Test getArrangerAsURL() method.
    */
    @Test
    public void subTestGetArrangerAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getArrangerAsURL());
        System.out.println("The person who arranged the piece. e.g. Ravel. AS URL === " + jMetaDataGeneral.getArrangerAsURL());
    }

   /**
    * Test getArtDirectorAsInteger() method.
    */
    @Test
    public void subTestGetArtDirectorAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getArtDirectorAsInteger());
        System.out.println("The person who oversees the artists and craftspeople who build the sets. AS Integer === " + jMetaDataGeneral.getArtDirectorAsInteger());
    }

   /**
    * Test getArtDirectorAsLong() method.
    */
    @Test
    public void subTestGetArtDirectorAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getArtDirectorAsLong());
        System.out.println("The person who oversees the artists and craftspeople who build the sets. AS Long === " + jMetaDataGeneral.getArtDirectorAsLong());
    }

   /**
    * Test getArtDirectorAsLocalDateTime() method.
    */
    @Test
    public void subTestGetArtDirectorAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getArtDirectorAsLocalDateTime());
        System.out.println("The person who oversees the artists and craftspeople who build the sets. AS LocalDateTime === " + jMetaDataGeneral.getArtDirectorAsLocalDateTime());
    }

   /**
    * Test getArtDirectorAsLocalTime() method.
    */
    @Test
    public void subTestGetArtDirectorAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getArtDirectorAsLocalTime());
        System.out.println("The person who oversees the artists and craftspeople who build the sets. AS LocalTime === " + jMetaDataGeneral.getArtDirectorAsLocalTime());
    }

   /**
    * Test getArtDirectorAsString() method.
    */
    @Test
    public void subTestGetArtDirectorAsString() {
        assertEquals(null, this.jMetaDataGeneral.getArtDirectorAsString());
        System.out.println("The person who oversees the artists and craftspeople who build the sets. AS String === " + jMetaDataGeneral.getArtDirectorAsString());
    }

   /**
    * Test getArtDirectorAsBoolean() method.
    */
    @Test
    public void subTestGetArtDirectorAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getArtDirectorAsBoolean());
        System.out.println("The person who oversees the artists and craftspeople who build the sets. AS Boolean === " + jMetaDataGeneral.getArtDirectorAsBoolean());
    }

   /**
    * Test getArtDirectorAsBigInteger() method.
    */
    @Test
    public void subTestGetArtDirectorAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getArtDirectorAsBigInteger());
        System.out.println("The person who oversees the artists and craftspeople who build the sets. AS BigInteger === " + jMetaDataGeneral.getArtDirectorAsBigInteger());
    }

   /**
    * Test getArtDirectorAsURL() method.
    */
    @Test
    public void subTestGetArtDirectorAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getArtDirectorAsURL());
        System.out.println("The person who oversees the artists and craftspeople who build the sets. AS URL === " + jMetaDataGeneral.getArtDirectorAsURL());
    }

   /**
    * Test getSeasonPositionAsInteger() method.
    */
    @Test
    public void subTestGetSeasonPositionAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getSeasonPositionAsInteger());
        System.out.println("Number of the Season AS Integer === " + jMetaDataGeneral.getSeasonPositionAsInteger());
    }

   /**
    * Test getSeasonPositionAsLong() method.
    */
    @Test
    public void subTestGetSeasonPositionAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getSeasonPositionAsLong());
        System.out.println("Number of the Season AS Long === " + jMetaDataGeneral.getSeasonPositionAsLong());
    }

   /**
    * Test getSeasonPositionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSeasonPositionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getSeasonPositionAsLocalDateTime());
        System.out.println("Number of the Season AS LocalDateTime === " + jMetaDataGeneral.getSeasonPositionAsLocalDateTime());
    }

   /**
    * Test getSeasonPositionAsLocalTime() method.
    */
    @Test
    public void subTestGetSeasonPositionAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getSeasonPositionAsLocalTime());
        System.out.println("Number of the Season AS LocalTime === " + jMetaDataGeneral.getSeasonPositionAsLocalTime());
    }

   /**
    * Test getSeasonPositionAsString() method.
    */
    @Test
    public void subTestGetSeasonPositionAsString() {
        assertEquals(null, this.jMetaDataGeneral.getSeasonPositionAsString());
        System.out.println("Number of the Season AS String === " + jMetaDataGeneral.getSeasonPositionAsString());
    }

   /**
    * Test getSeasonPositionAsBoolean() method.
    */
    @Test
    public void subTestGetSeasonPositionAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getSeasonPositionAsBoolean());
        System.out.println("Number of the Season AS Boolean === " + jMetaDataGeneral.getSeasonPositionAsBoolean());
    }

   /**
    * Test getSeasonPositionAsBigInteger() method.
    */
    @Test
    public void subTestGetSeasonPositionAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getSeasonPositionAsBigInteger());
        System.out.println("Number of the Season AS BigInteger === " + jMetaDataGeneral.getSeasonPositionAsBigInteger());
    }

   /**
    * Test getSeasonPositionAsURL() method.
    */
    @Test
    public void subTestGetSeasonPositionAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getSeasonPositionAsURL());
        System.out.println("Number of the Season AS URL === " + jMetaDataGeneral.getSeasonPositionAsURL());
    }

   /**
    * Test getOriginalSourceFormNumColorsAsInteger() method.
    */
    @Test
    public void subTestGetOriginalSourceFormNumColorsAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormNumColorsAsInteger());
        System.out.println("Number of colors requested when digitizing, e.g. 256 for images or 32 bit RGB for video AS Integer === " + jMetaDataGeneral.getOriginalSourceFormNumColorsAsInteger());
    }

   /**
    * Test getOriginalSourceFormNumColorsAsLong() method.
    */
    @Test
    public void subTestGetOriginalSourceFormNumColorsAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormNumColorsAsLong());
        System.out.println("Number of colors requested when digitizing, e.g. 256 for images or 32 bit RGB for video AS Long === " + jMetaDataGeneral.getOriginalSourceFormNumColorsAsLong());
    }

   /**
    * Test getOriginalSourceFormNumColorsAsLocalDateTime() method.
    */
    @Test
    public void subTestGetOriginalSourceFormNumColorsAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormNumColorsAsLocalDateTime());
        System.out.println("Number of colors requested when digitizing, e.g. 256 for images or 32 bit RGB for video AS LocalDateTime === " + jMetaDataGeneral.getOriginalSourceFormNumColorsAsLocalDateTime());
    }

   /**
    * Test getOriginalSourceFormNumColorsAsLocalTime() method.
    */
    @Test
    public void subTestGetOriginalSourceFormNumColorsAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormNumColorsAsLocalTime());
        System.out.println("Number of colors requested when digitizing, e.g. 256 for images or 32 bit RGB for video AS LocalTime === " + jMetaDataGeneral.getOriginalSourceFormNumColorsAsLocalTime());
    }

   /**
    * Test getOriginalSourceFormNumColorsAsString() method.
    */
    @Test
    public void subTestGetOriginalSourceFormNumColorsAsString() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormNumColorsAsString());
        System.out.println("Number of colors requested when digitizing, e.g. 256 for images or 32 bit RGB for video AS String === " + jMetaDataGeneral.getOriginalSourceFormNumColorsAsString());
    }

   /**
    * Test getOriginalSourceFormNumColorsAsBoolean() method.
    */
    @Test
    public void subTestGetOriginalSourceFormNumColorsAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormNumColorsAsBoolean());
        System.out.println("Number of colors requested when digitizing, e.g. 256 for images or 32 bit RGB for video AS Boolean === " + jMetaDataGeneral.getOriginalSourceFormNumColorsAsBoolean());
    }

   /**
    * Test getOriginalSourceFormNumColorsAsBigInteger() method.
    */
    @Test
    public void subTestGetOriginalSourceFormNumColorsAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormNumColorsAsBigInteger());
        System.out.println("Number of colors requested when digitizing, e.g. 256 for images or 32 bit RGB for video AS BigInteger === " + jMetaDataGeneral.getOriginalSourceFormNumColorsAsBigInteger());
    }

   /**
    * Test getOriginalSourceFormNumColorsAsURL() method.
    */
    @Test
    public void subTestGetOriginalSourceFormNumColorsAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormNumColorsAsURL());
        System.out.println("Number of colors requested when digitizing, e.g. 256 for images or 32 bit RGB for video AS URL === " + jMetaDataGeneral.getOriginalSourceFormNumColorsAsURL());
    }

   /**
    * Test getDurationAsInteger() method.
    */
    @Test
    public void subTestGetDurationAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDurationAsInteger());
        System.out.println("Play time of the stream in ms AS Integer === " + jMetaDataGeneral.getDurationAsInteger());
    }

   /**
    * Test getDurationAsLong() method.
    */
    @Test
    public void subTestGetDurationAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getDurationAsLong());
        System.out.println("Play time of the stream in ms AS Long === " + jMetaDataGeneral.getDurationAsLong());
    }

   /**
    * Test getDurationAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getDurationAsLocalDateTime());
        System.out.println("Play time of the stream in ms AS LocalDateTime === " + jMetaDataGeneral.getDurationAsLocalDateTime());
    }

   /**
    * Test getDurationAsLocalTime() method.
    */
    @Test
    public void subTestGetDurationAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getDurationAsLocalTime());
        System.out.println("Play time of the stream in ms AS LocalTime === " + jMetaDataGeneral.getDurationAsLocalTime());
    }

   /**
    * Test getDurationAsString() method.
    */
    @Test
    public void subTestGetDurationAsString() {
        assertEquals(null, this.jMetaDataGeneral.getDurationAsString());
        System.out.println("Play time of the stream in ms AS String === " + jMetaDataGeneral.getDurationAsString());
    }

   /**
    * Test getDurationAsBoolean() method.
    */
    @Test
    public void subTestGetDurationAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getDurationAsBoolean());
        System.out.println("Play time of the stream in ms AS Boolean === " + jMetaDataGeneral.getDurationAsBoolean());
    }

   /**
    * Test getDurationAsBigInteger() method.
    */
    @Test
    public void subTestGetDurationAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDurationAsBigInteger());
        System.out.println("Play time of the stream in ms AS BigInteger === " + jMetaDataGeneral.getDurationAsBigInteger());
    }

   /**
    * Test getDurationAsURL() method.
    */
    @Test
    public void subTestGetDurationAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getDurationAsURL());
        System.out.println("Play time of the stream in ms AS URL === " + jMetaDataGeneral.getDurationAsURL());
    }

   /**
    * Test getComposerNationalityAsInteger() method.
    */
    @Test
    public void subTestGetComposerNationalityAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getComposerNationalityAsInteger());
        System.out.println("Nationality of the main composer of the item, mostly for classical music. AS Integer === " + jMetaDataGeneral.getComposerNationalityAsInteger());
    }

   /**
    * Test getComposerNationalityAsLong() method.
    */
    @Test
    public void subTestGetComposerNationalityAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getComposerNationalityAsLong());
        System.out.println("Nationality of the main composer of the item, mostly for classical music. AS Long === " + jMetaDataGeneral.getComposerNationalityAsLong());
    }

   /**
    * Test getComposerNationalityAsLocalDateTime() method.
    */
    @Test
    public void subTestGetComposerNationalityAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getComposerNationalityAsLocalDateTime());
        System.out.println("Nationality of the main composer of the item, mostly for classical music. AS LocalDateTime === " + jMetaDataGeneral.getComposerNationalityAsLocalDateTime());
    }

   /**
    * Test getComposerNationalityAsLocalTime() method.
    */
    @Test
    public void subTestGetComposerNationalityAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getComposerNationalityAsLocalTime());
        System.out.println("Nationality of the main composer of the item, mostly for classical music. AS LocalTime === " + jMetaDataGeneral.getComposerNationalityAsLocalTime());
    }

   /**
    * Test getComposerNationalityAsString() method.
    */
    @Test
    public void subTestGetComposerNationalityAsString() {
        assertEquals(null, this.jMetaDataGeneral.getComposerNationalityAsString());
        System.out.println("Nationality of the main composer of the item, mostly for classical music. AS String === " + jMetaDataGeneral.getComposerNationalityAsString());
    }

   /**
    * Test getComposerNationalityAsBoolean() method.
    */
    @Test
    public void subTestGetComposerNationalityAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getComposerNationalityAsBoolean());
        System.out.println("Nationality of the main composer of the item, mostly for classical music. AS Boolean === " + jMetaDataGeneral.getComposerNationalityAsBoolean());
    }

   /**
    * Test getComposerNationalityAsBigInteger() method.
    */
    @Test
    public void subTestGetComposerNationalityAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getComposerNationalityAsBigInteger());
        System.out.println("Nationality of the main composer of the item, mostly for classical music. AS BigInteger === " + jMetaDataGeneral.getComposerNationalityAsBigInteger());
    }

   /**
    * Test getComposerNationalityAsURL() method.
    */
    @Test
    public void subTestGetComposerNationalityAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getComposerNationalityAsURL());
        System.out.println("Nationality of the main composer of the item, mostly for classical music. AS URL === " + jMetaDataGeneral.getComposerNationalityAsURL());
    }

   /**
    * Test getCodecIDHintAsInteger() method.
    */
    @Test
    public void subTestGetCodecIDHintAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDHintAsInteger());
        System.out.println("A hint/popular name for this codec AS Integer === " + jMetaDataGeneral.getCodecIDHintAsInteger());
    }

   /**
    * Test getCodecIDHintAsLong() method.
    */
    @Test
    public void subTestGetCodecIDHintAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDHintAsLong());
        System.out.println("A hint/popular name for this codec AS Long === " + jMetaDataGeneral.getCodecIDHintAsLong());
    }

   /**
    * Test getCodecIDHintAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCodecIDHintAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDHintAsLocalDateTime());
        System.out.println("A hint/popular name for this codec AS LocalDateTime === " + jMetaDataGeneral.getCodecIDHintAsLocalDateTime());
    }

   /**
    * Test getCodecIDHintAsLocalTime() method.
    */
    @Test
    public void subTestGetCodecIDHintAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDHintAsLocalTime());
        System.out.println("A hint/popular name for this codec AS LocalTime === " + jMetaDataGeneral.getCodecIDHintAsLocalTime());
    }

   /**
    * Test getCodecIDHintAsString() method.
    */
    @Test
    public void subTestGetCodecIDHintAsString() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDHintAsString());
        System.out.println("A hint/popular name for this codec AS String === " + jMetaDataGeneral.getCodecIDHintAsString());
    }

   /**
    * Test getCodecIDHintAsBoolean() method.
    */
    @Test
    public void subTestGetCodecIDHintAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDHintAsBoolean());
        System.out.println("A hint/popular name for this codec AS Boolean === " + jMetaDataGeneral.getCodecIDHintAsBoolean());
    }

   /**
    * Test getCodecIDHintAsBigInteger() method.
    */
    @Test
    public void subTestGetCodecIDHintAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDHintAsBigInteger());
        System.out.println("A hint/popular name for this codec AS BigInteger === " + jMetaDataGeneral.getCodecIDHintAsBigInteger());
    }

   /**
    * Test getCodecIDHintAsURL() method.
    */
    @Test
    public void subTestGetCodecIDHintAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDHintAsURL());
        System.out.println("A hint/popular name for this codec AS URL === " + jMetaDataGeneral.getCodecIDHintAsURL());
    }

   /**
    * Test getServiceUrlAsInteger() method.
    */
    @Test
    public void subTestGetServiceUrlAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getServiceUrlAsInteger());
        System.out.println("Service/Url AS Integer === " + jMetaDataGeneral.getServiceUrlAsInteger());
    }

   /**
    * Test getServiceUrlAsLong() method.
    */
    @Test
    public void subTestGetServiceUrlAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getServiceUrlAsLong());
        System.out.println("Service/Url AS Long === " + jMetaDataGeneral.getServiceUrlAsLong());
    }

   /**
    * Test getServiceUrlAsLocalDateTime() method.
    */
    @Test
    public void subTestGetServiceUrlAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getServiceUrlAsLocalDateTime());
        System.out.println("Service/Url AS LocalDateTime === " + jMetaDataGeneral.getServiceUrlAsLocalDateTime());
    }

   /**
    * Test getServiceUrlAsLocalTime() method.
    */
    @Test
    public void subTestGetServiceUrlAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getServiceUrlAsLocalTime());
        System.out.println("Service/Url AS LocalTime === " + jMetaDataGeneral.getServiceUrlAsLocalTime());
    }

   /**
    * Test getServiceUrlAsString() method.
    */
    @Test
    public void subTestGetServiceUrlAsString() {
        assertEquals(null, this.jMetaDataGeneral.getServiceUrlAsString());
        System.out.println("Service/Url AS String === " + jMetaDataGeneral.getServiceUrlAsString());
    }

   /**
    * Test getServiceUrlAsBoolean() method.
    */
    @Test
    public void subTestGetServiceUrlAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getServiceUrlAsBoolean());
        System.out.println("Service/Url AS Boolean === " + jMetaDataGeneral.getServiceUrlAsBoolean());
    }

   /**
    * Test getServiceUrlAsBigInteger() method.
    */
    @Test
    public void subTestGetServiceUrlAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getServiceUrlAsBigInteger());
        System.out.println("Service/Url AS BigInteger === " + jMetaDataGeneral.getServiceUrlAsBigInteger());
    }

   /**
    * Test getServiceUrlAsURL() method.
    */
    @Test
    public void subTestGetServiceUrlAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getServiceUrlAsURL());
        System.out.println("Service/Url AS URL === " + jMetaDataGeneral.getServiceUrlAsURL());
    }

   /**
    * Test getEncodedByAsInteger() method.
    */
    @Test
    public void subTestGetEncodedByAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedByAsInteger());
        System.out.println("Name of the person or organisation that encoded/ripped the audio file. AS Integer === " + jMetaDataGeneral.getEncodedByAsInteger());
    }

   /**
    * Test getEncodedByAsLong() method.
    */
    @Test
    public void subTestGetEncodedByAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedByAsLong());
        System.out.println("Name of the person or organisation that encoded/ripped the audio file. AS Long === " + jMetaDataGeneral.getEncodedByAsLong());
    }

   /**
    * Test getEncodedByAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedByAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedByAsLocalDateTime());
        System.out.println("Name of the person or organisation that encoded/ripped the audio file. AS LocalDateTime === " + jMetaDataGeneral.getEncodedByAsLocalDateTime());
    }

   /**
    * Test getEncodedByAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedByAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedByAsLocalTime());
        System.out.println("Name of the person or organisation that encoded/ripped the audio file. AS LocalTime === " + jMetaDataGeneral.getEncodedByAsLocalTime());
    }

   /**
    * Test getEncodedByAsString() method.
    */
    @Test
    public void subTestGetEncodedByAsString() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedByAsString());
        System.out.println("Name of the person or organisation that encoded/ripped the audio file. AS String === " + jMetaDataGeneral.getEncodedByAsString());
    }

   /**
    * Test getEncodedByAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedByAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedByAsBoolean());
        System.out.println("Name of the person or organisation that encoded/ripped the audio file. AS Boolean === " + jMetaDataGeneral.getEncodedByAsBoolean());
    }

   /**
    * Test getEncodedByAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedByAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedByAsBigInteger());
        System.out.println("Name of the person or organisation that encoded/ripped the audio file. AS BigInteger === " + jMetaDataGeneral.getEncodedByAsBigInteger());
    }

   /**
    * Test getEncodedByAsURL() method.
    */
    @Test
    public void subTestGetEncodedByAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedByAsURL());
        System.out.println("Name of the person or organisation that encoded/ripped the audio file. AS URL === " + jMetaDataGeneral.getEncodedByAsURL());
    }

   /**
    * Test getEncodedApplicationAsInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationAsInteger());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit AS Integer === " + jMetaDataGeneral.getEncodedApplicationAsInteger());
    }

   /**
    * Test getEncodedApplicationAsLong() method.
    */
    @Test
    public void subTestGetEncodedApplicationAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationAsLong());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit AS Long === " + jMetaDataGeneral.getEncodedApplicationAsLong());
    }

   /**
    * Test getEncodedApplicationAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationAsLocalDateTime());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit AS LocalDateTime === " + jMetaDataGeneral.getEncodedApplicationAsLocalDateTime());
    }

   /**
    * Test getEncodedApplicationAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationAsLocalTime());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit AS LocalTime === " + jMetaDataGeneral.getEncodedApplicationAsLocalTime());
    }

   /**
    * Test getEncodedApplicationAsString() method.
    */
    @Test
    public void subTestGetEncodedApplicationAsString() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationAsString());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit AS String === " + jMetaDataGeneral.getEncodedApplicationAsString());
    }

   /**
    * Test getEncodedApplicationAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedApplicationAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationAsBoolean());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit AS Boolean === " + jMetaDataGeneral.getEncodedApplicationAsBoolean());
    }

   /**
    * Test getEncodedApplicationAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationAsBigInteger());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit AS BigInteger === " + jMetaDataGeneral.getEncodedApplicationAsBigInteger());
    }

   /**
    * Test getEncodedApplicationAsURL() method.
    */
    @Test
    public void subTestGetEncodedApplicationAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationAsURL());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit AS URL === " + jMetaDataGeneral.getEncodedApplicationAsURL());
    }

   /**
    * Test getServiceNameAsInteger() method.
    */
    @Test
    public void subTestGetServiceNameAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getServiceNameAsInteger());
        System.out.println("ServiceName AS Integer === " + jMetaDataGeneral.getServiceNameAsInteger());
    }

   /**
    * Test getServiceNameAsLong() method.
    */
    @Test
    public void subTestGetServiceNameAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getServiceNameAsLong());
        System.out.println("ServiceName AS Long === " + jMetaDataGeneral.getServiceNameAsLong());
    }

   /**
    * Test getServiceNameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetServiceNameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getServiceNameAsLocalDateTime());
        System.out.println("ServiceName AS LocalDateTime === " + jMetaDataGeneral.getServiceNameAsLocalDateTime());
    }

   /**
    * Test getServiceNameAsLocalTime() method.
    */
    @Test
    public void subTestGetServiceNameAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getServiceNameAsLocalTime());
        System.out.println("ServiceName AS LocalTime === " + jMetaDataGeneral.getServiceNameAsLocalTime());
    }

   /**
    * Test getServiceNameAsString() method.
    */
    @Test
    public void subTestGetServiceNameAsString() {
        assertEquals(null, this.jMetaDataGeneral.getServiceNameAsString());
        System.out.println("ServiceName AS String === " + jMetaDataGeneral.getServiceNameAsString());
    }

   /**
    * Test getServiceNameAsBoolean() method.
    */
    @Test
    public void subTestGetServiceNameAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getServiceNameAsBoolean());
        System.out.println("ServiceName AS Boolean === " + jMetaDataGeneral.getServiceNameAsBoolean());
    }

   /**
    * Test getServiceNameAsBigInteger() method.
    */
    @Test
    public void subTestGetServiceNameAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getServiceNameAsBigInteger());
        System.out.println("ServiceName AS BigInteger === " + jMetaDataGeneral.getServiceNameAsBigInteger());
    }

   /**
    * Test getServiceNameAsURL() method.
    */
    @Test
    public void subTestGetServiceNameAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getServiceNameAsURL());
        System.out.println("ServiceName AS URL === " + jMetaDataGeneral.getServiceNameAsURL());
    }

   /**
    * Test getServiceProviderAsInteger() method.
    */
    @Test
    public void subTestGetServiceProviderAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getServiceProviderAsInteger());
        System.out.println("ServiceProvider AS Integer === " + jMetaDataGeneral.getServiceProviderAsInteger());
    }

   /**
    * Test getServiceProviderAsLong() method.
    */
    @Test
    public void subTestGetServiceProviderAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getServiceProviderAsLong());
        System.out.println("ServiceProvider AS Long === " + jMetaDataGeneral.getServiceProviderAsLong());
    }

   /**
    * Test getServiceProviderAsLocalDateTime() method.
    */
    @Test
    public void subTestGetServiceProviderAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getServiceProviderAsLocalDateTime());
        System.out.println("ServiceProvider AS LocalDateTime === " + jMetaDataGeneral.getServiceProviderAsLocalDateTime());
    }

   /**
    * Test getServiceProviderAsLocalTime() method.
    */
    @Test
    public void subTestGetServiceProviderAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getServiceProviderAsLocalTime());
        System.out.println("ServiceProvider AS LocalTime === " + jMetaDataGeneral.getServiceProviderAsLocalTime());
    }

   /**
    * Test getServiceProviderAsString() method.
    */
    @Test
    public void subTestGetServiceProviderAsString() {
        assertEquals(null, this.jMetaDataGeneral.getServiceProviderAsString());
        System.out.println("ServiceProvider AS String === " + jMetaDataGeneral.getServiceProviderAsString());
    }

   /**
    * Test getServiceProviderAsBoolean() method.
    */
    @Test
    public void subTestGetServiceProviderAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getServiceProviderAsBoolean());
        System.out.println("ServiceProvider AS Boolean === " + jMetaDataGeneral.getServiceProviderAsBoolean());
    }

   /**
    * Test getServiceProviderAsBigInteger() method.
    */
    @Test
    public void subTestGetServiceProviderAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getServiceProviderAsBigInteger());
        System.out.println("ServiceProvider AS BigInteger === " + jMetaDataGeneral.getServiceProviderAsBigInteger());
    }

   /**
    * Test getServiceProviderAsURL() method.
    */
    @Test
    public void subTestGetServiceProviderAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getServiceProviderAsURL());
        System.out.println("ServiceProvider AS URL === " + jMetaDataGeneral.getServiceProviderAsURL());
    }

   /**
    * Test getImageLanguageListAsInteger() method.
    */
    @Test
    public void subTestGetImageLanguageListAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getImageLanguageListAsInteger());
        System.out.println("Image languages in this file, separated by / AS Integer === " + jMetaDataGeneral.getImageLanguageListAsInteger());
    }

   /**
    * Test getImageLanguageListAsLong() method.
    */
    @Test
    public void subTestGetImageLanguageListAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getImageLanguageListAsLong());
        System.out.println("Image languages in this file, separated by / AS Long === " + jMetaDataGeneral.getImageLanguageListAsLong());
    }

   /**
    * Test getImageLanguageListAsLocalDateTime() method.
    */
    @Test
    public void subTestGetImageLanguageListAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getImageLanguageListAsLocalDateTime());
        System.out.println("Image languages in this file, separated by / AS LocalDateTime === " + jMetaDataGeneral.getImageLanguageListAsLocalDateTime());
    }

   /**
    * Test getImageLanguageListAsLocalTime() method.
    */
    @Test
    public void subTestGetImageLanguageListAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getImageLanguageListAsLocalTime());
        System.out.println("Image languages in this file, separated by / AS LocalTime === " + jMetaDataGeneral.getImageLanguageListAsLocalTime());
    }

   /**
    * Test getImageLanguageListAsString() method.
    */
    @Test
    public void subTestGetImageLanguageListAsString() {
        assertEquals(null, this.jMetaDataGeneral.getImageLanguageListAsString());
        System.out.println("Image languages in this file, separated by / AS String === " + jMetaDataGeneral.getImageLanguageListAsString());
    }

   /**
    * Test getImageLanguageListAsBoolean() method.
    */
    @Test
    public void subTestGetImageLanguageListAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getImageLanguageListAsBoolean());
        System.out.println("Image languages in this file, separated by / AS Boolean === " + jMetaDataGeneral.getImageLanguageListAsBoolean());
    }

   /**
    * Test getImageLanguageListAsBigInteger() method.
    */
    @Test
    public void subTestGetImageLanguageListAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getImageLanguageListAsBigInteger());
        System.out.println("Image languages in this file, separated by / AS BigInteger === " + jMetaDataGeneral.getImageLanguageListAsBigInteger());
    }

   /**
    * Test getImageLanguageListAsURL() method.
    */
    @Test
    public void subTestGetImageLanguageListAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getImageLanguageListAsURL());
        System.out.println("Image languages in this file, separated by / AS URL === " + jMetaDataGeneral.getImageLanguageListAsURL());
    }

   /**
    * Test getStreamSizeString2AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeString2AsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeString2AsInteger());
        System.out.println("StreamSize/String2 AS Integer === " + jMetaDataGeneral.getStreamSizeString2AsInteger());
    }

   /**
    * Test getStreamSizeString2AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeString2AsLong() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeString2AsLong());
        System.out.println("StreamSize/String2 AS Long === " + jMetaDataGeneral.getStreamSizeString2AsLong());
    }

   /**
    * Test getStreamSizeString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeString2AsLocalDateTime());
        System.out.println("StreamSize/String2 AS LocalDateTime === " + jMetaDataGeneral.getStreamSizeString2AsLocalDateTime());
    }

   /**
    * Test getStreamSizeString2AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeString2AsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeString2AsLocalTime());
        System.out.println("StreamSize/String2 AS LocalTime === " + jMetaDataGeneral.getStreamSizeString2AsLocalTime());
    }

   /**
    * Test getStreamSizeString2AsString() method.
    */
    @Test
    public void subTestGetStreamSizeString2AsString() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeString2AsString());
        System.out.println("StreamSize/String2 AS String === " + jMetaDataGeneral.getStreamSizeString2AsString());
    }

   /**
    * Test getStreamSizeString2AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeString2AsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeString2AsBoolean());
        System.out.println("StreamSize/String2 AS Boolean === " + jMetaDataGeneral.getStreamSizeString2AsBoolean());
    }

   /**
    * Test getStreamSizeString2AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeString2AsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeString2AsBigInteger());
        System.out.println("StreamSize/String2 AS BigInteger === " + jMetaDataGeneral.getStreamSizeString2AsBigInteger());
    }

   /**
    * Test getStreamSizeString2AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeString2AsURL() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeString2AsURL());
        System.out.println("StreamSize/String2 AS URL === " + jMetaDataGeneral.getStreamSizeString2AsURL());
    }

   /**
    * Test getConductorAsInteger() method.
    */
    @Test
    public void subTestGetConductorAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getConductorAsInteger());
        System.out.println("The artist(s) who performed the work. In classical music this would be the conductor, orchestra, soloists. AS Integer === " + jMetaDataGeneral.getConductorAsInteger());
    }

   /**
    * Test getConductorAsLong() method.
    */
    @Test
    public void subTestGetConductorAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getConductorAsLong());
        System.out.println("The artist(s) who performed the work. In classical music this would be the conductor, orchestra, soloists. AS Long === " + jMetaDataGeneral.getConductorAsLong());
    }

   /**
    * Test getConductorAsLocalDateTime() method.
    */
    @Test
    public void subTestGetConductorAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getConductorAsLocalDateTime());
        System.out.println("The artist(s) who performed the work. In classical music this would be the conductor, orchestra, soloists. AS LocalDateTime === " + jMetaDataGeneral.getConductorAsLocalDateTime());
    }

   /**
    * Test getConductorAsLocalTime() method.
    */
    @Test
    public void subTestGetConductorAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getConductorAsLocalTime());
        System.out.println("The artist(s) who performed the work. In classical music this would be the conductor, orchestra, soloists. AS LocalTime === " + jMetaDataGeneral.getConductorAsLocalTime());
    }

   /**
    * Test getConductorAsString() method.
    */
    @Test
    public void subTestGetConductorAsString() {
        assertEquals(null, this.jMetaDataGeneral.getConductorAsString());
        System.out.println("The artist(s) who performed the work. In classical music this would be the conductor, orchestra, soloists. AS String === " + jMetaDataGeneral.getConductorAsString());
    }

   /**
    * Test getConductorAsBoolean() method.
    */
    @Test
    public void subTestGetConductorAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getConductorAsBoolean());
        System.out.println("The artist(s) who performed the work. In classical music this would be the conductor, orchestra, soloists. AS Boolean === " + jMetaDataGeneral.getConductorAsBoolean());
    }

   /**
    * Test getConductorAsBigInteger() method.
    */
    @Test
    public void subTestGetConductorAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getConductorAsBigInteger());
        System.out.println("The artist(s) who performed the work. In classical music this would be the conductor, orchestra, soloists. AS BigInteger === " + jMetaDataGeneral.getConductorAsBigInteger());
    }

   /**
    * Test getConductorAsURL() method.
    */
    @Test
    public void subTestGetConductorAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getConductorAsURL());
        System.out.println("The artist(s) who performed the work. In classical music this would be the conductor, orchestra, soloists. AS URL === " + jMetaDataGeneral.getConductorAsURL());
    }

   /**
    * Test getFileCreatedDateAsInteger() method.
    */
    @Test
    public void subTestGetFileCreatedDateAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFileCreatedDateAsInteger());
        System.out.println("The time that the file was created on the file system AS Integer === " + jMetaDataGeneral.getFileCreatedDateAsInteger());
    }

   /**
    * Test getFileCreatedDateAsLong() method.
    */
    @Test
    public void subTestGetFileCreatedDateAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getFileCreatedDateAsLong());
        System.out.println("The time that the file was created on the file system AS Long === " + jMetaDataGeneral.getFileCreatedDateAsLong());
    }

   /**
    * Test getFileCreatedDateAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFileCreatedDateAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getFileCreatedDateAsLocalDateTime());
        System.out.println("The time that the file was created on the file system AS LocalDateTime === " + jMetaDataGeneral.getFileCreatedDateAsLocalDateTime());
    }

   /**
    * Test getFileCreatedDateAsLocalTime() method.
    */
    @Test
    public void subTestGetFileCreatedDateAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getFileCreatedDateAsLocalTime());
        System.out.println("The time that the file was created on the file system AS LocalTime === " + jMetaDataGeneral.getFileCreatedDateAsLocalTime());
    }

   /**
    * Test getFileCreatedDateAsString() method.
    */
    @Test
    public void subTestGetFileCreatedDateAsString() {
        assertEquals(null, this.jMetaDataGeneral.getFileCreatedDateAsString());
        System.out.println("The time that the file was created on the file system AS String === " + jMetaDataGeneral.getFileCreatedDateAsString());
    }

   /**
    * Test getFileCreatedDateAsBoolean() method.
    */
    @Test
    public void subTestGetFileCreatedDateAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getFileCreatedDateAsBoolean());
        System.out.println("The time that the file was created on the file system AS Boolean === " + jMetaDataGeneral.getFileCreatedDateAsBoolean());
    }

   /**
    * Test getFileCreatedDateAsBigInteger() method.
    */
    @Test
    public void subTestGetFileCreatedDateAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFileCreatedDateAsBigInteger());
        System.out.println("The time that the file was created on the file system AS BigInteger === " + jMetaDataGeneral.getFileCreatedDateAsBigInteger());
    }

   /**
    * Test getFileCreatedDateAsURL() method.
    */
    @Test
    public void subTestGetFileCreatedDateAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getFileCreatedDateAsURL());
        System.out.println("The time that the file was created on the file system AS URL === " + jMetaDataGeneral.getFileCreatedDateAsURL());
    }

   /**
    * Test getArchivalLocationAsInteger() method.
    */
    @Test
    public void subTestGetArchivalLocationAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getArchivalLocationAsInteger());
        System.out.println("Location, where an item is archived, e.eg. Louvre,Paris,France AS Integer === " + jMetaDataGeneral.getArchivalLocationAsInteger());
    }

   /**
    * Test getArchivalLocationAsLong() method.
    */
    @Test
    public void subTestGetArchivalLocationAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getArchivalLocationAsLong());
        System.out.println("Location, where an item is archived, e.eg. Louvre,Paris,France AS Long === " + jMetaDataGeneral.getArchivalLocationAsLong());
    }

   /**
    * Test getArchivalLocationAsLocalDateTime() method.
    */
    @Test
    public void subTestGetArchivalLocationAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getArchivalLocationAsLocalDateTime());
        System.out.println("Location, where an item is archived, e.eg. Louvre,Paris,France AS LocalDateTime === " + jMetaDataGeneral.getArchivalLocationAsLocalDateTime());
    }

   /**
    * Test getArchivalLocationAsLocalTime() method.
    */
    @Test
    public void subTestGetArchivalLocationAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getArchivalLocationAsLocalTime());
        System.out.println("Location, where an item is archived, e.eg. Louvre,Paris,France AS LocalTime === " + jMetaDataGeneral.getArchivalLocationAsLocalTime());
    }

   /**
    * Test getArchivalLocationAsString() method.
    */
    @Test
    public void subTestGetArchivalLocationAsString() {
        assertEquals(null, this.jMetaDataGeneral.getArchivalLocationAsString());
        System.out.println("Location, where an item is archived, e.eg. Louvre,Paris,France AS String === " + jMetaDataGeneral.getArchivalLocationAsString());
    }

   /**
    * Test getArchivalLocationAsBoolean() method.
    */
    @Test
    public void subTestGetArchivalLocationAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getArchivalLocationAsBoolean());
        System.out.println("Location, where an item is archived, e.eg. Louvre,Paris,France AS Boolean === " + jMetaDataGeneral.getArchivalLocationAsBoolean());
    }

   /**
    * Test getArchivalLocationAsBigInteger() method.
    */
    @Test
    public void subTestGetArchivalLocationAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getArchivalLocationAsBigInteger());
        System.out.println("Location, where an item is archived, e.eg. Louvre,Paris,France AS BigInteger === " + jMetaDataGeneral.getArchivalLocationAsBigInteger());
    }

   /**
    * Test getArchivalLocationAsURL() method.
    */
    @Test
    public void subTestGetArchivalLocationAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getArchivalLocationAsURL());
        System.out.println("Location, where an item is archived, e.eg. Louvre,Paris,France AS URL === " + jMetaDataGeneral.getArchivalLocationAsURL());
    }

   /**
    * Test getServiceProviderrUrlAsInteger() method.
    */
    @Test
    public void subTestGetServiceProviderrUrlAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getServiceProviderrUrlAsInteger());
        System.out.println("ServiceProviderr/Url AS Integer === " + jMetaDataGeneral.getServiceProviderrUrlAsInteger());
    }

   /**
    * Test getServiceProviderrUrlAsLong() method.
    */
    @Test
    public void subTestGetServiceProviderrUrlAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getServiceProviderrUrlAsLong());
        System.out.println("ServiceProviderr/Url AS Long === " + jMetaDataGeneral.getServiceProviderrUrlAsLong());
    }

   /**
    * Test getServiceProviderrUrlAsLocalDateTime() method.
    */
    @Test
    public void subTestGetServiceProviderrUrlAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getServiceProviderrUrlAsLocalDateTime());
        System.out.println("ServiceProviderr/Url AS LocalDateTime === " + jMetaDataGeneral.getServiceProviderrUrlAsLocalDateTime());
    }

   /**
    * Test getServiceProviderrUrlAsLocalTime() method.
    */
    @Test
    public void subTestGetServiceProviderrUrlAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getServiceProviderrUrlAsLocalTime());
        System.out.println("ServiceProviderr/Url AS LocalTime === " + jMetaDataGeneral.getServiceProviderrUrlAsLocalTime());
    }

   /**
    * Test getServiceProviderrUrlAsString() method.
    */
    @Test
    public void subTestGetServiceProviderrUrlAsString() {
        assertEquals(null, this.jMetaDataGeneral.getServiceProviderrUrlAsString());
        System.out.println("ServiceProviderr/Url AS String === " + jMetaDataGeneral.getServiceProviderrUrlAsString());
    }

   /**
    * Test getServiceProviderrUrlAsBoolean() method.
    */
    @Test
    public void subTestGetServiceProviderrUrlAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getServiceProviderrUrlAsBoolean());
        System.out.println("ServiceProviderr/Url AS Boolean === " + jMetaDataGeneral.getServiceProviderrUrlAsBoolean());
    }

   /**
    * Test getServiceProviderrUrlAsBigInteger() method.
    */
    @Test
    public void subTestGetServiceProviderrUrlAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getServiceProviderrUrlAsBigInteger());
        System.out.println("ServiceProviderr/Url AS BigInteger === " + jMetaDataGeneral.getServiceProviderrUrlAsBigInteger());
    }

   /**
    * Test getServiceProviderrUrlAsURL() method.
    */
    @Test
    public void subTestGetServiceProviderrUrlAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getServiceProviderrUrlAsURL());
        System.out.println("ServiceProviderr/Url AS URL === " + jMetaDataGeneral.getServiceProviderrUrlAsURL());
    }

   /**
    * Test getStreamSizeString1AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeString1AsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeString1AsInteger());
        System.out.println("StreamSize/String1 AS Integer === " + jMetaDataGeneral.getStreamSizeString1AsInteger());
    }

   /**
    * Test getStreamSizeString1AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeString1AsLong() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeString1AsLong());
        System.out.println("StreamSize/String1 AS Long === " + jMetaDataGeneral.getStreamSizeString1AsLong());
    }

   /**
    * Test getStreamSizeString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeString1AsLocalDateTime());
        System.out.println("StreamSize/String1 AS LocalDateTime === " + jMetaDataGeneral.getStreamSizeString1AsLocalDateTime());
    }

   /**
    * Test getStreamSizeString1AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeString1AsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeString1AsLocalTime());
        System.out.println("StreamSize/String1 AS LocalTime === " + jMetaDataGeneral.getStreamSizeString1AsLocalTime());
    }

   /**
    * Test getStreamSizeString1AsString() method.
    */
    @Test
    public void subTestGetStreamSizeString1AsString() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeString1AsString());
        System.out.println("StreamSize/String1 AS String === " + jMetaDataGeneral.getStreamSizeString1AsString());
    }

   /**
    * Test getStreamSizeString1AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeString1AsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeString1AsBoolean());
        System.out.println("StreamSize/String1 AS Boolean === " + jMetaDataGeneral.getStreamSizeString1AsBoolean());
    }

   /**
    * Test getStreamSizeString1AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeString1AsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeString1AsBigInteger());
        System.out.println("StreamSize/String1 AS BigInteger === " + jMetaDataGeneral.getStreamSizeString1AsBigInteger());
    }

   /**
    * Test getStreamSizeString1AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeString1AsURL() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeString1AsURL());
        System.out.println("StreamSize/String1 AS URL === " + jMetaDataGeneral.getStreamSizeString1AsURL());
    }

   /**
    * Test getStreamSizeString4AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeString4AsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeString4AsInteger());
        System.out.println("StreamSize/String4 AS Integer === " + jMetaDataGeneral.getStreamSizeString4AsInteger());
    }

   /**
    * Test getStreamSizeString4AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeString4AsLong() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeString4AsLong());
        System.out.println("StreamSize/String4 AS Long === " + jMetaDataGeneral.getStreamSizeString4AsLong());
    }

   /**
    * Test getStreamSizeString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeString4AsLocalDateTime());
        System.out.println("StreamSize/String4 AS LocalDateTime === " + jMetaDataGeneral.getStreamSizeString4AsLocalDateTime());
    }

   /**
    * Test getStreamSizeString4AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeString4AsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeString4AsLocalTime());
        System.out.println("StreamSize/String4 AS LocalTime === " + jMetaDataGeneral.getStreamSizeString4AsLocalTime());
    }

   /**
    * Test getStreamSizeString4AsString() method.
    */
    @Test
    public void subTestGetStreamSizeString4AsString() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeString4AsString());
        System.out.println("StreamSize/String4 AS String === " + jMetaDataGeneral.getStreamSizeString4AsString());
    }

   /**
    * Test getStreamSizeString4AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeString4AsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeString4AsBoolean());
        System.out.println("StreamSize/String4 AS Boolean === " + jMetaDataGeneral.getStreamSizeString4AsBoolean());
    }

   /**
    * Test getStreamSizeString4AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeString4AsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeString4AsBigInteger());
        System.out.println("StreamSize/String4 AS BigInteger === " + jMetaDataGeneral.getStreamSizeString4AsBigInteger());
    }

   /**
    * Test getStreamSizeString4AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeString4AsURL() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeString4AsURL());
        System.out.println("StreamSize/String4 AS URL === " + jMetaDataGeneral.getStreamSizeString4AsURL());
    }

   /**
    * Test getDomainAsInteger() method.
    */
    @Test
    public void subTestGetDomainAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDomainAsInteger());
        System.out.println("Univers movies belong to, e.g. Starwars, Stargate, Buffy, Dragonballs AS Integer === " + jMetaDataGeneral.getDomainAsInteger());
    }

   /**
    * Test getDomainAsLong() method.
    */
    @Test
    public void subTestGetDomainAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getDomainAsLong());
        System.out.println("Univers movies belong to, e.g. Starwars, Stargate, Buffy, Dragonballs AS Long === " + jMetaDataGeneral.getDomainAsLong());
    }

   /**
    * Test getDomainAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDomainAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getDomainAsLocalDateTime());
        System.out.println("Univers movies belong to, e.g. Starwars, Stargate, Buffy, Dragonballs AS LocalDateTime === " + jMetaDataGeneral.getDomainAsLocalDateTime());
    }

   /**
    * Test getDomainAsLocalTime() method.
    */
    @Test
    public void subTestGetDomainAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getDomainAsLocalTime());
        System.out.println("Univers movies belong to, e.g. Starwars, Stargate, Buffy, Dragonballs AS LocalTime === " + jMetaDataGeneral.getDomainAsLocalTime());
    }

   /**
    * Test getDomainAsString() method.
    */
    @Test
    public void subTestGetDomainAsString() {
        assertEquals(null, this.jMetaDataGeneral.getDomainAsString());
        System.out.println("Univers movies belong to, e.g. Starwars, Stargate, Buffy, Dragonballs AS String === " + jMetaDataGeneral.getDomainAsString());
    }

   /**
    * Test getDomainAsBoolean() method.
    */
    @Test
    public void subTestGetDomainAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getDomainAsBoolean());
        System.out.println("Univers movies belong to, e.g. Starwars, Stargate, Buffy, Dragonballs AS Boolean === " + jMetaDataGeneral.getDomainAsBoolean());
    }

   /**
    * Test getDomainAsBigInteger() method.
    */
    @Test
    public void subTestGetDomainAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDomainAsBigInteger());
        System.out.println("Univers movies belong to, e.g. Starwars, Stargate, Buffy, Dragonballs AS BigInteger === " + jMetaDataGeneral.getDomainAsBigInteger());
    }

   /**
    * Test getDomainAsURL() method.
    */
    @Test
    public void subTestGetDomainAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getDomainAsURL());
        System.out.println("Univers movies belong to, e.g. Starwars, Stargate, Buffy, Dragonballs AS URL === " + jMetaDataGeneral.getDomainAsURL());
    }

   /**
    * Test getPerformerUrlAsInteger() method.
    */
    @Test
    public void subTestGetPerformerUrlAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getPerformerUrlAsInteger());
        System.out.println("Homepage of the performer/artist AS Integer === " + jMetaDataGeneral.getPerformerUrlAsInteger());
    }

   /**
    * Test getPerformerUrlAsLong() method.
    */
    @Test
    public void subTestGetPerformerUrlAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getPerformerUrlAsLong());
        System.out.println("Homepage of the performer/artist AS Long === " + jMetaDataGeneral.getPerformerUrlAsLong());
    }

   /**
    * Test getPerformerUrlAsLocalDateTime() method.
    */
    @Test
    public void subTestGetPerformerUrlAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getPerformerUrlAsLocalDateTime());
        System.out.println("Homepage of the performer/artist AS LocalDateTime === " + jMetaDataGeneral.getPerformerUrlAsLocalDateTime());
    }

   /**
    * Test getPerformerUrlAsLocalTime() method.
    */
    @Test
    public void subTestGetPerformerUrlAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getPerformerUrlAsLocalTime());
        System.out.println("Homepage of the performer/artist AS LocalTime === " + jMetaDataGeneral.getPerformerUrlAsLocalTime());
    }

   /**
    * Test getPerformerUrlAsString() method.
    */
    @Test
    public void subTestGetPerformerUrlAsString() {
        assertEquals(null, this.jMetaDataGeneral.getPerformerUrlAsString());
        System.out.println("Homepage of the performer/artist AS String === " + jMetaDataGeneral.getPerformerUrlAsString());
    }

   /**
    * Test getPerformerUrlAsBoolean() method.
    */
    @Test
    public void subTestGetPerformerUrlAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getPerformerUrlAsBoolean());
        System.out.println("Homepage of the performer/artist AS Boolean === " + jMetaDataGeneral.getPerformerUrlAsBoolean());
    }

   /**
    * Test getPerformerUrlAsBigInteger() method.
    */
    @Test
    public void subTestGetPerformerUrlAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getPerformerUrlAsBigInteger());
        System.out.println("Homepage of the performer/artist AS BigInteger === " + jMetaDataGeneral.getPerformerUrlAsBigInteger());
    }

   /**
    * Test getPerformerUrlAsURL() method.
    */
    @Test
    public void subTestGetPerformerUrlAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getPerformerUrlAsURL());
        System.out.println("Homepage of the performer/artist AS URL === " + jMetaDataGeneral.getPerformerUrlAsURL());
    }

   /**
    * Test getOverallBitRateMinimumAsInteger() method.
    */
    @Test
    public void subTestGetOverallBitRateMinimumAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateMinimumAsInteger());
        System.out.println("Minimum Bit rate in bps AS Integer === " + jMetaDataGeneral.getOverallBitRateMinimumAsInteger());
    }

   /**
    * Test getOverallBitRateMinimumAsLong() method.
    */
    @Test
    public void subTestGetOverallBitRateMinimumAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateMinimumAsLong());
        System.out.println("Minimum Bit rate in bps AS Long === " + jMetaDataGeneral.getOverallBitRateMinimumAsLong());
    }

   /**
    * Test getOverallBitRateMinimumAsLocalDateTime() method.
    */
    @Test
    public void subTestGetOverallBitRateMinimumAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateMinimumAsLocalDateTime());
        System.out.println("Minimum Bit rate in bps AS LocalDateTime === " + jMetaDataGeneral.getOverallBitRateMinimumAsLocalDateTime());
    }

   /**
    * Test getOverallBitRateMinimumAsLocalTime() method.
    */
    @Test
    public void subTestGetOverallBitRateMinimumAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateMinimumAsLocalTime());
        System.out.println("Minimum Bit rate in bps AS LocalTime === " + jMetaDataGeneral.getOverallBitRateMinimumAsLocalTime());
    }

   /**
    * Test getOverallBitRateMinimumAsString() method.
    */
    @Test
    public void subTestGetOverallBitRateMinimumAsString() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateMinimumAsString());
        System.out.println("Minimum Bit rate in bps AS String === " + jMetaDataGeneral.getOverallBitRateMinimumAsString());
    }

   /**
    * Test getOverallBitRateMinimumAsBoolean() method.
    */
    @Test
    public void subTestGetOverallBitRateMinimumAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateMinimumAsBoolean());
        System.out.println("Minimum Bit rate in bps AS Boolean === " + jMetaDataGeneral.getOverallBitRateMinimumAsBoolean());
    }

   /**
    * Test getOverallBitRateMinimumAsBigInteger() method.
    */
    @Test
    public void subTestGetOverallBitRateMinimumAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateMinimumAsBigInteger());
        System.out.println("Minimum Bit rate in bps AS BigInteger === " + jMetaDataGeneral.getOverallBitRateMinimumAsBigInteger());
    }

   /**
    * Test getOverallBitRateMinimumAsURL() method.
    */
    @Test
    public void subTestGetOverallBitRateMinimumAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateMinimumAsURL());
        System.out.println("Minimum Bit rate in bps AS URL === " + jMetaDataGeneral.getOverallBitRateMinimumAsURL());
    }

   /**
    * Test getStreamSizeString3AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeString3AsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeString3AsInteger());
        System.out.println("StreamSize/String3 AS Integer === " + jMetaDataGeneral.getStreamSizeString3AsInteger());
    }

   /**
    * Test getStreamSizeString3AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeString3AsLong() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeString3AsLong());
        System.out.println("StreamSize/String3 AS Long === " + jMetaDataGeneral.getStreamSizeString3AsLong());
    }

   /**
    * Test getStreamSizeString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeString3AsLocalDateTime());
        System.out.println("StreamSize/String3 AS LocalDateTime === " + jMetaDataGeneral.getStreamSizeString3AsLocalDateTime());
    }

   /**
    * Test getStreamSizeString3AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeString3AsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeString3AsLocalTime());
        System.out.println("StreamSize/String3 AS LocalTime === " + jMetaDataGeneral.getStreamSizeString3AsLocalTime());
    }

   /**
    * Test getStreamSizeString3AsString() method.
    */
    @Test
    public void subTestGetStreamSizeString3AsString() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeString3AsString());
        System.out.println("StreamSize/String3 AS String === " + jMetaDataGeneral.getStreamSizeString3AsString());
    }

   /**
    * Test getStreamSizeString3AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeString3AsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeString3AsBoolean());
        System.out.println("StreamSize/String3 AS Boolean === " + jMetaDataGeneral.getStreamSizeString3AsBoolean());
    }

   /**
    * Test getStreamSizeString3AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeString3AsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeString3AsBigInteger());
        System.out.println("StreamSize/String3 AS BigInteger === " + jMetaDataGeneral.getStreamSizeString3AsBigInteger());
    }

   /**
    * Test getStreamSizeString3AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeString3AsURL() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeString3AsURL());
        System.out.println("StreamSize/String3 AS URL === " + jMetaDataGeneral.getStreamSizeString3AsURL());
    }

   /**
    * Test getPublisherURLAsInteger() method.
    */
    @Test
    public void subTestGetPublisherURLAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getPublisherURLAsInteger());
        System.out.println("Publishers official webpage. AS Integer === " + jMetaDataGeneral.getPublisherURLAsInteger());
    }

   /**
    * Test getPublisherURLAsLong() method.
    */
    @Test
    public void subTestGetPublisherURLAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getPublisherURLAsLong());
        System.out.println("Publishers official webpage. AS Long === " + jMetaDataGeneral.getPublisherURLAsLong());
    }

   /**
    * Test getPublisherURLAsLocalDateTime() method.
    */
    @Test
    public void subTestGetPublisherURLAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getPublisherURLAsLocalDateTime());
        System.out.println("Publishers official webpage. AS LocalDateTime === " + jMetaDataGeneral.getPublisherURLAsLocalDateTime());
    }

   /**
    * Test getPublisherURLAsLocalTime() method.
    */
    @Test
    public void subTestGetPublisherURLAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getPublisherURLAsLocalTime());
        System.out.println("Publishers official webpage. AS LocalTime === " + jMetaDataGeneral.getPublisherURLAsLocalTime());
    }

   /**
    * Test getPublisherURLAsString() method.
    */
    @Test
    public void subTestGetPublisherURLAsString() {
        assertEquals(null, this.jMetaDataGeneral.getPublisherURLAsString());
        System.out.println("Publishers official webpage. AS String === " + jMetaDataGeneral.getPublisherURLAsString());
    }

   /**
    * Test getPublisherURLAsBoolean() method.
    */
    @Test
    public void subTestGetPublisherURLAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getPublisherURLAsBoolean());
        System.out.println("Publishers official webpage. AS Boolean === " + jMetaDataGeneral.getPublisherURLAsBoolean());
    }

   /**
    * Test getPublisherURLAsBigInteger() method.
    */
    @Test
    public void subTestGetPublisherURLAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getPublisherURLAsBigInteger());
        System.out.println("Publishers official webpage. AS BigInteger === " + jMetaDataGeneral.getPublisherURLAsBigInteger());
    }

   /**
    * Test getPublisherURLAsURL() method.
    */
    @Test
    public void subTestGetPublisherURLAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getPublisherURLAsURL());
        System.out.println("Publishers official webpage. AS URL === " + jMetaDataGeneral.getPublisherURLAsURL());
    }

   /**
    * Test getStreamSizeString5AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeString5AsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeString5AsInteger());
        System.out.println("With proportion AS Integer === " + jMetaDataGeneral.getStreamSizeString5AsInteger());
    }

   /**
    * Test getStreamSizeString5AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeString5AsLong() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeString5AsLong());
        System.out.println("With proportion AS Long === " + jMetaDataGeneral.getStreamSizeString5AsLong());
    }

   /**
    * Test getStreamSizeString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeString5AsLocalDateTime());
        System.out.println("With proportion AS LocalDateTime === " + jMetaDataGeneral.getStreamSizeString5AsLocalDateTime());
    }

   /**
    * Test getStreamSizeString5AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeString5AsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeString5AsLocalTime());
        System.out.println("With proportion AS LocalTime === " + jMetaDataGeneral.getStreamSizeString5AsLocalTime());
    }

   /**
    * Test getStreamSizeString5AsString() method.
    */
    @Test
    public void subTestGetStreamSizeString5AsString() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeString5AsString());
        System.out.println("With proportion AS String === " + jMetaDataGeneral.getStreamSizeString5AsString());
    }

   /**
    * Test getStreamSizeString5AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeString5AsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeString5AsBoolean());
        System.out.println("With proportion AS Boolean === " + jMetaDataGeneral.getStreamSizeString5AsBoolean());
    }

   /**
    * Test getStreamSizeString5AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeString5AsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeString5AsBigInteger());
        System.out.println("With proportion AS BigInteger === " + jMetaDataGeneral.getStreamSizeString5AsBigInteger());
    }

   /**
    * Test getStreamSizeString5AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeString5AsURL() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeString5AsURL());
        System.out.println("With proportion AS URL === " + jMetaDataGeneral.getStreamSizeString5AsURL());
    }

   /**
    * Test getStreamKindAsInteger() method.
    */
    @Test
    public void subTestGetStreamKindAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getStreamKindAsInteger());
        System.out.println("Stream type name AS Integer === " + jMetaDataGeneral.getStreamKindAsInteger());
    }

   /**
    * Test getStreamKindAsLong() method.
    */
    @Test
    public void subTestGetStreamKindAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getStreamKindAsLong());
        System.out.println("Stream type name AS Long === " + jMetaDataGeneral.getStreamKindAsLong());
    }

   /**
    * Test getStreamKindAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamKindAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getStreamKindAsLocalDateTime());
        System.out.println("Stream type name AS LocalDateTime === " + jMetaDataGeneral.getStreamKindAsLocalDateTime());
    }

   /**
    * Test getStreamKindAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamKindAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getStreamKindAsLocalTime());
        System.out.println("Stream type name AS LocalTime === " + jMetaDataGeneral.getStreamKindAsLocalTime());
    }

   /**
    * Test getStreamKindAsString() method.
    */
    @Test
    public void subTestGetStreamKindAsString() {
        assertEquals(null, this.jMetaDataGeneral.getStreamKindAsString());
        System.out.println("Stream type name AS String === " + jMetaDataGeneral.getStreamKindAsString());
    }

   /**
    * Test getStreamKindAsBoolean() method.
    */
    @Test
    public void subTestGetStreamKindAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getStreamKindAsBoolean());
        System.out.println("Stream type name AS Boolean === " + jMetaDataGeneral.getStreamKindAsBoolean());
    }

   /**
    * Test getStreamKindAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamKindAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getStreamKindAsBigInteger());
        System.out.println("Stream type name AS BigInteger === " + jMetaDataGeneral.getStreamKindAsBigInteger());
    }

   /**
    * Test getStreamKindAsURL() method.
    */
    @Test
    public void subTestGetStreamKindAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getStreamKindAsURL());
        System.out.println("Stream type name AS URL === " + jMetaDataGeneral.getStreamKindAsURL());
    }

   /**
    * Test getKeywordsAsInteger() method.
    */
    @Test
    public void subTestGetKeywordsAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getKeywordsAsInteger());
        System.out.println("Keywords to the item separated by a comma, used for searching. AS Integer === " + jMetaDataGeneral.getKeywordsAsInteger());
    }

   /**
    * Test getKeywordsAsLong() method.
    */
    @Test
    public void subTestGetKeywordsAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getKeywordsAsLong());
        System.out.println("Keywords to the item separated by a comma, used for searching. AS Long === " + jMetaDataGeneral.getKeywordsAsLong());
    }

   /**
    * Test getKeywordsAsLocalDateTime() method.
    */
    @Test
    public void subTestGetKeywordsAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getKeywordsAsLocalDateTime());
        System.out.println("Keywords to the item separated by a comma, used for searching. AS LocalDateTime === " + jMetaDataGeneral.getKeywordsAsLocalDateTime());
    }

   /**
    * Test getKeywordsAsLocalTime() method.
    */
    @Test
    public void subTestGetKeywordsAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getKeywordsAsLocalTime());
        System.out.println("Keywords to the item separated by a comma, used for searching. AS LocalTime === " + jMetaDataGeneral.getKeywordsAsLocalTime());
    }

   /**
    * Test getKeywordsAsString() method.
    */
    @Test
    public void subTestGetKeywordsAsString() {
        assertEquals(null, this.jMetaDataGeneral.getKeywordsAsString());
        System.out.println("Keywords to the item separated by a comma, used for searching. AS String === " + jMetaDataGeneral.getKeywordsAsString());
    }

   /**
    * Test getKeywordsAsBoolean() method.
    */
    @Test
    public void subTestGetKeywordsAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getKeywordsAsBoolean());
        System.out.println("Keywords to the item separated by a comma, used for searching. AS Boolean === " + jMetaDataGeneral.getKeywordsAsBoolean());
    }

   /**
    * Test getKeywordsAsBigInteger() method.
    */
    @Test
    public void subTestGetKeywordsAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getKeywordsAsBigInteger());
        System.out.println("Keywords to the item separated by a comma, used for searching. AS BigInteger === " + jMetaDataGeneral.getKeywordsAsBigInteger());
    }

   /**
    * Test getKeywordsAsURL() method.
    */
    @Test
    public void subTestGetKeywordsAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getKeywordsAsURL());
        System.out.println("Keywords to the item separated by a comma, used for searching. AS URL === " + jMetaDataGeneral.getKeywordsAsURL());
    }

   /**
    * Test getRatingAsInteger() method.
    */
    @Test
    public void subTestGetRatingAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getRatingAsInteger());
        System.out.println("A numeric value defining how much a person likes the song/movie. The number is between 0 and 5 with decimal values possible (e.g. 2.7), 5(.0) being the highest possible rating. AS Integer === " + jMetaDataGeneral.getRatingAsInteger());
    }

   /**
    * Test getRatingAsLong() method.
    */
    @Test
    public void subTestGetRatingAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getRatingAsLong());
        System.out.println("A numeric value defining how much a person likes the song/movie. The number is between 0 and 5 with decimal values possible (e.g. 2.7), 5(.0) being the highest possible rating. AS Long === " + jMetaDataGeneral.getRatingAsLong());
    }

   /**
    * Test getRatingAsLocalDateTime() method.
    */
    @Test
    public void subTestGetRatingAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getRatingAsLocalDateTime());
        System.out.println("A numeric value defining how much a person likes the song/movie. The number is between 0 and 5 with decimal values possible (e.g. 2.7), 5(.0) being the highest possible rating. AS LocalDateTime === " + jMetaDataGeneral.getRatingAsLocalDateTime());
    }

   /**
    * Test getRatingAsLocalTime() method.
    */
    @Test
    public void subTestGetRatingAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getRatingAsLocalTime());
        System.out.println("A numeric value defining how much a person likes the song/movie. The number is between 0 and 5 with decimal values possible (e.g. 2.7), 5(.0) being the highest possible rating. AS LocalTime === " + jMetaDataGeneral.getRatingAsLocalTime());
    }

   /**
    * Test getRatingAsString() method.
    */
    @Test
    public void subTestGetRatingAsString() {
        assertEquals(null, this.jMetaDataGeneral.getRatingAsString());
        System.out.println("A numeric value defining how much a person likes the song/movie. The number is between 0 and 5 with decimal values possible (e.g. 2.7), 5(.0) being the highest possible rating. AS String === " + jMetaDataGeneral.getRatingAsString());
    }

   /**
    * Test getRatingAsBoolean() method.
    */
    @Test
    public void subTestGetRatingAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getRatingAsBoolean());
        System.out.println("A numeric value defining how much a person likes the song/movie. The number is between 0 and 5 with decimal values possible (e.g. 2.7), 5(.0) being the highest possible rating. AS Boolean === " + jMetaDataGeneral.getRatingAsBoolean());
    }

   /**
    * Test getRatingAsBigInteger() method.
    */
    @Test
    public void subTestGetRatingAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getRatingAsBigInteger());
        System.out.println("A numeric value defining how much a person likes the song/movie. The number is between 0 and 5 with decimal values possible (e.g. 2.7), 5(.0) being the highest possible rating. AS BigInteger === " + jMetaDataGeneral.getRatingAsBigInteger());
    }

   /**
    * Test getRatingAsURL() method.
    */
    @Test
    public void subTestGetRatingAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getRatingAsURL());
        System.out.println("A numeric value defining how much a person likes the song/movie. The number is between 0 and 5 with decimal values possible (e.g. 2.7), 5(.0) being the highest possible rating. AS URL === " + jMetaDataGeneral.getRatingAsURL());
    }

   /**
    * Test getOverallBitRateMaximumStringAsInteger() method.
    */
    @Test
    public void subTestGetOverallBitRateMaximumStringAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateMaximumStringAsInteger());
        System.out.println("Maximum Bit rate (with measurement) AS Integer === " + jMetaDataGeneral.getOverallBitRateMaximumStringAsInteger());
    }

   /**
    * Test getOverallBitRateMaximumStringAsLong() method.
    */
    @Test
    public void subTestGetOverallBitRateMaximumStringAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateMaximumStringAsLong());
        System.out.println("Maximum Bit rate (with measurement) AS Long === " + jMetaDataGeneral.getOverallBitRateMaximumStringAsLong());
    }

   /**
    * Test getOverallBitRateMaximumStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetOverallBitRateMaximumStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateMaximumStringAsLocalDateTime());
        System.out.println("Maximum Bit rate (with measurement) AS LocalDateTime === " + jMetaDataGeneral.getOverallBitRateMaximumStringAsLocalDateTime());
    }

   /**
    * Test getOverallBitRateMaximumStringAsLocalTime() method.
    */
    @Test
    public void subTestGetOverallBitRateMaximumStringAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateMaximumStringAsLocalTime());
        System.out.println("Maximum Bit rate (with measurement) AS LocalTime === " + jMetaDataGeneral.getOverallBitRateMaximumStringAsLocalTime());
    }

   /**
    * Test getOverallBitRateMaximumStringAsString() method.
    */
    @Test
    public void subTestGetOverallBitRateMaximumStringAsString() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateMaximumStringAsString());
        System.out.println("Maximum Bit rate (with measurement) AS String === " + jMetaDataGeneral.getOverallBitRateMaximumStringAsString());
    }

   /**
    * Test getOverallBitRateMaximumStringAsBoolean() method.
    */
    @Test
    public void subTestGetOverallBitRateMaximumStringAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateMaximumStringAsBoolean());
        System.out.println("Maximum Bit rate (with measurement) AS Boolean === " + jMetaDataGeneral.getOverallBitRateMaximumStringAsBoolean());
    }

   /**
    * Test getOverallBitRateMaximumStringAsBigInteger() method.
    */
    @Test
    public void subTestGetOverallBitRateMaximumStringAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateMaximumStringAsBigInteger());
        System.out.println("Maximum Bit rate (with measurement) AS BigInteger === " + jMetaDataGeneral.getOverallBitRateMaximumStringAsBigInteger());
    }

   /**
    * Test getOverallBitRateMaximumStringAsURL() method.
    */
    @Test
    public void subTestGetOverallBitRateMaximumStringAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateMaximumStringAsURL());
        System.out.println("Maximum Bit rate (with measurement) AS URL === " + jMetaDataGeneral.getOverallBitRateMaximumStringAsURL());
    }

   /**
    * Test getOriginalReleasedDateAsInteger() method.
    */
    @Test
    public void subTestGetOriginalReleasedDateAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalReleasedDateAsInteger());
        System.out.println("The date/year that the item was originaly released. AS Integer === " + jMetaDataGeneral.getOriginalReleasedDateAsInteger());
    }

   /**
    * Test getOriginalReleasedDateAsLong() method.
    */
    @Test
    public void subTestGetOriginalReleasedDateAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalReleasedDateAsLong());
        System.out.println("The date/year that the item was originaly released. AS Long === " + jMetaDataGeneral.getOriginalReleasedDateAsLong());
    }

   /**
    * Test getOriginalReleasedDateAsLocalDateTime() method.
    */
    @Test
    public void subTestGetOriginalReleasedDateAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalReleasedDateAsLocalDateTime());
        System.out.println("The date/year that the item was originaly released. AS LocalDateTime === " + jMetaDataGeneral.getOriginalReleasedDateAsLocalDateTime());
    }

   /**
    * Test getOriginalReleasedDateAsLocalTime() method.
    */
    @Test
    public void subTestGetOriginalReleasedDateAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalReleasedDateAsLocalTime());
        System.out.println("The date/year that the item was originaly released. AS LocalTime === " + jMetaDataGeneral.getOriginalReleasedDateAsLocalTime());
    }

   /**
    * Test getOriginalReleasedDateAsString() method.
    */
    @Test
    public void subTestGetOriginalReleasedDateAsString() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalReleasedDateAsString());
        System.out.println("The date/year that the item was originaly released. AS String === " + jMetaDataGeneral.getOriginalReleasedDateAsString());
    }

   /**
    * Test getOriginalReleasedDateAsBoolean() method.
    */
    @Test
    public void subTestGetOriginalReleasedDateAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalReleasedDateAsBoolean());
        System.out.println("The date/year that the item was originaly released. AS Boolean === " + jMetaDataGeneral.getOriginalReleasedDateAsBoolean());
    }

   /**
    * Test getOriginalReleasedDateAsBigInteger() method.
    */
    @Test
    public void subTestGetOriginalReleasedDateAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalReleasedDateAsBigInteger());
        System.out.println("The date/year that the item was originaly released. AS BigInteger === " + jMetaDataGeneral.getOriginalReleasedDateAsBigInteger());
    }

   /**
    * Test getOriginalReleasedDateAsURL() method.
    */
    @Test
    public void subTestGetOriginalReleasedDateAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalReleasedDateAsURL());
        System.out.println("The date/year that the item was originaly released. AS URL === " + jMetaDataGeneral.getOriginalReleasedDateAsURL());
    }

   /**
    * Test getCodecIDAsInteger() method.
    */
    @Test
    public void subTestGetCodecIDAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDAsInteger());
        System.out.println("Codec ID (found in some containers) AS Integer === " + jMetaDataGeneral.getCodecIDAsInteger());
    }

   /**
    * Test getCodecIDAsLong() method.
    */
    @Test
    public void subTestGetCodecIDAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDAsLong());
        System.out.println("Codec ID (found in some containers) AS Long === " + jMetaDataGeneral.getCodecIDAsLong());
    }

   /**
    * Test getCodecIDAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCodecIDAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDAsLocalDateTime());
        System.out.println("Codec ID (found in some containers) AS LocalDateTime === " + jMetaDataGeneral.getCodecIDAsLocalDateTime());
    }

   /**
    * Test getCodecIDAsLocalTime() method.
    */
    @Test
    public void subTestGetCodecIDAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDAsLocalTime());
        System.out.println("Codec ID (found in some containers) AS LocalTime === " + jMetaDataGeneral.getCodecIDAsLocalTime());
    }

   /**
    * Test getCodecIDAsString() method.
    */
    @Test
    public void subTestGetCodecIDAsString() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDAsString());
        System.out.println("Codec ID (found in some containers) AS String === " + jMetaDataGeneral.getCodecIDAsString());
    }

   /**
    * Test getCodecIDAsBoolean() method.
    */
    @Test
    public void subTestGetCodecIDAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDAsBoolean());
        System.out.println("Codec ID (found in some containers) AS Boolean === " + jMetaDataGeneral.getCodecIDAsBoolean());
    }

   /**
    * Test getCodecIDAsBigInteger() method.
    */
    @Test
    public void subTestGetCodecIDAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDAsBigInteger());
        System.out.println("Codec ID (found in some containers) AS BigInteger === " + jMetaDataGeneral.getCodecIDAsBigInteger());
    }

   /**
    * Test getCodecIDAsURL() method.
    */
    @Test
    public void subTestGetCodecIDAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDAsURL());
        System.out.println("Codec ID (found in some containers) AS URL === " + jMetaDataGeneral.getCodecIDAsURL());
    }

   /**
    * Test getAlbumSortAsInteger() method.
    */
    @Test
    public void subTestGetAlbumSortAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumSortAsInteger());
        System.out.println("Album/Sort AS Integer === " + jMetaDataGeneral.getAlbumSortAsInteger());
    }

   /**
    * Test getAlbumSortAsLong() method.
    */
    @Test
    public void subTestGetAlbumSortAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumSortAsLong());
        System.out.println("Album/Sort AS Long === " + jMetaDataGeneral.getAlbumSortAsLong());
    }

   /**
    * Test getAlbumSortAsLocalDateTime() method.
    */
    @Test
    public void subTestGetAlbumSortAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumSortAsLocalDateTime());
        System.out.println("Album/Sort AS LocalDateTime === " + jMetaDataGeneral.getAlbumSortAsLocalDateTime());
    }

   /**
    * Test getAlbumSortAsLocalTime() method.
    */
    @Test
    public void subTestGetAlbumSortAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumSortAsLocalTime());
        System.out.println("Album/Sort AS LocalTime === " + jMetaDataGeneral.getAlbumSortAsLocalTime());
    }

   /**
    * Test getAlbumSortAsString() method.
    */
    @Test
    public void subTestGetAlbumSortAsString() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumSortAsString());
        System.out.println("Album/Sort AS String === " + jMetaDataGeneral.getAlbumSortAsString());
    }

   /**
    * Test getAlbumSortAsBoolean() method.
    */
    @Test
    public void subTestGetAlbumSortAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumSortAsBoolean());
        System.out.println("Album/Sort AS Boolean === " + jMetaDataGeneral.getAlbumSortAsBoolean());
    }

   /**
    * Test getAlbumSortAsBigInteger() method.
    */
    @Test
    public void subTestGetAlbumSortAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumSortAsBigInteger());
        System.out.println("Album/Sort AS BigInteger === " + jMetaDataGeneral.getAlbumSortAsBigInteger());
    }

   /**
    * Test getAlbumSortAsURL() method.
    */
    @Test
    public void subTestGetAlbumSortAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumSortAsURL());
        System.out.println("Album/Sort AS URL === " + jMetaDataGeneral.getAlbumSortAsURL());
    }

   /**
    * Test getAudioLanguageListAsInteger() method.
    */
    @Test
    public void subTestGetAudioLanguageListAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getAudioLanguageListAsInteger());
        System.out.println("Audio languages in this file separated by / AS Integer === " + jMetaDataGeneral.getAudioLanguageListAsInteger());
    }

   /**
    * Test getAudioLanguageListAsLong() method.
    */
    @Test
    public void subTestGetAudioLanguageListAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getAudioLanguageListAsLong());
        System.out.println("Audio languages in this file separated by / AS Long === " + jMetaDataGeneral.getAudioLanguageListAsLong());
    }

   /**
    * Test getAudioLanguageListAsLocalDateTime() method.
    */
    @Test
    public void subTestGetAudioLanguageListAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getAudioLanguageListAsLocalDateTime());
        System.out.println("Audio languages in this file separated by / AS LocalDateTime === " + jMetaDataGeneral.getAudioLanguageListAsLocalDateTime());
    }

   /**
    * Test getAudioLanguageListAsLocalTime() method.
    */
    @Test
    public void subTestGetAudioLanguageListAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getAudioLanguageListAsLocalTime());
        System.out.println("Audio languages in this file separated by / AS LocalTime === " + jMetaDataGeneral.getAudioLanguageListAsLocalTime());
    }

   /**
    * Test getAudioLanguageListAsString() method.
    */
    @Test
    public void subTestGetAudioLanguageListAsString() {
        assertEquals(null, this.jMetaDataGeneral.getAudioLanguageListAsString());
        System.out.println("Audio languages in this file separated by / AS String === " + jMetaDataGeneral.getAudioLanguageListAsString());
    }

   /**
    * Test getAudioLanguageListAsBoolean() method.
    */
    @Test
    public void subTestGetAudioLanguageListAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getAudioLanguageListAsBoolean());
        System.out.println("Audio languages in this file separated by / AS Boolean === " + jMetaDataGeneral.getAudioLanguageListAsBoolean());
    }

   /**
    * Test getAudioLanguageListAsBigInteger() method.
    */
    @Test
    public void subTestGetAudioLanguageListAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getAudioLanguageListAsBigInteger());
        System.out.println("Audio languages in this file separated by / AS BigInteger === " + jMetaDataGeneral.getAudioLanguageListAsBigInteger());
    }

   /**
    * Test getAudioLanguageListAsURL() method.
    */
    @Test
    public void subTestGetAudioLanguageListAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getAudioLanguageListAsURL());
        System.out.println("Audio languages in this file separated by / AS URL === " + jMetaDataGeneral.getAudioLanguageListAsURL());
    }

   /**
    * Test getCoProducerAsInteger() method.
    */
    @Test
    public void subTestGetCoProducerAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCoProducerAsInteger());
        System.out.println("The name of a co-producer. AS Integer === " + jMetaDataGeneral.getCoProducerAsInteger());
    }

   /**
    * Test getCoProducerAsLong() method.
    */
    @Test
    public void subTestGetCoProducerAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getCoProducerAsLong());
        System.out.println("The name of a co-producer. AS Long === " + jMetaDataGeneral.getCoProducerAsLong());
    }

   /**
    * Test getCoProducerAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCoProducerAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getCoProducerAsLocalDateTime());
        System.out.println("The name of a co-producer. AS LocalDateTime === " + jMetaDataGeneral.getCoProducerAsLocalDateTime());
    }

   /**
    * Test getCoProducerAsLocalTime() method.
    */
    @Test
    public void subTestGetCoProducerAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getCoProducerAsLocalTime());
        System.out.println("The name of a co-producer. AS LocalTime === " + jMetaDataGeneral.getCoProducerAsLocalTime());
    }

   /**
    * Test getCoProducerAsString() method.
    */
    @Test
    public void subTestGetCoProducerAsString() {
        assertEquals(null, this.jMetaDataGeneral.getCoProducerAsString());
        System.out.println("The name of a co-producer. AS String === " + jMetaDataGeneral.getCoProducerAsString());
    }

   /**
    * Test getCoProducerAsBoolean() method.
    */
    @Test
    public void subTestGetCoProducerAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getCoProducerAsBoolean());
        System.out.println("The name of a co-producer. AS Boolean === " + jMetaDataGeneral.getCoProducerAsBoolean());
    }

   /**
    * Test getCoProducerAsBigInteger() method.
    */
    @Test
    public void subTestGetCoProducerAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCoProducerAsBigInteger());
        System.out.println("The name of a co-producer. AS BigInteger === " + jMetaDataGeneral.getCoProducerAsBigInteger());
    }

   /**
    * Test getCoProducerAsURL() method.
    */
    @Test
    public void subTestGetCoProducerAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getCoProducerAsURL());
        System.out.println("The name of a co-producer. AS URL === " + jMetaDataGeneral.getCoProducerAsURL());
    }

   /**
    * Test getISBNAsInteger() method.
    */
    @Test
    public void subTestGetISBNAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getISBNAsInteger());
        System.out.println("International Standard Book Number. AS Integer === " + jMetaDataGeneral.getISBNAsInteger());
    }

   /**
    * Test getISBNAsLong() method.
    */
    @Test
    public void subTestGetISBNAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getISBNAsLong());
        System.out.println("International Standard Book Number. AS Long === " + jMetaDataGeneral.getISBNAsLong());
    }

   /**
    * Test getISBNAsLocalDateTime() method.
    */
    @Test
    public void subTestGetISBNAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getISBNAsLocalDateTime());
        System.out.println("International Standard Book Number. AS LocalDateTime === " + jMetaDataGeneral.getISBNAsLocalDateTime());
    }

   /**
    * Test getISBNAsLocalTime() method.
    */
    @Test
    public void subTestGetISBNAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getISBNAsLocalTime());
        System.out.println("International Standard Book Number. AS LocalTime === " + jMetaDataGeneral.getISBNAsLocalTime());
    }

   /**
    * Test getISBNAsString() method.
    */
    @Test
    public void subTestGetISBNAsString() {
        assertEquals(null, this.jMetaDataGeneral.getISBNAsString());
        System.out.println("International Standard Book Number. AS String === " + jMetaDataGeneral.getISBNAsString());
    }

   /**
    * Test getISBNAsBoolean() method.
    */
    @Test
    public void subTestGetISBNAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getISBNAsBoolean());
        System.out.println("International Standard Book Number. AS Boolean === " + jMetaDataGeneral.getISBNAsBoolean());
    }

   /**
    * Test getISBNAsBigInteger() method.
    */
    @Test
    public void subTestGetISBNAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getISBNAsBigInteger());
        System.out.println("International Standard Book Number. AS BigInteger === " + jMetaDataGeneral.getISBNAsBigInteger());
    }

   /**
    * Test getISBNAsURL() method.
    */
    @Test
    public void subTestGetISBNAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getISBNAsURL());
        System.out.println("International Standard Book Number. AS URL === " + jMetaDataGeneral.getISBNAsURL());
    }

   /**
    * Test getChoregrapherAsInteger() method.
    */
    @Test
    public void subTestGetChoregrapherAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getChoregrapherAsInteger());
        System.out.println("The name of the choregrapher. AS Integer === " + jMetaDataGeneral.getChoregrapherAsInteger());
    }

   /**
    * Test getChoregrapherAsLong() method.
    */
    @Test
    public void subTestGetChoregrapherAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getChoregrapherAsLong());
        System.out.println("The name of the choregrapher. AS Long === " + jMetaDataGeneral.getChoregrapherAsLong());
    }

   /**
    * Test getChoregrapherAsLocalDateTime() method.
    */
    @Test
    public void subTestGetChoregrapherAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getChoregrapherAsLocalDateTime());
        System.out.println("The name of the choregrapher. AS LocalDateTime === " + jMetaDataGeneral.getChoregrapherAsLocalDateTime());
    }

   /**
    * Test getChoregrapherAsLocalTime() method.
    */
    @Test
    public void subTestGetChoregrapherAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getChoregrapherAsLocalTime());
        System.out.println("The name of the choregrapher. AS LocalTime === " + jMetaDataGeneral.getChoregrapherAsLocalTime());
    }

   /**
    * Test getChoregrapherAsString() method.
    */
    @Test
    public void subTestGetChoregrapherAsString() {
        assertEquals(null, this.jMetaDataGeneral.getChoregrapherAsString());
        System.out.println("The name of the choregrapher. AS String === " + jMetaDataGeneral.getChoregrapherAsString());
    }

   /**
    * Test getChoregrapherAsBoolean() method.
    */
    @Test
    public void subTestGetChoregrapherAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getChoregrapherAsBoolean());
        System.out.println("The name of the choregrapher. AS Boolean === " + jMetaDataGeneral.getChoregrapherAsBoolean());
    }

   /**
    * Test getChoregrapherAsBigInteger() method.
    */
    @Test
    public void subTestGetChoregrapherAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getChoregrapherAsBigInteger());
        System.out.println("The name of the choregrapher. AS BigInteger === " + jMetaDataGeneral.getChoregrapherAsBigInteger());
    }

   /**
    * Test getChoregrapherAsURL() method.
    */
    @Test
    public void subTestGetChoregrapherAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getChoregrapherAsURL());
        System.out.println("The name of the choregrapher. AS URL === " + jMetaDataGeneral.getChoregrapherAsURL());
    }

   /**
    * Test getEncodedLibraryStringAsInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryStringAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryStringAsInteger());
        System.out.println("Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS Integer === " + jMetaDataGeneral.getEncodedLibraryStringAsInteger());
    }

   /**
    * Test getEncodedLibraryStringAsLong() method.
    */
    @Test
    public void subTestGetEncodedLibraryStringAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryStringAsLong());
        System.out.println("Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS Long === " + jMetaDataGeneral.getEncodedLibraryStringAsLong());
    }

   /**
    * Test getEncodedLibraryStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryStringAsLocalDateTime());
        System.out.println("Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS LocalDateTime === " + jMetaDataGeneral.getEncodedLibraryStringAsLocalDateTime());
    }

   /**
    * Test getEncodedLibraryStringAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryStringAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryStringAsLocalTime());
        System.out.println("Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS LocalTime === " + jMetaDataGeneral.getEncodedLibraryStringAsLocalTime());
    }

   /**
    * Test getEncodedLibraryStringAsString() method.
    */
    @Test
    public void subTestGetEncodedLibraryStringAsString() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryStringAsString());
        System.out.println("Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS String === " + jMetaDataGeneral.getEncodedLibraryStringAsString());
    }

   /**
    * Test getEncodedLibraryStringAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedLibraryStringAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryStringAsBoolean());
        System.out.println("Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS Boolean === " + jMetaDataGeneral.getEncodedLibraryStringAsBoolean());
    }

   /**
    * Test getEncodedLibraryStringAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryStringAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryStringAsBigInteger());
        System.out.println("Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS BigInteger === " + jMetaDataGeneral.getEncodedLibraryStringAsBigInteger());
    }

   /**
    * Test getEncodedLibraryStringAsURL() method.
    */
    @Test
    public void subTestGetEncodedLibraryStringAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryStringAsURL());
        System.out.println("Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS URL === " + jMetaDataGeneral.getEncodedLibraryStringAsURL());
    }

   /**
    * Test getCompleteNameAsInteger() method.
    */
    @Test
    public void subTestGetCompleteNameAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCompleteNameAsInteger());
        System.out.println("Complete name (Folder+Name+Extension) AS Integer === " + jMetaDataGeneral.getCompleteNameAsInteger());
    }

   /**
    * Test getCompleteNameAsLong() method.
    */
    @Test
    public void subTestGetCompleteNameAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getCompleteNameAsLong());
        System.out.println("Complete name (Folder+Name+Extension) AS Long === " + jMetaDataGeneral.getCompleteNameAsLong());
    }

   /**
    * Test getCompleteNameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCompleteNameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getCompleteNameAsLocalDateTime());
        System.out.println("Complete name (Folder+Name+Extension) AS LocalDateTime === " + jMetaDataGeneral.getCompleteNameAsLocalDateTime());
    }

   /**
    * Test getCompleteNameAsLocalTime() method.
    */
    @Test
    public void subTestGetCompleteNameAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getCompleteNameAsLocalTime());
        System.out.println("Complete name (Folder+Name+Extension) AS LocalTime === " + jMetaDataGeneral.getCompleteNameAsLocalTime());
    }

   /**
    * Test getCompleteNameAsString() method.
    */
    @Test
    public void subTestGetCompleteNameAsString() {
        assertEquals(null, this.jMetaDataGeneral.getCompleteNameAsString());
        System.out.println("Complete name (Folder+Name+Extension) AS String === " + jMetaDataGeneral.getCompleteNameAsString());
    }

   /**
    * Test getCompleteNameAsBoolean() method.
    */
    @Test
    public void subTestGetCompleteNameAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getCompleteNameAsBoolean());
        System.out.println("Complete name (Folder+Name+Extension) AS Boolean === " + jMetaDataGeneral.getCompleteNameAsBoolean());
    }

   /**
    * Test getCompleteNameAsBigInteger() method.
    */
    @Test
    public void subTestGetCompleteNameAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCompleteNameAsBigInteger());
        System.out.println("Complete name (Folder+Name+Extension) AS BigInteger === " + jMetaDataGeneral.getCompleteNameAsBigInteger());
    }

   /**
    * Test getCompleteNameAsURL() method.
    */
    @Test
    public void subTestGetCompleteNameAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getCompleteNameAsURL());
        System.out.println("Complete name (Folder+Name+Extension) AS URL === " + jMetaDataGeneral.getCompleteNameAsURL());
    }

   /**
    * Test getStreamSizeStringAsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeStringAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeStringAsInteger());
        System.out.println("StreamSize/String AS Integer === " + jMetaDataGeneral.getStreamSizeStringAsInteger());
    }

   /**
    * Test getStreamSizeStringAsLong() method.
    */
    @Test
    public void subTestGetStreamSizeStringAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeStringAsLong());
        System.out.println("StreamSize/String AS Long === " + jMetaDataGeneral.getStreamSizeStringAsLong());
    }

   /**
    * Test getStreamSizeStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeStringAsLocalDateTime());
        System.out.println("StreamSize/String AS LocalDateTime === " + jMetaDataGeneral.getStreamSizeStringAsLocalDateTime());
    }

   /**
    * Test getStreamSizeStringAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeStringAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeStringAsLocalTime());
        System.out.println("StreamSize/String AS LocalTime === " + jMetaDataGeneral.getStreamSizeStringAsLocalTime());
    }

   /**
    * Test getStreamSizeStringAsString() method.
    */
    @Test
    public void subTestGetStreamSizeStringAsString() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeStringAsString());
        System.out.println("StreamSize/String AS String === " + jMetaDataGeneral.getStreamSizeStringAsString());
    }

   /**
    * Test getStreamSizeStringAsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeStringAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeStringAsBoolean());
        System.out.println("StreamSize/String AS Boolean === " + jMetaDataGeneral.getStreamSizeStringAsBoolean());
    }

   /**
    * Test getStreamSizeStringAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeStringAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeStringAsBigInteger());
        System.out.println("StreamSize/String AS BigInteger === " + jMetaDataGeneral.getStreamSizeStringAsBigInteger());
    }

   /**
    * Test getStreamSizeStringAsURL() method.
    */
    @Test
    public void subTestGetStreamSizeStringAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeStringAsURL());
        System.out.println("StreamSize/String AS URL === " + jMetaDataGeneral.getStreamSizeStringAsURL());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsInteger() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceMediumIDStringAsInteger());
        System.out.println("The ID for this stream in the original medium of the material AS Integer === " + jMetaDataGeneral.getOriginalSourceMediumIDStringAsInteger());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsLong() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceMediumIDStringAsLong());
        System.out.println("The ID for this stream in the original medium of the material AS Long === " + jMetaDataGeneral.getOriginalSourceMediumIDStringAsLong());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceMediumIDStringAsLocalDateTime());
        System.out.println("The ID for this stream in the original medium of the material AS LocalDateTime === " + jMetaDataGeneral.getOriginalSourceMediumIDStringAsLocalDateTime());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsLocalTime() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceMediumIDStringAsLocalTime());
        System.out.println("The ID for this stream in the original medium of the material AS LocalTime === " + jMetaDataGeneral.getOriginalSourceMediumIDStringAsLocalTime());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsString() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsString() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceMediumIDStringAsString());
        System.out.println("The ID for this stream in the original medium of the material AS String === " + jMetaDataGeneral.getOriginalSourceMediumIDStringAsString());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsBoolean() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceMediumIDStringAsBoolean());
        System.out.println("The ID for this stream in the original medium of the material AS Boolean === " + jMetaDataGeneral.getOriginalSourceMediumIDStringAsBoolean());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsBigInteger() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceMediumIDStringAsBigInteger());
        System.out.println("The ID for this stream in the original medium of the material AS BigInteger === " + jMetaDataGeneral.getOriginalSourceMediumIDStringAsBigInteger());
    }

   /**
    * Test getOriginalSourceMediumIDStringAsURL() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDStringAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceMediumIDStringAsURL());
        System.out.println("The ID for this stream in the original medium of the material AS URL === " + jMetaDataGeneral.getOriginalSourceMediumIDStringAsURL());
    }

   /**
    * Test getDistributedByAsInteger() method.
    */
    @Test
    public void subTestGetDistributedByAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDistributedByAsInteger());
        System.out.println("Company the item is mainly distributed by  AS Integer === " + jMetaDataGeneral.getDistributedByAsInteger());
    }

   /**
    * Test getDistributedByAsLong() method.
    */
    @Test
    public void subTestGetDistributedByAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getDistributedByAsLong());
        System.out.println("Company the item is mainly distributed by  AS Long === " + jMetaDataGeneral.getDistributedByAsLong());
    }

   /**
    * Test getDistributedByAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDistributedByAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getDistributedByAsLocalDateTime());
        System.out.println("Company the item is mainly distributed by  AS LocalDateTime === " + jMetaDataGeneral.getDistributedByAsLocalDateTime());
    }

   /**
    * Test getDistributedByAsLocalTime() method.
    */
    @Test
    public void subTestGetDistributedByAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getDistributedByAsLocalTime());
        System.out.println("Company the item is mainly distributed by  AS LocalTime === " + jMetaDataGeneral.getDistributedByAsLocalTime());
    }

   /**
    * Test getDistributedByAsString() method.
    */
    @Test
    public void subTestGetDistributedByAsString() {
        assertEquals(null, this.jMetaDataGeneral.getDistributedByAsString());
        System.out.println("Company the item is mainly distributed by  AS String === " + jMetaDataGeneral.getDistributedByAsString());
    }

   /**
    * Test getDistributedByAsBoolean() method.
    */
    @Test
    public void subTestGetDistributedByAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getDistributedByAsBoolean());
        System.out.println("Company the item is mainly distributed by  AS Boolean === " + jMetaDataGeneral.getDistributedByAsBoolean());
    }

   /**
    * Test getDistributedByAsBigInteger() method.
    */
    @Test
    public void subTestGetDistributedByAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDistributedByAsBigInteger());
        System.out.println("Company the item is mainly distributed by  AS BigInteger === " + jMetaDataGeneral.getDistributedByAsBigInteger());
    }

   /**
    * Test getDistributedByAsURL() method.
    */
    @Test
    public void subTestGetDistributedByAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getDistributedByAsURL());
        System.out.println("Company the item is mainly distributed by  AS URL === " + jMetaDataGeneral.getDistributedByAsURL());
    }

   /**
    * Test getFileModifiedDateLocalAsInteger() method.
    */
    @Test
    public void subTestGetFileModifiedDateLocalAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFileModifiedDateLocalAsInteger());
        System.out.println("The time that the file was modified on the file system (Warning: this field depends of local configuration, do not use it in an international database) AS Integer === " + jMetaDataGeneral.getFileModifiedDateLocalAsInteger());
    }

   /**
    * Test getFileModifiedDateLocalAsLong() method.
    */
    @Test
    public void subTestGetFileModifiedDateLocalAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getFileModifiedDateLocalAsLong());
        System.out.println("The time that the file was modified on the file system (Warning: this field depends of local configuration, do not use it in an international database) AS Long === " + jMetaDataGeneral.getFileModifiedDateLocalAsLong());
    }

   /**
    * Test getFileModifiedDateLocalAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFileModifiedDateLocalAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getFileModifiedDateLocalAsLocalDateTime());
        System.out.println("The time that the file was modified on the file system (Warning: this field depends of local configuration, do not use it in an international database) AS LocalDateTime === " + jMetaDataGeneral.getFileModifiedDateLocalAsLocalDateTime());
    }

   /**
    * Test getFileModifiedDateLocalAsLocalTime() method.
    */
    @Test
    public void subTestGetFileModifiedDateLocalAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getFileModifiedDateLocalAsLocalTime());
        System.out.println("The time that the file was modified on the file system (Warning: this field depends of local configuration, do not use it in an international database) AS LocalTime === " + jMetaDataGeneral.getFileModifiedDateLocalAsLocalTime());
    }

   /**
    * Test getFileModifiedDateLocalAsString() method.
    */
    @Test
    public void subTestGetFileModifiedDateLocalAsString() {
        assertEquals(null, this.jMetaDataGeneral.getFileModifiedDateLocalAsString());
        System.out.println("The time that the file was modified on the file system (Warning: this field depends of local configuration, do not use it in an international database) AS String === " + jMetaDataGeneral.getFileModifiedDateLocalAsString());
    }

   /**
    * Test getFileModifiedDateLocalAsBoolean() method.
    */
    @Test
    public void subTestGetFileModifiedDateLocalAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getFileModifiedDateLocalAsBoolean());
        System.out.println("The time that the file was modified on the file system (Warning: this field depends of local configuration, do not use it in an international database) AS Boolean === " + jMetaDataGeneral.getFileModifiedDateLocalAsBoolean());
    }

   /**
    * Test getFileModifiedDateLocalAsBigInteger() method.
    */
    @Test
    public void subTestGetFileModifiedDateLocalAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFileModifiedDateLocalAsBigInteger());
        System.out.println("The time that the file was modified on the file system (Warning: this field depends of local configuration, do not use it in an international database) AS BigInteger === " + jMetaDataGeneral.getFileModifiedDateLocalAsBigInteger());
    }

   /**
    * Test getFileModifiedDateLocalAsURL() method.
    */
    @Test
    public void subTestGetFileModifiedDateLocalAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getFileModifiedDateLocalAsURL());
        System.out.println("The time that the file was modified on the file system (Warning: this field depends of local configuration, do not use it in an international database) AS URL === " + jMetaDataGeneral.getFileModifiedDateLocalAsURL());
    }

   /**
    * Test getFrameCountAsInteger() method.
    */
    @Test
    public void subTestGetFrameCountAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFrameCountAsInteger());
        System.out.println("Frame count (a frame contains a count of samples depends of the format) AS Integer === " + jMetaDataGeneral.getFrameCountAsInteger());
    }

   /**
    * Test getFrameCountAsLong() method.
    */
    @Test
    public void subTestGetFrameCountAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getFrameCountAsLong());
        System.out.println("Frame count (a frame contains a count of samples depends of the format) AS Long === " + jMetaDataGeneral.getFrameCountAsLong());
    }

   /**
    * Test getFrameCountAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFrameCountAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getFrameCountAsLocalDateTime());
        System.out.println("Frame count (a frame contains a count of samples depends of the format) AS LocalDateTime === " + jMetaDataGeneral.getFrameCountAsLocalDateTime());
    }

   /**
    * Test getFrameCountAsLocalTime() method.
    */
    @Test
    public void subTestGetFrameCountAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getFrameCountAsLocalTime());
        System.out.println("Frame count (a frame contains a count of samples depends of the format) AS LocalTime === " + jMetaDataGeneral.getFrameCountAsLocalTime());
    }

   /**
    * Test getFrameCountAsString() method.
    */
    @Test
    public void subTestGetFrameCountAsString() {
        assertEquals(null, this.jMetaDataGeneral.getFrameCountAsString());
        System.out.println("Frame count (a frame contains a count of samples depends of the format) AS String === " + jMetaDataGeneral.getFrameCountAsString());
    }

   /**
    * Test getFrameCountAsBoolean() method.
    */
    @Test
    public void subTestGetFrameCountAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getFrameCountAsBoolean());
        System.out.println("Frame count (a frame contains a count of samples depends of the format) AS Boolean === " + jMetaDataGeneral.getFrameCountAsBoolean());
    }

   /**
    * Test getFrameCountAsBigInteger() method.
    */
    @Test
    public void subTestGetFrameCountAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFrameCountAsBigInteger());
        System.out.println("Frame count (a frame contains a count of samples depends of the format) AS BigInteger === " + jMetaDataGeneral.getFrameCountAsBigInteger());
    }

   /**
    * Test getFrameCountAsURL() method.
    */
    @Test
    public void subTestGetFrameCountAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getFrameCountAsURL());
        System.out.println("Frame count (a frame contains a count of samples depends of the format) AS URL === " + jMetaDataGeneral.getFrameCountAsURL());
    }

   /**
    * Test getEncryptionLengthAsInteger() method.
    */
    @Test
    public void subTestGetEncryptionLengthAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionLengthAsInteger());
        System.out.println("Encryption_Length AS Integer === " + jMetaDataGeneral.getEncryptionLengthAsInteger());
    }

   /**
    * Test getEncryptionLengthAsLong() method.
    */
    @Test
    public void subTestGetEncryptionLengthAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionLengthAsLong());
        System.out.println("Encryption_Length AS Long === " + jMetaDataGeneral.getEncryptionLengthAsLong());
    }

   /**
    * Test getEncryptionLengthAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncryptionLengthAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionLengthAsLocalDateTime());
        System.out.println("Encryption_Length AS LocalDateTime === " + jMetaDataGeneral.getEncryptionLengthAsLocalDateTime());
    }

   /**
    * Test getEncryptionLengthAsLocalTime() method.
    */
    @Test
    public void subTestGetEncryptionLengthAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionLengthAsLocalTime());
        System.out.println("Encryption_Length AS LocalTime === " + jMetaDataGeneral.getEncryptionLengthAsLocalTime());
    }

   /**
    * Test getEncryptionLengthAsString() method.
    */
    @Test
    public void subTestGetEncryptionLengthAsString() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionLengthAsString());
        System.out.println("Encryption_Length AS String === " + jMetaDataGeneral.getEncryptionLengthAsString());
    }

   /**
    * Test getEncryptionLengthAsBoolean() method.
    */
    @Test
    public void subTestGetEncryptionLengthAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionLengthAsBoolean());
        System.out.println("Encryption_Length AS Boolean === " + jMetaDataGeneral.getEncryptionLengthAsBoolean());
    }

   /**
    * Test getEncryptionLengthAsBigInteger() method.
    */
    @Test
    public void subTestGetEncryptionLengthAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionLengthAsBigInteger());
        System.out.println("Encryption_Length AS BigInteger === " + jMetaDataGeneral.getEncryptionLengthAsBigInteger());
    }

   /**
    * Test getEncryptionLengthAsURL() method.
    */
    @Test
    public void subTestGetEncryptionLengthAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionLengthAsURL());
        System.out.println("Encryption_Length AS URL === " + jMetaDataGeneral.getEncryptionLengthAsURL());
    }

   /**
    * Test getTitleAsInteger() method.
    */
    @Test
    public void subTestGetTitleAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getTitleAsInteger());
        System.out.println("(Generic)Title of file AS Integer === " + jMetaDataGeneral.getTitleAsInteger());
    }

   /**
    * Test getTitleAsLong() method.
    */
    @Test
    public void subTestGetTitleAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getTitleAsLong());
        System.out.println("(Generic)Title of file AS Long === " + jMetaDataGeneral.getTitleAsLong());
    }

   /**
    * Test getTitleAsLocalDateTime() method.
    */
    @Test
    public void subTestGetTitleAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getTitleAsLocalDateTime());
        System.out.println("(Generic)Title of file AS LocalDateTime === " + jMetaDataGeneral.getTitleAsLocalDateTime());
    }

   /**
    * Test getTitleAsLocalTime() method.
    */
    @Test
    public void subTestGetTitleAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getTitleAsLocalTime());
        System.out.println("(Generic)Title of file AS LocalTime === " + jMetaDataGeneral.getTitleAsLocalTime());
    }

   /**
    * Test getTitleAsString() method.
    */
    @Test
    public void subTestGetTitleAsString() {
        assertEquals(null, this.jMetaDataGeneral.getTitleAsString());
        System.out.println("(Generic)Title of file AS String === " + jMetaDataGeneral.getTitleAsString());
    }

   /**
    * Test getTitleAsBoolean() method.
    */
    @Test
    public void subTestGetTitleAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getTitleAsBoolean());
        System.out.println("(Generic)Title of file AS Boolean === " + jMetaDataGeneral.getTitleAsBoolean());
    }

   /**
    * Test getTitleAsBigInteger() method.
    */
    @Test
    public void subTestGetTitleAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getTitleAsBigInteger());
        System.out.println("(Generic)Title of file AS BigInteger === " + jMetaDataGeneral.getTitleAsBigInteger());
    }

   /**
    * Test getTitleAsURL() method.
    */
    @Test
    public void subTestGetTitleAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getTitleAsURL());
        System.out.println("(Generic)Title of file AS URL === " + jMetaDataGeneral.getTitleAsURL());
    }

   /**
    * Test getICRAAsInteger() method.
    */
    @Test
    public void subTestGetICRAAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getICRAAsInteger());
        System.out.println("The ICRA rating. (Previously RSACi) AS Integer === " + jMetaDataGeneral.getICRAAsInteger());
    }

   /**
    * Test getICRAAsLong() method.
    */
    @Test
    public void subTestGetICRAAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getICRAAsLong());
        System.out.println("The ICRA rating. (Previously RSACi) AS Long === " + jMetaDataGeneral.getICRAAsLong());
    }

   /**
    * Test getICRAAsLocalDateTime() method.
    */
    @Test
    public void subTestGetICRAAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getICRAAsLocalDateTime());
        System.out.println("The ICRA rating. (Previously RSACi) AS LocalDateTime === " + jMetaDataGeneral.getICRAAsLocalDateTime());
    }

   /**
    * Test getICRAAsLocalTime() method.
    */
    @Test
    public void subTestGetICRAAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getICRAAsLocalTime());
        System.out.println("The ICRA rating. (Previously RSACi) AS LocalTime === " + jMetaDataGeneral.getICRAAsLocalTime());
    }

   /**
    * Test getICRAAsString() method.
    */
    @Test
    public void subTestGetICRAAsString() {
        assertEquals(null, this.jMetaDataGeneral.getICRAAsString());
        System.out.println("The ICRA rating. (Previously RSACi) AS String === " + jMetaDataGeneral.getICRAAsString());
    }

   /**
    * Test getICRAAsBoolean() method.
    */
    @Test
    public void subTestGetICRAAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getICRAAsBoolean());
        System.out.println("The ICRA rating. (Previously RSACi) AS Boolean === " + jMetaDataGeneral.getICRAAsBoolean());
    }

   /**
    * Test getICRAAsBigInteger() method.
    */
    @Test
    public void subTestGetICRAAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getICRAAsBigInteger());
        System.out.println("The ICRA rating. (Previously RSACi) AS BigInteger === " + jMetaDataGeneral.getICRAAsBigInteger());
    }

   /**
    * Test getICRAAsURL() method.
    */
    @Test
    public void subTestGetICRAAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getICRAAsURL());
        System.out.println("The ICRA rating. (Previously RSACi) AS URL === " + jMetaDataGeneral.getICRAAsURL());
    }

   /**
    * Test getDelayDropFrameAsInteger() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDelayDropFrameAsInteger());
        System.out.println("Delay drop frame AS Integer === " + jMetaDataGeneral.getDelayDropFrameAsInteger());
    }

   /**
    * Test getDelayDropFrameAsLong() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getDelayDropFrameAsLong());
        System.out.println("Delay drop frame AS Long === " + jMetaDataGeneral.getDelayDropFrameAsLong());
    }

   /**
    * Test getDelayDropFrameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getDelayDropFrameAsLocalDateTime());
        System.out.println("Delay drop frame AS LocalDateTime === " + jMetaDataGeneral.getDelayDropFrameAsLocalDateTime());
    }

   /**
    * Test getDelayDropFrameAsLocalTime() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getDelayDropFrameAsLocalTime());
        System.out.println("Delay drop frame AS LocalTime === " + jMetaDataGeneral.getDelayDropFrameAsLocalTime());
    }

   /**
    * Test getDelayDropFrameAsString() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsString() {
        assertEquals(null, this.jMetaDataGeneral.getDelayDropFrameAsString());
        System.out.println("Delay drop frame AS String === " + jMetaDataGeneral.getDelayDropFrameAsString());
    }

   /**
    * Test getDelayDropFrameAsBoolean() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getDelayDropFrameAsBoolean());
        System.out.println("Delay drop frame AS Boolean === " + jMetaDataGeneral.getDelayDropFrameAsBoolean());
    }

   /**
    * Test getDelayDropFrameAsBigInteger() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDelayDropFrameAsBigInteger());
        System.out.println("Delay drop frame AS BigInteger === " + jMetaDataGeneral.getDelayDropFrameAsBigInteger());
    }

   /**
    * Test getDelayDropFrameAsURL() method.
    */
    @Test
    public void subTestGetDelayDropFrameAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getDelayDropFrameAsURL());
        System.out.println("Delay drop frame AS URL === " + jMetaDataGeneral.getDelayDropFrameAsURL());
    }

   /**
    * Test getTitleUrlAsInteger() method.
    */
    @Test
    public void subTestGetTitleUrlAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getTitleUrlAsInteger());
        System.out.println("(Generic)Url AS Integer === " + jMetaDataGeneral.getTitleUrlAsInteger());
    }

   /**
    * Test getTitleUrlAsLong() method.
    */
    @Test
    public void subTestGetTitleUrlAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getTitleUrlAsLong());
        System.out.println("(Generic)Url AS Long === " + jMetaDataGeneral.getTitleUrlAsLong());
    }

   /**
    * Test getTitleUrlAsLocalDateTime() method.
    */
    @Test
    public void subTestGetTitleUrlAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getTitleUrlAsLocalDateTime());
        System.out.println("(Generic)Url AS LocalDateTime === " + jMetaDataGeneral.getTitleUrlAsLocalDateTime());
    }

   /**
    * Test getTitleUrlAsLocalTime() method.
    */
    @Test
    public void subTestGetTitleUrlAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getTitleUrlAsLocalTime());
        System.out.println("(Generic)Url AS LocalTime === " + jMetaDataGeneral.getTitleUrlAsLocalTime());
    }

   /**
    * Test getTitleUrlAsString() method.
    */
    @Test
    public void subTestGetTitleUrlAsString() {
        assertEquals(null, this.jMetaDataGeneral.getTitleUrlAsString());
        System.out.println("(Generic)Url AS String === " + jMetaDataGeneral.getTitleUrlAsString());
    }

   /**
    * Test getTitleUrlAsBoolean() method.
    */
    @Test
    public void subTestGetTitleUrlAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getTitleUrlAsBoolean());
        System.out.println("(Generic)Url AS Boolean === " + jMetaDataGeneral.getTitleUrlAsBoolean());
    }

   /**
    * Test getTitleUrlAsBigInteger() method.
    */
    @Test
    public void subTestGetTitleUrlAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getTitleUrlAsBigInteger());
        System.out.println("(Generic)Url AS BigInteger === " + jMetaDataGeneral.getTitleUrlAsBigInteger());
    }

   /**
    * Test getTitleUrlAsURL() method.
    */
    @Test
    public void subTestGetTitleUrlAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getTitleUrlAsURL());
        System.out.println("(Generic)Url AS URL === " + jMetaDataGeneral.getTitleUrlAsURL());
    }

   /**
    * Test getComposerSortAsInteger() method.
    */
    @Test
    public void subTestGetComposerSortAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getComposerSortAsInteger());
        System.out.println("Composer/Sort AS Integer === " + jMetaDataGeneral.getComposerSortAsInteger());
    }

   /**
    * Test getComposerSortAsLong() method.
    */
    @Test
    public void subTestGetComposerSortAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getComposerSortAsLong());
        System.out.println("Composer/Sort AS Long === " + jMetaDataGeneral.getComposerSortAsLong());
    }

   /**
    * Test getComposerSortAsLocalDateTime() method.
    */
    @Test
    public void subTestGetComposerSortAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getComposerSortAsLocalDateTime());
        System.out.println("Composer/Sort AS LocalDateTime === " + jMetaDataGeneral.getComposerSortAsLocalDateTime());
    }

   /**
    * Test getComposerSortAsLocalTime() method.
    */
    @Test
    public void subTestGetComposerSortAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getComposerSortAsLocalTime());
        System.out.println("Composer/Sort AS LocalTime === " + jMetaDataGeneral.getComposerSortAsLocalTime());
    }

   /**
    * Test getComposerSortAsString() method.
    */
    @Test
    public void subTestGetComposerSortAsString() {
        assertEquals(null, this.jMetaDataGeneral.getComposerSortAsString());
        System.out.println("Composer/Sort AS String === " + jMetaDataGeneral.getComposerSortAsString());
    }

   /**
    * Test getComposerSortAsBoolean() method.
    */
    @Test
    public void subTestGetComposerSortAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getComposerSortAsBoolean());
        System.out.println("Composer/Sort AS Boolean === " + jMetaDataGeneral.getComposerSortAsBoolean());
    }

   /**
    * Test getComposerSortAsBigInteger() method.
    */
    @Test
    public void subTestGetComposerSortAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getComposerSortAsBigInteger());
        System.out.println("Composer/Sort AS BigInteger === " + jMetaDataGeneral.getComposerSortAsBigInteger());
    }

   /**
    * Test getComposerSortAsURL() method.
    */
    @Test
    public void subTestGetComposerSortAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getComposerSortAsURL());
        System.out.println("Composer/Sort AS URL === " + jMetaDataGeneral.getComposerSortAsURL());
    }

   /**
    * Test getSubjectAsInteger() method.
    */
    @Test
    public void subTestGetSubjectAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getSubjectAsInteger());
        System.out.println("Describes the topic of the file, such as Aerial view of Seattle.. AS Integer === " + jMetaDataGeneral.getSubjectAsInteger());
    }

   /**
    * Test getSubjectAsLong() method.
    */
    @Test
    public void subTestGetSubjectAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getSubjectAsLong());
        System.out.println("Describes the topic of the file, such as Aerial view of Seattle.. AS Long === " + jMetaDataGeneral.getSubjectAsLong());
    }

   /**
    * Test getSubjectAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSubjectAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getSubjectAsLocalDateTime());
        System.out.println("Describes the topic of the file, such as Aerial view of Seattle.. AS LocalDateTime === " + jMetaDataGeneral.getSubjectAsLocalDateTime());
    }

   /**
    * Test getSubjectAsLocalTime() method.
    */
    @Test
    public void subTestGetSubjectAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getSubjectAsLocalTime());
        System.out.println("Describes the topic of the file, such as Aerial view of Seattle.. AS LocalTime === " + jMetaDataGeneral.getSubjectAsLocalTime());
    }

   /**
    * Test getSubjectAsString() method.
    */
    @Test
    public void subTestGetSubjectAsString() {
        assertEquals(null, this.jMetaDataGeneral.getSubjectAsString());
        System.out.println("Describes the topic of the file, such as Aerial view of Seattle.. AS String === " + jMetaDataGeneral.getSubjectAsString());
    }

   /**
    * Test getSubjectAsBoolean() method.
    */
    @Test
    public void subTestGetSubjectAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getSubjectAsBoolean());
        System.out.println("Describes the topic of the file, such as Aerial view of Seattle.. AS Boolean === " + jMetaDataGeneral.getSubjectAsBoolean());
    }

   /**
    * Test getSubjectAsBigInteger() method.
    */
    @Test
    public void subTestGetSubjectAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getSubjectAsBigInteger());
        System.out.println("Describes the topic of the file, such as Aerial view of Seattle.. AS BigInteger === " + jMetaDataGeneral.getSubjectAsBigInteger());
    }

   /**
    * Test getSubjectAsURL() method.
    */
    @Test
    public void subTestGetSubjectAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getSubjectAsURL());
        System.out.println("Describes the topic of the file, such as Aerial view of Seattle.. AS URL === " + jMetaDataGeneral.getSubjectAsURL());
    }

   /**
    * Test getMovieMoreAsInteger() method.
    */
    @Test
    public void subTestGetMovieMoreAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getMovieMoreAsInteger());
        System.out.println("More infos about the movie AS Integer === " + jMetaDataGeneral.getMovieMoreAsInteger());
    }

   /**
    * Test getMovieMoreAsLong() method.
    */
    @Test
    public void subTestGetMovieMoreAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getMovieMoreAsLong());
        System.out.println("More infos about the movie AS Long === " + jMetaDataGeneral.getMovieMoreAsLong());
    }

   /**
    * Test getMovieMoreAsLocalDateTime() method.
    */
    @Test
    public void subTestGetMovieMoreAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getMovieMoreAsLocalDateTime());
        System.out.println("More infos about the movie AS LocalDateTime === " + jMetaDataGeneral.getMovieMoreAsLocalDateTime());
    }

   /**
    * Test getMovieMoreAsLocalTime() method.
    */
    @Test
    public void subTestGetMovieMoreAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getMovieMoreAsLocalTime());
        System.out.println("More infos about the movie AS LocalTime === " + jMetaDataGeneral.getMovieMoreAsLocalTime());
    }

   /**
    * Test getMovieMoreAsString() method.
    */
    @Test
    public void subTestGetMovieMoreAsString() {
        assertEquals(null, this.jMetaDataGeneral.getMovieMoreAsString());
        System.out.println("More infos about the movie AS String === " + jMetaDataGeneral.getMovieMoreAsString());
    }

   /**
    * Test getMovieMoreAsBoolean() method.
    */
    @Test
    public void subTestGetMovieMoreAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getMovieMoreAsBoolean());
        System.out.println("More infos about the movie AS Boolean === " + jMetaDataGeneral.getMovieMoreAsBoolean());
    }

   /**
    * Test getMovieMoreAsBigInteger() method.
    */
    @Test
    public void subTestGetMovieMoreAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getMovieMoreAsBigInteger());
        System.out.println("More infos about the movie AS BigInteger === " + jMetaDataGeneral.getMovieMoreAsBigInteger());
    }

   /**
    * Test getMovieMoreAsURL() method.
    */
    @Test
    public void subTestGetMovieMoreAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getMovieMoreAsURL());
        System.out.println("More infos about the movie AS URL === " + jMetaDataGeneral.getMovieMoreAsURL());
    }

   /**
    * Test getOverallBitRateModeAsInteger() method.
    */
    @Test
    public void subTestGetOverallBitRateModeAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateModeAsInteger());
        System.out.println("Bit rate mode of all streams (VBR, CBR) AS Integer === " + jMetaDataGeneral.getOverallBitRateModeAsInteger());
    }

   /**
    * Test getOverallBitRateModeAsLong() method.
    */
    @Test
    public void subTestGetOverallBitRateModeAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateModeAsLong());
        System.out.println("Bit rate mode of all streams (VBR, CBR) AS Long === " + jMetaDataGeneral.getOverallBitRateModeAsLong());
    }

   /**
    * Test getOverallBitRateModeAsLocalDateTime() method.
    */
    @Test
    public void subTestGetOverallBitRateModeAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateModeAsLocalDateTime());
        System.out.println("Bit rate mode of all streams (VBR, CBR) AS LocalDateTime === " + jMetaDataGeneral.getOverallBitRateModeAsLocalDateTime());
    }

   /**
    * Test getOverallBitRateModeAsLocalTime() method.
    */
    @Test
    public void subTestGetOverallBitRateModeAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateModeAsLocalTime());
        System.out.println("Bit rate mode of all streams (VBR, CBR) AS LocalTime === " + jMetaDataGeneral.getOverallBitRateModeAsLocalTime());
    }

   /**
    * Test getOverallBitRateModeAsString() method.
    */
    @Test
    public void subTestGetOverallBitRateModeAsString() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateModeAsString());
        System.out.println("Bit rate mode of all streams (VBR, CBR) AS String === " + jMetaDataGeneral.getOverallBitRateModeAsString());
    }

   /**
    * Test getOverallBitRateModeAsBoolean() method.
    */
    @Test
    public void subTestGetOverallBitRateModeAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateModeAsBoolean());
        System.out.println("Bit rate mode of all streams (VBR, CBR) AS Boolean === " + jMetaDataGeneral.getOverallBitRateModeAsBoolean());
    }

   /**
    * Test getOverallBitRateModeAsBigInteger() method.
    */
    @Test
    public void subTestGetOverallBitRateModeAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateModeAsBigInteger());
        System.out.println("Bit rate mode of all streams (VBR, CBR) AS BigInteger === " + jMetaDataGeneral.getOverallBitRateModeAsBigInteger());
    }

   /**
    * Test getOverallBitRateModeAsURL() method.
    */
    @Test
    public void subTestGetOverallBitRateModeAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateModeAsURL());
        System.out.println("Bit rate mode of all streams (VBR, CBR) AS URL === " + jMetaDataGeneral.getOverallBitRateModeAsURL());
    }

   /**
    * Test getScreenplayByAsInteger() method.
    */
    @Test
    public void subTestGetScreenplayByAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getScreenplayByAsInteger());
        System.out.println("The author of the screenplay or scenario (used for movies and TV shows). AS Integer === " + jMetaDataGeneral.getScreenplayByAsInteger());
    }

   /**
    * Test getScreenplayByAsLong() method.
    */
    @Test
    public void subTestGetScreenplayByAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getScreenplayByAsLong());
        System.out.println("The author of the screenplay or scenario (used for movies and TV shows). AS Long === " + jMetaDataGeneral.getScreenplayByAsLong());
    }

   /**
    * Test getScreenplayByAsLocalDateTime() method.
    */
    @Test
    public void subTestGetScreenplayByAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getScreenplayByAsLocalDateTime());
        System.out.println("The author of the screenplay or scenario (used for movies and TV shows). AS LocalDateTime === " + jMetaDataGeneral.getScreenplayByAsLocalDateTime());
    }

   /**
    * Test getScreenplayByAsLocalTime() method.
    */
    @Test
    public void subTestGetScreenplayByAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getScreenplayByAsLocalTime());
        System.out.println("The author of the screenplay or scenario (used for movies and TV shows). AS LocalTime === " + jMetaDataGeneral.getScreenplayByAsLocalTime());
    }

   /**
    * Test getScreenplayByAsString() method.
    */
    @Test
    public void subTestGetScreenplayByAsString() {
        assertEquals(null, this.jMetaDataGeneral.getScreenplayByAsString());
        System.out.println("The author of the screenplay or scenario (used for movies and TV shows). AS String === " + jMetaDataGeneral.getScreenplayByAsString());
    }

   /**
    * Test getScreenplayByAsBoolean() method.
    */
    @Test
    public void subTestGetScreenplayByAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getScreenplayByAsBoolean());
        System.out.println("The author of the screenplay or scenario (used for movies and TV shows). AS Boolean === " + jMetaDataGeneral.getScreenplayByAsBoolean());
    }

   /**
    * Test getScreenplayByAsBigInteger() method.
    */
    @Test
    public void subTestGetScreenplayByAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getScreenplayByAsBigInteger());
        System.out.println("The author of the screenplay or scenario (used for movies and TV shows). AS BigInteger === " + jMetaDataGeneral.getScreenplayByAsBigInteger());
    }

   /**
    * Test getScreenplayByAsURL() method.
    */
    @Test
    public void subTestGetScreenplayByAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getScreenplayByAsURL());
        System.out.println("The author of the screenplay or scenario (used for movies and TV shows). AS URL === " + jMetaDataGeneral.getScreenplayByAsURL());
    }

   /**
    * Test getExecutiveProducerAsInteger() method.
    */
    @Test
    public void subTestGetExecutiveProducerAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getExecutiveProducerAsInteger());
        System.out.println("The name of an executive producer. AS Integer === " + jMetaDataGeneral.getExecutiveProducerAsInteger());
    }

   /**
    * Test getExecutiveProducerAsLong() method.
    */
    @Test
    public void subTestGetExecutiveProducerAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getExecutiveProducerAsLong());
        System.out.println("The name of an executive producer. AS Long === " + jMetaDataGeneral.getExecutiveProducerAsLong());
    }

   /**
    * Test getExecutiveProducerAsLocalDateTime() method.
    */
    @Test
    public void subTestGetExecutiveProducerAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getExecutiveProducerAsLocalDateTime());
        System.out.println("The name of an executive producer. AS LocalDateTime === " + jMetaDataGeneral.getExecutiveProducerAsLocalDateTime());
    }

   /**
    * Test getExecutiveProducerAsLocalTime() method.
    */
    @Test
    public void subTestGetExecutiveProducerAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getExecutiveProducerAsLocalTime());
        System.out.println("The name of an executive producer. AS LocalTime === " + jMetaDataGeneral.getExecutiveProducerAsLocalTime());
    }

   /**
    * Test getExecutiveProducerAsString() method.
    */
    @Test
    public void subTestGetExecutiveProducerAsString() {
        assertEquals(null, this.jMetaDataGeneral.getExecutiveProducerAsString());
        System.out.println("The name of an executive producer. AS String === " + jMetaDataGeneral.getExecutiveProducerAsString());
    }

   /**
    * Test getExecutiveProducerAsBoolean() method.
    */
    @Test
    public void subTestGetExecutiveProducerAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getExecutiveProducerAsBoolean());
        System.out.println("The name of an executive producer. AS Boolean === " + jMetaDataGeneral.getExecutiveProducerAsBoolean());
    }

   /**
    * Test getExecutiveProducerAsBigInteger() method.
    */
    @Test
    public void subTestGetExecutiveProducerAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getExecutiveProducerAsBigInteger());
        System.out.println("The name of an executive producer. AS BigInteger === " + jMetaDataGeneral.getExecutiveProducerAsBigInteger());
    }

   /**
    * Test getExecutiveProducerAsURL() method.
    */
    @Test
    public void subTestGetExecutiveProducerAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getExecutiveProducerAsURL());
        System.out.println("The name of an executive producer. AS URL === " + jMetaDataGeneral.getExecutiveProducerAsURL());
    }

   /**
    * Test getISRCAsInteger() method.
    */
    @Test
    public void subTestGetISRCAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getISRCAsInteger());
        System.out.println("International Standard Recording Code, excluding the ISRC prefix and including hyphens. AS Integer === " + jMetaDataGeneral.getISRCAsInteger());
    }

   /**
    * Test getISRCAsLong() method.
    */
    @Test
    public void subTestGetISRCAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getISRCAsLong());
        System.out.println("International Standard Recording Code, excluding the ISRC prefix and including hyphens. AS Long === " + jMetaDataGeneral.getISRCAsLong());
    }

   /**
    * Test getISRCAsLocalDateTime() method.
    */
    @Test
    public void subTestGetISRCAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getISRCAsLocalDateTime());
        System.out.println("International Standard Recording Code, excluding the ISRC prefix and including hyphens. AS LocalDateTime === " + jMetaDataGeneral.getISRCAsLocalDateTime());
    }

   /**
    * Test getISRCAsLocalTime() method.
    */
    @Test
    public void subTestGetISRCAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getISRCAsLocalTime());
        System.out.println("International Standard Recording Code, excluding the ISRC prefix and including hyphens. AS LocalTime === " + jMetaDataGeneral.getISRCAsLocalTime());
    }

   /**
    * Test getISRCAsString() method.
    */
    @Test
    public void subTestGetISRCAsString() {
        assertEquals(null, this.jMetaDataGeneral.getISRCAsString());
        System.out.println("International Standard Recording Code, excluding the ISRC prefix and including hyphens. AS String === " + jMetaDataGeneral.getISRCAsString());
    }

   /**
    * Test getISRCAsBoolean() method.
    */
    @Test
    public void subTestGetISRCAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getISRCAsBoolean());
        System.out.println("International Standard Recording Code, excluding the ISRC prefix and including hyphens. AS Boolean === " + jMetaDataGeneral.getISRCAsBoolean());
    }

   /**
    * Test getISRCAsBigInteger() method.
    */
    @Test
    public void subTestGetISRCAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getISRCAsBigInteger());
        System.out.println("International Standard Recording Code, excluding the ISRC prefix and including hyphens. AS BigInteger === " + jMetaDataGeneral.getISRCAsBigInteger());
    }

   /**
    * Test getISRCAsURL() method.
    */
    @Test
    public void subTestGetISRCAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getISRCAsURL());
        System.out.println("International Standard Recording Code, excluding the ISRC prefix and including hyphens. AS URL === " + jMetaDataGeneral.getISRCAsURL());
    }

   /**
    * Test getStreamSizeProportionAsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeProportionAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeProportionAsInteger());
        System.out.println("Stream size divided by file size AS Integer === " + jMetaDataGeneral.getStreamSizeProportionAsInteger());
    }

   /**
    * Test getStreamSizeProportionAsLong() method.
    */
    @Test
    public void subTestGetStreamSizeProportionAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeProportionAsLong());
        System.out.println("Stream size divided by file size AS Long === " + jMetaDataGeneral.getStreamSizeProportionAsLong());
    }

   /**
    * Test getStreamSizeProportionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeProportionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeProportionAsLocalDateTime());
        System.out.println("Stream size divided by file size AS LocalDateTime === " + jMetaDataGeneral.getStreamSizeProportionAsLocalDateTime());
    }

   /**
    * Test getStreamSizeProportionAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeProportionAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeProportionAsLocalTime());
        System.out.println("Stream size divided by file size AS LocalTime === " + jMetaDataGeneral.getStreamSizeProportionAsLocalTime());
    }

   /**
    * Test getStreamSizeProportionAsString() method.
    */
    @Test
    public void subTestGetStreamSizeProportionAsString() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeProportionAsString());
        System.out.println("Stream size divided by file size AS String === " + jMetaDataGeneral.getStreamSizeProportionAsString());
    }

   /**
    * Test getStreamSizeProportionAsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeProportionAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeProportionAsBoolean());
        System.out.println("Stream size divided by file size AS Boolean === " + jMetaDataGeneral.getStreamSizeProportionAsBoolean());
    }

   /**
    * Test getStreamSizeProportionAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeProportionAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeProportionAsBigInteger());
        System.out.println("Stream size divided by file size AS BigInteger === " + jMetaDataGeneral.getStreamSizeProportionAsBigInteger());
    }

   /**
    * Test getStreamSizeProportionAsURL() method.
    */
    @Test
    public void subTestGetStreamSizeProportionAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeProportionAsURL());
        System.out.println("Stream size divided by file size AS URL === " + jMetaDataGeneral.getStreamSizeProportionAsURL());
    }

   /**
    * Test getHeaderSizeAsInteger() method.
    */
    @Test
    public void subTestGetHeaderSizeAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getHeaderSizeAsInteger());
        System.out.println("HeaderSize AS Integer === " + jMetaDataGeneral.getHeaderSizeAsInteger());
    }

   /**
    * Test getHeaderSizeAsLong() method.
    */
    @Test
    public void subTestGetHeaderSizeAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getHeaderSizeAsLong());
        System.out.println("HeaderSize AS Long === " + jMetaDataGeneral.getHeaderSizeAsLong());
    }

   /**
    * Test getHeaderSizeAsLocalDateTime() method.
    */
    @Test
    public void subTestGetHeaderSizeAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getHeaderSizeAsLocalDateTime());
        System.out.println("HeaderSize AS LocalDateTime === " + jMetaDataGeneral.getHeaderSizeAsLocalDateTime());
    }

   /**
    * Test getHeaderSizeAsLocalTime() method.
    */
    @Test
    public void subTestGetHeaderSizeAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getHeaderSizeAsLocalTime());
        System.out.println("HeaderSize AS LocalTime === " + jMetaDataGeneral.getHeaderSizeAsLocalTime());
    }

   /**
    * Test getHeaderSizeAsString() method.
    */
    @Test
    public void subTestGetHeaderSizeAsString() {
        assertEquals(null, this.jMetaDataGeneral.getHeaderSizeAsString());
        System.out.println("HeaderSize AS String === " + jMetaDataGeneral.getHeaderSizeAsString());
    }

   /**
    * Test getHeaderSizeAsBoolean() method.
    */
    @Test
    public void subTestGetHeaderSizeAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getHeaderSizeAsBoolean());
        System.out.println("HeaderSize AS Boolean === " + jMetaDataGeneral.getHeaderSizeAsBoolean());
    }

   /**
    * Test getHeaderSizeAsBigInteger() method.
    */
    @Test
    public void subTestGetHeaderSizeAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getHeaderSizeAsBigInteger());
        System.out.println("HeaderSize AS BigInteger === " + jMetaDataGeneral.getHeaderSizeAsBigInteger());
    }

   /**
    * Test getHeaderSizeAsURL() method.
    */
    @Test
    public void subTestGetHeaderSizeAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getHeaderSizeAsURL());
        System.out.println("HeaderSize AS URL === " + jMetaDataGeneral.getHeaderSizeAsURL());
    }

   /**
    * Test getEncodedLibrarySettingsAsInteger() method.
    */
    @Test
    public void subTestGetEncodedLibrarySettingsAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibrarySettingsAsInteger());
        System.out.println("Parameters used by the software AS Integer === " + jMetaDataGeneral.getEncodedLibrarySettingsAsInteger());
    }

   /**
    * Test getEncodedLibrarySettingsAsLong() method.
    */
    @Test
    public void subTestGetEncodedLibrarySettingsAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibrarySettingsAsLong());
        System.out.println("Parameters used by the software AS Long === " + jMetaDataGeneral.getEncodedLibrarySettingsAsLong());
    }

   /**
    * Test getEncodedLibrarySettingsAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedLibrarySettingsAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibrarySettingsAsLocalDateTime());
        System.out.println("Parameters used by the software AS LocalDateTime === " + jMetaDataGeneral.getEncodedLibrarySettingsAsLocalDateTime());
    }

   /**
    * Test getEncodedLibrarySettingsAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedLibrarySettingsAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibrarySettingsAsLocalTime());
        System.out.println("Parameters used by the software AS LocalTime === " + jMetaDataGeneral.getEncodedLibrarySettingsAsLocalTime());
    }

   /**
    * Test getEncodedLibrarySettingsAsString() method.
    */
    @Test
    public void subTestGetEncodedLibrarySettingsAsString() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibrarySettingsAsString());
        System.out.println("Parameters used by the software AS String === " + jMetaDataGeneral.getEncodedLibrarySettingsAsString());
    }

   /**
    * Test getEncodedLibrarySettingsAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedLibrarySettingsAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibrarySettingsAsBoolean());
        System.out.println("Parameters used by the software AS Boolean === " + jMetaDataGeneral.getEncodedLibrarySettingsAsBoolean());
    }

   /**
    * Test getEncodedLibrarySettingsAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedLibrarySettingsAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibrarySettingsAsBigInteger());
        System.out.println("Parameters used by the software AS BigInteger === " + jMetaDataGeneral.getEncodedLibrarySettingsAsBigInteger());
    }

   /**
    * Test getEncodedLibrarySettingsAsURL() method.
    */
    @Test
    public void subTestGetEncodedLibrarySettingsAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibrarySettingsAsURL());
        System.out.println("Parameters used by the software AS URL === " + jMetaDataGeneral.getEncodedLibrarySettingsAsURL());
    }

   /**
    * Test getContentTypeAsInteger() method.
    */
    @Test
    public void subTestGetContentTypeAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getContentTypeAsInteger());
        System.out.println("The type of the item. e.g. Documentary, Feature Film, Cartoon, Music Video, Music, Sound FX, etc. AS Integer === " + jMetaDataGeneral.getContentTypeAsInteger());
    }

   /**
    * Test getContentTypeAsLong() method.
    */
    @Test
    public void subTestGetContentTypeAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getContentTypeAsLong());
        System.out.println("The type of the item. e.g. Documentary, Feature Film, Cartoon, Music Video, Music, Sound FX, etc. AS Long === " + jMetaDataGeneral.getContentTypeAsLong());
    }

   /**
    * Test getContentTypeAsLocalDateTime() method.
    */
    @Test
    public void subTestGetContentTypeAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getContentTypeAsLocalDateTime());
        System.out.println("The type of the item. e.g. Documentary, Feature Film, Cartoon, Music Video, Music, Sound FX, etc. AS LocalDateTime === " + jMetaDataGeneral.getContentTypeAsLocalDateTime());
    }

   /**
    * Test getContentTypeAsLocalTime() method.
    */
    @Test
    public void subTestGetContentTypeAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getContentTypeAsLocalTime());
        System.out.println("The type of the item. e.g. Documentary, Feature Film, Cartoon, Music Video, Music, Sound FX, etc. AS LocalTime === " + jMetaDataGeneral.getContentTypeAsLocalTime());
    }

   /**
    * Test getContentTypeAsString() method.
    */
    @Test
    public void subTestGetContentTypeAsString() {
        assertEquals(null, this.jMetaDataGeneral.getContentTypeAsString());
        System.out.println("The type of the item. e.g. Documentary, Feature Film, Cartoon, Music Video, Music, Sound FX, etc. AS String === " + jMetaDataGeneral.getContentTypeAsString());
    }

   /**
    * Test getContentTypeAsBoolean() method.
    */
    @Test
    public void subTestGetContentTypeAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getContentTypeAsBoolean());
        System.out.println("The type of the item. e.g. Documentary, Feature Film, Cartoon, Music Video, Music, Sound FX, etc. AS Boolean === " + jMetaDataGeneral.getContentTypeAsBoolean());
    }

   /**
    * Test getContentTypeAsBigInteger() method.
    */
    @Test
    public void subTestGetContentTypeAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getContentTypeAsBigInteger());
        System.out.println("The type of the item. e.g. Documentary, Feature Film, Cartoon, Music Video, Music, Sound FX, etc. AS BigInteger === " + jMetaDataGeneral.getContentTypeAsBigInteger());
    }

   /**
    * Test getContentTypeAsURL() method.
    */
    @Test
    public void subTestGetContentTypeAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getContentTypeAsURL());
        System.out.println("The type of the item. e.g. Documentary, Feature Film, Cartoon, Music Video, Music, Sound FX, etc. AS URL === " + jMetaDataGeneral.getContentTypeAsURL());
    }

   /**
    * Test getCoverDescriptionAsInteger() method.
    */
    @Test
    public void subTestGetCoverDescriptionAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCoverDescriptionAsInteger());
        System.out.println("short descriptio, e.g. Earth in space AS Integer === " + jMetaDataGeneral.getCoverDescriptionAsInteger());
    }

   /**
    * Test getCoverDescriptionAsLong() method.
    */
    @Test
    public void subTestGetCoverDescriptionAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getCoverDescriptionAsLong());
        System.out.println("short descriptio, e.g. Earth in space AS Long === " + jMetaDataGeneral.getCoverDescriptionAsLong());
    }

   /**
    * Test getCoverDescriptionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCoverDescriptionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getCoverDescriptionAsLocalDateTime());
        System.out.println("short descriptio, e.g. Earth in space AS LocalDateTime === " + jMetaDataGeneral.getCoverDescriptionAsLocalDateTime());
    }

   /**
    * Test getCoverDescriptionAsLocalTime() method.
    */
    @Test
    public void subTestGetCoverDescriptionAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getCoverDescriptionAsLocalTime());
        System.out.println("short descriptio, e.g. Earth in space AS LocalTime === " + jMetaDataGeneral.getCoverDescriptionAsLocalTime());
    }

   /**
    * Test getCoverDescriptionAsString() method.
    */
    @Test
    public void subTestGetCoverDescriptionAsString() {
        assertEquals(null, this.jMetaDataGeneral.getCoverDescriptionAsString());
        System.out.println("short descriptio, e.g. Earth in space AS String === " + jMetaDataGeneral.getCoverDescriptionAsString());
    }

   /**
    * Test getCoverDescriptionAsBoolean() method.
    */
    @Test
    public void subTestGetCoverDescriptionAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getCoverDescriptionAsBoolean());
        System.out.println("short descriptio, e.g. Earth in space AS Boolean === " + jMetaDataGeneral.getCoverDescriptionAsBoolean());
    }

   /**
    * Test getCoverDescriptionAsBigInteger() method.
    */
    @Test
    public void subTestGetCoverDescriptionAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCoverDescriptionAsBigInteger());
        System.out.println("short descriptio, e.g. Earth in space AS BigInteger === " + jMetaDataGeneral.getCoverDescriptionAsBigInteger());
    }

   /**
    * Test getCoverDescriptionAsURL() method.
    */
    @Test
    public void subTestGetCoverDescriptionAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getCoverDescriptionAsURL());
        System.out.println("short descriptio, e.g. Earth in space AS URL === " + jMetaDataGeneral.getCoverDescriptionAsURL());
    }

   /**
    * Test getCountAsInteger() method.
    */
    @Test
    public void subTestGetCountAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCountAsInteger());
        System.out.println("Count of objects available in this stream AS Integer === " + jMetaDataGeneral.getCountAsInteger());
    }

   /**
    * Test getCountAsLong() method.
    */
    @Test
    public void subTestGetCountAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getCountAsLong());
        System.out.println("Count of objects available in this stream AS Long === " + jMetaDataGeneral.getCountAsLong());
    }

   /**
    * Test getCountAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCountAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getCountAsLocalDateTime());
        System.out.println("Count of objects available in this stream AS LocalDateTime === " + jMetaDataGeneral.getCountAsLocalDateTime());
    }

   /**
    * Test getCountAsLocalTime() method.
    */
    @Test
    public void subTestGetCountAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getCountAsLocalTime());
        System.out.println("Count of objects available in this stream AS LocalTime === " + jMetaDataGeneral.getCountAsLocalTime());
    }

   /**
    * Test getCountAsString() method.
    */
    @Test
    public void subTestGetCountAsString() {
        assertEquals(null, this.jMetaDataGeneral.getCountAsString());
        System.out.println("Count of objects available in this stream AS String === " + jMetaDataGeneral.getCountAsString());
    }

   /**
    * Test getCountAsBoolean() method.
    */
    @Test
    public void subTestGetCountAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getCountAsBoolean());
        System.out.println("Count of objects available in this stream AS Boolean === " + jMetaDataGeneral.getCountAsBoolean());
    }

   /**
    * Test getCountAsBigInteger() method.
    */
    @Test
    public void subTestGetCountAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCountAsBigInteger());
        System.out.println("Count of objects available in this stream AS BigInteger === " + jMetaDataGeneral.getCountAsBigInteger());
    }

   /**
    * Test getCountAsURL() method.
    */
    @Test
    public void subTestGetCountAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getCountAsURL());
        System.out.println("Count of objects available in this stream AS URL === " + jMetaDataGeneral.getCountAsURL());
    }

   /**
    * Test getEncryptionAsInteger() method.
    */
    @Test
    public void subTestGetEncryptionAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionAsInteger());
        System.out.println("Encryption AS Integer === " + jMetaDataGeneral.getEncryptionAsInteger());
    }

   /**
    * Test getEncryptionAsLong() method.
    */
    @Test
    public void subTestGetEncryptionAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionAsLong());
        System.out.println("Encryption AS Long === " + jMetaDataGeneral.getEncryptionAsLong());
    }

   /**
    * Test getEncryptionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncryptionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionAsLocalDateTime());
        System.out.println("Encryption AS LocalDateTime === " + jMetaDataGeneral.getEncryptionAsLocalDateTime());
    }

   /**
    * Test getEncryptionAsLocalTime() method.
    */
    @Test
    public void subTestGetEncryptionAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionAsLocalTime());
        System.out.println("Encryption AS LocalTime === " + jMetaDataGeneral.getEncryptionAsLocalTime());
    }

   /**
    * Test getEncryptionAsString() method.
    */
    @Test
    public void subTestGetEncryptionAsString() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionAsString());
        System.out.println("Encryption AS String === " + jMetaDataGeneral.getEncryptionAsString());
    }

   /**
    * Test getEncryptionAsBoolean() method.
    */
    @Test
    public void subTestGetEncryptionAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionAsBoolean());
        System.out.println("Encryption AS Boolean === " + jMetaDataGeneral.getEncryptionAsBoolean());
    }

   /**
    * Test getEncryptionAsBigInteger() method.
    */
    @Test
    public void subTestGetEncryptionAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionAsBigInteger());
        System.out.println("Encryption AS BigInteger === " + jMetaDataGeneral.getEncryptionAsBigInteger());
    }

   /**
    * Test getEncryptionAsURL() method.
    */
    @Test
    public void subTestGetEncryptionAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionAsURL());
        System.out.println("Encryption AS URL === " + jMetaDataGeneral.getEncryptionAsURL());
    }

   /**
    * Test getFrameRateNumAsInteger() method.
    */
    @Test
    public void subTestGetFrameRateNumAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFrameRateNumAsInteger());
        System.out.println("Frames per second, numerator AS Integer === " + jMetaDataGeneral.getFrameRateNumAsInteger());
    }

   /**
    * Test getFrameRateNumAsLong() method.
    */
    @Test
    public void subTestGetFrameRateNumAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getFrameRateNumAsLong());
        System.out.println("Frames per second, numerator AS Long === " + jMetaDataGeneral.getFrameRateNumAsLong());
    }

   /**
    * Test getFrameRateNumAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFrameRateNumAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getFrameRateNumAsLocalDateTime());
        System.out.println("Frames per second, numerator AS LocalDateTime === " + jMetaDataGeneral.getFrameRateNumAsLocalDateTime());
    }

   /**
    * Test getFrameRateNumAsLocalTime() method.
    */
    @Test
    public void subTestGetFrameRateNumAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getFrameRateNumAsLocalTime());
        System.out.println("Frames per second, numerator AS LocalTime === " + jMetaDataGeneral.getFrameRateNumAsLocalTime());
    }

   /**
    * Test getFrameRateNumAsString() method.
    */
    @Test
    public void subTestGetFrameRateNumAsString() {
        assertEquals(null, this.jMetaDataGeneral.getFrameRateNumAsString());
        System.out.println("Frames per second, numerator AS String === " + jMetaDataGeneral.getFrameRateNumAsString());
    }

   /**
    * Test getFrameRateNumAsBoolean() method.
    */
    @Test
    public void subTestGetFrameRateNumAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getFrameRateNumAsBoolean());
        System.out.println("Frames per second, numerator AS Boolean === " + jMetaDataGeneral.getFrameRateNumAsBoolean());
    }

   /**
    * Test getFrameRateNumAsBigInteger() method.
    */
    @Test
    public void subTestGetFrameRateNumAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFrameRateNumAsBigInteger());
        System.out.println("Frames per second, numerator AS BigInteger === " + jMetaDataGeneral.getFrameRateNumAsBigInteger());
    }

   /**
    * Test getFrameRateNumAsURL() method.
    */
    @Test
    public void subTestGetFrameRateNumAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getFrameRateNumAsURL());
        System.out.println("Frames per second, numerator AS URL === " + jMetaDataGeneral.getFrameRateNumAsURL());
    }

   /**
    * Test getFormatVersionAsInteger() method.
    */
    @Test
    public void subTestGetFormatVersionAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFormatVersionAsInteger());
        System.out.println("Version of this format AS Integer === " + jMetaDataGeneral.getFormatVersionAsInteger());
    }

   /**
    * Test getFormatVersionAsLong() method.
    */
    @Test
    public void subTestGetFormatVersionAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getFormatVersionAsLong());
        System.out.println("Version of this format AS Long === " + jMetaDataGeneral.getFormatVersionAsLong());
    }

   /**
    * Test getFormatVersionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatVersionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getFormatVersionAsLocalDateTime());
        System.out.println("Version of this format AS LocalDateTime === " + jMetaDataGeneral.getFormatVersionAsLocalDateTime());
    }

   /**
    * Test getFormatVersionAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatVersionAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getFormatVersionAsLocalTime());
        System.out.println("Version of this format AS LocalTime === " + jMetaDataGeneral.getFormatVersionAsLocalTime());
    }

   /**
    * Test getFormatVersionAsString() method.
    */
    @Test
    public void subTestGetFormatVersionAsString() {
        assertEquals(null, this.jMetaDataGeneral.getFormatVersionAsString());
        System.out.println("Version of this format AS String === " + jMetaDataGeneral.getFormatVersionAsString());
    }

   /**
    * Test getFormatVersionAsBoolean() method.
    */
    @Test
    public void subTestGetFormatVersionAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getFormatVersionAsBoolean());
        System.out.println("Version of this format AS Boolean === " + jMetaDataGeneral.getFormatVersionAsBoolean());
    }

   /**
    * Test getFormatVersionAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatVersionAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFormatVersionAsBigInteger());
        System.out.println("Version of this format AS BigInteger === " + jMetaDataGeneral.getFormatVersionAsBigInteger());
    }

   /**
    * Test getFormatVersionAsURL() method.
    */
    @Test
    public void subTestGetFormatVersionAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getFormatVersionAsURL());
        System.out.println("Version of this format AS URL === " + jMetaDataGeneral.getFormatVersionAsURL());
    }

   /**
    * Test getStreamKindPosAsInteger() method.
    */
    @Test
    public void subTestGetStreamKindPosAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getStreamKindPosAsInteger());
        System.out.println("When multiple streams, number of the stream (base=1) AS Integer === " + jMetaDataGeneral.getStreamKindPosAsInteger());
    }

   /**
    * Test getStreamKindPosAsLong() method.
    */
    @Test
    public void subTestGetStreamKindPosAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getStreamKindPosAsLong());
        System.out.println("When multiple streams, number of the stream (base=1) AS Long === " + jMetaDataGeneral.getStreamKindPosAsLong());
    }

   /**
    * Test getStreamKindPosAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamKindPosAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getStreamKindPosAsLocalDateTime());
        System.out.println("When multiple streams, number of the stream (base=1) AS LocalDateTime === " + jMetaDataGeneral.getStreamKindPosAsLocalDateTime());
    }

   /**
    * Test getStreamKindPosAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamKindPosAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getStreamKindPosAsLocalTime());
        System.out.println("When multiple streams, number of the stream (base=1) AS LocalTime === " + jMetaDataGeneral.getStreamKindPosAsLocalTime());
    }

   /**
    * Test getStreamKindPosAsString() method.
    */
    @Test
    public void subTestGetStreamKindPosAsString() {
        assertEquals(null, this.jMetaDataGeneral.getStreamKindPosAsString());
        System.out.println("When multiple streams, number of the stream (base=1) AS String === " + jMetaDataGeneral.getStreamKindPosAsString());
    }

   /**
    * Test getStreamKindPosAsBoolean() method.
    */
    @Test
    public void subTestGetStreamKindPosAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getStreamKindPosAsBoolean());
        System.out.println("When multiple streams, number of the stream (base=1) AS Boolean === " + jMetaDataGeneral.getStreamKindPosAsBoolean());
    }

   /**
    * Test getStreamKindPosAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamKindPosAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getStreamKindPosAsBigInteger());
        System.out.println("When multiple streams, number of the stream (base=1) AS BigInteger === " + jMetaDataGeneral.getStreamKindPosAsBigInteger());
    }

   /**
    * Test getStreamKindPosAsURL() method.
    */
    @Test
    public void subTestGetStreamKindPosAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getStreamKindPosAsURL());
        System.out.println("When multiple streams, number of the stream (base=1) AS URL === " + jMetaDataGeneral.getStreamKindPosAsURL());
    }

   /**
    * Test getOriginalSourceMediumIDAsInteger() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceMediumIDAsInteger());
        System.out.println("The ID for this stream in the original medium of the material AS Integer === " + jMetaDataGeneral.getOriginalSourceMediumIDAsInteger());
    }

   /**
    * Test getOriginalSourceMediumIDAsLong() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceMediumIDAsLong());
        System.out.println("The ID for this stream in the original medium of the material AS Long === " + jMetaDataGeneral.getOriginalSourceMediumIDAsLong());
    }

   /**
    * Test getOriginalSourceMediumIDAsLocalDateTime() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceMediumIDAsLocalDateTime());
        System.out.println("The ID for this stream in the original medium of the material AS LocalDateTime === " + jMetaDataGeneral.getOriginalSourceMediumIDAsLocalDateTime());
    }

   /**
    * Test getOriginalSourceMediumIDAsLocalTime() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceMediumIDAsLocalTime());
        System.out.println("The ID for this stream in the original medium of the material AS LocalTime === " + jMetaDataGeneral.getOriginalSourceMediumIDAsLocalTime());
    }

   /**
    * Test getOriginalSourceMediumIDAsString() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsString() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceMediumIDAsString());
        System.out.println("The ID for this stream in the original medium of the material AS String === " + jMetaDataGeneral.getOriginalSourceMediumIDAsString());
    }

   /**
    * Test getOriginalSourceMediumIDAsBoolean() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceMediumIDAsBoolean());
        System.out.println("The ID for this stream in the original medium of the material AS Boolean === " + jMetaDataGeneral.getOriginalSourceMediumIDAsBoolean());
    }

   /**
    * Test getOriginalSourceMediumIDAsBigInteger() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceMediumIDAsBigInteger());
        System.out.println("The ID for this stream in the original medium of the material AS BigInteger === " + jMetaDataGeneral.getOriginalSourceMediumIDAsBigInteger());
    }

   /**
    * Test getOriginalSourceMediumIDAsURL() method.
    */
    @Test
    public void subTestGetOriginalSourceMediumIDAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceMediumIDAsURL());
        System.out.println("The ID for this stream in the original medium of the material AS URL === " + jMetaDataGeneral.getOriginalSourceMediumIDAsURL());
    }

   /**
    * Test getDurationStringAsInteger() method.
    */
    @Test
    public void subTestGetDurationStringAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDurationStringAsInteger());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS Integer === " + jMetaDataGeneral.getDurationStringAsInteger());
    }

   /**
    * Test getDurationStringAsLong() method.
    */
    @Test
    public void subTestGetDurationStringAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getDurationStringAsLong());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS Long === " + jMetaDataGeneral.getDurationStringAsLong());
    }

   /**
    * Test getDurationStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getDurationStringAsLocalDateTime());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS LocalDateTime === " + jMetaDataGeneral.getDurationStringAsLocalDateTime());
    }

   /**
    * Test getDurationStringAsLocalTime() method.
    */
    @Test
    public void subTestGetDurationStringAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getDurationStringAsLocalTime());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS LocalTime === " + jMetaDataGeneral.getDurationStringAsLocalTime());
    }

   /**
    * Test getDurationStringAsString() method.
    */
    @Test
    public void subTestGetDurationStringAsString() {
        assertEquals(null, this.jMetaDataGeneral.getDurationStringAsString());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS String === " + jMetaDataGeneral.getDurationStringAsString());
    }

   /**
    * Test getDurationStringAsBoolean() method.
    */
    @Test
    public void subTestGetDurationStringAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getDurationStringAsBoolean());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS Boolean === " + jMetaDataGeneral.getDurationStringAsBoolean());
    }

   /**
    * Test getDurationStringAsBigInteger() method.
    */
    @Test
    public void subTestGetDurationStringAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDurationStringAsBigInteger());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS BigInteger === " + jMetaDataGeneral.getDurationStringAsBigInteger());
    }

   /**
    * Test getDurationStringAsURL() method.
    */
    @Test
    public void subTestGetDurationStringAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getDurationStringAsURL());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS URL === " + jMetaDataGeneral.getDurationStringAsURL());
    }

   /**
    * Test getServiceTypeAsInteger() method.
    */
    @Test
    public void subTestGetServiceTypeAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getServiceTypeAsInteger());
        System.out.println("ServiceType AS Integer === " + jMetaDataGeneral.getServiceTypeAsInteger());
    }

   /**
    * Test getServiceTypeAsLong() method.
    */
    @Test
    public void subTestGetServiceTypeAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getServiceTypeAsLong());
        System.out.println("ServiceType AS Long === " + jMetaDataGeneral.getServiceTypeAsLong());
    }

   /**
    * Test getServiceTypeAsLocalDateTime() method.
    */
    @Test
    public void subTestGetServiceTypeAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getServiceTypeAsLocalDateTime());
        System.out.println("ServiceType AS LocalDateTime === " + jMetaDataGeneral.getServiceTypeAsLocalDateTime());
    }

   /**
    * Test getServiceTypeAsLocalTime() method.
    */
    @Test
    public void subTestGetServiceTypeAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getServiceTypeAsLocalTime());
        System.out.println("ServiceType AS LocalTime === " + jMetaDataGeneral.getServiceTypeAsLocalTime());
    }

   /**
    * Test getServiceTypeAsString() method.
    */
    @Test
    public void subTestGetServiceTypeAsString() {
        assertEquals(null, this.jMetaDataGeneral.getServiceTypeAsString());
        System.out.println("ServiceType AS String === " + jMetaDataGeneral.getServiceTypeAsString());
    }

   /**
    * Test getServiceTypeAsBoolean() method.
    */
    @Test
    public void subTestGetServiceTypeAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getServiceTypeAsBoolean());
        System.out.println("ServiceType AS Boolean === " + jMetaDataGeneral.getServiceTypeAsBoolean());
    }

   /**
    * Test getServiceTypeAsBigInteger() method.
    */
    @Test
    public void subTestGetServiceTypeAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getServiceTypeAsBigInteger());
        System.out.println("ServiceType AS BigInteger === " + jMetaDataGeneral.getServiceTypeAsBigInteger());
    }

   /**
    * Test getServiceTypeAsURL() method.
    */
    @Test
    public void subTestGetServiceTypeAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getServiceTypeAsURL());
        System.out.println("ServiceType AS URL === " + jMetaDataGeneral.getServiceTypeAsURL());
    }

   /**
    * Test getOverallBitRateNominalAsInteger() method.
    */
    @Test
    public void subTestGetOverallBitRateNominalAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateNominalAsInteger());
        System.out.println("Nominal Bit rate in bps AS Integer === " + jMetaDataGeneral.getOverallBitRateNominalAsInteger());
    }

   /**
    * Test getOverallBitRateNominalAsLong() method.
    */
    @Test
    public void subTestGetOverallBitRateNominalAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateNominalAsLong());
        System.out.println("Nominal Bit rate in bps AS Long === " + jMetaDataGeneral.getOverallBitRateNominalAsLong());
    }

   /**
    * Test getOverallBitRateNominalAsLocalDateTime() method.
    */
    @Test
    public void subTestGetOverallBitRateNominalAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateNominalAsLocalDateTime());
        System.out.println("Nominal Bit rate in bps AS LocalDateTime === " + jMetaDataGeneral.getOverallBitRateNominalAsLocalDateTime());
    }

   /**
    * Test getOverallBitRateNominalAsLocalTime() method.
    */
    @Test
    public void subTestGetOverallBitRateNominalAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateNominalAsLocalTime());
        System.out.println("Nominal Bit rate in bps AS LocalTime === " + jMetaDataGeneral.getOverallBitRateNominalAsLocalTime());
    }

   /**
    * Test getOverallBitRateNominalAsString() method.
    */
    @Test
    public void subTestGetOverallBitRateNominalAsString() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateNominalAsString());
        System.out.println("Nominal Bit rate in bps AS String === " + jMetaDataGeneral.getOverallBitRateNominalAsString());
    }

   /**
    * Test getOverallBitRateNominalAsBoolean() method.
    */
    @Test
    public void subTestGetOverallBitRateNominalAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateNominalAsBoolean());
        System.out.println("Nominal Bit rate in bps AS Boolean === " + jMetaDataGeneral.getOverallBitRateNominalAsBoolean());
    }

   /**
    * Test getOverallBitRateNominalAsBigInteger() method.
    */
    @Test
    public void subTestGetOverallBitRateNominalAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateNominalAsBigInteger());
        System.out.println("Nominal Bit rate in bps AS BigInteger === " + jMetaDataGeneral.getOverallBitRateNominalAsBigInteger());
    }

   /**
    * Test getOverallBitRateNominalAsURL() method.
    */
    @Test
    public void subTestGetOverallBitRateNominalAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateNominalAsURL());
        System.out.println("Nominal Bit rate in bps AS URL === " + jMetaDataGeneral.getOverallBitRateNominalAsURL());
    }

   /**
    * Test getIDAsInteger() method.
    */
    @Test
    public void subTestGetIDAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getIDAsInteger());
        System.out.println("The ID for this stream in this file AS Integer === " + jMetaDataGeneral.getIDAsInteger());
    }

   /**
    * Test getIDAsLong() method.
    */
    @Test
    public void subTestGetIDAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getIDAsLong());
        System.out.println("The ID for this stream in this file AS Long === " + jMetaDataGeneral.getIDAsLong());
    }

   /**
    * Test getIDAsLocalDateTime() method.
    */
    @Test
    public void subTestGetIDAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getIDAsLocalDateTime());
        System.out.println("The ID for this stream in this file AS LocalDateTime === " + jMetaDataGeneral.getIDAsLocalDateTime());
    }

   /**
    * Test getIDAsLocalTime() method.
    */
    @Test
    public void subTestGetIDAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getIDAsLocalTime());
        System.out.println("The ID for this stream in this file AS LocalTime === " + jMetaDataGeneral.getIDAsLocalTime());
    }

   /**
    * Test getIDAsString() method.
    */
    @Test
    public void subTestGetIDAsString() {
        assertEquals(null, this.jMetaDataGeneral.getIDAsString());
        System.out.println("The ID for this stream in this file AS String === " + jMetaDataGeneral.getIDAsString());
    }

   /**
    * Test getIDAsBoolean() method.
    */
    @Test
    public void subTestGetIDAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getIDAsBoolean());
        System.out.println("The ID for this stream in this file AS Boolean === " + jMetaDataGeneral.getIDAsBoolean());
    }

   /**
    * Test getIDAsBigInteger() method.
    */
    @Test
    public void subTestGetIDAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getIDAsBigInteger());
        System.out.println("The ID for this stream in this file AS BigInteger === " + jMetaDataGeneral.getIDAsBigInteger());
    }

   /**
    * Test getIDAsURL() method.
    */
    @Test
    public void subTestGetIDAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getIDAsURL());
        System.out.println("The ID for this stream in this file AS URL === " + jMetaDataGeneral.getIDAsURL());
    }

   /**
    * Test getEncodedLibraryDateAsInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryDateAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryDateAsInteger());
        System.out.println("Release date of software AS Integer === " + jMetaDataGeneral.getEncodedLibraryDateAsInteger());
    }

   /**
    * Test getEncodedLibraryDateAsLong() method.
    */
    @Test
    public void subTestGetEncodedLibraryDateAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryDateAsLong());
        System.out.println("Release date of software AS Long === " + jMetaDataGeneral.getEncodedLibraryDateAsLong());
    }

   /**
    * Test getEncodedLibraryDateAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryDateAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryDateAsLocalDateTime());
        System.out.println("Release date of software AS LocalDateTime === " + jMetaDataGeneral.getEncodedLibraryDateAsLocalDateTime());
    }

   /**
    * Test getEncodedLibraryDateAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryDateAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryDateAsLocalTime());
        System.out.println("Release date of software AS LocalTime === " + jMetaDataGeneral.getEncodedLibraryDateAsLocalTime());
    }

   /**
    * Test getEncodedLibraryDateAsString() method.
    */
    @Test
    public void subTestGetEncodedLibraryDateAsString() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryDateAsString());
        System.out.println("Release date of software AS String === " + jMetaDataGeneral.getEncodedLibraryDateAsString());
    }

   /**
    * Test getEncodedLibraryDateAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedLibraryDateAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryDateAsBoolean());
        System.out.println("Release date of software AS Boolean === " + jMetaDataGeneral.getEncodedLibraryDateAsBoolean());
    }

   /**
    * Test getEncodedLibraryDateAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryDateAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryDateAsBigInteger());
        System.out.println("Release date of software AS BigInteger === " + jMetaDataGeneral.getEncodedLibraryDateAsBigInteger());
    }

   /**
    * Test getEncodedLibraryDateAsURL() method.
    */
    @Test
    public void subTestGetEncodedLibraryDateAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryDateAsURL());
        System.out.println("Release date of software AS URL === " + jMetaDataGeneral.getEncodedLibraryDateAsURL());
    }

   /**
    * Test getMenuIDStringAsInteger() method.
    */
    @Test
    public void subTestGetMenuIDStringAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getMenuIDStringAsInteger());
        System.out.println("The menu ID for this stream in this file AS Integer === " + jMetaDataGeneral.getMenuIDStringAsInteger());
    }

   /**
    * Test getMenuIDStringAsLong() method.
    */
    @Test
    public void subTestGetMenuIDStringAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getMenuIDStringAsLong());
        System.out.println("The menu ID for this stream in this file AS Long === " + jMetaDataGeneral.getMenuIDStringAsLong());
    }

   /**
    * Test getMenuIDStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetMenuIDStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getMenuIDStringAsLocalDateTime());
        System.out.println("The menu ID for this stream in this file AS LocalDateTime === " + jMetaDataGeneral.getMenuIDStringAsLocalDateTime());
    }

   /**
    * Test getMenuIDStringAsLocalTime() method.
    */
    @Test
    public void subTestGetMenuIDStringAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getMenuIDStringAsLocalTime());
        System.out.println("The menu ID for this stream in this file AS LocalTime === " + jMetaDataGeneral.getMenuIDStringAsLocalTime());
    }

   /**
    * Test getMenuIDStringAsString() method.
    */
    @Test
    public void subTestGetMenuIDStringAsString() {
        assertEquals(null, this.jMetaDataGeneral.getMenuIDStringAsString());
        System.out.println("The menu ID for this stream in this file AS String === " + jMetaDataGeneral.getMenuIDStringAsString());
    }

   /**
    * Test getMenuIDStringAsBoolean() method.
    */
    @Test
    public void subTestGetMenuIDStringAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getMenuIDStringAsBoolean());
        System.out.println("The menu ID for this stream in this file AS Boolean === " + jMetaDataGeneral.getMenuIDStringAsBoolean());
    }

   /**
    * Test getMenuIDStringAsBigInteger() method.
    */
    @Test
    public void subTestGetMenuIDStringAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getMenuIDStringAsBigInteger());
        System.out.println("The menu ID for this stream in this file AS BigInteger === " + jMetaDataGeneral.getMenuIDStringAsBigInteger());
    }

   /**
    * Test getMenuIDStringAsURL() method.
    */
    @Test
    public void subTestGetMenuIDStringAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getMenuIDStringAsURL());
        System.out.println("The menu ID for this stream in this file AS URL === " + jMetaDataGeneral.getMenuIDStringAsURL());
    }

   /**
    * Test getFooterSizeAsInteger() method.
    */
    @Test
    public void subTestGetFooterSizeAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFooterSizeAsInteger());
        System.out.println("FooterSize AS Integer === " + jMetaDataGeneral.getFooterSizeAsInteger());
    }

   /**
    * Test getFooterSizeAsLong() method.
    */
    @Test
    public void subTestGetFooterSizeAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getFooterSizeAsLong());
        System.out.println("FooterSize AS Long === " + jMetaDataGeneral.getFooterSizeAsLong());
    }

   /**
    * Test getFooterSizeAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFooterSizeAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getFooterSizeAsLocalDateTime());
        System.out.println("FooterSize AS LocalDateTime === " + jMetaDataGeneral.getFooterSizeAsLocalDateTime());
    }

   /**
    * Test getFooterSizeAsLocalTime() method.
    */
    @Test
    public void subTestGetFooterSizeAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getFooterSizeAsLocalTime());
        System.out.println("FooterSize AS LocalTime === " + jMetaDataGeneral.getFooterSizeAsLocalTime());
    }

   /**
    * Test getFooterSizeAsString() method.
    */
    @Test
    public void subTestGetFooterSizeAsString() {
        assertEquals(null, this.jMetaDataGeneral.getFooterSizeAsString());
        System.out.println("FooterSize AS String === " + jMetaDataGeneral.getFooterSizeAsString());
    }

   /**
    * Test getFooterSizeAsBoolean() method.
    */
    @Test
    public void subTestGetFooterSizeAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getFooterSizeAsBoolean());
        System.out.println("FooterSize AS Boolean === " + jMetaDataGeneral.getFooterSizeAsBoolean());
    }

   /**
    * Test getFooterSizeAsBigInteger() method.
    */
    @Test
    public void subTestGetFooterSizeAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFooterSizeAsBigInteger());
        System.out.println("FooterSize AS BigInteger === " + jMetaDataGeneral.getFooterSizeAsBigInteger());
    }

   /**
    * Test getFooterSizeAsURL() method.
    */
    @Test
    public void subTestGetFooterSizeAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getFooterSizeAsURL());
        System.out.println("FooterSize AS URL === " + jMetaDataGeneral.getFooterSizeAsURL());
    }

   /**
    * Test getTaggedApplicationAsInteger() method.
    */
    @Test
    public void subTestGetTaggedApplicationAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getTaggedApplicationAsInteger());
        System.out.println("Software used to tag this file AS Integer === " + jMetaDataGeneral.getTaggedApplicationAsInteger());
    }

   /**
    * Test getTaggedApplicationAsLong() method.
    */
    @Test
    public void subTestGetTaggedApplicationAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getTaggedApplicationAsLong());
        System.out.println("Software used to tag this file AS Long === " + jMetaDataGeneral.getTaggedApplicationAsLong());
    }

   /**
    * Test getTaggedApplicationAsLocalDateTime() method.
    */
    @Test
    public void subTestGetTaggedApplicationAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getTaggedApplicationAsLocalDateTime());
        System.out.println("Software used to tag this file AS LocalDateTime === " + jMetaDataGeneral.getTaggedApplicationAsLocalDateTime());
    }

   /**
    * Test getTaggedApplicationAsLocalTime() method.
    */
    @Test
    public void subTestGetTaggedApplicationAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getTaggedApplicationAsLocalTime());
        System.out.println("Software used to tag this file AS LocalTime === " + jMetaDataGeneral.getTaggedApplicationAsLocalTime());
    }

   /**
    * Test getTaggedApplicationAsString() method.
    */
    @Test
    public void subTestGetTaggedApplicationAsString() {
        assertEquals(null, this.jMetaDataGeneral.getTaggedApplicationAsString());
        System.out.println("Software used to tag this file AS String === " + jMetaDataGeneral.getTaggedApplicationAsString());
    }

   /**
    * Test getTaggedApplicationAsBoolean() method.
    */
    @Test
    public void subTestGetTaggedApplicationAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getTaggedApplicationAsBoolean());
        System.out.println("Software used to tag this file AS Boolean === " + jMetaDataGeneral.getTaggedApplicationAsBoolean());
    }

   /**
    * Test getTaggedApplicationAsBigInteger() method.
    */
    @Test
    public void subTestGetTaggedApplicationAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getTaggedApplicationAsBigInteger());
        System.out.println("Software used to tag this file AS BigInteger === " + jMetaDataGeneral.getTaggedApplicationAsBigInteger());
    }

   /**
    * Test getTaggedApplicationAsURL() method.
    */
    @Test
    public void subTestGetTaggedApplicationAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getTaggedApplicationAsURL());
        System.out.println("Software used to tag this file AS URL === " + jMetaDataGeneral.getTaggedApplicationAsURL());
    }

   /**
    * Test getTermsOfUseAsInteger() method.
    */
    @Test
    public void subTestGetTermsOfUseAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getTermsOfUseAsInteger());
        System.out.println("License information, e.g., All Rights Reserved,Any Use Permitted. AS Integer === " + jMetaDataGeneral.getTermsOfUseAsInteger());
    }

   /**
    * Test getTermsOfUseAsLong() method.
    */
    @Test
    public void subTestGetTermsOfUseAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getTermsOfUseAsLong());
        System.out.println("License information, e.g., All Rights Reserved,Any Use Permitted. AS Long === " + jMetaDataGeneral.getTermsOfUseAsLong());
    }

   /**
    * Test getTermsOfUseAsLocalDateTime() method.
    */
    @Test
    public void subTestGetTermsOfUseAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getTermsOfUseAsLocalDateTime());
        System.out.println("License information, e.g., All Rights Reserved,Any Use Permitted. AS LocalDateTime === " + jMetaDataGeneral.getTermsOfUseAsLocalDateTime());
    }

   /**
    * Test getTermsOfUseAsLocalTime() method.
    */
    @Test
    public void subTestGetTermsOfUseAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getTermsOfUseAsLocalTime());
        System.out.println("License information, e.g., All Rights Reserved,Any Use Permitted. AS LocalTime === " + jMetaDataGeneral.getTermsOfUseAsLocalTime());
    }

   /**
    * Test getTermsOfUseAsString() method.
    */
    @Test
    public void subTestGetTermsOfUseAsString() {
        assertEquals(null, this.jMetaDataGeneral.getTermsOfUseAsString());
        System.out.println("License information, e.g., All Rights Reserved,Any Use Permitted. AS String === " + jMetaDataGeneral.getTermsOfUseAsString());
    }

   /**
    * Test getTermsOfUseAsBoolean() method.
    */
    @Test
    public void subTestGetTermsOfUseAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getTermsOfUseAsBoolean());
        System.out.println("License information, e.g., All Rights Reserved,Any Use Permitted. AS Boolean === " + jMetaDataGeneral.getTermsOfUseAsBoolean());
    }

   /**
    * Test getTermsOfUseAsBigInteger() method.
    */
    @Test
    public void subTestGetTermsOfUseAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getTermsOfUseAsBigInteger());
        System.out.println("License information, e.g., All Rights Reserved,Any Use Permitted. AS BigInteger === " + jMetaDataGeneral.getTermsOfUseAsBigInteger());
    }

   /**
    * Test getTermsOfUseAsURL() method.
    */
    @Test
    public void subTestGetTermsOfUseAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getTermsOfUseAsURL());
        System.out.println("License information, e.g., All Rights Reserved,Any Use Permitted. AS URL === " + jMetaDataGeneral.getTermsOfUseAsURL());
    }

   /**
    * Test getOverallBitRateAsInteger() method.
    */
    @Test
    public void subTestGetOverallBitRateAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateAsInteger());
        System.out.println("Bit rate of all streams in bps AS Integer === " + jMetaDataGeneral.getOverallBitRateAsInteger());
    }

   /**
    * Test getOverallBitRateAsLong() method.
    */
    @Test
    public void subTestGetOverallBitRateAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateAsLong());
        System.out.println("Bit rate of all streams in bps AS Long === " + jMetaDataGeneral.getOverallBitRateAsLong());
    }

   /**
    * Test getOverallBitRateAsLocalDateTime() method.
    */
    @Test
    public void subTestGetOverallBitRateAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateAsLocalDateTime());
        System.out.println("Bit rate of all streams in bps AS LocalDateTime === " + jMetaDataGeneral.getOverallBitRateAsLocalDateTime());
    }

   /**
    * Test getOverallBitRateAsLocalTime() method.
    */
    @Test
    public void subTestGetOverallBitRateAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateAsLocalTime());
        System.out.println("Bit rate of all streams in bps AS LocalTime === " + jMetaDataGeneral.getOverallBitRateAsLocalTime());
    }

   /**
    * Test getOverallBitRateAsString() method.
    */
    @Test
    public void subTestGetOverallBitRateAsString() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateAsString());
        System.out.println("Bit rate of all streams in bps AS String === " + jMetaDataGeneral.getOverallBitRateAsString());
    }

   /**
    * Test getOverallBitRateAsBoolean() method.
    */
    @Test
    public void subTestGetOverallBitRateAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateAsBoolean());
        System.out.println("Bit rate of all streams in bps AS Boolean === " + jMetaDataGeneral.getOverallBitRateAsBoolean());
    }

   /**
    * Test getOverallBitRateAsBigInteger() method.
    */
    @Test
    public void subTestGetOverallBitRateAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateAsBigInteger());
        System.out.println("Bit rate of all streams in bps AS BigInteger === " + jMetaDataGeneral.getOverallBitRateAsBigInteger());
    }

   /**
    * Test getOverallBitRateAsURL() method.
    */
    @Test
    public void subTestGetOverallBitRateAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateAsURL());
        System.out.println("Bit rate of all streams in bps AS URL === " + jMetaDataGeneral.getOverallBitRateAsURL());
    }

   /**
    * Test getDirectorAsInteger() method.
    */
    @Test
    public void subTestGetDirectorAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDirectorAsInteger());
        System.out.println("Name of the director. AS Integer === " + jMetaDataGeneral.getDirectorAsInteger());
    }

   /**
    * Test getDirectorAsLong() method.
    */
    @Test
    public void subTestGetDirectorAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getDirectorAsLong());
        System.out.println("Name of the director. AS Long === " + jMetaDataGeneral.getDirectorAsLong());
    }

   /**
    * Test getDirectorAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDirectorAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getDirectorAsLocalDateTime());
        System.out.println("Name of the director. AS LocalDateTime === " + jMetaDataGeneral.getDirectorAsLocalDateTime());
    }

   /**
    * Test getDirectorAsLocalTime() method.
    */
    @Test
    public void subTestGetDirectorAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getDirectorAsLocalTime());
        System.out.println("Name of the director. AS LocalTime === " + jMetaDataGeneral.getDirectorAsLocalTime());
    }

   /**
    * Test getDirectorAsString() method.
    */
    @Test
    public void subTestGetDirectorAsString() {
        assertEquals(null, this.jMetaDataGeneral.getDirectorAsString());
        System.out.println("Name of the director. AS String === " + jMetaDataGeneral.getDirectorAsString());
    }

   /**
    * Test getDirectorAsBoolean() method.
    */
    @Test
    public void subTestGetDirectorAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getDirectorAsBoolean());
        System.out.println("Name of the director. AS Boolean === " + jMetaDataGeneral.getDirectorAsBoolean());
    }

   /**
    * Test getDirectorAsBigInteger() method.
    */
    @Test
    public void subTestGetDirectorAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDirectorAsBigInteger());
        System.out.println("Name of the director. AS BigInteger === " + jMetaDataGeneral.getDirectorAsBigInteger());
    }

   /**
    * Test getDirectorAsURL() method.
    */
    @Test
    public void subTestGetDirectorAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getDirectorAsURL());
        System.out.println("Name of the director. AS URL === " + jMetaDataGeneral.getDirectorAsURL());
    }

   /**
    * Test getGroupingAsInteger() method.
    */
    @Test
    public void subTestGetGroupingAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getGroupingAsInteger());
        System.out.println("iTunes grouping AS Integer === " + jMetaDataGeneral.getGroupingAsInteger());
    }

   /**
    * Test getGroupingAsLong() method.
    */
    @Test
    public void subTestGetGroupingAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getGroupingAsLong());
        System.out.println("iTunes grouping AS Long === " + jMetaDataGeneral.getGroupingAsLong());
    }

   /**
    * Test getGroupingAsLocalDateTime() method.
    */
    @Test
    public void subTestGetGroupingAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getGroupingAsLocalDateTime());
        System.out.println("iTunes grouping AS LocalDateTime === " + jMetaDataGeneral.getGroupingAsLocalDateTime());
    }

   /**
    * Test getGroupingAsLocalTime() method.
    */
    @Test
    public void subTestGetGroupingAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getGroupingAsLocalTime());
        System.out.println("iTunes grouping AS LocalTime === " + jMetaDataGeneral.getGroupingAsLocalTime());
    }

   /**
    * Test getGroupingAsString() method.
    */
    @Test
    public void subTestGetGroupingAsString() {
        assertEquals(null, this.jMetaDataGeneral.getGroupingAsString());
        System.out.println("iTunes grouping AS String === " + jMetaDataGeneral.getGroupingAsString());
    }

   /**
    * Test getGroupingAsBoolean() method.
    */
    @Test
    public void subTestGetGroupingAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getGroupingAsBoolean());
        System.out.println("iTunes grouping AS Boolean === " + jMetaDataGeneral.getGroupingAsBoolean());
    }

   /**
    * Test getGroupingAsBigInteger() method.
    */
    @Test
    public void subTestGetGroupingAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getGroupingAsBigInteger());
        System.out.println("iTunes grouping AS BigInteger === " + jMetaDataGeneral.getGroupingAsBigInteger());
    }

   /**
    * Test getGroupingAsURL() method.
    */
    @Test
    public void subTestGetGroupingAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getGroupingAsURL());
        System.out.println("iTunes grouping AS URL === " + jMetaDataGeneral.getGroupingAsURL());
    }

   /**
    * Test getOtherLanguageListAsInteger() method.
    */
    @Test
    public void subTestGetOtherLanguageListAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOtherLanguageListAsInteger());
        System.out.println("Chapters languages in this file, separated by / AS Integer === " + jMetaDataGeneral.getOtherLanguageListAsInteger());
    }

   /**
    * Test getOtherLanguageListAsLong() method.
    */
    @Test
    public void subTestGetOtherLanguageListAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getOtherLanguageListAsLong());
        System.out.println("Chapters languages in this file, separated by / AS Long === " + jMetaDataGeneral.getOtherLanguageListAsLong());
    }

   /**
    * Test getOtherLanguageListAsLocalDateTime() method.
    */
    @Test
    public void subTestGetOtherLanguageListAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getOtherLanguageListAsLocalDateTime());
        System.out.println("Chapters languages in this file, separated by / AS LocalDateTime === " + jMetaDataGeneral.getOtherLanguageListAsLocalDateTime());
    }

   /**
    * Test getOtherLanguageListAsLocalTime() method.
    */
    @Test
    public void subTestGetOtherLanguageListAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getOtherLanguageListAsLocalTime());
        System.out.println("Chapters languages in this file, separated by / AS LocalTime === " + jMetaDataGeneral.getOtherLanguageListAsLocalTime());
    }

   /**
    * Test getOtherLanguageListAsString() method.
    */
    @Test
    public void subTestGetOtherLanguageListAsString() {
        assertEquals(null, this.jMetaDataGeneral.getOtherLanguageListAsString());
        System.out.println("Chapters languages in this file, separated by / AS String === " + jMetaDataGeneral.getOtherLanguageListAsString());
    }

   /**
    * Test getOtherLanguageListAsBoolean() method.
    */
    @Test
    public void subTestGetOtherLanguageListAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getOtherLanguageListAsBoolean());
        System.out.println("Chapters languages in this file, separated by / AS Boolean === " + jMetaDataGeneral.getOtherLanguageListAsBoolean());
    }

   /**
    * Test getOtherLanguageListAsBigInteger() method.
    */
    @Test
    public void subTestGetOtherLanguageListAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOtherLanguageListAsBigInteger());
        System.out.println("Chapters languages in this file, separated by / AS BigInteger === " + jMetaDataGeneral.getOtherLanguageListAsBigInteger());
    }

   /**
    * Test getOtherLanguageListAsURL() method.
    */
    @Test
    public void subTestGetOtherLanguageListAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getOtherLanguageListAsURL());
        System.out.println("Chapters languages in this file, separated by / AS URL === " + jMetaDataGeneral.getOtherLanguageListAsURL());
    }

   /**
    * Test getMoodAsInteger() method.
    */
    @Test
    public void subTestGetMoodAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getMoodAsInteger());
        System.out.println("Intended to reflect the mood of the item with a few keywords, e.g. Romantic, Sad, Uplifting, etc. AS Integer === " + jMetaDataGeneral.getMoodAsInteger());
    }

   /**
    * Test getMoodAsLong() method.
    */
    @Test
    public void subTestGetMoodAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getMoodAsLong());
        System.out.println("Intended to reflect the mood of the item with a few keywords, e.g. Romantic, Sad, Uplifting, etc. AS Long === " + jMetaDataGeneral.getMoodAsLong());
    }

   /**
    * Test getMoodAsLocalDateTime() method.
    */
    @Test
    public void subTestGetMoodAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getMoodAsLocalDateTime());
        System.out.println("Intended to reflect the mood of the item with a few keywords, e.g. Romantic, Sad, Uplifting, etc. AS LocalDateTime === " + jMetaDataGeneral.getMoodAsLocalDateTime());
    }

   /**
    * Test getMoodAsLocalTime() method.
    */
    @Test
    public void subTestGetMoodAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getMoodAsLocalTime());
        System.out.println("Intended to reflect the mood of the item with a few keywords, e.g. Romantic, Sad, Uplifting, etc. AS LocalTime === " + jMetaDataGeneral.getMoodAsLocalTime());
    }

   /**
    * Test getMoodAsString() method.
    */
    @Test
    public void subTestGetMoodAsString() {
        assertEquals(null, this.jMetaDataGeneral.getMoodAsString());
        System.out.println("Intended to reflect the mood of the item with a few keywords, e.g. Romantic, Sad, Uplifting, etc. AS String === " + jMetaDataGeneral.getMoodAsString());
    }

   /**
    * Test getMoodAsBoolean() method.
    */
    @Test
    public void subTestGetMoodAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getMoodAsBoolean());
        System.out.println("Intended to reflect the mood of the item with a few keywords, e.g. Romantic, Sad, Uplifting, etc. AS Boolean === " + jMetaDataGeneral.getMoodAsBoolean());
    }

   /**
    * Test getMoodAsBigInteger() method.
    */
    @Test
    public void subTestGetMoodAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getMoodAsBigInteger());
        System.out.println("Intended to reflect the mood of the item with a few keywords, e.g. Romantic, Sad, Uplifting, etc. AS BigInteger === " + jMetaDataGeneral.getMoodAsBigInteger());
    }

   /**
    * Test getMoodAsURL() method.
    */
    @Test
    public void subTestGetMoodAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getMoodAsURL());
        System.out.println("Intended to reflect the mood of the item with a few keywords, e.g. Romantic, Sad, Uplifting, etc. AS URL === " + jMetaDataGeneral.getMoodAsURL());
    }

   /**
    * Test getEncodedApplicationStringAsInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationStringAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationStringAsInteger());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS Integer === " + jMetaDataGeneral.getEncodedApplicationStringAsInteger());
    }

   /**
    * Test getEncodedApplicationStringAsLong() method.
    */
    @Test
    public void subTestGetEncodedApplicationStringAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationStringAsLong());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS Long === " + jMetaDataGeneral.getEncodedApplicationStringAsLong());
    }

   /**
    * Test getEncodedApplicationStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationStringAsLocalDateTime());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS LocalDateTime === " + jMetaDataGeneral.getEncodedApplicationStringAsLocalDateTime());
    }

   /**
    * Test getEncodedApplicationStringAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationStringAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationStringAsLocalTime());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS LocalTime === " + jMetaDataGeneral.getEncodedApplicationStringAsLocalTime());
    }

   /**
    * Test getEncodedApplicationStringAsString() method.
    */
    @Test
    public void subTestGetEncodedApplicationStringAsString() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationStringAsString());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS String === " + jMetaDataGeneral.getEncodedApplicationStringAsString());
    }

   /**
    * Test getEncodedApplicationStringAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedApplicationStringAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationStringAsBoolean());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS Boolean === " + jMetaDataGeneral.getEncodedApplicationStringAsBoolean());
    }

   /**
    * Test getEncodedApplicationStringAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationStringAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationStringAsBigInteger());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS BigInteger === " + jMetaDataGeneral.getEncodedApplicationStringAsBigInteger());
    }

   /**
    * Test getEncodedApplicationStringAsURL() method.
    */
    @Test
    public void subTestGetEncodedApplicationStringAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationStringAsURL());
        System.out.println("Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)' AS URL === " + jMetaDataGeneral.getEncodedApplicationStringAsURL());
    }

   /**
    * Test getAlbumMoreAsInteger() method.
    */
    @Test
    public void subTestGetAlbumMoreAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumMoreAsInteger());
        System.out.println("More infos about the album AS Integer === " + jMetaDataGeneral.getAlbumMoreAsInteger());
    }

   /**
    * Test getAlbumMoreAsLong() method.
    */
    @Test
    public void subTestGetAlbumMoreAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumMoreAsLong());
        System.out.println("More infos about the album AS Long === " + jMetaDataGeneral.getAlbumMoreAsLong());
    }

   /**
    * Test getAlbumMoreAsLocalDateTime() method.
    */
    @Test
    public void subTestGetAlbumMoreAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumMoreAsLocalDateTime());
        System.out.println("More infos about the album AS LocalDateTime === " + jMetaDataGeneral.getAlbumMoreAsLocalDateTime());
    }

   /**
    * Test getAlbumMoreAsLocalTime() method.
    */
    @Test
    public void subTestGetAlbumMoreAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumMoreAsLocalTime());
        System.out.println("More infos about the album AS LocalTime === " + jMetaDataGeneral.getAlbumMoreAsLocalTime());
    }

   /**
    * Test getAlbumMoreAsString() method.
    */
    @Test
    public void subTestGetAlbumMoreAsString() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumMoreAsString());
        System.out.println("More infos about the album AS String === " + jMetaDataGeneral.getAlbumMoreAsString());
    }

   /**
    * Test getAlbumMoreAsBoolean() method.
    */
    @Test
    public void subTestGetAlbumMoreAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumMoreAsBoolean());
        System.out.println("More infos about the album AS Boolean === " + jMetaDataGeneral.getAlbumMoreAsBoolean());
    }

   /**
    * Test getAlbumMoreAsBigInteger() method.
    */
    @Test
    public void subTestGetAlbumMoreAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumMoreAsBigInteger());
        System.out.println("More infos about the album AS BigInteger === " + jMetaDataGeneral.getAlbumMoreAsBigInteger());
    }

   /**
    * Test getAlbumMoreAsURL() method.
    */
    @Test
    public void subTestGetAlbumMoreAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumMoreAsURL());
        System.out.println("More infos about the album AS URL === " + jMetaDataGeneral.getAlbumMoreAsURL());
    }

   /**
    * Test getCompilationStringAsInteger() method.
    */
    @Test
    public void subTestGetCompilationStringAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCompilationStringAsInteger());
        System.out.println("iTunes compilation AS Integer === " + jMetaDataGeneral.getCompilationStringAsInteger());
    }

   /**
    * Test getCompilationStringAsLong() method.
    */
    @Test
    public void subTestGetCompilationStringAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getCompilationStringAsLong());
        System.out.println("iTunes compilation AS Long === " + jMetaDataGeneral.getCompilationStringAsLong());
    }

   /**
    * Test getCompilationStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCompilationStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getCompilationStringAsLocalDateTime());
        System.out.println("iTunes compilation AS LocalDateTime === " + jMetaDataGeneral.getCompilationStringAsLocalDateTime());
    }

   /**
    * Test getCompilationStringAsLocalTime() method.
    */
    @Test
    public void subTestGetCompilationStringAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getCompilationStringAsLocalTime());
        System.out.println("iTunes compilation AS LocalTime === " + jMetaDataGeneral.getCompilationStringAsLocalTime());
    }

   /**
    * Test getCompilationStringAsString() method.
    */
    @Test
    public void subTestGetCompilationStringAsString() {
        assertEquals(null, this.jMetaDataGeneral.getCompilationStringAsString());
        System.out.println("iTunes compilation AS String === " + jMetaDataGeneral.getCompilationStringAsString());
    }

   /**
    * Test getCompilationStringAsBoolean() method.
    */
    @Test
    public void subTestGetCompilationStringAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getCompilationStringAsBoolean());
        System.out.println("iTunes compilation AS Boolean === " + jMetaDataGeneral.getCompilationStringAsBoolean());
    }

   /**
    * Test getCompilationStringAsBigInteger() method.
    */
    @Test
    public void subTestGetCompilationStringAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCompilationStringAsBigInteger());
        System.out.println("iTunes compilation AS BigInteger === " + jMetaDataGeneral.getCompilationStringAsBigInteger());
    }

   /**
    * Test getCompilationStringAsURL() method.
    */
    @Test
    public void subTestGetCompilationStringAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getCompilationStringAsURL());
        System.out.println("iTunes compilation AS URL === " + jMetaDataGeneral.getCompilationStringAsURL());
    }

   /**
    * Test getCountryAsInteger() method.
    */
    @Test
    public void subTestGetCountryAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCountryAsInteger());
        System.out.println("Country AS Integer === " + jMetaDataGeneral.getCountryAsInteger());
    }

   /**
    * Test getCountryAsLong() method.
    */
    @Test
    public void subTestGetCountryAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getCountryAsLong());
        System.out.println("Country AS Long === " + jMetaDataGeneral.getCountryAsLong());
    }

   /**
    * Test getCountryAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCountryAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getCountryAsLocalDateTime());
        System.out.println("Country AS LocalDateTime === " + jMetaDataGeneral.getCountryAsLocalDateTime());
    }

   /**
    * Test getCountryAsLocalTime() method.
    */
    @Test
    public void subTestGetCountryAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getCountryAsLocalTime());
        System.out.println("Country AS LocalTime === " + jMetaDataGeneral.getCountryAsLocalTime());
    }

   /**
    * Test getCountryAsString() method.
    */
    @Test
    public void subTestGetCountryAsString() {
        assertEquals(null, this.jMetaDataGeneral.getCountryAsString());
        System.out.println("Country AS String === " + jMetaDataGeneral.getCountryAsString());
    }

   /**
    * Test getCountryAsBoolean() method.
    */
    @Test
    public void subTestGetCountryAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getCountryAsBoolean());
        System.out.println("Country AS Boolean === " + jMetaDataGeneral.getCountryAsBoolean());
    }

   /**
    * Test getCountryAsBigInteger() method.
    */
    @Test
    public void subTestGetCountryAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCountryAsBigInteger());
        System.out.println("Country AS BigInteger === " + jMetaDataGeneral.getCountryAsBigInteger());
    }

   /**
    * Test getCountryAsURL() method.
    */
    @Test
    public void subTestGetCountryAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getCountryAsURL());
        System.out.println("Country AS URL === " + jMetaDataGeneral.getCountryAsURL());
    }

   /**
    * Test getFileCreatedDateLocalAsInteger() method.
    */
    @Test
    public void subTestGetFileCreatedDateLocalAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFileCreatedDateLocalAsInteger());
        System.out.println("The time that the file was created on the file system (Warning: this field depends of local configuration, do not use it in an international database) AS Integer === " + jMetaDataGeneral.getFileCreatedDateLocalAsInteger());
    }

   /**
    * Test getFileCreatedDateLocalAsLong() method.
    */
    @Test
    public void subTestGetFileCreatedDateLocalAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getFileCreatedDateLocalAsLong());
        System.out.println("The time that the file was created on the file system (Warning: this field depends of local configuration, do not use it in an international database) AS Long === " + jMetaDataGeneral.getFileCreatedDateLocalAsLong());
    }

   /**
    * Test getFileCreatedDateLocalAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFileCreatedDateLocalAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getFileCreatedDateLocalAsLocalDateTime());
        System.out.println("The time that the file was created on the file system (Warning: this field depends of local configuration, do not use it in an international database) AS LocalDateTime === " + jMetaDataGeneral.getFileCreatedDateLocalAsLocalDateTime());
    }

   /**
    * Test getFileCreatedDateLocalAsLocalTime() method.
    */
    @Test
    public void subTestGetFileCreatedDateLocalAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getFileCreatedDateLocalAsLocalTime());
        System.out.println("The time that the file was created on the file system (Warning: this field depends of local configuration, do not use it in an international database) AS LocalTime === " + jMetaDataGeneral.getFileCreatedDateLocalAsLocalTime());
    }

   /**
    * Test getFileCreatedDateLocalAsString() method.
    */
    @Test
    public void subTestGetFileCreatedDateLocalAsString() {
        assertEquals(null, this.jMetaDataGeneral.getFileCreatedDateLocalAsString());
        System.out.println("The time that the file was created on the file system (Warning: this field depends of local configuration, do not use it in an international database) AS String === " + jMetaDataGeneral.getFileCreatedDateLocalAsString());
    }

   /**
    * Test getFileCreatedDateLocalAsBoolean() method.
    */
    @Test
    public void subTestGetFileCreatedDateLocalAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getFileCreatedDateLocalAsBoolean());
        System.out.println("The time that the file was created on the file system (Warning: this field depends of local configuration, do not use it in an international database) AS Boolean === " + jMetaDataGeneral.getFileCreatedDateLocalAsBoolean());
    }

   /**
    * Test getFileCreatedDateLocalAsBigInteger() method.
    */
    @Test
    public void subTestGetFileCreatedDateLocalAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFileCreatedDateLocalAsBigInteger());
        System.out.println("The time that the file was created on the file system (Warning: this field depends of local configuration, do not use it in an international database) AS BigInteger === " + jMetaDataGeneral.getFileCreatedDateLocalAsBigInteger());
    }

   /**
    * Test getFileCreatedDateLocalAsURL() method.
    */
    @Test
    public void subTestGetFileCreatedDateLocalAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getFileCreatedDateLocalAsURL());
        System.out.println("The time that the file was created on the file system (Warning: this field depends of local configuration, do not use it in an international database) AS URL === " + jMetaDataGeneral.getFileCreatedDateLocalAsURL());
    }

   /**
    * Test getOriginalLyricistAsInteger() method.
    */
    @Test
    public void subTestGetOriginalLyricistAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalLyricistAsInteger());
        System.out.println("Original lyricist(s)/text writer(s). AS Integer === " + jMetaDataGeneral.getOriginalLyricistAsInteger());
    }

   /**
    * Test getOriginalLyricistAsLong() method.
    */
    @Test
    public void subTestGetOriginalLyricistAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalLyricistAsLong());
        System.out.println("Original lyricist(s)/text writer(s). AS Long === " + jMetaDataGeneral.getOriginalLyricistAsLong());
    }

   /**
    * Test getOriginalLyricistAsLocalDateTime() method.
    */
    @Test
    public void subTestGetOriginalLyricistAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalLyricistAsLocalDateTime());
        System.out.println("Original lyricist(s)/text writer(s). AS LocalDateTime === " + jMetaDataGeneral.getOriginalLyricistAsLocalDateTime());
    }

   /**
    * Test getOriginalLyricistAsLocalTime() method.
    */
    @Test
    public void subTestGetOriginalLyricistAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalLyricistAsLocalTime());
        System.out.println("Original lyricist(s)/text writer(s). AS LocalTime === " + jMetaDataGeneral.getOriginalLyricistAsLocalTime());
    }

   /**
    * Test getOriginalLyricistAsString() method.
    */
    @Test
    public void subTestGetOriginalLyricistAsString() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalLyricistAsString());
        System.out.println("Original lyricist(s)/text writer(s). AS String === " + jMetaDataGeneral.getOriginalLyricistAsString());
    }

   /**
    * Test getOriginalLyricistAsBoolean() method.
    */
    @Test
    public void subTestGetOriginalLyricistAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalLyricistAsBoolean());
        System.out.println("Original lyricist(s)/text writer(s). AS Boolean === " + jMetaDataGeneral.getOriginalLyricistAsBoolean());
    }

   /**
    * Test getOriginalLyricistAsBigInteger() method.
    */
    @Test
    public void subTestGetOriginalLyricistAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalLyricistAsBigInteger());
        System.out.println("Original lyricist(s)/text writer(s). AS BigInteger === " + jMetaDataGeneral.getOriginalLyricistAsBigInteger());
    }

   /**
    * Test getOriginalLyricistAsURL() method.
    */
    @Test
    public void subTestGetOriginalLyricistAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalLyricistAsURL());
        System.out.println("Original lyricist(s)/text writer(s). AS URL === " + jMetaDataGeneral.getOriginalLyricistAsURL());
    }

   /**
    * Test getDescriptionAsInteger() method.
    */
    @Test
    public void subTestGetDescriptionAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDescriptionAsInteger());
        System.out.println("A short description of the contents, such as Two birds flying. AS Integer === " + jMetaDataGeneral.getDescriptionAsInteger());
    }

   /**
    * Test getDescriptionAsLong() method.
    */
    @Test
    public void subTestGetDescriptionAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getDescriptionAsLong());
        System.out.println("A short description of the contents, such as Two birds flying. AS Long === " + jMetaDataGeneral.getDescriptionAsLong());
    }

   /**
    * Test getDescriptionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDescriptionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getDescriptionAsLocalDateTime());
        System.out.println("A short description of the contents, such as Two birds flying. AS LocalDateTime === " + jMetaDataGeneral.getDescriptionAsLocalDateTime());
    }

   /**
    * Test getDescriptionAsLocalTime() method.
    */
    @Test
    public void subTestGetDescriptionAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getDescriptionAsLocalTime());
        System.out.println("A short description of the contents, such as Two birds flying. AS LocalTime === " + jMetaDataGeneral.getDescriptionAsLocalTime());
    }

   /**
    * Test getDescriptionAsString() method.
    */
    @Test
    public void subTestGetDescriptionAsString() {
        assertEquals(null, this.jMetaDataGeneral.getDescriptionAsString());
        System.out.println("A short description of the contents, such as Two birds flying. AS String === " + jMetaDataGeneral.getDescriptionAsString());
    }

   /**
    * Test getDescriptionAsBoolean() method.
    */
    @Test
    public void subTestGetDescriptionAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getDescriptionAsBoolean());
        System.out.println("A short description of the contents, such as Two birds flying. AS Boolean === " + jMetaDataGeneral.getDescriptionAsBoolean());
    }

   /**
    * Test getDescriptionAsBigInteger() method.
    */
    @Test
    public void subTestGetDescriptionAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDescriptionAsBigInteger());
        System.out.println("A short description of the contents, such as Two birds flying. AS BigInteger === " + jMetaDataGeneral.getDescriptionAsBigInteger());
    }

   /**
    * Test getDescriptionAsURL() method.
    */
    @Test
    public void subTestGetDescriptionAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getDescriptionAsURL());
        System.out.println("A short description of the contents, such as Two birds flying. AS URL === " + jMetaDataGeneral.getDescriptionAsURL());
    }

   /**
    * Test getTextLanguageListAsInteger() method.
    */
    @Test
    public void subTestGetTextLanguageListAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getTextLanguageListAsInteger());
        System.out.println("Text languages in this file, separated by / AS Integer === " + jMetaDataGeneral.getTextLanguageListAsInteger());
    }

   /**
    * Test getTextLanguageListAsLong() method.
    */
    @Test
    public void subTestGetTextLanguageListAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getTextLanguageListAsLong());
        System.out.println("Text languages in this file, separated by / AS Long === " + jMetaDataGeneral.getTextLanguageListAsLong());
    }

   /**
    * Test getTextLanguageListAsLocalDateTime() method.
    */
    @Test
    public void subTestGetTextLanguageListAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getTextLanguageListAsLocalDateTime());
        System.out.println("Text languages in this file, separated by / AS LocalDateTime === " + jMetaDataGeneral.getTextLanguageListAsLocalDateTime());
    }

   /**
    * Test getTextLanguageListAsLocalTime() method.
    */
    @Test
    public void subTestGetTextLanguageListAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getTextLanguageListAsLocalTime());
        System.out.println("Text languages in this file, separated by / AS LocalTime === " + jMetaDataGeneral.getTextLanguageListAsLocalTime());
    }

   /**
    * Test getTextLanguageListAsString() method.
    */
    @Test
    public void subTestGetTextLanguageListAsString() {
        assertEquals(null, this.jMetaDataGeneral.getTextLanguageListAsString());
        System.out.println("Text languages in this file, separated by / AS String === " + jMetaDataGeneral.getTextLanguageListAsString());
    }

   /**
    * Test getTextLanguageListAsBoolean() method.
    */
    @Test
    public void subTestGetTextLanguageListAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getTextLanguageListAsBoolean());
        System.out.println("Text languages in this file, separated by / AS Boolean === " + jMetaDataGeneral.getTextLanguageListAsBoolean());
    }

   /**
    * Test getTextLanguageListAsBigInteger() method.
    */
    @Test
    public void subTestGetTextLanguageListAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getTextLanguageListAsBigInteger());
        System.out.println("Text languages in this file, separated by / AS BigInteger === " + jMetaDataGeneral.getTextLanguageListAsBigInteger());
    }

   /**
    * Test getTextLanguageListAsURL() method.
    */
    @Test
    public void subTestGetTextLanguageListAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getTextLanguageListAsURL());
        System.out.println("Text languages in this file, separated by / AS URL === " + jMetaDataGeneral.getTextLanguageListAsURL());
    }

   /**
    * Test getCroppedAsInteger() method.
    */
    @Test
    public void subTestGetCroppedAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCroppedAsInteger());
        System.out.println("Describes whether an image has been cropped and, if so, how it was cropped. AS Integer === " + jMetaDataGeneral.getCroppedAsInteger());
    }

   /**
    * Test getCroppedAsLong() method.
    */
    @Test
    public void subTestGetCroppedAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getCroppedAsLong());
        System.out.println("Describes whether an image has been cropped and, if so, how it was cropped. AS Long === " + jMetaDataGeneral.getCroppedAsLong());
    }

   /**
    * Test getCroppedAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCroppedAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getCroppedAsLocalDateTime());
        System.out.println("Describes whether an image has been cropped and, if so, how it was cropped. AS LocalDateTime === " + jMetaDataGeneral.getCroppedAsLocalDateTime());
    }

   /**
    * Test getCroppedAsLocalTime() method.
    */
    @Test
    public void subTestGetCroppedAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getCroppedAsLocalTime());
        System.out.println("Describes whether an image has been cropped and, if so, how it was cropped. AS LocalTime === " + jMetaDataGeneral.getCroppedAsLocalTime());
    }

   /**
    * Test getCroppedAsString() method.
    */
    @Test
    public void subTestGetCroppedAsString() {
        assertEquals(null, this.jMetaDataGeneral.getCroppedAsString());
        System.out.println("Describes whether an image has been cropped and, if so, how it was cropped. AS String === " + jMetaDataGeneral.getCroppedAsString());
    }

   /**
    * Test getCroppedAsBoolean() method.
    */
    @Test
    public void subTestGetCroppedAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getCroppedAsBoolean());
        System.out.println("Describes whether an image has been cropped and, if so, how it was cropped. AS Boolean === " + jMetaDataGeneral.getCroppedAsBoolean());
    }

   /**
    * Test getCroppedAsBigInteger() method.
    */
    @Test
    public void subTestGetCroppedAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCroppedAsBigInteger());
        System.out.println("Describes whether an image has been cropped and, if so, how it was cropped. AS BigInteger === " + jMetaDataGeneral.getCroppedAsBigInteger());
    }

   /**
    * Test getCroppedAsURL() method.
    */
    @Test
    public void subTestGetCroppedAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getCroppedAsURL());
        System.out.println("Describes whether an image has been cropped and, if so, how it was cropped. AS URL === " + jMetaDataGeneral.getCroppedAsURL());
    }

   /**
    * Test getInformAsInteger() method.
    */
    @Test
    public void subTestGetInformAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getInformAsInteger());
        System.out.println("Last **Inform** call AS Integer === " + jMetaDataGeneral.getInformAsInteger());
    }

   /**
    * Test getInformAsLong() method.
    */
    @Test
    public void subTestGetInformAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getInformAsLong());
        System.out.println("Last **Inform** call AS Long === " + jMetaDataGeneral.getInformAsLong());
    }

   /**
    * Test getInformAsLocalDateTime() method.
    */
    @Test
    public void subTestGetInformAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getInformAsLocalDateTime());
        System.out.println("Last **Inform** call AS LocalDateTime === " + jMetaDataGeneral.getInformAsLocalDateTime());
    }

   /**
    * Test getInformAsLocalTime() method.
    */
    @Test
    public void subTestGetInformAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getInformAsLocalTime());
        System.out.println("Last **Inform** call AS LocalTime === " + jMetaDataGeneral.getInformAsLocalTime());
    }

   /**
    * Test getInformAsString() method.
    */
    @Test
    public void subTestGetInformAsString() {
        assertEquals(null, this.jMetaDataGeneral.getInformAsString());
        System.out.println("Last **Inform** call AS String === " + jMetaDataGeneral.getInformAsString());
    }

   /**
    * Test getInformAsBoolean() method.
    */
    @Test
    public void subTestGetInformAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getInformAsBoolean());
        System.out.println("Last **Inform** call AS Boolean === " + jMetaDataGeneral.getInformAsBoolean());
    }

   /**
    * Test getInformAsBigInteger() method.
    */
    @Test
    public void subTestGetInformAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getInformAsBigInteger());
        System.out.println("Last **Inform** call AS BigInteger === " + jMetaDataGeneral.getInformAsBigInteger());
    }

   /**
    * Test getInformAsURL() method.
    */
    @Test
    public void subTestGetInformAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getInformAsURL());
        System.out.println("Last **Inform** call AS URL === " + jMetaDataGeneral.getInformAsURL());
    }

   /**
    * Test getRecordedDateAsInteger() method.
    */
    @Test
    public void subTestGetRecordedDateAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getRecordedDateAsInteger());
        System.out.println("The time/date/year that the recording began. AS Integer === " + jMetaDataGeneral.getRecordedDateAsInteger());
    }

   /**
    * Test getRecordedDateAsLong() method.
    */
    @Test
    public void subTestGetRecordedDateAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getRecordedDateAsLong());
        System.out.println("The time/date/year that the recording began. AS Long === " + jMetaDataGeneral.getRecordedDateAsLong());
    }

   /**
    * Test getRecordedDateAsLocalDateTime() method.
    */
    @Test
    public void subTestGetRecordedDateAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getRecordedDateAsLocalDateTime());
        System.out.println("The time/date/year that the recording began. AS LocalDateTime === " + jMetaDataGeneral.getRecordedDateAsLocalDateTime());
    }

   /**
    * Test getRecordedDateAsLocalTime() method.
    */
    @Test
    public void subTestGetRecordedDateAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getRecordedDateAsLocalTime());
        System.out.println("The time/date/year that the recording began. AS LocalTime === " + jMetaDataGeneral.getRecordedDateAsLocalTime());
    }

   /**
    * Test getRecordedDateAsString() method.
    */
    @Test
    public void subTestGetRecordedDateAsString() {
        assertEquals(null, this.jMetaDataGeneral.getRecordedDateAsString());
        System.out.println("The time/date/year that the recording began. AS String === " + jMetaDataGeneral.getRecordedDateAsString());
    }

   /**
    * Test getRecordedDateAsBoolean() method.
    */
    @Test
    public void subTestGetRecordedDateAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getRecordedDateAsBoolean());
        System.out.println("The time/date/year that the recording began. AS Boolean === " + jMetaDataGeneral.getRecordedDateAsBoolean());
    }

   /**
    * Test getRecordedDateAsBigInteger() method.
    */
    @Test
    public void subTestGetRecordedDateAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getRecordedDateAsBigInteger());
        System.out.println("The time/date/year that the recording began. AS BigInteger === " + jMetaDataGeneral.getRecordedDateAsBigInteger());
    }

   /**
    * Test getRecordedDateAsURL() method.
    */
    @Test
    public void subTestGetRecordedDateAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getRecordedDateAsURL());
        System.out.println("The time/date/year that the recording began. AS URL === " + jMetaDataGeneral.getRecordedDateAsURL());
    }

   /**
    * Test getMenuLanguageListAsInteger() method.
    */
    @Test
    public void subTestGetMenuLanguageListAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getMenuLanguageListAsInteger());
        System.out.println("Menu languages in this file, separated by / AS Integer === " + jMetaDataGeneral.getMenuLanguageListAsInteger());
    }

   /**
    * Test getMenuLanguageListAsLong() method.
    */
    @Test
    public void subTestGetMenuLanguageListAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getMenuLanguageListAsLong());
        System.out.println("Menu languages in this file, separated by / AS Long === " + jMetaDataGeneral.getMenuLanguageListAsLong());
    }

   /**
    * Test getMenuLanguageListAsLocalDateTime() method.
    */
    @Test
    public void subTestGetMenuLanguageListAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getMenuLanguageListAsLocalDateTime());
        System.out.println("Menu languages in this file, separated by / AS LocalDateTime === " + jMetaDataGeneral.getMenuLanguageListAsLocalDateTime());
    }

   /**
    * Test getMenuLanguageListAsLocalTime() method.
    */
    @Test
    public void subTestGetMenuLanguageListAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getMenuLanguageListAsLocalTime());
        System.out.println("Menu languages in this file, separated by / AS LocalTime === " + jMetaDataGeneral.getMenuLanguageListAsLocalTime());
    }

   /**
    * Test getMenuLanguageListAsString() method.
    */
    @Test
    public void subTestGetMenuLanguageListAsString() {
        assertEquals(null, this.jMetaDataGeneral.getMenuLanguageListAsString());
        System.out.println("Menu languages in this file, separated by / AS String === " + jMetaDataGeneral.getMenuLanguageListAsString());
    }

   /**
    * Test getMenuLanguageListAsBoolean() method.
    */
    @Test
    public void subTestGetMenuLanguageListAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getMenuLanguageListAsBoolean());
        System.out.println("Menu languages in this file, separated by / AS Boolean === " + jMetaDataGeneral.getMenuLanguageListAsBoolean());
    }

   /**
    * Test getMenuLanguageListAsBigInteger() method.
    */
    @Test
    public void subTestGetMenuLanguageListAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getMenuLanguageListAsBigInteger());
        System.out.println("Menu languages in this file, separated by / AS BigInteger === " + jMetaDataGeneral.getMenuLanguageListAsBigInteger());
    }

   /**
    * Test getMenuLanguageListAsURL() method.
    */
    @Test
    public void subTestGetMenuLanguageListAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getMenuLanguageListAsURL());
        System.out.println("Menu languages in this file, separated by / AS URL === " + jMetaDataGeneral.getMenuLanguageListAsURL());
    }

   /**
    * Test getFileSizeStringAsInteger() method.
    */
    @Test
    public void subTestGetFileSizeStringAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeStringAsInteger());
        System.out.println("File size (with measure) AS Integer === " + jMetaDataGeneral.getFileSizeStringAsInteger());
    }

   /**
    * Test getFileSizeStringAsLong() method.
    */
    @Test
    public void subTestGetFileSizeStringAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeStringAsLong());
        System.out.println("File size (with measure) AS Long === " + jMetaDataGeneral.getFileSizeStringAsLong());
    }

   /**
    * Test getFileSizeStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFileSizeStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeStringAsLocalDateTime());
        System.out.println("File size (with measure) AS LocalDateTime === " + jMetaDataGeneral.getFileSizeStringAsLocalDateTime());
    }

   /**
    * Test getFileSizeStringAsLocalTime() method.
    */
    @Test
    public void subTestGetFileSizeStringAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeStringAsLocalTime());
        System.out.println("File size (with measure) AS LocalTime === " + jMetaDataGeneral.getFileSizeStringAsLocalTime());
    }

   /**
    * Test getFileSizeStringAsString() method.
    */
    @Test
    public void subTestGetFileSizeStringAsString() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeStringAsString());
        System.out.println("File size (with measure) AS String === " + jMetaDataGeneral.getFileSizeStringAsString());
    }

   /**
    * Test getFileSizeStringAsBoolean() method.
    */
    @Test
    public void subTestGetFileSizeStringAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeStringAsBoolean());
        System.out.println("File size (with measure) AS Boolean === " + jMetaDataGeneral.getFileSizeStringAsBoolean());
    }

   /**
    * Test getFileSizeStringAsBigInteger() method.
    */
    @Test
    public void subTestGetFileSizeStringAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeStringAsBigInteger());
        System.out.println("File size (with measure) AS BigInteger === " + jMetaDataGeneral.getFileSizeStringAsBigInteger());
    }

   /**
    * Test getFileSizeStringAsURL() method.
    */
    @Test
    public void subTestGetFileSizeStringAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeStringAsURL());
        System.out.println("File size (with measure) AS URL === " + jMetaDataGeneral.getFileSizeStringAsURL());
    }

   /**
    * Test getLawRatingReasonAsInteger() method.
    */
    @Test
    public void subTestGetLawRatingReasonAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getLawRatingReasonAsInteger());
        System.out.println("Reason for the law rating AS Integer === " + jMetaDataGeneral.getLawRatingReasonAsInteger());
    }

   /**
    * Test getLawRatingReasonAsLong() method.
    */
    @Test
    public void subTestGetLawRatingReasonAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getLawRatingReasonAsLong());
        System.out.println("Reason for the law rating AS Long === " + jMetaDataGeneral.getLawRatingReasonAsLong());
    }

   /**
    * Test getLawRatingReasonAsLocalDateTime() method.
    */
    @Test
    public void subTestGetLawRatingReasonAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getLawRatingReasonAsLocalDateTime());
        System.out.println("Reason for the law rating AS LocalDateTime === " + jMetaDataGeneral.getLawRatingReasonAsLocalDateTime());
    }

   /**
    * Test getLawRatingReasonAsLocalTime() method.
    */
    @Test
    public void subTestGetLawRatingReasonAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getLawRatingReasonAsLocalTime());
        System.out.println("Reason for the law rating AS LocalTime === " + jMetaDataGeneral.getLawRatingReasonAsLocalTime());
    }

   /**
    * Test getLawRatingReasonAsString() method.
    */
    @Test
    public void subTestGetLawRatingReasonAsString() {
        assertEquals(null, this.jMetaDataGeneral.getLawRatingReasonAsString());
        System.out.println("Reason for the law rating AS String === " + jMetaDataGeneral.getLawRatingReasonAsString());
    }

   /**
    * Test getLawRatingReasonAsBoolean() method.
    */
    @Test
    public void subTestGetLawRatingReasonAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getLawRatingReasonAsBoolean());
        System.out.println("Reason for the law rating AS Boolean === " + jMetaDataGeneral.getLawRatingReasonAsBoolean());
    }

   /**
    * Test getLawRatingReasonAsBigInteger() method.
    */
    @Test
    public void subTestGetLawRatingReasonAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getLawRatingReasonAsBigInteger());
        System.out.println("Reason for the law rating AS BigInteger === " + jMetaDataGeneral.getLawRatingReasonAsBigInteger());
    }

   /**
    * Test getLawRatingReasonAsURL() method.
    */
    @Test
    public void subTestGetLawRatingReasonAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getLawRatingReasonAsURL());
        System.out.println("Reason for the law rating AS URL === " + jMetaDataGeneral.getLawRatingReasonAsURL());
    }

   /**
    * Test getCodecIDCompatibleAsInteger() method.
    */
    @Test
    public void subTestGetCodecIDCompatibleAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDCompatibleAsInteger());
        System.out.println("Compatible CodecIDs AS Integer === " + jMetaDataGeneral.getCodecIDCompatibleAsInteger());
    }

   /**
    * Test getCodecIDCompatibleAsLong() method.
    */
    @Test
    public void subTestGetCodecIDCompatibleAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDCompatibleAsLong());
        System.out.println("Compatible CodecIDs AS Long === " + jMetaDataGeneral.getCodecIDCompatibleAsLong());
    }

   /**
    * Test getCodecIDCompatibleAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCodecIDCompatibleAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDCompatibleAsLocalDateTime());
        System.out.println("Compatible CodecIDs AS LocalDateTime === " + jMetaDataGeneral.getCodecIDCompatibleAsLocalDateTime());
    }

   /**
    * Test getCodecIDCompatibleAsLocalTime() method.
    */
    @Test
    public void subTestGetCodecIDCompatibleAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDCompatibleAsLocalTime());
        System.out.println("Compatible CodecIDs AS LocalTime === " + jMetaDataGeneral.getCodecIDCompatibleAsLocalTime());
    }

   /**
    * Test getCodecIDCompatibleAsString() method.
    */
    @Test
    public void subTestGetCodecIDCompatibleAsString() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDCompatibleAsString());
        System.out.println("Compatible CodecIDs AS String === " + jMetaDataGeneral.getCodecIDCompatibleAsString());
    }

   /**
    * Test getCodecIDCompatibleAsBoolean() method.
    */
    @Test
    public void subTestGetCodecIDCompatibleAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDCompatibleAsBoolean());
        System.out.println("Compatible CodecIDs AS Boolean === " + jMetaDataGeneral.getCodecIDCompatibleAsBoolean());
    }

   /**
    * Test getCodecIDCompatibleAsBigInteger() method.
    */
    @Test
    public void subTestGetCodecIDCompatibleAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDCompatibleAsBigInteger());
        System.out.println("Compatible CodecIDs AS BigInteger === " + jMetaDataGeneral.getCodecIDCompatibleAsBigInteger());
    }

   /**
    * Test getCodecIDCompatibleAsURL() method.
    */
    @Test
    public void subTestGetCodecIDCompatibleAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDCompatibleAsURL());
        System.out.println("Compatible CodecIDs AS URL === " + jMetaDataGeneral.getCodecIDCompatibleAsURL());
    }

   /**
    * Test getDotsPerInchAsInteger() method.
    */
    @Test
    public void subTestGetDotsPerInchAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDotsPerInchAsInteger());
        System.out.println("Stores dots per inch setting of the digitizer used to produce the file AS Integer === " + jMetaDataGeneral.getDotsPerInchAsInteger());
    }

   /**
    * Test getDotsPerInchAsLong() method.
    */
    @Test
    public void subTestGetDotsPerInchAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getDotsPerInchAsLong());
        System.out.println("Stores dots per inch setting of the digitizer used to produce the file AS Long === " + jMetaDataGeneral.getDotsPerInchAsLong());
    }

   /**
    * Test getDotsPerInchAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDotsPerInchAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getDotsPerInchAsLocalDateTime());
        System.out.println("Stores dots per inch setting of the digitizer used to produce the file AS LocalDateTime === " + jMetaDataGeneral.getDotsPerInchAsLocalDateTime());
    }

   /**
    * Test getDotsPerInchAsLocalTime() method.
    */
    @Test
    public void subTestGetDotsPerInchAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getDotsPerInchAsLocalTime());
        System.out.println("Stores dots per inch setting of the digitizer used to produce the file AS LocalTime === " + jMetaDataGeneral.getDotsPerInchAsLocalTime());
    }

   /**
    * Test getDotsPerInchAsString() method.
    */
    @Test
    public void subTestGetDotsPerInchAsString() {
        assertEquals(null, this.jMetaDataGeneral.getDotsPerInchAsString());
        System.out.println("Stores dots per inch setting of the digitizer used to produce the file AS String === " + jMetaDataGeneral.getDotsPerInchAsString());
    }

   /**
    * Test getDotsPerInchAsBoolean() method.
    */
    @Test
    public void subTestGetDotsPerInchAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getDotsPerInchAsBoolean());
        System.out.println("Stores dots per inch setting of the digitizer used to produce the file AS Boolean === " + jMetaDataGeneral.getDotsPerInchAsBoolean());
    }

   /**
    * Test getDotsPerInchAsBigInteger() method.
    */
    @Test
    public void subTestGetDotsPerInchAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDotsPerInchAsBigInteger());
        System.out.println("Stores dots per inch setting of the digitizer used to produce the file AS BigInteger === " + jMetaDataGeneral.getDotsPerInchAsBigInteger());
    }

   /**
    * Test getDotsPerInchAsURL() method.
    */
    @Test
    public void subTestGetDotsPerInchAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getDotsPerInchAsURL());
        System.out.println("Stores dots per inch setting of the digitizer used to produce the file AS URL === " + jMetaDataGeneral.getDotsPerInchAsURL());
    }

   /**
    * Test getPlayedLastDateAsInteger() method.
    */
    @Test
    public void subTestGetPlayedLastDateAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getPlayedLastDateAsInteger());
        System.out.println("The date, the owner last played an item AS Integer === " + jMetaDataGeneral.getPlayedLastDateAsInteger());
    }

   /**
    * Test getPlayedLastDateAsLong() method.
    */
    @Test
    public void subTestGetPlayedLastDateAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getPlayedLastDateAsLong());
        System.out.println("The date, the owner last played an item AS Long === " + jMetaDataGeneral.getPlayedLastDateAsLong());
    }

   /**
    * Test getPlayedLastDateAsLocalDateTime() method.
    */
    @Test
    public void subTestGetPlayedLastDateAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getPlayedLastDateAsLocalDateTime());
        System.out.println("The date, the owner last played an item AS LocalDateTime === " + jMetaDataGeneral.getPlayedLastDateAsLocalDateTime());
    }

   /**
    * Test getPlayedLastDateAsLocalTime() method.
    */
    @Test
    public void subTestGetPlayedLastDateAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getPlayedLastDateAsLocalTime());
        System.out.println("The date, the owner last played an item AS LocalTime === " + jMetaDataGeneral.getPlayedLastDateAsLocalTime());
    }

   /**
    * Test getPlayedLastDateAsString() method.
    */
    @Test
    public void subTestGetPlayedLastDateAsString() {
        assertEquals(null, this.jMetaDataGeneral.getPlayedLastDateAsString());
        System.out.println("The date, the owner last played an item AS String === " + jMetaDataGeneral.getPlayedLastDateAsString());
    }

   /**
    * Test getPlayedLastDateAsBoolean() method.
    */
    @Test
    public void subTestGetPlayedLastDateAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getPlayedLastDateAsBoolean());
        System.out.println("The date, the owner last played an item AS Boolean === " + jMetaDataGeneral.getPlayedLastDateAsBoolean());
    }

   /**
    * Test getPlayedLastDateAsBigInteger() method.
    */
    @Test
    public void subTestGetPlayedLastDateAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getPlayedLastDateAsBigInteger());
        System.out.println("The date, the owner last played an item AS BigInteger === " + jMetaDataGeneral.getPlayedLastDateAsBigInteger());
    }

   /**
    * Test getPlayedLastDateAsURL() method.
    */
    @Test
    public void subTestGetPlayedLastDateAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getPlayedLastDateAsURL());
        System.out.println("The date, the owner last played an item AS URL === " + jMetaDataGeneral.getPlayedLastDateAsURL());
    }

   /**
    * Test getFolderNameAsInteger() method.
    */
    @Test
    public void subTestGetFolderNameAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFolderNameAsInteger());
        System.out.println("Folder name only AS Integer === " + jMetaDataGeneral.getFolderNameAsInteger());
    }

   /**
    * Test getFolderNameAsLong() method.
    */
    @Test
    public void subTestGetFolderNameAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getFolderNameAsLong());
        System.out.println("Folder name only AS Long === " + jMetaDataGeneral.getFolderNameAsLong());
    }

   /**
    * Test getFolderNameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFolderNameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getFolderNameAsLocalDateTime());
        System.out.println("Folder name only AS LocalDateTime === " + jMetaDataGeneral.getFolderNameAsLocalDateTime());
    }

   /**
    * Test getFolderNameAsLocalTime() method.
    */
    @Test
    public void subTestGetFolderNameAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getFolderNameAsLocalTime());
        System.out.println("Folder name only AS LocalTime === " + jMetaDataGeneral.getFolderNameAsLocalTime());
    }

   /**
    * Test getFolderNameAsString() method.
    */
    @Test
    public void subTestGetFolderNameAsString() {
        assertEquals(null, this.jMetaDataGeneral.getFolderNameAsString());
        System.out.println("Folder name only AS String === " + jMetaDataGeneral.getFolderNameAsString());
    }

   /**
    * Test getFolderNameAsBoolean() method.
    */
    @Test
    public void subTestGetFolderNameAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getFolderNameAsBoolean());
        System.out.println("Folder name only AS Boolean === " + jMetaDataGeneral.getFolderNameAsBoolean());
    }

   /**
    * Test getFolderNameAsBigInteger() method.
    */
    @Test
    public void subTestGetFolderNameAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFolderNameAsBigInteger());
        System.out.println("Folder name only AS BigInteger === " + jMetaDataGeneral.getFolderNameAsBigInteger());
    }

   /**
    * Test getFolderNameAsURL() method.
    */
    @Test
    public void subTestGetFolderNameAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getFolderNameAsURL());
        System.out.println("Folder name only AS URL === " + jMetaDataGeneral.getFolderNameAsURL());
    }

   /**
    * Test getCoDirectorAsInteger() method.
    */
    @Test
    public void subTestGetCoDirectorAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCoDirectorAsInteger());
        System.out.println("Name of the codirector. AS Integer === " + jMetaDataGeneral.getCoDirectorAsInteger());
    }

   /**
    * Test getCoDirectorAsLong() method.
    */
    @Test
    public void subTestGetCoDirectorAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getCoDirectorAsLong());
        System.out.println("Name of the codirector. AS Long === " + jMetaDataGeneral.getCoDirectorAsLong());
    }

   /**
    * Test getCoDirectorAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCoDirectorAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getCoDirectorAsLocalDateTime());
        System.out.println("Name of the codirector. AS LocalDateTime === " + jMetaDataGeneral.getCoDirectorAsLocalDateTime());
    }

   /**
    * Test getCoDirectorAsLocalTime() method.
    */
    @Test
    public void subTestGetCoDirectorAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getCoDirectorAsLocalTime());
        System.out.println("Name of the codirector. AS LocalTime === " + jMetaDataGeneral.getCoDirectorAsLocalTime());
    }

   /**
    * Test getCoDirectorAsString() method.
    */
    @Test
    public void subTestGetCoDirectorAsString() {
        assertEquals(null, this.jMetaDataGeneral.getCoDirectorAsString());
        System.out.println("Name of the codirector. AS String === " + jMetaDataGeneral.getCoDirectorAsString());
    }

   /**
    * Test getCoDirectorAsBoolean() method.
    */
    @Test
    public void subTestGetCoDirectorAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getCoDirectorAsBoolean());
        System.out.println("Name of the codirector. AS Boolean === " + jMetaDataGeneral.getCoDirectorAsBoolean());
    }

   /**
    * Test getCoDirectorAsBigInteger() method.
    */
    @Test
    public void subTestGetCoDirectorAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCoDirectorAsBigInteger());
        System.out.println("Name of the codirector. AS BigInteger === " + jMetaDataGeneral.getCoDirectorAsBigInteger());
    }

   /**
    * Test getCoDirectorAsURL() method.
    */
    @Test
    public void subTestGetCoDirectorAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getCoDirectorAsURL());
        System.out.println("Name of the codirector. AS URL === " + jMetaDataGeneral.getCoDirectorAsURL());
    }

   /**
    * Test getPlayedCountAsInteger() method.
    */
    @Test
    public void subTestGetPlayedCountAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getPlayedCountAsInteger());
        System.out.println("Number of times an item was played AS Integer === " + jMetaDataGeneral.getPlayedCountAsInteger());
    }

   /**
    * Test getPlayedCountAsLong() method.
    */
    @Test
    public void subTestGetPlayedCountAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getPlayedCountAsLong());
        System.out.println("Number of times an item was played AS Long === " + jMetaDataGeneral.getPlayedCountAsLong());
    }

   /**
    * Test getPlayedCountAsLocalDateTime() method.
    */
    @Test
    public void subTestGetPlayedCountAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getPlayedCountAsLocalDateTime());
        System.out.println("Number of times an item was played AS LocalDateTime === " + jMetaDataGeneral.getPlayedCountAsLocalDateTime());
    }

   /**
    * Test getPlayedCountAsLocalTime() method.
    */
    @Test
    public void subTestGetPlayedCountAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getPlayedCountAsLocalTime());
        System.out.println("Number of times an item was played AS LocalTime === " + jMetaDataGeneral.getPlayedCountAsLocalTime());
    }

   /**
    * Test getPlayedCountAsString() method.
    */
    @Test
    public void subTestGetPlayedCountAsString() {
        assertEquals(null, this.jMetaDataGeneral.getPlayedCountAsString());
        System.out.println("Number of times an item was played AS String === " + jMetaDataGeneral.getPlayedCountAsString());
    }

   /**
    * Test getPlayedCountAsBoolean() method.
    */
    @Test
    public void subTestGetPlayedCountAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getPlayedCountAsBoolean());
        System.out.println("Number of times an item was played AS Boolean === " + jMetaDataGeneral.getPlayedCountAsBoolean());
    }

   /**
    * Test getPlayedCountAsBigInteger() method.
    */
    @Test
    public void subTestGetPlayedCountAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getPlayedCountAsBigInteger());
        System.out.println("Number of times an item was played AS BigInteger === " + jMetaDataGeneral.getPlayedCountAsBigInteger());
    }

   /**
    * Test getPlayedCountAsURL() method.
    */
    @Test
    public void subTestGetPlayedCountAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getPlayedCountAsURL());
        System.out.println("Number of times an item was played AS URL === " + jMetaDataGeneral.getPlayedCountAsURL());
    }

   /**
    * Test getStreamKindIDAsInteger() method.
    */
    @Test
    public void subTestGetStreamKindIDAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getStreamKindIDAsInteger());
        System.out.println("Number of the stream (base=0) AS Integer === " + jMetaDataGeneral.getStreamKindIDAsInteger());
    }

   /**
    * Test getStreamKindIDAsLong() method.
    */
    @Test
    public void subTestGetStreamKindIDAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getStreamKindIDAsLong());
        System.out.println("Number of the stream (base=0) AS Long === " + jMetaDataGeneral.getStreamKindIDAsLong());
    }

   /**
    * Test getStreamKindIDAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamKindIDAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getStreamKindIDAsLocalDateTime());
        System.out.println("Number of the stream (base=0) AS LocalDateTime === " + jMetaDataGeneral.getStreamKindIDAsLocalDateTime());
    }

   /**
    * Test getStreamKindIDAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamKindIDAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getStreamKindIDAsLocalTime());
        System.out.println("Number of the stream (base=0) AS LocalTime === " + jMetaDataGeneral.getStreamKindIDAsLocalTime());
    }

   /**
    * Test getStreamKindIDAsString() method.
    */
    @Test
    public void subTestGetStreamKindIDAsString() {
        assertEquals(null, this.jMetaDataGeneral.getStreamKindIDAsString());
        System.out.println("Number of the stream (base=0) AS String === " + jMetaDataGeneral.getStreamKindIDAsString());
    }

   /**
    * Test getStreamKindIDAsBoolean() method.
    */
    @Test
    public void subTestGetStreamKindIDAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getStreamKindIDAsBoolean());
        System.out.println("Number of the stream (base=0) AS Boolean === " + jMetaDataGeneral.getStreamKindIDAsBoolean());
    }

   /**
    * Test getStreamKindIDAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamKindIDAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getStreamKindIDAsBigInteger());
        System.out.println("Number of the stream (base=0) AS BigInteger === " + jMetaDataGeneral.getStreamKindIDAsBigInteger());
    }

   /**
    * Test getStreamKindIDAsURL() method.
    */
    @Test
    public void subTestGetStreamKindIDAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getStreamKindIDAsURL());
        System.out.println("Number of the stream (base=0) AS URL === " + jMetaDataGeneral.getStreamKindIDAsURL());
    }

   /**
    * Test getFolderNameLastAsInteger() method.
    */
    @Test
    public void subTestGetFolderNameLastAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFolderNameLastAsInteger());
        System.out.println("Folder name only of the last file (in the case of a sequence of files) AS Integer === " + jMetaDataGeneral.getFolderNameLastAsInteger());
    }

   /**
    * Test getFolderNameLastAsLong() method.
    */
    @Test
    public void subTestGetFolderNameLastAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getFolderNameLastAsLong());
        System.out.println("Folder name only of the last file (in the case of a sequence of files) AS Long === " + jMetaDataGeneral.getFolderNameLastAsLong());
    }

   /**
    * Test getFolderNameLastAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFolderNameLastAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getFolderNameLastAsLocalDateTime());
        System.out.println("Folder name only of the last file (in the case of a sequence of files) AS LocalDateTime === " + jMetaDataGeneral.getFolderNameLastAsLocalDateTime());
    }

   /**
    * Test getFolderNameLastAsLocalTime() method.
    */
    @Test
    public void subTestGetFolderNameLastAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getFolderNameLastAsLocalTime());
        System.out.println("Folder name only of the last file (in the case of a sequence of files) AS LocalTime === " + jMetaDataGeneral.getFolderNameLastAsLocalTime());
    }

   /**
    * Test getFolderNameLastAsString() method.
    */
    @Test
    public void subTestGetFolderNameLastAsString() {
        assertEquals(null, this.jMetaDataGeneral.getFolderNameLastAsString());
        System.out.println("Folder name only of the last file (in the case of a sequence of files) AS String === " + jMetaDataGeneral.getFolderNameLastAsString());
    }

   /**
    * Test getFolderNameLastAsBoolean() method.
    */
    @Test
    public void subTestGetFolderNameLastAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getFolderNameLastAsBoolean());
        System.out.println("Folder name only of the last file (in the case of a sequence of files) AS Boolean === " + jMetaDataGeneral.getFolderNameLastAsBoolean());
    }

   /**
    * Test getFolderNameLastAsBigInteger() method.
    */
    @Test
    public void subTestGetFolderNameLastAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFolderNameLastAsBigInteger());
        System.out.println("Folder name only of the last file (in the case of a sequence of files) AS BigInteger === " + jMetaDataGeneral.getFolderNameLastAsBigInteger());
    }

   /**
    * Test getFolderNameLastAsURL() method.
    */
    @Test
    public void subTestGetFolderNameLastAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getFolderNameLastAsURL());
        System.out.println("Folder name only of the last file (in the case of a sequence of files) AS URL === " + jMetaDataGeneral.getFolderNameLastAsURL());
    }

   /**
    * Test getCatalogNumberAsInteger() method.
    */
    @Test
    public void subTestGetCatalogNumberAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCatalogNumberAsInteger());
        System.out.println("A label-specific catalogue number used to identify the release. e.g. TIC 01. AS Integer === " + jMetaDataGeneral.getCatalogNumberAsInteger());
    }

   /**
    * Test getCatalogNumberAsLong() method.
    */
    @Test
    public void subTestGetCatalogNumberAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getCatalogNumberAsLong());
        System.out.println("A label-specific catalogue number used to identify the release. e.g. TIC 01. AS Long === " + jMetaDataGeneral.getCatalogNumberAsLong());
    }

   /**
    * Test getCatalogNumberAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCatalogNumberAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getCatalogNumberAsLocalDateTime());
        System.out.println("A label-specific catalogue number used to identify the release. e.g. TIC 01. AS LocalDateTime === " + jMetaDataGeneral.getCatalogNumberAsLocalDateTime());
    }

   /**
    * Test getCatalogNumberAsLocalTime() method.
    */
    @Test
    public void subTestGetCatalogNumberAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getCatalogNumberAsLocalTime());
        System.out.println("A label-specific catalogue number used to identify the release. e.g. TIC 01. AS LocalTime === " + jMetaDataGeneral.getCatalogNumberAsLocalTime());
    }

   /**
    * Test getCatalogNumberAsString() method.
    */
    @Test
    public void subTestGetCatalogNumberAsString() {
        assertEquals(null, this.jMetaDataGeneral.getCatalogNumberAsString());
        System.out.println("A label-specific catalogue number used to identify the release. e.g. TIC 01. AS String === " + jMetaDataGeneral.getCatalogNumberAsString());
    }

   /**
    * Test getCatalogNumberAsBoolean() method.
    */
    @Test
    public void subTestGetCatalogNumberAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getCatalogNumberAsBoolean());
        System.out.println("A label-specific catalogue number used to identify the release. e.g. TIC 01. AS Boolean === " + jMetaDataGeneral.getCatalogNumberAsBoolean());
    }

   /**
    * Test getCatalogNumberAsBigInteger() method.
    */
    @Test
    public void subTestGetCatalogNumberAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCatalogNumberAsBigInteger());
        System.out.println("A label-specific catalogue number used to identify the release. e.g. TIC 01. AS BigInteger === " + jMetaDataGeneral.getCatalogNumberAsBigInteger());
    }

   /**
    * Test getCatalogNumberAsURL() method.
    */
    @Test
    public void subTestGetCatalogNumberAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getCatalogNumberAsURL());
        System.out.println("A label-specific catalogue number used to identify the release. e.g. TIC 01. AS URL === " + jMetaDataGeneral.getCatalogNumberAsURL());
    }

   /**
    * Test getRecordedLocationAsInteger() method.
    */
    @Test
    public void subTestGetRecordedLocationAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getRecordedLocationAsInteger());
        System.out.println("Location where track was recorded. (See COMPOSITION_LOCATION for format) AS Integer === " + jMetaDataGeneral.getRecordedLocationAsInteger());
    }

   /**
    * Test getRecordedLocationAsLong() method.
    */
    @Test
    public void subTestGetRecordedLocationAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getRecordedLocationAsLong());
        System.out.println("Location where track was recorded. (See COMPOSITION_LOCATION for format) AS Long === " + jMetaDataGeneral.getRecordedLocationAsLong());
    }

   /**
    * Test getRecordedLocationAsLocalDateTime() method.
    */
    @Test
    public void subTestGetRecordedLocationAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getRecordedLocationAsLocalDateTime());
        System.out.println("Location where track was recorded. (See COMPOSITION_LOCATION for format) AS LocalDateTime === " + jMetaDataGeneral.getRecordedLocationAsLocalDateTime());
    }

   /**
    * Test getRecordedLocationAsLocalTime() method.
    */
    @Test
    public void subTestGetRecordedLocationAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getRecordedLocationAsLocalTime());
        System.out.println("Location where track was recorded. (See COMPOSITION_LOCATION for format) AS LocalTime === " + jMetaDataGeneral.getRecordedLocationAsLocalTime());
    }

   /**
    * Test getRecordedLocationAsString() method.
    */
    @Test
    public void subTestGetRecordedLocationAsString() {
        assertEquals(null, this.jMetaDataGeneral.getRecordedLocationAsString());
        System.out.println("Location where track was recorded. (See COMPOSITION_LOCATION for format) AS String === " + jMetaDataGeneral.getRecordedLocationAsString());
    }

   /**
    * Test getRecordedLocationAsBoolean() method.
    */
    @Test
    public void subTestGetRecordedLocationAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getRecordedLocationAsBoolean());
        System.out.println("Location where track was recorded. (See COMPOSITION_LOCATION for format) AS Boolean === " + jMetaDataGeneral.getRecordedLocationAsBoolean());
    }

   /**
    * Test getRecordedLocationAsBigInteger() method.
    */
    @Test
    public void subTestGetRecordedLocationAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getRecordedLocationAsBigInteger());
        System.out.println("Location where track was recorded. (See COMPOSITION_LOCATION for format) AS BigInteger === " + jMetaDataGeneral.getRecordedLocationAsBigInteger());
    }

   /**
    * Test getRecordedLocationAsURL() method.
    */
    @Test
    public void subTestGetRecordedLocationAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getRecordedLocationAsURL());
        System.out.println("Location where track was recorded. (See COMPOSITION_LOCATION for format) AS URL === " + jMetaDataGeneral.getRecordedLocationAsURL());
    }

   /**
    * Test getFileExtensionLastAsInteger() method.
    */
    @Test
    public void subTestGetFileExtensionLastAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFileExtensionLastAsInteger());
        System.out.println("File extension only of the last file (in the case of a sequence of files) AS Integer === " + jMetaDataGeneral.getFileExtensionLastAsInteger());
    }

   /**
    * Test getFileExtensionLastAsLong() method.
    */
    @Test
    public void subTestGetFileExtensionLastAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getFileExtensionLastAsLong());
        System.out.println("File extension only of the last file (in the case of a sequence of files) AS Long === " + jMetaDataGeneral.getFileExtensionLastAsLong());
    }

   /**
    * Test getFileExtensionLastAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFileExtensionLastAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getFileExtensionLastAsLocalDateTime());
        System.out.println("File extension only of the last file (in the case of a sequence of files) AS LocalDateTime === " + jMetaDataGeneral.getFileExtensionLastAsLocalDateTime());
    }

   /**
    * Test getFileExtensionLastAsLocalTime() method.
    */
    @Test
    public void subTestGetFileExtensionLastAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getFileExtensionLastAsLocalTime());
        System.out.println("File extension only of the last file (in the case of a sequence of files) AS LocalTime === " + jMetaDataGeneral.getFileExtensionLastAsLocalTime());
    }

   /**
    * Test getFileExtensionLastAsString() method.
    */
    @Test
    public void subTestGetFileExtensionLastAsString() {
        assertEquals(null, this.jMetaDataGeneral.getFileExtensionLastAsString());
        System.out.println("File extension only of the last file (in the case of a sequence of files) AS String === " + jMetaDataGeneral.getFileExtensionLastAsString());
    }

   /**
    * Test getFileExtensionLastAsBoolean() method.
    */
    @Test
    public void subTestGetFileExtensionLastAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getFileExtensionLastAsBoolean());
        System.out.println("File extension only of the last file (in the case of a sequence of files) AS Boolean === " + jMetaDataGeneral.getFileExtensionLastAsBoolean());
    }

   /**
    * Test getFileExtensionLastAsBigInteger() method.
    */
    @Test
    public void subTestGetFileExtensionLastAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFileExtensionLastAsBigInteger());
        System.out.println("File extension only of the last file (in the case of a sequence of files) AS BigInteger === " + jMetaDataGeneral.getFileExtensionLastAsBigInteger());
    }

   /**
    * Test getFileExtensionLastAsURL() method.
    */
    @Test
    public void subTestGetFileExtensionLastAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getFileExtensionLastAsURL());
        System.out.println("File extension only of the last file (in the case of a sequence of files) AS URL === " + jMetaDataGeneral.getFileExtensionLastAsURL());
    }

   /**
    * Test getPlayedFirstDateAsInteger() method.
    */
    @Test
    public void subTestGetPlayedFirstDateAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getPlayedFirstDateAsInteger());
        System.out.println("The date, the owner first played an item AS Integer === " + jMetaDataGeneral.getPlayedFirstDateAsInteger());
    }

   /**
    * Test getPlayedFirstDateAsLong() method.
    */
    @Test
    public void subTestGetPlayedFirstDateAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getPlayedFirstDateAsLong());
        System.out.println("The date, the owner first played an item AS Long === " + jMetaDataGeneral.getPlayedFirstDateAsLong());
    }

   /**
    * Test getPlayedFirstDateAsLocalDateTime() method.
    */
    @Test
    public void subTestGetPlayedFirstDateAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getPlayedFirstDateAsLocalDateTime());
        System.out.println("The date, the owner first played an item AS LocalDateTime === " + jMetaDataGeneral.getPlayedFirstDateAsLocalDateTime());
    }

   /**
    * Test getPlayedFirstDateAsLocalTime() method.
    */
    @Test
    public void subTestGetPlayedFirstDateAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getPlayedFirstDateAsLocalTime());
        System.out.println("The date, the owner first played an item AS LocalTime === " + jMetaDataGeneral.getPlayedFirstDateAsLocalTime());
    }

   /**
    * Test getPlayedFirstDateAsString() method.
    */
    @Test
    public void subTestGetPlayedFirstDateAsString() {
        assertEquals(null, this.jMetaDataGeneral.getPlayedFirstDateAsString());
        System.out.println("The date, the owner first played an item AS String === " + jMetaDataGeneral.getPlayedFirstDateAsString());
    }

   /**
    * Test getPlayedFirstDateAsBoolean() method.
    */
    @Test
    public void subTestGetPlayedFirstDateAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getPlayedFirstDateAsBoolean());
        System.out.println("The date, the owner first played an item AS Boolean === " + jMetaDataGeneral.getPlayedFirstDateAsBoolean());
    }

   /**
    * Test getPlayedFirstDateAsBigInteger() method.
    */
    @Test
    public void subTestGetPlayedFirstDateAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getPlayedFirstDateAsBigInteger());
        System.out.println("The date, the owner first played an item AS BigInteger === " + jMetaDataGeneral.getPlayedFirstDateAsBigInteger());
    }

   /**
    * Test getPlayedFirstDateAsURL() method.
    */
    @Test
    public void subTestGetPlayedFirstDateAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getPlayedFirstDateAsURL());
        System.out.println("The date, the owner first played an item AS URL === " + jMetaDataGeneral.getPlayedFirstDateAsURL());
    }

   /**
    * Test getFormatUrlAsInteger() method.
    */
    @Test
    public void subTestGetFormatUrlAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFormatUrlAsInteger());
        System.out.println("Link to a description of this format AS Integer === " + jMetaDataGeneral.getFormatUrlAsInteger());
    }

   /**
    * Test getFormatUrlAsLong() method.
    */
    @Test
    public void subTestGetFormatUrlAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getFormatUrlAsLong());
        System.out.println("Link to a description of this format AS Long === " + jMetaDataGeneral.getFormatUrlAsLong());
    }

   /**
    * Test getFormatUrlAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatUrlAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getFormatUrlAsLocalDateTime());
        System.out.println("Link to a description of this format AS LocalDateTime === " + jMetaDataGeneral.getFormatUrlAsLocalDateTime());
    }

   /**
    * Test getFormatUrlAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatUrlAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getFormatUrlAsLocalTime());
        System.out.println("Link to a description of this format AS LocalTime === " + jMetaDataGeneral.getFormatUrlAsLocalTime());
    }

   /**
    * Test getFormatUrlAsString() method.
    */
    @Test
    public void subTestGetFormatUrlAsString() {
        assertEquals(null, this.jMetaDataGeneral.getFormatUrlAsString());
        System.out.println("Link to a description of this format AS String === " + jMetaDataGeneral.getFormatUrlAsString());
    }

   /**
    * Test getFormatUrlAsBoolean() method.
    */
    @Test
    public void subTestGetFormatUrlAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getFormatUrlAsBoolean());
        System.out.println("Link to a description of this format AS Boolean === " + jMetaDataGeneral.getFormatUrlAsBoolean());
    }

   /**
    * Test getFormatUrlAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatUrlAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFormatUrlAsBigInteger());
        System.out.println("Link to a description of this format AS BigInteger === " + jMetaDataGeneral.getFormatUrlAsBigInteger());
    }

   /**
    * Test getFormatUrlAsURL() method.
    */
    @Test
    public void subTestGetFormatUrlAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getFormatUrlAsURL());
        System.out.println("Link to a description of this format AS URL === " + jMetaDataGeneral.getFormatUrlAsURL());
    }

   /**
    * Test getFrameRateStringAsInteger() method.
    */
    @Test
    public void subTestGetFrameRateStringAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFrameRateStringAsInteger());
        System.out.println("Frames per second (with measurement) AS Integer === " + jMetaDataGeneral.getFrameRateStringAsInteger());
    }

   /**
    * Test getFrameRateStringAsLong() method.
    */
    @Test
    public void subTestGetFrameRateStringAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getFrameRateStringAsLong());
        System.out.println("Frames per second (with measurement) AS Long === " + jMetaDataGeneral.getFrameRateStringAsLong());
    }

   /**
    * Test getFrameRateStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFrameRateStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getFrameRateStringAsLocalDateTime());
        System.out.println("Frames per second (with measurement) AS LocalDateTime === " + jMetaDataGeneral.getFrameRateStringAsLocalDateTime());
    }

   /**
    * Test getFrameRateStringAsLocalTime() method.
    */
    @Test
    public void subTestGetFrameRateStringAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getFrameRateStringAsLocalTime());
        System.out.println("Frames per second (with measurement) AS LocalTime === " + jMetaDataGeneral.getFrameRateStringAsLocalTime());
    }

   /**
    * Test getFrameRateStringAsString() method.
    */
    @Test
    public void subTestGetFrameRateStringAsString() {
        assertEquals(null, this.jMetaDataGeneral.getFrameRateStringAsString());
        System.out.println("Frames per second (with measurement) AS String === " + jMetaDataGeneral.getFrameRateStringAsString());
    }

   /**
    * Test getFrameRateStringAsBoolean() method.
    */
    @Test
    public void subTestGetFrameRateStringAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getFrameRateStringAsBoolean());
        System.out.println("Frames per second (with measurement) AS Boolean === " + jMetaDataGeneral.getFrameRateStringAsBoolean());
    }

   /**
    * Test getFrameRateStringAsBigInteger() method.
    */
    @Test
    public void subTestGetFrameRateStringAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFrameRateStringAsBigInteger());
        System.out.println("Frames per second (with measurement) AS BigInteger === " + jMetaDataGeneral.getFrameRateStringAsBigInteger());
    }

   /**
    * Test getFrameRateStringAsURL() method.
    */
    @Test
    public void subTestGetFrameRateStringAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getFrameRateStringAsURL());
        System.out.println("Frames per second (with measurement) AS URL === " + jMetaDataGeneral.getFrameRateStringAsURL());
    }

   /**
    * Test getAlbumPerformerSortAsInteger() method.
    */
    @Test
    public void subTestGetAlbumPerformerSortAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumPerformerSortAsInteger());
        System.out.println("Album/Performer/Sort AS Integer === " + jMetaDataGeneral.getAlbumPerformerSortAsInteger());
    }

   /**
    * Test getAlbumPerformerSortAsLong() method.
    */
    @Test
    public void subTestGetAlbumPerformerSortAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumPerformerSortAsLong());
        System.out.println("Album/Performer/Sort AS Long === " + jMetaDataGeneral.getAlbumPerformerSortAsLong());
    }

   /**
    * Test getAlbumPerformerSortAsLocalDateTime() method.
    */
    @Test
    public void subTestGetAlbumPerformerSortAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumPerformerSortAsLocalDateTime());
        System.out.println("Album/Performer/Sort AS LocalDateTime === " + jMetaDataGeneral.getAlbumPerformerSortAsLocalDateTime());
    }

   /**
    * Test getAlbumPerformerSortAsLocalTime() method.
    */
    @Test
    public void subTestGetAlbumPerformerSortAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumPerformerSortAsLocalTime());
        System.out.println("Album/Performer/Sort AS LocalTime === " + jMetaDataGeneral.getAlbumPerformerSortAsLocalTime());
    }

   /**
    * Test getAlbumPerformerSortAsString() method.
    */
    @Test
    public void subTestGetAlbumPerformerSortAsString() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumPerformerSortAsString());
        System.out.println("Album/Performer/Sort AS String === " + jMetaDataGeneral.getAlbumPerformerSortAsString());
    }

   /**
    * Test getAlbumPerformerSortAsBoolean() method.
    */
    @Test
    public void subTestGetAlbumPerformerSortAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumPerformerSortAsBoolean());
        System.out.println("Album/Performer/Sort AS Boolean === " + jMetaDataGeneral.getAlbumPerformerSortAsBoolean());
    }

   /**
    * Test getAlbumPerformerSortAsBigInteger() method.
    */
    @Test
    public void subTestGetAlbumPerformerSortAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumPerformerSortAsBigInteger());
        System.out.println("Album/Performer/Sort AS BigInteger === " + jMetaDataGeneral.getAlbumPerformerSortAsBigInteger());
    }

   /**
    * Test getAlbumPerformerSortAsURL() method.
    */
    @Test
    public void subTestGetAlbumPerformerSortAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumPerformerSortAsURL());
        System.out.println("Album/Performer/Sort AS URL === " + jMetaDataGeneral.getAlbumPerformerSortAsURL());
    }

   /**
    * Test getMovieAsInteger() method.
    */
    @Test
    public void subTestGetMovieAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getMovieAsInteger());
        System.out.println("Name of the movie. Eg : Starwars, a new hope AS Integer === " + jMetaDataGeneral.getMovieAsInteger());
    }

   /**
    * Test getMovieAsLong() method.
    */
    @Test
    public void subTestGetMovieAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getMovieAsLong());
        System.out.println("Name of the movie. Eg : Starwars, a new hope AS Long === " + jMetaDataGeneral.getMovieAsLong());
    }

   /**
    * Test getMovieAsLocalDateTime() method.
    */
    @Test
    public void subTestGetMovieAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getMovieAsLocalDateTime());
        System.out.println("Name of the movie. Eg : Starwars, a new hope AS LocalDateTime === " + jMetaDataGeneral.getMovieAsLocalDateTime());
    }

   /**
    * Test getMovieAsLocalTime() method.
    */
    @Test
    public void subTestGetMovieAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getMovieAsLocalTime());
        System.out.println("Name of the movie. Eg : Starwars, a new hope AS LocalTime === " + jMetaDataGeneral.getMovieAsLocalTime());
    }

   /**
    * Test getMovieAsString() method.
    */
    @Test
    public void subTestGetMovieAsString() {
        assertEquals(null, this.jMetaDataGeneral.getMovieAsString());
        System.out.println("Name of the movie. Eg : Starwars, a new hope AS String === " + jMetaDataGeneral.getMovieAsString());
    }

   /**
    * Test getMovieAsBoolean() method.
    */
    @Test
    public void subTestGetMovieAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getMovieAsBoolean());
        System.out.println("Name of the movie. Eg : Starwars, a new hope AS Boolean === " + jMetaDataGeneral.getMovieAsBoolean());
    }

   /**
    * Test getMovieAsBigInteger() method.
    */
    @Test
    public void subTestGetMovieAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getMovieAsBigInteger());
        System.out.println("Name of the movie. Eg : Starwars, a new hope AS BigInteger === " + jMetaDataGeneral.getMovieAsBigInteger());
    }

   /**
    * Test getMovieAsURL() method.
    */
    @Test
    public void subTestGetMovieAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getMovieAsURL());
        System.out.println("Name of the movie. Eg : Starwars, a new hope AS URL === " + jMetaDataGeneral.getMovieAsURL());
    }

   /**
    * Test getComposerAsInteger() method.
    */
    @Test
    public void subTestGetComposerAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getComposerAsInteger());
        System.out.println("Name of the original composer. AS Integer === " + jMetaDataGeneral.getComposerAsInteger());
    }

   /**
    * Test getComposerAsLong() method.
    */
    @Test
    public void subTestGetComposerAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getComposerAsLong());
        System.out.println("Name of the original composer. AS Long === " + jMetaDataGeneral.getComposerAsLong());
    }

   /**
    * Test getComposerAsLocalDateTime() method.
    */
    @Test
    public void subTestGetComposerAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getComposerAsLocalDateTime());
        System.out.println("Name of the original composer. AS LocalDateTime === " + jMetaDataGeneral.getComposerAsLocalDateTime());
    }

   /**
    * Test getComposerAsLocalTime() method.
    */
    @Test
    public void subTestGetComposerAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getComposerAsLocalTime());
        System.out.println("Name of the original composer. AS LocalTime === " + jMetaDataGeneral.getComposerAsLocalTime());
    }

   /**
    * Test getComposerAsString() method.
    */
    @Test
    public void subTestGetComposerAsString() {
        assertEquals(null, this.jMetaDataGeneral.getComposerAsString());
        System.out.println("Name of the original composer. AS String === " + jMetaDataGeneral.getComposerAsString());
    }

   /**
    * Test getComposerAsBoolean() method.
    */
    @Test
    public void subTestGetComposerAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getComposerAsBoolean());
        System.out.println("Name of the original composer. AS Boolean === " + jMetaDataGeneral.getComposerAsBoolean());
    }

   /**
    * Test getComposerAsBigInteger() method.
    */
    @Test
    public void subTestGetComposerAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getComposerAsBigInteger());
        System.out.println("Name of the original composer. AS BigInteger === " + jMetaDataGeneral.getComposerAsBigInteger());
    }

   /**
    * Test getComposerAsURL() method.
    */
    @Test
    public void subTestGetComposerAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getComposerAsURL());
        System.out.println("Name of the original composer. AS URL === " + jMetaDataGeneral.getComposerAsURL());
    }

   /**
    * Test getOriginalSourceFormCroppedAsInteger() method.
    */
    @Test
    public void subTestGetOriginalSourceFormCroppedAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormCroppedAsInteger());
        System.out.println("Describes whether an image has been cropped and, if so, how it was cropped. e.g. 16:9 to 4:3, top and bottom AS Integer === " + jMetaDataGeneral.getOriginalSourceFormCroppedAsInteger());
    }

   /**
    * Test getOriginalSourceFormCroppedAsLong() method.
    */
    @Test
    public void subTestGetOriginalSourceFormCroppedAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormCroppedAsLong());
        System.out.println("Describes whether an image has been cropped and, if so, how it was cropped. e.g. 16:9 to 4:3, top and bottom AS Long === " + jMetaDataGeneral.getOriginalSourceFormCroppedAsLong());
    }

   /**
    * Test getOriginalSourceFormCroppedAsLocalDateTime() method.
    */
    @Test
    public void subTestGetOriginalSourceFormCroppedAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormCroppedAsLocalDateTime());
        System.out.println("Describes whether an image has been cropped and, if so, how it was cropped. e.g. 16:9 to 4:3, top and bottom AS LocalDateTime === " + jMetaDataGeneral.getOriginalSourceFormCroppedAsLocalDateTime());
    }

   /**
    * Test getOriginalSourceFormCroppedAsLocalTime() method.
    */
    @Test
    public void subTestGetOriginalSourceFormCroppedAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormCroppedAsLocalTime());
        System.out.println("Describes whether an image has been cropped and, if so, how it was cropped. e.g. 16:9 to 4:3, top and bottom AS LocalTime === " + jMetaDataGeneral.getOriginalSourceFormCroppedAsLocalTime());
    }

   /**
    * Test getOriginalSourceFormCroppedAsString() method.
    */
    @Test
    public void subTestGetOriginalSourceFormCroppedAsString() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormCroppedAsString());
        System.out.println("Describes whether an image has been cropped and, if so, how it was cropped. e.g. 16:9 to 4:3, top and bottom AS String === " + jMetaDataGeneral.getOriginalSourceFormCroppedAsString());
    }

   /**
    * Test getOriginalSourceFormCroppedAsBoolean() method.
    */
    @Test
    public void subTestGetOriginalSourceFormCroppedAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormCroppedAsBoolean());
        System.out.println("Describes whether an image has been cropped and, if so, how it was cropped. e.g. 16:9 to 4:3, top and bottom AS Boolean === " + jMetaDataGeneral.getOriginalSourceFormCroppedAsBoolean());
    }

   /**
    * Test getOriginalSourceFormCroppedAsBigInteger() method.
    */
    @Test
    public void subTestGetOriginalSourceFormCroppedAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormCroppedAsBigInteger());
        System.out.println("Describes whether an image has been cropped and, if so, how it was cropped. e.g. 16:9 to 4:3, top and bottom AS BigInteger === " + jMetaDataGeneral.getOriginalSourceFormCroppedAsBigInteger());
    }

   /**
    * Test getOriginalSourceFormCroppedAsURL() method.
    */
    @Test
    public void subTestGetOriginalSourceFormCroppedAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormCroppedAsURL());
        System.out.println("Describes whether an image has been cropped and, if so, how it was cropped. e.g. 16:9 to 4:3, top and bottom AS URL === " + jMetaDataGeneral.getOriginalSourceFormCroppedAsURL());
    }

   /**
    * Test getTrackSortAsInteger() method.
    */
    @Test
    public void subTestGetTrackSortAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getTrackSortAsInteger());
        System.out.println("Track/Sort AS Integer === " + jMetaDataGeneral.getTrackSortAsInteger());
    }

   /**
    * Test getTrackSortAsLong() method.
    */
    @Test
    public void subTestGetTrackSortAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getTrackSortAsLong());
        System.out.println("Track/Sort AS Long === " + jMetaDataGeneral.getTrackSortAsLong());
    }

   /**
    * Test getTrackSortAsLocalDateTime() method.
    */
    @Test
    public void subTestGetTrackSortAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getTrackSortAsLocalDateTime());
        System.out.println("Track/Sort AS LocalDateTime === " + jMetaDataGeneral.getTrackSortAsLocalDateTime());
    }

   /**
    * Test getTrackSortAsLocalTime() method.
    */
    @Test
    public void subTestGetTrackSortAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getTrackSortAsLocalTime());
        System.out.println("Track/Sort AS LocalTime === " + jMetaDataGeneral.getTrackSortAsLocalTime());
    }

   /**
    * Test getTrackSortAsString() method.
    */
    @Test
    public void subTestGetTrackSortAsString() {
        assertEquals(null, this.jMetaDataGeneral.getTrackSortAsString());
        System.out.println("Track/Sort AS String === " + jMetaDataGeneral.getTrackSortAsString());
    }

   /**
    * Test getTrackSortAsBoolean() method.
    */
    @Test
    public void subTestGetTrackSortAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getTrackSortAsBoolean());
        System.out.println("Track/Sort AS Boolean === " + jMetaDataGeneral.getTrackSortAsBoolean());
    }

   /**
    * Test getTrackSortAsBigInteger() method.
    */
    @Test
    public void subTestGetTrackSortAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getTrackSortAsBigInteger());
        System.out.println("Track/Sort AS BigInteger === " + jMetaDataGeneral.getTrackSortAsBigInteger());
    }

   /**
    * Test getTrackSortAsURL() method.
    */
    @Test
    public void subTestGetTrackSortAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getTrackSortAsURL());
        System.out.println("Track/Sort AS URL === " + jMetaDataGeneral.getTrackSortAsURL());
    }

   /**
    * Test getProductionStudioAsInteger() method.
    */
    @Test
    public void subTestGetProductionStudioAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getProductionStudioAsInteger());
        System.out.println("Main production studio  AS Integer === " + jMetaDataGeneral.getProductionStudioAsInteger());
    }

   /**
    * Test getProductionStudioAsLong() method.
    */
    @Test
    public void subTestGetProductionStudioAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getProductionStudioAsLong());
        System.out.println("Main production studio  AS Long === " + jMetaDataGeneral.getProductionStudioAsLong());
    }

   /**
    * Test getProductionStudioAsLocalDateTime() method.
    */
    @Test
    public void subTestGetProductionStudioAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getProductionStudioAsLocalDateTime());
        System.out.println("Main production studio  AS LocalDateTime === " + jMetaDataGeneral.getProductionStudioAsLocalDateTime());
    }

   /**
    * Test getProductionStudioAsLocalTime() method.
    */
    @Test
    public void subTestGetProductionStudioAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getProductionStudioAsLocalTime());
        System.out.println("Main production studio  AS LocalTime === " + jMetaDataGeneral.getProductionStudioAsLocalTime());
    }

   /**
    * Test getProductionStudioAsString() method.
    */
    @Test
    public void subTestGetProductionStudioAsString() {
        assertEquals(null, this.jMetaDataGeneral.getProductionStudioAsString());
        System.out.println("Main production studio  AS String === " + jMetaDataGeneral.getProductionStudioAsString());
    }

   /**
    * Test getProductionStudioAsBoolean() method.
    */
    @Test
    public void subTestGetProductionStudioAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getProductionStudioAsBoolean());
        System.out.println("Main production studio  AS Boolean === " + jMetaDataGeneral.getProductionStudioAsBoolean());
    }

   /**
    * Test getProductionStudioAsBigInteger() method.
    */
    @Test
    public void subTestGetProductionStudioAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getProductionStudioAsBigInteger());
        System.out.println("Main production studio  AS BigInteger === " + jMetaDataGeneral.getProductionStudioAsBigInteger());
    }

   /**
    * Test getProductionStudioAsURL() method.
    */
    @Test
    public void subTestGetProductionStudioAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getProductionStudioAsURL());
        System.out.println("Main production studio  AS URL === " + jMetaDataGeneral.getProductionStudioAsURL());
    }

   /**
    * Test getAudioCountAsInteger() method.
    */
    @Test
    public void subTestGetAudioCountAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getAudioCountAsInteger());
        System.out.println("Number of audio streams AS Integer === " + jMetaDataGeneral.getAudioCountAsInteger());
    }

   /**
    * Test getAudioCountAsLong() method.
    */
    @Test
    public void subTestGetAudioCountAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getAudioCountAsLong());
        System.out.println("Number of audio streams AS Long === " + jMetaDataGeneral.getAudioCountAsLong());
    }

   /**
    * Test getAudioCountAsLocalDateTime() method.
    */
    @Test
    public void subTestGetAudioCountAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getAudioCountAsLocalDateTime());
        System.out.println("Number of audio streams AS LocalDateTime === " + jMetaDataGeneral.getAudioCountAsLocalDateTime());
    }

   /**
    * Test getAudioCountAsLocalTime() method.
    */
    @Test
    public void subTestGetAudioCountAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getAudioCountAsLocalTime());
        System.out.println("Number of audio streams AS LocalTime === " + jMetaDataGeneral.getAudioCountAsLocalTime());
    }

   /**
    * Test getAudioCountAsString() method.
    */
    @Test
    public void subTestGetAudioCountAsString() {
        assertEquals(null, this.jMetaDataGeneral.getAudioCountAsString());
        System.out.println("Number of audio streams AS String === " + jMetaDataGeneral.getAudioCountAsString());
    }

   /**
    * Test getAudioCountAsBoolean() method.
    */
    @Test
    public void subTestGetAudioCountAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getAudioCountAsBoolean());
        System.out.println("Number of audio streams AS Boolean === " + jMetaDataGeneral.getAudioCountAsBoolean());
    }

   /**
    * Test getAudioCountAsBigInteger() method.
    */
    @Test
    public void subTestGetAudioCountAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getAudioCountAsBigInteger());
        System.out.println("Number of audio streams AS BigInteger === " + jMetaDataGeneral.getAudioCountAsBigInteger());
    }

   /**
    * Test getAudioCountAsURL() method.
    */
    @Test
    public void subTestGetAudioCountAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getAudioCountAsURL());
        System.out.println("Number of audio streams AS URL === " + jMetaDataGeneral.getAudioCountAsURL());
    }

   /**
    * Test getChapterAsInteger() method.
    */
    @Test
    public void subTestGetChapterAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getChapterAsInteger());
        System.out.println("Name of the chapter. AS Integer === " + jMetaDataGeneral.getChapterAsInteger());
    }

   /**
    * Test getChapterAsLong() method.
    */
    @Test
    public void subTestGetChapterAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getChapterAsLong());
        System.out.println("Name of the chapter. AS Long === " + jMetaDataGeneral.getChapterAsLong());
    }

   /**
    * Test getChapterAsLocalDateTime() method.
    */
    @Test
    public void subTestGetChapterAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getChapterAsLocalDateTime());
        System.out.println("Name of the chapter. AS LocalDateTime === " + jMetaDataGeneral.getChapterAsLocalDateTime());
    }

   /**
    * Test getChapterAsLocalTime() method.
    */
    @Test
    public void subTestGetChapterAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getChapterAsLocalTime());
        System.out.println("Name of the chapter. AS LocalTime === " + jMetaDataGeneral.getChapterAsLocalTime());
    }

   /**
    * Test getChapterAsString() method.
    */
    @Test
    public void subTestGetChapterAsString() {
        assertEquals(null, this.jMetaDataGeneral.getChapterAsString());
        System.out.println("Name of the chapter. AS String === " + jMetaDataGeneral.getChapterAsString());
    }

   /**
    * Test getChapterAsBoolean() method.
    */
    @Test
    public void subTestGetChapterAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getChapterAsBoolean());
        System.out.println("Name of the chapter. AS Boolean === " + jMetaDataGeneral.getChapterAsBoolean());
    }

   /**
    * Test getChapterAsBigInteger() method.
    */
    @Test
    public void subTestGetChapterAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getChapterAsBigInteger());
        System.out.println("Name of the chapter. AS BigInteger === " + jMetaDataGeneral.getChapterAsBigInteger());
    }

   /**
    * Test getChapterAsURL() method.
    */
    @Test
    public void subTestGetChapterAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getChapterAsURL());
        System.out.println("Name of the chapter. AS URL === " + jMetaDataGeneral.getChapterAsURL());
    }

   /**
    * Test getSynopsisAsInteger() method.
    */
    @Test
    public void subTestGetSynopsisAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getSynopsisAsInteger());
        System.out.println("A description of the story line of the item. AS Integer === " + jMetaDataGeneral.getSynopsisAsInteger());
    }

   /**
    * Test getSynopsisAsLong() method.
    */
    @Test
    public void subTestGetSynopsisAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getSynopsisAsLong());
        System.out.println("A description of the story line of the item. AS Long === " + jMetaDataGeneral.getSynopsisAsLong());
    }

   /**
    * Test getSynopsisAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSynopsisAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getSynopsisAsLocalDateTime());
        System.out.println("A description of the story line of the item. AS LocalDateTime === " + jMetaDataGeneral.getSynopsisAsLocalDateTime());
    }

   /**
    * Test getSynopsisAsLocalTime() method.
    */
    @Test
    public void subTestGetSynopsisAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getSynopsisAsLocalTime());
        System.out.println("A description of the story line of the item. AS LocalTime === " + jMetaDataGeneral.getSynopsisAsLocalTime());
    }

   /**
    * Test getSynopsisAsString() method.
    */
    @Test
    public void subTestGetSynopsisAsString() {
        assertEquals(null, this.jMetaDataGeneral.getSynopsisAsString());
        System.out.println("A description of the story line of the item. AS String === " + jMetaDataGeneral.getSynopsisAsString());
    }

   /**
    * Test getSynopsisAsBoolean() method.
    */
    @Test
    public void subTestGetSynopsisAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getSynopsisAsBoolean());
        System.out.println("A description of the story line of the item. AS Boolean === " + jMetaDataGeneral.getSynopsisAsBoolean());
    }

   /**
    * Test getSynopsisAsBigInteger() method.
    */
    @Test
    public void subTestGetSynopsisAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getSynopsisAsBigInteger());
        System.out.println("A description of the story line of the item. AS BigInteger === " + jMetaDataGeneral.getSynopsisAsBigInteger());
    }

   /**
    * Test getSynopsisAsURL() method.
    */
    @Test
    public void subTestGetSynopsisAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getSynopsisAsURL());
        System.out.println("A description of the story line of the item. AS URL === " + jMetaDataGeneral.getSynopsisAsURL());
    }

   /**
    * Test getEncodedApplicationNameAsInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationNameAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationNameAsInteger());
        System.out.println("Name of the product AS Integer === " + jMetaDataGeneral.getEncodedApplicationNameAsInteger());
    }

   /**
    * Test getEncodedApplicationNameAsLong() method.
    */
    @Test
    public void subTestGetEncodedApplicationNameAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationNameAsLong());
        System.out.println("Name of the product AS Long === " + jMetaDataGeneral.getEncodedApplicationNameAsLong());
    }

   /**
    * Test getEncodedApplicationNameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationNameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationNameAsLocalDateTime());
        System.out.println("Name of the product AS LocalDateTime === " + jMetaDataGeneral.getEncodedApplicationNameAsLocalDateTime());
    }

   /**
    * Test getEncodedApplicationNameAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationNameAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationNameAsLocalTime());
        System.out.println("Name of the product AS LocalTime === " + jMetaDataGeneral.getEncodedApplicationNameAsLocalTime());
    }

   /**
    * Test getEncodedApplicationNameAsString() method.
    */
    @Test
    public void subTestGetEncodedApplicationNameAsString() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationNameAsString());
        System.out.println("Name of the product AS String === " + jMetaDataGeneral.getEncodedApplicationNameAsString());
    }

   /**
    * Test getEncodedApplicationNameAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedApplicationNameAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationNameAsBoolean());
        System.out.println("Name of the product AS Boolean === " + jMetaDataGeneral.getEncodedApplicationNameAsBoolean());
    }

   /**
    * Test getEncodedApplicationNameAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationNameAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationNameAsBigInteger());
        System.out.println("Name of the product AS BigInteger === " + jMetaDataGeneral.getEncodedApplicationNameAsBigInteger());
    }

   /**
    * Test getEncodedApplicationNameAsURL() method.
    */
    @Test
    public void subTestGetEncodedApplicationNameAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationNameAsURL());
        System.out.println("Name of the product AS URL === " + jMetaDataGeneral.getEncodedApplicationNameAsURL());
    }

   /**
    * Test getUniqueIDStringAsInteger() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getUniqueIDStringAsInteger());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS Integer === " + jMetaDataGeneral.getUniqueIDStringAsInteger());
    }

   /**
    * Test getUniqueIDStringAsLong() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getUniqueIDStringAsLong());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS Long === " + jMetaDataGeneral.getUniqueIDStringAsLong());
    }

   /**
    * Test getUniqueIDStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getUniqueIDStringAsLocalDateTime());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS LocalDateTime === " + jMetaDataGeneral.getUniqueIDStringAsLocalDateTime());
    }

   /**
    * Test getUniqueIDStringAsLocalTime() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getUniqueIDStringAsLocalTime());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS LocalTime === " + jMetaDataGeneral.getUniqueIDStringAsLocalTime());
    }

   /**
    * Test getUniqueIDStringAsString() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsString() {
        assertEquals(null, this.jMetaDataGeneral.getUniqueIDStringAsString());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS String === " + jMetaDataGeneral.getUniqueIDStringAsString());
    }

   /**
    * Test getUniqueIDStringAsBoolean() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getUniqueIDStringAsBoolean());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS Boolean === " + jMetaDataGeneral.getUniqueIDStringAsBoolean());
    }

   /**
    * Test getUniqueIDStringAsBigInteger() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getUniqueIDStringAsBigInteger());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS BigInteger === " + jMetaDataGeneral.getUniqueIDStringAsBigInteger());
    }

   /**
    * Test getUniqueIDStringAsURL() method.
    */
    @Test
    public void subTestGetUniqueIDStringAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getUniqueIDStringAsURL());
        System.out.println("The unique ID for this stream, should be copied with stream copy AS URL === " + jMetaDataGeneral.getUniqueIDStringAsURL());
    }

   /**
    * Test getGenreAsInteger() method.
    */
    @Test
    public void subTestGetGenreAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getGenreAsInteger());
        System.out.println("The main genre of the audio or video. e.g. classical, ambient-house, synthpop, sci-fi, drama, etc. AS Integer === " + jMetaDataGeneral.getGenreAsInteger());
    }

   /**
    * Test getGenreAsLong() method.
    */
    @Test
    public void subTestGetGenreAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getGenreAsLong());
        System.out.println("The main genre of the audio or video. e.g. classical, ambient-house, synthpop, sci-fi, drama, etc. AS Long === " + jMetaDataGeneral.getGenreAsLong());
    }

   /**
    * Test getGenreAsLocalDateTime() method.
    */
    @Test
    public void subTestGetGenreAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getGenreAsLocalDateTime());
        System.out.println("The main genre of the audio or video. e.g. classical, ambient-house, synthpop, sci-fi, drama, etc. AS LocalDateTime === " + jMetaDataGeneral.getGenreAsLocalDateTime());
    }

   /**
    * Test getGenreAsLocalTime() method.
    */
    @Test
    public void subTestGetGenreAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getGenreAsLocalTime());
        System.out.println("The main genre of the audio or video. e.g. classical, ambient-house, synthpop, sci-fi, drama, etc. AS LocalTime === " + jMetaDataGeneral.getGenreAsLocalTime());
    }

   /**
    * Test getGenreAsString() method.
    */
    @Test
    public void subTestGetGenreAsString() {
        assertEquals(null, this.jMetaDataGeneral.getGenreAsString());
        System.out.println("The main genre of the audio or video. e.g. classical, ambient-house, synthpop, sci-fi, drama, etc. AS String === " + jMetaDataGeneral.getGenreAsString());
    }

   /**
    * Test getGenreAsBoolean() method.
    */
    @Test
    public void subTestGetGenreAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getGenreAsBoolean());
        System.out.println("The main genre of the audio or video. e.g. classical, ambient-house, synthpop, sci-fi, drama, etc. AS Boolean === " + jMetaDataGeneral.getGenreAsBoolean());
    }

   /**
    * Test getGenreAsBigInteger() method.
    */
    @Test
    public void subTestGetGenreAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getGenreAsBigInteger());
        System.out.println("The main genre of the audio or video. e.g. classical, ambient-house, synthpop, sci-fi, drama, etc. AS BigInteger === " + jMetaDataGeneral.getGenreAsBigInteger());
    }

   /**
    * Test getGenreAsURL() method.
    */
    @Test
    public void subTestGetGenreAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getGenreAsURL());
        System.out.println("The main genre of the audio or video. e.g. classical, ambient-house, synthpop, sci-fi, drama, etc. AS URL === " + jMetaDataGeneral.getGenreAsURL());
    }

   /**
    * Test getMasteredDateAsInteger() method.
    */
    @Test
    public void subTestGetMasteredDateAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getMasteredDateAsInteger());
        System.out.println("The time/date/year that the item was tranfered to a digitalmedium. AS Integer === " + jMetaDataGeneral.getMasteredDateAsInteger());
    }

   /**
    * Test getMasteredDateAsLong() method.
    */
    @Test
    public void subTestGetMasteredDateAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getMasteredDateAsLong());
        System.out.println("The time/date/year that the item was tranfered to a digitalmedium. AS Long === " + jMetaDataGeneral.getMasteredDateAsLong());
    }

   /**
    * Test getMasteredDateAsLocalDateTime() method.
    */
    @Test
    public void subTestGetMasteredDateAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getMasteredDateAsLocalDateTime());
        System.out.println("The time/date/year that the item was tranfered to a digitalmedium. AS LocalDateTime === " + jMetaDataGeneral.getMasteredDateAsLocalDateTime());
    }

   /**
    * Test getMasteredDateAsLocalTime() method.
    */
    @Test
    public void subTestGetMasteredDateAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getMasteredDateAsLocalTime());
        System.out.println("The time/date/year that the item was tranfered to a digitalmedium. AS LocalTime === " + jMetaDataGeneral.getMasteredDateAsLocalTime());
    }

   /**
    * Test getMasteredDateAsString() method.
    */
    @Test
    public void subTestGetMasteredDateAsString() {
        assertEquals(null, this.jMetaDataGeneral.getMasteredDateAsString());
        System.out.println("The time/date/year that the item was tranfered to a digitalmedium. AS String === " + jMetaDataGeneral.getMasteredDateAsString());
    }

   /**
    * Test getMasteredDateAsBoolean() method.
    */
    @Test
    public void subTestGetMasteredDateAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getMasteredDateAsBoolean());
        System.out.println("The time/date/year that the item was tranfered to a digitalmedium. AS Boolean === " + jMetaDataGeneral.getMasteredDateAsBoolean());
    }

   /**
    * Test getMasteredDateAsBigInteger() method.
    */
    @Test
    public void subTestGetMasteredDateAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getMasteredDateAsBigInteger());
        System.out.println("The time/date/year that the item was tranfered to a digitalmedium. AS BigInteger === " + jMetaDataGeneral.getMasteredDateAsBigInteger());
    }

   /**
    * Test getMasteredDateAsURL() method.
    */
    @Test
    public void subTestGetMasteredDateAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getMasteredDateAsURL());
        System.out.println("The time/date/year that the item was tranfered to a digitalmedium. AS URL === " + jMetaDataGeneral.getMasteredDateAsURL());
    }

   /**
    * Test getFormatProfileAsInteger() method.
    */
    @Test
    public void subTestGetFormatProfileAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFormatProfileAsInteger());
        System.out.println("Profile of the Format (old XML: 'Profile@Level' format AS Integer === " + jMetaDataGeneral.getFormatProfileAsInteger());
    }

   /**
    * Test getFormatProfileAsLong() method.
    */
    @Test
    public void subTestGetFormatProfileAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getFormatProfileAsLong());
        System.out.println("Profile of the Format (old XML: 'Profile@Level' format AS Long === " + jMetaDataGeneral.getFormatProfileAsLong());
    }

   /**
    * Test getFormatProfileAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatProfileAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getFormatProfileAsLocalDateTime());
        System.out.println("Profile of the Format (old XML: 'Profile@Level' format AS LocalDateTime === " + jMetaDataGeneral.getFormatProfileAsLocalDateTime());
    }

   /**
    * Test getFormatProfileAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatProfileAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getFormatProfileAsLocalTime());
        System.out.println("Profile of the Format (old XML: 'Profile@Level' format AS LocalTime === " + jMetaDataGeneral.getFormatProfileAsLocalTime());
    }

   /**
    * Test getFormatProfileAsString() method.
    */
    @Test
    public void subTestGetFormatProfileAsString() {
        assertEquals(null, this.jMetaDataGeneral.getFormatProfileAsString());
        System.out.println("Profile of the Format (old XML: 'Profile@Level' format AS String === " + jMetaDataGeneral.getFormatProfileAsString());
    }

   /**
    * Test getFormatProfileAsBoolean() method.
    */
    @Test
    public void subTestGetFormatProfileAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getFormatProfileAsBoolean());
        System.out.println("Profile of the Format (old XML: 'Profile@Level' format AS Boolean === " + jMetaDataGeneral.getFormatProfileAsBoolean());
    }

   /**
    * Test getFormatProfileAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatProfileAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFormatProfileAsBigInteger());
        System.out.println("Profile of the Format (old XML: 'Profile@Level' format AS BigInteger === " + jMetaDataGeneral.getFormatProfileAsBigInteger());
    }

   /**
    * Test getFormatProfileAsURL() method.
    */
    @Test
    public void subTestGetFormatProfileAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getFormatProfileAsURL());
        System.out.println("Profile of the Format (old XML: 'Profile@Level' format AS URL === " + jMetaDataGeneral.getFormatProfileAsURL());
    }

   /**
    * Test getStreamSizeDemuxedString1AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedString1AsInteger());
        System.out.println("StreamSize_Demuxed/String1 AS Integer === " + jMetaDataGeneral.getStreamSizeDemuxedString1AsInteger());
    }

   /**
    * Test getStreamSizeDemuxedString1AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsLong() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedString1AsLong());
        System.out.println("StreamSize_Demuxed/String1 AS Long === " + jMetaDataGeneral.getStreamSizeDemuxedString1AsLong());
    }

   /**
    * Test getStreamSizeDemuxedString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedString1AsLocalDateTime());
        System.out.println("StreamSize_Demuxed/String1 AS LocalDateTime === " + jMetaDataGeneral.getStreamSizeDemuxedString1AsLocalDateTime());
    }

   /**
    * Test getStreamSizeDemuxedString1AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedString1AsLocalTime());
        System.out.println("StreamSize_Demuxed/String1 AS LocalTime === " + jMetaDataGeneral.getStreamSizeDemuxedString1AsLocalTime());
    }

   /**
    * Test getStreamSizeDemuxedString1AsString() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsString() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedString1AsString());
        System.out.println("StreamSize_Demuxed/String1 AS String === " + jMetaDataGeneral.getStreamSizeDemuxedString1AsString());
    }

   /**
    * Test getStreamSizeDemuxedString1AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedString1AsBoolean());
        System.out.println("StreamSize_Demuxed/String1 AS Boolean === " + jMetaDataGeneral.getStreamSizeDemuxedString1AsBoolean());
    }

   /**
    * Test getStreamSizeDemuxedString1AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedString1AsBigInteger());
        System.out.println("StreamSize_Demuxed/String1 AS BigInteger === " + jMetaDataGeneral.getStreamSizeDemuxedString1AsBigInteger());
    }

   /**
    * Test getStreamSizeDemuxedString1AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString1AsURL() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedString1AsURL());
        System.out.println("StreamSize_Demuxed/String1 AS URL === " + jMetaDataGeneral.getStreamSizeDemuxedString1AsURL());
    }

   /**
    * Test getEPGPositionsEndAsInteger() method.
    */
    @Test
    public void subTestGetEPGPositionsEndAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEPGPositionsEndAsInteger());
        System.out.println("EPG_Positions_End AS Integer === " + jMetaDataGeneral.getEPGPositionsEndAsInteger());
    }

   /**
    * Test getEPGPositionsEndAsLong() method.
    */
    @Test
    public void subTestGetEPGPositionsEndAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getEPGPositionsEndAsLong());
        System.out.println("EPG_Positions_End AS Long === " + jMetaDataGeneral.getEPGPositionsEndAsLong());
    }

   /**
    * Test getEPGPositionsEndAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEPGPositionsEndAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getEPGPositionsEndAsLocalDateTime());
        System.out.println("EPG_Positions_End AS LocalDateTime === " + jMetaDataGeneral.getEPGPositionsEndAsLocalDateTime());
    }

   /**
    * Test getEPGPositionsEndAsLocalTime() method.
    */
    @Test
    public void subTestGetEPGPositionsEndAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getEPGPositionsEndAsLocalTime());
        System.out.println("EPG_Positions_End AS LocalTime === " + jMetaDataGeneral.getEPGPositionsEndAsLocalTime());
    }

   /**
    * Test getEPGPositionsEndAsString() method.
    */
    @Test
    public void subTestGetEPGPositionsEndAsString() {
        assertEquals(null, this.jMetaDataGeneral.getEPGPositionsEndAsString());
        System.out.println("EPG_Positions_End AS String === " + jMetaDataGeneral.getEPGPositionsEndAsString());
    }

   /**
    * Test getEPGPositionsEndAsBoolean() method.
    */
    @Test
    public void subTestGetEPGPositionsEndAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getEPGPositionsEndAsBoolean());
        System.out.println("EPG_Positions_End AS Boolean === " + jMetaDataGeneral.getEPGPositionsEndAsBoolean());
    }

   /**
    * Test getEPGPositionsEndAsBigInteger() method.
    */
    @Test
    public void subTestGetEPGPositionsEndAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEPGPositionsEndAsBigInteger());
        System.out.println("EPG_Positions_End AS BigInteger === " + jMetaDataGeneral.getEPGPositionsEndAsBigInteger());
    }

   /**
    * Test getEPGPositionsEndAsURL() method.
    */
    @Test
    public void subTestGetEPGPositionsEndAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getEPGPositionsEndAsURL());
        System.out.println("EPG_Positions_End AS URL === " + jMetaDataGeneral.getEPGPositionsEndAsURL());
    }

   /**
    * Test getStreamSizeDemuxedString2AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedString2AsInteger());
        System.out.println("StreamSize_Demuxed/String2 AS Integer === " + jMetaDataGeneral.getStreamSizeDemuxedString2AsInteger());
    }

   /**
    * Test getStreamSizeDemuxedString2AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsLong() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedString2AsLong());
        System.out.println("StreamSize_Demuxed/String2 AS Long === " + jMetaDataGeneral.getStreamSizeDemuxedString2AsLong());
    }

   /**
    * Test getStreamSizeDemuxedString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedString2AsLocalDateTime());
        System.out.println("StreamSize_Demuxed/String2 AS LocalDateTime === " + jMetaDataGeneral.getStreamSizeDemuxedString2AsLocalDateTime());
    }

   /**
    * Test getStreamSizeDemuxedString2AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedString2AsLocalTime());
        System.out.println("StreamSize_Demuxed/String2 AS LocalTime === " + jMetaDataGeneral.getStreamSizeDemuxedString2AsLocalTime());
    }

   /**
    * Test getStreamSizeDemuxedString2AsString() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsString() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedString2AsString());
        System.out.println("StreamSize_Demuxed/String2 AS String === " + jMetaDataGeneral.getStreamSizeDemuxedString2AsString());
    }

   /**
    * Test getStreamSizeDemuxedString2AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedString2AsBoolean());
        System.out.println("StreamSize_Demuxed/String2 AS Boolean === " + jMetaDataGeneral.getStreamSizeDemuxedString2AsBoolean());
    }

   /**
    * Test getStreamSizeDemuxedString2AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedString2AsBigInteger());
        System.out.println("StreamSize_Demuxed/String2 AS BigInteger === " + jMetaDataGeneral.getStreamSizeDemuxedString2AsBigInteger());
    }

   /**
    * Test getStreamSizeDemuxedString2AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString2AsURL() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedString2AsURL());
        System.out.println("StreamSize_Demuxed/String2 AS URL === " + jMetaDataGeneral.getStreamSizeDemuxedString2AsURL());
    }

   /**
    * Test getStreamSizeDemuxedString3AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedString3AsInteger());
        System.out.println("StreamSize_Demuxed/String3 AS Integer === " + jMetaDataGeneral.getStreamSizeDemuxedString3AsInteger());
    }

   /**
    * Test getStreamSizeDemuxedString3AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsLong() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedString3AsLong());
        System.out.println("StreamSize_Demuxed/String3 AS Long === " + jMetaDataGeneral.getStreamSizeDemuxedString3AsLong());
    }

   /**
    * Test getStreamSizeDemuxedString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedString3AsLocalDateTime());
        System.out.println("StreamSize_Demuxed/String3 AS LocalDateTime === " + jMetaDataGeneral.getStreamSizeDemuxedString3AsLocalDateTime());
    }

   /**
    * Test getStreamSizeDemuxedString3AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedString3AsLocalTime());
        System.out.println("StreamSize_Demuxed/String3 AS LocalTime === " + jMetaDataGeneral.getStreamSizeDemuxedString3AsLocalTime());
    }

   /**
    * Test getStreamSizeDemuxedString3AsString() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsString() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedString3AsString());
        System.out.println("StreamSize_Demuxed/String3 AS String === " + jMetaDataGeneral.getStreamSizeDemuxedString3AsString());
    }

   /**
    * Test getStreamSizeDemuxedString3AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedString3AsBoolean());
        System.out.println("StreamSize_Demuxed/String3 AS Boolean === " + jMetaDataGeneral.getStreamSizeDemuxedString3AsBoolean());
    }

   /**
    * Test getStreamSizeDemuxedString3AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedString3AsBigInteger());
        System.out.println("StreamSize_Demuxed/String3 AS BigInteger === " + jMetaDataGeneral.getStreamSizeDemuxedString3AsBigInteger());
    }

   /**
    * Test getStreamSizeDemuxedString3AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString3AsURL() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedString3AsURL());
        System.out.println("StreamSize_Demuxed/String3 AS URL === " + jMetaDataGeneral.getStreamSizeDemuxedString3AsURL());
    }

   /**
    * Test getStreamSizeDemuxedString4AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedString4AsInteger());
        System.out.println("StreamSize_Demuxed/String4 AS Integer === " + jMetaDataGeneral.getStreamSizeDemuxedString4AsInteger());
    }

   /**
    * Test getStreamSizeDemuxedString4AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsLong() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedString4AsLong());
        System.out.println("StreamSize_Demuxed/String4 AS Long === " + jMetaDataGeneral.getStreamSizeDemuxedString4AsLong());
    }

   /**
    * Test getStreamSizeDemuxedString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedString4AsLocalDateTime());
        System.out.println("StreamSize_Demuxed/String4 AS LocalDateTime === " + jMetaDataGeneral.getStreamSizeDemuxedString4AsLocalDateTime());
    }

   /**
    * Test getStreamSizeDemuxedString4AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedString4AsLocalTime());
        System.out.println("StreamSize_Demuxed/String4 AS LocalTime === " + jMetaDataGeneral.getStreamSizeDemuxedString4AsLocalTime());
    }

   /**
    * Test getStreamSizeDemuxedString4AsString() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsString() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedString4AsString());
        System.out.println("StreamSize_Demuxed/String4 AS String === " + jMetaDataGeneral.getStreamSizeDemuxedString4AsString());
    }

   /**
    * Test getStreamSizeDemuxedString4AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedString4AsBoolean());
        System.out.println("StreamSize_Demuxed/String4 AS Boolean === " + jMetaDataGeneral.getStreamSizeDemuxedString4AsBoolean());
    }

   /**
    * Test getStreamSizeDemuxedString4AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedString4AsBigInteger());
        System.out.println("StreamSize_Demuxed/String4 AS BigInteger === " + jMetaDataGeneral.getStreamSizeDemuxedString4AsBigInteger());
    }

   /**
    * Test getStreamSizeDemuxedString4AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString4AsURL() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedString4AsURL());
        System.out.println("StreamSize_Demuxed/String4 AS URL === " + jMetaDataGeneral.getStreamSizeDemuxedString4AsURL());
    }

   /**
    * Test getStreamSizeDemuxedString5AsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedString5AsInteger());
        System.out.println("StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use) AS Integer === " + jMetaDataGeneral.getStreamSizeDemuxedString5AsInteger());
    }

   /**
    * Test getStreamSizeDemuxedString5AsLong() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsLong() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedString5AsLong());
        System.out.println("StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use) AS Long === " + jMetaDataGeneral.getStreamSizeDemuxedString5AsLong());
    }

   /**
    * Test getStreamSizeDemuxedString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedString5AsLocalDateTime());
        System.out.println("StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use) AS LocalDateTime === " + jMetaDataGeneral.getStreamSizeDemuxedString5AsLocalDateTime());
    }

   /**
    * Test getStreamSizeDemuxedString5AsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedString5AsLocalTime());
        System.out.println("StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use) AS LocalTime === " + jMetaDataGeneral.getStreamSizeDemuxedString5AsLocalTime());
    }

   /**
    * Test getStreamSizeDemuxedString5AsString() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsString() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedString5AsString());
        System.out.println("StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use) AS String === " + jMetaDataGeneral.getStreamSizeDemuxedString5AsString());
    }

   /**
    * Test getStreamSizeDemuxedString5AsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedString5AsBoolean());
        System.out.println("StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use) AS Boolean === " + jMetaDataGeneral.getStreamSizeDemuxedString5AsBoolean());
    }

   /**
    * Test getStreamSizeDemuxedString5AsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedString5AsBigInteger());
        System.out.println("StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use) AS BigInteger === " + jMetaDataGeneral.getStreamSizeDemuxedString5AsBigInteger());
    }

   /**
    * Test getStreamSizeDemuxedString5AsURL() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedString5AsURL() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedString5AsURL());
        System.out.println("StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use) AS URL === " + jMetaDataGeneral.getStreamSizeDemuxedString5AsURL());
    }

   /**
    * Test getEncryptionInitializationVectorAsInteger() method.
    */
    @Test
    public void subTestGetEncryptionInitializationVectorAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionInitializationVectorAsInteger());
        System.out.println("Encryption_InitializationVector AS Integer === " + jMetaDataGeneral.getEncryptionInitializationVectorAsInteger());
    }

   /**
    * Test getEncryptionInitializationVectorAsLong() method.
    */
    @Test
    public void subTestGetEncryptionInitializationVectorAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionInitializationVectorAsLong());
        System.out.println("Encryption_InitializationVector AS Long === " + jMetaDataGeneral.getEncryptionInitializationVectorAsLong());
    }

   /**
    * Test getEncryptionInitializationVectorAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncryptionInitializationVectorAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionInitializationVectorAsLocalDateTime());
        System.out.println("Encryption_InitializationVector AS LocalDateTime === " + jMetaDataGeneral.getEncryptionInitializationVectorAsLocalDateTime());
    }

   /**
    * Test getEncryptionInitializationVectorAsLocalTime() method.
    */
    @Test
    public void subTestGetEncryptionInitializationVectorAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionInitializationVectorAsLocalTime());
        System.out.println("Encryption_InitializationVector AS LocalTime === " + jMetaDataGeneral.getEncryptionInitializationVectorAsLocalTime());
    }

   /**
    * Test getEncryptionInitializationVectorAsString() method.
    */
    @Test
    public void subTestGetEncryptionInitializationVectorAsString() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionInitializationVectorAsString());
        System.out.println("Encryption_InitializationVector AS String === " + jMetaDataGeneral.getEncryptionInitializationVectorAsString());
    }

   /**
    * Test getEncryptionInitializationVectorAsBoolean() method.
    */
    @Test
    public void subTestGetEncryptionInitializationVectorAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionInitializationVectorAsBoolean());
        System.out.println("Encryption_InitializationVector AS Boolean === " + jMetaDataGeneral.getEncryptionInitializationVectorAsBoolean());
    }

   /**
    * Test getEncryptionInitializationVectorAsBigInteger() method.
    */
    @Test
    public void subTestGetEncryptionInitializationVectorAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionInitializationVectorAsBigInteger());
        System.out.println("Encryption_InitializationVector AS BigInteger === " + jMetaDataGeneral.getEncryptionInitializationVectorAsBigInteger());
    }

   /**
    * Test getEncryptionInitializationVectorAsURL() method.
    */
    @Test
    public void subTestGetEncryptionInitializationVectorAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getEncryptionInitializationVectorAsURL());
        System.out.println("Encryption_InitializationVector AS URL === " + jMetaDataGeneral.getEncryptionInitializationVectorAsURL());
    }

   /**
    * Test getAlbumReplayGainGainAsInteger() method.
    */
    @Test
    public void subTestGetAlbumReplayGainGainAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumReplayGainGainAsInteger());
        System.out.println("The gain to apply to reach 89dB SPL on playback AS Integer === " + jMetaDataGeneral.getAlbumReplayGainGainAsInteger());
    }

   /**
    * Test getAlbumReplayGainGainAsLong() method.
    */
    @Test
    public void subTestGetAlbumReplayGainGainAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumReplayGainGainAsLong());
        System.out.println("The gain to apply to reach 89dB SPL on playback AS Long === " + jMetaDataGeneral.getAlbumReplayGainGainAsLong());
    }

   /**
    * Test getAlbumReplayGainGainAsLocalDateTime() method.
    */
    @Test
    public void subTestGetAlbumReplayGainGainAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumReplayGainGainAsLocalDateTime());
        System.out.println("The gain to apply to reach 89dB SPL on playback AS LocalDateTime === " + jMetaDataGeneral.getAlbumReplayGainGainAsLocalDateTime());
    }

   /**
    * Test getAlbumReplayGainGainAsLocalTime() method.
    */
    @Test
    public void subTestGetAlbumReplayGainGainAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumReplayGainGainAsLocalTime());
        System.out.println("The gain to apply to reach 89dB SPL on playback AS LocalTime === " + jMetaDataGeneral.getAlbumReplayGainGainAsLocalTime());
    }

   /**
    * Test getAlbumReplayGainGainAsString() method.
    */
    @Test
    public void subTestGetAlbumReplayGainGainAsString() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumReplayGainGainAsString());
        System.out.println("The gain to apply to reach 89dB SPL on playback AS String === " + jMetaDataGeneral.getAlbumReplayGainGainAsString());
    }

   /**
    * Test getAlbumReplayGainGainAsBoolean() method.
    */
    @Test
    public void subTestGetAlbumReplayGainGainAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumReplayGainGainAsBoolean());
        System.out.println("The gain to apply to reach 89dB SPL on playback AS Boolean === " + jMetaDataGeneral.getAlbumReplayGainGainAsBoolean());
    }

   /**
    * Test getAlbumReplayGainGainAsBigInteger() method.
    */
    @Test
    public void subTestGetAlbumReplayGainGainAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumReplayGainGainAsBigInteger());
        System.out.println("The gain to apply to reach 89dB SPL on playback AS BigInteger === " + jMetaDataGeneral.getAlbumReplayGainGainAsBigInteger());
    }

   /**
    * Test getAlbumReplayGainGainAsURL() method.
    */
    @Test
    public void subTestGetAlbumReplayGainGainAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumReplayGainGainAsURL());
        System.out.println("The gain to apply to reach 89dB SPL on playback AS URL === " + jMetaDataGeneral.getAlbumReplayGainGainAsURL());
    }

   /**
    * Test getFormatLevelAsInteger() method.
    */
    @Test
    public void subTestGetFormatLevelAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFormatLevelAsInteger());
        System.out.println("Level of the Format (only MIXML) AS Integer === " + jMetaDataGeneral.getFormatLevelAsInteger());
    }

   /**
    * Test getFormatLevelAsLong() method.
    */
    @Test
    public void subTestGetFormatLevelAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getFormatLevelAsLong());
        System.out.println("Level of the Format (only MIXML) AS Long === " + jMetaDataGeneral.getFormatLevelAsLong());
    }

   /**
    * Test getFormatLevelAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatLevelAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getFormatLevelAsLocalDateTime());
        System.out.println("Level of the Format (only MIXML) AS LocalDateTime === " + jMetaDataGeneral.getFormatLevelAsLocalDateTime());
    }

   /**
    * Test getFormatLevelAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatLevelAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getFormatLevelAsLocalTime());
        System.out.println("Level of the Format (only MIXML) AS LocalTime === " + jMetaDataGeneral.getFormatLevelAsLocalTime());
    }

   /**
    * Test getFormatLevelAsString() method.
    */
    @Test
    public void subTestGetFormatLevelAsString() {
        assertEquals(null, this.jMetaDataGeneral.getFormatLevelAsString());
        System.out.println("Level of the Format (only MIXML) AS String === " + jMetaDataGeneral.getFormatLevelAsString());
    }

   /**
    * Test getFormatLevelAsBoolean() method.
    */
    @Test
    public void subTestGetFormatLevelAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getFormatLevelAsBoolean());
        System.out.println("Level of the Format (only MIXML) AS Boolean === " + jMetaDataGeneral.getFormatLevelAsBoolean());
    }

   /**
    * Test getFormatLevelAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatLevelAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFormatLevelAsBigInteger());
        System.out.println("Level of the Format (only MIXML) AS BigInteger === " + jMetaDataGeneral.getFormatLevelAsBigInteger());
    }

   /**
    * Test getFormatLevelAsURL() method.
    */
    @Test
    public void subTestGetFormatLevelAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getFormatLevelAsURL());
        System.out.println("Level of the Format (only MIXML) AS URL === " + jMetaDataGeneral.getFormatLevelAsURL());
    }

   /**
    * Test getStreamSizeDemuxedStringAsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedStringAsInteger());
        System.out.println("StreamSize_Demuxed in with percentage value AS Integer === " + jMetaDataGeneral.getStreamSizeDemuxedStringAsInteger());
    }

   /**
    * Test getStreamSizeDemuxedStringAsLong() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedStringAsLong());
        System.out.println("StreamSize_Demuxed in with percentage value AS Long === " + jMetaDataGeneral.getStreamSizeDemuxedStringAsLong());
    }

   /**
    * Test getStreamSizeDemuxedStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedStringAsLocalDateTime());
        System.out.println("StreamSize_Demuxed in with percentage value AS LocalDateTime === " + jMetaDataGeneral.getStreamSizeDemuxedStringAsLocalDateTime());
    }

   /**
    * Test getStreamSizeDemuxedStringAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedStringAsLocalTime());
        System.out.println("StreamSize_Demuxed in with percentage value AS LocalTime === " + jMetaDataGeneral.getStreamSizeDemuxedStringAsLocalTime());
    }

   /**
    * Test getStreamSizeDemuxedStringAsString() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsString() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedStringAsString());
        System.out.println("StreamSize_Demuxed in with percentage value AS String === " + jMetaDataGeneral.getStreamSizeDemuxedStringAsString());
    }

   /**
    * Test getStreamSizeDemuxedStringAsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedStringAsBoolean());
        System.out.println("StreamSize_Demuxed in with percentage value AS Boolean === " + jMetaDataGeneral.getStreamSizeDemuxedStringAsBoolean());
    }

   /**
    * Test getStreamSizeDemuxedStringAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedStringAsBigInteger());
        System.out.println("StreamSize_Demuxed in with percentage value AS BigInteger === " + jMetaDataGeneral.getStreamSizeDemuxedStringAsBigInteger());
    }

   /**
    * Test getStreamSizeDemuxedStringAsURL() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedStringAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedStringAsURL());
        System.out.println("StreamSize_Demuxed in with percentage value AS URL === " + jMetaDataGeneral.getStreamSizeDemuxedStringAsURL());
    }

   /**
    * Test getAlbumAsInteger() method.
    */
    @Test
    public void subTestGetAlbumAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumAsInteger());
        System.out.println("Name of an audio-album. Eg : The joshua tree AS Integer === " + jMetaDataGeneral.getAlbumAsInteger());
    }

   /**
    * Test getAlbumAsLong() method.
    */
    @Test
    public void subTestGetAlbumAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumAsLong());
        System.out.println("Name of an audio-album. Eg : The joshua tree AS Long === " + jMetaDataGeneral.getAlbumAsLong());
    }

   /**
    * Test getAlbumAsLocalDateTime() method.
    */
    @Test
    public void subTestGetAlbumAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumAsLocalDateTime());
        System.out.println("Name of an audio-album. Eg : The joshua tree AS LocalDateTime === " + jMetaDataGeneral.getAlbumAsLocalDateTime());
    }

   /**
    * Test getAlbumAsLocalTime() method.
    */
    @Test
    public void subTestGetAlbumAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumAsLocalTime());
        System.out.println("Name of an audio-album. Eg : The joshua tree AS LocalTime === " + jMetaDataGeneral.getAlbumAsLocalTime());
    }

   /**
    * Test getAlbumAsString() method.
    */
    @Test
    public void subTestGetAlbumAsString() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumAsString());
        System.out.println("Name of an audio-album. Eg : The joshua tree AS String === " + jMetaDataGeneral.getAlbumAsString());
    }

   /**
    * Test getAlbumAsBoolean() method.
    */
    @Test
    public void subTestGetAlbumAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumAsBoolean());
        System.out.println("Name of an audio-album. Eg : The joshua tree AS Boolean === " + jMetaDataGeneral.getAlbumAsBoolean());
    }

   /**
    * Test getAlbumAsBigInteger() method.
    */
    @Test
    public void subTestGetAlbumAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumAsBigInteger());
        System.out.println("Name of an audio-album. Eg : The joshua tree AS BigInteger === " + jMetaDataGeneral.getAlbumAsBigInteger());
    }

   /**
    * Test getAlbumAsURL() method.
    */
    @Test
    public void subTestGetAlbumAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumAsURL());
        System.out.println("Name of an audio-album. Eg : The joshua tree AS URL === " + jMetaDataGeneral.getAlbumAsURL());
    }

   /**
    * Test getTextFormatWithHintListAsInteger() method.
    */
    @Test
    public void subTestGetTextFormatWithHintListAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getTextFormatWithHintListAsInteger());
        System.out.println("Text Codecs in this file with popular name (hint),separated by / AS Integer === " + jMetaDataGeneral.getTextFormatWithHintListAsInteger());
    }

   /**
    * Test getTextFormatWithHintListAsLong() method.
    */
    @Test
    public void subTestGetTextFormatWithHintListAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getTextFormatWithHintListAsLong());
        System.out.println("Text Codecs in this file with popular name (hint),separated by / AS Long === " + jMetaDataGeneral.getTextFormatWithHintListAsLong());
    }

   /**
    * Test getTextFormatWithHintListAsLocalDateTime() method.
    */
    @Test
    public void subTestGetTextFormatWithHintListAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getTextFormatWithHintListAsLocalDateTime());
        System.out.println("Text Codecs in this file with popular name (hint),separated by / AS LocalDateTime === " + jMetaDataGeneral.getTextFormatWithHintListAsLocalDateTime());
    }

   /**
    * Test getTextFormatWithHintListAsLocalTime() method.
    */
    @Test
    public void subTestGetTextFormatWithHintListAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getTextFormatWithHintListAsLocalTime());
        System.out.println("Text Codecs in this file with popular name (hint),separated by / AS LocalTime === " + jMetaDataGeneral.getTextFormatWithHintListAsLocalTime());
    }

   /**
    * Test getTextFormatWithHintListAsString() method.
    */
    @Test
    public void subTestGetTextFormatWithHintListAsString() {
        assertEquals(null, this.jMetaDataGeneral.getTextFormatWithHintListAsString());
        System.out.println("Text Codecs in this file with popular name (hint),separated by / AS String === " + jMetaDataGeneral.getTextFormatWithHintListAsString());
    }

   /**
    * Test getTextFormatWithHintListAsBoolean() method.
    */
    @Test
    public void subTestGetTextFormatWithHintListAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getTextFormatWithHintListAsBoolean());
        System.out.println("Text Codecs in this file with popular name (hint),separated by / AS Boolean === " + jMetaDataGeneral.getTextFormatWithHintListAsBoolean());
    }

   /**
    * Test getTextFormatWithHintListAsBigInteger() method.
    */
    @Test
    public void subTestGetTextFormatWithHintListAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getTextFormatWithHintListAsBigInteger());
        System.out.println("Text Codecs in this file with popular name (hint),separated by / AS BigInteger === " + jMetaDataGeneral.getTextFormatWithHintListAsBigInteger());
    }

   /**
    * Test getTextFormatWithHintListAsURL() method.
    */
    @Test
    public void subTestGetTextFormatWithHintListAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getTextFormatWithHintListAsURL());
        System.out.println("Text Codecs in this file with popular name (hint),separated by / AS URL === " + jMetaDataGeneral.getTextFormatWithHintListAsURL());
    }

   /**
    * Test getOverallBitRateMinimumStringAsInteger() method.
    */
    @Test
    public void subTestGetOverallBitRateMinimumStringAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateMinimumStringAsInteger());
        System.out.println("Minimum Bit rate (with measurement) AS Integer === " + jMetaDataGeneral.getOverallBitRateMinimumStringAsInteger());
    }

   /**
    * Test getOverallBitRateMinimumStringAsLong() method.
    */
    @Test
    public void subTestGetOverallBitRateMinimumStringAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateMinimumStringAsLong());
        System.out.println("Minimum Bit rate (with measurement) AS Long === " + jMetaDataGeneral.getOverallBitRateMinimumStringAsLong());
    }

   /**
    * Test getOverallBitRateMinimumStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetOverallBitRateMinimumStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateMinimumStringAsLocalDateTime());
        System.out.println("Minimum Bit rate (with measurement) AS LocalDateTime === " + jMetaDataGeneral.getOverallBitRateMinimumStringAsLocalDateTime());
    }

   /**
    * Test getOverallBitRateMinimumStringAsLocalTime() method.
    */
    @Test
    public void subTestGetOverallBitRateMinimumStringAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateMinimumStringAsLocalTime());
        System.out.println("Minimum Bit rate (with measurement) AS LocalTime === " + jMetaDataGeneral.getOverallBitRateMinimumStringAsLocalTime());
    }

   /**
    * Test getOverallBitRateMinimumStringAsString() method.
    */
    @Test
    public void subTestGetOverallBitRateMinimumStringAsString() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateMinimumStringAsString());
        System.out.println("Minimum Bit rate (with measurement) AS String === " + jMetaDataGeneral.getOverallBitRateMinimumStringAsString());
    }

   /**
    * Test getOverallBitRateMinimumStringAsBoolean() method.
    */
    @Test
    public void subTestGetOverallBitRateMinimumStringAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateMinimumStringAsBoolean());
        System.out.println("Minimum Bit rate (with measurement) AS Boolean === " + jMetaDataGeneral.getOverallBitRateMinimumStringAsBoolean());
    }

   /**
    * Test getOverallBitRateMinimumStringAsBigInteger() method.
    */
    @Test
    public void subTestGetOverallBitRateMinimumStringAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateMinimumStringAsBigInteger());
        System.out.println("Minimum Bit rate (with measurement) AS BigInteger === " + jMetaDataGeneral.getOverallBitRateMinimumStringAsBigInteger());
    }

   /**
    * Test getOverallBitRateMinimumStringAsURL() method.
    */
    @Test
    public void subTestGetOverallBitRateMinimumStringAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateMinimumStringAsURL());
        System.out.println("Minimum Bit rate (with measurement) AS URL === " + jMetaDataGeneral.getOverallBitRateMinimumStringAsURL());
    }

   /**
    * Test getCopyrightAsInteger() method.
    */
    @Test
    public void subTestGetCopyrightAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCopyrightAsInteger());
        System.out.println("Copyright attribution. AS Integer === " + jMetaDataGeneral.getCopyrightAsInteger());
    }

   /**
    * Test getCopyrightAsLong() method.
    */
    @Test
    public void subTestGetCopyrightAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getCopyrightAsLong());
        System.out.println("Copyright attribution. AS Long === " + jMetaDataGeneral.getCopyrightAsLong());
    }

   /**
    * Test getCopyrightAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCopyrightAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getCopyrightAsLocalDateTime());
        System.out.println("Copyright attribution. AS LocalDateTime === " + jMetaDataGeneral.getCopyrightAsLocalDateTime());
    }

   /**
    * Test getCopyrightAsLocalTime() method.
    */
    @Test
    public void subTestGetCopyrightAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getCopyrightAsLocalTime());
        System.out.println("Copyright attribution. AS LocalTime === " + jMetaDataGeneral.getCopyrightAsLocalTime());
    }

   /**
    * Test getCopyrightAsString() method.
    */
    @Test
    public void subTestGetCopyrightAsString() {
        assertEquals(null, this.jMetaDataGeneral.getCopyrightAsString());
        System.out.println("Copyright attribution. AS String === " + jMetaDataGeneral.getCopyrightAsString());
    }

   /**
    * Test getCopyrightAsBoolean() method.
    */
    @Test
    public void subTestGetCopyrightAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getCopyrightAsBoolean());
        System.out.println("Copyright attribution. AS Boolean === " + jMetaDataGeneral.getCopyrightAsBoolean());
    }

   /**
    * Test getCopyrightAsBigInteger() method.
    */
    @Test
    public void subTestGetCopyrightAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCopyrightAsBigInteger());
        System.out.println("Copyright attribution. AS BigInteger === " + jMetaDataGeneral.getCopyrightAsBigInteger());
    }

   /**
    * Test getCopyrightAsURL() method.
    */
    @Test
    public void subTestGetCopyrightAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getCopyrightAsURL());
        System.out.println("Copyright attribution. AS URL === " + jMetaDataGeneral.getCopyrightAsURL());
    }

   /**
    * Test getStreamCountAsInteger() method.
    */
    @Test
    public void subTestGetStreamCountAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getStreamCountAsInteger());
        System.out.println("Count of streams of that kind available AS Integer === " + jMetaDataGeneral.getStreamCountAsInteger());
    }

   /**
    * Test getStreamCountAsLong() method.
    */
    @Test
    public void subTestGetStreamCountAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getStreamCountAsLong());
        System.out.println("Count of streams of that kind available AS Long === " + jMetaDataGeneral.getStreamCountAsLong());
    }

   /**
    * Test getStreamCountAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamCountAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getStreamCountAsLocalDateTime());
        System.out.println("Count of streams of that kind available AS LocalDateTime === " + jMetaDataGeneral.getStreamCountAsLocalDateTime());
    }

   /**
    * Test getStreamCountAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamCountAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getStreamCountAsLocalTime());
        System.out.println("Count of streams of that kind available AS LocalTime === " + jMetaDataGeneral.getStreamCountAsLocalTime());
    }

   /**
    * Test getStreamCountAsString() method.
    */
    @Test
    public void subTestGetStreamCountAsString() {
        assertEquals(null, this.jMetaDataGeneral.getStreamCountAsString());
        System.out.println("Count of streams of that kind available AS String === " + jMetaDataGeneral.getStreamCountAsString());
    }

   /**
    * Test getStreamCountAsBoolean() method.
    */
    @Test
    public void subTestGetStreamCountAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getStreamCountAsBoolean());
        System.out.println("Count of streams of that kind available AS Boolean === " + jMetaDataGeneral.getStreamCountAsBoolean());
    }

   /**
    * Test getStreamCountAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamCountAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getStreamCountAsBigInteger());
        System.out.println("Count of streams of that kind available AS BigInteger === " + jMetaDataGeneral.getStreamCountAsBigInteger());
    }

   /**
    * Test getStreamCountAsURL() method.
    */
    @Test
    public void subTestGetStreamCountAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getStreamCountAsURL());
        System.out.println("Count of streams of that kind available AS URL === " + jMetaDataGeneral.getStreamCountAsURL());
    }

   /**
    * Test getMasteredByAsInteger() method.
    */
    @Test
    public void subTestGetMasteredByAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getMasteredByAsInteger());
        System.out.println("The engineer who mastered the content for a physical medium or for digital distribution. AS Integer === " + jMetaDataGeneral.getMasteredByAsInteger());
    }

   /**
    * Test getMasteredByAsLong() method.
    */
    @Test
    public void subTestGetMasteredByAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getMasteredByAsLong());
        System.out.println("The engineer who mastered the content for a physical medium or for digital distribution. AS Long === " + jMetaDataGeneral.getMasteredByAsLong());
    }

   /**
    * Test getMasteredByAsLocalDateTime() method.
    */
    @Test
    public void subTestGetMasteredByAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getMasteredByAsLocalDateTime());
        System.out.println("The engineer who mastered the content for a physical medium or for digital distribution. AS LocalDateTime === " + jMetaDataGeneral.getMasteredByAsLocalDateTime());
    }

   /**
    * Test getMasteredByAsLocalTime() method.
    */
    @Test
    public void subTestGetMasteredByAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getMasteredByAsLocalTime());
        System.out.println("The engineer who mastered the content for a physical medium or for digital distribution. AS LocalTime === " + jMetaDataGeneral.getMasteredByAsLocalTime());
    }

   /**
    * Test getMasteredByAsString() method.
    */
    @Test
    public void subTestGetMasteredByAsString() {
        assertEquals(null, this.jMetaDataGeneral.getMasteredByAsString());
        System.out.println("The engineer who mastered the content for a physical medium or for digital distribution. AS String === " + jMetaDataGeneral.getMasteredByAsString());
    }

   /**
    * Test getMasteredByAsBoolean() method.
    */
    @Test
    public void subTestGetMasteredByAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getMasteredByAsBoolean());
        System.out.println("The engineer who mastered the content for a physical medium or for digital distribution. AS Boolean === " + jMetaDataGeneral.getMasteredByAsBoolean());
    }

   /**
    * Test getMasteredByAsBigInteger() method.
    */
    @Test
    public void subTestGetMasteredByAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getMasteredByAsBigInteger());
        System.out.println("The engineer who mastered the content for a physical medium or for digital distribution. AS BigInteger === " + jMetaDataGeneral.getMasteredByAsBigInteger());
    }

   /**
    * Test getMasteredByAsURL() method.
    */
    @Test
    public void subTestGetMasteredByAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getMasteredByAsURL());
        System.out.println("The engineer who mastered the content for a physical medium or for digital distribution. AS URL === " + jMetaDataGeneral.getMasteredByAsURL());
    }

   /**
    * Test getOtherCountAsInteger() method.
    */
    @Test
    public void subTestGetOtherCountAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOtherCountAsInteger());
        System.out.println("Number of other streams AS Integer === " + jMetaDataGeneral.getOtherCountAsInteger());
    }

   /**
    * Test getOtherCountAsLong() method.
    */
    @Test
    public void subTestGetOtherCountAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getOtherCountAsLong());
        System.out.println("Number of other streams AS Long === " + jMetaDataGeneral.getOtherCountAsLong());
    }

   /**
    * Test getOtherCountAsLocalDateTime() method.
    */
    @Test
    public void subTestGetOtherCountAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getOtherCountAsLocalDateTime());
        System.out.println("Number of other streams AS LocalDateTime === " + jMetaDataGeneral.getOtherCountAsLocalDateTime());
    }

   /**
    * Test getOtherCountAsLocalTime() method.
    */
    @Test
    public void subTestGetOtherCountAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getOtherCountAsLocalTime());
        System.out.println("Number of other streams AS LocalTime === " + jMetaDataGeneral.getOtherCountAsLocalTime());
    }

   /**
    * Test getOtherCountAsString() method.
    */
    @Test
    public void subTestGetOtherCountAsString() {
        assertEquals(null, this.jMetaDataGeneral.getOtherCountAsString());
        System.out.println("Number of other streams AS String === " + jMetaDataGeneral.getOtherCountAsString());
    }

   /**
    * Test getOtherCountAsBoolean() method.
    */
    @Test
    public void subTestGetOtherCountAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getOtherCountAsBoolean());
        System.out.println("Number of other streams AS Boolean === " + jMetaDataGeneral.getOtherCountAsBoolean());
    }

   /**
    * Test getOtherCountAsBigInteger() method.
    */
    @Test
    public void subTestGetOtherCountAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOtherCountAsBigInteger());
        System.out.println("Number of other streams AS BigInteger === " + jMetaDataGeneral.getOtherCountAsBigInteger());
    }

   /**
    * Test getOtherCountAsURL() method.
    */
    @Test
    public void subTestGetOtherCountAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getOtherCountAsURL());
        System.out.println("Number of other streams AS URL === " + jMetaDataGeneral.getOtherCountAsURL());
    }

   /**
    * Test getGeneralCountAsInteger() method.
    */
    @Test
    public void subTestGetGeneralCountAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getGeneralCountAsInteger());
        System.out.println("Number of general streams AS Integer === " + jMetaDataGeneral.getGeneralCountAsInteger());
    }

   /**
    * Test getGeneralCountAsLong() method.
    */
    @Test
    public void subTestGetGeneralCountAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getGeneralCountAsLong());
        System.out.println("Number of general streams AS Long === " + jMetaDataGeneral.getGeneralCountAsLong());
    }

   /**
    * Test getGeneralCountAsLocalDateTime() method.
    */
    @Test
    public void subTestGetGeneralCountAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getGeneralCountAsLocalDateTime());
        System.out.println("Number of general streams AS LocalDateTime === " + jMetaDataGeneral.getGeneralCountAsLocalDateTime());
    }

   /**
    * Test getGeneralCountAsLocalTime() method.
    */
    @Test
    public void subTestGetGeneralCountAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getGeneralCountAsLocalTime());
        System.out.println("Number of general streams AS LocalTime === " + jMetaDataGeneral.getGeneralCountAsLocalTime());
    }

   /**
    * Test getGeneralCountAsString() method.
    */
    @Test
    public void subTestGetGeneralCountAsString() {
        assertEquals(null, this.jMetaDataGeneral.getGeneralCountAsString());
        System.out.println("Number of general streams AS String === " + jMetaDataGeneral.getGeneralCountAsString());
    }

   /**
    * Test getGeneralCountAsBoolean() method.
    */
    @Test
    public void subTestGetGeneralCountAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getGeneralCountAsBoolean());
        System.out.println("Number of general streams AS Boolean === " + jMetaDataGeneral.getGeneralCountAsBoolean());
    }

   /**
    * Test getGeneralCountAsBigInteger() method.
    */
    @Test
    public void subTestGetGeneralCountAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getGeneralCountAsBigInteger());
        System.out.println("Number of general streams AS BigInteger === " + jMetaDataGeneral.getGeneralCountAsBigInteger());
    }

   /**
    * Test getGeneralCountAsURL() method.
    */
    @Test
    public void subTestGetGeneralCountAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getGeneralCountAsURL());
        System.out.println("Number of general streams AS URL === " + jMetaDataGeneral.getGeneralCountAsURL());
    }

   /**
    * Test getCopyrightUrlAsInteger() method.
    */
    @Test
    public void subTestGetCopyrightUrlAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCopyrightUrlAsInteger());
        System.out.println("Link to a site with copyright/legal information. AS Integer === " + jMetaDataGeneral.getCopyrightUrlAsInteger());
    }

   /**
    * Test getCopyrightUrlAsLong() method.
    */
    @Test
    public void subTestGetCopyrightUrlAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getCopyrightUrlAsLong());
        System.out.println("Link to a site with copyright/legal information. AS Long === " + jMetaDataGeneral.getCopyrightUrlAsLong());
    }

   /**
    * Test getCopyrightUrlAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCopyrightUrlAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getCopyrightUrlAsLocalDateTime());
        System.out.println("Link to a site with copyright/legal information. AS LocalDateTime === " + jMetaDataGeneral.getCopyrightUrlAsLocalDateTime());
    }

   /**
    * Test getCopyrightUrlAsLocalTime() method.
    */
    @Test
    public void subTestGetCopyrightUrlAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getCopyrightUrlAsLocalTime());
        System.out.println("Link to a site with copyright/legal information. AS LocalTime === " + jMetaDataGeneral.getCopyrightUrlAsLocalTime());
    }

   /**
    * Test getCopyrightUrlAsString() method.
    */
    @Test
    public void subTestGetCopyrightUrlAsString() {
        assertEquals(null, this.jMetaDataGeneral.getCopyrightUrlAsString());
        System.out.println("Link to a site with copyright/legal information. AS String === " + jMetaDataGeneral.getCopyrightUrlAsString());
    }

   /**
    * Test getCopyrightUrlAsBoolean() method.
    */
    @Test
    public void subTestGetCopyrightUrlAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getCopyrightUrlAsBoolean());
        System.out.println("Link to a site with copyright/legal information. AS Boolean === " + jMetaDataGeneral.getCopyrightUrlAsBoolean());
    }

   /**
    * Test getCopyrightUrlAsBigInteger() method.
    */
    @Test
    public void subTestGetCopyrightUrlAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCopyrightUrlAsBigInteger());
        System.out.println("Link to a site with copyright/legal information. AS BigInteger === " + jMetaDataGeneral.getCopyrightUrlAsBigInteger());
    }

   /**
    * Test getCopyrightUrlAsURL() method.
    */
    @Test
    public void subTestGetCopyrightUrlAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getCopyrightUrlAsURL());
        System.out.println("Link to a site with copyright/legal information. AS URL === " + jMetaDataGeneral.getCopyrightUrlAsURL());
    }

   /**
    * Test getAlbumReplayGainGainStringAsInteger() method.
    */
    @Test
    public void subTestGetAlbumReplayGainGainStringAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumReplayGainGainStringAsInteger());
        System.out.println("Album_ReplayGain_Gain/String AS Integer === " + jMetaDataGeneral.getAlbumReplayGainGainStringAsInteger());
    }

   /**
    * Test getAlbumReplayGainGainStringAsLong() method.
    */
    @Test
    public void subTestGetAlbumReplayGainGainStringAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumReplayGainGainStringAsLong());
        System.out.println("Album_ReplayGain_Gain/String AS Long === " + jMetaDataGeneral.getAlbumReplayGainGainStringAsLong());
    }

   /**
    * Test getAlbumReplayGainGainStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetAlbumReplayGainGainStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumReplayGainGainStringAsLocalDateTime());
        System.out.println("Album_ReplayGain_Gain/String AS LocalDateTime === " + jMetaDataGeneral.getAlbumReplayGainGainStringAsLocalDateTime());
    }

   /**
    * Test getAlbumReplayGainGainStringAsLocalTime() method.
    */
    @Test
    public void subTestGetAlbumReplayGainGainStringAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumReplayGainGainStringAsLocalTime());
        System.out.println("Album_ReplayGain_Gain/String AS LocalTime === " + jMetaDataGeneral.getAlbumReplayGainGainStringAsLocalTime());
    }

   /**
    * Test getAlbumReplayGainGainStringAsString() method.
    */
    @Test
    public void subTestGetAlbumReplayGainGainStringAsString() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumReplayGainGainStringAsString());
        System.out.println("Album_ReplayGain_Gain/String AS String === " + jMetaDataGeneral.getAlbumReplayGainGainStringAsString());
    }

   /**
    * Test getAlbumReplayGainGainStringAsBoolean() method.
    */
    @Test
    public void subTestGetAlbumReplayGainGainStringAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumReplayGainGainStringAsBoolean());
        System.out.println("Album_ReplayGain_Gain/String AS Boolean === " + jMetaDataGeneral.getAlbumReplayGainGainStringAsBoolean());
    }

   /**
    * Test getAlbumReplayGainGainStringAsBigInteger() method.
    */
    @Test
    public void subTestGetAlbumReplayGainGainStringAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumReplayGainGainStringAsBigInteger());
        System.out.println("Album_ReplayGain_Gain/String AS BigInteger === " + jMetaDataGeneral.getAlbumReplayGainGainStringAsBigInteger());
    }

   /**
    * Test getAlbumReplayGainGainStringAsURL() method.
    */
    @Test
    public void subTestGetAlbumReplayGainGainStringAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumReplayGainGainStringAsURL());
        System.out.println("Album_ReplayGain_Gain/String AS URL === " + jMetaDataGeneral.getAlbumReplayGainGainStringAsURL());
    }

   /**
    * Test getVideoCountAsInteger() method.
    */
    @Test
    public void subTestGetVideoCountAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getVideoCountAsInteger());
        System.out.println("Number of video streams AS Integer === " + jMetaDataGeneral.getVideoCountAsInteger());
    }

   /**
    * Test getVideoCountAsLong() method.
    */
    @Test
    public void subTestGetVideoCountAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getVideoCountAsLong());
        System.out.println("Number of video streams AS Long === " + jMetaDataGeneral.getVideoCountAsLong());
    }

   /**
    * Test getVideoCountAsLocalDateTime() method.
    */
    @Test
    public void subTestGetVideoCountAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getVideoCountAsLocalDateTime());
        System.out.println("Number of video streams AS LocalDateTime === " + jMetaDataGeneral.getVideoCountAsLocalDateTime());
    }

   /**
    * Test getVideoCountAsLocalTime() method.
    */
    @Test
    public void subTestGetVideoCountAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getVideoCountAsLocalTime());
        System.out.println("Number of video streams AS LocalTime === " + jMetaDataGeneral.getVideoCountAsLocalTime());
    }

   /**
    * Test getVideoCountAsString() method.
    */
    @Test
    public void subTestGetVideoCountAsString() {
        assertEquals(null, this.jMetaDataGeneral.getVideoCountAsString());
        System.out.println("Number of video streams AS String === " + jMetaDataGeneral.getVideoCountAsString());
    }

   /**
    * Test getVideoCountAsBoolean() method.
    */
    @Test
    public void subTestGetVideoCountAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getVideoCountAsBoolean());
        System.out.println("Number of video streams AS Boolean === " + jMetaDataGeneral.getVideoCountAsBoolean());
    }

   /**
    * Test getVideoCountAsBigInteger() method.
    */
    @Test
    public void subTestGetVideoCountAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getVideoCountAsBigInteger());
        System.out.println("Number of video streams AS BigInteger === " + jMetaDataGeneral.getVideoCountAsBigInteger());
    }

   /**
    * Test getVideoCountAsURL() method.
    */
    @Test
    public void subTestGetVideoCountAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getVideoCountAsURL());
        System.out.println("Number of video streams AS URL === " + jMetaDataGeneral.getVideoCountAsURL());
    }

   /**
    * Test getDurationString2AsInteger() method.
    */
    @Test
    public void subTestGetDurationString2AsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDurationString2AsInteger());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS Integer === " + jMetaDataGeneral.getDurationString2AsInteger());
    }

   /**
    * Test getDurationString2AsLong() method.
    */
    @Test
    public void subTestGetDurationString2AsLong() {
        assertEquals(null, this.jMetaDataGeneral.getDurationString2AsLong());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS Long === " + jMetaDataGeneral.getDurationString2AsLong());
    }

   /**
    * Test getDurationString2AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationString2AsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getDurationString2AsLocalDateTime());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS LocalDateTime === " + jMetaDataGeneral.getDurationString2AsLocalDateTime());
    }

   /**
    * Test getDurationString2AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationString2AsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getDurationString2AsLocalTime());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS LocalTime === " + jMetaDataGeneral.getDurationString2AsLocalTime());
    }

   /**
    * Test getDurationString2AsString() method.
    */
    @Test
    public void subTestGetDurationString2AsString() {
        assertEquals(null, this.jMetaDataGeneral.getDurationString2AsString());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS String === " + jMetaDataGeneral.getDurationString2AsString());
    }

   /**
    * Test getDurationString2AsBoolean() method.
    */
    @Test
    public void subTestGetDurationString2AsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getDurationString2AsBoolean());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS Boolean === " + jMetaDataGeneral.getDurationString2AsBoolean());
    }

   /**
    * Test getDurationString2AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationString2AsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDurationString2AsBigInteger());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS BigInteger === " + jMetaDataGeneral.getDurationString2AsBigInteger());
    }

   /**
    * Test getDurationString2AsURL() method.
    */
    @Test
    public void subTestGetDurationString2AsURL() {
        assertEquals(null, this.jMetaDataGeneral.getDurationString2AsURL());
        System.out.println("Play time in format : XXx YYy only, YYy omited if zero AS URL === " + jMetaDataGeneral.getDurationString2AsURL());
    }

   /**
    * Test getDurationString3AsInteger() method.
    */
    @Test
    public void subTestGetDurationString3AsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDurationString3AsInteger());
        System.out.println("Play time in format : HH:MM:SS.MMM AS Integer === " + jMetaDataGeneral.getDurationString3AsInteger());
    }

   /**
    * Test getDurationString3AsLong() method.
    */
    @Test
    public void subTestGetDurationString3AsLong() {
        assertEquals(null, this.jMetaDataGeneral.getDurationString3AsLong());
        System.out.println("Play time in format : HH:MM:SS.MMM AS Long === " + jMetaDataGeneral.getDurationString3AsLong());
    }

   /**
    * Test getDurationString3AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationString3AsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getDurationString3AsLocalDateTime());
        System.out.println("Play time in format : HH:MM:SS.MMM AS LocalDateTime === " + jMetaDataGeneral.getDurationString3AsLocalDateTime());
    }

   /**
    * Test getDurationString3AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationString3AsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getDurationString3AsLocalTime());
        System.out.println("Play time in format : HH:MM:SS.MMM AS LocalTime === " + jMetaDataGeneral.getDurationString3AsLocalTime());
    }

   /**
    * Test getDurationString3AsString() method.
    */
    @Test
    public void subTestGetDurationString3AsString() {
        assertEquals(null, this.jMetaDataGeneral.getDurationString3AsString());
        System.out.println("Play time in format : HH:MM:SS.MMM AS String === " + jMetaDataGeneral.getDurationString3AsString());
    }

   /**
    * Test getDurationString3AsBoolean() method.
    */
    @Test
    public void subTestGetDurationString3AsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getDurationString3AsBoolean());
        System.out.println("Play time in format : HH:MM:SS.MMM AS Boolean === " + jMetaDataGeneral.getDurationString3AsBoolean());
    }

   /**
    * Test getDurationString3AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationString3AsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDurationString3AsBigInteger());
        System.out.println("Play time in format : HH:MM:SS.MMM AS BigInteger === " + jMetaDataGeneral.getDurationString3AsBigInteger());
    }

   /**
    * Test getDurationString3AsURL() method.
    */
    @Test
    public void subTestGetDurationString3AsURL() {
        assertEquals(null, this.jMetaDataGeneral.getDurationString3AsURL());
        System.out.println("Play time in format : HH:MM:SS.MMM AS URL === " + jMetaDataGeneral.getDurationString3AsURL());
    }

   /**
    * Test getDurationString1AsInteger() method.
    */
    @Test
    public void subTestGetDurationString1AsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDurationString1AsInteger());
        System.out.println("Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS Integer === " + jMetaDataGeneral.getDurationString1AsInteger());
    }

   /**
    * Test getDurationString1AsLong() method.
    */
    @Test
    public void subTestGetDurationString1AsLong() {
        assertEquals(null, this.jMetaDataGeneral.getDurationString1AsLong());
        System.out.println("Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS Long === " + jMetaDataGeneral.getDurationString1AsLong());
    }

   /**
    * Test getDurationString1AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationString1AsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getDurationString1AsLocalDateTime());
        System.out.println("Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS LocalDateTime === " + jMetaDataGeneral.getDurationString1AsLocalDateTime());
    }

   /**
    * Test getDurationString1AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationString1AsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getDurationString1AsLocalTime());
        System.out.println("Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS LocalTime === " + jMetaDataGeneral.getDurationString1AsLocalTime());
    }

   /**
    * Test getDurationString1AsString() method.
    */
    @Test
    public void subTestGetDurationString1AsString() {
        assertEquals(null, this.jMetaDataGeneral.getDurationString1AsString());
        System.out.println("Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS String === " + jMetaDataGeneral.getDurationString1AsString());
    }

   /**
    * Test getDurationString1AsBoolean() method.
    */
    @Test
    public void subTestGetDurationString1AsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getDurationString1AsBoolean());
        System.out.println("Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS Boolean === " + jMetaDataGeneral.getDurationString1AsBoolean());
    }

   /**
    * Test getDurationString1AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationString1AsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDurationString1AsBigInteger());
        System.out.println("Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS BigInteger === " + jMetaDataGeneral.getDurationString1AsBigInteger());
    }

   /**
    * Test getDurationString1AsURL() method.
    */
    @Test
    public void subTestGetDurationString1AsURL() {
        assertEquals(null, this.jMetaDataGeneral.getDurationString1AsURL());
        System.out.println("Play time in format : HHh MMmn SSs MMMms, XX omited if zero AS URL === " + jMetaDataGeneral.getDurationString1AsURL());
    }

   /**
    * Test getOverallBitRateNominalStringAsInteger() method.
    */
    @Test
    public void subTestGetOverallBitRateNominalStringAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateNominalStringAsInteger());
        System.out.println("Nominal Bit rate (with measurement) AS Integer === " + jMetaDataGeneral.getOverallBitRateNominalStringAsInteger());
    }

   /**
    * Test getOverallBitRateNominalStringAsLong() method.
    */
    @Test
    public void subTestGetOverallBitRateNominalStringAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateNominalStringAsLong());
        System.out.println("Nominal Bit rate (with measurement) AS Long === " + jMetaDataGeneral.getOverallBitRateNominalStringAsLong());
    }

   /**
    * Test getOverallBitRateNominalStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetOverallBitRateNominalStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateNominalStringAsLocalDateTime());
        System.out.println("Nominal Bit rate (with measurement) AS LocalDateTime === " + jMetaDataGeneral.getOverallBitRateNominalStringAsLocalDateTime());
    }

   /**
    * Test getOverallBitRateNominalStringAsLocalTime() method.
    */
    @Test
    public void subTestGetOverallBitRateNominalStringAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateNominalStringAsLocalTime());
        System.out.println("Nominal Bit rate (with measurement) AS LocalTime === " + jMetaDataGeneral.getOverallBitRateNominalStringAsLocalTime());
    }

   /**
    * Test getOverallBitRateNominalStringAsString() method.
    */
    @Test
    public void subTestGetOverallBitRateNominalStringAsString() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateNominalStringAsString());
        System.out.println("Nominal Bit rate (with measurement) AS String === " + jMetaDataGeneral.getOverallBitRateNominalStringAsString());
    }

   /**
    * Test getOverallBitRateNominalStringAsBoolean() method.
    */
    @Test
    public void subTestGetOverallBitRateNominalStringAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateNominalStringAsBoolean());
        System.out.println("Nominal Bit rate (with measurement) AS Boolean === " + jMetaDataGeneral.getOverallBitRateNominalStringAsBoolean());
    }

   /**
    * Test getOverallBitRateNominalStringAsBigInteger() method.
    */
    @Test
    public void subTestGetOverallBitRateNominalStringAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateNominalStringAsBigInteger());
        System.out.println("Nominal Bit rate (with measurement) AS BigInteger === " + jMetaDataGeneral.getOverallBitRateNominalStringAsBigInteger());
    }

   /**
    * Test getOverallBitRateNominalStringAsURL() method.
    */
    @Test
    public void subTestGetOverallBitRateNominalStringAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateNominalStringAsURL());
        System.out.println("Nominal Bit rate (with measurement) AS URL === " + jMetaDataGeneral.getOverallBitRateNominalStringAsURL());
    }

   /**
    * Test getPeriodAsInteger() method.
    */
    @Test
    public void subTestGetPeriodAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getPeriodAsInteger());
        System.out.println("Describes the period that the piece is from or about. e.g. Renaissance. AS Integer === " + jMetaDataGeneral.getPeriodAsInteger());
    }

   /**
    * Test getPeriodAsLong() method.
    */
    @Test
    public void subTestGetPeriodAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getPeriodAsLong());
        System.out.println("Describes the period that the piece is from or about. e.g. Renaissance. AS Long === " + jMetaDataGeneral.getPeriodAsLong());
    }

   /**
    * Test getPeriodAsLocalDateTime() method.
    */
    @Test
    public void subTestGetPeriodAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getPeriodAsLocalDateTime());
        System.out.println("Describes the period that the piece is from or about. e.g. Renaissance. AS LocalDateTime === " + jMetaDataGeneral.getPeriodAsLocalDateTime());
    }

   /**
    * Test getPeriodAsLocalTime() method.
    */
    @Test
    public void subTestGetPeriodAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getPeriodAsLocalTime());
        System.out.println("Describes the period that the piece is from or about. e.g. Renaissance. AS LocalTime === " + jMetaDataGeneral.getPeriodAsLocalTime());
    }

   /**
    * Test getPeriodAsString() method.
    */
    @Test
    public void subTestGetPeriodAsString() {
        assertEquals(null, this.jMetaDataGeneral.getPeriodAsString());
        System.out.println("Describes the period that the piece is from or about. e.g. Renaissance. AS String === " + jMetaDataGeneral.getPeriodAsString());
    }

   /**
    * Test getPeriodAsBoolean() method.
    */
    @Test
    public void subTestGetPeriodAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getPeriodAsBoolean());
        System.out.println("Describes the period that the piece is from or about. e.g. Renaissance. AS Boolean === " + jMetaDataGeneral.getPeriodAsBoolean());
    }

   /**
    * Test getPeriodAsBigInteger() method.
    */
    @Test
    public void subTestGetPeriodAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getPeriodAsBigInteger());
        System.out.println("Describes the period that the piece is from or about. e.g. Renaissance. AS BigInteger === " + jMetaDataGeneral.getPeriodAsBigInteger());
    }

   /**
    * Test getPeriodAsURL() method.
    */
    @Test
    public void subTestGetPeriodAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getPeriodAsURL());
        System.out.println("Describes the period that the piece is from or about. e.g. Renaissance. AS URL === " + jMetaDataGeneral.getPeriodAsURL());
    }

   /**
    * Test getDurationString4AsInteger() method.
    */
    @Test
    public void subTestGetDurationString4AsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDurationString4AsInteger());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Integer === " + jMetaDataGeneral.getDurationString4AsInteger());
    }

   /**
    * Test getDurationString4AsLong() method.
    */
    @Test
    public void subTestGetDurationString4AsLong() {
        assertEquals(null, this.jMetaDataGeneral.getDurationString4AsLong());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Long === " + jMetaDataGeneral.getDurationString4AsLong());
    }

   /**
    * Test getDurationString4AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationString4AsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getDurationString4AsLocalDateTime());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS LocalDateTime === " + jMetaDataGeneral.getDurationString4AsLocalDateTime());
    }

   /**
    * Test getDurationString4AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationString4AsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getDurationString4AsLocalTime());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS LocalTime === " + jMetaDataGeneral.getDurationString4AsLocalTime());
    }

   /**
    * Test getDurationString4AsString() method.
    */
    @Test
    public void subTestGetDurationString4AsString() {
        assertEquals(null, this.jMetaDataGeneral.getDurationString4AsString());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS String === " + jMetaDataGeneral.getDurationString4AsString());
    }

   /**
    * Test getDurationString4AsBoolean() method.
    */
    @Test
    public void subTestGetDurationString4AsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getDurationString4AsBoolean());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS Boolean === " + jMetaDataGeneral.getDurationString4AsBoolean());
    }

   /**
    * Test getDurationString4AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationString4AsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDurationString4AsBigInteger());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS BigInteger === " + jMetaDataGeneral.getDurationString4AsBigInteger());
    }

   /**
    * Test getDurationString4AsURL() method.
    */
    @Test
    public void subTestGetDurationString4AsURL() {
        assertEquals(null, this.jMetaDataGeneral.getDurationString4AsURL());
        System.out.println("Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available AS URL === " + jMetaDataGeneral.getDurationString4AsURL());
    }

   /**
    * Test getDurationString5AsInteger() method.
    */
    @Test
    public void subTestGetDurationString5AsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDurationString5AsInteger());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Integer === " + jMetaDataGeneral.getDurationString5AsInteger());
    }

   /**
    * Test getDurationString5AsLong() method.
    */
    @Test
    public void subTestGetDurationString5AsLong() {
        assertEquals(null, this.jMetaDataGeneral.getDurationString5AsLong());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Long === " + jMetaDataGeneral.getDurationString5AsLong());
    }

   /**
    * Test getDurationString5AsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationString5AsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getDurationString5AsLocalDateTime());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS LocalDateTime === " + jMetaDataGeneral.getDurationString5AsLocalDateTime());
    }

   /**
    * Test getDurationString5AsLocalTime() method.
    */
    @Test
    public void subTestGetDurationString5AsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getDurationString5AsLocalTime());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS LocalTime === " + jMetaDataGeneral.getDurationString5AsLocalTime());
    }

   /**
    * Test getDurationString5AsString() method.
    */
    @Test
    public void subTestGetDurationString5AsString() {
        assertEquals(null, this.jMetaDataGeneral.getDurationString5AsString());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS String === " + jMetaDataGeneral.getDurationString5AsString());
    }

   /**
    * Test getDurationString5AsBoolean() method.
    */
    @Test
    public void subTestGetDurationString5AsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getDurationString5AsBoolean());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS Boolean === " + jMetaDataGeneral.getDurationString5AsBoolean());
    }

   /**
    * Test getDurationString5AsBigInteger() method.
    */
    @Test
    public void subTestGetDurationString5AsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDurationString5AsBigInteger());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS BigInteger === " + jMetaDataGeneral.getDurationString5AsBigInteger());
    }

   /**
    * Test getDurationString5AsURL() method.
    */
    @Test
    public void subTestGetDurationString5AsURL() {
        assertEquals(null, this.jMetaDataGeneral.getDurationString5AsURL());
        System.out.println("Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF) AS URL === " + jMetaDataGeneral.getDurationString5AsURL());
    }

   /**
    * Test getDurationStartAsInteger() method.
    */
    @Test
    public void subTestGetDurationStartAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDurationStartAsInteger());
        System.out.println("Duration_Start AS Integer === " + jMetaDataGeneral.getDurationStartAsInteger());
    }

   /**
    * Test getDurationStartAsLong() method.
    */
    @Test
    public void subTestGetDurationStartAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getDurationStartAsLong());
        System.out.println("Duration_Start AS Long === " + jMetaDataGeneral.getDurationStartAsLong());
    }

   /**
    * Test getDurationStartAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationStartAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getDurationStartAsLocalDateTime());
        System.out.println("Duration_Start AS LocalDateTime === " + jMetaDataGeneral.getDurationStartAsLocalDateTime());
    }

   /**
    * Test getDurationStartAsLocalTime() method.
    */
    @Test
    public void subTestGetDurationStartAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getDurationStartAsLocalTime());
        System.out.println("Duration_Start AS LocalTime === " + jMetaDataGeneral.getDurationStartAsLocalTime());
    }

   /**
    * Test getDurationStartAsString() method.
    */
    @Test
    public void subTestGetDurationStartAsString() {
        assertEquals(null, this.jMetaDataGeneral.getDurationStartAsString());
        System.out.println("Duration_Start AS String === " + jMetaDataGeneral.getDurationStartAsString());
    }

   /**
    * Test getDurationStartAsBoolean() method.
    */
    @Test
    public void subTestGetDurationStartAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getDurationStartAsBoolean());
        System.out.println("Duration_Start AS Boolean === " + jMetaDataGeneral.getDurationStartAsBoolean());
    }

   /**
    * Test getDurationStartAsBigInteger() method.
    */
    @Test
    public void subTestGetDurationStartAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDurationStartAsBigInteger());
        System.out.println("Duration_Start AS BigInteger === " + jMetaDataGeneral.getDurationStartAsBigInteger());
    }

   /**
    * Test getDurationStartAsURL() method.
    */
    @Test
    public void subTestGetDurationStartAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getDurationStartAsURL());
        System.out.println("Duration_Start AS URL === " + jMetaDataGeneral.getDurationStartAsURL());
    }

   /**
    * Test getOriginalNetworkNameAsInteger() method.
    */
    @Test
    public void subTestGetOriginalNetworkNameAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalNetworkNameAsInteger());
        System.out.println("OriginalNetworkName AS Integer === " + jMetaDataGeneral.getOriginalNetworkNameAsInteger());
    }

   /**
    * Test getOriginalNetworkNameAsLong() method.
    */
    @Test
    public void subTestGetOriginalNetworkNameAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalNetworkNameAsLong());
        System.out.println("OriginalNetworkName AS Long === " + jMetaDataGeneral.getOriginalNetworkNameAsLong());
    }

   /**
    * Test getOriginalNetworkNameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetOriginalNetworkNameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalNetworkNameAsLocalDateTime());
        System.out.println("OriginalNetworkName AS LocalDateTime === " + jMetaDataGeneral.getOriginalNetworkNameAsLocalDateTime());
    }

   /**
    * Test getOriginalNetworkNameAsLocalTime() method.
    */
    @Test
    public void subTestGetOriginalNetworkNameAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalNetworkNameAsLocalTime());
        System.out.println("OriginalNetworkName AS LocalTime === " + jMetaDataGeneral.getOriginalNetworkNameAsLocalTime());
    }

   /**
    * Test getOriginalNetworkNameAsString() method.
    */
    @Test
    public void subTestGetOriginalNetworkNameAsString() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalNetworkNameAsString());
        System.out.println("OriginalNetworkName AS String === " + jMetaDataGeneral.getOriginalNetworkNameAsString());
    }

   /**
    * Test getOriginalNetworkNameAsBoolean() method.
    */
    @Test
    public void subTestGetOriginalNetworkNameAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalNetworkNameAsBoolean());
        System.out.println("OriginalNetworkName AS Boolean === " + jMetaDataGeneral.getOriginalNetworkNameAsBoolean());
    }

   /**
    * Test getOriginalNetworkNameAsBigInteger() method.
    */
    @Test
    public void subTestGetOriginalNetworkNameAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalNetworkNameAsBigInteger());
        System.out.println("OriginalNetworkName AS BigInteger === " + jMetaDataGeneral.getOriginalNetworkNameAsBigInteger());
    }

   /**
    * Test getOriginalNetworkNameAsURL() method.
    */
    @Test
    public void subTestGetOriginalNetworkNameAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalNetworkNameAsURL());
        System.out.println("OriginalNetworkName AS URL === " + jMetaDataGeneral.getOriginalNetworkNameAsURL());
    }

   /**
    * Test getEPGPositionsBeginAsInteger() method.
    */
    @Test
    public void subTestGetEPGPositionsBeginAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEPGPositionsBeginAsInteger());
        System.out.println("EPG_Positions_Begin AS Integer === " + jMetaDataGeneral.getEPGPositionsBeginAsInteger());
    }

   /**
    * Test getEPGPositionsBeginAsLong() method.
    */
    @Test
    public void subTestGetEPGPositionsBeginAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getEPGPositionsBeginAsLong());
        System.out.println("EPG_Positions_Begin AS Long === " + jMetaDataGeneral.getEPGPositionsBeginAsLong());
    }

   /**
    * Test getEPGPositionsBeginAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEPGPositionsBeginAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getEPGPositionsBeginAsLocalDateTime());
        System.out.println("EPG_Positions_Begin AS LocalDateTime === " + jMetaDataGeneral.getEPGPositionsBeginAsLocalDateTime());
    }

   /**
    * Test getEPGPositionsBeginAsLocalTime() method.
    */
    @Test
    public void subTestGetEPGPositionsBeginAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getEPGPositionsBeginAsLocalTime());
        System.out.println("EPG_Positions_Begin AS LocalTime === " + jMetaDataGeneral.getEPGPositionsBeginAsLocalTime());
    }

   /**
    * Test getEPGPositionsBeginAsString() method.
    */
    @Test
    public void subTestGetEPGPositionsBeginAsString() {
        assertEquals(null, this.jMetaDataGeneral.getEPGPositionsBeginAsString());
        System.out.println("EPG_Positions_Begin AS String === " + jMetaDataGeneral.getEPGPositionsBeginAsString());
    }

   /**
    * Test getEPGPositionsBeginAsBoolean() method.
    */
    @Test
    public void subTestGetEPGPositionsBeginAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getEPGPositionsBeginAsBoolean());
        System.out.println("EPG_Positions_Begin AS Boolean === " + jMetaDataGeneral.getEPGPositionsBeginAsBoolean());
    }

   /**
    * Test getEPGPositionsBeginAsBigInteger() method.
    */
    @Test
    public void subTestGetEPGPositionsBeginAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEPGPositionsBeginAsBigInteger());
        System.out.println("EPG_Positions_Begin AS BigInteger === " + jMetaDataGeneral.getEPGPositionsBeginAsBigInteger());
    }

   /**
    * Test getEPGPositionsBeginAsURL() method.
    */
    @Test
    public void subTestGetEPGPositionsBeginAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getEPGPositionsBeginAsURL());
        System.out.println("EPG_Positions_Begin AS URL === " + jMetaDataGeneral.getEPGPositionsBeginAsURL());
    }

   /**
    * Test getVideoFormatWithHintListAsInteger() method.
    */
    @Test
    public void subTestGetVideoFormatWithHintListAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getVideoFormatWithHintListAsInteger());
        System.out.println("Video Codecs in this file with popular name (hint), separated by / AS Integer === " + jMetaDataGeneral.getVideoFormatWithHintListAsInteger());
    }

   /**
    * Test getVideoFormatWithHintListAsLong() method.
    */
    @Test
    public void subTestGetVideoFormatWithHintListAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getVideoFormatWithHintListAsLong());
        System.out.println("Video Codecs in this file with popular name (hint), separated by / AS Long === " + jMetaDataGeneral.getVideoFormatWithHintListAsLong());
    }

   /**
    * Test getVideoFormatWithHintListAsLocalDateTime() method.
    */
    @Test
    public void subTestGetVideoFormatWithHintListAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getVideoFormatWithHintListAsLocalDateTime());
        System.out.println("Video Codecs in this file with popular name (hint), separated by / AS LocalDateTime === " + jMetaDataGeneral.getVideoFormatWithHintListAsLocalDateTime());
    }

   /**
    * Test getVideoFormatWithHintListAsLocalTime() method.
    */
    @Test
    public void subTestGetVideoFormatWithHintListAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getVideoFormatWithHintListAsLocalTime());
        System.out.println("Video Codecs in this file with popular name (hint), separated by / AS LocalTime === " + jMetaDataGeneral.getVideoFormatWithHintListAsLocalTime());
    }

   /**
    * Test getVideoFormatWithHintListAsString() method.
    */
    @Test
    public void subTestGetVideoFormatWithHintListAsString() {
        assertEquals(null, this.jMetaDataGeneral.getVideoFormatWithHintListAsString());
        System.out.println("Video Codecs in this file with popular name (hint), separated by / AS String === " + jMetaDataGeneral.getVideoFormatWithHintListAsString());
    }

   /**
    * Test getVideoFormatWithHintListAsBoolean() method.
    */
    @Test
    public void subTestGetVideoFormatWithHintListAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getVideoFormatWithHintListAsBoolean());
        System.out.println("Video Codecs in this file with popular name (hint), separated by / AS Boolean === " + jMetaDataGeneral.getVideoFormatWithHintListAsBoolean());
    }

   /**
    * Test getVideoFormatWithHintListAsBigInteger() method.
    */
    @Test
    public void subTestGetVideoFormatWithHintListAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getVideoFormatWithHintListAsBigInteger());
        System.out.println("Video Codecs in this file with popular name (hint), separated by / AS BigInteger === " + jMetaDataGeneral.getVideoFormatWithHintListAsBigInteger());
    }

   /**
    * Test getVideoFormatWithHintListAsURL() method.
    */
    @Test
    public void subTestGetVideoFormatWithHintListAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getVideoFormatWithHintListAsURL());
        System.out.println("Video Codecs in this file with popular name (hint), separated by / AS URL === " + jMetaDataGeneral.getVideoFormatWithHintListAsURL());
    }

   /**
    * Test getDelaySourceAsInteger() method.
    */
    @Test
    public void subTestGetDelaySourceAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDelaySourceAsInteger());
        System.out.println("Delay source (Container or Stream or empty) AS Integer === " + jMetaDataGeneral.getDelaySourceAsInteger());
    }

   /**
    * Test getDelaySourceAsLong() method.
    */
    @Test
    public void subTestGetDelaySourceAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getDelaySourceAsLong());
        System.out.println("Delay source (Container or Stream or empty) AS Long === " + jMetaDataGeneral.getDelaySourceAsLong());
    }

   /**
    * Test getDelaySourceAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelaySourceAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getDelaySourceAsLocalDateTime());
        System.out.println("Delay source (Container or Stream or empty) AS LocalDateTime === " + jMetaDataGeneral.getDelaySourceAsLocalDateTime());
    }

   /**
    * Test getDelaySourceAsLocalTime() method.
    */
    @Test
    public void subTestGetDelaySourceAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getDelaySourceAsLocalTime());
        System.out.println("Delay source (Container or Stream or empty) AS LocalTime === " + jMetaDataGeneral.getDelaySourceAsLocalTime());
    }

   /**
    * Test getDelaySourceAsString() method.
    */
    @Test
    public void subTestGetDelaySourceAsString() {
        assertEquals(null, this.jMetaDataGeneral.getDelaySourceAsString());
        System.out.println("Delay source (Container or Stream or empty) AS String === " + jMetaDataGeneral.getDelaySourceAsString());
    }

   /**
    * Test getDelaySourceAsBoolean() method.
    */
    @Test
    public void subTestGetDelaySourceAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getDelaySourceAsBoolean());
        System.out.println("Delay source (Container or Stream or empty) AS Boolean === " + jMetaDataGeneral.getDelaySourceAsBoolean());
    }

   /**
    * Test getDelaySourceAsBigInteger() method.
    */
    @Test
    public void subTestGetDelaySourceAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDelaySourceAsBigInteger());
        System.out.println("Delay source (Container or Stream or empty) AS BigInteger === " + jMetaDataGeneral.getDelaySourceAsBigInteger());
    }

   /**
    * Test getDelaySourceAsURL() method.
    */
    @Test
    public void subTestGetDelaySourceAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getDelaySourceAsURL());
        System.out.println("Delay source (Container or Stream or empty) AS URL === " + jMetaDataGeneral.getDelaySourceAsURL());
    }

   /**
    * Test getPerformerAsInteger() method.
    */
    @Test
    public void subTestGetPerformerAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getPerformerAsInteger());
        System.out.println("Main performer/artist of this file AS Integer === " + jMetaDataGeneral.getPerformerAsInteger());
    }

   /**
    * Test getPerformerAsLong() method.
    */
    @Test
    public void subTestGetPerformerAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getPerformerAsLong());
        System.out.println("Main performer/artist of this file AS Long === " + jMetaDataGeneral.getPerformerAsLong());
    }

   /**
    * Test getPerformerAsLocalDateTime() method.
    */
    @Test
    public void subTestGetPerformerAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getPerformerAsLocalDateTime());
        System.out.println("Main performer/artist of this file AS LocalDateTime === " + jMetaDataGeneral.getPerformerAsLocalDateTime());
    }

   /**
    * Test getPerformerAsLocalTime() method.
    */
    @Test
    public void subTestGetPerformerAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getPerformerAsLocalTime());
        System.out.println("Main performer/artist of this file AS LocalTime === " + jMetaDataGeneral.getPerformerAsLocalTime());
    }

   /**
    * Test getPerformerAsString() method.
    */
    @Test
    public void subTestGetPerformerAsString() {
        assertEquals(null, this.jMetaDataGeneral.getPerformerAsString());
        System.out.println("Main performer/artist of this file AS String === " + jMetaDataGeneral.getPerformerAsString());
    }

   /**
    * Test getPerformerAsBoolean() method.
    */
    @Test
    public void subTestGetPerformerAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getPerformerAsBoolean());
        System.out.println("Main performer/artist of this file AS Boolean === " + jMetaDataGeneral.getPerformerAsBoolean());
    }

   /**
    * Test getPerformerAsBigInteger() method.
    */
    @Test
    public void subTestGetPerformerAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getPerformerAsBigInteger());
        System.out.println("Main performer/artist of this file AS BigInteger === " + jMetaDataGeneral.getPerformerAsBigInteger());
    }

   /**
    * Test getPerformerAsURL() method.
    */
    @Test
    public void subTestGetPerformerAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getPerformerAsURL());
        System.out.println("Main performer/artist of this file AS URL === " + jMetaDataGeneral.getPerformerAsURL());
    }

   /**
    * Test getProducerAsInteger() method.
    */
    @Test
    public void subTestGetProducerAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getProducerAsInteger());
        System.out.println("Name of the producer of the movie. AS Integer === " + jMetaDataGeneral.getProducerAsInteger());
    }

   /**
    * Test getProducerAsLong() method.
    */
    @Test
    public void subTestGetProducerAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getProducerAsLong());
        System.out.println("Name of the producer of the movie. AS Long === " + jMetaDataGeneral.getProducerAsLong());
    }

   /**
    * Test getProducerAsLocalDateTime() method.
    */
    @Test
    public void subTestGetProducerAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getProducerAsLocalDateTime());
        System.out.println("Name of the producer of the movie. AS LocalDateTime === " + jMetaDataGeneral.getProducerAsLocalDateTime());
    }

   /**
    * Test getProducerAsLocalTime() method.
    */
    @Test
    public void subTestGetProducerAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getProducerAsLocalTime());
        System.out.println("Name of the producer of the movie. AS LocalTime === " + jMetaDataGeneral.getProducerAsLocalTime());
    }

   /**
    * Test getProducerAsString() method.
    */
    @Test
    public void subTestGetProducerAsString() {
        assertEquals(null, this.jMetaDataGeneral.getProducerAsString());
        System.out.println("Name of the producer of the movie. AS String === " + jMetaDataGeneral.getProducerAsString());
    }

   /**
    * Test getProducerAsBoolean() method.
    */
    @Test
    public void subTestGetProducerAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getProducerAsBoolean());
        System.out.println("Name of the producer of the movie. AS Boolean === " + jMetaDataGeneral.getProducerAsBoolean());
    }

   /**
    * Test getProducerAsBigInteger() method.
    */
    @Test
    public void subTestGetProducerAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getProducerAsBigInteger());
        System.out.println("Name of the producer of the movie. AS BigInteger === " + jMetaDataGeneral.getProducerAsBigInteger());
    }

   /**
    * Test getProducerAsURL() method.
    */
    @Test
    public void subTestGetProducerAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getProducerAsURL());
        System.out.println("Name of the producer of the movie. AS URL === " + jMetaDataGeneral.getProducerAsURL());
    }

   /**
    * Test getSeasonPositionTotalAsInteger() method.
    */
    @Test
    public void subTestGetSeasonPositionTotalAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getSeasonPositionTotalAsInteger());
        System.out.println("Place of the season e.g. 2 of 7 AS Integer === " + jMetaDataGeneral.getSeasonPositionTotalAsInteger());
    }

   /**
    * Test getSeasonPositionTotalAsLong() method.
    */
    @Test
    public void subTestGetSeasonPositionTotalAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getSeasonPositionTotalAsLong());
        System.out.println("Place of the season e.g. 2 of 7 AS Long === " + jMetaDataGeneral.getSeasonPositionTotalAsLong());
    }

   /**
    * Test getSeasonPositionTotalAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSeasonPositionTotalAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getSeasonPositionTotalAsLocalDateTime());
        System.out.println("Place of the season e.g. 2 of 7 AS LocalDateTime === " + jMetaDataGeneral.getSeasonPositionTotalAsLocalDateTime());
    }

   /**
    * Test getSeasonPositionTotalAsLocalTime() method.
    */
    @Test
    public void subTestGetSeasonPositionTotalAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getSeasonPositionTotalAsLocalTime());
        System.out.println("Place of the season e.g. 2 of 7 AS LocalTime === " + jMetaDataGeneral.getSeasonPositionTotalAsLocalTime());
    }

   /**
    * Test getSeasonPositionTotalAsString() method.
    */
    @Test
    public void subTestGetSeasonPositionTotalAsString() {
        assertEquals(null, this.jMetaDataGeneral.getSeasonPositionTotalAsString());
        System.out.println("Place of the season e.g. 2 of 7 AS String === " + jMetaDataGeneral.getSeasonPositionTotalAsString());
    }

   /**
    * Test getSeasonPositionTotalAsBoolean() method.
    */
    @Test
    public void subTestGetSeasonPositionTotalAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getSeasonPositionTotalAsBoolean());
        System.out.println("Place of the season e.g. 2 of 7 AS Boolean === " + jMetaDataGeneral.getSeasonPositionTotalAsBoolean());
    }

   /**
    * Test getSeasonPositionTotalAsBigInteger() method.
    */
    @Test
    public void subTestGetSeasonPositionTotalAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getSeasonPositionTotalAsBigInteger());
        System.out.println("Place of the season e.g. 2 of 7 AS BigInteger === " + jMetaDataGeneral.getSeasonPositionTotalAsBigInteger());
    }

   /**
    * Test getSeasonPositionTotalAsURL() method.
    */
    @Test
    public void subTestGetSeasonPositionTotalAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getSeasonPositionTotalAsURL());
        System.out.println("Place of the season e.g. 2 of 7 AS URL === " + jMetaDataGeneral.getSeasonPositionTotalAsURL());
    }

   /**
    * Test getActorCharacterAsInteger() method.
    */
    @Test
    public void subTestGetActorCharacterAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getActorCharacterAsInteger());
        System.out.println("Name of the character an actor or actress plays in this movie. AS Integer === " + jMetaDataGeneral.getActorCharacterAsInteger());
    }

   /**
    * Test getActorCharacterAsLong() method.
    */
    @Test
    public void subTestGetActorCharacterAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getActorCharacterAsLong());
        System.out.println("Name of the character an actor or actress plays in this movie. AS Long === " + jMetaDataGeneral.getActorCharacterAsLong());
    }

   /**
    * Test getActorCharacterAsLocalDateTime() method.
    */
    @Test
    public void subTestGetActorCharacterAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getActorCharacterAsLocalDateTime());
        System.out.println("Name of the character an actor or actress plays in this movie. AS LocalDateTime === " + jMetaDataGeneral.getActorCharacterAsLocalDateTime());
    }

   /**
    * Test getActorCharacterAsLocalTime() method.
    */
    @Test
    public void subTestGetActorCharacterAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getActorCharacterAsLocalTime());
        System.out.println("Name of the character an actor or actress plays in this movie. AS LocalTime === " + jMetaDataGeneral.getActorCharacterAsLocalTime());
    }

   /**
    * Test getActorCharacterAsString() method.
    */
    @Test
    public void subTestGetActorCharacterAsString() {
        assertEquals(null, this.jMetaDataGeneral.getActorCharacterAsString());
        System.out.println("Name of the character an actor or actress plays in this movie. AS String === " + jMetaDataGeneral.getActorCharacterAsString());
    }

   /**
    * Test getActorCharacterAsBoolean() method.
    */
    @Test
    public void subTestGetActorCharacterAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getActorCharacterAsBoolean());
        System.out.println("Name of the character an actor or actress plays in this movie. AS Boolean === " + jMetaDataGeneral.getActorCharacterAsBoolean());
    }

   /**
    * Test getActorCharacterAsBigInteger() method.
    */
    @Test
    public void subTestGetActorCharacterAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getActorCharacterAsBigInteger());
        System.out.println("Name of the character an actor or actress plays in this movie. AS BigInteger === " + jMetaDataGeneral.getActorCharacterAsBigInteger());
    }

   /**
    * Test getActorCharacterAsURL() method.
    */
    @Test
    public void subTestGetActorCharacterAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getActorCharacterAsURL());
        System.out.println("Name of the character an actor or actress plays in this movie. AS URL === " + jMetaDataGeneral.getActorCharacterAsURL());
    }

   /**
    * Test getOverallBitRateMaximumAsInteger() method.
    */
    @Test
    public void subTestGetOverallBitRateMaximumAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateMaximumAsInteger());
        System.out.println("Maximum Bit rate in bps AS Integer === " + jMetaDataGeneral.getOverallBitRateMaximumAsInteger());
    }

   /**
    * Test getOverallBitRateMaximumAsLong() method.
    */
    @Test
    public void subTestGetOverallBitRateMaximumAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateMaximumAsLong());
        System.out.println("Maximum Bit rate in bps AS Long === " + jMetaDataGeneral.getOverallBitRateMaximumAsLong());
    }

   /**
    * Test getOverallBitRateMaximumAsLocalDateTime() method.
    */
    @Test
    public void subTestGetOverallBitRateMaximumAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateMaximumAsLocalDateTime());
        System.out.println("Maximum Bit rate in bps AS LocalDateTime === " + jMetaDataGeneral.getOverallBitRateMaximumAsLocalDateTime());
    }

   /**
    * Test getOverallBitRateMaximumAsLocalTime() method.
    */
    @Test
    public void subTestGetOverallBitRateMaximumAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateMaximumAsLocalTime());
        System.out.println("Maximum Bit rate in bps AS LocalTime === " + jMetaDataGeneral.getOverallBitRateMaximumAsLocalTime());
    }

   /**
    * Test getOverallBitRateMaximumAsString() method.
    */
    @Test
    public void subTestGetOverallBitRateMaximumAsString() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateMaximumAsString());
        System.out.println("Maximum Bit rate in bps AS String === " + jMetaDataGeneral.getOverallBitRateMaximumAsString());
    }

   /**
    * Test getOverallBitRateMaximumAsBoolean() method.
    */
    @Test
    public void subTestGetOverallBitRateMaximumAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateMaximumAsBoolean());
        System.out.println("Maximum Bit rate in bps AS Boolean === " + jMetaDataGeneral.getOverallBitRateMaximumAsBoolean());
    }

   /**
    * Test getOverallBitRateMaximumAsBigInteger() method.
    */
    @Test
    public void subTestGetOverallBitRateMaximumAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateMaximumAsBigInteger());
        System.out.println("Maximum Bit rate in bps AS BigInteger === " + jMetaDataGeneral.getOverallBitRateMaximumAsBigInteger());
    }

   /**
    * Test getOverallBitRateMaximumAsURL() method.
    */
    @Test
    public void subTestGetOverallBitRateMaximumAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateMaximumAsURL());
        System.out.println("Maximum Bit rate in bps AS URL === " + jMetaDataGeneral.getOverallBitRateMaximumAsURL());
    }

   /**
    * Test getCollectionAsInteger() method.
    */
    @Test
    public void subTestGetCollectionAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCollectionAsInteger());
        System.out.println("Name of the series, e.g. Starwars movies, Stargate SG-1, Stargate Atlantis, Buffy, Angel AS Integer === " + jMetaDataGeneral.getCollectionAsInteger());
    }

   /**
    * Test getCollectionAsLong() method.
    */
    @Test
    public void subTestGetCollectionAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getCollectionAsLong());
        System.out.println("Name of the series, e.g. Starwars movies, Stargate SG-1, Stargate Atlantis, Buffy, Angel AS Long === " + jMetaDataGeneral.getCollectionAsLong());
    }

   /**
    * Test getCollectionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCollectionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getCollectionAsLocalDateTime());
        System.out.println("Name of the series, e.g. Starwars movies, Stargate SG-1, Stargate Atlantis, Buffy, Angel AS LocalDateTime === " + jMetaDataGeneral.getCollectionAsLocalDateTime());
    }

   /**
    * Test getCollectionAsLocalTime() method.
    */
    @Test
    public void subTestGetCollectionAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getCollectionAsLocalTime());
        System.out.println("Name of the series, e.g. Starwars movies, Stargate SG-1, Stargate Atlantis, Buffy, Angel AS LocalTime === " + jMetaDataGeneral.getCollectionAsLocalTime());
    }

   /**
    * Test getCollectionAsString() method.
    */
    @Test
    public void subTestGetCollectionAsString() {
        assertEquals(null, this.jMetaDataGeneral.getCollectionAsString());
        System.out.println("Name of the series, e.g. Starwars movies, Stargate SG-1, Stargate Atlantis, Buffy, Angel AS String === " + jMetaDataGeneral.getCollectionAsString());
    }

   /**
    * Test getCollectionAsBoolean() method.
    */
    @Test
    public void subTestGetCollectionAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getCollectionAsBoolean());
        System.out.println("Name of the series, e.g. Starwars movies, Stargate SG-1, Stargate Atlantis, Buffy, Angel AS Boolean === " + jMetaDataGeneral.getCollectionAsBoolean());
    }

   /**
    * Test getCollectionAsBigInteger() method.
    */
    @Test
    public void subTestGetCollectionAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCollectionAsBigInteger());
        System.out.println("Name of the series, e.g. Starwars movies, Stargate SG-1, Stargate Atlantis, Buffy, Angel AS BigInteger === " + jMetaDataGeneral.getCollectionAsBigInteger());
    }

   /**
    * Test getCollectionAsURL() method.
    */
    @Test
    public void subTestGetCollectionAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getCollectionAsURL());
        System.out.println("Name of the series, e.g. Starwars movies, Stargate SG-1, Stargate Atlantis, Buffy, Angel AS URL === " + jMetaDataGeneral.getCollectionAsURL());
    }

   /**
    * Test getStreamSizeDemuxedAsInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedAsInteger());
        System.out.println("StreamSize in bytes of hte stream after demux AS Integer === " + jMetaDataGeneral.getStreamSizeDemuxedAsInteger());
    }

   /**
    * Test getStreamSizeDemuxedAsLong() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedAsLong());
        System.out.println("StreamSize in bytes of hte stream after demux AS Long === " + jMetaDataGeneral.getStreamSizeDemuxedAsLong());
    }

   /**
    * Test getStreamSizeDemuxedAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedAsLocalDateTime());
        System.out.println("StreamSize in bytes of hte stream after demux AS LocalDateTime === " + jMetaDataGeneral.getStreamSizeDemuxedAsLocalDateTime());
    }

   /**
    * Test getStreamSizeDemuxedAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedAsLocalTime());
        System.out.println("StreamSize in bytes of hte stream after demux AS LocalTime === " + jMetaDataGeneral.getStreamSizeDemuxedAsLocalTime());
    }

   /**
    * Test getStreamSizeDemuxedAsString() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedAsString() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedAsString());
        System.out.println("StreamSize in bytes of hte stream after demux AS String === " + jMetaDataGeneral.getStreamSizeDemuxedAsString());
    }

   /**
    * Test getStreamSizeDemuxedAsBoolean() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedAsBoolean());
        System.out.println("StreamSize in bytes of hte stream after demux AS Boolean === " + jMetaDataGeneral.getStreamSizeDemuxedAsBoolean());
    }

   /**
    * Test getStreamSizeDemuxedAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedAsBigInteger());
        System.out.println("StreamSize in bytes of hte stream after demux AS BigInteger === " + jMetaDataGeneral.getStreamSizeDemuxedAsBigInteger());
    }

   /**
    * Test getStreamSizeDemuxedAsURL() method.
    */
    @Test
    public void subTestGetStreamSizeDemuxedAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getStreamSizeDemuxedAsURL());
        System.out.println("StreamSize in bytes of hte stream after demux AS URL === " + jMetaDataGeneral.getStreamSizeDemuxedAsURL());
    }

   /**
    * Test getMenuFormatWithHintListAsInteger() method.
    */
    @Test
    public void subTestGetMenuFormatWithHintListAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getMenuFormatWithHintListAsInteger());
        System.out.println("Menu Codecs in this file with popular name (hint),separated by / AS Integer === " + jMetaDataGeneral.getMenuFormatWithHintListAsInteger());
    }

   /**
    * Test getMenuFormatWithHintListAsLong() method.
    */
    @Test
    public void subTestGetMenuFormatWithHintListAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getMenuFormatWithHintListAsLong());
        System.out.println("Menu Codecs in this file with popular name (hint),separated by / AS Long === " + jMetaDataGeneral.getMenuFormatWithHintListAsLong());
    }

   /**
    * Test getMenuFormatWithHintListAsLocalDateTime() method.
    */
    @Test
    public void subTestGetMenuFormatWithHintListAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getMenuFormatWithHintListAsLocalDateTime());
        System.out.println("Menu Codecs in this file with popular name (hint),separated by / AS LocalDateTime === " + jMetaDataGeneral.getMenuFormatWithHintListAsLocalDateTime());
    }

   /**
    * Test getMenuFormatWithHintListAsLocalTime() method.
    */
    @Test
    public void subTestGetMenuFormatWithHintListAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getMenuFormatWithHintListAsLocalTime());
        System.out.println("Menu Codecs in this file with popular name (hint),separated by / AS LocalTime === " + jMetaDataGeneral.getMenuFormatWithHintListAsLocalTime());
    }

   /**
    * Test getMenuFormatWithHintListAsString() method.
    */
    @Test
    public void subTestGetMenuFormatWithHintListAsString() {
        assertEquals(null, this.jMetaDataGeneral.getMenuFormatWithHintListAsString());
        System.out.println("Menu Codecs in this file with popular name (hint),separated by / AS String === " + jMetaDataGeneral.getMenuFormatWithHintListAsString());
    }

   /**
    * Test getMenuFormatWithHintListAsBoolean() method.
    */
    @Test
    public void subTestGetMenuFormatWithHintListAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getMenuFormatWithHintListAsBoolean());
        System.out.println("Menu Codecs in this file with popular name (hint),separated by / AS Boolean === " + jMetaDataGeneral.getMenuFormatWithHintListAsBoolean());
    }

   /**
    * Test getMenuFormatWithHintListAsBigInteger() method.
    */
    @Test
    public void subTestGetMenuFormatWithHintListAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getMenuFormatWithHintListAsBigInteger());
        System.out.println("Menu Codecs in this file with popular name (hint),separated by / AS BigInteger === " + jMetaDataGeneral.getMenuFormatWithHintListAsBigInteger());
    }

   /**
    * Test getMenuFormatWithHintListAsURL() method.
    */
    @Test
    public void subTestGetMenuFormatWithHintListAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getMenuFormatWithHintListAsURL());
        System.out.println("Menu Codecs in this file with popular name (hint),separated by / AS URL === " + jMetaDataGeneral.getMenuFormatWithHintListAsURL());
    }

   /**
    * Test getFormatSettingsAsInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFormatSettingsAsInteger());
        System.out.println("Settings needed for decoder used AS Integer === " + jMetaDataGeneral.getFormatSettingsAsInteger());
    }

   /**
    * Test getFormatSettingsAsLong() method.
    */
    @Test
    public void subTestGetFormatSettingsAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getFormatSettingsAsLong());
        System.out.println("Settings needed for decoder used AS Long === " + jMetaDataGeneral.getFormatSettingsAsLong());
    }

   /**
    * Test getFormatSettingsAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatSettingsAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getFormatSettingsAsLocalDateTime());
        System.out.println("Settings needed for decoder used AS LocalDateTime === " + jMetaDataGeneral.getFormatSettingsAsLocalDateTime());
    }

   /**
    * Test getFormatSettingsAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatSettingsAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getFormatSettingsAsLocalTime());
        System.out.println("Settings needed for decoder used AS LocalTime === " + jMetaDataGeneral.getFormatSettingsAsLocalTime());
    }

   /**
    * Test getFormatSettingsAsString() method.
    */
    @Test
    public void subTestGetFormatSettingsAsString() {
        assertEquals(null, this.jMetaDataGeneral.getFormatSettingsAsString());
        System.out.println("Settings needed for decoder used AS String === " + jMetaDataGeneral.getFormatSettingsAsString());
    }

   /**
    * Test getFormatSettingsAsBoolean() method.
    */
    @Test
    public void subTestGetFormatSettingsAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getFormatSettingsAsBoolean());
        System.out.println("Settings needed for decoder used AS Boolean === " + jMetaDataGeneral.getFormatSettingsAsBoolean());
    }

   /**
    * Test getFormatSettingsAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatSettingsAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFormatSettingsAsBigInteger());
        System.out.println("Settings needed for decoder used AS BigInteger === " + jMetaDataGeneral.getFormatSettingsAsBigInteger());
    }

   /**
    * Test getFormatSettingsAsURL() method.
    */
    @Test
    public void subTestGetFormatSettingsAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getFormatSettingsAsURL());
        System.out.println("Settings needed for decoder used AS URL === " + jMetaDataGeneral.getFormatSettingsAsURL());
    }

   /**
    * Test getFileNameLastAsInteger() method.
    */
    @Test
    public void subTestGetFileNameLastAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFileNameLastAsInteger());
        System.out.println("File name only of the last file (in the case of a sequence of files) AS Integer === " + jMetaDataGeneral.getFileNameLastAsInteger());
    }

   /**
    * Test getFileNameLastAsLong() method.
    */
    @Test
    public void subTestGetFileNameLastAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getFileNameLastAsLong());
        System.out.println("File name only of the last file (in the case of a sequence of files) AS Long === " + jMetaDataGeneral.getFileNameLastAsLong());
    }

   /**
    * Test getFileNameLastAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFileNameLastAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getFileNameLastAsLocalDateTime());
        System.out.println("File name only of the last file (in the case of a sequence of files) AS LocalDateTime === " + jMetaDataGeneral.getFileNameLastAsLocalDateTime());
    }

   /**
    * Test getFileNameLastAsLocalTime() method.
    */
    @Test
    public void subTestGetFileNameLastAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getFileNameLastAsLocalTime());
        System.out.println("File name only of the last file (in the case of a sequence of files) AS LocalTime === " + jMetaDataGeneral.getFileNameLastAsLocalTime());
    }

   /**
    * Test getFileNameLastAsString() method.
    */
    @Test
    public void subTestGetFileNameLastAsString() {
        assertEquals(null, this.jMetaDataGeneral.getFileNameLastAsString());
        System.out.println("File name only of the last file (in the case of a sequence of files) AS String === " + jMetaDataGeneral.getFileNameLastAsString());
    }

   /**
    * Test getFileNameLastAsBoolean() method.
    */
    @Test
    public void subTestGetFileNameLastAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getFileNameLastAsBoolean());
        System.out.println("File name only of the last file (in the case of a sequence of files) AS Boolean === " + jMetaDataGeneral.getFileNameLastAsBoolean());
    }

   /**
    * Test getFileNameLastAsBigInteger() method.
    */
    @Test
    public void subTestGetFileNameLastAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFileNameLastAsBigInteger());
        System.out.println("File name only of the last file (in the case of a sequence of files) AS BigInteger === " + jMetaDataGeneral.getFileNameLastAsBigInteger());
    }

   /**
    * Test getFileNameLastAsURL() method.
    */
    @Test
    public void subTestGetFileNameLastAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getFileNameLastAsURL());
        System.out.println("File name only of the last file (in the case of a sequence of files) AS URL === " + jMetaDataGeneral.getFileNameLastAsURL());
    }

   /**
    * Test getBPMAsInteger() method.
    */
    @Test
    public void subTestGetBPMAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getBPMAsInteger());
        System.out.println("Average number of beats per minute AS Integer === " + jMetaDataGeneral.getBPMAsInteger());
    }

   /**
    * Test getBPMAsLong() method.
    */
    @Test
    public void subTestGetBPMAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getBPMAsLong());
        System.out.println("Average number of beats per minute AS Long === " + jMetaDataGeneral.getBPMAsLong());
    }

   /**
    * Test getBPMAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBPMAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getBPMAsLocalDateTime());
        System.out.println("Average number of beats per minute AS LocalDateTime === " + jMetaDataGeneral.getBPMAsLocalDateTime());
    }

   /**
    * Test getBPMAsLocalTime() method.
    */
    @Test
    public void subTestGetBPMAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getBPMAsLocalTime());
        System.out.println("Average number of beats per minute AS LocalTime === " + jMetaDataGeneral.getBPMAsLocalTime());
    }

   /**
    * Test getBPMAsString() method.
    */
    @Test
    public void subTestGetBPMAsString() {
        assertEquals(null, this.jMetaDataGeneral.getBPMAsString());
        System.out.println("Average number of beats per minute AS String === " + jMetaDataGeneral.getBPMAsString());
    }

   /**
    * Test getBPMAsBoolean() method.
    */
    @Test
    public void subTestGetBPMAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getBPMAsBoolean());
        System.out.println("Average number of beats per minute AS Boolean === " + jMetaDataGeneral.getBPMAsBoolean());
    }

   /**
    * Test getBPMAsBigInteger() method.
    */
    @Test
    public void subTestGetBPMAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getBPMAsBigInteger());
        System.out.println("Average number of beats per minute AS BigInteger === " + jMetaDataGeneral.getBPMAsBigInteger());
    }

   /**
    * Test getBPMAsURL() method.
    */
    @Test
    public void subTestGetBPMAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getBPMAsURL());
        System.out.println("Average number of beats per minute AS URL === " + jMetaDataGeneral.getBPMAsURL());
    }

   /**
    * Test getFileSizeAsInteger() method.
    */
    @Test
    public void subTestGetFileSizeAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeAsInteger());
        System.out.println("File size in bytes AS Integer === " + jMetaDataGeneral.getFileSizeAsInteger());
    }

   /**
    * Test getFileSizeAsLong() method.
    */
    @Test
    public void subTestGetFileSizeAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeAsLong());
        System.out.println("File size in bytes AS Long === " + jMetaDataGeneral.getFileSizeAsLong());
    }

   /**
    * Test getFileSizeAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFileSizeAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeAsLocalDateTime());
        System.out.println("File size in bytes AS LocalDateTime === " + jMetaDataGeneral.getFileSizeAsLocalDateTime());
    }

   /**
    * Test getFileSizeAsLocalTime() method.
    */
    @Test
    public void subTestGetFileSizeAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeAsLocalTime());
        System.out.println("File size in bytes AS LocalTime === " + jMetaDataGeneral.getFileSizeAsLocalTime());
    }

   /**
    * Test getFileSizeAsString() method.
    */
    @Test
    public void subTestGetFileSizeAsString() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeAsString());
        System.out.println("File size in bytes AS String === " + jMetaDataGeneral.getFileSizeAsString());
    }

   /**
    * Test getFileSizeAsBoolean() method.
    */
    @Test
    public void subTestGetFileSizeAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeAsBoolean());
        System.out.println("File size in bytes AS Boolean === " + jMetaDataGeneral.getFileSizeAsBoolean());
    }

   /**
    * Test getFileSizeAsBigInteger() method.
    */
    @Test
    public void subTestGetFileSizeAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeAsBigInteger());
        System.out.println("File size in bytes AS BigInteger === " + jMetaDataGeneral.getFileSizeAsBigInteger());
    }

   /**
    * Test getFileSizeAsURL() method.
    */
    @Test
    public void subTestGetFileSizeAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getFileSizeAsURL());
        System.out.println("File size in bytes AS URL === " + jMetaDataGeneral.getFileSizeAsURL());
    }

   /**
    * Test getFirstPacketOrderAsInteger() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFirstPacketOrderAsInteger());
        System.out.println("Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0) AS Integer === " + jMetaDataGeneral.getFirstPacketOrderAsInteger());
    }

   /**
    * Test getFirstPacketOrderAsLong() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getFirstPacketOrderAsLong());
        System.out.println("Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0) AS Long === " + jMetaDataGeneral.getFirstPacketOrderAsLong());
    }

   /**
    * Test getFirstPacketOrderAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getFirstPacketOrderAsLocalDateTime());
        System.out.println("Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0) AS LocalDateTime === " + jMetaDataGeneral.getFirstPacketOrderAsLocalDateTime());
    }

   /**
    * Test getFirstPacketOrderAsLocalTime() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getFirstPacketOrderAsLocalTime());
        System.out.println("Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0) AS LocalTime === " + jMetaDataGeneral.getFirstPacketOrderAsLocalTime());
    }

   /**
    * Test getFirstPacketOrderAsString() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsString() {
        assertEquals(null, this.jMetaDataGeneral.getFirstPacketOrderAsString());
        System.out.println("Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0) AS String === " + jMetaDataGeneral.getFirstPacketOrderAsString());
    }

   /**
    * Test getFirstPacketOrderAsBoolean() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getFirstPacketOrderAsBoolean());
        System.out.println("Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0) AS Boolean === " + jMetaDataGeneral.getFirstPacketOrderAsBoolean());
    }

   /**
    * Test getFirstPacketOrderAsBigInteger() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFirstPacketOrderAsBigInteger());
        System.out.println("Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0) AS BigInteger === " + jMetaDataGeneral.getFirstPacketOrderAsBigInteger());
    }

   /**
    * Test getFirstPacketOrderAsURL() method.
    */
    @Test
    public void subTestGetFirstPacketOrderAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getFirstPacketOrderAsURL());
        System.out.println("Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0) AS URL === " + jMetaDataGeneral.getFirstPacketOrderAsURL());
    }

   /**
    * Test getIsStreamableAsInteger() method.
    */
    @Test
    public void subTestGetIsStreamableAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getIsStreamableAsInteger());
        System.out.println("IsStreamable AS Integer === " + jMetaDataGeneral.getIsStreamableAsInteger());
    }

   /**
    * Test getIsStreamableAsLong() method.
    */
    @Test
    public void subTestGetIsStreamableAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getIsStreamableAsLong());
        System.out.println("IsStreamable AS Long === " + jMetaDataGeneral.getIsStreamableAsLong());
    }

   /**
    * Test getIsStreamableAsLocalDateTime() method.
    */
    @Test
    public void subTestGetIsStreamableAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getIsStreamableAsLocalDateTime());
        System.out.println("IsStreamable AS LocalDateTime === " + jMetaDataGeneral.getIsStreamableAsLocalDateTime());
    }

   /**
    * Test getIsStreamableAsLocalTime() method.
    */
    @Test
    public void subTestGetIsStreamableAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getIsStreamableAsLocalTime());
        System.out.println("IsStreamable AS LocalTime === " + jMetaDataGeneral.getIsStreamableAsLocalTime());
    }

   /**
    * Test getIsStreamableAsString() method.
    */
    @Test
    public void subTestGetIsStreamableAsString() {
        assertEquals(null, this.jMetaDataGeneral.getIsStreamableAsString());
        System.out.println("IsStreamable AS String === " + jMetaDataGeneral.getIsStreamableAsString());
    }

   /**
    * Test getIsStreamableAsBoolean() method.
    */
    @Test
    public void subTestGetIsStreamableAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getIsStreamableAsBoolean());
        System.out.println("IsStreamable AS Boolean === " + jMetaDataGeneral.getIsStreamableAsBoolean());
    }

   /**
    * Test getIsStreamableAsBigInteger() method.
    */
    @Test
    public void subTestGetIsStreamableAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getIsStreamableAsBigInteger());
        System.out.println("IsStreamable AS BigInteger === " + jMetaDataGeneral.getIsStreamableAsBigInteger());
    }

   /**
    * Test getIsStreamableAsURL() method.
    */
    @Test
    public void subTestGetIsStreamableAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getIsStreamableAsURL());
        System.out.println("IsStreamable AS URL === " + jMetaDataGeneral.getIsStreamableAsURL());
    }

   /**
    * Test getLyricistAsInteger() method.
    */
    @Test
    public void subTestGetLyricistAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getLyricistAsInteger());
        System.out.println("The person who wrote the lyrics for a musical item. AS Integer === " + jMetaDataGeneral.getLyricistAsInteger());
    }

   /**
    * Test getLyricistAsLong() method.
    */
    @Test
    public void subTestGetLyricistAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getLyricistAsLong());
        System.out.println("The person who wrote the lyrics for a musical item. AS Long === " + jMetaDataGeneral.getLyricistAsLong());
    }

   /**
    * Test getLyricistAsLocalDateTime() method.
    */
    @Test
    public void subTestGetLyricistAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getLyricistAsLocalDateTime());
        System.out.println("The person who wrote the lyrics for a musical item. AS LocalDateTime === " + jMetaDataGeneral.getLyricistAsLocalDateTime());
    }

   /**
    * Test getLyricistAsLocalTime() method.
    */
    @Test
    public void subTestGetLyricistAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getLyricistAsLocalTime());
        System.out.println("The person who wrote the lyrics for a musical item. AS LocalTime === " + jMetaDataGeneral.getLyricistAsLocalTime());
    }

   /**
    * Test getLyricistAsString() method.
    */
    @Test
    public void subTestGetLyricistAsString() {
        assertEquals(null, this.jMetaDataGeneral.getLyricistAsString());
        System.out.println("The person who wrote the lyrics for a musical item. AS String === " + jMetaDataGeneral.getLyricistAsString());
    }

   /**
    * Test getLyricistAsBoolean() method.
    */
    @Test
    public void subTestGetLyricistAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getLyricistAsBoolean());
        System.out.println("The person who wrote the lyrics for a musical item. AS Boolean === " + jMetaDataGeneral.getLyricistAsBoolean());
    }

   /**
    * Test getLyricistAsBigInteger() method.
    */
    @Test
    public void subTestGetLyricistAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getLyricistAsBigInteger());
        System.out.println("The person who wrote the lyrics for a musical item. AS BigInteger === " + jMetaDataGeneral.getLyricistAsBigInteger());
    }

   /**
    * Test getLyricistAsURL() method.
    */
    @Test
    public void subTestGetLyricistAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getLyricistAsURL());
        System.out.println("The person who wrote the lyrics for a musical item. AS URL === " + jMetaDataGeneral.getLyricistAsURL());
    }

   /**
    * Test getDurationEndAsInteger() method.
    */
    @Test
    public void subTestGetDurationEndAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDurationEndAsInteger());
        System.out.println("Duration_End AS Integer === " + jMetaDataGeneral.getDurationEndAsInteger());
    }

   /**
    * Test getDurationEndAsLong() method.
    */
    @Test
    public void subTestGetDurationEndAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getDurationEndAsLong());
        System.out.println("Duration_End AS Long === " + jMetaDataGeneral.getDurationEndAsLong());
    }

   /**
    * Test getDurationEndAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDurationEndAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getDurationEndAsLocalDateTime());
        System.out.println("Duration_End AS LocalDateTime === " + jMetaDataGeneral.getDurationEndAsLocalDateTime());
    }

   /**
    * Test getDurationEndAsLocalTime() method.
    */
    @Test
    public void subTestGetDurationEndAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getDurationEndAsLocalTime());
        System.out.println("Duration_End AS LocalTime === " + jMetaDataGeneral.getDurationEndAsLocalTime());
    }

   /**
    * Test getDurationEndAsString() method.
    */
    @Test
    public void subTestGetDurationEndAsString() {
        assertEquals(null, this.jMetaDataGeneral.getDurationEndAsString());
        System.out.println("Duration_End AS String === " + jMetaDataGeneral.getDurationEndAsString());
    }

   /**
    * Test getDurationEndAsBoolean() method.
    */
    @Test
    public void subTestGetDurationEndAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getDurationEndAsBoolean());
        System.out.println("Duration_End AS Boolean === " + jMetaDataGeneral.getDurationEndAsBoolean());
    }

   /**
    * Test getDurationEndAsBigInteger() method.
    */
    @Test
    public void subTestGetDurationEndAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDurationEndAsBigInteger());
        System.out.println("Duration_End AS BigInteger === " + jMetaDataGeneral.getDurationEndAsBigInteger());
    }

   /**
    * Test getDurationEndAsURL() method.
    */
    @Test
    public void subTestGetDurationEndAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getDurationEndAsURL());
        System.out.println("Duration_End AS URL === " + jMetaDataGeneral.getDurationEndAsURL());
    }

   /**
    * Test getFormatExtensionsAsInteger() method.
    */
    @Test
    public void subTestGetFormatExtensionsAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFormatExtensionsAsInteger());
        System.out.println("Known extensions of this format AS Integer === " + jMetaDataGeneral.getFormatExtensionsAsInteger());
    }

   /**
    * Test getFormatExtensionsAsLong() method.
    */
    @Test
    public void subTestGetFormatExtensionsAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getFormatExtensionsAsLong());
        System.out.println("Known extensions of this format AS Long === " + jMetaDataGeneral.getFormatExtensionsAsLong());
    }

   /**
    * Test getFormatExtensionsAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatExtensionsAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getFormatExtensionsAsLocalDateTime());
        System.out.println("Known extensions of this format AS LocalDateTime === " + jMetaDataGeneral.getFormatExtensionsAsLocalDateTime());
    }

   /**
    * Test getFormatExtensionsAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatExtensionsAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getFormatExtensionsAsLocalTime());
        System.out.println("Known extensions of this format AS LocalTime === " + jMetaDataGeneral.getFormatExtensionsAsLocalTime());
    }

   /**
    * Test getFormatExtensionsAsString() method.
    */
    @Test
    public void subTestGetFormatExtensionsAsString() {
        assertEquals(null, this.jMetaDataGeneral.getFormatExtensionsAsString());
        System.out.println("Known extensions of this format AS String === " + jMetaDataGeneral.getFormatExtensionsAsString());
    }

   /**
    * Test getFormatExtensionsAsBoolean() method.
    */
    @Test
    public void subTestGetFormatExtensionsAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getFormatExtensionsAsBoolean());
        System.out.println("Known extensions of this format AS Boolean === " + jMetaDataGeneral.getFormatExtensionsAsBoolean());
    }

   /**
    * Test getFormatExtensionsAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatExtensionsAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFormatExtensionsAsBigInteger());
        System.out.println("Known extensions of this format AS BigInteger === " + jMetaDataGeneral.getFormatExtensionsAsBigInteger());
    }

   /**
    * Test getFormatExtensionsAsURL() method.
    */
    @Test
    public void subTestGetFormatExtensionsAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getFormatExtensionsAsURL());
        System.out.println("Known extensions of this format AS URL === " + jMetaDataGeneral.getFormatExtensionsAsURL());
    }

   /**
    * Test getProducerCopyrightAsInteger() method.
    */
    @Test
    public void subTestGetProducerCopyrightAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getProducerCopyrightAsInteger());
        System.out.println("The copyright information as per the productioncopyright holder. AS Integer === " + jMetaDataGeneral.getProducerCopyrightAsInteger());
    }

   /**
    * Test getProducerCopyrightAsLong() method.
    */
    @Test
    public void subTestGetProducerCopyrightAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getProducerCopyrightAsLong());
        System.out.println("The copyright information as per the productioncopyright holder. AS Long === " + jMetaDataGeneral.getProducerCopyrightAsLong());
    }

   /**
    * Test getProducerCopyrightAsLocalDateTime() method.
    */
    @Test
    public void subTestGetProducerCopyrightAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getProducerCopyrightAsLocalDateTime());
        System.out.println("The copyright information as per the productioncopyright holder. AS LocalDateTime === " + jMetaDataGeneral.getProducerCopyrightAsLocalDateTime());
    }

   /**
    * Test getProducerCopyrightAsLocalTime() method.
    */
    @Test
    public void subTestGetProducerCopyrightAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getProducerCopyrightAsLocalTime());
        System.out.println("The copyright information as per the productioncopyright holder. AS LocalTime === " + jMetaDataGeneral.getProducerCopyrightAsLocalTime());
    }

   /**
    * Test getProducerCopyrightAsString() method.
    */
    @Test
    public void subTestGetProducerCopyrightAsString() {
        assertEquals(null, this.jMetaDataGeneral.getProducerCopyrightAsString());
        System.out.println("The copyright information as per the productioncopyright holder. AS String === " + jMetaDataGeneral.getProducerCopyrightAsString());
    }

   /**
    * Test getProducerCopyrightAsBoolean() method.
    */
    @Test
    public void subTestGetProducerCopyrightAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getProducerCopyrightAsBoolean());
        System.out.println("The copyright information as per the productioncopyright holder. AS Boolean === " + jMetaDataGeneral.getProducerCopyrightAsBoolean());
    }

   /**
    * Test getProducerCopyrightAsBigInteger() method.
    */
    @Test
    public void subTestGetProducerCopyrightAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getProducerCopyrightAsBigInteger());
        System.out.println("The copyright information as per the productioncopyright holder. AS BigInteger === " + jMetaDataGeneral.getProducerCopyrightAsBigInteger());
    }

   /**
    * Test getProducerCopyrightAsURL() method.
    */
    @Test
    public void subTestGetProducerCopyrightAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getProducerCopyrightAsURL());
        System.out.println("The copyright information as per the productioncopyright holder. AS URL === " + jMetaDataGeneral.getProducerCopyrightAsURL());
    }

   /**
    * Test getBarCodeAsInteger() method.
    */
    @Test
    public void subTestGetBarCodeAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getBarCodeAsInteger());
        System.out.println("EAN-13 (13-digit European Article Numbering) or UPC-A (12-digit Universal Product Code) bar code identifier. AS Integer === " + jMetaDataGeneral.getBarCodeAsInteger());
    }

   /**
    * Test getBarCodeAsLong() method.
    */
    @Test
    public void subTestGetBarCodeAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getBarCodeAsLong());
        System.out.println("EAN-13 (13-digit European Article Numbering) or UPC-A (12-digit Universal Product Code) bar code identifier. AS Long === " + jMetaDataGeneral.getBarCodeAsLong());
    }

   /**
    * Test getBarCodeAsLocalDateTime() method.
    */
    @Test
    public void subTestGetBarCodeAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getBarCodeAsLocalDateTime());
        System.out.println("EAN-13 (13-digit European Article Numbering) or UPC-A (12-digit Universal Product Code) bar code identifier. AS LocalDateTime === " + jMetaDataGeneral.getBarCodeAsLocalDateTime());
    }

   /**
    * Test getBarCodeAsLocalTime() method.
    */
    @Test
    public void subTestGetBarCodeAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getBarCodeAsLocalTime());
        System.out.println("EAN-13 (13-digit European Article Numbering) or UPC-A (12-digit Universal Product Code) bar code identifier. AS LocalTime === " + jMetaDataGeneral.getBarCodeAsLocalTime());
    }

   /**
    * Test getBarCodeAsString() method.
    */
    @Test
    public void subTestGetBarCodeAsString() {
        assertEquals(null, this.jMetaDataGeneral.getBarCodeAsString());
        System.out.println("EAN-13 (13-digit European Article Numbering) or UPC-A (12-digit Universal Product Code) bar code identifier. AS String === " + jMetaDataGeneral.getBarCodeAsString());
    }

   /**
    * Test getBarCodeAsBoolean() method.
    */
    @Test
    public void subTestGetBarCodeAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getBarCodeAsBoolean());
        System.out.println("EAN-13 (13-digit European Article Numbering) or UPC-A (12-digit Universal Product Code) bar code identifier. AS Boolean === " + jMetaDataGeneral.getBarCodeAsBoolean());
    }

   /**
    * Test getBarCodeAsBigInteger() method.
    */
    @Test
    public void subTestGetBarCodeAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getBarCodeAsBigInteger());
        System.out.println("EAN-13 (13-digit European Article Numbering) or UPC-A (12-digit Universal Product Code) bar code identifier. AS BigInteger === " + jMetaDataGeneral.getBarCodeAsBigInteger());
    }

   /**
    * Test getBarCodeAsURL() method.
    */
    @Test
    public void subTestGetBarCodeAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getBarCodeAsURL());
        System.out.println("EAN-13 (13-digit European Article Numbering) or UPC-A (12-digit Universal Product Code) bar code identifier. AS URL === " + jMetaDataGeneral.getBarCodeAsURL());
    }

   /**
    * Test getOverallBitRateStringAsInteger() method.
    */
    @Test
    public void subTestGetOverallBitRateStringAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateStringAsInteger());
        System.out.println("Bit rate of all streams (with measure) AS Integer === " + jMetaDataGeneral.getOverallBitRateStringAsInteger());
    }

   /**
    * Test getOverallBitRateStringAsLong() method.
    */
    @Test
    public void subTestGetOverallBitRateStringAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateStringAsLong());
        System.out.println("Bit rate of all streams (with measure) AS Long === " + jMetaDataGeneral.getOverallBitRateStringAsLong());
    }

   /**
    * Test getOverallBitRateStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetOverallBitRateStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateStringAsLocalDateTime());
        System.out.println("Bit rate of all streams (with measure) AS LocalDateTime === " + jMetaDataGeneral.getOverallBitRateStringAsLocalDateTime());
    }

   /**
    * Test getOverallBitRateStringAsLocalTime() method.
    */
    @Test
    public void subTestGetOverallBitRateStringAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateStringAsLocalTime());
        System.out.println("Bit rate of all streams (with measure) AS LocalTime === " + jMetaDataGeneral.getOverallBitRateStringAsLocalTime());
    }

   /**
    * Test getOverallBitRateStringAsString() method.
    */
    @Test
    public void subTestGetOverallBitRateStringAsString() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateStringAsString());
        System.out.println("Bit rate of all streams (with measure) AS String === " + jMetaDataGeneral.getOverallBitRateStringAsString());
    }

   /**
    * Test getOverallBitRateStringAsBoolean() method.
    */
    @Test
    public void subTestGetOverallBitRateStringAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateStringAsBoolean());
        System.out.println("Bit rate of all streams (with measure) AS Boolean === " + jMetaDataGeneral.getOverallBitRateStringAsBoolean());
    }

   /**
    * Test getOverallBitRateStringAsBigInteger() method.
    */
    @Test
    public void subTestGetOverallBitRateStringAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateStringAsBigInteger());
        System.out.println("Bit rate of all streams (with measure) AS BigInteger === " + jMetaDataGeneral.getOverallBitRateStringAsBigInteger());
    }

   /**
    * Test getOverallBitRateStringAsURL() method.
    */
    @Test
    public void subTestGetOverallBitRateStringAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getOverallBitRateStringAsURL());
        System.out.println("Bit rate of all streams (with measure) AS URL === " + jMetaDataGeneral.getOverallBitRateStringAsURL());
    }

   /**
    * Test getTextCountAsInteger() method.
    */
    @Test
    public void subTestGetTextCountAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getTextCountAsInteger());
        System.out.println("Number of text streams AS Integer === " + jMetaDataGeneral.getTextCountAsInteger());
    }

   /**
    * Test getTextCountAsLong() method.
    */
    @Test
    public void subTestGetTextCountAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getTextCountAsLong());
        System.out.println("Number of text streams AS Long === " + jMetaDataGeneral.getTextCountAsLong());
    }

   /**
    * Test getTextCountAsLocalDateTime() method.
    */
    @Test
    public void subTestGetTextCountAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getTextCountAsLocalDateTime());
        System.out.println("Number of text streams AS LocalDateTime === " + jMetaDataGeneral.getTextCountAsLocalDateTime());
    }

   /**
    * Test getTextCountAsLocalTime() method.
    */
    @Test
    public void subTestGetTextCountAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getTextCountAsLocalTime());
        System.out.println("Number of text streams AS LocalTime === " + jMetaDataGeneral.getTextCountAsLocalTime());
    }

   /**
    * Test getTextCountAsString() method.
    */
    @Test
    public void subTestGetTextCountAsString() {
        assertEquals(null, this.jMetaDataGeneral.getTextCountAsString());
        System.out.println("Number of text streams AS String === " + jMetaDataGeneral.getTextCountAsString());
    }

   /**
    * Test getTextCountAsBoolean() method.
    */
    @Test
    public void subTestGetTextCountAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getTextCountAsBoolean());
        System.out.println("Number of text streams AS Boolean === " + jMetaDataGeneral.getTextCountAsBoolean());
    }

   /**
    * Test getTextCountAsBigInteger() method.
    */
    @Test
    public void subTestGetTextCountAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getTextCountAsBigInteger());
        System.out.println("Number of text streams AS BigInteger === " + jMetaDataGeneral.getTextCountAsBigInteger());
    }

   /**
    * Test getTextCountAsURL() method.
    */
    @Test
    public void subTestGetTextCountAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getTextCountAsURL());
        System.out.println("Number of text streams AS URL === " + jMetaDataGeneral.getTextCountAsURL());
    }

   /**
    * Test getSoundEngineerAsInteger() method.
    */
    @Test
    public void subTestGetSoundEngineerAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getSoundEngineerAsInteger());
        System.out.println("The name of the sound engineer or sound recordist. AS Integer === " + jMetaDataGeneral.getSoundEngineerAsInteger());
    }

   /**
    * Test getSoundEngineerAsLong() method.
    */
    @Test
    public void subTestGetSoundEngineerAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getSoundEngineerAsLong());
        System.out.println("The name of the sound engineer or sound recordist. AS Long === " + jMetaDataGeneral.getSoundEngineerAsLong());
    }

   /**
    * Test getSoundEngineerAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSoundEngineerAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getSoundEngineerAsLocalDateTime());
        System.out.println("The name of the sound engineer or sound recordist. AS LocalDateTime === " + jMetaDataGeneral.getSoundEngineerAsLocalDateTime());
    }

   /**
    * Test getSoundEngineerAsLocalTime() method.
    */
    @Test
    public void subTestGetSoundEngineerAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getSoundEngineerAsLocalTime());
        System.out.println("The name of the sound engineer or sound recordist. AS LocalTime === " + jMetaDataGeneral.getSoundEngineerAsLocalTime());
    }

   /**
    * Test getSoundEngineerAsString() method.
    */
    @Test
    public void subTestGetSoundEngineerAsString() {
        assertEquals(null, this.jMetaDataGeneral.getSoundEngineerAsString());
        System.out.println("The name of the sound engineer or sound recordist. AS String === " + jMetaDataGeneral.getSoundEngineerAsString());
    }

   /**
    * Test getSoundEngineerAsBoolean() method.
    */
    @Test
    public void subTestGetSoundEngineerAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getSoundEngineerAsBoolean());
        System.out.println("The name of the sound engineer or sound recordist. AS Boolean === " + jMetaDataGeneral.getSoundEngineerAsBoolean());
    }

   /**
    * Test getSoundEngineerAsBigInteger() method.
    */
    @Test
    public void subTestGetSoundEngineerAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getSoundEngineerAsBigInteger());
        System.out.println("The name of the sound engineer or sound recordist. AS BigInteger === " + jMetaDataGeneral.getSoundEngineerAsBigInteger());
    }

   /**
    * Test getSoundEngineerAsURL() method.
    */
    @Test
    public void subTestGetSoundEngineerAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getSoundEngineerAsURL());
        System.out.println("The name of the sound engineer or sound recordist. AS URL === " + jMetaDataGeneral.getSoundEngineerAsURL());
    }

   /**
    * Test getLabelCodeAsInteger() method.
    */
    @Test
    public void subTestGetLabelCodeAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getLabelCodeAsInteger());
        System.out.println("A 4-digit or 5-digit number to identify the record label, typically printed as (LC) xxxx or (LC) 0xxxx on CDs medias or covers, with only the number being stored. AS Integer === " + jMetaDataGeneral.getLabelCodeAsInteger());
    }

   /**
    * Test getLabelCodeAsLong() method.
    */
    @Test
    public void subTestGetLabelCodeAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getLabelCodeAsLong());
        System.out.println("A 4-digit or 5-digit number to identify the record label, typically printed as (LC) xxxx or (LC) 0xxxx on CDs medias or covers, with only the number being stored. AS Long === " + jMetaDataGeneral.getLabelCodeAsLong());
    }

   /**
    * Test getLabelCodeAsLocalDateTime() method.
    */
    @Test
    public void subTestGetLabelCodeAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getLabelCodeAsLocalDateTime());
        System.out.println("A 4-digit or 5-digit number to identify the record label, typically printed as (LC) xxxx or (LC) 0xxxx on CDs medias or covers, with only the number being stored. AS LocalDateTime === " + jMetaDataGeneral.getLabelCodeAsLocalDateTime());
    }

   /**
    * Test getLabelCodeAsLocalTime() method.
    */
    @Test
    public void subTestGetLabelCodeAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getLabelCodeAsLocalTime());
        System.out.println("A 4-digit or 5-digit number to identify the record label, typically printed as (LC) xxxx or (LC) 0xxxx on CDs medias or covers, with only the number being stored. AS LocalTime === " + jMetaDataGeneral.getLabelCodeAsLocalTime());
    }

   /**
    * Test getLabelCodeAsString() method.
    */
    @Test
    public void subTestGetLabelCodeAsString() {
        assertEquals(null, this.jMetaDataGeneral.getLabelCodeAsString());
        System.out.println("A 4-digit or 5-digit number to identify the record label, typically printed as (LC) xxxx or (LC) 0xxxx on CDs medias or covers, with only the number being stored. AS String === " + jMetaDataGeneral.getLabelCodeAsString());
    }

   /**
    * Test getLabelCodeAsBoolean() method.
    */
    @Test
    public void subTestGetLabelCodeAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getLabelCodeAsBoolean());
        System.out.println("A 4-digit or 5-digit number to identify the record label, typically printed as (LC) xxxx or (LC) 0xxxx on CDs medias or covers, with only the number being stored. AS Boolean === " + jMetaDataGeneral.getLabelCodeAsBoolean());
    }

   /**
    * Test getLabelCodeAsBigInteger() method.
    */
    @Test
    public void subTestGetLabelCodeAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getLabelCodeAsBigInteger());
        System.out.println("A 4-digit or 5-digit number to identify the record label, typically printed as (LC) xxxx or (LC) 0xxxx on CDs medias or covers, with only the number being stored. AS BigInteger === " + jMetaDataGeneral.getLabelCodeAsBigInteger());
    }

   /**
    * Test getLabelCodeAsURL() method.
    */
    @Test
    public void subTestGetLabelCodeAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getLabelCodeAsURL());
        System.out.println("A 4-digit or 5-digit number to identify the record label, typically printed as (LC) xxxx or (LC) 0xxxx on CDs medias or covers, with only the number being stored. AS URL === " + jMetaDataGeneral.getLabelCodeAsURL());
    }

   /**
    * Test getImageCountAsInteger() method.
    */
    @Test
    public void subTestGetImageCountAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getImageCountAsInteger());
        System.out.println("Number of image streams AS Integer === " + jMetaDataGeneral.getImageCountAsInteger());
    }

   /**
    * Test getImageCountAsLong() method.
    */
    @Test
    public void subTestGetImageCountAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getImageCountAsLong());
        System.out.println("Number of image streams AS Long === " + jMetaDataGeneral.getImageCountAsLong());
    }

   /**
    * Test getImageCountAsLocalDateTime() method.
    */
    @Test
    public void subTestGetImageCountAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getImageCountAsLocalDateTime());
        System.out.println("Number of image streams AS LocalDateTime === " + jMetaDataGeneral.getImageCountAsLocalDateTime());
    }

   /**
    * Test getImageCountAsLocalTime() method.
    */
    @Test
    public void subTestGetImageCountAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getImageCountAsLocalTime());
        System.out.println("Number of image streams AS LocalTime === " + jMetaDataGeneral.getImageCountAsLocalTime());
    }

   /**
    * Test getImageCountAsString() method.
    */
    @Test
    public void subTestGetImageCountAsString() {
        assertEquals(null, this.jMetaDataGeneral.getImageCountAsString());
        System.out.println("Number of image streams AS String === " + jMetaDataGeneral.getImageCountAsString());
    }

   /**
    * Test getImageCountAsBoolean() method.
    */
    @Test
    public void subTestGetImageCountAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getImageCountAsBoolean());
        System.out.println("Number of image streams AS Boolean === " + jMetaDataGeneral.getImageCountAsBoolean());
    }

   /**
    * Test getImageCountAsBigInteger() method.
    */
    @Test
    public void subTestGetImageCountAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getImageCountAsBigInteger());
        System.out.println("Number of image streams AS BigInteger === " + jMetaDataGeneral.getImageCountAsBigInteger());
    }

   /**
    * Test getImageCountAsURL() method.
    */
    @Test
    public void subTestGetImageCountAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getImageCountAsURL());
        System.out.println("Number of image streams AS URL === " + jMetaDataGeneral.getImageCountAsURL());
    }

   /**
    * Test getFormatAsInteger() method.
    */
    @Test
    public void subTestGetFormatAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFormatAsInteger());
        System.out.println("Format used AS Integer === " + jMetaDataGeneral.getFormatAsInteger());
    }

   /**
    * Test getFormatAsLong() method.
    */
    @Test
    public void subTestGetFormatAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getFormatAsLong());
        System.out.println("Format used AS Long === " + jMetaDataGeneral.getFormatAsLong());
    }

   /**
    * Test getFormatAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getFormatAsLocalDateTime());
        System.out.println("Format used AS LocalDateTime === " + jMetaDataGeneral.getFormatAsLocalDateTime());
    }

   /**
    * Test getFormatAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getFormatAsLocalTime());
        System.out.println("Format used AS LocalTime === " + jMetaDataGeneral.getFormatAsLocalTime());
    }

   /**
    * Test getFormatAsString() method.
    */
    @Test
    public void subTestGetFormatAsString() {
        assertEquals(null, this.jMetaDataGeneral.getFormatAsString());
        System.out.println("Format used AS String === " + jMetaDataGeneral.getFormatAsString());
    }

   /**
    * Test getFormatAsBoolean() method.
    */
    @Test
    public void subTestGetFormatAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getFormatAsBoolean());
        System.out.println("Format used AS Boolean === " + jMetaDataGeneral.getFormatAsBoolean());
    }

   /**
    * Test getFormatAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFormatAsBigInteger());
        System.out.println("Format used AS BigInteger === " + jMetaDataGeneral.getFormatAsBigInteger());
    }

   /**
    * Test getFormatAsURL() method.
    */
    @Test
    public void subTestGetFormatAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getFormatAsURL());
        System.out.println("Format used AS URL === " + jMetaDataGeneral.getFormatAsURL());
    }

   /**
    * Test getWrittenByAsInteger() method.
    */
    @Test
    public void subTestGetWrittenByAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getWrittenByAsInteger());
        System.out.println("The author of the story or script. AS Integer === " + jMetaDataGeneral.getWrittenByAsInteger());
    }

   /**
    * Test getWrittenByAsLong() method.
    */
    @Test
    public void subTestGetWrittenByAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getWrittenByAsLong());
        System.out.println("The author of the story or script. AS Long === " + jMetaDataGeneral.getWrittenByAsLong());
    }

   /**
    * Test getWrittenByAsLocalDateTime() method.
    */
    @Test
    public void subTestGetWrittenByAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getWrittenByAsLocalDateTime());
        System.out.println("The author of the story or script. AS LocalDateTime === " + jMetaDataGeneral.getWrittenByAsLocalDateTime());
    }

   /**
    * Test getWrittenByAsLocalTime() method.
    */
    @Test
    public void subTestGetWrittenByAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getWrittenByAsLocalTime());
        System.out.println("The author of the story or script. AS LocalTime === " + jMetaDataGeneral.getWrittenByAsLocalTime());
    }

   /**
    * Test getWrittenByAsString() method.
    */
    @Test
    public void subTestGetWrittenByAsString() {
        assertEquals(null, this.jMetaDataGeneral.getWrittenByAsString());
        System.out.println("The author of the story or script. AS String === " + jMetaDataGeneral.getWrittenByAsString());
    }

   /**
    * Test getWrittenByAsBoolean() method.
    */
    @Test
    public void subTestGetWrittenByAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getWrittenByAsBoolean());
        System.out.println("The author of the story or script. AS Boolean === " + jMetaDataGeneral.getWrittenByAsBoolean());
    }

   /**
    * Test getWrittenByAsBigInteger() method.
    */
    @Test
    public void subTestGetWrittenByAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getWrittenByAsBigInteger());
        System.out.println("The author of the story or script. AS BigInteger === " + jMetaDataGeneral.getWrittenByAsBigInteger());
    }

   /**
    * Test getWrittenByAsURL() method.
    */
    @Test
    public void subTestGetWrittenByAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getWrittenByAsURL());
        System.out.println("The author of the story or script. AS URL === " + jMetaDataGeneral.getWrittenByAsURL());
    }

   /**
    * Test getTrackPositionTotalAsInteger() method.
    */
    @Test
    public void subTestGetTrackPositionTotalAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getTrackPositionTotalAsInteger());
        System.out.println("Place of this track, e.g. 3 of 15 AS Integer === " + jMetaDataGeneral.getTrackPositionTotalAsInteger());
    }

   /**
    * Test getTrackPositionTotalAsLong() method.
    */
    @Test
    public void subTestGetTrackPositionTotalAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getTrackPositionTotalAsLong());
        System.out.println("Place of this track, e.g. 3 of 15 AS Long === " + jMetaDataGeneral.getTrackPositionTotalAsLong());
    }

   /**
    * Test getTrackPositionTotalAsLocalDateTime() method.
    */
    @Test
    public void subTestGetTrackPositionTotalAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getTrackPositionTotalAsLocalDateTime());
        System.out.println("Place of this track, e.g. 3 of 15 AS LocalDateTime === " + jMetaDataGeneral.getTrackPositionTotalAsLocalDateTime());
    }

   /**
    * Test getTrackPositionTotalAsLocalTime() method.
    */
    @Test
    public void subTestGetTrackPositionTotalAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getTrackPositionTotalAsLocalTime());
        System.out.println("Place of this track, e.g. 3 of 15 AS LocalTime === " + jMetaDataGeneral.getTrackPositionTotalAsLocalTime());
    }

   /**
    * Test getTrackPositionTotalAsString() method.
    */
    @Test
    public void subTestGetTrackPositionTotalAsString() {
        assertEquals(null, this.jMetaDataGeneral.getTrackPositionTotalAsString());
        System.out.println("Place of this track, e.g. 3 of 15 AS String === " + jMetaDataGeneral.getTrackPositionTotalAsString());
    }

   /**
    * Test getTrackPositionTotalAsBoolean() method.
    */
    @Test
    public void subTestGetTrackPositionTotalAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getTrackPositionTotalAsBoolean());
        System.out.println("Place of this track, e.g. 3 of 15 AS Boolean === " + jMetaDataGeneral.getTrackPositionTotalAsBoolean());
    }

   /**
    * Test getTrackPositionTotalAsBigInteger() method.
    */
    @Test
    public void subTestGetTrackPositionTotalAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getTrackPositionTotalAsBigInteger());
        System.out.println("Place of this track, e.g. 3 of 15 AS BigInteger === " + jMetaDataGeneral.getTrackPositionTotalAsBigInteger());
    }

   /**
    * Test getTrackPositionTotalAsURL() method.
    */
    @Test
    public void subTestGetTrackPositionTotalAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getTrackPositionTotalAsURL());
        System.out.println("Place of this track, e.g. 3 of 15 AS URL === " + jMetaDataGeneral.getTrackPositionTotalAsURL());
    }

   /**
    * Test getMovieCountryAsInteger() method.
    */
    @Test
    public void subTestGetMovieCountryAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getMovieCountryAsInteger());
        System.out.println("Country, where the movie was procuced AS Integer === " + jMetaDataGeneral.getMovieCountryAsInteger());
    }

   /**
    * Test getMovieCountryAsLong() method.
    */
    @Test
    public void subTestGetMovieCountryAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getMovieCountryAsLong());
        System.out.println("Country, where the movie was procuced AS Long === " + jMetaDataGeneral.getMovieCountryAsLong());
    }

   /**
    * Test getMovieCountryAsLocalDateTime() method.
    */
    @Test
    public void subTestGetMovieCountryAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getMovieCountryAsLocalDateTime());
        System.out.println("Country, where the movie was procuced AS LocalDateTime === " + jMetaDataGeneral.getMovieCountryAsLocalDateTime());
    }

   /**
    * Test getMovieCountryAsLocalTime() method.
    */
    @Test
    public void subTestGetMovieCountryAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getMovieCountryAsLocalTime());
        System.out.println("Country, where the movie was procuced AS LocalTime === " + jMetaDataGeneral.getMovieCountryAsLocalTime());
    }

   /**
    * Test getMovieCountryAsString() method.
    */
    @Test
    public void subTestGetMovieCountryAsString() {
        assertEquals(null, this.jMetaDataGeneral.getMovieCountryAsString());
        System.out.println("Country, where the movie was procuced AS String === " + jMetaDataGeneral.getMovieCountryAsString());
    }

   /**
    * Test getMovieCountryAsBoolean() method.
    */
    @Test
    public void subTestGetMovieCountryAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getMovieCountryAsBoolean());
        System.out.println("Country, where the movie was procuced AS Boolean === " + jMetaDataGeneral.getMovieCountryAsBoolean());
    }

   /**
    * Test getMovieCountryAsBigInteger() method.
    */
    @Test
    public void subTestGetMovieCountryAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getMovieCountryAsBigInteger());
        System.out.println("Country, where the movie was procuced AS BigInteger === " + jMetaDataGeneral.getMovieCountryAsBigInteger());
    }

   /**
    * Test getMovieCountryAsURL() method.
    */
    @Test
    public void subTestGetMovieCountryAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getMovieCountryAsURL());
        System.out.println("Country, where the movie was procuced AS URL === " + jMetaDataGeneral.getMovieCountryAsURL());
    }

   /**
    * Test getAlbumPerformerUrlAsInteger() method.
    */
    @Test
    public void subTestGetAlbumPerformerUrlAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumPerformerUrlAsInteger());
        System.out.println("Homepage of the album performer/artist AS Integer === " + jMetaDataGeneral.getAlbumPerformerUrlAsInteger());
    }

   /**
    * Test getAlbumPerformerUrlAsLong() method.
    */
    @Test
    public void subTestGetAlbumPerformerUrlAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumPerformerUrlAsLong());
        System.out.println("Homepage of the album performer/artist AS Long === " + jMetaDataGeneral.getAlbumPerformerUrlAsLong());
    }

   /**
    * Test getAlbumPerformerUrlAsLocalDateTime() method.
    */
    @Test
    public void subTestGetAlbumPerformerUrlAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumPerformerUrlAsLocalDateTime());
        System.out.println("Homepage of the album performer/artist AS LocalDateTime === " + jMetaDataGeneral.getAlbumPerformerUrlAsLocalDateTime());
    }

   /**
    * Test getAlbumPerformerUrlAsLocalTime() method.
    */
    @Test
    public void subTestGetAlbumPerformerUrlAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumPerformerUrlAsLocalTime());
        System.out.println("Homepage of the album performer/artist AS LocalTime === " + jMetaDataGeneral.getAlbumPerformerUrlAsLocalTime());
    }

   /**
    * Test getAlbumPerformerUrlAsString() method.
    */
    @Test
    public void subTestGetAlbumPerformerUrlAsString() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumPerformerUrlAsString());
        System.out.println("Homepage of the album performer/artist AS String === " + jMetaDataGeneral.getAlbumPerformerUrlAsString());
    }

   /**
    * Test getAlbumPerformerUrlAsBoolean() method.
    */
    @Test
    public void subTestGetAlbumPerformerUrlAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumPerformerUrlAsBoolean());
        System.out.println("Homepage of the album performer/artist AS Boolean === " + jMetaDataGeneral.getAlbumPerformerUrlAsBoolean());
    }

   /**
    * Test getAlbumPerformerUrlAsBigInteger() method.
    */
    @Test
    public void subTestGetAlbumPerformerUrlAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumPerformerUrlAsBigInteger());
        System.out.println("Homepage of the album performer/artist AS BigInteger === " + jMetaDataGeneral.getAlbumPerformerUrlAsBigInteger());
    }

   /**
    * Test getAlbumPerformerUrlAsURL() method.
    */
    @Test
    public void subTestGetAlbumPerformerUrlAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getAlbumPerformerUrlAsURL());
        System.out.println("Homepage of the album performer/artist AS URL === " + jMetaDataGeneral.getAlbumPerformerUrlAsURL());
    }

   /**
    * Test getCodecIDStringAsInteger() method.
    */
    @Test
    public void subTestGetCodecIDStringAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDStringAsInteger());
        System.out.println("Codec ID (found in some containers) AS Integer === " + jMetaDataGeneral.getCodecIDStringAsInteger());
    }

   /**
    * Test getCodecIDStringAsLong() method.
    */
    @Test
    public void subTestGetCodecIDStringAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDStringAsLong());
        System.out.println("Codec ID (found in some containers) AS Long === " + jMetaDataGeneral.getCodecIDStringAsLong());
    }

   /**
    * Test getCodecIDStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCodecIDStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDStringAsLocalDateTime());
        System.out.println("Codec ID (found in some containers) AS LocalDateTime === " + jMetaDataGeneral.getCodecIDStringAsLocalDateTime());
    }

   /**
    * Test getCodecIDStringAsLocalTime() method.
    */
    @Test
    public void subTestGetCodecIDStringAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDStringAsLocalTime());
        System.out.println("Codec ID (found in some containers) AS LocalTime === " + jMetaDataGeneral.getCodecIDStringAsLocalTime());
    }

   /**
    * Test getCodecIDStringAsString() method.
    */
    @Test
    public void subTestGetCodecIDStringAsString() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDStringAsString());
        System.out.println("Codec ID (found in some containers) AS String === " + jMetaDataGeneral.getCodecIDStringAsString());
    }

   /**
    * Test getCodecIDStringAsBoolean() method.
    */
    @Test
    public void subTestGetCodecIDStringAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDStringAsBoolean());
        System.out.println("Codec ID (found in some containers) AS Boolean === " + jMetaDataGeneral.getCodecIDStringAsBoolean());
    }

   /**
    * Test getCodecIDStringAsBigInteger() method.
    */
    @Test
    public void subTestGetCodecIDStringAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDStringAsBigInteger());
        System.out.println("Codec ID (found in some containers) AS BigInteger === " + jMetaDataGeneral.getCodecIDStringAsBigInteger());
    }

   /**
    * Test getCodecIDStringAsURL() method.
    */
    @Test
    public void subTestGetCodecIDStringAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getCodecIDStringAsURL());
        System.out.println("Codec ID (found in some containers) AS URL === " + jMetaDataGeneral.getCodecIDStringAsURL());
    }

   /**
    * Test getEncodedLibraryCompanyNameAsInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryCompanyNameAsInteger());
        System.out.println("Name of the company AS Integer === " + jMetaDataGeneral.getEncodedLibraryCompanyNameAsInteger());
    }

   /**
    * Test getEncodedLibraryCompanyNameAsLong() method.
    */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryCompanyNameAsLong());
        System.out.println("Name of the company AS Long === " + jMetaDataGeneral.getEncodedLibraryCompanyNameAsLong());
    }

   /**
    * Test getEncodedLibraryCompanyNameAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryCompanyNameAsLocalDateTime());
        System.out.println("Name of the company AS LocalDateTime === " + jMetaDataGeneral.getEncodedLibraryCompanyNameAsLocalDateTime());
    }

   /**
    * Test getEncodedLibraryCompanyNameAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryCompanyNameAsLocalTime());
        System.out.println("Name of the company AS LocalTime === " + jMetaDataGeneral.getEncodedLibraryCompanyNameAsLocalTime());
    }

   /**
    * Test getEncodedLibraryCompanyNameAsString() method.
    */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsString() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryCompanyNameAsString());
        System.out.println("Name of the company AS String === " + jMetaDataGeneral.getEncodedLibraryCompanyNameAsString());
    }

   /**
    * Test getEncodedLibraryCompanyNameAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryCompanyNameAsBoolean());
        System.out.println("Name of the company AS Boolean === " + jMetaDataGeneral.getEncodedLibraryCompanyNameAsBoolean());
    }

   /**
    * Test getEncodedLibraryCompanyNameAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryCompanyNameAsBigInteger());
        System.out.println("Name of the company AS BigInteger === " + jMetaDataGeneral.getEncodedLibraryCompanyNameAsBigInteger());
    }

   /**
    * Test getEncodedLibraryCompanyNameAsURL() method.
    */
    @Test
    public void subTestGetEncodedLibraryCompanyNameAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedLibraryCompanyNameAsURL());
        System.out.println("Name of the company AS URL === " + jMetaDataGeneral.getEncodedLibraryCompanyNameAsURL());
    }

   /**
    * Test getComicAsInteger() method.
    */
    @Test
    public void subTestGetComicAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getComicAsInteger());
        System.out.println("Name of the comic. AS Integer === " + jMetaDataGeneral.getComicAsInteger());
    }

   /**
    * Test getComicAsLong() method.
    */
    @Test
    public void subTestGetComicAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getComicAsLong());
        System.out.println("Name of the comic. AS Long === " + jMetaDataGeneral.getComicAsLong());
    }

   /**
    * Test getComicAsLocalDateTime() method.
    */
    @Test
    public void subTestGetComicAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getComicAsLocalDateTime());
        System.out.println("Name of the comic. AS LocalDateTime === " + jMetaDataGeneral.getComicAsLocalDateTime());
    }

   /**
    * Test getComicAsLocalTime() method.
    */
    @Test
    public void subTestGetComicAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getComicAsLocalTime());
        System.out.println("Name of the comic. AS LocalTime === " + jMetaDataGeneral.getComicAsLocalTime());
    }

   /**
    * Test getComicAsString() method.
    */
    @Test
    public void subTestGetComicAsString() {
        assertEquals(null, this.jMetaDataGeneral.getComicAsString());
        System.out.println("Name of the comic. AS String === " + jMetaDataGeneral.getComicAsString());
    }

   /**
    * Test getComicAsBoolean() method.
    */
    @Test
    public void subTestGetComicAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getComicAsBoolean());
        System.out.println("Name of the comic. AS Boolean === " + jMetaDataGeneral.getComicAsBoolean());
    }

   /**
    * Test getComicAsBigInteger() method.
    */
    @Test
    public void subTestGetComicAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getComicAsBigInteger());
        System.out.println("Name of the comic. AS BigInteger === " + jMetaDataGeneral.getComicAsBigInteger());
    }

   /**
    * Test getComicAsURL() method.
    */
    @Test
    public void subTestGetComicAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getComicAsURL());
        System.out.println("Name of the comic. AS URL === " + jMetaDataGeneral.getComicAsURL());
    }

   /**
    * Test getEditedByAsInteger() method.
    */
    @Test
    public void subTestGetEditedByAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEditedByAsInteger());
        System.out.println("Editors name AS Integer === " + jMetaDataGeneral.getEditedByAsInteger());
    }

   /**
    * Test getEditedByAsLong() method.
    */
    @Test
    public void subTestGetEditedByAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getEditedByAsLong());
        System.out.println("Editors name AS Long === " + jMetaDataGeneral.getEditedByAsLong());
    }

   /**
    * Test getEditedByAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEditedByAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getEditedByAsLocalDateTime());
        System.out.println("Editors name AS LocalDateTime === " + jMetaDataGeneral.getEditedByAsLocalDateTime());
    }

   /**
    * Test getEditedByAsLocalTime() method.
    */
    @Test
    public void subTestGetEditedByAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getEditedByAsLocalTime());
        System.out.println("Editors name AS LocalTime === " + jMetaDataGeneral.getEditedByAsLocalTime());
    }

   /**
    * Test getEditedByAsString() method.
    */
    @Test
    public void subTestGetEditedByAsString() {
        assertEquals(null, this.jMetaDataGeneral.getEditedByAsString());
        System.out.println("Editors name AS String === " + jMetaDataGeneral.getEditedByAsString());
    }

   /**
    * Test getEditedByAsBoolean() method.
    */
    @Test
    public void subTestGetEditedByAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getEditedByAsBoolean());
        System.out.println("Editors name AS Boolean === " + jMetaDataGeneral.getEditedByAsBoolean());
    }

   /**
    * Test getEditedByAsBigInteger() method.
    */
    @Test
    public void subTestGetEditedByAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEditedByAsBigInteger());
        System.out.println("Editors name AS BigInteger === " + jMetaDataGeneral.getEditedByAsBigInteger());
    }

   /**
    * Test getEditedByAsURL() method.
    */
    @Test
    public void subTestGetEditedByAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getEditedByAsURL());
        System.out.println("Editors name AS URL === " + jMetaDataGeneral.getEditedByAsURL());
    }

   /**
    * Test getFormatCommercialAsInteger() method.
    */
    @Test
    public void subTestGetFormatCommercialAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFormatCommercialAsInteger());
        System.out.println("Commercial name used by vendor for theses setings or Format field if there is no difference AS Integer === " + jMetaDataGeneral.getFormatCommercialAsInteger());
    }

   /**
    * Test getFormatCommercialAsLong() method.
    */
    @Test
    public void subTestGetFormatCommercialAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getFormatCommercialAsLong());
        System.out.println("Commercial name used by vendor for theses setings or Format field if there is no difference AS Long === " + jMetaDataGeneral.getFormatCommercialAsLong());
    }

   /**
    * Test getFormatCommercialAsLocalDateTime() method.
    */
    @Test
    public void subTestGetFormatCommercialAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getFormatCommercialAsLocalDateTime());
        System.out.println("Commercial name used by vendor for theses setings or Format field if there is no difference AS LocalDateTime === " + jMetaDataGeneral.getFormatCommercialAsLocalDateTime());
    }

   /**
    * Test getFormatCommercialAsLocalTime() method.
    */
    @Test
    public void subTestGetFormatCommercialAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getFormatCommercialAsLocalTime());
        System.out.println("Commercial name used by vendor for theses setings or Format field if there is no difference AS LocalTime === " + jMetaDataGeneral.getFormatCommercialAsLocalTime());
    }

   /**
    * Test getFormatCommercialAsString() method.
    */
    @Test
    public void subTestGetFormatCommercialAsString() {
        assertEquals(null, this.jMetaDataGeneral.getFormatCommercialAsString());
        System.out.println("Commercial name used by vendor for theses setings or Format field if there is no difference AS String === " + jMetaDataGeneral.getFormatCommercialAsString());
    }

   /**
    * Test getFormatCommercialAsBoolean() method.
    */
    @Test
    public void subTestGetFormatCommercialAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getFormatCommercialAsBoolean());
        System.out.println("Commercial name used by vendor for theses setings or Format field if there is no difference AS Boolean === " + jMetaDataGeneral.getFormatCommercialAsBoolean());
    }

   /**
    * Test getFormatCommercialAsBigInteger() method.
    */
    @Test
    public void subTestGetFormatCommercialAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getFormatCommercialAsBigInteger());
        System.out.println("Commercial name used by vendor for theses setings or Format field if there is no difference AS BigInteger === " + jMetaDataGeneral.getFormatCommercialAsBigInteger());
    }

   /**
    * Test getFormatCommercialAsURL() method.
    */
    @Test
    public void subTestGetFormatCommercialAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getFormatCommercialAsURL());
        System.out.println("Commercial name used by vendor for theses setings or Format field if there is no difference AS URL === " + jMetaDataGeneral.getFormatCommercialAsURL());
    }

   /**
    * Test getCommentAsInteger() method.
    */
    @Test
    public void subTestGetCommentAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCommentAsInteger());
        System.out.println("Any comment related to the content. AS Integer === " + jMetaDataGeneral.getCommentAsInteger());
    }

   /**
    * Test getCommentAsLong() method.
    */
    @Test
    public void subTestGetCommentAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getCommentAsLong());
        System.out.println("Any comment related to the content. AS Long === " + jMetaDataGeneral.getCommentAsLong());
    }

   /**
    * Test getCommentAsLocalDateTime() method.
    */
    @Test
    public void subTestGetCommentAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getCommentAsLocalDateTime());
        System.out.println("Any comment related to the content. AS LocalDateTime === " + jMetaDataGeneral.getCommentAsLocalDateTime());
    }

   /**
    * Test getCommentAsLocalTime() method.
    */
    @Test
    public void subTestGetCommentAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getCommentAsLocalTime());
        System.out.println("Any comment related to the content. AS LocalTime === " + jMetaDataGeneral.getCommentAsLocalTime());
    }

   /**
    * Test getCommentAsString() method.
    */
    @Test
    public void subTestGetCommentAsString() {
        assertEquals(null, this.jMetaDataGeneral.getCommentAsString());
        System.out.println("Any comment related to the content. AS String === " + jMetaDataGeneral.getCommentAsString());
    }

   /**
    * Test getCommentAsBoolean() method.
    */
    @Test
    public void subTestGetCommentAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getCommentAsBoolean());
        System.out.println("Any comment related to the content. AS Boolean === " + jMetaDataGeneral.getCommentAsBoolean());
    }

   /**
    * Test getCommentAsBigInteger() method.
    */
    @Test
    public void subTestGetCommentAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getCommentAsBigInteger());
        System.out.println("Any comment related to the content. AS BigInteger === " + jMetaDataGeneral.getCommentAsBigInteger());
    }

   /**
    * Test getCommentAsURL() method.
    */
    @Test
    public void subTestGetCommentAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getCommentAsURL());
        System.out.println("Any comment related to the content. AS URL === " + jMetaDataGeneral.getCommentAsURL());
    }

   /**
    * Test getAudioFormatWithHintListAsInteger() method.
    */
    @Test
    public void subTestGetAudioFormatWithHintListAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getAudioFormatWithHintListAsInteger());
        System.out.println("Audio Codecs in this file with popular name (hint), separated by / AS Integer === " + jMetaDataGeneral.getAudioFormatWithHintListAsInteger());
    }

   /**
    * Test getAudioFormatWithHintListAsLong() method.
    */
    @Test
    public void subTestGetAudioFormatWithHintListAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getAudioFormatWithHintListAsLong());
        System.out.println("Audio Codecs in this file with popular name (hint), separated by / AS Long === " + jMetaDataGeneral.getAudioFormatWithHintListAsLong());
    }

   /**
    * Test getAudioFormatWithHintListAsLocalDateTime() method.
    */
    @Test
    public void subTestGetAudioFormatWithHintListAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getAudioFormatWithHintListAsLocalDateTime());
        System.out.println("Audio Codecs in this file with popular name (hint), separated by / AS LocalDateTime === " + jMetaDataGeneral.getAudioFormatWithHintListAsLocalDateTime());
    }

   /**
    * Test getAudioFormatWithHintListAsLocalTime() method.
    */
    @Test
    public void subTestGetAudioFormatWithHintListAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getAudioFormatWithHintListAsLocalTime());
        System.out.println("Audio Codecs in this file with popular name (hint), separated by / AS LocalTime === " + jMetaDataGeneral.getAudioFormatWithHintListAsLocalTime());
    }

   /**
    * Test getAudioFormatWithHintListAsString() method.
    */
    @Test
    public void subTestGetAudioFormatWithHintListAsString() {
        assertEquals(null, this.jMetaDataGeneral.getAudioFormatWithHintListAsString());
        System.out.println("Audio Codecs in this file with popular name (hint), separated by / AS String === " + jMetaDataGeneral.getAudioFormatWithHintListAsString());
    }

   /**
    * Test getAudioFormatWithHintListAsBoolean() method.
    */
    @Test
    public void subTestGetAudioFormatWithHintListAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getAudioFormatWithHintListAsBoolean());
        System.out.println("Audio Codecs in this file with popular name (hint), separated by / AS Boolean === " + jMetaDataGeneral.getAudioFormatWithHintListAsBoolean());
    }

   /**
    * Test getAudioFormatWithHintListAsBigInteger() method.
    */
    @Test
    public void subTestGetAudioFormatWithHintListAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getAudioFormatWithHintListAsBigInteger());
        System.out.println("Audio Codecs in this file with popular name (hint), separated by / AS BigInteger === " + jMetaDataGeneral.getAudioFormatWithHintListAsBigInteger());
    }

   /**
    * Test getAudioFormatWithHintListAsURL() method.
    */
    @Test
    public void subTestGetAudioFormatWithHintListAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getAudioFormatWithHintListAsURL());
        System.out.println("Audio Codecs in this file with popular name (hint), separated by / AS URL === " + jMetaDataGeneral.getAudioFormatWithHintListAsURL());
    }

   /**
    * Test getDelaySourceStringAsInteger() method.
    */
    @Test
    public void subTestGetDelaySourceStringAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDelaySourceStringAsInteger());
        System.out.println("Delay source (Container or Stream or empty) AS Integer === " + jMetaDataGeneral.getDelaySourceStringAsInteger());
    }

   /**
    * Test getDelaySourceStringAsLong() method.
    */
    @Test
    public void subTestGetDelaySourceStringAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getDelaySourceStringAsLong());
        System.out.println("Delay source (Container or Stream or empty) AS Long === " + jMetaDataGeneral.getDelaySourceStringAsLong());
    }

   /**
    * Test getDelaySourceStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetDelaySourceStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getDelaySourceStringAsLocalDateTime());
        System.out.println("Delay source (Container or Stream or empty) AS LocalDateTime === " + jMetaDataGeneral.getDelaySourceStringAsLocalDateTime());
    }

   /**
    * Test getDelaySourceStringAsLocalTime() method.
    */
    @Test
    public void subTestGetDelaySourceStringAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getDelaySourceStringAsLocalTime());
        System.out.println("Delay source (Container or Stream or empty) AS LocalTime === " + jMetaDataGeneral.getDelaySourceStringAsLocalTime());
    }

   /**
    * Test getDelaySourceStringAsString() method.
    */
    @Test
    public void subTestGetDelaySourceStringAsString() {
        assertEquals(null, this.jMetaDataGeneral.getDelaySourceStringAsString());
        System.out.println("Delay source (Container or Stream or empty) AS String === " + jMetaDataGeneral.getDelaySourceStringAsString());
    }

   /**
    * Test getDelaySourceStringAsBoolean() method.
    */
    @Test
    public void subTestGetDelaySourceStringAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getDelaySourceStringAsBoolean());
        System.out.println("Delay source (Container or Stream or empty) AS Boolean === " + jMetaDataGeneral.getDelaySourceStringAsBoolean());
    }

   /**
    * Test getDelaySourceStringAsBigInteger() method.
    */
    @Test
    public void subTestGetDelaySourceStringAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getDelaySourceStringAsBigInteger());
        System.out.println("Delay source (Container or Stream or empty) AS BigInteger === " + jMetaDataGeneral.getDelaySourceStringAsBigInteger());
    }

   /**
    * Test getDelaySourceStringAsURL() method.
    */
    @Test
    public void subTestGetDelaySourceStringAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getDelaySourceStringAsURL());
        System.out.println("Delay source (Container or Stream or empty) AS URL === " + jMetaDataGeneral.getDelaySourceStringAsURL());
    }

   /**
    * Test getOriginalSourceFormDistributedByAsInteger() method.
    */
    @Test
    public void subTestGetOriginalSourceFormDistributedByAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormDistributedByAsInteger());
        System.out.println("Name of the person or organization who supplied the original subject AS Integer === " + jMetaDataGeneral.getOriginalSourceFormDistributedByAsInteger());
    }

   /**
    * Test getOriginalSourceFormDistributedByAsLong() method.
    */
    @Test
    public void subTestGetOriginalSourceFormDistributedByAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormDistributedByAsLong());
        System.out.println("Name of the person or organization who supplied the original subject AS Long === " + jMetaDataGeneral.getOriginalSourceFormDistributedByAsLong());
    }

   /**
    * Test getOriginalSourceFormDistributedByAsLocalDateTime() method.
    */
    @Test
    public void subTestGetOriginalSourceFormDistributedByAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormDistributedByAsLocalDateTime());
        System.out.println("Name of the person or organization who supplied the original subject AS LocalDateTime === " + jMetaDataGeneral.getOriginalSourceFormDistributedByAsLocalDateTime());
    }

   /**
    * Test getOriginalSourceFormDistributedByAsLocalTime() method.
    */
    @Test
    public void subTestGetOriginalSourceFormDistributedByAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormDistributedByAsLocalTime());
        System.out.println("Name of the person or organization who supplied the original subject AS LocalTime === " + jMetaDataGeneral.getOriginalSourceFormDistributedByAsLocalTime());
    }

   /**
    * Test getOriginalSourceFormDistributedByAsString() method.
    */
    @Test
    public void subTestGetOriginalSourceFormDistributedByAsString() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormDistributedByAsString());
        System.out.println("Name of the person or organization who supplied the original subject AS String === " + jMetaDataGeneral.getOriginalSourceFormDistributedByAsString());
    }

   /**
    * Test getOriginalSourceFormDistributedByAsBoolean() method.
    */
    @Test
    public void subTestGetOriginalSourceFormDistributedByAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormDistributedByAsBoolean());
        System.out.println("Name of the person or organization who supplied the original subject AS Boolean === " + jMetaDataGeneral.getOriginalSourceFormDistributedByAsBoolean());
    }

   /**
    * Test getOriginalSourceFormDistributedByAsBigInteger() method.
    */
    @Test
    public void subTestGetOriginalSourceFormDistributedByAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormDistributedByAsBigInteger());
        System.out.println("Name of the person or organization who supplied the original subject AS BigInteger === " + jMetaDataGeneral.getOriginalSourceFormDistributedByAsBigInteger());
    }

   /**
    * Test getOriginalSourceFormDistributedByAsURL() method.
    */
    @Test
    public void subTestGetOriginalSourceFormDistributedByAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getOriginalSourceFormDistributedByAsURL());
        System.out.println("Name of the person or organization who supplied the original subject AS URL === " + jMetaDataGeneral.getOriginalSourceFormDistributedByAsURL());
    }

   /**
    * Test getAddedDateAsInteger() method.
    */
    @Test
    public void subTestGetAddedDateAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getAddedDateAsInteger());
        System.out.println("Date/year the item was added to the owners collection AS Integer === " + jMetaDataGeneral.getAddedDateAsInteger());
    }

   /**
    * Test getAddedDateAsLong() method.
    */
    @Test
    public void subTestGetAddedDateAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getAddedDateAsLong());
        System.out.println("Date/year the item was added to the owners collection AS Long === " + jMetaDataGeneral.getAddedDateAsLong());
    }

   /**
    * Test getAddedDateAsLocalDateTime() method.
    */
    @Test
    public void subTestGetAddedDateAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getAddedDateAsLocalDateTime());
        System.out.println("Date/year the item was added to the owners collection AS LocalDateTime === " + jMetaDataGeneral.getAddedDateAsLocalDateTime());
    }

   /**
    * Test getAddedDateAsLocalTime() method.
    */
    @Test
    public void subTestGetAddedDateAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getAddedDateAsLocalTime());
        System.out.println("Date/year the item was added to the owners collection AS LocalTime === " + jMetaDataGeneral.getAddedDateAsLocalTime());
    }

   /**
    * Test getAddedDateAsString() method.
    */
    @Test
    public void subTestGetAddedDateAsString() {
        assertEquals(null, this.jMetaDataGeneral.getAddedDateAsString());
        System.out.println("Date/year the item was added to the owners collection AS String === " + jMetaDataGeneral.getAddedDateAsString());
    }

   /**
    * Test getAddedDateAsBoolean() method.
    */
    @Test
    public void subTestGetAddedDateAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getAddedDateAsBoolean());
        System.out.println("Date/year the item was added to the owners collection AS Boolean === " + jMetaDataGeneral.getAddedDateAsBoolean());
    }

   /**
    * Test getAddedDateAsBigInteger() method.
    */
    @Test
    public void subTestGetAddedDateAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getAddedDateAsBigInteger());
        System.out.println("Date/year the item was added to the owners collection AS BigInteger === " + jMetaDataGeneral.getAddedDateAsBigInteger());
    }

   /**
    * Test getAddedDateAsURL() method.
    */
    @Test
    public void subTestGetAddedDateAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getAddedDateAsURL());
        System.out.println("Date/year the item was added to the owners collection AS URL === " + jMetaDataGeneral.getAddedDateAsURL());
    }

   /**
    * Test getStreamKindStringAsInteger() method.
    */
    @Test
    public void subTestGetStreamKindStringAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getStreamKindStringAsInteger());
        System.out.println("Stream type name AS Integer === " + jMetaDataGeneral.getStreamKindStringAsInteger());
    }

   /**
    * Test getStreamKindStringAsLong() method.
    */
    @Test
    public void subTestGetStreamKindStringAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getStreamKindStringAsLong());
        System.out.println("Stream type name AS Long === " + jMetaDataGeneral.getStreamKindStringAsLong());
    }

   /**
    * Test getStreamKindStringAsLocalDateTime() method.
    */
    @Test
    public void subTestGetStreamKindStringAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getStreamKindStringAsLocalDateTime());
        System.out.println("Stream type name AS LocalDateTime === " + jMetaDataGeneral.getStreamKindStringAsLocalDateTime());
    }

   /**
    * Test getStreamKindStringAsLocalTime() method.
    */
    @Test
    public void subTestGetStreamKindStringAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getStreamKindStringAsLocalTime());
        System.out.println("Stream type name AS LocalTime === " + jMetaDataGeneral.getStreamKindStringAsLocalTime());
    }

   /**
    * Test getStreamKindStringAsString() method.
    */
    @Test
    public void subTestGetStreamKindStringAsString() {
        assertEquals(null, this.jMetaDataGeneral.getStreamKindStringAsString());
        System.out.println("Stream type name AS String === " + jMetaDataGeneral.getStreamKindStringAsString());
    }

   /**
    * Test getStreamKindStringAsBoolean() method.
    */
    @Test
    public void subTestGetStreamKindStringAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getStreamKindStringAsBoolean());
        System.out.println("Stream type name AS Boolean === " + jMetaDataGeneral.getStreamKindStringAsBoolean());
    }

   /**
    * Test getStreamKindStringAsBigInteger() method.
    */
    @Test
    public void subTestGetStreamKindStringAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getStreamKindStringAsBigInteger());
        System.out.println("Stream type name AS BigInteger === " + jMetaDataGeneral.getStreamKindStringAsBigInteger());
    }

   /**
    * Test getStreamKindStringAsURL() method.
    */
    @Test
    public void subTestGetStreamKindStringAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getStreamKindStringAsURL());
        System.out.println("Stream type name AS URL === " + jMetaDataGeneral.getStreamKindStringAsURL());
    }

   /**
    * Test getTrackMoreAsInteger() method.
    */
    @Test
    public void subTestGetTrackMoreAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getTrackMoreAsInteger());
        System.out.println("More infos about the track AS Integer === " + jMetaDataGeneral.getTrackMoreAsInteger());
    }

   /**
    * Test getTrackMoreAsLong() method.
    */
    @Test
    public void subTestGetTrackMoreAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getTrackMoreAsLong());
        System.out.println("More infos about the track AS Long === " + jMetaDataGeneral.getTrackMoreAsLong());
    }

   /**
    * Test getTrackMoreAsLocalDateTime() method.
    */
    @Test
    public void subTestGetTrackMoreAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getTrackMoreAsLocalDateTime());
        System.out.println("More infos about the track AS LocalDateTime === " + jMetaDataGeneral.getTrackMoreAsLocalDateTime());
    }

   /**
    * Test getTrackMoreAsLocalTime() method.
    */
    @Test
    public void subTestGetTrackMoreAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getTrackMoreAsLocalTime());
        System.out.println("More infos about the track AS LocalTime === " + jMetaDataGeneral.getTrackMoreAsLocalTime());
    }

   /**
    * Test getTrackMoreAsString() method.
    */
    @Test
    public void subTestGetTrackMoreAsString() {
        assertEquals(null, this.jMetaDataGeneral.getTrackMoreAsString());
        System.out.println("More infos about the track AS String === " + jMetaDataGeneral.getTrackMoreAsString());
    }

   /**
    * Test getTrackMoreAsBoolean() method.
    */
    @Test
    public void subTestGetTrackMoreAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getTrackMoreAsBoolean());
        System.out.println("More infos about the track AS Boolean === " + jMetaDataGeneral.getTrackMoreAsBoolean());
    }

   /**
    * Test getTrackMoreAsBigInteger() method.
    */
    @Test
    public void subTestGetTrackMoreAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getTrackMoreAsBigInteger());
        System.out.println("More infos about the track AS BigInteger === " + jMetaDataGeneral.getTrackMoreAsBigInteger());
    }

   /**
    * Test getTrackMoreAsURL() method.
    */
    @Test
    public void subTestGetTrackMoreAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getTrackMoreAsURL());
        System.out.println("More infos about the track AS URL === " + jMetaDataGeneral.getTrackMoreAsURL());
    }

   /**
    * Test getEncodedApplicationVersionAsInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationVersionAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationVersionAsInteger());
        System.out.println("Version of the product AS Integer === " + jMetaDataGeneral.getEncodedApplicationVersionAsInteger());
    }

   /**
    * Test getEncodedApplicationVersionAsLong() method.
    */
    @Test
    public void subTestGetEncodedApplicationVersionAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationVersionAsLong());
        System.out.println("Version of the product AS Long === " + jMetaDataGeneral.getEncodedApplicationVersionAsLong());
    }

   /**
    * Test getEncodedApplicationVersionAsLocalDateTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationVersionAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationVersionAsLocalDateTime());
        System.out.println("Version of the product AS LocalDateTime === " + jMetaDataGeneral.getEncodedApplicationVersionAsLocalDateTime());
    }

   /**
    * Test getEncodedApplicationVersionAsLocalTime() method.
    */
    @Test
    public void subTestGetEncodedApplicationVersionAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationVersionAsLocalTime());
        System.out.println("Version of the product AS LocalTime === " + jMetaDataGeneral.getEncodedApplicationVersionAsLocalTime());
    }

   /**
    * Test getEncodedApplicationVersionAsString() method.
    */
    @Test
    public void subTestGetEncodedApplicationVersionAsString() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationVersionAsString());
        System.out.println("Version of the product AS String === " + jMetaDataGeneral.getEncodedApplicationVersionAsString());
    }

   /**
    * Test getEncodedApplicationVersionAsBoolean() method.
    */
    @Test
    public void subTestGetEncodedApplicationVersionAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationVersionAsBoolean());
        System.out.println("Version of the product AS Boolean === " + jMetaDataGeneral.getEncodedApplicationVersionAsBoolean());
    }

   /**
    * Test getEncodedApplicationVersionAsBigInteger() method.
    */
    @Test
    public void subTestGetEncodedApplicationVersionAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationVersionAsBigInteger());
        System.out.println("Version of the product AS BigInteger === " + jMetaDataGeneral.getEncodedApplicationVersionAsBigInteger());
    }

   /**
    * Test getEncodedApplicationVersionAsURL() method.
    */
    @Test
    public void subTestGetEncodedApplicationVersionAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getEncodedApplicationVersionAsURL());
        System.out.println("Version of the product AS URL === " + jMetaDataGeneral.getEncodedApplicationVersionAsURL());
    }

   /**
    * Test getMenuIDAsInteger() method.
    */
    @Test
    public void subTestGetMenuIDAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getMenuIDAsInteger());
        System.out.println("The menu ID for this stream in this file AS Integer === " + jMetaDataGeneral.getMenuIDAsInteger());
    }

   /**
    * Test getMenuIDAsLong() method.
    */
    @Test
    public void subTestGetMenuIDAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getMenuIDAsLong());
        System.out.println("The menu ID for this stream in this file AS Long === " + jMetaDataGeneral.getMenuIDAsLong());
    }

   /**
    * Test getMenuIDAsLocalDateTime() method.
    */
    @Test
    public void subTestGetMenuIDAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getMenuIDAsLocalDateTime());
        System.out.println("The menu ID for this stream in this file AS LocalDateTime === " + jMetaDataGeneral.getMenuIDAsLocalDateTime());
    }

   /**
    * Test getMenuIDAsLocalTime() method.
    */
    @Test
    public void subTestGetMenuIDAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getMenuIDAsLocalTime());
        System.out.println("The menu ID for this stream in this file AS LocalTime === " + jMetaDataGeneral.getMenuIDAsLocalTime());
    }

   /**
    * Test getMenuIDAsString() method.
    */
    @Test
    public void subTestGetMenuIDAsString() {
        assertEquals(null, this.jMetaDataGeneral.getMenuIDAsString());
        System.out.println("The menu ID for this stream in this file AS String === " + jMetaDataGeneral.getMenuIDAsString());
    }

   /**
    * Test getMenuIDAsBoolean() method.
    */
    @Test
    public void subTestGetMenuIDAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getMenuIDAsBoolean());
        System.out.println("The menu ID for this stream in this file AS Boolean === " + jMetaDataGeneral.getMenuIDAsBoolean());
    }

   /**
    * Test getMenuIDAsBigInteger() method.
    */
    @Test
    public void subTestGetMenuIDAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getMenuIDAsBigInteger());
        System.out.println("The menu ID for this stream in this file AS BigInteger === " + jMetaDataGeneral.getMenuIDAsBigInteger());
    }

   /**
    * Test getMenuIDAsURL() method.
    */
    @Test
    public void subTestGetMenuIDAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getMenuIDAsURL());
        System.out.println("The menu ID for this stream in this file AS URL === " + jMetaDataGeneral.getMenuIDAsURL());
    }

   /**
    * Test getMenuFormatListAsInteger() method.
    */
    @Test
    public void subTestGetMenuFormatListAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getMenuFormatListAsInteger());
        System.out.println("Menu Codecsin this file, separated by / AS Integer === " + jMetaDataGeneral.getMenuFormatListAsInteger());
    }

   /**
    * Test getMenuFormatListAsLong() method.
    */
    @Test
    public void subTestGetMenuFormatListAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getMenuFormatListAsLong());
        System.out.println("Menu Codecsin this file, separated by / AS Long === " + jMetaDataGeneral.getMenuFormatListAsLong());
    }

   /**
    * Test getMenuFormatListAsLocalDateTime() method.
    */
    @Test
    public void subTestGetMenuFormatListAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getMenuFormatListAsLocalDateTime());
        System.out.println("Menu Codecsin this file, separated by / AS LocalDateTime === " + jMetaDataGeneral.getMenuFormatListAsLocalDateTime());
    }

   /**
    * Test getMenuFormatListAsLocalTime() method.
    */
    @Test
    public void subTestGetMenuFormatListAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getMenuFormatListAsLocalTime());
        System.out.println("Menu Codecsin this file, separated by / AS LocalTime === " + jMetaDataGeneral.getMenuFormatListAsLocalTime());
    }

   /**
    * Test getMenuFormatListAsString() method.
    */
    @Test
    public void subTestGetMenuFormatListAsString() {
        assertEquals(null, this.jMetaDataGeneral.getMenuFormatListAsString());
        System.out.println("Menu Codecsin this file, separated by / AS String === " + jMetaDataGeneral.getMenuFormatListAsString());
    }

   /**
    * Test getMenuFormatListAsBoolean() method.
    */
    @Test
    public void subTestGetMenuFormatListAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getMenuFormatListAsBoolean());
        System.out.println("Menu Codecsin this file, separated by / AS Boolean === " + jMetaDataGeneral.getMenuFormatListAsBoolean());
    }

   /**
    * Test getMenuFormatListAsBigInteger() method.
    */
    @Test
    public void subTestGetMenuFormatListAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getMenuFormatListAsBigInteger());
        System.out.println("Menu Codecsin this file, separated by / AS BigInteger === " + jMetaDataGeneral.getMenuFormatListAsBigInteger());
    }

   /**
    * Test getMenuFormatListAsURL() method.
    */
    @Test
    public void subTestGetMenuFormatListAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getMenuFormatListAsURL());
        System.out.println("Menu Codecsin this file, separated by / AS URL === " + jMetaDataGeneral.getMenuFormatListAsURL());
    }

   /**
    * Test getPerformerSortAsInteger() method.
    */
    @Test
    public void subTestGetPerformerSortAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getPerformerSortAsInteger());
        System.out.println("Performer/Sort AS Integer === " + jMetaDataGeneral.getPerformerSortAsInteger());
    }

   /**
    * Test getPerformerSortAsLong() method.
    */
    @Test
    public void subTestGetPerformerSortAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getPerformerSortAsLong());
        System.out.println("Performer/Sort AS Long === " + jMetaDataGeneral.getPerformerSortAsLong());
    }

   /**
    * Test getPerformerSortAsLocalDateTime() method.
    */
    @Test
    public void subTestGetPerformerSortAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getPerformerSortAsLocalDateTime());
        System.out.println("Performer/Sort AS LocalDateTime === " + jMetaDataGeneral.getPerformerSortAsLocalDateTime());
    }

   /**
    * Test getPerformerSortAsLocalTime() method.
    */
    @Test
    public void subTestGetPerformerSortAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getPerformerSortAsLocalTime());
        System.out.println("Performer/Sort AS LocalTime === " + jMetaDataGeneral.getPerformerSortAsLocalTime());
    }

   /**
    * Test getPerformerSortAsString() method.
    */
    @Test
    public void subTestGetPerformerSortAsString() {
        assertEquals(null, this.jMetaDataGeneral.getPerformerSortAsString());
        System.out.println("Performer/Sort AS String === " + jMetaDataGeneral.getPerformerSortAsString());
    }

   /**
    * Test getPerformerSortAsBoolean() method.
    */
    @Test
    public void subTestGetPerformerSortAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getPerformerSortAsBoolean());
        System.out.println("Performer/Sort AS Boolean === " + jMetaDataGeneral.getPerformerSortAsBoolean());
    }

   /**
    * Test getPerformerSortAsBigInteger() method.
    */
    @Test
    public void subTestGetPerformerSortAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getPerformerSortAsBigInteger());
        System.out.println("Performer/Sort AS BigInteger === " + jMetaDataGeneral.getPerformerSortAsBigInteger());
    }

   /**
    * Test getPerformerSortAsURL() method.
    */
    @Test
    public void subTestGetPerformerSortAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getPerformerSortAsURL());
        System.out.println("Performer/Sort AS URL === " + jMetaDataGeneral.getPerformerSortAsURL());
    }

   /**
    * Test getMovieUrlAsInteger() method.
    */
    @Test
    public void subTestGetMovieUrlAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getMovieUrlAsInteger());
        System.out.println("Homepage for the movie AS Integer === " + jMetaDataGeneral.getMovieUrlAsInteger());
    }

   /**
    * Test getMovieUrlAsLong() method.
    */
    @Test
    public void subTestGetMovieUrlAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getMovieUrlAsLong());
        System.out.println("Homepage for the movie AS Long === " + jMetaDataGeneral.getMovieUrlAsLong());
    }

   /**
    * Test getMovieUrlAsLocalDateTime() method.
    */
    @Test
    public void subTestGetMovieUrlAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getMovieUrlAsLocalDateTime());
        System.out.println("Homepage for the movie AS LocalDateTime === " + jMetaDataGeneral.getMovieUrlAsLocalDateTime());
    }

   /**
    * Test getMovieUrlAsLocalTime() method.
    */
    @Test
    public void subTestGetMovieUrlAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getMovieUrlAsLocalTime());
        System.out.println("Homepage for the movie AS LocalTime === " + jMetaDataGeneral.getMovieUrlAsLocalTime());
    }

   /**
    * Test getMovieUrlAsString() method.
    */
    @Test
    public void subTestGetMovieUrlAsString() {
        assertEquals(null, this.jMetaDataGeneral.getMovieUrlAsString());
        System.out.println("Homepage for the movie AS String === " + jMetaDataGeneral.getMovieUrlAsString());
    }

   /**
    * Test getMovieUrlAsBoolean() method.
    */
    @Test
    public void subTestGetMovieUrlAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getMovieUrlAsBoolean());
        System.out.println("Homepage for the movie AS Boolean === " + jMetaDataGeneral.getMovieUrlAsBoolean());
    }

   /**
    * Test getMovieUrlAsBigInteger() method.
    */
    @Test
    public void subTestGetMovieUrlAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getMovieUrlAsBigInteger());
        System.out.println("Homepage for the movie AS BigInteger === " + jMetaDataGeneral.getMovieUrlAsBigInteger());
    }

   /**
    * Test getMovieUrlAsURL() method.
    */
    @Test
    public void subTestGetMovieUrlAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getMovieUrlAsURL());
        System.out.println("Homepage for the movie AS URL === " + jMetaDataGeneral.getMovieUrlAsURL());
    }

   /**
    * Test getSummaryAsInteger() method.
    */
    @Test
    public void subTestGetSummaryAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getSummaryAsInteger());
        System.out.println("A plot outline or a summary of the story. AS Integer === " + jMetaDataGeneral.getSummaryAsInteger());
    }

   /**
    * Test getSummaryAsLong() method.
    */
    @Test
    public void subTestGetSummaryAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getSummaryAsLong());
        System.out.println("A plot outline or a summary of the story. AS Long === " + jMetaDataGeneral.getSummaryAsLong());
    }

   /**
    * Test getSummaryAsLocalDateTime() method.
    */
    @Test
    public void subTestGetSummaryAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getSummaryAsLocalDateTime());
        System.out.println("A plot outline or a summary of the story. AS LocalDateTime === " + jMetaDataGeneral.getSummaryAsLocalDateTime());
    }

   /**
    * Test getSummaryAsLocalTime() method.
    */
    @Test
    public void subTestGetSummaryAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getSummaryAsLocalTime());
        System.out.println("A plot outline or a summary of the story. AS LocalTime === " + jMetaDataGeneral.getSummaryAsLocalTime());
    }

   /**
    * Test getSummaryAsString() method.
    */
    @Test
    public void subTestGetSummaryAsString() {
        assertEquals(null, this.jMetaDataGeneral.getSummaryAsString());
        System.out.println("A plot outline or a summary of the story. AS String === " + jMetaDataGeneral.getSummaryAsString());
    }

   /**
    * Test getSummaryAsBoolean() method.
    */
    @Test
    public void subTestGetSummaryAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getSummaryAsBoolean());
        System.out.println("A plot outline or a summary of the story. AS Boolean === " + jMetaDataGeneral.getSummaryAsBoolean());
    }

   /**
    * Test getSummaryAsBigInteger() method.
    */
    @Test
    public void subTestGetSummaryAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getSummaryAsBigInteger());
        System.out.println("A plot outline or a summary of the story. AS BigInteger === " + jMetaDataGeneral.getSummaryAsBigInteger());
    }

   /**
    * Test getSummaryAsURL() method.
    */
    @Test
    public void subTestGetSummaryAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getSummaryAsURL());
        System.out.println("A plot outline or a summary of the story. AS URL === " + jMetaDataGeneral.getSummaryAsURL());
    }

   /**
    * Test getTrackAsInteger() method.
    */
    @Test
    public void subTestGetTrackAsInteger() {
        assertEquals(null, this.jMetaDataGeneral.getTrackAsInteger());
        System.out.println("Name of the track. e.g. track1, track 2 AS Integer === " + jMetaDataGeneral.getTrackAsInteger());
    }

   /**
    * Test getTrackAsLong() method.
    */
    @Test
    public void subTestGetTrackAsLong() {
        assertEquals(null, this.jMetaDataGeneral.getTrackAsLong());
        System.out.println("Name of the track. e.g. track1, track 2 AS Long === " + jMetaDataGeneral.getTrackAsLong());
    }

   /**
    * Test getTrackAsLocalDateTime() method.
    */
    @Test
    public void subTestGetTrackAsLocalDateTime() {
        assertEquals(null, this.jMetaDataGeneral.getTrackAsLocalDateTime());
        System.out.println("Name of the track. e.g. track1, track 2 AS LocalDateTime === " + jMetaDataGeneral.getTrackAsLocalDateTime());
    }

   /**
    * Test getTrackAsLocalTime() method.
    */
    @Test
    public void subTestGetTrackAsLocalTime() {
        assertEquals(null, this.jMetaDataGeneral.getTrackAsLocalTime());
        System.out.println("Name of the track. e.g. track1, track 2 AS LocalTime === " + jMetaDataGeneral.getTrackAsLocalTime());
    }

   /**
    * Test getTrackAsString() method.
    */
    @Test
    public void subTestGetTrackAsString() {
        assertEquals(null, this.jMetaDataGeneral.getTrackAsString());
        System.out.println("Name of the track. e.g. track1, track 2 AS String === " + jMetaDataGeneral.getTrackAsString());
    }

   /**
    * Test getTrackAsBoolean() method.
    */
    @Test
    public void subTestGetTrackAsBoolean() {
        assertEquals(null, this.jMetaDataGeneral.getTrackAsBoolean());
        System.out.println("Name of the track. e.g. track1, track 2 AS Boolean === " + jMetaDataGeneral.getTrackAsBoolean());
    }

   /**
    * Test getTrackAsBigInteger() method.
    */
    @Test
    public void subTestGetTrackAsBigInteger() {
        assertEquals(null, this.jMetaDataGeneral.getTrackAsBigInteger());
        System.out.println("Name of the track. e.g. track1, track 2 AS BigInteger === " + jMetaDataGeneral.getTrackAsBigInteger());
    }

   /**
    * Test getTrackAsURL() method.
    */
    @Test
    public void subTestGetTrackAsURL() {
        assertEquals(null, this.jMetaDataGeneral.getTrackAsURL());
        System.out.println("Name of the track. e.g. track1, track 2 AS URL === " + jMetaDataGeneral.getTrackAsURL());
    }

}
