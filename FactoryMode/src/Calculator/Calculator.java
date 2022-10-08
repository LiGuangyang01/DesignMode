package Calculator;

import Calculator.Operation.Operation;
import Calculator.Operation.OperationFactory;

import java.util.Scanner;

/**
 * @author guangyang
 * @date 2022-10-05
 */
public class Calculator {
    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperation("+");
        operation.setNum_A(1);
        operation.setNum_B(2);
        System.out.println(operation.GetResult());


    }


}
