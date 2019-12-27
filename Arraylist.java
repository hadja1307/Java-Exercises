import java.util.ArrayList;
        public class Arraylist {

    /*
    * An ArrayList is an implementation of Java's "List" type.
    * Lists can grow and shrink in size and they allow you to add elements at any index and will automatically reorganize the other elements accordingly.
    *how to ArrayList?... ArrayList<dataType> name = new ArrayList<dataType>();
    *e.g. ArrayList<String> name = new ArrayList<String>();
    *However, ArrayLists require that you give them an object as a data type-
    *  so how do you store primitives? You have to pass them in as an object.
    *
    *A wrapper class is the way that Java allows you to use primitives when an object is required.
    *  They are the simplest possible "wrapper" around a primitive data type to make it into an object.
    * primitive: int, boolean, double, char
    * wrapper classes: Integer, Boolean, Double, Character
    *
    *
    *
    *construct ArrayList: e.g. ArrayList<Integer> name = new ArrayList<Integer>();
    * Storing values in ArrayList we do names.add("linda");
    * Retrieving value in ArrayList String s = names.get(0);
    *
    *ways to store values in ArrayList include:
    *
    * add(value) ,   e.g. myList.add("hello")  adds the given value to the end of the list
    *
    * add(index, value) ,  e.g. myList.add(0, "hello") adds value at specified index, or later towards the back of the list
    *
    * clear()   ,  e.g. myList.clear() ; clears
    *
    * indexOf(value) ,   e.g. myList.indexOf("hi") ; returns the first index of where the given value is found , will return -1 if the value is not in the list
    *
    * get(index) ,   e.g. myList.get(0) ; returns the current value stored at the given index
    *
    * remove(index),    e.g. myList.remove(1) ; removes value at index
    *
    * set(index, value),   e.g. myList.set(1, "see you later") ; // replaces the current value at the given index with the given value
    *
    * size() ,    e.g. myList.size() ; gets the size
    *
    * toString(),     e.g. myList.toString()  displays the string
    *
    *contains(value),  e.g. myList.contains("x") return true if given value is found somewhere in the list, false otherwise
    *
    * */


    public static void main (String[] args) {

        ArrayList<Integer> myList = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i < myList.size(); i++) {
            sum += myList.get(i);
            System.out.println(sum);
        }


        int staticSize = myList.size();
        for (int i = 0; i < staticSize; i++) {
            if (myList.get(i) == 0) {
                myList.remove(i);
                staticSize--;
            } else if (myList.get(i) == -1) {
                myList.add(-1);
                staticSize++;

                System.out.println(myList.toString());
            }
        }


    }
}
