package lesson10;

class Car extends Vehicle {
    public int doors;

    @Override
    public void drive() {
        System.out.println(brand + " Car is driving smoothly.");
    }
}