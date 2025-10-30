import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.jupiter.api.Test;

public class PracticeTest {

    // TODO: Make more tests for maxDiff
    @Test
    void testMaxDiffPositiveAndNegative() {
        // Arrange
        int[] numbers = {8, -2, 9, -5};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(14, actual);
    }
    

    @Test
    void testLongestWord() {
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("apple");
        wordList.add("pen");
        wordList.add("agriculture");

        String actual = Practice.longestWordStartsWith(wordList, 'a');

        assertEquals(actual, "agriculture");
    }

    @Test
    void testLongestWordSolo() {
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("apple");
        wordList.add("pen");
        wordList.add("agriculture");

        String actual = Practice.longestWordStartsWith(wordList, 'p');

        assertEquals(actual, "pen");
    }

    @Test
    void wordLongerAndShorter() {
        HashMap<String, String> wordList = new HashMap<>();
        wordList.put("apple", "pen");
        wordList.put("orange", "banana");
        wordList.put("key", "value");

        int actual = Practice.countWordsLongerandShorterByKey(wordList, 4, 8);

        assertEquals(actual, 2);
    }

    @Test
    void evenAndOddDifference() {
        int[] nums = {0,1,5,6,8,10};

        int actual = Practice.differenceBetweenOddAndEven(nums);

        assertEquals(2, actual);
    }

    @Test
    void secondLargestNumber() {
        HashMap<Integer, Integer> numList = new HashMap<>();
        numList.put(0, 20);
        numList.put(5, 30);
        numList.put(10, 50);
        numList.put (12, 10);
        numList.put(7, 200);

        int actual = Practice.secondLargestNumber(numList);

        assertEquals(50, actual);
    }
}


