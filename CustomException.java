package com.jtl.customexception_;

/**
 * @author 蒋天乐
 * java学习用
 */
public class CustomException {
    public static void main(String[] args) {
        int age = 180;
        if(!(age >= 18 && age <= 120)){
            throw new AgeException("年龄需要在18-120");
        }
        System.out.println("年龄在正常范围内");
    }
}

//自定义一个异常
//1.一般情况继承RuntimeException
//2.把自定义异常做成运行时异常，可以使用默认处理机制
class AgeException extends RuntimeException{
    public AgeException(String message){
        super(message);
    }
}
