package lesson8;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Shortcuts2 cuts = new Shortcuts2();
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите дату рождения: ");
        cuts.bday = sc.nextLine();
        System.out.println("Введите имя: ");
        cuts.name = sc.nextLine();
        System.out.println("Введите фамилию: ");
        cuts.surname = sc.nextLine();
        System.out.println("Введите возвраст: ");
        cuts.age = sc.nextInt();
        sc.nextLine();
        System.out.println("Введите место проживания: ");
        cuts.location = sc.nextLine();
        System.out.println("Введите хобби: ");
        cuts.hobby = sc.nextLine();
        cuts.Result();
    }
}
