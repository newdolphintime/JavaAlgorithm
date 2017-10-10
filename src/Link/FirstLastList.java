package Link;

/**
 * Created by zhangwei on 2017/8/2.
 * 双端链表
 */
public class FirstLastList {

    private Link first;

    private Link last;

    public FirstLastList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int dd) {

        Link newLink = new Link(dd);

        if (isEmpty()) {
            last = newLink;
        }
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(int ss) {
        Link newLink = new Link(ss);
        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
        }
        last = newLink;
    }

    public int deleteFirst()

    {
        int temp = first.dData;
        if (first.next == null) {
            last = null;
        }
        first = first.next;
        return temp;
    }
    public void displayList(){
        System.out.print("List (first---->last):");
        Link current = first;
        while (current!=null){
            current.displayLink();
            current= current.next;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        FirstLastList firstLastList = new FirstLastList();
        firstLastList.insertFirst(30);
        firstLastList.insertFirst(20);
        firstLastList.insertFirst(10);
        firstLastList.displayList();
        firstLastList.insertLast(50);
        firstLastList.insertLast(40);
        firstLastList.insertLast(80);
        firstLastList.displayList();
    }
}
