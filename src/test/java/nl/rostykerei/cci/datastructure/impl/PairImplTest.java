package nl.rostykerei.cci.datastructure.impl;

import nl.rostykerei.cci.datastructure.Pair;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PairImplTest {
    @Test
    public void getFirst() {
        Pair<Integer, String> pair = new PairImpl<>(1, "A");

        assertEquals(1, (int) pair.getFirst());
        assertEquals("A", pair.getSecond());
    }

}
