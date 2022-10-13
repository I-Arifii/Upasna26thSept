package ListOfObjects;

import java.util.ArrayList;

public class TestPerson {

	public static void main(String[] args) {
		ArrayList<Person> list=new ArrayList();
		list.add(new Person("upasana",32,"Trainer"));
		list.add(new Person("Hilda",22,"Manager"));
		list.add(new Person("Kev",23,"TeamLeader"));
		list.add(new Person("Arifi",20,"Designer"));
		
		//System.out.println(list);
		Person p=new Person();
		p.getPerson(list);
	}

}
