package skip;

import org.testng.annotations.Test;

public class Skiptest {
	@Test(enabled = false)
	void skipDemo_1() {
		System.out.println("i am in 1");
	}

	@Test(enabled = true)
	void skipDemo_2() {
		System.out.println("i am in  2");
	}

	@Test(enabled=false)
	void skipDemo_3() {
		System.out.println("  i am in 3");
	}

	@Test(enabled=false)
	void skipDemo_4() {
		System.out.println("i am in 4");
	}

}
