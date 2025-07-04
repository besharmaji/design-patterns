package design.pattern.behavioral.interpreter;

// Non-Terminal Expressions (Add)
public class AddExpression implements Expression{
    private final Expression left, right;

    public AddExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() + right.interpret();
    }
}
