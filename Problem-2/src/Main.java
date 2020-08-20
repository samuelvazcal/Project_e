public class Main {
	public static void main(String[] args) {
		int firstNum = 0;
		int secondNum = 1;
		int count=0;
		int sum = 0;
		int number = 1;
		for(int i=1; sum < 4000000;i++){
			count = firstNum+secondNum;
			firstNum=secondNum;
			secondNum=count;
			if(count%2==0){
				sum+=count;
			}
			System.out.print(count+" ");
		}
		System.out.println("\nTotal sum:"+sum);
	}
}
