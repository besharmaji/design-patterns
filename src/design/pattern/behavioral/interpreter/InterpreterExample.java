package design.pattern.behavioral.interpreter;

public class InterpreterExample {
    public static void main(String[] args) {
        Expression five = new NumberExpression(5);
        Expression three = new NumberExpression(3);
        Expression two = new NumberExpression(2);

        Expression add = new AddExpression(five, three);        // 5 + 3
        Expression subtract = new SubtractExpression(add, two); // (5 + 3) - 2

        System.out.println("Result: " + subtract.interpret());  // Output: 6
    }
}
