package lesson3;

public class Main {
    public static void main(String[] args) {
        String[] colors = {"Синий", "Зеленый", "Красный", "Желтый", "Белый"};
        System.out.println("Первый любимый цвет: " + colors[0]);
        System.out.println("Последний любимый цвет: " + colors[4]);

        int[] numbers = {10, 25, 30, 45, 50};
        int sum = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];
        System.out.println("Сумма всех чисел в массиве: " + sum);

        int[][] grades = {
                {5, 4, 5},
                {3, 5, 4},
                {4, 3, 5}
        };

        System.out.println("Таблица оценок:");
        System.out.println(grades[0][0] + "     " + grades[0][1] + "     " + grades[0][2]);
        System.out.println(grades[1][0] + "     " + grades[1][1] + "     " + grades[1][2]);
        System.out.println(grades[2][0] + "     " + grades[2][1] + "     " + grades[2][2]);
        System.out.println("<-------------Суэль Карабахлы-------------->");

      String Java = "BC_Suel";
      String Java2 = "DEV_Suel";
        System.out.println("What is better for me? " + Java + " or " + Java2 + "?");






    }
}
