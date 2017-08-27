package nl.rostykerei.cci.ch02.q04;

import static org.junit.Assert.*;

public class PartitionImplTest extends PartitionAbstractTest {

    @Override
    protected Partition<Integer> createTestInstance() {
        return new PartitionImpl<>();
    }
}