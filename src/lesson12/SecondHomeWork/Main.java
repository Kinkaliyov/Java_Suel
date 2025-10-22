package lesson12.SecondHomeWork;

public class Main {
    public static void main(String[] args) {

        CargoShip cargo = new CargoShip("Атлант", 15000);
        FighterShip fighter = new FighterShip("Стрела", 45000);
        ExplorerShip explorer = new ExplorerShip("Путешественник", 25000);

        System.out.println("--- Запуск кораблей ---");

        cargo.fly();
        fighter.fly();
        explorer.fly();


    }
}