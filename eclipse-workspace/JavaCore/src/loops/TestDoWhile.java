package loops;

public class TestDoWhile {
	public static void main(String[] args) {
		int x=1;
		do {
			if(x%2==0)
			{					
				System.out.println(x);
			}
			x++;
			
		}while(x<=20);
		System.out.println("End of program");
	}

}
