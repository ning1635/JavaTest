package com.rf.dtd.a1business;

import com.rf.dtd.a1business.domainObject.CommonColumnHeaderPO;
import org.apache.commons.beanutils.BeanUtils;
import java.util.Map;

public class Bean2Map{
	public static void main(String [] args) throws Exception{
		CommonColumnHeaderPO cc = new CommonColumnHeaderPO();
		cc.setField("field");	
		cc.setTitle("title");
		cc.setWidth("width");
		cc.setAlign("align");
		Map<String,String> map = BeanUtils.describe(cc);
		System.out.println(map.get("field").toString());
	}
}
