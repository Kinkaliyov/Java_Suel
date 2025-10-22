package lesson12.FourthHomeWork;

public class Main {
    public static void main(String[] args) {

        Ride[] attractions = new Ride[];

        attractions.[0] = new RollerCoaster("Кобра");
        attractions.[1] = new FerrisWheel("Солнце");
        attractions.[2] = new HauntedHouse("Скрипучий особняк");

        System.out.println("--- Парк Аттракционов ОТКРЫТ ---");

        for (Ride ride : attractions) {
            ride.startRide();
            ride.enjoy();
            System.out.println("---------------------------------------");
        }
    }
}