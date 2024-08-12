package TemperatureConverter;

public class Conversion {
	public static void main(String[] args) {
		TempConverter temp=(double a)->{
			System.out.println("Celsius to Fahrenheit: "+ (a*9/5+32));
			System.out.println("Fahrenheit to Celsius : "+ ((a-32)*(5/9)));
		};
		temp.calculate(95);
		// TODO Auto-generated method stub

	}

}
