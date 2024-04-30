package com.section3;
import com.javamaster.mypackage.*;

public class Ex1004 {
	public static void main(String[] args) {
		Cat cat1 = new cat();
		Cat cat2 = new cat();
		
		System.out.prinln(cat1.toString());
		System.out.prinln(cat2.toString());
		System.out.prinln(cat1.equals(cat2));

		cat1 = cat2;
		System.out.prinln(cat1.equals(cat2));

		System.out.prinln(cat1.toString());
		System.out.prinln(cat2.toString());
		
		String str1 = cat1.scratch();
		String str2 = cat2.meow();
		String str3 = cat2.scratch();

		System.out.prinln(str1.equals(str2));
		System.out.prinln(str1.equals(str3));

	}
}
