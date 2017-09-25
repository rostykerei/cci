package nl.rostykerei.cci.ch04.q07;

import nl.rostykerei.cci.datastructure.Pair;

import java.util.*;

/**
 * Implementation of {@link BuildOrder} using a standard map.
 *
 * @param <T> the class of the project objects
 * @author Rosty Kerei
 */
public final class BuildOrderMap<T> implements BuildOrder<T> {

    /**
     * Map of project dependencies.
     */
    private Map<T, Set<T>> dependencyMap = new HashMap<>();

    @Override
    public List<T> buildOrder(
            final Set<T> projects,
            final Set<Pair<T, T>> dependencies) {

        for (T project : projects) {
            dependencyMap.put(project, new HashSet<>());
        }

        for (Pair<T, T> pair : dependencies) {
            dependencyMap.putIfAbsent(pair.getSecond(), new HashSet<>());
            dependencyMap.get(pair.getSecond()).add(pair.getFirst());
        }

        List<T> buildOrder = new ArrayList<>();

        while (dependencyMap.size() > 0) {
            boolean found = false;

            for (T project : projects) {
                if (dependencyMap.containsKey(project)
                        && dependencyMap.get(project).size() == 0) {

                    buildOrder.add(project);

                    dependencyMap.remove(project);

                    for (Map.Entry<T, Set<T>> entry
                            : dependencyMap.entrySet()) {
                        dependencyMap.get(entry.getKey()).remove(project);
                    }

                    found = true;
                }
            }

            if (!found) {
                return null;
            }
        }

        return buildOrder;
    }
}
