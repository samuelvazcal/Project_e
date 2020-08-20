public class Main {
	public static void main(String[] args) {
		int i;
		long number = 600851475143L;
		for(i=2;i<=number;i++){
			if(number%i==0) {
				number = number/i;
				i--;
			}
		}
		System.out.println("Largest prime factor: " + i);
	}
}
