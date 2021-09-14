//Java program to check whether year is Leap year or not.

import java.util.*;

class LeapYear {
    public static void main(String[] s) {
        int year;
        Scanner buf = new Scanner(System.in);

        try {

            System.out.print("Enter year:");
            year = buf.nextInt();

            if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0))
                System.out.println(year + " is a Leap Year.");
            else
                System.out.println(year + " is not a Leap Year.");
        } catch (Exception Ex) {
            System.out.println("Oops ... : " + Ex.toString());
        }

    }
}