
public class SmallestEvenMultiple {
	public static void main(String[] args) {
		System.out.println(find(5));
	}
	public static int find(int n) {
		if(n%2 != 0) {
			return n * 2;
		}
		return n;		
	}
}
