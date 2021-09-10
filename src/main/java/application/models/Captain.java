package application.models;

public class Captain extends Pirate {
    private Ship ship;
    private int rumOwned;

    public Captain(int id, String name, Weapon weapon, Ship ship, int rumOwned) {
        super(id, name, weapon);
        this.ship = ship;
        this.rumOwned = rumOwned;
    }

    public Captain(int id, String name, int strength, int drunkLevel, boolean canFight, Weapon weapon, Ship ship, int rumOwned) {
        super(id, name, strength, drunkLevel, canFight, weapon);
        this.ship = ship;
        this.rumOwned = rumOwned;
    }

    public void giveRumToPirate(Pirate happyPirate) {
        System.out.println("Here you go, mate!");
        happyPirate.setDrunkLevel(happyPirate.getDrunkLevel() + 5);
        this.setRumOwned(this.getRumOwned() - 1);
        System.out.println("Captains rum: " + this.getRumOwned());
        System.out.println("Pirates drunk level: " + happyPirate.getDrunkLevel());
    }

    public int executePoorPirate(Pirate poorPirate) {
        System.out.println("Your last day...");
        poorPirate.setStrength(0);
        return poorPirate.getStrength();
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public int getRumOwned() {
        return rumOwned;
    }

    public void setRumOwned(int rumOwned) {
        this.rumOwned = rumOwned;
    }
}
