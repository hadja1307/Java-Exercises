/*public class power2Param {
    public static int main(String[] args) {


        public static int power2(double base, int exp) {
            result = 1;
            for (int i = 1; i <= exp; i++) {
                result *= base;
            }
            System.out.println("base to the " + exp + " = " + result);
            return result;
        }

    }
}*/ //CODE ABOVE DOES NOT WORK YET

/*
using returns, what to consider:
1) different method header - instead of writing public static VOID,
 you replace the void with the data TYPE e.g. int, String,
 but you can only have one data type on the method header


2) tell the method what to return - e.g. return data;

3) capture the value at the method call e.g. variable = name (parameter);

 1 & 2 summary - To allow a method to return a value you must tell the computer what type of value you are going to return in the method header, and in the body of the method you must at some point include the "return" keyword:

public static ReturnType myMethod(parameters) {
    return ReturnTypeData;
}



SUMMARY OF RETURN FROM A METHOD BELOW **************************************************************************************************

----------------------------------------------------------------------------------------------------------------------------------------
Summarizing what we’ve learned about returning values from a method:

    A method can return one value of a specific data type. You must specifiy that data type in the method header.
    The method must return a value of that data type as the last thing it does. It won’t execute any code after the return statement.
    The calling program must immediately use the value of the method call: store it in a variable, use it in an expression,
     pass it as a parameter to another method. If it doesn’t, the value is essentially lost.


----------------------------------------------------------------------------------------------------------------------------------------


 */