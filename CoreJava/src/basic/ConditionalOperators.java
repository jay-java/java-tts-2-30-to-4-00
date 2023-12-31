package basic;

import java.util.Scanner;

/* 1.simple if
 * 2.if else
 * 3.nested if
 * 4.else if ladder
 * 5.switch case
 * */

//three stream
//1.in
//2.out
//3.err

//types casting 
//1.implicit ->
//2.explicit
class name {
	public void run() {
		System.out.println("hello run function");
	}
}

public class ConditionalOperators {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size : ");
		String size = sc.next();
		if(size.equals("small")) {
			System.out.println(size);
		}
		System.out.println("hello user");
		name obj = new name();
		obj.run();
		System.out.println();
		double d1 = 3;
		System.out.println(d1);
		int i1 = (int) 12.3;
		System.out.println(i1);
		

		System.out.println("enter d = ");
		double d = sc.nextDouble();
		System.out.println(d);
		System.out.println("enter i = ");
		int i = sc.nextInt();
		System.out.println(i);
		System.out.println("enter j = ");
		int j = sc.nextInt();
		System.out.println(j);
		double k = (double) i / (double) j;
		System.out.println("division of i and j = " + k);
		// simple if
		if (i > j) {
			System.out.println("yes i is greater than j");
		}

		// if else
		if (i > j) {
			System.out.println("yes i is greater than j");
		} else if (i == j) {
			System.out.println("i and j are equal");
		} else {
			System.out.println("j is greater than i");
		}

		// nested if
		System.out.println("enter age : ");
		int age = sc.nextInt();
		if (age > 18) {
			if (age < 60) {
				System.out.println("eligible");
			} else {
				System.out.println("age is greater than 18 but not less than 60");
			}
		} else {
			System.out.println("age is less than 18");
		}

		// else if ladder
		System.out.println("enter marks : ");
		int m = sc.nextInt();
		if (m < 35) {
			System.out.println("fail");
		} else if (m >= 35 && m <= 50) {
			System.out.println("D grade");
		} else if (m >= 51 && m <= 70) {
			System.out.println("C grade");
		} else if (m >= 71 && m <= 80) {
			System.out.println("B grade");
		} else if (m >= 81 && m <= 90) {
			System.out.println("A grade");
		} else if (m >= 91 && m <= 100) {
			System.out.println("A+ grade");
		} else {
			System.out.println("inavlid inputs");
		}

		// switch case
		System.out.println("1.English 2.HIndi 3.Gujarati");
		int c = sc.nextInt();
		switch (c) {
		case 1:
			System.out.println("english");
			break;
		case 2:
			System.out.println("hindi");
			break;
		case 3:
			System.out.println("gujarati");
			break;
		default:
			System.out.println("invalid input");
		}
		
	}
}
