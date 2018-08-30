package mytest.Proxy.Dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ReflectUtill {
	public static class MyInvocatioHandler2 implements InvocationHandler{
		Class<?> clazz= null;
		/*public MyInvocatioHandler2(Class<?> clazz) {
			this.clazz = clazz;
		}*/

		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			/*Method[] declaredMethods = proxy.getClass().getDeclaredMethods();
			for(Method m:declaredMethods){
				System.out.println(m.getName());
			}
			System.out.println("----------------");*/
			System.out.println(proxy.getClass().isInterface());
			Object sendMessg = SocketUtill.sendMessg(proxy.getClass().getName(), method.getName(), 1,2,3,4,5);
			return sendMessg;
		}
	}
	
	 public static Object getProxy(Class<?>[] clazz){
		 ClassLoader loader = Thread.currentThread().getContextClassLoader();
		 Object newProxyInstance = Proxy.newProxyInstance(loader, clazz, new MyInvocatioHandler2());
		return newProxyInstance;
	 }
	
}
