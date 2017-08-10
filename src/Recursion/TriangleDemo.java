package Recursion;

/**
 * Created by zhangwei on 2017/8/8.
 */
public class TriangleDemo {
    static int theNumber;

    public static void main(String[] args) {
        theNumber = triangle(5);
        System.out.println(theNumber);
    }

    public static int triangle(int n){
        if(n==1){
            return 1;

        }else{
            //递归
            return (n+triangle(n-1));
        }
    }

}
