/**
 * Created by zhangwei on 2017/7/19.
 */
public class OrdArray {
    private int[] a; //数组
    private int nElems; //数组个数

    public OrdArray(int max) {
        a = new int[max];//初始化
        nElems = 0;
    }

    public int size() {
        return nElems;
    }

    //二分查找
    public int find(int searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn; //指针

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn] == searchKey) {
                return curIn;
            } else if (lowerBound > upperBound) {
                return nElems; //找不到需要的元素
            } else {
                if (a[curIn] < searchKey) {
                    lowerBound = curIn + 1;//去大的一半
                } else {
                    upperBound = curIn - 1;//去小的一半
                }
            }
        }
    }

    public void insert(int values) {//插入的时候从小到大排序
        int j;
        for (j = 0; j < nElems; j++) {//首先判断数组中的元素从什么时候开始比要插入的元素打了 记住数组的位置
            if (a[j] > values) {
                break;
            }
        }
        for (int k = nElems; k > j; k--) {//将该位置空出来，通过a[k] = a[k - 1]将元素往后移
            a[k] = a[k - 1];

        }
        a[j] = values;//将要插入的元素插入该位置
        nElems++;//元素的位置加一
    }

    public boolean delete(int value) {
        int j = find(value);
        if (j == nElems) {
            return false;
        } else {
            for (int k = j; k < nElems; k++) {
                a[k] = a[k - 1];

            }
            nElems--;
            return true;
        }
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(a[i] + " ");

        }
        System.out.println("");
    }

    public static void main(String[] args) {
        OrdArray o = new OrdArray(3);
        o.insert(40);
        o.insert(30);
        o.insert(20);
        int index = o.find(40);
    }
}
