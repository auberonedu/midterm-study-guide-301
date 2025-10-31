import static org.junit.Assert.*;
import java.util.*;

import org.junit.jupiter.api.Test;

public class PracticeTest {

    // TODO: Make more tests for maxDiff
    @Test
    void testMaxDiff_PositiveAndNegative() {
        // Arrange
        int[] numbers = {8, -2, 9, -5};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(14, actual);
    }
    
    @Test
    void testMaxDiff_AllPositive() {
        // Arrange
        int[] numbers = {8, 15, 9, 10};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // Largest: 15, Smallest: 8, Difference: 15-8 = 7
        assertEquals(7, actual);
    }

    // TODO: Make tests for each problem you solve
    @Test
    void testLongestWordWithChracter_AllDifferentSize() {
        // Arrange
        Set<String> words = new HashSet<>(Arrays.asList("Helicopter", "hey", "hello"));

        // Act
        String actual = Practice.longestWordWithCharacter(words, 'H');

        // Assert
        assertEquals("Helicopter", actual);
    }

    @Test
    void testLongestWordWithChracter_TwoSameSize() {
        // Arrange
        Set<String> words = Set.of("hoy", "hey", "hooo");

        // Act
        String actual = Practice.longestWordWithCharacter(words, 'H');

        // Assert
        assertEquals("hooo", actual);
    }

    @Test
    void testWordCount_oneRightWord() {
        // Arrange
        List<String> words = new ArrayList<>(Arrays.asList("he", "genes", "worlds", "counter"));

        // Act
        int actual = Practice.wordCount(words, 1, 3);

        // Assert
        assertEquals(1, actual);
    }

    @Test
    void testWordCount_noRightWords() {
        // Arrange
        List<String> words = new ArrayList<>(Arrays.asList("hello", "genes", "worlds", "counter"));

        // Act
        int actual = Practice.wordCount(words, 1, 3);

        // Assert
        assertEquals(0, actual);
    }

    @Test
    void testCountEvenOdd_moreOdds() {
        // Arrange
        Map<String, Integer> nums = new HashMap<>(Map.of("1", 1, "2", 2,  "3", 3, "4", 4, "5", 5));

        // Act
        int actual = Practice.countEvenOdd(nums);

        // Assert
        assertEquals(1, actual);
    }

    @Test
    void testCountEvenOdd_equalCount() {
        // Arrange
        Map<String, Integer> nums = new HashMap<>(Map.of("1", 1, "2", 2,  "3", 3, "4", 4));

        // Act
        int actual = Practice.countEvenOdd(nums);

        // Assert
        assertEquals(0, actual);
    } 

    @Test
    void testFindSecondLargestNum_positiveNums() {
        // Arrange
        Map<Integer, String> nums = new HashMap<>(Map.of(1, "1", 2, "2", 3, "3", 4, "4"));

        // Act
        int actual = Practice.findSecondLargestNum(nums);

        // Assert
        assertEquals(3, actual);
    }

    @Test
    void testFindSecondLargestNum_negativeNums() {
        // Arrange
        Map<Integer, String> nums = new HashMap<>(Map.of(-1, "-1", -2, "-2", -3, "-3", -4, "-4"));

        // Act
        int actual = Practice.findSecondLargestNum(nums);

        // Assert
        assertEquals(-2, actual);
    }

    @Test
    void testFindSecondLargestNum_twoNums() {
        // Arrange
        Map<Integer, String> nums = new HashMap<>(Map.of(-1, "-1", -2, "-2"));

        // Act
        int actual = Practice.findSecondLargestNum(nums);

        // Assert
        assertEquals(-2, actual);
    }
}


