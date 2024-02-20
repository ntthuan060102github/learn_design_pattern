package BehavioralPatterns.state;

public interface IPhoneState {
    public IPhoneState pickUp() throws Exception;
    public IPhoneState hangUp() throws Exception;
    public IPhoneState dial() throws Exception;
}
