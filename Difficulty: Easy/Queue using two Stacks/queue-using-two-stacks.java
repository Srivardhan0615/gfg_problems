class StackQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();


    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
     
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

    
        if (stack2.isEmpty()) {
            return -1;
        }

        return stack2.pop();
    }
}