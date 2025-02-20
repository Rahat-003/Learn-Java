package OOP.Inheritance;

public class TextBox extends UIControl {
    private String text = "";

    public TextBox() {
//        super(false);
        System.out.println("TextBox constructor invoked");

    }

    @Override
    public void render() {
        System.out.println("Render TextBox");
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";
    }

}
