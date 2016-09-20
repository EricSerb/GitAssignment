/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fsu.cs.cen5035;

/**
 *
 * @author Javier
 *
 * edited by:
 * @author Eric Serbousek
 */
public class RoleGame {

    public static void main(String[] args) {
        /*
        * This is the code for sword implented by:
        * @author Javier
        */
        Weapon sword = WeaponFactory.getWeapon("sword");
        System.out.println("Sword has " + sword.hit() + " of damage.");
        int armor = 20;
        System.out.println("Sword was able to do " + sword.hit(armor) +
                " damage due to an armor with "+armor+ " points.");
        System.out.println();

        Weapon arrow = WeaponFactory.getWeapon("arrow");
        System.out.println("Arrow has " + arrow.hit() + " of damage.");
        System.out.println("Arrow was able to do " + arrow.hit(armor) + " " +
                " damage due to an armor with "+armor+ " points.");
        System.out.println();

        Weapon axe = WeaponFactory.getWeapon("axe");
        System.out.println("Axe has " + axe.hit() + " of damage.");
        System.out.println("Axe was able to do " + axe.hit(armor) + " " +
                " damage due to an armor with "+armor+ " points.");
        System.out.println();

        Weapon magicStaff = WeaponFactory.getWeapon("magicstaff");
        System.out.println("Magic Staff has " + magicStaff.hit() + " of " +
                "damage.");
        System.out.println("Magic Staff was able to do " + magicStaff.hit
                (armor) + " damage due to an armor with "+armor+ " " +
                "points.");
        System.out.println();
    }
}
