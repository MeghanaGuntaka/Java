package FlyObj;

public class Helicopter extends AbsSpace //implements Flyable
{
	public void fly_obj() {
		System.out.println("Helicopter");
	}
	public static void main(String[] args) {
		Helicopter h = new Helicopter();
		h.fly_obj();
		Airplane a = new Airplane();
		a.fly_obj();
		Spacecraft s = new Spacecraft();
		s.fly_obj();
		
	}
		// TODO Auto-generated method stub

}
