package com.jtl.try_;

/**
 * @author 蒋天乐
 * java学习用
 */
public class TryCatchDetail {
    public static void main(String[] args) {
        //1.如果异常发生，则异常发生后面的代码不会执行，直接进入catch块
        //2.如果没有异常发生，则顺序执行try的代码块，不会进入到catch块
        //3.不管有没有异常，finally最后都得走一次(finally中实现关闭连接、释放资源等必要操作)
        //
        //
        //
        try {
            String str = "JTL";
            int a = Integer.parseInt(str);
            System.out.println("数字：" + a);
        }catch(NumberFormatException e){
            System.out.println("异常信息：" + e.getMessage());
        }finally{
            System.out.println("finally代码块被执行...");
        }
        System.out.println("程序继续执行...");
    }
}
