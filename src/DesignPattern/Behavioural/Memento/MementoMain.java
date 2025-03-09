package DesignPattern.Behavioural.Memento;



/**
 * A text editor where the user can undo changes, such as text addition, deletion, or formatting.
 * The editor stores snapshots of its state (text content) after each change, enabling the user
 * to revert to previous states.
 *
 */


public class MementoMain {
    public static void main(String[] args) {
        System.out.println("\nMemento Pattern");

        var editor = new Editor();
        var history = new History();

        editor.setContent("A");
        history.push(editor.createState());


        editor.setContent("B");
        history.push(editor.createState());


        editor.setContent("C");

        // Problem -> undo the last write (C)

        editor.restore(history.pop());
//        editor.restore(history.pop());


        System.out.println(editor.getContent());
    }
}
