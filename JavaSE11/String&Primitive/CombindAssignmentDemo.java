/*
Combined Assignment
*/

public class CombindAssignmentDemo {
  public static void main(String[] args) {
    int a = 6;
    int b = 2;

    System.out.print(a +", " +b); // 6, 2

    a += b; // override a
    System.out.println(a); // 8

    a -= b; // override a
    System.out.println(a); // 4

    a *= b; // override a
    System.out.println(a); // 12

    a /= b; // override a
    System.out.println(a); // 3

    a %= b; // override a
    System.out.println(a); // 0
  }
}
