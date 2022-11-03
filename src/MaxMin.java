import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        int amtEntered = 1;
        int max = 0;
        int min = 0;
        int num = 0;

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number (or done to finish): ");
        String answer = s.nextLine();
        if (!(answer.equals("done"))) {
            num = Integer.parseInt(answer);
            min = num;
            max = num;
        }

        while (!(answer.equals("done"))) {
            System.out.print("Enter a number (or done to finish): ");
            answer = s.nextLine();
            if (!(answer.equals("done"))) {
                num = Integer.parseInt(answer);
            }
            if (num > max) {
                max = num;
            } else if (num < min) {
                min = num;
            }
            amtEntered++;
        }
        if (amtEntered == 1) {
            System.out.println("You didn't enter in any numbers!");
        } else {
            System.out.println("Max is: " + max + "\nMin is: " + min);
        }
    }
}