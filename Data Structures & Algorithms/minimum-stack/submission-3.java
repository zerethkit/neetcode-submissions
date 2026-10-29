class MinStack {
    
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> mins = new Stack<>();
    
    public void push(int val) {
        if (mins.isEmpty() || val <= mins.peek()) {
            mins.push(val);
        }
        stack.push(val);
    }
    
    public void pop() {
        if (stack.peek().equals(mins.peek())) {
            mins.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return mins.peek();
    }
}
