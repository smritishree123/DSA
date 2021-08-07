import java.util.*;
class Palindrome
{
public static void main(String agrs[])
{
int temp,s=0,r;
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number:");
n=sc.nextInt();
temp=n;
while(n>0)
{
r=n%10;
s=(s*10)+r;
n=n/10;

}
if(temp==s)
{
System.out.println("Number is palindrome");
}
else
{
System.out.println("Number is not palindrome");
}
}
}
