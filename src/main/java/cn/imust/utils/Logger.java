package cn.imust.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 用于记录日志的工具类,提供公共代码
 */
@Component("logger")
@Aspect //表示当前类为一个切面类
public class Logger {

    @Pointcut("execution(* cn.imust.service.impl.*.*(..))")
    private void pt1(){}

    /**
     * 前置通知
     */
//    @Before("pt1()")
    public void beforePrint(){
        System.out.println("前置通知......");
    }

    /**
     * 后置通知
     */
//    @AfterReturning("pt1()")
    public void afterReturningPrint(){
        System.out.println("后置通知......");
    }

    /**
     * 异常通知
     */
//    @AfterThrowing("pt1()")
    public void afterThrowingPrint(){
        System.out.println("异常通知......");
    }

    /**
     * 最终通知
     */
//    @After("pt1()")
    public void afterPrint(){
        System.out.println("最终通知......");
    }


    /**
     * 环绕通知
     * 问题：
     *      当我们配置了环绕通知之后，切入点方法没有执行，而通知方法执行了。
     * 分析：
     *      通过对比动态代理中的环绕通知代码，发现动态代理的环绕通知有明确的切入点方法调用，而我们的代码中没有。
     * 解决：
     *      Spring框架为我们提供了一个接口：ProceedingJoinPoint。该接口有一个方法proceed()，此方法就相当于明确调用切入点方法。
     *      该接口可以作为环绕通知的方法参数，在程序执行时，spring框架会为我们提供该接口的实现类供我们使用。
     *
     * spring中的环绕通知：
     *      它是spring框架为我们提供的一种可以在代码中手动控制增强方法何时执行的方式。
     */
    @Around("pt1()")
    public Object arroundPrint(ProceedingJoinPoint pjp){

        Object returnValue = null;
        try {
            //得到方法执行所需的参数
            Object[] args = pjp.getArgs();
            System.out.println("环绕通知......前置");
            returnValue = pjp.proceed(args);//明确调用业务层方法（切入点方法）
            System.out.println("环绕通知......后置");
            return returnValue;
        } catch (Throwable throwable) {
            System.out.println("环绕通知......异常");
            throw new RuntimeException(throwable);
        }finally {
            System.out.println("环绕通知......最终");
        }
    }


}
