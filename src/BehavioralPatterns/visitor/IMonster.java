package BehavioralPatterns.visitor;

public interface IMonster {
    public void hitBy(Warrior warrior);
    public void hitBy(Wizard wizard);
    public void _damaged(int hp);
}