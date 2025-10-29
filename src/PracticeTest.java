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

    
   

}


