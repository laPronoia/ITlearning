/*
Passing the args Array of the Main method
We can apply a argument in the commandline (terminal),
to parse into the program

args        if the starting point of java to compile
args        is a Array of Strings, we can only parse string in the commandline

STEP:
            1. compile file in the terminal
            2. run class + add String0 and String1

                  java ParsingArgsArrayDemo Leleia Lelena

            3. output:

                  My name is: Leleia Lelena

*/

public class ParsingArgsArrayDemo {

  public static void main(String[] args) {

      String first = args[0]; // get first element of the args array

      String second = args[1]; // get second element of the args array

      System.out.println("My name is: " +first +" " +second);

  }
}
