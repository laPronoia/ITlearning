

public class Shirt {

  // private variable, can only be changed inside this class
  private char colorCode = 'U';

  // public method: "GET the colorCode value"   - can be used outside this class
  public char getColorCode() {
      return colorCode;
  }

  // public method: "Set the colorCode value"   - can be used outside this class
  public void setColorCode(char newCode) { // this is a void, so it does not return a value

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
 }
