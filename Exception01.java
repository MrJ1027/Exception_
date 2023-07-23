package com.jtl.exception_;

/**
 * @author 蒋天乐
 * java学习用
 */
public class Exception01 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 0;
        //引出：如果程序一旦有问题就直接崩溃，不太好，设计中提供了 异常处理机制来解决该问题
        //使用try-catch 异常处理机制解决
        //将代码块选中，选中快捷键 ctrl+alt+t -> try-catch
        //如果没有显示处理异常，默认使用了throws
        try {
            int res = num1 / num2;
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("程序还在执行");

    }
}
