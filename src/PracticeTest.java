import static org.junit.Assert.*;

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
    void testMaxDiffAllPositive() {
        // Arrange
        int[] numbers = {8, 15, 9, 10};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // Largest: 15, Smallest: 8, Difference: 15-8 = 7
        assertEquals(7, actual);
    }

    // TODO: Make tests for each problem you solve
    
}


