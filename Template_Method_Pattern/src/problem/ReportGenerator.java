package problem;

import java.util.ArrayList;
import java.util.List;

public abstract class ReportGenerator {
	public String generate(List<Customer> customers) {
		List<Customer> customerList = condition(customers);
		String report = getReportHeader(customerList); // ���� Ŭ������ ������ �Ӹ��� get
		
//		for(int i = 0; i < customerList.size(); i++) { // ��� 1. for(�ʱ�ȭ; ����; �ݺ�)
//			Customer customer = customerList.get(i);
//			report += getReportBody(customer);
//		}
		for(Customer customer : customerList) { // ��� 2. for(���� : �迭)
			report += getReportBody(customer);
		}
		report += getReportFooter(customerList);
		
		return report;
	}
	
	protected List<Customer> condition(List<Customer> customers){ // ���ǿ� ������ �� ����Ʈ
		List<Customer> conditions = new ArrayList<>();
		for(Customer customer:customers)
			if(requiredCondition(customer)) // ���ǿ� ������ �Ǹ�
				conditions.add(customer); // ����Ʈ�� �߰�
		return conditions;
	}
	
	protected abstract boolean  requiredCondition(Customer customer);	// �� �ʿ� ����
	protected abstract String getReportHeader(List<Customer> customers); // ��� �Ӹ���
	protected abstract String getReportBody(Customer customers); // ��� ����
	protected abstract String getReportFooter(List<Customer> customers); // ��� ������
}


