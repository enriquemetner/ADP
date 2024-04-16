package adp.aufgabe1.teilA;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LocalMaxTest {
    @Test
    public void testArr1() {
        int[] arr1 = {1, 61, 89, 75, 16, 33, 89, 59, 28, 3, 3, 97, 61, 85, 47, 38, 78, 7, 6, 15};
        int[] expected = {1, 61, 89, 75, 16};
        assertArrayEquals(expected, LocalMax.compute(arr1, 2));
    }

    @Test
    public void testArr2() {
        int[] arr2 = {1, 61, 16, 75, 89, 133, 89, 59, 28, 3, 3, 97, 61, 85, 47, 38, 78, 7, 6, 15};
        int[] expected = {16, 75, 89, 133, 89, 59, 28};
        assertArrayEquals(expected, LocalMax.compute(arr2, 3));
    }

    @Test
    public void testArr3() {
        int[] arr3 = {99, 1, 61, 89, 75, 16, 33, 89, 59, 28, 3, 3, 97, 61, 85, 47, 38, 78, 7, 6, 15};
        int[] expected = null;
        assertArrayEquals(expected, LocalMax.compute(arr3, 1));
    }
}
