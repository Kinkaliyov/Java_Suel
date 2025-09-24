package lesson5;

public class Main {
    public static void main(String[] args) {
    String name = "Suel";
    int age = 13;
    String city = "Baku";
    String favBook = "W3School";

        System.out.println("My name is " + name + ". I am " + age + " years old. I live in " + city + ". My favorite book is " + favBook);
        if (age <  18) {
            System.out.println("I am a child");
        } else if(age > 18) {
            System.out.println("I am an adult");
        } else if(age >= 50) {
            System.out.println("I am a senior citizen");
        }


        if (age < 18 && city == "Baku") {
            System.out.println("I am a child and I live in Baku");
        } else if (age > 30 && city == "Naxcivan") {
            System.out.println("I am a senior citizen and I live in Nanxcivan");
        } else {
            System.out.println("None of them are true.");
        }


        if (favBook == "Война и мир") {
            System.out.println("You are loving classic books!");
        } else if (favBook == "Гарри Поттер") {
            System.out.println("You are loving fantasy books!");
        } else {
            System.out.println("I am respecting your option: " + favBook);
        }

    }
}
