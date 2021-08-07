import java.util.*;
public class Prim
{
public static void main(String args[])
{
int num,loop;
boolean flag=false;
Scanner sc=new Scanner(System.in);
System.out.println("Enter any Number : ");
num=sc.nextInt();
for(loop=2;loop<=(num/2);loop++)
{
if(num%loop==0)
{
flag=true;
break;
}
}
if(flag==false)
System.out.println("Number is prime");
else
System.out.println("Number is not prime");
}
} 