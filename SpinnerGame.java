public class SpinnerGame

{

/** Precondition: min < max

* Simulates a spin of a spinner by returning a random integer

* between min and max, inclusive.

*/


/** Precondition: min < max

* Simulates a spin of a spinner by returning a random integer

* between min and max, inclusive.

*/

public int spin(int min, int max)

{

int result = (int)(Math.floor((Math.random() * (max - min)) + min));

  return result;

}

 

/** Simulates one round of the game as described in part (b).

*/

public void playRound()

{ /* to be implemented in part (b) */ }

}
