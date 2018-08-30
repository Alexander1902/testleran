package mytest.Proxy.Dynamicproxy;

import java.lang.reflect.Proxy;

import mytest.Proxy.staticproxy.Animal;
import mytest.Proxy.staticproxy.Lion;

public class Main {

	public static void main(String[] args) {
		Animal animal = new Lion();
		MyInvocatioHandler handler = new MyInvocatioHandler(animal);
		
		Animal proxy = (Animal) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), 
				animal.getClass().getInterfaces(), handler);
		String eat = proxy.eat("兔子");
		System.out.println(eat);

	}

}
