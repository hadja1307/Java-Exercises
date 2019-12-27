import java.util.Scanner;
public class LearnScanner {
public static void main (String[] arg) {
    /* the line below does the following: we create our own scanner object with a name
    * we define e.g. "input" and tell it to read text from System.in*/
    Scanner input = new Scanner(System.in);
    System.out.println("hello, welcome");
    System.out.println("what is your name?");
    String name = input.next();
    System.out.println("Hi there " + name);
/*we tell our object to get the next complete line of input
 from the user into a string variable */

    System.out.println("what is your age?");
    int age = input.nextInt();
    System.out.println("Hi there, your name and age is \n " + name + "\n" + age);


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
