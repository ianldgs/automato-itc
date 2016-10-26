import java.util.List;

/**
 * Created by Matheus on 13/10/2016.
 */
public abstract class Automaton {
	protected List<State> states;

	public boolean recognize(String word){
		String symbol = word.substring(0, 1);
		State initialState = states.stream().filter((State state) -> state.isInitial()).findFirst().get();

		State nextState = initialState.getValueTransition(symbol);

        if (word.length() == 1) {
            return nextState.isFinal();
        } else {
            String nextWord = word.substring(1, word.length());
            return this.isStringRecognizable(nextWord, nextState);
        }
	}

	protected boolean isStringRecognizable(String word, State currentState){
        String symbol = word.substring(0, 1);
		State nextState = currentState.getValueTransition(symbol);

		if (nextState != null && word.length() == 1) {
            return nextState.isFinal();
		} else if(nextState == null) {
            return currentState.isFinal();
        } else {
            String nextWord = word.substring(1, word.length());
            return this.isStringRecognizable(nextWord, nextState);
		}
	}
}
