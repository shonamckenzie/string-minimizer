import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestStringMinimizer {

	StringMinimizer minimizer;

	@Before
	public void setup() throws Exception {
		minimizer = new StringMinimizer();
	}

	@Test
	public void testStringMinimizer() {
		assertEquals("you say yes, I $1 no $0 $1 stop and $3 $1 go $12 $12", minimizer.minimize("You say you yes, I say no you say stop and I say go go go"));
	}

}
