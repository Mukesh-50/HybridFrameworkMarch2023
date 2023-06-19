package com.learnautomation.sample;

public class Sample1 {

	public static void main(String[] args) {

		ThreadLocal<String> tl1 = new ThreadLocal<String>();

		tl1.set("Manjusha");

		ThreadLocal<String> tl2 = new ThreadLocal<String>();

		tl2.set("Ravi");

		ThreadLocal<String> tl3 = new ThreadLocal<String>();

		tl3.set("Jyoti");
		
		System.out.println(tl2.get());

	}

}
