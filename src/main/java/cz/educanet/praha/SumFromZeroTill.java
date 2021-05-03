package cz.educanet.praha;

import java.util.Scanner;

public class SumFromZeroTill {
    public static int sumFromZeroTill(int max){

        int num = 1 , sum = 0;

        while(num <= max){

            sum = sum + num;

            num++;
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Napis cislo:");
        System.out.println(sumFromZeroTill(sc.nextInt()));
    }
}
