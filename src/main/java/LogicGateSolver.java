/**
 * Object class for the logic gate solver.
 * Will verify whether operand is valid and call required compute function.
 *
 */

public class LogicGateSolver {
    LogicGate gate;
    Integer operandA;
    Integer operandB;
    Integer result;


    public LogicGateSolver(String operator, int a, int b) {
        if(!isValidLogicGate(operator)){
            System.out.println(operator + " is an invalid logic gate. Please enter a valid gate.");
            System.exit(1);
        }
        gate = LogicGate.valueOf(operator);
        operandA = a;
        operandB = b;
        result = Compute.compute(gate, operandA, operandB);
    }

    static boolean isValidLogicGate(String operator){
        for(LogicGate lg : LogicGate.values()){
            if(lg.name().equals(operator)){
                return true;
            }
        }
        return false;
    }
}
