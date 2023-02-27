package ProtoClass;

import java.util.ArrayList;

public class Fermer extends MatherUnit {
    protected int delivery;
    public Fermer(String clas, String name, int attack, int def, int damage, int maxDamage, int hp, int maxHp, int speed, int x, int y, ArrayList<MatherUnit> myTeam, ArrayList<MatherUnit> enemyTeam, int delivery) {
        super(clas, name, attack, def, damage, maxDamage, hp, maxHp, speed, x, y, myTeam, enemyTeam);
        this.delivery = delivery;
    }
    public Fermer(String name, int x, int y, ArrayList<MatherUnit> myTeam, ArrayList<MatherUnit> enemyTeam) {
        super("Фермер", name, 1, 1, 1, 1, 1, 1, 3, x, y, myTeam, enemyTeam);
        this.delivery = 1;


    }

    public int getDelivery() {
        return this.delivery;
    }
    public void setDelivery(int delivery) {
        this.delivery = delivery;
    }
    @Override
    public String getInfo(){
        return  "Я крестьянин!";
    }
}
