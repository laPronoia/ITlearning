public class OverloadingConstructorsExample {

    // Fields
    private String description = "--description required--";
    private char colorCode = 'U';
    private double price = 0.0;

    // Constructer 1
    public OverloadingConstructorsExample(char colorCode, double price) {
      setColorCode(colorCode);
      setPrice(price);
    }

    // Constrcuter 2
    public OverloadingConstructorsExample(char colorCode, double price, String description) {
      this(colorCode, price);           //this(use the constructor above) <--------------------------------------------------
      setDescription(description);      // execute method
    }







    // public set method
    public void setDescription(String newDescription) {
      description = newDescription;
    }

    //public set method
    public void setPrice(double newPrice) {
        if(newPrice < 0.00) {
            System.out.println("price must not be negative.");
        }
        price = newPrice;
    }

     public char getColorCode() {
        return colorCode;
     }

     public void setColorCode(char newCode) {

             if(newCode == 'R' ) {
               colorCode = newCode;
               return;
             }

             if(newCode == 'G' ) {
               colorCode = newCode;
               return;
             }

             if(newCode == 'B' ) {
               colorCode = newCode;
               return;
             }
             // If above condition to apply
             System.out.println("Invalid colorCode.User R, G, or B");
           }


      public void display() {
        System.out.println("Shirt: [" +description + ", " +colorCode
                                      +", " +price +"]");

    }
  }
