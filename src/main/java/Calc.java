public class Calc implements CalcInterface{

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int substract(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int divide(int a, int b) {
//        if (b ==0){
//            throw new IllegalArgumentException("Not allowed to divide by zero");
//        }
        return a / b;
    }
}
