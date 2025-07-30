package day16;


class animal{
	void display()
	{
		System.out.println("my name is error");
	}
	void sound()
	{
		System.out.println("I am invisible ");
	}
}



class dog extends animal{
	void display()
	{
		System.out.println("my name is human");
	}
	void age()
	{
		System.out.println("my age is 1 year");
	}
}

class cat extends dog{
	void display()
	{
		System.out.println("my name is animal");
	}
}


public class InheritanceEx {
	public static void main(String[] args) {
		
		cat c=new cat();
		c.display();
		c.sound();
		c.age();
		
	}

}
