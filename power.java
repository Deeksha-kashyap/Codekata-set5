import java.util.*;
public class PowerOfTwo {
 
    public static void main(String[] args) 
    { 
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the number");
       int n=s.nextInt();
       if (isPower(n))
       {
          System.out.println("Is power of 2");
       } 
       else
       {
           System.out.println("Not power of 2");
       }
    }
    private static boolean isPower(final int n)
    {
       if (n <= 0) 
       {
         return false;
       }
       return (n & (n - 1)) == 0;
    }
}
