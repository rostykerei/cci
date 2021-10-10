package nl.rostykerei.cci.ch08.q03;

/**
 * Implementation of {@link MagicIndex} using binary search,
 * applicable for not distinct arrays.
 *
 * @author Rosty Kerei
 */
public final class MagicIndexBinaryFast implements MagicIndex {

    @Override
    public Integer findMagicIndex(final int[] input) {
        return binarySearch(input, 0, input.length - 1);
    }

    /**
     * Binary search for magic index. Works on sorted and not distinct input.
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
        }

        Integer left = binarySearch(input,
                start, Math.min(middle - 1, input[middle]));

        if (left != null) {
            return left;
        }

        return binarySearch(input, Math.max(middle + 1, input[middle]), end);
    }
}
