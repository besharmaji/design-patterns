package design.pattern.behavioral.memento;

import java.util.Stack;

// Caretaker → Manages save points
public class History {
    private final Stack<EditorMemento> history = new Stack<>();

    public void save(EditorMemento memento) {
        history.push(memento);
    }

    public EditorMemento undo() {
        return history.pop();
    }
}
