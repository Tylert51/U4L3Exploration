import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        int amtEntered = 1;

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number (or -1 to quit): ");
        int num = s.nextInt();
        int max = num;
        int min = num;

        while (num != -1) {
            System.out.print("Enter a number(or -1 to quit): ");
            num = s.nextInt();
            if (num > max) {
                max = num;
            }
            if (num < max && num != -1) {
                min = num;
            }
            amtEntered += 1;
        }
        if (amtEntered == 1) {
            System.out.println("You didn't enter in any numbers!");
        } else {
            System.out.println("Max is: " + max + "\nMin is: " + min);
        }
    }
}