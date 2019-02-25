import java.util.*;
public class LargestNum
{
    public static void main(String[] args)
    {
        int num1,num2,num3;
        System.out.println("Enter three numbers");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        if(num1 >= num2)
        {
            if(num1 >= num3)
                System.out.print(num1 + " is the largest number");
                else
                System.out.print(num3 + " is the largest number");
        }
        else
        {
            if(num2 >= num3)
               System.out.print(num2 + " is the largest number");
               else
               System.out.print(num3 + " is the largest number");
        }
    }
}
