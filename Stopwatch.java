package Day6;
import java.util.Scanner;

public class Stopwatch {


        public void test(){
            int num = 0;
            for(int i=0; i<=50; i++){
                num =num+i;
                System.out.print(num+", ");
            }
        }
        public static void main(String args[]){
            //Start time
            long begin = System.currentTimeMillis();
            //Starting the watch
            new Stopwatch().test();
            //End time
            long end = System.currentTimeMillis();
            long time = end-begin;
            System.out.println();
            System.out.println("Elapsed Time: "+time +" milli seconds");
        }
    }


