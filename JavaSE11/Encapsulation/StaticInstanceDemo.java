/*
example a executing a static method
and a instance method getting a static method assigned
check MyStatic & MyInstance Document
*/

public class StaticInstanceDemo {

    public static void main(String[] args) {

          // static method
          System.out.println(MyStatic.listAllSizes());      // print static method

          // instance object
          MyInstance item = new MyInstance();               // instance object

          // instance method
          item.setSize(MyStatic.mSmall);                    // instance method( input_StaticMethod.variable )
          System.out.println(item.size);                    // print instance method

          //instance method
          item.setSize(MyStatic.mLarge);                    // instance method( input_StaticMethod.variable )
          System.out.println(item.size);                    // print instance method
    }

}
