package ProtoClass;

import java.util.ArrayList;

public class Magician extends MatherUnit {
    protected int magik;

    public Magician(String clas, String name, int attack, int def, int damage, int maxDamage, int hp, int maxHp, int speed, int x, int y, ArrayList<MatherUnit> myTeam, ArrayList<MatherUnit> enemyTeam, int magik) {
        super(clas, name, attack, def, damage, maxDamage, hp, maxHp, speed, x, y, myTeam, enemyTeam);
        this.magik = 1;
    }
    public Magician(String name, int x, int y, ArrayList<MatherUnit> myTeam, ArrayList<MatherUnit> enemyTeam) {
        super("Маг", name, 17, 12, -5, -5, 30, 30, 4, x, y, myTeam, enemyTeam);
        super.name = name;
        pos = new Vector2D(x,y);
    }
    @Override
    public String getInfo(){
        return  "Я маг!";
    }
}
