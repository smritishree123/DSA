import java.util.*;
 public class Alpha{
public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter alphabate");
   char ch = sc.next().charAt(0);
   
    if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')

	{
             System.out.println(ch+"Vowel");
         }
           else

             {
              System.out.println(ch+"consonant");
             }
}


}
 