/*

*/

public class StringEqualityDemo {
  public static void main(String[] args) {

        String name1 = "Fred Smith";
        String name2 = "fred Smith";

        System.out.println(name1);
        System.out.println(name2);

        if(name1.equals(name2)) {                               // compare function
              System.out.println(".equals is true");
        } else {
              System.out.println(".equals is false");
        }

        if(name1.equalsIgnoreCase(name2)) {                     // compare function inconre case
              System.out.println(".equalsIgnoreCase is true");
        } else {
              System.out.println(".equalsIgnoreCase is false");
        }

        if(name1 == name2) {                                  // compare condition
              System.out.println("== is true");
        } else {
              System.out.println("== is false");
        }
  }
}
