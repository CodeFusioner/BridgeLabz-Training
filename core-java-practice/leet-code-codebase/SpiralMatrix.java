import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> ll = spiralOrder(arr);
        System.out.println(ll);
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int totalNumber = m*n;
        int left = 0, top = 0, right = n-1, bottom = m-1;
        int count = 0;
        List<Integer> res = new ArrayList<>();
        while(count < totalNumber){
            for(int i=left;i<=right && count < totalNumber;i++){
                res.add(matrix[left][i]);
                count++;
            }
            top++;
            for(int i=top;i<=bottom && count < totalNumber;i++){
                res.add(matrix[i][right]);
                count++;
            }
            right--;
            for(int i=right;i>=left && count < totalNumber;i--){
                res.add(matrix[bottom][i]);
                count++;
            }
            bottom--;
            for(int i=bottom;i>=top && count < totalNumber;i--){
                res.add(matrix[i][left]);
                count++;
            }
            left++;
        }
        return res;
    }
}
