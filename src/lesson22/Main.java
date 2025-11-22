package lesson22;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("--- Задание 1 ---");
        int a1 = 25;
        double b1 = a1;
        System.out.println(b1);
        System.out.println("Объяснение int в double это неявное преобразование маленькое число влезает в большое");
        System.out.println("------------------------------------");

        System.out.println("--- Задание 2 ---");
        double x2 = 7.9;
        int y2 = (int) x2;
        System.out.println(y2);
        System.out.println("Объяснение double в int это явное преобразование дробная часть просто отрезается");
        System.out.println("------------------------------------");

        System.out.println("--- Задание 3 (Исправлено) ---");
        byte a3 = 90;
        byte b3 = 60;
        byte c3 = (byte) (a3 + b3);
        System.out.println(c3);
        System.out.println("Объяснение byte плюс byte становится int поэтому надо явно приводить обратно к byte");
        System.out.println("------------------------------------");

        System.out.println("--- Задание 4 ---");
        short s4 = 1000;
        byte b4 = (byte) s4;
        System.out.println(b4);
        System.out.println("Объяснение short в byte не влезает поэтому происходит переполнение и число становится странным");
        System.out.println("------------------------------------");

        System.out.println("--- Задание 5: char -> int ---");
        char ch5 = 'D';
        System.out.println("D: " + (int) ch5);
        System.out.println("A: " + (int) 'A');
        System.out.println("Z: " + (int) 'Z');
        System.out.println("a: " + (int) 'a');
        System.out.println("0: " + (int) '0');
        System.out.println("Объяснение char в int показывает код символа в компьютере");
        System.out.println("------------------------------------");

        System.out.println("--- Задание 6: int -> char ---");
        int n6 = 66;
        System.out.println("66: " + (char) n6);
        System.out.println("70: " + (char) 70);
        System.out.println("71: " + (char) 71);
        System.out.println("72: " + (char) 72);
        System.out.println("97: " + (char) 97);
        System.out.println("98: " + (char) 98);
        System.out.println("Объяснение int в char показывает символ по коду");
        System.out.println("------------------------------------");

        System.out.println("--- Задание 7: String -> int ---");
        String str7 = "456";
        int number7 = Integer.parseInt(str7);
        int result7 = number7 + 100;
        System.out.println(result7);
        System.out.println("Объяснение строка 456 это текст а 456 это число надо parseInt чтобы стало числом");
        System.out.println("------------------------------------");

        System.out.println("--- Задание 8: Дробное деление ---");
        int a8 = 5;
        int b8 = 2;
        double result8 = (double) a8 / b8;
        System.out.println(result8);
        System.out.println("Объяснение чтобы получить дробный ответ надо привести число к double");
        System.out.println("------------------------------------");

        System.out.println("--- Задание 9: long -> short ---");
        long big9 = 123456;
        short small9 = (short) big9;
        System.out.println(small9);
        System.out.println("Объяснение long в short не влезает происходит потеря данных и число странное");
        System.out.println("------------------------------------");

        System.out.println("--- Задание 10: Преобразователь ---");
        String strValue = "99";
        double doubleValue = Double.parseDouble(strValue);
        double multipliedDouble = doubleValue * 1.5;
        int finalInt = (int) multipliedDouble;

        System.out.println("Дробное значение: " + multipliedDouble);
        System.out.println("Целое значение: " + finalInt);
        System.out.println("------------------------------------");

        char beta = 2;
        byte alpha = (byte) beta;
        System.out.println(alpha);


    }
}