package Behavioral.TemplateMethod.Challenge;

public class ChatWindows extends Window{
    @Override
    protected void onClosed() {
        System.out.println("Disconnected From Server ...");
    }
}
