package ProtoClass;

import ProtoClass.MatherUnit;

import java.util.ArrayList;

public abstract class Shooter extends MatherUnit {
    int shot;


    public Shooter(String clas, String name, int attack, int def, int damage, int maxDamage, int hp, int maxHp, int speed, int x, int y, ArrayList<MatherUnit> myTeam, ArrayList<MatherUnit> enemyTeam, int shot) {
        super(clas, name, attack, def, damage, maxDamage, hp, maxHp, speed, x, y, myTeam, enemyTeam);
        this.shot = shot;
    }

    @Override
    public void step(ArrayList<MatherUnit> myTeam, ArrayList<MatherUnit> enemyTeam) {
        if (state.equals("Die") || shot == 0) return;
        int target = findNearest(enemyTeam);
        int damage = (enemyTeam.get(target).def - attack > 0) ? this.damage : (enemyTeam.get(target).def - attack < 0) ? maxDamage : ((maxDamage + this.damage) / 2);
        enemyTeam.get(target).getDamage(damage);
        for (int i = 0; i < myTeam.size(); i++) {
            if (myTeam.get(i).getClass() == Fermer.class && myTeam.get(i).state.equals("Stande")) {
                myTeam.get(i).state = "Buse";
                return;
            }
        }
        shot--;

    }
    protected boolean findFarmer(ArrayList<MatherUnit> myTeam) {
        ArrayList<MatherUnit> arrayFermer = new ArrayList<>();
        for (int i = 0; i < myTeam.size(); i++){
            if (myTeam.get(i).getClass() == Fermer.class){
                if (((Fermer) myTeam.get(i)).getDelivery() > 0) {
                    arrayFermer.add(myTeam.get(i));
                }
            }
        }
        switch (arrayFermer.size()) {
            case (0):
                return false;
            case (1):
                ((Fermer) arrayFermer.get(0)).setDelivery(0);
                return true;
            default:
                ((Fermer) arrayFermer.get(findNearest(arrayFermer))).setDelivery(0);
                return true;
        }
    }

}