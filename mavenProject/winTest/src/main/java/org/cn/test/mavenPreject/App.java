package org.cn.test.mavenProject;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import org.cn.test.mavenProject.MyValue;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Iterator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main ( String[] args ) throws Exception
    {
        System.out.println( "Hello World!" );
	String json = "{\"name\":\"Bob\",\"age\":\"13\"}";
	System.out.println("-----------ObjectMapper.readValue(,object)--------------");
	ObjectMapper mapper = new ObjectMapper();
	MyValue value = mapper.readValue(json,MyValue.class);
	System.out.println(value.toString());
	System.out.println("-----------ObjectMapper.readValue(,object)--------------");
	System.out.println("-----------ObjectMapper.readValue(,list)--------------");
	//List list = mapper.readValue(json,List.class);
	//for(int i = 0;i < list.size();i++){
	//	System.out.println(list.get(i));
	//}
//	for(String l : list){
//		System.out.println(l);
//	}
	System.out.println("-----------ObjectMapper.readValue(,list)--------------");
	System.out.println("-----------ObjectMapper.readValue(,map)--------------");
	Map<String,String> map = mapper.readValue(json,Map.class);
	Iterator it = map.entrySet().iterator();
	while(it.hasNext()){
		Map.Entry entry = (Map.Entry)it.next();
		Object key = entry.getKey();
		Object v = entry.getValue();
		System.out.println(key + ":" + v);
	}
	System.out.println("-----------ObjectMapper.readValue(,map)--------------");
	System.out.println("-----------ObjectMapper.readTree--------------");
	JsonNode root = mapper.readTree(json);
	System.out.println(root.get("name").asText() + ":" + root.get("age").asText());

	System.out.println("-----------ObjectMapper.readTree--------------");

    }

}
