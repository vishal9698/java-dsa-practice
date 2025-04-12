package javadsapractice.basics;

public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (isEven(17)) {
			System.out.println("Number is Even");
		} else {
			System.out.println("Number is Odd");
		}
	}

	private static Boolean isEven(Integer number) {
		return number % 2 == 0;
	}

}
