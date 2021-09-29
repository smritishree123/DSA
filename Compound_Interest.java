import java.util.Scanner;
public class Compound_Interest {
    /**     * @param args     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub 
       double Principal_Amount = 0.0;
        double Interest_Rate = 0.0;
        double Time_Period = 0.0;
        double CompoundInterest = 0.0;
        Scanner i = new Scanner(System.in);   
     System.out.print("Enter the Principal Amount : ");
        Principal_Amount = i.nextDouble();
        System.out.print("Enter the Time Period : ");  
      Time_Period = i.nextDouble();
        System.out.print("Enter the Interest Rate : ");
        Interest_Rate = i.nextDouble();
        CompoundInterest = Principal_Amount * Math.pow((1 + Interest_Rate / 100), Time_Period);
        System.out.println("");
        System.out.println("Compound Interest : " + CompoundInterest);  
  }
}