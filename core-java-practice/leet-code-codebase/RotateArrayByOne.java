
public class RotateArrayByOne {
	public static void main(String[] args) {
		int [] arr = {1, 2, 3, 4, 5};
		rotate(arr);
		for(int num : arr) {
			System.out.print(num + " ");
		}
	}
	public static void rotate(int[] arr) {
        // code here
        int [] ans = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[(i+1) % arr.length] = arr[i];
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = ans[i];
        }
    }
}
