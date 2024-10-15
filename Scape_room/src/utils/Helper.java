package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Helper {

    private static Scanner input = new Scanner(System.in);

    public static int readInt(String message) {
        int data = 0;
        boolean dataOk = false;

        while(!dataOk) {
            try {
                System.out.println(message);
                data = input.nextInt();
                dataOk = true;
            } catch(InputMismatchException e) {
                System.err.println("Format error. Please, try again.");
                input.nextLine();
            }
        }
        return data;

    }

    public static String readString(String message) {
        String data = "";
        boolean dataOk = false;

        while(!dataOk) {
            try {
                System.out.println(message);
                data = input.next();
                input.nextLine();
                dataOk = true;
            } catch (Exception e) {
                System.err.println("Error. Please, try again.");
                input.nextLine();
            }
        }
        return data;

    }

    public static void readPrice(double price) {
        //comprovar que el preu és un double i no és negatiu...
    }

    public static void readEmail(String email) {
        //comprovar que l'email és correcte...
    }
}
