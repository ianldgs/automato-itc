package sample.Classes;

import java.util.*;

/**
 * Created by Matheus on 13/10/2016.
 */
public abstract class Automata {
	private List<State> states = new ArrayList();

	public boolean isStringRecognizable(String word){
		String symbol = word.substring(0, 1);
		State initialState = states.stream().filter(state -> state.isInitial()).findFirst().get();

		return this.isStringRecognizable(word, initialState);
	}

	private boolean isStringRecognizable(String word, State currentState){
		String symbol = word.substring(0, 1);
		State nextState = currentState.getValueTransition(symbol);

		if(nextState != null){
			return this.isStringRecognizable(word.substring(1, word.length()) ,nextState);
		}
		else{
			return currentState.isFinal();
		}
	}

	public void addState(State state) throws Exception {
		try {
			states.add(state);
		}
		catch (Exception ex){
			throw ex;
		}
	}

	public void removeState(State state) throws Exception {
		try{
			states.remove(state);
		}
		catch (Exception ex){
			throw ex;
		}
	}
}
