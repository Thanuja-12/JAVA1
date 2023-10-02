package com.tnsif.DayEight.genericsdemo;

public class SenderDemo {

	public static void main(String[] args) {
		Sender<String> stringSender =new Sender<String>();
		stringSender.setMessage("Hello! How are you?"); //Message as String 
		//stringSender.setMessage(89);
		
		
		
		  Sender<Person> personSender =new Sender<Person>();
		  personSender.setMessage(new Person("Sudeeksha","Hyderabad")); //Message as Person   Object
		  personSender.sendMessage();
		 Person p1=new Person("Indu","Chennai");
		 personSender.setMessage(p1);
		 
		stringSender.sendMessage();
	    personSender.sendMessage();
	}

}