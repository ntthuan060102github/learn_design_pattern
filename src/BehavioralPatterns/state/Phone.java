package BehavioralPatterns.state;

public class Phone {
    private IPhoneState _state;

    public Phone()
    {
        this._state = new PhoneStateIdle();
    }

    public void pickUp() {
        try {
            this._state = this._state.pickUp();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void hangUp() {
        try {
            this._state = this._state.hangUp();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void dial() {
        try {
            this._state = this._state.dial();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
