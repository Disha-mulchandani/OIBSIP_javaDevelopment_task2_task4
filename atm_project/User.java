package atm_project;

public class User {
    private String userId;
    private String pin;

    public User(String userId, String pin) {
        this.userId = userId;
        this.pin = pin;
    }

    public boolean validate(String id, String enteredPin) {
        return userId.equals(id) && pin.equals(enteredPin);
    }
}
