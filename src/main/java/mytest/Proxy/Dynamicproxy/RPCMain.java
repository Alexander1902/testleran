package mytest.Proxy.Dynamicproxy;

import mytest.Proxy.staticproxy.Animal;


public class RPCMain {

	public static void main(String[] args) {
		Class<?>[] clazz=new Class<?>[1];
		clazz[0]=Animal.class;
		Animal animal= (Animal) ReflectUtill.getProxy(clazz);
		String eat = animal.eat("参数");
		System.out.println(eat);

	}

}
