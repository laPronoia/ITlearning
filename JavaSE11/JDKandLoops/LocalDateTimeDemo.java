/*
Local Date Time Object

Using the ISO 8601 format:              Representation of dates and times is an international standard covering the exchange of date- and time-related data
ISO international Stand Orginsaiton:    International Organization for Standardization (ISO; /ˈaɪsoʊ/) is an international standard-setting body composed of representatives from various national standards organizations.

java.times                              part of the java.time package
source:                                 https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html

*/
import java.time.LocalDateTime;                   // import package

public class LocalDateTimeDemo {
  public static void main(String[] args) {

      demo_creatingLcalDateTimeObject();          // call static method
  }

  // create static methed
  public static void demo_creatingLcalDateTimeObject() {

      // get date
      LocalDateTime myDate = LocalDateTime.now();       // object Refference call class.method

      // get date now
      System.out.println("The date right now is: " +myDate);

      // get day of the month
      System.out.println("The day of the month is: " +myDate.getDayOfMonth());

      // get hour
      System.out.println("The hour is: " +myDate.getHour());

      // get 2 day ago
      System.out.println("2 dys ago is: " +myDate.minusDays(2));





  }


}
