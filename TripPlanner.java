
import java.util.Scanner;

public class TripPlanner {
    public static void main(String[] arg) {
        /* the line below does the following: we create our own scanner object with a name
         * we define e.g. "input" and tell it to read text from System.in*/
        Scanner input = new Scanner(System.in);
        System.out.println("hello, welcome to Vacation Planner!");
        System.out.print("what is your name?");
        String name = input.nextLine();
        System.out.print("Nice to meet you " + name + " , where are you traveling to?");

/*we tell our object to get the next complete line of input
 from the user into a string variable */
        String dest = input.nextLine();
        System.out.println("Fantastic!! " + dest + "  , sounds like a wonderful trip");
        System.out.println("*******");


        basics();
        time();
        area();

    }


    public static void basics() {
        //basics();
        Scanner input = new Scanner(System.in);


        System.out.print("how many days are you travelling? ");

        int days = input.nextInt();
        int hourTravel = days * 60;
        int minTravel = hourTravel * 60;
        System.out.print("how much money in GBP are you planning to spend on your trip? ");
        double budget = input.nextDouble();
        double dailyBudget = budget / hourTravel;
        System.out.print("what is the three letter currency symbol for your travel destination?");
        String currency = input.next();
        System.out.print("how many" + currency + "are there in GBP?");
        double yChange = input.nextDouble();
        double currencyBudget = budget * yChange;
        double dailycurrencyBudget = currencyBudget / (double) days;
        System.out.println("\n If you are travelling for " + days +
                "that is the same as " + hourTravel + "hours or "
                + minTravel + "minutes");

        System.out.println("if you are going to spend £" + budget +
                "GBP that means you can spend up to £" + dailyBudget + "GBP");
        System.out.println("your total budget in " + currency + ", which per day is"
                + dailycurrencyBudget + currency + "\n*********");

    }

    public static void time() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and your destination?");
        int Distance = input.nextInt();
        int localTime = Distance + 12;
        System.out.print("that means that when it's midnight at home it will be " + Distance +
                ":00 in your travel destination\\nand when it is noon at home it will be"
                + localTime + ":00\\n***************\\n\");");

    }


    public static void area() {
        Scanner input = new Scanner(System.in);
        {
            System.out.print("What is the square area of your destination country in km2? ");
            int size = input.nextInt();
            double sizeMiles = size * 0.3861;
            System.out.print("In miles2 that is " + sizeMiles + "\n************");


        }

    }
}






/* overall the code above will do the following:
 * it creates a new scanner and allows the user to type in any string.
 * when java gets to the line "input.next()" it pauses and waits for the user
 *  to type something into the console and hit "enter"
 *  then it picks bak up where it left off.
 * in this scenario, you can type in any string without white space and it will be stored
 * in the variables called "name" and "age".
 * */
