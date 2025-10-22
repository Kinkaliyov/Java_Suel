package lesson12.FifthHomeWork;

class Hero {
    public String name;

    public Hero(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println(name + " наносит стандартный удар.");
    }
}

class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + " (Воин) атакует тяжелым мечом!");
    }
}

class Archer extends Hero {
    public Archer(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + " (Лучник) стреляет из лука точно в цель!");
    }
}

class Mage extends Hero {
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + " (Маг) использует мощное заклинание!");
    }
}

