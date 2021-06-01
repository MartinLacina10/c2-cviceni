package cz.educanet.praha;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Utils {

    public static String asString(Object[] data) {
        return Arrays.stream(data).map(Object::toString).collect(Collectors.joining("\n"));
    }

    public static Scanner createScanner(Object[] data) {
        return new Scanner(new ByteArrayInputStream(asString(data).getBytes()));
    }

    public static Scanner createScanner(int i, String honza, int i1, String marek, int i2, String mirek) {
        return null;
    }

    public static Scanner createScanner(int i, String honza, int i1, int i2, String kacka, int i3, String martin, int i4, int i5, String marek, int i6, String michal) {
    }

    public static Scanner createScanner(int i, int i1, int i2, String honza) {
    }
}
