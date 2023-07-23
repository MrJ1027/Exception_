package com.jtl.throws_;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author 蒋天乐
 * java学习用
 */
public class Throws01 {
    public static void main(String[] args) {

    }

    public void f1() throws FileNotFoundException {
        //创建了一个文件流对象：
        //1.这里的异常：FileNotFoundException 编译异常
        //2.可以使用try-catch-finally
        //3.使用throws，抛出异常,让调用f1方法的调用者(方法)处理，而该方法(f1)并不处理这些异常
        //4.throws后面的异常类型可以是方法中的异常类型，也可以是它的父类，比如上面写成 throws Exception
        //5.throws 关键字后也可以是 异常列表，即可以抛出多个异常
        FileInputStream files = new FileInputStream("d://abc.png");
    }
}

