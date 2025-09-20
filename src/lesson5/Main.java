package lesson5;

public class Main {
    public static void main(String[] args) {
        int theNumber = 100;
        if(theNumber % 2 == 0) {
            System.out.println("Число четное");
        } else if(theNumber % 2 > 0) {
            System.out.println("Число нечетное");
        } else {
            System.out.println("Ошибка: Число не делится. Равняется нулю.");
        }
    }
}
