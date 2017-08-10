package Recursion;

/**
 * Created by zhangwei on 2017/8/8.
 */
public class TriangleDemo {
    static int theNumber;

    public static void main(String[] args) {
        theNumber = triangle(5);
        System.out.println("三角数字"+theNumber);
        theNumber = triangle(3);
        System.out.println("阶乘"+theNumber);
    }

    public static int triangle(int n) {
        if (n == 1) {
            return 1;

        } else {
            //递归
            //调用自身
            //存在某个足够简单的问题层次，小道不需要调用自己也可以解答
            return (n + triangle(n - 1));
        }
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;

        } else {
            //阶乘
            return (n * factorial(n - 1));
        }
    }

}
