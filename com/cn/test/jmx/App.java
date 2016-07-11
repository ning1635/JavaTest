package com.cn.test.jmx;

import javax.management.MBeanServer;
import javax.management.MBeanServerFactory;
import javax.management.ObjectName;
import com.sun.jdmk.comm.HtmlAdaptorServer;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		MBeanServer server = MBeanServerFactory.createMBeanServer();
		
		ObjectName object = new ObjectName("chengang:name=HelloWord");
		server.registerMBean(new Hello(), object);

		ObjectName adapterName = new ObjectName("HelloAgent:name=htmladapter,port=8082");
        HtmlAdaptorServer adapter = new HtmlAdaptorServer();
        server.registerMBean(adapter, adapterName);
		
        adapter.start();
        System.out.print("start.....");
	}

}
