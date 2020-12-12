package day11.task2;

public class Magician extends Hero implements MagicAttack{

    public Magician() {
        physDef = 0;
        magicDef = 0.8;
        physAtt = 5;
        magAtt = 20;
    }

    @Override
    public String toString() {
        return health + "";
    }

    @Override
    public void MagicalAttack(Hero hero) {
        double damage = magAtt - magAtt * hero.magicDef;
        if (hero.health - damage < MIN_HEALTH) hero.health = MIN_HEALTH;
        else hero.health -= damage;

    }


}
