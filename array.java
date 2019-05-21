public class HighestArray
{
        public static void main(String[] args) 
        {
                int numbers[] = new int[]{8,3,6,2,7,5,1,6,4,9,2,1};
                int lowest = numbers[0];
                int highest = numbers[0];
               
                for(int i=1; i< numbers.length; i++)
                {
                        if(numbers[i] > highest)
                                highest = numbers[i];
                        else if (numbers[i] < lowest)
                                lowest = numbers[i];
                       
                }
               
                System.out.println("Highest Number is : " + highest);
                System.out.println("lowest Number is : " + lowest);
        }
}
