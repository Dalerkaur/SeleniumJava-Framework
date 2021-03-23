package Demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgGroup {

	
	@Test(groups = "sanity")
	@Parameters("Name")
	public void Test1(String myName) {
		System.out.println("This is test1 and my Name is"+ myName);
		
	}
	@Test(groups="regression")
	public void Test2() {
		System.out.println("This is test2");
		
	}
	@Test
	public void Test3() {
		System.out.println("This is test3");
		
	}
	@Test
	public void Test4() {
		System.out.println("This is test4");
		
	}
}
