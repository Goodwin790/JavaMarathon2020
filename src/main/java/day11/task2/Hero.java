package day11.task2;

public abstract class Hero implements PhysAttack {
     int health;
     double physDef;
     double magicDef;
     double physAtt;
     double magAtt;
    static final int MAX_HEALTH = 100;
    static final int MIN_HEALTH = 0;

    public Hero (){
        health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double damage = physAtt - physAtt * physDef;
        if( hero.health - damage < MIN_HEALTH)
            hero.health = MIN_HEALTH;
        else hero.health -= damage;
    }

    @Override
    public String toString() {
        return health + "";
    }
}