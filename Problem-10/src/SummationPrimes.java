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

    public static long summationPrime(long limit) {
        long count = 0;
        for(int i = 1; i < limit; i++) {
            if(isPrime(i)) {
                count += i;
            }
        }
        return count;
    }
}
