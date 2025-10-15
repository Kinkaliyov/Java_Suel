package lesson10;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Уровень 1: Animal ---");

        Dog myDog = new Dog();
        myDog.name = "Рекс";
        myDog.age = 5;
        myDog.makeSound();

        Cat myCat = new Cat();
        myCat.name = "Мурка";
        myCat.age = 3;
        myCat.makeSound();

        System.out.println("\n");

        System.out.println("--- Уровень 2: Vehicle ---");

        Vehicle[] transport = new Vehicle[2];
        transport[0] = new Car();
        transport[0].brand = "Toyota";
        transport[1] = new Truck();
        transport[1].brand = "Volvo";

        for (Vehicle v : transport) {
            v.drive();
        }

        System.out.println("\n");

        System.out.println("--- Уровень 3: Employee ---");

        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Олег", 50000.0);
        employees[1] = new Developer("Светлана", 85000.0, "Java");
        employees[2] = new Manager("Максим", 120000.0, 10);

        for (Employee emp : employees) {
            emp.work();
        }
    }
}
