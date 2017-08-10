package Recursion;

/**
 * Created by zhangwei on 2017/8/10.
 * 二分查找法（递归）
 * 分治算法
 * 把一个大问题分成两个相对来说更小的问题，并且分别解决每一个小问题，
 * 对每一个小问题的解决方法是一样的，把每个小问题分成两个更小的问题，
 * 并且解决他们，这个过程一直持续到达到易于求解基值得情况就不需要继
 * 续分了
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
