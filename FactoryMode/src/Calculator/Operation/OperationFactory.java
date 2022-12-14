package Calculator.Operation;

/**
 * @author guangyang
 * @date 2022-10-05
 */
public class OperationFactory {
    public static Operation createOperation(String operate){
        Operation operation=null;
        switch (operate){
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;


        }
            return operation;

    }
}
