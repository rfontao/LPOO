package com.aor.numbers;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DivisibleByFilterTest {

    @Test
    public void someNumbersBy3(){

        IListFilter filter = new DivisibleByFilter(3);

        assertEquals(filter.accept(6),true);
        assertEquals(filter.accept(15),true);
        assertEquals(filter.accept(20),false);

    }
}
