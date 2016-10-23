package sample.Classes;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Matheus on 13/10/2016.
 */
public class State {
	private boolean isInitial;
	private boolean isFinal;
	private String label;

	private Map<String, State> transitions = new HashMap<String, State>();

	public boolean isInitial() {
		return isInitial;
	}

	public void setInitial(boolean isInitial) {
		this.isInitial = isInitial;
	}

	public boolean isFinal() {
		return isFinal;
	}

	public void setFinal(boolean isFinal) {
		this.isFinal = isFinal;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public void addTransition(String symbol, State state) throws Exception {
		try{
			this.transitions.put(symbol, state);
		}
		catch (Exception ex){
			throw ex;
		}
	}

	public void removeTransition(String symbol, State state) throws Exception {
		try {
			this.transitions.remove(symbol);
		}
		catch (Exception ex){
			throw ex;
		}
	}

	public State getValueTransition(String symbol){
		return this.transitions.get(symbol);
	}

	public Set<String> getSymbolsTransitions(){
		return this.transitions.keySet();
	}
}
