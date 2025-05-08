package design.pattern.behavioral.interpreter;

// Non-Terminal Expressions (Subtract)
public class SubtractExpression implements Expression{
    private final Expression left, right;

    public SubtractExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() - right.interpret();
    }
}
