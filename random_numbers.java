import java.util,Random;
public class RandomNumbers {
    public static void main(String[] args) {
Random rand = new Random();
int number;
number=rand.nextInt(1,7);
System.out.println("Random number between 1 and 6: " + number);
    }
}
