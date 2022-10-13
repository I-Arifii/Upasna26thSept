package loops;

public class TestWhile {

	public static void main(String[] args) {
		int x=1;
		System.out.println("List of even numbers");
		while(x<=20)
		{
			if(x%2==0)
			{					
				System.out.println(x);
			}
			x++;
		}
		System.out.println("End of program");
	}

}
