package com.jtl.try_;

/**
 * @author 蒋天乐
 * java学习用
 */
public class TryCatchDetail02 {
    public static void main(String[] args) {
        //1.如果try代码块有可能多个异常
        //2.可以使用多个catch分别捕获不同的异常，相应处理，但只能捕获一个异常
        //3.要求子类异常写在前面，父类异常写在后面
        // (如果写反会报错，编译器认为先捕获父类异常后，子类异常也被捕获了，再写在后面无意义)
        try {
            Person person = new Person();
            person = null;
            System.out.println(person.getName());//空指针异常
            int n1 = 1;
            int n2 = 0;
            System.out.println(n1 / n2);//算数异常
        } catch (NullPointerException e) {
            System.out.println("空指针异常：" + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("算数异常：" + e.getMessage());
        } catch (Exception e) {
            System.out.println("发生异常：" + e.getMessage());
        } finally {
            System.out.println("善后工作...");
        }
        System.out.println("程序继续执行...");
        //4.可以用try-finally配合使用，这种用法相当于没有捕获异常，因此程序会直接崩溃
        //应用场景：就是执行一段代码，不管是否发生异常，都必须执行某个业务逻辑时
        try{
            int n1 = 1;
            int n2 = 0;
            //有异常但没捕获，执行完下面的finally后直接崩溃，不执行最后一句输出
            System.out.println(n1 / n2);
        }finally{
            System.out.println("执行了finally...");
        }
        System.out.println("程序继续执行...");
    }
}

class Person {
    private String name = "jtl";

    public String getName() {
        return name;
    }
}
