import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

public class PracticeTest {

    // TODO: Make more tests for maxDiff
    @Test
    void testMaxDiffPositiveAndNegative() {
        // Arrange
        int[] numbers = {8, -2, 9, -5};

        // Act
        int actual = Practice.maxDifference(numbers);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(14, actual);
    }
    

     /**
     *  Find the longest word that starts with a specific character letter in.
     * 
     * @param myList a non-empty, non-null list of numbers
     * @param target
     * @return the difference between the largest and smallest number
     */
      public static String getLongestWord(ArrayList<String> myList, char target){
        String currentLongest = "";
        if(myList.get(0).charAt(0) == target){
            currentLongest = myList.get(0);
        }
        
        for(int i = 1; i < myList.size(); i++){
            if(myList.get(i).length() > currentLongest.length() && myList.get(i).charAt(0) == target){
                currentLongest = myList.get(i);
            }
        }

        return currentLongest;

    }
    
      /**
     *  Count how many words are longer than n characters and shorter than m characters in:
     * 
     * @param myMap a non-empty, non-null map of String keys and Value numbers
     * @return the difference between the largest and smallest number
     */
    public static int numberOfWords(HashMap<String, Integer> myMap, int m, int n){
        int count = 0;

        for(String word: myMap.keySet()){
            if(word.length() < m && word.length() > n){
                count++;
            }
        }

        return count;
    }

    /**
     *  Find the difference between the how many odd and even numbers there are in:
     * 
     * @param numbers a non-empty, non-null hashset
     * @return the difference between the largest and smallest number
     */
    public static int differenceBetweenOddAndEven(HashSet<Integer> numbers){
        int oddCount = 0, evenCount = 0;
        for(int number : numbers){
            if(number % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        return oddCount - evenCount;
    }

    
}


