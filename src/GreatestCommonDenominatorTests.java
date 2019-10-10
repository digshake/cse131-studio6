import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreatestCommonDenominatorTests {

    @Test
    public void testGcdSimpleIterative() {
        assertEquals("iterative gcd(6, 1) = 1", 1, Methods.gcdIterative(6, 1));
        assertEquals("iterative gcd(1, 6) = 1", 1, Methods.gcdIterative(1, 6));

    }

    @Test
    public void testGcdSimpleRecursive() {
        assertEquals("recursive gcd(6, 1) = 1", 1, Methods.gcdRecursive(6, 1));
        assertEquals("recursive gcd(1, 6) = 1", 1, Methods.gcdRecursive(1, 6));

    }

    @Test
    public void testGcdNotSoSimpleRecursive() {
        assertEquals("recursive gcd(27, 36) = 9", 9, Methods.gcdRecursive(27, 36));
        assertEquals("recursive gcd(36, 27) = 9", 9, Methods.gcdRecursive(36, 27));
        assertEquals("recursive gcd(48, 14) = 2", 2, Methods.gcdRecursive(48, 14));
        assertEquals("recursive gcd(14, 48) = 2", 2, Methods.gcdRecursive(14, 48));
    }

    @Test
    public void testGcdNotSoSimpleIterative() {
        assertEquals("Iterative gcd(27, 36) = 9", 9, Methods.gcdIterative(27, 36));
        assertEquals("Iterative gcd(36, 27) = 9", 9, Methods.gcdIterative(36, 27));
        assertEquals("Iterative gcd(48, 14) = 2", 2, Methods.gcdIterative(48, 14));
        assertEquals("Iterative gcd(14, 48) = 2", 2, Methods.gcdIterative(14, 48));
    }

    @Test
    public void testGcdMethodsAreEquivalent() {
        for(int i = 0; i < 100; i++) {
            int p = (int)(Math.random() * 9999 + 1);
            int q = (int)(Math.random() * 9999 + 1);

            int iterativeResult = Methods.gcdIterative(p, q);
            int recursiveResult = Methods.gcdRecursive(p, q);

            assertEquals("Return values differ for p = " + p + " q = " + q, iterativeResult, recursiveResult);
        }
    }
}
