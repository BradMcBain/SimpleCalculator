public class LogicGateSolver {

    enum LogicGate {
        OR
    }

    //TODO Add unit test
    Integer computeOR(Integer a, Integer b){
        return a | b;
    }

    //TODO Support more logic gate types
    Integer compute(String operator, Integer operandA, Integer operandB){
        LogicGate logicGate = LogicGate.valueOf(operator);
        switch(logicGate){
            case OR:
                return computeOR(operandA, operandB);
        }
        return 0;
    }

    boolean isValidLogicGate(String operator){
        for(LogicGate lg : LogicGate.values()){
            if(lg.name().equals(operator)){
                return true;
            }
        }

        return false;
    }

    public static void main(String args[])
    {
        if(args.length != 3){
            System.out.println("Please enter your request in the following format: Operator Operand1 Operand2");
            System.exit(1);
        }

        String operator = args[0];
        Integer operandA = Integer.parseInt(args[1]);
        Integer operandB = Integer.parseInt(args[2]);

        if(!(operandA == 0 || operandA == 1) || !(operandB == 0 || operandB == 1)){
            System.out.println("Please enter operand values as 0 or 1");
            System.exit(1);
        }


        LogicGateSolver logicComputation = new LogicGateSolver();

        if(!logicComputation.isValidLogicGate(operator)){
            System.out.println(operator + " is an invalid logic gate. Please enter a valid gate.");
            System.exit(1);
        }

        Integer result = logicComputation.compute(operator, operandA, operandB);
        System.out.println("Result: " + result);
    }
}
