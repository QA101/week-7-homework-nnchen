package greetingsUtil;

import static org.junit.Assert.*;
import org.junit.*;

public class GreetingsUtilTest {
	static GreetingsUtil gu;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		driver.findElement(By.id("place_holder")).click();
			System.out.println("Greetings!");
	}


	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.findElement(By.id("place_holder")).click();
			System.out.println("How are you?");
	
	}


	@Before
	public void setUp() throws Exception {
		driver.findElment(By.id("place_holder)).click();
	}
	

	@After
	public void tearDown() throws Exception {
		driver.findElement(By.id("place_holder)).click();
			System.out.println("Good, thanks!");
	}

	@Test
	public void test() {
		fail("your tests here");
	}

}
