package Recursion;

/**
 * Created by zhangwei on 2017/8/10.
 * 二分查找法（递归）
 */
public class RecFind {
    static int[] a = {0, 1, 2, 3, 4, 5};

    public static void main(String[] args) {
        int cur = recFind(4, 0, 5);
        System.out.println("位置为"+cur);
    }

    private static int recFind(int serchKey, int lowerBound, int upperBound) {
        int curIn;

        curIn = (lowerBound + upperBound) / 2;

        if (a[curIn] == serchKey) {
            return curIn;

        } else if (lowerBound > upperBound) {
            return -1;
        } else {
            if (a[curIn] < serchKey) {
                return recFind(serchKey, curIn + 1, upperBound);
            } else {
                return recFind(serchKey, lowerBound, curIn - 1);
            }
        }


    }
}
