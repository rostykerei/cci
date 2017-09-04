package nl.rostykerei.cci.ch03.q06;

import java.util.LinkedList;

/**
 * Implementation of {@link AnimalShelter} using a wrapper with order number.
 *
 * @author Rosty Kerei
 */
public final class AnimalShelterWithOrder implements AnimalShelter {

    /**
     * Wrapper class with order number.
     */
    static class AnimalWithOrder {

        /**
         * Animal holder.
         */
        private final Animal animal;

        /**
         * Order number.
         */
        private final int order;

        /**
         * Constructor.
         *
         * @param animalValue animal
         * @param orderNumber order number
         */
        AnimalWithOrder(final Animal animalValue, final int orderNumber) {
            this.animal = animalValue;
            this.order = orderNumber;
        }

        /**
         * Returns animal.
         *
         * @return animal
         */
        Animal getAnimal() {
            return animal;
        }

        /**
         * Returns order number.
         *
         * @return order number
         */
        int getOrder() {
            return order;
        }
    }

    /**
     * Common order number.
     */
    private int order = 0;

    /**
     * Cats queue.
     */
    private final LinkedList<AnimalWithOrder> cats = new LinkedList<>();

    /**
     * Dogs queue.
     */
    private final LinkedList<AnimalWithOrder> dogs = new LinkedList<>();

    @Override
    public void enqueue(final Animal animal) {
        AnimalWithOrder animalWithOrder = new AnimalWithOrder(animal, order);

        if (animal instanceof Cat) {
            cats.addLast(animalWithOrder);

        } else {
            dogs.addLast(animalWithOrder);
        }

        order++;
    }

    @Override
    public Animal dequeAny() {
        if (cats.isEmpty()) {
            return dequeDog();
        }

        if (dogs.isEmpty()) {
            return dequeCat();
        }

        if (cats.peekFirst().getOrder() < dogs.peekFirst().getOrder()) {
            return dequeCat();
        } else {
            return dequeDog();
        }
    }

    @Override
    public Cat dequeCat() {
        return (Cat) cats.removeFirst().getAnimal();
    }

    @Override
    public Dog dequeDog() {
        return (Dog) dogs.removeFirst().getAnimal();
    }
}
