package ProtoClass;

import java.util.ArrayList;

public abstract class MatherUnit implements GameInterface {
    public String name, clas;
    public ArrayList<MatherUnit> myTeam;
    public ArrayList<MatherUnit> enemyTeam;
    protected int attack, def, damage, maxDamage, hp, maxHp,speed;
    public Vector2D pos;

    public MatherUnit(String clas, String name, int attack, int def, int damage, int maxDamage, int hp, int maxHp, int speed, int x, int y, ArrayList<MatherUnit> myTeam, ArrayList<MatherUnit> enemyTeam) {
        this.clas = clas;
        this.name = name;
        this.attack = attack;
        this.def = def;
        this.damage = damage;
        this.maxDamage = maxDamage;
        this.hp = hp;
        this.maxHp = maxHp;
        this.speed = speed;
        pos = new Vector2D(x,y);
        this.myTeam = myTeam;
        this.enemyTeam = enemyTeam;
        state = "Stand";
    }


    public ArrayList<MatherUnit> getEnemyTeam(){return enemyTeam;}
    public ArrayList<MatherUnit> getMyTeam(){return myTeam;}
    public int getSpeed(){return speed;}
    public  int getHp(){return hp;}

    @Override
    public void step(ArrayList<MatherUnit> myTeam, ArrayList<MatherUnit> enemyTeam){ }
    protected int findNearest(ArrayList<MatherUnit> enemyTeam){
        double min = 100;
        int index = 0;
        for (int i = 0; i < enemyTeam.size(); i++){
            if (min > pos.getDistance(enemyTeam.get(i).pos) & !enemyTeam.get(i).state.equals("Die")){
                index = i;
                min = pos.getDistance(enemyTeam.get(i).pos);
            }
        }
        return index;
    }
    @Override
    public void getDamage(int damage){
        hp -= damage;
        if (hp > maxHp) hp = maxHp;
        if (hp < 0) state = "Die";
    }


    public String getInfo(){return "Я человек!";}

    public String getPrint(){
        return String.format("Класс: %4s, Имя: %9s, Здоровье: %2d, Скорость: %2d, X: %2d, Y:%2d", clas, name, hp, speed, pos.x, pos.y);
    }

    public String state;
}