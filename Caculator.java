package day3;
import java.util.Scanner;
public class Caculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number\t\t:");
		int a=sc.nextInt();
		System.out.println("enter the second number\t\t:");
		int b=sc.nextInt();
		int c=a+b;
		int d=a-b;
		int e=a*b;
		int f=a/b;
		int g=a%b;
		System.out.println("addition\t:"+c);
		System.out.println("subtraction\t:"+d);
		System.out.println("multiplication\t:"+e);
		System.out.println("division\t:"+f);
		System.out.println("modulus\t:"+g);
		
	}

}
