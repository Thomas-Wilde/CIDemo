import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

/*
 * author: Thomas Wilde
 *
 * This class provides a thorough test for the `isPrime(number)` function.
 * It contains test methods that represent groups of possible inputs.
 *
 */

public class NextPrimeTest {
  // --------------------------------------------------------------- //
  @Test
  public void testNegativeNumbers() {
    System.out.print("testing negative numbers... ");
    for (int i = -10; i < 0; ++i) {
      assertEquals("Test negative number " + i, false, NextPrime.isPrime(i));
    }
    System.out.println("passed");
  }

  // --------------------------------------------------------------- //
  @Test
  public void testEdgeCases() {
    System.out.print("testing edge-cases... ");
    assertEquals("Test 0", false, NextPrime.isPrime(0));
    assertEquals("Test 1", false, NextPrime.isPrime(1));
    assertEquals("Test 2", true, NextPrime.isPrime(2));
    assertEquals("Test 3", true, NextPrime.isPrime(3));
    System.out.println("passed");
  }

  // --------------------------------------------------------------- //
  @Test
  public void testPrimes() {
    System.out.print("testing selected prime numbers... ");
    int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 271 };
    for (int i : primes) {
      assertEquals("Test number " + i, true, NextPrime.isPrime(i));
    }
    System.out.println("passed");
  }

  // --------------------------------------------------------------- //
  @Test
  public void testNonPrimes() {
    System.out.print("testing selected non-prime numbers... ");
    int[] numbers = { 4, 6, 8, 9, 10, 12, 14, 15, 16, 18,
        20, 21, 22, 24, 25, 26, 27, 28, 20, 21,
        22, 32, 33, 34, 35, 36, 38, 39, 40, 52,
        72, 112, 132, 170, 195, 232, 290, 316, 378, 270 };
    for (int i : numbers) {
      assertEquals("Test number " + i, false, NextPrime.isPrime(i));
    }
    System.out.println("passed");
  }

  // --------------------------------------------------------------- //
  @Test
  public void testNextPrime() {
    System.out.print("testing nextPrime() ... ");
    assertEquals("this will fail", false, true);
    // ToDo: implement this test function to check `nextPrime`
  }
}