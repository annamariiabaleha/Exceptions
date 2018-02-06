import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the first number");
		int number1 = sc.nextInt();
		System.out.println("Enter the second number");
		int number2 = sc.nextInt();
		try {
			if(number1 < 0 && number2 < 0) {
				throw new IllegalArgumentException();
			}
			if(number1 == 0 && number2 != 0) {
				throw new ArithmeticException();
			}
			if(number1 != 0 && number2 == 0) {
				throw new ArithmeticException();
			}
			if(number1 == 0 && number2 == 0) {
				throw new IllegalAccessException();
			}
			if(number1 > 0 && number2 > 0) {
				throw new MyException();
			}
		}
		catch (IllegalArgumentException e)
		{
			System.err.println("Від'ємні числа");
		}
		catch (ArithmeticException e)
		{
			System.err.println("Одне з чисел дорівнює нулю");
		} catch (IllegalAccessException e) {
			System.err.println("Обидва числа рівні нулю");
			e.printStackTrace();
		} catch (MyException e) {
			System.err.println("Обидва числа додатні");
			e.printStackTrace();
		}
		do {
		Methods methods = new Methods();
		System.out.println("1 - додати    2 - відняти    3- помножити    4- поділити");
		switch (sc.nextInt()) {
		case 1: 
			System.out.println("Результат: " + methods.addTwoNumbers(number1, number2));
		break;
		case 2:
			System.out.println("Результат: " + methods.differenceOfTwoNumbers(number1, number2));
		break;
		case 3:
			System.out.println("Результат: " + methods.productOfTwoNumbers(number1, number2));
		break;
		case 4:
			System.out.println("Результат: " + methods.fractionOfTwoNumbers(number1, number2));
		break;
		default: System.out.println("There is not such an option. This is a primitive calculator");
		}
		} while(true);

	}

}
