package BehavioralPatterns.visitor;

public class CuteDogie implements IMonster {
    @Override
    public void hitBy(Warrior warrior) {
        this._damaged(50);
    }

    @Override
    public void hitBy(Wizard wizard) {
        this._damaged(10);
    }

    @Override
    public void _damaged(int hp)
    {
        System.out.println("-" + String.valueOf(hp));
    }
    
}
