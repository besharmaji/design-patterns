package design.pattern.behavioral.interpreter;

// Terminal Expressions (Numbers)
public class NumberExpression implements Expression{
    private final int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }
}
