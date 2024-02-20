package BehavioralPatterns.visitor;

public class Dracula implements IMonster {

    @Override
    public void hitBy(Warrior warrior) {
        this._damaged(10);
    }

    @Override
    public void hitBy(Wizard wizard) {
        this._damaged(80);
    }

    @Override
    public void _damaged(int hp) {
        System.out.println("-" + String.valueOf(hp));
    }
    
}
