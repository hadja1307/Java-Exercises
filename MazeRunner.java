import java.util.*;
public class MazeRunner {
    public static void main(String[] args) {
        Maze myMap = new Maze();
        introduction(); // method of intro
        myMap.printMap();
        userMove(); // method of user move

        myMap.canIMoveRight(); // Returns true if the space to the right is free, false if there is a wall
        myMap.canIMoveLeft(); // Returns true if the space to the left is free, false if there is a wall
        myMap.canIMoveUp() ;// Returns true if the space above is free, false if there is a wall
        myMap.canIMoveDown() ;// Returns true if the space below is free, false if there is a wall
    }

    public static void introduction() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Maze Runner!");
        System.out.println("Here is your current position: ");

    }

    public static void userMove() {

        Scanner input = new Scanner(System.in);
        System.out.println("what direction would you like to move? ( R, L, U, D )");

        String dir = input.nextLine(); //input for direction for the user

        while (!dir.equals("R") || !dir.equals("r") || !dir.equals("L") || !dir.equals("l") || !dir.equals("U") || !dir.equals("u") || !dir.equals("D") || !dir.equals("d")) {
            System.out.println("You have not type any direction with the required criteria [R, L, U, D] , please try again");

            dir = input.nextLine();

            if (dir.equals("R") || dir.equals("r") || dir.equals("L") || dir.equals("l") || dir.equals("U") || dir.equals("u") || dir.equals("D") || dir.equals("d")) {
                System.out.println("Great... now lets move ");


                if (dir.equals("")) {
                    System.out.println("you have not typed anything please try again");
                    dir = input.nextLine();

                }

            }

        }

    }




    /*public static String myMap.canIMoveRight() { // Returns true if the space to the right is free, false if there is a wall

        /*if (myMap.canIMoveRight("R") = true) {
            myMap.MoveRight();
            else {
                return myMap.printMap();
            }
        }*/


    }/*



            myMap.canIMoveLeft() // Returns true if the space to the left is free, false if there is a wall
            myMap.canIMoveUp() // Returns true if the space above is free, false if there is a wall
            myMap.canIMoveDown() // Returns true if the space below is free, false if there is a wall

}


*/