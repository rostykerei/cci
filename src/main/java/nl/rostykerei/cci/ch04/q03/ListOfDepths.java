package nl.rostykerei.cci.ch04.q03;

import nl.rostykerei.cci.datastructure.BinaryTreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * Question 4.3 - List of Depths.
 *
 * @param <T> the class of the objects in the tree
 * @author Rosty Kerei
 */
public interface ListOfDepths<T extends Comparable<T>> {

    /**
     * Returns a list of linked lists of all the nodes at each depth.
     *
     * @param input root node
     * @return list of linked lists of all the nodes at each depth
     */
    List<LinkedList<BinaryTreeNode<T>>> getListOfDepth(BinaryTreeNode<T> input);

}
