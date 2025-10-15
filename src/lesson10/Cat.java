package lesson10;

class Cat extends Animal {
    public String color;

    @Override
    public void makeSound() {
        System.out.println(name + " meows: Meow!");
    }
}
