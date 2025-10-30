import java.util.ArrayList;
import java.util.HashMap;

public class Practice {
    /**
     * Returns the difference between the largest and smallest integer in an array.
     * 
     * @param nums a non-empty, non-null array of numbers
     * @return the difference between the largest and smallest number
     */
    public static int maxDiff(int[] nums) {
        int highest = 0;
        int lowest = 0;
        for(int num : nums) {
            if(num > highest) {
                highest = num;
            } else if(num < lowest) {
                lowest = num;
            }

        }
        return highest-lowest;
    }

    public static String longestWordStartsWith(ArrayList<String> wordList, char letter) {
        String longestWord = "";
        int longestWordLength = 0;
        for(String word : wordList) {
            if(word.substring(0, 1).charAt(0)==letter) {
                if(word.length() > longestWordLength) {
                    longestWord = word;
                    longestWordLength = word.length();
                }
            }
        }
        return longestWord;
    }

    public static int countWordsLongerandShorterByKey(HashMap<String, String> wordList, int minChars, int maxChars) {
        int wordsInRange = 0;
        for(String word : wordList.keySet()) {
            if(word.length() > minChars && word.length() < maxChars) {
                wordsInRange++;
            }
        }
        return wordsInRange;
    }

    public static int differenceBetweenOddAndEven(int[] nums) {
        int difference = 0;
        for(int i : nums) {
            if(i % 2 == 0) {
                difference++;
            } else {
                difference--;
            }
        }
        return Math.abs(difference);
    }

    public static int secondLargestNumber(HashMap<Integer, Integer> numList) {
        int largestNumber = 0;
        int secondLargestNumber = 0;
        for(int num : numList.values()) {
            if(num > secondLargestNumber) {
                if(num > largestNumber) {
                    secondLargestNumber = largestNumber;
                    largestNumber = num;
                } else {
                    secondLargestNumber = num;
                }
            }
        }

        return secondLargestNumber;
    }
}