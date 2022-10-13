package ArrayListPack;

import java.util.ArrayList;

public class AraryListExample {
	public static void main(String[] args) {
		int[] x=new int[5];
		ArrayList list=new ArrayList();
		list.add("Upasana");
		list.add(12.55);
		list.add(1234);
		list.add(true);
		list.add('Y');
		System.out.println(list);
		
		ArrayList<String> names=new ArrayList(4);
		//ArrayList<String> names=new ArrayList<String>();
		names.add("Upasana");
		names.add("Hilda");
		names.add("Arifi");
		names.add("Arifi");
		names.add("Hasan");
		names.add("Kev");
		names.set(2, "AddedAt2");
		names.remove(1);
		System.out.println(names);
		System.out.println(names.size());
		System.out.println(names.get(2));
		for(int i=0;i<names.size();i++)
		{
			System.out.println(names.get(i));
		}
		System.out.println(names);
		
		ArrayList<Integer> nums=new ArrayList();
		ArrayList<Character> ch=new ArrayList();
		ArrayList<Float> f=new ArrayList();
		ArrayList<Double> d=new ArrayList();
		ArrayList<Short> s=new ArrayList();
		ArrayList<Long> l=new ArrayList();
		
		ArrayList<Customer> custList=new ArrayList();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
