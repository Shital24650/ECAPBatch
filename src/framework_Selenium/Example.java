package framework_Selenium;

import org.testng.annotations.Test;
public class Example {
	@Test (priority=-2)
	public void testcase() {
		System.out.println("Test case 1");
	}
	@Test (priority=1)
	public void testcase1() {
		System.out.println("Test case 2");
	}
	@Test (invocationCount=0)   //To skip the test case or (enable=false)
	public void testcase3() {
		System.out.println("Test case 3");
	}
	@Test (priority=3)
	public void testcase4() {
		System.out.println("Test case 4");
	}

}