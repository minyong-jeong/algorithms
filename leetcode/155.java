/*
    https://leetcode.com/problems/min-stack/
    155. Min Stack (Easy)
*/
import java.util.ArrayList;

class MinStack {
    private int top;
    private ArrayList<Node> stack;

    /** initialize your data structure here. */
    public MinStack() {
        this.top = -1;
        this.stack = new ArrayList<Node>();
    }
    
    public void push(int x) {
        if (top == -1) {
            this.stack.add(++top, new Node(x, x));
        }
        else {
            int min = stack.get(top).min;
            this.stack.add(++top, new Node((min > x) ? x : min, x));
        }
    }
    
    public void pop() {
        this.stack.remove(top--);
    }
    
    public int top() {
        return this.stack.get(top).num;
    }
    
    public int getMin() {
        return this.stack.get(top).min;
    }
    
    class Node {
        public int min;
        public int num;
        
        public Node(int min, int num){
            this.min = min;
            this.num = num;
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */