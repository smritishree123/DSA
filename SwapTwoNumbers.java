import java.util.*;
class SwapTwoNumbers 
{
    public static void main(String[] s)
 {        int a, b;   
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter value of a: ");  
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
}