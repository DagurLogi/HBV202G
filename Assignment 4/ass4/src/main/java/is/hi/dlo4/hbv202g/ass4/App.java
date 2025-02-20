package is.hi.dlo4.hbv202g.ass4;

import org.apache.commons.numbers.primes.Primes; // Import the Prime number library

public class App {
    public static void main(String[] args) {
        int number = 123456789;
        int nextPrime = Primes.nextPrime(number); // Find the next prime after 123456789

        System.out.println("The next prime after " + number + " is: " + nextPrime);
    }
}
