class MyQueue {
    Queue<Integer> q1=new ArrayDeque<>();
    public MyQueue() {//constructor
        
    }
    
    public void push(int x) {
        q1.offer(x);
    }
    
    public int pop() {
        int val=q1.peek();
        q1.poll();
        return val;
    }
    
    public int peek() {
        return q1.peek();
    }
    
    public boolean empty() {
        if(q1.isEmpty()==true){
            return true;
        }
        return false;
    }
    
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */