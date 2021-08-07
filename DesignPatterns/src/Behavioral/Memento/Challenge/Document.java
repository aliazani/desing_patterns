package Behavioral.Memento.Challenge;

import java.text.MessageFormat;

public class Document {
    private String content;
    private String fontName;
    private int fontSize;

    public DocumentMemento createMemento() {
        return new DocumentMemento(content, fontName, fontSize);
    }

    public void restore(DocumentMemento memento) {
        content = memento.getContent();
        fontName = memento.getFontName();
        fontSize = memento.getFontSize();
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Document'{'content=''{0}'', fontName=''{1}'', fontSize={2}'}'",
                content, fontName, fontSize);
    }
}
