package behavioral.mediator;

public class ArticleDialogBox extends DialogBox{
    private ListBox articleListBox = new ListBox(this);
    private TextBox titleTextBox = new TextBox(this);
    private Button saveButton = new Button(this);
    public void simulate(){
        articleListBox.setSelection("abc");
        titleTextBox.setContent("");
        System.out.println("title is " + titleTextBox.getContent());
        System.out.println("button is " + saveButton.isEnabled());

    }
    @Override
    public void change(UIControl control) {
        if(control == articleListBox)
            articleSelected();
        else if(control == titleTextBox)
            titleChanged();
    }

    private void titleChanged(){
        String content = titleTextBox.getContent();
        boolean isEmpty = (content == null || content.isEmpty() );
        saveButton.setEnabled(!isEmpty);
    }

    private void articleSelected(){
        titleTextBox.setContent(articleListBox.getSelection());
        saveButton.setEnabled(true);
    }
}
