package Link;

/**
 * Created by zhangwei on 2017/8/1.
 */
public class Link {
    public int dData;
    public Link next;

    public Link(int dd) {
        dData = dd;
    }

    public void displayLink() {
        System.out.print(dData+" ");
    }
}
