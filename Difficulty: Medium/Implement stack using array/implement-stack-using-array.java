class myStack {
    int top;
    int cap;
    int[] arr;
    public myStack(int n) {
        // Define Data Structures
        arr = new int[n];
        top = -1;
        cap = n;
    
    }

    public boolean isEmpty() {
        // check if the stack is empty
        return top == -1;
    }

    public boolean isFull() {
        // check if the stack is full
        return top == cap - 1;
    }

    public void push(int x) {
        // Inserts x at the top of the stac
        if(!isFull()){
            top++;
            arr[top] = x;
        }
        
    }

    public void pop() {
        if(!isEmpty()){
            top--;
            
        }
        
    }

    public int peek() {
        return (isEmpty()) ? -1 : arr[top];
        
    }
    
}