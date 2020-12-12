package day11.task2;

public class Paladin extends  Hero implements Healer{
   static final int HEAL_HIMSELF = 25;
    static final int HEAL_TEAMMATE = 10;
    public Paladin() {
        physDef = 0.5;
        magicDef = 0.2;
        physAtt = 15;
    }

    @Override
    public String toString() {
        return health +"";
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
}
