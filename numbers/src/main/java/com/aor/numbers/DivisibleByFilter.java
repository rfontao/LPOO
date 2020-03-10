package com.aor.numbers;

public class DivisibleByFilter implements IListFilter {

    private int divisible;

    public DivisibleByFilter(int divisible){
        this.divisible = divisible;
    }

    @Override
    public boolean accept(Integer number) {
        return (number % divisible == 0);
    }
}
