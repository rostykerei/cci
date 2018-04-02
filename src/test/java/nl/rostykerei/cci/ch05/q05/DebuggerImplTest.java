package nl.rostykerei.cci.ch05.q05;

public class DebuggerImplTest extends DebuggerAbstractTest {

    @Override
    protected Debugger createTestInstance() {
        return new DebuggerImpl();
    }
}