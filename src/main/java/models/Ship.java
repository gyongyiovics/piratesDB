package models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ship {
    private int id;
    private String name;
    private int attackPower;
    private int state;
    //TODO: final fields and sql?
    private final String weapon = "CANNON";
    private final int cannonDamage = 25;
    private Map<String, List<Pirate>> shipWithCrew;

    public Ship(int id, String name, int attackPower, int state) {
        this.id = id;
        this.name = name;
        this.attackPower = attackPower;
        this.state = state;
    }

    public Ship(String name, int attackPower, int state, Map<String, List<Pirate>> shipWithCrew) {
        this.name = name;
        this.attackPower = attackPower;
        this.state = state;
        this.shipWithCrew = shipWithCrew;
    }

    public int attack(Ship enemy) {
        enemy.setAttackPower(enemy.getAttackPower() - this.getCannonDamage());
        return enemy.getAttackPower();
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getCannonDamage() {
        return cannonDamage;
    }

    public Map<String, List<Pirate>> getShipWithCrew() {
        return shipWithCrew;
    }

    public void setShipWithCrew(Map<String, List<Pirate>> shipWithCrew) {
        this.shipWithCrew = shipWithCrew;
    }
}
