package nl.rostykerei.cci.ch04.q07;

import nl.rostykerei.cci.common.AbstractFactoryTest;
import nl.rostykerei.cci.datastructure.Pair;
import nl.rostykerei.cci.datastructure.impl.PairImpl;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertTrue;

public abstract class BuildOrderAbstractTest extends AbstractFactoryTest<BuildOrder<String>> {

    @Test
    public void testOrder() {
        Set<String> projects = new HashSet<>();
        projects.add("A");
        projects.add("B");
        projects.add("C");
        projects.add("D");
        projects.add("E");
        projects.add("F");

        Set<Pair<String, String>> deps = new HashSet<>();
        deps.add(new PairImpl<>("A", "D"));
        deps.add(new PairImpl<>("F", "B"));
        deps.add(new PairImpl<>("B", "D"));
        deps.add(new PairImpl<>("F", "A"));
        deps.add(new PairImpl<>("D", "C"));

        assertTrue(
                Arrays.deepEquals(new String[]{"E", "F", "A", "B", "D", "C"},
                        testInstance.buildOrder(projects, deps).toArray())
        );
    }

    @Test
    public void testOrder2() {
        Set<String> projects = new HashSet<>();
        projects.add("A");
        projects.add("B");
        projects.add("C");
        projects.add("D");
        projects.add("E");
        projects.add("F");
        projects.add("G");

        Set<Pair<String, String>> deps = new HashSet<>();
        deps.add(new PairImpl<>("F", "C"));
        deps.add(new PairImpl<>("F", "B"));
        deps.add(new PairImpl<>("C", "A"));
        deps.add(new PairImpl<>("B", "A"));
        deps.add(new PairImpl<>("F", "A"));
        deps.add(new PairImpl<>("A", "E"));
        deps.add(new PairImpl<>("B", "E"));
        deps.add(new PairImpl<>("D", "G"));

        assertTrue(
                Arrays.deepEquals(new String[]{"D", "F", "G", "B", "C", "A", "E"},
                        testInstance.buildOrder(projects, deps).toArray())
        );

    }

    @Test
    public void testCycle() {
        Set<String> projects = new HashSet<>();
        projects.add("A");
        projects.add("B");
        projects.add("C");

        Set<Pair<String, String>> deps = new HashSet<>();
        deps.add(new PairImpl<>("B", "A"));
        deps.add(new PairImpl<>("C", "B"));
        deps.add(new PairImpl<>("A", "C"));

        assertTrue(testInstance.buildOrder(projects, deps).isEmpty());
    }
}
