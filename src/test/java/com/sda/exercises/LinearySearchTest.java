package com.sda.exercises;

import com.sda.exercises.exceptions.NoElementException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertThat;


public class LinearySearchTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void search(){

        //given
        LinearySearch linearySearch = new LinearySearch();
        List<Integer> list = new ArrayList<>(Arrays.asList(3,5,4,2,0));

//        when
        int returned = 0;
        try {
            returned = linearySearch.search(list, 5);
        } catch (NoElementException e) {
            System.out.println(e.toString());
        }
        int expected = 1;

//        then
        Assert.assertEquals(returned, expected);
    }

    @Test
    public void searchThrowException(){

        //given
        LinearySearch linearySearch = new LinearySearch();
        List<Integer> list = new ArrayList<>(Arrays.asList(3,4,2,0));

//        when
        try {
            linearySearch.search(list, 5);
            expectedException.expect(NoElementException.class);
        } catch (NoElementException e) {
            e.printStackTrace();
        }
    }
}
