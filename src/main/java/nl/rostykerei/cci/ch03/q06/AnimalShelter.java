package nl.rostykerei.cci.ch03.q06;

/**
 * Question 3.6 - Animal Shelter.
 *
 * @author Rosty Kerei
 */
public interface AnimalShelter {

    /**
     * Enqueues an animal.
     *
     * @param animal animal to enqueue
     */
    void enqueue(Animal animal);

    /**
     * Deques the first animal in the queue.
     *
     * @return animal
     */
    Animal dequeAny();

    /**
     * Deques the first cat in the queue.
     *
     * @return cat
     */
    Cat dequeCat();

    /**
     * Deques the first dog in the queue.
     *
     * @return dog
     */
    Dog dequeDog();

}
