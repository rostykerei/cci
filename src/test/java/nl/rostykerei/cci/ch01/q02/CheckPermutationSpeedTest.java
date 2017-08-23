package nl.rostykerei.cci.ch01.q02;

import org.junit.Ignore;
import org.junit.Test;

public class CheckPermutationSpeedTest {

    @Test
    @Ignore
    public void testSpeed() {
        test(new CheckPermutationArray());
        test(new CheckPermutationHashMap());
        test(new CheckPermutationSort());
    }

    private void test(CheckPermutation checker) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            checker.checkPermutation("abcdefghijklmnopqrstuvwxyz0123456789", "1fvjopts2uq7yz6w945mraexlcg3knbdh0i8");
        }

        System.out.println(checker.getClass().getSimpleName() + ": " + (System.currentTimeMillis() - start) + "ms");
    }

}
