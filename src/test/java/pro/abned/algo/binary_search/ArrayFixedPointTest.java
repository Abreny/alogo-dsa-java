package pro.abned.algo.binary_search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayFixedPointTest {
    @Test
    void testGetFixedPoint() {
        assertEquals(0, ArrayFixedPoint.get(new int[] {0, 2, 3, 4}));
        assertEquals(2, ArrayFixedPoint.get(new int[] {-6, 0, 2, 40}));
        assertEquals(4, ArrayFixedPoint.get(new int[] {-4, -2, 0, 1, 4, 6, 7}));
        assertEquals(1, ArrayFixedPoint.get(new int[] {-1, 1, 5, 6}));
    }

    @Test
    void testGetFixedPointNotExist() {
        assertEquals(-1, ArrayFixedPoint.get(new int[] {-1, -2, -3, -4}));
        assertEquals(-1, ArrayFixedPoint.get(new int[] {1, 5, 7, 8}));
    }
}
