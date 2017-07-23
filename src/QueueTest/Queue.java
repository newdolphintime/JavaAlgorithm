package QueueTest;

/**
 * Created by zhangwei on 2017/7/23.
 * 队列 先进先出 类似排队
 */
public class Queue {
    private int maxSize;
    private int[] queArray;
    private int front;//头部
    private int rear;//尾部
    private int nItems;//队列个数

    public Queue(int s) {
        maxSize = s;
        queArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;

    }

    /*
    * 插入的收从尾部插
    * */
    public void insert(int j) {
        //超出就清空
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queArray[++rear] = j;
        nItems++;
    }

    /*
    * 移除的时候从头部移除
    *
    * */
    public int remove() {
        //front往后移一位
        int temp = queArray[front++];
        //超出就清空
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return temp;

    }

    public int peekFront() {
        return queArray[front];
    }

    public boolean isFull() {
        return (nItems == 0);
    }

    public int size() {
        return nItems;
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.insert(2);
        queue.insert(1);
        queue.insert(3);
        queue.insert(4);
        queue.insert(6);

        queue.remove();
        queue.remove();
        queue.remove();

        int temp = queue.peekFront();
        System.out.println(temp);

    }
}

