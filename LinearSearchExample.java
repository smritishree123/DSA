import java.util.Scanner;


  public static void main(String args[])
   {
   int counter, num, item, array[];
     Scanner input = new Scanner(System.in);
      System.out.println("Enter number of elements:");
      num = input.nextInt(); 

 
       for (counter = 0; counter < num; counter++)
       array[counter] = input.nextInt();
      System.out.println("Enter the search value:");



     if (array[counter] == item) 
      {
         System.out.println(item+" is present at location "+(counter+1));

       }
    }
   if (counter == num)
   System.out.println(item + " doesn't exist in array.");
  }
