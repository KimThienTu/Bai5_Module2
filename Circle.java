public class Circle {

    private double radius = 1.0;
    private String color = "red";

    public Circle(){
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
}

class TestCirCle {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0);
        System.out.println("Bán kính là: " + circle.getRadius());
        System.out.println("Chu vi là: " + circle.getArea());
    }
}
