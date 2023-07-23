package com.jtl.customexception_;

import java.util.Scanner;

/**
 * @author 蒋天乐
 * java学习用
 */
public class Homework01 {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            double res = cal(n1,n2);
            System.out.println(res);
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }catch(NumberFormatException e){
            System.out.println("参数格式不正确，需要输入整数");
        }catch(ArithmeticException e){
            System.out.println("出现了算数异常");
        }
    }
    public static int cal(int n1, int n2){
        return n1 / n2;
    }
}
