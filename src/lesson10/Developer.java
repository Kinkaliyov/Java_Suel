package lesson10;

class Developer extends Employee {
    public String language;

    public Developer(String name, double salary, String language) {
        super(name, salary);
        this.language = language;
    }

    @Override
    public void work() {
        System.out.println("Developer " + name + " writes code in " + language + ".");
    }
}