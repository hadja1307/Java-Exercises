public class nestedllopAndIF {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int a = 1; a <= i; a++) {

                System.out.println("i is" + i + "a is " + a);
                if (a<=i) {
                    System.out.println("a is equal to i" + a + i);
                }
                else {
                    System.out.println("sorry unfortunately a is not equal to i, you may try again later, thank you for your patience, Adios");
                }

            }
        }
    }
}
