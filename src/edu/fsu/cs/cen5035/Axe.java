package edu.fsu.cs.cen5035;

/**
 * Created by EricSerbousek on 9/20/2016.
 */
public class Axe extends BasicWeapon implements Weapon{
    private final int ARMORTHRESHOLD = 20;

    public Axe() {
        super(60);
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        int damage = DAMAGE;

        if (armor >= ARMORTHRESHOLD){
            damage -= armor;
        }
        if (damage < 0) {
            return 0;
        }
        return damage;
    }
}
