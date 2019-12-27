
import java.util.Scanner;

public class myVacation { public static void main(String[] args) { /*Scanner input = new Scanner(System.in);

System.out.println("Welcome to the vacation planner!");

System.out.print("What is your name? ");
String name = input.nextLine();
System.out.print("Nice to meet you, " + name + ", where are you travelling to? ");
String place = input.nextLine();
System.out.println("Great! " + place + " sounds like a great trip!\n*************\n");
*/
    intro();
    basics();
    chronological();
    area();

}

    public static void intro() {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the vacation planner!");

        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Nice to meet you, " + name + ", where are you travelling to? ");
        String place = input.nextLine();
        System.out.println("Great! " + place + " sounds like a great trip!\n*************\n");

    }

    public static void basics() { Scanner input = new Scanner(System.in);

        System.out.print("How many days are you travelling? ");
        int travDays = input.nextInt();
        int hoursTrav = travDays*60;
        int minutesTrav = hoursTrav*60;
        System.out.print("How much money in USD are you planning to spend on your trip? ");
        double budget = input.nextDouble();
        double dailyBudget = budget / travDays;
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String curr = input.next();
        System.out.print("How many " + curr + " are there in a USD? ");
        double xChange = input.nextDouble();
        double currBudget = budget * xChange;
        double dailyCurrBudget = currBudget / (double)travDays;
        System.out.println("\nIf you are travelling for " + travDays + "that is the same as " + hoursTrav + " hours or " + minutesTrav +  " minutes");
        System.out.println("If you are going to spend $" + budget + " USD that means per day you can spend up to $" + dailyBudget + " USD");
        System.out.println("Your total bidget in " + curr + " is " + currBudget + " " + curr + ", which per day is " + dailyCurrBudget + curr + "\n*********\n");

    }

    public static void chronological() { Scanner input = new Scanner(System.in);

        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        int zoneDist = input.nextInt();
        int localTime = zoneDist + 12;
        System.out.print("That means that when it's midnight at home it will be " + zoneDist + ":00 in your travel destination\nand when it is noon at home it will be " + localTime + ":00\n***************\n");

    }

    public static void area() { Scanner input = new Scanner(System.in);

        System.out.print("What is the square area of your destination country in km2? ");
        int size = input.nextInt();
        double sizeMiles = size *0.3861;
        System.out.print("In miles2 that is " + sizeMiles + "\n************");

    } }