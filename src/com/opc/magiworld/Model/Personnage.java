package com.opc.magiworld.Model;

public abstract class Personnage {

    protected String name;
    protected int level;
    protected int life;
    protected int strength;
    protected int agility;
    protected int intelligence;

    public Personnage(String name, int level, int strength, int agility, int intelligence) {
        this.name = name;
        this.level = level;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.life = level * 5;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getLife() {
        return life;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public  String getNameAndVitality(){
        return name + " (" + life + " Points de vie";
    }

    /**
     * The damages inflicted on the life of a character.
     * @param Damage value of the damages
     */
    public void damageInflicted(int Damage){
        this.life -= Damage;
        System.out.println(this.getName() + " perd" + Damage + " points de vie");
        if (this.life <= 0){
            System.out.println(this.getName() + " est mort");
        }
    }

    /**
     * The basic attack of a personnage
     * @param opponent targeted by the basic attack of the personnage
     */
    public abstract void basicAttack(Personnage opponent);

    /**
     * The special attack of a personnage
     * @param opponent targeted by the special attack of the personnage
     */
    public abstract void specialAttack(Personnage opponent);

    /**
     * Returns a string representation of the object. In general, the
     * {@code toString} method returns a string that
     * "textually represents" this object. The result should
     * be a concise but informative representation that is easy for a
     * person to read.
     * It is recommended that all subclasses override this method.
     * <p>
     * The {@code toString} method for class {@code Object}
     * returns a string consisting of the name of the class of which the
     * object is an instance, the at-sign character `{@code @}', and
     * the unsigned hexadecimal representation of the hash code of the
     * object. In other words, this method returns a string equal to the
     * value of:
     * <blockquote>
     * <pre>
     * getClass().getName() + '@' + Integer.toHexString(hashCode())
     * </pre></blockquote>
     *
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        return "Personnage{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", life=" + life +
                ", strength=" + strength +
                ", agility=" + agility +
                ", intelligence=" + intelligence +
                '}';
    }
}
