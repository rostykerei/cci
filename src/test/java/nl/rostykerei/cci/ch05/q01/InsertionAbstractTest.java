package nl.rostykerei.cci.ch05.q01;

import nl.rostykerei.cci.common.AbstractFactoryTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public abstract class InsertionAbstractTest extends AbstractFactoryTest<Insertion> {

    @Test
    public void test1() {
        int n = 0b10000000000;
        //n = 0b11111111111;
        int m = 0b10011;
        byte i = 2;
        byte j = 6;

        assertEquals(0b10001001100, testInstance.insert(n, m, i, j));
    }
}