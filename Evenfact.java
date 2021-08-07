import java.util.*;
public class Evenf
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter a number:");
int n=sc.next.Int();
int a, b, add;
System.out.print("Enter first number: ");       
 a = sc.nextInt();       
 System.out.print("Enter second number: ");      
  b = sc.nextInt();  
  add = a + b;       
 System.out.println("Addition is: " + add);
    }
if(n%2==0)
{
for(int i=1;i<=10;i++)
{
System.out.println("if it is even then print table"+n*i);
}
else
{
int fact=1;
while(n>0)
{
fact=fact*n;
n--;
}
System.out.println("odd number");
System.out.println(fact);
}
}
}
}