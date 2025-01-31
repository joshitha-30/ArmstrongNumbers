public class ArmstrongNumbers {
    public static void main(String[] args) {
        int lowerBound = 100;
        int upperBound = 1000;

        System.out.println("Armstrong numbers between " + lowerBound + " and " + upperBound + ":");
        printArmstrongNumbers(lowerBound, upperBound);
    }

    public static void printArmstrongNumbers(int lowerBound, int upperBound) {
        for (int i = lowerBound; i <= upperBound; i++) {
            if (isArmstrongNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;
        int digitCount = countDigits(number);

        while (number > 0) {
            int digit = number % 10;
            sum += (int) Math.pow(digit, digitCount);
            number /= 10;
        }

        return sum == originalNumber;
    }

    public static int countDigits(int number) {
        int digitCount = 0;
        while (number > 0) {
            digitCount++;
            number /= 10;
        }
        return digitCount;
    }
} 