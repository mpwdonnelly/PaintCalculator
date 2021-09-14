public class CircularRoom implements Room {

    private double radius;
    public CircularRoom(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return this.radius * this.radius * 3.14159;
    }


}
