package YouTubeVideos;

import org.testng.ITestContext;
import org.testng.annotations.Test;

	//Like this or these two methods needs to be part of same testng.xml file under a same "Test"
public class Class45_DataShareUsingITestContext {

	@Test
	public void test1(ITestContext con)
	{
		con.setAttribute("name", "mahender");
	}
	
	@Test
	public void test2(ITestContext con)
	{
		System.out.println("Attribute Value is - " + con.getAttribute("name"));
	}
}
