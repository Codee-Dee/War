package War;
import org.junit.*;
import static org.junit.Assert.*;

public class WarTest{

	private War w;
	private WarDeck wd;
	private int highestNumber = 13;
	private int lowestNumber = 1;
	@Before
	public void setUp(){
		w = new War();
		wd = new WarDeck();
	}

	@Test
	public void testThatPlayerCardIsDrawn(){
		wd.dealPlayerHand();
		for(int i = 1; i < 14; i ++){
			if(w.drawFromPlayerHand() == i){
				assertEquals(w.drawFromPlayerHand(), i);
			}
		}
	}
	
	@Test
	public void testThatEnemyCardIsDrawn(){
		wd.dealEnemyHand();
		for(int i = 1; i < 14; i++){
			if(w.drawFromEnemyHand() == 1){
				assertEquals(w.drawFromEnemyHand(), i);
			}
		}
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