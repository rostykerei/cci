package nl.rostykerei.cci.ch05.q03;

/**
 * Question 5.3 - Flip Bit to Win.
 *
 * @author Rosty Kerei
 */
public interface FlipBit {

    /**
     * Finds the length of the longest sequence of 1s
     * after one flip from 0 to 1.
     *
     * @param input input integer
     * @return length of the longest sequence of 1s possible
     */
    int flipBit(int input);

}
