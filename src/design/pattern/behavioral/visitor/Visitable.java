package design.pattern.behavioral.visitor;

public interface Visitable {
    void accept(Visitor visitor);
}
