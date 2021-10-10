package nl.rostykerei.cci.ch04.q07;

import nl.rostykerei.cci.datastructure.Pair;

import java.util.List;
import java.util.Set;

/**
 * Question 4.7 - Build Order.
 *
 * @param <T> the class of the project objects
 * @author Rosty Kerei
 */
public interface BuildOrder<T> {

    /**
     * Finds a build order that will allow the projects to be built.
     *
     * @param projects     list of projects
     * @param dependencies list of dependencies, second project in the pair
     *                     is dependent on the first project
     * @return list of projects in a build order
     */
    List<T> buildOrder(Set<T> projects, Set<Pair<T, T>> dependencies);
}
