/**
 * This class provides a static method that checks if a given number is a prime.
 * author: Thomas Wilde
 */
public class NextPrime {

  // --------------------------------------------------------------- //
  /**
   * \return true if 'number' is prime, false otherwise
   */
  public static boolean isPrime(int number) {
    // --- primes start at 2 by definition
    if (number < 2)
      return false;
    // --- 2 is prime by definition
    if (2 == number)
      return true;
    // --- 3 is prime by definition
    if (3 == number)
      return true;
    // --- check all even numbers
    if (number % 2 == 0)
      return false;
    // --- check all odd number
    int n = 3;
    while (n * n <= number) {
      if (number % n == 0)
        return false;
      n += 2;
    }
    return true;
  }

  // --------------------------------------------------------------- //
  /**
   * \return The next prime that is bigger than `number` or
   * the number itself, if it is prime.
   */
  public static int nextPrime(int number) {
    // ToDo: implement the unit test first
    // ToDo: add code to get the next prime number
    return 0;
  }

  // --------------------------------------------------------------- //
  /**
   * The main method just test the numbers in [-3, 100].
   * The result can be compared manually with online lists.
   */
  public static void main(String[] args) {
    for (int i = -3; i < 100; ++i) {
      System.out.print(i);
      if (isPrime(i)) {
        System.out.println(" is prime");
      } else {
        System.out.println(" is NOT prime");
      }
    }
  }
}