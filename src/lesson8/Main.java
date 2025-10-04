package lesson8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Shortcuts cuts = new Shortcuts();
     Scanner sc = new Scanner(System.in);
     System.out.println("Введите первое число: ");
     cuts.a = sc.nextInt();
     System.out.println("Введите второе число: ");
     cuts.b = sc.nextInt();
     cuts.multiply();
     cuts.divide();
    }
}

