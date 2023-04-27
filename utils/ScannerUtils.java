package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerUtils {

    private static Scanner scanner;

    public static Scanner getScanner() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner;
    }

    public static float getFloatNumberFromInput() {
        Scanner input = getScanner();
        float numberFromInput;
        try {
            numberFromInput = input.nextFloat();
        } catch (InputMismatchException exception) {
            System.out.println("Introdu un numar valid");
            input.nextLine();
            numberFromInput = getFloatNumberFromInput();
        }
    return numberFromInput;
    }

    public static int getIntNumberFromInput() {
        Scanner input = getScanner();
        int numberFromInput;
        try {
            numberFromInput = input.nextInt();
        } catch (InputMismatchException exception) {
            System.out.println("Introdu un numar valid");
            input.nextLine();
            numberFromInput = getIntNumberFromInput();
        }
        return numberFromInput;
    }

    public static double getDoubleNumberFromInput() {
        Scanner input = getScanner();
       double numberFromInput;
        try {
            numberFromInput = input.nextDouble();
        } catch (InputMismatchException exception) {
            System.out.println("Introdu un numar valid");
            input.nextLine();
            numberFromInput = getDoubleNumberFromInput();
        }
        return numberFromInput;
    }
}
