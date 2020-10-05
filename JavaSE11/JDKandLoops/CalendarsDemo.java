/*

Gregorian Calender:     The Gregorian calendar is the calendar used in most of the world.[1] It is named after Pope Gregory XIII, who introduced it in October 1582.
                        The calendar spaces leap years to make its average year 365.2425 days long, approximating the 365.2422-day tropical year that is determined by the Earth's revolution around the Sun. The rule for leap years is

*/

import java.time.LocalDateTime;                   // import package
import java.time.chrono.JapaneseDate;
import java.time.chrono.ThaiBuddhistDate;


public class CalendarsDemo {
  public static void main(String[] args) {

          demo_usingAlternateCalendars();          // call static method
      }


      // create static methed
      public static void demo_usingAlternateCalendars() {

        LocalDateTime myDate = LocalDateTime.now();       // object Refference call class.method
        // Standart Calender date
        System.out.println("The Gregorian date right now is: " +myDate);





        JapaneseDate jDate = JapaneseDate.from(myDate);     // get argument (myDate) to convert date to Japanese Date
        //   Japanese Calender date
        System.out.println("The Japanese date right now is: " +jDate);


        ThaiBuddhistDate tDate = ThaiBuddhistDate.from(myDate);      // get argument (myDate) to convert date to ThaiBuddhist Date
        //   Japanese Calender date
        System.out.println("The Thai Buddhist date right now is: " +tDate);


        System.out.println();

        
        System.out.println("The Japanese date right now is: " +JapaneseDate.now()); // call class.method
        System.out.println("The Thai Buddhist date right now is: " +ThaiBuddhistDate.now()); // call class.method





  }
}
