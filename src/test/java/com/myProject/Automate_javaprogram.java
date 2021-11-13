package com.myProject;

import java.lang.reflect.Field;

public class Automate_javaprogram {
static {
		
		try {
			Field value = String.class.getDeclaredField("value");
			value.setAccessible(true);
			value.set("How are you?", value.get("I am fine, thank you!"));
			value.set("Hello",value.get("Hello! it's pleasure"));
			value.set("Saicharan",value.get("He is a good boy"));
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("How are you?");
		System.out.println("Hello");
		System.out.println("Saicharan");
		
		
	}


}
