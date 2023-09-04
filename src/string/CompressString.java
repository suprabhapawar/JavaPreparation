package string;

public class CompressString {
    public static String compress(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder compressed = new StringBuilder();
        char currentChar = input.charAt(0);
        int charCount = 1;

        for (int i = 1; i < input.length(); i++) {
            char nextChar = input.charAt(i);

            if (currentChar == nextChar) {
                charCount++;
            } else {
                compressed.append(currentChar).append(charCount);
                currentChar = nextChar;
                charCount = 1;
            }
        }

        compressed.append(currentChar).append(charCount);

        return compressed.toString();
    }

    public static void main(String[] args) {
        String input = "abbbccddddaab";
        String compressed = compress(input);
        System.out.println("Compressed String: " + compressed);
    }
}
