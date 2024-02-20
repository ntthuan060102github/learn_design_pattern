package BehavioralPatterns.state;

public class PhoneStatePickedUp implements IPhoneState {
    @Override
    public IPhoneState pickUp() throws Exception {
        throw new Exception("already picked up");
    }

    @Override
    public IPhoneState hangUp() throws Exception {
        return new PhoneStateIdle();
    }

    @Override
    public IPhoneState dial() throws Exception {
        return new PhoneStateCalling();
    }
    
}
