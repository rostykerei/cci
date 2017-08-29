package nl.rostykerei.cci.ch03.q04;

import nl.rostykerei.cci.datastructure.Queue;
import nl.rostykerei.cci.datastructure.impl.QueueImplTest;

public class QueueViaStacksImplTest extends QueueImplTest {

    @Override
    protected Queue<Integer> createQueue() {
        return new QueueViaStacksImpl<>();
    }
}