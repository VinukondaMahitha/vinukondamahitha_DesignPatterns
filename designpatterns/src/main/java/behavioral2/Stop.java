package behavioral2;

public class Stop implements State {

	public String doAction(Context context){
	      String v="Player is in stop state";
	      context.setState(this);
	      return v;
	   }

	   public String toString(){
	      return "Stop State";
	   }
	}