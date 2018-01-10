package nl.rostykerei.cci.ch08.q03;

/**
 * Question 8.3 - Magic Index.
 *
 * @author Rosty Kerei
 */
public interface MagicIndex {

    /**
     * Finds a magic index in the given array.
     *
     * @param input array to search
     * @return magic index or null if none found
     */
    Integer findMagicIndex(int[] input);
}
