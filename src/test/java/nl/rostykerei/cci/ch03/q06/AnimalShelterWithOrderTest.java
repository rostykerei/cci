package nl.rostykerei.cci.ch03.q06;

public class AnimalShelterWithOrderTest extends AnimalShelterAbstractTest {

    @Override
    protected AnimalShelter createTestInstance() {
        return new AnimalShelterWithOrder();
    }
}