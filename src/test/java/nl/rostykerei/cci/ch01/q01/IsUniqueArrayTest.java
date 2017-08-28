package nl.rostykerei.cci.ch01.q01;

import org.junit.Test;
import static org.junit.Assert.assertFalse;

public class IsUniqueArrayTest extends UniqueCheckerAbstractTest {

    @Override
    protected IsUnique createTestInstance() {
        return new IsUniqueArray();
    }

    @Test
    public void tooLargeTest() throws Exception {
        StringBuilder sb = new StringBuilder();

        for (char i = 0; i < 255; i++) {
            sb.append(Character.valueOf(i));
        }

        sb.append('A');

        assertFalse(testInstance.isUniqueCharsOnly(sb.toString()));
    }
}