package behavioral.mediator.observer;

public class ArticleDialogBox {
    ListBox articleListBox = new ListBox();
    TextBox titleTextBox = new TextBox();
    Button saveButton = new Button();

    public ArticleDialogBox(){
//        articleListBox.attach(this::articleSelected);
//        articleListBox.attach(this::titleChanged);
        articleListBox.addEventHandler(this::articleSelected);
        articleListBox.addEventHandler(this::titleChanged);
    }

    public void simulate(){
        articleListBox.setSelection("abc");
        titleTextBox.setContent("");
        System.out.println("title is " + titleTextBox.getContent());
        System.out.println("button is " + saveButton.isEnabled());

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
