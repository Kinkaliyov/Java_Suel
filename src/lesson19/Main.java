package lesson19;

import java.util.Scanner;

public class Main {
    public static void checkAge(int age) throws Exception {
    if (age<18){
        throw new Exception("Вам не хватает лет для воровской жизни");
    }else{
        System.out.println("<=====Воровская жизнь нелегка, добро пожаловать!=====>");
    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       try{
           System.out.println("<========ПЕРВОЕ ЗАДАНИЕ========>");
           System.out.print("<==Введите число A: "); int a = sc.nextInt();
           System.out.print("<==Введите число B: "); int b = sc.nextInt();
           System.out.println("A / B = " + a / b);
       }catch (ArithmeticException e){
           System.err.println("Деление на ноль это ponyatkassiz heyat!");
       }finally {
           System.out.println("<===Код завершен===>");
       }

       try {
           int[] ray = {1, 2, 3, 4, 5};
           System.out.println("<========ВТОРОЕ ЗАДАНИЕ========>");
           System.out.print("<==Введите индекс массива: "); int index = sc.nextInt();
           System.out.println("Результат: " + ray[index]);
       }catch (ArrayIndexOutOfBoundsException e){
           System.err.println("Мы в списке крутых кодеров не нашли такого.");
       }finally {
           System.out.println("<===Код завершен===>");
       }

       try {
           System.out.println("<========ТРЕТЬЕ ЗАДАНИЕ========>");
           System.out.print("<==Введите переменную A2: "); int a2 = sc.nextInt();
           System.out.print("<==Введите переменную B2: "); int b2 = sc.nextInt();
           System.out.println("A2 / B2 = " + a2 / b2);

           int[] ray2 = {1, 2, 3, 4, 5};
           System.out.print("<==Введите индекс массива: "); int index2 = sc.nextInt();
           System.out.println("Результат: " + ray2[index2]);
       }catch (ArithmeticException e){
           System.err.println("Деление на ноль это ponyatkassiz heyat!");
       }catch (ArrayIndexOutOfBoundsException e){
           System.err.println("Мы в списке крутых кодеров не нашли такого.");
       }finally {
           System.out.println("<===Код обработан===>");
       }

       try {
           System.out.println("<========ЧЕТВЕРТОЕ ЗАДАНИЕ========>");
           System.out.print("<==Введите ваш возвраст для понятие: "); int age = sc.nextInt();
           checkAge(age);
       }catch (Exception e){
           System.err.println(e.getMessage());
       }finally {
           System.out.println("<===Код завершен===>");
       }

    }
}
