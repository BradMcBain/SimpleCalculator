import org.junit.jupiter.api.Test;

import java.nio.charset.Charset;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;


public class LogicGateSolverTest {

    @Test
    public void isValidLogicGateTest() {

        // Verify that the logic gates are valid
        assertTrue(LogicGateSolver.isValidLogicGate("OR"));
        assertTrue(LogicGateSolver.isValidLogicGate("AND"));
        assertTrue(LogicGateSolver.isValidLogicGate("NAND"));
        assertTrue(LogicGateSolver.isValidLogicGate("NOR"));
        assertTrue(LogicGateSolver.isValidLogicGate("XOR"));
        assertTrue(LogicGateSolver.isValidLogicGate("XNOR"));

        // Verify that an incorrect string will fail
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));
        assertFalse(LogicGateSolver.isValidLogicGate(generatedString));
    }

    @Test
    public void isLogicGateObjectCreatedTest() {

        LogicGateSolver lg = new LogicGateSolver("AND", 0, 1);
        assertNotNull(lg);
    }
}
