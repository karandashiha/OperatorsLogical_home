package app;

import java.util.Scanner;


public class Revenue {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.print("Input value of income: ");
        double income= sc.nextInt();

        double res;


        if (income <= 10000) {
            res = income * 0.025;
        } else if (income <= 25000) {
            res = 10000 * 0.025 + (income - 10000) * 0.043;
        } else {
            res = 10000 * 0.025 + 15000 * 0.043 + (income - 25000) * 0.067;
        }

        System.out.printf("%n Result is %.2f",res);
        sc.close();
    }
}

