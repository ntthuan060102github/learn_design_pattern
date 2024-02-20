package BehavioralPatterns.visitor;

public class Warrior implements IHuman {
    @Override
    public void hit(IMonster monster) {
        monster.hitBy(this);
    }
    
}
