package nl.rostykerei.cci.ch08.q03;

/**
 * Implementation of {@link MagicIndex} using binary search.
 *
 * @author Rosty Kerei
 */
public final class MagicIndexBinarySearch implements MagicIndex {

    @Override
    public Integer findMagicIndex(final int[] input) {
        return binarySearch(input, 0, input.length - 1);
    }

    /**
     * Binary search for magic index. Works on sorted input.
     *
     * @param input array to search on
     * @param start start index
     * @param end   end index
     * @return magic index or null if not found
     */
    private Integer binarySearch(final int[] input,
                                 final int start, final int end) {
        if (start > end) {
            return null;
        }

        int middle = (start + end) >>> 1; // (start + end) / 2

        if (input[middle] == middle) {
            return middle;
        } else if (input[middle] > middle) {
            return binarySearch(input, start, middle - 1);
        } else {
            return binarySearch(input, middle + 1, end);
        }
    }
}
