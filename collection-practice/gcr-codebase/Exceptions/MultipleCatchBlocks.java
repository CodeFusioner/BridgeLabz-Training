package Exception;

import java.util.Scanner;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int [] arr = null;
            System.out.print("Enter Idx: ");
            int idx = sc.nextInt();
            int val = getValueByIndex(arr, idx);
            System.out.println("Value at index "+ idx + ": " + val);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index");
        }catch (NullPointerException e){
            System.out.println("Array is not initialized");
        }
    }
    public static int getValueByIndex(int [] arr, int idx){
        return arr[idx];
    }
}
