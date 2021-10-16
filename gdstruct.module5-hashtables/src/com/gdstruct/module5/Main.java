package com.gdstruct.module5;

import javax.sound.midi.SysexMessage;

public class Main {

    public static void main(String[] args) {

        Player ploo = new Player(134, "Plooful", 135);
        Player wardell = new Player(536, "TSM Wardell", 648);
        Player deadlyJimmy = new Player(32, "DeadlyJimmy", 34);
        Player subroza = new Player(4931, "Subroza", 604);
        Player annieDro = new Player(6919, "C9 Annie", 593);

        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put(ploo.getUserName(), ploo);
        hashtable.put(wardell.getUserName(), wardell);
        hashtable.put(deadlyJimmy.getUserName(), deadlyJimmy);
        hashtable.put(subroza.getUserName(), subroza);
        hashtable.put(annieDro.getUserName(), annieDro);

        hashtable.printHashtable();
        //System.out.println(hashtable.get("Subroza"));
        System.out.println("");
        System.out.println("Removing values");
        hashtable.remove(subroza.getUserName());
        System.out.println("");
        System.out.println("Printing end result");
        hashtable.printHashtable();

        hashtable.remove(subroza.getUserName());
    }

}
