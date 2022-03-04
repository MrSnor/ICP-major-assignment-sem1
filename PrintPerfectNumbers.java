
public class PrintPerfectNumbers {

    public static void main(String[] args) {
        int count = 0;

        // checking for perfect numbers between start and end
        int start = 1;
        int end = 10_00_000;
        for (int i = start; i <= end; i++) {
            if (isPerfectNumber(i)) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println();
        System.out.println("Number of perfect numbers found: " + count);
    }

    // Returns true if n is perfect
    static boolean isPerfectNumber(int n) {
        // checking number of digits of givem number "n"
        int numberOfDigits = Integer.toString(n).length();

        int sum = 0;
        int substitute = n;

        // computing sum of its digits
        // each raised to the power of "numberOfDigits" of given number "n"
        for (int i = 0; i < numberOfDigits; i++) {
            int digit = substitute % 10;
            substitute /= 10;
            sum += Math.pow(digit, numberOfDigits);
        }

        // return true if sum is equal to initial number
        if (n == sum) {
            return true;
        } else {
            return false;
        }
    }

}