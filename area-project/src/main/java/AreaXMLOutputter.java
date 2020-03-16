public class AreaXMLOutputter {

    private SumProvider ag;

    public AreaXMLOutputter(SumProvider ag){
        this.ag = ag;
    }

    public String output(){
        return "<area>" + ag.sum() + "</area>";
    }
}
