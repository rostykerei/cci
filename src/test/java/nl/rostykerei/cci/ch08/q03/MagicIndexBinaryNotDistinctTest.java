package nl.rostykerei.cci.ch08.q03;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MagicIndexBinaryNotDistinctTest {

    @Test
    public void findMagicIndex() {
        int[] input = {-10, -5, 2, 2, 2, 3, 4, 7, 9, 12, 13};

        MagicIndex magicIndex = new MagicIndexBinaryFast();

        assertEquals(2, (int) magicIndex.findMagicIndex(input));
    }
}