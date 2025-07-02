package day7;



public class LoopEx {
public static void main(String[] args) {
	
	for (int i=50;i>=1;i--)
	{
	System.out.println("reverse order\t\t:"+i);
	}


	
	int count=0;
	for(int i=1;i<=30;i++)
	{
		if(i%3==0)
	{
			count++;
		}
	}
System.out.println("no of numbers\t\t"+count);
int sum=0;
for(int i=1;i<=100;i++)
{
	if(i%2!=0)
	{
		sum=sum+i;
	}
}
System.out.println(sum);








}
}
