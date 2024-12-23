package calculator;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Utils {

    public double evaluateBasicExpression(String expression) throws Exception {
        // Replace user-friendly operators with standard ones
        expression = expression.replace("÷", "/").replace("×", "*");

        // Add spaces around operators to ensure proper parsing
        expression = expression.replaceAll("([+\\-*/^])", " $1 ");

        // Check for empty or invalid expressions
        if (expression.isEmpty() || !isValidExpression(expression)) {
            throw new Exception("Invalid Expression");
        }

        // Use the JavaScript engine to evaluate the expression
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        Object result = engine.eval(expression);

        // Ensure the result is numeric
        if (result instanceof Number) {
            return ((Number) result).doubleValue();
        } else {
            throw new Exception("Evaluation Error");
        }
    }

    // Validate the expression to ensure it contains only valid characters
    private boolean isValidExpression(String expression) {
        return expression.matches("[0-9+\\-*/().^ ]+");
    }
}
