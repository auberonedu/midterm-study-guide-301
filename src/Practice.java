import java.util.*;
public class Practice {
    /**
     * Returns the difference between the largest and smallest integer in an array.
     * 
     * @param nums a non-empty, non-null array of numbers
     * @return the difference between the largest and smallest number
     */
    public static int maxDiff(int[] nums) {
        // TODO: implement this
        // Variables to track max, min
        int min = nums[0];
        int max = nums[0];

        // Iterate through the list array
        for (int i = 0; i < nums.length; i++) {
            // Compare the current number to max stored and min stored
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        // Return the difference between the largest and smallest value in the integer array
        return (max - min);
    }


    // TODO: Implement the other methods from the study guide AND tests for each one

    // For each method you are only required to implement it for one of the data
    // structures. But use a different data structure for each method. For example,
    // do maxDiff with an array, the next question with a Set, etc.
    /**
     * Find the longest word that starts with a specific character letter in a HashSet
     * 
     * @param words a non-empty, non-null set of numbers
     * @param character a non-empty, non-null character value
     * @return the longest word that starts with a specific character letter
     */
    public static String longestWordWithCharacter(Set<String> words, Character c) {
        // Declare a variable to store the longest string that starts with a given character
        String longestStr = "";

        // Variable to track current longest word that starts with the given character
        int maxLength = 0;

        // For every word in the words set
        for (String word : words) {
            if ((word.toLowerCase().charAt(0) == Character.toLowerCase(c)) && word.length() > maxLength) {
                longestStr = word;
                maxLength = word.length();
            }
        }

        // Return the longest word in the set
        return longestStr;
    }
}