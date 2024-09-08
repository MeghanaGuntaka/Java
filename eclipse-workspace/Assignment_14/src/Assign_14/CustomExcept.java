package Assign_14;

class CustomException extends Exception {
	String name;
    int age;
    public CustomException(String name, int age) {
        super(name + " is not eligible for marriage as the age is " + age);
        this.name = name;
        this.age = age;
    }
}
public class CustomExcept {
    public static void checkEligibility(String name, int age) throws CustomException {
        if (age < 21) {
            throw new CustomException(name, age);
        } else {
            System.out.println(name + " is eligible for marriage.");
        }
    }
	public static void main(String[] args) {
		try {
            checkEligibility("John Doe", 19);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }

        try {
            checkEligibility("Jane Doe", 22);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
		// TODO Auto-generated method stub

	}

}
