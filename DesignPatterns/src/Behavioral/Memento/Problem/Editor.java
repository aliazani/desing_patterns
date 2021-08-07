package Behavioral.Memento.Problem;

import java.util.Stack;

public class Editor {
    private String content;
    private String title;
    private final Stack<String> previousContent = new Stack<>();
    private final Stack<String> previousTitle = new Stack<>();
    private String lastModificationType;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        previousContent.push(getContent());
        this.content = content;
        lastModificationType = "Content";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        previousTitle.push(title);
        lastModificationType = "Title";
    }

    public void undo() {
        if (lastModificationType.equals("Content"))
            content = previousContent.pop();
       
        title = previousTitle.pop();
    }

}
