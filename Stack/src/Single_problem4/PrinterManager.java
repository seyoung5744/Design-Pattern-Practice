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
				if(printer[i].isAvailable()) { // 해당 프린터를 이용할 수 있으면 반환.
					printer[i].setAvailable(false); // 이미 누가 쓰고 있기 때문에 false로 set.
					return printer[i];
				}		
			}
		}
	}
}
