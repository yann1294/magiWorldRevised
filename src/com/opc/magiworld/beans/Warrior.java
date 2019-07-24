package com.opc.magiworld.beans;

import com.opc.magiworld.Model.Personnage;

public class Warrior extends Personnage {

    public Warrior(String name, int level, int strength, int agility, int intelligence) {
        super(name, level, strength, agility, intelligence);
    }

    /**
     * The basic attack of a personnage
     *
     * @param opponent targeted by the basic attack of the personnage
     */
    @Override
    public void basicAttack(Personnage opponent) {
        int Damage = strength;
        System.out.println(name + " utilise Coup d’Épée et inflige " + Damage + " dommages");
        opponent.damageInflicted(Damage);
    }

    /**
     * The special attack of a personnage
     *
     * @param opponent targeted by the special attack of the personnage
     */
    @Override
    public void specialAttack(Personnage opponent) {

        int Damage = strength * 2;
        System.out.println(name + " utilise Coup de Rage et inflige " + Damage + " dommages");
        opponent.damageInflicted(Damage);
        int selfInflictedDamage = strength / 2;
        this.damageInflicted(selfInflictedDamage);
    }

    @Override
    public String toString() {
        return "Woarg je suis le Guerrier " + name +
                " niveau " + level +
                " je possède " + life + " de vie, " +
                strength + " de force, " +
                agility + " d'agilité et " +
                intelligence + " d'intelligence !";
    }
}
