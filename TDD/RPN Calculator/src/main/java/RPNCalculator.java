import java.util.HashMap;
import java.util.Stack;

public class RPNCalculator {
    HashMap<String, Compute> computing = new HashMap<>();

    public RPNCalculator() {
        computing.put("+", new ComputeAddition());
        computing.put("-", new ComputeSubtraction());
        computing.put("/", new ComputeDivision());
        computing.put("*", new ComputeMultiplication());
    }

    public String evaluate(String expression) {
        Stack<Integer> operands = new Stack<>();

        String[] tokens = expression.split(" ");

        if (hasNoOperator(tokens))
            return String.join("\n", tokens);

        for (String token : tokens) {

            if (isOperator(token)){
                int operand1 = operands.pop();
                int operand2 = operands.pop();
                operands.push(computing.get(token).compute(operand2, operand1));
            }
            else {
                operands.push(Integer.parseInt(token));
            }

        }
        return Integer.toString(operands.pop());
    }

    private boolean hasNoOperator(String[] tokens) {
        for (String token : tokens) {
            if (isOperator(token)) return false;
        }
        return true;
    }

    private boolean isOperator(String token) {
        return computing.containsKey(token);
    }

}
