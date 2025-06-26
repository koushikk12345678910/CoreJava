package day3;

public class Operators {
	public static void main(String[] args) {
		int a=12;
		int b=25;
		int c=10;
		int d=5;
		int e=50;
		int f=100;
		int g=20;
		
		
		System.out.println("Arithmetic operators:");
		System.out.println("addition\t:"+(a+b));
		System.out.println("subtraction\t:"+(a-b));
		System.out.println("Multiplication\t:"+(a*b));
		System.out.println("Division\t:"+(a/b));
		System.out.println("modulus division:"+(a%b));
		
		
		System.out.println("Relational operators:");
		System.out.println(a +" > "+b+":"+(a>b));
		System.out.println(a +" < "+b+":"+(a<b));
		System.out.println(a +" >= "+b+":"+(a>=b));
		System.out.println(a +" <= "+b+":"+(a<=b));
		System.out.println(a +" == "+b+":"+(a==b));
		System.out.println(a +" != "+b+":"+(a!=b));
		
		System.out.println("Logical operator:");
		System.out.println("("+a+" > "+c+ " AND "+b+" < "+e+")"+":"+(a>c && b<e));
		System.out.println("("+a+" < "+d+ " OR "+b+" > "+f+")"+":"+(a<d && b>f));
		
		System.out.println("Assignment operator\t:");

		System.out.println("Initial value\t:"+c);
		System.out.println("After += :"+(c+=a));
		System.out.println("After -= :"+(c-=a));
		System.out.println("After -= :"+(c*=a));
		System.out.println("After -= :"+(a/=c));
		System.out.println("After -= :"+(c%=a));
		
		
		
		
		
		
	}

}
