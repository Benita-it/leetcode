class MinStack {
    Stack<int[]> s1=new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int value) {
        s1.push(new int[]{value,Math.min(value,s1.isEmpty()==true?value:s1.peek()[1])});
    }
    
    public void pop() {
        s1.pop();
    }
    
    public int top() {
        var it=s1.peek();
        return it[0];
    }
    
    public int getMin() {
        var it=s1.peek();
        return it[1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */