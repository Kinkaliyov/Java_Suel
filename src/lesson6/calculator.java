package lesson6;

public class calculator {
    public static void main(String[] args) {
        int firstNum = 2;
        int secondNum = 3;
        char operation = '+';

        switch (operation) {
            case '+': {
                System.out.println(firstNum + secondNum);
                break;
            }
            case '-': {
                System.out.println(firstNum - secondNum);
                break;
            }
            case '*': {
                System.out.println(firstNum * secondNum);
                break;
            }
            case '/': {
                if (secondNum == 0) {
                    System.out.println("Деление на ноль невозможно");
                } else {
                    System.out.println(firstNum / secondNum);
                    break;
                }
            }

        }

    }
}
