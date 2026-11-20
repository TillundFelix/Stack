

public class DoStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("Fynn");
        stack.push("Till");
        stack.push("Lars");
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.top());
    }
}