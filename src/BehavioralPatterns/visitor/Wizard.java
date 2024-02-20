package BehavioralPatterns.visitor;

public class Wizard implements IHuman {
    @Override
    public void hit(IMonster monster) {
        monster.hitBy(this);
    }
    
}
