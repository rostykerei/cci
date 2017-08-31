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
        private Animal animal;

        /**
         * Order number.
         */
        private int order;

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
    private LinkedList<AnimalWithOrder> cats = new LinkedList<>();

    /**
     * Dogs queue.
     */
    private LinkedList<AnimalWithOrder> dogs = new LinkedList<>();

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
    public Animal dequeueAny() {
        if (cats.isEmpty()) {
            return dequeueDog();
        }

        if (dogs.isEmpty()) {
            return dequeueCat();
        }

        if (cats.peekFirst().getOrder() < dogs.peekFirst().getOrder()) {
            return dequeueCat();
        } else {
            return dequeueDog();
        }
    }

    @Override
    public Cat dequeueCat() {
        return (Cat) cats.removeFirst().getAnimal();
    }

    @Override
    public Dog dequeueDog() {
        return (Dog) dogs.removeFirst().getAnimal();
    }
}
