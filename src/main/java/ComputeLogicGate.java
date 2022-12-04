/**
 * Contains all functions to compute the output of the logic gate.
 */
public class ComputeLogicGate {

    //TODO Add unit test
    static Integer OR(Integer a, Integer b) {return a | b;}

    static Integer AND(Integer a, Integer b) {return a & b;}

    static Integer NAND(Boolean a, Boolean b) {return getInt(!(a & b));}

    static Integer NOR(Boolean a, Boolean b) {return getInt(!(a | b));}

    static Integer XOR(Boolean a, Boolean b) {return getInt((a & !b) | (!a & b));}

    static Integer XNOR(Boolean a, Boolean b) {return getInt(!((a & !b) | (!a & b)));}

    public static int getInt(boolean value) {
        return (value ? 1 : 0);
    }
}
