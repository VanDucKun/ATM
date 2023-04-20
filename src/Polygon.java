abstract class Polygon {
    private double[] sides;

    public Polygon(double... sides){
        this.sides = sides;
    }

    public double getPerimeter(double ...sides) {
        double perimeter = 0;
        for (double side : sides) {
            perimeter += side;
        }
        return perimeter;
    }

    // Phần mở rộng: Tính diện tích hình tam giác
    abstract double getArea(double ...sides);
}
