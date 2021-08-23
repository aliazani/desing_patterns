package Behavioral.Mediator.SolutionObserver;

public class Client {
    public static void main(String[] args) {
        var dialog = new ArticlesDialogBox();
        dialog.simulateUserInteraction();

    }
}
