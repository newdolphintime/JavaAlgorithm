package Link;

/**
 * Created by zhangwei on 2017/8/1.
 */
public class Link {
    public int dData;
    public Link next;

    //特地为双端链表添加的属性 该连接点的前一个元素
    public Link previous;

    public Link(int dd) {
        dData = dd;
    }

    public void displayLink() {
        System.out.print(dData+" ");
    }
}
