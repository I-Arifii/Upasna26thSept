package ArrayListPack;

import java.util.ArrayList;

public class SampleArrayList {
	public static void main(String[] args) {
		ArrayList<String> sandwiches = new ArrayList<>();
		sandwiches.add("bread sandwich");
		sandwiches.add("pop tart");
		sandwiches.add("hot dog");

		System.out.println(sandwiches);
		System.out.println(sandwiches.get(0));
		sandwiches.set(0, "ice cream taco");
		System.out.println(sandwiches);
		sandwiches.remove(0);
		System.out.println(sandwiches);

		sandwiches.size();

		sandwiches.clear();
		System.out.println(sandwiches);
		for (int i = 0; i < sandwiches.size(); i++) {
			System.out.println(sandwiches.get(i));
		}
		
	}

}
