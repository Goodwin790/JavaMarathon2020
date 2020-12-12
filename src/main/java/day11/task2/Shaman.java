package day11.task2;

public class Shaman extends Hero implements Healer,MagicAttack {
    static final int HEAL_HIMSELF = 50;
    static final int HEAL_TEAMMATE = 30;
    public Shaman() {
        physDef = 0.2;
        magicDef = 0.2;
        physAtt = 10;
        magAtt = 15;
    }

    @Override
    public String toString() {
        return health + "";
    }

    @Override
    public void healHimself() {
        if (health + HEAL_HIMSELF > 100) health = MAX_HEALTH;
        else health += HEAL_HIMSELF;
    }



    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + HEAL_TEAMMATE > MAX_HEALTH) hero.health = MAX_HEALTH;
        else hero.health += HEAL_TEAMMATE;
    }

    @Override
    public void MagicalAttack(Hero hero) {
        double damage = magAtt - magAtt * hero.magicDef;
        if (hero.health - damage < MIN_HEALTH) hero.health = MIN_HEALTH;
        else hero.health -= damage;
    }

}
