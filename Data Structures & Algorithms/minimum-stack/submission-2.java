class MinStack {
Stack<Integer>MainStack;
Stack<Integer>MinStack;
    public MinStack() {
        MainStack =new Stack<>();
        MinStack =new Stack<>();
    }
    
    public void push(int val) {
        MainStack.push(val);
        if(MinStack.isEmpty() || val<=MinStack.peek()){
            MinStack.push(val);
        }
    }
    
    public void pop() {
        int removed=MainStack.pop();
        if(removed==MinStack.peek()){
            MinStack.pop();
        }
    }
    
    public int top() {
        return MainStack.peek();
    }

    public int getMin() {
        return MinStack.peek();
    
    }
}
