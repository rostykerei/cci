package nl.rostykerei.cci.ch04.q01;

import nl.rostykerei.cci.common.AbstractFactoryTest;
import nl.rostykerei.cci.datastructure.Node;
import nl.rostykerei.cci.datastructure.impl.NodeImpl;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public abstract class RouteBetweenNodesAbstractTest extends AbstractFactoryTest<RouteBetweenNodes<String>> {

    /**
     * Happy-flow test.
     *    A
     *  /  \
     * B    D
     * |  / |
     * C    E
     */
    @Test
    public void testPath() throws Exception {
        Node<String> nodeA = new NodeImpl<>("A");
        Node<String> nodeB = new NodeImpl<>("B");
        Node<String> nodeC = new NodeImpl<>("C");
        Node<String> nodeD = new NodeImpl<>("D");
        Node<String> nodeE = new NodeImpl<>("E");

        nodeA.addChild(nodeB);
        nodeA.addChild(nodeD);

        nodeB.addChild(nodeC);
        nodeB.addChild(nodeC);

        nodeD.addChild(nodeC);
        nodeD.addChild(nodeE);

        assertTrue(testInstance.isRoutePossible(nodeA, nodeE));
    }

    /**
     *      A
     *     / \
     *    B   G
     *    | \
     *    C  D
     *      / \
     *     E   F
     */
    @Test
    public void testPath2() throws Exception {
        Node<String> nodeA = new NodeImpl<>("A");
        Node<String> nodeB = new NodeImpl<>("B");
        Node<String> nodeC = new NodeImpl<>("C");
        Node<String> nodeD = new NodeImpl<>("D");
        Node<String> nodeE = new NodeImpl<>("E");
        Node<String> nodeF = new NodeImpl<>("F");
        Node<String> nodeG = new NodeImpl<>("G");

        nodeA.addChild(nodeB);
        nodeA.addChild(nodeG);

        nodeB.addChild(nodeC);
        nodeB.addChild(nodeD);

        nodeD.addChild(nodeE);
        nodeD.addChild(nodeF);

        assertTrue(testInstance.isRoutePossible(nodeA, nodeG));

    }

    /**
     *      A
     * / /  |  \  \
     * B C  D  E  F
     * |
     * G
     */
    @Test
    public void testPath3() throws Exception {
        Node<String> nodeA = new NodeImpl<>("A");
        Node<String> nodeB = new NodeImpl<>("B");
        Node<String> nodeC = new NodeImpl<>("C");
        Node<String> nodeD = new NodeImpl<>("D");
        Node<String> nodeE = new NodeImpl<>("E");
        Node<String> nodeF = new NodeImpl<>("F");
        Node<String> nodeG = new NodeImpl<>("G");

        nodeA.addChild(nodeB);
        nodeA.addChild(nodeC);
        nodeA.addChild(nodeD);
        nodeA.addChild(nodeE);
        nodeA.addChild(nodeF);

        nodeB.addChild(nodeG);

        assertTrue(testInstance.isRoutePossible(nodeA, nodeG));
    }

    @Test
    public void testFalse() throws Exception {
        Node<String> nodeA = new NodeImpl<>("A");
        Node<String> nodeB = new NodeImpl<>("B");
        Node<String> nodeC = new NodeImpl<>("C");
        Node<String> nodeD = new NodeImpl<>("D");
        Node<String> nodeE = new NodeImpl<>("E");

        nodeA.addChild(nodeB);
        nodeB.addChild(nodeC);
        nodeB.addChild(nodeD);
        nodeD.addChild(nodeC);
        nodeE.addChild(nodeC);

        assertFalse(testInstance.isRoutePossible(nodeA, nodeE));
    }
}
