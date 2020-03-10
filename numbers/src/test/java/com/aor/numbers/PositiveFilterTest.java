package com.aor.numbers;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class PositiveFilterTest {

    @Test
    public void someNumbersBy3(){

        IListFilter filter = new PositiveFilter();

        assertEquals(filter.accept(-1),false);
        assertEquals(filter.accept(2),true);
        assertEquals(filter.accept(0),false);

    }
}
