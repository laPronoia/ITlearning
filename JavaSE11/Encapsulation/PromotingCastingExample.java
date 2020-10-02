/*
What is a promotion?      In some circumstances, the cimpiler changes the type
                          of a variable to a type that supports a larger size value

How is it usefull         avoid truncated values

What is truncated

what is type casting?     lower the range of a value, chopping it down to smaller
                          amount of memory by changing the type (like: long to int)
*/

public class PromotingCastingExample {

  public static void main(String[] args) {

  // promotion
  int i = 3;        // direct assignment
  long l = i;       // promote int to a large value (automaticly)
  double d = 2;     // promote int to a double (automaticly)



  //avoid truncated
  // num1 * num2 = 3.7 billion, which is beyond the scope of the type taht are being multiplied
  int num1 = 55555;
  //int num2 = 66666;             // convert second value to a long so num3 wound truncate
  long num2 = 66666;

  long num3 = num1 * num2;        // to avoid truncate, promote the awnser to a long type
  System.out.println(num3);



  //casting
  int intFromDouble = (int)d;     // casting double to int
  int intFromlong = (int)l;       // casting long to int

  System.out.println(" int from double " +intFromDouble);
  System.out.println(" int from long " +intFromlong);
}
}
