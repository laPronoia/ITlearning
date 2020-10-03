/*
Modulus Operations
preform modulus operation on a int (get the remainder)
*/


public class ModulusDemo {
  public static void main(String[] args) {

      int num1 = 31;
      int num2 = 6;

      System.out.print(num1 / num2); // = 5

      int mod = num1 % num2; // 31/6
      System.out.println(mod); // = 1

      System.out.println();

      int[] values = { 121, 45, 1, 8374, 34, 555, 999, 1234, 973, 7 };

      for(int i : values) {     // loop list
        if(i % 3 == 0) {        // if even
          System.out.println(i +" / 3 = " +(i/3));
        }
      }
  }
}
