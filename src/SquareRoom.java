public class SquareRoom implements Room {

    private double length;
    private double width;

    public SquareRoom(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return this.length * this.width;
    }

}
