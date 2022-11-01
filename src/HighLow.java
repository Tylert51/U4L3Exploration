import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Choose an upper bound: ");
        int maxNum = s.nextInt();
        int randomNum = (int) (Math.random() * maxNum + 1);
        int numGuesses = 1;

        System.out.print("Take a guess what the number is: ");
        int guess = s.nextInt();

        while (guess != randomNum) {
            if (guess > randomNum) {
                System.out.println("Too high");
            } else if (guess < randomNum) {
                System.out.println("Too low");
            }
            System.out.print("Take a guess what the number is: ");
            guess = s.nextInt();
            numGuesses += 1;
        }

        System.out.println("You got it!\nThe secret number was " + randomNum + "\nYou took " + numGuesses + " tries!");
    }
}
