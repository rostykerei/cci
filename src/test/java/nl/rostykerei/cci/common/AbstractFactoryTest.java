package nl.rostykerei.cci.common;

import org.junit.Before;

public abstract class AbstractFactoryTest<T> {

    protected T testInstance;

    protected abstract T createTestInstance();

    @Before
    public void setUp() {
        this.testInstance = createTestInstance();
    }
}
