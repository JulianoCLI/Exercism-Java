class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        int result;
        try {
            result = switch (operation) {
                case "null" -> throw new IllegalArgumentException("Operation cannot be null");
                case "" -> throw new IllegalArgumentException("Operation cannot be empty");
                case "+" -> operand1 + operand2;
                case "*" -> operand1 * operand2;
                case "/" -> operand1 / operand2;
                default -> throw new IllegalOperationException("Operation '" + operation + "' does not exist");
            };
        } catch (ArithmeticException ae) {
            throw new IllegalOperationException("Division by zero is not allowed", ae);
        }
        return operand1 + " " + operation + " " + operand2  + " = " + result;
    }
}
