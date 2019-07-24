package com.opc.magiworld.beans;

import com.opc.magiworld.Model.Personnage;

public class Rogue extends Personnage {

    public Rogue(String name, int level, int strength, int agility, int intelligence) {
        super(name, level, strength, agility, intelligence);
    }

    /**
     * The basic attack of a personnage
     *
     * @param opponent targeted by the basic attack of the personnage
     */
    @Override
    public void basicAttack(Personnage opponent) {
        int Damage = agility;
        System.out.println(name + " utilise Tir à l’Arc et inflige " + Damage + " dommages");
        opponent.damageInflicted(Damage);
    }

    /**
     * The special attack of a personnage
     *
     * @param opponent targeted by the special attack of the personnage
     */
    @Override
    public void specialAttack(Personnage opponent) {

        int bonusEarned = agility / 2;
        System.out.println(name + " utilise Concentration et gagne " + bonusEarned + " en agilite");
        agility += bonusEarned;
    }

    @Override
    public String toString() {
        return "Chut je suis le Rôdeur " + name +
                " niveau " + level +
                " je possède " + life + " de vie, " +
                strength + " de force, " +
                agility + " d'agilité et " +
                intelligence + " d'intelligence !";
    }
}
