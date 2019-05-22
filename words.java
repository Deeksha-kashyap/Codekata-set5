import java.util.*;
class Words
{
  public void digits(int n, String ch)
	{
		String one[] = { " ", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten",
				" Eleven", " Twelve", " Thirteen", " Fourteen", "Fifteen", " Sixteen", " Seventeen", " Eighteen",
				" Nineteen" };
 
		String ten[] = { " ", " ", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", "Seventy", " Eighty", " Ninety" };
 
		if (n > 19)
		{
			System.out.print(ten[n / 10] + " " + one[n % 10]);
		}
		else
		{
			System.out.print(one[n]);
		}
		if (n > 0)
			System.out.print(ch);
	}
 
	public static void main(String[] args)
	{
		
		int n;
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the number");
    n=scan.nextInt();
		System.out.print(n);
		if (n <= 0)
		{
			System.out.println("Enter numbers greater than 0");
		}
		else
		{
			Words a = new Words();
			a.digits((n / 1000000000), " Hundred");
			a.digits((n / 10000000) % 100, " crore");
			a.digits(((n / 100000) % 100), " lakh");
			a.digits(((n / 1000) % 100), " thousand");
			a.digits(((n / 100) % 10), " hundred");
			a.digits((n % 100), " ");
		}
}
}
