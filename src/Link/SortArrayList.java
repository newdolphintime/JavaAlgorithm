package Link;

/**
 * Created by zhangwei on 2017/8/1.
 */
public class SortArrayList {
    private Link first;

    public SortArrayList() {
        first = null;
    }

    public SortArrayList(Link[] linkArr) {
        first = null;
        for (int i = 0; i < linkArr.length; i++) {
            insert(linkArr[i]);
        }
    }

    private void insert(Link k) {
        Link previous = null;
        Link current = first;

        while (current != null && k.dData > current.dData) {
            previous = current;
            current = current.next;
        }

        if (previous == null) {
            first = k;
        } else {
            previous.next = k;
        }
        k.next = current;


    }

    public Link remove() {
        Link temp = first;
        first = first.next;
        return temp;

    }

    public static void main(String[] args) {
        int size = 30;
        Link[] linkArray = new Link[size];
        for (int i = 0; i < linkArray.length; i++) {
            int n = (int) (java.lang.Math.random() * 99);
            Link newLink = new Link(n);
            linkArray[i] = newLink;
        }

        for (int i = 0; i < linkArray.length; i++) {
            System.out.print(linkArray[i].dData + " ");
        }
        System.out.println("");
        SortArrayList sortArrayList = new SortArrayList(linkArray);
        for (int i = 0; i < linkArray.length; i++) {
            linkArray[i] = sortArrayList.remove();
        }
        for (int i = 0; i < linkArray.length; i++) {
            System.out.print(linkArray[i].dData+" ");
        }
    }
}
