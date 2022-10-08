package Calculator.Operation;

/**
 * @author guangyang
 * @date 2022-10-05
 */

//加减乘除类

class OperationAdd extends Operation {
    @Override
    public Integer GetResult() {
        Integer result=getNum_A()+ getNum_B();
        return result;
    }
 }

 class OperationSub extends Operation{
     @Override
     public Integer GetResult() {
         Integer result=getNum_A()-getNum_B();
         return result;
     }
 }
 class OperationMul extends Operation{
     @Override
     public Integer GetResult() {
         Integer result=getNum_A()*getNum_B();
         return result;
     }
 }

 class OperationDiv extends Operation{
     @Override
     public Integer GetResult() {
         if (getNum_A()==0){
             return 0;
         }
         Integer result=getNum_A()/getNum_B();
         return result;
     }
 }
