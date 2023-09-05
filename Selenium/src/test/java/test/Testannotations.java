package test;

import org.testng.annotations.Test;

public class Testannotations {
	
		@Test(alwaysRun=true)
		public void t1()
		{
			System.out.println("one");
		}
		@Test
		public void t2()
		{
			System.out.println("two");
		}

	}



}
