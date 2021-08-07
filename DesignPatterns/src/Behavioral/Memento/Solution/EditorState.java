package Behavioral.Memento.Solution;

public class EditorState {
    private final String title;
    private final String content;

    public EditorState(String title, String content) {
        this.content = content;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
