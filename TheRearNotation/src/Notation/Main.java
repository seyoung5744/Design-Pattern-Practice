package Notation;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DecimalAndHeximal decimalAndHeximal = new DecimalAndHeximal();
		String result = "45";
		System.out.println(result);
		decimalAndHeximal.setArithmetic_result(result);
		System.out.println(decimalAndHeximal.toHeximal());
		
	}
}
