import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ComputeLogicGateTest {

    @Test
    public void ORTest(){
        assertEquals(ComputeLogicGate.OR(0,0), 0);
        assertEquals(ComputeLogicGate.OR(1,0), 1);
        assertEquals(ComputeLogicGate.OR(0,1), 1);
        assertEquals(ComputeLogicGate.OR(1,1), 1);
    }

    @Test
    public void ANDTest(){
        assertEquals(ComputeLogicGate.AND(0,0), 0);
        assertEquals(ComputeLogicGate.AND(1,0), 0);
        assertEquals(ComputeLogicGate.AND(0,1), 0);
        assertEquals(ComputeLogicGate.AND(1,1), 1);
    }

    @Test
    public void NANDTest(){
        assertEquals(ComputeLogicGate.NAND(false,false), 1);
        assertEquals(ComputeLogicGate.NAND(true,false), 1);
        assertEquals(ComputeLogicGate.NAND(false,true), 1);
        assertEquals(ComputeLogicGate.NAND(true,true),  0);
    }

    @Test
    public void NORTest(){
        assertEquals(ComputeLogicGate.NOR(false,false), 1);
        assertEquals(ComputeLogicGate.NOR(true,false),  0);
        assertEquals(ComputeLogicGate.NOR(false,true),  0);
        assertEquals(ComputeLogicGate.NOR(true,true),   0);
    }

    @Test
    public void XORTest(){
        assertEquals(ComputeLogicGate.XOR(false,false), 0);
        assertEquals(ComputeLogicGate.XOR(true,false),  1);
        assertEquals(ComputeLogicGate.XOR(false,true),  1);
        assertEquals(ComputeLogicGate.XOR(true,true),   0);
    }

    @Test
    public void XNORTest(){
        assertEquals(ComputeLogicGate.XNOR(false,false), 1);
        assertEquals(ComputeLogicGate.XNOR(true,false),  0);
        assertEquals(ComputeLogicGate.XNOR(false,true),  0);
        assertEquals(ComputeLogicGate.XNOR(true,true),   1);
    }
}
