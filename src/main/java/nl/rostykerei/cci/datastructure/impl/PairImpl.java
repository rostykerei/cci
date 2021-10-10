package nl.rostykerei.cci.datastructure.impl;

import nl.rostykerei.cci.datastructure.Pair;

/**
 * Implementation of the {@link Pair}.
 *
 * @param <F> the class of the first element in the pair
 * @param <S> the class of the second element in the pair
 * @author Rosty Kerei
 */
public final class PairImpl<F, S> implements Pair<F, S> {

    /**
     * First element.
     */
    private final F first;

    /**
     * Second element.
     */
    private final S second;

    /**
     * Pair constructor.
     *
     * @param firstElement  first element.
     * @param secondElement second element.
     */
    public PairImpl(final F firstElement, final S secondElement) {
        this.first = firstElement;
        this.second = secondElement;
    }

    @Override
    public F getFirst() {
        return this.first;
    }

    @Override
    public S getSecond() {
        return this.second;
    }
}
