package problem;

import java.util.List;

public class ComplexReportGenerator extends ReportGenerator{
		// ������ 100�� �̻��� ����� ����
		@Override
		protected boolean requiredCondition(Customer customer) {
			return customer.getPoint() >= 100; // ������ 100�� �̻��̸� true
		}
		
		@Override
		protected String getReportHeader(List<Customer> customers) {
			return String.format("�� �� : %,d���Դϴ�.\n", customers.size());
		}
		
		@Override
		protected String getReportBody(Customer customers) {
			return String.format("%,d : %s\n", customers.getPoint(), customers.getName());
		}
		
		@Override
		protected String getReportFooter(List<Customer> customers) {
			int sum = 0;

			for(Customer customer : customers) {
				sum += customer.getPoint();
			}
			
			return String.format("���� �հ� : %d", sum);
		}
}


