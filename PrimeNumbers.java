public class PrimeNumbers
{
  private static final int NUM = 1000;
  private static final int FIRST_PRIME = 2;
  private static int[] primes;
  private static int primesCount;

  private static void fillPrimesArray()
  {
    for(int i = 3; i <= NUM; i++) //Starts at 3 since 2 has already been done.
    {
      if(isPrime(i))//Check if i is a prime number. 
      {
        primes[primesCount] = i;//Add i to the array. 
        primesCount++;
      }
    }
  }

  private static boolean isPrime(int number)
  {
    for(int i = 0; i < primesCount; i++)
    {
      if(number % primes[i] == 0)
      {
        return false;
      }
    }
    return true;
  }

  private static void printArray()
  {
    for(int i = 0; i < primesCount; i++)
    {
      System.out.println(primes[i]);
    }
  }

  public static void main(String[] args)
  {
    primes = new int[NUM];
    primes[0] = FIRST_PRIME; //Add the first prime to the array
    primesCount = 1; //Starts at 1 since the first prime is in the array

    fillPrimesArray();
    printArray();
  }
}
