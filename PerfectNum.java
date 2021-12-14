package Day6;
import java.util.Scanner;
public class PerfectNum {


        public static void main(String[] args)
        {
            int n, sum = 0;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter an number:");
            n = s.nextInt();
            for(int i = 1; i < n; i++)
            {
                if(n % i == 0)
                {

                    sum = sum + i;
                    System.out.println("The divisor is"+i);

                }
            }
            if(sum == n)
            {
                System.out.println("The sum of this number is"+sum);

                System.out.println("The number is Perfect");
            }
            else
            {
                System.out.println("The number is not Perfect");
            }
        }
        int divisor(int x)
        {
            return x;
        }
    }

