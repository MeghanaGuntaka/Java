package LambdaDemo;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		SimpleCalculator add = (int a,int b)-> a+b;
		SimpleCalculator sub = (int a,int b)-> a-b;
		SimpleCalculator mul = (int a,int b)-> a*b;
		SimpleCalculator div = (int a, int b)->a/b;

		System.out.println("Addition: "+add.calculate(x, y));;
		System.out.println("Multiplication: "+add.calculate(10, 10));;
		System.out.println("Subtraction: "+add.calculate(10, 10));;
		System.out.println("Division: "+add.calculate(10, 10));;
		// TODO Auto-generated method stub

	}

}
