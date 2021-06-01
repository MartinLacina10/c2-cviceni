package cz.educanet.praha;

import java.util.Scanner;

public class Average {
    public static void main(String arg[]){

            int n;double res=0;

            Scanner sc=new Scanner(System.in);

            System.out.println("Napis z kolika cisel chces prumer");

            n=sc.nextInt();

            int num[]=new int[n];

            System.out.println("napis   "+n+"  cisla");

            for(int i=0;i<n;i++)
                num[i]=sc.nextInt();

            for(int i=0;i<n;i++)
                res =res+num[i];

            System.out.println("prumer="+res/n);

        }

    }

    public static double average(Scanner scanner) {
        return 1;
    }


    public static void main(String[] args) {
        System.out.println(average(new Scanner(System.in)));
    }
}
