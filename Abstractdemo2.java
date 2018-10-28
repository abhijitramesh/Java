package com.learningJava.Demo;
class Printer{
	public void show(Number i) {
		System.out.println(i);
	}

}

public class Abstractdemo2 {

	public static void main(String[] args) {
		Printer obj = new Printer();
		obj.show(5.3);
		

	}

}
