package BehavioralPatterns.chain_of_responsibility;

public abstract class AAccount {
    protected AAccount successor = null;
    protected int balance;

    public AAccount(int balance)
    {
        this.balance = balance;
    }

    public void setNext(AAccount account)
    {
        this.successor = account;
    }

    public boolean canPay(int amount)
    {
        return this.balance >= amount;
    }

    public void pay(int amount) throws Exception
    {
        if(this.canPay(amount))
        {
            System.out.println("Success: " + this.getClass().getName());
        }
        else if(this.successor != null)
        {
            this.successor.pay(amount);
        }
        else {
            throw new Exception("Can't pay!");
        }
    }
}
