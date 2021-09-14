public class PaintCalculator {
    private Room room;
    private static final int PAINT_FOR_CEILING = 350;
    public PaintCalculator(Room room) {
        this.room = room;
    }
    public int getGallonsOfPaintForCeiling() {
        double gallonsNeeded = calculateArea() / PAINT_FOR_CEILING;
        return(int)Math.ceil(gallonsNeeded);
    }
    private double calculateArea() {
        return this.room.getArea();
    }
}