import java.util.*;
import java.lang.Math;
class Armstrong
{
    public static void main(String[] args)
    {
       int num=153,rem,m,result=0;
       m=num;
       while(m!=0)
       {
          rem=m%10;
          result+=Math.pow(rem,3);
          m/=10;
       }
       if(result==num)
       {
          System.out.println(num+ "is a armstrong");
       }
       else
       {
          System.out.println(num+ "is not a armstrong");
       }
    }
}
