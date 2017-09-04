package nl.rostykerei.cci.ch03.q06;

import java.util.LinkedList;

/**
 * Implementation of {@link AnimalShelter} using 3 queues.
 *
 * @author Rosty Kerei
 */
public final class AnimalShelter3Queues implements AnimalShelter {

    /**
     * Common queue for both dogs and cats.
     */
    private final LinkedList<Animal> animals = new LinkedList<>();

    /**
     * Cats queue.
     */
    private final LinkedList<Cat> cats = new LinkedList<>();

    /**
     * Dogs queue.
     */
    private final LinkedList<Dog> dogs = new LinkedList<>();

    @Override
    public void enqueue(final Animal animal) {
        animals.addLast(animal);

        if (animal instanceof Cat) {
            cats.addLast((Cat) animal);
        } else {
            dogs.addLast((Dog) animal);
        }

    }

    @Override
    public Animal dequeAny() {
        Animal animal = animals.pollFirst();

        if (animal instanceof Cat) {
            cats.removeFirst();
        } else {
            dogs.removeFirst();
        }

        return animal;
    }

    @Override
    public Cat dequeCat() {
        Cat cat = cats.pollFirst();

        animals.remove(cat);

        return cat;
    }

    @Override
    public Dog dequeDog() {
        Dog dog = dogs.pollFirst();

        animals.remove(dog);

        return dog;
    }
}
