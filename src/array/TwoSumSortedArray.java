package array;

public class TwoSumSortedArray {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                // Found the pair, return their indices (1-based)
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                // Move the left pointer to the right
                left++;
            } else {
                // Move the right pointer to the left
                right--;
            }
        }

        // If no such pair is found, return an empty array
        return new int[0];
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(numbers, target);

        if (result.length == 2) {
            System.out.println("Indices of the two numbers that add up to " + target + ": " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No such pair found.");
        }
    }
}
