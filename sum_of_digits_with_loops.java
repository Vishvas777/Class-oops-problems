package javvaaa;
import java.util.Scanner;
public class sum_OF_DIGITS {
	public class Sum_of_digits {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        
	        while (num >= 10) {
	            int sum = 0;
	            while (num > 0) {
	                sum += num % 10; // Extract and add the last digit
	                num /= 10;       // Remove the last digit
	            }
	            num = sum; // Updates num to the sum of digits
	        }
	        
	        System.out.println("The single-digit sum is: " + num);
	        sc.close();
	    }
	}


}