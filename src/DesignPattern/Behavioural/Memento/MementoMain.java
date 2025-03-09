package DesignPattern.Behavioural.Memento;

import org.w3c.dom.Text;

/**
 * A text editor where the user can undo changes, such as text addition, deletion, or formatting.
 * The editor stores snapshots of its state (text content) after each change, enabling the user
 * to revert to previous states.
 *
 */


public class MementoMain {
    public static void main(String[] args) {
        System.out.println("Memento Pattern");

        TextEditor editor = new TextEditor();
        editor.write("Hello world!");
        editor.write("Hello everyone!");

        // Problem -> undo the last write (Hello world!) without using stack or list.
        System.out.println(editor.getContent());
    }
}
