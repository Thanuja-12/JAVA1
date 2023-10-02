package com.tnsif.DayEight.map;

import java.util.*;
import com.tnsif.dayeighteen.Student;
class HashMapDemo 
{
	public static void main(String args[]) 
	{
		
	
		//Hashmap with String key and Integer Value - Sorted on Keys order
		HashMap<String,Integer> bookMap = new HashMap<String,Integer>();
		bookMap.put("Let Us C", 320);
		bookMap.put("The Complete Referece C++ ",450);
		bookMap.put("The Complete Referece Java 2",465);			
		bookMap.put("Python Programming",599);
		bookMap.put("Application Development using Spring Boot",600);
		System.out.println("Book Details are ");
		System.out.println(bookMap);
		
		
		System.out.println("Traversing a HashMap");
		Set set = bookMap.entrySet(); // Get a set of the entries
		Iterator i = set.iterator(); // Get an iterator
		while(i.hasNext()) { // Display elements
			Map.Entry me = (Map.Entry)i.next();
			System.out.println(me.getKey() + ": "+ me.getValue());
		}
		
		
		//Hash map with null keys and null values
		HashMap<String, String> hm1=new HashMap<String,String>();
		hm1.put("Thanuja","thanuja123@gmail.com");
		hm1.put("Deepthi",null);
		hm1.put(null,"abc");
		hm1.put("Harishtha",null);
		hm1.put(null,null);
		hm1.put("Ramu","ramu123@gmail.com");
		hm1.put("Ramu","ramu@gmail.com");
		System.out.println("Person Hashmap with name and emailId");
		System.out.println(hm1);
		
		
		//Hashmap with Integer key and User defined Object as a Value
		HashMap<Integer,Student> studentMap=new HashMap<Integer,Student>();
		studentMap.put(10001,new Student(1,"Thanuja",78));
		studentMap.put(10005,new Student(2,"Abhi",84));
		studentMap.put(10006,new Student(3,"Mani",81));
		studentMap.put(10003,new Student(5,"Gowri",72));
		studentMap.put(10004,new Student(4,"Bhavya",78));
		System.out.println("Student Details are "+studentMap);
		
	}
	
}
