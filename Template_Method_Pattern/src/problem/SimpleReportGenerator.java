package problem;

import java.util.List;

public class SimpleReportGenerator extends ReportGenerator{
	// 기본은 모든 고객을 선택
	@Override
	protected boolean requiredCondition(Customer customer) { // 요구되는 조건이 없으므로 All true
		return true;
	}
	
	@Override
	protected String getReportHeader(List<Customer> customers) {
		return String.format("고객 수 : %,d\n", customers.size());
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




