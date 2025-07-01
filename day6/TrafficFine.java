package day6;

import java.util.Scanner;

public class TrafficFine {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the vechicle type\t:");
		int n=sc.nextInt();
		if(n==2)
		{
			System.out.println("two wheller");
			System.out.println("enter your speed\t:");
			int a=sc.nextInt();
			System.out.println("enter the speed limit\t:");
			int b=sc.nextInt();
			int c=a-b;
			System.out.println("over speed\t:"+c);
			
			if(c>=1 && c<10)
			{
				System.out.println("fine amount\t:$500");
			}
			else if(c>=10 && c<20 )
			{
				System.out.println("fine amount\t:$1000");
			
			}
			else if(c<=20)
			{
				System.out.println("fine amount\t:$2000");
			}
			else
			{
				System.out.println("no fine. drive safely");
			}
		}
		
			else if(n==4)
			{
				System.out.println("four wheller");
				System.out.println("enter your speed\t:");
				int a=sc.nextInt();
				System.out.println("enter the speed limit\t:");
				int b=sc.nextInt();
				int c=a-b;
				System.out.println("over speed\t:"+c);
				
				if(c>=1 && c<10)
				{
					System.out.println("fine amount\t:$1000");
				}
				else if(c>=10 && c<20 )
				{
					System.out.println("fine amount\t:$2000");
				
				}
				else if(c>=20)
				{
					System.out.println("fine amount\t:$3000");
				}
				else
				{
					System.out.println("no fine. drive safely");
				}
			}
			else
			{
				System.out.println("error");
			}
		}
	}
				
			
			
	

