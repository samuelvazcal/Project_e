public class Main {
	public static void main(String[] args) {
		int start = 1;
		while(!checkPoint(start)) {
			start++;
		}
		System.out.println("Smallest number is: " + start);
	}

	public static boolean checkPoint(int number) {
		for(int i=1;i<=20;i++) {
			if(number%i!=0) {
				return false;
			}
		}
		return true;
	}
}
