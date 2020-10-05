/*
Print dates
Often you need to format date Ojbjects to be able to display themin a
way that suits our application needs.

Source:     https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

Enum Format FormatStyle
There are 4 levels details: Full, Long, Medium & Short
Source: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/format/FormatStyle.html


*/

import java.time.LocalDateTime;                   // import package
import java.time.chrono.JapaneseDate;
import java.time.chrono.ThaiBuddhistDate;

import java.time.format.*;



public class PrintingDatesDemo {
  public static void main(String[] args) {

    demo_usingAlternateCalendars();          // call static method

  }


  // create static methed
  public static void demo_usingAlternateCalendars() {

      LocalDateTime myDate = LocalDateTime.now();       // object Refference call class.method
      // Standart Calender date
      System.out.println("The Gregorian date right now is: " +myDate); // Oct 5, 2020, 12:05:25 PM



      String myDate_isoString = myDate.format(DateTimeFormatter.ISO_DATE_TIME); // Refference.package(class.PredefinedFormat)
      // Standart Calender date
      System.out.println("The Gregorian date right now is: " +myDate_isoString); // Oct 5, 2020, 12:05:25 PM



      String myDate_mediumString = myDate.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)); // Refference.package(class.Method(method.EnumFormatStyle))
      // Standart Calender date
      System.out.println("The Gregorian date right now is: " +myDate_mediumString); // Oct 5, 2020, 12:05:25 PM

    }
}
