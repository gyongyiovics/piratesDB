package application.models;

public enum Weapon {
    MUSKET(50),
    SWORD(25),
    DAGGER(10);

    public final int WEAPON_DAMAGE;
    Weapon(int damage) {
        WEAPON_DAMAGE = damage;
    }

    public int getWEAPON_DAMAGE() {
        return WEAPON_DAMAGE;
    }
}
