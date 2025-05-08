package design.pattern.behavioral.memento;

// Memento → Stores the snapshot
public class EditorMemento {
    private final String content;

    public EditorMemento(String content) {
        this.content = content;
    }

    public String getSavedContent() {
        return content;
    }
}
