package lesson14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Data data = new Data();
        data.setEmail("suelgarabagli2@gmail.com");
        data.setPassword("suel123");
        data.setCvv(350);
        data.setCard("5555444433332222");
        data.setDate("06/29");
        data.setPhoneNumber("+994559217711");

        System.out.print("<--Введите email: ");
        String TypedEmail = sc.nextLine();

        System.out.print("<--Введите пароль: ");
        String TypedPass = sc.nextLine();

        if (data.getEmail().equals(TypedEmail) && data.getPassword().equals(TypedPass)) {
            System.out.println("<--Вход выполнен успешно!-->");
            System.out.println("Номер телефона: " + data.getPhoneNumber());
            System.out.println("Номер карты: " + data.getCard());
            System.out.println("CVV: " + data.getCvv());
            System.out.println("Срок действия: " + data.getDate());

        } else if (!data.getEmail().equals(TypedEmail) && !data.getPassword().equals(TypedPass)) {
            System.out.println("<--Вход не выполнен. Повторите позже-->");
        }
    }
}
