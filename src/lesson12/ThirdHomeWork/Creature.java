package lesson12.ThirdHomeWork;

public class Creature {
    public String name;

    public Creature(String name) {
        this.name = name;
    }

    public void doMagic() {
        System.out.println(name + " выполняет магию");
    }

}

class Elf extends Creature {
    public Elf(String name) {
        super(name);
    }

    @Override
    public void doMagic() {
        System.out.println(name + " (Эльф) вызывает силы природы: [Шелест листвы]. 🌿");
    }
}

class Wizard extends Creature {
    public Wizard(String name) {
        super(name);
    }

    @Override
    public void doMagic() {
        System.out.println(name + " (Волшебник) произносит заклинание: [Фаерболл!]. 🔥");
    }
}

class Dragon extends Creature {
    public Dragon(String name) {
        super(name);
    }

    @Override
    public void doMagic() {
        System.out.println(name + " (Дракон) дышит огнем: [Рррраааа!]. 🌋");
    }
}