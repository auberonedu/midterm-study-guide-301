import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class PracticeTest {

    @Test
    void testMaxDifferenceWithPositiveAndNegative() {
        int[] test1 = {8, -2, 9, -5};
        
        int actual = Practice.maxDifference(test1);
        
        assertEquals(14, actual);
    }

    @Test
    void testMaxDifferenceWithAllPositive() {
        int[] test2 = {10, 3, 7, 15, 2};
        
        int actual = Practice.maxDifference(test2);
        
        assertEquals(13, actual);
    }

    @Test
    void testMaxDifferenceWithNegativeZeroAndPositive() {
        int[] test3 = {-5, 0, 8, -1, 4};
        
        int actual = Practice.maxDifference(test3);
        
        assertEquals(13, actual);
    }

    @Test
    void testMaxDifferenceWithAllSameValues() {
        int[] test4 = {9, 9, 9};
        
        int actual = Practice.maxDifference(test4);
        
        assertEquals(0, actual);
    }

    @Test
    void testGetLongestWordStartingWithA() {
        List<String> myList1 = new ArrayList<String>();
        myList1.add("apple");
        myList1.add("banana");
        myList1.add("ant");
        myList1.add("apricot");
        myList1.add("bear");

        String actual = Practice.getLongestWord(myList1, 'a');
        
        assertEquals("apricot", actual);
    }

    @Test
    void testGetLongestWordStartingWithB() {
        List<String> myList1 = new ArrayList<String>();
        myList1.add("apple");
        myList1.add("banana");
        myList1.add("ant");
        myList1.add("apricot");
        myList1.add("bear");

        String actual = Practice.getLongestWord(myList1, 'b');
        
        assertEquals("banana", actual);
    }

    @Test
    void testNumberOfWordsWithMultipleMatches() {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("apple", 1);    
        map1.put("banana", 2);   
        map1.put("kiwi", 3);     
        map1.put("a", 4);        
        map1.put("orange", 5);   
        map1.put("grape", 6);    

        int actual = Practice.numberOfWords(map1, 6, 3);
        
        // Assert
        assertEquals(3, actual);
    }

    @Test
    void testNumberOfWordsWithNoMatches() {
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("cat", 1);       
        map2.put("dog", 2);       
        map2.put("elephant", 3); 

        // Act
        int actual = Practice.numberOfWords(map2, 5, 3);
        
        // Assert
        assertEquals(0, actual);
    }

    @Test
    void testDifferenceBetweenOddAndEvenWithUnequalCounts() {
        Map<Integer, Integer> myMap = new HashMap<>();
        myMap.put(1, 1);
        myMap.put(2, 2);
        myMap.put(3, 2);

        int actual = Practice.differenceBetweenOddAndEven(myMap);

        assertEquals(1, actual);
    }

    @Test
    void testDifferenceBetweenOddAndEvenWithEqualCounts() {
        // Arrange
        Map<Integer, Integer> myMap = new HashMap<>();
        myMap.put(1, 1);
        myMap.put(2, 2);
        myMap.put(3, 2);
        myMap.put(4, 3);

        int actual = Practice.differenceBetweenOddAndEven(myMap);

        // Assert
        assertEquals(0, actual);
    }

    @Test
    void testSecondLargestIntegerWithTenElements() {
        Set<Integer> mySet = new HashSet<>();
        for(int i = 1; i < 11; i++){
            mySet.add(i);
        }

        int actual = Practice.secondLargestInteger(mySet);

        assertEquals(9, actual);
    }

    @Test
    void testSecondLargestIntegerWithElevenElements() {
        Set<Integer> mySet = new HashSet<>();
        for(int i = 1; i < 12; i++){
            mySet.add(i);
        }

        int actual = Practice.secondLargestInteger(mySet);

        assertEquals(10, actual);
    }
}