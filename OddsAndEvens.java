import java.util.*;
import java.lang.*;
public class OddsAndEvens {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Let's play a game called 'Odds and Evens' ");

        System.out.println("what is your name?");
        String name = input.nextLine();
        System.out.println("Hi, " + name + ", which do you choose? (odd) Odd or (even) Even?");

        String odds = input.nextLine();
        String evens = input.nextLine();

        /*
 structure of for loop

for (variable initialization; test; variable update) {
        body

        }

        */

        if (odds.equals("odd") || odds.equals("Odd")) {
            System.out.println("you have chosen Odd ");
            System.out.println(name + " has picked, " + odds + "! The Computer will be evens");

        } else if (evens.equals("even") || evens.equals("Even")) {
            System.out.println("you have chosen Even");
            System.out.println(name + " has picked, " + evens + "! The Computer will be odds");

        } else {
            System.out.println("You have not chosen anything Goodbye");
            System.exit(0);
        }

        System.out.println("How many 'fingers 'do you put out?");
        int UserNumberOfFingers = input.nextInt();

        Random rand = new Random(); //for a random number
        int computerNumber = rand.nextInt(6); //computer will choose a random number e.g. 6

        System.out.println("The computer plays number 'fingers' " + computerNumber);

        int sum = UserNumberOfFingers + computerNumber;

        System.out.println(UserNumberOfFingers + "+" + computerNumber + "=" + sum);

//System.out.println("=" + sum + " that is the sum");

        boolean oddOrEven = sum % 2 == 0;


        if (oddOrEven == true) {

            System.out.println(" is even ");
            if (odds.equals("Even") || odds.equals("even")) {
                System.out.println("that means, " + name + " wins!! :) :) :)");

            } else {
                System.out.println(" I , the mastermind Computer, as predicted,  won");
            }
        }


//another try for odds to work
        else {

            System.out.println("is odd ");
            if (odds.equals("odd") || odds.equals("Odd")) {
                System.out.println("that means, " + name + " wins!! :) ");


            } else {
                System.out.println("That means the computer wins");
                System.out.println("END of Game -----------------");

            }

        }




    }

}