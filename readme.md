## spring中基于xml的aop配置

   1. 把通知Bean也交给spring来管理  
   2. 使用aop:config标签表面开始aop的配置  
   3. 使用aop:aspect表面配置切面  
   id:给前面提供唯一标识  
   ref:通知类的id
   4. 在aop:aspect内部使用对应标签配置通知类型(前置通知,后置通知,异常通知,最终通知,环绕通知(在环绕通知中有明确的切入点方法调用))  
        * pointcut属性:用于指定切入点表达式,该方法表示对业务层中哪些方法进行增强

   * 切入点表达式:  
        * 关键字:execution(表达式)  
        
        * 表达式:  
        
           > 标准表达式 : 访问修饰符 返回值 包名.包名.包名...类名.方法名(参数列表)  
           >> 访问修饰符可以省略 : 返回值 包名.包名.包名...类名.方法名(参数列表)
           >>> 返回值可以使用通配符,表示任意返回值 : * 包名.包名.包名...类名.方法名(参数列表)
           >>>> 包名可以使用通配符,表示任意包名.但是有几个包,就需要写几个 *.  
           包名还可以再升级: 可以使用 .. 表示当前包及其子包 : * *..类名.方法名(参数列表)
           >>>>> 类名和方法名都可以使用通配符 : * \*..\*.*(参数列表)
           >>>>>> 参数可以直接写数据类型(int / java.lang.String)  
           也可使用统配符表示任意参数,但必须要有参数  
           也可以使用 .. 有无参数均可 : * \*..\*.*(..) 即全通配
        
        * 通常使用的统配方式为对业务层实现类的方法进行统配 : * cn.imust.service.impl.\*.\*(..)
            