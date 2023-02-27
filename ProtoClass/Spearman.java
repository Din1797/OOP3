package ProtoClass;

import java.util.ArrayList;

public class Spearman extends MatherUnit {
    public Spearman(String clas, String name, int attack, int def, int damage, int maxDamage, int hp, int maxHp, int speed, int x, int y, ArrayList<MatherUnit> myTeam, ArrayList<MatherUnit> enemyTeam) {
        super(clas, name, attack, def, damage, maxDamage, hp, maxHp, speed, x, y, myTeam, enemyTeam);
    }
    public Spearman(String name, int x, int y, ArrayList<MatherUnit> myTeam, ArrayList<MatherUnit> enemyTeam) {
        super("Копейщик",name, 4, 5, 1, 3, 10, 10, 4, x, y, myTeam, enemyTeam);
        super.name = name;
        pos = new Vector2D(x,y);
    }
    @Override
    public String getInfo(){
        return  "Я копейщик!";
    }
}
