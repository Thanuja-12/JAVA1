package com.tnsif.DayEight.map;

import java.util.Enumeration;

import java.util.Hashtable;

public class HashTableDemo {
	public static void main(String args[]) {

		// Hashtable with String keys and String values
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("Thanuja", "thanuja123@gmail.com");
		ht.put("Deepthi", "deepthi123@gmail.comss");
		//ht.put(null, "abc"); //RTE not allowed null Keys/values
		ht.put("Haristha", "harishtha123@gmail.com");
		//ht.put("Nayna", null);
		ht.put("Ramu", "ramu123@gmail.com");
		System.out.println("\nHashtable with name and emailId");
		System.out.println(ht);

		System.out.println("\nTraversing a Hashtable\n");
		Enumeration em = ht.keys();
		while (em.hasMoreElements()) {
			String nm = em.nextElement().toString();
			System.out.println(nm + " : " + ht.get(nm));
		}

	}
}
