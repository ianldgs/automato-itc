import java.util.Arrays;

/**
 * Created by ianldgs on 10/24/16.
 */
public class AutomatonITC extends Automaton {
    public AutomatonITC() {
        State lambda = new State("lambda");
        lambda.setInitial(true);

        State ends0 = new State("ends0");
        ends0.setFinal(true);

        lambda.addTransition("0", ends0);

        State odd1 = new State("add1");

        lambda.addTransition("1", odd1);

        State _10 = new State("_10");

        odd1.addTransition("0", _10);

        State even1 = new State("even1");
        odd1.addTransition("1", even1);
        even1.addTransition("1", odd1);
        even1.addTransition("0", ends0);

        _10.addTransition("1", even1);

        State _0s = new State("_0s");
        ends0.addTransition("0", _0s);
        ends0.addTransition("1", odd1);

        this.states = Arrays.asList(lambda, ends0, odd1, _10, even1, _0s);
    }
}
