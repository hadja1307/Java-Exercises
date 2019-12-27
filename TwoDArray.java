public class TwoDArray {


    /*
    *2D Array is basically an array inside of an Array, array of arrays
    * 2d array creates a grid-like-structure
    * syntax of 2d Array
    * type [] [] name = new type[row][col];
    * e.g. int [][] myGrid = new int [8][6];
    * 'type' is the data type e.g. int, double, char etc., all have to be the same datatype
    * '[][]' means arrays of interArrays
    * '[row] [col]' each will have a value i.e number
    * java doesn't understand row or col, but we use it for better human understanding
    *
    *
    * you will need 2 loop to loop over a 2d array
    *outer for loop will run over the name of the array.length, just like normal array
    * the inner for loop will run over each individual array, at each row index, known as columns [col]
    *
    *  ACCESS AN ELEMENT in 2D ARRAY
    * name[row][col]
    * e.g. myGrid[1][4] = 7;
    *
     */

    public static void main (String[] args) {

        int count = 0;
        int [][] myArr = new int[5][6];
        for (int row = 0; row < myArr.length; row++) {
            for (int col = 0; col < myArr[row].length; row++) {
                myArr[row][col] = count;
                count++;
                //row and col can be changed to any name/ variable name
            }

        }

//dataType[][] name = new dataType[numOfArrays][capacityOfEachArray];
        int counts = 0;
        String [][] myArray = new String[3][3];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; i++) {
                myArray[i][j] = "["+ i + "," + j+"]";
                counts++;
                System.out.println(myArray.length);
                //row and col can be changed to any name/ variable name
            }

        }

    }
}
