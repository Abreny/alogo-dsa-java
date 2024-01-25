package pro.abned.algo.binary_search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayFixedPointTest {
    @Test
    void testGetFixedPoint() {
        int[] input = new int[] {-6, 0, 2, 40};
        int result = ArrayFixedPoint.get(input);
        assertEquals(2, result);
    }

    @Test
    void testGetFixedPointNotExist() {
        int[] input = new int[] {1, 5, 7, 8};
        int result = ArrayFixedPoint.get(input);
        assertEquals(-1, result);
    }
}
