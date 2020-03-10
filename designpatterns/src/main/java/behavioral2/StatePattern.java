package behavioral2;


public class StatePattern {
	   public String get(){
	      Context context = new Context();

	      Start startState = new Start();
	      String res=startState.doAction(context);
	      String result= res+context.getState().toString();
	      return result;
	   }
	   public String Stop() {
		   Context context = new Context();
	      Stop stopState = new Stop();
	      String Res=stopState.doAction(context);
	      String result=Res+context.getState().toString();
	      return result;
	   }
	}