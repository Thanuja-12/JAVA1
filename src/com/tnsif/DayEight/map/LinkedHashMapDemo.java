package com.tnsif.DayEight.map;

import java.util.LinkedHashMap;

public class LinkedHashMapDemp {

	public static void main(String[] args) {
		//ordered, unsorted map - allows null key and null values
		LinkedHashMap<String, Integer> lhmap = new LinkedHashMap<String, Integer>();
		lhmap.put("Thanuja", 56000);
		lhmap.put("Abhi", 76000);
		lhmap.put("Mani", 88200);
		lhmap.put("Bhavya", 45000);
		lhmap.put("Gowri", 76000);
		System.out.println("Employee Details "+lhmap);
		lhmap.put("Sudeeksha", 80000); //allows unique key, so value replaced by 80000
		System.out.println("Employee Details after adding new employee "+lhmap);
		
		lhmap.put("Karunya",null);
		System.out.println("Employee Details "+lhmap);
		
		lhmap.put(null,null);
		System.out.println("Employee Details "+lhmap);
		
	}

}
