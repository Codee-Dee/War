package War;
import org.junit.*;
import static org.junit.Assert.*;

public class WarTest{

	private War w;
	private WarDeck wd;
	@Before
	public void setUp(){
		w = new War();
		wd = new WarDeck();
	}

	/*@Test
	public void testThatPlayerCardIsDrawn(){
		assertEquals(w.drawFromPlayerHand(), 1);
	}*/
	
	@Test
	public void testThatEnemyCardIsDrawn(){
		wd.dealEnemyHand();
		assertEquals(w.drawFromEnemyHand(), 1);
	}
	
	/*@Test
	public void testThatCardIsRemovedFromHand(){
		wd.dealEnemyHand();
		wd.dealPlayerHand();
		w.drawFromPlayerHand();
		w.drawFromEnemyHand();
		w.compareHands();
		assertEquals(wd.getPlayerHand().size(), 0);
		
	}*/
	
	
}