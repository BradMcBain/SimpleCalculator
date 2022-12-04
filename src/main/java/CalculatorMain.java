/**
 * Main class of logic gate calculator.
 * This class will handle all function calls and argument passing of the calculator.
* */
public class CalculatorMain {

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

        LogicGateSolver logicComputation = new LogicGateSolver(operator, operandA, operandB);

        Integer result = logicComputation.result;
        System.out.println("Result: " + result);
    }
}
