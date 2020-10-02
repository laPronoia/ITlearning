/*

where to use Static      The static modifier is applied to a method or variable
                          . Belong to the claas and is shared by all object of the class
                          . is not unique to an object instance
                          . Can be acces withoud instantiating the class

what's is the difference  - a static vaeriable s shared by all objects in a class
                          - an instance varialbe is unique to an individual object

when to use static        - Perfoming the operation on an indivdual object
                          or associating the variable with a specific object
                          type is not important???
                          - Accessing the variable or method before instatiating (Instantiate in Java means to call a constructor of a Class which creates an an instance or object, of the type of that Class. Instantiation allocates the initial memory for the object and returns a reference.)
                          an object is important???
                          - The method or variable does not logically belong to
                          an object, but possible belongs to a utility class,    (Utility Class, also known as Helper class, is a class, which contains just static methods, it is stateless and cannot be instantiated. It contains a bunch of related methods, so they can be reused across the application)
                          such as math class, inclused in the java API
                          - Using constatn values (such as Math.PI)              (A constant is a variable whose value cannot change once it has been assigned.)



*/


// Static setup ------------------------------------------------------------------
public class MyStatic {
    public static String mSmall = "Men's Small";        // static variable
    public static String mMedium = "Men's Medium";      // static variable
    public static String mLarge = "Men's Large";        // static variable


    public static String listAllSizes() {               // static method
        return  mSmall +" , " +mMedium + ", " +mLarge;  // returns a concatenation (fusion) of all static variables
    }
}
