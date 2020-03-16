public class Rectangle implements AreaShape {

    private double width;
    private double height;

    public Rectangle(double width,double height){
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return this.getHeight() * this.getWidth();
    }

    public void draw() {
        System.out.println("Rectangle");
    }
}
