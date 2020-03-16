public class Triangle implements AreaShape{

    private double base_size;
    private double height;

    public Triangle(double base_size, double height){
        this.base_size = base_size;
        this.height = height;
    }

    public double getBase_size() {
        return base_size;
    }

    public void setBase_size(double base_size) {
        this.base_size = base_size;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return (this.base_size * this.height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Triangulo");
    }
}
