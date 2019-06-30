package com.sda.exercises;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class LinearySearchTest {

    @Test
    public void search(){

        //given
        LinearySearch linearySearch = new LinearySearch();
        List<Integer> list = new ArrayList<>(Arrays.asList(3,5,4,2,0));

//        when
        int returned = linearySearch.search(list, 5);
        int expected = 1;

//        then
        Assert.assertEquals(returned, expected);
    }
}
