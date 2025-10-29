import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

public class PracticeTest {


    @Test
    void testMaxDiffPositiveAndNegative() {
        // Arrange
        int[] test1 = {8, -2, 9, -5};
        int[] test2 = {10, 3, 7, 15, 2};
        int[] test3 = {-5, 0, 8, -1, 4};
        int[] test4 = {9, 9, 9};    


        // Act
        int actual = Practice.maxDifference(test1);
        int actual2 = Practice.maxDifference(test2);
        int actual3 = Practice.maxDifference(test3);
        int actual4 = Practice.maxDifference(test4);
        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(14, actual);
        assertEquals(13, actual2);
        assertEquals(13, actual3);
        assertEquals(0, actual4);
    }
     // TODO: Make tests for each problem you solve
    @Test
    void testGetLongestWord() {
       ArrayList<String> myList1 = new ArrayList<String>();
       myList1.add("apple");
       myList1.add("banana");
       myList1.add("ant");
       myList1.add("apricot");
       myList1.add("bear");

       String actual = Practice.getLongestWord(myList1, 'a');
        String actual1 = Practice.getLongestWord(myList1, 'b');

        assertEquals("apricot", actual);
        assertEquals("banana", actual1);
    }

    
   @Test
    void testNumberOfWords(){
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("apple", 1);    
        map1.put("banana", 2);   
        map1.put("kiwi", 3);     
        map1.put("a", 4);        
        map1.put("orange", 5);   
        map1.put("grape", 6);    


        HashMap<String, Integer> map2 = new HashMap<>();
            map2.put("cat", 1);       
            map2.put("dog", 2);       
            map2.put("elephant", 3); 


        int actual = Practice.numberOfWords(map1, 6, 3);
        int actual2 = Practice.numberOfWords(map2, 5, 3);
        assertEquals(3,actual);
        assertEquals(0,actual2);

    }

     @Test
    void testDifferenceBetweenOddAndEven(){
        HashMap<Integer, Integer> myMap = new HashMap<>();

        myMap.put(1,1);
        myMap.put(2,2);
        myMap.put(3,2);

        int actual = Practice.differenceBetweenOddAndEven(myMap);

        myMap.put(4,3);

        int actual2 = Practice.differenceBetweenOddAndEven(myMap);

        assertEquals(1, actual);
        assertEquals(0, actual2);
    }


}


