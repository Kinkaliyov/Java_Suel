package lesson8;

public class Shortcuts {
    int a;
    int b;

    void multiply(){
        System.out.println("Умножение");
        System.out.println(a + " Умноженное на " + b + " равно " + a * b);
    }

    void divide(){
        System.out.println("Деление");
        if (b == 0){
            System.err.println("Деление на ноль невозможно");

        }else if(b > 0 || b < 0) {
            System.out.println(a + " Деленное на " + b + " равно " + a / b);
        }



    }
}
