package com.gupaoedu.vip.spring.formework.aop.intercept;

/**
 * Created by Tom on 2019/4/14.
 * 方法拦截器顶层接口。
 */
public interface GPMethodInterceptor {
    Object invoke(GPMethodInvocation invocation) throws Throwable;
}
