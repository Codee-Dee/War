package War;

import java.util.*;
public class WarMain{

	public static void main (String[] args){
		War w = new War();
		w.dealEnemyHand();
		w.dealPlayerHand();
		int maxTurns = 52;
		for(int i = 0; i < maxTurns; i++){
			if (i == 1){
				System.out.println(w.drawFromPlayerHand());
				System.out.println(w.drawFromEnemyHand());
				w.compareHands();
				System.out.println("The player has "  + w.playerHand.size() + " cards remaining");
				System.out.println("The enemy has " + w.enemyHand.size() + " cards remaining");
				//System.out.println(w.getWinner());
			}
			else if (i == 2){
				System.out.println(w.drawFromPlayerHand());
				System.out.println(w.drawFromEnemyHand());
				w.compareHands();
				System.out.println("The player has "  + w.playerHand.size() + " cards remaining");
				System.out.println("The enemy has " + w.enemyHand.size() + " cards remaining");
			}
			else if (i == 3){
				System.out.println(w.drawFromPlayerHand());
				System.out.println(w.drawFromEnemyHand());
				w.compareHands();
				System.out.println("The player has "  + w.playerHand.size() + " cards remaining");
				System.out.println("The enemy has " + w.enemyHand.size() + " cards remaining");
			}
			else if (i == 4){
				System.out.println(w.drawFromPlayerHand());
				System.out.println(w.drawFromEnemyHand());
				w.compareHands();
				System.out.println("The player has "  + w.playerHand.size() + " cards remaining");
				System.out.println("The enemy has " + w.enemyHand.size() + " cards remaining");
		}
			if (i == maxTurns){
				System.out.println(w.getWinner());
			}
		}
	}
}