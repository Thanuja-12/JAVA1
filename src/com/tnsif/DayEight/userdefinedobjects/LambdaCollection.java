package com.tnsif.DayEight.userdefinedobjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaCollection {

	public static void main(String[] args) {
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		Student s1 = new Student(11, "Deepthi", 78);
		studentList.add(s1);
		s1 = new Student(21, "Thanuja", 85);
		studentList.add(s1);
		s1 = new Student(13, "Akhila", 68);
		studentList.add(s1);
		s1 = new Student(41, "Pushyami", 72);
		studentList.add(s1);
		System.out.println(studentList);

		// Collections.sort(studentList); //CTE
		System.out.println("------------------------------------------");
		System.out.println(studentList);
		System.out.println("------------------------------------------");

		Comparator<Student> comp1 = (st1, st2) -> (int) (st2.getPer() - st1.getPer());
		Collections.sort(studentList, comp1);
		System.out.println("Student details in Descending order of Per : " + studentList);

		Collections.reverse(studentList);
		System.out.println("------------------------------------------");
		System.out.println("Student details in Ascending order of Per : " + studentList);

		System.out.println("------------------------------------------");
		comp1 = (st1, st2) -> st2.getName().compareTo(st1.getName());
		Collections.sort(studentList, comp1);
		System.out.println("Student details in ascending order of Student Name : " + studentList);

	}

}