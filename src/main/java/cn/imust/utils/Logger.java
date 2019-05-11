package cn.imust.utils;

/**
 * 用于记录日志的工具类,提供公共代码
 */
public class Logger {

    /**
     * 前置通知
     */
    public void beforePrint(){
        System.out.println("前置通知......");
    }

    /**
     * 后置通知
     */
    public void afterReturningPrint(){
        System.out.println("后置通知......");
    }

    /**
     * 异常通知
     */
    public void afterThrowingPrint(){
        System.out.println("异常通知......");
    }

    /**
     * 最终通知
     */
    public void afterPrint(){
        System.out.println("最终通知......");
    }


}
