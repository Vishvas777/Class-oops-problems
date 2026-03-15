package problems;
import java.util.Scanner;
public class java_2 {
		    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Ask user for size of array
	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];

	        // Taking array input
	        System.out.println("Enter the elements:");
	        for(int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        // Assume first element is largest
	        int largest = arr[0];

	        // Finding largest element
	        for(int i = 1; i < n; i++) {
	            if(arr[i] > largest) {
	                largest = arr[i];
	            }
	        }

	        // Display result
	        System.out.println("Largest number in the array is: " + largest);

	        sc.close();
	    }
	}

