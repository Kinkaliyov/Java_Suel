package lesson9;

public class Shortcuts {

    public static void printCycles() {
        System.out.println("--- Задание 1: Циклы (1 до 10) ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void performOperators(int a, int b) {
        System.out.println("--- Задание 2: Операторы (" + a + " и " + b + ") ---");
        System.out.println("Сумма: " + (a + b));
        if (b == 0) {System.err.println("Ошибка: Деление на ноль!"); return;}
        System.out.println("Разность: " + (a - b));
        System.out.println("Произведение: " + (a * b));
        System.out.println("Частное: " + (a / b));
    }

    public static void useBreak() {
        System.out.println("--- Задание 4: Break (до 5) ---");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }

    public static void useContinue() {
        System.out.println("--- Задание 5: Continue (пропуск 5) ---");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static void printAddNumbersResult(int num1, int num2) {
        System.out.println("--- Задание 3: Метод с возвратом ---");
        int result = num1 + num2;
        System.out.println("Сумма чисел: " + result);
    }
}