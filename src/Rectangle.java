public class Rectangle extends Polygon{
    double chieu_dai;
    double chieu_rong;

    public Rectangle(double chieu_dai, double chieu_rong) {
        this.chieu_dai = chieu_dai;
        this.chieu_rong = chieu_rong;
    }

    @Override
    double getArea(double... sides) {
        return sides[0] * sides[1];
    }

    public static void main(String[] args) {
        double chieu_dai = 4, chieu_rong = 5;
        Polygon rectangle = new Rectangle(chieu_dai,chieu_rong);
        System.out.println("Chu vi : "+rectangle.getPerimeter(chieu_dai,chieu_rong));
        System.out.println("Diện tích : "+rectangle.getArea(chieu_dai,chieu_rong));
    }


}
