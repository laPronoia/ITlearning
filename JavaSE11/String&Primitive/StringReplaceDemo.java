/*
Performing a String Replace
*/

public class StringReplaceDemo {
  public static void main(String[] args) {

    String phrase = "the cat and the dog";

    String result = phrase.replace("the", "a");     // replace "the" with "a"   a cat and a dog"
    //result = result.replace("a", "the");            // replace "a" with "the"

    System.out.println(result);

    System.out.println();

    String sentence = "This is a sentence!What about a question?";
    result = sentence.replaceAll("\\p{Punct}", " ");    // "\\p{Punct}" looks for any punctiation and replace it with ""
    System.out.println(result);

    for(String word : result.split("\\s+")) { // spit result, on any white space character \\s+
      System.out.println(word);
    }
  }
}
