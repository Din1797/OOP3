package ProtoClass;

import java.util.ArrayList;

public class Monk extends MatherUnit {
   protected int magik;

    public Monk(String clas, String name, int attack, int def, int damage, int maxDamage, int hp, int maxHp, int speed, int magik, int x, int y, ArrayList<MatherUnit> myTeam, ArrayList<MatherUnit> enemyTeam) {
        super(clas, name, attack, def, damage, maxDamage, hp, maxHp, speed, x, y, myTeam, enemyTeam);
        this.magik = 1;
    }

    public Monk(String name, int x, int y, ArrayList<MatherUnit> myTeam, ArrayList<MatherUnit> enemyTeam) {
        super("Монах", name, 12, 7, -4, -4, 30, 30, 5, x, y, myTeam, enemyTeam);
        super.name = name;
        pos = new Vector2D(x,y);
    }
    @Override
    public String getInfo(){
        return  "Я монах!";
    }
}
