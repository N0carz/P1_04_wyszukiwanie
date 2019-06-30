package com.sda.exercises;

import java.util.List;

public class LinearySearch {

    public int search (List<Integer> list, Integer searched) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(searched)) {
                return i;
            }
        }
        return -1;
    }
}
