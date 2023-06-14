package hw_2023_03_02;

import java.util.*;

public class twoStackQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        System.out.println("---------Queue--------------");
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue.remove());
        System.out.println(queue);

        System.out.println("-----------MyQueueTwoS----------------");
        MyQueueTwoStack<String> queueTwoStack = new MyQueueTwoStack<>();
        queueTwoStack.offerMyQueueTwoStack("aaa");
        queueTwoStack.offerMyQueueTwoStack("bbb");
        queueTwoStack.offerMyQueueTwoStack("ccc");
        queueTwoStack.offerMyQueueTwoStack("ddd");
        queueTwoStack.offerMyQueueTwoStack("eee");
        System.out.println(queueTwoStack);
        System.out.println(queueTwoStack.elementMyQueueTwoStack());
        System.out.println(queueTwoStack.pollMyQueueTwoStack());
        System.out.println(queueTwoStack.removeMyQueueTwoStack());
        System.out.println(queueTwoStack);
    }
}

class MyQueueTwoStack<T> {
    private Stack<T> stackIn = new Stack<>();
    private Stack<T> stackOut = new Stack<>();

    boolean offerMyQueueTwoStack(T el) {
        int tmp = stackIn.size();
        stackIn.add(el);
        return stackIn.size() == tmp + 1;
    }

    T pollMyQueueTwoStack() {
        if (stackIn.isEmpty()) {
            return null;
        }
        copyToOut();
        T tmp = stackOut.pop();
        copyToIn();
        return tmp;
    }

    T elementMyQueueTwoStack() {
        if (stackIn.isEmpty()) {
            throw new NoSuchElementException();
        }
        copyToOut();
        T tmp = stackOut.peek();
        copyToIn();
        return tmp;
    }

    T removeMyQueueTwoStack() {
        if (stackIn.isEmpty()) {
            throw new NoSuchElementException();
        }
        copyToOut();
        T tmp = stackOut.pop();
        copyToIn();
        return tmp;
    }

    private void copyToOut() {
        for (int i = stackIn.size(); i > 0; i--) {
            stackOut.add(stackIn.pop());
        }
    }

    private void copyToIn() {
        for (int i = stackOut.size(); i > 0; i--) {
            stackIn.add(stackOut.pop());
        }
    }

    @Override
    public String toString() {
        return stackIn.toString();
    }
}
