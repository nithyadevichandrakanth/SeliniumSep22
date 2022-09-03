package week1.day1;

public class Fibbinocci {
	public static void main(String[] args) {

		int firstNum = 0;
		int secondNum = 1;
		int count = 11;
		int sum = 0;
		System.out.println("0");
		System.out.println("1");
		for (int i = 0; i < count; i++) {

			sum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = sum;
			System.out.println(sum);

		}

	}

}
