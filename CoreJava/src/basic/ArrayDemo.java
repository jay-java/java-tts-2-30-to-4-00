package basic;

import java.util.Scanner;

//array ->collection similar dataytpe values into single variable
public class ArrayDemo {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		for(int index=0;index<a.length;index++) {
			System.out.println(a[index]);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size = ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int sum=0;
		for(int index=0;index<arr.length;index++) {
			System.out.print("enter elemetn at arr["+index+"] : ");
			arr[index] = sc.nextInt();
			sum = sum+arr[index];
		}
		System.out.println("sum of elements is : "+sum);
		System.out.println("enter number to search in array : ");
		int num = sc.nextInt();
		int counter=0;
		for(int index=0;index<arr.length;index++) {
			if(num == arr[index]) {
				counter++;
			}
		}
		if(counter>0) {
			System.out.println("yes "+num+" is exist "+counter+" times");
		}
		else {
			System.out.println("not exist");
		}
	}
}
