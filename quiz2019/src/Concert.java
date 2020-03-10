import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Concert {

    String city;
    String country;
    String date;
    List<Act> acts;

    public Concert(String city, String country, String date){
        this.city = city;
        this.country = country;
        this.date = date;
        this.acts = new ArrayList<>();
    }

    public void addAct(Act act){
        acts.add(act);
    }

    public List<Act> getActs(){
        return acts;
    }

    public String getCity(){
        return city;
    }

    public String getCountry(){
        return country;
    }

    public String getDate(){
        return date;
    }

    public boolean isValid(Ticket ticket){
        if(ticket.getConcert().equals(this)){
            return true;
        }
        return false;
    }

    public boolean participates(Artist a){
        for(Act act :acts){
            if()
        }
    }

    @Override
    public boolean equals(Object o) {
        if(this== o) return true;
        if(o == null) return false;
        if(getClass() != o.getClass()) return false;

        Concert c = (Concert) o;
        return (country == c.getCountry()) && (city == c.getCity()) && (date == c.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(city,country,date);
    }
}
