package Link;

/**
 * Created by zhangwei on 2017/8/6.
 */
public class LinkList {
    private Link first;

    public LinkList(){
        first = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insertFirst(int dd){
        Link newLink  = new Link(dd);
        newLink.next = first;
        first = newLink;
    }

    public int deleteFirst(){
        Link temp = first;
        first = first.next;
        return temp.dData;
    }

    public void displayList(){
        Link current = first;
        while (current!=null){
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}
