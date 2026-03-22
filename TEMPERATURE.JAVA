package problems;

public class question_36 {
	
	    public static void main(String[] args) {

	        int start = 1;
	        int end = 1000;

	        for (int num = start; num <= end; num++) {

	            int temp = num;
	            int digits = 0;

	            // count digits
	            while (temp != 0) {
	                digits++;
	                temp /= 10;
	            }

	            temp = num;
	            int sum = 0;

	            // calculate Armstrong sum
	            while (temp != 0) {
	                int rem = temp % 10;
	                sum += Math.pow(rem, digits);
	                temp /= 10;
	            }

	            if (sum == num) {
	                System.out.print(num + " ");
	            }
	        }
	    }
	}