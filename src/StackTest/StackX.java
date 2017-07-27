package StackTest;

/**
 * Created by zhangwei on 2017/7/23.
 * 栈的结构特点后进先出
 */
public class StackX {
    private int maxSize;//栈的尺寸
    private char[] stackArray;
    private int top;

    public StackX(int maxSize) {

        this.maxSize = maxSize;
        stackArray = new char[this.maxSize];
        top = -1;
    }

    //推入操作
    public void push(char c) {
        stackArray[++top] = c; //top先加再操作
    }

    //推出一个元素
    public char pop() {
        return stackArray[top--];//top先推出再操作
    }

    //查看栈顶元素
    public char peek() {
        return stackArray[top];
    }
    //查看是不是空栈
    public boolean isEmpty() {
        return (top == -1);
    }

}
