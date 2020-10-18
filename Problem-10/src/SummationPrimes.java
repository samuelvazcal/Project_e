public class SummationPrimes {

    public static boolean isPrime(long n) {
        if(n==1) {
            return false;
        }
        for(long i = 2; i <= n/2; i++) {
            if(n % i ==0) {
                return false;
            }
        }
        return true;
    }

    public static boolean[] simpleSieve(int n) {
        boolean[] sieve = new boolean[n+1];   //false = prime, true = composite
        sieve[0] = true; sieve[1] = true; sieve[2] = false;
        for(int i = 4; i <= n ; i += 2) {
            sieve[i] = true;
        }
        int limit = (int) Math.sqrt(n)+1;
        for(int i = 3; i < limit; i += 2) {
            if(!sieve[i]) { //if prime (or not composite)
                for(int j = i*i; j<=n; j+=i) {  // marks all multiples of i as composite
                    sieve[j] = true;
                }
            }
        }
        return sieve;
    }

    public static long summationPrime(int n) {
        long count = 0;
        boolean[] primes = simpleSieve(n);
        for(int i = 1; i < primes.length; i++) {
            if(!primes[i]) {
                count += i;
            }
        }
        return count;
    }
}
