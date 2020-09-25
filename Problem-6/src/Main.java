public class Main {
	public static void main(String[] args) {

		final int  LIMIT_NATURAL_NUMBER = 100;
		int x = SumSquareDiff.sumSquare(LIMIT_NATURAL_NUMBER);
		System.out.println("The sum of the squares is: " + x);
		long y = SumSquareDiff.squareSum(LIMIT_NATURAL_NUMBER);
		System.out.println("The square of the sum is: " + y);
		System.out.println("Difference between the sum of the squares and the square of the sum: " + SumSquareDiff.totalDiff(x,y));
	}
}
