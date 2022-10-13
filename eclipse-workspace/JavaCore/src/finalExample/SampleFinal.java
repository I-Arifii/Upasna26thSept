package finalExample;

public class SampleFinal {
	final int x=100;//declaration
	final int y;
	static final int big=555;
	
	public SampleFinal() {//in the contructor
		this.y=333;
	}
	
	public SampleFinal(int temp) {//in the contructor
		this.y=temp;
	}
	public SampleFinal(int a,int b) {//in the contructor
		b++;
		this.y=a;
	}
	

}
