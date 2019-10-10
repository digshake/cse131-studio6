import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class ReverseTests {

    @Test
    public void testSmallArrays() {
        int[] a = {1};
        int[] b = {7};
        assertArrayEquals("Array with one value should be unchanged", a, Methods.reverse(a));
        assertArrayEquals("Array with one value should be unchanged", b, Methods.reverse(b));

    }

    @Test
    public void testReallySmallArrays() {
        assertArrayEquals("Array with no values should be unchanged", new int[0], Methods.reverse(new int[0]));
    }

    @Test
    public void testEvenLengths() {
        int[] a = {1, 2};
        int[] b = {2, 4, 6, 8};
        int[] c = {1, 3, 1, 3, 1, 3};

        assertArrayEquals("Failure on even length array: " + Arrays.toString(a), new int[] {2, 1}, Methods.reverse(a));
        assertArrayEquals("Failure on even length array: " + Arrays.toString(b), new int[] {8, 6, 4, 2}, Methods.reverse(a));
        assertArrayEquals("Failure on even length array: " + Arrays.toString(c), new int[] {3, 1, 3, 1, 3, 1}, Methods.reverse(a));

    }

    @Test
    public void testOddLengths() {
        int[] a = {1, 3, 2};
        int[] b = {1, 2, 3, 2, 3};
        int[] c = {8, 6, 7, 5, 3, 0, 9};

        assertArrayEquals("Failure on odd length array: " + Arrays.toString(a), new int[] {2, 3, 1}, Methods.reverse(a));
        assertArrayEquals("Failure on odd length array: " + Arrays.toString(b), new int[] {3, 2, 3, 2, 1}, Methods.reverse(a));
        assertArrayEquals("Failure on odd length array: " + Arrays.toString(c), new int[] {9, 0, 3, 5, 7, 6, 8}, Methods.reverse(a));

    }
}
