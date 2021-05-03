package cz.educanet.praha;

import java.util.Scanner;

public class SumAllNumbers {

    public static int calculate(Scanner scanner) {

        int num = 0;

        while(scanner.hasNext()){
            int i = scanner.nextInt();
            num = num + i;
        }

        return num;
    }

    public static void main(String[] args) {
        System.out.println(calculate(new Scanner(System.in)));
    }
}
