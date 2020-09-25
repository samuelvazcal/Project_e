public class SumSquareDiff {

	public static int sumSquare (int limit) {
		double sumSquares = 0;
		double sum = 0;
		int i = 1;

		for(; i <= limit; i++) {
			sum = Math.pow(i,2);
			sumSquares += sum;
		}
		return (int)sumSquares;
	}

	public static long squareSum(int limit) {
		boolean flag = true;
		int count = 0;
		int j = 1;
		double squareSum = 0;

		while (flag) {
			if(j==limit) {
				count += j;
				squareSum = Math.pow(count,2);
				flag = false;
			}
			count += j;
			j++;
		}
		return (long)squareSum;
	}

	public static int totalDiff(int sumSquare, long squareSum) {
		return (int) (squareSum - sumSquare);
	}
}
