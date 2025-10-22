package lesson12.FifthHomeWork;

public class Main {
    public static void main(String[] args) {

        Hero[] heroes = new Hero[3];

        heroes[0] = new Warrior("Супер Суэль");
        heroes[1] = new Archer("Омега Закир Мяльм");
        heroes[2] = new Mage("Бомба Рустам");

        System.out.println("--- Герои вступают в бой ---");

        for (Hero hero : heroes) {
            hero.attack();
        }
    }
}