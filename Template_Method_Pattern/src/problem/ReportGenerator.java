package problem;

import java.util.ArrayList;
import java.util.List;

public abstract class ReportGenerator {
	public String generate(List<Customer> customers) {
		List<Customer> customerList = condition(customers);
		String report = getReportHeader(customerList); // 하위 클래스가 정의한 머리말 get
		
//		for(int i = 0; i < customerList.size(); i++) { // 방법 1. for(초기화; 조건; 반복)
//			Customer customer = customerList.get(i);
//			report += getReportBody(customer);
//		}
		for(Customer customer : customerList) { // 방법 2. for(변수 : 배열)
			report += getReportBody(customer);
		}
		report += getReportFooter(customerList);
		
		return report;
	}
	
	protected List<Customer> condition(List<Customer> customers){ // 조건에 충족된 고객 리스트
		List<Customer> conditions = new ArrayList<>();
		for(Customer customer:customers)
			if(requiredCondition(customer)) // 조건에 충족이 되면
				conditions.add(customer); // 리스트에 추가
		return conditions;
	}
	
	protected abstract boolean  requiredCondition(Customer customer);	// 고객 필요 조건
	protected abstract String getReportHeader(List<Customer> customers); // 출력 머리말
	protected abstract String getReportBody(Customer customers); // 출력 본문
	protected abstract String getReportFooter(List<Customer> customers); // 출력 꼬리말
}


