public class StringReversal {
    public static void main(String[] args) {
        String original = "Hello, World!";
        String reversed = reverseString(original);

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }

    // User-defined method to reverse a string
    public static String reverseString(String input) {
        char[] charArray = input.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        // Swap characters from the ends towards the middle
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }

        // Create a new string from the reversed character array
        return new String(charArray);
    }
}
