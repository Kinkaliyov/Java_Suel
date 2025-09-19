package lesson4;

public class Main {
    public static void main(String[] args) {
        String[] days = {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};
        System.out.println(days[0] + ", " + days[1] + ", " + days[2] + ", " + days[3] + ", " + days[4] + ", " + days[5] + ", " + days[6]);
        System.out.println(days[0] + ", " + days[2] + ", " + days[4] + ", " + days[6]);
        System.out.println(days[1] + ", " + days[3] + ", " + days[5]);

        int[] numbers = new int[10];


        numbers[0] = 50;
        numbers[1] = 120;
        numbers[2] = 85;
        numbers[3] = 150;
        numbers[4] = 90;
        numbers[5] = 110;
        numbers[6] = 70;
        numbers[7] = 135;
        numbers[8] = 99;
        numbers[9] = 180;

        System.out.println(numbers[0] + ", " + numbers[1] + ", " + numbers[2] + ", " + numbers[3] + ", " + numbers[4] + ", " + numbers[5] + ", " + numbers[6] + ", " + numbers[7] + ", " + numbers[8] + ", " + numbers[9]);

        System.out.println("больше 100");
        if (numbers[0] > 100) {
            System.out.println(0);
        }
        if (numbers[1] > 100) {
            System.out.println(1);
        }
        if (numbers[2] > 100) {
            System.out.println(2);
        }
        if (numbers[3] > 100) {
            System.out.println(3);
        }
        if (numbers[4] > 100) {
            System.out.println(4);
        }
        if (numbers[5] > 100) {
            System.out.println(5);
        }
        if (numbers[6] > 100) {
            System.out.println(6);
        }
        if (numbers[7] > 100) {
            System.out.println(7);
        }
        if (numbers[8] > 100) {
            System.out.println(8);
        }
        if (numbers[9] > 100) {
            System.out.println(9);
        }
    }
}

