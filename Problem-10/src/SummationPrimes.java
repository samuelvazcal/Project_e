public class SummationPrimes {

    public static boolean isPrime(int n) {
        if(n==1) {
            return false;
        }
        for(int i = 2; i <= n/2; i++) {
            if(n % i ==0) {
                return false;
            }
        }
        return true;
    }

    public static int summationPrime(int limit) {
        int count = 0;
        for(int i = 1; i <= limit; i++) {
            if(isPrime(i)) {
                count += i;
                //System.out.println("Summation is: " + count);
            }
        }
        return count;
    }
}
