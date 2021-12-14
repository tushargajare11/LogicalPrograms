package Day6;
import java.util.Scanner;


public class Fibonacci {


        // Function to print N Fibonacci Number
        static void Fibonacci(int N)
        {
            int num1 = 0, num2 = 1;

            int counter = 0;

            // Iterate till counter is N
            while (counter < N) {

                // Print the number
                System.out.print(num1 + " ");

                // Swap
                int num3 = num2 + num1;
                num1 = num2;
                num2 = num3;
                counter = counter + 1;
            }
        }

        public static void main(String args[])
        {
            // Given Number N
            Scanner sc =new Scanner(System.in);
            int N = sc.nextInt();

            // Function Call
            Fibonacci(N);
        }



    }


