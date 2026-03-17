import java.util.*;

public class Main {

    // Method 1: String Reverse
    public static boolean reverseMethod(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return input.equals(reversed);
    }

    // Method 2: Two Pointer
    public static boolean twoPointerMethod(String input) {
        int start = 0, end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Method 3: Stack
    public static boolean stackMethod(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Reverse Method Timing
        long startTime = System.nanoTime();
        boolean result1 = reverseMethod(input);
        long endTime = System.nanoTime();
        long time1 = endTime - startTime;

        // Two Pointer Timing
        startTime = System.nanoTime();
        boolean result2 = twoPointerMethod(input);
        endTime = System.nanoTime();
        long time2 = endTime - startTime;

        // Stack Method Timing
        startTime = System.nanoTime();
        boolean result3 = stackMethod(input);
        endTime = System.nanoTime();
        long time3 = endTime - startTime;

        // Display results
        System.out.println("\n=== Results ===");
        System.out.println("Reverse Method: " + result1 + " | Time: " + time1 + " ns");
        System.out.println("Two Pointer Method: " + result2 + " | Time: " + time2 + " ns");
        System.out.println("Stack Method: " + result3 + " | Time: " + time3 + " ns");

        scanner.close();
    }
}