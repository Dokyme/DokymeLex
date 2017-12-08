package com.seu.cose.dokyme;

/**
 * Created by zdksc on 2017/12/7.
 */
public class Transition {
    private static int sid = 0;

    public Character tag;
    private int id;

    public Transition() {
        this.tag = '~';
        id = sid++;
    }

    public Transition(Character tag) {
        this.tag = tag;
        id = sid++;
    }

    @Override
    public String toString() {
        return tag + "";
    }
}
