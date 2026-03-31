
public class Sort01And2s {
	public static void main(String[] args) {
		int [] arr = {0, 1, 2, 0, 1, 2};
		sort012(arr);
		for(int num : arr) {
			System.out.print(num+" ");
		}
	}
	public static void sort012(int[] arr) {
        // code here
        int zero = 0, one = 0, two = 0;
        for(int num : arr){
            if(num == 0){
                zero++;
            }else if(num == 1){
                one++;
            }else{
                two++;
            }
        }
        for(int i=0;i<zero;i++){
            arr[i] = 0;
        }
        for(int i=zero;i<zero+one;i++){
            arr[i] = 1;
        }
        for(int i=zero+one;i<zero+one+two;i++){
            arr[i] = 2;
        }
    }
}
