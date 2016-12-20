import java.util.List;

import org.cups4j.CupsClient;
import org.cups4j.CupsPrinter;


public class TestCups {
	
	public static void main(String[] args) {
		
	/*	10.23.42.121 (mnh-vp-nlftp01.p)
		10.23.42.120 (mnh-vp-nlftp02.p)
		10.23.42.111 (mnh-vp-nlftp03.p)
		10.32.43.10 (mnh-ftp1.p)
		10.200.64.55 (mnh-vt-03)*/
		
		
		System.out.println(new TestCups().getPrinters("10.23.42.113", 631)); // provide url and port
	}

	private List<CupsPrinter> getPrinters(String url, int port) {
		List<CupsPrinter> printers = null;
		try {
			CupsClient cupsClient = new CupsClient(url.trim(), port); 
			if (cupsClient != null) {
				printers = cupsClient.getPrinters();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return printers;
	}
	
}
