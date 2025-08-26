import java.util.Stack;

public class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int index = 0;

        while (index < heights.length) {
            if (stack.isEmpty() || heights[stack.peek()] <= heights[index]) {
                stack.push(index++);
            } else {
                int top = stack.pop();
                int width = stack.isEmpty() ? index : index - stack.peek() - 1;
                maxArea = Math.max(maxArea, heights[top] * width);
            }
        }

        while (!stack.isEmpty()) {
            int top = stack.pop();
            int width = stack.isEmpty() ? index : index - stack.peek() - 1;
            maxArea = Math.max(maxArea, heights[top] * width);
        }

        return maxArea;
    }
}
