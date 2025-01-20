import java.util.Arrays;

public class TwoPointers {
    
    // Given an array of integers, return indices of the two numbers such that they add up to a specific target.
    // You may assume that each input would have exactly one solution, and you may not use the same element twice.
    // Example: Given nums = [2, 7, 11, 15], target = 9, Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int left = 0;
        int right = nums.length - 1;
    
        // 1. Go through the array 
        // 2. Fetch the values in the array at left and right
        // 3. Add the numbers 
        // 4. If the sum of the numbers is equal to the one that is being sort after then return [left, right]
        // 5. If the sum is less than the expected sum move left one step 
        // 6. if the sum is greater than the expected sum move right back one step

        while (left < right) {
            int currentSum = nums[left] + nums[right];
            if (currentSum == target) {
                result[0] = left;
                result[1] = right;
                break;
            } else if (currentSum < target) {
                left++;
            } else if (currentSum > target) {
                right--;
            }
        }
        
        return result;
    }

    public static int[] findSum(int[] arr, int sum) {
        int[] result = new int[2];
        int left = 0;
        int right = arr.length - 1;
    
        // 1. Go through the array 
        // 2. Fetch the values in the array at left and right
        // 3. Add the numbers 
        // 4. If the sum of the numbers is equal to the one that is being sort after then return [left, right]
        // 5. If the sum is less than the expected sum move left one step 
        // 6. if the sum is greater than the expected sum move right back one step

        while (left < right) {
            int currentSum = arr[left] + arr[right];
            if (currentSum == sum) {
                result[0] = arr[left];
                result[1] = arr[right];
                break;
            } else if (currentSum < sum) {
                left++;
            } else if (currentSum > sum) {
                right--;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] sum = {1, 3, 5, 7, 8, 11, 12, 14, 15, 18};
        System.out.println(Arrays.toString(findSum(sum, 13)));
    }
}