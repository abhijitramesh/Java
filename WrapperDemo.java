package com.learningJava.Demo;

public class WrapperDemo {

	public static void main(String[] args) {
		int i = 5;//primitive data type
		Integer ii = new Integer(i);//Boxing - Wrapper
		
		int j = ii.intValue();//unboxing - unwrapping
		
		
		Integer value = ii;//AutoBoxing
		
		
		int k = value;//autounboxing
		String str = "123";
		int n = Integer.parseInt(str);
		System.out.println(n);

	}

}
