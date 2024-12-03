/*
 * Create a data structure twoStacks that represent two stacks. Implementation of twoStacks should use only one array, i.e., both stacks should use the same array for storing elements. 


Following functions must be supported by twoStacks.


push1(int x) –> pushes x to first stack 
push2(int x) –> pushes x to second stack
pop1() –> pops an element from first stack and return the popped element 
pop2() –> pops an element from second stack and return the popped element

Implementation of twoStack should be space efficient.


 */

package Array;

public class implement_two_stack_array {

    int size;
    int top1, top2;
    int arr[];

    public implement_two_stack_array(int n){
        arr = new int[n];
        size = n;
        top1 = -1; top2 = size;
    }

    public void push1(int x){
        if(top1 < top2 - 1){
            top1++;
            arr[top1] = x;
        }else{
            System.out.println("Stack overflow");
            System.exit(1);
        }
    }

    public void push2(int x){
        if(top1 < top2 - 1){
            top2--;
            arr[top2] = x;
        }else{
            System.out.println("Stack overflow");
            System.exit(1);
        }
    }

    int pop1(){
        if(top1 >= 0){
            int x = arr[top1];
            top1--;
            return x;
        }else{
            System.out.println("Stack Overflow");
            System.exit(1);
        }
        return 0;
    }

    int pop2(){
        if(top2 < size){
            int x = arr[top2];
            top2++;
            return x;
        }else{
            System.out.println("Stack Overflow");
            System.exit(1);
        }
        return 0;
    }

    public static void main(String[] args) {
        implement_two_stack_array ts = new implement_two_stack_array(5);
        ts.push1(5);
        ts.push2(10);
        //ts.push3(15);
        ts.push1(11);
        ts.push2(7);
        System.out.println("Popped element from " + "stack1 is " + ts.pop1());
        ts.push2(40);
        System.out.println("Popped element from " + "stack2 is " + ts.pop2());
    }

}
