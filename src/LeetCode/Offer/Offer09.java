package LeetCode.Offer;

import java.util.Stack;

/**
 * @program: LoveJava
 * @author: JiaLe Hu
 * @create: 2020-10-27 10:07
 **/

public class Offer09 {
    public static void main(String[] args) {
        CQueue cQueue = new CQueue();
    }
}

class CQueue {
    private Stack<Integer> s1;
    private Stack<Integer> s2;


    public CQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void appendTail(int value) {
        s1.push(value);
    }

    public int deleteHead() {
        if (s1.empty() && s2.empty()) return -1;
        while (!s1.empty()) {
            s2.push(s1.pop());
        }
        int top = s2.pop();
        while (!s2.empty()) {
            s1.push(s2.pop());
        }
        return top;
    }
}
