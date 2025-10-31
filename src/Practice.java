import java.util.Set;
import java.util.List;
import java.util.Map;
public class Practice {
    /**
     * Returns the difference between the largest and smallest integer in an array.
     * 
     * @param nums a non-empty, non-null array of numbers
     * @return the difference between the largest and smallest number
     */
    public static int maxDiff(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int num : nums){
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        return max - min;

    }

    public static String longestWordSpecificLetter(List<String> words, char c){
        String longestWord = words.get(0);

        for (String word : words){
            if (word.length() > longestWord.length() && word.charAt(0) == c){
                longestWord = word;
            }
        }


        return longestWord;
    }

    public static int wordsLongerThanMN(Set<String> words, int m, int n){
        int count = 0;

        for (String word : words){
            if (word.length() > n || word.length() < m){
                count++;
            }
        }

        return count;
    }

    public static int diffEvenOdd(Map<String, Integer> evenOdd){
        return Math.abs(evenOdd.get("even") - evenOdd.get("odd"));
    }

    public static int secondLargest(Map<Integer, Integer> nums){
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num: nums.keySet()){
            if (num > largest){
                largest = num;
            } else if (num < largest && num > second){
                second = num;
            }
        }

        return second;
    }








    // TODO: Implement the other methods from the study guide AND tests for each one

    // For each method you are only required to implement it for one of the data
    // structures. But use a different data structure for each method. For example,
    // do maxDiff with an array, the next question with a Set, etc.
}