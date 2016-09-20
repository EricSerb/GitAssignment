package edu.fsu.cs.cen5035;

/**
 * Created by EricSerbousek on 9/20/2016.
 */
public class Arrow extends BasicWeapon implements Weapon{

    private final int IGNORE = 5;

    public Arrow() {
        super(70);
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        int damage = DAMAGE - (armor - IGNORE);
        if (damage < 0) {
            return 0;
        }
        return damage;
    }
}
