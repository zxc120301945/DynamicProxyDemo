package com.wzy.dynamic.proxy;

import com.wzy.dynamic.proxy.dproxy.BusinessHandler;
import com.wzy.dynamic.proxy.dproxy.Ibusiness;
import com.wzy.dynamic.proxy.dproxy.OneBusiness;
import com.wzy.dynamic.proxy.sproxy.SProxy;

import java.lang.reflect.Proxy;

/**
 * @author WanZhiYuan
 * @date 2020/03/27 0027
 * http://note.youdao.com/noteshare?id=2dd3446b055037d6802cbbbea3aeb760&sub=790C683767B84E88A431B1BBCB84B9EB
 */
public class Demo {
    public static void main(String[] args) {
//        staticProxy();
//        dynamicProxy();
    }

    /**
     * 静态代理
     * 优点：隐藏了真正的功能细节，同时能增加和功能无关的业务，可以系统的解耦并且起到了保护目标对象的作用
     * 缺点：过多的代理类会导致重复模板增加，基础接口的扩展会导致相关代理类和目标对象都要进行修改
     */
    private static void staticProxy() {
        SProxy proxy = new SProxy();
        proxy.buyMac("小明");
        proxy.buyMac("小蓝");
        proxy.buyFruit("小明", "香蕉");
    }

    /**
     * 动态代理
     * 优点：一定程度上避免了使用静态代理的缺点同时也能有用静态代理的优点
     * 缺点：内部是通过反射来调用基础接口相关功能，如果基础接口函数过多都会被扫描到内存中去，会稍微影响性能
     */
    private static void dynamicProxy() {
        //设置这个配置可以生成对应的代理类字节码文件 -> com/sun/proxy/$Proxy().class，但是一定要在main函数中调用
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        OneBusiness business = new OneBusiness();
        BusinessHandler handler = new BusinessHandler(business);
        Ibusiness ibusiness = (Ibusiness) Proxy.newProxyInstance(business.getClass().getClassLoader(), business.getClass().getInterfaces(), handler);
        ibusiness.business();

        //字节码文件对应路径名
        System.out.println("Proxy0.class全名:" + Proxy.getProxyClass(business.getClass().getClassLoader(), business.getClass().getInterfaces()));
    }
}
