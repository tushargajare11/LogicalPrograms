package Day6;
import java.util.Scanner;


public class PrimeNum {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println(" enter a  number:");

            int num = sc.nextInt();
            boolean flag = false;
            for (int i = 2; i <= num / 2; ++i) {
                // condition for non prime number
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                System.out.println(num + " is a prime number.");
            else
                System.out.println(num + " is not a prime number.");
        }



    }


