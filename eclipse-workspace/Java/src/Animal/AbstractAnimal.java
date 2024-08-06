package Animal;

public abstract class AbstractAnimal implements Animal {
	String name;
	int age;
	void getDetails() {
		System.out.println("Animal Details: ");
		System.out.println("Name of animal: "+name);
		System.out.println("Age of animal: "+age);
		
	}

}