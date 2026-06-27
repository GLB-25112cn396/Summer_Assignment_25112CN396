import java.util.*;
public class p104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Quiz Application");
        System.out.println("Answer the following questions:\n");

        System.out.println("1. What is the capital of India?");
        System.out.println("a) Delhi\nb) Mumbai\nc) Kolkata");
        System.out.print("Your answer: ");
        char ans1 = sc.next().charAt(0);
        if (ans1 == 'a' || ans1 == 'A') {
            score++;
        }

        System.out.println("\n2. What is 2 + 2?");
        System.out.println("a) 3\nb) 4\nc) 5");
        System.out.print("Your answer: ");
        char ans2 = sc.next().charAt(0);
        if (ans2 == 'b' || ans2 == 'B') {
            score++;
        }

        System.out.println("\n3. Which language is used to build Android apps?");
        System.out.println("a) C\nb) Java\nc) Python");
        System.out.print("Your answer: ");
        char ans3 = sc.next().charAt(0);
        if (ans3 == 'b' || ans3 == 'B') {
            score++;
        }

        System.out.println("\nQuiz Finished!");
        System.out.println("Your score is: " + score + "/3");

    }
}
