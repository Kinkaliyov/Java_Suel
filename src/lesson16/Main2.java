package lesson16;

public class Main2 {
    public static void main(String[] args) {

        System.out.println("--- Тест Задания 1 ---");
        Greeting greeting = new Greeting();
        greeting.showMessage();


        System.out.println("--- Тест Задания 2 ---");

        int x = 10;
        int y = 5;

        int resultSum = Calculator.MathUtils.sum(x, y);
        System.out.println("Сумма: " + resultSum);

        int resultMultiply = Calculator.MathUtils.multiply(x, y);
        System.out.println("Произведение: " + resultMultiply);
    }
}