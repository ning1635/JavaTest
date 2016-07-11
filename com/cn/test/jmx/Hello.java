package com.cn.test.jmx;

public class Hello implements HelloMBean{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void printHello(){
		System.out.println("printHello no args");
	}
	public void printHello(String s){
		System.out.println("printHello args is " + s);
	}
}
