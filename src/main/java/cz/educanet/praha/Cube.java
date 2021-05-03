package cz.educanet.praha;

import java.util.Scanner;

public class Cube {
    public static int sumOfAreasAndVolumes(Scanner scanner) {

        int volume = 0, surface = 0;
        while (scanner.hasNext()){
            int num = scanner.nextInt();
            volume = volume+num*num*num;
            surface = surface+6*num*num;

        }

        return volume + surface;
    }

    public static void main(String[] args) {
        System.out.println(sumOfAreasAndVolumes(new Scanner(System.in)));
    }
}
