package cn.imust.test;


import cn.imust.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {
    public static void main(String[] args) {
        //1.获取容器
        //使用xml
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:bean.xml");
        //使用注解
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:bean-anno.xml");
        //2.获取对象
        IAccountService accountService = (IAccountService) applicationContext.getBean("accountService");
        //3.执行方法
//        accountService.saveAccount();
        accountService.updateAccount(5);
//        accountService.deleteAccount();
    }
}
