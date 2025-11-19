package lesson20;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------------------");

        double doubleValue = 100.99;
        int intFromDouble = (int) doubleValue;
        System.out.println(intFromDouble);

        char charValue = 'A';
        int intFromChar = (int) charValue;
        System.out.println(intFromChar);

        long longValue = 1234567890123L;
        int intFromLong = (int) longValue;
        System.out.println(intFromLong);

        float floatValue = 50.75f;
        int intFromFloat = (int) floatValue;
        System.out.println(intFromFloat);

        System.out.println("--------------------");


        int smallInt = 100;
        long bigLong = smallInt;
        System.out.println(bigLong);

        int anotherInt = 200;
        double bigDouble = anotherInt;
        System.out.println(bigDouble);

        char anotherChar = 'B';
        long longFromChar = anotherChar;
        System.out.println(longFromChar);

        byte byteValue = 120;
        int intFromByte = byteValue;
        System.out.println(intFromByte);

        System.out.println("--------------------");


    }
}
