/*
What is Acces Control           Allow us to hide internal data and funcionality in a class throuhg hiding fields and methods from other classes

What is public                  Any other class can access and potentially change the fields value
                                it could be that the field represents data that some type of local
                                or manipulation of the data may be required in order to safely modify the data


interface of a class            What you see when you look up a class in de JDK API documentation.
                                you get just the information you need in order to use the class.
                                Like toe sinngature for public class and any data types of any public fields

internal workings of a class    It is not neccesary to expose them to another class.


                                it could be that the field represents data that some type of locre or
                                manipulation of the data may be required in order to safely modify the data

*/

public class AccessControl {

  // private only accessible inside this class
  private double price = 15.50;                         // cant chage value outside this class

  // public is accessible for anyone how make a instance of a class
  public void setPrice(Customer cust) {                 // get Customer data
    if (cust.hasLoyaltyDiscount()) {                    // check if s/he got Loyalty Discout
      price = price * 0.85;                             // get price * disount
      }


  public static void main(String[] args) {








          System.out.println();

    }
}
