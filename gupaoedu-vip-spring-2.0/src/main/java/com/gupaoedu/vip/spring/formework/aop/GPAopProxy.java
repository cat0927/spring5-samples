package com.gupaoedu.vip.spring.formework.aop;

/**
 * Created by Tom.
 *
 * 代理工厂的顶层接口。
 */
public interface GPAopProxy {


    Object getProxy();


    Object getProxy(ClassLoader classLoader);
}
