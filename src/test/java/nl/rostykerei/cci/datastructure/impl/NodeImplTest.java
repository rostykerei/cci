package nl.rostykerei.cci.datastructure.impl;

import nl.rostykerei.cci.datastructure.Node;
import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class NodeImplTest {

    @Test
    public void getChildren() throws Exception {
        Node<Integer> node1 = new NodeImpl<>(1);
        Node<Integer> node2 = new NodeImpl<>(2);
        Node<Integer> node3 = new NodeImpl<>(3);

        node1.addChild(node2);
        node1.addChild(node3);

        assertEquals(Arrays.asList(2, 3), node1.getChildren().stream().map(Node::getData).collect(Collectors.toList()));
        assertEquals(0, node2.getChildren().size());
        assertEquals(0, node3.getChildren().size());
    }

    @Test
    public void getData() throws Exception {
        assertNull(new NodeImpl<Integer>(null).getData());
        assertEquals(1, (int) new NodeImpl<>(1).getData());
    }

}