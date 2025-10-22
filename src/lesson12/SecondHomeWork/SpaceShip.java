package lesson12.SecondHomeWork;

 public class SpaceShip {
     String name;
     int speed;

     public SpaceShip(String name, int speed) {
         this.name = name;
         this.speed = speed;
     }

     public void fly() {
         System.out.println(name + " летает со скоростью " + speed + " км/ч");
     }


}

 class CargoShip extends SpaceShip {

 public CargoShip(String name, int speed) {
     super(name,speed);
 }
 @Override
     public void fly() {
     System.out.println(name + " (Грузовой корабль) осторожно перевозит груз со скоростью " + speed + " км/ч.");
 }
 }

class FighterShip extends SpaceShip {
    public FighterShip(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void fly() {
        System.out.println(name + " (Истребитель) выполняет манёвр атаки на гиперскорости " + speed + " км/ч!");
    }
}

class ExplorerShip extends SpaceShip {
    public ExplorerShip(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void fly() {
        System.out.println(name + " (Исследовательский корабль) летит к неизвестным планетам со скоростью " + speed + " км/ч.");
    }
}