package com.tutorialsninja.qa.testcases;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age :");
		
		int x= sc.nextInt();
		int y=sc.nextInt();
		
		int z=x+y;
		System.out.println(z);
		

	}

}
