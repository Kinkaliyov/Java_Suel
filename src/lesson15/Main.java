package lesson15;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String words = sc.nextLine();

        System.out.println("Длина строки: " + words.length());
        System.out.println("<==========================>");
        System.out.println("Строка с большими буквами: " + words.toUpperCase());
        System.out.println("Строка с нижними буквами: " + words.toLowerCase());
        System.out.println("<==========================>");
        System.out.println("Строка без пробелов: " + words.trim());
        System.out.println("<==========================>");
        System.out.println("Количество букв 'а': " + words.replaceAll("[^а]", "").length()); // способ с CharAt() не понял
        System.out.println("Количество цифр: " + words.replaceAll("[^0-9]", "").length());
        System.out.println("Количество пробелов: " + words.replaceAll("[^ ]", "").length());
        System.out.println("<==========================>");
        char[] wordchars = words.toCharArray();
        System.out.println("Первая буква или цифра: " + wordchars[0]); // не получилось использовать indexof
        System.out.println("Последняя буква или цифра: " + wordchars[wordchars.length - 1]); // не получилось использовать lastindex
        System.out.println("<==========================>");
        System.out.print("Введите букву которую надо заменить: ");
        String A = sc.nextLine();
        System.out.print("Введите букву на которую надо заменить: ");
        String B = sc.nextLine();
        System.out.println("Результат: " + words.replace(A, B));
        System.out.println("<==========================>");
        System.out.print("Введите строку чтобы спросить начинается ли строка с заданной буквой: ");
        String first = sc.nextLine();
        System.out.println("Начинается ли строка " + words + " на " + first + " ? " + words.startsWith(first));
        System.out.println("<==========================>");
        System.out.print("Введите строку чтобы спросить заканчивается ли строка с заданной буквой: ");
        String last = sc.nextLine();
        System.out.println("Заканчивается ли строка " + words + " на " + last + " ? " + words.endsWith(last));
        System.out.println("<==========================>");
        System.out.print("Введите первую букву чтобы показать начинание строки: ");
        String i = sc.nextLine();
        System.out.print("Введите вторую букву чтобы показать заканчивание строки: ");
        String j = sc.nextLine();
        System.out.println("Результат: " + words.substring(words.indexOf(i), words.lastIndexOf(j)));
        System.out.println("<==========================>");
        System.out.print("Введите совпадает ли часть строки с другой строкой с помощью regionMatches(): ");
        String ChastStroki = sc.nextLine();
        System.out.println("Результат: " + words.regionMatches(true, 0, ChastStroki, 0, ChastStroki.length()));
        System.out.println("<==========================>");



    }
}
