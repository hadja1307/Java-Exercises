public class MathsClass {
    public static void main (String[] arg) {
        // pythagoras theorem follows that the hypotenuse of this triangle has length c = √a2 + b2,
        // the same as the hypotenuse of the first triangle. ... If a2 + b2 = c2

        int a = 5;
        int b = 10 ;
        double aSq = Math.pow(a, 2);
        double bSq = Math.pow(a, 2);
        double c = Math.sqrt(aSq + bSq);
        System.out.println("c = " + c);

    }
}
