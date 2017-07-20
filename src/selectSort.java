/**
 * Created by zhangwei on 2017/7/20.
 * public class Tester {
 * public static void counter(int count) {
 * count = 2;
 * }
 * <p>
 * public static void changeA1(int[] ints) {
 * int[] temp = { 4, 5, 6 };
 * ints = temp;
 * }
 * <p>
 * public static void changeA2(int[] ints) {
 * ints[0] = 4;
 * ints[1] = 5;
 * ints[2] = 6;
 * }
 * <p>
 * public static void main(String[] args) {
 * // Output: 1
 * // 基本数据类型没有改变。
 * int count = 1;
 * counter(count);
 * System.out.println("count: " + count);
 * <p>
 * <p>
 * int[] ints = { 1, 2, 3 };
 * <p>
 * // Output: 1, 2, 3
 * // 对数组赋值，不会改变原始数组。
 * changeA1(ints);
 * for (int i = 0; i < ints.length; i++) {
 * System.out.print(ints[i] + " ");
 * }
 * <p>
 * // Output: 4, 5, 6
 * // 可以对数组插入新的数据项。
 * System.out.println();
 * changeA2(ints);
 * for (int i = 0; i < ints.length; i++) {
 * System.out.print(ints[i] + " ");
 * }
 * }
 * }
 * Java是参数全是值传递.
 * counter(count);相当于复制了一个count传进去,你改动的是复本,所以不影响方法外的值
 * changeA1(ints);这和上面的相似,不过传的是一个引用的复本,此方法里是把复本的引用转向引用其它地方了,没有改变方法外部的引用,也就是说方法里面的引用和外面的引用指向了不同的地址,
 * changeA2(ints);虽然传的是引用的复本,但指向的是同一个地址,你用方法里面的引用改动它所指向的值,当然会影响所以指向此地址的引用
 */
public class selectSort {
    public static void main(String[] args) {
        int a[] = {76, 43, 35, 67};
        showArray(a);
        selectSortMethod(a);
        showArray(a);


    }


    public static void selectSortMethod(int[] a) {
        int minIndex = 0;//最小数据的下标
        int temp = 0;

        for (int i = 0; i < a.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
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
