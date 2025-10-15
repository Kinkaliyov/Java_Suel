package lesson11;

class MusicalInstrument {
    public String name;

    public void playSound() {
        System.out.println(name + " делает общий музыкальный звук.");
    }
}

class Guitar extends MusicalInstrument {
    public Guitar() {
        name = "Гитара";
    }

    @Override
    public void playSound() {
        System.out.println(name + " играет струнами дзинь дзнинь");
    }
}

class Piano extends MusicalInstrument {
    public Piano() {
        name = "Фортепиано";
    }

    @Override
    public void playSound() {
        System.out.println(name + " играет клавишами динь динь");
    }
}

class Drum extends MusicalInstrument {
    public Drum() {
        name = "Барабан";
    }

    @Override
    public void playSound() {
        System.out.println(name + " бьёт ритм брум тата тата");
    }
}

public class Main {
    public static void main(String[] args) {

        MusicalInstrument[] orchestra = new MusicalInstrument[3];

        orchestra[0] = new Guitar();
        orchestra[1] = new Piano();
        orchestra[2] = new Drum();

        System.out.println("Дирижёр командует ИГРАЙ!");
        System.out.println("-------------------------");

        for (MusicalInstrument instrument : orchestra) {
            instrument.playSound();
        }
    }
}