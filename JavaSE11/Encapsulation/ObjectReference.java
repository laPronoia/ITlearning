/*
Passing an Object Reference

Object reference past by value as argument to a method
Object reference is not the same as an Object
Object reference simply provides a reference for asses to the object
Object reference is like a house-address, to find a house


            House myHouse = new House();    // object reference
            PainterMan.paint(myHouse);      // class.method( argument )

Demonstration when you REASSIGN a reference value in a method
note: this class uses the shirt.java class file
*/


public class ObjectReference {
  public static void main (String[] args) {

    // get color code
    Shirt myShirt = new Shirt();                                       // Object Reference
    System.out.println("Shirt color: " +myShirt.getColorCode());       // print Class.method: U

    // set color code
    changeShirtColor(myShirt, 'B');                                    // local method
    System.out.println("Shirt color:  " +myShirt.getColorCode());      // print Class.Method: B
    }


    public static void changeShirtColor(Shirt theShirt, char color) {
        theShirt.setColorCode(color);                                  // class.method = argument
      }
}
