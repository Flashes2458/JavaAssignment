/**
 * 斐波那契数列
 *
 * version 1.0
 *
 * author：薄福坤-2022263982
 *
 * date:2022/10/12 21:00
 */

import java.util.*;

public class Main {
    public static void main(String arg[]) {

        System.out.println("输入一个整数n：");

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if(n>=3) {                                 //判断n的输入是否合法
            int[] arr = Fibonacci(n);
            for (int i = 0; i < n; i++)
                System.out.print(arr[i]+",");
        }
        else
            System.out.println("n应该大于3");

    }
    public static int[] Fibonacci(int n) {         //循环的方式实现
        int[] array = new int[n];
        array[0] = 1;
        array[1] = 1;
        for(int i=2;i<n;i++){
            array[i] = array[i-1] + array[i-2];
        }
        return array;
    }
}


