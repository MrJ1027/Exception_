package com.jtl.try_;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author 蒋天乐
 * java学习用
 */
public class TryCatchExercise {
    public static void main(String[] args) {
        boolean loop = true;
        do{
            Scanner scanner = new Scanner(System.in);
            try{
                System.out.println("请输入一个整数：");
                int input = scanner.nextInt();//此处可能抛出异常,直接去catch块了
                System.out.println("输入的整数是：" + input);

            }catch(Exception e){
                System.out.println("错误信息：你输入的不是整数");
            }
            System.out.println("是否退出y");
            scanner.nextLine();//清除上次输入...
            String choice = scanner.next();
            if(choice.equals("y")){
                loop = false;
            }

        }while(loop);
    }
}
