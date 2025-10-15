package lesson10;

class Manager extends Employee {
    public int teamSize;

    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void work() {
        System.out.println("Manager " + name + " is managing a team of " + teamSize + " people.");
    }
}