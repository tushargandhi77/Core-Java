import java.util.Random;
import java.util.Scanner;

public class project1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int count = 1;
        int number;
        int guess = r.nextInt(100);
        System.out.println("Enter the number between  1 to 100\n");
        do {
            number = sc.nextInt();
            if (number == guess) {
                System.out.println("You guessed in " + count + " and You win!");
            }
            if (number > guess) {
                System.out.println("Enter lower number please!");
            } else if(number < guess) {
                System.out.println("Enter higher number please!");
            }
            count++;
        } while (number != guess);
    }
}
