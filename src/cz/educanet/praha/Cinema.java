package cz.educanet.praha;

import java.util.Scanner;

public class Cinema {

    public static int freeSpaces(String[] namesOnSeat, Scanner sc) {
        String input;
        boolean validSeat = false;
        int x = 0;
        int order = -1;
        while(sc.hasNext()){
            input = sc.nextLine();
            if(input.matches("[0-9]+")){
                order = Integer.parseInt(input);

                validSeat = order < namesOnSeat.length && namesOnSeat[order] == null;
            }else{
                if(validSeat){
                    namesOnSeat[order] = input;
                }
            }
        }
        for(String seat:namesOnSeat){
            if(seat == null){
                x++;
            }
        }
        System.out.println(x);
        return x;
    }

    public static void main(String[] args) {
        int freeSpaces = freeSpaces(new String[]{null, null, "2bad2furious", null, null, "monarezio"}, new Scanner(System.in));
        System.out.println("Free spaces: " + freeSpaces);
    }
}



