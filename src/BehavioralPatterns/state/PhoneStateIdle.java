package BehavioralPatterns.state;

public class PhoneStateIdle implements IPhoneState {
    @Override
    public IPhoneState pickUp() {
        return new PhoneStatePickedUp();
    }

    @Override
    public IPhoneState hangUp() throws Exception {
        throw new Exception("already idle");
    }

    @Override
    public IPhoneState dial() throws Exception {
        throw new Exception("unable to dial in idle state");
    }
}
