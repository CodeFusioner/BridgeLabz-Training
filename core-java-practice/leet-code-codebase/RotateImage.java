public class RotateImage {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(arr);
    }
    public static void rotate(int[][] matrix) {
        print(matrix);
    }
    public static void print(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i =0;i<arr.length;i++) {
            for(int j =0;j<arr.length/2;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr.length-1-j];
                arr[i][arr.length-1-j] = temp;
            }
        }
    }
}
