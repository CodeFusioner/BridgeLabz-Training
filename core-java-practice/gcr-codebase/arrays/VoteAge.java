import java.util.*;
public class VoteAge {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[] ages = new int[10];
	        
	        // Taking user input for 10 students
	        System.out.println("Enter the ages of 10 students:");
	        for (int i = 0; i < ages.length; i++) {
	            System.out.print("Student " + (i + 1) + " age: ");
	            ages[i] = sc.nextInt();
	        }
	        
	        // Checking voting eligibility
	        System.out.println("\nVoting Eligibility Results:");
	        for (int i = 0; i < ages.length; i++) {
	            int age = ages[i];
	            
	            if (age < 0) {
	                System.out.println("Invalid age for student " + (i + 1));
	            } else if (age >= 18) {
	                System.out.println("The student with the age " + age + " can vote.");
	            } else {
	                System.out.println("The student with the age " + age + " cannot vote.");
	            }
	        }
	        
	    }
}
