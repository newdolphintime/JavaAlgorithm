package Sort;

/**
 * Created by zhangwei on 2017/8/11.
 * 归并排序
 */
public class mergeSort {
    public static void main(String[] args) {
        int[] a = {7, 47, 81, 95};
        int[] b = {7, 14, 39, 55, 62, 74};

        int[] c = new int[10];


        merge(a, b, c);

        display(c);


    }

    public static void merge(int[] a, int[] b, int[] c) {

        int aDex = 0, bDex = 0, cDex = 0;
        while (aDex < a.length && bDex < b.length) {
            if (a[aDex] < b[bDex]) {

                c[cDex++] = a[aDex++];

            } else {

                c[cDex++] = b[bDex++];

            }


        }
        //当B已经空了的时候


        while (aDex < a.length) {

            c[cDex++] = a[aDex++];

        }
        //当A已经空了的时候

        while (bDex < b.length) {

            c[cDex++] = b[bDex++];

        }
    }

    public static void display(int[] a) {

        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i] + " ");

        }
        System.out.println("");
    }

}
