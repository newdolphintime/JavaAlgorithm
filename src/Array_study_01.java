/**
 * Created by zhangwei on 2017/7/18.
 * 什么都不想写
 */
public class Array_study_01 {

    public static void main(String[] args) {

        int intArray[] = new int[10];
        //数组的长度属性
        int arrayLength = intArray.length;
        System.out.println("该数组的长度" + arrayLength);

        int itemnum;//不为空的元素个数

        int j; //计数器

        int serchkey;

        intArray[0] = 11;
        intArray[1] = 22;
        intArray[2] = 99;
        intArray[3] = 33;
        intArray[4] = 66;
        intArray[5] = 55;
        
        intArray[6] = 77;
        intArray[7] = 43;
        intArray[8] = 22;
        intArray[9] = 67;

        itemnum = 10;

        for (int i = 0; i < itemnum; i++) {
            System.out.print(intArray[i] + " ");

        }
        System.out.println("");
        /*
        *
        * find 查找
        *
        *
        * */

        serchkey = 66;
        for (j = 0; j < itemnum; j++) {
            if (intArray[j] == serchkey){
                break;
            }
        }
        if (j == itemnum){
            System.out.println("can not find");
        }else {
            System.out.println("找到了在"+j+"位置");
        }

        /*
        *
        *
        * delete 删除
        *
        * */

        serchkey = 99;
        for (j = 0; j < itemnum; j++) {
            if (intArray[j] == serchkey){
                break;
            }
        }
        for (int i = j; i < itemnum-1; i++) {

            intArray[i]=intArray[i+1];

        }
        itemnum -- ;
        for (int i = 0; i < itemnum; i++) {
            System.out.print(intArray[i] + " ");

        }


    }


}

