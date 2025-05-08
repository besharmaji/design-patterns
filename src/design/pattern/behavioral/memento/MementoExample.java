package design.pattern.behavioral.memento;

public class MementoExample {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.write("Version 1");
        history.save(editor.save());

        editor.write("Version 2");
        history.save(editor.save());

        editor.write("Version 3");
//      history.save(editor.save());
/* We didn’t save "Version 3" into history because we wanted to simulate a user typing something and forgetting to hit save — very much like real life 😅
Then, when we call undo(), we go back to Version 2, and again undo() → Version 1 */
        System.out.println("Current: " + editor.getContent()); // Version 3

        editor.restore(history.undo());
        System.out.println("After 1 undo: " + editor.getContent()); // Version 2

        editor.restore(history.undo());
        System.out.println("After 2 undos: " + editor.getContent()); // Version 1
    }
}

/*🤔 Why Use Memento Pattern?
✅ Helps save and restore an object's state (like undo/redo).
✅ Encapsulates the internal state without exposing internal details.
✅ Follows Command + Snapshot strategy.
✅ Common in text editors, games, versioning systems, undo-redo logic.
* */