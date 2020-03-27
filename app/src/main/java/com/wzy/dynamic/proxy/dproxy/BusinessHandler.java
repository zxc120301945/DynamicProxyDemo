package com.wzy.dynamic.proxy.dproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author WZY
 * @date 2020/03/26
 */
public class BusinessHandler implements InvocationHandler {

    private Ibusiness ibusiness;

    public BusinessHandler(Ibusiness bui) {
        ibusiness = bui;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("外出前先收拾垃圾");
        try {
            method.invoke(ibusiness, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("外出回来了");
        return null;
    }

}
