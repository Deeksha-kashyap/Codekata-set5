import java.util.*;
class Sum
{
   static int digitsum(int n)
   {
      int sum=0;
      while(n!=0)
      {
        sum=sum+n%10;
        n=n/10;
      }
      return sum;
   }
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      int n;
      System.out.println("Enter the number");
      n=sc.nextInt();
      System.out.println(digitsum(n));
   }
}
