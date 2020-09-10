package collectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainMethod {

	public static void main(String[] args) {

		
		Person person= new Person(1,"John");
		Person person2= new Person(2,"zelalem");
		Person person3= new Person(3,"Chad");
		Person person4= new Person(4,"Erdon");
		Person person5= new Person(5,"Parker");
		Person person6= new Person(6,"Heather");

		List<Person> personList = new ArrayList<>();
		personList.add(person);
		personList.add(person4);
		personList.add(person5);
		personList.add(person2);
		personList.add(person3);
		
		personList.add(person6);
		Collections.sort(personList, new Comparator<Person>() {

//			@Override
//			public int compare(Person p1, Person p2) {
//			
//				if(p1.getId()<p2.getId()) {
//					return -1;
//				}else if(p1.getId()>p2.getId()){
//					return 1;
//				}
//				
//				return 0;
//			}
			@Override
			public int compare(Person p1, Person p2) {
			
				return -p1.getName().compareTo(p2.getName());
			}


		});
		for(Person p: personList) {
			System.out.println(p);
		}
	}

}
