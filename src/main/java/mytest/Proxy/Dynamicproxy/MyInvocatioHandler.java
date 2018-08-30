package mytest.Proxy.Dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocatioHandler implements InvocationHandler {

	Object target;
	public MyInvocatioHandler(Object target) {
		this.target = target;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		 System.out.println("-----before-----");
	       // Object result = method.invoke(target, args);
	        System.out.println("-----end-----");
	        return "代理了，但是不运行程序";
	}
	 // 生成代理对象
    public Object getProxy() {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        //获得对象的类类型
        Class<? extends Object> class1 = target.getClass();
        System.out.println(class1.getName());
        Class<?>[] interfaces = class1.getInterfaces();
       for(int i=0;i<interfaces.length;i++){
    	   Class<?> class2 = interfaces[i];
    	   System.out.println(class2.getName());
       }
        return Proxy.newProxyInstance(loader, interfaces, this);
    }

}
