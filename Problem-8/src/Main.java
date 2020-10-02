public class Main {
	public static void main(String[] args) {
		String thousandDigitNumber = "73167176531330624919225119674426574742355349194934\n"
				+ "96983520312774506326239578318016984801869478851843\n"
				+ "85861560789112949495459501737958331952853208805511\n"
				+ "12540698747158523863050715693290963295227443043557\n"
				+ "66896648950445244523161731856403098711121722383113\n"
				+ "62229893423380308135336276614282806444486645238749\n"
				+ "30358907296290491560440772390713810515859307960866\n"
				+ "70172427121883998797908792274921901699720888093776\n"
				+ "65727333001053367881220235421809751254540594752243\n"
				+ "52584907711670556013604839586446706324415722155397\n"
				+ "53697817977846174064955149290862569321978468622482\n"
				+ "83972241375657056057490261407972968652414535100474\n"
				+ "82166370484403199890008895243450658541227588666881\n"
				+ "16427171479924442928230863465674813919123162824586\n"
				+ "17866458359124566529476545682848912883142607690042\n"
				+ "24219022671055626321111109370544217506941658960408\n"
				+ "07198403850962455444362981230987879927244284909188\n"
				+ "84580156166097919133875499200524063689912560717606\n"
				+ "05886116467109405077541002256983155200055935729725\n"
				+ "71636269561882670428252483600823257530420752963450";

		int[] A = new int [13];
		long greatestProduct = 0;
		String sSubChain;
		String noLineFeedString;
		boolean flag = true;
		long ultimateThirteenDigits = 0;

		System.out.println();
		System.out.println("This is the number:\n" + thousandDigitNumber);
		noLineFeedString = thousandDigitNumber.replace("\n","");
		System.out.println("Without line feed: \n" + noLineFeedString);
		System.out.println();


		for(int i = 0; i <= noLineFeedString.length()-13; i++) {
			long productCount = 1;
			sSubChain = noLineFeedString.substring(i,i+13);
			//System.out.println("sSubChain length is: " + sSubChain.length());
			for(int j = 0; j < A.length; j++) {
				A[j] = Character.getNumericValue(sSubChain.charAt(j));
				productCount *= A[j];
			}
			greatestProduct = Math.max(greatestProduct,productCount);
			if(productCount==greatestProduct) {
				ultimateThirteenDigits = Long.parseLong(sSubChain);
			}

			System.out.println("Subchain number " + (i+1) + ": "  + sSubChain + " and the product of its four digits is : " + productCount);
			System.out.println("The greatest product so far: " + greatestProduct);
			System.out.println("The ultimate thirteen digits are: " + ultimateThirteenDigits + "\n");
		}


	}
}

