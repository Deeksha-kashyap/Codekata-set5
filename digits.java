import java.util.*;
class Digit
{
   public static void main(String[] args)
   {
       Scanner scan=new Scanner(System.in);
       int count=0,m,n,a;
       System.out.println("Enter the number");
        n=scan.nextInt();
       m=n;
       while(n>0)
       {
          n=n/10;
          count++;
       }
       while(m>0)
       {
          a=m%10;
           System.out.println("Digits at position "+count+":"+a);
          m=m/10;
          count--;
       }
   }
}
