package DesignPattern.Behavioural.Memento;


public class Editor {
    private String content;

    public EditorState createState() {
        EditorState editorState = new EditorState(content);
        return editorState;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void restore(EditorState editorState) {
        content = editorState.getContent();
    }

}
