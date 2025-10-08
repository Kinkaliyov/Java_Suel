package lesson9;

import java.util.Scanner;

import static lesson9.Content.BookContent;

public class Book {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название книги:");
        String title = scanner.nextLine();
        System.out.println("Введите автора книги:");
        String author = scanner.nextLine();
        System.out.println("Введите год издания книги:");
        int year = scanner.nextInt();
        System.out.println("Введите содержание книги:");
        scanner.nextLine();
        String contender = scanner.nextLine();
        BookContent(title, author, year, contender);


    }
}
