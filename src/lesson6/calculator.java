package lesson6;

public class calculator {
    public static void main(String[] args) {
        int firstNum = 0;
        int secondNum = 0;
        char operation = '*';

        switch (operation) {
            case '+': {
                if (firstNum == 0 || secondNum == 0) {
                    System.out.println(firstNum + secondNum);
                    break;
                }
            }
            case '-': {
                if (firstNum == 0 || secondNum == 0) {
                    System.out.println(firstNum - secondNum);
                    break;
                }
            }
            case '*': {
                if (firstNum == 0 || secondNum == 0) {
                    System.out.println(firstNum * secondNum);
                    break;
                }
            }
            case '/': {
                if (firstNum == 0 || secondNum == 0) {
                    System.out.println(firstNum / secondNum);
                    break;
                }
            }

        }

    }
}
