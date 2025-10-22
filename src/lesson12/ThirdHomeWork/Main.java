package lesson12.ThirdHomeWork;

public class Main {
    public static void main(String[] args) {

        Creature[] magicalBeings = new Creature[3];

        magicalBeings[0] = new Elf("Ренат");
        magicalBeings[1] = new Wizard("Джясур");
        magicalBeings[2] = new Dragon("Шамиль");

        System.out.println("--- Ученики творят магию ---");

        for (Creature being : magicalBeings) {
            being.doMagic();
        }
    }
}