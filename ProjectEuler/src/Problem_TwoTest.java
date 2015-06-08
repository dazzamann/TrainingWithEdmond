import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class Problem_TwoTest {

	@Test
	public void ProblemTwo_ShouldReturn4613732() { // Pass Test.
		
		assertEquals(Problem_Two.ProblemTwo(), 4613732); // checks that method returns correct answer.
	}

	@Test
	public void ProblemTwoFail_ShouldReturn4613732() { // Fail test.
		
		assertEquals(Problem_Two.ProblemTwo(), 4613730); // in this case; checks that method is returning a fail.
	}

}




