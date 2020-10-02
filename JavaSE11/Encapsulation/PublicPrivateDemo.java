/*
*/

public class PublicPrivateDemo {
    public static void main(String[] args) {

      Customer cust = new Customer();                             // Instance Object

      PublicPrivateExample shirt = new PublicPrivateExample();     // Instance Object
      System.out.println(shirt.getPrice());                       // get old price: 15.50

      // shirt.price = 10.00;                                     // this code wound compile, because it is a private variable
      shirt.setPrice(10.00, cust);                                // This code will change the price, if the customer got loyaltyDiscount

      System.out.println(shirt.getPrice());                       //print new price: 8.50
      }
}
