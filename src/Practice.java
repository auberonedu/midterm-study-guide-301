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
     * @param words a non-empty, non-null set of strings
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

    /**
     * Count how many words are longer than n characters and shorter than m characters in a ArrayList
     * 
     * @param words a non-empty, non-null list of strings
     * @param n a integer value that defines max length of the word
     * @param m a integer value that defines the min length of the word
     * @return how many words are longer than n characters and shorter than m characters
     */
    public static int wordCount(List<String> words, int n, int m) {
        // Variable to track word count
        int count = 0;

        // Iterate through every word in the words array
        for (String word : words) {
            if (word.length() > n && word.length() < m) {
                count++;
            }
        }

        // Return the word count
        return count;
    }

    /**
     * Find the difference between how many odd and even numbers there are in the values of a HashMap
     * 
     * @param nums a non-empty, non-null map of numbers
     * @return the difference between how many odd and even numbers there are in the values of a HashMap
     */
    public static int countEvenOdd(Map<String, Integer> nums) {
        // Variables to store even odd counts
        int evens = 0;
        int odds = 0;

        // Iterate through the map looking at the values
        for (Map.Entry<String, Integer> entry : nums.entrySet()) {
            // Store values in their own variables
            int value = entry.getValue();

            // Check for even/odd and add to count accordingly
            if ((value % 2) == 0) {
                // Value is even
                evens++;
            } else {
                // Value is odd
                odds++;
            }
        }

        // Make sure difference is always positive or 0
        if (odds > evens) {
            return odds - evens;
        } else if (odds < evens) {
            return evens - odds;
        } else {
            return 0;
        }
    }

}