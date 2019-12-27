public class nestedloops {
    public static void main (String[] arg) {
        for (int i = 1; i <= 6; i++) {
            System.out.println("Outer i = " + i);
            for (int j = 1; j <= 5; j++) {
                System.out.println("  Inner j = " + j);
            }
        }



    }
}
