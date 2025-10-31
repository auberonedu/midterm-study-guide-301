import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;
import java.util.Set;

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
    

    // TODO: Make tests for each problem you solve
    @Test
    void testLongestWordSpecific(){
        List<String> stringList = List.of("char", "collab", "charizard");
        String actual = Practice.longestWordSpecificLetter(stringList, 'c');

        assertEquals("charizard", actual);
    }

    @Test
    void testWordsLongerThanMN(){
        Set<String> stringSet = Set.of("public", "a", "the", "demonstrate", "collaborate");
        int actual = Practice.wordsLongerThanMN(stringSet, 6, 7);
        assertEquals(4, actual);
    }

    @Test
    void testDiffEvenOdd(){
        Map<String, Integer> stringMap = Map.of("even", 4, "odd", 5);
        int actual = Practice.diffEvenOdd(stringMap);
        assertEquals(1, actual);
    }

    @Test
    void testSecondLargest(){
        Map<Integer, Integer> intMap = Map.of(3, 4, 2, 5);
        int actual = Practice.secondLargest(intMap);
        assertEquals(2, actual);
    }
}


