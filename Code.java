import java.util.*;
public class Code
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
int a,b,add;
int n=sc.nextInt();
System.out.print("Enter first number: ");        
a = sc.nextInt();        
System.out.print("Enter second number: ");        
b = sc.nextInt();        
add = a + b;        
System.out.println("Addition is: " + add);
if(n%2==0)
{
System.out.println("Even number");
for(int i=1;i<=10;i++)
{
System.out.println(n+"*"+i+"="+n*i);
}
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