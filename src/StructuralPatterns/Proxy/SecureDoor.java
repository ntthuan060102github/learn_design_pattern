package StructuralPatterns.Proxy;

public class SecureDoor{
    protected Door door;

    public SecureDoor(Door door)
    {
        this.door = door;
    }
    
    public void open(String password)
    {
        if(this.authenticate(password))
        {
            this.door.open();
        }
        else
        {
            System.err.println("Incorrect password!");
        }
    }

    public boolean authenticate(String password)
    {
        return password == "password";
    }

    public void close() {
        this.door.close();
    }
}
