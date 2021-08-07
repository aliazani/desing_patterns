package Behavioral.Memento.Solution;


public class Client {
    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        editor.setTitle("title 1");
        history.push(editor.createState());

        editor.setContent("b");
        editor.setTitle("title 2");
        history.push(editor.createState());

        editor.setContent("c");
        editor.setTitle("title 3");

        editor.restore(history.pop());
        editor.show();

        editor.restore(history.pop());
        editor.show();
    }
}
