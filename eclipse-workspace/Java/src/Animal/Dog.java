package Animal;

public class Dog implements Animal {

	@Override
	public void makeSound() {
		System.out.println("Dog Sound: Bow Bow!!!");
		// TODO Auto-generated method stub

	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Mammal";
	}

}
