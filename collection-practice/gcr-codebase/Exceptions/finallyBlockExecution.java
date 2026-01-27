package Exception;

import java.util.Scanner;

public class finallyBlockExecution {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            System.out.println(n1/n2);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Operation Completed");
        }
    }
}
