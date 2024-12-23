package calculator;

public class Calculator {

    public double evaluate(String expression) throws Exception {
        // Evaluate basic expressions
        if (expression.contains("^")) {
            // Handle exponentiation
            String[] parts = expression.split("\\^");
            if (parts.length == 2) {
                double base = Double.parseDouble(parts[0]);
                double exponent = Double.parseDouble(parts[1]);
                return power(base, exponent);
            } else {
                throw new Exception("Invalid Expression");
            }
        } else {
            return new Utils().evaluateBasicExpression(expression);
        }
    }

    public double squareRoot(double value) {
        return Math.sqrt(value);
    }

    public double log(double value) {
        return Math.log10(value);
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
