package package_1;

import org.testng.annotations.Test;

public class Groups {
	@Test (groups= {"smoke"})
	public void testcase() {
		System.out.println("Test case 1");
	}
	@Test (groups= {"regression"})
	public void testcase1() {
		System.out.println("Test case 2");
	}
	@Test (groups= {"smoke"})
	public void testcase3() {
		System.out.println("Test case 3");
	}
	@Test (groups= {"regression"})
	public void testcase4() {
		System.out.println("Test case 4");
	}


}
