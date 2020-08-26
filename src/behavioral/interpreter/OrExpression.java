package behavioral.interpreter;

public class OrExpression implements Expression {
    private Expression exp1;
    private Expression exp2;

    public OrExpression(Expression exp1,Expression exp2) {
        this.exp1 = expr1;
        this.exp2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return exp1.interpret(context) || exp2.interpret(context);
    }
}