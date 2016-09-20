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
        Weapon sword = WeaponFactory.getWeapon("sword");
        System.out.println("Sword has " + sword.hit() + " of damage.");
        int armor = 20;
        System.out.println("Sword was able to do " + sword.hit(armor) +
                " of damage due to an armor with "+armor+ " points.");
        System.out.println();
        
        //TODO: Add the remainig weapons here
        Weapon arrow = WeaponFactory.getWeapon("arrow");
        System.out.println("Arrow has " + arrow.hit() + " of damage.");
        System.out.println("Swords was able to do " + arrow.hit(armor) + " of" +
                " damage due to an armor with "+armor+ " points.");
        System.out.println();
        /*
        Weapon axe = WeaponFactory.getWeapon("axe");
        System.out.println("Sword has " + axe.hit() + " of damage.");
        System.out.println("Swords was able to do " + axe.hit(armor) + " of " +
                "damage due to an armor with "+armor+ " points.");
        System.out.println();
        Weapon magicStaff = WeaponFactory.getWeapon("magicstaff");
        System.out.println("Magic staff has " + magicStaff.hit() + " of " +
                "damage.");
        System.out.println("Magic Staff was able to do " + magicStaff.hit
                (armor) + " of " + "damage due to an armor with "+armor+ " points.");
        System.out.println(); */
    }
}
