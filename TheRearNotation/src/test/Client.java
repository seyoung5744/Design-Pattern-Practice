package test;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		translate tl = new translate();
		Scanner sc = new Scanner(System.in);
		String ar = "";
		//while(true) {
			System.out.print("수식 입력 : ");
			
			String s = sc.next();
			tl.setText(s);
			
			//System.out.println("오잉 : " + tl.isStringToNumber(s));
			System.out.println("결과 : " + tl.calculate());
			//System.out.println(Integer.toH);
		//}
	}
}
