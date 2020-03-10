public abstract class Act {

    String country;
    String name;

    public Act(String name, String country){
        this.country = country;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getCountry(){
        return country;
    }

}
