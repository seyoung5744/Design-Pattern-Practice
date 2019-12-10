package problem;

import java.util.List;

public class SimpleReportGenerator extends ReportGenerator{
	// �⺻�� ��� ���� ����
	@Override
	protected boolean requiredCondition(Customer customer) { // �䱸�Ǵ� ������ �����Ƿ� All true
		return true;
	}
	
	@Override
	protected String getReportHeader(List<Customer> customers) {
		return String.format("�� �� : %,d\n", customers.size());
	}
	
	@Override
	protected String getReportBody(Customer customers) {
		return String.format("%s : %,d\n", customers.getName(), customers.getPoint());
	}
	
	@Override
	protected String getReportFooter(List<Customer> customers) {
		return "";
	}
}




