package edu.fsu.cs.cen5035;

/**
 * Created by EricSerbousek on 9/20/2016.
 */
public class MagicStaff extends BasicWeapon implements Weapon {

    private final double IGNORE = 0.2;

    public MagicStaff() {
        super(80);
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        int damage = DAMAGE - (armor - (int)(armor * IGNORE));
        if (damage < 0) {
            return 0;
        }
        return damage;
    }
}
