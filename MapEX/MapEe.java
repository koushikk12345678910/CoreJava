package MapEX;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class MapEe {
public static void main(String[] args) {
	Map <Integer,String> a=new HashMap(); 
	a.put(1000, "ajay");
	a.put(1001, "rahul");
	a.put(1002, "trisha");
	a.put(1003, "samantha");
	a.put(1004, "nayanthara");
	System.out.println(a);
	for(Integer n:a.keySet())
	{
		System.out.println(n);
	}
	for(String s:a.values())
	{
		System.out.println(s);
	}
	for(Map.Entry<Integer,String> l:a.entrySet())

	{
		System.out.println(l.getKey()+":"+l.getValue());
	}
	
	
	
	
}
}