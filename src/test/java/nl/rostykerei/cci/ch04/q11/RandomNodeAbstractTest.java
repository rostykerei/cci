package nl.rostykerei.cci.ch04.q11;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public abstract class RandomNodeAbstractTest {

    protected abstract RandomNode<Integer> createNode(Integer value);

    @Test
    public void testRandomNode() throws Exception {
        RandomNode<Integer> n1 = createNode(1);
        RandomNode<Integer> n2 = createNode(2);
        RandomNode<Integer> n3 = createNode(3);
        RandomNode<Integer> n4 = createNode(4);
        RandomNode<Integer> n5 = createNode(5);
        RandomNode<Integer> n6 = createNode(6);
        RandomNode<Integer> n7 = createNode(7);

        n2.setLeft(n1);
        n2.setRight(n3);

        n4.setLeft(n2);
        n4.setRight(n6);

        n6.setRight(n5);
        n5.setRight(n7);

        boolean[] results = new boolean[7];

        for (int i = 0; i < 7 * 7 * 7; i++) {
            results[n4.getRandomNode().getData() - 1] = true;
        }

        for (int i = 0; i < 7; i++) {
            assertTrue(results[i]);
        }

    }
}
