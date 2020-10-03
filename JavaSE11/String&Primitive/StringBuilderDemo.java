/*
StringBuilder to Concatenate

mutable               can be changed in place
data manipulsation    append, delete, replace, insert
preformens            does not create new object in memory

*/

public class StringBuilderDemo {
  public static void main(String[] args) {

    String[] words = { "This", "is", "a", "sentence" };   // array
    StringBuilder mySB = new StringBuilder();             // object reference, empty string

    for(String word : words) {                            // for loop
      mySB.append(word);                               // insert index
      mySB.append(" ");                                // second insert space

      // String in reverse
      //mySB.insert(0, word);                               // insert index
      //mySB.insert(0, " ");                                // second insert space
    }

    System.out.println(mySB);
  }
}
