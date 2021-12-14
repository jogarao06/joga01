package com.VtigerGenric;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderss {
	
	@Test(dataProvider = "getDest")
	public void sampledemoDataProvider(String scr, String dest) {
		System.out.println(scr + " " + dest);
	}
	@DataProvider()
	public Object[][] getDest() {
		Object arr[][] = new Object[5][2];

		arr[0][0] = "Qjsp";
		arr[0][1] = "Pajaguta";

		arr[1][0] = "Qspider";
		arr[1][1] = "KPHB";

		arr[2][0] = "Jspider";
		arr[2][1] = "Jntu";

		arr[3][0] = "pyspider";
		arr[3][1] = "Noida";
		
		arr[4][0] = "qpyspider";
		arr[4][1] = "Hyderabad";

		return arr;

	}

}
