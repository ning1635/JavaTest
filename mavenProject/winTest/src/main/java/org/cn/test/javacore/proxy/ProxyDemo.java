package com.rf.dtd.a1business;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class ProxyDemo{

	public static void main(String[] args){

		Object proxyObj = Proxy.newProxyInstance(
				ClassLoader.getSystemClassLoader(),
				new Class[]{List.class},
				new A());
		List list = (List)proxyObj;
		list.add(100);
		list.add("abc");
		System.out.println(list.size());
		System.out.println(list.get(1));
	}
	static class A implements InvocationHandler{

		private List list = new ArrayList();
		@Override
		public Object invoke(Object proxy,Method method,Object[] args) throws Throwable{
			System.out.println("您现在执行的是"+method.getName()+"方法...");
			return method.invoke(list,args);
		}
	}
}
