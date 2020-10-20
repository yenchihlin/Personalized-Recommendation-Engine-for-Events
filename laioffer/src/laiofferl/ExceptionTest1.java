package laiofferl;

import java.io.*;

public class ExceptionTest1 {
	static void fun() {
		try{
			throw new NullPointerException("demo");
		} catch(NullPointerException e) {
			System.out.println("Cauahgt inside fun()");
			throw e;
		}
		
	}
	public static void main(String args[]) {
		try {
			fun();
		} catch(NullPointerException e) {
			System.out.println("Caught in main");
		}
	}
}
