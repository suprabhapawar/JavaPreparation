package string;

public class PalindromeCheckerRecursion {
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase for a case-insensitive check
        str = str.replaceAll("\\s+", "").toLowerCase();
        return isPalindromeRecursive(str, 0, str.length() - 1);
    }

    private static boolean isPalindromeRecursive(String str, int start, int end) {
        // Base case: If the string has 0 or 1 character, it's a palindrome
        if (start >= end) {
            return true;
        }

        // Compare the characters at the start and end positions
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursively check the substring between start and end
        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String palindrome1 = "racecar";
        String palindrome2 = "A man a plan a canal Panama";
        String notPalindrome = "hello";

        System.out.println("Is \"" + palindrome1 + "\" a palindrome? " + isPalindrome(palindrome1));
        System.out.println("Is \"" + palindrome2 + "\" a palindrome? " + isPalindrome(palindrome2));
        System.out.println("Is \"" + notPalindrome + "\" a palindrome? " + isPalindrome(notPalindrome));
    }
}

