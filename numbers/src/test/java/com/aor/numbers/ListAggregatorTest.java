package com.aor.numbers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.internal.matchers.Any;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ListAggregatorTest {

    List<Integer> list;

    @Before
    public void setup(){
        list = new ArrayList<>();
    }


    @Test
    public void sum() {

        list.add(1);
        list.add(2);
        list.add(4);
        list.add(2);
        list.add(5);

        ListAggregator aggregator = new ListAggregator(list);

        int sum = aggregator.sum();

        assertEquals(14, sum);
    }

    @Test
    public void max() {

        list.add(1);
        list.add(2);
        list.add(4);
        list.add(2);
        list.add(5);

        ListAggregator aggregator = new ListAggregator(list);

        int max = aggregator.max();

        assertEquals(5, max);
    }

    @Test
    public void min() {

        list.add(1);
        list.add(2);
        list.add(4);
        list.add(2);
        list.add(5);

        ListAggregator aggregator = new ListAggregator(list);

        int min = aggregator.min();

        assertEquals(1, min);
    }

    @Test
    public void distinct() {

        class ListDeduplicatorStub implements IListDeduplicator{

            public List<Integer> deduplicate(IListSorter listSorter){

                List<Integer> unique = new ArrayList<>();

                unique.add(1);
                unique.add(2);
                unique.add(4);
                unique.add(5);

                return unique;
            }
        }

        list.add(1);
        list.add(2);
        list.add(4);
        list.add(2);
        list.add(5);

        ListAggregator aggregator = new ListAggregator(list);

        int distinct = aggregator.distinct(new ListDeduplicatorStub());

        assertEquals(4, distinct);
    }

    @Test
    public void max1(){

        list.add(-1);
        list.add(-5);
        list.add(-4);

        ListAggregator aggregator = new ListAggregator(list);

        int max = aggregator.max();

        assertEquals(-1,max);
    }

    @Test
    public void distinct1() {

        //Manual Stub
        class ListDeduplicatorStub implements IListDeduplicator{

            public List<Integer> deduplicate(IListSorter listSorter){

                List<Integer> unique = new ArrayList<>();

                unique.add(1);
                unique.add(2);
                unique.add(4);

                return unique;
            }
        }

        //Mockito stub
        IListDeduplicator deduplicator = Mockito.mock(IListDeduplicator.class);
        List<Integer> deduplicated = new ArrayList<>();
        deduplicated.add(1);
        deduplicated.add(2);
        deduplicated.add(4);
        Mockito.when(deduplicator.deduplicate(Mockito.any(IListSorter.class))).thenReturn(deduplicated);

        list.add(1);
        list.add(2);
        list.add(4);
        list.add(2);

        ListAggregator aggregator = new ListAggregator(list);

        int distinct = aggregator.distinct(deduplicator);

        assertEquals(3, distinct);
    }


}

