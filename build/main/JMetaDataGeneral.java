package aka.jmetadata.main;

import java.math.BigInteger;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import aka.jmetadata.main.constants.General;
import aka.jmetadata.main.constants.StreamKind;
import aka.jmetadata.main.mediainfo.MediaInfo;
import aka.swissknife.data.TextUtils;

/**
 * This class contains all methods to extract General informations of a specific General stream.
 *
 * @author Welle Charlotte
 */
public final class JMetaDataGeneral extends AbstractJMetadata {

   /**
    * Constructor.
    * 
    * @param mediaInfo instance of MediaInfo JNA library
    * @see MediaInfo
    */
    public JMetaDataGeneral(@NonNull final MediaInfo mediaInfo) {
        super(mediaInfo);
    }

   /**
    * Get number of Video streams.
    * 
    * @return number of Video.
    */
    public final int getNumberVideoStreams() {
        return getMediaInfo().getStreamCount(StreamKind.General);
    }

   /**
    * Get number of Text streams.
    * 
    * @return number of Text.
    */
    public final int getNumberTextStreams() {
        return getMediaInfo().getStreamCount(StreamKind.General);
    }

   /**
    * Get number of Menu streams.
    * 
    * @return number of Menu.
    */
    public final int getNumberMenuStreams() {
        return getMediaInfo().getStreamCount(StreamKind.General);
    }

   /**
    * Get number of Audio streams.
    * 
    * @return number of Audio.
    */
    public final int getNumberAudioStreams() {
        return getMediaInfo().getStreamCount(StreamKind.General);
    }


   /**
    * Get Library of Congress Control Number..
    * 
    * @return Library of Congress Control Number..
    */
    @Nullable
    public final Integer getLCCNAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.LCCN);
    }

   /**
    * Get Library of Congress Control Number..
    * 
    * @return Library of Congress Control Number..
    */
    @Nullable
    public final Long getLCCNAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.LCCN);
    }

   /**
    * Get Library of Congress Control Number..
    * 
    * @return Library of Congress Control Number..
    */
    @Nullable
    public final LocalDateTime getLCCNAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.LCCN);
    }

   /**
    * Get Library of Congress Control Number..
    * 
    * @return Library of Congress Control Number..
    */
    @Nullable
    public final LocalTime getLCCNAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.LCCN);
    }

   /**
    * Get Library of Congress Control Number..
    * 
    * @return Library of Congress Control Number..
    */
    @Nullable
    public final String getLCCNAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.LCCN);
    }

   /**
    * Get Library of Congress Control Number..
    * 
    * @return Library of Congress Control Number..
    */
    @Nullable
    public final Boolean getLCCNAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.LCCN);
    }

   /**
    * Get Library of Congress Control Number..
    * 
    * @return Library of Congress Control Number..
    */
    @Nullable
    public final BigInteger getLCCNAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.LCCN);
    }

   /**
    * Get Library of Congress Control Number..
    * 
    * @return Library of Congress Control Number..
    */
    @Nullable
    public final URL getLCCNAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.LCCN);
    }

   /**
    * Get Library of Congress Control Number..
    * 
    * @return Library of Congress Control Number..
    */
    @NonNull
    public final List<@NonNull String> getLCCNAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.LCCN);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Owner of the file.
    * 
    * @return Owner of the file.
    */
    @Nullable
    public final Integer getOwnerAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.OWNER);
    }

   /**
    * Get Owner of the file.
    * 
    * @return Owner of the file.
    */
    @Nullable
    public final Long getOwnerAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.OWNER);
    }

   /**
    * Get Owner of the file.
    * 
    * @return Owner of the file.
    */
    @Nullable
    public final LocalDateTime getOwnerAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.OWNER);
    }

   /**
    * Get Owner of the file.
    * 
    * @return Owner of the file.
    */
    @Nullable
    public final LocalTime getOwnerAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.OWNER);
    }

   /**
    * Get Owner of the file.
    * 
    * @return Owner of the file.
    */
    @Nullable
    public final String getOwnerAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.OWNER);
    }

   /**
    * Get Owner of the file.
    * 
    * @return Owner of the file.
    */
    @Nullable
    public final Boolean getOwnerAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.OWNER);
    }

   /**
    * Get Owner of the file.
    * 
    * @return Owner of the file.
    */
    @Nullable
    public final BigInteger getOwnerAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.OWNER);
    }

   /**
    * Get Owner of the file.
    * 
    * @return Owner of the file.
    */
    @Nullable
    public final URL getOwnerAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.OWNER);
    }

   /**
    * Get Owner of the file.
    * 
    * @return Owner of the file.
    */
    @NonNull
    public final List<@NonNull String> getOwnerAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.OWNER);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get NetworkName.
    * 
    * @return NetworkName.
    */
    @Nullable
    public final Integer getNetworkNameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.NETWORKNAME);
    }

   /**
    * Get NetworkName.
    * 
    * @return NetworkName.
    */
    @Nullable
    public final Long getNetworkNameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.NETWORKNAME);
    }

   /**
    * Get NetworkName.
    * 
    * @return NetworkName.
    */
    @Nullable
    public final LocalDateTime getNetworkNameAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.NETWORKNAME);
    }

   /**
    * Get NetworkName.
    * 
    * @return NetworkName.
    */
    @Nullable
    public final LocalTime getNetworkNameAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.NETWORKNAME);
    }

   /**
    * Get NetworkName.
    * 
    * @return NetworkName.
    */
    @Nullable
    public final String getNetworkNameAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.NETWORKNAME);
    }

   /**
    * Get NetworkName.
    * 
    * @return NetworkName.
    */
    @Nullable
    public final Boolean getNetworkNameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.NETWORKNAME);
    }

   /**
    * Get NetworkName.
    * 
    * @return NetworkName.
    */
    @Nullable
    public final BigInteger getNetworkNameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.NETWORKNAME);
    }

   /**
    * Get NetworkName.
    * 
    * @return NetworkName.
    */
    @Nullable
    public final URL getNetworkNameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.NETWORKNAME);
    }

   /**
    * Get NetworkName.
    * 
    * @return NetworkName.
    */
    @NonNull
    public final List<@NonNull String> getNetworkNameAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.NETWORKNAME);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Text Codecs in this file, separated by /.
    * 
    * @return Text Codecs in this file, separated by /.
    */
    @Nullable
    public final Integer getTextFormatListAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.TEXTFORMATLIST);
    }

   /**
    * Get Text Codecs in this file, separated by /.
    * 
    * @return Text Codecs in this file, separated by /.
    */
    @Nullable
    public final Long getTextFormatListAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.TEXTFORMATLIST);
    }

   /**
    * Get Text Codecs in this file, separated by /.
    * 
    * @return Text Codecs in this file, separated by /.
    */
    @Nullable
    public final LocalDateTime getTextFormatListAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.TEXTFORMATLIST);
    }

   /**
    * Get Text Codecs in this file, separated by /.
    * 
    * @return Text Codecs in this file, separated by /.
    */
    @Nullable
    public final LocalTime getTextFormatListAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.TEXTFORMATLIST);
    }

   /**
    * Get Text Codecs in this file, separated by /.
    * 
    * @return Text Codecs in this file, separated by /.
    */
    @Nullable
    public final String getTextFormatListAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.TEXTFORMATLIST);
    }

   /**
    * Get Text Codecs in this file, separated by /.
    * 
    * @return Text Codecs in this file, separated by /.
    */
    @Nullable
    public final Boolean getTextFormatListAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.TEXTFORMATLIST);
    }

   /**
    * Get Text Codecs in this file, separated by /.
    * 
    * @return Text Codecs in this file, separated by /.
    */
    @Nullable
    public final BigInteger getTextFormatListAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.TEXTFORMATLIST);
    }

   /**
    * Get Text Codecs in this file, separated by /.
    * 
    * @return Text Codecs in this file, separated by /.
    */
    @Nullable
    public final URL getTextFormatListAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.TEXTFORMATLIST);
    }

   /**
    * Get Text Codecs in this file, separated by /.
    * 
    * @return Text Codecs in this file, separated by /.
    */
    @NonNull
    public final List<@NonNull String> getTextFormatListAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.TEXTFORMATLIST);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get iTunes compilation.
    * 
    * @return iTunes compilation.
    */
    @Nullable
    public final Integer getCompilationAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.COMPILATION);
    }

   /**
    * Get iTunes compilation.
    * 
    * @return iTunes compilation.
    */
    @Nullable
    public final Long getCompilationAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.COMPILATION);
    }

   /**
    * Get iTunes compilation.
    * 
    * @return iTunes compilation.
    */
    @Nullable
    public final LocalDateTime getCompilationAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.COMPILATION);
    }

   /**
    * Get iTunes compilation.
    * 
    * @return iTunes compilation.
    */
    @Nullable
    public final LocalTime getCompilationAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.COMPILATION);
    }

   /**
    * Get iTunes compilation.
    * 
    * @return iTunes compilation.
    */
    @Nullable
    public final String getCompilationAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.COMPILATION);
    }

   /**
    * Get iTunes compilation.
    * 
    * @return iTunes compilation.
    */
    @Nullable
    public final Boolean getCompilationAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.COMPILATION);
    }

   /**
    * Get iTunes compilation.
    * 
    * @return iTunes compilation.
    */
    @Nullable
    public final BigInteger getCompilationAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.COMPILATION);
    }

   /**
    * Get iTunes compilation.
    * 
    * @return iTunes compilation.
    */
    @Nullable
    public final URL getCompilationAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.COMPILATION);
    }

   /**
    * Get iTunes compilation.
    * 
    * @return iTunes compilation.
    */
    @NonNull
    public final List<@NonNull String> getCompilationAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.COMPILATION);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Stream order in the file, whatever is the kind of stream (base=0).
    * 
    * @return Stream order in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final Integer getStreamOrderAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.STREAMORDER);
    }

   /**
    * Get Stream order in the file, whatever is the kind of stream (base=0).
    * 
    * @return Stream order in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final Long getStreamOrderAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.STREAMORDER);
    }

   /**
    * Get Stream order in the file, whatever is the kind of stream (base=0).
    * 
    * @return Stream order in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final LocalDateTime getStreamOrderAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.STREAMORDER);
    }

   /**
    * Get Stream order in the file, whatever is the kind of stream (base=0).
    * 
    * @return Stream order in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final LocalTime getStreamOrderAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.STREAMORDER);
    }

   /**
    * Get Stream order in the file, whatever is the kind of stream (base=0).
    * 
    * @return Stream order in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final String getStreamOrderAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.STREAMORDER);
    }

   /**
    * Get Stream order in the file, whatever is the kind of stream (base=0).
    * 
    * @return Stream order in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final Boolean getStreamOrderAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.STREAMORDER);
    }

   /**
    * Get Stream order in the file, whatever is the kind of stream (base=0).
    * 
    * @return Stream order in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final BigInteger getStreamOrderAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.STREAMORDER);
    }

   /**
    * Get Stream order in the file, whatever is the kind of stream (base=0).
    * 
    * @return Stream order in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final URL getStreamOrderAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.STREAMORDER);
    }

   /**
    * Get Stream order in the file, whatever is the kind of stream (base=0).
    * 
    * @return Stream order in the file, whatever is the kind of stream (base=0).
    */
    @NonNull
    public final List<@NonNull String> getStreamOrderAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.STREAMORDER);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Name of the the encoding-software.
    * 
    * @return Name of the the encoding-software.
    */
    @Nullable
    public final Integer getEncodedLibraryNameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ENCODEDLIBRARYNAME);
    }

   /**
    * Get Name of the the encoding-software.
    * 
    * @return Name of the the encoding-software.
    */
    @Nullable
    public final Long getEncodedLibraryNameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ENCODEDLIBRARYNAME);
    }

   /**
    * Get Name of the the encoding-software.
    * 
    * @return Name of the the encoding-software.
    */
    @Nullable
    public final LocalDateTime getEncodedLibraryNameAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ENCODEDLIBRARYNAME);
    }

   /**
    * Get Name of the the encoding-software.
    * 
    * @return Name of the the encoding-software.
    */
    @Nullable
    public final LocalTime getEncodedLibraryNameAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ENCODEDLIBRARYNAME);
    }

   /**
    * Get Name of the the encoding-software.
    * 
    * @return Name of the the encoding-software.
    */
    @Nullable
    public final String getEncodedLibraryNameAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ENCODEDLIBRARYNAME);
    }

   /**
    * Get Name of the the encoding-software.
    * 
    * @return Name of the the encoding-software.
    */
    @Nullable
    public final Boolean getEncodedLibraryNameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ENCODEDLIBRARYNAME);
    }

   /**
    * Get Name of the the encoding-software.
    * 
    * @return Name of the the encoding-software.
    */
    @Nullable
    public final BigInteger getEncodedLibraryNameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ENCODEDLIBRARYNAME);
    }

   /**
    * Get Name of the the encoding-software.
    * 
    * @return Name of the the encoding-software.
    */
    @Nullable
    public final URL getEncodedLibraryNameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ENCODEDLIBRARYNAME);
    }

   /**
    * Get Name of the the encoding-software.
    * 
    * @return Name of the the encoding-software.
    */
    @NonNull
    public final List<@NonNull String> getEncodedLibraryNameAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ENCODEDLIBRARYNAME);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get (Generic)More info about the title of file.
    * 
    * @return (Generic)More info about the title of file.
    */
    @Nullable
    public final Integer getTitleMoreAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.TITLEMORE);
    }

   /**
    * Get (Generic)More info about the title of file.
    * 
    * @return (Generic)More info about the title of file.
    */
    @Nullable
    public final Long getTitleMoreAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.TITLEMORE);
    }

   /**
    * Get (Generic)More info about the title of file.
    * 
    * @return (Generic)More info about the title of file.
    */
    @Nullable
    public final LocalDateTime getTitleMoreAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.TITLEMORE);
    }

   /**
    * Get (Generic)More info about the title of file.
    * 
    * @return (Generic)More info about the title of file.
    */
    @Nullable
    public final LocalTime getTitleMoreAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.TITLEMORE);
    }

   /**
    * Get (Generic)More info about the title of file.
    * 
    * @return (Generic)More info about the title of file.
    */
    @Nullable
    public final String getTitleMoreAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.TITLEMORE);
    }

   /**
    * Get (Generic)More info about the title of file.
    * 
    * @return (Generic)More info about the title of file.
    */
    @Nullable
    public final Boolean getTitleMoreAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.TITLEMORE);
    }

   /**
    * Get (Generic)More info about the title of file.
    * 
    * @return (Generic)More info about the title of file.
    */
    @Nullable
    public final BigInteger getTitleMoreAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.TITLEMORE);
    }

   /**
    * Get (Generic)More info about the title of file.
    * 
    * @return (Generic)More info about the title of file.
    */
    @Nullable
    public final URL getTitleMoreAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.TITLEMORE);
    }

   /**
    * Get (Generic)More info about the title of file.
    * 
    * @return (Generic)More info about the title of file.
    */
    @NonNull
    public final List<@NonNull String> getTitleMoreAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.TITLEMORE);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Describes the changes in lightness settings on the digitizer required to produce the file.
    * 
    * @return Describes the changes in lightness settings on the digitizer required to produce the file.
    */
    @Nullable
    public final Integer getLightnessAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.LIGHTNESS);
    }

   /**
    * Get Describes the changes in lightness settings on the digitizer required to produce the file.
    * 
    * @return Describes the changes in lightness settings on the digitizer required to produce the file.
    */
    @Nullable
    public final Long getLightnessAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.LIGHTNESS);
    }

   /**
    * Get Describes the changes in lightness settings on the digitizer required to produce the file.
    * 
    * @return Describes the changes in lightness settings on the digitizer required to produce the file.
    */
    @Nullable
    public final LocalDateTime getLightnessAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.LIGHTNESS);
    }

   /**
    * Get Describes the changes in lightness settings on the digitizer required to produce the file.
    * 
    * @return Describes the changes in lightness settings on the digitizer required to produce the file.
    */
    @Nullable
    public final LocalTime getLightnessAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.LIGHTNESS);
    }

   /**
    * Get Describes the changes in lightness settings on the digitizer required to produce the file.
    * 
    * @return Describes the changes in lightness settings on the digitizer required to produce the file.
    */
    @Nullable
    public final String getLightnessAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.LIGHTNESS);
    }

   /**
    * Get Describes the changes in lightness settings on the digitizer required to produce the file.
    * 
    * @return Describes the changes in lightness settings on the digitizer required to produce the file.
    */
    @Nullable
    public final Boolean getLightnessAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.LIGHTNESS);
    }

   /**
    * Get Describes the changes in lightness settings on the digitizer required to produce the file.
    * 
    * @return Describes the changes in lightness settings on the digitizer required to produce the file.
    */
    @Nullable
    public final BigInteger getLightnessAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.LIGHTNESS);
    }

   /**
    * Get Describes the changes in lightness settings on the digitizer required to produce the file.
    * 
    * @return Describes the changes in lightness settings on the digitizer required to produce the file.
    */
    @Nullable
    public final URL getLightnessAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.LIGHTNESS);
    }

   /**
    * Get Describes the changes in lightness settings on the digitizer required to produce the file.
    * 
    * @return Describes the changes in lightness settings on the digitizer required to produce the file.
    */
    @NonNull
    public final List<@NonNull String> getLightnessAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.LIGHTNESS);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Identifies the changes in sharpness for the digitizer requiered to produce the file.
    * 
    * @return Identifies the changes in sharpness for the digitizer requiered to produce the file.
    */
    @Nullable
    public final Integer getOriginalSourceFormSharpnessAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ORIGINALSOURCEFORMSHARPNESS);
    }

   /**
    * Get Identifies the changes in sharpness for the digitizer requiered to produce the file.
    * 
    * @return Identifies the changes in sharpness for the digitizer requiered to produce the file.
    */
    @Nullable
    public final Long getOriginalSourceFormSharpnessAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ORIGINALSOURCEFORMSHARPNESS);
    }

   /**
    * Get Identifies the changes in sharpness for the digitizer requiered to produce the file.
    * 
    * @return Identifies the changes in sharpness for the digitizer requiered to produce the file.
    */
    @Nullable
    public final LocalDateTime getOriginalSourceFormSharpnessAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ORIGINALSOURCEFORMSHARPNESS);
    }

   /**
    * Get Identifies the changes in sharpness for the digitizer requiered to produce the file.
    * 
    * @return Identifies the changes in sharpness for the digitizer requiered to produce the file.
    */
    @Nullable
    public final LocalTime getOriginalSourceFormSharpnessAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ORIGINALSOURCEFORMSHARPNESS);
    }

   /**
    * Get Identifies the changes in sharpness for the digitizer requiered to produce the file.
    * 
    * @return Identifies the changes in sharpness for the digitizer requiered to produce the file.
    */
    @Nullable
    public final String getOriginalSourceFormSharpnessAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ORIGINALSOURCEFORMSHARPNESS);
    }

   /**
    * Get Identifies the changes in sharpness for the digitizer requiered to produce the file.
    * 
    * @return Identifies the changes in sharpness for the digitizer requiered to produce the file.
    */
    @Nullable
    public final Boolean getOriginalSourceFormSharpnessAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ORIGINALSOURCEFORMSHARPNESS);
    }

   /**
    * Get Identifies the changes in sharpness for the digitizer requiered to produce the file.
    * 
    * @return Identifies the changes in sharpness for the digitizer requiered to produce the file.
    */
    @Nullable
    public final BigInteger getOriginalSourceFormSharpnessAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ORIGINALSOURCEFORMSHARPNESS);
    }

   /**
    * Get Identifies the changes in sharpness for the digitizer requiered to produce the file.
    * 
    * @return Identifies the changes in sharpness for the digitizer requiered to produce the file.
    */
    @Nullable
    public final URL getOriginalSourceFormSharpnessAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ORIGINALSOURCEFORMSHARPNESS);
    }

   /**
    * Get Identifies the changes in sharpness for the digitizer requiered to produce the file.
    * 
    * @return Identifies the changes in sharpness for the digitizer requiered to produce the file.
    */
    @NonNull
    public final List<@NonNull String> getOriginalSourceFormSharpnessAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ORIGINALSOURCEFORMSHARPNESS);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get File extension only.
    * 
    * @return File extension only.
    */
    @Nullable
    public final Integer getFileExtensionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.FILEEXTENSION);
    }

   /**
    * Get File extension only.
    * 
    * @return File extension only.
    */
    @Nullable
    public final Long getFileExtensionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.FILEEXTENSION);
    }

   /**
    * Get File extension only.
    * 
    * @return File extension only.
    */
    @Nullable
    public final LocalDateTime getFileExtensionAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.FILEEXTENSION);
    }

   /**
    * Get File extension only.
    * 
    * @return File extension only.
    */
    @Nullable
    public final LocalTime getFileExtensionAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.FILEEXTENSION);
    }

   /**
    * Get File extension only.
    * 
    * @return File extension only.
    */
    @Nullable
    public final String getFileExtensionAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.FILEEXTENSION);
    }

   /**
    * Get File extension only.
    * 
    * @return File extension only.
    */
    @Nullable
    public final Boolean getFileExtensionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.FILEEXTENSION);
    }

   /**
    * Get File extension only.
    * 
    * @return File extension only.
    */
    @Nullable
    public final BigInteger getFileExtensionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.FILEEXTENSION);
    }

   /**
    * Get File extension only.
    * 
    * @return File extension only.
    */
    @Nullable
    public final URL getFileExtensionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.FILEEXTENSION);
    }

   /**
    * Get File extension only.
    * 
    * @return File extension only.
    */
    @NonNull
    public final List<@NonNull String> getFileExtensionAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.FILEEXTENSION);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Real name of an actor or actress playing a role in the movie..
    * 
    * @return Real name of an actor or actress playing a role in the movie..
    */
    @Nullable
    public final Integer getActorAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ACTOR);
    }

   /**
    * Get Real name of an actor or actress playing a role in the movie..
    * 
    * @return Real name of an actor or actress playing a role in the movie..
    */
    @Nullable
    public final Long getActorAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ACTOR);
    }

   /**
    * Get Real name of an actor or actress playing a role in the movie..
    * 
    * @return Real name of an actor or actress playing a role in the movie..
    */
    @Nullable
    public final LocalDateTime getActorAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ACTOR);
    }

   /**
    * Get Real name of an actor or actress playing a role in the movie..
    * 
    * @return Real name of an actor or actress playing a role in the movie..
    */
    @Nullable
    public final LocalTime getActorAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ACTOR);
    }

   /**
    * Get Real name of an actor or actress playing a role in the movie..
    * 
    * @return Real name of an actor or actress playing a role in the movie..
    */
    @Nullable
    public final String getActorAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ACTOR);
    }

   /**
    * Get Real name of an actor or actress playing a role in the movie..
    * 
    * @return Real name of an actor or actress playing a role in the movie..
    */
    @Nullable
    public final Boolean getActorAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ACTOR);
    }

   /**
    * Get Real name of an actor or actress playing a role in the movie..
    * 
    * @return Real name of an actor or actress playing a role in the movie..
    */
    @Nullable
    public final BigInteger getActorAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ACTOR);
    }

   /**
    * Get Real name of an actor or actress playing a role in the movie..
    * 
    * @return Real name of an actor or actress playing a role in the movie..
    */
    @Nullable
    public final URL getActorAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ACTOR);
    }

   /**
    * Get Real name of an actor or actress playing a role in the movie..
    * 
    * @return Real name of an actor or actress playing a role in the movie..
    */
    @NonNull
    public final List<@NonNull String> getActorAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ACTOR);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get name of the person or organization that commissioned the subject of the file.
    * 
    * @return name of the person or organization that commissioned the subject of the file.
    */
    @Nullable
    public final Integer getCommissionedByAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.COMMISSIONEDBY);
    }

   /**
    * Get name of the person or organization that commissioned the subject of the file.
    * 
    * @return name of the person or organization that commissioned the subject of the file.
    */
    @Nullable
    public final Long getCommissionedByAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.COMMISSIONEDBY);
    }

   /**
    * Get name of the person or organization that commissioned the subject of the file.
    * 
    * @return name of the person or organization that commissioned the subject of the file.
    */
    @Nullable
    public final LocalDateTime getCommissionedByAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.COMMISSIONEDBY);
    }

   /**
    * Get name of the person or organization that commissioned the subject of the file.
    * 
    * @return name of the person or organization that commissioned the subject of the file.
    */
    @Nullable
    public final LocalTime getCommissionedByAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.COMMISSIONEDBY);
    }

   /**
    * Get name of the person or organization that commissioned the subject of the file.
    * 
    * @return name of the person or organization that commissioned the subject of the file.
    */
    @Nullable
    public final String getCommissionedByAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.COMMISSIONEDBY);
    }

   /**
    * Get name of the person or organization that commissioned the subject of the file.
    * 
    * @return name of the person or organization that commissioned the subject of the file.
    */
    @Nullable
    public final Boolean getCommissionedByAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.COMMISSIONEDBY);
    }

   /**
    * Get name of the person or organization that commissioned the subject of the file.
    * 
    * @return name of the person or organization that commissioned the subject of the file.
    */
    @Nullable
    public final BigInteger getCommissionedByAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.COMMISSIONEDBY);
    }

   /**
    * Get name of the person or organization that commissioned the subject of the file.
    * 
    * @return name of the person or organization that commissioned the subject of the file.
    */
    @Nullable
    public final URL getCommissionedByAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.COMMISSIONEDBY);
    }

   /**
    * Get name of the person or organization that commissioned the subject of the file.
    * 
    * @return name of the person or organization that commissioned the subject of the file.
    */
    @NonNull
    public final List<@NonNull String> getCommissionedByAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.COMMISSIONEDBY);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Compression method used.
    * 
    * @return Compression method used.
    */
    @Nullable
    public final Integer getFormatCompressionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.FORMATCOMPRESSION);
    }

   /**
    * Get Compression method used.
    * 
    * @return Compression method used.
    */
    @Nullable
    public final Long getFormatCompressionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.FORMATCOMPRESSION);
    }

   /**
    * Get Compression method used.
    * 
    * @return Compression method used.
    */
    @Nullable
    public final LocalDateTime getFormatCompressionAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.FORMATCOMPRESSION);
    }

   /**
    * Get Compression method used.
    * 
    * @return Compression method used.
    */
    @Nullable
    public final LocalTime getFormatCompressionAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.FORMATCOMPRESSION);
    }

   /**
    * Get Compression method used.
    * 
    * @return Compression method used.
    */
    @Nullable
    public final String getFormatCompressionAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.FORMATCOMPRESSION);
    }

   /**
    * Get Compression method used.
    * 
    * @return Compression method used.
    */
    @Nullable
    public final Boolean getFormatCompressionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.FORMATCOMPRESSION);
    }

   /**
    * Get Compression method used.
    * 
    * @return Compression method used.
    */
    @Nullable
    public final BigInteger getFormatCompressionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.FORMATCOMPRESSION);
    }

   /**
    * Get Compression method used.
    * 
    * @return Compression method used.
    */
    @Nullable
    public final URL getFormatCompressionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.FORMATCOMPRESSION);
    }

   /**
    * Get Compression method used.
    * 
    * @return Compression method used.
    */
    @NonNull
    public final List<@NonNull String> getFormatCompressionAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.FORMATCOMPRESSION);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Band/orchestra/accompaniment/musician..
    * 
    * @return Band/orchestra/accompaniment/musician..
    */
    @Nullable
    public final Integer getAccompanimentAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ACCOMPANIMENT);
    }

   /**
    * Get Band/orchestra/accompaniment/musician..
    * 
    * @return Band/orchestra/accompaniment/musician..
    */
    @Nullable
    public final Long getAccompanimentAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ACCOMPANIMENT);
    }

   /**
    * Get Band/orchestra/accompaniment/musician..
    * 
    * @return Band/orchestra/accompaniment/musician..
    */
    @Nullable
    public final LocalDateTime getAccompanimentAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ACCOMPANIMENT);
    }

   /**
    * Get Band/orchestra/accompaniment/musician..
    * 
    * @return Band/orchestra/accompaniment/musician..
    */
    @Nullable
    public final LocalTime getAccompanimentAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ACCOMPANIMENT);
    }

   /**
    * Get Band/orchestra/accompaniment/musician..
    * 
    * @return Band/orchestra/accompaniment/musician..
    */
    @Nullable
    public final String getAccompanimentAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ACCOMPANIMENT);
    }

   /**
    * Get Band/orchestra/accompaniment/musician..
    * 
    * @return Band/orchestra/accompaniment/musician..
    */
    @Nullable
    public final Boolean getAccompanimentAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ACCOMPANIMENT);
    }

   /**
    * Get Band/orchestra/accompaniment/musician..
    * 
    * @return Band/orchestra/accompaniment/musician..
    */
    @Nullable
    public final BigInteger getAccompanimentAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ACCOMPANIMENT);
    }

   /**
    * Get Band/orchestra/accompaniment/musician..
    * 
    * @return Band/orchestra/accompaniment/musician..
    */
    @Nullable
    public final URL getAccompanimentAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ACCOMPANIMENT);
    }

   /**
    * Get Band/orchestra/accompaniment/musician..
    * 
    * @return Band/orchestra/accompaniment/musician..
    */
    @NonNull
    public final List<@NonNull String> getAccompanimentAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ACCOMPANIMENT);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Cover, in binary format encoded BASE64.
    * 
    * @return Cover, in binary format encoded BASE64.
    */
    @Nullable
    public final Integer getCoverDataAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.COVERDATA);
    }

   /**
    * Get Cover, in binary format encoded BASE64.
    * 
    * @return Cover, in binary format encoded BASE64.
    */
    @Nullable
    public final Long getCoverDataAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.COVERDATA);
    }

   /**
    * Get Cover, in binary format encoded BASE64.
    * 
    * @return Cover, in binary format encoded BASE64.
    */
    @Nullable
    public final LocalDateTime getCoverDataAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.COVERDATA);
    }

   /**
    * Get Cover, in binary format encoded BASE64.
    * 
    * @return Cover, in binary format encoded BASE64.
    */
    @Nullable
    public final LocalTime getCoverDataAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.COVERDATA);
    }

   /**
    * Get Cover, in binary format encoded BASE64.
    * 
    * @return Cover, in binary format encoded BASE64.
    */
    @Nullable
    public final String getCoverDataAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.COVERDATA);
    }

   /**
    * Get Cover, in binary format encoded BASE64.
    * 
    * @return Cover, in binary format encoded BASE64.
    */
    @Nullable
    public final Boolean getCoverDataAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.COVERDATA);
    }

   /**
    * Get Cover, in binary format encoded BASE64.
    * 
    * @return Cover, in binary format encoded BASE64.
    */
    @Nullable
    public final BigInteger getCoverDataAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.COVERDATA);
    }

   /**
    * Get Cover, in binary format encoded BASE64.
    * 
    * @return Cover, in binary format encoded BASE64.
    */
    @Nullable
    public final URL getCoverDataAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.COVERDATA);
    }

   /**
    * Get Cover, in binary format encoded BASE64.
    * 
    * @return Cover, in binary format encoded BASE64.
    */
    @NonNull
    public final List<@NonNull String> getCoverDataAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.COVERDATA);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Video Codecs in this file, separated by /.
    * 
    * @return Video Codecs in this file, separated by /.
    */
    @Nullable
    public final Integer getVideoFormatListAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.VIDEOFORMATLIST);
    }

   /**
    * Get Video Codecs in this file, separated by /.
    * 
    * @return Video Codecs in this file, separated by /.
    */
    @Nullable
    public final Long getVideoFormatListAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.VIDEOFORMATLIST);
    }

   /**
    * Get Video Codecs in this file, separated by /.
    * 
    * @return Video Codecs in this file, separated by /.
    */
    @Nullable
    public final LocalDateTime getVideoFormatListAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.VIDEOFORMATLIST);
    }

   /**
    * Get Video Codecs in this file, separated by /.
    * 
    * @return Video Codecs in this file, separated by /.
    */
    @Nullable
    public final LocalTime getVideoFormatListAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.VIDEOFORMATLIST);
    }

   /**
    * Get Video Codecs in this file, separated by /.
    * 
    * @return Video Codecs in this file, separated by /.
    */
    @Nullable
    public final String getVideoFormatListAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.VIDEOFORMATLIST);
    }

   /**
    * Get Video Codecs in this file, separated by /.
    * 
    * @return Video Codecs in this file, separated by /.
    */
    @Nullable
    public final Boolean getVideoFormatListAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.VIDEOFORMATLIST);
    }

   /**
    * Get Video Codecs in this file, separated by /.
    * 
    * @return Video Codecs in this file, separated by /.
    */
    @Nullable
    public final BigInteger getVideoFormatListAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.VIDEOFORMATLIST);
    }

   /**
    * Get Video Codecs in this file, separated by /.
    * 
    * @return Video Codecs in this file, separated by /.
    */
    @Nullable
    public final URL getVideoFormatListAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.VIDEOFORMATLIST);
    }

   /**
    * Get Video Codecs in this file, separated by /.
    * 
    * @return Video Codecs in this file, separated by /.
    */
    @NonNull
    public final List<@NonNull String> getVideoFormatListAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.VIDEOFORMATLIST);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Integer getDelayStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.DELAYSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Long getDelayStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.DELAYSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final LocalDateTime getDelayStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.DELAYSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final LocalTime getDelayStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.DELAYSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final String getDelayStringAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.DELAYSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Boolean getDelayStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.DELAYSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final BigInteger getDelayStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.DELAYSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final URL getDelayStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.DELAYSTRING);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @NonNull
    public final List<@NonNull String> getDelayStringAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.DELAYSTRING);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get The date/year that the item was released..
    * 
    * @return The date/year that the item was released..
    */
    @Nullable
    public final Integer getReleasedDateAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.RELEASEDDATE);
    }

   /**
    * Get The date/year that the item was released..
    * 
    * @return The date/year that the item was released..
    */
    @Nullable
    public final Long getReleasedDateAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.RELEASEDDATE);
    }

   /**
    * Get The date/year that the item was released..
    * 
    * @return The date/year that the item was released..
    */
    @Nullable
    public final LocalDateTime getReleasedDateAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.RELEASEDDATE);
    }

   /**
    * Get The date/year that the item was released..
    * 
    * @return The date/year that the item was released..
    */
    @Nullable
    public final LocalTime getReleasedDateAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.RELEASEDDATE);
    }

   /**
    * Get The date/year that the item was released..
    * 
    * @return The date/year that the item was released..
    */
    @Nullable
    public final String getReleasedDateAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.RELEASEDDATE);
    }

   /**
    * Get The date/year that the item was released..
    * 
    * @return The date/year that the item was released..
    */
    @Nullable
    public final Boolean getReleasedDateAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.RELEASEDDATE);
    }

   /**
    * Get The date/year that the item was released..
    * 
    * @return The date/year that the item was released..
    */
    @Nullable
    public final BigInteger getReleasedDateAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.RELEASEDDATE);
    }

   /**
    * Get The date/year that the item was released..
    * 
    * @return The date/year that the item was released..
    */
    @Nullable
    public final URL getReleasedDateAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.RELEASEDDATE);
    }

   /**
    * Get The date/year that the item was released..
    * 
    * @return The date/year that the item was released..
    */
    @NonNull
    public final List<@NonNull String> getReleasedDateAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.RELEASEDDATE);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Manual description given by the container.
    * 
    * @return Manual description given by the container.
    */
    @Nullable
    public final Integer getCodecIDDescriptionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.CODECIDDESCRIPTION);
    }

   /**
    * Get Manual description given by the container.
    * 
    * @return Manual description given by the container.
    */
    @Nullable
    public final Long getCodecIDDescriptionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.CODECIDDESCRIPTION);
    }

   /**
    * Get Manual description given by the container.
    * 
    * @return Manual description given by the container.
    */
    @Nullable
    public final LocalDateTime getCodecIDDescriptionAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.CODECIDDESCRIPTION);
    }

   /**
    * Get Manual description given by the container.
    * 
    * @return Manual description given by the container.
    */
    @Nullable
    public final LocalTime getCodecIDDescriptionAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.CODECIDDESCRIPTION);
    }

   /**
    * Get Manual description given by the container.
    * 
    * @return Manual description given by the container.
    */
    @Nullable
    public final String getCodecIDDescriptionAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.CODECIDDESCRIPTION);
    }

   /**
    * Get Manual description given by the container.
    * 
    * @return Manual description given by the container.
    */
    @Nullable
    public final Boolean getCodecIDDescriptionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.CODECIDDESCRIPTION);
    }

   /**
    * Get Manual description given by the container.
    * 
    * @return Manual description given by the container.
    */
    @Nullable
    public final BigInteger getCodecIDDescriptionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.CODECIDDESCRIPTION);
    }

   /**
    * Get Manual description given by the container.
    * 
    * @return Manual description given by the container.
    */
    @Nullable
    public final URL getCodecIDDescriptionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.CODECIDDESCRIPTION);
    }

   /**
    * Get Manual description given by the container.
    * 
    * @return Manual description given by the container.
    */
    @NonNull
    public final List<@NonNull String> getCodecIDDescriptionAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.CODECIDDESCRIPTION);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    * 
    * @return bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    */
    @Nullable
    public final Integer getStatusAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.STATUS);
    }

   /**
    * Get bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    * 
    * @return bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    */
    @Nullable
    public final Long getStatusAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.STATUS);
    }

   /**
    * Get bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    * 
    * @return bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    */
    @Nullable
    public final LocalDateTime getStatusAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.STATUS);
    }

   /**
    * Get bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    * 
    * @return bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    */
    @Nullable
    public final LocalTime getStatusAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.STATUS);
    }

   /**
    * Get bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    * 
    * @return bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    */
    @Nullable
    public final String getStatusAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.STATUS);
    }

   /**
    * Get bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    * 
    * @return bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    */
    @Nullable
    public final Boolean getStatusAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.STATUS);
    }

   /**
    * Get bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    * 
    * @return bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    */
    @Nullable
    public final BigInteger getStatusAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.STATUS);
    }

   /**
    * Get bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    * 
    * @return bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    */
    @Nullable
    public final URL getStatusAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.STATUS);
    }

   /**
    * Get bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    * 
    * @return bit field (0=IsAccepted, 1=IsFilled, 2=IsUpdated, 3=IsFinished).
    */
    @NonNull
    public final List<@NonNull String> getStatusAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.STATUS);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get File size (with measure, 2 digit mini).
    * 
    * @return File size (with measure, 2 digit mini).
    */
    @Nullable
    public final Integer getFileSizeString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.FILESIZESTRING2);
    }

   /**
    * Get File size (with measure, 2 digit mini).
    * 
    * @return File size (with measure, 2 digit mini).
    */
    @Nullable
    public final Long getFileSizeString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.FILESIZESTRING2);
    }

   /**
    * Get File size (with measure, 2 digit mini).
    * 
    * @return File size (with measure, 2 digit mini).
    */
    @Nullable
    public final LocalDateTime getFileSizeString2AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.FILESIZESTRING2);
    }

   /**
    * Get File size (with measure, 2 digit mini).
    * 
    * @return File size (with measure, 2 digit mini).
    */
    @Nullable
    public final LocalTime getFileSizeString2AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.FILESIZESTRING2);
    }

   /**
    * Get File size (with measure, 2 digit mini).
    * 
    * @return File size (with measure, 2 digit mini).
    */
    @Nullable
    public final String getFileSizeString2AsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.FILESIZESTRING2);
    }

   /**
    * Get File size (with measure, 2 digit mini).
    * 
    * @return File size (with measure, 2 digit mini).
    */
    @Nullable
    public final Boolean getFileSizeString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.FILESIZESTRING2);
    }

   /**
    * Get File size (with measure, 2 digit mini).
    * 
    * @return File size (with measure, 2 digit mini).
    */
    @Nullable
    public final BigInteger getFileSizeString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.FILESIZESTRING2);
    }

   /**
    * Get File size (with measure, 2 digit mini).
    * 
    * @return File size (with measure, 2 digit mini).
    */
    @Nullable
    public final URL getFileSizeString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.FILESIZESTRING2);
    }

   /**
    * Get File size (with measure, 2 digit mini).
    * 
    * @return File size (with measure, 2 digit mini).
    */
    @NonNull
    public final List<@NonNull String> getFileSizeString2AsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.FILESIZESTRING2);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Original name of the track in the original support.
    * 
    * @return Original name of the track in the original support.
    */
    @Nullable
    public final Integer getOriginalTrackAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ORIGINALTRACK);
    }

   /**
    * Get Original name of the track in the original support.
    * 
    * @return Original name of the track in the original support.
    */
    @Nullable
    public final Long getOriginalTrackAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ORIGINALTRACK);
    }

   /**
    * Get Original name of the track in the original support.
    * 
    * @return Original name of the track in the original support.
    */
    @Nullable
    public final LocalDateTime getOriginalTrackAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ORIGINALTRACK);
    }

   /**
    * Get Original name of the track in the original support.
    * 
    * @return Original name of the track in the original support.
    */
    @Nullable
    public final LocalTime getOriginalTrackAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ORIGINALTRACK);
    }

   /**
    * Get Original name of the track in the original support.
    * 
    * @return Original name of the track in the original support.
    */
    @Nullable
    public final String getOriginalTrackAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ORIGINALTRACK);
    }

   /**
    * Get Original name of the track in the original support.
    * 
    * @return Original name of the track in the original support.
    */
    @Nullable
    public final Boolean getOriginalTrackAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ORIGINALTRACK);
    }

   /**
    * Get Original name of the track in the original support.
    * 
    * @return Original name of the track in the original support.
    */
    @Nullable
    public final BigInteger getOriginalTrackAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ORIGINALTRACK);
    }

   /**
    * Get Original name of the track in the original support.
    * 
    * @return Original name of the track in the original support.
    */
    @Nullable
    public final URL getOriginalTrackAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ORIGINALTRACK);
    }

   /**
    * Get Original name of the track in the original support.
    * 
    * @return Original name of the track in the original support.
    */
    @NonNull
    public final List<@NonNull String> getOriginalTrackAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ORIGINALTRACK);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Podcast category.
    * 
    * @return Podcast category.
    */
    @Nullable
    public final Integer getPodcastCategoryAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.PODCASTCATEGORY);
    }

   /**
    * Get Podcast category.
    * 
    * @return Podcast category.
    */
    @Nullable
    public final Long getPodcastCategoryAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.PODCASTCATEGORY);
    }

   /**
    * Get Podcast category.
    * 
    * @return Podcast category.
    */
    @Nullable
    public final LocalDateTime getPodcastCategoryAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.PODCASTCATEGORY);
    }

   /**
    * Get Podcast category.
    * 
    * @return Podcast category.
    */
    @Nullable
    public final LocalTime getPodcastCategoryAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.PODCASTCATEGORY);
    }

   /**
    * Get Podcast category.
    * 
    * @return Podcast category.
    */
    @Nullable
    public final String getPodcastCategoryAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.PODCASTCATEGORY);
    }

   /**
    * Get Podcast category.
    * 
    * @return Podcast category.
    */
    @Nullable
    public final Boolean getPodcastCategoryAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.PODCASTCATEGORY);
    }

   /**
    * Get Podcast category.
    * 
    * @return Podcast category.
    */
    @Nullable
    public final BigInteger getPodcastCategoryAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.PODCASTCATEGORY);
    }

   /**
    * Get Podcast category.
    * 
    * @return Podcast category.
    */
    @Nullable
    public final URL getPodcastCategoryAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.PODCASTCATEGORY);
    }

   /**
    * Get Podcast category.
    * 
    * @return Podcast category.
    */
    @NonNull
    public final List<@NonNull String> getPodcastCategoryAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.PODCASTCATEGORY);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get File size (with measure, 1 digit mini).
    * 
    * @return File size (with measure, 1 digit mini).
    */
    @Nullable
    public final Integer getFileSizeString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.FILESIZESTRING1);
    }

   /**
    * Get File size (with measure, 1 digit mini).
    * 
    * @return File size (with measure, 1 digit mini).
    */
    @Nullable
    public final Long getFileSizeString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.FILESIZESTRING1);
    }

   /**
    * Get File size (with measure, 1 digit mini).
    * 
    * @return File size (with measure, 1 digit mini).
    */
    @Nullable
    public final LocalDateTime getFileSizeString1AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.FILESIZESTRING1);
    }

   /**
    * Get File size (with measure, 1 digit mini).
    * 
    * @return File size (with measure, 1 digit mini).
    */
    @Nullable
    public final LocalTime getFileSizeString1AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.FILESIZESTRING1);
    }

   /**
    * Get File size (with measure, 1 digit mini).
    * 
    * @return File size (with measure, 1 digit mini).
    */
    @Nullable
    public final String getFileSizeString1AsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.FILESIZESTRING1);
    }

   /**
    * Get File size (with measure, 1 digit mini).
    * 
    * @return File size (with measure, 1 digit mini).
    */
    @Nullable
    public final Boolean getFileSizeString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.FILESIZESTRING1);
    }

   /**
    * Get File size (with measure, 1 digit mini).
    * 
    * @return File size (with measure, 1 digit mini).
    */
    @Nullable
    public final BigInteger getFileSizeString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.FILESIZESTRING1);
    }

   /**
    * Get File size (with measure, 1 digit mini).
    * 
    * @return File size (with measure, 1 digit mini).
    */
    @Nullable
    public final URL getFileSizeString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.FILESIZESTRING1);
    }

   /**
    * Get File size (with measure, 1 digit mini).
    * 
    * @return File size (with measure, 1 digit mini).
    */
    @NonNull
    public final List<@NonNull String> getFileSizeString1AsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.FILESIZESTRING1);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Frames per second.
    * 
    * @return Frames per second.
    */
    @Nullable
    public final Integer getFrameRateAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.FRAMERATE);
    }

   /**
    * Get Frames per second.
    * 
    * @return Frames per second.
    */
    @Nullable
    public final Long getFrameRateAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.FRAMERATE);
    }

   /**
    * Get Frames per second.
    * 
    * @return Frames per second.
    */
    @Nullable
    public final LocalDateTime getFrameRateAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.FRAMERATE);
    }

   /**
    * Get Frames per second.
    * 
    * @return Frames per second.
    */
    @Nullable
    public final LocalTime getFrameRateAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.FRAMERATE);
    }

   /**
    * Get Frames per second.
    * 
    * @return Frames per second.
    */
    @Nullable
    public final String getFrameRateAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.FRAMERATE);
    }

   /**
    * Get Frames per second.
    * 
    * @return Frames per second.
    */
    @Nullable
    public final Boolean getFrameRateAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.FRAMERATE);
    }

   /**
    * Get Frames per second.
    * 
    * @return Frames per second.
    */
    @Nullable
    public final BigInteger getFrameRateAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.FRAMERATE);
    }

   /**
    * Get Frames per second.
    * 
    * @return Frames per second.
    */
    @Nullable
    public final URL getFrameRateAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.FRAMERATE);
    }

   /**
    * Get Frames per second.
    * 
    * @return Frames per second.
    */
    @NonNull
    public final List<@NonNull String> getFrameRateAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.FRAMERATE);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Number of this track.
    * 
    * @return Number of this track.
    */
    @Nullable
    public final Integer getTrackPositionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.TRACKPOSITION);
    }

   /**
    * Get Number of this track.
    * 
    * @return Number of this track.
    */
    @Nullable
    public final Long getTrackPositionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.TRACKPOSITION);
    }

   /**
    * Get Number of this track.
    * 
    * @return Number of this track.
    */
    @Nullable
    public final LocalDateTime getTrackPositionAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.TRACKPOSITION);
    }

   /**
    * Get Number of this track.
    * 
    * @return Number of this track.
    */
    @Nullable
    public final LocalTime getTrackPositionAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.TRACKPOSITION);
    }

   /**
    * Get Number of this track.
    * 
    * @return Number of this track.
    */
    @Nullable
    public final String getTrackPositionAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.TRACKPOSITION);
    }

   /**
    * Get Number of this track.
    * 
    * @return Number of this track.
    */
    @Nullable
    public final Boolean getTrackPositionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.TRACKPOSITION);
    }

   /**
    * Get Number of this track.
    * 
    * @return Number of this track.
    */
    @Nullable
    public final BigInteger getTrackPositionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.TRACKPOSITION);
    }

   /**
    * Get Number of this track.
    * 
    * @return Number of this track.
    */
    @Nullable
    public final URL getTrackPositionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.TRACKPOSITION);
    }

   /**
    * Get Number of this track.
    * 
    * @return Number of this track.
    */
    @NonNull
    public final List<@NonNull String> getTrackPositionAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.TRACKPOSITION);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Name of the assistant director..
    * 
    * @return Name of the assistant director..
    */
    @Nullable
    public final Integer getAssistantDirectorAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ASSISTANTDIRECTOR);
    }

   /**
    * Get Name of the assistant director..
    * 
    * @return Name of the assistant director..
    */
    @Nullable
    public final Long getAssistantDirectorAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ASSISTANTDIRECTOR);
    }

   /**
    * Get Name of the assistant director..
    * 
    * @return Name of the assistant director..
    */
    @Nullable
    public final LocalDateTime getAssistantDirectorAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ASSISTANTDIRECTOR);
    }

   /**
    * Get Name of the assistant director..
    * 
    * @return Name of the assistant director..
    */
    @Nullable
    public final LocalTime getAssistantDirectorAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ASSISTANTDIRECTOR);
    }

   /**
    * Get Name of the assistant director..
    * 
    * @return Name of the assistant director..
    */
    @Nullable
    public final String getAssistantDirectorAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ASSISTANTDIRECTOR);
    }

   /**
    * Get Name of the assistant director..
    * 
    * @return Name of the assistant director..
    */
    @Nullable
    public final Boolean getAssistantDirectorAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ASSISTANTDIRECTOR);
    }

   /**
    * Get Name of the assistant director..
    * 
    * @return Name of the assistant director..
    */
    @Nullable
    public final BigInteger getAssistantDirectorAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ASSISTANTDIRECTOR);
    }

   /**
    * Get Name of the assistant director..
    * 
    * @return Name of the assistant director..
    */
    @Nullable
    public final URL getAssistantDirectorAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ASSISTANTDIRECTOR);
    }

   /**
    * Get Name of the assistant director..
    * 
    * @return Name of the assistant director..
    */
    @NonNull
    public final List<@NonNull String> getAssistantDirectorAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ASSISTANTDIRECTOR);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Version of the CodecID.
    * 
    * @return Version of the CodecID.
    */
    @Nullable
    public final Integer getCodecIDVersionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.CODECIDVERSION);
    }

   /**
    * Get Version of the CodecID.
    * 
    * @return Version of the CodecID.
    */
    @Nullable
    public final Long getCodecIDVersionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.CODECIDVERSION);
    }

   /**
    * Get Version of the CodecID.
    * 
    * @return Version of the CodecID.
    */
    @Nullable
    public final LocalDateTime getCodecIDVersionAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.CODECIDVERSION);
    }

   /**
    * Get Version of the CodecID.
    * 
    * @return Version of the CodecID.
    */
    @Nullable
    public final LocalTime getCodecIDVersionAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.CODECIDVERSION);
    }

   /**
    * Get Version of the CodecID.
    * 
    * @return Version of the CodecID.
    */
    @Nullable
    public final String getCodecIDVersionAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.CODECIDVERSION);
    }

   /**
    * Get Version of the CodecID.
    * 
    * @return Version of the CodecID.
    */
    @Nullable
    public final Boolean getCodecIDVersionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.CODECIDVERSION);
    }

   /**
    * Get Version of the CodecID.
    * 
    * @return Version of the CodecID.
    */
    @Nullable
    public final BigInteger getCodecIDVersionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.CODECIDVERSION);
    }

   /**
    * Get Version of the CodecID.
    * 
    * @return Version of the CodecID.
    */
    @Nullable
    public final URL getCodecIDVersionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.CODECIDVERSION);
    }

   /**
    * Get Version of the CodecID.
    * 
    * @return Version of the CodecID.
    */
    @NonNull
    public final List<@NonNull String> getCodecIDVersionAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.CODECIDVERSION);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Video languagesin this file, full names, separated by /.
    * 
    * @return Video languagesin this file, full names, separated by /.
    */
    @Nullable
    public final Integer getVideoLanguageListAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.VIDEOLANGUAGELIST);
    }

   /**
    * Get Video languagesin this file, full names, separated by /.
    * 
    * @return Video languagesin this file, full names, separated by /.
    */
    @Nullable
    public final Long getVideoLanguageListAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.VIDEOLANGUAGELIST);
    }

   /**
    * Get Video languagesin this file, full names, separated by /.
    * 
    * @return Video languagesin this file, full names, separated by /.
    */
    @Nullable
    public final LocalDateTime getVideoLanguageListAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.VIDEOLANGUAGELIST);
    }

   /**
    * Get Video languagesin this file, full names, separated by /.
    * 
    * @return Video languagesin this file, full names, separated by /.
    */
    @Nullable
    public final LocalTime getVideoLanguageListAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.VIDEOLANGUAGELIST);
    }

   /**
    * Get Video languagesin this file, full names, separated by /.
    * 
    * @return Video languagesin this file, full names, separated by /.
    */
    @Nullable
    public final String getVideoLanguageListAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.VIDEOLANGUAGELIST);
    }

   /**
    * Get Video languagesin this file, full names, separated by /.
    * 
    * @return Video languagesin this file, full names, separated by /.
    */
    @Nullable
    public final Boolean getVideoLanguageListAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.VIDEOLANGUAGELIST);
    }

   /**
    * Get Video languagesin this file, full names, separated by /.
    * 
    * @return Video languagesin this file, full names, separated by /.
    */
    @Nullable
    public final BigInteger getVideoLanguageListAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.VIDEOLANGUAGELIST);
    }

   /**
    * Get Video languagesin this file, full names, separated by /.
    * 
    * @return Video languagesin this file, full names, separated by /.
    */
    @Nullable
    public final URL getVideoLanguageListAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.VIDEOLANGUAGELIST);
    }

   /**
    * Get Video languagesin this file, full names, separated by /.
    * 
    * @return Video languagesin this file, full names, separated by /.
    */
    @NonNull
    public final List<@NonNull String> getVideoLanguageListAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.VIDEOLANGUAGELIST);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Encryption_Format.
    * 
    * @return Encryption_Format.
    */
    @Nullable
    public final Integer getEncryptionFormatAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ENCRYPTIONFORMAT);
    }

   /**
    * Get Encryption_Format.
    * 
    * @return Encryption_Format.
    */
    @Nullable
    public final Long getEncryptionFormatAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ENCRYPTIONFORMAT);
    }

   /**
    * Get Encryption_Format.
    * 
    * @return Encryption_Format.
    */
    @Nullable
    public final LocalDateTime getEncryptionFormatAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ENCRYPTIONFORMAT);
    }

   /**
    * Get Encryption_Format.
    * 
    * @return Encryption_Format.
    */
    @Nullable
    public final LocalTime getEncryptionFormatAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ENCRYPTIONFORMAT);
    }

   /**
    * Get Encryption_Format.
    * 
    * @return Encryption_Format.
    */
    @Nullable
    public final String getEncryptionFormatAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ENCRYPTIONFORMAT);
    }

   /**
    * Get Encryption_Format.
    * 
    * @return Encryption_Format.
    */
    @Nullable
    public final Boolean getEncryptionFormatAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ENCRYPTIONFORMAT);
    }

   /**
    * Get Encryption_Format.
    * 
    * @return Encryption_Format.
    */
    @Nullable
    public final BigInteger getEncryptionFormatAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ENCRYPTIONFORMAT);
    }

   /**
    * Get Encryption_Format.
    * 
    * @return Encryption_Format.
    */
    @Nullable
    public final URL getEncryptionFormatAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ENCRYPTIONFORMAT);
    }

   /**
    * Get Encryption_Format.
    * 
    * @return Encryption_Format.
    */
    @NonNull
    public final List<@NonNull String> getEncryptionFormatAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ENCRYPTIONFORMAT);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Original name of album, serie....
    * 
    * @return Original name of album, serie....
    */
    @Nullable
    public final Integer getOriginalAlbumAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ORIGINALALBUM);
    }

   /**
    * Get Original name of album, serie....
    * 
    * @return Original name of album, serie....
    */
    @Nullable
    public final Long getOriginalAlbumAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ORIGINALALBUM);
    }

   /**
    * Get Original name of album, serie....
    * 
    * @return Original name of album, serie....
    */
    @Nullable
    public final LocalDateTime getOriginalAlbumAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ORIGINALALBUM);
    }

   /**
    * Get Original name of album, serie....
    * 
    * @return Original name of album, serie....
    */
    @Nullable
    public final LocalTime getOriginalAlbumAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ORIGINALALBUM);
    }

   /**
    * Get Original name of album, serie....
    * 
    * @return Original name of album, serie....
    */
    @Nullable
    public final String getOriginalAlbumAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ORIGINALALBUM);
    }

   /**
    * Get Original name of album, serie....
    * 
    * @return Original name of album, serie....
    */
    @Nullable
    public final Boolean getOriginalAlbumAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ORIGINALALBUM);
    }

   /**
    * Get Original name of album, serie....
    * 
    * @return Original name of album, serie....
    */
    @Nullable
    public final BigInteger getOriginalAlbumAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ORIGINALALBUM);
    }

   /**
    * Get Original name of album, serie....
    * 
    * @return Original name of album, serie....
    */
    @Nullable
    public final URL getOriginalAlbumAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ORIGINALALBUM);
    }

   /**
    * Get Original name of album, serie....
    * 
    * @return Original name of album, serie....
    */
    @NonNull
    public final List<@NonNull String> getOriginalAlbumAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ORIGINALALBUM);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Original form of the material, e.g. slide, paper, map.
    * 
    * @return Original form of the material, e.g. slide, paper, map.
    */
    @Nullable
    public final Integer getOriginalSourceFormAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ORIGINALSOURCEFORM);
    }

   /**
    * Get Original form of the material, e.g. slide, paper, map.
    * 
    * @return Original form of the material, e.g. slide, paper, map.
    */
    @Nullable
    public final Long getOriginalSourceFormAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ORIGINALSOURCEFORM);
    }

   /**
    * Get Original form of the material, e.g. slide, paper, map.
    * 
    * @return Original form of the material, e.g. slide, paper, map.
    */
    @Nullable
    public final LocalDateTime getOriginalSourceFormAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ORIGINALSOURCEFORM);
    }

   /**
    * Get Original form of the material, e.g. slide, paper, map.
    * 
    * @return Original form of the material, e.g. slide, paper, map.
    */
    @Nullable
    public final LocalTime getOriginalSourceFormAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ORIGINALSOURCEFORM);
    }

   /**
    * Get Original form of the material, e.g. slide, paper, map.
    * 
    * @return Original form of the material, e.g. slide, paper, map.
    */
    @Nullable
    public final String getOriginalSourceFormAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ORIGINALSOURCEFORM);
    }

   /**
    * Get Original form of the material, e.g. slide, paper, map.
    * 
    * @return Original form of the material, e.g. slide, paper, map.
    */
    @Nullable
    public final Boolean getOriginalSourceFormAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ORIGINALSOURCEFORM);
    }

   /**
    * Get Original form of the material, e.g. slide, paper, map.
    * 
    * @return Original form of the material, e.g. slide, paper, map.
    */
    @Nullable
    public final BigInteger getOriginalSourceFormAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ORIGINALSOURCEFORM);
    }

   /**
    * Get Original form of the material, e.g. slide, paper, map.
    * 
    * @return Original form of the material, e.g. slide, paper, map.
    */
    @Nullable
    public final URL getOriginalSourceFormAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ORIGINALSOURCEFORM);
    }

   /**
    * Get Original form of the material, e.g. slide, paper, map.
    * 
    * @return Original form of the material, e.g. slide, paper, map.
    */
    @NonNull
    public final List<@NonNull String> getOriginalSourceFormAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ORIGINALSOURCEFORM);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final Integer getDelaySettingsAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.DELAYSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final Long getDelaySettingsAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.DELAYSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final LocalDateTime getDelaySettingsAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.DELAYSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final LocalTime getDelaySettingsAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.DELAYSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final String getDelaySettingsAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.DELAYSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final Boolean getDelaySettingsAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.DELAYSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final BigInteger getDelaySettingsAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.DELAYSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @Nullable
    public final URL getDelaySettingsAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.DELAYSETTINGS);
    }

   /**
    * Get Delay settings (in case of timecode for example).
    * 
    * @return Delay settings (in case of timecode for example).
    */
    @NonNull
    public final List<@NonNull String> getDelaySettingsAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.DELAYSETTINGS);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get TimeZone.
    * 
    * @return TimeZone.
    */
    @Nullable
    public final Integer getTimeZoneAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.TIMEZONE);
    }

   /**
    * Get TimeZone.
    * 
    * @return TimeZone.
    */
    @Nullable
    public final Long getTimeZoneAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.TIMEZONE);
    }

   /**
    * Get TimeZone.
    * 
    * @return TimeZone.
    */
    @Nullable
    public final LocalDateTime getTimeZoneAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.TIMEZONE);
    }

   /**
    * Get TimeZone.
    * 
    * @return TimeZone.
    */
    @Nullable
    public final LocalTime getTimeZoneAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.TIMEZONE);
    }

   /**
    * Get TimeZone.
    * 
    * @return TimeZone.
    */
    @Nullable
    public final String getTimeZoneAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.TIMEZONE);
    }

   /**
    * Get TimeZone.
    * 
    * @return TimeZone.
    */
    @Nullable
    public final Boolean getTimeZoneAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.TIMEZONE);
    }

   /**
    * Get TimeZone.
    * 
    * @return TimeZone.
    */
    @Nullable
    public final BigInteger getTimeZoneAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.TIMEZONE);
    }

   /**
    * Get TimeZone.
    * 
    * @return TimeZone.
    */
    @Nullable
    public final URL getTimeZoneAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.TIMEZONE);
    }

   /**
    * Get TimeZone.
    * 
    * @return TimeZone.
    */
    @NonNull
    public final List<@NonNull String> getTimeZoneAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.TIMEZONE);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Image Codecs in this file, separated by /.
    * 
    * @return Image Codecs in this file, separated by /.
    */
    @Nullable
    public final Integer getImageFormatListAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.IMAGEFORMATLIST);
    }

   /**
    * Get Image Codecs in this file, separated by /.
    * 
    * @return Image Codecs in this file, separated by /.
    */
    @Nullable
    public final Long getImageFormatListAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.IMAGEFORMATLIST);
    }

   /**
    * Get Image Codecs in this file, separated by /.
    * 
    * @return Image Codecs in this file, separated by /.
    */
    @Nullable
    public final LocalDateTime getImageFormatListAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.IMAGEFORMATLIST);
    }

   /**
    * Get Image Codecs in this file, separated by /.
    * 
    * @return Image Codecs in this file, separated by /.
    */
    @Nullable
    public final LocalTime getImageFormatListAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.IMAGEFORMATLIST);
    }

   /**
    * Get Image Codecs in this file, separated by /.
    * 
    * @return Image Codecs in this file, separated by /.
    */
    @Nullable
    public final String getImageFormatListAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.IMAGEFORMATLIST);
    }

   /**
    * Get Image Codecs in this file, separated by /.
    * 
    * @return Image Codecs in this file, separated by /.
    */
    @Nullable
    public final Boolean getImageFormatListAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.IMAGEFORMATLIST);
    }

   /**
    * Get Image Codecs in this file, separated by /.
    * 
    * @return Image Codecs in this file, separated by /.
    */
    @Nullable
    public final BigInteger getImageFormatListAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.IMAGEFORMATLIST);
    }

   /**
    * Get Image Codecs in this file, separated by /.
    * 
    * @return Image Codecs in this file, separated by /.
    */
    @Nullable
    public final URL getImageFormatListAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.IMAGEFORMATLIST);
    }

   /**
    * Get Image Codecs in this file, separated by /.
    * 
    * @return Image Codecs in this file, separated by /.
    */
    @NonNull
    public final List<@NonNull String> getImageFormatListAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.IMAGEFORMATLIST);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Number of menu streams.
    * 
    * @return Number of menu streams.
    */
    @Nullable
    public final Integer getMenuCountAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.MENUCOUNT);
    }

   /**
    * Get Number of menu streams.
    * 
    * @return Number of menu streams.
    */
    @Nullable
    public final Long getMenuCountAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.MENUCOUNT);
    }

   /**
    * Get Number of menu streams.
    * 
    * @return Number of menu streams.
    */
    @Nullable
    public final LocalDateTime getMenuCountAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.MENUCOUNT);
    }

   /**
    * Get Number of menu streams.
    * 
    * @return Number of menu streams.
    */
    @Nullable
    public final LocalTime getMenuCountAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.MENUCOUNT);
    }

   /**
    * Get Number of menu streams.
    * 
    * @return Number of menu streams.
    */
    @Nullable
    public final String getMenuCountAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.MENUCOUNT);
    }

   /**
    * Get Number of menu streams.
    * 
    * @return Number of menu streams.
    */
    @Nullable
    public final Boolean getMenuCountAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.MENUCOUNT);
    }

   /**
    * Get Number of menu streams.
    * 
    * @return Number of menu streams.
    */
    @Nullable
    public final BigInteger getMenuCountAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.MENUCOUNT);
    }

   /**
    * Get Number of menu streams.
    * 
    * @return Number of menu streams.
    */
    @Nullable
    public final URL getMenuCountAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.MENUCOUNT);
    }

   /**
    * Get Number of menu streams.
    * 
    * @return Number of menu streams.
    */
    @NonNull
    public final List<@NonNull String> getMenuCountAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.MENUCOUNT);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Image Codecs in this file with popular name (hint), separated by /.
    * 
    * @return Image Codecs in this file with popular name (hint), separated by /.
    */
    @Nullable
    public final Integer getImageFormatWithHintListAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.IMAGEFORMATWITHHINTLIST);
    }

   /**
    * Get Image Codecs in this file with popular name (hint), separated by /.
    * 
    * @return Image Codecs in this file with popular name (hint), separated by /.
    */
    @Nullable
    public final Long getImageFormatWithHintListAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.IMAGEFORMATWITHHINTLIST);
    }

   /**
    * Get Image Codecs in this file with popular name (hint), separated by /.
    * 
    * @return Image Codecs in this file with popular name (hint), separated by /.
    */
    @Nullable
    public final LocalDateTime getImageFormatWithHintListAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.IMAGEFORMATWITHHINTLIST);
    }

   /**
    * Get Image Codecs in this file with popular name (hint), separated by /.
    * 
    * @return Image Codecs in this file with popular name (hint), separated by /.
    */
    @Nullable
    public final LocalTime getImageFormatWithHintListAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.IMAGEFORMATWITHHINTLIST);
    }

   /**
    * Get Image Codecs in this file with popular name (hint), separated by /.
    * 
    * @return Image Codecs in this file with popular name (hint), separated by /.
    */
    @Nullable
    public final String getImageFormatWithHintListAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.IMAGEFORMATWITHHINTLIST);
    }

   /**
    * Get Image Codecs in this file with popular name (hint), separated by /.
    * 
    * @return Image Codecs in this file with popular name (hint), separated by /.
    */
    @Nullable
    public final Boolean getImageFormatWithHintListAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.IMAGEFORMATWITHHINTLIST);
    }

   /**
    * Get Image Codecs in this file with popular name (hint), separated by /.
    * 
    * @return Image Codecs in this file with popular name (hint), separated by /.
    */
    @Nullable
    public final BigInteger getImageFormatWithHintListAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.IMAGEFORMATWITHHINTLIST);
    }

   /**
    * Get Image Codecs in this file with popular name (hint), separated by /.
    * 
    * @return Image Codecs in this file with popular name (hint), separated by /.
    */
    @Nullable
    public final URL getImageFormatWithHintListAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.IMAGEFORMATWITHHINTLIST);
    }

   /**
    * Get Image Codecs in this file with popular name (hint), separated by /.
    * 
    * @return Image Codecs in this file with popular name (hint), separated by /.
    */
    @NonNull
    public final List<@NonNull String> getImageFormatWithHintListAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.IMAGEFORMATWITHHINTLIST);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Name of the part. e.g. CD1, CD2.
    * 
    * @return Name of the part. e.g. CD1, CD2.
    */
    @Nullable
    public final Integer getPartAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.PART);
    }

   /**
    * Get Name of the part. e.g. CD1, CD2.
    * 
    * @return Name of the part. e.g. CD1, CD2.
    */
    @Nullable
    public final Long getPartAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.PART);
    }

   /**
    * Get Name of the part. e.g. CD1, CD2.
    * 
    * @return Name of the part. e.g. CD1, CD2.
    */
    @Nullable
    public final LocalDateTime getPartAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.PART);
    }

   /**
    * Get Name of the part. e.g. CD1, CD2.
    * 
    * @return Name of the part. e.g. CD1, CD2.
    */
    @Nullable
    public final LocalTime getPartAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.PART);
    }

   /**
    * Get Name of the part. e.g. CD1, CD2.
    * 
    * @return Name of the part. e.g. CD1, CD2.
    */
    @Nullable
    public final String getPartAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.PART);
    }

   /**
    * Get Name of the part. e.g. CD1, CD2.
    * 
    * @return Name of the part. e.g. CD1, CD2.
    */
    @Nullable
    public final Boolean getPartAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.PART);
    }

   /**
    * Get Name of the part. e.g. CD1, CD2.
    * 
    * @return Name of the part. e.g. CD1, CD2.
    */
    @Nullable
    public final BigInteger getPartAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.PART);
    }

   /**
    * Get Name of the part. e.g. CD1, CD2.
    * 
    * @return Name of the part. e.g. CD1, CD2.
    */
    @Nullable
    public final URL getPartAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.PART);
    }

   /**
    * Get Name of the part. e.g. CD1, CD2.
    * 
    * @return Name of the part. e.g. CD1, CD2.
    */
    @NonNull
    public final List<@NonNull String> getPartAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.PART);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Bit rate mode of all streams (Variable, Constant).
    * 
    * @return Bit rate mode of all streams (Variable, Constant).
    */
    @Nullable
    public final Integer getOverallBitRateModeStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.OVERALLBITRATEMODESTRING);
    }

   /**
    * Get Bit rate mode of all streams (Variable, Constant).
    * 
    * @return Bit rate mode of all streams (Variable, Constant).
    */
    @Nullable
    public final Long getOverallBitRateModeStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.OVERALLBITRATEMODESTRING);
    }

   /**
    * Get Bit rate mode of all streams (Variable, Constant).
    * 
    * @return Bit rate mode of all streams (Variable, Constant).
    */
    @Nullable
    public final LocalDateTime getOverallBitRateModeStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.OVERALLBITRATEMODESTRING);
    }

   /**
    * Get Bit rate mode of all streams (Variable, Constant).
    * 
    * @return Bit rate mode of all streams (Variable, Constant).
    */
    @Nullable
    public final LocalTime getOverallBitRateModeStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.OVERALLBITRATEMODESTRING);
    }

   /**
    * Get Bit rate mode of all streams (Variable, Constant).
    * 
    * @return Bit rate mode of all streams (Variable, Constant).
    */
    @Nullable
    public final String getOverallBitRateModeStringAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.OVERALLBITRATEMODESTRING);
    }

   /**
    * Get Bit rate mode of all streams (Variable, Constant).
    * 
    * @return Bit rate mode of all streams (Variable, Constant).
    */
    @Nullable
    public final Boolean getOverallBitRateModeStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.OVERALLBITRATEMODESTRING);
    }

   /**
    * Get Bit rate mode of all streams (Variable, Constant).
    * 
    * @return Bit rate mode of all streams (Variable, Constant).
    */
    @Nullable
    public final BigInteger getOverallBitRateModeStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.OVERALLBITRATEMODESTRING);
    }

   /**
    * Get Bit rate mode of all streams (Variable, Constant).
    * 
    * @return Bit rate mode of all streams (Variable, Constant).
    */
    @Nullable
    public final URL getOverallBitRateModeStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.OVERALLBITRATEMODESTRING);
    }

   /**
    * Get Bit rate mode of all streams (Variable, Constant).
    * 
    * @return Bit rate mode of all streams (Variable, Constant).
    */
    @NonNull
    public final List<@NonNull String> getOverallBitRateModeStringAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.OVERALLBITRATEMODESTRING);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Place of the part e.g. 2 of 3.
    * 
    * @return Place of the part e.g. 2 of 3.
    */
    @Nullable
    public final Integer getPartPositionTotalAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.PARTPOSITIONTOTAL);
    }

   /**
    * Get Place of the part e.g. 2 of 3.
    * 
    * @return Place of the part e.g. 2 of 3.
    */
    @Nullable
    public final Long getPartPositionTotalAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.PARTPOSITIONTOTAL);
    }

   /**
    * Get Place of the part e.g. 2 of 3.
    * 
    * @return Place of the part e.g. 2 of 3.
    */
    @Nullable
    public final LocalDateTime getPartPositionTotalAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.PARTPOSITIONTOTAL);
    }

   /**
    * Get Place of the part e.g. 2 of 3.
    * 
    * @return Place of the part e.g. 2 of 3.
    */
    @Nullable
    public final LocalTime getPartPositionTotalAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.PARTPOSITIONTOTAL);
    }

   /**
    * Get Place of the part e.g. 2 of 3.
    * 
    * @return Place of the part e.g. 2 of 3.
    */
    @Nullable
    public final String getPartPositionTotalAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.PARTPOSITIONTOTAL);
    }

   /**
    * Get Place of the part e.g. 2 of 3.
    * 
    * @return Place of the part e.g. 2 of 3.
    */
    @Nullable
    public final Boolean getPartPositionTotalAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.PARTPOSITIONTOTAL);
    }

   /**
    * Get Place of the part e.g. 2 of 3.
    * 
    * @return Place of the part e.g. 2 of 3.
    */
    @Nullable
    public final BigInteger getPartPositionTotalAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.PARTPOSITIONTOTAL);
    }

   /**
    * Get Place of the part e.g. 2 of 3.
    * 
    * @return Place of the part e.g. 2 of 3.
    */
    @Nullable
    public final URL getPartPositionTotalAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.PARTPOSITIONTOTAL);
    }

   /**
    * Get Place of the part e.g. 2 of 3.
    * 
    * @return Place of the part e.g. 2 of 3.
    */
    @NonNull
    public final List<@NonNull String> getPartPositionTotalAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.PARTPOSITIONTOTAL);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Original name of the movie.
    * 
    * @return Original name of the movie.
    */
    @Nullable
    public final Integer getOriginalMovieAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ORIGINALMOVIE);
    }

   /**
    * Get Original name of the movie.
    * 
    * @return Original name of the movie.
    */
    @Nullable
    public final Long getOriginalMovieAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ORIGINALMOVIE);
    }

   /**
    * Get Original name of the movie.
    * 
    * @return Original name of the movie.
    */
    @Nullable
    public final LocalDateTime getOriginalMovieAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ORIGINALMOVIE);
    }

   /**
    * Get Original name of the movie.
    * 
    * @return Original name of the movie.
    */
    @Nullable
    public final LocalTime getOriginalMovieAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ORIGINALMOVIE);
    }

   /**
    * Get Original name of the movie.
    * 
    * @return Original name of the movie.
    */
    @Nullable
    public final String getOriginalMovieAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ORIGINALMOVIE);
    }

   /**
    * Get Original name of the movie.
    * 
    * @return Original name of the movie.
    */
    @Nullable
    public final Boolean getOriginalMovieAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ORIGINALMOVIE);
    }

   /**
    * Get Original name of the movie.
    * 
    * @return Original name of the movie.
    */
    @Nullable
    public final BigInteger getOriginalMovieAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ORIGINALMOVIE);
    }

   /**
    * Get Original name of the movie.
    * 
    * @return Original name of the movie.
    */
    @Nullable
    public final URL getOriginalMovieAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ORIGINALMOVIE);
    }

   /**
    * Get Original name of the movie.
    * 
    * @return Original name of the movie.
    */
    @NonNull
    public final List<@NonNull String> getOriginalMovieAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ORIGINALMOVIE);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get The maximum absolute peak value of the item.
    * 
    * @return The maximum absolute peak value of the item.
    */
    @Nullable
    public final Integer getAlbumReplayGainPeakAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ALBUMREPLAYGAINPEAK);
    }

   /**
    * Get The maximum absolute peak value of the item.
    * 
    * @return The maximum absolute peak value of the item.
    */
    @Nullable
    public final Long getAlbumReplayGainPeakAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ALBUMREPLAYGAINPEAK);
    }

   /**
    * Get The maximum absolute peak value of the item.
    * 
    * @return The maximum absolute peak value of the item.
    */
    @Nullable
    public final LocalDateTime getAlbumReplayGainPeakAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ALBUMREPLAYGAINPEAK);
    }

   /**
    * Get The maximum absolute peak value of the item.
    * 
    * @return The maximum absolute peak value of the item.
    */
    @Nullable
    public final LocalTime getAlbumReplayGainPeakAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ALBUMREPLAYGAINPEAK);
    }

   /**
    * Get The maximum absolute peak value of the item.
    * 
    * @return The maximum absolute peak value of the item.
    */
    @Nullable
    public final String getAlbumReplayGainPeakAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ALBUMREPLAYGAINPEAK);
    }

   /**
    * Get The maximum absolute peak value of the item.
    * 
    * @return The maximum absolute peak value of the item.
    */
    @Nullable
    public final Boolean getAlbumReplayGainPeakAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ALBUMREPLAYGAINPEAK);
    }

   /**
    * Get The maximum absolute peak value of the item.
    * 
    * @return The maximum absolute peak value of the item.
    */
    @Nullable
    public final BigInteger getAlbumReplayGainPeakAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ALBUMREPLAYGAINPEAK);
    }

   /**
    * Get The maximum absolute peak value of the item.
    * 
    * @return The maximum absolute peak value of the item.
    */
    @Nullable
    public final URL getAlbumReplayGainPeakAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ALBUMREPLAYGAINPEAK);
    }

   /**
    * Get The maximum absolute peak value of the item.
    * 
    * @return The maximum absolute peak value of the item.
    */
    @NonNull
    public final List<@NonNull String> getAlbumReplayGainPeakAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ALBUMREPLAYGAINPEAK);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get File size (with measure, 4 digit mini).
    * 
    * @return File size (with measure, 4 digit mini).
    */
    @Nullable
    public final Integer getFileSizeString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.FILESIZESTRING4);
    }

   /**
    * Get File size (with measure, 4 digit mini).
    * 
    * @return File size (with measure, 4 digit mini).
    */
    @Nullable
    public final Long getFileSizeString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.FILESIZESTRING4);
    }

   /**
    * Get File size (with measure, 4 digit mini).
    * 
    * @return File size (with measure, 4 digit mini).
    */
    @Nullable
    public final LocalDateTime getFileSizeString4AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.FILESIZESTRING4);
    }

   /**
    * Get File size (with measure, 4 digit mini).
    * 
    * @return File size (with measure, 4 digit mini).
    */
    @Nullable
    public final LocalTime getFileSizeString4AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.FILESIZESTRING4);
    }

   /**
    * Get File size (with measure, 4 digit mini).
    * 
    * @return File size (with measure, 4 digit mini).
    */
    @Nullable
    public final String getFileSizeString4AsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.FILESIZESTRING4);
    }

   /**
    * Get File size (with measure, 4 digit mini).
    * 
    * @return File size (with measure, 4 digit mini).
    */
    @Nullable
    public final Boolean getFileSizeString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.FILESIZESTRING4);
    }

   /**
    * Get File size (with measure, 4 digit mini).
    * 
    * @return File size (with measure, 4 digit mini).
    */
    @Nullable
    public final BigInteger getFileSizeString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.FILESIZESTRING4);
    }

   /**
    * Get File size (with measure, 4 digit mini).
    * 
    * @return File size (with measure, 4 digit mini).
    */
    @Nullable
    public final URL getFileSizeString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.FILESIZESTRING4);
    }

   /**
    * Get File size (with measure, 4 digit mini).
    * 
    * @return File size (with measure, 4 digit mini).
    */
    @NonNull
    public final List<@NonNull String> getFileSizeString4AsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.FILESIZESTRING4);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get File size (with measure, 3 digit mini).
    * 
    * @return File size (with measure, 3 digit mini).
    */
    @Nullable
    public final Integer getFileSizeString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.FILESIZESTRING3);
    }

   /**
    * Get File size (with measure, 3 digit mini).
    * 
    * @return File size (with measure, 3 digit mini).
    */
    @Nullable
    public final Long getFileSizeString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.FILESIZESTRING3);
    }

   /**
    * Get File size (with measure, 3 digit mini).
    * 
    * @return File size (with measure, 3 digit mini).
    */
    @Nullable
    public final LocalDateTime getFileSizeString3AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.FILESIZESTRING3);
    }

   /**
    * Get File size (with measure, 3 digit mini).
    * 
    * @return File size (with measure, 3 digit mini).
    */
    @Nullable
    public final LocalTime getFileSizeString3AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.FILESIZESTRING3);
    }

   /**
    * Get File size (with measure, 3 digit mini).
    * 
    * @return File size (with measure, 3 digit mini).
    */
    @Nullable
    public final String getFileSizeString3AsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.FILESIZESTRING3);
    }

   /**
    * Get File size (with measure, 3 digit mini).
    * 
    * @return File size (with measure, 3 digit mini).
    */
    @Nullable
    public final Boolean getFileSizeString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.FILESIZESTRING3);
    }

   /**
    * Get File size (with measure, 3 digit mini).
    * 
    * @return File size (with measure, 3 digit mini).
    */
    @Nullable
    public final BigInteger getFileSizeString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.FILESIZESTRING3);
    }

   /**
    * Get File size (with measure, 3 digit mini).
    * 
    * @return File size (with measure, 3 digit mini).
    */
    @Nullable
    public final URL getFileSizeString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.FILESIZESTRING3);
    }

   /**
    * Get File size (with measure, 3 digit mini).
    * 
    * @return File size (with measure, 3 digit mini).
    */
    @NonNull
    public final List<@NonNull String> getFileSizeString3AsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.FILESIZESTRING3);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Name of the artist(s), that interpreted, remixed, or otherwise modified the item..
    * 
    * @return Name of the artist(s), that interpreted, remixed, or otherwise modified the item..
    */
    @Nullable
    public final Integer getRemixedByAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.REMIXEDBY);
    }

   /**
    * Get Name of the artist(s), that interpreted, remixed, or otherwise modified the item..
    * 
    * @return Name of the artist(s), that interpreted, remixed, or otherwise modified the item..
    */
    @Nullable
    public final Long getRemixedByAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.REMIXEDBY);
    }

   /**
    * Get Name of the artist(s), that interpreted, remixed, or otherwise modified the item..
    * 
    * @return Name of the artist(s), that interpreted, remixed, or otherwise modified the item..
    */
    @Nullable
    public final LocalDateTime getRemixedByAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.REMIXEDBY);
    }

   /**
    * Get Name of the artist(s), that interpreted, remixed, or otherwise modified the item..
    * 
    * @return Name of the artist(s), that interpreted, remixed, or otherwise modified the item..
    */
    @Nullable
    public final LocalTime getRemixedByAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.REMIXEDBY);
    }

   /**
    * Get Name of the artist(s), that interpreted, remixed, or otherwise modified the item..
    * 
    * @return Name of the artist(s), that interpreted, remixed, or otherwise modified the item..
    */
    @Nullable
    public final String getRemixedByAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.REMIXEDBY);
    }

   /**
    * Get Name of the artist(s), that interpreted, remixed, or otherwise modified the item..
    * 
    * @return Name of the artist(s), that interpreted, remixed, or otherwise modified the item..
    */
    @Nullable
    public final Boolean getRemixedByAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.REMIXEDBY);
    }

   /**
    * Get Name of the artist(s), that interpreted, remixed, or otherwise modified the item..
    * 
    * @return Name of the artist(s), that interpreted, remixed, or otherwise modified the item..
    */
    @Nullable
    public final BigInteger getRemixedByAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.REMIXEDBY);
    }

   /**
    * Get Name of the artist(s), that interpreted, remixed, or otherwise modified the item..
    * 
    * @return Name of the artist(s), that interpreted, remixed, or otherwise modified the item..
    */
    @Nullable
    public final URL getRemixedByAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.REMIXEDBY);
    }

   /**
    * Get Name of the artist(s), that interpreted, remixed, or otherwise modified the item..
    * 
    * @return Name of the artist(s), that interpreted, remixed, or otherwise modified the item..
    */
    @NonNull
    public final List<@NonNull String> getRemixedByAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.REMIXEDBY);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Name of the subtrack..
    * 
    * @return Name of the subtrack..
    */
    @Nullable
    public final Integer getSubTrackAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.SUBTRACK);
    }

   /**
    * Get Name of the subtrack..
    * 
    * @return Name of the subtrack..
    */
    @Nullable
    public final Long getSubTrackAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.SUBTRACK);
    }

   /**
    * Get Name of the subtrack..
    * 
    * @return Name of the subtrack..
    */
    @Nullable
    public final LocalDateTime getSubTrackAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.SUBTRACK);
    }

   /**
    * Get Name of the subtrack..
    * 
    * @return Name of the subtrack..
    */
    @Nullable
    public final LocalTime getSubTrackAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.SUBTRACK);
    }

   /**
    * Get Name of the subtrack..
    * 
    * @return Name of the subtrack..
    */
    @Nullable
    public final String getSubTrackAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.SUBTRACK);
    }

   /**
    * Get Name of the subtrack..
    * 
    * @return Name of the subtrack..
    */
    @Nullable
    public final Boolean getSubTrackAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.SUBTRACK);
    }

   /**
    * Get Name of the subtrack..
    * 
    * @return Name of the subtrack..
    */
    @Nullable
    public final BigInteger getSubTrackAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.SUBTRACK);
    }

   /**
    * Get Name of the subtrack..
    * 
    * @return Name of the subtrack..
    */
    @Nullable
    public final URL getSubTrackAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.SUBTRACK);
    }

   /**
    * Get Name of the subtrack..
    * 
    * @return Name of the subtrack..
    */
    @NonNull
    public final List<@NonNull String> getSubTrackAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.SUBTRACK);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Package name i.e. technical flavor of the content.
    * 
    * @return Package name i.e. technical flavor of the content.
    */
    @Nullable
    public final Integer getPackageNameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.PACKAGENAME);
    }

   /**
    * Get Package name i.e. technical flavor of the content.
    * 
    * @return Package name i.e. technical flavor of the content.
    */
    @Nullable
    public final Long getPackageNameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.PACKAGENAME);
    }

   /**
    * Get Package name i.e. technical flavor of the content.
    * 
    * @return Package name i.e. technical flavor of the content.
    */
    @Nullable
    public final LocalDateTime getPackageNameAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.PACKAGENAME);
    }

   /**
    * Get Package name i.e. technical flavor of the content.
    * 
    * @return Package name i.e. technical flavor of the content.
    */
    @Nullable
    public final LocalTime getPackageNameAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.PACKAGENAME);
    }

   /**
    * Get Package name i.e. technical flavor of the content.
    * 
    * @return Package name i.e. technical flavor of the content.
    */
    @Nullable
    public final String getPackageNameAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.PACKAGENAME);
    }

   /**
    * Get Package name i.e. technical flavor of the content.
    * 
    * @return Package name i.e. technical flavor of the content.
    */
    @Nullable
    public final Boolean getPackageNameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.PACKAGENAME);
    }

   /**
    * Get Package name i.e. technical flavor of the content.
    * 
    * @return Package name i.e. technical flavor of the content.
    */
    @Nullable
    public final BigInteger getPackageNameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.PACKAGENAME);
    }

   /**
    * Get Package name i.e. technical flavor of the content.
    * 
    * @return Package name i.e. technical flavor of the content.
    */
    @Nullable
    public final URL getPackageNameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.PACKAGENAME);
    }

   /**
    * Get Package name i.e. technical flavor of the content.
    * 
    * @return Package name i.e. technical flavor of the content.
    */
    @NonNull
    public final List<@NonNull String> getPackageNameAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.PACKAGENAME);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Original medium of the material, e.g. vinyl, Audio-CD, Super8 or BetaMax.
    * 
    * @return Original medium of the material, e.g. vinyl, Audio-CD, Super8 or BetaMax.
    */
    @Nullable
    public final Integer getOriginalSourceMediumAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ORIGINALSOURCEMEDIUM);
    }

   /**
    * Get Original medium of the material, e.g. vinyl, Audio-CD, Super8 or BetaMax.
    * 
    * @return Original medium of the material, e.g. vinyl, Audio-CD, Super8 or BetaMax.
    */
    @Nullable
    public final Long getOriginalSourceMediumAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ORIGINALSOURCEMEDIUM);
    }

   /**
    * Get Original medium of the material, e.g. vinyl, Audio-CD, Super8 or BetaMax.
    * 
    * @return Original medium of the material, e.g. vinyl, Audio-CD, Super8 or BetaMax.
    */
    @Nullable
    public final LocalDateTime getOriginalSourceMediumAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ORIGINALSOURCEMEDIUM);
    }

   /**
    * Get Original medium of the material, e.g. vinyl, Audio-CD, Super8 or BetaMax.
    * 
    * @return Original medium of the material, e.g. vinyl, Audio-CD, Super8 or BetaMax.
    */
    @Nullable
    public final LocalTime getOriginalSourceMediumAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ORIGINALSOURCEMEDIUM);
    }

   /**
    * Get Original medium of the material, e.g. vinyl, Audio-CD, Super8 or BetaMax.
    * 
    * @return Original medium of the material, e.g. vinyl, Audio-CD, Super8 or BetaMax.
    */
    @Nullable
    public final String getOriginalSourceMediumAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ORIGINALSOURCEMEDIUM);
    }

   /**
    * Get Original medium of the material, e.g. vinyl, Audio-CD, Super8 or BetaMax.
    * 
    * @return Original medium of the material, e.g. vinyl, Audio-CD, Super8 or BetaMax.
    */
    @Nullable
    public final Boolean getOriginalSourceMediumAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ORIGINALSOURCEMEDIUM);
    }

   /**
    * Get Original medium of the material, e.g. vinyl, Audio-CD, Super8 or BetaMax.
    * 
    * @return Original medium of the material, e.g. vinyl, Audio-CD, Super8 or BetaMax.
    */
    @Nullable
    public final BigInteger getOriginalSourceMediumAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ORIGINALSOURCEMEDIUM);
    }

   /**
    * Get Original medium of the material, e.g. vinyl, Audio-CD, Super8 or BetaMax.
    * 
    * @return Original medium of the material, e.g. vinyl, Audio-CD, Super8 or BetaMax.
    */
    @Nullable
    public final URL getOriginalSourceMediumAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ORIGINALSOURCEMEDIUM);
    }

   /**
    * Get Original medium of the material, e.g. vinyl, Audio-CD, Super8 or BetaMax.
    * 
    * @return Original medium of the material, e.g. vinyl, Audio-CD, Super8 or BetaMax.
    */
    @NonNull
    public final List<@NonNull String> getOriginalSourceMediumAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ORIGINALSOURCEMEDIUM);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get File name only.
    * 
    * @return File name only.
    */
    @Nullable
    public final Integer getFileNameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.FILENAME);
    }

   /**
    * Get File name only.
    * 
    * @return File name only.
    */
    @Nullable
    public final Long getFileNameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.FILENAME);
    }

   /**
    * Get File name only.
    * 
    * @return File name only.
    */
    @Nullable
    public final LocalDateTime getFileNameAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.FILENAME);
    }

   /**
    * Get File name only.
    * 
    * @return File name only.
    */
    @Nullable
    public final LocalTime getFileNameAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.FILENAME);
    }

   /**
    * Get File name only.
    * 
    * @return File name only.
    */
    @Nullable
    public final String getFileNameAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.FILENAME);
    }

   /**
    * Get File name only.
    * 
    * @return File name only.
    */
    @Nullable
    public final Boolean getFileNameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.FILENAME);
    }

   /**
    * Get File name only.
    * 
    * @return File name only.
    */
    @Nullable
    public final BigInteger getFileNameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.FILENAME);
    }

   /**
    * Get File name only.
    * 
    * @return File name only.
    */
    @Nullable
    public final URL getFileNameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.FILENAME);
    }

   /**
    * Get File name only.
    * 
    * @return File name only.
    */
    @NonNull
    public final List<@NonNull String> getFileNameAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.FILENAME);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Comic/Position_Total.
    * 
    * @return Comic/Position_Total.
    */
    @Nullable
    public final Integer getComicPositionTotalAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.COMICPOSITIONTOTAL);
    }

   /**
    * Get Comic/Position_Total.
    * 
    * @return Comic/Position_Total.
    */
    @Nullable
    public final Long getComicPositionTotalAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.COMICPOSITIONTOTAL);
    }

   /**
    * Get Comic/Position_Total.
    * 
    * @return Comic/Position_Total.
    */
    @Nullable
    public final LocalDateTime getComicPositionTotalAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.COMICPOSITIONTOTAL);
    }

   /**
    * Get Comic/Position_Total.
    * 
    * @return Comic/Position_Total.
    */
    @Nullable
    public final LocalTime getComicPositionTotalAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.COMICPOSITIONTOTAL);
    }

   /**
    * Get Comic/Position_Total.
    * 
    * @return Comic/Position_Total.
    */
    @Nullable
    public final String getComicPositionTotalAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.COMICPOSITIONTOTAL);
    }

   /**
    * Get Comic/Position_Total.
    * 
    * @return Comic/Position_Total.
    */
    @Nullable
    public final Boolean getComicPositionTotalAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.COMICPOSITIONTOTAL);
    }

   /**
    * Get Comic/Position_Total.
    * 
    * @return Comic/Position_Total.
    */
    @Nullable
    public final BigInteger getComicPositionTotalAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.COMICPOSITIONTOTAL);
    }

   /**
    * Get Comic/Position_Total.
    * 
    * @return Comic/Position_Total.
    */
    @Nullable
    public final URL getComicPositionTotalAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.COMICPOSITIONTOTAL);
    }

   /**
    * Get Comic/Position_Total.
    * 
    * @return Comic/Position_Total.
    */
    @NonNull
    public final List<@NonNull String> getComicPositionTotalAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.COMICPOSITIONTOTAL);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Main music-artist for a movie.
    * 
    * @return Main music-artist for a movie.
    */
    @Nullable
    public final Integer getMusicByAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.MUSICBY);
    }

   /**
    * Get Main music-artist for a movie.
    * 
    * @return Main music-artist for a movie.
    */
    @Nullable
    public final Long getMusicByAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.MUSICBY);
    }

   /**
    * Get Main music-artist for a movie.
    * 
    * @return Main music-artist for a movie.
    */
    @Nullable
    public final LocalDateTime getMusicByAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.MUSICBY);
    }

   /**
    * Get Main music-artist for a movie.
    * 
    * @return Main music-artist for a movie.
    */
    @Nullable
    public final LocalTime getMusicByAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.MUSICBY);
    }

   /**
    * Get Main music-artist for a movie.
    * 
    * @return Main music-artist for a movie.
    */
    @Nullable
    public final String getMusicByAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.MUSICBY);
    }

   /**
    * Get Main music-artist for a movie.
    * 
    * @return Main music-artist for a movie.
    */
    @Nullable
    public final Boolean getMusicByAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.MUSICBY);
    }

   /**
    * Get Main music-artist for a movie.
    * 
    * @return Main music-artist for a movie.
    */
    @Nullable
    public final BigInteger getMusicByAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.MUSICBY);
    }

   /**
    * Get Main music-artist for a movie.
    * 
    * @return Main music-artist for a movie.
    */
    @Nullable
    public final URL getMusicByAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.MUSICBY);
    }

   /**
    * Get Main music-artist for a movie.
    * 
    * @return Main music-artist for a movie.
    */
    @NonNull
    public final List<@NonNull String> getMusicByAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.MUSICBY);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get The time/date/year that the composition of the music/script began..
    * 
    * @return The time/date/year that the composition of the music/script began..
    */
    @Nullable
    public final Integer getWrittenDateAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.WRITTENDATE);
    }

   /**
    * Get The time/date/year that the composition of the music/script began..
    * 
    * @return The time/date/year that the composition of the music/script began..
    */
    @Nullable
    public final Long getWrittenDateAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.WRITTENDATE);
    }

   /**
    * Get The time/date/year that the composition of the music/script began..
    * 
    * @return The time/date/year that the composition of the music/script began..
    */
    @Nullable
    public final LocalDateTime getWrittenDateAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.WRITTENDATE);
    }

   /**
    * Get The time/date/year that the composition of the music/script began..
    * 
    * @return The time/date/year that the composition of the music/script began..
    */
    @Nullable
    public final LocalTime getWrittenDateAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.WRITTENDATE);
    }

   /**
    * Get The time/date/year that the composition of the music/script began..
    * 
    * @return The time/date/year that the composition of the music/script began..
    */
    @Nullable
    public final String getWrittenDateAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.WRITTENDATE);
    }

   /**
    * Get The time/date/year that the composition of the music/script began..
    * 
    * @return The time/date/year that the composition of the music/script began..
    */
    @Nullable
    public final Boolean getWrittenDateAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.WRITTENDATE);
    }

   /**
    * Get The time/date/year that the composition of the music/script began..
    * 
    * @return The time/date/year that the composition of the music/script began..
    */
    @Nullable
    public final BigInteger getWrittenDateAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.WRITTENDATE);
    }

   /**
    * Get The time/date/year that the composition of the music/script began..
    * 
    * @return The time/date/year that the composition of the music/script began..
    */
    @Nullable
    public final URL getWrittenDateAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.WRITTENDATE);
    }

   /**
    * Get The time/date/year that the composition of the music/script began..
    * 
    * @return The time/date/year that the composition of the music/script began..
    */
    @NonNull
    public final List<@NonNull String> getWrittenDateAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.WRITTENDATE);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get The time that the file was modified on the file system.
    * 
    * @return The time that the file was modified on the file system.
    */
    @Nullable
    public final Integer getFileModifiedDateAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.FILEMODIFIEDDATE);
    }

   /**
    * Get The time that the file was modified on the file system.
    * 
    * @return The time that the file was modified on the file system.
    */
    @Nullable
    public final Long getFileModifiedDateAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.FILEMODIFIEDDATE);
    }

   /**
    * Get The time that the file was modified on the file system.
    * 
    * @return The time that the file was modified on the file system.
    */
    @Nullable
    public final LocalDateTime getFileModifiedDateAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.FILEMODIFIEDDATE);
    }

   /**
    * Get The time that the file was modified on the file system.
    * 
    * @return The time that the file was modified on the file system.
    */
    @Nullable
    public final LocalTime getFileModifiedDateAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.FILEMODIFIEDDATE);
    }

   /**
    * Get The time that the file was modified on the file system.
    * 
    * @return The time that the file was modified on the file system.
    */
    @Nullable
    public final String getFileModifiedDateAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.FILEMODIFIEDDATE);
    }

   /**
    * Get The time that the file was modified on the file system.
    * 
    * @return The time that the file was modified on the file system.
    */
    @Nullable
    public final Boolean getFileModifiedDateAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.FILEMODIFIEDDATE);
    }

   /**
    * Get The time that the file was modified on the file system.
    * 
    * @return The time that the file was modified on the file system.
    */
    @Nullable
    public final BigInteger getFileModifiedDateAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.FILEMODIFIEDDATE);
    }

   /**
    * Get The time that the file was modified on the file system.
    * 
    * @return The time that the file was modified on the file system.
    */
    @Nullable
    public final URL getFileModifiedDateAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.FILEMODIFIEDDATE);
    }

   /**
    * Get The time that the file was modified on the file system.
    * 
    * @return The time that the file was modified on the file system.
    */
    @NonNull
    public final List<@NonNull String> getFileModifiedDateAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.FILEMODIFIEDDATE);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Version of encoding-software.
    * 
    * @return Version of encoding-software.
    */
    @Nullable
    public final Integer getEncodedLibraryVersionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ENCODEDLIBRARYVERSION);
    }

   /**
    * Get Version of encoding-software.
    * 
    * @return Version of encoding-software.
    */
    @Nullable
    public final Long getEncodedLibraryVersionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ENCODEDLIBRARYVERSION);
    }

   /**
    * Get Version of encoding-software.
    * 
    * @return Version of encoding-software.
    */
    @Nullable
    public final LocalDateTime getEncodedLibraryVersionAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ENCODEDLIBRARYVERSION);
    }

   /**
    * Get Version of encoding-software.
    * 
    * @return Version of encoding-software.
    */
    @Nullable
    public final LocalTime getEncodedLibraryVersionAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ENCODEDLIBRARYVERSION);
    }

   /**
    * Get Version of encoding-software.
    * 
    * @return Version of encoding-software.
    */
    @Nullable
    public final String getEncodedLibraryVersionAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ENCODEDLIBRARYVERSION);
    }

   /**
    * Get Version of encoding-software.
    * 
    * @return Version of encoding-software.
    */
    @Nullable
    public final Boolean getEncodedLibraryVersionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ENCODEDLIBRARYVERSION);
    }

   /**
    * Get Version of encoding-software.
    * 
    * @return Version of encoding-software.
    */
    @Nullable
    public final BigInteger getEncodedLibraryVersionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ENCODEDLIBRARYVERSION);
    }

   /**
    * Get Version of encoding-software.
    * 
    * @return Version of encoding-software.
    */
    @Nullable
    public final URL getEncodedLibraryVersionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ENCODEDLIBRARYVERSION);
    }

   /**
    * Get Version of encoding-software.
    * 
    * @return Version of encoding-software.
    */
    @NonNull
    public final List<@NonNull String> getEncodedLibraryVersionAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ENCODEDLIBRARYVERSION);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Info about this codec.
    * 
    * @return Info about this codec.
    */
    @Nullable
    public final Integer getCodecIDInfoAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.CODECIDINFO);
    }

   /**
    * Get Info about this codec.
    * 
    * @return Info about this codec.
    */
    @Nullable
    public final Long getCodecIDInfoAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.CODECIDINFO);
    }

   /**
    * Get Info about this codec.
    * 
    * @return Info about this codec.
    */
    @Nullable
    public final LocalDateTime getCodecIDInfoAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.CODECIDINFO);
    }

   /**
    * Get Info about this codec.
    * 
    * @return Info about this codec.
    */
    @Nullable
    public final LocalTime getCodecIDInfoAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.CODECIDINFO);
    }

   /**
    * Get Info about this codec.
    * 
    * @return Info about this codec.
    */
    @Nullable
    public final String getCodecIDInfoAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.CODECIDINFO);
    }

   /**
    * Get Info about this codec.
    * 
    * @return Info about this codec.
    */
    @Nullable
    public final Boolean getCodecIDInfoAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.CODECIDINFO);
    }

   /**
    * Get Info about this codec.
    * 
    * @return Info about this codec.
    */
    @Nullable
    public final BigInteger getCodecIDInfoAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.CODECIDINFO);
    }

   /**
    * Get Info about this codec.
    * 
    * @return Info about this codec.
    */
    @Nullable
    public final URL getCodecIDInfoAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.CODECIDINFO);
    }

   /**
    * Get Info about this codec.
    * 
    * @return Info about this codec.
    */
    @NonNull
    public final List<@NonNull String> getCodecIDInfoAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.CODECIDINFO);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Stream size in bytes.
    * 
    * @return Stream size in bytes.
    */
    @Nullable
    public final Integer getStreamSizeAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.STREAMSIZE);
    }

   /**
    * Get Stream size in bytes.
    * 
    * @return Stream size in bytes.
    */
    @Nullable
    public final Long getStreamSizeAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.STREAMSIZE);
    }

   /**
    * Get Stream size in bytes.
    * 
    * @return Stream size in bytes.
    */
    @Nullable
    public final LocalDateTime getStreamSizeAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.STREAMSIZE);
    }

   /**
    * Get Stream size in bytes.
    * 
    * @return Stream size in bytes.
    */
    @Nullable
    public final LocalTime getStreamSizeAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.STREAMSIZE);
    }

   /**
    * Get Stream size in bytes.
    * 
    * @return Stream size in bytes.
    */
    @Nullable
    public final String getStreamSizeAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.STREAMSIZE);
    }

   /**
    * Get Stream size in bytes.
    * 
    * @return Stream size in bytes.
    */
    @Nullable
    public final Boolean getStreamSizeAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.STREAMSIZE);
    }

   /**
    * Get Stream size in bytes.
    * 
    * @return Stream size in bytes.
    */
    @Nullable
    public final BigInteger getStreamSizeAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.STREAMSIZE);
    }

   /**
    * Get Stream size in bytes.
    * 
    * @return Stream size in bytes.
    */
    @Nullable
    public final URL getStreamSizeAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.STREAMSIZE);
    }

   /**
    * Get Stream size in bytes.
    * 
    * @return Stream size in bytes.
    */
    @NonNull
    public final List<@NonNull String> getStreamSizeAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.STREAMSIZE);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Name of the season, e.g. Strawars first Trilogy, Season 1.
    * 
    * @return Name of the season, e.g. Strawars first Trilogy, Season 1.
    */
    @Nullable
    public final Integer getSeasonAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.SEASON);
    }

   /**
    * Get Name of the season, e.g. Strawars first Trilogy, Season 1.
    * 
    * @return Name of the season, e.g. Strawars first Trilogy, Season 1.
    */
    @Nullable
    public final Long getSeasonAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.SEASON);
    }

   /**
    * Get Name of the season, e.g. Strawars first Trilogy, Season 1.
    * 
    * @return Name of the season, e.g. Strawars first Trilogy, Season 1.
    */
    @Nullable
    public final LocalDateTime getSeasonAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.SEASON);
    }

   /**
    * Get Name of the season, e.g. Strawars first Trilogy, Season 1.
    * 
    * @return Name of the season, e.g. Strawars first Trilogy, Season 1.
    */
    @Nullable
    public final LocalTime getSeasonAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.SEASON);
    }

   /**
    * Get Name of the season, e.g. Strawars first Trilogy, Season 1.
    * 
    * @return Name of the season, e.g. Strawars first Trilogy, Season 1.
    */
    @Nullable
    public final String getSeasonAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.SEASON);
    }

   /**
    * Get Name of the season, e.g. Strawars first Trilogy, Season 1.
    * 
    * @return Name of the season, e.g. Strawars first Trilogy, Season 1.
    */
    @Nullable
    public final Boolean getSeasonAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.SEASON);
    }

   /**
    * Get Name of the season, e.g. Strawars first Trilogy, Season 1.
    * 
    * @return Name of the season, e.g. Strawars first Trilogy, Season 1.
    */
    @Nullable
    public final BigInteger getSeasonAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.SEASON);
    }

   /**
    * Get Name of the season, e.g. Strawars first Trilogy, Season 1.
    * 
    * @return Name of the season, e.g. Strawars first Trilogy, Season 1.
    */
    @Nullable
    public final URL getSeasonAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.SEASON);
    }

   /**
    * Get Name of the season, e.g. Strawars first Trilogy, Season 1.
    * 
    * @return Name of the season, e.g. Strawars first Trilogy, Season 1.
    */
    @NonNull
    public final List<@NonNull String> getSeasonAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.SEASON);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get The name of the costume designer..
    * 
    * @return The name of the costume designer..
    */
    @Nullable
    public final Integer getCostumeDesignerAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.COSTUMEDESIGNER);
    }

   /**
    * Get The name of the costume designer..
    * 
    * @return The name of the costume designer..
    */
    @Nullable
    public final Long getCostumeDesignerAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.COSTUMEDESIGNER);
    }

   /**
    * Get The name of the costume designer..
    * 
    * @return The name of the costume designer..
    */
    @Nullable
    public final LocalDateTime getCostumeDesignerAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.COSTUMEDESIGNER);
    }

   /**
    * Get The name of the costume designer..
    * 
    * @return The name of the costume designer..
    */
    @Nullable
    public final LocalTime getCostumeDesignerAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.COSTUMEDESIGNER);
    }

   /**
    * Get The name of the costume designer..
    * 
    * @return The name of the costume designer..
    */
    @Nullable
    public final String getCostumeDesignerAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.COSTUMEDESIGNER);
    }

   /**
    * Get The name of the costume designer..
    * 
    * @return The name of the costume designer..
    */
    @Nullable
    public final Boolean getCostumeDesignerAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.COSTUMEDESIGNER);
    }

   /**
    * Get The name of the costume designer..
    * 
    * @return The name of the costume designer..
    */
    @Nullable
    public final BigInteger getCostumeDesignerAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.COSTUMEDESIGNER);
    }

   /**
    * Get The name of the costume designer..
    * 
    * @return The name of the costume designer..
    */
    @Nullable
    public final URL getCostumeDesignerAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.COSTUMEDESIGNER);
    }

   /**
    * Get The name of the costume designer..
    * 
    * @return The name of the costume designer..
    */
    @NonNull
    public final List<@NonNull String> getCostumeDesignerAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.COSTUMEDESIGNER);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Original artist(s)/performer(s)..
    * 
    * @return Original artist(s)/performer(s)..
    */
    @Nullable
    public final Integer getOriginalPerformerAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ORIGINALPERFORMER);
    }

   /**
    * Get Original artist(s)/performer(s)..
    * 
    * @return Original artist(s)/performer(s)..
    */
    @Nullable
    public final Long getOriginalPerformerAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ORIGINALPERFORMER);
    }

   /**
    * Get Original artist(s)/performer(s)..
    * 
    * @return Original artist(s)/performer(s)..
    */
    @Nullable
    public final LocalDateTime getOriginalPerformerAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ORIGINALPERFORMER);
    }

   /**
    * Get Original artist(s)/performer(s)..
    * 
    * @return Original artist(s)/performer(s)..
    */
    @Nullable
    public final LocalTime getOriginalPerformerAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ORIGINALPERFORMER);
    }

   /**
    * Get Original artist(s)/performer(s)..
    * 
    * @return Original artist(s)/performer(s)..
    */
    @Nullable
    public final String getOriginalPerformerAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ORIGINALPERFORMER);
    }

   /**
    * Get Original artist(s)/performer(s)..
    * 
    * @return Original artist(s)/performer(s)..
    */
    @Nullable
    public final Boolean getOriginalPerformerAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ORIGINALPERFORMER);
    }

   /**
    * Get Original artist(s)/performer(s)..
    * 
    * @return Original artist(s)/performer(s)..
    */
    @Nullable
    public final BigInteger getOriginalPerformerAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ORIGINALPERFORMER);
    }

   /**
    * Get Original artist(s)/performer(s)..
    * 
    * @return Original artist(s)/performer(s)..
    */
    @Nullable
    public final URL getOriginalPerformerAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ORIGINALPERFORMER);
    }

   /**
    * Get Original artist(s)/performer(s)..
    * 
    * @return Original artist(s)/performer(s)..
    */
    @NonNull
    public final List<@NonNull String> getOriginalPerformerAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ORIGINALPERFORMER);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Other formats in this file with popular name (hint), separated by /.
    * 
    * @return Other formats in this file with popular name (hint), separated by /.
    */
    @Nullable
    public final Integer getOtherFormatWithHintListAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.OTHERFORMATWITHHINTLIST);
    }

   /**
    * Get Other formats in this file with popular name (hint), separated by /.
    * 
    * @return Other formats in this file with popular name (hint), separated by /.
    */
    @Nullable
    public final Long getOtherFormatWithHintListAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.OTHERFORMATWITHHINTLIST);
    }

   /**
    * Get Other formats in this file with popular name (hint), separated by /.
    * 
    * @return Other formats in this file with popular name (hint), separated by /.
    */
    @Nullable
    public final LocalDateTime getOtherFormatWithHintListAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.OTHERFORMATWITHHINTLIST);
    }

   /**
    * Get Other formats in this file with popular name (hint), separated by /.
    * 
    * @return Other formats in this file with popular name (hint), separated by /.
    */
    @Nullable
    public final LocalTime getOtherFormatWithHintListAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.OTHERFORMATWITHHINTLIST);
    }

   /**
    * Get Other formats in this file with popular name (hint), separated by /.
    * 
    * @return Other formats in this file with popular name (hint), separated by /.
    */
    @Nullable
    public final String getOtherFormatWithHintListAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.OTHERFORMATWITHHINTLIST);
    }

   /**
    * Get Other formats in this file with popular name (hint), separated by /.
    * 
    * @return Other formats in this file with popular name (hint), separated by /.
    */
    @Nullable
    public final Boolean getOtherFormatWithHintListAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.OTHERFORMATWITHHINTLIST);
    }

   /**
    * Get Other formats in this file with popular name (hint), separated by /.
    * 
    * @return Other formats in this file with popular name (hint), separated by /.
    */
    @Nullable
    public final BigInteger getOtherFormatWithHintListAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.OTHERFORMATWITHHINTLIST);
    }

   /**
    * Get Other formats in this file with popular name (hint), separated by /.
    * 
    * @return Other formats in this file with popular name (hint), separated by /.
    */
    @Nullable
    public final URL getOtherFormatWithHintListAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.OTHERFORMATWITHHINTLIST);
    }

   /**
    * Get Other formats in this file with popular name (hint), separated by /.
    * 
    * @return Other formats in this file with popular name (hint), separated by /.
    */
    @NonNull
    public final List<@NonNull String> getOtherFormatWithHintListAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.OTHERFORMATWITHHINTLIST);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Info about this Format.
    * 
    * @return Info about this Format.
    */
    @Nullable
    public final Integer getFormatInfoAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.FORMATINFO);
    }

   /**
    * Get Info about this Format.
    * 
    * @return Info about this Format.
    */
    @Nullable
    public final Long getFormatInfoAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.FORMATINFO);
    }

   /**
    * Get Info about this Format.
    * 
    * @return Info about this Format.
    */
    @Nullable
    public final LocalDateTime getFormatInfoAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.FORMATINFO);
    }

   /**
    * Get Info about this Format.
    * 
    * @return Info about this Format.
    */
    @Nullable
    public final LocalTime getFormatInfoAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.FORMATINFO);
    }

   /**
    * Get Info about this Format.
    * 
    * @return Info about this Format.
    */
    @Nullable
    public final String getFormatInfoAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.FORMATINFO);
    }

   /**
    * Get Info about this Format.
    * 
    * @return Info about this Format.
    */
    @Nullable
    public final Boolean getFormatInfoAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.FORMATINFO);
    }

   /**
    * Get Info about this Format.
    * 
    * @return Info about this Format.
    */
    @Nullable
    public final BigInteger getFormatInfoAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.FORMATINFO);
    }

   /**
    * Get Info about this Format.
    * 
    * @return Info about this Format.
    */
    @Nullable
    public final URL getFormatInfoAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.FORMATINFO);
    }

   /**
    * Get Info about this Format.
    * 
    * @return Info about this Format.
    */
    @NonNull
    public final List<@NonNull String> getFormatInfoAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.FORMATINFO);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get If Audio and video are muxed.
    * 
    * @return If Audio and video are muxed.
    */
    @Nullable
    public final Integer getInterleavedAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.INTERLEAVED);
    }

   /**
    * Get If Audio and video are muxed.
    * 
    * @return If Audio and video are muxed.
    */
    @Nullable
    public final Long getInterleavedAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.INTERLEAVED);
    }

   /**
    * Get If Audio and video are muxed.
    * 
    * @return If Audio and video are muxed.
    */
    @Nullable
    public final LocalDateTime getInterleavedAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.INTERLEAVED);
    }

   /**
    * Get If Audio and video are muxed.
    * 
    * @return If Audio and video are muxed.
    */
    @Nullable
    public final LocalTime getInterleavedAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.INTERLEAVED);
    }

   /**
    * Get If Audio and video are muxed.
    * 
    * @return If Audio and video are muxed.
    */
    @Nullable
    public final String getInterleavedAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.INTERLEAVED);
    }

   /**
    * Get If Audio and video are muxed.
    * 
    * @return If Audio and video are muxed.
    */
    @Nullable
    public final Boolean getInterleavedAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.INTERLEAVED);
    }

   /**
    * Get If Audio and video are muxed.
    * 
    * @return If Audio and video are muxed.
    */
    @Nullable
    public final BigInteger getInterleavedAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.INTERLEAVED);
    }

   /**
    * Get If Audio and video are muxed.
    * 
    * @return If Audio and video are muxed.
    */
    @Nullable
    public final URL getInterleavedAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.INTERLEAVED);
    }

   /**
    * Get If Audio and video are muxed.
    * 
    * @return If Audio and video are muxed.
    */
    @NonNull
    public final List<@NonNull String> getInterleavedAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.INTERLEAVED);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get A link to more details about this codec ID.
    * 
    * @return A link to more details about this codec ID.
    */
    @Nullable
    public final Integer getCodecIDUrlAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.CODECIDURL);
    }

   /**
    * Get A link to more details about this codec ID.
    * 
    * @return A link to more details about this codec ID.
    */
    @Nullable
    public final Long getCodecIDUrlAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.CODECIDURL);
    }

   /**
    * Get A link to more details about this codec ID.
    * 
    * @return A link to more details about this codec ID.
    */
    @Nullable
    public final LocalDateTime getCodecIDUrlAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.CODECIDURL);
    }

   /**
    * Get A link to more details about this codec ID.
    * 
    * @return A link to more details about this codec ID.
    */
    @Nullable
    public final LocalTime getCodecIDUrlAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.CODECIDURL);
    }

   /**
    * Get A link to more details about this codec ID.
    * 
    * @return A link to more details about this codec ID.
    */
    @Nullable
    public final String getCodecIDUrlAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.CODECIDURL);
    }

   /**
    * Get A link to more details about this codec ID.
    * 
    * @return A link to more details about this codec ID.
    */
    @Nullable
    public final Boolean getCodecIDUrlAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.CODECIDURL);
    }

   /**
    * Get A link to more details about this codec ID.
    * 
    * @return A link to more details about this codec ID.
    */
    @Nullable
    public final BigInteger getCodecIDUrlAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.CODECIDURL);
    }

   /**
    * Get A link to more details about this codec ID.
    * 
    * @return A link to more details about this codec ID.
    */
    @Nullable
    public final URL getCodecIDUrlAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.CODECIDURL);
    }

   /**
    * Get A link to more details about this codec ID.
    * 
    * @return A link to more details about this codec ID.
    */
    @NonNull
    public final List<@NonNull String> getCodecIDUrlAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.CODECIDURL);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Encryption_Mode.
    * 
    * @return Encryption_Mode.
    */
    @Nullable
    public final Integer getEncryptionModeAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ENCRYPTIONMODE);
    }

   /**
    * Get Encryption_Mode.
    * 
    * @return Encryption_Mode.
    */
    @Nullable
    public final Long getEncryptionModeAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ENCRYPTIONMODE);
    }

   /**
    * Get Encryption_Mode.
    * 
    * @return Encryption_Mode.
    */
    @Nullable
    public final LocalDateTime getEncryptionModeAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ENCRYPTIONMODE);
    }

   /**
    * Get Encryption_Mode.
    * 
    * @return Encryption_Mode.
    */
    @Nullable
    public final LocalTime getEncryptionModeAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ENCRYPTIONMODE);
    }

   /**
    * Get Encryption_Mode.
    * 
    * @return Encryption_Mode.
    */
    @Nullable
    public final String getEncryptionModeAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ENCRYPTIONMODE);
    }

   /**
    * Get Encryption_Mode.
    * 
    * @return Encryption_Mode.
    */
    @Nullable
    public final Boolean getEncryptionModeAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ENCRYPTIONMODE);
    }

   /**
    * Get Encryption_Mode.
    * 
    * @return Encryption_Mode.
    */
    @Nullable
    public final BigInteger getEncryptionModeAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ENCRYPTIONMODE);
    }

   /**
    * Get Encryption_Mode.
    * 
    * @return Encryption_Mode.
    */
    @Nullable
    public final URL getEncryptionModeAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ENCRYPTIONMODE);
    }

   /**
    * Get Encryption_Mode.
    * 
    * @return Encryption_Mode.
    */
    @NonNull
    public final List<@NonNull String> getEncryptionModeAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ENCRYPTIONMODE);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Location that the item was originaly designed/written. Information should be stored in the following format: country code, state/province, city where the coutry code is the same 2 octets as in Internet domains, or possibly ISO-3166. e.g. US, Texas, Austin or US, , Austin..
    * 
    * @return Location that the item was originaly designed/written. Information should be stored in the following format: country code, state/province, city where the coutry code is the same 2 octets as in Internet domains, or possibly ISO-3166. e.g. US, Texas, Austin or US, , Austin..
    */
    @Nullable
    public final Integer getWrittenLocationAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.WRITTENLOCATION);
    }

   /**
    * Get Location that the item was originaly designed/written. Information should be stored in the following format: country code, state/province, city where the coutry code is the same 2 octets as in Internet domains, or possibly ISO-3166. e.g. US, Texas, Austin or US, , Austin..
    * 
    * @return Location that the item was originaly designed/written. Information should be stored in the following format: country code, state/province, city where the coutry code is the same 2 octets as in Internet domains, or possibly ISO-3166. e.g. US, Texas, Austin or US, , Austin..
    */
    @Nullable
    public final Long getWrittenLocationAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.WRITTENLOCATION);
    }

   /**
    * Get Location that the item was originaly designed/written. Information should be stored in the following format: country code, state/province, city where the coutry code is the same 2 octets as in Internet domains, or possibly ISO-3166. e.g. US, Texas, Austin or US, , Austin..
    * 
    * @return Location that the item was originaly designed/written. Information should be stored in the following format: country code, state/province, city where the coutry code is the same 2 octets as in Internet domains, or possibly ISO-3166. e.g. US, Texas, Austin or US, , Austin..
    */
    @Nullable
    public final LocalDateTime getWrittenLocationAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.WRITTENLOCATION);
    }

   /**
    * Get Location that the item was originaly designed/written. Information should be stored in the following format: country code, state/province, city where the coutry code is the same 2 octets as in Internet domains, or possibly ISO-3166. e.g. US, Texas, Austin or US, , Austin..
    * 
    * @return Location that the item was originaly designed/written. Information should be stored in the following format: country code, state/province, city where the coutry code is the same 2 octets as in Internet domains, or possibly ISO-3166. e.g. US, Texas, Austin or US, , Austin..
    */
    @Nullable
    public final LocalTime getWrittenLocationAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.WRITTENLOCATION);
    }

   /**
    * Get Location that the item was originaly designed/written. Information should be stored in the following format: country code, state/province, city where the coutry code is the same 2 octets as in Internet domains, or possibly ISO-3166. e.g. US, Texas, Austin or US, , Austin..
    * 
    * @return Location that the item was originaly designed/written. Information should be stored in the following format: country code, state/province, city where the coutry code is the same 2 octets as in Internet domains, or possibly ISO-3166. e.g. US, Texas, Austin or US, , Austin..
    */
    @Nullable
    public final String getWrittenLocationAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.WRITTENLOCATION);
    }

   /**
    * Get Location that the item was originaly designed/written. Information should be stored in the following format: country code, state/province, city where the coutry code is the same 2 octets as in Internet domains, or possibly ISO-3166. e.g. US, Texas, Austin or US, , Austin..
    * 
    * @return Location that the item was originaly designed/written. Information should be stored in the following format: country code, state/province, city where the coutry code is the same 2 octets as in Internet domains, or possibly ISO-3166. e.g. US, Texas, Austin or US, , Austin..
    */
    @Nullable
    public final Boolean getWrittenLocationAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.WRITTENLOCATION);
    }

   /**
    * Get Location that the item was originaly designed/written. Information should be stored in the following format: country code, state/province, city where the coutry code is the same 2 octets as in Internet domains, or possibly ISO-3166. e.g. US, Texas, Austin or US, , Austin..
    * 
    * @return Location that the item was originaly designed/written. Information should be stored in the following format: country code, state/province, city where the coutry code is the same 2 octets as in Internet domains, or possibly ISO-3166. e.g. US, Texas, Austin or US, , Austin..
    */
    @Nullable
    public final BigInteger getWrittenLocationAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.WRITTENLOCATION);
    }

   /**
    * Get Location that the item was originaly designed/written. Information should be stored in the following format: country code, state/province, city where the coutry code is the same 2 octets as in Internet domains, or possibly ISO-3166. e.g. US, Texas, Austin or US, , Austin..
    * 
    * @return Location that the item was originaly designed/written. Information should be stored in the following format: country code, state/province, city where the coutry code is the same 2 octets as in Internet domains, or possibly ISO-3166. e.g. US, Texas, Austin or US, , Austin..
    */
    @Nullable
    public final URL getWrittenLocationAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.WRITTENLOCATION);
    }

   /**
    * Get Location that the item was originaly designed/written. Information should be stored in the following format: country code, state/province, city where the coutry code is the same 2 octets as in Internet domains, or possibly ISO-3166. e.g. US, Texas, Austin or US, , Austin..
    * 
    * @return Location that the item was originaly designed/written. Information should be stored in the following format: country code, state/province, city where the coutry code is the same 2 octets as in Internet domains, or possibly ISO-3166. e.g. US, Texas, Austin or US, , Austin..
    */
    @NonNull
    public final List<@NonNull String> getWrittenLocationAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.WRITTENLOCATION);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Specifies the size of the original subject of the file. eg 8.5 in h, 11 in w.
    * 
    * @return Specifies the size of the original subject of the file. eg 8.5 in h, 11 in w.
    */
    @Nullable
    public final Integer getDimensionsAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.DIMENSIONS);
    }

   /**
    * Get Specifies the size of the original subject of the file. eg 8.5 in h, 11 in w.
    * 
    * @return Specifies the size of the original subject of the file. eg 8.5 in h, 11 in w.
    */
    @Nullable
    public final Long getDimensionsAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.DIMENSIONS);
    }

   /**
    * Get Specifies the size of the original subject of the file. eg 8.5 in h, 11 in w.
    * 
    * @return Specifies the size of the original subject of the file. eg 8.5 in h, 11 in w.
    */
    @Nullable
    public final LocalDateTime getDimensionsAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.DIMENSIONS);
    }

   /**
    * Get Specifies the size of the original subject of the file. eg 8.5 in h, 11 in w.
    * 
    * @return Specifies the size of the original subject of the file. eg 8.5 in h, 11 in w.
    */
    @Nullable
    public final LocalTime getDimensionsAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.DIMENSIONS);
    }

   /**
    * Get Specifies the size of the original subject of the file. eg 8.5 in h, 11 in w.
    * 
    * @return Specifies the size of the original subject of the file. eg 8.5 in h, 11 in w.
    */
    @Nullable
    public final String getDimensionsAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.DIMENSIONS);
    }

   /**
    * Get Specifies the size of the original subject of the file. eg 8.5 in h, 11 in w.
    * 
    * @return Specifies the size of the original subject of the file. eg 8.5 in h, 11 in w.
    */
    @Nullable
    public final Boolean getDimensionsAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.DIMENSIONS);
    }

   /**
    * Get Specifies the size of the original subject of the file. eg 8.5 in h, 11 in w.
    * 
    * @return Specifies the size of the original subject of the file. eg 8.5 in h, 11 in w.
    */
    @Nullable
    public final BigInteger getDimensionsAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.DIMENSIONS);
    }

   /**
    * Get Specifies the size of the original subject of the file. eg 8.5 in h, 11 in w.
    * 
    * @return Specifies the size of the original subject of the file. eg 8.5 in h, 11 in w.
    */
    @Nullable
    public final URL getDimensionsAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.DIMENSIONS);
    }

   /**
    * Get Specifies the size of the original subject of the file. eg 8.5 in h, 11 in w.
    * 
    * @return Specifies the size of the original subject of the file. eg 8.5 in h, 11 in w.
    */
    @NonNull
    public final List<@NonNull String> getDimensionsAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.DIMENSIONS);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Name of the organization publishing the album (i.e. the 'record label') or movie..
    * 
    * @return Name of the organization publishing the album (i.e. the 'record label') or movie..
    */
    @Nullable
    public final Integer getPublisherAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.PUBLISHER);
    }

   /**
    * Get Name of the organization publishing the album (i.e. the 'record label') or movie..
    * 
    * @return Name of the organization publishing the album (i.e. the 'record label') or movie..
    */
    @Nullable
    public final Long getPublisherAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.PUBLISHER);
    }

   /**
    * Get Name of the organization publishing the album (i.e. the 'record label') or movie..
    * 
    * @return Name of the organization publishing the album (i.e. the 'record label') or movie..
    */
    @Nullable
    public final LocalDateTime getPublisherAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.PUBLISHER);
    }

   /**
    * Get Name of the organization publishing the album (i.e. the 'record label') or movie..
    * 
    * @return Name of the organization publishing the album (i.e. the 'record label') or movie..
    */
    @Nullable
    public final LocalTime getPublisherAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.PUBLISHER);
    }

   /**
    * Get Name of the organization publishing the album (i.e. the 'record label') or movie..
    * 
    * @return Name of the organization publishing the album (i.e. the 'record label') or movie..
    */
    @Nullable
    public final String getPublisherAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.PUBLISHER);
    }

   /**
    * Get Name of the organization publishing the album (i.e. the 'record label') or movie..
    * 
    * @return Name of the organization publishing the album (i.e. the 'record label') or movie..
    */
    @Nullable
    public final Boolean getPublisherAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.PUBLISHER);
    }

   /**
    * Get Name of the organization publishing the album (i.e. the 'record label') or movie..
    * 
    * @return Name of the organization publishing the album (i.e. the 'record label') or movie..
    */
    @Nullable
    public final BigInteger getPublisherAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.PUBLISHER);
    }

   /**
    * Get Name of the organization publishing the album (i.e. the 'record label') or movie..
    * 
    * @return Name of the organization publishing the album (i.e. the 'record label') or movie..
    */
    @Nullable
    public final URL getPublisherAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.PUBLISHER);
    }

   /**
    * Get Name of the organization publishing the album (i.e. the 'record label') or movie..
    * 
    * @return Name of the organization publishing the album (i.e. the 'record label') or movie..
    */
    @NonNull
    public final List<@NonNull String> getPublisherAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.PUBLISHER);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Cover_Type.
    * 
    * @return Cover_Type.
    */
    @Nullable
    public final Integer getCoverTypeAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.COVERTYPE);
    }

   /**
    * Get Cover_Type.
    * 
    * @return Cover_Type.
    */
    @Nullable
    public final Long getCoverTypeAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.COVERTYPE);
    }

   /**
    * Get Cover_Type.
    * 
    * @return Cover_Type.
    */
    @Nullable
    public final LocalDateTime getCoverTypeAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.COVERTYPE);
    }

   /**
    * Get Cover_Type.
    * 
    * @return Cover_Type.
    */
    @Nullable
    public final LocalTime getCoverTypeAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.COVERTYPE);
    }

   /**
    * Get Cover_Type.
    * 
    * @return Cover_Type.
    */
    @Nullable
    public final String getCoverTypeAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.COVERTYPE);
    }

   /**
    * Get Cover_Type.
    * 
    * @return Cover_Type.
    */
    @Nullable
    public final Boolean getCoverTypeAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.COVERTYPE);
    }

   /**
    * Get Cover_Type.
    * 
    * @return Cover_Type.
    */
    @Nullable
    public final BigInteger getCoverTypeAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.COVERTYPE);
    }

   /**
    * Get Cover_Type.
    * 
    * @return Cover_Type.
    */
    @Nullable
    public final URL getCoverTypeAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.COVERTYPE);
    }

   /**
    * Get Cover_Type.
    * 
    * @return Cover_Type.
    */
    @NonNull
    public final List<@NonNull String> getCoverTypeAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.COVERTYPE);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Operating System of encoding-software.
    * 
    * @return Operating System of encoding-software.
    */
    @Nullable
    public final Integer getEncodedOperatingSystemAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ENCODEDOPERATINGSYSTEM);
    }

   /**
    * Get Operating System of encoding-software.
    * 
    * @return Operating System of encoding-software.
    */
    @Nullable
    public final Long getEncodedOperatingSystemAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ENCODEDOPERATINGSYSTEM);
    }

   /**
    * Get Operating System of encoding-software.
    * 
    * @return Operating System of encoding-software.
    */
    @Nullable
    public final LocalDateTime getEncodedOperatingSystemAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ENCODEDOPERATINGSYSTEM);
    }

   /**
    * Get Operating System of encoding-software.
    * 
    * @return Operating System of encoding-software.
    */
    @Nullable
    public final LocalTime getEncodedOperatingSystemAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ENCODEDOPERATINGSYSTEM);
    }

   /**
    * Get Operating System of encoding-software.
    * 
    * @return Operating System of encoding-software.
    */
    @Nullable
    public final String getEncodedOperatingSystemAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ENCODEDOPERATINGSYSTEM);
    }

   /**
    * Get Operating System of encoding-software.
    * 
    * @return Operating System of encoding-software.
    */
    @Nullable
    public final Boolean getEncodedOperatingSystemAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ENCODEDOPERATINGSYSTEM);
    }

   /**
    * Get Operating System of encoding-software.
    * 
    * @return Operating System of encoding-software.
    */
    @Nullable
    public final BigInteger getEncodedOperatingSystemAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ENCODEDOPERATINGSYSTEM);
    }

   /**
    * Get Operating System of encoding-software.
    * 
    * @return Operating System of encoding-software.
    */
    @Nullable
    public final URL getEncodedOperatingSystemAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ENCODEDOPERATINGSYSTEM);
    }

   /**
    * Get Operating System of encoding-software.
    * 
    * @return Operating System of encoding-software.
    */
    @NonNull
    public final List<@NonNull String> getEncodedOperatingSystemAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ENCODEDOPERATINGSYSTEM);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final Integer getEncodedApplicationCompanyNameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ENCODEDAPPLICATIONCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final Long getEncodedApplicationCompanyNameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ENCODEDAPPLICATIONCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final LocalDateTime getEncodedApplicationCompanyNameAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ENCODEDAPPLICATIONCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final LocalTime getEncodedApplicationCompanyNameAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ENCODEDAPPLICATIONCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final String getEncodedApplicationCompanyNameAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ENCODEDAPPLICATIONCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final Boolean getEncodedApplicationCompanyNameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ENCODEDAPPLICATIONCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final BigInteger getEncodedApplicationCompanyNameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ENCODEDAPPLICATIONCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final URL getEncodedApplicationCompanyNameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ENCODEDAPPLICATIONCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @NonNull
    public final List<@NonNull String> getEncodedApplicationCompanyNameAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ENCODEDAPPLICATIONCOMPANYNAME);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Is there a cover.
    * 
    * @return Is there a cover.
    */
    @Nullable
    public final Integer getCoverAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.COVER);
    }

   /**
    * Get Is there a cover.
    * 
    * @return Is there a cover.
    */
    @Nullable
    public final Long getCoverAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.COVER);
    }

   /**
    * Get Is there a cover.
    * 
    * @return Is there a cover.
    */
    @Nullable
    public final LocalDateTime getCoverAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.COVER);
    }

   /**
    * Get Is there a cover.
    * 
    * @return Is there a cover.
    */
    @Nullable
    public final LocalTime getCoverAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.COVER);
    }

   /**
    * Get Is there a cover.
    * 
    * @return Is there a cover.
    */
    @Nullable
    public final String getCoverAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.COVER);
    }

   /**
    * Get Is there a cover.
    * 
    * @return Is there a cover.
    */
    @Nullable
    public final Boolean getCoverAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.COVER);
    }

   /**
    * Get Is there a cover.
    * 
    * @return Is there a cover.
    */
    @Nullable
    public final BigInteger getCoverAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.COVER);
    }

   /**
    * Get Is there a cover.
    * 
    * @return Is there a cover.
    */
    @Nullable
    public final URL getCoverAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.COVER);
    }

   /**
    * Get Is there a cover.
    * 
    * @return Is there a cover.
    */
    @NonNull
    public final List<@NonNull String> getCoverAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.COVER);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Commercial name used by vendor for theses setings if there is one.
    * 
    * @return Commercial name used by vendor for theses setings if there is one.
    */
    @Nullable
    public final Integer getFormatCommercialIfAnyAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.FORMATCOMMERCIALIFANY);
    }

   /**
    * Get Commercial name used by vendor for theses setings if there is one.
    * 
    * @return Commercial name used by vendor for theses setings if there is one.
    */
    @Nullable
    public final Long getFormatCommercialIfAnyAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.FORMATCOMMERCIALIFANY);
    }

   /**
    * Get Commercial name used by vendor for theses setings if there is one.
    * 
    * @return Commercial name used by vendor for theses setings if there is one.
    */
    @Nullable
    public final LocalDateTime getFormatCommercialIfAnyAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.FORMATCOMMERCIALIFANY);
    }

   /**
    * Get Commercial name used by vendor for theses setings if there is one.
    * 
    * @return Commercial name used by vendor for theses setings if there is one.
    */
    @Nullable
    public final LocalTime getFormatCommercialIfAnyAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.FORMATCOMMERCIALIFANY);
    }

   /**
    * Get Commercial name used by vendor for theses setings if there is one.
    * 
    * @return Commercial name used by vendor for theses setings if there is one.
    */
    @Nullable
    public final String getFormatCommercialIfAnyAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.FORMATCOMMERCIALIFANY);
    }

   /**
    * Get Commercial name used by vendor for theses setings if there is one.
    * 
    * @return Commercial name used by vendor for theses setings if there is one.
    */
    @Nullable
    public final Boolean getFormatCommercialIfAnyAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.FORMATCOMMERCIALIFANY);
    }

   /**
    * Get Commercial name used by vendor for theses setings if there is one.
    * 
    * @return Commercial name used by vendor for theses setings if there is one.
    */
    @Nullable
    public final BigInteger getFormatCommercialIfAnyAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.FORMATCOMMERCIALIFANY);
    }

   /**
    * Get Commercial name used by vendor for theses setings if there is one.
    * 
    * @return Commercial name used by vendor for theses setings if there is one.
    */
    @Nullable
    public final URL getFormatCommercialIfAnyAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.FORMATCOMMERCIALIFANY);
    }

   /**
    * Get Commercial name used by vendor for theses setings if there is one.
    * 
    * @return Commercial name used by vendor for theses setings if there is one.
    */
    @NonNull
    public final List<@NonNull String> getFormatCommercialIfAnyAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.FORMATCOMMERCIALIFANY);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get The time/date/year that the tags were done for this item..
    * 
    * @return The time/date/year that the tags were done for this item..
    */
    @Nullable
    public final Integer getTaggedDateAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.TAGGEDDATE);
    }

   /**
    * Get The time/date/year that the tags were done for this item..
    * 
    * @return The time/date/year that the tags were done for this item..
    */
    @Nullable
    public final Long getTaggedDateAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.TAGGEDDATE);
    }

   /**
    * Get The time/date/year that the tags were done for this item..
    * 
    * @return The time/date/year that the tags were done for this item..
    */
    @Nullable
    public final LocalDateTime getTaggedDateAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.TAGGEDDATE);
    }

   /**
    * Get The time/date/year that the tags were done for this item..
    * 
    * @return The time/date/year that the tags were done for this item..
    */
    @Nullable
    public final LocalTime getTaggedDateAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.TAGGEDDATE);
    }

   /**
    * Get The time/date/year that the tags were done for this item..
    * 
    * @return The time/date/year that the tags were done for this item..
    */
    @Nullable
    public final String getTaggedDateAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.TAGGEDDATE);
    }

   /**
    * Get The time/date/year that the tags were done for this item..
    * 
    * @return The time/date/year that the tags were done for this item..
    */
    @Nullable
    public final Boolean getTaggedDateAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.TAGGEDDATE);
    }

   /**
    * Get The time/date/year that the tags were done for this item..
    * 
    * @return The time/date/year that the tags were done for this item..
    */
    @Nullable
    public final BigInteger getTaggedDateAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.TAGGEDDATE);
    }

   /**
    * Get The time/date/year that the tags were done for this item..
    * 
    * @return The time/date/year that the tags were done for this item..
    */
    @Nullable
    public final URL getTaggedDateAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.TAGGEDDATE);
    }

   /**
    * Get The time/date/year that the tags were done for this item..
    * 
    * @return The time/date/year that the tags were done for this item..
    */
    @NonNull
    public final List<@NonNull String> getTaggedDateAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.TAGGEDDATE);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Name of the product the file was originally intended for.
    * 
    * @return Name of the product the file was originally intended for.
    */
    @Nullable
    public final Integer getOriginalSourceFormNameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ORIGINALSOURCEFORMNAME);
    }

   /**
    * Get Name of the product the file was originally intended for.
    * 
    * @return Name of the product the file was originally intended for.
    */
    @Nullable
    public final Long getOriginalSourceFormNameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ORIGINALSOURCEFORMNAME);
    }

   /**
    * Get Name of the product the file was originally intended for.
    * 
    * @return Name of the product the file was originally intended for.
    */
    @Nullable
    public final LocalDateTime getOriginalSourceFormNameAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ORIGINALSOURCEFORMNAME);
    }

   /**
    * Get Name of the product the file was originally intended for.
    * 
    * @return Name of the product the file was originally intended for.
    */
    @Nullable
    public final LocalTime getOriginalSourceFormNameAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ORIGINALSOURCEFORMNAME);
    }

   /**
    * Get Name of the product the file was originally intended for.
    * 
    * @return Name of the product the file was originally intended for.
    */
    @Nullable
    public final String getOriginalSourceFormNameAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ORIGINALSOURCEFORMNAME);
    }

   /**
    * Get Name of the product the file was originally intended for.
    * 
    * @return Name of the product the file was originally intended for.
    */
    @Nullable
    public final Boolean getOriginalSourceFormNameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ORIGINALSOURCEFORMNAME);
    }

   /**
    * Get Name of the product the file was originally intended for.
    * 
    * @return Name of the product the file was originally intended for.
    */
    @Nullable
    public final BigInteger getOriginalSourceFormNameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ORIGINALSOURCEFORMNAME);
    }

   /**
    * Get Name of the product the file was originally intended for.
    * 
    * @return Name of the product the file was originally intended for.
    */
    @Nullable
    public final URL getOriginalSourceFormNameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ORIGINALSOURCEFORMNAME);
    }

   /**
    * Get Name of the product the file was originally intended for.
    * 
    * @return Name of the product the file was originally intended for.
    */
    @NonNull
    public final List<@NonNull String> getOriginalSourceFormNameAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ORIGINALSOURCEFORMNAME);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Album performer/artist of this file.
    * 
    * @return Album performer/artist of this file.
    */
    @Nullable
    public final Integer getAlbumPerformerAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ALBUMPERFORMER);
    }

   /**
    * Get Album performer/artist of this file.
    * 
    * @return Album performer/artist of this file.
    */
    @Nullable
    public final Long getAlbumPerformerAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ALBUMPERFORMER);
    }

   /**
    * Get Album performer/artist of this file.
    * 
    * @return Album performer/artist of this file.
    */
    @Nullable
    public final LocalDateTime getAlbumPerformerAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ALBUMPERFORMER);
    }

   /**
    * Get Album performer/artist of this file.
    * 
    * @return Album performer/artist of this file.
    */
    @Nullable
    public final LocalTime getAlbumPerformerAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ALBUMPERFORMER);
    }

   /**
    * Get Album performer/artist of this file.
    * 
    * @return Album performer/artist of this file.
    */
    @Nullable
    public final String getAlbumPerformerAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ALBUMPERFORMER);
    }

   /**
    * Get Album performer/artist of this file.
    * 
    * @return Album performer/artist of this file.
    */
    @Nullable
    public final Boolean getAlbumPerformerAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ALBUMPERFORMER);
    }

   /**
    * Get Album performer/artist of this file.
    * 
    * @return Album performer/artist of this file.
    */
    @Nullable
    public final BigInteger getAlbumPerformerAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ALBUMPERFORMER);
    }

   /**
    * Get Album performer/artist of this file.
    * 
    * @return Album performer/artist of this file.
    */
    @Nullable
    public final URL getAlbumPerformerAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ALBUMPERFORMER);
    }

   /**
    * Get Album performer/artist of this file.
    * 
    * @return Album performer/artist of this file.
    */
    @NonNull
    public final List<@NonNull String> getAlbumPerformerAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ALBUMPERFORMER);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get A very general tag for everyone else that wants to be listed..
    * 
    * @return A very general tag for everyone else that wants to be listed..
    */
    @Nullable
    public final Integer getThanksToAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.THANKSTO);
    }

   /**
    * Get A very general tag for everyone else that wants to be listed..
    * 
    * @return A very general tag for everyone else that wants to be listed..
    */
    @Nullable
    public final Long getThanksToAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.THANKSTO);
    }

   /**
    * Get A very general tag for everyone else that wants to be listed..
    * 
    * @return A very general tag for everyone else that wants to be listed..
    */
    @Nullable
    public final LocalDateTime getThanksToAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.THANKSTO);
    }

   /**
    * Get A very general tag for everyone else that wants to be listed..
    * 
    * @return A very general tag for everyone else that wants to be listed..
    */
    @Nullable
    public final LocalTime getThanksToAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.THANKSTO);
    }

   /**
    * Get A very general tag for everyone else that wants to be listed..
    * 
    * @return A very general tag for everyone else that wants to be listed..
    */
    @Nullable
    public final String getThanksToAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.THANKSTO);
    }

   /**
    * Get A very general tag for everyone else that wants to be listed..
    * 
    * @return A very general tag for everyone else that wants to be listed..
    */
    @Nullable
    public final Boolean getThanksToAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.THANKSTO);
    }

   /**
    * Get A very general tag for everyone else that wants to be listed..
    * 
    * @return A very general tag for everyone else that wants to be listed..
    */
    @Nullable
    public final BigInteger getThanksToAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.THANKSTO);
    }

   /**
    * Get A very general tag for everyone else that wants to be listed..
    * 
    * @return A very general tag for everyone else that wants to be listed..
    */
    @Nullable
    public final URL getThanksToAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.THANKSTO);
    }

   /**
    * Get A very general tag for everyone else that wants to be listed..
    * 
    * @return A very general tag for everyone else that wants to be listed..
    */
    @NonNull
    public final List<@NonNull String> getThanksToAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.THANKSTO);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final Integer getIDStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.IDSTRING);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final Long getIDStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.IDSTRING);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final LocalDateTime getIDStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.IDSTRING);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final LocalTime getIDStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.IDSTRING);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final String getIDStringAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.IDSTRING);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final Boolean getIDStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.IDSTRING);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final BigInteger getIDStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.IDSTRING);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final URL getIDStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.IDSTRING);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @NonNull
    public final List<@NonNull String> getIDStringAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.IDSTRING);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Comic_More.
    * 
    * @return Comic_More.
    */
    @Nullable
    public final Integer getComicMoreAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.COMICMORE);
    }

   /**
    * Get Comic_More.
    * 
    * @return Comic_More.
    */
    @Nullable
    public final Long getComicMoreAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.COMICMORE);
    }

   /**
    * Get Comic_More.
    * 
    * @return Comic_More.
    */
    @Nullable
    public final LocalDateTime getComicMoreAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.COMICMORE);
    }

   /**
    * Get Comic_More.
    * 
    * @return Comic_More.
    */
    @Nullable
    public final LocalTime getComicMoreAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.COMICMORE);
    }

   /**
    * Get Comic_More.
    * 
    * @return Comic_More.
    */
    @Nullable
    public final String getComicMoreAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.COMICMORE);
    }

   /**
    * Get Comic_More.
    * 
    * @return Comic_More.
    */
    @Nullable
    public final Boolean getComicMoreAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.COMICMORE);
    }

   /**
    * Get Comic_More.
    * 
    * @return Comic_More.
    */
    @Nullable
    public final BigInteger getComicMoreAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.COMICMORE);
    }

   /**
    * Get Comic_More.
    * 
    * @return Comic_More.
    */
    @Nullable
    public final URL getComicMoreAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.COMICMORE);
    }

   /**
    * Get Comic_More.
    * 
    * @return Comic_More.
    */
    @NonNull
    public final List<@NonNull String> getComicMoreAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.COMICMORE);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get The person responsible for designing the Overall visual appearance of a movie..
    * 
    * @return The person responsible for designing the Overall visual appearance of a movie..
    */
    @Nullable
    public final Integer getProductionDesignerAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.PRODUCTIONDESIGNER);
    }

   /**
    * Get The person responsible for designing the Overall visual appearance of a movie..
    * 
    * @return The person responsible for designing the Overall visual appearance of a movie..
    */
    @Nullable
    public final Long getProductionDesignerAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.PRODUCTIONDESIGNER);
    }

   /**
    * Get The person responsible for designing the Overall visual appearance of a movie..
    * 
    * @return The person responsible for designing the Overall visual appearance of a movie..
    */
    @Nullable
    public final LocalDateTime getProductionDesignerAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.PRODUCTIONDESIGNER);
    }

   /**
    * Get The person responsible for designing the Overall visual appearance of a movie..
    * 
    * @return The person responsible for designing the Overall visual appearance of a movie..
    */
    @Nullable
    public final LocalTime getProductionDesignerAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.PRODUCTIONDESIGNER);
    }

   /**
    * Get The person responsible for designing the Overall visual appearance of a movie..
    * 
    * @return The person responsible for designing the Overall visual appearance of a movie..
    */
    @Nullable
    public final String getProductionDesignerAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.PRODUCTIONDESIGNER);
    }

   /**
    * Get The person responsible for designing the Overall visual appearance of a movie..
    * 
    * @return The person responsible for designing the Overall visual appearance of a movie..
    */
    @Nullable
    public final Boolean getProductionDesignerAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.PRODUCTIONDESIGNER);
    }

   /**
    * Get The person responsible for designing the Overall visual appearance of a movie..
    * 
    * @return The person responsible for designing the Overall visual appearance of a movie..
    */
    @Nullable
    public final BigInteger getProductionDesignerAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.PRODUCTIONDESIGNER);
    }

   /**
    * Get The person responsible for designing the Overall visual appearance of a movie..
    * 
    * @return The person responsible for designing the Overall visual appearance of a movie..
    */
    @Nullable
    public final URL getProductionDesignerAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.PRODUCTIONDESIGNER);
    }

   /**
    * Get The person responsible for designing the Overall visual appearance of a movie..
    * 
    * @return The person responsible for designing the Overall visual appearance of a movie..
    */
    @NonNull
    public final List<@NonNull String> getProductionDesignerAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.PRODUCTIONDESIGNER);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get The time/date/year that the encoding of this item was completed began..
    * 
    * @return The time/date/year that the encoding of this item was completed began..
    */
    @Nullable
    public final Integer getEncodedDateAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ENCODEDDATE);
    }

   /**
    * Get The time/date/year that the encoding of this item was completed began..
    * 
    * @return The time/date/year that the encoding of this item was completed began..
    */
    @Nullable
    public final Long getEncodedDateAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ENCODEDDATE);
    }

   /**
    * Get The time/date/year that the encoding of this item was completed began..
    * 
    * @return The time/date/year that the encoding of this item was completed began..
    */
    @Nullable
    public final LocalDateTime getEncodedDateAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ENCODEDDATE);
    }

   /**
    * Get The time/date/year that the encoding of this item was completed began..
    * 
    * @return The time/date/year that the encoding of this item was completed began..
    */
    @Nullable
    public final LocalTime getEncodedDateAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ENCODEDDATE);
    }

   /**
    * Get The time/date/year that the encoding of this item was completed began..
    * 
    * @return The time/date/year that the encoding of this item was completed began..
    */
    @Nullable
    public final String getEncodedDateAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ENCODEDDATE);
    }

   /**
    * Get The time/date/year that the encoding of this item was completed began..
    * 
    * @return The time/date/year that the encoding of this item was completed began..
    */
    @Nullable
    public final Boolean getEncodedDateAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ENCODEDDATE);
    }

   /**
    * Get The time/date/year that the encoding of this item was completed began..
    * 
    * @return The time/date/year that the encoding of this item was completed began..
    */
    @Nullable
    public final BigInteger getEncodedDateAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ENCODEDDATE);
    }

   /**
    * Get The time/date/year that the encoding of this item was completed began..
    * 
    * @return The time/date/year that the encoding of this item was completed began..
    */
    @Nullable
    public final URL getEncodedDateAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ENCODEDDATE);
    }

   /**
    * Get The time/date/year that the encoding of this item was completed began..
    * 
    * @return The time/date/year that the encoding of this item was completed began..
    */
    @NonNull
    public final List<@NonNull String> getEncodedDateAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ENCODEDDATE);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get ServiceChannel.
    * 
    * @return ServiceChannel.
    */
    @Nullable
    public final Integer getServiceChannelAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.SERVICECHANNEL);
    }

   /**
    * Get ServiceChannel.
    * 
    * @return ServiceChannel.
    */
    @Nullable
    public final Long getServiceChannelAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.SERVICECHANNEL);
    }

   /**
    * Get ServiceChannel.
    * 
    * @return ServiceChannel.
    */
    @Nullable
    public final LocalDateTime getServiceChannelAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.SERVICECHANNEL);
    }

   /**
    * Get ServiceChannel.
    * 
    * @return ServiceChannel.
    */
    @Nullable
    public final LocalTime getServiceChannelAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.SERVICECHANNEL);
    }

   /**
    * Get ServiceChannel.
    * 
    * @return ServiceChannel.
    */
    @Nullable
    public final String getServiceChannelAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.SERVICECHANNEL);
    }

   /**
    * Get ServiceChannel.
    * 
    * @return ServiceChannel.
    */
    @Nullable
    public final Boolean getServiceChannelAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.SERVICECHANNEL);
    }

   /**
    * Get ServiceChannel.
    * 
    * @return ServiceChannel.
    */
    @Nullable
    public final BigInteger getServiceChannelAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.SERVICECHANNEL);
    }

   /**
    * Get ServiceChannel.
    * 
    * @return ServiceChannel.
    */
    @Nullable
    public final URL getServiceChannelAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.SERVICECHANNEL);
    }

   /**
    * Get ServiceChannel.
    * 
    * @return ServiceChannel.
    */
    @NonNull
    public final List<@NonNull String> getServiceChannelAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.SERVICECHANNEL);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final Integer getUniqueIDAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.UNIQUEID);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final Long getUniqueIDAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.UNIQUEID);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final LocalDateTime getUniqueIDAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.UNIQUEID);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final LocalTime getUniqueIDAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.UNIQUEID);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final String getUniqueIDAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.UNIQUEID);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final Boolean getUniqueIDAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.UNIQUEID);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final BigInteger getUniqueIDAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.UNIQUEID);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final URL getUniqueIDAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.UNIQUEID);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @NonNull
    public final List<@NonNull String> getUniqueIDAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.UNIQUEID);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get format : HH:MM:SS.MMM.
    * 
    * @return format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Integer getDelayString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.DELAYSTRING3);
    }

   /**
    * Get format : HH:MM:SS.MMM.
    * 
    * @return format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Long getDelayString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.DELAYSTRING3);
    }

   /**
    * Get format : HH:MM:SS.MMM.
    * 
    * @return format : HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalDateTime getDelayString3AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.DELAYSTRING3);
    }

   /**
    * Get format : HH:MM:SS.MMM.
    * 
    * @return format : HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalTime getDelayString3AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.DELAYSTRING3);
    }

   /**
    * Get format : HH:MM:SS.MMM.
    * 
    * @return format : HH:MM:SS.MMM.
    */
    @Nullable
    public final String getDelayString3AsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.DELAYSTRING3);
    }

   /**
    * Get format : HH:MM:SS.MMM.
    * 
    * @return format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Boolean getDelayString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.DELAYSTRING3);
    }

   /**
    * Get format : HH:MM:SS.MMM.
    * 
    * @return format : HH:MM:SS.MMM.
    */
    @Nullable
    public final BigInteger getDelayString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.DELAYSTRING3);
    }

   /**
    * Get format : HH:MM:SS.MMM.
    * 
    * @return format : HH:MM:SS.MMM.
    */
    @Nullable
    public final URL getDelayString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.DELAYSTRING3);
    }

   /**
    * Get format : HH:MM:SS.MMM.
    * 
    * @return format : HH:MM:SS.MMM.
    */
    @NonNull
    public final List<@NonNull String> getDelayString3AsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.DELAYSTRING3);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Integer getDelayString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.DELAYSTRING4);
    }

   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Long getDelayString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.DELAYSTRING4);
    }

   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalDateTime getDelayString4AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.DELAYSTRING4);
    }

   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalTime getDelayString4AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.DELAYSTRING4);
    }

   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final String getDelayString4AsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.DELAYSTRING4);
    }

   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Boolean getDelayString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.DELAYSTRING4);
    }

   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final BigInteger getDelayString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.DELAYSTRING4);
    }

   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final URL getDelayString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.DELAYSTRING4);
    }

   /**
    * Get Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Delay in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @NonNull
    public final List<@NonNull String> getDelayString4AsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.DELAYSTRING4);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Integer getDelayString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.DELAYSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Long getDelayString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.DELAYSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final LocalDateTime getDelayString1AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.DELAYSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final LocalTime getDelayString1AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.DELAYSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final String getDelayString1AsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.DELAYSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Boolean getDelayString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.DELAYSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final BigInteger getDelayString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.DELAYSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final URL getDelayString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.DELAYSTRING1);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @NonNull
    public final List<@NonNull String> getDelayString1AsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.DELAYSTRING1);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Integer getDelayString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.DELAYSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Long getDelayString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.DELAYSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final LocalDateTime getDelayString2AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.DELAYSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final LocalTime getDelayString2AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.DELAYSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final String getDelayString2AsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.DELAYSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final Boolean getDelayString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.DELAYSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final BigInteger getDelayString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.DELAYSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @Nullable
    public final URL getDelayString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.DELAYSTRING2);
    }

   /**
    * Get Delay with measurement.
    * 
    * @return Delay with measurement.
    */
    @NonNull
    public final List<@NonNull String> getDelayString2AsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.DELAYSTRING2);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Brand or trademark associated with the marketing of music recordings and music videos..
    * 
    * @return Brand or trademark associated with the marketing of music recordings and music videos..
    */
    @Nullable
    public final Integer getLabelAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.LABEL);
    }

   /**
    * Get Brand or trademark associated with the marketing of music recordings and music videos..
    * 
    * @return Brand or trademark associated with the marketing of music recordings and music videos..
    */
    @Nullable
    public final Long getLabelAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.LABEL);
    }

   /**
    * Get Brand or trademark associated with the marketing of music recordings and music videos..
    * 
    * @return Brand or trademark associated with the marketing of music recordings and music videos..
    */
    @Nullable
    public final LocalDateTime getLabelAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.LABEL);
    }

   /**
    * Get Brand or trademark associated with the marketing of music recordings and music videos..
    * 
    * @return Brand or trademark associated with the marketing of music recordings and music videos..
    */
    @Nullable
    public final LocalTime getLabelAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.LABEL);
    }

   /**
    * Get Brand or trademark associated with the marketing of music recordings and music videos..
    * 
    * @return Brand or trademark associated with the marketing of music recordings and music videos..
    */
    @Nullable
    public final String getLabelAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.LABEL);
    }

   /**
    * Get Brand or trademark associated with the marketing of music recordings and music videos..
    * 
    * @return Brand or trademark associated with the marketing of music recordings and music videos..
    */
    @Nullable
    public final Boolean getLabelAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.LABEL);
    }

   /**
    * Get Brand or trademark associated with the marketing of music recordings and music videos..
    * 
    * @return Brand or trademark associated with the marketing of music recordings and music videos..
    */
    @Nullable
    public final BigInteger getLabelAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.LABEL);
    }

   /**
    * Get Brand or trademark associated with the marketing of music recordings and music videos..
    * 
    * @return Brand or trademark associated with the marketing of music recordings and music videos..
    */
    @Nullable
    public final URL getLabelAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.LABEL);
    }

   /**
    * Get Brand or trademark associated with the marketing of music recordings and music videos..
    * 
    * @return Brand or trademark associated with the marketing of music recordings and music videos..
    */
    @NonNull
    public final List<@NonNull String> getLabelAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.LABEL);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Integer getDelayString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.DELAYSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Long getDelayString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.DELAYSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalDateTime getDelayString5AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.DELAYSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalTime getDelayString5AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.DELAYSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final String getDelayString5AsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.DELAYSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Boolean getDelayString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.DELAYSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final BigInteger getDelayString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.DELAYSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final URL getDelayString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.DELAYSTRING5);
    }

   /**
    * Get Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Delay in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @NonNull
    public final List<@NonNull String> getDelayString5AsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.DELAYSTRING5);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Link to a site about this track.
    * 
    * @return Link to a site about this track.
    */
    @Nullable
    public final Integer getTrackUrlAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.TRACKURL);
    }

   /**
    * Get Link to a site about this track.
    * 
    * @return Link to a site about this track.
    */
    @Nullable
    public final Long getTrackUrlAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.TRACKURL);
    }

   /**
    * Get Link to a site about this track.
    * 
    * @return Link to a site about this track.
    */
    @Nullable
    public final LocalDateTime getTrackUrlAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.TRACKURL);
    }

   /**
    * Get Link to a site about this track.
    * 
    * @return Link to a site about this track.
    */
    @Nullable
    public final LocalTime getTrackUrlAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.TRACKURL);
    }

   /**
    * Get Link to a site about this track.
    * 
    * @return Link to a site about this track.
    */
    @Nullable
    public final String getTrackUrlAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.TRACKURL);
    }

   /**
    * Get Link to a site about this track.
    * 
    * @return Link to a site about this track.
    */
    @Nullable
    public final Boolean getTrackUrlAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.TRACKURL);
    }

   /**
    * Get Link to a site about this track.
    * 
    * @return Link to a site about this track.
    */
    @Nullable
    public final BigInteger getTrackUrlAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.TRACKURL);
    }

   /**
    * Get Link to a site about this track.
    * 
    * @return Link to a site about this track.
    */
    @Nullable
    public final URL getTrackUrlAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.TRACKURL);
    }

   /**
    * Get Link to a site about this track.
    * 
    * @return Link to a site about this track.
    */
    @NonNull
    public final List<@NonNull String> getTrackUrlAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.TRACKURL);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Original name of the part in the original support.
    * 
    * @return Original name of the part in the original support.
    */
    @Nullable
    public final Integer getOriginalPartAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ORIGINALPART);
    }

   /**
    * Get Original name of the part in the original support.
    * 
    * @return Original name of the part in the original support.
    */
    @Nullable
    public final Long getOriginalPartAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ORIGINALPART);
    }

   /**
    * Get Original name of the part in the original support.
    * 
    * @return Original name of the part in the original support.
    */
    @Nullable
    public final LocalDateTime getOriginalPartAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ORIGINALPART);
    }

   /**
    * Get Original name of the part in the original support.
    * 
    * @return Original name of the part in the original support.
    */
    @Nullable
    public final LocalTime getOriginalPartAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ORIGINALPART);
    }

   /**
    * Get Original name of the part in the original support.
    * 
    * @return Original name of the part in the original support.
    */
    @Nullable
    public final String getOriginalPartAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ORIGINALPART);
    }

   /**
    * Get Original name of the part in the original support.
    * 
    * @return Original name of the part in the original support.
    */
    @Nullable
    public final Boolean getOriginalPartAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ORIGINALPART);
    }

   /**
    * Get Original name of the part in the original support.
    * 
    * @return Original name of the part in the original support.
    */
    @Nullable
    public final BigInteger getOriginalPartAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ORIGINALPART);
    }

   /**
    * Get Original name of the part in the original support.
    * 
    * @return Original name of the part in the original support.
    */
    @Nullable
    public final URL getOriginalPartAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ORIGINALPART);
    }

   /**
    * Get Original name of the part in the original support.
    * 
    * @return Original name of the part in the original support.
    */
    @NonNull
    public final List<@NonNull String> getOriginalPartAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ORIGINALPART);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Encryption_Padding.
    * 
    * @return Encryption_Padding.
    */
    @Nullable
    public final Integer getEncryptionPaddingAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ENCRYPTIONPADDING);
    }

   /**
    * Get Encryption_Padding.
    * 
    * @return Encryption_Padding.
    */
    @Nullable
    public final Long getEncryptionPaddingAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ENCRYPTIONPADDING);
    }

   /**
    * Get Encryption_Padding.
    * 
    * @return Encryption_Padding.
    */
    @Nullable
    public final LocalDateTime getEncryptionPaddingAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ENCRYPTIONPADDING);
    }

   /**
    * Get Encryption_Padding.
    * 
    * @return Encryption_Padding.
    */
    @Nullable
    public final LocalTime getEncryptionPaddingAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ENCRYPTIONPADDING);
    }

   /**
    * Get Encryption_Padding.
    * 
    * @return Encryption_Padding.
    */
    @Nullable
    public final String getEncryptionPaddingAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ENCRYPTIONPADDING);
    }

   /**
    * Get Encryption_Padding.
    * 
    * @return Encryption_Padding.
    */
    @Nullable
    public final Boolean getEncryptionPaddingAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ENCRYPTIONPADDING);
    }

   /**
    * Get Encryption_Padding.
    * 
    * @return Encryption_Padding.
    */
    @Nullable
    public final BigInteger getEncryptionPaddingAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ENCRYPTIONPADDING);
    }

   /**
    * Get Encryption_Padding.
    * 
    * @return Encryption_Padding.
    */
    @Nullable
    public final URL getEncryptionPaddingAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ENCRYPTIONPADDING);
    }

   /**
    * Get Encryption_Padding.
    * 
    * @return Encryption_Padding.
    */
    @NonNull
    public final List<@NonNull String> getEncryptionPaddingAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ENCRYPTIONPADDING);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Delay fixed in the stream (relative) IN MS.
    * 
    * @return Delay fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final Integer getDelayAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.DELAY);
    }

   /**
    * Get Delay fixed in the stream (relative) IN MS.
    * 
    * @return Delay fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final Long getDelayAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.DELAY);
    }

   /**
    * Get Delay fixed in the stream (relative) IN MS.
    * 
    * @return Delay fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final LocalDateTime getDelayAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.DELAY);
    }

   /**
    * Get Delay fixed in the stream (relative) IN MS.
    * 
    * @return Delay fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final LocalTime getDelayAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.DELAY);
    }

   /**
    * Get Delay fixed in the stream (relative) IN MS.
    * 
    * @return Delay fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final String getDelayAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.DELAY);
    }

   /**
    * Get Delay fixed in the stream (relative) IN MS.
    * 
    * @return Delay fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final Boolean getDelayAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.DELAY);
    }

   /**
    * Get Delay fixed in the stream (relative) IN MS.
    * 
    * @return Delay fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final BigInteger getDelayAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.DELAY);
    }

   /**
    * Get Delay fixed in the stream (relative) IN MS.
    * 
    * @return Delay fixed in the stream (relative) IN MS.
    */
    @Nullable
    public final URL getDelayAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.DELAY);
    }

   /**
    * Get Delay fixed in the stream (relative) IN MS.
    * 
    * @return Delay fixed in the stream (relative) IN MS.
    */
    @NonNull
    public final List<@NonNull String> getDelayAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.DELAY);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit..
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit..
    */
    @Nullable
    public final Integer getEncodedApplicationUrlAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ENCODEDAPPLICATIONURL);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit..
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit..
    */
    @Nullable
    public final Long getEncodedApplicationUrlAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ENCODEDAPPLICATIONURL);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit..
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit..
    */
    @Nullable
    public final LocalDateTime getEncodedApplicationUrlAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ENCODEDAPPLICATIONURL);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit..
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit..
    */
    @Nullable
    public final LocalTime getEncodedApplicationUrlAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ENCODEDAPPLICATIONURL);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit..
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit..
    */
    @Nullable
    public final String getEncodedApplicationUrlAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ENCODEDAPPLICATIONURL);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit..
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit..
    */
    @Nullable
    public final Boolean getEncodedApplicationUrlAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ENCODEDAPPLICATIONURL);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit..
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit..
    */
    @Nullable
    public final BigInteger getEncodedApplicationUrlAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ENCODEDAPPLICATIONURL);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit..
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit..
    */
    @Nullable
    public final URL getEncodedApplicationUrlAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ENCODEDAPPLICATIONURL);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit..
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit..
    */
    @NonNull
    public final List<@NonNull String> getEncodedApplicationUrlAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ENCODEDAPPLICATIONURL);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Cover_Mime.
    * 
    * @return Cover_Mime.
    */
    @Nullable
    public final Integer getCoverMimeAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.COVERMIME);
    }

   /**
    * Get Cover_Mime.
    * 
    * @return Cover_Mime.
    */
    @Nullable
    public final Long getCoverMimeAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.COVERMIME);
    }

   /**
    * Get Cover_Mime.
    * 
    * @return Cover_Mime.
    */
    @Nullable
    public final LocalDateTime getCoverMimeAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.COVERMIME);
    }

   /**
    * Get Cover_Mime.
    * 
    * @return Cover_Mime.
    */
    @Nullable
    public final LocalTime getCoverMimeAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.COVERMIME);
    }

   /**
    * Get Cover_Mime.
    * 
    * @return Cover_Mime.
    */
    @Nullable
    public final String getCoverMimeAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.COVERMIME);
    }

   /**
    * Get Cover_Mime.
    * 
    * @return Cover_Mime.
    */
    @Nullable
    public final Boolean getCoverMimeAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.COVERMIME);
    }

   /**
    * Get Cover_Mime.
    * 
    * @return Cover_Mime.
    */
    @Nullable
    public final BigInteger getCoverMimeAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.COVERMIME);
    }

   /**
    * Get Cover_Mime.
    * 
    * @return Cover_Mime.
    */
    @Nullable
    public final URL getCoverMimeAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.COVERMIME);
    }

   /**
    * Get Cover_Mime.
    * 
    * @return Cover_Mime.
    */
    @NonNull
    public final List<@NonNull String> getCoverMimeAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.COVERMIME);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get DataSize.
    * 
    * @return DataSize.
    */
    @Nullable
    public final Integer getDataSizeAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.DATASIZE);
    }

   /**
    * Get DataSize.
    * 
    * @return DataSize.
    */
    @Nullable
    public final Long getDataSizeAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.DATASIZE);
    }

   /**
    * Get DataSize.
    * 
    * @return DataSize.
    */
    @Nullable
    public final LocalDateTime getDataSizeAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.DATASIZE);
    }

   /**
    * Get DataSize.
    * 
    * @return DataSize.
    */
    @Nullable
    public final LocalTime getDataSizeAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.DATASIZE);
    }

   /**
    * Get DataSize.
    * 
    * @return DataSize.
    */
    @Nullable
    public final String getDataSizeAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.DATASIZE);
    }

   /**
    * Get DataSize.
    * 
    * @return DataSize.
    */
    @Nullable
    public final Boolean getDataSizeAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.DATASIZE);
    }

   /**
    * Get DataSize.
    * 
    * @return DataSize.
    */
    @Nullable
    public final BigInteger getDataSizeAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.DATASIZE);
    }

   /**
    * Get DataSize.
    * 
    * @return DataSize.
    */
    @Nullable
    public final URL getDataSizeAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.DATASIZE);
    }

   /**
    * Get DataSize.
    * 
    * @return DataSize.
    */
    @NonNull
    public final List<@NonNull String> getDataSizeAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.DATASIZE);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Software used to create the file.
    * 
    * @return Software used to create the file.
    */
    @Nullable
    public final Integer getEncodedLibraryAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ENCODEDLIBRARY);
    }

   /**
    * Get Software used to create the file.
    * 
    * @return Software used to create the file.
    */
    @Nullable
    public final Long getEncodedLibraryAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ENCODEDLIBRARY);
    }

   /**
    * Get Software used to create the file.
    * 
    * @return Software used to create the file.
    */
    @Nullable
    public final LocalDateTime getEncodedLibraryAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ENCODEDLIBRARY);
    }

   /**
    * Get Software used to create the file.
    * 
    * @return Software used to create the file.
    */
    @Nullable
    public final LocalTime getEncodedLibraryAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ENCODEDLIBRARY);
    }

   /**
    * Get Software used to create the file.
    * 
    * @return Software used to create the file.
    */
    @Nullable
    public final String getEncodedLibraryAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ENCODEDLIBRARY);
    }

   /**
    * Get Software used to create the file.
    * 
    * @return Software used to create the file.
    */
    @Nullable
    public final Boolean getEncodedLibraryAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ENCODEDLIBRARY);
    }

   /**
    * Get Software used to create the file.
    * 
    * @return Software used to create the file.
    */
    @Nullable
    public final BigInteger getEncodedLibraryAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ENCODEDLIBRARY);
    }

   /**
    * Get Software used to create the file.
    * 
    * @return Software used to create the file.
    */
    @Nullable
    public final URL getEncodedLibraryAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ENCODEDLIBRARY);
    }

   /**
    * Get Software used to create the file.
    * 
    * @return Software used to create the file.
    */
    @NonNull
    public final List<@NonNull String> getEncodedLibraryAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ENCODEDLIBRARY);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Number of the part.
    * 
    * @return Number of the part.
    */
    @Nullable
    public final Integer getPartPositionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.PARTPOSITION);
    }

   /**
    * Get Number of the part.
    * 
    * @return Number of the part.
    */
    @Nullable
    public final Long getPartPositionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.PARTPOSITION);
    }

   /**
    * Get Number of the part.
    * 
    * @return Number of the part.
    */
    @Nullable
    public final LocalDateTime getPartPositionAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.PARTPOSITION);
    }

   /**
    * Get Number of the part.
    * 
    * @return Number of the part.
    */
    @Nullable
    public final LocalTime getPartPositionAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.PARTPOSITION);
    }

   /**
    * Get Number of the part.
    * 
    * @return Number of the part.
    */
    @Nullable
    public final String getPartPositionAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.PARTPOSITION);
    }

   /**
    * Get Number of the part.
    * 
    * @return Number of the part.
    */
    @Nullable
    public final Boolean getPartPositionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.PARTPOSITION);
    }

   /**
    * Get Number of the part.
    * 
    * @return Number of the part.
    */
    @Nullable
    public final BigInteger getPartPositionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.PARTPOSITION);
    }

   /**
    * Get Number of the part.
    * 
    * @return Number of the part.
    */
    @Nullable
    public final URL getPartPositionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.PARTPOSITION);
    }

   /**
    * Get Number of the part.
    * 
    * @return Number of the part.
    */
    @NonNull
    public final List<@NonNull String> getPartPositionAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.PARTPOSITION);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Complete name (Folder+Name+Extension) of the last file (in the case of a sequence of files).
    * 
    * @return Complete name (Folder+Name+Extension) of the last file (in the case of a sequence of files).
    */
    @Nullable
    public final Integer getCompleteNameLastAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.COMPLETENAMELAST);
    }

   /**
    * Get Complete name (Folder+Name+Extension) of the last file (in the case of a sequence of files).
    * 
    * @return Complete name (Folder+Name+Extension) of the last file (in the case of a sequence of files).
    */
    @Nullable
    public final Long getCompleteNameLastAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.COMPLETENAMELAST);
    }

   /**
    * Get Complete name (Folder+Name+Extension) of the last file (in the case of a sequence of files).
    * 
    * @return Complete name (Folder+Name+Extension) of the last file (in the case of a sequence of files).
    */
    @Nullable
    public final LocalDateTime getCompleteNameLastAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.COMPLETENAMELAST);
    }

   /**
    * Get Complete name (Folder+Name+Extension) of the last file (in the case of a sequence of files).
    * 
    * @return Complete name (Folder+Name+Extension) of the last file (in the case of a sequence of files).
    */
    @Nullable
    public final LocalTime getCompleteNameLastAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.COMPLETENAMELAST);
    }

   /**
    * Get Complete name (Folder+Name+Extension) of the last file (in the case of a sequence of files).
    * 
    * @return Complete name (Folder+Name+Extension) of the last file (in the case of a sequence of files).
    */
    @Nullable
    public final String getCompleteNameLastAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.COMPLETENAMELAST);
    }

   /**
    * Get Complete name (Folder+Name+Extension) of the last file (in the case of a sequence of files).
    * 
    * @return Complete name (Folder+Name+Extension) of the last file (in the case of a sequence of files).
    */
    @Nullable
    public final Boolean getCompleteNameLastAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.COMPLETENAMELAST);
    }

   /**
    * Get Complete name (Folder+Name+Extension) of the last file (in the case of a sequence of files).
    * 
    * @return Complete name (Folder+Name+Extension) of the last file (in the case of a sequence of files).
    */
    @Nullable
    public final BigInteger getCompleteNameLastAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.COMPLETENAMELAST);
    }

   /**
    * Get Complete name (Folder+Name+Extension) of the last file (in the case of a sequence of files).
    * 
    * @return Complete name (Folder+Name+Extension) of the last file (in the case of a sequence of files).
    */
    @Nullable
    public final URL getCompleteNameLastAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.COMPLETENAMELAST);
    }

   /**
    * Get Complete name (Folder+Name+Extension) of the last file (in the case of a sequence of files).
    * 
    * @return Complete name (Folder+Name+Extension) of the last file (in the case of a sequence of files).
    */
    @NonNull
    public final List<@NonNull String> getCompleteNameLastAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.COMPLETENAMELAST);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Text of a song.
    * 
    * @return Text of a song.
    */
    @Nullable
    public final Integer getLyricsAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.LYRICS);
    }

   /**
    * Get Text of a song.
    * 
    * @return Text of a song.
    */
    @Nullable
    public final Long getLyricsAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.LYRICS);
    }

   /**
    * Get Text of a song.
    * 
    * @return Text of a song.
    */
    @Nullable
    public final LocalDateTime getLyricsAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.LYRICS);
    }

   /**
    * Get Text of a song.
    * 
    * @return Text of a song.
    */
    @Nullable
    public final LocalTime getLyricsAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.LYRICS);
    }

   /**
    * Get Text of a song.
    * 
    * @return Text of a song.
    */
    @Nullable
    public final String getLyricsAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.LYRICS);
    }

   /**
    * Get Text of a song.
    * 
    * @return Text of a song.
    */
    @Nullable
    public final Boolean getLyricsAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.LYRICS);
    }

   /**
    * Get Text of a song.
    * 
    * @return Text of a song.
    */
    @Nullable
    public final BigInteger getLyricsAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.LYRICS);
    }

   /**
    * Get Text of a song.
    * 
    * @return Text of a song.
    */
    @Nullable
    public final URL getLyricsAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.LYRICS);
    }

   /**
    * Get Text of a song.
    * 
    * @return Text of a song.
    */
    @NonNull
    public final List<@NonNull String> getLyricsAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.LYRICS);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Internet Media Type (aka MIME Type, Content-Type).
    * 
    * @return Internet Media Type (aka MIME Type, Content-Type).
    */
    @Nullable
    public final Integer getInternetMediaTypeAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.INTERNETMEDIATYPE);
    }

   /**
    * Get Internet Media Type (aka MIME Type, Content-Type).
    * 
    * @return Internet Media Type (aka MIME Type, Content-Type).
    */
    @Nullable
    public final Long getInternetMediaTypeAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.INTERNETMEDIATYPE);
    }

   /**
    * Get Internet Media Type (aka MIME Type, Content-Type).
    * 
    * @return Internet Media Type (aka MIME Type, Content-Type).
    */
    @Nullable
    public final LocalDateTime getInternetMediaTypeAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.INTERNETMEDIATYPE);
    }

   /**
    * Get Internet Media Type (aka MIME Type, Content-Type).
    * 
    * @return Internet Media Type (aka MIME Type, Content-Type).
    */
    @Nullable
    public final LocalTime getInternetMediaTypeAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.INTERNETMEDIATYPE);
    }

   /**
    * Get Internet Media Type (aka MIME Type, Content-Type).
    * 
    * @return Internet Media Type (aka MIME Type, Content-Type).
    */
    @Nullable
    public final String getInternetMediaTypeAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.INTERNETMEDIATYPE);
    }

   /**
    * Get Internet Media Type (aka MIME Type, Content-Type).
    * 
    * @return Internet Media Type (aka MIME Type, Content-Type).
    */
    @Nullable
    public final Boolean getInternetMediaTypeAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.INTERNETMEDIATYPE);
    }

   /**
    * Get Internet Media Type (aka MIME Type, Content-Type).
    * 
    * @return Internet Media Type (aka MIME Type, Content-Type).
    */
    @Nullable
    public final BigInteger getInternetMediaTypeAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.INTERNETMEDIATYPE);
    }

   /**
    * Get Internet Media Type (aka MIME Type, Content-Type).
    * 
    * @return Internet Media Type (aka MIME Type, Content-Type).
    */
    @Nullable
    public final URL getInternetMediaTypeAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.INTERNETMEDIATYPE);
    }

   /**
    * Get Internet Media Type (aka MIME Type, Content-Type).
    * 
    * @return Internet Media Type (aka MIME Type, Content-Type).
    */
    @NonNull
    public final List<@NonNull String> getInternetMediaTypeAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.INTERNETMEDIATYPE);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo)..
    * 
    * @return Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo)..
    */
    @Nullable
    public final Integer getLawRatingAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.LAWRATING);
    }

   /**
    * Get Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo)..
    * 
    * @return Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo)..
    */
    @Nullable
    public final Long getLawRatingAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.LAWRATING);
    }

   /**
    * Get Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo)..
    * 
    * @return Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo)..
    */
    @Nullable
    public final LocalDateTime getLawRatingAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.LAWRATING);
    }

   /**
    * Get Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo)..
    * 
    * @return Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo)..
    */
    @Nullable
    public final LocalTime getLawRatingAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.LAWRATING);
    }

   /**
    * Get Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo)..
    * 
    * @return Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo)..
    */
    @Nullable
    public final String getLawRatingAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.LAWRATING);
    }

   /**
    * Get Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo)..
    * 
    * @return Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo)..
    */
    @Nullable
    public final Boolean getLawRatingAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.LAWRATING);
    }

   /**
    * Get Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo)..
    * 
    * @return Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo)..
    */
    @Nullable
    public final BigInteger getLawRatingAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.LAWRATING);
    }

   /**
    * Get Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo)..
    * 
    * @return Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo)..
    */
    @Nullable
    public final URL getLawRatingAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.LAWRATING);
    }

   /**
    * Get Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo)..
    * 
    * @return Depending on the country it's the format of the rating of a movie (P, R, X in the USA, an age in other countries or a URI defining a logo)..
    */
    @NonNull
    public final List<@NonNull String> getLawRatingAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.LAWRATING);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Frames per second, denominator.
    * 
    * @return Frames per second, denominator.
    */
    @Nullable
    public final Integer getFrameRateDenAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.FRAMERATEDEN);
    }

   /**
    * Get Frames per second, denominator.
    * 
    * @return Frames per second, denominator.
    */
    @Nullable
    public final Long getFrameRateDenAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.FRAMERATEDEN);
    }

   /**
    * Get Frames per second, denominator.
    * 
    * @return Frames per second, denominator.
    */
    @Nullable
    public final LocalDateTime getFrameRateDenAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.FRAMERATEDEN);
    }

   /**
    * Get Frames per second, denominator.
    * 
    * @return Frames per second, denominator.
    */
    @Nullable
    public final LocalTime getFrameRateDenAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.FRAMERATEDEN);
    }

   /**
    * Get Frames per second, denominator.
    * 
    * @return Frames per second, denominator.
    */
    @Nullable
    public final String getFrameRateDenAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.FRAMERATEDEN);
    }

   /**
    * Get Frames per second, denominator.
    * 
    * @return Frames per second, denominator.
    */
    @Nullable
    public final Boolean getFrameRateDenAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.FRAMERATEDEN);
    }

   /**
    * Get Frames per second, denominator.
    * 
    * @return Frames per second, denominator.
    */
    @Nullable
    public final BigInteger getFrameRateDenAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.FRAMERATEDEN);
    }

   /**
    * Get Frames per second, denominator.
    * 
    * @return Frames per second, denominator.
    */
    @Nullable
    public final URL getFrameRateDenAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.FRAMERATEDEN);
    }

   /**
    * Get Frames per second, denominator.
    * 
    * @return Frames per second, denominator.
    */
    @NonNull
    public final List<@NonNull String> getFrameRateDenAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.FRAMERATEDEN);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Encryption_Method.
    * 
    * @return Encryption_Method.
    */
    @Nullable
    public final Integer getEncryptionMethodAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ENCRYPTIONMETHOD);
    }

   /**
    * Get Encryption_Method.
    * 
    * @return Encryption_Method.
    */
    @Nullable
    public final Long getEncryptionMethodAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ENCRYPTIONMETHOD);
    }

   /**
    * Get Encryption_Method.
    * 
    * @return Encryption_Method.
    */
    @Nullable
    public final LocalDateTime getEncryptionMethodAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ENCRYPTIONMETHOD);
    }

   /**
    * Get Encryption_Method.
    * 
    * @return Encryption_Method.
    */
    @Nullable
    public final LocalTime getEncryptionMethodAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ENCRYPTIONMETHOD);
    }

   /**
    * Get Encryption_Method.
    * 
    * @return Encryption_Method.
    */
    @Nullable
    public final String getEncryptionMethodAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ENCRYPTIONMETHOD);
    }

   /**
    * Get Encryption_Method.
    * 
    * @return Encryption_Method.
    */
    @Nullable
    public final Boolean getEncryptionMethodAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ENCRYPTIONMETHOD);
    }

   /**
    * Get Encryption_Method.
    * 
    * @return Encryption_Method.
    */
    @Nullable
    public final BigInteger getEncryptionMethodAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ENCRYPTIONMETHOD);
    }

   /**
    * Get Encryption_Method.
    * 
    * @return Encryption_Method.
    */
    @Nullable
    public final URL getEncryptionMethodAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ENCRYPTIONMETHOD);
    }

   /**
    * Get Encryption_Method.
    * 
    * @return Encryption_Method.
    */
    @NonNull
    public final List<@NonNull String> getEncryptionMethodAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ENCRYPTIONMETHOD);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get The name of the director of photography, also known as cinematographer..
    * 
    * @return The name of the director of photography, also known as cinematographer..
    */
    @Nullable
    public final Integer getDirectorOfPhotographyAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.DIRECTOROFPHOTOGRAPHY);
    }

   /**
    * Get The name of the director of photography, also known as cinematographer..
    * 
    * @return The name of the director of photography, also known as cinematographer..
    */
    @Nullable
    public final Long getDirectorOfPhotographyAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.DIRECTOROFPHOTOGRAPHY);
    }

   /**
    * Get The name of the director of photography, also known as cinematographer..
    * 
    * @return The name of the director of photography, also known as cinematographer..
    */
    @Nullable
    public final LocalDateTime getDirectorOfPhotographyAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.DIRECTOROFPHOTOGRAPHY);
    }

   /**
    * Get The name of the director of photography, also known as cinematographer..
    * 
    * @return The name of the director of photography, also known as cinematographer..
    */
    @Nullable
    public final LocalTime getDirectorOfPhotographyAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.DIRECTOROFPHOTOGRAPHY);
    }

   /**
    * Get The name of the director of photography, also known as cinematographer..
    * 
    * @return The name of the director of photography, also known as cinematographer..
    */
    @Nullable
    public final String getDirectorOfPhotographyAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.DIRECTOROFPHOTOGRAPHY);
    }

   /**
    * Get The name of the director of photography, also known as cinematographer..
    * 
    * @return The name of the director of photography, also known as cinematographer..
    */
    @Nullable
    public final Boolean getDirectorOfPhotographyAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.DIRECTOROFPHOTOGRAPHY);
    }

   /**
    * Get The name of the director of photography, also known as cinematographer..
    * 
    * @return The name of the director of photography, also known as cinematographer..
    */
    @Nullable
    public final BigInteger getDirectorOfPhotographyAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.DIRECTOROFPHOTOGRAPHY);
    }

   /**
    * Get The name of the director of photography, also known as cinematographer..
    * 
    * @return The name of the director of photography, also known as cinematographer..
    */
    @Nullable
    public final URL getDirectorOfPhotographyAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.DIRECTOROFPHOTOGRAPHY);
    }

   /**
    * Get The name of the director of photography, also known as cinematographer..
    * 
    * @return The name of the director of photography, also known as cinematographer..
    */
    @NonNull
    public final List<@NonNull String> getDirectorOfPhotographyAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.DIRECTOROFPHOTOGRAPHY);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Audio Codecs in this file,separated by /.
    * 
    * @return Audio Codecs in this file,separated by /.
    */
    @Nullable
    public final Integer getAudioFormatListAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.AUDIOFORMATLIST);
    }

   /**
    * Get Audio Codecs in this file,separated by /.
    * 
    * @return Audio Codecs in this file,separated by /.
    */
    @Nullable
    public final Long getAudioFormatListAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.AUDIOFORMATLIST);
    }

   /**
    * Get Audio Codecs in this file,separated by /.
    * 
    * @return Audio Codecs in this file,separated by /.
    */
    @Nullable
    public final LocalDateTime getAudioFormatListAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.AUDIOFORMATLIST);
    }

   /**
    * Get Audio Codecs in this file,separated by /.
    * 
    * @return Audio Codecs in this file,separated by /.
    */
    @Nullable
    public final LocalTime getAudioFormatListAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.AUDIOFORMATLIST);
    }

   /**
    * Get Audio Codecs in this file,separated by /.
    * 
    * @return Audio Codecs in this file,separated by /.
    */
    @Nullable
    public final String getAudioFormatListAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.AUDIOFORMATLIST);
    }

   /**
    * Get Audio Codecs in this file,separated by /.
    * 
    * @return Audio Codecs in this file,separated by /.
    */
    @Nullable
    public final Boolean getAudioFormatListAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.AUDIOFORMATLIST);
    }

   /**
    * Get Audio Codecs in this file,separated by /.
    * 
    * @return Audio Codecs in this file,separated by /.
    */
    @Nullable
    public final BigInteger getAudioFormatListAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.AUDIOFORMATLIST);
    }

   /**
    * Get Audio Codecs in this file,separated by /.
    * 
    * @return Audio Codecs in this file,separated by /.
    */
    @Nullable
    public final URL getAudioFormatListAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.AUDIOFORMATLIST);
    }

   /**
    * Get Audio Codecs in this file,separated by /.
    * 
    * @return Audio Codecs in this file,separated by /.
    */
    @NonNull
    public final List<@NonNull String> getAudioFormatListAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.AUDIOFORMATLIST);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Other formats in this file, separated by /.
    * 
    * @return Other formats in this file, separated by /.
    */
    @Nullable
    public final Integer getOtherFormatListAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.OTHERFORMATLIST);
    }

   /**
    * Get Other formats in this file, separated by /.
    * 
    * @return Other formats in this file, separated by /.
    */
    @Nullable
    public final Long getOtherFormatListAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.OTHERFORMATLIST);
    }

   /**
    * Get Other formats in this file, separated by /.
    * 
    * @return Other formats in this file, separated by /.
    */
    @Nullable
    public final LocalDateTime getOtherFormatListAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.OTHERFORMATLIST);
    }

   /**
    * Get Other formats in this file, separated by /.
    * 
    * @return Other formats in this file, separated by /.
    */
    @Nullable
    public final LocalTime getOtherFormatListAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.OTHERFORMATLIST);
    }

   /**
    * Get Other formats in this file, separated by /.
    * 
    * @return Other formats in this file, separated by /.
    */
    @Nullable
    public final String getOtherFormatListAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.OTHERFORMATLIST);
    }

   /**
    * Get Other formats in this file, separated by /.
    * 
    * @return Other formats in this file, separated by /.
    */
    @Nullable
    public final Boolean getOtherFormatListAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.OTHERFORMATLIST);
    }

   /**
    * Get Other formats in this file, separated by /.
    * 
    * @return Other formats in this file, separated by /.
    */
    @Nullable
    public final BigInteger getOtherFormatListAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.OTHERFORMATLIST);
    }

   /**
    * Get Other formats in this file, separated by /.
    * 
    * @return Other formats in this file, separated by /.
    */
    @Nullable
    public final URL getOtherFormatListAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.OTHERFORMATLIST);
    }

   /**
    * Get Other formats in this file, separated by /.
    * 
    * @return Other formats in this file, separated by /.
    */
    @NonNull
    public final List<@NonNull String> getOtherFormatListAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.OTHERFORMATLIST);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get The person who arranged the piece. e.g. Ravel..
    * 
    * @return The person who arranged the piece. e.g. Ravel..
    */
    @Nullable
    public final Integer getArrangerAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ARRANGER);
    }

   /**
    * Get The person who arranged the piece. e.g. Ravel..
    * 
    * @return The person who arranged the piece. e.g. Ravel..
    */
    @Nullable
    public final Long getArrangerAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ARRANGER);
    }

   /**
    * Get The person who arranged the piece. e.g. Ravel..
    * 
    * @return The person who arranged the piece. e.g. Ravel..
    */
    @Nullable
    public final LocalDateTime getArrangerAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ARRANGER);
    }

   /**
    * Get The person who arranged the piece. e.g. Ravel..
    * 
    * @return The person who arranged the piece. e.g. Ravel..
    */
    @Nullable
    public final LocalTime getArrangerAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ARRANGER);
    }

   /**
    * Get The person who arranged the piece. e.g. Ravel..
    * 
    * @return The person who arranged the piece. e.g. Ravel..
    */
    @Nullable
    public final String getArrangerAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ARRANGER);
    }

   /**
    * Get The person who arranged the piece. e.g. Ravel..
    * 
    * @return The person who arranged the piece. e.g. Ravel..
    */
    @Nullable
    public final Boolean getArrangerAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ARRANGER);
    }

   /**
    * Get The person who arranged the piece. e.g. Ravel..
    * 
    * @return The person who arranged the piece. e.g. Ravel..
    */
    @Nullable
    public final BigInteger getArrangerAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ARRANGER);
    }

   /**
    * Get The person who arranged the piece. e.g. Ravel..
    * 
    * @return The person who arranged the piece. e.g. Ravel..
    */
    @Nullable
    public final URL getArrangerAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ARRANGER);
    }

   /**
    * Get The person who arranged the piece. e.g. Ravel..
    * 
    * @return The person who arranged the piece. e.g. Ravel..
    */
    @NonNull
    public final List<@NonNull String> getArrangerAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ARRANGER);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get The person who oversees the artists and craftspeople who build the sets..
    * 
    * @return The person who oversees the artists and craftspeople who build the sets..
    */
    @Nullable
    public final Integer getArtDirectorAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ARTDIRECTOR);
    }

   /**
    * Get The person who oversees the artists and craftspeople who build the sets..
    * 
    * @return The person who oversees the artists and craftspeople who build the sets..
    */
    @Nullable
    public final Long getArtDirectorAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ARTDIRECTOR);
    }

   /**
    * Get The person who oversees the artists and craftspeople who build the sets..
    * 
    * @return The person who oversees the artists and craftspeople who build the sets..
    */
    @Nullable
    public final LocalDateTime getArtDirectorAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ARTDIRECTOR);
    }

   /**
    * Get The person who oversees the artists and craftspeople who build the sets..
    * 
    * @return The person who oversees the artists and craftspeople who build the sets..
    */
    @Nullable
    public final LocalTime getArtDirectorAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ARTDIRECTOR);
    }

   /**
    * Get The person who oversees the artists and craftspeople who build the sets..
    * 
    * @return The person who oversees the artists and craftspeople who build the sets..
    */
    @Nullable
    public final String getArtDirectorAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ARTDIRECTOR);
    }

   /**
    * Get The person who oversees the artists and craftspeople who build the sets..
    * 
    * @return The person who oversees the artists and craftspeople who build the sets..
    */
    @Nullable
    public final Boolean getArtDirectorAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ARTDIRECTOR);
    }

   /**
    * Get The person who oversees the artists and craftspeople who build the sets..
    * 
    * @return The person who oversees the artists and craftspeople who build the sets..
    */
    @Nullable
    public final BigInteger getArtDirectorAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ARTDIRECTOR);
    }

   /**
    * Get The person who oversees the artists and craftspeople who build the sets..
    * 
    * @return The person who oversees the artists and craftspeople who build the sets..
    */
    @Nullable
    public final URL getArtDirectorAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ARTDIRECTOR);
    }

   /**
    * Get The person who oversees the artists and craftspeople who build the sets..
    * 
    * @return The person who oversees the artists and craftspeople who build the sets..
    */
    @NonNull
    public final List<@NonNull String> getArtDirectorAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ARTDIRECTOR);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Number of the Season.
    * 
    * @return Number of the Season.
    */
    @Nullable
    public final Integer getSeasonPositionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.SEASONPOSITION);
    }

   /**
    * Get Number of the Season.
    * 
    * @return Number of the Season.
    */
    @Nullable
    public final Long getSeasonPositionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.SEASONPOSITION);
    }

   /**
    * Get Number of the Season.
    * 
    * @return Number of the Season.
    */
    @Nullable
    public final LocalDateTime getSeasonPositionAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.SEASONPOSITION);
    }

   /**
    * Get Number of the Season.
    * 
    * @return Number of the Season.
    */
    @Nullable
    public final LocalTime getSeasonPositionAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.SEASONPOSITION);
    }

   /**
    * Get Number of the Season.
    * 
    * @return Number of the Season.
    */
    @Nullable
    public final String getSeasonPositionAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.SEASONPOSITION);
    }

   /**
    * Get Number of the Season.
    * 
    * @return Number of the Season.
    */
    @Nullable
    public final Boolean getSeasonPositionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.SEASONPOSITION);
    }

   /**
    * Get Number of the Season.
    * 
    * @return Number of the Season.
    */
    @Nullable
    public final BigInteger getSeasonPositionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.SEASONPOSITION);
    }

   /**
    * Get Number of the Season.
    * 
    * @return Number of the Season.
    */
    @Nullable
    public final URL getSeasonPositionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.SEASONPOSITION);
    }

   /**
    * Get Number of the Season.
    * 
    * @return Number of the Season.
    */
    @NonNull
    public final List<@NonNull String> getSeasonPositionAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.SEASONPOSITION);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Number of colors requested when digitizing, e.g. 256 for images or 32 bit RGB for video.
    * 
    * @return Number of colors requested when digitizing, e.g. 256 for images or 32 bit RGB for video.
    */
    @Nullable
    public final Integer getOriginalSourceFormNumColorsAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ORIGINALSOURCEFORMNUMCOLORS);
    }

   /**
    * Get Number of colors requested when digitizing, e.g. 256 for images or 32 bit RGB for video.
    * 
    * @return Number of colors requested when digitizing, e.g. 256 for images or 32 bit RGB for video.
    */
    @Nullable
    public final Long getOriginalSourceFormNumColorsAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ORIGINALSOURCEFORMNUMCOLORS);
    }

   /**
    * Get Number of colors requested when digitizing, e.g. 256 for images or 32 bit RGB for video.
    * 
    * @return Number of colors requested when digitizing, e.g. 256 for images or 32 bit RGB for video.
    */
    @Nullable
    public final LocalDateTime getOriginalSourceFormNumColorsAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ORIGINALSOURCEFORMNUMCOLORS);
    }

   /**
    * Get Number of colors requested when digitizing, e.g. 256 for images or 32 bit RGB for video.
    * 
    * @return Number of colors requested when digitizing, e.g. 256 for images or 32 bit RGB for video.
    */
    @Nullable
    public final LocalTime getOriginalSourceFormNumColorsAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ORIGINALSOURCEFORMNUMCOLORS);
    }

   /**
    * Get Number of colors requested when digitizing, e.g. 256 for images or 32 bit RGB for video.
    * 
    * @return Number of colors requested when digitizing, e.g. 256 for images or 32 bit RGB for video.
    */
    @Nullable
    public final String getOriginalSourceFormNumColorsAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ORIGINALSOURCEFORMNUMCOLORS);
    }

   /**
    * Get Number of colors requested when digitizing, e.g. 256 for images or 32 bit RGB for video.
    * 
    * @return Number of colors requested when digitizing, e.g. 256 for images or 32 bit RGB for video.
    */
    @Nullable
    public final Boolean getOriginalSourceFormNumColorsAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ORIGINALSOURCEFORMNUMCOLORS);
    }

   /**
    * Get Number of colors requested when digitizing, e.g. 256 for images or 32 bit RGB for video.
    * 
    * @return Number of colors requested when digitizing, e.g. 256 for images or 32 bit RGB for video.
    */
    @Nullable
    public final BigInteger getOriginalSourceFormNumColorsAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ORIGINALSOURCEFORMNUMCOLORS);
    }

   /**
    * Get Number of colors requested when digitizing, e.g. 256 for images or 32 bit RGB for video.
    * 
    * @return Number of colors requested when digitizing, e.g. 256 for images or 32 bit RGB for video.
    */
    @Nullable
    public final URL getOriginalSourceFormNumColorsAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ORIGINALSOURCEFORMNUMCOLORS);
    }

   /**
    * Get Number of colors requested when digitizing, e.g. 256 for images or 32 bit RGB for video.
    * 
    * @return Number of colors requested when digitizing, e.g. 256 for images or 32 bit RGB for video.
    */
    @NonNull
    public final List<@NonNull String> getOriginalSourceFormNumColorsAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ORIGINALSOURCEFORMNUMCOLORS);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Play time of the stream in ms.
    * 
    * @return Play time of the stream in ms.
    */
    @Nullable
    public final Integer getDurationAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.DURATION);
    }

   /**
    * Get Play time of the stream in ms.
    * 
    * @return Play time of the stream in ms.
    */
    @Nullable
    public final Long getDurationAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.DURATION);
    }

   /**
    * Get Play time of the stream in ms.
    * 
    * @return Play time of the stream in ms.
    */
    @Nullable
    public final LocalDateTime getDurationAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.DURATION);
    }

   /**
    * Get Play time of the stream in ms.
    * 
    * @return Play time of the stream in ms.
    */
    @Nullable
    public final LocalTime getDurationAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.DURATION);
    }

   /**
    * Get Play time of the stream in ms.
    * 
    * @return Play time of the stream in ms.
    */
    @Nullable
    public final String getDurationAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.DURATION);
    }

   /**
    * Get Play time of the stream in ms.
    * 
    * @return Play time of the stream in ms.
    */
    @Nullable
    public final Boolean getDurationAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.DURATION);
    }

   /**
    * Get Play time of the stream in ms.
    * 
    * @return Play time of the stream in ms.
    */
    @Nullable
    public final BigInteger getDurationAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.DURATION);
    }

   /**
    * Get Play time of the stream in ms.
    * 
    * @return Play time of the stream in ms.
    */
    @Nullable
    public final URL getDurationAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.DURATION);
    }

   /**
    * Get Play time of the stream in ms.
    * 
    * @return Play time of the stream in ms.
    */
    @NonNull
    public final List<@NonNull String> getDurationAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.DURATION);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Nationality of the main composer of the item, mostly for classical music..
    * 
    * @return Nationality of the main composer of the item, mostly for classical music..
    */
    @Nullable
    public final Integer getComposerNationalityAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.COMPOSERNATIONALITY);
    }

   /**
    * Get Nationality of the main composer of the item, mostly for classical music..
    * 
    * @return Nationality of the main composer of the item, mostly for classical music..
    */
    @Nullable
    public final Long getComposerNationalityAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.COMPOSERNATIONALITY);
    }

   /**
    * Get Nationality of the main composer of the item, mostly for classical music..
    * 
    * @return Nationality of the main composer of the item, mostly for classical music..
    */
    @Nullable
    public final LocalDateTime getComposerNationalityAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.COMPOSERNATIONALITY);
    }

   /**
    * Get Nationality of the main composer of the item, mostly for classical music..
    * 
    * @return Nationality of the main composer of the item, mostly for classical music..
    */
    @Nullable
    public final LocalTime getComposerNationalityAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.COMPOSERNATIONALITY);
    }

   /**
    * Get Nationality of the main composer of the item, mostly for classical music..
    * 
    * @return Nationality of the main composer of the item, mostly for classical music..
    */
    @Nullable
    public final String getComposerNationalityAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.COMPOSERNATIONALITY);
    }

   /**
    * Get Nationality of the main composer of the item, mostly for classical music..
    * 
    * @return Nationality of the main composer of the item, mostly for classical music..
    */
    @Nullable
    public final Boolean getComposerNationalityAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.COMPOSERNATIONALITY);
    }

   /**
    * Get Nationality of the main composer of the item, mostly for classical music..
    * 
    * @return Nationality of the main composer of the item, mostly for classical music..
    */
    @Nullable
    public final BigInteger getComposerNationalityAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.COMPOSERNATIONALITY);
    }

   /**
    * Get Nationality of the main composer of the item, mostly for classical music..
    * 
    * @return Nationality of the main composer of the item, mostly for classical music..
    */
    @Nullable
    public final URL getComposerNationalityAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.COMPOSERNATIONALITY);
    }

   /**
    * Get Nationality of the main composer of the item, mostly for classical music..
    * 
    * @return Nationality of the main composer of the item, mostly for classical music..
    */
    @NonNull
    public final List<@NonNull String> getComposerNationalityAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.COMPOSERNATIONALITY);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get A hint/popular name for this codec.
    * 
    * @return A hint/popular name for this codec.
    */
    @Nullable
    public final Integer getCodecIDHintAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.CODECIDHINT);
    }

   /**
    * Get A hint/popular name for this codec.
    * 
    * @return A hint/popular name for this codec.
    */
    @Nullable
    public final Long getCodecIDHintAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.CODECIDHINT);
    }

   /**
    * Get A hint/popular name for this codec.
    * 
    * @return A hint/popular name for this codec.
    */
    @Nullable
    public final LocalDateTime getCodecIDHintAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.CODECIDHINT);
    }

   /**
    * Get A hint/popular name for this codec.
    * 
    * @return A hint/popular name for this codec.
    */
    @Nullable
    public final LocalTime getCodecIDHintAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.CODECIDHINT);
    }

   /**
    * Get A hint/popular name for this codec.
    * 
    * @return A hint/popular name for this codec.
    */
    @Nullable
    public final String getCodecIDHintAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.CODECIDHINT);
    }

   /**
    * Get A hint/popular name for this codec.
    * 
    * @return A hint/popular name for this codec.
    */
    @Nullable
    public final Boolean getCodecIDHintAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.CODECIDHINT);
    }

   /**
    * Get A hint/popular name for this codec.
    * 
    * @return A hint/popular name for this codec.
    */
    @Nullable
    public final BigInteger getCodecIDHintAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.CODECIDHINT);
    }

   /**
    * Get A hint/popular name for this codec.
    * 
    * @return A hint/popular name for this codec.
    */
    @Nullable
    public final URL getCodecIDHintAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.CODECIDHINT);
    }

   /**
    * Get A hint/popular name for this codec.
    * 
    * @return A hint/popular name for this codec.
    */
    @NonNull
    public final List<@NonNull String> getCodecIDHintAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.CODECIDHINT);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Service/Url.
    * 
    * @return Service/Url.
    */
    @Nullable
    public final Integer getServiceUrlAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.SERVICEURL);
    }

   /**
    * Get Service/Url.
    * 
    * @return Service/Url.
    */
    @Nullable
    public final Long getServiceUrlAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.SERVICEURL);
    }

   /**
    * Get Service/Url.
    * 
    * @return Service/Url.
    */
    @Nullable
    public final LocalDateTime getServiceUrlAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.SERVICEURL);
    }

   /**
    * Get Service/Url.
    * 
    * @return Service/Url.
    */
    @Nullable
    public final LocalTime getServiceUrlAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.SERVICEURL);
    }

   /**
    * Get Service/Url.
    * 
    * @return Service/Url.
    */
    @Nullable
    public final String getServiceUrlAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.SERVICEURL);
    }

   /**
    * Get Service/Url.
    * 
    * @return Service/Url.
    */
    @Nullable
    public final Boolean getServiceUrlAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.SERVICEURL);
    }

   /**
    * Get Service/Url.
    * 
    * @return Service/Url.
    */
    @Nullable
    public final BigInteger getServiceUrlAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.SERVICEURL);
    }

   /**
    * Get Service/Url.
    * 
    * @return Service/Url.
    */
    @Nullable
    public final URL getServiceUrlAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.SERVICEURL);
    }

   /**
    * Get Service/Url.
    * 
    * @return Service/Url.
    */
    @NonNull
    public final List<@NonNull String> getServiceUrlAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.SERVICEURL);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Name of the person or organisation that encoded/ripped the audio file..
    * 
    * @return Name of the person or organisation that encoded/ripped the audio file..
    */
    @Nullable
    public final Integer getEncodedByAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ENCODEDBY);
    }

   /**
    * Get Name of the person or organisation that encoded/ripped the audio file..
    * 
    * @return Name of the person or organisation that encoded/ripped the audio file..
    */
    @Nullable
    public final Long getEncodedByAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ENCODEDBY);
    }

   /**
    * Get Name of the person or organisation that encoded/ripped the audio file..
    * 
    * @return Name of the person or organisation that encoded/ripped the audio file..
    */
    @Nullable
    public final LocalDateTime getEncodedByAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ENCODEDBY);
    }

   /**
    * Get Name of the person or organisation that encoded/ripped the audio file..
    * 
    * @return Name of the person or organisation that encoded/ripped the audio file..
    */
    @Nullable
    public final LocalTime getEncodedByAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ENCODEDBY);
    }

   /**
    * Get Name of the person or organisation that encoded/ripped the audio file..
    * 
    * @return Name of the person or organisation that encoded/ripped the audio file..
    */
    @Nullable
    public final String getEncodedByAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ENCODEDBY);
    }

   /**
    * Get Name of the person or organisation that encoded/ripped the audio file..
    * 
    * @return Name of the person or organisation that encoded/ripped the audio file..
    */
    @Nullable
    public final Boolean getEncodedByAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ENCODEDBY);
    }

   /**
    * Get Name of the person or organisation that encoded/ripped the audio file..
    * 
    * @return Name of the person or organisation that encoded/ripped the audio file..
    */
    @Nullable
    public final BigInteger getEncodedByAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ENCODEDBY);
    }

   /**
    * Get Name of the person or organisation that encoded/ripped the audio file..
    * 
    * @return Name of the person or organisation that encoded/ripped the audio file..
    */
    @Nullable
    public final URL getEncodedByAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ENCODEDBY);
    }

   /**
    * Get Name of the person or organisation that encoded/ripped the audio file..
    * 
    * @return Name of the person or organisation that encoded/ripped the audio file..
    */
    @NonNull
    public final List<@NonNull String> getEncodedByAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ENCODEDBY);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit.
    */
    @Nullable
    public final Integer getEncodedApplicationAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ENCODEDAPPLICATION);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit.
    */
    @Nullable
    public final Long getEncodedApplicationAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ENCODEDAPPLICATION);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit.
    */
    @Nullable
    public final LocalDateTime getEncodedApplicationAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ENCODEDAPPLICATION);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit.
    */
    @Nullable
    public final LocalTime getEncodedApplicationAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ENCODEDAPPLICATION);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit.
    */
    @Nullable
    public final String getEncodedApplicationAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ENCODEDAPPLICATION);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit.
    */
    @Nullable
    public final Boolean getEncodedApplicationAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ENCODEDAPPLICATION);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit.
    */
    @Nullable
    public final BigInteger getEncodedApplicationAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ENCODEDAPPLICATION);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit.
    */
    @Nullable
    public final URL getEncodedApplicationAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ENCODEDAPPLICATION);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit.
    */
    @NonNull
    public final List<@NonNull String> getEncodedApplicationAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ENCODEDAPPLICATION);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get ServiceName.
    * 
    * @return ServiceName.
    */
    @Nullable
    public final Integer getServiceNameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.SERVICENAME);
    }

   /**
    * Get ServiceName.
    * 
    * @return ServiceName.
    */
    @Nullable
    public final Long getServiceNameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.SERVICENAME);
    }

   /**
    * Get ServiceName.
    * 
    * @return ServiceName.
    */
    @Nullable
    public final LocalDateTime getServiceNameAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.SERVICENAME);
    }

   /**
    * Get ServiceName.
    * 
    * @return ServiceName.
    */
    @Nullable
    public final LocalTime getServiceNameAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.SERVICENAME);
    }

   /**
    * Get ServiceName.
    * 
    * @return ServiceName.
    */
    @Nullable
    public final String getServiceNameAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.SERVICENAME);
    }

   /**
    * Get ServiceName.
    * 
    * @return ServiceName.
    */
    @Nullable
    public final Boolean getServiceNameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.SERVICENAME);
    }

   /**
    * Get ServiceName.
    * 
    * @return ServiceName.
    */
    @Nullable
    public final BigInteger getServiceNameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.SERVICENAME);
    }

   /**
    * Get ServiceName.
    * 
    * @return ServiceName.
    */
    @Nullable
    public final URL getServiceNameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.SERVICENAME);
    }

   /**
    * Get ServiceName.
    * 
    * @return ServiceName.
    */
    @NonNull
    public final List<@NonNull String> getServiceNameAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.SERVICENAME);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get ServiceProvider.
    * 
    * @return ServiceProvider.
    */
    @Nullable
    public final Integer getServiceProviderAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.SERVICEPROVIDER);
    }

   /**
    * Get ServiceProvider.
    * 
    * @return ServiceProvider.
    */
    @Nullable
    public final Long getServiceProviderAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.SERVICEPROVIDER);
    }

   /**
    * Get ServiceProvider.
    * 
    * @return ServiceProvider.
    */
    @Nullable
    public final LocalDateTime getServiceProviderAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.SERVICEPROVIDER);
    }

   /**
    * Get ServiceProvider.
    * 
    * @return ServiceProvider.
    */
    @Nullable
    public final LocalTime getServiceProviderAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.SERVICEPROVIDER);
    }

   /**
    * Get ServiceProvider.
    * 
    * @return ServiceProvider.
    */
    @Nullable
    public final String getServiceProviderAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.SERVICEPROVIDER);
    }

   /**
    * Get ServiceProvider.
    * 
    * @return ServiceProvider.
    */
    @Nullable
    public final Boolean getServiceProviderAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.SERVICEPROVIDER);
    }

   /**
    * Get ServiceProvider.
    * 
    * @return ServiceProvider.
    */
    @Nullable
    public final BigInteger getServiceProviderAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.SERVICEPROVIDER);
    }

   /**
    * Get ServiceProvider.
    * 
    * @return ServiceProvider.
    */
    @Nullable
    public final URL getServiceProviderAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.SERVICEPROVIDER);
    }

   /**
    * Get ServiceProvider.
    * 
    * @return ServiceProvider.
    */
    @NonNull
    public final List<@NonNull String> getServiceProviderAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.SERVICEPROVIDER);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Image languages in this file, separated by /.
    * 
    * @return Image languages in this file, separated by /.
    */
    @Nullable
    public final Integer getImageLanguageListAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.IMAGELANGUAGELIST);
    }

   /**
    * Get Image languages in this file, separated by /.
    * 
    * @return Image languages in this file, separated by /.
    */
    @Nullable
    public final Long getImageLanguageListAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.IMAGELANGUAGELIST);
    }

   /**
    * Get Image languages in this file, separated by /.
    * 
    * @return Image languages in this file, separated by /.
    */
    @Nullable
    public final LocalDateTime getImageLanguageListAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.IMAGELANGUAGELIST);
    }

   /**
    * Get Image languages in this file, separated by /.
    * 
    * @return Image languages in this file, separated by /.
    */
    @Nullable
    public final LocalTime getImageLanguageListAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.IMAGELANGUAGELIST);
    }

   /**
    * Get Image languages in this file, separated by /.
    * 
    * @return Image languages in this file, separated by /.
    */
    @Nullable
    public final String getImageLanguageListAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.IMAGELANGUAGELIST);
    }

   /**
    * Get Image languages in this file, separated by /.
    * 
    * @return Image languages in this file, separated by /.
    */
    @Nullable
    public final Boolean getImageLanguageListAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.IMAGELANGUAGELIST);
    }

   /**
    * Get Image languages in this file, separated by /.
    * 
    * @return Image languages in this file, separated by /.
    */
    @Nullable
    public final BigInteger getImageLanguageListAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.IMAGELANGUAGELIST);
    }

   /**
    * Get Image languages in this file, separated by /.
    * 
    * @return Image languages in this file, separated by /.
    */
    @Nullable
    public final URL getImageLanguageListAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.IMAGELANGUAGELIST);
    }

   /**
    * Get Image languages in this file, separated by /.
    * 
    * @return Image languages in this file, separated by /.
    */
    @NonNull
    public final List<@NonNull String> getImageLanguageListAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.IMAGELANGUAGELIST);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get StreamSize/String2.
    * 
    * @return StreamSize/String2.
    */
    @Nullable
    public final Integer getStreamSizeString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.STREAMSIZESTRING2);
    }

   /**
    * Get StreamSize/String2.
    * 
    * @return StreamSize/String2.
    */
    @Nullable
    public final Long getStreamSizeString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.STREAMSIZESTRING2);
    }

   /**
    * Get StreamSize/String2.
    * 
    * @return StreamSize/String2.
    */
    @Nullable
    public final LocalDateTime getStreamSizeString2AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.STREAMSIZESTRING2);
    }

   /**
    * Get StreamSize/String2.
    * 
    * @return StreamSize/String2.
    */
    @Nullable
    public final LocalTime getStreamSizeString2AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.STREAMSIZESTRING2);
    }

   /**
    * Get StreamSize/String2.
    * 
    * @return StreamSize/String2.
    */
    @Nullable
    public final String getStreamSizeString2AsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.STREAMSIZESTRING2);
    }

   /**
    * Get StreamSize/String2.
    * 
    * @return StreamSize/String2.
    */
    @Nullable
    public final Boolean getStreamSizeString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.STREAMSIZESTRING2);
    }

   /**
    * Get StreamSize/String2.
    * 
    * @return StreamSize/String2.
    */
    @Nullable
    public final BigInteger getStreamSizeString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.STREAMSIZESTRING2);
    }

   /**
    * Get StreamSize/String2.
    * 
    * @return StreamSize/String2.
    */
    @Nullable
    public final URL getStreamSizeString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.STREAMSIZESTRING2);
    }

   /**
    * Get StreamSize/String2.
    * 
    * @return StreamSize/String2.
    */
    @NonNull
    public final List<@NonNull String> getStreamSizeString2AsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.STREAMSIZESTRING2);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get The artist(s) who performed the work. In classical music this would be the conductor, orchestra, soloists..
    * 
    * @return The artist(s) who performed the work. In classical music this would be the conductor, orchestra, soloists..
    */
    @Nullable
    public final Integer getConductorAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.CONDUCTOR);
    }

   /**
    * Get The artist(s) who performed the work. In classical music this would be the conductor, orchestra, soloists..
    * 
    * @return The artist(s) who performed the work. In classical music this would be the conductor, orchestra, soloists..
    */
    @Nullable
    public final Long getConductorAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.CONDUCTOR);
    }

   /**
    * Get The artist(s) who performed the work. In classical music this would be the conductor, orchestra, soloists..
    * 
    * @return The artist(s) who performed the work. In classical music this would be the conductor, orchestra, soloists..
    */
    @Nullable
    public final LocalDateTime getConductorAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.CONDUCTOR);
    }

   /**
    * Get The artist(s) who performed the work. In classical music this would be the conductor, orchestra, soloists..
    * 
    * @return The artist(s) who performed the work. In classical music this would be the conductor, orchestra, soloists..
    */
    @Nullable
    public final LocalTime getConductorAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.CONDUCTOR);
    }

   /**
    * Get The artist(s) who performed the work. In classical music this would be the conductor, orchestra, soloists..
    * 
    * @return The artist(s) who performed the work. In classical music this would be the conductor, orchestra, soloists..
    */
    @Nullable
    public final String getConductorAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.CONDUCTOR);
    }

   /**
    * Get The artist(s) who performed the work. In classical music this would be the conductor, orchestra, soloists..
    * 
    * @return The artist(s) who performed the work. In classical music this would be the conductor, orchestra, soloists..
    */
    @Nullable
    public final Boolean getConductorAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.CONDUCTOR);
    }

   /**
    * Get The artist(s) who performed the work. In classical music this would be the conductor, orchestra, soloists..
    * 
    * @return The artist(s) who performed the work. In classical music this would be the conductor, orchestra, soloists..
    */
    @Nullable
    public final BigInteger getConductorAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.CONDUCTOR);
    }

   /**
    * Get The artist(s) who performed the work. In classical music this would be the conductor, orchestra, soloists..
    * 
    * @return The artist(s) who performed the work. In classical music this would be the conductor, orchestra, soloists..
    */
    @Nullable
    public final URL getConductorAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.CONDUCTOR);
    }

   /**
    * Get The artist(s) who performed the work. In classical music this would be the conductor, orchestra, soloists..
    * 
    * @return The artist(s) who performed the work. In classical music this would be the conductor, orchestra, soloists..
    */
    @NonNull
    public final List<@NonNull String> getConductorAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.CONDUCTOR);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get The time that the file was created on the file system.
    * 
    * @return The time that the file was created on the file system.
    */
    @Nullable
    public final Integer getFileCreatedDateAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.FILECREATEDDATE);
    }

   /**
    * Get The time that the file was created on the file system.
    * 
    * @return The time that the file was created on the file system.
    */
    @Nullable
    public final Long getFileCreatedDateAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.FILECREATEDDATE);
    }

   /**
    * Get The time that the file was created on the file system.
    * 
    * @return The time that the file was created on the file system.
    */
    @Nullable
    public final LocalDateTime getFileCreatedDateAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.FILECREATEDDATE);
    }

   /**
    * Get The time that the file was created on the file system.
    * 
    * @return The time that the file was created on the file system.
    */
    @Nullable
    public final LocalTime getFileCreatedDateAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.FILECREATEDDATE);
    }

   /**
    * Get The time that the file was created on the file system.
    * 
    * @return The time that the file was created on the file system.
    */
    @Nullable
    public final String getFileCreatedDateAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.FILECREATEDDATE);
    }

   /**
    * Get The time that the file was created on the file system.
    * 
    * @return The time that the file was created on the file system.
    */
    @Nullable
    public final Boolean getFileCreatedDateAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.FILECREATEDDATE);
    }

   /**
    * Get The time that the file was created on the file system.
    * 
    * @return The time that the file was created on the file system.
    */
    @Nullable
    public final BigInteger getFileCreatedDateAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.FILECREATEDDATE);
    }

   /**
    * Get The time that the file was created on the file system.
    * 
    * @return The time that the file was created on the file system.
    */
    @Nullable
    public final URL getFileCreatedDateAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.FILECREATEDDATE);
    }

   /**
    * Get The time that the file was created on the file system.
    * 
    * @return The time that the file was created on the file system.
    */
    @NonNull
    public final List<@NonNull String> getFileCreatedDateAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.FILECREATEDDATE);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Location, where an item is archived, e.eg. Louvre,Paris,France.
    * 
    * @return Location, where an item is archived, e.eg. Louvre,Paris,France.
    */
    @Nullable
    public final Integer getArchivalLocationAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ARCHIVALLOCATION);
    }

   /**
    * Get Location, where an item is archived, e.eg. Louvre,Paris,France.
    * 
    * @return Location, where an item is archived, e.eg. Louvre,Paris,France.
    */
    @Nullable
    public final Long getArchivalLocationAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ARCHIVALLOCATION);
    }

   /**
    * Get Location, where an item is archived, e.eg. Louvre,Paris,France.
    * 
    * @return Location, where an item is archived, e.eg. Louvre,Paris,France.
    */
    @Nullable
    public final LocalDateTime getArchivalLocationAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ARCHIVALLOCATION);
    }

   /**
    * Get Location, where an item is archived, e.eg. Louvre,Paris,France.
    * 
    * @return Location, where an item is archived, e.eg. Louvre,Paris,France.
    */
    @Nullable
    public final LocalTime getArchivalLocationAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ARCHIVALLOCATION);
    }

   /**
    * Get Location, where an item is archived, e.eg. Louvre,Paris,France.
    * 
    * @return Location, where an item is archived, e.eg. Louvre,Paris,France.
    */
    @Nullable
    public final String getArchivalLocationAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ARCHIVALLOCATION);
    }

   /**
    * Get Location, where an item is archived, e.eg. Louvre,Paris,France.
    * 
    * @return Location, where an item is archived, e.eg. Louvre,Paris,France.
    */
    @Nullable
    public final Boolean getArchivalLocationAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ARCHIVALLOCATION);
    }

   /**
    * Get Location, where an item is archived, e.eg. Louvre,Paris,France.
    * 
    * @return Location, where an item is archived, e.eg. Louvre,Paris,France.
    */
    @Nullable
    public final BigInteger getArchivalLocationAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ARCHIVALLOCATION);
    }

   /**
    * Get Location, where an item is archived, e.eg. Louvre,Paris,France.
    * 
    * @return Location, where an item is archived, e.eg. Louvre,Paris,France.
    */
    @Nullable
    public final URL getArchivalLocationAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ARCHIVALLOCATION);
    }

   /**
    * Get Location, where an item is archived, e.eg. Louvre,Paris,France.
    * 
    * @return Location, where an item is archived, e.eg. Louvre,Paris,France.
    */
    @NonNull
    public final List<@NonNull String> getArchivalLocationAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ARCHIVALLOCATION);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get ServiceProviderr/Url.
    * 
    * @return ServiceProviderr/Url.
    */
    @Nullable
    public final Integer getServiceProviderrUrlAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.SERVICEPROVIDERRURL);
    }

   /**
    * Get ServiceProviderr/Url.
    * 
    * @return ServiceProviderr/Url.
    */
    @Nullable
    public final Long getServiceProviderrUrlAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.SERVICEPROVIDERRURL);
    }

   /**
    * Get ServiceProviderr/Url.
    * 
    * @return ServiceProviderr/Url.
    */
    @Nullable
    public final LocalDateTime getServiceProviderrUrlAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.SERVICEPROVIDERRURL);
    }

   /**
    * Get ServiceProviderr/Url.
    * 
    * @return ServiceProviderr/Url.
    */
    @Nullable
    public final LocalTime getServiceProviderrUrlAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.SERVICEPROVIDERRURL);
    }

   /**
    * Get ServiceProviderr/Url.
    * 
    * @return ServiceProviderr/Url.
    */
    @Nullable
    public final String getServiceProviderrUrlAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.SERVICEPROVIDERRURL);
    }

   /**
    * Get ServiceProviderr/Url.
    * 
    * @return ServiceProviderr/Url.
    */
    @Nullable
    public final Boolean getServiceProviderrUrlAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.SERVICEPROVIDERRURL);
    }

   /**
    * Get ServiceProviderr/Url.
    * 
    * @return ServiceProviderr/Url.
    */
    @Nullable
    public final BigInteger getServiceProviderrUrlAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.SERVICEPROVIDERRURL);
    }

   /**
    * Get ServiceProviderr/Url.
    * 
    * @return ServiceProviderr/Url.
    */
    @Nullable
    public final URL getServiceProviderrUrlAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.SERVICEPROVIDERRURL);
    }

   /**
    * Get ServiceProviderr/Url.
    * 
    * @return ServiceProviderr/Url.
    */
    @NonNull
    public final List<@NonNull String> getServiceProviderrUrlAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.SERVICEPROVIDERRURL);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get StreamSize/String1.
    * 
    * @return StreamSize/String1.
    */
    @Nullable
    public final Integer getStreamSizeString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.STREAMSIZESTRING1);
    }

   /**
    * Get StreamSize/String1.
    * 
    * @return StreamSize/String1.
    */
    @Nullable
    public final Long getStreamSizeString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.STREAMSIZESTRING1);
    }

   /**
    * Get StreamSize/String1.
    * 
    * @return StreamSize/String1.
    */
    @Nullable
    public final LocalDateTime getStreamSizeString1AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.STREAMSIZESTRING1);
    }

   /**
    * Get StreamSize/String1.
    * 
    * @return StreamSize/String1.
    */
    @Nullable
    public final LocalTime getStreamSizeString1AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.STREAMSIZESTRING1);
    }

   /**
    * Get StreamSize/String1.
    * 
    * @return StreamSize/String1.
    */
    @Nullable
    public final String getStreamSizeString1AsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.STREAMSIZESTRING1);
    }

   /**
    * Get StreamSize/String1.
    * 
    * @return StreamSize/String1.
    */
    @Nullable
    public final Boolean getStreamSizeString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.STREAMSIZESTRING1);
    }

   /**
    * Get StreamSize/String1.
    * 
    * @return StreamSize/String1.
    */
    @Nullable
    public final BigInteger getStreamSizeString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.STREAMSIZESTRING1);
    }

   /**
    * Get StreamSize/String1.
    * 
    * @return StreamSize/String1.
    */
    @Nullable
    public final URL getStreamSizeString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.STREAMSIZESTRING1);
    }

   /**
    * Get StreamSize/String1.
    * 
    * @return StreamSize/String1.
    */
    @NonNull
    public final List<@NonNull String> getStreamSizeString1AsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.STREAMSIZESTRING1);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get StreamSize/String4.
    * 
    * @return StreamSize/String4.
    */
    @Nullable
    public final Integer getStreamSizeString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.STREAMSIZESTRING4);
    }

   /**
    * Get StreamSize/String4.
    * 
    * @return StreamSize/String4.
    */
    @Nullable
    public final Long getStreamSizeString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.STREAMSIZESTRING4);
    }

   /**
    * Get StreamSize/String4.
    * 
    * @return StreamSize/String4.
    */
    @Nullable
    public final LocalDateTime getStreamSizeString4AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.STREAMSIZESTRING4);
    }

   /**
    * Get StreamSize/String4.
    * 
    * @return StreamSize/String4.
    */
    @Nullable
    public final LocalTime getStreamSizeString4AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.STREAMSIZESTRING4);
    }

   /**
    * Get StreamSize/String4.
    * 
    * @return StreamSize/String4.
    */
    @Nullable
    public final String getStreamSizeString4AsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.STREAMSIZESTRING4);
    }

   /**
    * Get StreamSize/String4.
    * 
    * @return StreamSize/String4.
    */
    @Nullable
    public final Boolean getStreamSizeString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.STREAMSIZESTRING4);
    }

   /**
    * Get StreamSize/String4.
    * 
    * @return StreamSize/String4.
    */
    @Nullable
    public final BigInteger getStreamSizeString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.STREAMSIZESTRING4);
    }

   /**
    * Get StreamSize/String4.
    * 
    * @return StreamSize/String4.
    */
    @Nullable
    public final URL getStreamSizeString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.STREAMSIZESTRING4);
    }

   /**
    * Get StreamSize/String4.
    * 
    * @return StreamSize/String4.
    */
    @NonNull
    public final List<@NonNull String> getStreamSizeString4AsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.STREAMSIZESTRING4);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Univers movies belong to, e.g. Starwars, Stargate, Buffy, Dragonballs.
    * 
    * @return Univers movies belong to, e.g. Starwars, Stargate, Buffy, Dragonballs.
    */
    @Nullable
    public final Integer getDomainAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.DOMAIN);
    }

   /**
    * Get Univers movies belong to, e.g. Starwars, Stargate, Buffy, Dragonballs.
    * 
    * @return Univers movies belong to, e.g. Starwars, Stargate, Buffy, Dragonballs.
    */
    @Nullable
    public final Long getDomainAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.DOMAIN);
    }

   /**
    * Get Univers movies belong to, e.g. Starwars, Stargate, Buffy, Dragonballs.
    * 
    * @return Univers movies belong to, e.g. Starwars, Stargate, Buffy, Dragonballs.
    */
    @Nullable
    public final LocalDateTime getDomainAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.DOMAIN);
    }

   /**
    * Get Univers movies belong to, e.g. Starwars, Stargate, Buffy, Dragonballs.
    * 
    * @return Univers movies belong to, e.g. Starwars, Stargate, Buffy, Dragonballs.
    */
    @Nullable
    public final LocalTime getDomainAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.DOMAIN);
    }

   /**
    * Get Univers movies belong to, e.g. Starwars, Stargate, Buffy, Dragonballs.
    * 
    * @return Univers movies belong to, e.g. Starwars, Stargate, Buffy, Dragonballs.
    */
    @Nullable
    public final String getDomainAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.DOMAIN);
    }

   /**
    * Get Univers movies belong to, e.g. Starwars, Stargate, Buffy, Dragonballs.
    * 
    * @return Univers movies belong to, e.g. Starwars, Stargate, Buffy, Dragonballs.
    */
    @Nullable
    public final Boolean getDomainAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.DOMAIN);
    }

   /**
    * Get Univers movies belong to, e.g. Starwars, Stargate, Buffy, Dragonballs.
    * 
    * @return Univers movies belong to, e.g. Starwars, Stargate, Buffy, Dragonballs.
    */
    @Nullable
    public final BigInteger getDomainAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.DOMAIN);
    }

   /**
    * Get Univers movies belong to, e.g. Starwars, Stargate, Buffy, Dragonballs.
    * 
    * @return Univers movies belong to, e.g. Starwars, Stargate, Buffy, Dragonballs.
    */
    @Nullable
    public final URL getDomainAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.DOMAIN);
    }

   /**
    * Get Univers movies belong to, e.g. Starwars, Stargate, Buffy, Dragonballs.
    * 
    * @return Univers movies belong to, e.g. Starwars, Stargate, Buffy, Dragonballs.
    */
    @NonNull
    public final List<@NonNull String> getDomainAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.DOMAIN);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Homepage of the performer/artist.
    * 
    * @return Homepage of the performer/artist.
    */
    @Nullable
    public final Integer getPerformerUrlAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.PERFORMERURL);
    }

   /**
    * Get Homepage of the performer/artist.
    * 
    * @return Homepage of the performer/artist.
    */
    @Nullable
    public final Long getPerformerUrlAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.PERFORMERURL);
    }

   /**
    * Get Homepage of the performer/artist.
    * 
    * @return Homepage of the performer/artist.
    */
    @Nullable
    public final LocalDateTime getPerformerUrlAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.PERFORMERURL);
    }

   /**
    * Get Homepage of the performer/artist.
    * 
    * @return Homepage of the performer/artist.
    */
    @Nullable
    public final LocalTime getPerformerUrlAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.PERFORMERURL);
    }

   /**
    * Get Homepage of the performer/artist.
    * 
    * @return Homepage of the performer/artist.
    */
    @Nullable
    public final String getPerformerUrlAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.PERFORMERURL);
    }

   /**
    * Get Homepage of the performer/artist.
    * 
    * @return Homepage of the performer/artist.
    */
    @Nullable
    public final Boolean getPerformerUrlAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.PERFORMERURL);
    }

   /**
    * Get Homepage of the performer/artist.
    * 
    * @return Homepage of the performer/artist.
    */
    @Nullable
    public final BigInteger getPerformerUrlAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.PERFORMERURL);
    }

   /**
    * Get Homepage of the performer/artist.
    * 
    * @return Homepage of the performer/artist.
    */
    @Nullable
    public final URL getPerformerUrlAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.PERFORMERURL);
    }

   /**
    * Get Homepage of the performer/artist.
    * 
    * @return Homepage of the performer/artist.
    */
    @NonNull
    public final List<@NonNull String> getPerformerUrlAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.PERFORMERURL);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Minimum Bit rate in bps.
    * 
    * @return Minimum Bit rate in bps.
    */
    @Nullable
    public final Integer getOverallBitRateMinimumAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.OVERALLBITRATEMINIMUM);
    }

   /**
    * Get Minimum Bit rate in bps.
    * 
    * @return Minimum Bit rate in bps.
    */
    @Nullable
    public final Long getOverallBitRateMinimumAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.OVERALLBITRATEMINIMUM);
    }

   /**
    * Get Minimum Bit rate in bps.
    * 
    * @return Minimum Bit rate in bps.
    */
    @Nullable
    public final LocalDateTime getOverallBitRateMinimumAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.OVERALLBITRATEMINIMUM);
    }

   /**
    * Get Minimum Bit rate in bps.
    * 
    * @return Minimum Bit rate in bps.
    */
    @Nullable
    public final LocalTime getOverallBitRateMinimumAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.OVERALLBITRATEMINIMUM);
    }

   /**
    * Get Minimum Bit rate in bps.
    * 
    * @return Minimum Bit rate in bps.
    */
    @Nullable
    public final String getOverallBitRateMinimumAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.OVERALLBITRATEMINIMUM);
    }

   /**
    * Get Minimum Bit rate in bps.
    * 
    * @return Minimum Bit rate in bps.
    */
    @Nullable
    public final Boolean getOverallBitRateMinimumAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.OVERALLBITRATEMINIMUM);
    }

   /**
    * Get Minimum Bit rate in bps.
    * 
    * @return Minimum Bit rate in bps.
    */
    @Nullable
    public final BigInteger getOverallBitRateMinimumAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.OVERALLBITRATEMINIMUM);
    }

   /**
    * Get Minimum Bit rate in bps.
    * 
    * @return Minimum Bit rate in bps.
    */
    @Nullable
    public final URL getOverallBitRateMinimumAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.OVERALLBITRATEMINIMUM);
    }

   /**
    * Get Minimum Bit rate in bps.
    * 
    * @return Minimum Bit rate in bps.
    */
    @NonNull
    public final List<@NonNull String> getOverallBitRateMinimumAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.OVERALLBITRATEMINIMUM);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get StreamSize/String3.
    * 
    * @return StreamSize/String3.
    */
    @Nullable
    public final Integer getStreamSizeString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.STREAMSIZESTRING3);
    }

   /**
    * Get StreamSize/String3.
    * 
    * @return StreamSize/String3.
    */
    @Nullable
    public final Long getStreamSizeString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.STREAMSIZESTRING3);
    }

   /**
    * Get StreamSize/String3.
    * 
    * @return StreamSize/String3.
    */
    @Nullable
    public final LocalDateTime getStreamSizeString3AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.STREAMSIZESTRING3);
    }

   /**
    * Get StreamSize/String3.
    * 
    * @return StreamSize/String3.
    */
    @Nullable
    public final LocalTime getStreamSizeString3AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.STREAMSIZESTRING3);
    }

   /**
    * Get StreamSize/String3.
    * 
    * @return StreamSize/String3.
    */
    @Nullable
    public final String getStreamSizeString3AsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.STREAMSIZESTRING3);
    }

   /**
    * Get StreamSize/String3.
    * 
    * @return StreamSize/String3.
    */
    @Nullable
    public final Boolean getStreamSizeString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.STREAMSIZESTRING3);
    }

   /**
    * Get StreamSize/String3.
    * 
    * @return StreamSize/String3.
    */
    @Nullable
    public final BigInteger getStreamSizeString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.STREAMSIZESTRING3);
    }

   /**
    * Get StreamSize/String3.
    * 
    * @return StreamSize/String3.
    */
    @Nullable
    public final URL getStreamSizeString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.STREAMSIZESTRING3);
    }

   /**
    * Get StreamSize/String3.
    * 
    * @return StreamSize/String3.
    */
    @NonNull
    public final List<@NonNull String> getStreamSizeString3AsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.STREAMSIZESTRING3);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Publishers official webpage..
    * 
    * @return Publishers official webpage..
    */
    @Nullable
    public final Integer getPublisherURLAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.PUBLISHERURL);
    }

   /**
    * Get Publishers official webpage..
    * 
    * @return Publishers official webpage..
    */
    @Nullable
    public final Long getPublisherURLAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.PUBLISHERURL);
    }

   /**
    * Get Publishers official webpage..
    * 
    * @return Publishers official webpage..
    */
    @Nullable
    public final LocalDateTime getPublisherURLAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.PUBLISHERURL);
    }

   /**
    * Get Publishers official webpage..
    * 
    * @return Publishers official webpage..
    */
    @Nullable
    public final LocalTime getPublisherURLAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.PUBLISHERURL);
    }

   /**
    * Get Publishers official webpage..
    * 
    * @return Publishers official webpage..
    */
    @Nullable
    public final String getPublisherURLAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.PUBLISHERURL);
    }

   /**
    * Get Publishers official webpage..
    * 
    * @return Publishers official webpage..
    */
    @Nullable
    public final Boolean getPublisherURLAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.PUBLISHERURL);
    }

   /**
    * Get Publishers official webpage..
    * 
    * @return Publishers official webpage..
    */
    @Nullable
    public final BigInteger getPublisherURLAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.PUBLISHERURL);
    }

   /**
    * Get Publishers official webpage..
    * 
    * @return Publishers official webpage..
    */
    @Nullable
    public final URL getPublisherURLAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.PUBLISHERURL);
    }

   /**
    * Get Publishers official webpage..
    * 
    * @return Publishers official webpage..
    */
    @NonNull
    public final List<@NonNull String> getPublisherURLAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.PUBLISHERURL);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get With proportion.
    * 
    * @return With proportion.
    */
    @Nullable
    public final Integer getStreamSizeString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.STREAMSIZESTRING5);
    }

   /**
    * Get With proportion.
    * 
    * @return With proportion.
    */
    @Nullable
    public final Long getStreamSizeString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.STREAMSIZESTRING5);
    }

   /**
    * Get With proportion.
    * 
    * @return With proportion.
    */
    @Nullable
    public final LocalDateTime getStreamSizeString5AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.STREAMSIZESTRING5);
    }

   /**
    * Get With proportion.
    * 
    * @return With proportion.
    */
    @Nullable
    public final LocalTime getStreamSizeString5AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.STREAMSIZESTRING5);
    }

   /**
    * Get With proportion.
    * 
    * @return With proportion.
    */
    @Nullable
    public final String getStreamSizeString5AsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.STREAMSIZESTRING5);
    }

   /**
    * Get With proportion.
    * 
    * @return With proportion.
    */
    @Nullable
    public final Boolean getStreamSizeString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.STREAMSIZESTRING5);
    }

   /**
    * Get With proportion.
    * 
    * @return With proportion.
    */
    @Nullable
    public final BigInteger getStreamSizeString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.STREAMSIZESTRING5);
    }

   /**
    * Get With proportion.
    * 
    * @return With proportion.
    */
    @Nullable
    public final URL getStreamSizeString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.STREAMSIZESTRING5);
    }

   /**
    * Get With proportion.
    * 
    * @return With proportion.
    */
    @NonNull
    public final List<@NonNull String> getStreamSizeString5AsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.STREAMSIZESTRING5);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final Integer getStreamKindAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.STREAMKIND);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final Long getStreamKindAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.STREAMKIND);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final LocalDateTime getStreamKindAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.STREAMKIND);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final LocalTime getStreamKindAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.STREAMKIND);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final String getStreamKindAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.STREAMKIND);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final Boolean getStreamKindAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.STREAMKIND);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final BigInteger getStreamKindAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.STREAMKIND);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final URL getStreamKindAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.STREAMKIND);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @NonNull
    public final List<@NonNull String> getStreamKindAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.STREAMKIND);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Keywords to the item separated by a comma, used for searching..
    * 
    * @return Keywords to the item separated by a comma, used for searching..
    */
    @Nullable
    public final Integer getKeywordsAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.KEYWORDS);
    }

   /**
    * Get Keywords to the item separated by a comma, used for searching..
    * 
    * @return Keywords to the item separated by a comma, used for searching..
    */
    @Nullable
    public final Long getKeywordsAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.KEYWORDS);
    }

   /**
    * Get Keywords to the item separated by a comma, used for searching..
    * 
    * @return Keywords to the item separated by a comma, used for searching..
    */
    @Nullable
    public final LocalDateTime getKeywordsAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.KEYWORDS);
    }

   /**
    * Get Keywords to the item separated by a comma, used for searching..
    * 
    * @return Keywords to the item separated by a comma, used for searching..
    */
    @Nullable
    public final LocalTime getKeywordsAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.KEYWORDS);
    }

   /**
    * Get Keywords to the item separated by a comma, used for searching..
    * 
    * @return Keywords to the item separated by a comma, used for searching..
    */
    @Nullable
    public final String getKeywordsAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.KEYWORDS);
    }

   /**
    * Get Keywords to the item separated by a comma, used for searching..
    * 
    * @return Keywords to the item separated by a comma, used for searching..
    */
    @Nullable
    public final Boolean getKeywordsAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.KEYWORDS);
    }

   /**
    * Get Keywords to the item separated by a comma, used for searching..
    * 
    * @return Keywords to the item separated by a comma, used for searching..
    */
    @Nullable
    public final BigInteger getKeywordsAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.KEYWORDS);
    }

   /**
    * Get Keywords to the item separated by a comma, used for searching..
    * 
    * @return Keywords to the item separated by a comma, used for searching..
    */
    @Nullable
    public final URL getKeywordsAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.KEYWORDS);
    }

   /**
    * Get Keywords to the item separated by a comma, used for searching..
    * 
    * @return Keywords to the item separated by a comma, used for searching..
    */
    @NonNull
    public final List<@NonNull String> getKeywordsAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.KEYWORDS);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get A numeric value defining how much a person likes the song/movie. The number is between 0 and 5 with decimal values possible (e.g. 2.7), 5(.0) being the highest possible rating..
    * 
    * @return A numeric value defining how much a person likes the song/movie. The number is between 0 and 5 with decimal values possible (e.g. 2.7), 5(.0) being the highest possible rating..
    */
    @Nullable
    public final Integer getRatingAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.RATING);
    }

   /**
    * Get A numeric value defining how much a person likes the song/movie. The number is between 0 and 5 with decimal values possible (e.g. 2.7), 5(.0) being the highest possible rating..
    * 
    * @return A numeric value defining how much a person likes the song/movie. The number is between 0 and 5 with decimal values possible (e.g. 2.7), 5(.0) being the highest possible rating..
    */
    @Nullable
    public final Long getRatingAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.RATING);
    }

   /**
    * Get A numeric value defining how much a person likes the song/movie. The number is between 0 and 5 with decimal values possible (e.g. 2.7), 5(.0) being the highest possible rating..
    * 
    * @return A numeric value defining how much a person likes the song/movie. The number is between 0 and 5 with decimal values possible (e.g. 2.7), 5(.0) being the highest possible rating..
    */
    @Nullable
    public final LocalDateTime getRatingAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.RATING);
    }

   /**
    * Get A numeric value defining how much a person likes the song/movie. The number is between 0 and 5 with decimal values possible (e.g. 2.7), 5(.0) being the highest possible rating..
    * 
    * @return A numeric value defining how much a person likes the song/movie. The number is between 0 and 5 with decimal values possible (e.g. 2.7), 5(.0) being the highest possible rating..
    */
    @Nullable
    public final LocalTime getRatingAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.RATING);
    }

   /**
    * Get A numeric value defining how much a person likes the song/movie. The number is between 0 and 5 with decimal values possible (e.g. 2.7), 5(.0) being the highest possible rating..
    * 
    * @return A numeric value defining how much a person likes the song/movie. The number is between 0 and 5 with decimal values possible (e.g. 2.7), 5(.0) being the highest possible rating..
    */
    @Nullable
    public final String getRatingAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.RATING);
    }

   /**
    * Get A numeric value defining how much a person likes the song/movie. The number is between 0 and 5 with decimal values possible (e.g. 2.7), 5(.0) being the highest possible rating..
    * 
    * @return A numeric value defining how much a person likes the song/movie. The number is between 0 and 5 with decimal values possible (e.g. 2.7), 5(.0) being the highest possible rating..
    */
    @Nullable
    public final Boolean getRatingAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.RATING);
    }

   /**
    * Get A numeric value defining how much a person likes the song/movie. The number is between 0 and 5 with decimal values possible (e.g. 2.7), 5(.0) being the highest possible rating..
    * 
    * @return A numeric value defining how much a person likes the song/movie. The number is between 0 and 5 with decimal values possible (e.g. 2.7), 5(.0) being the highest possible rating..
    */
    @Nullable
    public final BigInteger getRatingAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.RATING);
    }

   /**
    * Get A numeric value defining how much a person likes the song/movie. The number is between 0 and 5 with decimal values possible (e.g. 2.7), 5(.0) being the highest possible rating..
    * 
    * @return A numeric value defining how much a person likes the song/movie. The number is between 0 and 5 with decimal values possible (e.g. 2.7), 5(.0) being the highest possible rating..
    */
    @Nullable
    public final URL getRatingAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.RATING);
    }

   /**
    * Get A numeric value defining how much a person likes the song/movie. The number is between 0 and 5 with decimal values possible (e.g. 2.7), 5(.0) being the highest possible rating..
    * 
    * @return A numeric value defining how much a person likes the song/movie. The number is between 0 and 5 with decimal values possible (e.g. 2.7), 5(.0) being the highest possible rating..
    */
    @NonNull
    public final List<@NonNull String> getRatingAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.RATING);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Maximum Bit rate (with measurement).
    * 
    * @return Maximum Bit rate (with measurement).
    */
    @Nullable
    public final Integer getOverallBitRateMaximumStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.OVERALLBITRATEMAXIMUMSTRING);
    }

   /**
    * Get Maximum Bit rate (with measurement).
    * 
    * @return Maximum Bit rate (with measurement).
    */
    @Nullable
    public final Long getOverallBitRateMaximumStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.OVERALLBITRATEMAXIMUMSTRING);
    }

   /**
    * Get Maximum Bit rate (with measurement).
    * 
    * @return Maximum Bit rate (with measurement).
    */
    @Nullable
    public final LocalDateTime getOverallBitRateMaximumStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.OVERALLBITRATEMAXIMUMSTRING);
    }

   /**
    * Get Maximum Bit rate (with measurement).
    * 
    * @return Maximum Bit rate (with measurement).
    */
    @Nullable
    public final LocalTime getOverallBitRateMaximumStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.OVERALLBITRATEMAXIMUMSTRING);
    }

   /**
    * Get Maximum Bit rate (with measurement).
    * 
    * @return Maximum Bit rate (with measurement).
    */
    @Nullable
    public final String getOverallBitRateMaximumStringAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.OVERALLBITRATEMAXIMUMSTRING);
    }

   /**
    * Get Maximum Bit rate (with measurement).
    * 
    * @return Maximum Bit rate (with measurement).
    */
    @Nullable
    public final Boolean getOverallBitRateMaximumStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.OVERALLBITRATEMAXIMUMSTRING);
    }

   /**
    * Get Maximum Bit rate (with measurement).
    * 
    * @return Maximum Bit rate (with measurement).
    */
    @Nullable
    public final BigInteger getOverallBitRateMaximumStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.OVERALLBITRATEMAXIMUMSTRING);
    }

   /**
    * Get Maximum Bit rate (with measurement).
    * 
    * @return Maximum Bit rate (with measurement).
    */
    @Nullable
    public final URL getOverallBitRateMaximumStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.OVERALLBITRATEMAXIMUMSTRING);
    }

   /**
    * Get Maximum Bit rate (with measurement).
    * 
    * @return Maximum Bit rate (with measurement).
    */
    @NonNull
    public final List<@NonNull String> getOverallBitRateMaximumStringAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.OVERALLBITRATEMAXIMUMSTRING);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get The date/year that the item was originaly released..
    * 
    * @return The date/year that the item was originaly released..
    */
    @Nullable
    public final Integer getOriginalReleasedDateAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ORIGINALRELEASEDDATE);
    }

   /**
    * Get The date/year that the item was originaly released..
    * 
    * @return The date/year that the item was originaly released..
    */
    @Nullable
    public final Long getOriginalReleasedDateAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ORIGINALRELEASEDDATE);
    }

   /**
    * Get The date/year that the item was originaly released..
    * 
    * @return The date/year that the item was originaly released..
    */
    @Nullable
    public final LocalDateTime getOriginalReleasedDateAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ORIGINALRELEASEDDATE);
    }

   /**
    * Get The date/year that the item was originaly released..
    * 
    * @return The date/year that the item was originaly released..
    */
    @Nullable
    public final LocalTime getOriginalReleasedDateAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ORIGINALRELEASEDDATE);
    }

   /**
    * Get The date/year that the item was originaly released..
    * 
    * @return The date/year that the item was originaly released..
    */
    @Nullable
    public final String getOriginalReleasedDateAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ORIGINALRELEASEDDATE);
    }

   /**
    * Get The date/year that the item was originaly released..
    * 
    * @return The date/year that the item was originaly released..
    */
    @Nullable
    public final Boolean getOriginalReleasedDateAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ORIGINALRELEASEDDATE);
    }

   /**
    * Get The date/year that the item was originaly released..
    * 
    * @return The date/year that the item was originaly released..
    */
    @Nullable
    public final BigInteger getOriginalReleasedDateAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ORIGINALRELEASEDDATE);
    }

   /**
    * Get The date/year that the item was originaly released..
    * 
    * @return The date/year that the item was originaly released..
    */
    @Nullable
    public final URL getOriginalReleasedDateAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ORIGINALRELEASEDDATE);
    }

   /**
    * Get The date/year that the item was originaly released..
    * 
    * @return The date/year that the item was originaly released..
    */
    @NonNull
    public final List<@NonNull String> getOriginalReleasedDateAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ORIGINALRELEASEDDATE);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final Integer getCodecIDAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.CODECID);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final Long getCodecIDAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.CODECID);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final LocalDateTime getCodecIDAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.CODECID);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final LocalTime getCodecIDAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.CODECID);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final String getCodecIDAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.CODECID);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final Boolean getCodecIDAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.CODECID);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final BigInteger getCodecIDAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.CODECID);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final URL getCodecIDAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.CODECID);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @NonNull
    public final List<@NonNull String> getCodecIDAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.CODECID);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Album/Sort.
    * 
    * @return Album/Sort.
    */
    @Nullable
    public final Integer getAlbumSortAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ALBUMSORT);
    }

   /**
    * Get Album/Sort.
    * 
    * @return Album/Sort.
    */
    @Nullable
    public final Long getAlbumSortAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ALBUMSORT);
    }

   /**
    * Get Album/Sort.
    * 
    * @return Album/Sort.
    */
    @Nullable
    public final LocalDateTime getAlbumSortAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ALBUMSORT);
    }

   /**
    * Get Album/Sort.
    * 
    * @return Album/Sort.
    */
    @Nullable
    public final LocalTime getAlbumSortAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ALBUMSORT);
    }

   /**
    * Get Album/Sort.
    * 
    * @return Album/Sort.
    */
    @Nullable
    public final String getAlbumSortAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ALBUMSORT);
    }

   /**
    * Get Album/Sort.
    * 
    * @return Album/Sort.
    */
    @Nullable
    public final Boolean getAlbumSortAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ALBUMSORT);
    }

   /**
    * Get Album/Sort.
    * 
    * @return Album/Sort.
    */
    @Nullable
    public final BigInteger getAlbumSortAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ALBUMSORT);
    }

   /**
    * Get Album/Sort.
    * 
    * @return Album/Sort.
    */
    @Nullable
    public final URL getAlbumSortAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ALBUMSORT);
    }

   /**
    * Get Album/Sort.
    * 
    * @return Album/Sort.
    */
    @NonNull
    public final List<@NonNull String> getAlbumSortAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ALBUMSORT);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Audio languages in this file separated by /.
    * 
    * @return Audio languages in this file separated by /.
    */
    @Nullable
    public final Integer getAudioLanguageListAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.AUDIOLANGUAGELIST);
    }

   /**
    * Get Audio languages in this file separated by /.
    * 
    * @return Audio languages in this file separated by /.
    */
    @Nullable
    public final Long getAudioLanguageListAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.AUDIOLANGUAGELIST);
    }

   /**
    * Get Audio languages in this file separated by /.
    * 
    * @return Audio languages in this file separated by /.
    */
    @Nullable
    public final LocalDateTime getAudioLanguageListAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.AUDIOLANGUAGELIST);
    }

   /**
    * Get Audio languages in this file separated by /.
    * 
    * @return Audio languages in this file separated by /.
    */
    @Nullable
    public final LocalTime getAudioLanguageListAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.AUDIOLANGUAGELIST);
    }

   /**
    * Get Audio languages in this file separated by /.
    * 
    * @return Audio languages in this file separated by /.
    */
    @Nullable
    public final String getAudioLanguageListAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.AUDIOLANGUAGELIST);
    }

   /**
    * Get Audio languages in this file separated by /.
    * 
    * @return Audio languages in this file separated by /.
    */
    @Nullable
    public final Boolean getAudioLanguageListAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.AUDIOLANGUAGELIST);
    }

   /**
    * Get Audio languages in this file separated by /.
    * 
    * @return Audio languages in this file separated by /.
    */
    @Nullable
    public final BigInteger getAudioLanguageListAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.AUDIOLANGUAGELIST);
    }

   /**
    * Get Audio languages in this file separated by /.
    * 
    * @return Audio languages in this file separated by /.
    */
    @Nullable
    public final URL getAudioLanguageListAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.AUDIOLANGUAGELIST);
    }

   /**
    * Get Audio languages in this file separated by /.
    * 
    * @return Audio languages in this file separated by /.
    */
    @NonNull
    public final List<@NonNull String> getAudioLanguageListAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.AUDIOLANGUAGELIST);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get The name of a co-producer..
    * 
    * @return The name of a co-producer..
    */
    @Nullable
    public final Integer getCoProducerAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.COPRODUCER);
    }

   /**
    * Get The name of a co-producer..
    * 
    * @return The name of a co-producer..
    */
    @Nullable
    public final Long getCoProducerAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.COPRODUCER);
    }

   /**
    * Get The name of a co-producer..
    * 
    * @return The name of a co-producer..
    */
    @Nullable
    public final LocalDateTime getCoProducerAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.COPRODUCER);
    }

   /**
    * Get The name of a co-producer..
    * 
    * @return The name of a co-producer..
    */
    @Nullable
    public final LocalTime getCoProducerAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.COPRODUCER);
    }

   /**
    * Get The name of a co-producer..
    * 
    * @return The name of a co-producer..
    */
    @Nullable
    public final String getCoProducerAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.COPRODUCER);
    }

   /**
    * Get The name of a co-producer..
    * 
    * @return The name of a co-producer..
    */
    @Nullable
    public final Boolean getCoProducerAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.COPRODUCER);
    }

   /**
    * Get The name of a co-producer..
    * 
    * @return The name of a co-producer..
    */
    @Nullable
    public final BigInteger getCoProducerAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.COPRODUCER);
    }

   /**
    * Get The name of a co-producer..
    * 
    * @return The name of a co-producer..
    */
    @Nullable
    public final URL getCoProducerAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.COPRODUCER);
    }

   /**
    * Get The name of a co-producer..
    * 
    * @return The name of a co-producer..
    */
    @NonNull
    public final List<@NonNull String> getCoProducerAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.COPRODUCER);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get International Standard Book Number..
    * 
    * @return International Standard Book Number..
    */
    @Nullable
    public final Integer getISBNAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ISBN);
    }

   /**
    * Get International Standard Book Number..
    * 
    * @return International Standard Book Number..
    */
    @Nullable
    public final Long getISBNAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ISBN);
    }

   /**
    * Get International Standard Book Number..
    * 
    * @return International Standard Book Number..
    */
    @Nullable
    public final LocalDateTime getISBNAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ISBN);
    }

   /**
    * Get International Standard Book Number..
    * 
    * @return International Standard Book Number..
    */
    @Nullable
    public final LocalTime getISBNAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ISBN);
    }

   /**
    * Get International Standard Book Number..
    * 
    * @return International Standard Book Number..
    */
    @Nullable
    public final String getISBNAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ISBN);
    }

   /**
    * Get International Standard Book Number..
    * 
    * @return International Standard Book Number..
    */
    @Nullable
    public final Boolean getISBNAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ISBN);
    }

   /**
    * Get International Standard Book Number..
    * 
    * @return International Standard Book Number..
    */
    @Nullable
    public final BigInteger getISBNAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ISBN);
    }

   /**
    * Get International Standard Book Number..
    * 
    * @return International Standard Book Number..
    */
    @Nullable
    public final URL getISBNAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ISBN);
    }

   /**
    * Get International Standard Book Number..
    * 
    * @return International Standard Book Number..
    */
    @NonNull
    public final List<@NonNull String> getISBNAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ISBN);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get The name of the choregrapher..
    * 
    * @return The name of the choregrapher..
    */
    @Nullable
    public final Integer getChoregrapherAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.CHOREGRAPHER);
    }

   /**
    * Get The name of the choregrapher..
    * 
    * @return The name of the choregrapher..
    */
    @Nullable
    public final Long getChoregrapherAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.CHOREGRAPHER);
    }

   /**
    * Get The name of the choregrapher..
    * 
    * @return The name of the choregrapher..
    */
    @Nullable
    public final LocalDateTime getChoregrapherAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.CHOREGRAPHER);
    }

   /**
    * Get The name of the choregrapher..
    * 
    * @return The name of the choregrapher..
    */
    @Nullable
    public final LocalTime getChoregrapherAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.CHOREGRAPHER);
    }

   /**
    * Get The name of the choregrapher..
    * 
    * @return The name of the choregrapher..
    */
    @Nullable
    public final String getChoregrapherAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.CHOREGRAPHER);
    }

   /**
    * Get The name of the choregrapher..
    * 
    * @return The name of the choregrapher..
    */
    @Nullable
    public final Boolean getChoregrapherAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.CHOREGRAPHER);
    }

   /**
    * Get The name of the choregrapher..
    * 
    * @return The name of the choregrapher..
    */
    @Nullable
    public final BigInteger getChoregrapherAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.CHOREGRAPHER);
    }

   /**
    * Get The name of the choregrapher..
    * 
    * @return The name of the choregrapher..
    */
    @Nullable
    public final URL getChoregrapherAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.CHOREGRAPHER);
    }

   /**
    * Get The name of the choregrapher..
    * 
    * @return The name of the choregrapher..
    */
    @NonNull
    public final List<@NonNull String> getChoregrapherAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.CHOREGRAPHER);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final Integer getEncodedLibraryStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ENCODEDLIBRARYSTRING);
    }

   /**
    * Get Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final Long getEncodedLibraryStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ENCODEDLIBRARYSTRING);
    }

   /**
    * Get Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final LocalDateTime getEncodedLibraryStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ENCODEDLIBRARYSTRING);
    }

   /**
    * Get Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final LocalTime getEncodedLibraryStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ENCODEDLIBRARYSTRING);
    }

   /**
    * Get Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final String getEncodedLibraryStringAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ENCODEDLIBRARYSTRING);
    }

   /**
    * Get Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final Boolean getEncodedLibraryStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ENCODEDLIBRARYSTRING);
    }

   /**
    * Get Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final BigInteger getEncodedLibraryStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ENCODEDLIBRARYSTRING);
    }

   /**
    * Get Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final URL getEncodedLibraryStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ENCODEDLIBRARYSTRING);
    }

   /**
    * Get Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Software used to create the file, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @NonNull
    public final List<@NonNull String> getEncodedLibraryStringAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ENCODEDLIBRARYSTRING);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Complete name (Folder+Name+Extension).
    * 
    * @return Complete name (Folder+Name+Extension).
    */
    @Nullable
    public final Integer getCompleteNameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.COMPLETENAME);
    }

   /**
    * Get Complete name (Folder+Name+Extension).
    * 
    * @return Complete name (Folder+Name+Extension).
    */
    @Nullable
    public final Long getCompleteNameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.COMPLETENAME);
    }

   /**
    * Get Complete name (Folder+Name+Extension).
    * 
    * @return Complete name (Folder+Name+Extension).
    */
    @Nullable
    public final LocalDateTime getCompleteNameAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.COMPLETENAME);
    }

   /**
    * Get Complete name (Folder+Name+Extension).
    * 
    * @return Complete name (Folder+Name+Extension).
    */
    @Nullable
    public final LocalTime getCompleteNameAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.COMPLETENAME);
    }

   /**
    * Get Complete name (Folder+Name+Extension).
    * 
    * @return Complete name (Folder+Name+Extension).
    */
    @Nullable
    public final String getCompleteNameAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.COMPLETENAME);
    }

   /**
    * Get Complete name (Folder+Name+Extension).
    * 
    * @return Complete name (Folder+Name+Extension).
    */
    @Nullable
    public final Boolean getCompleteNameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.COMPLETENAME);
    }

   /**
    * Get Complete name (Folder+Name+Extension).
    * 
    * @return Complete name (Folder+Name+Extension).
    */
    @Nullable
    public final BigInteger getCompleteNameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.COMPLETENAME);
    }

   /**
    * Get Complete name (Folder+Name+Extension).
    * 
    * @return Complete name (Folder+Name+Extension).
    */
    @Nullable
    public final URL getCompleteNameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.COMPLETENAME);
    }

   /**
    * Get Complete name (Folder+Name+Extension).
    * 
    * @return Complete name (Folder+Name+Extension).
    */
    @NonNull
    public final List<@NonNull String> getCompleteNameAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.COMPLETENAME);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get StreamSize/String.
    * 
    * @return StreamSize/String.
    */
    @Nullable
    public final Integer getStreamSizeStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.STREAMSIZESTRING);
    }

   /**
    * Get StreamSize/String.
    * 
    * @return StreamSize/String.
    */
    @Nullable
    public final Long getStreamSizeStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.STREAMSIZESTRING);
    }

   /**
    * Get StreamSize/String.
    * 
    * @return StreamSize/String.
    */
    @Nullable
    public final LocalDateTime getStreamSizeStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.STREAMSIZESTRING);
    }

   /**
    * Get StreamSize/String.
    * 
    * @return StreamSize/String.
    */
    @Nullable
    public final LocalTime getStreamSizeStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.STREAMSIZESTRING);
    }

   /**
    * Get StreamSize/String.
    * 
    * @return StreamSize/String.
    */
    @Nullable
    public final String getStreamSizeStringAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.STREAMSIZESTRING);
    }

   /**
    * Get StreamSize/String.
    * 
    * @return StreamSize/String.
    */
    @Nullable
    public final Boolean getStreamSizeStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.STREAMSIZESTRING);
    }

   /**
    * Get StreamSize/String.
    * 
    * @return StreamSize/String.
    */
    @Nullable
    public final BigInteger getStreamSizeStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.STREAMSIZESTRING);
    }

   /**
    * Get StreamSize/String.
    * 
    * @return StreamSize/String.
    */
    @Nullable
    public final URL getStreamSizeStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.STREAMSIZESTRING);
    }

   /**
    * Get StreamSize/String.
    * 
    * @return StreamSize/String.
    */
    @NonNull
    public final List<@NonNull String> getStreamSizeStringAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.STREAMSIZESTRING);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final Integer getOriginalSourceMediumIDStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ORIGINALSOURCEMEDIUMIDSTRING);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final Long getOriginalSourceMediumIDStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ORIGINALSOURCEMEDIUMIDSTRING);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final LocalDateTime getOriginalSourceMediumIDStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ORIGINALSOURCEMEDIUMIDSTRING);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final LocalTime getOriginalSourceMediumIDStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ORIGINALSOURCEMEDIUMIDSTRING);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final String getOriginalSourceMediumIDStringAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ORIGINALSOURCEMEDIUMIDSTRING);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final Boolean getOriginalSourceMediumIDStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ORIGINALSOURCEMEDIUMIDSTRING);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final BigInteger getOriginalSourceMediumIDStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ORIGINALSOURCEMEDIUMIDSTRING);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final URL getOriginalSourceMediumIDStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ORIGINALSOURCEMEDIUMIDSTRING);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @NonNull
    public final List<@NonNull String> getOriginalSourceMediumIDStringAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ORIGINALSOURCEMEDIUMIDSTRING);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Company the item is mainly distributed by .
    * 
    * @return Company the item is mainly distributed by .
    */
    @Nullable
    public final Integer getDistributedByAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.DISTRIBUTEDBY);
    }

   /**
    * Get Company the item is mainly distributed by .
    * 
    * @return Company the item is mainly distributed by .
    */
    @Nullable
    public final Long getDistributedByAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.DISTRIBUTEDBY);
    }

   /**
    * Get Company the item is mainly distributed by .
    * 
    * @return Company the item is mainly distributed by .
    */
    @Nullable
    public final LocalDateTime getDistributedByAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.DISTRIBUTEDBY);
    }

   /**
    * Get Company the item is mainly distributed by .
    * 
    * @return Company the item is mainly distributed by .
    */
    @Nullable
    public final LocalTime getDistributedByAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.DISTRIBUTEDBY);
    }

   /**
    * Get Company the item is mainly distributed by .
    * 
    * @return Company the item is mainly distributed by .
    */
    @Nullable
    public final String getDistributedByAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.DISTRIBUTEDBY);
    }

   /**
    * Get Company the item is mainly distributed by .
    * 
    * @return Company the item is mainly distributed by .
    */
    @Nullable
    public final Boolean getDistributedByAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.DISTRIBUTEDBY);
    }

   /**
    * Get Company the item is mainly distributed by .
    * 
    * @return Company the item is mainly distributed by .
    */
    @Nullable
    public final BigInteger getDistributedByAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.DISTRIBUTEDBY);
    }

   /**
    * Get Company the item is mainly distributed by .
    * 
    * @return Company the item is mainly distributed by .
    */
    @Nullable
    public final URL getDistributedByAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.DISTRIBUTEDBY);
    }

   /**
    * Get Company the item is mainly distributed by .
    * 
    * @return Company the item is mainly distributed by .
    */
    @NonNull
    public final List<@NonNull String> getDistributedByAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.DISTRIBUTEDBY);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get The time that the file was modified on the file system (Warning: this field depends of local configuration, do not use it in an international database).
    * 
    * @return The time that the file was modified on the file system (Warning: this field depends of local configuration, do not use it in an international database).
    */
    @Nullable
    public final Integer getFileModifiedDateLocalAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.FILEMODIFIEDDATELOCAL);
    }

   /**
    * Get The time that the file was modified on the file system (Warning: this field depends of local configuration, do not use it in an international database).
    * 
    * @return The time that the file was modified on the file system (Warning: this field depends of local configuration, do not use it in an international database).
    */
    @Nullable
    public final Long getFileModifiedDateLocalAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.FILEMODIFIEDDATELOCAL);
    }

   /**
    * Get The time that the file was modified on the file system (Warning: this field depends of local configuration, do not use it in an international database).
    * 
    * @return The time that the file was modified on the file system (Warning: this field depends of local configuration, do not use it in an international database).
    */
    @Nullable
    public final LocalDateTime getFileModifiedDateLocalAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.FILEMODIFIEDDATELOCAL);
    }

   /**
    * Get The time that the file was modified on the file system (Warning: this field depends of local configuration, do not use it in an international database).
    * 
    * @return The time that the file was modified on the file system (Warning: this field depends of local configuration, do not use it in an international database).
    */
    @Nullable
    public final LocalTime getFileModifiedDateLocalAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.FILEMODIFIEDDATELOCAL);
    }

   /**
    * Get The time that the file was modified on the file system (Warning: this field depends of local configuration, do not use it in an international database).
    * 
    * @return The time that the file was modified on the file system (Warning: this field depends of local configuration, do not use it in an international database).
    */
    @Nullable
    public final String getFileModifiedDateLocalAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.FILEMODIFIEDDATELOCAL);
    }

   /**
    * Get The time that the file was modified on the file system (Warning: this field depends of local configuration, do not use it in an international database).
    * 
    * @return The time that the file was modified on the file system (Warning: this field depends of local configuration, do not use it in an international database).
    */
    @Nullable
    public final Boolean getFileModifiedDateLocalAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.FILEMODIFIEDDATELOCAL);
    }

   /**
    * Get The time that the file was modified on the file system (Warning: this field depends of local configuration, do not use it in an international database).
    * 
    * @return The time that the file was modified on the file system (Warning: this field depends of local configuration, do not use it in an international database).
    */
    @Nullable
    public final BigInteger getFileModifiedDateLocalAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.FILEMODIFIEDDATELOCAL);
    }

   /**
    * Get The time that the file was modified on the file system (Warning: this field depends of local configuration, do not use it in an international database).
    * 
    * @return The time that the file was modified on the file system (Warning: this field depends of local configuration, do not use it in an international database).
    */
    @Nullable
    public final URL getFileModifiedDateLocalAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.FILEMODIFIEDDATELOCAL);
    }

   /**
    * Get The time that the file was modified on the file system (Warning: this field depends of local configuration, do not use it in an international database).
    * 
    * @return The time that the file was modified on the file system (Warning: this field depends of local configuration, do not use it in an international database).
    */
    @NonNull
    public final List<@NonNull String> getFileModifiedDateLocalAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.FILEMODIFIEDDATELOCAL);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Frame count (a frame contains a count of samples depends of the format).
    * 
    * @return Frame count (a frame contains a count of samples depends of the format).
    */
    @Nullable
    public final Integer getFrameCountAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.FRAMECOUNT);
    }

   /**
    * Get Frame count (a frame contains a count of samples depends of the format).
    * 
    * @return Frame count (a frame contains a count of samples depends of the format).
    */
    @Nullable
    public final Long getFrameCountAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.FRAMECOUNT);
    }

   /**
    * Get Frame count (a frame contains a count of samples depends of the format).
    * 
    * @return Frame count (a frame contains a count of samples depends of the format).
    */
    @Nullable
    public final LocalDateTime getFrameCountAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.FRAMECOUNT);
    }

   /**
    * Get Frame count (a frame contains a count of samples depends of the format).
    * 
    * @return Frame count (a frame contains a count of samples depends of the format).
    */
    @Nullable
    public final LocalTime getFrameCountAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.FRAMECOUNT);
    }

   /**
    * Get Frame count (a frame contains a count of samples depends of the format).
    * 
    * @return Frame count (a frame contains a count of samples depends of the format).
    */
    @Nullable
    public final String getFrameCountAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.FRAMECOUNT);
    }

   /**
    * Get Frame count (a frame contains a count of samples depends of the format).
    * 
    * @return Frame count (a frame contains a count of samples depends of the format).
    */
    @Nullable
    public final Boolean getFrameCountAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.FRAMECOUNT);
    }

   /**
    * Get Frame count (a frame contains a count of samples depends of the format).
    * 
    * @return Frame count (a frame contains a count of samples depends of the format).
    */
    @Nullable
    public final BigInteger getFrameCountAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.FRAMECOUNT);
    }

   /**
    * Get Frame count (a frame contains a count of samples depends of the format).
    * 
    * @return Frame count (a frame contains a count of samples depends of the format).
    */
    @Nullable
    public final URL getFrameCountAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.FRAMECOUNT);
    }

   /**
    * Get Frame count (a frame contains a count of samples depends of the format).
    * 
    * @return Frame count (a frame contains a count of samples depends of the format).
    */
    @NonNull
    public final List<@NonNull String> getFrameCountAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.FRAMECOUNT);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Encryption_Length.
    * 
    * @return Encryption_Length.
    */
    @Nullable
    public final Integer getEncryptionLengthAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ENCRYPTIONLENGTH);
    }

   /**
    * Get Encryption_Length.
    * 
    * @return Encryption_Length.
    */
    @Nullable
    public final Long getEncryptionLengthAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ENCRYPTIONLENGTH);
    }

   /**
    * Get Encryption_Length.
    * 
    * @return Encryption_Length.
    */
    @Nullable
    public final LocalDateTime getEncryptionLengthAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ENCRYPTIONLENGTH);
    }

   /**
    * Get Encryption_Length.
    * 
    * @return Encryption_Length.
    */
    @Nullable
    public final LocalTime getEncryptionLengthAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ENCRYPTIONLENGTH);
    }

   /**
    * Get Encryption_Length.
    * 
    * @return Encryption_Length.
    */
    @Nullable
    public final String getEncryptionLengthAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ENCRYPTIONLENGTH);
    }

   /**
    * Get Encryption_Length.
    * 
    * @return Encryption_Length.
    */
    @Nullable
    public final Boolean getEncryptionLengthAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ENCRYPTIONLENGTH);
    }

   /**
    * Get Encryption_Length.
    * 
    * @return Encryption_Length.
    */
    @Nullable
    public final BigInteger getEncryptionLengthAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ENCRYPTIONLENGTH);
    }

   /**
    * Get Encryption_Length.
    * 
    * @return Encryption_Length.
    */
    @Nullable
    public final URL getEncryptionLengthAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ENCRYPTIONLENGTH);
    }

   /**
    * Get Encryption_Length.
    * 
    * @return Encryption_Length.
    */
    @NonNull
    public final List<@NonNull String> getEncryptionLengthAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ENCRYPTIONLENGTH);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get (Generic)Title of file.
    * 
    * @return (Generic)Title of file.
    */
    @Nullable
    public final Integer getTitleAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.TITLE);
    }

   /**
    * Get (Generic)Title of file.
    * 
    * @return (Generic)Title of file.
    */
    @Nullable
    public final Long getTitleAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.TITLE);
    }

   /**
    * Get (Generic)Title of file.
    * 
    * @return (Generic)Title of file.
    */
    @Nullable
    public final LocalDateTime getTitleAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.TITLE);
    }

   /**
    * Get (Generic)Title of file.
    * 
    * @return (Generic)Title of file.
    */
    @Nullable
    public final LocalTime getTitleAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.TITLE);
    }

   /**
    * Get (Generic)Title of file.
    * 
    * @return (Generic)Title of file.
    */
    @Nullable
    public final String getTitleAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.TITLE);
    }

   /**
    * Get (Generic)Title of file.
    * 
    * @return (Generic)Title of file.
    */
    @Nullable
    public final Boolean getTitleAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.TITLE);
    }

   /**
    * Get (Generic)Title of file.
    * 
    * @return (Generic)Title of file.
    */
    @Nullable
    public final BigInteger getTitleAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.TITLE);
    }

   /**
    * Get (Generic)Title of file.
    * 
    * @return (Generic)Title of file.
    */
    @Nullable
    public final URL getTitleAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.TITLE);
    }

   /**
    * Get (Generic)Title of file.
    * 
    * @return (Generic)Title of file.
    */
    @NonNull
    public final List<@NonNull String> getTitleAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.TITLE);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get The ICRA rating. (Previously RSACi).
    * 
    * @return The ICRA rating. (Previously RSACi).
    */
    @Nullable
    public final Integer getICRAAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ICRA);
    }

   /**
    * Get The ICRA rating. (Previously RSACi).
    * 
    * @return The ICRA rating. (Previously RSACi).
    */
    @Nullable
    public final Long getICRAAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ICRA);
    }

   /**
    * Get The ICRA rating. (Previously RSACi).
    * 
    * @return The ICRA rating. (Previously RSACi).
    */
    @Nullable
    public final LocalDateTime getICRAAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ICRA);
    }

   /**
    * Get The ICRA rating. (Previously RSACi).
    * 
    * @return The ICRA rating. (Previously RSACi).
    */
    @Nullable
    public final LocalTime getICRAAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ICRA);
    }

   /**
    * Get The ICRA rating. (Previously RSACi).
    * 
    * @return The ICRA rating. (Previously RSACi).
    */
    @Nullable
    public final String getICRAAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ICRA);
    }

   /**
    * Get The ICRA rating. (Previously RSACi).
    * 
    * @return The ICRA rating. (Previously RSACi).
    */
    @Nullable
    public final Boolean getICRAAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ICRA);
    }

   /**
    * Get The ICRA rating. (Previously RSACi).
    * 
    * @return The ICRA rating. (Previously RSACi).
    */
    @Nullable
    public final BigInteger getICRAAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ICRA);
    }

   /**
    * Get The ICRA rating. (Previously RSACi).
    * 
    * @return The ICRA rating. (Previously RSACi).
    */
    @Nullable
    public final URL getICRAAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ICRA);
    }

   /**
    * Get The ICRA rating. (Previously RSACi).
    * 
    * @return The ICRA rating. (Previously RSACi).
    */
    @NonNull
    public final List<@NonNull String> getICRAAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ICRA);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Delay drop frame.
    * 
    * @return Delay drop frame.
    */
    @Nullable
    public final Integer getDelayDropFrameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.DELAYDROPFRAME);
    }

   /**
    * Get Delay drop frame.
    * 
    * @return Delay drop frame.
    */
    @Nullable
    public final Long getDelayDropFrameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.DELAYDROPFRAME);
    }

   /**
    * Get Delay drop frame.
    * 
    * @return Delay drop frame.
    */
    @Nullable
    public final LocalDateTime getDelayDropFrameAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.DELAYDROPFRAME);
    }

   /**
    * Get Delay drop frame.
    * 
    * @return Delay drop frame.
    */
    @Nullable
    public final LocalTime getDelayDropFrameAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.DELAYDROPFRAME);
    }

   /**
    * Get Delay drop frame.
    * 
    * @return Delay drop frame.
    */
    @Nullable
    public final String getDelayDropFrameAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.DELAYDROPFRAME);
    }

   /**
    * Get Delay drop frame.
    * 
    * @return Delay drop frame.
    */
    @Nullable
    public final Boolean getDelayDropFrameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.DELAYDROPFRAME);
    }

   /**
    * Get Delay drop frame.
    * 
    * @return Delay drop frame.
    */
    @Nullable
    public final BigInteger getDelayDropFrameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.DELAYDROPFRAME);
    }

   /**
    * Get Delay drop frame.
    * 
    * @return Delay drop frame.
    */
    @Nullable
    public final URL getDelayDropFrameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.DELAYDROPFRAME);
    }

   /**
    * Get Delay drop frame.
    * 
    * @return Delay drop frame.
    */
    @NonNull
    public final List<@NonNull String> getDelayDropFrameAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.DELAYDROPFRAME);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get (Generic)Url.
    * 
    * @return (Generic)Url.
    */
    @Nullable
    public final Integer getTitleUrlAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.TITLEURL);
    }

   /**
    * Get (Generic)Url.
    * 
    * @return (Generic)Url.
    */
    @Nullable
    public final Long getTitleUrlAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.TITLEURL);
    }

   /**
    * Get (Generic)Url.
    * 
    * @return (Generic)Url.
    */
    @Nullable
    public final LocalDateTime getTitleUrlAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.TITLEURL);
    }

   /**
    * Get (Generic)Url.
    * 
    * @return (Generic)Url.
    */
    @Nullable
    public final LocalTime getTitleUrlAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.TITLEURL);
    }

   /**
    * Get (Generic)Url.
    * 
    * @return (Generic)Url.
    */
    @Nullable
    public final String getTitleUrlAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.TITLEURL);
    }

   /**
    * Get (Generic)Url.
    * 
    * @return (Generic)Url.
    */
    @Nullable
    public final Boolean getTitleUrlAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.TITLEURL);
    }

   /**
    * Get (Generic)Url.
    * 
    * @return (Generic)Url.
    */
    @Nullable
    public final BigInteger getTitleUrlAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.TITLEURL);
    }

   /**
    * Get (Generic)Url.
    * 
    * @return (Generic)Url.
    */
    @Nullable
    public final URL getTitleUrlAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.TITLEURL);
    }

   /**
    * Get (Generic)Url.
    * 
    * @return (Generic)Url.
    */
    @NonNull
    public final List<@NonNull String> getTitleUrlAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.TITLEURL);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Composer/Sort.
    * 
    * @return Composer/Sort.
    */
    @Nullable
    public final Integer getComposerSortAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.COMPOSERSORT);
    }

   /**
    * Get Composer/Sort.
    * 
    * @return Composer/Sort.
    */
    @Nullable
    public final Long getComposerSortAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.COMPOSERSORT);
    }

   /**
    * Get Composer/Sort.
    * 
    * @return Composer/Sort.
    */
    @Nullable
    public final LocalDateTime getComposerSortAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.COMPOSERSORT);
    }

   /**
    * Get Composer/Sort.
    * 
    * @return Composer/Sort.
    */
    @Nullable
    public final LocalTime getComposerSortAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.COMPOSERSORT);
    }

   /**
    * Get Composer/Sort.
    * 
    * @return Composer/Sort.
    */
    @Nullable
    public final String getComposerSortAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.COMPOSERSORT);
    }

   /**
    * Get Composer/Sort.
    * 
    * @return Composer/Sort.
    */
    @Nullable
    public final Boolean getComposerSortAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.COMPOSERSORT);
    }

   /**
    * Get Composer/Sort.
    * 
    * @return Composer/Sort.
    */
    @Nullable
    public final BigInteger getComposerSortAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.COMPOSERSORT);
    }

   /**
    * Get Composer/Sort.
    * 
    * @return Composer/Sort.
    */
    @Nullable
    public final URL getComposerSortAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.COMPOSERSORT);
    }

   /**
    * Get Composer/Sort.
    * 
    * @return Composer/Sort.
    */
    @NonNull
    public final List<@NonNull String> getComposerSortAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.COMPOSERSORT);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Describes the topic of the file, such as Aerial view of Seattle...
    * 
    * @return Describes the topic of the file, such as Aerial view of Seattle...
    */
    @Nullable
    public final Integer getSubjectAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.SUBJECT);
    }

   /**
    * Get Describes the topic of the file, such as Aerial view of Seattle...
    * 
    * @return Describes the topic of the file, such as Aerial view of Seattle...
    */
    @Nullable
    public final Long getSubjectAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.SUBJECT);
    }

   /**
    * Get Describes the topic of the file, such as Aerial view of Seattle...
    * 
    * @return Describes the topic of the file, such as Aerial view of Seattle...
    */
    @Nullable
    public final LocalDateTime getSubjectAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.SUBJECT);
    }

   /**
    * Get Describes the topic of the file, such as Aerial view of Seattle...
    * 
    * @return Describes the topic of the file, such as Aerial view of Seattle...
    */
    @Nullable
    public final LocalTime getSubjectAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.SUBJECT);
    }

   /**
    * Get Describes the topic of the file, such as Aerial view of Seattle...
    * 
    * @return Describes the topic of the file, such as Aerial view of Seattle...
    */
    @Nullable
    public final String getSubjectAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.SUBJECT);
    }

   /**
    * Get Describes the topic of the file, such as Aerial view of Seattle...
    * 
    * @return Describes the topic of the file, such as Aerial view of Seattle...
    */
    @Nullable
    public final Boolean getSubjectAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.SUBJECT);
    }

   /**
    * Get Describes the topic of the file, such as Aerial view of Seattle...
    * 
    * @return Describes the topic of the file, such as Aerial view of Seattle...
    */
    @Nullable
    public final BigInteger getSubjectAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.SUBJECT);
    }

   /**
    * Get Describes the topic of the file, such as Aerial view of Seattle...
    * 
    * @return Describes the topic of the file, such as Aerial view of Seattle...
    */
    @Nullable
    public final URL getSubjectAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.SUBJECT);
    }

   /**
    * Get Describes the topic of the file, such as Aerial view of Seattle...
    * 
    * @return Describes the topic of the file, such as Aerial view of Seattle...
    */
    @NonNull
    public final List<@NonNull String> getSubjectAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.SUBJECT);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get More infos about the movie.
    * 
    * @return More infos about the movie.
    */
    @Nullable
    public final Integer getMovieMoreAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.MOVIEMORE);
    }

   /**
    * Get More infos about the movie.
    * 
    * @return More infos about the movie.
    */
    @Nullable
    public final Long getMovieMoreAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.MOVIEMORE);
    }

   /**
    * Get More infos about the movie.
    * 
    * @return More infos about the movie.
    */
    @Nullable
    public final LocalDateTime getMovieMoreAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.MOVIEMORE);
    }

   /**
    * Get More infos about the movie.
    * 
    * @return More infos about the movie.
    */
    @Nullable
    public final LocalTime getMovieMoreAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.MOVIEMORE);
    }

   /**
    * Get More infos about the movie.
    * 
    * @return More infos about the movie.
    */
    @Nullable
    public final String getMovieMoreAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.MOVIEMORE);
    }

   /**
    * Get More infos about the movie.
    * 
    * @return More infos about the movie.
    */
    @Nullable
    public final Boolean getMovieMoreAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.MOVIEMORE);
    }

   /**
    * Get More infos about the movie.
    * 
    * @return More infos about the movie.
    */
    @Nullable
    public final BigInteger getMovieMoreAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.MOVIEMORE);
    }

   /**
    * Get More infos about the movie.
    * 
    * @return More infos about the movie.
    */
    @Nullable
    public final URL getMovieMoreAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.MOVIEMORE);
    }

   /**
    * Get More infos about the movie.
    * 
    * @return More infos about the movie.
    */
    @NonNull
    public final List<@NonNull String> getMovieMoreAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.MOVIEMORE);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Bit rate mode of all streams (VBR, CBR).
    * 
    * @return Bit rate mode of all streams (VBR, CBR).
    */
    @Nullable
    public final Integer getOverallBitRateModeAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.OVERALLBITRATEMODE);
    }

   /**
    * Get Bit rate mode of all streams (VBR, CBR).
    * 
    * @return Bit rate mode of all streams (VBR, CBR).
    */
    @Nullable
    public final Long getOverallBitRateModeAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.OVERALLBITRATEMODE);
    }

   /**
    * Get Bit rate mode of all streams (VBR, CBR).
    * 
    * @return Bit rate mode of all streams (VBR, CBR).
    */
    @Nullable
    public final LocalDateTime getOverallBitRateModeAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.OVERALLBITRATEMODE);
    }

   /**
    * Get Bit rate mode of all streams (VBR, CBR).
    * 
    * @return Bit rate mode of all streams (VBR, CBR).
    */
    @Nullable
    public final LocalTime getOverallBitRateModeAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.OVERALLBITRATEMODE);
    }

   /**
    * Get Bit rate mode of all streams (VBR, CBR).
    * 
    * @return Bit rate mode of all streams (VBR, CBR).
    */
    @Nullable
    public final String getOverallBitRateModeAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.OVERALLBITRATEMODE);
    }

   /**
    * Get Bit rate mode of all streams (VBR, CBR).
    * 
    * @return Bit rate mode of all streams (VBR, CBR).
    */
    @Nullable
    public final Boolean getOverallBitRateModeAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.OVERALLBITRATEMODE);
    }

   /**
    * Get Bit rate mode of all streams (VBR, CBR).
    * 
    * @return Bit rate mode of all streams (VBR, CBR).
    */
    @Nullable
    public final BigInteger getOverallBitRateModeAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.OVERALLBITRATEMODE);
    }

   /**
    * Get Bit rate mode of all streams (VBR, CBR).
    * 
    * @return Bit rate mode of all streams (VBR, CBR).
    */
    @Nullable
    public final URL getOverallBitRateModeAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.OVERALLBITRATEMODE);
    }

   /**
    * Get Bit rate mode of all streams (VBR, CBR).
    * 
    * @return Bit rate mode of all streams (VBR, CBR).
    */
    @NonNull
    public final List<@NonNull String> getOverallBitRateModeAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.OVERALLBITRATEMODE);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get The author of the screenplay or scenario (used for movies and TV shows)..
    * 
    * @return The author of the screenplay or scenario (used for movies and TV shows)..
    */
    @Nullable
    public final Integer getScreenplayByAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.SCREENPLAYBY);
    }

   /**
    * Get The author of the screenplay or scenario (used for movies and TV shows)..
    * 
    * @return The author of the screenplay or scenario (used for movies and TV shows)..
    */
    @Nullable
    public final Long getScreenplayByAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.SCREENPLAYBY);
    }

   /**
    * Get The author of the screenplay or scenario (used for movies and TV shows)..
    * 
    * @return The author of the screenplay or scenario (used for movies and TV shows)..
    */
    @Nullable
    public final LocalDateTime getScreenplayByAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.SCREENPLAYBY);
    }

   /**
    * Get The author of the screenplay or scenario (used for movies and TV shows)..
    * 
    * @return The author of the screenplay or scenario (used for movies and TV shows)..
    */
    @Nullable
    public final LocalTime getScreenplayByAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.SCREENPLAYBY);
    }

   /**
    * Get The author of the screenplay or scenario (used for movies and TV shows)..
    * 
    * @return The author of the screenplay or scenario (used for movies and TV shows)..
    */
    @Nullable
    public final String getScreenplayByAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.SCREENPLAYBY);
    }

   /**
    * Get The author of the screenplay or scenario (used for movies and TV shows)..
    * 
    * @return The author of the screenplay or scenario (used for movies and TV shows)..
    */
    @Nullable
    public final Boolean getScreenplayByAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.SCREENPLAYBY);
    }

   /**
    * Get The author of the screenplay or scenario (used for movies and TV shows)..
    * 
    * @return The author of the screenplay or scenario (used for movies and TV shows)..
    */
    @Nullable
    public final BigInteger getScreenplayByAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.SCREENPLAYBY);
    }

   /**
    * Get The author of the screenplay or scenario (used for movies and TV shows)..
    * 
    * @return The author of the screenplay or scenario (used for movies and TV shows)..
    */
    @Nullable
    public final URL getScreenplayByAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.SCREENPLAYBY);
    }

   /**
    * Get The author of the screenplay or scenario (used for movies and TV shows)..
    * 
    * @return The author of the screenplay or scenario (used for movies and TV shows)..
    */
    @NonNull
    public final List<@NonNull String> getScreenplayByAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.SCREENPLAYBY);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get The name of an executive producer..
    * 
    * @return The name of an executive producer..
    */
    @Nullable
    public final Integer getExecutiveProducerAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.EXECUTIVEPRODUCER);
    }

   /**
    * Get The name of an executive producer..
    * 
    * @return The name of an executive producer..
    */
    @Nullable
    public final Long getExecutiveProducerAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.EXECUTIVEPRODUCER);
    }

   /**
    * Get The name of an executive producer..
    * 
    * @return The name of an executive producer..
    */
    @Nullable
    public final LocalDateTime getExecutiveProducerAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.EXECUTIVEPRODUCER);
    }

   /**
    * Get The name of an executive producer..
    * 
    * @return The name of an executive producer..
    */
    @Nullable
    public final LocalTime getExecutiveProducerAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.EXECUTIVEPRODUCER);
    }

   /**
    * Get The name of an executive producer..
    * 
    * @return The name of an executive producer..
    */
    @Nullable
    public final String getExecutiveProducerAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.EXECUTIVEPRODUCER);
    }

   /**
    * Get The name of an executive producer..
    * 
    * @return The name of an executive producer..
    */
    @Nullable
    public final Boolean getExecutiveProducerAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.EXECUTIVEPRODUCER);
    }

   /**
    * Get The name of an executive producer..
    * 
    * @return The name of an executive producer..
    */
    @Nullable
    public final BigInteger getExecutiveProducerAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.EXECUTIVEPRODUCER);
    }

   /**
    * Get The name of an executive producer..
    * 
    * @return The name of an executive producer..
    */
    @Nullable
    public final URL getExecutiveProducerAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.EXECUTIVEPRODUCER);
    }

   /**
    * Get The name of an executive producer..
    * 
    * @return The name of an executive producer..
    */
    @NonNull
    public final List<@NonNull String> getExecutiveProducerAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.EXECUTIVEPRODUCER);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get International Standard Recording Code, excluding the ISRC prefix and including hyphens..
    * 
    * @return International Standard Recording Code, excluding the ISRC prefix and including hyphens..
    */
    @Nullable
    public final Integer getISRCAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ISRC);
    }

   /**
    * Get International Standard Recording Code, excluding the ISRC prefix and including hyphens..
    * 
    * @return International Standard Recording Code, excluding the ISRC prefix and including hyphens..
    */
    @Nullable
    public final Long getISRCAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ISRC);
    }

   /**
    * Get International Standard Recording Code, excluding the ISRC prefix and including hyphens..
    * 
    * @return International Standard Recording Code, excluding the ISRC prefix and including hyphens..
    */
    @Nullable
    public final LocalDateTime getISRCAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ISRC);
    }

   /**
    * Get International Standard Recording Code, excluding the ISRC prefix and including hyphens..
    * 
    * @return International Standard Recording Code, excluding the ISRC prefix and including hyphens..
    */
    @Nullable
    public final LocalTime getISRCAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ISRC);
    }

   /**
    * Get International Standard Recording Code, excluding the ISRC prefix and including hyphens..
    * 
    * @return International Standard Recording Code, excluding the ISRC prefix and including hyphens..
    */
    @Nullable
    public final String getISRCAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ISRC);
    }

   /**
    * Get International Standard Recording Code, excluding the ISRC prefix and including hyphens..
    * 
    * @return International Standard Recording Code, excluding the ISRC prefix and including hyphens..
    */
    @Nullable
    public final Boolean getISRCAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ISRC);
    }

   /**
    * Get International Standard Recording Code, excluding the ISRC prefix and including hyphens..
    * 
    * @return International Standard Recording Code, excluding the ISRC prefix and including hyphens..
    */
    @Nullable
    public final BigInteger getISRCAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ISRC);
    }

   /**
    * Get International Standard Recording Code, excluding the ISRC prefix and including hyphens..
    * 
    * @return International Standard Recording Code, excluding the ISRC prefix and including hyphens..
    */
    @Nullable
    public final URL getISRCAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ISRC);
    }

   /**
    * Get International Standard Recording Code, excluding the ISRC prefix and including hyphens..
    * 
    * @return International Standard Recording Code, excluding the ISRC prefix and including hyphens..
    */
    @NonNull
    public final List<@NonNull String> getISRCAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ISRC);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Stream size divided by file size.
    * 
    * @return Stream size divided by file size.
    */
    @Nullable
    public final Integer getStreamSizeProportionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.STREAMSIZEPROPORTION);
    }

   /**
    * Get Stream size divided by file size.
    * 
    * @return Stream size divided by file size.
    */
    @Nullable
    public final Long getStreamSizeProportionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.STREAMSIZEPROPORTION);
    }

   /**
    * Get Stream size divided by file size.
    * 
    * @return Stream size divided by file size.
    */
    @Nullable
    public final LocalDateTime getStreamSizeProportionAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.STREAMSIZEPROPORTION);
    }

   /**
    * Get Stream size divided by file size.
    * 
    * @return Stream size divided by file size.
    */
    @Nullable
    public final LocalTime getStreamSizeProportionAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.STREAMSIZEPROPORTION);
    }

   /**
    * Get Stream size divided by file size.
    * 
    * @return Stream size divided by file size.
    */
    @Nullable
    public final String getStreamSizeProportionAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.STREAMSIZEPROPORTION);
    }

   /**
    * Get Stream size divided by file size.
    * 
    * @return Stream size divided by file size.
    */
    @Nullable
    public final Boolean getStreamSizeProportionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.STREAMSIZEPROPORTION);
    }

   /**
    * Get Stream size divided by file size.
    * 
    * @return Stream size divided by file size.
    */
    @Nullable
    public final BigInteger getStreamSizeProportionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.STREAMSIZEPROPORTION);
    }

   /**
    * Get Stream size divided by file size.
    * 
    * @return Stream size divided by file size.
    */
    @Nullable
    public final URL getStreamSizeProportionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.STREAMSIZEPROPORTION);
    }

   /**
    * Get Stream size divided by file size.
    * 
    * @return Stream size divided by file size.
    */
    @NonNull
    public final List<@NonNull String> getStreamSizeProportionAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.STREAMSIZEPROPORTION);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get HeaderSize.
    * 
    * @return HeaderSize.
    */
    @Nullable
    public final Integer getHeaderSizeAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.HEADERSIZE);
    }

   /**
    * Get HeaderSize.
    * 
    * @return HeaderSize.
    */
    @Nullable
    public final Long getHeaderSizeAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.HEADERSIZE);
    }

   /**
    * Get HeaderSize.
    * 
    * @return HeaderSize.
    */
    @Nullable
    public final LocalDateTime getHeaderSizeAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.HEADERSIZE);
    }

   /**
    * Get HeaderSize.
    * 
    * @return HeaderSize.
    */
    @Nullable
    public final LocalTime getHeaderSizeAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.HEADERSIZE);
    }

   /**
    * Get HeaderSize.
    * 
    * @return HeaderSize.
    */
    @Nullable
    public final String getHeaderSizeAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.HEADERSIZE);
    }

   /**
    * Get HeaderSize.
    * 
    * @return HeaderSize.
    */
    @Nullable
    public final Boolean getHeaderSizeAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.HEADERSIZE);
    }

   /**
    * Get HeaderSize.
    * 
    * @return HeaderSize.
    */
    @Nullable
    public final BigInteger getHeaderSizeAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.HEADERSIZE);
    }

   /**
    * Get HeaderSize.
    * 
    * @return HeaderSize.
    */
    @Nullable
    public final URL getHeaderSizeAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.HEADERSIZE);
    }

   /**
    * Get HeaderSize.
    * 
    * @return HeaderSize.
    */
    @NonNull
    public final List<@NonNull String> getHeaderSizeAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.HEADERSIZE);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Parameters used by the software.
    * 
    * @return Parameters used by the software.
    */
    @Nullable
    public final Integer getEncodedLibrarySettingsAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ENCODEDLIBRARYSETTINGS);
    }

   /**
    * Get Parameters used by the software.
    * 
    * @return Parameters used by the software.
    */
    @Nullable
    public final Long getEncodedLibrarySettingsAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ENCODEDLIBRARYSETTINGS);
    }

   /**
    * Get Parameters used by the software.
    * 
    * @return Parameters used by the software.
    */
    @Nullable
    public final LocalDateTime getEncodedLibrarySettingsAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ENCODEDLIBRARYSETTINGS);
    }

   /**
    * Get Parameters used by the software.
    * 
    * @return Parameters used by the software.
    */
    @Nullable
    public final LocalTime getEncodedLibrarySettingsAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ENCODEDLIBRARYSETTINGS);
    }

   /**
    * Get Parameters used by the software.
    * 
    * @return Parameters used by the software.
    */
    @Nullable
    public final String getEncodedLibrarySettingsAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ENCODEDLIBRARYSETTINGS);
    }

   /**
    * Get Parameters used by the software.
    * 
    * @return Parameters used by the software.
    */
    @Nullable
    public final Boolean getEncodedLibrarySettingsAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ENCODEDLIBRARYSETTINGS);
    }

   /**
    * Get Parameters used by the software.
    * 
    * @return Parameters used by the software.
    */
    @Nullable
    public final BigInteger getEncodedLibrarySettingsAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ENCODEDLIBRARYSETTINGS);
    }

   /**
    * Get Parameters used by the software.
    * 
    * @return Parameters used by the software.
    */
    @Nullable
    public final URL getEncodedLibrarySettingsAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ENCODEDLIBRARYSETTINGS);
    }

   /**
    * Get Parameters used by the software.
    * 
    * @return Parameters used by the software.
    */
    @NonNull
    public final List<@NonNull String> getEncodedLibrarySettingsAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ENCODEDLIBRARYSETTINGS);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get The type of the item. e.g. Documentary, Feature Film, Cartoon, Music Video, Music, Sound FX, etc..
    * 
    * @return The type of the item. e.g. Documentary, Feature Film, Cartoon, Music Video, Music, Sound FX, etc..
    */
    @Nullable
    public final Integer getContentTypeAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.CONTENTTYPE);
    }

   /**
    * Get The type of the item. e.g. Documentary, Feature Film, Cartoon, Music Video, Music, Sound FX, etc..
    * 
    * @return The type of the item. e.g. Documentary, Feature Film, Cartoon, Music Video, Music, Sound FX, etc..
    */
    @Nullable
    public final Long getContentTypeAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.CONTENTTYPE);
    }

   /**
    * Get The type of the item. e.g. Documentary, Feature Film, Cartoon, Music Video, Music, Sound FX, etc..
    * 
    * @return The type of the item. e.g. Documentary, Feature Film, Cartoon, Music Video, Music, Sound FX, etc..
    */
    @Nullable
    public final LocalDateTime getContentTypeAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.CONTENTTYPE);
    }

   /**
    * Get The type of the item. e.g. Documentary, Feature Film, Cartoon, Music Video, Music, Sound FX, etc..
    * 
    * @return The type of the item. e.g. Documentary, Feature Film, Cartoon, Music Video, Music, Sound FX, etc..
    */
    @Nullable
    public final LocalTime getContentTypeAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.CONTENTTYPE);
    }

   /**
    * Get The type of the item. e.g. Documentary, Feature Film, Cartoon, Music Video, Music, Sound FX, etc..
    * 
    * @return The type of the item. e.g. Documentary, Feature Film, Cartoon, Music Video, Music, Sound FX, etc..
    */
    @Nullable
    public final String getContentTypeAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.CONTENTTYPE);
    }

   /**
    * Get The type of the item. e.g. Documentary, Feature Film, Cartoon, Music Video, Music, Sound FX, etc..
    * 
    * @return The type of the item. e.g. Documentary, Feature Film, Cartoon, Music Video, Music, Sound FX, etc..
    */
    @Nullable
    public final Boolean getContentTypeAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.CONTENTTYPE);
    }

   /**
    * Get The type of the item. e.g. Documentary, Feature Film, Cartoon, Music Video, Music, Sound FX, etc..
    * 
    * @return The type of the item. e.g. Documentary, Feature Film, Cartoon, Music Video, Music, Sound FX, etc..
    */
    @Nullable
    public final BigInteger getContentTypeAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.CONTENTTYPE);
    }

   /**
    * Get The type of the item. e.g. Documentary, Feature Film, Cartoon, Music Video, Music, Sound FX, etc..
    * 
    * @return The type of the item. e.g. Documentary, Feature Film, Cartoon, Music Video, Music, Sound FX, etc..
    */
    @Nullable
    public final URL getContentTypeAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.CONTENTTYPE);
    }

   /**
    * Get The type of the item. e.g. Documentary, Feature Film, Cartoon, Music Video, Music, Sound FX, etc..
    * 
    * @return The type of the item. e.g. Documentary, Feature Film, Cartoon, Music Video, Music, Sound FX, etc..
    */
    @NonNull
    public final List<@NonNull String> getContentTypeAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.CONTENTTYPE);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get short descriptio, e.g. Earth in space.
    * 
    * @return short descriptio, e.g. Earth in space.
    */
    @Nullable
    public final Integer getCoverDescriptionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.COVERDESCRIPTION);
    }

   /**
    * Get short descriptio, e.g. Earth in space.
    * 
    * @return short descriptio, e.g. Earth in space.
    */
    @Nullable
    public final Long getCoverDescriptionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.COVERDESCRIPTION);
    }

   /**
    * Get short descriptio, e.g. Earth in space.
    * 
    * @return short descriptio, e.g. Earth in space.
    */
    @Nullable
    public final LocalDateTime getCoverDescriptionAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.COVERDESCRIPTION);
    }

   /**
    * Get short descriptio, e.g. Earth in space.
    * 
    * @return short descriptio, e.g. Earth in space.
    */
    @Nullable
    public final LocalTime getCoverDescriptionAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.COVERDESCRIPTION);
    }

   /**
    * Get short descriptio, e.g. Earth in space.
    * 
    * @return short descriptio, e.g. Earth in space.
    */
    @Nullable
    public final String getCoverDescriptionAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.COVERDESCRIPTION);
    }

   /**
    * Get short descriptio, e.g. Earth in space.
    * 
    * @return short descriptio, e.g. Earth in space.
    */
    @Nullable
    public final Boolean getCoverDescriptionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.COVERDESCRIPTION);
    }

   /**
    * Get short descriptio, e.g. Earth in space.
    * 
    * @return short descriptio, e.g. Earth in space.
    */
    @Nullable
    public final BigInteger getCoverDescriptionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.COVERDESCRIPTION);
    }

   /**
    * Get short descriptio, e.g. Earth in space.
    * 
    * @return short descriptio, e.g. Earth in space.
    */
    @Nullable
    public final URL getCoverDescriptionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.COVERDESCRIPTION);
    }

   /**
    * Get short descriptio, e.g. Earth in space.
    * 
    * @return short descriptio, e.g. Earth in space.
    */
    @NonNull
    public final List<@NonNull String> getCoverDescriptionAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.COVERDESCRIPTION);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Count of objects available in this stream.
    * 
    * @return Count of objects available in this stream.
    */
    @Nullable
    public final Integer getCountAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.COUNT);
    }

   /**
    * Get Count of objects available in this stream.
    * 
    * @return Count of objects available in this stream.
    */
    @Nullable
    public final Long getCountAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.COUNT);
    }

   /**
    * Get Count of objects available in this stream.
    * 
    * @return Count of objects available in this stream.
    */
    @Nullable
    public final LocalDateTime getCountAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.COUNT);
    }

   /**
    * Get Count of objects available in this stream.
    * 
    * @return Count of objects available in this stream.
    */
    @Nullable
    public final LocalTime getCountAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.COUNT);
    }

   /**
    * Get Count of objects available in this stream.
    * 
    * @return Count of objects available in this stream.
    */
    @Nullable
    public final String getCountAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.COUNT);
    }

   /**
    * Get Count of objects available in this stream.
    * 
    * @return Count of objects available in this stream.
    */
    @Nullable
    public final Boolean getCountAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.COUNT);
    }

   /**
    * Get Count of objects available in this stream.
    * 
    * @return Count of objects available in this stream.
    */
    @Nullable
    public final BigInteger getCountAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.COUNT);
    }

   /**
    * Get Count of objects available in this stream.
    * 
    * @return Count of objects available in this stream.
    */
    @Nullable
    public final URL getCountAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.COUNT);
    }

   /**
    * Get Count of objects available in this stream.
    * 
    * @return Count of objects available in this stream.
    */
    @NonNull
    public final List<@NonNull String> getCountAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.COUNT);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Encryption.
    * 
    * @return Encryption.
    */
    @Nullable
    public final Integer getEncryptionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ENCRYPTION);
    }

   /**
    * Get Encryption.
    * 
    * @return Encryption.
    */
    @Nullable
    public final Long getEncryptionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ENCRYPTION);
    }

   /**
    * Get Encryption.
    * 
    * @return Encryption.
    */
    @Nullable
    public final LocalDateTime getEncryptionAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ENCRYPTION);
    }

   /**
    * Get Encryption.
    * 
    * @return Encryption.
    */
    @Nullable
    public final LocalTime getEncryptionAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ENCRYPTION);
    }

   /**
    * Get Encryption.
    * 
    * @return Encryption.
    */
    @Nullable
    public final String getEncryptionAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ENCRYPTION);
    }

   /**
    * Get Encryption.
    * 
    * @return Encryption.
    */
    @Nullable
    public final Boolean getEncryptionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ENCRYPTION);
    }

   /**
    * Get Encryption.
    * 
    * @return Encryption.
    */
    @Nullable
    public final BigInteger getEncryptionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ENCRYPTION);
    }

   /**
    * Get Encryption.
    * 
    * @return Encryption.
    */
    @Nullable
    public final URL getEncryptionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ENCRYPTION);
    }

   /**
    * Get Encryption.
    * 
    * @return Encryption.
    */
    @NonNull
    public final List<@NonNull String> getEncryptionAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ENCRYPTION);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Frames per second, numerator.
    * 
    * @return Frames per second, numerator.
    */
    @Nullable
    public final Integer getFrameRateNumAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.FRAMERATENUM);
    }

   /**
    * Get Frames per second, numerator.
    * 
    * @return Frames per second, numerator.
    */
    @Nullable
    public final Long getFrameRateNumAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.FRAMERATENUM);
    }

   /**
    * Get Frames per second, numerator.
    * 
    * @return Frames per second, numerator.
    */
    @Nullable
    public final LocalDateTime getFrameRateNumAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.FRAMERATENUM);
    }

   /**
    * Get Frames per second, numerator.
    * 
    * @return Frames per second, numerator.
    */
    @Nullable
    public final LocalTime getFrameRateNumAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.FRAMERATENUM);
    }

   /**
    * Get Frames per second, numerator.
    * 
    * @return Frames per second, numerator.
    */
    @Nullable
    public final String getFrameRateNumAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.FRAMERATENUM);
    }

   /**
    * Get Frames per second, numerator.
    * 
    * @return Frames per second, numerator.
    */
    @Nullable
    public final Boolean getFrameRateNumAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.FRAMERATENUM);
    }

   /**
    * Get Frames per second, numerator.
    * 
    * @return Frames per second, numerator.
    */
    @Nullable
    public final BigInteger getFrameRateNumAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.FRAMERATENUM);
    }

   /**
    * Get Frames per second, numerator.
    * 
    * @return Frames per second, numerator.
    */
    @Nullable
    public final URL getFrameRateNumAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.FRAMERATENUM);
    }

   /**
    * Get Frames per second, numerator.
    * 
    * @return Frames per second, numerator.
    */
    @NonNull
    public final List<@NonNull String> getFrameRateNumAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.FRAMERATENUM);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Version of this format.
    * 
    * @return Version of this format.
    */
    @Nullable
    public final Integer getFormatVersionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.FORMATVERSION);
    }

   /**
    * Get Version of this format.
    * 
    * @return Version of this format.
    */
    @Nullable
    public final Long getFormatVersionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.FORMATVERSION);
    }

   /**
    * Get Version of this format.
    * 
    * @return Version of this format.
    */
    @Nullable
    public final LocalDateTime getFormatVersionAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.FORMATVERSION);
    }

   /**
    * Get Version of this format.
    * 
    * @return Version of this format.
    */
    @Nullable
    public final LocalTime getFormatVersionAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.FORMATVERSION);
    }

   /**
    * Get Version of this format.
    * 
    * @return Version of this format.
    */
    @Nullable
    public final String getFormatVersionAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.FORMATVERSION);
    }

   /**
    * Get Version of this format.
    * 
    * @return Version of this format.
    */
    @Nullable
    public final Boolean getFormatVersionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.FORMATVERSION);
    }

   /**
    * Get Version of this format.
    * 
    * @return Version of this format.
    */
    @Nullable
    public final BigInteger getFormatVersionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.FORMATVERSION);
    }

   /**
    * Get Version of this format.
    * 
    * @return Version of this format.
    */
    @Nullable
    public final URL getFormatVersionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.FORMATVERSION);
    }

   /**
    * Get Version of this format.
    * 
    * @return Version of this format.
    */
    @NonNull
    public final List<@NonNull String> getFormatVersionAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.FORMATVERSION);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get When multiple streams, number of the stream (base=1).
    * 
    * @return When multiple streams, number of the stream (base=1).
    */
    @Nullable
    public final Integer getStreamKindPosAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.STREAMKINDPOS);
    }

   /**
    * Get When multiple streams, number of the stream (base=1).
    * 
    * @return When multiple streams, number of the stream (base=1).
    */
    @Nullable
    public final Long getStreamKindPosAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.STREAMKINDPOS);
    }

   /**
    * Get When multiple streams, number of the stream (base=1).
    * 
    * @return When multiple streams, number of the stream (base=1).
    */
    @Nullable
    public final LocalDateTime getStreamKindPosAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.STREAMKINDPOS);
    }

   /**
    * Get When multiple streams, number of the stream (base=1).
    * 
    * @return When multiple streams, number of the stream (base=1).
    */
    @Nullable
    public final LocalTime getStreamKindPosAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.STREAMKINDPOS);
    }

   /**
    * Get When multiple streams, number of the stream (base=1).
    * 
    * @return When multiple streams, number of the stream (base=1).
    */
    @Nullable
    public final String getStreamKindPosAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.STREAMKINDPOS);
    }

   /**
    * Get When multiple streams, number of the stream (base=1).
    * 
    * @return When multiple streams, number of the stream (base=1).
    */
    @Nullable
    public final Boolean getStreamKindPosAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.STREAMKINDPOS);
    }

   /**
    * Get When multiple streams, number of the stream (base=1).
    * 
    * @return When multiple streams, number of the stream (base=1).
    */
    @Nullable
    public final BigInteger getStreamKindPosAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.STREAMKINDPOS);
    }

   /**
    * Get When multiple streams, number of the stream (base=1).
    * 
    * @return When multiple streams, number of the stream (base=1).
    */
    @Nullable
    public final URL getStreamKindPosAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.STREAMKINDPOS);
    }

   /**
    * Get When multiple streams, number of the stream (base=1).
    * 
    * @return When multiple streams, number of the stream (base=1).
    */
    @NonNull
    public final List<@NonNull String> getStreamKindPosAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.STREAMKINDPOS);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final Integer getOriginalSourceMediumIDAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ORIGINALSOURCEMEDIUMID);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final Long getOriginalSourceMediumIDAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ORIGINALSOURCEMEDIUMID);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final LocalDateTime getOriginalSourceMediumIDAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ORIGINALSOURCEMEDIUMID);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final LocalTime getOriginalSourceMediumIDAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ORIGINALSOURCEMEDIUMID);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final String getOriginalSourceMediumIDAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ORIGINALSOURCEMEDIUMID);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final Boolean getOriginalSourceMediumIDAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ORIGINALSOURCEMEDIUMID);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final BigInteger getOriginalSourceMediumIDAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ORIGINALSOURCEMEDIUMID);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @Nullable
    public final URL getOriginalSourceMediumIDAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ORIGINALSOURCEMEDIUMID);
    }

   /**
    * Get The ID for this stream in the original medium of the material.
    * 
    * @return The ID for this stream in the original medium of the material.
    */
    @NonNull
    public final List<@NonNull String> getOriginalSourceMediumIDAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ORIGINALSOURCEMEDIUMID);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Integer getDurationStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.DURATIONSTRING);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Long getDurationStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.DURATIONSTRING);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalDateTime getDurationStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.DURATIONSTRING);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalTime getDurationStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.DURATIONSTRING);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final String getDurationStringAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.DURATIONSTRING);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Boolean getDurationStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.DURATIONSTRING);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final BigInteger getDurationStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.DURATIONSTRING);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final URL getDurationStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.DURATIONSTRING);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @NonNull
    public final List<@NonNull String> getDurationStringAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.DURATIONSTRING);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get ServiceType.
    * 
    * @return ServiceType.
    */
    @Nullable
    public final Integer getServiceTypeAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.SERVICETYPE);
    }

   /**
    * Get ServiceType.
    * 
    * @return ServiceType.
    */
    @Nullable
    public final Long getServiceTypeAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.SERVICETYPE);
    }

   /**
    * Get ServiceType.
    * 
    * @return ServiceType.
    */
    @Nullable
    public final LocalDateTime getServiceTypeAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.SERVICETYPE);
    }

   /**
    * Get ServiceType.
    * 
    * @return ServiceType.
    */
    @Nullable
    public final LocalTime getServiceTypeAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.SERVICETYPE);
    }

   /**
    * Get ServiceType.
    * 
    * @return ServiceType.
    */
    @Nullable
    public final String getServiceTypeAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.SERVICETYPE);
    }

   /**
    * Get ServiceType.
    * 
    * @return ServiceType.
    */
    @Nullable
    public final Boolean getServiceTypeAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.SERVICETYPE);
    }

   /**
    * Get ServiceType.
    * 
    * @return ServiceType.
    */
    @Nullable
    public final BigInteger getServiceTypeAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.SERVICETYPE);
    }

   /**
    * Get ServiceType.
    * 
    * @return ServiceType.
    */
    @Nullable
    public final URL getServiceTypeAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.SERVICETYPE);
    }

   /**
    * Get ServiceType.
    * 
    * @return ServiceType.
    */
    @NonNull
    public final List<@NonNull String> getServiceTypeAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.SERVICETYPE);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Nominal Bit rate in bps.
    * 
    * @return Nominal Bit rate in bps.
    */
    @Nullable
    public final Integer getOverallBitRateNominalAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.OVERALLBITRATENOMINAL);
    }

   /**
    * Get Nominal Bit rate in bps.
    * 
    * @return Nominal Bit rate in bps.
    */
    @Nullable
    public final Long getOverallBitRateNominalAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.OVERALLBITRATENOMINAL);
    }

   /**
    * Get Nominal Bit rate in bps.
    * 
    * @return Nominal Bit rate in bps.
    */
    @Nullable
    public final LocalDateTime getOverallBitRateNominalAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.OVERALLBITRATENOMINAL);
    }

   /**
    * Get Nominal Bit rate in bps.
    * 
    * @return Nominal Bit rate in bps.
    */
    @Nullable
    public final LocalTime getOverallBitRateNominalAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.OVERALLBITRATENOMINAL);
    }

   /**
    * Get Nominal Bit rate in bps.
    * 
    * @return Nominal Bit rate in bps.
    */
    @Nullable
    public final String getOverallBitRateNominalAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.OVERALLBITRATENOMINAL);
    }

   /**
    * Get Nominal Bit rate in bps.
    * 
    * @return Nominal Bit rate in bps.
    */
    @Nullable
    public final Boolean getOverallBitRateNominalAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.OVERALLBITRATENOMINAL);
    }

   /**
    * Get Nominal Bit rate in bps.
    * 
    * @return Nominal Bit rate in bps.
    */
    @Nullable
    public final BigInteger getOverallBitRateNominalAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.OVERALLBITRATENOMINAL);
    }

   /**
    * Get Nominal Bit rate in bps.
    * 
    * @return Nominal Bit rate in bps.
    */
    @Nullable
    public final URL getOverallBitRateNominalAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.OVERALLBITRATENOMINAL);
    }

   /**
    * Get Nominal Bit rate in bps.
    * 
    * @return Nominal Bit rate in bps.
    */
    @NonNull
    public final List<@NonNull String> getOverallBitRateNominalAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.OVERALLBITRATENOMINAL);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final Integer getIDAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ID);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final Long getIDAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ID);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final LocalDateTime getIDAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ID);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final LocalTime getIDAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ID);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final String getIDAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ID);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final Boolean getIDAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ID);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final BigInteger getIDAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ID);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @Nullable
    public final URL getIDAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ID);
    }

   /**
    * Get The ID for this stream in this file.
    * 
    * @return The ID for this stream in this file.
    */
    @NonNull
    public final List<@NonNull String> getIDAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ID);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Release date of software.
    * 
    * @return Release date of software.
    */
    @Nullable
    public final Integer getEncodedLibraryDateAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ENCODEDLIBRARYDATE);
    }

   /**
    * Get Release date of software.
    * 
    * @return Release date of software.
    */
    @Nullable
    public final Long getEncodedLibraryDateAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ENCODEDLIBRARYDATE);
    }

   /**
    * Get Release date of software.
    * 
    * @return Release date of software.
    */
    @Nullable
    public final LocalDateTime getEncodedLibraryDateAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ENCODEDLIBRARYDATE);
    }

   /**
    * Get Release date of software.
    * 
    * @return Release date of software.
    */
    @Nullable
    public final LocalTime getEncodedLibraryDateAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ENCODEDLIBRARYDATE);
    }

   /**
    * Get Release date of software.
    * 
    * @return Release date of software.
    */
    @Nullable
    public final String getEncodedLibraryDateAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ENCODEDLIBRARYDATE);
    }

   /**
    * Get Release date of software.
    * 
    * @return Release date of software.
    */
    @Nullable
    public final Boolean getEncodedLibraryDateAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ENCODEDLIBRARYDATE);
    }

   /**
    * Get Release date of software.
    * 
    * @return Release date of software.
    */
    @Nullable
    public final BigInteger getEncodedLibraryDateAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ENCODEDLIBRARYDATE);
    }

   /**
    * Get Release date of software.
    * 
    * @return Release date of software.
    */
    @Nullable
    public final URL getEncodedLibraryDateAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ENCODEDLIBRARYDATE);
    }

   /**
    * Get Release date of software.
    * 
    * @return Release date of software.
    */
    @NonNull
    public final List<@NonNull String> getEncodedLibraryDateAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ENCODEDLIBRARYDATE);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final Integer getMenuIDStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.MENUIDSTRING);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final Long getMenuIDStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.MENUIDSTRING);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final LocalDateTime getMenuIDStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.MENUIDSTRING);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final LocalTime getMenuIDStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.MENUIDSTRING);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final String getMenuIDStringAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.MENUIDSTRING);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final Boolean getMenuIDStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.MENUIDSTRING);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final BigInteger getMenuIDStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.MENUIDSTRING);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final URL getMenuIDStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.MENUIDSTRING);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @NonNull
    public final List<@NonNull String> getMenuIDStringAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.MENUIDSTRING);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get FooterSize.
    * 
    * @return FooterSize.
    */
    @Nullable
    public final Integer getFooterSizeAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.FOOTERSIZE);
    }

   /**
    * Get FooterSize.
    * 
    * @return FooterSize.
    */
    @Nullable
    public final Long getFooterSizeAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.FOOTERSIZE);
    }

   /**
    * Get FooterSize.
    * 
    * @return FooterSize.
    */
    @Nullable
    public final LocalDateTime getFooterSizeAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.FOOTERSIZE);
    }

   /**
    * Get FooterSize.
    * 
    * @return FooterSize.
    */
    @Nullable
    public final LocalTime getFooterSizeAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.FOOTERSIZE);
    }

   /**
    * Get FooterSize.
    * 
    * @return FooterSize.
    */
    @Nullable
    public final String getFooterSizeAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.FOOTERSIZE);
    }

   /**
    * Get FooterSize.
    * 
    * @return FooterSize.
    */
    @Nullable
    public final Boolean getFooterSizeAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.FOOTERSIZE);
    }

   /**
    * Get FooterSize.
    * 
    * @return FooterSize.
    */
    @Nullable
    public final BigInteger getFooterSizeAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.FOOTERSIZE);
    }

   /**
    * Get FooterSize.
    * 
    * @return FooterSize.
    */
    @Nullable
    public final URL getFooterSizeAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.FOOTERSIZE);
    }

   /**
    * Get FooterSize.
    * 
    * @return FooterSize.
    */
    @NonNull
    public final List<@NonNull String> getFooterSizeAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.FOOTERSIZE);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Software used to tag this file.
    * 
    * @return Software used to tag this file.
    */
    @Nullable
    public final Integer getTaggedApplicationAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.TAGGEDAPPLICATION);
    }

   /**
    * Get Software used to tag this file.
    * 
    * @return Software used to tag this file.
    */
    @Nullable
    public final Long getTaggedApplicationAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.TAGGEDAPPLICATION);
    }

   /**
    * Get Software used to tag this file.
    * 
    * @return Software used to tag this file.
    */
    @Nullable
    public final LocalDateTime getTaggedApplicationAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.TAGGEDAPPLICATION);
    }

   /**
    * Get Software used to tag this file.
    * 
    * @return Software used to tag this file.
    */
    @Nullable
    public final LocalTime getTaggedApplicationAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.TAGGEDAPPLICATION);
    }

   /**
    * Get Software used to tag this file.
    * 
    * @return Software used to tag this file.
    */
    @Nullable
    public final String getTaggedApplicationAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.TAGGEDAPPLICATION);
    }

   /**
    * Get Software used to tag this file.
    * 
    * @return Software used to tag this file.
    */
    @Nullable
    public final Boolean getTaggedApplicationAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.TAGGEDAPPLICATION);
    }

   /**
    * Get Software used to tag this file.
    * 
    * @return Software used to tag this file.
    */
    @Nullable
    public final BigInteger getTaggedApplicationAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.TAGGEDAPPLICATION);
    }

   /**
    * Get Software used to tag this file.
    * 
    * @return Software used to tag this file.
    */
    @Nullable
    public final URL getTaggedApplicationAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.TAGGEDAPPLICATION);
    }

   /**
    * Get Software used to tag this file.
    * 
    * @return Software used to tag this file.
    */
    @NonNull
    public final List<@NonNull String> getTaggedApplicationAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.TAGGEDAPPLICATION);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get License information, e.g., All Rights Reserved,Any Use Permitted..
    * 
    * @return License information, e.g., All Rights Reserved,Any Use Permitted..
    */
    @Nullable
    public final Integer getTermsOfUseAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.TERMSOFUSE);
    }

   /**
    * Get License information, e.g., All Rights Reserved,Any Use Permitted..
    * 
    * @return License information, e.g., All Rights Reserved,Any Use Permitted..
    */
    @Nullable
    public final Long getTermsOfUseAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.TERMSOFUSE);
    }

   /**
    * Get License information, e.g., All Rights Reserved,Any Use Permitted..
    * 
    * @return License information, e.g., All Rights Reserved,Any Use Permitted..
    */
    @Nullable
    public final LocalDateTime getTermsOfUseAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.TERMSOFUSE);
    }

   /**
    * Get License information, e.g., All Rights Reserved,Any Use Permitted..
    * 
    * @return License information, e.g., All Rights Reserved,Any Use Permitted..
    */
    @Nullable
    public final LocalTime getTermsOfUseAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.TERMSOFUSE);
    }

   /**
    * Get License information, e.g., All Rights Reserved,Any Use Permitted..
    * 
    * @return License information, e.g., All Rights Reserved,Any Use Permitted..
    */
    @Nullable
    public final String getTermsOfUseAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.TERMSOFUSE);
    }

   /**
    * Get License information, e.g., All Rights Reserved,Any Use Permitted..
    * 
    * @return License information, e.g., All Rights Reserved,Any Use Permitted..
    */
    @Nullable
    public final Boolean getTermsOfUseAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.TERMSOFUSE);
    }

   /**
    * Get License information, e.g., All Rights Reserved,Any Use Permitted..
    * 
    * @return License information, e.g., All Rights Reserved,Any Use Permitted..
    */
    @Nullable
    public final BigInteger getTermsOfUseAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.TERMSOFUSE);
    }

   /**
    * Get License information, e.g., All Rights Reserved,Any Use Permitted..
    * 
    * @return License information, e.g., All Rights Reserved,Any Use Permitted..
    */
    @Nullable
    public final URL getTermsOfUseAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.TERMSOFUSE);
    }

   /**
    * Get License information, e.g., All Rights Reserved,Any Use Permitted..
    * 
    * @return License information, e.g., All Rights Reserved,Any Use Permitted..
    */
    @NonNull
    public final List<@NonNull String> getTermsOfUseAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.TERMSOFUSE);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Bit rate of all streams in bps.
    * 
    * @return Bit rate of all streams in bps.
    */
    @Nullable
    public final Integer getOverallBitRateAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.OVERALLBITRATE);
    }

   /**
    * Get Bit rate of all streams in bps.
    * 
    * @return Bit rate of all streams in bps.
    */
    @Nullable
    public final Long getOverallBitRateAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.OVERALLBITRATE);
    }

   /**
    * Get Bit rate of all streams in bps.
    * 
    * @return Bit rate of all streams in bps.
    */
    @Nullable
    public final LocalDateTime getOverallBitRateAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.OVERALLBITRATE);
    }

   /**
    * Get Bit rate of all streams in bps.
    * 
    * @return Bit rate of all streams in bps.
    */
    @Nullable
    public final LocalTime getOverallBitRateAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.OVERALLBITRATE);
    }

   /**
    * Get Bit rate of all streams in bps.
    * 
    * @return Bit rate of all streams in bps.
    */
    @Nullable
    public final String getOverallBitRateAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.OVERALLBITRATE);
    }

   /**
    * Get Bit rate of all streams in bps.
    * 
    * @return Bit rate of all streams in bps.
    */
    @Nullable
    public final Boolean getOverallBitRateAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.OVERALLBITRATE);
    }

   /**
    * Get Bit rate of all streams in bps.
    * 
    * @return Bit rate of all streams in bps.
    */
    @Nullable
    public final BigInteger getOverallBitRateAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.OVERALLBITRATE);
    }

   /**
    * Get Bit rate of all streams in bps.
    * 
    * @return Bit rate of all streams in bps.
    */
    @Nullable
    public final URL getOverallBitRateAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.OVERALLBITRATE);
    }

   /**
    * Get Bit rate of all streams in bps.
    * 
    * @return Bit rate of all streams in bps.
    */
    @NonNull
    public final List<@NonNull String> getOverallBitRateAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.OVERALLBITRATE);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Name of the director..
    * 
    * @return Name of the director..
    */
    @Nullable
    public final Integer getDirectorAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.DIRECTOR);
    }

   /**
    * Get Name of the director..
    * 
    * @return Name of the director..
    */
    @Nullable
    public final Long getDirectorAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.DIRECTOR);
    }

   /**
    * Get Name of the director..
    * 
    * @return Name of the director..
    */
    @Nullable
    public final LocalDateTime getDirectorAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.DIRECTOR);
    }

   /**
    * Get Name of the director..
    * 
    * @return Name of the director..
    */
    @Nullable
    public final LocalTime getDirectorAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.DIRECTOR);
    }

   /**
    * Get Name of the director..
    * 
    * @return Name of the director..
    */
    @Nullable
    public final String getDirectorAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.DIRECTOR);
    }

   /**
    * Get Name of the director..
    * 
    * @return Name of the director..
    */
    @Nullable
    public final Boolean getDirectorAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.DIRECTOR);
    }

   /**
    * Get Name of the director..
    * 
    * @return Name of the director..
    */
    @Nullable
    public final BigInteger getDirectorAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.DIRECTOR);
    }

   /**
    * Get Name of the director..
    * 
    * @return Name of the director..
    */
    @Nullable
    public final URL getDirectorAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.DIRECTOR);
    }

   /**
    * Get Name of the director..
    * 
    * @return Name of the director..
    */
    @NonNull
    public final List<@NonNull String> getDirectorAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.DIRECTOR);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get iTunes grouping.
    * 
    * @return iTunes grouping.
    */
    @Nullable
    public final Integer getGroupingAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.GROUPING);
    }

   /**
    * Get iTunes grouping.
    * 
    * @return iTunes grouping.
    */
    @Nullable
    public final Long getGroupingAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.GROUPING);
    }

   /**
    * Get iTunes grouping.
    * 
    * @return iTunes grouping.
    */
    @Nullable
    public final LocalDateTime getGroupingAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.GROUPING);
    }

   /**
    * Get iTunes grouping.
    * 
    * @return iTunes grouping.
    */
    @Nullable
    public final LocalTime getGroupingAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.GROUPING);
    }

   /**
    * Get iTunes grouping.
    * 
    * @return iTunes grouping.
    */
    @Nullable
    public final String getGroupingAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.GROUPING);
    }

   /**
    * Get iTunes grouping.
    * 
    * @return iTunes grouping.
    */
    @Nullable
    public final Boolean getGroupingAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.GROUPING);
    }

   /**
    * Get iTunes grouping.
    * 
    * @return iTunes grouping.
    */
    @Nullable
    public final BigInteger getGroupingAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.GROUPING);
    }

   /**
    * Get iTunes grouping.
    * 
    * @return iTunes grouping.
    */
    @Nullable
    public final URL getGroupingAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.GROUPING);
    }

   /**
    * Get iTunes grouping.
    * 
    * @return iTunes grouping.
    */
    @NonNull
    public final List<@NonNull String> getGroupingAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.GROUPING);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Chapters languages in this file, separated by /.
    * 
    * @return Chapters languages in this file, separated by /.
    */
    @Nullable
    public final Integer getOtherLanguageListAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.OTHERLANGUAGELIST);
    }

   /**
    * Get Chapters languages in this file, separated by /.
    * 
    * @return Chapters languages in this file, separated by /.
    */
    @Nullable
    public final Long getOtherLanguageListAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.OTHERLANGUAGELIST);
    }

   /**
    * Get Chapters languages in this file, separated by /.
    * 
    * @return Chapters languages in this file, separated by /.
    */
    @Nullable
    public final LocalDateTime getOtherLanguageListAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.OTHERLANGUAGELIST);
    }

   /**
    * Get Chapters languages in this file, separated by /.
    * 
    * @return Chapters languages in this file, separated by /.
    */
    @Nullable
    public final LocalTime getOtherLanguageListAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.OTHERLANGUAGELIST);
    }

   /**
    * Get Chapters languages in this file, separated by /.
    * 
    * @return Chapters languages in this file, separated by /.
    */
    @Nullable
    public final String getOtherLanguageListAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.OTHERLANGUAGELIST);
    }

   /**
    * Get Chapters languages in this file, separated by /.
    * 
    * @return Chapters languages in this file, separated by /.
    */
    @Nullable
    public final Boolean getOtherLanguageListAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.OTHERLANGUAGELIST);
    }

   /**
    * Get Chapters languages in this file, separated by /.
    * 
    * @return Chapters languages in this file, separated by /.
    */
    @Nullable
    public final BigInteger getOtherLanguageListAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.OTHERLANGUAGELIST);
    }

   /**
    * Get Chapters languages in this file, separated by /.
    * 
    * @return Chapters languages in this file, separated by /.
    */
    @Nullable
    public final URL getOtherLanguageListAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.OTHERLANGUAGELIST);
    }

   /**
    * Get Chapters languages in this file, separated by /.
    * 
    * @return Chapters languages in this file, separated by /.
    */
    @NonNull
    public final List<@NonNull String> getOtherLanguageListAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.OTHERLANGUAGELIST);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Intended to reflect the mood of the item with a few keywords, e.g. Romantic, Sad, Uplifting, etc..
    * 
    * @return Intended to reflect the mood of the item with a few keywords, e.g. Romantic, Sad, Uplifting, etc..
    */
    @Nullable
    public final Integer getMoodAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.MOOD);
    }

   /**
    * Get Intended to reflect the mood of the item with a few keywords, e.g. Romantic, Sad, Uplifting, etc..
    * 
    * @return Intended to reflect the mood of the item with a few keywords, e.g. Romantic, Sad, Uplifting, etc..
    */
    @Nullable
    public final Long getMoodAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.MOOD);
    }

   /**
    * Get Intended to reflect the mood of the item with a few keywords, e.g. Romantic, Sad, Uplifting, etc..
    * 
    * @return Intended to reflect the mood of the item with a few keywords, e.g. Romantic, Sad, Uplifting, etc..
    */
    @Nullable
    public final LocalDateTime getMoodAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.MOOD);
    }

   /**
    * Get Intended to reflect the mood of the item with a few keywords, e.g. Romantic, Sad, Uplifting, etc..
    * 
    * @return Intended to reflect the mood of the item with a few keywords, e.g. Romantic, Sad, Uplifting, etc..
    */
    @Nullable
    public final LocalTime getMoodAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.MOOD);
    }

   /**
    * Get Intended to reflect the mood of the item with a few keywords, e.g. Romantic, Sad, Uplifting, etc..
    * 
    * @return Intended to reflect the mood of the item with a few keywords, e.g. Romantic, Sad, Uplifting, etc..
    */
    @Nullable
    public final String getMoodAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.MOOD);
    }

   /**
    * Get Intended to reflect the mood of the item with a few keywords, e.g. Romantic, Sad, Uplifting, etc..
    * 
    * @return Intended to reflect the mood of the item with a few keywords, e.g. Romantic, Sad, Uplifting, etc..
    */
    @Nullable
    public final Boolean getMoodAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.MOOD);
    }

   /**
    * Get Intended to reflect the mood of the item with a few keywords, e.g. Romantic, Sad, Uplifting, etc..
    * 
    * @return Intended to reflect the mood of the item with a few keywords, e.g. Romantic, Sad, Uplifting, etc..
    */
    @Nullable
    public final BigInteger getMoodAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.MOOD);
    }

   /**
    * Get Intended to reflect the mood of the item with a few keywords, e.g. Romantic, Sad, Uplifting, etc..
    * 
    * @return Intended to reflect the mood of the item with a few keywords, e.g. Romantic, Sad, Uplifting, etc..
    */
    @Nullable
    public final URL getMoodAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.MOOD);
    }

   /**
    * Get Intended to reflect the mood of the item with a few keywords, e.g. Romantic, Sad, Uplifting, etc..
    * 
    * @return Intended to reflect the mood of the item with a few keywords, e.g. Romantic, Sad, Uplifting, etc..
    */
    @NonNull
    public final List<@NonNull String> getMoodAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.MOOD);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final Integer getEncodedApplicationStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ENCODEDAPPLICATIONSTRING);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final Long getEncodedApplicationStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ENCODEDAPPLICATIONSTRING);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final LocalDateTime getEncodedApplicationStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ENCODEDAPPLICATIONSTRING);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final LocalTime getEncodedApplicationStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ENCODEDAPPLICATIONSTRING);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final String getEncodedApplicationStringAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ENCODEDAPPLICATIONSTRING);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final Boolean getEncodedApplicationStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ENCODEDAPPLICATIONSTRING);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final BigInteger getEncodedApplicationStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ENCODEDAPPLICATIONSTRING);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @Nullable
    public final URL getEncodedApplicationStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ENCODEDAPPLICATIONSTRING);
    }

   /**
    * Get Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    * 
    * @return Name of the software package used to create the file, such as Microsoft WaveEdit, trying to have the format 'CompanyName ProductName (OperatingSystem) Version (Date)'.
    */
    @NonNull
    public final List<@NonNull String> getEncodedApplicationStringAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ENCODEDAPPLICATIONSTRING);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get More infos about the album.
    * 
    * @return More infos about the album.
    */
    @Nullable
    public final Integer getAlbumMoreAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ALBUMMORE);
    }

   /**
    * Get More infos about the album.
    * 
    * @return More infos about the album.
    */
    @Nullable
    public final Long getAlbumMoreAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ALBUMMORE);
    }

   /**
    * Get More infos about the album.
    * 
    * @return More infos about the album.
    */
    @Nullable
    public final LocalDateTime getAlbumMoreAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ALBUMMORE);
    }

   /**
    * Get More infos about the album.
    * 
    * @return More infos about the album.
    */
    @Nullable
    public final LocalTime getAlbumMoreAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ALBUMMORE);
    }

   /**
    * Get More infos about the album.
    * 
    * @return More infos about the album.
    */
    @Nullable
    public final String getAlbumMoreAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ALBUMMORE);
    }

   /**
    * Get More infos about the album.
    * 
    * @return More infos about the album.
    */
    @Nullable
    public final Boolean getAlbumMoreAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ALBUMMORE);
    }

   /**
    * Get More infos about the album.
    * 
    * @return More infos about the album.
    */
    @Nullable
    public final BigInteger getAlbumMoreAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ALBUMMORE);
    }

   /**
    * Get More infos about the album.
    * 
    * @return More infos about the album.
    */
    @Nullable
    public final URL getAlbumMoreAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ALBUMMORE);
    }

   /**
    * Get More infos about the album.
    * 
    * @return More infos about the album.
    */
    @NonNull
    public final List<@NonNull String> getAlbumMoreAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ALBUMMORE);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get iTunes compilation.
    * 
    * @return iTunes compilation.
    */
    @Nullable
    public final Integer getCompilationStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.COMPILATIONSTRING);
    }

   /**
    * Get iTunes compilation.
    * 
    * @return iTunes compilation.
    */
    @Nullable
    public final Long getCompilationStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.COMPILATIONSTRING);
    }

   /**
    * Get iTunes compilation.
    * 
    * @return iTunes compilation.
    */
    @Nullable
    public final LocalDateTime getCompilationStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.COMPILATIONSTRING);
    }

   /**
    * Get iTunes compilation.
    * 
    * @return iTunes compilation.
    */
    @Nullable
    public final LocalTime getCompilationStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.COMPILATIONSTRING);
    }

   /**
    * Get iTunes compilation.
    * 
    * @return iTunes compilation.
    */
    @Nullable
    public final String getCompilationStringAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.COMPILATIONSTRING);
    }

   /**
    * Get iTunes compilation.
    * 
    * @return iTunes compilation.
    */
    @Nullable
    public final Boolean getCompilationStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.COMPILATIONSTRING);
    }

   /**
    * Get iTunes compilation.
    * 
    * @return iTunes compilation.
    */
    @Nullable
    public final BigInteger getCompilationStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.COMPILATIONSTRING);
    }

   /**
    * Get iTunes compilation.
    * 
    * @return iTunes compilation.
    */
    @Nullable
    public final URL getCompilationStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.COMPILATIONSTRING);
    }

   /**
    * Get iTunes compilation.
    * 
    * @return iTunes compilation.
    */
    @NonNull
    public final List<@NonNull String> getCompilationStringAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.COMPILATIONSTRING);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Country.
    * 
    * @return Country.
    */
    @Nullable
    public final Integer getCountryAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.COUNTRY);
    }

   /**
    * Get Country.
    * 
    * @return Country.
    */
    @Nullable
    public final Long getCountryAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.COUNTRY);
    }

   /**
    * Get Country.
    * 
    * @return Country.
    */
    @Nullable
    public final LocalDateTime getCountryAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.COUNTRY);
    }

   /**
    * Get Country.
    * 
    * @return Country.
    */
    @Nullable
    public final LocalTime getCountryAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.COUNTRY);
    }

   /**
    * Get Country.
    * 
    * @return Country.
    */
    @Nullable
    public final String getCountryAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.COUNTRY);
    }

   /**
    * Get Country.
    * 
    * @return Country.
    */
    @Nullable
    public final Boolean getCountryAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.COUNTRY);
    }

   /**
    * Get Country.
    * 
    * @return Country.
    */
    @Nullable
    public final BigInteger getCountryAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.COUNTRY);
    }

   /**
    * Get Country.
    * 
    * @return Country.
    */
    @Nullable
    public final URL getCountryAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.COUNTRY);
    }

   /**
    * Get Country.
    * 
    * @return Country.
    */
    @NonNull
    public final List<@NonNull String> getCountryAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.COUNTRY);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get The time that the file was created on the file system (Warning: this field depends of local configuration, do not use it in an international database).
    * 
    * @return The time that the file was created on the file system (Warning: this field depends of local configuration, do not use it in an international database).
    */
    @Nullable
    public final Integer getFileCreatedDateLocalAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.FILECREATEDDATELOCAL);
    }

   /**
    * Get The time that the file was created on the file system (Warning: this field depends of local configuration, do not use it in an international database).
    * 
    * @return The time that the file was created on the file system (Warning: this field depends of local configuration, do not use it in an international database).
    */
    @Nullable
    public final Long getFileCreatedDateLocalAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.FILECREATEDDATELOCAL);
    }

   /**
    * Get The time that the file was created on the file system (Warning: this field depends of local configuration, do not use it in an international database).
    * 
    * @return The time that the file was created on the file system (Warning: this field depends of local configuration, do not use it in an international database).
    */
    @Nullable
    public final LocalDateTime getFileCreatedDateLocalAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.FILECREATEDDATELOCAL);
    }

   /**
    * Get The time that the file was created on the file system (Warning: this field depends of local configuration, do not use it in an international database).
    * 
    * @return The time that the file was created on the file system (Warning: this field depends of local configuration, do not use it in an international database).
    */
    @Nullable
    public final LocalTime getFileCreatedDateLocalAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.FILECREATEDDATELOCAL);
    }

   /**
    * Get The time that the file was created on the file system (Warning: this field depends of local configuration, do not use it in an international database).
    * 
    * @return The time that the file was created on the file system (Warning: this field depends of local configuration, do not use it in an international database).
    */
    @Nullable
    public final String getFileCreatedDateLocalAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.FILECREATEDDATELOCAL);
    }

   /**
    * Get The time that the file was created on the file system (Warning: this field depends of local configuration, do not use it in an international database).
    * 
    * @return The time that the file was created on the file system (Warning: this field depends of local configuration, do not use it in an international database).
    */
    @Nullable
    public final Boolean getFileCreatedDateLocalAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.FILECREATEDDATELOCAL);
    }

   /**
    * Get The time that the file was created on the file system (Warning: this field depends of local configuration, do not use it in an international database).
    * 
    * @return The time that the file was created on the file system (Warning: this field depends of local configuration, do not use it in an international database).
    */
    @Nullable
    public final BigInteger getFileCreatedDateLocalAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.FILECREATEDDATELOCAL);
    }

   /**
    * Get The time that the file was created on the file system (Warning: this field depends of local configuration, do not use it in an international database).
    * 
    * @return The time that the file was created on the file system (Warning: this field depends of local configuration, do not use it in an international database).
    */
    @Nullable
    public final URL getFileCreatedDateLocalAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.FILECREATEDDATELOCAL);
    }

   /**
    * Get The time that the file was created on the file system (Warning: this field depends of local configuration, do not use it in an international database).
    * 
    * @return The time that the file was created on the file system (Warning: this field depends of local configuration, do not use it in an international database).
    */
    @NonNull
    public final List<@NonNull String> getFileCreatedDateLocalAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.FILECREATEDDATELOCAL);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Original lyricist(s)/text writer(s)..
    * 
    * @return Original lyricist(s)/text writer(s)..
    */
    @Nullable
    public final Integer getOriginalLyricistAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ORIGINALLYRICIST);
    }

   /**
    * Get Original lyricist(s)/text writer(s)..
    * 
    * @return Original lyricist(s)/text writer(s)..
    */
    @Nullable
    public final Long getOriginalLyricistAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ORIGINALLYRICIST);
    }

   /**
    * Get Original lyricist(s)/text writer(s)..
    * 
    * @return Original lyricist(s)/text writer(s)..
    */
    @Nullable
    public final LocalDateTime getOriginalLyricistAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ORIGINALLYRICIST);
    }

   /**
    * Get Original lyricist(s)/text writer(s)..
    * 
    * @return Original lyricist(s)/text writer(s)..
    */
    @Nullable
    public final LocalTime getOriginalLyricistAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ORIGINALLYRICIST);
    }

   /**
    * Get Original lyricist(s)/text writer(s)..
    * 
    * @return Original lyricist(s)/text writer(s)..
    */
    @Nullable
    public final String getOriginalLyricistAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ORIGINALLYRICIST);
    }

   /**
    * Get Original lyricist(s)/text writer(s)..
    * 
    * @return Original lyricist(s)/text writer(s)..
    */
    @Nullable
    public final Boolean getOriginalLyricistAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ORIGINALLYRICIST);
    }

   /**
    * Get Original lyricist(s)/text writer(s)..
    * 
    * @return Original lyricist(s)/text writer(s)..
    */
    @Nullable
    public final BigInteger getOriginalLyricistAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ORIGINALLYRICIST);
    }

   /**
    * Get Original lyricist(s)/text writer(s)..
    * 
    * @return Original lyricist(s)/text writer(s)..
    */
    @Nullable
    public final URL getOriginalLyricistAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ORIGINALLYRICIST);
    }

   /**
    * Get Original lyricist(s)/text writer(s)..
    * 
    * @return Original lyricist(s)/text writer(s)..
    */
    @NonNull
    public final List<@NonNull String> getOriginalLyricistAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ORIGINALLYRICIST);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get A short description of the contents, such as Two birds flying..
    * 
    * @return A short description of the contents, such as Two birds flying..
    */
    @Nullable
    public final Integer getDescriptionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.DESCRIPTION);
    }

   /**
    * Get A short description of the contents, such as Two birds flying..
    * 
    * @return A short description of the contents, such as Two birds flying..
    */
    @Nullable
    public final Long getDescriptionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.DESCRIPTION);
    }

   /**
    * Get A short description of the contents, such as Two birds flying..
    * 
    * @return A short description of the contents, such as Two birds flying..
    */
    @Nullable
    public final LocalDateTime getDescriptionAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.DESCRIPTION);
    }

   /**
    * Get A short description of the contents, such as Two birds flying..
    * 
    * @return A short description of the contents, such as Two birds flying..
    */
    @Nullable
    public final LocalTime getDescriptionAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.DESCRIPTION);
    }

   /**
    * Get A short description of the contents, such as Two birds flying..
    * 
    * @return A short description of the contents, such as Two birds flying..
    */
    @Nullable
    public final String getDescriptionAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.DESCRIPTION);
    }

   /**
    * Get A short description of the contents, such as Two birds flying..
    * 
    * @return A short description of the contents, such as Two birds flying..
    */
    @Nullable
    public final Boolean getDescriptionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.DESCRIPTION);
    }

   /**
    * Get A short description of the contents, such as Two birds flying..
    * 
    * @return A short description of the contents, such as Two birds flying..
    */
    @Nullable
    public final BigInteger getDescriptionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.DESCRIPTION);
    }

   /**
    * Get A short description of the contents, such as Two birds flying..
    * 
    * @return A short description of the contents, such as Two birds flying..
    */
    @Nullable
    public final URL getDescriptionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.DESCRIPTION);
    }

   /**
    * Get A short description of the contents, such as Two birds flying..
    * 
    * @return A short description of the contents, such as Two birds flying..
    */
    @NonNull
    public final List<@NonNull String> getDescriptionAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.DESCRIPTION);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Text languages in this file, separated by /.
    * 
    * @return Text languages in this file, separated by /.
    */
    @Nullable
    public final Integer getTextLanguageListAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.TEXTLANGUAGELIST);
    }

   /**
    * Get Text languages in this file, separated by /.
    * 
    * @return Text languages in this file, separated by /.
    */
    @Nullable
    public final Long getTextLanguageListAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.TEXTLANGUAGELIST);
    }

   /**
    * Get Text languages in this file, separated by /.
    * 
    * @return Text languages in this file, separated by /.
    */
    @Nullable
    public final LocalDateTime getTextLanguageListAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.TEXTLANGUAGELIST);
    }

   /**
    * Get Text languages in this file, separated by /.
    * 
    * @return Text languages in this file, separated by /.
    */
    @Nullable
    public final LocalTime getTextLanguageListAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.TEXTLANGUAGELIST);
    }

   /**
    * Get Text languages in this file, separated by /.
    * 
    * @return Text languages in this file, separated by /.
    */
    @Nullable
    public final String getTextLanguageListAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.TEXTLANGUAGELIST);
    }

   /**
    * Get Text languages in this file, separated by /.
    * 
    * @return Text languages in this file, separated by /.
    */
    @Nullable
    public final Boolean getTextLanguageListAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.TEXTLANGUAGELIST);
    }

   /**
    * Get Text languages in this file, separated by /.
    * 
    * @return Text languages in this file, separated by /.
    */
    @Nullable
    public final BigInteger getTextLanguageListAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.TEXTLANGUAGELIST);
    }

   /**
    * Get Text languages in this file, separated by /.
    * 
    * @return Text languages in this file, separated by /.
    */
    @Nullable
    public final URL getTextLanguageListAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.TEXTLANGUAGELIST);
    }

   /**
    * Get Text languages in this file, separated by /.
    * 
    * @return Text languages in this file, separated by /.
    */
    @NonNull
    public final List<@NonNull String> getTextLanguageListAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.TEXTLANGUAGELIST);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Describes whether an image has been cropped and, if so, how it was cropped..
    * 
    * @return Describes whether an image has been cropped and, if so, how it was cropped..
    */
    @Nullable
    public final Integer getCroppedAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.CROPPED);
    }

   /**
    * Get Describes whether an image has been cropped and, if so, how it was cropped..
    * 
    * @return Describes whether an image has been cropped and, if so, how it was cropped..
    */
    @Nullable
    public final Long getCroppedAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.CROPPED);
    }

   /**
    * Get Describes whether an image has been cropped and, if so, how it was cropped..
    * 
    * @return Describes whether an image has been cropped and, if so, how it was cropped..
    */
    @Nullable
    public final LocalDateTime getCroppedAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.CROPPED);
    }

   /**
    * Get Describes whether an image has been cropped and, if so, how it was cropped..
    * 
    * @return Describes whether an image has been cropped and, if so, how it was cropped..
    */
    @Nullable
    public final LocalTime getCroppedAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.CROPPED);
    }

   /**
    * Get Describes whether an image has been cropped and, if so, how it was cropped..
    * 
    * @return Describes whether an image has been cropped and, if so, how it was cropped..
    */
    @Nullable
    public final String getCroppedAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.CROPPED);
    }

   /**
    * Get Describes whether an image has been cropped and, if so, how it was cropped..
    * 
    * @return Describes whether an image has been cropped and, if so, how it was cropped..
    */
    @Nullable
    public final Boolean getCroppedAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.CROPPED);
    }

   /**
    * Get Describes whether an image has been cropped and, if so, how it was cropped..
    * 
    * @return Describes whether an image has been cropped and, if so, how it was cropped..
    */
    @Nullable
    public final BigInteger getCroppedAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.CROPPED);
    }

   /**
    * Get Describes whether an image has been cropped and, if so, how it was cropped..
    * 
    * @return Describes whether an image has been cropped and, if so, how it was cropped..
    */
    @Nullable
    public final URL getCroppedAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.CROPPED);
    }

   /**
    * Get Describes whether an image has been cropped and, if so, how it was cropped..
    * 
    * @return Describes whether an image has been cropped and, if so, how it was cropped..
    */
    @NonNull
    public final List<@NonNull String> getCroppedAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.CROPPED);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Last **Inform** call.
    * 
    * @return Last **Inform** call.
    */
    @Nullable
    public final Integer getInformAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.INFORM);
    }

   /**
    * Get Last **Inform** call.
    * 
    * @return Last **Inform** call.
    */
    @Nullable
    public final Long getInformAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.INFORM);
    }

   /**
    * Get Last **Inform** call.
    * 
    * @return Last **Inform** call.
    */
    @Nullable
    public final LocalDateTime getInformAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.INFORM);
    }

   /**
    * Get Last **Inform** call.
    * 
    * @return Last **Inform** call.
    */
    @Nullable
    public final LocalTime getInformAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.INFORM);
    }

   /**
    * Get Last **Inform** call.
    * 
    * @return Last **Inform** call.
    */
    @Nullable
    public final String getInformAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.INFORM);
    }

   /**
    * Get Last **Inform** call.
    * 
    * @return Last **Inform** call.
    */
    @Nullable
    public final Boolean getInformAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.INFORM);
    }

   /**
    * Get Last **Inform** call.
    * 
    * @return Last **Inform** call.
    */
    @Nullable
    public final BigInteger getInformAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.INFORM);
    }

   /**
    * Get Last **Inform** call.
    * 
    * @return Last **Inform** call.
    */
    @Nullable
    public final URL getInformAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.INFORM);
    }

   /**
    * Get Last **Inform** call.
    * 
    * @return Last **Inform** call.
    */
    @NonNull
    public final List<@NonNull String> getInformAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.INFORM);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get The time/date/year that the recording began..
    * 
    * @return The time/date/year that the recording began..
    */
    @Nullable
    public final Integer getRecordedDateAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.RECORDEDDATE);
    }

   /**
    * Get The time/date/year that the recording began..
    * 
    * @return The time/date/year that the recording began..
    */
    @Nullable
    public final Long getRecordedDateAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.RECORDEDDATE);
    }

   /**
    * Get The time/date/year that the recording began..
    * 
    * @return The time/date/year that the recording began..
    */
    @Nullable
    public final LocalDateTime getRecordedDateAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.RECORDEDDATE);
    }

   /**
    * Get The time/date/year that the recording began..
    * 
    * @return The time/date/year that the recording began..
    */
    @Nullable
    public final LocalTime getRecordedDateAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.RECORDEDDATE);
    }

   /**
    * Get The time/date/year that the recording began..
    * 
    * @return The time/date/year that the recording began..
    */
    @Nullable
    public final String getRecordedDateAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.RECORDEDDATE);
    }

   /**
    * Get The time/date/year that the recording began..
    * 
    * @return The time/date/year that the recording began..
    */
    @Nullable
    public final Boolean getRecordedDateAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.RECORDEDDATE);
    }

   /**
    * Get The time/date/year that the recording began..
    * 
    * @return The time/date/year that the recording began..
    */
    @Nullable
    public final BigInteger getRecordedDateAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.RECORDEDDATE);
    }

   /**
    * Get The time/date/year that the recording began..
    * 
    * @return The time/date/year that the recording began..
    */
    @Nullable
    public final URL getRecordedDateAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.RECORDEDDATE);
    }

   /**
    * Get The time/date/year that the recording began..
    * 
    * @return The time/date/year that the recording began..
    */
    @NonNull
    public final List<@NonNull String> getRecordedDateAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.RECORDEDDATE);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Menu languages in this file, separated by /.
    * 
    * @return Menu languages in this file, separated by /.
    */
    @Nullable
    public final Integer getMenuLanguageListAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.MENULANGUAGELIST);
    }

   /**
    * Get Menu languages in this file, separated by /.
    * 
    * @return Menu languages in this file, separated by /.
    */
    @Nullable
    public final Long getMenuLanguageListAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.MENULANGUAGELIST);
    }

   /**
    * Get Menu languages in this file, separated by /.
    * 
    * @return Menu languages in this file, separated by /.
    */
    @Nullable
    public final LocalDateTime getMenuLanguageListAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.MENULANGUAGELIST);
    }

   /**
    * Get Menu languages in this file, separated by /.
    * 
    * @return Menu languages in this file, separated by /.
    */
    @Nullable
    public final LocalTime getMenuLanguageListAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.MENULANGUAGELIST);
    }

   /**
    * Get Menu languages in this file, separated by /.
    * 
    * @return Menu languages in this file, separated by /.
    */
    @Nullable
    public final String getMenuLanguageListAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.MENULANGUAGELIST);
    }

   /**
    * Get Menu languages in this file, separated by /.
    * 
    * @return Menu languages in this file, separated by /.
    */
    @Nullable
    public final Boolean getMenuLanguageListAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.MENULANGUAGELIST);
    }

   /**
    * Get Menu languages in this file, separated by /.
    * 
    * @return Menu languages in this file, separated by /.
    */
    @Nullable
    public final BigInteger getMenuLanguageListAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.MENULANGUAGELIST);
    }

   /**
    * Get Menu languages in this file, separated by /.
    * 
    * @return Menu languages in this file, separated by /.
    */
    @Nullable
    public final URL getMenuLanguageListAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.MENULANGUAGELIST);
    }

   /**
    * Get Menu languages in this file, separated by /.
    * 
    * @return Menu languages in this file, separated by /.
    */
    @NonNull
    public final List<@NonNull String> getMenuLanguageListAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.MENULANGUAGELIST);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get File size (with measure).
    * 
    * @return File size (with measure).
    */
    @Nullable
    public final Integer getFileSizeStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.FILESIZESTRING);
    }

   /**
    * Get File size (with measure).
    * 
    * @return File size (with measure).
    */
    @Nullable
    public final Long getFileSizeStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.FILESIZESTRING);
    }

   /**
    * Get File size (with measure).
    * 
    * @return File size (with measure).
    */
    @Nullable
    public final LocalDateTime getFileSizeStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.FILESIZESTRING);
    }

   /**
    * Get File size (with measure).
    * 
    * @return File size (with measure).
    */
    @Nullable
    public final LocalTime getFileSizeStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.FILESIZESTRING);
    }

   /**
    * Get File size (with measure).
    * 
    * @return File size (with measure).
    */
    @Nullable
    public final String getFileSizeStringAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.FILESIZESTRING);
    }

   /**
    * Get File size (with measure).
    * 
    * @return File size (with measure).
    */
    @Nullable
    public final Boolean getFileSizeStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.FILESIZESTRING);
    }

   /**
    * Get File size (with measure).
    * 
    * @return File size (with measure).
    */
    @Nullable
    public final BigInteger getFileSizeStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.FILESIZESTRING);
    }

   /**
    * Get File size (with measure).
    * 
    * @return File size (with measure).
    */
    @Nullable
    public final URL getFileSizeStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.FILESIZESTRING);
    }

   /**
    * Get File size (with measure).
    * 
    * @return File size (with measure).
    */
    @NonNull
    public final List<@NonNull String> getFileSizeStringAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.FILESIZESTRING);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Reason for the law rating.
    * 
    * @return Reason for the law rating.
    */
    @Nullable
    public final Integer getLawRatingReasonAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.LAWRATINGREASON);
    }

   /**
    * Get Reason for the law rating.
    * 
    * @return Reason for the law rating.
    */
    @Nullable
    public final Long getLawRatingReasonAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.LAWRATINGREASON);
    }

   /**
    * Get Reason for the law rating.
    * 
    * @return Reason for the law rating.
    */
    @Nullable
    public final LocalDateTime getLawRatingReasonAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.LAWRATINGREASON);
    }

   /**
    * Get Reason for the law rating.
    * 
    * @return Reason for the law rating.
    */
    @Nullable
    public final LocalTime getLawRatingReasonAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.LAWRATINGREASON);
    }

   /**
    * Get Reason for the law rating.
    * 
    * @return Reason for the law rating.
    */
    @Nullable
    public final String getLawRatingReasonAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.LAWRATINGREASON);
    }

   /**
    * Get Reason for the law rating.
    * 
    * @return Reason for the law rating.
    */
    @Nullable
    public final Boolean getLawRatingReasonAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.LAWRATINGREASON);
    }

   /**
    * Get Reason for the law rating.
    * 
    * @return Reason for the law rating.
    */
    @Nullable
    public final BigInteger getLawRatingReasonAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.LAWRATINGREASON);
    }

   /**
    * Get Reason for the law rating.
    * 
    * @return Reason for the law rating.
    */
    @Nullable
    public final URL getLawRatingReasonAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.LAWRATINGREASON);
    }

   /**
    * Get Reason for the law rating.
    * 
    * @return Reason for the law rating.
    */
    @NonNull
    public final List<@NonNull String> getLawRatingReasonAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.LAWRATINGREASON);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Compatible CodecIDs.
    * 
    * @return Compatible CodecIDs.
    */
    @Nullable
    public final Integer getCodecIDCompatibleAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.CODECIDCOMPATIBLE);
    }

   /**
    * Get Compatible CodecIDs.
    * 
    * @return Compatible CodecIDs.
    */
    @Nullable
    public final Long getCodecIDCompatibleAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.CODECIDCOMPATIBLE);
    }

   /**
    * Get Compatible CodecIDs.
    * 
    * @return Compatible CodecIDs.
    */
    @Nullable
    public final LocalDateTime getCodecIDCompatibleAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.CODECIDCOMPATIBLE);
    }

   /**
    * Get Compatible CodecIDs.
    * 
    * @return Compatible CodecIDs.
    */
    @Nullable
    public final LocalTime getCodecIDCompatibleAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.CODECIDCOMPATIBLE);
    }

   /**
    * Get Compatible CodecIDs.
    * 
    * @return Compatible CodecIDs.
    */
    @Nullable
    public final String getCodecIDCompatibleAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.CODECIDCOMPATIBLE);
    }

   /**
    * Get Compatible CodecIDs.
    * 
    * @return Compatible CodecIDs.
    */
    @Nullable
    public final Boolean getCodecIDCompatibleAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.CODECIDCOMPATIBLE);
    }

   /**
    * Get Compatible CodecIDs.
    * 
    * @return Compatible CodecIDs.
    */
    @Nullable
    public final BigInteger getCodecIDCompatibleAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.CODECIDCOMPATIBLE);
    }

   /**
    * Get Compatible CodecIDs.
    * 
    * @return Compatible CodecIDs.
    */
    @Nullable
    public final URL getCodecIDCompatibleAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.CODECIDCOMPATIBLE);
    }

   /**
    * Get Compatible CodecIDs.
    * 
    * @return Compatible CodecIDs.
    */
    @NonNull
    public final List<@NonNull String> getCodecIDCompatibleAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.CODECIDCOMPATIBLE);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Stores dots per inch setting of the digitizer used to produce the file.
    * 
    * @return Stores dots per inch setting of the digitizer used to produce the file.
    */
    @Nullable
    public final Integer getDotsPerInchAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.DOTSPERINCH);
    }

   /**
    * Get Stores dots per inch setting of the digitizer used to produce the file.
    * 
    * @return Stores dots per inch setting of the digitizer used to produce the file.
    */
    @Nullable
    public final Long getDotsPerInchAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.DOTSPERINCH);
    }

   /**
    * Get Stores dots per inch setting of the digitizer used to produce the file.
    * 
    * @return Stores dots per inch setting of the digitizer used to produce the file.
    */
    @Nullable
    public final LocalDateTime getDotsPerInchAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.DOTSPERINCH);
    }

   /**
    * Get Stores dots per inch setting of the digitizer used to produce the file.
    * 
    * @return Stores dots per inch setting of the digitizer used to produce the file.
    */
    @Nullable
    public final LocalTime getDotsPerInchAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.DOTSPERINCH);
    }

   /**
    * Get Stores dots per inch setting of the digitizer used to produce the file.
    * 
    * @return Stores dots per inch setting of the digitizer used to produce the file.
    */
    @Nullable
    public final String getDotsPerInchAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.DOTSPERINCH);
    }

   /**
    * Get Stores dots per inch setting of the digitizer used to produce the file.
    * 
    * @return Stores dots per inch setting of the digitizer used to produce the file.
    */
    @Nullable
    public final Boolean getDotsPerInchAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.DOTSPERINCH);
    }

   /**
    * Get Stores dots per inch setting of the digitizer used to produce the file.
    * 
    * @return Stores dots per inch setting of the digitizer used to produce the file.
    */
    @Nullable
    public final BigInteger getDotsPerInchAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.DOTSPERINCH);
    }

   /**
    * Get Stores dots per inch setting of the digitizer used to produce the file.
    * 
    * @return Stores dots per inch setting of the digitizer used to produce the file.
    */
    @Nullable
    public final URL getDotsPerInchAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.DOTSPERINCH);
    }

   /**
    * Get Stores dots per inch setting of the digitizer used to produce the file.
    * 
    * @return Stores dots per inch setting of the digitizer used to produce the file.
    */
    @NonNull
    public final List<@NonNull String> getDotsPerInchAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.DOTSPERINCH);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get The date, the owner last played an item.
    * 
    * @return The date, the owner last played an item.
    */
    @Nullable
    public final Integer getPlayedLastDateAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.PLAYEDLASTDATE);
    }

   /**
    * Get The date, the owner last played an item.
    * 
    * @return The date, the owner last played an item.
    */
    @Nullable
    public final Long getPlayedLastDateAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.PLAYEDLASTDATE);
    }

   /**
    * Get The date, the owner last played an item.
    * 
    * @return The date, the owner last played an item.
    */
    @Nullable
    public final LocalDateTime getPlayedLastDateAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.PLAYEDLASTDATE);
    }

   /**
    * Get The date, the owner last played an item.
    * 
    * @return The date, the owner last played an item.
    */
    @Nullable
    public final LocalTime getPlayedLastDateAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.PLAYEDLASTDATE);
    }

   /**
    * Get The date, the owner last played an item.
    * 
    * @return The date, the owner last played an item.
    */
    @Nullable
    public final String getPlayedLastDateAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.PLAYEDLASTDATE);
    }

   /**
    * Get The date, the owner last played an item.
    * 
    * @return The date, the owner last played an item.
    */
    @Nullable
    public final Boolean getPlayedLastDateAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.PLAYEDLASTDATE);
    }

   /**
    * Get The date, the owner last played an item.
    * 
    * @return The date, the owner last played an item.
    */
    @Nullable
    public final BigInteger getPlayedLastDateAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.PLAYEDLASTDATE);
    }

   /**
    * Get The date, the owner last played an item.
    * 
    * @return The date, the owner last played an item.
    */
    @Nullable
    public final URL getPlayedLastDateAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.PLAYEDLASTDATE);
    }

   /**
    * Get The date, the owner last played an item.
    * 
    * @return The date, the owner last played an item.
    */
    @NonNull
    public final List<@NonNull String> getPlayedLastDateAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.PLAYEDLASTDATE);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Folder name only.
    * 
    * @return Folder name only.
    */
    @Nullable
    public final Integer getFolderNameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.FOLDERNAME);
    }

   /**
    * Get Folder name only.
    * 
    * @return Folder name only.
    */
    @Nullable
    public final Long getFolderNameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.FOLDERNAME);
    }

   /**
    * Get Folder name only.
    * 
    * @return Folder name only.
    */
    @Nullable
    public final LocalDateTime getFolderNameAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.FOLDERNAME);
    }

   /**
    * Get Folder name only.
    * 
    * @return Folder name only.
    */
    @Nullable
    public final LocalTime getFolderNameAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.FOLDERNAME);
    }

   /**
    * Get Folder name only.
    * 
    * @return Folder name only.
    */
    @Nullable
    public final String getFolderNameAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.FOLDERNAME);
    }

   /**
    * Get Folder name only.
    * 
    * @return Folder name only.
    */
    @Nullable
    public final Boolean getFolderNameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.FOLDERNAME);
    }

   /**
    * Get Folder name only.
    * 
    * @return Folder name only.
    */
    @Nullable
    public final BigInteger getFolderNameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.FOLDERNAME);
    }

   /**
    * Get Folder name only.
    * 
    * @return Folder name only.
    */
    @Nullable
    public final URL getFolderNameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.FOLDERNAME);
    }

   /**
    * Get Folder name only.
    * 
    * @return Folder name only.
    */
    @NonNull
    public final List<@NonNull String> getFolderNameAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.FOLDERNAME);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Name of the codirector..
    * 
    * @return Name of the codirector..
    */
    @Nullable
    public final Integer getCoDirectorAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.CODIRECTOR);
    }

   /**
    * Get Name of the codirector..
    * 
    * @return Name of the codirector..
    */
    @Nullable
    public final Long getCoDirectorAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.CODIRECTOR);
    }

   /**
    * Get Name of the codirector..
    * 
    * @return Name of the codirector..
    */
    @Nullable
    public final LocalDateTime getCoDirectorAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.CODIRECTOR);
    }

   /**
    * Get Name of the codirector..
    * 
    * @return Name of the codirector..
    */
    @Nullable
    public final LocalTime getCoDirectorAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.CODIRECTOR);
    }

   /**
    * Get Name of the codirector..
    * 
    * @return Name of the codirector..
    */
    @Nullable
    public final String getCoDirectorAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.CODIRECTOR);
    }

   /**
    * Get Name of the codirector..
    * 
    * @return Name of the codirector..
    */
    @Nullable
    public final Boolean getCoDirectorAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.CODIRECTOR);
    }

   /**
    * Get Name of the codirector..
    * 
    * @return Name of the codirector..
    */
    @Nullable
    public final BigInteger getCoDirectorAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.CODIRECTOR);
    }

   /**
    * Get Name of the codirector..
    * 
    * @return Name of the codirector..
    */
    @Nullable
    public final URL getCoDirectorAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.CODIRECTOR);
    }

   /**
    * Get Name of the codirector..
    * 
    * @return Name of the codirector..
    */
    @NonNull
    public final List<@NonNull String> getCoDirectorAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.CODIRECTOR);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Number of times an item was played.
    * 
    * @return Number of times an item was played.
    */
    @Nullable
    public final Integer getPlayedCountAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.PLAYEDCOUNT);
    }

   /**
    * Get Number of times an item was played.
    * 
    * @return Number of times an item was played.
    */
    @Nullable
    public final Long getPlayedCountAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.PLAYEDCOUNT);
    }

   /**
    * Get Number of times an item was played.
    * 
    * @return Number of times an item was played.
    */
    @Nullable
    public final LocalDateTime getPlayedCountAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.PLAYEDCOUNT);
    }

   /**
    * Get Number of times an item was played.
    * 
    * @return Number of times an item was played.
    */
    @Nullable
    public final LocalTime getPlayedCountAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.PLAYEDCOUNT);
    }

   /**
    * Get Number of times an item was played.
    * 
    * @return Number of times an item was played.
    */
    @Nullable
    public final String getPlayedCountAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.PLAYEDCOUNT);
    }

   /**
    * Get Number of times an item was played.
    * 
    * @return Number of times an item was played.
    */
    @Nullable
    public final Boolean getPlayedCountAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.PLAYEDCOUNT);
    }

   /**
    * Get Number of times an item was played.
    * 
    * @return Number of times an item was played.
    */
    @Nullable
    public final BigInteger getPlayedCountAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.PLAYEDCOUNT);
    }

   /**
    * Get Number of times an item was played.
    * 
    * @return Number of times an item was played.
    */
    @Nullable
    public final URL getPlayedCountAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.PLAYEDCOUNT);
    }

   /**
    * Get Number of times an item was played.
    * 
    * @return Number of times an item was played.
    */
    @NonNull
    public final List<@NonNull String> getPlayedCountAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.PLAYEDCOUNT);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Number of the stream (base=0).
    * 
    * @return Number of the stream (base=0).
    */
    @Nullable
    public final Integer getStreamKindIDAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.STREAMKINDID);
    }

   /**
    * Get Number of the stream (base=0).
    * 
    * @return Number of the stream (base=0).
    */
    @Nullable
    public final Long getStreamKindIDAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.STREAMKINDID);
    }

   /**
    * Get Number of the stream (base=0).
    * 
    * @return Number of the stream (base=0).
    */
    @Nullable
    public final LocalDateTime getStreamKindIDAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.STREAMKINDID);
    }

   /**
    * Get Number of the stream (base=0).
    * 
    * @return Number of the stream (base=0).
    */
    @Nullable
    public final LocalTime getStreamKindIDAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.STREAMKINDID);
    }

   /**
    * Get Number of the stream (base=0).
    * 
    * @return Number of the stream (base=0).
    */
    @Nullable
    public final String getStreamKindIDAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.STREAMKINDID);
    }

   /**
    * Get Number of the stream (base=0).
    * 
    * @return Number of the stream (base=0).
    */
    @Nullable
    public final Boolean getStreamKindIDAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.STREAMKINDID);
    }

   /**
    * Get Number of the stream (base=0).
    * 
    * @return Number of the stream (base=0).
    */
    @Nullable
    public final BigInteger getStreamKindIDAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.STREAMKINDID);
    }

   /**
    * Get Number of the stream (base=0).
    * 
    * @return Number of the stream (base=0).
    */
    @Nullable
    public final URL getStreamKindIDAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.STREAMKINDID);
    }

   /**
    * Get Number of the stream (base=0).
    * 
    * @return Number of the stream (base=0).
    */
    @NonNull
    public final List<@NonNull String> getStreamKindIDAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.STREAMKINDID);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Folder name only of the last file (in the case of a sequence of files).
    * 
    * @return Folder name only of the last file (in the case of a sequence of files).
    */
    @Nullable
    public final Integer getFolderNameLastAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.FOLDERNAMELAST);
    }

   /**
    * Get Folder name only of the last file (in the case of a sequence of files).
    * 
    * @return Folder name only of the last file (in the case of a sequence of files).
    */
    @Nullable
    public final Long getFolderNameLastAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.FOLDERNAMELAST);
    }

   /**
    * Get Folder name only of the last file (in the case of a sequence of files).
    * 
    * @return Folder name only of the last file (in the case of a sequence of files).
    */
    @Nullable
    public final LocalDateTime getFolderNameLastAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.FOLDERNAMELAST);
    }

   /**
    * Get Folder name only of the last file (in the case of a sequence of files).
    * 
    * @return Folder name only of the last file (in the case of a sequence of files).
    */
    @Nullable
    public final LocalTime getFolderNameLastAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.FOLDERNAMELAST);
    }

   /**
    * Get Folder name only of the last file (in the case of a sequence of files).
    * 
    * @return Folder name only of the last file (in the case of a sequence of files).
    */
    @Nullable
    public final String getFolderNameLastAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.FOLDERNAMELAST);
    }

   /**
    * Get Folder name only of the last file (in the case of a sequence of files).
    * 
    * @return Folder name only of the last file (in the case of a sequence of files).
    */
    @Nullable
    public final Boolean getFolderNameLastAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.FOLDERNAMELAST);
    }

   /**
    * Get Folder name only of the last file (in the case of a sequence of files).
    * 
    * @return Folder name only of the last file (in the case of a sequence of files).
    */
    @Nullable
    public final BigInteger getFolderNameLastAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.FOLDERNAMELAST);
    }

   /**
    * Get Folder name only of the last file (in the case of a sequence of files).
    * 
    * @return Folder name only of the last file (in the case of a sequence of files).
    */
    @Nullable
    public final URL getFolderNameLastAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.FOLDERNAMELAST);
    }

   /**
    * Get Folder name only of the last file (in the case of a sequence of files).
    * 
    * @return Folder name only of the last file (in the case of a sequence of files).
    */
    @NonNull
    public final List<@NonNull String> getFolderNameLastAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.FOLDERNAMELAST);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get A label-specific catalogue number used to identify the release. e.g. TIC 01..
    * 
    * @return A label-specific catalogue number used to identify the release. e.g. TIC 01..
    */
    @Nullable
    public final Integer getCatalogNumberAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.CATALOGNUMBER);
    }

   /**
    * Get A label-specific catalogue number used to identify the release. e.g. TIC 01..
    * 
    * @return A label-specific catalogue number used to identify the release. e.g. TIC 01..
    */
    @Nullable
    public final Long getCatalogNumberAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.CATALOGNUMBER);
    }

   /**
    * Get A label-specific catalogue number used to identify the release. e.g. TIC 01..
    * 
    * @return A label-specific catalogue number used to identify the release. e.g. TIC 01..
    */
    @Nullable
    public final LocalDateTime getCatalogNumberAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.CATALOGNUMBER);
    }

   /**
    * Get A label-specific catalogue number used to identify the release. e.g. TIC 01..
    * 
    * @return A label-specific catalogue number used to identify the release. e.g. TIC 01..
    */
    @Nullable
    public final LocalTime getCatalogNumberAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.CATALOGNUMBER);
    }

   /**
    * Get A label-specific catalogue number used to identify the release. e.g. TIC 01..
    * 
    * @return A label-specific catalogue number used to identify the release. e.g. TIC 01..
    */
    @Nullable
    public final String getCatalogNumberAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.CATALOGNUMBER);
    }

   /**
    * Get A label-specific catalogue number used to identify the release. e.g. TIC 01..
    * 
    * @return A label-specific catalogue number used to identify the release. e.g. TIC 01..
    */
    @Nullable
    public final Boolean getCatalogNumberAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.CATALOGNUMBER);
    }

   /**
    * Get A label-specific catalogue number used to identify the release. e.g. TIC 01..
    * 
    * @return A label-specific catalogue number used to identify the release. e.g. TIC 01..
    */
    @Nullable
    public final BigInteger getCatalogNumberAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.CATALOGNUMBER);
    }

   /**
    * Get A label-specific catalogue number used to identify the release. e.g. TIC 01..
    * 
    * @return A label-specific catalogue number used to identify the release. e.g. TIC 01..
    */
    @Nullable
    public final URL getCatalogNumberAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.CATALOGNUMBER);
    }

   /**
    * Get A label-specific catalogue number used to identify the release. e.g. TIC 01..
    * 
    * @return A label-specific catalogue number used to identify the release. e.g. TIC 01..
    */
    @NonNull
    public final List<@NonNull String> getCatalogNumberAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.CATALOGNUMBER);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Location where track was recorded. (See COMPOSITION_LOCATION for format).
    * 
    * @return Location where track was recorded. (See COMPOSITION_LOCATION for format).
    */
    @Nullable
    public final Integer getRecordedLocationAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.RECORDEDLOCATION);
    }

   /**
    * Get Location where track was recorded. (See COMPOSITION_LOCATION for format).
    * 
    * @return Location where track was recorded. (See COMPOSITION_LOCATION for format).
    */
    @Nullable
    public final Long getRecordedLocationAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.RECORDEDLOCATION);
    }

   /**
    * Get Location where track was recorded. (See COMPOSITION_LOCATION for format).
    * 
    * @return Location where track was recorded. (See COMPOSITION_LOCATION for format).
    */
    @Nullable
    public final LocalDateTime getRecordedLocationAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.RECORDEDLOCATION);
    }

   /**
    * Get Location where track was recorded. (See COMPOSITION_LOCATION for format).
    * 
    * @return Location where track was recorded. (See COMPOSITION_LOCATION for format).
    */
    @Nullable
    public final LocalTime getRecordedLocationAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.RECORDEDLOCATION);
    }

   /**
    * Get Location where track was recorded. (See COMPOSITION_LOCATION for format).
    * 
    * @return Location where track was recorded. (See COMPOSITION_LOCATION for format).
    */
    @Nullable
    public final String getRecordedLocationAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.RECORDEDLOCATION);
    }

   /**
    * Get Location where track was recorded. (See COMPOSITION_LOCATION for format).
    * 
    * @return Location where track was recorded. (See COMPOSITION_LOCATION for format).
    */
    @Nullable
    public final Boolean getRecordedLocationAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.RECORDEDLOCATION);
    }

   /**
    * Get Location where track was recorded. (See COMPOSITION_LOCATION for format).
    * 
    * @return Location where track was recorded. (See COMPOSITION_LOCATION for format).
    */
    @Nullable
    public final BigInteger getRecordedLocationAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.RECORDEDLOCATION);
    }

   /**
    * Get Location where track was recorded. (See COMPOSITION_LOCATION for format).
    * 
    * @return Location where track was recorded. (See COMPOSITION_LOCATION for format).
    */
    @Nullable
    public final URL getRecordedLocationAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.RECORDEDLOCATION);
    }

   /**
    * Get Location where track was recorded. (See COMPOSITION_LOCATION for format).
    * 
    * @return Location where track was recorded. (See COMPOSITION_LOCATION for format).
    */
    @NonNull
    public final List<@NonNull String> getRecordedLocationAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.RECORDEDLOCATION);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get File extension only of the last file (in the case of a sequence of files).
    * 
    * @return File extension only of the last file (in the case of a sequence of files).
    */
    @Nullable
    public final Integer getFileExtensionLastAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.FILEEXTENSIONLAST);
    }

   /**
    * Get File extension only of the last file (in the case of a sequence of files).
    * 
    * @return File extension only of the last file (in the case of a sequence of files).
    */
    @Nullable
    public final Long getFileExtensionLastAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.FILEEXTENSIONLAST);
    }

   /**
    * Get File extension only of the last file (in the case of a sequence of files).
    * 
    * @return File extension only of the last file (in the case of a sequence of files).
    */
    @Nullable
    public final LocalDateTime getFileExtensionLastAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.FILEEXTENSIONLAST);
    }

   /**
    * Get File extension only of the last file (in the case of a sequence of files).
    * 
    * @return File extension only of the last file (in the case of a sequence of files).
    */
    @Nullable
    public final LocalTime getFileExtensionLastAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.FILEEXTENSIONLAST);
    }

   /**
    * Get File extension only of the last file (in the case of a sequence of files).
    * 
    * @return File extension only of the last file (in the case of a sequence of files).
    */
    @Nullable
    public final String getFileExtensionLastAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.FILEEXTENSIONLAST);
    }

   /**
    * Get File extension only of the last file (in the case of a sequence of files).
    * 
    * @return File extension only of the last file (in the case of a sequence of files).
    */
    @Nullable
    public final Boolean getFileExtensionLastAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.FILEEXTENSIONLAST);
    }

   /**
    * Get File extension only of the last file (in the case of a sequence of files).
    * 
    * @return File extension only of the last file (in the case of a sequence of files).
    */
    @Nullable
    public final BigInteger getFileExtensionLastAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.FILEEXTENSIONLAST);
    }

   /**
    * Get File extension only of the last file (in the case of a sequence of files).
    * 
    * @return File extension only of the last file (in the case of a sequence of files).
    */
    @Nullable
    public final URL getFileExtensionLastAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.FILEEXTENSIONLAST);
    }

   /**
    * Get File extension only of the last file (in the case of a sequence of files).
    * 
    * @return File extension only of the last file (in the case of a sequence of files).
    */
    @NonNull
    public final List<@NonNull String> getFileExtensionLastAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.FILEEXTENSIONLAST);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get The date, the owner first played an item.
    * 
    * @return The date, the owner first played an item.
    */
    @Nullable
    public final Integer getPlayedFirstDateAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.PLAYEDFIRSTDATE);
    }

   /**
    * Get The date, the owner first played an item.
    * 
    * @return The date, the owner first played an item.
    */
    @Nullable
    public final Long getPlayedFirstDateAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.PLAYEDFIRSTDATE);
    }

   /**
    * Get The date, the owner first played an item.
    * 
    * @return The date, the owner first played an item.
    */
    @Nullable
    public final LocalDateTime getPlayedFirstDateAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.PLAYEDFIRSTDATE);
    }

   /**
    * Get The date, the owner first played an item.
    * 
    * @return The date, the owner first played an item.
    */
    @Nullable
    public final LocalTime getPlayedFirstDateAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.PLAYEDFIRSTDATE);
    }

   /**
    * Get The date, the owner first played an item.
    * 
    * @return The date, the owner first played an item.
    */
    @Nullable
    public final String getPlayedFirstDateAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.PLAYEDFIRSTDATE);
    }

   /**
    * Get The date, the owner first played an item.
    * 
    * @return The date, the owner first played an item.
    */
    @Nullable
    public final Boolean getPlayedFirstDateAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.PLAYEDFIRSTDATE);
    }

   /**
    * Get The date, the owner first played an item.
    * 
    * @return The date, the owner first played an item.
    */
    @Nullable
    public final BigInteger getPlayedFirstDateAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.PLAYEDFIRSTDATE);
    }

   /**
    * Get The date, the owner first played an item.
    * 
    * @return The date, the owner first played an item.
    */
    @Nullable
    public final URL getPlayedFirstDateAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.PLAYEDFIRSTDATE);
    }

   /**
    * Get The date, the owner first played an item.
    * 
    * @return The date, the owner first played an item.
    */
    @NonNull
    public final List<@NonNull String> getPlayedFirstDateAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.PLAYEDFIRSTDATE);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Link to a description of this format.
    * 
    * @return Link to a description of this format.
    */
    @Nullable
    public final Integer getFormatUrlAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.FORMATURL);
    }

   /**
    * Get Link to a description of this format.
    * 
    * @return Link to a description of this format.
    */
    @Nullable
    public final Long getFormatUrlAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.FORMATURL);
    }

   /**
    * Get Link to a description of this format.
    * 
    * @return Link to a description of this format.
    */
    @Nullable
    public final LocalDateTime getFormatUrlAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.FORMATURL);
    }

   /**
    * Get Link to a description of this format.
    * 
    * @return Link to a description of this format.
    */
    @Nullable
    public final LocalTime getFormatUrlAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.FORMATURL);
    }

   /**
    * Get Link to a description of this format.
    * 
    * @return Link to a description of this format.
    */
    @Nullable
    public final String getFormatUrlAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.FORMATURL);
    }

   /**
    * Get Link to a description of this format.
    * 
    * @return Link to a description of this format.
    */
    @Nullable
    public final Boolean getFormatUrlAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.FORMATURL);
    }

   /**
    * Get Link to a description of this format.
    * 
    * @return Link to a description of this format.
    */
    @Nullable
    public final BigInteger getFormatUrlAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.FORMATURL);
    }

   /**
    * Get Link to a description of this format.
    * 
    * @return Link to a description of this format.
    */
    @Nullable
    public final URL getFormatUrlAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.FORMATURL);
    }

   /**
    * Get Link to a description of this format.
    * 
    * @return Link to a description of this format.
    */
    @NonNull
    public final List<@NonNull String> getFormatUrlAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.FORMATURL);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Frames per second (with measurement).
    * 
    * @return Frames per second (with measurement).
    */
    @Nullable
    public final Integer getFrameRateStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.FRAMERATESTRING);
    }

   /**
    * Get Frames per second (with measurement).
    * 
    * @return Frames per second (with measurement).
    */
    @Nullable
    public final Long getFrameRateStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.FRAMERATESTRING);
    }

   /**
    * Get Frames per second (with measurement).
    * 
    * @return Frames per second (with measurement).
    */
    @Nullable
    public final LocalDateTime getFrameRateStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.FRAMERATESTRING);
    }

   /**
    * Get Frames per second (with measurement).
    * 
    * @return Frames per second (with measurement).
    */
    @Nullable
    public final LocalTime getFrameRateStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.FRAMERATESTRING);
    }

   /**
    * Get Frames per second (with measurement).
    * 
    * @return Frames per second (with measurement).
    */
    @Nullable
    public final String getFrameRateStringAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.FRAMERATESTRING);
    }

   /**
    * Get Frames per second (with measurement).
    * 
    * @return Frames per second (with measurement).
    */
    @Nullable
    public final Boolean getFrameRateStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.FRAMERATESTRING);
    }

   /**
    * Get Frames per second (with measurement).
    * 
    * @return Frames per second (with measurement).
    */
    @Nullable
    public final BigInteger getFrameRateStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.FRAMERATESTRING);
    }

   /**
    * Get Frames per second (with measurement).
    * 
    * @return Frames per second (with measurement).
    */
    @Nullable
    public final URL getFrameRateStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.FRAMERATESTRING);
    }

   /**
    * Get Frames per second (with measurement).
    * 
    * @return Frames per second (with measurement).
    */
    @NonNull
    public final List<@NonNull String> getFrameRateStringAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.FRAMERATESTRING);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Album/Performer/Sort.
    * 
    * @return Album/Performer/Sort.
    */
    @Nullable
    public final Integer getAlbumPerformerSortAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ALBUMPERFORMERSORT);
    }

   /**
    * Get Album/Performer/Sort.
    * 
    * @return Album/Performer/Sort.
    */
    @Nullable
    public final Long getAlbumPerformerSortAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ALBUMPERFORMERSORT);
    }

   /**
    * Get Album/Performer/Sort.
    * 
    * @return Album/Performer/Sort.
    */
    @Nullable
    public final LocalDateTime getAlbumPerformerSortAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ALBUMPERFORMERSORT);
    }

   /**
    * Get Album/Performer/Sort.
    * 
    * @return Album/Performer/Sort.
    */
    @Nullable
    public final LocalTime getAlbumPerformerSortAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ALBUMPERFORMERSORT);
    }

   /**
    * Get Album/Performer/Sort.
    * 
    * @return Album/Performer/Sort.
    */
    @Nullable
    public final String getAlbumPerformerSortAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ALBUMPERFORMERSORT);
    }

   /**
    * Get Album/Performer/Sort.
    * 
    * @return Album/Performer/Sort.
    */
    @Nullable
    public final Boolean getAlbumPerformerSortAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ALBUMPERFORMERSORT);
    }

   /**
    * Get Album/Performer/Sort.
    * 
    * @return Album/Performer/Sort.
    */
    @Nullable
    public final BigInteger getAlbumPerformerSortAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ALBUMPERFORMERSORT);
    }

   /**
    * Get Album/Performer/Sort.
    * 
    * @return Album/Performer/Sort.
    */
    @Nullable
    public final URL getAlbumPerformerSortAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ALBUMPERFORMERSORT);
    }

   /**
    * Get Album/Performer/Sort.
    * 
    * @return Album/Performer/Sort.
    */
    @NonNull
    public final List<@NonNull String> getAlbumPerformerSortAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ALBUMPERFORMERSORT);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Name of the movie. Eg : Starwars, a new hope.
    * 
    * @return Name of the movie. Eg : Starwars, a new hope.
    */
    @Nullable
    public final Integer getMovieAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.MOVIE);
    }

   /**
    * Get Name of the movie. Eg : Starwars, a new hope.
    * 
    * @return Name of the movie. Eg : Starwars, a new hope.
    */
    @Nullable
    public final Long getMovieAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.MOVIE);
    }

   /**
    * Get Name of the movie. Eg : Starwars, a new hope.
    * 
    * @return Name of the movie. Eg : Starwars, a new hope.
    */
    @Nullable
    public final LocalDateTime getMovieAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.MOVIE);
    }

   /**
    * Get Name of the movie. Eg : Starwars, a new hope.
    * 
    * @return Name of the movie. Eg : Starwars, a new hope.
    */
    @Nullable
    public final LocalTime getMovieAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.MOVIE);
    }

   /**
    * Get Name of the movie. Eg : Starwars, a new hope.
    * 
    * @return Name of the movie. Eg : Starwars, a new hope.
    */
    @Nullable
    public final String getMovieAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.MOVIE);
    }

   /**
    * Get Name of the movie. Eg : Starwars, a new hope.
    * 
    * @return Name of the movie. Eg : Starwars, a new hope.
    */
    @Nullable
    public final Boolean getMovieAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.MOVIE);
    }

   /**
    * Get Name of the movie. Eg : Starwars, a new hope.
    * 
    * @return Name of the movie. Eg : Starwars, a new hope.
    */
    @Nullable
    public final BigInteger getMovieAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.MOVIE);
    }

   /**
    * Get Name of the movie. Eg : Starwars, a new hope.
    * 
    * @return Name of the movie. Eg : Starwars, a new hope.
    */
    @Nullable
    public final URL getMovieAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.MOVIE);
    }

   /**
    * Get Name of the movie. Eg : Starwars, a new hope.
    * 
    * @return Name of the movie. Eg : Starwars, a new hope.
    */
    @NonNull
    public final List<@NonNull String> getMovieAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.MOVIE);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Name of the original composer..
    * 
    * @return Name of the original composer..
    */
    @Nullable
    public final Integer getComposerAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.COMPOSER);
    }

   /**
    * Get Name of the original composer..
    * 
    * @return Name of the original composer..
    */
    @Nullable
    public final Long getComposerAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.COMPOSER);
    }

   /**
    * Get Name of the original composer..
    * 
    * @return Name of the original composer..
    */
    @Nullable
    public final LocalDateTime getComposerAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.COMPOSER);
    }

   /**
    * Get Name of the original composer..
    * 
    * @return Name of the original composer..
    */
    @Nullable
    public final LocalTime getComposerAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.COMPOSER);
    }

   /**
    * Get Name of the original composer..
    * 
    * @return Name of the original composer..
    */
    @Nullable
    public final String getComposerAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.COMPOSER);
    }

   /**
    * Get Name of the original composer..
    * 
    * @return Name of the original composer..
    */
    @Nullable
    public final Boolean getComposerAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.COMPOSER);
    }

   /**
    * Get Name of the original composer..
    * 
    * @return Name of the original composer..
    */
    @Nullable
    public final BigInteger getComposerAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.COMPOSER);
    }

   /**
    * Get Name of the original composer..
    * 
    * @return Name of the original composer..
    */
    @Nullable
    public final URL getComposerAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.COMPOSER);
    }

   /**
    * Get Name of the original composer..
    * 
    * @return Name of the original composer..
    */
    @NonNull
    public final List<@NonNull String> getComposerAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.COMPOSER);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Describes whether an image has been cropped and, if so, how it was cropped. e.g. 16:9 to 4:3, top and bottom.
    * 
    * @return Describes whether an image has been cropped and, if so, how it was cropped. e.g. 16:9 to 4:3, top and bottom.
    */
    @Nullable
    public final Integer getOriginalSourceFormCroppedAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ORIGINALSOURCEFORMCROPPED);
    }

   /**
    * Get Describes whether an image has been cropped and, if so, how it was cropped. e.g. 16:9 to 4:3, top and bottom.
    * 
    * @return Describes whether an image has been cropped and, if so, how it was cropped. e.g. 16:9 to 4:3, top and bottom.
    */
    @Nullable
    public final Long getOriginalSourceFormCroppedAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ORIGINALSOURCEFORMCROPPED);
    }

   /**
    * Get Describes whether an image has been cropped and, if so, how it was cropped. e.g. 16:9 to 4:3, top and bottom.
    * 
    * @return Describes whether an image has been cropped and, if so, how it was cropped. e.g. 16:9 to 4:3, top and bottom.
    */
    @Nullable
    public final LocalDateTime getOriginalSourceFormCroppedAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ORIGINALSOURCEFORMCROPPED);
    }

   /**
    * Get Describes whether an image has been cropped and, if so, how it was cropped. e.g. 16:9 to 4:3, top and bottom.
    * 
    * @return Describes whether an image has been cropped and, if so, how it was cropped. e.g. 16:9 to 4:3, top and bottom.
    */
    @Nullable
    public final LocalTime getOriginalSourceFormCroppedAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ORIGINALSOURCEFORMCROPPED);
    }

   /**
    * Get Describes whether an image has been cropped and, if so, how it was cropped. e.g. 16:9 to 4:3, top and bottom.
    * 
    * @return Describes whether an image has been cropped and, if so, how it was cropped. e.g. 16:9 to 4:3, top and bottom.
    */
    @Nullable
    public final String getOriginalSourceFormCroppedAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ORIGINALSOURCEFORMCROPPED);
    }

   /**
    * Get Describes whether an image has been cropped and, if so, how it was cropped. e.g. 16:9 to 4:3, top and bottom.
    * 
    * @return Describes whether an image has been cropped and, if so, how it was cropped. e.g. 16:9 to 4:3, top and bottom.
    */
    @Nullable
    public final Boolean getOriginalSourceFormCroppedAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ORIGINALSOURCEFORMCROPPED);
    }

   /**
    * Get Describes whether an image has been cropped and, if so, how it was cropped. e.g. 16:9 to 4:3, top and bottom.
    * 
    * @return Describes whether an image has been cropped and, if so, how it was cropped. e.g. 16:9 to 4:3, top and bottom.
    */
    @Nullable
    public final BigInteger getOriginalSourceFormCroppedAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ORIGINALSOURCEFORMCROPPED);
    }

   /**
    * Get Describes whether an image has been cropped and, if so, how it was cropped. e.g. 16:9 to 4:3, top and bottom.
    * 
    * @return Describes whether an image has been cropped and, if so, how it was cropped. e.g. 16:9 to 4:3, top and bottom.
    */
    @Nullable
    public final URL getOriginalSourceFormCroppedAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ORIGINALSOURCEFORMCROPPED);
    }

   /**
    * Get Describes whether an image has been cropped and, if so, how it was cropped. e.g. 16:9 to 4:3, top and bottom.
    * 
    * @return Describes whether an image has been cropped and, if so, how it was cropped. e.g. 16:9 to 4:3, top and bottom.
    */
    @NonNull
    public final List<@NonNull String> getOriginalSourceFormCroppedAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ORIGINALSOURCEFORMCROPPED);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Track/Sort.
    * 
    * @return Track/Sort.
    */
    @Nullable
    public final Integer getTrackSortAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.TRACKSORT);
    }

   /**
    * Get Track/Sort.
    * 
    * @return Track/Sort.
    */
    @Nullable
    public final Long getTrackSortAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.TRACKSORT);
    }

   /**
    * Get Track/Sort.
    * 
    * @return Track/Sort.
    */
    @Nullable
    public final LocalDateTime getTrackSortAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.TRACKSORT);
    }

   /**
    * Get Track/Sort.
    * 
    * @return Track/Sort.
    */
    @Nullable
    public final LocalTime getTrackSortAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.TRACKSORT);
    }

   /**
    * Get Track/Sort.
    * 
    * @return Track/Sort.
    */
    @Nullable
    public final String getTrackSortAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.TRACKSORT);
    }

   /**
    * Get Track/Sort.
    * 
    * @return Track/Sort.
    */
    @Nullable
    public final Boolean getTrackSortAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.TRACKSORT);
    }

   /**
    * Get Track/Sort.
    * 
    * @return Track/Sort.
    */
    @Nullable
    public final BigInteger getTrackSortAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.TRACKSORT);
    }

   /**
    * Get Track/Sort.
    * 
    * @return Track/Sort.
    */
    @Nullable
    public final URL getTrackSortAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.TRACKSORT);
    }

   /**
    * Get Track/Sort.
    * 
    * @return Track/Sort.
    */
    @NonNull
    public final List<@NonNull String> getTrackSortAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.TRACKSORT);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Main production studio .
    * 
    * @return Main production studio .
    */
    @Nullable
    public final Integer getProductionStudioAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.PRODUCTIONSTUDIO);
    }

   /**
    * Get Main production studio .
    * 
    * @return Main production studio .
    */
    @Nullable
    public final Long getProductionStudioAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.PRODUCTIONSTUDIO);
    }

   /**
    * Get Main production studio .
    * 
    * @return Main production studio .
    */
    @Nullable
    public final LocalDateTime getProductionStudioAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.PRODUCTIONSTUDIO);
    }

   /**
    * Get Main production studio .
    * 
    * @return Main production studio .
    */
    @Nullable
    public final LocalTime getProductionStudioAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.PRODUCTIONSTUDIO);
    }

   /**
    * Get Main production studio .
    * 
    * @return Main production studio .
    */
    @Nullable
    public final String getProductionStudioAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.PRODUCTIONSTUDIO);
    }

   /**
    * Get Main production studio .
    * 
    * @return Main production studio .
    */
    @Nullable
    public final Boolean getProductionStudioAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.PRODUCTIONSTUDIO);
    }

   /**
    * Get Main production studio .
    * 
    * @return Main production studio .
    */
    @Nullable
    public final BigInteger getProductionStudioAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.PRODUCTIONSTUDIO);
    }

   /**
    * Get Main production studio .
    * 
    * @return Main production studio .
    */
    @Nullable
    public final URL getProductionStudioAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.PRODUCTIONSTUDIO);
    }

   /**
    * Get Main production studio .
    * 
    * @return Main production studio .
    */
    @NonNull
    public final List<@NonNull String> getProductionStudioAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.PRODUCTIONSTUDIO);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Number of audio streams.
    * 
    * @return Number of audio streams.
    */
    @Nullable
    public final Integer getAudioCountAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.AUDIOCOUNT);
    }

   /**
    * Get Number of audio streams.
    * 
    * @return Number of audio streams.
    */
    @Nullable
    public final Long getAudioCountAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.AUDIOCOUNT);
    }

   /**
    * Get Number of audio streams.
    * 
    * @return Number of audio streams.
    */
    @Nullable
    public final LocalDateTime getAudioCountAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.AUDIOCOUNT);
    }

   /**
    * Get Number of audio streams.
    * 
    * @return Number of audio streams.
    */
    @Nullable
    public final LocalTime getAudioCountAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.AUDIOCOUNT);
    }

   /**
    * Get Number of audio streams.
    * 
    * @return Number of audio streams.
    */
    @Nullable
    public final String getAudioCountAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.AUDIOCOUNT);
    }

   /**
    * Get Number of audio streams.
    * 
    * @return Number of audio streams.
    */
    @Nullable
    public final Boolean getAudioCountAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.AUDIOCOUNT);
    }

   /**
    * Get Number of audio streams.
    * 
    * @return Number of audio streams.
    */
    @Nullable
    public final BigInteger getAudioCountAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.AUDIOCOUNT);
    }

   /**
    * Get Number of audio streams.
    * 
    * @return Number of audio streams.
    */
    @Nullable
    public final URL getAudioCountAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.AUDIOCOUNT);
    }

   /**
    * Get Number of audio streams.
    * 
    * @return Number of audio streams.
    */
    @NonNull
    public final List<@NonNull String> getAudioCountAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.AUDIOCOUNT);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Name of the chapter..
    * 
    * @return Name of the chapter..
    */
    @Nullable
    public final Integer getChapterAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.CHAPTER);
    }

   /**
    * Get Name of the chapter..
    * 
    * @return Name of the chapter..
    */
    @Nullable
    public final Long getChapterAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.CHAPTER);
    }

   /**
    * Get Name of the chapter..
    * 
    * @return Name of the chapter..
    */
    @Nullable
    public final LocalDateTime getChapterAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.CHAPTER);
    }

   /**
    * Get Name of the chapter..
    * 
    * @return Name of the chapter..
    */
    @Nullable
    public final LocalTime getChapterAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.CHAPTER);
    }

   /**
    * Get Name of the chapter..
    * 
    * @return Name of the chapter..
    */
    @Nullable
    public final String getChapterAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.CHAPTER);
    }

   /**
    * Get Name of the chapter..
    * 
    * @return Name of the chapter..
    */
    @Nullable
    public final Boolean getChapterAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.CHAPTER);
    }

   /**
    * Get Name of the chapter..
    * 
    * @return Name of the chapter..
    */
    @Nullable
    public final BigInteger getChapterAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.CHAPTER);
    }

   /**
    * Get Name of the chapter..
    * 
    * @return Name of the chapter..
    */
    @Nullable
    public final URL getChapterAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.CHAPTER);
    }

   /**
    * Get Name of the chapter..
    * 
    * @return Name of the chapter..
    */
    @NonNull
    public final List<@NonNull String> getChapterAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.CHAPTER);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get A description of the story line of the item..
    * 
    * @return A description of the story line of the item..
    */
    @Nullable
    public final Integer getSynopsisAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.SYNOPSIS);
    }

   /**
    * Get A description of the story line of the item..
    * 
    * @return A description of the story line of the item..
    */
    @Nullable
    public final Long getSynopsisAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.SYNOPSIS);
    }

   /**
    * Get A description of the story line of the item..
    * 
    * @return A description of the story line of the item..
    */
    @Nullable
    public final LocalDateTime getSynopsisAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.SYNOPSIS);
    }

   /**
    * Get A description of the story line of the item..
    * 
    * @return A description of the story line of the item..
    */
    @Nullable
    public final LocalTime getSynopsisAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.SYNOPSIS);
    }

   /**
    * Get A description of the story line of the item..
    * 
    * @return A description of the story line of the item..
    */
    @Nullable
    public final String getSynopsisAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.SYNOPSIS);
    }

   /**
    * Get A description of the story line of the item..
    * 
    * @return A description of the story line of the item..
    */
    @Nullable
    public final Boolean getSynopsisAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.SYNOPSIS);
    }

   /**
    * Get A description of the story line of the item..
    * 
    * @return A description of the story line of the item..
    */
    @Nullable
    public final BigInteger getSynopsisAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.SYNOPSIS);
    }

   /**
    * Get A description of the story line of the item..
    * 
    * @return A description of the story line of the item..
    */
    @Nullable
    public final URL getSynopsisAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.SYNOPSIS);
    }

   /**
    * Get A description of the story line of the item..
    * 
    * @return A description of the story line of the item..
    */
    @NonNull
    public final List<@NonNull String> getSynopsisAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.SYNOPSIS);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Name of the product.
    * 
    * @return Name of the product.
    */
    @Nullable
    public final Integer getEncodedApplicationNameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ENCODEDAPPLICATIONNAME);
    }

   /**
    * Get Name of the product.
    * 
    * @return Name of the product.
    */
    @Nullable
    public final Long getEncodedApplicationNameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ENCODEDAPPLICATIONNAME);
    }

   /**
    * Get Name of the product.
    * 
    * @return Name of the product.
    */
    @Nullable
    public final LocalDateTime getEncodedApplicationNameAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ENCODEDAPPLICATIONNAME);
    }

   /**
    * Get Name of the product.
    * 
    * @return Name of the product.
    */
    @Nullable
    public final LocalTime getEncodedApplicationNameAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ENCODEDAPPLICATIONNAME);
    }

   /**
    * Get Name of the product.
    * 
    * @return Name of the product.
    */
    @Nullable
    public final String getEncodedApplicationNameAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ENCODEDAPPLICATIONNAME);
    }

   /**
    * Get Name of the product.
    * 
    * @return Name of the product.
    */
    @Nullable
    public final Boolean getEncodedApplicationNameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ENCODEDAPPLICATIONNAME);
    }

   /**
    * Get Name of the product.
    * 
    * @return Name of the product.
    */
    @Nullable
    public final BigInteger getEncodedApplicationNameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ENCODEDAPPLICATIONNAME);
    }

   /**
    * Get Name of the product.
    * 
    * @return Name of the product.
    */
    @Nullable
    public final URL getEncodedApplicationNameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ENCODEDAPPLICATIONNAME);
    }

   /**
    * Get Name of the product.
    * 
    * @return Name of the product.
    */
    @NonNull
    public final List<@NonNull String> getEncodedApplicationNameAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ENCODEDAPPLICATIONNAME);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final Integer getUniqueIDStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.UNIQUEIDSTRING);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final Long getUniqueIDStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.UNIQUEIDSTRING);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final LocalDateTime getUniqueIDStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.UNIQUEIDSTRING);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final LocalTime getUniqueIDStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.UNIQUEIDSTRING);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final String getUniqueIDStringAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.UNIQUEIDSTRING);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final Boolean getUniqueIDStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.UNIQUEIDSTRING);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final BigInteger getUniqueIDStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.UNIQUEIDSTRING);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @Nullable
    public final URL getUniqueIDStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.UNIQUEIDSTRING);
    }

   /**
    * Get The unique ID for this stream, should be copied with stream copy.
    * 
    * @return The unique ID for this stream, should be copied with stream copy.
    */
    @NonNull
    public final List<@NonNull String> getUniqueIDStringAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.UNIQUEIDSTRING);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get The main genre of the audio or video. e.g. classical, ambient-house, synthpop, sci-fi, drama, etc..
    * 
    * @return The main genre of the audio or video. e.g. classical, ambient-house, synthpop, sci-fi, drama, etc..
    */
    @Nullable
    public final Integer getGenreAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.GENRE);
    }

   /**
    * Get The main genre of the audio or video. e.g. classical, ambient-house, synthpop, sci-fi, drama, etc..
    * 
    * @return The main genre of the audio or video. e.g. classical, ambient-house, synthpop, sci-fi, drama, etc..
    */
    @Nullable
    public final Long getGenreAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.GENRE);
    }

   /**
    * Get The main genre of the audio or video. e.g. classical, ambient-house, synthpop, sci-fi, drama, etc..
    * 
    * @return The main genre of the audio or video. e.g. classical, ambient-house, synthpop, sci-fi, drama, etc..
    */
    @Nullable
    public final LocalDateTime getGenreAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.GENRE);
    }

   /**
    * Get The main genre of the audio or video. e.g. classical, ambient-house, synthpop, sci-fi, drama, etc..
    * 
    * @return The main genre of the audio or video. e.g. classical, ambient-house, synthpop, sci-fi, drama, etc..
    */
    @Nullable
    public final LocalTime getGenreAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.GENRE);
    }

   /**
    * Get The main genre of the audio or video. e.g. classical, ambient-house, synthpop, sci-fi, drama, etc..
    * 
    * @return The main genre of the audio or video. e.g. classical, ambient-house, synthpop, sci-fi, drama, etc..
    */
    @Nullable
    public final String getGenreAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.GENRE);
    }

   /**
    * Get The main genre of the audio or video. e.g. classical, ambient-house, synthpop, sci-fi, drama, etc..
    * 
    * @return The main genre of the audio or video. e.g. classical, ambient-house, synthpop, sci-fi, drama, etc..
    */
    @Nullable
    public final Boolean getGenreAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.GENRE);
    }

   /**
    * Get The main genre of the audio or video. e.g. classical, ambient-house, synthpop, sci-fi, drama, etc..
    * 
    * @return The main genre of the audio or video. e.g. classical, ambient-house, synthpop, sci-fi, drama, etc..
    */
    @Nullable
    public final BigInteger getGenreAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.GENRE);
    }

   /**
    * Get The main genre of the audio or video. e.g. classical, ambient-house, synthpop, sci-fi, drama, etc..
    * 
    * @return The main genre of the audio or video. e.g. classical, ambient-house, synthpop, sci-fi, drama, etc..
    */
    @Nullable
    public final URL getGenreAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.GENRE);
    }

   /**
    * Get The main genre of the audio or video. e.g. classical, ambient-house, synthpop, sci-fi, drama, etc..
    * 
    * @return The main genre of the audio or video. e.g. classical, ambient-house, synthpop, sci-fi, drama, etc..
    */
    @NonNull
    public final List<@NonNull String> getGenreAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.GENRE);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get The time/date/year that the item was tranfered to a digitalmedium..
    * 
    * @return The time/date/year that the item was tranfered to a digitalmedium..
    */
    @Nullable
    public final Integer getMasteredDateAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.MASTEREDDATE);
    }

   /**
    * Get The time/date/year that the item was tranfered to a digitalmedium..
    * 
    * @return The time/date/year that the item was tranfered to a digitalmedium..
    */
    @Nullable
    public final Long getMasteredDateAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.MASTEREDDATE);
    }

   /**
    * Get The time/date/year that the item was tranfered to a digitalmedium..
    * 
    * @return The time/date/year that the item was tranfered to a digitalmedium..
    */
    @Nullable
    public final LocalDateTime getMasteredDateAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.MASTEREDDATE);
    }

   /**
    * Get The time/date/year that the item was tranfered to a digitalmedium..
    * 
    * @return The time/date/year that the item was tranfered to a digitalmedium..
    */
    @Nullable
    public final LocalTime getMasteredDateAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.MASTEREDDATE);
    }

   /**
    * Get The time/date/year that the item was tranfered to a digitalmedium..
    * 
    * @return The time/date/year that the item was tranfered to a digitalmedium..
    */
    @Nullable
    public final String getMasteredDateAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.MASTEREDDATE);
    }

   /**
    * Get The time/date/year that the item was tranfered to a digitalmedium..
    * 
    * @return The time/date/year that the item was tranfered to a digitalmedium..
    */
    @Nullable
    public final Boolean getMasteredDateAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.MASTEREDDATE);
    }

   /**
    * Get The time/date/year that the item was tranfered to a digitalmedium..
    * 
    * @return The time/date/year that the item was tranfered to a digitalmedium..
    */
    @Nullable
    public final BigInteger getMasteredDateAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.MASTEREDDATE);
    }

   /**
    * Get The time/date/year that the item was tranfered to a digitalmedium..
    * 
    * @return The time/date/year that the item was tranfered to a digitalmedium..
    */
    @Nullable
    public final URL getMasteredDateAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.MASTEREDDATE);
    }

   /**
    * Get The time/date/year that the item was tranfered to a digitalmedium..
    * 
    * @return The time/date/year that the item was tranfered to a digitalmedium..
    */
    @NonNull
    public final List<@NonNull String> getMasteredDateAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.MASTEREDDATE);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Profile of the Format (old XML: 'Profile@Level' format.
    * 
    * @return Profile of the Format (old XML: 'Profile@Level' format.
    */
    @Nullable
    public final Integer getFormatProfileAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.FORMATPROFILE);
    }

   /**
    * Get Profile of the Format (old XML: 'Profile@Level' format.
    * 
    * @return Profile of the Format (old XML: 'Profile@Level' format.
    */
    @Nullable
    public final Long getFormatProfileAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.FORMATPROFILE);
    }

   /**
    * Get Profile of the Format (old XML: 'Profile@Level' format.
    * 
    * @return Profile of the Format (old XML: 'Profile@Level' format.
    */
    @Nullable
    public final LocalDateTime getFormatProfileAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.FORMATPROFILE);
    }

   /**
    * Get Profile of the Format (old XML: 'Profile@Level' format.
    * 
    * @return Profile of the Format (old XML: 'Profile@Level' format.
    */
    @Nullable
    public final LocalTime getFormatProfileAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.FORMATPROFILE);
    }

   /**
    * Get Profile of the Format (old XML: 'Profile@Level' format.
    * 
    * @return Profile of the Format (old XML: 'Profile@Level' format.
    */
    @Nullable
    public final String getFormatProfileAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.FORMATPROFILE);
    }

   /**
    * Get Profile of the Format (old XML: 'Profile@Level' format.
    * 
    * @return Profile of the Format (old XML: 'Profile@Level' format.
    */
    @Nullable
    public final Boolean getFormatProfileAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.FORMATPROFILE);
    }

   /**
    * Get Profile of the Format (old XML: 'Profile@Level' format.
    * 
    * @return Profile of the Format (old XML: 'Profile@Level' format.
    */
    @Nullable
    public final BigInteger getFormatProfileAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.FORMATPROFILE);
    }

   /**
    * Get Profile of the Format (old XML: 'Profile@Level' format.
    * 
    * @return Profile of the Format (old XML: 'Profile@Level' format.
    */
    @Nullable
    public final URL getFormatProfileAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.FORMATPROFILE);
    }

   /**
    * Get Profile of the Format (old XML: 'Profile@Level' format.
    * 
    * @return Profile of the Format (old XML: 'Profile@Level' format.
    */
    @NonNull
    public final List<@NonNull String> getFormatProfileAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.FORMATPROFILE);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get StreamSize_Demuxed/String1.
    * 
    * @return StreamSize_Demuxed/String1.
    */
    @Nullable
    public final Integer getStreamSizeDemuxedString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING1);
    }

   /**
    * Get StreamSize_Demuxed/String1.
    * 
    * @return StreamSize_Demuxed/String1.
    */
    @Nullable
    public final Long getStreamSizeDemuxedString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING1);
    }

   /**
    * Get StreamSize_Demuxed/String1.
    * 
    * @return StreamSize_Demuxed/String1.
    */
    @Nullable
    public final LocalDateTime getStreamSizeDemuxedString1AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING1);
    }

   /**
    * Get StreamSize_Demuxed/String1.
    * 
    * @return StreamSize_Demuxed/String1.
    */
    @Nullable
    public final LocalTime getStreamSizeDemuxedString1AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING1);
    }

   /**
    * Get StreamSize_Demuxed/String1.
    * 
    * @return StreamSize_Demuxed/String1.
    */
    @Nullable
    public final String getStreamSizeDemuxedString1AsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING1);
    }

   /**
    * Get StreamSize_Demuxed/String1.
    * 
    * @return StreamSize_Demuxed/String1.
    */
    @Nullable
    public final Boolean getStreamSizeDemuxedString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING1);
    }

   /**
    * Get StreamSize_Demuxed/String1.
    * 
    * @return StreamSize_Demuxed/String1.
    */
    @Nullable
    public final BigInteger getStreamSizeDemuxedString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING1);
    }

   /**
    * Get StreamSize_Demuxed/String1.
    * 
    * @return StreamSize_Demuxed/String1.
    */
    @Nullable
    public final URL getStreamSizeDemuxedString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING1);
    }

   /**
    * Get StreamSize_Demuxed/String1.
    * 
    * @return StreamSize_Demuxed/String1.
    */
    @NonNull
    public final List<@NonNull String> getStreamSizeDemuxedString1AsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING1);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get EPG_Positions_End.
    * 
    * @return EPG_Positions_End.
    */
    @Nullable
    public final Integer getEPGPositionsEndAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.EPGPOSITIONSEND);
    }

   /**
    * Get EPG_Positions_End.
    * 
    * @return EPG_Positions_End.
    */
    @Nullable
    public final Long getEPGPositionsEndAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.EPGPOSITIONSEND);
    }

   /**
    * Get EPG_Positions_End.
    * 
    * @return EPG_Positions_End.
    */
    @Nullable
    public final LocalDateTime getEPGPositionsEndAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.EPGPOSITIONSEND);
    }

   /**
    * Get EPG_Positions_End.
    * 
    * @return EPG_Positions_End.
    */
    @Nullable
    public final LocalTime getEPGPositionsEndAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.EPGPOSITIONSEND);
    }

   /**
    * Get EPG_Positions_End.
    * 
    * @return EPG_Positions_End.
    */
    @Nullable
    public final String getEPGPositionsEndAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.EPGPOSITIONSEND);
    }

   /**
    * Get EPG_Positions_End.
    * 
    * @return EPG_Positions_End.
    */
    @Nullable
    public final Boolean getEPGPositionsEndAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.EPGPOSITIONSEND);
    }

   /**
    * Get EPG_Positions_End.
    * 
    * @return EPG_Positions_End.
    */
    @Nullable
    public final BigInteger getEPGPositionsEndAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.EPGPOSITIONSEND);
    }

   /**
    * Get EPG_Positions_End.
    * 
    * @return EPG_Positions_End.
    */
    @Nullable
    public final URL getEPGPositionsEndAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.EPGPOSITIONSEND);
    }

   /**
    * Get EPG_Positions_End.
    * 
    * @return EPG_Positions_End.
    */
    @NonNull
    public final List<@NonNull String> getEPGPositionsEndAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.EPGPOSITIONSEND);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get StreamSize_Demuxed/String2.
    * 
    * @return StreamSize_Demuxed/String2.
    */
    @Nullable
    public final Integer getStreamSizeDemuxedString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING2);
    }

   /**
    * Get StreamSize_Demuxed/String2.
    * 
    * @return StreamSize_Demuxed/String2.
    */
    @Nullable
    public final Long getStreamSizeDemuxedString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING2);
    }

   /**
    * Get StreamSize_Demuxed/String2.
    * 
    * @return StreamSize_Demuxed/String2.
    */
    @Nullable
    public final LocalDateTime getStreamSizeDemuxedString2AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING2);
    }

   /**
    * Get StreamSize_Demuxed/String2.
    * 
    * @return StreamSize_Demuxed/String2.
    */
    @Nullable
    public final LocalTime getStreamSizeDemuxedString2AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING2);
    }

   /**
    * Get StreamSize_Demuxed/String2.
    * 
    * @return StreamSize_Demuxed/String2.
    */
    @Nullable
    public final String getStreamSizeDemuxedString2AsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING2);
    }

   /**
    * Get StreamSize_Demuxed/String2.
    * 
    * @return StreamSize_Demuxed/String2.
    */
    @Nullable
    public final Boolean getStreamSizeDemuxedString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING2);
    }

   /**
    * Get StreamSize_Demuxed/String2.
    * 
    * @return StreamSize_Demuxed/String2.
    */
    @Nullable
    public final BigInteger getStreamSizeDemuxedString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING2);
    }

   /**
    * Get StreamSize_Demuxed/String2.
    * 
    * @return StreamSize_Demuxed/String2.
    */
    @Nullable
    public final URL getStreamSizeDemuxedString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING2);
    }

   /**
    * Get StreamSize_Demuxed/String2.
    * 
    * @return StreamSize_Demuxed/String2.
    */
    @NonNull
    public final List<@NonNull String> getStreamSizeDemuxedString2AsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING2);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get StreamSize_Demuxed/String3.
    * 
    * @return StreamSize_Demuxed/String3.
    */
    @Nullable
    public final Integer getStreamSizeDemuxedString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING3);
    }

   /**
    * Get StreamSize_Demuxed/String3.
    * 
    * @return StreamSize_Demuxed/String3.
    */
    @Nullable
    public final Long getStreamSizeDemuxedString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING3);
    }

   /**
    * Get StreamSize_Demuxed/String3.
    * 
    * @return StreamSize_Demuxed/String3.
    */
    @Nullable
    public final LocalDateTime getStreamSizeDemuxedString3AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING3);
    }

   /**
    * Get StreamSize_Demuxed/String3.
    * 
    * @return StreamSize_Demuxed/String3.
    */
    @Nullable
    public final LocalTime getStreamSizeDemuxedString3AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING3);
    }

   /**
    * Get StreamSize_Demuxed/String3.
    * 
    * @return StreamSize_Demuxed/String3.
    */
    @Nullable
    public final String getStreamSizeDemuxedString3AsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING3);
    }

   /**
    * Get StreamSize_Demuxed/String3.
    * 
    * @return StreamSize_Demuxed/String3.
    */
    @Nullable
    public final Boolean getStreamSizeDemuxedString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING3);
    }

   /**
    * Get StreamSize_Demuxed/String3.
    * 
    * @return StreamSize_Demuxed/String3.
    */
    @Nullable
    public final BigInteger getStreamSizeDemuxedString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING3);
    }

   /**
    * Get StreamSize_Demuxed/String3.
    * 
    * @return StreamSize_Demuxed/String3.
    */
    @Nullable
    public final URL getStreamSizeDemuxedString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING3);
    }

   /**
    * Get StreamSize_Demuxed/String3.
    * 
    * @return StreamSize_Demuxed/String3.
    */
    @NonNull
    public final List<@NonNull String> getStreamSizeDemuxedString3AsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING3);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get StreamSize_Demuxed/String4.
    * 
    * @return StreamSize_Demuxed/String4.
    */
    @Nullable
    public final Integer getStreamSizeDemuxedString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING4);
    }

   /**
    * Get StreamSize_Demuxed/String4.
    * 
    * @return StreamSize_Demuxed/String4.
    */
    @Nullable
    public final Long getStreamSizeDemuxedString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING4);
    }

   /**
    * Get StreamSize_Demuxed/String4.
    * 
    * @return StreamSize_Demuxed/String4.
    */
    @Nullable
    public final LocalDateTime getStreamSizeDemuxedString4AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING4);
    }

   /**
    * Get StreamSize_Demuxed/String4.
    * 
    * @return StreamSize_Demuxed/String4.
    */
    @Nullable
    public final LocalTime getStreamSizeDemuxedString4AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING4);
    }

   /**
    * Get StreamSize_Demuxed/String4.
    * 
    * @return StreamSize_Demuxed/String4.
    */
    @Nullable
    public final String getStreamSizeDemuxedString4AsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING4);
    }

   /**
    * Get StreamSize_Demuxed/String4.
    * 
    * @return StreamSize_Demuxed/String4.
    */
    @Nullable
    public final Boolean getStreamSizeDemuxedString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING4);
    }

   /**
    * Get StreamSize_Demuxed/String4.
    * 
    * @return StreamSize_Demuxed/String4.
    */
    @Nullable
    public final BigInteger getStreamSizeDemuxedString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING4);
    }

   /**
    * Get StreamSize_Demuxed/String4.
    * 
    * @return StreamSize_Demuxed/String4.
    */
    @Nullable
    public final URL getStreamSizeDemuxedString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING4);
    }

   /**
    * Get StreamSize_Demuxed/String4.
    * 
    * @return StreamSize_Demuxed/String4.
    */
    @NonNull
    public final List<@NonNull String> getStreamSizeDemuxedString4AsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING4);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    * 
    * @return StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    */
    @Nullable
    public final Integer getStreamSizeDemuxedString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING5);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    * 
    * @return StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    */
    @Nullable
    public final Long getStreamSizeDemuxedString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING5);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    * 
    * @return StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    */
    @Nullable
    public final LocalDateTime getStreamSizeDemuxedString5AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING5);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    * 
    * @return StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    */
    @Nullable
    public final LocalTime getStreamSizeDemuxedString5AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING5);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    * 
    * @return StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    */
    @Nullable
    public final String getStreamSizeDemuxedString5AsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING5);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    * 
    * @return StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    */
    @Nullable
    public final Boolean getStreamSizeDemuxedString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING5);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    * 
    * @return StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    */
    @Nullable
    public final BigInteger getStreamSizeDemuxedString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING5);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    * 
    * @return StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    */
    @Nullable
    public final URL getStreamSizeDemuxedString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING5);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    * 
    * @return StreamSize_Demuxed in with percentage value (note: theoritical value, not for real use).
    */
    @NonNull
    public final List<@NonNull String> getStreamSizeDemuxedString5AsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING5);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Encryption_InitializationVector.
    * 
    * @return Encryption_InitializationVector.
    */
    @Nullable
    public final Integer getEncryptionInitializationVectorAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ENCRYPTIONINITIALIZATIONVECTOR);
    }

   /**
    * Get Encryption_InitializationVector.
    * 
    * @return Encryption_InitializationVector.
    */
    @Nullable
    public final Long getEncryptionInitializationVectorAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ENCRYPTIONINITIALIZATIONVECTOR);
    }

   /**
    * Get Encryption_InitializationVector.
    * 
    * @return Encryption_InitializationVector.
    */
    @Nullable
    public final LocalDateTime getEncryptionInitializationVectorAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ENCRYPTIONINITIALIZATIONVECTOR);
    }

   /**
    * Get Encryption_InitializationVector.
    * 
    * @return Encryption_InitializationVector.
    */
    @Nullable
    public final LocalTime getEncryptionInitializationVectorAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ENCRYPTIONINITIALIZATIONVECTOR);
    }

   /**
    * Get Encryption_InitializationVector.
    * 
    * @return Encryption_InitializationVector.
    */
    @Nullable
    public final String getEncryptionInitializationVectorAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ENCRYPTIONINITIALIZATIONVECTOR);
    }

   /**
    * Get Encryption_InitializationVector.
    * 
    * @return Encryption_InitializationVector.
    */
    @Nullable
    public final Boolean getEncryptionInitializationVectorAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ENCRYPTIONINITIALIZATIONVECTOR);
    }

   /**
    * Get Encryption_InitializationVector.
    * 
    * @return Encryption_InitializationVector.
    */
    @Nullable
    public final BigInteger getEncryptionInitializationVectorAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ENCRYPTIONINITIALIZATIONVECTOR);
    }

   /**
    * Get Encryption_InitializationVector.
    * 
    * @return Encryption_InitializationVector.
    */
    @Nullable
    public final URL getEncryptionInitializationVectorAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ENCRYPTIONINITIALIZATIONVECTOR);
    }

   /**
    * Get Encryption_InitializationVector.
    * 
    * @return Encryption_InitializationVector.
    */
    @NonNull
    public final List<@NonNull String> getEncryptionInitializationVectorAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ENCRYPTIONINITIALIZATIONVECTOR);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get The gain to apply to reach 89dB SPL on playback.
    * 
    * @return The gain to apply to reach 89dB SPL on playback.
    */
    @Nullable
    public final Integer getAlbumReplayGainGainAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ALBUMREPLAYGAINGAIN);
    }

   /**
    * Get The gain to apply to reach 89dB SPL on playback.
    * 
    * @return The gain to apply to reach 89dB SPL on playback.
    */
    @Nullable
    public final Long getAlbumReplayGainGainAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ALBUMREPLAYGAINGAIN);
    }

   /**
    * Get The gain to apply to reach 89dB SPL on playback.
    * 
    * @return The gain to apply to reach 89dB SPL on playback.
    */
    @Nullable
    public final LocalDateTime getAlbumReplayGainGainAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ALBUMREPLAYGAINGAIN);
    }

   /**
    * Get The gain to apply to reach 89dB SPL on playback.
    * 
    * @return The gain to apply to reach 89dB SPL on playback.
    */
    @Nullable
    public final LocalTime getAlbumReplayGainGainAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ALBUMREPLAYGAINGAIN);
    }

   /**
    * Get The gain to apply to reach 89dB SPL on playback.
    * 
    * @return The gain to apply to reach 89dB SPL on playback.
    */
    @Nullable
    public final String getAlbumReplayGainGainAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ALBUMREPLAYGAINGAIN);
    }

   /**
    * Get The gain to apply to reach 89dB SPL on playback.
    * 
    * @return The gain to apply to reach 89dB SPL on playback.
    */
    @Nullable
    public final Boolean getAlbumReplayGainGainAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ALBUMREPLAYGAINGAIN);
    }

   /**
    * Get The gain to apply to reach 89dB SPL on playback.
    * 
    * @return The gain to apply to reach 89dB SPL on playback.
    */
    @Nullable
    public final BigInteger getAlbumReplayGainGainAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ALBUMREPLAYGAINGAIN);
    }

   /**
    * Get The gain to apply to reach 89dB SPL on playback.
    * 
    * @return The gain to apply to reach 89dB SPL on playback.
    */
    @Nullable
    public final URL getAlbumReplayGainGainAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ALBUMREPLAYGAINGAIN);
    }

   /**
    * Get The gain to apply to reach 89dB SPL on playback.
    * 
    * @return The gain to apply to reach 89dB SPL on playback.
    */
    @NonNull
    public final List<@NonNull String> getAlbumReplayGainGainAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ALBUMREPLAYGAINGAIN);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Level of the Format (only MIXML).
    * 
    * @return Level of the Format (only MIXML).
    */
    @Nullable
    public final Integer getFormatLevelAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.FORMATLEVEL);
    }

   /**
    * Get Level of the Format (only MIXML).
    * 
    * @return Level of the Format (only MIXML).
    */
    @Nullable
    public final Long getFormatLevelAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.FORMATLEVEL);
    }

   /**
    * Get Level of the Format (only MIXML).
    * 
    * @return Level of the Format (only MIXML).
    */
    @Nullable
    public final LocalDateTime getFormatLevelAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.FORMATLEVEL);
    }

   /**
    * Get Level of the Format (only MIXML).
    * 
    * @return Level of the Format (only MIXML).
    */
    @Nullable
    public final LocalTime getFormatLevelAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.FORMATLEVEL);
    }

   /**
    * Get Level of the Format (only MIXML).
    * 
    * @return Level of the Format (only MIXML).
    */
    @Nullable
    public final String getFormatLevelAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.FORMATLEVEL);
    }

   /**
    * Get Level of the Format (only MIXML).
    * 
    * @return Level of the Format (only MIXML).
    */
    @Nullable
    public final Boolean getFormatLevelAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.FORMATLEVEL);
    }

   /**
    * Get Level of the Format (only MIXML).
    * 
    * @return Level of the Format (only MIXML).
    */
    @Nullable
    public final BigInteger getFormatLevelAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.FORMATLEVEL);
    }

   /**
    * Get Level of the Format (only MIXML).
    * 
    * @return Level of the Format (only MIXML).
    */
    @Nullable
    public final URL getFormatLevelAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.FORMATLEVEL);
    }

   /**
    * Get Level of the Format (only MIXML).
    * 
    * @return Level of the Format (only MIXML).
    */
    @NonNull
    public final List<@NonNull String> getFormatLevelAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.FORMATLEVEL);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get StreamSize_Demuxed in with percentage value.
    * 
    * @return StreamSize_Demuxed in with percentage value.
    */
    @Nullable
    public final Integer getStreamSizeDemuxedStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value.
    * 
    * @return StreamSize_Demuxed in with percentage value.
    */
    @Nullable
    public final Long getStreamSizeDemuxedStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value.
    * 
    * @return StreamSize_Demuxed in with percentage value.
    */
    @Nullable
    public final LocalDateTime getStreamSizeDemuxedStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value.
    * 
    * @return StreamSize_Demuxed in with percentage value.
    */
    @Nullable
    public final LocalTime getStreamSizeDemuxedStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value.
    * 
    * @return StreamSize_Demuxed in with percentage value.
    */
    @Nullable
    public final String getStreamSizeDemuxedStringAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value.
    * 
    * @return StreamSize_Demuxed in with percentage value.
    */
    @Nullable
    public final Boolean getStreamSizeDemuxedStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value.
    * 
    * @return StreamSize_Demuxed in with percentage value.
    */
    @Nullable
    public final BigInteger getStreamSizeDemuxedStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value.
    * 
    * @return StreamSize_Demuxed in with percentage value.
    */
    @Nullable
    public final URL getStreamSizeDemuxedStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING);
    }

   /**
    * Get StreamSize_Demuxed in with percentage value.
    * 
    * @return StreamSize_Demuxed in with percentage value.
    */
    @NonNull
    public final List<@NonNull String> getStreamSizeDemuxedStringAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.STREAMSIZEDEMUXEDSTRING);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Name of an audio-album. Eg : The joshua tree.
    * 
    * @return Name of an audio-album. Eg : The joshua tree.
    */
    @Nullable
    public final Integer getAlbumAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ALBUM);
    }

   /**
    * Get Name of an audio-album. Eg : The joshua tree.
    * 
    * @return Name of an audio-album. Eg : The joshua tree.
    */
    @Nullable
    public final Long getAlbumAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ALBUM);
    }

   /**
    * Get Name of an audio-album. Eg : The joshua tree.
    * 
    * @return Name of an audio-album. Eg : The joshua tree.
    */
    @Nullable
    public final LocalDateTime getAlbumAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ALBUM);
    }

   /**
    * Get Name of an audio-album. Eg : The joshua tree.
    * 
    * @return Name of an audio-album. Eg : The joshua tree.
    */
    @Nullable
    public final LocalTime getAlbumAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ALBUM);
    }

   /**
    * Get Name of an audio-album. Eg : The joshua tree.
    * 
    * @return Name of an audio-album. Eg : The joshua tree.
    */
    @Nullable
    public final String getAlbumAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ALBUM);
    }

   /**
    * Get Name of an audio-album. Eg : The joshua tree.
    * 
    * @return Name of an audio-album. Eg : The joshua tree.
    */
    @Nullable
    public final Boolean getAlbumAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ALBUM);
    }

   /**
    * Get Name of an audio-album. Eg : The joshua tree.
    * 
    * @return Name of an audio-album. Eg : The joshua tree.
    */
    @Nullable
    public final BigInteger getAlbumAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ALBUM);
    }

   /**
    * Get Name of an audio-album. Eg : The joshua tree.
    * 
    * @return Name of an audio-album. Eg : The joshua tree.
    */
    @Nullable
    public final URL getAlbumAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ALBUM);
    }

   /**
    * Get Name of an audio-album. Eg : The joshua tree.
    * 
    * @return Name of an audio-album. Eg : The joshua tree.
    */
    @NonNull
    public final List<@NonNull String> getAlbumAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ALBUM);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Text Codecs in this file with popular name (hint),separated by /.
    * 
    * @return Text Codecs in this file with popular name (hint),separated by /.
    */
    @Nullable
    public final Integer getTextFormatWithHintListAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.TEXTFORMATWITHHINTLIST);
    }

   /**
    * Get Text Codecs in this file with popular name (hint),separated by /.
    * 
    * @return Text Codecs in this file with popular name (hint),separated by /.
    */
    @Nullable
    public final Long getTextFormatWithHintListAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.TEXTFORMATWITHHINTLIST);
    }

   /**
    * Get Text Codecs in this file with popular name (hint),separated by /.
    * 
    * @return Text Codecs in this file with popular name (hint),separated by /.
    */
    @Nullable
    public final LocalDateTime getTextFormatWithHintListAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.TEXTFORMATWITHHINTLIST);
    }

   /**
    * Get Text Codecs in this file with popular name (hint),separated by /.
    * 
    * @return Text Codecs in this file with popular name (hint),separated by /.
    */
    @Nullable
    public final LocalTime getTextFormatWithHintListAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.TEXTFORMATWITHHINTLIST);
    }

   /**
    * Get Text Codecs in this file with popular name (hint),separated by /.
    * 
    * @return Text Codecs in this file with popular name (hint),separated by /.
    */
    @Nullable
    public final String getTextFormatWithHintListAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.TEXTFORMATWITHHINTLIST);
    }

   /**
    * Get Text Codecs in this file with popular name (hint),separated by /.
    * 
    * @return Text Codecs in this file with popular name (hint),separated by /.
    */
    @Nullable
    public final Boolean getTextFormatWithHintListAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.TEXTFORMATWITHHINTLIST);
    }

   /**
    * Get Text Codecs in this file with popular name (hint),separated by /.
    * 
    * @return Text Codecs in this file with popular name (hint),separated by /.
    */
    @Nullable
    public final BigInteger getTextFormatWithHintListAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.TEXTFORMATWITHHINTLIST);
    }

   /**
    * Get Text Codecs in this file with popular name (hint),separated by /.
    * 
    * @return Text Codecs in this file with popular name (hint),separated by /.
    */
    @Nullable
    public final URL getTextFormatWithHintListAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.TEXTFORMATWITHHINTLIST);
    }

   /**
    * Get Text Codecs in this file with popular name (hint),separated by /.
    * 
    * @return Text Codecs in this file with popular name (hint),separated by /.
    */
    @NonNull
    public final List<@NonNull String> getTextFormatWithHintListAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.TEXTFORMATWITHHINTLIST);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Minimum Bit rate (with measurement).
    * 
    * @return Minimum Bit rate (with measurement).
    */
    @Nullable
    public final Integer getOverallBitRateMinimumStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.OVERALLBITRATEMINIMUMSTRING);
    }

   /**
    * Get Minimum Bit rate (with measurement).
    * 
    * @return Minimum Bit rate (with measurement).
    */
    @Nullable
    public final Long getOverallBitRateMinimumStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.OVERALLBITRATEMINIMUMSTRING);
    }

   /**
    * Get Minimum Bit rate (with measurement).
    * 
    * @return Minimum Bit rate (with measurement).
    */
    @Nullable
    public final LocalDateTime getOverallBitRateMinimumStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.OVERALLBITRATEMINIMUMSTRING);
    }

   /**
    * Get Minimum Bit rate (with measurement).
    * 
    * @return Minimum Bit rate (with measurement).
    */
    @Nullable
    public final LocalTime getOverallBitRateMinimumStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.OVERALLBITRATEMINIMUMSTRING);
    }

   /**
    * Get Minimum Bit rate (with measurement).
    * 
    * @return Minimum Bit rate (with measurement).
    */
    @Nullable
    public final String getOverallBitRateMinimumStringAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.OVERALLBITRATEMINIMUMSTRING);
    }

   /**
    * Get Minimum Bit rate (with measurement).
    * 
    * @return Minimum Bit rate (with measurement).
    */
    @Nullable
    public final Boolean getOverallBitRateMinimumStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.OVERALLBITRATEMINIMUMSTRING);
    }

   /**
    * Get Minimum Bit rate (with measurement).
    * 
    * @return Minimum Bit rate (with measurement).
    */
    @Nullable
    public final BigInteger getOverallBitRateMinimumStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.OVERALLBITRATEMINIMUMSTRING);
    }

   /**
    * Get Minimum Bit rate (with measurement).
    * 
    * @return Minimum Bit rate (with measurement).
    */
    @Nullable
    public final URL getOverallBitRateMinimumStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.OVERALLBITRATEMINIMUMSTRING);
    }

   /**
    * Get Minimum Bit rate (with measurement).
    * 
    * @return Minimum Bit rate (with measurement).
    */
    @NonNull
    public final List<@NonNull String> getOverallBitRateMinimumStringAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.OVERALLBITRATEMINIMUMSTRING);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Copyright attribution..
    * 
    * @return Copyright attribution..
    */
    @Nullable
    public final Integer getCopyrightAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.COPYRIGHT);
    }

   /**
    * Get Copyright attribution..
    * 
    * @return Copyright attribution..
    */
    @Nullable
    public final Long getCopyrightAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.COPYRIGHT);
    }

   /**
    * Get Copyright attribution..
    * 
    * @return Copyright attribution..
    */
    @Nullable
    public final LocalDateTime getCopyrightAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.COPYRIGHT);
    }

   /**
    * Get Copyright attribution..
    * 
    * @return Copyright attribution..
    */
    @Nullable
    public final LocalTime getCopyrightAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.COPYRIGHT);
    }

   /**
    * Get Copyright attribution..
    * 
    * @return Copyright attribution..
    */
    @Nullable
    public final String getCopyrightAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.COPYRIGHT);
    }

   /**
    * Get Copyright attribution..
    * 
    * @return Copyright attribution..
    */
    @Nullable
    public final Boolean getCopyrightAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.COPYRIGHT);
    }

   /**
    * Get Copyright attribution..
    * 
    * @return Copyright attribution..
    */
    @Nullable
    public final BigInteger getCopyrightAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.COPYRIGHT);
    }

   /**
    * Get Copyright attribution..
    * 
    * @return Copyright attribution..
    */
    @Nullable
    public final URL getCopyrightAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.COPYRIGHT);
    }

   /**
    * Get Copyright attribution..
    * 
    * @return Copyright attribution..
    */
    @NonNull
    public final List<@NonNull String> getCopyrightAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.COPYRIGHT);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Count of streams of that kind available.
    * 
    * @return Count of streams of that kind available.
    */
    @Nullable
    public final Integer getStreamCountAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.STREAMCOUNT);
    }

   /**
    * Get Count of streams of that kind available.
    * 
    * @return Count of streams of that kind available.
    */
    @Nullable
    public final Long getStreamCountAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.STREAMCOUNT);
    }

   /**
    * Get Count of streams of that kind available.
    * 
    * @return Count of streams of that kind available.
    */
    @Nullable
    public final LocalDateTime getStreamCountAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.STREAMCOUNT);
    }

   /**
    * Get Count of streams of that kind available.
    * 
    * @return Count of streams of that kind available.
    */
    @Nullable
    public final LocalTime getStreamCountAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.STREAMCOUNT);
    }

   /**
    * Get Count of streams of that kind available.
    * 
    * @return Count of streams of that kind available.
    */
    @Nullable
    public final String getStreamCountAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.STREAMCOUNT);
    }

   /**
    * Get Count of streams of that kind available.
    * 
    * @return Count of streams of that kind available.
    */
    @Nullable
    public final Boolean getStreamCountAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.STREAMCOUNT);
    }

   /**
    * Get Count of streams of that kind available.
    * 
    * @return Count of streams of that kind available.
    */
    @Nullable
    public final BigInteger getStreamCountAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.STREAMCOUNT);
    }

   /**
    * Get Count of streams of that kind available.
    * 
    * @return Count of streams of that kind available.
    */
    @Nullable
    public final URL getStreamCountAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.STREAMCOUNT);
    }

   /**
    * Get Count of streams of that kind available.
    * 
    * @return Count of streams of that kind available.
    */
    @NonNull
    public final List<@NonNull String> getStreamCountAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.STREAMCOUNT);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get The engineer who mastered the content for a physical medium or for digital distribution..
    * 
    * @return The engineer who mastered the content for a physical medium or for digital distribution..
    */
    @Nullable
    public final Integer getMasteredByAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.MASTEREDBY);
    }

   /**
    * Get The engineer who mastered the content for a physical medium or for digital distribution..
    * 
    * @return The engineer who mastered the content for a physical medium or for digital distribution..
    */
    @Nullable
    public final Long getMasteredByAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.MASTEREDBY);
    }

   /**
    * Get The engineer who mastered the content for a physical medium or for digital distribution..
    * 
    * @return The engineer who mastered the content for a physical medium or for digital distribution..
    */
    @Nullable
    public final LocalDateTime getMasteredByAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.MASTEREDBY);
    }

   /**
    * Get The engineer who mastered the content for a physical medium or for digital distribution..
    * 
    * @return The engineer who mastered the content for a physical medium or for digital distribution..
    */
    @Nullable
    public final LocalTime getMasteredByAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.MASTEREDBY);
    }

   /**
    * Get The engineer who mastered the content for a physical medium or for digital distribution..
    * 
    * @return The engineer who mastered the content for a physical medium or for digital distribution..
    */
    @Nullable
    public final String getMasteredByAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.MASTEREDBY);
    }

   /**
    * Get The engineer who mastered the content for a physical medium or for digital distribution..
    * 
    * @return The engineer who mastered the content for a physical medium or for digital distribution..
    */
    @Nullable
    public final Boolean getMasteredByAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.MASTEREDBY);
    }

   /**
    * Get The engineer who mastered the content for a physical medium or for digital distribution..
    * 
    * @return The engineer who mastered the content for a physical medium or for digital distribution..
    */
    @Nullable
    public final BigInteger getMasteredByAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.MASTEREDBY);
    }

   /**
    * Get The engineer who mastered the content for a physical medium or for digital distribution..
    * 
    * @return The engineer who mastered the content for a physical medium or for digital distribution..
    */
    @Nullable
    public final URL getMasteredByAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.MASTEREDBY);
    }

   /**
    * Get The engineer who mastered the content for a physical medium or for digital distribution..
    * 
    * @return The engineer who mastered the content for a physical medium or for digital distribution..
    */
    @NonNull
    public final List<@NonNull String> getMasteredByAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.MASTEREDBY);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Number of other streams.
    * 
    * @return Number of other streams.
    */
    @Nullable
    public final Integer getOtherCountAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.OTHERCOUNT);
    }

   /**
    * Get Number of other streams.
    * 
    * @return Number of other streams.
    */
    @Nullable
    public final Long getOtherCountAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.OTHERCOUNT);
    }

   /**
    * Get Number of other streams.
    * 
    * @return Number of other streams.
    */
    @Nullable
    public final LocalDateTime getOtherCountAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.OTHERCOUNT);
    }

   /**
    * Get Number of other streams.
    * 
    * @return Number of other streams.
    */
    @Nullable
    public final LocalTime getOtherCountAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.OTHERCOUNT);
    }

   /**
    * Get Number of other streams.
    * 
    * @return Number of other streams.
    */
    @Nullable
    public final String getOtherCountAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.OTHERCOUNT);
    }

   /**
    * Get Number of other streams.
    * 
    * @return Number of other streams.
    */
    @Nullable
    public final Boolean getOtherCountAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.OTHERCOUNT);
    }

   /**
    * Get Number of other streams.
    * 
    * @return Number of other streams.
    */
    @Nullable
    public final BigInteger getOtherCountAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.OTHERCOUNT);
    }

   /**
    * Get Number of other streams.
    * 
    * @return Number of other streams.
    */
    @Nullable
    public final URL getOtherCountAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.OTHERCOUNT);
    }

   /**
    * Get Number of other streams.
    * 
    * @return Number of other streams.
    */
    @NonNull
    public final List<@NonNull String> getOtherCountAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.OTHERCOUNT);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Number of general streams.
    * 
    * @return Number of general streams.
    */
    @Nullable
    public final Integer getGeneralCountAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.GENERALCOUNT);
    }

   /**
    * Get Number of general streams.
    * 
    * @return Number of general streams.
    */
    @Nullable
    public final Long getGeneralCountAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.GENERALCOUNT);
    }

   /**
    * Get Number of general streams.
    * 
    * @return Number of general streams.
    */
    @Nullable
    public final LocalDateTime getGeneralCountAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.GENERALCOUNT);
    }

   /**
    * Get Number of general streams.
    * 
    * @return Number of general streams.
    */
    @Nullable
    public final LocalTime getGeneralCountAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.GENERALCOUNT);
    }

   /**
    * Get Number of general streams.
    * 
    * @return Number of general streams.
    */
    @Nullable
    public final String getGeneralCountAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.GENERALCOUNT);
    }

   /**
    * Get Number of general streams.
    * 
    * @return Number of general streams.
    */
    @Nullable
    public final Boolean getGeneralCountAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.GENERALCOUNT);
    }

   /**
    * Get Number of general streams.
    * 
    * @return Number of general streams.
    */
    @Nullable
    public final BigInteger getGeneralCountAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.GENERALCOUNT);
    }

   /**
    * Get Number of general streams.
    * 
    * @return Number of general streams.
    */
    @Nullable
    public final URL getGeneralCountAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.GENERALCOUNT);
    }

   /**
    * Get Number of general streams.
    * 
    * @return Number of general streams.
    */
    @NonNull
    public final List<@NonNull String> getGeneralCountAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.GENERALCOUNT);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Link to a site with copyright/legal information..
    * 
    * @return Link to a site with copyright/legal information..
    */
    @Nullable
    public final Integer getCopyrightUrlAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.COPYRIGHTURL);
    }

   /**
    * Get Link to a site with copyright/legal information..
    * 
    * @return Link to a site with copyright/legal information..
    */
    @Nullable
    public final Long getCopyrightUrlAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.COPYRIGHTURL);
    }

   /**
    * Get Link to a site with copyright/legal information..
    * 
    * @return Link to a site with copyright/legal information..
    */
    @Nullable
    public final LocalDateTime getCopyrightUrlAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.COPYRIGHTURL);
    }

   /**
    * Get Link to a site with copyright/legal information..
    * 
    * @return Link to a site with copyright/legal information..
    */
    @Nullable
    public final LocalTime getCopyrightUrlAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.COPYRIGHTURL);
    }

   /**
    * Get Link to a site with copyright/legal information..
    * 
    * @return Link to a site with copyright/legal information..
    */
    @Nullable
    public final String getCopyrightUrlAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.COPYRIGHTURL);
    }

   /**
    * Get Link to a site with copyright/legal information..
    * 
    * @return Link to a site with copyright/legal information..
    */
    @Nullable
    public final Boolean getCopyrightUrlAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.COPYRIGHTURL);
    }

   /**
    * Get Link to a site with copyright/legal information..
    * 
    * @return Link to a site with copyright/legal information..
    */
    @Nullable
    public final BigInteger getCopyrightUrlAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.COPYRIGHTURL);
    }

   /**
    * Get Link to a site with copyright/legal information..
    * 
    * @return Link to a site with copyright/legal information..
    */
    @Nullable
    public final URL getCopyrightUrlAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.COPYRIGHTURL);
    }

   /**
    * Get Link to a site with copyright/legal information..
    * 
    * @return Link to a site with copyright/legal information..
    */
    @NonNull
    public final List<@NonNull String> getCopyrightUrlAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.COPYRIGHTURL);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Album_ReplayGain_Gain/String.
    * 
    * @return Album_ReplayGain_Gain/String.
    */
    @Nullable
    public final Integer getAlbumReplayGainGainStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ALBUMREPLAYGAINGAINSTRING);
    }

   /**
    * Get Album_ReplayGain_Gain/String.
    * 
    * @return Album_ReplayGain_Gain/String.
    */
    @Nullable
    public final Long getAlbumReplayGainGainStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ALBUMREPLAYGAINGAINSTRING);
    }

   /**
    * Get Album_ReplayGain_Gain/String.
    * 
    * @return Album_ReplayGain_Gain/String.
    */
    @Nullable
    public final LocalDateTime getAlbumReplayGainGainStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ALBUMREPLAYGAINGAINSTRING);
    }

   /**
    * Get Album_ReplayGain_Gain/String.
    * 
    * @return Album_ReplayGain_Gain/String.
    */
    @Nullable
    public final LocalTime getAlbumReplayGainGainStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ALBUMREPLAYGAINGAINSTRING);
    }

   /**
    * Get Album_ReplayGain_Gain/String.
    * 
    * @return Album_ReplayGain_Gain/String.
    */
    @Nullable
    public final String getAlbumReplayGainGainStringAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ALBUMREPLAYGAINGAINSTRING);
    }

   /**
    * Get Album_ReplayGain_Gain/String.
    * 
    * @return Album_ReplayGain_Gain/String.
    */
    @Nullable
    public final Boolean getAlbumReplayGainGainStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ALBUMREPLAYGAINGAINSTRING);
    }

   /**
    * Get Album_ReplayGain_Gain/String.
    * 
    * @return Album_ReplayGain_Gain/String.
    */
    @Nullable
    public final BigInteger getAlbumReplayGainGainStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ALBUMREPLAYGAINGAINSTRING);
    }

   /**
    * Get Album_ReplayGain_Gain/String.
    * 
    * @return Album_ReplayGain_Gain/String.
    */
    @Nullable
    public final URL getAlbumReplayGainGainStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ALBUMREPLAYGAINGAINSTRING);
    }

   /**
    * Get Album_ReplayGain_Gain/String.
    * 
    * @return Album_ReplayGain_Gain/String.
    */
    @NonNull
    public final List<@NonNull String> getAlbumReplayGainGainStringAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ALBUMREPLAYGAINGAINSTRING);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Number of video streams.
    * 
    * @return Number of video streams.
    */
    @Nullable
    public final Integer getVideoCountAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.VIDEOCOUNT);
    }

   /**
    * Get Number of video streams.
    * 
    * @return Number of video streams.
    */
    @Nullable
    public final Long getVideoCountAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.VIDEOCOUNT);
    }

   /**
    * Get Number of video streams.
    * 
    * @return Number of video streams.
    */
    @Nullable
    public final LocalDateTime getVideoCountAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.VIDEOCOUNT);
    }

   /**
    * Get Number of video streams.
    * 
    * @return Number of video streams.
    */
    @Nullable
    public final LocalTime getVideoCountAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.VIDEOCOUNT);
    }

   /**
    * Get Number of video streams.
    * 
    * @return Number of video streams.
    */
    @Nullable
    public final String getVideoCountAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.VIDEOCOUNT);
    }

   /**
    * Get Number of video streams.
    * 
    * @return Number of video streams.
    */
    @Nullable
    public final Boolean getVideoCountAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.VIDEOCOUNT);
    }

   /**
    * Get Number of video streams.
    * 
    * @return Number of video streams.
    */
    @Nullable
    public final BigInteger getVideoCountAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.VIDEOCOUNT);
    }

   /**
    * Get Number of video streams.
    * 
    * @return Number of video streams.
    */
    @Nullable
    public final URL getVideoCountAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.VIDEOCOUNT);
    }

   /**
    * Get Number of video streams.
    * 
    * @return Number of video streams.
    */
    @NonNull
    public final List<@NonNull String> getVideoCountAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.VIDEOCOUNT);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Integer getDurationString2AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.DURATIONSTRING2);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Long getDurationString2AsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.DURATIONSTRING2);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalDateTime getDurationString2AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.DURATIONSTRING2);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final LocalTime getDurationString2AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.DURATIONSTRING2);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final String getDurationString2AsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.DURATIONSTRING2);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final Boolean getDurationString2AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.DURATIONSTRING2);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final BigInteger getDurationString2AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.DURATIONSTRING2);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @Nullable
    public final URL getDurationString2AsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.DURATIONSTRING2);
    }

   /**
    * Get Play time in format : XXx YYy only, YYy omited if zero.
    * 
    * @return Play time in format : XXx YYy only, YYy omited if zero.
    */
    @NonNull
    public final List<@NonNull String> getDurationString2AsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.DURATIONSTRING2);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Play time in format : HH:MM:SS.MMM.
    * 
    * @return Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Integer getDurationString3AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.DURATIONSTRING3);
    }

   /**
    * Get Play time in format : HH:MM:SS.MMM.
    * 
    * @return Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Long getDurationString3AsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.DURATIONSTRING3);
    }

   /**
    * Get Play time in format : HH:MM:SS.MMM.
    * 
    * @return Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalDateTime getDurationString3AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.DURATIONSTRING3);
    }

   /**
    * Get Play time in format : HH:MM:SS.MMM.
    * 
    * @return Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final LocalTime getDurationString3AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.DURATIONSTRING3);
    }

   /**
    * Get Play time in format : HH:MM:SS.MMM.
    * 
    * @return Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final String getDurationString3AsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.DURATIONSTRING3);
    }

   /**
    * Get Play time in format : HH:MM:SS.MMM.
    * 
    * @return Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final Boolean getDurationString3AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.DURATIONSTRING3);
    }

   /**
    * Get Play time in format : HH:MM:SS.MMM.
    * 
    * @return Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final BigInteger getDurationString3AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.DURATIONSTRING3);
    }

   /**
    * Get Play time in format : HH:MM:SS.MMM.
    * 
    * @return Play time in format : HH:MM:SS.MMM.
    */
    @Nullable
    public final URL getDurationString3AsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.DURATIONSTRING3);
    }

   /**
    * Get Play time in format : HH:MM:SS.MMM.
    * 
    * @return Play time in format : HH:MM:SS.MMM.
    */
    @NonNull
    public final List<@NonNull String> getDurationString3AsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.DURATIONSTRING3);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Integer getDurationString1AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.DURATIONSTRING1);
    }

   /**
    * Get Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Long getDurationString1AsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.DURATIONSTRING1);
    }

   /**
    * Get Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final LocalDateTime getDurationString1AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.DURATIONSTRING1);
    }

   /**
    * Get Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final LocalTime getDurationString1AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.DURATIONSTRING1);
    }

   /**
    * Get Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final String getDurationString1AsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.DURATIONSTRING1);
    }

   /**
    * Get Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final Boolean getDurationString1AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.DURATIONSTRING1);
    }

   /**
    * Get Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final BigInteger getDurationString1AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.DURATIONSTRING1);
    }

   /**
    * Get Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @Nullable
    public final URL getDurationString1AsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.DURATIONSTRING1);
    }

   /**
    * Get Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    * 
    * @return Play time in format : HHh MMmn SSs MMMms, XX omited if zero.
    */
    @NonNull
    public final List<@NonNull String> getDurationString1AsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.DURATIONSTRING1);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Nominal Bit rate (with measurement).
    * 
    * @return Nominal Bit rate (with measurement).
    */
    @Nullable
    public final Integer getOverallBitRateNominalStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.OVERALLBITRATENOMINALSTRING);
    }

   /**
    * Get Nominal Bit rate (with measurement).
    * 
    * @return Nominal Bit rate (with measurement).
    */
    @Nullable
    public final Long getOverallBitRateNominalStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.OVERALLBITRATENOMINALSTRING);
    }

   /**
    * Get Nominal Bit rate (with measurement).
    * 
    * @return Nominal Bit rate (with measurement).
    */
    @Nullable
    public final LocalDateTime getOverallBitRateNominalStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.OVERALLBITRATENOMINALSTRING);
    }

   /**
    * Get Nominal Bit rate (with measurement).
    * 
    * @return Nominal Bit rate (with measurement).
    */
    @Nullable
    public final LocalTime getOverallBitRateNominalStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.OVERALLBITRATENOMINALSTRING);
    }

   /**
    * Get Nominal Bit rate (with measurement).
    * 
    * @return Nominal Bit rate (with measurement).
    */
    @Nullable
    public final String getOverallBitRateNominalStringAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.OVERALLBITRATENOMINALSTRING);
    }

   /**
    * Get Nominal Bit rate (with measurement).
    * 
    * @return Nominal Bit rate (with measurement).
    */
    @Nullable
    public final Boolean getOverallBitRateNominalStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.OVERALLBITRATENOMINALSTRING);
    }

   /**
    * Get Nominal Bit rate (with measurement).
    * 
    * @return Nominal Bit rate (with measurement).
    */
    @Nullable
    public final BigInteger getOverallBitRateNominalStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.OVERALLBITRATENOMINALSTRING);
    }

   /**
    * Get Nominal Bit rate (with measurement).
    * 
    * @return Nominal Bit rate (with measurement).
    */
    @Nullable
    public final URL getOverallBitRateNominalStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.OVERALLBITRATENOMINALSTRING);
    }

   /**
    * Get Nominal Bit rate (with measurement).
    * 
    * @return Nominal Bit rate (with measurement).
    */
    @NonNull
    public final List<@NonNull String> getOverallBitRateNominalStringAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.OVERALLBITRATENOMINALSTRING);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Describes the period that the piece is from or about. e.g. Renaissance..
    * 
    * @return Describes the period that the piece is from or about. e.g. Renaissance..
    */
    @Nullable
    public final Integer getPeriodAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.PERIOD);
    }

   /**
    * Get Describes the period that the piece is from or about. e.g. Renaissance..
    * 
    * @return Describes the period that the piece is from or about. e.g. Renaissance..
    */
    @Nullable
    public final Long getPeriodAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.PERIOD);
    }

   /**
    * Get Describes the period that the piece is from or about. e.g. Renaissance..
    * 
    * @return Describes the period that the piece is from or about. e.g. Renaissance..
    */
    @Nullable
    public final LocalDateTime getPeriodAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.PERIOD);
    }

   /**
    * Get Describes the period that the piece is from or about. e.g. Renaissance..
    * 
    * @return Describes the period that the piece is from or about. e.g. Renaissance..
    */
    @Nullable
    public final LocalTime getPeriodAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.PERIOD);
    }

   /**
    * Get Describes the period that the piece is from or about. e.g. Renaissance..
    * 
    * @return Describes the period that the piece is from or about. e.g. Renaissance..
    */
    @Nullable
    public final String getPeriodAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.PERIOD);
    }

   /**
    * Get Describes the period that the piece is from or about. e.g. Renaissance..
    * 
    * @return Describes the period that the piece is from or about. e.g. Renaissance..
    */
    @Nullable
    public final Boolean getPeriodAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.PERIOD);
    }

   /**
    * Get Describes the period that the piece is from or about. e.g. Renaissance..
    * 
    * @return Describes the period that the piece is from or about. e.g. Renaissance..
    */
    @Nullable
    public final BigInteger getPeriodAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.PERIOD);
    }

   /**
    * Get Describes the period that the piece is from or about. e.g. Renaissance..
    * 
    * @return Describes the period that the piece is from or about. e.g. Renaissance..
    */
    @Nullable
    public final URL getPeriodAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.PERIOD);
    }

   /**
    * Get Describes the period that the piece is from or about. e.g. Renaissance..
    * 
    * @return Describes the period that the piece is from or about. e.g. Renaissance..
    */
    @NonNull
    public final List<@NonNull String> getPeriodAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.PERIOD);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Integer getDurationString4AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.DURATIONSTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Long getDurationString4AsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.DURATIONSTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalDateTime getDurationString4AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.DURATIONSTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final LocalTime getDurationString4AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.DURATIONSTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final String getDurationString4AsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.DURATIONSTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final Boolean getDurationString4AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.DURATIONSTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final BigInteger getDurationString4AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.DURATIONSTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @Nullable
    public final URL getDurationString4AsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.DURATIONSTRING4);
    }

   /**
    * Get Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    * 
    * @return Play time in format : HH:MM:SS:FF, last colon replaced by semicolon for drop frame if available.
    */
    @NonNull
    public final List<@NonNull String> getDurationString4AsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.DURATIONSTRING4);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Integer getDurationString5AsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.DURATIONSTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Long getDurationString5AsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.DURATIONSTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalDateTime getDurationString5AsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.DURATIONSTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final LocalTime getDurationString5AsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.DURATIONSTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final String getDurationString5AsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.DURATIONSTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final Boolean getDurationString5AsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.DURATIONSTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final BigInteger getDurationString5AsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.DURATIONSTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @Nullable
    public final URL getDurationString5AsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.DURATIONSTRING5);
    }

   /**
    * Get Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    * 
    * @return Play time in format : HH:MM:SS.mmm (HH:MM:SS:FF).
    */
    @NonNull
    public final List<@NonNull String> getDurationString5AsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.DURATIONSTRING5);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Duration_Start.
    * 
    * @return Duration_Start.
    */
    @Nullable
    public final Integer getDurationStartAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.DURATIONSTART);
    }

   /**
    * Get Duration_Start.
    * 
    * @return Duration_Start.
    */
    @Nullable
    public final Long getDurationStartAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.DURATIONSTART);
    }

   /**
    * Get Duration_Start.
    * 
    * @return Duration_Start.
    */
    @Nullable
    public final LocalDateTime getDurationStartAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.DURATIONSTART);
    }

   /**
    * Get Duration_Start.
    * 
    * @return Duration_Start.
    */
    @Nullable
    public final LocalTime getDurationStartAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.DURATIONSTART);
    }

   /**
    * Get Duration_Start.
    * 
    * @return Duration_Start.
    */
    @Nullable
    public final String getDurationStartAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.DURATIONSTART);
    }

   /**
    * Get Duration_Start.
    * 
    * @return Duration_Start.
    */
    @Nullable
    public final Boolean getDurationStartAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.DURATIONSTART);
    }

   /**
    * Get Duration_Start.
    * 
    * @return Duration_Start.
    */
    @Nullable
    public final BigInteger getDurationStartAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.DURATIONSTART);
    }

   /**
    * Get Duration_Start.
    * 
    * @return Duration_Start.
    */
    @Nullable
    public final URL getDurationStartAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.DURATIONSTART);
    }

   /**
    * Get Duration_Start.
    * 
    * @return Duration_Start.
    */
    @NonNull
    public final List<@NonNull String> getDurationStartAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.DURATIONSTART);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get OriginalNetworkName.
    * 
    * @return OriginalNetworkName.
    */
    @Nullable
    public final Integer getOriginalNetworkNameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ORIGINALNETWORKNAME);
    }

   /**
    * Get OriginalNetworkName.
    * 
    * @return OriginalNetworkName.
    */
    @Nullable
    public final Long getOriginalNetworkNameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ORIGINALNETWORKNAME);
    }

   /**
    * Get OriginalNetworkName.
    * 
    * @return OriginalNetworkName.
    */
    @Nullable
    public final LocalDateTime getOriginalNetworkNameAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ORIGINALNETWORKNAME);
    }

   /**
    * Get OriginalNetworkName.
    * 
    * @return OriginalNetworkName.
    */
    @Nullable
    public final LocalTime getOriginalNetworkNameAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ORIGINALNETWORKNAME);
    }

   /**
    * Get OriginalNetworkName.
    * 
    * @return OriginalNetworkName.
    */
    @Nullable
    public final String getOriginalNetworkNameAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ORIGINALNETWORKNAME);
    }

   /**
    * Get OriginalNetworkName.
    * 
    * @return OriginalNetworkName.
    */
    @Nullable
    public final Boolean getOriginalNetworkNameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ORIGINALNETWORKNAME);
    }

   /**
    * Get OriginalNetworkName.
    * 
    * @return OriginalNetworkName.
    */
    @Nullable
    public final BigInteger getOriginalNetworkNameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ORIGINALNETWORKNAME);
    }

   /**
    * Get OriginalNetworkName.
    * 
    * @return OriginalNetworkName.
    */
    @Nullable
    public final URL getOriginalNetworkNameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ORIGINALNETWORKNAME);
    }

   /**
    * Get OriginalNetworkName.
    * 
    * @return OriginalNetworkName.
    */
    @NonNull
    public final List<@NonNull String> getOriginalNetworkNameAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ORIGINALNETWORKNAME);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get EPG_Positions_Begin.
    * 
    * @return EPG_Positions_Begin.
    */
    @Nullable
    public final Integer getEPGPositionsBeginAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.EPGPOSITIONSBEGIN);
    }

   /**
    * Get EPG_Positions_Begin.
    * 
    * @return EPG_Positions_Begin.
    */
    @Nullable
    public final Long getEPGPositionsBeginAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.EPGPOSITIONSBEGIN);
    }

   /**
    * Get EPG_Positions_Begin.
    * 
    * @return EPG_Positions_Begin.
    */
    @Nullable
    public final LocalDateTime getEPGPositionsBeginAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.EPGPOSITIONSBEGIN);
    }

   /**
    * Get EPG_Positions_Begin.
    * 
    * @return EPG_Positions_Begin.
    */
    @Nullable
    public final LocalTime getEPGPositionsBeginAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.EPGPOSITIONSBEGIN);
    }

   /**
    * Get EPG_Positions_Begin.
    * 
    * @return EPG_Positions_Begin.
    */
    @Nullable
    public final String getEPGPositionsBeginAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.EPGPOSITIONSBEGIN);
    }

   /**
    * Get EPG_Positions_Begin.
    * 
    * @return EPG_Positions_Begin.
    */
    @Nullable
    public final Boolean getEPGPositionsBeginAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.EPGPOSITIONSBEGIN);
    }

   /**
    * Get EPG_Positions_Begin.
    * 
    * @return EPG_Positions_Begin.
    */
    @Nullable
    public final BigInteger getEPGPositionsBeginAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.EPGPOSITIONSBEGIN);
    }

   /**
    * Get EPG_Positions_Begin.
    * 
    * @return EPG_Positions_Begin.
    */
    @Nullable
    public final URL getEPGPositionsBeginAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.EPGPOSITIONSBEGIN);
    }

   /**
    * Get EPG_Positions_Begin.
    * 
    * @return EPG_Positions_Begin.
    */
    @NonNull
    public final List<@NonNull String> getEPGPositionsBeginAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.EPGPOSITIONSBEGIN);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Video Codecs in this file with popular name (hint), separated by /.
    * 
    * @return Video Codecs in this file with popular name (hint), separated by /.
    */
    @Nullable
    public final Integer getVideoFormatWithHintListAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.VIDEOFORMATWITHHINTLIST);
    }

   /**
    * Get Video Codecs in this file with popular name (hint), separated by /.
    * 
    * @return Video Codecs in this file with popular name (hint), separated by /.
    */
    @Nullable
    public final Long getVideoFormatWithHintListAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.VIDEOFORMATWITHHINTLIST);
    }

   /**
    * Get Video Codecs in this file with popular name (hint), separated by /.
    * 
    * @return Video Codecs in this file with popular name (hint), separated by /.
    */
    @Nullable
    public final LocalDateTime getVideoFormatWithHintListAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.VIDEOFORMATWITHHINTLIST);
    }

   /**
    * Get Video Codecs in this file with popular name (hint), separated by /.
    * 
    * @return Video Codecs in this file with popular name (hint), separated by /.
    */
    @Nullable
    public final LocalTime getVideoFormatWithHintListAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.VIDEOFORMATWITHHINTLIST);
    }

   /**
    * Get Video Codecs in this file with popular name (hint), separated by /.
    * 
    * @return Video Codecs in this file with popular name (hint), separated by /.
    */
    @Nullable
    public final String getVideoFormatWithHintListAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.VIDEOFORMATWITHHINTLIST);
    }

   /**
    * Get Video Codecs in this file with popular name (hint), separated by /.
    * 
    * @return Video Codecs in this file with popular name (hint), separated by /.
    */
    @Nullable
    public final Boolean getVideoFormatWithHintListAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.VIDEOFORMATWITHHINTLIST);
    }

   /**
    * Get Video Codecs in this file with popular name (hint), separated by /.
    * 
    * @return Video Codecs in this file with popular name (hint), separated by /.
    */
    @Nullable
    public final BigInteger getVideoFormatWithHintListAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.VIDEOFORMATWITHHINTLIST);
    }

   /**
    * Get Video Codecs in this file with popular name (hint), separated by /.
    * 
    * @return Video Codecs in this file with popular name (hint), separated by /.
    */
    @Nullable
    public final URL getVideoFormatWithHintListAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.VIDEOFORMATWITHHINTLIST);
    }

   /**
    * Get Video Codecs in this file with popular name (hint), separated by /.
    * 
    * @return Video Codecs in this file with popular name (hint), separated by /.
    */
    @NonNull
    public final List<@NonNull String> getVideoFormatWithHintListAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.VIDEOFORMATWITHHINTLIST);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final Integer getDelaySourceAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.DELAYSOURCE);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final Long getDelaySourceAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.DELAYSOURCE);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final LocalDateTime getDelaySourceAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.DELAYSOURCE);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final LocalTime getDelaySourceAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.DELAYSOURCE);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final String getDelaySourceAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.DELAYSOURCE);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final Boolean getDelaySourceAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.DELAYSOURCE);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final BigInteger getDelaySourceAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.DELAYSOURCE);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final URL getDelaySourceAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.DELAYSOURCE);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @NonNull
    public final List<@NonNull String> getDelaySourceAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.DELAYSOURCE);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Main performer/artist of this file.
    * 
    * @return Main performer/artist of this file.
    */
    @Nullable
    public final Integer getPerformerAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.PERFORMER);
    }

   /**
    * Get Main performer/artist of this file.
    * 
    * @return Main performer/artist of this file.
    */
    @Nullable
    public final Long getPerformerAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.PERFORMER);
    }

   /**
    * Get Main performer/artist of this file.
    * 
    * @return Main performer/artist of this file.
    */
    @Nullable
    public final LocalDateTime getPerformerAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.PERFORMER);
    }

   /**
    * Get Main performer/artist of this file.
    * 
    * @return Main performer/artist of this file.
    */
    @Nullable
    public final LocalTime getPerformerAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.PERFORMER);
    }

   /**
    * Get Main performer/artist of this file.
    * 
    * @return Main performer/artist of this file.
    */
    @Nullable
    public final String getPerformerAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.PERFORMER);
    }

   /**
    * Get Main performer/artist of this file.
    * 
    * @return Main performer/artist of this file.
    */
    @Nullable
    public final Boolean getPerformerAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.PERFORMER);
    }

   /**
    * Get Main performer/artist of this file.
    * 
    * @return Main performer/artist of this file.
    */
    @Nullable
    public final BigInteger getPerformerAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.PERFORMER);
    }

   /**
    * Get Main performer/artist of this file.
    * 
    * @return Main performer/artist of this file.
    */
    @Nullable
    public final URL getPerformerAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.PERFORMER);
    }

   /**
    * Get Main performer/artist of this file.
    * 
    * @return Main performer/artist of this file.
    */
    @NonNull
    public final List<@NonNull String> getPerformerAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.PERFORMER);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Name of the producer of the movie..
    * 
    * @return Name of the producer of the movie..
    */
    @Nullable
    public final Integer getProducerAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.PRODUCER);
    }

   /**
    * Get Name of the producer of the movie..
    * 
    * @return Name of the producer of the movie..
    */
    @Nullable
    public final Long getProducerAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.PRODUCER);
    }

   /**
    * Get Name of the producer of the movie..
    * 
    * @return Name of the producer of the movie..
    */
    @Nullable
    public final LocalDateTime getProducerAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.PRODUCER);
    }

   /**
    * Get Name of the producer of the movie..
    * 
    * @return Name of the producer of the movie..
    */
    @Nullable
    public final LocalTime getProducerAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.PRODUCER);
    }

   /**
    * Get Name of the producer of the movie..
    * 
    * @return Name of the producer of the movie..
    */
    @Nullable
    public final String getProducerAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.PRODUCER);
    }

   /**
    * Get Name of the producer of the movie..
    * 
    * @return Name of the producer of the movie..
    */
    @Nullable
    public final Boolean getProducerAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.PRODUCER);
    }

   /**
    * Get Name of the producer of the movie..
    * 
    * @return Name of the producer of the movie..
    */
    @Nullable
    public final BigInteger getProducerAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.PRODUCER);
    }

   /**
    * Get Name of the producer of the movie..
    * 
    * @return Name of the producer of the movie..
    */
    @Nullable
    public final URL getProducerAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.PRODUCER);
    }

   /**
    * Get Name of the producer of the movie..
    * 
    * @return Name of the producer of the movie..
    */
    @NonNull
    public final List<@NonNull String> getProducerAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.PRODUCER);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Place of the season e.g. 2 of 7.
    * 
    * @return Place of the season e.g. 2 of 7.
    */
    @Nullable
    public final Integer getSeasonPositionTotalAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.SEASONPOSITIONTOTAL);
    }

   /**
    * Get Place of the season e.g. 2 of 7.
    * 
    * @return Place of the season e.g. 2 of 7.
    */
    @Nullable
    public final Long getSeasonPositionTotalAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.SEASONPOSITIONTOTAL);
    }

   /**
    * Get Place of the season e.g. 2 of 7.
    * 
    * @return Place of the season e.g. 2 of 7.
    */
    @Nullable
    public final LocalDateTime getSeasonPositionTotalAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.SEASONPOSITIONTOTAL);
    }

   /**
    * Get Place of the season e.g. 2 of 7.
    * 
    * @return Place of the season e.g. 2 of 7.
    */
    @Nullable
    public final LocalTime getSeasonPositionTotalAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.SEASONPOSITIONTOTAL);
    }

   /**
    * Get Place of the season e.g. 2 of 7.
    * 
    * @return Place of the season e.g. 2 of 7.
    */
    @Nullable
    public final String getSeasonPositionTotalAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.SEASONPOSITIONTOTAL);
    }

   /**
    * Get Place of the season e.g. 2 of 7.
    * 
    * @return Place of the season e.g. 2 of 7.
    */
    @Nullable
    public final Boolean getSeasonPositionTotalAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.SEASONPOSITIONTOTAL);
    }

   /**
    * Get Place of the season e.g. 2 of 7.
    * 
    * @return Place of the season e.g. 2 of 7.
    */
    @Nullable
    public final BigInteger getSeasonPositionTotalAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.SEASONPOSITIONTOTAL);
    }

   /**
    * Get Place of the season e.g. 2 of 7.
    * 
    * @return Place of the season e.g. 2 of 7.
    */
    @Nullable
    public final URL getSeasonPositionTotalAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.SEASONPOSITIONTOTAL);
    }

   /**
    * Get Place of the season e.g. 2 of 7.
    * 
    * @return Place of the season e.g. 2 of 7.
    */
    @NonNull
    public final List<@NonNull String> getSeasonPositionTotalAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.SEASONPOSITIONTOTAL);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Name of the character an actor or actress plays in this movie..
    * 
    * @return Name of the character an actor or actress plays in this movie..
    */
    @Nullable
    public final Integer getActorCharacterAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ACTORCHARACTER);
    }

   /**
    * Get Name of the character an actor or actress plays in this movie..
    * 
    * @return Name of the character an actor or actress plays in this movie..
    */
    @Nullable
    public final Long getActorCharacterAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ACTORCHARACTER);
    }

   /**
    * Get Name of the character an actor or actress plays in this movie..
    * 
    * @return Name of the character an actor or actress plays in this movie..
    */
    @Nullable
    public final LocalDateTime getActorCharacterAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ACTORCHARACTER);
    }

   /**
    * Get Name of the character an actor or actress plays in this movie..
    * 
    * @return Name of the character an actor or actress plays in this movie..
    */
    @Nullable
    public final LocalTime getActorCharacterAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ACTORCHARACTER);
    }

   /**
    * Get Name of the character an actor or actress plays in this movie..
    * 
    * @return Name of the character an actor or actress plays in this movie..
    */
    @Nullable
    public final String getActorCharacterAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ACTORCHARACTER);
    }

   /**
    * Get Name of the character an actor or actress plays in this movie..
    * 
    * @return Name of the character an actor or actress plays in this movie..
    */
    @Nullable
    public final Boolean getActorCharacterAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ACTORCHARACTER);
    }

   /**
    * Get Name of the character an actor or actress plays in this movie..
    * 
    * @return Name of the character an actor or actress plays in this movie..
    */
    @Nullable
    public final BigInteger getActorCharacterAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ACTORCHARACTER);
    }

   /**
    * Get Name of the character an actor or actress plays in this movie..
    * 
    * @return Name of the character an actor or actress plays in this movie..
    */
    @Nullable
    public final URL getActorCharacterAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ACTORCHARACTER);
    }

   /**
    * Get Name of the character an actor or actress plays in this movie..
    * 
    * @return Name of the character an actor or actress plays in this movie..
    */
    @NonNull
    public final List<@NonNull String> getActorCharacterAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ACTORCHARACTER);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Maximum Bit rate in bps.
    * 
    * @return Maximum Bit rate in bps.
    */
    @Nullable
    public final Integer getOverallBitRateMaximumAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.OVERALLBITRATEMAXIMUM);
    }

   /**
    * Get Maximum Bit rate in bps.
    * 
    * @return Maximum Bit rate in bps.
    */
    @Nullable
    public final Long getOverallBitRateMaximumAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.OVERALLBITRATEMAXIMUM);
    }

   /**
    * Get Maximum Bit rate in bps.
    * 
    * @return Maximum Bit rate in bps.
    */
    @Nullable
    public final LocalDateTime getOverallBitRateMaximumAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.OVERALLBITRATEMAXIMUM);
    }

   /**
    * Get Maximum Bit rate in bps.
    * 
    * @return Maximum Bit rate in bps.
    */
    @Nullable
    public final LocalTime getOverallBitRateMaximumAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.OVERALLBITRATEMAXIMUM);
    }

   /**
    * Get Maximum Bit rate in bps.
    * 
    * @return Maximum Bit rate in bps.
    */
    @Nullable
    public final String getOverallBitRateMaximumAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.OVERALLBITRATEMAXIMUM);
    }

   /**
    * Get Maximum Bit rate in bps.
    * 
    * @return Maximum Bit rate in bps.
    */
    @Nullable
    public final Boolean getOverallBitRateMaximumAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.OVERALLBITRATEMAXIMUM);
    }

   /**
    * Get Maximum Bit rate in bps.
    * 
    * @return Maximum Bit rate in bps.
    */
    @Nullable
    public final BigInteger getOverallBitRateMaximumAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.OVERALLBITRATEMAXIMUM);
    }

   /**
    * Get Maximum Bit rate in bps.
    * 
    * @return Maximum Bit rate in bps.
    */
    @Nullable
    public final URL getOverallBitRateMaximumAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.OVERALLBITRATEMAXIMUM);
    }

   /**
    * Get Maximum Bit rate in bps.
    * 
    * @return Maximum Bit rate in bps.
    */
    @NonNull
    public final List<@NonNull String> getOverallBitRateMaximumAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.OVERALLBITRATEMAXIMUM);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Name of the series, e.g. Starwars movies, Stargate SG-1, Stargate Atlantis, Buffy, Angel.
    * 
    * @return Name of the series, e.g. Starwars movies, Stargate SG-1, Stargate Atlantis, Buffy, Angel.
    */
    @Nullable
    public final Integer getCollectionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.COLLECTION);
    }

   /**
    * Get Name of the series, e.g. Starwars movies, Stargate SG-1, Stargate Atlantis, Buffy, Angel.
    * 
    * @return Name of the series, e.g. Starwars movies, Stargate SG-1, Stargate Atlantis, Buffy, Angel.
    */
    @Nullable
    public final Long getCollectionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.COLLECTION);
    }

   /**
    * Get Name of the series, e.g. Starwars movies, Stargate SG-1, Stargate Atlantis, Buffy, Angel.
    * 
    * @return Name of the series, e.g. Starwars movies, Stargate SG-1, Stargate Atlantis, Buffy, Angel.
    */
    @Nullable
    public final LocalDateTime getCollectionAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.COLLECTION);
    }

   /**
    * Get Name of the series, e.g. Starwars movies, Stargate SG-1, Stargate Atlantis, Buffy, Angel.
    * 
    * @return Name of the series, e.g. Starwars movies, Stargate SG-1, Stargate Atlantis, Buffy, Angel.
    */
    @Nullable
    public final LocalTime getCollectionAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.COLLECTION);
    }

   /**
    * Get Name of the series, e.g. Starwars movies, Stargate SG-1, Stargate Atlantis, Buffy, Angel.
    * 
    * @return Name of the series, e.g. Starwars movies, Stargate SG-1, Stargate Atlantis, Buffy, Angel.
    */
    @Nullable
    public final String getCollectionAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.COLLECTION);
    }

   /**
    * Get Name of the series, e.g. Starwars movies, Stargate SG-1, Stargate Atlantis, Buffy, Angel.
    * 
    * @return Name of the series, e.g. Starwars movies, Stargate SG-1, Stargate Atlantis, Buffy, Angel.
    */
    @Nullable
    public final Boolean getCollectionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.COLLECTION);
    }

   /**
    * Get Name of the series, e.g. Starwars movies, Stargate SG-1, Stargate Atlantis, Buffy, Angel.
    * 
    * @return Name of the series, e.g. Starwars movies, Stargate SG-1, Stargate Atlantis, Buffy, Angel.
    */
    @Nullable
    public final BigInteger getCollectionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.COLLECTION);
    }

   /**
    * Get Name of the series, e.g. Starwars movies, Stargate SG-1, Stargate Atlantis, Buffy, Angel.
    * 
    * @return Name of the series, e.g. Starwars movies, Stargate SG-1, Stargate Atlantis, Buffy, Angel.
    */
    @Nullable
    public final URL getCollectionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.COLLECTION);
    }

   /**
    * Get Name of the series, e.g. Starwars movies, Stargate SG-1, Stargate Atlantis, Buffy, Angel.
    * 
    * @return Name of the series, e.g. Starwars movies, Stargate SG-1, Stargate Atlantis, Buffy, Angel.
    */
    @NonNull
    public final List<@NonNull String> getCollectionAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.COLLECTION);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get StreamSize in bytes of hte stream after demux.
    * 
    * @return StreamSize in bytes of hte stream after demux.
    */
    @Nullable
    public final Integer getStreamSizeDemuxedAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.STREAMSIZEDEMUXED);
    }

   /**
    * Get StreamSize in bytes of hte stream after demux.
    * 
    * @return StreamSize in bytes of hte stream after demux.
    */
    @Nullable
    public final Long getStreamSizeDemuxedAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.STREAMSIZEDEMUXED);
    }

   /**
    * Get StreamSize in bytes of hte stream after demux.
    * 
    * @return StreamSize in bytes of hte stream after demux.
    */
    @Nullable
    public final LocalDateTime getStreamSizeDemuxedAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.STREAMSIZEDEMUXED);
    }

   /**
    * Get StreamSize in bytes of hte stream after demux.
    * 
    * @return StreamSize in bytes of hte stream after demux.
    */
    @Nullable
    public final LocalTime getStreamSizeDemuxedAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.STREAMSIZEDEMUXED);
    }

   /**
    * Get StreamSize in bytes of hte stream after demux.
    * 
    * @return StreamSize in bytes of hte stream after demux.
    */
    @Nullable
    public final String getStreamSizeDemuxedAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.STREAMSIZEDEMUXED);
    }

   /**
    * Get StreamSize in bytes of hte stream after demux.
    * 
    * @return StreamSize in bytes of hte stream after demux.
    */
    @Nullable
    public final Boolean getStreamSizeDemuxedAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.STREAMSIZEDEMUXED);
    }

   /**
    * Get StreamSize in bytes of hte stream after demux.
    * 
    * @return StreamSize in bytes of hte stream after demux.
    */
    @Nullable
    public final BigInteger getStreamSizeDemuxedAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.STREAMSIZEDEMUXED);
    }

   /**
    * Get StreamSize in bytes of hte stream after demux.
    * 
    * @return StreamSize in bytes of hte stream after demux.
    */
    @Nullable
    public final URL getStreamSizeDemuxedAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.STREAMSIZEDEMUXED);
    }

   /**
    * Get StreamSize in bytes of hte stream after demux.
    * 
    * @return StreamSize in bytes of hte stream after demux.
    */
    @NonNull
    public final List<@NonNull String> getStreamSizeDemuxedAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.STREAMSIZEDEMUXED);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Menu Codecs in this file with popular name (hint),separated by /.
    * 
    * @return Menu Codecs in this file with popular name (hint),separated by /.
    */
    @Nullable
    public final Integer getMenuFormatWithHintListAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.MENUFORMATWITHHINTLIST);
    }

   /**
    * Get Menu Codecs in this file with popular name (hint),separated by /.
    * 
    * @return Menu Codecs in this file with popular name (hint),separated by /.
    */
    @Nullable
    public final Long getMenuFormatWithHintListAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.MENUFORMATWITHHINTLIST);
    }

   /**
    * Get Menu Codecs in this file with popular name (hint),separated by /.
    * 
    * @return Menu Codecs in this file with popular name (hint),separated by /.
    */
    @Nullable
    public final LocalDateTime getMenuFormatWithHintListAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.MENUFORMATWITHHINTLIST);
    }

   /**
    * Get Menu Codecs in this file with popular name (hint),separated by /.
    * 
    * @return Menu Codecs in this file with popular name (hint),separated by /.
    */
    @Nullable
    public final LocalTime getMenuFormatWithHintListAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.MENUFORMATWITHHINTLIST);
    }

   /**
    * Get Menu Codecs in this file with popular name (hint),separated by /.
    * 
    * @return Menu Codecs in this file with popular name (hint),separated by /.
    */
    @Nullable
    public final String getMenuFormatWithHintListAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.MENUFORMATWITHHINTLIST);
    }

   /**
    * Get Menu Codecs in this file with popular name (hint),separated by /.
    * 
    * @return Menu Codecs in this file with popular name (hint),separated by /.
    */
    @Nullable
    public final Boolean getMenuFormatWithHintListAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.MENUFORMATWITHHINTLIST);
    }

   /**
    * Get Menu Codecs in this file with popular name (hint),separated by /.
    * 
    * @return Menu Codecs in this file with popular name (hint),separated by /.
    */
    @Nullable
    public final BigInteger getMenuFormatWithHintListAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.MENUFORMATWITHHINTLIST);
    }

   /**
    * Get Menu Codecs in this file with popular name (hint),separated by /.
    * 
    * @return Menu Codecs in this file with popular name (hint),separated by /.
    */
    @Nullable
    public final URL getMenuFormatWithHintListAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.MENUFORMATWITHHINTLIST);
    }

   /**
    * Get Menu Codecs in this file with popular name (hint),separated by /.
    * 
    * @return Menu Codecs in this file with popular name (hint),separated by /.
    */
    @NonNull
    public final List<@NonNull String> getMenuFormatWithHintListAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.MENUFORMATWITHHINTLIST);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Settings needed for decoder used.
    * 
    * @return Settings needed for decoder used.
    */
    @Nullable
    public final Integer getFormatSettingsAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.FORMATSETTINGS);
    }

   /**
    * Get Settings needed for decoder used.
    * 
    * @return Settings needed for decoder used.
    */
    @Nullable
    public final Long getFormatSettingsAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.FORMATSETTINGS);
    }

   /**
    * Get Settings needed for decoder used.
    * 
    * @return Settings needed for decoder used.
    */
    @Nullable
    public final LocalDateTime getFormatSettingsAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.FORMATSETTINGS);
    }

   /**
    * Get Settings needed for decoder used.
    * 
    * @return Settings needed for decoder used.
    */
    @Nullable
    public final LocalTime getFormatSettingsAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.FORMATSETTINGS);
    }

   /**
    * Get Settings needed for decoder used.
    * 
    * @return Settings needed for decoder used.
    */
    @Nullable
    public final String getFormatSettingsAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.FORMATSETTINGS);
    }

   /**
    * Get Settings needed for decoder used.
    * 
    * @return Settings needed for decoder used.
    */
    @Nullable
    public final Boolean getFormatSettingsAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.FORMATSETTINGS);
    }

   /**
    * Get Settings needed for decoder used.
    * 
    * @return Settings needed for decoder used.
    */
    @Nullable
    public final BigInteger getFormatSettingsAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.FORMATSETTINGS);
    }

   /**
    * Get Settings needed for decoder used.
    * 
    * @return Settings needed for decoder used.
    */
    @Nullable
    public final URL getFormatSettingsAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.FORMATSETTINGS);
    }

   /**
    * Get Settings needed for decoder used.
    * 
    * @return Settings needed for decoder used.
    */
    @NonNull
    public final List<@NonNull String> getFormatSettingsAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.FORMATSETTINGS);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get File name only of the last file (in the case of a sequence of files).
    * 
    * @return File name only of the last file (in the case of a sequence of files).
    */
    @Nullable
    public final Integer getFileNameLastAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.FILENAMELAST);
    }

   /**
    * Get File name only of the last file (in the case of a sequence of files).
    * 
    * @return File name only of the last file (in the case of a sequence of files).
    */
    @Nullable
    public final Long getFileNameLastAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.FILENAMELAST);
    }

   /**
    * Get File name only of the last file (in the case of a sequence of files).
    * 
    * @return File name only of the last file (in the case of a sequence of files).
    */
    @Nullable
    public final LocalDateTime getFileNameLastAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.FILENAMELAST);
    }

   /**
    * Get File name only of the last file (in the case of a sequence of files).
    * 
    * @return File name only of the last file (in the case of a sequence of files).
    */
    @Nullable
    public final LocalTime getFileNameLastAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.FILENAMELAST);
    }

   /**
    * Get File name only of the last file (in the case of a sequence of files).
    * 
    * @return File name only of the last file (in the case of a sequence of files).
    */
    @Nullable
    public final String getFileNameLastAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.FILENAMELAST);
    }

   /**
    * Get File name only of the last file (in the case of a sequence of files).
    * 
    * @return File name only of the last file (in the case of a sequence of files).
    */
    @Nullable
    public final Boolean getFileNameLastAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.FILENAMELAST);
    }

   /**
    * Get File name only of the last file (in the case of a sequence of files).
    * 
    * @return File name only of the last file (in the case of a sequence of files).
    */
    @Nullable
    public final BigInteger getFileNameLastAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.FILENAMELAST);
    }

   /**
    * Get File name only of the last file (in the case of a sequence of files).
    * 
    * @return File name only of the last file (in the case of a sequence of files).
    */
    @Nullable
    public final URL getFileNameLastAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.FILENAMELAST);
    }

   /**
    * Get File name only of the last file (in the case of a sequence of files).
    * 
    * @return File name only of the last file (in the case of a sequence of files).
    */
    @NonNull
    public final List<@NonNull String> getFileNameLastAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.FILENAMELAST);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Average number of beats per minute.
    * 
    * @return Average number of beats per minute.
    */
    @Nullable
    public final Integer getBPMAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.BPM);
    }

   /**
    * Get Average number of beats per minute.
    * 
    * @return Average number of beats per minute.
    */
    @Nullable
    public final Long getBPMAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.BPM);
    }

   /**
    * Get Average number of beats per minute.
    * 
    * @return Average number of beats per minute.
    */
    @Nullable
    public final LocalDateTime getBPMAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.BPM);
    }

   /**
    * Get Average number of beats per minute.
    * 
    * @return Average number of beats per minute.
    */
    @Nullable
    public final LocalTime getBPMAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.BPM);
    }

   /**
    * Get Average number of beats per minute.
    * 
    * @return Average number of beats per minute.
    */
    @Nullable
    public final String getBPMAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.BPM);
    }

   /**
    * Get Average number of beats per minute.
    * 
    * @return Average number of beats per minute.
    */
    @Nullable
    public final Boolean getBPMAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.BPM);
    }

   /**
    * Get Average number of beats per minute.
    * 
    * @return Average number of beats per minute.
    */
    @Nullable
    public final BigInteger getBPMAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.BPM);
    }

   /**
    * Get Average number of beats per minute.
    * 
    * @return Average number of beats per minute.
    */
    @Nullable
    public final URL getBPMAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.BPM);
    }

   /**
    * Get Average number of beats per minute.
    * 
    * @return Average number of beats per minute.
    */
    @NonNull
    public final List<@NonNull String> getBPMAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.BPM);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get File size in bytes.
    * 
    * @return File size in bytes.
    */
    @Nullable
    public final Integer getFileSizeAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.FILESIZE);
    }

   /**
    * Get File size in bytes.
    * 
    * @return File size in bytes.
    */
    @Nullable
    public final Long getFileSizeAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.FILESIZE);
    }

   /**
    * Get File size in bytes.
    * 
    * @return File size in bytes.
    */
    @Nullable
    public final LocalDateTime getFileSizeAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.FILESIZE);
    }

   /**
    * Get File size in bytes.
    * 
    * @return File size in bytes.
    */
    @Nullable
    public final LocalTime getFileSizeAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.FILESIZE);
    }

   /**
    * Get File size in bytes.
    * 
    * @return File size in bytes.
    */
    @Nullable
    public final String getFileSizeAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.FILESIZE);
    }

   /**
    * Get File size in bytes.
    * 
    * @return File size in bytes.
    */
    @Nullable
    public final Boolean getFileSizeAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.FILESIZE);
    }

   /**
    * Get File size in bytes.
    * 
    * @return File size in bytes.
    */
    @Nullable
    public final BigInteger getFileSizeAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.FILESIZE);
    }

   /**
    * Get File size in bytes.
    * 
    * @return File size in bytes.
    */
    @Nullable
    public final URL getFileSizeAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.FILESIZE);
    }

   /**
    * Get File size in bytes.
    * 
    * @return File size in bytes.
    */
    @NonNull
    public final List<@NonNull String> getFileSizeAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.FILESIZE);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    * 
    * @return Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final Integer getFirstPacketOrderAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.FIRSTPACKETORDER);
    }

   /**
    * Get Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    * 
    * @return Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final Long getFirstPacketOrderAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.FIRSTPACKETORDER);
    }

   /**
    * Get Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    * 
    * @return Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final LocalDateTime getFirstPacketOrderAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.FIRSTPACKETORDER);
    }

   /**
    * Get Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    * 
    * @return Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final LocalTime getFirstPacketOrderAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.FIRSTPACKETORDER);
    }

   /**
    * Get Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    * 
    * @return Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final String getFirstPacketOrderAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.FIRSTPACKETORDER);
    }

   /**
    * Get Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    * 
    * @return Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final Boolean getFirstPacketOrderAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.FIRSTPACKETORDER);
    }

   /**
    * Get Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    * 
    * @return Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final BigInteger getFirstPacketOrderAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.FIRSTPACKETORDER);
    }

   /**
    * Get Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    * 
    * @return Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    */
    @Nullable
    public final URL getFirstPacketOrderAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.FIRSTPACKETORDER);
    }

   /**
    * Get Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    * 
    * @return Order of the first fully decodable packet met in the file, whatever is the kind of stream (base=0).
    */
    @NonNull
    public final List<@NonNull String> getFirstPacketOrderAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.FIRSTPACKETORDER);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get IsStreamable.
    * 
    * @return IsStreamable.
    */
    @Nullable
    public final Integer getIsStreamableAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ISSTREAMABLE);
    }

   /**
    * Get IsStreamable.
    * 
    * @return IsStreamable.
    */
    @Nullable
    public final Long getIsStreamableAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ISSTREAMABLE);
    }

   /**
    * Get IsStreamable.
    * 
    * @return IsStreamable.
    */
    @Nullable
    public final LocalDateTime getIsStreamableAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ISSTREAMABLE);
    }

   /**
    * Get IsStreamable.
    * 
    * @return IsStreamable.
    */
    @Nullable
    public final LocalTime getIsStreamableAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ISSTREAMABLE);
    }

   /**
    * Get IsStreamable.
    * 
    * @return IsStreamable.
    */
    @Nullable
    public final String getIsStreamableAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ISSTREAMABLE);
    }

   /**
    * Get IsStreamable.
    * 
    * @return IsStreamable.
    */
    @Nullable
    public final Boolean getIsStreamableAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ISSTREAMABLE);
    }

   /**
    * Get IsStreamable.
    * 
    * @return IsStreamable.
    */
    @Nullable
    public final BigInteger getIsStreamableAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ISSTREAMABLE);
    }

   /**
    * Get IsStreamable.
    * 
    * @return IsStreamable.
    */
    @Nullable
    public final URL getIsStreamableAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ISSTREAMABLE);
    }

   /**
    * Get IsStreamable.
    * 
    * @return IsStreamable.
    */
    @NonNull
    public final List<@NonNull String> getIsStreamableAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ISSTREAMABLE);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get The person who wrote the lyrics for a musical item..
    * 
    * @return The person who wrote the lyrics for a musical item..
    */
    @Nullable
    public final Integer getLyricistAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.LYRICIST);
    }

   /**
    * Get The person who wrote the lyrics for a musical item..
    * 
    * @return The person who wrote the lyrics for a musical item..
    */
    @Nullable
    public final Long getLyricistAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.LYRICIST);
    }

   /**
    * Get The person who wrote the lyrics for a musical item..
    * 
    * @return The person who wrote the lyrics for a musical item..
    */
    @Nullable
    public final LocalDateTime getLyricistAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.LYRICIST);
    }

   /**
    * Get The person who wrote the lyrics for a musical item..
    * 
    * @return The person who wrote the lyrics for a musical item..
    */
    @Nullable
    public final LocalTime getLyricistAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.LYRICIST);
    }

   /**
    * Get The person who wrote the lyrics for a musical item..
    * 
    * @return The person who wrote the lyrics for a musical item..
    */
    @Nullable
    public final String getLyricistAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.LYRICIST);
    }

   /**
    * Get The person who wrote the lyrics for a musical item..
    * 
    * @return The person who wrote the lyrics for a musical item..
    */
    @Nullable
    public final Boolean getLyricistAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.LYRICIST);
    }

   /**
    * Get The person who wrote the lyrics for a musical item..
    * 
    * @return The person who wrote the lyrics for a musical item..
    */
    @Nullable
    public final BigInteger getLyricistAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.LYRICIST);
    }

   /**
    * Get The person who wrote the lyrics for a musical item..
    * 
    * @return The person who wrote the lyrics for a musical item..
    */
    @Nullable
    public final URL getLyricistAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.LYRICIST);
    }

   /**
    * Get The person who wrote the lyrics for a musical item..
    * 
    * @return The person who wrote the lyrics for a musical item..
    */
    @NonNull
    public final List<@NonNull String> getLyricistAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.LYRICIST);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Duration_End.
    * 
    * @return Duration_End.
    */
    @Nullable
    public final Integer getDurationEndAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.DURATIONEND);
    }

   /**
    * Get Duration_End.
    * 
    * @return Duration_End.
    */
    @Nullable
    public final Long getDurationEndAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.DURATIONEND);
    }

   /**
    * Get Duration_End.
    * 
    * @return Duration_End.
    */
    @Nullable
    public final LocalDateTime getDurationEndAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.DURATIONEND);
    }

   /**
    * Get Duration_End.
    * 
    * @return Duration_End.
    */
    @Nullable
    public final LocalTime getDurationEndAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.DURATIONEND);
    }

   /**
    * Get Duration_End.
    * 
    * @return Duration_End.
    */
    @Nullable
    public final String getDurationEndAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.DURATIONEND);
    }

   /**
    * Get Duration_End.
    * 
    * @return Duration_End.
    */
    @Nullable
    public final Boolean getDurationEndAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.DURATIONEND);
    }

   /**
    * Get Duration_End.
    * 
    * @return Duration_End.
    */
    @Nullable
    public final BigInteger getDurationEndAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.DURATIONEND);
    }

   /**
    * Get Duration_End.
    * 
    * @return Duration_End.
    */
    @Nullable
    public final URL getDurationEndAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.DURATIONEND);
    }

   /**
    * Get Duration_End.
    * 
    * @return Duration_End.
    */
    @NonNull
    public final List<@NonNull String> getDurationEndAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.DURATIONEND);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Known extensions of this format.
    * 
    * @return Known extensions of this format.
    */
    @Nullable
    public final Integer getFormatExtensionsAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.FORMATEXTENSIONS);
    }

   /**
    * Get Known extensions of this format.
    * 
    * @return Known extensions of this format.
    */
    @Nullable
    public final Long getFormatExtensionsAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.FORMATEXTENSIONS);
    }

   /**
    * Get Known extensions of this format.
    * 
    * @return Known extensions of this format.
    */
    @Nullable
    public final LocalDateTime getFormatExtensionsAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.FORMATEXTENSIONS);
    }

   /**
    * Get Known extensions of this format.
    * 
    * @return Known extensions of this format.
    */
    @Nullable
    public final LocalTime getFormatExtensionsAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.FORMATEXTENSIONS);
    }

   /**
    * Get Known extensions of this format.
    * 
    * @return Known extensions of this format.
    */
    @Nullable
    public final String getFormatExtensionsAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.FORMATEXTENSIONS);
    }

   /**
    * Get Known extensions of this format.
    * 
    * @return Known extensions of this format.
    */
    @Nullable
    public final Boolean getFormatExtensionsAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.FORMATEXTENSIONS);
    }

   /**
    * Get Known extensions of this format.
    * 
    * @return Known extensions of this format.
    */
    @Nullable
    public final BigInteger getFormatExtensionsAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.FORMATEXTENSIONS);
    }

   /**
    * Get Known extensions of this format.
    * 
    * @return Known extensions of this format.
    */
    @Nullable
    public final URL getFormatExtensionsAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.FORMATEXTENSIONS);
    }

   /**
    * Get Known extensions of this format.
    * 
    * @return Known extensions of this format.
    */
    @NonNull
    public final List<@NonNull String> getFormatExtensionsAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.FORMATEXTENSIONS);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get The copyright information as per the productioncopyright holder..
    * 
    * @return The copyright information as per the productioncopyright holder..
    */
    @Nullable
    public final Integer getProducerCopyrightAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.PRODUCERCOPYRIGHT);
    }

   /**
    * Get The copyright information as per the productioncopyright holder..
    * 
    * @return The copyright information as per the productioncopyright holder..
    */
    @Nullable
    public final Long getProducerCopyrightAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.PRODUCERCOPYRIGHT);
    }

   /**
    * Get The copyright information as per the productioncopyright holder..
    * 
    * @return The copyright information as per the productioncopyright holder..
    */
    @Nullable
    public final LocalDateTime getProducerCopyrightAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.PRODUCERCOPYRIGHT);
    }

   /**
    * Get The copyright information as per the productioncopyright holder..
    * 
    * @return The copyright information as per the productioncopyright holder..
    */
    @Nullable
    public final LocalTime getProducerCopyrightAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.PRODUCERCOPYRIGHT);
    }

   /**
    * Get The copyright information as per the productioncopyright holder..
    * 
    * @return The copyright information as per the productioncopyright holder..
    */
    @Nullable
    public final String getProducerCopyrightAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.PRODUCERCOPYRIGHT);
    }

   /**
    * Get The copyright information as per the productioncopyright holder..
    * 
    * @return The copyright information as per the productioncopyright holder..
    */
    @Nullable
    public final Boolean getProducerCopyrightAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.PRODUCERCOPYRIGHT);
    }

   /**
    * Get The copyright information as per the productioncopyright holder..
    * 
    * @return The copyright information as per the productioncopyright holder..
    */
    @Nullable
    public final BigInteger getProducerCopyrightAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.PRODUCERCOPYRIGHT);
    }

   /**
    * Get The copyright information as per the productioncopyright holder..
    * 
    * @return The copyright information as per the productioncopyright holder..
    */
    @Nullable
    public final URL getProducerCopyrightAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.PRODUCERCOPYRIGHT);
    }

   /**
    * Get The copyright information as per the productioncopyright holder..
    * 
    * @return The copyright information as per the productioncopyright holder..
    */
    @NonNull
    public final List<@NonNull String> getProducerCopyrightAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.PRODUCERCOPYRIGHT);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get EAN-13 (13-digit European Article Numbering) or UPC-A (12-digit Universal Product Code) bar code identifier..
    * 
    * @return EAN-13 (13-digit European Article Numbering) or UPC-A (12-digit Universal Product Code) bar code identifier..
    */
    @Nullable
    public final Integer getBarCodeAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.BARCODE);
    }

   /**
    * Get EAN-13 (13-digit European Article Numbering) or UPC-A (12-digit Universal Product Code) bar code identifier..
    * 
    * @return EAN-13 (13-digit European Article Numbering) or UPC-A (12-digit Universal Product Code) bar code identifier..
    */
    @Nullable
    public final Long getBarCodeAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.BARCODE);
    }

   /**
    * Get EAN-13 (13-digit European Article Numbering) or UPC-A (12-digit Universal Product Code) bar code identifier..
    * 
    * @return EAN-13 (13-digit European Article Numbering) or UPC-A (12-digit Universal Product Code) bar code identifier..
    */
    @Nullable
    public final LocalDateTime getBarCodeAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.BARCODE);
    }

   /**
    * Get EAN-13 (13-digit European Article Numbering) or UPC-A (12-digit Universal Product Code) bar code identifier..
    * 
    * @return EAN-13 (13-digit European Article Numbering) or UPC-A (12-digit Universal Product Code) bar code identifier..
    */
    @Nullable
    public final LocalTime getBarCodeAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.BARCODE);
    }

   /**
    * Get EAN-13 (13-digit European Article Numbering) or UPC-A (12-digit Universal Product Code) bar code identifier..
    * 
    * @return EAN-13 (13-digit European Article Numbering) or UPC-A (12-digit Universal Product Code) bar code identifier..
    */
    @Nullable
    public final String getBarCodeAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.BARCODE);
    }

   /**
    * Get EAN-13 (13-digit European Article Numbering) or UPC-A (12-digit Universal Product Code) bar code identifier..
    * 
    * @return EAN-13 (13-digit European Article Numbering) or UPC-A (12-digit Universal Product Code) bar code identifier..
    */
    @Nullable
    public final Boolean getBarCodeAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.BARCODE);
    }

   /**
    * Get EAN-13 (13-digit European Article Numbering) or UPC-A (12-digit Universal Product Code) bar code identifier..
    * 
    * @return EAN-13 (13-digit European Article Numbering) or UPC-A (12-digit Universal Product Code) bar code identifier..
    */
    @Nullable
    public final BigInteger getBarCodeAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.BARCODE);
    }

   /**
    * Get EAN-13 (13-digit European Article Numbering) or UPC-A (12-digit Universal Product Code) bar code identifier..
    * 
    * @return EAN-13 (13-digit European Article Numbering) or UPC-A (12-digit Universal Product Code) bar code identifier..
    */
    @Nullable
    public final URL getBarCodeAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.BARCODE);
    }

   /**
    * Get EAN-13 (13-digit European Article Numbering) or UPC-A (12-digit Universal Product Code) bar code identifier..
    * 
    * @return EAN-13 (13-digit European Article Numbering) or UPC-A (12-digit Universal Product Code) bar code identifier..
    */
    @NonNull
    public final List<@NonNull String> getBarCodeAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.BARCODE);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Bit rate of all streams (with measure).
    * 
    * @return Bit rate of all streams (with measure).
    */
    @Nullable
    public final Integer getOverallBitRateStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.OVERALLBITRATESTRING);
    }

   /**
    * Get Bit rate of all streams (with measure).
    * 
    * @return Bit rate of all streams (with measure).
    */
    @Nullable
    public final Long getOverallBitRateStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.OVERALLBITRATESTRING);
    }

   /**
    * Get Bit rate of all streams (with measure).
    * 
    * @return Bit rate of all streams (with measure).
    */
    @Nullable
    public final LocalDateTime getOverallBitRateStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.OVERALLBITRATESTRING);
    }

   /**
    * Get Bit rate of all streams (with measure).
    * 
    * @return Bit rate of all streams (with measure).
    */
    @Nullable
    public final LocalTime getOverallBitRateStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.OVERALLBITRATESTRING);
    }

   /**
    * Get Bit rate of all streams (with measure).
    * 
    * @return Bit rate of all streams (with measure).
    */
    @Nullable
    public final String getOverallBitRateStringAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.OVERALLBITRATESTRING);
    }

   /**
    * Get Bit rate of all streams (with measure).
    * 
    * @return Bit rate of all streams (with measure).
    */
    @Nullable
    public final Boolean getOverallBitRateStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.OVERALLBITRATESTRING);
    }

   /**
    * Get Bit rate of all streams (with measure).
    * 
    * @return Bit rate of all streams (with measure).
    */
    @Nullable
    public final BigInteger getOverallBitRateStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.OVERALLBITRATESTRING);
    }

   /**
    * Get Bit rate of all streams (with measure).
    * 
    * @return Bit rate of all streams (with measure).
    */
    @Nullable
    public final URL getOverallBitRateStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.OVERALLBITRATESTRING);
    }

   /**
    * Get Bit rate of all streams (with measure).
    * 
    * @return Bit rate of all streams (with measure).
    */
    @NonNull
    public final List<@NonNull String> getOverallBitRateStringAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.OVERALLBITRATESTRING);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Number of text streams.
    * 
    * @return Number of text streams.
    */
    @Nullable
    public final Integer getTextCountAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.TEXTCOUNT);
    }

   /**
    * Get Number of text streams.
    * 
    * @return Number of text streams.
    */
    @Nullable
    public final Long getTextCountAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.TEXTCOUNT);
    }

   /**
    * Get Number of text streams.
    * 
    * @return Number of text streams.
    */
    @Nullable
    public final LocalDateTime getTextCountAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.TEXTCOUNT);
    }

   /**
    * Get Number of text streams.
    * 
    * @return Number of text streams.
    */
    @Nullable
    public final LocalTime getTextCountAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.TEXTCOUNT);
    }

   /**
    * Get Number of text streams.
    * 
    * @return Number of text streams.
    */
    @Nullable
    public final String getTextCountAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.TEXTCOUNT);
    }

   /**
    * Get Number of text streams.
    * 
    * @return Number of text streams.
    */
    @Nullable
    public final Boolean getTextCountAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.TEXTCOUNT);
    }

   /**
    * Get Number of text streams.
    * 
    * @return Number of text streams.
    */
    @Nullable
    public final BigInteger getTextCountAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.TEXTCOUNT);
    }

   /**
    * Get Number of text streams.
    * 
    * @return Number of text streams.
    */
    @Nullable
    public final URL getTextCountAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.TEXTCOUNT);
    }

   /**
    * Get Number of text streams.
    * 
    * @return Number of text streams.
    */
    @NonNull
    public final List<@NonNull String> getTextCountAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.TEXTCOUNT);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get The name of the sound engineer or sound recordist..
    * 
    * @return The name of the sound engineer or sound recordist..
    */
    @Nullable
    public final Integer getSoundEngineerAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.SOUNDENGINEER);
    }

   /**
    * Get The name of the sound engineer or sound recordist..
    * 
    * @return The name of the sound engineer or sound recordist..
    */
    @Nullable
    public final Long getSoundEngineerAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.SOUNDENGINEER);
    }

   /**
    * Get The name of the sound engineer or sound recordist..
    * 
    * @return The name of the sound engineer or sound recordist..
    */
    @Nullable
    public final LocalDateTime getSoundEngineerAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.SOUNDENGINEER);
    }

   /**
    * Get The name of the sound engineer or sound recordist..
    * 
    * @return The name of the sound engineer or sound recordist..
    */
    @Nullable
    public final LocalTime getSoundEngineerAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.SOUNDENGINEER);
    }

   /**
    * Get The name of the sound engineer or sound recordist..
    * 
    * @return The name of the sound engineer or sound recordist..
    */
    @Nullable
    public final String getSoundEngineerAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.SOUNDENGINEER);
    }

   /**
    * Get The name of the sound engineer or sound recordist..
    * 
    * @return The name of the sound engineer or sound recordist..
    */
    @Nullable
    public final Boolean getSoundEngineerAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.SOUNDENGINEER);
    }

   /**
    * Get The name of the sound engineer or sound recordist..
    * 
    * @return The name of the sound engineer or sound recordist..
    */
    @Nullable
    public final BigInteger getSoundEngineerAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.SOUNDENGINEER);
    }

   /**
    * Get The name of the sound engineer or sound recordist..
    * 
    * @return The name of the sound engineer or sound recordist..
    */
    @Nullable
    public final URL getSoundEngineerAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.SOUNDENGINEER);
    }

   /**
    * Get The name of the sound engineer or sound recordist..
    * 
    * @return The name of the sound engineer or sound recordist..
    */
    @NonNull
    public final List<@NonNull String> getSoundEngineerAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.SOUNDENGINEER);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get A 4-digit or 5-digit number to identify the record label, typically printed as (LC) xxxx or (LC) 0xxxx on CDs medias or covers, with only the number being stored..
    * 
    * @return A 4-digit or 5-digit number to identify the record label, typically printed as (LC) xxxx or (LC) 0xxxx on CDs medias or covers, with only the number being stored..
    */
    @Nullable
    public final Integer getLabelCodeAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.LABELCODE);
    }

   /**
    * Get A 4-digit or 5-digit number to identify the record label, typically printed as (LC) xxxx or (LC) 0xxxx on CDs medias or covers, with only the number being stored..
    * 
    * @return A 4-digit or 5-digit number to identify the record label, typically printed as (LC) xxxx or (LC) 0xxxx on CDs medias or covers, with only the number being stored..
    */
    @Nullable
    public final Long getLabelCodeAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.LABELCODE);
    }

   /**
    * Get A 4-digit or 5-digit number to identify the record label, typically printed as (LC) xxxx or (LC) 0xxxx on CDs medias or covers, with only the number being stored..
    * 
    * @return A 4-digit or 5-digit number to identify the record label, typically printed as (LC) xxxx or (LC) 0xxxx on CDs medias or covers, with only the number being stored..
    */
    @Nullable
    public final LocalDateTime getLabelCodeAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.LABELCODE);
    }

   /**
    * Get A 4-digit or 5-digit number to identify the record label, typically printed as (LC) xxxx or (LC) 0xxxx on CDs medias or covers, with only the number being stored..
    * 
    * @return A 4-digit or 5-digit number to identify the record label, typically printed as (LC) xxxx or (LC) 0xxxx on CDs medias or covers, with only the number being stored..
    */
    @Nullable
    public final LocalTime getLabelCodeAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.LABELCODE);
    }

   /**
    * Get A 4-digit or 5-digit number to identify the record label, typically printed as (LC) xxxx or (LC) 0xxxx on CDs medias or covers, with only the number being stored..
    * 
    * @return A 4-digit or 5-digit number to identify the record label, typically printed as (LC) xxxx or (LC) 0xxxx on CDs medias or covers, with only the number being stored..
    */
    @Nullable
    public final String getLabelCodeAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.LABELCODE);
    }

   /**
    * Get A 4-digit or 5-digit number to identify the record label, typically printed as (LC) xxxx or (LC) 0xxxx on CDs medias or covers, with only the number being stored..
    * 
    * @return A 4-digit or 5-digit number to identify the record label, typically printed as (LC) xxxx or (LC) 0xxxx on CDs medias or covers, with only the number being stored..
    */
    @Nullable
    public final Boolean getLabelCodeAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.LABELCODE);
    }

   /**
    * Get A 4-digit or 5-digit number to identify the record label, typically printed as (LC) xxxx or (LC) 0xxxx on CDs medias or covers, with only the number being stored..
    * 
    * @return A 4-digit or 5-digit number to identify the record label, typically printed as (LC) xxxx or (LC) 0xxxx on CDs medias or covers, with only the number being stored..
    */
    @Nullable
    public final BigInteger getLabelCodeAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.LABELCODE);
    }

   /**
    * Get A 4-digit or 5-digit number to identify the record label, typically printed as (LC) xxxx or (LC) 0xxxx on CDs medias or covers, with only the number being stored..
    * 
    * @return A 4-digit or 5-digit number to identify the record label, typically printed as (LC) xxxx or (LC) 0xxxx on CDs medias or covers, with only the number being stored..
    */
    @Nullable
    public final URL getLabelCodeAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.LABELCODE);
    }

   /**
    * Get A 4-digit or 5-digit number to identify the record label, typically printed as (LC) xxxx or (LC) 0xxxx on CDs medias or covers, with only the number being stored..
    * 
    * @return A 4-digit or 5-digit number to identify the record label, typically printed as (LC) xxxx or (LC) 0xxxx on CDs medias or covers, with only the number being stored..
    */
    @NonNull
    public final List<@NonNull String> getLabelCodeAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.LABELCODE);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Number of image streams.
    * 
    * @return Number of image streams.
    */
    @Nullable
    public final Integer getImageCountAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.IMAGECOUNT);
    }

   /**
    * Get Number of image streams.
    * 
    * @return Number of image streams.
    */
    @Nullable
    public final Long getImageCountAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.IMAGECOUNT);
    }

   /**
    * Get Number of image streams.
    * 
    * @return Number of image streams.
    */
    @Nullable
    public final LocalDateTime getImageCountAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.IMAGECOUNT);
    }

   /**
    * Get Number of image streams.
    * 
    * @return Number of image streams.
    */
    @Nullable
    public final LocalTime getImageCountAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.IMAGECOUNT);
    }

   /**
    * Get Number of image streams.
    * 
    * @return Number of image streams.
    */
    @Nullable
    public final String getImageCountAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.IMAGECOUNT);
    }

   /**
    * Get Number of image streams.
    * 
    * @return Number of image streams.
    */
    @Nullable
    public final Boolean getImageCountAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.IMAGECOUNT);
    }

   /**
    * Get Number of image streams.
    * 
    * @return Number of image streams.
    */
    @Nullable
    public final BigInteger getImageCountAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.IMAGECOUNT);
    }

   /**
    * Get Number of image streams.
    * 
    * @return Number of image streams.
    */
    @Nullable
    public final URL getImageCountAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.IMAGECOUNT);
    }

   /**
    * Get Number of image streams.
    * 
    * @return Number of image streams.
    */
    @NonNull
    public final List<@NonNull String> getImageCountAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.IMAGECOUNT);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Format used.
    * 
    * @return Format used.
    */
    @Nullable
    public final Integer getFormatAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.FORMAT);
    }

   /**
    * Get Format used.
    * 
    * @return Format used.
    */
    @Nullable
    public final Long getFormatAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.FORMAT);
    }

   /**
    * Get Format used.
    * 
    * @return Format used.
    */
    @Nullable
    public final LocalDateTime getFormatAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.FORMAT);
    }

   /**
    * Get Format used.
    * 
    * @return Format used.
    */
    @Nullable
    public final LocalTime getFormatAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.FORMAT);
    }

   /**
    * Get Format used.
    * 
    * @return Format used.
    */
    @Nullable
    public final String getFormatAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.FORMAT);
    }

   /**
    * Get Format used.
    * 
    * @return Format used.
    */
    @Nullable
    public final Boolean getFormatAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.FORMAT);
    }

   /**
    * Get Format used.
    * 
    * @return Format used.
    */
    @Nullable
    public final BigInteger getFormatAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.FORMAT);
    }

   /**
    * Get Format used.
    * 
    * @return Format used.
    */
    @Nullable
    public final URL getFormatAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.FORMAT);
    }

   /**
    * Get Format used.
    * 
    * @return Format used.
    */
    @NonNull
    public final List<@NonNull String> getFormatAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.FORMAT);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get The author of the story or script..
    * 
    * @return The author of the story or script..
    */
    @Nullable
    public final Integer getWrittenByAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.WRITTENBY);
    }

   /**
    * Get The author of the story or script..
    * 
    * @return The author of the story or script..
    */
    @Nullable
    public final Long getWrittenByAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.WRITTENBY);
    }

   /**
    * Get The author of the story or script..
    * 
    * @return The author of the story or script..
    */
    @Nullable
    public final LocalDateTime getWrittenByAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.WRITTENBY);
    }

   /**
    * Get The author of the story or script..
    * 
    * @return The author of the story or script..
    */
    @Nullable
    public final LocalTime getWrittenByAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.WRITTENBY);
    }

   /**
    * Get The author of the story or script..
    * 
    * @return The author of the story or script..
    */
    @Nullable
    public final String getWrittenByAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.WRITTENBY);
    }

   /**
    * Get The author of the story or script..
    * 
    * @return The author of the story or script..
    */
    @Nullable
    public final Boolean getWrittenByAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.WRITTENBY);
    }

   /**
    * Get The author of the story or script..
    * 
    * @return The author of the story or script..
    */
    @Nullable
    public final BigInteger getWrittenByAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.WRITTENBY);
    }

   /**
    * Get The author of the story or script..
    * 
    * @return The author of the story or script..
    */
    @Nullable
    public final URL getWrittenByAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.WRITTENBY);
    }

   /**
    * Get The author of the story or script..
    * 
    * @return The author of the story or script..
    */
    @NonNull
    public final List<@NonNull String> getWrittenByAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.WRITTENBY);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Place of this track, e.g. 3 of 15.
    * 
    * @return Place of this track, e.g. 3 of 15.
    */
    @Nullable
    public final Integer getTrackPositionTotalAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.TRACKPOSITIONTOTAL);
    }

   /**
    * Get Place of this track, e.g. 3 of 15.
    * 
    * @return Place of this track, e.g. 3 of 15.
    */
    @Nullable
    public final Long getTrackPositionTotalAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.TRACKPOSITIONTOTAL);
    }

   /**
    * Get Place of this track, e.g. 3 of 15.
    * 
    * @return Place of this track, e.g. 3 of 15.
    */
    @Nullable
    public final LocalDateTime getTrackPositionTotalAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.TRACKPOSITIONTOTAL);
    }

   /**
    * Get Place of this track, e.g. 3 of 15.
    * 
    * @return Place of this track, e.g. 3 of 15.
    */
    @Nullable
    public final LocalTime getTrackPositionTotalAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.TRACKPOSITIONTOTAL);
    }

   /**
    * Get Place of this track, e.g. 3 of 15.
    * 
    * @return Place of this track, e.g. 3 of 15.
    */
    @Nullable
    public final String getTrackPositionTotalAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.TRACKPOSITIONTOTAL);
    }

   /**
    * Get Place of this track, e.g. 3 of 15.
    * 
    * @return Place of this track, e.g. 3 of 15.
    */
    @Nullable
    public final Boolean getTrackPositionTotalAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.TRACKPOSITIONTOTAL);
    }

   /**
    * Get Place of this track, e.g. 3 of 15.
    * 
    * @return Place of this track, e.g. 3 of 15.
    */
    @Nullable
    public final BigInteger getTrackPositionTotalAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.TRACKPOSITIONTOTAL);
    }

   /**
    * Get Place of this track, e.g. 3 of 15.
    * 
    * @return Place of this track, e.g. 3 of 15.
    */
    @Nullable
    public final URL getTrackPositionTotalAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.TRACKPOSITIONTOTAL);
    }

   /**
    * Get Place of this track, e.g. 3 of 15.
    * 
    * @return Place of this track, e.g. 3 of 15.
    */
    @NonNull
    public final List<@NonNull String> getTrackPositionTotalAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.TRACKPOSITIONTOTAL);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Country, where the movie was procuced.
    * 
    * @return Country, where the movie was procuced.
    */
    @Nullable
    public final Integer getMovieCountryAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.MOVIECOUNTRY);
    }

   /**
    * Get Country, where the movie was procuced.
    * 
    * @return Country, where the movie was procuced.
    */
    @Nullable
    public final Long getMovieCountryAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.MOVIECOUNTRY);
    }

   /**
    * Get Country, where the movie was procuced.
    * 
    * @return Country, where the movie was procuced.
    */
    @Nullable
    public final LocalDateTime getMovieCountryAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.MOVIECOUNTRY);
    }

   /**
    * Get Country, where the movie was procuced.
    * 
    * @return Country, where the movie was procuced.
    */
    @Nullable
    public final LocalTime getMovieCountryAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.MOVIECOUNTRY);
    }

   /**
    * Get Country, where the movie was procuced.
    * 
    * @return Country, where the movie was procuced.
    */
    @Nullable
    public final String getMovieCountryAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.MOVIECOUNTRY);
    }

   /**
    * Get Country, where the movie was procuced.
    * 
    * @return Country, where the movie was procuced.
    */
    @Nullable
    public final Boolean getMovieCountryAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.MOVIECOUNTRY);
    }

   /**
    * Get Country, where the movie was procuced.
    * 
    * @return Country, where the movie was procuced.
    */
    @Nullable
    public final BigInteger getMovieCountryAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.MOVIECOUNTRY);
    }

   /**
    * Get Country, where the movie was procuced.
    * 
    * @return Country, where the movie was procuced.
    */
    @Nullable
    public final URL getMovieCountryAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.MOVIECOUNTRY);
    }

   /**
    * Get Country, where the movie was procuced.
    * 
    * @return Country, where the movie was procuced.
    */
    @NonNull
    public final List<@NonNull String> getMovieCountryAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.MOVIECOUNTRY);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Homepage of the album performer/artist.
    * 
    * @return Homepage of the album performer/artist.
    */
    @Nullable
    public final Integer getAlbumPerformerUrlAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ALBUMPERFORMERURL);
    }

   /**
    * Get Homepage of the album performer/artist.
    * 
    * @return Homepage of the album performer/artist.
    */
    @Nullable
    public final Long getAlbumPerformerUrlAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ALBUMPERFORMERURL);
    }

   /**
    * Get Homepage of the album performer/artist.
    * 
    * @return Homepage of the album performer/artist.
    */
    @Nullable
    public final LocalDateTime getAlbumPerformerUrlAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ALBUMPERFORMERURL);
    }

   /**
    * Get Homepage of the album performer/artist.
    * 
    * @return Homepage of the album performer/artist.
    */
    @Nullable
    public final LocalTime getAlbumPerformerUrlAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ALBUMPERFORMERURL);
    }

   /**
    * Get Homepage of the album performer/artist.
    * 
    * @return Homepage of the album performer/artist.
    */
    @Nullable
    public final String getAlbumPerformerUrlAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ALBUMPERFORMERURL);
    }

   /**
    * Get Homepage of the album performer/artist.
    * 
    * @return Homepage of the album performer/artist.
    */
    @Nullable
    public final Boolean getAlbumPerformerUrlAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ALBUMPERFORMERURL);
    }

   /**
    * Get Homepage of the album performer/artist.
    * 
    * @return Homepage of the album performer/artist.
    */
    @Nullable
    public final BigInteger getAlbumPerformerUrlAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ALBUMPERFORMERURL);
    }

   /**
    * Get Homepage of the album performer/artist.
    * 
    * @return Homepage of the album performer/artist.
    */
    @Nullable
    public final URL getAlbumPerformerUrlAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ALBUMPERFORMERURL);
    }

   /**
    * Get Homepage of the album performer/artist.
    * 
    * @return Homepage of the album performer/artist.
    */
    @NonNull
    public final List<@NonNull String> getAlbumPerformerUrlAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ALBUMPERFORMERURL);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final Integer getCodecIDStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.CODECIDSTRING);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final Long getCodecIDStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.CODECIDSTRING);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final LocalDateTime getCodecIDStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.CODECIDSTRING);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final LocalTime getCodecIDStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.CODECIDSTRING);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final String getCodecIDStringAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.CODECIDSTRING);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final Boolean getCodecIDStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.CODECIDSTRING);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final BigInteger getCodecIDStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.CODECIDSTRING);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @Nullable
    public final URL getCodecIDStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.CODECIDSTRING);
    }

   /**
    * Get Codec ID (found in some containers).
    * 
    * @return Codec ID (found in some containers).
    */
    @NonNull
    public final List<@NonNull String> getCodecIDStringAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.CODECIDSTRING);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final Integer getEncodedLibraryCompanyNameAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ENCODEDLIBRARYCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final Long getEncodedLibraryCompanyNameAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ENCODEDLIBRARYCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final LocalDateTime getEncodedLibraryCompanyNameAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ENCODEDLIBRARYCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final LocalTime getEncodedLibraryCompanyNameAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ENCODEDLIBRARYCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final String getEncodedLibraryCompanyNameAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ENCODEDLIBRARYCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final Boolean getEncodedLibraryCompanyNameAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ENCODEDLIBRARYCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final BigInteger getEncodedLibraryCompanyNameAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ENCODEDLIBRARYCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @Nullable
    public final URL getEncodedLibraryCompanyNameAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ENCODEDLIBRARYCOMPANYNAME);
    }

   /**
    * Get Name of the company.
    * 
    * @return Name of the company.
    */
    @NonNull
    public final List<@NonNull String> getEncodedLibraryCompanyNameAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ENCODEDLIBRARYCOMPANYNAME);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Name of the comic..
    * 
    * @return Name of the comic..
    */
    @Nullable
    public final Integer getComicAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.COMIC);
    }

   /**
    * Get Name of the comic..
    * 
    * @return Name of the comic..
    */
    @Nullable
    public final Long getComicAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.COMIC);
    }

   /**
    * Get Name of the comic..
    * 
    * @return Name of the comic..
    */
    @Nullable
    public final LocalDateTime getComicAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.COMIC);
    }

   /**
    * Get Name of the comic..
    * 
    * @return Name of the comic..
    */
    @Nullable
    public final LocalTime getComicAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.COMIC);
    }

   /**
    * Get Name of the comic..
    * 
    * @return Name of the comic..
    */
    @Nullable
    public final String getComicAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.COMIC);
    }

   /**
    * Get Name of the comic..
    * 
    * @return Name of the comic..
    */
    @Nullable
    public final Boolean getComicAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.COMIC);
    }

   /**
    * Get Name of the comic..
    * 
    * @return Name of the comic..
    */
    @Nullable
    public final BigInteger getComicAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.COMIC);
    }

   /**
    * Get Name of the comic..
    * 
    * @return Name of the comic..
    */
    @Nullable
    public final URL getComicAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.COMIC);
    }

   /**
    * Get Name of the comic..
    * 
    * @return Name of the comic..
    */
    @NonNull
    public final List<@NonNull String> getComicAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.COMIC);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Editors name.
    * 
    * @return Editors name.
    */
    @Nullable
    public final Integer getEditedByAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.EDITEDBY);
    }

   /**
    * Get Editors name.
    * 
    * @return Editors name.
    */
    @Nullable
    public final Long getEditedByAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.EDITEDBY);
    }

   /**
    * Get Editors name.
    * 
    * @return Editors name.
    */
    @Nullable
    public final LocalDateTime getEditedByAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.EDITEDBY);
    }

   /**
    * Get Editors name.
    * 
    * @return Editors name.
    */
    @Nullable
    public final LocalTime getEditedByAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.EDITEDBY);
    }

   /**
    * Get Editors name.
    * 
    * @return Editors name.
    */
    @Nullable
    public final String getEditedByAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.EDITEDBY);
    }

   /**
    * Get Editors name.
    * 
    * @return Editors name.
    */
    @Nullable
    public final Boolean getEditedByAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.EDITEDBY);
    }

   /**
    * Get Editors name.
    * 
    * @return Editors name.
    */
    @Nullable
    public final BigInteger getEditedByAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.EDITEDBY);
    }

   /**
    * Get Editors name.
    * 
    * @return Editors name.
    */
    @Nullable
    public final URL getEditedByAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.EDITEDBY);
    }

   /**
    * Get Editors name.
    * 
    * @return Editors name.
    */
    @NonNull
    public final List<@NonNull String> getEditedByAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.EDITEDBY);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Commercial name used by vendor for theses setings or Format field if there is no difference.
    * 
    * @return Commercial name used by vendor for theses setings or Format field if there is no difference.
    */
    @Nullable
    public final Integer getFormatCommercialAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.FORMATCOMMERCIAL);
    }

   /**
    * Get Commercial name used by vendor for theses setings or Format field if there is no difference.
    * 
    * @return Commercial name used by vendor for theses setings or Format field if there is no difference.
    */
    @Nullable
    public final Long getFormatCommercialAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.FORMATCOMMERCIAL);
    }

   /**
    * Get Commercial name used by vendor for theses setings or Format field if there is no difference.
    * 
    * @return Commercial name used by vendor for theses setings or Format field if there is no difference.
    */
    @Nullable
    public final LocalDateTime getFormatCommercialAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.FORMATCOMMERCIAL);
    }

   /**
    * Get Commercial name used by vendor for theses setings or Format field if there is no difference.
    * 
    * @return Commercial name used by vendor for theses setings or Format field if there is no difference.
    */
    @Nullable
    public final LocalTime getFormatCommercialAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.FORMATCOMMERCIAL);
    }

   /**
    * Get Commercial name used by vendor for theses setings or Format field if there is no difference.
    * 
    * @return Commercial name used by vendor for theses setings or Format field if there is no difference.
    */
    @Nullable
    public final String getFormatCommercialAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.FORMATCOMMERCIAL);
    }

   /**
    * Get Commercial name used by vendor for theses setings or Format field if there is no difference.
    * 
    * @return Commercial name used by vendor for theses setings or Format field if there is no difference.
    */
    @Nullable
    public final Boolean getFormatCommercialAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.FORMATCOMMERCIAL);
    }

   /**
    * Get Commercial name used by vendor for theses setings or Format field if there is no difference.
    * 
    * @return Commercial name used by vendor for theses setings or Format field if there is no difference.
    */
    @Nullable
    public final BigInteger getFormatCommercialAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.FORMATCOMMERCIAL);
    }

   /**
    * Get Commercial name used by vendor for theses setings or Format field if there is no difference.
    * 
    * @return Commercial name used by vendor for theses setings or Format field if there is no difference.
    */
    @Nullable
    public final URL getFormatCommercialAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.FORMATCOMMERCIAL);
    }

   /**
    * Get Commercial name used by vendor for theses setings or Format field if there is no difference.
    * 
    * @return Commercial name used by vendor for theses setings or Format field if there is no difference.
    */
    @NonNull
    public final List<@NonNull String> getFormatCommercialAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.FORMATCOMMERCIAL);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Any comment related to the content..
    * 
    * @return Any comment related to the content..
    */
    @Nullable
    public final Integer getCommentAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.COMMENT);
    }

   /**
    * Get Any comment related to the content..
    * 
    * @return Any comment related to the content..
    */
    @Nullable
    public final Long getCommentAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.COMMENT);
    }

   /**
    * Get Any comment related to the content..
    * 
    * @return Any comment related to the content..
    */
    @Nullable
    public final LocalDateTime getCommentAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.COMMENT);
    }

   /**
    * Get Any comment related to the content..
    * 
    * @return Any comment related to the content..
    */
    @Nullable
    public final LocalTime getCommentAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.COMMENT);
    }

   /**
    * Get Any comment related to the content..
    * 
    * @return Any comment related to the content..
    */
    @Nullable
    public final String getCommentAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.COMMENT);
    }

   /**
    * Get Any comment related to the content..
    * 
    * @return Any comment related to the content..
    */
    @Nullable
    public final Boolean getCommentAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.COMMENT);
    }

   /**
    * Get Any comment related to the content..
    * 
    * @return Any comment related to the content..
    */
    @Nullable
    public final BigInteger getCommentAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.COMMENT);
    }

   /**
    * Get Any comment related to the content..
    * 
    * @return Any comment related to the content..
    */
    @Nullable
    public final URL getCommentAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.COMMENT);
    }

   /**
    * Get Any comment related to the content..
    * 
    * @return Any comment related to the content..
    */
    @NonNull
    public final List<@NonNull String> getCommentAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.COMMENT);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Audio Codecs in this file with popular name (hint), separated by /.
    * 
    * @return Audio Codecs in this file with popular name (hint), separated by /.
    */
    @Nullable
    public final Integer getAudioFormatWithHintListAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.AUDIOFORMATWITHHINTLIST);
    }

   /**
    * Get Audio Codecs in this file with popular name (hint), separated by /.
    * 
    * @return Audio Codecs in this file with popular name (hint), separated by /.
    */
    @Nullable
    public final Long getAudioFormatWithHintListAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.AUDIOFORMATWITHHINTLIST);
    }

   /**
    * Get Audio Codecs in this file with popular name (hint), separated by /.
    * 
    * @return Audio Codecs in this file with popular name (hint), separated by /.
    */
    @Nullable
    public final LocalDateTime getAudioFormatWithHintListAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.AUDIOFORMATWITHHINTLIST);
    }

   /**
    * Get Audio Codecs in this file with popular name (hint), separated by /.
    * 
    * @return Audio Codecs in this file with popular name (hint), separated by /.
    */
    @Nullable
    public final LocalTime getAudioFormatWithHintListAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.AUDIOFORMATWITHHINTLIST);
    }

   /**
    * Get Audio Codecs in this file with popular name (hint), separated by /.
    * 
    * @return Audio Codecs in this file with popular name (hint), separated by /.
    */
    @Nullable
    public final String getAudioFormatWithHintListAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.AUDIOFORMATWITHHINTLIST);
    }

   /**
    * Get Audio Codecs in this file with popular name (hint), separated by /.
    * 
    * @return Audio Codecs in this file with popular name (hint), separated by /.
    */
    @Nullable
    public final Boolean getAudioFormatWithHintListAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.AUDIOFORMATWITHHINTLIST);
    }

   /**
    * Get Audio Codecs in this file with popular name (hint), separated by /.
    * 
    * @return Audio Codecs in this file with popular name (hint), separated by /.
    */
    @Nullable
    public final BigInteger getAudioFormatWithHintListAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.AUDIOFORMATWITHHINTLIST);
    }

   /**
    * Get Audio Codecs in this file with popular name (hint), separated by /.
    * 
    * @return Audio Codecs in this file with popular name (hint), separated by /.
    */
    @Nullable
    public final URL getAudioFormatWithHintListAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.AUDIOFORMATWITHHINTLIST);
    }

   /**
    * Get Audio Codecs in this file with popular name (hint), separated by /.
    * 
    * @return Audio Codecs in this file with popular name (hint), separated by /.
    */
    @NonNull
    public final List<@NonNull String> getAudioFormatWithHintListAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.AUDIOFORMATWITHHINTLIST);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final Integer getDelaySourceStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.DELAYSOURCESTRING);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final Long getDelaySourceStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.DELAYSOURCESTRING);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final LocalDateTime getDelaySourceStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.DELAYSOURCESTRING);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final LocalTime getDelaySourceStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.DELAYSOURCESTRING);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final String getDelaySourceStringAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.DELAYSOURCESTRING);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final Boolean getDelaySourceStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.DELAYSOURCESTRING);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final BigInteger getDelaySourceStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.DELAYSOURCESTRING);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @Nullable
    public final URL getDelaySourceStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.DELAYSOURCESTRING);
    }

   /**
    * Get Delay source (Container or Stream or empty).
    * 
    * @return Delay source (Container or Stream or empty).
    */
    @NonNull
    public final List<@NonNull String> getDelaySourceStringAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.DELAYSOURCESTRING);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Name of the person or organization who supplied the original subject.
    * 
    * @return Name of the person or organization who supplied the original subject.
    */
    @Nullable
    public final Integer getOriginalSourceFormDistributedByAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ORIGINALSOURCEFORMDISTRIBUTEDBY);
    }

   /**
    * Get Name of the person or organization who supplied the original subject.
    * 
    * @return Name of the person or organization who supplied the original subject.
    */
    @Nullable
    public final Long getOriginalSourceFormDistributedByAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ORIGINALSOURCEFORMDISTRIBUTEDBY);
    }

   /**
    * Get Name of the person or organization who supplied the original subject.
    * 
    * @return Name of the person or organization who supplied the original subject.
    */
    @Nullable
    public final LocalDateTime getOriginalSourceFormDistributedByAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ORIGINALSOURCEFORMDISTRIBUTEDBY);
    }

   /**
    * Get Name of the person or organization who supplied the original subject.
    * 
    * @return Name of the person or organization who supplied the original subject.
    */
    @Nullable
    public final LocalTime getOriginalSourceFormDistributedByAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ORIGINALSOURCEFORMDISTRIBUTEDBY);
    }

   /**
    * Get Name of the person or organization who supplied the original subject.
    * 
    * @return Name of the person or organization who supplied the original subject.
    */
    @Nullable
    public final String getOriginalSourceFormDistributedByAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ORIGINALSOURCEFORMDISTRIBUTEDBY);
    }

   /**
    * Get Name of the person or organization who supplied the original subject.
    * 
    * @return Name of the person or organization who supplied the original subject.
    */
    @Nullable
    public final Boolean getOriginalSourceFormDistributedByAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ORIGINALSOURCEFORMDISTRIBUTEDBY);
    }

   /**
    * Get Name of the person or organization who supplied the original subject.
    * 
    * @return Name of the person or organization who supplied the original subject.
    */
    @Nullable
    public final BigInteger getOriginalSourceFormDistributedByAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ORIGINALSOURCEFORMDISTRIBUTEDBY);
    }

   /**
    * Get Name of the person or organization who supplied the original subject.
    * 
    * @return Name of the person or organization who supplied the original subject.
    */
    @Nullable
    public final URL getOriginalSourceFormDistributedByAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ORIGINALSOURCEFORMDISTRIBUTEDBY);
    }

   /**
    * Get Name of the person or organization who supplied the original subject.
    * 
    * @return Name of the person or organization who supplied the original subject.
    */
    @NonNull
    public final List<@NonNull String> getOriginalSourceFormDistributedByAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ORIGINALSOURCEFORMDISTRIBUTEDBY);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Date/year the item was added to the owners collection.
    * 
    * @return Date/year the item was added to the owners collection.
    */
    @Nullable
    public final Integer getAddedDateAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ADDEDDATE);
    }

   /**
    * Get Date/year the item was added to the owners collection.
    * 
    * @return Date/year the item was added to the owners collection.
    */
    @Nullable
    public final Long getAddedDateAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ADDEDDATE);
    }

   /**
    * Get Date/year the item was added to the owners collection.
    * 
    * @return Date/year the item was added to the owners collection.
    */
    @Nullable
    public final LocalDateTime getAddedDateAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ADDEDDATE);
    }

   /**
    * Get Date/year the item was added to the owners collection.
    * 
    * @return Date/year the item was added to the owners collection.
    */
    @Nullable
    public final LocalTime getAddedDateAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ADDEDDATE);
    }

   /**
    * Get Date/year the item was added to the owners collection.
    * 
    * @return Date/year the item was added to the owners collection.
    */
    @Nullable
    public final String getAddedDateAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ADDEDDATE);
    }

   /**
    * Get Date/year the item was added to the owners collection.
    * 
    * @return Date/year the item was added to the owners collection.
    */
    @Nullable
    public final Boolean getAddedDateAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ADDEDDATE);
    }

   /**
    * Get Date/year the item was added to the owners collection.
    * 
    * @return Date/year the item was added to the owners collection.
    */
    @Nullable
    public final BigInteger getAddedDateAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ADDEDDATE);
    }

   /**
    * Get Date/year the item was added to the owners collection.
    * 
    * @return Date/year the item was added to the owners collection.
    */
    @Nullable
    public final URL getAddedDateAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ADDEDDATE);
    }

   /**
    * Get Date/year the item was added to the owners collection.
    * 
    * @return Date/year the item was added to the owners collection.
    */
    @NonNull
    public final List<@NonNull String> getAddedDateAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ADDEDDATE);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final Integer getStreamKindStringAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.STREAMKINDSTRING);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final Long getStreamKindStringAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.STREAMKINDSTRING);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final LocalDateTime getStreamKindStringAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.STREAMKINDSTRING);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final LocalTime getStreamKindStringAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.STREAMKINDSTRING);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final String getStreamKindStringAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.STREAMKINDSTRING);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final Boolean getStreamKindStringAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.STREAMKINDSTRING);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final BigInteger getStreamKindStringAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.STREAMKINDSTRING);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @Nullable
    public final URL getStreamKindStringAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.STREAMKINDSTRING);
    }

   /**
    * Get Stream type name.
    * 
    * @return Stream type name.
    */
    @NonNull
    public final List<@NonNull String> getStreamKindStringAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.STREAMKINDSTRING);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get More infos about the track.
    * 
    * @return More infos about the track.
    */
    @Nullable
    public final Integer getTrackMoreAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.TRACKMORE);
    }

   /**
    * Get More infos about the track.
    * 
    * @return More infos about the track.
    */
    @Nullable
    public final Long getTrackMoreAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.TRACKMORE);
    }

   /**
    * Get More infos about the track.
    * 
    * @return More infos about the track.
    */
    @Nullable
    public final LocalDateTime getTrackMoreAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.TRACKMORE);
    }

   /**
    * Get More infos about the track.
    * 
    * @return More infos about the track.
    */
    @Nullable
    public final LocalTime getTrackMoreAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.TRACKMORE);
    }

   /**
    * Get More infos about the track.
    * 
    * @return More infos about the track.
    */
    @Nullable
    public final String getTrackMoreAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.TRACKMORE);
    }

   /**
    * Get More infos about the track.
    * 
    * @return More infos about the track.
    */
    @Nullable
    public final Boolean getTrackMoreAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.TRACKMORE);
    }

   /**
    * Get More infos about the track.
    * 
    * @return More infos about the track.
    */
    @Nullable
    public final BigInteger getTrackMoreAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.TRACKMORE);
    }

   /**
    * Get More infos about the track.
    * 
    * @return More infos about the track.
    */
    @Nullable
    public final URL getTrackMoreAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.TRACKMORE);
    }

   /**
    * Get More infos about the track.
    * 
    * @return More infos about the track.
    */
    @NonNull
    public final List<@NonNull String> getTrackMoreAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.TRACKMORE);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Version of the product.
    * 
    * @return Version of the product.
    */
    @Nullable
    public final Integer getEncodedApplicationVersionAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.ENCODEDAPPLICATIONVERSION);
    }

   /**
    * Get Version of the product.
    * 
    * @return Version of the product.
    */
    @Nullable
    public final Long getEncodedApplicationVersionAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.ENCODEDAPPLICATIONVERSION);
    }

   /**
    * Get Version of the product.
    * 
    * @return Version of the product.
    */
    @Nullable
    public final LocalDateTime getEncodedApplicationVersionAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.ENCODEDAPPLICATIONVERSION);
    }

   /**
    * Get Version of the product.
    * 
    * @return Version of the product.
    */
    @Nullable
    public final LocalTime getEncodedApplicationVersionAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.ENCODEDAPPLICATIONVERSION);
    }

   /**
    * Get Version of the product.
    * 
    * @return Version of the product.
    */
    @Nullable
    public final String getEncodedApplicationVersionAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.ENCODEDAPPLICATIONVERSION);
    }

   /**
    * Get Version of the product.
    * 
    * @return Version of the product.
    */
    @Nullable
    public final Boolean getEncodedApplicationVersionAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.ENCODEDAPPLICATIONVERSION);
    }

   /**
    * Get Version of the product.
    * 
    * @return Version of the product.
    */
    @Nullable
    public final BigInteger getEncodedApplicationVersionAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.ENCODEDAPPLICATIONVERSION);
    }

   /**
    * Get Version of the product.
    * 
    * @return Version of the product.
    */
    @Nullable
    public final URL getEncodedApplicationVersionAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.ENCODEDAPPLICATIONVERSION);
    }

   /**
    * Get Version of the product.
    * 
    * @return Version of the product.
    */
    @NonNull
    public final List<@NonNull String> getEncodedApplicationVersionAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.ENCODEDAPPLICATIONVERSION);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final Integer getMenuIDAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.MENUID);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final Long getMenuIDAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.MENUID);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final LocalDateTime getMenuIDAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.MENUID);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final LocalTime getMenuIDAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.MENUID);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final String getMenuIDAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.MENUID);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final Boolean getMenuIDAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.MENUID);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final BigInteger getMenuIDAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.MENUID);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @Nullable
    public final URL getMenuIDAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.MENUID);
    }

   /**
    * Get The menu ID for this stream in this file.
    * 
    * @return The menu ID for this stream in this file.
    */
    @NonNull
    public final List<@NonNull String> getMenuIDAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.MENUID);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Menu Codecsin this file, separated by /.
    * 
    * @return Menu Codecsin this file, separated by /.
    */
    @Nullable
    public final Integer getMenuFormatListAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.MENUFORMATLIST);
    }

   /**
    * Get Menu Codecsin this file, separated by /.
    * 
    * @return Menu Codecsin this file, separated by /.
    */
    @Nullable
    public final Long getMenuFormatListAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.MENUFORMATLIST);
    }

   /**
    * Get Menu Codecsin this file, separated by /.
    * 
    * @return Menu Codecsin this file, separated by /.
    */
    @Nullable
    public final LocalDateTime getMenuFormatListAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.MENUFORMATLIST);
    }

   /**
    * Get Menu Codecsin this file, separated by /.
    * 
    * @return Menu Codecsin this file, separated by /.
    */
    @Nullable
    public final LocalTime getMenuFormatListAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.MENUFORMATLIST);
    }

   /**
    * Get Menu Codecsin this file, separated by /.
    * 
    * @return Menu Codecsin this file, separated by /.
    */
    @Nullable
    public final String getMenuFormatListAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.MENUFORMATLIST);
    }

   /**
    * Get Menu Codecsin this file, separated by /.
    * 
    * @return Menu Codecsin this file, separated by /.
    */
    @Nullable
    public final Boolean getMenuFormatListAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.MENUFORMATLIST);
    }

   /**
    * Get Menu Codecsin this file, separated by /.
    * 
    * @return Menu Codecsin this file, separated by /.
    */
    @Nullable
    public final BigInteger getMenuFormatListAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.MENUFORMATLIST);
    }

   /**
    * Get Menu Codecsin this file, separated by /.
    * 
    * @return Menu Codecsin this file, separated by /.
    */
    @Nullable
    public final URL getMenuFormatListAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.MENUFORMATLIST);
    }

   /**
    * Get Menu Codecsin this file, separated by /.
    * 
    * @return Menu Codecsin this file, separated by /.
    */
    @NonNull
    public final List<@NonNull String> getMenuFormatListAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.MENUFORMATLIST);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Performer/Sort.
    * 
    * @return Performer/Sort.
    */
    @Nullable
    public final Integer getPerformerSortAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.PERFORMERSORT);
    }

   /**
    * Get Performer/Sort.
    * 
    * @return Performer/Sort.
    */
    @Nullable
    public final Long getPerformerSortAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.PERFORMERSORT);
    }

   /**
    * Get Performer/Sort.
    * 
    * @return Performer/Sort.
    */
    @Nullable
    public final LocalDateTime getPerformerSortAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.PERFORMERSORT);
    }

   /**
    * Get Performer/Sort.
    * 
    * @return Performer/Sort.
    */
    @Nullable
    public final LocalTime getPerformerSortAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.PERFORMERSORT);
    }

   /**
    * Get Performer/Sort.
    * 
    * @return Performer/Sort.
    */
    @Nullable
    public final String getPerformerSortAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.PERFORMERSORT);
    }

   /**
    * Get Performer/Sort.
    * 
    * @return Performer/Sort.
    */
    @Nullable
    public final Boolean getPerformerSortAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.PERFORMERSORT);
    }

   /**
    * Get Performer/Sort.
    * 
    * @return Performer/Sort.
    */
    @Nullable
    public final BigInteger getPerformerSortAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.PERFORMERSORT);
    }

   /**
    * Get Performer/Sort.
    * 
    * @return Performer/Sort.
    */
    @Nullable
    public final URL getPerformerSortAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.PERFORMERSORT);
    }

   /**
    * Get Performer/Sort.
    * 
    * @return Performer/Sort.
    */
    @NonNull
    public final List<@NonNull String> getPerformerSortAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.PERFORMERSORT);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Homepage for the movie.
    * 
    * @return Homepage for the movie.
    */
    @Nullable
    public final Integer getMovieUrlAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.MOVIEURL);
    }

   /**
    * Get Homepage for the movie.
    * 
    * @return Homepage for the movie.
    */
    @Nullable
    public final Long getMovieUrlAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.MOVIEURL);
    }

   /**
    * Get Homepage for the movie.
    * 
    * @return Homepage for the movie.
    */
    @Nullable
    public final LocalDateTime getMovieUrlAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.MOVIEURL);
    }

   /**
    * Get Homepage for the movie.
    * 
    * @return Homepage for the movie.
    */
    @Nullable
    public final LocalTime getMovieUrlAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.MOVIEURL);
    }

   /**
    * Get Homepage for the movie.
    * 
    * @return Homepage for the movie.
    */
    @Nullable
    public final String getMovieUrlAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.MOVIEURL);
    }

   /**
    * Get Homepage for the movie.
    * 
    * @return Homepage for the movie.
    */
    @Nullable
    public final Boolean getMovieUrlAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.MOVIEURL);
    }

   /**
    * Get Homepage for the movie.
    * 
    * @return Homepage for the movie.
    */
    @Nullable
    public final BigInteger getMovieUrlAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.MOVIEURL);
    }

   /**
    * Get Homepage for the movie.
    * 
    * @return Homepage for the movie.
    */
    @Nullable
    public final URL getMovieUrlAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.MOVIEURL);
    }

   /**
    * Get Homepage for the movie.
    * 
    * @return Homepage for the movie.
    */
    @NonNull
    public final List<@NonNull String> getMovieUrlAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.MOVIEURL);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get A plot outline or a summary of the story..
    * 
    * @return A plot outline or a summary of the story..
    */
    @Nullable
    public final Integer getSummaryAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.SUMMARY);
    }

   /**
    * Get A plot outline or a summary of the story..
    * 
    * @return A plot outline or a summary of the story..
    */
    @Nullable
    public final Long getSummaryAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.SUMMARY);
    }

   /**
    * Get A plot outline or a summary of the story..
    * 
    * @return A plot outline or a summary of the story..
    */
    @Nullable
    public final LocalDateTime getSummaryAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.SUMMARY);
    }

   /**
    * Get A plot outline or a summary of the story..
    * 
    * @return A plot outline or a summary of the story..
    */
    @Nullable
    public final LocalTime getSummaryAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.SUMMARY);
    }

   /**
    * Get A plot outline or a summary of the story..
    * 
    * @return A plot outline or a summary of the story..
    */
    @Nullable
    public final String getSummaryAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.SUMMARY);
    }

   /**
    * Get A plot outline or a summary of the story..
    * 
    * @return A plot outline or a summary of the story..
    */
    @Nullable
    public final Boolean getSummaryAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.SUMMARY);
    }

   /**
    * Get A plot outline or a summary of the story..
    * 
    * @return A plot outline or a summary of the story..
    */
    @Nullable
    public final BigInteger getSummaryAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.SUMMARY);
    }

   /**
    * Get A plot outline or a summary of the story..
    * 
    * @return A plot outline or a summary of the story..
    */
    @Nullable
    public final URL getSummaryAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.SUMMARY);
    }

   /**
    * Get A plot outline or a summary of the story..
    * 
    * @return A plot outline or a summary of the story..
    */
    @NonNull
    public final List<@NonNull String> getSummaryAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.SUMMARY);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

   /**
    * Get Name of the track. e.g. track1, track 2.
    * 
    * @return Name of the track. e.g. track1, track 2.
    */
    @Nullable
    public final Integer getTrackAsInteger() {
        return getMediaInfo().getAsInteger(StreamKind.General, 0, General.TRACK);
    }

   /**
    * Get Name of the track. e.g. track1, track 2.
    * 
    * @return Name of the track. e.g. track1, track 2.
    */
    @Nullable
    public final Long getTrackAsLong() {
        return getMediaInfo().getAsLong(StreamKind.General, 0, General.TRACK);
    }

   /**
    * Get Name of the track. e.g. track1, track 2.
    * 
    * @return Name of the track. e.g. track1, track 2.
    */
    @Nullable
    public final LocalDateTime getTrackAsLocalDateTime() {
        return getMediaInfo().getAsLocalDateTime(StreamKind.General, 0, General.TRACK);
    }

   /**
    * Get Name of the track. e.g. track1, track 2.
    * 
    * @return Name of the track. e.g. track1, track 2.
    */
    @Nullable
    public final LocalTime getTrackAsLocalTime() {
        return getMediaInfo().getAsLocalTime(StreamKind.General, 0, General.TRACK);
    }

   /**
    * Get Name of the track. e.g. track1, track 2.
    * 
    * @return Name of the track. e.g. track1, track 2.
    */
    @Nullable
    public final String getTrackAsString() {
        return getMediaInfo().getAsString(StreamKind.General, 0, General.TRACK);
    }

   /**
    * Get Name of the track. e.g. track1, track 2.
    * 
    * @return Name of the track. e.g. track1, track 2.
    */
    @Nullable
    public final Boolean getTrackAsBoolean() {
        return getMediaInfo().getAsBoolean(StreamKind.General, 0, General.TRACK);
    }

   /**
    * Get Name of the track. e.g. track1, track 2.
    * 
    * @return Name of the track. e.g. track1, track 2.
    */
    @Nullable
    public final BigInteger getTrackAsBigInteger() {
        return getMediaInfo().getAsBigInteger(StreamKind.General, 0, General.TRACK);
    }

   /**
    * Get Name of the track. e.g. track1, track 2.
    * 
    * @return Name of the track. e.g. track1, track 2.
    */
    @Nullable
    public final URL getTrackAsURL() {
        return getMediaInfo().getAsURL(StreamKind.General, 0, General.TRACK);
    }

   /**
    * Get Name of the track. e.g. track1, track 2.
    * 
    * @return Name of the track. e.g. track1, track 2.
    */
    @NonNull
    public final List<@NonNull String> getTrackAsStringList() {
        List<@NonNull String> result = new ArrayList<>();
        final String value = getMediaInfo().getAsString(StreamKind.General, 0, General.TRACK);
        if (!TextUtils.isEmpty(value)) {
            assert value != null;
            result = splitValues(value, "/");
        }
        return result;
    }

}
