
import java.util.*;

public class p101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int target = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;
        System.out.println("I have chosen a number between 1 and 100.");
        System.out.println("Try to guess it.");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess < target) {
                System.out.println("Too low! Try again.");
            } else if (guess > target) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println(" You guessed the number in " + attempts + " attempts.");
            }
        } while (guess != target);

    }
}
