package War;
import org.junit.*;
import static org.junit.Assert.*;


public class WarDeckTest{
	
	private WarDeck wd;
	
	@Before
	public void setUp(){
		wd = new WarDeck();
	}
	
	@Test
	public void testThatFirstCardIsAOne(){
		assertEquals(wd.getDeck().get(0), 1.0, 1.000000);
	}
	
	@Test
	public void testThatLastCardisAThirteen(){
		assertEquals(wd.getDeck().get(51),13.0, 1.00000);
	}
	
	@Test
	public void testThatPlayerHandIsDealt(){
		assertEquals(wd.getPlayerHand().size(), 26);
	}
	
	@Test
	public void testThatEnemyHandIsDealt(){
		assertEquals(wd.getEnemyHand().size(), 26);
	}
	
	
}