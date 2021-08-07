package Behavioral.Memento.Solution;

import java.text.MessageFormat;

public class Editor {
    private String content;
    private String title;

    public EditorState createState() {
        return new EditorState(title, content);
    }

    public void restore(EditorState state) {
        content = state.getContent();
        title = state.getTitle();
    }

    public void show() {
        System.out.println(MessageFormat.format("title: {0}\ncontent: {1}"
                , title, content));
    }

    public void setContent(String content) {
        this.content = content;
    }


    public void setTitle(String title) {
        this.title = title;
    }
}
