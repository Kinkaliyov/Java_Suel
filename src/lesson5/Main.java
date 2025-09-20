package lesson5;

public class Main {
    public static void main(String[] args) {
        int theNumber = 0;
        if (theNumber == 0){
            System.out.println("Ошибка: Число не делится. Равняется нулю.");
        } else if(theNumber % 2 > 0) {
            System.out.println("Число нечетное");
        } else if (theNumber % 2 == 0){
            System.out.println("Число четное");
        }
    }
}
