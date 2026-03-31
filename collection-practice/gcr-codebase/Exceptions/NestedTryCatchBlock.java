package Exception;

import java.util.Scanner;

public class NestedTryCatchBlock {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int [] arr = {2,5,6,7,8};
            int [] div = {1,0,3,1,2};
            for(int i=0;i<arr.length;i++){
                try{
                    System.out.println(arr[i] / div[i]);
                }catch (ArithmeticException e){
                    System.out.println("Cannot divide by zero");
                }
            }
            int idx = 5;
            System.out.println(getValueByIndex(arr,idx));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid array index");
        }
    }
    public static int getValueByIndex(int [] arr, int idx){
        return arr[idx];
    }
}
