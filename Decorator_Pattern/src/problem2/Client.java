package problem2;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CarComponent car = new BasicCar(10000);
		
		System.out.print("�Է� ���� (exit�Է� �� �Է� ���� �� ���) : ");
		String decorator = sc.nextLine();
		String[] name = decorator.split(" "); // �Է� ���� ������ �������� �и� �� �迭�� ����.
		
		for(String decoratorName : name) { // �迭�� ����� ���ڸ�ŭ for
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

