package ProtoClass;

import java.util.ArrayList;

public interface InterfaceGame {
    void step(ArrayList<MatherUnit> myTeam, ArrayList<MatherUnit> enemyTeam);
    void getDamage(int damage);

}