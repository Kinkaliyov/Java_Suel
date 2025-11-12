import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- ЗАДАНИЕ 1: Деление ---");
        try {
            System.out.print("Введите первое число: ");
            int a = scanner.nextInt();
            System.out.print("Введите второе число: ");
            int b = scanner.nextInt();

            int result = a / b;
            System.out.println("Результат: " + result);

        } catch (ArithmeticException e) {
            System.out.println("ЗАПРЕЩЕНО ДЕЛИТЬ НА НОООЛЬ");
        } catch (InputMismatchException e) {
            System.out.println("Ты че написал?");
        } finally {
            System.out.println("Успешно!");
        }


        System.out.println("--- ЗАДАНИЕ 2: Массив ---");
        try {
            int[] array = new int[3];
            System.out.println(array[7]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("В массиве я чет такого не нашел");
        } finally {
            System.out.println("Успех!");
        }


        System.out.println("--- ЗАДАНИЕ 4: Throw ---");
        try {
            System.out.print("Проверка на паспортные данные (числа) ");
            int input = scanner.nextInt();

            if (input < 0) {
                throw new IllegalArgumentException("Обнаружено недопустимое число: " + input);
            }

            System.out.println("Введено корректное число: " + input);

        } catch (IllegalArgumentException e) {
            System.out.println("Исключение: " + e.getMessage());
        } finally {
            System.out.println("Успешно!");
            scanner.close();
        }
    }
}