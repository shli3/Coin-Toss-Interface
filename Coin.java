import java.util.*;

public interface Coin
{
	/**
	 * two fields, one method
	 * rng decides which field is returned in the method
	 * method simulates coin toss
	 */
	Random gen = new Random();
	
	public final int HEADS = 1;
	public final int TAILS = 2;
			
	public static int coinToss()
	{

		int side;
		side = 1 + gen.nextInt(2);
		if(side == 1) return HEADS;
		else return TAILS;

	}

}
