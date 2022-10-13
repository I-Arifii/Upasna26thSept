package finalExample;

public class TestFinal {
	
	public static void main(String[] args) {
		SampleExample obj=new SampleExample();
		System.out.println(obj.x);
		System.out.println(obj.y);
		
		SampleExample obj1=new SampleExample(444);
		System.out.println(obj.x);
		System.out.println(obj.y);
		
		SampleExample obj2=new SampleExample(111,666);
		System.out.println(obj.x);
		System.out.println(obj.y);
		
		Country India=new Country(30);
		Country USA=new Country(40);
		Country UK=new Country(20);
		Country xx=new Country();
		System.out.println(India.tax);
		System.out.println(UK.tax);
		System.out.println(USA.tax);
		System.out.println(xx.tax);
		
}

}
