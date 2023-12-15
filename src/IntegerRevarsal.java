public class IntegerRevarsal{

    public static void main(String[] args) {
        int number = 12345;
        int reversedNumber = reverseInteger(number);
        System.out.println("Original Number: " + number);
        System.out.println("Reversed Number: " + reversedNumber);
    }

    // User-defined method to reverse an integer
    public static int reverseInteger(int num) {
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return reversedNum;
    }
}
