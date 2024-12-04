/*
 * Maximum index a pointer can reach in N steps by avoiding a given index B
Last Updated : 29 Nov, 2023
Given two integers N and B, the task is to print the maximum index a pointer, starting from 0th index can reach in an array of natural numbers(i.e., 0, 1, 2, 3, 4, 5…), say arr[], in N steps without placing itself at index B at any point.


In each step, the pointer can move from the Current Index to a Jumping Index or can remain at the Current Index. 
Jumping Index = Current Index + Step Number

Examples:
Input: N = 3, B = 2
Output: 6
Explanation: 

Step 1:
Current Index = 0
Step Number = 1
Jumping Index = 0 + 1 = 1
Step 2:Current Index = 1
Step Number = 2
Jumping Index = 1 + 2 = 3
Step 3:
Current Index = 3
Step Number = 3
Jumping Index = 3 + 3 = 6
Therefore, the maximum index that can be reached is 6.


Input: N = 3, B = 1
Output: 5
Explanation: 


Step 1:
Current Index = 0
Step Number = 1
Jumping Index = 0 + 1 = 1But this is bad index. So pointer remains at the Current Index.
Step 2:
Current Index = 0
Step Number = 2
Jumping Index = 0 + 2 = 2
Step 3:
Current Index = 2
Step Number = 3
Jumping Index = 2 + 3 = 5
Therefore, the maximum index that can be reached is 5.
 */
package Array;

public class Maxium_Index {
    public static void main(String[] args) {
        int N = 3; 
        int B = 2;
        System.out.println(max_reachabe_index(N, B));
        System.out.println(max_reachabe_index_II(N, B));
    }

    static int max_reachabe_index(int N, int B){
        int max_index = 0; for(int i=0; i<N; i++){
            if(i != B){
                max_index += Math.pow(2, N-i-1);
            }
        }
        return max_index;
    }

    static int max_reachabe_index_II(int N, int B){
        int s = 0; // Initialize a variable 's' to keep track of the current sum.
        for(int i=1; i<=N; i++){  // Loop through natural numbers from 1 to N.
            s += i;    // Add the current number 'i' to the sum 's'.
            if(s == B){   // If the sum 's' equals 'B', we found the answer.
                //  Calculate the sum of natural numbers from 1 to N using the formula.
                int sum_of_natural_nos = N*(N+1)/2;
                return sum_of_natural_nos -1;   // Return N-1 as the maximum index.
            }
        }
        return s;   // If we didn't find a match, return the current sum 's'.
    }
}
