import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int i = 0;
        while (i < 10) {
            System.out.println("hi there how is your day going");
            i++;
        }

        //The following loop prints the sum of all the numbers the user enters as long as it isn’t a zero (assume input has already been declared as a Scanner object):

        int sum = 0;
        int number = 1;
        while (number != 0) {
            System.out.println("Enter a number or 0 to get the sum: ");
            number = input.nextInt();
            sum += number;
        }
        System.out.println("The sum is " + sum);


        //the code below does not let the user get out of the loop if the answer isn't yes or no
        /*

        String answer = "";
while (!answer.equals("yes") && !answer.equals("no")) {
    System.out.println("Enter yes or no: ");
    answer = input.getNext();
}
System.out.println("Thank you!");
         */
        String answer = "";

        while (!answer.equals("yes") && !answer.equals("no")) {

            System.out.println("please enter yes or no " + answer );
            answer = input.next();

            if (answer.equals("") ){
                System.out.println("please enter yes or no ");
                System.out.println("unfortunately you have not typed anything, please try again");
            }
            else {
                System.out.println("well done, you have typed something in, but not exactly what you were asked to type in, please try again");
            }
        }
        System.out.println("Thank you you finally made it, have a wonderful day");
    }
}
/*
variable initialization;
while (test) {
    body
    variable update
}

*/