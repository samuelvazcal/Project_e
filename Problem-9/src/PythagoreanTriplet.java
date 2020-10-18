public class PythagoreanTriplet {

    public void pythagoreanProduct(int limit) {
        boolean state = false;
        int a = 0;
        int b = 0;
        for(a = 1; a < limit / 3 ; a++) {
            for(b = a; b < limit / 2; b++) {
                int c = limit - a - b;
                if(Math.pow(c,2) ==  Math.pow(a,2) + Math.pow(b,2)) {
                    state = true;
                    System.out.println("The Pythagorean Triplet is: " + a + " + " + b + " + " + c + " = " + limit);
                    System.out.println("The product is: " + (a * b * c));
                    break;
                }
            }
            if(state) {
                break;
            }
        }
    }
}
