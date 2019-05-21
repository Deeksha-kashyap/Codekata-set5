import java.util.*;
class Sum
{
   public static void main(String[] args)
   {
      Scanner scan=new Scanner(System.in);
      int sum=0;
      System.out.println("Enter the first number");
      int n1=scan.nextInt();
      System.out.println("Enter the second number");
      int n2=scan.nextInt();
      sum=n1+n2;
      System.out.println("Total sum of the number");
      System.out.println(sum);
   }
}
