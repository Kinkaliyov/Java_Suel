package lesson12.FourthHomeWork;

import java.util.ArrayList;
import java.util.List;

public abstract class Ride {
    public String name;

    public Ride(String name) {
        this.name = name;
    }

    public void startRide() {
        System.out.println("--- " + name + ": Аттракцион запускается! ---");
    }

    public abstract void enjoy();
}

class RollerCoaster extends Ride {
    public RollerCoaster(String name) {
        super(name);
    }

    @Override
    public void enjoy() {
        System.out.println("Ощущение: С криком несётся по крутым виражам!");
    }
}

class FerrisWheel extends Ride {
    public FerrisWheel(String name) {
        super(name);
    }

    @Override
    public void enjoy() {
        System.out.println("Ощущение: Медленно поднимается, наслаждаясь видом города.");
    }
}

class HauntedHouse extends Ride {
    public HauntedHouse(String name) {
        super(name);
    }

    @Override
    public void enjoy() {
        System.out.println("Ощущение: Испуганно кричит от внезапных появлений призраков!");
    }
}