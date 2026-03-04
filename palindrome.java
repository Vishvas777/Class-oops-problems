import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int original = num;
        int reverse = 0;
        
        while (num != 0) {
            int digit = num % 10;      // get last digit
            reverse = reverse * 10 + digit; // build reverse number
            num = num / 10;            // remove last digit
        }
        
        if (original == reverse) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
        
        sc.close();
    }
}