import java.util.ArrayList;
import java.util.List;

public class SmartStrategy implements OrderingStrategy{

    List<StringDrink> drinks;
    List<StringRecipe> recipes;
    List<StringBar> bars;

    public SmartStrategy(){
        this.drinks = new ArrayList<>();
        this.recipes = new ArrayList<>();
        this.bars = new ArrayList<>();
    }

    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        if(bar.isHappyHour()){
            bar.order(drink, recipe);
        } else {
            this.drinks.add(drink);
            this.recipes.add(recipe);
            this.bars.add(bar);
        }
    }

    public void happyHourStarted(StringBar bar) {
        int n = 0;
        for (int i = 0; i < bars.size(); ++i) {
            if (bar == bars.get(i)) {
                ++n;
                bars.get(i).order(drinks.get(i), recipes.get(i));
            }
        }
        while (n > 0) {
            --n;
            for (int i = 0; i < bars.size(); ++i) {
                if (bar == bars.get(i)) {
                    drinks.remove(i);
                    recipes.remove(i);
                    bars.remove(i);
                    break;
                }
            }
        }
    }

    public void happyHourEnded(StringBar bar) {

    }
}
