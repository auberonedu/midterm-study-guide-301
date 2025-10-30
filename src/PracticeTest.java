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

}


