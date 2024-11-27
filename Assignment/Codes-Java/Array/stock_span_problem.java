/*
 * The stock span problem is a financial problem where we have a series of N daily price quotes for a stock and we need to calculate the span of the stock’s price for all N days. The span Si of the stock’s price on a given day i is defined as the maximum number of consecutive days just before the given day, for which the price of the stock on the current day is less than or equal to its price on the given day. 

Examples:

Input: N = 7, price[] = [100 80 60 70 60 75 85]
Output: 1 1 1 2 1 4 6
Explanation: Traversing the given input span for 100 will be 1, 80 is smaller than 100 so the span is 1, 60 is smaller than 80 so the span is 1, 70 is greater than 60 so the span is 2 and so on. Hence the output will be 1 1 1 2 1 4 6.


Input: N = 6, price[] = [10 4 5 90 120 80]
Output:1 1 2 4 5 1
Explanation: Traversing the given input span for 10 will be 1, 4 is smaller than 10 so the span will be 1, 5 is greater than 4 so the span will be 2 and so on. Hence, the output will be 1 1 2 4 5 1.
 */

package Array;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class stock_span_problem {
    public static void main(String[] args) {
        int price[] = {10,4,5,90,120,80};
        int n = price.length;
        int s[] = new int[n];
        calculateSpan(price,n,s);
        printArray(s);
        calculateSpan_II(price,n,s);
        printArray(s);
    }

    static void calculateSpan(int price[], int n, int s[]){
        s[0] = 1;
        for(int i=1; i<n; i++){
            s[i] = 1;
            for(int j=i-1; (j>=0) && (price[i] >= price[j]); j--){
                s[i]++;
            }
        }
    }


     // A stack based efficient method to calculate
    // stock span values
    static void calculateSpan_II(int price[], int n, int s[]){
        // Create a stack and push index of first element to it
        Deque<Integer> st = new ArrayDeque<Integer>();
        // Stack<Integer> st = new Stack<>();
        st.push(0);
        // Span value of first element is always 1
        s[0] = 1;
        // Calculate span values for rest of the elements
        for(int i=1; i<n; i++){
            // Pop elements from stack while stack is not
            // empty and top of stack is smaller than
            // price[i]
            while(!st.isEmpty() && price[st.peek()] <= price[i]){
                st.pop();
            }
            // If stack becomes empty, then price[i] is
            // greater than all elements on left of it,
            // i.e., price[0], price[1], ..price[i-1]. Else
            // price[i] is greater than elements after top
            // of stack
            s[i] = (st.isEmpty() ? (i+1) : (i-st.peek()));
            // Push this element to stack
            st.push(i);
        }
    }

    // A utility function to print elements of array
    static void printArray(int arr[]){
        System.out.println(Arrays.toString(arr));
    }
}
