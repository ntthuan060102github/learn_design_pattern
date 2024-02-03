package BehavioralPatterns.mediator;

public class User {
    private String _name;
    private Chatroom _chatroom;

    public User(String name, Chatroom chatroom)
    {
        this._name = name;
        this._chatroom = chatroom;
    }
    public String getName()
    {
        return this._name;
    }
    public void sendMessage(String message)
    {
        this._chatroom.showMessage(this, message);
    }
}
