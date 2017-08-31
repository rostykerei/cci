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
     * Dequeues the first animal in the queue.
     *
     * @return animal
     */
    Animal dequeueAny();

    /**
     * Dequeues the first cat in the queue.
     *
     * @return cat
     */
    Cat dequeueCat();

    /**
     * Dequeues the first dog in the queue.
     *
     * @return dog
     */
    Dog dequeueDog();

}
