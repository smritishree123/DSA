import java.util.*;
class ConvertCasePrg {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = "";

        System.out.print("Enter any string: ");
        str = sc.nextLine();

        String lowerCaseString = "", upperCaseString = "";

        lowerCaseString = str.toLowerCase();
        upperCaseString = str.toUpperCase();

        System.out.println("Original String: " + str);
        System.out.println("Lower Case String: " + lowerCaseString);
        System.out.println("Upper Case String: " + upperCaseString);
    }
}