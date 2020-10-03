/*
Lexicographically Comparisons to order Strings

In mathematics, the lexicographic or lexicographical order
(also known as lexical order, dictionary order, alphabetical order or lexicographic(al) product)
is a generalization of the way words are alphabetically ordered based on the
alphabetical order of their component letters.


compareToIgnoreCase
equal:               if name1 & name2 are equal: ouput 0
less than:           if name1 is lexicographically less than name2
greater than;        if name1 is lexicographically greate tan name2

Alphabatlical order   Fred becomes before Sam
*/

public class LexicographicallyDemo {

  public static void main(String[] args) {

        String name1 = "Smith, Sam";
        String name2 = "Smith, Fred";

        System.out.println(name1.compareTo(name2)); // -19
        System.out.println(name1.compareToIgnoreCase(name2)); // 13

        if(name1.compareTo(name2) <= 0) {
              System.out.println(name1);
              System.out.println(name2);
        } else {
              System.out.println(name2);
              System.out.println(name1);
        }
  }
}
