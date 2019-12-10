package Single_problem4;

public class PrinterManager {
	private static PrinterManager printerManager = new PrinterManager();
	private Printer[] printer = new Printer[3];
	private PrinterManager() {
		for(int i = 0; i < 3; i++)
			printer[i] = new Printer();
	}
	
	public synchronized static PrinterManager getPrinterManager() {
		return printerManager;
	}
	
	public synchronized Printer getPrinter() {	
		while(true) {
			for(int i = 0; i < 3; i++) {
				if(printer[i].isAvailable()) { // �ش� �����͸� �̿��� �� ������ ��ȯ.
					printer[i].setAvailable(false); // �̹� ���� ���� �ֱ� ������ false�� set.
					return printer[i];
				}		
			}
		}
	}
}
