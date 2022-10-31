public class WhileLoopFun
{
    public WhileLoopFun() {
    }

    public double factorial(int number) {
        int counter = number - 1;
        double factorialVal = number;
        while (counter != 1) {
            factorialVal = factorialVal * (counter);
            counter--;
        }
        return factorialVal;
    }

    public void printDigits(int number) {
        String numString = number + "";
        int counter = 0;
        while (counter < numString.length()) {
            String digit = numString.substring(counter, counter + 1);
            System.out.println(digit);
            counter++;
        }
    }

    public int sumOfDigits(int number) {
        String numString = number + "";
        int counter = 0;
        int sum = 0;
        while (counter < numString.length()) {
            String digit = numString.substring(counter, counter + 1);
            int digitInt = Integer.parseInt(digit);
            sum += digitInt;
            counter++;
        }
        return sum;
    }

    public boolean isPrime(int number) {
        int amtFactors = 0;
        int max = number / 2;
        int factorTest = 1;
        if (number == 1) {
            return false;
        } else {
            while (factorTest <= max) {
                int division = number / factorTest;
                double divisionTrue = (double) number / factorTest;
                if (division == divisionTrue) {
                    amtFactors += 2;
                }
                factorTest++;
            }
        }
        return (amtFactors == 2);
    }

    public int maxDoubles(int number, int threshold) {
        int power = number;
        int amtDoubles = -1;
        if (number > threshold) {
            return 0;
        } else {
            while (power <= threshold) {
                power *= 2;
                amtDoubles++;
            }
            return amtDoubles;
        }
    }
}
