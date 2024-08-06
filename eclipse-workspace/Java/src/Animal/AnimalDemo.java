package Animal;

public class AnimalDemo {

	public static void main(String[] args) {
		Parrot p = new Parrot();
		Dog d = new Dog();
		p.makeSound();
		System.out.println(p.getType());
		d.makeSound();
		System.out.println(d.getType());
		
		// TODO Auto-generated method stub

	}

}
