package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int ans =  n1 / n2;
            System.out.println(ans);
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }catch (InputMismatchException e){
            System.out.println("InputMismatchException");
        }
    }
}
