package com.aor.numbers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.internal.matchers.Any;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ListFiltererTest {

    List<Integer> list;

    @Before
    public void setup(){
        list = new ArrayList<>();
    }

    @Test
    public void divisibleBy5(){


        IListFilter filter = Mockito.mock(DivisibleByFilter.class);
        Mockito.when(filter.accept(5)).thenReturn(true);
        Mockito.when(filter.accept(15)).thenReturn(true);


        list.add(1);
        list.add(5);
        list.add(11);
        list.add(12);
        list.add(15);

        ListFilterer filterer = new ListFilterer(list);
        List result  = filterer.filter(filter);

        List<Integer> expected = new ArrayList<>();
        expected.add(5);
        expected.add(15);

        assertEquals(expected,result);

    }

    @Test
    public void positive(){


        IListFilter filter = Mockito.mock(PositiveFilter.class);
        Mockito.when(filter.accept(1)).thenReturn(true);
        Mockito.when(filter.accept(15)).thenReturn(true);


        list.add(1);
        list.add(15);
        list.add(-11);
        list.add(-12);
        list.add(-15);

        ListFilterer filterer = new ListFilterer(list);
        List result  = filterer.filter(filter);

        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(15);

        assertEquals(expected,result);

    }

}
