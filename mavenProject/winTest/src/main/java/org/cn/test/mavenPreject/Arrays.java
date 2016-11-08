/*
 * Arrays.asList()字符串数组转化List
 * Arrays.toString()将字符串数组转化成字符串
 *
 */



import java.util.Arrays;
import java.util.List;

class ArraysTest{
	public static void main(String []args){
		List<String> list = Arrays.asList("LiZhong","ChangMing","WuDi");
		list.stream().
			sorted().
			forEach(System.out::println);
		System.out.println(Arrays.toString((String[])list.toArray(new String[list.size()])));
	}
}
