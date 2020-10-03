/*
String Split
*/

public class StringSplitDemo {
  public static void main(String[] args) {
    String sentence = "This is a sentence";
    String phone = "(555)-234-9876";
    String url = "https://oracle.com";

    for(String word : sentence.split("\\s+")) {  // split each word, at each space
      System.out.println(word);                  // "\\s+") removes all space even double spaces
    }

    System.out.println();

    for(String part : phone.split("\\D+")) { // split each word, at each -
      System.out.println(part);              // \\D+ remove all none digged characters
    }

    System.out.println();

    String[] urlParts = url.split("://");
    if(urlParts.length > 1) {
      System.out.println(urlParts[0]);
    } else {
        System.ot.println("http");
    }
  }
}
