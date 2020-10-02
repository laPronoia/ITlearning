/*
- its recomanded that all field of a class are Private.
- 

*/

public class PublicPrivateExample {

  // private variable
  private double price = 15.50;     // can't change value outside this class

    // public method
    public void setPrice(double price, Customer cust) {     // chagnge the price
          this.price = price;       // private price = parameter price
          adjustPrice(cust);        // get/execute private method
    }

    // private method
    private void adjustPrice(Customer cust) {   // only the implementation can call this method
          if(cust.hasLoyaltyDiscount()) {       // check if customr has Loyalty Discount
                price = price * 0.85;           // price - discount
          }
    }

    // public method
    public String getPrice() {
          return String.format("$%.2f", price); // return $ sign +value
    }
}
