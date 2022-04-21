package behavioral.mediator;

public class UIControl{
    protected DialogBox owner;
    public UIControl(DialogBox dialogBox) {
        this.owner = dialogBox;
    }
}
