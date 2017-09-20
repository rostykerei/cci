package nl.rostykerei.cci.datastructure;

/**
 * Pair data type.
 *
 * @param <F> the class of the first element in the pair
 * @param <S> the class of the second element in the pair
 * @author Rosty Kerei
 */
public interface Pair<F, S> {

    /**
     * Gets first element of the pair.
     *
     * @return first element of the pair.
     */
    F getFirst();

    /**
     * Gets second element of the pair.
     *
     * @return second element of the pair.
     */
    S getSecond();

}
