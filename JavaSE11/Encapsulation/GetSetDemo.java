/*
Example of Encapulation, input value check
R is right condiont
X is wrong condition
*/

public class GetSetDemo {

public static void main(String[] args) {

      // instance object
     GetSetExample theShirt = new GetSetExample();

      // instance method
     theShirt.setColorCode('R');
     System.out.println("Color Code: " +theShirt.getColorCode());

     // instance method
     theShirt.setColorCode('X');
     System.out.println("Color Code: " +theShirt.getColorCode());
     }
 }
