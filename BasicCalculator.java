package day4;

import java.util.Scanner;

public class BasicCalculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the choice\t\t:");
		System.out.println("1:ADD  \n2:SUBTRACT  \n3:MULTIPLICATION  \n4:DIVISION");
		int key=sc.nextInt();
		 
		switch(key){
		case 1:
		{
			System.out.println("enter the first number\t:");
			int a=sc.nextInt();
			System.out.println("enter the second number\t:");
			int b=sc.nextInt();
			System.out.println("ADDITION\t:"+(a+b));
			break;
		}
		case 2:
		{
			System.out.println("enter the first number\t:");
			int a=sc.nextInt();
			System.out.println("enter the second number\t:");
			int b=sc.nextInt();
			System.out.println("SUBTRACT\t:"+(a-b));
			break;
		}
		case 3:
		{
			System.out.println("enter the first number\t:");
			int a=sc.nextInt();
			System.out.println("enter the second number\t:");
			int b=sc.nextInt();
			System.out.println("MULTIPLY\t:"+(a*b));
			break;
		}
		case 4:
		{
			System.out.println("enter the first number\t:");
			int a=sc.nextInt();
			System.out.println("enter the second number\t:");
			int b=sc.nextInt();
			System.out.println("DIVISION\t:"+(a/b));
			break;
		}
		default:{
			System.out.println("enter crt choice\t:");
			int f=sc.nextInt();
		}
		
		}
		
	}

}
