package com.cn.test.jmx;

public interface HelloMBean {
	public String getName();
	public void setName(String s);
	public void printHello();
	public void printHello(String s);
}
