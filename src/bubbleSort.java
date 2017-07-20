/**
 * Created by zhangwei on 2017/7/20.
 * 冒泡排序
 */
public class bubbleSort {
    static int[] a = new int[10];

    public static void main(String[] args) {

        a[0] = 22;
        a[1] = 43;
        a[2] = 21;
        a[3] = 29;
        a[4] = 73;
        a[5] = 64;
        a[6] = 76;
        a[7] = 98;
        a[8] = 69;
        a[9] = 23;
        System.out.println("排序前");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    swap(j, j + 1);
                }
            }
        }
        System.out.println("排序后");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }


    }

    public static void swap(int one, int two) {
        int temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

}
