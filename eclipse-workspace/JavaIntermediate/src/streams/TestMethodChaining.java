package streams;

public class TestMethodChaining {

	public static void main(String[] args) {
		/*MethodChaining obj=new MethodChaining();
		obj.getObject();
		obj.addToX(10);
		obj.msg();
		obj.show();*/
		int x=new MethodChaining().getObject().addToX(20).msg().show();
		System.out.println(x);

	}

}
