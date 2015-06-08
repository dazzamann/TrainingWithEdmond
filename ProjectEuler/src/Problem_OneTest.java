import static org.junit.Assert.*;
import org.junit.Test;


public class Problem_OneTest { // class

	@Test
	public void problemOne_ShouldReturn233168() { // method
		
		assertEquals(Problem_One.ProblemOne(1000,3,5), 233168); // ensures that the value returned is as expected
	}

}
