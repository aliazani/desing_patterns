package Behavioral.Mediator.Solution;

public class ArticlesDialogBox extends DialogBox{
    private final ListBox articlesListBox = new ListBox(this);
    private final TextBox titleTextBox = new TextBox(this);
    private final Button saveButton = new Button(this);

    public void simulateUserInteraction() {
        articlesListBox.setSelection("Article 1");
        titleTextBox.setContent("");
        titleTextBox.setContent("Article 2");

        System.out.println("TextBox: " + titleTextBox.getContent());
        System.out.println("Button: " + saveButton.isEnabled());
    }

    @Override
    public void changed(UIControl uiControl) {
        if (uiControl == articlesListBox)
            articleSelected();
        else if (uiControl == titleTextBox)
            titleChanged();
    }

    private void articleSelected() {
        titleTextBox.setContent(articlesListBox.getSelection());
        saveButton.setEnabled(true);
    }

    private void titleChanged() {
        var content = titleTextBox.getContent();
        var isEmpty = (content == null || content.isEmpty());
        saveButton.setEnabled(!isEmpty);
    }
}
