package behavioral.htmlEditor;

import behavioral.htmlEditor.api.Document;

public class HtmlDocument implements Document {
    private String content;

    public void makeBold(){
        content = "<br>" + content + "</br>";
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
