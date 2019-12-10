package problem2;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CarComponent car = new BasicCar(10000);
		
		System.out.print("입력 인자 (exit입력 시 입력 종료 후 출력) : ");
		String decorator = sc.nextLine();
		String[] name = decorator.split(" "); // 입력 인자 공백을 기준으로 분리 후 배열에 저장.
		
		for(String decoratorName : name) { // 배열에 저장된 인자만큼 for
			if(decoratorName.equalsIgnoreCase("AirBag"))
				car = new AirBagDecorator(car, 2000);
			if(decoratorName.equalsIgnoreCase("ESC"))
				car = new ESCDecorator(car, 500);
			if(decoratorName.equalsIgnoreCase("Navi"))
				car = new NaviDecorator(car, 70);
			if(decoratorName.equalsIgnoreCase("SCC"))
				car = new SCCDecorator(car, 9);
		}
		System.out.println(car.getPrice());
		System.out.println(car.getCarinfo());
	}
}

