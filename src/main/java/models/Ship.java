package models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ship {
    private String name;
    private int attackPower;
    private int state = 100;
    private final String weapon = "CANNON";
    private final int cannonDamage = 25;
    private Map<String, List<Pirate>> shipWithCrew = new HashMap<>();

}
