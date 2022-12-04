/**
 * Chooses the appropriate function to call to compute result of gate.
 */
public class Compute {

    //TODO Support more logic gate types
    static Integer compute(LogicGate gate, Integer operandA, Integer operandB){
        switch(gate){
            case OR:
                return ComputeLogicGate.OR(operandA, operandB);
        }
        return 0;
    }
}
