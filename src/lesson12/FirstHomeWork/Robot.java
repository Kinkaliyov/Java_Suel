package lesson12.FirstHomeWork;

 public abstract class Robot {
    public String name;
    public void sayHello() {
        System.out.println("Привет! Меня зовут " + name + " и я робот");
    }
    public abstract void doTask();

}

 class CleanerBot extends Robot {
    public CleanerBot(String name) {
        this.name = name;
    }

    @Override
    public void doTask() {
        System.out.println(name + " убирает помещение");
    }

}

class ChefBot extends Robot {
    public ChefBot(String name) {
        this.name = name;
    }

    @Override
    public void doTask() {
        System.out.println(name + " готовит вкусную еду");
    }

}

class GuardBot extends Robot {
    public GuardBot(String name) {
        this.name = name;
    }

    @Override
    public void doTask() {
        System.out.println(name + " охраняет территорию");
    }

}
