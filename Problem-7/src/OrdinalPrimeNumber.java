public class OrdinalPrimeNumber {

	public static int primeNumber (int maxValue, int limit) {
		int count = 0;
		int i = 1;
		for(; i < maxValue; i++) {
			if(isPrime(i)) {
				count++;
				if(count == limit) {
					break;
				}
			}
		}
		return i;
	}

	public static boolean isPrime(int n) {
		if(n==1) {
			return false;
		}
		for(int i = 2; i<=n/2; i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}

}
