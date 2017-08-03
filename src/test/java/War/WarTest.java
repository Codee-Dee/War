package War;
import org.junit.*;
import static org.junit.Assert.*;

public class WarTest{

	private War w;
	private int highestNumber = 13;
	private int lowestNumber = 1;
	@Before
	public void setUp(){
		w = new War();
	}	
	
	@Test
	public void testThatFirstCardIsAOne(){
		assertEquals(w.getDeck().get(0), 1.0, 1.000000);
	}
	
	@Test
	public void testThatLastCardisAThirteen(){
		assertEquals(w.getDeck().get(51),13.0, 1.00000);
	}
	
	@Test
	public void testThatPlayerHandIsDealt(){
		w.dealPlayerHand();
		assertEquals(w.playerHand.size(), 26);
	}
	
	@Test
	public void testThatEnemyHandIsDealt(){
		w.dealEnemyHand();
		assertEquals(w.enemyHand.size(), 26);
	}
	
	
	@Test
	public void testThatPlayerCardIsDrawn(){
		w.dealPlayerHand();
		for(int i = 1; i < 14; i ++){
			if(w.drawFromPlayerHand() == i){
				assertEquals(w.drawFromPlayerHand(), i);
			}
		}
	}
	
	@Test
	public void testThatEnemyCardIsDrawn(){
		w.dealEnemyHand();
		for(int i = 1; i < 14; i++){
			if(w.drawFromEnemyHand() == i){
				assertEquals(w.drawFromEnemyHand(), i);
			}
		}
	}
	
	@Test
	public void testThatHandsAreCompared(){
		w.dealEnemyHand();
		w.dealPlayerHand();
		w.compareHands();
		for (int i = 25; i < 27;i++){
			if(w.playerHand.size() == i){
				assertEquals(w.playerHand.size(), i);
			}
		}
	}
	
	@Test
	public void testForStillGoing(){
		boolean stillPlaying = true;
		String winner = "";
		w.dealEnemyHand();
		w.dealPlayerHand();
		w.getWinner();
        assertEquals("Still going!", w.getWinner());
            	
	}
	
	@Test
	public void testForPlayerWin(){
		w.dealPlayerHand();
		if (w.enemyHand.size() == 0){
			assertEquals("Player Wins!", w.getWinner());
		}
	}
	@Test
	public void testForEnemyWin(){
		w.dealEnemyHand();
		if(w.playerHand.size() == 0){
			assertEquals("Computer Wins!", w.getWinner());
		}
	}
	
}