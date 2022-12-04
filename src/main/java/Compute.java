/**
 * Chooses the appropriate function to call to compute result of gate.
 */
public class Compute {

    //TODO Support more logic gate types
    static Integer compute(LogicGate gate, Integer operandA, Integer operandB){
        switch(gate){
            case OR:
                return ComputeLogicGate.OR(operandA, operandB);
            case AND:
                return ComputeLogicGate.AND(operandA, operandB);
            case NAND:
                return ComputeLogicGate.NAND(getBoolean(operandA), getBoolean(operandB));
            case NOR:
                return ComputeLogicGate.NOR(getBoolean(operandA), getBoolean(operandB));
            case XOR:
                return ComputeLogicGate.XOR(getBoolean(operandA), getBoolean(operandB));
            case XNOR:
                return ComputeLogicGate.XNOR(getBoolean(operandA), getBoolean(operandB));
        }
        return 0;
    }

    public static boolean getBoolean(int value)
    {
        return (value!=0);
    }
}
