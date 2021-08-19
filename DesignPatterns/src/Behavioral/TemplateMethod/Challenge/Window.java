package Behavioral.TemplateMethod.Challenge;

public class Window {
    public void close() {
        onClosing();

        System.out.println("Removing the window from the screen");

        onClosed();
    }

    protected void onClosed() {
    }

    protected void onClosing() {
    }
}
