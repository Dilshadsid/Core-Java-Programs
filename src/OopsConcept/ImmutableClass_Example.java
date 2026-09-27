package OopsConcept;

import java.util.ArrayList;
import java.util.List;

final class ImmutableClass {
 
	private final int id;
	private final String name;
	private final List<String> skills;
	
	public ImmutableClass(int id,String name ,List<String>skills) {
		this.id=id;
		this.name=name;
		this.skills = new ArrayList<>(skills);
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public List<String> getSkills() {
		return new ArrayList<>(skills);
		
	}
}

class ImmutableClass_Example {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("java");
		list.add("Spring");
		list.add("hibernate");
		
		ImmutableClass immutableClass=new ImmutableClass(12,"khan", list);
		
		list.add("BGIS");
		immutableClass.getSkills().add("MoterBike");
		
		System.out.println(immutableClass.getId() 
				+" "+ immutableClass.getName());
		System.out.println(immutableClass.getSkills());
	}
}