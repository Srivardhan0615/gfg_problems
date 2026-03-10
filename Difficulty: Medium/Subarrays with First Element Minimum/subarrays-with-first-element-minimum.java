class Solution {
    public int countSubarrays(int[] arr) {

        int n = arr.length;
        int count = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i = n - 1; i >= 0; i--) {

            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }

            if(stack.isEmpty()) {
                count += n - i;
            } else {
                count += stack.peek() - i;
            }

            stack.push(i);
        }

        return count;
    }
}