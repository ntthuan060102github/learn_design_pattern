package BehavioralPatterns.mediator;

public class Chatroom implements IChatroomMediator {
    @Override
    public void showMessage(User user, String message) {
        System.out.println(String.format("[%s]: %s", user.getName(), message));
    }
}
