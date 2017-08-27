package nl.rostykerei.cci.ch02.q04;

public class PartitionImplTest extends PartitionAbstractTest {

    @Override
    protected Partition<Integer> createTestInstance() {
        return new PartitionImpl<>();
    }
}