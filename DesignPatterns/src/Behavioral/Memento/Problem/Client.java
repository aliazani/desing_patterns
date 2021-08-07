package Behavioral.Memento.Problem;

public class Client {
    public static void main(String[] args) {
        var editor = new Editor();
        editor.setContent("a");
        editor.setContent("b");
        editor.setContent("c");
        editor.setTitle("title");
        editor.setContent("d");
        editor.setContent("title2");
        editor.undo();
        System.out.println(editor.getTitle());
        System.out.println(editor.getContent());
    }
}
