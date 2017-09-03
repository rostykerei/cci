package nl.rostykerei.cci.datastructure.impl;

import nl.rostykerei.cci.datastructure.TreeNode;
import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class TreeNodeImplTest {

    @Test
    public void getChildren() throws Exception {
        TreeNode<Integer> treeNode1 = new TreeNodeImpl<>(1);
        TreeNode<Integer> treeNode2 = new TreeNodeImpl<>(2);
        TreeNode<Integer> treeNode3 = new TreeNodeImpl<>(3);

        treeNode1.addChild(treeNode2);
        treeNode1.addChild(treeNode3);

        assertEquals(Arrays.asList(2, 3), treeNode1.getChildren().stream().map(TreeNode::getData).collect(Collectors.toList()));
        assertEquals(0, treeNode2.getChildren().size());
        assertEquals(0, treeNode3.getChildren().size());
    }

    @Test
    public void getData() throws Exception {
        assertNull(new TreeNodeImpl<Integer>(null).getData());
        assertEquals(1, (int) new TreeNodeImpl<>(1).getData());
    }

}