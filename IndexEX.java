package day14;

public class IndexEX {
	public static void main(String[] args) {
		String[]names= {"ajay","kumar","ranjith","rajesh"};
		for(int i=0;i>=names.length;i++)
		{
			if(names[i].equals("kumar"))
			{
				names[i]="ram";
			}
		}
		for(String ref:names)
		{
			System.out.println(ref);
		}
	}

}