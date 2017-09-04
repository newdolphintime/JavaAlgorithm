/**
 * Created by zhangwei on 2017/7/22.
 */
public class insertSort {
    public static void main(String[] args) {
        int a[] = {76, 43, 35, 67};
        showArray(a);
        insertSort(a);
        showArray(a);


    }

    public static void insertSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                } else {

                    break;//左边已经是有序的了，不需要再排序了 。
                }
            }

        }

    }

    public static void showArray(int[] a) {
        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
}
