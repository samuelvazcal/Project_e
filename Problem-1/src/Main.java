public class Main {
	public static void main(String[] args) {
		int count = 0;
		for(int i = 999; i >= 1; i--) {
			if(i%3==0 || i%5==0) {
				count=count+i;
			}
		}
		System.out.println("total for 3 and 5 is: " +count);
	}
}
