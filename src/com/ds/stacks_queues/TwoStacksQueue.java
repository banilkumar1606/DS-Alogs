package com.ds.stacks_queues;

import java.util.Stack;

public class TwoStacksQueue {
    static class Queue{
        static Stack<Integer> stack1 = new Stack<>();
        static Stack<Integer> stack2 = new Stack<>();
        static void enqueueM1(int x){
            //Move all the elements from s1 to s2
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
            stack1.push(x);
            //push everything back to s1
            while(!stack2.empty()){
                stack1.push(stack2.pop());
            }
        }
        static int dequeueM1(){
            if(stack1.isEmpty()){
                System.out.println("Q is empty");
                System.exit(0);
            }
            return stack1.pop();
        }
        static void enqueueM2(int x){
           stack1.push(x);
        }
        static int dequeueM2() {
            if (stack1.isEmpty() && stack2.isEmpty()) {
                System.out.println("Q is empty");
                System.exit(0);
            }
            else if(stack2.isEmpty() && !stack1.isEmpty()){
                //Push everything from s1 to s2
                while(!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
            }
            if(stack2.isEmpty()){
                System.out.println("Q is empty");
                System.exit(0);
            }
            return stack2.pop();
        }

    }
    public static void main(String[] args) {
        Queue q = new Queue();
      //  q.enqueueM1(1);
       // q.enqueueM1(2);
     //   q.enqueueM1(3);

        q.enqueueM2(1);
        q.enqueueM2(2);
        q.enqueueM2(3);

        System.out.println(q.dequeueM2());
        System.out.println(q.dequeueM2());
        System.out.println(q.dequeueM2());

    }

}
