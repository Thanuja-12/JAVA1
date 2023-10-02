package com.tnsif.DayEight1;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapDemo {

	public static void main(String[] args) {

		// Sorted Map - sort on keys
		TreeMap<String, Integer> courses = new TreeMap<String, Integer>();
		courses.put("Python", 25);
		courses.put("Java", 30);
		courses.put("Spring", 6);
		courses.put("C", 15);
		courses.put("Hibernate", 15);
		courses.put("C", 20);
		// courses.put(null,null); //RTE - null keys not allowed
		courses.put("HTML", null);

		System.out.println("Courses are : " + courses);

		// Adding user defined objects
		TreeMap<Student, String> students = new TreeMap<Student, String>();
		students.put(new Student(101, "Harsha", 67), "TY");
		students.put(new Student(102, "Shivaji", 72), "FY");
		students.put(new Student(104, "Pavithra", 71), "SY");
		students.put(new Student(103, "Anusha", 87), "BE");
		System.out.println(students);

		//Sort using Comparator object with Lambda Expression 
		Comparator<Student> comp = (s1,s2) -> (int) (s1.getPer() - s2.getPer());
		
		TreeMap<Student, String> t = new TreeMap<>(comp);
		t.put(new Student(101, "Harsha", 67), "TY");
		t.put(new Student(102, "Shivaji", 72), "FY");
		t.put(new Student(104, "Pavithra", 71), "SY");
		t.put(new Student(103, "Anusha", 87), "BE");
		System.out.println(t);
	}

}
