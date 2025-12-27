import java.util.*;

public class UnionOfArraysWithDuplicates {
	public static void main(String[] args) {
		int [] a = {1, 2, 3, 2, 1};
		int [] b = {3, 2, 2, 3, 3, 2};
		List<Integer> ll = findUnion(a, b);
		System.out.println(ll);
	}
	public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        ArrayList<Integer> ll = new ArrayList<>();
        for(int num : a){
            if(!ll.contains(num)){
                ll.add(num);
            }
        }
        for(int num : b){
            if(!ll.contains(num)){
                ll.add(num);
            }
        }
        return ll;
    }
}
