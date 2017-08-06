package Link;

/**
 * Created by zhangwei on 2017/8/6.
 */
public class LinkStack {
    private LinkList theList;

    public LinkStack() {
        theList = new LinkList();
    }

    public void push(int dd){
        theList.insertFirst(dd);
    }

    public int pop(){
        return theList.deleteFirst();
    }

    public boolean isEmpty(){
        return theList.isEmpty();
    }
    public void displayStack(){
        System.out.println("Stack (top -----> bottom)");
        theList.displayList();
    }

    public static void main(String[] args) {
        LinkStack theStack = new LinkStack();
        theStack.push(20);
        theStack.push(40);
        theStack.displayStack();
        theStack.push(60);
        theStack.push(90);
        theStack.displayStack();

        theStack.pop();
        theStack.pop();

        theStack.displayStack();
    }
}
