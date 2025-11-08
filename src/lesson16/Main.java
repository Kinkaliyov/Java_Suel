package lesson16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.showContent();
    }
}

class Library {
Scanner sc = new Scanner(System.in);
    String NameA = sc.nextLine();
    String AuthorA = sc.nextLine();
    int YearA = sc.nextInt();
    String ContentA = sc.nextLine();


    void showContent() {
        Book book = new Book();
        book.showBooks();
    }

    class Book{
        void showBooks(){
            System.out.println("<==========================>");
            System.out.println("Название книги: " + NameA);
            System.out.println("Автор книги: " + AuthorA);
            System.out.println("Год издания книги: " + YearA);
            System.out.println("Содержание книги: " + ContentA);
            System.out.println("<==========================>");
        }
    }

}