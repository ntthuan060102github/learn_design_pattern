package StructuralPatterns.Proxy;

public class LabDoor extends Door {

    @Override
    public void open() {
        System.out.println("Open!!!");
    }

    @Override
    public void close() {
        System.out.println("Close!!!");    
    }
    
}
