public class Ellipse implements AreaShape {

    private double xradius;
    private double yradius;

    public Ellipse(double xradius, double yradius) {
        this.xradius = xradius;
        this.yradius = yradius;
    }

    public double getXradius() {
        return xradius;
    }

    public void setXradius(double xradius) {
        this.xradius = xradius;
    }

    public double getYradius() {
        return yradius;
    }

    public void setYradius(double yradius) {
        this.yradius = yradius;
    }

    public double getArea(){
        return (Math.PI * this.getXradius() * this.getYradius());
    }

    public void draw() {
        System.out.println("Ellipse");
    }
}
