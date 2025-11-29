package lesson27;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Double> Students = new HashMap<>();
        Students.put("Суэль", 5.0);
        Students.put("Джасур", 3.8);
        Students.put("Магастан", 4.9);
        Students.put("Саид", 5.0);
        Students.put("Ренат", 0.01);

        System.out.println("------------------------");
        System.out.println(Students);
        System.out.println("------------------------");
        System.out.println(" ");


        TreeMap<String, Integer> Balance = new TreeMap<>();
        Balance.put("55229228833992", 1999);
        Balance.put("12312312312313", 81283);
        Balance.put("2183792873913", 9128391);

        System.out.println("------------------------");
        System.out.println(Balance);
        System.out.println("------------------------");
        System.out.println(" ");


        HashMap<String, String> Command = new HashMap<>();
        Command.put("Спецназ", "Суэль");
        Command.put("Террорист", "Мага");
        Command.put("Мертвый", "Джасур");

        System.out.println("------------------------");
        System.out.println(Command);
        System.out.println("------------------------");
        System.out.println(" ");

        HashMap<String, String> CommandV2 = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите команду: ");
        String Key = sc.nextLine();
        System.out.println(" ");
        System.out.print("Введите Имя: ");
        String Value = sc.nextLine();
        CommandV2.put(Key, Value);

        System.out.print("Введите команду2: ");
        String Key2 = sc.nextLine();
        System.out.println(" ");
        System.out.print("Введите Имя2: ");
        String Value2 = sc.nextLine();
        CommandV2.put(Key2, Value2);

        System.out.print("Введите команду3: ");
        String Key3 = sc.nextLine();
        System.out.println(" ");
        System.out.print("Введите Имя3: ");
        String Value3 = sc.nextLine();
        CommandV2.put(Key3, Value3);

        System.out.println("------------------------");
        System.out.println(CommandV2);
        System.out.println("------------------------");
        System.out.println(" ");

    }
}
