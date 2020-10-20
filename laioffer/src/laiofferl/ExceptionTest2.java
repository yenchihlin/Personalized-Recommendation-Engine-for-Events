package laiofferl;

import java.io.*;

public class ExceptionTest2 {
	static void fun() throws IllegalAccessException {
		System.out.println("Inside fum()");
		throw new IllegalAccessException("demo");
	}
	public static void main(String args[]) {
		try {
			fun();
		} catch(IllegalAccessException e) {
			System.out.println("caught in main.");
		}
	}
}
