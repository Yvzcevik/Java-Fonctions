//We are controlling 5-digit numbers if they are palindrome or not

import java.util.Scanner;

public class deneme3 {

	public static void main(String args[]) {

		Scanner data = new Scanner(System.in);

		System.out.print("Please Enter 5-Digit Number: ");

		int number = data.nextInt();

		if ((number%10 + ((number%100)-(number%10))+((number%1000)-(number%100)-(number%10))+((number%10000)-(number%1000)-(number%100)-(number%10))+
			((number%100000)-(number%10000)-(number%1000)-(number%100)-(number%10))) == number ) {

			if ((number - (number % 10000)) / 10000 == number % 10
					&& ((number % 100) - (number % 10)) / 10 == ((number % 10000) - (number % 1000)) / 1000) {

				System.out.print("Number is Palindrom");

			}

			else

				System.out.print("Number is not Palindrom ");

		}

		else {

			System.out.print("Number is not 5-digit");

		}

	}

}
