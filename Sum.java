import java.util.*;
public class Sum
{
public static void main(String args[])
{
int a,b,sum;
Scanner sc=new Scanner(System.in);
System.out.println("Enter No: ");
a=sc.nextInt();
while(a>sum)
{
a = b%10;
sum=sum+a;
b = a/10;
}
System.out.println("Sum : "+sum);
}
}