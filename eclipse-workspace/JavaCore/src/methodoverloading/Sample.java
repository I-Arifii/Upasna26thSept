package methodoverloading;

public class Sample {
	//method-overloading when we have more than one 
	//methods with the same name but the differ in
	//no. of arguments
	//datatype of args
	//order of args
	public void sum(int x,int y) {}
	public void sum(float a,float b) {}
	public void sum(int x , float y) {}
	public void sum(float y, int x) {}
	public void sum(double x, double y, double z) {}
	public void sum(int x, int y, int z) {}
	

}
