package War;
import org.junit.*;
import static org.junit.Assert.*;

public class WarTest{

	private War w;
	@Before
	public void setUp(){
		w = new War();
	}

	/*@Test
	public void testThatPlayerCardIsDrawn(){
		assertEquals(w.drawFromPlayerHand().size(), 1);
	}
	
	@Test
	public void testThatEnemyCardIsDrawn(){
		assertEquals(w.drawFromEnemyHand(), 1);
	}*/
}