package cz.educanet.praha;

import java.util.Scanner;

public class SumSumsOfEvenAndMultipleOfOdd {

    public static int sumSumsOfEvenAndMultipleOfOdd(Scanner scanner){

    int num = 0;
    int sum = 1;

        while(scanner.hasNext()){
        int i = scanner.nextInt();

        if (i%2 == 0){
            num = num + i;
        }else {
            sum = sum * i;
        }
    }
        return num + sum;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number separated by a new line");
        System.out.println(sumSumsOfEvenAndMultipleOfOdd(sc));
    }
}
