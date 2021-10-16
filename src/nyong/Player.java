package nyong;

import java.util.HashMap;
import java.util.Map;

public class Player {
    String name;
    int health;
    int mana;
    int gold;
    Map<String, Integer> equipments= new HashMap<String, Integer>();

    public Player (String name, int health, int mana, int gold) {
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.gold = gold;
    }

    public void display() {
        System.out.println("name: " + name + "\n" + "health: " + health + "\n" + "mana: " + mana + "\n"  + "gold: " + gold + "\n" + "equipment: " +  equipments);
    }

    public void addEquipment(String name, Integer cost) {
        equipments.put(name, cost);
    }
}
