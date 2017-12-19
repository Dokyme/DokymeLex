package com.seu.cose.dokyme;


/**
 * Created by zdksc on 2017/12/7.
 */
public class State {

    public static void resetId() {
        sid = 0;
    }

    private static int sid = 0;

    public int id;
    public String tag;
    public int precedence;

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof State)) {
            return false;
        } else {
            State another = (State) obj;
            if (id == another.id) {
                return true;
            } else {
                return false;
            }
        }
    }

    public State() {
        this("" + sid);
        sid++;
    }

    public State(String tag) {
        id = sid++;
        this.tag = tag;
        precedence = -1;
    }

    @Override
    public String toString() {
        return "" + tag;
    }
}
