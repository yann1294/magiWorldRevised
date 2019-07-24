package com.opc.magiworld.beans;

import com.opc.magiworld.Model.Personnage;

public class Magus extends Personnage {

    public Magus(String name, int level, int strength, int agility, int intelligence) {
        super(name, level, strength, agility, intelligence);
    }

    /**
     * The basic attack of a personnage
     *
     * @param opponent targeted by the basic attack of the personnage
     */
    @Override
    public void basicAttack(Personnage opponent) {

        int Damage = intelligence;
        System.out.println(name + " utilise  Boule de Feu et inflige " + intelligence + " dommages");
        opponent.damageInflicted(Damage);
    }

    /**
     * The special attack of a personnage
     *
     * @param opponent targeted by the special attack of the personnage
     */
    @Override
    public void specialAttack(Personnage opponent) {

        int bonusEarned = intelligence * 2;
        int revitalized = life + bonusEarned;
        if (revitalized > level * 5)
            revitalized = level * 5;
        System.out.println(name + " utilise Soin et gagne " + (revitalized - life ) + " en vie");
        life = revitalized;
    }

    @Override
    public String toString() {
        return "Abracadabra je suis le Mage " + name +
                " niveau " + level +
                " je possède " + life + " de vie, " +
                strength + " de force, " +
                agility + " d'agilité et " +
                intelligence + " d'intelligence !";
    }
}
