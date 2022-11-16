package test;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，
 * 分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead操作返回 -1 )
 */
public class Offer09 {
    Deque<Integer> inStack;
    Deque<Integer> outStack;

    public Offer09() {
        inStack = new ArrayDeque<>();
        outStack = new ArrayDeque<>();
    }
    

    public void appendTail(int value) {
        inStack.push(value);
    }

    public int deleteHead() {
        if (outStack.isEmpty()) {
            if (inStack.isEmpty()) {
                return -1;
            }
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
        return outStack.pop();
    }

}
