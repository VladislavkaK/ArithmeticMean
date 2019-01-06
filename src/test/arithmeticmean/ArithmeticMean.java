package test.arithmeticmean;

import java.util.Scanner;

public class ArithmeticMean {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while(true) {
            int num = sc.nextInt();

            if(num != -1) {
                sum += num;
                counter++;
            }


            if(num == -1) {
                break;
            }
        }

        double total = (double)sum / (double)counter;
        System.out.println(total);
    }
}
