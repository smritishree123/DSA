import java.util.*;

{
    public static void main(String[] s)
 {
     Scanner sc = new Scanner(System.in);

       a = sc.nextInt();
     System.out.print("Enter value of a: ");
       b = sc.nextInt();
     System.out.println("Before swapping - a: " + a + ", b: " + b);
       int temp;
     temp = a;
        a = b;
        b = temp;
      System.out.println("After swapping  - a: " + a + ", b: " + b);

}