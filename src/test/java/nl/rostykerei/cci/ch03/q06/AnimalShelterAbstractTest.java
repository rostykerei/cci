package nl.rostykerei.cci.ch03.q06;

import nl.rostykerei.cci.common.AbstractFactoryTest;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public abstract class AnimalShelterAbstractTest extends AbstractFactoryTest<AnimalShelter> {

    @Test
    public void testShelter() {
        testInstance.enqueue(new Labrador());
        testInstance.enqueue(new Persian());
        testInstance.enqueue(new Bulldog());
        testInstance.enqueue(new Siamese());
        testInstance.enqueue(new Pug());
        testInstance.enqueue(new Scottish());

        assertTrue(testInstance.dequeAny() instanceof Labrador);
        assertTrue(testInstance.dequeDog() instanceof Bulldog);
        assertTrue(testInstance.dequeAny() instanceof Persian);
        assertTrue(testInstance.dequeCat() instanceof Siamese);
        assertTrue(testInstance.dequeCat() instanceof Scottish);
        assertTrue(testInstance.dequeAny() instanceof Pug);
    }

    @Test
    public void testShelter2() {
        testInstance.enqueue(new Scottish());
        assertTrue(testInstance.dequeAny() instanceof Scottish);
    }

    private static class Labrador implements Dog {
    }

    private static class Bulldog implements Dog {
    }

    private static class Pug implements Dog {
    }

    private static class Persian implements Cat {
    }

    private static class Siamese implements Cat {
    }

    private static class Scottish implements Cat {
    }
}
