package Exception;

public class ExceptionPropagationInMethods {
    public static void main(String[] args) {
        try{
            method2();
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
    public static void method1(){
        int res = 10 / 0;
    }
    public static void method2(){
        method1();
    }

}
