package com.jenkin12;

import org.testng.annotations.Test;

public class Demo {
	@Test
	public void createTest()
	{
		String data = System.getProperty("browser");
		String dataurl = System.getProperty("url");
		System.out.println(data);
		System.out.println(dataurl);
	}

}
