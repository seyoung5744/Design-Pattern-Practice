package problem;

import java.util.List;

public class ComplexReportGenerator extends ReportGenerator{
		// 점수가 100점 이상인 사람들 선택
		@Override
		protected boolean requiredCondition(Customer customer) {
			return customer.getPoint() >= 100; // 점수가 100점 이상이면 true
		}
		
		@Override
		protected String getReportHeader(List<Customer> customers) {
			return String.format("고객 수 : %,d명입니다.\n", customers.size());
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
			
			return String.format("점수 합계 : %d", sum);
		}
}


