package lesson10;

class Truck extends Vehicle {
    public double cargoCapacity;

    @Override
    public void drive() {
        System.out.println(brand + " Truck is hauling heavy cargo.");
    }
}