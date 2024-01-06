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
    System.out.print("testing nextPrime(number) ... ");
    // 2, 3, 5, 7, 11, 13, 17, 19,
    // nextPrime(-1) -> 2
    // nextPrime(0) -> 2
    // nextPrime(2) -> 2
    // nextPrime(3) -> 3
    // nextPrime(4) -> 5
    // nextPrime(5) -> 5
    // nextPrime(257) -> 257
    // nextPrime(258) -> 263
    // nextPrime(259) -> 263
    // nextPrime(260) -> 263
    assertEquals("-1 -> 2", 2, NextPrime.nextPrime(-1));
    assertEquals("0 -> 2", 2, NextPrime.nextPrime(0));
    assertEquals("2 -> 2", 2, NextPrime.nextPrime(2));
    assertEquals("3 -> 3", 3, NextPrime.nextPrime(3));
    assertEquals("4 -> 5", 5, NextPrime.nextPrime(4));
    assertEquals("5 -> 5", 5, NextPrime.nextPrime(5));
    assertEquals("257 -> 257", 257, NextPrime.nextPrime(257));
    assertEquals("258 -> 263", 263, NextPrime.nextPrime(263));
  }
}