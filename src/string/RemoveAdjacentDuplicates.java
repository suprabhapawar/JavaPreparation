package string;

public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        String input = "CNNCBC";
        String result = removeAdjacentDuplicates(input);
        System.out.println("Original String: " + input);
        System.out.println("String with Adjacent Duplicates Removed: " + result);
    }

    public static String removeAdjacentDuplicates(String input) {
        if (input == null || input.length() <= 1) {
            return input; // No duplicates to remove
        }

        StringBuilder result = new StringBuilder();
        char prevChar = input.charAt(0);
        result.append(prevChar);

        for (int i = 1; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // If the current character is different from the previous one, append it to the result
            if (currentChar != prevChar) {
                result.append(currentChar);
                prevChar = currentChar;
            }
        }

        return result.toString();
    }
}
