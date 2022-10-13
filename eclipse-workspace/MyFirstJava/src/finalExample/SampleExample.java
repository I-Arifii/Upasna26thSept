package finalExample;

public class SampleExample {
	final int x=100;//decleration
	final int y;
	static final int big=555;
	
	public SampleExample() {//in the constructor
		this.y=333;
	}
	
	public SampleExample(int temp) {//in the constructor
		this.y=temp;
	}
	public SampleExample(int a,int b) {//in the constructor
		b++;
		this.y=a;
	}
	

}
