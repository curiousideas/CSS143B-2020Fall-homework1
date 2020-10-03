import org.junit.Test;

import static org.junit.Assert.*;

public class Problem2Test {

    // Example test
    // Okay to change
    @Test
    public void testBubbleSort() {
        int inputs[][] = {
                {},
                {3},
                {3},
                {1,3,3,6,1,8,0,10,22,4,3},
                {1,2,3,4,5,6,7,8,9,2},
                {4,6,8,2,10,11,12,13},
                {10,9,8,7,6,5,4,3,2,1},
        };
        int answers[][] = {
                {},
                {3},
                {3},
                {0,1,1,3,3,3,4,6,8,10,22},
                {1,2,2,3,4,5,6,7,8,9},
                {2,4,6,8,10,11,12,13},
                {1,2,3,4,5,6,7,8,9,10},
        };

        assertEquals(inputs.length, answers.length);
        // pass x array from inputs[][] to bubbleSort, get output, compare output to x array in answers[][]
        for (int i = 0; i < inputs.length; i++) {
            Problem2.bubbleSort(inputs[i]);
            assertArrayEquals(answers[i], inputs[i]);
        }

    }
}
