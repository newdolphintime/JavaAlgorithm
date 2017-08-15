package Sort;

/**
 * Created by zhangwei on 2017/8/12.
 * 完整版的归并排序
 *
 */
public class MergeSortX {
    public static void main(String[] args) {
        //int[] data = new int[]{5,3,6,2,1,9,4,8,7};
        int[] data = new int[]{64, 21, 70, 33};

        System.out.println("排序前的数组");
        print(data);
        mergeSort(data);
        System.out.println("排序后的数组");
        print(data);
    }

    public static void mergeSort(int[] data) {
        sort(data, 0, data.length - 1);


    }

    public static void sort(int[] data, int left, int right) {
        //记得是大于等于 不然会java.lang.StackOverflowError
        System.out.println("进入"+left+"--"+right);
        if (left >= right) {
            System.out.println("不行返回"+left+"-"+right);
            return;
        }
        //找出中间索引
        int center = (left + right) / 2;
        System.out.println("找到中间索引"+center);
        //对左边进行递归
        sort(data, left, center);
        //对右边进行递归
        sort(data, center + 1, right);
        //合并
        merge(data, left, center, right);
        print(data);
        System.out.println("退出》》》》》"+left+"--"+right);
    }

    /*
    *
    * 将两个数组进行归并，归并前两个数组有序，归并后依然有序
    *
    * @param data 数组对象
    *
    * left 左边数组第一个索引
    *
    * center 左数组最后一个索引 +1是右边数组第一个索引
    *
    * right 右数组最后一个索引
    * */
    public static void merge(int[] data, int left, int center, int right) {

        //临时数组
        int[] tmpArray = new int[data.length];

        //右边数组第一个元素索引
        int mid = center + 1;

        //cur记录临时数组的索引
        int cur = left;

        //缓存左数组第一个元素的索引
        int tmp = left;
        System.out.println("开始归并排序"+left+"--"+center+"和"+mid+"--"+right);

        while (left <= center && mid <= right) {
            if (data[left] <= data[mid]) {
                tmpArray[cur++] = data[left++];

            } else {
                tmpArray[cur++] = data[mid++];
            }
        }
        //剩余部分依次放入临时数组 两个只会执行其中一个
        while (mid <= right) {
            tmpArray[cur++] = data[mid++];

        }
        while (left <= center) {
            tmpArray[cur++] = data[left++];
        }

        while (tmp <= right) {
            data[tmp] = tmpArray[tmp++];
        }


    }

    public static void print(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }
}
