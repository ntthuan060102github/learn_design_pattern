package BehavioralPatterns.state;

public class PhoneStateCalling implements IPhoneState {
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
        throw new Exception("already dialing");
    }
    
}
