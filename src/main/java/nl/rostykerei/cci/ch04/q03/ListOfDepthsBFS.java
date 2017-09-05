package nl.rostykerei.cci.ch04.q03;

import nl.rostykerei.cci.datastructure.BinaryTreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Implementation of {@link ListOfDepths} using breadth-first search.
 *
 * @param <T> the class of the objects in the tree
 * @author Rosty Kerei
 */
public final class ListOfDepthsBFS<T extends Comparable<T>>
        implements ListOfDepths<T> {

    @Override
    public List<LinkedList<BinaryTreeNode<T>>> getListOfDepth(
            final BinaryTreeNode<T> input) {

        List<LinkedList<BinaryTreeNode<T>>> result = new ArrayList<>();

        LinkedList<BinaryTreeNode<T>> newLevel = new LinkedList<>();
        newLevel.add(input);

        while (!newLevel.isEmpty()) {
            result.add(newLevel);

            LinkedList<BinaryTreeNode<T>> previousLevel = newLevel;
            newLevel = new LinkedList<>();

            for (BinaryTreeNode<T> node : previousLevel) {
                if (node.getLeft() != null) {
                    newLevel.add(node.getLeft());
                }

                if (node.getRight() != null) {
                    newLevel.add(node.getRight());
                }
            }
        }

        return result;
    }
}
