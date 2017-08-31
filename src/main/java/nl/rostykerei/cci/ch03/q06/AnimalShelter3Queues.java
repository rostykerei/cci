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
    private LinkedList<Animal> animals = new LinkedList<>();

    /**
     * Cats queue.
     */
    private LinkedList<Cat> cats = new LinkedList<>();

    /**
     * Dogs queue.
     */
    private LinkedList<Dog> dogs = new LinkedList<>();

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
    public Animal dequeueAny() {
        Animal animal = animals.pollFirst();

        if (animal instanceof Cat) {
            cats.removeFirst();
        } else {
            dogs.removeFirst();
        }

        return animal;
    }

    @Override
    public Cat dequeueCat() {
        Cat cat = cats.pollFirst();

        animals.remove(cat);

        return cat;
    }

    @Override
    public Dog dequeueDog() {
        Dog dog = dogs.pollFirst();

        animals.remove(dog);

        return dog;
    }
}
