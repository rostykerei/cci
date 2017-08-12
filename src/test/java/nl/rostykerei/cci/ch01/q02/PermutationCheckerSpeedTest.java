package nl.rostykerei.cci.ch01.q02;

import org.junit.Ignore;
import org.junit.Test;

public class PermutationCheckerSpeedTest {

    @Test
    @Ignore
    public void testSpeed() {
        test(new PermutationCheckerArray());
        test(new PermutationCheckerHashMap());
        test(new PermutationCheckerSort());
    }

    private void test(PermutationChecker checker) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            checker.isPermutation("abcdefghijklmnopqrstuvwxyz0123456789", "1fvjopts2uq7yz6w945mraexlcg3knbdh0i8");
        }

        System.out.println(checker.getClass().getSimpleName() + ": " + (System.currentTimeMillis() - start) + "ms");
    }

}
