package application.models;

public class Pirate {
    protected int id;
    protected String name;
    protected int strength;
    protected int drunkLevel;
    protected boolean canFight;
    protected Weapon weapon;

    public Pirate(String name) {
        this.name = name;
    }
    public Pirate(int id, String name, Weapon weapon) {
        this.id = id;
        this.name = name;
        this.weapon = weapon;
    }

    public Pirate(int id, String name, int strength, int drunkLevel, boolean canFight, Weapon weapon) {
        this.id = id;
        this.name = name;
        this.strength = strength;
        this.drunkLevel = drunkLevel;
        this.canFight = canFight;
        this.weapon = weapon;
    }

    public int fight(Pirate enemy) {
        enemy.setStrength(enemy.getStrength() - this.weapon.getWEAPON_DAMAGE());
        return enemy.getStrength();
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDrunkLevel() {
        return drunkLevel;
    }

    public void setDrunkLevel(int drunkLevel) {
        this.drunkLevel = drunkLevel;
    }

    public boolean isCanFight() {
        return canFight;
    }

    public void setCanFight(boolean canFight) {
        this.canFight = canFight;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
