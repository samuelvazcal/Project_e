public class Main {
	public static void main(String[] args) {
		System.out.println(isPalindrome(2112));

		int result;
		int largestPalindrome=0;
		for(int i=1;i<1000;i++){
			for(int j=1;j<1000;j++){
				result=i*j;
				if(isPalindrome(result)) {
					largestPalindrome=Math.max(largestPalindrome,result);
				}
			}
		}
		System.out.println(largestPalindrome);
	}

	public static boolean isPalindrome(int number){
		int remainingDigit = 0;
		int reverse = 0;
		int original = number;
		while(number>0) {
				remainingDigit = number % 10;
				reverse = reverse*10;
				reverse += remainingDigit;
				number/=10;
		}
		if(original==reverse){
			return true;
		}
		return false;
	}
}
