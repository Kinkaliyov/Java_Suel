package lesson10;

class Dog extends Animal {
    public String breed;

    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}