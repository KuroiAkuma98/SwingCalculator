public class FunctionListElement {
    private String name;
    private String expression;

    public FunctionListElement(String _name, String _expression) {
        this.name = _name;
        this.expression = _expression;
    }

    public String toString() {
        return name;
    }

    public String getExpression() {
        return expression;
    }

}
