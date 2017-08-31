package nl.rostykerei.cci.ch03.q06;

public class AnimalShelter3QueuesTest extends AnimalShelterAbstractTest {

    @Override
    protected AnimalShelter createTestInstance() {
        return new AnimalShelter3Queues();
    }
}