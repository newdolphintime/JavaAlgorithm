package Sort;

/**
 * Created by zhangwei on 2017/8/16.
 * 希尔排序
 *
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] a = new int[]{7,4,6,78,4,2,9,7,0};
        shellSort1(a);
        print(a);
    }
    public static void shellSort1(int[] a) {
        for (int gap = a.length / 2; gap > 0; gap = gap / 2) {
            for (int i = 0; i < gap; i++) {
                for (int j = i + gap; j < a.length; j = j + gap) {
                    if (a[j] < a[j - gap]) {
                        int tmp = a[j];
                        int k = j - gap;
                        while (k >= 0 && a[k] > tmp) {
                            a[k+gap]=a[k];
                            k=k-gap;

                        }
                        a[k+gap]= tmp;
                    }
                }
            }

        }
    }
    public static void print(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }

}
