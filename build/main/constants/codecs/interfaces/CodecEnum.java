package aka.jmetadata.main.constants.codecs.interfaces;

import java.util.List;

import org.eclipse.jdt.annotation.NonNull;

/**
 * Interface for constants parameters.
 *
 * @author Welle Charlotte
 */
public interface CodecEnum {

    /**
     * Get the codecs of the ENUM.
     *
     * @return the codecs of the ENUM
     */
    @NonNull
    public List<@NonNull String> getValues();

}
