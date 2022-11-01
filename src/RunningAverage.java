import java.util.Scanner;

public class RunningAverage {
    public static void main(String[] args) {
        double numEntered = 1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any positive integer: ");
        int num = s.nextInt();
        double sum = num;
        while (num != -1) {
            System.out.print("Enter any positive integer: ");
            num = s.nextInt();

            sum += num;
            numEntered++;
        }

        if (numEntered == 1) {
            System.out.println("You entered no numbers so nothing to show");
        } else {
            round((sum+1) / (numEntered - 1));
        }
    }
    public static void round(double num) {
        System.out.printf("%.2f" , num);
    }
}