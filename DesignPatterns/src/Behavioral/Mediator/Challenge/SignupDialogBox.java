package Behavioral.Mediator.Challenge;

public class SignupDialogBox {
    private final TextBox usernameTextBox = new TextBox();
    private final TextBox passwordTextBox = new TextBox();
    private final CheckBox agreeTermsCheckBox = new CheckBox();
    private final Button signUpButton = new Button();

    public void simulateUserInteraction() {
        System.out.println("Initially: " + signUpButton.isEnabled());

        usernameTextBox.setContent("Username");
        System.out.println("After setting username: " + signUpButton.isEnabled());

        passwordTextBox.setContent("Password");
        System.out.println("After setting password: " + signUpButton.isEnabled());

        agreeTermsCheckBox.setChecked(true);
        System.out.println("After agreeing to terms: " + signUpButton.isEnabled());

        // The user removes the password, the button becomes disabled
        passwordTextBox.setContent("");
        System.out.println("After removing the password: " + signUpButton.isEnabled());

        // The user enters the password again, the button becomes enabled
        passwordTextBox.setContent("password");
        System.out.println("After re-setting the password: " + signUpButton.isEnabled());

    }

    public SignupDialogBox() {
        usernameTextBox.addEventHandler(this::controlChanged);
        passwordTextBox.addEventHandler(this::controlChanged);
        agreeTermsCheckBox.addEventHandler(this::controlChanged);
    }

    private void controlChanged() {
        signUpButton.setEnabled(isFormValid());
    }

    private boolean isFormValid() {
        var username = usernameTextBox.getContent();
        var emptyUsername = (username == null || username.isEmpty());

        var password = passwordTextBox.getContent();
        var emptyPassword = (password == null || password.isEmpty());

        var agreeToTermsCheckBox = agreeTermsCheckBox.isChecked();

        return !emptyUsername && !emptyPassword && agreeToTermsCheckBox;
    }

}
