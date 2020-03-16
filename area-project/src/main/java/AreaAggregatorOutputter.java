public class AreaAggregatorOutputter {

    private SumProvider ag;

    public AreaAggregatorOutputter(SumProvider ag){
        this.ag = ag;
    }

    public String output() {
        return "Sum of areas: " + ag.sum();
    }

}
