import java.util.ArrayList;
import java.util.List;

public class City implements SumProvider {
    private List<House> houses;

    public City(List<House> houses){
        this.houses = houses;
    }

    public double sum(){
        double result = 0;
        for(House house: houses){
            result += house.getArea();
        }
        return result;
    }


}
