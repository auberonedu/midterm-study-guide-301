import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class PracticeTest {

    @Test
    void testMaxDiffPositiveAndNegative() {
        // Arrange
        int[] numbers = {8, -2, 9, -5};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        assertEquals(14, actual);
    }
    
}


