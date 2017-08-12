package nl.rostykerei.cci.ch01.q01;

import org.junit.Ignore;
import org.junit.Test;

public class UniqueCheckerSpeedTest {

    @Test
    @Ignore
    public void testSpeed() {
        test(new UniqueCharsCheckerArray());
        test(new UniqueCharsCheckerHashSet());
        test(new UniqueCharsCheckerString());
    }

    private void test(UniqueCharsChecker checker) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            checker.isUniqueCharsOnly("abcdefghijklmnopqrstuvwxyz0123456789");
        }

        System.out.println(checker.getClass().getSimpleName() + ": " + (System.currentTimeMillis() - start) + "ms");

    }

}
