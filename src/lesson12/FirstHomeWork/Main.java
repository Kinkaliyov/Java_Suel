package lesson12.FirstHomeWork;

public class Main {
    public static void main(String[] args) {

        Robot[] robots = new Robot[3];

        robots[0] = new CleanerBot("Суэль");
        robots[1] = new ChefBot("Мага");
        robots[2] = new GuardBot("Саид");

        for (Robot r : robots) {
            r.sayHello();
            r.doTask();
            System.out.println("---");
        }
    }
}