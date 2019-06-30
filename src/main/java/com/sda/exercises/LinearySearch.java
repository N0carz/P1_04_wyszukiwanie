package com.sda.exercises;

import com.sda.exercises.exceptions.NoElementException;

import java.util.List;

public class LinearySearch {

    public int search (List<Integer> list, Integer searched) throws NoElementException {
        for (int i = 0; i < list.size(); i++) {
            //if(list.get(i) == searched) { -> mniejsza liczba eperacji w maszynie wirtualnej
            if (list.get(i).equals(searched)) {
                return i;
            }
        }

        //return -1; -> jak by nie zucanie wyjatku
        throw new NoElementException("Brak elementu " + searched);
    }
}
